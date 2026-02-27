package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
final class avw implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object[] f20830a;

    public avw(Object[] objArr) {
        this.f20830a = objArr;
    }

    public Object readResolve() {
        return avx.m(this.f20830a);
    }
}
