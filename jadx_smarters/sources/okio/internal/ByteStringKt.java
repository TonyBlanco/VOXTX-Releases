package okio.internal;

import E8.n;
import java.util.Arrays;
import kotlin.jvm.internal.l;
import l8.AbstractC2212g;
import okio.Base64;
import okio.Buffer;
import okio.ByteString;
import okio.Platform;
import okio.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes4.dex */
public final class ByteStringKt {

    @NotNull
    private static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int codePointIndexToCharIndex(byte[] r18, int r19) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.ByteStringKt.codePointIndexToCharIndex(byte[], int):int");
    }

    @NotNull
    public static final String commonBase64(@NotNull ByteString commonBase64) {
        l.e(commonBase64, "$this$commonBase64");
        return Base64.encodeBase64$default(commonBase64.getData$okio(), null, 1, null);
    }

    @NotNull
    public static final String commonBase64Url(@NotNull ByteString commonBase64Url) {
        l.e(commonBase64Url, "$this$commonBase64Url");
        return Base64.encodeBase64(commonBase64Url.getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    public static final int commonCompareTo(@NotNull ByteString commonCompareTo, @NotNull ByteString other) {
        l.e(commonCompareTo, "$this$commonCompareTo");
        l.e(other, "other");
        int size = commonCompareTo.size();
        int size2 = other.size();
        int iMin = Math.min(size, size2);
        for (int i9 = 0; i9 < iMin; i9++) {
            int i10 = commonCompareTo.getByte(i9) & 255;
            int i11 = other.getByte(i9) & 255;
            if (i10 != i11) {
                return i10 < i11 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    @Nullable
    public static final ByteString commonDecodeBase64(@NotNull String commonDecodeBase64) {
        l.e(commonDecodeBase64, "$this$commonDecodeBase64");
        byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(commonDecodeBase64);
        if (bArrDecodeBase64ToArray != null) {
            return new ByteString(bArrDecodeBase64ToArray);
        }
        return null;
    }

    @NotNull
    public static final ByteString commonDecodeHex(@NotNull String commonDecodeHex) {
        l.e(commonDecodeHex, "$this$commonDecodeHex");
        if (!(commonDecodeHex.length() % 2 == 0)) {
            throw new IllegalArgumentException(("Unexpected hex string: " + commonDecodeHex).toString());
        }
        int length = commonDecodeHex.length() / 2;
        byte[] bArr = new byte[length];
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = i9 * 2;
            bArr[i9] = (byte) ((decodeHexDigit(commonDecodeHex.charAt(i10)) << 4) + decodeHexDigit(commonDecodeHex.charAt(i10 + 1)));
        }
        return new ByteString(bArr);
    }

    @NotNull
    public static final ByteString commonEncodeUtf8(@NotNull String commonEncodeUtf8) {
        l.e(commonEncodeUtf8, "$this$commonEncodeUtf8");
        ByteString byteString = new ByteString(Platform.asUtf8ToByteArray(commonEncodeUtf8));
        byteString.setUtf8$okio(commonEncodeUtf8);
        return byteString;
    }

    public static final boolean commonEndsWith(@NotNull ByteString commonEndsWith, @NotNull ByteString suffix) {
        l.e(commonEndsWith, "$this$commonEndsWith");
        l.e(suffix, "suffix");
        return commonEndsWith.rangeEquals(commonEndsWith.size() - suffix.size(), suffix, 0, suffix.size());
    }

    public static final boolean commonEndsWith(@NotNull ByteString commonEndsWith, @NotNull byte[] suffix) {
        l.e(commonEndsWith, "$this$commonEndsWith");
        l.e(suffix, "suffix");
        return commonEndsWith.rangeEquals(commonEndsWith.size() - suffix.length, suffix, 0, suffix.length);
    }

    public static final boolean commonEquals(@NotNull ByteString commonEquals, @Nullable Object obj) {
        l.e(commonEquals, "$this$commonEquals");
        if (obj == commonEquals) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == commonEquals.getData$okio().length && byteString.rangeEquals(0, commonEquals.getData$okio(), 0, commonEquals.getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte commonGetByte(@NotNull ByteString commonGetByte, int i9) {
        l.e(commonGetByte, "$this$commonGetByte");
        return commonGetByte.getData$okio()[i9];
    }

    public static final int commonGetSize(@NotNull ByteString commonGetSize) {
        l.e(commonGetSize, "$this$commonGetSize");
        return commonGetSize.getData$okio().length;
    }

    public static final int commonHashCode(@NotNull ByteString commonHashCode) {
        l.e(commonHashCode, "$this$commonHashCode");
        int hashCode$okio = commonHashCode.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int iHashCode = Arrays.hashCode(commonHashCode.getData$okio());
        commonHashCode.setHashCode$okio(iHashCode);
        return iHashCode;
    }

    @NotNull
    public static final String commonHex(@NotNull ByteString commonHex) {
        l.e(commonHex, "$this$commonHex");
        char[] cArr = new char[commonHex.getData$okio().length * 2];
        int i9 = 0;
        for (byte b9 : commonHex.getData$okio()) {
            int i10 = i9 + 1;
            cArr[i9] = getHEX_DIGIT_CHARS()[(b9 >> 4) & 15];
            i9 += 2;
            cArr[i10] = getHEX_DIGIT_CHARS()[b9 & 15];
        }
        return new String(cArr);
    }

    public static final int commonIndexOf(@NotNull ByteString commonIndexOf, @NotNull byte[] other, int i9) {
        l.e(commonIndexOf, "$this$commonIndexOf");
        l.e(other, "other");
        int length = commonIndexOf.getData$okio().length - other.length;
        int iMax = Math.max(i9, 0);
        if (iMax > length) {
            return -1;
        }
        while (!Util.arrayRangeEquals(commonIndexOf.getData$okio(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    @NotNull
    public static final byte[] commonInternalArray(@NotNull ByteString commonInternalArray) {
        l.e(commonInternalArray, "$this$commonInternalArray");
        return commonInternalArray.getData$okio();
    }

    public static final int commonLastIndexOf(@NotNull ByteString commonLastIndexOf, @NotNull ByteString other, int i9) {
        l.e(commonLastIndexOf, "$this$commonLastIndexOf");
        l.e(other, "other");
        return commonLastIndexOf.lastIndexOf(other.internalArray$okio(), i9);
    }

    public static final int commonLastIndexOf(@NotNull ByteString commonLastIndexOf, @NotNull byte[] other, int i9) {
        l.e(commonLastIndexOf, "$this$commonLastIndexOf");
        l.e(other, "other");
        for (int iMin = Math.min(i9, commonLastIndexOf.getData$okio().length - other.length); iMin >= 0; iMin--) {
            if (Util.arrayRangeEquals(commonLastIndexOf.getData$okio(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    @NotNull
    public static final ByteString commonOf(@NotNull byte[] data) {
        l.e(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        l.d(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
        return new ByteString(bArrCopyOf);
    }

    public static final boolean commonRangeEquals(@NotNull ByteString commonRangeEquals, int i9, @NotNull ByteString other, int i10, int i11) {
        l.e(commonRangeEquals, "$this$commonRangeEquals");
        l.e(other, "other");
        return other.rangeEquals(i10, commonRangeEquals.getData$okio(), i9, i11);
    }

    public static final boolean commonRangeEquals(@NotNull ByteString commonRangeEquals, int i9, @NotNull byte[] other, int i10, int i11) {
        l.e(commonRangeEquals, "$this$commonRangeEquals");
        l.e(other, "other");
        return i9 >= 0 && i9 <= commonRangeEquals.getData$okio().length - i11 && i10 >= 0 && i10 <= other.length - i11 && Util.arrayRangeEquals(commonRangeEquals.getData$okio(), i9, other, i10, i11);
    }

    public static final boolean commonStartsWith(@NotNull ByteString commonStartsWith, @NotNull ByteString prefix) {
        l.e(commonStartsWith, "$this$commonStartsWith");
        l.e(prefix, "prefix");
        return commonStartsWith.rangeEquals(0, prefix, 0, prefix.size());
    }

    public static final boolean commonStartsWith(@NotNull ByteString commonStartsWith, @NotNull byte[] prefix) {
        l.e(commonStartsWith, "$this$commonStartsWith");
        l.e(prefix, "prefix");
        return commonStartsWith.rangeEquals(0, prefix, 0, prefix.length);
    }

    @NotNull
    public static final ByteString commonSubstring(@NotNull ByteString commonSubstring, int i9, int i10) {
        l.e(commonSubstring, "$this$commonSubstring");
        if (!(i9 >= 0)) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        if (i10 <= commonSubstring.getData$okio().length) {
            if (i10 - i9 >= 0) {
                return (i9 == 0 && i10 == commonSubstring.getData$okio().length) ? commonSubstring : new ByteString(AbstractC2212g.g(commonSubstring.getData$okio(), i9, i10));
            }
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        throw new IllegalArgumentException(("endIndex > length(" + commonSubstring.getData$okio().length + ')').toString());
    }

    @NotNull
    public static final ByteString commonToAsciiLowercase(@NotNull ByteString commonToAsciiLowercase) {
        byte b9;
        l.e(commonToAsciiLowercase, "$this$commonToAsciiLowercase");
        for (int i9 = 0; i9 < commonToAsciiLowercase.getData$okio().length; i9++) {
            byte b10 = commonToAsciiLowercase.getData$okio()[i9];
            byte b11 = (byte) 65;
            if (b10 >= b11 && b10 <= (b9 = (byte) 90)) {
                byte[] data$okio = commonToAsciiLowercase.getData$okio();
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
        return commonToAsciiLowercase;
    }

    @NotNull
    public static final ByteString commonToAsciiUppercase(@NotNull ByteString commonToAsciiUppercase) {
        byte b9;
        l.e(commonToAsciiUppercase, "$this$commonToAsciiUppercase");
        for (int i9 = 0; i9 < commonToAsciiUppercase.getData$okio().length; i9++) {
            byte b10 = commonToAsciiUppercase.getData$okio()[i9];
            byte b11 = (byte) 97;
            if (b10 >= b11 && b10 <= (b9 = (byte) IjkMediaMeta.FF_PROFILE_H264_HIGH_422)) {
                byte[] data$okio = commonToAsciiUppercase.getData$okio();
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
        return commonToAsciiUppercase;
    }

    @NotNull
    public static final byte[] commonToByteArray(@NotNull ByteString commonToByteArray) {
        l.e(commonToByteArray, "$this$commonToByteArray");
        byte[] data$okio = commonToByteArray.getData$okio();
        byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
        l.d(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
        return bArrCopyOf;
    }

    @NotNull
    public static final ByteString commonToByteString(@NotNull byte[] commonToByteString, int i9, int i10) {
        l.e(commonToByteString, "$this$commonToByteString");
        Util.checkOffsetAndCount(commonToByteString.length, i9, i10);
        return new ByteString(AbstractC2212g.g(commonToByteString, i9, i10 + i9));
    }

    @NotNull
    public static final String commonToString(@NotNull ByteString byteString) {
        StringBuilder sb;
        StringBuilder sb2;
        ByteString commonToString = byteString;
        l.e(commonToString, "$this$commonToString");
        if (byteString.getData$okio().length == 0) {
            return "[size=0]";
        }
        int iCodePointIndexToCharIndex = codePointIndexToCharIndex(byteString.getData$okio(), 64);
        if (iCodePointIndexToCharIndex != -1) {
            String strUtf8 = byteString.utf8();
            if (strUtf8 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String strSubstring = strUtf8.substring(0, iCodePointIndexToCharIndex);
            l.d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String strX = n.x(n.x(n.x(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iCodePointIndexToCharIndex < strUtf8.length()) {
                sb = new StringBuilder();
                sb.append("[size=");
                sb.append(byteString.getData$okio().length);
                sb.append(" text=");
                sb.append(strX);
                sb.append("…]");
            } else {
                sb = new StringBuilder();
                sb.append("[text=");
                sb.append(strX);
                sb.append(']');
            }
            return sb.toString();
        }
        if (byteString.getData$okio().length <= 64) {
            sb2 = new StringBuilder();
            sb2.append("[hex=");
            sb2.append(byteString.hex());
            sb2.append(']');
        } else {
            sb2 = new StringBuilder();
            sb2.append("[size=");
            sb2.append(byteString.getData$okio().length);
            sb2.append(" hex=");
            if (!(64 <= byteString.getData$okio().length)) {
                throw new IllegalArgumentException(("endIndex > length(" + byteString.getData$okio().length + ')').toString());
            }
            if (64 != byteString.getData$okio().length) {
                commonToString = new ByteString(AbstractC2212g.g(byteString.getData$okio(), 0, 64));
            }
            sb2.append(commonToString.hex());
            sb2.append("…]");
        }
        return sb2.toString();
    }

    @NotNull
    public static final String commonUtf8(@NotNull ByteString commonUtf8) {
        l.e(commonUtf8, "$this$commonUtf8");
        String utf8$okio = commonUtf8.getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = Platform.toUtf8String(commonUtf8.internalArray$okio());
        commonUtf8.setUtf8$okio(utf8String);
        return utf8String;
    }

    public static final void commonWrite(@NotNull ByteString commonWrite, @NotNull Buffer buffer, int i9, int i10) {
        l.e(commonWrite, "$this$commonWrite");
        l.e(buffer, "buffer");
        buffer.write(commonWrite.getData$okio(), i9, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int decodeHexDigit(char c9) {
        if ('0' <= c9 && '9' >= c9) {
            return c9 - '0';
        }
        if ('a' <= c9 && 'f' >= c9) {
            return c9 - 'W';
        }
        if ('A' <= c9 && 'F' >= c9) {
            return c9 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c9);
    }

    @NotNull
    public static final char[] getHEX_DIGIT_CHARS() {
        return HEX_DIGIT_CHARS;
    }
}
