package org.joda.time.field;

import java.io.Serializable;
import java.util.Locale;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;

/* JADX INFO: loaded from: classes4.dex */
public class DelegatedDateTimeField extends DateTimeField implements Serializable {
    private static final long serialVersionUID = -4730164440214502503L;
    private final DateTimeField iField;
    private final DurationField iRangeDurationField;
    private final DateTimeFieldType iType;

    public DelegatedDateTimeField(DateTimeField dateTimeField) {
        this(dateTimeField, null);
    }

    public DelegatedDateTimeField(DateTimeField dateTimeField, DateTimeFieldType dateTimeFieldType) {
        this(dateTimeField, null, dateTimeFieldType);
    }

    public DelegatedDateTimeField(DateTimeField dateTimeField, DurationField durationField, DateTimeFieldType dateTimeFieldType) {
        if (dateTimeField == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        this.iField = dateTimeField;
        this.iRangeDurationField = durationField;
        this.iType = dateTimeFieldType == null ? dateTimeField.getType() : dateTimeFieldType;
    }

    @Override // org.joda.time.DateTimeField
    public long add(long j9, int i9) {
        return this.iField.add(j9, i9);
    }

    @Override // org.joda.time.DateTimeField
    public long add(long j9, long j10) {
        return this.iField.add(j9, j10);
    }

    @Override // org.joda.time.DateTimeField
    public int[] add(ReadablePartial readablePartial, int i9, int[] iArr, int i10) {
        return this.iField.add(readablePartial, i9, iArr, i10);
    }

    @Override // org.joda.time.DateTimeField
    public long addWrapField(long j9, int i9) {
        return this.iField.addWrapField(j9, i9);
    }

    @Override // org.joda.time.DateTimeField
    public int[] addWrapField(ReadablePartial readablePartial, int i9, int[] iArr, int i10) {
        return this.iField.addWrapField(readablePartial, i9, iArr, i10);
    }

    @Override // org.joda.time.DateTimeField
    public int[] addWrapPartial(ReadablePartial readablePartial, int i9, int[] iArr, int i10) {
        return this.iField.addWrapPartial(readablePartial, i9, iArr, i10);
    }

    @Override // org.joda.time.DateTimeField
    public int get(long j9) {
        return this.iField.get(j9);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(int i9, Locale locale) {
        return this.iField.getAsShortText(i9, locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(long j9) {
        return this.iField.getAsShortText(j9);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(long j9, Locale locale) {
        return this.iField.getAsShortText(j9, locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(ReadablePartial readablePartial, int i9, Locale locale) {
        return this.iField.getAsShortText(readablePartial, i9, locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(ReadablePartial readablePartial, Locale locale) {
        return this.iField.getAsShortText(readablePartial, locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(int i9, Locale locale) {
        return this.iField.getAsText(i9, locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(long j9) {
        return this.iField.getAsText(j9);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(long j9, Locale locale) {
        return this.iField.getAsText(j9, locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(ReadablePartial readablePartial, int i9, Locale locale) {
        return this.iField.getAsText(readablePartial, i9, locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(ReadablePartial readablePartial, Locale locale) {
        return this.iField.getAsText(readablePartial, locale);
    }

    @Override // org.joda.time.DateTimeField
    public int getDifference(long j9, long j10) {
        return this.iField.getDifference(j9, j10);
    }

    @Override // org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j9, long j10) {
        return this.iField.getDifferenceAsLong(j9, j10);
    }

    @Override // org.joda.time.DateTimeField
    public DurationField getDurationField() {
        return this.iField.getDurationField();
    }

    @Override // org.joda.time.DateTimeField
    public int getLeapAmount(long j9) {
        return this.iField.getLeapAmount(j9);
    }

    @Override // org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return this.iField.getLeapDurationField();
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumShortTextLength(Locale locale) {
        return this.iField.getMaximumShortTextLength(locale);
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumTextLength(Locale locale) {
        return this.iField.getMaximumTextLength(locale);
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iField.getMaximumValue();
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(long j9) {
        return this.iField.getMaximumValue(j9);
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial) {
        return this.iField.getMaximumValue(readablePartial);
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
        return this.iField.getMaximumValue(readablePartial, iArr);
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.iField.getMinimumValue();
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(long j9) {
        return this.iField.getMinimumValue(j9);
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(ReadablePartial readablePartial) {
        return this.iField.getMinimumValue(readablePartial);
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
        return this.iField.getMinimumValue(readablePartial, iArr);
    }

    @Override // org.joda.time.DateTimeField
    public String getName() {
        return this.iType.getName();
    }

    @Override // org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        DurationField durationField = this.iRangeDurationField;
        return durationField != null ? durationField : this.iField.getRangeDurationField();
    }

    @Override // org.joda.time.DateTimeField
    public DateTimeFieldType getType() {
        return this.iType;
    }

    public final DateTimeField getWrappedField() {
        return this.iField;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLeap(long j9) {
        return this.iField.isLeap(j9);
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLenient() {
        return this.iField.isLenient();
    }

    @Override // org.joda.time.DateTimeField
    public boolean isSupported() {
        return this.iField.isSupported();
    }

    @Override // org.joda.time.DateTimeField
    public long remainder(long j9) {
        return this.iField.remainder(j9);
    }

    @Override // org.joda.time.DateTimeField
    public long roundCeiling(long j9) {
        return this.iField.roundCeiling(j9);
    }

    @Override // org.joda.time.DateTimeField
    public long roundFloor(long j9) {
        return this.iField.roundFloor(j9);
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfCeiling(long j9) {
        return this.iField.roundHalfCeiling(j9);
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfEven(long j9) {
        return this.iField.roundHalfEven(j9);
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfFloor(long j9) {
        return this.iField.roundHalfFloor(j9);
    }

    @Override // org.joda.time.DateTimeField
    public long set(long j9, int i9) {
        return this.iField.set(j9, i9);
    }

    @Override // org.joda.time.DateTimeField
    public long set(long j9, String str) {
        return this.iField.set(j9, str);
    }

    @Override // org.joda.time.DateTimeField
    public long set(long j9, String str, Locale locale) {
        return this.iField.set(j9, str, locale);
    }

    @Override // org.joda.time.DateTimeField
    public int[] set(ReadablePartial readablePartial, int i9, int[] iArr, int i10) {
        return this.iField.set(readablePartial, i9, iArr, i10);
    }

    @Override // org.joda.time.DateTimeField
    public int[] set(ReadablePartial readablePartial, int i9, int[] iArr, String str, Locale locale) {
        return this.iField.set(readablePartial, i9, iArr, str, locale);
    }

    @Override // org.joda.time.DateTimeField
    public String toString() {
        return "DateTimeField[" + getName() + ']';
    }
}
