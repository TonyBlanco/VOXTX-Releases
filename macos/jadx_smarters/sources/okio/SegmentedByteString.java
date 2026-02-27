package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.l;
import l8.AbstractC2212g;
import okio.internal.SegmentedByteStringKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class SegmentedByteString extends ByteString {

    @NotNull
    private final transient int[] directory;

    @NotNull
    private final transient byte[][] segments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedByteString(@NotNull byte[][] segments, @NotNull int[] directory) {
        super(ByteString.EMPTY.getData$okio());
        l.e(segments, "segments");
        l.e(directory, "directory");
        this.segments = segments;
        this.directory = directory;
    }

    private final ByteString toByteString() {
        return new ByteString(toByteArray());
    }

    private final Object writeReplace() {
        ByteString byteString = toByteString();
        if (byteString != null) {
            return byteString;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
    }

    @Override // okio.ByteString
    @NotNull
    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        l.d(byteBufferAsReadOnlyBuffer, "ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer()");
        return byteBufferAsReadOnlyBuffer;
    }

    @Override // okio.ByteString
    @NotNull
    public String base64() {
        return toByteString().base64();
    }

    @Override // okio.ByteString
    @NotNull
    public String base64Url() {
        return toByteString().base64Url();
    }

    @Override // okio.ByteString
    @NotNull
    public ByteString digest$okio(@NotNull String algorithm) throws NoSuchAlgorithmException {
        l.e(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = getSegments$okio().length;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int i11 = getDirectory$okio()[length + i9];
            int i12 = getDirectory$okio()[i9];
            messageDigest.update(getSegments$okio()[i9], i11, i12 - i10);
            i9++;
            i10 = i12;
        }
        byte[] bArrDigest = messageDigest.digest();
        l.d(bArrDigest, "digest.digest()");
        return new ByteString(bArrDigest);
    }

    @Override // okio.ByteString
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final int[] getDirectory$okio() {
        return this.directory;
    }

    @NotNull
    public final byte[][] getSegments$okio() {
        return this.segments;
    }

    @Override // okio.ByteString
    public int getSize$okio() {
        return getDirectory$okio()[getSegments$okio().length - 1];
    }

    @Override // okio.ByteString
    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = getSegments$okio().length;
        int i9 = 0;
        int i10 = 1;
        int i11 = 0;
        while (i9 < length) {
            int i12 = getDirectory$okio()[length + i9];
            int i13 = getDirectory$okio()[i9];
            byte[] bArr = getSegments$okio()[i9];
            int i14 = (i13 - i11) + i12;
            while (i12 < i14) {
                i10 = (i10 * 31) + bArr[i12];
                i12++;
            }
            i9++;
            i11 = i13;
        }
        setHashCode$okio(i10);
        return i10;
    }

    @Override // okio.ByteString
    @NotNull
    public String hex() {
        return toByteString().hex();
    }

    @Override // okio.ByteString
    @NotNull
    public ByteString hmac$okio(@NotNull String algorithm, @NotNull ByteString key) throws NoSuchAlgorithmException {
        l.e(algorithm, "algorithm");
        l.e(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            int length = getSegments$okio().length;
            int i9 = 0;
            int i10 = 0;
            while (i9 < length) {
                int i11 = getDirectory$okio()[length + i9];
                int i12 = getDirectory$okio()[i9];
                mac.update(getSegments$okio()[i9], i11, i12 - i10);
                i9++;
                i10 = i12;
            }
            byte[] bArrDoFinal = mac.doFinal();
            l.d(bArrDoFinal, "mac.doFinal()");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    @Override // okio.ByteString
    public int indexOf(@NotNull byte[] other, int i9) {
        l.e(other, "other");
        return toByteString().indexOf(other, i9);
    }

    @Override // okio.ByteString
    @NotNull
    public byte[] internalArray$okio() {
        return toByteArray();
    }

    @Override // okio.ByteString
    public byte internalGet$okio(int i9) {
        Util.checkOffsetAndCount(getDirectory$okio()[getSegments$okio().length - 1], i9, 1L);
        int iSegment = SegmentedByteStringKt.segment(this, i9);
        return getSegments$okio()[iSegment][(i9 - (iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1])) + getDirectory$okio()[getSegments$okio().length + iSegment]];
    }

    @Override // okio.ByteString
    public int lastIndexOf(@NotNull byte[] other, int i9) {
        l.e(other, "other");
        return toByteString().lastIndexOf(other, i9);
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i9, @NotNull ByteString other, int i10, int i11) {
        l.e(other, "other");
        if (i9 < 0 || i9 > size() - i11) {
            return false;
        }
        int i12 = i11 + i9;
        int iSegment = SegmentedByteStringKt.segment(this, i9);
        while (i9 < i12) {
            int i13 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i14 = getDirectory$okio()[iSegment] - i13;
            int i15 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i9;
            if (!other.rangeEquals(i10, getSegments$okio()[iSegment], i15 + (i9 - i13), iMin)) {
                return false;
            }
            i10 += iMin;
            i9 += iMin;
            iSegment++;
        }
        return true;
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i9, @NotNull byte[] other, int i10, int i11) {
        l.e(other, "other");
        if (i9 < 0 || i9 > size() - i11 || i10 < 0 || i10 > other.length - i11) {
            return false;
        }
        int i12 = i11 + i9;
        int iSegment = SegmentedByteStringKt.segment(this, i9);
        while (i9 < i12) {
            int i13 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i14 = getDirectory$okio()[iSegment] - i13;
            int i15 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i9;
            if (!Util.arrayRangeEquals(getSegments$okio()[iSegment], i15 + (i9 - i13), other, i10, iMin)) {
                return false;
            }
            i10 += iMin;
            i9 += iMin;
            iSegment++;
        }
        return true;
    }

    @Override // okio.ByteString
    @NotNull
    public String string(@NotNull Charset charset) {
        l.e(charset, "charset");
        return toByteString().string(charset);
    }

    @Override // okio.ByteString
    @NotNull
    public ByteString substring(int i9, int i10) {
        if (!(i9 >= 0)) {
            throw new IllegalArgumentException(("beginIndex=" + i9 + " < 0").toString());
        }
        if (!(i10 <= size())) {
            throw new IllegalArgumentException(("endIndex=" + i10 + " > length(" + size() + ')').toString());
        }
        int i11 = i10 - i9;
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException(("endIndex=" + i10 + " < beginIndex=" + i9).toString());
        }
        if (i9 == 0 && i10 == size()) {
            return this;
        }
        if (i9 == i10) {
            return ByteString.EMPTY;
        }
        int iSegment = SegmentedByteStringKt.segment(this, i9);
        int iSegment2 = SegmentedByteStringKt.segment(this, i10 - 1);
        byte[][] bArr = (byte[][]) AbstractC2212g.h(getSegments$okio(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i12 = iSegment;
            int i13 = 0;
            while (true) {
                iArr[i13] = Math.min(getDirectory$okio()[i12] - i9, i11);
                int i14 = i13 + 1;
                iArr[i13 + bArr.length] = getDirectory$okio()[getSegments$okio().length + i12];
                if (i12 == iSegment2) {
                    break;
                }
                i12++;
                i13 = i14;
            }
        }
        int i15 = iSegment != 0 ? getDirectory$okio()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i9 - i15);
        return new SegmentedByteString(bArr, iArr);
    }

    @Override // okio.ByteString
    @NotNull
    public ByteString toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    @Override // okio.ByteString
    @NotNull
    public ByteString toAsciiUppercase() {
        return toByteString().toAsciiUppercase();
    }

    @Override // okio.ByteString
    @NotNull
    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments$okio().length;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < length) {
            int i12 = getDirectory$okio()[length + i9];
            int i13 = getDirectory$okio()[i9];
            int i14 = i13 - i10;
            AbstractC2212g.c(getSegments$okio()[i9], bArr, i11, i12, i12 + i14);
            i11 += i14;
            i9++;
            i10 = i13;
        }
        return bArr;
    }

    @Override // okio.ByteString
    @NotNull
    public String toString() {
        return toByteString().toString();
    }

    @Override // okio.ByteString
    public void write(@NotNull OutputStream out) throws IOException {
        l.e(out, "out");
        int length = getSegments$okio().length;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int i11 = getDirectory$okio()[length + i9];
            int i12 = getDirectory$okio()[i9];
            out.write(getSegments$okio()[i9], i11, i12 - i10);
            i9++;
            i10 = i12;
        }
    }

    @Override // okio.ByteString
    public void write$okio(@NotNull Buffer buffer, int i9, int i10) {
        l.e(buffer, "buffer");
        int i11 = i10 + i9;
        int iSegment = SegmentedByteStringKt.segment(this, i9);
        while (i9 < i11) {
            int i12 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i13 = getDirectory$okio()[iSegment] - i12;
            int i14 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i11, i13 + i12) - i9;
            int i15 = i14 + (i9 - i12);
            Segment segment = new Segment(getSegments$okio()[iSegment], i15, i15 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                l.b(segment2);
                Segment segment3 = segment2.prev;
                l.b(segment3);
                segment3.push(segment);
            }
            i9 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + ((long) size()));
    }
}
