package com.nst.iptvsmarterstvbox.view.activity;

import a7.j;
import android.R;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import java.util.ArrayList;
import m7.AbstractC2237a;
import m7.w;
import q7.i0;
import q7.n0;

/* JADX INFO: loaded from: classes4.dex */
public class VodActivityLayout extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static ArrayList f33206J = new ArrayList();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static ArrayList f33207K = new ArrayList();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static ArrayList f33208L = new ArrayList();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static ProgressBar f33209M;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public SharedPreferences f33210A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public i0 f33211B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public n0 f33213D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public SharedPreferences f33214E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public SharedPreferences.Editor f33215F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public PopupWindow f33216G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public MenuItem f33217H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Menu f33218I;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Toolbar f33219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppBarLayout f33220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ProgressBar f33221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f33222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f33223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f33224i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f33225j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f33226k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f33227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SharedPreferences f33228m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LiveStreamDBHandler f33232q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SearchView f33234s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ProgressDialog f33235t;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public SharedPreferences f33239x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public SharedPreferences.Editor f33240y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public RecyclerView.o f33241z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f33229n = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f33230o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f33231p = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f33233r = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f33236u = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f33237v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f33238w = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ArrayList f33212C = new ArrayList();

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
            w.n0(VodActivityLayout.this.f33227l);
        }
    }

    public class c implements SearchView.m {
        public c() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextChange(String str) {
            TextView textView;
            VodActivityLayout.this.f33224i.setVisibility(8);
            if (VodActivityLayout.this.f33211B == null || (textView = VodActivityLayout.this.f33223h) == null || textView.getVisibility() == 0) {
                return false;
            }
            VodActivityLayout.this.f33211B.J0(str, VodActivityLayout.this.f33224i);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.m0(VodActivityLayout.this.f33227l);
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
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

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodActivityLayout.this.f33216G.dismiss();
        }
    }

    public class i implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RadioGroup f33250a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f33251c;

        public i(RadioGroup radioGroup, View view) {
            this.f33250a = radioGroup;
            this.f33251c = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharedPreferences.Editor editor;
            String str;
            RadioButton radioButton = (RadioButton) this.f33251c.findViewById(this.f33250a.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(VodActivityLayout.this.getResources().getString(j.f13284i7))) {
                editor = VodActivityLayout.this.f33215F;
                str = "1";
            } else if (radioButton.getText().toString().equals(VodActivityLayout.this.getResources().getString(j.f13254f7))) {
                editor = VodActivityLayout.this.f33215F;
                str = "2";
            } else if (radioButton.getText().toString().equals(VodActivityLayout.this.getResources().getString(j.f13304k7))) {
                editor = VodActivityLayout.this.f33215F;
                str = "3";
            } else {
                editor = VodActivityLayout.this.f33215F;
                str = "0";
            }
            editor.putString("sort", str);
            VodActivityLayout.this.f33215F.commit();
            VodActivityLayout vodActivityLayout = VodActivityLayout.this;
            vodActivityLayout.f33239x = vodActivityLayout.getSharedPreferences("listgridview", 0);
            VodActivityLayout vodActivityLayout2 = VodActivityLayout.this;
            vodActivityLayout2.f33240y = vodActivityLayout2.f33239x.edit();
            int i9 = VodActivityLayout.this.f33239x.getInt("vod", 0);
            AbstractC2237a.f44458N = i9;
            if (i9 == 1) {
                VodActivityLayout.this.H1();
            } else {
                VodActivityLayout.this.G1();
            }
            VodActivityLayout.this.f33216G.dismiss();
        }
    }

    private void D1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private void F1() {
        this.f33219d = (Toolbar) findViewById(a7.f.kh);
        this.f33220e = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f33221f = (ProgressBar) findViewById(a7.f.ec);
        this.f33222g = (RecyclerView) findViewById(a7.f.ub);
        this.f33223h = (TextView) findViewById(a7.f.sk);
        this.f33224i = (TextView) findViewById(a7.f.wk);
        this.f33225j = (TextView) findViewById(a7.f.lm);
        this.f33226k = (TextView) findViewById(a7.f.Jl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G1() {
        this.f33227l = this;
        this.f33232q = new LiveStreamDBHandler(this.f33227l);
        RecyclerView recyclerView = this.f33222g;
        if (recyclerView == null || this.f33227l == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f33227l, w.L(this.f33227l) + 2);
        this.f33241z = gridLayoutManager;
        this.f33222g.setLayoutManager(gridLayoutManager);
        this.f33222g.setItemAnimator(new androidx.recyclerview.widget.c());
        SharedPreferences sharedPreferences = this.f33227l.getSharedPreferences("loginPrefs", 0);
        this.f33210A = sharedPreferences;
        sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        this.f33210A.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        K1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H1() {
        this.f33227l = this;
        this.f33232q = new LiveStreamDBHandler(this.f33227l);
        RecyclerView recyclerView = this.f33222g;
        if (recyclerView == null || this.f33227l == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f33227l);
        this.f33241z = linearLayoutManager;
        this.f33222g.setLayoutManager(linearLayoutManager);
        this.f33222g.setItemAnimator(new androidx.recyclerview.widget.c());
        SharedPreferences sharedPreferences = this.f33227l.getSharedPreferences("loginPrefs", 0);
        this.f33210A = sharedPreferences;
        sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        this.f33210A.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        K1();
    }

    private void J1() {
        SharedPreferences sharedPreferences = getSharedPreferences("listgridview", 0);
        this.f33239x = sharedPreferences;
        this.f33240y = sharedPreferences.edit();
        int i9 = this.f33239x.getInt("vod", 0);
        AbstractC2237a.f44458N = i9;
        if (i9 == 1) {
            H1();
        } else {
            G1();
        }
    }

    private void K1() {
        if (this.f33227l != null) {
            LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f33227l);
            if (!this.f33236u.equals("-1")) {
                ArrayList<LiveStreamsDBModel> allLiveStreasWithCategoryId = liveStreamDBHandler.getAllLiveStreasWithCategoryId(this.f33236u, "movie");
                b();
                ProgressDialog progressDialog = this.f33235t;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                if (allLiveStreasWithCategoryId == null || this.f33222g == null || allLiveStreasWithCategoryId.size() == 0) {
                    TextView textView = this.f33223h;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                } else {
                    i0 i0Var = new i0(allLiveStreasWithCategoryId, this.f33227l, true);
                    this.f33211B = i0Var;
                    this.f33222g.setAdapter(i0Var);
                    w.Q0(this.f33227l, getResources().getString(j.f13365q8));
                }
            }
        }
        ProgressDialog progressDialog2 = this.f33235t;
        if (progressDialog2 != null) {
            progressDialog2.dismiss();
        }
    }

    private void L1(Activity activity) {
        try {
            View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(a7.g.f12619C4, (RelativeLayout) activity.findViewById(a7.f.Ve));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f33216G = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.f33216G.setWidth(-1);
            this.f33216G.setHeight(-1);
            this.f33216G.setFocusable(true);
            this.f33216G.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(a7.f.f12157H0);
            Button button2 = (Button) viewInflate.findViewById(a7.f.f12482o0);
            RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(a7.f.Kd);
            RadioButton radioButton = (RadioButton) viewInflate.findViewById(a7.f.rd);
            RadioButton radioButton2 = (RadioButton) viewInflate.findViewById(a7.f.md);
            RadioButton radioButton3 = (RadioButton) viewInflate.findViewById(a7.f.fd);
            RadioButton radioButton4 = (RadioButton) viewInflate.findViewById(a7.f.zd);
            String string = this.f33214E.getString("sort", "");
            if (string.equals("1")) {
                radioButton2.setChecked(true);
            } else if (string.equals("2")) {
                radioButton3.setChecked(true);
            } else if (string.equals("3")) {
                radioButton4.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
            button2.setOnClickListener(new h());
            button.setOnClickListener(new i(radioGroup, viewInflate));
        } catch (NullPointerException | Exception unused) {
        }
    }

    public void E1() {
        RecyclerView recyclerView;
        androidx.recyclerview.widget.c cVar;
        a();
        SharedPreferences sharedPreferences = getSharedPreferences("listgridview", 0);
        this.f33239x = sharedPreferences;
        this.f33240y = sharedPreferences.edit();
        int i9 = this.f33239x.getInt("vod", 0);
        AbstractC2237a.f44458N = i9;
        this.f33227l = this;
        if (i9 == 1) {
            this.f33232q = new LiveStreamDBHandler(this.f33227l);
            RecyclerView recyclerView2 = this.f33222g;
            if (recyclerView2 != null && this.f33227l != null) {
                recyclerView2.setHasFixedSize(true);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f33227l);
                this.f33241z = linearLayoutManager;
                this.f33222g.setLayoutManager(linearLayoutManager);
                recyclerView = this.f33222g;
                cVar = new androidx.recyclerview.widget.c();
                recyclerView.setItemAnimator(cVar);
            }
        } else {
            this.f33232q = new LiveStreamDBHandler(this.f33227l);
            RecyclerView recyclerView3 = this.f33222g;
            if (recyclerView3 != null && this.f33227l != null) {
                recyclerView3.setHasFixedSize(true);
                GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f33227l, w.L(this.f33227l) + 2);
                this.f33241z = gridLayoutManager;
                this.f33222g.setLayoutManager(gridLayoutManager);
                recyclerView = this.f33222g;
                cVar = new androidx.recyclerview.widget.c();
                recyclerView.setItemAnimator(cVar);
            }
        }
        if (this.f33227l != null) {
            ArrayList<LiveStreamsDBModel> allLiveStreasWithCategoryId = new LiveStreamDBHandler(this.f33227l).getAllLiveStreasWithCategoryId("0", "movie");
            b();
            if (allLiveStreasWithCategoryId == null || this.f33222g == null || allLiveStreasWithCategoryId.size() == 0) {
                ProgressDialog progressDialog = this.f33235t;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                TextView textView = this.f33223h;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            } else {
                ProgressDialog progressDialog2 = this.f33235t;
                if (progressDialog2 != null) {
                    progressDialog2.dismiss();
                }
                this.f33211B = new i0(allLiveStreasWithCategoryId, this.f33227l, true);
                w.Q0(this.f33227l, getResources().getString(j.f13365q8));
                this.f33222g.setAdapter(this.f33211B);
            }
        }
        ProgressDialog progressDialog3 = this.f33235t;
        if (progressDialog3 != null) {
            progressDialog3.dismiss();
        }
    }

    public void I1(ProgressBar progressBar) {
        f33209M = progressBar;
    }

    public void a() {
        ProgressBar progressBar = this.f33221f;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    public void b() {
        ProgressBar progressBar = this.f33221f;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // androidx.appcompat.app.b, D.AbstractActivityC0525h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return keyCode == 82 ? keyEvent.getAction() == 0 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent) : super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ProgressBar progressBar;
        n0 n0Var = this.f33213D;
        if (n0Var != null && (progressBar = f33209M) != null) {
            n0Var.F0(progressBar);
        }
        RecyclerView recyclerView = this.f33222g;
        if (recyclerView != null) {
            recyclerView.setClickable(true);
        }
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
        super.onCreate(bundle);
        SharedPreferences sharedPreferences = getSharedPreferences("sort", 0);
        this.f33214E = sharedPreferences;
        this.f33215F = sharedPreferences.edit();
        if (this.f33214E.getString("sort", "").equals("")) {
            this.f33215F.putString("sort", "0");
            this.f33215F.commit();
        }
        getWindow().setFlags(1024, 1024);
        Intent intent = getIntent();
        if (intent != null) {
            this.f33236u = intent.getStringExtra("category_id");
            this.f33237v = intent.getStringExtra("category_name");
        }
        this.f33227l = this;
        this.f33213D = new n0();
        this.f33232q = new LiveStreamDBHandler(this.f33227l);
        setContentView(a7.g.f12616C1);
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        F1();
        a();
        J1();
        D1();
        r1((Toolbar) findViewById(a7.f.kh));
        AppBarLayout appBarLayout = this.f33220e;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(a7.e.f12034n));
        }
        this.f33227l = this;
        if (!this.f33237v.isEmpty()) {
            this.f33226k.setText(this.f33237v);
        }
        this.f33226k.setSelected(true);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f33219d.x(a7.h.f12936s);
        this.f33218I = menu;
        this.f33217H = menu.getItem(2).getSubMenu().findItem(a7.f.f12239P2);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f33219d.getChildCount(); i9++) {
            if (this.f33219d.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f33219d.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        if (i9 != 82) {
            return super.onKeyUp(i9, keyEvent);
        }
        Menu menu = this.f33218I;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(a7.f.f12239P2, 0);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x01de, code lost:
    
        if (r1.size() > 0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017d  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onOptionsItemSelected(android.view.MenuItem r9) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.VodActivityLayout.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        w.m(this.f33227l);
        getWindow().setFlags(1024, 1024);
        this.f33213D.F0(f33209M);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f33228m = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f33228m.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f33227l != null) {
            b();
        }
    }
}
