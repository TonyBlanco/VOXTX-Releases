package com.amazonaws.util;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class TimingInfo {
    private static final double TIME_CONVERSION = 1000.0d;
    static final int UNKNOWN = -1;
    private Long endTimeNano;
    private final Long startEpochTimeMilli;
    private final long startTimeNano;

    public TimingInfo(Long l9, long j9, Long l10) {
        this.startEpochTimeMilli = l9;
        this.startTimeNano = j9;
        this.endTimeNano = l10;
    }

    public static double durationMilliOf(long j9, long j10) {
        return TimeUnit.NANOSECONDS.toMicros(j10 - j9) / TIME_CONVERSION;
    }

    public static TimingInfo newTimingInfoFullSupport(long j9, long j10) {
        return new TimingInfoFullSupport(null, j9, Long.valueOf(j10));
    }

    public static TimingInfo newTimingInfoFullSupport(long j9, long j10, long j11) {
        return new TimingInfoFullSupport(Long.valueOf(j9), j10, Long.valueOf(j11));
    }

    public static TimingInfo startTiming() {
        return new TimingInfo(Long.valueOf(System.currentTimeMillis()), System.nanoTime(), null);
    }

    public static TimingInfo startTimingFullSupport() {
        return new TimingInfoFullSupport(Long.valueOf(System.currentTimeMillis()), System.nanoTime(), null);
    }

    public static TimingInfo startTimingFullSupport(long j9) {
        return new TimingInfoFullSupport(null, j9, null);
    }

    public static TimingInfo unmodifiableTimingInfo(long j9, long j10, Long l9) {
        return new TimingInfoUnmodifiable(Long.valueOf(j9), j10, l9);
    }

    public static TimingInfo unmodifiableTimingInfo(long j9, Long l9) {
        return new TimingInfoUnmodifiable(null, j9, l9);
    }

    public void addSubMeasurement(String str, TimingInfo timingInfo) {
    }

    public TimingInfo endTiming() {
        this.endTimeNano = Long.valueOf(System.nanoTime());
        return this;
    }

    public Map<String, Number> getAllCounters() {
        return Collections.emptyMap();
    }

    public List<TimingInfo> getAllSubMeasurements(String str) {
        return null;
    }

    public Number getCounter(String str) {
        return null;
    }

    @Deprecated
    public final long getElapsedTimeMillis() {
        Double timeTakenMillisIfKnown = getTimeTakenMillisIfKnown();
        if (timeTakenMillisIfKnown == null) {
            return -1L;
        }
        return timeTakenMillisIfKnown.longValue();
    }

    @Deprecated
    public final long getEndEpochTimeMilli() {
        Long endEpochTimeMilliIfKnown = getEndEpochTimeMilliIfKnown();
        if (endEpochTimeMilliIfKnown == null) {
            return -1L;
        }
        return endEpochTimeMilliIfKnown.longValue();
    }

    public final Long getEndEpochTimeMilliIfKnown() {
        if (isStartEpochTimeMilliKnown() && isEndTimeKnown()) {
            return Long.valueOf(this.startEpochTimeMilli.longValue() + TimeUnit.NANOSECONDS.toMillis(this.endTimeNano.longValue() - this.startTimeNano));
        }
        return null;
    }

    @Deprecated
    public final long getEndTime() {
        return getEndEpochTimeMilli();
    }

    public final long getEndTimeNano() {
        Long l9 = this.endTimeNano;
        if (l9 == null) {
            return -1L;
        }
        return l9.longValue();
    }

    public final Long getEndTimeNanoIfKnown() {
        return this.endTimeNano;
    }

    public TimingInfo getLastSubMeasurement(String str) {
        return null;
    }

    @Deprecated
    public final long getStartEpochTimeMilli() {
        Long startEpochTimeMilliIfKnown = getStartEpochTimeMilliIfKnown();
        if (startEpochTimeMilliIfKnown == null) {
            return -1L;
        }
        return startEpochTimeMilliIfKnown.longValue();
    }

    public final Long getStartEpochTimeMilliIfKnown() {
        return this.startEpochTimeMilli;
    }

    @Deprecated
    public final long getStartTime() {
        return isStartEpochTimeMilliKnown() ? this.startEpochTimeMilli.longValue() : TimeUnit.NANOSECONDS.toMillis(this.startTimeNano);
    }

    public final long getStartTimeNano() {
        return this.startTimeNano;
    }

    public TimingInfo getSubMeasurement(String str) {
        return null;
    }

    public TimingInfo getSubMeasurement(String str, int i9) {
        return null;
    }

    public Map<String, List<TimingInfo>> getSubMeasurementsByName() {
        return Collections.emptyMap();
    }

    @Deprecated
    public final double getTimeTakenMillis() {
        Double timeTakenMillisIfKnown = getTimeTakenMillisIfKnown();
        if (timeTakenMillisIfKnown == null) {
            return -1.0d;
        }
        return timeTakenMillisIfKnown.doubleValue();
    }

    public final Double getTimeTakenMillisIfKnown() {
        if (isEndTimeKnown()) {
            return Double.valueOf(durationMilliOf(this.startTimeNano, this.endTimeNano.longValue()));
        }
        return null;
    }

    public void incrementCounter(String str) {
    }

    public final boolean isEndTimeKnown() {
        return this.endTimeNano != null;
    }

    public final boolean isStartEpochTimeMilliKnown() {
        return this.startEpochTimeMilli != null;
    }

    public void setCounter(String str, long j9) {
    }

    @Deprecated
    public void setEndTime(long j9) {
        this.endTimeNano = Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j9));
    }

    public void setEndTimeNano(long j9) {
        this.endTimeNano = Long.valueOf(j9);
    }

    public final String toString() {
        return String.valueOf(getTimeTakenMillis());
    }
}
