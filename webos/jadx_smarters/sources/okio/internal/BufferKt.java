package okio.internal;

import com.google.android.gms.common.api.a;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.l;
import l8.AbstractC2212g;
import okhttp3.internal.connection.RealConnection;
import okio.Buffer;
import okio.ByteString;
import okio.Options;
import okio.Platform;
import okio.Segment;
import okio.SegmentPool;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Source;
import okio.Utf8;
import okio.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w8.p;

/* JADX INFO: loaded from: classes4.dex */
public final class BufferKt {

    @NotNull
    private static final byte[] HEX_DIGIT_BYTES = Platform.asUtf8ToByteArray("0123456789abcdef");
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    public static final void commonClear(@NotNull Buffer commonClear) throws EOFException {
        l.e(commonClear, "$this$commonClear");
        commonClear.skip(commonClear.size());
    }

    public static final long commonCompleteSegmentByteCount(@NotNull Buffer commonCompleteSegmentByteCount) {
        l.e(commonCompleteSegmentByteCount, "$this$commonCompleteSegmentByteCount");
        long size = commonCompleteSegmentByteCount.size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = commonCompleteSegmentByteCount.head;
        l.b(segment);
        Segment segment2 = segment.prev;
        l.b(segment2);
        int i9 = segment2.limit;
        return (i9 >= 8192 || !segment2.owner) ? size : size - ((long) (i9 - segment2.pos));
    }

    @NotNull
    public static final Buffer commonCopy(@NotNull Buffer commonCopy) {
        l.e(commonCopy, "$this$commonCopy");
        Buffer buffer = new Buffer();
        if (commonCopy.size() == 0) {
            return buffer;
        }
        Segment segment = commonCopy.head;
        l.b(segment);
        Segment segmentSharedCopy = segment.sharedCopy();
        buffer.head = segmentSharedCopy;
        segmentSharedCopy.prev = segmentSharedCopy;
        segmentSharedCopy.next = segmentSharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = segmentSharedCopy.prev;
            l.b(segment3);
            l.b(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer.setSize$okio(commonCopy.size());
        return buffer;
    }

    @NotNull
    public static final Buffer commonCopyTo(@NotNull Buffer commonCopyTo, @NotNull Buffer out, long j9, long j10) {
        l.e(commonCopyTo, "$this$commonCopyTo");
        l.e(out, "out");
        Util.checkOffsetAndCount(commonCopyTo.size(), j9, j10);
        if (j10 == 0) {
            return commonCopyTo;
        }
        out.setSize$okio(out.size() + j10);
        Segment segment = commonCopyTo.head;
        while (true) {
            l.b(segment);
            int i9 = segment.limit;
            int i10 = segment.pos;
            if (j9 < i9 - i10) {
                break;
            }
            j9 -= (long) (i9 - i10);
            segment = segment.next;
        }
        while (j10 > 0) {
            l.b(segment);
            Segment segmentSharedCopy = segment.sharedCopy();
            int i11 = segmentSharedCopy.pos + ((int) j9);
            segmentSharedCopy.pos = i11;
            segmentSharedCopy.limit = Math.min(i11 + ((int) j10), segmentSharedCopy.limit);
            Segment segment2 = out.head;
            if (segment2 == null) {
                segmentSharedCopy.prev = segmentSharedCopy;
                segmentSharedCopy.next = segmentSharedCopy;
                out.head = segmentSharedCopy;
            } else {
                l.b(segment2);
                Segment segment3 = segment2.prev;
                l.b(segment3);
                segment3.push(segmentSharedCopy);
            }
            j10 -= (long) (segmentSharedCopy.limit - segmentSharedCopy.pos);
            segment = segment.next;
            j9 = 0;
        }
        return commonCopyTo;
    }

    public static final boolean commonEquals(@NotNull Buffer commonEquals, @Nullable Object obj) {
        l.e(commonEquals, "$this$commonEquals");
        if (commonEquals == obj) {
            return true;
        }
        if (!(obj instanceof Buffer)) {
            return false;
        }
        Buffer buffer = (Buffer) obj;
        if (commonEquals.size() != buffer.size()) {
            return false;
        }
        if (commonEquals.size() == 0) {
            return true;
        }
        Segment segment = commonEquals.head;
        l.b(segment);
        Segment segment2 = buffer.head;
        l.b(segment2);
        int i9 = segment.pos;
        int i10 = segment2.pos;
        long j9 = 0;
        while (j9 < commonEquals.size()) {
            long jMin = Math.min(segment.limit - i9, segment2.limit - i10);
            long j10 = 0;
            while (j10 < jMin) {
                int i11 = i9 + 1;
                int i12 = i10 + 1;
                if (segment.data[i9] != segment2.data[i10]) {
                    return false;
                }
                j10++;
                i9 = i11;
                i10 = i12;
            }
            if (i9 == segment.limit) {
                segment = segment.next;
                l.b(segment);
                i9 = segment.pos;
            }
            if (i10 == segment2.limit) {
                segment2 = segment2.next;
                l.b(segment2);
                i10 = segment2.pos;
            }
            j9 += jMin;
        }
        return true;
    }

    public static final byte commonGet(@NotNull Buffer commonGet, long j9) {
        l.e(commonGet, "$this$commonGet");
        Util.checkOffsetAndCount(commonGet.size(), j9, 1L);
        Segment segment = commonGet.head;
        if (segment == null) {
            l.b(null);
            throw null;
        }
        if (commonGet.size() - j9 < j9) {
            long size = commonGet.size();
            while (size > j9) {
                segment = segment.prev;
                l.b(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            l.b(segment);
            return segment.data[(int) ((((long) segment.pos) + j9) - size)];
        }
        long j10 = 0;
        while (true) {
            long j11 = ((long) (segment.limit - segment.pos)) + j10;
            if (j11 > j9) {
                l.b(segment);
                return segment.data[(int) ((((long) segment.pos) + j9) - j10)];
            }
            segment = segment.next;
            l.b(segment);
            j10 = j11;
        }
    }

    public static final int commonHashCode(@NotNull Buffer commonHashCode) {
        l.e(commonHashCode, "$this$commonHashCode");
        Segment segment = commonHashCode.head;
        if (segment == null) {
            return 0;
        }
        int i9 = 1;
        do {
            int i10 = segment.limit;
            for (int i11 = segment.pos; i11 < i10; i11++) {
                i9 = (i9 * 31) + segment.data[i11];
            }
            segment = segment.next;
            l.b(segment);
        } while (segment != commonHashCode.head);
        return i9;
    }

    public static final long commonIndexOf(@NotNull Buffer commonIndexOf, byte b9, long j9, long j10) {
        Segment segment;
        int i9;
        l.e(commonIndexOf, "$this$commonIndexOf");
        long size = 0;
        if (!(0 <= j9 && j10 >= j9)) {
            throw new IllegalArgumentException(("size=" + commonIndexOf.size() + " fromIndex=" + j9 + " toIndex=" + j10).toString());
        }
        if (j10 > commonIndexOf.size()) {
            j10 = commonIndexOf.size();
        }
        if (j9 == j10 || (segment = commonIndexOf.head) == null) {
            return -1L;
        }
        if (commonIndexOf.size() - j9 < j9) {
            size = commonIndexOf.size();
            while (size > j9) {
                segment = segment.prev;
                l.b(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            while (size < j10) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + j10) - size);
                i9 = (int) ((((long) segment.pos) + j9) - size);
                while (i9 < iMin) {
                    if (bArr[i9] != b9) {
                        i9++;
                    }
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                l.b(segment);
                j9 = size;
            }
            return -1L;
        }
        while (true) {
            long j11 = ((long) (segment.limit - segment.pos)) + size;
            if (j11 > j9) {
                break;
            }
            segment = segment.next;
            l.b(segment);
            size = j11;
        }
        while (size < j10) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + j10) - size);
            i9 = (int) ((((long) segment.pos) + j9) - size);
            while (i9 < iMin2) {
                if (bArr2[i9] != b9) {
                    i9++;
                }
            }
            size += (long) (segment.limit - segment.pos);
            segment = segment.next;
            l.b(segment);
            j9 = size;
        }
        return -1L;
        return ((long) (i9 - segment.pos)) + size;
    }

    public static final long commonIndexOf(@NotNull Buffer commonIndexOf, @NotNull ByteString bytes, long j9) {
        long size;
        int i9;
        long j10 = j9;
        l.e(commonIndexOf, "$this$commonIndexOf");
        l.e(bytes, "bytes");
        if (!(bytes.size() > 0)) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j11 = 0;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
        }
        Segment segment = commonIndexOf.head;
        if (segment == null) {
            return -1L;
        }
        if (commonIndexOf.size() - j10 < j10) {
            size = commonIndexOf.size();
            while (size > j10) {
                segment = segment.prev;
                l.b(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            byte[] bArrInternalArray$okio = bytes.internalArray$okio();
            byte b9 = bArrInternalArray$okio[0];
            int size2 = bytes.size();
            long size3 = (commonIndexOf.size() - ((long) size2)) + 1;
            while (size < size3) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + size3) - size);
                i9 = (int) ((((long) segment.pos) + j10) - size);
                while (i9 < iMin) {
                    if (bArr[i9] != b9 || !rangeEquals(segment, i9 + 1, bArrInternalArray$okio, 1, size2)) {
                        i9++;
                    }
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                l.b(segment);
                j10 = size;
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (segment.limit - segment.pos)) + j11;
            if (j12 > j10) {
                break;
            }
            segment = segment.next;
            l.b(segment);
            j11 = j12;
        }
        byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
        byte b10 = bArrInternalArray$okio2[0];
        int size4 = bytes.size();
        long size5 = (commonIndexOf.size() - ((long) size4)) + 1;
        size = j11;
        while (size < size5) {
            byte[] bArr2 = segment.data;
            long j13 = size5;
            int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + size5) - size);
            i9 = (int) ((((long) segment.pos) + j10) - size);
            while (i9 < iMin2) {
                if (bArr2[i9] == b10 && rangeEquals(segment, i9 + 1, bArrInternalArray$okio2, 1, size4)) {
                }
                i9++;
            }
            size += (long) (segment.limit - segment.pos);
            segment = segment.next;
            l.b(segment);
            size5 = j13;
            j10 = size;
        }
        return -1L;
        return ((long) (i9 - segment.pos)) + size;
    }

    public static final long commonIndexOfElement(@NotNull Buffer commonIndexOfElement, @NotNull ByteString targetBytes, long j9) {
        int i9;
        l.e(commonIndexOfElement, "$this$commonIndexOfElement");
        l.e(targetBytes, "targetBytes");
        long size = 0;
        if (!(j9 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j9).toString());
        }
        Segment segment = commonIndexOfElement.head;
        if (segment == null) {
            return -1L;
        }
        if (commonIndexOfElement.size() - j9 < j9) {
            size = commonIndexOfElement.size();
            while (size > j9) {
                segment = segment.prev;
                l.b(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            if (targetBytes.size() == 2) {
                byte b9 = targetBytes.getByte(0);
                byte b10 = targetBytes.getByte(1);
                while (size < commonIndexOfElement.size()) {
                    byte[] bArr = segment.data;
                    i9 = (int) ((((long) segment.pos) + j9) - size);
                    int i10 = segment.limit;
                    while (i9 < i10) {
                        byte b11 = bArr[i9];
                        if (b11 != b9 && b11 != b10) {
                            i9++;
                        }
                    }
                    size += (long) (segment.limit - segment.pos);
                    segment = segment.next;
                    l.b(segment);
                    j9 = size;
                }
                return -1L;
            }
            byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
            while (size < commonIndexOfElement.size()) {
                byte[] bArr2 = segment.data;
                i9 = (int) ((((long) segment.pos) + j9) - size);
                int i11 = segment.limit;
                while (i9 < i11) {
                    byte b12 = bArr2[i9];
                    for (byte b13 : bArrInternalArray$okio) {
                        if (b12 != b13) {
                        }
                    }
                    i9++;
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                l.b(segment);
                j9 = size;
            }
            return -1L;
        }
        while (true) {
            long j10 = ((long) (segment.limit - segment.pos)) + size;
            if (j10 > j9) {
                break;
            }
            segment = segment.next;
            l.b(segment);
            size = j10;
        }
        if (targetBytes.size() == 2) {
            byte b14 = targetBytes.getByte(0);
            byte b15 = targetBytes.getByte(1);
            while (size < commonIndexOfElement.size()) {
                byte[] bArr3 = segment.data;
                i9 = (int) ((((long) segment.pos) + j9) - size);
                int i12 = segment.limit;
                while (i9 < i12) {
                    byte b16 = bArr3[i9];
                    if (b16 != b14 && b16 != b15) {
                        i9++;
                    }
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                l.b(segment);
                j9 = size;
            }
            return -1L;
        }
        byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
        while (size < commonIndexOfElement.size()) {
            byte[] bArr4 = segment.data;
            i9 = (int) ((((long) segment.pos) + j9) - size);
            int i13 = segment.limit;
            while (i9 < i13) {
                byte b17 = bArr4[i9];
                for (byte b18 : bArrInternalArray$okio2) {
                    if (b17 != b18) {
                    }
                }
                i9++;
            }
            size += (long) (segment.limit - segment.pos);
            segment = segment.next;
            l.b(segment);
            j9 = size;
        }
        return -1L;
        return ((long) (i9 - segment.pos)) + size;
    }

    public static final boolean commonRangeEquals(@NotNull Buffer commonRangeEquals, long j9, @NotNull ByteString bytes, int i9, int i10) {
        l.e(commonRangeEquals, "$this$commonRangeEquals");
        l.e(bytes, "bytes");
        if (j9 < 0 || i9 < 0 || i10 < 0 || commonRangeEquals.size() - j9 < i10 || bytes.size() - i9 < i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (commonRangeEquals.getByte(((long) i11) + j9) != bytes.getByte(i9 + i11)) {
                return false;
            }
        }
        return true;
    }

    public static final int commonRead(@NotNull Buffer commonRead, @NotNull byte[] sink) {
        l.e(commonRead, "$this$commonRead");
        l.e(sink, "sink");
        return commonRead.read(sink, 0, sink.length);
    }

    public static final int commonRead(@NotNull Buffer commonRead, @NotNull byte[] sink, int i9, int i10) {
        l.e(commonRead, "$this$commonRead");
        l.e(sink, "sink");
        Util.checkOffsetAndCount(sink.length, i9, i10);
        Segment segment = commonRead.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i10, segment.limit - segment.pos);
        byte[] bArr = segment.data;
        int i11 = segment.pos;
        AbstractC2212g.c(bArr, sink, i9, i11, i11 + iMin);
        segment.pos += iMin;
        commonRead.setSize$okio(commonRead.size() - ((long) iMin));
        if (segment.pos == segment.limit) {
            commonRead.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    public static final long commonRead(@NotNull Buffer commonRead, @NotNull Buffer sink, long j9) {
        l.e(commonRead, "$this$commonRead");
        l.e(sink, "sink");
        if (!(j9 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
        }
        if (commonRead.size() == 0) {
            return -1L;
        }
        if (j9 > commonRead.size()) {
            j9 = commonRead.size();
        }
        sink.write(commonRead, j9);
        return j9;
    }

    public static final long commonReadAll(@NotNull Buffer commonReadAll, @NotNull Sink sink) throws IOException {
        l.e(commonReadAll, "$this$commonReadAll");
        l.e(sink, "sink");
        long size = commonReadAll.size();
        if (size > 0) {
            sink.write(commonReadAll, size);
        }
        return size;
    }

    public static final byte commonReadByte(@NotNull Buffer commonReadByte) throws EOFException {
        l.e(commonReadByte, "$this$commonReadByte");
        if (commonReadByte.size() == 0) {
            throw new EOFException();
        }
        Segment segment = commonReadByte.head;
        l.b(segment);
        int i9 = segment.pos;
        int i10 = segment.limit;
        int i11 = i9 + 1;
        byte b9 = segment.data[i9];
        commonReadByte.setSize$okio(commonReadByte.size() - 1);
        if (i11 == i10) {
            commonReadByte.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i11;
        }
        return b9;
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull Buffer commonReadByteArray) {
        l.e(commonReadByteArray, "$this$commonReadByteArray");
        return commonReadByteArray.readByteArray(commonReadByteArray.size());
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull Buffer commonReadByteArray, long j9) throws EOFException {
        l.e(commonReadByteArray, "$this$commonReadByteArray");
        if (!(j9 >= 0 && j9 <= ((long) a.e.API_PRIORITY_OTHER))) {
            throw new IllegalArgumentException(("byteCount: " + j9).toString());
        }
        if (commonReadByteArray.size() < j9) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j9];
        commonReadByteArray.readFully(bArr);
        return bArr;
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull Buffer commonReadByteString) {
        l.e(commonReadByteString, "$this$commonReadByteString");
        return commonReadByteString.readByteString(commonReadByteString.size());
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull Buffer commonReadByteString, long j9) throws EOFException {
        l.e(commonReadByteString, "$this$commonReadByteString");
        if (!(j9 >= 0 && j9 <= ((long) a.e.API_PRIORITY_OTHER))) {
            throw new IllegalArgumentException(("byteCount: " + j9).toString());
        }
        if (commonReadByteString.size() < j9) {
            throw new EOFException();
        }
        if (j9 < 4096) {
            return new ByteString(commonReadByteString.readByteArray(j9));
        }
        ByteString byteStringSnapshot = commonReadByteString.snapshot((int) j9);
        commonReadByteString.skip(j9);
        return byteStringSnapshot;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb A[EDGE_INSN: B:48:0x00bb->B:38:0x00bb BREAK  A[LOOP:0: B:5:0x0018->B:50:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long commonReadDecimalLong(@org.jetbrains.annotations.NotNull okio.Buffer r17) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.BufferKt.commonReadDecimalLong(okio.Buffer):long");
    }

    public static final void commonReadFully(@NotNull Buffer commonReadFully, @NotNull Buffer sink, long j9) throws EOFException {
        l.e(commonReadFully, "$this$commonReadFully");
        l.e(sink, "sink");
        if (commonReadFully.size() >= j9) {
            sink.write(commonReadFully, j9);
        } else {
            sink.write(commonReadFully, commonReadFully.size());
            throw new EOFException();
        }
    }

    public static final void commonReadFully(@NotNull Buffer commonReadFully, @NotNull byte[] sink) throws EOFException {
        l.e(commonReadFully, "$this$commonReadFully");
        l.e(sink, "sink");
        int i9 = 0;
        while (i9 < sink.length) {
            int i10 = commonReadFully.read(sink, i9, sink.length - i9);
            if (i10 == -1) {
                throw new EOFException();
            }
            i9 += i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3 A[EDGE_INSN: B:43:0x00b3->B:37:0x00b3 BREAK  A[LOOP:0: B:5:0x0012->B:45:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long commonReadHexadecimalUnsignedLong(@org.jetbrains.annotations.NotNull okio.Buffer r15) throws java.io.EOFException {
        /*
            java.lang.String r0 = "$this$commonReadHexadecimalUnsignedLong"
            kotlin.jvm.internal.l.e(r15, r0)
            long r0 = r15.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lbd
            r0 = 0
            r4 = r2
            r1 = 0
        L12:
            okio.Segment r6 = r15.head
            kotlin.jvm.internal.l.b(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L1d:
            if (r8 >= r9) goto L9f
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L2e
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L2e
            int r11 = r10 - r11
            goto L48
        L2e:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L3d
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L3d
        L38:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L48
        L3d:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L80
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L80
            goto L38
        L48:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L58
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L1d
        L58:
            okio.Buffer r15 = new okio.Buffer
            r15.<init>()
            okio.Buffer r15 = r15.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r15 = r15.writeByte(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Number too large: "
            r1.append(r2)
            java.lang.String r15 = r15.readUtf8()
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        L80:
            if (r0 == 0) goto L84
            r1 = 1
            goto L9f
        L84:
            java.lang.NumberFormatException r15 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            java.lang.String r1 = okio.Util.toHexString(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L9f:
            if (r8 != r9) goto Lab
            okio.Segment r7 = r6.pop()
            r15.head = r7
            okio.SegmentPool.recycle(r6)
            goto Lad
        Lab:
            r6.pos = r8
        Lad:
            if (r1 != 0) goto Lb3
            okio.Segment r6 = r15.head
            if (r6 != 0) goto L12
        Lb3:
            long r1 = r15.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.setSize$okio(r1)
            return r4
        Lbd:
            java.io.EOFException r15 = new java.io.EOFException
            r15.<init>()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.BufferKt.commonReadHexadecimalUnsignedLong(okio.Buffer):long");
    }

    public static final int commonReadInt(@NotNull Buffer commonReadInt) throws EOFException {
        l.e(commonReadInt, "$this$commonReadInt");
        if (commonReadInt.size() < 4) {
            throw new EOFException();
        }
        Segment segment = commonReadInt.head;
        l.b(segment);
        int i9 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i9 < 4) {
            return (commonReadInt.readByte() & 255) | ((commonReadInt.readByte() & 255) << 24) | ((commonReadInt.readByte() & 255) << 16) | ((commonReadInt.readByte() & 255) << 8);
        }
        byte[] bArr = segment.data;
        int i11 = i9 + 3;
        int i12 = ((bArr[i9 + 1] & 255) << 16) | ((bArr[i9] & 255) << 24) | ((bArr[i9 + 2] & 255) << 8);
        int i13 = i9 + 4;
        int i14 = (bArr[i11] & 255) | i12;
        commonReadInt.setSize$okio(commonReadInt.size() - 4);
        if (i13 == i10) {
            commonReadInt.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i13;
        }
        return i14;
    }

    public static final long commonReadLong(@NotNull Buffer commonReadLong) throws EOFException {
        l.e(commonReadLong, "$this$commonReadLong");
        if (commonReadLong.size() < 8) {
            throw new EOFException();
        }
        Segment segment = commonReadLong.head;
        l.b(segment);
        int i9 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i9 < 8) {
            return ((((long) commonReadLong.readInt()) & 4294967295L) << 32) | (4294967295L & ((long) commonReadLong.readInt()));
        }
        byte[] bArr = segment.data;
        int i11 = i9 + 7;
        long j9 = ((((long) bArr[i9 + 3]) & 255) << 32) | ((((long) bArr[i9]) & 255) << 56) | ((((long) bArr[i9 + 1]) & 255) << 48) | ((((long) bArr[i9 + 2]) & 255) << 40) | ((((long) bArr[i9 + 4]) & 255) << 24) | ((((long) bArr[i9 + 5]) & 255) << 16) | ((((long) bArr[i9 + 6]) & 255) << 8);
        int i12 = i9 + 8;
        long j10 = j9 | (((long) bArr[i11]) & 255);
        commonReadLong.setSize$okio(commonReadLong.size() - 8);
        if (i12 == i10) {
            commonReadLong.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i12;
        }
        return j10;
    }

    public static final short commonReadShort(@NotNull Buffer commonReadShort) throws EOFException {
        l.e(commonReadShort, "$this$commonReadShort");
        if (commonReadShort.size() < 2) {
            throw new EOFException();
        }
        Segment segment = commonReadShort.head;
        l.b(segment);
        int i9 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i9 < 2) {
            return (short) ((commonReadShort.readByte() & 255) | ((commonReadShort.readByte() & 255) << 8));
        }
        byte[] bArr = segment.data;
        int i11 = i9 + 1;
        int i12 = (bArr[i9] & 255) << 8;
        int i13 = i9 + 2;
        int i14 = (bArr[i11] & 255) | i12;
        commonReadShort.setSize$okio(commonReadShort.size() - 2);
        if (i13 == i10) {
            commonReadShort.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i13;
        }
        return (short) i14;
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull Buffer commonReadUtf8, long j9) throws EOFException {
        l.e(commonReadUtf8, "$this$commonReadUtf8");
        if (!(j9 >= 0 && j9 <= ((long) a.e.API_PRIORITY_OTHER))) {
            throw new IllegalArgumentException(("byteCount: " + j9).toString());
        }
        if (commonReadUtf8.size() < j9) {
            throw new EOFException();
        }
        if (j9 == 0) {
            return "";
        }
        Segment segment = commonReadUtf8.head;
        l.b(segment);
        int i9 = segment.pos;
        if (((long) i9) + j9 > segment.limit) {
            return _Utf8Kt.commonToUtf8String$default(commonReadUtf8.readByteArray(j9), 0, 0, 3, null);
        }
        int i10 = (int) j9;
        String strCommonToUtf8String = _Utf8Kt.commonToUtf8String(segment.data, i9, i9 + i10);
        segment.pos += i10;
        commonReadUtf8.setSize$okio(commonReadUtf8.size() - j9);
        if (segment.pos == segment.limit) {
            commonReadUtf8.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return strCommonToUtf8String;
    }

    public static final int commonReadUtf8CodePoint(@NotNull Buffer commonReadUtf8CodePoint) throws EOFException {
        int i9;
        int i10;
        int i11;
        l.e(commonReadUtf8CodePoint, "$this$commonReadUtf8CodePoint");
        if (commonReadUtf8CodePoint.size() == 0) {
            throw new EOFException();
        }
        byte b9 = commonReadUtf8CodePoint.getByte(0L);
        if ((b9 & 128) == 0) {
            i9 = b9 & 127;
            i10 = 1;
            i11 = 0;
        } else if ((b9 & 224) == 192) {
            i9 = b9 & 31;
            i10 = 2;
            i11 = 128;
        } else if ((b9 & 240) == 224) {
            i9 = b9 & 15;
            i10 = 3;
            i11 = 2048;
        } else {
            if ((b9 & 248) != 240) {
                commonReadUtf8CodePoint.skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i9 = b9 & 7;
            i10 = 4;
            i11 = 65536;
        }
        long j9 = i10;
        if (commonReadUtf8CodePoint.size() < j9) {
            throw new EOFException("size < " + i10 + ": " + commonReadUtf8CodePoint.size() + " (to read code point prefixed 0x" + Util.toHexString(b9) + ')');
        }
        for (int i12 = 1; i12 < i10; i12++) {
            long j10 = i12;
            byte b10 = commonReadUtf8CodePoint.getByte(j10);
            if ((b10 & 192) != 128) {
                commonReadUtf8CodePoint.skip(j10);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i9 = (i9 << 6) | (b10 & Utf8.REPLACEMENT_BYTE);
        }
        commonReadUtf8CodePoint.skip(j9);
        return i9 > 1114111 ? Utf8.REPLACEMENT_CODE_POINT : ((55296 <= i9 && 57343 >= i9) || i9 < i11) ? Utf8.REPLACEMENT_CODE_POINT : i9;
    }

    @Nullable
    public static final String commonReadUtf8Line(@NotNull Buffer commonReadUtf8Line) {
        l.e(commonReadUtf8Line, "$this$commonReadUtf8Line");
        long jIndexOf = commonReadUtf8Line.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return readUtf8Line(commonReadUtf8Line, jIndexOf);
        }
        if (commonReadUtf8Line.size() != 0) {
            return commonReadUtf8Line.readUtf8(commonReadUtf8Line.size());
        }
        return null;
    }

    @NotNull
    public static final String commonReadUtf8LineStrict(@NotNull Buffer commonReadUtf8LineStrict, long j9) throws EOFException {
        l.e(commonReadUtf8LineStrict, "$this$commonReadUtf8LineStrict");
        if (!(j9 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j9).toString());
        }
        long j10 = j9 != Long.MAX_VALUE ? j9 + 1 : Long.MAX_VALUE;
        byte b9 = (byte) 10;
        long jIndexOf = commonReadUtf8LineStrict.indexOf(b9, 0L, j10);
        if (jIndexOf != -1) {
            return readUtf8Line(commonReadUtf8LineStrict, jIndexOf);
        }
        if (j10 < commonReadUtf8LineStrict.size() && commonReadUtf8LineStrict.getByte(j10 - 1) == ((byte) 13) && commonReadUtf8LineStrict.getByte(j10) == b9) {
            return readUtf8Line(commonReadUtf8LineStrict, j10);
        }
        Buffer buffer = new Buffer();
        commonReadUtf8LineStrict.copyTo(buffer, 0L, Math.min(32, commonReadUtf8LineStrict.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(commonReadUtf8LineStrict.size(), j9) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    public static final int commonSelect(@NotNull Buffer commonSelect, @NotNull Options options) throws EOFException {
        l.e(commonSelect, "$this$commonSelect");
        l.e(options, "options");
        int iSelectPrefix$default = selectPrefix$default(commonSelect, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        commonSelect.skip(options.getByteStrings$okio()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public static final void commonSkip(@NotNull Buffer commonSkip, long j9) throws EOFException {
        l.e(commonSkip, "$this$commonSkip");
        while (j9 > 0) {
            Segment segment = commonSkip.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j9, segment.limit - segment.pos);
            long j10 = iMin;
            commonSkip.setSize$okio(commonSkip.size() - j10);
            j9 -= j10;
            int i9 = segment.pos + iMin;
            segment.pos = i9;
            if (i9 == segment.limit) {
                commonSkip.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    @NotNull
    public static final ByteString commonSnapshot(@NotNull Buffer commonSnapshot) {
        l.e(commonSnapshot, "$this$commonSnapshot");
        if (commonSnapshot.size() <= ((long) a.e.API_PRIORITY_OTHER)) {
            return commonSnapshot.snapshot((int) commonSnapshot.size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + commonSnapshot.size()).toString());
    }

    @NotNull
    public static final ByteString commonSnapshot(@NotNull Buffer commonSnapshot, int i9) {
        l.e(commonSnapshot, "$this$commonSnapshot");
        if (i9 == 0) {
            return ByteString.EMPTY;
        }
        Util.checkOffsetAndCount(commonSnapshot.size(), 0L, i9);
        Segment segment = commonSnapshot.head;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i9) {
            l.b(segment);
            int i13 = segment.limit;
            int i14 = segment.pos;
            if (i13 == i14) {
                throw new AssertionError("s.limit == s.pos");
            }
            i11 += i13 - i14;
            i12++;
            segment = segment.next;
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[i12 * 2];
        Segment segment2 = commonSnapshot.head;
        int i15 = 0;
        while (i10 < i9) {
            l.b(segment2);
            bArr[i15] = segment2.data;
            i10 += segment2.limit - segment2.pos;
            iArr[i15] = Math.min(i10, i9);
            iArr[i15 + i12] = segment2.pos;
            segment2.shared = true;
            i15++;
            segment2 = segment2.next;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @NotNull
    public static final Segment commonWritableSegment(@NotNull Buffer commonWritableSegment, int i9) {
        l.e(commonWritableSegment, "$this$commonWritableSegment");
        if (!(i9 >= 1 && i9 <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        Segment segment = commonWritableSegment.head;
        if (segment != null) {
            l.b(segment);
            Segment segment2 = segment.prev;
            l.b(segment2);
            return (segment2.limit + i9 > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        commonWritableSegment.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    @NotNull
    public static final Buffer commonWrite(@NotNull Buffer commonWrite, @NotNull ByteString byteString, int i9, int i10) {
        l.e(commonWrite, "$this$commonWrite");
        l.e(byteString, "byteString");
        byteString.write$okio(commonWrite, i9, i10);
        return commonWrite;
    }

    @NotNull
    public static final Buffer commonWrite(@NotNull Buffer commonWrite, @NotNull Source source, long j9) throws IOException {
        l.e(commonWrite, "$this$commonWrite");
        l.e(source, "source");
        while (j9 > 0) {
            long j10 = source.read(commonWrite, j9);
            if (j10 == -1) {
                throw new EOFException();
            }
            j9 -= j10;
        }
        return commonWrite;
    }

    @NotNull
    public static final Buffer commonWrite(@NotNull Buffer commonWrite, @NotNull byte[] source) {
        l.e(commonWrite, "$this$commonWrite");
        l.e(source, "source");
        return commonWrite.write(source, 0, source.length);
    }

    @NotNull
    public static final Buffer commonWrite(@NotNull Buffer commonWrite, @NotNull byte[] source, int i9, int i10) {
        l.e(commonWrite, "$this$commonWrite");
        l.e(source, "source");
        long j9 = i10;
        Util.checkOffsetAndCount(source.length, i9, j9);
        int i11 = i10 + i9;
        while (i9 < i11) {
            Segment segmentWritableSegment$okio = commonWrite.writableSegment$okio(1);
            int iMin = Math.min(i11 - i9, 8192 - segmentWritableSegment$okio.limit);
            int i12 = i9 + iMin;
            AbstractC2212g.c(source, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, i9, i12);
            segmentWritableSegment$okio.limit += iMin;
            i9 = i12;
        }
        commonWrite.setSize$okio(commonWrite.size() + j9);
        return commonWrite;
    }

    public static final void commonWrite(@NotNull Buffer commonWrite, @NotNull Buffer source, long j9) {
        Segment segment;
        l.e(commonWrite, "$this$commonWrite");
        l.e(source, "source");
        if (!(source != commonWrite)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        Util.checkOffsetAndCount(source.size(), 0L, j9);
        while (j9 > 0) {
            Segment segment2 = source.head;
            l.b(segment2);
            int i9 = segment2.limit;
            l.b(source.head);
            if (j9 < i9 - r2.pos) {
                Segment segment3 = commonWrite.head;
                if (segment3 != null) {
                    l.b(segment3);
                    segment = segment3.prev;
                } else {
                    segment = null;
                }
                if (segment != null && segment.owner) {
                    if ((((long) segment.limit) + j9) - ((long) (segment.shared ? 0 : segment.pos)) <= Segment.SIZE) {
                        Segment segment4 = source.head;
                        l.b(segment4);
                        segment4.writeTo(segment, (int) j9);
                        source.setSize$okio(source.size() - j9);
                        commonWrite.setSize$okio(commonWrite.size() + j9);
                        return;
                    }
                }
                Segment segment5 = source.head;
                l.b(segment5);
                source.head = segment5.split((int) j9);
            }
            Segment segment6 = source.head;
            l.b(segment6);
            long j10 = segment6.limit - segment6.pos;
            source.head = segment6.pop();
            Segment segment7 = commonWrite.head;
            if (segment7 == null) {
                commonWrite.head = segment6;
                segment6.prev = segment6;
                segment6.next = segment6;
            } else {
                l.b(segment7);
                Segment segment8 = segment7.prev;
                l.b(segment8);
                segment8.push(segment6).compact();
            }
            source.setSize$okio(source.size() - j10);
            commonWrite.setSize$okio(commonWrite.size() + j10);
            j9 -= j10;
        }
    }

    public static /* synthetic */ Buffer commonWrite$default(Buffer commonWrite, ByteString byteString, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i9 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = byteString.size();
        }
        l.e(commonWrite, "$this$commonWrite");
        l.e(byteString, "byteString");
        byteString.write$okio(commonWrite, i9, i10);
        return commonWrite;
    }

    public static final long commonWriteAll(@NotNull Buffer commonWriteAll, @NotNull Source source) throws IOException {
        l.e(commonWriteAll, "$this$commonWriteAll");
        l.e(source, "source");
        long j9 = 0;
        while (true) {
            long j10 = source.read(commonWriteAll, Segment.SIZE);
            if (j10 == -1) {
                return j9;
            }
            j9 += j10;
        }
    }

    @NotNull
    public static final Buffer commonWriteByte(@NotNull Buffer commonWriteByte, int i9) {
        l.e(commonWriteByte, "$this$commonWriteByte");
        Segment segmentWritableSegment$okio = commonWriteByte.writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i10 + 1;
        bArr[i10] = (byte) i9;
        commonWriteByte.setSize$okio(commonWriteByte.size() + 1);
        return commonWriteByte;
    }

    @NotNull
    public static final Buffer commonWriteDecimalLong(@NotNull Buffer commonWriteDecimalLong, long j9) {
        boolean z9;
        l.e(commonWriteDecimalLong, "$this$commonWriteDecimalLong");
        if (j9 == 0) {
            return commonWriteDecimalLong.writeByte(48);
        }
        int i9 = 1;
        if (j9 < 0) {
            j9 = -j9;
            if (j9 < 0) {
                return commonWriteDecimalLong.writeUtf8("-9223372036854775808");
            }
            z9 = true;
        } else {
            z9 = false;
        }
        if (j9 >= 100000000) {
            i9 = j9 < 1000000000000L ? j9 < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j9 < 1000000000 ? 9 : 10 : j9 < 100000000000L ? 11 : 12 : j9 < 1000000000000000L ? j9 < 10000000000000L ? 13 : j9 < 100000000000000L ? 14 : 15 : j9 < 100000000000000000L ? j9 < 10000000000000000L ? 16 : 17 : j9 < 1000000000000000000L ? 18 : 19;
        } else if (j9 >= 10000) {
            i9 = j9 < 1000000 ? j9 < 100000 ? 5 : 6 : j9 < 10000000 ? 7 : 8;
        } else if (j9 >= 100) {
            i9 = j9 < 1000 ? 3 : 4;
        } else if (j9 >= 10) {
            i9 = 2;
        }
        if (z9) {
            i9++;
        }
        Segment segmentWritableSegment$okio = commonWriteDecimalLong.writableSegment$okio(i9);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit + i9;
        while (j9 != 0) {
            long j10 = 10;
            i10--;
            bArr[i10] = getHEX_DIGIT_BYTES()[(int) (j9 % j10)];
            j9 /= j10;
        }
        if (z9) {
            bArr[i10 - 1] = (byte) 45;
        }
        segmentWritableSegment$okio.limit += i9;
        commonWriteDecimalLong.setSize$okio(commonWriteDecimalLong.size() + ((long) i9));
        return commonWriteDecimalLong;
    }

    @NotNull
    public static final Buffer commonWriteHexadecimalUnsignedLong(@NotNull Buffer commonWriteHexadecimalUnsignedLong, long j9) {
        l.e(commonWriteHexadecimalUnsignedLong, "$this$commonWriteHexadecimalUnsignedLong");
        if (j9 == 0) {
            return commonWriteHexadecimalUnsignedLong.writeByte(48);
        }
        long j10 = (j9 >>> 1) | j9;
        long j11 = j10 | (j10 >>> 2);
        long j12 = j11 | (j11 >>> 4);
        long j13 = j12 | (j12 >>> 8);
        long j14 = j13 | (j13 >>> 16);
        long j15 = j14 | (j14 >>> 32);
        long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
        long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
        long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
        long j19 = j18 + (j18 >>> 8);
        long j20 = j19 + (j19 >>> 16);
        int i9 = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        Segment segmentWritableSegment$okio = commonWriteHexadecimalUnsignedLong.writableSegment$okio(i9);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        for (int i11 = (i10 + i9) - 1; i11 >= i10; i11--) {
            bArr[i11] = getHEX_DIGIT_BYTES()[(int) (15 & j9)];
            j9 >>>= 4;
        }
        segmentWritableSegment$okio.limit += i9;
        commonWriteHexadecimalUnsignedLong.setSize$okio(commonWriteHexadecimalUnsignedLong.size() + ((long) i9));
        return commonWriteHexadecimalUnsignedLong;
    }

    @NotNull
    public static final Buffer commonWriteInt(@NotNull Buffer commonWriteInt, int i9) {
        l.e(commonWriteInt, "$this$commonWriteInt");
        Segment segmentWritableSegment$okio = commonWriteInt.writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        bArr[i10] = (byte) ((i9 >>> 24) & 255);
        bArr[i10 + 1] = (byte) ((i9 >>> 16) & 255);
        bArr[i10 + 2] = (byte) ((i9 >>> 8) & 255);
        bArr[i10 + 3] = (byte) (i9 & 255);
        segmentWritableSegment$okio.limit = i10 + 4;
        commonWriteInt.setSize$okio(commonWriteInt.size() + 4);
        return commonWriteInt;
    }

    @NotNull
    public static final Buffer commonWriteLong(@NotNull Buffer commonWriteLong, long j9) {
        l.e(commonWriteLong, "$this$commonWriteLong");
        Segment segmentWritableSegment$okio = commonWriteLong.writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i9 = segmentWritableSegment$okio.limit;
        bArr[i9] = (byte) ((j9 >>> 56) & 255);
        bArr[i9 + 1] = (byte) ((j9 >>> 48) & 255);
        bArr[i9 + 2] = (byte) ((j9 >>> 40) & 255);
        bArr[i9 + 3] = (byte) ((j9 >>> 32) & 255);
        bArr[i9 + 4] = (byte) ((j9 >>> 24) & 255);
        bArr[i9 + 5] = (byte) ((j9 >>> 16) & 255);
        bArr[i9 + 6] = (byte) ((j9 >>> 8) & 255);
        bArr[i9 + 7] = (byte) (j9 & 255);
        segmentWritableSegment$okio.limit = i9 + 8;
        commonWriteLong.setSize$okio(commonWriteLong.size() + 8);
        return commonWriteLong;
    }

    @NotNull
    public static final Buffer commonWriteShort(@NotNull Buffer commonWriteShort, int i9) {
        l.e(commonWriteShort, "$this$commonWriteShort");
        Segment segmentWritableSegment$okio = commonWriteShort.writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        bArr[i10] = (byte) ((i9 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (i9 & 255);
        segmentWritableSegment$okio.limit = i10 + 2;
        commonWriteShort.setSize$okio(commonWriteShort.size() + 2);
        return commonWriteShort;
    }

    @NotNull
    public static final Buffer commonWriteUtf8(@NotNull Buffer commonWriteUtf8, @NotNull String string, int i9, int i10) {
        long size;
        long j9;
        l.e(commonWriteUtf8, "$this$commonWriteUtf8");
        l.e(string, "string");
        if (!(i9 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i9).toString());
        }
        if (!(i10 >= i9)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i10 + " < " + i9).toString());
        }
        if (!(i10 <= string.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i10 + " > " + string.length()).toString());
        }
        while (i9 < i10) {
            char cCharAt = string.charAt(i9);
            if (cCharAt < 128) {
                Segment segmentWritableSegment$okio = commonWriteUtf8.writableSegment$okio(1);
                byte[] bArr = segmentWritableSegment$okio.data;
                int i11 = segmentWritableSegment$okio.limit - i9;
                int iMin = Math.min(i10, 8192 - i11);
                int i12 = i9 + 1;
                bArr[i9 + i11] = (byte) cCharAt;
                while (i12 < iMin) {
                    char cCharAt2 = string.charAt(i12);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i12 + i11] = (byte) cCharAt2;
                    i12++;
                }
                int i13 = segmentWritableSegment$okio.limit;
                int i14 = (i11 + i12) - i13;
                segmentWritableSegment$okio.limit = i13 + i14;
                commonWriteUtf8.setSize$okio(commonWriteUtf8.size() + ((long) i14));
                i9 = i12;
            } else {
                if (cCharAt < 2048) {
                    Segment segmentWritableSegment$okio2 = commonWriteUtf8.writableSegment$okio(2);
                    byte[] bArr2 = segmentWritableSegment$okio2.data;
                    int i15 = segmentWritableSegment$okio2.limit;
                    bArr2[i15] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i15 + 1] = (byte) ((cCharAt & '?') | 128);
                    segmentWritableSegment$okio2.limit = i15 + 2;
                    size = commonWriteUtf8.size();
                    j9 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    Segment segmentWritableSegment$okio3 = commonWriteUtf8.writableSegment$okio(3);
                    byte[] bArr3 = segmentWritableSegment$okio3.data;
                    int i16 = segmentWritableSegment$okio3.limit;
                    bArr3[i16] = (byte) ((cCharAt >> '\f') | 224);
                    bArr3[i16 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i16 + 2] = (byte) ((cCharAt & '?') | 128);
                    segmentWritableSegment$okio3.limit = i16 + 3;
                    size = commonWriteUtf8.size();
                    j9 = 3;
                } else {
                    int i17 = i9 + 1;
                    char cCharAt3 = i17 < i10 ? string.charAt(i17) : (char) 0;
                    if (cCharAt > 56319 || 56320 > cCharAt3 || 57343 < cCharAt3) {
                        commonWriteUtf8.writeByte(63);
                        i9 = i17;
                    } else {
                        int i18 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        Segment segmentWritableSegment$okio4 = commonWriteUtf8.writableSegment$okio(4);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i19 = segmentWritableSegment$okio4.limit;
                        bArr4[i19] = (byte) ((i18 >> 18) | 240);
                        bArr4[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                        bArr4[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                        bArr4[i19 + 3] = (byte) ((i18 & 63) | 128);
                        segmentWritableSegment$okio4.limit = i19 + 4;
                        commonWriteUtf8.setSize$okio(commonWriteUtf8.size() + 4);
                        i9 += 2;
                    }
                }
                commonWriteUtf8.setSize$okio(size + j9);
                i9++;
            }
        }
        return commonWriteUtf8;
    }

    @NotNull
    public static final Buffer commonWriteUtf8CodePoint(@NotNull Buffer commonWriteUtf8CodePoint, int i9) {
        long size;
        long j9;
        l.e(commonWriteUtf8CodePoint, "$this$commonWriteUtf8CodePoint");
        if (i9 < 128) {
            commonWriteUtf8CodePoint.writeByte(i9);
        } else {
            if (i9 < 2048) {
                Segment segmentWritableSegment$okio = commonWriteUtf8CodePoint.writableSegment$okio(2);
                byte[] bArr = segmentWritableSegment$okio.data;
                int i10 = segmentWritableSegment$okio.limit;
                bArr[i10] = (byte) ((i9 >> 6) | 192);
                bArr[i10 + 1] = (byte) ((i9 & 63) | 128);
                segmentWritableSegment$okio.limit = i10 + 2;
                size = commonWriteUtf8CodePoint.size();
                j9 = 2;
            } else if (55296 <= i9 && 57343 >= i9) {
                commonWriteUtf8CodePoint.writeByte(63);
            } else if (i9 < 65536) {
                Segment segmentWritableSegment$okio2 = commonWriteUtf8CodePoint.writableSegment$okio(3);
                byte[] bArr2 = segmentWritableSegment$okio2.data;
                int i11 = segmentWritableSegment$okio2.limit;
                bArr2[i11] = (byte) ((i9 >> 12) | 224);
                bArr2[i11 + 1] = (byte) (((i9 >> 6) & 63) | 128);
                bArr2[i11 + 2] = (byte) ((i9 & 63) | 128);
                segmentWritableSegment$okio2.limit = i11 + 3;
                size = commonWriteUtf8CodePoint.size();
                j9 = 3;
            } else {
                if (i9 > 1114111) {
                    throw new IllegalArgumentException("Unexpected code point: 0x" + Util.toHexString(i9));
                }
                Segment segmentWritableSegment$okio3 = commonWriteUtf8CodePoint.writableSegment$okio(4);
                byte[] bArr3 = segmentWritableSegment$okio3.data;
                int i12 = segmentWritableSegment$okio3.limit;
                bArr3[i12] = (byte) ((i9 >> 18) | 240);
                bArr3[i12 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                bArr3[i12 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                bArr3[i12 + 3] = (byte) ((i9 & 63) | 128);
                segmentWritableSegment$okio3.limit = i12 + 4;
                size = commonWriteUtf8CodePoint.size();
                j9 = 4;
            }
            commonWriteUtf8CodePoint.setSize$okio(size + j9);
        }
        return commonWriteUtf8CodePoint;
    }

    @NotNull
    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    public static final boolean rangeEquals(@NotNull Segment segment, int i9, @NotNull byte[] bytes, int i10, int i11) {
        l.e(segment, "segment");
        l.e(bytes, "bytes");
        int i12 = segment.limit;
        byte[] bArr = segment.data;
        while (i10 < i11) {
            if (i9 == i12) {
                segment = segment.next;
                l.b(segment);
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i9 = segment.pos;
                i12 = segment.limit;
            }
            if (bArr[i9] != bytes[i10]) {
                return false;
            }
            i9++;
            i10++;
        }
        return true;
    }

    @NotNull
    public static final String readUtf8Line(@NotNull Buffer readUtf8Line, long j9) throws EOFException {
        l.e(readUtf8Line, "$this$readUtf8Line");
        if (j9 > 0) {
            long j10 = j9 - 1;
            if (readUtf8Line.getByte(j10) == ((byte) 13)) {
                String utf8 = readUtf8Line.readUtf8(j10);
                readUtf8Line.skip(2L);
                return utf8;
            }
        }
        String utf82 = readUtf8Line.readUtf8(j9);
        readUtf8Line.skip(1L);
        return utf82;
    }

    public static final <T> T seek(@NotNull Buffer seek, long j9, @NotNull p lambda) {
        l.e(seek, "$this$seek");
        l.e(lambda, "lambda");
        Segment segment = seek.head;
        if (segment == null) {
            return (T) lambda.invoke(null, -1L);
        }
        if (seek.size() - j9 < j9) {
            long size = seek.size();
            while (size > j9) {
                segment = segment.prev;
                l.b(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            return (T) lambda.invoke(segment, Long.valueOf(size));
        }
        long j10 = 0;
        while (true) {
            long j11 = ((long) (segment.limit - segment.pos)) + j10;
            if (j11 > j9) {
                return (T) lambda.invoke(segment, Long.valueOf(j10));
            }
            segment = segment.next;
            l.b(segment);
            j10 = j11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r19 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int selectPrefix(@org.jetbrains.annotations.NotNull okio.Buffer r17, @org.jetbrains.annotations.NotNull okio.Options r18, boolean r19) {
        /*
            r0 = r17
            java.lang.String r1 = "$this$selectPrefix"
            kotlin.jvm.internal.l.e(r0, r1)
            java.lang.String r1 = "options"
            r2 = r18
            kotlin.jvm.internal.l.e(r2, r1)
            okio.Segment r0 = r0.head
            r1 = -2
            r3 = -1
            if (r0 == 0) goto La9
            byte[] r4 = r0.data
            int r5 = r0.pos
            int r6 = r0.limit
            int[] r2 = r18.getTrie$okio()
            r7 = 0
            r9 = r0
            r8 = 0
            r10 = -1
        L22:
            int r11 = r8 + 1
            r12 = r2[r8]
            int r8 = r8 + 2
            r11 = r2[r11]
            if (r11 == r3) goto L2d
            r10 = r11
        L2d:
            if (r9 != 0) goto L30
            goto L5d
        L30:
            r11 = 0
            if (r12 >= 0) goto L7a
            int r12 = r12 * (-1)
            int r13 = r8 + r12
        L37:
            int r12 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r8 + 1
            r8 = r2[r8]
            if (r5 == r8) goto L44
            return r10
        L44:
            if (r14 != r13) goto L48
            r5 = 1
            goto L49
        L48:
            r5 = 0
        L49:
            if (r12 != r6) goto L6a
            kotlin.jvm.internal.l.b(r9)
            okio.Segment r4 = r9.next
            kotlin.jvm.internal.l.b(r4)
            int r6 = r4.pos
            byte[] r8 = r4.data
            int r9 = r4.limit
            if (r4 != r0) goto L64
            if (r5 != 0) goto L61
        L5d:
            if (r19 == 0) goto L60
            return r1
        L60:
            return r10
        L61:
            r4 = r8
            r8 = r11
            goto L6d
        L64:
            r16 = r8
            r8 = r4
            r4 = r16
            goto L6d
        L6a:
            r8 = r9
            r9 = r6
            r6 = r12
        L6d:
            if (r5 == 0) goto L75
            r5 = r2[r14]
            r13 = r6
            r6 = r9
            r9 = r8
            goto L9f
        L75:
            r5 = r6
            r6 = r9
            r9 = r8
            r8 = r14
            goto L37
        L7a:
            int r13 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r8 + r12
        L82:
            if (r8 != r14) goto L85
            return r10
        L85:
            r15 = r2[r8]
            if (r5 != r15) goto La6
            int r8 = r8 + r12
            r5 = r2[r8]
            if (r13 != r6) goto L9f
            okio.Segment r9 = r9.next
            kotlin.jvm.internal.l.b(r9)
            int r4 = r9.pos
            byte[] r6 = r9.data
            int r8 = r9.limit
            r13 = r4
            r4 = r6
            r6 = r8
            if (r9 != r0) goto L9f
            r9 = r11
        L9f:
            if (r5 < 0) goto La2
            return r5
        La2:
            int r8 = -r5
            r5 = r13
            goto L22
        La6:
            int r8 = r8 + 1
            goto L82
        La9:
            if (r19 == 0) goto Lac
            goto Lad
        Lac:
            r1 = -1
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.BufferKt.selectPrefix(okio.Buffer, okio.Options, boolean):int");
    }

    public static /* synthetic */ int selectPrefix$default(Buffer buffer, Options options, boolean z9, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        return selectPrefix(buffer, options, z9);
    }
}
