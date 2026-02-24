package org.joda.time.format;

import com.facebook.ads.AdError;
import java.util.Arrays;
import java.util.Locale;
import org.apache.http.message.TokenParser;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;

/* JADX INFO: loaded from: classes4.dex */
public class DateTimeParserBucket {
    private final Chronology iChrono;
    private final Integer iDefaultPivotYear;
    private final int iDefaultYear;
    private final DateTimeZone iDefaultZone;
    private final Locale iLocale;
    private final long iMillis;
    private Integer iOffset;
    private Integer iPivotYear;
    private SavedField[] iSavedFields;
    private int iSavedFieldsCount;
    private boolean iSavedFieldsShared;
    private Object iSavedState;
    private DateTimeZone iZone;

    public static class SavedField implements Comparable<SavedField> {
        DateTimeField iField;
        Locale iLocale;
        String iText;
        int iValue;

        @Override // java.lang.Comparable
        public int compareTo(SavedField savedField) {
            DateTimeField dateTimeField = savedField.iField;
            int iCompareReverse = DateTimeParserBucket.compareReverse(this.iField.getRangeDurationField(), dateTimeField.getRangeDurationField());
            return iCompareReverse != 0 ? iCompareReverse : DateTimeParserBucket.compareReverse(this.iField.getDurationField(), dateTimeField.getDurationField());
        }

        public void init(DateTimeField dateTimeField, int i9) {
            this.iField = dateTimeField;
            this.iValue = i9;
            this.iText = null;
            this.iLocale = null;
        }

        public void init(DateTimeField dateTimeField, String str, Locale locale) {
            this.iField = dateTimeField;
            this.iValue = 0;
            this.iText = str;
            this.iLocale = locale;
        }

        public long set(long j9, boolean z9) {
            String str = this.iText;
            long j10 = str == null ? this.iField.set(j9, this.iValue) : this.iField.set(j9, str, this.iLocale);
            return z9 ? this.iField.roundFloor(j10) : j10;
        }
    }

    public class SavedState {
        final Integer iOffset;
        final SavedField[] iSavedFields;
        final int iSavedFieldsCount;
        final DateTimeZone iZone;

        public SavedState() {
            this.iZone = DateTimeParserBucket.this.iZone;
            this.iOffset = DateTimeParserBucket.this.iOffset;
            this.iSavedFields = DateTimeParserBucket.this.iSavedFields;
            this.iSavedFieldsCount = DateTimeParserBucket.this.iSavedFieldsCount;
        }

        public boolean restoreState(DateTimeParserBucket dateTimeParserBucket) {
            if (dateTimeParserBucket != DateTimeParserBucket.this) {
                return false;
            }
            dateTimeParserBucket.iZone = this.iZone;
            dateTimeParserBucket.iOffset = this.iOffset;
            dateTimeParserBucket.iSavedFields = this.iSavedFields;
            if (this.iSavedFieldsCount < dateTimeParserBucket.iSavedFieldsCount) {
                dateTimeParserBucket.iSavedFieldsShared = true;
            }
            dateTimeParserBucket.iSavedFieldsCount = this.iSavedFieldsCount;
            return true;
        }
    }

    @Deprecated
    public DateTimeParserBucket(long j9, Chronology chronology, Locale locale) {
        this(j9, chronology, locale, null, AdError.SERVER_ERROR_CODE);
    }

    @Deprecated
    public DateTimeParserBucket(long j9, Chronology chronology, Locale locale, Integer num) {
        this(j9, chronology, locale, num, AdError.SERVER_ERROR_CODE);
    }

    public DateTimeParserBucket(long j9, Chronology chronology, Locale locale, Integer num, int i9) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        this.iMillis = j9;
        DateTimeZone zone = chronology2.getZone();
        this.iDefaultZone = zone;
        this.iChrono = chronology2.withUTC();
        this.iLocale = locale == null ? Locale.getDefault() : locale;
        this.iDefaultYear = i9;
        this.iDefaultPivotYear = num;
        this.iZone = zone;
        this.iPivotYear = num;
        this.iSavedFields = new SavedField[8];
    }

    public static int compareReverse(DurationField durationField, DurationField durationField2) {
        if (durationField == null || !durationField.isSupported()) {
            return (durationField2 == null || !durationField2.isSupported()) ? 0 : -1;
        }
        if (durationField2 == null || !durationField2.isSupported()) {
            return 1;
        }
        return -durationField.compareTo(durationField2);
    }

    private SavedField obtainSaveField() {
        SavedField[] savedFieldArr = this.iSavedFields;
        int i9 = this.iSavedFieldsCount;
        if (i9 == savedFieldArr.length || this.iSavedFieldsShared) {
            SavedField[] savedFieldArr2 = new SavedField[i9 == savedFieldArr.length ? i9 * 2 : savedFieldArr.length];
            System.arraycopy(savedFieldArr, 0, savedFieldArr2, 0, i9);
            this.iSavedFields = savedFieldArr2;
            this.iSavedFieldsShared = false;
            savedFieldArr = savedFieldArr2;
        }
        this.iSavedState = null;
        SavedField savedField = savedFieldArr[i9];
        if (savedField == null) {
            savedField = new SavedField();
            savedFieldArr[i9] = savedField;
        }
        this.iSavedFieldsCount = i9 + 1;
        return savedField;
    }

    private static void sort(SavedField[] savedFieldArr, int i9) {
        if (i9 > 10) {
            Arrays.sort(savedFieldArr, 0, i9);
            return;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            for (int i11 = i10; i11 > 0; i11--) {
                int i12 = i11 - 1;
                if (savedFieldArr[i12].compareTo(savedFieldArr[i11]) > 0) {
                    SavedField savedField = savedFieldArr[i11];
                    savedFieldArr[i11] = savedFieldArr[i12];
                    savedFieldArr[i12] = savedField;
                }
            }
        }
    }

    public long computeMillis() {
        return computeMillis(false, (CharSequence) null);
    }

    public long computeMillis(boolean z9) {
        return computeMillis(z9, (CharSequence) null);
    }

    public long computeMillis(boolean z9, CharSequence charSequence) {
        SavedField[] savedFieldArr = this.iSavedFields;
        int i9 = this.iSavedFieldsCount;
        if (this.iSavedFieldsShared) {
            savedFieldArr = (SavedField[]) savedFieldArr.clone();
            this.iSavedFields = savedFieldArr;
            this.iSavedFieldsShared = false;
        }
        sort(savedFieldArr, i9);
        if (i9 > 0) {
            DurationField field = DurationFieldType.months().getField(this.iChrono);
            DurationField field2 = DurationFieldType.days().getField(this.iChrono);
            DurationField durationField = savedFieldArr[0].iField.getDurationField();
            if (compareReverse(durationField, field) >= 0 && compareReverse(durationField, field2) <= 0) {
                saveField(DateTimeFieldType.year(), this.iDefaultYear);
                return computeMillis(z9, charSequence);
            }
        }
        long j9 = this.iMillis;
        for (int i10 = 0; i10 < i9; i10++) {
            try {
                j9 = savedFieldArr[i10].set(j9, z9);
            } catch (IllegalFieldValueException e9) {
                if (charSequence != null) {
                    e9.prependMessage("Cannot parse \"" + ((Object) charSequence) + TokenParser.DQUOTE);
                }
                throw e9;
            }
        }
        if (z9) {
            int i11 = 0;
            while (i11 < i9) {
                j9 = savedFieldArr[i11].set(j9, i11 == i9 + (-1));
                i11++;
            }
        }
        Integer num = this.iOffset;
        if (num != null) {
            return j9 - ((long) num.intValue());
        }
        DateTimeZone dateTimeZone = this.iZone;
        if (dateTimeZone == null) {
            return j9;
        }
        int offsetFromLocal = dateTimeZone.getOffsetFromLocal(j9);
        long j10 = j9 - ((long) offsetFromLocal);
        if (offsetFromLocal == this.iZone.getOffset(j10)) {
            return j10;
        }
        String str = "Illegal instant due to time zone offset transition (" + this.iZone + ')';
        if (charSequence != null) {
            str = "Cannot parse \"" + ((Object) charSequence) + "\": " + str;
        }
        throw new IllegalInstantException(str);
    }

    public long computeMillis(boolean z9, String str) {
        return computeMillis(z9, (CharSequence) str);
    }

    public long doParseMillis(InternalParser internalParser, CharSequence charSequence) {
        int into = internalParser.parseInto(this, charSequence, 0);
        if (into < 0) {
            into = ~into;
        } else if (into >= charSequence.length()) {
            return computeMillis(true, charSequence);
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(charSequence.toString(), into));
    }

    public Chronology getChronology() {
        return this.iChrono;
    }

    public Locale getLocale() {
        return this.iLocale;
    }

    @Deprecated
    public int getOffset() {
        Integer num = this.iOffset;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public Integer getOffsetInteger() {
        return this.iOffset;
    }

    public Integer getPivotYear() {
        return this.iPivotYear;
    }

    public DateTimeZone getZone() {
        return this.iZone;
    }

    public long parseMillis(DateTimeParser dateTimeParser, CharSequence charSequence) {
        reset();
        return doParseMillis(DateTimeParserInternalParser.of(dateTimeParser), charSequence);
    }

    public void reset() {
        this.iZone = this.iDefaultZone;
        this.iOffset = null;
        this.iPivotYear = this.iDefaultPivotYear;
        this.iSavedFieldsCount = 0;
        this.iSavedFieldsShared = false;
        this.iSavedState = null;
    }

    public boolean restoreState(Object obj) {
        if (!(obj instanceof SavedState) || !((SavedState) obj).restoreState(this)) {
            return false;
        }
        this.iSavedState = obj;
        return true;
    }

    public void saveField(DateTimeField dateTimeField, int i9) {
        obtainSaveField().init(dateTimeField, i9);
    }

    public void saveField(DateTimeFieldType dateTimeFieldType, int i9) {
        obtainSaveField().init(dateTimeFieldType.getField(this.iChrono), i9);
    }

    public void saveField(DateTimeFieldType dateTimeFieldType, String str, Locale locale) {
        obtainSaveField().init(dateTimeFieldType.getField(this.iChrono), str, locale);
    }

    public Object saveState() {
        if (this.iSavedState == null) {
            this.iSavedState = new SavedState();
        }
        return this.iSavedState;
    }

    @Deprecated
    public void setOffset(int i9) {
        this.iSavedState = null;
        this.iOffset = Integer.valueOf(i9);
    }

    public void setOffset(Integer num) {
        this.iSavedState = null;
        this.iOffset = num;
    }

    @Deprecated
    public void setPivotYear(Integer num) {
        this.iPivotYear = num;
    }

    public void setZone(DateTimeZone dateTimeZone) {
        this.iSavedState = null;
        this.iZone = dateTimeZone;
    }
}
