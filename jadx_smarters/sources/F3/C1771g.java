package f3;

import O2.C0936z0;
import d4.AbstractC1681B;
import d4.M;
import d4.k0;
import s5.AbstractC2743y;

/* JADX INFO: renamed from: f3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1771g implements InterfaceC1765a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0936z0 f40605a;

    public C1771g(C0936z0 c0936z0) {
        this.f40605a = c0936z0;
    }

    public static String a(int i9) {
        switch (i9) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    public static String b(int i9) {
        if (i9 == 1) {
            return "audio/raw";
        }
        if (i9 == 85) {
            return "audio/mpeg";
        }
        if (i9 == 255) {
            return "audio/mp4a-latm";
        }
        if (i9 == 8192) {
            return "audio/ac3";
        }
        if (i9 != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    public static InterfaceC1765a c(M m9) {
        m9.V(4);
        int iU = m9.u();
        int iU2 = m9.u();
        m9.V(4);
        int iU3 = m9.u();
        String strA = a(iU3);
        if (strA != null) {
            C0936z0.b bVar = new C0936z0.b();
            bVar.n0(iU).S(iU2).g0(strA);
            return new C1771g(bVar.G());
        }
        AbstractC1681B.j("StreamFormatChunk", "Ignoring track with unsupported compression " + iU3);
        return null;
    }

    public static InterfaceC1765a d(int i9, M m9) {
        if (i9 == 2) {
            return c(m9);
        }
        if (i9 == 1) {
            return e(m9);
        }
        AbstractC1681B.j("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + k0.r0(i9));
        return null;
    }

    public static InterfaceC1765a e(M m9) {
        int iZ = m9.z();
        String strB = b(iZ);
        if (strB == null) {
            AbstractC1681B.j("StreamFormatChunk", "Ignoring track with unsupported format tag " + iZ);
            return null;
        }
        int iZ2 = m9.z();
        int iU = m9.u();
        m9.V(6);
        int iH0 = k0.h0(m9.N());
        int iZ3 = m9.z();
        byte[] bArr = new byte[iZ3];
        m9.l(bArr, 0, iZ3);
        C0936z0.b bVar = new C0936z0.b();
        bVar.g0(strB).J(iZ2).h0(iU);
        if ("audio/raw".equals(strB) && iH0 != 0) {
            bVar.a0(iH0);
        }
        if ("audio/mp4a-latm".equals(strB) && iZ3 > 0) {
            bVar.V(AbstractC2743y.A(bArr));
        }
        return new C1771g(bVar.G());
    }

    @Override // f3.InterfaceC1765a
    public int getType() {
        return 1718776947;
    }
}
