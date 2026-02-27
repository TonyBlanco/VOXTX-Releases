package D7;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f1509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f1511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f1512h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1513i;

    public b(a aVar, long j9, long j10, String str, String str2, String str3) {
        this.f1509e = aVar;
        this.f1505a = j9;
        this.f1506b = j10;
        this.f1507c = str;
        this.f1510f = str2;
        this.f1508d = str3;
    }

    public a a() {
        return this.f1509e;
    }

    public String b() {
        return this.f1508d;
    }

    public long c() {
        return this.f1506b;
    }

    public b d() {
        return this.f1512h;
    }

    public b e() {
        return this.f1511g;
    }

    public long f() {
        return this.f1505a;
    }

    public String g() {
        return this.f1507c;
    }

    public boolean h(int i9) {
        long jCurrentTimeMillis = System.currentTimeMillis() + ((long) i9);
        return jCurrentTimeMillis >= this.f1505a && jCurrentTimeMillis <= this.f1506b;
    }

    public boolean i() {
        return this.f1513i;
    }

    public void j(b bVar) {
        this.f1512h = bVar;
    }

    public void k(b bVar) {
        this.f1511g = bVar;
    }
}
