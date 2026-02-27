package okio;

import E8.c;
import com.amazonaws.services.s3.internal.Constants;
import com.google.android.gms.common.api.a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.l;
import l8.AbstractC2212g;
import okhttp3.internal.connection.RealConnection;
import okio.internal.BufferKt;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {

    @Nullable
    public Segment head;
    private long size;

    public static final class UnsafeCursor implements Closeable {

        @Nullable
        public Buffer buffer;

        @Nullable
        public byte[] data;
        public boolean readWrite;
        private Segment segment;
        public long offset = -1;
        public int start = -1;
        public int end = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!(this.buffer != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.buffer = null;
            this.segment = null;
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final long expandBuffer(int i9) {
            if (!(i9 > 0)) {
                throw new IllegalArgumentException(("minByteCount <= 0: " + i9).toString());
            }
            if (!(i9 <= 8192)) {
                throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i9).toString());
            }
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.readWrite) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
            }
            long size = buffer.size();
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i9);
            int i10 = 8192 - segmentWritableSegment$okio.limit;
            segmentWritableSegment$okio.limit = Segment.SIZE;
            long j9 = i10;
            buffer.setSize$okio(size + j9);
            this.segment = segmentWritableSegment$okio;
            this.offset = size;
            this.data = segmentWritableSegment$okio.data;
            this.start = 8192 - i10;
            this.end = Segment.SIZE;
            return j9;
        }

        public final int next() {
            long j9 = this.offset;
            Buffer buffer = this.buffer;
            l.b(buffer);
            if (!(j9 != buffer.size())) {
                throw new IllegalStateException("no more bytes".toString());
            }
            long j10 = this.offset;
            return seek(j10 == -1 ? 0L : j10 + ((long) (this.end - this.start)));
        }

        public final long resizeBuffer(long j9) {
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.readWrite) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long size = buffer.size();
            int i9 = 1;
            if (j9 <= size) {
                if (!(j9 >= 0)) {
                    throw new IllegalArgumentException(("newSize < 0: " + j9).toString());
                }
                long j10 = size - j9;
                while (true) {
                    if (j10 <= 0) {
                        break;
                    }
                    Segment segment = buffer.head;
                    l.b(segment);
                    Segment segment2 = segment.prev;
                    l.b(segment2);
                    int i10 = segment2.limit;
                    long j11 = i10 - segment2.pos;
                    if (j11 > j10) {
                        segment2.limit = i10 - ((int) j10);
                        break;
                    }
                    buffer.head = segment2.pop();
                    SegmentPool.recycle(segment2);
                    j10 -= j11;
                }
                this.segment = null;
                this.offset = j9;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (j9 > size) {
                long j12 = j9 - size;
                boolean z9 = true;
                while (j12 > 0) {
                    Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i9);
                    int iMin = (int) Math.min(j12, 8192 - segmentWritableSegment$okio.limit);
                    int i11 = segmentWritableSegment$okio.limit + iMin;
                    segmentWritableSegment$okio.limit = i11;
                    j12 -= (long) iMin;
                    if (z9) {
                        this.segment = segmentWritableSegment$okio;
                        this.offset = size;
                        this.data = segmentWritableSegment$okio.data;
                        this.start = i11 - iMin;
                        this.end = i11;
                        z9 = false;
                    }
                    i9 = 1;
                }
            }
            buffer.setSize$okio(j9);
            return size;
        }

        public final int seek(long j9) {
            Segment segmentPush;
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j9 < -1 || j9 > buffer.size()) {
                E e9 = E.f43679a;
                String str = String.format("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j9), Long.valueOf(buffer.size())}, 2));
                l.d(str, "java.lang.String.format(format, *args)");
                throw new ArrayIndexOutOfBoundsException(str);
            }
            if (j9 == -1 || j9 == buffer.size()) {
                this.segment = null;
                this.offset = j9;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long size = buffer.size();
            Segment segment = buffer.head;
            Segment segment2 = this.segment;
            long j10 = 0;
            if (segment2 != null) {
                long j11 = this.offset;
                int i9 = this.start;
                l.b(segment2);
                long j12 = j11 - ((long) (i9 - segment2.pos));
                if (j12 > j9) {
                    segmentPush = segment;
                    segment = this.segment;
                    size = j12;
                } else {
                    segmentPush = this.segment;
                    j10 = j12;
                }
            } else {
                segmentPush = segment;
            }
            if (size - j9 > j9 - j10) {
                while (true) {
                    l.b(segmentPush);
                    int i10 = segmentPush.limit;
                    int i11 = segmentPush.pos;
                    if (j9 < ((long) (i10 - i11)) + j10) {
                        break;
                    }
                    j10 += (long) (i10 - i11);
                    segmentPush = segmentPush.next;
                }
            } else {
                while (size > j9) {
                    l.b(segment);
                    segment = segment.prev;
                    l.b(segment);
                    size -= (long) (segment.limit - segment.pos);
                }
                segmentPush = segment;
                j10 = size;
            }
            if (this.readWrite) {
                l.b(segmentPush);
                if (segmentPush.shared) {
                    Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
                    if (buffer.head == segmentPush) {
                        buffer.head = segmentUnsharedCopy;
                    }
                    segmentPush = segmentPush.push(segmentUnsharedCopy);
                    Segment segment3 = segmentPush.prev;
                    l.b(segment3);
                    segment3.pop();
                }
            }
            this.segment = segmentPush;
            this.offset = j9;
            l.b(segmentPush);
            this.data = segmentPush.data;
            int i12 = segmentPush.pos + ((int) (j9 - j10));
            this.start = i12;
            int i13 = segmentPush.limit;
            this.end = i13;
            return i13 - i12;
        }
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, OutputStream outputStream, long j9, long j10, int i9, Object obj) throws IOException {
        if ((i9 & 2) != 0) {
            j9 = 0;
        }
        long j11 = j9;
        if ((i9 & 4) != 0) {
            j10 = buffer.size - j11;
        }
        return buffer.copyTo(outputStream, j11, j10);
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j9, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            j9 = 0;
        }
        return buffer.copyTo(buffer2, j9);
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j9, long j10, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            j9 = 0;
        }
        return buffer.copyTo(buffer2, j9, j10);
    }

    private final ByteString digest(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        Segment segment = this.head;
        if (segment != null) {
            byte[] bArr = segment.data;
            int i9 = segment.pos;
            messageDigest.update(bArr, i9, segment.limit - i9);
            Segment segment2 = segment.next;
            while (true) {
                l.b(segment2);
                if (segment2 == segment) {
                    break;
                }
                byte[] bArr2 = segment2.data;
                int i10 = segment2.pos;
                messageDigest.update(bArr2, i10, segment2.limit - i10);
                segment2 = segment2.next;
            }
        }
        byte[] bArrDigest = messageDigest.digest();
        l.d(bArrDigest, "messageDigest.digest()");
        return new ByteString(bArrDigest);
    }

    private final ByteString hmac(String str, ByteString byteString) throws NoSuchAlgorithmException {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.internalArray$okio(), str));
            Segment segment = this.head;
            if (segment != null) {
                byte[] bArr = segment.data;
                int i9 = segment.pos;
                mac.update(bArr, i9, segment.limit - i9);
                Segment segment2 = segment.next;
                while (true) {
                    l.b(segment2);
                    if (segment2 == segment) {
                        break;
                    }
                    byte[] bArr2 = segment2.data;
                    int i10 = segment2.pos;
                    mac.update(bArr2, i10, segment2.limit - i10);
                    segment2 = segment2.next;
                }
            }
            byte[] bArrDoFinal = mac.doFinal();
            l.d(bArrDoFinal, "mac.doFinal()");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    public static /* synthetic */ UnsafeCursor readAndWriteUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            unsafeCursor = new UnsafeCursor();
        }
        return buffer.readAndWriteUnsafe(unsafeCursor);
    }

    private final void readFrom(InputStream inputStream, long j9, boolean z9) throws IOException {
        while (true) {
            if (j9 <= 0 && !z9) {
                return;
            }
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int i9 = inputStream.read(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, (int) Math.min(j9, 8192 - segmentWritableSegment$okio.limit));
            if (i9 == -1) {
                if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
                    this.head = segmentWritableSegment$okio.pop();
                    SegmentPool.recycle(segmentWritableSegment$okio);
                }
                if (!z9) {
                    throw new EOFException();
                }
                return;
            }
            segmentWritableSegment$okio.limit += i9;
            long j10 = i9;
            this.size += j10;
            j9 -= j10;
        }
    }

    public static /* synthetic */ UnsafeCursor readUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            unsafeCursor = new UnsafeCursor();
        }
        return buffer.readUnsafe(unsafeCursor);
    }

    public static /* synthetic */ Buffer writeTo$default(Buffer buffer, OutputStream outputStream, long j9, int i9, Object obj) throws IOException {
        if ((i9 & 2) != 0) {
            j9 = buffer.size;
        }
        return buffer.writeTo(outputStream, j9);
    }

    /* JADX INFO: renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m163deprecated_getByte(long j9) {
        return getByte(j9);
    }

    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final long m164deprecated_size() {
        return this.size;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    public Buffer buffer() {
        return this;
    }

    public final void clear() throws EOFException {
        skip(size());
    }

    @NotNull
    public Buffer clone() {
        return copy();
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final long completeSegmentByteCount() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = this.head;
        l.b(segment);
        Segment segment2 = segment.prev;
        l.b(segment2);
        int i9 = segment2.limit;
        if (i9 < 8192 && segment2.owner) {
            size -= (long) (i9 - segment2.pos);
        }
        return size;
    }

    @NotNull
    public final Buffer copy() {
        Buffer buffer = new Buffer();
        if (size() != 0) {
            Segment segment = this.head;
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
            buffer.setSize$okio(size());
        }
        return buffer;
    }

    @NotNull
    public final Buffer copyTo(@NotNull OutputStream outputStream) throws IOException {
        return copyTo$default(this, outputStream, 0L, 0L, 6, (Object) null);
    }

    @NotNull
    public final Buffer copyTo(@NotNull OutputStream outputStream, long j9) throws IOException {
        return copyTo$default(this, outputStream, j9, 0L, 4, (Object) null);
    }

    @NotNull
    public final Buffer copyTo(@NotNull OutputStream out, long j9, long j10) throws IOException {
        l.e(out, "out");
        Util.checkOffsetAndCount(this.size, j9, j10);
        if (j10 == 0) {
            return this;
        }
        Segment segment = this.head;
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
            int i11 = (int) (((long) segment.pos) + j9);
            int iMin = (int) Math.min(segment.limit - i11, j10);
            out.write(segment.data, i11, iMin);
            j10 -= (long) iMin;
            segment = segment.next;
            j9 = 0;
        }
        return this;
    }

    @NotNull
    public final Buffer copyTo(@NotNull Buffer out, long j9) {
        l.e(out, "out");
        return copyTo(out, j9, this.size - j9);
    }

    @NotNull
    public final Buffer copyTo(@NotNull Buffer out, long j9, long j10) {
        l.e(out, "out");
        Util.checkOffsetAndCount(size(), j9, j10);
        if (j10 != 0) {
            out.setSize$okio(out.size() + j10);
            Segment segment = this.head;
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
        }
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer emit() {
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer emitCompleteSegments() {
        return this;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Buffer) {
            Buffer buffer = (Buffer) obj;
            if (size() == buffer.size()) {
                if (size() == 0) {
                    return true;
                }
                Segment segment = this.head;
                l.b(segment);
                Segment segment2 = buffer.head;
                l.b(segment2);
                int i9 = segment.pos;
                int i10 = segment2.pos;
                long j9 = 0;
                while (j9 < size()) {
                    long jMin = Math.min(segment.limit - i9, segment2.limit - i10);
                    long j10 = 0;
                    while (j10 < jMin) {
                        int i11 = i9 + 1;
                        int i12 = i10 + 1;
                        if (segment.data[i9] == segment2.data[i10]) {
                            j10++;
                            i9 = i11;
                            i10 = i12;
                        }
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
        }
        return false;
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
        return this.size == 0;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    public Buffer getBuffer() {
        return this;
    }

    public final byte getByte(long j9) {
        Util.checkOffsetAndCount(size(), j9, 1L);
        Segment segment = this.head;
        if (segment == null) {
            l.b(null);
            throw null;
        }
        if (size() - j9 < j9) {
            long size = size();
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

    public int hashCode() {
        Segment segment = this.head;
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
        } while (segment != this.head);
        return i9;
    }

    @NotNull
    public final ByteString hmacSha1(@NotNull ByteString key) {
        l.e(key, "key");
        return hmac(Constants.HMAC_SHA1_ALGORITHM, key);
    }

    @NotNull
    public final ByteString hmacSha256(@NotNull ByteString key) {
        l.e(key, "key");
        return hmac("HmacSHA256", key);
    }

    @NotNull
    public final ByteString hmacSha512(@NotNull ByteString key) {
        l.e(key, "key");
        return hmac("HmacSHA512", key);
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
        Segment segment;
        int i9;
        long size = 0;
        if (!(0 <= j9 && j10 >= j9)) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j9 + " toIndex=" + j10).toString());
        }
        if (j10 > size()) {
            j10 = size();
        }
        if (j9 == j10 || (segment = this.head) == null) {
            return -1L;
        }
        if (size() - j9 < j9) {
            size = size();
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

    @Override // okio.BufferedSource
    public long indexOf(@NotNull ByteString bytes) throws IOException {
        l.e(bytes, "bytes");
        return indexOf(bytes, 0L);
    }

    @Override // okio.BufferedSource
    public long indexOf(@NotNull ByteString bytes, long j9) throws IOException {
        long j10 = j9;
        l.e(bytes, "bytes");
        if (!(bytes.size() > 0)) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j11 = 0;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
        }
        Segment segment = this.head;
        if (segment != null) {
            if (size() - j10 < j10) {
                long size = size();
                while (size > j10) {
                    segment = segment.prev;
                    l.b(segment);
                    size -= (long) (segment.limit - segment.pos);
                }
                byte[] bArrInternalArray$okio = bytes.internalArray$okio();
                byte b9 = bArrInternalArray$okio[0];
                int size2 = bytes.size();
                long size3 = (size() - ((long) size2)) + 1;
                while (size < size3) {
                    byte[] bArr = segment.data;
                    long j12 = size;
                    int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + size3) - size);
                    for (int i9 = (int) ((((long) segment.pos) + j10) - j12); i9 < iMin; i9++) {
                        if (bArr[i9] == b9 && BufferKt.rangeEquals(segment, i9 + 1, bArrInternalArray$okio, 1, size2)) {
                            return ((long) (i9 - segment.pos)) + j12;
                        }
                    }
                    size = j12 + ((long) (segment.limit - segment.pos));
                    segment = segment.next;
                    l.b(segment);
                    j10 = size;
                }
            } else {
                while (true) {
                    long j13 = ((long) (segment.limit - segment.pos)) + j11;
                    if (j13 > j10) {
                        break;
                    }
                    segment = segment.next;
                    l.b(segment);
                    j11 = j13;
                }
                byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
                byte b10 = bArrInternalArray$okio2[0];
                int size4 = bytes.size();
                long size5 = (size() - ((long) size4)) + 1;
                while (j11 < size5) {
                    byte[] bArr2 = segment.data;
                    long j14 = size5;
                    int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + size5) - j11);
                    for (int i10 = (int) ((((long) segment.pos) + j10) - j11); i10 < iMin2; i10++) {
                        if (bArr2[i10] == b10 && BufferKt.rangeEquals(segment, i10 + 1, bArrInternalArray$okio2, 1, size4)) {
                            return ((long) (i10 - segment.pos)) + j11;
                        }
                    }
                    j11 += (long) (segment.limit - segment.pos);
                    segment = segment.next;
                    l.b(segment);
                    j10 = j11;
                    size5 = j14;
                }
            }
        }
        return -1L;
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@NotNull ByteString targetBytes) {
        l.e(targetBytes, "targetBytes");
        return indexOfElement(targetBytes, 0L);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@NotNull ByteString targetBytes, long j9) {
        int i9;
        l.e(targetBytes, "targetBytes");
        long size = 0;
        if (!(j9 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j9).toString());
        }
        Segment segment = this.head;
        if (segment == null) {
            return -1L;
        }
        if (size() - j9 < j9) {
            size = size();
            while (size > j9) {
                segment = segment.prev;
                l.b(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            if (targetBytes.size() == 2) {
                byte b9 = targetBytes.getByte(0);
                byte b10 = targetBytes.getByte(1);
                while (size < size()) {
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
            while (size < size()) {
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
            while (size < size()) {
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
        while (size < size()) {
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

    @Override // okio.BufferedSource
    @NotNull
    public InputStream inputStream() {
        return new InputStream() { // from class: okio.Buffer.inputStream.1
            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(Buffer.this.size(), a.e.API_PRIORITY_OTHER);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.InputStream
            public int read() {
                if (Buffer.this.size() > 0) {
                    return Buffer.this.readByte() & 255;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public int read(@NotNull byte[] sink, int i9, int i10) {
                l.e(sink, "sink");
                return Buffer.this.read(sink, i9, i10);
            }

            @NotNull
            public String toString() {
                return Buffer.this + ".inputStream()";
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @NotNull
    public final ByteString md5() {
        return digest(MessageDigestAlgorithms.MD5);
    }

    @Override // okio.BufferedSink
    @NotNull
    public OutputStream outputStream() {
        return new OutputStream() { // from class: okio.Buffer.outputStream.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
            }

            @NotNull
            public String toString() {
                return Buffer.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int i9) {
                Buffer.this.writeByte(i9);
            }

            @Override // java.io.OutputStream
            public void write(@NotNull byte[] data, int i9, int i10) {
                l.e(data, "data");
                Buffer.this.write(data, i9, i10);
            }
        };
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
        if (j9 < 0 || i9 < 0 || i10 < 0 || size() - j9 < i10 || bytes.size() - i9 < i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (getByte(((long) i11) + j9) != bytes.getByte(i9 + i11)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer sink) throws IOException {
        l.e(sink, "sink");
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), segment.limit - segment.pos);
        sink.put(segment.data, segment.pos, iMin);
        int i9 = segment.pos + iMin;
        segment.pos = i9;
        this.size -= (long) iMin;
        if (i9 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    @Override // okio.BufferedSource
    public int read(@NotNull byte[] sink) {
        l.e(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // okio.BufferedSource
    public int read(@NotNull byte[] sink, int i9, int i10) {
        l.e(sink, "sink");
        Util.checkOffsetAndCount(sink.length, i9, i10);
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i10, segment.limit - segment.pos);
        byte[] bArr = segment.data;
        int i11 = segment.pos;
        AbstractC2212g.c(bArr, sink, i9, i11, i11 + iMin);
        segment.pos += iMin;
        setSize$okio(size() - ((long) iMin));
        if (segment.pos != segment.limit) {
            return iMin;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return iMin;
    }

    @Override // okio.Source
    public long read(@NotNull Buffer sink, long j9) {
        l.e(sink, "sink");
        if (!(j9 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j9 > size()) {
            j9 = size();
        }
        sink.write(this, j9);
        return j9;
    }

    @Override // okio.BufferedSource
    public long readAll(@NotNull Sink sink) throws IOException {
        l.e(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    @NotNull
    public final UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe$default(this, null, 1, null);
    }

    @NotNull
    public final UnsafeCursor readAndWriteUnsafe(@NotNull UnsafeCursor unsafeCursor) {
        l.e(unsafeCursor, "unsafeCursor");
        if (!(unsafeCursor.buffer == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        unsafeCursor.buffer = this;
        unsafeCursor.readWrite = true;
        return unsafeCursor;
    }

    @Override // okio.BufferedSource
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        Segment segment = this.head;
        l.b(segment);
        int i9 = segment.pos;
        int i10 = segment.limit;
        int i11 = i9 + 1;
        byte b9 = segment.data[i9];
        setSize$okio(size() - 1);
        if (i11 == i10) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i11;
        }
        return b9;
    }

    @Override // okio.BufferedSource
    @NotNull
    public byte[] readByteArray() {
        return readByteArray(size());
    }

    @Override // okio.BufferedSource
    @NotNull
    public byte[] readByteArray(long j9) throws EOFException {
        if (!(j9 >= 0 && j9 <= ((long) a.e.API_PRIORITY_OTHER))) {
            throw new IllegalArgumentException(("byteCount: " + j9).toString());
        }
        if (size() < j9) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j9];
        readFully(bArr);
        return bArr;
    }

    @Override // okio.BufferedSource
    @NotNull
    public ByteString readByteString() {
        return readByteString(size());
    }

    @Override // okio.BufferedSource
    @NotNull
    public ByteString readByteString(long j9) throws EOFException {
        if (!(j9 >= 0 && j9 <= ((long) a.e.API_PRIORITY_OTHER))) {
            throw new IllegalArgumentException(("byteCount: " + j9).toString());
        }
        if (size() < j9) {
            throw new EOFException();
        }
        if (j9 < 4096) {
            return new ByteString(readByteArray(j9));
        }
        ByteString byteStringSnapshot = snapshot((int) j9);
        skip(j9);
        return byteStringSnapshot;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6 A[EDGE_INSN: B:48:0x00b6->B:38:0x00b6 BREAK  A[LOOP:0: B:5:0x0013->B:50:?], SYNTHETIC] */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readDecimalLong() throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.readDecimalLong():long");
    }

    @NotNull
    public final Buffer readFrom(@NotNull InputStream input) throws IOException {
        l.e(input, "input");
        readFrom(input, Long.MAX_VALUE, true);
        return this;
    }

    @NotNull
    public final Buffer readFrom(@NotNull InputStream input, long j9) throws IOException {
        l.e(input, "input");
        if (j9 >= 0) {
            readFrom(input, j9, false);
            return this;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
    }

    @Override // okio.BufferedSource
    public void readFully(@NotNull Buffer sink, long j9) throws EOFException {
        l.e(sink, "sink");
        if (size() >= j9) {
            sink.write(this, j9);
        } else {
            sink.write(this, size());
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public void readFully(@NotNull byte[] sink) throws EOFException {
        l.e(sink, "sink");
        int i9 = 0;
        while (i9 < sink.length) {
            int i10 = read(sink, i9, sink.length - i9);
            if (i10 == -1) {
                throw new EOFException();
            }
            i9 += i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae A[EDGE_INSN: B:43:0x00ae->B:37:0x00ae BREAK  A[LOOP:0: B:5:0x000d->B:45:?], SYNTHETIC] */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readHexadecimalUnsignedLong() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb8
            r0 = 0
            r4 = r2
            r1 = 0
        Ld:
            okio.Segment r6 = r15.head
            kotlin.jvm.internal.l.b(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L18:
            if (r8 >= r9) goto L9a
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L29
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L29
            int r11 = r10 - r11
            goto L43
        L29:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L38
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L38
        L33:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L43
        L38:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L7b
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L7b
            goto L33
        L43:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L53
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L53:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L7b:
            if (r0 == 0) goto L7f
            r1 = 1
            goto L9a
        L7f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = okio.Util.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9a:
            if (r8 != r9) goto La6
            okio.Segment r7 = r6.pop()
            r15.head = r7
            okio.SegmentPool.recycle(r6)
            goto La8
        La6:
            r6.pos = r8
        La8:
            if (r1 != 0) goto Lae
            okio.Segment r6 = r15.head
            if (r6 != 0) goto Ld
        Lae:
            long r1 = r15.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.setSize$okio(r1)
            return r4
        Lb8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.readHexadecimalUnsignedLong():long");
    }

    @Override // okio.BufferedSource
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        Segment segment = this.head;
        l.b(segment);
        int i9 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i9 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = segment.data;
        int i11 = i9 + 3;
        int i12 = ((bArr[i9 + 1] & 255) << 16) | ((bArr[i9] & 255) << 24) | ((bArr[i9 + 2] & 255) << 8);
        int i13 = i9 + 4;
        int i14 = (bArr[i11] & 255) | i12;
        setSize$okio(size() - 4);
        if (i13 == i10) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i13;
        }
        return i14;
    }

    @Override // okio.BufferedSource
    public int readIntLe() throws EOFException {
        return Util.reverseBytes(readInt());
    }

    @Override // okio.BufferedSource
    public long readLong() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        Segment segment = this.head;
        l.b(segment);
        int i9 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i9 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = segment.data;
        int i11 = i9 + 7;
        long j9 = ((((long) bArr[i9 + 3]) & 255) << 32) | ((((long) bArr[i9]) & 255) << 56) | ((((long) bArr[i9 + 1]) & 255) << 48) | ((((long) bArr[i9 + 2]) & 255) << 40) | ((((long) bArr[i9 + 4]) & 255) << 24) | ((((long) bArr[i9 + 5]) & 255) << 16) | ((((long) bArr[i9 + 6]) & 255) << 8);
        int i12 = i9 + 8;
        long j10 = j9 | (((long) bArr[i11]) & 255);
        setSize$okio(size() - 8);
        if (i12 == i10) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i12;
        }
        return j10;
    }

    @Override // okio.BufferedSource
    public long readLongLe() throws EOFException {
        return Util.reverseBytes(readLong());
    }

    @Override // okio.BufferedSource
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        Segment segment = this.head;
        l.b(segment);
        int i9 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i9 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = segment.data;
        int i11 = i9 + 1;
        int i12 = (bArr[i9] & 255) << 8;
        int i13 = i9 + 2;
        int i14 = (bArr[i11] & 255) | i12;
        setSize$okio(size() - 2);
        if (i13 == i10) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i13;
        }
        return (short) i14;
    }

    @Override // okio.BufferedSource
    public short readShortLe() throws EOFException {
        return Util.reverseBytes(readShort());
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readString(long j9, @NotNull Charset charset) throws EOFException {
        l.e(charset, "charset");
        if (!(j9 >= 0 && j9 <= ((long) a.e.API_PRIORITY_OTHER))) {
            throw new IllegalArgumentException(("byteCount: " + j9).toString());
        }
        if (this.size < j9) {
            throw new EOFException();
        }
        if (j9 == 0) {
            return "";
        }
        Segment segment = this.head;
        l.b(segment);
        int i9 = segment.pos;
        if (((long) i9) + j9 > segment.limit) {
            return new String(readByteArray(j9), charset);
        }
        int i10 = (int) j9;
        String str = new String(segment.data, i9, i10, charset);
        int i11 = segment.pos + i10;
        segment.pos = i11;
        this.size -= j9;
        if (i11 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return str;
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readString(@NotNull Charset charset) {
        l.e(charset, "charset");
        return readString(this.size, charset);
    }

    @NotNull
    public final UnsafeCursor readUnsafe() {
        return readUnsafe$default(this, null, 1, null);
    }

    @NotNull
    public final UnsafeCursor readUnsafe(@NotNull UnsafeCursor unsafeCursor) {
        l.e(unsafeCursor, "unsafeCursor");
        if (!(unsafeCursor.buffer == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        unsafeCursor.buffer = this;
        unsafeCursor.readWrite = false;
        return unsafeCursor;
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8() {
        return readString(this.size, c.f1714b);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8(long j9) throws EOFException {
        return readString(j9, c.f1714b);
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() throws EOFException {
        int i9;
        int i10;
        int i11;
        if (size() == 0) {
            throw new EOFException();
        }
        byte b9 = getByte(0L);
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
                skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i9 = b9 & 7;
            i10 = 4;
            i11 = 65536;
        }
        long j9 = i10;
        if (size() < j9) {
            throw new EOFException("size < " + i10 + ": " + size() + " (to read code point prefixed 0x" + Util.toHexString(b9) + ')');
        }
        for (int i12 = 1; i12 < i10; i12++) {
            long j10 = i12;
            byte b10 = getByte(j10);
            if ((b10 & 192) != 128) {
                skip(j10);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i9 = (i9 << 6) | (b10 & Utf8.REPLACEMENT_BYTE);
        }
        skip(j9);
        return i9 > 1114111 ? Utf8.REPLACEMENT_CODE_POINT : ((55296 <= i9 && 57343 >= i9) || i9 < i11) ? Utf8.REPLACEMENT_CODE_POINT : i9;
    }

    @Override // okio.BufferedSource
    @Nullable
    public String readUtf8Line() throws EOFException {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return BufferKt.readUtf8Line(this, jIndexOf);
        }
        if (size() != 0) {
            return readUtf8(size());
        }
        return null;
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict(long j9) throws EOFException {
        if (!(j9 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j9).toString());
        }
        long j10 = j9 != Long.MAX_VALUE ? j9 + 1 : Long.MAX_VALUE;
        byte b9 = (byte) 10;
        long jIndexOf = indexOf(b9, 0L, j10);
        if (jIndexOf != -1) {
            return BufferKt.readUtf8Line(this, jIndexOf);
        }
        if (j10 < size() && getByte(j10 - 1) == ((byte) 13) && getByte(j10) == b9) {
            return BufferKt.readUtf8Line(this, j10);
        }
        Buffer buffer = new Buffer();
        copyTo(buffer, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j9) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    @Override // okio.BufferedSource
    public boolean request(long j9) {
        return this.size >= j9;
    }

    @Override // okio.BufferedSource
    public void require(long j9) throws EOFException {
        if (this.size < j9) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public int select(@NotNull Options options) throws EOFException {
        l.e(options, "options");
        int iSelectPrefix$default = BufferKt.selectPrefix$default(this, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        skip(options.getByteStrings$okio()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public final void setSize$okio(long j9) {
        this.size = j9;
    }

    @NotNull
    public final ByteString sha1() {
        return digest(MessageDigestAlgorithms.SHA_1);
    }

    @NotNull
    public final ByteString sha256() {
        return digest(MessageDigestAlgorithms.SHA_256);
    }

    @NotNull
    public final ByteString sha512() {
        return digest(MessageDigestAlgorithms.SHA_512);
    }

    public final long size() {
        return this.size;
    }

    @Override // okio.BufferedSource
    public void skip(long j9) throws EOFException {
        while (j9 > 0) {
            Segment segment = this.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j9, segment.limit - segment.pos);
            long j10 = iMin;
            setSize$okio(size() - j10);
            j9 -= j10;
            int i9 = segment.pos + iMin;
            segment.pos = i9;
            if (i9 == segment.limit) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    @NotNull
    public final ByteString snapshot() {
        if (size() <= ((long) a.e.API_PRIORITY_OTHER)) {
            return snapshot((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @NotNull
    public final ByteString snapshot(int i9) {
        if (i9 == 0) {
            return ByteString.EMPTY;
        }
        Util.checkOffsetAndCount(size(), 0L, i9);
        Segment segment = this.head;
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
        Segment segment2 = this.head;
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

    @Override // okio.Source
    @NotNull
    public Timeout timeout() {
        return Timeout.NONE;
    }

    @NotNull
    public String toString() {
        return snapshot().toString();
    }

    @NotNull
    public final Segment writableSegment$okio(int i9) {
        if (!(i9 >= 1 && i9 <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        Segment segment = this.head;
        if (segment != null) {
            l.b(segment);
            Segment segment2 = segment.prev;
            l.b(segment2);
            return (segment2.limit + i9 > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        this.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer source) throws IOException {
        l.e(source, "source");
        int iRemaining = source.remaining();
        int i9 = iRemaining;
        while (i9 > 0) {
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i9, 8192 - segmentWritableSegment$okio.limit);
            source.get(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, iMin);
            i9 -= iMin;
            segmentWritableSegment$okio.limit += iMin;
        }
        this.size += (long) iRemaining;
        return iRemaining;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull ByteString byteString) {
        l.e(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull ByteString byteString, int i9, int i10) {
        l.e(byteString, "byteString");
        byteString.write$okio(this, i9, i10);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull Source source, long j9) throws IOException {
        l.e(source, "source");
        while (j9 > 0) {
            long j10 = source.read(this, j9);
            if (j10 == -1) {
                throw new EOFException();
            }
            j9 -= j10;
        }
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull byte[] source) {
        l.e(source, "source");
        return write(source, 0, source.length);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull byte[] source, int i9, int i10) {
        l.e(source, "source");
        long j9 = i10;
        Util.checkOffsetAndCount(source.length, i9, j9);
        int i11 = i10 + i9;
        while (i9 < i11) {
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i11 - i9, 8192 - segmentWritableSegment$okio.limit);
            int i12 = i9 + iMin;
            AbstractC2212g.c(source, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, i9, i12);
            segmentWritableSegment$okio.limit += iMin;
            i9 = i12;
        }
        setSize$okio(size() + j9);
        return this;
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer source, long j9) {
        Segment segment;
        l.e(source, "source");
        if (!(source != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        Util.checkOffsetAndCount(source.size(), 0L, j9);
        while (j9 > 0) {
            Segment segment2 = source.head;
            l.b(segment2);
            int i9 = segment2.limit;
            l.b(source.head);
            if (j9 < i9 - r2.pos) {
                Segment segment3 = this.head;
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
                        setSize$okio(size() + j9);
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
            Segment segment7 = this.head;
            if (segment7 == null) {
                this.head = segment6;
                segment6.prev = segment6;
                segment6.next = segment6;
            } else {
                l.b(segment7);
                Segment segment8 = segment7.prev;
                l.b(segment8);
                segment8.push(segment6).compact();
            }
            source.setSize$okio(source.size() - j10);
            setSize$okio(size() + j10);
            j9 -= j10;
        }
    }

    @Override // okio.BufferedSink
    public long writeAll(@NotNull Source source) throws IOException {
        l.e(source, "source");
        long j9 = 0;
        while (true) {
            long j10 = source.read(this, Segment.SIZE);
            if (j10 == -1) {
                return j9;
            }
            j9 += j10;
        }
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeByte(int i9) {
        Segment segmentWritableSegment$okio = writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i10 + 1;
        bArr[i10] = (byte) i9;
        setSize$okio(size() + 1);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeDecimalLong(long j9) {
        boolean z9;
        if (j9 == 0) {
            return writeByte(48);
        }
        int i9 = 1;
        if (j9 < 0) {
            j9 = -j9;
            if (j9 < 0) {
                return writeUtf8("-9223372036854775808");
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
        Segment segmentWritableSegment$okio = writableSegment$okio(i9);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit + i9;
        while (j9 != 0) {
            long j10 = 10;
            i10--;
            bArr[i10] = BufferKt.getHEX_DIGIT_BYTES()[(int) (j9 % j10)];
            j9 /= j10;
        }
        if (z9) {
            bArr[i10 - 1] = (byte) 45;
        }
        segmentWritableSegment$okio.limit += i9;
        setSize$okio(size() + ((long) i9));
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeHexadecimalUnsignedLong(long j9) {
        if (j9 == 0) {
            return writeByte(48);
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
        Segment segmentWritableSegment$okio = writableSegment$okio(i9);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        for (int i11 = (i10 + i9) - 1; i11 >= i10; i11--) {
            bArr[i11] = BufferKt.getHEX_DIGIT_BYTES()[(int) (15 & j9)];
            j9 >>>= 4;
        }
        segmentWritableSegment$okio.limit += i9;
        setSize$okio(size() + ((long) i9));
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeInt(int i9) {
        Segment segmentWritableSegment$okio = writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        bArr[i10] = (byte) ((i9 >>> 24) & 255);
        bArr[i10 + 1] = (byte) ((i9 >>> 16) & 255);
        bArr[i10 + 2] = (byte) ((i9 >>> 8) & 255);
        bArr[i10 + 3] = (byte) (i9 & 255);
        segmentWritableSegment$okio.limit = i10 + 4;
        setSize$okio(size() + 4);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeIntLe(int i9) {
        return writeInt(Util.reverseBytes(i9));
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeLong(long j9) {
        Segment segmentWritableSegment$okio = writableSegment$okio(8);
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
        setSize$okio(size() + 8);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeLongLe(long j9) {
        return writeLong(Util.reverseBytes(j9));
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeShort(int i9) {
        Segment segmentWritableSegment$okio = writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        bArr[i10] = (byte) ((i9 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (i9 & 255);
        segmentWritableSegment$okio.limit = i10 + 2;
        setSize$okio(size() + 2);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeShortLe(int i9) {
        return writeShort((int) Util.reverseBytes((short) i9));
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeString(@NotNull String string, int i9, int i10, @NotNull Charset charset) {
        l.e(string, "string");
        l.e(charset, "charset");
        if (!(i9 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i9).toString());
        }
        if (!(i10 >= i9)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i10 + " < " + i9).toString());
        }
        if (!(i10 <= string.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i10 + " > " + string.length()).toString());
        }
        if (l.a(charset, c.f1714b)) {
            return writeUtf8(string, i9, i10);
        }
        String strSubstring = string.substring(i9, i10);
        l.d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        if (strSubstring == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = strSubstring.getBytes(charset);
        l.d(bytes, "(this as java.lang.String).getBytes(charset)");
        return write(bytes, 0, bytes.length);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeString(@NotNull String string, @NotNull Charset charset) {
        l.e(string, "string");
        l.e(charset, "charset");
        return writeString(string, 0, string.length(), charset);
    }

    @NotNull
    public final Buffer writeTo(@NotNull OutputStream outputStream) throws IOException {
        return writeTo$default(this, outputStream, 0L, 2, null);
    }

    @NotNull
    public final Buffer writeTo(@NotNull OutputStream out, long j9) throws IOException {
        l.e(out, "out");
        Util.checkOffsetAndCount(this.size, 0L, j9);
        Segment segment = this.head;
        while (j9 > 0) {
            l.b(segment);
            int iMin = (int) Math.min(j9, segment.limit - segment.pos);
            out.write(segment.data, segment.pos, iMin);
            int i9 = segment.pos + iMin;
            segment.pos = i9;
            long j10 = iMin;
            this.size -= j10;
            j9 -= j10;
            if (i9 == segment.limit) {
                Segment segmentPop = segment.pop();
                this.head = segmentPop;
                SegmentPool.recycle(segment);
                segment = segmentPop;
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeUtf8(@NotNull String string) {
        l.e(string, "string");
        return writeUtf8(string, 0, string.length());
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeUtf8(@NotNull String string, int i9, int i10) {
        long size;
        long j9;
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
                Segment segmentWritableSegment$okio = writableSegment$okio(1);
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
                setSize$okio(size() + ((long) i14));
                i9 = i12;
            } else {
                if (cCharAt < 2048) {
                    Segment segmentWritableSegment$okio2 = writableSegment$okio(2);
                    byte[] bArr2 = segmentWritableSegment$okio2.data;
                    int i15 = segmentWritableSegment$okio2.limit;
                    bArr2[i15] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i15 + 1] = (byte) ((cCharAt & '?') | 128);
                    segmentWritableSegment$okio2.limit = i15 + 2;
                    size = size();
                    j9 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    Segment segmentWritableSegment$okio3 = writableSegment$okio(3);
                    byte[] bArr3 = segmentWritableSegment$okio3.data;
                    int i16 = segmentWritableSegment$okio3.limit;
                    bArr3[i16] = (byte) ((cCharAt >> '\f') | 224);
                    bArr3[i16 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i16 + 2] = (byte) ((cCharAt & '?') | 128);
                    segmentWritableSegment$okio3.limit = i16 + 3;
                    size = size();
                    j9 = 3;
                } else {
                    int i17 = i9 + 1;
                    char cCharAt3 = i17 < i10 ? string.charAt(i17) : (char) 0;
                    if (cCharAt > 56319 || 56320 > cCharAt3 || 57343 < cCharAt3) {
                        writeByte(63);
                        i9 = i17;
                    } else {
                        int i18 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        Segment segmentWritableSegment$okio4 = writableSegment$okio(4);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i19 = segmentWritableSegment$okio4.limit;
                        bArr4[i19] = (byte) ((i18 >> 18) | 240);
                        bArr4[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                        bArr4[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                        bArr4[i19 + 3] = (byte) ((i18 & 63) | 128);
                        segmentWritableSegment$okio4.limit = i19 + 4;
                        setSize$okio(size() + 4);
                        i9 += 2;
                    }
                }
                setSize$okio(size + j9);
                i9++;
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeUtf8CodePoint(int i9) {
        long size;
        long j9;
        if (i9 < 128) {
            writeByte(i9);
        } else {
            if (i9 < 2048) {
                Segment segmentWritableSegment$okio = writableSegment$okio(2);
                byte[] bArr = segmentWritableSegment$okio.data;
                int i10 = segmentWritableSegment$okio.limit;
                bArr[i10] = (byte) ((i9 >> 6) | 192);
                bArr[i10 + 1] = (byte) ((i9 & 63) | 128);
                segmentWritableSegment$okio.limit = i10 + 2;
                size = size();
                j9 = 2;
            } else if (55296 <= i9 && 57343 >= i9) {
                writeByte(63);
            } else if (i9 < 65536) {
                Segment segmentWritableSegment$okio2 = writableSegment$okio(3);
                byte[] bArr2 = segmentWritableSegment$okio2.data;
                int i11 = segmentWritableSegment$okio2.limit;
                bArr2[i11] = (byte) ((i9 >> 12) | 224);
                bArr2[i11 + 1] = (byte) (((i9 >> 6) & 63) | 128);
                bArr2[i11 + 2] = (byte) ((i9 & 63) | 128);
                segmentWritableSegment$okio2.limit = i11 + 3;
                size = size();
                j9 = 3;
            } else {
                if (i9 > 1114111) {
                    throw new IllegalArgumentException("Unexpected code point: 0x" + Util.toHexString(i9));
                }
                Segment segmentWritableSegment$okio3 = writableSegment$okio(4);
                byte[] bArr3 = segmentWritableSegment$okio3.data;
                int i12 = segmentWritableSegment$okio3.limit;
                bArr3[i12] = (byte) ((i9 >> 18) | 240);
                bArr3[i12 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                bArr3[i12 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                bArr3[i12 + 3] = (byte) ((i9 & 63) | 128);
                segmentWritableSegment$okio3.limit = i12 + 4;
                size = size();
                j9 = 4;
            }
            setSize$okio(size + j9);
        }
        return this;
    }
}
