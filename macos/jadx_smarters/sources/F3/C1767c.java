package f3;

import d4.M;

/* JADX INFO: renamed from: f3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1767c implements InterfaceC1765a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40584d;

    public C1767c(int i9, int i10, int i11, int i12) {
        this.f40581a = i9;
        this.f40582b = i10;
        this.f40583c = i11;
        this.f40584d = i12;
    }

    public static C1767c b(M m9) {
        int iU = m9.u();
        m9.V(8);
        int iU2 = m9.u();
        int iU3 = m9.u();
        m9.V(4);
        int iU4 = m9.u();
        m9.V(12);
        return new C1767c(iU, iU2, iU3, iU4);
    }

    public boolean a() {
        return (this.f40582b & 16) == 16;
    }

    @Override // f3.InterfaceC1765a
    public int getType() {
        return 1751742049;
    }
}
