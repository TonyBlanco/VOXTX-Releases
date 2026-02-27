package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
final class aii implements VideoAdPlayer.VideoAdPlayerCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private aih f19835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19836c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f19834a = axo.p(2);

    private final void d(ajq ajqVar, AdMediaInfo adMediaInfo) {
        e(ajqVar, adMediaInfo, null);
    }

    private final void e(ajq ajqVar, AdMediaInfo adMediaInfo, Object obj) {
        aih aihVar = this.f19835b;
        if (aihVar != null) {
            aihVar.b(ajqVar, adMediaInfo, obj);
        }
    }

    public final void a(aih aihVar) {
        this.f19835b = aihVar;
    }

    public final void b() {
        this.f19836c = true;
    }

    public final void c() {
        this.f19836c = false;
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onAdProgress(AdMediaInfo adMediaInfo, VideoProgressUpdate videoProgressUpdate) {
        if (this.f19836c && videoProgressUpdate != null && videoProgressUpdate.getDuration() > 0.0f) {
            if (this.f19834a.get(adMediaInfo) == null && videoProgressUpdate.getCurrentTime() > 0.0f) {
                d(ajq.start, adMediaInfo);
                this.f19834a.put(adMediaInfo, Boolean.TRUE);
            }
            e(ajq.timeupdate, adMediaInfo, com.google.ads.interactivemedia.v3.impl.data.bz.create(videoProgressUpdate));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onBuffering(AdMediaInfo adMediaInfo) {
        if (this.f19836c) {
            d(ajq.waiting, adMediaInfo);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onContentComplete() {
        aih aihVar = this.f19835b;
        if (aihVar != null) {
            aihVar.a(ajp.adsLoader, ajq.contentComplete);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onEnded(AdMediaInfo adMediaInfo) {
        if (this.f19836c) {
            d(ajq.end, adMediaInfo);
            this.f19834a.remove(adMediaInfo);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onError(AdMediaInfo adMediaInfo) {
        if (this.f19836c) {
            d(ajq.error, adMediaInfo);
            this.f19834a.remove(adMediaInfo);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onLoaded(AdMediaInfo adMediaInfo) {
        if (this.f19836c) {
            d(ajq.loaded, adMediaInfo);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onPause(AdMediaInfo adMediaInfo) {
        if (this.f19836c) {
            d(ajq.pause, adMediaInfo);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onPlay(AdMediaInfo adMediaInfo) {
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onResume(AdMediaInfo adMediaInfo) {
        if (this.f19836c) {
            d(ajq.play, adMediaInfo);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onVolumeChanged(AdMediaInfo adMediaInfo, int i9) {
        if (this.f19836c) {
            e(ajq.volumeChange, adMediaInfo, com.google.ads.interactivemedia.v3.impl.data.cf.builder().volumePercentage(i9).build());
        }
    }
}
