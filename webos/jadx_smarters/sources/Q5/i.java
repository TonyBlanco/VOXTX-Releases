package Q5;

import Q5.B;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends B.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f8255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f8256f;

    public static final class b extends B.e.a.AbstractC0095a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f8257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f8258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f8259c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f8260d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f8261e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f8262f;

        @Override // Q5.B.e.a.AbstractC0095a
        public B.e.a a() {
            String str = "";
            if (this.f8257a == null) {
                str = " identifier";
            }
            if (this.f8258b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new i(this.f8257a, this.f8258b, this.f8259c, null, this.f8260d, this.f8261e, this.f8262f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Q5.B.e.a.AbstractC0095a
        public B.e.a.AbstractC0095a b(String str) {
            this.f8261e = str;
            return this;
        }

        @Override // Q5.B.e.a.AbstractC0095a
        public B.e.a.AbstractC0095a c(String str) {
            this.f8262f = str;
            return this;
        }

        @Override // Q5.B.e.a.AbstractC0095a
        public B.e.a.AbstractC0095a d(String str) {
            this.f8259c = str;
            return this;
        }

        @Override // Q5.B.e.a.AbstractC0095a
        public B.e.a.AbstractC0095a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f8257a = str;
            return this;
        }

        @Override // Q5.B.e.a.AbstractC0095a
        public B.e.a.AbstractC0095a f(String str) {
            this.f8260d = str;
            return this;
        }

        @Override // Q5.B.e.a.AbstractC0095a
        public B.e.a.AbstractC0095a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f8258b = str;
            return this;
        }
    }

    public i(String str, String str2, String str3, B.e.a.b bVar, String str4, String str5, String str6) {
        this.f8251a = str;
        this.f8252b = str2;
        this.f8253c = str3;
        this.f8254d = str4;
        this.f8255e = str5;
        this.f8256f = str6;
    }

    @Override // Q5.B.e.a
    public String b() {
        return this.f8255e;
    }

    @Override // Q5.B.e.a
    public String c() {
        return this.f8256f;
    }

    @Override // Q5.B.e.a
    public String d() {
        return this.f8253c;
    }

    @Override // Q5.B.e.a
    public String e() {
        return this.f8251a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.a)) {
            return false;
        }
        B.e.a aVar = (B.e.a) obj;
        if (this.f8251a.equals(aVar.e()) && this.f8252b.equals(aVar.h()) && ((str = this.f8253c) != null ? str.equals(aVar.d()) : aVar.d() == null)) {
            aVar.g();
            String str2 = this.f8254d;
            if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                String str3 = this.f8255e;
                if (str3 != null ? str3.equals(aVar.b()) : aVar.b() == null) {
                    String str4 = this.f8256f;
                    String strC = aVar.c();
                    if (str4 == null) {
                        if (strC == null) {
                            return true;
                        }
                    } else if (str4.equals(strC)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // Q5.B.e.a
    public String f() {
        return this.f8254d;
    }

    @Override // Q5.B.e.a
    public B.e.a.b g() {
        return null;
    }

    @Override // Q5.B.e.a
    public String h() {
        return this.f8252b;
    }

    public int hashCode() {
        int iHashCode = (((this.f8251a.hashCode() ^ 1000003) * 1000003) ^ this.f8252b.hashCode()) * 1000003;
        String str = this.f8253c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f8254d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f8255e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f8256f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f8251a + ", version=" + this.f8252b + ", displayVersion=" + this.f8253c + ", organization=" + ((Object) null) + ", installationUuid=" + this.f8254d + ", developmentPlatform=" + this.f8255e + ", developmentPlatformVersion=" + this.f8256f + "}";
    }
}
