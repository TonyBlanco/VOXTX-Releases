package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PeriodConverter;
import org.joda.time.field.FieldUtils;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BasePeriod extends AbstractPeriod implements ReadablePeriod, Serializable {
    private static final ReadablePeriod DUMMY_PERIOD = new AbstractPeriod() { // from class: org.joda.time.base.BasePeriod.1
        @Override // org.joda.time.ReadablePeriod
        public PeriodType getPeriodType() {
            return PeriodType.time();
        }

        @Override // org.joda.time.ReadablePeriod
        public int getValue(int i9) {
            return 0;
        }
    };
    private static final long serialVersionUID = -2110953284060001145L;
    private final PeriodType iType;
    private final int[] iValues;

    public BasePeriod(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, PeriodType periodType) {
        this.iType = checkPeriodType(periodType);
        this.iValues = setPeriodInternal(i9, i10, i11, i12, i13, i14, i15, i16);
    }

    public BasePeriod(long j9) {
        this.iType = PeriodType.standard();
        int[] iArr = ISOChronology.getInstanceUTC().get(DUMMY_PERIOD, j9);
        int[] iArr2 = new int[8];
        this.iValues = iArr2;
        System.arraycopy(iArr, 0, iArr2, 4, 4);
    }

    public BasePeriod(long j9, long j10, PeriodType periodType, Chronology chronology) {
        PeriodType periodTypeCheckPeriodType = checkPeriodType(periodType);
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        this.iType = periodTypeCheckPeriodType;
        this.iValues = chronology2.get(this, j9, j10);
    }

    public BasePeriod(long j9, PeriodType periodType, Chronology chronology) {
        PeriodType periodTypeCheckPeriodType = checkPeriodType(periodType);
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        this.iType = periodTypeCheckPeriodType;
        this.iValues = chronology2.get(this, j9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BasePeriod(Object obj, PeriodType periodType, Chronology chronology) {
        PeriodConverter periodConverter = ConverterManager.getInstance().getPeriodConverter(obj);
        PeriodType periodTypeCheckPeriodType = checkPeriodType(periodType == null ? periodConverter.getPeriodType(obj) : periodType);
        this.iType = periodTypeCheckPeriodType;
        if (!(this instanceof ReadWritablePeriod)) {
            this.iValues = new MutablePeriod(obj, periodTypeCheckPeriodType, chronology).getValues();
        } else {
            this.iValues = new int[size()];
            periodConverter.setInto((ReadWritablePeriod) this, obj, DateTimeUtils.getChronology(chronology));
        }
    }

    public BasePeriod(ReadableDuration readableDuration, ReadableInstant readableInstant, PeriodType periodType) {
        PeriodType periodTypeCheckPeriodType = checkPeriodType(periodType);
        long durationMillis = DateTimeUtils.getDurationMillis(readableDuration);
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        long jSafeSubtract = FieldUtils.safeSubtract(instantMillis, durationMillis);
        Chronology instantChronology = DateTimeUtils.getInstantChronology(readableInstant);
        this.iType = periodTypeCheckPeriodType;
        this.iValues = instantChronology.get(this, jSafeSubtract, instantMillis);
    }

    public BasePeriod(ReadableInstant readableInstant, ReadableDuration readableDuration, PeriodType periodType) {
        PeriodType periodTypeCheckPeriodType = checkPeriodType(periodType);
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        long jSafeAdd = FieldUtils.safeAdd(instantMillis, DateTimeUtils.getDurationMillis(readableDuration));
        Chronology instantChronology = DateTimeUtils.getInstantChronology(readableInstant);
        this.iType = periodTypeCheckPeriodType;
        this.iValues = instantChronology.get(this, instantMillis, jSafeAdd);
    }

    public BasePeriod(ReadableInstant readableInstant, ReadableInstant readableInstant2, PeriodType periodType) {
        PeriodType periodTypeCheckPeriodType = checkPeriodType(periodType);
        if (readableInstant == null && readableInstant2 == null) {
            this.iType = periodTypeCheckPeriodType;
            this.iValues = new int[size()];
            return;
        }
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        long instantMillis2 = DateTimeUtils.getInstantMillis(readableInstant2);
        Chronology intervalChronology = DateTimeUtils.getIntervalChronology(readableInstant, readableInstant2);
        this.iType = periodTypeCheckPeriodType;
        this.iValues = intervalChronology.get(this, instantMillis, instantMillis2);
    }

    public BasePeriod(ReadablePartial readablePartial, ReadablePartial readablePartial2, PeriodType periodType) {
        if (readablePartial == null || readablePartial2 == null) {
            throw new IllegalArgumentException("ReadablePartial objects must not be null");
        }
        if ((readablePartial instanceof BaseLocal) && (readablePartial2 instanceof BaseLocal) && readablePartial.getClass() == readablePartial2.getClass()) {
            PeriodType periodTypeCheckPeriodType = checkPeriodType(periodType);
            long localMillis = ((BaseLocal) readablePartial).getLocalMillis();
            long localMillis2 = ((BaseLocal) readablePartial2).getLocalMillis();
            Chronology chronology = DateTimeUtils.getChronology(readablePartial.getChronology());
            this.iType = periodTypeCheckPeriodType;
            this.iValues = chronology.get(this, localMillis, localMillis2);
            return;
        }
        if (readablePartial.size() != readablePartial2.size()) {
            throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
        }
        int size = readablePartial.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (readablePartial.getFieldType(i9) != readablePartial2.getFieldType(i9)) {
                throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
            }
        }
        if (!DateTimeUtils.isContiguous(readablePartial)) {
            throw new IllegalArgumentException("ReadablePartial objects must be contiguous");
        }
        this.iType = checkPeriodType(periodType);
        Chronology chronologyWithUTC = DateTimeUtils.getChronology(readablePartial.getChronology()).withUTC();
        this.iValues = chronologyWithUTC.get(this, chronologyWithUTC.set(readablePartial, 0L), chronologyWithUTC.set(readablePartial2, 0L));
    }

    public BasePeriod(int[] iArr, PeriodType periodType) {
        this.iType = periodType;
        this.iValues = iArr;
    }

    private void checkAndUpdate(DurationFieldType durationFieldType, int[] iArr, int i9) {
        int iIndexOf = indexOf(durationFieldType);
        if (iIndexOf != -1) {
            iArr[iIndexOf] = i9;
        } else {
            if (i9 == 0) {
                return;
            }
            throw new IllegalArgumentException("Period does not support field '" + durationFieldType.getName() + "'");
        }
    }

    private void setPeriodInternal(ReadablePeriod readablePeriod) {
        int[] iArr = new int[size()];
        int size = readablePeriod.size();
        for (int i9 = 0; i9 < size; i9++) {
            checkAndUpdate(readablePeriod.getFieldType(i9), iArr, readablePeriod.getValue(i9));
        }
        setValues(iArr);
    }

    private int[] setPeriodInternal(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int[] iArr = new int[size()];
        checkAndUpdate(DurationFieldType.years(), iArr, i9);
        checkAndUpdate(DurationFieldType.months(), iArr, i10);
        checkAndUpdate(DurationFieldType.weeks(), iArr, i11);
        checkAndUpdate(DurationFieldType.days(), iArr, i12);
        checkAndUpdate(DurationFieldType.hours(), iArr, i13);
        checkAndUpdate(DurationFieldType.minutes(), iArr, i14);
        checkAndUpdate(DurationFieldType.seconds(), iArr, i15);
        checkAndUpdate(DurationFieldType.millis(), iArr, i16);
        return iArr;
    }

    public void addField(DurationFieldType durationFieldType, int i9) {
        addFieldInto(this.iValues, durationFieldType, i9);
    }

    public void addFieldInto(int[] iArr, DurationFieldType durationFieldType, int i9) {
        int iIndexOf = indexOf(durationFieldType);
        if (iIndexOf != -1) {
            iArr[iIndexOf] = FieldUtils.safeAdd(iArr[iIndexOf], i9);
            return;
        }
        if (i9 != 0 || durationFieldType == null) {
            throw new IllegalArgumentException("Period does not support field '" + durationFieldType + "'");
        }
    }

    public void addPeriod(ReadablePeriod readablePeriod) {
        if (readablePeriod != null) {
            setValues(addPeriodInto(getValues(), readablePeriod));
        }
    }

    public int[] addPeriodInto(int[] iArr, ReadablePeriod readablePeriod) {
        int size = readablePeriod.size();
        for (int i9 = 0; i9 < size; i9++) {
            DurationFieldType fieldType = readablePeriod.getFieldType(i9);
            int value = readablePeriod.getValue(i9);
            if (value != 0) {
                int iIndexOf = indexOf(fieldType);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Period does not support field '" + fieldType.getName() + "'");
                }
                iArr[iIndexOf] = FieldUtils.safeAdd(getValue(iIndexOf), value);
            }
        }
        return iArr;
    }

    public PeriodType checkPeriodType(PeriodType periodType) {
        return DateTimeUtils.getPeriodType(periodType);
    }

    @Override // org.joda.time.ReadablePeriod
    public PeriodType getPeriodType() {
        return this.iType;
    }

    @Override // org.joda.time.ReadablePeriod
    public int getValue(int i9) {
        return this.iValues[i9];
    }

    public void mergePeriod(ReadablePeriod readablePeriod) {
        if (readablePeriod != null) {
            setValues(mergePeriodInto(getValues(), readablePeriod));
        }
    }

    public int[] mergePeriodInto(int[] iArr, ReadablePeriod readablePeriod) {
        int size = readablePeriod.size();
        for (int i9 = 0; i9 < size; i9++) {
            checkAndUpdate(readablePeriod.getFieldType(i9), iArr, readablePeriod.getValue(i9));
        }
        return iArr;
    }

    public void setField(DurationFieldType durationFieldType, int i9) {
        setFieldInto(this.iValues, durationFieldType, i9);
    }

    public void setFieldInto(int[] iArr, DurationFieldType durationFieldType, int i9) {
        int iIndexOf = indexOf(durationFieldType);
        if (iIndexOf != -1) {
            iArr[iIndexOf] = i9;
            return;
        }
        if (i9 != 0 || durationFieldType == null) {
            throw new IllegalArgumentException("Period does not support field '" + durationFieldType + "'");
        }
    }

    public void setPeriod(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        setValues(setPeriodInternal(i9, i10, i11, i12, i13, i14, i15, i16));
    }

    public void setPeriod(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            setValues(new int[size()]);
        } else {
            setPeriodInternal(readablePeriod);
        }
    }

    public void setValue(int i9, int i10) {
        this.iValues[i9] = i10;
    }

    public void setValues(int[] iArr) {
        int[] iArr2 = this.iValues;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
    }

    public Duration toDurationFrom(ReadableInstant readableInstant) {
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        return new Duration(instantMillis, DateTimeUtils.getInstantChronology(readableInstant).add(this, instantMillis, 1));
    }

    public Duration toDurationTo(ReadableInstant readableInstant) {
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        return new Duration(DateTimeUtils.getInstantChronology(readableInstant).add(this, instantMillis, -1), instantMillis);
    }
}
