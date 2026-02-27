package com.google.ads.interactivemedia.v3.internal;

import android.annotation.TargetApi;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes3.dex */
final class jr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jq f23372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f23374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f23375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f23376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f23377f;

    public jr(AudioTrack audioTrack) {
        if (cq.f22640a >= 19) {
            this.f23372a = new jq(audioTrack);
            e();
        } else {
            this.f23372a = null;
            h(3);
        }
    }

    private final void h(int i9) {
        this.f23373b = i9;
        long j9 = 10000;
        if (i9 == 0) {
            this.f23376e = 0L;
            this.f23377f = -1L;
            this.f23374c = System.nanoTime() / 1000;
        } else {
            if (i9 == 1) {
                this.f23375d = 10000L;
                return;
            }
            j9 = (i9 == 2 || i9 == 3) ? 10000000L : 500000L;
        }
        this.f23375d = j9;
    }

    @TargetApi(19)
    public final long a() {
        jq jqVar = this.f23372a;
        if (jqVar != null) {
            return jqVar.a();
        }
        return -1L;
    }

    @TargetApi(19)
    public final long b() {
        jq jqVar = this.f23372a;
        if (jqVar != null) {
            return jqVar.b();
        }
        return -9223372036854775807L;
    }

    public final void c() {
        if (this.f23373b == 4) {
            e();
        }
    }

    public final void d() {
        h(4);
    }

    public final void e() {
        if (this.f23372a != null) {
            h(0);
        }
    }

    public final boolean f() {
        return this.f23373b == 2;
    }

    @TargetApi(19)
    public final boolean g(long j9) {
        jq jqVar = this.f23372a;
        if (jqVar != null && j9 - this.f23376e >= this.f23375d) {
            this.f23376e = j9;
            boolean zC = jqVar.c();
            int i9 = this.f23373b;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 == 3 && zC) {
                            e();
                            return true;
                        }
                    } else if (!zC) {
                        e();
                        return false;
                    }
                } else if (!zC) {
                    e();
                } else if (this.f23372a.a() > this.f23377f) {
                    h(2);
                    return true;
                }
            } else {
                if (zC) {
                    if (this.f23372a.b() < this.f23374c) {
                        return false;
                    }
                    this.f23377f = this.f23372a.a();
                    h(1);
                    return true;
                }
                if (j9 - this.f23374c > 500000) {
                    h(3);
                }
            }
            return zC;
        }
        return false;
    }
}
