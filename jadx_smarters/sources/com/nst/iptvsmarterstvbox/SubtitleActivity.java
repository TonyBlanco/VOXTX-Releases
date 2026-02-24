package com.nst.iptvsmarterstvbox;

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
import android.widget.ToggleButton;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.LoginActivity;
import com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity;
import com.nst.iptvsmarterstvbox.view.activity.SettingsActivity;
import java.util.Calendar;
import m7.AbstractC2237a;
import m7.w;
import org.apache.http.client.config.CookieSpecs;
import u7.C2858a;

/* JADX INFO: loaded from: classes3.dex */
public class SubtitleActivity extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Toolbar f28071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppBarLayout f28072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f28073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f28074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RadioGroup f28075h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RadioButton f28076i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ToggleButton f28077j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RadioButton f28078k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RadioButton f28079l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f28080m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f28081n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f28082o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Context f28084q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SharedPreferences f28085r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SharedPreferences.Editor f28086s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LiveStreamDBHandler f28087t;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C2858a f28092y;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f28083p = "";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f28088u = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f28089v = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f28090w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f28091x = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Thread f28093z = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(SubtitleActivity.this.f28084q);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = w.R(SubtitleActivity.this.f28084q);
                String strA = w.A(string);
                TextView textView = SubtitleActivity.this.f28081n;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = SubtitleActivity.this.f28080m;
                if (textView2 != null) {
                    textView2.setText(strA);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class c implements RadioGroup.OnCheckedChangeListener {
        public c() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i9) {
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
            w.n0(SubtitleActivity.this.f28084q);
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.m0(SubtitleActivity.this.f28084q);
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

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    SubtitleActivity.this.w1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class k implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f28104a;

        public k(View view) {
            this.f28104a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28104a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28104a, "scaleY", f9);
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
                View view4 = this.f28104a;
                if (view4 == null || view4.getTag() == null || !this.f28104a.getTag().equals("1")) {
                    View view5 = this.f28104a;
                    if (view5 == null || view5.getTag() == null || !this.f28104a.getTag().equals("2")) {
                        View view6 = this.f28104a;
                        if (view6 == null || view6.getTag() == null) {
                            return;
                        }
                        this.f28104a.setBackground(SubtitleActivity.this.getResources().getDrawable(a7.e.f11931K1));
                        return;
                    }
                    a(f9);
                    b(f9);
                    view3 = this.f28104a;
                    i9 = a7.e.f12024k1;
                } else {
                    a(f9);
                    b(f9);
                    view3 = this.f28104a;
                    i9 = a7.e.f12010h;
                }
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                a(f9);
                b(f9);
                View view7 = this.f28104a;
                if ((view7 == null || view7.getTag() == null || !this.f28104a.getTag().equals("1")) && ((view2 = this.f28104a) == null || view2.getTag() == null || !this.f28104a.getTag().equals("2"))) {
                    return;
                }
                view3 = this.f28104a;
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
        Button button = this.f28073f;
        if (button != null) {
            button.setOnFocusChangeListener(new k(button));
            this.f28073f.requestFocus();
            this.f28073f.requestFocusFromTouch();
        }
        Button button2 = this.f28074g;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new k(button2));
        }
        RadioButton radioButton = this.f28076i;
        if (radioButton != null) {
            radioButton.setOnFocusChangeListener(new k(radioButton));
        }
        RadioButton radioButton2 = this.f28078k;
        if (radioButton2 != null) {
            radioButton2.setOnFocusChangeListener(new k(radioButton2));
        }
        RadioButton radioButton3 = this.f28079l;
        if (radioButton3 != null) {
            radioButton3.setOnFocusChangeListener(new k(radioButton3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void y1() {
        /*
            r5 = this;
            r5.f28084q = r5
            com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler r0 = new com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler
            android.content.Context r1 = r5.f28084q
            r0.<init>(r1)
            r5.f28087t = r0
            java.lang.String r0 = "allowedFormatsubtitle"
            r1 = 0
            android.content.SharedPreferences r2 = r5.getSharedPreferences(r0, r1)
            r5.f28085r = r2
            java.lang.String r3 = ""
            java.lang.String r0 = r2.getString(r0, r3)
            android.content.SharedPreferences r2 = r5.f28085r
            java.lang.String r4 = "opensubtitle"
            java.lang.String r2 = r2.getString(r4, r3)
            java.lang.String r3 = "enabledsubtitle"
            boolean r2 = r2.equals(r3)
            r3 = 1
            if (r2 == 0) goto L3f
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            m7.AbstractC2237a.f44499f = r2
            android.widget.RadioButton r2 = r5.f28076i
            r2.setVisibility(r1)
            android.widget.RadioButton r2 = r5.f28078k
            r2.setVisibility(r1)
            android.widget.ToggleButton r1 = r5.f28077j
            r1.setChecked(r3)
            goto L54
        L3f:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            m7.AbstractC2237a.f44499f = r2
            android.widget.RadioButton r2 = r5.f28076i
            r4 = 8
            r2.setVisibility(r4)
            android.widget.RadioButton r2 = r5.f28078k
            r2.setVisibility(r4)
            android.widget.ToggleButton r2 = r5.f28077j
            r2.setChecked(r1)
        L54:
            java.lang.String r1 = "default"
            boolean r2 = r0.equals(r1)
            java.lang.String r4 = "vip"
            if (r2 == 0) goto L88
            boolean r2 = r0.equals(r4)
            if (r2 == 0) goto L88
            android.widget.ToggleButton r2 = r5.f28077j
            r2.setChecked(r3)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L7a
        L6f:
            android.widget.RadioButton r0 = r5.f28076i
            r0.setChecked(r3)
            android.widget.RadioButton r0 = r5.f28076i
        L76:
            r0.requestFocus()
            goto La7
        L7a:
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L6f
        L80:
            android.widget.RadioButton r0 = r5.f28078k
            r0.setChecked(r3)
            android.widget.RadioButton r0 = r5.f28078k
            goto L76
        L88:
            boolean r2 = r0.equals(r1)
            if (r2 != 0) goto L94
            boolean r2 = r0.equals(r4)
            if (r2 == 0) goto La7
        L94:
            android.widget.ToggleButton r2 = r5.f28077j
            r2.setChecked(r3)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto La0
            goto L6f
        La0:
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L6f
            goto L80
        La7:
            android.widget.RadioGroup r0 = r5.f28075h
            com.nst.iptvsmarterstvbox.SubtitleActivity$c r1 = new com.nst.iptvsmarterstvbox.SubtitleActivity$c
            r1.<init>()
            r0.setOnCheckedChangeListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.SubtitleActivity.y1():void");
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
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
            return;
        }
        if (view.getId() == a7.f.f12117D0) {
            RadioButton radioButton = (RadioButton) findViewById(this.f28075h.getCheckedRadioButtonId());
            SharedPreferences sharedPreferences = getSharedPreferences("allowedFormatsubtitle", 0);
            this.f28085r = sharedPreferences;
            this.f28086s = sharedPreferences.edit();
            if (this.f28083p.equals("true")) {
                AbstractC2237a.f44499f = Boolean.TRUE;
                this.f28086s.putString("opensubtitle", "enabledsubtitle");
            } else {
                AbstractC2237a.f44499f = Boolean.FALSE;
                this.f28086s.putString("opensubtitle", "disabledsubtitle");
            }
            if (this.f28086s == null) {
                Toast.makeText(this, getResources().getString(a7.j.f13292j5), 0).show();
                return;
            }
            if (radioButton.getText().toString().equals("VIP Server")) {
                AbstractC2237a.f44499f = Boolean.TRUE;
                this.f28086s.putString("opensubtitle", "enabledsubtitle");
                editor = this.f28086s;
                str = "vip";
            } else if (radioButton.getText().toString().equals("DEFAULT SERVER")) {
                AbstractC2237a.f44499f = Boolean.TRUE;
                this.f28086s.putString("opensubtitle", "enabledsubtitle");
                editor = this.f28086s;
                str = CookieSpecs.DEFAULT;
            } else {
                this.f28086s.putString("opensubtitle", "disabledsubtitle");
                AbstractC2237a.f44499f = Boolean.FALSE;
                this.f28086s.commit();
                Toast.makeText(this, getResources().getString(a7.j.f13302k5), 0).show();
            }
            editor.putString("allowedFormatsubtitle", str);
            this.f28086s.commit();
            Toast.makeText(this, getResources().getString(a7.j.f13302k5), 0).show();
        } else if (view.getId() != a7.f.f12267S0) {
            return;
        }
        finish();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f28084q = this;
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f28084q);
        this.f28092y = c2858a;
        setContentView(c2858a.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12781d1 : a7.g.f12788e1);
        this.f28071d = (Toolbar) findViewById(a7.f.kh);
        this.f28072e = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f28073f = (Button) findViewById(a7.f.f12117D0);
        this.f28074g = (Button) findViewById(a7.f.f12267S0);
        this.f28075h = (RadioGroup) findViewById(a7.f.Kd);
        this.f28076i = (RadioButton) findViewById(a7.f.od);
        this.f28077j = (ToggleButton) findViewById(a7.f.jh);
        this.f28078k = (RadioButton) findViewById(a7.f.ud);
        this.f28079l = (RadioButton) findViewById(a7.f.id);
        this.f28080m = (TextView) findViewById(a7.f.f12129E2);
        this.f28081n = (TextView) findViewById(a7.f.gh);
        this.f28082o = (ImageView) findViewById(a7.f.Xa);
        x1();
        this.f28073f.setOnClickListener(this);
        this.f28074g.setOnClickListener(this);
        v1();
        r1((Toolbar) findViewById(a7.f.kh));
        getWindow().setFlags(1024, 1024);
        y1();
        Thread thread = this.f28093z;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new j());
            this.f28093z = thread2;
            thread2.start();
        }
        this.f28082o.setOnClickListener(new a());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f28071d.x(a7.h.f12939v);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f28071d.getChildCount(); i9++) {
            if (this.f28071d.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f28071d.getChildAt(i9).getLayoutParams()).f39307a = 16;
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
        if (itemId == a7.f.f12380e && (context = this.f28084q) != null) {
            new a.C0158a(context, a7.k.f13456a).setTitle(getResources().getString(a7.j.f13250f3)).f(getResources().getString(a7.j.f13240e3)).j(getResources().getString(a7.j.f13132S8), new e()).g(getResources().getString(a7.j.f13231d4), new d()).n();
        }
        if (itemId == a7.f.fb) {
            a.C0158a c0158a = new a.C0158a(this);
            c0158a.setTitle(this.f28084q.getResources().getString(a7.j.f13397u0));
            c0158a.f(this.f28084q.getResources().getString(a7.j.f13134T0));
            c0158a.d(a7.e.f12056s1);
            c0158a.j(this.f28084q.getResources().getString(a7.j.f13132S8), new f());
            c0158a.g(this.f28084q.getResources().getString(a7.j.f13231d4), new g());
            c0158a.n();
        }
        if (itemId == a7.f.hb) {
            a.C0158a c0158a2 = new a.C0158a(this);
            c0158a2.setTitle(this.f28084q.getResources().getString(a7.j.f13397u0));
            c0158a2.f(this.f28084q.getResources().getString(a7.j.f13134T0));
            c0158a2.d(a7.e.f12056s1);
            c0158a2.j(this.f28084q.getResources().getString(a7.j.f13132S8), new h());
            c0158a2.g(this.f28084q.getResources().getString(a7.j.f13231d4), new i());
            c0158a2.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f28093z;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f28093z.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f28093z;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new j());
            this.f28093z = thread2;
            thread2.start();
        }
        w.m(this.f28084q);
        w.z0(this.f28084q);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f28085r = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f28085r.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        }
    }

    public void onToggleClick(View view) {
        if (this.f28077j.isChecked()) {
            this.f28076i.setVisibility(0);
            this.f28078k.setVisibility(0);
            this.f28083p = "true";
        } else {
            this.f28083p = "false";
            this.f28076i.setVisibility(8);
            this.f28078k.setVisibility(8);
        }
    }

    public void w1() {
        runOnUiThread(new b());
    }
}
