package O2;

import android.os.Looper;
import d4.AbstractC1684a;
import d4.InterfaceC1688e;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: O2.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0932x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f6361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f6362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1688e f6363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q1 f6364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f6366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Looper f6367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f6369i = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6370j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6371k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6372l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6373m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6374n;

    /* JADX INFO: renamed from: O2.x1$a */
    public interface a {
        void d(C0932x1 c0932x1);
    }

    /* JADX INFO: renamed from: O2.x1$b */
    public interface b {
        void n(int i9, Object obj);
    }

    public C0932x1(a aVar, b bVar, Q1 q12, int i9, InterfaceC1688e interfaceC1688e, Looper looper) {
        this.f6362b = aVar;
        this.f6361a = bVar;
        this.f6364d = q12;
        this.f6367g = looper;
        this.f6363c = interfaceC1688e;
        this.f6368h = i9;
    }

    public synchronized boolean a(long j9) {
        boolean z9;
        try {
            AbstractC1684a.g(this.f6371k);
            AbstractC1684a.g(this.f6367g.getThread() != Thread.currentThread());
            long jB = this.f6363c.b() + j9;
            while (true) {
                z9 = this.f6373m;
                if (z9 || j9 <= 0) {
                    break;
                }
                this.f6363c.d();
                wait(j9);
                j9 = jB - this.f6363c.b();
            }
            if (!z9) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f6372l;
    }

    public boolean b() {
        return this.f6370j;
    }

    public Looper c() {
        return this.f6367g;
    }

    public int d() {
        return this.f6368h;
    }

    public Object e() {
        return this.f6366f;
    }

    public long f() {
        return this.f6369i;
    }

    public b g() {
        return this.f6361a;
    }

    public Q1 h() {
        return this.f6364d;
    }

    public int i() {
        return this.f6365e;
    }

    public synchronized boolean j() {
        return this.f6374n;
    }

    public synchronized void k(boolean z9) {
        this.f6372l = z9 | this.f6372l;
        this.f6373m = true;
        notifyAll();
    }

    public C0932x1 l() {
        AbstractC1684a.g(!this.f6371k);
        if (this.f6369i == -9223372036854775807L) {
            AbstractC1684a.a(this.f6370j);
        }
        this.f6371k = true;
        this.f6362b.d(this);
        return this;
    }

    public C0932x1 m(Object obj) {
        AbstractC1684a.g(!this.f6371k);
        this.f6366f = obj;
        return this;
    }

    public C0932x1 n(int i9) {
        AbstractC1684a.g(!this.f6371k);
        this.f6365e = i9;
        return this;
    }
}
