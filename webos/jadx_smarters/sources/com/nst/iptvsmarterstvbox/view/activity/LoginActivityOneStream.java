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
import com.nst.iptvsmarterstvbox.view.activity.LoginActivityOneStream;
import com.nst.iptvsmarterstvbox.vpn.activities.ProfileActivity;
import j1.AbstractC2074a;
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
import m1.C2219a;
import m7.AbstractC2237a;
import m7.w;
import n7.C2298a;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpHead;
import org.json.JSONException;
import org.json.JSONObject;
import p1.InterfaceC2389c;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import u7.C2858a;
import z7.InterfaceC3059a;

/* JADX INFO: loaded from: classes4.dex */
public class LoginActivityOneStream extends androidx.appcompat.app.b implements z7.f, InterfaceC1233c, InterfaceC3059a {

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public static InputFilter f30639U0 = new c();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ImageView f30640A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public String f30641A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public TextView f30642B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public SharedPreferences f30643B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public TextView f30644C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public SharedPreferences.Editor f30645C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ImageView f30646D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public SharedPreferences f30647D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public TextView f30648E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public SharedPreferences.Editor f30649E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public RelativeLayout f30650F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public SharedPreferences f30651F0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public n7.d f30656I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public String f30660K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f30662L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public String f30663L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ProgressDialog f30664M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public String f30665M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public SharedPreferences f30666N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public String f30667N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public SharedPreferences.Editor f30668O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public String f30669O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public SharedPreferences f30670P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public SharedPreferences f30672Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public int f30673Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public SharedPreferences f30674R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public String f30675R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public SharedPreferences.Editor f30676S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public C2298a f30677S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public SharedPreferences f30678T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public C2858a f30679T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public SharedPreferences.Editor f30680U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public LiveStreamDBHandler f30681V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public SharedPreferences f30682W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public SharedPreferences f30683X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public SharedPreferences f30684Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public SharedPreferences f30685Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f30686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EditText f30687e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public SharedPreferences f30688e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f30689f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public SharedPreferences.Editor f30690f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EditText f30691g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public SharedPreferences.Editor f30692g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EditText f30693h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public SharedPreferences.Editor f30694h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f30695i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public SharedPreferences.Editor f30696i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f30697j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public SharedPreferences.Editor f30698j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayout f30699k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public SharedPreferences.Editor f30700k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Button f30701l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public SharedPreferences f30702l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f30703m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public SharedPreferences f30704m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RelativeLayout f30705n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public SharedPreferences.Editor f30706n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RelativeLayout f30707o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public MultiUserDBHandler f30708o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public RelativeLayout f30709p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public DatabaseHandler f30710p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public RelativeLayout f30711q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RelativeLayout f30713r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Button f30715s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LinearLayout f30717t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ImageView f30719u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinearLayout f30721v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RelativeLayout f30723w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ConstraintLayout f30725x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f30727y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f30728y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ImageView f30729z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public String f30730z0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f30652G = -1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f30654H = false;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Context f30658J = this;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f30712q0 = "";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public String f30714r0 = "";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public String f30716s0 = "";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public String f30718t0 = "";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public long f30720u0 = -1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public String f30722v0 = "";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public String f30724w0 = "";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public long f30726x0 = -1;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public String f30653G0 = "";

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public ArrayList f30655H0 = new ArrayList();

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public String f30657I0 = t2();

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public long f30659J0 = 0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public SimpleDateFormat f30661K0 = new SimpleDateFormat("dd/MM/yyyy");

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public String f30671P0 = Build.MODEL;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LoginActivityOneStream loginActivityOneStream = LoginActivityOneStream.this;
            int i9 = loginActivityOneStream.f30652G;
            if (i9 != -1) {
                loginActivityOneStream.f30652G = i9 - 1;
                loginActivityOneStream.f30689f.setInputType(129);
                LoginActivityOneStream.this.f30719u.setImageResource(a7.e.f12011h0);
            } else {
                loginActivityOneStream.f30689f.setInputType(145);
                LoginActivityOneStream.this.f30719u.setImageResource(a7.e.f12085z2);
                LoginActivityOneStream.this.f30652G++;
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoginActivityOneStream.this.f30654H = false;
        }
    }

    public class c implements InputFilter {
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

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AbstractC2237a.f44490c = true;
            SharepreferenceDBHandler.setTypeLogin("login", LoginActivityOneStream.this.f30658J);
            Intent intent = new Intent(LoginActivityOneStream.this.f30658J, (Class<?>) ProfileActivity.class);
            intent.putExtra("typeid", "login");
            LoginActivityOneStream.this.startActivity(intent);
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LoginActivityOneStream loginActivityOneStream = LoginActivityOneStream.this;
            loginActivityOneStream.f30660K = loginActivityOneStream.f30687e.getText().toString().trim();
            LoginActivityOneStream loginActivityOneStream2 = LoginActivityOneStream.this;
            loginActivityOneStream2.f30662L = loginActivityOneStream2.f30689f.getText().toString().trim();
            LoginActivityOneStream loginActivityOneStream3 = LoginActivityOneStream.this;
            loginActivityOneStream3.f30728y0 = loginActivityOneStream3.f30693h.getText().toString().trim();
            LoginActivityOneStream loginActivityOneStream4 = LoginActivityOneStream.this;
            loginActivityOneStream4.f30680U = loginActivityOneStream4.f30678T.edit();
            LoginActivityOneStream.this.E2();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LoginActivityOneStream.this.C2();
        }
    }

    public class g implements View.OnClickListener {

        public class a implements MyApplication.d {

            /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.activity.LoginActivityOneStream$g$a$a, reason: collision with other inner class name */
            public class RunnableC0276a implements Runnable {
                public RunnableC0276a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    LoginActivityOneStream.this.y1();
                }
            }

            public class b implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f30739a;

                public b(String str) {
                    this.f30739a = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    MyApplication.p().D("LOS" + this.f30739a, LoginActivityOneStream.this.f30658J);
                    LoginActivityOneStream.this.y1();
                }
            }

            public class c implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f30741a;

                public c(String str) {
                    this.f30741a = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    MyApplication.p().D("LOS" + this.f30741a, LoginActivityOneStream.this.f30658J);
                }
            }

            public a() {
            }

            @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
            public void a(String str) {
                LoginActivityOneStream.this.runOnUiThread(new b(str));
            }

            @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
            public void b(String str) {
                LoginActivityOneStream.this.runOnUiThread(new c(str));
            }

            @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
            public void onSuccess() {
                LoginActivityOneStream.this.runOnUiThread(new RunnableC0276a());
            }
        }

        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!AbstractC2237a.f44477W0.booleanValue() || (SharepreferenceDBHandler.getSBPDemoAndClientUrl(LoginActivityOneStream.this.f30658J) != null && SharepreferenceDBHandler.getSBPDemoAndClientUrl(LoginActivityOneStream.this.f30658J).length() > 0)) {
                LoginActivityOneStream.this.y1();
            } else {
                MyApplication.p().G(LoginActivityOneStream.this.f30658J, new a());
            }
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LoginActivityOneStream.this.startActivity(new Intent(LoginActivityOneStream.this, (Class<?>) FreeTrailActivity.class));
        }
    }

    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AbstractC2237a.f44548y = AbstractC2237a.f44548y.booleanValue() ? Boolean.FALSE : Boolean.TRUE;
            LoginActivityOneStream.this.w2();
        }
    }

    public class j implements InterfaceC2389c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f30745a;

        public j(ArrayList arrayList) {
            this.f30745a = arrayList;
        }

        @Override // p1.InterfaceC2389c
        public void a(JSONObject jSONObject) {
            Log.e("AUTH_API", String.valueOf(jSONObject));
            try {
                String string = jSONObject.getString("auth_token");
                if (string.isEmpty()) {
                    Log.e("AUTHAPI", "AUTHTOKEN IS EMPTY");
                    LoginActivityOneStream.this.G2(this.f30745a);
                } else {
                    LoginActivityOneStream loginActivityOneStream = LoginActivityOneStream.this;
                    SharepreferenceDBHandler.setFirebaseOneStreamNode(loginActivityOneStream.f30686d, loginActivityOneStream.f30658J);
                    SharepreferenceDBHandler.setOneStreamToken(string, LoginActivityOneStream.this.f30658J);
                    LoginActivityOneStream loginActivityOneStream2 = LoginActivityOneStream.this;
                    loginActivityOneStream2.u2(loginActivityOneStream2.f30655H0);
                }
            } catch (Exception e9) {
                LoginActivityOneStream.this.G2(this.f30745a);
                e9.printStackTrace();
            }
        }

        @Override // p1.InterfaceC2389c
        public void b(C2219a c2219a) {
            LoginActivityOneStream.this.G2(this.f30745a);
        }
    }

    public class k implements InterfaceC2389c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f30747a;

        public k(ArrayList arrayList) {
            this.f30747a = arrayList;
        }

        @Override // p1.InterfaceC2389c
        public void a(JSONObject jSONObject) {
            Toast toastMakeText;
            Log.e("AUTH_API", String.valueOf(jSONObject));
            if (jSONObject != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject(String.valueOf(jSONObject)).getJSONObject("user_info");
                    if (jSONObject2 != null) {
                        LoginActivityOneStream.this.f30730z0 = jSONObject2.getString("auth");
                        String str = LoginActivityOneStream.this.f30730z0;
                        if (str != null && Integer.valueOf(str).intValue() != 0) {
                            LoginActivityOneStream.this.f30641A0 = jSONObject2.getString("status");
                            String str2 = LoginActivityOneStream.this.f30641A0;
                            if (str2 != null && str2.equals("Active")) {
                                LoginActivityOneStream.this.b();
                                JSONObject jSONObject3 = new JSONObject(String.valueOf(jSONObject));
                                JSONObject jSONObject4 = jSONObject3.getJSONObject("user_info");
                                String string = jSONObject4.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME);
                                jSONObject4.getString("message");
                                String string2 = jSONObject4.getString("expire_at");
                                String string3 = jSONObject4.getString("active_connections");
                                String string4 = jSONObject4.getString("created_at");
                                String string5 = jSONObject4.getString("max_connections");
                                jSONObject4.getJSONArray("allowed_output_formats");
                                JSONObject jSONObject5 = jSONObject3.getJSONObject("server_info");
                                jSONObject5.getString("time_now");
                                String string6 = jSONObject5.getString("timezone");
                                if (!LoginActivityOneStream.this.f30641A0.equals("Active")) {
                                    Toast.makeText(LoginActivityOneStream.this.getApplicationContext(), LoginActivityOneStream.this.getResources().getString(a7.j.f13016H2) + LoginActivityOneStream.this.f30641A0, 0).show();
                                    return;
                                }
                                LoginActivityOneStream.this.f30658J.getSharedPreferences("loginPrefsserverurl", 0).getString(AbstractC2237a.f44454L, "").toLowerCase();
                                SharedPreferences.Editor editorEdit = LoginActivityOneStream.this.getSharedPreferences("loginPrefs", 0).edit();
                                editorEdit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, string);
                                editorEdit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, LoginActivityOneStream.this.f30662L);
                                editorEdit.putString("auth", LoginActivityOneStream.this.f30730z0);
                                editorEdit.putString("status", LoginActivityOneStream.this.f30641A0);
                                editorEdit.putString("expDate", string2);
                                editorEdit.putString("activeCons", string3);
                                editorEdit.putString("createdAt", string4);
                                editorEdit.putString("maxConnections", string5);
                                editorEdit.putString("serverTimeZone", string6);
                                editorEdit.apply();
                                LoginActivityOneStream loginActivityOneStream = LoginActivityOneStream.this;
                                loginActivityOneStream.f30682W = loginActivityOneStream.f30658J.getSharedPreferences("allowedFormat", 0);
                                LoginActivityOneStream loginActivityOneStream2 = LoginActivityOneStream.this;
                                loginActivityOneStream2.f30683X = loginActivityOneStream2.f30658J.getSharedPreferences("timeFormat", 0);
                                LoginActivityOneStream loginActivityOneStream3 = LoginActivityOneStream.this;
                                loginActivityOneStream3.f30684Y = loginActivityOneStream3.f30658J.getSharedPreferences("epgchannelupdate", 0);
                                LoginActivityOneStream loginActivityOneStream4 = LoginActivityOneStream.this;
                                loginActivityOneStream4.f30685Z = loginActivityOneStream4.f30658J.getSharedPreferences("automation_channels", 0);
                                LoginActivityOneStream loginActivityOneStream5 = LoginActivityOneStream.this;
                                loginActivityOneStream5.f30688e0 = loginActivityOneStream5.f30658J.getSharedPreferences("automation_epg", 0);
                                LoginActivityOneStream loginActivityOneStream6 = LoginActivityOneStream.this;
                                loginActivityOneStream6.f30694h0 = loginActivityOneStream6.f30682W.edit();
                                LoginActivityOneStream loginActivityOneStream7 = LoginActivityOneStream.this;
                                loginActivityOneStream7.f30690f0 = loginActivityOneStream7.f30683X.edit();
                                LoginActivityOneStream loginActivityOneStream8 = LoginActivityOneStream.this;
                                loginActivityOneStream8.f30692g0 = loginActivityOneStream8.f30684Y.edit();
                                LoginActivityOneStream loginActivityOneStream9 = LoginActivityOneStream.this;
                                loginActivityOneStream9.f30696i0 = loginActivityOneStream9.f30685Z.edit();
                                LoginActivityOneStream loginActivityOneStream10 = LoginActivityOneStream.this;
                                loginActivityOneStream10.f30698j0 = loginActivityOneStream10.f30688e0.edit();
                                LoginActivityOneStream loginActivityOneStream11 = LoginActivityOneStream.this;
                                loginActivityOneStream11.f30704m0 = loginActivityOneStream11.f30658J.getSharedPreferences("auto_start", 0);
                                LoginActivityOneStream loginActivityOneStream12 = LoginActivityOneStream.this;
                                loginActivityOneStream12.f30706n0 = loginActivityOneStream12.f30704m0.edit();
                                if (LoginActivityOneStream.this.f30706n0 != null) {
                                    LoginActivityOneStream.this.f30706n0.putBoolean("full_epg", true);
                                    LoginActivityOneStream.this.f30706n0.apply();
                                }
                                if (LoginActivityOneStream.this.f30685Z.getString("automation_channels", "").equals("")) {
                                    LoginActivityOneStream.this.f30696i0.putString("automation_channels", "checked");
                                    LoginActivityOneStream.this.f30696i0.apply();
                                }
                                if (LoginActivityOneStream.this.f30688e0.getString("automation_epg", "").equals("")) {
                                    LoginActivityOneStream.this.f30698j0.putString("automation_epg", "checked");
                                    LoginActivityOneStream.this.f30698j0.apply();
                                }
                                AbstractC2237a.f44491c0 = Boolean.FALSE;
                                if (LoginActivityOneStream.this.f30682W.getString("allowedFormat", "").equals("")) {
                                    LoginActivityOneStream.this.f30694h0.putString("allowedFormat", "ts");
                                    LoginActivityOneStream.this.f30694h0.apply();
                                }
                                if (LoginActivityOneStream.this.f30683X.getString("timeFormat", AbstractC2237a.f44441E0).equals("")) {
                                    LoginActivityOneStream.this.f30690f0.putString("timeFormat", AbstractC2237a.f44441E0);
                                    LoginActivityOneStream.this.f30690f0.apply();
                                }
                                if (LoginActivityOneStream.this.f30684Y.getString("epgchannelupdate", "").equals("")) {
                                    LoginActivityOneStream.this.f30692g0.putString("epgchannelupdate", "all");
                                    LoginActivityOneStream.this.f30692g0.apply();
                                }
                                LoginActivityOneStream.this.f30708o0 = new MultiUserDBHandler(LoginActivityOneStream.this.f30658J);
                                if (AbstractC2237a.f44526o.booleanValue()) {
                                    MultiUserDBHandler multiUserDBHandler = LoginActivityOneStream.this.f30708o0;
                                    LoginActivityOneStream loginActivityOneStream13 = LoginActivityOneStream.this;
                                    String str3 = loginActivityOneStream13.f30728y0;
                                    String str4 = loginActivityOneStream13.f30662L;
                                    String str5 = LoginActivityOneStream.this.f30686d;
                                    try {
                                        if (multiUserDBHandler.checkregistration(str3, string, str4, str5, "onestream_api", str5, "")) {
                                            LoginActivityOneStream.this.b();
                                            toastMakeText = Toast.makeText(LoginActivityOneStream.this.f30658J, LoginActivityOneStream.this.getString(a7.j.f12973D) + LoginActivityOneStream.this.f30728y0 + LoginActivityOneStream.this.getString(a7.j.f13405u8) + string + LoginActivityOneStream.this.getString(a7.j.f12993F) + AbstractC2237a.f44482Z, 0);
                                        } else {
                                            MultiUserDBHandler multiUserDBHandler2 = LoginActivityOneStream.this.f30708o0;
                                            LoginActivityOneStream loginActivityOneStream14 = LoginActivityOneStream.this;
                                            multiUserDBHandler2.addmultiusers(loginActivityOneStream14.f30728y0, string, loginActivityOneStream14.f30662L, AbstractC2237a.f44482Z, "", "onestream_api");
                                            toastMakeText = Toast.makeText(LoginActivityOneStream.this.f30658J, LoginActivityOneStream.this.getResources().getString(a7.j.f13375r8), 0);
                                        }
                                        toastMakeText.show();
                                    } catch (WindowManager.BadTokenException unused) {
                                    }
                                } else {
                                    MultiUserDBHandler multiUserDBHandler3 = LoginActivityOneStream.this.f30708o0;
                                    LoginActivityOneStream loginActivityOneStream15 = LoginActivityOneStream.this;
                                    String str6 = loginActivityOneStream15.f30728y0;
                                    String str7 = loginActivityOneStream15.f30662L;
                                    String str8 = LoginActivityOneStream.this.f30686d;
                                    if (!multiUserDBHandler3.checkregistration(str6, string, str7, str8, "onestream_api", str8, "")) {
                                        MultiUserDBHandler multiUserDBHandler4 = LoginActivityOneStream.this.f30708o0;
                                        LoginActivityOneStream loginActivityOneStream16 = LoginActivityOneStream.this;
                                        multiUserDBHandler4.addmultiusers(loginActivityOneStream16.f30728y0, string, loginActivityOneStream16.f30662L, AbstractC2237a.f44482Z, "", "onestream_api");
                                    }
                                }
                                SharedPreferences.Editor editorEdit2 = LoginActivityOneStream.this.f30658J.getSharedPreferences("loginprefsmultiuser", 0).edit();
                                editorEdit2.putString("name", LoginActivityOneStream.this.f30728y0);
                                editorEdit2.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, string);
                                editorEdit2.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, LoginActivityOneStream.this.f30662L);
                                editorEdit2.putString(AbstractC2237a.f44454L, LoginActivityOneStream.this.f30686d);
                                editorEdit2.putString("expDate", string2);
                                editorEdit2.apply();
                                if (LoginActivityOneStream.this.f30658J != null) {
                                    MultiUserDBHandler multiUserDBHandler5 = LoginActivityOneStream.this.f30708o0;
                                    LoginActivityOneStream loginActivityOneStream17 = LoginActivityOneStream.this;
                                    String str9 = loginActivityOneStream17.f30728y0;
                                    String str10 = loginActivityOneStream17.f30662L;
                                    String str11 = LoginActivityOneStream.this.f30686d;
                                    SharepreferenceDBHandler.setUserID(multiUserDBHandler5.getAutoIdLoggedInUser(str9, string, str10, str11, "onestream_api", str11, ""), LoginActivityOneStream.this.f30658J);
                                }
                                LoginActivityOneStream.this.b();
                                LoginActivityOneStream.this.startActivity(new Intent(LoginActivityOneStream.this.getApplicationContext(), (Class<?>) ImportOneStreamActivity.class));
                                return;
                            }
                        }
                    }
                } catch (JSONException e9) {
                    e9.printStackTrace();
                    return;
                }
            }
            LoginActivityOneStream.this.G2(this.f30747a);
        }

        @Override // p1.InterfaceC2389c
        public void b(C2219a c2219a) {
            Log.e("INFO_API", String.valueOf(c2219a));
            Toast.makeText(LoginActivityOneStream.this.getApplicationContext(), LoginActivityOneStream.this.getResources().getString(a7.j.f12976D2), 0).show();
        }
    }

    public class l extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f30749a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f30750c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f30751d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f30752e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f30753f;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f30755a;

            public a(View view) {
                this.f30755a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f30755a;
                    if (view2 == null || view2.getTag() == null || !this.f30755a.getTag().equals("1")) {
                        View view3 = this.f30755a;
                        if (view3 == null || view3.getTag() == null || !this.f30755a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = l.this.f30753f;
                        }
                    } else {
                        linearLayout = l.this.f30752e;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f30755a;
                    if (view4 == null || view4.getTag() == null || !this.f30755a.getTag().equals("1")) {
                        View view5 = this.f30755a;
                        if (view5 == null || view5.getTag() == null || !this.f30755a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = l.this.f30753f;
                        }
                    } else {
                        linearLayout = l.this.f30752e;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        public l(Activity activity) {
            super(activity);
            this.f30749a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (view.getId() == a7.f.f12524s1) {
                    dismiss();
                    LoginActivityOneStream.this.E2();
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
            setContentView(LoginActivityOneStream.this.f30679T0.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12819j2 : a7.g.f12813i2);
            this.f30750c = (TextView) findViewById(a7.f.f12524s1);
            this.f30751d = (TextView) findViewById(a7.f.f12313X0);
            this.f30752e = (LinearLayout) findViewById(a7.f.Ia);
            this.f30753f = (LinearLayout) findViewById(a7.f.V8);
            this.f30750c.setOnClickListener(this);
            this.f30751d.setOnClickListener(this);
            TextView textView = this.f30750c;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f30751d;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    public class m extends AsyncTask {

        public class a implements MyApplication.d {
            public a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void f(String str) {
                MyApplication.p().D("LOS" + str, LoginActivityOneStream.this.f30658J);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void g(String str) {
                MyApplication.p().D("LOS" + str, LoginActivityOneStream.this.f30658J);
                LoginActivityOneStream.this.B2();
            }

            @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
            public void a(final String str) {
                LoginActivityOneStream.this.runOnUiThread(new Runnable() { // from class: p7.W
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f46619a.g(str);
                    }
                });
            }

            @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
            public void b(final String str) {
                LoginActivityOneStream.this.runOnUiThread(new Runnable() { // from class: p7.U
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f46614a.f(str);
                    }
                });
            }

            @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
            public void onSuccess() {
                final LoginActivityOneStream loginActivityOneStream = LoginActivityOneStream.this;
                loginActivityOneStream.runOnUiThread(new Runnable() { // from class: p7.V
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginActivityOneStream.f2(loginActivityOneStream);
                    }
                });
            }
        }

        public m() {
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
                if (AbstractC2237a.f44477W0.booleanValue()) {
                    MyApplication.p().G(LoginActivityOneStream.this.f30658J, new a());
                    return;
                } else {
                    LoginActivityOneStream.this.B2();
                    return;
                }
            }
            LoginActivityOneStream.this.b();
            LoginActivityOneStream loginActivityOneStream = LoginActivityOneStream.this;
            l lVar = loginActivityOneStream.new l((Activity) loginActivityOneStream.f30658J);
            lVar.setCancelable(false);
            lVar.show();
        }
    }

    public class n implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f30759a;

        public n(View view) {
            this.f30759a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30759a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30759a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30759a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            View view2;
            LoginActivityOneStream loginActivityOneStream;
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
                View view3 = this.f30759a;
                if (view3 == null || view3.getTag() == null || !this.f30759a.getTag().equals("rl_list_users")) {
                    View view4 = this.f30759a;
                    if (view4 == null || view4.getTag() == null || !this.f30759a.getTag().equals("rl_connect_vpn")) {
                        View view5 = this.f30759a;
                        if ((view5 != null && view5.getTag() != null && this.f30759a.getTag().equals("rl_login_from_mobile_app")) || (view2 = this.f30759a) == null || view2.getTag() == null || !this.f30759a.getTag().equals("rl_bt_submit")) {
                            return;
                        }
                        LoginActivityOneStream.this.f30713r.setBackgroundResource(a7.e.f12058t);
                        loginActivityOneStream = LoginActivityOneStream.this;
                        textView = loginActivityOneStream.f30644C;
                    } else {
                        LoginActivityOneStream.this.f30650F.setBackgroundResource(a7.e.f11996d1);
                        LoginActivityOneStream.this.f30640A.setImageResource(a7.e.f12004f1);
                        loginActivityOneStream = LoginActivityOneStream.this;
                        textView = loginActivityOneStream.f30642B;
                    }
                } else {
                    LoginActivityOneStream.this.f30723w.setBackgroundResource(a7.e.f11996d1);
                    LoginActivityOneStream.this.f30646D.setImageResource(a7.e.f12012h1);
                    loginActivityOneStream = LoginActivityOneStream.this;
                    textView = loginActivityOneStream.f30648E;
                }
                textView.setTextColor(loginActivityOneStream.f30658J.getResources().getColor(a7.c.f11855f));
                return;
            }
            f9 = z9 ? 1.15f : 1.0f;
            try {
                Log.e("id is", "" + this.f30759a.getTag());
                if (this.f30759a.getTag().equals("1")) {
                    editText = LoginActivityOneStream.this.f30687e;
                    length = editText.length();
                } else if (this.f30759a.getTag().equals("2")) {
                    editText = LoginActivityOneStream.this.f30689f;
                    length = editText.length();
                } else {
                    if (!this.f30759a.getTag().equals("3")) {
                        if (this.f30759a.getTag().equals("rl_list_users")) {
                            LoginActivityOneStream.this.f30723w.setBackgroundResource(a7.e.f11992c1);
                            LoginActivityOneStream.this.f30646D.setImageResource(a7.e.f12008g1);
                            LoginActivityOneStream loginActivityOneStream2 = LoginActivityOneStream.this;
                            loginActivityOneStream2.f30648E.setTextColor(loginActivityOneStream2.f30658J.getResources().getColor(a7.c.f11849G));
                            b(f9);
                        } else if (this.f30759a.getTag().equals("rl_login_from_mobile_app")) {
                            b(f9);
                        } else {
                            if (!this.f30759a.getTag().equals("rl_connect_vpn")) {
                                if (this.f30759a.getTag().equals("rl_bt_submit")) {
                                    LoginActivityOneStream.this.f30713r.setBackgroundResource(a7.e.f12054s);
                                    LoginActivityOneStream loginActivityOneStream3 = LoginActivityOneStream.this;
                                    loginActivityOneStream3.f30644C.setTextColor(loginActivityOneStream3.f30658J.getResources().getColor(a7.c.f11849G));
                                    return;
                                }
                                return;
                            }
                            LoginActivityOneStream.this.f30650F.setBackgroundResource(a7.e.f11992c1);
                            LoginActivityOneStream.this.f30640A.setImageResource(a7.e.f12000e1);
                            LoginActivityOneStream loginActivityOneStream4 = LoginActivityOneStream.this;
                            loginActivityOneStream4.f30642B.setTextColor(loginActivityOneStream4.f30658J.getResources().getColor(a7.c.f11849G));
                            b(f9);
                        }
                        c(f9);
                        return;
                    }
                    editText = LoginActivityOneStream.this.f30691g;
                    length = editText.length();
                }
                editText.setSelection(length);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    private void A2() {
        EditText editText;
        int i9;
        EditText editText2;
        int i10;
        EditText editText3;
        int i11;
        EditText editText4;
        this.f30693h = new EditText(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        this.f30693h.setPaddingRelative(35, 0, 35, 0);
        this.f30693h.setLayoutParams(layoutParams);
        this.f30693h.setHint(getResources().getString(a7.j.d9));
        this.f30693h.setHintTextColor(getResources().getColor(a7.c.f11849G));
        this.f30693h.setHintTextColor(-1);
        if (AbstractC2237a.f44538t.booleanValue()) {
            editText = this.f30693h;
            i9 = a7.f.Ae;
        } else {
            editText = this.f30693h;
            i9 = a7.f.he;
        }
        editText.setNextFocusLeftId(i9);
        this.f30693h.setTextSize(22.0f);
        this.f30693h.setId(101);
        this.f30693h.setBackground(getResources().getDrawable(a7.e.f11927J1));
        this.f30693h.setFocusable(true);
        EditText editText5 = this.f30693h;
        Typeface typeface = Typeface.SANS_SERIF;
        editText5.setTypeface(typeface);
        this.f30693h.setInputType(161);
        this.f30705n.addView(this.f30693h);
        this.f30687e = new EditText(this);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        this.f30687e.setPaddingRelative(35, 0, 35, 0);
        this.f30687e.setLayoutParams(layoutParams2);
        if (AbstractC2237a.f44550z.booleanValue()) {
            this.f30721v.setGravity(16);
        }
        this.f30687e.setHint(getResources().getString(a7.j.f13395t8));
        this.f30687e.setHintTextColor(getResources().getColor(a7.c.f11849G));
        this.f30687e.setHintTextColor(-1);
        this.f30687e.setTextSize(22.0f);
        this.f30687e.setId(HttpStatus.SC_PROCESSING);
        if (AbstractC2237a.f44538t.booleanValue()) {
            editText2 = this.f30687e;
            i10 = a7.f.Ae;
        } else {
            editText2 = this.f30687e;
            i10 = a7.f.he;
        }
        editText2.setNextFocusLeftId(i10);
        this.f30687e.setFocusable(true);
        this.f30687e.setBackground(getResources().getDrawable(a7.e.f11927J1));
        this.f30687e.setTypeface(typeface);
        this.f30687e.setInputType(161);
        this.f30707o.addView(this.f30687e);
        this.f30689f = new EditText(this);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        this.f30689f.setPaddingRelative(35, 0, 35, 0);
        this.f30689f.setLayoutParams(layoutParams3);
        this.f30689f.setHint(getResources().getString(a7.j.f13174X4));
        this.f30689f.setHintTextColor(getResources().getColor(a7.c.f11849G));
        this.f30689f.setHintTextColor(-1);
        this.f30689f.setTextSize(22.0f);
        this.f30689f.setId(103);
        if (AbstractC2237a.f44538t.booleanValue()) {
            editText3 = this.f30689f;
            i11 = a7.f.Ae;
        } else {
            editText3 = this.f30689f;
            i11 = a7.f.he;
        }
        editText3.setNextFocusLeftId(i11);
        this.f30689f.setBackground(getResources().getDrawable(a7.e.f11927J1));
        this.f30689f.setFocusable(true);
        this.f30689f.setTypeface(typeface);
        this.f30689f.setInputType(129);
        this.f30709p.addView(this.f30689f);
        this.f30719u.setId(IjkMediaMeta.FF_PROFILE_H264_HIGH_10);
        this.f30719u.setFocusable(true);
        this.f30689f.setNextFocusDownId(104);
        this.f30689f.setNextFocusUpId(HttpStatus.SC_PROCESSING);
        this.f30719u.setNextFocusDownId(104);
        this.f30719u.setNextFocusUpId(HttpStatus.SC_PROCESSING);
        this.f30719u.setBackground(getResources().getDrawable(a7.e.f11927J1));
        this.f30719u.setOnClickListener(new a());
        if (AbstractC2237a.f44526o.booleanValue()) {
            this.f30691g = new EditText(this);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -1);
            this.f30691g.setPaddingRelative(35, 0, 35, 0);
            this.f30691g.setLayoutParams(layoutParams4);
            this.f30691g.setHint(getResources().getString(a7.j.f13100P6));
            this.f30691g.setHintTextColor(getResources().getColor(a7.c.f11849G));
            this.f30691g.setHintTextColor(-1);
            this.f30691g.setTextSize(22.0f);
            this.f30691g.setId(104);
            this.f30691g.setBackground(getResources().getDrawable(a7.e.f11927J1));
            this.f30691g.setFocusable(true);
            this.f30691g.setTypeface(typeface);
            this.f30691g.setInputType(161);
            this.f30711q.addView(this.f30691g);
        }
        if (AbstractC2237a.f44538t.booleanValue()) {
            this.f30693h.requestFocus();
            editText4 = this.f30693h;
        } else {
            this.f30687e.requestFocus();
            editText4 = this.f30687e;
        }
        editText4.requestFocusFromTouch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B2() {
        if (AbstractC2237a.f44548y.booleanValue()) {
            if (AbstractC2237a.f44548y.booleanValue()) {
                SharepreferenceDBHandler.setActivationCode(this.f30658J, this.f30660K);
                this.f30728y0 = this.f30693h.getText().toString().trim();
                C2298a c2298a = new C2298a(this, this.f30658J);
                this.f30677S0 = c2298a;
                c2298a.a(this.f30660K);
                return;
            }
            return;
        }
        if (AbstractC2237a.f44523n.booleanValue()) {
            this.f30680U.putString(AbstractC2237a.f44454L, "http://qqtv.nl");
            this.f30680U.apply();
            this.f30668O.putString(AbstractC2237a.f44454L, "http://qqtv.nl");
            this.f30668O.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, this.f30660K);
            this.f30668O.apply();
            if (AbstractC2237a.f44538t.booleanValue()) {
                D2("http://qqtv.nl");
            }
        } else if (AbstractC2237a.f44526o.booleanValue()) {
            try {
                String lowerCase = this.f30691g.getText().toString().trim().toLowerCase();
                this.f30686d = lowerCase;
                this.f30680U.putString(AbstractC2237a.f44454L, lowerCase);
                this.f30680U.apply();
                this.f30668O.putString(AbstractC2237a.f44454L, this.f30686d);
                this.f30668O.apply();
                D2(this.f30686d);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        } else {
            x1();
        }
        this.f30676S.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, this.f30660K);
        this.f30676S.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, this.f30662L);
        this.f30676S.putString("activationCode", "");
        this.f30676S.putString("loginWith", "loginWithDetails");
        this.f30676S.apply();
        this.f30680U.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C2() {
        SharepreferenceDBHandler.setCurrentAPPType("onestream_api", this.f30658J);
        startActivity(new Intent(this, (Class<?>) MultiUserActivity.class));
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        finish();
    }

    private void D2(String str) {
        ArrayList arrayList;
        if (!AbstractC2237a.f44526o.booleanValue()) {
            if (str != null && !str.isEmpty()) {
                arrayList = new ArrayList(Arrays.asList(str.split(",")));
            }
            G2(this.f30655H0);
        }
        arrayList = new ArrayList();
        arrayList.add(str);
        this.f30655H0 = arrayList;
        G2(this.f30655H0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E2() {
        this.f30660K = this.f30687e.getText().toString().trim();
        this.f30662L = this.f30689f.getText().toString().trim();
        this.f30728y0 = this.f30693h.getText().toString().trim();
        this.f30680U = this.f30678T.edit();
        if (r2()) {
            a();
            new m().execute(new Void[0]);
        }
    }

    public static /* synthetic */ void f2(LoginActivityOneStream loginActivityOneStream) {
        loginActivityOneStream.B2();
    }

    private static String p2(String str) {
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

    private void q2() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private String t2() {
        return w.p0(Calendar.getInstance().getTime().toString());
    }

    public static String v2() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return p2(str2);
        }
        return p2(str) + " " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w2() {
        TextView textView;
        int i9;
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        ProgressDialog progressDialog;
        String string;
        try {
            this.f30658J = this;
            this.f30708o0 = new MultiUserDBHandler(this.f30658J);
            this.f30681V = new LiveStreamDBHandler(this.f30658J);
            if (AbstractC2237a.f44550z.booleanValue()) {
                this.f30703m.setVisibility(0);
            }
            if (AbstractC2237a.f44538t.booleanValue()) {
                textView = this.f30703m;
                i9 = a7.f.Ae;
            } else {
                textView = this.f30703m;
                i9 = a7.f.he;
            }
            textView.setNextFocusLeftId(i9);
            if (AbstractC2237a.f44548y.booleanValue()) {
                this.f30687e.setHint((CharSequence) null);
                this.f30687e.setHint("");
                this.f30703m.setText(getResources().getString(a7.j.f13092O8));
                this.f30697j.setText(getResources().getString(a7.j.f13318m1));
                this.f30711q.setVisibility(8);
                this.f30717t.setVisibility(8);
                this.f30687e.setVisibility(8);
                this.f30687e.setVisibility(0);
                this.f30687e.setHint(getResources().getString(a7.j.f13336o));
                this.f30644C.setText(getResources().getString(a7.j.f13337o0));
                if (AbstractC2237a.f44538t.booleanValue()) {
                    this.f30705n.setVisibility(0);
                } else {
                    this.f30705n.setVisibility(8);
                }
                if ((AbstractC2237a.f44536s.booleanValue() && AbstractC2237a.f44538t.booleanValue()) || AbstractC2237a.f44540u.booleanValue()) {
                    relativeLayout2 = this.f30723w;
                    relativeLayout2.setVisibility(0);
                } else {
                    relativeLayout = this.f30723w;
                    relativeLayout.setVisibility(8);
                }
            } else {
                if (AbstractC2237a.f44538t.booleanValue()) {
                    this.f30687e.setHint((CharSequence) null);
                    this.f30687e.setHint("");
                    this.f30703m.setText(getResources().getString(a7.j.f13102P8));
                    this.f30644C.setText(getResources().getString(a7.j.f13376s));
                    this.f30687e.setVisibility(8);
                    this.f30687e.setVisibility(0);
                    this.f30687e.setHint(getResources().getString(a7.j.f13395t8));
                    this.f30717t.setVisibility(0);
                    this.f30705n.setVisibility(0);
                    if (AbstractC2237a.f44526o.booleanValue()) {
                        this.f30711q.setVisibility(0);
                    } else {
                        this.f30711q.setVisibility(8);
                    }
                    if ((AbstractC2237a.f44536s.booleanValue() && AbstractC2237a.f44538t.booleanValue()) || AbstractC2237a.f44540u.booleanValue()) {
                        relativeLayout2 = this.f30723w;
                        relativeLayout2.setVisibility(0);
                    } else {
                        relativeLayout = this.f30723w;
                    }
                } else {
                    this.f30687e.setHint((CharSequence) null);
                    this.f30687e.setHint("");
                    this.f30703m.setText(getResources().getString(a7.j.f13102P8));
                    this.f30697j.setText(getResources().getString(a7.j.f12954B0));
                    this.f30687e.setVisibility(8);
                    this.f30687e.setVisibility(0);
                    this.f30717t.setVisibility(0);
                    this.f30687e.setHint(getResources().getString(a7.j.f13395t8));
                    this.f30644C.setText(getResources().getString(a7.j.f13101P7));
                    this.f30711q.setVisibility(8);
                    this.f30705n.setVisibility(8);
                    relativeLayout = this.f30723w;
                }
                relativeLayout.setVisibility(8);
            }
            this.f30693h.setError(null);
            this.f30687e.setError(null);
            this.f30689f.setError(null);
            this.f30710p0 = new DatabaseHandler(this.f30658J);
            if (this.f30658J != null) {
                this.f30664M = new ProgressDialog(this.f30658J);
                String str = this.f30675R0;
                if (str != null && str.equalsIgnoreCase("login_perform")) {
                    progressDialog = this.f30664M;
                    string = "Auto Login";
                } else if (AbstractC2237a.f44548y.booleanValue()) {
                    this.f30664M.setMessage("");
                    progressDialog = this.f30664M;
                    string = getResources().getString(a7.j.f13402u5);
                } else {
                    this.f30664M.setMessage("");
                    progressDialog = this.f30664M;
                    string = getResources().getString(a7.j.f13392t5);
                }
                progressDialog.setMessage(string);
                this.f30664M.setCanceledOnTouchOutside(false);
                this.f30664M.setCancelable(false);
                this.f30664M.setProgressStyle(0);
            }
            this.f30660K = this.f30687e.getText().toString();
            this.f30662L = this.f30689f.getText().toString();
            this.f30656I = new n7.d(this, this.f30658J);
            this.f30666N = getSharedPreferences("sharedPreference", 0);
            this.f30672Q = getSharedPreferences("loginPrefs", 0);
            this.f30674R = getSharedPreferences("selected_language", 0);
            SharedPreferences sharedPreferences = getSharedPreferences("loginPrefsserverurl", 0);
            this.f30678T = sharedPreferences;
            this.f30680U = sharedPreferences.edit();
            SharedPreferences sharedPreferences2 = getSharedPreferences("upgradeDatePref", 0);
            this.f30702l0 = sharedPreferences2;
            this.f30700k0 = sharedPreferences2.edit();
            this.f30676S = this.f30670P.edit();
            this.f30668O = this.f30666N.edit();
            SharedPreferences sharedPreferences3 = getSharedPreferences("multiDNS", 0);
            this.f30643B0 = sharedPreferences3;
            this.f30645C0 = sharedPreferences3.edit();
            SharedPreferences sharedPreferences4 = getSharedPreferences("multiDNSValid", 0);
            this.f30647D0 = sharedPreferences4;
            this.f30649E0 = sharedPreferences4.edit();
            this.f30651F0 = getSharedPreferences("serverUrlDNS", 0);
            if (AbstractC2237a.f44538t.booleanValue()) {
                this.f30687e.setText("");
                this.f30689f.setText("");
            }
            x2();
        } catch (Resources.NotFoundException e9) {
            e9.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y1() {
        startActivity(new Intent(this, (Class<?>) FirebaseRegisterDeviceActivity.class));
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    public static String y2(String str) {
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

    public final void F2(ArrayList arrayList) {
        AbstractC2237a.f44482Z = this.f30686d;
        AbstractC2074a.b(this.f30686d + "play/b2c/v1/auth").s(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, this.f30660K).s(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, this.f30662L).t("Content-Type", "FormUrlEncoded").v(k1.e.MEDIUM).u().o(new j(arrayList));
    }

    public final void G2(ArrayList arrayList) {
        if (arrayList == null || arrayList.size() < 1) {
            if (arrayList == null || arrayList.size() != 0) {
                return;
            }
            b();
            Toast.makeText(this, this.f30658J.getResources().getString(a7.j.f12976D2), 0).show();
            return;
        }
        try {
            String strTrim = ((String) arrayList.get(0)).trim();
            this.f30686d = strTrim;
            if (!strTrim.startsWith("http://") && !this.f30686d.startsWith("https://")) {
                this.f30686d = "http://" + this.f30686d;
            }
            if (!this.f30686d.endsWith("/")) {
                this.f30686d += "/";
            }
            this.f30680U.putString(AbstractC2237a.f44454L, this.f30686d);
            this.f30680U.apply();
            arrayList.remove(0);
            w1(arrayList);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // z7.InterfaceC3059a
    public void S(String str) {
        b();
        if (str != null) {
            w.P0(this.f30658J, str);
        } else {
            w.P0(this.f30658J, "Your Activation code is not invalid");
        }
    }

    @Override // z7.b
    public void a() {
        ProgressDialog progressDialog = this.f30664M;
        if (progressDialog != null) {
            progressDialog.show();
        }
    }

    @Override // z7.b
    public void b() {
        try {
            ProgressDialog progressDialog = this.f30664M;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    @Override // b7.InterfaceC1233c
    public void b0(int i9) {
        if (this.f30658J != null) {
            b();
            Toast.makeText(this, this.f30658J.getResources().getString(a7.j.f12944A0), 0).show();
        }
    }

    @Override // z7.f
    public void c(String str) {
        b();
        if (!str.equals("")) {
            w.P0(this.f30658J, str);
        } else if (AbstractC2237a.f44523n.booleanValue()) {
            Toast.makeText(this, getResources().getString(a7.j.f12966C2), 0).show();
        } else {
            w.P0(this.f30658J, "Your Account is invalid or has expired !");
        }
    }

    @Override // z7.b
    public void d(String str) {
        if (this.f30658J == null || str.isEmpty()) {
            return;
        }
        w.P0(this.f30658J, str);
    }

    @Override // z7.f
    public void e(String str) {
        ProgressDialog progressDialog = this.f30664M;
        if (progressDialog != null) {
            progressDialog.dismiss();
            Toast.makeText(this, this.f30658J.getResources().getString(a7.j.f13006G2), 0).show();
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
                w.P0(this.f30658J, "Your Account is invalid or has expired !");
                return;
            }
        }
        try {
            this.f30680U.putString(AbstractC2237a.f44454L, ((String) arrayList.get(0)).trim());
            this.f30680U.apply();
            arrayList.remove(0);
            this.f30656I.h(this.f30660K, this.f30662L, arrayList);
        } catch (IOException e9) {
            e9.printStackTrace();
        }
    }

    @Override // z7.f
    public void m(LoginCallback loginCallback, String str) {
        Context context;
        String string;
        int i9;
        if (this.f30658J != null) {
            if (loginCallback == null || loginCallback.getUserLoginInfo() == null) {
                b();
                d(getResources().getString(a7.j.f12996F2));
                return;
            }
            if (loginCallback.getUserLoginInfo().getAuth().intValue() == 1) {
                String status = loginCallback.getUserLoginInfo().getStatus();
                if (!status.equals("Active")) {
                    b();
                    Toast.makeText(this, getResources().getString(a7.j.f13016H2) + status, 0).show();
                    return;
                }
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
                this.f30658J.getSharedPreferences("loginPrefsserverurl", 0).getString(AbstractC2237a.f44454L, "").toLowerCase();
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
                this.f30682W = this.f30658J.getSharedPreferences("allowedFormat", 0);
                this.f30683X = this.f30658J.getSharedPreferences("timeFormat", 0);
                this.f30684Y = this.f30658J.getSharedPreferences("epgchannelupdate", 0);
                this.f30685Z = this.f30658J.getSharedPreferences("automation_channels", 0);
                this.f30688e0 = this.f30658J.getSharedPreferences("automation_epg", 0);
                this.f30694h0 = this.f30682W.edit();
                this.f30690f0 = this.f30683X.edit();
                this.f30692g0 = this.f30684Y.edit();
                this.f30696i0 = this.f30685Z.edit();
                this.f30698j0 = this.f30688e0.edit();
                SharedPreferences sharedPreferences = this.f30658J.getSharedPreferences("auto_start", 0);
                this.f30704m0 = sharedPreferences;
                SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                this.f30706n0 = editorEdit2;
                if (editorEdit2 != null) {
                    editorEdit2.putBoolean("full_epg", true);
                    this.f30706n0.apply();
                }
                if (this.f30685Z.getString("automation_channels", "").equals("")) {
                    this.f30696i0.putString("automation_channels", "checked");
                    this.f30696i0.apply();
                }
                if (this.f30688e0.getString("automation_epg", "").equals("")) {
                    this.f30698j0.putString("automation_epg", "checked");
                    this.f30698j0.apply();
                }
                AbstractC2237a.f44491c0 = Boolean.FALSE;
                if (this.f30682W.getString("allowedFormat", "").equals("")) {
                    this.f30694h0.putString("allowedFormat", "ts");
                    this.f30694h0.apply();
                }
                if (this.f30683X.getString("timeFormat", AbstractC2237a.f44441E0).equals("")) {
                    this.f30690f0.putString("timeFormat", AbstractC2237a.f44441E0);
                    this.f30690f0.apply();
                }
                if (this.f30684Y.getString("epgchannelupdate", "").equals("")) {
                    this.f30692g0.putString("epgchannelupdate", "all");
                    this.f30692g0.apply();
                }
                this.f30708o0 = new MultiUserDBHandler(this.f30658J);
                boolean zBooleanValue = AbstractC2237a.f44526o.booleanValue();
                MultiUserDBHandler multiUserDBHandler = this.f30708o0;
                if (zBooleanValue) {
                    try {
                        if (multiUserDBHandler.checkregistration(this.f30728y0, username, password, url, "onestream_api", url, "")) {
                            b();
                            context = this.f30658J;
                            string = getString(a7.j.f12973D) + this.f30728y0 + getString(a7.j.f13405u8) + username + getString(a7.j.f12993F) + AbstractC2237a.f44482Z;
                            i9 = 0;
                        } else {
                            this.f30708o0.addmultiusers(this.f30728y0, username, password, AbstractC2237a.f44482Z, url, "onestream_api");
                            context = this.f30658J;
                            string = getResources().getString(a7.j.f13375r8);
                            i9 = 0;
                        }
                        Toast.makeText(context, string, i9).show();
                    } catch (WindowManager.BadTokenException unused) {
                    }
                    SharedPreferences.Editor editorEdit3 = this.f30658J.getSharedPreferences("loginprefsmultiuser", 0).edit();
                    editorEdit3.putString("name", this.f30728y0);
                    editorEdit3.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, username);
                    editorEdit3.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, password);
                    editorEdit3.putString(AbstractC2237a.f44454L, url);
                    editorEdit3.apply();
                } else if (!multiUserDBHandler.checkregistration("", username, password, url, "onestream_api", url, "")) {
                    this.f30708o0.addmultiusers("", username, password, AbstractC2237a.f44482Z, url, "onestream_api");
                }
                try {
                    if (Build.VERSION.SDK_INT != 25) {
                        Toast.makeText(this.f30658J, getResources().getString(a7.j.f13210b3), 0).show();
                    }
                } catch (WindowManager.BadTokenException unused2) {
                }
                if (this.f30658J != null) {
                    SharepreferenceDBHandler.setUserID(this.f30708o0.getAutoIdLoggedInUser(this.f30728y0, username, password, url, "onestream_api", url, ""), this.f30658J);
                }
                b();
                startActivity(new Intent(this, (Class<?>) ImportOneStreamActivity.class));
                finish();
            }
        }
    }

    public void o2() {
        try {
            this.f30669O0 = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e9) {
            e9.printStackTrace();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (AbstractC2237a.f44540u.booleanValue()) {
            super.onBackPressed();
        } else {
            if (this.f30654H) {
                super.onBackPressed();
                return;
            }
            this.f30654H = true;
            try {
                Toast.makeText(this, getResources().getString(a7.j.f12999F5), 0).show();
            } catch (Exception unused) {
            }
            new Handler().postDelayed(new b(), 2000L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0192  */
    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r7) {
        /*
            Method dump skipped, instruction units count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.LoginActivityOneStream.onCreate(android.os.Bundle):void");
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
        w.m(this.f30658J);
        w.z0(this.f30658J);
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // z7.InterfaceC3059a
    public void r0(ActivationCallBack activationCallBack, String str) {
        x1();
    }

    public boolean r2() {
        EditText editText;
        Resources resources;
        int i9;
        EditText editText2;
        Resources resources2;
        int i10;
        if (AbstractC2237a.f44538t.booleanValue() && this.f30693h.getText().toString().trim().length() == 0) {
            this.f30693h.requestFocus();
            editText = this.f30693h;
            resources = getResources();
            i9 = a7.j.f13328n1;
        } else {
            if (this.f30687e.getText().toString().trim().length() == 0) {
                this.f30687e.requestFocus();
                if (AbstractC2237a.f44548y.booleanValue()) {
                    editText2 = this.f30687e;
                    resources2 = getResources();
                    i10 = a7.j.f13318m1;
                } else {
                    editText2 = this.f30687e;
                    resources2 = getResources();
                    i10 = a7.j.f12945A1;
                }
                editText2.setError(resources2.getString(i10));
                return false;
            }
            if (!AbstractC2237a.f44548y.booleanValue() && this.f30689f.getText().toString().trim().length() == 0) {
                this.f30689f.requestFocus();
                editText = this.f30689f;
                resources = getResources();
                i9 = a7.j.f13408v1;
            } else {
                if (!AbstractC2237a.f44526o.booleanValue() || this.f30691g.getText().toString().trim().length() != 0) {
                    return true;
                }
                this.f30691g.requestFocus();
                editText = this.f30691g;
                resources = getResources();
                i9 = a7.j.f13418w1;
            }
        }
        editText.setError(resources.getString(i9));
        return false;
    }

    public void s2() {
        Button button;
        int i9;
        A2();
        this.f30650F.setOnClickListener(new d());
        this.f30713r.setOnClickListener(new e());
        this.f30723w.setOnClickListener(new f());
        this.f30725x.setOnClickListener(new g());
        if (AbstractC2237a.f44546x.booleanValue()) {
            button = this.f30701l;
            i9 = 0;
        } else {
            button = this.f30701l;
            i9 = 8;
        }
        button.setVisibility(i9);
        this.f30701l.setOnClickListener(new h());
        this.f30703m.setOnClickListener(new i());
    }

    public void u1() {
        this.f30667N0 = Build.VERSION.RELEASE + " " + Build.VERSION_CODES.class.getFields()[Build.VERSION.SDK_INT].getName();
    }

    public final void u2(ArrayList arrayList) {
        String oneStreamToken = SharepreferenceDBHandler.getOneStreamToken(this.f30658J);
        SharepreferenceDBHandler.setCurrentAPPType("onestream_api", this.f30658J);
        AbstractC2237a.f44482Z = this.f30686d;
        AbstractC2074a.a(this.f30686d + "play/b2c/v1/user-info?token=" + oneStreamToken).s(k1.e.MEDIUM).q().o(new k(arrayList));
    }

    public void v1() {
        int iNextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.f30673Q0 = iNextInt;
        AbstractC1232b.f17695b = String.valueOf(iNextInt);
    }

    @Override // z7.f
    public void w0(ArrayList arrayList, String str) {
        if (arrayList == null || arrayList.size() <= 0) {
            b();
            if (AbstractC2237a.f44523n.booleanValue()) {
                Toast.makeText(this, getResources().getString(a7.j.f12966C2), 0).show();
                return;
            } else {
                w.P0(this.f30658J, "Your Account is invalid or has expired !");
                return;
            }
        }
        try {
            this.f30680U.putString(AbstractC2237a.f44454L, ((String) arrayList.get(0)).trim());
            this.f30680U.apply();
            arrayList.remove(0);
            this.f30656I.h(this.f30660K, this.f30662L, arrayList);
        } catch (IOException e9) {
            e9.printStackTrace();
        }
    }

    public final void w1(ArrayList arrayList) {
        SharepreferenceDBHandler.setCurrentAPPType("onestream_api", this.f30658J);
        String string = this.f30658J.getSharedPreferences("loginPrefsserverurl", 0).getString(AbstractC2237a.f44454L, "");
        this.f30686d = string;
        this.f30686d = string.toLowerCase();
        Log.e("URl from Back", ">>>>>>>>" + this.f30686d);
        if (!this.f30686d.startsWith("http://") && !this.f30686d.startsWith("https://")) {
            this.f30686d = "http://" + this.f30686d;
        }
        if (!this.f30686d.endsWith("/")) {
            this.f30686d += "/";
        }
        F2(arrayList);
    }

    public void x1() {
        this.f30663L0 = y2(b7.f.c(this) + "*" + b7.f.d(this) + "-" + this.f30660K + "-" + AbstractC1232b.f17695b + "-" + this.f30669O0 + "-unknown-" + v2() + "-" + this.f30667N0);
        ArrayList arrayList = new ArrayList();
        b7.g.f17717b = arrayList;
        arrayList.add(b7.g.a("m", "gu"));
        b7.g.f17717b.add(b7.g.a("k", b7.f.c(this)));
        b7.g.f17717b.add(b7.g.a("sc", this.f30663L0));
        b7.g.f17717b.add(b7.g.a("u", this.f30660K));
        b7.g.f17717b.add(b7.g.a("pw", "no_password"));
        b7.g.f17717b.add(b7.g.a("r", AbstractC1232b.f17695b));
        b7.g.f17717b.add(b7.g.a("av", this.f30669O0));
        b7.g.f17717b.add(b7.g.a("dt", "unknown"));
        b7.g.f17717b.add(b7.g.a("d", v2()));
        b7.g.f17717b.add(b7.g.a("do", this.f30667N0));
        b7.g.f17718c.b(this);
    }

    public void x2() {
        EditText editText;
        try {
            if (AbstractC2237a.f44538t.booleanValue()) {
                this.f30693h.requestFocus();
                editText = this.f30693h;
            } else {
                this.f30687e.requestFocus();
                editText = this.f30687e;
            }
            editText.requestFocusFromTouch();
            b();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0377, code lost:
    
        if (m7.AbstractC2237a.f44523n.booleanValue() != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x03da, code lost:
    
        if (m7.AbstractC2237a.f44523n.booleanValue() != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x03dc, code lost:
    
        r0 = getResources();
        r2 = a7.j.f12966C2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x03ef, code lost:
    
        m7.w.P0(r18.f30658J, "Your Account is invalid or has expired !");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x03f4, code lost:
    
        return;
     */
    @Override // z7.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y(com.nst.iptvsmarterstvbox.model.callback.LoginCallback r19, java.lang.String r20, java.util.ArrayList r21) {
        /*
            Method dump skipped, instruction units count: 1013
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.LoginActivityOneStream.y(com.nst.iptvsmarterstvbox.model.callback.LoginCallback, java.lang.String, java.util.ArrayList):void");
    }

    @Override // b7.InterfaceC1233c
    /* JADX INFO: renamed from: z2, reason: merged with bridge method [inline-methods] */
    public void K0(String str, int i9, boolean z9) {
        String strTrim;
        if (!z9) {
            b();
            Toast.makeText(this, this.f30658J.getResources().getString(a7.j.f12944A0), 0).show();
            return;
        }
        if (i9 == 1) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                AbstractC1232b.f17694a = jSONObject;
                if (!jSONObject.getString("status").equalsIgnoreCase("true")) {
                    b();
                    Toast.makeText(this, this.f30658J.getResources().getString(a7.j.f13071M7), 0).show();
                    return;
                }
                this.f30722v0 = AbstractC1232b.f17694a.getString("su");
                this.f30724w0 = AbstractC1232b.f17694a.getString("ndd");
                this.f30726x0 = System.currentTimeMillis();
                try {
                    if (AbstractC2237a.f44548y.booleanValue()) {
                        this.f30660K = SharepreferenceDBHandler.getUserName(this.f30658J);
                        strTrim = SharepreferenceDBHandler.getUserPassword(this.f30658J);
                    } else {
                        this.f30660K = this.f30687e.getText().toString().trim();
                        strTrim = this.f30689f.getText().toString().trim();
                    }
                    this.f30662L = strTrim;
                    b7.f.e(this, AbstractC1232b.f17694a.optString("su"));
                    this.f30665M0 = y2(AbstractC1232b.f17694a.optString("su") + "*" + b7.f.d(this) + "*" + AbstractC1232b.f17695b);
                    if (!AbstractC1232b.f17694a.getString("sc").equalsIgnoreCase(this.f30665M0)) {
                        b();
                        Toast.makeText(this, this.f30658J.getResources().getString(a7.j.f12944A0), 0).show();
                        return;
                    }
                    this.f30680U.putString(AbstractC2237a.f44454L, b7.f.a(this));
                    this.f30680U.apply();
                    this.f30668O.putString(AbstractC2237a.f44454L, b7.f.a(this));
                    this.f30668O.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, this.f30660K);
                    this.f30668O.apply();
                    D2(this.f30722v0.toLowerCase());
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            } catch (Exception e10) {
                Log.e("Login check", e10.getMessage());
            }
        }
    }
}
