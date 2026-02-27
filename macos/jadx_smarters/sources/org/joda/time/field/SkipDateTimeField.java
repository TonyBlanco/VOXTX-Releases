package org.joda.time.field;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* JADX INFO: loaded from: classes4.dex */
public final class SkipDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = -8869148464118507846L;
    private final Chronology iChronology;
    private transient int iMinValue;
    private final int iSkip;

    public SkipDateTimeField(Chronology chronology, DateTimeField dateTimeField) {
        this(chronology, dateTimeField, 0);
    }

    public SkipDateTimeField(Chronology chronology, DateTimeField dateTimeField, int i9) {
        super(dateTimeField);
        this.iChronology = chronology;
        int minimumValue = super.getMinimumValue();
        if (minimumValue < i9) {
            minimumValue--;
        } else if (minimumValue == i9) {
            minimumValue = i9 + 1;
        }
        this.iMinValue = minimumValue;
        this.iSkip = i9;
    }

    private Object readResolve() {
        return getType().getField(this.iChronology);
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public int get(long j9) {
        int i9 = super.get(j9);
        return i9 <= this.iSkip ? i9 - 1 : i9;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.iMinValue;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public long set(long j9, int i9) {
        FieldUtils.verifyValueBounds(this, i9, this.iMinValue, getMaximumValue());
        int i10 = this.iSkip;
        if (i9 <= i10) {
            if (i9 == i10) {
                throw new IllegalFieldValueException(DateTimeFieldType.year(), Integer.valueOf(i9), (Number) null, (Number) null);
            }
            i9++;
        }
        return super.set(j9, i9);
    }
}
