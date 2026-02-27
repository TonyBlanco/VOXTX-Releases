package org.joda.time.field;

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes4.dex */
public class DecoratedDurationField extends BaseDurationField {
    private static final long serialVersionUID = 8019982251647420015L;
    private final DurationField iField;

    public DecoratedDurationField(DurationField durationField, DurationFieldType durationFieldType) {
        super(durationFieldType);
        if (durationField == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        if (!durationField.isSupported()) {
            throw new IllegalArgumentException("The field must be supported");
        }
        this.iField = durationField;
    }

    @Override // org.joda.time.DurationField
    public long add(long j9, int i9) {
        return this.iField.add(j9, i9);
    }

    @Override // org.joda.time.DurationField
    public long add(long j9, long j10) {
        return this.iField.add(j9, j10);
    }

    @Override // org.joda.time.DurationField
    public long getDifferenceAsLong(long j9, long j10) {
        return this.iField.getDifferenceAsLong(j9, j10);
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i9, long j9) {
        return this.iField.getMillis(i9, j9);
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j9, long j10) {
        return this.iField.getMillis(j9, j10);
    }

    @Override // org.joda.time.DurationField
    public long getUnitMillis() {
        return this.iField.getUnitMillis();
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j9, long j10) {
        return this.iField.getValueAsLong(j9, j10);
    }

    public final DurationField getWrappedField() {
        return this.iField;
    }

    @Override // org.joda.time.DurationField
    public boolean isPrecise() {
        return this.iField.isPrecise();
    }
}
