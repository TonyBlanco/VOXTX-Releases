package org.joda.time;

/* JADX INFO: loaded from: classes4.dex */
public interface ReadWritableInstant extends ReadableInstant {
    void add(long j9);

    void add(DurationFieldType durationFieldType, int i9);

    void add(ReadableDuration readableDuration);

    void add(ReadableDuration readableDuration, int i9);

    void add(ReadablePeriod readablePeriod);

    void add(ReadablePeriod readablePeriod, int i9);

    void set(DateTimeFieldType dateTimeFieldType, int i9);

    void setChronology(Chronology chronology);

    void setMillis(long j9);

    void setMillis(ReadableInstant readableInstant);

    void setZone(DateTimeZone dateTimeZone);

    void setZoneRetainFields(DateTimeZone dateTimeZone);
}
