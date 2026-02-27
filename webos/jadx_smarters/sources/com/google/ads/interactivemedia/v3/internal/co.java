package com.google.ads.interactivemedia.v3.internal;

import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public final class co {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f22635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f22636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f22637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal f22638d = new ThreadLocal();

    public co(long j9) {
        h(j9);
    }

    public static long f(long j9) {
        return (j9 * 1000000) / 90000;
    }

    public static long g(long j9) {
        return (j9 * 90000) / 1000000;
    }

    public final synchronized long a(long j9) {
        if (j9 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.f22636b == -9223372036854775807L) {
                long jLongValue = this.f22635a;
                if (jLongValue == 9223372036854775806L) {
                    Long l9 = (Long) this.f22638d.get();
                    af.s(l9);
                    jLongValue = l9.longValue();
                }
                this.f22636b = jLongValue - j9;
                notifyAll();
            }
            this.f22637c = j9;
            return j9 + this.f22636b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j9) {
        if (j9 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j10 = this.f22637c;
            if (j10 != -9223372036854775807L) {
                long jG = g(j10);
                long j11 = (IjkMediaMeta.AV_CH_WIDE_RIGHT + jG) / IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT;
                long j12 = (((-1) + j11) * IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT) + j9;
                j9 += j11 * IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT;
                if (Math.abs(j12 - jG) < Math.abs(j9 - jG)) {
                    j9 = j12;
                }
            }
            return a(f(j9));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c() {
        long j9 = this.f22635a;
        if (j9 == Long.MAX_VALUE || j9 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j9;
    }

    public final synchronized long d() {
        long j9;
        try {
            j9 = this.f22637c;
        } catch (Throwable th) {
            throw th;
        }
        return j9 != -9223372036854775807L ? j9 + this.f22636b : c();
    }

    public final synchronized long e() {
        return this.f22636b;
    }

    public final synchronized void h(long j9) {
        this.f22635a = j9;
        this.f22636b = j9 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f22637c = -9223372036854775807L;
    }

    public final synchronized void i(boolean z9, long j9) throws InterruptedException {
        af.w(this.f22635a == 9223372036854775806L);
        if (this.f22636b != -9223372036854775807L) {
            return;
        }
        if (z9) {
            this.f22638d.set(Long.valueOf(j9));
        } else {
            while (this.f22636b == -9223372036854775807L) {
                wait();
            }
        }
    }
}
