package com.nst.iptvsmarterstvbox.view.activity;

import a7.f;
import a7.g;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel;
import java.util.ArrayList;
import java.util.Calendar;
import m7.w;
import q7.H;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class NewEPGActivity extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ProgressBar f31218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TabLayout f31219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ViewPager f31220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f31221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Toolbar f31222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AppBarLayout f31223i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f31224j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayout f31225k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f31226l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f31227m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f31228n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Context f31229o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SharedPreferences f31230p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f31231q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f31233s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C2858a f31237w;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f31232r = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f31234t = "";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f31235u = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f31236v = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Thread f31238x = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(NewEPGActivity.this.f31229o);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NewEPGActivity.this.onBackPressed();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = w.R(NewEPGActivity.this.f31229o);
                String strA = w.A(string);
                TextView textView = NewEPGActivity.this.f31227m;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = NewEPGActivity.this.f31226l;
                if (textView2 != null) {
                    textView2.setText(strA);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    NewEPGActivity.this.w1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    private void v1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    public void b() {
        ProgressBar progressBar = this.f31218d;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r4.f31236v == false) goto L7;
     */
    @Override // androidx.appcompat.app.b, D.AbstractActivityC0525h, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getAction()
            int r1 = r5.getKeyCode()
            r2 = 1
            switch(r1) {
                case 20: goto Ld;
                case 21: goto L35;
                case 22: goto L3a;
                default: goto Lc;
            }
        Lc:
            goto L3f
        Ld:
            boolean r1 = r4.f31236v
            if (r1 != 0) goto L26
        L11:
            android.widget.LinearLayout r5 = r4.f31225k
            r5.requestFocus()
            android.widget.LinearLayout r5 = r4.f31225k
            android.content.Context r0 = r4.f31229o
            int r1 = a7.c.f11861l
            android.graphics.drawable.Drawable r0 = E.b.getDrawable(r0, r1)
            r5.setBackground(r0)
            r4.f31236v = r2
            return r2
        L26:
            if (r0 != 0) goto L35
            android.widget.LinearLayout r0 = r4.f31225k
            android.content.Context r1 = r4.f31229o
            int r3 = a7.e.f11924I2
            android.graphics.drawable.Drawable r1 = E.b.getDrawable(r1, r3)
            r0.setBackground(r1)
        L35:
            boolean r0 = r4.f31236v
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r4.f31236v
            if (r0 != 0) goto L3f
            goto L11
        L3f:
            boolean r5 = super.dispatchKeyEvent(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.NewEPGActivity.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == f.Bj) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x1();
        setContentView(g.f12793f0);
        this.f31231q = (ImageView) findViewById(f.Xa);
        this.f31218d = (ProgressBar) findViewById(f.ec);
        this.f31219e = (TabLayout) findViewById(f.ig);
        this.f31220f = (ViewPager) findViewById(f.Om);
        this.f31221g = (TextView) findViewById(f.Bj);
        this.f31222h = (Toolbar) findViewById(f.kh);
        this.f31223i = (AppBarLayout) findViewById(f.f12303W);
        this.f31224j = (TextView) findViewById(f.Zh);
        this.f31225k = (LinearLayout) findViewById(f.f12561v8);
        this.f31226l = (TextView) findViewById(f.f12129E2);
        this.f31227m = (TextView) findViewById(f.gh);
        this.f31228n = (ImageView) findViewById(f.f12141F4);
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        v1();
        r1((Toolbar) findViewById(f.kh));
        Intent intent = getIntent();
        if (intent != null) {
            this.f31234t = intent.getStringExtra("category_id");
            String stringExtra = intent.getStringExtra("category_name");
            this.f31235u = stringExtra;
            TextView textView = this.f31224j;
            if (textView != null) {
                textView.setText(stringExtra);
            }
        }
        this.f31229o = this;
        C2858a c2858a = new C2858a(this);
        this.f31237w = c2858a;
        try {
            if (c2858a.x() != 3) {
                IjkMediaPlayer.loadLibrariesOnce(null);
                IjkMediaPlayer.native_profileBegin("libijkplayer.so");
            }
        } catch (Exception | UnsatisfiedLinkError unused) {
        }
        Thread thread = this.f31238x;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new d());
            this.f31238x = thread2;
            thread2.start();
        }
        y1();
        this.f31221g.setOnClickListener(this);
        this.f31221g.sendAccessibilityEvent(8);
        this.f31231q.setOnClickListener(new a());
        this.f31228n.setOnClickListener(new b());
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f31238x;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f31238x.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        x1();
        super.onResume();
        Thread thread = this.f31238x;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new d());
            this.f31238x = thread2;
            thread2.start();
        }
        w.m(this.f31229o);
        w.z0(this.f31229o);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f31230p = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f31230p.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f31229o != null) {
            b();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        x1();
    }

    public void w1() {
        runOnUiThread(new c());
    }

    public void x1() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    public final void y1() {
        ViewPager viewPager;
        if (this.f31229o != null) {
            this.f31233s = new ArrayList();
            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
            liveStreamCategoryIdDBModel.setLiveStreamCategoryID(this.f31234t);
            liveStreamCategoryIdDBModel.setLiveStreamCategoryName(this.f31235u);
            this.f31233s.add(liveStreamCategoryIdDBModel);
            ArrayList arrayList = this.f31233s;
            if (arrayList == null || (viewPager = this.f31220f) == null || this.f31219e == null) {
                return;
            }
            viewPager.setAdapter(new H(arrayList, getSupportFragmentManager(), this));
        }
    }
}
