package com.nst.iptvsmarterstvbox.view.activity;

import D.AbstractC0519b;
import a7.j;
import a7.k;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import g7.e;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import m7.AbstractC2237a;
import m7.w;
import q7.Q;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class RecordingActivity extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static C2858a f31497A;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AppBarLayout f31498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ProgressBar f31499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f31500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f31501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f31502h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f31503i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Button f31504j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f31505k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LinearLayout f31506l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f31507m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f31508n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f31509o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Context f31510p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SharedPreferences f31511q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Q f31512r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RecyclerView.o f31514t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SharedPreferences.Editor f31515u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SharedPreferences f31516v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f31519y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public androidx.appcompat.app.a f31520z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f31513s = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Boolean f31517w = Boolean.FALSE;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Thread f31518x = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(RecordingActivity.this.f31510p);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecordingActivity.this.onBackPressed();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", RecordingActivity.this.getPackageName(), null));
                RecordingActivity.this.startActivityForResult(intent, 101);
                Toast.makeText(RecordingActivity.this.f31510p, RecordingActivity.this.f31510p.getResources().getString(j.f13339o2), 1).show();
            } catch (Exception unused) {
            }
            RecordingActivity.this.f31520z.dismiss();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecordingActivity.this.f31520z.dismiss();
            RecordingActivity.this.onBackPressed();
        }
    }

    public class e implements e.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String[] f31525a;

        public e(String[] strArr) {
            this.f31525a = strArr;
        }

        @Override // g7.e.j
        public void a(String str) {
            this.f31525a[0] = str;
            RecordingActivity recordingActivity = RecordingActivity.this;
            recordingActivity.f31515u = recordingActivity.f31516v.edit();
            RecordingActivity.this.f31515u.putString("recordingDir", str);
            RecordingActivity.this.f31515u.apply();
            RecordingActivity.this.f31505k.setText(RecordingActivity.this.f31510p.getResources().getString(j.b9) + str);
            RecordingActivity.this.D1();
            Toast.makeText(RecordingActivity.this.f31510p, RecordingActivity.this.f31510p.getResources().getString(j.f13297k0) + str, 1).show();
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = w.R(RecordingActivity.this.f31510p);
                String strA = w.A(string);
                TextView textView = RecordingActivity.this.f31503i;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = RecordingActivity.this.f31502h;
                if (textView2 != null) {
                    textView2.setText(strA);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    RecordingActivity.this.A1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class h implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f31529a;

        public h(View view) {
            this.f31529a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31529a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31529a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31529a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            int i9;
            try {
                if (z9) {
                    b(1.0f);
                    c(1.0f);
                    View view2 = this.f31529a;
                    if (view2 == null || view2.getTag() == null || !this.f31529a.getTag().equals("3")) {
                        View view3 = this.f31529a;
                        if (view3 == null || view3.getTag() == null || !this.f31529a.getTag().equals("1")) {
                            View view4 = this.f31529a;
                            if (view4 == null || view4.getTag() == null || !this.f31529a.getTag().equals("2")) {
                                view = this.f31529a;
                                if (view == null) {
                                    return;
                                } else {
                                    i9 = a7.e.f12041o2;
                                }
                            } else {
                                view = this.f31529a;
                                i9 = a7.e.f12024k1;
                            }
                        } else {
                            view = this.f31529a;
                        }
                    } else {
                        b(1.0f);
                        c(1.0f);
                    }
                    i9 = a7.e.f12010h;
                } else {
                    if (z9) {
                        return;
                    }
                    b(1.0f);
                    c(1.0f);
                    a(z9);
                    View view5 = this.f31529a;
                    if (view5 == null || view5.getTag() == null || !this.f31529a.getTag().equals("3")) {
                        View view6 = this.f31529a;
                        if (view6 == null || view6.getTag() == null || !this.f31529a.getTag().equals("1")) {
                            View view7 = this.f31529a;
                            if (view7 == null || view7.getTag() == null || !this.f31529a.getTag().equals("2")) {
                                view = this.f31529a;
                                if (view == null) {
                                    return;
                                } else {
                                    i9 = a7.c.f11875z;
                                }
                            } else {
                                view = this.f31529a;
                            }
                        } else {
                            view = this.f31529a;
                        }
                    } else {
                        b(1.0f);
                        c(1.0f);
                    }
                    i9 = a7.e.f12038o;
                }
                view.setBackgroundResource(i9);
            } catch (Exception unused) {
            }
        }
    }

    private void B1() {
        Button button = this.f31504j;
        if (button != null) {
            button.setOnFocusChangeListener(new h(button));
            this.f31504j.requestFocus();
            this.f31504j.requestFocusFromTouch();
            this.f31504j.setBackgroundResource(a7.e.f12010h);
        }
        TextView textView = this.f31507m;
        if (textView != null) {
            textView.setOnFocusChangeListener(new h(textView));
        }
    }

    private void z1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    public void A1() {
        runOnUiThread(new f());
    }

    public void C1() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    public void D1() {
        if (this.f31510p != null) {
            this.f31507m.setVisibility(8);
            this.f31501g.setVisibility(8);
            this.f31506l.setVisibility(0);
            this.f31516v = this.f31510p.getSharedPreferences("recordingDir", 0);
            this.f31505k.setText(getResources().getString(j.c9) + this.f31516v.getString("recordingDir", String.valueOf(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "IPTVSmarters"))));
            File[] fileArrO = w.O(this.f31510p);
            if (fileArrO == null || fileArrO.length <= 0) {
                this.f31513s.clear();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f31510p);
                this.f31514t = linearLayoutManager;
                this.f31500f.setLayoutManager(linearLayoutManager);
                this.f31512r = new Q(this, this.f31513s);
                this.f31500f.setItemAnimator(new androidx.recyclerview.widget.c());
                this.f31500f.setAdapter(this.f31512r);
                this.f31501g.setVisibility(0);
                this.f31501g.setText(getResources().getString(j.f13451z4));
                return;
            }
            this.f31513s.clear();
            for (File file : fileArrO) {
                if (file.toString().endsWith(".ts")) {
                    this.f31513s.addAll(Arrays.asList(file));
                }
            }
            if (this.f31513s.size() > 0) {
                this.f31506l.setVisibility(0);
                this.f31501g.setVisibility(8);
                this.f31507m.setFocusable(false);
            } else {
                this.f31501g.setVisibility(0);
                this.f31501g.setText(getResources().getString(j.f13451z4));
                this.f31501g.setClickable(false);
                this.f31506l.setVisibility(0);
            }
            this.f31514t = new LinearLayoutManager(this.f31510p);
            Collections.reverse(this.f31513s);
            this.f31500f.setLayoutManager(this.f31514t);
            this.f31512r = new Q(this, this.f31513s);
            this.f31500f.setItemAnimator(new androidx.recyclerview.widget.c());
            this.f31500f.setAdapter(this.f31512r);
        }
    }

    public void E1() {
        try {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 23 && i9 < 33) {
                if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 && checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                    return;
                }
                AbstractC0519b.h(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 101);
            }
        } catch (Exception unused) {
        }
    }

    public void F1(File file, RecordingActivity recordingActivity) {
        if (recordingActivity == null || this.f31512r == null || this.f31513s == null || this.f31501g == null) {
            return;
        }
        new w().K0(recordingActivity, file, this.f31512r, this.f31513s, this.f31501g);
    }

    public void b() {
        ProgressBar progressBar = this.f31499e;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i9, int i10, Intent intent) {
        super.onActivityResult(i9, i10, intent);
        if (i9 == 101) {
            try {
                E1();
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        try {
            if (id == a7.f.wk) {
                E1();
            } else {
                if (id != a7.f.xk) {
                    if (id == a7.f.Bj) {
                        startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                        return;
                    }
                    if (id == a7.f.f12461m0) {
                        g7.e eVar = new g7.e(this.f31510p, new e(new String[]{""}));
                        if (Build.VERSION.SDK_INT >= 30) {
                            eVar.E("");
                            return;
                        } else {
                            eVar.D("");
                            return;
                        }
                    }
                    return;
                }
                Toast.makeText(this, this.f31510p.getResources().getString(j.f13339o2), 1).show();
                this.f31517w = Boolean.TRUE;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", getPackageName(), null));
                startActivityForResult(intent, 101);
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f31510p = this;
        C1();
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f31510p);
        f31497A = c2858a;
        String strA = c2858a.A();
        this.f31519y = strA;
        setContentView(strA.equals(AbstractC2237a.f44453K0) ? a7.g.f12901x0 : a7.g.f12895w0);
        this.f31498d = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f31499e = (ProgressBar) findViewById(a7.f.ec);
        this.f31500f = (RecyclerView) findViewById(a7.f.ub);
        this.f31501g = (TextView) findViewById(a7.f.wk);
        this.f31502h = (TextView) findViewById(a7.f.f12129E2);
        this.f31503i = (TextView) findViewById(a7.f.gh);
        this.f31504j = (Button) findViewById(a7.f.f12461m0);
        this.f31505k = (TextView) findViewById(a7.f.f12501pl);
        this.f31506l = (LinearLayout) findViewById(a7.f.ff);
        this.f31507m = (TextView) findViewById(a7.f.xk);
        this.f31508n = (ImageView) findViewById(a7.f.Xa);
        this.f31509o = (ImageView) findViewById(a7.f.f12141F4);
        this.f31501g.setOnClickListener(this);
        this.f31504j.setOnClickListener(this);
        this.f31507m.setOnClickListener(this);
        z1();
        B1();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        AppBarLayout appBarLayout = this.f31498d;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(a7.e.f12034n));
        }
        getWindow().setFlags(1024, 1024);
        E1();
        D1();
        this.f31508n.setOnClickListener(new a());
        this.f31509o.setOnClickListener(new b());
        Thread thread = this.f31518x;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new g());
            this.f31518x = thread2;
            thread2.start();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f31518x;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f31518x.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        if (i9 != 101) {
            return;
        }
        try {
            if (iArr.length > 0 && iArr[0] == 0 && iArr[1] == 0) {
                E1();
            } else if (Build.VERSION.SDK_INT < 23 || shouldShowRequestPermissionRationale(strArr[0])) {
                onBackPressed();
            } else {
                a.C0158a c0158a = new a.C0158a(this, k.f13456a);
                View viewInflate = LayoutInflater.from(this).inflate(a7.g.f12738W3, (ViewGroup) null);
                Button button = (Button) viewInflate.findViewById(a7.f.f12361c1);
                Button button2 = (Button) viewInflate.findViewById(a7.f.f12286U0);
                button.setOnFocusChangeListener(new w.k((View) button, this));
                button2.setOnFocusChangeListener(new w.k((View) button2, this));
                button.requestFocus();
                button.setOnClickListener(new c());
                button2.setOnClickListener(new d());
                c0158a.setView(viewInflate);
                this.f31520z = c0158a.create();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f31520z.getWindow();
                Objects.requireNonNull(window);
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                this.f31520z.show();
                this.f31520z.getWindow().setAttributes(layoutParams);
                this.f31520z.setCancelable(false);
                this.f31520z.show();
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        C1();
        super.onResume();
        Thread thread = this.f31518x;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new g());
            this.f31518x = thread2;
            thread2.start();
        }
        w.m(this.f31510p);
        w.z0(this.f31510p);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f31511q = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f31511q.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f31510p != null) {
            b();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        C1();
    }
}
