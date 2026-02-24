package n3;

import O2.C0936z0;
import Q2.Z;
import d3.InterfaceC1674k;
import d4.AbstractC1684a;
import d4.M;
import n3.I;

/* JADX INFO: renamed from: n3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2258k implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f45053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d3.w f45054d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f45058h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C0936z0 f45059i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45060j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f45051a = new M(new byte[18]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45055e = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f45061k = -9223372036854775807L;

    public C2258k(String str) {
        this.f45052b = str;
    }

    private boolean a(M m9, byte[] bArr, int i9) {
        int iMin = Math.min(m9.a(), i9 - this.f45056f);
        m9.l(bArr, this.f45056f, iMin);
        int i10 = this.f45056f + iMin;
        this.f45056f = i10;
        return i10 == i9;
    }

    private void g() {
        byte[] bArrE = this.f45051a.e();
        if (this.f45059i == null) {
            C0936z0 c0936z0G = Z.g(bArrE, this.f45053c, this.f45052b, null);
            this.f45059i = c0936z0G;
            this.f45054d.d(c0936z0G);
        }
        this.f45060j = Z.a(bArrE);
        this.f45058h = (int) ((((long) Z.f(bArrE)) * 1000000) / ((long) this.f45059i.f6447A));
    }

    private boolean h(M m9) {
        while (m9.a() > 0) {
            int i9 = this.f45057g << 8;
            this.f45057g = i9;
            int iH = i9 | m9.H();
            this.f45057g = iH;
            if (Z.d(iH)) {
                byte[] bArrE = this.f45051a.e();
                int i10 = this.f45057g;
                bArrE[0] = (byte) ((i10 >> 24) & 255);
                bArrE[1] = (byte) ((i10 >> 16) & 255);
                bArrE[2] = (byte) ((i10 >> 8) & 255);
                bArrE[3] = (byte) (i10 & 255);
                this.f45056f = 4;
                this.f45057g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // n3.m
    public void b(M m9) {
        AbstractC1684a.i(this.f45054d);
        while (m9.a() > 0) {
            int i9 = this.f45055e;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 != 2) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(m9.a(), this.f45060j - this.f45056f);
                    this.f45054d.b(m9, iMin);
                    int i10 = this.f45056f + iMin;
                    this.f45056f = i10;
                    int i11 = this.f45060j;
                    if (i10 == i11) {
                        long j9 = this.f45061k;
                        if (j9 != -9223372036854775807L) {
                            this.f45054d.f(j9, 1, i11, 0, null);
                            this.f45061k += this.f45058h;
                        }
                        this.f45055e = 0;
                    }
                } else if (a(m9, this.f45051a.e(), 18)) {
                    g();
                    this.f45051a.U(0);
                    this.f45054d.b(this.f45051a, 18);
                    this.f45055e = 2;
                }
            } else if (h(m9)) {
                this.f45055e = 1;
            }
        }
    }

    @Override // n3.m
    public void c() {
        this.f45055e = 0;
        this.f45056f = 0;
        this.f45057g = 0;
        this.f45061k = -9223372036854775807L;
    }

    @Override // n3.m
    public void d() {
    }

    @Override // n3.m
    public void e(long j9, int i9) {
        if (j9 != -9223372036854775807L) {
            this.f45061k = j9;
        }
    }

    @Override // n3.m
    public void f(InterfaceC1674k interfaceC1674k, I.d dVar) {
        dVar.a();
        this.f45053c = dVar.b();
        this.f45054d = interfaceC1674k.e(dVar.c(), 1);
    }
}
