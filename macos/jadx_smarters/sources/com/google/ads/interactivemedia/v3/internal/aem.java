package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class aem {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19366f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19361a = 112800;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final co f19362b = new co(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f19367g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f19368h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f19369i = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final cj f19363c = new cj();

    public aem(int i9) {
    }

    private final void e(zi ziVar) {
        this.f19363c.C(cq.f22645f);
        this.f19364d = true;
        ziVar.h();
    }

    public final int a(zi ziVar, zy zyVar, int i9) throws IOException {
        if (i9 <= 0) {
            e(ziVar);
            return 0;
        }
        long j9 = -9223372036854775807L;
        if (!this.f19366f) {
            long jB = ziVar.b();
            int iMin = (int) Math.min(112800L, jB);
            long j10 = jB - ((long) iMin);
            if (ziVar.d() != j10) {
                zyVar.f25320a = j10;
                return 1;
            }
            this.f19363c.B(iMin);
            ziVar.h();
            ziVar.f(this.f19363c.H(), 0, iMin);
            cj cjVar = this.f19363c;
            int iC = cjVar.c();
            int iD = cjVar.d();
            int i10 = iD - 188;
            while (true) {
                if (i10 < iC) {
                    break;
                }
                byte[] bArrH = cjVar.H();
                int i11 = -4;
                int i12 = 0;
                while (true) {
                    if (i11 > 4) {
                        break;
                    }
                    int i13 = (i11 * 188) + i10;
                    if (i13 < iC || i13 >= iD || bArrH[i13] != 71) {
                        i12 = 0;
                    } else {
                        i12++;
                        if (i12 == 5) {
                            long jG = afe.g(cjVar, i10, i9);
                            if (jG != -9223372036854775807L) {
                                j9 = jG;
                                break;
                            }
                        }
                    }
                    i11++;
                }
                i10--;
            }
            this.f19368h = j9;
            this.f19366f = true;
            return 0;
        }
        if (this.f19368h == -9223372036854775807L) {
            e(ziVar);
            return 0;
        }
        if (this.f19365e) {
            long j11 = this.f19367g;
            if (j11 == -9223372036854775807L) {
                e(ziVar);
                return 0;
            }
            long jB2 = this.f19362b.b(this.f19368h) - this.f19362b.b(j11);
            this.f19369i = jB2;
            if (jB2 < 0) {
                cd.e("TsDurationReader", "Invalid duration: " + jB2 + ". Using TIME_UNSET instead.");
                this.f19369i = -9223372036854775807L;
            }
            e(ziVar);
            return 0;
        }
        int iMin2 = (int) Math.min(112800L, ziVar.b());
        if (ziVar.d() != 0) {
            zyVar.f25320a = 0L;
            return 1;
        }
        this.f19363c.B(iMin2);
        ziVar.h();
        ziVar.f(this.f19363c.H(), 0, iMin2);
        cj cjVar2 = this.f19363c;
        int iC2 = cjVar2.c();
        int iD2 = cjVar2.d();
        while (true) {
            if (iC2 >= iD2) {
                break;
            }
            if (cjVar2.H()[iC2] == 71) {
                long jG2 = afe.g(cjVar2, iC2, i9);
                if (jG2 != -9223372036854775807L) {
                    j9 = jG2;
                    break;
                }
            }
            iC2++;
        }
        this.f19367g = j9;
        this.f19365e = true;
        return 0;
    }

    public final long b() {
        return this.f19369i;
    }

    public final co c() {
        return this.f19362b;
    }

    public final boolean d() {
        return this.f19364d;
    }
}
