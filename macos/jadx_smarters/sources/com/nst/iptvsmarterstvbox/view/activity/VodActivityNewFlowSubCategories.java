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
import com.nst.iptvsmarterstvbox.model.FavouriteDBModel;
import com.nst.iptvsmarterstvbox.model.FavouriteM3UModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.VodAllCategoriesSingleton;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.PasswordStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.RecentWatchDBHandler;
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
public class VodActivityNewFlowSubCategories extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static ArrayList f33374g0 = new ArrayList();

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static ArrayList f33375h0 = new ArrayList();

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static ArrayList f33376i0 = new ArrayList();

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static ProgressBar f33377j0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public LiveStreamDBHandler f33378A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public SearchView f33380C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ProgressDialog f33381D;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public n0 f33385H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public SharedPreferences f33386I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public SharedPreferences.Editor f33387J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public SharedPreferences f33388K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public SharedPreferences.Editor f33389L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public RecyclerView.o f33390M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public SharedPreferences f33391N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public i0 f33392O;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public DatabaseHandler f33394Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public j0 f33395R;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public PopupWindow f33397T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public SharedPreferences f33398U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public SharedPreferences.Editor f33399V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public GridLayoutManager f33400W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Handler f33401X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public MenuItem f33402Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Menu f33403Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Toolbar f33404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppBarLayout f33405e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public RecentWatchDBHandler f33406e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ProgressBar f33407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f33409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f33410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f33411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f33412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f33413k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RelativeLayout f33414l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f33415m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f33416n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Context f33417o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SharedPreferences f33418p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f33420r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f33421s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f33422t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f33423u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f33424v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f33425w;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f33419q = new ArrayList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f33426x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f33427y = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f33428z = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f33379B = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f33382E = "";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f33383F = "";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f33384G = false;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ArrayList f33393P = new ArrayList();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f33396S = false;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f33408f0 = true;

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
            VodActivityNewFlowSubCategories.this.f33397T.dismiss();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SharepreferenceDBHandler.getCurrentAPPType(VodActivityNewFlowSubCategories.this.f33417o).equals("m3u")) {
                VodActivityNewFlowSubCategories.this.f33378A.deleteALLRecentwatch("movie", SharepreferenceDBHandler.getUserID(VodActivityNewFlowSubCategories.this.f33417o));
            } else {
                new r(VodActivityNewFlowSubCategories.this, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
            VodActivityNewFlowSubCategories.this.f33397T.dismiss();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodActivityNewFlowSubCategories.this.f33397T.dismiss();
        }
    }

    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RadioGroup f33433a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f33434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Activity f33435d;

        public e(RadioGroup radioGroup, View view, Activity activity) {
            this.f33433a = radioGroup;
            this.f33434c = view;
            this.f33435d = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RadioButton radioButton = (RadioButton) this.f33434c.findViewById(this.f33433a.getCheckedRadioButtonId());
            SharepreferenceDBHandler.setVODSubCatSort(radioButton.getText().toString().equals(VodActivityNewFlowSubCategories.this.getResources().getString(a7.j.f13284i7)) ? "1" : radioButton.getText().toString().equals(VodActivityNewFlowSubCategories.this.getResources().getString(a7.j.f13254f7)) ? "2" : radioButton.getText().toString().equals(VodActivityNewFlowSubCategories.this.getResources().getString(a7.j.f13304k7)) ? "3" : "0", this.f33435d);
            VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories = VodActivityNewFlowSubCategories.this;
            vodActivityNewFlowSubCategories.f33386I = vodActivityNewFlowSubCategories.getSharedPreferences("listgridview", 0);
            VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories2 = VodActivityNewFlowSubCategories.this;
            vodActivityNewFlowSubCategories2.f33387J = vodActivityNewFlowSubCategories2.f33386I.edit();
            int i9 = VodActivityNewFlowSubCategories.this.f33386I.getInt("vod", 0);
            AbstractC2237a.f44458N = i9;
            if (i9 == 1) {
                VodActivityNewFlowSubCategories.this.Y1();
            } else {
                VodActivityNewFlowSubCategories.this.X1();
            }
            VodActivityNewFlowSubCategories.this.f33397T.dismiss();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodActivityNewFlowSubCategories.this.f33397T.dismiss();
        }
    }

    public class g implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecentWatchDBHandler f33438a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f33439c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f33440d;

        public g(RecentWatchDBHandler recentWatchDBHandler, int i9, Context context) {
            this.f33438a = recentWatchDBHandler;
            this.f33439c = i9;
            this.f33440d = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecentWatchDBHandler recentWatchDBHandler = this.f33438a;
            if (recentWatchDBHandler != null) {
                recentWatchDBHandler.deleteRecentwatch(this.f33439c, "movie");
            }
            Toast.makeText(this.f33440d, VodActivityNewFlowSubCategories.this.getResources().getString(a7.j.f13037J3), 0).show();
            if (VodActivityNewFlowSubCategories.this.f33392O != null) {
                VodActivityNewFlowSubCategories.this.b2();
                VodActivityNewFlowSubCategories.this.f33397T.dismiss();
            }
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(VodActivityNewFlowSubCategories.this.f33417o);
        }
    }

    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodActivityNewFlowSubCategories.this.onBackPressed();
        }
    }

    public class j implements DialogInterface.OnClickListener {
        public j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.dismiss();
        }
    }

    public class k implements DialogInterface.OnClickListener {
        public k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.n0(VodActivityNewFlowSubCategories.this.f33417o);
        }
    }

    public class l implements SearchView.m {
        public l() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextChange(String str) {
            TextView textView;
            VodActivityNewFlowSubCategories.this.f33411i.setVisibility(8);
            if (VodActivityNewFlowSubCategories.this.f33385H == null || (textView = VodActivityNewFlowSubCategories.this.f33410h) == null || textView.getVisibility() == 0) {
                return false;
            }
            VodActivityNewFlowSubCategories.this.f33385H.z0(str, VodActivityNewFlowSubCategories.this.f33411i);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class m implements SearchView.m {
        public m() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextChange(String str) {
            TextView textView;
            VodActivityNewFlowSubCategories.this.f33411i.setVisibility(8);
            if (VodActivityNewFlowSubCategories.this.f33392O == null || (textView = VodActivityNewFlowSubCategories.this.f33410h) == null || textView.getVisibility() == 0) {
                return false;
            }
            VodActivityNewFlowSubCategories.this.f33392O.J0(str, VodActivityNewFlowSubCategories.this.f33411i);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class n implements DialogInterface.OnClickListener {
        public n() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.m0(VodActivityNewFlowSubCategories.this.f33417o);
        }
    }

    public class o implements DialogInterface.OnClickListener {
        public o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class p implements DialogInterface.OnClickListener {
        public p() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
        }
    }

    public class q extends AsyncTask {
        public q() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
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
                r1 = r7[r0]     // Catch: java.lang.Exception -> L5e
                int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L5e
                r3 = 3
                r4 = 2
                r5 = 1
                switch(r2) {
                    case -998452030: goto L2c;
                    case -723794989: goto L22;
                    case -74801864: goto L18;
                    case -74797390: goto Le;
                    default: goto Ld;
                }     // Catch: java.lang.Exception -> L5e
            Ld:
                goto L35
            Le:
                java.lang.String r0 = "get_fav"
                boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L5e
                if (r0 == 0) goto L35
                r0 = 1
                goto L36
            L18:
                java.lang.String r0 = "get_all"
                boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L5e
                if (r0 == 0) goto L35
                r0 = 2
                goto L36
            L22:
                java.lang.String r0 = "get_recent_watched"
                boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L5e
                if (r0 == 0) goto L35
                r0 = 3
                goto L36
            L2c:
                java.lang.String r2 = "get_fav_m3u"
                boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L5e
                if (r1 == 0) goto L35
                goto L36
            L35:
                r0 = -1
            L36:
                if (r0 == 0) goto L57
                if (r0 == r5) goto L50
                if (r0 == r4) goto L47
                if (r0 == r3) goto L40
                r7 = 0
                return r7
            L40:
                com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories r7 = com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories.this     // Catch: java.lang.Exception -> L5e
                java.lang.String r7 = r7.R1()     // Catch: java.lang.Exception -> L5e
                return r7
            L47:
                com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories r0 = com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories.this     // Catch: java.lang.Exception -> L5e
                r7 = r7[r5]     // Catch: java.lang.Exception -> L5e
                java.lang.String r7 = r0.M1(r7)     // Catch: java.lang.Exception -> L5e
                return r7
            L50:
                com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories r7 = com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories.this     // Catch: java.lang.Exception -> L5e
                java.lang.String r7 = r7.O1()     // Catch: java.lang.Exception -> L5e
                return r7
            L57:
                com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories r7 = com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories.this     // Catch: java.lang.Exception -> L5e
                java.lang.String r7 = r7.P1()     // Catch: java.lang.Exception -> L5e
                return r7
            L5e:
                java.lang.String r7 = "error"
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories.q.doInBackground(java.lang.String[]):java.lang.String");
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            str.hashCode();
            switch (str) {
                case "get_fav_m3u":
                    VodActivityNewFlowSubCategories.this.L1();
                    break;
                case "get_recent_watched":
                    VodActivityNewFlowSubCategories.this.a2();
                    break;
                case "get_all":
                    VodActivityNewFlowSubCategories.this.u1();
                    break;
                case "get_fav":
                    VodActivityNewFlowSubCategories.this.K1();
                    break;
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public class r extends AsyncTask {
        public r() {
        }

        public /* synthetic */ r(VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories, h hVar) {
            this();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            try {
                return VodActivityNewFlowSubCategories.this.I1();
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            ProgressBar progressBar = VodActivityNewFlowSubCategories.this.f33407f;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            if (bool.booleanValue()) {
                Toast.makeText(VodActivityNewFlowSubCategories.this.f33417o, VodActivityNewFlowSubCategories.this.getResources().getString(a7.j.f12943A), 0).show();
                VodActivityNewFlowSubCategories.this.X1();
            } else {
                VodActivityNewFlowSubCategories.this.f33423u.clear();
                VodActivityNewFlowSubCategories.this.f33392O.w();
                VodActivityNewFlowSubCategories.this.f33409g.setVisibility(8);
                VodActivityNewFlowSubCategories.this.f33411i.setVisibility(0);
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            ProgressBar progressBar = VodActivityNewFlowSubCategories.this.f33407f;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        }
    }

    public class s implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f33453a;

        public s(View view) {
            this.f33453a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f33453a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f33453a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f33453a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            View view2;
            int i9;
            if (z9) {
                if (this.f33453a.getTag() != null && this.f33453a.getTag().equals("1")) {
                    b(1.15f);
                    c(1.15f);
                    view2 = this.f33453a;
                    i9 = a7.e.f12010h;
                } else {
                    if (this.f33453a.getTag() == null || !this.f33453a.getTag().equals("2")) {
                        b(1.15f);
                        return;
                    }
                    b(1.15f);
                    c(1.15f);
                    view2 = this.f33453a;
                    i9 = a7.e.f12024k1;
                }
            } else {
                if (z9) {
                    return;
                }
                a(z9);
                if ((this.f33453a.getTag() == null || !this.f33453a.getTag().equals("1")) && (this.f33453a.getTag() == null || !this.f33453a.getTag().equals("2"))) {
                    b(1.0f);
                    c(1.0f);
                    return;
                } else {
                    b(1.0f);
                    c(1.0f);
                    view2 = this.f33453a;
                    i9 = a7.e.f12038o;
                }
            }
            view2.setBackgroundResource(i9);
        }
    }

    private void H1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private ArrayList Q1() {
        ArrayList<PasswordStatusDBModel> allPasswordStatus = this.f33378A.getAllPasswordStatus(SharepreferenceDBHandler.getUserID(this.f33417o));
        this.f33420r = allPasswordStatus;
        if (allPasswordStatus != null) {
            for (PasswordStatusDBModel passwordStatusDBModel : allPasswordStatus) {
                if (passwordStatusDBModel.getPasswordStatus().equals("1")) {
                    this.f33419q.add(passwordStatusDBModel.getPasswordStatusCategoryId());
                }
            }
        }
        return this.f33419q;
    }

    private ArrayList S1(ArrayList arrayList, ArrayList arrayList2) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LiveStreamsDBModel liveStreamsDBModel = (LiveStreamsDBModel) it.next();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    this.f33421s.add(liveStreamsDBModel);
                    liveStreamsDBModel.getCategoryId();
                    break;
                }
                if (liveStreamsDBModel.getCategoryId().equals((String) it2.next())) {
                    break;
                }
            }
        }
        return this.f33421s;
    }

    private ArrayList T1(ArrayList arrayList, ArrayList arrayList2) {
        this.f33424v = new ArrayList();
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FavouriteDBModel favouriteDBModel = (FavouriteDBModel) it.next();
            if (arrayList2 != null) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        this.f33424v.add(favouriteDBModel);
                        break;
                    }
                    if (favouriteDBModel.getCategoryID().equals((String) it2.next())) {
                        break;
                    }
                }
            }
        }
        return this.f33424v;
    }

    private ArrayList U1(ArrayList arrayList, ArrayList arrayList2) {
        this.f33425w = new ArrayList();
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
                        this.f33425w.add(favouriteM3UModel);
                        break;
                    }
                    if (favouriteM3UModel.getCategoryID().equals((String) it2.next())) {
                        break;
                    }
                }
            }
        }
        return this.f33425w;
    }

    private void W1() {
        this.f33404d = (Toolbar) findViewById(a7.f.kh);
        this.f33405e = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f33407f = (ProgressBar) findViewById(a7.f.ec);
        this.f33409g = (RecyclerView) findViewById(a7.f.ub);
        this.f33410h = (TextView) findViewById(a7.f.sk);
        this.f33411i = (TextView) findViewById(a7.f.wk);
        this.f33412j = (TextView) findViewById(a7.f.lm);
        this.f33413k = (TextView) findViewById(a7.f.Jl);
        this.f33414l = (RelativeLayout) findViewById(a7.f.rf);
        this.f33415m = (ImageView) findViewById(a7.f.Xa);
        this.f33416n = (ImageView) findViewById(a7.f.f12141F4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X1() {
        this.f33417o = this;
        this.f33378A = new LiveStreamDBHandler(this.f33417o);
        RecyclerView recyclerView = this.f33409g;
        if (recyclerView == null || this.f33417o == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f33417o, 7);
        this.f33390M = gridLayoutManager;
        this.f33409g.setLayoutManager(gridLayoutManager);
        this.f33409g.setItemAnimator(new androidx.recyclerview.widget.c());
        this.f33391N = this.f33417o.getSharedPreferences("loginPrefs", 0);
        d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y1() {
        this.f33417o = this;
        this.f33378A = new LiveStreamDBHandler(this.f33417o);
        RecyclerView recyclerView = this.f33409g;
        if (recyclerView == null || this.f33417o == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f33417o);
        this.f33390M = linearLayoutManager;
        this.f33409g.setLayoutManager(linearLayoutManager);
        this.f33409g.setItemAnimator(new androidx.recyclerview.widget.c());
        this.f33391N = this.f33417o.getSharedPreferences("loginPrefs", 0);
        d2();
    }

    private void Z1(ArrayList arrayList) {
        RecyclerView recyclerView = this.f33409g;
        if (recyclerView == null || this.f33417o == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        this.f33400W = new C2858a(this.f33417o).A().equals(AbstractC2237a.f44453K0) ? new GridLayoutManager(this, 2) : new GridLayoutManager(this, 2);
        this.f33409g.setLayoutManager(this.f33400W);
        this.f33409g.setHasFixedSize(true);
        b();
        n0 n0Var = new n0(arrayList, this.f33417o, this.f33378A);
        this.f33385H = n0Var;
        this.f33409g.setAdapter(n0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b2() {
        SharedPreferences sharedPreferences = getSharedPreferences("listgridview", 0);
        this.f33386I = sharedPreferences;
        this.f33387J = sharedPreferences.edit();
        int i9 = this.f33386I.getInt("vod", 0);
        AbstractC2237a.f44458N = i9;
        if (i9 == 1) {
            Y1();
        } else {
            X1();
        }
    }

    private void c2(ArrayList arrayList) {
        Z1(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[Catch: NullPointerException | Exception -> 0x0089, TryCatch #0 {NullPointerException | Exception -> 0x0089, blocks: (B:2:0x0000, B:4:0x0004, B:18:0x002d, B:19:0x0040, B:20:0x0053, B:22:0x0061, B:23:0x0072, B:9:0x0014, B:12:0x001e, B:24:0x0082, B:26:0x0086), top: B:29:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d2() {
        /*
            r4 = this;
            android.content.Context r0 = r4.f33417o     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L82
            java.lang.String r0 = r4.f33382E     // Catch: java.lang.Throwable -> L89
            int r1 = r0.hashCode()     // Catch: java.lang.Throwable -> L89
            r2 = 1444(0x5a4, float:2.023E-42)
            r3 = 1
            if (r1 == r2) goto L1e
            r2 = 1447(0x5a7, float:2.028E-42)
            if (r1 == r2) goto L14
            goto L28
        L14:
            java.lang.String r1 = "-4"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L28
            r0 = 1
            goto L29
        L1e:
            java.lang.String r1 = "-1"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L28
            r0 = 0
            goto L29
        L28:
            r0 = -1
        L29:
            if (r0 == 0) goto L53
            if (r0 == r3) goto L40
            com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories$q r0 = new com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories$q     // Catch: java.lang.Throwable -> L89
            r0.<init>()     // Catch: java.lang.Throwable -> L89
            java.util.concurrent.Executor r1 = android.os.AsyncTask.THREAD_POOL_EXECUTOR     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "get_all"
            java.lang.String r3 = r4.f33382E     // Catch: java.lang.Throwable -> L89
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch: java.lang.Throwable -> L89
            r0.executeOnExecutor(r1, r2)     // Catch: java.lang.Throwable -> L89
            goto L82
        L40:
            com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories$q r0 = new com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories$q     // Catch: java.lang.Throwable -> L89
            r0.<init>()     // Catch: java.lang.Throwable -> L89
            java.util.concurrent.Executor r1 = android.os.AsyncTask.THREAD_POOL_EXECUTOR     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "get_recent_watched"
            java.lang.String r3 = r4.f33382E     // Catch: java.lang.Throwable -> L89
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch: java.lang.Throwable -> L89
            r0.executeOnExecutor(r1, r2)     // Catch: java.lang.Throwable -> L89
            goto L82
        L53:
            android.content.Context r0 = r4.f33417o     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler.getCurrentAPPType(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.String r1 = "m3u"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L72
            com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories$q r0 = new com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories$q     // Catch: java.lang.Throwable -> L89
            r0.<init>()     // Catch: java.lang.Throwable -> L89
            java.util.concurrent.Executor r1 = android.os.AsyncTask.THREAD_POOL_EXECUTOR     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "get_fav_m3u"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L89
            r0.executeOnExecutor(r1, r2)     // Catch: java.lang.Throwable -> L89
            goto L82
        L72:
            com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories$q r0 = new com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories$q     // Catch: java.lang.Throwable -> L89
            r0.<init>()     // Catch: java.lang.Throwable -> L89
            java.util.concurrent.Executor r1 = android.os.AsyncTask.THREAD_POOL_EXECUTOR     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "get_fav"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L89
            r0.executeOnExecutor(r1, r2)     // Catch: java.lang.Throwable -> L89
        L82:
            android.app.ProgressDialog r0 = r4.f33381D     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L89
            r0.dismiss()     // Catch: java.lang.Throwable -> L89
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories.d2():void");
    }

    private void e2() {
        try {
            View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(a7.g.f12867r2, (RelativeLayout) findViewById(a7.f.We));
            PopupWindow popupWindow = new PopupWindow(this);
            this.f33397T = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.f33397T.setWidth(-1);
            this.f33397T.setHeight(-1);
            this.f33397T.setFocusable(true);
            this.f33397T.showAtLocation(viewInflate, 17, 0, 0);
            ((TextView) viewInflate.findViewById(a7.f.Ai)).setText(getResources().getString(a7.j.f13054L0));
            Button button = (Button) viewInflate.findViewById(a7.f.f12197L0);
            Button button2 = (Button) viewInflate.findViewById(a7.f.f12482o0);
            if (button != null) {
                button.setOnFocusChangeListener(new w.k((View) button, this));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new w.k((View) button2, this));
            }
            button2.setOnClickListener(new b());
            if (button != null) {
                button.setOnClickListener(new c());
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f2(android.app.Activity r17) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories.f2(android.app.Activity):void");
    }

    public Boolean I1() {
        ArrayList arrayList = this.f33423u;
        if (arrayList == null || arrayList.size() <= 0) {
            return Boolean.FALSE;
        }
        for (int i9 = 0; i9 < this.f33423u.size(); i9++) {
            this.f33406e0.deleteRecentwatch(w.r0(((LiveStreamsDBModel) this.f33423u.get(i9)).getStreamId()), "movie");
        }
        return Boolean.TRUE;
    }

    public void J1(int i9, String str, Context context, RecentWatchDBHandler recentWatchDBHandler) {
        try {
            View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(a7.g.f12867r2, (RelativeLayout) findViewById(a7.f.We));
            PopupWindow popupWindow = new PopupWindow(this);
            this.f33397T = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.f33397T.setWidth(-1);
            this.f33397T.setHeight(-1);
            this.f33397T.setFocusable(true);
            this.f33397T.showAtLocation(viewInflate, 17, 0, 0);
            ((TextView) viewInflate.findViewById(a7.f.Ai)).setText(getResources().getString(a7.j.f13064M0));
            Button button = (Button) viewInflate.findViewById(a7.f.f12197L0);
            Button button2 = (Button) viewInflate.findViewById(a7.f.f12482o0);
            if (button != null) {
                button.setOnFocusChangeListener(new s(button));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new s(button2));
            }
            button2.setOnClickListener(new f());
            if (button != null) {
                button.setOnClickListener(new g(recentWatchDBHandler, i9, context));
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    public void K1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (this.f33409g != null && (arrayList2 = this.f33393P) != null && arrayList2.size() != 0) {
            this.f33392O = new i0(this.f33393P, this.f33417o, true);
            VodAllCategoriesSingleton.getInstance().setVodList(this.f33393P);
            this.f33409g.setAdapter(this.f33392O);
            w.Q0(this.f33417o, getResources().getString(a7.j.f13365q8));
            this.f33410h.setVisibility(4);
        }
        if (this.f33410h != null && (arrayList = this.f33393P) != null && arrayList.size() == 0) {
            RecyclerView recyclerView = this.f33409g;
            if (recyclerView != null) {
                recyclerView.setAdapter(this.f33392O);
            }
            this.f33410h.setText(getResources().getString(a7.j.f13341o4));
            this.f33410h.setVisibility(0);
        }
        ProgressBar progressBar = this.f33407f;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    public void L1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (this.f33409g != null && (arrayList2 = this.f33393P) != null && arrayList2.size() != 0) {
            this.f33392O = new i0(this.f33393P, this.f33417o, true);
            VodAllCategoriesSingleton.getInstance().setVodList(this.f33393P);
            this.f33409g.setAdapter(this.f33392O);
            w.Q0(this.f33417o, getResources().getString(a7.j.f13365q8));
            this.f33410h.setVisibility(4);
        }
        if (this.f33410h != null && (arrayList = this.f33393P) != null && arrayList.size() == 0) {
            RecyclerView recyclerView = this.f33409g;
            if (recyclerView != null) {
                recyclerView.setAdapter(this.f33392O);
            }
            this.f33410h.setText(getResources().getString(a7.j.f13341o4));
            this.f33410h.setVisibility(0);
        }
        ProgressBar progressBar = this.f33407f;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    public String M1(String str) {
        this.f33420r = new ArrayList();
        this.f33421s = new ArrayList();
        this.f33422t = new ArrayList();
        this.f33423u = new ArrayList();
        this.f33423u = this.f33378A.getAllLiveStreasWithCategoryId(str, "movie");
        return "get_all";
    }

    public void N1() {
        RecyclerView recyclerView;
        androidx.recyclerview.widget.c cVar;
        try {
            a();
            SharedPreferences sharedPreferences = getSharedPreferences("listgridview", 0);
            this.f33386I = sharedPreferences;
            this.f33387J = sharedPreferences.edit();
            int i9 = this.f33386I.getInt("vod", 0);
            AbstractC2237a.f44458N = i9;
            if (i9 == 1) {
                this.f33417o = this;
                this.f33378A = new LiveStreamDBHandler(this.f33417o);
                RecyclerView recyclerView2 = this.f33409g;
                if (recyclerView2 != null && this.f33417o != null) {
                    recyclerView2.setHasFixedSize(true);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f33417o);
                    this.f33390M = linearLayoutManager;
                    this.f33409g.setLayoutManager(linearLayoutManager);
                    recyclerView = this.f33409g;
                    cVar = new androidx.recyclerview.widget.c();
                    recyclerView.setItemAnimator(cVar);
                }
            } else {
                this.f33417o = this;
                this.f33378A = new LiveStreamDBHandler(this.f33417o);
                RecyclerView recyclerView3 = this.f33409g;
                if (recyclerView3 != null && this.f33417o != null) {
                    recyclerView3.setHasFixedSize(true);
                    GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f33417o, 7);
                    this.f33390M = gridLayoutManager;
                    this.f33409g.setLayoutManager(gridLayoutManager);
                    recyclerView = this.f33409g;
                    cVar = new androidx.recyclerview.widget.c();
                    recyclerView.setItemAnimator(cVar);
                }
            }
            if (this.f33417o != null) {
                LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f33417o);
                ArrayList<LiveStreamsDBModel> allLiveStreasWithCategoryId = liveStreamDBHandler.getAllLiveStreasWithCategoryId("0", "movie");
                this.f33420r = new ArrayList();
                this.f33421s = new ArrayList();
                this.f33422t = new ArrayList();
                this.f33423u = new ArrayList();
                if (liveStreamDBHandler.getParentalStatusCount(SharepreferenceDBHandler.getUserID(this.f33417o)) <= 0 || allLiveStreasWithCategoryId == null) {
                    this.f33423u = allLiveStreasWithCategoryId;
                } else {
                    ArrayList arrayListQ1 = Q1();
                    this.f33419q = arrayListQ1;
                    if (arrayListQ1 != null) {
                        this.f33422t = S1(allLiveStreasWithCategoryId, arrayListQ1);
                    }
                    this.f33423u = this.f33422t;
                }
                b();
                ProgressBar progressBar = this.f33407f;
                if (progressBar != null) {
                    progressBar.setVisibility(4);
                }
                ArrayList arrayList = this.f33423u;
                if (arrayList == null || this.f33409g == null || arrayList.size() == 0) {
                    ProgressDialog progressDialog = this.f33381D;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                    TextView textView = this.f33410h;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    ProgressBar progressBar2 = this.f33407f;
                    if (progressBar2 != null) {
                        progressBar2.setVisibility(4);
                    }
                } else {
                    ProgressDialog progressDialog2 = this.f33381D;
                    if (progressDialog2 != null) {
                        progressDialog2.dismiss();
                    }
                    i0 i0Var = new i0(allLiveStreasWithCategoryId, this.f33417o, true);
                    this.f33392O = i0Var;
                    this.f33409g.setAdapter(i0Var);
                }
            }
            ProgressDialog progressDialog3 = this.f33381D;
            if (progressDialog3 != null) {
                progressDialog3.dismiss();
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    public String O1() {
        new ArrayList();
        this.f33393P.clear();
        DatabaseHandler databaseHandler = new DatabaseHandler(this.f33417o);
        this.f33394Q = databaseHandler;
        ArrayList<FavouriteDBModel> allFavourites = databaseHandler.getAllFavourites("vod", SharepreferenceDBHandler.getUserID(this.f33417o));
        if (this.f33419q != null) {
            this.f33419q = Q1();
        }
        ArrayList arrayList = this.f33419q;
        if (arrayList != null && arrayList.size() > 0 && allFavourites != null && allFavourites.size() > 0) {
            allFavourites = T1(allFavourites, this.f33419q);
        }
        if (allFavourites == null || allFavourites.size() <= 0) {
            return "get_fav";
        }
        for (FavouriteDBModel favouriteDBModel : allFavourites) {
            LiveStreamsDBModel liveStreamFavouriteRow = new LiveStreamDBHandler(this.f33417o).getLiveStreamFavouriteRow(favouriteDBModel.getCategoryID(), String.valueOf(favouriteDBModel.getStreamID()), favouriteDBModel.getTimestamp(), "");
            if (liveStreamFavouriteRow != null) {
                this.f33393P.add(liveStreamFavouriteRow);
            }
        }
        return "get_fav";
    }

    public String P1() {
        new ArrayList();
        this.f33393P.clear();
        ArrayList<FavouriteM3UModel> favouriteM3U = this.f33378A.getFavouriteM3U("movie");
        if (this.f33419q != null) {
            this.f33419q = Q1();
        }
        ArrayList arrayList = this.f33419q;
        if (arrayList != null && arrayList.size() > 0 && favouriteM3U != null && favouriteM3U.size() > 0) {
            favouriteM3U = U1(favouriteM3U, this.f33419q);
        }
        if (favouriteM3U == null || favouriteM3U.size() <= 0) {
            return "get_fav_m3u";
        }
        for (FavouriteM3UModel favouriteM3UModel : favouriteM3U) {
            ArrayList<LiveStreamsDBModel> m3UFavouriteRow = this.f33378A.getM3UFavouriteRow(favouriteM3UModel.getCategoryID(), favouriteM3UModel.getUrl(), favouriteM3UModel.getTimestamp());
            if (m3UFavouriteRow != null && m3UFavouriteRow.size() > 0) {
                this.f33393P.add(m3UFavouriteRow.get(0));
            }
        }
        return "get_fav_m3u";
    }

    public String R1() {
        this.f33420r = new ArrayList();
        this.f33421s = new ArrayList();
        this.f33422t = new ArrayList();
        this.f33423u = new ArrayList();
        ArrayList<LiveStreamsDBModel> allLiveStreasWithCategoryId = SharepreferenceDBHandler.getCurrentAPPType(this.f33417o).equals("m3u") ? this.f33378A.getAllLiveStreasWithCategoryId("movie", SharepreferenceDBHandler.getUserID(this.f33417o), "getalldata") : this.f33406e0.getAllLiveStreasWithCategoryId("movie", SharepreferenceDBHandler.getUserID(this.f33417o), "getalldata");
        if (this.f33378A.getParentalStatusCount(SharepreferenceDBHandler.getUserID(this.f33417o)) > 0 && allLiveStreasWithCategoryId != null) {
            ArrayList arrayListQ1 = Q1();
            this.f33419q = arrayListQ1;
            if (arrayListQ1 != null) {
                this.f33422t = S1(allLiveStreasWithCategoryId, arrayListQ1);
            }
            allLiveStreasWithCategoryId = this.f33422t;
        }
        this.f33423u = allLiveStreasWithCategoryId;
        return "get_recent_watched";
    }

    public void V1() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    public void a() {
        ProgressBar progressBar = this.f33407f;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    public void a2() {
        ProgressDialog progressDialog = this.f33381D;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        ArrayList arrayList = this.f33423u;
        if (arrayList == null || this.f33409g == null || arrayList.size() == 0) {
            TextView textView = this.f33410h;
            if (textView != null) {
                textView.setVisibility(0);
                this.f33409g.setVisibility(8);
            }
        } else {
            this.f33408f0 = false;
            this.f33392O = new i0(this.f33423u, this.f33417o, false, this);
            VodAllCategoriesSingleton.getInstance().setVodList(this.f33423u);
            this.f33409g.setAdapter(this.f33392O);
            w.Q0(this.f33417o, getResources().getString(a7.j.f13365q8));
        }
        ProgressBar progressBar = this.f33407f;
        if (progressBar != null) {
            progressBar.setVisibility(8);
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
        j0 j0Var = this.f33395R;
        if (j0Var != null && (progressBar = f33377j0) != null) {
            j0Var.F0(progressBar);
        }
        RecyclerView recyclerView = this.f33409g;
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b5 A[PHI: r6
      0x00b5: PHI (r6v26 android.widget.ProgressBar) = (r6v14 android.widget.ProgressBar), (r6v37 android.widget.ProgressBar), (r6v41 android.widget.ProgressBar) binds: [B:33:0x0110, B:23:0x00d9, B:17:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r6) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        if (this.f33396S) {
            this.f33404d.x(a7.h.f12935r);
        } else {
            this.f33404d.x(a7.h.f12936s);
            int userID = SharepreferenceDBHandler.getUserID(this.f33417o);
            if ((SharepreferenceDBHandler.getCurrentAPPType(this.f33417o).equals("m3u") ? this.f33378A.getRecentwatchCount(userID, "movie") : this.f33406e0.getLiveStreamsCount(userID)) > 0 && this.f33382E.equals("-4")) {
                menu.getItem(2).getSubMenu().findItem(a7.f.Db).setVisible(true);
            }
            SharedPreferences sharedPreferences = this.f33388K;
            if (sharedPreferences != null) {
                if (sharedPreferences.getInt("vod", 1) == 1) {
                    menu.getItem(2).getSubMenu().findItem(a7.f.f12569w6).setVisible(false);
                    menu.getItem(2).getSubMenu().findItem(a7.f.f12529s6).setVisible(true);
                } else {
                    menu.getItem(2).getSubMenu().findItem(a7.f.f12569w6).setVisible(true);
                    menu.getItem(2).getSubMenu().findItem(a7.f.f12529s6).setVisible(false);
                }
            }
        }
        this.f33403Z = menu;
        this.f33402Y = menu.getItem(2).getSubMenu().findItem(a7.f.f12239P2);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f33404d.getChildCount(); i9++) {
            if (this.f33404d.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f33404d.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        if (i9 != 82) {
            return super.onKeyUp(i9, keyEvent);
        }
        Menu menu = this.f33403Z;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(a7.f.f12239P2, 0);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c1  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onOptionsItemSelected(android.view.MenuItem r10) {
        /*
            Method dump skipped, instruction units count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        V1();
        super.onResume();
        w.m(this.f33417o);
        w.z0(this.f33417o);
        getWindow().setFlags(1024, 1024);
        this.f33395R.F0(f33377j0);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f33418p = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f33418p.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f33417o != null) {
            b();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        V1();
    }

    public void u1() {
        ProgressDialog progressDialog = this.f33381D;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        ArrayList arrayList = this.f33423u;
        if (arrayList == null || this.f33409g == null || arrayList.size() == 0) {
            TextView textView = this.f33410h;
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else {
            this.f33408f0 = true;
            this.f33392O = new i0(this.f33423u, this.f33417o, true);
            VodAllCategoriesSingleton.getInstance().setVodList(this.f33423u);
            this.f33409g.setAdapter(this.f33392O);
            w.Q0(this.f33417o, getResources().getString(a7.j.f13365q8));
        }
        ProgressBar progressBar = this.f33407f;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }
}
