package okio;

import java.util.Arrays;
import kotlin.jvm.internal.l;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: okio.-Base64, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class Base64 {

    @NotNull
    private static final byte[] BASE64;

    @NotNull
    private static final byte[] BASE64_URL_SAFE;

    static {
        ByteString.Companion companion = ByteString.Companion;
        BASE64 = companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$okio();
        BASE64_URL_SAFE = companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$okio();
    }

    @Nullable
    public static final byte[] decodeBase64ToArray(@NotNull String decodeBase64ToArray) {
        int i9;
        char cCharAt;
        l.e(decodeBase64ToArray, "$this$decodeBase64ToArray");
        int length = decodeBase64ToArray.length();
        while (length > 0 && ((cCharAt = decodeBase64ToArray.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i10 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i10];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt2 = decodeBase64ToArray.charAt(i14);
            if ('A' <= cCharAt2 && 'Z' >= cCharAt2) {
                i9 = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && 'z' >= cCharAt2) {
                i9 = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && '9' >= cCharAt2) {
                i9 = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i9 = 62;
            } else if (cCharAt2 == '/' || cCharAt2 == '_') {
                i9 = 63;
            } else {
                if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    return null;
                }
            }
            i12 = (i12 << 6) | i9;
            i11++;
            if (i11 % 4 == 0) {
                bArr[i13] = (byte) (i12 >> 16);
                int i15 = i13 + 2;
                bArr[i13 + 1] = (byte) (i12 >> 8);
                i13 += 3;
                bArr[i15] = (byte) i12;
            }
        }
        int i16 = i11 % 4;
        if (i16 == 1) {
            return null;
        }
        if (i16 == 2) {
            bArr[i13] = (byte) ((i12 << 12) >> 16);
            i13++;
        } else if (i16 == 3) {
            int i17 = i12 << 6;
            int i18 = i13 + 1;
            bArr[i13] = (byte) (i17 >> 16);
            i13 += 2;
            bArr[i18] = (byte) (i17 >> 8);
        }
        if (i13 == i10) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i13);
        l.d(bArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
        return bArrCopyOf;
    }

    @NotNull
    public static final String encodeBase64(@NotNull byte[] encodeBase64, @NotNull byte[] map) {
        l.e(encodeBase64, "$this$encodeBase64");
        l.e(map, "map");
        byte[] bArr = new byte[((encodeBase64.length + 2) / 3) * 4];
        int length = encodeBase64.length - (encodeBase64.length % 3);
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            byte b9 = encodeBase64[i9];
            int i11 = i9 + 2;
            byte b10 = encodeBase64[i9 + 1];
            i9 += 3;
            byte b11 = encodeBase64[i11];
            bArr[i10] = map[(b9 & 255) >> 2];
            bArr[i10 + 1] = map[((b9 & 3) << 4) | ((b10 & 255) >> 4)];
            int i12 = i10 + 3;
            bArr[i10 + 2] = map[((b10 & 15) << 2) | ((b11 & 255) >> 6)];
            i10 += 4;
            bArr[i12] = map[b11 & Utf8.REPLACEMENT_BYTE];
        }
        int length2 = encodeBase64.length - length;
        if (length2 == 1) {
            byte b12 = encodeBase64[i9];
            bArr[i10] = map[(b12 & 255) >> 2];
            bArr[i10 + 1] = map[(b12 & 3) << 4];
            byte b13 = (byte) 61;
            bArr[i10 + 2] = b13;
            bArr[i10 + 3] = b13;
        } else if (length2 == 2) {
            int i13 = i9 + 1;
            byte b14 = encodeBase64[i9];
            byte b15 = encodeBase64[i13];
            bArr[i10] = map[(b14 & 255) >> 2];
            bArr[i10 + 1] = map[((b14 & 3) << 4) | ((b15 & 255) >> 4)];
            bArr[i10 + 2] = map[(b15 & 15) << 2];
            bArr[i10 + 3] = (byte) 61;
        }
        return Platform.toUtf8String(bArr);
    }

    public static /* synthetic */ String encodeBase64$default(byte[] bArr, byte[] bArr2, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            bArr2 = BASE64;
        }
        return encodeBase64(bArr, bArr2);
    }

    @NotNull
    public static final byte[] getBASE64() {
        return BASE64;
    }

    @NotNull
    public static final byte[] getBASE64_URL_SAFE() {
        return BASE64_URL_SAFE;
    }
}
