package j3;

import O2.C0897l1;
import d3.InterfaceC1673j;
import d4.AbstractC1684a;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: j3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2089a implements InterfaceC2091c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f42911a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f42912b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2095g f42913c = new C2095g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC2090b f42914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f42917g;

    /* JADX INFO: renamed from: j3.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f42918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f42919b;

        public b(int i9, long j9) {
            this.f42918a = i9;
            this.f42919b = j9;
        }
    }

    public static String f(InterfaceC1673j interfaceC1673j, int i9) {
        if (i9 == 0) {
            return "";
        }
        byte[] bArr = new byte[i9];
        interfaceC1673j.m(bArr, 0, i9);
        while (i9 > 0 && bArr[i9 - 1] == 0) {
            i9--;
        }
        return new String(bArr, 0, i9);
    }

    @Override // j3.InterfaceC2091c
    public boolean a(InterfaceC1673j interfaceC1673j) throws C0897l1 {
        AbstractC1684a.i(this.f42914d);
        while (true) {
            b bVar = (b) this.f42912b.peek();
            if (bVar != null && interfaceC1673j.getPosition() >= bVar.f42919b) {
                this.f42914d.a(((b) this.f42912b.pop()).f42918a);
                return true;
            }
            if (this.f42915e == 0) {
                long jD = this.f42913c.d(interfaceC1673j, true, false, 4);
                if (jD == -2) {
                    jD = c(interfaceC1673j);
                }
                if (jD == -1) {
                    return false;
                }
                this.f42916f = (int) jD;
                this.f42915e = 1;
            }
            if (this.f42915e == 1) {
                this.f42917g = this.f42913c.d(interfaceC1673j, false, true, 8);
                this.f42915e = 2;
            }
            int iE = this.f42914d.e(this.f42916f);
            if (iE != 0) {
                if (iE == 1) {
                    long position = interfaceC1673j.getPosition();
                    this.f42912b.push(new b(this.f42916f, this.f42917g + position));
                    this.f42914d.h(this.f42916f, position, this.f42917g);
                    this.f42915e = 0;
                    return true;
                }
                if (iE == 2) {
                    long j9 = this.f42917g;
                    if (j9 <= 8) {
                        this.f42914d.d(this.f42916f, e(interfaceC1673j, (int) j9));
                        this.f42915e = 0;
                        return true;
                    }
                    throw C0897l1.a("Invalid integer size: " + this.f42917g, null);
                }
                if (iE == 3) {
                    long j10 = this.f42917g;
                    if (j10 <= 2147483647L) {
                        this.f42914d.g(this.f42916f, f(interfaceC1673j, (int) j10));
                        this.f42915e = 0;
                        return true;
                    }
                    throw C0897l1.a("String element size: " + this.f42917g, null);
                }
                if (iE == 4) {
                    this.f42914d.b(this.f42916f, (int) this.f42917g, interfaceC1673j);
                    this.f42915e = 0;
                    return true;
                }
                if (iE != 5) {
                    throw C0897l1.a("Invalid element type " + iE, null);
                }
                long j11 = this.f42917g;
                if (j11 == 4 || j11 == 8) {
                    this.f42914d.c(this.f42916f, d(interfaceC1673j, (int) j11));
                    this.f42915e = 0;
                    return true;
                }
                throw C0897l1.a("Invalid float size: " + this.f42917g, null);
            }
            interfaceC1673j.q((int) this.f42917g);
            this.f42915e = 0;
        }
    }

    @Override // j3.InterfaceC2091c
    public void b(InterfaceC2090b interfaceC2090b) {
        this.f42914d = interfaceC2090b;
    }

    public final long c(InterfaceC1673j interfaceC1673j) {
        interfaceC1673j.f();
        while (true) {
            interfaceC1673j.s(this.f42911a, 0, 4);
            int iC = C2095g.c(this.f42911a[0]);
            if (iC != -1 && iC <= 4) {
                int iA = (int) C2095g.a(this.f42911a, iC, false);
                if (this.f42914d.f(iA)) {
                    interfaceC1673j.q(iC);
                    return iA;
                }
            }
            interfaceC1673j.q(1);
        }
    }

    public final double d(InterfaceC1673j interfaceC1673j, int i9) {
        return i9 == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(e(interfaceC1673j, i9));
    }

    public final long e(InterfaceC1673j interfaceC1673j, int i9) {
        interfaceC1673j.m(this.f42911a, 0, i9);
        long j9 = 0;
        for (int i10 = 0; i10 < i9; i10++) {
            j9 = (j9 << 8) | ((long) (this.f42911a[i10] & 255));
        }
        return j9;
    }

    @Override // j3.InterfaceC2091c
    public void reset() {
        this.f42915e = 0;
        this.f42912b.clear();
        this.f42913c.e();
    }
}
