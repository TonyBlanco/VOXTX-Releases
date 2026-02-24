package o3;

import O2.C0897l1;
import O2.C0936z0;
import android.net.Uri;
import android.util.Pair;
import d3.AbstractC1677n;
import d3.InterfaceC1672i;
import d3.InterfaceC1673j;
import d3.InterfaceC1674k;
import d3.InterfaceC1678o;
import d3.t;
import d3.w;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.M;
import d4.k0;
import java.util.Map;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements InterfaceC1672i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final InterfaceC1678o f45769h = new InterfaceC1678o() { // from class: o3.a
        @Override // d3.InterfaceC1678o
        public /* synthetic */ InterfaceC1672i[] a(Uri uri, Map map) {
            return AbstractC1677n.a(this, uri, map);
        }

        @Override // d3.InterfaceC1678o
        public final InterfaceC1672i[] b() {
            return b.f();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC1674k f45770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f45771b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC0405b f45774e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45772c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f45773d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45775f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f45776g = -1;

    public static final class a implements InterfaceC0405b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int[] f45777m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int[] f45778n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, HttpStatus.SC_REQUEST_TIMEOUT, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1674k f45779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w f45780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o3.c f45781c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f45782d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f45783e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final M f45784f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f45785g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final C0936z0 f45786h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f45787i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f45788j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f45789k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f45790l;

        public a(InterfaceC1674k interfaceC1674k, w wVar, o3.c cVar) throws C0897l1 {
            this.f45779a = interfaceC1674k;
            this.f45780b = wVar;
            this.f45781c = cVar;
            int iMax = Math.max(1, cVar.f45801c / 10);
            this.f45785g = iMax;
            M m9 = new M(cVar.f45805g);
            m9.z();
            int iZ = m9.z();
            this.f45782d = iZ;
            int i9 = cVar.f45800b;
            int i10 = (((cVar.f45803e - (i9 * 4)) * 8) / (cVar.f45804f * i9)) + 1;
            if (iZ == i10) {
                int iL = k0.l(iMax, iZ);
                this.f45783e = new byte[cVar.f45803e * iL];
                this.f45784f = new M(iL * h(iZ, i9));
                int i11 = ((cVar.f45801c * cVar.f45803e) * 8) / iZ;
                this.f45786h = new C0936z0.b().g0("audio/raw").I(i11).b0(i11).Y(h(iMax, i9)).J(cVar.f45800b).h0(cVar.f45801c).a0(2).G();
                return;
            }
            throw C0897l1.a("Expected frames per block: " + i10 + "; got: " + iZ, null);
        }

        public static int h(int i9, int i10) {
            return i9 * 2 * i10;
        }

        @Override // o3.b.InterfaceC0405b
        public void a(int i9, long j9) {
            this.f45779a.n(new e(this.f45781c, this.f45782d, i9, j9));
            this.f45780b.d(this.f45786h);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0036 -> B:4:0x001c). Please report as a decompilation issue!!! */
        @Override // o3.b.InterfaceC0405b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean b(d3.InterfaceC1673j r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f45785g
                int r1 = r6.f45789k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f45782d
                int r0 = d4.k0.l(r0, r1)
                o3.c r1 = r6.f45781c
                int r1 = r1.f45803e
                int r0 = r0 * r1
                r1 = 0
                r3 = 1
                int r4 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r4 != 0) goto L1e
            L1c:
                r1 = 1
                goto L1f
            L1e:
                r1 = 0
            L1f:
                if (r1 != 0) goto L3f
                int r2 = r6.f45787i
                if (r2 >= r0) goto L3f
                int r2 = r0 - r2
                long r4 = (long) r2
                long r4 = java.lang.Math.min(r4, r8)
                int r2 = (int) r4
                byte[] r4 = r6.f45783e
                int r5 = r6.f45787i
                int r2 = r7.read(r4, r5, r2)
                r4 = -1
                if (r2 != r4) goto L39
                goto L1c
            L39:
                int r4 = r6.f45787i
                int r4 = r4 + r2
                r6.f45787i = r4
                goto L1f
            L3f:
                int r7 = r6.f45787i
                o3.c r8 = r6.f45781c
                int r8 = r8.f45803e
                int r7 = r7 / r8
                if (r7 <= 0) goto L77
                byte[] r8 = r6.f45783e
                d4.M r9 = r6.f45784f
                r6.d(r8, r7, r9)
                int r8 = r6.f45787i
                o3.c r9 = r6.f45781c
                int r9 = r9.f45803e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f45787i = r8
                d4.M r7 = r6.f45784f
                int r7 = r7.g()
                d3.w r8 = r6.f45780b
                d4.M r9 = r6.f45784f
                r8.b(r9, r7)
                int r8 = r6.f45789k
                int r8 = r8 + r7
                r6.f45789k = r8
                int r7 = r6.f(r8)
                int r8 = r6.f45785g
                if (r7 < r8) goto L77
                r6.i(r8)
            L77:
                if (r1 == 0) goto L84
                int r7 = r6.f45789k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L84
                r6.i(r7)
            L84:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o3.b.a.b(d3.j, long):boolean");
        }

        @Override // o3.b.InterfaceC0405b
        public void c(long j9) {
            this.f45787i = 0;
            this.f45788j = j9;
            this.f45789k = 0;
            this.f45790l = 0L;
        }

        public final void d(byte[] bArr, int i9, M m9) {
            for (int i10 = 0; i10 < i9; i10++) {
                for (int i11 = 0; i11 < this.f45781c.f45800b; i11++) {
                    e(bArr, i10, i11, m9.e());
                }
            }
            int iG = g(this.f45782d * i9);
            m9.U(0);
            m9.T(iG);
        }

        public final void e(byte[] bArr, int i9, int i10, byte[] bArr2) {
            o3.c cVar = this.f45781c;
            int i11 = cVar.f45803e;
            int i12 = cVar.f45800b;
            int i13 = (i9 * i11) + (i10 * 4);
            int i14 = (i12 * 4) + i13;
            int i15 = (i11 / i12) - 4;
            int iR = (short) (((bArr[i13 + 1] & 255) << 8) | (bArr[i13] & 255));
            int iMin = Math.min(bArr[i13 + 2] & 255, 88);
            int i16 = f45778n[iMin];
            int i17 = ((i9 * this.f45782d * i12) + i10) * 2;
            bArr2[i17] = (byte) (iR & 255);
            bArr2[i17 + 1] = (byte) (iR >> 8);
            for (int i18 = 0; i18 < i15 * 2; i18++) {
                byte b9 = bArr[((i18 / 8) * i12 * 4) + i14 + ((i18 / 2) % 4)];
                int i19 = i18 % 2 == 0 ? b9 & 15 : (b9 & 255) >> 4;
                int i20 = ((((i19 & 7) * 2) + 1) * i16) >> 3;
                if ((i19 & 8) != 0) {
                    i20 = -i20;
                }
                iR = k0.r(iR + i20, -32768, 32767);
                i17 += i12 * 2;
                bArr2[i17] = (byte) (iR & 255);
                bArr2[i17 + 1] = (byte) (iR >> 8);
                int i21 = iMin + f45777m[i19];
                int[] iArr = f45778n;
                iMin = k0.r(i21, 0, iArr.length - 1);
                i16 = iArr[iMin];
            }
        }

        public final int f(int i9) {
            return i9 / (this.f45781c.f45800b * 2);
        }

        public final int g(int i9) {
            return h(i9, this.f45781c.f45800b);
        }

        public final void i(int i9) {
            long jC1 = this.f45788j + k0.c1(this.f45790l, 1000000L, this.f45781c.f45801c);
            int iG = g(i9);
            this.f45780b.f(jC1, 1, iG, this.f45789k - iG, null);
            this.f45790l += (long) i9;
            this.f45789k -= iG;
        }
    }

    /* JADX INFO: renamed from: o3.b$b, reason: collision with other inner class name */
    public interface InterfaceC0405b {
        void a(int i9, long j9);

        boolean b(InterfaceC1673j interfaceC1673j, long j9);

        void c(long j9);
    }

    public static final class c implements InterfaceC0405b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1674k f45791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w f45792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o3.c f45793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C0936z0 f45794d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f45795e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f45796f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f45797g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f45798h;

        public c(InterfaceC1674k interfaceC1674k, w wVar, o3.c cVar, String str, int i9) throws C0897l1 {
            this.f45791a = interfaceC1674k;
            this.f45792b = wVar;
            this.f45793c = cVar;
            int i10 = (cVar.f45800b * cVar.f45804f) / 8;
            if (cVar.f45803e == i10) {
                int i11 = cVar.f45801c;
                int i12 = i11 * i10 * 8;
                int iMax = Math.max(i10, (i11 * i10) / 10);
                this.f45795e = iMax;
                this.f45794d = new C0936z0.b().g0(str).I(i12).b0(i12).Y(iMax).J(cVar.f45800b).h0(cVar.f45801c).a0(i9).G();
                return;
            }
            throw C0897l1.a("Expected block size: " + i10 + "; got: " + cVar.f45803e, null);
        }

        @Override // o3.b.InterfaceC0405b
        public void a(int i9, long j9) {
            this.f45791a.n(new e(this.f45793c, 1, i9, j9));
            this.f45792b.d(this.f45794d);
        }

        @Override // o3.b.InterfaceC0405b
        public boolean b(InterfaceC1673j interfaceC1673j, long j9) {
            int i9;
            int i10;
            long j10 = j9;
            while (j10 > 0 && (i9 = this.f45797g) < (i10 = this.f45795e)) {
                int iA = this.f45792b.a(interfaceC1673j, (int) Math.min(i10 - i9, j10), true);
                if (iA == -1) {
                    j10 = 0;
                } else {
                    this.f45797g += iA;
                    j10 -= (long) iA;
                }
            }
            int i11 = this.f45793c.f45803e;
            int i12 = this.f45797g / i11;
            if (i12 > 0) {
                long jC1 = this.f45796f + k0.c1(this.f45798h, 1000000L, r1.f45801c);
                int i13 = i12 * i11;
                int i14 = this.f45797g - i13;
                this.f45792b.f(jC1, 1, i13, i14, null);
                this.f45798h += (long) i12;
                this.f45797g = i14;
            }
            return j10 <= 0;
        }

        @Override // o3.b.InterfaceC0405b
        public void c(long j9) {
            this.f45796f = j9;
            this.f45797g = 0;
            this.f45798h = 0L;
        }
    }

    private void e() {
        AbstractC1684a.i(this.f45771b);
        k0.j(this.f45770a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC1672i[] f() {
        return new InterfaceC1672i[]{new b()};
    }

    @Override // d3.InterfaceC1672i
    public void a(long j9, long j10) {
        this.f45772c = j9 == 0 ? 0 : 4;
        InterfaceC0405b interfaceC0405b = this.f45774e;
        if (interfaceC0405b != null) {
            interfaceC0405b.c(j10);
        }
    }

    @Override // d3.InterfaceC1672i
    public void b(InterfaceC1674k interfaceC1674k) {
        this.f45770a = interfaceC1674k;
        this.f45771b = interfaceC1674k.e(0, 1);
        interfaceC1674k.q();
    }

    @Override // d3.InterfaceC1672i
    public int d(InterfaceC1673j interfaceC1673j, t tVar) throws C0897l1 {
        e();
        int i9 = this.f45772c;
        if (i9 == 0) {
            g(interfaceC1673j);
            return 0;
        }
        if (i9 == 1) {
            j(interfaceC1673j);
            return 0;
        }
        if (i9 == 2) {
            i(interfaceC1673j);
            return 0;
        }
        if (i9 == 3) {
            l(interfaceC1673j);
            return 0;
        }
        if (i9 == 4) {
            return k(interfaceC1673j);
        }
        throw new IllegalStateException();
    }

    public final void g(InterfaceC1673j interfaceC1673j) throws C0897l1 {
        AbstractC1684a.g(interfaceC1673j.getPosition() == 0);
        int i9 = this.f45775f;
        if (i9 != -1) {
            interfaceC1673j.q(i9);
            this.f45772c = 4;
        } else {
            if (!d.a(interfaceC1673j)) {
                throw C0897l1.a("Unsupported or unrecognized wav file type.", null);
            }
            interfaceC1673j.q((int) (interfaceC1673j.k() - interfaceC1673j.getPosition()));
            this.f45772c = 1;
        }
    }

    @Override // d3.InterfaceC1672i
    public boolean h(InterfaceC1673j interfaceC1673j) {
        return d.a(interfaceC1673j);
    }

    public final void i(InterfaceC1673j interfaceC1673j) throws C0897l1 {
        InterfaceC0405b cVar;
        o3.c cVarB = d.b(interfaceC1673j);
        int i9 = cVarB.f45799a;
        if (i9 == 17) {
            cVar = new a(this.f45770a, this.f45771b, cVarB);
        } else if (i9 == 6) {
            cVar = new c(this.f45770a, this.f45771b, cVarB, "audio/g711-alaw", -1);
        } else if (i9 == 7) {
            cVar = new c(this.f45770a, this.f45771b, cVarB, "audio/g711-mlaw", -1);
        } else {
            int iA = Q2.k0.a(i9, cVarB.f45804f);
            if (iA == 0) {
                throw C0897l1.e("Unsupported WAV format type: " + cVarB.f45799a);
            }
            cVar = new c(this.f45770a, this.f45771b, cVarB, "audio/raw", iA);
        }
        this.f45774e = cVar;
        this.f45772c = 3;
    }

    public final void j(InterfaceC1673j interfaceC1673j) {
        this.f45773d = d.c(interfaceC1673j);
        this.f45772c = 2;
    }

    public final int k(InterfaceC1673j interfaceC1673j) {
        AbstractC1684a.g(this.f45776g != -1);
        return ((InterfaceC0405b) AbstractC1684a.e(this.f45774e)).b(interfaceC1673j, this.f45776g - interfaceC1673j.getPosition()) ? -1 : 0;
    }

    public final void l(InterfaceC1673j interfaceC1673j) throws C0897l1 {
        Pair pairE = d.e(interfaceC1673j);
        this.f45775f = ((Long) pairE.first).intValue();
        long jLongValue = ((Long) pairE.second).longValue();
        long j9 = this.f45773d;
        if (j9 != -1 && jLongValue == 4294967295L) {
            jLongValue = j9;
        }
        this.f45776g = ((long) this.f45775f) + jLongValue;
        long length = interfaceC1673j.getLength();
        if (length != -1 && this.f45776g > length) {
            AbstractC1681B.j("WavExtractor", "Data exceeds input length: " + this.f45776g + ", " + length);
            this.f45776g = length;
        }
        ((InterfaceC0405b) AbstractC1684a.e(this.f45774e)).a(this.f45775f, this.f45776g);
        this.f45772c = 4;
    }

    @Override // d3.InterfaceC1672i
    public void release() {
    }
}
