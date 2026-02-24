package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class N extends P4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f26498a;

    public N(T t9) {
        this.f26498a = new WeakReference(t9);
    }

    @Override // P4.f
    public final void M0(P4.l lVar) {
        T t9 = (T) this.f26498a.get();
        if (t9 == null) {
            return;
        }
        t9.f26515a.l(new M(this, t9, t9, lVar));
    }
}
