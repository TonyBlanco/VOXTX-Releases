package k3;

import com.google.android.exoplayer2.extractor.g;
import d3.u;
import d4.C1682C;
import d4.k0;

/* JADX INFO: renamed from: k3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2139b implements InterfaceC2144g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1682C f43537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1682C f43538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f43539d;

    public C2139b(long j9, long j10, long j11) {
        this.f43539d = j9;
        this.f43536a = j11;
        C1682C c1682c = new C1682C();
        this.f43537b = c1682c;
        C1682C c1682c2 = new C1682C();
        this.f43538c = c1682c2;
        c1682c.a(0L);
        c1682c2.a(j10);
    }

    public boolean a(long j9) {
        C1682C c1682c = this.f43537b;
        return j9 - c1682c.b(c1682c.c() - 1) < 100000;
    }

    public void b(long j9, long j10) {
        if (a(j9)) {
            return;
        }
        this.f43537b.a(j9);
        this.f43538c.a(j10);
    }

    @Override // k3.InterfaceC2144g
    public long c(long j9) {
        return this.f43537b.b(k0.f(this.f43538c, j9, true, true));
    }

    public void d(long j9) {
        this.f43539d = j9;
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public g.a e(long j9) {
        int iF = k0.f(this.f43537b, j9, true, true);
        u uVar = new u(this.f43537b.b(iF), this.f43538c.b(iF));
        if (uVar.f39610a == j9 || iF == this.f43537b.c() - 1) {
            return new g.a(uVar);
        }
        int i9 = iF + 1;
        return new g.a(uVar, new u(this.f43537b.b(i9), this.f43538c.b(i9)));
    }

    @Override // k3.InterfaceC2144g
    public long f() {
        return this.f43536a;
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public boolean g() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public long i() {
        return this.f43539d;
    }
}
