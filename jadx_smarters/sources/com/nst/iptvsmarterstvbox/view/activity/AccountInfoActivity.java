package com.nst.iptvsmarterstvbox.view.activity;

import android.R;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.ServicesDashboardActivity;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.interfaces.ApiService;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.interfaces.ApiclientRetrofit;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.modelclassess.LoginWHMCSModelClass;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import java.util.Calendar;
import m7.AbstractC2237a;
import m7.w;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class AccountInfoActivity extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static C2858a f28975B;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Toolbar f28977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppBarLayout f28978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f28979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f28980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f28981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f28982i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f28983j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f28984k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f28985l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Button f28986m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Button f28987n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f28988o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f28989p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Button f28990q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f28991r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ImageView f28992s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f28993t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Context f28994u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ProgressDialog f28995v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SharedPreferences f28996w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public LiveStreamDBHandler f28997x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f28998y = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f28999z = "";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Thread f28976A = null;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.m0(AccountInfoActivity.this.f28994u);
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(AccountInfoActivity.this.f28994u);
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountInfoActivity.this.onBackPressed();
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountInfoActivity.this.onBackPressed();
        }
    }

    public class h implements View.OnClickListener {

        public class a implements DialogInterface.OnClickListener {
            public a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i9) {
                dialogInterface.dismiss();
            }
        }

        public class b implements DialogInterface.OnClickListener {
            public b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i9) {
                w.n0(AccountInfoActivity.this.f28994u);
            }
        }

        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new a.C0158a(AccountInfoActivity.this, a7.k.f13456a).setTitle(AccountInfoActivity.this.getResources().getString(a7.j.f13250f3)).f(AccountInfoActivity.this.getResources().getString(a7.j.f13240e3)).j(AccountInfoActivity.this.getResources().getString(a7.j.f13132S8), new b()).g(AccountInfoActivity.this.getResources().getString(a7.j.f13231d4), new a()).n();
        }
    }

    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountInfoActivity.this.u1();
        }
    }

    public class j implements Callback {
        public j() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            w.X();
            Toast.makeText(AccountInfoActivity.this.f28994u, "error", 0).show();
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Toast toastMakeText;
            Context context;
            String str;
            w.X();
            if (response.isSuccessful()) {
                if (response.body() == null || !((LoginWHMCSModelClass) response.body()).c().equalsIgnoreCase("success")) {
                    context = AccountInfoActivity.this.f28994u;
                    str = "" + ((LoginWHMCSModelClass) response.body()).b();
                } else {
                    ClientSharepreferenceHandler.f(((LoginWHMCSModelClass) response.body()).a().a().intValue(), AccountInfoActivity.this.f28994u);
                    ClientSharepreferenceHandler.i(((LoginWHMCSModelClass) response.body()).a().b(), AccountInfoActivity.this.f28994u);
                    ClientSharepreferenceHandler.j(((LoginWHMCSModelClass) response.body()).a().d(), AccountInfoActivity.this.f28994u);
                    ClientSharepreferenceHandler.k(((LoginWHMCSModelClass) response.body()).a().e(), AccountInfoActivity.this.f28994u);
                    AccountInfoActivity.this.startActivity(new Intent(AccountInfoActivity.this, (Class<?>) ServicesDashboardActivity.class));
                    context = AccountInfoActivity.this.f28994u;
                    str = "successfully Login";
                }
                toastMakeText = Toast.makeText(context, str, 0);
            } else {
                toastMakeText = Toast.makeText(AccountInfoActivity.this.f28994u, "", 0);
            }
            toastMakeText.show();
        }
    }

    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = w.R(AccountInfoActivity.this.f28994u);
                String strA = w.A(string);
                TextView textView = AccountInfoActivity.this.f28989p;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = AccountInfoActivity.this.f28988o;
                if (textView2 != null) {
                    textView2.setText(strA);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class l implements DialogInterface.OnClickListener {
        public l() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.dismiss();
        }
    }

    public class m implements DialogInterface.OnClickListener {
        public m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.n0(AccountInfoActivity.this.f28994u);
        }
    }

    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    AccountInfoActivity.this.y1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class o implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f29016a;

        public o(View view) {
            this.f29016a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29016a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29016a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            View view2;
            int i9;
            if (z9) {
                f9 = z9 ? 1.05f : 1.0f;
                a(f9);
                b(f9);
                Log.e("id is", "" + this.f29016a.getTag());
                if (this.f29016a.getTag().equals("1")) {
                    view2 = this.f29016a;
                    i9 = a7.e.f12010h;
                } else {
                    if (!this.f29016a.getTag().equals("2")) {
                        return;
                    }
                    view2 = this.f29016a;
                    i9 = a7.e.f12024k1;
                }
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                a(f9);
                b(f9);
                if (!this.f29016a.getTag().equals("1") && !this.f29016a.getTag().equals("2")) {
                    return;
                }
                view2 = this.f29016a;
                i9 = a7.e.f12038o;
            }
            view2.setBackgroundResource(i9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A1() {
        /*
            Method dump skipped, instruction units count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.AccountInfoActivity.A1():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u1() {
        w.M0(this);
        ((ApiService) ApiclientRetrofit.a().create(ApiService.class)).f("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "validateCustomLogin", "yes", SharepreferenceDBHandler.getUserName(this.f28994u), SharepreferenceDBHandler.getUserPassword(this.f28994u)).enqueue(new j());
    }

    private void x1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private void z1() {
        Button button = this.f28986m;
        if (button != null) {
            button.setOnFocusChangeListener(new o(button));
            this.f28986m.requestFocus();
            this.f28986m.requestFocusFromTouch();
        }
        Button button2 = this.f28987n;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new o(button2));
        }
    }

    public void b() {
        ProgressDialog progressDialog = this.f28995v;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
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
        this.f28994u = this;
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f28994u);
        f28975B = c2858a;
        setContentView(c2858a.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12765b : a7.g.f12758a);
        w.Y(this);
        this.f28977d = (Toolbar) findViewById(a7.f.kh);
        this.f28978e = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f28979f = (TextView) findViewById(a7.f.oj);
        this.f28980g = (TextView) findViewById(a7.f.Jj);
        this.f28981h = (TextView) findViewById(a7.f.uh);
        this.f28982i = (TextView) findViewById(a7.f.qi);
        this.f28983j = (TextView) findViewById(a7.f.ak);
        this.f28984k = (TextView) findViewById(a7.f.jm);
        this.f28985l = (TextView) findViewById(a7.f.Rl);
        this.f28986m = (Button) findViewById(a7.f.f12257R0);
        this.f28987n = (Button) findViewById(a7.f.Ya);
        this.f28988o = (TextView) findViewById(a7.f.f12129E2);
        this.f28989p = (TextView) findViewById(a7.f.gh);
        this.f28990q = (Button) findViewById(a7.f.f12277T0);
        this.f28991r = (TextView) findViewById(a7.f.km);
        this.f28992s = (ImageView) findViewById(a7.f.Xa);
        this.f28993t = (ImageView) findViewById(a7.f.f12141F4);
        x1();
        z1();
        r1((Toolbar) findViewById(a7.f.kh));
        getWindow().setFlags(1024, 1024);
        A1();
        Thread thread = this.f28976A;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new n());
            this.f28976A = thread2;
            thread2.start();
        }
        this.f28992s.setOnClickListener(new e());
        this.f28986m.setOnClickListener(new f());
        this.f28993t.setOnClickListener(new g());
        this.f28987n.setOnClickListener(new h());
        Button button = this.f28990q;
        button.setOnFocusChangeListener(new w.k((View) button, (Activity) this));
        this.f28990q.setOnClickListener(new i());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f28977d.x(a7.h.f12939v);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f28977d.getChildCount(); i9++) {
            if (this.f28977d.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f28977d.getChildAt(i9).getLayoutParams()).f39307a = 16;
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
        if (itemId == a7.f.f12380e && (context = this.f28994u) != null) {
            new a.C0158a(context, a7.k.f13456a).setTitle(getResources().getString(a7.j.f13250f3)).f(getResources().getString(a7.j.f13240e3)).j(getResources().getString(a7.j.f13132S8), new m()).g(getResources().getString(a7.j.f13231d4), new l()).n();
        }
        if (itemId == a7.f.fb) {
            a.C0158a c0158a = new a.C0158a(this);
            c0158a.setTitle(this.f28994u.getResources().getString(a7.j.f13397u0));
            c0158a.f(this.f28994u.getResources().getString(a7.j.f13134T0));
            c0158a.d(a7.e.f12056s1);
            c0158a.j(this.f28994u.getResources().getString(a7.j.f13132S8), new a());
            c0158a.g(this.f28994u.getResources().getString(a7.j.f13231d4), new b());
            c0158a.n();
        }
        if (itemId == a7.f.hb) {
            a.C0158a c0158a2 = new a.C0158a(this);
            c0158a2.setTitle(this.f28994u.getResources().getString(a7.j.f13397u0));
            c0158a2.f(this.f28994u.getResources().getString(a7.j.f13134T0));
            c0158a2.d(a7.e.f12056s1);
            c0158a2.j(this.f28994u.getResources().getString(a7.j.f13132S8), new c());
            c0158a2.g(this.f28994u.getResources().getString(a7.j.f13231d4), new d());
            c0158a2.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f28976A;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f28976A.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f28976A;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new n());
            this.f28976A = thread2;
            thread2.start();
        }
        w.m(this.f28994u);
        w.z0(this.f28994u);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f28996w = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f28996w.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        } else if (this.f28994u != null) {
            b();
        }
    }

    public void y1() {
        runOnUiThread(new k());
    }
}
