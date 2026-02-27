package n3;

import d3.InterfaceC1674k;
import d4.AbstractC1681B;
import d4.L;
import d4.M;
import d4.Z;
import n3.I;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f45239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f45240b = new L(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45241c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f45242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Z f45243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f45246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45247i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45248j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f45249k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f45250l;

    public w(m mVar) {
        this.f45239a = mVar;
    }

    @Override // n3.I
    public void a(Z z9, InterfaceC1674k interfaceC1674k, I.d dVar) {
        this.f45243e = z9;
        this.f45239a.f(interfaceC1674k, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x007a -> B:35:0x007c). Please report as a decompilation issue!!! */
    @Override // n3.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(d4.M r8, int r9) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.w.b(d4.M, int):void");
    }

    @Override // n3.I
    public final void c() {
        this.f45241c = 0;
        this.f45242d = 0;
        this.f45246h = false;
        this.f45239a.c();
    }

    public final boolean d(M m9, byte[] bArr, int i9) {
        int iMin = Math.min(m9.a(), i9 - this.f45242d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            m9.V(iMin);
        } else {
            m9.l(bArr, this.f45242d, iMin);
        }
        int i10 = this.f45242d + iMin;
        this.f45242d = i10;
        return i10 == i9;
    }

    public final boolean e() {
        this.f45240b.p(0);
        int iH = this.f45240b.h(24);
        if (iH != 1) {
            AbstractC1681B.j("PesReader", "Unexpected start code prefix: " + iH);
            this.f45248j = -1;
            return false;
        }
        this.f45240b.r(8);
        int iH2 = this.f45240b.h(16);
        this.f45240b.r(5);
        this.f45249k = this.f45240b.g();
        this.f45240b.r(2);
        this.f45244f = this.f45240b.g();
        this.f45245g = this.f45240b.g();
        this.f45240b.r(6);
        int iH3 = this.f45240b.h(8);
        this.f45247i = iH3;
        if (iH2 == 0) {
            this.f45248j = -1;
        } else {
            int i9 = (iH2 - 3) - iH3;
            this.f45248j = i9;
            if (i9 < 0) {
                AbstractC1681B.j("PesReader", "Found negative packet payload size: " + this.f45248j);
                this.f45248j = -1;
            }
        }
        return true;
    }

    public final void f() {
        this.f45240b.p(0);
        this.f45250l = -9223372036854775807L;
        if (this.f45244f) {
            this.f45240b.r(4);
            long jH = ((long) this.f45240b.h(3)) << 30;
            this.f45240b.r(1);
            long jH2 = jH | ((long) (this.f45240b.h(15) << 15));
            this.f45240b.r(1);
            long jH3 = jH2 | ((long) this.f45240b.h(15));
            this.f45240b.r(1);
            if (!this.f45246h && this.f45245g) {
                this.f45240b.r(4);
                long jH4 = ((long) this.f45240b.h(3)) << 30;
                this.f45240b.r(1);
                long jH5 = jH4 | ((long) (this.f45240b.h(15) << 15));
                this.f45240b.r(1);
                long jH6 = jH5 | ((long) this.f45240b.h(15));
                this.f45240b.r(1);
                this.f45243e.b(jH6);
                this.f45246h = true;
            }
            this.f45250l = this.f45243e.b(jH3);
        }
    }

    public final void g(int i9) {
        this.f45241c = i9;
        this.f45242d = 0;
    }
}
