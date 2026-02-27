package L3;

import android.util.Log;
import d3.InterfaceC1674k;
import d3.w;
import d4.AbstractC1684a;
import d4.M;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K3.h f4047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f4048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4049c = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4050d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4051e = -1;

    public l(K3.h hVar) {
        this.f4047a = hVar;
    }

    @Override // L3.k
    public void a(long j9, long j10) {
        this.f4049c = j9;
        this.f4050d = j10;
    }

    @Override // L3.k
    public void b(long j9, int i9) {
        this.f4049c = j9;
    }

    @Override // L3.k
    public void c(M m9, long j9, int i9, boolean z9) {
        int iB;
        AbstractC1684a.e(this.f4048b);
        int i10 = this.f4051e;
        if (i10 != -1 && i9 != (iB = K3.e.b(i10))) {
            Log.w("RtpPcmReader", k0.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(iB), Integer.valueOf(i9)));
        }
        long jA = m.a(this.f4050d, j9, this.f4049c, this.f4047a.f3741b);
        int iA = m9.a();
        this.f4048b.b(m9, iA);
        this.f4048b.f(jA, 1, iA, 0, null);
        this.f4051e = i9;
    }

    @Override // L3.k
    public void d(InterfaceC1674k interfaceC1674k, int i9) {
        w wVarE = interfaceC1674k.e(i9, 1);
        this.f4048b = wVarE;
        wVarE.d(this.f4047a.f3742c);
    }
}
