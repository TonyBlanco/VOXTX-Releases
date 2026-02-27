package com.nst.iptvsmarterstvbox.view.activity;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
import q7.C2633q;
import q7.C2636u;
import q7.S;
import q7.Z;
import q7.m0;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class SearchActivityLowerSDK extends Activity implements View.OnClickListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static C2858a f31645C;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Context f31646A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f31647B = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f31648a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f31649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f31650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinearLayout f31651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f31652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f31653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f31654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f31655i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f31656j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f31657k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f31658l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f31659m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f31660n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f31661o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f31662p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f31663q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinearLayout f31664r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ProgressBar f31665s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f31666t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C2636u f31667u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public m0 f31668v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Z f31669w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C2633q f31670x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f31671y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public S f31672z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = SearchActivityLowerSDK.this.f31655i;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = SearchActivityLowerSDK.this.f31648a;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            SearchActivityLowerSDK.this.o();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = SearchActivityLowerSDK.this.f31656j;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = SearchActivityLowerSDK.this.f31649c;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            SearchActivityLowerSDK.this.q();
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = SearchActivityLowerSDK.this.f31657k;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = SearchActivityLowerSDK.this.f31650d;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            SearchActivityLowerSDK.this.x();
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = SearchActivityLowerSDK.this.f31658l;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayout linearLayout = SearchActivityLowerSDK.this.f31651e;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            SearchActivityLowerSDK.this.u();
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f31681a;

        public i(String str) {
            this.f31681a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = SearchActivityLowerSDK.this.f31663q;
            if (textView != null) {
                textView.setText(this.f31681a);
                SearchActivityLowerSDK.this.f31663q.setVisibility(0);
            }
        }
    }

    public class j implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f31683a;

        public j(View view) {
            this.f31683a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31683a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31683a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            View view2;
            TextView textView;
            int i9;
            if (z9) {
                View view3 = this.f31683a;
                if (view3 == null || view3.getTag() == null) {
                    return;
                }
                if (this.f31683a.getTag().equals("10")) {
                    RecyclerView recyclerView = SearchActivityLowerSDK.this.f31648a;
                    if (recyclerView == null || recyclerView.getVisibility() != 0) {
                        textView = SearchActivityLowerSDK.this.f31655i;
                        i9 = a7.e.f11961T;
                    } else {
                        textView = SearchActivityLowerSDK.this.f31655i;
                        i9 = a7.e.f11964U;
                    }
                } else if (this.f31683a.getTag().equals("11")) {
                    RecyclerView recyclerView2 = SearchActivityLowerSDK.this.f31649c;
                    if (recyclerView2 == null || recyclerView2.getVisibility() != 0) {
                        textView = SearchActivityLowerSDK.this.f31656j;
                        i9 = a7.e.f11961T;
                    } else {
                        textView = SearchActivityLowerSDK.this.f31656j;
                        i9 = a7.e.f11964U;
                    }
                } else if (this.f31683a.getTag().equals("12")) {
                    RecyclerView recyclerView3 = SearchActivityLowerSDK.this.f31650d;
                    if (recyclerView3 == null || recyclerView3.getVisibility() != 0) {
                        textView = SearchActivityLowerSDK.this.f31657k;
                        i9 = a7.e.f11961T;
                    } else {
                        textView = SearchActivityLowerSDK.this.f31657k;
                        i9 = a7.e.f11964U;
                    }
                } else {
                    if (!this.f31683a.getTag().equals("13")) {
                        a(1.15f);
                        b(1.15f);
                        return;
                    }
                    LinearLayout linearLayout = SearchActivityLowerSDK.this.f31651e;
                    if (linearLayout == null || linearLayout.getVisibility() != 0) {
                        textView = SearchActivityLowerSDK.this.f31658l;
                        i9 = a7.e.f11961T;
                    } else {
                        textView = SearchActivityLowerSDK.this.f31658l;
                        i9 = a7.e.f11964U;
                    }
                }
            } else {
                if (z9 || (view2 = this.f31683a) == null || view2.getTag() == null) {
                    return;
                }
                float f9 = z9 ? 1.09f : 1.0f;
                a(f9);
                b(f9);
                if (this.f31683a.getTag() != null && this.f31683a.getTag().equals("10")) {
                    RecyclerView recyclerView4 = SearchActivityLowerSDK.this.f31648a;
                    if (recyclerView4 == null || recyclerView4.getVisibility() != 0) {
                        textView = SearchActivityLowerSDK.this.f31655i;
                        i9 = a7.e.f11955R;
                    } else {
                        textView = SearchActivityLowerSDK.this.f31655i;
                        i9 = a7.e.f11958S;
                    }
                } else if (this.f31683a.getTag() != null && this.f31683a.getTag().equals("11")) {
                    RecyclerView recyclerView5 = SearchActivityLowerSDK.this.f31649c;
                    if (recyclerView5 == null || recyclerView5.getVisibility() != 0) {
                        textView = SearchActivityLowerSDK.this.f31656j;
                        i9 = a7.e.f11955R;
                    } else {
                        textView = SearchActivityLowerSDK.this.f31656j;
                        i9 = a7.e.f11958S;
                    }
                } else if (this.f31683a.getTag() != null && this.f31683a.getTag().equals("12")) {
                    RecyclerView recyclerView6 = SearchActivityLowerSDK.this.f31650d;
                    if (recyclerView6 == null || recyclerView6.getVisibility() != 0) {
                        textView = SearchActivityLowerSDK.this.f31657k;
                        i9 = a7.e.f11955R;
                    } else {
                        textView = SearchActivityLowerSDK.this.f31657k;
                        i9 = a7.e.f11958S;
                    }
                } else {
                    if (this.f31683a.getTag() == null || !this.f31683a.getTag().equals("13")) {
                        return;
                    }
                    LinearLayout linearLayout2 = SearchActivityLowerSDK.this.f31651e;
                    if (linearLayout2 == null || linearLayout2.getVisibility() != 0) {
                        textView = SearchActivityLowerSDK.this.f31658l;
                        i9 = a7.e.f11955R;
                    } else {
                        textView = SearchActivityLowerSDK.this.f31658l;
                        i9 = a7.e.f11958S;
                    }
                }
            }
            textView.setBackgroundResource(i9);
        }
    }

    public void A(ArrayList arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.size() > 0) {
                    VodAllCategoriesSingleton.getInstance().setLiveList(arrayList);
                    this.f31648a.setLayoutManager(new GridLayoutManager(this, 7));
                    this.f31648a.setItemAnimator(null);
                    C2636u c2636u = new C2636u(this.f31646A, arrayList);
                    this.f31667u = c2636u;
                    this.f31648a.setAdapter(c2636u);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void B(ArrayList arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.size() > 0) {
                    VodAllCategoriesSingleton.getInstance().setVodList(arrayList);
                    this.f31649c.setLayoutManager(new GridLayoutManager(this, 7));
                    this.f31649c.setItemAnimator(null);
                    m0 m0Var = new m0(this.f31646A, "vod", 1);
                    this.f31668v = m0Var;
                    this.f31649c.setAdapter(m0Var);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void C(ArrayList arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.size() > 0) {
                    SeriesAllCategoriesSingleton.getInstance().setSeriesList(arrayList);
                    this.f31650d.setLayoutManager(new GridLayoutManager(this, 7));
                    this.f31650d.setItemAnimator(null);
                    Z z9 = new Z(this.f31646A, "series", 0);
                    this.f31669w = z9;
                    this.f31650d.setAdapter(z9);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void D() {
        RecyclerView recyclerView = this.f31648a;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        p();
    }

    public void E() {
        TextView textView = this.f31655i;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    public void F() {
        RecyclerView recyclerView = this.f31649c;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        r();
    }

    public void G() {
        TextView textView = this.f31656j;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    public void H(String str) {
        runOnUiThread(new i(str));
    }

    public void I() {
        LinearLayout linearLayout = this.f31651e;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        v();
    }

    public void J() {
        TextView textView = this.f31658l;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    public void K() {
        RecyclerView recyclerView = this.f31650d;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        y();
    }

    public void L() {
        TextView textView = this.f31657k;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    public void M(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f31671y;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        try {
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f31646A).equals("m3u")) {
                for (int i9 = 0; i9 < this.f31671y.size(); i9++) {
                    if (((XMLTVProgrammePojo) this.f31671y.get(i9)).getUrl().equals(str)) {
                        arrayList.add((XMLTVProgrammePojo) this.f31671y.get(i9));
                    }
                }
            } else {
                for (int i10 = 0; i10 < this.f31671y.size(); i10++) {
                    if (((XMLTVProgrammePojo) this.f31671y.get(i10)).getLiveStreamID().equals(str)) {
                        arrayList.add((XMLTVProgrammePojo) this.f31671y.get(i10));
                    }
                }
            }
            this.f31653g.setLayoutManager(new LinearLayoutManager(this, 1, false));
            this.f31653g.setItemAnimator(null);
            S s9 = new S(this.f31646A, arrayList);
            this.f31672z = s9;
            this.f31653g.setAdapter(s9);
        } catch (Exception unused) {
        }
    }

    public void a(int i9) {
        z(this.f31671y, i9);
    }

    public boolean b() {
        TextView textView = this.f31655i;
        return textView != null && textView.getVisibility() == 0;
    }

    public boolean c() {
        TextView textView = this.f31656j;
        return textView != null && textView.getVisibility() == 0;
    }

    public boolean d() {
        TextView textView = this.f31657k;
        return textView != null && textView.getVisibility() == 0;
    }

    public void e() {
        runOnUiThread(new b());
    }

    public void f() {
        runOnUiThread(new a());
    }

    public void g() {
        runOnUiThread(new d());
    }

    public void h() {
        runOnUiThread(new c());
    }

    public void i() {
        TextView textView = this.f31663q;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public void j() {
        runOnUiThread(new h());
    }

    public void k() {
        runOnUiThread(new g());
    }

    public void l() {
        runOnUiThread(new f());
    }

    public void m() {
        runOnUiThread(new e());
    }

    public final void n() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    public void o() {
        TextView textView = this.f31655i;
        if (textView != null) {
            textView.setBackgroundResource(a7.e.f11955R);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == a7.f.f12183J6) {
            p();
            g();
            l();
            j();
            D();
            return;
        }
        if (id == a7.f.rb) {
            r();
            e();
            l();
            j();
            F();
            return;
        }
        if (id == a7.f.bg) {
            y();
            e();
            g();
            j();
            K();
            return;
        }
        if (id != a7.f.Lc) {
            if (id == a7.f.f12141F4) {
                onBackPressed();
            }
        } else {
            v();
            e();
            g();
            l();
            I();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f31646A = this;
        super.onCreate(bundle);
        f31645C = new C2858a(this.f31646A);
        if (AbstractC2237a.f44526o.booleanValue() && !f31645C.m().booleanValue()) {
            finish();
            startActivity(new Intent(this, (Class<?>) APPInPurchaseActivity.class));
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        }
        setContentView(f31645C.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12645H0 : a7.g.f12639G0);
        this.f31648a = (RecyclerView) findViewById(a7.f.f12193K6);
        this.f31649c = (RecyclerView) findViewById(a7.f.qb);
        this.f31650d = (RecyclerView) findViewById(a7.f.ag);
        this.f31651e = (LinearLayout) findViewById(a7.f.z9);
        this.f31652f = (RecyclerView) findViewById(a7.f.f12278T1);
        this.f31653g = (RecyclerView) findViewById(a7.f.Kc);
        this.f31654h = (LinearLayout) findViewById(a7.f.Rg);
        this.f31655i = (TextView) findViewById(a7.f.f12183J6);
        this.f31656j = (TextView) findViewById(a7.f.rb);
        this.f31657k = (TextView) findViewById(a7.f.bg);
        this.f31658l = (TextView) findViewById(a7.f.Lc);
        this.f31659m = (TextView) findViewById(a7.f.bl);
        this.f31660n = (TextView) findViewById(a7.f.dl);
        this.f31661o = (TextView) findViewById(a7.f.fl);
        this.f31662p = (TextView) findViewById(a7.f.Di);
        this.f31663q = (TextView) findViewById(a7.f.wk);
        this.f31664r = (LinearLayout) findViewById(a7.f.l9);
        this.f31665s = (ProgressBar) findViewById(a7.f.pc);
        this.f31666t = (ImageView) findViewById(a7.f.f12141F4);
        s();
        t();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        n();
    }

    public void p() {
        TextView textView = this.f31655i;
        if (textView != null) {
            textView.setBackgroundResource(a7.e.f11958S);
        }
        TextView textView2 = this.f31656j;
        if (textView2 != null) {
            textView2.setBackgroundResource(a7.e.f11955R);
        }
        TextView textView3 = this.f31657k;
        if (textView3 != null) {
            textView3.setBackgroundResource(a7.e.f11955R);
        }
        TextView textView4 = this.f31658l;
        if (textView4 != null) {
            textView4.setBackgroundResource(a7.e.f11955R);
        }
    }

    public void q() {
        TextView textView = this.f31656j;
        if (textView != null) {
            textView.setBackgroundResource(a7.e.f11955R);
        }
    }

    public void r() {
        TextView textView = this.f31656j;
        if (textView != null) {
            textView.setBackgroundResource(a7.e.f11958S);
        }
        TextView textView2 = this.f31655i;
        if (textView2 != null) {
            textView2.setBackgroundResource(a7.e.f11955R);
        }
        TextView textView3 = this.f31657k;
        if (textView3 != null) {
            textView3.setBackgroundResource(a7.e.f11955R);
        }
        TextView textView4 = this.f31658l;
        if (textView4 != null) {
            textView4.setBackgroundResource(a7.e.f11955R);
        }
    }

    public final void s() {
        TextView textView = this.f31655i;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        TextView textView2 = this.f31656j;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        TextView textView3 = this.f31657k;
        if (textView3 != null) {
            textView3.setOnClickListener(this);
        }
        TextView textView4 = this.f31658l;
        if (textView4 != null) {
            textView4.setOnClickListener(this);
        }
        this.f31666t.setOnClickListener(this);
    }

    public final void t() {
        TextView textView = this.f31655i;
        if (textView != null) {
            textView.setOnFocusChangeListener(new j(textView));
        }
        TextView textView2 = this.f31656j;
        if (textView2 != null) {
            textView2.setOnFocusChangeListener(new j(textView2));
        }
        TextView textView3 = this.f31657k;
        if (textView3 != null) {
            textView3.setOnFocusChangeListener(new j(textView3));
        }
        TextView textView4 = this.f31658l;
        if (textView4 != null) {
            textView4.setOnFocusChangeListener(new j(textView4));
        }
    }

    public void u() {
        TextView textView = this.f31658l;
        if (textView != null) {
            textView.setBackgroundResource(a7.e.f11955R);
        }
    }

    public void v() {
        TextView textView = this.f31658l;
        if (textView != null) {
            textView.setBackgroundResource(a7.e.f11958S);
        }
        TextView textView2 = this.f31655i;
        if (textView2 != null) {
            textView2.setBackgroundResource(a7.e.f11955R);
        }
        TextView textView3 = this.f31656j;
        if (textView3 != null) {
            textView3.setBackgroundResource(a7.e.f11955R);
        }
        TextView textView4 = this.f31657k;
        if (textView4 != null) {
            textView4.setBackgroundResource(a7.e.f11955R);
        }
    }

    public void w(String str, String str2, String str3, String str4, int i9) {
        TextView textView = this.f31659m;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.f31662p;
        if (textView2 != null) {
            textView2.setText(str2);
        }
        TextView textView3 = this.f31660n;
        if (textView3 != null) {
            textView3.setText(str3);
        }
        TextView textView4 = this.f31661o;
        if (textView4 != null) {
            textView4.setText(str4);
        }
        if (i9 != 0) {
            ProgressBar progressBar = this.f31665s;
            if (progressBar != null) {
                progressBar.setProgress(i9);
            }
            LinearLayout linearLayout = this.f31664r;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f31664r;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        ProgressBar progressBar2 = this.f31665s;
        if (progressBar2 != null) {
            progressBar2.setProgress(0);
        }
    }

    public void x() {
        TextView textView = this.f31657k;
        if (textView != null) {
            textView.setBackgroundResource(a7.e.f11955R);
        }
    }

    public void y() {
        TextView textView = this.f31657k;
        if (textView != null) {
            textView.setBackgroundResource(a7.e.f11958S);
        }
        TextView textView2 = this.f31655i;
        if (textView2 != null) {
            textView2.setBackgroundResource(a7.e.f11955R);
        }
        TextView textView3 = this.f31656j;
        if (textView3 != null) {
            textView3.setBackgroundResource(a7.e.f11955R);
        }
        TextView textView4 = this.f31658l;
        if (textView4 != null) {
            textView4.setBackgroundResource(a7.e.f11955R);
        }
    }

    public void z(ArrayList arrayList, int i9) {
        try {
            this.f31671y = arrayList;
            if (arrayList == null || arrayList.size() <= 0) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (int i10 = 0; i10 < this.f31671y.size(); i10++) {
                if (!arrayList3.contains(((XMLTVProgrammePojo) this.f31671y.get(i10)).getLiveName())) {
                    arrayList3.add(((XMLTVProgrammePojo) this.f31671y.get(i10)).getLiveName());
                    arrayList2.add((XMLTVProgrammePojo) this.f31671y.get(i10));
                }
            }
            if (arrayList2.size() > 0) {
                Log.e("honey", "setLeftChannelsAdapter: " + arrayList2.size());
            }
            this.f31652f.setLayoutManager(new LinearLayoutManager(this, 1, false));
            this.f31652f.setItemAnimator(null);
            C2633q c2633q = new C2633q(this.f31646A, arrayList2, i9);
            this.f31670x = c2633q;
            this.f31652f.setAdapter(c2633q);
            this.f31652f.m1(i9);
        } catch (Exception unused) {
        }
    }
}
