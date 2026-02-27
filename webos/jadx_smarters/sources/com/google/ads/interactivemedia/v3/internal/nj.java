package com.google.ads.interactivemedia.v3.internal;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class nj implements nt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile nb f23870a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final UUID f23871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final oj f23872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f23873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f23874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ng f23875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ni f23876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f23877i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f23878j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Set f23879k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Set f23880l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f23881m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ob f23882n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private my f23883o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private my f23884p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Looper f23885q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Handler f23886r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte[] f23887s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private iw f23888t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final od f23889u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ws f23890v;

    public /* synthetic */ nj(UUID uuid, od odVar, oj ojVar, HashMap map, int[] iArr, ws wsVar, long j9, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        af.s(uuid);
        af.v(!C1304i.f23213b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f23871c = uuid;
        this.f23889u = odVar;
        this.f23872d = ojVar;
        this.f23873e = map;
        this.f23874f = iArr;
        this.f23890v = wsVar;
        this.f23875g = new ng();
        this.f23876h = new ni(this);
        this.f23878j = new ArrayList();
        this.f23879k = axo.f();
        this.f23880l = axo.f();
        this.f23877i = 300000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        if (this.f23882n != null && this.f23881m == 0 && this.f23878j.isEmpty() && this.f23879k.isEmpty()) {
            ob obVar = this.f23882n;
            af.s(obVar);
            obVar.f();
            this.f23882n = null;
        }
    }

    private final void B() {
        axq axqVarListIterator = avx.l(this.f23880l).listIterator();
        while (axqVarListIterator.hasNext()) {
            ((nm) axqVarListIterator.next()).m(null);
        }
    }

    private final void C() {
        axq axqVarListIterator = avx.l(this.f23879k).listIterator();
        while (axqVarListIterator.hasNext()) {
            ((nf) axqVarListIterator.next()).c();
        }
    }

    private static boolean D(nm nmVar) {
        if (nmVar.a() != 1) {
            return false;
        }
        if (cq.f22640a < 19) {
            return true;
        }
        nl nlVarC = nmVar.c();
        af.s(nlVarC);
        return nlVarC.getCause() instanceof ResourceBusyException;
    }

    private static final void E(nm nmVar, nn nnVar) {
        nmVar.m(nnVar);
        nmVar.m(null);
    }

    private final my v(List list, boolean z9, nn nnVar) {
        af.s(this.f23882n);
        UUID uuid = this.f23871c;
        ob obVar = this.f23882n;
        ng ngVar = this.f23875g;
        ni niVar = this.f23876h;
        byte[] bArr = this.f23887s;
        HashMap map = this.f23873e;
        oj ojVar = this.f23872d;
        Looper looper = this.f23885q;
        af.s(looper);
        ws wsVar = this.f23890v;
        iw iwVar = this.f23888t;
        af.s(iwVar);
        my myVar = new my(uuid, obVar, ngVar, niVar, list, z9, z9, bArr, map, ojVar, looper, wsVar, iwVar, null, null, null);
        myVar.h(nnVar);
        myVar.h(null);
        return myVar;
    }

    private final my w(List list, boolean z9, nn nnVar, boolean z10) {
        my myVarV = v(list, z9, nnVar);
        if (D(myVarV) && !this.f23880l.isEmpty()) {
            B();
            E(myVarV, nnVar);
            myVarV = v(list, z9, nnVar);
        }
        if (!D(myVarV) || !z10 || this.f23879k.isEmpty()) {
            return myVarV;
        }
        C();
        if (!this.f23880l.isEmpty()) {
            B();
        }
        E(myVarV, nnVar);
        return v(list, z9, nnVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nm x(Looper looper, nn nnVar, C1333s c1333s, boolean z9) {
        if (this.f23870a == null) {
            this.f23870a = new nb(this, looper);
        }
        C1322o c1322o = c1333s.f24470o;
        List listY = null;
        if (c1322o == null) {
            int iB = ar.b(c1333s.f24467l);
            ob obVar = this.f23882n;
            af.s(obVar);
            if ((obVar.a() == 2 && oc.f23907a) || cq.n(this.f23874f, iB) == -1 || obVar.a() == 1) {
                return null;
            }
            my myVar = this.f23883o;
            if (myVar == null) {
                my myVarW = w(avo.o(), true, null, z9);
                this.f23878j.add(myVarW);
                this.f23883o = myVarW;
            } else {
                myVar.h(null);
            }
            return this.f23883o;
        }
        if (this.f23887s == null) {
            af.s(c1322o);
            listY = y(c1322o, this.f23871c, false);
            if (listY.isEmpty()) {
                nc ncVar = new nc(this.f23871c);
                cd.c("DefaultDrmSessionMgr", "DRM error", ncVar);
                if (nnVar != null) {
                    nnVar.f(ncVar);
                }
                return new nz(new nl(ncVar, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        }
        my myVar2 = this.f23884p;
        if (myVar2 != null) {
            myVar2.h(nnVar);
            return myVar2;
        }
        my myVarW2 = w(listY, false, nnVar, z9);
        this.f23884p = myVarW2;
        this.f23878j.add(myVarW2);
        return myVarW2;
    }

    private static List y(C1322o c1322o, UUID uuid, boolean z9) {
        ArrayList arrayList = new ArrayList(c1322o.f23904b);
        for (int i9 = 0; i9 < c1322o.f23904b; i9++) {
            C1319n c1319nA = c1322o.a(i9);
            if ((c1319nA.c(uuid) || (C1304i.f23214c.equals(uuid) && c1319nA.c(C1304i.f23213b))) && (c1319nA.f23855d != null || z9)) {
                arrayList.add(c1319nA);
            }
        }
        return arrayList;
    }

    private final synchronized void z(Looper looper) {
        Looper looper2 = this.f23885q;
        if (looper2 == null) {
            this.f23885q = looper;
            this.f23886r = new Handler(looper);
        } else {
            af.w(looper2 == looper);
            af.s(this.f23886r);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nt
    public final int b(C1333s c1333s) {
        ob obVar = this.f23882n;
        af.s(obVar);
        int iA = obVar.a();
        C1322o c1322o = c1333s.f24470o;
        if (c1322o == null) {
            if (cq.n(this.f23874f, ar.b(c1333s.f24467l)) != -1) {
                return iA;
            }
            return 0;
        }
        if (this.f23887s == null) {
            if (y(c1322o, this.f23871c, true).isEmpty()) {
                if (c1322o.f23904b == 1 && c1322o.a(0).c(C1304i.f23213b)) {
                    cd.e("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: ".concat(String.valueOf(this.f23871c)));
                }
                return 1;
            }
            String str = c1322o.f23903a;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : cq.f22640a < 25)) {
                return 1;
            }
        }
        return iA;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nt
    public final nm i(nn nnVar, C1333s c1333s) {
        af.w(this.f23881m > 0);
        af.t(this.f23885q);
        return x(this.f23885q, nnVar, c1333s, true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nt
    public final ns j(nn nnVar, final C1333s c1333s) {
        af.w(this.f23881m > 0);
        af.t(this.f23885q);
        final nf nfVar = new nf(this, nnVar);
        Handler handler = nfVar.f23862a.f23886r;
        af.s(handler);
        handler.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.ne
            @Override // java.lang.Runnable
            public final void run() {
                nfVar.a(c1333s);
            }
        });
        return nfVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nt
    public final void o() {
        int i9 = this.f23881m;
        this.f23881m = i9 + 1;
        if (i9 != 0) {
            return;
        }
        if (this.f23882n == null) {
            ob obVarA = this.f23889u.a(this.f23871c);
            this.f23882n = obVarA;
            obVarA.h(new na(this));
        } else {
            for (int i10 = 0; i10 < this.f23878j.size(); i10++) {
                ((my) this.f23878j.get(i10)).h(null);
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nt
    public final void p() {
        int i9 = this.f23881m - 1;
        this.f23881m = i9;
        if (i9 != 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f23878j);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((my) arrayList.get(i10)).m(null);
        }
        C();
        A();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nt
    public final void q(Looper looper, iw iwVar) {
        z(looper);
        this.f23888t = iwVar;
    }

    public final void u(byte[] bArr) {
        af.w(this.f23878j.isEmpty());
        this.f23887s = bArr;
    }
}
