package com.google.ads.interactivemedia.v3.internal;

import h4.C1858a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class aoo extends apj {
    public aoo(anw anwVar, agl aglVar, int i9, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anwVar, "dJwO6Cl9MRqD0Gc5K3JTdZycyClQqkAPKU0XDLxQQPeGCWqiQha6f2rP1wtqtwx3", "rLNLoOjJQBnuvnCDgD+yaoADKoI2087E89SpHXw4yFg=", aglVar, i9, 24, null, null, null);
    }

    private final void c() {
        C1858a c1858aG = this.f20468a.g();
        if (c1858aG == null) {
            return;
        }
        try {
            C1858a.C0341a c0341aB = c1858aG.b();
            String strD = aoa.d(c0341aB.a());
            if (strD != null) {
                synchronized (this.f20474g) {
                    this.f20474g.ab(strD);
                    this.f20474g.aa(c0341aB.b());
                    this.f20474g.aL(aft.f19505f);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apj
    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.f20468a.o()) {
            c();
            return;
        }
        synchronized (this.f20474g) {
            this.f20474g.ab((String) this.f20471d.invoke(null, this.f20468a.b()));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apj, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        f();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apj
    public final void f() throws Exception {
        if (this.f20468a.p()) {
            super.f();
        } else if (this.f20468a.o()) {
            c();
        }
    }
}
