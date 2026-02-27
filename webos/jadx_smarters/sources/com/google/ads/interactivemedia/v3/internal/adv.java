package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class adv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final aae f19196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f19202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f19203h;

    public adv(aae aaeVar) {
        this.f19196a = aaeVar;
    }

    public final void a(byte[] bArr, int i9, int i10) {
        if (this.f19198c) {
            int i11 = this.f19201f;
            int i12 = (i9 + 1) - i11;
            if (i12 >= i10) {
                this.f19201f = i11 + (i10 - i9);
            } else {
                this.f19199d = ((bArr[i12] & 192) >> 6) == 0;
                this.f19198c = false;
            }
        }
    }

    public final void b(long j9, int i9, boolean z9) {
        if (this.f19200e == 182 && z9 && this.f19197b) {
            long j10 = this.f19203h;
            if (j10 != -9223372036854775807L) {
                long j11 = this.f19202g;
                this.f19196a.f(j10, this.f19199d ? 1 : 0, (int) (j9 - j11), i9, null);
            }
        }
        if (this.f19200e != 179) {
            this.f19202g = j9;
        }
    }

    public final void c(int i9, long j9) {
        boolean z9;
        this.f19200e = i9;
        this.f19199d = false;
        if (i9 == 182) {
            z9 = true;
        } else if (i9 == 179) {
            i9 = 179;
            z9 = true;
        } else {
            z9 = false;
        }
        this.f19197b = z9;
        this.f19198c = i9 == 182;
        this.f19201f = 0;
        this.f19203h = j9;
    }

    public final void d() {
        this.f19197b = false;
        this.f19198c = false;
        this.f19199d = false;
        this.f19200e = -1;
    }
}
