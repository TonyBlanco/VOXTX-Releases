package K3;

import android.os.SystemClock;
import com.google.android.exoplayer2.extractor.g;
import d3.InterfaceC1672i;
import d3.InterfaceC1673j;
import d3.InterfaceC1674k;
import d4.AbstractC1684a;
import d4.M;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements InterfaceC1672i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L3.k f3701a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3704d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC1674k f3707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3708h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3711k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f3702b = new M(65507);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f3703c = new M();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f3705e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f3706f = new g();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile long f3709i = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile int f3710j = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f3712l = -9223372036854775807L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f3713m = -9223372036854775807L;

    public d(h hVar, int i9) {
        this.f3704d = i9;
        this.f3701a = (L3.k) AbstractC1684a.e(new L3.a().a(hVar));
    }

    public static long c(long j9) {
        return j9 - 30;
    }

    @Override // d3.InterfaceC1672i
    public void a(long j9, long j10) {
        synchronized (this.f3705e) {
            try {
                if (!this.f3711k) {
                    this.f3711k = true;
                }
                this.f3712l = j9;
                this.f3713m = j10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // d3.InterfaceC1672i
    public void b(InterfaceC1674k interfaceC1674k) {
        this.f3701a.d(interfaceC1674k, this.f3704d);
        interfaceC1674k.q();
        interfaceC1674k.n(new g.b(-9223372036854775807L));
        this.f3707g = interfaceC1674k;
    }

    @Override // d3.InterfaceC1672i
    public int d(InterfaceC1673j interfaceC1673j, d3.t tVar) {
        AbstractC1684a.e(this.f3707g);
        int i9 = interfaceC1673j.read(this.f3702b.e(), 0, 65507);
        if (i9 == -1) {
            return -1;
        }
        if (i9 == 0) {
            return 0;
        }
        this.f3702b.U(0);
        this.f3702b.T(i9);
        e eVarD = e.d(this.f3702b);
        if (eVarD == null) {
            return 0;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jC = c(jElapsedRealtime);
        this.f3706f.e(eVarD, jElapsedRealtime);
        e eVarF = this.f3706f.f(jC);
        if (eVarF == null) {
            return 0;
        }
        if (!this.f3708h) {
            if (this.f3709i == -9223372036854775807L) {
                this.f3709i = eVarF.f3722h;
            }
            if (this.f3710j == -1) {
                this.f3710j = eVarF.f3721g;
            }
            this.f3701a.b(this.f3709i, this.f3710j);
            this.f3708h = true;
        }
        synchronized (this.f3705e) {
            try {
                if (!this.f3711k) {
                    do {
                        this.f3703c.R(eVarF.f3725k);
                        this.f3701a.c(this.f3703c, eVarF.f3722h, eVarF.f3721g, eVarF.f3719e);
                        eVarF = this.f3706f.f(jC);
                    } while (eVarF != null);
                } else if (this.f3712l != -9223372036854775807L && this.f3713m != -9223372036854775807L) {
                    this.f3706f.g();
                    this.f3701a.a(this.f3712l, this.f3713m);
                    this.f3711k = false;
                    this.f3712l = -9223372036854775807L;
                    this.f3713m = -9223372036854775807L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public boolean e() {
        return this.f3708h;
    }

    public void f() {
        synchronized (this.f3705e) {
            this.f3711k = true;
        }
    }

    public void g(int i9) {
        this.f3710j = i9;
    }

    @Override // d3.InterfaceC1672i
    public boolean h(InterfaceC1673j interfaceC1673j) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    public void i(long j9) {
        this.f3709i = j9;
    }

    @Override // d3.InterfaceC1672i
    public void release() {
    }
}
