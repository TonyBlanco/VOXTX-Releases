package Q5;

import Q5.B;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends B.e.AbstractC0108e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8368d;

    public static final class b extends B.e.AbstractC0108e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f8369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f8370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f8371c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f8372d;

        @Override // Q5.B.e.AbstractC0108e.a
        public B.e.AbstractC0108e a() {
            String str = "";
            if (this.f8369a == null) {
                str = " platform";
            }
            if (this.f8370b == null) {
                str = str + " version";
            }
            if (this.f8371c == null) {
                str = str + " buildVersion";
            }
            if (this.f8372d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new v(this.f8369a.intValue(), this.f8370b, this.f8371c, this.f8372d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Q5.B.e.AbstractC0108e.a
        public B.e.AbstractC0108e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f8371c = str;
            return this;
        }

        @Override // Q5.B.e.AbstractC0108e.a
        public B.e.AbstractC0108e.a c(boolean z9) {
            this.f8372d = Boolean.valueOf(z9);
            return this;
        }

        @Override // Q5.B.e.AbstractC0108e.a
        public B.e.AbstractC0108e.a d(int i9) {
            this.f8369a = Integer.valueOf(i9);
            return this;
        }

        @Override // Q5.B.e.AbstractC0108e.a
        public B.e.AbstractC0108e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f8370b = str;
            return this;
        }
    }

    public v(int i9, String str, String str2, boolean z9) {
        this.f8365a = i9;
        this.f8366b = str;
        this.f8367c = str2;
        this.f8368d = z9;
    }

    @Override // Q5.B.e.AbstractC0108e
    public String b() {
        return this.f8367c;
    }

    @Override // Q5.B.e.AbstractC0108e
    public int c() {
        return this.f8365a;
    }

    @Override // Q5.B.e.AbstractC0108e
    public String d() {
        return this.f8366b;
    }

    @Override // Q5.B.e.AbstractC0108e
    public boolean e() {
        return this.f8368d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.AbstractC0108e)) {
            return false;
        }
        B.e.AbstractC0108e abstractC0108e = (B.e.AbstractC0108e) obj;
        return this.f8365a == abstractC0108e.c() && this.f8366b.equals(abstractC0108e.d()) && this.f8367c.equals(abstractC0108e.b()) && this.f8368d == abstractC0108e.e();
    }

    public int hashCode() {
        return ((((((this.f8365a ^ 1000003) * 1000003) ^ this.f8366b.hashCode()) * 1000003) ^ this.f8367c.hashCode()) * 1000003) ^ (this.f8368d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f8365a + ", version=" + this.f8366b + ", buildVersion=" + this.f8367c + ", jailbroken=" + this.f8368d + "}";
    }
}
