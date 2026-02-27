package org.joda.time;

import java.io.Serializable;
import org.joda.convert.FromString;
import org.joda.time.base.BasePeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/* JADX INFO: loaded from: classes4.dex */
public class MutablePeriod extends BasePeriod implements ReadWritablePeriod, Cloneable, Serializable {
    private static final long serialVersionUID = 3436451121567212165L;

    public MutablePeriod() {
        super(0L, (PeriodType) null, (Chronology) null);
    }

    public MutablePeriod(int i9, int i10, int i11, int i12) {
        super(0, 0, 0, 0, i9, i10, i11, i12, PeriodType.standard());
    }

    public MutablePeriod(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        super(i9, i10, i11, i12, i13, i14, i15, i16, PeriodType.standard());
    }

    public MutablePeriod(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, PeriodType periodType) {
        super(i9, i10, i11, i12, i13, i14, i15, i16, periodType);
    }

    public MutablePeriod(long j9) {
        super(j9);
    }

    public MutablePeriod(long j9, long j10) {
        super(j9, j10, null, null);
    }

    public MutablePeriod(long j9, long j10, Chronology chronology) {
        super(j9, j10, null, chronology);
    }

    public MutablePeriod(long j9, long j10, PeriodType periodType) {
        super(j9, j10, periodType, null);
    }

    public MutablePeriod(long j9, long j10, PeriodType periodType, Chronology chronology) {
        super(j9, j10, periodType, chronology);
    }

    public MutablePeriod(long j9, Chronology chronology) {
        super(j9, (PeriodType) null, chronology);
    }

    public MutablePeriod(long j9, PeriodType periodType) {
        super(j9, periodType, (Chronology) null);
    }

    public MutablePeriod(long j9, PeriodType periodType, Chronology chronology) {
        super(j9, periodType, chronology);
    }

    public MutablePeriod(Object obj) {
        super(obj, (PeriodType) null, (Chronology) null);
    }

    public MutablePeriod(Object obj, Chronology chronology) {
        super(obj, (PeriodType) null, chronology);
    }

    public MutablePeriod(Object obj, PeriodType periodType) {
        super(obj, periodType, (Chronology) null);
    }

    public MutablePeriod(Object obj, PeriodType periodType, Chronology chronology) {
        super(obj, periodType, chronology);
    }

    public MutablePeriod(PeriodType periodType) {
        super(0L, periodType, (Chronology) null);
    }

    public MutablePeriod(ReadableDuration readableDuration, ReadableInstant readableInstant) {
        super(readableDuration, readableInstant, (PeriodType) null);
    }

    public MutablePeriod(ReadableDuration readableDuration, ReadableInstant readableInstant, PeriodType periodType) {
        super(readableDuration, readableInstant, periodType);
    }

    public MutablePeriod(ReadableInstant readableInstant, ReadableDuration readableDuration) {
        super(readableInstant, readableDuration, (PeriodType) null);
    }

    public MutablePeriod(ReadableInstant readableInstant, ReadableDuration readableDuration, PeriodType periodType) {
        super(readableInstant, readableDuration, periodType);
    }

    public MutablePeriod(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        super(readableInstant, readableInstant2, (PeriodType) null);
    }

    public MutablePeriod(ReadableInstant readableInstant, ReadableInstant readableInstant2, PeriodType periodType) {
        super(readableInstant, readableInstant2, periodType);
    }

    @FromString
    public static MutablePeriod parse(String str) {
        return parse(str, ISOPeriodFormat.standard());
    }

    public static MutablePeriod parse(String str, PeriodFormatter periodFormatter) {
        return periodFormatter.parsePeriod(str).toMutablePeriod();
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void add(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        setPeriod(FieldUtils.safeAdd(getYears(), i9), FieldUtils.safeAdd(getMonths(), i10), FieldUtils.safeAdd(getWeeks(), i11), FieldUtils.safeAdd(getDays(), i12), FieldUtils.safeAdd(getHours(), i13), FieldUtils.safeAdd(getMinutes(), i14), FieldUtils.safeAdd(getSeconds(), i15), FieldUtils.safeAdd(getMillis(), i16));
    }

    public void add(long j9) {
        add(new Period(j9, getPeriodType()));
    }

    public void add(long j9, Chronology chronology) {
        add(new Period(j9, getPeriodType(), chronology));
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void add(DurationFieldType durationFieldType, int i9) {
        super.addField(durationFieldType, i9);
    }

    public void add(ReadableDuration readableDuration) {
        if (readableDuration != null) {
            add(new Period(readableDuration.getMillis(), getPeriodType()));
        }
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void add(ReadableInterval readableInterval) {
        if (readableInterval != null) {
            add(readableInterval.toPeriod(getPeriodType()));
        }
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void add(ReadablePeriod readablePeriod) {
        super.addPeriod(readablePeriod);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addDays(int i9) {
        super.addField(DurationFieldType.days(), i9);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addHours(int i9) {
        super.addField(DurationFieldType.hours(), i9);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addMillis(int i9) {
        super.addField(DurationFieldType.millis(), i9);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addMinutes(int i9) {
        super.addField(DurationFieldType.minutes(), i9);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addMonths(int i9) {
        super.addField(DurationFieldType.months(), i9);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addSeconds(int i9) {
        super.addField(DurationFieldType.seconds(), i9);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addWeeks(int i9) {
        super.addField(DurationFieldType.weeks(), i9);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addYears(int i9) {
        super.addField(DurationFieldType.years(), i9);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void clear() {
        super.setValues(new int[size()]);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    public MutablePeriod copy() {
        return (MutablePeriod) clone();
    }

    public int getDays() {
        return getPeriodType().getIndexedField(this, PeriodType.DAY_INDEX);
    }

    public int getHours() {
        return getPeriodType().getIndexedField(this, PeriodType.HOUR_INDEX);
    }

    public int getMillis() {
        return getPeriodType().getIndexedField(this, PeriodType.MILLI_INDEX);
    }

    public int getMinutes() {
        return getPeriodType().getIndexedField(this, PeriodType.MINUTE_INDEX);
    }

    public int getMonths() {
        return getPeriodType().getIndexedField(this, PeriodType.MONTH_INDEX);
    }

    public int getSeconds() {
        return getPeriodType().getIndexedField(this, PeriodType.SECOND_INDEX);
    }

    public int getWeeks() {
        return getPeriodType().getIndexedField(this, PeriodType.WEEK_INDEX);
    }

    public int getYears() {
        return getPeriodType().getIndexedField(this, PeriodType.YEAR_INDEX);
    }

    @Override // org.joda.time.base.BasePeriod
    public void mergePeriod(ReadablePeriod readablePeriod) {
        super.mergePeriod(readablePeriod);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void set(DurationFieldType durationFieldType, int i9) {
        super.setField(durationFieldType, i9);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setDays(int i9) {
        super.setField(DurationFieldType.days(), i9);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setHours(int i9) {
        super.setField(DurationFieldType.hours(), i9);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setMillis(int i9) {
        super.setField(DurationFieldType.millis(), i9);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setMinutes(int i9) {
        super.setField(DurationFieldType.minutes(), i9);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setMonths(int i9) {
        super.setField(DurationFieldType.months(), i9);
    }

    @Override // org.joda.time.base.BasePeriod, org.joda.time.ReadWritablePeriod
    public void setPeriod(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        super.setPeriod(i9, i10, i11, i12, i13, i14, i15, i16);
    }

    public void setPeriod(long j9) {
        setPeriod(j9, (Chronology) null);
    }

    public void setPeriod(long j9, long j10) {
        setPeriod(j9, j10, null);
    }

    public void setPeriod(long j9, long j10, Chronology chronology) {
        setValues(DateTimeUtils.getChronology(chronology).get(this, j9, j10));
    }

    public void setPeriod(long j9, Chronology chronology) {
        setValues(DateTimeUtils.getChronology(chronology).get(this, j9));
    }

    public void setPeriod(ReadableDuration readableDuration) {
        setPeriod(readableDuration, (Chronology) null);
    }

    public void setPeriod(ReadableDuration readableDuration, Chronology chronology) {
        setPeriod(DateTimeUtils.getDurationMillis(readableDuration), chronology);
    }

    public void setPeriod(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        if (readableInstant == readableInstant2) {
            setPeriod(0L);
        } else {
            setPeriod(DateTimeUtils.getInstantMillis(readableInstant), DateTimeUtils.getInstantMillis(readableInstant2), DateTimeUtils.getIntervalChronology(readableInstant, readableInstant2));
        }
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setPeriod(ReadableInterval readableInterval) {
        if (readableInterval == null) {
            setPeriod(0L);
        } else {
            setPeriod(readableInterval.getStartMillis(), readableInterval.getEndMillis(), DateTimeUtils.getChronology(readableInterval.getChronology()));
        }
    }

    @Override // org.joda.time.base.BasePeriod, org.joda.time.ReadWritablePeriod
    public void setPeriod(ReadablePeriod readablePeriod) {
        super.setPeriod(readablePeriod);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setSeconds(int i9) {
        super.setField(DurationFieldType.seconds(), i9);
    }

    @Override // org.joda.time.base.BasePeriod, org.joda.time.ReadWritablePeriod
    public void setValue(int i9, int i10) {
        super.setValue(i9, i10);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setWeeks(int i9) {
        super.setField(DurationFieldType.weeks(), i9);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setYears(int i9) {
        super.setField(DurationFieldType.years(), i9);
    }
}
