package Q5;

import Q5.B;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends B.e.d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f8351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f8356f;

    public static final class b extends B.e.d.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Double f8357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f8358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Boolean f8359c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f8360d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f8361e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f8362f;

        @Override // Q5.B.e.d.c.a
        public B.e.d.c a() {
            String str = "";
            if (this.f8358b == null) {
                str = " batteryVelocity";
            }
            if (this.f8359c == null) {
                str = str + " proximityOn";
            }
            if (this.f8360d == null) {
                str = str + " orientation";
            }
            if (this.f8361e == null) {
                str = str + " ramUsed";
            }
            if (this.f8362f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new t(this.f8357a, this.f8358b.intValue(), this.f8359c.booleanValue(), this.f8360d.intValue(), this.f8361e.longValue(), this.f8362f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Q5.B.e.d.c.a
        public B.e.d.c.a b(Double d9) {
            this.f8357a = d9;
            return this;
        }

        @Override // Q5.B.e.d.c.a
        public B.e.d.c.a c(int i9) {
            this.f8358b = Integer.valueOf(i9);
            return this;
        }

        @Override // Q5.B.e.d.c.a
        public B.e.d.c.a d(long j9) {
            this.f8362f = Long.valueOf(j9);
            return this;
        }

        @Override // Q5.B.e.d.c.a
        public B.e.d.c.a e(int i9) {
            this.f8360d = Integer.valueOf(i9);
            return this;
        }

        @Override // Q5.B.e.d.c.a
        public B.e.d.c.a f(boolean z9) {
            this.f8359c = Boolean.valueOf(z9);
            return this;
        }

        @Override // Q5.B.e.d.c.a
        public B.e.d.c.a g(long j9) {
            this.f8361e = Long.valueOf(j9);
            return this;
        }
    }

    public t(Double d9, int i9, boolean z9, int i10, long j9, long j10) {
        this.f8351a = d9;
        this.f8352b = i9;
        this.f8353c = z9;
        this.f8354d = i10;
        this.f8355e = j9;
        this.f8356f = j10;
    }

    @Override // Q5.B.e.d.c
    public Double b() {
        return this.f8351a;
    }

    @Override // Q5.B.e.d.c
    public int c() {
        return this.f8352b;
    }

    @Override // Q5.B.e.d.c
    public long d() {
        return this.f8356f;
    }

    @Override // Q5.B.e.d.c
    public int e() {
        return this.f8354d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.c)) {
            return false;
        }
        B.e.d.c cVar = (B.e.d.c) obj;
        Double d9 = this.f8351a;
        if (d9 != null ? d9.equals(cVar.b()) : cVar.b() == null) {
            if (this.f8352b == cVar.c() && this.f8353c == cVar.g() && this.f8354d == cVar.e() && this.f8355e == cVar.f() && this.f8356f == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // Q5.B.e.d.c
    public long f() {
        return this.f8355e;
    }

    @Override // Q5.B.e.d.c
    public boolean g() {
        return this.f8353c;
    }

    public int hashCode() {
        Double d9 = this.f8351a;
        int iHashCode = ((((((((d9 == null ? 0 : d9.hashCode()) ^ 1000003) * 1000003) ^ this.f8352b) * 1000003) ^ (this.f8353c ? 1231 : 1237)) * 1000003) ^ this.f8354d) * 1000003;
        long j9 = this.f8355e;
        long j10 = this.f8356f;
        return ((iHashCode ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f8351a + ", batteryVelocity=" + this.f8352b + ", proximityOn=" + this.f8353c + ", orientation=" + this.f8354d + ", ramUsed=" + this.f8355e + ", diskUsed=" + this.f8356f + "}";
    }
}
