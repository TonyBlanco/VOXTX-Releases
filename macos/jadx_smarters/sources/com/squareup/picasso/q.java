package com.squareup.picasso;

/* JADX INFO: loaded from: classes4.dex */
public enum q {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);

    final int index;

    q(int i9) {
        this.index = i9;
    }

    public static boolean isOfflineOnly(int i9) {
        return (i9 & OFFLINE.index) != 0;
    }

    public static boolean shouldReadFromDiskCache(int i9) {
        return (i9 & NO_CACHE.index) == 0;
    }

    public static boolean shouldWriteToDiskCache(int i9) {
        return (i9 & NO_STORE.index) == 0;
    }
}
