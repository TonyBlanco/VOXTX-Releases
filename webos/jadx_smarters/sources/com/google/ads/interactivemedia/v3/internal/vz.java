package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes3.dex */
final class vz extends wb implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f24931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f24932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f24933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f24934h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f24935i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f24936j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f24937k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f24938l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f24939m;

    /* JADX WARN: Multi-variable type inference failed */
    public vz(int i9, bf bfVar, int i10, vu vuVar, int i11, String str) {
        int iB;
        super(i9, bfVar, i10);
        int i12 = 0;
        this.f24932f = wd.j(i11, false);
        int i13 = this.f24944d.f24459d;
        int i14 = vuVar.f21464v;
        this.f24933g = 1 == (i13 & 1);
        this.f24934h = (i13 & 2) != 0;
        avo avoVarP = vuVar.f21462t.isEmpty() ? avo.p("") : vuVar.f21462t;
        int i15 = 0;
        while (true) {
            if (i15 >= avoVarP.size()) {
                i15 = a.e.API_PRIORITY_OTHER;
                iB = 0;
                break;
            } else {
                iB = wd.b(this.f24944d, (String) avoVarP.get(i15), false);
                if (iB > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.f24935i = i15;
        this.f24936j = iB;
        int iA = wd.a(this.f24944d.f24460e, vuVar.f21463u);
        this.f24937k = iA;
        this.f24939m = (this.f24944d.f24460e & 1088) != 0;
        int iB2 = wd.b(this.f24944d, str, wd.e(str) == null);
        this.f24938l = iB2;
        boolean z9 = iB > 0 || (vuVar.f21462t.isEmpty() && iA > 0) || this.f24933g || (this.f24934h && iB2 > 0);
        if (wd.j(i11, vuVar.f24919M) && z9) {
            i12 = 1;
        }
        this.f24931e = i12;
    }

    public static avo d(int i9, bf bfVar, vu vuVar, int[] iArr, String str) {
        avk avkVarJ = avo.j();
        for (int i10 = 0; i10 < bfVar.f21163a; i10++) {
            avkVarJ.g(new vz(i9, bfVar, i10, vuVar, iArr[i10], str));
        }
        return avkVarJ.f();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(vz vzVar) {
        aut autVarB = aut.j().d(this.f24932f, vzVar.f24932f).c(Integer.valueOf(this.f24935i), Integer.valueOf(vzVar.f24935i), awy.c().a()).b(this.f24936j, vzVar.f24936j).b(this.f24937k, vzVar.f24937k).d(this.f24933g, vzVar.f24933g).c(Boolean.valueOf(this.f24934h), Boolean.valueOf(vzVar.f24934h), this.f24936j == 0 ? awy.c() : awy.c().a()).b(this.f24938l, vzVar.f24938l);
        if (this.f24937k == 0) {
            autVarB = autVarB.e(this.f24939m, vzVar.f24939m);
        }
        return autVarB.a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wb
    public final int b() {
        return this.f24931e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wb
    public final /* bridge */ /* synthetic */ boolean c(wb wbVar) {
        return false;
    }
}
