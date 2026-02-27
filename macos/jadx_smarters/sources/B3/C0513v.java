package B3;

import B3.C;
import B3.InterfaceC0517z;
import O2.H1;
import b4.InterfaceC1211b;
import d4.AbstractC1684a;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: B3.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0513v implements InterfaceC0517z, InterfaceC0517z.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C.b f640a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1211b f642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C f643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC0517z f644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC0517z.a f645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f646h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f647i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f648j = -9223372036854775807L;

    /* JADX INFO: renamed from: B3.v$a */
    public interface a {
        void a(C.b bVar);

        void b(C.b bVar, IOException iOException);
    }

    public C0513v(C.b bVar, InterfaceC1211b interfaceC1211b, long j9) {
        this.f640a = bVar;
        this.f642d = interfaceC1211b;
        this.f641c = j9;
    }

    public void a(C.b bVar) {
        long jR = r(this.f641c);
        InterfaceC0517z interfaceC0517zE = ((C) AbstractC1684a.e(this.f643e)).E(bVar, this.f642d, jR);
        this.f644f = interfaceC0517zE;
        if (this.f645g != null) {
            interfaceC0517zE.s(this, jR);
        }
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public boolean b() {
        InterfaceC0517z interfaceC0517z = this.f644f;
        return interfaceC0517z != null && interfaceC0517z.b();
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public long c() {
        return ((InterfaceC0517z) d4.k0.j(this.f644f)).c();
    }

    @Override // B3.InterfaceC0517z
    public long d(long j9, H1 h12) {
        return ((InterfaceC0517z) d4.k0.j(this.f644f)).d(j9, h12);
    }

    @Override // B3.InterfaceC0517z.a
    public void e(InterfaceC0517z interfaceC0517z) {
        ((InterfaceC0517z.a) d4.k0.j(this.f645g)).e(this);
        a aVar = this.f646h;
        if (aVar != null) {
            aVar.a(this.f640a);
        }
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public boolean f(long j9) {
        InterfaceC0517z interfaceC0517z = this.f644f;
        return interfaceC0517z != null && interfaceC0517z.f(j9);
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public long g() {
        return ((InterfaceC0517z) d4.k0.j(this.f644f)).g();
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public void h(long j9) {
        ((InterfaceC0517z) d4.k0.j(this.f644f)).h(j9);
    }

    @Override // B3.InterfaceC0517z
    public long i(Z3.s[] sVarArr, boolean[] zArr, Y[] yArr, boolean[] zArr2, long j9) {
        long j10;
        long j11 = this.f648j;
        if (j11 == -9223372036854775807L || j9 != this.f641c) {
            j10 = j9;
        } else {
            this.f648j = -9223372036854775807L;
            j10 = j11;
        }
        return ((InterfaceC0517z) d4.k0.j(this.f644f)).i(sVarArr, zArr, yArr, zArr2, j10);
    }

    @Override // B3.InterfaceC0517z
    public /* synthetic */ List k(List list) {
        return AbstractC0516y.a(this, list);
    }

    @Override // B3.InterfaceC0517z
    public long l(long j9) {
        return ((InterfaceC0517z) d4.k0.j(this.f644f)).l(j9);
    }

    @Override // B3.InterfaceC0517z
    public long m() {
        return ((InterfaceC0517z) d4.k0.j(this.f644f)).m();
    }

    public long o() {
        return this.f648j;
    }

    @Override // B3.InterfaceC0517z
    public void p() throws IOException {
        try {
            InterfaceC0517z interfaceC0517z = this.f644f;
            if (interfaceC0517z != null) {
                interfaceC0517z.p();
            } else {
                C c9 = this.f643e;
                if (c9 != null) {
                    c9.P();
                }
            }
        } catch (IOException e9) {
            a aVar = this.f646h;
            if (aVar == null) {
                throw e9;
            }
            if (this.f647i) {
                return;
            }
            this.f647i = true;
            aVar.b(this.f640a, e9);
        }
    }

    public long q() {
        return this.f641c;
    }

    public final long r(long j9) {
        long j10 = this.f648j;
        return j10 != -9223372036854775807L ? j10 : j9;
    }

    @Override // B3.InterfaceC0517z
    public void s(InterfaceC0517z.a aVar, long j9) {
        this.f645g = aVar;
        InterfaceC0517z interfaceC0517z = this.f644f;
        if (interfaceC0517z != null) {
            interfaceC0517z.s(this, r(this.f641c));
        }
    }

    @Override // B3.Z.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void j(InterfaceC0517z interfaceC0517z) {
        ((InterfaceC0517z.a) d4.k0.j(this.f645g)).j(this);
    }

    @Override // B3.InterfaceC0517z
    public i0 u() {
        return ((InterfaceC0517z) d4.k0.j(this.f644f)).u();
    }

    @Override // B3.InterfaceC0517z
    public void v(long j9, boolean z9) {
        ((InterfaceC0517z) d4.k0.j(this.f644f)).v(j9, z9);
    }

    public void w(long j9) {
        this.f648j = j9;
    }

    public void x() {
        if (this.f644f != null) {
            ((C) AbstractC1684a.e(this.f643e)).Y(this.f644f);
        }
    }

    public void y(C c9) {
        AbstractC1684a.g(this.f643e == null);
        this.f643e = c9;
    }

    public void z(a aVar) {
        this.f646h = aVar;
    }
}
