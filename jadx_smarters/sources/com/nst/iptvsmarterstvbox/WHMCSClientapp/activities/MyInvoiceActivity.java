package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import a7.e;
import a7.f;
import a7.g;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.b;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.interfaces.ApiService;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.interfaces.ApiclientRetrofit;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.modelclassess.ServicesIncoiveTicketCoutModelClass;
import com.wang.avi.AVLoadingIndicatorView;
import java.util.Calendar;
import m7.w;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public class MyInvoiceActivity extends b implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f28221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f28222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f28223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f28224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f28225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f28226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AVLoadingIndicatorView f28227j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AVLoadingIndicatorView f28228k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AVLoadingIndicatorView f28229l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AVLoadingIndicatorView f28230m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f28231n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinearLayout f28232o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f28233p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LinearLayout f28234q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f28235r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Thread f28236s = null;

    public class CountTime implements Runnable {
        public CountTime() {
        }

        public final void a() {
            MyInvoiceActivity.this.runOnUiThread(new Runnable() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.MyInvoiceActivity.CountTime.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String string = Calendar.getInstance().getTime().toString();
                        String strR = w.R(MyInvoiceActivity.this.f28235r);
                        String strA = w.A(string);
                        TextView textView = MyInvoiceActivity.this.f28221d;
                        if (textView != null) {
                            textView.setText(strR);
                        }
                        TextView textView2 = MyInvoiceActivity.this.f28222e;
                        if (textView2 != null) {
                            textView2.setText(strA);
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    a();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public class onFocusChange implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f28240a;

        public onFocusChange(View view) {
            this.f28240a = view;
        }

        public void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28240a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28240a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28240a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (z9) {
                Log.e("id is", "" + this.f28240a.getTag());
                if (this.f28240a.getTag().equals("7")) {
                    float f9 = z9 ? 2.0f : 1.0f;
                    b(f9);
                    c(f9);
                } else {
                    float f10 = z9 ? 1.09f : 1.0f;
                    b(f10);
                    c(f10);
                    if (this.f28240a.getTag().equals("1")) {
                        this.f28240a.setBackgroundResource(e.f12052r1);
                    }
                    if (this.f28240a.getTag().equals("2")) {
                        this.f28240a.setBackgroundResource(e.f11940M2);
                    }
                    if (this.f28240a.getTag().equals("3")) {
                        this.f28240a.setBackgroundResource(e.f12064u1);
                    }
                    if (this.f28240a.getTag().equals("4")) {
                        this.f28240a.setBackgroundResource(e.f12074x);
                    }
                }
            }
            if (z9) {
                return;
            }
            if (this.f28240a.getTag().equals("7")) {
                float f11 = z9 ? 2.0f : 1.0f;
                b(f11);
                c(f11);
                a(z9);
                return;
            }
            float f12 = z9 ? 1.09f : 1.0f;
            b(f12);
            c(f12);
            a(z9);
            if (this.f28240a.getTag().equals("1")) {
                this.f28240a.setBackgroundResource(e.f12048q1);
            }
            if (this.f28240a.getTag().equals("2")) {
                this.f28240a.setBackgroundResource(e.f11936L2);
            }
            if (this.f28240a.getTag().equals("3")) {
                this.f28240a.setBackgroundResource(e.f12060t1);
            }
            if (this.f28240a.getTag().equals("4")) {
                this.f28240a.setBackgroundResource(e.f12070w);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intent intent;
        int id = view.getId();
        if (id == f.Xb) {
            intent = new Intent(this, (Class<?>) PaidInvoiceActivity.class);
        } else if (id == f.zm) {
            intent = new Intent(this, (Class<?>) UnpiadInvoiceActivity.class);
        } else if (id == f.f12594z1) {
            intent = new Intent(this, (Class<?>) CancelInvoiceActivity.class);
        } else if (id != f.Id) {
            return;
        } else {
            intent = new Intent(this, (Class<?>) InvoiceRefundedActivity.class);
        }
        startActivity(intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12773c0);
        this.f28221d = (TextView) findViewById(f.gh);
        this.f28222e = (TextView) findViewById(f.f12129E2);
        this.f28223f = (TextView) findViewById(f.kg);
        this.f28224g = (TextView) findViewById(f.mg);
        this.f28225h = (TextView) findViewById(f.lg);
        this.f28226i = (TextView) findViewById(f.jg);
        this.f28227j = (AVLoadingIndicatorView) findViewById(f.Ja);
        this.f28228k = (AVLoadingIndicatorView) findViewById(f.Ma);
        this.f28229l = (AVLoadingIndicatorView) findViewById(f.La);
        this.f28230m = (AVLoadingIndicatorView) findViewById(f.Ka);
        this.f28231n = (LinearLayout) findViewById(f.zm);
        this.f28232o = (LinearLayout) findViewById(f.Xb);
        this.f28233p = (LinearLayout) findViewById(f.Id);
        this.f28234q = (LinearLayout) findViewById(f.f12594z1);
        this.f28235r = this;
        Thread thread = this.f28236s;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountTime());
            this.f28236s = thread2;
            thread2.start();
        }
        LinearLayout linearLayout = this.f28232o;
        linearLayout.setOnFocusChangeListener(new onFocusChange(linearLayout));
        LinearLayout linearLayout2 = this.f28231n;
        linearLayout2.setOnFocusChangeListener(new onFocusChange(linearLayout2));
        LinearLayout linearLayout3 = this.f28234q;
        linearLayout3.setOnFocusChangeListener(new onFocusChange(linearLayout3));
        LinearLayout linearLayout4 = this.f28233p;
        linearLayout4.setOnFocusChangeListener(new onFocusChange(linearLayout4));
        v1();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f28236s;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f28236s.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f28236s;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountTime());
            this.f28236s = thread2;
            thread2.start();
        }
    }

    public final void v1() {
        ((ApiService) ApiclientRetrofit.a().create(ApiService.class)).h("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "sitcount", "yes", ClientSharepreferenceHandler.a(this.f28235r)).enqueue(new Callback<ServicesIncoiveTicketCoutModelClass>() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.MyInvoiceActivity.1
            @Override // retrofit2.Callback
            public void onFailure(Call<ServicesIncoiveTicketCoutModelClass> call, Throwable th) {
                MyInvoiceActivity.this.f28232o.setVisibility(8);
                MyInvoiceActivity.this.f28234q.setVisibility(8);
                MyInvoiceActivity.this.f28233p.setVisibility(8);
                MyInvoiceActivity.this.f28231n.setVisibility(8);
                Toast.makeText(MyInvoiceActivity.this.f28235r, "No Response from server", 0).show();
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<ServicesIncoiveTicketCoutModelClass> call, Response<ServicesIncoiveTicketCoutModelClass> response) {
                if (response.body() == null || !response.isSuccessful()) {
                    Toast.makeText(MyInvoiceActivity.this.f28235r, "" + response.code() + " | Error", 0).show();
                    return;
                }
                if (response.body().a().a() != null) {
                    int iIntValue = response.body().a().a().b().intValue();
                    int iIntValue2 = response.body().a().a().d().intValue();
                    int iIntValue3 = response.body().a().a().c().intValue();
                    int iIntValue4 = response.body().a().a().a().intValue();
                    MyInvoiceActivity.this.f28223f.setText(String.valueOf(iIntValue));
                    MyInvoiceActivity.this.f28227j.setVisibility(8);
                    MyInvoiceActivity.this.f28223f.setVisibility(0);
                    MyInvoiceActivity.this.f28224g.setText(String.valueOf(iIntValue2));
                    MyInvoiceActivity.this.f28228k.setVisibility(8);
                    MyInvoiceActivity.this.f28224g.setVisibility(0);
                    MyInvoiceActivity.this.f28225h.setText(String.valueOf(iIntValue3));
                    MyInvoiceActivity.this.f28229l.setVisibility(8);
                    MyInvoiceActivity.this.f28225h.setVisibility(0);
                    MyInvoiceActivity.this.f28226i.setText(String.valueOf(iIntValue4));
                    MyInvoiceActivity.this.f28230m.setVisibility(8);
                    MyInvoiceActivity.this.f28226i.setVisibility(0);
                }
            }
        });
    }
}
