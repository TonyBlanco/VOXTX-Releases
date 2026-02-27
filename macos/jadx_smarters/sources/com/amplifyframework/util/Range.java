package com.amplifyframework.util;

import java.lang.Comparable;

/* JADX INFO: loaded from: classes.dex */
public final class Range<T extends Comparable<T>> {
    private final T high;
    private final T low;

    public Range(T t9, T t10) throws IllegalArgumentException {
        if (t9.compareTo(t10) > 0) {
            throw new IllegalArgumentException("Low value should be lower than high");
        }
        this.low = t9;
        this.high = t10;
    }

    public boolean contains(T t9) {
        return t9.compareTo(this.low) >= 0 && t9.compareTo(this.high) <= 0;
    }
}
