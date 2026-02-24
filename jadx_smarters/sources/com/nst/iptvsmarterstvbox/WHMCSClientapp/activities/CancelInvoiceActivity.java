package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import a7.f;
import a7.g;
import a7.j;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.ybq.android.spinkit.SpinKitView;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.CallBacks.InvoiceData;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.adapters.UnpaidAdapter;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.interfaces.InvoicesApiHitClass;
import java.util.Calendar;
import java.util.List;
import m7.w;

/* JADX INFO: loaded from: classes.dex */
public class CancelInvoiceActivity extends b implements InvoiceData {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f28130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f28131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SpinKitView f28132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f28133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f28134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f28135i;

    public class CountDown implements Runnable {
        public CountDown() {
        }

        public final void a() {
            CancelInvoiceActivity.this.runOnUiThread(new Runnable() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.CancelInvoiceActivity.CountDown.1
                @Override // java.lang.Runnable
                public void run() {
                    String string = Calendar.getInstance().getTime().toString();
                    String strR = w.R(CancelInvoiceActivity.this.f28135i);
                    String strA = w.A(string);
                    TextView textView = CancelInvoiceActivity.this.f28134h;
                    if (textView != null) {
                        textView.setText(strR);
                    }
                    TextView textView2 = CancelInvoiceActivity.this.f28133g;
                    if (textView2 != null) {
                        textView2.setText(strA);
                    }
                }
            });
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            try {
                a();
                Thread.sleep(1000L);
            } catch (InterruptedException e9) {
                e9.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }

    public void b() {
        this.f28132f.setVisibility(8);
        this.f28130d.setVisibility(0);
        this.f28131e.setVisibility(8);
    }

    @Override // com.nst.iptvsmarterstvbox.WHMCSClientapp.CallBacks.InvoiceData
    public void j0(String str) {
        this.f28132f.setVisibility(8);
        this.f28130d.setVisibility(8);
        this.f28131e.setVisibility(0);
        this.f28131e.setText(getResources().getString(j.f13431x4));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12852p);
        this.f28130d = (RecyclerView) findViewById(f.Bd);
        this.f28131e = (TextView) findViewById(f.fh);
        this.f28132f = (SpinKitView) findViewById(f.Mc);
        this.f28133g = (TextView) findViewById(f.f12129E2);
        this.f28134h = (TextView) findViewById(f.gh);
        new Thread(new CountDown()).start();
        this.f28135i = this;
        this.f28130d.setLayoutManager(new GridLayoutManager(this, 2));
        new InvoicesApiHitClass(this, this.f28135i, "Cancelled").a();
    }

    @Override // com.nst.iptvsmarterstvbox.WHMCSClientapp.CallBacks.InvoiceData
    public void w(List list) {
        if (list != null && !list.isEmpty() && list.size() > 0) {
            b();
            this.f28130d.setAdapter(new UnpaidAdapter(this.f28135i, list));
        } else {
            this.f28132f.setVisibility(8);
            this.f28130d.setVisibility(8);
            this.f28131e.setVisibility(0);
            this.f28131e.setText(getResources().getString(j.f13431x4));
        }
    }
}
