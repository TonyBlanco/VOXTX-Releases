package com.nst.iptvsmarterstvbox.view.activity;

import a7.f;
import a7.g;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.VideoView;
import androidx.appcompat.app.b;

/* JADX INFO: loaded from: classes4.dex */
public class FrontView extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f29893d = false;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f29894a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f29895c;

        public a(View view, View view2) {
            this.f29894a = view;
            this.f29895c = view2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FrontView frontView;
            boolean z9 = false;
            if (FrontView.this.f29893d) {
                this.f29894a.setVisibility(0);
                DisplayMetrics displayMetrics = new DisplayMetrics();
                FrontView.this.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f29895c.getLayoutParams();
                float f9 = displayMetrics.density;
                layoutParams.width = (int) (200.0f * f9);
                layoutParams.height = (int) (150.0f * f9);
                layoutParams.leftMargin = (int) (20.0f * f9);
                layoutParams.topMargin = (int) (f9 * 50.0f);
                this.f29895c.setLayoutParams(layoutParams);
                frontView = FrontView.this;
            } else {
                this.f29894a.setVisibility(8);
                DisplayMetrics displayMetrics2 = new DisplayMetrics();
                FrontView.this.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics2);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f29895c.getLayoutParams();
                layoutParams2.width = displayMetrics2.widthPixels;
                layoutParams2.height = displayMetrics2.heightPixels;
                layoutParams2.leftMargin = 0;
                layoutParams2.topMargin = 0;
                this.f29895c.setLayoutParams(layoutParams2);
                frontView = FrontView.this;
                z9 = true;
            }
            frontView.f29893d = z9;
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12650I);
        View viewFindViewById = findViewById(f.f12496p4);
        View viewFindViewById2 = findViewById(f.f12498p6);
        VideoView videoView = (VideoView) findViewById(f.Im);
        videoView.setVideoURI(Uri.parse("https://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4"));
        videoView.start();
        viewFindViewById.setOnClickListener(new a(viewFindViewById2, viewFindViewById));
    }
}
