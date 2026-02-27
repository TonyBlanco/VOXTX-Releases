package com.nst.iptvsmarterstvbox.view.activity;

import android.R;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.model.callback.SearchTMDBMoviesCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBCastsCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBGenreCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBPersonInfoCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBTrailerCallback;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.squareup.picasso.C;
import com.squareup.picasso.t;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import m7.AbstractC2237a;
import m7.w;
import o2.AbstractC2312g;
import q7.M;
import u7.C2858a;
import w7.C2937a;
import w7.C2940d;
import z7.k;

/* JADX INFO: loaded from: classes4.dex */
public class ViewDetailsCastActivity extends androidx.appcompat.app.b implements View.OnClickListener, k {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static String f33031f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static String f33032g0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public RelativeLayout f33033A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ProgressDialog f33035C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public SharedPreferences f33036D;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public DateFormat f33039G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public MenuItem f33040H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Menu f33041I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public n7.h f33043K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public LinearLayout f33044L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public LinearLayout f33045M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public LinearLayout f33046N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public RecyclerView f33047O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public M f33048P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public String f33049Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public String f33050R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public String f33051S;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public TextView f33053U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f33054V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f33055W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f33056X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f33057Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextView f33058Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f33059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f33060e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public ImageView f33061e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SimpleDateFormat f33062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Date f33063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Toolbar f33064h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AppBarLayout f33065i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RelativeLayout f33066j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f33067k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f33068l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ProgressBar f33069m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f33070n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ScrollView f33071o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f33072p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LinearLayout f33073q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinearLayout f33074r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LinearLayout f33075s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LinearLayout f33076t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public LinearLayout f33077u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinearLayout f33078v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LinearLayout f33079w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public LinearLayout f33080x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public LinearLayout f33081y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ImageView f33082z;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Context f33034B = this;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f33037E = "";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f33038F = "";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Boolean f33042J = Boolean.TRUE;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public String f33052T = "";

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(ViewDetailsCastActivity.this.f33034B);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewDetailsCastActivity.this.onBackPressed();
        }
    }

    public class d implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f33086a;

        public d(Context context) {
            this.f33086a = context;
        }

        @Override // com.squareup.picasso.C
        public void a(Drawable drawable) {
            Log.d("TAG", "FAILED");
        }

        @Override // com.squareup.picasso.C
        public void b(Bitmap bitmap, t.e eVar) {
            ViewDetailsCastActivity.this.f33065i.setBackground(new BitmapDrawable(this.f33086a.getResources(), bitmap));
            ViewDetailsCastActivity viewDetailsCastActivity = ViewDetailsCastActivity.this;
            viewDetailsCastActivity.f33033A.setBackgroundColor(viewDetailsCastActivity.getResources().getColor(a7.c.f11844B));
            ViewDetailsCastActivity viewDetailsCastActivity2 = ViewDetailsCastActivity.this;
            viewDetailsCastActivity2.f33064h.setBackgroundColor(viewDetailsCastActivity2.getResources().getColor(a7.c.f11844B));
        }

        @Override // com.squareup.picasso.C
        public void c(Drawable drawable) {
            Log.d("TAG", "Prepare Load");
        }
    }

    public class e extends AbstractC2312g {
        public e() {
        }

        @Override // o2.InterfaceC2315j
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(Bitmap bitmap, n2.c cVar) {
            ViewDetailsCastActivity.this.f33067k.setBackground(new BitmapDrawable(bitmap));
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.dismiss();
        }
    }

    public class g implements DialogInterface.OnClickListener {
        public g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.n0(ViewDetailsCastActivity.this.f33034B);
        }
    }

    public class h implements DialogInterface.OnClickListener {
        public h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.m0(ViewDetailsCastActivity.this.f33034B);
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
        }
    }

    private void A1(Context context, String str, String str2) {
        String str3;
        this.f33043K = new n7.h(this, context);
        Intent intent = getIntent();
        if (intent != null) {
            this.f33049Q = intent.getStringExtra("castID");
            this.f33050R = intent.getStringExtra("castName");
            this.f33051S = intent.getStringExtra("profilePath");
            String stringExtra = intent.getStringExtra("streamBackdrop");
            this.f33052T = stringExtra;
            if (stringExtra != null && !stringExtra.equals("") && context != null) {
                t.q(context).l(this.f33052T).i(new d(context));
            }
            String str4 = this.f33049Q;
            if (str4 == null || str4.equals("0")) {
                return;
            }
            TextView textView = this.f33053U;
            if (textView != null) {
                textView.setText(this.f33050R);
            }
            if (context != null) {
                try {
                    if (this.f33067k != null && (str3 = this.f33051S) != null && !str3.isEmpty()) {
                        O1.g.u(getApplicationContext()).q("https://image.tmdb.org/t/p/w500/" + this.f33051S).I().m(new e());
                    }
                } catch (Exception unused) {
                }
            }
            this.f33043K.f(this.f33049Q);
        }
    }

    private void v1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    public static String w1(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    private void y1() {
        this.f33053U = (TextView) findViewById(a7.f.Uh);
        this.f33054V = (TextView) findViewById(a7.f.Ok);
        this.f33055W = (TextView) findViewById(a7.f.yj);
        this.f33056X = (TextView) findViewById(a7.f.Kj);
        this.f33057Y = (TextView) findViewById(a7.f.Sh);
        this.f33058Z = (TextView) findViewById(a7.f.yi);
        this.f33061e0 = (ImageView) findViewById(a7.f.f12141F4);
        this.f33044L = (LinearLayout) findViewById(a7.f.f12134E7);
        this.f33045M = (LinearLayout) findViewById(a7.f.f12144F7);
        this.f33046N = (LinearLayout) findViewById(a7.f.f12154G7);
        this.f33047O = (RecyclerView) findViewById(a7.f.Df);
        this.f33064h = (Toolbar) findViewById(a7.f.kh);
        this.f33065i = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f33066j = (RelativeLayout) findViewById(a7.f.Nd);
        this.f33067k = (ImageView) findViewById(a7.f.f12102B5);
        this.f33068l = (TextView) findViewById(a7.f.Ji);
        this.f33069m = (ProgressBar) findViewById(a7.f.Ei);
        this.f33070n = (LinearLayout) findViewById(a7.f.n9);
        this.f33071o = (ScrollView) findViewById(a7.f.Tf);
        this.f33072p = (LinearLayout) findViewById(a7.f.f12194K7);
        this.f33073q = (LinearLayout) findViewById(a7.f.v9);
        this.f33074r = (LinearLayout) findViewById(a7.f.f12500p8);
        this.f33075s = (LinearLayout) findViewById(a7.f.f12105B8);
        this.f33076t = (LinearLayout) findViewById(a7.f.f12214M7);
        this.f33077u = (LinearLayout) findViewById(a7.f.f12204L7);
        this.f33078v = (LinearLayout) findViewById(a7.f.w9);
        this.f33079w = (LinearLayout) findViewById(a7.f.f12511q8);
        this.f33080x = (LinearLayout) findViewById(a7.f.f12095A8);
        this.f33081y = (LinearLayout) findViewById(a7.f.f12224N7);
        this.f33082z = (ImageView) findViewById(a7.f.Xa);
        this.f33033A = (RelativeLayout) findViewById(a7.f.vf);
    }

    private void z1() {
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f33036D = sharedPreferences;
        String string = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        String string2 = this.f33036D.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        if (string.isEmpty() || string2.isEmpty()) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        } else {
            A1(this.f33034B, string, string2);
        }
        this.f33082z.setOnClickListener(new b());
        this.f33061e0.setOnClickListener(new c());
    }

    @Override // z7.k
    public void C(SearchTMDBMoviesCallback searchTMDBMoviesCallback) {
    }

    @Override // z7.k
    public void U0(TMDBCastsCallback tMDBCastsCallback) {
    }

    @Override // z7.k
    public void X0(TMDBTrailerCallback tMDBTrailerCallback) {
    }

    @Override // z7.b
    public void a() {
    }

    @Override // z7.b
    public void b() {
        ProgressDialog progressDialog = this.f33035C;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    @Override // z7.b
    public void d(String str) {
        this.f33069m.setVisibility(8);
    }

    @Override // androidx.appcompat.app.b, D.AbstractActivityC0525h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return keyCode == 82 ? keyEvent.getAction() == 0 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent) : super.dispatchKeyEvent(keyEvent);
    }

    @Override // z7.k
    public void g0(TMDBGenreCallback tMDBGenreCallback) {
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
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f33034B = this;
        super.onCreate(bundle);
        x1();
        setContentView(new C2858a(this.f33034B).A().equals(AbstractC2237a.f44453K0) ? a7.g.f12860q1 : a7.g.f12854p1);
        y1();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        v1();
        this.f33063g = new Date();
        f33031f0 = w1(this.f33034B);
        Locale locale = Locale.US;
        this.f33039G = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f33060e = w.S0(C2940d.d());
        f33032g0 = getApplicationContext().getPackageName();
        this.f33059d = w.S0(C2937a.a());
        this.f33062f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        getWindow().setFlags(1024, 1024);
        r1((Toolbar) findViewById(a7.f.kh));
        AppBarLayout appBarLayout = this.f33065i;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(a7.e.f11917H));
        }
        z1();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f33064h.x(a7.h.f12939v);
        this.f33041I = menu;
        this.f33040H = menu.getItem(1).getSubMenu().findItem(a7.f.f12239P2);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f33034B).equals("api")) {
            menu.getItem(1).getSubMenu().findItem(a7.f.fb).setVisible(false);
        }
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f33064h.getChildCount(); i9++) {
            if (this.f33064h.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f33064h.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        if (i9 != 82) {
            return super.onKeyUp(i9, keyEvent);
        }
        Menu menu = this.f33041I;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(a7.f.f12239P2, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f33040H = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == a7.f.Gb) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == a7.f.Mb) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == a7.f.f12380e && (context = this.f33034B) != null) {
            new a.C0158a(context, a7.k.f13456a).setTitle(getResources().getString(a7.j.f13250f3)).f(getResources().getString(a7.j.f13240e3)).j(getResources().getString(a7.j.f13132S8), new g()).g(getResources().getString(a7.j.f13231d4), new f()).n();
        }
        if (itemId == a7.f.fb) {
            a.C0158a c0158a = new a.C0158a(this);
            c0158a.setTitle(this.f33034B.getResources().getString(a7.j.f13397u0));
            c0158a.f(this.f33034B.getResources().getString(a7.j.f13134T0));
            c0158a.d(a7.e.f12056s1);
            c0158a.j(this.f33034B.getResources().getString(a7.j.f13132S8), new h());
            c0158a.g(this.f33034B.getResources().getString(a7.j.f13231d4), new i());
            c0158a.n();
        }
        if (itemId == a7.f.hb) {
            a.C0158a c0158a2 = new a.C0158a(this);
            c0158a2.setTitle(this.f33034B.getResources().getString(a7.j.f13397u0));
            c0158a2.f(this.f33034B.getResources().getString(a7.j.f13134T0));
            c0158a2.d(a7.e.f12056s1);
            c0158a2.j(this.f33034B.getResources().getString(a7.j.f13132S8), new j());
            c0158a2.g(this.f33034B.getResources().getString(a7.j.f13231d4), new a());
            c0158a2.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        w.m(this.f33034B);
        w.z0(this.f33034B);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f33036D = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f33036D.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f33034B != null) {
            b();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        x1();
    }

    @Override // z7.k
    public void s(TMDBCastsCallback tMDBCastsCallback) {
    }

    @Override // z7.k
    public void t(TMDBPersonInfoCallback tMDBPersonInfoCallback) {
        TextView textView;
        TextView textView2;
        String str;
        this.f33069m.setVisibility(8);
        if (tMDBPersonInfoCallback != null) {
            String name = tMDBPersonInfoCallback.getName() != null ? tMDBPersonInfoCallback.getName() : "N/A";
            if (tMDBPersonInfoCallback.getProfilePath() != null) {
                tMDBPersonInfoCallback.getProfilePath();
            }
            String birthday = tMDBPersonInfoCallback.getBirthday() != null ? tMDBPersonInfoCallback.getBirthday() : "N/A";
            String placeOfBirth = tMDBPersonInfoCallback.getPlaceOfBirth() != null ? tMDBPersonInfoCallback.getPlaceOfBirth() : "N/A";
            String deathday = tMDBPersonInfoCallback.getDeathday() != null ? tMDBPersonInfoCallback.getDeathday() : "N/A";
            int iIntValue = tMDBPersonInfoCallback.getGender() != null ? tMDBPersonInfoCallback.getGender().intValue() : 5;
            String knownForDepartment = tMDBPersonInfoCallback.getKnownForDepartment() != null ? tMDBPersonInfoCallback.getKnownForDepartment() : "N/A";
            String biography = tMDBPersonInfoCallback.getBiography() != null ? tMDBPersonInfoCallback.getBiography() : "N/A";
            if (tMDBPersonInfoCallback.getImages() != null && tMDBPersonInfoCallback.getImages().getProfiles() != null && tMDBPersonInfoCallback.getImages().getProfiles().size() > 0) {
                this.f33047O.setLayoutManager(new LinearLayoutManager(this, 0, false));
                this.f33047O.setItemAnimator(new androidx.recyclerview.widget.c());
                M m9 = new M(tMDBPersonInfoCallback.getImages().getProfiles(), this.f33034B, true);
                this.f33048P = m9;
                this.f33047O.setAdapter(m9);
            }
            TextView textView3 = this.f33053U;
            if (textView3 != null) {
                textView3.setText(name);
            }
            if (this.f33073q == null || this.f33078v == null || this.f33054V == null || placeOfBirth == null || placeOfBirth.isEmpty() || placeOfBirth.equals("N/A")) {
                LinearLayout linearLayout = this.f33073q;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                LinearLayout linearLayout2 = this.f33078v;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                TextView textView4 = this.f33054V;
                if (textView4 != null) {
                    textView4.setText("N/A");
                }
            } else {
                this.f33073q.setVisibility(0);
                this.f33078v.setVisibility(0);
                this.f33054V.setText(placeOfBirth);
            }
            if (this.f33058Z == null || this.f33077u == null || this.f33072p == null || birthday == null || birthday.isEmpty() || birthday.equals("N/A")) {
                LinearLayout linearLayout3 = this.f33072p;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(0);
                }
                LinearLayout linearLayout4 = this.f33077u;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(0);
                }
                TextView textView5 = this.f33058Z;
                if (textView5 != null) {
                    textView5.setText("N/A");
                }
            } else {
                this.f33072p.setVisibility(0);
                this.f33077u.setVisibility(0);
                this.f33058Z.setText(birthday);
            }
            LinearLayout linearLayout5 = this.f33074r;
            if (linearLayout5 == null || this.f33079w == null || this.f33055W == null || iIntValue == 5) {
                if (linearLayout5 != null) {
                    linearLayout5.setVisibility(0);
                }
                LinearLayout linearLayout6 = this.f33079w;
                if (linearLayout6 != null) {
                    linearLayout6.setVisibility(0);
                }
                textView = this.f33055W;
                if (textView != null) {
                    textView.setText("N/A");
                }
            } else {
                linearLayout5.setVisibility(0);
                this.f33079w.setVisibility(0);
                if (iIntValue == 1) {
                    textView2 = this.f33055W;
                    str = "Female";
                } else if (iIntValue == 2) {
                    textView2 = this.f33055W;
                    str = "Male";
                } else {
                    textView = this.f33055W;
                    textView.setText("N/A");
                }
                textView2.setText(str);
            }
            LinearLayout linearLayout7 = this.f33075s;
            if (linearLayout7 == null || this.f33080x == null || this.f33056X == null) {
                if (linearLayout7 != null) {
                    linearLayout7.setVisibility(0);
                }
                LinearLayout linearLayout8 = this.f33080x;
                if (linearLayout8 != null) {
                    linearLayout8.setVisibility(0);
                }
                TextView textView6 = this.f33056X;
                if (textView6 != null) {
                    textView6.setText("N/A");
                }
            } else {
                linearLayout7.setVisibility(0);
                this.f33080x.setVisibility(0);
                TextView textView7 = this.f33056X;
                if (textView7 != null) {
                    textView7.setText(knownForDepartment);
                }
            }
            if (this.f33057Y == null || biography == null || biography.isEmpty() || biography.equals("N/A")) {
                TextView textView8 = this.f33057Y;
                if (textView8 != null) {
                    textView8.setVisibility(8);
                }
            } else {
                this.f33057Y.setText(biography);
            }
            if (this.f33076t != null && this.f33081y != null && this.f33068l != null && deathday != null && !deathday.equals("N/A") && !deathday.isEmpty()) {
                this.f33076t.setVisibility(0);
                this.f33081y.setVisibility(0);
                this.f33068l.setText(deathday);
                return;
            }
            LinearLayout linearLayout9 = this.f33076t;
            if (linearLayout9 != null) {
                linearLayout9.setVisibility(8);
            }
            LinearLayout linearLayout10 = this.f33081y;
            if (linearLayout10 != null) {
                linearLayout10.setVisibility(8);
            }
        }
    }

    public void x1() {
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }
}
