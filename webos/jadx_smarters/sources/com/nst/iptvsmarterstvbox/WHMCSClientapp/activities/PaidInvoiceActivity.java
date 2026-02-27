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
public class PaidInvoiceActivity extends b implements InvoiceData {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f28306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f28307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SpinKitView f28308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f28309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f28310h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f28311i;

    public class countDown implements Runnable {
        public countDown() {
        }

        public final void a() {
            PaidInvoiceActivity.this.runOnUiThread(new Runnable() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.PaidInvoiceActivity.countDown.1
                @Override // java.lang.Runnable
                public void run() {
                    String string = Calendar.getInstance().getTime().toString();
                    String strR = w.R(PaidInvoiceActivity.this.f28311i);
                    String strA = w.A(string);
                    TextView textView = PaidInvoiceActivity.this.f28309g;
                    if (textView != null) {
                        textView.setText(strR);
                    }
                    TextView textView2 = PaidInvoiceActivity.this.f28310h;
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
        this.f28308f.setVisibility(8);
        this.f28306d.setVisibility(0);
        this.f28307e.setVisibility(8);
    }

    @Override // com.nst.iptvsmarterstvbox.WHMCSClientapp.CallBacks.InvoiceData
    public void j0(String str) {
        this.f28308f.setVisibility(8);
        this.f28306d.setVisibility(8);
        this.f28307e.setVisibility(0);
        this.f28307e.setText(getResources().getString(j.f13441y4));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12823k0);
        this.f28306d = (RecyclerView) findViewById(f.Bd);
        this.f28307e = (TextView) findViewById(f.fh);
        this.f28308f = (SpinKitView) findViewById(f.Mc);
        this.f28309g = (TextView) findViewById(f.gh);
        this.f28310h = (TextView) findViewById(f.f12129E2);
        this.f28311i = this;
        new Thread(new countDown()).start();
        this.f28306d.setLayoutManager(new GridLayoutManager(this, 2));
        new InvoicesApiHitClass(this, this.f28311i, "Paid").a();
    }

    @Override // com.nst.iptvsmarterstvbox.WHMCSClientapp.CallBacks.InvoiceData
    public void w(List list) {
        if (list != null && list.size() > 0) {
            b();
            this.f28306d.setAdapter(new UnpaidAdapter(this.f28311i, list));
        } else {
            this.f28306d.setVisibility(8);
            this.f28307e.setVisibility(0);
            this.f28307e.setText(getResources().getString(j.f13441y4));
            this.f28308f.setVisibility(8);
        }
    }
}
