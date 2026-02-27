package K2;

import K2.AbstractC0690e;

/* JADX INFO: renamed from: K2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0686a extends AbstractC0690e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3640f;

    /* JADX INFO: renamed from: K2.a$b */
    public static final class b extends AbstractC0690e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f3641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f3642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f3643c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f3644d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f3645e;

        @Override // K2.AbstractC0690e.a
        public AbstractC0690e a() {
            String str = "";
            if (this.f3641a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f3642b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f3643c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f3644d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f3645e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C0686a(this.f3641a.longValue(), this.f3642b.intValue(), this.f3643c.intValue(), this.f3644d.longValue(), this.f3645e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // K2.AbstractC0690e.a
        public AbstractC0690e.a b(int i9) {
            this.f3643c = Integer.valueOf(i9);
            return this;
        }

        @Override // K2.AbstractC0690e.a
        public AbstractC0690e.a c(long j9) {
            this.f3644d = Long.valueOf(j9);
            return this;
        }

        @Override // K2.AbstractC0690e.a
        public AbstractC0690e.a d(int i9) {
            this.f3642b = Integer.valueOf(i9);
            return this;
        }

        @Override // K2.AbstractC0690e.a
        public AbstractC0690e.a e(int i9) {
            this.f3645e = Integer.valueOf(i9);
            return this;
        }

        @Override // K2.AbstractC0690e.a
        public AbstractC0690e.a f(long j9) {
            this.f3641a = Long.valueOf(j9);
            return this;
        }
    }

    public C0686a(long j9, int i9, int i10, long j10, int i11) {
        this.f3636b = j9;
        this.f3637c = i9;
        this.f3638d = i10;
        this.f3639e = j10;
        this.f3640f = i11;
    }

    @Override // K2.AbstractC0690e
    public int b() {
        return this.f3638d;
    }

    @Override // K2.AbstractC0690e
    public long c() {
        return this.f3639e;
    }

    @Override // K2.AbstractC0690e
    public int d() {
        return this.f3637c;
    }

    @Override // K2.AbstractC0690e
    public int e() {
        return this.f3640f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0690e)) {
            return false;
        }
        AbstractC0690e abstractC0690e = (AbstractC0690e) obj;
        return this.f3636b == abstractC0690e.f() && this.f3637c == abstractC0690e.d() && this.f3638d == abstractC0690e.b() && this.f3639e == abstractC0690e.c() && this.f3640f == abstractC0690e.e();
    }

    @Override // K2.AbstractC0690e
    public long f() {
        return this.f3636b;
    }

    public int hashCode() {
        long j9 = this.f3636b;
        int i9 = (((((((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003) ^ this.f3637c) * 1000003) ^ this.f3638d) * 1000003;
        long j10 = this.f3639e;
        return this.f3640f ^ ((i9 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f3636b + ", loadBatchSize=" + this.f3637c + ", criticalSectionEnterTimeoutMs=" + this.f3638d + ", eventCleanUpAge=" + this.f3639e + ", maxBlobByteSizePerRow=" + this.f3640f + "}";
    }
}
