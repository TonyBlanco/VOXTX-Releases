package org.joda.time.convert;

import org.apache.http.message.TokenParser;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/* JADX INFO: loaded from: classes4.dex */
class StringConverter extends AbstractConverter implements InstantConverter, PartialConverter, DurationConverter, PeriodConverter, IntervalConverter {
    static final StringConverter INSTANCE = new StringConverter();

    @Override // org.joda.time.convert.DurationConverter
    public long getDurationMillis(Object obj) {
        long j9;
        long j10;
        long jSafeMultiply;
        String str = (String) obj;
        int length = str.length();
        if (length >= 4 && ((str.charAt(0) == 'P' || str.charAt(0) == 'p') && (str.charAt(1) == 'T' || str.charAt(1) == 't'))) {
            int i9 = length - 1;
            if (str.charAt(i9) == 'S' || str.charAt(i9) == 's') {
                String strSubstring = str.substring(2, i9);
                int i10 = 0;
                int i11 = -1;
                for (int i12 = 0; i12 < strSubstring.length(); i12++) {
                    if (strSubstring.charAt(i12) < '0' || strSubstring.charAt(i12) > '9') {
                        if (i12 == 0 && strSubstring.charAt(0) == '-') {
                            i10 = 1;
                        } else {
                            if (i12 <= i10 || strSubstring.charAt(i12) != '.' || i11 != -1) {
                                throw new IllegalArgumentException("Invalid format: \"" + str + TokenParser.DQUOTE);
                            }
                            i11 = i12;
                        }
                    }
                }
                if (i11 > 0) {
                    j10 = Long.parseLong(strSubstring.substring(i10, i11));
                    String strSubstring2 = strSubstring.substring(i11 + 1);
                    if (strSubstring2.length() != 3) {
                        strSubstring2 = (strSubstring2 + "000").substring(0, 3);
                    }
                    j9 = Integer.parseInt(strSubstring2);
                } else {
                    long j11 = i10 != 0 ? Long.parseLong(strSubstring.substring(i10, strSubstring.length())) : Long.parseLong(strSubstring);
                    j9 = 0;
                    j10 = j11;
                }
                if (i10 != 0) {
                    jSafeMultiply = FieldUtils.safeMultiply(-j10, 1000);
                    j9 = -j9;
                } else {
                    jSafeMultiply = FieldUtils.safeMultiply(j10, 1000);
                }
                return FieldUtils.safeAdd(jSafeMultiply, j9);
            }
        }
        throw new IllegalArgumentException("Invalid format: \"" + str + TokenParser.DQUOTE);
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter
    public long getInstantMillis(Object obj, Chronology chronology) {
        return ISODateTimeFormat.dateTimeParser().withChronology(chronology).parseMillis((String) obj);
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.PartialConverter
    public int[] getPartialValues(ReadablePartial readablePartial, Object obj, Chronology chronology, DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter.getZone() != null) {
            chronology = chronology.withZone(dateTimeFormatter.getZone());
        }
        return chronology.get(readablePartial, dateTimeFormatter.withChronology(chronology).parseMillis((String) obj));
    }

    @Override // org.joda.time.convert.Converter
    public Class<?> getSupportedType() {
        return String.class;
    }

    @Override // org.joda.time.convert.IntervalConverter
    public void setInto(ReadWritableInterval readWritableInterval, Object obj, Chronology chronology) {
        Period period;
        long jAdd;
        long jAdd2;
        String str = (String) obj;
        int iIndexOf = str.indexOf(47);
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("Format requires a '/' separator: " + str);
        }
        String strSubstring = str.substring(0, iIndexOf);
        if (strSubstring.length() <= 0) {
            throw new IllegalArgumentException("Format invalid: " + str);
        }
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() <= 0) {
            throw new IllegalArgumentException("Format invalid: " + str);
        }
        DateTimeFormatter dateTimeFormatterWithChronology = ISODateTimeFormat.dateTimeParser().withChronology(chronology);
        PeriodFormatter periodFormatterStandard = ISOPeriodFormat.standard();
        char cCharAt = strSubstring.charAt(0);
        Chronology chronology2 = null;
        if (cCharAt == 'P' || cCharAt == 'p') {
            period = periodFormatterStandard.withParseType(getPeriodType(strSubstring)).parsePeriod(strSubstring);
            jAdd = 0;
        } else {
            DateTime dateTime = dateTimeFormatterWithChronology.parseDateTime(strSubstring);
            jAdd = dateTime.getMillis();
            chronology2 = dateTime.getChronology();
            period = null;
        }
        char cCharAt2 = strSubstring2.charAt(0);
        if (cCharAt2 != 'P' && cCharAt2 != 'p') {
            DateTime dateTime2 = dateTimeFormatterWithChronology.parseDateTime(strSubstring2);
            jAdd2 = dateTime2.getMillis();
            if (chronology2 == null) {
                chronology2 = dateTime2.getChronology();
            }
            if (chronology != null) {
                chronology2 = chronology;
            }
            if (period != null) {
                jAdd = chronology2.add(period, jAdd2, -1);
            }
        } else {
            if (period != null) {
                throw new IllegalArgumentException("Interval composed of two durations: " + str);
            }
            Period period2 = periodFormatterStandard.withParseType(getPeriodType(strSubstring2)).parsePeriod(strSubstring2);
            if (chronology != null) {
                chronology2 = chronology;
            }
            jAdd2 = chronology2.add(period2, jAdd, 1);
        }
        readWritableInterval.setInterval(jAdd, jAdd2);
        readWritableInterval.setChronology(chronology2);
    }

    @Override // org.joda.time.convert.PeriodConverter
    public void setInto(ReadWritablePeriod readWritablePeriod, Object obj, Chronology chronology) {
        String str = (String) obj;
        PeriodFormatter periodFormatterStandard = ISOPeriodFormat.standard();
        readWritablePeriod.clear();
        int into = periodFormatterStandard.parseInto(readWritablePeriod, str, 0);
        if (into < str.length()) {
            if (into < 0) {
                periodFormatterStandard.withParseType(readWritablePeriod.getPeriodType()).parseMutablePeriod(str);
            }
            throw new IllegalArgumentException("Invalid format: \"" + str + TokenParser.DQUOTE);
        }
    }
}
