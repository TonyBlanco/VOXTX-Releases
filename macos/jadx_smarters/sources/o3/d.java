package o3;

import O2.C0897l1;
import android.util.Pair;
import d3.InterfaceC1673j;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.M;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f45806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f45807b;

        public a(int i9, long j9) {
            this.f45806a = i9;
            this.f45807b = j9;
        }

        public static a a(InterfaceC1673j interfaceC1673j, M m9) {
            interfaceC1673j.s(m9.e(), 0, 8);
            m9.U(0);
            return new a(m9.q(), m9.x());
        }
    }

    public static boolean a(InterfaceC1673j interfaceC1673j) {
        M m9 = new M(8);
        int i9 = a.a(interfaceC1673j, m9).f45806a;
        if (i9 != 1380533830 && i9 != 1380333108) {
            return false;
        }
        interfaceC1673j.s(m9.e(), 0, 4);
        m9.U(0);
        int iQ = m9.q();
        if (iQ == 1463899717) {
            return true;
        }
        AbstractC1681B.d("WavHeaderReader", "Unsupported form type: " + iQ);
        return false;
    }

    public static c b(InterfaceC1673j interfaceC1673j) throws C0897l1 {
        byte[] bArr;
        M m9 = new M(16);
        a aVarD = d(1718449184, interfaceC1673j, m9);
        AbstractC1684a.g(aVarD.f45807b >= 16);
        interfaceC1673j.s(m9.e(), 0, 16);
        m9.U(0);
        int iZ = m9.z();
        int iZ2 = m9.z();
        int iY = m9.y();
        int iY2 = m9.y();
        int iZ3 = m9.z();
        int iZ4 = m9.z();
        int i9 = ((int) aVarD.f45807b) - 16;
        if (i9 > 0) {
            byte[] bArr2 = new byte[i9];
            interfaceC1673j.s(bArr2, 0, i9);
            bArr = bArr2;
        } else {
            bArr = k0.f39782f;
        }
        interfaceC1673j.q((int) (interfaceC1673j.k() - interfaceC1673j.getPosition()));
        return new c(iZ, iZ2, iY, iY2, iZ3, iZ4, bArr);
    }

    public static long c(InterfaceC1673j interfaceC1673j) {
        M m9 = new M(8);
        a aVarA = a.a(interfaceC1673j, m9);
        if (aVarA.f45806a != 1685272116) {
            interfaceC1673j.f();
            return -1L;
        }
        interfaceC1673j.n(8);
        m9.U(0);
        interfaceC1673j.s(m9.e(), 0, 8);
        long jV = m9.v();
        interfaceC1673j.q(((int) aVarA.f45807b) + 8);
        return jV;
    }

    public static a d(int i9, InterfaceC1673j interfaceC1673j, M m9) throws C0897l1 {
        while (true) {
            a aVarA = a.a(interfaceC1673j, m9);
            if (aVarA.f45806a == i9) {
                return aVarA;
            }
            AbstractC1681B.j("WavHeaderReader", "Ignoring unknown WAV chunk: " + aVarA.f45806a);
            long j9 = aVarA.f45807b + 8;
            if (j9 > 2147483647L) {
                throw C0897l1.e("Chunk is too large (~2GB+) to skip; id: " + aVarA.f45806a);
            }
            interfaceC1673j.q((int) j9);
        }
    }

    public static Pair e(InterfaceC1673j interfaceC1673j) throws C0897l1 {
        interfaceC1673j.f();
        a aVarD = d(1684108385, interfaceC1673j, new M(8));
        interfaceC1673j.q(8);
        return Pair.create(Long.valueOf(interfaceC1673j.getPosition()), Long.valueOf(aVarD.f45807b));
    }
}
