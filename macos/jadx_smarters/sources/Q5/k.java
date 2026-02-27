package Q5;

import Q5.B;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends B.e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f8270h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f8271i;

    public static final class b extends B.e.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f8272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f8273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f8274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f8275d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f8276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Boolean f8277f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f8278g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f8279h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f8280i;

        @Override // Q5.B.e.c.a
        public B.e.c a() {
            String str = "";
            if (this.f8272a == null) {
                str = " arch";
            }
            if (this.f8273b == null) {
                str = str + " model";
            }
            if (this.f8274c == null) {
                str = str + " cores";
            }
            if (this.f8275d == null) {
                str = str + " ram";
            }
            if (this.f8276e == null) {
                str = str + " diskSpace";
            }
            if (this.f8277f == null) {
                str = str + " simulator";
            }
            if (this.f8278g == null) {
                str = str + " state";
            }
            if (this.f8279h == null) {
                str = str + " manufacturer";
            }
            if (this.f8280i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new k(this.f8272a.intValue(), this.f8273b, this.f8274c.intValue(), this.f8275d.longValue(), this.f8276e.longValue(), this.f8277f.booleanValue(), this.f8278g.intValue(), this.f8279h, this.f8280i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Q5.B.e.c.a
        public B.e.c.a b(int i9) {
            this.f8272a = Integer.valueOf(i9);
            return this;
        }

        @Override // Q5.B.e.c.a
        public B.e.c.a c(int i9) {
            this.f8274c = Integer.valueOf(i9);
            return this;
        }

        @Override // Q5.B.e.c.a
        public B.e.c.a d(long j9) {
            this.f8276e = Long.valueOf(j9);
            return this;
        }

        @Override // Q5.B.e.c.a
        public B.e.c.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f8279h = str;
            return this;
        }

        @Override // Q5.B.e.c.a
        public B.e.c.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f8273b = str;
            return this;
        }

        @Override // Q5.B.e.c.a
        public B.e.c.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f8280i = str;
            return this;
        }

        @Override // Q5.B.e.c.a
        public B.e.c.a h(long j9) {
            this.f8275d = Long.valueOf(j9);
            return this;
        }

        @Override // Q5.B.e.c.a
        public B.e.c.a i(boolean z9) {
            this.f8277f = Boolean.valueOf(z9);
            return this;
        }

        @Override // Q5.B.e.c.a
        public B.e.c.a j(int i9) {
            this.f8278g = Integer.valueOf(i9);
            return this;
        }
    }

    public k(int i9, String str, int i10, long j9, long j10, boolean z9, int i11, String str2, String str3) {
        this.f8263a = i9;
        this.f8264b = str;
        this.f8265c = i10;
        this.f8266d = j9;
        this.f8267e = j10;
        this.f8268f = z9;
        this.f8269g = i11;
        this.f8270h = str2;
        this.f8271i = str3;
    }

    @Override // Q5.B.e.c
    public int b() {
        return this.f8263a;
    }

    @Override // Q5.B.e.c
    public int c() {
        return this.f8265c;
    }

    @Override // Q5.B.e.c
    public long d() {
        return this.f8267e;
    }

    @Override // Q5.B.e.c
    public String e() {
        return this.f8270h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.c)) {
            return false;
        }
        B.e.c cVar = (B.e.c) obj;
        return this.f8263a == cVar.b() && this.f8264b.equals(cVar.f()) && this.f8265c == cVar.c() && this.f8266d == cVar.h() && this.f8267e == cVar.d() && this.f8268f == cVar.j() && this.f8269g == cVar.i() && this.f8270h.equals(cVar.e()) && this.f8271i.equals(cVar.g());
    }

    @Override // Q5.B.e.c
    public String f() {
        return this.f8264b;
    }

    @Override // Q5.B.e.c
    public String g() {
        return this.f8271i;
    }

    @Override // Q5.B.e.c
    public long h() {
        return this.f8266d;
    }

    public int hashCode() {
        int iHashCode = (((((this.f8263a ^ 1000003) * 1000003) ^ this.f8264b.hashCode()) * 1000003) ^ this.f8265c) * 1000003;
        long j9 = this.f8266d;
        int i9 = (iHashCode ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f8267e;
        return ((((((((i9 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f8268f ? 1231 : 1237)) * 1000003) ^ this.f8269g) * 1000003) ^ this.f8270h.hashCode()) * 1000003) ^ this.f8271i.hashCode();
    }

    @Override // Q5.B.e.c
    public int i() {
        return this.f8269g;
    }

    @Override // Q5.B.e.c
    public boolean j() {
        return this.f8268f;
    }

    public String toString() {
        return "Device{arch=" + this.f8263a + ", model=" + this.f8264b + ", cores=" + this.f8265c + ", ram=" + this.f8266d + ", diskSpace=" + this.f8267e + ", simulator=" + this.f8268f + ", state=" + this.f8269g + ", manufacturer=" + this.f8270h + ", modelClass=" + this.f8271i + "}";
    }
}
