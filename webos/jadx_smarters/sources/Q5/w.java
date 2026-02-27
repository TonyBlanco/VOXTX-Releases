package Q5;

import Q5.B;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends B.e.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8373a;

    public static final class b extends B.e.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f8374a;

        @Override // Q5.B.e.f.a
        public B.e.f a() {
            String str = "";
            if (this.f8374a == null) {
                str = " identifier";
            }
            if (str.isEmpty()) {
                return new w(this.f8374a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Q5.B.e.f.a
        public B.e.f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f8374a = str;
            return this;
        }
    }

    public w(String str) {
        this.f8373a = str;
    }

    @Override // Q5.B.e.f
    public String b() {
        return this.f8373a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof B.e.f) {
            return this.f8373a.equals(((B.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f8373a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f8373a + "}";
    }
}
