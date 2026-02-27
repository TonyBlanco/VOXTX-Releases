package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C1406e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import w4.C2914b;
import w4.C2920h;

/* JADX INFO: loaded from: classes3.dex */
public final class Y extends GoogleApiClient implements InterfaceC1389t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lock f26550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.common.internal.K f26551c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f26554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Looper f26555g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f26557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f26558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f26559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final W f26560l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C2920h f26561m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C1385r0 f26562n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Map f26563o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Set f26564p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1406e f26565q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Map f26566r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a.AbstractC0252a f26567s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C1373l f26568t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f26569u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Integer f26570v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Set f26571w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Q0 f26572x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.google.android.gms.common.internal.J f26573y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1393v0 f26552d = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Queue f26556h = new LinkedList();

    public Y(Context context, Lock lock, Looper looper, C1406e c1406e, C2920h c2920h, a.AbstractC0252a abstractC0252a, Map map, List list, List list2, Map map2, int i9, int i10, ArrayList arrayList) {
        this.f26558j = true != C4.d.a() ? 120000L : 10000L;
        this.f26559k = 5000L;
        this.f26564p = new HashSet();
        this.f26568t = new C1373l();
        this.f26570v = null;
        this.f26571w = null;
        V v9 = new V(this);
        this.f26573y = v9;
        this.f26554f = context;
        this.f26550b = lock;
        this.f26551c = new com.google.android.gms.common.internal.K(looper, v9);
        this.f26555g = looper;
        this.f26560l = new W(this, looper);
        this.f26561m = c2920h;
        this.f26553e = i9;
        if (i9 >= 0) {
            this.f26570v = Integer.valueOf(i10);
        }
        this.f26566r = map;
        this.f26563o = map2;
        this.f26569u = arrayList;
        this.f26572x = new Q0();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f26551c.f((GoogleApiClient.b) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.f26551c.g((GoogleApiClient.c) it2.next());
        }
        this.f26565q = c1406e;
        this.f26567s = abstractC0252a;
    }

    public static int n(Iterable iterable, boolean z9) {
        Iterator it = iterable.iterator();
        boolean zRequiresSignIn = false;
        boolean zProvidesSignIn = false;
        while (it.hasNext()) {
            a.f fVar = (a.f) it.next();
            zRequiresSignIn |= fVar.requiresSignIn();
            zProvidesSignIn |= fVar.providesSignIn();
        }
        if (zRequiresSignIn) {
            return (zProvidesSignIn && z9) ? 2 : 1;
        }
        return 3;
    }

    public static String p(int i9) {
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    public static /* bridge */ /* synthetic */ void q(Y y9) {
        y9.f26550b.lock();
        try {
            if (y9.f26557i) {
                y9.u();
            }
        } finally {
            y9.f26550b.unlock();
        }
    }

    public static /* bridge */ /* synthetic */ void r(Y y9) {
        y9.f26550b.lock();
        try {
            if (y9.s()) {
                y9.u();
            }
        } finally {
            y9.f26550b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1389t0
    public final void a(Bundle bundle) {
        while (!this.f26556h.isEmpty()) {
            f((AbstractC1357d) this.f26556h.remove());
        }
        this.f26551c.d(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1389t0
    public final void b(C2914b c2914b) {
        if (!this.f26561m.k(this.f26554f, c2914b.H())) {
            s();
        }
        if (this.f26557i) {
            return;
        }
        this.f26551c.c(c2914b);
        this.f26551c.a();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1389t0
    public final void c(int i9, boolean z9) {
        if (i9 == 1) {
            if (!z9 && !this.f26557i) {
                this.f26557i = true;
                if (this.f26562n == null && !C4.d.a()) {
                    try {
                        this.f26562n = this.f26561m.v(this.f26554f.getApplicationContext(), new X(this));
                    } catch (SecurityException unused) {
                    }
                }
                W w9 = this.f26560l;
                w9.sendMessageDelayed(w9.obtainMessage(1), this.f26558j);
                W w10 = this.f26560l;
                w10.sendMessageDelayed(w10.obtainMessage(2), this.f26559k);
            }
            i9 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f26572x.f26510a.toArray(new BasePendingResult[0])) {
            basePendingResult.forceFailureUnlessReady(Q0.f26509c);
        }
        this.f26551c.e(i9);
        this.f26551c.a();
        if (i9 == 2) {
            u();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        this.f26550b.lock();
        try {
            int i9 = 2;
            boolean z9 = false;
            if (this.f26553e >= 0) {
                com.google.android.gms.common.internal.r.q(this.f26570v != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f26570v;
                if (num == null) {
                    this.f26570v = Integer.valueOf(n(this.f26563o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int iIntValue = ((Integer) com.google.android.gms.common.internal.r.m(this.f26570v)).intValue();
            this.f26550b.lock();
            try {
                if (iIntValue != 3 && iIntValue != 1) {
                    if (iIntValue != 2) {
                        i9 = iIntValue;
                    }
                    com.google.android.gms.common.internal.r.b(z9, "Illegal sign-in mode: " + i9);
                    t(i9);
                    u();
                    this.f26550b.unlock();
                    return;
                }
                i9 = iIntValue;
                com.google.android.gms.common.internal.r.b(z9, "Illegal sign-in mode: " + i9);
                t(i9);
                u();
                this.f26550b.unlock();
                return;
            } finally {
                this.f26550b.unlock();
            }
            z9 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f26554f);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f26557i);
        printWriter.append(" mWorkQueue.size()=").print(this.f26556h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f26572x.f26510a.size());
        InterfaceC1393v0 interfaceC1393v0 = this.f26552d;
        if (interfaceC1393v0 != null) {
            interfaceC1393v0.c(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        this.f26550b.lock();
        try {
            this.f26572x.b();
            InterfaceC1393v0 interfaceC1393v0 = this.f26552d;
            if (interfaceC1393v0 != null) {
                interfaceC1393v0.b();
            }
            this.f26568t.c();
            for (AbstractC1357d abstractC1357d : this.f26556h) {
                abstractC1357d.zan(null);
                abstractC1357d.cancel();
            }
            this.f26556h.clear();
            if (this.f26552d != null) {
                s();
                this.f26551c.a();
            }
            this.f26550b.unlock();
        } catch (Throwable th) {
            this.f26550b.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final AbstractC1357d e(AbstractC1357d abstractC1357d) {
        com.google.android.gms.common.api.a api = abstractC1357d.getApi();
        com.google.android.gms.common.internal.r.b(this.f26563o.containsKey(abstractC1357d.getClientKey()), "GoogleApiClient is not configured to use " + (api != null ? api.d() : "the API") + " required for this call.");
        this.f26550b.lock();
        try {
            InterfaceC1393v0 interfaceC1393v0 = this.f26552d;
            if (interfaceC1393v0 == null) {
                this.f26556h.add(abstractC1357d);
            } else {
                abstractC1357d = interfaceC1393v0.d(abstractC1357d);
            }
            this.f26550b.unlock();
            return abstractC1357d;
        } catch (Throwable th) {
            this.f26550b.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final AbstractC1357d f(AbstractC1357d abstractC1357d) {
        Map map = this.f26563o;
        com.google.android.gms.common.api.a api = abstractC1357d.getApi();
        com.google.android.gms.common.internal.r.b(map.containsKey(abstractC1357d.getClientKey()), "GoogleApiClient is not configured to use " + (api != null ? api.d() : "the API") + " required for this call.");
        this.f26550b.lock();
        try {
            InterfaceC1393v0 interfaceC1393v0 = this.f26552d;
            if (interfaceC1393v0 == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.f26557i) {
                this.f26556h.add(abstractC1357d);
                while (!this.f26556h.isEmpty()) {
                    AbstractC1357d abstractC1357d2 = (AbstractC1357d) this.f26556h.remove();
                    this.f26572x.a(abstractC1357d2);
                    abstractC1357d2.setFailedResult(Status.f26439m);
                }
            } else {
                abstractC1357d = interfaceC1393v0.f(abstractC1357d);
            }
            this.f26550b.unlock();
            return abstractC1357d;
        } catch (Throwable th) {
            this.f26550b.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final a.f g(a.c cVar) {
        a.f fVar = (a.f) this.f26563o.get(cVar);
        com.google.android.gms.common.internal.r.n(fVar, "Appropriate Api was not requested.");
        return fVar;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Context h() {
        return this.f26554f;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper i() {
        return this.f26555g;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean j() {
        InterfaceC1393v0 interfaceC1393v0 = this.f26552d;
        return interfaceC1393v0 != null && interfaceC1393v0.e();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void k(GoogleApiClient.c cVar) {
        this.f26551c.g(cVar);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void l(GoogleApiClient.c cVar) {
        this.f26551c.h(cVar);
    }

    public final String o() {
        StringWriter stringWriter = new StringWriter();
        d("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    public final boolean s() {
        if (!this.f26557i) {
            return false;
        }
        this.f26557i = false;
        this.f26560l.removeMessages(2);
        this.f26560l.removeMessages(1);
        C1385r0 c1385r0 = this.f26562n;
        if (c1385r0 != null) {
            c1385r0.b();
            this.f26562n = null;
        }
        return true;
    }

    public final void t(int i9) {
        InterfaceC1393v0 c1356c0;
        Integer num = this.f26570v;
        if (num == null) {
            this.f26570v = Integer.valueOf(i9);
        } else if (num.intValue() != i9) {
            throw new IllegalStateException("Cannot use sign-in mode: " + p(i9) + ". Mode was already set to " + p(this.f26570v.intValue()));
        }
        if (this.f26552d != null) {
            return;
        }
        boolean zRequiresSignIn = false;
        boolean zProvidesSignIn = false;
        for (a.f fVar : this.f26563o.values()) {
            zRequiresSignIn |= fVar.requiresSignIn();
            zProvidesSignIn |= fVar.providesSignIn();
        }
        int iIntValue = this.f26570v.intValue();
        if (iIntValue != 1) {
            if (iIntValue == 2 && zRequiresSignIn) {
                c1356c0 = C1394w.m(this.f26554f, this, this.f26550b, this.f26555g, this.f26561m, this.f26563o, this.f26565q, this.f26566r, this.f26567s, this.f26569u);
            }
            this.f26552d = c1356c0;
        }
        if (!zRequiresSignIn) {
            throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
        }
        if (zProvidesSignIn) {
            throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
        }
        c1356c0 = new C1356c0(this.f26554f, this, this.f26550b, this.f26555g, this.f26561m, this.f26563o, this.f26565q, this.f26566r, this.f26567s, this.f26569u, this);
        this.f26552d = c1356c0;
    }

    public final void u() {
        this.f26551c.b();
        ((InterfaceC1393v0) com.google.android.gms.common.internal.r.m(this.f26552d)).a();
    }
}
