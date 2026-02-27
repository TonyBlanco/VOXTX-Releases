package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.api.GoogleApiClient;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import w4.C2914b;
import w4.C2920h;

/* JADX INFO: loaded from: classes3.dex */
public final class X0 extends b1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray f26549f;

    public X0(InterfaceC1369j interfaceC1369j) {
        super(interfaceC1369j, C2920h.q());
        this.f26549f = new SparseArray();
        this.mLifecycleFragment.f("AutoManageHelper", this);
    }

    public static X0 i(C1367i c1367i) {
        InterfaceC1369j fragment = LifecycleCallback.getFragment(c1367i);
        X0 x02 = (X0) fragment.g("AutoManageHelper", X0.class);
        return x02 != null ? x02 : new X0(fragment);
    }

    @Override // com.google.android.gms.common.api.internal.b1
    public final void b(C2914b c2914b, int i9) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i9 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        W0 w02 = (W0) this.f26549f.get(i9);
        if (w02 != null) {
            k(i9);
            GoogleApiClient.c cVar = w02.f26546d;
            if (cVar != null) {
                cVar.onConnectionFailed(c2914b);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.b1
    public final void c() {
        for (int i9 = 0; i9 < this.f26549f.size(); i9++) {
            W0 w0L = l(i9);
            if (w0L != null) {
                w0L.f26545c.connect();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i9 = 0; i9 < this.f26549f.size(); i9++) {
            W0 w0L = l(i9);
            if (w0L != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(w0L.f26544a);
                printWriter.println(":");
                w0L.f26545c.d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    public final void j(int i9, GoogleApiClient googleApiClient, GoogleApiClient.c cVar) {
        com.google.android.gms.common.internal.r.n(googleApiClient, "GoogleApiClient instance cannot be null");
        com.google.android.gms.common.internal.r.q(this.f26549f.indexOfKey(i9) < 0, "Already managing a GoogleApiClient with id " + i9);
        Y0 y02 = (Y0) this.f26587c.get();
        Log.d("AutoManageHelper", "starting AutoManage for client " + i9 + " " + this.f26586a + " " + String.valueOf(y02));
        W0 w02 = new W0(this, i9, googleApiClient, cVar);
        googleApiClient.k(w02);
        this.f26549f.put(i9, w02);
        if (this.f26586a && y02 == null) {
            Log.d("AutoManageHelper", "connecting ".concat(googleApiClient.toString()));
            googleApiClient.connect();
        }
    }

    public final void k(int i9) {
        W0 w02 = (W0) this.f26549f.get(i9);
        this.f26549f.remove(i9);
        if (w02 != null) {
            w02.f26545c.l(w02);
            w02.f26545c.disconnect();
        }
    }

    public final W0 l(int i9) {
        if (this.f26549f.size() <= i9) {
            return null;
        }
        SparseArray sparseArray = this.f26549f;
        return (W0) sparseArray.get(sparseArray.keyAt(i9));
    }

    @Override // com.google.android.gms.common.api.internal.b1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        SparseArray sparseArray = this.f26549f;
        Log.d("AutoManageHelper", "onStart " + this.f26586a + " " + String.valueOf(sparseArray));
        if (this.f26587c.get() == null) {
            for (int i9 = 0; i9 < this.f26549f.size(); i9++) {
                W0 w0L = l(i9);
                if (w0L != null) {
                    w0L.f26545c.connect();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.b1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        for (int i9 = 0; i9 < this.f26549f.size(); i9++) {
            W0 w0L = l(i9);
            if (w0L != null) {
                w0L.f26545c.disconnect();
            }
        }
    }
}
