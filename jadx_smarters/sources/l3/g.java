package L3;

import O2.C0897l1;
import d3.InterfaceC1674k;
import d3.w;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.G;
import d4.M;
import d4.k0;
import okhttp3.internal.http2.Settings;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K3.h f4018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f4019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4020e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4023h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f4024i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f4016a = new M();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f4017b = new M(G.f39651a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4021f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4022g = -1;

    public g(K3.h hVar) {
        this.f4018c = hVar;
    }

    private static int e(int i9) {
        return (i9 == 19 || i9 == 20) ? 1 : 0;
    }

    private void f(M m9, int i9) throws C0897l1 {
        if (m9.e().length < 3) {
            throw C0897l1.c("Malformed FU header.", null);
        }
        int i10 = m9.e()[1] & 7;
        byte b9 = m9.e()[2];
        int i11 = b9 & Utf8.REPLACEMENT_BYTE;
        boolean z9 = (b9 & 128) > 0;
        boolean z10 = (b9 & 64) > 0;
        if (z9) {
            this.f4023h += h();
            m9.e()[1] = (byte) ((i11 << 1) & 127);
            m9.e()[2] = (byte) i10;
            this.f4016a.R(m9.e());
            this.f4016a.U(1);
        } else {
            int i12 = (this.f4022g + 1) % Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            if (i9 != i12) {
                AbstractC1681B.j("RtpH265Reader", k0.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(i12), Integer.valueOf(i9)));
                return;
            } else {
                this.f4016a.R(m9.e());
                this.f4016a.U(3);
            }
        }
        int iA = this.f4016a.a();
        this.f4019d.b(this.f4016a, iA);
        this.f4023h += iA;
        if (z10) {
            this.f4020e = e(i11);
        }
    }

    private void g(M m9) {
        int iA = m9.a();
        this.f4023h += h();
        this.f4019d.b(m9, iA);
        this.f4023h += iA;
        this.f4020e = e((m9.e()[0] >> 1) & 63);
    }

    private int h() {
        this.f4017b.U(0);
        int iA = this.f4017b.a();
        ((w) AbstractC1684a.e(this.f4019d)).b(this.f4017b, iA);
        return iA;
    }

    @Override // L3.k
    public void a(long j9, long j10) {
        this.f4021f = j9;
        this.f4023h = 0;
        this.f4024i = j10;
    }

    @Override // L3.k
    public void b(long j9, int i9) {
    }

    @Override // L3.k
    public void c(M m9, long j9, int i9, boolean z9) throws C0897l1 {
        if (m9.e().length == 0) {
            throw C0897l1.c("Empty RTP data packet.", null);
        }
        int i10 = (m9.e()[0] >> 1) & 63;
        AbstractC1684a.i(this.f4019d);
        if (i10 >= 0 && i10 < 48) {
            g(m9);
        } else {
            if (i10 == 48) {
                throw new UnsupportedOperationException("need to implement processAggregationPacket");
            }
            if (i10 != 49) {
                throw C0897l1.c(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i10)), null);
            }
            f(m9, i9);
        }
        if (z9) {
            if (this.f4021f == -9223372036854775807L) {
                this.f4021f = j9;
            }
            this.f4019d.f(m.a(this.f4024i, j9, this.f4021f, 90000), this.f4020e, this.f4023h, 0, null);
            this.f4023h = 0;
        }
        this.f4022g = i9;
    }

    @Override // L3.k
    public void d(InterfaceC1674k interfaceC1674k, int i9) {
        w wVarE = interfaceC1674k.e(i9, 2);
        this.f4019d = wVarE;
        wVarE.d(this.f4018c.f3742c);
    }
}
