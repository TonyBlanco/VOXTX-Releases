package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
final class vr extends wb implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f24880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f24881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f24882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final vu f24883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f24884i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f24885j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f24886k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f24887l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f24888m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f24889n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f24890o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f24891p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f24892q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f24893r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f24894s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f24895t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f24896u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f24897v;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vr(int r6, com.google.ads.interactivemedia.v3.internal.bf r7, int r8, com.google.ads.interactivemedia.v3.internal.vu r9, int r10, boolean r11, com.google.ads.interactivemedia.v3.internal.atm r12) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.vr.<init>(int, com.google.ads.interactivemedia.v3.internal.bf, int, com.google.ads.interactivemedia.v3.internal.vu, int, boolean, com.google.ads.interactivemedia.v3.internal.atm):void");
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(vr vrVar) {
        awy awyVarA = (this.f24881f && this.f24884i) ? wd.f24960b : wd.f24960b.a();
        aut autVarC = aut.j().d(this.f24884i, vrVar.f24884i).c(Integer.valueOf(this.f24886k), Integer.valueOf(vrVar.f24886k), awy.c().a()).b(this.f24885j, vrVar.f24885j).b(this.f24887l, vrVar.f24887l).d(this.f24891p, vrVar.f24891p).d(this.f24888m, vrVar.f24888m).c(Integer.valueOf(this.f24889n), Integer.valueOf(vrVar.f24889n), awy.c().a()).b(this.f24890o, vrVar.f24890o).d(this.f24881f, vrVar.f24881f).c(Integer.valueOf(this.f24895t), Integer.valueOf(vrVar.f24895t), awy.c().a());
        Integer numValueOf = Integer.valueOf(this.f24894s);
        Integer numValueOf2 = Integer.valueOf(vrVar.f24894s);
        boolean z9 = this.f24883h.f21466x;
        aut autVarC2 = autVarC.c(numValueOf, numValueOf2, wd.f24961c).d(this.f24896u, vrVar.f24896u).d(this.f24897v, vrVar.f24897v).c(Integer.valueOf(this.f24892q), Integer.valueOf(vrVar.f24892q), awyVarA).c(Integer.valueOf(this.f24893r), Integer.valueOf(vrVar.f24893r), awyVarA);
        Integer numValueOf3 = Integer.valueOf(this.f24894s);
        Integer numValueOf4 = Integer.valueOf(vrVar.f24894s);
        if (!cq.V(this.f24882g, vrVar.f24882g)) {
            awyVarA = wd.f24961c;
        }
        return autVarC2.c(numValueOf3, numValueOf4, awyVarA).a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wb
    public final int b() {
        return this.f24880e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wb
    public final /* bridge */ /* synthetic */ boolean c(wb wbVar) {
        String str;
        vr vrVar = (vr) wbVar;
        boolean z9 = this.f24883h.f24916J;
        C1333s c1333s = this.f24944d;
        int i9 = c1333s.f24480y;
        if (i9 == -1) {
            return false;
        }
        C1333s c1333s2 = vrVar.f24944d;
        if (i9 != c1333s2.f24480y || (str = c1333s.f24467l) == null || !TextUtils.equals(str, c1333s2.f24467l)) {
            return false;
        }
        boolean z10 = this.f24883h.f24915I;
        int i10 = this.f24944d.f24481z;
        return i10 != -1 && i10 == vrVar.f24944d.f24481z && this.f24896u == vrVar.f24896u && this.f24897v == vrVar.f24897v;
    }
}
