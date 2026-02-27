package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C1406e;
import java.util.Set;
import w4.C2914b;

/* JADX INFO: loaded from: classes3.dex */
public final class J0 extends P4.d implements GoogleApiClient.b, GoogleApiClient.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a.AbstractC0252a f26482i = O4.d.f6525c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26483a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f26484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a.AbstractC0252a f26485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f26486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1406e f26487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public O4.e f26488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public I0 f26489h;

    public J0(Context context, Handler handler, C1406e c1406e) {
        a.AbstractC0252a abstractC0252a = f26482i;
        this.f26483a = context;
        this.f26484c = handler;
        this.f26487f = (C1406e) com.google.android.gms.common.internal.r.n(c1406e, "ClientSettings must not be null");
        this.f26486e = c1406e.f();
        this.f26485d = abstractC0252a;
    }

    public static /* bridge */ /* synthetic */ void Z(J0 j02, P4.l lVar) {
        C2914b c2914bH = lVar.H();
        if (c2914bH.L()) {
            com.google.android.gms.common.internal.P p9 = (com.google.android.gms.common.internal.P) com.google.android.gms.common.internal.r.m(lVar.I());
            c2914bH = p9.H();
            if (c2914bH.L()) {
                j02.f26489h.b(p9.I(), j02.f26486e);
            } else {
                String strValueOf = String.valueOf(c2914bH);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                j02.f26489h.a(c2914bH);
            }
        } else {
            j02.f26489h.a(c2914bH);
        }
        j02.f26488g.disconnect();
    }

    @Override // P4.f
    public final void M0(P4.l lVar) {
        this.f26484c.post(new H0(this, lVar));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [O4.e, com.google.android.gms.common.api.a$f] */
    public final void c0(I0 i02) {
        O4.e eVar = this.f26488g;
        if (eVar != null) {
            eVar.disconnect();
        }
        this.f26487f.k(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0252a abstractC0252a = this.f26485d;
        Context context = this.f26483a;
        Handler handler = this.f26484c;
        C1406e c1406e = this.f26487f;
        this.f26488g = abstractC0252a.buildClient(context, handler.getLooper(), c1406e, (Object) c1406e.g(), (GoogleApiClient.b) this, (GoogleApiClient.c) this);
        this.f26489h = i02;
        Set set = this.f26486e;
        if (set == null || set.isEmpty()) {
            this.f26484c.post(new G0(this));
        } else {
            this.f26488g.c();
        }
    }

    public final void c1() {
        O4.e eVar = this.f26488g;
        if (eVar != null) {
            eVar.disconnect();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1361f
    public final void onConnected(Bundle bundle) {
        this.f26488g.d(this);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1377n
    public final void onConnectionFailed(C2914b c2914b) {
        this.f26489h.a(c2914b);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1361f
    public final void onConnectionSuspended(int i9) {
        this.f26489h.d(i9);
    }
}
