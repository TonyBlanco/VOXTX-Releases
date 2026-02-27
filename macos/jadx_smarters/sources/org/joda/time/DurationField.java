package org.joda.time;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DurationField implements Comparable<DurationField> {
    public abstract long add(long j9, int i9);

    public abstract long add(long j9, long j10);

    public abstract int getDifference(long j9, long j10);

    public abstract long getDifferenceAsLong(long j9, long j10);

    public abstract long getMillis(int i9);

    public abstract long getMillis(int i9, long j9);

    public abstract long getMillis(long j9);

    public abstract long getMillis(long j9, long j10);

    public abstract String getName();

    public abstract DurationFieldType getType();

    public abstract long getUnitMillis();

    public abstract int getValue(long j9);

    public abstract int getValue(long j9, long j10);

    public abstract long getValueAsLong(long j9);

    public abstract long getValueAsLong(long j9, long j10);

    public abstract boolean isPrecise();

    public abstract boolean isSupported();

    public long subtract(long j9, int i9) {
        return i9 == Integer.MIN_VALUE ? subtract(j9, i9) : add(j9, -i9);
    }

    public long subtract(long j9, long j10) {
        if (j10 != Long.MIN_VALUE) {
            return add(j9, -j10);
        }
        throw new ArithmeticException("Long.MIN_VALUE cannot be negated");
    }

    public abstract String toString();
}
