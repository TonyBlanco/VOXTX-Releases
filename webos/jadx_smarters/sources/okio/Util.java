package okio;

import kotlin.jvm.internal.l;
import okio.internal.ByteStringKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.-Util, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class Util {
    public static final int and(byte b9, int i9) {
        return b9 & i9;
    }

    public static final long and(byte b9, long j9) {
        return ((long) b9) & j9;
    }

    public static final long and(int i9, long j9) {
        return ((long) i9) & j9;
    }

    public static final boolean arrayRangeEquals(@NotNull byte[] a9, int i9, @NotNull byte[] b9, int i10, int i11) {
        l.e(a9, "a");
        l.e(b9, "b");
        for (int i12 = 0; i12 < i11; i12++) {
            if (a9[i12 + i9] != b9[i12 + i10]) {
                return false;
            }
        }
        return true;
    }

    public static final void checkOffsetAndCount(long j9, long j10, long j11) {
        if ((j10 | j11) < 0 || j10 > j9 || j9 - j10 < j11) {
            throw new ArrayIndexOutOfBoundsException("size=" + j9 + " offset=" + j10 + " byteCount=" + j11);
        }
    }

    public static final long minOf(int i9, long j9) {
        return Math.min(i9, j9);
    }

    public static final long minOf(long j9, int i9) {
        return Math.min(j9, i9);
    }

    public static final int reverseBytes(int i9) {
        return ((i9 & 255) << 24) | (((-16777216) & i9) >>> 24) | ((16711680 & i9) >>> 8) | ((65280 & i9) << 8);
    }

    public static final long reverseBytes(long j9) {
        return ((j9 & 255) << 56) | (((-72057594037927936L) & j9) >>> 56) | ((71776119061217280L & j9) >>> 40) | ((280375465082880L & j9) >>> 24) | ((1095216660480L & j9) >>> 8) | ((4278190080L & j9) << 8) | ((16711680 & j9) << 24) | ((65280 & j9) << 40);
    }

    public static final short reverseBytes(short s9) {
        return (short) (((s9 & 255) << 8) | ((65280 & s9) >>> 8));
    }

    public static final int shl(byte b9, int i9) {
        return b9 << i9;
    }

    public static final int shr(byte b9, int i9) {
        return b9 >> i9;
    }

    @NotNull
    public static final String toHexString(byte b9) {
        return new String(new char[]{ByteStringKt.getHEX_DIGIT_CHARS()[(b9 >> 4) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[b9 & 15]});
    }

    @NotNull
    public static final String toHexString(int i9) {
        int i10 = 0;
        if (i9 == 0) {
            return "0";
        }
        char[] cArr = {ByteStringKt.getHEX_DIGIT_CHARS()[(i9 >> 28) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i9 >> 24) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i9 >> 20) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i9 >> 16) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i9 >> 12) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i9 >> 8) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i9 >> 4) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[i9 & 15]};
        while (i10 < 8 && cArr[i10] == '0') {
            i10++;
        }
        return new String(cArr, i10, 8 - i10);
    }

    @NotNull
    public static final String toHexString(long j9) {
        if (j9 == 0) {
            return "0";
        }
        char[] cArr = {ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j9 >> 60) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j9 >> 56) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j9 >> 52) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j9 >> 48) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j9 >> 44) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j9 >> 40) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j9 >> 36) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j9 >> 32) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j9 >> 28) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j9 >> 24) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j9 >> 20) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j9 >> 16) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j9 >> 12) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j9 >> 8) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j9 >> 4) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) (j9 & 15)]};
        int i9 = 0;
        while (i9 < 16 && cArr[i9] == '0') {
            i9++;
        }
        return new String(cArr, i9, 16 - i9);
    }
}
