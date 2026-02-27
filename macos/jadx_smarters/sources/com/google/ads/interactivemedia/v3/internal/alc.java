package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.ads.interactivemedia.v3.api.AdPodInfo;
import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.ResizablePlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes3.dex */
public final class alc implements VideoAdPlayer, ResizablePlayer, ald, aky {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hn f20107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SurfaceView f20108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aew f20109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FrameLayout f20110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ViewGroup f20111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f20112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashSet f20113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final akz f20114h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ala f20115i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final alb f20116j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList f20117k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final df f20118l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private sp f20119m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AdPodInfo f20120n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f20121o;

    public alc(Context context, ViewGroup viewGroup) {
        hn hnVarA = hm.a(new fa(context, new ale(context)));
        this.f20117k = new ArrayList();
        this.f20111e = viewGroup;
        this.f20107a = hnVarA;
        String strAs = cq.as(context);
        dg dgVar = new dg();
        dgVar.b(strAs);
        this.f20118l = new df(context, dgVar);
        this.f20112f = new ArrayList(1);
        ala alaVar = new ala(this);
        this.f20115i = alaVar;
        this.f20113g = axo.d(4);
        alb albVar = new alb(this);
        this.f20116j = albVar;
        akz akzVar = new akz();
        this.f20114h = akzVar;
        akzVar.b(this);
        hnVarA.x(alaVar);
        hnVarA.y(albVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f20110d = frameLayout;
        frameLayout.setBackgroundColor(DefaultRenderer.BACKGROUND_COLOR);
        aew aewVar = new aew(context);
        this.f20109c = aewVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        aewVar.setLayoutParams(layoutParams);
        this.f20121o = 1;
        SurfaceView surfaceView = new SurfaceView(context);
        this.f20108b = surfaceView;
        surfaceView.setZOrderMediaOverlay(true);
        hnVarA.F(surfaceView);
        aewVar.addView(surfaceView);
        frameLayout.addView(aewVar);
        viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
    }

    private final int i(AdMediaInfo adMediaInfo) {
        return this.f20117k.indexOf(adMediaInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdMediaInfo j(int i9) {
        if (i9 < 0 || i9 >= this.f20117k.size()) {
            return null;
        }
        return (AdMediaInfo) this.f20117k.get(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdMediaInfo k() {
        int iH = this.f20107a.h();
        if (this.f20119m == null) {
            return null;
        }
        return j(iH);
    }

    private final void l(AdMediaInfo adMediaInfo) {
        tg tgVarA;
        Uri uri = Uri.parse(adMediaInfo.getUrl());
        ai aiVarA = ai.a(uri);
        int iM = cq.m(uri);
        if (iM == 0) {
            tgVarA = new lc(this.f20118l).a(aiVarA);
        } else if (iM == 2) {
            tgVarA = new pb(this.f20118l).a(aiVarA);
        } else {
            if (iM != 4) {
                throw new IllegalStateException("Unsupported type: " + iM);
            }
            tgVarA = new tx(this.f20118l, new xv(new zl(1, null)), null, null).a(aiVarA);
        }
        sp spVar = this.f20119m;
        atp.k(spVar);
        spVar.m(tgVarA);
        this.f20117k.add(adMediaInfo);
    }

    private final void m() {
        this.f20110d.setVisibility(8);
        this.f20108b.setVisibility(4);
        this.f20119m = null;
        this.f20114h.d();
        this.f20121o = 1;
        this.f20107a.G();
        this.f20107a.H();
        this.f20113g.clear();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aky
    public final void a() {
        AdMediaInfo adMediaInfoK = k();
        VideoProgressUpdate adProgress = getAdProgress();
        Iterator it = this.f20112f.iterator();
        while (it.hasNext()) {
            ((VideoAdPlayer.VideoAdPlayerCallback) it.next()).onAdProgress(adMediaInfoK, adProgress);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
    public final void addCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
        this.f20112f.add(videoAdPlayerCallback);
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.AdProgressProvider
    public final VideoProgressUpdate getAdProgress() {
        return ((this.f20107a.j() == 2 || this.f20107a.j() == 3) && this.f20107a.v() > 0) ? new VideoProgressUpdate(this.f20107a.m(), this.f20107a.v()) : VideoProgressUpdate.VIDEO_TIME_NOT_READY;
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VolumeProvider
    public final int getVolume() {
        return 100;
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
    public final void loadAd(AdMediaInfo adMediaInfo, AdPodInfo adPodInfo) {
        if (this.f20119m != null) {
            AdPodInfo adPodInfo2 = this.f20120n;
            if (adPodInfo2 == null || adPodInfo == null || adPodInfo2.getPodIndex() != adPodInfo.getPodIndex()) {
                throw new IllegalStateException("Called loadAd on an ad from a different ad break.");
            }
            l(adMediaInfo);
            return;
        }
        this.f20107a.G();
        hn hnVar = this.f20107a;
        hnVar.u(hnVar.h());
        this.f20117k.clear();
        this.f20119m = new sp(new ui(), new tg[0]);
        this.f20120n = adPodInfo;
        l(adMediaInfo);
        this.f20107a.D(false);
        this.f20107a.z(this.f20119m);
        this.f20121o = 2;
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
    public final void pauseAd(AdMediaInfo adMediaInfo) {
        this.f20114h.d();
        this.f20121o = 4;
        this.f20107a.D(false);
        Iterator it = this.f20112f.iterator();
        while (it.hasNext()) {
            ((VideoAdPlayer.VideoAdPlayerCallback) it.next()).onPause(adMediaInfo);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
    public final void playAd(AdMediaInfo adMediaInfo) {
        if (this.f20119m == null || !this.f20117k.contains(adMediaInfo)) {
            throw new IllegalStateException("Call to playAd without appropriate call to loadAd first.");
        }
        this.f20110d.setVisibility(0);
        this.f20108b.setVisibility(0);
        int i9 = this.f20121o;
        int i10 = i9 - 1;
        if (i9 == 0) {
            throw null;
        }
        if (i10 == 0) {
            throw new IllegalStateException("Call to playAd when player state is not LOADED.");
        }
        if (i10 == 1) {
            Iterator it = this.f20112f.iterator();
            while (it.hasNext()) {
                ((VideoAdPlayer.VideoAdPlayerCallback) it.next()).onPlay(adMediaInfo);
            }
            this.f20107a.E(this.f20108b.getHolder());
        } else {
            if (i10 == 2) {
                return;
            }
            if (i10 == 3) {
                Iterator it2 = this.f20112f.iterator();
                while (it2.hasNext()) {
                    ((VideoAdPlayer.VideoAdPlayerCallback) it2.next()).onResume(adMediaInfo);
                }
            }
        }
        this.f20114h.c();
        this.f20121o = 3;
        this.f20107a.D(true);
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
    public final void release() {
        m();
        this.f20107a.B(this.f20115i);
        this.f20107a.C(this.f20116j);
        this.f20107a.A();
        this.f20114h.d();
        this.f20111e.removeView(this.f20110d);
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
    public final void removeCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
        this.f20112f.remove(videoAdPlayerCallback);
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.ResizablePlayer
    public final void resize(int i9, int i10, int i11, int i12) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((this.f20111e.getWidth() - i9) - i11, (this.f20111e.getHeight() - i10) - i12);
        layoutParams.leftMargin = i9;
        layoutParams.topMargin = i10;
        this.f20109c.setLayoutParams(layoutParams);
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
    public final void stopAd(AdMediaInfo adMediaInfo) {
        if (this.f20119m == null) {
            Log.e("IMASDK", "Attempting to stop when no current ad source");
            return;
        }
        this.f20113g.add(adMediaInfo);
        int i9 = i(adMediaInfo);
        int iH = this.f20107a.h();
        if (i9 == iH) {
            if (i(adMediaInfo) == this.f20117k.size() - 1) {
                m();
                return;
            } else {
                this.f20107a.u(this.f20107a.h() + 1);
                return;
            }
        }
        if (i9 > iH) {
            int i10 = i(adMediaInfo);
            sp spVar = this.f20119m;
            atp.k(spVar);
            spVar.O(i10);
            this.f20117k.remove(adMediaInfo);
        }
    }
}
