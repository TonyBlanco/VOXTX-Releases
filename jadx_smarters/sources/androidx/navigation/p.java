package androidx.navigation;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16429g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f16430a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f16432c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16431b = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16433d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f16434e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f16435f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f16436g = -1;

        public p a() {
            return new p(this.f16430a, this.f16431b, this.f16432c, this.f16433d, this.f16434e, this.f16435f, this.f16436g);
        }

        public a b(int i9) {
            this.f16433d = i9;
            return this;
        }

        public a c(int i9) {
            this.f16434e = i9;
            return this;
        }

        public a d(boolean z9) {
            this.f16430a = z9;
            return this;
        }

        public a e(int i9) {
            this.f16435f = i9;
            return this;
        }

        public a f(int i9) {
            this.f16436g = i9;
            return this;
        }

        public a g(int i9, boolean z9) {
            this.f16431b = i9;
            this.f16432c = z9;
            return this;
        }
    }

    public p(boolean z9, int i9, boolean z10, int i10, int i11, int i12, int i13) {
        this.f16423a = z9;
        this.f16424b = i9;
        this.f16425c = z10;
        this.f16426d = i10;
        this.f16427e = i11;
        this.f16428f = i12;
        this.f16429g = i13;
    }

    public int a() {
        return this.f16426d;
    }

    public int b() {
        return this.f16427e;
    }

    public int c() {
        return this.f16428f;
    }

    public int d() {
        return this.f16429g;
    }

    public int e() {
        return this.f16424b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.f16423a == pVar.f16423a && this.f16424b == pVar.f16424b && this.f16425c == pVar.f16425c && this.f16426d == pVar.f16426d && this.f16427e == pVar.f16427e && this.f16428f == pVar.f16428f && this.f16429g == pVar.f16429g;
    }

    public boolean f() {
        return this.f16425c;
    }

    public boolean g() {
        return this.f16423a;
    }

    public int hashCode() {
        return ((((((((((((g() ? 1 : 0) * 31) + e()) * 31) + (f() ? 1 : 0)) * 31) + a()) * 31) + b()) * 31) + c()) * 31) + d();
    }
}
