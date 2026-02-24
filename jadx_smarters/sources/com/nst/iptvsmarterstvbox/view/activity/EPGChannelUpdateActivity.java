package com.nst.iptvsmarterstvbox.view.activity;

import a7.k;
import android.R;
import android.animation.ObjectAnimator;
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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import java.util.Calendar;
import m7.w;

/* JADX INFO: loaded from: classes4.dex */
public class EPGChannelUpdateActivity extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Toolbar f29264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppBarLayout f29265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f29266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f29267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RadioGroup f29268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RadioButton f29269i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RadioButton f29270j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f29271k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f29272l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f29273m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Context f29274n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SharedPreferences f29275o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SharedPreferences.Editor f29276p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LiveStreamDBHandler f29277q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f29278r = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f29279s = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f29280t = "";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f29281u = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Thread f29282v = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(EPGChannelUpdateActivity.this.f29274n);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = w.R(EPGChannelUpdateActivity.this.f29274n);
                String strA = w.A(string);
                TextView textView = EPGChannelUpdateActivity.this.f29272l;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = EPGChannelUpdateActivity.this.f29271k;
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
            w.n0(EPGChannelUpdateActivity.this.f29274n);
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.m0(EPGChannelUpdateActivity.this.f29274n);
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
                    EPGChannelUpdateActivity.this.w1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class j implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f29292a;

        public j(View view) {
            this.f29292a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29292a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29292a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            View view2;
            View view3;
            int i9;
            if (z9) {
                f9 = z9 ? 1.05f : 1.0f;
                View view4 = this.f29292a;
                if (view4 == null || view4.getTag() == null || !this.f29292a.getTag().equals("1")) {
                    View view5 = this.f29292a;
                    if (view5 == null || view5.getTag() == null || !this.f29292a.getTag().equals("2")) {
                        View view6 = this.f29292a;
                        if (view6 == null || view6.getTag() == null) {
                            return;
                        }
                        this.f29292a.setBackground(EPGChannelUpdateActivity.this.getResources().getDrawable(a7.e.f11931K1));
                        return;
                    }
                    a(f9);
                    b(f9);
                    view3 = this.f29292a;
                    i9 = a7.e.f12024k1;
                } else {
                    a(f9);
                    b(f9);
                    view3 = this.f29292a;
                    i9 = a7.e.f12010h;
                }
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                a(f9);
                b(f9);
                View view7 = this.f29292a;
                if ((view7 == null || view7.getTag() == null || !this.f29292a.getTag().equals("1")) && ((view2 = this.f29292a) == null || view2.getTag() == null || !this.f29292a.getTag().equals("2"))) {
                    return;
                }
                view3 = this.f29292a;
                i9 = a7.e.f12038o;
            }
            view3.setBackgroundResource(i9);
        }
    }

    private void v1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private void x1() {
        Button button = this.f29266f;
        if (button != null) {
            button.setOnFocusChangeListener(new j(button));
        }
        Button button2 = this.f29267g;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new j(button2));
        }
        RadioButton radioButton = this.f29269i;
        if (radioButton != null) {
            radioButton.setOnFocusChangeListener(new j(radioButton));
        }
        RadioButton radioButton2 = this.f29270j;
        if (radioButton2 != null) {
            radioButton2.setOnFocusChangeListener(new j(radioButton2));
        }
    }

    private void y1() {
        RadioButton radioButton;
        this.f29274n = this;
        this.f29277q = new LiveStreamDBHandler(this.f29274n);
        SharedPreferences sharedPreferences = getSharedPreferences("epgchannelupdate", 0);
        this.f29275o = sharedPreferences;
        if (sharedPreferences.getString("epgchannelupdate", "").equals("all")) {
            this.f29270j.setChecked(true);
            radioButton = this.f29270j;
        } else {
            this.f29269i.setChecked(true);
            radioButton = this.f29269i;
        }
        radioButton.requestFocus();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        SharedPreferences.Editor editor;
        String str;
        if (view.getId() == a7.f.Bj) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            return;
        }
        if (view.getId() == a7.f.f12117D0) {
            RadioButton radioButton = (RadioButton) findViewById(this.f29268h.getCheckedRadioButtonId());
            SharedPreferences sharedPreferences = getSharedPreferences("epgchannelupdate", 0);
            this.f29275o = sharedPreferences;
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            this.f29276p = editorEdit;
            if (editorEdit == null) {
                Toast.makeText(this, getResources().getString(a7.j.f13292j5), 0).show();
                return;
            }
            if (radioButton.getText().toString().equals(getResources().getString(a7.j.f13436y))) {
                editor = this.f29276p;
                str = "all";
            } else {
                editor = this.f29276p;
                str = "withepg";
            }
            editor.putString("epgchannelupdate", str);
            this.f29276p.commit();
            Toast.makeText(this, getResources().getString(a7.j.f13302k5), 0).show();
        } else if (view.getId() != a7.f.f12267S0) {
            return;
        }
        finish();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(a7.g.f12906y);
        this.f29264d = (Toolbar) findViewById(a7.f.kh);
        this.f29265e = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f29266f = (Button) findViewById(a7.f.f12117D0);
        this.f29267g = (Button) findViewById(a7.f.f12267S0);
        this.f29268h = (RadioGroup) findViewById(a7.f.Kd);
        this.f29269i = (RadioButton) findViewById(a7.f.yd);
        this.f29270j = (RadioButton) findViewById(a7.f.ed);
        this.f29271k = (TextView) findViewById(a7.f.f12129E2);
        this.f29272l = (TextView) findViewById(a7.f.gh);
        this.f29273m = (ImageView) findViewById(a7.f.Xa);
        this.f29266f.setOnClickListener(this);
        this.f29267g.setOnClickListener(this);
        x1();
        v1();
        r1((Toolbar) findViewById(a7.f.kh));
        getWindow().setFlags(1024, 1024);
        y1();
        Thread thread = this.f29282v;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new i());
            this.f29282v = thread2;
            thread2.start();
        }
        this.f29273m.setOnClickListener(new a());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f29264d.x(a7.h.f12939v);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f29264d.getChildCount(); i9++) {
            if (this.f29264d.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f29264d.getChildAt(i9).getLayoutParams()).f39307a = 16;
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
        if (itemId == a7.f.f12380e && (context = this.f29274n) != null) {
            new a.C0158a(context, k.f13456a).setTitle(getResources().getString(a7.j.f13250f3)).f(getResources().getString(a7.j.f13240e3)).j(getResources().getString(a7.j.f13132S8), new d()).g(getResources().getString(a7.j.f13231d4), new c()).n();
        }
        if (itemId == a7.f.fb) {
            a.C0158a c0158a = new a.C0158a(this);
            c0158a.setTitle(this.f29274n.getResources().getString(a7.j.f13397u0));
            c0158a.f(this.f29274n.getResources().getString(a7.j.f13134T0));
            c0158a.d(a7.e.f12056s1);
            c0158a.j(this.f29274n.getResources().getString(a7.j.f13132S8), new e());
            c0158a.g(this.f29274n.getResources().getString(a7.j.f13231d4), new f());
            c0158a.n();
        }
        if (itemId == a7.f.hb) {
            a.C0158a c0158a2 = new a.C0158a(this);
            c0158a2.setTitle(this.f29274n.getResources().getString(a7.j.f13397u0));
            c0158a2.f(this.f29274n.getResources().getString(a7.j.f13134T0));
            c0158a2.d(a7.e.f12056s1);
            c0158a2.j(this.f29274n.getResources().getString(a7.j.f13132S8), new g());
            c0158a2.g(this.f29274n.getResources().getString(a7.j.f13231d4), new h());
            c0158a2.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f29282v;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f29282v.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f29282v;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new i());
            this.f29282v = thread2;
            thread2.start();
        }
        w.m(this.f29274n);
        w.z0(this.f29274n);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f29275o = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f29275o.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        }
    }

    public void w1() {
        runOnUiThread(new b());
    }
}
