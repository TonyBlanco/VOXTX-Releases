package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;

/* JADX INFO: loaded from: classes4.dex */
class BasicMonthOfYearDateTimeField extends ImpreciseDateTimeField {
    private static final int MIN = 1;
    private static final long serialVersionUID = -8258715387168736L;
    private final BasicChronology iChronology;
    private final int iLeapMonth;
    private final int iMax;

    public BasicMonthOfYearDateTimeField(BasicChronology basicChronology, int i9) {
        super(DateTimeFieldType.monthOfYear(), basicChronology.getAverageMillisPerMonth());
        this.iChronology = basicChronology;
        this.iMax = basicChronology.getMaxMonth();
        this.iLeapMonth = i9;
    }

    private Object readResolve() {
        return this.iChronology.monthOfYear();
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j9, int i9) {
        int i10;
        int i11;
        if (i9 == 0) {
            return j9;
        }
        long millisOfDay = this.iChronology.getMillisOfDay(j9);
        int year = this.iChronology.getYear(j9);
        int monthOfYear = this.iChronology.getMonthOfYear(j9, year);
        int i12 = (monthOfYear - 1) + i9;
        int i13 = this.iMax;
        if (i12 >= 0) {
            i10 = (i12 / i13) + year;
            i11 = (i12 % i13) + 1;
        } else {
            i10 = year + (i12 / i13);
            int i14 = i10 - 1;
            int iAbs = Math.abs(i12);
            int i15 = this.iMax;
            int i16 = iAbs % i15;
            if (i16 == 0) {
                i16 = i15;
            }
            i11 = (i15 - i16) + 1;
            if (i11 != 1) {
                i10 = i14;
            }
        }
        int dayOfMonth = this.iChronology.getDayOfMonth(j9, year, monthOfYear);
        int daysInYearMonth = this.iChronology.getDaysInYearMonth(i10, i11);
        if (dayOfMonth > daysInYearMonth) {
            dayOfMonth = daysInYearMonth;
        }
        return this.iChronology.getYearMonthDayMillis(i10, i11, dayOfMonth) + millisOfDay;
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j9, long j10) {
        long j11;
        long j12;
        int i9 = (int) j10;
        if (i9 == j10) {
            return add(j9, i9);
        }
        long millisOfDay = this.iChronology.getMillisOfDay(j9);
        int year = this.iChronology.getYear(j9);
        int monthOfYear = this.iChronology.getMonthOfYear(j9, year);
        long j13 = ((long) (monthOfYear - 1)) + j10;
        if (j13 >= 0) {
            int i10 = this.iMax;
            j11 = ((long) year) + (j13 / ((long) i10));
            j12 = (j13 % ((long) i10)) + 1;
        } else {
            j11 = ((long) year) + (j13 / ((long) this.iMax));
            long j14 = j11 - 1;
            long jAbs = Math.abs(j13);
            int i11 = this.iMax;
            int i12 = (int) (jAbs % ((long) i11));
            if (i12 == 0) {
                i12 = i11;
            }
            j12 = (i11 - i12) + 1;
            if (j12 != 1) {
                j11 = j14;
            }
        }
        if (j11 < this.iChronology.getMinYear() || j11 > this.iChronology.getMaxYear()) {
            throw new IllegalArgumentException("Magnitude of add amount is too large: " + j10);
        }
        int i13 = (int) j11;
        int i14 = (int) j12;
        int dayOfMonth = this.iChronology.getDayOfMonth(j9, year, monthOfYear);
        int daysInYearMonth = this.iChronology.getDaysInYearMonth(i13, i14);
        if (dayOfMonth > daysInYearMonth) {
            dayOfMonth = daysInYearMonth;
        }
        return this.iChronology.getYearMonthDayMillis(i13, i14, dayOfMonth) + millisOfDay;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int[] add(ReadablePartial readablePartial, int i9, int[] iArr, int i10) {
        if (i10 == 0) {
            return iArr;
        }
        if (readablePartial.size() > 0 && readablePartial.getFieldType(0).equals(DateTimeFieldType.monthOfYear()) && i9 == 0) {
            return set(readablePartial, 0, iArr, ((((readablePartial.getValue(0) - 1) + (i10 % 12)) + 12) % 12) + 1);
        }
        if (!DateTimeUtils.isContiguous(readablePartial)) {
            return super.add(readablePartial, i9, iArr, i10);
        }
        int size = readablePartial.size();
        long j9 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j9 = readablePartial.getFieldType(i11).getField(this.iChronology).set(j9, iArr[i11]);
        }
        return this.iChronology.get(readablePartial, add(j9, i10));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j9, int i9) {
        return set(j9, FieldUtils.getWrappedValue(get(j9), i9, 1, this.iMax));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j9) {
        return this.iChronology.getMonthOfYear(j9);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j9, long j10) {
        if (j9 < j10) {
            return -getDifference(j10, j9);
        }
        int year = this.iChronology.getYear(j9);
        int monthOfYear = this.iChronology.getMonthOfYear(j9, year);
        int year2 = this.iChronology.getYear(j10);
        int monthOfYear2 = this.iChronology.getMonthOfYear(j10, year2);
        long j11 = ((((long) (year - year2)) * ((long) this.iMax)) + ((long) monthOfYear)) - ((long) monthOfYear2);
        int dayOfMonth = this.iChronology.getDayOfMonth(j9, year, monthOfYear);
        if (dayOfMonth == this.iChronology.getDaysInYearMonth(year, monthOfYear) && this.iChronology.getDayOfMonth(j10, year2, monthOfYear2) > dayOfMonth) {
            j10 = this.iChronology.dayOfMonth().set(j10, dayOfMonth);
        }
        return j9 - this.iChronology.getYearMonthMillis(year, monthOfYear) < j10 - this.iChronology.getYearMonthMillis(year2, monthOfYear2) ? j11 - 1 : j11;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getLeapAmount(long j9) {
        return isLeap(j9) ? 1 : 0;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return this.iChronology.days();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iMax;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 1;
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.iChronology.years();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j9) {
        int year = this.iChronology.getYear(j9);
        return this.iChronology.isLeapYear(year) && this.iChronology.getMonthOfYear(j9, year) == this.iLeapMonth;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j9) {
        return j9 - roundFloor(j9);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j9) {
        int year = this.iChronology.getYear(j9);
        return this.iChronology.getYearMonthMillis(year, this.iChronology.getMonthOfYear(j9, year));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j9, int i9) {
        FieldUtils.verifyValueBounds(this, i9, 1, this.iMax);
        int year = this.iChronology.getYear(j9);
        int dayOfMonth = this.iChronology.getDayOfMonth(j9, year);
        int daysInYearMonth = this.iChronology.getDaysInYearMonth(year, i9);
        if (dayOfMonth > daysInYearMonth) {
            dayOfMonth = daysInYearMonth;
        }
        return this.iChronology.getYearMonthDayMillis(year, i9, dayOfMonth) + ((long) this.iChronology.getMillisOfDay(j9));
    }
}
