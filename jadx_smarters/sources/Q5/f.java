package Q5;

import Q5.B;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends B.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f8219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8220b;

    public static final class b extends B.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C f8221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f8222b;

        @Override // Q5.B.d.a
        public B.d a() {
            String str = "";
            if (this.f8221a == null) {
                str = " files";
            }
            if (str.isEmpty()) {
                return new f(this.f8221a, this.f8222b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Q5.B.d.a
        public B.d.a b(C c9) {
            if (c9 == null) {
                throw new NullPointerException("Null files");
            }
            this.f8221a = c9;
            return this;
        }

        @Override // Q5.B.d.a
        public B.d.a c(String str) {
            this.f8222b = str;
            return this;
        }
    }

    public f(C c9, String str) {
        this.f8219a = c9;
        this.f8220b = str;
    }

    @Override // Q5.B.d
    public C b() {
        return this.f8219a;
    }

    @Override // Q5.B.d
    public String c() {
        return this.f8220b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.d)) {
            return false;
        }
        B.d dVar = (B.d) obj;
        if (this.f8219a.equals(dVar.b())) {
            String str = this.f8220b;
            String strC = dVar.c();
            if (str == null) {
                if (strC == null) {
                    return true;
                }
            } else if (str.equals(strC)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f8219a.hashCode() ^ 1000003) * 1000003;
        String str = this.f8220b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f8219a + ", orgId=" + this.f8220b + "}";
    }
}
