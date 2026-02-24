package org.joda.time.field;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;

/* JADX INFO: loaded from: classes4.dex */
public final class SkipUndoDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = -5875876968979L;
    private final Chronology iChronology;
    private transient int iMinValue;
    private final int iSkip;

    public SkipUndoDateTimeField(Chronology chronology, DateTimeField dateTimeField) {
        this(chronology, dateTimeField, 0);
    }

    public SkipUndoDateTimeField(Chronology chronology, DateTimeField dateTimeField, int i9) {
        super(dateTimeField);
        this.iChronology = chronology;
        int minimumValue = super.getMinimumValue();
        if (minimumValue >= i9) {
            if (minimumValue == i9 + 1) {
                this.iMinValue = i9;
            }
            this.iSkip = i9;
        }
        minimumValue++;
        this.iMinValue = minimumValue;
        this.iSkip = i9;
    }

    private Object readResolve() {
        return getType().getField(this.iChronology);
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public int get(long j9) {
        int i9 = super.get(j9);
        return i9 < this.iSkip ? i9 + 1 : i9;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.iMinValue;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public long set(long j9, int i9) {
        FieldUtils.verifyValueBounds(this, i9, this.iMinValue, getMaximumValue());
        if (i9 <= this.iSkip) {
            i9--;
        }
        return super.set(j9, i9);
    }
}
