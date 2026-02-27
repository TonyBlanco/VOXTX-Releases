package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import d.AbstractC1617D;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class O0 extends com.google.android.gms.common.api.k implements com.google.android.gms.common.api.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f26504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M0 f26505f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O0 f26500a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.google.android.gms.common.api.f f26501b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f26502c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Status f26503d = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f26506g = false;

    public O0(WeakReference weakReference) {
        com.google.android.gms.common.internal.r.n(weakReference, "GoogleApiClient reference must not be null");
        this.f26504e = weakReference;
        GoogleApiClient googleApiClient = (GoogleApiClient) weakReference.get();
        this.f26505f = new M0(this, googleApiClient != null ? googleApiClient.i() : Looper.getMainLooper());
    }

    public static final void l(com.google.android.gms.common.api.h hVar) {
    }

    @Override // com.google.android.gms.common.api.i
    public final void a(com.google.android.gms.common.api.h hVar) {
        synchronized (this.f26502c) {
            try {
                if (!hVar.getStatus().L()) {
                    h(hVar.getStatus());
                    l(hVar);
                } else if (k()) {
                    AbstractC1617D.a(com.google.android.gms.common.internal.r.m(null));
                    throw null;
                }
            } finally {
            }
        }
    }

    public final com.google.android.gms.common.api.k b(com.google.android.gms.common.api.j jVar) {
        O0 o02;
        synchronized (this.f26502c) {
            com.google.android.gms.common.internal.r.q(true, "Cannot call then() twice.");
            com.google.android.gms.common.internal.r.q(true, "Cannot call then() and andFinally() on the same TransformedResult.");
            o02 = new O0(this.f26504e);
            this.f26500a = o02;
            i();
        }
        return o02;
    }

    public final void f() {
    }

    public final void g(com.google.android.gms.common.api.f fVar) {
        synchronized (this.f26502c) {
            this.f26501b = fVar;
            i();
        }
    }

    public final void h(Status status) {
        synchronized (this.f26502c) {
            this.f26503d = status;
            j(status);
        }
    }

    public final void i() {
    }

    public final void j(Status status) {
        synchronized (this.f26502c) {
            try {
                if (k()) {
                    AbstractC1617D.a(com.google.android.gms.common.internal.r.m(null));
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean k() {
        return false;
    }
}
