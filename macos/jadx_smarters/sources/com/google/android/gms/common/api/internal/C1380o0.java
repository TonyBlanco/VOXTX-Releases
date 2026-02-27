package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.AbstractC1404c;
import com.google.android.gms.common.internal.InterfaceC1412k;
import java.util.Set;
import w4.C2914b;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1380o0 implements AbstractC1404c.InterfaceC0255c, I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.f f26684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1353b f26685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1412k f26686c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f26687d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f26688e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1363g f26689f;

    public C1380o0(C1363g c1363g, a.f fVar, C1353b c1353b) {
        this.f26689f = c1363g;
        this.f26684a = fVar;
        this.f26685b = c1353b;
    }

    @Override // com.google.android.gms.common.api.internal.I0
    public final void a(C2914b c2914b) {
        C1372k0 c1372k0 = (C1372k0) this.f26689f.f26629k.get(this.f26685b);
        if (c1372k0 != null) {
            c1372k0.G(c2914b);
        }
    }

    @Override // com.google.android.gms.common.api.internal.I0
    public final void b(InterfaceC1412k interfaceC1412k, Set set) {
        if (interfaceC1412k == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            a(new C2914b(4));
        } else {
            this.f26686c = interfaceC1412k;
            this.f26687d = set;
            i();
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c.InterfaceC0255c
    public final void c(C2914b c2914b) {
        this.f26689f.f26633o.post(new RunnableC1378n0(this, c2914b));
    }

    @Override // com.google.android.gms.common.api.internal.I0
    public final void d(int i9) {
        C1372k0 c1372k0 = (C1372k0) this.f26689f.f26629k.get(this.f26685b);
        if (c1372k0 != null) {
            if (c1372k0.f26656j) {
                c1372k0.G(new C2914b(17));
            } else {
                c1372k0.onConnectionSuspended(i9);
            }
        }
    }

    public final void i() {
        InterfaceC1412k interfaceC1412k;
        if (!this.f26688e || (interfaceC1412k = this.f26686c) == null) {
            return;
        }
        this.f26684a.getRemoteService(interfaceC1412k, this.f26687d);
    }
}
