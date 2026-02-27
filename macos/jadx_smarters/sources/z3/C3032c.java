package z3;

import d4.AbstractC1684a;

/* JADX INFO: renamed from: z3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3032c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3052w f52714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f52716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f52717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f52718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f52719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f52720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3051v f52721h;

    public C3032c(C3052w c3052w, int i9, long j9, long j10, long j11, int i10, int i11) {
        this(c3052w, i9, j9, j10, j11, i10, i11, new C3051v());
    }

    public C3032c(C3052w c3052w, int i9, long j9, long j10, long j11, int i10, int i11, C3051v c3051v) {
        AbstractC1684a.e(c3051v);
        boolean z9 = false;
        AbstractC1684a.a((i11 == 0) == (i9 != 4));
        if (i10 != 0) {
            if (i9 != 2 && i9 != 0) {
                z9 = true;
            }
            AbstractC1684a.a(z9);
        }
        this.f52714a = c3052w;
        this.f52715b = i9;
        this.f52716c = j9;
        this.f52717d = j10;
        this.f52718e = j11;
        this.f52719f = i10;
        this.f52720g = i11;
        this.f52721h = c3051v;
    }

    public long a() {
        return this.f52721h.f52799a;
    }

    public float b() {
        return this.f52721h.f52800b;
    }

    public boolean c() {
        int i9 = this.f52715b;
        return i9 == 3 || i9 == 4;
    }
}
