package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.StreamRequest;
import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import java.util.List;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
final class aio implements ajt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ aiq f19862a;

    public aio(aiq aiqVar) {
        this.f19862a = aiqVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajt
    public final void a(String str, AdError.AdErrorType adErrorType, int i9, String str2) {
        this.f19862a.f19867e.c(new aif(new AdError(adErrorType, i9, str2), this.f19862a.f19869g.get(str) != null ? ((AdsRequest) this.f19862a.f19869g.get(str)).getUserRequestContext() : this.f19862a.f19870h.get(str) != null ? ((StreamRequest) this.f19862a.f19870h.get(str)).getUserRequestContext() : new Object()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajt
    public final void b(String str, List list, SortedSet sortedSet, boolean z9) {
        aiq aiqVar = this.f19862a;
        AdDisplayContainer adDisplayContainer = (AdDisplayContainer) aiqVar.f19873k;
        AdsRequest adsRequest = (AdsRequest) aiqVar.f19869g.get(str);
        if (adsRequest == null) {
            this.f19862a.f19867e.c(new aif(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Request not found for session id: ".concat(String.valueOf(str))), new Object()));
            return;
        }
        ContentProgressProvider contentProgressProvider = adsRequest.getContentProgressProvider();
        AdError adError = null;
        akq akqVar = contentProgressProvider != null ? new akq(contentProgressProvider) : null;
        this.f19862a.f19871i.e(((aiw) adsRequest).h());
        if (sortedSet != null && !sortedSet.isEmpty() && akqVar == null) {
            adError = new AdError(AdError.AdErrorType.PLAY, AdError.AdErrorCode.PLAYLIST_NO_CONTENT_TRACKING, "Unable to handle cue points, no content progress provider configured.");
        }
        if (adError != null) {
            this.f19862a.f19867e.c(new aif(adError, adsRequest.getUserRequestContext()));
        } else {
            aiq aiqVar2 = this.f19862a;
            aiq.j(aiqVar2, new ais(new air(str, aiqVar2.f19865c, adDisplayContainer, akqVar, list, sortedSet, aiqVar2.f19871i, new ajj(), this.f19862a.f19864b, z9), adsRequest.getUserRequestContext()));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajt
    public final void c(String str, String str2, boolean z9) {
        aiq aiqVar = this.f19862a;
        StreamDisplayContainer streamDisplayContainer = (StreamDisplayContainer) aiqVar.f19873k;
        StreamRequest streamRequest = (StreamRequest) aiqVar.f19870h.get(str);
        aiq aiqVar2 = this.f19862a;
        if (streamRequest == null) {
            aiqVar2.f19867e.c(new aif(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Request not found for session id: ".concat(String.valueOf(str))), new Object()));
            return;
        }
        aiqVar2.f19871i.e(streamRequest.getContentUrl());
        this.f19862a.f19871i.i();
        aiq aiqVar3 = this.f19862a;
        ajx ajxVar = aiqVar3.f19865c;
        String manifestSuffix = streamRequest.getManifestSuffix();
        akn aknVar = this.f19862a.f19871i;
        ajj ajjVar = new ajj();
        aiq.j(aiqVar3, new ais(new aks(str, ajxVar, streamDisplayContainer, new akv(str, ajxVar, ajjVar, streamDisplayContainer, manifestSuffix), new aid(str, ajxVar, streamDisplayContainer.getAdContainer()), aknVar, ajjVar, this.f19862a.f19864b, str2, z9), streamRequest.getUserRequestContext()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajt
    public final void d(String str, AdError.AdErrorType adErrorType, AdError.AdErrorCode adErrorCode) {
        this.f19862a.f19867e.c(new aif(new AdError(adErrorType, adErrorCode, "adsLoaded message did not contain cue points."), this.f19862a.f19869g.get(str) != null ? ((AdsRequest) this.f19862a.f19869g.get(str)).getUserRequestContext() : this.f19862a.f19870h.get(str) != null ? ((StreamRequest) this.f19862a.f19870h.get(str)).getUserRequestContext() : new Object()));
    }
}
