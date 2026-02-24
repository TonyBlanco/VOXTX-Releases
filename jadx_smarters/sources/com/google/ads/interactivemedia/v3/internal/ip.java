package com.google.ads.interactivemedia.v3.internal;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class ip implements iu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final atq f23279a = new atq() { // from class: com.google.ads.interactivemedia.v3.internal.in
        @Override // com.google.ads.interactivemedia.v3.internal.atq
        public final Object a() {
            return ip.l();
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Random f23280b = new Random();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private it f23285g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f23287i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final atq f23284f = f23279a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bd f23281c = new bd();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bc f23282d = new bc();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f23283e = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private be f23286h = be.f21126a;

    private final io k(int i9, te teVar) {
        io ioVar = null;
        long j9 = Long.MAX_VALUE;
        for (io ioVar2 : this.f23283e.values()) {
            ioVar2.e(i9, teVar);
            if (ioVar2.h(i9, teVar)) {
                long j10 = ioVar2.f23275d;
                if (j10 == -1 || j10 < j9) {
                    ioVar = ioVar2;
                    j9 = j10;
                } else if (j10 == j9) {
                    int i10 = cq.f22640a;
                    if (ioVar.f23276e != null && ioVar2.f23276e != null) {
                        ioVar = ioVar2;
                    }
                }
            }
        }
        if (ioVar != null) {
            return ioVar;
        }
        String strL = l();
        io ioVar3 = new io(this, strL, i9, teVar);
        this.f23283e.put(strL, ioVar3);
        return ioVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String l() {
        byte[] bArr = new byte[12];
        f23280b.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void m(hv hvVar) {
        if (hvVar.f23194b.p()) {
            this.f23287i = null;
            return;
        }
        io ioVar = (io) this.f23283e.get(this.f23287i);
        io ioVarK = k(hvVar.f23195c, hvVar.f23196d);
        this.f23287i = ioVarK.f23273b;
        h(hvVar);
        te teVar = hvVar.f23196d;
        if (teVar == null || !teVar.b()) {
            return;
        }
        if (ioVar != null && ioVar.f23275d == hvVar.f23196d.f20176d && ioVar.f23276e != null && ioVar.f23276e.f20174b == hvVar.f23196d.f20174b && ioVar.f23276e.f20175c == hvVar.f23196d.f20175c) {
            return;
        }
        te teVar2 = hvVar.f23196d;
        String unused = k(hvVar.f23195c, new te(teVar2.f20173a, teVar2.f20176d)).f23273b;
        String unused2 = ioVarK.f23273b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.iu
    public final synchronized String d() {
        return this.f23287i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.iu
    public final synchronized String e(be beVar, te teVar) {
        return k(beVar.n(teVar.f20173a, this.f23282d).f21037c, teVar).f23273b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.iu
    public final synchronized void f(hv hvVar) {
        it itVar;
        this.f23287i = null;
        Iterator it = this.f23283e.values().iterator();
        while (it.hasNext()) {
            io ioVar = (io) it.next();
            it.remove();
            if (ioVar.f23277f && (itVar = this.f23285g) != null) {
                itVar.m(hvVar, ioVar.f23273b);
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.iu
    public final void g(it itVar) {
        this.f23285g = itVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r9.f23196d.f20176d < r0.f23275d) goto L20;
     */
    @Override // com.google.ads.interactivemedia.v3.internal.iu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void h(com.google.ads.interactivemedia.v3.internal.hv r9) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ip.h(com.google.ads.interactivemedia.v3.internal.hv):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.iu
    public final synchronized void i(hv hvVar, int i9) {
        try {
            af.s(this.f23285g);
            Iterator it = this.f23283e.values().iterator();
            while (it.hasNext()) {
                io ioVar = (io) it.next();
                if (ioVar.i(hvVar)) {
                    it.remove();
                    if (ioVar.f23277f) {
                        boolean zEquals = ioVar.f23273b.equals(this.f23287i);
                        if (i9 == 0) {
                            if (zEquals) {
                                boolean unused = ioVar.f23278g;
                                this.f23287i = null;
                            }
                            this.f23285g.m(hvVar, ioVar.f23273b);
                        } else {
                            if (zEquals) {
                                this.f23287i = null;
                            }
                            this.f23285g.m(hvVar, ioVar.f23273b);
                        }
                    }
                }
            }
            m(hvVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.iu
    public final synchronized void j(hv hvVar) {
        try {
            af.s(this.f23285g);
            be beVar = this.f23286h;
            this.f23286h = hvVar.f23194b;
            Iterator it = this.f23283e.values().iterator();
            while (it.hasNext()) {
                io ioVar = (io) it.next();
                if (!ioVar.j(beVar, this.f23286h) || ioVar.i(hvVar)) {
                    it.remove();
                    if (ioVar.f23277f) {
                        if (ioVar.f23273b.equals(this.f23287i)) {
                            this.f23287i = null;
                        }
                        this.f23285g.m(hvVar, ioVar.f23273b);
                    }
                }
            }
            m(hvVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
