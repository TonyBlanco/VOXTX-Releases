package M4;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f5031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f5032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f5033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f5034j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f5035k;

    public r(String str, String str2, long j9, long j10, long j11, long j12, long j13, Long l9, Long l10, Long l11, Boolean bool) {
        com.google.android.gms.common.internal.r.g(str);
        com.google.android.gms.common.internal.r.g(str2);
        com.google.android.gms.common.internal.r.a(j9 >= 0);
        com.google.android.gms.common.internal.r.a(j10 >= 0);
        com.google.android.gms.common.internal.r.a(j11 >= 0);
        com.google.android.gms.common.internal.r.a(j13 >= 0);
        this.f5025a = str;
        this.f5026b = str2;
        this.f5027c = j9;
        this.f5028d = j10;
        this.f5029e = j11;
        this.f5030f = j12;
        this.f5031g = j13;
        this.f5032h = l9;
        this.f5033i = l10;
        this.f5034j = l11;
        this.f5035k = bool;
    }

    public final r a(Long l9, Long l10, Boolean bool) {
        return new r(this.f5025a, this.f5026b, this.f5027c, this.f5028d, this.f5029e, this.f5030f, this.f5031g, this.f5032h, l9, l10, bool);
    }

    public final r b(long j9, long j10) {
        return new r(this.f5025a, this.f5026b, this.f5027c, this.f5028d, this.f5029e, this.f5030f, j9, Long.valueOf(j10), this.f5033i, this.f5034j, this.f5035k);
    }

    public final r c(long j9) {
        return new r(this.f5025a, this.f5026b, this.f5027c, this.f5028d, this.f5029e, j9, this.f5031g, this.f5032h, this.f5033i, this.f5034j, this.f5035k);
    }
}
