package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
final class jt {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f23378A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f23379B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f23380C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f23381D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private long f23382E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private long f23383F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final js f23384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f23385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AudioTrack f23386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private jr f23389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f23392i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f23393j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f23394k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f23395l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f23396m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Method f23397n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f23398o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f23399p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f23400q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f23401r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f23402s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f23403t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f23404u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f23405v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f23406w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f23407x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f23408y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f23409z;

    public jt(js jsVar) {
        this.f23384a = jsVar;
        if (cq.f22640a >= 18) {
            try {
                this.f23397n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f23385b = new long[10];
    }

    private final long l(long j9) {
        return (j9 * 1000000) / ((long) this.f23390g);
    }

    private final long m() {
        AudioTrack audioTrack = this.f23386c;
        af.s(audioTrack);
        if (this.f23407x != -9223372036854775807L) {
            return Math.min(this.f23378A, this.f23409z + ((((SystemClock.elapsedRealtime() * 1000) - this.f23407x) * ((long) this.f23390g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        long j9 = 0;
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f23391h) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.f23404u = this.f23402s;
                }
                playState = 2;
            }
            playbackHeadPosition += this.f23404u;
        }
        if (cq.f22640a <= 29) {
            if (playbackHeadPosition != 0) {
                j9 = playbackHeadPosition;
            } else if (this.f23402s > 0 && playState == 3) {
                if (this.f23408y == -9223372036854775807L) {
                    this.f23408y = SystemClock.elapsedRealtime();
                }
                return this.f23402s;
            }
            this.f23408y = -9223372036854775807L;
            playbackHeadPosition = j9;
        }
        if (this.f23402s > playbackHeadPosition) {
            this.f23403t++;
        }
        this.f23402s = playbackHeadPosition;
        return playbackHeadPosition + (this.f23403t << 32);
    }

    private final long n() {
        return l(m());
    }

    private final void o() {
        this.f23395l = 0L;
        this.f23406w = 0;
        this.f23405v = 0;
        this.f23396m = 0L;
        this.f23380C = 0L;
        this.f23383F = 0L;
        this.f23394k = false;
    }

    public final int a(long j9) {
        return this.f23388e - ((int) (j9 - (m() * ((long) this.f23387d))));
    }

    public final long b(boolean z9) {
        long jN;
        Method method;
        AudioTrack audioTrack = this.f23386c;
        af.s(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            long jN2 = n();
            if (jN2 != 0) {
                long jNanoTime = System.nanoTime() / 1000;
                if (jNanoTime - this.f23396m >= 30000) {
                    long[] jArr = this.f23385b;
                    int i9 = this.f23405v;
                    jArr[i9] = jN2 - jNanoTime;
                    this.f23405v = (i9 + 1) % 10;
                    int i10 = this.f23406w;
                    if (i10 < 10) {
                        this.f23406w = i10 + 1;
                    }
                    this.f23396m = jNanoTime;
                    this.f23395l = 0L;
                    int i11 = 0;
                    while (true) {
                        int i12 = this.f23406w;
                        if (i11 >= i12) {
                            break;
                        }
                        this.f23395l += this.f23385b[i11] / ((long) i12);
                        i11++;
                    }
                }
                if (!this.f23391h) {
                    jr jrVar = this.f23389f;
                    af.s(jrVar);
                    if (jrVar.g(jNanoTime)) {
                        long jB = jrVar.b();
                        long jA = jrVar.a();
                        if (Math.abs(jB - jNanoTime) > 5000000) {
                            this.f23384a.d(jA, jB, jNanoTime, jN2);
                        } else if (Math.abs(l(jA) - jN2) > 5000000) {
                            this.f23384a.c(jA, jB, jNanoTime, jN2);
                        } else {
                            jrVar.c();
                        }
                        jrVar.d();
                    }
                    if (this.f23400q && (method = this.f23397n) != null && jNanoTime - this.f23401r >= 500000) {
                        try {
                            AudioTrack audioTrack2 = this.f23386c;
                            af.s(audioTrack2);
                            Integer num = (Integer) method.invoke(audioTrack2, null);
                            int i13 = cq.f22640a;
                            long jIntValue = (((long) num.intValue()) * 1000) - this.f23392i;
                            this.f23398o = jIntValue;
                            long jMax = Math.max(jIntValue, 0L);
                            this.f23398o = jMax;
                            if (jMax > 5000000) {
                                this.f23384a.a(jMax);
                                this.f23398o = 0L;
                            }
                        } catch (Exception unused) {
                            this.f23397n = null;
                        }
                        this.f23401r = jNanoTime;
                    }
                }
            }
        }
        long jNanoTime2 = System.nanoTime() / 1000;
        jr jrVar2 = this.f23389f;
        af.s(jrVar2);
        boolean zF = jrVar2.f();
        if (zF) {
            jN = l(jrVar2.a()) + cq.q(jNanoTime2 - jrVar2.b(), this.f23393j);
        } else {
            jN = this.f23406w == 0 ? n() : this.f23395l + jNanoTime2;
            if (!z9) {
                jN = Math.max(0L, jN - this.f23398o);
            }
        }
        if (this.f23381D != zF) {
            this.f23383F = this.f23380C;
            this.f23382E = this.f23379B;
        }
        long j9 = jNanoTime2 - this.f23383F;
        if (j9 < 1000000) {
            long j10 = (j9 * 1000) / 1000000;
            jN = ((jN * j10) + ((1000 - j10) * (this.f23382E + cq.q(j9, this.f23393j)))) / 1000;
        }
        if (!this.f23394k) {
            long j11 = this.f23379B;
            if (jN > j11) {
                this.f23394k = true;
                this.f23384a.b(System.currentTimeMillis() - cq.x(cq.s(cq.x(jN - j11), this.f23393j)));
            }
        }
        this.f23380C = jNanoTime2;
        this.f23379B = jN;
        this.f23381D = zF;
        return jN;
    }

    public final void c(long j9) {
        this.f23409z = m();
        this.f23407x = SystemClock.elapsedRealtime() * 1000;
        this.f23378A = j9;
    }

    public final void d() {
        o();
        this.f23386c = null;
        this.f23389f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.media.AudioTrack r3, boolean r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            r2.f23386c = r3
            r2.f23387d = r6
            r2.f23388e = r7
            com.google.ads.interactivemedia.v3.internal.jr r0 = new com.google.ads.interactivemedia.v3.internal.jr
            r0.<init>(r3)
            r2.f23389f = r0
            int r3 = r3.getSampleRate()
            r2.f23390g = r3
            r3 = 0
            if (r4 == 0) goto L24
            int r4 = com.google.ads.interactivemedia.v3.internal.cq.f22640a
            r0 = 23
            if (r4 >= r0) goto L24
            r4 = 5
            r0 = 1
            if (r5 == r4) goto L25
            r4 = 6
            if (r5 != r4) goto L24
            goto L25
        L24:
            r0 = 0
        L25:
            r2.f23391h = r0
            boolean r4 = com.google.ads.interactivemedia.v3.internal.cq.Y(r5)
            r2.f23400q = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L3b
            int r7 = r7 / r6
            long r4 = (long) r7
            long r4 = r2.l(r4)
            goto L3c
        L3b:
            r4 = r0
        L3c:
            r2.f23392i = r4
            r4 = 0
            r2.f23402s = r4
            r2.f23403t = r4
            r2.f23404u = r4
            r2.f23399p = r3
            r2.f23407x = r0
            r2.f23408y = r0
            r2.f23401r = r4
            r2.f23398o = r4
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.f23393j = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.jt.e(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final void f() {
        jr jrVar = this.f23389f;
        af.s(jrVar);
        jrVar.e();
    }

    public final boolean g(long j9) {
        if (j9 > m()) {
            return true;
        }
        if (!this.f23391h) {
            return false;
        }
        AudioTrack audioTrack = this.f23386c;
        af.s(audioTrack);
        return audioTrack.getPlayState() == 2 && m() == 0;
    }

    public final boolean h() {
        AudioTrack audioTrack = this.f23386c;
        af.s(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    public final boolean i(long j9) {
        return this.f23408y != -9223372036854775807L && j9 > 0 && SystemClock.elapsedRealtime() - this.f23408y >= 200;
    }

    public final boolean j(long j9) {
        AudioTrack audioTrack = this.f23386c;
        af.s(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.f23391h) {
            if (playState == 2) {
                this.f23399p = false;
                return false;
            }
            if (playState == 1) {
                if (m() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z9 = this.f23399p;
        boolean zG = g(j9);
        this.f23399p = zG;
        if (z9 && !zG && playState != 1) {
            this.f23384a.e(this.f23388e, cq.x(this.f23392i));
        }
        return true;
    }

    public final boolean k() {
        o();
        if (this.f23407x != -9223372036854775807L) {
            return false;
        }
        jr jrVar = this.f23389f;
        af.s(jrVar);
        jrVar.e();
        return true;
    }
}
