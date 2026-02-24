package com.nst.iptvsmarterstvbox.view.activity;

import D.AbstractC0519b;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import b7.AbstractC1232b;
import b7.InterfaceC1233c;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.Constants;
import com.nst.iptvsmarterstvbox.miscelleneious.MyApplication;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.ImportStatusModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.MultiUserDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.vpn.activities.ProfileActivity;
import g7.f;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import m7.AbstractC2237a;
import m7.w;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpHead;
import org.json.JSONObject;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class LoginM3uActivity extends androidx.appcompat.app.b implements InterfaceC1233c, View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final File f30860p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final File f30861q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static C2858a f30862r0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f30863A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public LiveStreamDBHandler f30864B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public MultiUserDBHandler f30865C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public DatabaseHandler f30866D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public SharedPreferences f30867E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public SharedPreferences.Editor f30868F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public SharedPreferences f30869G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public SharedPreferences f30870H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public SharedPreferences f30871I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public SharedPreferences f30872J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public SharedPreferences.Editor f30873K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public SharedPreferences.Editor f30874L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public SharedPreferences.Editor f30875M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public SharedPreferences.Editor f30876N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public RadioGroup f30877O;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public SharedPreferences f30879Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public SharedPreferences.Editor f30880R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public String f30881S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public String f30882T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public String f30883U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f30884V;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public String f30888Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EditText f30889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EditText f30890e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public SharedPreferences f30891e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f30892f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public SharedPreferences.Editor f30893f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RelativeLayout f30894g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public SharedPreferences.Editor f30895g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f30896h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public SharedPreferences f30897h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f30898i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public SharedPreferences f30899i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RelativeLayout f30900j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f30902k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f30904l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RelativeLayout f30906m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public String f30907m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f30908n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public androidx.appcompat.app.a f30909n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f30910o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Uri f30911o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Button f30912p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public RadioButton f30913q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RadioButton f30914r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f30915s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f30916t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Button f30917u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RelativeLayout f30918v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public InputStream f30919w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f30921y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f30922z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Context f30920x = this;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final A7.a f30878P = new A7.a();

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public String f30885W = "";

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public String f30886X = "";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public long f30887Y = -1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public String f30901j0 = "";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public ArrayList f30903k0 = new ArrayList();

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public String f30905l0 = TransferTable.COLUMN_FILE;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AbstractC2237a.f44490c = true;
            SharepreferenceDBHandler.setTypeLogin("login", LoginM3uActivity.this.f30920x);
            Intent intent = new Intent(LoginM3uActivity.this.f30920x, (Class<?>) ProfileActivity.class);
            intent.putExtra("typeid", "login");
            LoginM3uActivity.this.startActivity(intent);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(LoginM3uActivity.this.f30920x, (Class<?>) MultiUserActivity.class);
            SharepreferenceDBHandler.setCurrentAPPType("m3u", LoginM3uActivity.this.f30920x);
            LoginM3uActivity.this.startActivity(intent);
            LoginM3uActivity.this.overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
            LoginM3uActivity.this.finish();
        }
    }

    public class c implements View.OnClickListener {

        public class a implements MyApplication.d {
            public a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void f(String str) {
                MyApplication.p().D("LM" + str, LoginM3uActivity.this.f30920x);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void g(String str) {
                MyApplication.p().D("LM" + str, LoginM3uActivity.this.f30920x);
                LoginM3uActivity.this.startActivity(new Intent(LoginM3uActivity.this.getApplicationContext(), (Class<?>) FirebaseRegisterDeviceActivity.class));
                LoginM3uActivity.this.overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void h() {
                LoginM3uActivity.this.startActivity(new Intent(LoginM3uActivity.this.getApplicationContext(), (Class<?>) FirebaseRegisterDeviceActivity.class));
                LoginM3uActivity.this.overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
            }

            @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
            public void a(final String str) {
                LoginM3uActivity.this.runOnUiThread(new Runnable() { // from class: p7.Z
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f46624a.g(str);
                    }
                });
            }

            @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
            public void b(final String str) {
                LoginM3uActivity.this.runOnUiThread(new Runnable() { // from class: p7.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f46628a.f(str);
                    }
                });
            }

            @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
            public void onSuccess() {
                LoginM3uActivity.this.runOnUiThread(new Runnable() { // from class: p7.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f46632a.h();
                    }
                });
            }
        }

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (AbstractC2237a.f44477W0.booleanValue()) {
                if (SharepreferenceDBHandler.getSBPDemoAndClientUrl(LoginM3uActivity.this.f30920x) == null || SharepreferenceDBHandler.getSBPDemoAndClientUrl(LoginM3uActivity.this.f30920x).length() <= 0) {
                    MyApplication.p().G(LoginM3uActivity.this.f30920x, new a());
                } else {
                    LoginM3uActivity.this.startActivity(new Intent(LoginM3uActivity.this.getApplicationContext(), (Class<?>) FirebaseRegisterDeviceActivity.class));
                    LoginM3uActivity.this.overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
                }
            }
        }
    }

    public class d implements f.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String[] f30927a;

        public d(String[] strArr) {
            this.f30927a = strArr;
        }

        @Override // g7.f.g
        public void a(String str) {
            this.f30927a[0] = str;
            LoginM3uActivity.this.f30892f.setText(str);
            LoginM3uActivity.this.f30915s.setVisibility(8);
            LoginM3uActivity.this.f30916t.setVisibility(0);
            LoginM3uActivity.this.f30916t.setText(str);
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", LoginM3uActivity.this.getPackageName(), null));
                LoginM3uActivity.this.startActivityForResult(intent, 101);
                Toast.makeText(LoginM3uActivity.this.f30920x, LoginM3uActivity.this.f30920x.getResources().getString(a7.j.f13339o2), 1).show();
            } catch (Exception unused) {
            }
            LoginM3uActivity.this.f30909n0.dismiss();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LoginM3uActivity.this.f30909n0.dismiss();
            LoginM3uActivity.this.onBackPressed();
        }
    }

    public class g extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f30931a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f30932c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f30933d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f30934e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f30935f;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f30937a;

            public a(View view) {
                this.f30937a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f30937a;
                    if (view2 == null || view2.getTag() == null || !this.f30937a.getTag().equals("1")) {
                        View view3 = this.f30937a;
                        if (view3 == null || view3.getTag() == null || !this.f30937a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = g.this.f30935f;
                        }
                    } else {
                        linearLayout = g.this.f30934e;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f30937a;
                    if (view4 == null || view4.getTag() == null || !this.f30937a.getTag().equals("1")) {
                        View view5 = this.f30937a;
                        if (view5 == null || view5.getTag() == null || !this.f30937a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = g.this.f30935f;
                        }
                    } else {
                        linearLayout = g.this.f30934e;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        public g(Activity activity) {
            super(activity);
            this.f30931a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            try {
                if (id != a7.f.f12524s1) {
                    if (id == a7.f.f12313X0) {
                        dismiss();
                        return;
                    }
                    return;
                }
                dismiss();
                int checkedRadioButtonId = LoginM3uActivity.this.f30877O.getCheckedRadioButtonId();
                if (checkedRadioButtonId == a7.f.kd && LoginM3uActivity.this.P1()) {
                    LoginM3uActivity loginM3uActivity = LoginM3uActivity.this;
                    loginM3uActivity.f30863A = loginM3uActivity.f30889d.getText().toString().trim();
                    LoginM3uActivity loginM3uActivity2 = LoginM3uActivity.this;
                    loginM3uActivity2.f30922z = loginM3uActivity2.f30892f.getText().toString().trim();
                    LoginM3uActivity.this.f30905l0 = TransferTable.COLUMN_FILE;
                    LoginM3uActivity.this.new n().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, LoginM3uActivity.this.f30922z);
                }
                if (checkedRadioButtonId == a7.f.nd && LoginM3uActivity.this.Q1()) {
                    LoginM3uActivity loginM3uActivity3 = LoginM3uActivity.this;
                    loginM3uActivity3.f30921y = loginM3uActivity3.f30890e.getText().toString().trim();
                    LoginM3uActivity loginM3uActivity4 = LoginM3uActivity.this;
                    loginM3uActivity4.f30863A = loginM3uActivity4.f30889d.getText().toString().trim();
                    LoginM3uActivity.this.f30905l0 = "url";
                    LoginM3uActivity.this.new k().execute(new Void[0]);
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(LoginM3uActivity.f30862r0.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12819j2 : a7.g.f12813i2);
            this.f30932c = (TextView) findViewById(a7.f.f12524s1);
            this.f30933d = (TextView) findViewById(a7.f.f12313X0);
            this.f30934e = (LinearLayout) findViewById(a7.f.Ia);
            this.f30935f = (LinearLayout) findViewById(a7.f.V8);
            this.f30932c.setOnClickListener(this);
            this.f30933d.setOnClickListener(this);
            TextView textView = this.f30932c;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f30933d;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    public class h extends AsyncTask {
        public h() {
        }

        public /* synthetic */ h(LoginM3uActivity loginM3uActivity, a aVar) {
            this();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                URL url = new URL(strArr[0]);
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "IPTVSmarters");
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(LoginM3uActivity.this.f30920x.getFilesDir() + "/data_temp.txt");
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(LoginM3uActivity.this.f30920x.getFilesDir() + "/data_temp.txt").toString())));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if (!(((!line.contains("http://") || line.contains("tvg-logo")) && (!line.contains("https://") || line.contains("tvg-logo"))) ? "" : line).equals("")) {
                        sb.append(line);
                        break;
                    }
                }
                bufferedWriter.write(sb.toString());
                bufferedWriter.flush();
                bufferedWriter.close();
                return Boolean.TRUE;
            } catch (Exception e10) {
                Log.d("Google", "DownloadFileFromUrl " + e10.getMessage());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            try {
                if (bool.booleanValue()) {
                    LoginM3uActivity.this.new n().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, LoginM3uActivity.this.f30920x.getFilesDir() + "/data_temp.txt");
                } else {
                    w.X();
                    w.P0(LoginM3uActivity.this.f30920x, "Incorrect File/URL");
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(String... strArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
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
                LoginM3uActivity.this.w1();
                return;
            }
            w.X();
            LoginM3uActivity loginM3uActivity = LoginM3uActivity.this;
            g gVar = loginM3uActivity.new g((Activity) loginM3uActivity.f30920x);
            gVar.setCancelable(false);
            gVar.show();
        }
    }

    public class j extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30941a;

        public class a implements MyApplication.d {
            public a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void f(String str) {
                MyApplication.p().D("LM" + str, LoginM3uActivity.this.f30920x);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void g(String str) {
                MyApplication.p().D("LM" + str, LoginM3uActivity.this.f30920x);
                j jVar = j.this;
                int i9 = jVar.f30941a;
                if (i9 == a7.f.kd) {
                    LoginM3uActivity loginM3uActivity = LoginM3uActivity.this;
                    loginM3uActivity.f30863A = loginM3uActivity.f30889d.getText().toString().trim();
                    LoginM3uActivity loginM3uActivity2 = LoginM3uActivity.this;
                    loginM3uActivity2.f30922z = loginM3uActivity2.f30892f.getText().toString().trim();
                    LoginM3uActivity.this.f30905l0 = TransferTable.COLUMN_FILE;
                    LoginM3uActivity.this.new n().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, LoginM3uActivity.this.f30922z);
                    return;
                }
                if (i9 == a7.f.nd) {
                    LoginM3uActivity loginM3uActivity3 = LoginM3uActivity.this;
                    loginM3uActivity3.f30921y = loginM3uActivity3.f30890e.getText().toString().trim();
                    LoginM3uActivity loginM3uActivity4 = LoginM3uActivity.this;
                    loginM3uActivity4.f30863A = loginM3uActivity4.f30889d.getText().toString().trim();
                    LoginM3uActivity.this.f30905l0 = "url";
                    LoginM3uActivity.this.new k().execute(new Void[0]);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void h() {
                j jVar = j.this;
                int i9 = jVar.f30941a;
                if (i9 == a7.f.kd) {
                    LoginM3uActivity loginM3uActivity = LoginM3uActivity.this;
                    loginM3uActivity.f30863A = loginM3uActivity.f30889d.getText().toString().trim();
                    LoginM3uActivity loginM3uActivity2 = LoginM3uActivity.this;
                    loginM3uActivity2.f30922z = loginM3uActivity2.f30892f.getText().toString().trim();
                    LoginM3uActivity.this.f30905l0 = TransferTable.COLUMN_FILE;
                    LoginM3uActivity.this.new n().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, LoginM3uActivity.this.f30922z);
                    return;
                }
                if (i9 == a7.f.nd) {
                    LoginM3uActivity loginM3uActivity3 = LoginM3uActivity.this;
                    loginM3uActivity3.f30921y = loginM3uActivity3.f30890e.getText().toString().trim();
                    LoginM3uActivity loginM3uActivity4 = LoginM3uActivity.this;
                    loginM3uActivity4.f30863A = loginM3uActivity4.f30889d.getText().toString().trim();
                    LoginM3uActivity.this.f30905l0 = "url";
                    LoginM3uActivity.this.new k().execute(new Void[0]);
                }
            }

            @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
            public void a(final String str) {
                LoginM3uActivity.this.runOnUiThread(new Runnable() { // from class: p7.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f46635a.g(str);
                    }
                });
            }

            @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
            public void b(final String str) {
                LoginM3uActivity.this.runOnUiThread(new Runnable() { // from class: p7.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f46640a.f(str);
                    }
                });
            }

            @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
            public void onSuccess() {
                LoginM3uActivity.this.runOnUiThread(new Runnable() { // from class: p7.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f46644a.h();
                    }
                });
            }
        }

        public j(int i9) {
            this.f30941a = i9;
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
            if (!bool.booleanValue()) {
                w.X();
                LoginM3uActivity loginM3uActivity = LoginM3uActivity.this;
                g gVar = loginM3uActivity.new g((Activity) loginM3uActivity.f30920x);
                gVar.setCancelable(false);
                gVar.show();
                return;
            }
            if (AbstractC2237a.f44477W0.booleanValue()) {
                MyApplication.p().G(LoginM3uActivity.this.f30920x, new a());
                return;
            }
            int i9 = this.f30941a;
            if (i9 == a7.f.kd) {
                LoginM3uActivity loginM3uActivity2 = LoginM3uActivity.this;
                loginM3uActivity2.f30863A = loginM3uActivity2.f30889d.getText().toString().trim();
                LoginM3uActivity loginM3uActivity3 = LoginM3uActivity.this;
                loginM3uActivity3.f30922z = loginM3uActivity3.f30892f.getText().toString().trim();
                LoginM3uActivity.this.f30905l0 = TransferTable.COLUMN_FILE;
                LoginM3uActivity.this.new n().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, LoginM3uActivity.this.f30922z);
                return;
            }
            if (i9 == a7.f.nd) {
                LoginM3uActivity loginM3uActivity4 = LoginM3uActivity.this;
                loginM3uActivity4.f30921y = loginM3uActivity4.f30890e.getText().toString().trim();
                LoginM3uActivity loginM3uActivity5 = LoginM3uActivity.this;
                loginM3uActivity5.f30863A = loginM3uActivity5.f30889d.getText().toString().trim();
                LoginM3uActivity.this.f30905l0 = "url";
                LoginM3uActivity.this.new k().execute(new Void[0]);
            }
        }
    }

    public class k extends AsyncTask {
        public k() {
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
                new m(LoginM3uActivity.this, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, LoginM3uActivity.this.f30921y);
                return;
            }
            w.X();
            LoginM3uActivity loginM3uActivity = LoginM3uActivity.this;
            g gVar = loginM3uActivity.new g((Activity) loginM3uActivity.f30920x);
            gVar.setCancelable(false);
            gVar.show();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            w.M0(LoginM3uActivity.this);
        }
    }

    public class l implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f30945a;

        public l(View view) {
            this.f30945a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30945a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30945a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30945a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            LoginM3uActivity loginM3uActivity;
            TextView textView;
            TextView textView2;
            int color;
            if (!z9) {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                b(f9);
                c(f9);
                a(z9);
                View view2 = this.f30945a;
                if (view2 != null && view2.getTag() != null && this.f30945a.getTag().equals("3")) {
                    view.setBackgroundResource(a7.e.f12020j1);
                    return;
                }
                View view3 = this.f30945a;
                if (view3 == null || view3.getTag() == null || !this.f30945a.getTag().equals("rl_add_user")) {
                    View view4 = this.f30945a;
                    if (view4 == null || view4.getTag() == null || !this.f30945a.getTag().equals("rl_list_users")) {
                        View view5 = this.f30945a;
                        if (view5 == null || view5.getTag() == null || !this.f30945a.getTag().equals("rl_login_from_mobile_app")) {
                            return;
                        }
                        LoginM3uActivity.this.f30906m.setBackgroundResource(a7.e.f11996d1);
                        LoginM3uActivity.this.f30908n.setImageResource(a7.e.f12012h1);
                        loginM3uActivity = LoginM3uActivity.this;
                        textView = loginM3uActivity.f30910o;
                    } else {
                        LoginM3uActivity.this.f30900j.setBackgroundResource(a7.e.f11996d1);
                        LoginM3uActivity.this.f30902k.setImageResource(a7.e.f12012h1);
                        loginM3uActivity = LoginM3uActivity.this;
                        textView = loginM3uActivity.f30904l;
                    }
                } else {
                    LoginM3uActivity.this.f30894g.setBackgroundResource(a7.e.f11996d1);
                    LoginM3uActivity.this.f30896h.setImageResource(a7.e.f11994d);
                    loginM3uActivity = LoginM3uActivity.this;
                    textView = loginM3uActivity.f30898i;
                }
                textView.setTextColor(loginM3uActivity.f30920x.getResources().getColor(a7.c.f11855f));
                return;
            }
            f9 = z9 ? 1.1f : 1.0f;
            try {
                b(f9);
                c(f9);
                View view6 = this.f30945a;
                if (view6 != null && view6.getTag() != null && this.f30945a.getTag().equals("3")) {
                    b(f9);
                    c(f9);
                    view.setBackgroundResource(a7.e.f12042p);
                    return;
                }
                View view7 = this.f30945a;
                if (view7 == null || view7.getTag() == null || !this.f30945a.getTag().equals("rl_add_user")) {
                    View view8 = this.f30945a;
                    if (view8 == null || view8.getTag() == null || !this.f30945a.getTag().equals("rl_list_users")) {
                        View view9 = this.f30945a;
                        if (view9 == null || view9.getTag() == null || !this.f30945a.getTag().equals("rl_login_from_mobile_app")) {
                            return;
                        }
                        LoginM3uActivity.this.f30906m.setBackgroundResource(a7.e.f11992c1);
                        LoginM3uActivity.this.f30908n.setImageResource(a7.e.f12008g1);
                        LoginM3uActivity loginM3uActivity2 = LoginM3uActivity.this;
                        textView2 = loginM3uActivity2.f30910o;
                        color = loginM3uActivity2.f30920x.getResources().getColor(a7.c.f11849G);
                    } else {
                        LoginM3uActivity.this.f30900j.setBackgroundResource(a7.e.f11992c1);
                        LoginM3uActivity.this.f30902k.setImageResource(a7.e.f12008g1);
                        LoginM3uActivity loginM3uActivity3 = LoginM3uActivity.this;
                        textView2 = loginM3uActivity3.f30904l;
                        color = loginM3uActivity3.f30920x.getResources().getColor(a7.c.f11849G);
                    }
                } else {
                    LoginM3uActivity.this.f30894g.setBackgroundResource(a7.e.f11992c1);
                    LoginM3uActivity.this.f30896h.setImageResource(a7.e.f11998e);
                    LoginM3uActivity loginM3uActivity4 = LoginM3uActivity.this;
                    textView2 = loginM3uActivity4.f30898i;
                    color = loginM3uActivity4.f30920x.getResources().getColor(a7.c.f11849G);
                }
                textView2.setTextColor(color);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public class m extends AsyncTask {
        public m() {
        }

        public /* synthetic */ m(LoginM3uActivity loginM3uActivity, a aVar) {
            this();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strArr[0]).openConnection();
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                return Boolean.valueOf(responseCode == 200 || responseCode == 405 || responseCode == 404);
            } catch (Exception e9) {
                Log.e("Google", e9.toString());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                new h(LoginM3uActivity.this, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, LoginM3uActivity.this.f30921y);
            } else {
                w.X();
                w.P0(LoginM3uActivity.this.f30920x, LoginM3uActivity.this.f30920x.getResources().getString(a7.j.f13269h2));
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    public class n extends AsyncTask {
        public n() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                LoginM3uActivity.this.f30919w = new FileInputStream(new File(strArr[0]));
                LoginM3uActivity loginM3uActivity = LoginM3uActivity.this;
                return loginM3uActivity.f30878P.c(loginM3uActivity.f30919w, loginM3uActivity.f30920x);
            } catch (Exception unused) {
                return "";
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (str.equals("")) {
                    w.X();
                    Toast.makeText(LoginM3uActivity.this.f30920x, LoginM3uActivity.this.f30920x.getResources().getString(a7.j.f13195Z7), 1).show();
                } else {
                    LoginM3uActivity.this.f30901j0 = str;
                    if (AbstractC2237a.f44526o.booleanValue()) {
                        LoginM3uActivity.this.K1();
                    } else if (LoginM3uActivity.this.f30905l0 == null || !LoginM3uActivity.this.f30905l0.equals("url")) {
                        LoginM3uActivity.this.new i().execute(new Void[0]);
                    } else {
                        LoginM3uActivity.this.w1();
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (LoginM3uActivity.this.f30905l0 == null || !LoginM3uActivity.this.f30905l0.equals("url")) {
                w.M0(LoginM3uActivity.this);
            }
        }
    }

    static {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        f30860p0 = externalStorageDirectory;
        f30861q0 = new File(externalStorageDirectory.getPath() + "/IPTVSmartersM3u");
    }

    private static String M1(String str) {
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

    private void N1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    public static String S1() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return M1(str2);
        }
        return M1(str) + " " + str2;
    }

    private void T1() {
        try {
            this.f30865C = new MultiUserDBHandler(this.f30920x);
            this.f30864B = new LiveStreamDBHandler(this.f30920x);
            this.f30866D = new DatabaseHandler(this.f30920x);
            b7.g.f17718c = new b7.g(this);
            SharedPreferences sharedPreferences = getSharedPreferences("loginPrefsserverurl", 0);
            this.f30891e0 = sharedPreferences;
            this.f30893f0 = sharedPreferences.edit();
            SharedPreferences sharedPreferences2 = getSharedPreferences("sharedPreference", 0);
            this.f30897h0 = sharedPreferences2;
            this.f30895g0 = sharedPreferences2.edit();
            this.f30899i0 = getSharedPreferences("loginPrefs", 0);
            this.f30877O = (RadioGroup) findViewById(a7.f.Kd);
            if (AbstractC2237a.f44538t.booleanValue()) {
                this.f30918v.setVisibility(0);
                this.f30889d.requestFocus();
                this.f30900j.setVisibility(0);
            } else {
                this.f30918v.setVisibility(8);
                this.f30913q.requestFocus();
                this.f30900j.setVisibility(4);
                this.f30898i.setText(getResources().getString(a7.j.f13230d3));
            }
            if (this.f30907m0.equals(AbstractC2237a.f44453K0) && AbstractC2237a.f44475V0.booleanValue()) {
                this.f30906m.setVisibility(0);
                this.f30867E = this.f30920x.getSharedPreferences("allowedFormat", 0);
                Button button = this.f30912p;
                button.setOnFocusChangeListener(new l(button));
                RelativeLayout relativeLayout = this.f30894g;
                relativeLayout.setOnFocusChangeListener(new l(relativeLayout));
                RelativeLayout relativeLayout2 = this.f30900j;
                relativeLayout2.setOnFocusChangeListener(new l(relativeLayout2));
                RelativeLayout relativeLayout3 = this.f30906m;
                relativeLayout3.setOnFocusChangeListener(new l(relativeLayout3));
                this.f30917u.setOnClickListener(new a());
                this.f30900j.setOnClickListener(new b());
                this.f30906m.setOnClickListener(new c());
            }
            RelativeLayout relativeLayout4 = this.f30906m;
            relativeLayout4.setVisibility(8);
            this.f30867E = this.f30920x.getSharedPreferences("allowedFormat", 0);
            Button button2 = this.f30912p;
            button2.setOnFocusChangeListener(new l(button2));
            RelativeLayout relativeLayout5 = this.f30894g;
            relativeLayout5.setOnFocusChangeListener(new l(relativeLayout5));
            RelativeLayout relativeLayout22 = this.f30900j;
            relativeLayout22.setOnFocusChangeListener(new l(relativeLayout22));
            RelativeLayout relativeLayout32 = this.f30906m;
            relativeLayout32.setOnFocusChangeListener(new l(relativeLayout32));
            this.f30917u.setOnClickListener(new a());
            this.f30900j.setOnClickListener(new b());
            this.f30906m.setOnClickListener(new c());
        } catch (Resources.NotFoundException e9) {
            e9.printStackTrace();
        }
    }

    public static String V1(String str) {
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

    public final void K1() {
        String str;
        int autoIdLoggedInUser;
        Context context;
        try {
            SharedPreferences.Editor editorEdit = getSharedPreferences("loginPrefs", 0).edit();
            editorEdit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "playlist");
            editorEdit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "playlist");
            editorEdit.putString("serverPort", "");
            String str2 = this.f30905l0;
            if (str2 == null || !str2.equals("url")) {
                editorEdit.putString("serverUrl", this.f30922z);
                str = this.f30922z;
            } else {
                editorEdit.putString("serverUrl", this.f30921y);
                str = this.f30921y;
            }
            editorEdit.putString("serverM3UUrl", str);
            editorEdit.putString("anyName", this.f30863A);
            editorEdit.apply();
            this.f30867E = this.f30920x.getSharedPreferences("allowedFormat", 0);
            this.f30869G = this.f30920x.getSharedPreferences("timeFormat", 0);
            this.f30870H = this.f30920x.getSharedPreferences("epgchannelupdate", 0);
            this.f30871I = this.f30920x.getSharedPreferences("automation_channels", 0);
            this.f30872J = this.f30920x.getSharedPreferences("automation_epg", 0);
            this.f30868F = this.f30867E.edit();
            this.f30873K = this.f30869G.edit();
            this.f30874L = this.f30870H.edit();
            this.f30875M = this.f30871I.edit();
            this.f30876N = this.f30872J.edit();
            SharedPreferences sharedPreferences = this.f30920x.getSharedPreferences("auto_start", 0);
            this.f30879Q = sharedPreferences;
            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
            this.f30880R = editorEdit2;
            if (editorEdit2 != null) {
                editorEdit2.putBoolean("full_epg", true);
                this.f30880R.apply();
            }
            String string = this.f30867E.getString("allowedFormat", "");
            if (string != null && string.equals("")) {
                this.f30868F.putString("allowedFormat", "ts");
                this.f30868F.apply();
            }
            if (this.f30871I.getString("automation_channels", "").equals("")) {
                this.f30875M.putString("automation_channels", "checked");
                this.f30875M.apply();
            }
            if (this.f30872J.getString("automation_epg", "").equals("")) {
                this.f30876N.putString("automation_epg", "checked");
                this.f30876N.apply();
            }
            if (this.f30869G.getString("timeFormat", AbstractC2237a.f44441E0).equals("")) {
                this.f30873K.putString("timeFormat", AbstractC2237a.f44441E0);
                this.f30873K.apply();
            }
            if (this.f30870H.getString("epgchannelupdate", "").equals("")) {
                this.f30874L.putString("epgchannelupdate", "all");
                this.f30874L.apply();
            }
            AbstractC2237a.f44494d0 = Boolean.TRUE;
            SharepreferenceDBHandler.setCurrentAPPType("m3u", this.f30920x);
            String str3 = this.f30905l0;
            if (str3 == null || !str3.equals("url")) {
                if (!this.f30865C.checkregistration(this.f30863A, "playlist", "playlist", this.f30922z, "m3u", "", "")) {
                    this.f30865C.addmultiusersM3U(this.f30863A, "playlist", "playlist", this.f30922z, TransferTable.COLUMN_FILE);
                    Toast.makeText(this.f30920x, getResources().getString(a7.j.f13375r8), 0).show();
                }
                SharedPreferences.Editor editorEdit3 = this.f30920x.getSharedPreferences("loginprefsmultiuser", 0).edit();
                editorEdit3.putString("name", this.f30863A);
                editorEdit3.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "playlist");
                editorEdit3.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "playlist");
                editorEdit3.putString(AbstractC2237a.f44454L, this.f30922z);
                editorEdit3.apply();
                if (this.f30920x != null) {
                    MultiUserDBHandler multiUserDBHandler = new MultiUserDBHandler(this.f30920x);
                    this.f30865C = multiUserDBHandler;
                    autoIdLoggedInUser = multiUserDBHandler.getAutoIdLoggedInUser(this.f30863A, "playlist", "playlist", this.f30922z, "m3u", "", "");
                    SharepreferenceDBHandler.setUserID(autoIdLoggedInUser, this.f30920x);
                }
            } else {
                if (!this.f30865C.checkregistration(this.f30863A, "playlist", "playlist", this.f30921y, "m3u", "", "")) {
                    this.f30865C.addmultiusersM3U(this.f30863A, "playlist", "playlist", this.f30921y, "url");
                    Toast.makeText(this.f30920x, getResources().getString(a7.j.f13375r8), 0).show();
                }
                SharedPreferences.Editor editorEdit4 = this.f30920x.getSharedPreferences("loginprefsmultiuser", 0).edit();
                editorEdit4.putString("name", this.f30863A);
                editorEdit4.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "playlist");
                editorEdit4.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "playlist");
                editorEdit4.putString(AbstractC2237a.f44454L, this.f30921y);
                editorEdit4.apply();
                if (this.f30920x != null) {
                    MultiUserDBHandler multiUserDBHandler2 = new MultiUserDBHandler(this.f30920x);
                    this.f30865C = multiUserDBHandler2;
                    autoIdLoggedInUser = multiUserDBHandler2.getAutoIdLoggedInUser(this.f30863A, "playlist", "playlist", this.f30921y, "m3u", "", "");
                    SharepreferenceDBHandler.setUserID(autoIdLoggedInUser, this.f30920x);
                }
            }
            w.X();
            String str4 = this.f30901j0;
            if (str4 != null && !str4.equals("")) {
                Log.e("jaskirat", "m3uURLGlobal::: " + this.f30901j0);
                SharepreferenceDBHandler.setFirebaseM3uNode(this.f30901j0, this.f30920x);
            }
            if (this.f30864B.getImportTableCount("m3u") == 0) {
                ArrayList<ImportStatusModel> arrayList = new ArrayList<>();
                ImportStatusModel importStatusModel = new ImportStatusModel();
                importStatusModel.setType("all");
                importStatusModel.setStatus("0");
                importStatusModel.setDate("");
                arrayList.add(0, importStatusModel);
                this.f30864B.importDataStatusArrayList(arrayList, "m3u");
            }
            ImportStatusModel importStatusModel2 = this.f30864B.getdateDBStatus("all");
            if (importStatusModel2 != null) {
                if ((importStatusModel2.getStatus() == null || !importStatusModel2.getStatus().equals("0")) && (importStatusModel2.getStatus() == null || !importStatusModel2.getStatus().equals("2"))) {
                    if (importStatusModel2.getStatus() != null && importStatusModel2.getStatus().equals("1")) {
                        long jC = w.C(new SimpleDateFormat("dd/MM/yyyy", Locale.US), importStatusModel2.getDate(), w.q());
                        if (!O1() || jC < f30862r0.g()) {
                            this.f30920x.startActivity(new Intent(this.f30920x, (Class<?>) NewDashboardActivity.class));
                            context = this.f30920x;
                        } else {
                            this.f30920x.startActivity(new Intent(this.f30920x, (Class<?>) ImportM3uActivity.class));
                            context = this.f30920x;
                        }
                    } else {
                        if (importStatusModel2.getStatus() == null || !importStatusModel2.getStatus().equals("3")) {
                            return;
                        }
                        this.f30920x.startActivity(new Intent(this.f30920x, (Class<?>) ImportM3uActivity.class));
                        context = this.f30920x;
                    }
                } else {
                    if (this.f30920x == null) {
                        return;
                    }
                    this.f30920x.startActivity(new Intent(this.f30920x, (Class<?>) ImportM3uActivity.class));
                    context = this.f30920x;
                }
                ((Activity) context).finish();
            }
        } catch (Exception unused) {
        }
    }

    public void L1() {
        try {
            this.f30883U = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e9) {
            e9.printStackTrace();
        }
    }

    public boolean O1() {
        return this.f30920x.getSharedPreferences("automation_channels", 0).getString("automation_channels", "").equals("checked");
    }

    public boolean P1() {
        TextView textView;
        Resources resources;
        int i9;
        if (AbstractC2237a.f44538t.booleanValue()) {
            if (this.f30889d.getText().toString().trim().length() == 0) {
                this.f30889d.requestFocus();
                textView = this.f30889d;
                resources = getResources();
                i9 = a7.j.f13328n1;
                textView.setError(resources.getString(i9));
                return false;
            }
            if (this.f30892f.getText().toString().trim().length() != 0) {
                return true;
            }
        } else if (this.f30892f.getText().toString().trim().length() != 0) {
            return true;
        }
        this.f30915s.setVisibility(0);
        this.f30915s.requestFocus();
        textView = this.f30915s;
        resources = this.f30920x.getResources();
        i9 = a7.j.f13277i0;
        textView.setError(resources.getString(i9));
        return false;
    }

    public boolean Q1() {
        EditText editText;
        Resources resources;
        int i9;
        if (AbstractC2237a.f44538t.booleanValue()) {
            if (this.f30889d.getText().toString().trim().length() == 0) {
                this.f30889d.requestFocus();
                editText = this.f30889d;
                resources = getResources();
                i9 = a7.j.f13328n1;
                editText.setError(resources.getString(i9));
                return false;
            }
            if (this.f30890e.getText().toString().trim().length() != 0) {
                return true;
            }
        } else if (this.f30890e.getText().toString().trim().length() != 0) {
            return true;
        }
        this.f30890e.requestFocus();
        editText = this.f30890e;
        resources = getResources();
        i9 = a7.j.f13358q1;
        editText.setError(resources.getString(i9));
        return false;
    }

    public void R1() {
        g7.f fVar = new g7.f(this.f30920x, new d(new String[]{""}));
        if (Build.VERSION.SDK_INT >= 30) {
            fVar.v("");
        } else {
            fVar.u("");
        }
    }

    public void U1() {
        try {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 23) {
                if (i9 >= 33) {
                    if (checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                        AbstractC0519b.h(this, new String[]{"android.permission.READ_MEDIA_AUDIO"}, 101);
                    }
                } else if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0 || checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    AbstractC0519b.h(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 101);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // b7.InterfaceC1233c
    /* JADX INFO: renamed from: W1, reason: merged with bridge method [inline-methods] */
    public void K0(String str, int i9, boolean z9) {
        Toast toastMakeText;
        if (z9 && i9 == 1) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                AbstractC1232b.f17694a = jSONObject;
                if (jSONObject.getString("status").equalsIgnoreCase("true")) {
                    this.f30885W = AbstractC1232b.f17694a.getString("su");
                    this.f30886X = AbstractC1232b.f17694a.getString("ndd");
                    this.f30887Y = System.currentTimeMillis();
                    b7.f.e(this, AbstractC1232b.f17694a.optString("su"));
                    this.f30888Z = V1(AbstractC1232b.f17694a.optString("su") + "*" + b7.f.d(this) + "*" + AbstractC1232b.f17695b);
                    if (AbstractC1232b.f17694a.getString("sc").equalsIgnoreCase(this.f30888Z)) {
                        if (!AbstractC2237a.f44538t.booleanValue()) {
                            String str2 = this.f30901j0;
                            if (str2 != null && str2.contains(b7.f.a(this))) {
                                K1();
                                return;
                            }
                            w.X();
                            toastMakeText = Toast.makeText(this, this.f30920x.getResources().getString(a7.j.f13006G2), 0);
                            toastMakeText.show();
                        }
                        String str3 = this.f30885W;
                        if (str3 != null && !str3.equals("") && !this.f30885W.isEmpty()) {
                            this.f30903k0 = new ArrayList(Arrays.asList(this.f30885W.split(",")));
                        }
                        ArrayList arrayList = this.f30903k0;
                        if (arrayList == null || arrayList.size() < 1) {
                            toastMakeText = Toast.makeText(this, this.f30920x.getResources().getString(a7.j.f13312l5), 0);
                        } else {
                            for (int i10 = 0; i10 < this.f30903k0.size(); i10++) {
                                String str4 = this.f30901j0;
                                if (str4 != null && str4.contains((CharSequence) this.f30903k0.get(i10))) {
                                    K1();
                                    return;
                                }
                            }
                            w.X();
                            toastMakeText = Toast.makeText(this, this.f30920x.getResources().getString(a7.j.f13239e2), 0);
                        }
                        toastMakeText.show();
                    }
                }
            } catch (Exception e9) {
                Log.e("Login check", e9.getMessage());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[Catch: Exception -> 0x0038, TryCatch #2 {Exception -> 0x0038, blocks: (B:6:0x000a, B:9:0x0019, B:11:0x0025, B:22:0x005f, B:24:0x006e, B:26:0x0076, B:28:0x007a, B:30:0x0080, B:32:0x0088, B:34:0x0095, B:37:0x00b4, B:39:0x00cf, B:41:0x00d7, B:42:0x00da, B:43:0x00f4, B:54:0x013f, B:57:0x0146, B:58:0x0149, B:59:0x014a, B:62:0x016e, B:68:0x018c, B:65:0x0175, B:66:0x0178, B:16:0x003b, B:18:0x0041, B:20:0x004d, B:67:0x0179, B:61:0x0150), top: B:76:0x000a, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X1(android.content.Intent r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.LoginM3uActivity.X1(android.content.Intent):void");
    }

    @Override // b7.InterfaceC1233c
    public void b0(int i9) {
        String string;
        w.X();
        try {
            if (!AbstractC2237a.f44538t.booleanValue()) {
                String str = this.f30901j0;
                if (str != null && str.contains(b7.f.a(this))) {
                    K1();
                    return;
                }
                w.X();
                string = this.f30920x.getResources().getString(a7.j.f13312l5);
                Toast.makeText(this, string, 0).show();
            }
            String strA = b7.f.a(this);
            this.f30885W = strA;
            if (strA != null && !strA.equals("") && !this.f30885W.isEmpty()) {
                this.f30903k0 = new ArrayList(Arrays.asList(this.f30885W.split(",")));
            }
            ArrayList arrayList = this.f30903k0;
            if (arrayList == null || arrayList.size() < 1) {
                string = this.f30920x.getResources().getString(a7.j.f13312l5);
            } else {
                for (int i10 = 0; i10 < this.f30903k0.size(); i10++) {
                    String str2 = this.f30901j0;
                    if (str2 != null && str2.contains((CharSequence) this.f30903k0.get(i10))) {
                        K1();
                        return;
                    }
                }
                w.X();
                string = this.f30920x.getResources().getString(a7.j.f13239e2);
            }
            Toast.makeText(this, string, 0).show();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i9, int i10, Intent intent) throws Throwable {
        super.onActivityResult(i9, i10, intent);
        if (i9 == 101) {
            try {
                U1();
            } catch (Exception unused) {
            }
        } else if (i9 == 201) {
            X1(intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i9;
        if (view.getId() == a7.f.Pd) {
            int checkedRadioButtonId = this.f30877O.getCheckedRadioButtonId();
            if (checkedRadioButtonId == a7.f.kd && P1()) {
                new j(checkedRadioButtonId).execute(new Void[0]);
            }
            if (checkedRadioButtonId == a7.f.nd && Q1()) {
                new j(checkedRadioButtonId).execute(new Void[0]);
                return;
            }
            return;
        }
        if (view.getId() == a7.f.f12431j0) {
            try {
                if (!this.f30907m0.equals(AbstractC2237a.f44453K0) && (i9 = Build.VERSION.SDK_INT) >= 23) {
                    Intent intent = new Intent();
                    intent.setType((i9 == 23 || i9 == 24 || i9 == 25 || i9 == 26 || i9 == 27 || i9 == 28) ? "audio/mpegurl" : (i9 == 29 || i9 == 30) ? "audio/x-mpegurl" : "audio/*");
                    intent.setAction("android.intent.action.GET_CONTENT");
                    startActivityForResult(Intent.createChooser(intent, "Select File"), HttpStatus.SC_CREATED);
                } else {
                    R1();
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f30920x = this;
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f30920x);
        f30862r0 = c2858a;
        String strA = c2858a.A();
        this.f30907m0 = strA;
        setContentView(strA.equals(AbstractC2237a.f44453K0) ? a7.g.f12728V : a7.g.f12722U);
        this.f30889d = (EditText) findViewById(a7.f.f12424i3);
        this.f30890e = (EditText) findViewById(a7.f.f12384e3);
        this.f30892f = (EditText) findViewById(a7.f.f12394f3);
        this.f30894g = (RelativeLayout) findViewById(a7.f.Pd);
        this.f30896h = (ImageView) findViewById(a7.f.f12577x4);
        this.f30898i = (TextView) findViewById(a7.f.yh);
        this.f30900j = (RelativeLayout) findViewById(a7.f.Ae);
        this.f30902k = (ImageView) findViewById(a7.f.f12508q5);
        this.f30904l = (TextView) findViewById(a7.f.Sj);
        this.f30906m = (RelativeLayout) findViewById(a7.f.Be);
        this.f30908n = (ImageView) findViewById(a7.f.f12538t5);
        this.f30910o = (TextView) findViewById(a7.f.Tj);
        this.f30912p = (Button) findViewById(a7.f.f12431j0);
        this.f30913q = (RadioButton) findViewById(a7.f.kd);
        this.f30914r = (RadioButton) findViewById(a7.f.nd);
        this.f30915s = (TextView) findViewById(a7.f.Nh);
        this.f30916t = (TextView) findViewById(a7.f.pj);
        this.f30917u = (Button) findViewById(a7.f.Rm);
        this.f30918v = (RelativeLayout) findViewById(a7.f.df);
        this.f30894g.setOnClickListener(this);
        this.f30912p.setOnClickListener(this);
        U1();
        T1();
        if (AbstractC2237a.f44526o.booleanValue()) {
            return;
        }
        L1();
        u1();
        S1();
        v1();
        N1();
    }

    public void onRadioButtonClicked(View view) {
        boolean zIsChecked = ((RadioButton) view).isChecked();
        int id = view.getId();
        if (id == a7.f.kd) {
            if (zIsChecked) {
                this.f30916t.setVisibility(0);
                this.f30912p.setVisibility(0);
                this.f30890e.setVisibility(8);
                this.f30915s.setVisibility(8);
                return;
            }
            return;
        }
        if (id == a7.f.nd && zIsChecked) {
            this.f30916t.setVisibility(8);
            this.f30912p.setVisibility(8);
            this.f30915s.setVisibility(8);
            this.f30890e.setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        if (i9 != 101) {
            return;
        }
        try {
            if (iArr.length > 0 && iArr[0] == 0 && iArr[1] == 0) {
                U1();
            } else if (Build.VERSION.SDK_INT < 23 || shouldShowRequestPermissionRationale(strArr[0])) {
                onBackPressed();
            } else {
                a.C0158a c0158a = new a.C0158a(this, a7.k.f13456a);
                View viewInflate = LayoutInflater.from(this).inflate(a7.g.f12738W3, (ViewGroup) null);
                Button button = (Button) viewInflate.findViewById(a7.f.f12361c1);
                Button button2 = (Button) viewInflate.findViewById(a7.f.f12286U0);
                button.setOnFocusChangeListener(new w.k((View) button, (Activity) this));
                button2.setOnFocusChangeListener(new w.k((View) button2, (Activity) this));
                button.requestFocus();
                button.setOnClickListener(new e());
                button2.setOnClickListener(new f());
                c0158a.setView(viewInflate);
                this.f30909n0 = c0158a.create();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f30909n0.getWindow();
                Objects.requireNonNull(window);
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                this.f30909n0.show();
                this.f30909n0.getWindow().setAttributes(layoutParams);
                this.f30909n0.setCancelable(false);
                this.f30909n0.show();
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        w.m(this.f30920x);
        w.z0(this.f30920x);
    }

    public void u1() {
        this.f30882T = Build.VERSION.RELEASE + " " + Build.VERSION_CODES.class.getFields()[Build.VERSION.SDK_INT].getName();
    }

    public void v1() {
        int iNextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.f30884V = iNextInt;
        AbstractC1232b.f17695b = String.valueOf(iNextInt);
    }

    public void w1() {
        this.f30881S = V1(b7.f.c(this) + "*" + b7.f.d(this) + "-playlist-" + AbstractC1232b.f17695b + "-" + this.f30883U + "-unknown-" + S1() + "-" + this.f30882T);
        ArrayList arrayList = new ArrayList();
        b7.g.f17717b = arrayList;
        arrayList.add(b7.g.a("m", "gu"));
        b7.g.f17717b.add(b7.g.a("k", b7.f.c(this)));
        b7.g.f17717b.add(b7.g.a("sc", this.f30881S));
        b7.g.f17717b.add(b7.g.a("u", "playlist"));
        b7.g.f17717b.add(b7.g.a("pw", "no_password"));
        b7.g.f17717b.add(b7.g.a("r", AbstractC1232b.f17695b));
        b7.g.f17717b.add(b7.g.a("av", this.f30883U));
        b7.g.f17717b.add(b7.g.a("dt", "unknown"));
        b7.g.f17717b.add(b7.g.a("d", S1()));
        b7.g.f17717b.add(b7.g.a("do", this.f30882T));
        b7.g.f17718c.b(this);
    }
}
