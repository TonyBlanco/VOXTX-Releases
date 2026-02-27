package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import a7.f;
import a7.g;
import a7.j;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.b;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;
import java.util.Calendar;
import m7.w;

/* JADX INFO: loaded from: classes.dex */
public class ShowserviceInformationActivity extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f28369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f28370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f28371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f28372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f28373h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f28374i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f28375j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f28376k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f28377l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Button f28378m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Button f28379n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f28380o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f28381p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Context f28382q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f28383r = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f28384s = "";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f28385t = "";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f28386u = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f28387v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f28388w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f28389x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f28390y = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Thread f28391z = null;

    public class CountDownRunner implements Runnable {
        public CountDownRunner() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    ShowserviceInformationActivity.this.u1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        TextView textView;
        String string;
        TextView textView2;
        String string2;
        TextView textView3;
        String string3;
        TextView textView4;
        String string4;
        TextView textView5;
        String string5;
        TextView textView6;
        String string6;
        TextView textView7;
        String string7;
        super.onCreate(bundle);
        setContentView(g.f12735W0);
        this.f28369d = (TextView) findViewById(f.fm);
        this.f28370e = (TextView) findViewById(f.Yk);
        this.f28371f = (TextView) findViewById(f.Rl);
        this.f28372g = (TextView) findViewById(f.sl);
        this.f28373h = (TextView) findViewById(f.pk);
        this.f28374i = (TextView) findViewById(f.rl);
        this.f28375j = (TextView) findViewById(f.Kh);
        this.f28376k = (TextView) findViewById(f.Kk);
        this.f28377l = (TextView) findViewById(f.rj);
        this.f28378m = (Button) findViewById(f.f12247Q0);
        this.f28379n = (Button) findViewById(f.f12514r1);
        this.f28380o = (TextView) findViewById(f.f12129E2);
        this.f28381p = (TextView) findViewById(f.gh);
        this.f28382q = this;
        Thread thread = this.f28391z;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner());
            this.f28391z = thread2;
            thread2.start();
        }
        Intent intent = getIntent();
        this.f28383r = intent.getStringExtra("product");
        this.f28384s = intent.getStringExtra("status");
        this.f28385t = intent.getStringExtra("Registration_date");
        this.f28386u = intent.getStringExtra("next_due_date");
        this.f28387v = intent.getStringExtra("recurring_amount");
        this.f28390y = intent.getStringExtra("billing_cycle");
        this.f28388w = intent.getStringExtra("payment_method");
        this.f28389x = intent.getStringExtra("first_time_payment");
        if (this.f28390y.equalsIgnoreCase("Free Account")) {
            string2 = "- - -";
            this.f28373h.setText("- - -");
            textView2 = this.f28374i;
        } else {
            String str = this.f28386u;
            if (str == null || str.equalsIgnoreCase("")) {
                textView = this.f28373h;
                string = getResources().getString(j.f13206b);
            } else {
                textView = this.f28373h;
                string = this.f28386u;
            }
            textView.setText(string);
            String str2 = this.f28387v;
            if (str2 == null || str2.equalsIgnoreCase("")) {
                textView2 = this.f28374i;
                string2 = getResources().getString(j.f13206b);
            } else {
                textView2 = this.f28374i;
                string2 = ClientSharepreferenceHandler.d(this.f28382q) + this.f28387v + ClientSharepreferenceHandler.e(this.f28382q);
            }
        }
        textView2.setText(string2);
        String str3 = this.f28383r;
        if (str3 == null || str3.equalsIgnoreCase("")) {
            textView3 = this.f28370e;
            string3 = getResources().getString(j.f13206b);
        } else {
            textView3 = this.f28370e;
            string3 = this.f28383r;
        }
        textView3.setText(string3);
        String str4 = this.f28384s;
        if (str4 == null || str4.equalsIgnoreCase("")) {
            this.f28371f.setText(getResources().getString(j.f13206b));
            this.f28369d.setVisibility(8);
        } else {
            this.f28371f.setText(this.f28384s);
            this.f28369d.setText(this.f28384s + " Service Information");
        }
        String str5 = this.f28385t;
        if (str5 == null || str5.equalsIgnoreCase("")) {
            textView4 = this.f28372g;
            string4 = getResources().getString(j.f13206b);
        } else {
            textView4 = this.f28372g;
            string4 = this.f28385t;
        }
        textView4.setText(string4);
        String str6 = this.f28390y;
        if (str6 == null || str6.equalsIgnoreCase("")) {
            textView5 = this.f28375j;
            string5 = getResources().getString(j.f13206b);
        } else {
            textView5 = this.f28375j;
            string5 = this.f28390y;
        }
        textView5.setText(string5);
        String str7 = this.f28388w;
        if (str7 == null || str7.equalsIgnoreCase("")) {
            textView6 = this.f28376k;
            string6 = getResources().getString(j.f13206b);
        } else {
            textView6 = this.f28376k;
            string6 = this.f28388w;
        }
        textView6.setText(string6);
        String str8 = this.f28389x;
        if (str8 == null || str8.equalsIgnoreCase("")) {
            textView7 = this.f28377l;
            string7 = getResources().getString(j.f13206b);
        } else {
            textView7 = this.f28377l;
            string7 = ClientSharepreferenceHandler.d(this.f28382q) + this.f28389x + ClientSharepreferenceHandler.e(this.f28382q);
        }
        textView7.setText(string7);
        this.f28378m.setOnClickListener(new View.OnClickListener() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.ShowserviceInformationActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ShowserviceInformationActivity.this.onBackPressed();
            }
        });
        this.f28379n.setOnClickListener(new View.OnClickListener() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.ShowserviceInformationActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent2 = new Intent(ShowserviceInformationActivity.this, (Class<?>) ServicesDashboardActivity.class);
                intent2.setFlags(67141632);
                ShowserviceInformationActivity.this.startActivity(intent2);
                ShowserviceInformationActivity.this.finish();
            }
        });
        Button button = this.f28379n;
        button.setOnFocusChangeListener(new w.k((View) button, (Activity) this));
        Button button2 = this.f28378m;
        button2.setOnFocusChangeListener(new w.k((View) button2, (Activity) this));
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f28391z;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f28391z.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f28391z;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner());
            this.f28391z = thread2;
            thread2.start();
        }
    }

    public void u1() {
        runOnUiThread(new Runnable() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.ShowserviceInformationActivity.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String string = Calendar.getInstance().getTime().toString();
                    String strR = w.R(ShowserviceInformationActivity.this.f28382q);
                    String strA = w.A(string);
                    TextView textView = ShowserviceInformationActivity.this.f28381p;
                    if (textView != null) {
                        textView.setText(strR);
                    }
                    TextView textView2 = ShowserviceInformationActivity.this.f28380o;
                    if (textView2 != null) {
                        textView2.setText(strA);
                    }
                } catch (Exception unused) {
                }
            }
        });
    }
}
