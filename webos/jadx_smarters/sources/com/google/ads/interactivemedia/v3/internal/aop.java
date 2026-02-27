package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class aop implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final anw f20436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final agl f20437b;

    public aop(anw anwVar, agl aglVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f20436a = anwVar;
        this.f20437b = aglVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.f20436a.k() != null) {
            this.f20436a.k().get();
        }
        agc agcVarC = this.f20436a.c();
        if (agcVarC == null) {
            return null;
        }
        try {
            synchronized (this.f20437b) {
                agl aglVar = this.f20437b;
                byte[] bArrAv = agcVarC.av();
                aglVar.aU(bArrAv, bArrAv.length, bqb.a());
            }
            return null;
        } catch (bqw | NullPointerException unused) {
            return null;
        }
    }
}
