package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import a7.f;
import a7.g;
import a7.j;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.appcompat.app.b;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;
import java.util.Calendar;
import m7.w;

/* JADX INFO: loaded from: classes.dex */
public class BuyNowActivity extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WebView f28116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f28117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f28118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f28119g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ProgressDialog f28122j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Context f28123k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f28120h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f28121i = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f28124l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f28125m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f28126n = "";

    public class CountDownRunner implements Runnable {
        public CountDownRunner() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    BuyNowActivity.this.w1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Intent intent = new Intent(this, (Class<?>) ServicesDashboardActivity.class);
        intent.setFlags(67141632);
        intent.setAction("check_buy_now");
        startActivity(intent);
        finish();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12846o);
        this.f28116d = (WebView) findViewById(f.Vm);
        this.f28117e = (TextView) findViewById(f.f12129E2);
        this.f28118f = (TextView) findViewById(f.gh);
        TextView textView = (TextView) findViewById(f.fm);
        this.f28119g = textView;
        textView.setText(getResources().getString(j.f13216c));
        Intent intent = getIntent();
        this.f28124l = intent.getAction();
        new Thread(new CountDownRunner()).start();
        this.f28123k = this;
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f28122j = progressDialog;
        progressDialog.setMessage(this.f28123k.getResources().getString(j.f13412v5));
        this.f28122j.show();
        this.f28122j.setCancelable(false);
        Context context = this.f28123k;
        if (context != null) {
            this.f28122j.setMessage(context.getResources().getString(j.f13412v5));
        }
        this.f28116d.getSettings().setJavaScriptEnabled(true);
        this.f28116d.getSettings().setLoadWithOverviewMode(true);
        this.f28116d.getSettings().setUseWideViewPort(true);
        this.f28116d.setWebViewClient(new WebViewClient() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.BuyNowActivity.1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                BuyNowActivity.this.f28122j.dismiss();
                BuyNowActivity.this.f28116d.setVisibility(0);
            }
        });
        String str = this.f28124l;
        if (str == null || !str.equalsIgnoreCase("Invoice_action")) {
            this.f28121i = intent.getStringExtra("service_id");
            v1();
        } else {
            this.f28126n = intent.getStringExtra("status");
            this.f28125m = intent.getStringExtra("invoice_id");
            u1();
        }
    }

    public final void u1() {
        if (this.f28125m != null) {
            this.f28116d.loadUrl("https://cms.alldrama.tv/viewinvoice.php?id=" + this.f28125m + "&loginemail=" + ClientSharepreferenceHandler.c(this.f28123k) + "&api_username=OUBQqC6334OcxjS&gotourl=viewinvoice.php?id=" + this.f28125m);
        }
    }

    public final void v1() {
        this.f28116d.loadUrl("http://51.75.16.104/upgrade.php?type=package&id=" + this.f28121i + "&loginemail=" + ClientSharepreferenceHandler.c(this) + "&api_username=OUBQqC6334OcxjS&gotourl=upgrade.php");
    }

    public void w1() {
        runOnUiThread(new Runnable() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.BuyNowActivity.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String string = Calendar.getInstance().getTime().toString();
                    String strR = w.R(BuyNowActivity.this.f28123k);
                    String strA = w.A(string);
                    TextView textView = BuyNowActivity.this.f28118f;
                    if (textView != null) {
                        textView.setText(strR);
                    }
                    TextView textView2 = BuyNowActivity.this.f28117e;
                    if (textView2 != null) {
                        textView2.setText(strA);
                    }
                } catch (Exception unused) {
                }
            }
        });
    }
}
