package com.nst.iptvsmarterstvbox.view.activity;

import a7.j;
import a7.k;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import java.util.Calendar;
import m7.w;
import s7.C2749b;
import s7.C2750c;
import s7.C2751d;
import s7.C2752e;
import s7.f;
import s7.g;
import s7.h;

/* JADX INFO: loaded from: classes4.dex */
public class ParentalControlActivitity extends androidx.appcompat.app.b implements View.OnClickListener, h.b, f.b, C2749b.f, g.f, C2752e.f, C2750c.f, C2751d.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Toolbar f31324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f31325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f31326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f31327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f31328h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f31329i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SharedPreferences f31330j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LiveStreamDBHandler f31331k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f31332l = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f31333m = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f31334n = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f31335o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Thread f31336p = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(ParentalControlActivitity.this.f31329i);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = w.R(ParentalControlActivitity.this.f31329i);
                String strA = w.A(string);
                TextView textView = ParentalControlActivitity.this.f31327g;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = ParentalControlActivitity.this.f31326f;
                if (textView2 != null) {
                    textView2.setText(strA);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.dismiss();
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.n0(ParentalControlActivitity.this.f31329i);
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.m0(ParentalControlActivitity.this.f31329i);
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class g implements DialogInterface.OnClickListener {
        public g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
        }
    }

    public class h implements DialogInterface.OnClickListener {
        public h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    ParentalControlActivitity.this.w1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    private void v1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private void x1() {
        this.f31329i = this;
        this.f31331k = new LiveStreamDBHandler(this.f31329i);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f31330j = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f31330j.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        } else if (this.f31329i != null) {
            s7.h hVar = new s7.h();
            androidx.fragment.app.w wVarM = getSupportFragmentManager().m();
            wVarM.s(R.anim.fade_in, R.anim.fade_out);
            wVarM.r(a7.f.f12325Y3, hVar, "PARENTAL_CONTROL_SETTINGS");
            wVarM.j();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == a7.f.Bj) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(a7.g.f12829l0);
        w.Y(this);
        this.f31324d = (Toolbar) findViewById(a7.f.kh);
        this.f31325e = (ImageView) findViewById(a7.f.Bj);
        this.f31326f = (TextView) findViewById(a7.f.f12129E2);
        this.f31327g = (TextView) findViewById(a7.f.gh);
        this.f31328h = (ImageView) findViewById(a7.f.Xa);
        v1();
        r1((Toolbar) findViewById(a7.f.kh));
        x1();
        Thread thread = this.f31336p;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new i());
            this.f31336p = thread2;
            thread2.start();
        }
        this.f31328h.setOnClickListener(new a());
        ImageView imageView = this.f31325e;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f31324d.x(a7.h.f12939v);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f31324d.getChildCount(); i9++) {
            if (this.f31324d.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f31324d.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        int itemId = menuItem.getItemId();
        if (itemId == a7.f.Gb) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == a7.f.Mb) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == a7.f.f12380e && (context = this.f31329i) != null) {
            new a.C0158a(context, k.f13456a).setTitle(getResources().getString(j.f13250f3)).f(getResources().getString(j.f13240e3)).j(getResources().getString(j.f13132S8), new d()).g(getResources().getString(j.f13231d4), new c()).n();
        }
        if (itemId == a7.f.fb) {
            a.C0158a c0158a = new a.C0158a(this);
            c0158a.setTitle(this.f31329i.getResources().getString(j.f13397u0));
            c0158a.f(this.f31329i.getResources().getString(j.f13134T0));
            c0158a.d(a7.e.f12056s1);
            c0158a.j(this.f31329i.getResources().getString(j.f13132S8), new e());
            c0158a.g(this.f31329i.getResources().getString(j.f13231d4), new f());
            c0158a.n();
        }
        if (itemId == a7.f.hb) {
            a.C0158a c0158a2 = new a.C0158a(this);
            c0158a2.setTitle(this.f31329i.getResources().getString(j.f13397u0));
            c0158a2.f(this.f31329i.getResources().getString(j.f13134T0));
            c0158a2.d(a7.e.f12056s1);
            c0158a2.j(this.f31329i.getResources().getString(j.f13132S8), new g());
            c0158a2.g(this.f31329i.getResources().getString(j.f13231d4), new h());
            c0158a2.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f31336p;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f31336p.interrupt();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f31336p;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new i());
            this.f31336p = thread2;
            thread2.start();
        }
        w.m(this.f31329i);
        w.z0(this.f31329i);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f31330j = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f31330j.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        }
    }

    public void w1() {
        runOnUiThread(new b());
    }
}
