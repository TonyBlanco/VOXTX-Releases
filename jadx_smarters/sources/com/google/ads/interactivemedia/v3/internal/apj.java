package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class apj implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final anw f20468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f20469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final String f20470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Method f20471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f20472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final int f20473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final agl f20474g;

    public apj(anw anwVar, String str, String str2, agl aglVar, int i9, int i10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f20468a = anwVar;
        this.f20469b = str;
        this.f20470c = str2;
        this.f20474g = aglVar;
        this.f20472e = i9;
        this.f20473f = i10;
    }

    public abstract void a() throws IllegalAccessException, InvocationTargetException;

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        f();
        return null;
    }

    public void f() throws Exception {
        int i9;
        try {
            long jNanoTime = System.nanoTime();
            Method methodI = this.f20468a.i(this.f20469b, this.f20470c);
            this.f20471d = methodI;
            if (methodI == null) {
                return;
            }
            a();
            amu amuVarD = this.f20468a.d();
            if (amuVarD == null || (i9 = this.f20472e) == Integer.MIN_VALUE) {
                return;
            }
            amuVarD.c(this.f20473f, i9, (System.nanoTime() - jNanoTime) / 1000, null, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
