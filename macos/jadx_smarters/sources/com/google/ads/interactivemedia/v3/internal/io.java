package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class io {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ip f23272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f23275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private te f23276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f23278g;

    public io(ip ipVar, String str, int i9, te teVar) {
        this.f23272a = ipVar;
        this.f23273b = str;
        this.f23274c = i9;
        this.f23275d = teVar == null ? -1L : teVar.f20176d;
        if (teVar == null || !teVar.b()) {
            return;
        }
        this.f23276e = teVar;
    }

    public final void e(int i9, te teVar) {
        if (this.f23275d == -1 && i9 == this.f23274c && teVar != null) {
            this.f23275d = teVar.f20176d;
        }
    }

    public final boolean h(int i9, te teVar) {
        if (teVar == null) {
            return i9 == this.f23274c;
        }
        te teVar2 = this.f23276e;
        return teVar2 == null ? !teVar.b() && teVar.f20176d == this.f23275d : teVar.f20176d == teVar2.f20176d && teVar.f20174b == teVar2.f20174b && teVar.f20175c == teVar2.f20175c;
    }

    public final boolean i(hv hvVar) {
        long j9 = this.f23275d;
        if (j9 == -1) {
            return false;
        }
        te teVar = hvVar.f23196d;
        if (teVar == null) {
            return this.f23274c != hvVar.f23195c;
        }
        if (teVar.f20176d > j9) {
            return true;
        }
        if (this.f23276e == null) {
            return false;
        }
        int iA = hvVar.f23194b.a(teVar.f20173a);
        int iA2 = hvVar.f23194b.a(this.f23276e.f20173a);
        te teVar2 = hvVar.f23196d;
        if (teVar2.f20176d < this.f23276e.f20176d || iA < iA2) {
            return false;
        }
        if (iA > iA2) {
            return true;
        }
        boolean zB = teVar2.b();
        te teVar3 = hvVar.f23196d;
        if (!zB) {
            int i9 = teVar3.f20177e;
            return i9 == -1 || i9 > this.f23276e.f20174b;
        }
        int i10 = teVar3.f20174b;
        int i11 = teVar3.f20175c;
        te teVar4 = this.f23276e;
        int i12 = teVar4.f20174b;
        return i10 > i12 || (i10 == i12 && i11 > teVar4.f20175c);
    }

    public final boolean j(be beVar, be beVar2) {
        int i9 = this.f23274c;
        if (i9 < beVar.c()) {
            beVar.o(i9, this.f23272a.f23281c);
            for (int i10 = this.f23272a.f23281c.f21076o; i10 <= this.f23272a.f23281c.f21077p; i10++) {
                int iA = beVar2.a(beVar.f(i10));
                if (iA != -1) {
                    i9 = beVar2.m(iA, this.f23272a.f23282d).f21037c;
                    break;
                }
            }
            i9 = -1;
        } else if (i9 >= beVar2.c()) {
            i9 = -1;
        }
        this.f23274c = i9;
        if (i9 == -1) {
            return false;
        }
        te teVar = this.f23276e;
        return teVar == null || beVar2.a(teVar.f20173a) != -1;
    }
}
