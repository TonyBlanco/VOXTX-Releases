package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class aea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final aae f19265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f19266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f19269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f19271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f19274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f19275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f19276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f19277m;

    public aea(aae aaeVar) {
        this.f19265a = aaeVar;
    }

    private final void e(int i9) {
        long j9 = this.f19276l;
        if (j9 == -9223372036854775807L) {
            return;
        }
        boolean z9 = this.f19277m;
        long j10 = this.f19266b;
        long j11 = this.f19275k;
        this.f19265a.f(j9, z9 ? 1 : 0, (int) (j10 - j11), i9, null);
    }

    public final void a(long j9, int i9, boolean z9) {
        if (this.f19274j && this.f19271g) {
            this.f19277m = this.f19267c;
            this.f19274j = false;
        } else if (this.f19272h || this.f19271g) {
            if (z9 && this.f19273i) {
                e(i9 + ((int) (j9 - this.f19266b)));
            }
            this.f19275k = this.f19266b;
            this.f19276l = this.f19269e;
            this.f19277m = this.f19267c;
            this.f19273i = true;
        }
    }

    public final void b(byte[] bArr, int i9, int i10) {
        if (this.f19270f) {
            int i11 = this.f19268d;
            int i12 = (i9 + 2) - i11;
            if (i12 >= i10) {
                this.f19268d = i11 + (i10 - i9);
            } else {
                this.f19271g = (bArr[i12] & 128) != 0;
                this.f19270f = false;
            }
        }
    }

    public final void c() {
        this.f19270f = false;
        this.f19271g = false;
        this.f19272h = false;
        this.f19273i = false;
        this.f19274j = false;
    }

    public final void d(long j9, int i9, int i10, long j10, boolean z9) {
        this.f19271g = false;
        this.f19272h = false;
        this.f19269e = j10;
        this.f19268d = 0;
        this.f19266b = j9;
        if (i10 >= 32 && i10 != 40) {
            if (this.f19273i && !this.f19274j) {
                if (z9) {
                    e(i9);
                }
                this.f19273i = false;
            }
            if (i10 <= 35 || i10 == 39) {
                this.f19272h = !this.f19274j;
                this.f19274j = true;
            }
        }
        boolean z10 = i10 >= 16 && i10 <= 21;
        this.f19267c = z10;
        this.f19270f = z10 || i10 <= 9;
    }
}
