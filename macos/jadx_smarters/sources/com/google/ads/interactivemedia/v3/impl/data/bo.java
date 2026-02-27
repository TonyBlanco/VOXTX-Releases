package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.atf;

/* JADX INFO: loaded from: classes3.dex */
@atf(a = ac.class)
public abstract class bo {
    public static bo create(String str, String str2) {
        return new ac(str, str2);
    }

    public static bo create(Throwable th) {
        return new ac(th.getClass().getName(), th.getMessage());
    }

    public abstract String message();

    public abstract String name();
}
