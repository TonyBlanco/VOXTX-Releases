package l6;

import l6.C2201c;
import l6.d;

/* JADX INFO: renamed from: l6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2199a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2201c.a f44204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f44205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f44206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f44207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f44208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f44209h;

    /* JADX INFO: renamed from: l6.a$b */
    public static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f44210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C2201c.a f44211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f44212c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f44213d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f44214e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f44215f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f44216g;

        public b() {
        }

        public b(d dVar) {
            this.f44210a = dVar.d();
            this.f44211b = dVar.g();
            this.f44212c = dVar.b();
            this.f44213d = dVar.f();
            this.f44214e = Long.valueOf(dVar.c());
            this.f44215f = Long.valueOf(dVar.h());
            this.f44216g = dVar.e();
        }

        @Override // l6.d.a
        public d a() {
            String str = "";
            if (this.f44211b == null) {
                str = " registrationStatus";
            }
            if (this.f44214e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f44215f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C2199a(this.f44210a, this.f44211b, this.f44212c, this.f44213d, this.f44214e.longValue(), this.f44215f.longValue(), this.f44216g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // l6.d.a
        public d.a b(String str) {
            this.f44212c = str;
            return this;
        }

        @Override // l6.d.a
        public d.a c(long j9) {
            this.f44214e = Long.valueOf(j9);
            return this;
        }

        @Override // l6.d.a
        public d.a d(String str) {
            this.f44210a = str;
            return this;
        }

        @Override // l6.d.a
        public d.a e(String str) {
            this.f44216g = str;
            return this;
        }

        @Override // l6.d.a
        public d.a f(String str) {
            this.f44213d = str;
            return this;
        }

        @Override // l6.d.a
        public d.a g(C2201c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f44211b = aVar;
            return this;
        }

        @Override // l6.d.a
        public d.a h(long j9) {
            this.f44215f = Long.valueOf(j9);
            return this;
        }
    }

    public C2199a(String str, C2201c.a aVar, String str2, String str3, long j9, long j10, String str4) {
        this.f44203b = str;
        this.f44204c = aVar;
        this.f44205d = str2;
        this.f44206e = str3;
        this.f44207f = j9;
        this.f44208g = j10;
        this.f44209h = str4;
    }

    @Override // l6.d
    public String b() {
        return this.f44205d;
    }

    @Override // l6.d
    public long c() {
        return this.f44207f;
    }

    @Override // l6.d
    public String d() {
        return this.f44203b;
    }

    @Override // l6.d
    public String e() {
        return this.f44209h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f44203b;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f44204c.equals(dVar.g()) && ((str = this.f44205d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f44206e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f44207f == dVar.c() && this.f44208g == dVar.h()) {
                String str4 = this.f44209h;
                String strE = dVar.e();
                if (str4 == null) {
                    if (strE == null) {
                        return true;
                    }
                } else if (str4.equals(strE)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l6.d
    public String f() {
        return this.f44206e;
    }

    @Override // l6.d
    public C2201c.a g() {
        return this.f44204c;
    }

    @Override // l6.d
    public long h() {
        return this.f44208g;
    }

    public int hashCode() {
        String str = this.f44203b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f44204c.hashCode()) * 1000003;
        String str2 = this.f44205d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f44206e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j9 = this.f44207f;
        int i9 = (iHashCode3 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f44208g;
        int i10 = (i9 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str4 = this.f44209h;
        return i10 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // l6.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f44203b + ", registrationStatus=" + this.f44204c + ", authToken=" + this.f44205d + ", refreshToken=" + this.f44206e + ", expiresInSecs=" + this.f44207f + ", tokenCreationEpochInSecs=" + this.f44208g + ", fisError=" + this.f44209h + "}";
    }
}
