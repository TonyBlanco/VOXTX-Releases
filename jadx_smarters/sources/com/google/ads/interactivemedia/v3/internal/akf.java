package com.google.ads.interactivemedia.v3.internal;

import com.TryRoom;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.ResizablePlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData;

/* JADX INFO: loaded from: classes3.dex */
public final class akf implements akw, aih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdDisplayContainer f20015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final VideoAdPlayer f20016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ajj f20017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ajx f20018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f20019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final aii f20020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final avf f20021g = avf.p();

    public akf(String str, ajx ajxVar, ajj ajjVar, AdDisplayContainer adDisplayContainer) {
        this.f20015a = adDisplayContainer;
        VideoAdPlayer player = adDisplayContainer.getPlayer();
        this.f20016b = player;
        this.f20017c = ajjVar;
        this.f20018d = ajxVar;
        this.f20019e = str;
        aii aiiVar = new aii();
        this.f20020f = aiiVar;
        aiiVar.a(this);
        player.addCallback(aiiVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aih
    public final void a(ajp ajpVar, ajq ajqVar) {
        this.f20018d.o(new ajr(ajpVar, ajqVar, "*"));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aih
    public final void b(ajq ajqVar, AdMediaInfo adMediaInfo, Object obj) {
        ajp ajpVar = (ajp) this.f20021g.g().get(adMediaInfo);
        if (ajpVar != null) {
            this.f20018d.o(new ajr(ajpVar, ajqVar, this.f20019e, obj));
            return;
        }
        com.google.ads.interactivemedia.v3.impl.data.m.d("The adMediaInfo for the " + String.valueOf(ajqVar) + " event is not active. This may occur if callbacks are triggered after the ad is unloaded.");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akw
    public final void c() {
        com.google.ads.interactivemedia.v3.impl.data.m.c("Destroying NativeVideoDisplay");
        this.f20016b.removeCallback(this.f20020f);
        this.f20016b.release();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akw
    public final void d() {
    }

    public final void e() {
        this.f20020f.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akw
    public final void f(ajp ajpVar, ajq ajqVar, com.google.ads.interactivemedia.v3.impl.data.bm bmVar) {
        AdMediaInfo adMediaInfo = (AdMediaInfo) this.f20021g.get(ajpVar);
        ajq ajqVar2 = ajq.activate;
        int iOrdinal = ajqVar.ordinal();
        if (iOrdinal != 34) {
            if (iOrdinal == 43) {
                if (bmVar == null || bmVar.videoUrl == null) {
                    this.f20017c.c(new aif(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Load message must contain video url.")));
                    return;
                }
                this.f20020f.b();
                AdMediaInfo adMediaInfo2 = new AdMediaInfo(bmVar.videoUrl);
                if (bmVar.adPodInfo == null) {
                }
                this.f20021g.put(ajpVar, adMediaInfo2);
                VideoAdPlayer videoAdPlayer = this.f20016b;
                TryRoom.DianePie();
                return;
            }
            if (iOrdinal != 72) {
                if (iOrdinal == 52) {
                    this.f20016b.pauseAd(adMediaInfo);
                    return;
                } else {
                    if (iOrdinal != 53) {
                        return;
                    }
                    this.f20016b.playAd(adMediaInfo);
                    this.f20020f.b();
                    return;
                }
            }
        }
        this.f20016b.stopAd(adMediaInfo);
        this.f20021g.remove(ajpVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akw
    public final void g(ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData) {
        if (!(this.f20016b instanceof ResizablePlayer)) {
            com.google.ads.interactivemedia.v3.impl.data.m.a("Video player does not support resizing.");
            return;
        }
        if (!com.google.ads.interactivemedia.v3.impl.data.v.a(this.f20015a, resizeAndPositionVideoMsgData)) {
            com.google.ads.interactivemedia.v3.impl.data.m.a("Creative resize parameters were not within the containers bounds.");
            return;
        }
        int width = this.f20015a.getAdContainer().getWidth();
        int height = this.f20015a.getAdContainer().getHeight();
        int iIntValue = resizeAndPositionVideoMsgData.x().intValue();
        int iIntValue2 = resizeAndPositionVideoMsgData.width().intValue();
        int iIntValue3 = resizeAndPositionVideoMsgData.y().intValue();
        ((ResizablePlayer) this.f20016b).resize(resizeAndPositionVideoMsgData.x().intValue(), resizeAndPositionVideoMsgData.y().intValue(), (width - iIntValue) - iIntValue2, (height - iIntValue3) - resizeAndPositionVideoMsgData.height().intValue());
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.AdProgressProvider
    public final VideoProgressUpdate getAdProgress() {
        return this.f20016b.getAdProgress();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akw
    public final void h() {
        VideoAdPlayer videoAdPlayer = this.f20016b;
        if (videoAdPlayer instanceof ResizablePlayer) {
            ((ResizablePlayer) videoAdPlayer).resize(0, 0, 0, 0);
        }
    }

    public final boolean i() {
        return this.f20016b instanceof ald;
    }
}
