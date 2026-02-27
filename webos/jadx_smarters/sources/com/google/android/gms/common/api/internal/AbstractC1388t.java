package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.tasks.TaskCompletionSource;
import w4.C2916d;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1388t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2916d[] f26704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f26705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26706c;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.t$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InterfaceC1383q f26707a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C2916d[] f26709c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f26708b = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f26710d = 0;

        public /* synthetic */ a(L0 l02) {
        }

        public AbstractC1388t a() {
            com.google.android.gms.common.internal.r.b(this.f26707a != null, "execute parameter required");
            return new K0(this, this.f26709c, this.f26708b, this.f26710d);
        }

        public a b(InterfaceC1383q interfaceC1383q) {
            this.f26707a = interfaceC1383q;
            return this;
        }

        public a c(boolean z9) {
            this.f26708b = z9;
            return this;
        }

        public a d(C2916d... c2916dArr) {
            this.f26709c = c2916dArr;
            return this;
        }

        public a e(int i9) {
            this.f26710d = i9;
            return this;
        }
    }

    public AbstractC1388t(C2916d[] c2916dArr, boolean z9, int i9) {
        this.f26704a = c2916dArr;
        boolean z10 = false;
        if (c2916dArr != null && z9) {
            z10 = true;
        }
        this.f26705b = z10;
        this.f26706c = i9;
    }

    public static a a() {
        return new a(null);
    }

    public abstract void b(a.b bVar, TaskCompletionSource taskCompletionSource);

    public boolean c() {
        return this.f26705b;
    }

    public final int d() {
        return this.f26706c;
    }

    public final C2916d[] e() {
        return this.f26704a;
    }
}
