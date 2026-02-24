package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.a;
import java.util.Collections;
import java.util.Iterator;
import w4.C2914b;

/* JADX INFO: loaded from: classes3.dex */
public final class U implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1356c0 f26539a;

    public U(C1356c0 c1356c0) {
        this.f26539a = c1356c0;
    }

    @Override // com.google.android.gms.common.api.internal.Z
    public final void a(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.Z
    public final void b() {
        Iterator it = this.f26539a.f26600g.values().iterator();
        while (it.hasNext()) {
            ((a.f) it.next()).disconnect();
        }
        this.f26539a.f26608o.f26564p = Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.internal.Z
    public final void c() {
        this.f26539a.j();
    }

    @Override // com.google.android.gms.common.api.internal.Z
    public final void d(C2914b c2914b, com.google.android.gms.common.api.a aVar, boolean z9) {
    }

    @Override // com.google.android.gms.common.api.internal.Z
    public final void e(int i9) {
    }

    @Override // com.google.android.gms.common.api.internal.Z
    public final AbstractC1357d f(AbstractC1357d abstractC1357d) {
        this.f26539a.f26608o.f26556h.add(abstractC1357d);
        return abstractC1357d;
    }

    @Override // com.google.android.gms.common.api.internal.Z
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.Z
    public final AbstractC1357d h(AbstractC1357d abstractC1357d) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
