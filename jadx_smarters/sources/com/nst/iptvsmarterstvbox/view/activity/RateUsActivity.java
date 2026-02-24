package com.nst.iptvsmarterstvbox.view.activity;

import a7.f;
import a7.g;
import a7.j;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import java.util.Calendar;
import m7.AbstractC2237a;
import m7.w;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class RateUsActivity extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Button f31486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Button f31487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f31488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f31489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f31490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f31491i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C2858a f31492j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Thread f31493k = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(RateUsActivity.this.f31491i);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = w.R(RateUsActivity.this.f31491i);
                String strA = w.A(string);
                TextView textView = RateUsActivity.this.f31489g;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = RateUsActivity.this.f31488f;
                if (textView2 != null) {
                    textView2.setText(strA);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    RateUsActivity.this.u1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != f.f12462m1) {
            if (id == f.f12382e1) {
                SharepreferenceDBHandler.setRateUsCount(0, this.f31491i);
                onBackPressed();
                return;
            }
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName()));
            SharepreferenceDBHandler.setRateUsDontaskagain(true, this.f31491i);
            startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(this.f31491i, getResources().getString(j.f13084O0), 0).show();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f31491i = this;
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f31491i);
        this.f31492j = c2858a;
        setContentView(c2858a.A().equals(AbstractC2237a.f44453K0) ? g.f12889v0 : g.f12883u0);
        this.f31486d = (Button) findViewById(f.f12462m1);
        this.f31487e = (Button) findViewById(f.f12382e1);
        this.f31488f = (TextView) findViewById(f.f12129E2);
        this.f31489g = (TextView) findViewById(f.gh);
        this.f31490h = (ImageView) findViewById(f.Xa);
        this.f31486d.setOnClickListener(this);
        this.f31487e.setOnClickListener(this);
        Button button = this.f31486d;
        button.setOnFocusChangeListener(new w.k((View) button, this));
        this.f31486d.requestFocus();
        this.f31486d.requestFocusFromTouch();
        Button button2 = this.f31487e;
        button2.setOnFocusChangeListener(new w.k((View) button2, this));
        Thread thread = this.f31493k;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new c());
            this.f31493k = thread2;
            thread2.start();
        }
        this.f31490h.setOnClickListener(new a());
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f31493k;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f31493k.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f31493k;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new c());
            this.f31493k = thread2;
            thread2.start();
        }
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    public void u1() {
        runOnUiThread(new b());
    }
}
