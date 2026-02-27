package Q5;

import Q5.B;

/* JADX INFO: renamed from: Q5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1041b extends B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f8174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f8175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f8176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f8177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final B.e f8178i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final B.d f8179j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final B.a f8180k;

    /* JADX INFO: renamed from: Q5.b$b, reason: collision with other inner class name */
    public static final class C0110b extends B.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f8181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f8182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f8183c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f8184d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f8185e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f8186f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f8187g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public B.e f8188h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public B.d f8189i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public B.a f8190j;

        public C0110b() {
        }

        public C0110b(B b9) {
            this.f8181a = b9.k();
            this.f8182b = b9.g();
            this.f8183c = Integer.valueOf(b9.j());
            this.f8184d = b9.h();
            this.f8185e = b9.f();
            this.f8186f = b9.d();
            this.f8187g = b9.e();
            this.f8188h = b9.l();
            this.f8189i = b9.i();
            this.f8190j = b9.c();
        }

        @Override // Q5.B.b
        public B a() {
            String str = "";
            if (this.f8181a == null) {
                str = " sdkVersion";
            }
            if (this.f8182b == null) {
                str = str + " gmpAppId";
            }
            if (this.f8183c == null) {
                str = str + " platform";
            }
            if (this.f8184d == null) {
                str = str + " installationUuid";
            }
            if (this.f8186f == null) {
                str = str + " buildVersion";
            }
            if (this.f8187g == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new C1041b(this.f8181a, this.f8182b, this.f8183c.intValue(), this.f8184d, this.f8185e, this.f8186f, this.f8187g, this.f8188h, this.f8189i, this.f8190j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Q5.B.b
        public B.b b(B.a aVar) {
            this.f8190j = aVar;
            return this;
        }

        @Override // Q5.B.b
        public B.b c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f8186f = str;
            return this;
        }

        @Override // Q5.B.b
        public B.b d(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f8187g = str;
            return this;
        }

        @Override // Q5.B.b
        public B.b e(String str) {
            this.f8185e = str;
            return this;
        }

        @Override // Q5.B.b
        public B.b f(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.f8182b = str;
            return this;
        }

        @Override // Q5.B.b
        public B.b g(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.f8184d = str;
            return this;
        }

        @Override // Q5.B.b
        public B.b h(B.d dVar) {
            this.f8189i = dVar;
            return this;
        }

        @Override // Q5.B.b
        public B.b i(int i9) {
            this.f8183c = Integer.valueOf(i9);
            return this;
        }

        @Override // Q5.B.b
        public B.b j(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f8181a = str;
            return this;
        }

        @Override // Q5.B.b
        public B.b k(B.e eVar) {
            this.f8188h = eVar;
            return this;
        }
    }

    public C1041b(String str, String str2, int i9, String str3, String str4, String str5, String str6, B.e eVar, B.d dVar, B.a aVar) {
        this.f8171b = str;
        this.f8172c = str2;
        this.f8173d = i9;
        this.f8174e = str3;
        this.f8175f = str4;
        this.f8176g = str5;
        this.f8177h = str6;
        this.f8178i = eVar;
        this.f8179j = dVar;
        this.f8180k = aVar;
    }

    @Override // Q5.B
    public B.a c() {
        return this.f8180k;
    }

    @Override // Q5.B
    public String d() {
        return this.f8176g;
    }

    @Override // Q5.B
    public String e() {
        return this.f8177h;
    }

    public boolean equals(Object obj) {
        String str;
        B.e eVar;
        B.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b9 = (B) obj;
        if (this.f8171b.equals(b9.k()) && this.f8172c.equals(b9.g()) && this.f8173d == b9.j() && this.f8174e.equals(b9.h()) && ((str = this.f8175f) != null ? str.equals(b9.f()) : b9.f() == null) && this.f8176g.equals(b9.d()) && this.f8177h.equals(b9.e()) && ((eVar = this.f8178i) != null ? eVar.equals(b9.l()) : b9.l() == null) && ((dVar = this.f8179j) != null ? dVar.equals(b9.i()) : b9.i() == null)) {
            B.a aVar = this.f8180k;
            B.a aVarC = b9.c();
            if (aVar == null) {
                if (aVarC == null) {
                    return true;
                }
            } else if (aVar.equals(aVarC)) {
                return true;
            }
        }
        return false;
    }

    @Override // Q5.B
    public String f() {
        return this.f8175f;
    }

    @Override // Q5.B
    public String g() {
        return this.f8172c;
    }

    @Override // Q5.B
    public String h() {
        return this.f8174e;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f8171b.hashCode() ^ 1000003) * 1000003) ^ this.f8172c.hashCode()) * 1000003) ^ this.f8173d) * 1000003) ^ this.f8174e.hashCode()) * 1000003;
        String str = this.f8175f;
        int iHashCode2 = (((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f8176g.hashCode()) * 1000003) ^ this.f8177h.hashCode()) * 1000003;
        B.e eVar = this.f8178i;
        int iHashCode3 = (iHashCode2 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        B.d dVar = this.f8179j;
        int iHashCode4 = (iHashCode3 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        B.a aVar = this.f8180k;
        return iHashCode4 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // Q5.B
    public B.d i() {
        return this.f8179j;
    }

    @Override // Q5.B
    public int j() {
        return this.f8173d;
    }

    @Override // Q5.B
    public String k() {
        return this.f8171b;
    }

    @Override // Q5.B
    public B.e l() {
        return this.f8178i;
    }

    @Override // Q5.B
    public B.b m() {
        return new C0110b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f8171b + ", gmpAppId=" + this.f8172c + ", platform=" + this.f8173d + ", installationUuid=" + this.f8174e + ", firebaseInstallationId=" + this.f8175f + ", buildVersion=" + this.f8176g + ", displayVersion=" + this.f8177h + ", session=" + this.f8178i + ", ndkPayload=" + this.f8179j + ", appExitInfo=" + this.f8180k + "}";
    }
}
