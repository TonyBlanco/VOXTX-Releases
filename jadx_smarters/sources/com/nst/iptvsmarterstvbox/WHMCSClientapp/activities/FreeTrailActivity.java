package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import a7.c;
import a7.e;
import a7.f;
import a7.j;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.b;
import b7.AbstractC1232b;
import b7.g;
import com.amazonaws.services.s3.internal.Constants;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.interfaces.ApiService;
import com.nst.iptvsmarterstvbox.model.FreeTrailModelClass;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.MultiUserDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.LoginActivity;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import m7.AbstractC2237a;
import m7.w;
import okhttp3.OkHttpClient;
import org.achartengine.renderer.DefaultRenderer;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import u7.C2858a;

/* JADX INFO: loaded from: classes.dex */
public class FreeTrailActivity extends b {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static InputFilter f28158W = new InputFilter() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.FreeTrailActivity.4
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
    };

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f28161C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Context f28162D;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ProgressDialog f28165G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f28166H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public SharedPreferences f28167I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public SharedPreferences.Editor f28168J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public SharedPreferences f28169K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public SharedPreferences f28170L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public SharedPreferences f28171M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public SharedPreferences.Editor f28172N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Boolean f28173O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public SharedPreferences f28174P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public SharedPreferences.Editor f28175Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public LiveStreamDBHandler f28176R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public SharedPreferences.Editor f28177S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public SharedPreferences f28178T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public DatabaseHandler f28179U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public MultiUserDBHandler f28180V;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RelativeLayout f28181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RelativeLayout f28182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RelativeLayout f28183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RelativeLayout f28184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RelativeLayout f28185h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RelativeLayout f28186i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public EditText f28187j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EditText f28188k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EditText f28189l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public EditText f28190m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Button f28191n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f28192o;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f28197t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f28198u;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f28193p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f28194q = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f28195r = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f28196s = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f28199v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f28200w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f28201x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f28202y = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f28203z = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f28159A = "";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f28160B = Build.MODEL;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f28163E = "";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f28164F = -1;

    public static String G1(String str) {
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

    public static String H1() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return G1(str2);
        }
        return G1(str) + " " + str2;
    }

    public static String I1() {
        try {
        } catch (Exception unused) {
        }
        for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
            if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                byte[] hardwareAddress = networkInterface.getHardwareAddress();
                if (hardwareAddress == null) {
                    return "";
                }
                StringBuilder sb = new StringBuilder();
                for (byte b9 : hardwareAddress) {
                    sb.append(String.format("%02X:", Byte.valueOf(b9)));
                }
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                return sb.toString();
            }
            return "";
        }
        return "";
    }

    public void F1() {
        try {
            this.f28198u = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e9) {
            e9.printStackTrace();
        }
    }

    public String J1() {
        return ((WifiManager) getApplicationContext().getSystemService("wifi")).getConnectionInfo().getMacAddress();
    }

    public boolean K1(String str) {
        return Pattern.compile("^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$", 2).matcher(str).matches();
    }

    public void a() {
        ProgressDialog progressDialog = this.f28165G;
        if (progressDialog != null) {
            progressDialog.show();
        }
    }

    public void e(String str) {
        ProgressDialog progressDialog = this.f28165G;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (str.equals("")) {
            w.P0(this.f28162D, "Your Account is invalid or expired !");
        } else {
            w.P0(this.f28162D, str);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (AbstractC2237a.f44550z.booleanValue()) {
            AbstractC2237a.f44548y = Boolean.TRUE;
        }
        finish();
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g.f17718c = new g(this);
        setContentView(a7.g.f12644H);
        this.f28181d = (RelativeLayout) findViewById(f.je);
        this.f28182e = (RelativeLayout) findViewById(f.xf);
        this.f28183f = (RelativeLayout) findViewById(f.Ue);
        this.f28184g = (RelativeLayout) findViewById(f.Yd);
        this.f28185h = (RelativeLayout) findViewById(f.ge);
        this.f28186i = (RelativeLayout) findViewById(f.Qd);
        F1();
        u1();
        H1();
        w1();
        String strI1 = I1();
        this.f28166H = strI1;
        if (strI1.equalsIgnoreCase("")) {
            this.f28166H = J1();
        }
        this.f28162D = this;
        this.f28176R = new LiveStreamDBHandler(this.f28162D);
        this.f28180V = new MultiUserDBHandler(this.f28162D);
        this.f28179U = new DatabaseHandler(this.f28162D);
        this.f28189l = new EditText(this);
        this.f28189l.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f28189l.setPaddingRelative(35, 0, 35, 0);
        this.f28189l.setHint(getResources().getString(j.f13298k1));
        this.f28189l.setHintTextColor(getResources().getColor(c.f11849G));
        this.f28189l.setHintTextColor(-1);
        this.f28189l.setTextSize(22.0f);
        this.f28189l.setId(101);
        this.f28189l.setBackground(getResources().getDrawable(e.f11927J1));
        this.f28189l.setFocusable(true);
        EditText editText = this.f28189l;
        Typeface typeface = Typeface.SANS_SERIF;
        editText.setTypeface(typeface);
        this.f28189l.setInputType(32);
        this.f28181d.addView(this.f28189l);
        this.f28187j = new EditText(this);
        this.f28187j.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f28187j.setPaddingRelative(35, 0, 35, 0);
        this.f28187j.setHint(getResources().getString(j.f13395t8));
        this.f28187j.setHintTextColor(getResources().getColor(c.f11849G));
        this.f28187j.setHintTextColor(-1);
        this.f28187j.setTextSize(22.0f);
        this.f28187j.setId(101);
        this.f28187j.setBackground(getResources().getDrawable(e.f11927J1));
        this.f28187j.setFocusable(true);
        this.f28187j.setTypeface(typeface);
        this.f28187j.setInputType(1);
        this.f28182e.addView(this.f28187j);
        this.f28188k = new EditText(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        this.f28188k.setPaddingRelative(35, 0, 35, 0);
        this.f28188k.setLayoutParams(layoutParams);
        this.f28188k.setHint(getResources().getString(j.f13398u1));
        this.f28188k.setHintTextColor(getResources().getColor(c.f11849G));
        this.f28188k.setHintTextColor(-1);
        this.f28188k.setTextSize(22.0f);
        this.f28188k.setId(101);
        this.f28188k.setBackground(getResources().getDrawable(e.f11927J1));
        this.f28188k.setFocusable(true);
        this.f28188k.setTypeface(typeface);
        this.f28188k.setInputType(129);
        this.f28183f.addView(this.f28188k);
        this.f28190m = new EditText(this);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        this.f28190m.setPaddingRelative(35, 0, 35, 0);
        this.f28190m.setLayoutParams(layoutParams2);
        this.f28190m.setHint(getResources().getString(j.f13387t0));
        this.f28190m.setHintTextColor(getResources().getColor(c.f11849G));
        this.f28190m.setHintTextColor(-1);
        this.f28190m.setTextSize(22.0f);
        this.f28190m.setId(101);
        this.f28190m.setBackground(getResources().getDrawable(e.f11927J1));
        this.f28190m.setFocusable(true);
        this.f28190m.setTypeface(typeface);
        this.f28190m.setInputType(129);
        this.f28185h.addView(this.f28190m);
        this.f28191n = new Button(this);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        this.f28191n.setPaddingRelative(35, 0, 35, 0);
        this.f28191n.setLayoutParams(layoutParams3);
        this.f28191n.setText(getResources().getString(j.f13194Z6));
        this.f28191n.setTextColor(DefaultRenderer.BACKGROUND_COLOR);
        this.f28191n.setTextSize(22.0f);
        this.f28191n.setId(105);
        this.f28191n.setBackground(getResources().getDrawable(e.f11919H1));
        this.f28191n.setFocusable(true);
        this.f28191n.setGravity(17);
        this.f28191n.setTypeface(typeface);
        this.f28184g.addView(this.f28191n);
        this.f28192o = new TextView(this);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -1);
        this.f28192o.setPaddingRelative(35, 0, 35, 0);
        this.f28192o.setLayoutParams(layoutParams4);
        this.f28192o.setTextColor(-1);
        if (new C2858a(this.f28162D).A().equals(AbstractC2237a.f44453K0)) {
            this.f28192o.setTextSize(22.0f);
        } else {
            this.f28192o.setTextSize(15.0f);
        }
        this.f28192o.setText(getResources().getString(j.f12983E));
        this.f28192o.setId(105);
        this.f28192o.setGravity(16);
        this.f28192o.setBackground(getResources().getDrawable(e.f11923I1));
        this.f28192o.setFocusable(true);
        this.f28186i.addView(this.f28192o);
        if (this.f28162D != null) {
            ProgressDialog progressDialog = new ProgressDialog(this.f28162D);
            this.f28165G = progressDialog;
            progressDialog.setMessage("Please wait while we are creating free trial for you");
            this.f28165G.setCanceledOnTouchOutside(false);
            this.f28165G.setCancelable(false);
            this.f28165G.setProgressStyle(0);
        }
        this.f28167I = getSharedPreferences("sharedPreference", 0);
        this.f28169K = getSharedPreferences("sharedprefremberme", 0);
        this.f28170L = getSharedPreferences("loginPrefs", 0);
        this.f28171M = getSharedPreferences("selected_language", 0);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefsserverurl", 0);
        this.f28174P = sharedPreferences;
        this.f28175Q = sharedPreferences.edit();
        SharedPreferences sharedPreferences2 = getSharedPreferences("upgradeDatePref", 0);
        this.f28178T = sharedPreferences2;
        this.f28177S = sharedPreferences2.edit();
        this.f28172N = this.f28169K.edit();
        this.f28168J = this.f28167I.edit();
        this.f28173O = Boolean.valueOf(this.f28169K.getBoolean("savelogin", false));
        this.f28192o.setOnClickListener(new View.OnClickListener() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.FreeTrailActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FreeTrailActivity.this.startActivity(new Intent(FreeTrailActivity.this, (Class<?>) LoginActivity.class));
                FreeTrailActivity.this.finish();
            }
        });
        B7.c.a(this.f28188k);
        this.f28187j.setFilters(new InputFilter[]{f28158W});
        this.f28191n.setOnClickListener(new View.OnClickListener() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.FreeTrailActivity.2
            public final void a() {
                Context context;
                Resources resources;
                int i9;
                FreeTrailActivity freeTrailActivity = FreeTrailActivity.this;
                freeTrailActivity.f28193p = freeTrailActivity.f28189l.getText().toString().trim();
                FreeTrailActivity freeTrailActivity2 = FreeTrailActivity.this;
                freeTrailActivity2.f28194q = freeTrailActivity2.f28187j.getText().toString().trim();
                FreeTrailActivity freeTrailActivity3 = FreeTrailActivity.this;
                freeTrailActivity3.f28195r = freeTrailActivity3.f28188k.getText().toString().trim();
                FreeTrailActivity freeTrailActivity4 = FreeTrailActivity.this;
                freeTrailActivity4.f28196s = freeTrailActivity4.f28190m.getText().toString().trim();
                if (FreeTrailActivity.this.f28193p.isEmpty()) {
                    FreeTrailActivity freeTrailActivity5 = FreeTrailActivity.this;
                    context = freeTrailActivity5.f28162D;
                    resources = freeTrailActivity5.getResources();
                    i9 = j.f13342o5;
                } else {
                    FreeTrailActivity freeTrailActivity6 = FreeTrailActivity.this;
                    if (!freeTrailActivity6.K1(freeTrailActivity6.f28193p)) {
                        FreeTrailActivity freeTrailActivity7 = FreeTrailActivity.this;
                        context = freeTrailActivity7.f28162D;
                        resources = freeTrailActivity7.getResources();
                        i9 = j.f13122R8;
                    } else if (FreeTrailActivity.this.f28194q.isEmpty()) {
                        FreeTrailActivity freeTrailActivity8 = FreeTrailActivity.this;
                        context = freeTrailActivity8.f28162D;
                        resources = freeTrailActivity8.getResources();
                        i9 = j.f13382s5;
                    } else if (FreeTrailActivity.this.f28195r.isEmpty()) {
                        FreeTrailActivity freeTrailActivity9 = FreeTrailActivity.this;
                        context = freeTrailActivity9.f28162D;
                        resources = freeTrailActivity9.getResources();
                        i9 = j.f13352p5;
                    } else if (FreeTrailActivity.this.f28196s.equalsIgnoreCase("")) {
                        FreeTrailActivity freeTrailActivity10 = FreeTrailActivity.this;
                        context = freeTrailActivity10.f28162D;
                        resources = freeTrailActivity10.getResources();
                        i9 = j.f13322m5;
                    } else {
                        if (FreeTrailActivity.this.f28195r.equals(FreeTrailActivity.this.f28196s)) {
                            SharepreferenceDBHandler.setUserName("", FreeTrailActivity.this.f28162D);
                            SharepreferenceDBHandler.setUserPassword("", FreeTrailActivity.this.f28162D);
                            FreeTrailActivity.this.a();
                            FreeTrailActivity.this.v1();
                            return;
                        }
                        FreeTrailActivity freeTrailActivity11 = FreeTrailActivity.this;
                        context = freeTrailActivity11.f28162D;
                        resources = freeTrailActivity11.getResources();
                        i9 = j.f13183Y4;
                    }
                }
                Toast.makeText(context, resources.getString(i9), 0).show();
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a();
            }
        });
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        w.m(this.f28162D);
    }

    public void u1() {
        this.f28197t = Build.VERSION.RELEASE + " " + Build.VERSION_CODES.class.getFields()[Build.VERSION.SDK_INT].getName();
    }

    public void v1() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ((ApiService) new Retrofit.Builder().baseUrl("https://cms.alldrama.tv/").client(builder.connectTimeout(300L, timeUnit).writeTimeout(300L, timeUnit).readTimeout(300L, timeUnit).followRedirects(false).build()).addConverterFactory(GsonConverterFactory.create()).build().create(ApiService.class)).k("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "freetrail", "yes", this.f28193p, this.f28194q, this.f28195r, this.f28166H, "com.nst.iptvsmarterstvbox").enqueue(new Callback<FreeTrailModelClass>() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.FreeTrailActivity.3
            @Override // retrofit2.Callback
            public void onFailure(Call<FreeTrailModelClass> call, Throwable th) {
                FreeTrailActivity freeTrailActivity = FreeTrailActivity.this;
                freeTrailActivity.e(freeTrailActivity.getResources().getString(j.f12944A0));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<FreeTrailModelClass> call, Response<FreeTrailModelClass> response) {
                FreeTrailActivity freeTrailActivity;
                String message;
                if (response == null || !response.isSuccessful() || response.body() == null) {
                    freeTrailActivity = FreeTrailActivity.this;
                    message = "No Response from server";
                } else {
                    if (response.body().getResult() != null && response.body().getResult().equalsIgnoreCase("success")) {
                        ClientSharepreferenceHandler.h("", FreeTrailActivity.this.f28162D);
                        if (AbstractC2237a.f44548y.booleanValue()) {
                            AbstractC2237a.f44548y = Boolean.FALSE;
                        }
                        SharepreferenceDBHandler.setUserName(FreeTrailActivity.this.f28194q, FreeTrailActivity.this.f28162D);
                        SharepreferenceDBHandler.setUserPassword(FreeTrailActivity.this.f28195r, FreeTrailActivity.this.f28162D);
                        Intent intent = new Intent(FreeTrailActivity.this, (Class<?>) LoginActivity.class);
                        intent.setAction("login_perform");
                        FreeTrailActivity.this.startActivity(intent);
                        FreeTrailActivity.this.finish();
                        return;
                    }
                    freeTrailActivity = FreeTrailActivity.this;
                    message = response.body().getMessage();
                }
                freeTrailActivity.e(message);
            }
        });
    }

    public void w1() {
        int iNextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.f28161C = iNextInt;
        AbstractC1232b.f17695b = String.valueOf(iNextInt);
    }
}
