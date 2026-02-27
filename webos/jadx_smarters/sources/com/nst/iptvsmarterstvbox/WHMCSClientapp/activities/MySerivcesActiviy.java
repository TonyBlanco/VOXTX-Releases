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
public class MySerivcesActiviy extends b implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f28242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f28243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinearLayout f28244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f28245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f28246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f28247i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f28248j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayout f28249k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AVLoadingIndicatorView f28250l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AVLoadingIndicatorView f28251m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AVLoadingIndicatorView f28252n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AVLoadingIndicatorView f28253o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AVLoadingIndicatorView f28254p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AVLoadingIndicatorView f28255q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f28256r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f28257s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f28258t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f28259u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f28260v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f28261w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Context f28262x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Thread f28263y = null;

    public class CountDownRunner implements Runnable {
        public CountDownRunner() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    MySerivcesActiviy.this.v1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class OnFocusChangeAccountListener implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f28267a;

        public OnFocusChangeAccountListener(View view) {
            this.f28267a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28267a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28267a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28267a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            View view2;
            int i9;
            float f10;
            if (z9) {
                Log.e("id is", "" + this.f28267a.getTag());
                if (this.f28267a.getTag().equals("7")) {
                    f10 = z9 ? 2.0f : 1.0f;
                    b(f10);
                    c(f10);
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                b(f9);
                c(f9);
                if (this.f28267a.getTag().equals("1")) {
                    view2 = this.f28267a;
                    i9 = e.f11990c;
                } else if (this.f28267a.getTag().equals("2")) {
                    view2 = this.f28267a;
                    i9 = e.f12074x;
                } else if (this.f28267a.getTag().equals("3")) {
                    view2 = this.f28267a;
                    i9 = e.f11920H2;
                } else if (this.f28267a.getTag().equals("4")) {
                    view2 = this.f28267a;
                    i9 = e.f11904D2;
                } else if (this.f28267a.getTag().equals("5")) {
                    view2 = this.f28267a;
                    i9 = e.f11912F2;
                } else {
                    if (!this.f28267a.getTag().equals("6")) {
                        return;
                    }
                    view2 = this.f28267a;
                    i9 = e.f11991c0;
                }
            } else {
                if (z9) {
                    return;
                }
                if (this.f28267a.getTag().equals("7")) {
                    f10 = z9 ? 2.0f : 1.0f;
                    b(f10);
                    c(f10);
                    a(z9);
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                b(f9);
                c(f9);
                a(z9);
                if (this.f28267a.getTag().equals("1")) {
                    view2 = this.f28267a;
                    i9 = e.f11986b;
                } else if (this.f28267a.getTag().equals("2")) {
                    view2 = this.f28267a;
                    i9 = e.f12070w;
                } else if (this.f28267a.getTag().equals("3")) {
                    view2 = this.f28267a;
                    i9 = e.f11916G2;
                } else if (this.f28267a.getTag().equals("4")) {
                    view2 = this.f28267a;
                    i9 = e.f11900C2;
                } else if (this.f28267a.getTag().equals("5")) {
                    view2 = this.f28267a;
                    i9 = e.f11908E2;
                } else {
                    if (!this.f28267a.getTag().equals("6")) {
                        return;
                    }
                    view2 = this.f28267a;
                    i9 = e.f11987b0;
                }
            }
            view2.setBackgroundResource(i9);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intent intent;
        int id = view.getId();
        if (id == f.f12253Q6) {
            intent = new Intent(this, (Class<?>) ActiveServiceActivity.class);
        } else if (id == f.f12489o7) {
            intent = new Intent(this, (Class<?>) CancelledSerivceActivity.class);
        } else if (id == f.m9) {
            intent = new Intent(this, (Class<?>) PendingServiceActivity.class);
        } else if (id == f.na) {
            intent = new Intent(this, (Class<?>) SuspendedServiceActivity.class);
        } else if (id == f.ra) {
            intent = new Intent(this, (Class<?>) TerminatedServiceActivity.class);
        } else if (id != f.f12490o8) {
            return;
        } else {
            intent = new Intent(this, (Class<?>) FraudServiceActivity.class);
        }
        startActivity(intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12780d0);
        this.f28242d = (TextView) findViewById(f.f12129E2);
        this.f28243e = (TextView) findViewById(f.gh);
        this.f28244f = (LinearLayout) findViewById(f.f12253Q6);
        this.f28245g = (LinearLayout) findViewById(f.f12489o7);
        this.f28246h = (LinearLayout) findViewById(f.m9);
        this.f28247i = (LinearLayout) findViewById(f.na);
        this.f28248j = (LinearLayout) findViewById(f.ra);
        this.f28249k = (LinearLayout) findViewById(f.f12490o8);
        this.f28250l = (AVLoadingIndicatorView) findViewById(f.jc);
        this.f28251m = (AVLoadingIndicatorView) findViewById(f.fc);
        this.f28252n = (AVLoadingIndicatorView) findViewById(f.gc);
        this.f28253o = (AVLoadingIndicatorView) findViewById(f.lc);
        this.f28254p = (AVLoadingIndicatorView) findViewById(f.mc);
        this.f28255q = (AVLoadingIndicatorView) findViewById(f.hc);
        this.f28256r = (TextView) findViewById(f.vh);
        this.f28257s = (TextView) findViewById(f.Qh);
        this.f28258t = (TextView) findViewById(f.Lk);
        this.f28259u = (TextView) findViewById(f.Xl);
        this.f28260v = (TextView) findViewById(f.am);
        this.f28261w = (TextView) findViewById(f.vj);
        this.f28262x = this;
        Thread thread = this.f28263y;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner());
            this.f28263y = thread2;
            thread2.start();
        }
        LinearLayout linearLayout = this.f28244f;
        linearLayout.setOnFocusChangeListener(new OnFocusChangeAccountListener(linearLayout));
        LinearLayout linearLayout2 = this.f28245g;
        linearLayout2.setOnFocusChangeListener(new OnFocusChangeAccountListener(linearLayout2));
        LinearLayout linearLayout3 = this.f28246h;
        linearLayout3.setOnFocusChangeListener(new OnFocusChangeAccountListener(linearLayout3));
        LinearLayout linearLayout4 = this.f28247i;
        linearLayout4.setOnFocusChangeListener(new OnFocusChangeAccountListener(linearLayout4));
        LinearLayout linearLayout5 = this.f28248j;
        linearLayout5.setOnFocusChangeListener(new OnFocusChangeAccountListener(linearLayout5));
        LinearLayout linearLayout6 = this.f28249k;
        linearLayout6.setOnFocusChangeListener(new OnFocusChangeAccountListener(linearLayout6));
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f28263y;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f28263y.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f28263y;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner());
            this.f28263y = thread2;
            thread2.start();
        }
        w1();
    }

    public void v1() {
        runOnUiThread(new Runnable() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.MySerivcesActiviy.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String string = Calendar.getInstance().getTime().toString();
                    String strR = w.R(MySerivcesActiviy.this.f28262x);
                    String strA = w.A(string);
                    TextView textView = MySerivcesActiviy.this.f28243e;
                    if (textView != null) {
                        textView.setText(strR);
                    }
                    TextView textView2 = MySerivcesActiviy.this.f28242d;
                    if (textView2 != null) {
                        textView2.setText(strA);
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    public void w1() {
        ((ApiService) ApiclientRetrofit.a().create(ApiService.class)).h("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "sitcount", "yes", ClientSharepreferenceHandler.a(this.f28262x)).enqueue(new Callback<ServicesIncoiveTicketCoutModelClass>() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.MySerivcesActiviy.1
            @Override // retrofit2.Callback
            public void onFailure(Call<ServicesIncoiveTicketCoutModelClass> call, Throwable th) {
                MySerivcesActiviy.this.w1();
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<ServicesIncoiveTicketCoutModelClass> call, Response<ServicesIncoiveTicketCoutModelClass> response) {
                Context context;
                String str;
                if (!response.isSuccessful() || response.body() == null) {
                    context = MySerivcesActiviy.this.f28262x;
                    str = "" + response.code() + " | Error";
                } else {
                    if (response.body().b().equalsIgnoreCase("success")) {
                        if (response.body().a().b() == null || response.body().a().a() == null || response.body().a().c() == null) {
                            return;
                        }
                        int iIntValue = response.body().a().b().a().intValue();
                        int iIntValue2 = response.body().a().b().b().intValue();
                        int iIntValue3 = response.body().a().b().d().intValue();
                        int iIntValue4 = response.body().a().b().e().intValue();
                        int iIntValue5 = response.body().a().b().f().intValue();
                        int iIntValue6 = response.body().a().b().c().intValue();
                        MySerivcesActiviy.this.f28256r.setText(String.valueOf(iIntValue));
                        MySerivcesActiviy.this.f28251m.f();
                        MySerivcesActiviy.this.f28256r.setVisibility(0);
                        MySerivcesActiviy.this.f28257s.setText(String.valueOf(iIntValue2));
                        MySerivcesActiviy.this.f28252n.f();
                        MySerivcesActiviy.this.f28257s.setVisibility(0);
                        MySerivcesActiviy.this.f28258t.setText(String.valueOf(iIntValue3));
                        MySerivcesActiviy.this.f28250l.f();
                        MySerivcesActiviy.this.f28258t.setVisibility(0);
                        MySerivcesActiviy.this.f28259u.setText(String.valueOf(iIntValue4));
                        MySerivcesActiviy.this.f28253o.f();
                        MySerivcesActiviy.this.f28259u.setVisibility(0);
                        MySerivcesActiviy.this.f28260v.setText(String.valueOf(iIntValue5));
                        MySerivcesActiviy.this.f28254p.f();
                        MySerivcesActiviy.this.f28260v.setVisibility(0);
                        MySerivcesActiviy.this.f28261w.setText(String.valueOf(iIntValue6));
                        MySerivcesActiviy.this.f28255q.f();
                        MySerivcesActiviy.this.f28261w.setVisibility(0);
                        return;
                    }
                    context = MySerivcesActiviy.this.f28262x;
                    str = "Failed";
                }
                Toast.makeText(context, str, 0).show();
            }
        });
    }
}
