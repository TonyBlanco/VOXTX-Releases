package Q5;

import Q5.B;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends B.e.d.AbstractC0107d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8363a;

    public static final class b extends B.e.d.AbstractC0107d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f8364a;

        @Override // Q5.B.e.d.AbstractC0107d.a
        public B.e.d.AbstractC0107d a() {
            String str = "";
            if (this.f8364a == null) {
                str = " content";
            }
            if (str.isEmpty()) {
                return new u(this.f8364a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Q5.B.e.d.AbstractC0107d.a
        public B.e.d.AbstractC0107d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f8364a = str;
            return this;
        }
    }

    public u(String str) {
        this.f8363a = str;
    }

    @Override // Q5.B.e.d.AbstractC0107d
    public String b() {
        return this.f8363a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof B.e.d.AbstractC0107d) {
            return this.f8363a.equals(((B.e.d.AbstractC0107d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f8363a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f8363a + "}";
    }
}
