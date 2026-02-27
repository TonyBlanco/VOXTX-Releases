package okio;

import com.google.android.gms.common.api.a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.l;
import okio.internal.BufferKt;
import org.apache.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class RealBufferedSource implements BufferedSource {

    @NotNull
    public final Buffer bufferField;
    public boolean closed;

    @NotNull
    public final Source source;

    public RealBufferedSource(@NotNull Source source) {
        l.e(source, "source");
        this.source = source;
        this.bufferField = new Buffer();
    }

    public static /* synthetic */ void getBuffer$annotations() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    public Buffer buffer() {
        return this.bufferField;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.bufferField.clear();
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
        if (!this.closed) {
            return this.bufferField.exhausted() && this.source.read(this.bufferField, (long) Segment.SIZE) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    public Buffer getBuffer() {
        return this.bufferField;
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b9) {
        return indexOf(b9, 0L, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b9, long j9) {
        return indexOf(b9, j9, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b9, long j9, long j10) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!(0 <= j9 && j10 >= j9)) {
            throw new IllegalArgumentException(("fromIndex=" + j9 + " toIndex=" + j10).toString());
        }
        while (j9 < j10) {
            long jIndexOf = this.bufferField.indexOf(b9, j9, j10);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = this.bufferField.size();
            if (size >= j10 || this.source.read(this.bufferField, Segment.SIZE) == -1) {
                return -1L;
            }
            j9 = Math.max(j9, size);
        }
        return -1L;
    }

    @Override // okio.BufferedSource
    public long indexOf(@NotNull ByteString bytes) {
        l.e(bytes, "bytes");
        return indexOf(bytes, 0L);
    }

    @Override // okio.BufferedSource
    public long indexOf(@NotNull ByteString bytes, long j9) throws IOException {
        l.e(bytes, "bytes");
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jIndexOf = this.bufferField.indexOf(bytes, j9);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = this.bufferField.size();
            if (this.source.read(this.bufferField, Segment.SIZE) == -1) {
                return -1L;
            }
            j9 = Math.max(j9, (size - ((long) bytes.size())) + 1);
        }
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@NotNull ByteString targetBytes) {
        l.e(targetBytes, "targetBytes");
        return indexOfElement(targetBytes, 0L);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@NotNull ByteString targetBytes, long j9) {
        l.e(targetBytes, "targetBytes");
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jIndexOfElement = this.bufferField.indexOfElement(targetBytes, j9);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            long size = this.bufferField.size();
            if (this.source.read(this.bufferField, Segment.SIZE) == -1) {
                return -1L;
            }
            j9 = Math.max(j9, size);
        }
    }

    @Override // okio.BufferedSource
    @NotNull
    public InputStream inputStream() {
        return new InputStream() { // from class: okio.RealBufferedSource.inputStream.1
            @Override // java.io.InputStream
            public int available() throws IOException {
                RealBufferedSource realBufferedSource = RealBufferedSource.this;
                if (realBufferedSource.closed) {
                    throw new IOException("closed");
                }
                return (int) Math.min(realBufferedSource.bufferField.size(), a.e.API_PRIORITY_OTHER);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                RealBufferedSource.this.close();
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                RealBufferedSource realBufferedSource = RealBufferedSource.this;
                if (realBufferedSource.closed) {
                    throw new IOException("closed");
                }
                if (realBufferedSource.bufferField.size() == 0) {
                    RealBufferedSource realBufferedSource2 = RealBufferedSource.this;
                    if (realBufferedSource2.source.read(realBufferedSource2.bufferField, Segment.SIZE) == -1) {
                        return -1;
                    }
                }
                return RealBufferedSource.this.bufferField.readByte() & 255;
            }

            @Override // java.io.InputStream
            public int read(@NotNull byte[] data, int i9, int i10) throws IOException {
                l.e(data, "data");
                if (RealBufferedSource.this.closed) {
                    throw new IOException("closed");
                }
                Util.checkOffsetAndCount(data.length, i9, i10);
                if (RealBufferedSource.this.bufferField.size() == 0) {
                    RealBufferedSource realBufferedSource = RealBufferedSource.this;
                    if (realBufferedSource.source.read(realBufferedSource.bufferField, Segment.SIZE) == -1) {
                        return -1;
                    }
                }
                return RealBufferedSource.this.bufferField.read(data, i9, i10);
            }

            @NotNull
            public String toString() {
                return RealBufferedSource.this + ".inputStream()";
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // okio.BufferedSource
    @NotNull
    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j9, @NotNull ByteString bytes) {
        l.e(bytes, "bytes");
        return rangeEquals(j9, bytes, 0, bytes.size());
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j9, @NotNull ByteString bytes, int i9, int i10) {
        l.e(bytes, "bytes");
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j9 >= 0 && i9 >= 0 && i10 >= 0 && bytes.size() - i9 >= i10) {
            for (int i11 = 0; i11 < i10; i11++) {
                long j10 = ((long) i11) + j9;
                if (request(1 + j10) && this.bufferField.getByte(j10) == bytes.getByte(i9 + i11)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer sink) {
        l.e(sink, "sink");
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, Segment.SIZE) == -1) {
            return -1;
        }
        return this.bufferField.read(sink);
    }

    @Override // okio.BufferedSource
    public int read(@NotNull byte[] sink) {
        l.e(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // okio.BufferedSource
    public int read(@NotNull byte[] sink, int i9, int i10) {
        l.e(sink, "sink");
        long j9 = i10;
        Util.checkOffsetAndCount(sink.length, i9, j9);
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, Segment.SIZE) == -1) {
            return -1;
        }
        return this.bufferField.read(sink, i9, (int) Math.min(j9, this.bufferField.size()));
    }

    @Override // okio.Source
    public long read(@NotNull Buffer sink, long j9) {
        l.e(sink, "sink");
        if (!(j9 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
        }
        if (!(true ^ this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, Segment.SIZE) == -1) {
            return -1L;
        }
        return this.bufferField.read(sink, Math.min(j9, this.bufferField.size()));
    }

    @Override // okio.BufferedSource
    public long readAll(@NotNull Sink sink) throws IOException {
        Buffer buffer;
        l.e(sink, "sink");
        long j9 = 0;
        while (true) {
            long j10 = this.source.read(this.bufferField, Segment.SIZE);
            buffer = this.bufferField;
            if (j10 == -1) {
                break;
            }
            long jCompleteSegmentByteCount = buffer.completeSegmentByteCount();
            if (jCompleteSegmentByteCount > 0) {
                j9 += jCompleteSegmentByteCount;
                sink.write(this.bufferField, jCompleteSegmentByteCount);
            }
        }
        if (buffer.size() <= 0) {
            return j9;
        }
        long size = j9 + this.bufferField.size();
        Buffer buffer2 = this.bufferField;
        sink.write(buffer2, buffer2.size());
        return size;
    }

    @Override // okio.BufferedSource
    public byte readByte() throws EOFException {
        require(1L);
        return this.bufferField.readByte();
    }

    @Override // okio.BufferedSource
    @NotNull
    public byte[] readByteArray() throws IOException {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readByteArray();
    }

    @Override // okio.BufferedSource
    @NotNull
    public byte[] readByteArray(long j9) throws EOFException {
        require(j9);
        return this.bufferField.readByteArray(j9);
    }

    @Override // okio.BufferedSource
    @NotNull
    public ByteString readByteString() throws IOException {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readByteString();
    }

    @Override // okio.BufferedSource
    @NotNull
    public ByteString readByteString(long j9) throws EOFException {
        require(j9);
        return this.bufferField.readByteString(j9);
    }

    @Override // okio.BufferedSource
    public long readDecimalLong() throws EOFException {
        byte b9;
        require(1L);
        long j9 = 0;
        while (true) {
            long j10 = j9 + 1;
            if (!request(j10)) {
                break;
            }
            b9 = this.bufferField.getByte(j9);
            if ((b9 < ((byte) 48) || b9 > ((byte) 57)) && !(j9 == 0 && b9 == ((byte) 45))) {
                break;
            }
            j9 = j10;
        }
        if (j9 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9] or '-' character but was 0x");
            String string = Integer.toString(b9, E8.a.a(E8.a.a(16)));
            l.d(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return this.bufferField.readDecimalLong();
    }

    @Override // okio.BufferedSource
    public void readFully(@NotNull Buffer sink, long j9) throws IOException {
        l.e(sink, "sink");
        try {
            require(j9);
            this.bufferField.readFully(sink, j9);
        } catch (EOFException e9) {
            sink.writeAll(this.bufferField);
            throw e9;
        }
    }

    @Override // okio.BufferedSource
    public void readFully(@NotNull byte[] sink) throws EOFException {
        l.e(sink, "sink");
        try {
            require(sink.length);
            this.bufferField.readFully(sink);
        } catch (EOFException e9) {
            int i9 = 0;
            while (this.bufferField.size() > 0) {
                Buffer buffer = this.bufferField;
                int i10 = buffer.read(sink, i9, (int) buffer.size());
                if (i10 == -1) {
                    throw new AssertionError();
                }
                i9 += i10;
            }
            throw e9;
        }
    }

    @Override // okio.BufferedSource
    public long readHexadecimalUnsignedLong() throws EOFException {
        byte b9;
        require(1L);
        int i9 = 0;
        while (true) {
            int i10 = i9 + 1;
            if (!request(i10)) {
                break;
            }
            b9 = this.bufferField.getByte(i9);
            if ((b9 < ((byte) 48) || b9 > ((byte) 57)) && ((b9 < ((byte) 97) || b9 > ((byte) HttpStatus.SC_PROCESSING)) && (b9 < ((byte) 65) || b9 > ((byte) 70)))) {
                break;
            }
            i9 = i10;
        }
        if (i9 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(b9, E8.a.a(E8.a.a(16)));
            l.d(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return this.bufferField.readHexadecimalUnsignedLong();
    }

    @Override // okio.BufferedSource
    public int readInt() throws EOFException {
        require(4L);
        return this.bufferField.readInt();
    }

    @Override // okio.BufferedSource
    public int readIntLe() throws EOFException {
        require(4L);
        return this.bufferField.readIntLe();
    }

    @Override // okio.BufferedSource
    public long readLong() throws EOFException {
        require(8L);
        return this.bufferField.readLong();
    }

    @Override // okio.BufferedSource
    public long readLongLe() throws EOFException {
        require(8L);
        return this.bufferField.readLongLe();
    }

    @Override // okio.BufferedSource
    public short readShort() throws EOFException {
        require(2L);
        return this.bufferField.readShort();
    }

    @Override // okio.BufferedSource
    public short readShortLe() throws EOFException {
        require(2L);
        return this.bufferField.readShortLe();
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readString(long j9, @NotNull Charset charset) throws EOFException {
        l.e(charset, "charset");
        require(j9);
        return this.bufferField.readString(j9, charset);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readString(@NotNull Charset charset) throws IOException {
        l.e(charset, "charset");
        this.bufferField.writeAll(this.source);
        return this.bufferField.readString(charset);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8() throws IOException {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readUtf8();
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8(long j9) throws EOFException {
        require(j9);
        return this.bufferField.readUtf8(j9);
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() throws EOFException {
        long j9;
        require(1L);
        byte b9 = this.bufferField.getByte(0L);
        if ((b9 & 224) == 192) {
            j9 = 2;
        } else {
            if ((b9 & 240) != 224) {
                if ((b9 & 248) == 240) {
                    j9 = 4;
                }
                return this.bufferField.readUtf8CodePoint();
            }
            j9 = 3;
        }
        require(j9);
        return this.bufferField.readUtf8CodePoint();
    }

    @Override // okio.BufferedSource
    @Nullable
    public String readUtf8Line() {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return BufferKt.readUtf8Line(this.bufferField, jIndexOf);
        }
        if (this.bufferField.size() != 0) {
            return readUtf8(this.bufferField.size());
        }
        return null;
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict(long j9) throws EOFException {
        if (!(j9 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j9).toString());
        }
        long j10 = j9 == Long.MAX_VALUE ? Long.MAX_VALUE : j9 + 1;
        byte b9 = (byte) 10;
        long jIndexOf = indexOf(b9, 0L, j10);
        if (jIndexOf != -1) {
            return BufferKt.readUtf8Line(this.bufferField, jIndexOf);
        }
        if (j10 < Long.MAX_VALUE && request(j10) && this.bufferField.getByte(j10 - 1) == ((byte) 13) && request(1 + j10) && this.bufferField.getByte(j10) == b9) {
            return BufferKt.readUtf8Line(this.bufferField, j10);
        }
        Buffer buffer = new Buffer();
        Buffer buffer2 = this.bufferField;
        buffer2.copyTo(buffer, 0L, Math.min(32, buffer2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.bufferField.size(), j9) + " content=" + buffer.readByteString().hex() + "…");
    }

    @Override // okio.BufferedSource
    public boolean request(long j9) {
        if (!(j9 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
        }
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (this.bufferField.size() < j9) {
            if (this.source.read(this.bufferField, Segment.SIZE) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.BufferedSource
    public void require(long j9) throws EOFException {
        if (!request(j9)) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public int select(@NotNull Options options) throws EOFException {
        l.e(options, "options");
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            int iSelectPrefix = BufferKt.selectPrefix(this.bufferField, options, true);
            if (iSelectPrefix != -2) {
                if (iSelectPrefix != -1) {
                    this.bufferField.skip(options.getByteStrings$okio()[iSelectPrefix].size());
                    return iSelectPrefix;
                }
            } else if (this.source.read(this.bufferField, Segment.SIZE) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // okio.BufferedSource
    public void skip(long j9) throws EOFException {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j9 > 0) {
            if (this.bufferField.size() == 0 && this.source.read(this.bufferField, Segment.SIZE) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j9, this.bufferField.size());
            this.bufferField.skip(jMin);
            j9 -= jMin;
        }
    }

    @Override // okio.Source
    @NotNull
    public Timeout timeout() {
        return this.source.timeout();
    }

    @NotNull
    public String toString() {
        return "buffer(" + this.source + ')';
    }
}
