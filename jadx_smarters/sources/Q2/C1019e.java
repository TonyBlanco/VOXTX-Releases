package Q2;

import O2.InterfaceC0901n;
import android.media.AudioAttributes;
import android.os.Bundle;

/* JADX INFO: renamed from: Q2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1019e implements InterfaceC0901n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C1019e f7784h = new C0089e().a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f7785i = d4.k0.A0(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f7786j = d4.k0.A0(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f7787k = d4.k0.A0(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f7788l = d4.k0.A0(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f7789m = d4.k0.A0(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final InterfaceC0901n.a f7790n = new InterfaceC0901n.a() { // from class: Q2.d
        @Override // O2.InterfaceC0901n.a
        public final InterfaceC0901n a(Bundle bundle) {
            return C1019e.c(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7791a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f7796g;

    /* JADX INFO: renamed from: Q2.e$b */
    public static final class b {
        public static void a(AudioAttributes.Builder builder, int i9) {
            builder.setAllowedCapturePolicy(i9);
        }
    }

    /* JADX INFO: renamed from: Q2.e$c */
    public static final class c {
        public static void a(AudioAttributes.Builder builder, int i9) {
            builder.setSpatializationBehavior(i9);
        }
    }

    /* JADX INFO: renamed from: Q2.e$d */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioAttributes f7797a;

        public d(C1019e c1019e) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c1019e.f7791a).setFlags(c1019e.f7792c).setUsage(c1019e.f7793d);
            int i9 = d4.k0.f39777a;
            if (i9 >= 29) {
                b.a(usage, c1019e.f7794e);
            }
            if (i9 >= 32) {
                c.a(usage, c1019e.f7795f);
            }
            this.f7797a = usage.build();
        }
    }

    /* JADX INFO: renamed from: Q2.e$e, reason: collision with other inner class name */
    public static final class C0089e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7798a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7799b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7800c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7801d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7802e = 0;

        public C1019e a() {
            return new C1019e(this.f7798a, this.f7799b, this.f7800c, this.f7801d, this.f7802e);
        }

        public C0089e b(int i9) {
            this.f7801d = i9;
            return this;
        }

        public C0089e c(int i9) {
            this.f7798a = i9;
            return this;
        }

        public C0089e d(int i9) {
            this.f7799b = i9;
            return this;
        }

        public C0089e e(int i9) {
            this.f7802e = i9;
            return this;
        }

        public C0089e f(int i9) {
            this.f7800c = i9;
            return this;
        }
    }

    public C1019e(int i9, int i10, int i11, int i12, int i13) {
        this.f7791a = i9;
        this.f7792c = i10;
        this.f7793d = i11;
        this.f7794e = i12;
        this.f7795f = i13;
    }

    public static /* synthetic */ C1019e c(Bundle bundle) {
        C0089e c0089e = new C0089e();
        String str = f7785i;
        if (bundle.containsKey(str)) {
            c0089e.c(bundle.getInt(str));
        }
        String str2 = f7786j;
        if (bundle.containsKey(str2)) {
            c0089e.d(bundle.getInt(str2));
        }
        String str3 = f7787k;
        if (bundle.containsKey(str3)) {
            c0089e.f(bundle.getInt(str3));
        }
        String str4 = f7788l;
        if (bundle.containsKey(str4)) {
            c0089e.b(bundle.getInt(str4));
        }
        String str5 = f7789m;
        if (bundle.containsKey(str5)) {
            c0089e.e(bundle.getInt(str5));
        }
        return c0089e.a();
    }

    public d b() {
        if (this.f7796g == null) {
            this.f7796g = new d();
        }
        return this.f7796g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1019e.class != obj.getClass()) {
            return false;
        }
        C1019e c1019e = (C1019e) obj;
        return this.f7791a == c1019e.f7791a && this.f7792c == c1019e.f7792c && this.f7793d == c1019e.f7793d && this.f7794e == c1019e.f7794e && this.f7795f == c1019e.f7795f;
    }

    @Override // O2.InterfaceC0901n
    public Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putInt(f7785i, this.f7791a);
        bundle.putInt(f7786j, this.f7792c);
        bundle.putInt(f7787k, this.f7793d);
        bundle.putInt(f7788l, this.f7794e);
        bundle.putInt(f7789m, this.f7795f);
        return bundle;
    }

    public int hashCode() {
        return ((((((((527 + this.f7791a) * 31) + this.f7792c) * 31) + this.f7793d) * 31) + this.f7794e) * 31) + this.f7795f;
    }
}
