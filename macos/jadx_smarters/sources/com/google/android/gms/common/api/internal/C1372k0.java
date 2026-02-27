package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.C1371k;
import com.google.android.gms.common.internal.AbstractC1418q;
import com.google.android.gms.tasks.TaskCompletionSource;
import d.AbstractC1617D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import s.C2695a;
import w4.C2914b;
import w4.C2916d;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1372k0 implements GoogleApiClient.b, GoogleApiClient.c, f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.f f26649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1353b f26650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1400z f26651e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f26654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final J0 f26655i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f26656j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1363g f26660n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Queue f26648a = new LinkedList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f26652f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f26653g = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f26657k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C2914b f26658l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f26659m = 0;

    public C1372k0(C1363g c1363g, com.google.android.gms.common.api.e eVar) {
        this.f26660n = c1363g;
        a.f fVarZab = eVar.zab(c1363g.f26633o.getLooper(), this);
        this.f26649c = fVarZab;
        this.f26650d = eVar.getApiKey();
        this.f26651e = new C1400z();
        this.f26654h = eVar.zaa();
        if (fVarZab.requiresSignIn()) {
            this.f26655i = eVar.zac(c1363g.f26624f, c1363g.f26633o);
        } else {
            this.f26655i = null;
        }
    }

    public static /* bridge */ /* synthetic */ void y(C1372k0 c1372k0, C1376m0 c1376m0) {
        if (c1372k0.f26657k.contains(c1376m0) && !c1372k0.f26656j) {
            if (c1372k0.f26649c.isConnected()) {
                c1372k0.g();
            } else {
                c1372k0.C();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void z(C1372k0 c1372k0, C1376m0 c1376m0) {
        C2916d[] c2916dArrG;
        if (c1372k0.f26657k.remove(c1376m0)) {
            c1372k0.f26660n.f26633o.removeMessages(15, c1376m0);
            c1372k0.f26660n.f26633o.removeMessages(16, c1376m0);
            C2916d c2916d = c1376m0.f26670b;
            ArrayList arrayList = new ArrayList(c1372k0.f26648a.size());
            for (V0 v02 : c1372k0.f26648a) {
                if ((v02 instanceof AbstractC1391u0) && (c2916dArrG = ((AbstractC1391u0) v02).g(c1372k0)) != null && C4.b.b(c2916dArrG, c2916d)) {
                    arrayList.add(v02);
                }
            }
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                V0 v03 = (V0) arrayList.get(i9);
                c1372k0.f26648a.remove(v03);
                v03.b(new com.google.android.gms.common.api.l(c2916d));
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.f1
    public final void A(C2914b c2914b, com.google.android.gms.common.api.a aVar, boolean z9) {
        throw null;
    }

    public final void B() {
        com.google.android.gms.common.internal.r.d(this.f26660n.f26633o);
        this.f26658l = null;
    }

    public final void C() {
        C2914b c2914b;
        com.google.android.gms.common.internal.r.d(this.f26660n.f26633o);
        if (this.f26649c.isConnected() || this.f26649c.isConnecting()) {
            return;
        }
        try {
            C1363g c1363g = this.f26660n;
            int iB = c1363g.f26626h.b(c1363g.f26624f, this.f26649c);
            if (iB != 0) {
                C2914b c2914b2 = new C2914b(iB, null);
                Log.w("GoogleApiManager", "The service for " + this.f26649c.getClass().getName() + " is not available: " + c2914b2.toString());
                F(c2914b2, null);
                return;
            }
            C1363g c1363g2 = this.f26660n;
            a.f fVar = this.f26649c;
            C1380o0 c1380o0 = new C1380o0(c1363g2, fVar, this.f26650d);
            if (fVar.requiresSignIn()) {
                ((J0) com.google.android.gms.common.internal.r.m(this.f26655i)).c0(c1380o0);
            }
            try {
                this.f26649c.connect(c1380o0);
                return;
            } catch (SecurityException e9) {
                e = e9;
                c2914b = new C2914b(10);
            }
        } catch (IllegalStateException e10) {
            e = e10;
            c2914b = new C2914b(10);
        }
        F(c2914b, e);
    }

    public final void D(V0 v02) {
        com.google.android.gms.common.internal.r.d(this.f26660n.f26633o);
        if (this.f26649c.isConnected()) {
            if (m(v02)) {
                j();
                return;
            } else {
                this.f26648a.add(v02);
                return;
            }
        }
        this.f26648a.add(v02);
        C2914b c2914b = this.f26658l;
        if (c2914b == null || !c2914b.K()) {
            C();
        } else {
            F(this.f26658l, null);
        }
    }

    public final void E() {
        this.f26659m++;
    }

    public final void F(C2914b c2914b, Exception exc) {
        com.google.android.gms.common.internal.r.d(this.f26660n.f26633o);
        J0 j02 = this.f26655i;
        if (j02 != null) {
            j02.c1();
        }
        B();
        this.f26660n.f26626h.c();
        d(c2914b);
        if ((this.f26649c instanceof z4.e) && c2914b.H() != 24) {
            this.f26660n.f26621c = true;
            C1363g c1363g = this.f26660n;
            c1363g.f26633o.sendMessageDelayed(c1363g.f26633o.obtainMessage(19), 300000L);
        }
        if (c2914b.H() == 4) {
            e(C1363g.f26617r);
            return;
        }
        if (this.f26648a.isEmpty()) {
            this.f26658l = c2914b;
            return;
        }
        if (exc != null) {
            com.google.android.gms.common.internal.r.d(this.f26660n.f26633o);
            f(null, exc, false);
            return;
        }
        if (!this.f26660n.f26634p) {
            e(C1363g.f(this.f26650d, c2914b));
            return;
        }
        f(C1363g.f(this.f26650d, c2914b), null, true);
        if (this.f26648a.isEmpty() || n(c2914b) || this.f26660n.e(c2914b, this.f26654h)) {
            return;
        }
        if (c2914b.H() == 18) {
            this.f26656j = true;
        }
        if (!this.f26656j) {
            e(C1363g.f(this.f26650d, c2914b));
            return;
        }
        C1363g c1363g2 = this.f26660n;
        c1363g2.f26633o.sendMessageDelayed(Message.obtain(c1363g2.f26633o, 9, this.f26650d), 5000L);
    }

    public final void G(C2914b c2914b) {
        com.google.android.gms.common.internal.r.d(this.f26660n.f26633o);
        a.f fVar = this.f26649c;
        fVar.disconnect("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(c2914b));
        F(c2914b, null);
    }

    public final void H() {
        com.google.android.gms.common.internal.r.d(this.f26660n.f26633o);
        if (this.f26656j) {
            C();
        }
    }

    public final void I() {
        com.google.android.gms.common.internal.r.d(this.f26660n.f26633o);
        e(C1363g.f26616q);
        this.f26651e.f();
        for (C1371k.a aVar : (C1371k.a[]) this.f26653g.keySet().toArray(new C1371k.a[0])) {
            D(new U0(aVar, new TaskCompletionSource()));
        }
        d(new C2914b(4));
        if (this.f26649c.isConnected()) {
            this.f26649c.onUserSignOut(new C1370j0(this));
        }
    }

    public final void J() {
        com.google.android.gms.common.internal.r.d(this.f26660n.f26633o);
        if (this.f26656j) {
            l();
            C1363g c1363g = this.f26660n;
            e(c1363g.f26625g.i(c1363g.f26624f) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f26649c.disconnect("Timing out connection while resuming.");
        }
    }

    public final boolean a() {
        return this.f26649c.requiresSignIn();
    }

    public final boolean b() {
        return o(true);
    }

    public final C2916d c(C2916d[] c2916dArr) {
        if (c2916dArr != null && c2916dArr.length != 0) {
            C2916d[] availableFeatures = this.f26649c.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new C2916d[0];
            }
            C2695a c2695a = new C2695a(availableFeatures.length);
            for (C2916d c2916d : availableFeatures) {
                c2695a.put(c2916d.getName(), Long.valueOf(c2916d.H()));
            }
            for (C2916d c2916d2 : c2916dArr) {
                Long l9 = (Long) c2695a.get(c2916d2.getName());
                if (l9 == null || l9.longValue() < c2916d2.H()) {
                    return c2916d2;
                }
            }
        }
        return null;
    }

    public final void d(C2914b c2914b) {
        Iterator it = this.f26652f.iterator();
        if (!it.hasNext()) {
            this.f26652f.clear();
            return;
        }
        AbstractC1617D.a(it.next());
        if (AbstractC1418q.b(c2914b, C2914b.f51646j)) {
            this.f26649c.getEndpointPackageName();
        }
        throw null;
    }

    public final void e(Status status) {
        com.google.android.gms.common.internal.r.d(this.f26660n.f26633o);
        f(status, null, false);
    }

    public final void f(Status status, Exception exc, boolean z9) {
        com.google.android.gms.common.internal.r.d(this.f26660n.f26633o);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f26648a.iterator();
        while (it.hasNext()) {
            V0 v02 = (V0) it.next();
            if (!z9 || v02.f26542a == 2) {
                if (status != null) {
                    v02.a(status);
                } else {
                    v02.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void g() {
        ArrayList arrayList = new ArrayList(this.f26648a);
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            V0 v02 = (V0) arrayList.get(i9);
            if (!this.f26649c.isConnected()) {
                return;
            }
            if (m(v02)) {
                this.f26648a.remove(v02);
            }
        }
    }

    public final void h() {
        B();
        d(C2914b.f51646j);
        l();
        Iterator it = this.f26653g.values().iterator();
        while (it.hasNext()) {
            A0 a02 = (A0) it.next();
            if (c(a02.f26459a.c()) == null) {
                try {
                    a02.f26459a.d(this.f26649c, new TaskCompletionSource());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.f26649c.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
            it.remove();
        }
        g();
        j();
    }

    public final void i(int i9) {
        B();
        this.f26656j = true;
        this.f26651e.e(i9, this.f26649c.getLastDisconnectMessage());
        C1353b c1353b = this.f26650d;
        C1363g c1363g = this.f26660n;
        c1363g.f26633o.sendMessageDelayed(Message.obtain(c1363g.f26633o, 9, c1353b), 5000L);
        C1353b c1353b2 = this.f26650d;
        C1363g c1363g2 = this.f26660n;
        c1363g2.f26633o.sendMessageDelayed(Message.obtain(c1363g2.f26633o, 11, c1353b2), 120000L);
        this.f26660n.f26626h.c();
        Iterator it = this.f26653g.values().iterator();
        while (it.hasNext()) {
            ((A0) it.next()).f26461c.run();
        }
    }

    public final void j() {
        this.f26660n.f26633o.removeMessages(12, this.f26650d);
        C1353b c1353b = this.f26650d;
        C1363g c1363g = this.f26660n;
        c1363g.f26633o.sendMessageDelayed(c1363g.f26633o.obtainMessage(12, c1353b), this.f26660n.f26620a);
    }

    public final void k(V0 v02) {
        v02.d(this.f26651e, a());
        try {
            v02.c(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.f26649c.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    public final void l() {
        if (this.f26656j) {
            C1363g c1363g = this.f26660n;
            c1363g.f26633o.removeMessages(11, this.f26650d);
            C1363g c1363g2 = this.f26660n;
            c1363g2.f26633o.removeMessages(9, this.f26650d);
            this.f26656j = false;
        }
    }

    public final boolean m(V0 v02) {
        if (!(v02 instanceof AbstractC1391u0)) {
            k(v02);
            return true;
        }
        AbstractC1391u0 abstractC1391u0 = (AbstractC1391u0) v02;
        C2916d c2916dC = c(abstractC1391u0.g(this));
        if (c2916dC == null) {
            k(v02);
            return true;
        }
        Log.w("GoogleApiManager", this.f26649c.getClass().getName() + " could not execute call because it requires feature (" + c2916dC.getName() + ", " + c2916dC.H() + ").");
        if (!this.f26660n.f26634p || !abstractC1391u0.f(this)) {
            abstractC1391u0.b(new com.google.android.gms.common.api.l(c2916dC));
            return true;
        }
        C1376m0 c1376m0 = new C1376m0(this.f26650d, c2916dC, null);
        int iIndexOf = this.f26657k.indexOf(c1376m0);
        if (iIndexOf >= 0) {
            C1376m0 c1376m02 = (C1376m0) this.f26657k.get(iIndexOf);
            this.f26660n.f26633o.removeMessages(15, c1376m02);
            C1363g c1363g = this.f26660n;
            c1363g.f26633o.sendMessageDelayed(Message.obtain(c1363g.f26633o, 15, c1376m02), 5000L);
            return false;
        }
        this.f26657k.add(c1376m0);
        C1363g c1363g2 = this.f26660n;
        c1363g2.f26633o.sendMessageDelayed(Message.obtain(c1363g2.f26633o, 15, c1376m0), 5000L);
        C1363g c1363g3 = this.f26660n;
        c1363g3.f26633o.sendMessageDelayed(Message.obtain(c1363g3.f26633o, 16, c1376m0), 120000L);
        C2914b c2914b = new C2914b(2, null);
        if (n(c2914b)) {
            return false;
        }
        this.f26660n.e(c2914b, this.f26654h);
        return false;
    }

    public final boolean n(C2914b c2914b) {
        synchronized (C1363g.f26618s) {
            try {
                C1363g c1363g = this.f26660n;
                if (c1363g.f26630l == null || !c1363g.f26631m.contains(this.f26650d)) {
                    return false;
                }
                this.f26660n.f26630l.h(c2914b, this.f26654h);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean o(boolean z9) {
        com.google.android.gms.common.internal.r.d(this.f26660n.f26633o);
        if (!this.f26649c.isConnected() || !this.f26653g.isEmpty()) {
            return false;
        }
        if (!this.f26651e.g()) {
            this.f26649c.disconnect("Timing out service connection.");
            return true;
        }
        if (!z9) {
            return false;
        }
        j();
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1361f
    public final void onConnected(Bundle bundle) {
        if (Looper.myLooper() == this.f26660n.f26633o.getLooper()) {
            h();
        } else {
            this.f26660n.f26633o.post(new RunnableC1364g0(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1377n
    public final void onConnectionFailed(C2914b c2914b) {
        F(c2914b, null);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1361f
    public final void onConnectionSuspended(int i9) {
        if (Looper.myLooper() == this.f26660n.f26633o.getLooper()) {
            i(i9);
        } else {
            this.f26660n.f26633o.post(new RunnableC1366h0(this, i9));
        }
    }

    public final int p() {
        return this.f26654h;
    }

    public final int q() {
        return this.f26659m;
    }

    public final a.f s() {
        return this.f26649c;
    }

    public final Map u() {
        return this.f26653g;
    }
}
