package U2;

import O2.C0936z0;
import d4.AbstractC1684a;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0936z0 f9708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0936z0 f9709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9711e;

    public h(String str, C0936z0 c0936z0, C0936z0 c0936z02, int i9, int i10) {
        AbstractC1684a.a(i9 == 0 || i10 == 0);
        this.f9707a = AbstractC1684a.d(str);
        this.f9708b = (C0936z0) AbstractC1684a.e(c0936z0);
        this.f9709c = (C0936z0) AbstractC1684a.e(c0936z02);
        this.f9710d = i9;
        this.f9711e = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f9710d == hVar.f9710d && this.f9711e == hVar.f9711e && this.f9707a.equals(hVar.f9707a) && this.f9708b.equals(hVar.f9708b) && this.f9709c.equals(hVar.f9709c);
    }

    public int hashCode() {
        return ((((((((527 + this.f9710d) * 31) + this.f9711e) * 31) + this.f9707a.hashCode()) * 31) + this.f9708b.hashCode()) * 31) + this.f9709c.hashCode();
    }
}
