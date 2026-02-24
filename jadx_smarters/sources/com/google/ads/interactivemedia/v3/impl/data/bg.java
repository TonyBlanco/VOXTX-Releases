package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.atf;

/* JADX INFO: loaded from: classes3.dex */
@atf(a = aa.class)
public abstract class bg {
    public static bg create(String str, String str2, boolean z9, String str3, int i9) {
        return new aa(str, str2, z9, str3, i9);
    }

    public abstract String appSetId();

    public abstract int appSetIdScope();

    public abstract String deviceId();

    public abstract String idType();

    public abstract boolean isLimitedAdTracking();
}
