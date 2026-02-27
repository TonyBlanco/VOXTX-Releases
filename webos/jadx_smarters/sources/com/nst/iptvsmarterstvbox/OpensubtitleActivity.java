package com.nst.iptvsmarterstvbox;

import a7.k;
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
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.LoginActivity;
import com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity;
import com.nst.iptvsmarterstvbox.view.activity.SettingsActivity;
import java.util.Calendar;
import m7.AbstractC2237a;
import m7.w;
import org.apache.http.client.config.CookieSpecs;
import u7.C2858a;

/* JADX INFO: loaded from: classes3.dex */
public class OpensubtitleActivity extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Toolbar f28039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppBarLayout f28040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f28041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f28042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RadioGroup f28043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RadioButton f28044i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RadioButton f28045j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RadioButton f28046k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f28047l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f28048m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f28049n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Context f28050o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SharedPreferences f28051p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SharedPreferences.Editor f28052q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LiveStreamDBHandler f28053r;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C2858a f28058w;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f28054s = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f28055t = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f28056u = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f28057v = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Thread f28059x = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(OpensubtitleActivity.this.f28050o);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = w.R(OpensubtitleActivity.this.f28050o);
                String strA = w.A(string);
                if (OpensubtitleActivity.this.f28048m != null) {
                    OpensubtitleActivity.this.f28048m.setText(strR);
                }
                if (OpensubtitleActivity.this.f28047l != null) {
                    OpensubtitleActivity.this.f28047l.setText(strA);
                }
            } catch (Exception e9) {
                e9.printStackTrace();
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
            w.n0(OpensubtitleActivity.this.f28050o);
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.m0(OpensubtitleActivity.this.f28050o);
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
                    OpensubtitleActivity.this.y1();
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
        public final View f28069a;

        public j(View view) {
            this.f28069a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28069a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28069a, "scaleY", f9);
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
                View view4 = this.f28069a;
                if (view4 == null || view4.getTag() == null || !this.f28069a.getTag().equals("1")) {
                    View view5 = this.f28069a;
                    if (view5 == null || view5.getTag() == null || !this.f28069a.getTag().equals("2")) {
                        View view6 = this.f28069a;
                        if (view6 == null || view6.getTag() == null) {
                            return;
                        }
                        this.f28069a.setBackground(OpensubtitleActivity.this.getResources().getDrawable(a7.e.f11931K1));
                        return;
                    }
                    a(f9);
                    b(f9);
                    view3 = this.f28069a;
                    i9 = a7.e.f12024k1;
                } else {
                    a(f9);
                    b(f9);
                    view3 = this.f28069a;
                    i9 = a7.e.f12010h;
                }
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                a(f9);
                b(f9);
                View view7 = this.f28069a;
                if ((view7 == null || view7.getTag() == null || !this.f28069a.getTag().equals("1")) && ((view2 = this.f28069a) == null || view2.getTag() == null || !this.f28069a.getTag().equals("2"))) {
                    return;
                }
                view3 = this.f28069a;
                i9 = a7.e.f12038o;
            }
            view3.setBackgroundResource(i9);
        }
    }

    private void A1() {
        RadioButton radioButton;
        this.f28050o = this;
        this.f28053r = new LiveStreamDBHandler(this.f28050o);
        SharedPreferences sharedPreferences = getSharedPreferences("allowedFormatsubtitle", 0);
        this.f28051p = sharedPreferences;
        String string = sharedPreferences.getString("allowedFormatsubtitle", CookieSpecs.DEFAULT);
        if (string.equals("disable")) {
            this.f28046k.setChecked(true);
            radioButton = this.f28046k;
        } else if (!string.equals(CookieSpecs.DEFAULT) && string.equals("vip")) {
            this.f28044i.setChecked(true);
            radioButton = this.f28044i;
        } else {
            this.f28045j.setChecked(true);
            radioButton = this.f28045j;
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
        int id = view.getId();
        if (id == a7.f.Bj) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
            return;
        }
        if (id == a7.f.f12127E0) {
            RadioButton radioButton = (RadioButton) findViewById(this.f28043h.getCheckedRadioButtonId());
            SharedPreferences sharedPreferences = getSharedPreferences("allowedFormatsubtitle", 0);
            this.f28051p = sharedPreferences;
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            this.f28052q = editorEdit;
            if (editorEdit == null) {
                Toast.makeText(this, getResources().getString(a7.j.f13292j5), 0).show();
                return;
            }
            if (radioButton.getText().toString().equals(getResources().getString(a7.j.f13286j))) {
                SharepreferenceDBHandler.setOpenSubtitle(this.f28050o, true);
                editor = this.f28052q;
                str = "vip";
            } else if (radioButton.getText().toString().equals(getResources().getString(a7.j.f13014H0))) {
                SharepreferenceDBHandler.setOpenSubtitle(this.f28050o, true);
                editor = this.f28052q;
                str = CookieSpecs.DEFAULT;
            } else {
                SharepreferenceDBHandler.setOpenSubtitle(this.f28050o, false);
                editor = this.f28052q;
                str = "disable";
            }
            editor.putString("allowedFormatsubtitle", str);
            this.f28052q.commit();
            Toast.makeText(this, getResources().getString(a7.j.f13302k5), 0).show();
        } else if (id != a7.f.f12267S0) {
            return;
        }
        finish();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f28050o = this;
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f28050o);
        this.f28058w = c2858a;
        setContentView(c2858a.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12817j0 : a7.g.f12811i0);
        w.Y(this);
        this.f28039d = (Toolbar) findViewById(a7.f.kh);
        this.f28040e = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f28041f = (Button) findViewById(a7.f.f12127E0);
        this.f28042g = (Button) findViewById(a7.f.f12267S0);
        this.f28043h = (RadioGroup) findViewById(a7.f.Kd);
        this.f28044i = (RadioButton) findViewById(a7.f.xd);
        this.f28045j = (RadioButton) findViewById(a7.f.id);
        this.f28046k = (RadioButton) findViewById(a7.f.jd);
        this.f28047l = (TextView) findViewById(a7.f.f12129E2);
        this.f28048m = (TextView) findViewById(a7.f.gh);
        this.f28049n = (ImageView) findViewById(a7.f.Xa);
        z1();
        this.f28041f.setOnClickListener(this);
        this.f28042g.setOnClickListener(this);
        x1();
        r1((Toolbar) findViewById(a7.f.kh));
        getWindow().setFlags(1024, 1024);
        A1();
        Thread thread = this.f28059x;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new i());
            this.f28059x = thread2;
            thread2.start();
        }
        this.f28049n.setOnClickListener(new a());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f28039d.x(a7.h.f12939v);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f28039d.getChildCount(); i9++) {
            if (this.f28039d.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f28039d.getChildAt(i9).getLayoutParams()).f39307a = 16;
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
        if (itemId == a7.f.f12380e && (context = this.f28050o) != null) {
            new a.C0158a(context, k.f13456a).setTitle(getResources().getString(a7.j.f13250f3)).f(getResources().getString(a7.j.f13240e3)).j(getResources().getString(a7.j.f13132S8), new d()).g(getResources().getString(a7.j.f13231d4), new c()).n();
        }
        if (itemId == a7.f.fb) {
            a.C0158a c0158a = new a.C0158a(this);
            c0158a.setTitle(this.f28050o.getResources().getString(a7.j.f13397u0));
            c0158a.f(this.f28050o.getResources().getString(a7.j.f13134T0));
            c0158a.d(a7.e.f12056s1);
            c0158a.j(this.f28050o.getResources().getString(a7.j.f13132S8), new e());
            c0158a.g(this.f28050o.getResources().getString(a7.j.f13231d4), new f());
            c0158a.n();
        }
        if (itemId == a7.f.hb) {
            a.C0158a c0158a2 = new a.C0158a(this);
            c0158a2.setTitle(this.f28050o.getResources().getString(a7.j.f13397u0));
            c0158a2.f(this.f28050o.getResources().getString(a7.j.f13134T0));
            c0158a2.d(a7.e.f12056s1);
            c0158a2.j(this.f28050o.getResources().getString(a7.j.f13132S8), new g());
            c0158a2.g(this.f28050o.getResources().getString(a7.j.f13231d4), new h());
            c0158a2.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f28059x;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f28059x.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f28059x;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new i());
            this.f28059x = thread2;
            thread2.start();
        }
        w.m(this.f28050o);
        w.z0(this.f28050o);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f28051p = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f28051p.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        }
    }

    public final void x1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    public void y1() {
        runOnUiThread(new b());
    }

    public final void z1() {
        Button button = this.f28041f;
        if (button != null) {
            button.setOnFocusChangeListener(new j(button));
            this.f28041f.requestFocus();
            this.f28041f.requestFocusFromTouch();
        }
        Button button2 = this.f28042g;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new j(button2));
        }
        RadioButton radioButton = this.f28044i;
        if (radioButton != null) {
            radioButton.setOnFocusChangeListener(new j(radioButton));
        }
        RadioButton radioButton2 = this.f28045j;
        if (radioButton2 != null) {
            radioButton2.setOnFocusChangeListener(new j(radioButton2));
        }
        RadioButton radioButton3 = this.f28046k;
        if (radioButton3 != null) {
            radioButton3.setOnFocusChangeListener(new j(radioButton3));
        }
    }
}
