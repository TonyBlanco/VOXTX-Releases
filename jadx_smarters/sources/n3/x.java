package n3;

import com.google.android.exoplayer2.extractor.a;
import d3.InterfaceC1673j;
import d4.M;
import d4.Z;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends com.google.android.exoplayer2.extractor.a {

    public static final class b implements a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Z f45251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final M f45252b;

        public b(Z z9) {
            this.f45251a = z9;
            this.f45252b = new M();
        }

        public static void d(M m9) {
            int iK;
            int iG = m9.g();
            if (m9.a() < 10) {
                m9.U(iG);
                return;
            }
            m9.V(9);
            int iH = m9.H() & 7;
            if (m9.a() < iH) {
                m9.U(iG);
                return;
            }
            m9.V(iH);
            if (m9.a() < 4) {
                m9.U(iG);
                return;
            }
            if (x.k(m9.e(), m9.f()) == 443) {
                m9.V(4);
                int iN = m9.N();
                if (m9.a() < iN) {
                    m9.U(iG);
                    return;
                }
                m9.V(iN);
            }
            while (m9.a() >= 4 && (iK = x.k(m9.e(), m9.f())) != 442 && iK != 441 && (iK >>> 8) == 1) {
                m9.V(4);
                if (m9.a() < 2) {
                    m9.U(iG);
                    return;
                }
                m9.U(Math.min(m9.g(), m9.f() + m9.N()));
            }
        }

        @Override // com.google.android.exoplayer2.extractor.a.f
        public a.e a(InterfaceC1673j interfaceC1673j, long j9) {
            long position = interfaceC1673j.getPosition();
            int iMin = (int) Math.min(20000L, interfaceC1673j.getLength() - position);
            this.f45252b.Q(iMin);
            interfaceC1673j.s(this.f45252b.e(), 0, iMin);
            return c(this.f45252b, j9, position);
        }

        @Override // com.google.android.exoplayer2.extractor.a.f
        public void b() {
            this.f45252b.R(k0.f39782f);
        }

        public final a.e c(M m9, long j9, long j10) {
            int iF = -1;
            long j11 = -9223372036854775807L;
            int iF2 = -1;
            while (m9.a() >= 4) {
                if (x.k(m9.e(), m9.f()) != 442) {
                    m9.V(1);
                } else {
                    m9.V(4);
                    long jL = y.l(m9);
                    if (jL != -9223372036854775807L) {
                        long jB = this.f45251a.b(jL);
                        if (jB > j9) {
                            return j11 == -9223372036854775807L ? a.e.d(jB, j10) : a.e.e(j10 + ((long) iF2));
                        }
                        if (100000 + jB > j9) {
                            return a.e.e(j10 + ((long) m9.f()));
                        }
                        iF2 = m9.f();
                        j11 = jB;
                    }
                    d(m9);
                    iF = m9.f();
                }
            }
            return j11 != -9223372036854775807L ? a.e.f(j11, j10 + ((long) iF)) : a.e.f25398d;
        }
    }

    public x(Z z9, long j9, long j10) {
        super(new a.b(), new b(z9), j9, 0L, j9 + 1, 0L, j10, 188L, 1000);
    }

    public static int k(byte[] bArr, int i9) {
        return (bArr[i9 + 3] & 255) | ((bArr[i9] & 255) << 24) | ((bArr[i9 + 1] & 255) << 16) | ((bArr[i9 + 2] & 255) << 8);
    }
}
