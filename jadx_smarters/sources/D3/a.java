package D3;

import O2.C0936z0;
import b4.C1227s;
import b4.InterfaceC1224o;
import d4.AbstractC1684a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f1349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f1350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c f1351n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f1352o;

    public a(InterfaceC1224o interfaceC1224o, C1227s c1227s, C0936z0 c0936z0, int i9, Object obj, long j9, long j10, long j11, long j12, long j13) {
        super(interfaceC1224o, c1227s, c0936z0, i9, obj, j9, j10, j13);
        this.f1349l = j11;
        this.f1350m = j12;
    }

    public final int i(int i9) {
        return ((int[]) AbstractC1684a.i(this.f1352o))[i9];
    }

    public final c j() {
        return (c) AbstractC1684a.i(this.f1351n);
    }

    public void k(c cVar) {
        this.f1351n = cVar;
        this.f1352o = cVar.a();
    }
}
