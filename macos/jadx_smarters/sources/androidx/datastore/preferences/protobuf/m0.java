package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.s0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m0 f14703f = new m0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f14705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f14706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14708e;

    public m0() {
        this(0, new int[8], new Object[8], true);
    }

    public m0(int i9, int[] iArr, Object[] objArr, boolean z9) {
        this.f14707d = -1;
        this.f14704a = i9;
        this.f14705b = iArr;
        this.f14706c = objArr;
        this.f14708e = z9;
    }

    public static boolean c(int[] iArr, int[] iArr2, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(Object[] objArr, Object[] objArr2, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            if (!objArr[i10].equals(objArr2[i10])) {
                return false;
            }
        }
        return true;
    }

    public static m0 e() {
        return f14703f;
    }

    public static int h(int[] iArr, int i9) {
        int i10 = 17;
        for (int i11 = 0; i11 < i9; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        return i10;
    }

    public static int i(Object[] objArr, int i9) {
        int iHashCode = 17;
        for (int i10 = 0; i10 < i9; i10++) {
            iHashCode = (iHashCode * 31) + objArr[i10].hashCode();
        }
        return iHashCode;
    }

    public static m0 k(m0 m0Var, m0 m0Var2) {
        int i9 = m0Var.f14704a + m0Var2.f14704a;
        int[] iArrCopyOf = Arrays.copyOf(m0Var.f14705b, i9);
        System.arraycopy(m0Var2.f14705b, 0, iArrCopyOf, m0Var.f14704a, m0Var2.f14704a);
        Object[] objArrCopyOf = Arrays.copyOf(m0Var.f14706c, i9);
        System.arraycopy(m0Var2.f14706c, 0, objArrCopyOf, m0Var.f14704a, m0Var2.f14704a);
        return new m0(i9, iArrCopyOf, objArrCopyOf, true);
    }

    public static m0 l() {
        return new m0();
    }

    public static void p(int i9, Object obj, s0 s0Var) {
        int iA = r0.a(i9);
        int iB = r0.b(i9);
        if (iB == 0) {
            s0Var.A(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            s0Var.x(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            s0Var.j(iA, (AbstractC1122g) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(C1140z.d());
            }
            s0Var.c(iA, ((Integer) obj).intValue());
        } else if (s0Var.y() == s0.a.ASCENDING) {
            s0Var.D(iA);
            ((m0) obj).q(s0Var);
            s0Var.I(iA);
        } else {
            s0Var.I(iA);
            ((m0) obj).q(s0Var);
            s0Var.D(iA);
        }
    }

    public void a() {
        if (!this.f14708e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b() {
        int i9 = this.f14704a;
        int[] iArr = this.f14705b;
        if (i9 == iArr.length) {
            int i10 = i9 + (i9 < 4 ? 8 : i9 >> 1);
            this.f14705b = Arrays.copyOf(iArr, i10);
            this.f14706c = Arrays.copyOf(this.f14706c, i10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        int i9 = this.f14704a;
        return i9 == m0Var.f14704a && c(this.f14705b, m0Var.f14705b, i9) && d(this.f14706c, m0Var.f14706c, this.f14704a);
    }

    public int f() {
        int iS;
        int i9 = this.f14707d;
        if (i9 != -1) {
            return i9;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f14704a; i11++) {
            int i12 = this.f14705b[i11];
            int iA = r0.a(i12);
            int iB = r0.b(i12);
            if (iB == 0) {
                iS = AbstractC1125j.S(iA, ((Long) this.f14706c[i11]).longValue());
            } else if (iB == 1) {
                iS = AbstractC1125j.n(iA, ((Long) this.f14706c[i11]).longValue());
            } else if (iB == 2) {
                iS = AbstractC1125j.f(iA, (AbstractC1122g) this.f14706c[i11]);
            } else if (iB == 3) {
                iS = (AbstractC1125j.P(iA) * 2) + ((m0) this.f14706c[i11]).f();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(C1140z.d());
                }
                iS = AbstractC1125j.l(iA, ((Integer) this.f14706c[i11]).intValue());
            }
            i10 += iS;
        }
        this.f14707d = i10;
        return i10;
    }

    public int g() {
        int i9 = this.f14707d;
        if (i9 != -1) {
            return i9;
        }
        int iD = 0;
        for (int i10 = 0; i10 < this.f14704a; i10++) {
            iD += AbstractC1125j.D(r0.a(this.f14705b[i10]), (AbstractC1122g) this.f14706c[i10]);
        }
        this.f14707d = iD;
        return iD;
    }

    public int hashCode() {
        int i9 = this.f14704a;
        return ((((527 + i9) * 31) + h(this.f14705b, i9)) * 31) + i(this.f14706c, this.f14704a);
    }

    public void j() {
        this.f14708e = false;
    }

    public final void m(StringBuilder sb, int i9) {
        for (int i10 = 0; i10 < this.f14704a; i10++) {
            Q.c(sb, i9, String.valueOf(r0.a(this.f14705b[i10])), this.f14706c[i10]);
        }
    }

    public void n(int i9, Object obj) {
        a();
        b();
        int[] iArr = this.f14705b;
        int i10 = this.f14704a;
        iArr[i10] = i9;
        this.f14706c[i10] = obj;
        this.f14704a = i10 + 1;
    }

    public void o(s0 s0Var) {
        if (s0Var.y() == s0.a.DESCENDING) {
            for (int i9 = this.f14704a - 1; i9 >= 0; i9--) {
                s0Var.b(r0.a(this.f14705b[i9]), this.f14706c[i9]);
            }
            return;
        }
        for (int i10 = 0; i10 < this.f14704a; i10++) {
            s0Var.b(r0.a(this.f14705b[i10]), this.f14706c[i10]);
        }
    }

    public void q(s0 s0Var) {
        if (this.f14704a == 0) {
            return;
        }
        if (s0Var.y() == s0.a.ASCENDING) {
            for (int i9 = 0; i9 < this.f14704a; i9++) {
                p(this.f14705b[i9], this.f14706c[i9], s0Var);
            }
            return;
        }
        for (int i10 = this.f14704a - 1; i10 >= 0; i10--) {
            p(this.f14705b[i10], this.f14706c[i10], s0Var);
        }
    }
}
