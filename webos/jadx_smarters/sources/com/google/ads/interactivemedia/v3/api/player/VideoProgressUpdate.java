package com.google.ads.interactivemedia.v3.api.player;

import com.google.android.gms.common.internal.Hide;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoProgressUpdate {
    public static final VideoProgressUpdate VIDEO_TIME_NOT_READY = new VideoProgressUpdate(-1, -1);
    private final long currentTimeMs;
    private final long durationMs;

    public VideoProgressUpdate(long j9, long j10) {
        this.currentTimeMs = j9;
        this.durationMs = j10;
    }

    private float getCurrentTimeSecondsFloat() {
        return this.currentTimeMs / 1000.0f;
    }

    private float getDurationSecondsFloat() {
        return this.durationMs / 1000.0f;
    }

    @Hide
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VideoProgressUpdate.class != obj.getClass()) {
            return false;
        }
        VideoProgressUpdate videoProgressUpdate = (VideoProgressUpdate) obj;
        return this.currentTimeMs == videoProgressUpdate.currentTimeMs && this.durationMs == videoProgressUpdate.durationMs;
    }

    @Deprecated
    public float getCurrentTime() {
        return getCurrentTimeSecondsFloat();
    }

    public long getCurrentTimeMs() {
        return this.currentTimeMs;
    }

    @Deprecated
    public float getDuration() {
        return getDurationSecondsFloat();
    }

    public long getDurationMs() {
        return this.durationMs;
    }

    @Hide
    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.currentTimeMs), Long.valueOf(this.durationMs)});
    }
}
