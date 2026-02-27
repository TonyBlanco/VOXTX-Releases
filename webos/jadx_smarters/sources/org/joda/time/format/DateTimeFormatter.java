package org.joda.time.format;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;

/* JADX INFO: loaded from: classes4.dex */
public class DateTimeFormatter {
    private final Chronology iChrono;
    private final int iDefaultYear;
    private final Locale iLocale;
    private final boolean iOffsetParsed;
    private final InternalParser iParser;
    private final Integer iPivotYear;
    private final InternalPrinter iPrinter;
    private final DateTimeZone iZone;

    public DateTimeFormatter(DateTimePrinter dateTimePrinter, DateTimeParser dateTimeParser) {
        this(DateTimePrinterInternalPrinter.of(dateTimePrinter), DateTimeParserInternalParser.of(dateTimeParser));
    }

    public DateTimeFormatter(InternalPrinter internalPrinter, InternalParser internalParser) {
        this.iPrinter = internalPrinter;
        this.iParser = internalParser;
        this.iLocale = null;
        this.iOffsetParsed = false;
        this.iChrono = null;
        this.iZone = null;
        this.iPivotYear = null;
        this.iDefaultYear = AdError.SERVER_ERROR_CODE;
    }

    private DateTimeFormatter(InternalPrinter internalPrinter, InternalParser internalParser, Locale locale, boolean z9, Chronology chronology, DateTimeZone dateTimeZone, Integer num, int i9) {
        this.iPrinter = internalPrinter;
        this.iParser = internalParser;
        this.iLocale = locale;
        this.iOffsetParsed = z9;
        this.iChrono = chronology;
        this.iZone = dateTimeZone;
        this.iPivotYear = num;
        this.iDefaultYear = i9;
    }

    private void printTo(Appendable appendable, long j9, Chronology chronology) throws IOException {
        InternalPrinter internalPrinterRequirePrinter = requirePrinter();
        Chronology chronologySelectChronology = selectChronology(chronology);
        DateTimeZone zone = chronologySelectChronology.getZone();
        int offset = zone.getOffset(j9);
        long j10 = offset;
        long j11 = j9 + j10;
        if ((j9 ^ j11) < 0 && (j10 ^ j9) >= 0) {
            zone = DateTimeZone.UTC;
            offset = 0;
            j11 = j9;
        }
        internalPrinterRequirePrinter.printTo(appendable, j11, chronologySelectChronology.withUTC(), offset, zone, this.iLocale);
    }

    private InternalParser requireParser() {
        InternalParser internalParser = this.iParser;
        if (internalParser != null) {
            return internalParser;
        }
        throw new UnsupportedOperationException("Parsing not supported");
    }

    private InternalPrinter requirePrinter() {
        InternalPrinter internalPrinter = this.iPrinter;
        if (internalPrinter != null) {
            return internalPrinter;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    private Chronology selectChronology(Chronology chronology) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        Chronology chronology3 = this.iChrono;
        if (chronology3 != null) {
            chronology2 = chronology3;
        }
        DateTimeZone dateTimeZone = this.iZone;
        return dateTimeZone != null ? chronology2.withZone(dateTimeZone) : chronology2;
    }

    @Deprecated
    public Chronology getChronolgy() {
        return this.iChrono;
    }

    public Chronology getChronology() {
        return this.iChrono;
    }

    public int getDefaultYear() {
        return this.iDefaultYear;
    }

    public Locale getLocale() {
        return this.iLocale;
    }

    public DateTimeParser getParser() {
        return InternalParserDateTimeParser.of(this.iParser);
    }

    public InternalParser getParser0() {
        return this.iParser;
    }

    public Integer getPivotYear() {
        return this.iPivotYear;
    }

    public DateTimePrinter getPrinter() {
        return InternalPrinterDateTimePrinter.of(this.iPrinter);
    }

    public InternalPrinter getPrinter0() {
        return this.iPrinter;
    }

    public DateTimeZone getZone() {
        return this.iZone;
    }

    public boolean isOffsetParsed() {
        return this.iOffsetParsed;
    }

    public boolean isParser() {
        return this.iParser != null;
    }

    public boolean isPrinter() {
        return this.iPrinter != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.joda.time.DateTime parseDateTime(java.lang.String r11) {
        /*
            r10 = this;
            org.joda.time.format.InternalParser r0 = r10.requireParser()
            r1 = 0
            org.joda.time.Chronology r1 = r10.selectChronology(r1)
            org.joda.time.format.DateTimeParserBucket r9 = new org.joda.time.format.DateTimeParserBucket
            java.util.Locale r6 = r10.iLocale
            java.lang.Integer r7 = r10.iPivotYear
            int r8 = r10.iDefaultYear
            r3 = 0
            r2 = r9
            r5 = r1
            r2.<init>(r3, r5, r6, r7, r8)
            r2 = 0
            int r0 = r0.parseInto(r9, r11, r2)
            if (r0 < 0) goto L5e
            int r2 = r11.length()
            if (r0 < r2) goto L5f
            r0 = 1
            long r2 = r9.computeMillis(r0, r11)
            boolean r11 = r10.iOffsetParsed
            if (r11 == 0) goto L45
            java.lang.Integer r11 = r9.getOffsetInteger()
            if (r11 == 0) goto L45
            java.lang.Integer r11 = r9.getOffsetInteger()
            int r11 = r11.intValue()
            org.joda.time.DateTimeZone r11 = org.joda.time.DateTimeZone.forOffsetMillis(r11)
        L40:
            org.joda.time.Chronology r1 = r1.withZone(r11)
            goto L50
        L45:
            org.joda.time.DateTimeZone r11 = r9.getZone()
            if (r11 == 0) goto L50
            org.joda.time.DateTimeZone r11 = r9.getZone()
            goto L40
        L50:
            org.joda.time.DateTime r11 = new org.joda.time.DateTime
            r11.<init>(r2, r1)
            org.joda.time.DateTimeZone r0 = r10.iZone
            if (r0 == 0) goto L5d
            org.joda.time.DateTime r11 = r11.withZone(r0)
        L5d:
            return r11
        L5e:
            int r0 = ~r0
        L5f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r11 = org.joda.time.format.FormatUtils.createErrorMessage(r11, r0)
            r1.<init>(r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatter.parseDateTime(java.lang.String):org.joda.time.DateTime");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int parseInto(org.joda.time.ReadWritableInstant r13, java.lang.String r14, int r15) {
        /*
            r12 = this;
            org.joda.time.format.InternalParser r0 = r12.requireParser()
            if (r13 == 0) goto L71
            long r1 = r13.getMillis()
            org.joda.time.Chronology r3 = r13.getChronology()
            org.joda.time.Chronology r4 = org.joda.time.DateTimeUtils.getChronology(r3)
            org.joda.time.DateTimeField r4 = r4.year()
            int r11 = r4.get(r1)
            org.joda.time.DateTimeZone r4 = r3.getZone()
            int r4 = r4.getOffset(r1)
            long r4 = (long) r4
            long r6 = r1 + r4
            org.joda.time.Chronology r1 = r12.selectChronology(r3)
            org.joda.time.format.DateTimeParserBucket r2 = new org.joda.time.format.DateTimeParserBucket
            java.util.Locale r9 = r12.iLocale
            java.lang.Integer r10 = r12.iPivotYear
            r5 = r2
            r8 = r1
            r5.<init>(r6, r8, r9, r10, r11)
            int r15 = r0.parseInto(r2, r14, r15)
            r0 = 0
            long r3 = r2.computeMillis(r0, r14)
            r13.setMillis(r3)
            boolean r14 = r12.iOffsetParsed
            if (r14 == 0) goto L5b
            java.lang.Integer r14 = r2.getOffsetInteger()
            if (r14 == 0) goto L5b
            java.lang.Integer r14 = r2.getOffsetInteger()
            int r14 = r14.intValue()
            org.joda.time.DateTimeZone r14 = org.joda.time.DateTimeZone.forOffsetMillis(r14)
        L56:
            org.joda.time.Chronology r1 = r1.withZone(r14)
            goto L66
        L5b:
            org.joda.time.DateTimeZone r14 = r2.getZone()
            if (r14 == 0) goto L66
            org.joda.time.DateTimeZone r14 = r2.getZone()
            goto L56
        L66:
            r13.setChronology(r1)
            org.joda.time.DateTimeZone r14 = r12.iZone
            if (r14 == 0) goto L70
            r13.setZone(r14)
        L70:
            return r15
        L71:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Instant must not be null"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatter.parseInto(org.joda.time.ReadWritableInstant, java.lang.String, int):int");
    }

    public LocalDate parseLocalDate(String str) {
        return parseLocalDateTime(str).toLocalDate();
    }

    public LocalDateTime parseLocalDateTime(String str) {
        DateTimeZone zone;
        InternalParser internalParserRequireParser = requireParser();
        Chronology chronologyWithUTC = selectChronology(null).withUTC();
        DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(0L, chronologyWithUTC, this.iLocale, this.iPivotYear, this.iDefaultYear);
        int into = internalParserRequireParser.parseInto(dateTimeParserBucket, str, 0);
        if (into < 0) {
            into = ~into;
        } else if (into >= str.length()) {
            long jComputeMillis = dateTimeParserBucket.computeMillis(true, str);
            if (dateTimeParserBucket.getOffsetInteger() == null) {
                if (dateTimeParserBucket.getZone() != null) {
                    zone = dateTimeParserBucket.getZone();
                }
                return new LocalDateTime(jComputeMillis, chronologyWithUTC);
            }
            zone = DateTimeZone.forOffsetMillis(dateTimeParserBucket.getOffsetInteger().intValue());
            chronologyWithUTC = chronologyWithUTC.withZone(zone);
            return new LocalDateTime(jComputeMillis, chronologyWithUTC);
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(str, into));
    }

    public LocalTime parseLocalTime(String str) {
        return parseLocalDateTime(str).toLocalTime();
    }

    public long parseMillis(String str) {
        return new DateTimeParserBucket(0L, selectChronology(this.iChrono), this.iLocale, this.iPivotYear, this.iDefaultYear).doParseMillis(requireParser(), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.joda.time.MutableDateTime parseMutableDateTime(java.lang.String r11) {
        /*
            r10 = this;
            org.joda.time.format.InternalParser r0 = r10.requireParser()
            r1 = 0
            org.joda.time.Chronology r1 = r10.selectChronology(r1)
            org.joda.time.format.DateTimeParserBucket r9 = new org.joda.time.format.DateTimeParserBucket
            java.util.Locale r6 = r10.iLocale
            java.lang.Integer r7 = r10.iPivotYear
            int r8 = r10.iDefaultYear
            r3 = 0
            r2 = r9
            r5 = r1
            r2.<init>(r3, r5, r6, r7, r8)
            r2 = 0
            int r0 = r0.parseInto(r9, r11, r2)
            if (r0 < 0) goto L5d
            int r2 = r11.length()
            if (r0 < r2) goto L5e
            r0 = 1
            long r2 = r9.computeMillis(r0, r11)
            boolean r11 = r10.iOffsetParsed
            if (r11 == 0) goto L45
            java.lang.Integer r11 = r9.getOffsetInteger()
            if (r11 == 0) goto L45
            java.lang.Integer r11 = r9.getOffsetInteger()
            int r11 = r11.intValue()
            org.joda.time.DateTimeZone r11 = org.joda.time.DateTimeZone.forOffsetMillis(r11)
        L40:
            org.joda.time.Chronology r1 = r1.withZone(r11)
            goto L50
        L45:
            org.joda.time.DateTimeZone r11 = r9.getZone()
            if (r11 == 0) goto L50
            org.joda.time.DateTimeZone r11 = r9.getZone()
            goto L40
        L50:
            org.joda.time.MutableDateTime r11 = new org.joda.time.MutableDateTime
            r11.<init>(r2, r1)
            org.joda.time.DateTimeZone r0 = r10.iZone
            if (r0 == 0) goto L5c
            r11.setZone(r0)
        L5c:
            return r11
        L5d:
            int r0 = ~r0
        L5e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r11 = org.joda.time.format.FormatUtils.createErrorMessage(r11, r0)
            r1.<init>(r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatter.parseMutableDateTime(java.lang.String):org.joda.time.MutableDateTime");
    }

    public String print(long j9) {
        StringBuilder sb = new StringBuilder(requirePrinter().estimatePrintedLength());
        try {
            printTo(sb, j9);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public String print(ReadableInstant readableInstant) {
        StringBuilder sb = new StringBuilder(requirePrinter().estimatePrintedLength());
        try {
            printTo(sb, readableInstant);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public String print(ReadablePartial readablePartial) {
        StringBuilder sb = new StringBuilder(requirePrinter().estimatePrintedLength());
        try {
            printTo(sb, readablePartial);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public void printTo(Writer writer, long j9) throws IOException {
        printTo((Appendable) writer, j9);
    }

    public void printTo(Writer writer, ReadableInstant readableInstant) throws IOException {
        printTo((Appendable) writer, readableInstant);
    }

    public void printTo(Writer writer, ReadablePartial readablePartial) throws IOException {
        printTo((Appendable) writer, readablePartial);
    }

    public void printTo(Appendable appendable, long j9) throws IOException {
        printTo(appendable, j9, null);
    }

    public void printTo(Appendable appendable, ReadableInstant readableInstant) throws IOException {
        printTo(appendable, DateTimeUtils.getInstantMillis(readableInstant), DateTimeUtils.getInstantChronology(readableInstant));
    }

    public void printTo(Appendable appendable, ReadablePartial readablePartial) throws IOException {
        InternalPrinter internalPrinterRequirePrinter = requirePrinter();
        if (readablePartial == null) {
            throw new IllegalArgumentException("The partial must not be null");
        }
        internalPrinterRequirePrinter.printTo(appendable, readablePartial, this.iLocale);
    }

    public void printTo(StringBuffer stringBuffer, long j9) {
        try {
            printTo((Appendable) stringBuffer, j9);
        } catch (IOException unused) {
        }
    }

    public void printTo(StringBuffer stringBuffer, ReadableInstant readableInstant) {
        try {
            printTo((Appendable) stringBuffer, readableInstant);
        } catch (IOException unused) {
        }
    }

    public void printTo(StringBuffer stringBuffer, ReadablePartial readablePartial) {
        try {
            printTo((Appendable) stringBuffer, readablePartial);
        } catch (IOException unused) {
        }
    }

    public DateTimeFormatter withChronology(Chronology chronology) {
        return this.iChrono == chronology ? this : new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, this.iOffsetParsed, chronology, this.iZone, this.iPivotYear, this.iDefaultYear);
    }

    public DateTimeFormatter withDefaultYear(int i9) {
        return new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, this.iOffsetParsed, this.iChrono, this.iZone, this.iPivotYear, i9);
    }

    public DateTimeFormatter withLocale(Locale locale) {
        return (locale == getLocale() || (locale != null && locale.equals(getLocale()))) ? this : new DateTimeFormatter(this.iPrinter, this.iParser, locale, this.iOffsetParsed, this.iChrono, this.iZone, this.iPivotYear, this.iDefaultYear);
    }

    public DateTimeFormatter withOffsetParsed() {
        return this.iOffsetParsed ? this : new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, true, this.iChrono, null, this.iPivotYear, this.iDefaultYear);
    }

    public DateTimeFormatter withPivotYear(int i9) {
        return withPivotYear(Integer.valueOf(i9));
    }

    public DateTimeFormatter withPivotYear(Integer num) {
        Integer num2 = this.iPivotYear;
        return (num2 == num || (num2 != null && num2.equals(num))) ? this : new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, this.iOffsetParsed, this.iChrono, this.iZone, num, this.iDefaultYear);
    }

    public DateTimeFormatter withZone(DateTimeZone dateTimeZone) {
        return this.iZone == dateTimeZone ? this : new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, false, this.iChrono, dateTimeZone, this.iPivotYear, this.iDefaultYear);
    }

    public DateTimeFormatter withZoneUTC() {
        return withZone(DateTimeZone.UTC);
    }
}
