package com.squareup.picasso;

/* JADX INFO: loaded from: classes4.dex */
public enum p {
    NO_CACHE(1),
    NO_STORE(2);

    final int index;

    p(int i9) {
        this.index = i9;
    }

    public static boolean shouldReadFromMemoryCache(int i9) {
        return (i9 & NO_CACHE.index) == 0;
    }

    public static boolean shouldWriteToMemoryCache(int i9) {
        return (i9 & NO_STORE.index) == 0;
    }
}
