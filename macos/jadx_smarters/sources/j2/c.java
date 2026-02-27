package J2;

import J2.f;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f3032c;

    public static final class b extends f.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f3033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f3034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set f3035c;

        @Override // J2.f.b.a
        public f.b a() {
            String str = "";
            if (this.f3033a == null) {
                str = " delta";
            }
            if (this.f3034b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f3035c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f3033a.longValue(), this.f3034b.longValue(), this.f3035c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J2.f.b.a
        public f.b.a b(long j9) {
            this.f3033a = Long.valueOf(j9);
            return this;
        }

        @Override // J2.f.b.a
        public f.b.a c(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f3035c = set;
            return this;
        }

        @Override // J2.f.b.a
        public f.b.a d(long j9) {
            this.f3034b = Long.valueOf(j9);
            return this;
        }
    }

    public c(long j9, long j10, Set set) {
        this.f3030a = j9;
        this.f3031b = j10;
        this.f3032c = set;
    }

    @Override // J2.f.b
    public long b() {
        return this.f3030a;
    }

    @Override // J2.f.b
    public Set c() {
        return this.f3032c;
    }

    @Override // J2.f.b
    public long d() {
        return this.f3031b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        return this.f3030a == bVar.b() && this.f3031b == bVar.d() && this.f3032c.equals(bVar.c());
    }

    public int hashCode() {
        long j9 = this.f3030a;
        int i9 = (((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003;
        long j10 = this.f3031b;
        return this.f3032c.hashCode() ^ ((i9 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f3030a + ", maxAllowedDelay=" + this.f3031b + ", flags=" + this.f3032c + "}";
    }
}
