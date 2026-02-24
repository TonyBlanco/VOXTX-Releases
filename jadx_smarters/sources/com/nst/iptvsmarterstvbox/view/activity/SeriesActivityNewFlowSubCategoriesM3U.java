package com.nst.iptvsmarterstvbox.view.activity;

import android.R;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
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
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.model.FavouriteM3UModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.VodAllCategoriesSingleton;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.PasswordStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.RecentWatchDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import java.util.ArrayList;
import java.util.Iterator;
import m7.AbstractC2237a;
import m7.w;
import q7.W;
import q7.j0;
import q7.n0;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class SeriesActivityNewFlowSubCategoriesM3U extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static ArrayList f31820X = new ArrayList();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static ArrayList f31821Y = new ArrayList();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static ArrayList f31822Z = new ArrayList();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static ProgressBar f31823e0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public SearchView f31824A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ProgressDialog f31825B;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public n0 f31829F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public SharedPreferences f31830G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public SharedPreferences.Editor f31831H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public RecyclerView.o f31832I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public SharedPreferences f31833J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public W f31834K;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public j0 f31836M;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public PopupWindow f31838O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public SharedPreferences f31839P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public SharedPreferences.Editor f31840Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public GridLayoutManager f31841R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Handler f31842S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public MenuItem f31843T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Menu f31844U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public RecentWatchDBHandler f31845V;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Toolbar f31847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppBarLayout f31848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ProgressBar f31849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f31850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f31851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f31852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f31853j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f31854k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RelativeLayout f31855l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f31856m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Context f31857n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SharedPreferences f31858o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f31860q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f31861r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f31862s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f31863t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f31864u;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public LiveStreamDBHandler f31868y;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f31859p = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f31865v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f31866w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f31867x = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f31869z = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f31826C = "";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f31827D = "";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f31828E = false;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ArrayList f31835L = new ArrayList();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f31837N = false;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f31846W = true;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.m0(SeriesActivityNewFlowSubCategoriesM3U.this.f31857n);
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
            SeriesActivityNewFlowSubCategoriesM3U.this.f31838O.dismiss();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Menu menu = SeriesActivityNewFlowSubCategoriesM3U.this.f31844U;
            if (menu != null) {
                menu.getItem(1).getSubMenu().findItem(a7.f.Db).setVisible(false);
            }
            SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U = SeriesActivityNewFlowSubCategoriesM3U.this;
            seriesActivityNewFlowSubCategoriesM3U.f31845V.deleteALLRecentwatch("movie", SharepreferenceDBHandler.getUserID(seriesActivityNewFlowSubCategoriesM3U.f31857n));
            SeriesActivityNewFlowSubCategoriesM3U.this.f31863t.clear();
            SeriesActivityNewFlowSubCategoriesM3U.this.f31834K.w();
            SeriesActivityNewFlowSubCategoriesM3U.this.f31852i.setVisibility(0);
            Toast.makeText(SeriesActivityNewFlowSubCategoriesM3U.this.f31857n, SeriesActivityNewFlowSubCategoriesM3U.this.getResources().getString(a7.j.f12943A), 0).show();
            SeriesActivityNewFlowSubCategoriesM3U.this.f31838O.dismiss();
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesActivityNewFlowSubCategoriesM3U.this.f31838O.dismiss();
        }
    }

    public class h implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RadioGroup f31877a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f31878c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Activity f31879d;

        public h(RadioGroup radioGroup, View view, Activity activity) {
            this.f31877a = radioGroup;
            this.f31878c = view;
            this.f31879d = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RadioButton radioButton = (RadioButton) this.f31878c.findViewById(this.f31877a.getCheckedRadioButtonId());
            SharepreferenceDBHandler.setSeriesSubCatSort(radioButton.getText().toString().equals(SeriesActivityNewFlowSubCategoriesM3U.this.getResources().getString(a7.j.f13284i7)) ? "1" : radioButton.getText().toString().equals(SeriesActivityNewFlowSubCategoriesM3U.this.getResources().getString(a7.j.f13254f7)) ? "2" : radioButton.getText().toString().equals(SeriesActivityNewFlowSubCategoriesM3U.this.getResources().getString(a7.j.f13304k7)) ? "3" : "0", this.f31879d);
            SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U = SeriesActivityNewFlowSubCategoriesM3U.this;
            seriesActivityNewFlowSubCategoriesM3U.f31830G = seriesActivityNewFlowSubCategoriesM3U.getSharedPreferences("listgridview", 0);
            int i9 = SeriesActivityNewFlowSubCategoriesM3U.this.f31830G.getInt("series", 0);
            AbstractC2237a.f44460O = i9;
            if (i9 == 1) {
                SeriesActivityNewFlowSubCategoriesM3U.this.W1();
            } else {
                SeriesActivityNewFlowSubCategoriesM3U.this.V1();
            }
            SeriesActivityNewFlowSubCategoriesM3U.this.f31838O.dismiss();
        }
    }

    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesActivityNewFlowSubCategoriesM3U.this.f31838O.dismiss();
        }
    }

    public class j implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecentWatchDBHandler f31882a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f31883c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f31884d;

        public j(RecentWatchDBHandler recentWatchDBHandler, int i9, Context context) {
            this.f31882a = recentWatchDBHandler;
            this.f31883c = i9;
            this.f31884d = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecentWatchDBHandler recentWatchDBHandler = this.f31882a;
            if (recentWatchDBHandler != null) {
                recentWatchDBHandler.deleteRecentwatch(this.f31883c, "movie");
            }
            int i9 = 0;
            Toast.makeText(this.f31884d, SeriesActivityNewFlowSubCategoriesM3U.this.getResources().getString(a7.j.f13037J3), 0).show();
            if (SeriesActivityNewFlowSubCategoriesM3U.this.f31834K != null) {
                SeriesActivityNewFlowSubCategoriesM3U.this.f31860q = new ArrayList();
                SeriesActivityNewFlowSubCategoriesM3U.this.f31861r = new ArrayList();
                SeriesActivityNewFlowSubCategoriesM3U.this.f31862s = new ArrayList();
                ArrayList<LiveStreamsDBModel> allLiveStreasWithCategoryId = this.f31882a.getAllLiveStreasWithCategoryId("movie", SharepreferenceDBHandler.getUserID(this.f31884d), "getalldata");
                if (SeriesActivityNewFlowSubCategoriesM3U.this.f31868y.getParentalStatusCount(SharepreferenceDBHandler.getUserID(this.f31884d)) <= 0 || allLiveStreasWithCategoryId == null) {
                    SeriesActivityNewFlowSubCategoriesM3U.this.f31863t.clear();
                    if (allLiveStreasWithCategoryId.isEmpty()) {
                        SeriesActivityNewFlowSubCategoriesM3U.this.f31852i.setVisibility(0);
                        SeriesActivityNewFlowSubCategoriesM3U.this.f31834K.w();
                    } else {
                        while (i9 < allLiveStreasWithCategoryId.size()) {
                            SeriesActivityNewFlowSubCategoriesM3U.this.f31863t.add(allLiveStreasWithCategoryId.get(i9));
                            SeriesActivityNewFlowSubCategoriesM3U.this.f31834K.w();
                            i9++;
                        }
                    }
                } else {
                    SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U = SeriesActivityNewFlowSubCategoriesM3U.this;
                    seriesActivityNewFlowSubCategoriesM3U.f31859p = seriesActivityNewFlowSubCategoriesM3U.S1();
                    if (SeriesActivityNewFlowSubCategoriesM3U.this.f31859p != null) {
                        SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U2 = SeriesActivityNewFlowSubCategoriesM3U.this;
                        seriesActivityNewFlowSubCategoriesM3U2.f31862s = seriesActivityNewFlowSubCategoriesM3U2.T1(allLiveStreasWithCategoryId, seriesActivityNewFlowSubCategoriesM3U2.f31859p);
                    }
                    SeriesActivityNewFlowSubCategoriesM3U.this.f31863t.clear();
                    if (SeriesActivityNewFlowSubCategoriesM3U.this.f31862s != null) {
                        while (i9 < SeriesActivityNewFlowSubCategoriesM3U.this.f31862s.size()) {
                            SeriesActivityNewFlowSubCategoriesM3U.this.f31863t.add((LiveStreamsDBModel) SeriesActivityNewFlowSubCategoriesM3U.this.f31862s.get(i9));
                            SeriesActivityNewFlowSubCategoriesM3U.this.f31834K.w();
                            i9++;
                        }
                    }
                }
                SeriesActivityNewFlowSubCategoriesM3U.this.f31838O.dismiss();
            }
        }
    }

    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SeriesActivityNewFlowSubCategoriesM3U.this.Y1();
            ProgressBar progressBar = SeriesActivityNewFlowSubCategoriesM3U.this.f31849f;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
    }

    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SeriesActivityNewFlowSubCategoriesM3U.this.Y1();
            ProgressBar progressBar = SeriesActivityNewFlowSubCategoriesM3U.this.f31849f;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SeriesActivityNewFlowSubCategoriesM3U.this.Y1();
            ProgressBar progressBar = SeriesActivityNewFlowSubCategoriesM3U.this.f31849f;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
    }

    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SeriesActivityNewFlowSubCategoriesM3U.this.Z1(SeriesActivityNewFlowSubCategoriesM3U.f31821Y);
            ProgressBar progressBar = SeriesActivityNewFlowSubCategoriesM3U.this.f31849f;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
    }

    public class o implements View.OnClickListener {
        public o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(SeriesActivityNewFlowSubCategoriesM3U.this.f31857n);
        }
    }

    public class p implements DialogInterface.OnClickListener {
        public p() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.dismiss();
        }
    }

    public class q implements DialogInterface.OnClickListener {
        public q() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.n0(SeriesActivityNewFlowSubCategoriesM3U.this.f31857n);
        }
    }

    public class r implements SearchView.m {
        public r() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextChange(String str) {
            TextView textView;
            SeriesActivityNewFlowSubCategoriesM3U.this.f31852i.setVisibility(8);
            if (SeriesActivityNewFlowSubCategoriesM3U.this.f31829F == null || (textView = SeriesActivityNewFlowSubCategoriesM3U.this.f31851h) == null || textView.getVisibility() == 0) {
                return false;
            }
            SeriesActivityNewFlowSubCategoriesM3U.this.f31829F.z0(str, SeriesActivityNewFlowSubCategoriesM3U.this.f31852i);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class s implements SearchView.m {
        public s() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextChange(String str) {
            TextView textView;
            SeriesActivityNewFlowSubCategoriesM3U.this.f31852i.setVisibility(8);
            if (SeriesActivityNewFlowSubCategoriesM3U.this.f31834K == null || (textView = SeriesActivityNewFlowSubCategoriesM3U.this.f31851h) == null || textView.getVisibility() == 0) {
                return false;
            }
            SeriesActivityNewFlowSubCategoriesM3U.this.f31834K.F0(str, SeriesActivityNewFlowSubCategoriesM3U.this.f31852i);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class t implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f31895a;

        public t(View view) {
            this.f31895a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31895a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31895a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31895a, "scaleY", f9);
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

    private void P1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList S1() {
        ArrayList<PasswordStatusDBModel> allPasswordStatus = this.f31868y.getAllPasswordStatus(SharepreferenceDBHandler.getUserID(this.f31857n));
        this.f31860q = allPasswordStatus;
        if (allPasswordStatus != null) {
            for (PasswordStatusDBModel passwordStatusDBModel : allPasswordStatus) {
                if (passwordStatusDBModel.getPasswordStatus().equals("1")) {
                    this.f31859p.add(passwordStatusDBModel.getPasswordStatusCategoryId());
                }
            }
        }
        return this.f31859p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList T1(ArrayList arrayList, ArrayList arrayList2) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LiveStreamsDBModel liveStreamsDBModel = (LiveStreamsDBModel) it.next();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    this.f31861r.add(liveStreamsDBModel);
                    liveStreamsDBModel.getCategoryId();
                    break;
                }
                if (liveStreamsDBModel.getCategoryId().equals((String) it2.next())) {
                    break;
                }
            }
        }
        return this.f31861r;
    }

    private ArrayList U1(ArrayList arrayList, ArrayList arrayList2) {
        this.f31864u = new ArrayList();
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FavouriteM3UModel favouriteM3UModel = (FavouriteM3UModel) it.next();
            if (arrayList2 != null) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        this.f31864u.add(favouriteM3UModel);
                        break;
                    }
                    if (favouriteM3UModel.getCategoryID().equals((String) it2.next())) {
                        break;
                    }
                }
            }
        }
        return this.f31864u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V1() {
        this.f31857n = this;
        this.f31868y = new LiveStreamDBHandler(this.f31857n);
        RecyclerView recyclerView = this.f31850g;
        if (recyclerView == null || this.f31857n == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f31857n, w.L(this.f31857n) + 1);
        this.f31832I = gridLayoutManager;
        this.f31850g.setLayoutManager(gridLayoutManager);
        this.f31850g.setItemAnimator(new androidx.recyclerview.widget.c());
        this.f31833J = this.f31857n.getSharedPreferences("loginPrefs", 0);
        a2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W1() {
        this.f31857n = this;
        this.f31868y = new LiveStreamDBHandler(this.f31857n);
        RecyclerView recyclerView = this.f31850g;
        if (recyclerView == null || this.f31857n == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f31857n);
        this.f31832I = linearLayoutManager;
        this.f31850g.setLayoutManager(linearLayoutManager);
        this.f31850g.setItemAnimator(new androidx.recyclerview.widget.c());
        this.f31833J = this.f31857n.getSharedPreferences("loginPrefs", 0);
        a2();
    }

    private void X1(ArrayList arrayList) {
        RecyclerView recyclerView = this.f31850g;
        if (recyclerView == null || this.f31857n == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        this.f31841R = new C2858a(this.f31857n).A().equals(AbstractC2237a.f44453K0) ? new GridLayoutManager(this, 2) : new GridLayoutManager(this, 2);
        this.f31850g.setLayoutManager(this.f31841R);
        this.f31850g.setHasFixedSize(true);
        b();
        n0 n0Var = new n0(arrayList, this.f31857n, this.f31868y);
        this.f31829F = n0Var;
        this.f31850g.setAdapter(n0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y1() {
        SharedPreferences sharedPreferences = getSharedPreferences("listgridview", 0);
        this.f31830G = sharedPreferences;
        this.f31831H = sharedPreferences.edit();
        int i9 = this.f31830G.getInt("series", 0);
        AbstractC2237a.f44460O = i9;
        if (i9 == 1) {
            W1();
        } else {
            V1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z1(ArrayList arrayList) {
        X1(arrayList);
    }

    private void a2() {
        TextView textView;
        Context context;
        Resources resources;
        int i9;
        try {
            if (this.f31857n != null) {
                LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f31857n);
                RecentWatchDBHandler recentWatchDBHandler = new RecentWatchDBHandler(this.f31857n);
                if (this.f31826C.equals("-1")) {
                    R1();
                } else if (this.f31826C.equals("-4")) {
                    this.f31860q = new ArrayList();
                    this.f31861r = new ArrayList();
                    this.f31862s = new ArrayList();
                    this.f31863t = new ArrayList();
                    ArrayList<LiveStreamsDBModel> allLiveStreasWithCategoryId = recentWatchDBHandler.getAllLiveStreasWithCategoryId("movie", SharepreferenceDBHandler.getUserID(this.f31857n), "getalldata");
                    if (liveStreamDBHandler.getParentalStatusCount(SharepreferenceDBHandler.getUserID(this.f31857n)) <= 0 || allLiveStreasWithCategoryId == null) {
                        this.f31863t = allLiveStreasWithCategoryId;
                    } else {
                        ArrayList arrayListS1 = S1();
                        this.f31859p = arrayListS1;
                        if (arrayListS1 != null) {
                            this.f31862s = T1(allLiveStreasWithCategoryId, arrayListS1);
                        }
                        this.f31863t = this.f31862s;
                    }
                    b();
                    ProgressDialog progressDialog = this.f31825B;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                    ArrayList arrayList = this.f31863t;
                    if (arrayList == null || this.f31850g == null || arrayList.size() == 0) {
                        textView = this.f31851h;
                        if (textView != null) {
                            textView.setVisibility(0);
                        }
                    } else {
                        this.f31846W = false;
                        this.f31834K = new W(this.f31863t, this.f31857n, false, this, this.f31827D);
                        VodAllCategoriesSingleton.getInstance().setVodList(this.f31863t);
                        this.f31850g.setAdapter(this.f31834K);
                        context = this.f31857n;
                        resources = getResources();
                        i9 = a7.j.f13365q8;
                        w.Q0(context, resources.getString(i9));
                    }
                } else if (this.f31826C.equals("0")) {
                    this.f31860q = new ArrayList();
                    this.f31861r = new ArrayList();
                    this.f31862s = new ArrayList();
                    this.f31863t = new ArrayList();
                    ArrayList<LiveStreamsDBModel> allLiveStreasWithCategoryId2 = liveStreamDBHandler.getAllLiveStreasWithCategoryId(this.f31826C, "series");
                    if (liveStreamDBHandler.getParentalStatusCount(SharepreferenceDBHandler.getUserID(this.f31857n)) <= 0 || allLiveStreasWithCategoryId2 == null) {
                        this.f31863t = allLiveStreasWithCategoryId2;
                    } else {
                        ArrayList arrayListS12 = S1();
                        this.f31859p = arrayListS12;
                        if (arrayListS12 != null) {
                            this.f31862s = T1(allLiveStreasWithCategoryId2, arrayListS12);
                        }
                        this.f31863t = this.f31862s;
                    }
                    b();
                    ProgressDialog progressDialog2 = this.f31825B;
                    if (progressDialog2 != null) {
                        progressDialog2.dismiss();
                    }
                    ArrayList arrayList2 = this.f31863t;
                    if (arrayList2 == null || this.f31850g == null || arrayList2.size() == 0) {
                        textView = this.f31851h;
                        if (textView != null) {
                            textView.setVisibility(0);
                        }
                    } else {
                        this.f31846W = true;
                        this.f31834K = new W(this.f31863t, this.f31857n, true, this.f31827D);
                        VodAllCategoriesSingleton.getInstance().setVodList(this.f31863t);
                        this.f31850g.setAdapter(this.f31834K);
                        context = this.f31857n;
                        resources = getResources();
                        i9 = a7.j.f13365q8;
                        w.Q0(context, resources.getString(i9));
                    }
                } else {
                    ArrayList<LiveStreamsDBModel> allLiveStreasWithCategoryId3 = liveStreamDBHandler.getAllLiveStreasWithCategoryId(this.f31826C, "series");
                    b();
                    ProgressDialog progressDialog3 = this.f31825B;
                    if (progressDialog3 != null) {
                        progressDialog3.dismiss();
                    }
                    if (allLiveStreasWithCategoryId3 != null && this.f31850g != null && allLiveStreasWithCategoryId3.size() != 0) {
                        this.f31846W = true;
                        this.f31834K = new W(allLiveStreasWithCategoryId3, this.f31857n, true, this.f31827D);
                        VodAllCategoriesSingleton.getInstance().setVodList(allLiveStreasWithCategoryId3);
                        this.f31850g.setAdapter(this.f31834K);
                        this.f31834K.w();
                        context = this.f31857n;
                        resources = getResources();
                        i9 = a7.j.f13365q8;
                        w.Q0(context, resources.getString(i9));
                    } else if (this.f31851h != null) {
                        ProgressBar progressBar = this.f31849f;
                        if (progressBar != null) {
                            progressBar.setVisibility(8);
                        }
                        textView = this.f31851h;
                        textView.setVisibility(0);
                    }
                }
            }
            ProgressDialog progressDialog4 = this.f31825B;
            if (progressDialog4 != null) {
                progressDialog4.dismiss();
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    private void b2() {
        View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(a7.g.f12867r2, (RelativeLayout) findViewById(a7.f.We));
        PopupWindow popupWindow = new PopupWindow(this);
        this.f31838O = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.f31838O.setWidth(-1);
        this.f31838O.setHeight(-1);
        this.f31838O.setFocusable(true);
        this.f31838O.showAtLocation(viewInflate, 17, 0, 0);
        ((TextView) viewInflate.findViewById(a7.f.Ai)).setText(getResources().getString(a7.j.f13054L0));
        Button button = (Button) viewInflate.findViewById(a7.f.f12197L0);
        Button button2 = (Button) viewInflate.findViewById(a7.f.f12482o0);
        if (button != null) {
            button.setOnFocusChangeListener(new w.k((View) button, (Activity) this));
        }
        if (button2 != null) {
            button2.setOnFocusChangeListener(new w.k((View) button2, (Activity) this));
        }
        button2.setOnClickListener(new e());
        if (button != null) {
            button.setOnClickListener(new f());
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void c2(Activity activity) {
        try {
            View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(a7.g.f12619C4, (RelativeLayout) activity.findViewById(a7.f.Ve));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f31838O = popupWindow;
            popupWindow.setContentView(viewInflate);
            byte b9 = -1;
            this.f31838O.setWidth(-1);
            this.f31838O.setHeight(-1);
            this.f31838O.setFocusable(true);
            this.f31838O.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(a7.f.f12157H0);
            Button button2 = (Button) viewInflate.findViewById(a7.f.f12482o0);
            RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(a7.f.Kd);
            RadioButton radioButton = (RadioButton) viewInflate.findViewById(a7.f.rd);
            RadioButton radioButton2 = (RadioButton) viewInflate.findViewById(a7.f.md);
            radioButton2.setVisibility(8);
            RadioButton radioButton3 = (RadioButton) viewInflate.findViewById(a7.f.gd);
            radioButton3.setVisibility(8);
            RadioButton radioButton4 = (RadioButton) viewInflate.findViewById(a7.f.hd);
            radioButton4.setVisibility(8);
            RadioButton radioButton5 = (RadioButton) viewInflate.findViewById(a7.f.fd);
            RadioButton radioButton6 = (RadioButton) viewInflate.findViewById(a7.f.zd);
            radioButton.setOnFocusChangeListener(new t(radioButton));
            radioButton2.setOnFocusChangeListener(new t(radioButton2));
            radioButton5.setOnFocusChangeListener(new t(radioButton5));
            radioButton6.setOnFocusChangeListener(new t(radioButton6));
            radioButton3.setOnFocusChangeListener(new t(radioButton3));
            radioButton4.setOnFocusChangeListener(new t(radioButton4));
            String seriesSubCatSort = SharepreferenceDBHandler.getSeriesSubCatSort(activity);
            switch (seriesSubCatSort.hashCode()) {
                case 49:
                    if (seriesSubCatSort.equals("1")) {
                        b9 = 0;
                    }
                    break;
                case 50:
                    if (seriesSubCatSort.equals("2")) {
                        b9 = 1;
                    }
                    break;
                case 51:
                    if (seriesSubCatSort.equals("3")) {
                        b9 = 2;
                    }
                    break;
            }
            if (b9 == 0) {
                radioButton2.setChecked(true);
            } else if (b9 == 1) {
                radioButton5.setChecked(true);
            } else if (b9 != 2) {
                radioButton.setChecked(true);
            } else {
                radioButton6.setChecked(true);
            }
            button2.setOnClickListener(new g());
            button.setOnClickListener(new h(radioGroup, viewInflate, activity));
        } catch (NullPointerException | Exception unused) {
        }
    }

    public void Q1(int i9, String str, Context context, RecentWatchDBHandler recentWatchDBHandler) {
        try {
            View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(a7.g.f12867r2, (RelativeLayout) findViewById(a7.f.We));
            PopupWindow popupWindow = new PopupWindow(this);
            this.f31838O = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.f31838O.setWidth(-1);
            this.f31838O.setHeight(-1);
            this.f31838O.setFocusable(true);
            this.f31838O.showAtLocation(viewInflate, 17, 0, 0);
            ((TextView) viewInflate.findViewById(a7.f.Ai)).setText(getResources().getString(a7.j.f13064M0));
            Button button = (Button) viewInflate.findViewById(a7.f.f12197L0);
            Button button2 = (Button) viewInflate.findViewById(a7.f.f12482o0);
            if (button != null) {
                button.setOnFocusChangeListener(new w.k((View) button, (Activity) this));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new w.k((View) button2, (Activity) this));
            }
            button2.setOnClickListener(new i());
            if (button != null) {
                button.setOnClickListener(new j(recentWatchDBHandler, i9, context));
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    public void R1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        new ArrayList();
        this.f31835L.clear();
        RecyclerView recyclerView = this.f31850g;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f31834K);
        }
        if (this.f31857n != null) {
            ArrayList<FavouriteM3UModel> favouriteM3U = this.f31868y.getFavouriteM3U("series");
            if (this.f31859p != null) {
                this.f31859p = S1();
            }
            ArrayList arrayList3 = this.f31859p;
            if (arrayList3 != null && arrayList3.size() > 0 && favouriteM3U != null && favouriteM3U.size() > 0) {
                favouriteM3U = U1(favouriteM3U, this.f31859p);
            }
            if (favouriteM3U != null && favouriteM3U.size() > 0) {
                for (FavouriteM3UModel favouriteM3UModel : favouriteM3U) {
                    ArrayList<LiveStreamsDBModel> m3UFavouriteRow = this.f31868y.getM3UFavouriteRow(favouriteM3UModel.getCategoryID(), favouriteM3UModel.getUrl(), favouriteM3UModel.getTimestamp());
                    if (m3UFavouriteRow != null && m3UFavouriteRow.size() > 0) {
                        this.f31835L.add(m3UFavouriteRow.get(0));
                    }
                }
            }
            b();
            if (this.f31850g != null && (arrayList2 = this.f31835L) != null && arrayList2.size() != 0) {
                this.f31834K = new W(this.f31835L, this.f31857n, true, this.f31827D);
                VodAllCategoriesSingleton.getInstance().setVodList(this.f31835L);
                this.f31850g.setAdapter(this.f31834K);
                w.Q0(this.f31857n, getResources().getString(a7.j.f13365q8));
                this.f31851h.setVisibility(4);
            }
            if (this.f31851h == null || (arrayList = this.f31835L) == null || arrayList.size() != 0) {
                return;
            }
            RecyclerView recyclerView2 = this.f31850g;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.f31834K);
            }
            ProgressBar progressBar = this.f31849f;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            this.f31851h.setText(getResources().getString(a7.j.f13311l4));
            this.f31851h.setVisibility(0);
        }
    }

    public void a() {
        ProgressBar progressBar = this.f31849f;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    public void b() {
    }

    @Override // androidx.appcompat.app.b, D.AbstractActivityC0525h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return keyCode == 82 ? keyEvent.getAction() == 0 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent) : super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ProgressBar progressBar;
        j0 j0Var = this.f31836M;
        if (j0Var != null && (progressBar = f31823e0) != null) {
            j0Var.F0(progressBar);
        }
        RecyclerView recyclerView = this.f31850g;
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
        Handler handler;
        Runnable lVar;
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("sort", 0);
        this.f31839P = sharedPreferences;
        this.f31840Q = sharedPreferences.edit();
        if (this.f31839P.getString("sort", "").equals("")) {
            this.f31840Q.putString("sort", "0");
            this.f31840Q.commit();
        }
        Intent intent = getIntent();
        if (intent != null) {
            this.f31826C = intent.getStringExtra("category_id");
            this.f31827D = intent.getStringExtra("category_name");
        }
        this.f31857n = this;
        this.f31836M = new j0();
        this.f31868y = new LiveStreamDBHandler(this.f31857n);
        this.f31842S = new Handler();
        this.f31845V = new RecentWatchDBHandler(this.f31857n);
        String str = this.f31826C;
        str.hashCode();
        if (str.equals("0")) {
            setContentView(a7.g.f12616C1);
            this.f31847d = (Toolbar) findViewById(a7.f.kh);
            this.f31848e = (AppBarLayout) findViewById(a7.f.f12303W);
            this.f31849f = (ProgressBar) findViewById(a7.f.ec);
            this.f31850g = (RecyclerView) findViewById(a7.f.ub);
            this.f31851h = (TextView) findViewById(a7.f.sk);
            this.f31852i = (TextView) findViewById(a7.f.wk);
            this.f31853j = (TextView) findViewById(a7.f.lm);
            this.f31854k = (TextView) findViewById(a7.f.Jl);
            this.f31855l = (RelativeLayout) findViewById(a7.f.rf);
            this.f31856m = (ImageView) findViewById(a7.f.Xa);
            a();
            this.f31842S.removeCallbacksAndMessages(null);
            ProgressBar progressBar = this.f31849f;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            handler = this.f31842S;
            lVar = new l();
        } else if (str.equals("-1")) {
            setContentView(a7.g.f12616C1);
            this.f31847d = (Toolbar) findViewById(a7.f.kh);
            this.f31848e = (AppBarLayout) findViewById(a7.f.f12303W);
            this.f31849f = (ProgressBar) findViewById(a7.f.ec);
            this.f31850g = (RecyclerView) findViewById(a7.f.ub);
            this.f31851h = (TextView) findViewById(a7.f.sk);
            this.f31852i = (TextView) findViewById(a7.f.wk);
            this.f31853j = (TextView) findViewById(a7.f.lm);
            this.f31854k = (TextView) findViewById(a7.f.Jl);
            this.f31855l = (RelativeLayout) findViewById(a7.f.rf);
            this.f31856m = (ImageView) findViewById(a7.f.Xa);
            this.f31842S.removeCallbacksAndMessages(null);
            ProgressBar progressBar2 = this.f31849f;
            if (progressBar2 != null) {
                progressBar2.setVisibility(0);
            }
            handler = this.f31842S;
            lVar = new k();
        } else {
            ArrayList<LiveStreamCategoryIdDBModel> allMovieCategoriesHavingParentIdNotZero = this.f31868y.getAllMovieCategoriesHavingParentIdNotZero(this.f31826C);
            f31821Y = allMovieCategoriesHavingParentIdNotZero;
            if (allMovieCategoriesHavingParentIdNotZero == null || allMovieCategoriesHavingParentIdNotZero.size() != 0) {
                setContentView(a7.g.f12628E1);
                this.f31847d = (Toolbar) findViewById(a7.f.kh);
                this.f31848e = (AppBarLayout) findViewById(a7.f.f12303W);
                this.f31849f = (ProgressBar) findViewById(a7.f.ec);
                this.f31850g = (RecyclerView) findViewById(a7.f.ub);
                this.f31851h = (TextView) findViewById(a7.f.sk);
                this.f31852i = (TextView) findViewById(a7.f.wk);
                this.f31853j = (TextView) findViewById(a7.f.lm);
                this.f31854k = (TextView) findViewById(a7.f.Jl);
                this.f31855l = (RelativeLayout) findViewById(a7.f.rf);
                this.f31856m = (ImageView) findViewById(a7.f.Xa);
                a();
                this.f31837N = true;
                this.f31842S.removeCallbacksAndMessages(null);
                ProgressBar progressBar3 = this.f31849f;
                if (progressBar3 != null) {
                    progressBar3.setVisibility(0);
                }
                handler = this.f31842S;
                lVar = new n();
            } else {
                setContentView(a7.g.f12616C1);
                this.f31847d = (Toolbar) findViewById(a7.f.kh);
                this.f31848e = (AppBarLayout) findViewById(a7.f.f12303W);
                this.f31849f = (ProgressBar) findViewById(a7.f.ec);
                this.f31850g = (RecyclerView) findViewById(a7.f.ub);
                this.f31851h = (TextView) findViewById(a7.f.sk);
                this.f31852i = (TextView) findViewById(a7.f.wk);
                this.f31853j = (TextView) findViewById(a7.f.lm);
                this.f31854k = (TextView) findViewById(a7.f.Jl);
                this.f31855l = (RelativeLayout) findViewById(a7.f.rf);
                this.f31856m = (ImageView) findViewById(a7.f.Xa);
                a();
                this.f31842S.removeCallbacksAndMessages(null);
                ProgressBar progressBar4 = this.f31849f;
                if (progressBar4 != null) {
                    progressBar4.setVisibility(0);
                }
                handler = this.f31842S;
                lVar = new m();
            }
        }
        handler.postDelayed(lVar, 1000L);
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        AppBarLayout appBarLayout = this.f31848e;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(a7.e.f12034n));
        }
        P1();
        r1((Toolbar) findViewById(a7.f.kh));
        this.f31857n = this;
        if (!this.f31827D.isEmpty()) {
            this.f31854k.setText(this.f31827D);
        }
        this.f31854k.setSelected(true);
        this.f31856m.setOnClickListener(new o());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        if (this.f31837N) {
            this.f31847d.x(a7.h.f12935r);
        } else {
            this.f31847d.x(a7.h.f12936s);
            if (this.f31845V.getLiveStreamsCount(SharepreferenceDBHandler.getUserID(this.f31857n)) > 0 && this.f31826C.equals("-4")) {
                menu.getItem(2).getSubMenu().findItem(a7.f.Db).setVisible(true);
            }
        }
        this.f31844U = menu;
        this.f31843T = menu.getItem(2).getSubMenu().findItem(a7.f.f12239P2);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f31847d.getChildCount(); i9++) {
            if (this.f31847d.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f31847d.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        if (i9 != 82) {
            return super.onKeyUp(i9, keyEvent);
        }
        Menu menu = this.f31844U;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(a7.f.f12239P2, 0);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0249  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onOptionsItemSelected(android.view.MenuItem r9) {
        /*
            Method dump skipped, instruction units count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        w.m(this.f31857n);
        w.z0(this.f31857n);
        getWindow().setFlags(1024, 1024);
        this.f31836M.F0(f31823e0);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f31858o = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f31858o.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f31857n != null) {
            b();
        }
    }
}
