package com.nst.iptvsmarterstvbox.view.activity;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import b7.AbstractC1232b;
import b7.InterfaceC1233c;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.services.s3.internal.Constants;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.FreeTrailActivity;
import com.nst.iptvsmarterstvbox.miscelleneious.MyApplication;
import com.nst.iptvsmarterstvbox.model.callback.ActivationCallBack;
import com.nst.iptvsmarterstvbox.model.callback.LoginCallback;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.MultiUserDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.LoginActivity;
import com.nst.iptvsmarterstvbox.vpn.activities.ProfileActivity;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import m7.AbstractC2237a;
import m7.w;
import n7.C2298a;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpHead;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import u7.C2858a;
import z7.InterfaceC3059a;

/* JADX INFO: loaded from: classes4.dex */
public class LoginActivity extends androidx.appcompat.app.b implements z7.f, InterfaceC1233c, InterfaceC3059a {

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public static InputFilter f30523T0 = new a();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public TextView f30524A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public SharedPreferences.Editor f30525A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public TextView f30526B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public SharedPreferences f30527B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ImageView f30528C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public SharedPreferences.Editor f30529C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public TextView f30530D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public SharedPreferences f30531D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public RelativeLayout f30532E;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public n7.d f30538H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public String f30542J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public String f30543J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public String f30544K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public String f30545K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f30546L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public String f30547L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ProgressDialog f30548M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public String f30549M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public SharedPreferences f30550N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public SharedPreferences.Editor f30552O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public int f30553O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public SharedPreferences f30554P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public String f30555P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public SharedPreferences f30556Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public C2298a f30557Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public SharedPreferences f30558R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public C2858a f30559R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public SharedPreferences.Editor f30560S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public String f30561S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public SharedPreferences f30562T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public SharedPreferences.Editor f30563U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public LiveStreamDBHandler f30564V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public SharedPreferences f30565W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public SharedPreferences f30566X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public SharedPreferences f30567Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public SharedPreferences f30568Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EditText f30569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EditText f30570e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public SharedPreferences f30571e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f30572f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public SharedPreferences.Editor f30573f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EditText f30574g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public SharedPreferences.Editor f30575g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f30576h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public SharedPreferences.Editor f30577h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f30578i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public SharedPreferences.Editor f30579i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f30580j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public SharedPreferences.Editor f30581j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Button f30582k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public SharedPreferences.Editor f30583k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f30584l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public SharedPreferences f30585l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RelativeLayout f30586m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public SharedPreferences f30587m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RelativeLayout f30588n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public SharedPreferences.Editor f30589n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RelativeLayout f30590o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public MultiUserDBHandler f30591o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public RelativeLayout f30592p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public DatabaseHandler f30593p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public RelativeLayout f30594q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Button f30596r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LinearLayout f30598s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f30600t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public LinearLayout f30602u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RelativeLayout f30604v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ConstraintLayout f30606w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f30608x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ImageView f30610y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f30611y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ImageView f30612z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public SharedPreferences f30613z0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f30534F = -1;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f30536G = false;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Context f30540I = this;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f30595q0 = "";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public String f30597r0 = "";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public String f30599s0 = "";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public String f30601t0 = "";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public long f30603u0 = -1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public String f30605v0 = "";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public String f30607w0 = "";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public long f30609x0 = -1;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public String f30533E0 = "";

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public ArrayList f30535F0 = new ArrayList();

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public String f30537G0 = M1();

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public long f30539H0 = 0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public SimpleDateFormat f30541I0 = new SimpleDateFormat("dd/MM/yyyy");

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public String f30551N0 = Build.MODEL;

    public class a implements InputFilter {
        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i9, int i10, Spanned spanned, int i11, int i12) {
            while (i9 < i10) {
                if (Character.getType(charSequence.charAt(i9)) == 19) {
                    return "";
                }
                i9++;
            }
            return null;
        }
    }

    public class b implements MyApplication.d {
        public b() {
        }

        @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
        public void a(final String str) {
            LoginActivity.this.runOnUiThread(new Runnable() { // from class: p7.M
                @Override // java.lang.Runnable
                public final void run() {
                    this.f46595a.g(str);
                }
            });
        }

        @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
        public void b(final String str) {
            LoginActivity.this.runOnUiThread(new Runnable() { // from class: p7.O
                @Override // java.lang.Runnable
                public final void run() {
                    this.f46600a.f(str);
                }
            });
        }

        public final /* synthetic */ void f(String str) {
            MyApplication.p().D("LX" + str, LoginActivity.this.f30540I);
        }

        public final /* synthetic */ void g(String str) {
            MyApplication.p().D("LX" + str, LoginActivity.this.f30540I);
            AbstractC2237a.f44490c = true;
            SharepreferenceDBHandler.setTypeLogin("login", LoginActivity.this.f30540I);
            LoginActivity.this.startActivity(new Intent(LoginActivity.this.f30540I, (Class<?>) ProfileActivity.class).putExtra("typeid", "login"));
        }

        public final /* synthetic */ void h() {
            AbstractC2237a.f44490c = true;
            SharepreferenceDBHandler.setTypeLogin("login", LoginActivity.this.f30540I);
            LoginActivity.this.startActivity(new Intent(LoginActivity.this.f30540I, (Class<?>) ProfileActivity.class).putExtra("typeid", "login"));
        }

        @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
        public void onSuccess() {
            LoginActivity.this.runOnUiThread(new Runnable() { // from class: p7.N
                @Override // java.lang.Runnable
                public final void run() {
                    this.f46598a.h();
                }
            });
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LoginActivity.this.Y1();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LoginActivity.this.W1();
        }
    }

    public class e implements View.OnClickListener {

        public class a implements MyApplication.d {

            /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.activity.LoginActivity$e$a$a, reason: collision with other inner class name */
            public class RunnableC0275a implements Runnable {
                public RunnableC0275a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    LoginActivity.this.z1();
                }
            }

            public class b implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f30620a;

                public b(String str) {
                    this.f30620a = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    MyApplication.p().D("LX" + this.f30620a, LoginActivity.this.f30540I);
                    LoginActivity.this.z1();
                }
            }

            public class c implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f30622a;

                public c(String str) {
                    this.f30622a = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    MyApplication.p().D("LX" + this.f30622a, LoginActivity.this.f30540I);
                }
            }

            public a() {
            }

            @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
            public void a(String str) {
                LoginActivity.this.runOnUiThread(new b(str));
            }

            @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
            public void b(String str) {
                LoginActivity.this.runOnUiThread(new c(str));
            }

            @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
            public void onSuccess() {
                LoginActivity.this.runOnUiThread(new RunnableC0275a());
            }
        }

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!AbstractC2237a.f44477W0.booleanValue() || (SharepreferenceDBHandler.getSBPDemoAndClientUrl(LoginActivity.this.f30540I) != null && SharepreferenceDBHandler.getSBPDemoAndClientUrl(LoginActivity.this.f30540I).length() > 0)) {
                LoginActivity.this.z1();
            } else {
                MyApplication.p().G(LoginActivity.this.f30540I, new a());
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LoginActivity.this.startActivity(new Intent(LoginActivity.this, (Class<?>) FreeTrailActivity.class));
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AbstractC2237a.f44548y = AbstractC2237a.f44548y.booleanValue() ? Boolean.FALSE : Boolean.TRUE;
            LoginActivity.this.O1();
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LoginActivity loginActivity = LoginActivity.this;
            int i9 = loginActivity.f30534F;
            if (i9 != -1) {
                loginActivity.f30534F = i9 - 1;
                loginActivity.f30570e.setInputType(129);
                LoginActivity.this.f30600t.setImageResource(a7.e.f12011h0);
            } else {
                loginActivity.f30570e.setInputType(145);
                LoginActivity.this.f30600t.setImageResource(a7.e.f12085z2);
                LoginActivity.this.f30534F++;
            }
        }
    }

    public class i extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f30627a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f30628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f30629d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f30630e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f30631f;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f30633a;

            public a(View view) {
                this.f30633a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f30633a;
                    if (view2 == null || view2.getTag() == null || !this.f30633a.getTag().equals("1")) {
                        View view3 = this.f30633a;
                        if (view3 == null || view3.getTag() == null || !this.f30633a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = i.this.f30631f;
                        }
                    } else {
                        linearLayout = i.this.f30630e;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f30633a;
                    if (view4 == null || view4.getTag() == null || !this.f30633a.getTag().equals("1")) {
                        View view5 = this.f30633a;
                        if (view5 == null || view5.getTag() == null || !this.f30633a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = i.this.f30631f;
                        }
                    } else {
                        linearLayout = i.this.f30630e;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        public i(Activity activity) {
            super(activity);
            this.f30627a = activity;
        }

        public final /* synthetic */ void d() {
            LoginActivity.this.Y1();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (view.getId() == a7.f.f12524s1) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: p7.P
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f46603a.d();
                        }
                    }, 200L);
                    dismiss();
                } else if (view.getId() != a7.f.f12313X0) {
                } else {
                    dismiss();
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(LoginActivity.this.f30559R0.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12819j2 : a7.g.f12813i2);
            this.f30628c = (TextView) findViewById(a7.f.f12524s1);
            this.f30629d = (TextView) findViewById(a7.f.f12313X0);
            this.f30630e = (LinearLayout) findViewById(a7.f.Ia);
            this.f30631f = (LinearLayout) findViewById(a7.f.V8);
            this.f30628c.setOnClickListener(this);
            this.f30629d.setOnClickListener(this);
            TextView textView = this.f30628c;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f30629d;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    public class j extends AsyncTask {

        public class a implements MyApplication.d {
            public a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void f(String str) {
                MyApplication.p().D("LX" + str, LoginActivity.this.f30540I);
                LoginActivity.this.b();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void g(String str) {
                MyApplication.p().D("LX" + str, LoginActivity.this.f30540I);
                LoginActivity.this.V1();
            }

            @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
            public void a(final String str) {
                LoginActivity.this.runOnUiThread(new Runnable() { // from class: p7.Q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f46605a.g(str);
                    }
                });
            }

            @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
            public void b(final String str) {
                LoginActivity.this.runOnUiThread(new Runnable() { // from class: p7.T
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f46611a.f(str);
                    }
                });
            }

            @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
            public void onSuccess() {
                final LoginActivity loginActivity = LoginActivity.this;
                loginActivity.runOnUiThread(new Runnable() { // from class: p7.S
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivity.F1(loginActivity);
                    }
                });
            }
        }

        public j() {
        }

        public /* synthetic */ j(LoginActivity loginActivity, a aVar) {
            this();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://www.google.com").openConnection();
                httpURLConnection.setRequestMethod(HttpHead.METHOD_NAME);
                httpURLConnection.setReadTimeout(1500);
                httpURLConnection.setConnectTimeout(1500);
                return Boolean.valueOf(httpURLConnection.getResponseCode() == 200);
            } catch (Exception e9) {
                Log.e("LOG_TAG", e9.toString());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                if (AbstractC2237a.f44477W0.booleanValue()) {
                    MyApplication.p().G(LoginActivity.this.f30540I, new a());
                    return;
                } else {
                    LoginActivity.this.V1();
                    return;
                }
            }
            LoginActivity.this.b();
            LoginActivity loginActivity = LoginActivity.this;
            i iVar = loginActivity.new i((Activity) loginActivity.f30540I);
            iVar.setCancelable(false);
            iVar.show();
        }
    }

    public class k implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f30637a;

        public k(View view) {
            this.f30637a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30637a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30637a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30637a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            View view2;
            LoginActivity loginActivity;
            TextView textView;
            EditText editText;
            int length;
            if (!z9) {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                b(f9);
                c(f9);
                a(z9);
                View view3 = this.f30637a;
                if (view3 == null || view3.getTag() == null || !this.f30637a.getTag().equals("rl_list_users")) {
                    View view4 = this.f30637a;
                    if (view4 == null || view4.getTag() == null || !this.f30637a.getTag().equals("rl_connect_vpn")) {
                        View view5 = this.f30637a;
                        if ((view5 != null && view5.getTag() != null && this.f30637a.getTag().equals("rl_login_from_mobile_app")) || (view2 = this.f30637a) == null || view2.getTag() == null || !this.f30637a.getTag().equals("rl_bt_submit")) {
                            return;
                        }
                        LoginActivity.this.f30594q.setBackgroundResource(a7.e.f12058t);
                        loginActivity = LoginActivity.this;
                        textView = loginActivity.f30526B;
                    } else {
                        LoginActivity.this.f30532E.setBackgroundResource(a7.e.f11996d1);
                        LoginActivity.this.f30612z.setImageResource(a7.e.f12004f1);
                        loginActivity = LoginActivity.this;
                        textView = loginActivity.f30524A;
                    }
                } else {
                    LoginActivity.this.f30604v.setBackgroundResource(a7.e.f11996d1);
                    LoginActivity.this.f30528C.setImageResource(a7.e.f12012h1);
                    loginActivity = LoginActivity.this;
                    textView = loginActivity.f30530D;
                }
                textView.setTextColor(loginActivity.f30540I.getResources().getColor(a7.c.f11855f));
                return;
            }
            f9 = z9 ? 1.15f : 1.0f;
            try {
                Log.e("id is", "" + this.f30637a.getTag());
                if (this.f30637a.getTag().equals("1")) {
                    editText = LoginActivity.this.f30569d;
                    length = editText.length();
                } else if (this.f30637a.getTag().equals("2")) {
                    editText = LoginActivity.this.f30570e;
                    length = editText.length();
                } else {
                    if (!this.f30637a.getTag().equals("3")) {
                        if (this.f30637a.getTag().equals("rl_list_users")) {
                            LoginActivity.this.f30604v.setBackgroundResource(a7.e.f11992c1);
                            LoginActivity.this.f30528C.setImageResource(a7.e.f12008g1);
                            LoginActivity loginActivity2 = LoginActivity.this;
                            loginActivity2.f30530D.setTextColor(loginActivity2.f30540I.getResources().getColor(a7.c.f11849G));
                            b(f9);
                        } else if (this.f30637a.getTag().equals("rl_connect_vpn")) {
                            LoginActivity.this.f30532E.setBackgroundResource(a7.e.f11992c1);
                            LoginActivity.this.f30612z.setImageResource(a7.e.f12000e1);
                            LoginActivity loginActivity3 = LoginActivity.this;
                            loginActivity3.f30524A.setTextColor(loginActivity3.f30540I.getResources().getColor(a7.c.f11849G));
                            b(f9);
                        } else {
                            if (!this.f30637a.getTag().equals("rl_login_from_mobile_app")) {
                                if (this.f30637a.getTag().equals("rl_bt_submit")) {
                                    LoginActivity.this.f30594q.setBackgroundResource(a7.e.f12054s);
                                    LoginActivity loginActivity4 = LoginActivity.this;
                                    loginActivity4.f30526B.setTextColor(loginActivity4.f30540I.getResources().getColor(a7.c.f11849G));
                                    return;
                                }
                                return;
                            }
                            b(f9);
                        }
                        c(f9);
                        return;
                    }
                    editText = LoginActivity.this.f30572f;
                    length = editText.length();
                }
                editText.setSelection(length);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public static /* synthetic */ void F1(LoginActivity loginActivity) {
        loginActivity.V1();
    }

    private static String I1(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean z9 = true;
        for (char c9 : charArray) {
            if (z9 && Character.isLetter(c9)) {
                sb.append(Character.toUpperCase(c9));
                z9 = false;
            } else {
                if (Character.isWhitespace(c9)) {
                    z9 = true;
                }
                sb.append(c9);
            }
        }
        return sb.toString();
    }

    private void J1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    public static String N1() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return I1(str2);
        }
        return I1(str) + " " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O1() {
        TextView textView;
        int i9;
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        ProgressDialog progressDialog;
        String string;
        try {
            this.f30540I = this;
            this.f30591o0 = new MultiUserDBHandler(this.f30540I);
            this.f30564V = new LiveStreamDBHandler(this.f30540I);
            if (AbstractC2237a.f44550z.booleanValue()) {
                this.f30584l.setVisibility(0);
            }
            if (AbstractC2237a.f44538t.booleanValue()) {
                textView = this.f30584l;
                i9 = a7.f.Ae;
            } else {
                textView = this.f30584l;
                i9 = a7.f.he;
            }
            textView.setNextFocusLeftId(i9);
            if (AbstractC2237a.f44548y.booleanValue()) {
                this.f30569d.setHint((CharSequence) null);
                this.f30569d.setHint("");
                this.f30584l.setText(getResources().getString(a7.j.f13092O8));
                this.f30578i.setText(getResources().getString(a7.j.f13318m1));
                this.f30592p.setVisibility(8);
                this.f30598s.setVisibility(8);
                this.f30569d.setVisibility(8);
                this.f30569d.setVisibility(0);
                this.f30569d.setHint(getResources().getString(a7.j.f13336o));
                this.f30526B.setText(getResources().getString(a7.j.f13337o0));
                if (AbstractC2237a.f44538t.booleanValue()) {
                    this.f30586m.setVisibility(0);
                } else {
                    this.f30586m.setVisibility(8);
                }
                if ((AbstractC2237a.f44536s.booleanValue() && AbstractC2237a.f44538t.booleanValue()) || AbstractC2237a.f44540u.booleanValue()) {
                    relativeLayout2 = this.f30604v;
                    relativeLayout2.setVisibility(0);
                } else {
                    relativeLayout = this.f30604v;
                    relativeLayout.setVisibility(8);
                }
            } else {
                if (AbstractC2237a.f44538t.booleanValue()) {
                    this.f30569d.setHint((CharSequence) null);
                    this.f30569d.setHint("");
                    this.f30584l.setText(getResources().getString(a7.j.f13102P8));
                    this.f30526B.setText(getResources().getString(a7.j.f13376s));
                    this.f30569d.setVisibility(8);
                    this.f30569d.setVisibility(0);
                    this.f30569d.setHint(getResources().getString(a7.j.f13395t8));
                    this.f30598s.setVisibility(0);
                    this.f30586m.setVisibility(0);
                    if (AbstractC2237a.f44526o.booleanValue()) {
                        this.f30592p.setVisibility(0);
                    } else {
                        this.f30592p.setVisibility(8);
                    }
                    if ((AbstractC2237a.f44536s.booleanValue() && AbstractC2237a.f44538t.booleanValue()) || AbstractC2237a.f44540u.booleanValue()) {
                        relativeLayout2 = this.f30604v;
                        relativeLayout2.setVisibility(0);
                    } else {
                        relativeLayout = this.f30604v;
                    }
                } else {
                    this.f30569d.setHint((CharSequence) null);
                    this.f30569d.setHint("");
                    this.f30584l.setText(getResources().getString(a7.j.f13102P8));
                    this.f30578i.setText(getResources().getString(a7.j.f12954B0));
                    this.f30569d.setVisibility(8);
                    this.f30569d.setVisibility(0);
                    this.f30598s.setVisibility(0);
                    this.f30569d.setHint(getResources().getString(a7.j.f13395t8));
                    this.f30526B.setText(getResources().getString(a7.j.f13101P7));
                    this.f30592p.setVisibility(8);
                    this.f30586m.setVisibility(8);
                    relativeLayout = this.f30604v;
                }
                relativeLayout.setVisibility(8);
            }
            this.f30574g.setError(null);
            this.f30569d.setError(null);
            this.f30570e.setError(null);
            this.f30593p0 = new DatabaseHandler(this.f30540I);
            if (this.f30540I != null) {
                this.f30548M = new ProgressDialog(this.f30540I);
                String str = this.f30555P0;
                if (str != null && str.equalsIgnoreCase("login_perform")) {
                    progressDialog = this.f30548M;
                    string = "Auto Login";
                } else if (AbstractC2237a.f44548y.booleanValue()) {
                    this.f30548M.setMessage("");
                    progressDialog = this.f30548M;
                    string = getResources().getString(a7.j.f13402u5);
                } else {
                    this.f30548M.setMessage("");
                    progressDialog = this.f30548M;
                    string = getResources().getString(a7.j.f13392t5);
                }
                progressDialog.setMessage(string);
                this.f30548M.setCanceledOnTouchOutside(false);
                this.f30548M.setCancelable(false);
                this.f30548M.setProgressStyle(0);
            }
            this.f30542J = this.f30569d.getText().toString();
            this.f30544K = this.f30570e.getText().toString();
            this.f30538H = new n7.d(this, this.f30540I);
            this.f30550N = getSharedPreferences("sharedPreference", 0);
            this.f30556Q = getSharedPreferences("loginPrefs", 0);
            this.f30558R = getSharedPreferences("selected_language", 0);
            SharedPreferences sharedPreferences = getSharedPreferences("loginPrefsserverurl", 0);
            this.f30562T = sharedPreferences;
            this.f30563U = sharedPreferences.edit();
            SharedPreferences sharedPreferences2 = getSharedPreferences("upgradeDatePref", 0);
            this.f30585l0 = sharedPreferences2;
            this.f30583k0 = sharedPreferences2.edit();
            this.f30560S = this.f30554P.edit();
            this.f30552O = this.f30550N.edit();
            SharedPreferences sharedPreferences3 = getSharedPreferences("multiDNS", 0);
            this.f30613z0 = sharedPreferences3;
            this.f30525A0 = sharedPreferences3.edit();
            SharedPreferences sharedPreferences4 = getSharedPreferences("multiDNSValid", 0);
            this.f30527B0 = sharedPreferences4;
            this.f30529C0 = sharedPreferences4.edit();
            this.f30531D0 = getSharedPreferences("serverUrlDNS", 0);
            if (AbstractC2237a.f44538t.booleanValue()) {
                this.f30569d.setText("");
                this.f30570e.setText("");
            }
            R1();
        } catch (Resources.NotFoundException e9) {
            e9.printStackTrace();
        }
    }

    public static String S1(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b9 : bArrDigest) {
                String hexString = Integer.toHexString(b9 & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e9) {
            e9.printStackTrace();
            return "";
        }
    }

    private void X1(String str) {
        if (str != null && !str.equals("") && !str.isEmpty()) {
            this.f30535F0 = new ArrayList(Arrays.asList(str.split(",")));
        }
        ArrayList arrayList = this.f30535F0;
        if (arrayList == null || arrayList.size() < 1) {
            ArrayList arrayList2 = this.f30535F0;
            if (arrayList2 == null || arrayList2.size() != 0) {
                return;
            }
            b();
            Toast.makeText(this, this.f30540I.getResources().getString(a7.j.f13312l5), 0).show();
            return;
        }
        try {
            this.f30563U.putString(AbstractC2237a.f44454L, ((String) this.f30535F0.get(0)).trim());
            this.f30563U.commit();
            this.f30535F0.remove(0);
            this.f30538H.h(this.f30542J, this.f30544K, this.f30535F0);
        } catch (IOException e9) {
            e9.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y1() {
        this.f30542J = this.f30569d.getText().toString().trim();
        this.f30544K = this.f30570e.getText().toString().trim();
        this.f30611y0 = this.f30574g.getText().toString().trim();
        this.f30563U = this.f30562T.edit();
        if (K1()) {
            a();
            new j(this, null).execute(new Void[0]);
        }
    }

    public void H1() {
        try {
            this.f30549M0 = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e9) {
            e9.printStackTrace();
        }
    }

    public boolean K1() {
        EditText editText;
        Resources resources;
        int i9;
        EditText editText2;
        Resources resources2;
        int i10;
        if (AbstractC2237a.f44538t.booleanValue() && this.f30574g.getText().toString().trim().length() == 0) {
            this.f30574g.requestFocus();
            editText = this.f30574g;
            resources = getResources();
            i9 = a7.j.f13328n1;
        } else {
            if (this.f30569d.getText().toString().trim().length() == 0) {
                this.f30569d.requestFocus();
                if (AbstractC2237a.f44548y.booleanValue()) {
                    editText2 = this.f30569d;
                    resources2 = getResources();
                    i10 = a7.j.f13318m1;
                } else {
                    editText2 = this.f30569d;
                    resources2 = getResources();
                    i10 = a7.j.f12945A1;
                }
                editText2.setError(resources2.getString(i10));
                return false;
            }
            if (!AbstractC2237a.f44548y.booleanValue() && this.f30570e.getText().toString().trim().length() == 0) {
                this.f30570e.requestFocus();
                editText = this.f30570e;
                resources = getResources();
                i9 = a7.j.f13408v1;
            } else {
                if (!AbstractC2237a.f44526o.booleanValue() || this.f30572f.getText().toString().trim().length() != 0) {
                    return true;
                }
                this.f30572f.requestFocus();
                editText = this.f30572f;
                resources = getResources();
                i9 = a7.j.f13418w1;
            }
        }
        editText.setError(resources.getString(i9));
        return false;
    }

    public void L1() {
        Button button;
        int i9;
        U1();
        this.f30532E.setOnClickListener(new View.OnClickListener() { // from class: p7.K
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46591a.P1(view);
            }
        });
        this.f30594q.setOnClickListener(new c());
        this.f30604v.setOnClickListener(new d());
        this.f30606w.setOnClickListener(new e());
        if (AbstractC2237a.f44546x.booleanValue()) {
            button = this.f30582k;
            i9 = 0;
        } else {
            button = this.f30582k;
            i9 = 8;
        }
        button.setVisibility(i9);
        this.f30582k.setOnClickListener(new f());
        this.f30584l.setOnClickListener(new g());
    }

    public final String M1() {
        return w.p0(Calendar.getInstance().getTime().toString());
    }

    public final /* synthetic */ void P1(View view) {
        Intent intent;
        if (!AbstractC2237a.f44477W0.booleanValue()) {
            AbstractC2237a.f44490c = true;
            SharepreferenceDBHandler.setTypeLogin("login", this.f30540I);
            intent = new Intent(this.f30540I, (Class<?>) ProfileActivity.class);
        } else if (SharepreferenceDBHandler.getSBPDemoAndClientUrl(this.f30540I) == null || SharepreferenceDBHandler.getSBPDemoAndClientUrl(this.f30540I).length() <= 0) {
            MyApplication.p().G(this.f30540I, new b());
            return;
        } else {
            AbstractC2237a.f44490c = true;
            SharepreferenceDBHandler.setTypeLogin("login", this.f30540I);
            intent = new Intent(this.f30540I, (Class<?>) ProfileActivity.class);
        }
        startActivity(intent.putExtra("typeid", "login"));
    }

    public final /* synthetic */ void Q1() {
        this.f30536G = false;
    }

    public void R1() {
        EditText editText;
        try {
            if (AbstractC2237a.f44538t.booleanValue()) {
                this.f30574g.requestFocus();
                editText = this.f30574g;
            } else {
                this.f30569d.requestFocus();
                editText = this.f30569d;
            }
            editText.requestFocusFromTouch();
            b();
        } catch (Exception unused) {
        }
    }

    @Override // z7.InterfaceC3059a
    public void S(String str) {
        b();
        if (str != null) {
            w.P0(this.f30540I, str);
        } else {
            w.P0(this.f30540I, "Your Activation code is not invalid");
        }
    }

    @Override // b7.InterfaceC1233c
    /* JADX INFO: renamed from: T1, reason: merged with bridge method [inline-methods] */
    public void K0(String str, int i9, boolean z9) {
        String strTrim;
        if (!z9) {
            b();
            Toast.makeText(this, this.f30540I.getResources().getString(a7.j.f12944A0), 0).show();
            return;
        }
        if (i9 == 1) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                AbstractC1232b.f17694a = jSONObject;
                if (!jSONObject.getString("status").equalsIgnoreCase("true")) {
                    b();
                    Toast.makeText(this, this.f30540I.getResources().getString(a7.j.f13071M7), 0).show();
                    return;
                }
                this.f30605v0 = AbstractC1232b.f17694a.getString("su");
                this.f30607w0 = AbstractC1232b.f17694a.getString("ndd");
                this.f30609x0 = System.currentTimeMillis();
                try {
                    if (AbstractC2237a.f44548y.booleanValue()) {
                        this.f30542J = SharepreferenceDBHandler.getUserName(this.f30540I);
                        strTrim = SharepreferenceDBHandler.getUserPassword(this.f30540I);
                    } else {
                        this.f30542J = this.f30569d.getText().toString().trim();
                        strTrim = this.f30570e.getText().toString().trim();
                    }
                    this.f30544K = strTrim;
                    b7.f.e(this, AbstractC1232b.f17694a.optString("su"));
                    this.f30545K0 = S1(AbstractC1232b.f17694a.optString("su") + "*" + b7.f.d(this) + "*" + AbstractC1232b.f17695b);
                    if (!AbstractC1232b.f17694a.getString("sc").equalsIgnoreCase(this.f30545K0)) {
                        b();
                        Toast.makeText(this, this.f30540I.getResources().getString(a7.j.f12944A0), 0).show();
                        return;
                    }
                    this.f30563U.putString(AbstractC2237a.f44454L, b7.f.a(this));
                    this.f30563U.apply();
                    this.f30552O.putString(AbstractC2237a.f44454L, b7.f.a(this));
                    this.f30552O.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, this.f30542J);
                    this.f30552O.apply();
                    if (AbstractC2237a.f44538t.booleanValue()) {
                        X1(this.f30605v0.toLowerCase());
                    } else {
                        this.f30538H.g(this.f30542J, this.f30544K);
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            } catch (Exception e10) {
                Log.e("Login check", e10.getMessage());
            }
        }
    }

    public final void U1() {
        EditText editText;
        int i9;
        EditText editText2;
        int i10;
        EditText editText3;
        int i11;
        EditText editText4;
        this.f30574g = new EditText(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        this.f30574g.setPaddingRelative(35, 0, 35, 0);
        this.f30574g.setLayoutParams(layoutParams);
        this.f30574g.setHint(getResources().getString(a7.j.d9));
        this.f30574g.setHintTextColor(getResources().getColor(a7.c.f11849G));
        this.f30574g.setHintTextColor(-1);
        if (AbstractC2237a.f44538t.booleanValue()) {
            editText = this.f30574g;
            i9 = a7.f.Ae;
        } else {
            editText = this.f30574g;
            i9 = a7.f.he;
        }
        editText.setNextFocusLeftId(i9);
        this.f30574g.setTextSize(22.0f);
        this.f30574g.setId(101);
        this.f30574g.setBackground(getResources().getDrawable(a7.e.f11927J1));
        if (this.f30561S0.equals(AbstractC2237a.f44453K0)) {
            this.f30574g.setFocusable(true);
        }
        EditText editText5 = this.f30574g;
        Typeface typeface = Typeface.SANS_SERIF;
        editText5.setTypeface(typeface);
        this.f30574g.setInputType(161);
        this.f30586m.addView(this.f30574g);
        this.f30569d = new EditText(this);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        this.f30569d.setPaddingRelative(35, 0, 35, 0);
        this.f30569d.setLayoutParams(layoutParams2);
        if (AbstractC2237a.f44550z.booleanValue()) {
            this.f30602u.setGravity(16);
        }
        this.f30569d.setHint(getResources().getString(a7.j.f13395t8));
        this.f30569d.setHintTextColor(getResources().getColor(a7.c.f11849G));
        this.f30569d.setHintTextColor(-1);
        this.f30569d.setTextSize(22.0f);
        this.f30569d.setId(HttpStatus.SC_PROCESSING);
        if (AbstractC2237a.f44538t.booleanValue()) {
            editText2 = this.f30569d;
            i10 = a7.f.Ae;
        } else {
            editText2 = this.f30569d;
            i10 = a7.f.he;
        }
        editText2.setNextFocusLeftId(i10);
        if (this.f30561S0.equals(AbstractC2237a.f44453K0)) {
            this.f30569d.setFocusable(true);
        }
        this.f30569d.setBackground(getResources().getDrawable(a7.e.f11927J1));
        this.f30569d.setTypeface(typeface);
        this.f30569d.setInputType(161);
        this.f30588n.addView(this.f30569d);
        this.f30570e = new EditText(this);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        this.f30570e.setPaddingRelative(35, 0, 35, 0);
        this.f30570e.setLayoutParams(layoutParams3);
        this.f30570e.setHint(getResources().getString(a7.j.f13174X4));
        this.f30570e.setHintTextColor(getResources().getColor(a7.c.f11849G));
        this.f30570e.setHintTextColor(-1);
        this.f30570e.setTextSize(22.0f);
        this.f30570e.setId(103);
        if (AbstractC2237a.f44538t.booleanValue()) {
            editText3 = this.f30570e;
            i11 = a7.f.Ae;
        } else {
            editText3 = this.f30570e;
            i11 = a7.f.he;
        }
        editText3.setNextFocusLeftId(i11);
        this.f30570e.setBackground(getResources().getDrawable(a7.e.f11927J1));
        if (this.f30561S0.equals(AbstractC2237a.f44453K0)) {
            this.f30570e.setFocusable(true);
        }
        this.f30570e.setTypeface(typeface);
        this.f30570e.setInputType(129);
        this.f30590o.addView(this.f30570e);
        this.f30600t.setId(IjkMediaMeta.FF_PROFILE_H264_HIGH_10);
        if (this.f30561S0.equals(AbstractC2237a.f44453K0)) {
            this.f30600t.setFocusable(true);
        }
        this.f30570e.setNextFocusDownId(104);
        this.f30570e.setNextFocusUpId(HttpStatus.SC_PROCESSING);
        this.f30600t.setNextFocusDownId(104);
        this.f30600t.setNextFocusUpId(HttpStatus.SC_PROCESSING);
        this.f30600t.setBackground(getResources().getDrawable(a7.e.f11927J1));
        this.f30600t.setOnClickListener(new h());
        if (AbstractC2237a.f44526o.booleanValue()) {
            this.f30572f = new EditText(this);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -1);
            this.f30572f.setPaddingRelative(35, 0, 35, 0);
            this.f30572f.setLayoutParams(layoutParams4);
            this.f30572f.setHint(getResources().getString(a7.j.f13100P6));
            this.f30572f.setHintTextColor(getResources().getColor(a7.c.f11849G));
            this.f30572f.setHintTextColor(-1);
            this.f30572f.setTextSize(22.0f);
            this.f30572f.setId(104);
            this.f30572f.setBackground(getResources().getDrawable(a7.e.f11927J1));
            this.f30572f.setFocusable(true);
            this.f30572f.setTypeface(typeface);
            this.f30572f.setInputType(161);
            this.f30592p.addView(this.f30572f);
        }
        if (AbstractC2237a.f44538t.booleanValue()) {
            if (!this.f30561S0.equals(AbstractC2237a.f44453K0)) {
                return;
            }
            this.f30574g.requestFocus();
            editText4 = this.f30574g;
        } else {
            if (!this.f30561S0.equals(AbstractC2237a.f44453K0)) {
                return;
            }
            this.f30569d.requestFocus();
            editText4 = this.f30569d;
        }
        editText4.requestFocusFromTouch();
    }

    public final void V1() {
        if (AbstractC2237a.f44548y.booleanValue()) {
            SharepreferenceDBHandler.setActivationCode(this.f30540I, this.f30542J);
            this.f30611y0 = this.f30574g.getText().toString().trim();
            C2298a c2298a = new C2298a(this, this.f30540I);
            this.f30557Q0 = c2298a;
            c2298a.a(this.f30542J);
            return;
        }
        try {
            if (AbstractC2237a.f44523n.booleanValue()) {
                this.f30563U.putString(AbstractC2237a.f44454L, "http://qqtv.nl");
                this.f30563U.apply();
                this.f30552O.putString(AbstractC2237a.f44454L, "http://qqtv.nl");
                this.f30552O.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, this.f30542J);
                this.f30552O.apply();
                if (AbstractC2237a.f44538t.booleanValue()) {
                    X1("http://qqtv.nl");
                } else {
                    this.f30538H.g(this.f30542J, this.f30544K);
                }
            } else if (AbstractC2237a.f44526o.booleanValue()) {
                String lowerCase = this.f30572f.getText().toString().trim().toLowerCase();
                this.f30546L = lowerCase;
                this.f30563U.putString(AbstractC2237a.f44454L, lowerCase);
                this.f30563U.apply();
                this.f30552O.putString(AbstractC2237a.f44454L, this.f30546L);
                this.f30552O.apply();
                this.f30538H.g(this.f30542J, this.f30544K);
            } else {
                y1();
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        this.f30560S.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, this.f30542J);
        this.f30560S.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, this.f30544K);
        this.f30560S.putString("activationCode", "");
        this.f30560S.putString("loginWith", "loginWithDetails");
        this.f30560S.apply();
        this.f30563U.apply();
    }

    public final void W1() {
        SharepreferenceDBHandler.setCurrentAPPType("api", this.f30540I);
        startActivity(new Intent(this, (Class<?>) MultiUserActivity.class));
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        finish();
    }

    @Override // z7.b
    public void a() {
        ProgressDialog progressDialog = this.f30548M;
        if (progressDialog != null) {
            progressDialog.show();
        }
    }

    @Override // z7.b
    public void b() {
        try {
            ProgressDialog progressDialog = this.f30548M;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    @Override // b7.InterfaceC1233c
    public void b0(int i9) {
        if (this.f30540I != null) {
            b();
            Toast.makeText(this, this.f30540I.getResources().getString(a7.j.f12944A0), 0).show();
        }
    }

    @Override // z7.f
    public void c(String str) {
        b();
        if (!str.equals("")) {
            w.P0(this.f30540I, str);
        } else if (AbstractC2237a.f44523n.booleanValue()) {
            Toast.makeText(this, getResources().getString(a7.j.f12966C2), 0).show();
        } else {
            w.P0(this.f30540I, "Your Account is invalid or has expired !");
        }
    }

    @Override // z7.b
    public void d(String str) {
        if (this.f30540I == null || str.isEmpty()) {
            return;
        }
        w.P0(this.f30540I, str);
    }

    @Override // z7.f
    public void e(String str) {
        ProgressDialog progressDialog = this.f30548M;
        if (progressDialog != null) {
            progressDialog.dismiss();
            Toast.makeText(this, this.f30540I.getResources().getString(a7.j.f13006G2), 0).show();
        }
    }

    @Override // z7.f
    public void h0(ArrayList arrayList, String str) {
        if (arrayList == null || arrayList.size() <= 0) {
            b();
            if (AbstractC2237a.f44523n.booleanValue()) {
                Toast.makeText(this, getResources().getString(a7.j.f12966C2), 0).show();
                return;
            } else {
                w.P0(this.f30540I, "Your Account is invalid or has expired !");
                return;
            }
        }
        try {
            this.f30563U.putString(AbstractC2237a.f44454L, ((String) arrayList.get(0)).trim());
            this.f30563U.apply();
            arrayList.remove(0);
            this.f30538H.h(this.f30542J, this.f30544K, arrayList);
        } catch (IOException e9) {
            e9.printStackTrace();
        }
    }

    @Override // z7.f
    public void m(LoginCallback loginCallback, String str) {
        int i9;
        String string;
        if (this.f30540I != null) {
            if (loginCallback == null || loginCallback.getUserLoginInfo() == null) {
                b();
                d(getResources().getString(a7.j.f12996F2));
                return;
            }
            if (loginCallback.getUserLoginInfo().getAuth().intValue() == 1) {
                String status = loginCallback.getUserLoginInfo().getStatus();
                if (status.equals("Active")) {
                    String username = loginCallback.getUserLoginInfo().getUsername();
                    String password = loginCallback.getUserLoginInfo().getPassword();
                    String port = loginCallback.getServerInfo().getPort();
                    String url = loginCallback.getServerInfo().getUrl();
                    String expDate = loginCallback.getUserLoginInfo().getExpDate();
                    String isTrial = loginCallback.getUserLoginInfo().getIsTrial();
                    String activeCons = loginCallback.getUserLoginInfo().getActiveCons();
                    String createdAt = loginCallback.getUserLoginInfo().getCreatedAt();
                    String maxConnections = loginCallback.getUserLoginInfo().getMaxConnections();
                    List<String> allowedOutputFormats = loginCallback.getUserLoginInfo().getAllowedOutputFormats();
                    String serverProtocal = loginCallback.getServerInfo().getServerProtocal();
                    String httpsPort = loginCallback.getServerInfo().getHttpsPort();
                    String rtmpPort = loginCallback.getServerInfo().getRtmpPort();
                    String timezone = loginCallback.getServerInfo().getTimezone();
                    if (allowedOutputFormats.size() != 0) {
                        allowedOutputFormats.get(0);
                    }
                    this.f30540I.getSharedPreferences("loginPrefsserverurl", 0).getString(AbstractC2237a.f44454L, "").toLowerCase();
                    SharedPreferences.Editor editorEdit = getSharedPreferences("loginPrefs", 0).edit();
                    editorEdit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, username);
                    editorEdit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, password);
                    editorEdit.putString("serverPort", port);
                    editorEdit.putString("serverUrl", url);
                    editorEdit.putString("expDate", expDate);
                    editorEdit.putString("isTrial", isTrial);
                    editorEdit.putString("activeCons", activeCons);
                    editorEdit.putString("createdAt", createdAt);
                    editorEdit.putString("maxConnections", maxConnections);
                    editorEdit.putString(AbstractC2237a.f44454L, url + ":" + port);
                    editorEdit.putString("serverProtocol", serverProtocal);
                    editorEdit.putString("serverPortHttps", httpsPort);
                    editorEdit.putString("serverPortRtmp", rtmpPort);
                    editorEdit.putString("serverTimeZone", timezone);
                    editorEdit.apply();
                    this.f30565W = this.f30540I.getSharedPreferences("allowedFormat", 0);
                    this.f30566X = this.f30540I.getSharedPreferences("timeFormat", 0);
                    this.f30567Y = this.f30540I.getSharedPreferences("epgchannelupdate", 0);
                    this.f30568Z = this.f30540I.getSharedPreferences("automation_channels", 0);
                    this.f30571e0 = this.f30540I.getSharedPreferences("automation_epg", 0);
                    this.f30577h0 = this.f30565W.edit();
                    this.f30573f0 = this.f30566X.edit();
                    this.f30575g0 = this.f30567Y.edit();
                    this.f30579i0 = this.f30568Z.edit();
                    this.f30581j0 = this.f30571e0.edit();
                    SharedPreferences sharedPreferences = this.f30540I.getSharedPreferences("auto_start", 0);
                    this.f30587m0 = sharedPreferences;
                    SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                    this.f30589n0 = editorEdit2;
                    if (editorEdit2 != null) {
                        editorEdit2.putBoolean("full_epg", true);
                        this.f30589n0.apply();
                    }
                    if (this.f30568Z.getString("automation_channels", "").equals("")) {
                        this.f30579i0.putString("automation_channels", "checked");
                        this.f30579i0.apply();
                    }
                    if (this.f30571e0.getString("automation_epg", "").equals("")) {
                        this.f30581j0.putString("automation_epg", "checked");
                        this.f30581j0.apply();
                    }
                    AbstractC2237a.f44491c0 = Boolean.FALSE;
                    if (this.f30565W.getString("allowedFormat", "").equals("")) {
                        this.f30577h0.putString("allowedFormat", "ts");
                        this.f30577h0.apply();
                    }
                    if (this.f30566X.getString("timeFormat", AbstractC2237a.f44441E0).equals("")) {
                        this.f30573f0.putString("timeFormat", AbstractC2237a.f44441E0);
                        this.f30573f0.apply();
                    }
                    if (this.f30567Y.getString("epgchannelupdate", "").equals("")) {
                        this.f30575g0.putString("epgchannelupdate", "all");
                        this.f30575g0.apply();
                    }
                    this.f30591o0 = new MultiUserDBHandler(this.f30540I);
                    boolean zBooleanValue = AbstractC2237a.f44526o.booleanValue();
                    MultiUserDBHandler multiUserDBHandler = this.f30591o0;
                    if (zBooleanValue) {
                        try {
                            if (multiUserDBHandler.checkregistration(this.f30611y0, username, password, url, "api", url, "")) {
                                b();
                                Toast.makeText(this.f30540I, getString(a7.j.f12973D) + this.f30611y0 + getString(a7.j.f13405u8) + username + getString(a7.j.f12993F) + AbstractC2237a.f44482Z, 0).show();
                            } else {
                                this.f30591o0.addmultiusers(this.f30611y0, username, password, AbstractC2237a.f44482Z, url, "api");
                                Toast.makeText(this.f30540I, getResources().getString(a7.j.f13375r8), 0).show();
                            }
                        } catch (WindowManager.BadTokenException e9) {
                            e9.printStackTrace();
                        }
                        SharedPreferences.Editor editorEdit3 = this.f30540I.getSharedPreferences("loginprefsmultiuser", 0).edit();
                        editorEdit3.putString("name", this.f30611y0);
                        editorEdit3.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, username);
                        editorEdit3.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, password);
                        editorEdit3.putString(AbstractC2237a.f44454L, url);
                        editorEdit3.apply();
                    } else if (!multiUserDBHandler.checkregistration("", username, password, url, "api", url, "")) {
                        this.f30591o0.addmultiusers("", username, password, AbstractC2237a.f44482Z, url, "api");
                    }
                    if (this.f30540I != null) {
                        SharepreferenceDBHandler.setUserID(this.f30591o0.getAutoIdLoggedInUser(this.f30611y0, username, password, url, "api", url, ""), this.f30540I);
                    }
                    b();
                    startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                    finish();
                    return;
                }
                b();
                string = getResources().getString(a7.j.f13016H2) + status;
                i9 = 0;
            } else {
                i9 = 0;
                if (!str.equals("validateLogin")) {
                    return;
                }
                b();
                string = getResources().getString(a7.j.f12976D2);
            }
            Toast.makeText(this, string, i9).show();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (AbstractC2237a.f44540u.booleanValue()) {
            finish();
            finishAffinity();
        } else {
            if (this.f30536G) {
                finish();
                finishAffinity();
                return;
            }
            this.f30536G = true;
            try {
                Toast.makeText(this, getResources().getString(a7.j.f12999F5), 0).show();
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            new Handler().postDelayed(new Runnable() { // from class: p7.L
                @Override // java.lang.Runnable
                public final void run() {
                    this.f46593a.Q1();
                }
            }, 2000L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x018b  */
    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r4) {
        /*
            Method dump skipped, instruction units count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.LoginActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        if (i9 != 19) {
            return super.onKeyUp(i9, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        w.m(this.f30540I);
        w.z0(this.f30540I);
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // z7.InterfaceC3059a
    public void r0(ActivationCallBack activationCallBack, String str) {
        y1();
    }

    @Override // z7.f
    public void w0(ArrayList arrayList, String str) {
        if (arrayList == null || arrayList.size() <= 0) {
            b();
            if (AbstractC2237a.f44523n.booleanValue()) {
                Toast.makeText(this, getResources().getString(a7.j.f12966C2), 0).show();
                return;
            } else {
                w.P0(this.f30540I, "Your Account is invalid or has expired !");
                return;
            }
        }
        try {
            this.f30563U.putString(AbstractC2237a.f44454L, ((String) arrayList.get(0)).trim());
            this.f30563U.apply();
            arrayList.remove(0);
            this.f30538H.h(this.f30542J, this.f30544K, arrayList);
        } catch (IOException e9) {
            e9.printStackTrace();
        }
    }

    public void w1() {
        this.f30547L0 = Build.VERSION.RELEASE + " " + Build.VERSION_CODES.class.getFields()[Build.VERSION.SDK_INT].getName();
    }

    public void x1() {
        int iNextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.f30553O0 = iNextInt;
        AbstractC1232b.f17695b = String.valueOf(iNextInt);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x039a, code lost:
    
        if (m7.AbstractC2237a.f44523n.booleanValue() != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x03d5, code lost:
    
        if (m7.AbstractC2237a.f44523n.booleanValue() != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0413, code lost:
    
        if (m7.AbstractC2237a.f44523n.booleanValue() != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0415, code lost:
    
        android.widget.Toast.makeText(r18, getResources().getString(a7.j.f12966C2), 0).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0428, code lost:
    
        m7.w.P0(r18.f30540I, "Your Account is invalid or has expired !");
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0464, code lost:
    
        if (m7.AbstractC2237a.f44523n.booleanValue() != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:?, code lost:
    
        return;
     */
    @Override // z7.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y(com.nst.iptvsmarterstvbox.model.callback.LoginCallback r19, java.lang.String r20, java.util.ArrayList r21) {
        /*
            Method dump skipped, instruction units count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.LoginActivity.y(com.nst.iptvsmarterstvbox.model.callback.LoginCallback, java.lang.String, java.util.ArrayList):void");
    }

    public void y1() {
        this.f30543J0 = S1(b7.f.c(this) + "*" + b7.f.d(this) + "-" + this.f30542J + "-" + AbstractC1232b.f17695b + "-" + this.f30549M0 + "-unknown-" + N1() + "-" + this.f30547L0);
        ArrayList arrayList = new ArrayList();
        b7.g.f17717b = arrayList;
        arrayList.add(b7.g.a("m", "gu"));
        b7.g.f17717b.add(b7.g.a("k", b7.f.c(this)));
        b7.g.f17717b.add(b7.g.a("sc", this.f30543J0));
        b7.g.f17717b.add(b7.g.a("u", this.f30542J));
        b7.g.f17717b.add(b7.g.a("pw", "no_password"));
        b7.g.f17717b.add(b7.g.a("r", AbstractC1232b.f17695b));
        b7.g.f17717b.add(b7.g.a("av", this.f30549M0));
        b7.g.f17717b.add(b7.g.a("dt", "unknown"));
        b7.g.f17717b.add(b7.g.a("d", N1()));
        b7.g.f17717b.add(b7.g.a("do", this.f30547L0));
        b7.g.f17718c.b(this);
    }

    public final void z1() {
        startActivity(new Intent(this, (Class<?>) FirebaseRegisterDeviceActivity.class));
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }
}
