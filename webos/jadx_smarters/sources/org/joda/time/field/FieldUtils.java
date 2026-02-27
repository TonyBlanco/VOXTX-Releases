package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* JADX INFO: loaded from: classes4.dex */
public class FieldUtils {
    private FieldUtils() {
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static int getWrappedValue(int i9, int i10, int i11) {
        if (i10 >= i11) {
            throw new IllegalArgumentException("MIN > MAX");
        }
        int i12 = (i11 - i10) + 1;
        int i13 = i9 - i10;
        if (i13 >= 0) {
            return (i13 % i12) + i10;
        }
        int i14 = (-i13) % i12;
        return i14 == 0 ? i10 : (i12 - i14) + i10;
    }

    public static int getWrappedValue(int i9, int i10, int i11, int i12) {
        return getWrappedValue(i9 + i10, i11, i12);
    }

    public static int safeAdd(int i9, int i10) {
        int i11 = i9 + i10;
        if ((i9 ^ i11) >= 0 || (i9 ^ i10) < 0) {
            return i11;
        }
        throw new ArithmeticException("The calculation caused an overflow: " + i9 + " + " + i10);
    }

    public static long safeAdd(long j9, long j10) {
        long j11 = j9 + j10;
        if ((j9 ^ j11) >= 0 || (j9 ^ j10) < 0) {
            return j11;
        }
        throw new ArithmeticException("The calculation caused an overflow: " + j9 + " + " + j10);
    }

    public static long safeDivide(long j9, long j10) {
        if (j9 != Long.MIN_VALUE || j10 != -1) {
            return j9 / j10;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j9 + " / " + j10);
    }

    public static int safeMultiply(int i9, int i10) {
        long j9 = ((long) i9) * ((long) i10);
        if (j9 >= -2147483648L && j9 <= 2147483647L) {
            return (int) j9;
        }
        throw new ArithmeticException("Multiplication overflows an int: " + i9 + " * " + i10);
    }

    public static long safeMultiply(long j9, int i9) {
        if (i9 == -1) {
            if (j9 != Long.MIN_VALUE) {
                return -j9;
            }
            throw new ArithmeticException("Multiplication overflows a long: " + j9 + " * " + i9);
        }
        if (i9 == 0) {
            return 0L;
        }
        if (i9 == 1) {
            return j9;
        }
        long j10 = i9;
        long j11 = j9 * j10;
        if (j11 / j10 == j9) {
            return j11;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j9 + " * " + i9);
    }

    public static long safeMultiply(long j9, long j10) {
        if (j10 == 1) {
            return j9;
        }
        if (j9 == 1) {
            return j10;
        }
        if (j9 == 0 || j10 == 0) {
            return 0L;
        }
        long j11 = j9 * j10;
        if (j11 / j10 == j9 && ((j9 != Long.MIN_VALUE || j10 != -1) && (j10 != Long.MIN_VALUE || j9 != -1))) {
            return j11;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j9 + " * " + j10);
    }

    public static int safeMultiplyToInt(long j9, long j10) {
        return safeToInt(safeMultiply(j9, j10));
    }

    public static int safeNegate(int i9) {
        if (i9 != Integer.MIN_VALUE) {
            return -i9;
        }
        throw new ArithmeticException("Integer.MIN_VALUE cannot be negated");
    }

    public static long safeSubtract(long j9, long j10) {
        long j11 = j9 - j10;
        if ((j9 ^ j11) >= 0 || (j9 ^ j10) >= 0) {
            return j11;
        }
        throw new ArithmeticException("The calculation caused an overflow: " + j9 + " - " + j10);
    }

    public static int safeToInt(long j9) {
        if (-2147483648L <= j9 && j9 <= 2147483647L) {
            return (int) j9;
        }
        throw new ArithmeticException("Value cannot fit in an int: " + j9);
    }

    public static void verifyValueBounds(String str, int i9, int i10, int i11) {
        if (i9 < i10 || i9 > i11) {
            throw new IllegalFieldValueException(str, Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
        }
    }

    public static void verifyValueBounds(DateTimeField dateTimeField, int i9, int i10, int i11) {
        if (i9 < i10 || i9 > i11) {
            throw new IllegalFieldValueException(dateTimeField.getType(), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
        }
    }

    public static void verifyValueBounds(DateTimeFieldType dateTimeFieldType, int i9, int i10, int i11) {
        if (i9 < i10 || i9 > i11) {
            throw new IllegalFieldValueException(dateTimeFieldType, Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
        }
    }
}
