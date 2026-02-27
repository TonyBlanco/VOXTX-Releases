package d3;

import d4.M;
import java.io.EOFException;
import q3.C2540a;
import v3.h;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f39607a = new M(10);

    public C2540a a(InterfaceC1673j interfaceC1673j, h.a aVar) {
        C2540a c2540aE = null;
        int i9 = 0;
        while (true) {
            try {
                interfaceC1673j.s(this.f39607a.e(), 0, 10);
                this.f39607a.U(0);
                if (this.f39607a.K() != 4801587) {
                    break;
                }
                this.f39607a.V(3);
                int iG = this.f39607a.G();
                int i10 = iG + 10;
                if (c2540aE == null) {
                    byte[] bArr = new byte[i10];
                    System.arraycopy(this.f39607a.e(), 0, bArr, 0, 10);
                    interfaceC1673j.s(bArr, 10, iG);
                    c2540aE = new v3.h(aVar).e(bArr, i10);
                } else {
                    interfaceC1673j.n(iG);
                }
                i9 += i10;
            } catch (EOFException unused) {
            }
        }
        interfaceC1673j.f();
        interfaceC1673j.n(i9);
        return c2540aE;
    }
}
