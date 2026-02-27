package org.joda.time.field;

import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes4.dex */
public class PreciseDurationField extends BaseDurationField {
    private static final long serialVersionUID = -8346152187724495365L;
    private final long iUnitMillis;

    public PreciseDurationField(DurationFieldType durationFieldType, long j9) {
        super(durationFieldType);
        this.iUnitMillis = j9;
    }

    @Override // org.joda.time.DurationField
    public long add(long j9, int i9) {
        return FieldUtils.safeAdd(j9, ((long) i9) * this.iUnitMillis);
    }

    @Override // org.joda.time.DurationField
    public long add(long j9, long j10) {
        return FieldUtils.safeAdd(j9, FieldUtils.safeMultiply(j10, this.iUnitMillis));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreciseDurationField)) {
            return false;
        }
        PreciseDurationField preciseDurationField = (PreciseDurationField) obj;
        return getType() == preciseDurationField.getType() && this.iUnitMillis == preciseDurationField.iUnitMillis;
    }

    @Override // org.joda.time.DurationField
    public long getDifferenceAsLong(long j9, long j10) {
        return FieldUtils.safeSubtract(j9, j10) / this.iUnitMillis;
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i9, long j9) {
        return ((long) i9) * this.iUnitMillis;
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j9, long j10) {
        return FieldUtils.safeMultiply(j9, this.iUnitMillis);
    }

    @Override // org.joda.time.DurationField
    public final long getUnitMillis() {
        return this.iUnitMillis;
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j9, long j10) {
        return j9 / this.iUnitMillis;
    }

    public int hashCode() {
        long j9 = this.iUnitMillis;
        return ((int) (j9 ^ (j9 >>> 32))) + getType().hashCode();
    }

    @Override // org.joda.time.DurationField
    public final boolean isPrecise() {
        return true;
    }
}
