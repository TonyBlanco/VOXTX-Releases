package com.squareup.okhttp.internal.framed;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.ClientCookie;

/* JADX INFO: loaded from: classes4.dex */
final class Hpack {
    private static final Map<ByteString, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final Header[] STATIC_HEADER_TABLE;

    public static final class Reader {
        private int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        int nextHeaderIndex;
        private final BufferedSource source;
        private final List<Header> headerList = new ArrayList();
        Header[] dynamicTable = new Header[8];
        int headerCount = 0;
        int dynamicTableByteCount = 0;

        public Reader(int i9, Source source) {
            this.nextHeaderIndex = r0.length - 1;
            this.headerTableSizeSetting = i9;
            this.maxDynamicTableByteCount = i9;
            this.source = Okio.buffer(source);
        }

        private void adjustDynamicTableByteCount() {
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

        private void clearDynamicTable() {
            this.headerList.clear();
            Arrays.fill(this.dynamicTable, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private int dynamicTableIndex(int i9) {
            return this.nextHeaderIndex + 1 + i9;
        }

        private int evictToRecoverBytes(int i9) {
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
                    int i12 = this.dynamicTable[length].hpackSize;
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

        private ByteString getName(int i9) {
            return (isStaticHeader(i9) ? Hpack.STATIC_HEADER_TABLE[i9] : this.dynamicTable[dynamicTableIndex(i9 - Hpack.STATIC_HEADER_TABLE.length)]).name;
        }

        private void insertIntoDynamicTable(int i9, Header header) {
            this.headerList.add(header);
            int i10 = header.hpackSize;
            if (i9 != -1) {
                i10 -= this.dynamicTable[dynamicTableIndex(i9)].hpackSize;
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

        private boolean isStaticHeader(int i9) {
            return i9 >= 0 && i9 <= Hpack.STATIC_HEADER_TABLE.length - 1;
        }

        private int readByte() throws IOException {
            return this.source.readByte() & 255;
        }

        private void readIndexedHeader(int i9) throws IOException {
            if (isStaticHeader(i9)) {
                this.headerList.add(Hpack.STATIC_HEADER_TABLE[i9]);
                return;
            }
            int iDynamicTableIndex = dynamicTableIndex(i9 - Hpack.STATIC_HEADER_TABLE.length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex <= headerArr.length - 1) {
                    this.headerList.add(headerArr[iDynamicTableIndex]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i9 + 1));
        }

        private void readLiteralHeaderWithIncrementalIndexingIndexedName(int i9) throws IOException {
            insertIntoDynamicTable(-1, new Header(getName(i9), readByteString()));
        }

        private void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
            insertIntoDynamicTable(-1, new Header(Hpack.checkLowercase(readByteString()), readByteString()));
        }

        private void readLiteralHeaderWithoutIndexingIndexedName(int i9) throws IOException {
            this.headerList.add(new Header(getName(i9), readByteString()));
        }

        private void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            this.headerList.add(new Header(Hpack.checkLowercase(readByteString()), readByteString()));
        }

        public List<Header> getAndResetHeaderList() {
            ArrayList arrayList = new ArrayList(this.headerList);
            this.headerList.clear();
            return arrayList;
        }

        public void headerTableSizeSetting(int i9) {
            this.headerTableSizeSetting = i9;
            this.maxDynamicTableByteCount = i9;
            adjustDynamicTableByteCount();
        }

        public int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        public ByteString readByteString() throws IOException {
            int i9 = readByte();
            boolean z9 = (i9 & 128) == 128;
            int i10 = readInt(i9, 127);
            return z9 ? ByteString.of(Huffman.get().decode(this.source.readByteArray(i10))) : this.source.readByteString(i10);
        }

        public void readHeaders() throws IOException {
            while (!this.source.exhausted()) {
                byte b9 = this.source.readByte();
                int i9 = b9 & 255;
                if (i9 == 128) {
                    throw new IOException("index == 0");
                }
                if ((b9 & 128) == 128) {
                    readIndexedHeader(readInt(i9, 127) - 1);
                } else if (i9 == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((b9 & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(i9, Hpack.PREFIX_6_BITS) - 1);
                } else if ((b9 & 32) == 32) {
                    int i10 = readInt(i9, Hpack.PREFIX_5_BITS);
                    this.maxDynamicTableByteCount = i10;
                    if (i10 < 0 || i10 > this.headerTableSizeSetting) {
                        throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                    }
                    adjustDynamicTableByteCount();
                } else if (i9 == 16 || i9 == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(i9, 15) - 1);
                }
            }
        }

        public int readInt(int i9, int i10) throws IOException {
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
        private final Buffer out;

        public Writer(Buffer buffer) {
            this.out = buffer;
        }

        public void writeByteString(ByteString byteString) throws IOException {
            writeInt(byteString.size(), 127, 0);
            this.out.write(byteString);
        }

        public void writeHeaders(List<Header> list) throws IOException {
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                ByteString asciiLowercase = list.get(i9).name.toAsciiLowercase();
                Integer num = (Integer) Hpack.NAME_TO_FIRST_INDEX.get(asciiLowercase);
                if (num != null) {
                    writeInt(num.intValue() + 1, 15, 0);
                } else {
                    this.out.writeByte(0);
                    writeByteString(asciiLowercase);
                }
                writeByteString(list.get(i9).value);
            }
        }

        public void writeInt(int i9, int i10, int i11) throws IOException {
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
        NAME_TO_FIRST_INDEX = nameToFirstIndex();
    }

    private Hpack() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ByteString checkLowercase(ByteString byteString) throws IOException {
        int size = byteString.size();
        for (int i9 = 0; i9 < size; i9++) {
            byte b9 = byteString.getByte(i9);
            if (b9 >= 65 && b9 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + byteString.utf8());
            }
        }
        return byteString;
    }

    private static Map<ByteString, Integer> nameToFirstIndex() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(STATIC_HEADER_TABLE.length);
        int i9 = 0;
        while (true) {
            Header[] headerArr = STATIC_HEADER_TABLE;
            if (i9 >= headerArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(headerArr[i9].name)) {
                linkedHashMap.put(headerArr[i9].name, Integer.valueOf(i9));
            }
            i9++;
        }
    }
}
