package org.joda.time;

/* JADX INFO: loaded from: classes4.dex */
public interface ReadWritableDateTime extends ReadableDateTime, ReadWritableInstant {
    void addDays(int i9);

    void addHours(int i9);

    void addMillis(int i9);

    void addMinutes(int i9);

    void addMonths(int i9);

    void addSeconds(int i9);

    void addWeeks(int i9);

    void addWeekyears(int i9);

    void addYears(int i9);

    void setDate(int i9, int i10, int i11);

    void setDateTime(int i9, int i10, int i11, int i12, int i13, int i14, int i15);

    void setDayOfMonth(int i9);

    void setDayOfWeek(int i9);

    void setDayOfYear(int i9);

    void setHourOfDay(int i9);

    void setMillisOfDay(int i9);

    void setMillisOfSecond(int i9);

    void setMinuteOfDay(int i9);

    void setMinuteOfHour(int i9);

    void setMonthOfYear(int i9);

    void setSecondOfDay(int i9);

    void setSecondOfMinute(int i9);

    void setTime(int i9, int i10, int i11, int i12);

    void setWeekOfWeekyear(int i9);

    void setWeekyear(int i9);

    void setYear(int i9);
}
