package Q0;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f7434i = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f7435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f7440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f7441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f7442h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7443a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f7444b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public l f7445c = l.NOT_REQUIRED;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f7446d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f7447e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f7448f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f7449g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c f7450h = new c();

        public b a() {
            return new b(this);
        }

        public a b(l lVar) {
            this.f7445c = lVar;
            return this;
        }
    }

    public b() {
        this.f7435a = l.NOT_REQUIRED;
        this.f7440f = -1L;
        this.f7441g = -1L;
        this.f7442h = new c();
    }

    public b(a aVar) {
        this.f7435a = l.NOT_REQUIRED;
        this.f7440f = -1L;
        this.f7441g = -1L;
        this.f7442h = new c();
        this.f7436b = aVar.f7443a;
        int i9 = Build.VERSION.SDK_INT;
        this.f7437c = i9 >= 23 && aVar.f7444b;
        this.f7435a = aVar.f7445c;
        this.f7438d = aVar.f7446d;
        this.f7439e = aVar.f7447e;
        if (i9 >= 24) {
            this.f7442h = aVar.f7450h;
            this.f7440f = aVar.f7448f;
            this.f7441g = aVar.f7449g;
        }
    }

    public b(b bVar) {
        this.f7435a = l.NOT_REQUIRED;
        this.f7440f = -1L;
        this.f7441g = -1L;
        this.f7442h = new c();
        this.f7436b = bVar.f7436b;
        this.f7437c = bVar.f7437c;
        this.f7435a = bVar.f7435a;
        this.f7438d = bVar.f7438d;
        this.f7439e = bVar.f7439e;
        this.f7442h = bVar.f7442h;
    }

    public c a() {
        return this.f7442h;
    }

    public l b() {
        return this.f7435a;
    }

    public long c() {
        return this.f7440f;
    }

    public long d() {
        return this.f7441g;
    }

    public boolean e() {
        return this.f7442h.c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f7436b == bVar.f7436b && this.f7437c == bVar.f7437c && this.f7438d == bVar.f7438d && this.f7439e == bVar.f7439e && this.f7440f == bVar.f7440f && this.f7441g == bVar.f7441g && this.f7435a == bVar.f7435a) {
            return this.f7442h.equals(bVar.f7442h);
        }
        return false;
    }

    public boolean f() {
        return this.f7438d;
    }

    public boolean g() {
        return this.f7436b;
    }

    public boolean h() {
        return this.f7437c;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f7435a.hashCode() * 31) + (this.f7436b ? 1 : 0)) * 31) + (this.f7437c ? 1 : 0)) * 31) + (this.f7438d ? 1 : 0)) * 31) + (this.f7439e ? 1 : 0)) * 31;
        long j9 = this.f7440f;
        int i9 = (iHashCode + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f7441g;
        return ((i9 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f7442h.hashCode();
    }

    public boolean i() {
        return this.f7439e;
    }

    public void j(c cVar) {
        this.f7442h = cVar;
    }

    public void k(l lVar) {
        this.f7435a = lVar;
    }

    public void l(boolean z9) {
        this.f7438d = z9;
    }

    public void m(boolean z9) {
        this.f7436b = z9;
    }

    public void n(boolean z9) {
        this.f7437c = z9;
    }

    public void o(boolean z9) {
        this.f7439e = z9;
    }

    public void p(long j9) {
        this.f7440f = j9;
    }

    public void q(long j9) {
        this.f7441g = j9;
    }
}
