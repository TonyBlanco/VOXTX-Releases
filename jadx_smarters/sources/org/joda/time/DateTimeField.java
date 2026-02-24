package org.joda.time;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DateTimeField {
    public abstract long add(long j9, int i9);

    public abstract long add(long j9, long j10);

    public abstract int[] add(ReadablePartial readablePartial, int i9, int[] iArr, int i10);

    public abstract long addWrapField(long j9, int i9);

    public abstract int[] addWrapField(ReadablePartial readablePartial, int i9, int[] iArr, int i10);

    public abstract int[] addWrapPartial(ReadablePartial readablePartial, int i9, int[] iArr, int i10);

    public abstract int get(long j9);

    public abstract String getAsShortText(int i9, Locale locale);

    public abstract String getAsShortText(long j9);

    public abstract String getAsShortText(long j9, Locale locale);

    public abstract String getAsShortText(ReadablePartial readablePartial, int i9, Locale locale);

    public abstract String getAsShortText(ReadablePartial readablePartial, Locale locale);

    public abstract String getAsText(int i9, Locale locale);

    public abstract String getAsText(long j9);

    public abstract String getAsText(long j9, Locale locale);

    public abstract String getAsText(ReadablePartial readablePartial, int i9, Locale locale);

    public abstract String getAsText(ReadablePartial readablePartial, Locale locale);

    public abstract int getDifference(long j9, long j10);

    public abstract long getDifferenceAsLong(long j9, long j10);

    public abstract DurationField getDurationField();

    public abstract int getLeapAmount(long j9);

    public abstract DurationField getLeapDurationField();

    public abstract int getMaximumShortTextLength(Locale locale);

    public abstract int getMaximumTextLength(Locale locale);

    public abstract int getMaximumValue();

    public abstract int getMaximumValue(long j9);

    public abstract int getMaximumValue(ReadablePartial readablePartial);

    public abstract int getMaximumValue(ReadablePartial readablePartial, int[] iArr);

    public abstract int getMinimumValue();

    public abstract int getMinimumValue(long j9);

    public abstract int getMinimumValue(ReadablePartial readablePartial);

    public abstract int getMinimumValue(ReadablePartial readablePartial, int[] iArr);

    public abstract String getName();

    public abstract DurationField getRangeDurationField();

    public abstract DateTimeFieldType getType();

    public abstract boolean isLeap(long j9);

    public abstract boolean isLenient();

    public abstract boolean isSupported();

    public abstract long remainder(long j9);

    public abstract long roundCeiling(long j9);

    public abstract long roundFloor(long j9);

    public abstract long roundHalfCeiling(long j9);

    public abstract long roundHalfEven(long j9);

    public abstract long roundHalfFloor(long j9);

    public abstract long set(long j9, int i9);

    public abstract long set(long j9, String str);

    public abstract long set(long j9, String str, Locale locale);

    public abstract int[] set(ReadablePartial readablePartial, int i9, int[] iArr, int i10);

    public abstract int[] set(ReadablePartial readablePartial, int i9, int[] iArr, String str, Locale locale);

    public abstract String toString();
}
