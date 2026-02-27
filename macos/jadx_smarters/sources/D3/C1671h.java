package d3;

import O2.C0936z0;
import b4.InterfaceC1220k;
import d3.w;
import d4.M;
import java.io.EOFException;

/* JADX INFO: renamed from: d3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1671h implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f39599a = new byte[4096];

    @Override // d3.w
    public /* synthetic */ int a(InterfaceC1220k interfaceC1220k, int i9, boolean z9) {
        return v.a(this, interfaceC1220k, i9, z9);
    }

    @Override // d3.w
    public /* synthetic */ void b(M m9, int i9) {
        v.b(this, m9, i9);
    }

    @Override // d3.w
    public void c(M m9, int i9, int i10) {
        m9.V(i9);
    }

    @Override // d3.w
    public void d(C0936z0 c0936z0) {
    }

    @Override // d3.w
    public int e(InterfaceC1220k interfaceC1220k, int i9, boolean z9, int i10) throws EOFException {
        int i11 = interfaceC1220k.read(this.f39599a, 0, Math.min(this.f39599a.length, i9));
        if (i11 != -1) {
            return i11;
        }
        if (z9) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // d3.w
    public void f(long j9, int i9, int i10, int i11, w.a aVar) {
    }
}
