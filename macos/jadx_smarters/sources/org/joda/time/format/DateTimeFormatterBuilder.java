package org.joda.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.ws.WebSocketProtocol;
import okio.Utf8;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;
import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDateTimeField;

/* JADX INFO: loaded from: classes4.dex */
public class DateTimeFormatterBuilder {
    private ArrayList<Object> iElementPairs = new ArrayList<>();
    private Object iFormatter;

    public static class CharacterLiteral implements InternalPrinter, InternalParser {
        private final char iValue;

        public CharacterLiteral(char c9) {
            this.iValue = c9;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return 1;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return 1;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i9) {
            char upperCase;
            char upperCase2;
            if (i9 >= charSequence.length()) {
                return ~i9;
            }
            char cCharAt = charSequence.charAt(i9);
            char c9 = this.iValue;
            return (cCharAt == c9 || (upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(c9)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) ? i9 + 1 : ~i9;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j9, Chronology chronology, int i9, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }
    }

    public static class Composite implements InternalPrinter, InternalParser {
        private final int iParsedLengthEstimate;
        private final InternalParser[] iParsers;
        private final int iPrintedLengthEstimate;
        private final InternalPrinter[] iPrinters;

        public Composite(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            decompose(list, arrayList, arrayList2);
            if (arrayList.contains(null) || arrayList.isEmpty()) {
                this.iPrinters = null;
                this.iPrintedLengthEstimate = 0;
            } else {
                int size = arrayList.size();
                this.iPrinters = new InternalPrinter[size];
                int iEstimatePrintedLength = 0;
                for (int i9 = 0; i9 < size; i9++) {
                    InternalPrinter internalPrinter = (InternalPrinter) arrayList.get(i9);
                    iEstimatePrintedLength += internalPrinter.estimatePrintedLength();
                    this.iPrinters[i9] = internalPrinter;
                }
                this.iPrintedLengthEstimate = iEstimatePrintedLength;
            }
            if (arrayList2.contains(null) || arrayList2.isEmpty()) {
                this.iParsers = null;
                this.iParsedLengthEstimate = 0;
                return;
            }
            int size2 = arrayList2.size();
            this.iParsers = new InternalParser[size2];
            int iEstimateParsedLength = 0;
            for (int i10 = 0; i10 < size2; i10++) {
                InternalParser internalParser = (InternalParser) arrayList2.get(i10);
                iEstimateParsedLength += internalParser.estimateParsedLength();
                this.iParsers[i10] = internalParser;
            }
            this.iParsedLengthEstimate = iEstimateParsedLength;
        }

        private void addArrayToList(List<Object> list, Object[] objArr) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    list.add(obj);
                }
            }
        }

        private void decompose(List<Object> list, List<Object> list2, List<Object> list3) {
            int size = list.size();
            for (int i9 = 0; i9 < size; i9 += 2) {
                Object obj = list.get(i9);
                if (obj instanceof Composite) {
                    addArrayToList(list2, ((Composite) obj).iPrinters);
                } else {
                    list2.add(obj);
                }
                Object obj2 = list.get(i9 + 1);
                if (obj2 instanceof Composite) {
                    addArrayToList(list3, ((Composite) obj2).iParsers);
                } else {
                    list3.add(obj2);
                }
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iParsedLengthEstimate;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iPrintedLengthEstimate;
        }

        public boolean isParser() {
            return this.iParsers != null;
        }

        public boolean isPrinter() {
            return this.iPrinters != null;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i9) {
            InternalParser[] internalParserArr = this.iParsers;
            if (internalParserArr == null) {
                throw new UnsupportedOperationException();
            }
            int length = internalParserArr.length;
            for (int i10 = 0; i10 < length && i9 >= 0; i10++) {
                i9 = internalParserArr[i10].parseInto(dateTimeParserBucket, charSequence, i9);
            }
            return i9;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j9, Chronology chronology, int i9, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            InternalPrinter[] internalPrinterArr = this.iPrinters;
            if (internalPrinterArr == null) {
                throw new UnsupportedOperationException();
            }
            Locale locale2 = locale == null ? Locale.getDefault() : locale;
            for (InternalPrinter internalPrinter : internalPrinterArr) {
                internalPrinter.printTo(appendable, j9, chronology, i9, dateTimeZone, locale2);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            InternalPrinter[] internalPrinterArr = this.iPrinters;
            if (internalPrinterArr == null) {
                throw new UnsupportedOperationException();
            }
            if (locale == null) {
                locale = Locale.getDefault();
            }
            for (InternalPrinter internalPrinter : internalPrinterArr) {
                internalPrinter.printTo(appendable, readablePartial, locale);
            }
        }
    }

    public static class FixedNumber extends PaddedNumber {
        public FixedNumber(DateTimeFieldType dateTimeFieldType, int i9, boolean z9) {
            super(dateTimeFieldType, i9, z9, i9);
        }

        @Override // org.joda.time.format.DateTimeFormatterBuilder.NumberFormatter, org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i9) {
            int i10;
            char cCharAt;
            int into = super.parseInto(dateTimeParserBucket, charSequence, i9);
            if (into < 0 || into == (i10 = this.iMaxParsedDigits + i9)) {
                return into;
            }
            if (this.iSigned && ((cCharAt = charSequence.charAt(i9)) == '-' || cCharAt == '+')) {
                i10++;
            }
            return into > i10 ? ~(i10 + 1) : into < i10 ? ~into : into;
        }
    }

    public static class Fraction implements InternalPrinter, InternalParser {
        private final DateTimeFieldType iFieldType;
        protected int iMaxDigits;
        protected int iMinDigits;

        public Fraction(DateTimeFieldType dateTimeFieldType, int i9, int i10) {
            this.iFieldType = dateTimeFieldType;
            i10 = i10 > 18 ? 18 : i10;
            this.iMinDigits = i9;
            this.iMaxDigits = i10;
        }

        private long[] getFractionData(long j9, DateTimeField dateTimeField) {
            long j10;
            long unitMillis = dateTimeField.getDurationField().getUnitMillis();
            int i9 = this.iMaxDigits;
            while (true) {
                switch (i9) {
                    case 1:
                        j10 = 10;
                        break;
                    case 2:
                        j10 = 100;
                        break;
                    case 3:
                        j10 = 1000;
                        break;
                    case 4:
                        j10 = 10000;
                        break;
                    case 5:
                        j10 = 100000;
                        break;
                    case 6:
                        j10 = 1000000;
                        break;
                    case 7:
                        j10 = 10000000;
                        break;
                    case 8:
                        j10 = 100000000;
                        break;
                    case 9:
                        j10 = 1000000000;
                        break;
                    case 10:
                        j10 = RealConnection.IDLE_CONNECTION_HEALTHY_NS;
                        break;
                    case 11:
                        j10 = 100000000000L;
                        break;
                    case 12:
                        j10 = 1000000000000L;
                        break;
                    case 13:
                        j10 = 10000000000000L;
                        break;
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        j10 = 100000000000000L;
                        break;
                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                        j10 = 1000000000000000L;
                        break;
                    case 16:
                        j10 = 10000000000000000L;
                        break;
                    case LangUtils.HASH_SEED /* 17 */:
                        j10 = 100000000000000000L;
                        break;
                    case 18:
                        j10 = 1000000000000000000L;
                        break;
                    default:
                        j10 = 1;
                        break;
                }
                if ((unitMillis * j10) / j10 == unitMillis) {
                    return new long[]{(j9 * j10) / unitMillis, i9};
                }
                i9--;
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iMaxDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxDigits;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i9) {
            DateTimeField field = this.iFieldType.getField(dateTimeParserBucket.getChronology());
            int iMin = Math.min(this.iMaxDigits, charSequence.length() - i9);
            long unitMillis = field.getDurationField().getUnitMillis() * 10;
            long j9 = 0;
            int i10 = 0;
            while (i10 < iMin) {
                char cCharAt = charSequence.charAt(i9 + i10);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i10++;
                unitMillis /= 10;
                j9 += ((long) (cCharAt - '0')) * unitMillis;
            }
            long j10 = j9 / 10;
            if (i10 != 0 && j10 <= 2147483647L) {
                dateTimeParserBucket.saveField(new PreciseDateTimeField(DateTimeFieldType.millisOfSecond(), MillisDurationField.INSTANCE, field.getDurationField()), (int) j10);
                return i9 + i10;
            }
            return ~i9;
        }

        public void printTo(Appendable appendable, long j9, Chronology chronology) throws IOException {
            DateTimeField field = this.iFieldType.getField(chronology);
            int i9 = this.iMinDigits;
            try {
                long jRemainder = field.remainder(j9);
                if (jRemainder != 0) {
                    long[] fractionData = getFractionData(jRemainder, field);
                    long j10 = fractionData[0];
                    int i10 = (int) fractionData[1];
                    String string = (2147483647L & j10) == j10 ? Integer.toString((int) j10) : Long.toString(j10);
                    int length = string.length();
                    while (length < i10) {
                        appendable.append('0');
                        i9--;
                        i10--;
                    }
                    if (i9 < i10) {
                        while (i9 < i10 && length > 1 && string.charAt(length - 1) == '0') {
                            i10--;
                            length--;
                        }
                        if (length < string.length()) {
                            for (int i11 = 0; i11 < length; i11++) {
                                appendable.append(string.charAt(i11));
                            }
                            return;
                        }
                    }
                    appendable.append(string);
                    return;
                }
                while (true) {
                    i9--;
                    if (i9 < 0) {
                        return;
                    } else {
                        appendable.append('0');
                    }
                }
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, i9);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j9, Chronology chronology, int i9, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            printTo(appendable, j9, chronology);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            printTo(appendable, readablePartial.getChronology().set(readablePartial, 0L), readablePartial.getChronology());
        }
    }

    public static class MatchingParser implements InternalParser {
        private final int iParsedLengthEstimate;
        private final InternalParser[] iParsers;

        public MatchingParser(InternalParser[] internalParserArr) {
            int iEstimateParsedLength;
            this.iParsers = internalParserArr;
            int length = internalParserArr.length;
            int i9 = 0;
            while (true) {
                length--;
                if (length < 0) {
                    this.iParsedLengthEstimate = i9;
                    return;
                }
                InternalParser internalParser = internalParserArr[length];
                if (internalParser != null && (iEstimateParsedLength = internalParser.estimateParsedLength()) > i9) {
                    i9 = iEstimateParsedLength;
                }
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iParsedLengthEstimate;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
        
            if (r6 > r12) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
        
            if (r6 != r12) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
        
            if (r3 == false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
        
            return ~r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x004a, code lost:
        
            if (r4 == null) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
        
            r10.restoreState(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x004f, code lost:
        
            return r6;
         */
        @Override // org.joda.time.format.InternalParser
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int parseInto(org.joda.time.format.DateTimeParserBucket r10, java.lang.CharSequence r11, int r12) {
            /*
                r9 = this;
                org.joda.time.format.InternalParser[] r0 = r9.iParsers
                int r1 = r0.length
                java.lang.Object r2 = r10.saveState()
                r3 = 0
                r4 = 0
                r6 = r12
                r7 = r6
                r5 = 0
            Lc:
                if (r5 >= r1) goto L41
                r8 = r0[r5]
                if (r8 != 0) goto L17
                if (r6 > r12) goto L15
                return r12
            L15:
                r3 = 1
                goto L41
            L17:
                int r8 = r8.parseInto(r10, r11, r12)
                if (r8 < r12) goto L35
                if (r8 <= r6) goto L3b
                int r4 = r11.length()
                if (r8 >= r4) goto L34
                int r4 = r5 + 1
                if (r4 >= r1) goto L34
                r4 = r0[r4]
                if (r4 != 0) goto L2e
                goto L34
            L2e:
                java.lang.Object r4 = r10.saveState()
                r6 = r8
                goto L3b
            L34:
                return r8
            L35:
                if (r8 >= 0) goto L3b
                int r8 = ~r8
                if (r8 <= r7) goto L3b
                r7 = r8
            L3b:
                r10.restoreState(r2)
                int r5 = r5 + 1
                goto Lc
            L41:
                if (r6 > r12) goto L4a
                if (r6 != r12) goto L48
                if (r3 == 0) goto L48
                goto L4a
            L48:
                int r10 = ~r7
                return r10
            L4a:
                if (r4 == 0) goto L4f
                r10.restoreState(r4)
            L4f:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.MatchingParser.parseInto(org.joda.time.format.DateTimeParserBucket, java.lang.CharSequence, int):int");
        }
    }

    public static abstract class NumberFormatter implements InternalPrinter, InternalParser {
        protected final DateTimeFieldType iFieldType;
        protected final int iMaxParsedDigits;
        protected final boolean iSigned;

        public NumberFormatter(DateTimeFieldType dateTimeFieldType, int i9, boolean z9) {
            this.iFieldType = dateTimeFieldType;
            this.iMaxParsedDigits = i9;
            this.iSigned = z9;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iMaxParsedDigits;
        }

        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i9) {
            int i10;
            int i11;
            char cCharAt;
            int iMin = Math.min(this.iMaxParsedDigits, charSequence.length() - i9);
            int i12 = 0;
            boolean z9 = false;
            while (i12 < iMin) {
                int i13 = i9 + i12;
                char cCharAt2 = charSequence.charAt(i13);
                if (i12 == 0 && ((cCharAt2 == '-' || cCharAt2 == '+') && this.iSigned)) {
                    z9 = cCharAt2 == '-';
                    int i14 = i12 + 1;
                    if (i14 >= iMin || (cCharAt = charSequence.charAt(i13 + 1)) < '0' || cCharAt > '9') {
                        break;
                    }
                    if (z9) {
                        i12 = i14;
                    } else {
                        i9++;
                    }
                    iMin = Math.min(iMin + 1, charSequence.length() - i9);
                } else {
                    if (cCharAt2 < '0' || cCharAt2 > '9') {
                        break;
                    }
                    i12++;
                }
            }
            if (i12 == 0) {
                return ~i9;
            }
            if (i12 >= 9) {
                i10 = i12 + i9;
                i11 = Integer.parseInt(charSequence.subSequence(i9, i10).toString());
            } else {
                int i15 = z9 ? i9 + 1 : i9;
                int i16 = i15 + 1;
                try {
                    int iCharAt = charSequence.charAt(i15) - '0';
                    i10 = i12 + i9;
                    while (i16 < i10) {
                        int iCharAt2 = (((iCharAt << 3) + (iCharAt << 1)) + charSequence.charAt(i16)) - 48;
                        i16++;
                        iCharAt = iCharAt2;
                    }
                    i11 = z9 ? -iCharAt : iCharAt;
                } catch (StringIndexOutOfBoundsException unused) {
                    return ~i9;
                }
            }
            dateTimeParserBucket.saveField(this.iFieldType, i11);
            return i10;
        }
    }

    public static class PaddedNumber extends NumberFormatter {
        protected final int iMinPrintedDigits;

        public PaddedNumber(DateTimeFieldType dateTimeFieldType, int i9, boolean z9, int i10) {
            super(dateTimeFieldType, i9, z9);
            this.iMinPrintedDigits = i10;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxParsedDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j9, Chronology chronology, int i9, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                FormatUtils.appendPaddedInteger(appendable, this.iFieldType.getField(chronology).get(j9), this.iMinPrintedDigits);
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            if (readablePartial.isSupported(this.iFieldType)) {
                try {
                    FormatUtils.appendPaddedInteger(appendable, readablePartial.get(this.iFieldType), this.iMinPrintedDigits);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
        }
    }

    public static class StringLiteral implements InternalPrinter, InternalParser {
        private final String iValue;

        public StringLiteral(String str) {
            this.iValue = str;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iValue.length();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iValue.length();
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i9) {
            return DateTimeFormatterBuilder.csStartsWithIgnoreCase(charSequence, i9, this.iValue) ? i9 + this.iValue.length() : ~i9;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j9, Chronology chronology, int i9, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }
    }

    public static class TextField implements InternalPrinter, InternalParser {
        private static Map<Locale, Map<DateTimeFieldType, Object[]>> cParseCache = new ConcurrentHashMap();
        private final DateTimeFieldType iFieldType;
        private final boolean iShort;

        public TextField(DateTimeFieldType dateTimeFieldType, boolean z9) {
            this.iFieldType = dateTimeFieldType;
            this.iShort = z9;
        }

        private String print(long j9, Chronology chronology, Locale locale) {
            DateTimeField field = this.iFieldType.getField(chronology);
            return this.iShort ? field.getAsShortText(j9, locale) : field.getAsText(j9, locale);
        }

        private String print(ReadablePartial readablePartial, Locale locale) {
            if (!readablePartial.isSupported(this.iFieldType)) {
                return "�";
            }
            DateTimeField field = this.iFieldType.getField(readablePartial.getChronology());
            return this.iShort ? field.getAsShortText(readablePartial, locale) : field.getAsText(readablePartial, locale);
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iShort ? 6 : 20;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i9) {
            int iIntValue;
            Map concurrentHashMap;
            Locale locale = dateTimeParserBucket.getLocale();
            Map<DateTimeFieldType, Object[]> concurrentHashMap2 = cParseCache.get(locale);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap<>();
                cParseCache.put(locale, concurrentHashMap2);
            }
            Object[] objArr = concurrentHashMap2.get(this.iFieldType);
            if (objArr == null) {
                concurrentHashMap = new ConcurrentHashMap(32);
                MutableDateTime.Property property = new MutableDateTime(0L, DateTimeZone.UTC).property(this.iFieldType);
                int minimumValueOverall = property.getMinimumValueOverall();
                int maximumValueOverall = property.getMaximumValueOverall();
                if (maximumValueOverall - minimumValueOverall > 32) {
                    return ~i9;
                }
                iIntValue = property.getMaximumTextLength(locale);
                while (minimumValueOverall <= maximumValueOverall) {
                    property.set(minimumValueOverall);
                    String asShortText = property.getAsShortText(locale);
                    Boolean bool = Boolean.TRUE;
                    concurrentHashMap.put(asShortText, bool);
                    concurrentHashMap.put(property.getAsShortText(locale).toLowerCase(locale), bool);
                    concurrentHashMap.put(property.getAsShortText(locale).toUpperCase(locale), bool);
                    concurrentHashMap.put(property.getAsText(locale), bool);
                    concurrentHashMap.put(property.getAsText(locale).toLowerCase(locale), bool);
                    concurrentHashMap.put(property.getAsText(locale).toUpperCase(locale), bool);
                    minimumValueOverall++;
                }
                if ("en".equals(locale.getLanguage()) && this.iFieldType == DateTimeFieldType.era()) {
                    Boolean bool2 = Boolean.TRUE;
                    concurrentHashMap.put("BCE", bool2);
                    concurrentHashMap.put("bce", bool2);
                    concurrentHashMap.put("CE", bool2);
                    concurrentHashMap.put("ce", bool2);
                    iIntValue = 3;
                }
                concurrentHashMap2.put(this.iFieldType, new Object[]{concurrentHashMap, Integer.valueOf(iIntValue)});
            } else {
                Map map = (Map) objArr[0];
                iIntValue = ((Integer) objArr[1]).intValue();
                concurrentHashMap = map;
            }
            for (int iMin = Math.min(charSequence.length(), iIntValue + i9); iMin > i9; iMin--) {
                String string = charSequence.subSequence(i9, iMin).toString();
                if (concurrentHashMap.containsKey(string)) {
                    dateTimeParserBucket.saveField(this.iFieldType, string, locale);
                    return iMin;
                }
            }
            return ~i9;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j9, Chronology chronology, int i9, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                appendable.append(print(j9, chronology, locale));
            } catch (RuntimeException unused) {
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            try {
                appendable.append(print(readablePartial, locale));
            } catch (RuntimeException unused) {
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
            }
        }
    }

    public enum TimeZoneId implements InternalPrinter, InternalParser {
        INSTANCE;

        static final Set<String> ALL_IDS;
        static final int MAX_LENGTH;

        static {
            int iMax = 0;
            Set<String> availableIDs = DateTimeZone.getAvailableIDs();
            ALL_IDS = availableIDs;
            Iterator<String> it = availableIDs.iterator();
            while (it.hasNext()) {
                iMax = Math.max(iMax, it.next().length());
            }
            MAX_LENGTH = iMax;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return MAX_LENGTH;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return MAX_LENGTH;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i9) {
            String str = null;
            for (String str2 : ALL_IDS) {
                if (DateTimeFormatterBuilder.csStartsWith(charSequence, i9, str2) && (str == null || str2.length() > str.length())) {
                    str = str2;
                }
            }
            if (str == null) {
                return ~i9;
            }
            dateTimeParserBucket.setZone(DateTimeZone.forID(str));
            return i9 + str.length();
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j9, Chronology chronology, int i9, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(dateTimeZone != null ? dateTimeZone.getID() : "");
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }
    }

    public static class TimeZoneName implements InternalPrinter, InternalParser {
        static final int LONG_NAME = 0;
        static final int SHORT_NAME = 1;
        private final Map<String, DateTimeZone> iParseLookup;
        private final int iType;

        public TimeZoneName(int i9, Map<String, DateTimeZone> map) {
            this.iType = i9;
            this.iParseLookup = map;
        }

        private String print(long j9, DateTimeZone dateTimeZone, Locale locale) {
            if (dateTimeZone == null) {
                return "";
            }
            int i9 = this.iType;
            return i9 != 0 ? i9 != 1 ? "" : dateTimeZone.getShortName(j9, locale) : dateTimeZone.getName(j9, locale);
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iType == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iType == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i9) {
            Map<String, DateTimeZone> defaultTimeZoneNames = this.iParseLookup;
            if (defaultTimeZoneNames == null) {
                defaultTimeZoneNames = DateTimeUtils.getDefaultTimeZoneNames();
            }
            String str = null;
            for (String str2 : defaultTimeZoneNames.keySet()) {
                if (DateTimeFormatterBuilder.csStartsWith(charSequence, i9, str2) && (str == null || str2.length() > str.length())) {
                    str = str2;
                }
            }
            if (str == null) {
                return ~i9;
            }
            dateTimeParserBucket.setZone(defaultTimeZoneNames.get(str));
            return i9 + str.length();
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j9, Chronology chronology, int i9, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(print(j9 - ((long) i9), dateTimeZone, locale));
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }
    }

    public static class TimeZoneOffset implements InternalPrinter, InternalParser {
        private final int iMaxFields;
        private final int iMinFields;
        private final boolean iShowSeparators;
        private final String iZeroOffsetParseText;
        private final String iZeroOffsetPrintText;

        public TimeZoneOffset(String str, String str2, boolean z9, int i9, int i10) {
            this.iZeroOffsetPrintText = str;
            this.iZeroOffsetParseText = str2;
            this.iShowSeparators = z9;
            if (i9 <= 0 || i10 < i9) {
                throw new IllegalArgumentException();
            }
            if (i9 > 4) {
                i9 = 4;
                i10 = 4;
            }
            this.iMinFields = i9;
            this.iMaxFields = i10;
        }

        private int digitCount(CharSequence charSequence, int i9, int i10) {
            int i11 = 0;
            for (int iMin = Math.min(charSequence.length() - i9, i10); iMin > 0; iMin--) {
                char cCharAt = charSequence.charAt(i9 + i11);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i11++;
            }
            return i11;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            int i9 = this.iMinFields;
            int i10 = (i9 + 1) << 1;
            if (this.iShowSeparators) {
                i10 += i9 - 1;
            }
            String str = this.iZeroOffsetPrintText;
            return (str == null || str.length() <= i10) ? i10 : this.iZeroOffsetPrintText.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:82:0x00e9 A[PHI: r0 r6
          0x00e9: PHI (r0v4 int) = (r0v3 int), (r0v5 int), (r0v3 int) binds: [B:75:0x00d4, B:93:0x0107, B:81:0x00e7] A[DONT_GENERATE, DONT_INLINE]
          0x00e9: PHI (r6v8 int) = (r6v7 int), (r6v9 int), (r6v7 int) binds: [B:75:0x00d4, B:93:0x0107, B:81:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // org.joda.time.format.InternalParser
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int parseInto(org.joda.time.format.DateTimeParserBucket r12, java.lang.CharSequence r13, int r14) {
            /*
                Method dump skipped, instruction units count: 300
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset.parseInto(org.joda.time.format.DateTimeParserBucket, java.lang.CharSequence, int):int");
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j9, Chronology chronology, int i9, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            String str;
            if (dateTimeZone == null) {
                return;
            }
            if (i9 == 0 && (str = this.iZeroOffsetPrintText) != null) {
                appendable.append(str);
                return;
            }
            if (i9 >= 0) {
                appendable.append('+');
            } else {
                appendable.append('-');
                i9 = -i9;
            }
            int i10 = i9 / DateTimeConstants.MILLIS_PER_HOUR;
            FormatUtils.appendPaddedInteger(appendable, i10, 2);
            if (this.iMaxFields == 1) {
                return;
            }
            int i11 = i9 - (i10 * DateTimeConstants.MILLIS_PER_HOUR);
            if (i11 != 0 || this.iMinFields > 1) {
                int i12 = i11 / DateTimeConstants.MILLIS_PER_MINUTE;
                if (this.iShowSeparators) {
                    appendable.append(':');
                }
                FormatUtils.appendPaddedInteger(appendable, i12, 2);
                if (this.iMaxFields == 2) {
                    return;
                }
                int i13 = i11 - (i12 * DateTimeConstants.MILLIS_PER_MINUTE);
                if (i13 != 0 || this.iMinFields > 2) {
                    int i14 = i13 / 1000;
                    if (this.iShowSeparators) {
                        appendable.append(':');
                    }
                    FormatUtils.appendPaddedInteger(appendable, i14, 2);
                    if (this.iMaxFields == 3) {
                        return;
                    }
                    int i15 = i13 - (i14 * 1000);
                    if (i15 != 0 || this.iMinFields > 3) {
                        if (this.iShowSeparators) {
                            appendable.append('.');
                        }
                        FormatUtils.appendPaddedInteger(appendable, i15, 3);
                    }
                }
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }
    }

    public static class TwoDigitYear implements InternalPrinter, InternalParser {
        private final boolean iLenientParse;
        private final int iPivot;
        private final DateTimeFieldType iType;

        public TwoDigitYear(DateTimeFieldType dateTimeFieldType, int i9, boolean z9) {
            this.iType = dateTimeFieldType;
            this.iPivot = i9;
            this.iLenientParse = z9;
        }

        private int getTwoDigitYear(long j9, Chronology chronology) {
            try {
                int i9 = this.iType.getField(chronology).get(j9);
                if (i9 < 0) {
                    i9 = -i9;
                }
                return i9 % 100;
            } catch (RuntimeException unused) {
                return -1;
            }
        }

        private int getTwoDigitYear(ReadablePartial readablePartial) {
            if (!readablePartial.isSupported(this.iType)) {
                return -1;
            }
            try {
                int i9 = readablePartial.get(this.iType);
                if (i9 < 0) {
                    i9 = -i9;
                }
                return i9 % 100;
            } catch (RuntimeException unused) {
                return -1;
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iLenientParse ? 4 : 2;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return 2;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i9) {
            int i10;
            int i11;
            int length = charSequence.length() - i9;
            if (this.iLenientParse) {
                int i12 = 0;
                boolean z9 = false;
                boolean z10 = false;
                while (i12 < length) {
                    char cCharAt = charSequence.charAt(i9 + i12);
                    if (i12 == 0 && (cCharAt == '-' || cCharAt == '+')) {
                        z10 = cCharAt == '-';
                        if (z10) {
                            i12++;
                        } else {
                            i9++;
                            length--;
                        }
                        z9 = true;
                    } else {
                        if (cCharAt < '0' || cCharAt > '9') {
                            break;
                        }
                        i12++;
                    }
                }
                if (i12 == 0) {
                    return ~i9;
                }
                if (z9 || i12 != 2) {
                    if (i12 >= 9) {
                        i10 = i12 + i9;
                        i11 = Integer.parseInt(charSequence.subSequence(i9, i10).toString());
                    } else {
                        int i13 = z10 ? i9 + 1 : i9;
                        int i14 = i13 + 1;
                        try {
                            int iCharAt = charSequence.charAt(i13) - '0';
                            i10 = i12 + i9;
                            while (i14 < i10) {
                                int iCharAt2 = (((iCharAt << 3) + (iCharAt << 1)) + charSequence.charAt(i14)) - 48;
                                i14++;
                                iCharAt = iCharAt2;
                            }
                            i11 = z10 ? -iCharAt : iCharAt;
                        } catch (StringIndexOutOfBoundsException unused) {
                            return ~i9;
                        }
                    }
                    dateTimeParserBucket.saveField(this.iType, i11);
                    return i10;
                }
            } else if (Math.min(2, length) < 2) {
                return ~i9;
            }
            char cCharAt2 = charSequence.charAt(i9);
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                return ~i9;
            }
            int i15 = cCharAt2 - '0';
            char cCharAt3 = charSequence.charAt(i9 + 1);
            if (cCharAt3 < '0' || cCharAt3 > '9') {
                return ~i9;
            }
            int i16 = (((i15 << 3) + (i15 << 1)) + cCharAt3) - 48;
            int iIntValue = this.iPivot;
            if (dateTimeParserBucket.getPivotYear() != null) {
                iIntValue = dateTimeParserBucket.getPivotYear().intValue();
            }
            int i17 = iIntValue - 50;
            int i18 = i17 >= 0 ? i17 % 100 : ((iIntValue - 49) % 100) + 99;
            dateTimeParserBucket.saveField(this.iType, i16 + ((i17 + (i16 < i18 ? 100 : 0)) - i18));
            return i9 + 2;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j9, Chronology chronology, int i9, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            int twoDigitYear = getTwoDigitYear(j9, chronology);
            if (twoDigitYear >= 0) {
                FormatUtils.appendPaddedInteger(appendable, twoDigitYear, 2);
            } else {
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            int twoDigitYear = getTwoDigitYear(readablePartial);
            if (twoDigitYear >= 0) {
                FormatUtils.appendPaddedInteger(appendable, twoDigitYear, 2);
            } else {
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
            }
        }
    }

    public static class UnpaddedNumber extends NumberFormatter {
        public UnpaddedNumber(DateTimeFieldType dateTimeFieldType, int i9, boolean z9) {
            super(dateTimeFieldType, i9, z9);
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxParsedDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j9, Chronology chronology, int i9, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                FormatUtils.appendUnpaddedInteger(appendable, this.iFieldType.getField(chronology).get(j9));
            } catch (RuntimeException unused) {
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            if (readablePartial.isSupported(this.iFieldType)) {
                try {
                    FormatUtils.appendUnpaddedInteger(appendable, readablePartial.get(this.iFieldType));
                    return;
                } catch (RuntimeException unused) {
                }
            }
            appendable.append(Utf8.REPLACEMENT_CHARACTER);
        }
    }

    private DateTimeFormatterBuilder append0(Object obj) {
        this.iFormatter = null;
        this.iElementPairs.add(obj);
        this.iElementPairs.add(obj);
        return this;
    }

    private DateTimeFormatterBuilder append0(InternalPrinter internalPrinter, InternalParser internalParser) {
        this.iFormatter = null;
        this.iElementPairs.add(internalPrinter);
        this.iElementPairs.add(internalParser);
        return this;
    }

    public static void appendUnknownString(Appendable appendable, int i9) throws IOException {
        while (true) {
            i9--;
            if (i9 < 0) {
                return;
            } else {
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
            }
        }
    }

    private void checkParser(DateTimeParser dateTimeParser) {
        if (dateTimeParser == null) {
            throw new IllegalArgumentException("No parser supplied");
        }
    }

    private void checkPrinter(DateTimePrinter dateTimePrinter) {
        if (dateTimePrinter == null) {
            throw new IllegalArgumentException("No printer supplied");
        }
    }

    public static boolean csStartsWith(CharSequence charSequence, int i9, String str) {
        int length = str.length();
        if (charSequence.length() - i9 < length) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (charSequence.charAt(i9 + i10) != str.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    public static boolean csStartsWithIgnoreCase(CharSequence charSequence, int i9, String str) {
        char upperCase;
        char upperCase2;
        int length = str.length();
        if (charSequence.length() - i9 < length) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = charSequence.charAt(i9 + i10);
            char cCharAt2 = str.charAt(i10);
            if (cCharAt != cCharAt2 && (upperCase = Character.toUpperCase(cCharAt)) != (upperCase2 = Character.toUpperCase(cCharAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
        }
        return true;
    }

    private Object getFormatter() {
        Object composite = this.iFormatter;
        if (composite == null) {
            if (this.iElementPairs.size() == 2) {
                Object obj = this.iElementPairs.get(0);
                Object obj2 = this.iElementPairs.get(1);
                if (obj == null) {
                    composite = obj2;
                } else if (obj == obj2 || obj2 == null) {
                    composite = obj;
                }
            }
            if (composite == null) {
                composite = new Composite(this.iElementPairs);
            }
            this.iFormatter = composite;
        }
        return composite;
    }

    private boolean isFormatter(Object obj) {
        return isPrinter(obj) || isParser(obj);
    }

    private boolean isParser(Object obj) {
        if (!(obj instanceof InternalParser)) {
            return false;
        }
        if (obj instanceof Composite) {
            return ((Composite) obj).isParser();
        }
        return true;
    }

    private boolean isPrinter(Object obj) {
        if (!(obj instanceof InternalPrinter)) {
            return false;
        }
        if (obj instanceof Composite) {
            return ((Composite) obj).isPrinter();
        }
        return true;
    }

    public DateTimeFormatterBuilder append(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter != null) {
            return append0(dateTimeFormatter.getPrinter0(), dateTimeFormatter.getParser0());
        }
        throw new IllegalArgumentException("No formatter supplied");
    }

    public DateTimeFormatterBuilder append(DateTimeParser dateTimeParser) {
        checkParser(dateTimeParser);
        return append0(null, DateTimeParserInternalParser.of(dateTimeParser));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter) {
        checkPrinter(dateTimePrinter);
        return append0(DateTimePrinterInternalPrinter.of(dateTimePrinter), null);
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter, DateTimeParser dateTimeParser) {
        checkPrinter(dateTimePrinter);
        checkParser(dateTimeParser);
        return append0(DateTimePrinterInternalPrinter.of(dateTimePrinter), DateTimeParserInternalParser.of(dateTimeParser));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter, DateTimeParser[] dateTimeParserArr) {
        InternalPrinter internalPrinterOf;
        InternalParser matchingParser;
        if (dateTimePrinter != null) {
            checkPrinter(dateTimePrinter);
        }
        if (dateTimeParserArr == null) {
            throw new IllegalArgumentException("No parsers supplied");
        }
        int length = dateTimeParserArr.length;
        int i9 = 0;
        if (length != 1) {
            InternalParser[] internalParserArr = new InternalParser[length];
            while (i9 < length - 1) {
                InternalParser internalParserOf = DateTimeParserInternalParser.of(dateTimeParserArr[i9]);
                internalParserArr[i9] = internalParserOf;
                if (internalParserOf == null) {
                    throw new IllegalArgumentException("Incomplete parser array");
                }
                i9++;
            }
            internalParserArr[i9] = DateTimeParserInternalParser.of(dateTimeParserArr[i9]);
            internalPrinterOf = DateTimePrinterInternalPrinter.of(dateTimePrinter);
            matchingParser = new MatchingParser(internalParserArr);
        } else {
            if (dateTimeParserArr[0] == null) {
                throw new IllegalArgumentException("No parser supplied");
            }
            internalPrinterOf = DateTimePrinterInternalPrinter.of(dateTimePrinter);
            matchingParser = DateTimeParserInternalParser.of(dateTimeParserArr[0]);
        }
        return append0(internalPrinterOf, matchingParser);
    }

    public DateTimeFormatterBuilder appendCenturyOfEra(int i9, int i10) {
        return appendSignedDecimal(DateTimeFieldType.centuryOfEra(), i9, i10);
    }

    public DateTimeFormatterBuilder appendClockhourOfDay(int i9) {
        return appendDecimal(DateTimeFieldType.clockhourOfDay(), i9, 2);
    }

    public DateTimeFormatterBuilder appendClockhourOfHalfday(int i9) {
        return appendDecimal(DateTimeFieldType.clockhourOfHalfday(), i9, 2);
    }

    public DateTimeFormatterBuilder appendDayOfMonth(int i9) {
        return appendDecimal(DateTimeFieldType.dayOfMonth(), i9, 2);
    }

    public DateTimeFormatterBuilder appendDayOfWeek(int i9) {
        return appendDecimal(DateTimeFieldType.dayOfWeek(), i9, 1);
    }

    public DateTimeFormatterBuilder appendDayOfWeekShortText() {
        return appendShortText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendDayOfWeekText() {
        return appendText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendDayOfYear(int i9) {
        return appendDecimal(DateTimeFieldType.dayOfYear(), i9, 3);
    }

    public DateTimeFormatterBuilder appendDecimal(DateTimeFieldType dateTimeFieldType, int i9, int i10) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i10 < i9) {
            i10 = i9;
        }
        if (i9 < 0 || i10 <= 0) {
            throw new IllegalArgumentException();
        }
        return i9 <= 1 ? append0(new UnpaddedNumber(dateTimeFieldType, i10, false)) : append0(new PaddedNumber(dateTimeFieldType, i10, false, i9));
    }

    public DateTimeFormatterBuilder appendEraText() {
        return appendText(DateTimeFieldType.era());
    }

    public DateTimeFormatterBuilder appendFixedDecimal(DateTimeFieldType dateTimeFieldType, int i9) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i9 > 0) {
            return append0(new FixedNumber(dateTimeFieldType, i9, false));
        }
        throw new IllegalArgumentException("Illegal number of digits: " + i9);
    }

    public DateTimeFormatterBuilder appendFixedSignedDecimal(DateTimeFieldType dateTimeFieldType, int i9) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i9 > 0) {
            return append0(new FixedNumber(dateTimeFieldType, i9, true));
        }
        throw new IllegalArgumentException("Illegal number of digits: " + i9);
    }

    public DateTimeFormatterBuilder appendFraction(DateTimeFieldType dateTimeFieldType, int i9, int i10) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i10 < i9) {
            i10 = i9;
        }
        if (i9 < 0 || i10 <= 0) {
            throw new IllegalArgumentException();
        }
        return append0(new Fraction(dateTimeFieldType, i9, i10));
    }

    public DateTimeFormatterBuilder appendFractionOfDay(int i9, int i10) {
        return appendFraction(DateTimeFieldType.dayOfYear(), i9, i10);
    }

    public DateTimeFormatterBuilder appendFractionOfHour(int i9, int i10) {
        return appendFraction(DateTimeFieldType.hourOfDay(), i9, i10);
    }

    public DateTimeFormatterBuilder appendFractionOfMinute(int i9, int i10) {
        return appendFraction(DateTimeFieldType.minuteOfDay(), i9, i10);
    }

    public DateTimeFormatterBuilder appendFractionOfSecond(int i9, int i10) {
        return appendFraction(DateTimeFieldType.secondOfDay(), i9, i10);
    }

    public DateTimeFormatterBuilder appendHalfdayOfDayText() {
        return appendText(DateTimeFieldType.halfdayOfDay());
    }

    public DateTimeFormatterBuilder appendHourOfDay(int i9) {
        return appendDecimal(DateTimeFieldType.hourOfDay(), i9, 2);
    }

    public DateTimeFormatterBuilder appendHourOfHalfday(int i9) {
        return appendDecimal(DateTimeFieldType.hourOfHalfday(), i9, 2);
    }

    public DateTimeFormatterBuilder appendLiteral(char c9) {
        return append0(new CharacterLiteral(c9));
    }

    public DateTimeFormatterBuilder appendLiteral(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Literal must not be null");
        }
        int length = str.length();
        if (length != 0) {
            return append0(length != 1 ? new StringLiteral(str) : new CharacterLiteral(str.charAt(0)));
        }
        return this;
    }

    public DateTimeFormatterBuilder appendMillisOfDay(int i9) {
        return appendDecimal(DateTimeFieldType.millisOfDay(), i9, 8);
    }

    public DateTimeFormatterBuilder appendMillisOfSecond(int i9) {
        return appendDecimal(DateTimeFieldType.millisOfSecond(), i9, 3);
    }

    public DateTimeFormatterBuilder appendMinuteOfDay(int i9) {
        return appendDecimal(DateTimeFieldType.minuteOfDay(), i9, 4);
    }

    public DateTimeFormatterBuilder appendMinuteOfHour(int i9) {
        return appendDecimal(DateTimeFieldType.minuteOfHour(), i9, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYear(int i9) {
        return appendDecimal(DateTimeFieldType.monthOfYear(), i9, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYearShortText() {
        return appendShortText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendMonthOfYearText() {
        return appendText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendOptional(DateTimeParser dateTimeParser) {
        checkParser(dateTimeParser);
        return append0(null, new MatchingParser(new InternalParser[]{DateTimeParserInternalParser.of(dateTimeParser), null}));
    }

    public DateTimeFormatterBuilder appendPattern(String str) {
        DateTimeFormat.appendPatternTo(this, str);
        return this;
    }

    public DateTimeFormatterBuilder appendSecondOfDay(int i9) {
        return appendDecimal(DateTimeFieldType.secondOfDay(), i9, 5);
    }

    public DateTimeFormatterBuilder appendSecondOfMinute(int i9) {
        return appendDecimal(DateTimeFieldType.secondOfMinute(), i9, 2);
    }

    public DateTimeFormatterBuilder appendShortText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return append0(new TextField(dateTimeFieldType, true));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendSignedDecimal(DateTimeFieldType dateTimeFieldType, int i9, int i10) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i10 < i9) {
            i10 = i9;
        }
        if (i9 < 0 || i10 <= 0) {
            throw new IllegalArgumentException();
        }
        return i9 <= 1 ? append0(new UnpaddedNumber(dateTimeFieldType, i10, true)) : append0(new PaddedNumber(dateTimeFieldType, i10, true, i9));
    }

    public DateTimeFormatterBuilder appendText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return append0(new TextField(dateTimeFieldType, false));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendTimeZoneId() {
        TimeZoneId timeZoneId = TimeZoneId.INSTANCE;
        return append0(timeZoneId, timeZoneId);
    }

    public DateTimeFormatterBuilder appendTimeZoneName() {
        return append0(new TimeZoneName(0, null), null);
    }

    public DateTimeFormatterBuilder appendTimeZoneName(Map<String, DateTimeZone> map) {
        TimeZoneName timeZoneName = new TimeZoneName(0, map);
        return append0(timeZoneName, timeZoneName);
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, String str2, boolean z9, int i9, int i10) {
        return append0(new TimeZoneOffset(str, str2, z9, i9, i10));
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, boolean z9, int i9, int i10) {
        return append0(new TimeZoneOffset(str, str, z9, i9, i10));
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName() {
        return append0(new TimeZoneName(1, null), null);
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName(Map<String, DateTimeZone> map) {
        TimeZoneName timeZoneName = new TimeZoneName(1, map);
        return append0(timeZoneName, timeZoneName);
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i9) {
        return appendTwoDigitWeekyear(i9, false);
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i9, boolean z9) {
        return append0(new TwoDigitYear(DateTimeFieldType.weekyear(), i9, z9));
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i9) {
        return appendTwoDigitYear(i9, false);
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i9, boolean z9) {
        return append0(new TwoDigitYear(DateTimeFieldType.year(), i9, z9));
    }

    public DateTimeFormatterBuilder appendWeekOfWeekyear(int i9) {
        return appendDecimal(DateTimeFieldType.weekOfWeekyear(), i9, 2);
    }

    public DateTimeFormatterBuilder appendWeekyear(int i9, int i10) {
        return appendSignedDecimal(DateTimeFieldType.weekyear(), i9, i10);
    }

    public DateTimeFormatterBuilder appendYear(int i9, int i10) {
        return appendSignedDecimal(DateTimeFieldType.year(), i9, i10);
    }

    public DateTimeFormatterBuilder appendYearOfCentury(int i9, int i10) {
        return appendDecimal(DateTimeFieldType.yearOfCentury(), i9, i10);
    }

    public DateTimeFormatterBuilder appendYearOfEra(int i9, int i10) {
        return appendDecimal(DateTimeFieldType.yearOfEra(), i9, i10);
    }

    public boolean canBuildFormatter() {
        return isFormatter(getFormatter());
    }

    public boolean canBuildParser() {
        return isParser(getFormatter());
    }

    public boolean canBuildPrinter() {
        return isPrinter(getFormatter());
    }

    public void clear() {
        this.iFormatter = null;
        this.iElementPairs.clear();
    }

    public DateTimeFormatter toFormatter() {
        Object formatter = getFormatter();
        InternalPrinter internalPrinter = isPrinter(formatter) ? (InternalPrinter) formatter : null;
        InternalParser internalParser = isParser(formatter) ? (InternalParser) formatter : null;
        if (internalPrinter == null && internalParser == null) {
            throw new UnsupportedOperationException("Both printing and parsing not supported");
        }
        return new DateTimeFormatter(internalPrinter, internalParser);
    }

    public DateTimeParser toParser() {
        Object formatter = getFormatter();
        if (isParser(formatter)) {
            return InternalParserDateTimeParser.of((InternalParser) formatter);
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    public DateTimePrinter toPrinter() {
        Object formatter = getFormatter();
        if (isPrinter(formatter)) {
            return InternalPrinterDateTimePrinter.of((InternalPrinter) formatter);
        }
        throw new UnsupportedOperationException("Printing is not supported");
    }
}
