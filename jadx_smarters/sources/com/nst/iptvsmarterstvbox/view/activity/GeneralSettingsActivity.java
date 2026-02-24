package com.nst.iptvsmarterstvbox.view.activity;

import android.R;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import java.util.Calendar;
import m7.AbstractC2237a;
import m7.w;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class GeneralSettingsActivity extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public AppBarLayout f29897A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Button f29898B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Button f29899C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public TextView f29900D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public TextView f29901E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public TextView f29902F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Spinner f29903G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public EditText f29904H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ImageView f29905I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public CheckBox f29906J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public TextView f29907K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public FrameLayout f29908L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public FrameLayout f29909M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public FrameLayout f29910N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public CheckBox f29911O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public CheckBox f29912P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public CheckBox f29913Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public TextView f29914R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public TextView f29915S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public TextView f29916T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public CheckBox f29917U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public LinearLayout f29918V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public LinearLayout f29919W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public LinearLayout f29920X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public LinearLayout f29921Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ImageView f29922Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedPreferences f29923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SharedPreferences.Editor f29924e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public FrameLayout f29925e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f29926f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public TextView f29927f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SharedPreferences.Editor f29928g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Context f29929g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SharedPreferences f29930h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public androidx.appcompat.app.a f29931h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SharedPreferences.Editor f29932i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LiveStreamDBHandler f29934j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SharedPreferences f29944o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SharedPreferences f29945p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SharedPreferences.Editor f29946q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SharedPreferences.Editor f29947r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SharedPreferences.Editor f29948s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SharedPreferences f29949t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f29950u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C2858a f29951v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CheckBox f29952w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CheckBox f29953x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CheckBox f29954y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Toolbar f29955z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f29936k = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f29938l = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f29940m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f29942n = "";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public String f29933i0 = "mobile";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f29935j0 = false;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f29937k0 = AbstractC2237a.f44535r0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f29939l0 = AbstractC2237a.f44537s0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public String f29941m0 = AbstractC2237a.f44539t0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public Thread f29943n0 = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(GeneralSettingsActivity.this.f29929g0);
        }
    }

    public class b extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f29957a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f29958c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f29959d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f29960e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f29961f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public LinearLayout f29962g;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f29964a;

            public a(View view) {
                this.f29964a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f29964a;
                    if (view2 == null || view2.getTag() == null || !this.f29964a.getTag().equals("1")) {
                        View view3 = this.f29964a;
                        if (view3 == null || view3.getTag() == null || !this.f29964a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = b.this.f29962g;
                        }
                    } else {
                        linearLayout = b.this.f29961f;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f29964a;
                    if (view4 == null || view4.getTag() == null || !this.f29964a.getTag().equals("1")) {
                        View view5 = this.f29964a;
                        if (view5 == null || view5.getTag() == null || !this.f29964a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = b.this.f29962g;
                        }
                    } else {
                        linearLayout = b.this.f29961f;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        public b(Activity activity) {
            super(activity);
            this.f29957a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id == a7.f.f12544u1) {
                try {
                    w.r(GeneralSettingsActivity.this.f29929g0);
                    GeneralSettingsActivity generalSettingsActivity = GeneralSettingsActivity.this;
                    Toast.makeText(generalSettingsActivity, generalSettingsActivity.getResources().getString(a7.j.f13197a0), 0).show();
                } catch (Exception unused) {
                }
            } else if (id == a7.f.f12412h1) {
                dismiss();
            }
            dismiss();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(new C2858a(GeneralSettingsActivity.this.f29929g0).A().equals(AbstractC2237a.f44453K0) ? a7.g.f12742X1 : a7.g.f12736W1);
            this.f29958c = (TextView) findViewById(a7.f.f12544u1);
            this.f29959d = (TextView) findViewById(a7.f.f12412h1);
            this.f29961f = (LinearLayout) findViewById(a7.f.V8);
            this.f29962g = (LinearLayout) findViewById(a7.f.Ia);
            TextView textView = (TextView) findViewById(a7.f.um);
            this.f29960e = textView;
            textView.setText(GeneralSettingsActivity.this.f29929g0.getResources().getString(a7.j.U8));
            this.f29958c.setOnClickListener(this);
            this.f29959d.setOnClickListener(this);
            TextView textView2 = this.f29958c;
            textView2.setOnFocusChangeListener(new a(textView2));
            TextView textView3 = this.f29959d;
            textView3.setOnFocusChangeListener(new a(textView3));
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            TextView textView;
            String str;
            if (i9 == 0) {
                textView = GeneralSettingsActivity.this.f29914R;
                str = "10";
            } else if (i9 == 1) {
                textView = GeneralSettingsActivity.this.f29914R;
                str = "20";
            } else if (i9 == 2) {
                textView = GeneralSettingsActivity.this.f29914R;
                str = "30";
            } else if (i9 == 3) {
                textView = GeneralSettingsActivity.this.f29914R;
                str = "40";
            } else if (i9 == 4) {
                textView = GeneralSettingsActivity.this.f29914R;
                str = "50";
            } else {
                if (i9 != 5) {
                    return;
                }
                textView = GeneralSettingsActivity.this.f29914R;
                str = "100";
            }
            textView.setText(str);
            dialogInterface.cancel();
        }
    }

    public class d implements DialogInterface.OnDismissListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            TextView textView;
            String str;
            if (i9 == 0) {
                textView = GeneralSettingsActivity.this.f29915S;
                str = "5";
            } else if (i9 == 1) {
                textView = GeneralSettingsActivity.this.f29915S;
                str = "10";
            } else if (i9 == 2) {
                textView = GeneralSettingsActivity.this.f29915S;
                str = "20";
            } else if (i9 == 3) {
                textView = GeneralSettingsActivity.this.f29915S;
                str = "30";
            } else if (i9 == 4) {
                textView = GeneralSettingsActivity.this.f29915S;
                str = "40";
            } else {
                if (i9 != 5) {
                    return;
                }
                textView = GeneralSettingsActivity.this.f29915S;
                str = "50";
            }
            textView.setText(str);
            dialogInterface.cancel();
        }
    }

    public class f implements DialogInterface.OnDismissListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    public class g implements DialogInterface.OnClickListener {
        public g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            TextView textView;
            String str;
            if (i9 == 0) {
                textView = GeneralSettingsActivity.this.f29907K;
                str = "10s";
            } else if (i9 == 1) {
                textView = GeneralSettingsActivity.this.f29907K;
                str = "20s";
            } else if (i9 == 2) {
                textView = GeneralSettingsActivity.this.f29907K;
                str = "30s";
            } else if (i9 == 3) {
                textView = GeneralSettingsActivity.this.f29907K;
                str = "40s";
            } else if (i9 == 4) {
                textView = GeneralSettingsActivity.this.f29907K;
                str = "50s";
            } else {
                if (i9 != 5) {
                    return;
                }
                textView = GeneralSettingsActivity.this.f29907K;
                str = "60s";
            }
            textView.setText(str);
            dialogInterface.cancel();
        }
    }

    public class h implements DialogInterface.OnDismissListener {
        public h() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    GeneralSettingsActivity.this.A1();
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
        public final View f29973a;

        public j(View view) {
            this.f29973a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29973a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29973a, "scaleY", f9);
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
                View view4 = this.f29973a;
                if (view4 == null || view4.getTag() == null || !this.f29973a.getTag().equals("1")) {
                    View view5 = this.f29973a;
                    if (view5 == null || view5.getTag() == null || !this.f29973a.getTag().equals("2")) {
                        View view6 = this.f29973a;
                        if (view6 == null || view6.getTag() == null) {
                            return;
                        }
                        this.f29973a.setBackground(GeneralSettingsActivity.this.getResources().getDrawable(a7.e.f11931K1));
                        return;
                    }
                    a(f9);
                    b(f9);
                    view3 = this.f29973a;
                    i9 = a7.e.f12024k1;
                } else {
                    a(f9);
                    b(f9);
                    view3 = this.f29973a;
                    i9 = a7.e.f12010h;
                }
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.05f : 1.0f;
                a(f9);
                b(f9);
                View view7 = this.f29973a;
                if ((view7 == null || view7.getTag() == null || !this.f29973a.getTag().equals("1")) && ((view2 = this.f29973a) == null || view2.getTag() == null || !this.f29973a.getTag().equals("2"))) {
                    return;
                }
                view3 = this.f29973a;
                i9 = a7.e.f12038o;
            }
            view3.setBackgroundResource(i9);
        }
    }

    private void B1() {
        Button button = this.f29899C;
        if (button != null) {
            button.setOnFocusChangeListener(new j(button));
        }
        CheckBox checkBox = this.f29952w;
        if (checkBox != null) {
            checkBox.setOnFocusChangeListener(new j(checkBox));
            this.f29952w.requestFocus();
        }
        EditText editText = this.f29904H;
        if (editText != null) {
            editText.setOnFocusChangeListener(new j(editText));
        }
        CheckBox checkBox2 = this.f29953x;
        if (checkBox2 != null) {
            checkBox2.setOnFocusChangeListener(new j(checkBox2));
        }
        Spinner spinner = this.f29903G;
        if (spinner != null) {
            spinner.setOnFocusChangeListener(new j(spinner));
        }
        CheckBox checkBox3 = this.f29954y;
        if (checkBox3 != null) {
            checkBox3.setOnFocusChangeListener(new j(checkBox3));
        }
        CheckBox checkBox4 = this.f29911O;
        if (checkBox4 != null) {
            checkBox4.setOnFocusChangeListener(new j(checkBox4));
        }
        CheckBox checkBox5 = this.f29906J;
        if (checkBox5 != null) {
            checkBox5.setOnFocusChangeListener(new j(checkBox5));
        }
        FrameLayout frameLayout = this.f29908L;
        if (frameLayout != null) {
            frameLayout.setOnFocusChangeListener(new j(frameLayout));
        }
        FrameLayout frameLayout2 = this.f29909M;
        if (frameLayout2 != null) {
            frameLayout2.setOnFocusChangeListener(new j(frameLayout2));
        }
        FrameLayout frameLayout3 = this.f29910N;
        if (frameLayout3 != null) {
            frameLayout3.setOnFocusChangeListener(new j(frameLayout3));
        }
        TextView textView = this.f29916T;
        if (textView != null) {
            textView.setOnFocusChangeListener(new j(textView));
        }
        CheckBox checkBox6 = this.f29912P;
        if (checkBox6 != null) {
            checkBox6.setOnFocusChangeListener(new j(checkBox6));
        }
        CheckBox checkBox7 = this.f29913Q;
        if (checkBox7 != null) {
            checkBox7.setOnFocusChangeListener(new j(checkBox7));
        }
        CheckBox checkBox8 = this.f29917U;
        if (checkBox8 != null) {
            checkBox8.setOnFocusChangeListener(new j(checkBox8));
        }
        Button button2 = this.f29898B;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new j(button2));
        }
    }

    private void D1() {
        this.f29929g0 = this;
        this.f29934j = new LiveStreamDBHandler(this.f29929g0);
        this.f29923d = getSharedPreferences("automation_channels", 0);
        this.f29926f = getSharedPreferences("automation_epg", 0);
        this.f29930h = getSharedPreferences("user_agent", 0);
        String string = this.f29923d.getString("auto_start_on_bootup", "");
        String string2 = this.f29930h.getString("user_agent", "IPTVSmartersPlayer");
        if (string.equals("checked")) {
            this.f29952w.setChecked(true);
        }
        EditText editText = this.f29904H;
        if (editText != null) {
            editText.setText(string2);
        }
        this.f29944o = getSharedPreferences("loginPrefs", 0);
        this.f29945p = getSharedPreferences("selected_language", 0);
        this.f29944o = getSharedPreferences("loginPrefs", 0);
        String string3 = this.f29945p.getString("selected_language", "");
        this.f29950u = string3;
        if (string3.equals("English")) {
            string3 = "en";
        } else if (string3.equals("Polish")) {
            string3 = "pl";
        } else if (string3.equals("Portuguese")) {
            string3 = "pt";
        } else if (string3.equals("Turkish")) {
            string3 = "tr";
        } else if (string3.equals("Croatian")) {
            string3 = "hr";
        } else if (string3.equals("Spanish")) {
            string3 = "es";
        } else if (string3.equals("Arabic")) {
            string3 = "ar";
        } else if (string3.equals("French")) {
            string3 = "fr";
        } else if (string3.equals("German")) {
            string3 = "de";
        } else if (string3.equals("Italian")) {
            string3 = "it";
        } else if (string3.equals("Romanian")) {
            string3 = "ro";
        } else if (string3.equals("Hungary")) {
            string3 = "hu";
        } else if (string3.equals("Albanian")) {
            string3 = "sq";
        } else if (string3.equals("Korean")) {
            string3 = "ko";
        } else if (string3.equals("Hebrew")) {
            string3 = "he";
        } else if (string3.equals("Ukrainian")) {
            string3 = "uk";
        } else if (string3.equals("Malay")) {
            string3 = "ms";
        } else if (string3.equals("Dutch")) {
            string3 = "nl";
        } else if (string3.equals("Indonesian")) {
            string3 = "in";
        } else if (string3.equals("Swedish")) {
            string3 = "sv";
        }
        try {
            this.f29903G.setSelection(w.H(string3));
        } catch (Exception unused) {
        }
    }

    private void H1(String str) {
        SharedPreferences.Editor editor = this.f29948s;
        if (editor != null) {
            editor.putString("autoplay_seconds", str);
            this.f29948s.apply();
        }
    }

    private void y1() {
        ImageView imageView;
        this.f29951v = new C2858a(this.f29929g0);
        int i9 = 8;
        if (AbstractC2237a.f44526o.booleanValue() && AbstractC2237a.f44475V0.booleanValue() && (this.f29951v.k() == null || this.f29951v.n() == null || this.f29951v.l() == 0 || this.f29951v.k().equals("") || this.f29951v.n().equals(""))) {
            this.f29925e0.setOnClickListener(new View.OnClickListener() { // from class: p7.C
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f46580a.E1(view);
                }
            });
            imageView = this.f29922Z;
            i9 = 0;
        } else {
            imageView = this.f29922Z;
        }
        imageView.setVisibility(i9);
    }

    public void A1() {
        runOnUiThread(new Runnable() { // from class: p7.B
            @Override // java.lang.Runnable
            public final void run() {
                this.f46577a.F1();
            }
        });
    }

    public void C1() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    public final /* synthetic */ void E1(View view) {
        try {
            Context context = this.f29929g0;
            new w.j((Activity) context, context, this.f29951v).show();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final /* synthetic */ void F1() {
        try {
            String string = Calendar.getInstance().getTime().toString();
            String strR = w.R(this.f29929g0);
            String strA = w.A(string);
            TextView textView = this.f29902F;
            if (textView != null) {
                textView.setText(strR);
            }
            TextView textView2 = this.f29901E;
            if (textView2 != null) {
                textView2.setText(strA);
            }
        } catch (Exception unused) {
        }
    }

    public void G1() {
        AppOpsManager appOpsManager;
        this.f29929g0 = this;
        Application application = getApplication();
        this.f29929g0 = application;
        String strA = new C2858a(application).A();
        setContentView(strA.equals(AbstractC2237a.f44453K0) ? a7.g.f12662K : a7.g.f12656J);
        C1();
        this.f29952w = (CheckBox) findViewById(a7.f.f12381e0);
        this.f29953x = (CheckBox) findViewById(a7.f.f12288U2);
        this.f29954y = (CheckBox) findViewById(a7.f.Mg);
        this.f29955z = (Toolbar) findViewById(a7.f.kh);
        this.f29897A = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f29898B = (Button) findViewById(a7.f.f12117D0);
        this.f29899C = (Button) findViewById(a7.f.f12267S0);
        this.f29898B.setOnClickListener(this);
        this.f29899C.setOnClickListener(this);
        this.f29900D = (TextView) findViewById(a7.f.im);
        this.f29901E = (TextView) findViewById(a7.f.f12129E2);
        this.f29902F = (TextView) findViewById(a7.f.gh);
        this.f29903G = (Spinner) findViewById(a7.f.f12457l6);
        this.f29904H = (EditText) findViewById(a7.f.f12556v3);
        this.f29905I = (ImageView) findViewById(a7.f.Xa);
        this.f29906J = (CheckBox) findViewById(a7.f.f12391f0);
        this.f29907K = (TextView) findViewById(a7.f.Fh);
        this.f29908L = (FrameLayout) findViewById(a7.f.f12210M3);
        this.f29909M = (FrameLayout) findViewById(a7.f.f12270S3);
        this.f29910N = (FrameLayout) findViewById(a7.f.f12280T3);
        this.f29911O = (CheckBox) findViewById(a7.f.tc);
        this.f29912P = (CheckBox) findViewById(a7.f.f12360c0);
        this.f29913Q = (CheckBox) findViewById(a7.f.gg);
        this.f29914R = (TextView) findViewById(a7.f.ml);
        this.f29915S = (TextView) findViewById(a7.f.nl);
        this.f29916T = (TextView) findViewById(a7.f.f12472n0);
        this.f29917U = (CheckBox) findViewById(a7.f.f12370d0);
        this.f29918V = (LinearLayout) findViewById(a7.f.f12347a7);
        this.f29920X = (LinearLayout) findViewById(a7.f.D9);
        this.f29921Y = (LinearLayout) findViewById(a7.f.E9);
        this.f29922Z = (ImageView) findViewById(a7.f.Na);
        this.f29925e0 = (FrameLayout) findViewById(a7.f.f12260R3);
        this.f29927f0 = (TextView) findViewById(a7.f.Tl);
        this.f29919W = (LinearLayout) findViewById(a7.f.la);
        B1();
        y1();
        r1((Toolbar) findViewById(a7.f.kh));
        getWindow().setFlags(1024, 1024);
        w.w(this, findViewById(R.id.content));
        if (strA.equals(AbstractC2237a.f44453K0)) {
            this.f29933i0 = "tv";
        } else {
            this.f29933i0 = "mobile";
        }
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f29929g0).equals("m3u")) {
            this.f29918V.setVisibility(8);
            this.f29920X.setVisibility(8);
        } else {
            this.f29918V.setVisibility(0);
            this.f29920X.setVisibility(0);
        }
        SharedPreferences sharedPreferences = this.f29929g0.getSharedPreferences("auto_start", 0);
        this.f29949t = sharedPreferences;
        this.f29948s = sharedPreferences.edit();
        boolean z9 = this.f29949t.getBoolean("auto_start", true);
        boolean z10 = this.f29949t.getBoolean("full_epg", true);
        boolean z11 = this.f29949t.getBoolean("subtitle_active", true);
        boolean z12 = this.f29949t.getBoolean("autoplay", true);
        this.f29941m0 = this.f29949t.getString("autoplay_seconds", AbstractC2237a.f44539t0);
        boolean z13 = this.f29949t.getBoolean("picinpic", AbstractC2237a.f44541u0);
        this.f29937k0 = this.f29949t.getInt("recently_added_limit", AbstractC2237a.f44535r0);
        this.f29939l0 = this.f29949t.getInt("recently_watched_limit_live", AbstractC2237a.f44537s0);
        boolean z14 = this.f29949t.getBoolean("auto_clear_cache", AbstractC2237a.f44551z0);
        boolean z15 = this.f29949t.getBoolean("show_epg_in_channels_list", AbstractC2237a.f44433A0);
        boolean z16 = this.f29949t.getBoolean("auto_play_channel_in_live", AbstractC2237a.f44435B0);
        if (AbstractC2237a.f44475V0.booleanValue()) {
            this.f29927f0.setText("LOCAL STORAGE");
        } else {
            this.f29919W.setVisibility(8);
        }
        if (!this.f29933i0.equals("mobile")) {
            this.f29911O.setVisibility(8);
        } else if (Build.VERSION.SDK_INT >= 26) {
            try {
                if (getPackageManager().hasSystemFeature("android.software.picture_in_picture") && (appOpsManager = (AppOpsManager) this.f29929g0.getSystemService("appops")) != null && appOpsManager.checkOpNoThrow("android:picture_in_picture", Process.myUid(), this.f29929g0.getPackageName()) == 0) {
                    this.f29935j0 = true;
                }
            } catch (Exception unused) {
            }
        }
        if (this.f29935j0) {
            this.f29911O.setTextColor(this.f29929g0.getResources().getColor(a7.c.f11849G));
            this.f29911O.setEnabled(true);
            this.f29911O.setButtonTintList(ColorStateList.valueOf(this.f29929g0.getResources().getColor(a7.c.f11853d)));
            CheckBox checkBox = this.f29911O;
            if (z13) {
                checkBox.setChecked(true);
            } else {
                checkBox.setChecked(false);
            }
        } else {
            this.f29911O.setTextColor(this.f29929g0.getResources().getColor(a7.c.f11851b));
            this.f29911O.setEnabled(false);
            this.f29911O.setChecked(false);
            this.f29911O.setButtonTintList(ColorStateList.valueOf(this.f29929g0.getResources().getColor(a7.c.f11851b)));
        }
        TextView textView = this.f29907K;
        if (textView != null) {
            textView.setText(this.f29941m0);
        }
        CheckBox checkBox2 = this.f29954y;
        if (z11) {
            checkBox2.setChecked(true);
        } else {
            checkBox2.setChecked(false);
        }
        if (z9) {
            this.f29952w.setChecked(true);
        } else {
            this.f29952w.setChecked(false);
        }
        CheckBox checkBox3 = this.f29953x;
        if (z10) {
            checkBox3.setChecked(true);
        } else {
            checkBox3.setChecked(false);
        }
        CheckBox checkBox4 = this.f29906J;
        if (z12) {
            checkBox4.setChecked(true);
        } else {
            checkBox4.setChecked(false);
        }
        CheckBox checkBox5 = this.f29912P;
        if (z14) {
            checkBox5.setChecked(true);
        } else {
            checkBox5.setChecked(false);
        }
        CheckBox checkBox6 = this.f29913Q;
        if (z15) {
            checkBox6.setChecked(true);
        } else {
            checkBox6.setChecked(false);
        }
        CheckBox checkBox7 = this.f29917U;
        if (z16) {
            checkBox7.setChecked(true);
        } else {
            checkBox7.setChecked(false);
        }
        TextView textView2 = this.f29914R;
        if (textView2 != null) {
            textView2.setText(String.valueOf(this.f29937k0));
        }
        TextView textView3 = this.f29915S;
        if (textView3 != null) {
            textView3.setText(String.valueOf(this.f29939l0));
        }
        D1();
        Thread thread = this.f29943n0;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new i());
            this.f29943n0 = thread2;
            thread2.start();
        }
        this.f29905I.setOnClickListener(new a());
        this.f29908L.setOnClickListener(this);
        this.f29909M.setOnClickListener(this);
        this.f29910N.setOnClickListener(this);
        this.f29916T.setOnClickListener(this);
    }

    public final void I1() {
        int i9 = 0;
        CharSequence[] charSequenceArr = {"10", "20", "30", "40", "50", "100"};
        a.C0158a c0158a = new a.C0158a(this);
        c0158a.setTitle(getResources().getString(a7.j.f13139T5));
        int i10 = this.f29949t.getInt("recently_added_limit", AbstractC2237a.f44535r0);
        this.f29937k0 = i10;
        if (i10 != 10) {
            if (i10 == 20) {
                i9 = 1;
            } else if (i10 == 30) {
                i9 = 2;
            } else if (i10 == 40) {
                i9 = 3;
            } else if (i10 == 50) {
                i9 = 4;
            } else if (i10 == 100) {
                i9 = 5;
            }
        }
        c0158a.l(charSequenceArr, i9, new c());
        androidx.appcompat.app.a aVarCreate = c0158a.create();
        this.f29931h0 = aVarCreate;
        aVarCreate.setOnDismissListener(new d());
        this.f29931h0.show();
    }

    public final void J1(int i9) {
        SharedPreferences.Editor editor = this.f29948s;
        if (editor != null) {
            editor.putInt("recently_added_limit", i9);
            this.f29948s.apply();
        }
    }

    public final void K1() {
        int i9 = 0;
        CharSequence[] charSequenceArr = {"5", "10", "20", "30", "40", "50"};
        a.C0158a c0158a = new a.C0158a(this);
        c0158a.setTitle(getResources().getString(a7.j.f13157V5));
        int i10 = this.f29949t.getInt("recently_watched_limit_live", AbstractC2237a.f44537s0);
        this.f29939l0 = i10;
        if (i10 != 5) {
            if (i10 == 10) {
                i9 = 1;
            } else if (i10 == 20) {
                i9 = 2;
            } else if (i10 == 30) {
                i9 = 3;
            } else if (i10 == 40) {
                i9 = 4;
            } else if (i10 == 50) {
                i9 = 5;
            }
        }
        c0158a.l(charSequenceArr, i9, new e());
        androidx.appcompat.app.a aVarCreate = c0158a.create();
        this.f29931h0 = aVarCreate;
        aVarCreate.setOnDismissListener(new f());
        this.f29931h0.show();
    }

    public final void L1(int i9) {
        SharedPreferences.Editor editor = this.f29948s;
        if (editor != null) {
            editor.putInt("recently_watched_limit_live", i9);
            this.f29948s.apply();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String strValueOf;
        Resources resources;
        int i9;
        int id = view.getId();
        if (id == a7.f.Bj) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
            return;
        }
        if (id == a7.f.f12210M3) {
            x1();
            return;
        }
        if (id == a7.f.f12270S3) {
            I1();
            return;
        }
        if (id == a7.f.f12280T3) {
            K1();
            return;
        }
        if (id == a7.f.f12472n0) {
            z1();
            return;
        }
        if (id != a7.f.f12117D0) {
            if (id == a7.f.f12267S0) {
                onBackPressed();
                return;
            }
            return;
        }
        this.f29923d = getSharedPreferences("automation_channels", 0);
        this.f29926f = getSharedPreferences("auto_start_on_bootup", 0);
        this.f29924e = this.f29923d.edit();
        this.f29932i = this.f29930h.edit();
        this.f29928g = this.f29926f.edit();
        if (this.f29952w.isChecked()) {
            SharedPreferences.Editor editor = this.f29948s;
            if (editor != null) {
                editor.putBoolean("auto_start", true);
            }
        } else {
            SharedPreferences.Editor editor2 = this.f29948s;
            if (editor2 != null) {
                editor2.putBoolean("auto_start", false);
            }
        }
        H1(this.f29907K.getText().toString());
        J1(Integer.parseInt(this.f29914R.getText().toString()));
        L1(Integer.parseInt(this.f29915S.getText().toString()));
        if (this.f29953x.isChecked()) {
            SharedPreferences.Editor editor3 = this.f29948s;
            if (editor3 != null) {
                editor3.putBoolean("full_epg", true);
            }
        } else {
            SharedPreferences.Editor editor4 = this.f29948s;
            if (editor4 != null) {
                editor4.putBoolean("full_epg", false);
            }
        }
        if (this.f29954y.isChecked()) {
            SharedPreferences.Editor editor5 = this.f29948s;
            if (editor5 != null) {
                editor5.putBoolean("subtitle_active", true);
            }
        } else {
            SharedPreferences.Editor editor6 = this.f29948s;
            if (editor6 != null) {
                editor6.putBoolean("subtitle_active", false);
            }
        }
        if (this.f29906J.isChecked()) {
            SharedPreferences.Editor editor7 = this.f29948s;
            if (editor7 != null) {
                editor7.putBoolean("autoplay", true);
            }
        } else {
            SharedPreferences.Editor editor8 = this.f29948s;
            if (editor8 != null) {
                editor8.putBoolean("autoplay", false);
            }
        }
        if (this.f29911O.isChecked()) {
            SharedPreferences.Editor editor9 = this.f29948s;
            if (editor9 != null) {
                editor9.putBoolean("picinpic", true);
            }
        } else {
            SharedPreferences.Editor editor10 = this.f29948s;
            if (editor10 != null) {
                editor10.putBoolean("picinpic", false);
            }
        }
        if (this.f29912P.isChecked()) {
            SharedPreferences.Editor editor11 = this.f29948s;
            if (editor11 != null) {
                editor11.putBoolean("auto_clear_cache", true);
            }
        } else {
            SharedPreferences.Editor editor12 = this.f29948s;
            if (editor12 != null) {
                editor12.putBoolean("auto_clear_cache", false);
            }
        }
        if (this.f29913Q.isChecked()) {
            SharedPreferences.Editor editor13 = this.f29948s;
            if (editor13 != null) {
                editor13.putBoolean("show_epg_in_channels_list", true);
            }
        } else {
            SharedPreferences.Editor editor14 = this.f29948s;
            if (editor14 != null) {
                editor14.putBoolean("show_epg_in_channels_list", false);
            }
        }
        if (this.f29917U.isChecked()) {
            SharedPreferences.Editor editor15 = this.f29948s;
            if (editor15 != null) {
                editor15.putBoolean("auto_play_channel_in_live", true);
            }
        } else {
            SharedPreferences.Editor editor16 = this.f29948s;
            if (editor16 != null) {
                editor16.putBoolean("auto_play_channel_in_live", false);
            }
        }
        if (this.f29904H.getText().toString().equals("")) {
            SharedPreferences.Editor editor17 = this.f29932i;
            if (editor17 != null) {
                editor17.putString("user_agent", "IPTVSmartersPlayer");
            }
        } else {
            SharedPreferences.Editor editor18 = this.f29932i;
            if (editor18 != null) {
                editor18.putString("user_agent", this.f29904H.getText().toString());
            }
        }
        this.f29946q = this.f29944o.edit();
        SharedPreferences.Editor editorEdit = this.f29945p.edit();
        this.f29947r = editorEdit;
        if (editorEdit != null) {
            this.f29903G.getSelectedItemPosition();
            strValueOf = String.valueOf(this.f29903G.getSelectedItem());
            this.f29947r.putString("selected_language", String.valueOf(this.f29903G.getSelectedItem()));
            SharepreferenceDBHandler.setSelectedLanguage(String.valueOf(this.f29903G.getSelectedItem()), this.f29929g0);
            this.f29947r.commit();
            w.J0(this.f29929g0, strValueOf);
        } else {
            strValueOf = "";
        }
        this.f29948s.apply();
        this.f29924e.apply();
        this.f29928g.apply();
        this.f29932i.apply();
        if (this.f29904H.getText().toString().equals("")) {
            this.f29904H.setText("IPTVSmartersPlayer");
            resources = getResources();
            i9 = a7.j.f13372r5;
        } else if (this.f29950u.equalsIgnoreCase(strValueOf)) {
            resources = getResources();
            i9 = a7.j.f13302k5;
        } else {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            resources = getResources();
            i9 = a7.j.f13213b6;
        }
        Toast.makeText(this, resources.getString(i9), 0).show();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        G1();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f29943n0;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f29943n0.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f29943n0;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new i());
            this.f29943n0 = thread2;
            thread2.start();
        }
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        w.m(this.f29929g0);
        w.z0(this.f29929g0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void x1() {
        int i9;
        CharSequence[] charSequenceArr = {"10s", "20s", "30s", "40s", "50s", "60s"};
        a.C0158a c0158a = new a.C0158a(this);
        c0158a.setTitle(getResources().getString(a7.j.f13063M));
        String string = this.f29949t.getString("autoplay_seconds", AbstractC2237a.f44539t0);
        this.f29941m0 = string;
        string.hashCode();
        byte b9 = -1;
        switch (string.hashCode()) {
            case 48692:
                if (string.equals("10s")) {
                    b9 = 0;
                }
                break;
            case 49653:
                if (string.equals("20s")) {
                    b9 = 1;
                }
                break;
            case 50614:
                if (string.equals("30s")) {
                    b9 = 2;
                }
                break;
            case 51575:
                if (string.equals("40s")) {
                    b9 = 3;
                }
                break;
            case 52536:
                if (string.equals("50s")) {
                    b9 = 4;
                }
                break;
            case 53497:
                if (string.equals("60s")) {
                    b9 = 5;
                }
                break;
        }
        switch (b9) {
            case 0:
            default:
                i9 = 0;
                break;
            case 1:
                i9 = 1;
                break;
            case 2:
                i9 = 2;
                break;
            case 3:
                i9 = 3;
                break;
            case 4:
                i9 = 4;
                break;
            case 5:
                i9 = 5;
                break;
        }
        c0158a.l(charSequenceArr, i9, new g());
        androidx.appcompat.app.a aVarCreate = c0158a.create();
        this.f29931h0 = aVarCreate;
        aVarCreate.setOnDismissListener(new h());
        this.f29931h0.show();
    }

    public final void z1() {
        new b(this).show();
    }
}
