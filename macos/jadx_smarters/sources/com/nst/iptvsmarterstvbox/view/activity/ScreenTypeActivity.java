package com.nst.iptvsmarterstvbox.view.activity;

import a7.c;
import a7.e;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.b;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class ScreenTypeActivity extends b implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RadioGroup f31585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RadioButton f31586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RadioButton f31587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f31588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f31589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f31590i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f31591j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C2858a f31592k;

    public class a implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f31593a;

        public a(View view) {
            this.f31593a = view;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            View view2;
            TextView textView;
            Resources resources;
            int i9;
            View view3;
            int i10;
            if (!z9) {
                if (z9) {
                    return;
                }
                View view4 = this.f31593a;
                if ((view4 != null && view4.getTag() != null && this.f31593a.getTag().equals("1")) || ((view2 = this.f31593a) != null && view2.getTag() != null && this.f31593a.getTag().equals("2"))) {
                    view3 = this.f31593a;
                    i10 = e.f12038o;
                    view3.setBackgroundResource(i10);
                }
                View view5 = this.f31593a;
                if (view5 == null || view5.getTag() == null || !this.f31593a.getTag().equals("3")) {
                    return;
                }
                this.f31593a.setBackgroundResource(e.f11996d1);
                ScreenTypeActivity screenTypeActivity = ScreenTypeActivity.this;
                textView = screenTypeActivity.f31588g;
                resources = screenTypeActivity.f31591j.getResources();
                i9 = c.f11855f;
                textView.setTextColor(resources.getColor(i9));
                return;
            }
            View view6 = this.f31593a;
            if (view6 == null || view6.getTag() == null || !this.f31593a.getTag().equals("1")) {
                View view7 = this.f31593a;
                if (view7 == null || view7.getTag() == null || !this.f31593a.getTag().equals("2")) {
                    View view8 = this.f31593a;
                    if (view8 == null || view8.getTag() == null || !this.f31593a.getTag().equals("3")) {
                        View view9 = this.f31593a;
                        if (view9 == null || view9.getTag() == null) {
                            return;
                        }
                        this.f31593a.setBackground(ScreenTypeActivity.this.getResources().getDrawable(e.f11931K1));
                        return;
                    }
                    this.f31593a.setBackgroundResource(e.f11992c1);
                    ScreenTypeActivity screenTypeActivity2 = ScreenTypeActivity.this;
                    textView = screenTypeActivity2.f31588g;
                    resources = screenTypeActivity2.f31591j.getResources();
                    i9 = c.f11849G;
                    textView.setTextColor(resources.getColor(i9));
                    return;
                }
                view3 = this.f31593a;
                i10 = e.f12024k1;
            } else {
                view3 = this.f31593a;
                i10 = e.f12010h;
            }
            view3.setBackgroundResource(i10);
        }
    }

    private void u1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, c.f11860k));
    }

    private void w1() {
        this.f31586e.setOnClickListener(this);
        this.f31587f.setOnClickListener(this);
        this.f31590i.setOnClickListener(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r3) {
        /*
            r2 = this;
            int r3 = r3.getId()
            int r0 = a7.f.pd
            if (r3 != r0) goto La
            goto L7a
        La:
            int r0 = a7.f.vd
            if (r3 != r0) goto Lf
            goto L7a
        Lf:
            int r0 = a7.f.Ia
            if (r3 != r0) goto L7a
            android.widget.RadioGroup r3 = r2.f31585d
            int r3 = r3.getCheckedRadioButtonId()
            android.view.View r3 = r2.findViewById(r3)
            android.widget.RadioButton r3 = (android.widget.RadioButton) r3
            java.lang.Object r0 = r3.getTag()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Mobile"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L37
            u7.a r3 = r2.f31592k
            java.lang.String r0 = m7.AbstractC2237a.f44455L0
        L33:
            r3.X(r0)
            goto L4c
        L37:
            java.lang.Object r3 = r3.getTag()
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "TV"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L4c
            u7.a r3 = r2.f31592k
            java.lang.String r0 = m7.AbstractC2237a.f44453K0
            goto L33
        L4c:
            java.lang.Boolean r3 = m7.AbstractC2237a.f44540u
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L72
            java.lang.Boolean r3 = m7.AbstractC2237a.f44542v
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L5d
            goto L72
        L5d:
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.nst.iptvsmarterstvbox.view.activity.LoginActivity> r0 = com.nst.iptvsmarterstvbox.view.activity.LoginActivity.class
            r3.<init>(r2, r0)
        L64:
            r2.startActivity(r3)
            int r3 = a7.b.f11828f
            int r0 = a7.b.f11826d
            r2.overridePendingTransition(r3, r0)
            r2.finish()
            goto L7a
        L72:
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.nst.iptvsmarterstvbox.view.activity.RoutingActivity> r0 = com.nst.iptvsmarterstvbox.view.activity.RoutingActivity.class
            r3.<init>(r2, r0)
            goto L64
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ScreenTypeActivity.onClick(android.view.View):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(3:4|(1:6)(1:8)|7)|9|(1:11)(6:13|(1:15)|20|16|17|18)|12|20|16|17|18) */
    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r5) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ScreenTypeActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        v1();
    }

    public void v1() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }
}
