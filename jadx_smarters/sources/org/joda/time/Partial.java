package org.joda.time;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.apache.http.message.TokenParser;
import org.joda.time.base.AbstractPartial;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes4.dex */
public final class Partial extends AbstractPartial implements ReadablePartial, Serializable {
    private static final long serialVersionUID = 12324121189002L;
    private final Chronology iChronology;
    private transient DateTimeFormatter[] iFormatter;
    private final DateTimeFieldType[] iTypes;
    private final int[] iValues;

    public static class Property extends AbstractPartialFieldProperty implements Serializable {
        private static final long serialVersionUID = 53278362873888L;
        private final int iFieldIndex;
        private final Partial iPartial;

        public Property(Partial partial, int i9) {
            this.iPartial = partial;
            this.iFieldIndex = i9;
        }

        public Partial addToCopy(int i9) {
            return new Partial(this.iPartial, getField().add(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), i9));
        }

        public Partial addWrapFieldToCopy(int i9) {
            return new Partial(this.iPartial, getField().addWrapField(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), i9));
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public int get() {
            return this.iPartial.getValue(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public DateTimeField getField() {
            return this.iPartial.getField(this.iFieldIndex);
        }

        public Partial getPartial() {
            return this.iPartial;
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public ReadablePartial getReadablePartial() {
            return this.iPartial;
        }

        public Partial setCopy(int i9) {
            return new Partial(this.iPartial, getField().set(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), i9));
        }

        public Partial setCopy(String str) {
            return setCopy(str, null);
        }

        public Partial setCopy(String str, Locale locale) {
            return new Partial(this.iPartial, getField().set(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), str, locale));
        }

        public Partial withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public Partial withMinimumValue() {
            return setCopy(getMinimumValue());
        }
    }

    public Partial() {
        this((Chronology) null);
    }

    public Partial(Chronology chronology) {
        this.iChronology = DateTimeUtils.getChronology(chronology).withUTC();
        this.iTypes = new DateTimeFieldType[0];
        this.iValues = new int[0];
    }

    public Partial(Chronology chronology, DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr) {
        this.iChronology = chronology;
        this.iTypes = dateTimeFieldTypeArr;
        this.iValues = iArr;
    }

    public Partial(DateTimeFieldType dateTimeFieldType, int i9) {
        this(dateTimeFieldType, i9, (Chronology) null);
    }

    public Partial(DateTimeFieldType dateTimeFieldType, int i9, Chronology chronology) {
        Chronology chronologyWithUTC = DateTimeUtils.getChronology(chronology).withUTC();
        this.iChronology = chronologyWithUTC;
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The field type must not be null");
        }
        this.iTypes = new DateTimeFieldType[]{dateTimeFieldType};
        int[] iArr = {i9};
        this.iValues = iArr;
        chronologyWithUTC.validate(this, iArr);
    }

    public Partial(Partial partial, int[] iArr) {
        this.iChronology = partial.iChronology;
        this.iTypes = partial.iTypes;
        this.iValues = iArr;
    }

    public Partial(ReadablePartial readablePartial) {
        if (readablePartial == null) {
            throw new IllegalArgumentException("The partial must not be null");
        }
        this.iChronology = DateTimeUtils.getChronology(readablePartial.getChronology()).withUTC();
        this.iTypes = new DateTimeFieldType[readablePartial.size()];
        this.iValues = new int[readablePartial.size()];
        for (int i9 = 0; i9 < readablePartial.size(); i9++) {
            this.iTypes[i9] = readablePartial.getFieldType(i9);
            this.iValues[i9] = readablePartial.getValue(i9);
        }
    }

    public Partial(DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr) {
        this(dateTimeFieldTypeArr, iArr, (Chronology) null);
    }

    public Partial(DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr, Chronology chronology) {
        Chronology chronologyWithUTC = DateTimeUtils.getChronology(chronology).withUTC();
        this.iChronology = chronologyWithUTC;
        if (dateTimeFieldTypeArr == null) {
            throw new IllegalArgumentException("Types array must not be null");
        }
        if (iArr == null) {
            throw new IllegalArgumentException("Values array must not be null");
        }
        if (iArr.length != dateTimeFieldTypeArr.length) {
            throw new IllegalArgumentException("Values array must be the same length as the types array");
        }
        if (dateTimeFieldTypeArr.length == 0) {
            this.iTypes = dateTimeFieldTypeArr;
            this.iValues = iArr;
            return;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < dateTimeFieldTypeArr.length; i10++) {
            if (dateTimeFieldTypeArr[i10] == null) {
                throw new IllegalArgumentException("Types array must not contain null: index " + i10);
            }
        }
        DurationField durationField = null;
        while (i9 < dateTimeFieldTypeArr.length) {
            DateTimeFieldType dateTimeFieldType = dateTimeFieldTypeArr[i9];
            DurationField field = dateTimeFieldType.getDurationType().getField(this.iChronology);
            if (i9 > 0) {
                if (!field.isSupported()) {
                    if (durationField.isSupported()) {
                        throw new IllegalArgumentException("Types array must be in order largest-smallest: " + dateTimeFieldTypeArr[i9 - 1].getName() + " < " + dateTimeFieldType.getName());
                    }
                    throw new IllegalArgumentException("Types array must not contain duplicate unsupported: " + dateTimeFieldTypeArr[i9 - 1].getName() + " and " + dateTimeFieldType.getName());
                }
                int iCompareTo = durationField.compareTo(field);
                if (iCompareTo < 0) {
                    throw new IllegalArgumentException("Types array must be in order largest-smallest: " + dateTimeFieldTypeArr[i9 - 1].getName() + " < " + dateTimeFieldType.getName());
                }
                if (iCompareTo != 0) {
                    continue;
                } else if (durationField.equals(field)) {
                    int i11 = i9 - 1;
                    DurationFieldType rangeDurationType = dateTimeFieldTypeArr[i11].getRangeDurationType();
                    DurationFieldType rangeDurationType2 = dateTimeFieldType.getRangeDurationType();
                    if (rangeDurationType == null) {
                        if (rangeDurationType2 == null) {
                            throw new IllegalArgumentException("Types array must not contain duplicate: " + dateTimeFieldTypeArr[i11].getName() + " and " + dateTimeFieldType.getName());
                        }
                    } else {
                        if (rangeDurationType2 == null) {
                            throw new IllegalArgumentException("Types array must be in order largest-smallest: " + dateTimeFieldTypeArr[i11].getName() + " < " + dateTimeFieldType.getName());
                        }
                        DurationField field2 = rangeDurationType.getField(this.iChronology);
                        DurationField field3 = rangeDurationType2.getField(this.iChronology);
                        if (field2.compareTo(field3) < 0) {
                            throw new IllegalArgumentException("Types array must be in order largest-smallest: " + dateTimeFieldTypeArr[i11].getName() + " < " + dateTimeFieldType.getName());
                        }
                        if (field2.compareTo(field3) == 0) {
                            throw new IllegalArgumentException("Types array must not contain duplicate: " + dateTimeFieldTypeArr[i11].getName() + " and " + dateTimeFieldType.getName());
                        }
                    }
                } else if (durationField.isSupported() && durationField.getType() != DurationFieldType.YEARS_TYPE) {
                    throw new IllegalArgumentException("Types array must be in order largest-smallest, for year-based fields, years is defined as being largest: " + dateTimeFieldTypeArr[i9 - 1].getName() + " < " + dateTimeFieldType.getName());
                }
            }
            i9++;
            durationField = field;
        }
        this.iTypes = (DateTimeFieldType[]) dateTimeFieldTypeArr.clone();
        chronologyWithUTC.validate(this, iArr);
        this.iValues = (int[]) iArr.clone();
    }

    @Override // org.joda.time.ReadablePartial
    public Chronology getChronology() {
        return this.iChronology;
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeField getField(int i9, Chronology chronology) {
        return this.iTypes[i9].getField(chronology);
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public DateTimeFieldType getFieldType(int i9) {
        return this.iTypes[i9];
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeFieldType[] getFieldTypes() {
        return (DateTimeFieldType[]) this.iTypes.clone();
    }

    public DateTimeFormatter getFormatter() {
        DateTimeFormatter[] dateTimeFormatterArr = this.iFormatter;
        if (dateTimeFormatterArr == null) {
            if (size() == 0) {
                return null;
            }
            dateTimeFormatterArr = new DateTimeFormatter[2];
            try {
                ArrayList arrayList = new ArrayList(Arrays.asList(this.iTypes));
                dateTimeFormatterArr[0] = ISODateTimeFormat.forFields(arrayList, true, false);
                if (arrayList.size() == 0) {
                    dateTimeFormatterArr[1] = dateTimeFormatterArr[0];
                }
            } catch (IllegalArgumentException unused) {
            }
            this.iFormatter = dateTimeFormatterArr;
        }
        return dateTimeFormatterArr[0];
    }

    @Override // org.joda.time.ReadablePartial
    public int getValue(int i9) {
        return this.iValues[i9];
    }

    @Override // org.joda.time.base.AbstractPartial
    public int[] getValues() {
        return (int[]) this.iValues.clone();
    }

    public boolean isMatch(ReadableInstant readableInstant) {
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        Chronology instantChronology = DateTimeUtils.getInstantChronology(readableInstant);
        int i9 = 0;
        while (true) {
            DateTimeFieldType[] dateTimeFieldTypeArr = this.iTypes;
            if (i9 >= dateTimeFieldTypeArr.length) {
                return true;
            }
            if (dateTimeFieldTypeArr[i9].getField(instantChronology).get(instantMillis) != this.iValues[i9]) {
                return false;
            }
            i9++;
        }
    }

    public boolean isMatch(ReadablePartial readablePartial) {
        if (readablePartial == null) {
            throw new IllegalArgumentException("The partial must not be null");
        }
        int i9 = 0;
        while (true) {
            DateTimeFieldType[] dateTimeFieldTypeArr = this.iTypes;
            if (i9 >= dateTimeFieldTypeArr.length) {
                return true;
            }
            if (readablePartial.get(dateTimeFieldTypeArr[i9]) != this.iValues[i9]) {
                return false;
            }
            i9++;
        }
    }

    public Partial minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public Partial plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    @Override // org.joda.time.ReadablePartial
    public int size() {
        return this.iTypes.length;
    }

    @Override // org.joda.time.ReadablePartial
    public String toString() {
        DateTimeFormatter[] dateTimeFormatterArr = this.iFormatter;
        if (dateTimeFormatterArr == null) {
            getFormatter();
            dateTimeFormatterArr = this.iFormatter;
            if (dateTimeFormatterArr == null) {
                return toStringList();
            }
        }
        DateTimeFormatter dateTimeFormatter = dateTimeFormatterArr[1];
        return dateTimeFormatter == null ? toStringList() : dateTimeFormatter.print(this);
    }

    public String toString(String str) {
        return str == null ? toString() : DateTimeFormat.forPattern(str).print(this);
    }

    public String toString(String str, Locale locale) {
        return str == null ? toString() : DateTimeFormat.forPattern(str).withLocale(locale).print(this);
    }

    public String toStringList() {
        int size = size();
        StringBuilder sb = new StringBuilder(size * 20);
        sb.append('[');
        for (int i9 = 0; i9 < size; i9++) {
            if (i9 > 0) {
                sb.append(',');
                sb.append(TokenParser.SP);
            }
            sb.append(this.iTypes[i9].getName());
            sb.append('=');
            sb.append(this.iValues[i9]);
        }
        sb.append(']');
        return sb.toString();
    }

    public Partial with(DateTimeFieldType dateTimeFieldType, int i9) {
        int i10;
        int iCompareTo;
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The field type must not be null");
        }
        int iIndexOf = indexOf(dateTimeFieldType);
        if (iIndexOf != -1) {
            return i9 == getValue(iIndexOf) ? this : new Partial(this, getField(iIndexOf).set(this, iIndexOf, getValues(), i9));
        }
        int length = this.iTypes.length + 1;
        DateTimeFieldType[] dateTimeFieldTypeArr = new DateTimeFieldType[length];
        int[] iArr = new int[length];
        DurationField field = dateTimeFieldType.getDurationType().getField(this.iChronology);
        if (field.isSupported()) {
            i10 = 0;
            while (true) {
                DateTimeFieldType[] dateTimeFieldTypeArr2 = this.iTypes;
                if (i10 >= dateTimeFieldTypeArr2.length) {
                    break;
                }
                DateTimeFieldType dateTimeFieldType2 = dateTimeFieldTypeArr2[i10];
                DurationField field2 = dateTimeFieldType2.getDurationType().getField(this.iChronology);
                if (field2.isSupported() && ((iCompareTo = field.compareTo(field2)) > 0 || (iCompareTo == 0 && (dateTimeFieldType.getRangeDurationType() == null || (dateTimeFieldType2.getRangeDurationType() != null && dateTimeFieldType.getRangeDurationType().getField(this.iChronology).compareTo(dateTimeFieldType2.getRangeDurationType().getField(this.iChronology)) > 0))))) {
                    break;
                }
                i10++;
            }
        } else {
            i10 = 0;
        }
        System.arraycopy(this.iTypes, 0, dateTimeFieldTypeArr, 0, i10);
        System.arraycopy(this.iValues, 0, iArr, 0, i10);
        dateTimeFieldTypeArr[i10] = dateTimeFieldType;
        iArr[i10] = i9;
        int i11 = i10 + 1;
        int i12 = (length - i10) - 1;
        System.arraycopy(this.iTypes, i10, dateTimeFieldTypeArr, i11, i12);
        System.arraycopy(this.iValues, i10, iArr, i11, i12);
        Partial partial = new Partial(dateTimeFieldTypeArr, iArr, this.iChronology);
        this.iChronology.validate(partial, iArr);
        return partial;
    }

    public Partial withChronologyRetainFields(Chronology chronology) {
        Chronology chronologyWithUTC = DateTimeUtils.getChronology(chronology).withUTC();
        if (chronologyWithUTC == getChronology()) {
            return this;
        }
        Partial partial = new Partial(chronologyWithUTC, this.iTypes, this.iValues);
        chronologyWithUTC.validate(partial, this.iValues);
        return partial;
    }

    public Partial withField(DateTimeFieldType dateTimeFieldType, int i9) {
        int iIndexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i9 == getValue(iIndexOfSupported)) {
            return this;
        }
        return new Partial(this, getField(iIndexOfSupported).set(this, iIndexOfSupported, getValues(), i9));
    }

    public Partial withFieldAddWrapped(DurationFieldType durationFieldType, int i9) {
        int iIndexOfSupported = indexOfSupported(durationFieldType);
        if (i9 == 0) {
            return this;
        }
        return new Partial(this, getField(iIndexOfSupported).addWrapPartial(this, iIndexOfSupported, getValues(), i9));
    }

    public Partial withFieldAdded(DurationFieldType durationFieldType, int i9) {
        int iIndexOfSupported = indexOfSupported(durationFieldType);
        if (i9 == 0) {
            return this;
        }
        return new Partial(this, getField(iIndexOfSupported).add(this, iIndexOfSupported, getValues(), i9));
    }

    public Partial withPeriodAdded(ReadablePeriod readablePeriod, int i9) {
        if (readablePeriod == null || i9 == 0) {
            return this;
        }
        int[] values = getValues();
        for (int i10 = 0; i10 < readablePeriod.size(); i10++) {
            int iIndexOf = indexOf(readablePeriod.getFieldType(i10));
            if (iIndexOf >= 0) {
                values = getField(iIndexOf).add(this, iIndexOf, values, FieldUtils.safeMultiply(readablePeriod.getValue(i10), i9));
            }
        }
        return new Partial(this, values);
    }

    public Partial without(DateTimeFieldType dateTimeFieldType) {
        int iIndexOf = indexOf(dateTimeFieldType);
        if (iIndexOf == -1) {
            return this;
        }
        int size = size() - 1;
        DateTimeFieldType[] dateTimeFieldTypeArr = new DateTimeFieldType[size];
        int size2 = size() - 1;
        int[] iArr = new int[size2];
        System.arraycopy(this.iTypes, 0, dateTimeFieldTypeArr, 0, iIndexOf);
        int i9 = iIndexOf + 1;
        System.arraycopy(this.iTypes, i9, dateTimeFieldTypeArr, iIndexOf, size - iIndexOf);
        System.arraycopy(this.iValues, 0, iArr, 0, iIndexOf);
        System.arraycopy(this.iValues, i9, iArr, iIndexOf, size2 - iIndexOf);
        Partial partial = new Partial(this.iChronology, dateTimeFieldTypeArr, iArr);
        this.iChronology.validate(partial, iArr);
        return partial;
    }
}
