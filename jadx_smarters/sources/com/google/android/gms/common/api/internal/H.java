package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC1404c;
import java.lang.ref.WeakReference;
import w4.C2914b;

/* JADX INFO: loaded from: classes3.dex */
public final class H implements AbstractC1404c.InterfaceC0255c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f26474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.a f26475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26476c;

    public H(T t9, com.google.android.gms.common.api.a aVar, boolean z9) {
        this.f26474a = new WeakReference(t9);
        this.f26475b = aVar;
        this.f26476c = z9;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c.InterfaceC0255c
    public final void c(C2914b c2914b) {
        T t9 = (T) this.f26474a.get();
        if (t9 == null) {
            return;
        }
        com.google.android.gms.common.internal.r.q(Looper.myLooper() == t9.f26515a.f26608o.i(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        t9.f26516b.lock();
        try {
            if (t9.o(0)) {
                if (!c2914b.L()) {
                    t9.m(c2914b, this.f26475b, this.f26476c);
                }
                if (t9.p()) {
                    t9.n();
                }
            }
        } finally {
            t9.f26516b.unlock();
        }
    }
}
