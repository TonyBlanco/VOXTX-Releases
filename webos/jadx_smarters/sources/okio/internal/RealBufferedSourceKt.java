package okio.internal;

import E8.a;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.l;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Options;
import okio.PeekSource;
import okio.RealBufferedSource;
import okio.Segment;
import okio.Sink;
import okio.Timeout;
import okio.Util;
import org.apache.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class RealBufferedSourceKt {
    public static final void commonClose(@NotNull RealBufferedSource commonClose) throws IOException {
        l.e(commonClose, "$this$commonClose");
        if (commonClose.closed) {
            return;
        }
        commonClose.closed = true;
        commonClose.source.close();
        commonClose.bufferField.clear();
    }

    public static final boolean commonExhausted(@NotNull RealBufferedSource commonExhausted) {
        l.e(commonExhausted, "$this$commonExhausted");
        if (!commonExhausted.closed) {
            return commonExhausted.bufferField.exhausted() && commonExhausted.source.read(commonExhausted.bufferField, (long) Segment.SIZE) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final long commonIndexOf(@NotNull RealBufferedSource commonIndexOf, byte b9, long j9, long j10) {
        l.e(commonIndexOf, "$this$commonIndexOf");
        if (!(!commonIndexOf.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!(0 <= j9 && j10 >= j9)) {
            throw new IllegalArgumentException(("fromIndex=" + j9 + " toIndex=" + j10).toString());
        }
        while (j9 < j10) {
            long jIndexOf = commonIndexOf.bufferField.indexOf(b9, j9, j10);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = commonIndexOf.bufferField.size();
            if (size >= j10 || commonIndexOf.source.read(commonIndexOf.bufferField, Segment.SIZE) == -1) {
                break;
            }
            j9 = Math.max(j9, size);
        }
        return -1L;
    }

    public static final long commonIndexOf(@NotNull RealBufferedSource commonIndexOf, @NotNull ByteString bytes, long j9) throws IOException {
        l.e(commonIndexOf, "$this$commonIndexOf");
        l.e(bytes, "bytes");
        if (!(!commonIndexOf.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jIndexOf = commonIndexOf.bufferField.indexOf(bytes, j9);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = commonIndexOf.bufferField.size();
            if (commonIndexOf.source.read(commonIndexOf.bufferField, Segment.SIZE) == -1) {
                return -1L;
            }
            j9 = Math.max(j9, (size - ((long) bytes.size())) + 1);
        }
    }

    public static final long commonIndexOfElement(@NotNull RealBufferedSource commonIndexOfElement, @NotNull ByteString targetBytes, long j9) {
        l.e(commonIndexOfElement, "$this$commonIndexOfElement");
        l.e(targetBytes, "targetBytes");
        if (!(!commonIndexOfElement.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jIndexOfElement = commonIndexOfElement.bufferField.indexOfElement(targetBytes, j9);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            long size = commonIndexOfElement.bufferField.size();
            if (commonIndexOfElement.source.read(commonIndexOfElement.bufferField, Segment.SIZE) == -1) {
                return -1L;
            }
            j9 = Math.max(j9, size);
        }
    }

    @NotNull
    public static final BufferedSource commonPeek(@NotNull RealBufferedSource commonPeek) {
        l.e(commonPeek, "$this$commonPeek");
        return Okio.buffer(new PeekSource(commonPeek));
    }

    public static final boolean commonRangeEquals(@NotNull RealBufferedSource commonRangeEquals, long j9, @NotNull ByteString bytes, int i9, int i10) {
        l.e(commonRangeEquals, "$this$commonRangeEquals");
        l.e(bytes, "bytes");
        if (!(!commonRangeEquals.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j9 < 0 || i9 < 0 || i10 < 0 || bytes.size() - i9 < i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            long j10 = ((long) i11) + j9;
            if (!commonRangeEquals.request(1 + j10) || commonRangeEquals.bufferField.getByte(j10) != bytes.getByte(i9 + i11)) {
                return false;
            }
        }
        return true;
    }

    public static final int commonRead(@NotNull RealBufferedSource commonRead, @NotNull byte[] sink, int i9, int i10) {
        l.e(commonRead, "$this$commonRead");
        l.e(sink, "sink");
        long j9 = i10;
        Util.checkOffsetAndCount(sink.length, i9, j9);
        if (commonRead.bufferField.size() == 0 && commonRead.source.read(commonRead.bufferField, Segment.SIZE) == -1) {
            return -1;
        }
        return commonRead.bufferField.read(sink, i9, (int) Math.min(j9, commonRead.bufferField.size()));
    }

    public static final long commonRead(@NotNull RealBufferedSource commonRead, @NotNull Buffer sink, long j9) {
        l.e(commonRead, "$this$commonRead");
        l.e(sink, "sink");
        if (!(j9 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
        }
        if (!(true ^ commonRead.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (commonRead.bufferField.size() == 0 && commonRead.source.read(commonRead.bufferField, Segment.SIZE) == -1) {
            return -1L;
        }
        return commonRead.bufferField.read(sink, Math.min(j9, commonRead.bufferField.size()));
    }

    public static final long commonReadAll(@NotNull RealBufferedSource commonReadAll, @NotNull Sink sink) throws IOException {
        Buffer buffer;
        l.e(commonReadAll, "$this$commonReadAll");
        l.e(sink, "sink");
        long j9 = 0;
        while (true) {
            long j10 = commonReadAll.source.read(commonReadAll.bufferField, Segment.SIZE);
            buffer = commonReadAll.bufferField;
            if (j10 == -1) {
                break;
            }
            long jCompleteSegmentByteCount = buffer.completeSegmentByteCount();
            if (jCompleteSegmentByteCount > 0) {
                j9 += jCompleteSegmentByteCount;
                sink.write(commonReadAll.bufferField, jCompleteSegmentByteCount);
            }
        }
        if (buffer.size() <= 0) {
            return j9;
        }
        long size = j9 + commonReadAll.bufferField.size();
        Buffer buffer2 = commonReadAll.bufferField;
        sink.write(buffer2, buffer2.size());
        return size;
    }

    public static final byte commonReadByte(@NotNull RealBufferedSource commonReadByte) throws EOFException {
        l.e(commonReadByte, "$this$commonReadByte");
        commonReadByte.require(1L);
        return commonReadByte.bufferField.readByte();
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull RealBufferedSource commonReadByteArray) throws IOException {
        l.e(commonReadByteArray, "$this$commonReadByteArray");
        commonReadByteArray.bufferField.writeAll(commonReadByteArray.source);
        return commonReadByteArray.bufferField.readByteArray();
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull RealBufferedSource commonReadByteArray, long j9) throws EOFException {
        l.e(commonReadByteArray, "$this$commonReadByteArray");
        commonReadByteArray.require(j9);
        return commonReadByteArray.bufferField.readByteArray(j9);
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull RealBufferedSource commonReadByteString) throws IOException {
        l.e(commonReadByteString, "$this$commonReadByteString");
        commonReadByteString.bufferField.writeAll(commonReadByteString.source);
        return commonReadByteString.bufferField.readByteString();
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull RealBufferedSource commonReadByteString, long j9) throws EOFException {
        l.e(commonReadByteString, "$this$commonReadByteString");
        commonReadByteString.require(j9);
        return commonReadByteString.bufferField.readByteString(j9);
    }

    public static final long commonReadDecimalLong(@NotNull RealBufferedSource commonReadDecimalLong) throws EOFException {
        byte b9;
        l.e(commonReadDecimalLong, "$this$commonReadDecimalLong");
        commonReadDecimalLong.require(1L);
        long j9 = 0;
        while (true) {
            long j10 = j9 + 1;
            if (!commonReadDecimalLong.request(j10)) {
                break;
            }
            b9 = commonReadDecimalLong.bufferField.getByte(j9);
            if ((b9 < ((byte) 48) || b9 > ((byte) 57)) && !(j9 == 0 && b9 == ((byte) 45))) {
                break;
            }
            j9 = j10;
        }
        if (j9 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9] or '-' character but was 0x");
            String string = Integer.toString(b9, a.a(a.a(16)));
            l.d(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return commonReadDecimalLong.bufferField.readDecimalLong();
    }

    public static final void commonReadFully(@NotNull RealBufferedSource commonReadFully, @NotNull Buffer sink, long j9) throws IOException {
        l.e(commonReadFully, "$this$commonReadFully");
        l.e(sink, "sink");
        try {
            commonReadFully.require(j9);
            commonReadFully.bufferField.readFully(sink, j9);
        } catch (EOFException e9) {
            sink.writeAll(commonReadFully.bufferField);
            throw e9;
        }
    }

    public static final void commonReadFully(@NotNull RealBufferedSource commonReadFully, @NotNull byte[] sink) throws EOFException {
        l.e(commonReadFully, "$this$commonReadFully");
        l.e(sink, "sink");
        try {
            commonReadFully.require(sink.length);
            commonReadFully.bufferField.readFully(sink);
        } catch (EOFException e9) {
            int i9 = 0;
            while (commonReadFully.bufferField.size() > 0) {
                Buffer buffer = commonReadFully.bufferField;
                int i10 = buffer.read(sink, i9, (int) buffer.size());
                if (i10 == -1) {
                    throw new AssertionError();
                }
                i9 += i10;
            }
            throw e9;
        }
    }

    public static final long commonReadHexadecimalUnsignedLong(@NotNull RealBufferedSource commonReadHexadecimalUnsignedLong) throws EOFException {
        byte b9;
        l.e(commonReadHexadecimalUnsignedLong, "$this$commonReadHexadecimalUnsignedLong");
        commonReadHexadecimalUnsignedLong.require(1L);
        int i9 = 0;
        while (true) {
            int i10 = i9 + 1;
            if (!commonReadHexadecimalUnsignedLong.request(i10)) {
                break;
            }
            b9 = commonReadHexadecimalUnsignedLong.bufferField.getByte(i9);
            if ((b9 < ((byte) 48) || b9 > ((byte) 57)) && ((b9 < ((byte) 97) || b9 > ((byte) HttpStatus.SC_PROCESSING)) && (b9 < ((byte) 65) || b9 > ((byte) 70)))) {
                break;
            }
            i9 = i10;
        }
        if (i9 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(b9, a.a(a.a(16)));
            l.d(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return commonReadHexadecimalUnsignedLong.bufferField.readHexadecimalUnsignedLong();
    }

    public static final int commonReadInt(@NotNull RealBufferedSource commonReadInt) throws EOFException {
        l.e(commonReadInt, "$this$commonReadInt");
        commonReadInt.require(4L);
        return commonReadInt.bufferField.readInt();
    }

    public static final int commonReadIntLe(@NotNull RealBufferedSource commonReadIntLe) throws EOFException {
        l.e(commonReadIntLe, "$this$commonReadIntLe");
        commonReadIntLe.require(4L);
        return commonReadIntLe.bufferField.readIntLe();
    }

    public static final long commonReadLong(@NotNull RealBufferedSource commonReadLong) throws EOFException {
        l.e(commonReadLong, "$this$commonReadLong");
        commonReadLong.require(8L);
        return commonReadLong.bufferField.readLong();
    }

    public static final long commonReadLongLe(@NotNull RealBufferedSource commonReadLongLe) throws EOFException {
        l.e(commonReadLongLe, "$this$commonReadLongLe");
        commonReadLongLe.require(8L);
        return commonReadLongLe.bufferField.readLongLe();
    }

    public static final short commonReadShort(@NotNull RealBufferedSource commonReadShort) throws EOFException {
        l.e(commonReadShort, "$this$commonReadShort");
        commonReadShort.require(2L);
        return commonReadShort.bufferField.readShort();
    }

    public static final short commonReadShortLe(@NotNull RealBufferedSource commonReadShortLe) throws EOFException {
        l.e(commonReadShortLe, "$this$commonReadShortLe");
        commonReadShortLe.require(2L);
        return commonReadShortLe.bufferField.readShortLe();
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull RealBufferedSource commonReadUtf8) throws IOException {
        l.e(commonReadUtf8, "$this$commonReadUtf8");
        commonReadUtf8.bufferField.writeAll(commonReadUtf8.source);
        return commonReadUtf8.bufferField.readUtf8();
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull RealBufferedSource commonReadUtf8, long j9) throws EOFException {
        l.e(commonReadUtf8, "$this$commonReadUtf8");
        commonReadUtf8.require(j9);
        return commonReadUtf8.bufferField.readUtf8(j9);
    }

    public static final int commonReadUtf8CodePoint(@NotNull RealBufferedSource commonReadUtf8CodePoint) throws EOFException {
        long j9;
        l.e(commonReadUtf8CodePoint, "$this$commonReadUtf8CodePoint");
        commonReadUtf8CodePoint.require(1L);
        byte b9 = commonReadUtf8CodePoint.bufferField.getByte(0L);
        if ((b9 & 224) == 192) {
            j9 = 2;
        } else {
            if ((b9 & 240) != 224) {
                if ((b9 & 248) == 240) {
                    j9 = 4;
                }
                return commonReadUtf8CodePoint.bufferField.readUtf8CodePoint();
            }
            j9 = 3;
        }
        commonReadUtf8CodePoint.require(j9);
        return commonReadUtf8CodePoint.bufferField.readUtf8CodePoint();
    }

    @Nullable
    public static final String commonReadUtf8Line(@NotNull RealBufferedSource commonReadUtf8Line) {
        l.e(commonReadUtf8Line, "$this$commonReadUtf8Line");
        long jIndexOf = commonReadUtf8Line.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return BufferKt.readUtf8Line(commonReadUtf8Line.bufferField, jIndexOf);
        }
        if (commonReadUtf8Line.bufferField.size() != 0) {
            return commonReadUtf8Line.readUtf8(commonReadUtf8Line.bufferField.size());
        }
        return null;
    }

    @NotNull
    public static final String commonReadUtf8LineStrict(@NotNull RealBufferedSource commonReadUtf8LineStrict, long j9) throws EOFException {
        l.e(commonReadUtf8LineStrict, "$this$commonReadUtf8LineStrict");
        if (!(j9 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j9).toString());
        }
        long j10 = j9 == Long.MAX_VALUE ? Long.MAX_VALUE : j9 + 1;
        byte b9 = (byte) 10;
        long jIndexOf = commonReadUtf8LineStrict.indexOf(b9, 0L, j10);
        if (jIndexOf != -1) {
            return BufferKt.readUtf8Line(commonReadUtf8LineStrict.bufferField, jIndexOf);
        }
        if (j10 < Long.MAX_VALUE && commonReadUtf8LineStrict.request(j10) && commonReadUtf8LineStrict.bufferField.getByte(j10 - 1) == ((byte) 13) && commonReadUtf8LineStrict.request(1 + j10) && commonReadUtf8LineStrict.bufferField.getByte(j10) == b9) {
            return BufferKt.readUtf8Line(commonReadUtf8LineStrict.bufferField, j10);
        }
        Buffer buffer = new Buffer();
        Buffer buffer2 = commonReadUtf8LineStrict.bufferField;
        buffer2.copyTo(buffer, 0L, Math.min(32, buffer2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(commonReadUtf8LineStrict.bufferField.size(), j9) + " content=" + buffer.readByteString().hex() + "…");
    }

    public static final boolean commonRequest(@NotNull RealBufferedSource commonRequest, long j9) {
        l.e(commonRequest, "$this$commonRequest");
        if (!(j9 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
        }
        if (!(!commonRequest.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (commonRequest.bufferField.size() < j9) {
            if (commonRequest.source.read(commonRequest.bufferField, Segment.SIZE) == -1) {
                return false;
            }
        }
        return true;
    }

    public static final void commonRequire(@NotNull RealBufferedSource commonRequire, long j9) throws EOFException {
        l.e(commonRequire, "$this$commonRequire");
        if (!commonRequire.request(j9)) {
            throw new EOFException();
        }
    }

    public static final int commonSelect(@NotNull RealBufferedSource commonSelect, @NotNull Options options) throws EOFException {
        l.e(commonSelect, "$this$commonSelect");
        l.e(options, "options");
        if (!(!commonSelect.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            int iSelectPrefix = BufferKt.selectPrefix(commonSelect.bufferField, options, true);
            if (iSelectPrefix != -2) {
                if (iSelectPrefix == -1) {
                    return -1;
                }
                commonSelect.bufferField.skip(options.getByteStrings$okio()[iSelectPrefix].size());
                return iSelectPrefix;
            }
        } while (commonSelect.source.read(commonSelect.bufferField, Segment.SIZE) != -1);
        return -1;
    }

    public static final void commonSkip(@NotNull RealBufferedSource commonSkip, long j9) throws EOFException {
        l.e(commonSkip, "$this$commonSkip");
        if (!(!commonSkip.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j9 > 0) {
            if (commonSkip.bufferField.size() == 0 && commonSkip.source.read(commonSkip.bufferField, Segment.SIZE) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j9, commonSkip.bufferField.size());
            commonSkip.bufferField.skip(jMin);
            j9 -= jMin;
        }
    }

    @NotNull
    public static final Timeout commonTimeout(@NotNull RealBufferedSource commonTimeout) {
        l.e(commonTimeout, "$this$commonTimeout");
        return commonTimeout.source.timeout();
    }

    @NotNull
    public static final String commonToString(@NotNull RealBufferedSource commonToString) {
        l.e(commonToString, "$this$commonToString");
        return "buffer(" + commonToString.source + ')';
    }
}
