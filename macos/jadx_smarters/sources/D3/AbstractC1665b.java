package d3;

import d4.AbstractC1681B;
import d4.M;

/* JADX INFO: renamed from: d3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1665b {
    public static void a(long j9, M m9, w[] wVarArr) {
        while (true) {
            if (m9.a() <= 1) {
                return;
            }
            int iC = c(m9);
            int iC2 = c(m9);
            int iF = m9.f() + iC2;
            if (iC2 == -1 || iC2 > m9.a()) {
                AbstractC1681B.j("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iF = m9.g();
            } else if (iC == 4 && iC2 >= 8) {
                int iH = m9.H();
                int iN = m9.N();
                int iQ = iN == 49 ? m9.q() : 0;
                int iH2 = m9.H();
                if (iN == 47) {
                    m9.V(1);
                }
                boolean z9 = iH == 181 && (iN == 49 || iN == 47) && iH2 == 3;
                if (iN == 49) {
                    z9 &= iQ == 1195456820;
                }
                if (z9) {
                    b(j9, m9, wVarArr);
                }
            }
            m9.U(iF);
        }
    }

    public static void b(long j9, M m9, w[] wVarArr) {
        int iH = m9.H();
        if ((iH & 64) != 0) {
            m9.V(1);
            int i9 = (iH & 31) * 3;
            int iF = m9.f();
            for (w wVar : wVarArr) {
                m9.U(iF);
                wVar.b(m9, i9);
                if (j9 != -9223372036854775807L) {
                    wVar.f(j9, 1, i9, 0, null);
                }
            }
        }
    }

    public static int c(M m9) {
        int i9 = 0;
        while (m9.a() != 0) {
            int iH = m9.H();
            i9 += iH;
            if (iH != 255) {
                return i9;
            }
        }
        return -1;
    }
}
