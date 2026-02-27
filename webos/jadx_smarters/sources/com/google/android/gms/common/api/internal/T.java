package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C1406e;
import com.google.android.gms.common.internal.InterfaceC1412k;
import d.AbstractC1617D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import w4.C2914b;
import w4.C2921i;

/* JADX INFO: loaded from: classes3.dex */
public final class T implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1356c0 f26515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lock f26516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f26517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2921i f26518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2914b f26519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26520f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26522h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public O4.e f26525k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f26526l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f26527m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f26528n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC1412k f26529o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f26530p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f26531q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1406e f26532r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Map f26533s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a.AbstractC0252a f26534t;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26521g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f26523i = new Bundle();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f26524j = new HashSet();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f26535u = new ArrayList();

    public T(C1356c0 c1356c0, C1406e c1406e, Map map, C2921i c2921i, a.AbstractC0252a abstractC0252a, Lock lock, Context context) {
        this.f26515a = c1356c0;
        this.f26532r = c1406e;
        this.f26533s = map;
        this.f26518d = c2921i;
        this.f26534t = abstractC0252a;
        this.f26516b = lock;
        this.f26517c = context;
    }

    public static /* bridge */ /* synthetic */ void B(T t9, P4.l lVar) {
        if (t9.o(0)) {
            C2914b c2914bH = lVar.H();
            if (!c2914bH.L()) {
                if (!t9.q(c2914bH)) {
                    t9.l(c2914bH);
                    return;
                } else {
                    t9.i();
                    t9.n();
                    return;
                }
            }
            com.google.android.gms.common.internal.P p9 = (com.google.android.gms.common.internal.P) com.google.android.gms.common.internal.r.m(lVar.I());
            C2914b c2914bH2 = p9.H();
            if (!c2914bH2.L()) {
                String strValueOf = String.valueOf(c2914bH2);
                Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                t9.l(c2914bH2);
                return;
            }
            t9.f26528n = true;
            t9.f26529o = (InterfaceC1412k) com.google.android.gms.common.internal.r.m(p9.I());
            t9.f26530p = p9.J();
            t9.f26531q = p9.K();
            t9.n();
        }
    }

    public static final String r(int i9) {
        return i9 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    public static /* bridge */ /* synthetic */ Set y(T t9) {
        C1406e c1406e = t9.f26532r;
        if (c1406e == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(c1406e.f());
        Map mapJ = t9.f26532r.j();
        for (com.google.android.gms.common.api.a aVar : mapJ.keySet()) {
            C1356c0 c1356c0 = t9.f26515a;
            if (!c1356c0.f26601h.containsKey(aVar.b())) {
                AbstractC1617D.a(mapJ.get(aVar));
                throw null;
            }
        }
        return hashSet;
    }

    public final void J() {
        ArrayList arrayList = this.f26535u;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((Future) arrayList.get(i9)).cancel(true);
        }
        this.f26535u.clear();
    }

    @Override // com.google.android.gms.common.api.internal.Z
    public final void a(Bundle bundle) {
        if (o(1)) {
            if (bundle != null) {
                this.f26523i.putAll(bundle);
            }
            if (p()) {
                k();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [O4.e, com.google.android.gms.common.api.a$f] */
    @Override // com.google.android.gms.common.api.internal.Z
    public final void b() {
        this.f26515a.f26601h.clear();
        this.f26527m = false;
        O o9 = null;
        this.f26519e = null;
        this.f26521g = 0;
        this.f26526l = true;
        this.f26528n = false;
        this.f26530p = false;
        HashMap map = new HashMap();
        boolean z9 = false;
        for (com.google.android.gms.common.api.a aVar : this.f26533s.keySet()) {
            a.f fVar = (a.f) com.google.android.gms.common.internal.r.m((a.f) this.f26515a.f26600g.get(aVar.b()));
            z9 |= aVar.c().getPriority() == 1;
            boolean zBooleanValue = ((Boolean) this.f26533s.get(aVar)).booleanValue();
            if (fVar.requiresSignIn()) {
                this.f26527m = true;
                if (zBooleanValue) {
                    this.f26524j.add(aVar.b());
                } else {
                    this.f26526l = false;
                }
            }
            map.put(fVar, new H(this, aVar, zBooleanValue));
        }
        if (z9) {
            this.f26527m = false;
        }
        if (this.f26527m) {
            com.google.android.gms.common.internal.r.m(this.f26532r);
            com.google.android.gms.common.internal.r.m(this.f26534t);
            this.f26532r.k(Integer.valueOf(System.identityHashCode(this.f26515a.f26608o)));
            P p9 = new P(this, o9);
            a.AbstractC0252a abstractC0252a = this.f26534t;
            Context context = this.f26517c;
            C1356c0 c1356c0 = this.f26515a;
            C1406e c1406e = this.f26532r;
            this.f26525k = abstractC0252a.buildClient(context, c1356c0.f26608o.i(), c1406e, (Object) c1406e.g(), (GoogleApiClient.b) p9, (GoogleApiClient.c) p9);
        }
        this.f26522h = this.f26515a.f26600g.size();
        this.f26535u.add(AbstractC1358d0.a().submit(new K(this, map)));
    }

    @Override // com.google.android.gms.common.api.internal.Z
    public final void c() {
    }

    @Override // com.google.android.gms.common.api.internal.Z
    public final void d(C2914b c2914b, com.google.android.gms.common.api.a aVar, boolean z9) {
        if (o(1)) {
            m(c2914b, aVar, z9);
            if (p()) {
                k();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.Z
    public final void e(int i9) {
        l(new C2914b(8, null));
    }

    @Override // com.google.android.gms.common.api.internal.Z
    public final AbstractC1357d f(AbstractC1357d abstractC1357d) {
        this.f26515a.f26608o.f26556h.add(abstractC1357d);
        return abstractC1357d;
    }

    @Override // com.google.android.gms.common.api.internal.Z
    public final boolean g() {
        J();
        j(true);
        this.f26515a.k(null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.Z
    public final AbstractC1357d h(AbstractC1357d abstractC1357d) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void i() {
        this.f26527m = false;
        this.f26515a.f26608o.f26564p = Collections.emptySet();
        for (a.c cVar : this.f26524j) {
            if (!this.f26515a.f26601h.containsKey(cVar)) {
                C1356c0 c1356c0 = this.f26515a;
                c1356c0.f26601h.put(cVar, new C2914b(17, null));
            }
        }
    }

    public final void j(boolean z9) {
        O4.e eVar = this.f26525k;
        if (eVar != null) {
            if (eVar.isConnected() && z9) {
                eVar.b();
            }
            eVar.disconnect();
            this.f26529o = null;
        }
    }

    public final void k() {
        this.f26515a.i();
        AbstractC1358d0.a().execute(new G(this));
        O4.e eVar = this.f26525k;
        if (eVar != null) {
            if (this.f26530p) {
                eVar.e((InterfaceC1412k) com.google.android.gms.common.internal.r.m(this.f26529o), this.f26531q);
            }
            j(false);
        }
        Iterator it = this.f26515a.f26601h.keySet().iterator();
        while (it.hasNext()) {
            ((a.f) com.google.android.gms.common.internal.r.m((a.f) this.f26515a.f26600g.get((a.c) it.next()))).disconnect();
        }
        this.f26515a.f26609p.a(this.f26523i.isEmpty() ? null : this.f26523i);
    }

    public final void l(C2914b c2914b) {
        J();
        j(!c2914b.K());
        this.f26515a.k(c2914b);
        this.f26515a.f26609p.b(c2914b);
    }

    public final void m(C2914b c2914b, com.google.android.gms.common.api.a aVar, boolean z9) {
        int priority = aVar.c().getPriority();
        if ((!z9 || c2914b.K() || this.f26518d.c(c2914b.H()) != null) && (this.f26519e == null || priority < this.f26520f)) {
            this.f26519e = c2914b;
            this.f26520f = priority;
        }
        C1356c0 c1356c0 = this.f26515a;
        c1356c0.f26601h.put(aVar.b(), c2914b);
    }

    public final void n() {
        if (this.f26522h != 0) {
            return;
        }
        if (!this.f26527m || this.f26528n) {
            ArrayList arrayList = new ArrayList();
            this.f26521g = 1;
            this.f26522h = this.f26515a.f26600g.size();
            for (a.c cVar : this.f26515a.f26600g.keySet()) {
                if (!this.f26515a.f26601h.containsKey(cVar)) {
                    arrayList.add((a.f) this.f26515a.f26600g.get(cVar));
                } else if (p()) {
                    k();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f26535u.add(AbstractC1358d0.a().submit(new L(this, arrayList)));
        }
    }

    public final boolean o(int i9) {
        if (this.f26521g == i9) {
            return true;
        }
        Log.w("GACConnecting", this.f26515a.f26608o.o());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        Log.w("GACConnecting", "mRemainingConnections=" + this.f26522h);
        Log.e("GACConnecting", "GoogleApiClient connecting is in step " + r(this.f26521g) + " but received callback for step " + r(i9), new Exception());
        l(new C2914b(8, null));
        return false;
    }

    public final boolean p() {
        C2914b c2914b;
        int i9 = this.f26522h - 1;
        this.f26522h = i9;
        if (i9 > 0) {
            return false;
        }
        if (i9 < 0) {
            Log.w("GACConnecting", this.f26515a.f26608o.o());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            c2914b = new C2914b(8, null);
        } else {
            c2914b = this.f26519e;
            if (c2914b == null) {
                return true;
            }
            this.f26515a.f26607n = this.f26520f;
        }
        l(c2914b);
        return false;
    }

    public final boolean q(C2914b c2914b) {
        return this.f26526l && !c2914b.K();
    }
}
