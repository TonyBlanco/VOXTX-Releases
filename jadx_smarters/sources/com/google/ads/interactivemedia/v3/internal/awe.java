package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
final class awe implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator f20843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object[] f20844b;

    public awe(Comparator comparator, Object[] objArr) {
        this.f20843a = comparator;
        this.f20844b = objArr;
    }

    public Object readResolve() {
        awd awdVar = new awd(this.f20843a);
        awdVar.i(this.f20844b);
        return awdVar.h();
    }
}
