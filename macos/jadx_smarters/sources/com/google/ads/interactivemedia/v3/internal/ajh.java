package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
final class ajh implements akp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SortedSet f19935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ajx f19936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f19937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f19938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private VideoProgressUpdate f19939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.ads.interactivemedia.v3.impl.data.k f19940f;

    public ajh(ajx ajxVar, SortedSet sortedSet, String str) {
        com.google.ads.interactivemedia.v3.impl.data.k kVar = new com.google.ads.interactivemedia.v3.impl.data.k();
        this.f19938d = 0L;
        this.f19939e = new VideoProgressUpdate(0L, 0L);
        this.f19935a = sortedSet;
        this.f19940f = kVar;
        this.f19936b = ajxVar;
        this.f19937c = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akp
    public final void a(VideoProgressUpdate videoProgressUpdate) {
        if (videoProgressUpdate == null || videoProgressUpdate.getDuration() < 0.0f || videoProgressUpdate.equals(this.f19939e)) {
            return;
        }
        float currentTime = this.f19939e.getCurrentTime();
        float currentTime2 = videoProgressUpdate.getCurrentTime();
        if (!(currentTime < currentTime2 ? this.f19935a.subSet(Float.valueOf(currentTime), Float.valueOf(currentTime2)) : this.f19935a.subSet(Float.valueOf(currentTime2), Float.valueOf(currentTime))).isEmpty() || this.f19935a.contains(Float.valueOf(videoProgressUpdate.getCurrentTime())) || System.currentTimeMillis() - this.f19938d >= 1000) {
            this.f19938d = System.currentTimeMillis();
            this.f19939e = videoProgressUpdate;
            this.f19936b.o(new ajr(ajp.contentTimeUpdate, ajq.contentTimeUpdate, this.f19937c, com.google.ads.interactivemedia.v3.impl.data.bz.create(videoProgressUpdate)));
        }
    }
}
