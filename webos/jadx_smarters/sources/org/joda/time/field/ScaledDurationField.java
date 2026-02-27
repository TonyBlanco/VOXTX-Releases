package org.joda.time.field;

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes4.dex */
public class ScaledDurationField extends DecoratedDurationField {
    private static final long serialVersionUID = -3205227092378684157L;
    private final int iScalar;

    public ScaledDurationField(DurationField durationField, DurationFieldType durationFieldType, int i9) {
        super(durationField, durationFieldType);
        if (i9 == 0 || i9 == 1) {
            throw new IllegalArgumentException("The scalar must not be 0 or 1");
        }
        this.iScalar = i9;
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long add(long j9, int i9) {
        return getWrappedField().add(j9, ((long) i9) * ((long) this.iScalar));
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long add(long j9, long j10) {
        return getWrappedField().add(j9, FieldUtils.safeMultiply(j10, this.iScalar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScaledDurationField)) {
            return false;
        }
        ScaledDurationField scaledDurationField = (ScaledDurationField) obj;
        return getWrappedField().equals(scaledDurationField.getWrappedField()) && getType() == scaledDurationField.getType() && this.iScalar == scaledDurationField.iScalar;
    }

    @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
    public int getDifference(long j9, long j10) {
        return getWrappedField().getDifference(j9, j10) / this.iScalar;
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long getDifferenceAsLong(long j9, long j10) {
        return getWrappedField().getDifferenceAsLong(j9, j10) / ((long) this.iScalar);
    }

    @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
    public long getMillis(int i9) {
        return getWrappedField().getMillis(((long) i9) * ((long) this.iScalar));
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long getMillis(int i9, long j9) {
        return getWrappedField().getMillis(((long) i9) * ((long) this.iScalar), j9);
    }

    @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
    public long getMillis(long j9) {
        return getWrappedField().getMillis(FieldUtils.safeMultiply(j9, this.iScalar));
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long getMillis(long j9, long j10) {
        return getWrappedField().getMillis(FieldUtils.safeMultiply(j9, this.iScalar), j10);
    }

    public int getScalar() {
        return this.iScalar;
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long getUnitMillis() {
        return getWrappedField().getUnitMillis() * ((long) this.iScalar);
    }

    @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
    public int getValue(long j9) {
        return getWrappedField().getValue(j9) / this.iScalar;
    }

    @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
    public int getValue(long j9, long j10) {
        return getWrappedField().getValue(j9, j10) / this.iScalar;
    }

    @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
    public long getValueAsLong(long j9) {
        return getWrappedField().getValueAsLong(j9) / ((long) this.iScalar);
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long getValueAsLong(long j9, long j10) {
        return getWrappedField().getValueAsLong(j9, j10) / ((long) this.iScalar);
    }

    public int hashCode() {
        long j9 = this.iScalar;
        return ((int) (j9 ^ (j9 >>> 32))) + getType().hashCode() + getWrappedField().hashCode();
    }
}
