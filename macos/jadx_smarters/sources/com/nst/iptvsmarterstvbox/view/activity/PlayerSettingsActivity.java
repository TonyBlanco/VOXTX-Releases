package com.nst.iptvsmarterstvbox.view.activity;

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
import android.widget.CheckBox;
import android.widget.FrameLayout;
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
public class PlayerSettingsActivity extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public SharedPreferences f31437D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public SharedPreferences.Editor f31438E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public SharedPreferences f31439F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public SharedPreferences.Editor f31440G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public SharedPreferences f31441H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public SharedPreferences.Editor f31442I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public androidx.appcompat.app.a f31443J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C2858a f31444K;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Toolbar f31446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppBarLayout f31447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f31448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RadioGroup f31449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RadioButton f31450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RadioButton f31451i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RadioButton f31452j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Button f31453k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f31454l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f31455m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CheckBox f31456n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CheckBox f31457o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CheckBox f31458p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f31459q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f31460r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public FrameLayout f31461s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Context f31462t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SharedPreferences f31463u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SharedPreferences f31464v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SharedPreferences.Editor f31465w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public SharedPreferences.Editor f31466x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public LiveStreamDBHandler f31467y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f31468z = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f31434A = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f31435B = "";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f31436C = "";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Thread f31445L = null;

    public class a implements DialogInterface.OnDismissListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(PlayerSettingsActivity.this.f31462t);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = w.R(PlayerSettingsActivity.this.f31462t);
                String strA = w.A(string);
                TextView textView = PlayerSettingsActivity.this.f31455m;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = PlayerSettingsActivity.this.f31454l;
                if (textView2 != null) {
                    textView2.setText(strA);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.dismiss();
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.n0(PlayerSettingsActivity.this.f31462t);
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.m0(PlayerSettingsActivity.this.f31462t);
        }
    }

    public class g implements DialogInterface.OnClickListener {
        public g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class h implements DialogInterface.OnClickListener {
        public h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
        }
    }

    public class i implements DialogInterface.OnClickListener {
        public i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class j implements DialogInterface.OnClickListener {
        public j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            TextView textView;
            String str;
            switch (i9) {
                case 0:
                    textView = PlayerSettingsActivity.this.f31460r;
                    str = "1";
                    break;
                case 1:
                    textView = PlayerSettingsActivity.this.f31460r;
                    str = "2";
                    break;
                case 2:
                    textView = PlayerSettingsActivity.this.f31460r;
                    str = "3";
                    break;
                case 3:
                    textView = PlayerSettingsActivity.this.f31460r;
                    str = "4";
                    break;
                case 4:
                    textView = PlayerSettingsActivity.this.f31460r;
                    str = "5";
                    break;
                case 5:
                    textView = PlayerSettingsActivity.this.f31460r;
                    str = "10";
                    break;
                case 6:
                    textView = PlayerSettingsActivity.this.f31460r;
                    str = "20";
                    break;
                case 7:
                    textView = PlayerSettingsActivity.this.f31460r;
                    str = "30";
                    break;
                case 8:
                    textView = PlayerSettingsActivity.this.f31460r;
                    str = "40";
                    break;
                case 9:
                    textView = PlayerSettingsActivity.this.f31460r;
                    str = "50";
                    break;
                case 10:
                    textView = PlayerSettingsActivity.this.f31460r;
                    str = "100";
                    break;
                default:
                    return;
            }
            textView.setText(str);
            dialogInterface.cancel();
        }
    }

    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    PlayerSettingsActivity.this.y1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class l implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f31480a;

        public l(View view) {
            this.f31480a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31480a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31480a, "scaleY", f9);
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
                View view4 = this.f31480a;
                if (view4 == null || view4.getTag() == null || !this.f31480a.getTag().equals("1")) {
                    View view5 = this.f31480a;
                    if (view5 == null || view5.getTag() == null || !this.f31480a.getTag().equals("2")) {
                        View view6 = this.f31480a;
                        if (view6 == null || view6.getTag() == null) {
                            return;
                        }
                        this.f31480a.setBackground(PlayerSettingsActivity.this.getResources().getDrawable(a7.e.f11931K1));
                        return;
                    }
                    a(f9);
                    b(f9);
                    view3 = this.f31480a;
                    i9 = a7.e.f12024k1;
                } else {
                    a(f9);
                    b(f9);
                    view3 = this.f31480a;
                    i9 = a7.e.f12010h;
                }
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                a(f9);
                b(f9);
                View view7 = this.f31480a;
                if ((view7 == null || view7.getTag() == null || !this.f31480a.getTag().equals("1")) && ((view2 = this.f31480a) == null || view2.getTag() == null || !this.f31480a.getTag().equals("2"))) {
                    return;
                }
                view3 = this.f31480a;
                i9 = a7.e.f12038o;
            }
            view3.setBackgroundResource(i9);
        }
    }

    private void A1() {
        RadioButton radioButton;
        this.f31462t = this;
        this.f31467y = new LiveStreamDBHandler(this.f31462t);
        this.f31437D = getSharedPreferences("pref.using_opensl_es", 0);
        this.f31439F = getSharedPreferences("pref.using_opengl", 0);
        this.f31441H = getSharedPreferences("pref.using_infbuf", 0);
        this.f31463u = getSharedPreferences("pref.using_media_codec", 0);
        SharedPreferences sharedPreferences = getSharedPreferences("pref.using_buffer_size", 0);
        this.f31464v = sharedPreferences;
        this.f31465w = sharedPreferences.edit();
        String string = this.f31437D.getString("pref.using_opensl_es", "");
        String string2 = this.f31439F.getString("pref.using_opengl", "");
        String string3 = this.f31463u.getString("pref.using_media_codec", AbstractC2237a.f44543v0);
        String string4 = this.f31441H.getString("pref.using_infbuf", "unchecked");
        int i9 = this.f31464v.getInt("pref.using_buffer_size", AbstractC2237a.f44545w0);
        if (string3.equals(getResources().getString(a7.j.f13146U3)) || string3.equals("Native")) {
            this.f31451i.setChecked(true);
            radioButton = this.f31451i;
        } else if (string3.equals(getResources().getString(a7.j.f13349p2)) || string3.equals("Hardware Decoder") || !(string3.equals(getResources().getString(a7.j.f13234d7)) || string3.equals("Software Decoder"))) {
            this.f31450h.setChecked(true);
            radioButton = this.f31450h;
        } else {
            this.f31452j.setChecked(true);
            radioButton = this.f31452j;
        }
        radioButton.requestFocus();
        if (string.equals("checked")) {
            this.f31456n.setChecked(true);
        }
        if (string2.equals("checked")) {
            this.f31457o.setChecked(true);
        }
        if (string4.equals("checked")) {
            this.f31458p.setChecked(true);
        }
        TextView textView = this.f31460r;
        if (textView != null) {
            textView.setText(String.valueOf(i9));
        }
    }

    private void x1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private void z1() {
        Button button = this.f31448f;
        if (button != null) {
            button.setOnFocusChangeListener(new l(button));
        }
        Button button2 = this.f31453k;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new l(button2));
        }
        RadioButton radioButton = this.f31451i;
        if (radioButton != null) {
            radioButton.setOnFocusChangeListener(new l(radioButton));
        }
        RadioButton radioButton2 = this.f31450h;
        if (radioButton2 != null) {
            radioButton2.setOnFocusChangeListener(new l(radioButton2));
        }
        RadioButton radioButton3 = this.f31452j;
        if (radioButton3 != null) {
            radioButton3.setOnFocusChangeListener(new l(radioButton3));
        }
        CheckBox checkBox = this.f31456n;
        if (checkBox != null) {
            checkBox.setOnFocusChangeListener(new l(checkBox));
        }
        CheckBox checkBox2 = this.f31457o;
        if (checkBox2 != null) {
            checkBox2.setOnFocusChangeListener(new l(checkBox2));
        }
        CheckBox checkBox3 = this.f31458p;
        if (checkBox3 != null) {
            checkBox3.setOnFocusChangeListener(new l(checkBox3));
        }
        FrameLayout frameLayout = this.f31461s;
        if (frameLayout != null) {
            frameLayout.setOnFocusChangeListener(new l(frameLayout));
        }
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
        if (view.getId() == a7.f.f12117D0) {
            this.f31437D = getSharedPreferences("pref.using_opensl_es", 0);
            this.f31439F = getSharedPreferences("pref.using_opengl", 0);
            this.f31441H = getSharedPreferences("pref.using_infbuf", 0);
            w1(Integer.parseInt(this.f31460r.getText().toString()));
            this.f31438E = this.f31437D.edit();
            this.f31440G = this.f31439F.edit();
            this.f31442I = this.f31441H.edit();
            if (this.f31456n.isChecked()) {
                SharedPreferences.Editor editor2 = this.f31438E;
                if (editor2 != null) {
                    editor2.putString("pref.using_opensl_es", "checked");
                }
            } else {
                SharedPreferences.Editor editor3 = this.f31438E;
                if (editor3 != null) {
                    editor3.putString("pref.using_opensl_es", "");
                }
            }
            if (this.f31457o.isChecked()) {
                SharedPreferences.Editor editor4 = this.f31440G;
                if (editor4 != null) {
                    editor4.putString("pref.using_opengl", "checked");
                }
            } else {
                SharedPreferences.Editor editor5 = this.f31440G;
                if (editor5 != null) {
                    editor5.putString("pref.using_opengl", "");
                }
            }
            if (this.f31458p.isChecked()) {
                SharedPreferences.Editor editor6 = this.f31442I;
                if (editor6 != null) {
                    editor6.putString("pref.using_infbuf", "checked");
                }
            } else {
                SharedPreferences.Editor editor7 = this.f31442I;
                if (editor7 != null) {
                    editor7.putString("pref.using_infbuf", "unchecked");
                }
            }
            this.f31438E.apply();
            this.f31440G.apply();
            this.f31442I.apply();
            int checkedRadioButtonId = this.f31449g.getCheckedRadioButtonId();
            this.f31463u = getSharedPreferences("pref.using_media_codec", 0);
            RadioButton radioButton = (RadioButton) findViewById(checkedRadioButtonId);
            String strValueOf = radioButton.getTag() != null ? String.valueOf(radioButton.getTag()) : "4";
            SharedPreferences.Editor editorEdit = this.f31463u.edit();
            this.f31466x = editorEdit;
            if (editorEdit == null) {
                Toast.makeText(this, getResources().getString(a7.j.f13292j5), 0).show();
                return;
            }
            if (strValueOf.equals("3")) {
                editor = this.f31466x;
                str = "Native";
            } else if (strValueOf.equals("4")) {
                editor = this.f31466x;
                str = "Hardware Decoder";
            } else {
                if (strValueOf.equals("5")) {
                    editor = this.f31466x;
                    str = "Software Decoder";
                }
                this.f31466x.apply();
                Toast.makeText(this, getResources().getString(a7.j.f13302k5), 0).show();
            }
            editor.putString("pref.using_media_codec", str);
            this.f31466x.apply();
            Toast.makeText(this, getResources().getString(a7.j.f13302k5), 0).show();
        } else if (view.getId() != a7.f.f12267S0) {
            if (view.getId() == a7.f.Bj) {
                startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                return;
            } else {
                if (view.getId() == a7.f.f12240P3) {
                    v1();
                    return;
                }
                return;
            }
        }
        finish();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f31462t = this;
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f31462t);
        this.f31444K = c2858a;
        setContentView(c2858a.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12859q0 : a7.g.f12853p0);
        w.Y(this);
        this.f31446d = (Toolbar) findViewById(a7.f.kh);
        this.f31447e = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f31448f = (Button) findViewById(a7.f.f12117D0);
        this.f31449g = (RadioGroup) findViewById(a7.f.Kd);
        this.f31450h = (RadioButton) findViewById(a7.f.ld);
        this.f31451i = (RadioButton) findViewById(a7.f.qd);
        this.f31452j = (RadioButton) findViewById(a7.f.sd);
        this.f31453k = (Button) findViewById(a7.f.f12267S0);
        this.f31454l = (TextView) findViewById(a7.f.f12129E2);
        this.f31455m = (TextView) findViewById(a7.f.gh);
        this.f31456n = (CheckBox) findViewById(a7.f.f12258R1);
        this.f31457o = (CheckBox) findViewById(a7.f.f12248Q1);
        this.f31458p = (CheckBox) findViewById(a7.f.f12238P1);
        this.f31459q = (ImageView) findViewById(a7.f.Xa);
        this.f31460r = (TextView) findViewById(a7.f.Oh);
        this.f31461s = (FrameLayout) findViewById(a7.f.f12240P3);
        this.f31453k.setOnClickListener(this);
        this.f31448f.setOnClickListener(this);
        z1();
        x1();
        r1((Toolbar) findViewById(a7.f.kh));
        getWindow().setFlags(1024, 1024);
        A1();
        Thread thread = this.f31445L;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new k());
            this.f31445L = thread2;
            thread2.start();
        }
        this.f31459q.setOnClickListener(new b());
        this.f31461s.setOnClickListener(this);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f31446d.x(a7.h.f12939v);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f31446d.getChildCount(); i9++) {
            if (this.f31446d.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f31446d.getChildAt(i9).getLayoutParams()).f39307a = 16;
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
        if (itemId == a7.f.f12380e && (context = this.f31462t) != null) {
            new a.C0158a(context, a7.k.f13456a).setTitle(getResources().getString(a7.j.f13250f3)).f(getResources().getString(a7.j.f13240e3)).j(getResources().getString(a7.j.f13132S8), new e()).g(getResources().getString(a7.j.f13231d4), new d()).n();
        }
        if (itemId == a7.f.fb) {
            a.C0158a c0158a = new a.C0158a(this);
            c0158a.setTitle(this.f31462t.getResources().getString(a7.j.f13397u0));
            c0158a.f(this.f31462t.getResources().getString(a7.j.f13134T0));
            c0158a.d(a7.e.f12056s1);
            c0158a.j(this.f31462t.getResources().getString(a7.j.f13132S8), new f());
            c0158a.g(this.f31462t.getResources().getString(a7.j.f13231d4), new g());
            c0158a.n();
        }
        if (itemId == a7.f.hb) {
            a.C0158a c0158a2 = new a.C0158a(this);
            c0158a2.setTitle(this.f31462t.getResources().getString(a7.j.f13397u0));
            c0158a2.f(this.f31462t.getResources().getString(a7.j.f13134T0));
            c0158a2.d(a7.e.f12056s1);
            c0158a2.j(this.f31462t.getResources().getString(a7.j.f13132S8), new h());
            c0158a2.g(this.f31462t.getResources().getString(a7.j.f13231d4), new i());
            c0158a2.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f31445L;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f31445L.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f31445L;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new k());
            this.f31445L = thread2;
            thread2.start();
        }
        w.m(this.f31462t);
        w.z0(this.f31462t);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f31463u = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f31463u.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v1() {
        /*
            r16 = this;
            r0 = r16
            r1 = 11
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r1]
            java.lang.String r2 = "1"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "2"
            r4 = 1
            r1[r4] = r2
            java.lang.String r2 = "3"
            r5 = 2
            r1[r5] = r2
            java.lang.String r2 = "4"
            r6 = 3
            r1[r6] = r2
            java.lang.String r2 = "5"
            r7 = 4
            r1[r7] = r2
            java.lang.String r2 = "10"
            r8 = 5
            r1[r8] = r2
            java.lang.String r2 = "20"
            r9 = 6
            r1[r9] = r2
            java.lang.String r2 = "30"
            r10 = 7
            r1[r10] = r2
            java.lang.String r2 = "40"
            r11 = 8
            r1[r11] = r2
            java.lang.String r2 = "50"
            r12 = 9
            r1[r12] = r2
            java.lang.String r2 = "100"
            r13 = 10
            r1[r13] = r2
            androidx.appcompat.app.a$a r2 = new androidx.appcompat.app.a$a
            r2.<init>(r0)
            android.content.res.Resources r14 = r16.getResources()
            int r15 = a7.j.f13160W
            java.lang.String r14 = r14.getString(r15)
            r2.setTitle(r14)
            android.content.SharedPreferences r14 = r0.f31464v
            java.lang.String r15 = "pref.using_buffer_size"
            int r3 = m7.AbstractC2237a.f44545w0
            int r3 = r14.getInt(r15, r3)
            if (r3 != r4) goto L60
        L5e:
            r3 = 0
            goto L94
        L60:
            if (r3 != r5) goto L64
            r3 = 1
            goto L94
        L64:
            if (r3 != r6) goto L68
            r3 = 2
            goto L94
        L68:
            if (r3 != r7) goto L6c
            r3 = 3
            goto L94
        L6c:
            if (r3 != r8) goto L70
            r3 = 4
            goto L94
        L70:
            if (r3 != r13) goto L74
            r3 = 5
            goto L94
        L74:
            r4 = 20
            if (r3 != r4) goto L7a
            r3 = 6
            goto L94
        L7a:
            r4 = 30
            if (r3 != r4) goto L80
            r3 = 7
            goto L94
        L80:
            r4 = 40
            if (r3 != r4) goto L87
            r3 = 8
            goto L94
        L87:
            r4 = 50
            if (r3 != r4) goto L8e
            r3 = 9
            goto L94
        L8e:
            r4 = 100
            if (r3 != r4) goto L5e
            r3 = 10
        L94:
            com.nst.iptvsmarterstvbox.view.activity.PlayerSettingsActivity$j r4 = new com.nst.iptvsmarterstvbox.view.activity.PlayerSettingsActivity$j
            r4.<init>()
            r2.l(r1, r3, r4)
            androidx.appcompat.app.a r1 = r2.create()
            r0.f31443J = r1
            com.nst.iptvsmarterstvbox.view.activity.PlayerSettingsActivity$a r2 = new com.nst.iptvsmarterstvbox.view.activity.PlayerSettingsActivity$a
            r2.<init>()
            r1.setOnDismissListener(r2)
            androidx.appcompat.app.a r1 = r0.f31443J
            r1.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.PlayerSettingsActivity.v1():void");
    }

    public final void w1(int i9) {
        SharedPreferences.Editor editor = this.f31465w;
        if (editor != null) {
            editor.putInt("pref.using_buffer_size", i9);
            this.f31465w.apply();
        }
    }

    public void y1() {
        runOnUiThread(new c());
    }
}
