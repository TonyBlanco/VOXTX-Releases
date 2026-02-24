package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class cm implements bv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f22629a = new ArrayList(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f22630b;

    public cm(Handler handler) {
        this.f22630b = handler;
    }

    public static /* bridge */ /* synthetic */ void k(cl clVar) {
        List list = f22629a;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(clVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static cl l() {
        cl clVar;
        List list = f22629a;
        synchronized (list) {
            try {
                clVar = list.isEmpty() ? new cl(null) : (cl) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return clVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bv
    public final bu a(int i9) {
        cl clVarL = l();
        clVarL.c(this.f22630b.obtainMessage(i9));
        return clVarL;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bv
    public final bu b(int i9, Object obj) {
        cl clVarL = l();
        clVarL.c(this.f22630b.obtainMessage(i9, obj));
        return clVarL;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bv
    public final boolean c() {
        return this.f22630b.hasMessages(0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bv
    public final bu d(int i9, int i10) {
        cl clVarL = l();
        clVarL.c(this.f22630b.obtainMessage(1, i9, i10));
        return clVarL;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bv
    public final void e(Runnable runnable) {
        this.f22630b.post(runnable);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bv
    public final void f() {
        this.f22630b.removeCallbacksAndMessages(null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bv
    public final void g() {
        this.f22630b.removeMessages(2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bv
    public final void h(int i9) {
        this.f22630b.sendEmptyMessage(i9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bv
    public final void i(long j9) {
        this.f22630b.sendEmptyMessageAtTime(2, j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bv
    public final void j(bu buVar) {
        ((cl) buVar).b(this.f22630b);
    }
}
