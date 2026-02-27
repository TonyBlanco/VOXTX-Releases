package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseArray;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class ut implements zk, uv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ur f24768a = ur.f24760a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final zy f24769c = new zy();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zh f24770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f24771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1333s f24772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SparseArray f24773g = new SparseArray();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f24774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f24775i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private aab f24776j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C1333s[] f24777k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private zo f24778l;

    public ut(zh zhVar, int i9, C1333s c1333s) {
        this.f24770d = zhVar;
        this.f24771e = i9;
        this.f24772f = c1333s;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uv
    public final yz a() {
        aab aabVar = this.f24776j;
        if (aabVar instanceof yz) {
            return (yz) aabVar;
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uv
    public final void b() {
        this.f24770d.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uv
    public final boolean c(zi ziVar) throws IOException {
        int iA = this.f24770d.a(ziVar, f24769c);
        af.w(iA != 1);
        return iA == 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uv
    public final C1333s[] d() {
        return this.f24777k;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uv
    public final void e(zo zoVar, long j9, long j10) {
        this.f24778l = zoVar;
        this.f24775i = j10;
        if (!this.f24774h) {
            this.f24770d.b(this);
            if (j9 != -9223372036854775807L) {
                this.f24770d.d(0L, j9);
            }
            this.f24774h = true;
            return;
        }
        zh zhVar = this.f24770d;
        if (j9 == -9223372036854775807L) {
            j9 = 0;
        }
        zhVar.d(0L, j9);
        for (int i9 = 0; i9 < this.f24773g.size(); i9++) {
            ((us) this.f24773g.valueAt(i9)).c(zoVar, j10);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zk
    public final aae i(int i9, int i10) {
        us usVar = (us) this.f24773g.get(i9);
        if (usVar == null) {
            af.w(this.f24777k == null);
            usVar = new us(i9, i10, i10 == this.f24771e ? this.f24772f : null);
            usVar.c(this.f24778l, this.f24775i);
            this.f24773g.put(i9, usVar);
        }
        return usVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zk
    public final void n() {
        C1333s[] c1333sArr = new C1333s[this.f24773g.size()];
        for (int i9 = 0; i9 < this.f24773g.size(); i9++) {
            C1333s c1333s = ((us) this.f24773g.valueAt(i9)).f24761a;
            af.t(c1333s);
            c1333sArr[i9] = c1333s;
        }
        this.f24777k = c1333sArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zk
    public final void x(aab aabVar) {
        this.f24776j = aabVar;
    }
}
