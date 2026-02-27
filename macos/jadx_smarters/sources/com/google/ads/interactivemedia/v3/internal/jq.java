package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes3.dex */
final class jq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AudioTrack f23367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioTimestamp f23368b = new AudioTimestamp();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f23369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f23370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f23371e;

    public jq(AudioTrack audioTrack) {
        this.f23367a = audioTrack;
    }

    public final long a() {
        return this.f23371e;
    }

    public final long b() {
        return this.f23368b.nanoTime / 1000;
    }

    public final boolean c() {
        boolean timestamp = this.f23367a.getTimestamp(this.f23368b);
        if (timestamp) {
            long j9 = this.f23368b.framePosition;
            if (this.f23370d > j9) {
                this.f23369c++;
            }
            this.f23370d = j9;
            this.f23371e = j9 + (this.f23369c << 32);
        }
        return timestamp;
    }
}
