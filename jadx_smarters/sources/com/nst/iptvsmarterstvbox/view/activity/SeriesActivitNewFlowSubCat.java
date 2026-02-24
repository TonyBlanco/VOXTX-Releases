package com.nst.iptvsmarterstvbox.view.activity;

import android.R;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
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
import android.widget.Toast;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.model.callback.GetEpisdoeDetailsCallback;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.PasswordStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.SeriesRecentWatchDatabase;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m7.AbstractC2237a;
import m7.w;
import q7.V;
import q7.j0;
import q7.n0;

/* JADX INFO: loaded from: classes4.dex */
public class SeriesActivitNewFlowSubCat extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static ArrayList f31685f0 = new ArrayList();

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static ArrayList f31686g0 = new ArrayList();

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static ArrayList f31687h0 = new ArrayList();

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static ProgressBar f31688i0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public SharedPreferences.Editor f31689A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public RecyclerView.o f31690B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public SharedPreferences f31691C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public V f31692D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public DatabaseHandler f31694F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public j0 f31695G;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public PopupWindow f31697I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public GridLayoutManager f31698J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Handler f31699K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public MenuItem f31700L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Menu f31701M;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public String f31703O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ArrayList f31704P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ArrayList f31705Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public ArrayList f31706R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public ArrayList f31707S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public SeriesRecentWatchDatabase f31714Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Toolbar f31715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppBarLayout f31716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ProgressBar f31718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f31719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f31720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f31721i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f31722j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f31723k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RelativeLayout f31724l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f31725m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Context f31726n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SharedPreferences f31727o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LiveStreamDBHandler f31731s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ProgressDialog f31733u;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public n0 f31737y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public SharedPreferences f31738z;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f31728p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f31729q = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f31730r = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f31732t = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f31734v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f31735w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f31736x = false;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ArrayList f31693E = new ArrayList();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f31696H = false;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ArrayList f31702N = new ArrayList();

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public ArrayList f31708T = new ArrayList();

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Map f31709U = new HashMap();

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Map f31710V = new HashMap();

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public ArrayList f31711W = new ArrayList();

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ArrayList f31712X = new ArrayList();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ArrayList f31713Y = new ArrayList();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public List f31717e0 = new ArrayList();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(SeriesActivitNewFlowSubCat.this.f31726n);
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.m0(SeriesActivitNewFlowSubCat.this.f31726n);
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesActivitNewFlowSubCat.this.f31697I.dismiss();
        }
    }

    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RadioGroup f31743a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f31744c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Activity f31745d;

        public e(RadioGroup radioGroup, View view, Activity activity) {
            this.f31743a = radioGroup;
            this.f31744c = view;
            this.f31745d = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RadioButton radioButton = (RadioButton) this.f31744c.findViewById(this.f31743a.getCheckedRadioButtonId());
            SharepreferenceDBHandler.setSeriesSubCatSort(radioButton.getText().toString().equals(SeriesActivitNewFlowSubCat.this.getResources().getString(a7.j.f13284i7)) ? "1" : radioButton.getText().toString().equals(SeriesActivitNewFlowSubCat.this.getResources().getString(a7.j.f13254f7)) ? "2" : radioButton.getText().toString().equals(SeriesActivitNewFlowSubCat.this.getResources().getString(a7.j.f13304k7)) ? "3" : "0", this.f31745d);
            SeriesActivitNewFlowSubCat seriesActivitNewFlowSubCat = SeriesActivitNewFlowSubCat.this;
            seriesActivitNewFlowSubCat.f31738z = seriesActivitNewFlowSubCat.getSharedPreferences("listgridview", 0);
            int i9 = SeriesActivitNewFlowSubCat.this.f31738z.getInt("series", 0);
            AbstractC2237a.f44460O = i9;
            if (i9 == 1) {
                SeriesActivitNewFlowSubCat.this.N1();
            } else {
                SeriesActivitNewFlowSubCat.this.M1();
            }
            SeriesActivitNewFlowSubCat.this.f31697I.dismiss();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new i(SeriesActivitNewFlowSubCat.this, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            SeriesActivitNewFlowSubCat.this.f31697I.dismiss();
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesActivitNewFlowSubCat.this.f31697I.dismiss();
        }
    }

    public class h extends AsyncTask {
        public h() {
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String doInBackground(java.lang.String... r7) {
            /*
                r6 = this;
                r0 = 0
                r1 = r7[r0]     // Catch: java.lang.Exception -> L56
                int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L56
                r3 = -74801864(0xfffffffffb8a9d38, float:-1.4394515E36)
                r4 = 2
                r5 = 1
                if (r2 == r3) goto L2c
                r3 = -74797390(0xfffffffffb8aaeb2, float:-1.4401604E36)
                if (r2 == r3) goto L23
                r0 = 1997009972(0x7707f434, float:2.757473E33)
                if (r2 == r0) goto L19
                goto L36
            L19:
                java.lang.String r0 = "get_recent_watch"
                boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L56
                if (r0 == 0) goto L36
                r0 = 2
                goto L37
            L23:
                java.lang.String r2 = "get_fav"
                boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L56
                if (r1 == 0) goto L36
                goto L37
            L2c:
                java.lang.String r0 = "get_all"
                boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L56
                if (r0 == 0) goto L36
                r0 = 1
                goto L37
            L36:
                r0 = -1
            L37:
                if (r0 == 0) goto L4f
                if (r0 == r5) goto L46
                if (r0 == r4) goto L3f
                r7 = 0
                return r7
            L3f:
                com.nst.iptvsmarterstvbox.view.activity.SeriesActivitNewFlowSubCat r7 = com.nst.iptvsmarterstvbox.view.activity.SeriesActivitNewFlowSubCat.this     // Catch: java.lang.Exception -> L56
                java.lang.String r7 = com.nst.iptvsmarterstvbox.view.activity.SeriesActivitNewFlowSubCat.D1(r7)     // Catch: java.lang.Exception -> L56
                return r7
            L46:
                com.nst.iptvsmarterstvbox.view.activity.SeriesActivitNewFlowSubCat r0 = com.nst.iptvsmarterstvbox.view.activity.SeriesActivitNewFlowSubCat.this     // Catch: java.lang.Exception -> L56
                r7 = r7[r5]     // Catch: java.lang.Exception -> L56
                java.lang.String r7 = r0.I1(r7)     // Catch: java.lang.Exception -> L56
                return r7
            L4f:
                com.nst.iptvsmarterstvbox.view.activity.SeriesActivitNewFlowSubCat r7 = com.nst.iptvsmarterstvbox.view.activity.SeriesActivitNewFlowSubCat.this     // Catch: java.lang.Exception -> L56
                java.lang.String r7 = r7.J1()     // Catch: java.lang.Exception -> L56
                return r7
            L56:
                java.lang.String r7 = "error"
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SeriesActivitNewFlowSubCat.h.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            str.hashCode();
            byte b9 = -1;
            switch (str.hashCode()) {
                case -74801864:
                    if (str.equals("get_all")) {
                        b9 = 0;
                    }
                    break;
                case -74797390:
                    if (str.equals("get_fav")) {
                        b9 = 1;
                    }
                    break;
                case 1997009972:
                    if (str.equals("get_recent_watch")) {
                        b9 = 2;
                    }
                    break;
            }
            SeriesActivitNewFlowSubCat seriesActivitNewFlowSubCat = SeriesActivitNewFlowSubCat.this;
            switch (b9) {
                case 0:
                    seriesActivitNewFlowSubCat.u1();
                    break;
                case 1:
                    seriesActivitNewFlowSubCat.H1();
                    break;
                case 2:
                    seriesActivitNewFlowSubCat.v1();
                    break;
                default:
                    seriesActivitNewFlowSubCat.P1(false);
                    break;
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public class i extends AsyncTask {
        public i() {
        }

        public /* synthetic */ i(SeriesActivitNewFlowSubCat seriesActivitNewFlowSubCat, a aVar) {
            this();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            try {
                return SeriesActivitNewFlowSubCat.this.G1();
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            ProgressBar progressBar = SeriesActivitNewFlowSubCat.this.f31718f;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            if (bool.booleanValue()) {
                Toast.makeText(SeriesActivitNewFlowSubCat.this.f31726n, SeriesActivitNewFlowSubCat.this.getResources().getString(a7.j.f12953B), 0).show();
                SeriesActivitNewFlowSubCat.this.P1(false);
                return;
            }
            SeriesActivitNewFlowSubCat.this.f31717e0.clear();
            SeriesActivitNewFlowSubCat.this.f31719g.setVisibility(8);
            SeriesActivitNewFlowSubCat seriesActivitNewFlowSubCat = SeriesActivitNewFlowSubCat.this;
            seriesActivitNewFlowSubCat.f31721i.setText(seriesActivitNewFlowSubCat.getResources().getString(a7.j.f13281i4));
            SeriesActivitNewFlowSubCat.this.f31721i.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            ProgressBar progressBar = SeriesActivitNewFlowSubCat.this.f31718f;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        }
    }

    public class j implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f31751a;

        public j(View view) {
            this.f31751a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31751a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31751a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31751a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (z9) {
                b(1.15f);
                c(1.15f);
            } else {
                if (z9) {
                    return;
                }
                b(1.0f);
                c(1.0f);
                a(z9);
            }
        }
    }

    private void F1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private ArrayList K1() {
        ArrayList<PasswordStatusDBModel> allPasswordStatus = this.f31731s.getAllPasswordStatus(SharepreferenceDBHandler.getUserID(this.f31726n));
        this.f31707S = allPasswordStatus;
        if (allPasswordStatus != null) {
            for (PasswordStatusDBModel passwordStatusDBModel : allPasswordStatus) {
                if (passwordStatusDBModel.getPasswordStatus().equals("1")) {
                    this.f31702N.add(passwordStatusDBModel.getPasswordStatusCategoryId());
                }
            }
        }
        return this.f31702N;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M1() {
        this.f31726n = this;
        this.f31731s = new LiveStreamDBHandler(this.f31726n);
        RecyclerView recyclerView = this.f31719g;
        if (recyclerView == null || this.f31726n == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f31726n, w.L(this.f31726n) + 1);
        this.f31690B = gridLayoutManager;
        this.f31719g.setLayoutManager(gridLayoutManager);
        this.f31719g.setItemAnimator(new androidx.recyclerview.widget.c());
        this.f31691C = this.f31726n.getSharedPreferences("loginPrefs", 0);
        T1();
    }

    private void U1() {
        try {
            View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(a7.g.f12867r2, (RelativeLayout) findViewById(a7.f.We));
            PopupWindow popupWindow = new PopupWindow(this);
            this.f31697I = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.f31697I.setWidth(-1);
            this.f31697I.setHeight(-1);
            this.f31697I.setFocusable(true);
            this.f31697I.showAtLocation(viewInflate, 17, 0, 0);
            ((TextView) viewInflate.findViewById(a7.f.Ai)).setText(getResources().getString(a7.j.f13024I0));
            Button button = (Button) viewInflate.findViewById(a7.f.f12197L0);
            Button button2 = (Button) viewInflate.findViewById(a7.f.f12482o0);
            if (button2 != null) {
                button2.setOnFocusChangeListener(new w.k((View) button2, (Activity) this));
            }
            if (button != null) {
                button.setOnFocusChangeListener(new w.k((View) button, (Activity) this));
            }
            button.setOnClickListener(new f());
            if (button2 != null) {
                button2.setOnClickListener(new g());
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void V1(android.app.Activity r17) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SeriesActivitNewFlowSubCat.V1(android.app.Activity):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v1() {
    }

    public Boolean G1() {
        List list = this.f31717e0;
        if (list == null || list.size() <= 0) {
            return Boolean.FALSE;
        }
        if (this.f31714Z == null) {
            this.f31714Z = new SeriesRecentWatchDatabase(this.f31726n);
        }
        for (int i9 = 0; i9 < this.f31717e0.size(); i9++) {
            this.f31714Z.deleteSeriesRecentwatch(((GetEpisdoeDetailsCallback) this.f31717e0.get(i9)).getId());
        }
        return Boolean.TRUE;
    }

    public void H1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        try {
            if (this.f31719g != null && (arrayList2 = this.f31693E) != null && arrayList2.size() != 0) {
                V v9 = new V(this.f31693E, this.f31726n);
                this.f31692D = v9;
                this.f31719g.setAdapter(v9);
                this.f31692D.w();
                w.Q0(this.f31726n, getResources().getString(a7.j.f13365q8));
                this.f31720h.setVisibility(4);
            }
            if (this.f31720h != null && (arrayList = this.f31693E) != null && arrayList.size() == 0) {
                RecyclerView recyclerView = this.f31719g;
                if (recyclerView != null) {
                    recyclerView.setAdapter(this.f31692D);
                }
                this.f31720h.setText(getResources().getString(a7.j.f12958B4));
                this.f31720h.setVisibility(0);
            }
            ProgressBar progressBar = this.f31718f;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        } catch (Exception unused) {
        }
    }

    public String I1(String str) {
        try {
            this.f31707S = new ArrayList();
            this.f31704P = new ArrayList();
            this.f31705Q = new ArrayList();
            this.f31706R = new ArrayList();
            this.f31706R = this.f31731s.getAllSeriesStreamsWithCategoryId(str);
            return "get_all";
        } catch (Exception unused) {
            return "get_all";
        }
    }

    public String J1() {
        return "get_fav";
    }

    public final String L1() {
        this.f31702N = new ArrayList();
        new ArrayList();
        this.f31717e0 = new ArrayList();
        SeriesRecentWatchDatabase seriesRecentWatchDatabase = new SeriesRecentWatchDatabase(this.f31726n);
        this.f31714Z = seriesRecentWatchDatabase;
        ArrayList<GetEpisdoeDetailsCallback> allSeriesRecentWatch = seriesRecentWatchDatabase.getAllSeriesRecentWatch("getalldata");
        if (this.f31731s == null) {
            this.f31731s = new LiveStreamDBHandler(this.f31726n);
        }
        if (this.f31731s.getParentalStatusCount(SharepreferenceDBHandler.getUserID(this.f31726n)) <= 0) {
            this.f31717e0 = allSeriesRecentWatch;
            return "get_recent_watch";
        }
        this.f31702N = K1();
        for (GetEpisdoeDetailsCallback getEpisdoeDetailsCallback : allSeriesRecentWatch) {
            Iterator it = this.f31702N.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.f31717e0.add(getEpisdoeDetailsCallback);
                    break;
                }
                if (getEpisdoeDetailsCallback.getCategoryId().equals((String) it.next())) {
                    break;
                }
            }
        }
        return "get_recent_watch";
    }

    public final void N1() {
        this.f31726n = this;
        this.f31731s = new LiveStreamDBHandler(this.f31726n);
        RecyclerView recyclerView = this.f31719g;
        if (recyclerView == null || this.f31726n == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f31726n);
        this.f31690B = linearLayoutManager;
        this.f31719g.setLayoutManager(linearLayoutManager);
        this.f31719g.setItemAnimator(new androidx.recyclerview.widget.c());
        this.f31691C = this.f31726n.getSharedPreferences("loginPrefs", 0);
        T1();
    }

    public final void O1(ArrayList arrayList) {
        RecyclerView recyclerView = this.f31719g;
        if (recyclerView == null || this.f31726n == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        this.f31698J = gridLayoutManager;
        this.f31719g.setLayoutManager(gridLayoutManager);
        this.f31719g.setHasFixedSize(true);
        b();
        n0 n0Var = new n0(arrayList, this.f31726n, this.f31731s);
        this.f31737y = n0Var;
        this.f31719g.setAdapter(n0Var);
    }

    public void P1(boolean z9) {
        View view;
        ProgressBar progressBar = this.f31718f;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        if (z9) {
            this.f31720h.setVisibility(8);
            view = this.f31719g;
        } else {
            this.f31719g.setVisibility(8);
            this.f31720h.setText(getResources().getString(a7.j.f13281i4));
            view = this.f31720h;
        }
        view.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009e A[PHI: r0
      0x009e: PHI (r0v42 android.widget.ProgressBar) = (r0v33 android.widget.ProgressBar), (r0v115 android.widget.ProgressBar) binds: [B:21:0x01a3, B:11:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Q1() {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SeriesActivitNewFlowSubCat.Q1():void");
    }

    public final void R1() {
        SharedPreferences sharedPreferences = getSharedPreferences("listgridview", 0);
        this.f31738z = sharedPreferences;
        this.f31689A = sharedPreferences.edit();
        int i9 = this.f31738z.getInt("series", 0);
        AbstractC2237a.f44460O = i9;
        if (i9 == 1) {
            N1();
        } else {
            M1();
        }
    }

    public final void S1(ArrayList arrayList) {
        O1(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[Catch: NullPointerException | Exception -> 0x006f, TryCatch #0 {NullPointerException | Exception -> 0x006f, blocks: (B:2:0x0000, B:4:0x0004, B:18:0x0034, B:19:0x0047, B:20:0x0058, B:9:0x001b, B:12:0x0025, B:21:0x0068, B:23:0x006c), top: B:26:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T1() {
        /*
            r4 = this;
            android.content.Context r0 = r4.f31726n     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L68
            com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler r0 = new com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler     // Catch: java.lang.Throwable -> L6f
            android.content.Context r1 = r4.f31726n     // Catch: java.lang.Throwable -> L6f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = r4.f31734v     // Catch: java.lang.Throwable -> L6f
            int r1 = r0.hashCode()     // Catch: java.lang.Throwable -> L6f
            r2 = 1444(0x5a4, float:2.023E-42)
            r3 = 1
            if (r1 == r2) goto L25
            r2 = 1447(0x5a7, float:2.028E-42)
            if (r1 == r2) goto L1b
            goto L2f
        L1b:
            java.lang.String r1 = "-4"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L2f
            r0 = 1
            goto L30
        L25:
            java.lang.String r1 = "-1"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L2f
            r0 = 0
            goto L30
        L2f:
            r0 = -1
        L30:
            if (r0 == 0) goto L58
            if (r0 == r3) goto L47
            com.nst.iptvsmarterstvbox.view.activity.SeriesActivitNewFlowSubCat$h r0 = new com.nst.iptvsmarterstvbox.view.activity.SeriesActivitNewFlowSubCat$h     // Catch: java.lang.Throwable -> L6f
            r0.<init>()     // Catch: java.lang.Throwable -> L6f
            java.util.concurrent.Executor r1 = android.os.AsyncTask.THREAD_POOL_EXECUTOR     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = "get_all"
            java.lang.String r3 = r4.f31734v     // Catch: java.lang.Throwable -> L6f
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch: java.lang.Throwable -> L6f
            r0.executeOnExecutor(r1, r2)     // Catch: java.lang.Throwable -> L6f
            goto L68
        L47:
            com.nst.iptvsmarterstvbox.view.activity.SeriesActivitNewFlowSubCat$h r0 = new com.nst.iptvsmarterstvbox.view.activity.SeriesActivitNewFlowSubCat$h     // Catch: java.lang.Throwable -> L6f
            r0.<init>()     // Catch: java.lang.Throwable -> L6f
            java.util.concurrent.Executor r1 = android.os.AsyncTask.THREAD_POOL_EXECUTOR     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = "get_recent_watch"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L6f
            r0.executeOnExecutor(r1, r2)     // Catch: java.lang.Throwable -> L6f
            goto L68
        L58:
            com.nst.iptvsmarterstvbox.view.activity.SeriesActivitNewFlowSubCat$h r0 = new com.nst.iptvsmarterstvbox.view.activity.SeriesActivitNewFlowSubCat$h     // Catch: java.lang.Throwable -> L6f
            r0.<init>()     // Catch: java.lang.Throwable -> L6f
            java.util.concurrent.Executor r1 = android.os.AsyncTask.THREAD_POOL_EXECUTOR     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = "get_fav"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L6f
            r0.executeOnExecutor(r1, r2)     // Catch: java.lang.Throwable -> L6f
        L68:
            android.app.ProgressDialog r0 = r4.f31733u     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L6f
            r0.dismiss()     // Catch: java.lang.Throwable -> L6f
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SeriesActivitNewFlowSubCat.T1():void");
    }

    public void a() {
        ProgressBar progressBar = this.f31718f;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    public void b() {
        ProgressBar progressBar = this.f31718f;
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
        j0 j0Var = this.f31695G;
        if (j0Var != null) {
            j0Var.F0(f31688i0);
        }
        RecyclerView recyclerView = this.f31719g;
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
        setContentView(a7.g.f12657J0);
        getWindow().setFlags(1024, 1024);
        this.f31726n = this;
        Intent intent = getIntent();
        if (intent != null) {
            this.f31734v = intent.getStringExtra("category_id");
            this.f31735w = intent.getStringExtra("category_name");
        }
        this.f31707S = new ArrayList();
        this.f31704P = new ArrayList();
        this.f31705Q = new ArrayList();
        this.f31706R = new ArrayList();
        this.f31695G = new j0();
        this.f31694F = new DatabaseHandler(this.f31726n);
        this.f31731s = new LiveStreamDBHandler(this.f31726n);
        this.f31699K = new Handler();
        Q1();
        this.f31703O = this.f31703O;
        this.f31725m.setOnClickListener(new a());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Toolbar toolbar;
        int i9;
        super.onCreateOptionsMenu(menu);
        if (this.f31696H) {
            toolbar = this.f31715d;
            i9 = a7.h.f12935r;
        } else {
            toolbar = this.f31715d;
            i9 = a7.h.f12936s;
        }
        toolbar.x(i9);
        this.f31701M = menu;
        this.f31700L = menu.getItem(2).getSubMenu().findItem(a7.f.f12239P2);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i10 = 0; i10 < this.f31715d.getChildCount(); i10++) {
            if (this.f31715d.getChildAt(i10) instanceof ActionMenuView) {
                ((Toolbar.g) this.f31715d.getChildAt(i10).getLayoutParams()).f39307a = 16;
            }
        }
        if (this.f31734v.equalsIgnoreCase("-4")) {
            this.f31700L = menu.getItem(2).getSubMenu().findItem(a7.f.f12549u6).setVisible(true);
            this.f31700L = menu.getItem(2).getSubMenu().findItem(a7.f.f12509q6).setVisible(true);
            if (this.f31714Z == null) {
                this.f31714Z = new SeriesRecentWatchDatabase(this.f31726n);
            }
            if (this.f31714Z.getSeriesRecentwatchmCount() > 0) {
                menu.getItem(2).getSubMenu().findItem(a7.f.Db).setVisible(true);
            }
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        if (i9 != 82) {
            return super.onKeyUp(i9, keyEvent);
        }
        Menu menu = this.f31701M;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(a7.f.f12239P2, 0);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0075  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onOptionsItemSelected(android.view.MenuItem r8) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SeriesActivitNewFlowSubCat.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        ProgressBar progressBar;
        super.onResume();
        w.m(this.f31726n);
        w.z0(this.f31726n);
        getWindow().setFlags(1024, 1024);
        j0 j0Var = this.f31695G;
        if (j0Var != null && (progressBar = f31688i0) != null) {
            j0Var.F0(progressBar);
        }
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f31727o = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f31727o.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        }
    }

    public void u1() {
        try {
            ArrayList arrayList = this.f31706R;
            if (arrayList == null || this.f31719g == null || arrayList.size() == 0) {
                TextView textView = this.f31720h;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            } else {
                V v9 = new V(this.f31706R, this.f31726n);
                this.f31692D = v9;
                this.f31719g.setAdapter(v9);
                w.Q0(this.f31726n, getResources().getString(a7.j.f13365q8));
            }
            ProgressBar progressBar = this.f31718f;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        } catch (Exception unused) {
        }
    }
}
