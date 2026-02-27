package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import com.TryRoom;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.player.ResizablePlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer;
import com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class akv implements VideoStreamPlayer.VideoStreamPlayerCallback, akw, akp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoStreamPlayer f20068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ajx f20069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ajj f20070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f20072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f20073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final StreamDisplayContainer f20074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final akq f20075h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final aeq f20076i;

    public akv(String str, ajx ajxVar, ajj ajjVar, StreamDisplayContainer streamDisplayContainer, String str2) {
        akq akqVar = new akq(streamDisplayContainer.getVideoStreamPlayer());
        aeq aeqVar = new aeq(ajxVar.a(), streamDisplayContainer.getAdContainer());
        this.f20071d = false;
        this.f20068a = streamDisplayContainer.getVideoStreamPlayer();
        this.f20070c = ajjVar;
        this.f20072e = str;
        this.f20069b = ajxVar;
        this.f20073f = str2;
        this.f20071d = false;
        this.f20074g = streamDisplayContainer;
        this.f20075h = akqVar;
        this.f20076i = aeqVar;
    }

    private final void o(ajq ajqVar, Object obj) {
        this.f20069b.o(new ajr(ajp.videoDisplay1, ajqVar, this.f20072e, obj));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akp
    public final void a(VideoProgressUpdate videoProgressUpdate) {
        if (!this.f20071d) {
            o(ajq.start, com.google.ads.interactivemedia.v3.impl.data.cf.builder().volumePercentage(this.f20068a.getVolume()).build());
            this.f20071d = true;
        }
        o(ajq.timeupdate, com.google.ads.interactivemedia.v3.impl.data.bz.create(videoProgressUpdate));
    }

    public final void b() {
        this.f20068a.onAdBreakEnded();
        n();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akw
    public final void c() {
        com.google.ads.interactivemedia.v3.impl.data.m.c("Destroying StreamVideoDisplay");
        this.f20068a.removeCallback(this);
        this.f20075h.e();
        this.f20075h.c(this);
        this.f20076i.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akw
    public final void d() {
        this.f20075h.b(this);
        this.f20075h.d();
    }

    public final void e() {
        this.f20068a.onAdBreakStarted();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akw
    public final void f(ajp ajpVar, ajq ajqVar, com.google.ads.interactivemedia.v3.impl.data.bm bmVar) {
        String str;
        ajq ajqVar2 = ajq.activate;
        int iOrdinal = ajqVar.ordinal();
        if (iOrdinal != 45) {
            if (iOrdinal == 52) {
                this.f20068a.pause();
                return;
            } else {
                if (iOrdinal != 53) {
                    return;
                }
                this.f20068a.resume();
                return;
            }
        }
        if (bmVar == null || (str = bmVar.streamUrl) == null) {
            this.f20070c.c(new aif(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Load message must contain video url.")));
            return;
        }
        int i9 = 0;
        this.f20071d = false;
        String str2 = this.f20073f;
        if (str2 != null && str2.length() != 0) {
            String string = "";
            String strReplaceAll = this.f20073f.trim().replaceAll("\\s+", "");
            if (strReplaceAll.charAt(0) == '?') {
                strReplaceAll = strReplaceAll.substring(1);
            }
            if (strReplaceAll.length() != 0) {
                Map mapA = com.google.ads.interactivemedia.v3.impl.data.aj.a(Uri.parse(str));
                HashMap map = new HashMap();
                Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
                builderBuildUpon.clearQuery();
                Map mapA2 = com.google.ads.interactivemedia.v3.impl.data.aj.a(Uri.parse("http://www.dom.com/path?".concat(strReplaceAll)));
                map.putAll(mapA2);
                if (!mapA.isEmpty()) {
                    for (String str3 : mapA.keySet()) {
                        if (!mapA2.containsKey(str3)) {
                            map.put(str3, (String) mapA.get(str3));
                        }
                    }
                }
                if (!map.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    for (Map.Entry entry : map.entrySet()) {
                        String str4 = (String) entry.getKey();
                        String str5 = (String) entry.getValue();
                        sb.append(str4);
                        sb.append("=");
                        sb.append(str5);
                        if (i9 < map.size() - 1) {
                            sb.append("&");
                        }
                        i9++;
                    }
                    string = sb.toString();
                }
                builderBuildUpon.encodedQuery(string);
                builderBuildUpon.build().toString();
            }
        }
        VideoStreamPlayer videoStreamPlayer = this.f20068a;
        List<HashMap<String, String>> list = bmVar.subtitles;
        TryRoom.DianePie();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akw
    public final void g(ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData) {
        if (!(this.f20068a instanceof ResizablePlayer)) {
            com.google.ads.interactivemedia.v3.impl.data.m.a("Stream player does not support resizing.");
            return;
        }
        if (!com.google.ads.interactivemedia.v3.impl.data.v.a(this.f20074g, resizeAndPositionVideoMsgData)) {
            com.google.ads.interactivemedia.v3.impl.data.m.a("Video resize parameters were not within the container bounds.");
            return;
        }
        int width = this.f20074g.getAdContainer().getWidth();
        int height = this.f20074g.getAdContainer().getHeight();
        int iIntValue = resizeAndPositionVideoMsgData.x().intValue();
        int iIntValue2 = resizeAndPositionVideoMsgData.width().intValue();
        int iIntValue3 = resizeAndPositionVideoMsgData.y().intValue();
        ((ResizablePlayer) this.f20068a).resize(resizeAndPositionVideoMsgData.x().intValue(), resizeAndPositionVideoMsgData.y().intValue(), (width - iIntValue) - iIntValue2, (height - iIntValue3) - resizeAndPositionVideoMsgData.height().intValue());
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.AdProgressProvider
    public final VideoProgressUpdate getAdProgress() {
        return this.f20068a.getContentProgress();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akw
    public final void h() {
        VideoStreamPlayer videoStreamPlayer = this.f20068a;
        if (videoStreamPlayer instanceof ResizablePlayer) {
            ((ResizablePlayer) videoStreamPlayer).resize(0, 0, 0, 0);
        }
    }

    public final void i() {
        this.f20068a.onAdPeriodEnded();
    }

    public final void j() {
        this.f20068a.onAdPeriodStarted();
    }

    public final void k() {
        this.f20068a.addCallback(this);
    }

    public final void l(long j9) {
        this.f20068a.seek(j9);
    }

    public final void m(com.google.ads.interactivemedia.v3.impl.data.c cVar) {
        if (cVar.isLinear()) {
            this.f20076i.d();
        }
    }

    public final void n() {
        this.f20076i.c();
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer.VideoStreamPlayerCallback
    public final void onContentComplete() {
        this.f20069b.o(new ajr(ajp.adsLoader, ajq.contentComplete, "*"));
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer.VideoStreamPlayerCallback
    public final void onPause() {
        o(ajq.pause, null);
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer.VideoStreamPlayerCallback
    public final void onResume() {
        o(ajq.play, null);
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer.VideoStreamPlayerCallback
    public final void onUserTextReceived(String str) {
        o(ajq.timedMetadata, aku.create(str));
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer.VideoStreamPlayerCallback
    public final void onVolumeChanged(int i9) {
        o(ajq.volumeChange, com.google.ads.interactivemedia.v3.impl.data.cf.builder().volumePercentage(i9).build());
    }
}
