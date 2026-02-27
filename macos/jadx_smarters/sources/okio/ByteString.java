package okio;

import E8.c;
import E8.n;
import com.amazonaws.services.s3.internal.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import l8.AbstractC2212g;
import okio.internal.ByteStringKt;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes4.dex */
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final ByteString EMPTY = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;

    @NotNull
    private final byte[] data;
    private transient int hashCode;

    @Nullable
    private transient String utf8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static /* synthetic */ ByteString encodeString$default(Companion companion, String str, Charset charset, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                charset = c.f1714b;
            }
            return companion.encodeString(str, charset);
        }

        public static /* synthetic */ ByteString of$default(Companion companion, byte[] bArr, int i9, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i9 = 0;
            }
            if ((i11 & 2) != 0) {
                i10 = bArr.length;
            }
            return companion.of(bArr, i9, i10);
        }

        @Nullable
        /* JADX INFO: renamed from: -deprecated_decodeBase64, reason: not valid java name */
        public final ByteString m168deprecated_decodeBase64(@NotNull String string) {
            l.e(string, "string");
            return decodeBase64(string);
        }

        @NotNull
        /* JADX INFO: renamed from: -deprecated_decodeHex, reason: not valid java name */
        public final ByteString m169deprecated_decodeHex(@NotNull String string) {
            l.e(string, "string");
            return decodeHex(string);
        }

        @NotNull
        /* JADX INFO: renamed from: -deprecated_encodeString, reason: not valid java name */
        public final ByteString m170deprecated_encodeString(@NotNull String string, @NotNull Charset charset) {
            l.e(string, "string");
            l.e(charset, "charset");
            return encodeString(string, charset);
        }

        @NotNull
        /* JADX INFO: renamed from: -deprecated_encodeUtf8, reason: not valid java name */
        public final ByteString m171deprecated_encodeUtf8(@NotNull String string) {
            l.e(string, "string");
            return encodeUtf8(string);
        }

        @NotNull
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final ByteString m172deprecated_of(@NotNull ByteBuffer buffer) {
            l.e(buffer, "buffer");
            return of(buffer);
        }

        @NotNull
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final ByteString m173deprecated_of(@NotNull byte[] array, int i9, int i10) {
            l.e(array, "array");
            return of(array, i9, i10);
        }

        @NotNull
        /* JADX INFO: renamed from: -deprecated_read, reason: not valid java name */
        public final ByteString m174deprecated_read(@NotNull InputStream inputstream, int i9) {
            l.e(inputstream, "inputstream");
            return read(inputstream, i9);
        }

        @Nullable
        public final ByteString decodeBase64(@NotNull String decodeBase64) {
            l.e(decodeBase64, "$this$decodeBase64");
            byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(decodeBase64);
            if (bArrDecodeBase64ToArray != null) {
                return new ByteString(bArrDecodeBase64ToArray);
            }
            return null;
        }

        @NotNull
        public final ByteString decodeHex(@NotNull String decodeHex) {
            l.e(decodeHex, "$this$decodeHex");
            if (!(decodeHex.length() % 2 == 0)) {
                throw new IllegalArgumentException(("Unexpected hex string: " + decodeHex).toString());
            }
            int length = decodeHex.length() / 2;
            byte[] bArr = new byte[length];
            for (int i9 = 0; i9 < length; i9++) {
                int i10 = i9 * 2;
                bArr[i9] = (byte) ((ByteStringKt.decodeHexDigit(decodeHex.charAt(i10)) << 4) + ByteStringKt.decodeHexDigit(decodeHex.charAt(i10 + 1)));
            }
            return new ByteString(bArr);
        }

        @NotNull
        public final ByteString encodeString(@NotNull String encode, @NotNull Charset charset) {
            l.e(encode, "$this$encode");
            l.e(charset, "charset");
            byte[] bytes = encode.getBytes(charset);
            l.d(bytes, "(this as java.lang.String).getBytes(charset)");
            return new ByteString(bytes);
        }

        @NotNull
        public final ByteString encodeUtf8(@NotNull String encodeUtf8) {
            l.e(encodeUtf8, "$this$encodeUtf8");
            ByteString byteString = new ByteString(Platform.asUtf8ToByteArray(encodeUtf8));
            byteString.setUtf8$okio(encodeUtf8);
            return byteString;
        }

        @NotNull
        public final ByteString of(@NotNull ByteBuffer toByteString) {
            l.e(toByteString, "$this$toByteString");
            byte[] bArr = new byte[toByteString.remaining()];
            toByteString.get(bArr);
            return new ByteString(bArr);
        }

        @NotNull
        public final ByteString of(@NotNull byte... data) {
            l.e(data, "data");
            byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
            l.d(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
            return new ByteString(bArrCopyOf);
        }

        @NotNull
        public final ByteString of(@NotNull byte[] toByteString, int i9, int i10) {
            l.e(toByteString, "$this$toByteString");
            Util.checkOffsetAndCount(toByteString.length, i9, i10);
            return new ByteString(AbstractC2212g.g(toByteString, i9, i10 + i9));
        }

        @NotNull
        public final ByteString read(@NotNull InputStream readByteString, int i9) throws IOException {
            l.e(readByteString, "$this$readByteString");
            int i10 = 0;
            if (!(i9 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + i9).toString());
            }
            byte[] bArr = new byte[i9];
            while (i10 < i9) {
                int i11 = readByteString.read(bArr, i10, i9 - i10);
                if (i11 == -1) {
                    throw new EOFException();
                }
                i10 += i11;
            }
            return new ByteString(bArr);
        }
    }

    public ByteString(@NotNull byte[] data) {
        l.e(data, "data");
        this.data = data;
    }

    @Nullable
    public static final ByteString decodeBase64(@NotNull String str) {
        return Companion.decodeBase64(str);
    }

    @NotNull
    public static final ByteString decodeHex(@NotNull String str) {
        return Companion.decodeHex(str);
    }

    @NotNull
    public static final ByteString encodeString(@NotNull String str, @NotNull Charset charset) {
        return Companion.encodeString(str, charset);
    }

    @NotNull
    public static final ByteString encodeUtf8(@NotNull String str) {
        return Companion.encodeUtf8(str);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, ByteString byteString2, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        return byteString.indexOf(byteString2, i9);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, byte[] bArr, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        return byteString.indexOf(bArr, i9);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, ByteString byteString2, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i10 & 2) != 0) {
            i9 = byteString.size();
        }
        return byteString.lastIndexOf(byteString2, i9);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, byte[] bArr, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i10 & 2) != 0) {
            i9 = byteString.size();
        }
        return byteString.lastIndexOf(bArr, i9);
    }

    @NotNull
    public static final ByteString of(@NotNull ByteBuffer byteBuffer) {
        return Companion.of(byteBuffer);
    }

    @NotNull
    public static final ByteString of(@NotNull byte... bArr) {
        return Companion.of(bArr);
    }

    @NotNull
    public static final ByteString of(@NotNull byte[] bArr, int i9, int i10) {
        return Companion.of(bArr, i9, i10);
    }

    @NotNull
    public static final ByteString read(@NotNull InputStream inputStream, int i9) throws IOException {
        return Companion.read(inputStream, i9);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        ByteString byteString = Companion.read(objectInputStream, objectInputStream.readInt());
        Field field = ByteString.class.getDeclaredField("data");
        l.d(field, "field");
        field.setAccessible(true);
        field.set(this, byteString.data);
    }

    public static /* synthetic */ ByteString substring$default(ByteString byteString, int i9, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = byteString.size();
        }
        return byteString.substring(i9, i10);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    /* JADX INFO: renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m166deprecated_getByte(int i9) {
        return getByte(i9);
    }

    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m167deprecated_size() {
        return size();
    }

    @NotNull
    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        l.d(byteBufferAsReadOnlyBuffer, "ByteBuffer.wrap(data).asReadOnlyBuffer()");
        return byteBufferAsReadOnlyBuffer;
    }

    @NotNull
    public String base64() {
        return Base64.encodeBase64$default(getData$okio(), null, 1, null);
    }

    @NotNull
    public String base64Url() {
        return Base64.encodeBase64(getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(@org.jetbrains.annotations.NotNull okio.ByteString r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.l.e(r10, r0)
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.getByte(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.getByte(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = -1
            goto L34
        L2c:
            r3 = 1
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(okio.ByteString):int");
    }

    @NotNull
    public ByteString digest$okio(@NotNull String algorithm) {
        l.e(algorithm, "algorithm");
        byte[] bArrDigest = MessageDigest.getInstance(algorithm).digest(this.data);
        l.d(bArrDigest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new ByteString(bArrDigest);
    }

    public final boolean endsWith(@NotNull ByteString suffix) {
        l.e(suffix, "suffix");
        return rangeEquals(size() - suffix.size(), suffix, 0, suffix.size());
    }

    public final boolean endsWith(@NotNull byte[] suffix) {
        l.e(suffix, "suffix");
        return rangeEquals(size() - suffix.length, suffix, 0, suffix.length);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == getData$okio().length && byteString.rangeEquals(0, getData$okio(), 0, getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public final byte getByte(int i9) {
        return internalGet$okio(i9);
    }

    @NotNull
    public final byte[] getData$okio() {
        return this.data;
    }

    public final int getHashCode$okio() {
        return this.hashCode;
    }

    public int getSize$okio() {
        return getData$okio().length;
    }

    @Nullable
    public final String getUtf8$okio() {
        return this.utf8;
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int iHashCode = Arrays.hashCode(getData$okio());
        setHashCode$okio(iHashCode);
        return iHashCode;
    }

    @NotNull
    public String hex() {
        char[] cArr = new char[getData$okio().length * 2];
        int i9 = 0;
        for (byte b9 : getData$okio()) {
            int i10 = i9 + 1;
            cArr[i9] = ByteStringKt.getHEX_DIGIT_CHARS()[(b9 >> 4) & 15];
            i9 += 2;
            cArr[i10] = ByteStringKt.getHEX_DIGIT_CHARS()[b9 & 15];
        }
        return new String(cArr);
    }

    @NotNull
    public ByteString hmac$okio(@NotNull String algorithm, @NotNull ByteString key) throws NoSuchAlgorithmException {
        l.e(algorithm, "algorithm");
        l.e(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            byte[] bArrDoFinal = mac.doFinal(this.data);
            l.d(bArrDoFinal, "mac.doFinal(data)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    @NotNull
    public ByteString hmacSha1(@NotNull ByteString key) {
        l.e(key, "key");
        return hmac$okio(Constants.HMAC_SHA1_ALGORITHM, key);
    }

    @NotNull
    public ByteString hmacSha256(@NotNull ByteString key) {
        l.e(key, "key");
        return hmac$okio("HmacSHA256", key);
    }

    @NotNull
    public ByteString hmacSha512(@NotNull ByteString key) {
        l.e(key, "key");
        return hmac$okio("HmacSHA512", key);
    }

    public final int indexOf(@NotNull ByteString byteString) {
        return indexOf$default(this, byteString, 0, 2, (Object) null);
    }

    public final int indexOf(@NotNull ByteString other, int i9) {
        l.e(other, "other");
        return indexOf(other.internalArray$okio(), i9);
    }

    public final int indexOf(@NotNull byte[] bArr) {
        return indexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public int indexOf(@NotNull byte[] other, int i9) {
        l.e(other, "other");
        int length = getData$okio().length - other.length;
        int iMax = Math.max(i9, 0);
        if (iMax <= length) {
            while (!Util.arrayRangeEquals(getData$okio(), iMax, other, 0, other.length)) {
                if (iMax != length) {
                    iMax++;
                }
            }
            return iMax;
        }
        return -1;
    }

    @NotNull
    public byte[] internalArray$okio() {
        return getData$okio();
    }

    public byte internalGet$okio(int i9) {
        return getData$okio()[i9];
    }

    public final int lastIndexOf(@NotNull ByteString byteString) {
        return lastIndexOf$default(this, byteString, 0, 2, (Object) null);
    }

    public final int lastIndexOf(@NotNull ByteString other, int i9) {
        l.e(other, "other");
        return lastIndexOf(other.internalArray$okio(), i9);
    }

    public final int lastIndexOf(@NotNull byte[] bArr) {
        return lastIndexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public int lastIndexOf(@NotNull byte[] other, int i9) {
        l.e(other, "other");
        for (int iMin = Math.min(i9, getData$okio().length - other.length); iMin >= 0; iMin--) {
            if (Util.arrayRangeEquals(getData$okio(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    @NotNull
    public ByteString md5() {
        return digest$okio(MessageDigestAlgorithms.MD5);
    }

    public boolean rangeEquals(int i9, @NotNull ByteString other, int i10, int i11) {
        l.e(other, "other");
        return other.rangeEquals(i10, getData$okio(), i9, i11);
    }

    public boolean rangeEquals(int i9, @NotNull byte[] other, int i10, int i11) {
        l.e(other, "other");
        return i9 >= 0 && i9 <= getData$okio().length - i11 && i10 >= 0 && i10 <= other.length - i11 && Util.arrayRangeEquals(getData$okio(), i9, other, i10, i11);
    }

    public final void setHashCode$okio(int i9) {
        this.hashCode = i9;
    }

    public final void setUtf8$okio(@Nullable String str) {
        this.utf8 = str;
    }

    @NotNull
    public ByteString sha1() {
        return digest$okio(MessageDigestAlgorithms.SHA_1);
    }

    @NotNull
    public ByteString sha256() {
        return digest$okio(MessageDigestAlgorithms.SHA_256);
    }

    @NotNull
    public ByteString sha512() {
        return digest$okio(MessageDigestAlgorithms.SHA_512);
    }

    public final int size() {
        return getSize$okio();
    }

    public final boolean startsWith(@NotNull ByteString prefix) {
        l.e(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.size());
    }

    public final boolean startsWith(@NotNull byte[] prefix) {
        l.e(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.length);
    }

    @NotNull
    public String string(@NotNull Charset charset) {
        l.e(charset, "charset");
        return new String(this.data, charset);
    }

    @NotNull
    public final ByteString substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    @NotNull
    public final ByteString substring(int i9) {
        return substring$default(this, i9, 0, 2, null);
    }

    @NotNull
    public ByteString substring(int i9, int i10) {
        if (!(i9 >= 0)) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        if (i10 <= getData$okio().length) {
            if (i10 - i9 >= 0) {
                return (i9 == 0 && i10 == getData$okio().length) ? this : new ByteString(AbstractC2212g.g(getData$okio(), i9, i10));
            }
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
    }

    @NotNull
    public ByteString toAsciiLowercase() {
        byte b9;
        for (int i9 = 0; i9 < getData$okio().length; i9++) {
            byte b10 = getData$okio()[i9];
            byte b11 = (byte) 65;
            if (b10 >= b11 && b10 <= (b9 = (byte) 90)) {
                byte[] data$okio = getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                l.d(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
                bArrCopyOf[i9] = (byte) (b10 + 32);
                for (int i10 = i9 + 1; i10 < bArrCopyOf.length; i10++) {
                    byte b12 = bArrCopyOf[i10];
                    if (b12 >= b11 && b12 <= b9) {
                        bArrCopyOf[i10] = (byte) (b12 + 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return this;
    }

    @NotNull
    public ByteString toAsciiUppercase() {
        byte b9;
        for (int i9 = 0; i9 < getData$okio().length; i9++) {
            byte b10 = getData$okio()[i9];
            byte b11 = (byte) 97;
            if (b10 >= b11 && b10 <= (b9 = (byte) IjkMediaMeta.FF_PROFILE_H264_HIGH_422)) {
                byte[] data$okio = getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                l.d(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
                bArrCopyOf[i9] = (byte) (b10 - 32);
                for (int i10 = i9 + 1; i10 < bArrCopyOf.length; i10++) {
                    byte b12 = bArrCopyOf[i10];
                    if (b12 >= b11 && b12 <= b9) {
                        bArrCopyOf[i10] = (byte) (b12 - 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return this;
    }

    @NotNull
    public byte[] toByteArray() {
        byte[] data$okio = getData$okio();
        byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
        l.d(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
        return bArrCopyOf;
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        if (getData$okio().length == 0) {
            return "[size=0]";
        }
        int iCodePointIndexToCharIndex = ByteStringKt.codePointIndexToCharIndex(getData$okio(), 64);
        if (iCodePointIndexToCharIndex != -1) {
            String strUtf8 = utf8();
            if (strUtf8 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String strSubstring = strUtf8.substring(0, iCodePointIndexToCharIndex);
            l.d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String strX = n.x(n.x(n.x(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iCodePointIndexToCharIndex < strUtf8.length()) {
                sb = new StringBuilder();
                sb.append("[size=");
                sb.append(getData$okio().length);
                sb.append(" text=");
                sb.append(strX);
                sb.append("…]");
            } else {
                sb = new StringBuilder();
                sb.append("[text=");
                sb.append(strX);
                sb.append(']');
            }
        } else if (getData$okio().length <= 64) {
            sb = new StringBuilder();
            sb.append("[hex=");
            sb.append(hex());
            sb.append(']');
        } else {
            sb = new StringBuilder();
            sb.append("[size=");
            sb.append(getData$okio().length);
            sb.append(" hex=");
            if (!(64 <= getData$okio().length)) {
                throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
            }
            sb.append((64 == getData$okio().length ? this : new ByteString(AbstractC2212g.g(getData$okio(), 0, 64))).hex());
            sb.append("…]");
        }
        return sb.toString();
    }

    @NotNull
    public String utf8() {
        String utf8$okio = getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = Platform.toUtf8String(internalArray$okio());
        setUtf8$okio(utf8String);
        return utf8String;
    }

    public void write(@NotNull OutputStream out) throws IOException {
        l.e(out, "out");
        out.write(this.data);
    }

    public void write$okio(@NotNull Buffer buffer, int i9, int i10) {
        l.e(buffer, "buffer");
        ByteStringKt.commonWrite(this, buffer, i9, i10);
    }
}
