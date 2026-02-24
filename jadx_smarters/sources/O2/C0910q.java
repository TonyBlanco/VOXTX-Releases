package O2;

import b4.C1228t;
import b4.InterfaceC1211b;
import d4.AbstractC1681B;
import d4.AbstractC1684a;

/* JADX INFO: renamed from: O2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0910q implements F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1228t f6179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f6186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f6187i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6188j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6189k;

    public C0910q() {
        this(new C1228t(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    public C0910q(C1228t c1228t, int i9, int i10, int i11, int i12, int i13, boolean z9, int i14, boolean z10) {
        i(i11, 0, "bufferForPlaybackMs", "0");
        i(i12, 0, "bufferForPlaybackAfterRebufferMs", "0");
        i(i9, i11, "minBufferMs", "bufferForPlaybackMs");
        i(i9, i12, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        i(i10, i9, "maxBufferMs", "minBufferMs");
        i(i14, 0, "backBufferDurationMs", "0");
        this.f6179a = c1228t;
        this.f6180b = d4.k0.P0(i9);
        this.f6181c = d4.k0.P0(i10);
        this.f6182d = d4.k0.P0(i11);
        this.f6183e = d4.k0.P0(i12);
        this.f6184f = i13;
        this.f6188j = i13 == -1 ? 13107200 : i13;
        this.f6185g = z9;
        this.f6186h = d4.k0.P0(i14);
        this.f6187i = z10;
    }

    public static void i(int i9, int i10, String str, String str2) {
        AbstractC1684a.b(i9 >= i10, str + " cannot be less than " + str2);
    }

    public static int k(int i9) {
        switch (i9) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    @Override // O2.F0
    public boolean a() {
        return this.f6187i;
    }

    @Override // O2.F0
    public long b() {
        return this.f6186h;
    }

    @Override // O2.F0
    public void c(Q1 q12, B3.A a9, C1[] c1Arr, B3.i0 i0Var, Z3.s[] sVarArr) {
        int iJ = this.f6184f;
        if (iJ == -1) {
            iJ = j(c1Arr, sVarArr);
        }
        this.f6188j = iJ;
        this.f6179a.h(iJ);
    }

    @Override // O2.F0
    public InterfaceC1211b d() {
        return this.f6179a;
    }

    @Override // O2.F0
    public void e() {
        l(true);
    }

    @Override // O2.F0
    public void f() {
        l(true);
    }

    @Override // O2.F0
    public boolean g(Q1 q12, B3.A a9, long j9, float f9, boolean z9, long j10) {
        long jK0 = d4.k0.k0(j9, f9);
        long jMin = z9 ? this.f6183e : this.f6182d;
        if (j10 != -9223372036854775807L) {
            jMin = Math.min(j10 / 2, jMin);
        }
        return jMin <= 0 || jK0 >= jMin || (!this.f6185g && this.f6179a.f() >= this.f6188j);
    }

    @Override // O2.F0
    public boolean h(long j9, long j10, float f9) {
        boolean z9 = true;
        boolean z10 = this.f6179a.f() >= this.f6188j;
        long jMin = this.f6180b;
        if (f9 > 1.0f) {
            jMin = Math.min(d4.k0.f0(jMin, f9), this.f6181c);
        }
        if (j10 < Math.max(jMin, 500000L)) {
            if (!this.f6185g && z10) {
                z9 = false;
            }
            this.f6189k = z9;
            if (!z9 && j10 < 500000) {
                AbstractC1681B.j("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= this.f6181c || z10) {
            this.f6189k = false;
        }
        return this.f6189k;
    }

    public int j(C1[] c1Arr, Z3.s[] sVarArr) {
        int iK = 0;
        for (int i9 = 0; i9 < c1Arr.length; i9++) {
            if (sVarArr[i9] != null) {
                iK += k(c1Arr[i9].getTrackType());
            }
        }
        return Math.max(13107200, iK);
    }

    public final void l(boolean z9) {
        int i9 = this.f6184f;
        if (i9 == -1) {
            i9 = 13107200;
        }
        this.f6188j = i9;
        this.f6189k = false;
        if (z9) {
            this.f6179a.g();
        }
    }

    @Override // O2.F0
    public void onPrepared() {
        l(false);
    }
}
