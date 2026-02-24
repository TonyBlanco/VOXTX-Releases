package org.joda.time.base;

import org.joda.convert.ToString;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadablePeriod;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractPeriod implements ReadablePeriod {
    @Override // org.joda.time.ReadablePeriod
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadablePeriod)) {
            return false;
        }
        ReadablePeriod readablePeriod = (ReadablePeriod) obj;
        if (size() != readablePeriod.size()) {
            return false;
        }
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            if (getValue(i9) != readablePeriod.getValue(i9) || getFieldType(i9) != readablePeriod.getFieldType(i9)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.joda.time.ReadablePeriod
    public int get(DurationFieldType durationFieldType) {
        int iIndexOf = indexOf(durationFieldType);
        if (iIndexOf == -1) {
            return 0;
        }
        return getValue(iIndexOf);
    }

    @Override // org.joda.time.ReadablePeriod
    public DurationFieldType getFieldType(int i9) {
        return getPeriodType().getFieldType(i9);
    }

    public DurationFieldType[] getFieldTypes() {
        int size = size();
        DurationFieldType[] durationFieldTypeArr = new DurationFieldType[size];
        for (int i9 = 0; i9 < size; i9++) {
            durationFieldTypeArr[i9] = getFieldType(i9);
        }
        return durationFieldTypeArr;
    }

    public int[] getValues() {
        int size = size();
        int[] iArr = new int[size];
        for (int i9 = 0; i9 < size; i9++) {
            iArr[i9] = getValue(i9);
        }
        return iArr;
    }

    @Override // org.joda.time.ReadablePeriod
    public int hashCode() {
        int size = size();
        int value = 17;
        for (int i9 = 0; i9 < size; i9++) {
            value = (((value * 27) + getValue(i9)) * 27) + getFieldType(i9).hashCode();
        }
        return value;
    }

    public int indexOf(DurationFieldType durationFieldType) {
        return getPeriodType().indexOf(durationFieldType);
    }

    @Override // org.joda.time.ReadablePeriod
    public boolean isSupported(DurationFieldType durationFieldType) {
        return getPeriodType().isSupported(durationFieldType);
    }

    @Override // org.joda.time.ReadablePeriod
    public int size() {
        return getPeriodType().size();
    }

    @Override // org.joda.time.ReadablePeriod
    public MutablePeriod toMutablePeriod() {
        return new MutablePeriod(this);
    }

    @Override // org.joda.time.ReadablePeriod
    public Period toPeriod() {
        return new Period(this);
    }

    @Override // org.joda.time.ReadablePeriod
    @ToString
    public String toString() {
        return ISOPeriodFormat.standard().print(this);
    }

    public String toString(PeriodFormatter periodFormatter) {
        return periodFormatter == null ? toString() : periodFormatter.print(this);
    }
}
