package r6;

import com.google.android.gms.internal.firebase_messaging.zzq;

/* JADX INFO: renamed from: r6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2680a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C2680a f49748p = new C0435a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f49749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f49752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f49753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f49754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f49755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f49756h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f49757i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f49758j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f49759k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f49760l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f49761m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f49762n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f49763o;

    /* JADX INFO: renamed from: r6.a$a, reason: collision with other inner class name */
    public static final class C0435a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f49764a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f49765b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f49766c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f49767d = c.UNKNOWN;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d f49768e = d.UNKNOWN_OS;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f49769f = "";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f49770g = "";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f49771h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f49772i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f49773j = "";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f49774k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public b f49775l = b.UNKNOWN_EVENT;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f49776m = "";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f49777n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f49778o = "";

        public C2680a a() {
            return new C2680a(this.f49764a, this.f49765b, this.f49766c, this.f49767d, this.f49768e, this.f49769f, this.f49770g, this.f49771h, this.f49772i, this.f49773j, this.f49774k, this.f49775l, this.f49776m, this.f49777n, this.f49778o);
        }

        public C0435a b(String str) {
            this.f49776m = str;
            return this;
        }

        public C0435a c(String str) {
            this.f49770g = str;
            return this;
        }

        public C0435a d(String str) {
            this.f49778o = str;
            return this;
        }

        public C0435a e(b bVar) {
            this.f49775l = bVar;
            return this;
        }

        public C0435a f(String str) {
            this.f49766c = str;
            return this;
        }

        public C0435a g(String str) {
            this.f49765b = str;
            return this;
        }

        public C0435a h(c cVar) {
            this.f49767d = cVar;
            return this;
        }

        public C0435a i(String str) {
            this.f49769f = str;
            return this;
        }

        public C0435a j(long j9) {
            this.f49764a = j9;
            return this;
        }

        public C0435a k(d dVar) {
            this.f49768e = dVar;
            return this;
        }

        public C0435a l(String str) {
            this.f49773j = str;
            return this;
        }

        public C0435a m(int i9) {
            this.f49772i = i9;
            return this;
        }
    }

    /* JADX INFO: renamed from: r6.a$b */
    public enum b implements zzq {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);

        private final int number_;

        b(int i9) {
            this.number_ = i9;
        }

        @Override // com.google.android.gms.internal.firebase_messaging.zzq
        public int getNumber() {
            return this.number_;
        }
    }

    /* JADX INFO: renamed from: r6.a$c */
    public enum c implements zzq {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int number_;

        c(int i9) {
            this.number_ = i9;
        }

        @Override // com.google.android.gms.internal.firebase_messaging.zzq
        public int getNumber() {
            return this.number_;
        }
    }

    /* JADX INFO: renamed from: r6.a$d */
    public enum d implements zzq {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);

        private final int number_;

        d(int i9) {
            this.number_ = i9;
        }

        @Override // com.google.android.gms.internal.firebase_messaging.zzq
        public int getNumber() {
            return this.number_;
        }
    }

    public C2680a(long j9, String str, String str2, c cVar, d dVar, String str3, String str4, int i9, int i10, String str5, long j10, b bVar, String str6, long j11, String str7) {
        this.f49749a = j9;
        this.f49750b = str;
        this.f49751c = str2;
        this.f49752d = cVar;
        this.f49753e = dVar;
        this.f49754f = str3;
        this.f49755g = str4;
        this.f49756h = i9;
        this.f49757i = i10;
        this.f49758j = str5;
        this.f49759k = j10;
        this.f49760l = bVar;
        this.f49761m = str6;
        this.f49762n = j11;
        this.f49763o = str7;
    }

    public static C0435a p() {
        return new C0435a();
    }

    public String a() {
        return this.f49761m;
    }

    public long b() {
        return this.f49759k;
    }

    public long c() {
        return this.f49762n;
    }

    public String d() {
        return this.f49755g;
    }

    public String e() {
        return this.f49763o;
    }

    public b f() {
        return this.f49760l;
    }

    public String g() {
        return this.f49751c;
    }

    public String h() {
        return this.f49750b;
    }

    public c i() {
        return this.f49752d;
    }

    public String j() {
        return this.f49754f;
    }

    public int k() {
        return this.f49756h;
    }

    public long l() {
        return this.f49749a;
    }

    public d m() {
        return this.f49753e;
    }

    public String n() {
        return this.f49758j;
    }

    public int o() {
        return this.f49757i;
    }
}
