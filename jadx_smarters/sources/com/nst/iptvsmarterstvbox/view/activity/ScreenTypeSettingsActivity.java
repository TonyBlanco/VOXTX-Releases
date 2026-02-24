package com.nst.iptvsmarterstvbox.view.activity;

import a7.e;
import a7.f;
import a7.g;
import a7.j;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Calendar;
import m7.AbstractC2237a;
import m7.w;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class ScreenTypeSettingsActivity extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Toolbar f31595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppBarLayout f31596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f31597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f31598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f31599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f31600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f31601j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RadioGroup f31602k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RadioButton f31603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RadioButton f31604m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Context f31605n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C2858a f31606o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Thread f31607p = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(ScreenTypeSettingsActivity.this.f31605n);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = w.R(ScreenTypeSettingsActivity.this.f31605n);
                String strA = w.A(string);
                TextView textView = ScreenTypeSettingsActivity.this.f31600i;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = ScreenTypeSettingsActivity.this.f31599h;
                if (textView2 != null) {
                    textView2.setText(strA);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    ScreenTypeSettingsActivity.this.w1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class d implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f31611a;

        public d(View view) {
            this.f31611a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31611a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31611a, "scaleY", f9);
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
                View view4 = this.f31611a;
                if (view4 == null || view4.getTag() == null || !this.f31611a.getTag().equals("1")) {
                    View view5 = this.f31611a;
                    if (view5 == null || view5.getTag() == null || !this.f31611a.getTag().equals("2")) {
                        View view6 = this.f31611a;
                        if (view6 == null || view6.getTag() == null) {
                            return;
                        }
                        this.f31611a.setBackground(ScreenTypeSettingsActivity.this.getResources().getDrawable(e.f11931K1));
                        return;
                    }
                    a(f9);
                    b(f9);
                    view3 = this.f31611a;
                    i9 = e.f12024k1;
                } else {
                    a(f9);
                    b(f9);
                    view3 = this.f31611a;
                    i9 = e.f12010h;
                }
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                a(f9);
                b(f9);
                View view7 = this.f31611a;
                if ((view7 == null || view7.getTag() == null || !this.f31611a.getTag().equals("1")) && ((view2 = this.f31611a) == null || view2.getTag() == null || !this.f31611a.getTag().equals("2"))) {
                    return;
                }
                view3 = this.f31611a;
                i9 = e.f12038o;
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
        Button button = this.f31597f;
        if (button != null) {
            button.setOnFocusChangeListener(new d(button));
            this.f31597f.requestFocus();
            this.f31597f.requestFocusFromTouch();
        }
        Button button2 = this.f31598g;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new d(button2));
        }
        RadioButton radioButton = this.f31603l;
        if (radioButton != null) {
            radioButton.setOnFocusChangeListener(new d(radioButton));
        }
        RadioButton radioButton2 = this.f31604m;
        if (radioButton2 != null) {
            radioButton2.setOnFocusChangeListener(new d(radioButton2));
        }
    }

    private void y1() {
        RadioButton radioButton;
        C2858a c2858a;
        String str;
        if (this.f31606o.A().equals("")) {
            if ((this.f31605n.getResources().getConfiguration().screenLayout & 15) == 3) {
                c2858a = this.f31606o;
                str = AbstractC2237a.f44453K0;
            } else {
                c2858a = this.f31606o;
                str = AbstractC2237a.f44455L0;
            }
            c2858a.X(str);
        }
        String strA = this.f31606o.A();
        if (strA.equals(AbstractC2237a.f44455L0)) {
            radioButton = this.f31603l;
        } else if (!strA.equals(AbstractC2237a.f44453K0)) {
            return;
        } else {
            radioButton = this.f31604m;
        }
        radioButton.setChecked(true);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C2858a c2858a;
        String str;
        int id = view.getId();
        if (id != f.f12117D0) {
            if (id == f.f12267S0) {
                finish();
                return;
            } else {
                if (id == f.Bj) {
                    startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                    overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
                    return;
                }
                return;
            }
        }
        RadioButton radioButton = (RadioButton) findViewById(this.f31602k.getCheckedRadioButtonId());
        if (!radioButton.getTag().toString().equals("Mobile")) {
            if (radioButton.getTag().toString().equals("TV")) {
                c2858a = this.f31606o;
                str = AbstractC2237a.f44453K0;
            }
            Toast.makeText(this, getResources().getString(j.f13302k5), 0).show();
        }
        c2858a = this.f31606o;
        str = AbstractC2237a.f44455L0;
        c2858a.X(str);
        Toast.makeText(this, getResources().getString(j.f13302k5), 0).show();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f31605n = this;
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f31605n);
        this.f31606o = c2858a;
        setContentView(c2858a.A().equals(AbstractC2237a.f44453K0) ? g.f12627E0 : g.f12621D0);
        w.Y(this);
        this.f31595d = (Toolbar) findViewById(f.kh);
        this.f31596e = (AppBarLayout) findViewById(f.f12303W);
        this.f31597f = (Button) findViewById(f.f12117D0);
        this.f31598g = (Button) findViewById(f.f12267S0);
        this.f31599h = (TextView) findViewById(f.f12129E2);
        this.f31600i = (TextView) findViewById(f.gh);
        this.f31601j = (ImageView) findViewById(f.Xa);
        this.f31602k = (RadioGroup) findViewById(f.Jd);
        this.f31603l = (RadioButton) findViewById(f.pd);
        this.f31604m = (RadioButton) findViewById(f.vd);
        this.f31597f.setOnClickListener(this);
        this.f31598g.setOnClickListener(this);
        x1();
        v1();
        r1((Toolbar) findViewById(f.kh));
        getWindow().setFlags(1024, 1024);
        y1();
        Thread thread = this.f31607p;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new c());
            this.f31607p = thread2;
            thread2.start();
        }
        this.f31601j.setOnClickListener(new a());
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f31607p;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f31607p.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f31607p;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new c());
            this.f31607p = thread2;
            thread2.start();
        }
        w.m(this.f31605n);
        w.z0(this.f31605n);
    }

    public void w1() {
        runOnUiThread(new b());
    }
}
