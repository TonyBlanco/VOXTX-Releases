package com.google.ads.interactivemedia.v3.internal;

import android.os.Looper;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pc extends sa implements qp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ox f24029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ad f24030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nt f24031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f24032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f24033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final qq f24034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f24035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ai f24036h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ac f24037i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private dw f24038j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final oq f24039k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ws f24040l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ws f24041m;

    static {
        aj.b("media3.exoplayer.hls");
    }

    public /* synthetic */ pc(ai aiVar, oq oqVar, ox oxVar, ws wsVar, nt ntVar, ws wsVar2, qq qqVar, long j9, boolean z9, int i9, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        ad adVar = aiVar.f19815b;
        af.s(adVar);
        this.f24030b = adVar;
        this.f24036h = aiVar;
        this.f24037i = aiVar.f19816c;
        this.f24039k = oqVar;
        this.f24029a = oxVar;
        this.f24041m = wsVar;
        this.f24031c = ntVar;
        this.f24040l = wsVar2;
        this.f24034f = qqVar;
        this.f24035g = -9223372036854775807L;
        this.f24032d = true;
        this.f24033e = 1;
    }

    private static py c(List list, long j9) {
        py pyVar = null;
        for (int i9 = 0; i9 < list.size(); i9++) {
            py pyVar2 = (py) list.get(i9);
            long j10 = pyVar2.f24170g;
            if (j10 > j9 || !pyVar2.f24158a) {
                if (j10 > j9) {
                    break;
                }
            } else {
                pyVar = pyVar2;
            }
        }
        return pyVar;
    }

    private static qa d(List list, long j9) {
        return (qa) list.get(cq.ap(list, Long.valueOf(j9), true));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tg
    public final ai a() {
        return this.f24036h;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011e A[PHI: r3
      0x011e: PHI (r3v18 com.google.ads.interactivemedia.v3.internal.qb) = (r3v24 com.google.ads.interactivemedia.v3.internal.qb), (r3v25 com.google.ads.interactivemedia.v3.internal.qb) binds: [B:64:0x011c, B:70:0x0138] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0199  */
    @Override // com.google.ads.interactivemedia.v3.internal.qp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.google.ads.interactivemedia.v3.internal.qd r32) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.pc.b(com.google.ads.interactivemedia.v3.internal.qd):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tg
    public final void h() throws IOException {
        this.f24034f.s();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sa
    public final void n(dw dwVar) {
        this.f24038j = dwVar;
        this.f24031c.o();
        nt ntVar = this.f24031c;
        Looper looperMyLooper = Looper.myLooper();
        af.s(looperMyLooper);
        ntVar.q(looperMyLooper, u());
        this.f24034f.v(this.f24030b.f19027a, x(null), this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tg
    public final void o(td tdVar) {
        ((pa) tdVar).r();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sa
    public final void p() {
        this.f24034f.w();
        this.f24031c.p();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tg
    public final td q(te teVar, wr wrVar, long j9) {
        tj tjVarX = x(teVar);
        return new pa(this.f24029a, this.f24034f, this.f24039k, this.f24038j, this.f24031c, v(teVar), this.f24040l, tjVarX, wrVar, this.f24041m, true, 1, u(), null, null, null, null);
    }
}
