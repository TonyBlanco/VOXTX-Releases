package B2;

import B2.m;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f258g;

    public static final class b extends m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public k f261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f262d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f263e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List f264f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p f265g;

        @Override // B2.m.a
        public m a() {
            String str = "";
            if (this.f259a == null) {
                str = " requestTimeMs";
            }
            if (this.f260b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f259a.longValue(), this.f260b.longValue(), this.f261c, this.f262d, this.f263e, this.f264f, this.f265g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // B2.m.a
        public m.a b(k kVar) {
            this.f261c = kVar;
            return this;
        }

        @Override // B2.m.a
        public m.a c(List list) {
            this.f264f = list;
            return this;
        }

        @Override // B2.m.a
        public m.a d(Integer num) {
            this.f262d = num;
            return this;
        }

        @Override // B2.m.a
        public m.a e(String str) {
            this.f263e = str;
            return this;
        }

        @Override // B2.m.a
        public m.a f(p pVar) {
            this.f265g = pVar;
            return this;
        }

        @Override // B2.m.a
        public m.a g(long j9) {
            this.f259a = Long.valueOf(j9);
            return this;
        }

        @Override // B2.m.a
        public m.a h(long j9) {
            this.f260b = Long.valueOf(j9);
            return this;
        }
    }

    public g(long j9, long j10, k kVar, Integer num, String str, List list, p pVar) {
        this.f252a = j9;
        this.f253b = j10;
        this.f254c = kVar;
        this.f255d = num;
        this.f256e = str;
        this.f257f = list;
        this.f258g = pVar;
    }

    @Override // B2.m
    public k b() {
        return this.f254c;
    }

    @Override // B2.m
    public List c() {
        return this.f257f;
    }

    @Override // B2.m
    public Integer d() {
        return this.f255d;
    }

    @Override // B2.m
    public String e() {
        return this.f256e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f252a == mVar.g() && this.f253b == mVar.h() && ((kVar = this.f254c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f255d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f256e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f257f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
            p pVar = this.f258g;
            p pVarF = mVar.f();
            if (pVar == null) {
                if (pVarF == null) {
                    return true;
                }
            } else if (pVar.equals(pVarF)) {
                return true;
            }
        }
        return false;
    }

    @Override // B2.m
    public p f() {
        return this.f258g;
    }

    @Override // B2.m
    public long g() {
        return this.f252a;
    }

    @Override // B2.m
    public long h() {
        return this.f253b;
    }

    public int hashCode() {
        long j9 = this.f252a;
        long j10 = this.f253b;
        int i9 = (((((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        k kVar = this.f254c;
        int iHashCode = (i9 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f255d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f256e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f257f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f258g;
        return iHashCode4 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f252a + ", requestUptimeMs=" + this.f253b + ", clientInfo=" + this.f254c + ", logSource=" + this.f255d + ", logSourceName=" + this.f256e + ", logEvents=" + this.f257f + ", qosTier=" + this.f258g + "}";
    }
}
