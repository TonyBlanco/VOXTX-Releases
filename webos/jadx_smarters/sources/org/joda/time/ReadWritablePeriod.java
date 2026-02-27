package org.joda.time;

/* JADX INFO: loaded from: classes4.dex */
public interface ReadWritablePeriod extends ReadablePeriod {
    void add(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16);

    void add(DurationFieldType durationFieldType, int i9);

    void add(ReadableInterval readableInterval);

    void add(ReadablePeriod readablePeriod);

    void addDays(int i9);

    void addHours(int i9);

    void addMillis(int i9);

    void addMinutes(int i9);

    void addMonths(int i9);

    void addSeconds(int i9);

    void addWeeks(int i9);

    void addYears(int i9);

    void clear();

    void set(DurationFieldType durationFieldType, int i9);

    void setDays(int i9);

    void setHours(int i9);

    void setMillis(int i9);

    void setMinutes(int i9);

    void setMonths(int i9);

    void setPeriod(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16);

    void setPeriod(ReadableInterval readableInterval);

    void setPeriod(ReadablePeriod readablePeriod);

    void setSeconds(int i9);

    void setValue(int i9, int i10);

    void setWeeks(int i9);

    void setYears(int i9);
}
