package com.nst.iptvsmarterstvbox.model;

import W7.c;
import android.view.View;
import android.widget.Button;
import com.pierfrancescosoffritti.youtubeplayer.player.YouTubePlayerView;

/* JADX INFO: loaded from: classes.dex */
public class CustomUIController {
    private Button playPauseButton;
    private View playerUI;
    private boolean playing = false;
    private c youTubePlayer;
    private YouTubePlayerView youTubePlayerView;

    public CustomUIController(View view, c cVar, YouTubePlayerView youTubePlayerView) {
        this.playerUI = view;
        this.youTubePlayer = cVar;
        this.youTubePlayerView = youTubePlayerView;
        initViews(view);
    }

    private void initViews(View view) {
    }
}
