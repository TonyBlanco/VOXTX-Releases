package m6;

import m6.AbstractC2233d;

/* JADX INFO: renamed from: m6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2230a extends AbstractC2233d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC2235f f44408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC2233d.b f44409e;

    /* JADX INFO: renamed from: m6.a$b */
    public static final class b extends AbstractC2233d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f44410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f44411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f44412c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public AbstractC2235f f44413d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public AbstractC2233d.b f44414e;

        @Override // m6.AbstractC2233d.a
        public AbstractC2233d a() {
            return new C2230a(this.f44410a, this.f44411b, this.f44412c, this.f44413d, this.f44414e);
        }

        @Override // m6.AbstractC2233d.a
        public AbstractC2233d.a b(AbstractC2235f abstractC2235f) {
            this.f44413d = abstractC2235f;
            return this;
        }

        @Override // m6.AbstractC2233d.a
        public AbstractC2233d.a c(String str) {
            this.f44411b = str;
            return this;
        }

        @Override // m6.AbstractC2233d.a
        public AbstractC2233d.a d(String str) {
            this.f44412c = str;
            return this;
        }

        @Override // m6.AbstractC2233d.a
        public AbstractC2233d.a e(AbstractC2233d.b bVar) {
            this.f44414e = bVar;
            return this;
        }

        @Override // m6.AbstractC2233d.a
        public AbstractC2233d.a f(String str) {
            this.f44410a = str;
            return this;
        }
    }

    public C2230a(String str, String str2, String str3, AbstractC2235f abstractC2235f, AbstractC2233d.b bVar) {
        this.f44405a = str;
        this.f44406b = str2;
        this.f44407c = str3;
        this.f44408d = abstractC2235f;
        this.f44409e = bVar;
    }

    @Override // m6.AbstractC2233d
    public AbstractC2235f b() {
        return this.f44408d;
    }

    @Override // m6.AbstractC2233d
    public String c() {
        return this.f44406b;
    }

    @Override // m6.AbstractC2233d
    public String d() {
        return this.f44407c;
    }

    @Override // m6.AbstractC2233d
    public AbstractC2233d.b e() {
        return this.f44409e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2233d)) {
            return false;
        }
        AbstractC2233d abstractC2233d = (AbstractC2233d) obj;
        String str = this.f44405a;
        if (str != null ? str.equals(abstractC2233d.f()) : abstractC2233d.f() == null) {
            String str2 = this.f44406b;
            if (str2 != null ? str2.equals(abstractC2233d.c()) : abstractC2233d.c() == null) {
                String str3 = this.f44407c;
                if (str3 != null ? str3.equals(abstractC2233d.d()) : abstractC2233d.d() == null) {
                    AbstractC2235f abstractC2235f = this.f44408d;
                    if (abstractC2235f != null ? abstractC2235f.equals(abstractC2233d.b()) : abstractC2233d.b() == null) {
                        AbstractC2233d.b bVar = this.f44409e;
                        AbstractC2233d.b bVarE = abstractC2233d.e();
                        if (bVar == null) {
                            if (bVarE == null) {
                                return true;
                            }
                        } else if (bVar.equals(bVarE)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // m6.AbstractC2233d
    public String f() {
        return this.f44405a;
    }

    public int hashCode() {
        String str = this.f44405a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f44406b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f44407c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        AbstractC2235f abstractC2235f = this.f44408d;
        int iHashCode4 = (iHashCode3 ^ (abstractC2235f == null ? 0 : abstractC2235f.hashCode())) * 1000003;
        AbstractC2233d.b bVar = this.f44409e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f44405a + ", fid=" + this.f44406b + ", refreshToken=" + this.f44407c + ", authToken=" + this.f44408d + ", responseCode=" + this.f44409e + "}";
    }
}
