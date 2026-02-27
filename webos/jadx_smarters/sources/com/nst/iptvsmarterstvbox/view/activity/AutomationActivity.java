package com.nst.iptvsmarterstvbox.view.activity;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
public class AutomationActivity extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public androidx.appcompat.app.a f29129B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C2858a f29130C;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Toolbar f29132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppBarLayout f29133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f29134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f29135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CheckBox f29136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CheckBox f29137i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f29138j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f29139k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f29140l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public FrameLayout f29141m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f29142n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public FrameLayout f29143o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f29144p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f29145q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f29146r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SharedPreferences f29147s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SharedPreferences.Editor f29148t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SharedPreferences f29149u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SharedPreferences.Editor f29150v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LiveStreamDBHandler f29151w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f29152x = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f29153y = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f29154z = AbstractC2237a.f44439D0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f29128A = AbstractC2237a.f44447H0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Thread f29131D = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AutomationActivity.this.finish();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(AutomationActivity.this.f29146r);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i9 = Integer.parseInt(AutomationActivity.this.f29140l.getText().toString());
            int i10 = Integer.parseInt(AutomationActivity.this.f29142n.getText().toString());
            AutomationActivity.this.I1(i9);
            AutomationActivity.this.K1(i10);
            AutomationActivity automationActivity = AutomationActivity.this;
            automationActivity.f29147s = automationActivity.getSharedPreferences("automation_channels", 0);
            AutomationActivity automationActivity2 = AutomationActivity.this;
            automationActivity2.f29149u = automationActivity2.getSharedPreferences("automation_epg", 0);
            AutomationActivity automationActivity3 = AutomationActivity.this;
            automationActivity3.f29148t = automationActivity3.f29147s.edit();
            AutomationActivity automationActivity4 = AutomationActivity.this;
            automationActivity4.f29150v = automationActivity4.f29149u.edit();
            if (AutomationActivity.this.f29136h.isChecked()) {
                if (AutomationActivity.this.f29148t != null) {
                    AutomationActivity.this.f29148t.putString("automation_channels", "checked");
                }
            } else if (AutomationActivity.this.f29148t != null) {
                AutomationActivity.this.f29148t.putString("automation_channels", "unchecked");
            }
            if (AutomationActivity.this.f29137i.isChecked()) {
                if (AutomationActivity.this.f29150v != null) {
                    AutomationActivity.this.f29150v.putString("automation_epg", "checked");
                }
            } else if (AutomationActivity.this.f29150v != null) {
                AutomationActivity.this.f29150v.putString("automation_epg", "unchecked");
            }
            AutomationActivity.this.f29148t.apply();
            AutomationActivity.this.f29150v.apply();
            AutomationActivity automationActivity5 = AutomationActivity.this;
            Toast.makeText(automationActivity5, automationActivity5.getResources().getString(a7.j.f13302k5), 0).show();
            AutomationActivity.this.finish();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = w.R(AutomationActivity.this.f29146r);
                String strA = w.A(string);
                TextView textView = AutomationActivity.this.f29139k;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = AutomationActivity.this.f29138j;
                if (textView2 != null) {
                    textView2.setText(strA);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            TextView textView;
            String str;
            switch (i9) {
                case 0:
                    textView = AutomationActivity.this.f29142n;
                    str = "1";
                    break;
                case 1:
                    textView = AutomationActivity.this.f29142n;
                    str = "2";
                    break;
                case 2:
                    textView = AutomationActivity.this.f29142n;
                    str = "3";
                    break;
                case 3:
                    textView = AutomationActivity.this.f29142n;
                    str = "4";
                    break;
                case 4:
                    textView = AutomationActivity.this.f29142n;
                    str = "5";
                    break;
                case 5:
                    textView = AutomationActivity.this.f29142n;
                    str = "6";
                    break;
                case 6:
                    textView = AutomationActivity.this.f29142n;
                    str = "7";
                    break;
                default:
                    return;
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
            switch (i9) {
                case 0:
                    textView = AutomationActivity.this.f29140l;
                    str = "1";
                    break;
                case 1:
                    textView = AutomationActivity.this.f29140l;
                    str = "2";
                    break;
                case 2:
                    textView = AutomationActivity.this.f29140l;
                    str = "3";
                    break;
                case 3:
                    textView = AutomationActivity.this.f29140l;
                    str = "4";
                    break;
                case 4:
                    textView = AutomationActivity.this.f29140l;
                    str = "5";
                    break;
                case 5:
                    textView = AutomationActivity.this.f29140l;
                    str = "6";
                    break;
                case 6:
                    textView = AutomationActivity.this.f29140l;
                    str = "7";
                    break;
                default:
                    return;
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
                    AutomationActivity.this.J1();
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
        public final View f29164a;

        public j(View view) {
            this.f29164a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29164a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29164a, "scaleY", f9);
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
                View view4 = this.f29164a;
                if (view4 == null || view4.getTag() == null || !this.f29164a.getTag().equals("1")) {
                    View view5 = this.f29164a;
                    if (view5 == null || view5.getTag() == null || !this.f29164a.getTag().equals("2")) {
                        View view6 = this.f29164a;
                        if (view6 == null || view6.getTag() == null) {
                            return;
                        }
                        this.f29164a.setBackground(AutomationActivity.this.getResources().getDrawable(a7.e.f11931K1));
                        return;
                    }
                    a(f9);
                    b(f9);
                    view3 = this.f29164a;
                    i9 = a7.e.f12024k1;
                } else {
                    a(f9);
                    b(f9);
                    view3 = this.f29164a;
                    i9 = a7.e.f12010h;
                }
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                a(f9);
                b(f9);
                View view7 = this.f29164a;
                if ((view7 == null || view7.getTag() == null || !this.f29164a.getTag().equals("1")) && ((view2 = this.f29164a) == null || view2.getTag() == null || !this.f29164a.getTag().equals("2"))) {
                    return;
                }
                view3 = this.f29164a;
                i9 = a7.e.f12038o;
            }
            view3.setBackgroundResource(i9);
        }
    }

    private void H1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private void L1() {
        Button button = this.f29134f;
        if (button != null) {
            button.setOnFocusChangeListener(new j(button));
        }
        Button button2 = this.f29135g;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new j(button2));
        }
        CheckBox checkBox = this.f29136h;
        if (checkBox != null) {
            checkBox.setOnFocusChangeListener(new j(checkBox));
        }
        CheckBox checkBox2 = this.f29137i;
        if (checkBox2 != null) {
            checkBox2.setOnFocusChangeListener(new j(checkBox2));
        }
        FrameLayout frameLayout = this.f29141m;
        if (frameLayout != null) {
            frameLayout.setOnFocusChangeListener(new j(frameLayout));
        }
        FrameLayout frameLayout2 = this.f29143o;
        if (frameLayout2 != null) {
            frameLayout2.setOnFocusChangeListener(new j(frameLayout2));
        }
    }

    private void M1() {
        this.f29146r = this;
        this.f29151w = new LiveStreamDBHandler(this.f29146r);
        this.f29147s = getSharedPreferences("automation_channels", 0);
        this.f29149u = getSharedPreferences("automation_epg", 0);
        String string = this.f29147s.getString("automation_channels", "");
        this.f29154z = this.f29147s.getInt("automation_channels_days", AbstractC2237a.f44439D0);
        String string2 = this.f29149u.getString("automation_epg", "");
        this.f29128A = this.f29149u.getInt("automation_epg_days", AbstractC2237a.f44447H0);
        this.f29148t = this.f29147s.edit();
        this.f29150v = this.f29149u.edit();
        this.f29141m.setOnClickListener(this);
        this.f29143o.setOnClickListener(this);
        TextView textView = this.f29140l;
        if (textView != null) {
            textView.setText(String.valueOf(this.f29154z));
        }
        TextView textView2 = this.f29142n;
        if (textView2 != null) {
            textView2.setText(String.valueOf(this.f29128A));
        }
        if (string.equalsIgnoreCase("checked")) {
            this.f29136h.setChecked(true);
        } else if (string.equalsIgnoreCase("unchecked")) {
            this.f29136h.setChecked(false);
        } else {
            this.f29148t.putString("automation_channels", "checked");
            this.f29148t.apply();
            this.f29136h.setChecked(true);
        }
        if (!string2.equalsIgnoreCase("checked")) {
            if (string2.equalsIgnoreCase("unchecked")) {
                this.f29137i.setChecked(false);
                return;
            } else {
                this.f29150v.putString("automation_epg", "checked");
                this.f29150v.apply();
            }
        }
        this.f29137i.setChecked(true);
    }

    public final void F1() {
        int i9 = 0;
        CharSequence[] charSequenceArr = {"1", "2", "3", "4", "5", "6", "7"};
        a.C0158a c0158a = new a.C0158a(this);
        c0158a.setTitle(getResources().getString(a7.j.f13073N));
        int i10 = this.f29147s.getInt("automation_channels_days", AbstractC2237a.f44439D0);
        this.f29154z = i10;
        switch (i10) {
            case 2:
                i9 = 1;
                break;
            case 3:
                i9 = 2;
                break;
            case 4:
                i9 = 3;
                break;
            case 5:
                i9 = 4;
                break;
            case 6:
                i9 = 5;
                break;
            case 7:
                i9 = 6;
                break;
        }
        c0158a.l(charSequenceArr, i9, new g());
        androidx.appcompat.app.a aVarCreate = c0158a.create();
        this.f29129B = aVarCreate;
        aVarCreate.setOnDismissListener(new h());
        this.f29129B.show();
    }

    public final void G1() {
        int i9 = 0;
        CharSequence[] charSequenceArr = {"1", "2", "3", "4", "5", "6", "7"};
        a.C0158a c0158a = new a.C0158a(this);
        c0158a.setTitle(getResources().getString(a7.j.f13073N));
        int i10 = this.f29149u.getInt("automation_epg_days", AbstractC2237a.f44447H0);
        this.f29128A = i10;
        switch (i10) {
            case 2:
                i9 = 1;
                break;
            case 3:
                i9 = 2;
                break;
            case 4:
                i9 = 3;
                break;
            case 5:
                i9 = 4;
                break;
            case 6:
                i9 = 5;
                break;
            case 7:
                i9 = 6;
                break;
        }
        c0158a.l(charSequenceArr, i9, new e());
        androidx.appcompat.app.a aVarCreate = c0158a.create();
        this.f29129B = aVarCreate;
        aVarCreate.setOnDismissListener(new f());
        this.f29129B.show();
    }

    public final void I1(int i9) {
        SharedPreferences.Editor editor = this.f29148t;
        if (editor != null) {
            editor.putInt("automation_channels_days", i9);
            this.f29148t.apply();
        }
    }

    public void J1() {
        runOnUiThread(new d());
    }

    public final void K1(int i9) {
        SharedPreferences.Editor editor = this.f29150v;
        if (editor != null) {
            editor.putInt("automation_epg_days", i9);
            this.f29150v.apply();
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
        if (id == a7.f.Bj) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        } else if (id == a7.f.f12220N3) {
            F1();
        } else if (id == a7.f.f12230O3) {
            G1();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f29146r = this;
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f29146r);
        this.f29130C = c2858a;
        setContentView(c2858a.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12828l : a7.g.f12822k);
        w.Y(this);
        this.f29132d = (Toolbar) findViewById(a7.f.kh);
        this.f29133e = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f29134f = (Button) findViewById(a7.f.f12117D0);
        this.f29135g = (Button) findViewById(a7.f.f12267S0);
        this.f29136h = (CheckBox) findViewById(a7.f.f12228O1);
        this.f29137i = (CheckBox) findViewById(a7.f.f12218N1);
        this.f29138j = (TextView) findViewById(a7.f.f12129E2);
        this.f29139k = (TextView) findViewById(a7.f.gh);
        this.f29140l = (TextView) findViewById(a7.f.Gh);
        this.f29141m = (FrameLayout) findViewById(a7.f.f12220N3);
        this.f29142n = (TextView) findViewById(a7.f.Hh);
        this.f29143o = (FrameLayout) findViewById(a7.f.f12230O3);
        this.f29144p = (LinearLayout) findViewById(a7.f.f12368c8);
        this.f29145q = (ImageView) findViewById(a7.f.Xa);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f29146r).equals("stalker_api")) {
            this.f29144p.setVisibility(8);
        }
        L1();
        this.f29135g.setOnClickListener(new a());
        H1();
        r1((Toolbar) findViewById(a7.f.kh));
        getWindow().setFlags(1024, 1024);
        this.f29145q.setOnClickListener(new b());
        M1();
        this.f29134f.setOnClickListener(new c());
        Thread thread = this.f29131D;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new i());
            this.f29131D = thread2;
            thread2.start();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f29131D;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f29131D.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f29131D;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new i());
            this.f29131D = thread2;
            thread2.start();
        }
        w.z0(this.f29146r);
        w.m(this.f29146r);
    }

    public void onViewClicked(View view) {
        view.getId();
    }
}
