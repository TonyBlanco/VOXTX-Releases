package org.joda.time.format;

/* JADX INFO: loaded from: classes4.dex */
class InternalParserDateTimeParser implements DateTimeParser, InternalParser {
    private final InternalParser underlying;

    private InternalParserDateTimeParser(InternalParser internalParser) {
        this.underlying = internalParser;
    }

    public static DateTimeParser of(InternalParser internalParser) {
        if (internalParser instanceof DateTimeParserInternalParser) {
            return ((DateTimeParserInternalParser) internalParser).getUnderlying();
        }
        if (internalParser instanceof DateTimeParser) {
            return (DateTimeParser) internalParser;
        }
        if (internalParser == null) {
            return null;
        }
        return new InternalParserDateTimeParser(internalParser);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InternalParserDateTimeParser) {
            return this.underlying.equals(((InternalParserDateTimeParser) obj).underlying);
        }
        return false;
    }

    @Override // org.joda.time.format.DateTimeParser, org.joda.time.format.InternalParser
    public int estimateParsedLength() {
        return this.underlying.estimateParsedLength();
    }

    @Override // org.joda.time.format.InternalParser
    public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i9) {
        return this.underlying.parseInto(dateTimeParserBucket, charSequence, i9);
    }

    @Override // org.joda.time.format.DateTimeParser
    public int parseInto(DateTimeParserBucket dateTimeParserBucket, String str, int i9) {
        return this.underlying.parseInto(dateTimeParserBucket, str, i9);
    }
}
