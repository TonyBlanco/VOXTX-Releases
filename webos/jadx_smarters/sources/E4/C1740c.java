package e4;

import O2.InterfaceC0901n;
import android.os.Bundle;
import d4.k0;
import java.util.Arrays;

/* JADX INFO: renamed from: e4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1740c implements InterfaceC0901n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1740c f40191g = new C1740c(1, 2, 3, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C1740c f40192h = new b().c(1).b(1).d(2).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f40193i = k0.A0(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f40194j = k0.A0(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f40195k = k0.A0(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f40196l = k0.A0(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final InterfaceC0901n.a f40197m = new InterfaceC0901n.a() { // from class: e4.b
        @Override // O2.InterfaceC0901n.a
        public final InterfaceC0901n a(Bundle bundle) {
            return C1740c.k(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40198a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f40201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40202f;

    /* JADX INFO: renamed from: e4.c$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f40203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f40204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f40205c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f40206d;

        public b() {
            this.f40203a = -1;
            this.f40204b = -1;
            this.f40205c = -1;
        }

        public b(C1740c c1740c) {
            this.f40203a = c1740c.f40198a;
            this.f40204b = c1740c.f40199c;
            this.f40205c = c1740c.f40200d;
            this.f40206d = c1740c.f40201e;
        }

        public C1740c a() {
            return new C1740c(this.f40203a, this.f40204b, this.f40205c, this.f40206d);
        }

        public b b(int i9) {
            this.f40204b = i9;
            return this;
        }

        public b c(int i9) {
            this.f40203a = i9;
            return this;
        }

        public b d(int i9) {
            this.f40205c = i9;
            return this;
        }
    }

    public C1740c(int i9, int i10, int i11, byte[] bArr) {
        this.f40198a = i9;
        this.f40199c = i10;
        this.f40200d = i11;
        this.f40201e = bArr;
    }

    public static String c(int i9) {
        return i9 != -1 ? i9 != 1 ? i9 != 2 ? "Undefined color range" : "Limited range" : "Full range" : "Unset color range";
    }

    public static String d(int i9) {
        return i9 != -1 ? i9 != 6 ? i9 != 1 ? i9 != 2 ? "Undefined color space" : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String e(int i9) {
        return i9 != -1 ? i9 != 10 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 6 ? i9 != 7 ? "Undefined color transfer" : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean f(C1740c c1740c) {
        int i9;
        return c1740c != null && ((i9 = c1740c.f40200d) == 7 || i9 == 6);
    }

    public static int i(int i9) {
        if (i9 == 1) {
            return 1;
        }
        if (i9 != 9) {
            return (i9 == 4 || i9 == 5 || i9 == 6 || i9 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int j(int i9) {
        if (i9 == 1) {
            return 3;
        }
        if (i9 == 4) {
            return 10;
        }
        if (i9 == 13) {
            return 2;
        }
        if (i9 == 16) {
            return 6;
        }
        if (i9 != 18) {
            return (i9 == 6 || i9 == 7) ? 3 : -1;
        }
        return 7;
    }

    public static /* synthetic */ C1740c k(Bundle bundle) {
        return new C1740c(bundle.getInt(f40193i, -1), bundle.getInt(f40194j, -1), bundle.getInt(f40195k, -1), bundle.getByteArray(f40196l));
    }

    public b b() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1740c.class != obj.getClass()) {
            return false;
        }
        C1740c c1740c = (C1740c) obj;
        return this.f40198a == c1740c.f40198a && this.f40199c == c1740c.f40199c && this.f40200d == c1740c.f40200d && Arrays.equals(this.f40201e, c1740c.f40201e);
    }

    public boolean g() {
        return (this.f40198a == -1 || this.f40199c == -1 || this.f40200d == -1) ? false : true;
    }

    @Override // O2.InterfaceC0901n
    public Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putInt(f40193i, this.f40198a);
        bundle.putInt(f40194j, this.f40199c);
        bundle.putInt(f40195k, this.f40200d);
        bundle.putByteArray(f40196l, this.f40201e);
        return bundle;
    }

    public int hashCode() {
        if (this.f40202f == 0) {
            this.f40202f = ((((((527 + this.f40198a) * 31) + this.f40199c) * 31) + this.f40200d) * 31) + Arrays.hashCode(this.f40201e);
        }
        return this.f40202f;
    }

    public String l() {
        return !g() ? "NA" : k0.D("%s/%s/%s", d(this.f40198a), c(this.f40199c), e(this.f40200d));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(d(this.f40198a));
        sb.append(", ");
        sb.append(c(this.f40199c));
        sb.append(", ");
        sb.append(e(this.f40200d));
        sb.append(", ");
        sb.append(this.f40201e != null);
        sb.append(")");
        return sb.toString();
    }
}
