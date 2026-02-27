package com.amplifyframework.predictions.models;

/* JADX INFO: loaded from: classes.dex */
public final class AgeRange {
    private final int high;
    private final int low;

    public AgeRange(int i9, int i10) {
        if (i10 < i9) {
            throw new IllegalArgumentException("Low cannot be higher than High.");
        }
        this.low = i9;
        this.high = i10;
    }

    public boolean contains(int i9) {
        return i9 >= this.low && i9 <= this.high;
    }

    public int getHigh() {
        return this.high;
    }

    public int getLow() {
        return this.low;
    }
}
