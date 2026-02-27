package Q2;

import android.media.AudioTrack;
import android.os.SystemClock;
import d4.AbstractC1684a;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class E {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f7543A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f7544B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f7545C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f7546D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f7547E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f7548F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f7549G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f7550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f7551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioTrack f7552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public D f7555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f7558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f7559j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7560k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f7561l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f7562m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Method f7563n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f7564o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7565p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f7566q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f7567r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f7568s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f7569t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f7570u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f7571v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7572w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7573x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f7574y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f7575z;

    public interface a {
        void a(int i9, long j9);

        void b(long j9);

        void c(long j9);

        void d(long j9, long j10, long j11, long j12);

        void e(long j9, long j10, long j11, long j12);
    }

    public E(a aVar) {
        this.f7550a = (a) AbstractC1684a.e(aVar);
        if (d4.k0.f39777a >= 18) {
            try {
                this.f7563n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f7551b = new long[10];
    }

    public static boolean p(int i9) {
        return d4.k0.f39777a < 23 && (i9 == 5 || i9 == 6);
    }

    public final long a(long j9) {
        return (j9 * ((long) this.f7556g)) / 1000000;
    }

    public final boolean b() {
        return this.f7557h && ((AudioTrack) AbstractC1684a.e(this.f7552c)).getPlayState() == 2 && f() == 0;
    }

    public final long c(long j9) {
        return (j9 * 1000000) / ((long) this.f7556g);
    }

    public int d(long j9) {
        return this.f7554e - ((int) (j9 - (f() * ((long) this.f7553d))));
    }

    public long e(boolean z9) {
        long jG;
        if (((AudioTrack) AbstractC1684a.e(this.f7552c)).getPlayState() == 3) {
            n();
        }
        long jNanoTime = System.nanoTime() / 1000;
        D d9 = (D) AbstractC1684a.e(this.f7555f);
        boolean zD = d9.d();
        if (zD) {
            jG = c(d9.b()) + d4.k0.f0(jNanoTime - d9.c(), this.f7559j);
        } else {
            jG = this.f7573x == 0 ? g() : d4.k0.f0(this.f7561l + jNanoTime, this.f7559j);
            if (!z9) {
                jG = Math.max(0L, jG - this.f7564o);
            }
        }
        if (this.f7547E != zD) {
            this.f7549G = this.f7546D;
            this.f7548F = this.f7545C;
        }
        long j9 = jNanoTime - this.f7549G;
        if (j9 < 1000000) {
            long jF0 = this.f7548F + d4.k0.f0(j9, this.f7559j);
            long j10 = (j9 * 1000) / 1000000;
            jG = ((jG * j10) + ((1000 - j10) * jF0)) / 1000;
        }
        if (!this.f7560k) {
            long j11 = this.f7545C;
            if (jG > j11) {
                this.f7560k = true;
                this.f7550a.c(System.currentTimeMillis() - d4.k0.x1(d4.k0.k0(d4.k0.x1(jG - j11), this.f7559j)));
            }
        }
        this.f7546D = jNanoTime;
        this.f7545C = jG;
        this.f7547E = zD;
        return jG;
    }

    public final long f() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j9 = this.f7574y;
        if (j9 != -9223372036854775807L) {
            return Math.min(this.f7544B, this.f7543A + a(d4.k0.f0((jElapsedRealtime * 1000) - j9, this.f7559j)));
        }
        if (jElapsedRealtime - this.f7568s >= 5) {
            w(jElapsedRealtime);
            this.f7568s = jElapsedRealtime;
        }
        return this.f7569t + (this.f7570u << 32);
    }

    public final long g() {
        return c(f());
    }

    public void h(long j9) {
        this.f7543A = f();
        this.f7574y = SystemClock.elapsedRealtime() * 1000;
        this.f7544B = j9;
    }

    public boolean i(long j9) {
        return j9 > a(e(false)) || b();
    }

    public boolean j() {
        return ((AudioTrack) AbstractC1684a.e(this.f7552c)).getPlayState() == 3;
    }

    public boolean k(long j9) {
        return this.f7575z != -9223372036854775807L && j9 > 0 && SystemClock.elapsedRealtime() - this.f7575z >= 200;
    }

    public boolean l(long j9) {
        int playState = ((AudioTrack) AbstractC1684a.e(this.f7552c)).getPlayState();
        if (this.f7557h) {
            if (playState == 2) {
                this.f7565p = false;
                return false;
            }
            if (playState == 1 && f() == 0) {
                return false;
            }
        }
        boolean z9 = this.f7565p;
        boolean zI = i(j9);
        this.f7565p = zI;
        if (z9 && !zI && playState != 1) {
            this.f7550a.a(this.f7554e, d4.k0.x1(this.f7558i));
        }
        return true;
    }

    public final void m(long j9) {
        D d9 = (D) AbstractC1684a.e(this.f7555f);
        if (d9.e(j9)) {
            long jC = d9.c();
            long jB = d9.b();
            long jG = g();
            if (Math.abs(jC - j9) > 5000000) {
                this.f7550a.e(jB, jC, j9, jG);
            } else {
                if (Math.abs(c(jB) - jG) <= 5000000) {
                    d9.a();
                    return;
                }
                this.f7550a.d(jB, jC, j9, jG);
            }
            d9.f();
        }
    }

    public final void n() {
        long jNanoTime = System.nanoTime() / 1000;
        if (jNanoTime - this.f7562m >= 30000) {
            long jG = g();
            if (jG != 0) {
                this.f7551b[this.f7572w] = d4.k0.k0(jG, this.f7559j) - jNanoTime;
                this.f7572w = (this.f7572w + 1) % 10;
                int i9 = this.f7573x;
                if (i9 < 10) {
                    this.f7573x = i9 + 1;
                }
                this.f7562m = jNanoTime;
                this.f7561l = 0L;
                int i10 = 0;
                while (true) {
                    int i11 = this.f7573x;
                    if (i10 >= i11) {
                        break;
                    }
                    this.f7561l += this.f7551b[i10] / ((long) i11);
                    i10++;
                }
            } else {
                return;
            }
        }
        if (this.f7557h) {
            return;
        }
        m(jNanoTime);
        o(jNanoTime);
    }

    public final void o(long j9) {
        Method method;
        if (!this.f7566q || (method = this.f7563n) == null || j9 - this.f7567r < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) d4.k0.j((Integer) method.invoke(AbstractC1684a.e(this.f7552c), null))).intValue()) * 1000) - this.f7558i;
            this.f7564o = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f7564o = jMax;
            if (jMax > 5000000) {
                this.f7550a.b(jMax);
                this.f7564o = 0L;
            }
        } catch (Exception unused) {
            this.f7563n = null;
        }
        this.f7567r = j9;
    }

    public boolean q() {
        s();
        if (this.f7574y != -9223372036854775807L) {
            return false;
        }
        ((D) AbstractC1684a.e(this.f7555f)).g();
        return true;
    }

    public void r() {
        s();
        this.f7552c = null;
        this.f7555f = null;
    }

    public final void s() {
        this.f7561l = 0L;
        this.f7573x = 0;
        this.f7572w = 0;
        this.f7562m = 0L;
        this.f7546D = 0L;
        this.f7549G = 0L;
        this.f7560k = false;
    }

    public void t(AudioTrack audioTrack, boolean z9, int i9, int i10, int i11) {
        this.f7552c = audioTrack;
        this.f7553d = i10;
        this.f7554e = i11;
        this.f7555f = new D(audioTrack);
        this.f7556g = audioTrack.getSampleRate();
        this.f7557h = z9 && p(i9);
        boolean zD0 = d4.k0.D0(i9);
        this.f7566q = zD0;
        this.f7558i = zD0 ? c(i11 / i10) : -9223372036854775807L;
        this.f7569t = 0L;
        this.f7570u = 0L;
        this.f7571v = 0L;
        this.f7565p = false;
        this.f7574y = -9223372036854775807L;
        this.f7575z = -9223372036854775807L;
        this.f7567r = 0L;
        this.f7564o = 0L;
        this.f7559j = 1.0f;
    }

    public void u(float f9) {
        this.f7559j = f9;
        D d9 = this.f7555f;
        if (d9 != null) {
            d9.g();
        }
        s();
    }

    public void v() {
        ((D) AbstractC1684a.e(this.f7555f)).g();
    }

    public final void w(long j9) {
        AudioTrack audioTrack = (AudioTrack) AbstractC1684a.e(this.f7552c);
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f7557h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f7571v = this.f7569t;
            }
            playbackHeadPosition += this.f7571v;
        }
        if (d4.k0.f39777a <= 29) {
            if (playbackHeadPosition == 0 && this.f7569t > 0 && playState == 3) {
                if (this.f7575z == -9223372036854775807L) {
                    this.f7575z = j9;
                    return;
                }
                return;
            }
            this.f7575z = -9223372036854775807L;
        }
        if (this.f7569t > playbackHeadPosition) {
            this.f7570u++;
        }
        this.f7569t = playbackHeadPosition;
    }
}
