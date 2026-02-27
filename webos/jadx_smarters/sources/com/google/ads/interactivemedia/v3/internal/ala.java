package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;
import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class ala implements hw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ alc f20105a;

    public ala(alc alcVar) {
        this.f20105a = alcVar;
    }

    private final void j(AdMediaInfo adMediaInfo) {
        if (adMediaInfo == null || this.f20105a.f20113g.contains(adMediaInfo)) {
            return;
        }
        Iterator it = this.f20105a.f20112f.iterator();
        while (it.hasNext()) {
            ((VideoAdPlayer.VideoAdPlayerCallback) it.next()).onEnded(adMediaInfo);
        }
        this.f20105a.f20113g.add(adMediaInfo);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hw
    public final /* synthetic */ void a(hv hvVar, tb tbVar) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hw
    public final void b(hv hvVar, at atVar) {
        AdMediaInfo adMediaInfoJ = this.f20105a.j(hvVar.f23195c);
        this.f20105a.f20113g.add(adMediaInfoJ);
        Iterator it = this.f20105a.f20112f.iterator();
        while (it.hasNext()) {
            ((VideoAdPlayer.VideoAdPlayerCallback) it.next()).onError(adMediaInfoJ);
        }
        Log.e("IMASDK", "Player Error:".concat(String.valueOf(atVar)));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hw
    public final /* synthetic */ void c(hv hvVar, int i9, long j9) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hw
    public final /* synthetic */ void d(tb tbVar) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hw
    public final void e(int i9) {
        AdMediaInfo adMediaInfoK = this.f20105a.k();
        if (adMediaInfoK == null) {
            return;
        }
        if (i9 == 2) {
            Iterator it = this.f20105a.f20112f.iterator();
            while (it.hasNext()) {
                ((VideoAdPlayer.VideoAdPlayerCallback) it.next()).onBuffering(adMediaInfoK);
            }
        } else if (i9 != 3) {
            if (i9 != 4) {
                return;
            }
            j(adMediaInfoK);
        } else {
            Iterator it2 = this.f20105a.f20112f.iterator();
            while (it2.hasNext()) {
                ((VideoAdPlayer.VideoAdPlayerCallback) it2.next()).onLoaded(adMediaInfoK);
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hw
    public final void f(int i9) {
        if (i9 != 0) {
            return;
        }
        alc alcVar = this.f20105a;
        if (alcVar.f20119m == null) {
            Log.d("IMASDK", "Position discontinuity occurred when there is no active media source.");
            return;
        }
        int iH = alcVar.f20107a.h();
        for (int i10 = 0; i10 < iH; i10++) {
            j(this.f20105a.j(i10));
        }
        AdMediaInfo adMediaInfoJ = this.f20105a.j(iH);
        if (adMediaInfoJ != null) {
            for (VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback : this.f20105a.f20112f) {
                videoAdPlayerCallback.onLoaded(adMediaInfoJ);
                videoAdPlayerCallback.onPlay(adMediaInfoJ);
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hw
    public final /* synthetic */ void g(ep epVar) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hw
    public final /* synthetic */ void h(bl blVar) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hw
    public final /* synthetic */ void i(az azVar, aeq aeqVar) {
    }
}
