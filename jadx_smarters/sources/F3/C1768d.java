package f3;

import d4.AbstractC1681B;
import d4.M;
import d4.k0;

/* JADX INFO: renamed from: f3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1768d implements InterfaceC1765a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f40590f;

    public C1768d(int i9, int i10, int i11, int i12, int i13, int i14) {
        this.f40585a = i9;
        this.f40586b = i10;
        this.f40587c = i11;
        this.f40588d = i12;
        this.f40589e = i13;
        this.f40590f = i14;
    }

    public static C1768d c(M m9) {
        int iU = m9.u();
        m9.V(12);
        int iU2 = m9.u();
        int iU3 = m9.u();
        int iU4 = m9.u();
        m9.V(4);
        int iU5 = m9.u();
        int iU6 = m9.u();
        m9.V(8);
        return new C1768d(iU, iU2, iU3, iU4, iU5, iU6);
    }

    public long a() {
        return k0.c1(this.f40589e, ((long) this.f40587c) * 1000000, this.f40588d);
    }

    public int b() {
        int i9 = this.f40585a;
        if (i9 == 1935960438) {
            return 2;
        }
        if (i9 == 1935963489) {
            return 1;
        }
        if (i9 == 1937012852) {
            return 3;
        }
        AbstractC1681B.j("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f40585a));
        return -1;
    }

    @Override // f3.InterfaceC1765a
    public int getType() {
        return 1752331379;
    }
}
