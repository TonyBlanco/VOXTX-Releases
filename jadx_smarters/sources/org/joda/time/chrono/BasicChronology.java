package org.joda.time.chrono;

import java.util.Locale;
import org.achartengine.chart.TimeChart;
import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.PreciseDateTimeField;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.field.ZeroIsMaxDateTimeField;

/* JADX INFO: loaded from: classes4.dex */
abstract class BasicChronology extends AssembledChronology {
    private static final int CACHE_MASK = 1023;
    private static final int CACHE_SIZE = 1024;
    private static final DateTimeField cClockhourOfDayField;
    private static final DateTimeField cClockhourOfHalfdayField;
    private static final DurationField cDaysField;
    private static final DateTimeField cHalfdayOfDayField;
    private static final DurationField cHalfdaysField;
    private static final DateTimeField cHourOfDayField;
    private static final DateTimeField cHourOfHalfdayField;
    private static final DurationField cHoursField;
    private static final DurationField cMillisField;
    private static final DateTimeField cMillisOfDayField;
    private static final DateTimeField cMillisOfSecondField;
    private static final DateTimeField cMinuteOfDayField;
    private static final DateTimeField cMinuteOfHourField;
    private static final DurationField cMinutesField;
    private static final DateTimeField cSecondOfDayField;
    private static final DateTimeField cSecondOfMinuteField;
    private static final DurationField cSecondsField;
    private static final DurationField cWeeksField;
    private static final long serialVersionUID = 8283225332206808863L;
    private final int iMinDaysInFirstWeek;
    private final transient YearInfo[] iYearInfoCache;

    public static class HalfdayField extends PreciseDateTimeField {
        private static final long serialVersionUID = 581601443656929254L;

        public HalfdayField() {
            super(DateTimeFieldType.halfdayOfDay(), BasicChronology.cHalfdaysField, BasicChronology.cDaysField);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(int i9, Locale locale) {
            return GJLocaleSymbols.forLocale(locale).halfdayValueToText(i9);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumTextLength(Locale locale) {
            return GJLocaleSymbols.forLocale(locale).getHalfdayMaxTextLength();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j9, String str, Locale locale) {
            return set(j9, GJLocaleSymbols.forLocale(locale).halfdayTextToValue(str));
        }
    }

    public static class YearInfo {
        public final long iFirstDayMillis;
        public final int iYear;

        public YearInfo(int i9, long j9) {
            this.iYear = i9;
            this.iFirstDayMillis = j9;
        }
    }

    static {
        DurationField durationField = MillisDurationField.INSTANCE;
        cMillisField = durationField;
        PreciseDurationField preciseDurationField = new PreciseDurationField(DurationFieldType.seconds(), 1000L);
        cSecondsField = preciseDurationField;
        PreciseDurationField preciseDurationField2 = new PreciseDurationField(DurationFieldType.minutes(), 60000L);
        cMinutesField = preciseDurationField2;
        PreciseDurationField preciseDurationField3 = new PreciseDurationField(DurationFieldType.hours(), 3600000L);
        cHoursField = preciseDurationField3;
        PreciseDurationField preciseDurationField4 = new PreciseDurationField(DurationFieldType.halfdays(), 43200000L);
        cHalfdaysField = preciseDurationField4;
        PreciseDurationField preciseDurationField5 = new PreciseDurationField(DurationFieldType.days(), TimeChart.DAY);
        cDaysField = preciseDurationField5;
        cWeeksField = new PreciseDurationField(DurationFieldType.weeks(), 604800000L);
        cMillisOfSecondField = new PreciseDateTimeField(DateTimeFieldType.millisOfSecond(), durationField, preciseDurationField);
        cMillisOfDayField = new PreciseDateTimeField(DateTimeFieldType.millisOfDay(), durationField, preciseDurationField5);
        cSecondOfMinuteField = new PreciseDateTimeField(DateTimeFieldType.secondOfMinute(), preciseDurationField, preciseDurationField2);
        cSecondOfDayField = new PreciseDateTimeField(DateTimeFieldType.secondOfDay(), preciseDurationField, preciseDurationField5);
        cMinuteOfHourField = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), preciseDurationField2, preciseDurationField3);
        cMinuteOfDayField = new PreciseDateTimeField(DateTimeFieldType.minuteOfDay(), preciseDurationField2, preciseDurationField5);
        PreciseDateTimeField preciseDateTimeField = new PreciseDateTimeField(DateTimeFieldType.hourOfDay(), preciseDurationField3, preciseDurationField5);
        cHourOfDayField = preciseDateTimeField;
        PreciseDateTimeField preciseDateTimeField2 = new PreciseDateTimeField(DateTimeFieldType.hourOfHalfday(), preciseDurationField3, preciseDurationField4);
        cHourOfHalfdayField = preciseDateTimeField2;
        cClockhourOfDayField = new ZeroIsMaxDateTimeField(preciseDateTimeField, DateTimeFieldType.clockhourOfDay());
        cClockhourOfHalfdayField = new ZeroIsMaxDateTimeField(preciseDateTimeField2, DateTimeFieldType.clockhourOfHalfday());
        cHalfdayOfDayField = new HalfdayField();
    }

    public BasicChronology(Chronology chronology, Object obj, int i9) {
        super(chronology, obj);
        this.iYearInfoCache = new YearInfo[1024];
        if (i9 >= 1 && i9 <= 7) {
            this.iMinDaysInFirstWeek = i9;
            return;
        }
        throw new IllegalArgumentException("Invalid min days in first week: " + i9);
    }

    private YearInfo getYearInfo(int i9) {
        YearInfo[] yearInfoArr = this.iYearInfoCache;
        int i10 = i9 & CACHE_MASK;
        YearInfo yearInfo = yearInfoArr[i10];
        if (yearInfo != null && yearInfo.iYear == i9) {
            return yearInfo;
        }
        YearInfo yearInfo2 = new YearInfo(i9, calculateFirstDayOfYearMillis(i9));
        this.iYearInfoCache[i10] = yearInfo2;
        return yearInfo2;
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        fields.millis = cMillisField;
        fields.seconds = cSecondsField;
        fields.minutes = cMinutesField;
        fields.hours = cHoursField;
        fields.halfdays = cHalfdaysField;
        fields.days = cDaysField;
        fields.weeks = cWeeksField;
        fields.millisOfSecond = cMillisOfSecondField;
        fields.millisOfDay = cMillisOfDayField;
        fields.secondOfMinute = cSecondOfMinuteField;
        fields.secondOfDay = cSecondOfDayField;
        fields.minuteOfHour = cMinuteOfHourField;
        fields.minuteOfDay = cMinuteOfDayField;
        fields.hourOfDay = cHourOfDayField;
        fields.hourOfHalfday = cHourOfHalfdayField;
        fields.clockhourOfDay = cClockhourOfDayField;
        fields.clockhourOfHalfday = cClockhourOfHalfdayField;
        fields.halfdayOfDay = cHalfdayOfDayField;
        BasicYearDateTimeField basicYearDateTimeField = new BasicYearDateTimeField(this);
        fields.year = basicYearDateTimeField;
        GJYearOfEraDateTimeField gJYearOfEraDateTimeField = new GJYearOfEraDateTimeField(basicYearDateTimeField, this);
        fields.yearOfEra = gJYearOfEraDateTimeField;
        DividedDateTimeField dividedDateTimeField = new DividedDateTimeField(new OffsetDateTimeField(gJYearOfEraDateTimeField, 99), DateTimeFieldType.centuryOfEra(), 100);
        fields.centuryOfEra = dividedDateTimeField;
        fields.centuries = dividedDateTimeField.getDurationField();
        fields.yearOfCentury = new OffsetDateTimeField(new RemainderDateTimeField((DividedDateTimeField) fields.centuryOfEra), DateTimeFieldType.yearOfCentury(), 1);
        fields.era = new GJEraDateTimeField(this);
        fields.dayOfWeek = new GJDayOfWeekDateTimeField(this, fields.days);
        fields.dayOfMonth = new BasicDayOfMonthDateTimeField(this, fields.days);
        fields.dayOfYear = new BasicDayOfYearDateTimeField(this, fields.days);
        fields.monthOfYear = new GJMonthOfYearDateTimeField(this);
        fields.weekyear = new BasicWeekyearDateTimeField(this);
        fields.weekOfWeekyear = new BasicWeekOfWeekyearDateTimeField(this, fields.weeks);
        fields.weekyearOfCentury = new OffsetDateTimeField(new RemainderDateTimeField(fields.weekyear, fields.centuries, DateTimeFieldType.weekyearOfCentury(), 100), DateTimeFieldType.weekyearOfCentury(), 1);
        fields.years = fields.year.getDurationField();
        fields.months = fields.monthOfYear.getDurationField();
        fields.weekyears = fields.weekyear.getDurationField();
    }

    public abstract long calculateFirstDayOfYearMillis(int i9);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BasicChronology basicChronology = (BasicChronology) obj;
        return getMinimumDaysInFirstWeek() == basicChronology.getMinimumDaysInFirstWeek() && getZone().equals(basicChronology.getZone());
    }

    public abstract long getApproxMillisAtEpochDividedByTwo();

    public abstract long getAverageMillisPerMonth();

    public abstract long getAverageMillisPerYear();

    public abstract long getAverageMillisPerYearDividedByTwo();

    public long getDateMidnightMillis(int i9, int i10, int i11) {
        FieldUtils.verifyValueBounds(DateTimeFieldType.year(), i9, getMinYear(), getMaxYear());
        FieldUtils.verifyValueBounds(DateTimeFieldType.monthOfYear(), i10, 1, getMaxMonth(i9));
        FieldUtils.verifyValueBounds(DateTimeFieldType.dayOfMonth(), i11, 1, getDaysInYearMonth(i9, i10));
        return getYearMonthDayMillis(i9, i10, i11);
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i9, int i10, int i11, int i12) throws IllegalArgumentException {
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i9, i10, i11, i12);
        }
        FieldUtils.verifyValueBounds(DateTimeFieldType.millisOfDay(), i12, 0, 86399999);
        return getDateMidnightMillis(i9, i10, i11) + ((long) i12);
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i9, int i10, int i11, int i12, int i13, int i14, int i15) throws IllegalArgumentException {
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i9, i10, i11, i12, i13, i14, i15);
        }
        FieldUtils.verifyValueBounds(DateTimeFieldType.hourOfDay(), i12, 0, 23);
        FieldUtils.verifyValueBounds(DateTimeFieldType.minuteOfHour(), i13, 0, 59);
        FieldUtils.verifyValueBounds(DateTimeFieldType.secondOfMinute(), i14, 0, 59);
        FieldUtils.verifyValueBounds(DateTimeFieldType.millisOfSecond(), i15, 0, 999);
        return getDateMidnightMillis(i9, i10, i11) + ((long) (i12 * DateTimeConstants.MILLIS_PER_HOUR)) + ((long) (i13 * DateTimeConstants.MILLIS_PER_MINUTE)) + ((long) (i14 * 1000)) + ((long) i15);
    }

    public int getDayOfMonth(long j9) {
        int year = getYear(j9);
        return getDayOfMonth(j9, year, getMonthOfYear(j9, year));
    }

    public int getDayOfMonth(long j9, int i9) {
        return getDayOfMonth(j9, i9, getMonthOfYear(j9, i9));
    }

    public int getDayOfMonth(long j9, int i9, int i10) {
        return ((int) ((j9 - (getYearMillis(i9) + getTotalMillisByYearMonth(i9, i10))) / TimeChart.DAY)) + 1;
    }

    public int getDayOfWeek(long j9) {
        long j10;
        if (j9 >= 0) {
            j10 = j9 / TimeChart.DAY;
        } else {
            j10 = (j9 - 86399999) / TimeChart.DAY;
            if (j10 < -3) {
                return ((int) ((j10 + 4) % 7)) + 7;
            }
        }
        return ((int) ((j10 + 3) % 7)) + 1;
    }

    public int getDayOfYear(long j9) {
        return getDayOfYear(j9, getYear(j9));
    }

    public int getDayOfYear(long j9, int i9) {
        return ((int) ((j9 - getYearMillis(i9)) / TimeChart.DAY)) + 1;
    }

    public int getDaysInMonthMax() {
        return 31;
    }

    public abstract int getDaysInMonthMax(int i9);

    public int getDaysInMonthMax(long j9) {
        int year = getYear(j9);
        return getDaysInYearMonth(year, getMonthOfYear(j9, year));
    }

    public int getDaysInMonthMaxForSet(long j9, int i9) {
        return getDaysInMonthMax(j9);
    }

    public int getDaysInYear(int i9) {
        return isLeapYear(i9) ? 366 : 365;
    }

    public int getDaysInYearMax() {
        return 366;
    }

    public abstract int getDaysInYearMonth(int i9, int i10);

    public long getFirstWeekOfYearMillis(int i9) {
        long yearMillis = getYearMillis(i9);
        int dayOfWeek = getDayOfWeek(yearMillis);
        return dayOfWeek > 8 - this.iMinDaysInFirstWeek ? yearMillis + (((long) (8 - dayOfWeek)) * TimeChart.DAY) : yearMillis - (((long) (dayOfWeek - 1)) * TimeChart.DAY);
    }

    public int getMaxMonth() {
        return 12;
    }

    public int getMaxMonth(int i9) {
        return getMaxMonth();
    }

    public abstract int getMaxYear();

    public int getMillisOfDay(long j9) {
        return j9 >= 0 ? (int) (j9 % TimeChart.DAY) : ((int) ((j9 + 1) % TimeChart.DAY)) + 86399999;
    }

    public abstract int getMinYear();

    public int getMinimumDaysInFirstWeek() {
        return this.iMinDaysInFirstWeek;
    }

    public int getMonthOfYear(long j9) {
        return getMonthOfYear(j9, getYear(j9));
    }

    public abstract int getMonthOfYear(long j9, int i9);

    public abstract long getTotalMillisByYearMonth(int i9, int i10);

    public int getWeekOfWeekyear(long j9) {
        return getWeekOfWeekyear(j9, getYear(j9));
    }

    public int getWeekOfWeekyear(long j9, int i9) {
        long firstWeekOfYearMillis = getFirstWeekOfYearMillis(i9);
        if (j9 < firstWeekOfYearMillis) {
            return getWeeksInYear(i9 - 1);
        }
        if (j9 >= getFirstWeekOfYearMillis(i9 + 1)) {
            return 1;
        }
        return ((int) ((j9 - firstWeekOfYearMillis) / 604800000)) + 1;
    }

    public int getWeeksInYear(int i9) {
        return (int) ((getFirstWeekOfYearMillis(i9 + 1) - getFirstWeekOfYearMillis(i9)) / 604800000);
    }

    public int getWeekyear(long j9) {
        long j10;
        int year = getYear(j9);
        int weekOfWeekyear = getWeekOfWeekyear(j9, year);
        if (weekOfWeekyear == 1) {
            j10 = j9 + 604800000;
        } else {
            if (weekOfWeekyear <= 51) {
                return year;
            }
            j10 = j9 - 1209600000;
        }
        return getYear(j10);
    }

    public int getYear(long j9) {
        long averageMillisPerYearDividedByTwo = getAverageMillisPerYearDividedByTwo();
        long approxMillisAtEpochDividedByTwo = (j9 >> 1) + getApproxMillisAtEpochDividedByTwo();
        if (approxMillisAtEpochDividedByTwo < 0) {
            approxMillisAtEpochDividedByTwo = (approxMillisAtEpochDividedByTwo - averageMillisPerYearDividedByTwo) + 1;
        }
        int i9 = (int) (approxMillisAtEpochDividedByTwo / averageMillisPerYearDividedByTwo);
        long yearMillis = getYearMillis(i9);
        long j10 = j9 - yearMillis;
        if (j10 < 0) {
            return i9 - 1;
        }
        if (j10 >= 31536000000L) {
            return yearMillis + (isLeapYear(i9) ? 31622400000L : 31536000000L) <= j9 ? i9 + 1 : i9;
        }
        return i9;
    }

    public abstract long getYearDifference(long j9, long j10);

    public long getYearMillis(int i9) {
        return getYearInfo(i9).iFirstDayMillis;
    }

    public long getYearMonthDayMillis(int i9, int i10, int i11) {
        return getYearMillis(i9) + getTotalMillisByYearMonth(i9, i10) + (((long) (i11 - 1)) * TimeChart.DAY);
    }

    public long getYearMonthMillis(int i9, int i10) {
        return getYearMillis(i9) + getTotalMillisByYearMonth(i9, i10);
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public DateTimeZone getZone() {
        Chronology base = getBase();
        return base != null ? base.getZone() : DateTimeZone.UTC;
    }

    public int hashCode() {
        return (getClass().getName().hashCode() * 11) + getZone().hashCode() + getMinimumDaysInFirstWeek();
    }

    public boolean isLeapDay(long j9) {
        return false;
    }

    public abstract boolean isLeapYear(int i9);

    public abstract long setYear(long j9, int i9);

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        String name = getClass().getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            name = name.substring(iLastIndexOf + 1);
        }
        sb.append(name);
        sb.append('[');
        DateTimeZone zone = getZone();
        if (zone != null) {
            sb.append(zone.getID());
        }
        if (getMinimumDaysInFirstWeek() != 4) {
            sb.append(",mdfw=");
            sb.append(getMinimumDaysInFirstWeek());
        }
        sb.append(']');
        return sb.toString();
    }
}
