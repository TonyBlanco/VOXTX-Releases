package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import a7.f;
import a7.g;
import a7.j;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.b;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.ybq.android.spinkit.SpinKitView;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.CallBacks.AllServiceApiCallBack;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.adapters.MyAllServiceAdapter;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.interfaces.CommanApiHitClass;
import java.util.ArrayList;
import java.util.Calendar;
import m7.w;

/* JADX INFO: loaded from: classes.dex */
public class ActiveServiceActivity extends b implements AllServiceApiCallBack {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f28106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f28107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SpinKitView f28108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f28109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f28110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f28111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f28112j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Thread f28113k = null;

    public class CountDownRunner implements Runnable {
        public CountDownRunner() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    ActiveServiceActivity.this.u1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    @Override // com.nst.iptvsmarterstvbox.WHMCSClientapp.CallBacks.AllServiceApiCallBack
    public void W(ArrayList arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            this.f28106d.setVisibility(8);
            this.f28107e.setVisibility(0);
            this.f28108f.setVisibility(8);
        } else {
            b();
            this.f28106d.setAdapter(new MyAllServiceAdapter(this.f28112j, arrayList));
        }
    }

    public void b() {
        this.f28108f.setVisibility(8);
        this.f28106d.setVisibility(0);
        this.f28107e.setVisibility(8);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12779d);
        this.f28106d = (RecyclerView) findViewById(f.Cd);
        this.f28107e = (TextView) findViewById(f.tk);
        this.f28108f = (SpinKitView) findViewById(f.Mc);
        this.f28109g = (TextView) findViewById(f.f12129E2);
        this.f28110h = (TextView) findViewById(f.gh);
        TextView textView = (TextView) findViewById(f.fm);
        this.f28111i = textView;
        this.f28112j = this;
        textView.setText(getResources().getString(j.f13067M3));
        Thread thread = this.f28113k;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner());
            this.f28113k = thread2;
            thread2.start();
        }
        this.f28106d.setLayoutManager(new GridLayoutManager(this, 2));
        new CommanApiHitClass(this, this.f28112j, "Active").a();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f28113k;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f28113k.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f28113k;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner());
            this.f28113k = thread2;
            thread2.start();
        }
    }

    @Override // com.nst.iptvsmarterstvbox.WHMCSClientapp.CallBacks.AllServiceApiCallBack
    public void r(String str) {
        Toast.makeText(this.f28112j, "" + str, 0).show();
        this.f28108f.setVisibility(8);
        this.f28106d.setVisibility(0);
        this.f28107e.setVisibility(0);
    }

    public void u1() {
        runOnUiThread(new Runnable() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.ActiveServiceActivity.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String string = Calendar.getInstance().getTime().toString();
                    String strR = w.R(ActiveServiceActivity.this.f28112j);
                    String strA = w.A(string);
                    TextView textView = ActiveServiceActivity.this.f28110h;
                    if (textView != null) {
                        textView.setText(strR);
                    }
                    TextView textView2 = ActiveServiceActivity.this.f28109g;
                    if (textView2 != null) {
                        textView2.setText(strA);
                    }
                } catch (Exception unused) {
                }
            }
        });
    }
}
