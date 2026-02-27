package com.nst.iptvsmarterstvbox.view.activity;

import P.AbstractC0980w;
import android.R;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.sbpfunction.singletonpushnotification.Listsingleton;
import com.squareup.picasso.t;
import java.util.ArrayList;
import java.util.List;
import m7.AbstractC2237a;
import m7.w;
import q7.C2638w;
import q7.e0;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class TVArchiveActivityNewFlow extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static ProgressBar f32736Z;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public LiveStreamDBHandler f32738B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ArrayList f32739C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ArrayList f32740D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ArrayList f32741E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ArrayList f32742F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ArrayList f32743G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ArrayList f32744H;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public SharedPreferences f32749M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public SharedPreferences.Editor f32750N;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public SearchView f32752P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Handler f32753Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public MenuItem f32754R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Menu f32755S;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public List f32758V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Boolean f32759W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Boolean f32760X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ImageView f32761Y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ProgressBar f32762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewPager f32763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Toolbar f32764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AppBarLayout f32765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ProgressBar f32766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecyclerView f32767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f32768j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f32769k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f32770l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f32771m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f32772n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f32773o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f32774p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Context f32775q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SharedPreferences f32776r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public GridLayoutManager f32777s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public e0 f32778t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f32779u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f32780v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f32781w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f32782x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f32783y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f32784z = 20;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ArrayList f32737A = new ArrayList();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f32745I = "";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public String f32746J = "";

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f32747K = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f32748L = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ArrayList f32751O = new ArrayList();

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public AsyncTask f32756T = null;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ArrayList f32757U = new ArrayList();

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Dialog f32785a;

        public a(Dialog dialog) {
            this.f32785a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f32785a.dismiss();
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Dialog f32787a;

        public b(Dialog dialog) {
            this.f32787a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f32787a.dismiss();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(TVArchiveActivityNewFlow.this.f32775q);
        }
    }

    public class d extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f32790a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f32791c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f32792d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f32793e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f32794f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public RadioGroup f32795g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Activity f32796h;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f32798a;

            public a(View view) {
                this.f32798a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f32798a;
                    if (view2 == null || view2.getTag() == null || !this.f32798a.getTag().equals("1")) {
                        View view3 = this.f32798a;
                        if (view3 == null || view3.getTag() == null || !this.f32798a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = d.this.f32794f;
                        }
                    } else {
                        linearLayout = d.this.f32793e;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f32798a;
                    if (view4 == null || view4.getTag() == null || !this.f32798a.getTag().equals("1")) {
                        View view5 = this.f32798a;
                        if (view5 == null || view5.getTag() == null || !this.f32798a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = d.this.f32794f;
                        }
                    } else {
                        linearLayout = d.this.f32793e;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Activity activity, Activity activity2) {
            super(activity);
            this.f32796h = activity2;
            this.f32790a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TVArchiveActivityNewFlow tVArchiveActivityNewFlow;
            int id = view.getId();
            if (id == a7.f.f12544u1) {
                try {
                    RadioButton radioButton = (RadioButton) findViewById(this.f32795g.getCheckedRadioButtonId());
                    if (radioButton.getText().toString().equals(this.f32796h.getResources().getString(a7.j.f13254f7))) {
                        TVArchiveActivityNewFlow.this.f32750N.putString("sort", "1");
                        tVArchiveActivityNewFlow = TVArchiveActivityNewFlow.this;
                    } else if (radioButton.getText().toString().equals(this.f32796h.getResources().getString(a7.j.f13304k7))) {
                        TVArchiveActivityNewFlow.this.f32750N.putString("sort", "2");
                        tVArchiveActivityNewFlow = TVArchiveActivityNewFlow.this;
                    } else {
                        TVArchiveActivityNewFlow.this.f32750N.putString("sort", "0");
                        tVArchiveActivityNewFlow = TVArchiveActivityNewFlow.this;
                    }
                    tVArchiveActivityNewFlow.f32750N.commit();
                    TVArchiveActivityNewFlow.this.f32756T = TVArchiveActivityNewFlow.this.new o().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
                    dismiss();
                } catch (Exception unused) {
                }
            } else if (id == a7.f.f12412h1) {
                dismiss();
            }
            dismiss();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(a7.g.f12916z3);
            this.f32791c = (TextView) findViewById(a7.f.f12544u1);
            this.f32792d = (TextView) findViewById(a7.f.f12412h1);
            this.f32792d = (TextView) findViewById(a7.f.f12412h1);
            this.f32793e = (LinearLayout) findViewById(a7.f.V8);
            this.f32794f = (LinearLayout) findViewById(a7.f.Ia);
            this.f32795g = (RadioGroup) findViewById(a7.f.Kd);
            RadioButton radioButton = (RadioButton) findViewById(a7.f.rd);
            RadioButton radioButton2 = (RadioButton) findViewById(a7.f.md);
            RadioButton radioButton3 = (RadioButton) findViewById(a7.f.fd);
            RadioButton radioButton4 = (RadioButton) findViewById(a7.f.zd);
            RadioButton radioButton5 = (RadioButton) findViewById(a7.f.gd);
            RadioButton radioButton6 = (RadioButton) findViewById(a7.f.hd);
            ((RadioButton) findViewById(a7.f.td)).setVisibility(8);
            radioButton5.setVisibility(8);
            radioButton6.setVisibility(8);
            radioButton2.setVisibility(8);
            radioButton3.setOnFocusChangeListener(TVArchiveActivityNewFlow.this.new n(radioButton3));
            radioButton4.setOnFocusChangeListener(TVArchiveActivityNewFlow.this.new n(radioButton4));
            String string = TVArchiveActivityNewFlow.this.f32749M.getString("sort", "");
            string.hashCode();
            if (string.equals("1")) {
                radioButton3.setChecked(true);
            } else if (string.equals("2")) {
                radioButton4.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
            this.f32791c.setOnClickListener(this);
            this.f32792d.setOnClickListener(this);
            TextView textView = this.f32791c;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f32792d;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    public class e implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f32800a;

        public e(View view) {
            this.f32800a = view;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (z9) {
                View view2 = this.f32800a;
                if (view2 == null || view2.getTag() == null) {
                    return;
                }
                this.f32800a.getTag().equals("iv_cross");
                return;
            }
            View view3 = this.f32800a;
            if (view3 == null || view3.getTag() == null || !this.f32800a.getTag().equals("iv_cross")) {
                return;
            }
            view.setBackground(TVArchiveActivityNewFlow.this.getResources().getDrawable(a7.e.f11933L));
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TVArchiveActivityNewFlow.this.onBackPressed();
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
            w.n0(TVArchiveActivityNewFlow.this.f32775q);
        }
    }

    public class i implements SearchView.m {
        public i() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextChange(String str) {
            TextView textView;
            AbstractC2237a.f44515k0 = str.length() > 0 ? Boolean.FALSE : Boolean.TRUE;
            TVArchiveActivityNewFlow.this.f32772n.setVisibility(8);
            TVArchiveActivityNewFlow tVArchiveActivityNewFlow = TVArchiveActivityNewFlow.this;
            if (tVArchiveActivityNewFlow.f32778t == null || (textView = tVArchiveActivityNewFlow.f32771m) == null || textView.getVisibility() == 0) {
                return false;
            }
            TVArchiveActivityNewFlow tVArchiveActivityNewFlow2 = TVArchiveActivityNewFlow.this;
            tVArchiveActivityNewFlow2.f32778t.A0(str, tVArchiveActivityNewFlow2.f32772n);
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
            w.m0(TVArchiveActivityNewFlow.this.f32775q);
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

    public class m implements DialogInterface.OnClickListener {
        public m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class n implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f32810a;

        public n(View view) {
            this.f32810a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f32810a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f32810a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f32810a, "scaleY", f9);
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

    public class o extends AsyncTask {
        public o() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(TVArchiveActivityNewFlow.this.E1());
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            TVArchiveActivityNewFlow.this.G1();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public TVArchiveActivityNewFlow() {
        Boolean bool = Boolean.FALSE;
        this.f32759W = bool;
        this.f32760X = bool;
    }

    private void A1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private void D1() {
        this.f32762d = (ProgressBar) findViewById(a7.f.ec);
        this.f32763e = (ViewPager) findViewById(a7.f.Om);
        this.f32764f = (Toolbar) findViewById(a7.f.kh);
        this.f32765g = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f32766h = (ProgressBar) findViewById(a7.f.oc);
        this.f32767i = (RecyclerView) findViewById(a7.f.ub);
        this.f32768j = (TextView) findViewById(a7.f.f12249Q2);
        this.f32769k = (FrameLayout) findViewById(a7.f.f12250Q3);
        this.f32770l = (ImageView) findViewById(a7.f.f12211M4);
        this.f32771m = (TextView) findViewById(a7.f.sk);
        this.f32772n = (TextView) findViewById(a7.f.wk);
        this.f32773o = (ImageView) findViewById(a7.f.Xa);
        this.f32761Y = (ImageView) findViewById(a7.f.f12141F4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean E1() {
        AsyncTask asyncTask;
        try {
            if (this.f32775q == null) {
                return true;
            }
            this.f32738B = new LiveStreamDBHandler(this.f32775q);
            this.f32739C = new ArrayList();
            this.f32740D = new ArrayList();
            this.f32741E = new ArrayList();
            this.f32742F = new ArrayList();
            this.f32743G = new ArrayList();
            this.f32744H = new ArrayList();
            this.f32758V = new ArrayList();
            this.f32743G = this.f32738B.getAllliveCategories();
            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
            liveStreamCategoryIdDBModel.setLiveStreamCategoryID("0");
            liveStreamCategoryIdDBModel.setLiveStreamCategoryName(getResources().getString(a7.j.f13426x));
            this.f32743G.add(0, liveStreamCategoryIdDBModel);
            this.f32742F = this.f32743G;
            if (!SharepreferenceDBHandler.getCurrentAPPType(this.f32775q).equals("m3u")) {
                ArrayList arrayList = this.f32742F;
                if (arrayList != null && arrayList.size() > 0) {
                    int i9 = 0;
                    for (int i10 = 0; i10 < this.f32742F.size() && ((asyncTask = this.f32756T) == null || !asyncTask.isCancelled()); i10++) {
                        if (((LiveStreamCategoryIdDBModel) this.f32742F.get(i10)).getLiveStreamCategoryID().equals("0") || ((LiveStreamCategoryIdDBModel) this.f32742F.get(i10)).getLiveStreamCategoryID().equals("-1")) {
                            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel2 = new LiveStreamCategoryIdDBModel();
                            liveStreamCategoryIdDBModel2.setLiveStreamCounter(0);
                            liveStreamCategoryIdDBModel2.setLiveStreamCategoryName(((LiveStreamCategoryIdDBModel) this.f32742F.get(i10)).getLiveStreamCategoryName());
                            liveStreamCategoryIdDBModel2.setLiveStreamCategoryID(((LiveStreamCategoryIdDBModel) this.f32742F.get(i10)).getLiveStreamCategoryID());
                            this.f32744H.add(i9, liveStreamCategoryIdDBModel2);
                        } else {
                            ArrayList<LiveStreamsDBModel> allLiveStreamsArchive = this.f32738B.getAllLiveStreamsArchive(((LiveStreamCategoryIdDBModel) this.f32742F.get(i10)).getLiveStreamCategoryID());
                            if (allLiveStreamsArchive != null && allLiveStreamsArchive.size() != 0) {
                                LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel3 = new LiveStreamCategoryIdDBModel();
                                liveStreamCategoryIdDBModel3.setLiveStreamCounter(allLiveStreamsArchive.size());
                                liveStreamCategoryIdDBModel3.setLiveStreamCategoryName(((LiveStreamCategoryIdDBModel) this.f32742F.get(i10)).getLiveStreamCategoryName());
                                liveStreamCategoryIdDBModel3.setLiveStreamCategoryID(((LiveStreamCategoryIdDBModel) this.f32742F.get(i10)).getLiveStreamCategoryID());
                                this.f32744H.add(i9, liveStreamCategoryIdDBModel3);
                            }
                        }
                        i9++;
                    }
                }
                ArrayList arrayList2 = this.f32744H;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    this.f32742F = this.f32744H;
                }
            }
            if (this.f32742F == null) {
                return true;
            }
            for (int i11 = 0; i11 < this.f32742F.size(); i11++) {
                this.f32758V.add(new C2638w(((LiveStreamCategoryIdDBModel) this.f32742F.get(i11)).getLiveStreamCategoryName(), ((LiveStreamCategoryIdDBModel) this.f32742F.get(i11)).getLiveStreamCategoryID(), ((LiveStreamCategoryIdDBModel) this.f32742F.get(i11)).getId(), ((LiveStreamCategoryIdDBModel) this.f32742F.get(i11)).getLiveStreamCounter(), ((LiveStreamCategoryIdDBModel) this.f32742F.get(i11)).getParentId()));
            }
            return true;
        } catch (NullPointerException | Exception unused) {
            return true;
        }
    }

    private void F1() {
        List listA = Listsingleton.b().a();
        Dialog dialog = new Dialog(this, a7.k.f13462g);
        dialog.requestWindowFeature(1);
        dialog.setContentView(a7.g.f12682N1);
        dialog.getWindow().setBackgroundDrawable(null);
        dialog.getWindow().setLayout(-1, -2);
        dialog.setCancelable(false);
        ImageView imageView = (ImageView) dialog.findViewById(a7.f.f12201L4);
        ImageView imageView2 = (ImageView) dialog.findViewById(a7.f.f12308W4);
        this.f32774p = (LinearLayout) dialog.findViewById(a7.f.f12114C7);
        imageView2.setOnClickListener(new a(dialog));
        this.f32774p.setOnClickListener(new b(dialog));
        imageView2.setOnFocusChangeListener(new w.k((View) imageView2, (Activity) this));
        imageView2.setOnFocusChangeListener(new e(imageView2));
        imageView2.setNextFocusUpId(a7.f.f12308W4);
        imageView2.setNextFocusDownId(a7.f.f12308W4);
        imageView2.setNextFocusRightId(a7.f.f12308W4);
        imageView2.setNextFocusLeftId(a7.f.f12308W4);
        imageView2.requestFocus();
        if (listA != null) {
            try {
                if (listA.size() > 0) {
                    if (listA.size() > AbstractC2237a.f44516k1) {
                        t.q(this.f32775q).l((String) listA.get(AbstractC2237a.f44516k1)).g(imageView);
                        AbstractC2237a.f44516k1++;
                    } else {
                        t.q(this.f32775q).l((String) listA.get(0)).g(imageView);
                        AbstractC2237a.f44516k1 = 1;
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        dialog.show();
        dialog.getWindow().setBackgroundDrawableResource(a7.c.f11875z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G1() {
        if (this.f32742F != null) {
            this.f32778t = new e0(this.f32758V, this.f32775q);
            this.f32777s = new C2858a(this.f32775q).A().equals(AbstractC2237a.f44453K0) ? new GridLayoutManager(this.f32775q, 2) : new GridLayoutManager(this.f32775q, 2);
            this.f32767i.setLayoutManager(this.f32777s);
            this.f32767i.setItemAnimator(new androidx.recyclerview.widget.c());
            this.f32767i.setAdapter(this.f32778t);
        }
        ProgressBar progressBar = this.f32762d;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    private void H1(Activity activity) {
        new d((TVArchiveActivityNewFlow) activity, activity).show();
    }

    public void B1() {
        if (Listsingleton.b().a() == null || Listsingleton.b().a().size() <= 0) {
            return;
        }
        AbstractC2237a.f44510i1 = true;
        F1();
    }

    public void C1() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
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
        this.f32767i.setClickable(true);
        e0 e0Var = this.f32778t;
        if (e0Var != null) {
            e0Var.J0(f32736Z);
            this.f32778t.w();
        }
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == a7.f.Bj) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        } else if (id == a7.f.f12211M4) {
            this.f32756T = new o().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f32775q = this;
        C1();
        super.onCreate(bundle);
        setContentView(a7.g.f12830l1);
        D1();
        AbstractC2237a.f44515k0 = Boolean.FALSE;
        AppBarLayout appBarLayout = this.f32765g;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(a7.e.f12034n));
        }
        SharedPreferences sharedPreferences = getSharedPreferences("sortcatch", 0);
        this.f32749M = sharedPreferences;
        this.f32750N = sharedPreferences.edit();
        if (this.f32749M.getString("sort", "").equals("")) {
            this.f32750N.putString("sort", "0");
            this.f32750N.apply();
        }
        A1();
        r1((Toolbar) findViewById(a7.f.kh));
        Handler handler = new Handler();
        this.f32753Q = handler;
        handler.removeCallbacksAndMessages(null);
        ProgressBar progressBar = this.f32762d;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        this.f32773o.setOnClickListener(new c());
        this.f32761Y.setOnClickListener(new f());
        this.f32756T = new o().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        this.f32769k.setVisibility(8);
        if (AbstractC2237a.f44498e1.equalsIgnoreCase("1")) {
            if (SharepreferenceDBHandler.getEventAdsView(this) < AbstractC2237a.f44501f1) {
                SharepreferenceDBHandler.setEventAdsView(SharepreferenceDBHandler.getEventAdsView(this) + 1, this);
            } else {
                SharepreferenceDBHandler.setEventAdsView(0, this);
                B1();
            }
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f32764f.x(a7.h.f12935r);
        this.f32755S = menu;
        this.f32754R = menu.getItem(2).getSubMenu().findItem(a7.f.f12239P2);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f32775q).equals("api")) {
            menu.getItem(2).getSubMenu().findItem(a7.f.gb).setVisible(false);
        }
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f32775q).equals("onestream_api")) {
            menu.getItem(2).getSubMenu().findItem(a7.f.gb).setVisible(false);
        }
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f32764f.getChildCount(); i9++) {
            if (this.f32764f.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f32764f.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        if (i9 != 82) {
            return super.onKeyUp(i9, keyEvent);
        }
        Menu menu = this.f32755S;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(a7.f.f12239P2, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f32754R = menuItem;
        this.f32764f.e();
        int itemId = menuItem.getItemId();
        if (itemId == a7.f.Gb) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == a7.f.Mb) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == a7.f.f12390f && (context = this.f32775q) != null) {
            new a.C0158a(context, a7.k.f13456a).setTitle(getResources().getString(a7.j.f13250f3)).f(getResources().getString(a7.j.f13240e3)).j(getResources().getString(a7.j.f13132S8), new h()).g(getResources().getString(a7.j.f13231d4), new g()).n();
        }
        if (itemId == a7.f.f12400g) {
            SearchView searchView = (SearchView) AbstractC0980w.b(menuItem);
            this.f32752P = searchView;
            searchView.setQueryHint(getResources().getString(a7.j.f13443y6));
            this.f32752P.setIconifiedByDefault(false);
            this.f32752P.setOnQueryTextListener(new i());
            return true;
        }
        if (itemId == a7.f.gb) {
            a.C0158a c0158a = new a.C0158a(this);
            c0158a.setTitle(this.f32775q.getResources().getString(a7.j.f13397u0));
            c0158a.f(this.f32775q.getResources().getString(a7.j.f13134T0));
            c0158a.d(a7.e.f12056s1);
            c0158a.j(this.f32775q.getResources().getString(a7.j.f13132S8), new j());
            c0158a.g(this.f32775q.getResources().getString(a7.j.f13231d4), new k());
            c0158a.n();
        }
        if (itemId == a7.f.ib) {
            a.C0158a c0158a2 = new a.C0158a(this);
            c0158a2.setTitle(this.f32775q.getResources().getString(a7.j.f13397u0));
            c0158a2.f(this.f32775q.getResources().getString(a7.j.f13134T0));
            c0158a2.d(a7.e.f12056s1);
            c0158a2.j(this.f32775q.getResources().getString(a7.j.f13132S8), new l());
            c0158a2.g(this.f32775q.getResources().getString(a7.j.f13231d4), new m());
            c0158a2.n();
        }
        if (itemId == a7.f.mb) {
            H1(this);
            b();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        C1();
        super.onResume();
        w.m(this.f32775q);
        w.z0(this.f32775q);
        getWindow().setFlags(1024, 1024);
        this.f32769k.setVisibility(8);
        e0 e0Var = this.f32778t;
        if (e0Var != null) {
            e0Var.J0(f32736Z);
            this.f32778t.w();
        }
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f32776r = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f32776r.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f32775q != null) {
            b();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        C1();
    }
}
