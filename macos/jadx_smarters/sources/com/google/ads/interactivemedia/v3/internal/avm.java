package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
final class avm implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object[] f20812a;

    public avm(Object[] objArr) {
        this.f20812a = objArr;
    }

    public Object readResolve() {
        return avo.n(this.f20812a);
    }
}
