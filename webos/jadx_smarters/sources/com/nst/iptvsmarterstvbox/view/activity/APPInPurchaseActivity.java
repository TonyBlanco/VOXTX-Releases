package com.nst.iptvsmarterstvbox.view.activity;

import a7.j;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b7.AbstractC1232b;
import com.amazonaws.services.s3.internal.Constants;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.nst.iptvsmarterstvbox.model.callback.BillingCheckGPACallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingGetDevicesCallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingLoginClientCallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingUpdateDevicesCallback;
import com.nst.iptvsmarterstvbox.model.callback.RegisterClientCallback;
import com.nst.iptvsmarterstvbox.model.database.ExternalPlayerDataBase;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import g1.AbstractC1809c;
import g1.C1807a;
import g1.C1812f;
import g1.C1817k;
import g1.InterfaceC1808b;
import g1.InterfaceC1811e;
import g1.InterfaceC1815i;
import g1.InterfaceC1816j;
import g1.InterfaceC1818l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import m7.AbstractC2237a;
import m7.w;
import org.apache.http.client.config.CookieSpecs;
import q7.C2623g;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class APPInPurchaseActivity extends Activity implements View.OnClickListener, z7.d, InterfaceC1816j, InterfaceC1818l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public LinearLayout f28873A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public LinearLayout f28874B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Button f28875C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public TextView f28876D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public TextView f28877E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public TextView f28878F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public TextView f28879G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public LinearLayout f28880H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Button f28881I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Button f28882J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public LinearLayout f28883K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Context f28884L;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public n7.b f28886N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public String f28887O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public String f28888P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f28889Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public C2858a f28890R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public String f28891S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public String f28892T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public String f28893U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public String f28894V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public String f28895W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public String f28896X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinearLayout f28899a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f28900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EditText f28901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EditText f28902e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public AbstractC1809c f28903e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f28904f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public SkuDetails f28905f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f28906g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Handler f28907g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f28908h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public InterfaceC1808b f28909h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f28910i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f28911j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayout f28912k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EditText f28913l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public EditText f28914m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Button f28915n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f28916o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Button f28917p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LinearLayout f28918q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Button f28919r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f28920s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f28921t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f28922u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RelativeLayout f28923v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f28924w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public LinearLayout f28925x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public LinearLayout f28926y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public LinearLayout f28927z;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f28885M = false;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public String f28897Y = "";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public String f28898Z = "";

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                w.N0(APPInPurchaseActivity.this.f28884L);
            }
        }
    }

    public class b implements InterfaceC1808b {
        public b() {
        }

        @Override // g1.InterfaceC1808b
        public void a(com.android.billingclient.api.a aVar) {
            if (aVar.b() == 0) {
                Log.e("honey", "onAcknowledgePurchaseResponse:1");
            }
            Log.e("honey", "onAcknowledgePurchaseResponse:2");
        }
    }

    public class c implements InterfaceC1811e {

        public class a implements InterfaceC1815i {
            public a() {
            }

            @Override // g1.InterfaceC1815i
            public void a(com.android.billingclient.api.a aVar, List list) {
                if (aVar.b() == 0 && list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Purchase purchase = (Purchase) it.next();
                        if (purchase.f().contains("com.nst.smartersplayer.billing") && APPInPurchaseActivity.this.f28890R.k() != null && APPInPurchaseActivity.this.f28890R.n() != null && APPInPurchaseActivity.this.f28890R.l() == 0 && APPInPurchaseActivity.this.f28890R.k().equals("") && APPInPurchaseActivity.this.f28890R.n().equals("")) {
                            APPInPurchaseActivity.this.f();
                            String strA = purchase.a();
                            String strO0 = w.o0(strA + "*Njh0&$@ZH098GP-Vu6HilnbLo63-" + AbstractC1232b.f17695b + "-");
                            try {
                                APPInPurchaseActivity.this.f28907g0.obtainMessage(1, "").sendToTarget();
                            } catch (Exception unused) {
                            }
                            APPInPurchaseActivity.this.f28886N.d(strO0, strA);
                            break;
                        }
                    }
                }
                Log.e("honey", "onQueryPurchasesResponse");
            }
        }

        public c() {
        }

        @Override // g1.InterfaceC1811e
        public void a(com.android.billingclient.api.a aVar) {
            if (aVar.b() == 0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add("com.nst.smartersplayer.billing");
                APPInPurchaseActivity.this.f28903e0.g(C1817k.c().c("inapp").b(arrayList).a(), APPInPurchaseActivity.this);
                APPInPurchaseActivity.this.f28903e0.f("inapp", new a());
            } else {
                APPInPurchaseActivity.this.f28885M = false;
                Button button = APPInPurchaseActivity.this.f28919r;
                if (button != null) {
                    button.setVisibility(8);
                }
                Button button2 = APPInPurchaseActivity.this.f28882J;
                if (button2 != null) {
                    button2.setVisibility(0);
                }
            }
            Log.e("honey", "onBillingSetupFinished");
        }

        @Override // g1.InterfaceC1811e
        public void b() {
            Log.e("honey", "onBillingServiceDisconnected");
        }
    }

    public class d implements InterfaceC1815i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean[] f28932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String[] f28933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28934c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ RegisterClientCallback f28935d;

        public d(boolean[] zArr, String[] strArr, String str, RegisterClientCallback registerClientCallback) {
            this.f28932a = zArr;
            this.f28933b = strArr;
            this.f28934c = str;
            this.f28935d = registerClientCallback;
        }

        @Override // g1.InterfaceC1815i
        public void a(com.android.billingclient.api.a aVar, List list) {
            if (aVar.b() == 0 && list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Purchase purchase = (Purchase) it.next();
                    if (purchase.f().contains("com.nst.smartersplayer.billing")) {
                        this.f28932a[0] = true;
                        this.f28933b[0] = purchase.a();
                        break;
                    }
                }
            }
            if (this.f28932a[0]) {
                APPInPurchaseActivity.this.f28886N.e(APPInPurchaseActivity.this.f28891S, APPInPurchaseActivity.this.f28892T, APPInPurchaseActivity.this.f28888P, APPInPurchaseActivity.this.f28887O, this.f28934c, this.f28935d.getData().getId().intValue(), "true", this.f28933b[0]);
            } else {
                APPInPurchaseActivity.this.f28886N.e(APPInPurchaseActivity.this.f28891S, APPInPurchaseActivity.this.f28892T, APPInPurchaseActivity.this.f28888P, APPInPurchaseActivity.this.f28887O, this.f28934c, this.f28935d.getData().getId().intValue(), "false", "");
            }
            Log.e("honey", "onQueryPurchasesResponse");
        }
    }

    public class e extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f28937a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f28938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public LinearLayout f28939d;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f28941a;

            public a(View view) {
                this.f28941a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f28941a;
                    if (view2 == null || view2.getTag() == null || !this.f28941a.getTag().equals("2")) {
                        return;
                    }
                    linearLayout = e.this.f28939d;
                    i9 = a7.e.f12042p;
                } else {
                    View view3 = this.f28941a;
                    if (view3 == null || view3.getTag() == null || !this.f28941a.getTag().equals("2")) {
                        return;
                    }
                    linearLayout = e.this.f28939d;
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        public e(Activity activity) {
            super(activity);
            this.f28937a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getId() == a7.f.f12544u1) {
                try {
                    dismiss();
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(APPInPurchaseActivity.this.f28890R.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12807h2 : a7.g.f12801g2);
            this.f28938c = (TextView) findViewById(a7.f.f12544u1);
            this.f28939d = (LinearLayout) findViewById(a7.f.Ia);
            this.f28938c.setOnClickListener(this);
            TextView textView = this.f28938c;
            textView.setOnFocusChangeListener(new a(textView));
        }
    }

    public class f extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f28943a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f28944c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public LinearLayout f28945d;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f28947a;

            public a(View view) {
                this.f28947a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f28947a;
                    if (view2 == null || view2.getTag() == null || !this.f28947a.getTag().equals("2")) {
                        return;
                    }
                    linearLayout = f.this.f28945d;
                    i9 = a7.e.f12042p;
                } else {
                    View view3 = this.f28947a;
                    if (view3 == null || view3.getTag() == null || !this.f28947a.getTag().equals("2")) {
                        return;
                    }
                    linearLayout = f.this.f28945d;
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        public f(Activity activity) {
            super(activity);
            this.f28943a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getId() == a7.f.f12544u1) {
                try {
                    dismiss();
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(APPInPurchaseActivity.this.f28890R.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12754Z1 : a7.g.f12748Y1);
            this.f28944c = (TextView) findViewById(a7.f.f12544u1);
            this.f28945d = (LinearLayout) findViewById(a7.f.Ia);
            this.f28944c.setOnClickListener(this);
            TextView textView = this.f28944c;
            textView.setOnFocusChangeListener(new a(textView));
        }
    }

    public class g extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f28949a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f28950c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Activity f28951d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f28952e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public TextView f28953f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public TextView f28954g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public LinearLayout f28955h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public LinearLayout f28956i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public RecyclerView f28957j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public C2623g f28958k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public LinearLayoutManager f28959l;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f28961a;

            public a(View view) {
                this.f28961a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f28961a;
                    if (view2 == null || view2.getTag() == null || !this.f28961a.getTag().equals("1")) {
                        View view3 = this.f28961a;
                        if (view3 == null || view3.getTag() == null || !this.f28961a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = g.this.f28956i;
                        }
                    } else {
                        linearLayout = g.this.f28955h;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f28961a;
                    if (view4 == null || view4.getTag() == null || !this.f28961a.getTag().equals("1")) {
                        View view5 = this.f28961a;
                        if (view5 == null || view5.getTag() == null || !this.f28961a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = g.this.f28956i;
                        }
                    } else {
                        linearLayout = g.this.f28955h;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        public g(Activity activity, List list, Context context) {
            super(activity);
            this.f28951d = activity;
            this.f28950c = context;
            this.f28949a = list;
            this.f28959l = new LinearLayoutManager(context);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (view.getId() == a7.f.f12227O0) {
                    if (APPInPurchaseActivity.this.f28896X.equals("") && APPInPurchaseActivity.this.f28895W.equals("")) {
                        APPInPurchaseActivity.this.H("Please select any device to activate.");
                    } else {
                        dismiss();
                        if (APPInPurchaseActivity.this.f28890R.k() != null && APPInPurchaseActivity.this.f28890R.n() != null && APPInPurchaseActivity.this.f28890R.l() != 0 && !APPInPurchaseActivity.this.f28890R.k().equals("") && !APPInPurchaseActivity.this.f28890R.n().equals("")) {
                            APPInPurchaseActivity.this.f();
                            APPInPurchaseActivity.this.f28886N.i(APPInPurchaseActivity.this.f28890R.k(), w.o0(APPInPurchaseActivity.this.f28890R.k() + "*Njh0&$@ZH098GP-Vu6HilnbLo63-" + AbstractC1232b.f17695b + "-"), APPInPurchaseActivity.this.f28890R.l(), APPInPurchaseActivity.this.f28895W, APPInPurchaseActivity.this.f28887O, APPInPurchaseActivity.this.f28888P);
                        }
                    }
                } else if (view.getId() != a7.f.f12313X0) {
                } else {
                    dismiss();
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(APPInPurchaseActivity.this.f28890R.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12831l2 : a7.g.f12825k2);
            this.f28953f = (TextView) findViewById(a7.f.f12227O0);
            this.f28954g = (TextView) findViewById(a7.f.f12313X0);
            this.f28955h = (LinearLayout) findViewById(a7.f.V8);
            this.f28956i = (LinearLayout) findViewById(a7.f.Ia);
            this.f28957j = (RecyclerView) findViewById(a7.f.Ed);
            TextView textView = (TextView) findViewById(a7.f.fm);
            this.f28952e = textView;
            textView.setText("Devices List");
            this.f28952e.setTypeface(null, 1);
            C2623g c2623g = new C2623g(this.f28950c, this.f28949a);
            this.f28958k = c2623g;
            this.f28957j.setAdapter(c2623g);
            this.f28957j.setLayoutManager(this.f28959l);
            this.f28953f.setOnClickListener(this);
            this.f28954g.setOnClickListener(this);
            TextView textView2 = this.f28953f;
            textView2.setOnFocusChangeListener(new a(textView2));
            TextView textView3 = this.f28954g;
            textView3.setOnFocusChangeListener(new a(textView3));
        }
    }

    public class h extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f28963a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f28964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f28965d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f28966e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public TextView f28967f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public LinearLayout f28968g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public LinearLayout f28969h;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f28971a;

            public a(View view) {
                this.f28971a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f28971a;
                    if (view2 == null || view2.getTag() == null || !this.f28971a.getTag().equals("1")) {
                        View view3 = this.f28971a;
                        if (view3 == null || view3.getTag() == null || !this.f28971a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = h.this.f28969h;
                        }
                    } else {
                        linearLayout = h.this.f28968g;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f28971a;
                    if (view4 == null || view4.getTag() == null || !this.f28971a.getTag().equals("1")) {
                        View view5 = this.f28971a;
                        if (view5 == null || view5.getTag() == null || !this.f28971a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = h.this.f28969h;
                        }
                    } else {
                        linearLayout = h.this.f28968g;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        public h(Activity activity) {
            super(activity);
            this.f28963a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Throwable {
            try {
                if (view.getId() == a7.f.f12544u1) {
                    dismiss();
                    APPInPurchaseActivity.this.f28890R.a();
                    try {
                        new ExternalPlayerDataBase(APPInPurchaseActivity.this.f28884L).removeAllPlayers();
                        SharepreferenceDBHandler.setLivePlayer(CookieSpecs.DEFAULT, "Built-in Player (Hardware/Software Decoder)", APPInPurchaseActivity.this.f28884L);
                        SharepreferenceDBHandler.setVODPlayer(CookieSpecs.DEFAULT, "Default Player", APPInPurchaseActivity.this.f28884L);
                        SharepreferenceDBHandler.setSeriesPlayer(CookieSpecs.DEFAULT, "Default Player", APPInPurchaseActivity.this.f28884L);
                        SharepreferenceDBHandler.setRecordingsPlayer(CookieSpecs.DEFAULT, "Default Player", APPInPurchaseActivity.this.f28884L);
                        new LiveStreamDBHandler(APPInPurchaseActivity.this.f28884L).updatePasswordStatusForAll();
                        new LiveStreamDBHandler(APPInPurchaseActivity.this.f28884L).deleteAllPasswordData();
                    } catch (Exception unused) {
                    }
                    APPInPurchaseActivity aPPInPurchaseActivity = APPInPurchaseActivity.this;
                    aPPInPurchaseActivity.H(aPPInPurchaseActivity.getResources().getString(j.f13220c3));
                    APPInPurchaseActivity.this.x(false);
                } else if (view.getId() != a7.f.f12412h1) {
                } else {
                    dismiss();
                }
            } catch (Exception unused2) {
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(APPInPurchaseActivity.this.f28890R.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12768b2 : a7.g.f12761a2);
            this.f28964c = (TextView) findViewById(a7.f.f12544u1);
            this.f28965d = (TextView) findViewById(a7.f.f12412h1);
            this.f28968g = (LinearLayout) findViewById(a7.f.V8);
            this.f28969h = (LinearLayout) findViewById(a7.f.Ia);
            this.f28967f = (TextView) findViewById(a7.f.fm);
            this.f28966e = (TextView) findViewById(a7.f.um);
            this.f28967f.setText("Logout?");
            this.f28967f.setTypeface(null, 1);
            this.f28966e.setText(APPInPurchaseActivity.this.getResources().getString(j.f13240e3));
            this.f28968g.setVisibility(0);
            this.f28964c.setOnClickListener(this);
            this.f28965d.setOnClickListener(this);
            TextView textView = this.f28964c;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f28965d;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    public class i implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f28973a;

        public i(View view) {
            this.f28973a = view;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            View view2;
            View view3;
            int i9;
            if (z9) {
                View view4 = this.f28973a;
                if (view4 == null || view4.getTag() == null || !this.f28973a.getTag().equals("2")) {
                    return;
                }
                view3 = this.f28973a;
                i9 = a7.e.f12024k1;
            } else {
                if (z9 || (view2 = this.f28973a) == null || view2.getTag() == null || !this.f28973a.getTag().equals("2")) {
                    return;
                }
                view3 = this.f28973a;
                i9 = a7.e.f12038o;
            }
            view3.setBackgroundResource(i9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(String str) {
        Toast.makeText(this, str, 0).show();
    }

    @Override // z7.d
    public void B0(RegisterClientCallback registerClientCallback) {
        Resources resources;
        int i9;
        String message;
        w.X();
        if (registerClientCallback != null) {
            try {
                if (registerClientCallback.getResult() == null || !registerClientCallback.getResult().equals("success")) {
                    if (registerClientCallback.getResult() == null || !registerClientCallback.getResult().equals("error") || registerClientCallback.getMessage() == null) {
                        resources = getResources();
                        i9 = j.f13244e7;
                    } else {
                        message = registerClientCallback.getMessage();
                        H(message);
                    }
                } else if (registerClientCallback.getSc() != null) {
                    if (!registerClientCallback.getSc().equalsIgnoreCase(w.o0("Vu6HilnbLo63*KJHGFkugu345*&^klih*" + AbstractC1232b.f17695b)) || registerClientCallback.getData() == null) {
                        resources = getResources();
                        i9 = j.f13244e7;
                    } else {
                        this.f28890R.O(this.f28891S, this.f28892T, registerClientCallback.getData().getId().intValue());
                        H(getResources().getString(j.f13326n));
                        if (this.f28891S != null && this.f28892T != null && registerClientCallback.getData().getId().intValue() != 0 && !this.f28891S.equals("") && !this.f28892T.equals("")) {
                            f();
                            String strO0 = w.o0(this.f28891S + "*Njh0&$@ZH098GP-Vu6HilnbLo63-" + AbstractC1232b.f17695b + "-");
                            this.f28890R.Q(Boolean.FALSE);
                            this.f28903e0.f("inapp", new d(new boolean[]{false}, new String[]{""}, strO0, registerClientCallback));
                        }
                        x(false);
                    }
                } else {
                    resources = getResources();
                    i9 = j.f13244e7;
                }
                message = resources.getString(i9);
                H(message);
            } catch (Exception unused) {
            }
        }
        Log.e("honey", "registerClientResponse:");
    }

    public final void C() {
        this.f28918q.setOnClickListener(this);
        this.f28916o.setOnClickListener(this);
        this.f28917p.setOnClickListener(this);
        this.f28908h.setOnClickListener(this);
        this.f28910i.setOnClickListener(this);
        this.f28911j.setOnClickListener(this);
        this.f28915n.setOnClickListener(this);
        this.f28906g.setOnClickListener(this);
        this.f28920s.setOnClickListener(this);
        this.f28921t.setOnClickListener(this);
        this.f28875C.setOnClickListener(this);
        this.f28881I.setOnClickListener(this);
        this.f28882J.setOnClickListener(this);
        this.f28883K.setOnClickListener(this);
    }

    public final void D() {
        Button button = this.f28919r;
        button.setOnFocusChangeListener(new i(button));
        Button button2 = this.f28882J;
        button2.setOnFocusChangeListener(new i(button2));
        Button button3 = this.f28906g;
        button3.setOnFocusChangeListener(new i(button3));
        Button button4 = this.f28915n;
        button4.setOnFocusChangeListener(new i(button4));
        Button button5 = this.f28875C;
        button5.setOnFocusChangeListener(new i(button5));
        Button button6 = this.f28881I;
        button6.setOnFocusChangeListener(new i(button6));
        LinearLayout linearLayout = this.f28883K;
        linearLayout.setOnFocusChangeListener(new i(linearLayout));
        Button button7 = this.f28916o;
        button7.setOnFocusChangeListener(new i(button7));
        Button button8 = this.f28917p;
        button8.setOnFocusChangeListener(new i(button8));
    }

    public final void E() {
        try {
            AbstractC1809c abstractC1809c = this.f28903e0;
            if (abstractC1809c == null || this.f28905f0 == null) {
                return;
            }
            abstractC1809c.d(this, C1812f.a().b(this.f28905f0).a());
        } catch (Exception unused) {
        }
    }

    public void F(String str, String str2) {
        this.f28896X = str;
        this.f28895W = str2;
    }

    public final void G() {
        C2858a c2858a = this.f28890R;
        if (c2858a == null || c2858a.k() == null || this.f28890R.n() == null || this.f28890R.l() == 0 || this.f28890R.k().equals("") || this.f28890R.n().equals("")) {
            return;
        }
        f();
        this.f28886N.f(this.f28890R.k(), this.f28890R.n(), w.o0(this.f28890R.k() + "*Njh0&$@ZH098GP-Vu6HilnbLo63-" + AbstractC1232b.f17695b + "-"), this.f28890R.l());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007e A[Catch: Exception -> 0x00e9, TryCatch #0 {Exception -> 0x00e9, blocks: (B:4:0x0005, B:6:0x000b, B:8:0x0017, B:10:0x001d, B:12:0x003e, B:14:0x0044, B:16:0x004f, B:18:0x005f, B:24:0x009e, B:19:0x007e, B:21:0x008b, B:22:0x008f, B:23:0x0093, B:25:0x00a2, B:26:0x00a8, B:27:0x00ac, B:28:0x00b0, B:29:0x00b7, B:30:0x00be, B:32:0x00c4, B:34:0x00d0, B:36:0x00d6, B:37:0x00db, B:38:0x00e2), top: B:43:0x0005 }] */
    @Override // z7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J(com.nst.iptvsmarterstvbox.model.callback.BillingIsPurchasedCallback r5) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.APPInPurchaseActivity.J(com.nst.iptvsmarterstvbox.model.callback.BillingIsPurchasedCallback):void");
    }

    @Override // z7.d
    public void L0(BillingLoginClientCallback billingLoginClientCallback) {
        Resources resources;
        int i9;
        String message;
        w.X();
        if (billingLoginClientCallback != null) {
            try {
                if (billingLoginClientCallback.getResult() == null || !billingLoginClientCallback.getResult().equals("success")) {
                    if (billingLoginClientCallback.getResult() == null || !billingLoginClientCallback.getResult().equals("error") || billingLoginClientCallback.getMessage() == null) {
                        resources = getResources();
                        i9 = j.f13244e7;
                    } else {
                        message = billingLoginClientCallback.getMessage();
                        H(message);
                    }
                } else if (billingLoginClientCallback.getSc() != null) {
                    if (!billingLoginClientCallback.getSc().equalsIgnoreCase(w.o0("Vu6HilnbLo63*KJHGFkugu345*&^klih*" + AbstractC1232b.f17695b)) || billingLoginClientCallback.getData() == null) {
                        resources = getResources();
                        i9 = j.f13244e7;
                    } else {
                        this.f28890R.O(this.f28893U, this.f28894V, billingLoginClientCallback.getData().getId().intValue());
                        if (billingLoginClientCallback.getMessage() == null || billingLoginClientCallback.getMessage().equals("Max Connection Reached")) {
                            this.f28890R.Q(Boolean.FALSE);
                            this.f28890R.T(Boolean.TRUE);
                        } else {
                            f();
                            String strO0 = w.o0(this.f28893U + "*Njh0&$@ZH098GP-Vu6HilnbLo63-" + AbstractC1232b.f17695b + "-");
                            this.f28890R.Q(Boolean.FALSE);
                            this.f28886N.e(this.f28893U, this.f28894V, this.f28888P, this.f28887O, strO0, billingLoginClientCallback.getData().getId().intValue(), "false", "");
                        }
                        H(getResources().getString(j.f13210b3));
                        x(false);
                    }
                } else {
                    resources = getResources();
                    i9 = j.f13244e7;
                }
                message = resources.getString(i9);
                H(message);
            } catch (Exception unused) {
            }
        }
        Log.e("honey", "loginClientResponse:");
    }

    @Override // z7.d
    public void N0(BillingUpdateDevicesCallback billingUpdateDevicesCallback) {
        Resources resources;
        int i9;
        String message;
        w.X();
        if (billingUpdateDevicesCallback != null) {
            try {
                if (billingUpdateDevicesCallback.getResult() != null && billingUpdateDevicesCallback.getResult().equals("success")) {
                    C2858a c2858a = this.f28890R;
                    Boolean bool = Boolean.FALSE;
                    c2858a.T(bool);
                    if (billingUpdateDevicesCallback.getSc() != null) {
                        if (billingUpdateDevicesCallback.getSc().equalsIgnoreCase(w.o0("Vu6HilnbLo63*KJHGFkugu345*&^klih*" + AbstractC1232b.f17695b))) {
                            if (this.f28890R.k() != null && this.f28890R.n() != null && this.f28890R.l() != 0 && !this.f28890R.k().equals("") && !this.f28890R.n().equals("")) {
                                f();
                                String strO0 = w.o0(this.f28890R.k() + "*Njh0&$@ZH098GP-Vu6HilnbLo63-" + AbstractC1232b.f17695b + "-");
                                this.f28890R.Q(bool);
                                this.f28886N.e(this.f28890R.k(), this.f28890R.n(), this.f28888P, this.f28887O, strO0, this.f28890R.l(), "false", "");
                            }
                            x(false);
                        } else {
                            resources = getResources();
                            i9 = j.f13244e7;
                        }
                    } else {
                        resources = getResources();
                        i9 = j.f13244e7;
                    }
                } else if (billingUpdateDevicesCallback.getResult() == null || !billingUpdateDevicesCallback.getResult().equals("error") || billingUpdateDevicesCallback.getMessage() == null) {
                    resources = getResources();
                    i9 = j.f13244e7;
                } else {
                    message = billingUpdateDevicesCallback.getMessage();
                    H(message);
                }
                message = resources.getString(i9);
                H(message);
            } catch (Exception unused) {
            }
        }
        Log.e("honey", "BillingUpdateDevicesCallback:");
    }

    @Override // z7.c
    public void a() {
        w.M0(this);
    }

    @Override // g1.InterfaceC1818l
    public void c(com.android.billingclient.api.a aVar, List list) {
        StringBuilder sb;
        String string;
        Log.e("honey", "onSkuDetailsResponse");
        int iB = aVar.b();
        String strA = aVar.a();
        switch (iB) {
            case -1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                this.f28885M = false;
                sb = new StringBuilder();
                break;
            case 0:
                this.f28885M = true;
                Log.i("honey", "onSkuDetailsResponse: " + iB + " " + strA);
                if (list == null || list.isEmpty()) {
                    string = "onSkuDetailsResponse: Found null or empty SkuDetails. Check to see if the SKUs you requested are correctly published in the Google Play Console.";
                    Log.e("honey", string);
                }
                SkuDetails skuDetails = (SkuDetails) list.get(0);
                this.f28905f0 = skuDetails;
                if (skuDetails != null) {
                    try {
                        this.f28897Y = skuDetails.a();
                        this.f28898Z = this.f28905f0.b();
                        TextView textView = this.f28876D;
                        if (textView != null) {
                            textView.setText("One-time payment " + this.f28897Y + " " + this.f28898Z);
                        }
                        TextView textView2 = this.f28878F;
                        if (textView2 != null) {
                            textView2.setText("One-time payment " + this.f28897Y + " " + this.f28898Z);
                        }
                        TextView textView3 = this.f28879G;
                        if (textView3 != null) {
                            textView3.setText("One-time payment " + this.f28897Y + " " + this.f28898Z);
                            return;
                        }
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                this.f28885M = false;
                sb = new StringBuilder();
                break;
            default:
                sb = new StringBuilder();
                break;
        }
        sb.append("onSkuDetailsResponse: ");
        sb.append(iB);
        sb.append(" ");
        sb.append(strA);
        string = sb.toString();
        Log.e("honey", string);
    }

    @Override // z7.c
    public void d(String str) {
        w.X();
        H(str);
    }

    @Override // g1.InterfaceC1816j
    public void e(com.android.billingclient.api.a aVar, List list) {
        if (aVar.b() == 0 && list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Purchase purchase = (Purchase) it.next();
                if (purchase.c() == 1) {
                    String strA = purchase.a();
                    if (purchase.f().contains("com.nst.smartersplayer.billing")) {
                        this.f28890R.Q(Boolean.FALSE);
                        if (this.f28890R.k() != null && this.f28890R.n() != null && this.f28890R.l() != 0 && !this.f28890R.k().equals("") && !this.f28890R.n().equals("")) {
                            f();
                            this.f28886N.c(this.f28890R.k(), this.f28890R.n(), this.f28888P, this.f28887O, w.o0(this.f28890R.k() + "*Njh0&$@ZH098GP-Vu6HilnbLo63-" + AbstractC1232b.f17695b + "-"), this.f28890R.l(), "true", strA);
                        }
                    }
                    Log.e("honey", "purchased");
                    if (!purchase.g()) {
                        this.f28903e0.a(C1807a.b().b(purchase.d()).a(), this.f28909h0);
                    }
                }
            }
        }
        Log.e("honey", "onPurchasesUpdated");
    }

    public void f() {
        int iNextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.f28889Q = iNextInt;
        AbstractC1232b.f17695b = String.valueOf(iNextInt);
    }

    @Override // z7.d
    public void g(BillingGetDevicesCallback billingGetDevicesCallback) {
        Resources resources;
        int i9;
        String message;
        w.X();
        if (billingGetDevicesCallback != null) {
            try {
                if (billingGetDevicesCallback.getResult() != null && billingGetDevicesCallback.getResult().equals("success")) {
                    if (billingGetDevicesCallback.getSc() != null) {
                        if (!billingGetDevicesCallback.getSc().equalsIgnoreCase(w.o0("Vu6HilnbLo63*KJHGFkugu345*&^klih*" + AbstractC1232b.f17695b))) {
                            resources = getResources();
                            i9 = j.f13244e7;
                        } else if (billingGetDevicesCallback.getData() == null || billingGetDevicesCallback.getData().getDevices() == null) {
                            message = "No Device Found";
                            H(message);
                        } else {
                            this.f28896X = "";
                            this.f28895W = "";
                            new g(this, billingGetDevicesCallback.getData().getDevices(), this.f28884L).show();
                        }
                    } else {
                        resources = getResources();
                        i9 = j.f13244e7;
                    }
                    message = resources.getString(i9);
                    H(message);
                } else if (billingGetDevicesCallback.getResult() == null || !billingGetDevicesCallback.getResult().equals("error") || billingGetDevicesCallback.getMessage() == null) {
                    resources = getResources();
                    i9 = j.f13244e7;
                    message = resources.getString(i9);
                    H(message);
                } else {
                    message = billingGetDevicesCallback.getMessage();
                    H(message);
                }
            } catch (Exception unused) {
            }
        }
        Log.e("honey", "BillingGetDevicesCallback:");
    }

    @Override // z7.d
    public void m0(BillingCheckGPACallback billingCheckGPACallback) {
        Resources resources;
        int i9;
        w.X();
        if (billingCheckGPACallback != null) {
            try {
                if (billingCheckGPACallback.getResult() != null && billingCheckGPACallback.getResult().equals("success")) {
                    if (billingCheckGPACallback.getSc() != null) {
                        if (!billingCheckGPACallback.getSc().equalsIgnoreCase(w.o0("Vu6HilnbLo63*KJHGFkugu345*&^klih*" + AbstractC1232b.f17695b)) || billingCheckGPACallback.getData() == null || billingCheckGPACallback.getData().getEmail() == null) {
                            resources = getResources();
                            i9 = j.f13244e7;
                        } else {
                            this.f28899a.setVisibility(8);
                            this.f28900c.setVisibility(8);
                            this.f28880H.setVisibility(8);
                            this.f28912k.setVisibility(0);
                        }
                    } else {
                        resources = getResources();
                        i9 = j.f13244e7;
                    }
                    H(resources.getString(i9));
                } else if (billingCheckGPACallback.getResult() == null || !billingCheckGPACallback.getResult().equals("error") || billingCheckGPACallback.getMessage() == null || !billingCheckGPACallback.getMessage().equals("Order ID Not Found")) {
                    resources = getResources();
                    i9 = j.f13244e7;
                    H(resources.getString(i9));
                } else {
                    this.f28899a.setVisibility(8);
                    (!this.f28885M ? this.f28880H : this.f28900c).setVisibility(0);
                    this.f28912k.setVisibility(8);
                    this.f28874B.setVisibility(0);
                    this.f28873A.setVisibility(8);
                }
            } catch (Exception unused) {
            }
        }
        Log.e("honey", "BillingClearDevicesCallback:");
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Dialog fVar;
        EditText editText;
        EditText editText2;
        if (view.getId() == a7.f.f12573x0) {
            this.f28899a.setVisibility(8);
            this.f28912k.setVisibility(0);
            this.f28900c.setVisibility(8);
            this.f28880H.setVisibility(8);
            return;
        }
        if (view.getId() != a7.f.da) {
            if (view.getId() != a7.f.f12441k0) {
                if (view.getId() == a7.f.aa || view.getId() == a7.f.ba || view.getId() == a7.f.ca) {
                    this.f28899a.setVisibility(8);
                    this.f28900c.setVisibility(8);
                    this.f28880H.setVisibility(8);
                    this.f28912k.setVisibility(0);
                    return;
                }
                if (view.getId() == a7.f.f12543u0) {
                    if (!y() || (editText2 = this.f28913l) == null || this.f28914m == null) {
                        return;
                    }
                    this.f28893U = editText2.getText().toString().trim();
                    this.f28894V = this.f28914m.getText().toString().trim();
                    f();
                    this.f28886N.g(this.f28893U, this.f28894V, this.f28888P, this.f28887O, w.o0(this.f28893U + "*Njh0&$@ZH098GP-Vu6HilnbLo63-" + AbstractC1232b.f17695b + "-"));
                    return;
                }
                if (view.getId() == a7.f.f12177J0) {
                    if (!z() || (editText = this.f28901d) == null || this.f28902e == null) {
                        return;
                    }
                    this.f28891S = editText.getText().toString().trim();
                    this.f28892T = this.f28902e.getText().toString().trim();
                    f();
                    this.f28886N.h(this.f28891S, this.f28892T, this.f28888P, this.f28887O, w.o0(this.f28891S + "*Njh0&$@ZH098GP-Vu6HilnbLo63-" + AbstractC1232b.f17695b + "-"));
                    return;
                }
                if (view.getId() == a7.f.Yj) {
                    fVar = new h(this);
                } else if (view.getId() != a7.f.f12141F4) {
                    if (view.getId() == a7.f.f12533t0) {
                        G();
                        return;
                    }
                    if (view.getId() == a7.f.f12553v0 || view.getId() == a7.f.f12563w0) {
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse("https://users.iptvsmarters.com/cart.php?a=add&pid=1&currency=2"));
                            startActivity(intent);
                            return;
                        } catch (Exception unused) {
                            fVar = new f(this);
                        }
                    } else {
                        if (view.getId() != a7.f.f12469m8) {
                            return;
                        }
                        try {
                            Intent intent2 = new Intent("android.intent.action.VIEW");
                            intent2.setData(Uri.parse("https://users.iptvsmarters.com/password/reset"));
                            startActivity(intent2);
                            return;
                        } catch (Exception unused2) {
                            fVar = new e(this);
                        }
                    }
                }
            }
            onBackPressed();
            return;
        }
        try {
            Intent intent3 = new Intent("android.intent.action.VIEW");
            intent3.setData(Uri.parse("https://users.iptvsmarters.com/cart.php?a=add&pid=1&currency=2"));
            startActivity(intent3);
            return;
        } catch (Exception unused3) {
            fVar = new f(this);
        }
        fVar.show();
    }

    public void onClickButton(View view) {
        if (!this.f28885M) {
            H("You can purchase it from your mobile and then logged in with that details here.");
        } else if (view.getId() == a7.f.Wc) {
            E();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f28884L = this;
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f28884L);
        this.f28890R = c2858a;
        String strA = c2858a.A();
        setContentView(strA.equals(AbstractC2237a.f44453K0) ? a7.g.f12816j : a7.g.f12810i);
        w.Y(this);
        this.f28899a = (LinearLayout) findViewById(a7.f.za);
        this.f28900c = (LinearLayout) findViewById(a7.f.fa);
        this.f28901d = (EditText) findViewById(a7.f.f12506q3);
        this.f28902e = (EditText) findViewById(a7.f.f12516r3);
        this.f28904f = (EditText) findViewById(a7.f.f12495p3);
        this.f28906g = (Button) findViewById(a7.f.f12177J0);
        this.f28908h = (LinearLayout) findViewById(a7.f.aa);
        this.f28910i = (LinearLayout) findViewById(a7.f.ba);
        this.f28911j = (LinearLayout) findViewById(a7.f.ca);
        this.f28912k = (LinearLayout) findViewById(a7.f.ea);
        this.f28913l = (EditText) findViewById(a7.f.f12475n3);
        this.f28914m = (EditText) findViewById(a7.f.f12485o3);
        this.f28915n = (Button) findViewById(a7.f.f12543u0);
        this.f28916o = (Button) findViewById(a7.f.f12573x0);
        this.f28917p = (Button) findViewById(a7.f.f12441k0);
        this.f28918q = (LinearLayout) findViewById(a7.f.da);
        this.f28919r = (Button) findViewById(a7.f.Wc);
        this.f28920s = (TextView) findViewById(a7.f.Yj);
        this.f28921t = (ImageView) findViewById(a7.f.f12141F4);
        this.f28922u = (TextView) findViewById(a7.f.Qi);
        this.f28923v = (RelativeLayout) findViewById(a7.f.te);
        this.f28924w = (TextView) findViewById(a7.f.Ch);
        this.f28925x = (LinearLayout) findViewById(a7.f.f12225N8);
        this.f28926y = (LinearLayout) findViewById(a7.f.f12479n7);
        this.f28927z = (LinearLayout) findViewById(a7.f.ta);
        this.f28873A = (LinearLayout) findViewById(a7.f.f12551u8);
        this.f28874B = (LinearLayout) findViewById(a7.f.f12541t8);
        this.f28875C = (Button) findViewById(a7.f.f12533t0);
        this.f28876D = (TextView) findViewById(a7.f.Tk);
        this.f28877E = (TextView) findViewById(a7.f.sc);
        this.f28878F = (TextView) findViewById(a7.f.Uk);
        this.f28879G = (TextView) findViewById(a7.f.Vk);
        this.f28880H = (LinearLayout) findViewById(a7.f.ga);
        this.f28881I = (Button) findViewById(a7.f.f12553v0);
        this.f28882J = (Button) findViewById(a7.f.f12563w0);
        this.f28883K = (LinearLayout) findViewById(a7.f.f12469m8);
        this.f28887O = w.I(this.f28884L);
        this.f28888P = w.E();
        try {
            this.f28907g0 = new a(Looper.getMainLooper());
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        if (strA.equals(AbstractC2237a.f44453K0)) {
            this.f28877E.setVisibility(8);
        }
        this.f28909h0 = new b();
        this.f28886N = new n7.b(this.f28884L, this);
        AbstractC1809c abstractC1809cA = AbstractC1809c.e(this.f28884L).b().d(this).a();
        this.f28903e0 = abstractC1809cA;
        abstractC1809cA.h(new c());
        x(false);
        C();
        D();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        AbstractC1809c abstractC1809c = this.f28903e0;
        if (abstractC1809c != null && abstractC1809c.c()) {
            this.f28903e0.b();
            this.f28903e0 = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0082 A[Catch: Exception -> 0x00d4, TryCatch #0 {Exception -> 0x00d4, blocks: (B:4:0x0005, B:6:0x000b, B:8:0x0017, B:10:0x001d, B:12:0x003e, B:14:0x0044, B:16:0x004f, B:18:0x005f, B:19:0x0082, B:20:0x008d, B:21:0x0093, B:22:0x0097, B:23:0x009b, B:24:0x00a2, B:25:0x00a9, B:27:0x00af, B:29:0x00bb, B:31:0x00c1, B:32:0x00c6, B:33:0x00cd), top: B:38:0x0005 }] */
    @Override // z7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q0(com.nst.iptvsmarterstvbox.model.callback.BillingAddOrderCallback r4) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.APPInPurchaseActivity.q0(com.nst.iptvsmarterstvbox.model.callback.BillingAddOrderCallback):void");
    }

    public final void x(boolean z9) {
        View view;
        LinearLayout linearLayout;
        TextView textView;
        Resources resources;
        int i9;
        if (this.f28890R.k() == null || this.f28890R.n() == null || this.f28890R.l() == 0 || this.f28890R.k().equals("") || this.f28890R.n().equals("")) {
            this.f28926y.setVisibility(8);
            this.f28925x.setVisibility(8);
            this.f28900c.setVisibility(8);
            this.f28880H.setVisibility(8);
            this.f28899a.setVisibility(0);
            this.f28927z.setVisibility(8);
            view = this.f28923v;
        } else {
            this.f28922u.setText(this.f28890R.k());
            this.f28923v.setVisibility(0);
            this.f28912k.setVisibility(8);
            this.f28900c.setVisibility(8);
            this.f28880H.setVisibility(8);
            this.f28899a.setVisibility(8);
            this.f28926y.setVisibility(8);
            if (this.f28890R.u().booleanValue()) {
                linearLayout = this.f28925x;
            } else {
                this.f28925x.setVisibility(8);
                if (this.f28890R.m().booleanValue()) {
                    this.f28927z.setVisibility(0);
                    if (z9) {
                        textView = this.f28924w;
                        resources = getResources();
                        i9 = j.f13150U7;
                    } else {
                        textView = this.f28924w;
                        resources = getResources();
                        i9 = j.f13141T7;
                    }
                    textView.setText(resources.getString(i9));
                    return;
                }
                linearLayout = this.f28926y;
            }
            linearLayout.setVisibility(0);
            view = this.f28927z;
        }
        view.setVisibility(8);
    }

    public final boolean y() {
        String str;
        EditText editText = this.f28913l;
        if (editText == null || this.f28914m == null) {
            return false;
        }
        this.f28893U = editText.getText().toString().trim();
        this.f28894V = this.f28914m.getText().toString().trim();
        if (this.f28893U.length() == 0) {
            str = "Please enter your email.";
        } else {
            if (this.f28894V.length() != 0) {
                return true;
            }
            str = "Please enter your password.";
        }
        H(str);
        return false;
    }

    public final boolean z() {
        String str;
        EditText editText = this.f28901d;
        if (editText == null || this.f28902e == null || this.f28904f == null) {
            return false;
        }
        this.f28891S = editText.getText().toString().trim();
        this.f28892T = this.f28902e.getText().toString().trim();
        String strTrim = this.f28904f.getText().toString().trim();
        if (this.f28891S.length() == 0) {
            str = "Please enter any email.";
        } else if (this.f28892T.length() == 0) {
            str = "Please enter any password.";
        } else if (strTrim.length() == 0) {
            str = "Please enter confirm password.";
        } else {
            if (this.f28892T.equals(strTrim)) {
                return true;
            }
            str = "Please make sure your passwords match.";
        }
        H(str);
        return false;
    }
}
