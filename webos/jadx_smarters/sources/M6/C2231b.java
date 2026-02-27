package m6;

import m6.AbstractC2235f;

/* JADX INFO: renamed from: m6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2231b extends AbstractC2235f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f44416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC2235f.b f44417c;

    /* JADX INFO: renamed from: m6.b$b, reason: collision with other inner class name */
    public static final class C0384b extends AbstractC2235f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f44418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f44419b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AbstractC2235f.b f44420c;

        @Override // m6.AbstractC2235f.a
        public AbstractC2235f a() {
            String str = "";
            if (this.f44419b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C2231b(this.f44418a, this.f44419b.longValue(), this.f44420c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // m6.AbstractC2235f.a
        public AbstractC2235f.a b(AbstractC2235f.b bVar) {
            this.f44420c = bVar;
            return this;
        }

        @Override // m6.AbstractC2235f.a
        public AbstractC2235f.a c(String str) {
            this.f44418a = str;
            return this;
        }

        @Override // m6.AbstractC2235f.a
        public AbstractC2235f.a d(long j9) {
            this.f44419b = Long.valueOf(j9);
            return this;
        }
    }

    public C2231b(String str, long j9, AbstractC2235f.b bVar) {
        this.f44415a = str;
        this.f44416b = j9;
        this.f44417c = bVar;
    }

    @Override // m6.AbstractC2235f
    public AbstractC2235f.b b() {
        return this.f44417c;
    }

    @Override // m6.AbstractC2235f
    public String c() {
        return this.f44415a;
    }

    @Override // m6.AbstractC2235f
    public long d() {
        return this.f44416b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2235f)) {
            return false;
        }
        AbstractC2235f abstractC2235f = (AbstractC2235f) obj;
        String str = this.f44415a;
        if (str != null ? str.equals(abstractC2235f.c()) : abstractC2235f.c() == null) {
            if (this.f44416b == abstractC2235f.d()) {
                AbstractC2235f.b bVar = this.f44417c;
                AbstractC2235f.b bVarB = abstractC2235f.b();
                if (bVar == null) {
                    if (bVarB == null) {
                        return true;
                    }
                } else if (bVar.equals(bVarB)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f44415a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j9 = this.f44416b;
        int i9 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        AbstractC2235f.b bVar = this.f44417c;
        return i9 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f44415a + ", tokenExpirationTimestamp=" + this.f44416b + ", responseCode=" + this.f44417c + "}";
    }
}
