package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class pa implements td, pg, qm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ox f23997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qq f23998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dw f23999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nt f24000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nn f24001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final tj f24002f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final iw f24006j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private tc f24007k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f24008l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private um f24009m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f24012p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final wr f24014r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final oq f24016t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ws f24017u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ws f24018v;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f24004h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f24005i = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private uh f24013q = ws.f(new uh[0]);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final IdentityHashMap f24003g = new IdentityHashMap();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final vk f24015s = new vk((byte[]) null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private pk[] f24010n = new pk[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private pk[] f24011o = new pk[0];

    public pa(ox oxVar, qq qqVar, oq oqVar, dw dwVar, nt ntVar, nn nnVar, ws wsVar, tj tjVar, wr wrVar, ws wsVar2, boolean z9, int i9, iw iwVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f23997a = oxVar;
        this.f23998b = qqVar;
        this.f24016t = oqVar;
        this.f23999c = dwVar;
        this.f24000d = ntVar;
        this.f24001e = nnVar;
        this.f24017u = wsVar;
        this.f24002f = tjVar;
        this.f24014r = wrVar;
        this.f24018v = wsVar2;
        this.f24006j = iwVar;
    }

    private static C1333s t(C1333s c1333s, C1333s c1333s2, boolean z9) {
        String strK;
        ao aoVar;
        String str;
        int i9;
        String str2;
        int i10;
        int i11;
        if (c1333s2 != null) {
            strK = c1333s2.f24464i;
            aoVar = c1333s2.f24465j;
            i10 = c1333s2.f24480y;
            i9 = c1333s2.f24459d;
            i11 = c1333s2.f24460e;
            str = c1333s2.f24458c;
            str2 = c1333s2.f24457b;
        } else {
            strK = cq.K(c1333s.f24464i, 1);
            aoVar = c1333s.f24465j;
            if (z9) {
                i10 = c1333s.f24480y;
                i9 = c1333s.f24459d;
                i11 = c1333s.f24460e;
                str = c1333s.f24458c;
                str2 = c1333s.f24457b;
            } else {
                str = null;
                i9 = 0;
                str2 = null;
                i10 = -1;
                i11 = 0;
            }
        }
        String strG = ar.g(strK);
        int i12 = z9 ? c1333s.f24461f : -1;
        int i13 = z9 ? c1333s.f24462g : -1;
        r rVar = new r();
        rVar.S(c1333s.f24456a);
        rVar.U(str2);
        rVar.K(c1333s.f24466k);
        rVar.ae(strG);
        rVar.I(strK);
        rVar.X(aoVar);
        rVar.G(i12);
        rVar.Z(i13);
        rVar.H(i10);
        rVar.ag(i9);
        rVar.ac(i11);
        rVar.V(str);
        return rVar.v();
    }

    private final pk u(String str, int i9, Uri[] uriArr, C1333s[] c1333sArr, C1333s c1333s, List list, Map map, long j9) {
        return new pk(str, i9, this, new ow(this.f23997a, this.f23998b, uriArr, c1333sArr, this.f24016t, this.f23999c, this.f24015s, list, this.f24006j, null), map, this.f24014r, j9, c1333s, this.f24000d, this.f24001e, this.f24017u, this.f24002f, 1, null, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final long a(long j9, hl hlVar) {
        for (pk pkVar : this.f24011o) {
            if (pkVar.D()) {
                return pkVar.g(j9, hlVar);
            }
        }
        return j9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final void bm() throws IOException {
        for (pk pkVar : this.f24010n) {
            pkVar.s();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td, com.google.ads.interactivemedia.v3.internal.uh
    public final long bo() {
        return this.f24013q.bo();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td, com.google.ads.interactivemedia.v3.internal.uh
    public final long c() {
        return this.f24013q.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final long d() {
        return -9223372036854775807L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final long e(long j9) {
        pk[] pkVarArr = this.f24011o;
        if (pkVarArr.length > 0) {
            boolean zE = pkVarArr[0].E(j9, false);
            int i9 = 1;
            while (true) {
                pk[] pkVarArr2 = this.f24011o;
                if (i9 >= pkVarArr2.length) {
                    break;
                }
                pkVarArr2[i9].E(j9, zE);
                i9++;
            }
            if (zE) {
                this.f24015s.c();
            }
        }
        return j9;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd  */
    @Override // com.google.ads.interactivemedia.v3.internal.td
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f(com.google.ads.interactivemedia.v3.internal.we[] r22, boolean[] r23, com.google.ads.interactivemedia.v3.internal.uf[] r24, boolean[] r25, long r26) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.pa.f(com.google.ads.interactivemedia.v3.internal.we[], boolean[], com.google.ads.interactivemedia.v3.internal.uf[], boolean[], long):long");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ug
    public final /* bridge */ /* synthetic */ void g(uh uhVar) {
        this.f24007k.g(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final um h() {
        um umVar = this.f24009m;
        af.s(umVar);
        return umVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.qm
    public final void j() {
        for (pk pkVar : this.f24010n) {
            pkVar.v();
        }
        this.f24007k.g(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9 A[PHI: r19
      0x00a9: PHI (r19v7 java.util.ArrayList) = (r19v5 java.util.ArrayList), (r19v8 java.util.ArrayList) binds: [B:34:0x00a6, B:29:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed A[PHI: r1
      0x00ed: PHI (r1v27 int) = (r1v26 int), (r1v36 int) binds: [B:40:0x00d7, B:44:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0131  */
    @Override // com.google.ads.interactivemedia.v3.internal.td
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(com.google.ads.interactivemedia.v3.internal.tc r25, long r26) {
        /*
            Method dump skipped, instruction units count: 1005
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.pa.k(com.google.ads.interactivemedia.v3.internal.tc, long):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td, com.google.ads.interactivemedia.v3.internal.uh
    public final void l(long j9) {
        this.f24013q.l(j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.pg
    public final void m(Uri uri) {
        this.f23998b.t(uri);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.pg
    public final void n() {
        int i9 = this.f24008l - 1;
        this.f24008l = i9;
        if (i9 > 0) {
            return;
        }
        int i10 = 0;
        for (pk pkVar : this.f24010n) {
            i10 += pkVar.h().f24749b;
        }
        bf[] bfVarArr = new bf[i10];
        int i11 = 0;
        for (pk pkVar2 : this.f24010n) {
            int i12 = pkVar2.h().f24749b;
            int i13 = 0;
            while (i13 < i12) {
                bfVarArr[i11] = pkVar2.h().b(i13);
                i13++;
                i11++;
            }
        }
        this.f24009m = new um(bfVarArr);
        this.f24007k.bl(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td, com.google.ads.interactivemedia.v3.internal.uh
    public final boolean o(long j9) {
        if (this.f24009m != null) {
            return this.f24013q.o(j9);
        }
        for (pk pkVar : this.f24010n) {
            pkVar.m();
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td, com.google.ads.interactivemedia.v3.internal.uh
    public final boolean p() {
        return this.f24013q.p();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final void q(long j9) {
        for (pk pkVar : this.f24011o) {
            pkVar.G(j9);
        }
    }

    public final void r() {
        this.f23998b.u(this);
        for (pk pkVar : this.f24010n) {
            pkVar.w();
        }
        this.f24007k = null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.qm
    public final boolean s(Uri uri, bdz bdzVar, boolean z9) {
        boolean zJ = true;
        for (pk pkVar : this.f24010n) {
            zJ &= pkVar.J(uri, bdzVar, z9);
        }
        this.f24007k.g(this);
        return zJ;
    }
}
