package L3;

import d3.InterfaceC1674k;
import d3.w;
import d4.AbstractC1684a;
import d4.M;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K3.h f3995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f3996b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3998d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4003i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f4004j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f4005k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4006l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3997c = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3999e = -1;

    public e(K3.h hVar) {
        this.f3995a = hVar;
    }

    private void e() {
        w wVar = (w) AbstractC1684a.e(this.f3996b);
        long j9 = this.f4005k;
        boolean z9 = this.f4002h;
        wVar.f(j9, z9 ? 1 : 0, this.f3998d, 0, null);
        this.f3998d = 0;
        this.f4005k = -9223372036854775807L;
        this.f4002h = false;
        this.f4006l = false;
    }

    @Override // L3.k
    public void a(long j9, long j10) {
        this.f3997c = j9;
        this.f3998d = 0;
        this.f4004j = j10;
    }

    @Override // L3.k
    public void b(long j9, int i9) {
        AbstractC1684a.g(this.f3997c == -9223372036854775807L);
        this.f3997c = j9;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3  */
    @Override // L3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(d4.M r8, long r9, int r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.e.c(d4.M, long, int, boolean):void");
    }

    @Override // L3.k
    public void d(InterfaceC1674k interfaceC1674k, int i9) {
        w wVarE = interfaceC1674k.e(i9, 2);
        this.f3996b = wVarE;
        wVarE.d(this.f3995a.f3742c);
    }

    public final void f(M m9, boolean z9) {
        int i9;
        int iF = m9.f();
        if (((m9.J() >> 10) & 63) != 32) {
            m9.U(iF);
            this.f4002h = false;
            return;
        }
        int iJ = m9.j();
        int i10 = (iJ >> 1) & 1;
        if (!z9 && i10 == 0) {
            int i11 = (iJ >> 2) & 7;
            if (i11 == 1) {
                this.f4000f = 128;
                i9 = 96;
            } else {
                int i12 = i11 - 2;
                this.f4000f = 176 << i12;
                i9 = IjkMediaMeta.FF_PROFILE_H264_HIGH_444 << i12;
            }
            this.f4001g = i9;
        }
        m9.U(iF);
        this.f4002h = i10 == 0;
    }
}
