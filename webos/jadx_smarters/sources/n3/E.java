package n3;

import com.google.android.exoplayer2.extractor.a;
import d3.InterfaceC1673j;
import d4.M;
import d4.Z;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class E extends com.google.android.exoplayer2.extractor.a {

    public static final class a implements a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Z f44927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final M f44928b = new M();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f44929c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f44930d;

        public a(int i9, Z z9, int i10) {
            this.f44929c = i9;
            this.f44927a = z9;
            this.f44930d = i10;
        }

        @Override // com.google.android.exoplayer2.extractor.a.f
        public a.e a(InterfaceC1673j interfaceC1673j, long j9) {
            long position = interfaceC1673j.getPosition();
            int iMin = (int) Math.min(this.f44930d, interfaceC1673j.getLength() - position);
            this.f44928b.Q(iMin);
            interfaceC1673j.s(this.f44928b.e(), 0, iMin);
            return c(this.f44928b, j9, position);
        }

        @Override // com.google.android.exoplayer2.extractor.a.f
        public void b() {
            this.f44928b.R(k0.f39782f);
        }

        public final a.e c(M m9, long j9, long j10) {
            int iA;
            int iA2;
            int iG = m9.g();
            long j11 = -1;
            long j12 = -1;
            long j13 = -9223372036854775807L;
            while (m9.a() >= 188 && (iA2 = (iA = J.a(m9.e(), m9.f(), iG)) + 188) <= iG) {
                long jC = J.c(m9, iA, this.f44929c);
                if (jC != -9223372036854775807L) {
                    long jB = this.f44927a.b(jC);
                    if (jB > j9) {
                        return j13 == -9223372036854775807L ? a.e.d(jB, j10) : a.e.e(j10 + j12);
                    }
                    if (100000 + jB > j9) {
                        return a.e.e(j10 + ((long) iA));
                    }
                    j12 = iA;
                    j13 = jB;
                }
                m9.U(iA2);
                j11 = iA2;
            }
            return j13 != -9223372036854775807L ? a.e.f(j13, j10 + j11) : a.e.f25398d;
        }
    }

    public E(Z z9, long j9, long j10, int i9, int i10) {
        super(new a.b(), new a(i9, z9, i10), j9, 0L, j9 + 1, 0L, j10, 188L, 940);
    }
}
