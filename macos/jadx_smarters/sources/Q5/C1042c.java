package Q5;

import Q5.B;

/* JADX INFO: renamed from: Q5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1042c extends B.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f8196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f8197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f8198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C f8199i;

    /* JADX INFO: renamed from: Q5.c$b */
    public static final class b extends B.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f8200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f8201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f8202c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f8203d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f8204e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f8205f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Long f8206g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f8207h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public C f8208i;

        @Override // Q5.B.a.b
        public B.a a() {
            String str = "";
            if (this.f8200a == null) {
                str = " pid";
            }
            if (this.f8201b == null) {
                str = str + " processName";
            }
            if (this.f8202c == null) {
                str = str + " reasonCode";
            }
            if (this.f8203d == null) {
                str = str + " importance";
            }
            if (this.f8204e == null) {
                str = str + " pss";
            }
            if (this.f8205f == null) {
                str = str + " rss";
            }
            if (this.f8206g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new C1042c(this.f8200a.intValue(), this.f8201b, this.f8202c.intValue(), this.f8203d.intValue(), this.f8204e.longValue(), this.f8205f.longValue(), this.f8206g.longValue(), this.f8207h, this.f8208i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Q5.B.a.b
        public B.a.b b(C c9) {
            this.f8208i = c9;
            return this;
        }

        @Override // Q5.B.a.b
        public B.a.b c(int i9) {
            this.f8203d = Integer.valueOf(i9);
            return this;
        }

        @Override // Q5.B.a.b
        public B.a.b d(int i9) {
            this.f8200a = Integer.valueOf(i9);
            return this;
        }

        @Override // Q5.B.a.b
        public B.a.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f8201b = str;
            return this;
        }

        @Override // Q5.B.a.b
        public B.a.b f(long j9) {
            this.f8204e = Long.valueOf(j9);
            return this;
        }

        @Override // Q5.B.a.b
        public B.a.b g(int i9) {
            this.f8202c = Integer.valueOf(i9);
            return this;
        }

        @Override // Q5.B.a.b
        public B.a.b h(long j9) {
            this.f8205f = Long.valueOf(j9);
            return this;
        }

        @Override // Q5.B.a.b
        public B.a.b i(long j9) {
            this.f8206g = Long.valueOf(j9);
            return this;
        }

        @Override // Q5.B.a.b
        public B.a.b j(String str) {
            this.f8207h = str;
            return this;
        }
    }

    public C1042c(int i9, String str, int i10, int i11, long j9, long j10, long j11, String str2, C c9) {
        this.f8191a = i9;
        this.f8192b = str;
        this.f8193c = i10;
        this.f8194d = i11;
        this.f8195e = j9;
        this.f8196f = j10;
        this.f8197g = j11;
        this.f8198h = str2;
        this.f8199i = c9;
    }

    @Override // Q5.B.a
    public C b() {
        return this.f8199i;
    }

    @Override // Q5.B.a
    public int c() {
        return this.f8194d;
    }

    @Override // Q5.B.a
    public int d() {
        return this.f8191a;
    }

    @Override // Q5.B.a
    public String e() {
        return this.f8192b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.a)) {
            return false;
        }
        B.a aVar = (B.a) obj;
        if (this.f8191a == aVar.d() && this.f8192b.equals(aVar.e()) && this.f8193c == aVar.g() && this.f8194d == aVar.c() && this.f8195e == aVar.f() && this.f8196f == aVar.h() && this.f8197g == aVar.i() && ((str = this.f8198h) != null ? str.equals(aVar.j()) : aVar.j() == null)) {
            C c9 = this.f8199i;
            C cB = aVar.b();
            if (c9 == null) {
                if (cB == null) {
                    return true;
                }
            } else if (c9.equals(cB)) {
                return true;
            }
        }
        return false;
    }

    @Override // Q5.B.a
    public long f() {
        return this.f8195e;
    }

    @Override // Q5.B.a
    public int g() {
        return this.f8193c;
    }

    @Override // Q5.B.a
    public long h() {
        return this.f8196f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f8191a ^ 1000003) * 1000003) ^ this.f8192b.hashCode()) * 1000003) ^ this.f8193c) * 1000003) ^ this.f8194d) * 1000003;
        long j9 = this.f8195e;
        int i9 = (iHashCode ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f8196f;
        int i10 = (i9 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f8197g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str = this.f8198h;
        int iHashCode2 = (i11 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        C c9 = this.f8199i;
        return iHashCode2 ^ (c9 != null ? c9.hashCode() : 0);
    }

    @Override // Q5.B.a
    public long i() {
        return this.f8197g;
    }

    @Override // Q5.B.a
    public String j() {
        return this.f8198h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f8191a + ", processName=" + this.f8192b + ", reasonCode=" + this.f8193c + ", importance=" + this.f8194d + ", pss=" + this.f8195e + ", rss=" + this.f8196f + ", timestamp=" + this.f8197g + ", traceFile=" + this.f8198h + ", buildIdMappingForArch=" + this.f8199i + "}";
    }
}
