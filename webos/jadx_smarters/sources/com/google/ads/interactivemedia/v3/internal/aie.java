package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final class aie extends ajb implements AdDisplayContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private VideoAdPlayer f19828a;

    public aie(Context context, VideoAdPlayer videoAdPlayer) {
        this(new aix(context), videoAdPlayer);
    }

    public aie(ViewGroup viewGroup, VideoAdPlayer videoAdPlayer) {
        super(viewGroup);
        this.f19828a = videoAdPlayer;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdDisplayContainer
    public final VideoAdPlayer getPlayer() {
        return this.f19828a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdDisplayContainer
    public final void setPlayer(VideoAdPlayer videoAdPlayer) {
        atp.k(videoAdPlayer);
        this.f19828a = videoAdPlayer;
    }
}
