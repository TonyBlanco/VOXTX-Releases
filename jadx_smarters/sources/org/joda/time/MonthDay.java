package org.joda.time;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes4.dex */
public final class MonthDay extends BasePartial implements ReadablePartial, Serializable {
    public static final int DAY_OF_MONTH = 1;
    public static final int MONTH_OF_YEAR = 0;
    private static final long serialVersionUID = 2954560699050434609L;
    private static final DateTimeFieldType[] FIELD_TYPES = {DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()};
    private static final DateTimeFormatter PARSER = new DateTimeFormatterBuilder().appendOptional(ISODateTimeFormat.localDateParser().getParser()).appendOptional(DateTimeFormat.forPattern("--MM-dd").getParser()).toFormatter();

    public static class Property extends AbstractPartialFieldProperty implements Serializable {
        private static final long serialVersionUID = 5727734012190224363L;
        private final MonthDay iBase;
        private final int iFieldIndex;

        public Property(MonthDay monthDay, int i9) {
            this.iBase = monthDay;
            this.iFieldIndex = i9;
        }

        public MonthDay addToCopy(int i9) {
            return new MonthDay(this.iBase, getField().add(this.iBase, this.iFieldIndex, this.iBase.getValues(), i9));
        }

        public MonthDay addWrapFieldToCopy(int i9) {
            return new MonthDay(this.iBase, getField().addWrapField(this.iBase, this.iFieldIndex, this.iBase.getValues(), i9));
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public int get() {
            return this.iBase.getValue(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public DateTimeField getField() {
            return this.iBase.getField(this.iFieldIndex);
        }

        public MonthDay getMonthDay() {
            return this.iBase;
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public ReadablePartial getReadablePartial() {
            return this.iBase;
        }

        public MonthDay setCopy(int i9) {
            return new MonthDay(this.iBase, getField().set(this.iBase, this.iFieldIndex, this.iBase.getValues(), i9));
        }

        public MonthDay setCopy(String str) {
            return setCopy(str, null);
        }

        public MonthDay setCopy(String str, Locale locale) {
            return new MonthDay(this.iBase, getField().set(this.iBase, this.iFieldIndex, this.iBase.getValues(), str, locale));
        }
    }

    public MonthDay() {
    }

    public MonthDay(int i9, int i10) {
        this(i9, i10, null);
    }

    public MonthDay(int i9, int i10, Chronology chronology) {
        super(new int[]{i9, i10}, chronology);
    }

    public MonthDay(long j9) {
        super(j9);
    }

    public MonthDay(long j9, Chronology chronology) {
        super(j9, chronology);
    }

    public MonthDay(Object obj) {
        super(obj, null, ISODateTimeFormat.localDateParser());
    }

    public MonthDay(Object obj, Chronology chronology) {
        super(obj, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.localDateParser());
    }

    public MonthDay(Chronology chronology) {
        super(chronology);
    }

    public MonthDay(DateTimeZone dateTimeZone) {
        super(ISOChronology.getInstance(dateTimeZone));
    }

    public MonthDay(MonthDay monthDay, Chronology chronology) {
        super((BasePartial) monthDay, chronology);
    }

    public MonthDay(MonthDay monthDay, int[] iArr) {
        super(monthDay, iArr);
    }

    public static MonthDay fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new MonthDay(calendar.get(2) + 1, calendar.get(5));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static MonthDay fromDateFields(Date date) {
        if (date != null) {
            return new MonthDay(date.getMonth() + 1, date.getDate());
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static MonthDay now() {
        return new MonthDay();
    }

    public static MonthDay now(Chronology chronology) {
        if (chronology != null) {
            return new MonthDay(chronology);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    public static MonthDay now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new MonthDay(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    @FromString
    public static MonthDay parse(String str) {
        return parse(str, PARSER);
    }

    public static MonthDay parse(String str, DateTimeFormatter dateTimeFormatter) {
        LocalDate localDate = dateTimeFormatter.parseLocalDate(str);
        return new MonthDay(localDate.getMonthOfYear(), localDate.getDayOfMonth());
    }

    private Object readResolve() {
        return !DateTimeZone.UTC.equals(getChronology().getZone()) ? new MonthDay(this, getChronology().withUTC()) : this;
    }

    public Property dayOfMonth() {
        return new Property(this, 1);
    }

    public int getDayOfMonth() {
        return getValue(1);
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeField getField(int i9, Chronology chronology) {
        if (i9 == 0) {
            return chronology.monthOfYear();
        }
        if (i9 == 1) {
            return chronology.dayOfMonth();
        }
        throw new IndexOutOfBoundsException("Invalid index: " + i9);
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public DateTimeFieldType getFieldType(int i9) {
        return FIELD_TYPES[i9];
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeFieldType[] getFieldTypes() {
        return (DateTimeFieldType[]) FIELD_TYPES.clone();
    }

    public int getMonthOfYear() {
        return getValue(0);
    }

    public MonthDay minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public MonthDay minusDays(int i9) {
        return withFieldAdded(DurationFieldType.days(), FieldUtils.safeNegate(i9));
    }

    public MonthDay minusMonths(int i9) {
        return withFieldAdded(DurationFieldType.months(), FieldUtils.safeNegate(i9));
    }

    public Property monthOfYear() {
        return new Property(this, 0);
    }

    public MonthDay plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public MonthDay plusDays(int i9) {
        return withFieldAdded(DurationFieldType.days(), i9);
    }

    public MonthDay plusMonths(int i9) {
        return withFieldAdded(DurationFieldType.months(), i9);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    @Override // org.joda.time.ReadablePartial
    public int size() {
        return 2;
    }

    public LocalDate toLocalDate(int i9) {
        return new LocalDate(i9, getMonthOfYear(), getDayOfMonth(), getChronology());
    }

    @Override // org.joda.time.ReadablePartial
    @ToString
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DateTimeFieldType.monthOfYear());
        arrayList.add(DateTimeFieldType.dayOfMonth());
        return ISODateTimeFormat.forFields(arrayList, true, true).print(this);
    }

    @Override // org.joda.time.base.BasePartial
    public String toString(String str) {
        return str == null ? toString() : DateTimeFormat.forPattern(str).print(this);
    }

    @Override // org.joda.time.base.BasePartial
    public String toString(String str, Locale locale) throws IllegalArgumentException {
        return str == null ? toString() : DateTimeFormat.forPattern(str).withLocale(locale).print(this);
    }

    public MonthDay withChronologyRetainFields(Chronology chronology) {
        Chronology chronologyWithUTC = DateTimeUtils.getChronology(chronology).withUTC();
        if (chronologyWithUTC == getChronology()) {
            return this;
        }
        MonthDay monthDay = new MonthDay(this, chronologyWithUTC);
        chronologyWithUTC.validate(monthDay, getValues());
        return monthDay;
    }

    public MonthDay withDayOfMonth(int i9) {
        return new MonthDay(this, getChronology().dayOfMonth().set(this, 1, getValues(), i9));
    }

    public MonthDay withField(DateTimeFieldType dateTimeFieldType, int i9) {
        int iIndexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i9 == getValue(iIndexOfSupported)) {
            return this;
        }
        return new MonthDay(this, getField(iIndexOfSupported).set(this, iIndexOfSupported, getValues(), i9));
    }

    public MonthDay withFieldAdded(DurationFieldType durationFieldType, int i9) {
        int iIndexOfSupported = indexOfSupported(durationFieldType);
        if (i9 == 0) {
            return this;
        }
        return new MonthDay(this, getField(iIndexOfSupported).add(this, iIndexOfSupported, getValues(), i9));
    }

    public MonthDay withMonthOfYear(int i9) {
        return new MonthDay(this, getChronology().monthOfYear().set(this, 0, getValues(), i9));
    }

    public MonthDay withPeriodAdded(ReadablePeriod readablePeriod, int i9) {
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
        return new MonthDay(this, values);
    }
}
