package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import a7.e;
import a7.f;
import a7.g;
import a7.j;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.b;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.CallBacks.AllServiceApiCallBack;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.interfaces.ApiService;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.interfaces.ApiclientRetrofit;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.interfaces.CommanApiHitClass;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.modelclassess.ActiveServiceModelClass;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.modelclassess.BuyNowModelClass;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.modelclassess.LoginWHMCSModelClass;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.modelclassess.ServicesIncoiveTicketCoutModelClass;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.AnnouncementsActivity;
import com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity;
import com.nst.iptvsmarterstvbox.view.activity.SettingsActivity;
import com.wang.avi.AVLoadingIndicatorView;
import java.util.ArrayList;
import java.util.Calendar;
import m7.AbstractC2237a;
import m7.w;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public class ServicesDashboardActivity extends b implements AllServiceApiCallBack, View.OnClickListener {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static PopupWindow f28324J;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Context f28325A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public TextView f28326B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public TextView f28327C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Button f28328D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Button f28329E;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public CountDownTimer f28332H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f28334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f28335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AVLoadingIndicatorView f28336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AVLoadingIndicatorView f28337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AVLoadingIndicatorView f28338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f28339i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f28340j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f28341k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f28342l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f28343m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f28344n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f28345o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageView f28346p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f28347q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinearLayout f28348r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LinearLayout f28349s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LinearLayout f28350t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public LinearLayout f28351u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f28352v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f28353w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Button f28354x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f28355y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f28356z;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f28330F = "";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public String f28331G = "";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Thread f28333I = null;

    public class CountDownRunner implements Runnable {
        public CountDownRunner() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    ServicesDashboardActivity.this.z1();
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
        public final View f28367a;

        public OnFocusChangeAccountListener(View view) {
            this.f28367a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28367a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28367a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28367a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x017a  */
        @Override // android.view.View.OnFocusChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onFocusChange(android.view.View r12, boolean r13) {
            /*
                Method dump skipped, instruction units count: 556
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.ServicesDashboardActivity.OnFocusChangeAccountListener.onFocusChange(android.view.View, boolean):void");
        }
    }

    public void A1() {
        ((ApiService) ApiclientRetrofit.a().create(ApiService.class)).h("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "sitcount", "yes", ClientSharepreferenceHandler.a(this.f28325A)).enqueue(new Callback<ServicesIncoiveTicketCoutModelClass>() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.ServicesDashboardActivity.3
            @Override // retrofit2.Callback
            public void onFailure(Call<ServicesIncoiveTicketCoutModelClass> call, Throwable th) {
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<ServicesIncoiveTicketCoutModelClass> call, Response<ServicesIncoiveTicketCoutModelClass> response) {
                Context context;
                String str;
                if (!response.isSuccessful() || response.body() == null) {
                    context = ServicesDashboardActivity.this.f28325A;
                    str = "" + response.code() + " | Error";
                } else {
                    if (response.body().b().equalsIgnoreCase("success")) {
                        if (response.body().a().b() == null || response.body().a().a() == null || response.body().a().c() == null) {
                            return;
                        }
                        int iIntValue = response.body().a().b().a().intValue();
                        int iIntValue2 = response.body().a().a().d().intValue();
                        String strA = response.body().a().c().a();
                        ServicesDashboardActivity.this.f28339i.setText(String.valueOf(iIntValue));
                        ServicesDashboardActivity.this.f28336f.f();
                        ServicesDashboardActivity.this.f28339i.setVisibility(0);
                        ServicesDashboardActivity.this.f28340j.setText(String.valueOf(iIntValue2));
                        ServicesDashboardActivity.this.f28337g.f();
                        ServicesDashboardActivity.this.f28340j.setVisibility(0);
                        ServicesDashboardActivity.this.f28341k.setText(strA);
                        ServicesDashboardActivity.this.f28338h.f();
                        ServicesDashboardActivity.this.f28341k.setVisibility(0);
                        return;
                    }
                    context = ServicesDashboardActivity.this.f28325A;
                    str = "Failed";
                }
                Toast.makeText(context, str, 0).show();
            }
        });
    }

    public void B1(int i9, final TextView textView) {
        this.f28332H = new CountDownTimer((i9 * 1000) + 1000, 1000L) { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.ServicesDashboardActivity.7
            @Override // android.os.CountDownTimer
            public void onFinish() {
                textView.setText(j.f13308l1);
                ServicesDashboardActivity.this.f28353w.setText(j.f13396u);
                ServicesDashboardActivity.this.f28353w.setTextColor(-65536);
                ServicesDashboardActivity.this.f28352v.setTextColor(-65536);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j9) {
                int i10 = (int) (j9 / 1000);
                int i11 = i10 / 3600;
                int i12 = i10 - (i11 * 3600);
                int i13 = i12 / 60;
                textView.setText(" " + String.format("%02d", Integer.valueOf(i11)) + ":" + String.format("%02d", Integer.valueOf(i13)) + ":" + String.format("%02d", Integer.valueOf(i12 - (i13 * 60))) + " Hrs");
                if (i11 <= 3) {
                    ServicesDashboardActivity.this.f28353w.setTextColor(-65536);
                    ServicesDashboardActivity.this.f28352v.setTextColor(-65536);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
                    alphaAnimation.setDuration(1000L);
                    alphaAnimation.setStartOffset(20L);
                    alphaAnimation.setRepeatMode(2);
                    alphaAnimation.setRepeatCount(-1);
                    ServicesDashboardActivity.this.f28353w.startAnimation(alphaAnimation);
                    ServicesDashboardActivity.this.f28352v.startAnimation(alphaAnimation);
                }
            }
        }.start();
    }

    public void C1() {
        if (this.f28325A != null) {
            View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(g.f12867r2, (RelativeLayout) findViewById(f.We));
            PopupWindow popupWindow = new PopupWindow(this);
            f28324J = popupWindow;
            popupWindow.setContentView(viewInflate);
            f28324J.setWidth(-1);
            f28324J.setHeight(-1);
            f28324J.setFocusable(true);
            f28324J.showAtLocation(viewInflate, 17, 0, 0);
            this.f28326B = (TextView) viewInflate.findViewById(f.Ik);
            this.f28327C = (TextView) viewInflate.findViewById(f.Ai);
            this.f28328D = (Button) viewInflate.findViewById(f.f12197L0);
            this.f28329E = (Button) viewInflate.findViewById(f.f12482o0);
            TextView textView = this.f28326B;
            if (textView != null) {
                textView.setText(getResources().getString(j.f13250f3));
            }
            TextView textView2 = this.f28327C;
            if (textView2 != null) {
                textView2.setText(getResources().getString(j.f13240e3));
            }
            Button button = this.f28328D;
            if (button != null) {
                button.setOnFocusChangeListener(new w.k((View) button, (Activity) this));
            }
            Button button2 = this.f28329E;
            if (button2 != null) {
                button2.setOnFocusChangeListener(new w.k((View) button2, (Activity) this));
            }
            this.f28329E.setOnClickListener(new View.OnClickListener() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.ServicesDashboardActivity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ServicesDashboardActivity.f28324J.dismiss();
                }
            });
            Button button3 = this.f28328D;
            if (button3 != null) {
                button3.setOnClickListener(new View.OnClickListener() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.ServicesDashboardActivity.6
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        ServicesDashboardActivity.this.finish();
                        w.n0(ServicesDashboardActivity.this.f28325A);
                        ServicesDashboardActivity.this.overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
                    }
                });
            }
        }
    }

    @Override // com.nst.iptvsmarterstvbox.WHMCSClientapp.CallBacks.AllServiceApiCallBack
    public void W(ArrayList arrayList) {
        w.X();
        if (arrayList == null || arrayList.size() <= 0 || arrayList.get(0) == null) {
            return;
        }
        this.f28331G = ((ActiveServiceModelClass) arrayList.get(0)).c();
        try {
            Intent intent = new Intent(this, (Class<?>) BuyNowActivity.class);
            intent.putExtra("service_id", this.f28331G);
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intent intent;
        int id = view.getId();
        if (id != f.f12142F5) {
            if (id == f.f12359c) {
                startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                finish();
            } else if (id == f.Og) {
                if ((!AbstractC2237a.f44536s.booleanValue() || !SharepreferenceDBHandler.getCurrentAPPType(this.f28325A).equals("api")) && (!AbstractC2237a.f44540u.booleanValue() || !SharepreferenceDBHandler.getCurrentAPPType(this.f28325A).equals("m3u"))) {
                    C1();
                    return;
                } else {
                    finish();
                    AbstractC2237a.f44488b0 = Boolean.TRUE;
                    w.n0(this.f28325A);
                }
            } else if (id == f.Y9) {
                intent = new Intent(this, (Class<?>) MySerivcesActiviy.class);
            } else if (id == f.f12601z8) {
                intent = new Intent(this, (Class<?>) MyInvoiceActivity.class);
            } else if (id == f.ua) {
                intent = new Intent(this, (Class<?>) MyTicketActivity.class);
            } else {
                if (id != f.f12356b6) {
                    if (id == f.f12277T0) {
                        w1();
                        return;
                    }
                    return;
                }
                intent = new Intent(this, (Class<?>) SettingsActivity.class);
            }
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
            return;
        }
        intent = new Intent(this, (Class<?>) AnnouncementsActivity.class);
        startActivity(intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12705R0);
        this.f28334d = (TextView) findViewById(f.f12129E2);
        this.f28335e = (TextView) findViewById(f.gh);
        this.f28336f = (AVLoadingIndicatorView) findViewById(f.kc);
        this.f28337g = (AVLoadingIndicatorView) findViewById(f.ic);
        this.f28338h = (AVLoadingIndicatorView) findViewById(f.nc);
        this.f28339i = (TextView) findViewById(f.Hl);
        this.f28340j = (TextView) findViewById(f.Ej);
        this.f28341k = (TextView) findViewById(f.dm);
        this.f28342l = (ImageView) findViewById(f.f12356b6);
        this.f28343m = (ImageView) findViewById(f.Og);
        this.f28344n = (ImageView) findViewById(f.f12142F5);
        this.f28345o = (TextView) findViewById(f.Dk);
        this.f28346p = (ImageView) findViewById(f.f12359c);
        this.f28347q = (TextView) findViewById(f.rh);
        this.f28348r = (LinearLayout) findViewById(f.Y9);
        this.f28349s = (LinearLayout) findViewById(f.f12601z8);
        this.f28350t = (LinearLayout) findViewById(f.ua);
        this.f28351u = (LinearLayout) findViewById(f.f12468m7);
        this.f28352v = (TextView) findViewById(f.xj);
        this.f28353w = (TextView) findViewById(f.wj);
        this.f28354x = (Button) findViewById(f.f12277T0);
        this.f28355y = (TextView) findViewById(f.Yl);
        this.f28356z = (TextView) findViewById(f.Kl);
        this.f28325A = this;
        Thread thread = this.f28333I;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner());
            this.f28333I = thread2;
            thread2.start();
        }
        Button button = this.f28354x;
        button.setOnFocusChangeListener(new OnFocusChangeAccountListener(button));
        ImageView imageView = this.f28346p;
        imageView.setOnFocusChangeListener(new OnFocusChangeAccountListener(imageView));
        ImageView imageView2 = this.f28342l;
        imageView2.setOnFocusChangeListener(new OnFocusChangeAccountListener(imageView2));
        ImageView imageView3 = this.f28343m;
        imageView3.setOnFocusChangeListener(new OnFocusChangeAccountListener(imageView3));
        LinearLayout linearLayout = this.f28350t;
        linearLayout.setOnFocusChangeListener(new OnFocusChangeAccountListener(linearLayout));
        ImageView imageView4 = this.f28344n;
        imageView4.setOnFocusChangeListener(new OnFocusChangeAccountListener(imageView4));
        LinearLayout linearLayout2 = this.f28349s;
        linearLayout2.setOnFocusChangeListener(new OnFocusChangeAccountListener(linearLayout2));
        LinearLayout linearLayout3 = this.f28348r;
        linearLayout3.setOnFocusChangeListener(new OnFocusChangeAccountListener(linearLayout3));
        this.f28348r.requestFocus();
        if (AbstractC2237a.f44536s.booleanValue()) {
            return;
        }
        this.f28343m.setImageResource(e.f12028l1);
        this.f28355y.setText(getResources().getString(j.f13330n3));
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            CountDownTimer countDownTimer = this.f28332H;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        } catch (Exception unused) {
        }
        try {
            Thread thread = this.f28333I;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f28333I.interrupt();
        } catch (Exception unused2) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        A1();
        this.f28330F = getIntent().getAction();
        Thread thread = this.f28333I;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner());
            this.f28333I = thread2;
            thread2.start();
        }
        u1();
    }

    @Override // com.nst.iptvsmarterstvbox.WHMCSClientapp.CallBacks.AllServiceApiCallBack
    public void r(String str) {
        try {
            w.X();
        } catch (Exception unused) {
            w.P0(this.f28325A, str);
        }
    }

    public final void u1() {
        w.M0(this);
        ((ApiService) ApiclientRetrofit.a().create(ApiService.class)).f("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "validateCustomLogin", "yes", SharepreferenceDBHandler.getUserName(this.f28325A), SharepreferenceDBHandler.getUserPassword(this.f28325A)).enqueue(new Callback<LoginWHMCSModelClass>() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.ServicesDashboardActivity.1
            @Override // retrofit2.Callback
            public void onFailure(Call<LoginWHMCSModelClass> call, Throwable th) {
                w.X();
                ServicesDashboardActivity servicesDashboardActivity = ServicesDashboardActivity.this;
                Toast.makeText(servicesDashboardActivity.f28325A, servicesDashboardActivity.getResources().getString(j.f13244e7), 0).show();
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<LoginWHMCSModelClass> call, Response<LoginWHMCSModelClass> response) {
                Toast toastMakeText;
                if (!response.isSuccessful()) {
                    toastMakeText = Toast.makeText(ServicesDashboardActivity.this.f28325A, "", 0);
                } else {
                    if (response.body() != null && response.body().c() != null && response.body().c().equalsIgnoreCase("success")) {
                        ClientSharepreferenceHandler.g(response.body().a().c(), ServicesDashboardActivity.this.f28325A);
                        ClientSharepreferenceHandler.f(response.body().a().a().intValue(), ServicesDashboardActivity.this.f28325A);
                        ClientSharepreferenceHandler.i(response.body().a().b(), ServicesDashboardActivity.this.f28325A);
                        ClientSharepreferenceHandler.j(response.body().a().d(), ServicesDashboardActivity.this.f28325A);
                        ClientSharepreferenceHandler.k(response.body().a().e(), ServicesDashboardActivity.this.f28325A);
                        ServicesDashboardActivity.this.v1();
                        return;
                    }
                    toastMakeText = Toast.makeText(ServicesDashboardActivity.this.f28325A, "" + response.body().b(), 0);
                }
                toastMakeText.show();
            }
        });
    }

    public final void v1() {
        int iA = ClientSharepreferenceHandler.a(this.f28325A);
        String userName = SharepreferenceDBHandler.getUserName(this.f28325A);
        String userPassword = SharepreferenceDBHandler.getUserPassword(this.f28325A);
        ApiService apiService = (ApiService) ApiclientRetrofit.a().create(ApiService.class);
        final String trial = SharepreferenceDBHandler.getTrial(this.f28325A);
        apiService.g("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", userName, userPassword, "buyNowButton", "yes", iA).enqueue(new Callback<BuyNowModelClass>() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.ServicesDashboardActivity.4
            @Override // retrofit2.Callback
            public void onFailure(Call<BuyNowModelClass> call, Throwable th) {
                ServicesDashboardActivity.this.f28351u.setVisibility(8);
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<BuyNowModelClass> call, Response<BuyNowModelClass> response) {
                View view;
                w.X();
                if (!response.isSuccessful() || response.body() == null || response.body().a() == null) {
                    view = ServicesDashboardActivity.this.f28351u;
                } else if (response.body().a().equalsIgnoreCase("yes")) {
                    ServicesDashboardActivity.this.f28351u.setVisibility(0);
                    if (trial.equals("1")) {
                        ServicesDashboardActivity servicesDashboardActivity = ServicesDashboardActivity.this;
                        servicesDashboardActivity.B1(ClientSharepreferenceHandler.b(servicesDashboardActivity.f28325A), ServicesDashboardActivity.this.f28352v);
                        return;
                    } else {
                        ServicesDashboardActivity.this.f28353w.setVisibility(8);
                        view = ServicesDashboardActivity.this.f28352v;
                    }
                } else {
                    if (trial.equals("1")) {
                        ServicesDashboardActivity servicesDashboardActivity2 = ServicesDashboardActivity.this;
                        servicesDashboardActivity2.B1(ClientSharepreferenceHandler.b(servicesDashboardActivity2.f28325A), ServicesDashboardActivity.this.f28352v);
                    } else {
                        ServicesDashboardActivity.this.f28353w.setVisibility(8);
                        ServicesDashboardActivity.this.f28352v.setVisibility(8);
                    }
                    ClientSharepreferenceHandler.h("free trail", ServicesDashboardActivity.this.f28325A);
                    view = ServicesDashboardActivity.this.f28351u;
                }
                view.setVisibility(8);
            }
        });
    }

    public final void w1() {
        w.M0(this);
        new CommanApiHitClass(this, this.f28325A, "Active").a();
    }

    public void z1() {
        runOnUiThread(new Runnable() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.ServicesDashboardActivity.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String string = Calendar.getInstance().getTime().toString();
                    String strR = w.R(ServicesDashboardActivity.this.f28325A);
                    String strA = w.A(string);
                    TextView textView = ServicesDashboardActivity.this.f28335e;
                    if (textView != null) {
                        textView.setText(strR);
                    }
                    TextView textView2 = ServicesDashboardActivity.this.f28334d;
                    if (textView2 != null) {
                        textView2.setText(strA);
                    }
                } catch (Exception unused) {
                }
            }
        });
    }
}
