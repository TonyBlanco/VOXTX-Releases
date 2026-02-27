package d4;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f39748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f39749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f39750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal f39751d = new ThreadLocal();

    public Z(long j9) {
        h(j9);
    }

    public static long g(long j9) {
        return (j9 * 1000000) / 90000;
    }

    public static long j(long j9) {
        return (j9 * 90000) / 1000000;
    }

    public static long k(long j9) {
        return j(j9) % IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT;
    }

    public synchronized long a(long j9) {
        if (j9 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!f()) {
                long jLongValue = this.f39748a;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) AbstractC1684a.e((Long) this.f39751d.get())).longValue();
                }
                this.f39749b = jLongValue - j9;
                notifyAll();
            }
            this.f39750c = j9;
            return j9 + this.f39749b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long b(long j9) {
        if (j9 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j10 = this.f39750c;
            if (j10 != -9223372036854775807L) {
                long j11 = j(j10);
                long j12 = (IjkMediaMeta.AV_CH_WIDE_RIGHT + j11) / IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT;
                long j13 = ((j12 - 1) * IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT) + j9;
                j9 += j12 * IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT;
                if (Math.abs(j13 - j11) < Math.abs(j9 - j11)) {
                    j9 = j13;
                }
            }
            return a(g(j9));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long c() {
        long j9;
        j9 = this.f39748a;
        if (j9 == Long.MAX_VALUE || j9 == 9223372036854775806L) {
            j9 = -9223372036854775807L;
        }
        return j9;
    }

    public synchronized long d() {
        long j9;
        try {
            j9 = this.f39750c;
        } catch (Throwable th) {
            throw th;
        }
        return j9 != -9223372036854775807L ? j9 + this.f39749b : c();
    }

    public synchronized long e() {
        return this.f39749b;
    }

    public synchronized boolean f() {
        return this.f39749b != -9223372036854775807L;
    }

    public synchronized void h(long j9) {
        this.f39748a = j9;
        this.f39749b = j9 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f39750c = -9223372036854775807L;
    }

    public synchronized void i(boolean z9, long j9, long j10) {
        try {
            AbstractC1684a.g(this.f39748a == 9223372036854775806L);
            if (f()) {
                return;
            }
            if (z9) {
                this.f39751d.set(Long.valueOf(j9));
            } else {
                long jElapsedRealtime = 0;
                long j11 = j10;
                while (!f()) {
                    if (j10 == 0) {
                        wait();
                    } else {
                        AbstractC1684a.g(j11 > 0);
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        wait(j11);
                        jElapsedRealtime += SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        if (jElapsedRealtime >= j10 && !f()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j10 + " milliseconds");
                        }
                        j11 = j10 - jElapsedRealtime;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
