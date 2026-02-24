package org.joda.time.chrono;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import org.achartengine.chart.TimeChart;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;

/* JADX INFO: loaded from: classes4.dex */
public final class IslamicChronology extends BasicChronology {
    public static final int AH = 1;
    private static final int CYCLE = 30;
    private static final int LONG_MONTH_LENGTH = 30;
    private static final int MAX_YEAR = 292271022;
    private static final long MILLIS_PER_CYCLE = 918518400000L;
    private static final long MILLIS_PER_LONG_MONTH = 2592000000L;
    private static final long MILLIS_PER_LONG_YEAR = 30672000000L;
    private static final long MILLIS_PER_MONTH = 2551440384L;
    private static final long MILLIS_PER_MONTH_PAIR = 5097600000L;
    private static final long MILLIS_PER_SHORT_YEAR = 30585600000L;
    private static final long MILLIS_PER_YEAR = 30617280288L;
    private static final long MILLIS_YEAR_1 = -42521587200000L;
    private static final int MIN_YEAR = -292269337;
    private static final int MONTH_PAIR_LENGTH = 59;
    private static final int SHORT_MONTH_LENGTH = 29;
    private static final long serialVersionUID = -3663823829888L;
    private final LeapYearPatternType iLeapYears;
    private static final DateTimeField ERA_FIELD = new BasicSingleEraDateTimeField("AH");
    public static final LeapYearPatternType LEAP_YEAR_15_BASED = new LeapYearPatternType(0, 623158436);
    public static final LeapYearPatternType LEAP_YEAR_16_BASED = new LeapYearPatternType(1, 623191204);
    public static final LeapYearPatternType LEAP_YEAR_INDIAN = new LeapYearPatternType(2, 690562340);
    public static final LeapYearPatternType LEAP_YEAR_HABASH_AL_HASIB = new LeapYearPatternType(3, 153692453);
    private static final ConcurrentHashMap<DateTimeZone, IslamicChronology[]> cCache = new ConcurrentHashMap<>();
    private static final IslamicChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);

    public static class LeapYearPatternType implements Serializable {
        private static final long serialVersionUID = 26581275372698L;
        final byte index;
        final int pattern;

        public LeapYearPatternType(int i9, int i10) {
            this.index = (byte) i9;
            this.pattern = i10;
        }

        private Object readResolve() {
            byte b9 = this.index;
            return b9 != 0 ? b9 != 1 ? b9 != 2 ? b9 != 3 ? this : IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB : IslamicChronology.LEAP_YEAR_INDIAN : IslamicChronology.LEAP_YEAR_16_BASED : IslamicChronology.LEAP_YEAR_15_BASED;
        }

        public boolean equals(Object obj) {
            return (obj instanceof LeapYearPatternType) && this.index == ((LeapYearPatternType) obj).index;
        }

        public int hashCode() {
            return this.index;
        }

        public boolean isLeapYear(int i9) {
            return ((1 << (i9 % 30)) & this.pattern) > 0;
        }
    }

    public IslamicChronology(Chronology chronology, Object obj, LeapYearPatternType leapYearPatternType) {
        super(chronology, obj, 4);
        this.iLeapYears = leapYearPatternType;
    }

    public static IslamicChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), LEAP_YEAR_16_BASED);
    }

    public static IslamicChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, LEAP_YEAR_16_BASED);
    }

    public static IslamicChronology getInstance(DateTimeZone dateTimeZone, LeapYearPatternType leapYearPatternType) {
        IslamicChronology islamicChronology;
        IslamicChronology[] islamicChronologyArrPutIfAbsent;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        ConcurrentHashMap<DateTimeZone, IslamicChronology[]> concurrentHashMap = cCache;
        IslamicChronology[] islamicChronologyArr = concurrentHashMap.get(dateTimeZone);
        if (islamicChronologyArr == null && (islamicChronologyArrPutIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone, (islamicChronologyArr = new IslamicChronology[4]))) != null) {
            islamicChronologyArr = islamicChronologyArrPutIfAbsent;
        }
        IslamicChronology islamicChronology2 = islamicChronologyArr[leapYearPatternType.index];
        if (islamicChronology2 == null) {
            synchronized (islamicChronologyArr) {
                try {
                    islamicChronology2 = islamicChronologyArr[leapYearPatternType.index];
                    if (islamicChronology2 == null) {
                        DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
                        if (dateTimeZone == dateTimeZone2) {
                            IslamicChronology islamicChronology3 = new IslamicChronology(null, null, leapYearPatternType);
                            islamicChronology = new IslamicChronology(LimitChronology.getInstance(islamicChronology3, new DateTime(1, 1, 1, 0, 0, 0, 0, islamicChronology3), null), null, leapYearPatternType);
                        } else {
                            islamicChronology = new IslamicChronology(ZonedChronology.getInstance(getInstance(dateTimeZone2, leapYearPatternType), dateTimeZone), null, leapYearPatternType);
                        }
                        islamicChronologyArr[leapYearPatternType.index] = islamicChronology;
                        islamicChronology2 = islamicChronology;
                    }
                } finally {
                }
            }
        }
        return islamicChronology2;
    }

    public static IslamicChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object readResolve() {
        Chronology base = getBase();
        return base == null ? getInstanceUTC() : getInstance(base.getZone());
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        if (getBase() == null) {
            super.assemble(fields);
            fields.era = ERA_FIELD;
            BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(this, 12);
            fields.monthOfYear = basicMonthOfYearDateTimeField;
            fields.months = basicMonthOfYearDateTimeField.getDurationField();
        }
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long calculateFirstDayOfYearMillis(int i9) {
        if (i9 > MAX_YEAR) {
            throw new ArithmeticException("Year is too large: " + i9 + " > " + MAX_YEAR);
        }
        if (i9 < MIN_YEAR) {
            throw new ArithmeticException("Year is too small: " + i9 + " < " + MIN_YEAR);
        }
        int i10 = i9 - 1;
        long j9 = (((long) (i10 / 30)) * MILLIS_PER_CYCLE) + MILLIS_YEAR_1;
        int i11 = (i10 % 30) + 1;
        for (int i12 = 1; i12 < i11; i12++) {
            j9 += isLeapYear(i12) ? MILLIS_PER_LONG_YEAR : MILLIS_PER_SHORT_YEAR;
        }
        return j9;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IslamicChronology) && getLeapYearPatternType().index == ((IslamicChronology) obj).getLeapYearPatternType().index && super.equals(obj);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getApproxMillisAtEpochDividedByTwo() {
        return 21260793600000L;
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
        return 15308640144L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDayOfMonth(long j9) {
        int dayOfYear = getDayOfYear(j9) - 1;
        if (dayOfYear == 354) {
            return 30;
        }
        return ((dayOfYear % MONTH_PAIR_LENGTH) % 30) + 1;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInMonthMax() {
        return 30;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInMonthMax(int i9) {
        if (i9 == 12 || (i9 - 1) % 2 == 0) {
            return 30;
        }
        return SHORT_MONTH_LENGTH;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInYear(int i9) {
        return isLeapYear(i9) ? 355 : 354;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInYearMax() {
        return 355;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInYearMonth(int i9, int i10) {
        if ((i10 == 12 && isLeapYear(i9)) || (i10 - 1) % 2 == 0) {
            return 30;
        }
        return SHORT_MONTH_LENGTH;
    }

    public LeapYearPatternType getLeapYearPatternType() {
        return this.iLeapYears;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMaxYear() {
        return MAX_YEAR;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMinYear() {
        return 1;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMonthOfYear(long j9, int i9) {
        int yearMillis = (int) ((j9 - getYearMillis(i9)) / TimeChart.DAY);
        if (yearMillis == 354) {
            return 12;
        }
        return ((yearMillis * 2) / MONTH_PAIR_LENGTH) + 1;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getTotalMillisByYearMonth(int i9, int i10) {
        int i11 = i10 - 1;
        int i12 = i11 % 2;
        int i13 = i11 / 2;
        return i12 == 1 ? (((long) i13) * MILLIS_PER_MONTH_PAIR) + MILLIS_PER_LONG_MONTH : ((long) i13) * MILLIS_PER_MONTH_PAIR;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        r6 = 30585600000L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0024, code lost:
    
        if (isLeapYear(r0) != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        r6 = 30672000000L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
    
        r6 = 30585600000L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        if (r9 < r6) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        r9 = r9 - r6;
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (isLeapYear(r0) == false) goto L5;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0034 -> B:4:0x0026). Please report as a decompilation issue!!! */
    @Override // org.joda.time.chrono.BasicChronology
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getYear(long r9) {
        /*
            r8 = this;
            r0 = -42521587200000(0xffffd953abe65000, double:NaN)
            long r9 = r9 - r0
            r0 = 918518400000(0xd5dbf68400, double:4.53808386513E-312)
            long r2 = r9 / r0
            long r9 = r9 % r0
            r0 = 30
            long r2 = r2 * r0
            r0 = 1
            long r2 = r2 + r0
            int r0 = (int) r2
            boolean r1 = r8.isLeapYear(r0)
            r2 = 30585600000(0x71f0b3800, double:1.51112942174E-313)
            r4 = 30672000000(0x724319400, double:1.5153981489E-313)
            if (r1 == 0) goto L28
        L26:
            r6 = r4
            goto L29
        L28:
            r6 = r2
        L29:
            int r1 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r1 < 0) goto L37
            long r9 = r9 - r6
            int r0 = r0 + 1
            boolean r1 = r8.isLeapYear(r0)
            if (r1 == 0) goto L28
            goto L26
        L37:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.IslamicChronology.getYear(long):int");
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
    public int hashCode() {
        return (super.hashCode() * 13) + getLeapYearPatternType().hashCode();
    }

    @Override // org.joda.time.chrono.BasicChronology
    public boolean isLeapYear(int i9) {
        return this.iLeapYears.isLeapYear(i9);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long setYear(long j9, int i9) {
        int dayOfYear = getDayOfYear(j9, getYear(j9));
        int millisOfDay = getMillisOfDay(j9);
        if (dayOfYear > 354 && !isLeapYear(i9)) {
            dayOfYear--;
        }
        return getYearMonthDayMillis(i9, 1, dayOfYear) + ((long) millisOfDay);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withUTC() {
        return INSTANCE_UTC;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        return dateTimeZone == getZone() ? this : getInstance(dateTimeZone);
    }
}
