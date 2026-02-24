package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadableDuration;

/* JADX INFO: loaded from: classes4.dex */
class ReadableDurationConverter extends AbstractConverter implements DurationConverter, PeriodConverter {
    static final ReadableDurationConverter INSTANCE = new ReadableDurationConverter();

    @Override // org.joda.time.convert.DurationConverter
    public long getDurationMillis(Object obj) {
        return ((ReadableDuration) obj).getMillis();
    }

    @Override // org.joda.time.convert.Converter
    public Class<?> getSupportedType() {
        return ReadableDuration.class;
    }

    @Override // org.joda.time.convert.PeriodConverter
    public void setInto(ReadWritablePeriod readWritablePeriod, Object obj, Chronology chronology) {
        int[] iArr = DateTimeUtils.getChronology(chronology).get(readWritablePeriod, ((ReadableDuration) obj).getMillis());
        for (int i9 = 0; i9 < iArr.length; i9++) {
            readWritablePeriod.setValue(i9, iArr[i9]);
        }
    }
}
