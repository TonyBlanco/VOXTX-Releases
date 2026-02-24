package com.nst.iptvsmarterstvbox.view.activity;

import P.AbstractC0980w;
import android.R;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.facebook.ads.NativeAd;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.PasswordStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.SeriesRecentWatchDatabase;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m7.AbstractC2237a;
import m7.w;
import q7.C2638w;
import q7.X;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class SeriesActivtyNewFlow extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static ProgressBar f31897N;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ArrayList f31898A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ArrayList f31899B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ArrayList f31900C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ArrayList f31901D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ArrayList f31902E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public PopupWindow f31904G;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public SeriesRecentWatchDatabase f31906I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public List f31908K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Boolean f31909L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Boolean f31910M;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ProgressBar f31911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Toolbar f31912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AppBarLayout f31913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f31914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ProgressBar f31915h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecyclerView f31916i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f31917j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f31918k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f31919l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RelativeLayout f31920m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f31921n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Context f31922o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SharedPreferences f31923p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public RecyclerView.o f31924q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public X f31928u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SearchView f31929v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Handler f31930w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public MenuItem f31931x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Menu f31932y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public LiveStreamDBHandler f31933z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f31925r = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f31926s = "";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f31927t = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f31903F = -1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ArrayList f31905H = new ArrayList();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ArrayList f31907J = new ArrayList();

    public class a implements SearchView.m {
        public a() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextChange(String str) {
            TextView textView;
            AbstractC2237a.f44515k0 = str.length() > 0 ? Boolean.FALSE : Boolean.TRUE;
            SeriesActivtyNewFlow.this.f31917j.setVisibility(8);
            if (SeriesActivtyNewFlow.this.f31928u == null || (textView = SeriesActivtyNewFlow.this.f31917j) == null || textView.getVisibility() == 0) {
                return false;
            }
            SeriesActivtyNewFlow.this.f31928u.s0(str, SeriesActivtyNewFlow.this.f31917j);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesActivtyNewFlow.this.f31904G.dismiss();
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RadioGroup f31936a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f31937c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Activity f31938d;

        public c(RadioGroup radioGroup, View view, Activity activity) {
            this.f31936a = radioGroup;
            this.f31937c = view;
            this.f31938d = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RadioButton radioButton = (RadioButton) this.f31937c.findViewById(this.f31936a.getCheckedRadioButtonId());
            SharepreferenceDBHandler.setseriesActivitynewFlowSort(radioButton.getText().toString().equals(SeriesActivtyNewFlow.this.getResources().getString(a7.j.f13254f7)) ? "1" : radioButton.getText().toString().equals(SeriesActivtyNewFlow.this.getResources().getString(a7.j.f13304k7)) ? "2" : "0", this.f31938d);
            SeriesActivtyNewFlow.this.f31904G.dismiss();
            SeriesActivtyNewFlow.this.new m().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesActivtyNewFlow.this.f31922o.startActivity(new Intent(SeriesActivtyNewFlow.this.f31922o, (Class<?>) NewDashboardActivity.class));
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(SeriesActivtyNewFlow.this.f31922o);
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
            w.n0(SeriesActivtyNewFlow.this.f31922o);
        }
    }

    public class h implements DialogInterface.OnClickListener {
        public h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.m0(SeriesActivtyNewFlow.this.f31922o);
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

    public class l implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f31948a;

        public l(View view) {
            this.f31948a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31948a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31948a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31948a, "scaleY", f9);
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

    public class m extends AsyncTask {
        public m() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return SeriesActivtyNewFlow.this.F1();
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (!new C2858a(SeriesActivtyNewFlow.this.f31922o).A().equals(AbstractC2237a.f44453K0)) {
                if (SeriesActivtyNewFlow.this.f31909L.booleanValue()) {
                    SeriesActivtyNewFlow.this.E1();
                    return;
                }
                w.i(SeriesActivtyNewFlow.this.f31922o).booleanValue();
            }
            SeriesActivtyNewFlow.this.G1();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public SeriesActivtyNewFlow() {
        Boolean bool = Boolean.FALSE;
        this.f31909L = bool;
        this.f31910M = bool;
    }

    private void B1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private ArrayList C1() {
        ArrayList<PasswordStatusDBModel> allPasswordStatus = this.f31933z.getAllPasswordStatus(SharepreferenceDBHandler.getUserID(this.f31922o));
        this.f31898A = allPasswordStatus;
        if (allPasswordStatus != null) {
            for (PasswordStatusDBModel passwordStatusDBModel : allPasswordStatus) {
                if (passwordStatusDBModel.getPasswordStatus().equals("1")) {
                    this.f31905H.add(passwordStatusDBModel.getPasswordStatusCategoryId());
                }
            }
        }
        return this.f31905H;
    }

    private ArrayList D1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = (LiveStreamCategoryIdDBModel) it.next();
            if (arrayList2 != null) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (liveStreamCategoryIdDBModel.getLiveStreamCategoryID().equals((String) it2.next())) {
                            break;
                        }
                    } else {
                        ArrayList arrayList3 = this.f31899B;
                        if (arrayList3 != null) {
                            arrayList3.add(liveStreamCategoryIdDBModel);
                        }
                    }
                }
            }
        }
        return this.f31899B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E1() {
        if (this.f31907J.size() <= 0) {
            G1();
            return;
        }
        List list = this.f31908K;
        if (list != null && list.size() > 0) {
            Iterator it = this.f31908K.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof NativeAd) {
                    Log.e("ads", "ads already exists");
                    G1();
                    return;
                }
            }
            int size = this.f31908K.size() / this.f31907J.size();
            Iterator it2 = this.f31907J.iterator();
            int i9 = size;
            while (it2.hasNext()) {
                try {
                    this.f31908K.add(i9, (NativeAd) it2.next());
                    i9 += size;
                } catch (Exception unused) {
                }
            }
        }
        G1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G1() {
        if (this.f31902E != null) {
            this.f31928u = new X(this.f31908K, this.f31922o);
            this.f31916i.setItemAnimator(new androidx.recyclerview.widget.c());
            this.f31916i.setAdapter(this.f31928u);
        }
        ProgressBar progressBar = this.f31911d;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    private void H1(Activity activity) {
        try {
            View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(a7.g.f12619C4, (RelativeLayout) activity.findViewById(a7.f.Ve));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f31904G = popupWindow;
            popupWindow.setContentView(viewInflate);
            byte b9 = -1;
            this.f31904G.setWidth(-1);
            this.f31904G.setHeight(-1);
            this.f31904G.setFocusable(true);
            this.f31904G.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(a7.f.f12157H0);
            Button button2 = (Button) viewInflate.findViewById(a7.f.f12482o0);
            RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(a7.f.Kd);
            RadioButton radioButton = (RadioButton) viewInflate.findViewById(a7.f.rd);
            RadioButton radioButton2 = (RadioButton) viewInflate.findViewById(a7.f.md);
            radioButton2.setVisibility(8);
            RadioButton radioButton3 = (RadioButton) viewInflate.findViewById(a7.f.fd);
            RadioButton radioButton4 = (RadioButton) viewInflate.findViewById(a7.f.zd);
            RadioButton radioButton5 = (RadioButton) viewInflate.findViewById(a7.f.gd);
            radioButton5.setVisibility(8);
            RadioButton radioButton6 = (RadioButton) viewInflate.findViewById(a7.f.hd);
            radioButton6.setVisibility(8);
            radioButton.setOnFocusChangeListener(new l(radioButton));
            radioButton2.setOnFocusChangeListener(new l(radioButton2));
            radioButton3.setOnFocusChangeListener(new l(radioButton3));
            radioButton4.setOnFocusChangeListener(new l(radioButton4));
            radioButton5.setOnFocusChangeListener(new l(radioButton5));
            radioButton6.setOnFocusChangeListener(new l(radioButton6));
            String str = SharepreferenceDBHandler.getseriesActivitynewFlowSort(activity);
            int iHashCode = str.hashCode();
            if (iHashCode != 49) {
                if (iHashCode == 50 && str.equals("2")) {
                    b9 = 1;
                }
            } else if (str.equals("1")) {
                b9 = 0;
            }
            if (b9 == 0) {
                radioButton3.setChecked(true);
            } else if (b9 != 1) {
                radioButton.setChecked(true);
            } else {
                radioButton4.setChecked(true);
            }
            button2.setOnClickListener(new b());
            button.setOnClickListener(new c(radioGroup, viewInflate, activity));
        } catch (NullPointerException | Exception unused) {
        }
    }

    public final Boolean F1() {
        try {
            if (this.f31922o != null) {
                this.f31899B = new ArrayList();
                this.f31900C = new ArrayList();
                this.f31908K = new ArrayList();
                this.f31916i.setVisibility(0);
                this.f31933z = new LiveStreamDBHandler(this.f31922o);
                this.f31898A = new ArrayList();
                this.f31901D = new ArrayList();
                this.f31902E = new ArrayList();
                this.f31902E = this.f31933z.getAllSeriesCategoriesMain();
                LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel2 = new LiveStreamCategoryIdDBModel();
                LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel3 = new LiveStreamCategoryIdDBModel();
                LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel4 = new LiveStreamCategoryIdDBModel();
                liveStreamCategoryIdDBModel.setLiveStreamCategoryID("0");
                liveStreamCategoryIdDBModel.setLiveStreamCategoryName(getResources().getString(a7.j.f13426x));
                liveStreamCategoryIdDBModel2.setLiveStreamCategoryID("-1");
                liveStreamCategoryIdDBModel2.setLiveStreamCategoryName(getResources().getString(a7.j.f13209b2));
                this.f31903F = this.f31933z.getUncatCountSeries("-5");
                this.f31906I = new SeriesRecentWatchDatabase(this.f31922o);
                int i9 = this.f31903F;
                if (i9 != 0 && i9 > 0) {
                    liveStreamCategoryIdDBModel3.setLiveStreamCategoryID("-5");
                    liveStreamCategoryIdDBModel3.setLiveStreamCategoryName(getResources().getString(a7.j.f13215b8));
                    ArrayList arrayList = this.f31902E;
                    arrayList.add(arrayList.size(), liveStreamCategoryIdDBModel3);
                }
                liveStreamCategoryIdDBModel4.setLiveStreamCategoryID("-4");
                liveStreamCategoryIdDBModel4.setLiveStreamCategoryName(getResources().getString(a7.j.f13119R5));
                if (this.f31933z.getParentalStatusCount(SharepreferenceDBHandler.getUserID(this.f31922o)) > 0 && this.f31902E != null) {
                    ArrayList arrayListC1 = C1();
                    this.f31905H = arrayListC1;
                    ArrayList arrayListD1 = D1(this.f31902E, arrayListC1);
                    this.f31900C = arrayListD1;
                    this.f31902E = arrayListD1;
                }
                this.f31902E.add(0, liveStreamCategoryIdDBModel);
                this.f31902E.add(1, liveStreamCategoryIdDBModel2);
                liveStreamCategoryIdDBModel4.setLiveStreamCategoryID("-4");
                liveStreamCategoryIdDBModel4.setLiveStreamCategoryName(getResources().getString(a7.j.f13119R5));
                this.f31902E.add(2, liveStreamCategoryIdDBModel4);
                if (this.f31902E != null) {
                    for (int i10 = 0; i10 < this.f31902E.size(); i10++) {
                        this.f31908K.add(new C2638w(((LiveStreamCategoryIdDBModel) this.f31902E.get(i10)).getLiveStreamCategoryName(), ((LiveStreamCategoryIdDBModel) this.f31902E.get(i10)).getLiveStreamCategoryID(), ((LiveStreamCategoryIdDBModel) this.f31902E.get(i10)).getId(), ((LiveStreamCategoryIdDBModel) this.f31902E.get(i10)).getLiveStreamCounter(), ((LiveStreamCategoryIdDBModel) this.f31902E.get(i10)).getParentId()));
                    }
                }
            }
            return Boolean.TRUE;
        } catch (NullPointerException unused) {
            return Boolean.FALSE;
        } catch (Exception unused2) {
            return Boolean.FALSE;
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
        FrameLayout frameLayout = this.f31918k;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        RecyclerView recyclerView = this.f31916i;
        if (recyclerView != null) {
            recyclerView.setClickable(true);
        }
        X x9 = this.f31928u;
        if (x9 != null && (progressBar = f31897N) != null) {
            x9.A0(progressBar);
        }
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == a7.f.Bj) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        } else if (view.getId() == a7.f.f12211M4) {
            new m().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(a7.g.f12663K0);
        this.f31911d = (ProgressBar) findViewById(a7.f.ec);
        this.f31912e = (Toolbar) findViewById(a7.f.kh);
        this.f31913f = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f31914g = (LinearLayout) findViewById(a7.f.cb);
        this.f31915h = (ProgressBar) findViewById(a7.f.oc);
        this.f31916i = (RecyclerView) findViewById(a7.f.ub);
        this.f31917j = (TextView) findViewById(a7.f.f12249Q2);
        this.f31918k = (FrameLayout) findViewById(a7.f.f12250Q3);
        this.f31919l = (TextView) findViewById(a7.f.f12435j4);
        this.f31920m = (RelativeLayout) findViewById(a7.f.Af);
        this.f31921n = (ImageView) findViewById(a7.f.Xa);
        AppBarLayout appBarLayout = this.f31913f;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(a7.e.f12034n));
        }
        AbstractC2237a.f44515k0 = Boolean.FALSE;
        B1();
        r1((Toolbar) findViewById(a7.f.kh));
        getWindow().setFlags(1024, 1024);
        this.f31922o = this;
        Handler handler = new Handler();
        this.f31930w = handler;
        handler.removeCallbacksAndMessages(null);
        ProgressBar progressBar = this.f31911d;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        this.f31916i.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        this.f31924q = gridLayoutManager;
        this.f31916i.setLayoutManager(gridLayoutManager);
        this.f31916i.setVisibility(0);
        new m().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        this.f31919l.setOnClickListener(new d());
        this.f31918k.setVisibility(8);
        this.f31921n.setOnClickListener(new e());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f31912e.x(a7.h.f12935r);
        this.f31932y = menu;
        this.f31931x = menu.getItem(2).getSubMenu().findItem(a7.f.f12239P2);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f31912e.getChildCount(); i9++) {
            if (this.f31912e.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f31912e.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        if (i9 != 82) {
            return super.onKeyUp(i9, keyEvent);
        }
        Menu menu = this.f31932y;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(a7.f.f12239P2, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f31931x = menuItem;
        this.f31912e.e();
        int itemId = menuItem.getItemId();
        if (itemId == a7.f.Gb) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == a7.f.Mb) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == a7.f.f12390f && (context = this.f31922o) != null) {
            new a.C0158a(context, a7.k.f13456a).setTitle(getResources().getString(a7.j.f13250f3)).f(getResources().getString(a7.j.f13240e3)).j(getResources().getString(a7.j.f13132S8), new g()).g(getResources().getString(a7.j.f13231d4), new f()).n();
        }
        if (itemId == a7.f.gb) {
            a.C0158a c0158a = new a.C0158a(this);
            c0158a.setTitle(this.f31922o.getResources().getString(a7.j.f13397u0));
            c0158a.f(this.f31922o.getResources().getString(a7.j.f13134T0));
            c0158a.d(a7.e.f12056s1);
            c0158a.j(this.f31922o.getResources().getString(a7.j.f13132S8), new h());
            c0158a.g(this.f31922o.getResources().getString(a7.j.f13231d4), new i());
            c0158a.n();
        }
        if (itemId == a7.f.ib) {
            a.C0158a c0158a2 = new a.C0158a(this);
            c0158a2.setTitle(this.f31922o.getResources().getString(a7.j.f13397u0));
            c0158a2.f(this.f31922o.getResources().getString(a7.j.f13134T0));
            c0158a2.d(a7.e.f12056s1);
            c0158a2.j(this.f31922o.getResources().getString(a7.j.f13132S8), new j());
            c0158a2.g(this.f31922o.getResources().getString(a7.j.f13231d4), new k());
            c0158a2.n();
        }
        if (itemId != a7.f.f12400g) {
            if (itemId == a7.f.mb) {
                H1(this);
                b();
            }
            return super.onOptionsItemSelected(menuItem);
        }
        SearchView searchView = (SearchView) AbstractC0980w.b(menuItem);
        this.f31929v = searchView;
        searchView.setQueryHint(getResources().getString(a7.j.f13000F6));
        this.f31929v.setIconifiedByDefault(false);
        this.f31929v.setOnQueryTextListener(new a());
        return true;
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        ProgressBar progressBar;
        super.onResume();
        w.m(this.f31922o);
        w.z0(this.f31922o);
        getWindow().setFlags(1024, 1024);
        FrameLayout frameLayout = this.f31918k;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        X x9 = this.f31928u;
        if (x9 != null && (progressBar = f31897N) != null) {
            x9.A0(progressBar);
            this.f31928u.w();
        }
        X x10 = this.f31928u;
        if (x10 != null) {
            x10.w();
        }
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f31923p = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f31923p.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f31922o != null) {
            b();
        }
    }
}
