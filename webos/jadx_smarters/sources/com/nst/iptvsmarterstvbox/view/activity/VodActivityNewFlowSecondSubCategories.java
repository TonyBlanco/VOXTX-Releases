package com.nst.iptvsmarterstvbox.view.activity;

import android.R;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
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
import com.nst.iptvsmarterstvbox.model.database.PasswordStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import java.util.ArrayList;
import java.util.Iterator;
import m7.AbstractC2237a;
import m7.w;
import q7.i0;
import q7.j0;
import q7.n0;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class VodActivityNewFlowSecondSubCategories extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static ArrayList f33317R = new ArrayList();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static ArrayList f33318S = new ArrayList();

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static ArrayList f33319T = new ArrayList();

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static ProgressBar f33320U;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public SharedPreferences f33321A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public SharedPreferences.Editor f33322B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public RecyclerView.o f33323C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public SharedPreferences f33324D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public i0 f33325E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public j0 f33327G;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public PopupWindow f33329I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public SharedPreferences f33330J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public SharedPreferences.Editor f33331K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public GridLayoutManager f33332L;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ArrayList f33334N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ArrayList f33335O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ArrayList f33336P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ArrayList f33337Q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Toolbar f33338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppBarLayout f33339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ProgressBar f33340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f33341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f33342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f33343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f33344j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f33345k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RelativeLayout f33346l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f33347m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Context f33348n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SharedPreferences f33349o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LiveStreamDBHandler f33353s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SearchView f33355u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ProgressDialog f33356v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public n0 f33360z;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f33350p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f33351q = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f33352r = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f33354t = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f33357w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f33358x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f33359y = false;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ArrayList f33326F = new ArrayList();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f33328H = false;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ArrayList f33333M = new ArrayList();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodActivityNewFlowSecondSubCategories.this.f33329I.dismiss();
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RadioGroup f33362a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f33363c;

        public b(RadioGroup radioGroup, View view) {
            this.f33362a = radioGroup;
            this.f33363c = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharedPreferences.Editor editor;
            String str;
            RadioButton radioButton = (RadioButton) this.f33363c.findViewById(this.f33362a.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(VodActivityNewFlowSecondSubCategories.this.getResources().getString(a7.j.f13284i7))) {
                editor = VodActivityNewFlowSecondSubCategories.this.f33331K;
                str = "1";
            } else if (radioButton.getText().toString().equals(VodActivityNewFlowSecondSubCategories.this.getResources().getString(a7.j.f13254f7))) {
                editor = VodActivityNewFlowSecondSubCategories.this.f33331K;
                str = "2";
            } else if (radioButton.getText().toString().equals(VodActivityNewFlowSecondSubCategories.this.getResources().getString(a7.j.f13304k7))) {
                editor = VodActivityNewFlowSecondSubCategories.this.f33331K;
                str = "3";
            } else {
                editor = VodActivityNewFlowSecondSubCategories.this.f33331K;
                str = "0";
            }
            editor.putString("sort", str);
            VodActivityNewFlowSecondSubCategories.this.f33331K.commit();
            VodActivityNewFlowSecondSubCategories vodActivityNewFlowSecondSubCategories = VodActivityNewFlowSecondSubCategories.this;
            vodActivityNewFlowSecondSubCategories.f33321A = vodActivityNewFlowSecondSubCategories.getSharedPreferences("listgridview", 0);
            VodActivityNewFlowSecondSubCategories vodActivityNewFlowSecondSubCategories2 = VodActivityNewFlowSecondSubCategories.this;
            vodActivityNewFlowSecondSubCategories2.f33322B = vodActivityNewFlowSecondSubCategories2.f33321A.edit();
            int i9 = VodActivityNewFlowSecondSubCategories.this.f33321A.getInt("vod", 0);
            AbstractC2237a.f44458N = i9;
            if (i9 == 1) {
                VodActivityNewFlowSecondSubCategories.this.K1();
            } else {
                VodActivityNewFlowSecondSubCategories.this.J1();
            }
            VodActivityNewFlowSecondSubCategories.this.f33329I.dismiss();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(VodActivityNewFlowSecondSubCategories.this.f33348n);
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
            w.n0(VodActivityNewFlowSecondSubCategories.this.f33348n);
        }
    }

    public class f implements SearchView.m {
        public f() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextChange(String str) {
            TextView textView;
            VodActivityNewFlowSecondSubCategories.this.f33343i.setVisibility(8);
            if (VodActivityNewFlowSecondSubCategories.this.f33360z == null || (textView = VodActivityNewFlowSecondSubCategories.this.f33342h) == null || textView.getVisibility() == 0) {
                return false;
            }
            VodActivityNewFlowSecondSubCategories.this.f33360z.z0(str, VodActivityNewFlowSecondSubCategories.this.f33343i);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class g implements SearchView.m {
        public g() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextChange(String str) {
            TextView textView;
            VodActivityNewFlowSecondSubCategories.this.f33343i.setVisibility(8);
            if (VodActivityNewFlowSecondSubCategories.this.f33325E == null || (textView = VodActivityNewFlowSecondSubCategories.this.f33342h) == null || textView.getVisibility() == 0) {
                return false;
            }
            VodActivityNewFlowSecondSubCategories.this.f33325E.J0(str, VodActivityNewFlowSecondSubCategories.this.f33343i);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class h implements DialogInterface.OnClickListener {
        public h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.m0(VodActivityNewFlowSecondSubCategories.this.f33348n);
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

    public class k implements DialogInterface.OnClickListener {
        public k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    private void E1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private ArrayList G1() {
        ArrayList<PasswordStatusDBModel> allPasswordStatus = this.f33353s.getAllPasswordStatus(SharepreferenceDBHandler.getUserID(this.f33348n));
        this.f33334N = allPasswordStatus;
        if (allPasswordStatus != null) {
            for (PasswordStatusDBModel passwordStatusDBModel : allPasswordStatus) {
                if (passwordStatusDBModel.getPasswordStatus().equals("1")) {
                    this.f33333M.add(passwordStatusDBModel.getPasswordStatusCategoryId());
                }
            }
        }
        return this.f33333M;
    }

    private ArrayList H1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LiveStreamsDBModel liveStreamsDBModel = (LiveStreamsDBModel) it.next();
            if (arrayList2 != null) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (liveStreamsDBModel.getCategoryId().equals((String) it2.next())) {
                            break;
                        }
                    } else {
                        ArrayList arrayList3 = this.f33335O;
                        if (arrayList3 != null) {
                            arrayList3.add(liveStreamsDBModel);
                        }
                    }
                }
            }
        }
        return this.f33335O;
    }

    private void I1() {
        this.f33338d = (Toolbar) findViewById(a7.f.kh);
        this.f33339e = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f33340f = (ProgressBar) findViewById(a7.f.ec);
        this.f33341g = (RecyclerView) findViewById(a7.f.ub);
        this.f33342h = (TextView) findViewById(a7.f.sk);
        this.f33343i = (TextView) findViewById(a7.f.wk);
        this.f33344j = (TextView) findViewById(a7.f.lm);
        this.f33345k = (TextView) findViewById(a7.f.Jl);
        this.f33346l = (RelativeLayout) findViewById(a7.f.rf);
        this.f33347m = (ImageView) findViewById(a7.f.Xa);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J1() {
        this.f33348n = this;
        this.f33353s = new LiveStreamDBHandler(this.f33348n);
        RecyclerView recyclerView = this.f33341g;
        if (recyclerView == null || this.f33348n == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f33348n, w.L(this.f33348n) + 1);
        this.f33323C = gridLayoutManager;
        this.f33341g.setLayoutManager(gridLayoutManager);
        this.f33341g.setItemAnimator(new androidx.recyclerview.widget.c());
        SharedPreferences sharedPreferences = this.f33348n.getSharedPreferences("loginPrefs", 0);
        this.f33324D = sharedPreferences;
        sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        this.f33324D.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        N1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K1() {
        this.f33348n = this;
        this.f33353s = new LiveStreamDBHandler(this.f33348n);
        RecyclerView recyclerView = this.f33341g;
        if (recyclerView == null || this.f33348n == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f33348n);
        this.f33323C = linearLayoutManager;
        this.f33341g.setLayoutManager(linearLayoutManager);
        this.f33341g.setItemAnimator(new androidx.recyclerview.widget.c());
        SharedPreferences sharedPreferences = this.f33348n.getSharedPreferences("loginPrefs", 0);
        this.f33324D = sharedPreferences;
        sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        this.f33324D.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        N1();
    }

    private void L1(ArrayList arrayList) {
        RecyclerView recyclerView = this.f33341g;
        if (recyclerView == null || this.f33348n == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        this.f33332L = new C2858a(this.f33348n).A().equals(AbstractC2237a.f44453K0) ? new GridLayoutManager(this, 2) : new GridLayoutManager(this, 2);
        this.f33341g.setLayoutManager(this.f33332L);
        this.f33341g.setHasFixedSize(true);
        b();
        n0 n0Var = new n0(arrayList, this.f33348n, this.f33353s);
        this.f33360z = n0Var;
        this.f33341g.setAdapter(n0Var);
    }

    private void M1(ArrayList arrayList) {
        L1(arrayList);
    }

    private void N1() {
        TextView textView;
        try {
            if (this.f33348n != null) {
                LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f33348n);
                if (!this.f33357w.equals("-1")) {
                    if (this.f33357w.equals("0")) {
                        this.f33334N = new ArrayList();
                        this.f33335O = new ArrayList();
                        this.f33336P = new ArrayList();
                        this.f33337Q = new ArrayList();
                        ArrayList<LiveStreamsDBModel> allLiveStreasWithCategoryId = liveStreamDBHandler.getAllLiveStreasWithCategoryId(this.f33357w, "movie");
                        if (liveStreamDBHandler.getParentalStatusCount(SharepreferenceDBHandler.getUserID(this.f33348n)) <= 0 || allLiveStreasWithCategoryId == null) {
                            this.f33337Q = allLiveStreasWithCategoryId;
                        } else {
                            ArrayList arrayListG1 = G1();
                            this.f33333M = arrayListG1;
                            if (arrayListG1 != null) {
                                this.f33336P = H1(allLiveStreasWithCategoryId, arrayListG1);
                            }
                            this.f33337Q = this.f33336P;
                        }
                        b();
                        ProgressDialog progressDialog = this.f33356v;
                        if (progressDialog != null) {
                            progressDialog.dismiss();
                        }
                        ArrayList arrayList = this.f33337Q;
                        if (arrayList == null || this.f33341g == null || arrayList.size() == 0) {
                            textView = this.f33342h;
                            if (textView != null) {
                                textView.setVisibility(0);
                            }
                        } else {
                            i0 i0Var = new i0(this.f33337Q, this.f33348n, true);
                            this.f33325E = i0Var;
                            this.f33341g.setAdapter(i0Var);
                            w.Q0(this.f33348n, getResources().getString(a7.j.f13365q8));
                        }
                    } else {
                        ArrayList<LiveStreamsDBModel> allLiveStreasWithCategoryId2 = liveStreamDBHandler.getAllLiveStreasWithCategoryId(this.f33357w, "movie");
                        b();
                        ProgressDialog progressDialog2 = this.f33356v;
                        if (progressDialog2 != null) {
                            progressDialog2.dismiss();
                        }
                        if (allLiveStreasWithCategoryId2 == null || this.f33341g == null || allLiveStreasWithCategoryId2.size() == 0) {
                            textView = this.f33342h;
                            if (textView != null) {
                                textView.setVisibility(0);
                            }
                        } else {
                            i0 i0Var2 = new i0(allLiveStreasWithCategoryId2, this.f33348n, true);
                            this.f33325E = i0Var2;
                            this.f33341g.setAdapter(i0Var2);
                        }
                    }
                }
            }
            ProgressDialog progressDialog3 = this.f33356v;
            if (progressDialog3 != null) {
                progressDialog3.dismiss();
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    private void O1(Activity activity) {
        try {
            View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(a7.g.f12619C4, (RelativeLayout) activity.findViewById(a7.f.Ve));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f33329I = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.f33329I.setWidth(-1);
            this.f33329I.setHeight(-1);
            this.f33329I.setFocusable(true);
            this.f33329I.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(a7.f.f12157H0);
            Button button2 = (Button) viewInflate.findViewById(a7.f.f12482o0);
            RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(a7.f.Kd);
            RadioButton radioButton = (RadioButton) viewInflate.findViewById(a7.f.rd);
            RadioButton radioButton2 = (RadioButton) viewInflate.findViewById(a7.f.md);
            RadioButton radioButton3 = (RadioButton) viewInflate.findViewById(a7.f.fd);
            RadioButton radioButton4 = (RadioButton) viewInflate.findViewById(a7.f.zd);
            String string = this.f33330J.getString("sort", "");
            if (string.equals("1")) {
                radioButton2.setChecked(true);
            } else if (string.equals("2")) {
                radioButton3.setChecked(true);
            } else if (string.equals("3")) {
                radioButton4.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
            button2.setOnClickListener(new a());
            button.setOnClickListener(new b(radioGroup, viewInflate));
        } catch (NullPointerException | Exception unused) {
        }
    }

    public void F1() {
        RecyclerView recyclerView;
        androidx.recyclerview.widget.c cVar;
        try {
            a();
            SharedPreferences sharedPreferences = getSharedPreferences("listgridview", 0);
            this.f33321A = sharedPreferences;
            this.f33322B = sharedPreferences.edit();
            int i9 = this.f33321A.getInt("vod", 0);
            AbstractC2237a.f44458N = i9;
            if (i9 == 1) {
                this.f33348n = this;
                this.f33353s = new LiveStreamDBHandler(this.f33348n);
                RecyclerView recyclerView2 = this.f33341g;
                if (recyclerView2 != null && this.f33348n != null) {
                    recyclerView2.setHasFixedSize(true);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f33348n);
                    this.f33323C = linearLayoutManager;
                    this.f33341g.setLayoutManager(linearLayoutManager);
                    recyclerView = this.f33341g;
                    cVar = new androidx.recyclerview.widget.c();
                    recyclerView.setItemAnimator(cVar);
                }
            } else {
                this.f33348n = this;
                this.f33353s = new LiveStreamDBHandler(this.f33348n);
                RecyclerView recyclerView3 = this.f33341g;
                if (recyclerView3 != null && this.f33348n != null) {
                    recyclerView3.setHasFixedSize(true);
                    GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f33348n, w.L(this.f33348n) + 1);
                    this.f33323C = gridLayoutManager;
                    this.f33341g.setLayoutManager(gridLayoutManager);
                    recyclerView = this.f33341g;
                    cVar = new androidx.recyclerview.widget.c();
                    recyclerView.setItemAnimator(cVar);
                }
            }
            if (this.f33348n != null) {
                LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f33348n);
                ArrayList<LiveStreamsDBModel> allLiveStreasWithCategoryId = liveStreamDBHandler.getAllLiveStreasWithCategoryId("0", "movie");
                this.f33334N = new ArrayList();
                this.f33335O = new ArrayList();
                this.f33336P = new ArrayList();
                this.f33337Q = new ArrayList();
                if (liveStreamDBHandler.getParentalStatusCount(SharepreferenceDBHandler.getUserID(this.f33348n)) <= 0 || allLiveStreasWithCategoryId == null) {
                    this.f33337Q = allLiveStreasWithCategoryId;
                } else {
                    ArrayList arrayListG1 = G1();
                    this.f33333M = arrayListG1;
                    if (arrayListG1 != null) {
                        this.f33336P = H1(allLiveStreasWithCategoryId, arrayListG1);
                    }
                    this.f33337Q = this.f33336P;
                }
                b();
                ArrayList arrayList = this.f33337Q;
                if (arrayList == null || this.f33341g == null || arrayList.size() == 0) {
                    ProgressDialog progressDialog = this.f33356v;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                    TextView textView = this.f33342h;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                } else {
                    ProgressDialog progressDialog2 = this.f33356v;
                    if (progressDialog2 != null) {
                        progressDialog2.dismiss();
                    }
                    i0 i0Var = new i0(allLiveStreasWithCategoryId, this.f33348n, true);
                    this.f33325E = i0Var;
                    this.f33341g.setAdapter(i0Var);
                }
            }
            ProgressDialog progressDialog3 = this.f33356v;
            if (progressDialog3 != null) {
                progressDialog3.dismiss();
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    public void a() {
        ProgressBar progressBar = this.f33340f;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    public void b() {
        ProgressBar progressBar = this.f33340f;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ProgressBar progressBar;
        j0 j0Var = this.f33327G;
        if (j0Var != null && (progressBar = f33320U) != null) {
            j0Var.F0(progressBar);
        }
        RecyclerView recyclerView = this.f33341g;
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
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("sort", 0);
        this.f33330J = sharedPreferences;
        this.f33331K = sharedPreferences.edit();
        if (this.f33330J.getString("sort", "").equals("")) {
            this.f33331K.putString("sort", "0");
            this.f33331K.commit();
        }
        Intent intent = getIntent();
        if (intent != null) {
            this.f33357w = intent.getStringExtra("category_id");
            this.f33358x = intent.getStringExtra("category_name");
        }
        this.f33348n = this;
        this.f33327G = new j0();
        this.f33347m.setOnClickListener(new c());
        LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f33348n);
        this.f33353s = liveStreamDBHandler;
        f33318S = liveStreamDBHandler.getAllMovieCategoriesHavingParentIdNotZero(this.f33357w);
        setContentView(a7.g.f12628E1);
        I1();
        a();
        this.f33328H = true;
        M1(f33318S);
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        AppBarLayout appBarLayout = this.f33339e;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(a7.e.f12034n));
        }
        E1();
        r1((Toolbar) findViewById(a7.f.kh));
        this.f33348n = this;
        if (!this.f33358x.isEmpty()) {
            this.f33345k.setText(this.f33358x);
        }
        this.f33345k.setSelected(true);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Toolbar toolbar;
        int i9;
        super.onCreateOptionsMenu(menu);
        if (this.f33328H) {
            toolbar = this.f33338d;
            i9 = a7.h.f12935r;
        } else {
            toolbar = this.f33338d;
            i9 = a7.h.f12936s;
        }
        toolbar.x(i9);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i10 = 0; i10 < this.f33338d.getChildCount(); i10++) {
            if (this.f33338d.getChildAt(i10) instanceof ActionMenuView) {
                ((Toolbar.g) this.f33338d.getChildAt(i10).getLayoutParams()).f39307a = 16;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x020b, code lost:
    
        if (r1.size() > 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0211  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onOptionsItemSelected(android.view.MenuItem r9) {
        /*
            Method dump skipped, instruction units count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSecondSubCategories.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        w.m(this.f33348n);
        w.z0(this.f33348n);
        getWindow().setFlags(1024, 1024);
        this.f33327G.F0(f33320U);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f33349o = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f33349o.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f33348n != null) {
            b();
        }
    }
}
