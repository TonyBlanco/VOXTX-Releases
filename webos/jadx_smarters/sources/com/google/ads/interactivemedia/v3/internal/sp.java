package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class sp extends si {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ai f24531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f24532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f24533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler f24534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f24535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final IdentityHashMap f24536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f24537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f24538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f24539i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Set f24540j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ui f24541k;

    static {
        C1341v c1341v = new C1341v();
        c1341v.c(Uri.EMPTY);
        f24531a = c1341v.a();
    }

    public sp(ui uiVar, tg... tgVarArr) {
        this.f24541k = uiVar.c() > 0 ? uiVar.f() : uiVar;
        this.f24536f = new IdentityHashMap();
        this.f24537g = new HashMap();
        this.f24532b = new ArrayList();
        this.f24535e = new ArrayList();
        this.f24540j = new HashSet();
        this.f24533c = new HashSet();
        this.f24538h = new HashSet();
        s(Arrays.asList(tgVarArr));
    }

    public static /* synthetic */ void N(sp spVar, Message message) {
        int i9;
        int i10 = message.what;
        if (i10 == 0) {
            Object obj = message.obj;
            int i11 = cq.f22640a;
            so soVar = (so) obj;
            spVar.f24541k = spVar.f24541k.g(soVar.f24528a, ((Collection) soVar.f24529b).size());
            spVar.Q(soVar.f24528a, (Collection) soVar.f24529b);
            spVar.Z(null);
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    Object obj2 = message.obj;
                    int i12 = cq.f22640a;
                    spVar.f24541k = (ui) ((so) obj2).f24529b;
                    spVar.Z(null);
                    return;
                }
                if (i10 == 4) {
                    spVar.X();
                    return;
                } else {
                    if (i10 != 5) {
                        throw new IllegalStateException();
                    }
                    Object obj3 = message.obj;
                    int i13 = cq.f22640a;
                    spVar.T((Set) obj3);
                    return;
                }
            }
            Object obj4 = message.obj;
            int i14 = cq.f22640a;
            so soVar2 = (so) obj4;
            ui uiVar = spVar.f24541k;
            int i15 = soVar2.f24528a;
            ui uiVarH = uiVar.h(i15, i15 + 1);
            spVar.f24541k = uiVarH;
            spVar.f24541k = uiVarH.g(((Integer) soVar2.f24529b).intValue(), 1);
            int i16 = soVar2.f24528a;
            int iIntValue = ((Integer) soVar2.f24529b).intValue();
            int iMin = Math.min(i16, iIntValue);
            int iMax = Math.max(i16, iIntValue);
            int iC = ((sn) spVar.f24535e.get(iMin)).f24526e;
            List list = spVar.f24535e;
            list.add(iIntValue, (sn) list.remove(i16));
            while (iMin <= iMax) {
                sn snVar = (sn) spVar.f24535e.get(iMin);
                snVar.f24525d = iMin;
                snVar.f24526e = iC;
                iC += snVar.f24522a.k().c();
                iMin++;
            }
            spVar.Z(null);
            return;
        }
        Object obj5 = message.obj;
        int i17 = cq.f22640a;
        so soVar3 = (so) obj5;
        int i18 = soVar3.f24528a;
        int iIntValue2 = ((Integer) soVar3.f24529b).intValue();
        if (i18 == 0) {
            i9 = 0;
            if (iIntValue2 == spVar.f24541k.c()) {
                spVar.f24541k = spVar.f24541k.f();
            } else {
                i18 = 0;
                spVar.f24541k = spVar.f24541k.h(i18, iIntValue2);
                i9 = i18;
            }
        } else {
            spVar.f24541k = spVar.f24541k.h(i18, iIntValue2);
            i9 = i18;
        }
        while (true) {
            iIntValue2--;
            if (iIntValue2 < i9) {
                spVar.Z(null);
                return;
            }
            sn snVar2 = (sn) spVar.f24535e.remove(iIntValue2);
            spVar.f24537g.remove(snVar2.f24523b);
            spVar.R(iIntValue2, -1, -snVar2.f24522a.k().c());
            snVar2.f24527f = true;
            spVar.U(snVar2);
        }
    }

    private final Handler P() {
        Handler handler = this.f24534d;
        af.s(handler);
        return handler;
    }

    private final void Q(int i9, Collection collection) {
        int iC;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            sn snVar = (sn) it.next();
            int i10 = i9 + 1;
            if (i9 > 0) {
                sn snVar2 = (sn) this.f24535e.get(i9 - 1);
                iC = snVar2.f24526e + snVar2.f24522a.k().c();
            } else {
                iC = 0;
            }
            snVar.a(i9, iC);
            R(i9, 1, snVar.f24522a.k().c());
            this.f24535e.add(i9, snVar);
            this.f24537g.put(snVar.f24523b, snVar);
            g(snVar, snVar.f24522a);
            if (K() && this.f24536f.isEmpty()) {
                this.f24538h.add(snVar);
            } else {
                e(snVar);
            }
            i9 = i10;
        }
    }

    private final void R(int i9, int i10, int i11) {
        while (i9 < this.f24535e.size()) {
            sn snVar = (sn) this.f24535e.get(i9);
            snVar.f24525d += i10;
            snVar.f24526e += i11;
            i9++;
        }
    }

    private final void S() {
        Iterator it = this.f24538h.iterator();
        while (it.hasNext()) {
            sn snVar = (sn) it.next();
            if (snVar.f24524c.isEmpty()) {
                e(snVar);
                it.remove();
            }
        }
    }

    private final synchronized void T(Set set) {
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.f24533c.removeAll(set);
    }

    private final void U(sn snVar) {
        if (snVar.f24527f && snVar.f24524c.isEmpty()) {
            this.f24538h.remove(snVar);
            i(snVar);
        }
    }

    private final void V() {
        Z(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.ads.interactivemedia.v3.internal.si
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final void j(sn snVar, be beVar) {
        if (snVar.f24525d + 1 < this.f24535e.size()) {
            int iC = beVar.c() - (((sn) this.f24535e.get(snVar.f24525d + 1)).f24526e - snVar.f24526e);
            if (iC != 0) {
                R(snVar.f24525d + 1, 0, iC);
            }
        }
        V();
    }

    private final void X() {
        this.f24539i = false;
        Set set = this.f24540j;
        this.f24540j = new HashSet();
        G(new sl(this.f24535e, this.f24541k));
        P().obtainMessage(5, set).sendToTarget();
    }

    private final void Y(int i9, Collection collection) {
        af.u(true);
        Handler handler = this.f24534d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            af.s((tg) it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new sn((tg) it2.next()));
        }
        this.f24532b.addAll(i9, arrayList);
        if (handler == null || collection.isEmpty()) {
            return;
        }
        handler.obtainMessage(0, new so(i9, arrayList, null, null, null, null)).sendToTarget();
    }

    private final void Z(ws wsVar) {
        if (this.f24539i) {
            return;
        }
        P().obtainMessage(4).sendToTarget();
        this.f24539i = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.si, com.google.ads.interactivemedia.v3.internal.sa
    public final void C() {
        super.C();
        this.f24538h.clear();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.si, com.google.ads.interactivemedia.v3.internal.sa
    public final void E() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sa, com.google.ads.interactivemedia.v3.internal.tg
    public final boolean L() {
        return false;
    }

    public final synchronized void O(int i9) {
        l(i9);
        int i10 = i9 + 1;
        af.u(true);
        Handler handler = this.f24534d;
        cq.T(this.f24532b, i9, i10);
        if (handler != null) {
            handler.obtainMessage(1, new so(i9, Integer.valueOf(i10), null, null, null, null)).sendToTarget();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tg
    public final ai a() {
        return f24531a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.si
    public final /* bridge */ /* synthetic */ int b(Object obj, int i9) {
        return i9 + ((sn) obj).f24526e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.si
    public final /* bridge */ /* synthetic */ te d(Object obj, te teVar) {
        int i9 = 0;
        while (true) {
            sn snVar = (sn) obj;
            if (i9 >= snVar.f24524c.size()) {
                return null;
            }
            if (((te) snVar.f24524c.get(i9)).f20176d == teVar.f20176d) {
                return teVar.c(Pair.create(snVar.f24523b, teVar.f20173a));
            }
            i9++;
        }
    }

    public final synchronized tg l(int i9) {
        return ((sn) this.f24532b.get(i9)).f24522a;
    }

    public final synchronized void m(tg tgVar) {
        r(this.f24532b.size(), tgVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.si, com.google.ads.interactivemedia.v3.internal.sa
    public final synchronized void n(dw dwVar) {
        super.n(dwVar);
        this.f24534d = new Handler(new sk(this, 0));
        if (this.f24532b.isEmpty()) {
            X();
            return;
        }
        this.f24541k = this.f24541k.g(0, this.f24532b.size());
        Q(0, this.f24532b);
        V();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tg
    public final void o(td tdVar) {
        sn snVar = (sn) this.f24536f.remove(tdVar);
        af.s(snVar);
        snVar.f24522a.o(tdVar);
        snVar.f24524c.remove(((sx) tdVar).f24554a);
        if (!this.f24536f.isEmpty()) {
            S();
        }
        U(snVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.si, com.google.ads.interactivemedia.v3.internal.sa
    public final synchronized void p() {
        try {
            super.p();
            this.f24535e.clear();
            this.f24538h.clear();
            this.f24537g.clear();
            this.f24541k = this.f24541k.f();
            Handler handler = this.f24534d;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f24534d = null;
            }
            this.f24539i = false;
            this.f24540j.clear();
            T(this.f24533c);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tg
    public final td q(te teVar, wr wrVar, long j9) {
        Object objY = eg.y(teVar.f20173a);
        te teVarC = teVar.c(eg.x(teVar.f20173a));
        sn snVar = (sn) this.f24537g.get(objY);
        if (snVar == null) {
            snVar = new sn(new sm(null));
            snVar.f24527f = true;
            g(snVar, snVar.f24522a);
        }
        this.f24538h.add(snVar);
        f(snVar);
        snVar.f24524c.add(teVarC);
        sx sxVarS = snVar.f24522a.q(teVarC, wrVar, j9);
        this.f24536f.put(sxVarS, snVar);
        S();
        return sxVarS;
    }

    public final synchronized void r(int i9, tg tgVar) {
        Y(i9, Collections.singletonList(tgVar));
    }

    public final synchronized void s(Collection collection) {
        Y(this.f24532b.size(), collection);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sa, com.google.ads.interactivemedia.v3.internal.tg
    public final synchronized be t() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new sl(this.f24532b, this.f24541k.c() != this.f24532b.size() ? this.f24541k.f().g(0, this.f24532b.size()) : this.f24541k);
    }
}
