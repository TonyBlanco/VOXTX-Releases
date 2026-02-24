package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.PreciseDurationDateTimeField;

/* JADX INFO: loaded from: classes4.dex */
final class BasicDayOfMonthDateTimeField extends PreciseDurationDateTimeField {
    private static final long serialVersionUID = -4677223814028011723L;
    private final BasicChronology iChronology;

    public BasicDayOfMonthDateTimeField(BasicChronology basicChronology, DurationField durationField) {
        super(DateTimeFieldType.dayOfMonth(), durationField);
        this.iChronology = basicChronology;
    }

    private Object readResolve() {
        return this.iChronology.dayOfMonth();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j9) {
        return this.iChronology.getDayOfMonth(j9);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iChronology.getDaysInMonthMax();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue(long j9) {
        return this.iChronology.getDaysInMonthMax(j9);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial) {
        if (!readablePartial.isSupported(DateTimeFieldType.monthOfYear())) {
            return getMaximumValue();
        }
        int i9 = readablePartial.get(DateTimeFieldType.monthOfYear());
        if (!readablePartial.isSupported(DateTimeFieldType.year())) {
            return this.iChronology.getDaysInMonthMax(i9);
        }
        return this.iChronology.getDaysInYearMonth(readablePartial.get(DateTimeFieldType.year()), i9);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
        int size = readablePartial.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (readablePartial.getFieldType(i9) == DateTimeFieldType.monthOfYear()) {
                int i10 = iArr[i9];
                for (int i11 = 0; i11 < size; i11++) {
                    if (readablePartial.getFieldType(i11) == DateTimeFieldType.year()) {
                        return this.iChronology.getDaysInYearMonth(iArr[i11], i10);
                    }
                }
                return this.iChronology.getDaysInMonthMax(i10);
            }
        }
        return getMaximumValue();
    }

    @Override // org.joda.time.field.PreciseDurationDateTimeField
    public int getMaximumValueForSet(long j9, int i9) {
        return this.iChronology.getDaysInMonthMaxForSet(j9, i9);
    }

    @Override // org.joda.time.field.PreciseDurationDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.iChronology.months();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j9) {
        return this.iChronology.isLeapDay(j9);
    }
}
