package org.joda.time.field;

import com.google.android.gms.common.api.a;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

/* JADX INFO: loaded from: classes4.dex */
public class OffsetDateTimeField extends DecoratedDateTimeField {
    private static final long serialVersionUID = 3145790132623583142L;
    private final int iMax;
    private final int iMin;
    private final int iOffset;

    public OffsetDateTimeField(DateTimeField dateTimeField, int i9) {
        this(dateTimeField, dateTimeField == null ? null : dateTimeField.getType(), i9, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER);
    }

    public OffsetDateTimeField(DateTimeField dateTimeField, DateTimeFieldType dateTimeFieldType, int i9) {
        this(dateTimeField, dateTimeFieldType, i9, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER);
    }

    public OffsetDateTimeField(DateTimeField dateTimeField, DateTimeFieldType dateTimeFieldType, int i9, int i10, int i11) {
        super(dateTimeField, dateTimeFieldType);
        if (i9 == 0) {
            throw new IllegalArgumentException("The offset cannot be zero");
        }
        this.iOffset = i9;
        if (i10 < dateTimeField.getMinimumValue() + i9) {
            this.iMin = dateTimeField.getMinimumValue() + i9;
        } else {
            this.iMin = i10;
        }
        if (i11 > dateTimeField.getMaximumValue() + i9) {
            this.iMax = dateTimeField.getMaximumValue() + i9;
        } else {
            this.iMax = i11;
        }
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j9, int i9) {
        long jAdd = super.add(j9, i9);
        FieldUtils.verifyValueBounds(this, get(jAdd), this.iMin, this.iMax);
        return jAdd;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j9, long j10) {
        long jAdd = super.add(j9, j10);
        FieldUtils.verifyValueBounds(this, get(jAdd), this.iMin, this.iMax);
        return jAdd;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j9, int i9) {
        return set(j9, FieldUtils.getWrappedValue(get(j9), i9, this.iMin, this.iMax));
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j9) {
        return super.get(j9) + this.iOffset;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getLeapAmount(long j9) {
        return getWrappedField().getLeapAmount(j9);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return getWrappedField().getLeapDurationField();
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iMax;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.iMin;
    }

    public int getOffset() {
        return this.iOffset;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j9) {
        return getWrappedField().isLeap(j9);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j9) {
        return getWrappedField().remainder(j9);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundCeiling(long j9) {
        return getWrappedField().roundCeiling(j9);
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j9) {
        return getWrappedField().roundFloor(j9);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundHalfCeiling(long j9) {
        return getWrappedField().roundHalfCeiling(j9);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundHalfEven(long j9) {
        return getWrappedField().roundHalfEven(j9);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundHalfFloor(long j9) {
        return getWrappedField().roundHalfFloor(j9);
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j9, int i9) {
        FieldUtils.verifyValueBounds(this, i9, this.iMin, this.iMax);
        return super.set(j9, i9 - this.iOffset);
    }
}
