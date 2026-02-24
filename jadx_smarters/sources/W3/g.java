package W3;

import android.text.Layout;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10284e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f10290k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f10291l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Layout.Alignment f10294o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f10295p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f10297r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10285f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10286g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10287h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10288i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10289j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10292m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10293n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10296q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f10298s = Float.MAX_VALUE;

    public g A(String str) {
        this.f10291l = str;
        return this;
    }

    public g B(boolean z9) {
        this.f10288i = z9 ? 1 : 0;
        return this;
    }

    public g C(boolean z9) {
        this.f10285f = z9 ? 1 : 0;
        return this;
    }

    public g D(Layout.Alignment alignment) {
        this.f10295p = alignment;
        return this;
    }

    public g E(int i9) {
        this.f10293n = i9;
        return this;
    }

    public g F(int i9) {
        this.f10292m = i9;
        return this;
    }

    public g G(float f9) {
        this.f10298s = f9;
        return this;
    }

    public g H(Layout.Alignment alignment) {
        this.f10294o = alignment;
        return this;
    }

    public g I(boolean z9) {
        this.f10296q = z9 ? 1 : 0;
        return this;
    }

    public g J(b bVar) {
        this.f10297r = bVar;
        return this;
    }

    public g K(boolean z9) {
        this.f10286g = z9 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return r(gVar, true);
    }

    public int b() {
        if (this.f10284e) {
            return this.f10283d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f10282c) {
            return this.f10281b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f10280a;
    }

    public float e() {
        return this.f10290k;
    }

    public int f() {
        return this.f10289j;
    }

    public String g() {
        return this.f10291l;
    }

    public Layout.Alignment h() {
        return this.f10295p;
    }

    public int i() {
        return this.f10293n;
    }

    public int j() {
        return this.f10292m;
    }

    public float k() {
        return this.f10298s;
    }

    public int l() {
        int i9 = this.f10287h;
        if (i9 == -1 && this.f10288i == -1) {
            return -1;
        }
        return (i9 == 1 ? 1 : 0) | (this.f10288i == 1 ? 2 : 0);
    }

    public Layout.Alignment m() {
        return this.f10294o;
    }

    public boolean n() {
        return this.f10296q == 1;
    }

    public b o() {
        return this.f10297r;
    }

    public boolean p() {
        return this.f10284e;
    }

    public boolean q() {
        return this.f10282c;
    }

    public final g r(g gVar, boolean z9) {
        int i9;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f10282c && gVar.f10282c) {
                w(gVar.f10281b);
            }
            if (this.f10287h == -1) {
                this.f10287h = gVar.f10287h;
            }
            if (this.f10288i == -1) {
                this.f10288i = gVar.f10288i;
            }
            if (this.f10280a == null && (str = gVar.f10280a) != null) {
                this.f10280a = str;
            }
            if (this.f10285f == -1) {
                this.f10285f = gVar.f10285f;
            }
            if (this.f10286g == -1) {
                this.f10286g = gVar.f10286g;
            }
            if (this.f10293n == -1) {
                this.f10293n = gVar.f10293n;
            }
            if (this.f10294o == null && (alignment2 = gVar.f10294o) != null) {
                this.f10294o = alignment2;
            }
            if (this.f10295p == null && (alignment = gVar.f10295p) != null) {
                this.f10295p = alignment;
            }
            if (this.f10296q == -1) {
                this.f10296q = gVar.f10296q;
            }
            if (this.f10289j == -1) {
                this.f10289j = gVar.f10289j;
                this.f10290k = gVar.f10290k;
            }
            if (this.f10297r == null) {
                this.f10297r = gVar.f10297r;
            }
            if (this.f10298s == Float.MAX_VALUE) {
                this.f10298s = gVar.f10298s;
            }
            if (z9 && !this.f10284e && gVar.f10284e) {
                u(gVar.f10283d);
            }
            if (z9 && this.f10292m == -1 && (i9 = gVar.f10292m) != -1) {
                this.f10292m = i9;
            }
        }
        return this;
    }

    public boolean s() {
        return this.f10285f == 1;
    }

    public boolean t() {
        return this.f10286g == 1;
    }

    public g u(int i9) {
        this.f10283d = i9;
        this.f10284e = true;
        return this;
    }

    public g v(boolean z9) {
        this.f10287h = z9 ? 1 : 0;
        return this;
    }

    public g w(int i9) {
        this.f10281b = i9;
        this.f10282c = true;
        return this;
    }

    public g x(String str) {
        this.f10280a = str;
        return this;
    }

    public g y(float f9) {
        this.f10290k = f9;
        return this;
    }

    public g z(int i9) {
        this.f10289j = i9;
        return this;
    }
}
