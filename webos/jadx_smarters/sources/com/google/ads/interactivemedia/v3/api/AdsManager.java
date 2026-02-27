package com.google.ads.interactivemedia.v3.api;

import com.google.android.gms.common.internal.Hide;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface AdsManager extends BaseManager {
    @Hide
    void clicked();

    void discardAdBreak();

    List<Float> getAdCuePoints();

    void pause();

    @Deprecated
    void requestNextAdBreak();

    void resume();

    void skip();

    void start();
}
