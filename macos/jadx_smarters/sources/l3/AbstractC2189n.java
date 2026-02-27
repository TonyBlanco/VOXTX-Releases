package l3;

import d3.InterfaceC1673j;
import d4.M;

/* JADX INFO: renamed from: l3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2189n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f44030a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(int i9, boolean z9) {
        if ((i9 >>> 8) == 3368816) {
            return true;
        }
        if (i9 == 1751476579 && z9) {
            return true;
        }
        for (int i10 : f44030a) {
            if (i10 == i9) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(InterfaceC1673j interfaceC1673j) {
        return c(interfaceC1673j, true, false);
    }

    public static boolean c(InterfaceC1673j interfaceC1673j, boolean z9, boolean z10) {
        boolean z11;
        boolean z12;
        int i9;
        long length = interfaceC1673j.getLength();
        long j9 = 4096;
        long j10 = -1;
        int i10 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if (i10 != 0 && length <= 4096) {
            j9 = length;
        }
        int i11 = (int) j9;
        M m9 = new M(64);
        boolean z13 = false;
        int i12 = 0;
        boolean z14 = false;
        while (i12 < i11) {
            m9.Q(8);
            if (!interfaceC1673j.d(m9.e(), z13 ? 1 : 0, 8, true)) {
                break;
            }
            long J9 = m9.J();
            int iQ = m9.q();
            if (J9 == 1) {
                interfaceC1673j.s(m9.e(), 8, 8);
                m9.T(16);
                J9 = m9.A();
                i9 = 16;
            } else {
                if (J9 == 0) {
                    long length2 = interfaceC1673j.getLength();
                    if (length2 != j10) {
                        J9 = (length2 - interfaceC1673j.k()) + ((long) 8);
                    }
                }
                i9 = 8;
            }
            long j11 = i9;
            if (J9 < j11) {
                return z13;
            }
            i12 += i9;
            if (iQ == 1836019574) {
                i11 += (int) J9;
                if (i10 != 0 && i11 > length) {
                    i11 = (int) length;
                }
                j10 = -1;
            } else {
                if (iQ == 1836019558 || iQ == 1836475768) {
                    z11 = true;
                    z12 = true;
                    break;
                }
                int i13 = i10;
                if ((((long) i12) + J9) - j11 >= i11) {
                    break;
                }
                int i14 = (int) (J9 - j11);
                i12 += i14;
                if (iQ == 1718909296) {
                    if (i14 < 8) {
                        return false;
                    }
                    m9.Q(i14);
                    interfaceC1673j.s(m9.e(), 0, i14);
                    int i15 = i14 / 4;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= i15) {
                            break;
                        }
                        if (i16 == 1) {
                            m9.V(4);
                        } else if (a(m9.q(), z10)) {
                            z14 = true;
                            break;
                        }
                        i16++;
                    }
                    if (!z14) {
                        return false;
                    }
                } else if (i14 != 0) {
                    interfaceC1673j.n(i14);
                }
                i10 = i13;
                j10 = -1;
                z13 = false;
            }
        }
        z11 = true;
        z12 = false;
        if (z14 && z9 == z12) {
            return z11;
        }
        return false;
    }

    public static boolean d(InterfaceC1673j interfaceC1673j, boolean z9) {
        return c(interfaceC1673j, false, z9);
    }
}
