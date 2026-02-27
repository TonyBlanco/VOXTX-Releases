package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.atf;

/* JADX INFO: loaded from: classes3.dex */
@atf(a = t.class)
public abstract class bb {
    private static bb create(double d9, double d10, boolean z9) {
        return new t(d9, d10, z9);
    }

    public abstract double end();

    public abstract boolean played();

    public abstract double start();
}
