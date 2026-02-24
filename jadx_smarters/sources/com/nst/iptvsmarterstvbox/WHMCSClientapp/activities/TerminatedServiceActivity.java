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
public class TerminatedServiceActivity extends b implements AllServiceApiCallBack {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f28406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f28407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SpinKitView f28408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f28409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f28410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f28411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f28412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Thread f28413k = null;

    public class CountDownRunner implements Runnable {
        public CountDownRunner() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    TerminatedServiceActivity.this.u1();
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
            this.f28406d.setVisibility(8);
            this.f28407e.setVisibility(0);
            this.f28408f.setVisibility(8);
        } else {
            b();
            this.f28406d.setAdapter(new MyAllServiceAdapter(this.f28412j, arrayList));
        }
    }

    public void b() {
        this.f28408f.setVisibility(8);
        this.f28406d.setVisibility(0);
        this.f28407e.setVisibility(8);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12800g1);
        this.f28406d = (RecyclerView) findViewById(f.Cd);
        this.f28407e = (TextView) findViewById(f.tk);
        this.f28408f = (SpinKitView) findViewById(f.Mc);
        this.f28409g = (TextView) findViewById(f.f12129E2);
        this.f28410h = (TextView) findViewById(f.gh);
        TextView textView = (TextView) findViewById(f.fm);
        this.f28411i = textView;
        textView.setText(getResources().getString(j.f13117R3));
        this.f28412j = this;
        Thread thread = this.f28413k;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner());
            this.f28413k = thread2;
            thread2.start();
        }
        this.f28406d.setLayoutManager(new GridLayoutManager(this, 2));
        new CommanApiHitClass(this, this.f28412j, "Terminated").a();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f28413k;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f28413k.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f28413k;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner());
            this.f28413k = thread2;
            thread2.start();
        }
    }

    @Override // com.nst.iptvsmarterstvbox.WHMCSClientapp.CallBacks.AllServiceApiCallBack
    public void r(String str) {
        Toast.makeText(this.f28412j, "" + str, 0).show();
        this.f28408f.setVisibility(8);
        this.f28406d.setVisibility(0);
        this.f28407e.setVisibility(0);
    }

    public void u1() {
        runOnUiThread(new Runnable() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.TerminatedServiceActivity.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String string = Calendar.getInstance().getTime().toString();
                    String strR = w.R(TerminatedServiceActivity.this.f28412j);
                    String strA = w.A(string);
                    TextView textView = TerminatedServiceActivity.this.f28410h;
                    if (textView != null) {
                        textView.setText(strR);
                    }
                    TextView textView2 = TerminatedServiceActivity.this.f28409g;
                    if (textView2 != null) {
                        textView2.setText(strA);
                    }
                } catch (Exception unused) {
                }
            }
        });
    }
}
