package com.nst.iptvsmarterstvbox.view.activity;

import a7.j;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import b7.AbstractC1232b;
import b7.InterfaceC1233c;
import b7.g;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.services.s3.internal.Constants;
import com.nst.iptvsmarterstvbox.model.callback.ActivationCallBack;
import com.nst.iptvsmarterstvbox.model.callback.LoginCallback;
import com.nst.iptvsmarterstvbox.model.callback.tvcode.MobileCodeActiveCallBack;
import com.nst.iptvsmarterstvbox.model.callback.tvcode.TVCodeGenerateCallBack;
import com.nst.iptvsmarterstvbox.model.callback.tvcode.TVCodeVerifyCallBack;
import com.nst.iptvsmarterstvbox.model.database.MultiUserDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import m7.AbstractC2237a;
import m7.w;
import org.achartengine.renderer.DefaultRenderer;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.joda.time.DateTimeConstants;
import org.json.JSONObject;
import u7.C2858a;
import x6.EnumC2960a;
import x6.s;
import z7.InterfaceC3059a;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseRegisterDeviceActivity extends androidx.appcompat.app.b implements FirebasePresenter.OnTvCodeProcessListener, z7.f, InterfaceC3059a, InterfaceC1233c {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C2858a f29831C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public SharedPreferences f29832D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public SharedPreferences.Editor f29833E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public SharedPreferences f29834F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public SharedPreferences.Editor f29835G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public n7.d f29836H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public SharedPreferences f29837I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public SharedPreferences.Editor f29838J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public MultiUserDBHandler f29839K;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String f29841M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public String f29842N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public String f29843O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public String f29844P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public String f29845Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public String f29846R;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public SharedPreferences f29850V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public SharedPreferences f29851W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public SharedPreferences f29852X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public SharedPreferences f29853Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public SharedPreferences f29854Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29855d;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public SharedPreferences.Editor f29857e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public SharedPreferences.Editor f29859f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f29860g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public SharedPreferences.Editor f29861g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ProgressBar f29862h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public SharedPreferences.Editor f29863h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f29864i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public SharedPreferences.Editor f29865i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f29866j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public SharedPreferences f29867j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f29868k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public SharedPreferences.Editor f29869k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f29870l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public ProgressDialog f29871l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f29872m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public ProgressDialog f29873m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f29874n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f29875o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f29876p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public RelativeLayout f29877q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f29878r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f29879s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Context f29880t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public FirebasePresenter f29882v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CountDownTimer f29884x;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f29856e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f29858f = "";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Thread f29881u = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Handler f29883w = new Handler();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f29885y = DateTimeConstants.MILLIS_PER_MINUTE;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Handler f29886z = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f29829A = 5;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f29830B = 0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ArrayList f29840L = new ArrayList();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public String f29847S = "";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public String f29848T = "";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public long f29849U = -1;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(FirebaseRegisterDeviceActivity.this.f29880t);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FirebaseRegisterDeviceActivity.this.H1();
        }
    }

    public class c extends CountDownTimer {
        public c(long j9, long j10) {
            super(j9, j10);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j9) {
            FirebaseRegisterDeviceActivity.this.f29878r.setText((j9 / 1000) + " Secs");
            FirebaseRegisterDeviceActivity.A1(FirebaseRegisterDeviceActivity.this);
            if (FirebaseRegisterDeviceActivity.this.f29830B >= FirebaseRegisterDeviceActivity.this.f29829A) {
                FirebaseRegisterDeviceActivity.this.f29830B = 0;
                if (AbstractC2237a.f44528o1) {
                    AbstractC2237a.f44528o1 = false;
                    FirebaseRegisterDeviceActivity.this.P1();
                }
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FirebaseRegisterDeviceActivity.this.H1();
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = w.R(FirebaseRegisterDeviceActivity.this.f29880t);
                String strA = w.A(string);
                TextView textView = FirebaseRegisterDeviceActivity.this.f29868k;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = FirebaseRegisterDeviceActivity.this.f29866j;
                if (textView2 != null) {
                    textView2.setText(strA);
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    FirebaseRegisterDeviceActivity.this.G1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public static /* synthetic */ int A1(FirebaseRegisterDeviceActivity firebaseRegisterDeviceActivity) {
        int i9 = firebaseRegisterDeviceActivity.f29830B;
        firebaseRegisterDeviceActivity.f29830B = i9 + 1;
        return i9;
    }

    private static String D1(String str) {
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

    public static String J1() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return D1(str2);
        }
        return D1(str) + " " + str2;
    }

    public static String L1(String str) {
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

    public void C1() {
        try {
            this.f29845Q = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e9) {
            e9.printStackTrace();
        }
    }

    public final void E1(String str) {
        Bitmap bitmapI1 = I1(str);
        if (bitmapI1 != null) {
            this.f29872m.setImageBitmap(bitmapI1);
        }
    }

    public void F1() {
        this.f29873m0.dismiss();
    }

    public void G1() {
        runOnUiThread(new e());
    }

    public void H1() {
        try {
            N1();
            this.f29874n.setVisibility(4);
            String strT0 = w.T0(this.f29880t);
            String str = new SimpleDateFormat("yyyy-MM").format(new Date());
            v1();
            w1();
            String strO0 = w.o0(AbstractC2237a.f44469S0 + "*Njh0&$@HAH828283636JSJSHS*" + AbstractC1232b.f17695b + "*" + str);
            FirebasePresenter firebasePresenter = this.f29882v;
            if (firebasePresenter != null) {
                firebasePresenter.m(AbstractC2237a.f44469S0, AbstractC2237a.f44471T0, str, strO0, strT0, this.f29858f);
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public Bitmap I1(String str) {
        try {
            D6.b bVarA = new U6.b().a(str, EnumC2960a.QR_CODE, 400, 400);
            int iL = bVarA.l();
            int i9 = bVarA.i();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iL, i9, Bitmap.Config.RGB_565);
            for (int i10 = 0; i10 < iL; i10++) {
                for (int i11 = 0; i11 < i9; i11++) {
                    bitmapCreateBitmap.setPixel(i10, i11, bVarA.f(i10, i11) ? DefaultRenderer.BACKGROUND_COLOR : -1);
                }
            }
            return bitmapCreateBitmap;
        } catch (s e9) {
            e9.printStackTrace();
            return null;
        }
    }

    public final void K1(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            ProgressDialog progressDialog = new ProgressDialog(this.f29880t);
            this.f29871l0 = progressDialog;
            progressDialog.setMessage("Please wait!");
            this.f29871l0.setCanceledOnTouchOutside(false);
            this.f29871l0.setCancelable(false);
            this.f29871l0.setProgressStyle(0);
            C1();
            u1();
            J1();
            v1();
            g.f17718c = new g(this);
            SharedPreferences sharedPreferences = getSharedPreferences("loginPrefsserverurl", 0);
            this.f29832D = sharedPreferences;
            this.f29833E = sharedPreferences.edit();
            SharedPreferences sharedPreferences2 = getSharedPreferences("sharedPreference", 0);
            this.f29834F = sharedPreferences2;
            this.f29835G = sharedPreferences2.edit();
            this.f29836H = new n7.d(this, getApplicationContext());
            SharedPreferences sharedPreferences3 = getSharedPreferences("sharedprefremberme", 0);
            this.f29837I = sharedPreferences3;
            this.f29838J = sharedPreferences3.edit();
            this.f29839K = new MultiUserDBHandler(getApplicationContext());
            this.f29841M = str;
            this.f29842N = str2;
            this.f29843O = str3;
            if (AbstractC2237a.f44523n.booleanValue()) {
                this.f29833E.putString(AbstractC2237a.f44454L, "http://qqtv.nl");
                this.f29833E.apply();
                this.f29835G.putString(AbstractC2237a.f44454L, "http://qqtv.nl");
                this.f29835G.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, this.f29841M);
                this.f29835G.apply();
                if (AbstractC2237a.f44538t.booleanValue()) {
                    O1("http://qqtv.nl");
                } else {
                    try {
                        this.f29836H.g(this.f29841M, this.f29842N);
                    } catch (Exception e9) {
                        e = e9;
                        e.printStackTrace();
                    }
                }
            } else {
                try {
                    if (str5.equalsIgnoreCase("api")) {
                        a();
                        this.f29833E.putString(AbstractC2237a.f44454L, str4);
                        this.f29833E.apply();
                        this.f29835G.putString(AbstractC2237a.f44454L, str4);
                        this.f29835G.apply();
                        this.f29836H.g(this.f29841M, this.f29842N);
                    } else if (str5.equalsIgnoreCase("onestream_api")) {
                        a();
                        this.f29833E.putString(AbstractC2237a.f44454L, str4);
                        this.f29833E.apply();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(str4);
                        new m7.e(this.f29880t, str5).z(arrayList, this.f29841M, this.f29842N, str3);
                    } else if (str5.equalsIgnoreCase("m3u")) {
                        new m7.e(this.f29880t, "m3u").y(str6, true, str3);
                    }
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                }
            }
            this.f29838J.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, this.f29841M);
            this.f29838J.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, this.f29842N);
            this.f29838J.putString("activationCode", "");
            this.f29838J.putString("loginWith", "loginWithDetails");
            this.f29838J.apply();
            this.f29833E.apply();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00da -> B:27:0x011b). Please report as a decompilation issue!!! */
    @Override // b7.InterfaceC1233c
    /* JADX INFO: renamed from: M1, reason: merged with bridge method [inline-methods] */
    public void K0(String str, int i9, boolean z9) {
        if (!z9) {
            b();
            Toast.makeText(this, getApplicationContext().getResources().getString(j.f12944A0), 0).show();
            return;
        }
        if (i9 == 1) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                AbstractC1232b.f17694a = jSONObject;
                if (jSONObject.getString("status").equalsIgnoreCase("true")) {
                    this.f29847S = AbstractC1232b.f17694a.getString("su");
                    this.f29848T = AbstractC1232b.f17694a.getString("ndd");
                    this.f29849U = System.currentTimeMillis();
                    try {
                        b7.f.e(this, AbstractC1232b.f17694a.optString("su"));
                        this.f29846R = L1(AbstractC1232b.f17694a.optString("su") + "*" + b7.f.d(this) + "*" + AbstractC1232b.f17695b);
                        if (AbstractC1232b.f17694a.getString("sc").equalsIgnoreCase(this.f29846R)) {
                            this.f29833E.putString(AbstractC2237a.f44454L, b7.f.a(this));
                            this.f29833E.apply();
                            this.f29835G.putString(AbstractC2237a.f44454L, b7.f.a(this));
                            this.f29835G.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, this.f29841M);
                            this.f29835G.apply();
                            if (AbstractC2237a.f44538t.booleanValue()) {
                                O1(this.f29847S.toLowerCase());
                            } else {
                                this.f29836H.g(this.f29841M, this.f29842N);
                            }
                        } else {
                            b();
                            Toast.makeText(this, getApplicationContext().getResources().getString(j.f12944A0), 0).show();
                        }
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                } else {
                    b();
                    Toast.makeText(this, getApplicationContext().getResources().getString(j.f13071M7), 0).show();
                }
            } catch (Exception e10) {
                Log.e("Login check", e10.getMessage());
            }
        }
    }

    public void N1() {
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f29873m0 = progressDialog;
        progressDialog.setMessage("Please Wait");
        this.f29873m0.show();
    }

    @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter.OnTvCodeProcessListener
    public void O0(TVCodeVerifyCallBack tVCodeVerifyCallBack) {
        try {
            F1();
            if (tVCodeVerifyCallBack == null || tVCodeVerifyCallBack.getResult() == null || !tVCodeVerifyCallBack.getResult().equals("success") || tVCodeVerifyCallBack.getSc() == null || tVCodeVerifyCallBack.getData() == null) {
                return;
            }
            if (tVCodeVerifyCallBack.getSc().equalsIgnoreCase(w.o0(AbstractC2237a.f44469S0 + "*JNHGHG34534543HSDHSHSSH*&^klih*" + this.f29856e + "*" + new SimpleDateFormat("yyyy-MM").format(new Date())))) {
                String strS0 = "";
                String strS02 = (tVCodeVerifyCallBack.getData().getUsername() == null || tVCodeVerifyCallBack.getData().getUsername().length() <= 0) ? "" : w.S0(tVCodeVerifyCallBack.getData().getUsername());
                String strS03 = (tVCodeVerifyCallBack.getData().getPassword() == null || tVCodeVerifyCallBack.getData().getPassword().length() <= 0) ? "" : w.S0(tVCodeVerifyCallBack.getData().getPassword());
                String strS04 = (tVCodeVerifyCallBack.getData().getAnyName() == null || tVCodeVerifyCallBack.getData().getAnyName().length() <= 0) ? "" : w.S0(tVCodeVerifyCallBack.getData().getAnyName());
                String strS05 = (tVCodeVerifyCallBack.getData().getDns() == null || tVCodeVerifyCallBack.getData().getDns().length() <= 0) ? "" : w.S0(tVCodeVerifyCallBack.getData().getDns());
                String type = (tVCodeVerifyCallBack.getData().getType() == null || tVCodeVerifyCallBack.getData().getType().length() <= 0) ? "" : tVCodeVerifyCallBack.getData().getType();
                if (tVCodeVerifyCallBack.getData().getM3ulink() != null && tVCodeVerifyCallBack.getData().getM3ulink().length() > 0) {
                    strS0 = w.S0(tVCodeVerifyCallBack.getData().getM3ulink());
                }
                String str = strS0;
                Handler handler = this.f29883w;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                Handler handler2 = this.f29886z;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                }
                CountDownTimer countDownTimer = this.f29884x;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                K1(strS02, strS03, strS04, strS05, type, str);
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void O1(String str) {
        if (str != null && !str.equals("") && !str.isEmpty()) {
            this.f29840L = new ArrayList(Arrays.asList(str.split(",")));
        }
        ArrayList arrayList = this.f29840L;
        if (arrayList == null || arrayList.size() < 1) {
            ArrayList arrayList2 = this.f29840L;
            if (arrayList2 == null || arrayList2.size() != 0) {
                return;
            }
            b();
            Toast.makeText(this, this.f29880t.getResources().getString(j.f13312l5), 0).show();
            return;
        }
        try {
            this.f29833E.putString(AbstractC2237a.f44454L, ((String) this.f29840L.get(0)).trim());
            this.f29833E.commit();
            this.f29840L.remove(0);
            this.f29836H.h(this.f29841M, this.f29842N, this.f29840L);
        } catch (IOException e9) {
            e9.printStackTrace();
        }
    }

    public void P1() {
        try {
            String strT0 = w.T0(this.f29880t);
            String str = new SimpleDateFormat("yyyy-MM").format(new Date());
            x1();
            String strO0 = w.o0(AbstractC2237a.f44469S0 + "*Njh0&$@HAH828283636JSJSHS*" + this.f29856e + "*" + str);
            FirebasePresenter firebasePresenter = this.f29882v;
            if (firebasePresenter != null) {
                firebasePresenter.n(AbstractC2237a.f44469S0, AbstractC2237a.f44471T0, str, strO0, strT0, this.f29858f, this.f29856e);
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // z7.InterfaceC3059a
    public void S(String str) {
    }

    @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter.OnTvCodeProcessListener
    public void S0(MobileCodeActiveCallBack mobileCodeActiveCallBack) {
    }

    @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter.OnTvCodeProcessListener
    public void W0() {
    }

    @Override // z7.b
    public void a() {
        ProgressDialog progressDialog = this.f29871l0;
        if (progressDialog != null) {
            progressDialog.show();
        }
    }

    @Override // z7.b
    public void b() {
        try {
            ProgressDialog progressDialog = this.f29871l0;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    @Override // b7.InterfaceC1233c
    public void b0(int i9) {
        if (getApplicationContext() != null) {
            b();
            Toast.makeText(this, getApplicationContext().getResources().getString(j.f12944A0), 0).show();
        }
    }

    @Override // z7.f
    public void c(String str) {
        b();
        if (!str.equals("")) {
            w.P0(this.f29880t, str);
        } else if (AbstractC2237a.f44523n.booleanValue()) {
            Toast.makeText(this, getResources().getString(j.f12966C2), 0).show();
        } else {
            w.P0(this.f29880t, "Your Account is invalid or has expired !");
        }
    }

    @Override // z7.b
    public void d(String str) {
        if (this.f29880t == null || str.isEmpty()) {
            return;
        }
        w.P0(this.f29880t, str);
    }

    @Override // z7.f
    public void e(String str) {
        if (this.f29871l0 != null) {
            F1();
            Toast.makeText(this, this.f29880t.getResources().getString(j.f13006G2), 0).show();
        }
    }

    @Override // z7.f
    public void h0(ArrayList arrayList, String str) {
    }

    @Override // z7.f
    public void m(LoginCallback loginCallback, String str) {
        int i9;
        String string;
        if (this.f29880t != null) {
            if (loginCallback == null || loginCallback.getUserLoginInfo() == null) {
                b();
                d(getResources().getString(j.f12996F2));
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
                    this.f29880t.getSharedPreferences("loginPrefsserverurl", 0).getString(AbstractC2237a.f44454L, "").toLowerCase();
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
                    this.f29850V = this.f29880t.getSharedPreferences("allowedFormat", 0);
                    this.f29851W = this.f29880t.getSharedPreferences("timeFormat", 0);
                    this.f29852X = this.f29880t.getSharedPreferences("epgchannelupdate", 0);
                    this.f29853Y = this.f29880t.getSharedPreferences("automation_channels", 0);
                    this.f29854Z = this.f29880t.getSharedPreferences("automation_epg", 0);
                    this.f29861g0 = this.f29850V.edit();
                    this.f29857e0 = this.f29851W.edit();
                    this.f29859f0 = this.f29852X.edit();
                    this.f29863h0 = this.f29853Y.edit();
                    this.f29865i0 = this.f29854Z.edit();
                    SharedPreferences sharedPreferences = this.f29880t.getSharedPreferences("auto_start", 0);
                    this.f29867j0 = sharedPreferences;
                    SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                    this.f29869k0 = editorEdit2;
                    if (editorEdit2 != null) {
                        editorEdit2.putBoolean("full_epg", true);
                        this.f29869k0.apply();
                    }
                    if (this.f29853Y.getString("automation_channels", "").equals("")) {
                        this.f29863h0.putString("automation_channels", "checked");
                        this.f29863h0.apply();
                    }
                    if (this.f29854Z.getString("automation_epg", "").equals("")) {
                        this.f29865i0.putString("automation_epg", "checked");
                        this.f29865i0.apply();
                    }
                    AbstractC2237a.f44491c0 = Boolean.FALSE;
                    if (this.f29850V.getString("allowedFormat", "").equals("")) {
                        this.f29861g0.putString("allowedFormat", "ts");
                        this.f29861g0.apply();
                    }
                    if (this.f29851W.getString("timeFormat", AbstractC2237a.f44441E0).equals("")) {
                        this.f29857e0.putString("timeFormat", AbstractC2237a.f44441E0);
                        this.f29857e0.apply();
                    }
                    if (this.f29852X.getString("epgchannelupdate", "").equals("")) {
                        this.f29859f0.putString("epgchannelupdate", "all");
                        this.f29859f0.apply();
                    }
                    this.f29839K = new MultiUserDBHandler(this.f29880t);
                    SharepreferenceDBHandler.setCurrentAPPType("api", this.f29880t);
                    boolean zBooleanValue = AbstractC2237a.f44536s.booleanValue();
                    MultiUserDBHandler multiUserDBHandler = this.f29839K;
                    if (zBooleanValue) {
                        try {
                            if (multiUserDBHandler.checkregistration(this.f29843O, username, password, url, "api", url, "")) {
                                b();
                                Toast.makeText(this.f29880t, getString(j.f12973D) + this.f29843O + getString(j.f13405u8) + username + getString(j.f12993F) + AbstractC2237a.f44482Z, 0).show();
                            } else {
                                this.f29839K.addmultiusers(this.f29843O, username, password, AbstractC2237a.f44482Z, url, "api");
                                Toast.makeText(this.f29880t, getResources().getString(j.f13375r8), 0).show();
                            }
                        } catch (WindowManager.BadTokenException e9) {
                            e9.printStackTrace();
                        }
                        SharedPreferences.Editor editorEdit3 = this.f29880t.getSharedPreferences("loginprefsmultiuser", 0).edit();
                        editorEdit3.putString("name", this.f29843O);
                        editorEdit3.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, username);
                        editorEdit3.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, password);
                        editorEdit3.putString(AbstractC2237a.f44454L, url);
                        editorEdit3.apply();
                    } else if (!multiUserDBHandler.checkregistration("", username, password, url, "api", url, "")) {
                        this.f29839K.addmultiusers("", username, password, AbstractC2237a.f44482Z, url, "api");
                    }
                    Toast.makeText(this.f29880t, getResources().getString(j.f13210b3), 0).show();
                    if (this.f29880t != null) {
                        SharepreferenceDBHandler.setUserID(this.f29839K.getAutoIdLoggedInUser(this.f29843O, username, password, url, "api", url, ""), this.f29880t);
                    }
                    b();
                    startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                    finish();
                    return;
                }
                b();
                string = getResources().getString(j.f13016H2) + status;
                i9 = 0;
            } else {
                i9 = 0;
                if (!str.equals("validateLogin")) {
                    return;
                }
                b();
                string = getResources().getString(j.f12976D2);
            }
            Toast.makeText(this, string, i9).show();
        }
    }

    @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter.OnTvCodeProcessListener
    public void n0() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(a7.g.f12632F);
        this.f29880t = this;
        this.f29860g = (RecyclerView) findViewById(a7.f.ub);
        this.f29862h = (ProgressBar) findViewById(a7.f.oc);
        this.f29864i = (TextView) findViewById(a7.f.Qb);
        this.f29866j = (TextView) findViewById(a7.f.f12129E2);
        this.f29868k = (TextView) findViewById(a7.f.gh);
        this.f29870l = (ImageView) findViewById(a7.f.Xa);
        this.f29872m = (ImageView) findViewById(a7.f.Xc);
        this.f29874n = (LinearLayout) findViewById(a7.f.fe);
        this.f29875o = (TextView) findViewById(a7.f.li);
        this.f29876p = (TextView) findViewById(a7.f.Wm);
        this.f29877q = (RelativeLayout) findViewById(a7.f.Xd);
        this.f29878r = (TextView) findViewById(a7.f.zl);
        this.f29879s = (TextView) findViewById(a7.f.mi);
        this.f29882v = new FirebasePresenter(this.f29880t, this);
        v1();
        Thread thread = this.f29881u;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new f());
            this.f29881u = thread2;
            thread2.start();
        }
        this.f29877q.requestFocus();
        this.f29831C = new C2858a(getApplicationContext());
        this.f29870l.setOnClickListener(new a());
        this.f29877q.setOnClickListener(new b());
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Handler handler = this.f29883w;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            Handler handler2 = this.f29886z;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
            }
            CountDownTimer countDownTimer = this.f29884x;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            Thread thread = this.f29881u;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f29881u.interrupt();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Handler handler = this.f29883w;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        AbstractC2237a.f44528o1 = true;
        this.f29830B = 0;
        Handler handler2 = this.f29886z;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
        H1();
        Thread thread = this.f29881u;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new f());
            this.f29881u = thread2;
            thread2.start();
        }
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // z7.InterfaceC3059a
    public void r0(ActivationCallBack activationCallBack, String str) {
    }

    @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter.OnTvCodeProcessListener
    public void t0() {
        try {
            F1();
            this.f29874n.setVisibility(4);
            Toast.makeText(this, getResources().getString(j.f13244e7), 0).show();
        } catch (Exception unused) {
        }
    }

    public void u1() {
        this.f29844P = Build.VERSION.RELEASE + " " + Build.VERSION_CODES.class.getFields()[Build.VERSION.SDK_INT].getName();
    }

    public void v1() {
        int iNextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.f29855d = iNextInt;
        AbstractC1232b.f17695b = String.valueOf(iNextInt);
    }

    @Override // z7.f
    public void w0(ArrayList arrayList, String str) {
        if (arrayList == null || arrayList.size() <= 0) {
            b();
            if (AbstractC2237a.f44523n.booleanValue()) {
                Toast.makeText(this, getResources().getString(j.f12966C2), 0).show();
                return;
            } else {
                w.P0(this.f29880t, "Your Account is invalid or has expired !");
                return;
            }
        }
        try {
            this.f29833E.putString(AbstractC2237a.f44454L, ((String) arrayList.get(0)).trim());
            this.f29833E.apply();
            arrayList.remove(0);
            this.f29836H.h(this.f29841M, this.f29842N, arrayList);
        } catch (IOException e9) {
            e9.printStackTrace();
        }
    }

    public void w1() {
        this.f29858f = String.format("%06d", Integer.valueOf(new Random().nextInt(999999)));
    }

    @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter.OnTvCodeProcessListener
    public void x(TVCodeGenerateCallBack tVCodeGenerateCallBack) {
        Toast toastMakeText;
        try {
            F1();
            if (tVCodeGenerateCallBack == null || tVCodeGenerateCallBack.getResult() == null || !tVCodeGenerateCallBack.getResult().equals("success") || tVCodeGenerateCallBack.getSc() == null) {
                this.f29877q.requestFocus();
                this.f29874n.setVisibility(4);
                toastMakeText = Toast.makeText(this, "Error Code:603 =>" + getResources().getString(j.f13244e7), 0);
            } else {
                if (tVCodeGenerateCallBack.getSc().equalsIgnoreCase(w.o0(AbstractC2237a.f44469S0 + "*JNHGHG34534543HSDHSHSSH*&^klih*" + AbstractC1232b.f17695b + "*" + new SimpleDateFormat("yyyy-MM").format(new Date())))) {
                    this.f29877q.requestFocus();
                    if (!this.f29858f.equals("")) {
                        this.f29875o.setText(this.f29858f);
                        E1(this.f29858f);
                        this.f29874n.setVisibility(0);
                        try {
                            CountDownTimer countDownTimer = this.f29884x;
                            if (countDownTimer != null) {
                                countDownTimer.cancel();
                            }
                            this.f29884x = new c(this.f29885y, 1000L).start();
                        } catch (Exception e9) {
                            e9.printStackTrace();
                        }
                        Handler handler = this.f29883w;
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                            this.f29883w.postDelayed(new d(), this.f29885y);
                            return;
                        }
                        return;
                    }
                    this.f29874n.setVisibility(4);
                    toastMakeText = Toast.makeText(this, "Error Code:601 =>" + getResources().getString(j.f13244e7), 0);
                } else {
                    this.f29877q.requestFocus();
                    this.f29874n.setVisibility(4);
                    toastMakeText = Toast.makeText(this, "Error Code:602 =>" + getResources().getString(j.f13244e7), 0);
                }
            }
            toastMakeText.show();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void x1() {
        this.f29856e = String.valueOf(new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS);
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
    
        m7.w.P0(r18.f29880t, "Your Account is invalid or has expired !");
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
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.FirebaseRegisterDeviceActivity.y(com.nst.iptvsmarterstvbox.model.callback.LoginCallback, java.lang.String, java.util.ArrayList):void");
    }
}
