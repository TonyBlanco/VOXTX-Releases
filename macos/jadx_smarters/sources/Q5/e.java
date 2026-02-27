package Q5;

import Q5.B;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends B.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8216b;

    public static final class b extends B.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f8217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f8218b;

        @Override // Q5.B.c.a
        public B.c a() {
            String str = "";
            if (this.f8217a == null) {
                str = " key";
            }
            if (this.f8218b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new e(this.f8217a, this.f8218b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Q5.B.c.a
        public B.c.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f8217a = str;
            return this;
        }

        @Override // Q5.B.c.a
        public B.c.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f8218b = str;
            return this;
        }
    }

    public e(String str, String str2) {
        this.f8215a = str;
        this.f8216b = str2;
    }

    @Override // Q5.B.c
    public String b() {
        return this.f8215a;
    }

    @Override // Q5.B.c
    public String c() {
        return this.f8216b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.c)) {
            return false;
        }
        B.c cVar = (B.c) obj;
        return this.f8215a.equals(cVar.b()) && this.f8216b.equals(cVar.c());
    }

    public int hashCode() {
        return ((this.f8215a.hashCode() ^ 1000003) * 1000003) ^ this.f8216b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f8215a + ", value=" + this.f8216b + "}";
    }
}
