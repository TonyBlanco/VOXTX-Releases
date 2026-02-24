package P3;

import O2.InterfaceC0901n;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import d4.AbstractC1684a;
import d4.k0;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements InterfaceC0901n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f7192a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f7193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Layout.Alignment f7194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bitmap f7195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f7196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f7199i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f7200j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f7201k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f7202l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f7203m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f7204n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f7205o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f7206p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f7207q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f7208r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f7184s = new C0083b().o("").a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f7185t = k0.A0(0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f7186u = k0.A0(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f7187v = k0.A0(2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f7188w = k0.A0(3);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f7189x = k0.A0(4);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f7190y = k0.A0(5);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f7191z = k0.A0(6);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f7173A = k0.A0(7);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f7174B = k0.A0(8);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String f7175C = k0.A0(9);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String f7176D = k0.A0(10);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f7177E = k0.A0(11);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f7178F = k0.A0(12);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final String f7179G = k0.A0(13);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final String f7180H = k0.A0(14);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final String f7181I = k0.A0(15);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final String f7182J = k0.A0(16);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final InterfaceC0901n.a f7183K = new InterfaceC0901n.a() { // from class: P3.a
        @Override // O2.InterfaceC0901n.a
        public final InterfaceC0901n a(Bundle bundle) {
            return b.c(bundle);
        }
    };

    /* JADX INFO: renamed from: P3.b$b, reason: collision with other inner class name */
    public static final class C0083b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f7209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Bitmap f7210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Layout.Alignment f7211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Layout.Alignment f7212d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f7213e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7214f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f7215g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f7216h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f7217i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f7218j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f7219k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f7220l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f7221m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f7222n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f7223o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f7224p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public float f7225q;

        public C0083b() {
            this.f7209a = null;
            this.f7210b = null;
            this.f7211c = null;
            this.f7212d = null;
            this.f7213e = -3.4028235E38f;
            this.f7214f = Integer.MIN_VALUE;
            this.f7215g = Integer.MIN_VALUE;
            this.f7216h = -3.4028235E38f;
            this.f7217i = Integer.MIN_VALUE;
            this.f7218j = Integer.MIN_VALUE;
            this.f7219k = -3.4028235E38f;
            this.f7220l = -3.4028235E38f;
            this.f7221m = -3.4028235E38f;
            this.f7222n = false;
            this.f7223o = DefaultRenderer.BACKGROUND_COLOR;
            this.f7224p = Integer.MIN_VALUE;
        }

        public C0083b(b bVar) {
            this.f7209a = bVar.f7192a;
            this.f7210b = bVar.f7195e;
            this.f7211c = bVar.f7193c;
            this.f7212d = bVar.f7194d;
            this.f7213e = bVar.f7196f;
            this.f7214f = bVar.f7197g;
            this.f7215g = bVar.f7198h;
            this.f7216h = bVar.f7199i;
            this.f7217i = bVar.f7200j;
            this.f7218j = bVar.f7205o;
            this.f7219k = bVar.f7206p;
            this.f7220l = bVar.f7201k;
            this.f7221m = bVar.f7202l;
            this.f7222n = bVar.f7203m;
            this.f7223o = bVar.f7204n;
            this.f7224p = bVar.f7207q;
            this.f7225q = bVar.f7208r;
        }

        public b a() {
            return new b(this.f7209a, this.f7211c, this.f7212d, this.f7210b, this.f7213e, this.f7214f, this.f7215g, this.f7216h, this.f7217i, this.f7218j, this.f7219k, this.f7220l, this.f7221m, this.f7222n, this.f7223o, this.f7224p, this.f7225q);
        }

        public C0083b b() {
            this.f7222n = false;
            return this;
        }

        public int c() {
            return this.f7215g;
        }

        public int d() {
            return this.f7217i;
        }

        public CharSequence e() {
            return this.f7209a;
        }

        public C0083b f(Bitmap bitmap) {
            this.f7210b = bitmap;
            return this;
        }

        public C0083b g(float f9) {
            this.f7221m = f9;
            return this;
        }

        public C0083b h(float f9, int i9) {
            this.f7213e = f9;
            this.f7214f = i9;
            return this;
        }

        public C0083b i(int i9) {
            this.f7215g = i9;
            return this;
        }

        public C0083b j(Layout.Alignment alignment) {
            this.f7212d = alignment;
            return this;
        }

        public C0083b k(float f9) {
            this.f7216h = f9;
            return this;
        }

        public C0083b l(int i9) {
            this.f7217i = i9;
            return this;
        }

        public C0083b m(float f9) {
            this.f7225q = f9;
            return this;
        }

        public C0083b n(float f9) {
            this.f7220l = f9;
            return this;
        }

        public C0083b o(CharSequence charSequence) {
            this.f7209a = charSequence;
            return this;
        }

        public C0083b p(Layout.Alignment alignment) {
            this.f7211c = alignment;
            return this;
        }

        public C0083b q(float f9, int i9) {
            this.f7219k = f9;
            this.f7218j = i9;
            return this;
        }

        public C0083b r(int i9) {
            this.f7224p = i9;
            return this;
        }

        public C0083b s(int i9) {
            this.f7223o = i9;
            this.f7222n = true;
            return this;
        }
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f9, int i9, int i10, float f10, int i11, int i12, float f11, float f12, float f13, boolean z9, int i13, int i14, float f14) {
        if (charSequence == null) {
            AbstractC1684a.e(bitmap);
        } else {
            AbstractC1684a.a(bitmap == null);
        }
        this.f7192a = charSequence instanceof Spanned ? SpannedString.valueOf(charSequence) : charSequence != null ? charSequence.toString() : null;
        this.f7193c = alignment;
        this.f7194d = alignment2;
        this.f7195e = bitmap;
        this.f7196f = f9;
        this.f7197g = i9;
        this.f7198h = i10;
        this.f7199i = f10;
        this.f7200j = i11;
        this.f7201k = f12;
        this.f7202l = f13;
        this.f7203m = z9;
        this.f7204n = i13;
        this.f7205o = i12;
        this.f7206p = f11;
        this.f7207q = i14;
        this.f7208r = f14;
    }

    public static final b c(Bundle bundle) {
        C0083b c0083b = new C0083b();
        CharSequence charSequence = bundle.getCharSequence(f7185t);
        if (charSequence != null) {
            c0083b.o(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f7186u);
        if (alignment != null) {
            c0083b.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f7187v);
        if (alignment2 != null) {
            c0083b.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f7188w);
        if (bitmap != null) {
            c0083b.f(bitmap);
        }
        String str = f7189x;
        if (bundle.containsKey(str)) {
            String str2 = f7190y;
            if (bundle.containsKey(str2)) {
                c0083b.h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = f7191z;
        if (bundle.containsKey(str3)) {
            c0083b.i(bundle.getInt(str3));
        }
        String str4 = f7173A;
        if (bundle.containsKey(str4)) {
            c0083b.k(bundle.getFloat(str4));
        }
        String str5 = f7174B;
        if (bundle.containsKey(str5)) {
            c0083b.l(bundle.getInt(str5));
        }
        String str6 = f7176D;
        if (bundle.containsKey(str6)) {
            String str7 = f7175C;
            if (bundle.containsKey(str7)) {
                c0083b.q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = f7177E;
        if (bundle.containsKey(str8)) {
            c0083b.n(bundle.getFloat(str8));
        }
        String str9 = f7178F;
        if (bundle.containsKey(str9)) {
            c0083b.g(bundle.getFloat(str9));
        }
        String str10 = f7179G;
        if (bundle.containsKey(str10)) {
            c0083b.s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(f7180H, false)) {
            c0083b.b();
        }
        String str11 = f7181I;
        if (bundle.containsKey(str11)) {
            c0083b.r(bundle.getInt(str11));
        }
        String str12 = f7182J;
        if (bundle.containsKey(str12)) {
            c0083b.m(bundle.getFloat(str12));
        }
        return c0083b.a();
    }

    public C0083b b() {
        return new C0083b();
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return TextUtils.equals(this.f7192a, bVar.f7192a) && this.f7193c == bVar.f7193c && this.f7194d == bVar.f7194d && ((bitmap = this.f7195e) != null ? !((bitmap2 = bVar.f7195e) == null || !bitmap.sameAs(bitmap2)) : bVar.f7195e == null) && this.f7196f == bVar.f7196f && this.f7197g == bVar.f7197g && this.f7198h == bVar.f7198h && this.f7199i == bVar.f7199i && this.f7200j == bVar.f7200j && this.f7201k == bVar.f7201k && this.f7202l == bVar.f7202l && this.f7203m == bVar.f7203m && this.f7204n == bVar.f7204n && this.f7205o == bVar.f7205o && this.f7206p == bVar.f7206p && this.f7207q == bVar.f7207q && this.f7208r == bVar.f7208r;
    }

    @Override // O2.InterfaceC0901n
    public Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(f7185t, this.f7192a);
        bundle.putSerializable(f7186u, this.f7193c);
        bundle.putSerializable(f7187v, this.f7194d);
        bundle.putParcelable(f7188w, this.f7195e);
        bundle.putFloat(f7189x, this.f7196f);
        bundle.putInt(f7190y, this.f7197g);
        bundle.putInt(f7191z, this.f7198h);
        bundle.putFloat(f7173A, this.f7199i);
        bundle.putInt(f7174B, this.f7200j);
        bundle.putInt(f7175C, this.f7205o);
        bundle.putFloat(f7176D, this.f7206p);
        bundle.putFloat(f7177E, this.f7201k);
        bundle.putFloat(f7178F, this.f7202l);
        bundle.putBoolean(f7180H, this.f7203m);
        bundle.putInt(f7179G, this.f7204n);
        bundle.putInt(f7181I, this.f7207q);
        bundle.putFloat(f7182J, this.f7208r);
        return bundle;
    }

    public int hashCode() {
        return r5.j.b(this.f7192a, this.f7193c, this.f7194d, this.f7195e, Float.valueOf(this.f7196f), Integer.valueOf(this.f7197g), Integer.valueOf(this.f7198h), Float.valueOf(this.f7199i), Integer.valueOf(this.f7200j), Float.valueOf(this.f7201k), Float.valueOf(this.f7202l), Boolean.valueOf(this.f7203m), Integer.valueOf(this.f7204n), Integer.valueOf(this.f7205o), Float.valueOf(this.f7206p), Integer.valueOf(this.f7207q), Float.valueOf(this.f7208r));
    }
}
