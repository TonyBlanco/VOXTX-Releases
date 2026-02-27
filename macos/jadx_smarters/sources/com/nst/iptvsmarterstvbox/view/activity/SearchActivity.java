package com.nst.iptvsmarterstvbox.view.activity;

import D.AbstractC0519b;
import E.b;
import a7.e;
import a7.f;
import a7.g;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.model.SeriesAllCategoriesSingleton;
import com.nst.iptvsmarterstvbox.model.VodAllCategoriesSingleton;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.pojo.XMLTVProgrammePojo;
import java.util.ArrayList;
import m7.AbstractC2237a;
import p7.I;
import q7.C2633q;
import q7.C2636u;
import q7.S;
import q7.Z;
import q7.m0;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class SearchActivity extends I implements View.OnClickListener {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static C2858a f31613E;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Context f31614A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f31615B = 1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ArrayList f31616C = new ArrayList();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ArrayList f31617D = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f31618a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f31619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f31620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinearLayout f31621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f31622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f31623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f31624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f31625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f31626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f31627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f31628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f31629m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f31630n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f31631o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f31632p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f31633q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinearLayout f31634r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ProgressBar f31635s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f31636t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C2636u f31637u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public m0 f31638v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Z f31639w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C2633q f31640x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f31641y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public S f31642z;

    public class a implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f31643a;

        public a(View view) {
            this.f31643a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31643a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31643a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            View view2;
            TextView textView;
            int i9;
            if (z9) {
                View view3 = this.f31643a;
                if (view3 == null || view3.getTag() == null) {
                    return;
                }
                if (this.f31643a.getTag().equals("10")) {
                    if (SearchActivity.this.f31618a == null || SearchActivity.this.f31618a.getVisibility() != 0) {
                        textView = SearchActivity.this.f31625i;
                        i9 = e.f11961T;
                    } else {
                        textView = SearchActivity.this.f31625i;
                        i9 = e.f11964U;
                    }
                } else if (this.f31643a.getTag().equals("11")) {
                    if (SearchActivity.this.f31619c == null || SearchActivity.this.f31619c.getVisibility() != 0) {
                        textView = SearchActivity.this.f31626j;
                        i9 = e.f11961T;
                    } else {
                        textView = SearchActivity.this.f31626j;
                        i9 = e.f11964U;
                    }
                } else if (this.f31643a.getTag().equals("12")) {
                    if (SearchActivity.this.f31620d == null || SearchActivity.this.f31620d.getVisibility() != 0) {
                        textView = SearchActivity.this.f31627k;
                        i9 = e.f11961T;
                    } else {
                        textView = SearchActivity.this.f31627k;
                        i9 = e.f11964U;
                    }
                } else if (!this.f31643a.getTag().equals("13")) {
                    a(1.15f);
                    b(1.15f);
                    return;
                } else if (SearchActivity.this.f31621e == null || SearchActivity.this.f31621e.getVisibility() != 0) {
                    textView = SearchActivity.this.f31628l;
                    i9 = e.f11961T;
                } else {
                    textView = SearchActivity.this.f31628l;
                    i9 = e.f11964U;
                }
            } else {
                if (z9 || (view2 = this.f31643a) == null || view2.getTag() == null) {
                    return;
                }
                float f9 = z9 ? 1.09f : 1.0f;
                a(f9);
                b(f9);
                if (this.f31643a.getTag() == null || !this.f31643a.getTag().equals("10")) {
                    if (this.f31643a.getTag() == null || !this.f31643a.getTag().equals("11")) {
                        if (this.f31643a.getTag() == null || !this.f31643a.getTag().equals("12")) {
                            if (this.f31643a.getTag() == null || !this.f31643a.getTag().equals("13")) {
                                return;
                            }
                            if (SearchActivity.this.f31621e == null || SearchActivity.this.f31621e.getVisibility() != 0) {
                                textView = SearchActivity.this.f31628l;
                                i9 = e.f11955R;
                            } else {
                                textView = SearchActivity.this.f31628l;
                                i9 = e.f11958S;
                            }
                        } else if (SearchActivity.this.f31620d == null || SearchActivity.this.f31620d.getVisibility() != 0) {
                            textView = SearchActivity.this.f31627k;
                            i9 = e.f11955R;
                        } else {
                            textView = SearchActivity.this.f31627k;
                            i9 = e.f11958S;
                        }
                    } else if (SearchActivity.this.f31619c == null || SearchActivity.this.f31619c.getVisibility() != 0) {
                        textView = SearchActivity.this.f31626j;
                        i9 = e.f11955R;
                    } else {
                        textView = SearchActivity.this.f31626j;
                        i9 = e.f11958S;
                    }
                } else if (SearchActivity.this.f31618a == null || SearchActivity.this.f31618a.getVisibility() != 0) {
                    textView = SearchActivity.this.f31625i;
                    i9 = e.f11955R;
                } else {
                    textView = SearchActivity.this.f31625i;
                    i9 = e.f11958S;
                }
            }
            textView.setBackgroundResource(i9);
        }
    }

    private void C1() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private void K1() {
        TextView textView = this.f31625i;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        TextView textView2 = this.f31626j;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        TextView textView3 = this.f31627k;
        if (textView3 != null) {
            textView3.setOnClickListener(this);
        }
        TextView textView4 = this.f31628l;
        if (textView4 != null) {
            textView4.setOnClickListener(this);
        }
        this.f31636t.setOnClickListener(this);
    }

    private void L1() {
        TextView textView = this.f31625i;
        if (textView != null) {
            textView.setOnFocusChangeListener(new a(textView));
        }
        TextView textView2 = this.f31626j;
        if (textView2 != null) {
            textView2.setOnFocusChangeListener(new a(textView2));
        }
        TextView textView3 = this.f31627k;
        if (textView3 != null) {
            textView3.setOnFocusChangeListener(new a(textView3));
        }
        TextView textView4 = this.f31628l;
        if (textView4 != null) {
            textView4.setOnFocusChangeListener(new a(textView4));
        }
    }

    public void A1() {
        RecyclerView recyclerView = this.f31620d;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        Q1();
    }

    public void B1() {
        TextView textView = this.f31627k;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public final void D1() {
        ArrayList arrayList = new ArrayList();
        this.f31618a.setLayoutManager(new GridLayoutManager(this, 7));
        this.f31618a.setItemAnimator(null);
        C2636u c2636u = new C2636u(this.f31614A, arrayList);
        this.f31637u = c2636u;
        c2636u.e1(null);
        this.f31637u.d1();
        this.f31618a.setAdapter(this.f31637u);
    }

    public final void E1() {
        this.f31619c.setLayoutManager(new GridLayoutManager(this, 7));
        this.f31619c.setItemAnimator(null);
        m0 m0Var = new m0(this.f31614A, "vod", 0);
        this.f31638v = m0Var;
        m0Var.p1(null);
        this.f31619c.setAdapter(this.f31638v);
    }

    public final void F1() {
        this.f31620d.setLayoutManager(new GridLayoutManager(this, 7));
        this.f31620d.setItemAnimator(null);
        Z z9 = new Z(this.f31614A, "series", 0);
        this.f31639w = z9;
        z9.E1(null);
        this.f31620d.setAdapter(this.f31639w);
    }

    public void G1() {
        TextView textView = this.f31625i;
        if (textView != null) {
            textView.setBackgroundResource(e.f11955R);
        }
    }

    public void H1() {
        TextView textView = this.f31625i;
        if (textView != null) {
            textView.setBackgroundResource(e.f11958S);
        }
        TextView textView2 = this.f31626j;
        if (textView2 != null) {
            textView2.setBackgroundResource(e.f11955R);
        }
        TextView textView3 = this.f31627k;
        if (textView3 != null) {
            textView3.setBackgroundResource(e.f11955R);
        }
        TextView textView4 = this.f31628l;
        if (textView4 != null) {
            textView4.setBackgroundResource(e.f11955R);
        }
    }

    public void I1() {
        TextView textView = this.f31626j;
        if (textView != null) {
            textView.setBackgroundResource(e.f11955R);
        }
    }

    public void J1() {
        TextView textView = this.f31626j;
        if (textView != null) {
            textView.setBackgroundResource(e.f11958S);
        }
        TextView textView2 = this.f31625i;
        if (textView2 != null) {
            textView2.setBackgroundResource(e.f11955R);
        }
        TextView textView3 = this.f31627k;
        if (textView3 != null) {
            textView3.setBackgroundResource(e.f11955R);
        }
        TextView textView4 = this.f31628l;
        if (textView4 != null) {
            textView4.setBackgroundResource(e.f11955R);
        }
    }

    public void M1() {
        TextView textView = this.f31628l;
        if (textView != null) {
            textView.setBackgroundResource(e.f11955R);
        }
    }

    public void N1() {
        TextView textView = this.f31628l;
        if (textView != null) {
            textView.setBackgroundResource(e.f11958S);
        }
        TextView textView2 = this.f31625i;
        if (textView2 != null) {
            textView2.setBackgroundResource(e.f11955R);
        }
        TextView textView3 = this.f31626j;
        if (textView3 != null) {
            textView3.setBackgroundResource(e.f11955R);
        }
        TextView textView4 = this.f31627k;
        if (textView4 != null) {
            textView4.setBackgroundResource(e.f11955R);
        }
    }

    public final void O1() {
        if (b.checkSelfPermission(this, "android.permission.RECORD_AUDIO") == 0) {
            b.checkSelfPermission(this, "android.permission.RECORD_AUDIO");
            return;
        }
        String[] strArr = {"android.permission.RECORD_AUDIO"};
        if (AbstractC0519b.l(this, "android.permission.RECORD_AUDIO")) {
            AbstractC0519b.h(this, strArr, 1);
        } else {
            AbstractC0519b.h(this, strArr, 1);
        }
    }

    public void P1(String str, String str2, String str3, String str4, int i9) {
        TextView textView = this.f31629m;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.f31632p;
        if (textView2 != null) {
            textView2.setText(str2);
        }
        TextView textView3 = this.f31630n;
        if (textView3 != null) {
            textView3.setText(str3);
        }
        TextView textView4 = this.f31631o;
        if (textView4 != null) {
            textView4.setText(str4);
        }
        if (i9 != 0) {
            ProgressBar progressBar = this.f31635s;
            if (progressBar != null) {
                progressBar.setProgress(i9);
            }
            LinearLayout linearLayout = this.f31634r;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f31634r;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        ProgressBar progressBar2 = this.f31635s;
        if (progressBar2 != null) {
            progressBar2.setProgress(0);
        }
    }

    public void Q1() {
        TextView textView = this.f31627k;
        if (textView != null) {
            textView.setBackgroundResource(e.f11955R);
        }
    }

    public void R1() {
        TextView textView = this.f31627k;
        if (textView != null) {
            textView.setBackgroundResource(e.f11958S);
        }
        TextView textView2 = this.f31625i;
        if (textView2 != null) {
            textView2.setBackgroundResource(e.f11955R);
        }
        TextView textView3 = this.f31626j;
        if (textView3 != null) {
            textView3.setBackgroundResource(e.f11955R);
        }
        TextView textView4 = this.f31628l;
        if (textView4 != null) {
            textView4.setBackgroundResource(e.f11955R);
        }
    }

    public void S1(ArrayList arrayList, int i9) {
        try {
            this.f31641y = arrayList;
            if (arrayList == null || arrayList.size() <= 0) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (int i10 = 0; i10 < this.f31641y.size(); i10++) {
                if (!arrayList3.contains(((XMLTVProgrammePojo) this.f31641y.get(i10)).getLiveName())) {
                    arrayList3.add(((XMLTVProgrammePojo) this.f31641y.get(i10)).getLiveName());
                    arrayList2.add((XMLTVProgrammePojo) this.f31641y.get(i10));
                }
            }
            if (arrayList2.size() > 0) {
                Log.e("honey", "setLeftChannelsAdapter: " + arrayList2.size());
            }
            this.f31622f.setLayoutManager(new LinearLayoutManager(this, 1, false));
            this.f31622f.setItemAnimator(null);
            C2633q c2633q = new C2633q(this.f31614A, arrayList2, i9);
            this.f31640x = c2633q;
            c2633q.n0(null);
            this.f31622f.setAdapter(this.f31640x);
            this.f31622f.m1(i9);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public void T1(ArrayList arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.size() > 0) {
                    VodAllCategoriesSingleton.getInstance().setLiveList(arrayList);
                    C2636u c2636u = this.f31637u;
                    if (c2636u == null) {
                        this.f31618a.setLayoutManager(new GridLayoutManager(this, 7));
                        this.f31618a.setItemAnimator(null);
                        C2636u c2636u2 = new C2636u(this.f31614A, arrayList);
                        this.f31637u = c2636u2;
                        c2636u2.d1();
                        this.f31618a.setAdapter(this.f31637u);
                    } else {
                        c2636u.d1();
                        this.f31637u.g1(arrayList);
                        this.f31637u.w();
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public void U1(ArrayList arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.size() > 0) {
                    VodAllCategoriesSingleton.getInstance().setVodList(arrayList);
                    m0 m0Var = this.f31638v;
                    if (m0Var == null) {
                        this.f31619c.setLayoutManager(new GridLayoutManager(this, 7));
                        this.f31619c.setItemAnimator(null);
                        m0 m0Var2 = new m0(this.f31614A, "vod", 0);
                        this.f31638v = m0Var2;
                        this.f31619c.setAdapter(m0Var2);
                    } else {
                        m0Var.q1();
                        this.f31638v.w();
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public void V1(ArrayList arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.size() > 0) {
                    SeriesAllCategoriesSingleton.getInstance().setSeriesList(arrayList);
                    Z z9 = this.f31639w;
                    if (z9 == null) {
                        this.f31620d.setLayoutManager(new GridLayoutManager(this, 7));
                        this.f31620d.setItemAnimator(null);
                        Z z10 = new Z(this.f31614A, "series", 0);
                        this.f31639w = z10;
                        this.f31620d.setAdapter(z10);
                    } else {
                        z9.F1();
                        this.f31639w.w();
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public void W1() {
        RecyclerView recyclerView = this.f31618a;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        H1();
    }

    public void X1() {
        TextView textView = this.f31625i;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    public void Y1() {
        RecyclerView recyclerView = this.f31619c;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        J1();
    }

    public void Z1() {
        TextView textView = this.f31626j;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    public void a2(String str) {
        TextView textView = this.f31633q;
        if (textView != null) {
            textView.setText(str);
            this.f31633q.setVisibility(0);
        }
    }

    public void b2() {
        LinearLayout linearLayout = this.f31621e;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        N1();
    }

    public void c2() {
        TextView textView = this.f31628l;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    public void d2() {
        RecyclerView recyclerView = this.f31620d;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        R1();
    }

    public void e2() {
        TextView textView = this.f31627k;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    public void f2(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f31641y;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        try {
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f31614A).equals("m3u")) {
                for (int i9 = 0; i9 < this.f31641y.size(); i9++) {
                    if (((XMLTVProgrammePojo) this.f31641y.get(i9)).getUrl().equals(str)) {
                        arrayList.add((XMLTVProgrammePojo) this.f31641y.get(i9));
                    }
                }
            } else {
                for (int i10 = 0; i10 < this.f31641y.size(); i10++) {
                    if (((XMLTVProgrammePojo) this.f31641y.get(i10)).getLiveStreamID().equals(str)) {
                        arrayList.add((XMLTVProgrammePojo) this.f31641y.get(i10));
                    }
                }
            }
            this.f31623g.setLayoutManager(new LinearLayoutManager(this, 1, false));
            this.f31623g.setItemAnimator(null);
            S s9 = new S(this.f31614A, arrayList);
            this.f31642z = s9;
            this.f31623g.setAdapter(s9);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == f.f12183J6) {
            H1();
            v1();
            A1();
            y1();
            W1();
            return;
        }
        if (id == f.rb) {
            J1();
            t1();
            A1();
            y1();
            Y1();
            return;
        }
        if (id == f.bg) {
            R1();
            t1();
            v1();
            y1();
            d2();
            return;
        }
        if (id != f.Lc) {
            if (id == f.f12141F4) {
                onBackPressed();
            }
        } else {
            N1();
            t1();
            v1();
            A1();
            b2();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f31614A = this;
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f31614A);
        f31613E = c2858a;
        setContentView(c2858a.A().equals(AbstractC2237a.f44453K0) ? g.f12651I0 : g.f12633F0);
        this.f31618a = (RecyclerView) findViewById(f.f12193K6);
        this.f31619c = (RecyclerView) findViewById(f.qb);
        this.f31620d = (RecyclerView) findViewById(f.ag);
        this.f31621e = (LinearLayout) findViewById(f.z9);
        this.f31622f = (RecyclerView) findViewById(f.f12278T1);
        this.f31623g = (RecyclerView) findViewById(f.Kc);
        this.f31624h = (LinearLayout) findViewById(f.Rg);
        this.f31625i = (TextView) findViewById(f.f12183J6);
        this.f31626j = (TextView) findViewById(f.rb);
        this.f31627k = (TextView) findViewById(f.bg);
        this.f31628l = (TextView) findViewById(f.Lc);
        this.f31629m = (TextView) findViewById(f.bl);
        this.f31630n = (TextView) findViewById(f.dl);
        this.f31631o = (TextView) findViewById(f.fl);
        this.f31632p = (TextView) findViewById(f.Di);
        this.f31633q = (TextView) findViewById(f.wk);
        this.f31634r = (LinearLayout) findViewById(f.l9);
        this.f31635s = (ProgressBar) findViewById(f.pc);
        this.f31636t = (ImageView) findViewById(f.f12141F4);
        O1();
        K1();
        L1();
        F1();
        D1();
        E1();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        return super.onKeyDown(i9, keyEvent);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i9, strArr, iArr);
        if (i9 != 1) {
            return;
        }
        try {
            if (iArr.length > 0) {
                int i10 = iArr[0];
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        C1();
    }

    public void p1(int i9) {
        S1(this.f31641y, i9);
    }

    public boolean q1() {
        TextView textView = this.f31625i;
        return textView != null && textView.getVisibility() == 0;
    }

    public boolean r1() {
        TextView textView = this.f31626j;
        return textView != null && textView.getVisibility() == 0;
    }

    public boolean s1() {
        TextView textView = this.f31627k;
        return textView != null && textView.getVisibility() == 0;
    }

    public void t1() {
        RecyclerView recyclerView = this.f31618a;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        G1();
    }

    public void u1() {
        TextView textView = this.f31625i;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public void v1() {
        RecyclerView recyclerView = this.f31619c;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        I1();
    }

    public void w1() {
        TextView textView = this.f31626j;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public void x1() {
        TextView textView = this.f31633q;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public void y1() {
        LinearLayout linearLayout = this.f31621e;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        M1();
    }

    public void z1() {
        TextView textView = this.f31628l;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }
}
