package com.google.ads.interactivemedia.v3.api.player;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface VideoStreamPlayer extends ContentProgressProvider, VolumeProvider {

    public interface VideoStreamPlayerCallback {
        void onContentComplete();

        void onPause();

        void onResume();

        void onUserTextReceived(String str);

        void onVolumeChanged(int i9);
    }

    void addCallback(VideoStreamPlayerCallback videoStreamPlayerCallback);

    void loadUrl(String str, List<HashMap<String, String>> list);

    void onAdBreakEnded();

    void onAdBreakStarted();

    void onAdPeriodEnded();

    void onAdPeriodStarted();

    void pause();

    void removeCallback(VideoStreamPlayerCallback videoStreamPlayerCallback);

    void resume();

    void seek(long j9);
}
