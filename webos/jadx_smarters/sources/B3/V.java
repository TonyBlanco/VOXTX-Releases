package B3;

import B3.X;
import b4.C1210a;
import b4.InterfaceC1211b;
import b4.InterfaceC1220k;
import d3.w;
import d4.AbstractC1684a;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1211b f425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4.M f427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f431g;

    public static final class a implements InterfaceC1211b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C1210a f434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a f435d;

        public a(long j9, int i9) {
            d(j9, i9);
        }

        @Override // b4.InterfaceC1211b.a
        public C1210a a() {
            return (C1210a) AbstractC1684a.e(this.f434c);
        }

        public a b() {
            this.f434c = null;
            a aVar = this.f435d;
            this.f435d = null;
            return aVar;
        }

        public void c(C1210a c1210a, a aVar) {
            this.f434c = c1210a;
            this.f435d = aVar;
        }

        public void d(long j9, int i9) {
            AbstractC1684a.g(this.f434c == null);
            this.f432a = j9;
            this.f433b = j9 + ((long) i9);
        }

        public int e(long j9) {
            return ((int) (j9 - this.f432a)) + this.f434c.f17563b;
        }

        @Override // b4.InterfaceC1211b.a
        public InterfaceC1211b.a next() {
            a aVar = this.f435d;
            if (aVar == null || aVar.f434c == null) {
                return null;
            }
            return aVar;
        }
    }

    public V(InterfaceC1211b interfaceC1211b) {
        this.f425a = interfaceC1211b;
        int iE = interfaceC1211b.e();
        this.f426b = iE;
        this.f427c = new d4.M(32);
        a aVar = new a(0L, iE);
        this.f428d = aVar;
        this.f429e = aVar;
        this.f430f = aVar;
    }

    public static a d(a aVar, long j9) {
        while (j9 >= aVar.f433b) {
            aVar = aVar.f435d;
        }
        return aVar;
    }

    public static a i(a aVar, long j9, ByteBuffer byteBuffer, int i9) {
        a aVarD = d(aVar, j9);
        while (i9 > 0) {
            int iMin = Math.min(i9, (int) (aVarD.f433b - j9));
            byteBuffer.put(aVarD.f434c.f17562a, aVarD.e(j9), iMin);
            i9 -= iMin;
            j9 += (long) iMin;
            if (j9 == aVarD.f433b) {
                aVarD = aVarD.f435d;
            }
        }
        return aVarD;
    }

    public static a j(a aVar, long j9, byte[] bArr, int i9) {
        a aVarD = d(aVar, j9);
        int i10 = i9;
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (aVarD.f433b - j9));
            System.arraycopy(aVarD.f434c.f17562a, aVarD.e(j9), bArr, i9 - i10, iMin);
            i10 -= iMin;
            j9 += (long) iMin;
            if (j9 == aVarD.f433b) {
                aVarD = aVarD.f435d;
            }
        }
        return aVarD;
    }

    public static a k(a aVar, U2.g gVar, X.b bVar, d4.M m9) {
        int iN;
        long j9 = bVar.f470b;
        m9.Q(1);
        a aVarJ = j(aVar, j9, m9.e(), 1);
        long j10 = j9 + 1;
        byte b9 = m9.e()[0];
        boolean z9 = (b9 & 128) != 0;
        int i9 = b9 & 127;
        U2.c cVar = gVar.f9698c;
        byte[] bArr = cVar.f9673a;
        if (bArr == null) {
            cVar.f9673a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a aVarJ2 = j(aVarJ, j10, cVar.f9673a, i9);
        long j11 = j10 + ((long) i9);
        if (z9) {
            m9.Q(2);
            aVarJ2 = j(aVarJ2, j11, m9.e(), 2);
            j11 += 2;
            iN = m9.N();
        } else {
            iN = 1;
        }
        int[] iArr = cVar.f9676d;
        if (iArr == null || iArr.length < iN) {
            iArr = new int[iN];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f9677e;
        if (iArr3 == null || iArr3.length < iN) {
            iArr3 = new int[iN];
        }
        int[] iArr4 = iArr3;
        if (z9) {
            int i10 = iN * 6;
            m9.Q(i10);
            aVarJ2 = j(aVarJ2, j11, m9.e(), i10);
            j11 += (long) i10;
            m9.U(0);
            for (int i11 = 0; i11 < iN; i11++) {
                iArr2[i11] = m9.N();
                iArr4[i11] = m9.L();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f469a - ((int) (j11 - bVar.f470b));
        }
        w.a aVar2 = (w.a) d4.k0.j(bVar.f471c);
        cVar.c(iN, iArr2, iArr4, aVar2.f39613b, cVar.f9673a, aVar2.f39612a, aVar2.f39614c, aVar2.f39615d);
        long j12 = bVar.f470b;
        int i12 = (int) (j11 - j12);
        bVar.f470b = j12 + ((long) i12);
        bVar.f469a -= i12;
        return aVarJ2;
    }

    public static a l(a aVar, U2.g gVar, X.b bVar, d4.M m9) {
        long j9;
        ByteBuffer byteBuffer;
        if (gVar.j()) {
            aVar = k(aVar, gVar, bVar, m9);
        }
        if (gVar.hasSupplementalData()) {
            m9.Q(4);
            a aVarJ = j(aVar, bVar.f470b, m9.e(), 4);
            int iL = m9.L();
            bVar.f470b += 4;
            bVar.f469a -= 4;
            gVar.e(iL);
            aVar = i(aVarJ, bVar.f470b, gVar.f9699d, iL);
            bVar.f470b += (long) iL;
            int i9 = bVar.f469a - iL;
            bVar.f469a = i9;
            gVar.n(i9);
            j9 = bVar.f470b;
            byteBuffer = gVar.f9702g;
        } else {
            gVar.e(bVar.f469a);
            j9 = bVar.f470b;
            byteBuffer = gVar.f9699d;
        }
        return i(aVar, j9, byteBuffer, bVar.f469a);
    }

    public final void a(a aVar) {
        if (aVar.f434c == null) {
            return;
        }
        this.f425a.c(aVar);
        aVar.b();
    }

    public void b(long j9) {
        a aVar;
        if (j9 == -1) {
            return;
        }
        while (true) {
            aVar = this.f428d;
            if (j9 < aVar.f433b) {
                break;
            }
            this.f425a.a(aVar.f434c);
            this.f428d = this.f428d.b();
        }
        if (this.f429e.f432a < aVar.f432a) {
            this.f429e = aVar;
        }
    }

    public void c(long j9) {
        AbstractC1684a.a(j9 <= this.f431g);
        this.f431g = j9;
        if (j9 != 0) {
            a aVar = this.f428d;
            if (j9 != aVar.f432a) {
                while (this.f431g > aVar.f433b) {
                    aVar = aVar.f435d;
                }
                a aVar2 = (a) AbstractC1684a.e(aVar.f435d);
                a(aVar2);
                a aVar3 = new a(aVar.f433b, this.f426b);
                aVar.f435d = aVar3;
                if (this.f431g == aVar.f433b) {
                    aVar = aVar3;
                }
                this.f430f = aVar;
                if (this.f429e == aVar2) {
                    this.f429e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f428d);
        a aVar4 = new a(this.f431g, this.f426b);
        this.f428d = aVar4;
        this.f429e = aVar4;
        this.f430f = aVar4;
    }

    public long e() {
        return this.f431g;
    }

    public void f(U2.g gVar, X.b bVar) {
        l(this.f429e, gVar, bVar, this.f427c);
    }

    public final void g(int i9) {
        long j9 = this.f431g + ((long) i9);
        this.f431g = j9;
        a aVar = this.f430f;
        if (j9 == aVar.f433b) {
            this.f430f = aVar.f435d;
        }
    }

    public final int h(int i9) {
        a aVar = this.f430f;
        if (aVar.f434c == null) {
            aVar.c(this.f425a.b(), new a(this.f430f.f433b, this.f426b));
        }
        return Math.min(i9, (int) (this.f430f.f433b - this.f431g));
    }

    public void m(U2.g gVar, X.b bVar) {
        this.f429e = l(this.f429e, gVar, bVar, this.f427c);
    }

    public void n() {
        a(this.f428d);
        this.f428d.d(0L, this.f426b);
        a aVar = this.f428d;
        this.f429e = aVar;
        this.f430f = aVar;
        this.f431g = 0L;
        this.f425a.d();
    }

    public void o() {
        this.f429e = this.f428d;
    }

    public int p(InterfaceC1220k interfaceC1220k, int i9, boolean z9) throws EOFException {
        int iH = h(i9);
        a aVar = this.f430f;
        int i10 = interfaceC1220k.read(aVar.f434c.f17562a, aVar.e(this.f431g), iH);
        if (i10 != -1) {
            g(i10);
            return i10;
        }
        if (z9) {
            return -1;
        }
        throw new EOFException();
    }

    public void q(d4.M m9, int i9) {
        while (i9 > 0) {
            int iH = h(i9);
            a aVar = this.f430f;
            m9.l(aVar.f434c.f17562a, aVar.e(this.f431g), iH);
            i9 -= iH;
            g(iH);
        }
    }
}
