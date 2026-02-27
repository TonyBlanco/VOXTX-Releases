package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.C1371k;
import com.google.android.gms.tasks.TaskCompletionSource;
import w4.C2916d;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1379o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1371k f26680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2916d[] f26681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26683d;

    public AbstractC1379o(C1371k c1371k, C2916d[] c2916dArr, boolean z9, int i9) {
        this.f26680a = c1371k;
        this.f26681b = c2916dArr;
        this.f26682c = z9;
        this.f26683d = i9;
    }

    public void a() {
        this.f26680a.a();
    }

    public C1371k.a b() {
        return this.f26680a.b();
    }

    public C2916d[] c() {
        return this.f26681b;
    }

    public abstract void d(a.b bVar, TaskCompletionSource taskCompletionSource);

    public final int e() {
        return this.f26683d;
    }

    public final boolean f() {
        return this.f26682c;
    }
}
