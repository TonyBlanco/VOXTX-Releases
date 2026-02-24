package okio;

import k8.q;
import org.jetbrains.annotations.NotNull;
import w8.l;

/* JADX INFO: loaded from: classes4.dex */
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int i9) {
        return (i9 >= 0 && 31 >= i9) || (127 <= i9 && 159 >= i9);
    }

    public static final boolean isUtf8Continuation(byte b9) {
        return (b9 & 192) == 128;
    }

    public static final int process2Utf8Bytes(@NotNull byte[] process2Utf8Bytes, int i9, int i10, @NotNull l yield) {
        kotlin.jvm.internal.l.e(process2Utf8Bytes, "$this$process2Utf8Bytes");
        kotlin.jvm.internal.l.e(yield, "yield");
        int i11 = i9 + 1;
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i10 <= i11) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b9 = process2Utf8Bytes[i9];
        byte b10 = process2Utf8Bytes[i11];
        if ((b10 & 192) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        int i12 = (b10 ^ 3968) ^ (b9 << 6);
        if (i12 < 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        yield.invoke(Integer.valueOf(i12));
        return 2;
    }

    public static final int process3Utf8Bytes(@NotNull byte[] process3Utf8Bytes, int i9, int i10, @NotNull l yield) {
        kotlin.jvm.internal.l.e(process3Utf8Bytes, "$this$process3Utf8Bytes");
        kotlin.jvm.internal.l.e(yield, "yield");
        int i11 = i9 + 2;
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i10 <= i11) {
            yield.invoke(numValueOf);
            int i12 = i9 + 1;
            return (i10 <= i12 || (process3Utf8Bytes[i12] & 192) != 128) ? 1 : 2;
        }
        byte b9 = process3Utf8Bytes[i9];
        byte b10 = process3Utf8Bytes[i9 + 1];
        if ((b10 & 192) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b11 = process3Utf8Bytes[i11];
        if ((b11 & 192) != 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        int i13 = ((b11 ^ (-123008)) ^ (b10 << 6)) ^ (b9 << 12);
        if (i13 >= 2048 && (55296 > i13 || 57343 < i13)) {
            yield.invoke(Integer.valueOf(i13));
            return 3;
        }
        yield.invoke(numValueOf);
        return 3;
    }

    public static final int process4Utf8Bytes(@NotNull byte[] process4Utf8Bytes, int i9, int i10, @NotNull l yield) {
        kotlin.jvm.internal.l.e(process4Utf8Bytes, "$this$process4Utf8Bytes");
        kotlin.jvm.internal.l.e(yield, "yield");
        int i11 = i9 + 3;
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i10 <= i11) {
            yield.invoke(numValueOf);
            int i12 = i9 + 1;
            if (i10 <= i12 || (process4Utf8Bytes[i12] & 192) != 128) {
                return 1;
            }
            int i13 = i9 + 2;
            return (i10 <= i13 || (process4Utf8Bytes[i13] & 192) != 128) ? 2 : 3;
        }
        byte b9 = process4Utf8Bytes[i9];
        byte b10 = process4Utf8Bytes[i9 + 1];
        if ((b10 & 192) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b11 = process4Utf8Bytes[i9 + 2];
        if ((b11 & 192) != 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        byte b12 = process4Utf8Bytes[i11];
        if ((b12 & 192) != 128) {
            yield.invoke(numValueOf);
            return 3;
        }
        int i14 = (((b12 ^ 3678080) ^ (b11 << 6)) ^ (b10 << 12)) ^ (b9 << 18);
        if (i14 <= 1114111 && ((55296 > i14 || 57343 < i14) && i14 >= 65536)) {
            yield.invoke(Integer.valueOf(i14));
            return 4;
        }
        yield.invoke(numValueOf);
        return 4;
    }

    public static final void processUtf16Chars(@NotNull byte[] processUtf16Chars, int i9, int i10, @NotNull l yield) {
        Character chValueOf;
        int i11;
        int i12;
        kotlin.jvm.internal.l.e(processUtf16Chars, "$this$processUtf16Chars");
        kotlin.jvm.internal.l.e(yield, "yield");
        int i13 = i9;
        while (i13 < i10) {
            byte b9 = processUtf16Chars[i13];
            if (b9 >= 0) {
                yield.invoke(Character.valueOf((char) b9));
                i13++;
                while (i13 < i10) {
                    byte b10 = processUtf16Chars[i13];
                    if (b10 >= 0) {
                        i13++;
                        yield.invoke(Character.valueOf((char) b10));
                    }
                }
            } else {
                if ((b9 >> 5) == -2) {
                    int i14 = i13 + 1;
                    if (i10 > i14) {
                        byte b11 = processUtf16Chars[i14];
                        if ((b11 & 192) == 128) {
                            int i15 = (b9 << 6) ^ (b11 ^ 3968);
                            yield.invoke(Character.valueOf(i15 < 128 ? (char) REPLACEMENT_CODE_POINT : (char) i15));
                            q qVar = q.f43674a;
                        }
                    }
                    yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                    q qVar2 = q.f43674a;
                } else if ((b9 >> 4) == -2) {
                    int i16 = i13 + 2;
                    if (i10 <= i16) {
                        yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                        q qVar3 = q.f43674a;
                        int i17 = i13 + 1;
                        i12 = (i10 <= i17 || (processUtf16Chars[i17] & 192) != 128) ? 1 : 2;
                    } else {
                        byte b12 = processUtf16Chars[i13 + 1];
                        if ((b12 & 192) == 128) {
                            byte b13 = processUtf16Chars[i16];
                            if ((b13 & 192) == 128) {
                                int i18 = (b9 << 12) ^ ((b13 ^ (-123008)) ^ (b12 << 6));
                                yield.invoke(Character.valueOf((i18 >= 2048 && (55296 > i18 || 57343 < i18)) ? (char) i18 : (char) REPLACEMENT_CODE_POINT));
                                q qVar4 = q.f43674a;
                                i12 = 3;
                            } else {
                                yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                                q qVar5 = q.f43674a;
                            }
                        } else {
                            yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                            q qVar6 = q.f43674a;
                        }
                    }
                } else if ((b9 >> 3) == -2) {
                    int i19 = i13 + 3;
                    if (i10 <= i19) {
                        yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                        q qVar7 = q.f43674a;
                        int i20 = i13 + 1;
                        if (i10 > i20 && (processUtf16Chars[i20] & 192) == 128) {
                            int i21 = i13 + 2;
                            i11 = (i10 <= i21 || (processUtf16Chars[i21] & 192) != 128) ? 2 : 3;
                        }
                        i11 = 1;
                    } else {
                        byte b14 = processUtf16Chars[i13 + 1];
                        if ((b14 & 192) == 128) {
                            byte b15 = processUtf16Chars[i13 + 2];
                            if ((b15 & 192) == 128) {
                                byte b16 = processUtf16Chars[i19];
                                if ((b16 & 192) == 128) {
                                    int i22 = (((b16 ^ 3678080) ^ (b15 << 6)) ^ (b14 << 12)) ^ (b9 << 18);
                                    if (i22 <= 1114111 && ((55296 > i22 || 57343 < i22) && i22 >= 65536 && i22 != 65533)) {
                                        yield.invoke(Character.valueOf((char) ((i22 >>> 10) + HIGH_SURROGATE_HEADER)));
                                        chValueOf = Character.valueOf((char) ((i22 & 1023) + LOG_SURROGATE_HEADER));
                                    } else {
                                        chValueOf = Character.valueOf(REPLACEMENT_CHARACTER);
                                    }
                                    yield.invoke(chValueOf);
                                    q qVar8 = q.f43674a;
                                    i11 = 4;
                                } else {
                                    yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                    q qVar9 = q.f43674a;
                                }
                            } else {
                                yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                q qVar10 = q.f43674a;
                            }
                        } else {
                            yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                            q qVar11 = q.f43674a;
                            i11 = 1;
                        }
                    }
                    i13 += i11;
                } else {
                    yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                    i13++;
                }
                i13 += i12;
            }
        }
    }

    public static final void processUtf8Bytes(@NotNull String processUtf8Bytes, int i9, int i10, @NotNull l yield) {
        int i11;
        Byte bValueOf;
        int i12;
        char cCharAt;
        kotlin.jvm.internal.l.e(processUtf8Bytes, "$this$processUtf8Bytes");
        kotlin.jvm.internal.l.e(yield, "yield");
        while (i9 < i10) {
            char cCharAt2 = processUtf8Bytes.charAt(i9);
            if (kotlin.jvm.internal.l.f(cCharAt2, 128) < 0) {
                yield.invoke(Byte.valueOf((byte) cCharAt2));
                i9++;
                while (i9 < i10 && kotlin.jvm.internal.l.f(processUtf8Bytes.charAt(i9), 128) < 0) {
                    yield.invoke(Byte.valueOf((byte) processUtf8Bytes.charAt(i9)));
                    i9++;
                }
            } else {
                if (kotlin.jvm.internal.l.f(cCharAt2, 2048) < 0) {
                    i11 = (cCharAt2 >> 6) | 192;
                } else if (55296 > cCharAt2 || 57343 < cCharAt2) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 >> '\f') | 224)));
                    i11 = ((cCharAt2 >> 6) & 63) | 128;
                } else if (kotlin.jvm.internal.l.f(cCharAt2, 56319) > 0 || i10 <= (i12 = i9 + 1) || 56320 > (cCharAt = processUtf8Bytes.charAt(i12)) || 57343 < cCharAt) {
                    bValueOf = Byte.valueOf(REPLACEMENT_BYTE);
                    yield.invoke(bValueOf);
                    i9++;
                } else {
                    int iCharAt = ((cCharAt2 << '\n') + processUtf8Bytes.charAt(i12)) - 56613888;
                    yield.invoke(Byte.valueOf((byte) ((iCharAt >> 18) | 240)));
                    yield.invoke(Byte.valueOf((byte) (((iCharAt >> 12) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) (((iCharAt >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((iCharAt & 63) | 128)));
                    i9 += 2;
                }
                yield.invoke(Byte.valueOf((byte) i11));
                bValueOf = Byte.valueOf((byte) ((cCharAt2 & '?') | 128));
                yield.invoke(bValueOf);
                i9++;
            }
        }
    }

    public static final void processUtf8CodePoints(@NotNull byte[] processUtf8CodePoints, int i9, int i10, @NotNull l yield) {
        int i11;
        int i12;
        kotlin.jvm.internal.l.e(processUtf8CodePoints, "$this$processUtf8CodePoints");
        kotlin.jvm.internal.l.e(yield, "yield");
        int i13 = i9;
        while (i13 < i10) {
            byte b9 = processUtf8CodePoints[i13];
            if (b9 >= 0) {
                yield.invoke(Integer.valueOf(b9));
                i13++;
                while (i13 < i10) {
                    byte b10 = processUtf8CodePoints[i13];
                    if (b10 >= 0) {
                        i13++;
                        yield.invoke(Integer.valueOf(b10));
                    }
                }
            } else {
                if ((b9 >> 5) == -2) {
                    int i14 = i13 + 1;
                    if (i10 > i14) {
                        byte b11 = processUtf8CodePoints[i14];
                        if ((b11 & 192) == 128) {
                            int i15 = (b9 << 6) ^ (b11 ^ 3968);
                            yield.invoke(i15 < 128 ? Integer.valueOf(REPLACEMENT_CODE_POINT) : Integer.valueOf(i15));
                            q qVar = q.f43674a;
                        }
                    }
                    yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                    q qVar2 = q.f43674a;
                } else if ((b9 >> 4) == -2) {
                    int i16 = i13 + 2;
                    if (i10 <= i16) {
                        yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                        q qVar3 = q.f43674a;
                        int i17 = i13 + 1;
                        i12 = (i10 <= i17 || (processUtf8CodePoints[i17] & 192) != 128) ? 1 : 2;
                    } else {
                        byte b12 = processUtf8CodePoints[i13 + 1];
                        if ((b12 & 192) == 128) {
                            byte b13 = processUtf8CodePoints[i16];
                            if ((b13 & 192) == 128) {
                                int i18 = (b9 << 12) ^ ((b13 ^ (-123008)) ^ (b12 << 6));
                                yield.invoke((i18 >= 2048 && (55296 > i18 || 57343 < i18)) ? Integer.valueOf(i18) : Integer.valueOf(REPLACEMENT_CODE_POINT));
                                q qVar4 = q.f43674a;
                                i12 = 3;
                            } else {
                                yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                                q qVar5 = q.f43674a;
                            }
                        } else {
                            yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                            q qVar6 = q.f43674a;
                        }
                    }
                } else if ((b9 >> 3) == -2) {
                    int i19 = i13 + 3;
                    if (i10 <= i19) {
                        yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                        q qVar7 = q.f43674a;
                        int i20 = i13 + 1;
                        if (i10 > i20 && (processUtf8CodePoints[i20] & 192) == 128) {
                            int i21 = i13 + 2;
                            i11 = (i10 <= i21 || (processUtf8CodePoints[i21] & 192) != 128) ? 2 : 3;
                        }
                        i11 = 1;
                    } else {
                        byte b14 = processUtf8CodePoints[i13 + 1];
                        if ((b14 & 192) == 128) {
                            byte b15 = processUtf8CodePoints[i13 + 2];
                            if ((b15 & 192) == 128) {
                                byte b16 = processUtf8CodePoints[i19];
                                if ((b16 & 192) == 128) {
                                    int i22 = (((b16 ^ 3678080) ^ (b15 << 6)) ^ (b14 << 12)) ^ (b9 << 18);
                                    yield.invoke((i22 <= 1114111 && (55296 > i22 || 57343 < i22) && i22 >= 65536) ? Integer.valueOf(i22) : Integer.valueOf(REPLACEMENT_CODE_POINT));
                                    q qVar8 = q.f43674a;
                                    i11 = 4;
                                } else {
                                    yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                                    q qVar9 = q.f43674a;
                                }
                            } else {
                                yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                                q qVar10 = q.f43674a;
                            }
                        } else {
                            yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                            q qVar11 = q.f43674a;
                            i11 = 1;
                        }
                    }
                    i13 += i11;
                } else {
                    yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                    i13++;
                }
                i13 += i12;
            }
        }
    }

    public static final long size(@NotNull String str) {
        return size$default(str, 0, 0, 3, null);
    }

    public static final long size(@NotNull String str, int i9) {
        return size$default(str, i9, 0, 2, null);
    }

    public static final long size(@NotNull String utf8Size, int i9, int i10) {
        int i11;
        kotlin.jvm.internal.l.e(utf8Size, "$this$utf8Size");
        if (!(i9 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i9).toString());
        }
        if (!(i10 >= i9)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i10 + " < " + i9).toString());
        }
        if (!(i10 <= utf8Size.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i10 + " > " + utf8Size.length()).toString());
        }
        long j9 = 0;
        while (i9 < i10) {
            char cCharAt = utf8Size.charAt(i9);
            if (cCharAt < 128) {
                j9++;
            } else {
                if (cCharAt < 2048) {
                    i11 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i11 = 3;
                } else {
                    int i12 = i9 + 1;
                    char cCharAt2 = i12 < i10 ? utf8Size.charAt(i12) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j9++;
                        i9 = i12;
                    } else {
                        j9 += (long) 4;
                        i9 += 2;
                    }
                }
                j9 += (long) i11;
            }
            i9++;
        }
        return j9;
    }

    public static /* synthetic */ long size$default(String str, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        return size(str, i9, i10);
    }
}
