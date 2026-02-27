package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C1371k;
import w4.C2916d;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1381p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1379o f26690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1392v f26691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f26692c;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.p$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InterfaceC1383q f26693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InterfaceC1383q f26694b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C1371k f26696d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C2916d[] f26697e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f26699g;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Runnable f26695c = new Runnable() { // from class: com.google.android.gms.common.api.internal.B0
            @Override // java.lang.Runnable
            public final void run() {
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f26698f = true;

        public /* synthetic */ a(E0 e02) {
        }

        public C1381p a() {
            com.google.android.gms.common.internal.r.b(this.f26693a != null, "Must set register function");
            com.google.android.gms.common.internal.r.b(this.f26694b != null, "Must set unregister function");
            com.google.android.gms.common.internal.r.b(this.f26696d != null, "Must set holder");
            return new C1381p(new C0(this, this.f26696d, this.f26697e, this.f26698f, this.f26699g), new D0(this, (C1371k.a) com.google.android.gms.common.internal.r.n(this.f26696d.b(), "Key must not be null")), this.f26695c, null);
        }

        public a b(InterfaceC1383q interfaceC1383q) {
            this.f26693a = interfaceC1383q;
            return this;
        }

        public a c(C2916d... c2916dArr) {
            this.f26697e = c2916dArr;
            return this;
        }

        public a d(int i9) {
            this.f26699g = i9;
            return this;
        }

        public a e(InterfaceC1383q interfaceC1383q) {
            this.f26694b = interfaceC1383q;
            return this;
        }

        public a f(C1371k c1371k) {
            this.f26696d = c1371k;
            return this;
        }
    }

    public /* synthetic */ C1381p(AbstractC1379o abstractC1379o, AbstractC1392v abstractC1392v, Runnable runnable, F0 f02) {
        this.f26690a = abstractC1379o;
        this.f26691b = abstractC1392v;
        this.f26692c = runnable;
    }

    public static a a() {
        return new a(null);
    }
}
