package org.joda.time;

import java.io.Serializable;
import org.joda.convert.FromString;
import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes4.dex */
public final class Instant extends AbstractInstant implements ReadableInstant, Serializable {
    private static final long serialVersionUID = 3299096530934209741L;
    private final long iMillis;

    public Instant() {
        this.iMillis = DateTimeUtils.currentTimeMillis();
    }

    public Instant(long j9) {
        this.iMillis = j9;
    }

    public Instant(Object obj) {
        this.iMillis = ConverterManager.getInstance().getInstantConverter(obj).getInstantMillis(obj, ISOChronology.getInstanceUTC());
    }

    public static Instant now() {
        return new Instant();
    }

    @FromString
    public static Instant parse(String str) {
        return parse(str, ISODateTimeFormat.dateTimeParser());
    }

    public static Instant parse(String str, DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter.parseDateTime(str).toInstant();
    }

    @Override // org.joda.time.ReadableInstant
    public Chronology getChronology() {
        return ISOChronology.getInstanceUTC();
    }

    @Override // org.joda.time.ReadableInstant
    public long getMillis() {
        return this.iMillis;
    }

    public Instant minus(long j9) {
        return withDurationAdded(j9, -1);
    }

    public Instant minus(ReadableDuration readableDuration) {
        return withDurationAdded(readableDuration, -1);
    }

    public Instant plus(long j9) {
        return withDurationAdded(j9, 1);
    }

    public Instant plus(ReadableDuration readableDuration) {
        return withDurationAdded(readableDuration, 1);
    }

    @Override // org.joda.time.base.AbstractInstant, org.joda.time.ReadableDateTime
    public DateTime toDateTime() {
        return new DateTime(getMillis(), ISOChronology.getInstance());
    }

    @Override // org.joda.time.base.AbstractInstant
    @Deprecated
    public DateTime toDateTimeISO() {
        return toDateTime();
    }

    @Override // org.joda.time.base.AbstractInstant, org.joda.time.ReadableInstant
    public Instant toInstant() {
        return this;
    }

    @Override // org.joda.time.base.AbstractInstant
    public MutableDateTime toMutableDateTime() {
        return new MutableDateTime(getMillis(), ISOChronology.getInstance());
    }

    @Override // org.joda.time.base.AbstractInstant
    @Deprecated
    public MutableDateTime toMutableDateTimeISO() {
        return toMutableDateTime();
    }

    public Instant withDurationAdded(long j9, int i9) {
        return (j9 == 0 || i9 == 0) ? this : withMillis(getChronology().add(getMillis(), j9, i9));
    }

    public Instant withDurationAdded(ReadableDuration readableDuration, int i9) {
        return (readableDuration == null || i9 == 0) ? this : withDurationAdded(readableDuration.getMillis(), i9);
    }

    public Instant withMillis(long j9) {
        return j9 == this.iMillis ? this : new Instant(j9);
    }
}
