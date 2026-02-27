package org.joda.time.field;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ImpreciseDateTimeField extends BaseDateTimeField {
    private static final long serialVersionUID = 7190739608550251860L;
    private final DurationField iDurationField;
    final long iUnitMillis;

    public final class LinkedDurationField extends BaseDurationField {
        private static final long serialVersionUID = -203813474600094134L;

        public LinkedDurationField(DurationFieldType durationFieldType) {
            super(durationFieldType);
        }

        @Override // org.joda.time.DurationField
        public long add(long j9, int i9) {
            return ImpreciseDateTimeField.this.add(j9, i9);
        }

        @Override // org.joda.time.DurationField
        public long add(long j9, long j10) {
            return ImpreciseDateTimeField.this.add(j9, j10);
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getDifference(long j9, long j10) {
            return ImpreciseDateTimeField.this.getDifference(j9, j10);
        }

        @Override // org.joda.time.DurationField
        public long getDifferenceAsLong(long j9, long j10) {
            return ImpreciseDateTimeField.this.getDifferenceAsLong(j9, j10);
        }

        @Override // org.joda.time.DurationField
        public long getMillis(int i9, long j9) {
            return ImpreciseDateTimeField.this.add(j9, i9) - j9;
        }

        @Override // org.joda.time.DurationField
        public long getMillis(long j9, long j10) {
            return ImpreciseDateTimeField.this.add(j10, j9) - j10;
        }

        @Override // org.joda.time.DurationField
        public long getUnitMillis() {
            return ImpreciseDateTimeField.this.iUnitMillis;
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getValue(long j9, long j10) {
            return ImpreciseDateTimeField.this.getDifference(j9 + j10, j10);
        }

        @Override // org.joda.time.DurationField
        public long getValueAsLong(long j9, long j10) {
            return ImpreciseDateTimeField.this.getDifferenceAsLong(j9 + j10, j10);
        }

        @Override // org.joda.time.DurationField
        public boolean isPrecise() {
            return false;
        }
    }

    public ImpreciseDateTimeField(DateTimeFieldType dateTimeFieldType, long j9) {
        super(dateTimeFieldType);
        this.iUnitMillis = j9;
        this.iDurationField = new LinkedDurationField(dateTimeFieldType.getDurationType());
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long add(long j9, int i9);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long add(long j9, long j10);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract int get(long j9);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getDifference(long j9, long j10) {
        return FieldUtils.safeToInt(getDifferenceAsLong(j9, j10));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j9, long j10) {
        if (j9 < j10) {
            return -getDifferenceAsLong(j10, j9);
        }
        long j11 = (j9 - j10) / this.iUnitMillis;
        if (add(j10, j11) < j9) {
            while (true) {
                long j12 = j11 + 1;
                if (add(j10, j12) > j9) {
                    break;
                }
                j11 = j12;
            }
        } else if (add(j10, j11) > j9) {
            do {
                j11--;
            } while (add(j10, j11) > j9);
        }
        return j11;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final DurationField getDurationField() {
        return this.iDurationField;
    }

    public final long getDurationUnitMillis() {
        return this.iUnitMillis;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract DurationField getRangeDurationField();

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long roundFloor(long j9);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long set(long j9, int i9);
}
