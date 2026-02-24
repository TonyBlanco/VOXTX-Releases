package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import a7.f;
import a7.g;
import a7.k;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amplifyframework.core.model.ModelIdentifier;
import com.github.ybq.android.spinkit.SpinKitView;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.adapters.TicketMessageAdapter;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.interfaces.ApiService;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.interfaces.ApiclientRetrofit;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.modelclassess.TickedMessageModelClass;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.modelclassess.TicketModelClass;
import java.util.Calendar;
import java.util.List;
import m7.w;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public class ViewTicketActivity extends b implements View.OnClickListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f28425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f28426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f28427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f28428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Button f28429i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Button f28430j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SpinKitView f28431k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f28432l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LinearLayout f28433m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f28434n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AlertDialog f28436p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView.g f28438r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Context f28439s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f28424d = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f28435o = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f28437q = "";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Thread f28440t = null;

    public class CountDownRunner implements Runnable {
        public CountDownRunner() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    ViewTicketActivity.this.A1();
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
        public final View f28449a;

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28449a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28449a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28449a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            if (!z9) {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                b(f9);
                c(f9);
                a(z9);
                return;
            }
            Log.e("id is", "" + this.f28449a.getTag());
            f9 = z9 ? 1.09f : 1.0f;
            b(f9);
            c(f9);
        }
    }

    public void A1() {
        runOnUiThread(new Runnable() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.ViewTicketActivity.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String string = Calendar.getInstance().getTime().toString();
                    String strR = w.R(ViewTicketActivity.this.f28439s);
                    String strA = w.A(string);
                    TextView textView = ViewTicketActivity.this.f28425e;
                    if (textView != null) {
                        textView.setText(strR);
                    }
                    TextView textView2 = ViewTicketActivity.this.f28426f;
                    if (textView2 != null) {
                        textView2.setText(strA);
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    public final void B1(String str, final AlertDialog alertDialog) {
        if (this.f28439s != null) {
            w.M0(this);
            ((ApiService) ApiclientRetrofit.a().create(ApiService.class)).i("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "AddTicketReply", "no", str, ClientSharepreferenceHandler.a(this.f28439s), this.f28435o).enqueue(new Callback<TicketModelClass>() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.ViewTicketActivity.2
                @Override // retrofit2.Callback
                public void onFailure(Call<TicketModelClass> call, Throwable th) {
                    Toast.makeText(ViewTicketActivity.this.f28439s, "Network error occured! Please try again", 0).show();
                    w.X();
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<TicketModelClass> call, Response<TicketModelClass> response) {
                    Context context;
                    String str2;
                    w.X();
                    if (!response.isSuccessful() || response.body() == null) {
                        context = ViewTicketActivity.this.f28439s;
                        str2 = "Response Error";
                    } else {
                        if (response.body().a().equals("success")) {
                            Toast.makeText(ViewTicketActivity.this.getApplicationContext(), "Your ticket added successfully", 0).show();
                            AlertDialog alertDialog2 = alertDialog;
                            if (alertDialog2 != null) {
                                alertDialog2.dismiss();
                            }
                            ViewTicketActivity.this.u1();
                            return;
                        }
                        context = ViewTicketActivity.this.f28439s;
                        str2 = "Error";
                    }
                    Toast.makeText(context, str2, 0).show();
                }
            });
        }
    }

    public void C1(Boolean bool) {
        if (bool.booleanValue()) {
            this.f28427g.setVisibility(0);
            this.f28429i.setVisibility(0);
            this.f28433m.setVisibility(0);
        } else {
            this.f28428h.setVisibility(0);
            this.f28429i.setVisibility(8);
            this.f28433m.setVisibility(8);
        }
        this.f28431k.setVisibility(8);
    }

    public void D1() {
        if (this.f28439s != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this, k.f13456a);
            View viewInflate = LayoutInflater.from(this).inflate(g.f12827k4, (ViewGroup) null);
            Button button = (Button) viewInflate.findViewById(f.f12504q1);
            Button button2 = (Button) viewInflate.findViewById(f.f12451l0);
            button.setOnFocusChangeListener(new w.k((View) button, (Activity) this));
            button2.setOnFocusChangeListener(new w.k((View) button2, (Activity) this));
            final EditText editText = (EditText) viewInflate.findViewById(f.f12414h3);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.ViewTicketActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    String string = editText.getText().toString();
                    if (string != null && string.equalsIgnoreCase("")) {
                        w.P0(ViewTicketActivity.this.f28439s, "Please enter message");
                    } else {
                        ViewTicketActivity viewTicketActivity = ViewTicketActivity.this;
                        viewTicketActivity.B1(string, viewTicketActivity.f28436p);
                    }
                }
            });
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.ViewTicketActivity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ViewTicketActivity.this.f28436p.dismiss();
                }
            });
            builder.setView(viewInflate);
            this.f28436p = builder.create();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(this.f28436p.getWindow().getAttributes());
            layoutParams.width = -1;
            layoutParams.height = -2;
            this.f28436p.show();
            this.f28436p.getWindow().setAttributes(layoutParams);
            this.f28436p.setCancelable(false);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == f.f12583y0) {
            D1();
        } else if (id == f.f12451l0) {
            onBackPressed();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12878t1);
        this.f28425e = (TextView) findViewById(f.gh);
        this.f28426f = (TextView) findViewById(f.f12129E2);
        this.f28427g = (RecyclerView) findViewById(f.Cd);
        this.f28428h = (TextView) findViewById(f.fh);
        this.f28429i = (Button) findViewById(f.f12583y0);
        this.f28430j = (Button) findViewById(f.f12451l0);
        this.f28431k = (SpinKitView) findViewById(f.Mc);
        this.f28432l = (TextView) findViewById(f.fm);
        this.f28433m = (LinearLayout) findViewById(f.J9);
        this.f28439s = this;
        Thread thread = this.f28440t;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner());
            this.f28440t = thread2;
            thread2.start();
        }
        Button button = this.f28429i;
        button.setOnFocusChangeListener(new w.k((View) button, (Activity) this));
        Button button2 = this.f28430j;
        button2.setOnFocusChangeListener(new w.k((View) button2, (Activity) this));
        Intent intent = getIntent();
        this.f28435o = intent.getStringExtra("ticketid");
        String stringExtra = intent.getStringExtra("Title");
        this.f28437q = stringExtra;
        if (stringExtra == null || stringExtra.equalsIgnoreCase("")) {
            this.f28432l.setVisibility(8);
        } else {
            this.f28432l.setText(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + this.f28437q);
        }
        u1();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f28440t;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f28440t.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f28440t;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner());
            this.f28440t = thread2;
            thread2.start();
        }
    }

    public final void u1() {
        ((ApiService) ApiclientRetrofit.a().create(ApiService.class)).a("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "GetTicket", "no", this.f28435o).enqueue(new Callback<TickedMessageModelClass>() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.ViewTicketActivity.3
            @Override // retrofit2.Callback
            public void onFailure(Call<TickedMessageModelClass> call, Throwable th) {
                ViewTicketActivity.this.C1(Boolean.FALSE);
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<TickedMessageModelClass> call, Response<TickedMessageModelClass> response) {
                if (!response.isSuccessful() || response.body() == null || !response.body().b().equals("success")) {
                    ViewTicketActivity.this.C1(Boolean.FALSE);
                    return;
                }
                ViewTicketActivity.this.C1(Boolean.TRUE);
                ViewTicketActivity.this.f28434n = response.body().a().a();
                List list = ViewTicketActivity.this.f28434n;
                if (list == null || list.size() <= 0) {
                    return;
                }
                ViewTicketActivity viewTicketActivity = ViewTicketActivity.this;
                viewTicketActivity.f28427g.setLayoutManager(new LinearLayoutManager(viewTicketActivity));
                ViewTicketActivity viewTicketActivity2 = ViewTicketActivity.this;
                viewTicketActivity2.f28438r = new TicketMessageAdapter(viewTicketActivity2.f28439s, ViewTicketActivity.this.f28434n);
                ViewTicketActivity viewTicketActivity3 = ViewTicketActivity.this;
                viewTicketActivity3.f28427g.setAdapter(viewTicketActivity3.f28438r);
                ViewTicketActivity.this.f28438r.w();
            }
        });
    }
}
