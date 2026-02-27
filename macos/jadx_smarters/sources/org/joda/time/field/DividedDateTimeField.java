package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

/* JADX INFO: loaded from: classes4.dex */
public class DividedDateTimeField extends DecoratedDateTimeField {
    private static final long serialVersionUID = 8318475124230605365L;
    final int iDivisor;
    final DurationField iDurationField;
    private final int iMax;
    private final int iMin;
    final DurationField iRangeDurationField;

    public DividedDateTimeField(DateTimeField dateTimeField, DateTimeFieldType dateTimeFieldType, int i9) {
        this(dateTimeField, dateTimeField.getRangeDurationField(), dateTimeFieldType, i9);
    }

    public DividedDateTimeField(DateTimeField dateTimeField, DurationField durationField, DateTimeFieldType dateTimeFieldType, int i9) {
        super(dateTimeField, dateTimeFieldType);
        if (i9 < 2) {
            throw new IllegalArgumentException("The divisor must be at least 2");
        }
        DurationField durationField2 = dateTimeField.getDurationField();
        if (durationField2 == null) {
            this.iDurationField = null;
        } else {
            this.iDurationField = new ScaledDurationField(durationField2, dateTimeFieldType.getDurationType(), i9);
        }
        this.iRangeDurationField = durationField;
        this.iDivisor = i9;
        int minimumValue = dateTimeField.getMinimumValue();
        int i10 = minimumValue >= 0 ? minimumValue / i9 : ((minimumValue + 1) / i9) - 1;
        int maximumValue = dateTimeField.getMaximumValue();
        int i11 = maximumValue >= 0 ? maximumValue / i9 : ((maximumValue + 1) / i9) - 1;
        this.iMin = i10;
        this.iMax = i11;
    }

    public DividedDateTimeField(RemainderDateTimeField remainderDateTimeField, DateTimeFieldType dateTimeFieldType) {
        this(remainderDateTimeField, (DurationField) null, dateTimeFieldType);
    }

    public DividedDateTimeField(RemainderDateTimeField remainderDateTimeField, DurationField durationField, DateTimeFieldType dateTimeFieldType) {
        super(remainderDateTimeField.getWrappedField(), dateTimeFieldType);
        int i9 = remainderDateTimeField.iDivisor;
        this.iDivisor = i9;
        this.iDurationField = remainderDateTimeField.iRangeField;
        this.iRangeDurationField = durationField;
        DateTimeField wrappedField = getWrappedField();
        int minimumValue = wrappedField.getMinimumValue();
        int i10 = minimumValue >= 0 ? minimumValue / i9 : ((minimumValue + 1) / i9) - 1;
        int maximumValue = wrappedField.getMaximumValue();
        int i11 = maximumValue >= 0 ? maximumValue / i9 : ((maximumValue + 1) / i9) - 1;
        this.iMin = i10;
        this.iMax = i11;
    }

    private int getRemainder(int i9) {
        int i10 = this.iDivisor;
        return i9 >= 0 ? i9 % i10 : (i10 - 1) + ((i9 + 1) % i10);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j9, int i9) {
        return getWrappedField().add(j9, i9 * this.iDivisor);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j9, long j10) {
        return getWrappedField().add(j9, j10 * ((long) this.iDivisor));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j9, int i9) {
        return set(j9, FieldUtils.getWrappedValue(get(j9), i9, this.iMin, this.iMax));
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j9) {
        int i9 = getWrappedField().get(j9);
        return i9 >= 0 ? i9 / this.iDivisor : ((i9 + 1) / this.iDivisor) - 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getDifference(long j9, long j10) {
        return getWrappedField().getDifference(j9, j10) / this.iDivisor;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j9, long j10) {
        return getWrappedField().getDifferenceAsLong(j9, j10) / ((long) this.iDivisor);
    }

    public int getDivisor() {
        return this.iDivisor;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getDurationField() {
        return this.iDurationField;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iMax;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.iMin;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        DurationField durationField = this.iRangeDurationField;
        return durationField != null ? durationField : super.getRangeDurationField();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j9) {
        return set(j9, get(getWrappedField().remainder(j9)));
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j9) {
        DateTimeField wrappedField = getWrappedField();
        return wrappedField.roundFloor(wrappedField.set(j9, get(j9) * this.iDivisor));
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j9, int i9) {
        FieldUtils.verifyValueBounds(this, i9, this.iMin, this.iMax);
        return getWrappedField().set(j9, (i9 * this.iDivisor) + getRemainder(getWrappedField().get(j9)));
    }
}
