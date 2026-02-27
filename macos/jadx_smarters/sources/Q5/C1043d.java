package Q5;

import Q5.B;

/* JADX INFO: renamed from: Q5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1043d extends B.a.AbstractC0093a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8211c;

    /* JADX INFO: renamed from: Q5.d$b */
    public static final class b extends B.a.AbstractC0093a.AbstractC0094a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f8212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f8213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f8214c;

        @Override // Q5.B.a.AbstractC0093a.AbstractC0094a
        public B.a.AbstractC0093a a() {
            String str = "";
            if (this.f8212a == null) {
                str = " arch";
            }
            if (this.f8213b == null) {
                str = str + " libraryName";
            }
            if (this.f8214c == null) {
                str = str + " buildId";
            }
            if (str.isEmpty()) {
                return new C1043d(this.f8212a, this.f8213b, this.f8214c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Q5.B.a.AbstractC0093a.AbstractC0094a
        public B.a.AbstractC0093a.AbstractC0094a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f8212a = str;
            return this;
        }

        @Override // Q5.B.a.AbstractC0093a.AbstractC0094a
        public B.a.AbstractC0093a.AbstractC0094a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f8214c = str;
            return this;
        }

        @Override // Q5.B.a.AbstractC0093a.AbstractC0094a
        public B.a.AbstractC0093a.AbstractC0094a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f8213b = str;
            return this;
        }
    }

    public C1043d(String str, String str2, String str3) {
        this.f8209a = str;
        this.f8210b = str2;
        this.f8211c = str3;
    }

    @Override // Q5.B.a.AbstractC0093a
    public String b() {
        return this.f8209a;
    }

    @Override // Q5.B.a.AbstractC0093a
    public String c() {
        return this.f8211c;
    }

    @Override // Q5.B.a.AbstractC0093a
    public String d() {
        return this.f8210b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.a.AbstractC0093a)) {
            return false;
        }
        B.a.AbstractC0093a abstractC0093a = (B.a.AbstractC0093a) obj;
        return this.f8209a.equals(abstractC0093a.b()) && this.f8210b.equals(abstractC0093a.d()) && this.f8211c.equals(abstractC0093a.c());
    }

    public int hashCode() {
        return ((((this.f8209a.hashCode() ^ 1000003) * 1000003) ^ this.f8210b.hashCode()) * 1000003) ^ this.f8211c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f8209a + ", libraryName=" + this.f8210b + ", buildId=" + this.f8211c + "}";
    }
}
