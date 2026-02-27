package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class ua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cj f24682a = new cj(32);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private tz f24683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private tz f24684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private tz f24685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f24686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wr f24687f;

    public ua(wr wrVar) {
        this.f24687f = wrVar;
        tz tzVar = new tz(0L);
        this.f24683b = tzVar;
        this.f24684c = tzVar;
        this.f24685d = tzVar;
    }

    private final int j(int i9) {
        tz tzVar = this.f24685d;
        if (tzVar.f24681d == null) {
            bdz bdzVarF = this.f24687f.f();
            tz tzVar2 = new tz(this.f24685d.f24679b);
            tzVar.f24681d = bdzVarF;
            tzVar.f24680c = tzVar2;
        }
        return Math.min(i9, (int) (this.f24685d.f24679b - this.f24686e));
    }

    private static tz k(tz tzVar, long j9) {
        while (j9 >= tzVar.f24679b) {
            tzVar = tzVar.f24680c;
        }
        return tzVar;
    }

    private static tz l(tz tzVar, long j9, ByteBuffer byteBuffer, int i9) {
        tz tzVarK = k(tzVar, j9);
        while (i9 > 0) {
            int iMin = Math.min(i9, (int) (tzVarK.f24679b - j9));
            byteBuffer.put((byte[]) tzVarK.f24681d.f21124a, tzVarK.a(j9), iMin);
            i9 -= iMin;
            j9 += (long) iMin;
            if (j9 == tzVarK.f24679b) {
                tzVarK = tzVarK.f24680c;
            }
        }
        return tzVarK;
    }

    private static tz m(tz tzVar, long j9, byte[] bArr, int i9) {
        tz tzVarK = k(tzVar, j9);
        int i10 = i9;
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (tzVarK.f24679b - j9));
            System.arraycopy(tzVarK.f24681d.f21124a, tzVarK.a(j9), bArr, i9 - i10, iMin);
            i10 -= iMin;
            j9 += (long) iMin;
            if (j9 == tzVarK.f24679b) {
                tzVarK = tzVarK.f24680c;
            }
        }
        return tzVarK;
    }

    private static tz n(tz tzVar, ef efVar, ub ubVar, cj cjVar) {
        tz tzVarM;
        int iM;
        if (efVar.k()) {
            long j9 = ubVar.f24689b;
            cjVar.B(1);
            tz tzVarM2 = m(tzVar, j9, cjVar.H(), 1);
            long j10 = j9 + 1;
            byte b9 = cjVar.H()[0];
            boolean z9 = (b9 & 128) != 0;
            int i9 = b9 & 127;
            ec ecVar = efVar.f22773a;
            byte[] bArr = ecVar.f22763a;
            if (bArr == null) {
                ecVar.f22763a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            tzVarM = m(tzVarM2, j10, ecVar.f22763a, i9);
            long j11 = j10 + ((long) i9);
            if (z9) {
                cjVar.B(2);
                tzVarM = m(tzVarM, j11, cjVar.H(), 2);
                j11 += 2;
                iM = cjVar.m();
            } else {
                iM = 1;
            }
            int[] iArr = ecVar.f22766d;
            if (iArr == null || iArr.length < iM) {
                iArr = new int[iM];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = ecVar.f22767e;
            if (iArr3 == null || iArr3.length < iM) {
                iArr3 = new int[iM];
            }
            int[] iArr4 = iArr3;
            if (z9) {
                int i10 = iM * 6;
                cjVar.B(i10);
                tzVarM = m(tzVarM, j11, cjVar.H(), i10);
                j11 += (long) i10;
                cjVar.F(0);
                for (int i11 = 0; i11 < iM; i11++) {
                    iArr2[i11] = cjVar.m();
                    iArr4[i11] = cjVar.l();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = ubVar.f24688a - ((int) (j11 - ubVar.f24689b));
            }
            aad aadVar = ubVar.f24690c;
            int i12 = cq.f22640a;
            ecVar.c(iM, iArr2, iArr4, aadVar.f18630b, ecVar.f22763a, aadVar.f18629a, aadVar.f18631c, aadVar.f18632d);
            long j12 = ubVar.f24689b;
            int i13 = (int) (j11 - j12);
            ubVar.f24689b = j12 + ((long) i13);
            ubVar.f24688a -= i13;
        } else {
            tzVarM = tzVar;
        }
        if (!efVar.e()) {
            efVar.i(ubVar.f24688a);
            return l(tzVarM, ubVar.f24689b, efVar.f22774b, ubVar.f24688a);
        }
        cjVar.B(4);
        tz tzVarM3 = m(tzVarM, ubVar.f24689b, cjVar.H(), 4);
        int iL = cjVar.l();
        ubVar.f24689b += 4;
        ubVar.f24688a -= 4;
        efVar.i(iL);
        tz tzVarL = l(tzVarM3, ubVar.f24689b, efVar.f22774b, iL);
        ubVar.f24689b += (long) iL;
        int i14 = ubVar.f24688a - iL;
        ubVar.f24688a = i14;
        ByteBuffer byteBuffer = efVar.f22777e;
        if (byteBuffer == null || byteBuffer.capacity() < i14) {
            efVar.f22777e = ByteBuffer.allocate(i14);
        } else {
            efVar.f22777e.clear();
        }
        return l(tzVarL, ubVar.f24689b, efVar.f22777e, ubVar.f24688a);
    }

    private final void o(tz tzVar) {
        if (tzVar.f24681d == null) {
            return;
        }
        this.f24687f.b(tzVar);
        tzVar.b();
    }

    private final void p(int i9) {
        long j9 = this.f24686e + ((long) i9);
        this.f24686e = j9;
        tz tzVar = this.f24685d;
        if (j9 == tzVar.f24679b) {
            this.f24685d = tzVar.f24680c;
        }
    }

    public final int a(InterfaceC1310k interfaceC1310k, int i9, boolean z9) throws IOException {
        int iJ = j(i9);
        tz tzVar = this.f24685d;
        int iA = interfaceC1310k.a((byte[]) tzVar.f24681d.f21124a, tzVar.a(this.f24686e), iJ);
        if (iA != -1) {
            p(iA);
            return iA;
        }
        if (z9) {
            return -1;
        }
        throw new EOFException();
    }

    public final long b() {
        return this.f24686e;
    }

    public final void c(long j9) {
        tz tzVar;
        if (j9 != -1) {
            while (true) {
                tzVar = this.f24683b;
                if (j9 < tzVar.f24679b) {
                    break;
                }
                this.f24687f.g(tzVar.f24681d);
                this.f24683b = this.f24683b.b();
            }
            if (this.f24684c.f24678a < tzVar.f24678a) {
                this.f24684c = tzVar;
            }
        }
    }

    public final void d(long j9) {
        af.u(j9 <= this.f24686e);
        this.f24686e = j9;
        if (j9 != 0) {
            tz tzVar = this.f24683b;
            if (j9 != tzVar.f24678a) {
                while (this.f24686e > tzVar.f24679b) {
                    tzVar = tzVar.f24680c;
                }
                tz tzVar2 = tzVar.f24680c;
                af.s(tzVar2);
                o(tzVar2);
                tz tzVar3 = new tz(tzVar.f24679b);
                tzVar.f24680c = tzVar3;
                if (this.f24686e == tzVar.f24679b) {
                    tzVar = tzVar3;
                }
                this.f24685d = tzVar;
                if (this.f24684c == tzVar2) {
                    this.f24684c = tzVar3;
                    return;
                }
                return;
            }
        }
        o(this.f24683b);
        tz tzVar4 = new tz(this.f24686e);
        this.f24683b = tzVar4;
        this.f24684c = tzVar4;
        this.f24685d = tzVar4;
    }

    public final void e(ef efVar, ub ubVar) {
        n(this.f24684c, efVar, ubVar, this.f24682a);
    }

    public final void f(ef efVar, ub ubVar) {
        this.f24684c = n(this.f24684c, efVar, ubVar, this.f24682a);
    }

    public final void g() {
        o(this.f24683b);
        this.f24683b.d(0L);
        tz tzVar = this.f24683b;
        this.f24684c = tzVar;
        this.f24685d = tzVar;
        this.f24686e = 0L;
        this.f24687f.e();
    }

    public final void h() {
        this.f24684c = this.f24683b;
    }

    public final void i(cj cjVar, int i9) {
        while (i9 > 0) {
            int iJ = j(i9);
            tz tzVar = this.f24685d;
            cjVar.A((byte[]) tzVar.f24681d.f21124a, tzVar.a(this.f24686e), iJ);
            i9 -= iJ;
            p(iJ);
        }
    }
}
