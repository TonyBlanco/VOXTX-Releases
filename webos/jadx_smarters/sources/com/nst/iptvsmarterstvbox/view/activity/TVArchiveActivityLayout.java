package com.nst.iptvsmarterstvbox.view.activity;

import P.AbstractC0980w;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
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
import androidx.appcompat.app.a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.model.FavouriteDBModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.PasswordStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import m7.AbstractC2237a;
import m7.w;
import q7.C2637v;
import q7.g0;

/* JADX INFO: loaded from: classes4.dex */
public class TVArchiveActivityLayout extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public DatabaseHandler f32681B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C2637v f32682C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ArrayList f32684E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ArrayList f32685F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ArrayList f32686G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ArrayList f32687H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ArrayList f32688I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ArrayList f32689J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public SharedPreferences f32690K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public SharedPreferences.Editor f32691L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public SharedPreferences f32692M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public SharedPreferences.Editor f32693N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public PopupWindow f32694O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public g0 f32695P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public GridLayoutManager f32696Q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Toolbar f32698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppBarLayout f32699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ProgressBar f32700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f32701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f32702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f32703i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f32704j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f32705k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f32706l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f32707m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f32708n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Context f32709o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SharedPreferences f32710p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LiveStreamDBHandler f32714t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SearchView f32716v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RecyclerView.o f32719y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public SharedPreferences f32720z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f32711q = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f32712r = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f32713s = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f32715u = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f32717w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f32718x = "";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ArrayList f32680A = new ArrayList();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ArrayList f32683D = new ArrayList();

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Thread f32697R = null;

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
            TVArchiveActivityLayout.this.f32694O.dismiss();
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RadioGroup f32723a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f32724c;

        public c(RadioGroup radioGroup, View view) {
            this.f32723a = radioGroup;
            this.f32724c = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharedPreferences.Editor editor;
            String str;
            RadioButton radioButton = (RadioButton) this.f32724c.findViewById(this.f32723a.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(TVArchiveActivityLayout.this.getResources().getString(a7.j.f13284i7))) {
                editor = TVArchiveActivityLayout.this.f32693N;
                str = "1";
            } else if (radioButton.getText().toString().equals(TVArchiveActivityLayout.this.getResources().getString(a7.j.f13254f7))) {
                editor = TVArchiveActivityLayout.this.f32693N;
                str = "2";
            } else if (radioButton.getText().toString().equals(TVArchiveActivityLayout.this.getResources().getString(a7.j.f13304k7))) {
                editor = TVArchiveActivityLayout.this.f32693N;
                str = "3";
            } else {
                editor = TVArchiveActivityLayout.this.f32693N;
                str = "0";
            }
            editor.putString("sort", str);
            TVArchiveActivityLayout.this.f32693N.apply();
            TVArchiveActivityLayout tVArchiveActivityLayout = TVArchiveActivityLayout.this;
            tVArchiveActivityLayout.f32690K = tVArchiveActivityLayout.getSharedPreferences("listgridview", 0);
            int i9 = TVArchiveActivityLayout.this.f32690K.getInt("livestream", 0);
            AbstractC2237a.f44456M = i9;
            if (i9 == 1) {
                TVArchiveActivityLayout.this.J1();
            } else {
                TVArchiveActivityLayout.this.K1();
            }
            TVArchiveActivityLayout.this.f32694O.dismiss();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(TVArchiveActivityLayout.this.f32709o);
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TVArchiveActivityLayout.this.onBackPressed();
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = w.R(TVArchiveActivityLayout.this.f32709o);
                String strA = w.A(string);
                TextView textView = TVArchiveActivityLayout.this.f32706l;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = TVArchiveActivityLayout.this.f32705k;
                if (textView2 != null) {
                    textView2.setText(strA);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class g implements DialogInterface.OnClickListener {
        public g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.dismiss();
        }
    }

    public class h implements DialogInterface.OnClickListener {
        public h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.n0(TVArchiveActivityLayout.this.f32709o);
        }
    }

    public class i implements SearchView.m {
        public i() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextChange(String str) {
            TextView textView;
            TVArchiveActivityLayout.this.f32703i.setVisibility(8);
            if (TVArchiveActivityLayout.this.f32682C == null || (textView = TVArchiveActivityLayout.this.f32702h) == null || textView.getVisibility() == 0) {
                return false;
            }
            TVArchiveActivityLayout.this.f32682C.s0(str, TVArchiveActivityLayout.this.f32703i);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class j implements DialogInterface.OnClickListener {
        public j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.m0(TVArchiveActivityLayout.this.f32709o);
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

    public class l implements DialogInterface.OnClickListener {
        public l() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    TVArchiveActivityLayout.this.D1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    private void C1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private ArrayList F1() {
        ArrayList<PasswordStatusDBModel> allPasswordStatus = this.f32714t.getAllPasswordStatus(SharepreferenceDBHandler.getUserID(this.f32709o));
        this.f32684E = allPasswordStatus;
        if (allPasswordStatus != null) {
            for (PasswordStatusDBModel passwordStatusDBModel : allPasswordStatus) {
                if (passwordStatusDBModel.getPasswordStatus().equals("1")) {
                    this.f32683D.add(passwordStatusDBModel.getPasswordStatusCategoryId());
                }
            }
        }
        return this.f32683D;
    }

    private ArrayList G1(ArrayList arrayList, ArrayList arrayList2) {
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
                        ArrayList arrayList3 = this.f32685F;
                        if (arrayList3 != null) {
                            arrayList3.add(liveStreamsDBModel);
                        }
                    }
                }
            }
        }
        return this.f32685F;
    }

    private void I1() {
        this.f32698d = (Toolbar) findViewById(a7.f.kh);
        this.f32699e = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f32700f = (ProgressBar) findViewById(a7.f.ec);
        this.f32701g = (RecyclerView) findViewById(a7.f.ub);
        this.f32702h = (TextView) findViewById(a7.f.sk);
        this.f32703i = (TextView) findViewById(a7.f.wk);
        this.f32704j = (TextView) findViewById(a7.f.lm);
        this.f32705k = (TextView) findViewById(a7.f.f12129E2);
        this.f32706l = (TextView) findViewById(a7.f.gh);
        this.f32707m = (ImageView) findViewById(a7.f.Xa);
        this.f32708n = (ImageView) findViewById(a7.f.f12141F4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J1() {
        this.f32709o = this;
        this.f32714t = new LiveStreamDBHandler(this.f32709o);
        RecyclerView recyclerView = this.f32701g;
        if (recyclerView == null || this.f32709o == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f32709o, w.L(this.f32709o) + 1);
        this.f32719y = gridLayoutManager;
        this.f32701g.setLayoutManager(gridLayoutManager);
        this.f32701g.setItemAnimator(new androidx.recyclerview.widget.c());
        this.f32720z = this.f32709o.getSharedPreferences("loginPrefs", 0);
        M1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K1() {
        this.f32709o = this;
        this.f32714t = new LiveStreamDBHandler(this.f32709o);
        RecyclerView recyclerView = this.f32701g;
        if (recyclerView == null || this.f32709o == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f32709o);
        this.f32719y = linearLayoutManager;
        this.f32701g.setLayoutManager(linearLayoutManager);
        this.f32701g.setItemAnimator(new androidx.recyclerview.widget.c());
        this.f32720z = this.f32709o.getSharedPreferences("loginPrefs", 0);
        M1();
    }

    private void M1() {
        try {
            if (this.f32709o != null) {
                LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f32709o);
                this.f32684E = new ArrayList();
                this.f32685F = new ArrayList();
                this.f32686G = new ArrayList();
                this.f32687H = new ArrayList();
                this.f32688I = new ArrayList();
                this.f32689J = new ArrayList();
                ArrayList<LiveStreamsDBModel> allLiveStreamsArchive = liveStreamDBHandler.getAllLiveStreamsArchive(this.f32717w);
                Log.e("channelAvailable size", " >>>>>>>> " + allLiveStreamsArchive.size());
                Log.e("channelAvailable", " >>>>>>>> " + allLiveStreamsArchive.toString());
                if (liveStreamDBHandler.getParentalStatusCount(SharepreferenceDBHandler.getUserID(this.f32709o)) > 0) {
                    ArrayList arrayListF1 = F1();
                    this.f32683D = arrayListF1;
                    if (arrayListF1 != null) {
                        this.f32686G = G1(allLiveStreamsArchive, arrayListF1);
                    }
                    this.f32687H = this.f32686G;
                } else {
                    this.f32687H = allLiveStreamsArchive;
                }
                if (this.f32717w.equals("-1")) {
                    b();
                    return;
                }
                ArrayList arrayList = this.f32687H;
                if (arrayList != null && this.f32701g != null && arrayList.size() != 0) {
                    b();
                    L1(this.f32687H);
                    return;
                }
                b();
                TextView textView = this.f32702h;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void N1(Activity activity) {
        try {
            View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(a7.g.f12619C4, (RelativeLayout) activity.findViewById(a7.f.Ve));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f32694O = popupWindow;
            popupWindow.setContentView(viewInflate);
            byte b9 = -1;
            this.f32694O.setWidth(-1);
            this.f32694O.setHeight(-1);
            this.f32694O.setFocusable(true);
            this.f32694O.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(a7.f.f12157H0);
            Button button2 = (Button) viewInflate.findViewById(a7.f.f12482o0);
            RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(a7.f.Kd);
            RadioButton radioButton = (RadioButton) viewInflate.findViewById(a7.f.rd);
            RadioButton radioButton2 = (RadioButton) viewInflate.findViewById(a7.f.md);
            RadioButton radioButton3 = (RadioButton) viewInflate.findViewById(a7.f.fd);
            RadioButton radioButton4 = (RadioButton) viewInflate.findViewById(a7.f.zd);
            String string = this.f32692M.getString("sort", "");
            switch (string.hashCode()) {
                case 49:
                    if (string.equals("1")) {
                        b9 = 0;
                    }
                    break;
                case 50:
                    if (string.equals("2")) {
                        b9 = 1;
                    }
                    break;
                case 51:
                    if (string.equals("3")) {
                        b9 = 2;
                    }
                    break;
            }
            if (b9 == 0) {
                radioButton2.setChecked(true);
            } else if (b9 == 1) {
                radioButton3.setChecked(true);
            } else if (b9 != 2) {
                radioButton.setChecked(true);
            } else {
                radioButton4.setChecked(true);
            }
            button2.setOnClickListener(new b());
            button.setOnClickListener(new c(radioGroup, viewInflate));
        } catch (NullPointerException | Exception unused) {
        }
    }

    public void D1() {
        runOnUiThread(new f());
    }

    public void E1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f32680A.clear();
        RecyclerView recyclerView = this.f32701g;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f32682C);
        }
        if (this.f32709o != null) {
            DatabaseHandler databaseHandler = new DatabaseHandler(this.f32709o);
            this.f32681B = databaseHandler;
            for (FavouriteDBModel favouriteDBModel : databaseHandler.getAllFavourites("live", SharepreferenceDBHandler.getUserID(this.f32709o))) {
                this.f32680A.add(new LiveStreamDBHandler(this.f32709o).getLiveStreamFavouriteRow(favouriteDBModel.getCategoryID(), String.valueOf(favouriteDBModel.getStreamID()), favouriteDBModel.getTimestamp(), ""));
            }
            b();
            if (this.f32701g != null && (arrayList2 = this.f32680A) != null && arrayList2.size() != 0) {
                C2637v c2637v = new C2637v(this.f32680A, this.f32709o);
                this.f32682C = c2637v;
                this.f32701g.setAdapter(c2637v);
                this.f32682C.w();
                this.f32702h.setVisibility(4);
            }
            if (this.f32702h == null || (arrayList = this.f32680A) == null || arrayList.size() != 0) {
                return;
            }
            RecyclerView recyclerView2 = this.f32701g;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.f32682C);
            }
            this.f32702h.setText(getResources().getString(a7.j.f13301k4));
            this.f32702h.setVisibility(0);
        }
    }

    public void H1() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    public void L1(ArrayList arrayList) {
        this.f32695P = new g0(arrayList, this.f32709o);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1);
        this.f32696Q = gridLayoutManager;
        this.f32701g.setLayoutManager(gridLayoutManager);
        this.f32701g.setItemAnimator(new androidx.recyclerview.widget.c());
        this.f32701g.setAdapter(this.f32695P);
        ProgressBar progressBar = this.f32700f;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    public void b() {
        ProgressBar progressBar = this.f32700f;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f32701g.setClickable(true);
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
        this.f32709o = this;
        H1();
        super.onCreate(bundle);
        setContentView(a7.g.f12836m1);
        I1();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        AppBarLayout appBarLayout = this.f32699e;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(a7.e.f12034n));
        }
        SharedPreferences sharedPreferences = getSharedPreferences("sort", 0);
        this.f32692M = sharedPreferences;
        this.f32693N = sharedPreferences.edit();
        if (this.f32692M.getString("sort", "").equals("")) {
            this.f32693N.putString("sort", "0");
            this.f32693N.apply();
        }
        Intent intent = getIntent();
        if (intent != null) {
            this.f32717w = intent.getStringExtra("category_id");
            this.f32718x = intent.getStringExtra("category_name");
        }
        this.f32714t = new LiveStreamDBHandler(this.f32709o);
        SharedPreferences sharedPreferences2 = getSharedPreferences("listgridview", 0);
        this.f32690K = sharedPreferences2;
        AbstractC2237a.f44456M = sharedPreferences2.getInt("livestream", 0);
        this.f32707m.setOnClickListener(new d());
        this.f32708n.setOnClickListener(new e());
        if (AbstractC2237a.f44456M == 1) {
            J1();
        } else {
            K1();
        }
        if (this.f32717w.equals("-1")) {
            E1();
        }
        C1();
        r1((Toolbar) findViewById(a7.f.kh));
        this.f32709o = this;
        Thread thread = this.f32697R;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new m());
            this.f32697R = thread2;
            thread2.start();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f32698d.x(a7.h.f12936s);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f32698d.getChildCount(); i9++) {
            if (this.f32698d.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f32698d.getChildAt(i9).getLayoutParams()).f39307a = 16;
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
        if (itemId == a7.f.f12390f && (context = this.f32709o) != null) {
            new a.C0158a(context, a7.k.f13456a).setTitle(getResources().getString(a7.j.f13250f3)).f(getResources().getString(a7.j.f13240e3)).j(getResources().getString(a7.j.f13132S8), new h()).g(getResources().getString(a7.j.f13231d4), new g()).n();
        }
        if (itemId == a7.f.f12400g) {
            SearchView searchView = (SearchView) AbstractC0980w.b(menuItem);
            this.f32716v = searchView;
            searchView.setQueryHint(getResources().getString(a7.j.f12950A6));
            this.f32716v.setIconifiedByDefault(false);
            this.f32716v.setOnQueryTextListener(new i());
            return true;
        }
        if (itemId == a7.f.gb) {
            a.C0158a c0158a = new a.C0158a(this);
            c0158a.setTitle(this.f32709o.getResources().getString(a7.j.f13397u0));
            c0158a.f(this.f32709o.getResources().getString(a7.j.f13134T0));
            c0158a.d(a7.e.f12056s1);
            c0158a.j(this.f32709o.getResources().getString(a7.j.f13132S8), new j());
            c0158a.g(this.f32709o.getResources().getString(a7.j.f13231d4), new k());
            c0158a.n();
        }
        if (itemId == a7.f.ib) {
            a.C0158a c0158a2 = new a.C0158a(this);
            c0158a2.setTitle(this.f32709o.getResources().getString(a7.j.f13397u0));
            c0158a2.f(this.f32709o.getResources().getString(a7.j.f13134T0));
            c0158a2.d(a7.e.f12056s1);
            c0158a2.j(this.f32709o.getResources().getString(a7.j.f13132S8), new l());
            c0158a2.g(this.f32709o.getResources().getString(a7.j.f13231d4), new a());
            c0158a2.n();
        }
        if (itemId == a7.f.f12509q6) {
            this.f32691L.putInt("livestream", 1);
            this.f32691L.commit();
            J1();
        }
        if (itemId == a7.f.f12549u6) {
            this.f32691L.putInt("livestream", 0);
            this.f32691L.commit();
            K1();
        }
        if (itemId == a7.f.mb) {
            N1(this);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f32697R;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f32697R.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        H1();
        super.onResume();
        Thread thread = this.f32697R;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new m());
            this.f32697R = thread2;
            thread2.start();
        }
        w.m(this.f32709o);
        w.z0(this.f32709o);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f32710p = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f32710p.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f32709o != null) {
            b();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        H1();
    }
}
