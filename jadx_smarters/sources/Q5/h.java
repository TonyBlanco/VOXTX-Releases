package Q5;

import Q5.B;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends B.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f8231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final B.e.a f8233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final B.e.f f8234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final B.e.AbstractC0108e f8235i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final B.e.c f8236j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C f8237k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f8238l;

    public static final class b extends B.e.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f8239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f8240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f8241c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f8242d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f8243e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Boolean f8244f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public B.e.a f8245g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public B.e.f f8246h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public B.e.AbstractC0108e f8247i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public B.e.c f8248j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public C f8249k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Integer f8250l;

        public b() {
        }

        public b(B.e eVar) {
            this.f8239a = eVar.g();
            this.f8240b = eVar.i();
            this.f8241c = eVar.c();
            this.f8242d = Long.valueOf(eVar.l());
            this.f8243e = eVar.e();
            this.f8244f = Boolean.valueOf(eVar.n());
            this.f8245g = eVar.b();
            this.f8246h = eVar.m();
            this.f8247i = eVar.k();
            this.f8248j = eVar.d();
            this.f8249k = eVar.f();
            this.f8250l = Integer.valueOf(eVar.h());
        }

        @Override // Q5.B.e.b
        public B.e a() {
            String str = "";
            if (this.f8239a == null) {
                str = " generator";
            }
            if (this.f8240b == null) {
                str = str + " identifier";
            }
            if (this.f8242d == null) {
                str = str + " startedAt";
            }
            if (this.f8244f == null) {
                str = str + " crashed";
            }
            if (this.f8245g == null) {
                str = str + " app";
            }
            if (this.f8250l == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new h(this.f8239a, this.f8240b, this.f8241c, this.f8242d.longValue(), this.f8243e, this.f8244f.booleanValue(), this.f8245g, this.f8246h, this.f8247i, this.f8248j, this.f8249k, this.f8250l.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Q5.B.e.b
        public B.e.b b(B.e.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f8245g = aVar;
            return this;
        }

        @Override // Q5.B.e.b
        public B.e.b c(String str) {
            this.f8241c = str;
            return this;
        }

        @Override // Q5.B.e.b
        public B.e.b d(boolean z9) {
            this.f8244f = Boolean.valueOf(z9);
            return this;
        }

        @Override // Q5.B.e.b
        public B.e.b e(B.e.c cVar) {
            this.f8248j = cVar;
            return this;
        }

        @Override // Q5.B.e.b
        public B.e.b f(Long l9) {
            this.f8243e = l9;
            return this;
        }

        @Override // Q5.B.e.b
        public B.e.b g(C c9) {
            this.f8249k = c9;
            return this;
        }

        @Override // Q5.B.e.b
        public B.e.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f8239a = str;
            return this;
        }

        @Override // Q5.B.e.b
        public B.e.b i(int i9) {
            this.f8250l = Integer.valueOf(i9);
            return this;
        }

        @Override // Q5.B.e.b
        public B.e.b j(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f8240b = str;
            return this;
        }

        @Override // Q5.B.e.b
        public B.e.b l(B.e.AbstractC0108e abstractC0108e) {
            this.f8247i = abstractC0108e;
            return this;
        }

        @Override // Q5.B.e.b
        public B.e.b m(long j9) {
            this.f8242d = Long.valueOf(j9);
            return this;
        }

        @Override // Q5.B.e.b
        public B.e.b n(B.e.f fVar) {
            this.f8246h = fVar;
            return this;
        }
    }

    public h(String str, String str2, String str3, long j9, Long l9, boolean z9, B.e.a aVar, B.e.f fVar, B.e.AbstractC0108e abstractC0108e, B.e.c cVar, C c9, int i9) {
        this.f8227a = str;
        this.f8228b = str2;
        this.f8229c = str3;
        this.f8230d = j9;
        this.f8231e = l9;
        this.f8232f = z9;
        this.f8233g = aVar;
        this.f8234h = fVar;
        this.f8235i = abstractC0108e;
        this.f8236j = cVar;
        this.f8237k = c9;
        this.f8238l = i9;
    }

    @Override // Q5.B.e
    public B.e.a b() {
        return this.f8233g;
    }

    @Override // Q5.B.e
    public String c() {
        return this.f8229c;
    }

    @Override // Q5.B.e
    public B.e.c d() {
        return this.f8236j;
    }

    @Override // Q5.B.e
    public Long e() {
        return this.f8231e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l9;
        B.e.f fVar;
        B.e.AbstractC0108e abstractC0108e;
        B.e.c cVar;
        C c9;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e)) {
            return false;
        }
        B.e eVar = (B.e) obj;
        return this.f8227a.equals(eVar.g()) && this.f8228b.equals(eVar.i()) && ((str = this.f8229c) != null ? str.equals(eVar.c()) : eVar.c() == null) && this.f8230d == eVar.l() && ((l9 = this.f8231e) != null ? l9.equals(eVar.e()) : eVar.e() == null) && this.f8232f == eVar.n() && this.f8233g.equals(eVar.b()) && ((fVar = this.f8234h) != null ? fVar.equals(eVar.m()) : eVar.m() == null) && ((abstractC0108e = this.f8235i) != null ? abstractC0108e.equals(eVar.k()) : eVar.k() == null) && ((cVar = this.f8236j) != null ? cVar.equals(eVar.d()) : eVar.d() == null) && ((c9 = this.f8237k) != null ? c9.equals(eVar.f()) : eVar.f() == null) && this.f8238l == eVar.h();
    }

    @Override // Q5.B.e
    public C f() {
        return this.f8237k;
    }

    @Override // Q5.B.e
    public String g() {
        return this.f8227a;
    }

    @Override // Q5.B.e
    public int h() {
        return this.f8238l;
    }

    public int hashCode() {
        int iHashCode = (((this.f8227a.hashCode() ^ 1000003) * 1000003) ^ this.f8228b.hashCode()) * 1000003;
        String str = this.f8229c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j9 = this.f8230d;
        int i9 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        Long l9 = this.f8231e;
        int iHashCode3 = (((((i9 ^ (l9 == null ? 0 : l9.hashCode())) * 1000003) ^ (this.f8232f ? 1231 : 1237)) * 1000003) ^ this.f8233g.hashCode()) * 1000003;
        B.e.f fVar = this.f8234h;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        B.e.AbstractC0108e abstractC0108e = this.f8235i;
        int iHashCode5 = (iHashCode4 ^ (abstractC0108e == null ? 0 : abstractC0108e.hashCode())) * 1000003;
        B.e.c cVar = this.f8236j;
        int iHashCode6 = (iHashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        C c9 = this.f8237k;
        return ((iHashCode6 ^ (c9 != null ? c9.hashCode() : 0)) * 1000003) ^ this.f8238l;
    }

    @Override // Q5.B.e
    public String i() {
        return this.f8228b;
    }

    @Override // Q5.B.e
    public B.e.AbstractC0108e k() {
        return this.f8235i;
    }

    @Override // Q5.B.e
    public long l() {
        return this.f8230d;
    }

    @Override // Q5.B.e
    public B.e.f m() {
        return this.f8234h;
    }

    @Override // Q5.B.e
    public boolean n() {
        return this.f8232f;
    }

    @Override // Q5.B.e
    public B.e.b o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f8227a + ", identifier=" + this.f8228b + ", appQualitySessionId=" + this.f8229c + ", startedAt=" + this.f8230d + ", endedAt=" + this.f8231e + ", crashed=" + this.f8232f + ", app=" + this.f8233g + ", user=" + this.f8234h + ", os=" + this.f8235i + ", device=" + this.f8236j + ", events=" + this.f8237k + ", generatorType=" + this.f8238l + "}";
    }
}
