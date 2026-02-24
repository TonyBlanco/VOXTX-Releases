package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aip {
    public static aip create(int i9, String str) {
        return new aiy(i9, str);
    }

    public abstract int appVersion();

    public abstract String packageName();
}
