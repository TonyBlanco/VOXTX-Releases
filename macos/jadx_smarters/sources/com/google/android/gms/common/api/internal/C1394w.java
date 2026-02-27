package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C1406e;
import com.google.android.gms.internal.base.zap;
import d.AbstractC1617D;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import s.C2695a;
import w4.C2914b;
import w4.C2921i;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1394w implements InterfaceC1393v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26712a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Y f26713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Looper f26714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1356c0 f26715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1356c0 f26716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f26717g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a.f f26719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Bundle f26720j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lock f26724n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f26718h = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C2914b f26721k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C2914b f26722l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f26723m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f26725o = 0;

    public C1394w(Context context, Y y9, Lock lock, Looper looper, C2921i c2921i, Map map, Map map2, C1406e c1406e, a.AbstractC0252a abstractC0252a, a.f fVar, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.f26712a = context;
        this.f26713c = y9;
        this.f26724n = lock;
        this.f26714d = looper;
        this.f26719i = fVar;
        this.f26715e = new C1356c0(context, y9, lock, looper, c2921i, map2, null, map4, null, arrayList2, new h1(this, null));
        this.f26716f = new C1356c0(context, y9, lock, looper, c2921i, map, c1406e, map3, abstractC0252a, arrayList, new j1(this, null));
        C2695a c2695a = new C2695a();
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            c2695a.put((a.c) it.next(), this.f26715e);
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            c2695a.put((a.c) it2.next(), this.f26716f);
        }
        this.f26717g = Collections.unmodifiableMap(c2695a);
    }

    public static boolean k(C2914b c2914b) {
        return c2914b != null && c2914b.L();
    }

    public static C1394w m(Context context, Y y9, Lock lock, Looper looper, C2921i c2921i, Map map, C1406e c1406e, Map map2, a.AbstractC0252a abstractC0252a, ArrayList arrayList) {
        C2695a c2695a = new C2695a();
        C2695a c2695a2 = new C2695a();
        a.f fVar = null;
        for (Map.Entry entry : map.entrySet()) {
            a.f fVar2 = (a.f) entry.getValue();
            if (true == fVar2.providesSignIn()) {
                fVar = fVar2;
            }
            boolean zRequiresSignIn = fVar2.requiresSignIn();
            a.c cVar = (a.c) entry.getKey();
            if (zRequiresSignIn) {
                c2695a.put(cVar, fVar2);
            } else {
                c2695a2.put(cVar, fVar2);
            }
        }
        com.google.android.gms.common.internal.r.q(!c2695a.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C2695a c2695a3 = new C2695a();
        C2695a c2695a4 = new C2695a();
        for (com.google.android.gms.common.api.a aVar : map2.keySet()) {
            a.c cVarB = aVar.b();
            if (c2695a.containsKey(cVarB)) {
                c2695a3.put(aVar, (Boolean) map2.get(aVar));
            } else {
                if (!c2695a2.containsKey(cVarB)) {
                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                c2695a4.put(aVar, (Boolean) map2.get(aVar));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            e1 e1Var = (e1) arrayList.get(i9);
            if (c2695a3.containsKey(e1Var.f26612a)) {
                arrayList2.add(e1Var);
            } else {
                if (!c2695a4.containsKey(e1Var.f26612a)) {
                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                arrayList3.add(e1Var);
            }
        }
        return new C1394w(context, y9, lock, looper, c2921i, c2695a, c2695a2, c1406e, abstractC0252a, fVar, arrayList2, arrayList3, c2695a3, c2695a4);
    }

    public static /* bridge */ /* synthetic */ void t(C1394w c1394w, int i9, boolean z9) {
        c1394w.f26713c.c(i9, z9);
        c1394w.f26722l = null;
        c1394w.f26721k = null;
    }

    public static /* bridge */ /* synthetic */ void u(C1394w c1394w, Bundle bundle) {
        Bundle bundle2 = c1394w.f26720j;
        if (bundle2 == null) {
            c1394w.f26720j = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    public static /* bridge */ /* synthetic */ void v(C1394w c1394w) {
        C2914b c2914b;
        if (!k(c1394w.f26721k)) {
            if (c1394w.f26721k != null && k(c1394w.f26722l)) {
                c1394w.f26716f.b();
                c1394w.g((C2914b) com.google.android.gms.common.internal.r.m(c1394w.f26721k));
                return;
            }
            C2914b c2914b2 = c1394w.f26721k;
            if (c2914b2 == null || (c2914b = c1394w.f26722l) == null) {
                return;
            }
            if (c1394w.f26716f.f26607n < c1394w.f26715e.f26607n) {
                c2914b2 = c2914b;
            }
            c1394w.g(c2914b2);
            return;
        }
        if (k(c1394w.f26722l) || c1394w.i()) {
            int i9 = c1394w.f26725o;
            if (i9 == 1) {
                c1394w.h();
            } else if (i9 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
            } else {
                ((Y) com.google.android.gms.common.internal.r.m(c1394w.f26713c)).a(c1394w.f26720j);
                c1394w.h();
            }
            c1394w.f26725o = 0;
            return;
        }
        C2914b c2914b3 = c1394w.f26722l;
        if (c2914b3 != null) {
            if (c1394w.f26725o == 1) {
                c1394w.h();
            } else {
                c1394w.g(c2914b3);
                c1394w.f26715e.b();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1393v0
    public final void a() {
        this.f26725o = 2;
        this.f26723m = false;
        this.f26722l = null;
        this.f26721k = null;
        this.f26715e.a();
        this.f26716f.a();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1393v0
    public final void b() {
        this.f26722l = null;
        this.f26721k = null;
        this.f26725o = 0;
        this.f26715e.b();
        this.f26716f.b();
        h();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1393v0
    public final void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f26716f.c(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f26715e.c(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1393v0
    public final AbstractC1357d d(AbstractC1357d abstractC1357d) {
        if (!j(abstractC1357d)) {
            this.f26715e.d(abstractC1357d);
            return abstractC1357d;
        }
        if (i()) {
            abstractC1357d.setFailedResult(new Status(4, (String) null, x()));
            return abstractC1357d;
        }
        this.f26716f.d(abstractC1357d);
        return abstractC1357d;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @Override // com.google.android.gms.common.api.internal.InterfaceC1393v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.f26724n
            r0.lock()
            com.google.android.gms.common.api.internal.c0 r0 = r3.f26715e     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.e()     // Catch: java.lang.Throwable -> L23
            r1 = 0
            if (r0 == 0) goto L25
            com.google.android.gms.common.api.internal.c0 r0 = r3.f26716f     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.e()     // Catch: java.lang.Throwable -> L23
            r2 = 1
            if (r0 != 0) goto L21
            boolean r0 = r3.i()     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L21
            int r0 = r3.f26725o     // Catch: java.lang.Throwable -> L23
            if (r0 != r2) goto L25
        L21:
            r1 = 1
            goto L25
        L23:
            r0 = move-exception
            goto L2b
        L25:
            java.util.concurrent.locks.Lock r0 = r3.f26724n
            r0.unlock()
            return r1
        L2b:
            java.util.concurrent.locks.Lock r1 = r3.f26724n
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C1394w.e():boolean");
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1393v0
    public final AbstractC1357d f(AbstractC1357d abstractC1357d) {
        if (!j(abstractC1357d)) {
            return this.f26715e.f(abstractC1357d);
        }
        if (!i()) {
            return this.f26716f.f(abstractC1357d);
        }
        abstractC1357d.setFailedResult(new Status(4, (String) null, x()));
        return abstractC1357d;
    }

    public final void g(C2914b c2914b) {
        int i9 = this.f26725o;
        if (i9 == 1) {
            h();
        } else if (i9 != 2) {
            Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
        } else {
            this.f26713c.b(c2914b);
            h();
        }
        this.f26725o = 0;
    }

    public final void h() {
        Iterator it = this.f26718h.iterator();
        if (it.hasNext()) {
            AbstractC1617D.a(it.next());
            throw null;
        }
        this.f26718h.clear();
    }

    public final boolean i() {
        C2914b c2914b = this.f26722l;
        return c2914b != null && c2914b.H() == 4;
    }

    public final boolean j(AbstractC1357d abstractC1357d) {
        C1356c0 c1356c0 = (C1356c0) this.f26717g.get(abstractC1357d.getClientKey());
        com.google.android.gms.common.internal.r.n(c1356c0, "GoogleApiClient is not configured to use the API required for this call.");
        return c1356c0.equals(this.f26716f);
    }

    public final PendingIntent x() {
        a.f fVar = this.f26719i;
        if (fVar == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f26712a, System.identityHashCode(this.f26713c), fVar.getSignInIntent(), zap.zaa | 134217728);
    }
}
