package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.atf;

/* JADX INFO: loaded from: classes3.dex */
@atf(a = ad.class)
public abstract class bq {
    public static bq create(bp bpVar, String str, String str2, String str3, String str4, int i9, int i10) {
        return new ad(bpVar, str, str2, str4, str3, i9, i10);
    }

    public abstract int connectionTimeoutMs();

    public abstract String content();

    public abstract String id();

    public abstract int readTimeoutMs();

    public abstract bp requestType();

    public abstract String url();

    public abstract String userAgent();
}
