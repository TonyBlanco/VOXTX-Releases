package okhttp3.internal.http2;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import l8.AbstractC2212g;
import l8.s;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class Hpack {
    public static final Hpack INSTANCE;

    @NotNull
    private static final Map<ByteString, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;

    @NotNull
    private static final Header[] STATIC_HEADER_TABLE;

    public static final class Reader {

        @NotNull
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final BufferedSource source;

        public Reader(@NotNull Source source, int i9) {
            this(source, i9, 0, 4, null);
        }

        public Reader(@NotNull Source source, int i9, int i10) {
            l.e(source, "source");
            this.headerTableSizeSetting = i9;
            this.maxDynamicTableByteCount = i10;
            this.headerList = new ArrayList();
            this.source = Okio.buffer(source);
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        public /* synthetic */ Reader(Source source, int i9, int i10, int i11, g gVar) {
            this(source, i9, (i11 & 4) != 0 ? i9 : i10);
        }

        private final void adjustDynamicTableByteCount() {
            int i9 = this.maxDynamicTableByteCount;
            int i10 = this.dynamicTableByteCount;
            if (i9 < i10) {
                if (i9 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i10 - i9);
                }
            }
        }

        private final void clearDynamicTable() {
            AbstractC2212g.l(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int dynamicTableIndex(int i9) {
            return this.nextHeaderIndex + 1 + i9;
        }

        private final int evictToRecoverBytes(int i9) {
            int i10;
            int i11 = 0;
            if (i9 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i10 = this.nextHeaderIndex;
                    if (length < i10 || i9 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    l.b(header);
                    int i12 = header.hpackSize;
                    i9 -= i12;
                    this.dynamicTableByteCount -= i12;
                    this.headerCount--;
                    i11++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i10 + 1, headerArr, i10 + 1 + i11, this.headerCount);
                this.nextHeaderIndex += i11;
            }
            return i11;
        }

        private final ByteString getName(int i9) throws IOException {
            Header header;
            if (!isStaticHeader(i9)) {
                int iDynamicTableIndex = dynamicTableIndex(i9 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
                if (iDynamicTableIndex >= 0) {
                    Header[] headerArr = this.dynamicTable;
                    if (iDynamicTableIndex < headerArr.length) {
                        header = headerArr[iDynamicTableIndex];
                        l.b(header);
                    }
                }
                throw new IOException("Header index too large " + (i9 + 1));
            }
            header = Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i9];
            return header.name;
        }

        private final void insertIntoDynamicTable(int i9, Header header) {
            this.headerList.add(header);
            int i10 = header.hpackSize;
            if (i9 != -1) {
                Header header2 = this.dynamicTable[dynamicTableIndex(i9)];
                l.b(header2);
                i10 -= header2.hpackSize;
            }
            int i11 = this.maxDynamicTableByteCount;
            if (i10 > i11) {
                clearDynamicTable();
                return;
            }
            int iEvictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i10) - i11);
            if (i9 == -1) {
                int i12 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i12 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i13 = this.nextHeaderIndex;
                this.nextHeaderIndex = i13 - 1;
                this.dynamicTable[i13] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[i9 + dynamicTableIndex(i9) + iEvictToRecoverBytes] = header;
            }
            this.dynamicTableByteCount += i10;
        }

        private final boolean isStaticHeader(int i9) {
            return i9 >= 0 && i9 <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
        }

        private final int readByte() throws IOException {
            return Util.and(this.source.readByte(), 255);
        }

        private final void readIndexedHeader(int i9) throws IOException {
            if (isStaticHeader(i9)) {
                this.headerList.add(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i9]);
                return;
            }
            int iDynamicTableIndex = dynamicTableIndex(i9 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    List<Header> list = this.headerList;
                    Header header = headerArr[iDynamicTableIndex];
                    l.b(header);
                    list.add(header);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i9 + 1));
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int i9) throws IOException {
            insertIntoDynamicTable(-1, new Header(getName(i9), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
            insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int i9) throws IOException {
            this.headerList.add(new Header(getName(i9), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            this.headerList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        @NotNull
        public final List<Header> getAndResetHeaderList() {
            List<Header> listL = s.L(this.headerList);
            this.headerList.clear();
            return listL;
        }

        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        @NotNull
        public final ByteString readByteString() throws IOException {
            int i9 = readByte();
            boolean z9 = (i9 & 128) == 128;
            long j9 = readInt(i9, 127);
            if (!z9) {
                return this.source.readByteString(j9);
            }
            Buffer buffer = new Buffer();
            Huffman.INSTANCE.decode(this.source, j9, buffer);
            return buffer.readByteString();
        }

        public final void readHeaders() throws IOException {
            while (!this.source.exhausted()) {
                int iAnd = Util.and(this.source.readByte(), 255);
                if (iAnd == 128) {
                    throw new IOException("index == 0");
                }
                if ((iAnd & 128) == 128) {
                    readIndexedHeader(readInt(iAnd, 127) - 1);
                } else if (iAnd == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((iAnd & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(iAnd, Hpack.PREFIX_6_BITS) - 1);
                } else if ((iAnd & 32) == 32) {
                    int i9 = readInt(iAnd, Hpack.PREFIX_5_BITS);
                    this.maxDynamicTableByteCount = i9;
                    if (i9 < 0 || i9 > this.headerTableSizeSetting) {
                        throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                    }
                    adjustDynamicTableByteCount();
                } else if (iAnd == 16 || iAnd == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(iAnd, 15) - 1);
                }
            }
        }

        public final int readInt(int i9, int i10) throws IOException {
            int i11 = i9 & i10;
            if (i11 < i10) {
                return i11;
            }
            int i12 = 0;
            while (true) {
                int i13 = readByte();
                if ((i13 & 128) == 0) {
                    return i10 + (i13 << i12);
                }
                i10 += (i13 & 127) << i12;
                i12 += 7;
            }
        }
    }

    public static final class Writer {

        @NotNull
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final Buffer out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        public Writer(int i9, @NotNull Buffer buffer) {
            this(i9, false, buffer, 2, null);
        }

        public Writer(int i9, boolean z9, @NotNull Buffer out) {
            l.e(out, "out");
            this.headerTableSizeSetting = i9;
            this.useCompression = z9;
            this.out = out;
            this.smallestHeaderTableSizeSetting = a.e.API_PRIORITY_OTHER;
            this.maxDynamicTableByteCount = i9;
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        public /* synthetic */ Writer(int i9, boolean z9, Buffer buffer, int i10, g gVar) {
            this((i10 & 1) != 0 ? 4096 : i9, (i10 & 2) != 0 ? true : z9, buffer);
        }

        public Writer(@NotNull Buffer buffer) {
            this(0, false, buffer, 3, null);
        }

        private final void adjustDynamicTableByteCount() {
            int i9 = this.maxDynamicTableByteCount;
            int i10 = this.dynamicTableByteCount;
            if (i9 < i10) {
                if (i9 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i10 - i9);
                }
            }
        }

        private final void clearDynamicTable() {
            AbstractC2212g.l(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int i9) {
            int i10;
            int i11 = 0;
            if (i9 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i10 = this.nextHeaderIndex;
                    if (length < i10 || i9 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    l.b(header);
                    i9 -= header.hpackSize;
                    int i12 = this.dynamicTableByteCount;
                    Header header2 = this.dynamicTable[length];
                    l.b(header2);
                    this.dynamicTableByteCount = i12 - header2.hpackSize;
                    this.headerCount--;
                    i11++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i10 + 1, headerArr, i10 + 1 + i11, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i13 = this.nextHeaderIndex;
                Arrays.fill(headerArr2, i13 + 1, i13 + 1 + i11, (Object) null);
                this.nextHeaderIndex += i11;
            }
            return i11;
        }

        private final void insertIntoDynamicTable(Header header) {
            int i9 = header.hpackSize;
            int i10 = this.maxDynamicTableByteCount;
            if (i9 > i10) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i9) - i10);
            int i11 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i11 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i12 = this.nextHeaderIndex;
            this.nextHeaderIndex = i12 - 1;
            this.dynamicTable[i12] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i9;
        }

        public final void resizeHeaderTable(int i9) {
            this.headerTableSizeSetting = i9;
            int iMin = Math.min(i9, 16384);
            int i10 = this.maxDynamicTableByteCount;
            if (i10 == iMin) {
                return;
            }
            if (iMin < i10) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, iMin);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = iMin;
            adjustDynamicTableByteCount();
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void writeByteString(@org.jetbrains.annotations.NotNull okio.ByteString r5) throws java.io.IOException {
            /*
                r4 = this;
                java.lang.String r0 = "data"
                kotlin.jvm.internal.l.e(r5, r0)
                boolean r0 = r4.useCompression
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 == 0) goto L32
                okhttp3.internal.http2.Huffman r0 = okhttp3.internal.http2.Huffman.INSTANCE
                int r2 = r0.encodedLength(r5)
                int r3 = r5.size()
                if (r2 >= r3) goto L32
                okio.Buffer r2 = new okio.Buffer
                r2.<init>()
                r0.encode(r5, r2)
                okio.ByteString r5 = r2.readByteString()
                int r0 = r5.size()
                r2 = 128(0x80, float:1.8E-43)
            L29:
                r4.writeInt(r0, r1, r2)
                okio.Buffer r0 = r4.out
                r0.write(r5)
                goto L38
            L32:
                int r0 = r5.size()
                r2 = 0
                goto L29
            L38:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Hpack.Writer.writeByteString(okio.ByteString):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void writeHeaders(@org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r13) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Hpack.Writer.writeHeaders(java.util.List):void");
        }

        public final void writeInt(int i9, int i10, int i11) {
            int i12;
            Buffer buffer;
            if (i9 < i10) {
                buffer = this.out;
                i12 = i9 | i11;
            } else {
                this.out.writeByte(i11 | i10);
                i12 = i9 - i10;
                while (i12 >= 128) {
                    this.out.writeByte(128 | (i12 & 127));
                    i12 >>>= 7;
                }
                buffer = this.out;
            }
            buffer.writeByte(i12);
        }
    }

    static {
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        Header header = new Header(Header.TARGET_AUTHORITY, "");
        ByteString byteString = Header.TARGET_METHOD;
        Header header2 = new Header(byteString, HttpGet.METHOD_NAME);
        Header header3 = new Header(byteString, "POST");
        ByteString byteString2 = Header.TARGET_PATH;
        Header header4 = new Header(byteString2, "/");
        Header header5 = new Header(byteString2, "/index.html");
        ByteString byteString3 = Header.TARGET_SCHEME;
        Header header6 = new Header(byteString3, HttpHost.DEFAULT_SCHEME_NAME);
        Header header7 = new Header(byteString3, ClientConstants.DOMAIN_SCHEME);
        ByteString byteString4 = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[]{header, header2, header3, header4, header5, header6, header7, new Header(byteString4, "200"), new Header(byteString4, "204"), new Header(byteString4, "206"), new Header(byteString4, "304"), new Header(byteString4, "400"), new Header(byteString4, "404"), new Header(byteString4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header(TransferTable.COLUMN_ETAG, ""), new Header("expect", ""), new Header(ClientCookie.EXPIRES_ATTR, ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    private Hpack() {
    }

    private final Map<ByteString, Integer> nameToFirstIndex() {
        Header[] headerArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr2[i9].name)) {
                linkedHashMap.put(headerArr2[i9].name, Integer.valueOf(i9));
            }
        }
        Map<ByteString, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        l.d(mapUnmodifiableMap, "Collections.unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    @NotNull
    public final ByteString checkLowercase(@NotNull ByteString name) throws IOException {
        l.e(name, "name");
        int size = name.size();
        for (int i9 = 0; i9 < size; i9++) {
            byte b9 = (byte) 65;
            byte b10 = (byte) 90;
            byte b11 = name.getByte(i9);
            if (b9 <= b11 && b10 >= b11) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.utf8());
            }
        }
        return name;
    }

    @NotNull
    public final Map<ByteString, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    @NotNull
    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }
}
