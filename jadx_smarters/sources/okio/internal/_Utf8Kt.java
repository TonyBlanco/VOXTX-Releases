package okio.internal;

import java.util.Arrays;
import k8.q;
import kotlin.jvm.internal.l;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class _Utf8Kt {
    @NotNull
    public static final byte[] commonAsUtf8ToByteArray(@NotNull String commonAsUtf8ToByteArray) {
        int i9;
        char cCharAt;
        l.e(commonAsUtf8ToByteArray, "$this$commonAsUtf8ToByteArray");
        byte[] bArr = new byte[commonAsUtf8ToByteArray.length() * 4];
        int length = commonAsUtf8ToByteArray.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt2 = commonAsUtf8ToByteArray.charAt(i10);
            if (l.f(cCharAt2, 128) >= 0) {
                int length2 = commonAsUtf8ToByteArray.length();
                int i11 = i10;
                while (i10 < length2) {
                    char cCharAt3 = commonAsUtf8ToByteArray.charAt(i10);
                    if (l.f(cCharAt3, 128) < 0) {
                        int i12 = i11 + 1;
                        bArr[i11] = (byte) cCharAt3;
                        i10++;
                        while (i10 < length2 && l.f(commonAsUtf8ToByteArray.charAt(i10), 128) < 0) {
                            bArr[i12] = (byte) commonAsUtf8ToByteArray.charAt(i10);
                            i10++;
                            i12++;
                        }
                        i11 = i12;
                    } else {
                        if (l.f(cCharAt3, 2048) < 0) {
                            bArr[i11] = (byte) ((cCharAt3 >> 6) | 192);
                            i11 += 2;
                            bArr[i11 + 1] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (55296 > cCharAt3 || 57343 < cCharAt3) {
                            bArr[i11] = (byte) ((cCharAt3 >> '\f') | 224);
                            bArr[i11 + 1] = (byte) (((cCharAt3 >> 6) & 63) | 128);
                            i11 += 3;
                            bArr[i11 + 2] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (l.f(cCharAt3, 56319) > 0 || length2 <= (i9 = i10 + 1) || 56320 > (cCharAt = commonAsUtf8ToByteArray.charAt(i9)) || 57343 < cCharAt) {
                            bArr[i11] = Utf8.REPLACEMENT_BYTE;
                            i10++;
                            i11++;
                        } else {
                            int iCharAt = ((cCharAt3 << '\n') + commonAsUtf8ToByteArray.charAt(i9)) - 56613888;
                            bArr[i11] = (byte) ((iCharAt >> 18) | 240);
                            bArr[i11 + 1] = (byte) (((iCharAt >> 12) & 63) | 128);
                            bArr[i11 + 2] = (byte) (((iCharAt >> 6) & 63) | 128);
                            i11 += 4;
                            bArr[i11 + 3] = (byte) ((iCharAt & 63) | 128);
                            i10 += 2;
                        }
                        i10++;
                    }
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr, i11);
                l.d(bArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
                return bArrCopyOf;
            }
            bArr[i10] = (byte) cCharAt2;
            i10++;
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr, commonAsUtf8ToByteArray.length());
        l.d(bArrCopyOf2, "java.util.Arrays.copyOf(this, newSize)");
        return bArrCopyOf2;
    }

    @NotNull
    public static final String commonToUtf8String(@NotNull byte[] commonToUtf8String, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = i9;
        int i19 = 3;
        l.e(commonToUtf8String, "$this$commonToUtf8String");
        if (i18 < 0 || i10 > commonToUtf8String.length || i18 > i10) {
            throw new ArrayIndexOutOfBoundsException("size=" + commonToUtf8String.length + " beginIndex=" + i18 + " endIndex=" + i10);
        }
        char[] cArr = new char[i10 - i18];
        int i20 = 0;
        while (i18 < i10) {
            byte b9 = commonToUtf8String[i18];
            if (b9 >= 0) {
                i16 = i20 + 1;
                cArr[i20] = (char) b9;
                i18++;
                while (i18 < i10) {
                    byte b10 = commonToUtf8String[i18];
                    if (b10 < 0) {
                        break;
                    }
                    i18++;
                    cArr[i16] = (char) b10;
                    i16++;
                }
            } else if ((b9 >> 5) == -2) {
                int i21 = i18 + 1;
                if (i10 <= i21) {
                    i16 = i20 + 1;
                    cArr[i20] = (char) Utf8.REPLACEMENT_CODE_POINT;
                } else {
                    byte b11 = commonToUtf8String[i21];
                    if ((b11 & 192) == 128) {
                        int i22 = (b9 << 6) ^ (b11 ^ 3968);
                        if (i22 < 128) {
                            i16 = i20 + 1;
                            cArr[i20] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        } else {
                            i16 = i20 + 1;
                            cArr[i20] = (char) i22;
                        }
                        q qVar = q.f43674a;
                        i17 = 2;
                        i18 += i17;
                    } else {
                        i16 = i20 + 1;
                        cArr[i20] = (char) Utf8.REPLACEMENT_CODE_POINT;
                    }
                }
                q qVar2 = q.f43674a;
                i17 = 1;
                i18 += i17;
            } else {
                if ((b9 >> 4) == -2) {
                    int i23 = i18 + 2;
                    if (i10 <= i23) {
                        i13 = i20 + 1;
                        cArr[i20] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        q qVar3 = q.f43674a;
                        int i24 = i18 + 1;
                        i15 = (i10 <= i24 || (commonToUtf8String[i24] & 192) != 128) ? 1 : 2;
                    } else {
                        byte b12 = commonToUtf8String[i18 + 1];
                        if ((b12 & 192) == 128) {
                            byte b13 = commonToUtf8String[i23];
                            if ((b13 & 192) == 128) {
                                int i25 = ((b13 ^ (-123008)) ^ (b12 << 6)) ^ (b9 << 12);
                                if (i25 < 2048) {
                                    i14 = i20 + 1;
                                    cArr[i20] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                } else if (55296 <= i25 && 57343 >= i25) {
                                    i14 = i20 + 1;
                                    cArr[i20] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                } else {
                                    char c9 = (char) i25;
                                    i14 = i20 + 1;
                                    cArr[i20] = c9;
                                }
                                q qVar4 = q.f43674a;
                                i13 = i14;
                                i15 = 3;
                            } else {
                                i13 = i20 + 1;
                                cArr[i20] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                q qVar5 = q.f43674a;
                            }
                        } else {
                            i13 = i20 + 1;
                            cArr[i20] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            q qVar6 = q.f43674a;
                        }
                    }
                    i18 += i15;
                    i20 = i13;
                } else {
                    if ((b9 >> 3) == -2) {
                        int i26 = i18 + 3;
                        if (i10 <= i26) {
                            i11 = i20 + 1;
                            cArr[i20] = Utf8.REPLACEMENT_CHARACTER;
                            q qVar7 = q.f43674a;
                            int i27 = i18 + 1;
                            if (i10 <= i27 || (commonToUtf8String[i27] & 192) != 128) {
                                i19 = 1;
                            } else {
                                int i28 = i18 + 2;
                                if (i10 <= i28 || (commonToUtf8String[i28] & 192) != 128) {
                                    i19 = 2;
                                }
                            }
                            i18 += i19;
                        } else {
                            byte b14 = commonToUtf8String[i18 + 1];
                            if ((b14 & 192) == 128) {
                                byte b15 = commonToUtf8String[i18 + 2];
                                if ((b15 & 192) == 128) {
                                    byte b16 = commonToUtf8String[i26];
                                    if ((b16 & 192) == 128) {
                                        int i29 = (((b16 ^ 3678080) ^ (b15 << 6)) ^ (b14 << 12)) ^ (b9 << 18);
                                        if (i29 > 1114111) {
                                            i11 = i20 + 1;
                                            cArr[i20] = Utf8.REPLACEMENT_CHARACTER;
                                        } else if ((55296 <= i29 && 57343 >= i29) || i29 < 65536) {
                                            i11 = i20 + 1;
                                            cArr[i20] = Utf8.REPLACEMENT_CHARACTER;
                                        } else {
                                            if (i29 != 65533) {
                                                cArr[i20] = (char) ((i29 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                                i12 = i20 + 2;
                                                cArr[i20 + 1] = (char) ((i29 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                                            } else {
                                                cArr[i20] = Utf8.REPLACEMENT_CHARACTER;
                                                i12 = i20 + 1;
                                            }
                                            q qVar8 = q.f43674a;
                                            i11 = i12;
                                            i19 = 4;
                                        }
                                        q qVar9 = q.f43674a;
                                        i19 = 4;
                                    } else {
                                        i11 = i20 + 1;
                                        cArr[i20] = Utf8.REPLACEMENT_CHARACTER;
                                        q qVar10 = q.f43674a;
                                        i19 = 3;
                                    }
                                    i18 += i19;
                                } else {
                                    i11 = i20 + 1;
                                    cArr[i20] = Utf8.REPLACEMENT_CHARACTER;
                                    q qVar11 = q.f43674a;
                                    i19 = 2;
                                    i18 += i19;
                                }
                            } else {
                                i11 = i20 + 1;
                                cArr[i20] = Utf8.REPLACEMENT_CHARACTER;
                                q qVar12 = q.f43674a;
                                i19 = 1;
                                i18 += i19;
                            }
                        }
                    } else {
                        i11 = i20 + 1;
                        cArr[i20] = Utf8.REPLACEMENT_CHARACTER;
                        i18++;
                    }
                    i20 = i11;
                }
                i19 = 3;
            }
            i20 = i16;
            i19 = 3;
        }
        return new String(cArr, 0, i20);
    }

    public static /* synthetic */ String commonToUtf8String$default(byte[] bArr, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = bArr.length;
        }
        return commonToUtf8String(bArr, i9, i10);
    }
}
