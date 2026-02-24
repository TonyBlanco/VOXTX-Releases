package org.joda.time.chrono;

import java.util.HashMap;
import java.util.Locale;
import org.apache.http.message.TokenParser;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableDateTime;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.DecoratedDateTimeField;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes4.dex */
public final class LimitChronology extends AssembledChronology {
    private static final long serialVersionUID = 7670866536893052522L;
    final DateTime iLowerLimit;
    final DateTime iUpperLimit;
    private transient LimitChronology iWithUTC;

    public class LimitDateTimeField extends DecoratedDateTimeField {
        private static final long serialVersionUID = -2435306746995699312L;
        private final DurationField iDurationField;
        private final DurationField iLeapDurationField;
        private final DurationField iRangeDurationField;

        public LimitDateTimeField(DateTimeField dateTimeField, DurationField durationField, DurationField durationField2, DurationField durationField3) {
            super(dateTimeField, dateTimeField.getType());
            this.iDurationField = durationField;
            this.iRangeDurationField = durationField2;
            this.iLeapDurationField = durationField3;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j9, int i9) {
            LimitChronology.this.checkLimits(j9, null);
            long jAdd = getWrappedField().add(j9, i9);
            LimitChronology.this.checkLimits(jAdd, "resulting");
            return jAdd;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j9, long j10) {
            LimitChronology.this.checkLimits(j9, null);
            long jAdd = getWrappedField().add(j9, j10);
            LimitChronology.this.checkLimits(jAdd, "resulting");
            return jAdd;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long addWrapField(long j9, int i9) {
            LimitChronology.this.checkLimits(j9, null);
            long jAddWrapField = getWrappedField().addWrapField(j9, i9);
            LimitChronology.this.checkLimits(jAddWrapField, "resulting");
            return jAddWrapField;
        }

        @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int get(long j9) {
            LimitChronology.this.checkLimits(j9, null);
            return getWrappedField().get(j9);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsShortText(long j9, Locale locale) {
            LimitChronology.this.checkLimits(j9, null);
            return getWrappedField().getAsShortText(j9, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(long j9, Locale locale) {
            LimitChronology.this.checkLimits(j9, null);
            return getWrappedField().getAsText(j9, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getDifference(long j9, long j10) {
            LimitChronology.this.checkLimits(j9, "minuend");
            LimitChronology.this.checkLimits(j10, "subtrahend");
            return getWrappedField().getDifference(j9, j10);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long getDifferenceAsLong(long j9, long j10) {
            LimitChronology.this.checkLimits(j9, "minuend");
            LimitChronology.this.checkLimits(j10, "subtrahend");
            return getWrappedField().getDifferenceAsLong(j9, j10);
        }

        @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public final DurationField getDurationField() {
            return this.iDurationField;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getLeapAmount(long j9) {
            LimitChronology.this.checkLimits(j9, null);
            return getWrappedField().getLeapAmount(j9);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public final DurationField getLeapDurationField() {
            return this.iLeapDurationField;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumShortTextLength(Locale locale) {
            return getWrappedField().getMaximumShortTextLength(locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumTextLength(Locale locale) {
            return getWrappedField().getMaximumTextLength(locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(long j9) {
            LimitChronology.this.checkLimits(j9, null);
            return getWrappedField().getMaximumValue(j9);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(long j9) {
            LimitChronology.this.checkLimits(j9, null);
            return getWrappedField().getMinimumValue(j9);
        }

        @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public final DurationField getRangeDurationField() {
            return this.iRangeDurationField;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public boolean isLeap(long j9) {
            LimitChronology.this.checkLimits(j9, null);
            return getWrappedField().isLeap(j9);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long remainder(long j9) {
            LimitChronology.this.checkLimits(j9, null);
            long jRemainder = getWrappedField().remainder(j9);
            LimitChronology.this.checkLimits(jRemainder, "resulting");
            return jRemainder;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundCeiling(long j9) {
            LimitChronology.this.checkLimits(j9, null);
            long jRoundCeiling = getWrappedField().roundCeiling(j9);
            LimitChronology.this.checkLimits(jRoundCeiling, "resulting");
            return jRoundCeiling;
        }

        @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundFloor(long j9) {
            LimitChronology.this.checkLimits(j9, null);
            long jRoundFloor = getWrappedField().roundFloor(j9);
            LimitChronology.this.checkLimits(jRoundFloor, "resulting");
            return jRoundFloor;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundHalfCeiling(long j9) {
            LimitChronology.this.checkLimits(j9, null);
            long jRoundHalfCeiling = getWrappedField().roundHalfCeiling(j9);
            LimitChronology.this.checkLimits(jRoundHalfCeiling, "resulting");
            return jRoundHalfCeiling;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundHalfEven(long j9) {
            LimitChronology.this.checkLimits(j9, null);
            long jRoundHalfEven = getWrappedField().roundHalfEven(j9);
            LimitChronology.this.checkLimits(jRoundHalfEven, "resulting");
            return jRoundHalfEven;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundHalfFloor(long j9) {
            LimitChronology.this.checkLimits(j9, null);
            long jRoundHalfFloor = getWrappedField().roundHalfFloor(j9);
            LimitChronology.this.checkLimits(jRoundHalfFloor, "resulting");
            return jRoundHalfFloor;
        }

        @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j9, int i9) {
            LimitChronology.this.checkLimits(j9, null);
            long j10 = getWrappedField().set(j9, i9);
            LimitChronology.this.checkLimits(j10, "resulting");
            return j10;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j9, String str, Locale locale) {
            LimitChronology.this.checkLimits(j9, null);
            long j10 = getWrappedField().set(j9, str, locale);
            LimitChronology.this.checkLimits(j10, "resulting");
            return j10;
        }
    }

    public class LimitDurationField extends DecoratedDurationField {
        private static final long serialVersionUID = 8049297699408782284L;

        public LimitDurationField(DurationField durationField) {
            super(durationField, durationField.getType());
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long add(long j9, int i9) {
            LimitChronology.this.checkLimits(j9, null);
            long jAdd = getWrappedField().add(j9, i9);
            LimitChronology.this.checkLimits(jAdd, "resulting");
            return jAdd;
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long add(long j9, long j10) {
            LimitChronology.this.checkLimits(j9, null);
            long jAdd = getWrappedField().add(j9, j10);
            LimitChronology.this.checkLimits(jAdd, "resulting");
            return jAdd;
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getDifference(long j9, long j10) {
            LimitChronology.this.checkLimits(j9, "minuend");
            LimitChronology.this.checkLimits(j10, "subtrahend");
            return getWrappedField().getDifference(j9, j10);
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long getDifferenceAsLong(long j9, long j10) {
            LimitChronology.this.checkLimits(j9, "minuend");
            LimitChronology.this.checkLimits(j10, "subtrahend");
            return getWrappedField().getDifferenceAsLong(j9, j10);
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long getMillis(int i9, long j9) {
            LimitChronology.this.checkLimits(j9, null);
            return getWrappedField().getMillis(i9, j9);
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long getMillis(long j9, long j10) {
            LimitChronology.this.checkLimits(j10, null);
            return getWrappedField().getMillis(j9, j10);
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getValue(long j9, long j10) {
            LimitChronology.this.checkLimits(j10, null);
            return getWrappedField().getValue(j9, j10);
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long getValueAsLong(long j9, long j10) {
            LimitChronology.this.checkLimits(j10, null);
            return getWrappedField().getValueAsLong(j9, j10);
        }
    }

    public class LimitException extends IllegalArgumentException {
        private static final long serialVersionUID = -5924689995607498581L;
        private final boolean iIsLow;

        public LimitException(String str, boolean z9) {
            super(str);
            this.iIsLow = z9;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            DateTime upperLimit;
            StringBuffer stringBuffer = new StringBuffer(85);
            stringBuffer.append("The");
            String message = super.getMessage();
            if (message != null) {
                stringBuffer.append(TokenParser.SP);
                stringBuffer.append(message);
            }
            stringBuffer.append(" instant is ");
            DateTimeFormatter dateTimeFormatterWithChronology = ISODateTimeFormat.dateTime().withChronology(LimitChronology.this.getBase());
            if (this.iIsLow) {
                stringBuffer.append("below the supported minimum of ");
                upperLimit = LimitChronology.this.getLowerLimit();
            } else {
                stringBuffer.append("above the supported maximum of ");
                upperLimit = LimitChronology.this.getUpperLimit();
            }
            dateTimeFormatterWithChronology.printTo(stringBuffer, upperLimit.getMillis());
            stringBuffer.append(" (");
            stringBuffer.append(LimitChronology.this.getBase());
            stringBuffer.append(')');
            return stringBuffer.toString();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IllegalArgumentException: " + getMessage();
        }
    }

    private LimitChronology(Chronology chronology, DateTime dateTime, DateTime dateTime2) {
        super(chronology, null);
        this.iLowerLimit = dateTime;
        this.iUpperLimit = dateTime2;
    }

    private DateTimeField convertField(DateTimeField dateTimeField, HashMap<Object, Object> map) {
        if (dateTimeField == null || !dateTimeField.isSupported()) {
            return dateTimeField;
        }
        if (map.containsKey(dateTimeField)) {
            return (DateTimeField) map.get(dateTimeField);
        }
        LimitDateTimeField limitDateTimeField = new LimitDateTimeField(dateTimeField, convertField(dateTimeField.getDurationField(), map), convertField(dateTimeField.getRangeDurationField(), map), convertField(dateTimeField.getLeapDurationField(), map));
        map.put(dateTimeField, limitDateTimeField);
        return limitDateTimeField;
    }

    private DurationField convertField(DurationField durationField, HashMap<Object, Object> map) {
        if (durationField == null || !durationField.isSupported()) {
            return durationField;
        }
        if (map.containsKey(durationField)) {
            return (DurationField) map.get(durationField);
        }
        LimitDurationField limitDurationField = new LimitDurationField(durationField);
        map.put(durationField, limitDurationField);
        return limitDurationField;
    }

    public static LimitChronology getInstance(Chronology chronology, ReadableDateTime readableDateTime, ReadableDateTime readableDateTime2) {
        if (chronology == null) {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        DateTime dateTime = readableDateTime == null ? null : readableDateTime.toDateTime();
        DateTime dateTime2 = readableDateTime2 != null ? readableDateTime2.toDateTime() : null;
        if (dateTime == null || dateTime2 == null || dateTime.isBefore(dateTime2)) {
            return new LimitChronology(chronology, dateTime, dateTime2);
        }
        throw new IllegalArgumentException("The lower limit must be come before than the upper limit");
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        HashMap<Object, Object> map = new HashMap<>();
        fields.eras = convertField(fields.eras, map);
        fields.centuries = convertField(fields.centuries, map);
        fields.years = convertField(fields.years, map);
        fields.months = convertField(fields.months, map);
        fields.weekyears = convertField(fields.weekyears, map);
        fields.weeks = convertField(fields.weeks, map);
        fields.days = convertField(fields.days, map);
        fields.halfdays = convertField(fields.halfdays, map);
        fields.hours = convertField(fields.hours, map);
        fields.minutes = convertField(fields.minutes, map);
        fields.seconds = convertField(fields.seconds, map);
        fields.millis = convertField(fields.millis, map);
        fields.year = convertField(fields.year, map);
        fields.yearOfEra = convertField(fields.yearOfEra, map);
        fields.yearOfCentury = convertField(fields.yearOfCentury, map);
        fields.centuryOfEra = convertField(fields.centuryOfEra, map);
        fields.era = convertField(fields.era, map);
        fields.dayOfWeek = convertField(fields.dayOfWeek, map);
        fields.dayOfMonth = convertField(fields.dayOfMonth, map);
        fields.dayOfYear = convertField(fields.dayOfYear, map);
        fields.monthOfYear = convertField(fields.monthOfYear, map);
        fields.weekOfWeekyear = convertField(fields.weekOfWeekyear, map);
        fields.weekyear = convertField(fields.weekyear, map);
        fields.weekyearOfCentury = convertField(fields.weekyearOfCentury, map);
        fields.millisOfSecond = convertField(fields.millisOfSecond, map);
        fields.millisOfDay = convertField(fields.millisOfDay, map);
        fields.secondOfMinute = convertField(fields.secondOfMinute, map);
        fields.secondOfDay = convertField(fields.secondOfDay, map);
        fields.minuteOfHour = convertField(fields.minuteOfHour, map);
        fields.minuteOfDay = convertField(fields.minuteOfDay, map);
        fields.hourOfDay = convertField(fields.hourOfDay, map);
        fields.hourOfHalfday = convertField(fields.hourOfHalfday, map);
        fields.clockhourOfDay = convertField(fields.clockhourOfDay, map);
        fields.clockhourOfHalfday = convertField(fields.clockhourOfHalfday, map);
        fields.halfdayOfDay = convertField(fields.halfdayOfDay, map);
    }

    public void checkLimits(long j9, String str) {
        DateTime dateTime = this.iLowerLimit;
        if (dateTime != null && j9 < dateTime.getMillis()) {
            throw new LimitException(str, true);
        }
        DateTime dateTime2 = this.iUpperLimit;
        if (dateTime2 != null && j9 >= dateTime2.getMillis()) {
            throw new LimitException(str, false);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitChronology)) {
            return false;
        }
        LimitChronology limitChronology = (LimitChronology) obj;
        return getBase().equals(limitChronology.getBase()) && FieldUtils.equals(getLowerLimit(), limitChronology.getLowerLimit()) && FieldUtils.equals(getUpperLimit(), limitChronology.getUpperLimit());
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i9, int i10, int i11, int i12) throws IllegalArgumentException {
        long dateTimeMillis = getBase().getDateTimeMillis(i9, i10, i11, i12);
        checkLimits(dateTimeMillis, "resulting");
        return dateTimeMillis;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i9, int i10, int i11, int i12, int i13, int i14, int i15) throws IllegalArgumentException {
        long dateTimeMillis = getBase().getDateTimeMillis(i9, i10, i11, i12, i13, i14, i15);
        checkLimits(dateTimeMillis, "resulting");
        return dateTimeMillis;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(long j9, int i9, int i10, int i11, int i12) throws IllegalArgumentException {
        checkLimits(j9, null);
        long dateTimeMillis = getBase().getDateTimeMillis(j9, i9, i10, i11, i12);
        checkLimits(dateTimeMillis, "resulting");
        return dateTimeMillis;
    }

    public DateTime getLowerLimit() {
        return this.iLowerLimit;
    }

    public DateTime getUpperLimit() {
        return this.iUpperLimit;
    }

    public int hashCode() {
        return (getLowerLimit() != null ? getLowerLimit().hashCode() : 0) + 317351877 + (getUpperLimit() != null ? getUpperLimit().hashCode() : 0) + (getBase().hashCode() * 7);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LimitChronology[");
        sb.append(getBase().toString());
        sb.append(", ");
        sb.append(getLowerLimit() == null ? "NoLimit" : getLowerLimit().toString());
        sb.append(", ");
        sb.append(getUpperLimit() != null ? getUpperLimit().toString() : "NoLimit");
        sb.append(']');
        return sb.toString();
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withUTC() {
        return withZone(DateTimeZone.UTC);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withZone(DateTimeZone dateTimeZone) {
        LimitChronology limitChronology;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        if (dateTimeZone == getZone()) {
            return this;
        }
        DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
        if (dateTimeZone == dateTimeZone2 && (limitChronology = this.iWithUTC) != null) {
            return limitChronology;
        }
        DateTime dateTime = this.iLowerLimit;
        if (dateTime != null) {
            MutableDateTime mutableDateTime = dateTime.toMutableDateTime();
            mutableDateTime.setZoneRetainFields(dateTimeZone);
            dateTime = mutableDateTime.toDateTime();
        }
        DateTime dateTime2 = this.iUpperLimit;
        if (dateTime2 != null) {
            MutableDateTime mutableDateTime2 = dateTime2.toMutableDateTime();
            mutableDateTime2.setZoneRetainFields(dateTimeZone);
            dateTime2 = mutableDateTime2.toDateTime();
        }
        LimitChronology limitChronology2 = getInstance(getBase().withZone(dateTimeZone), dateTime, dateTime2);
        if (dateTimeZone == dateTimeZone2) {
            this.iWithUTC = limitChronology2;
        }
        return limitChronology2;
    }
}
