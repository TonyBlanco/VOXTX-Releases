package B2;

import B2.a;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends B2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f217i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f218j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f219k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f220l;

    public static final class b extends a.AbstractC0004a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f223c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f224d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f225e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f226f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f227g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f228h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f229i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f230j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f231k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f232l;

        @Override // B2.a.AbstractC0004a
        public B2.a a() {
            return new c(this.f221a, this.f222b, this.f223c, this.f224d, this.f225e, this.f226f, this.f227g, this.f228h, this.f229i, this.f230j, this.f231k, this.f232l);
        }

        @Override // B2.a.AbstractC0004a
        public a.AbstractC0004a b(String str) {
            this.f232l = str;
            return this;
        }

        @Override // B2.a.AbstractC0004a
        public a.AbstractC0004a c(String str) {
            this.f230j = str;
            return this;
        }

        @Override // B2.a.AbstractC0004a
        public a.AbstractC0004a d(String str) {
            this.f224d = str;
            return this;
        }

        @Override // B2.a.AbstractC0004a
        public a.AbstractC0004a e(String str) {
            this.f228h = str;
            return this;
        }

        @Override // B2.a.AbstractC0004a
        public a.AbstractC0004a f(String str) {
            this.f223c = str;
            return this;
        }

        @Override // B2.a.AbstractC0004a
        public a.AbstractC0004a g(String str) {
            this.f229i = str;
            return this;
        }

        @Override // B2.a.AbstractC0004a
        public a.AbstractC0004a h(String str) {
            this.f227g = str;
            return this;
        }

        @Override // B2.a.AbstractC0004a
        public a.AbstractC0004a i(String str) {
            this.f231k = str;
            return this;
        }

        @Override // B2.a.AbstractC0004a
        public a.AbstractC0004a j(String str) {
            this.f222b = str;
            return this;
        }

        @Override // B2.a.AbstractC0004a
        public a.AbstractC0004a k(String str) {
            this.f226f = str;
            return this;
        }

        @Override // B2.a.AbstractC0004a
        public a.AbstractC0004a l(String str) {
            this.f225e = str;
            return this;
        }

        @Override // B2.a.AbstractC0004a
        public a.AbstractC0004a m(Integer num) {
            this.f221a = num;
            return this;
        }
    }

    public c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f209a = num;
        this.f210b = str;
        this.f211c = str2;
        this.f212d = str3;
        this.f213e = str4;
        this.f214f = str5;
        this.f215g = str6;
        this.f216h = str7;
        this.f217i = str8;
        this.f218j = str9;
        this.f219k = str10;
        this.f220l = str11;
    }

    @Override // B2.a
    public String b() {
        return this.f220l;
    }

    @Override // B2.a
    public String c() {
        return this.f218j;
    }

    @Override // B2.a
    public String d() {
        return this.f212d;
    }

    @Override // B2.a
    public String e() {
        return this.f216h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B2.a)) {
            return false;
        }
        B2.a aVar = (B2.a) obj;
        Integer num = this.f209a;
        if (num != null ? num.equals(aVar.m()) : aVar.m() == null) {
            String str = this.f210b;
            if (str != null ? str.equals(aVar.j()) : aVar.j() == null) {
                String str2 = this.f211c;
                if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                    String str3 = this.f212d;
                    if (str3 != null ? str3.equals(aVar.d()) : aVar.d() == null) {
                        String str4 = this.f213e;
                        if (str4 != null ? str4.equals(aVar.l()) : aVar.l() == null) {
                            String str5 = this.f214f;
                            if (str5 != null ? str5.equals(aVar.k()) : aVar.k() == null) {
                                String str6 = this.f215g;
                                if (str6 != null ? str6.equals(aVar.h()) : aVar.h() == null) {
                                    String str7 = this.f216h;
                                    if (str7 != null ? str7.equals(aVar.e()) : aVar.e() == null) {
                                        String str8 = this.f217i;
                                        if (str8 != null ? str8.equals(aVar.g()) : aVar.g() == null) {
                                            String str9 = this.f218j;
                                            if (str9 != null ? str9.equals(aVar.c()) : aVar.c() == null) {
                                                String str10 = this.f219k;
                                                if (str10 != null ? str10.equals(aVar.i()) : aVar.i() == null) {
                                                    String str11 = this.f220l;
                                                    String strB = aVar.b();
                                                    if (str11 == null) {
                                                        if (strB == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(strB)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // B2.a
    public String f() {
        return this.f211c;
    }

    @Override // B2.a
    public String g() {
        return this.f217i;
    }

    @Override // B2.a
    public String h() {
        return this.f215g;
    }

    public int hashCode() {
        Integer num = this.f209a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f210b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f211c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f212d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f213e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f214f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f215g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f216h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f217i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f218j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f219k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f220l;
        return iHashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    @Override // B2.a
    public String i() {
        return this.f219k;
    }

    @Override // B2.a
    public String j() {
        return this.f210b;
    }

    @Override // B2.a
    public String k() {
        return this.f214f;
    }

    @Override // B2.a
    public String l() {
        return this.f213e;
    }

    @Override // B2.a
    public Integer m() {
        return this.f209a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f209a + ", model=" + this.f210b + ", hardware=" + this.f211c + ", device=" + this.f212d + ", product=" + this.f213e + ", osBuild=" + this.f214f + ", manufacturer=" + this.f215g + ", fingerprint=" + this.f216h + ", locale=" + this.f217i + ", country=" + this.f218j + ", mccMnc=" + this.f219k + ", applicationBuild=" + this.f220l + "}";
    }
}
