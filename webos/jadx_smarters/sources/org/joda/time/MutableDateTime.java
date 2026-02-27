package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Locale;
import org.joda.convert.FromString;
import org.joda.time.base.BaseDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes4.dex */
public class MutableDateTime extends BaseDateTime implements ReadWritableDateTime, Cloneable, Serializable {
    public static final int ROUND_CEILING = 2;
    public static final int ROUND_FLOOR = 1;
    public static final int ROUND_HALF_CEILING = 4;
    public static final int ROUND_HALF_EVEN = 5;
    public static final int ROUND_HALF_FLOOR = 3;
    public static final int ROUND_NONE = 0;
    private static final long serialVersionUID = 2852608688135209575L;
    private DateTimeField iRoundingField;
    private int iRoundingMode;

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -4481126543819298617L;
        private DateTimeField iField;
        private MutableDateTime iInstant;

        public Property(MutableDateTime mutableDateTime, DateTimeField dateTimeField) {
            this.iInstant = mutableDateTime;
            this.iField = dateTimeField;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.iInstant = (MutableDateTime) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.getType());
        }

        public MutableDateTime add(int i9) {
            this.iInstant.setMillis(getField().add(this.iInstant.getMillis(), i9));
            return this.iInstant;
        }

        public MutableDateTime add(long j9) {
            this.iInstant.setMillis(getField().add(this.iInstant.getMillis(), j9));
            return this.iInstant;
        }

        public MutableDateTime addWrapField(int i9) {
            this.iInstant.setMillis(getField().addWrapField(this.iInstant.getMillis(), i9));
            return this.iInstant;
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public Chronology getChronology() {
            return this.iInstant.getChronology();
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public DateTimeField getField() {
            return this.iField;
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public long getMillis() {
            return this.iInstant.getMillis();
        }

        public MutableDateTime getMutableDateTime() {
            return this.iInstant;
        }

        public MutableDateTime roundCeiling() {
            this.iInstant.setMillis(getField().roundCeiling(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public MutableDateTime roundFloor() {
            this.iInstant.setMillis(getField().roundFloor(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public MutableDateTime roundHalfCeiling() {
            this.iInstant.setMillis(getField().roundHalfCeiling(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public MutableDateTime roundHalfEven() {
            this.iInstant.setMillis(getField().roundHalfEven(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public MutableDateTime roundHalfFloor() {
            this.iInstant.setMillis(getField().roundHalfFloor(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public MutableDateTime set(int i9) {
            this.iInstant.setMillis(getField().set(this.iInstant.getMillis(), i9));
            return this.iInstant;
        }

        public MutableDateTime set(String str) {
            set(str, null);
            return this.iInstant;
        }

        public MutableDateTime set(String str, Locale locale) {
            this.iInstant.setMillis(getField().set(this.iInstant.getMillis(), str, locale));
            return this.iInstant;
        }
    }

    public MutableDateTime() {
    }

    public MutableDateTime(int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        super(i9, i10, i11, i12, i13, i14, i15);
    }

    public MutableDateTime(int i9, int i10, int i11, int i12, int i13, int i14, int i15, Chronology chronology) {
        super(i9, i10, i11, i12, i13, i14, i15, chronology);
    }

    public MutableDateTime(int i9, int i10, int i11, int i12, int i13, int i14, int i15, DateTimeZone dateTimeZone) {
        super(i9, i10, i11, i12, i13, i14, i15, dateTimeZone);
    }

    public MutableDateTime(long j9) {
        super(j9);
    }

    public MutableDateTime(long j9, Chronology chronology) {
        super(j9, chronology);
    }

    public MutableDateTime(long j9, DateTimeZone dateTimeZone) {
        super(j9, dateTimeZone);
    }

    public MutableDateTime(Object obj) {
        super(obj, (Chronology) null);
    }

    public MutableDateTime(Object obj, Chronology chronology) {
        super(obj, DateTimeUtils.getChronology(chronology));
    }

    public MutableDateTime(Object obj, DateTimeZone dateTimeZone) {
        super(obj, dateTimeZone);
    }

    public MutableDateTime(Chronology chronology) {
        super(chronology);
    }

    public MutableDateTime(DateTimeZone dateTimeZone) {
        super(dateTimeZone);
    }

    public static MutableDateTime now() {
        return new MutableDateTime();
    }

    public static MutableDateTime now(Chronology chronology) {
        if (chronology != null) {
            return new MutableDateTime(chronology);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    public static MutableDateTime now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new MutableDateTime(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    @FromString
    public static MutableDateTime parse(String str) {
        return parse(str, ISODateTimeFormat.dateTimeParser().withOffsetParsed());
    }

    public static MutableDateTime parse(String str, DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter.parseDateTime(str).toMutableDateTime();
    }

    @Override // org.joda.time.ReadWritableInstant
    public void add(long j9) {
        setMillis(FieldUtils.safeAdd(getMillis(), j9));
    }

    @Override // org.joda.time.ReadWritableInstant
    public void add(DurationFieldType durationFieldType, int i9) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (i9 != 0) {
            setMillis(durationFieldType.getField(getChronology()).add(getMillis(), i9));
        }
    }

    @Override // org.joda.time.ReadWritableInstant
    public void add(ReadableDuration readableDuration) {
        add(readableDuration, 1);
    }

    @Override // org.joda.time.ReadWritableInstant
    public void add(ReadableDuration readableDuration, int i9) {
        if (readableDuration != null) {
            add(FieldUtils.safeMultiply(readableDuration.getMillis(), i9));
        }
    }

    @Override // org.joda.time.ReadWritableInstant
    public void add(ReadablePeriod readablePeriod) {
        add(readablePeriod, 1);
    }

    @Override // org.joda.time.ReadWritableInstant
    public void add(ReadablePeriod readablePeriod, int i9) {
        if (readablePeriod != null) {
            setMillis(getChronology().add(readablePeriod, getMillis(), i9));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addDays(int i9) {
        if (i9 != 0) {
            setMillis(getChronology().days().add(getMillis(), i9));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addHours(int i9) {
        if (i9 != 0) {
            setMillis(getChronology().hours().add(getMillis(), i9));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addMillis(int i9) {
        if (i9 != 0) {
            setMillis(getChronology().millis().add(getMillis(), i9));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addMinutes(int i9) {
        if (i9 != 0) {
            setMillis(getChronology().minutes().add(getMillis(), i9));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addMonths(int i9) {
        if (i9 != 0) {
            setMillis(getChronology().months().add(getMillis(), i9));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addSeconds(int i9) {
        if (i9 != 0) {
            setMillis(getChronology().seconds().add(getMillis(), i9));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addWeeks(int i9) {
        if (i9 != 0) {
            setMillis(getChronology().weeks().add(getMillis(), i9));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addWeekyears(int i9) {
        if (i9 != 0) {
            setMillis(getChronology().weekyears().add(getMillis(), i9));
        }
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void addYears(int i9) {
        if (i9 != 0) {
            setMillis(getChronology().years().add(getMillis(), i9));
        }
    }

    public Property centuryOfEra() {
        return new Property(this, getChronology().centuryOfEra());
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    public MutableDateTime copy() {
        return (MutableDateTime) clone();
    }

    public Property dayOfMonth() {
        return new Property(this, getChronology().dayOfMonth());
    }

    public Property dayOfWeek() {
        return new Property(this, getChronology().dayOfWeek());
    }

    public Property dayOfYear() {
        return new Property(this, getChronology().dayOfYear());
    }

    public Property era() {
        return new Property(this, getChronology().era());
    }

    public DateTimeField getRoundingField() {
        return this.iRoundingField;
    }

    public int getRoundingMode() {
        return this.iRoundingMode;
    }

    public Property hourOfDay() {
        return new Property(this, getChronology().hourOfDay());
    }

    public Property millisOfDay() {
        return new Property(this, getChronology().millisOfDay());
    }

    public Property millisOfSecond() {
        return new Property(this, getChronology().millisOfSecond());
    }

    public Property minuteOfDay() {
        return new Property(this, getChronology().minuteOfDay());
    }

    public Property minuteOfHour() {
        return new Property(this, getChronology().minuteOfHour());
    }

    public Property monthOfYear() {
        return new Property(this, getChronology().monthOfYear());
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        DateTimeField field = dateTimeFieldType.getField(getChronology());
        if (field.isSupported()) {
            return new Property(this, field);
        }
        throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
    }

    public Property secondOfDay() {
        return new Property(this, getChronology().secondOfDay());
    }

    public Property secondOfMinute() {
        return new Property(this, getChronology().secondOfMinute());
    }

    @Override // org.joda.time.ReadWritableInstant
    public void set(DateTimeFieldType dateTimeFieldType, int i9) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        setMillis(dateTimeFieldType.getField(getChronology()).set(getMillis(), i9));
    }

    @Override // org.joda.time.base.BaseDateTime, org.joda.time.ReadWritableInstant
    public void setChronology(Chronology chronology) {
        super.setChronology(chronology);
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setDate(int i9, int i10, int i11) {
        setDate(getChronology().getDateTimeMillis(i9, i10, i11, 0));
    }

    public void setDate(long j9) {
        setMillis(getChronology().millisOfDay().set(j9, getMillisOfDay()));
    }

    public void setDate(ReadableInstant readableInstant) {
        DateTimeZone zone;
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        if ((readableInstant instanceof ReadableDateTime) && (zone = DateTimeUtils.getChronology(((ReadableDateTime) readableInstant).getChronology()).getZone()) != null) {
            instantMillis = zone.getMillisKeepLocal(getZone(), instantMillis);
        }
        setDate(instantMillis);
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setDateTime(int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        setMillis(getChronology().getDateTimeMillis(i9, i10, i11, i12, i13, i14, i15));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setDayOfMonth(int i9) {
        setMillis(getChronology().dayOfMonth().set(getMillis(), i9));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setDayOfWeek(int i9) {
        setMillis(getChronology().dayOfWeek().set(getMillis(), i9));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setDayOfYear(int i9) {
        setMillis(getChronology().dayOfYear().set(getMillis(), i9));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setHourOfDay(int i9) {
        setMillis(getChronology().hourOfDay().set(getMillis(), i9));
    }

    @Override // org.joda.time.base.BaseDateTime, org.joda.time.ReadWritableInstant
    public void setMillis(long j9) {
        int i9 = this.iRoundingMode;
        if (i9 == 1) {
            j9 = this.iRoundingField.roundFloor(j9);
        } else if (i9 == 2) {
            j9 = this.iRoundingField.roundCeiling(j9);
        } else if (i9 == 3) {
            j9 = this.iRoundingField.roundHalfFloor(j9);
        } else if (i9 == 4) {
            j9 = this.iRoundingField.roundHalfCeiling(j9);
        } else if (i9 == 5) {
            j9 = this.iRoundingField.roundHalfEven(j9);
        }
        super.setMillis(j9);
    }

    @Override // org.joda.time.ReadWritableInstant
    public void setMillis(ReadableInstant readableInstant) {
        setMillis(DateTimeUtils.getInstantMillis(readableInstant));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setMillisOfDay(int i9) {
        setMillis(getChronology().millisOfDay().set(getMillis(), i9));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setMillisOfSecond(int i9) {
        setMillis(getChronology().millisOfSecond().set(getMillis(), i9));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setMinuteOfDay(int i9) {
        setMillis(getChronology().minuteOfDay().set(getMillis(), i9));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setMinuteOfHour(int i9) {
        setMillis(getChronology().minuteOfHour().set(getMillis(), i9));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setMonthOfYear(int i9) {
        setMillis(getChronology().monthOfYear().set(getMillis(), i9));
    }

    public void setRounding(DateTimeField dateTimeField) {
        setRounding(dateTimeField, 1);
    }

    public void setRounding(DateTimeField dateTimeField, int i9) {
        if (dateTimeField != null && (i9 < 0 || i9 > 5)) {
            throw new IllegalArgumentException("Illegal rounding mode: " + i9);
        }
        this.iRoundingField = i9 == 0 ? null : dateTimeField;
        if (dateTimeField == null) {
            i9 = 0;
        }
        this.iRoundingMode = i9;
        setMillis(getMillis());
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setSecondOfDay(int i9) {
        setMillis(getChronology().secondOfDay().set(getMillis(), i9));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setSecondOfMinute(int i9) {
        setMillis(getChronology().secondOfMinute().set(getMillis(), i9));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setTime(int i9, int i10, int i11, int i12) {
        setMillis(getChronology().getDateTimeMillis(getMillis(), i9, i10, i11, i12));
    }

    public void setTime(long j9) {
        setMillis(getChronology().millisOfDay().set(getMillis(), ISOChronology.getInstanceUTC().millisOfDay().get(j9)));
    }

    public void setTime(ReadableInstant readableInstant) {
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        DateTimeZone zone = DateTimeUtils.getInstantChronology(readableInstant).getZone();
        if (zone != null) {
            instantMillis = zone.getMillisKeepLocal(DateTimeZone.UTC, instantMillis);
        }
        setTime(instantMillis);
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setWeekOfWeekyear(int i9) {
        setMillis(getChronology().weekOfWeekyear().set(getMillis(), i9));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setWeekyear(int i9) {
        setMillis(getChronology().weekyear().set(getMillis(), i9));
    }

    @Override // org.joda.time.ReadWritableDateTime
    public void setYear(int i9) {
        setMillis(getChronology().year().set(getMillis(), i9));
    }

    @Override // org.joda.time.ReadWritableInstant
    public void setZone(DateTimeZone dateTimeZone) {
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        Chronology chronology = getChronology();
        if (chronology.getZone() != zone) {
            setChronology(chronology.withZone(zone));
        }
    }

    @Override // org.joda.time.ReadWritableInstant
    public void setZoneRetainFields(DateTimeZone dateTimeZone) {
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        DateTimeZone zone2 = DateTimeUtils.getZone(getZone());
        if (zone == zone2) {
            return;
        }
        long millisKeepLocal = zone2.getMillisKeepLocal(zone, getMillis());
        setChronology(getChronology().withZone(zone));
        setMillis(millisKeepLocal);
    }

    public Property weekOfWeekyear() {
        return new Property(this, getChronology().weekOfWeekyear());
    }

    public Property weekyear() {
        return new Property(this, getChronology().weekyear());
    }

    public Property year() {
        return new Property(this, getChronology().year());
    }

    public Property yearOfCentury() {
        return new Property(this, getChronology().yearOfCentury());
    }

    public Property yearOfEra() {
        return new Property(this, getChronology().yearOfEra());
    }
}
