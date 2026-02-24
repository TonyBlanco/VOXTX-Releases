package com.nst.iptvsmarterstvbox.view.activity;

import W7.f;
import a7.g;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.pierfrancescosoffritti.youtubeplayer.player.YouTubePlayerView;
import m7.AbstractC2237a;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class YouTubePlayerActivity extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RelativeLayout f33554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppCompatImageView f33555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AppCompatImageView f33556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public YouTubePlayerView f33557g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public W7.c f33559i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Handler f33562l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f33558h = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f33560j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f33561k = false;

    public class a implements f {

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.activity.YouTubePlayerActivity$a$a, reason: collision with other inner class name */
        public class C0281a extends W7.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ W7.c f33564a;

            public C0281a(W7.c cVar) {
                this.f33564a = cVar;
            }

            @Override // W7.a, W7.g
            public void h(int i9) {
                if (i9 == 0) {
                    YouTubePlayerActivity.this.finish();
                }
                if (i9 == 1) {
                    YouTubePlayerActivity.this.f33560j = true;
                    YouTubePlayerActivity.this.f33561k = false;
                }
                if (i9 == 2) {
                    YouTubePlayerActivity.this.f33561k = false;
                    YouTubePlayerActivity.this.f33560j = false;
                }
            }

            @Override // W7.a, W7.g
            public void l() {
                String str = YouTubePlayerActivity.this.f33558h;
                YouTubePlayerActivity.this.f33559i = this.f33564a;
                if (str == null || str.isEmpty()) {
                    return;
                }
                YouTubePlayerActivity.this.findViewById(a7.f.f12120D3).setVisibility(4);
                YouTubePlayerActivity.this.findViewById(a7.f.f12110C3).setVisibility(0);
                this.f33564a.d(str, 0.0f);
                YouTubePlayerActivity.this.f33560j = true;
            }

            @Override // W7.a, W7.g
            public void onError(int i9) {
            }
        }

        public a() {
        }

        @Override // W7.f
        public void a(W7.c cVar) {
            cVar.b(new C0281a(cVar));
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            YouTubePlayerActivity.this.findViewById(a7.f.f12484o2).setVisibility(4);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            YouTubePlayerActivity.this.findViewById(a7.f.f12484o2).setVisibility(4);
        }
    }

    private void y1() {
        this.f33554d = (RelativeLayout) findViewById(a7.f.f12484o2);
        this.f33555e = (AppCompatImageView) findViewById(a7.f.f12110C3);
        this.f33556f = (AppCompatImageView) findViewById(a7.f.f12120D3);
    }

    @Override // androidx.appcompat.app.b, D.AbstractActivityC0525h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return keyCode == 23 ? keyEvent.getAction() == 0 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent) : super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        W7.c cVar;
        AppCompatImageView appCompatImageView;
        int id = view.getId();
        if (id == a7.f.f12120D3) {
            W7.c cVar2 = this.f33559i;
            if (cVar2 == null) {
                return;
            }
            cVar2.play();
            findViewById(a7.f.f12120D3).setVisibility(4);
            findViewById(a7.f.f12110C3).setVisibility(0);
            this.f33556f.clearFocus();
            appCompatImageView = this.f33555e;
        } else {
            if (id != a7.f.f12110C3 || (cVar = this.f33559i) == null) {
                return;
            }
            cVar.pause();
            findViewById(a7.f.f12120D3).setVisibility(0);
            findViewById(a7.f.f12110C3).setVisibility(4);
            this.f33555e.clearFocus();
            appCompatImageView = this.f33556f;
        }
        appCompatImageView.requestFocus();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12646H1);
        y1();
        this.f33557g = (YouTubePlayerView) findViewById(a7.f.Xm);
        this.f33557g.addView(getLayoutInflater().inflate(g.f12785d5, (ViewGroup) null));
        this.f33556f = (AppCompatImageView) findViewById(a7.f.f12120D3);
        this.f33555e = (AppCompatImageView) findViewById(a7.f.f12110C3);
        findViewById(a7.f.f12120D3).setOnClickListener(this);
        findViewById(a7.f.f12110C3).setOnClickListener(this);
        z1();
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        YouTubePlayerView youTubePlayerView = this.f33557g;
        if (youTubePlayerView != null) {
            youTubePlayerView.release();
        }
    }

    @Override // androidx.appcompat.app.b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        keyEvent.getRepeatCount();
        keyEvent.getAction();
        if (i9 == 23 || i9 == 66 || i9 == 166 || i9 == 167) {
            return true;
        }
        return super.onKeyDown(i9, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        AppCompatImageView appCompatImageView;
        W7.c cVar;
        keyEvent.getRepeatCount();
        if (i9 != 23 && i9 != 66) {
            return super.onKeyUp(i9, keyEvent);
        }
        findViewById(a7.f.f12484o2).setVisibility(0);
        if (findViewById(a7.f.f12484o2).getVisibility() == 0) {
            if (!this.f33560j || (cVar = this.f33559i) == null) {
                W7.c cVar2 = this.f33559i;
                if (cVar2 != null) {
                    this.f33560j = true;
                    cVar2.play();
                    findViewById(a7.f.f12120D3).setVisibility(4);
                    findViewById(a7.f.f12110C3).setVisibility(0);
                    this.f33555e.requestFocus();
                    appCompatImageView = this.f33556f;
                }
            } else {
                this.f33560j = false;
                cVar.pause();
                findViewById(a7.f.f12120D3).setVisibility(0);
                findViewById(a7.f.f12110C3).setVisibility(4);
                this.f33556f.requestFocus();
                appCompatImageView = this.f33555e;
            }
            appCompatImageView.clearFocus();
        }
        this.f33562l.removeCallbacksAndMessages(null);
        this.f33562l.postDelayed(new c(), 2000L);
        return true;
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    public final void z1() {
        this.f33562l = new Handler();
        this.f33557g.getPlayerUIController();
        Intent intent = getIntent();
        if (intent != null) {
            this.f33558h = intent.getStringExtra("you_tube_trailer");
        }
        this.f33557g.getPlayerUIController().a(false);
        if (new C2858a(this).A().equals(AbstractC2237a.f44453K0)) {
            this.f33557g.getPlayerUIController().o(false);
        } else {
            this.f33557g.getPlayerUIController().o(true);
        }
        this.f33557g.getPlayerUIController().b(false);
        this.f33557g.getPlayerUIController().m(true);
        this.f33557g.m(new a(), true);
        this.f33562l.removeCallbacksAndMessages(null);
        this.f33562l.postDelayed(new b(), 2000L);
    }
}
