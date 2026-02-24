package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aik implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f19843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f19844b;

    public /* synthetic */ aik(aiq aiqVar, int i9) {
        this.f19844b = i9;
        this.f19843a = aiqVar;
    }

    public /* synthetic */ aik(ali aliVar, int i9) {
        this.f19844b = i9;
        this.f19843a = aliVar;
    }

    public /* synthetic */ aik(alq alqVar, int i9) {
        this.f19844b = i9;
        this.f19843a = alqVar;
    }

    public /* synthetic */ aik(alx alxVar, int i9) {
        this.f19844b = i9;
        this.f19843a = alxVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i9 = this.f19844b;
        return i9 != 0 ? i9 != 1 ? i9 != 2 ? ((alq) this.f19843a).a() : ((aiq) this.f19843a).g() : ((ali) this.f19843a).a() : ((alx) this.f19843a).b();
    }
}
