package org.joda.time.chrono;

import org.joda.time.Chronology;

/* JADX INFO: loaded from: classes4.dex */
abstract class BasicFixedMonthChronology extends BasicChronology {
    static final long MILLIS_PER_MONTH = 2592000000L;
    static final long MILLIS_PER_YEAR = 31557600000L;
    static final int MONTH_LENGTH = 30;
    private static final long serialVersionUID = 261387371998L;

    public BasicFixedMonthChronology(Chronology chronology, Object obj, int i9) {
        super(chronology, obj, i9);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getAverageMillisPerMonth() {
        return MILLIS_PER_MONTH;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getAverageMillisPerYear() {
        return MILLIS_PER_YEAR;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getAverageMillisPerYearDividedByTwo() {
        return 15778800000L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDayOfMonth(long j9) {
        return ((getDayOfYear(j9) - 1) % MONTH_LENGTH) + 1;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInMonthMax() {
        return MONTH_LENGTH;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInMonthMax(int i9) {
        if (i9 != 13) {
            return MONTH_LENGTH;
        }
        return 6;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInYearMonth(int i9, int i10) {
        return i10 != 13 ? MONTH_LENGTH : isLeapYear(i9) ? 6 : 5;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMaxMonth() {
        return 13;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMonthOfYear(long j9) {
        return ((getDayOfYear(j9) - 1) / MONTH_LENGTH) + 1;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMonthOfYear(long j9, int i9) {
        return ((int) ((j9 - getYearMillis(i9)) / MILLIS_PER_MONTH)) + 1;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getTotalMillisByYearMonth(int i9, int i10) {
        return ((long) (i10 - 1)) * MILLIS_PER_MONTH;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getYearDifference(long j9, long j10) {
        int year = getYear(j9);
        int year2 = getYear(j10);
        long yearMillis = j9 - getYearMillis(year);
        int i9 = year - year2;
        if (yearMillis < j10 - getYearMillis(year2)) {
            i9--;
        }
        return i9;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public boolean isLeapYear(int i9) {
        return (i9 & 3) == 3;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long setYear(long j9, int i9) {
        int dayOfYear = getDayOfYear(j9, getYear(j9));
        int millisOfDay = getMillisOfDay(j9);
        if (dayOfYear > 365 && !isLeapYear(i9)) {
            dayOfYear--;
        }
        return getYearMonthDayMillis(i9, 1, dayOfYear) + ((long) millisOfDay);
    }
}
