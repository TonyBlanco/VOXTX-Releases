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
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import b7.AbstractC1232b;
import b7.InterfaceC1233c;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.services.s3.internal.Constants;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.FreeTrailActivity;
import com.nst.iptvsmarterstvbox.model.callback.ActivationCallBack;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetAdCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetAllChannelsCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetGenresCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetSeriesCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetVODByCatCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetVodCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerLiveFavIdsCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerProfilesCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerSetLiveFavCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerTokenCallback;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.ImportStatusModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.MultiUserDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.vpn.activities.ProfileActivity;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import m7.AbstractC2237a;
import m7.w;
import n7.C2298a;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpHead;
import org.json.JSONObject;
import q7.C2635t;
import q7.Z;
import q7.m0;
import u7.C2858a;
import z7.InterfaceC3059a;

/* JADX INFO: loaded from: classes4.dex */
public class LoginActivityStalker extends androidx.appcompat.app.b implements z7.g, InterfaceC1233c, InterfaceC3059a {

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public static InputFilter f30761K0 = new a();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public n7.e f30762A;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public String f30765B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f30766C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public String f30767C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f30768D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public String f30769D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ProgressDialog f30770E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public String f30771E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public SharedPreferences f30772F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public SharedPreferences.Editor f30774G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f30775G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public SharedPreferences f30776H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public String f30777H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public SharedPreferences f30778I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public C2298a f30779I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public SharedPreferences f30780J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public C2858a f30781J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public SharedPreferences.Editor f30782K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public SharedPreferences f30783L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public SharedPreferences.Editor f30784M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public LiveStreamDBHandler f30785N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public SharedPreferences f30786O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public SharedPreferences f30787P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public SharedPreferences f30788Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public SharedPreferences f30789R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public SharedPreferences f30790S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public SharedPreferences.Editor f30791T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public SharedPreferences.Editor f30792U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public SharedPreferences.Editor f30793V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public SharedPreferences.Editor f30794W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public SharedPreferences.Editor f30795X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public SharedPreferences.Editor f30796Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public SharedPreferences f30797Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EditText f30798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EditText f30799e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public SharedPreferences f30800e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f30801f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public SharedPreferences.Editor f30802f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f30803g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public MultiUserDBHandler f30804g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f30805h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public DatabaseHandler f30806h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f30807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Button f30809j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f30811k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RelativeLayout f30813l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RelativeLayout f30815m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RelativeLayout f30817n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f30819o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f30821p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public RelativeLayout f30823q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f30824q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ImageView f30825r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public SharedPreferences f30826r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f30827s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public SharedPreferences.Editor f30828s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f30829t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public SharedPreferences f30830t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ImageView f30831u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public SharedPreferences.Editor f30832u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f30833v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public SharedPreferences f30834v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RelativeLayout f30835w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public RelativeLayout f30837x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f30839y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f30841z = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Context f30764B = this;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public String f30808i0 = "";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public String f30810j0 = "";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f30812k0 = "";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public String f30814l0 = "";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public long f30816m0 = -1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public String f30818n0 = "";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public String f30820o0 = "";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public long f30822p0 = -1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public String f30836w0 = "";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ArrayList f30838x0 = new ArrayList();

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f30840y0 = J1();

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public long f30842z0 = 0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public SimpleDateFormat f30763A0 = new SimpleDateFormat("dd/MM/yyyy");

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public String f30773F0 = Build.MODEL;

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

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AbstractC2237a.f44490c = true;
            SharepreferenceDBHandler.setTypeLogin("login", LoginActivityStalker.this.f30764B);
            Intent intent = new Intent(LoginActivityStalker.this.f30764B, (Class<?>) ProfileActivity.class);
            intent.putExtra("typeid", "login");
            LoginActivityStalker.this.startActivity(intent);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LoginActivityStalker.this.S1();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LoginActivityStalker.this.Q1();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LoginActivityStalker.this.startActivity(new Intent(LoginActivityStalker.this, (Class<?>) FreeTrailActivity.class));
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AbstractC2237a.f44548y = AbstractC2237a.f44548y.booleanValue() ? Boolean.FALSE : Boolean.TRUE;
            LoginActivityStalker.this.L1();
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoginActivityStalker.this.f30841z = false;
        }
    }

    public class h extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f30849a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f30850c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f30851d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f30852e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f30853f;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f30855a;

            public a(View view) {
                this.f30855a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f30855a;
                    if (view2 == null || view2.getTag() == null || !this.f30855a.getTag().equals("1")) {
                        View view3 = this.f30855a;
                        if (view3 == null || view3.getTag() == null || !this.f30855a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = h.this.f30853f;
                        }
                    } else {
                        linearLayout = h.this.f30852e;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f30855a;
                    if (view4 == null || view4.getTag() == null || !this.f30855a.getTag().equals("1")) {
                        View view5 = this.f30855a;
                        if (view5 == null || view5.getTag() == null || !this.f30855a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = h.this.f30853f;
                        }
                    } else {
                        linearLayout = h.this.f30852e;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        public h(Activity activity) {
            super(activity);
            this.f30849a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (view.getId() == a7.f.f12524s1) {
                    dismiss();
                    LoginActivityStalker.this.S1();
                } else if (view.getId() != a7.f.f12313X0) {
                } else {
                    dismiss();
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(LoginActivityStalker.this.f30781J0.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12819j2 : a7.g.f12813i2);
            this.f30850c = (TextView) findViewById(a7.f.f12524s1);
            this.f30851d = (TextView) findViewById(a7.f.f12313X0);
            this.f30852e = (LinearLayout) findViewById(a7.f.Ia);
            this.f30853f = (LinearLayout) findViewById(a7.f.V8);
            this.f30850c.setOnClickListener(this);
            this.f30851d.setOnClickListener(this);
            TextView textView = this.f30850c;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f30851d;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    public class i extends AsyncTask {
        public i() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("http://www.google.com").openConnection();
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
                if (!AbstractC2237a.f44548y.booleanValue()) {
                    LoginActivityStalker.this.w1();
                    return;
                } else {
                    LoginActivityStalker loginActivityStalker = LoginActivityStalker.this;
                    loginActivityStalker.f30779I0 = new C2298a(loginActivityStalker, loginActivityStalker.f30764B);
                    return;
                }
            }
            LoginActivityStalker.this.b();
            LoginActivityStalker loginActivityStalker2 = LoginActivityStalker.this;
            h hVar = loginActivityStalker2.new h((Activity) loginActivityStalker2.f30764B);
            hVar.setCancelable(false);
            hVar.show();
        }
    }

    public class j implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f30858a;

        public j(View view) {
            this.f30858a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30858a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30858a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30858a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            LoginActivityStalker loginActivityStalker;
            TextView textView;
            if (z9) {
                f9 = z9 ? 1.15f : 1.0f;
                try {
                    Log.e("id is", "" + this.f30858a.getTag());
                    if (this.f30858a.getTag().equals("3")) {
                        EditText editText = LoginActivityStalker.this.f30798d;
                        editText.setSelection(editText.length());
                        return;
                    }
                    if (this.f30858a.getTag().equals("rl_list_users")) {
                        LoginActivityStalker.this.f30823q.setBackgroundResource(a7.e.f11992c1);
                        LoginActivityStalker.this.f30831u.setImageResource(a7.e.f12008g1);
                        LoginActivityStalker loginActivityStalker2 = LoginActivityStalker.this;
                        loginActivityStalker2.f30833v.setTextColor(loginActivityStalker2.f30764B.getResources().getColor(a7.c.f11849G));
                        b(f9);
                    } else {
                        if (!this.f30858a.getTag().equals("rl_connect_vpn")) {
                            if (this.f30858a.getTag().equals("rl_bt_submit")) {
                                LoginActivityStalker.this.f30817n.setBackgroundResource(a7.e.f12054s);
                                LoginActivityStalker loginActivityStalker3 = LoginActivityStalker.this;
                                loginActivityStalker3.f30829t.setTextColor(loginActivityStalker3.f30764B.getResources().getColor(a7.c.f11849G));
                                return;
                            }
                            return;
                        }
                        LoginActivityStalker.this.f30835w.setBackgroundResource(a7.e.f11992c1);
                        LoginActivityStalker.this.f30825r.setImageResource(a7.e.f12000e1);
                        LoginActivityStalker loginActivityStalker4 = LoginActivityStalker.this;
                        loginActivityStalker4.f30827s.setTextColor(loginActivityStalker4.f30764B.getResources().getColor(a7.c.f11849G));
                        b(f9);
                    }
                    c(f9);
                    return;
                } catch (Exception e9) {
                    e9.printStackTrace();
                    return;
                }
            }
            if (z9) {
                return;
            }
            f9 = z9 ? 1.09f : 1.0f;
            b(f9);
            c(f9);
            a(z9);
            View view2 = this.f30858a;
            if (view2 == null || view2.getTag() == null || !this.f30858a.getTag().equals("rl_list_users")) {
                View view3 = this.f30858a;
                if (view3 == null || view3.getTag() == null || !this.f30858a.getTag().equals("rl_connect_vpn")) {
                    View view4 = this.f30858a;
                    if (view4 == null || view4.getTag() == null || !this.f30858a.getTag().equals("rl_bt_submit")) {
                        return;
                    }
                    LoginActivityStalker.this.f30817n.setBackgroundResource(a7.e.f12058t);
                    loginActivityStalker = LoginActivityStalker.this;
                    textView = loginActivityStalker.f30829t;
                } else {
                    LoginActivityStalker.this.f30835w.setBackgroundResource(a7.e.f11996d1);
                    LoginActivityStalker.this.f30825r.setImageResource(a7.e.f12004f1);
                    loginActivityStalker = LoginActivityStalker.this;
                    textView = loginActivityStalker.f30827s;
                }
            } else {
                LoginActivityStalker.this.f30823q.setBackgroundResource(a7.e.f11996d1);
                LoginActivityStalker.this.f30831u.setImageResource(a7.e.f12012h1);
                loginActivityStalker = LoginActivityStalker.this;
                textView = loginActivityStalker.f30833v;
            }
            textView.setTextColor(loginActivityStalker.f30764B.getResources().getColor(a7.c.f11855f));
        }
    }

    private static String F1(String str) {
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

    private void G1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private String J1() {
        return w.p0(Calendar.getInstance().getTime().toString());
    }

    public static String K1() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return F1(str2);
        }
        return F1(str) + " " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L1() {
        TextView textView;
        int i9;
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        ProgressDialog progressDialog;
        String string;
        try {
            this.f30764B = this;
            this.f30804g0 = new MultiUserDBHandler(this.f30764B);
            this.f30785N = new LiveStreamDBHandler(this.f30764B);
            if (AbstractC2237a.f44550z.booleanValue()) {
                this.f30811k.setVisibility(0);
            }
            if (AbstractC2237a.f44538t.booleanValue()) {
                textView = this.f30811k;
                i9 = a7.f.Ae;
            } else {
                textView = this.f30811k;
                i9 = a7.f.he;
            }
            textView.setNextFocusLeftId(i9);
            if (AbstractC2237a.f44548y.booleanValue()) {
                this.f30811k.setText(getResources().getString(a7.j.f13092O8));
                this.f30805h.setText(getResources().getString(a7.j.f13318m1));
                this.f30815m.setVisibility(8);
                this.f30829t.setText(getResources().getString(a7.j.f13337o0));
                if (AbstractC2237a.f44538t.booleanValue()) {
                    this.f30813l.setVisibility(0);
                } else {
                    this.f30813l.setVisibility(8);
                }
                if ((AbstractC2237a.f44536s.booleanValue() && AbstractC2237a.f44538t.booleanValue()) || AbstractC2237a.f44540u.booleanValue()) {
                    relativeLayout2 = this.f30823q;
                    relativeLayout2.setVisibility(0);
                } else {
                    relativeLayout = this.f30823q;
                    relativeLayout.setVisibility(8);
                }
            } else {
                if (AbstractC2237a.f44538t.booleanValue()) {
                    this.f30811k.setText(getResources().getString(a7.j.f13102P8));
                    this.f30829t.setText(getResources().getString(a7.j.f13376s));
                    this.f30813l.setVisibility(0);
                    if (AbstractC2237a.f44526o.booleanValue()) {
                        this.f30815m.setVisibility(0);
                    } else {
                        this.f30815m.setVisibility(8);
                    }
                    if ((AbstractC2237a.f44536s.booleanValue() && AbstractC2237a.f44538t.booleanValue()) || AbstractC2237a.f44540u.booleanValue()) {
                        relativeLayout2 = this.f30823q;
                        relativeLayout2.setVisibility(0);
                    } else {
                        relativeLayout = this.f30823q;
                    }
                } else {
                    this.f30811k.setText(getResources().getString(a7.j.f13102P8));
                    this.f30805h.setText(getResources().getString(a7.j.f12954B0));
                    this.f30829t.setText(getResources().getString(a7.j.f13101P7));
                    this.f30815m.setVisibility(8);
                    this.f30813l.setVisibility(8);
                    relativeLayout = this.f30823q;
                }
                relativeLayout.setVisibility(8);
            }
            this.f30799e.setError(null);
            this.f30806h0 = new DatabaseHandler(this.f30764B);
            if (this.f30764B != null) {
                this.f30770E = new ProgressDialog(this.f30764B);
                String str = this.f30777H0;
                if (str != null && str.equalsIgnoreCase("login_perform")) {
                    progressDialog = this.f30770E;
                    string = "Auto Login";
                } else if (AbstractC2237a.f44548y.booleanValue()) {
                    this.f30770E.setMessage("");
                    progressDialog = this.f30770E;
                    string = getResources().getString(a7.j.f13402u5);
                } else {
                    this.f30770E.setMessage("");
                    progressDialog = this.f30770E;
                    string = getResources().getString(a7.j.f13392t5);
                }
                progressDialog.setMessage(string);
                this.f30770E.setCanceledOnTouchOutside(false);
                this.f30770E.setCancelable(false);
                this.f30770E.setProgressStyle(0);
            }
            this.f30762A = new n7.e(this, this.f30764B);
            this.f30772F = getSharedPreferences("sharedPreference", 0);
            this.f30778I = getSharedPreferences("loginPrefs", 0);
            this.f30780J = getSharedPreferences("selected_language", 0);
            SharedPreferences sharedPreferences = getSharedPreferences("loginPrefsserverurl", 0);
            this.f30783L = sharedPreferences;
            this.f30784M = sharedPreferences.edit();
            SharedPreferences sharedPreferences2 = getSharedPreferences("upgradeDatePref", 0);
            this.f30797Z = sharedPreferences2;
            this.f30796Y = sharedPreferences2.edit();
            this.f30782K = this.f30776H.edit();
            this.f30774G = this.f30772F.edit();
            SharedPreferences sharedPreferences3 = getSharedPreferences("multiDNS", 0);
            this.f30826r0 = sharedPreferences3;
            this.f30828s0 = sharedPreferences3.edit();
            SharedPreferences sharedPreferences4 = getSharedPreferences("multiDNSValid", 0);
            this.f30830t0 = sharedPreferences4;
            this.f30832u0 = sharedPreferences4.edit();
            this.f30834v0 = getSharedPreferences("serverUrlDNS", 0);
            AbstractC2237a.f44538t.booleanValue();
            M1();
        } catch (Resources.NotFoundException e9) {
            e9.printStackTrace();
        }
    }

    public static String N1(String str) {
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

    private void P1() {
        EditText editText;
        int i9;
        EditText editText2;
        int i10;
        this.f30799e = new EditText(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        this.f30799e.setPaddingRelative(35, 0, 35, 0);
        this.f30799e.setLayoutParams(layoutParams);
        this.f30799e.setHint(getResources().getString(a7.j.d9));
        this.f30799e.setHintTextColor(getResources().getColor(a7.c.f11849G));
        this.f30799e.setHintTextColor(-1);
        if (AbstractC2237a.f44538t.booleanValue()) {
            editText = this.f30799e;
            i9 = a7.f.Ae;
        } else {
            editText = this.f30799e;
            i9 = a7.f.he;
        }
        editText.setNextFocusLeftId(i9);
        this.f30799e.setTextSize(22.0f);
        this.f30799e.setId(101);
        this.f30799e.setBackground(getResources().getDrawable(a7.e.f11927J1));
        this.f30799e.setFocusable(true);
        EditText editText3 = this.f30799e;
        Typeface typeface = Typeface.SANS_SERIF;
        editText3.setTypeface(typeface);
        this.f30799e.setInputType(161);
        this.f30813l.addView(this.f30799e);
        this.f30801f = new EditText(this);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        this.f30801f.setPaddingRelative(35, 0, 35, 0);
        this.f30801f.setLayoutParams(layoutParams2);
        if (AbstractC2237a.f44550z.booleanValue()) {
            this.f30821p.setGravity(16);
        }
        this.f30801f.setHint(getResources().getString(a7.j.f13280i3));
        this.f30801f.setHintTextColor(getResources().getColor(a7.c.f11849G));
        this.f30801f.setHintTextColor(-1);
        this.f30801f.setTextSize(22.0f);
        this.f30801f.setId(HttpStatus.SC_PROCESSING);
        if (AbstractC2237a.f44538t.booleanValue()) {
            editText2 = this.f30801f;
            i10 = a7.f.Ae;
        } else {
            editText2 = this.f30801f;
            i10 = a7.f.he;
        }
        editText2.setNextFocusLeftId(i10);
        this.f30801f.setFocusable(true);
        this.f30801f.setBackground(getResources().getDrawable(a7.e.f11927J1));
        this.f30801f.setTypeface(typeface);
        this.f30801f.setInputType(161);
        this.f30837x.addView(this.f30801f);
        if (AbstractC2237a.f44526o.booleanValue()) {
            this.f30798d = new EditText(this);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
            this.f30798d.setPaddingRelative(35, 0, 35, 0);
            this.f30798d.setLayoutParams(layoutParams3);
            this.f30798d.setHint(getResources().getString(a7.j.f13100P6));
            this.f30798d.setHintTextColor(getResources().getColor(a7.c.f11849G));
            this.f30798d.setHintTextColor(-1);
            this.f30798d.setTextSize(22.0f);
            this.f30798d.setId(104);
            this.f30798d.setBackground(getResources().getDrawable(a7.e.f11927J1));
            this.f30798d.setFocusable(true);
            this.f30798d.setTypeface(typeface);
            this.f30798d.setInputType(161);
            this.f30815m.addView(this.f30798d);
        }
        if (AbstractC2237a.f44538t.booleanValue()) {
            this.f30799e.requestFocus();
            this.f30799e.requestFocusFromTouch();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q1() {
        SharepreferenceDBHandler.setCurrentAPPType("stalker_api", this.f30764B);
        startActivity(new Intent(this, (Class<?>) MultiUserActivity.class));
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        finish();
    }

    private void R1(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S1() {
        n7.e eVar;
        this.f30824q0 = this.f30799e.getText().toString().trim();
        this.f30784M = this.f30783L.edit();
        this.f30768D = this.f30801f.getText().toString().trim();
        if (AbstractC2237a.f44548y.booleanValue() || !H1()) {
            return;
        }
        a();
        try {
            if (AbstractC2237a.f44523n.booleanValue()) {
                this.f30784M.putString(AbstractC2237a.f44454L, "http://qqtv.nl");
                this.f30784M.apply();
                this.f30774G.putString(AbstractC2237a.f44454L, "http://qqtv.nl");
                this.f30774G.putString("mac_address", this.f30768D);
                this.f30774G.apply();
                if (AbstractC2237a.f44538t.booleanValue()) {
                    R1("http://qqtv.nl");
                } else {
                    eVar = this.f30762A;
                    eVar.v(this.f30768D);
                }
            } else if (AbstractC2237a.f44526o.booleanValue()) {
                String lowerCase = this.f30798d.getText().toString().trim().toLowerCase();
                this.f30766C = lowerCase;
                this.f30784M.putString(AbstractC2237a.f44454L, lowerCase);
                this.f30784M.apply();
                this.f30774G.putString(AbstractC2237a.f44454L, this.f30766C);
                this.f30774G.apply();
                eVar = this.f30762A;
                eVar.v(this.f30768D);
            } else {
                new i().execute(new Void[0]);
            }
        } catch (Exception unused) {
        }
        this.f30782K.putString("mac_address", this.f30768D);
        this.f30782K.putString("activationCode", "");
        this.f30782K.putString("loginWith", "loginWithDetails");
        this.f30782K.apply();
        this.f30784M.apply();
    }

    public void E1() {
        try {
            this.f30771E0 = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e9) {
            e9.printStackTrace();
        }
    }

    @Override // z7.g
    public void F(StalkerGetSeriesCategoriesCallback stalkerGetSeriesCategoriesCallback) {
    }

    @Override // z7.g
    public void G(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, Z.E e9, int i9) {
    }

    @Override // z7.g
    public void G0(StalkerTokenCallback stalkerTokenCallback) {
        Context context;
        String str;
        if (stalkerTokenCallback == null || stalkerTokenCallback.getJs() == null || stalkerTokenCallback.getJs().getToken() == null) {
            context = this.f30764B;
            str = "Error Code 100: Invalid Details";
        } else {
            String token = stalkerTokenCallback.getJs().getToken();
            SharepreferenceDBHandler.setStalkerToken(token, this.f30764B);
            n7.e eVar = this.f30762A;
            if (eVar != null) {
                try {
                    eVar.q(this.f30768D, token);
                    return;
                } catch (Exception e9) {
                    e9.printStackTrace();
                    return;
                }
            }
            context = this.f30764B;
            str = "Error Code 101: Invalid Details";
        }
        w.P0(context, str);
        b();
    }

    @Override // z7.g
    public void H(String str) {
    }

    public boolean H1() {
        EditText editText;
        Resources resources;
        int i9;
        if (AbstractC2237a.f44538t.booleanValue() && this.f30799e.getText().toString().trim().length() == 0) {
            this.f30799e.requestFocus();
            editText = this.f30799e;
            resources = getResources();
            i9 = a7.j.f13328n1;
        } else if (AbstractC2237a.f44526o.booleanValue() && this.f30798d.getText().toString().trim().length() == 0) {
            this.f30798d.requestFocus();
            editText = this.f30798d;
            resources = getResources();
            i9 = a7.j.f13418w1;
        } else {
            if (this.f30801f.getText().toString().trim().length() != 0) {
                return true;
            }
            this.f30801f.requestFocus();
            editText = this.f30801f;
            resources = getResources();
            i9 = a7.j.f13368r1;
        }
        editText.setError(resources.getString(i9));
        return false;
    }

    @Override // z7.g
    public void I(m0.x xVar, int i9) {
    }

    public void I1() {
        Button button;
        int i9;
        P1();
        this.f30835w.setOnClickListener(new b());
        this.f30817n.setOnClickListener(new c());
        this.f30823q.setOnClickListener(new d());
        if (AbstractC2237a.f44546x.booleanValue()) {
            button = this.f30809j;
            i9 = 0;
        } else {
            button = this.f30809j;
            i9 = 8;
        }
        button.setVisibility(i9);
        this.f30809j.setOnClickListener(new e());
        this.f30811k.setOnClickListener(new f());
    }

    @Override // z7.g
    public void M(StalkerGetAdCallback stalkerGetAdCallback, int i9) {
    }

    public void M1() {
        try {
            if (AbstractC2237a.f44538t.booleanValue()) {
                this.f30799e.requestFocus();
                this.f30799e.requestFocusFromTouch();
            }
            b();
        } catch (Exception unused) {
        }
    }

    @Override // z7.g
    public void O(Z.E e9, int i9) {
    }

    @Override // b7.InterfaceC1233c
    /* JADX INFO: renamed from: O1, reason: merged with bridge method [inline-methods] */
    public void K0(String str, int i9, boolean z9) {
        if (!z9) {
            b();
            Toast.makeText(this, this.f30764B.getResources().getString(a7.j.f12944A0), 0).show();
            return;
        }
        if (i9 == 1) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                AbstractC1232b.f17694a = jSONObject;
                if (!jSONObject.getString("status").equalsIgnoreCase("true")) {
                    b();
                    Toast.makeText(this, this.f30764B.getResources().getString(a7.j.f13071M7), 0).show();
                    return;
                }
                this.f30818n0 = AbstractC1232b.f17694a.getString("su");
                this.f30820o0 = AbstractC1232b.f17694a.getString("ndd");
                this.f30822p0 = System.currentTimeMillis();
                try {
                    this.f30768D = AbstractC2237a.f44548y.booleanValue() ? SharepreferenceDBHandler.getMacAddress(this.f30764B) : this.f30801f.getText().toString().trim();
                    b7.f.e(this, AbstractC1232b.f17694a.optString("su"));
                    this.f30767C0 = N1(AbstractC1232b.f17694a.optString("su") + "*" + b7.f.d(this) + "*" + AbstractC1232b.f17695b);
                    if (!AbstractC1232b.f17694a.getString("sc").equalsIgnoreCase(this.f30767C0)) {
                        b();
                        Toast.makeText(this, this.f30764B.getResources().getString(a7.j.f12944A0), 0).show();
                        return;
                    }
                    this.f30784M.putString(AbstractC2237a.f44454L, b7.f.a(this));
                    this.f30784M.apply();
                    this.f30774G.putString(AbstractC2237a.f44454L, b7.f.a(this));
                    this.f30774G.putString("mac_address", this.f30768D);
                    this.f30774G.apply();
                    if (AbstractC2237a.f44538t.booleanValue()) {
                        R1(this.f30818n0.toLowerCase());
                    } else {
                        this.f30762A.v(this.f30768D);
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            } catch (Exception e10) {
                Log.e("Login check", e10.getMessage());
            }
        }
    }

    @Override // z7.g
    public void P0(String str) {
    }

    @Override // z7.InterfaceC3059a
    public void S(String str) {
        b();
        if (str != null) {
            w.P0(this.f30764B, str);
        } else {
            w.P0(this.f30764B, "Your Activation code is not invalid");
        }
    }

    @Override // z7.g
    public void U(StalkerLiveFavIdsCallback stalkerLiveFavIdsCallback) {
    }

    @Override // z7.g
    public void V(StalkerProfilesCallback stalkerProfilesCallback) {
        if (stalkerProfilesCallback != null) {
            if (stalkerProfilesCallback.getJs() == null || stalkerProfilesCallback.getJs().getId() == null || stalkerProfilesCallback.getJs().getPassword().equals("")) {
                b();
                w.P0(this.f30764B, "Error Code 102: Invalid Details");
                return;
            }
            try {
                SharedPreferences.Editor editorEdit = getSharedPreferences("loginPrefs", 0).edit();
                editorEdit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "stalker");
                editorEdit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "stalker");
                editorEdit.putString("mac_address", this.f30768D);
                editorEdit.putString("serverPort", "");
                editorEdit.putString("serverUrl", this.f30766C);
                editorEdit.putString("serverTimeZone", stalkerProfilesCallback.getJs().getDefaultTimezone());
                editorEdit.putString("anyName", this.f30824q0);
                editorEdit.apply();
                this.f30786O = this.f30764B.getSharedPreferences("allowedFormat", 0);
                this.f30787P = this.f30764B.getSharedPreferences("timeFormat", 0);
                this.f30788Q = this.f30764B.getSharedPreferences("epgchannelupdate", 0);
                this.f30789R = this.f30764B.getSharedPreferences("automation_channels", 0);
                this.f30790S = this.f30764B.getSharedPreferences("automation_epg", 0);
                this.f30793V = this.f30786O.edit();
                this.f30791T = this.f30787P.edit();
                this.f30792U = this.f30788Q.edit();
                this.f30794W = this.f30789R.edit();
                this.f30795X = this.f30790S.edit();
                SharedPreferences sharedPreferences = this.f30764B.getSharedPreferences("auto_start", 0);
                this.f30800e0 = sharedPreferences;
                SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                this.f30802f0 = editorEdit2;
                if (editorEdit2 != null) {
                    editorEdit2.putBoolean("full_epg", true);
                    this.f30802f0.apply();
                }
                String string = this.f30786O.getString("allowedFormat", "");
                if (string != null && string.equals("")) {
                    this.f30793V.putString("allowedFormat", "ts");
                    this.f30793V.apply();
                }
                if (this.f30789R.getString("automation_channels", "").equals("")) {
                    this.f30794W.putString("automation_channels", "checked");
                    this.f30794W.apply();
                }
                if (this.f30790S.getString("automation_epg", "").equals("")) {
                    this.f30795X.putString("automation_epg", "checked");
                    this.f30795X.apply();
                }
                if (this.f30787P.getString("timeFormat", AbstractC2237a.f44441E0).equals("")) {
                    this.f30791T.putString("timeFormat", AbstractC2237a.f44441E0);
                    this.f30791T.apply();
                }
                if (this.f30788Q.getString("epgchannelupdate", "").equals("")) {
                    this.f30792U.putString("epgchannelupdate", "all");
                    this.f30792U.apply();
                }
                AbstractC2237a.f44494d0 = Boolean.TRUE;
                SharepreferenceDBHandler.setCurrentAPPType("stalker_api", this.f30764B);
                if (!this.f30804g0.checkregistration(this.f30824q0, "", "", this.f30766C, "stalker_api", "", this.f30768D)) {
                    this.f30804g0.addmultiusersStalker(this.f30824q0, this.f30766C, this.f30768D);
                    Toast.makeText(this.f30764B, getResources().getString(a7.j.f13375r8), 0).show();
                }
                SharedPreferences.Editor editorEdit3 = this.f30764B.getSharedPreferences("loginprefsmultiuser", 0).edit();
                editorEdit3.putString("name", this.f30824q0);
                editorEdit3.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "stalker");
                editorEdit3.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "stalker");
                editorEdit3.putString(AbstractC2237a.f44454L, this.f30766C);
                editorEdit3.putString("mac_address", this.f30768D);
                editorEdit3.apply();
                if (this.f30764B != null) {
                    MultiUserDBHandler multiUserDBHandler = new MultiUserDBHandler(this.f30764B);
                    this.f30804g0 = multiUserDBHandler;
                    SharepreferenceDBHandler.setUserID(multiUserDBHandler.getAutoIdLoggedInUser(this.f30824q0, "", "", this.f30766C, "stalker_api", "", this.f30768D), this.f30764B);
                }
                b();
                if (this.f30785N.getImportTableCount("stalker_api") == 0) {
                    ArrayList<ImportStatusModel> arrayList = new ArrayList<>();
                    ImportStatusModel importStatusModel = new ImportStatusModel();
                    importStatusModel.setType("all_stalker");
                    importStatusModel.setStatus("0");
                    importStatusModel.setDate("");
                    arrayList.add(0, importStatusModel);
                    this.f30785N.importDataStatusArrayList(arrayList, "stalker_api");
                }
                ImportStatusModel importStatusModel2 = this.f30785N.getdateDBStatus("all_stalker");
                if (importStatusModel2 != null) {
                    if ((importStatusModel2.getStatus() == null || !importStatusModel2.getStatus().equals("0")) && (importStatusModel2.getStatus() == null || !importStatusModel2.getStatus().equals("2"))) {
                        if ((importStatusModel2.getStatus() == null || !importStatusModel2.getStatus().equals("1")) && importStatusModel2.getStatus() != null) {
                            importStatusModel2.getStatus().equals("3");
                            return;
                        }
                        return;
                    }
                    if (this.f30764B != null) {
                        this.f30764B.startActivity(new Intent(this.f30764B, (Class<?>) ImportStalkerActivity.class));
                        ((Activity) this.f30764B).finish();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // z7.g
    public void V0(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, m0.x xVar, int i9) {
    }

    @Override // z7.b
    public void a() {
        ProgressDialog progressDialog = this.f30770E;
        if (progressDialog != null) {
            progressDialog.show();
        }
    }

    @Override // z7.b
    public void b() {
        try {
            ProgressDialog progressDialog = this.f30770E;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    @Override // b7.InterfaceC1233c
    public void b0(int i9) {
        if (this.f30764B != null) {
            b();
            Toast.makeText(this, this.f30764B.getResources().getString(a7.j.f12944A0), 0).show();
        }
    }

    @Override // z7.g
    public void c(String str) {
        b();
        if (!str.equals("")) {
            w.P0(this.f30764B, str);
        } else if (AbstractC2237a.f44523n.booleanValue()) {
            Toast.makeText(this, getResources().getString(a7.j.f12966C2), 0).show();
        } else {
            w.P0(this.f30764B, "Your Account is invalid or has expired !");
        }
    }

    @Override // z7.g
    public void d0(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, C2635t.o oVar, String str, String str2) {
    }

    @Override // z7.g
    public void e(String str) {
        ProgressDialog progressDialog = this.f30770E;
        if (progressDialog != null) {
            progressDialog.dismiss();
            Toast.makeText(this, this.f30764B.getResources().getString(a7.j.f13006G2), 0).show();
        }
    }

    @Override // z7.g
    public void e0(String str) {
    }

    @Override // z7.g
    public void f0(StalkerGetGenresCallback stalkerGetGenresCallback) {
    }

    @Override // z7.g
    public void i(StalkerGetAllChannelsCallback stalkerGetAllChannelsCallback) {
    }

    @Override // z7.g
    public void j(StalkerGetVodCategoriesCallback stalkerGetVodCategoriesCallback) {
    }

    @Override // z7.g
    public void o0(String str) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (AbstractC2237a.f44540u.booleanValue()) {
            super.onBackPressed();
        } else {
            if (this.f30841z) {
                super.onBackPressed();
                return;
            }
            this.f30841z = true;
            try {
                Toast.makeText(this, getResources().getString(a7.j.f12999F5), 0).show();
            } catch (Exception unused) {
            }
            new Handler().postDelayed(new g(), 2000L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0175  */
    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r3) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.LoginActivityStalker.onCreate(android.os.Bundle):void");
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
        w.m(this.f30764B);
        w.z0(this.f30764B);
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // z7.g
    public void q(StalkerGetVODByCatCallback stalkerGetVODByCatCallback) {
    }

    @Override // z7.InterfaceC3059a
    public void r0(ActivationCallBack activationCallBack, String str) {
        w1();
    }

    public void u1() {
        this.f30769D0 = Build.VERSION.RELEASE + " " + Build.VERSION_CODES.class.getFields()[Build.VERSION.SDK_INT].getName();
    }

    @Override // z7.g
    public void v0(String str) {
    }

    public void v1() {
        int iNextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.f30775G0 = iNextInt;
        AbstractC1232b.f17695b = String.valueOf(iNextInt);
    }

    public void w1() {
        this.f30765B0 = N1(b7.f.c(this) + "*" + b7.f.d(this) + "--" + AbstractC1232b.f17695b + "-" + this.f30771E0 + "-unknown-" + K1() + "-" + this.f30769D0);
        ArrayList arrayList = new ArrayList();
        b7.g.f17717b = arrayList;
        arrayList.add(b7.g.a("m", "gu"));
        b7.g.f17717b.add(b7.g.a("k", b7.f.c(this)));
        b7.g.f17717b.add(b7.g.a("sc", this.f30765B0));
        b7.g.f17717b.add(b7.g.a("u", ""));
        b7.g.f17717b.add(b7.g.a("pw", "no_password"));
        b7.g.f17717b.add(b7.g.a("r", AbstractC1232b.f17695b));
        b7.g.f17717b.add(b7.g.a("av", this.f30771E0));
        b7.g.f17717b.add(b7.g.a("dt", "unknown"));
        b7.g.f17717b.add(b7.g.a("d", K1()));
        b7.g.f17717b.add(b7.g.a("do", this.f30769D0));
        b7.g.f17718c.b(this);
    }

    @Override // z7.g
    public void y0(String str) {
    }
}
