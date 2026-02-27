package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import java.util.Iterator;
import java.util.Set;
import w4.C2914b;

/* JADX INFO: loaded from: classes3.dex */
public final class F implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1356c0 f26470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26471b = false;

    public F(C1356c0 c1356c0) {
        this.f26470a = c1356c0;
    }

    @Override // com.google.android.gms.common.api.internal.Z
    public final void a(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.Z
    public final void b() {
    }

    @Override // com.google.android.gms.common.api.internal.Z
    public final void c() {
        if (this.f26471b) {
            this.f26471b = false;
            this.f26470a.l(new E(this, this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.Z
    public final void d(C2914b c2914b, com.google.android.gms.common.api.a aVar, boolean z9) {
    }

    @Override // com.google.android.gms.common.api.internal.Z
    public final void e(int i9) {
        this.f26470a.k(null);
        this.f26470a.f26609p.c(i9, this.f26471b);
    }

    @Override // com.google.android.gms.common.api.internal.Z
    public final AbstractC1357d f(AbstractC1357d abstractC1357d) {
        h(abstractC1357d);
        return abstractC1357d;
    }

    @Override // com.google.android.gms.common.api.internal.Z
    public final boolean g() {
        if (this.f26471b) {
            return false;
        }
        Set set = this.f26470a.f26608o.f26571w;
        if (set == null || set.isEmpty()) {
            this.f26470a.k(null);
            return true;
        }
        this.f26471b = true;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((O0) it.next()).f();
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.Z
    public final AbstractC1357d h(AbstractC1357d abstractC1357d) {
        try {
            this.f26470a.f26608o.f26572x.a(abstractC1357d);
            Y y9 = this.f26470a.f26608o;
            a.f fVar = (a.f) y9.f26563o.get(abstractC1357d.getClientKey());
            com.google.android.gms.common.internal.r.n(fVar, "Appropriate Api was not requested.");
            if (fVar.isConnected() || !this.f26470a.f26601h.containsKey(abstractC1357d.getClientKey())) {
                abstractC1357d.run(fVar);
            } else {
                abstractC1357d.setFailedResult(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.f26470a.l(new D(this, this));
        }
        return abstractC1357d;
    }
}
