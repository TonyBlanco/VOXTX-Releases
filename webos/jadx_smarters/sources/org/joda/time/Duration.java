package org.joda.time;

import java.io.Serializable;
import org.achartengine.chart.TimeChart;
import org.joda.convert.FromString;
import org.joda.time.base.BaseDuration;
import org.joda.time.field.FieldUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class Duration extends BaseDuration implements ReadableDuration, Serializable {
    public static final Duration ZERO = new Duration(0);
    private static final long serialVersionUID = 2471658376918L;

    public Duration(long j9) {
        super(j9);
    }

    public Duration(long j9, long j10) {
        super(j9, j10);
    }

    public Duration(Object obj) {
        super(obj);
    }

    public Duration(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        super(readableInstant, readableInstant2);
    }

    public static Duration millis(long j9) {
        return j9 == 0 ? ZERO : new Duration(j9);
    }

    @FromString
    public static Duration parse(String str) {
        return new Duration(str);
    }

    public static Duration standardDays(long j9) {
        return j9 == 0 ? ZERO : new Duration(FieldUtils.safeMultiply(j9, DateTimeConstants.MILLIS_PER_DAY));
    }

    public static Duration standardHours(long j9) {
        return j9 == 0 ? ZERO : new Duration(FieldUtils.safeMultiply(j9, DateTimeConstants.MILLIS_PER_HOUR));
    }

    public static Duration standardMinutes(long j9) {
        return j9 == 0 ? ZERO : new Duration(FieldUtils.safeMultiply(j9, DateTimeConstants.MILLIS_PER_MINUTE));
    }

    public static Duration standardSeconds(long j9) {
        return j9 == 0 ? ZERO : new Duration(FieldUtils.safeMultiply(j9, 1000));
    }

    public Duration dividedBy(long j9) {
        return j9 == 1 ? this : new Duration(FieldUtils.safeDivide(getMillis(), j9));
    }

    public long getStandardDays() {
        return getMillis() / TimeChart.DAY;
    }

    public long getStandardHours() {
        return getMillis() / 3600000;
    }

    public long getStandardMinutes() {
        return getMillis() / 60000;
    }

    public long getStandardSeconds() {
        return getMillis() / 1000;
    }

    public Duration minus(long j9) {
        return withDurationAdded(j9, -1);
    }

    public Duration minus(ReadableDuration readableDuration) {
        return readableDuration == null ? this : withDurationAdded(readableDuration.getMillis(), -1);
    }

    public Duration multipliedBy(long j9) {
        return j9 == 1 ? this : new Duration(FieldUtils.safeMultiply(getMillis(), j9));
    }

    public Duration negated() {
        if (getMillis() != Long.MIN_VALUE) {
            return new Duration(-getMillis());
        }
        throw new ArithmeticException("Negation of this duration would overflow");
    }

    public Duration plus(long j9) {
        return withDurationAdded(j9, 1);
    }

    public Duration plus(ReadableDuration readableDuration) {
        return readableDuration == null ? this : withDurationAdded(readableDuration.getMillis(), 1);
    }

    @Override // org.joda.time.base.AbstractDuration, org.joda.time.ReadableDuration
    public Duration toDuration() {
        return this;
    }

    public Days toStandardDays() {
        return Days.days(FieldUtils.safeToInt(getStandardDays()));
    }

    public Hours toStandardHours() {
        return Hours.hours(FieldUtils.safeToInt(getStandardHours()));
    }

    public Minutes toStandardMinutes() {
        return Minutes.minutes(FieldUtils.safeToInt(getStandardMinutes()));
    }

    public Seconds toStandardSeconds() {
        return Seconds.seconds(FieldUtils.safeToInt(getStandardSeconds()));
    }

    public Duration withDurationAdded(long j9, int i9) {
        if (j9 == 0 || i9 == 0) {
            return this;
        }
        return new Duration(FieldUtils.safeAdd(getMillis(), FieldUtils.safeMultiply(j9, i9)));
    }

    public Duration withDurationAdded(ReadableDuration readableDuration, int i9) {
        return (readableDuration == null || i9 == 0) ? this : withDurationAdded(readableDuration.getMillis(), i9);
    }

    public Duration withMillis(long j9) {
        return j9 == getMillis() ? this : new Duration(j9);
    }
}
