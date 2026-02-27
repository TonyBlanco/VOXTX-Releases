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
import m7.AbstractC2237a;
import m7.w;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class TimeFormatActivity extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Toolbar f32813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppBarLayout f32814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f32815f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f32816g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RadioGroup f32817h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RadioButton f32818i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RadioButton f32819j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f32820k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f32821l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f32822m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Context f32823n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SharedPreferences f32824o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SharedPreferences.Editor f32825p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LiveStreamDBHandler f32826q;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C2858a f32831v;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f32827r = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f32828s = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f32829t = "";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f32830u = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Thread f32832w = null;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = w.R(TimeFormatActivity.this.f32823n);
                String strA = w.A(string);
                TextView textView = TimeFormatActivity.this.f32821l;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = TimeFormatActivity.this.f32820k;
                if (textView2 != null) {
                    textView2.setText(strA);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(TimeFormatActivity.this.f32823n);
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
            w.n0(TimeFormatActivity.this.f32823n);
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.m0(TimeFormatActivity.this.f32823n);
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
                    TimeFormatActivity.this.y1();
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
        public final View f32842a;

        public j(View view) {
            this.f32842a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f32842a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f32842a, "scaleY", f9);
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
                View view4 = this.f32842a;
                if (view4 == null || view4.getTag() == null || !this.f32842a.getTag().equals("1")) {
                    View view5 = this.f32842a;
                    if (view5 == null || view5.getTag() == null || !this.f32842a.getTag().equals("2")) {
                        View view6 = this.f32842a;
                        if (view6 == null || view6.getTag() == null) {
                            return;
                        }
                        this.f32842a.setBackground(TimeFormatActivity.this.getResources().getDrawable(a7.e.f11931K1));
                        return;
                    }
                    a(f9);
                    b(f9);
                    view3 = this.f32842a;
                    i9 = a7.e.f12024k1;
                } else {
                    a(f9);
                    b(f9);
                    view3 = this.f32842a;
                    i9 = a7.e.f12010h;
                }
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                a(f9);
                b(f9);
                View view7 = this.f32842a;
                if ((view7 == null || view7.getTag() == null || !this.f32842a.getTag().equals("1")) && ((view2 = this.f32842a) == null || view2.getTag() == null || !this.f32842a.getTag().equals("2"))) {
                    return;
                }
                view3 = this.f32842a;
                i9 = a7.e.f12038o;
            }
            view3.setBackgroundResource(i9);
        }
    }

    private void A1() {
        this.f32813d = (Toolbar) findViewById(a7.f.kh);
        this.f32814e = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f32815f = (Button) findViewById(a7.f.f12117D0);
        this.f32816g = (Button) findViewById(a7.f.f12267S0);
        this.f32817h = (RadioGroup) findViewById(a7.f.Kd);
        this.f32818i = (RadioButton) findViewById(a7.f.dd);
        this.f32819j = (RadioButton) findViewById(a7.f.cd);
        this.f32820k = (TextView) findViewById(a7.f.f12129E2);
        this.f32821l = (TextView) findViewById(a7.f.gh);
        this.f32822m = (ImageView) findViewById(a7.f.Xa);
    }

    private void B1() {
        RadioButton radioButton;
        this.f32823n = this;
        this.f32826q = new LiveStreamDBHandler(this.f32823n);
        SharedPreferences sharedPreferences = getSharedPreferences("timeFormat", 0);
        this.f32824o = sharedPreferences;
        if (sharedPreferences.getString("timeFormat", AbstractC2237a.f44441E0).equals("hh:mm a")) {
            this.f32819j.setChecked(true);
            radioButton = this.f32819j;
        } else {
            this.f32818i.setChecked(true);
            radioButton = this.f32818i;
        }
        radioButton.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C1(View view) {
        SharedPreferences.Editor editor;
        String str;
        RadioButton radioButton = (RadioButton) findViewById(this.f32817h.getCheckedRadioButtonId());
        SharedPreferences sharedPreferences = getSharedPreferences("timeFormat", 0);
        this.f32824o = sharedPreferences;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        this.f32825p = editorEdit;
        if (editorEdit == null) {
            Toast.makeText(this, getResources().getString(a7.j.f13292j5), 0).show();
            return;
        }
        if (radioButton.getTag().equals(AbstractC2237a.f44443F0)) {
            editor = this.f32825p;
            str = "hh:mm a";
        } else {
            editor = this.f32825p;
            str = "HH:mm";
        }
        editor.putString("timeFormat", str);
        this.f32825p.apply();
        Toast.makeText(this, getResources().getString(a7.j.f13302k5), 0).show();
        Thread thread = this.f32832w;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new i());
            this.f32832w = thread2;
            thread2.start();
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D1(View view) {
        finish();
    }

    private void x1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private void z1() {
        Button button = this.f32815f;
        if (button != null) {
            button.setOnFocusChangeListener(new j(button));
            this.f32815f.requestFocus();
            this.f32815f.requestFocusFromTouch();
        }
        Button button2 = this.f32816g;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new j(button2));
        }
        RadioButton radioButton = this.f32818i;
        if (radioButton != null) {
            radioButton.setOnFocusChangeListener(new j(radioButton));
        }
        RadioButton radioButton2 = this.f32819j;
        if (radioButton2 != null) {
            radioButton2.setOnFocusChangeListener(new j(radioButton2));
        }
    }

    public void E1() {
        this.f32815f.setOnClickListener(new View.OnClickListener() { // from class: p7.n1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46661a.C1(view);
            }
        });
        this.f32816g.setOnClickListener(new View.OnClickListener() { // from class: p7.o1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46662a.D1(view);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
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
        this.f32823n = this;
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f32823n);
        this.f32831v = c2858a;
        setContentView(c2858a.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12824k1 : a7.g.f12818j1);
        w.Y(this);
        A1();
        E1();
        z1();
        x1();
        r1((Toolbar) findViewById(a7.f.kh));
        getWindow().setFlags(1024, 1024);
        B1();
        Thread thread = this.f32832w;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new i());
            this.f32832w = thread2;
            thread2.start();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f32813d.x(a7.h.f12939v);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f32813d.getChildCount(); i9++) {
            if (this.f32813d.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f32813d.getChildAt(i9).getLayoutParams()).f39307a = 16;
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
        if (itemId == a7.f.f12380e && (context = this.f32823n) != null) {
            new a.C0158a(context, k.f13456a).setTitle(getResources().getString(a7.j.f13250f3)).f(getResources().getString(a7.j.f13240e3)).j(getResources().getString(a7.j.f13132S8), new d()).g(getResources().getString(a7.j.f13231d4), new c()).n();
        }
        if (itemId == a7.f.fb) {
            a.C0158a c0158a = new a.C0158a(this);
            c0158a.setTitle(this.f32823n.getResources().getString(a7.j.f13397u0));
            c0158a.f(this.f32823n.getResources().getString(a7.j.f13134T0));
            c0158a.d(a7.e.f12056s1);
            c0158a.j(this.f32823n.getResources().getString(a7.j.f13132S8), new e());
            c0158a.g(this.f32823n.getResources().getString(a7.j.f13231d4), new f());
            c0158a.n();
        }
        if (itemId == a7.f.hb) {
            a.C0158a c0158a2 = new a.C0158a(this);
            c0158a2.setTitle(this.f32823n.getResources().getString(a7.j.f13397u0));
            c0158a2.f(this.f32823n.getResources().getString(a7.j.f13134T0));
            c0158a2.d(a7.e.f12056s1);
            c0158a2.j(this.f32823n.getResources().getString(a7.j.f13132S8), new g());
            c0158a2.g(this.f32823n.getResources().getString(a7.j.f13231d4), new h());
            c0158a2.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f32832w;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f32832w.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f32832w;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new i());
            this.f32832w = thread2;
            thread2.start();
        }
        w.z0(this.f32823n);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f32824o = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f32824o.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        }
    }

    public void y1() {
        runOnUiThread(new a());
        this.f32822m.setOnClickListener(new b());
    }
}
