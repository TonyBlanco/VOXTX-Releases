package com.nst.iptvsmarterstvbox.view.activity;

import a7.k;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.miscelleneious.MyApplication;
import com.nst.iptvsmarterstvbox.model.FavouriteDBModel;
import com.nst.iptvsmarterstvbox.model.FavouriteM3UModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.VodAllCategoriesSingleton;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetAdCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetAllChannelsCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetGenresCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetSeriesCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetVODByCatCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetVodCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerLiveFavIdsCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerProfilesCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerSetLiveFavCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerTokenCallback;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.PasswordStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.RecentWatchDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.sbpfunction.singletonpushnotification.Listsingleton;
import com.squareup.picasso.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import m7.AbstractC2237a;
import m7.w;
import q7.C2635t;
import q7.Z;
import q7.l0;
import q7.m0;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class VodAllDataSingleActivity extends androidx.appcompat.app.b implements View.OnClickListener, z7.g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ArrayList f33455A;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public SharedPreferences f33458D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public SharedPreferences.Editor f33459E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Menu f33460F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public MenuItem f33461G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public SearchView f33462H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public n7.e f33466L;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public RelativeLayout f33468N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public RelativeLayout f33469O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ImageView f33470P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public RelativeLayout f33471Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public ImageView f33472R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public RecyclerView f33473S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public RecyclerView f33474T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public LinearLayout f33475U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public LinearLayout f33476V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f33477W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f33478X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public EditText f33479Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public LinearLayout f33480Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f33481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Animation f33482e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Toolbar f33483e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Animation f33484f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public AppBarLayout f33485f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Animation f33486g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ImageView f33487g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Animation f33488h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ImageView f33489h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Animation f33490i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public RelativeLayout f33491i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GridLayoutManager f33492j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public ImageView f33493j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayoutManager f33494k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public NestedScrollView f33495k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public m0 f33496l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l0 f33498m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RecentWatchDBHandler f33500n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f33502o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f33504p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LiveStreamDBHandler f33506q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f33508r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Handler f33509r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f33510s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Runnable f33511s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f33512t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public DatabaseHandler f33518w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f33519x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f33520y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ArrayList f33521z;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f33514u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f33516v = new ArrayList();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ArrayList f33456B = new ArrayList();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ArrayList f33457C = new ArrayList();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f33463I = "0";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public String f33464J = "0";

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f33465K = -1;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f33467M = true;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public String f33497l0 = "";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public String f33499m0 = "";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f33501n0 = 1;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f33503o0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f33505p0 = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f33507q0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f33513t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f33515u0 = false;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f33517v0 = 0;

    public class a extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f33522a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f33523c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f33524d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f33525e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f33526f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public LinearLayout f33527g;

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity$a$a, reason: collision with other inner class name */
        public class RunnableC0280a implements Runnable {
            public RunnableC0280a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                VodAllDataSingleActivity.this.v2();
            }
        }

        public class b implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f33530a;

            public b(View view) {
                this.f33530a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f33530a;
                    if (view2 == null || view2.getTag() == null || !this.f33530a.getTag().equals("1")) {
                        View view3 = this.f33530a;
                        if (view3 == null || view3.getTag() == null || !this.f33530a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = a.this.f33527g;
                        }
                    } else {
                        linearLayout = a.this.f33526f;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f33530a;
                    if (view4 == null || view4.getTag() == null || !this.f33530a.getTag().equals("1")) {
                        View view5 = this.f33530a;
                        if (view5 == null || view5.getTag() == null || !this.f33530a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = a.this.f33527g;
                        }
                    } else {
                        linearLayout = a.this.f33526f;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        public a(Activity activity) {
            super(activity);
            this.f33522a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id == a7.f.f12544u1) {
                try {
                    VodAllDataSingleActivity.this.f33500n.updateAllRecordsRecentWatchDB();
                    VodAllDataSingleActivity.this.A2();
                    new Handler().postDelayed(new RunnableC0280a(), 100L);
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
            setContentView(new C2858a(VodAllDataSingleActivity.this.f33481d).A().equals(AbstractC2237a.f44453K0) ? a7.g.f12742X1 : a7.g.f12736W1);
            this.f33523c = (TextView) findViewById(a7.f.f12544u1);
            this.f33524d = (TextView) findViewById(a7.f.f12412h1);
            this.f33526f = (LinearLayout) findViewById(a7.f.V8);
            this.f33527g = (LinearLayout) findViewById(a7.f.Ia);
            TextView textView = (TextView) findViewById(a7.f.um);
            this.f33525e = textView;
            textView.setText(VodAllDataSingleActivity.this.getResources().getString(a7.j.W8));
            this.f33523c.setOnClickListener(this);
            this.f33524d.setOnClickListener(this);
            TextView textView2 = this.f33523c;
            textView2.setOnFocusChangeListener(new b(textView2));
            TextView textView3 = this.f33524d;
            textView3.setOnFocusChangeListener(new b(textView3));
        }
    }

    public class b implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f33532a;

        public b(View view) {
            this.f33532a = view;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (z9) {
                View view2 = this.f33532a;
                if (view2 == null || view2.getTag() == null) {
                    return;
                }
                this.f33532a.getTag().equals("iv_cross");
                return;
            }
            View view3 = this.f33532a;
            if (view3 == null || view3.getTag() == null || !this.f33532a.getTag().equals("iv_cross")) {
                return;
            }
            view.setBackground(VodAllDataSingleActivity.this.getResources().getDrawable(a7.e.f11933L));
        }
    }

    public class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
            if (VodAllDataSingleActivity.this.f33498m != null) {
                VodAllDataSingleActivity.this.f33498m.getFilter().filter(charSequence.toString());
            }
        }
    }

    public class d extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f33535a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f33536c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f33537d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f33538e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f33539f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public RadioGroup f33540g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Activity f33541h;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f33543a;

            public a(View view) {
                this.f33543a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f33543a;
                    if (view2 == null || view2.getTag() == null || !this.f33543a.getTag().equals("1")) {
                        View view3 = this.f33543a;
                        if (view3 == null || view3.getTag() == null || !this.f33543a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = d.this.f33539f;
                        }
                    } else {
                        linearLayout = d.this.f33538e;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f33543a;
                    if (view4 == null || view4.getTag() == null || !this.f33543a.getTag().equals("1")) {
                        View view5 = this.f33543a;
                        if (view5 == null || view5.getTag() == null || !this.f33543a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = d.this.f33539f;
                        }
                    } else {
                        linearLayout = d.this.f33538e;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Activity activity, Activity activity2) {
            super(activity);
            this.f33541h = activity2;
            this.f33535a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            Activity activity;
            int id = view.getId();
            if (id == a7.f.f12544u1) {
                try {
                    String string = ((RadioButton) findViewById(this.f33540g.getCheckedRadioButtonId())).getText().toString();
                    if (string.equals(this.f33541h.getResources().getString(a7.j.f13284i7))) {
                        str = "1";
                        activity = this.f33541h;
                    } else if (string.equals(this.f33541h.getResources().getString(a7.j.f13254f7))) {
                        str = "2";
                        activity = this.f33541h;
                    } else if (string.equals(this.f33541h.getResources().getString(a7.j.f13304k7))) {
                        str = "3";
                        activity = this.f33541h;
                    } else if (string.equals(this.f33541h.getResources().getString(a7.j.f13294j7))) {
                        str = "6";
                        activity = this.f33541h;
                    } else {
                        str = "0";
                        activity = this.f33541h;
                    }
                    SharepreferenceDBHandler.setVODSubCatSort(str, activity);
                    VodAllDataSingleActivity vodAllDataSingleActivity = VodAllDataSingleActivity.this;
                    vodAllDataSingleActivity.t2(vodAllDataSingleActivity.f33463I, VodAllDataSingleActivity.this.f33464J);
                    dismiss();
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            } else if (id == a7.f.f12412h1) {
                dismiss();
            }
            dismiss();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            RadioButton radioButton;
            RadioButton radioButton2;
            RadioButton radioButton3;
            RadioButton radioButton4;
            RadioButton radioButton5;
            super.onCreate(bundle);
            setContentView(new C2858a(this.f33541h).A().equals(AbstractC2237a.f44453K0) ? a7.g.f12606A3 : a7.g.f12916z3);
            this.f33536c = (TextView) findViewById(a7.f.f12544u1);
            this.f33537d = (TextView) findViewById(a7.f.f12412h1);
            this.f33537d = (TextView) findViewById(a7.f.f12412h1);
            this.f33538e = (LinearLayout) findViewById(a7.f.V8);
            this.f33539f = (LinearLayout) findViewById(a7.f.Ia);
            this.f33540g = (RadioGroup) findViewById(a7.f.Kd);
            radioButton = (RadioButton) findViewById(a7.f.rd);
            radioButton2 = (RadioButton) findViewById(a7.f.md);
            radioButton3 = (RadioButton) findViewById(a7.f.fd);
            radioButton4 = (RadioButton) findViewById(a7.f.zd);
            RadioButton radioButton6 = (RadioButton) findViewById(a7.f.gd);
            RadioButton radioButton7 = (RadioButton) findViewById(a7.f.hd);
            radioButton5 = (RadioButton) findViewById(a7.f.td);
            radioButton5.setVisibility(8);
            radioButton6.setVisibility(8);
            radioButton7.setVisibility(8);
            String vODSubCatSort = SharepreferenceDBHandler.getVODSubCatSort(this.f33541h);
            vODSubCatSort.hashCode();
            switch (vODSubCatSort) {
                case "1":
                    radioButton2.setChecked(true);
                    break;
                case "2":
                    radioButton3.setChecked(true);
                    break;
                case "3":
                    radioButton4.setChecked(true);
                    break;
                case "6":
                    radioButton5.setChecked(true);
                    break;
                default:
                    radioButton.setChecked(true);
                    break;
            }
            this.f33536c.setOnClickListener(this);
            this.f33537d.setOnClickListener(this);
            TextView textView = this.f33536c;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f33537d;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    public class e implements Comparator {
        public e() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(LiveStreamsDBModel liveStreamsDBModel, LiveStreamsDBModel liveStreamsDBModel2) {
            float f9;
            float f10 = 0.0f;
            try {
                f9 = Float.parseFloat(liveStreamsDBModel2.getRatingFromTen());
            } catch (Exception unused) {
                f9 = 0.0f;
            }
            try {
                f10 = Float.parseFloat(liveStreamsDBModel.getRatingFromTen());
            } catch (Exception unused2) {
            }
            return Float.compare(f9, f10);
        }
    }

    public class f implements NestedScrollView.c {
        public f() {
        }

        @Override // androidx.core.widget.NestedScrollView.c
        public void a(NestedScrollView nestedScrollView, int i9, int i10, int i11, int i12) {
            String string;
            String str;
            String str2;
            String str3 = "";
            StringBuilder sb = new StringBuilder();
            sb.append("scrollY :");
            sb.append(i10);
            sb.append(" a:");
            int length = 0;
            sb.append(nestedScrollView.getChildAt(0).getMeasuredHeight());
            sb.append(" b:");
            sb.append(nestedScrollView.getMeasuredHeight());
            Log.e("honey", sb.toString());
            if (i10 == nestedScrollView.getChildAt(0).getMeasuredHeight() - nestedScrollView.getMeasuredHeight()) {
                VodAllDataSingleActivity.this.f33501n0++;
                Log.e("honey", "onScrollChange page:" + VodAllDataSingleActivity.this.f33501n0 + " Total:" + VodAllDataSingleActivity.this.f33503o0);
                VodAllDataSingleActivity vodAllDataSingleActivity = VodAllDataSingleActivity.this;
                if (vodAllDataSingleActivity.f33501n0 <= vodAllDataSingleActivity.f33503o0) {
                    vodAllDataSingleActivity.f33467M = false;
                    w.M0(VodAllDataSingleActivity.this);
                    if (VodAllDataSingleActivity.this.f33462H != null) {
                        string = VodAllDataSingleActivity.this.f33462H.getQuery().toString();
                        try {
                            length = VodAllDataSingleActivity.this.f33462H.getQuery().toString().length();
                        } catch (Exception unused) {
                        }
                    } else {
                        string = "";
                    }
                    String str4 = string;
                    if (length < 3) {
                        if (VodAllDataSingleActivity.this.f33463I.equals("-1")) {
                            VodAllDataSingleActivity.this.N2();
                            return;
                        } else {
                            VodAllDataSingleActivity.this.M2();
                            return;
                        }
                    }
                    if (VodAllDataSingleActivity.this.f33463I.equals("0")) {
                        str2 = str3;
                        str = "*";
                    } else if (VodAllDataSingleActivity.this.f33463I.equals("-1")) {
                        str3 = "1";
                        str2 = str3;
                        str = "*";
                    } else {
                        str = VodAllDataSingleActivity.this.f33463I;
                        str2 = "";
                    }
                    try {
                        n7.e eVar = VodAllDataSingleActivity.this.f33466L;
                        VodAllDataSingleActivity vodAllDataSingleActivity2 = VodAllDataSingleActivity.this;
                        eVar.u(vodAllDataSingleActivity2.f33497l0, vodAllDataSingleActivity2.f33499m0, str, str4, str2, String.valueOf(vodAllDataSingleActivity2.f33501n0));
                    } catch (Exception unused2) {
                    }
                }
            }
        }
    }

    public class g implements SearchView.m {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f33548a;

            public a(String str) {
                this.f33548a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = "*";
                String str2 = "";
                if (!VodAllDataSingleActivity.this.f33463I.equals("0")) {
                    if (VodAllDataSingleActivity.this.f33463I.equals("-1")) {
                        str2 = "1";
                    } else {
                        str = VodAllDataSingleActivity.this.f33463I;
                    }
                }
                String str3 = str;
                String str4 = str2;
                VodAllDataSingleActivity.this.f33521z = new ArrayList();
                VodAllDataSingleActivity vodAllDataSingleActivity = VodAllDataSingleActivity.this;
                vodAllDataSingleActivity.f33465K = 0;
                vodAllDataSingleActivity.f33467M = true;
                VodAllDataSingleActivity vodAllDataSingleActivity2 = VodAllDataSingleActivity.this;
                vodAllDataSingleActivity2.f33501n0 = 1;
                vodAllDataSingleActivity2.I2();
                VodAllDataSingleActivity.this.j2();
                VodAllDataSingleActivity.this.f2();
                try {
                    Log.e("honey", "request:" + this.f33548a);
                    n7.e eVar = VodAllDataSingleActivity.this.f33466L;
                    VodAllDataSingleActivity vodAllDataSingleActivity3 = VodAllDataSingleActivity.this;
                    eVar.u(vodAllDataSingleActivity3.f33497l0, vodAllDataSingleActivity3.f33499m0, str3, this.f33548a, str4, String.valueOf(vodAllDataSingleActivity3.f33501n0));
                } catch (Exception unused) {
                }
            }
        }

        public g() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextChange(String str) {
            if (VodAllDataSingleActivity.this.f33496l == null) {
                return false;
            }
            if (!SharepreferenceDBHandler.getCurrentAPPType(VodAllDataSingleActivity.this.f33481d).equals("stalker_api")) {
                VodAllDataSingleActivity.this.f33496l.getFilter().filter(str);
                return false;
            }
            try {
                if (str.length() >= 3) {
                    Handler handler = VodAllDataSingleActivity.this.f33509r0;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                    VodAllDataSingleActivity.this.f33511s0 = new a(str);
                    VodAllDataSingleActivity vodAllDataSingleActivity = VodAllDataSingleActivity.this;
                    vodAllDataSingleActivity.f33509r0.postDelayed(vodAllDataSingleActivity.f33511s0, 1000L);
                    return false;
                }
                Handler handler2 = VodAllDataSingleActivity.this.f33509r0;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                }
                if (VodAllDataSingleActivity.this.f33521z == null || VodAllDataSingleActivity.this.f33455A == null || VodAllDataSingleActivity.this.f33455A.size() <= 0) {
                    return false;
                }
                VodAllDataSingleActivity vodAllDataSingleActivity2 = VodAllDataSingleActivity.this;
                vodAllDataSingleActivity2.f33465K = -1;
                vodAllDataSingleActivity2.f33467M = true;
                VodAllDataSingleActivity vodAllDataSingleActivity3 = VodAllDataSingleActivity.this;
                vodAllDataSingleActivity3.f33501n0 = 1;
                vodAllDataSingleActivity3.f33521z.clear();
                VodAllDataSingleActivity.this.f33521z.addAll(VodAllDataSingleActivity.this.f33455A);
                VodAllDataSingleActivity vodAllDataSingleActivity4 = VodAllDataSingleActivity.this;
                vodAllDataSingleActivity4.f33503o0 = vodAllDataSingleActivity4.f33507q0;
                vodAllDataSingleActivity4.w1(true);
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class h extends AsyncTask {
        public h() {
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
                r1 = r7[r0]     // Catch: java.lang.Exception -> L60
                int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L60
                r3 = 3
                r4 = 2
                r5 = 1
                switch(r2) {
                    case -74801864: goto L2b;
                    case -74797390: goto L22;
                    case 1976766565: goto L18;
                    case 1997009972: goto Le;
                    default: goto Ld;
                }     // Catch: java.lang.Exception -> L60
            Ld:
                goto L35
            Le:
                java.lang.String r0 = "get_recent_watch"
                boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L60
                if (r0 == 0) goto L35
                r0 = 2
                goto L36
            L18:
                java.lang.String r0 = "get_recent_added"
                boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L60
                if (r0 == 0) goto L35
                r0 = 3
                goto L36
            L22:
                java.lang.String r2 = "get_fav"
                boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L60
                if (r1 == 0) goto L35
                goto L36
            L2b:
                java.lang.String r0 = "get_all"
                boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L60
                if (r0 == 0) goto L35
                r0 = 1
                goto L36
            L35:
                r0 = -1
            L36:
                if (r0 == 0) goto L59
                if (r0 == r5) goto L50
                if (r0 == r4) goto L49
                if (r0 == r3) goto L40
                r7 = 0
                return r7
            L40:
                com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity r0 = com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity.this     // Catch: java.lang.Exception -> L60
                r7 = r7[r5]     // Catch: java.lang.Exception -> L60
                java.lang.String r7 = r0.c2(r7)     // Catch: java.lang.Exception -> L60
                return r7
            L49:
                com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity r7 = com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity.this     // Catch: java.lang.Exception -> L60
                java.lang.String r7 = com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity.z1(r7)     // Catch: java.lang.Exception -> L60
                return r7
            L50:
                com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity r0 = com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity.this     // Catch: java.lang.Exception -> L60
                r7 = r7[r5]     // Catch: java.lang.Exception -> L60
                java.lang.String r7 = r0.X1(r7)     // Catch: java.lang.Exception -> L60
                return r7
            L59:
                com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity r7 = com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity.this     // Catch: java.lang.Exception -> L60
                java.lang.String r7 = r7.Z1()     // Catch: java.lang.Exception -> L60
                return r7
            L60:
                java.lang.String r7 = "error"
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity.h.doInBackground(java.lang.String[]):java.lang.String");
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            VodAllDataSingleActivity.this.g2();
            str.hashCode();
            switch (str) {
                case "get_fav_local":
                    VodAllDataSingleActivity.this.U1();
                    break;
                case "get_all":
                    VodAllDataSingleActivity.this.w1(false);
                    break;
                case "get_fav_real_time":
                    VodAllDataSingleActivity.this.V1();
                    break;
                case "get_recent_watch":
                    VodAllDataSingleActivity.this.x1();
                    break;
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            VodAllDataSingleActivity.this.I2();
            VodAllDataSingleActivity.this.j2();
            VodAllDataSingleActivity.this.f2();
        }
    }

    public class i implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f33551a;

        public i(View view) {
            this.f33551a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f33551a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f33551a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f33551a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            Drawable drawable;
            Resources resources;
            int i9;
            if (!z9) {
                if (z9) {
                    return;
                }
                View view2 = this.f33551a;
                if (view2 == null || view2.getTag() == null || !this.f33551a.getTag().equals("1")) {
                    View view3 = this.f33551a;
                    if (view3 == null || view3.getTag() == null || !this.f33551a.getTag().equals("2")) {
                        View view4 = this.f33551a;
                        if (view4 == null || view4.getTag() == null || !this.f33551a.getTag().equals("3")) {
                            b(1.0f);
                            c(1.0f);
                            a(z9);
                            return;
                        }
                    } else {
                        drawable = VodAllDataSingleActivity.this.getResources().getDrawable(a7.c.f11858i);
                    }
                }
                view.setBackgroundResource(0);
                return;
            }
            View view5 = this.f33551a;
            if (view5 == null || view5.getTag() == null || !this.f33551a.getTag().equals("1")) {
                View view6 = this.f33551a;
                if (view6 == null || view6.getTag() == null || !this.f33551a.getTag().equals("2")) {
                    View view7 = this.f33551a;
                    if (view7 == null || view7.getTag() == null || !this.f33551a.getTag().equals("3")) {
                        b(1.15f);
                        c(1.15f);
                        return;
                    }
                    resources = VodAllDataSingleActivity.this.getResources();
                    i9 = a7.e.f11946O0;
                    drawable = F.h.f(resources, i9, VodAllDataSingleActivity.this.getTheme());
                } else {
                    resources = VodAllDataSingleActivity.this.getResources();
                    i9 = a7.c.f11868s;
                    drawable = F.h.f(resources, i9, VodAllDataSingleActivity.this.getTheme());
                }
            } else {
                resources = VodAllDataSingleActivity.this.getResources();
                i9 = a7.e.f11946O0;
                drawable = F.h.f(resources, i9, VodAllDataSingleActivity.this.getTheme());
            }
            view.setBackground(drawable);
        }
    }

    public class j extends AsyncTask {
        public j() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return VodAllDataSingleActivity.this.P2();
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            VodAllDataSingleActivity.this.F2();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    private void B2(String str) {
        l0 l0Var = this.f33498m;
        if (l0Var != null) {
            l0Var.z0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r0.size() >= 3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        r3 = ((com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel) r5.f33510s.get(2)).getLiveStreamCategoryID();
        r0 = r5.f33510s.get(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r0.size() >= 3) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void F2() {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.f33510s
            if (r0 == 0) goto Lc2
            int r0 = r0.size()
            if (r0 <= 0) goto Lc2
            java.util.ArrayList r0 = r5.f33512t
            if (r0 == 0) goto L11
            r0.clear()
        L11:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.f33512t = r0
            java.util.ArrayList r1 = r5.f33510s
            r0.addAll(r1)
            android.content.Context r0 = r5.f33481d
            java.lang.String r0 = com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler.getCurrentAPPType(r0)
            java.lang.String r1 = "m3u"
            boolean r0 = r0.equals(r1)
            r1 = 3
            r2 = 2
            java.lang.String r3 = "0"
            if (r0 == 0) goto L62
            java.util.ArrayList r0 = r5.f33510s
            if (r0 == 0) goto L55
            int r0 = r0.size()
            if (r0 < r1) goto L55
        L39:
            java.util.ArrayList r0 = r5.f33510s
            java.lang.Object r0 = r0.get(r2)
            com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel r0 = (com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel) r0
            java.lang.String r3 = r0.getLiveStreamCategoryID()
            java.util.ArrayList r0 = r5.f33510s
            java.lang.Object r0 = r0.get(r2)
        L4b:
            com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel r0 = (com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel) r0
            java.lang.String r0 = r0.getLiveStreamCategoryName()
        L51:
            r5.t2(r3, r0)
            goto L9a
        L55:
            android.content.Context r0 = r5.f33481d
            android.content.res.Resources r0 = r0.getResources()
            int r1 = a7.j.f13426x
            java.lang.String r0 = r0.getString(r1)
            goto L51
        L62:
            android.content.Context r0 = r5.f33481d
            java.lang.String r0 = com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler.getCurrentAPPType(r0)
            java.lang.String r4 = "stalker_api"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L7b
            java.util.ArrayList r0 = r5.f33510s
            if (r0 == 0) goto L55
            int r0 = r0.size()
            if (r0 < r1) goto L55
            goto L39
        L7b:
            java.util.ArrayList r0 = r5.f33510s
            if (r0 == 0) goto L55
            int r0 = r0.size()
            r1 = 5
            if (r0 < r1) goto L55
            java.util.ArrayList r0 = r5.f33510s
            r1 = 4
            java.lang.Object r0 = r0.get(r1)
            com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel r0 = (com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel) r0
            java.lang.String r3 = r0.getLiveStreamCategoryID()
            java.util.ArrayList r0 = r5.f33510s
            java.lang.Object r0 = r0.get(r1)
            goto L4b
        L9a:
            java.util.ArrayList r0 = r5.f33512t
            if (r0 == 0) goto Lad
            int r0 = r0.size()
            if (r0 <= 0) goto Lad
            com.nst.iptvsmarterstvbox.model.VodAllCategoriesSingleton r0 = com.nst.iptvsmarterstvbox.model.VodAllCategoriesSingleton.getInstance()
            java.util.ArrayList r1 = r5.f33512t
            r0.setVodCategoriesList(r1)
        Lad:
            q7.l0 r0 = new q7.l0
            android.content.Context r1 = r5.f33481d
            r0.<init>(r1, r3)
            r5.f33498m = r0
            androidx.recyclerview.widget.RecyclerView r1 = r5.f33473S
            r1.setAdapter(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r5.f33473S
            androidx.recyclerview.widget.LinearLayoutManager r1 = r5.f33494k
            r0.setLayoutManager(r1)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity.F2():void");
    }

    private void G2() {
        try {
            new a((VodAllDataSingleActivity) this.f33481d).show();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I2() {
        LinearLayout linearLayout = this.f33476V;
        if (linearLayout == null || linearLayout.getVisibility() != 8) {
            return;
        }
        this.f33476V.setVisibility(0);
    }

    private void J2() {
        if (this.f33468N.getVisibility() == 8) {
            this.f33470P.setVisibility(8);
            if (!new C2858a(this.f33481d).A().equals(AbstractC2237a.f44453K0)) {
                this.f33493j0.setVisibility(8);
            }
            this.f33472R.startAnimation(this.f33490i);
            this.f33472R.setVisibility(0);
            this.f33472R.requestFocus();
            this.f33468N.startAnimation(this.f33482e);
            this.f33468N.setVisibility(0);
            this.f33469O.startAnimation(this.f33486g);
            this.f33469O.setVisibility(0);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f33481d, 5);
            this.f33492j = gridLayoutManager;
            this.f33474T.setLayoutManager(gridLayoutManager);
            if (this.f33496l != null) {
                this.f33474T.m1(this.f33465K);
                this.f33465K = -1;
            }
        }
    }

    private void K2(Activity activity) {
        try {
            new d(this, activity).show();
        } catch (Exception unused) {
        }
    }

    private void O2() {
        this.f33482e = AnimationUtils.loadAnimation(this.f33481d, a7.b.f11824b);
        this.f33484f = AnimationUtils.loadAnimation(this.f33481d, a7.b.f11825c);
        this.f33486g = AnimationUtils.loadAnimation(this.f33481d, a7.b.f11829g);
        this.f33488h = AnimationUtils.loadAnimation(this.f33481d, a7.b.f11827e);
        this.f33490i = AnimationUtils.loadAnimation(this.f33481d, a7.b.f11823a);
    }

    private void R1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private void T1() {
        EditText editText = this.f33479Y;
        if (editText != null) {
            editText.setText("");
            this.f33479Y.clearFocus();
        }
    }

    private void W1() {
        ImageView imageView = this.f33472R;
        imageView.setOnFocusChangeListener(new i(imageView));
        RelativeLayout relativeLayout = this.f33471Q;
        relativeLayout.setOnFocusChangeListener(new i(relativeLayout));
        ImageView imageView2 = this.f33470P;
        imageView2.setOnFocusChangeListener(new i(imageView2));
    }

    private ArrayList a2() {
        ArrayList<PasswordStatusDBModel> allPasswordStatus = this.f33506q.getAllPasswordStatus(SharepreferenceDBHandler.getUserID(this.f33481d));
        this.f33508r = allPasswordStatus;
        if (allPasswordStatus != null) {
            for (PasswordStatusDBModel passwordStatusDBModel : allPasswordStatus) {
                if (passwordStatusDBModel.getPasswordStatus().equals("1")) {
                    this.f33516v.add(passwordStatusDBModel.getPasswordStatusCategoryId());
                }
            }
        }
        return this.f33516v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b2() {
        this.f33516v = new ArrayList();
        new ArrayList();
        this.f33457C = new ArrayList();
        ArrayList<LiveStreamsDBModel> allVodContiueWatching = this.f33500n.getAllVodContiueWatching("getalldata", "1");
        if (this.f33506q.getParentalStatusCount(SharepreferenceDBHandler.getUserID(this.f33481d)) <= 0) {
            this.f33457C = allVodContiueWatching;
            return "get_recent_watch";
        }
        this.f33516v = a2();
        for (LiveStreamsDBModel liveStreamsDBModel : allVodContiueWatching) {
            Iterator it = this.f33516v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.f33457C.add(liveStreamsDBModel);
                    break;
                }
                String str = (String) it.next();
                if (liveStreamsDBModel.getCategoryId() == null || !liveStreamsDBModel.getCategoryId().equals(str)) {
                }
            }
        }
        return "get_recent_watch";
    }

    public static void d2(Activity activity) {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus == null) {
                currentFocus = new View(activity);
            }
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        } catch (Exception unused) {
        }
    }

    private void h2() {
        if (this.f33468N.getVisibility() == 0) {
            d2(this);
            this.f33469O.startAnimation(this.f33488h);
            this.f33469O.setVisibility(0);
            this.f33468N.startAnimation(this.f33484f);
            this.f33468N.setVisibility(8);
            this.f33470P.startAnimation(this.f33490i);
            this.f33470P.setVisibility(0);
            if (!new C2858a(this.f33481d).A().equals(AbstractC2237a.f44453K0)) {
                this.f33493j0.setVisibility(0);
            }
            this.f33470P.requestFocus();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f33481d, 7);
            this.f33492j = gridLayoutManager;
            this.f33474T.setLayoutManager(gridLayoutManager);
        }
    }

    private void k2() {
        this.f33468N = (RelativeLayout) findViewById(a7.f.ye);
        this.f33469O = (RelativeLayout) findViewById(a7.f.hf);
        this.f33470P = (ImageView) findViewById(a7.f.f12456l5);
        this.f33471Q = (RelativeLayout) findViewById(a7.f.f0if);
        this.f33472R = (ImageView) findViewById(a7.f.f12290U4);
        this.f33473S = (RecyclerView) findViewById(a7.f.Fd);
        this.f33474T = (RecyclerView) findViewById(a7.f.Dd);
        this.f33475U = (LinearLayout) findViewById(a7.f.W9);
        this.f33476V = (LinearLayout) findViewById(a7.f.f12175I8);
        this.f33477W = (TextView) findViewById(a7.f.wk);
        this.f33478X = (TextView) findViewById(a7.f.Zj);
        this.f33479Y = (EditText) findViewById(a7.f.f12464m3);
        this.f33480Z = (LinearLayout) findViewById(a7.f.W8);
        this.f33483e0 = (Toolbar) findViewById(a7.f.kh);
        this.f33485f0 = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f33487g0 = (ImageView) findViewById(a7.f.Xa);
        this.f33489h0 = (ImageView) findViewById(a7.f.f12151G4);
        this.f33491i0 = (RelativeLayout) findViewById(a7.f.se);
        this.f33493j0 = (ImageView) findViewById(a7.f.f12161H4);
    }

    private void l2() {
        this.f33509r0 = new Handler();
        this.f33502o = new ArrayList();
        this.f33504p = new ArrayList();
        this.f33506q = new LiveStreamDBHandler(this.f33481d);
        this.f33508r = new ArrayList();
        this.f33512t = new ArrayList();
        this.f33510s = new ArrayList();
        this.f33500n = new RecentWatchDBHandler(this.f33481d);
        this.f33494k = new LinearLayoutManager(this.f33481d);
        this.f33518w = new DatabaseHandler(this.f33481d);
        this.f33466L = new n7.e(this, this.f33481d);
        this.f33521z = new ArrayList();
        this.f33455A = new ArrayList();
        SharedPreferences sharedPreferences = getSharedPreferences("showhidemoviename", 0);
        this.f33458D = sharedPreferences;
        this.f33459E = sharedPreferences.edit();
        w.y(this.f33481d);
        if (new C2858a(this.f33481d).A().equals(AbstractC2237a.f44453K0)) {
            this.f33489h0.setVisibility(8);
        } else {
            this.f33489h0.setVisibility(0);
        }
        W1();
        O2();
        x2();
        y2();
        if (!SharepreferenceDBHandler.getCurrentAPPType(this.f33481d).equals("stalker_api")) {
            r2();
            return;
        }
        try {
            this.f33499m0 = SharepreferenceDBHandler.getStalkerToken(this.f33481d);
            String loggedInMacAddress = SharepreferenceDBHandler.getLoggedInMacAddress(this.f33481d);
            this.f33497l0 = loggedInMacAddress;
            this.f33466L.f(loggedInMacAddress, this.f33499m0, 0);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private boolean o2() {
        EditText editText = this.f33479Y;
        return editText != null && editText.getText().toString().length() > 0;
    }

    private void s2() {
        List listA = Listsingleton.b().a();
        final Dialog dialog = new Dialog(this, k.f13462g);
        dialog.requestWindowFeature(1);
        dialog.setContentView(a7.g.f12682N1);
        dialog.getWindow().setBackgroundDrawable(null);
        dialog.getWindow().setLayout(-1, -2);
        dialog.setCancelable(false);
        ImageView imageView = (ImageView) dialog.findViewById(a7.f.f12201L4);
        ImageView imageView2 = (ImageView) dialog.findViewById(a7.f.f12308W4);
        LinearLayout linearLayout = (LinearLayout) dialog.findViewById(a7.f.f12114C7);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: p7.B1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialog.dismiss();
            }
        });
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: p7.C1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialog.dismiss();
            }
        });
        imageView2.setOnFocusChangeListener(new w.k((View) imageView2, (Activity) this));
        imageView2.setOnFocusChangeListener(new b(imageView2));
        imageView2.setNextFocusUpId(a7.f.f12308W4);
        imageView2.setNextFocusDownId(a7.f.f12308W4);
        imageView2.setNextFocusRightId(a7.f.f12308W4);
        imageView2.setNextFocusLeftId(a7.f.f12308W4);
        imageView2.requestFocus();
        if (listA != null) {
            try {
                if (listA.size() > 0) {
                    if (listA.size() > AbstractC2237a.f44516k1) {
                        t.q(this.f33481d).l((String) listA.get(AbstractC2237a.f44516k1)).g(imageView);
                        AbstractC2237a.f44516k1++;
                    } else {
                        t.q(this.f33481d).l((String) listA.get(0)).g(imageView);
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
    public void x1() {
        ArrayList arrayList = this.f33457C;
        if (arrayList == null || arrayList.size() <= 0) {
            VodAllCategoriesSingleton.getInstance().setVodList(null);
            VodAllCategoriesSingleton.getInstance().setContinueWatchingList(null);
            Menu menu = this.f33460F;
            if (menu != null) {
                menu.getItem(1).getSubMenu().findItem(a7.f.Db).setVisible(false);
            }
            m0 m0Var = new m0(this.f33481d, "continue_watching", this.f33465K);
            this.f33496l = m0Var;
            this.f33474T.setAdapter(m0Var);
            H2(getResources().getString(a7.j.f13391t4));
            return;
        }
        VodAllCategoriesSingleton.getInstance().setContinueWatchingList(this.f33457C);
        if (this.f33460F != null) {
            ArrayList arrayList2 = this.f33457C;
            if (arrayList2 == null || arrayList2.size() <= 0) {
                this.f33460F.getItem(1).getSubMenu().findItem(a7.f.Db).setVisible(false);
            } else {
                this.f33460F.getItem(1).getSubMenu().findItem(a7.f.Db).setVisible(true);
            }
        }
        VodAllCategoriesSingleton.getInstance().setVodList(this.f33457C);
        m0 m0Var2 = new m0(this.f33481d, "continue_watching", this.f33465K);
        this.f33496l = m0Var2;
        this.f33474T.setAdapter(m0Var2);
        RelativeLayout relativeLayout = this.f33468N;
        this.f33492j = (relativeLayout == null || relativeLayout.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
        this.f33474T.setLayoutManager(this.f33492j);
        L2();
    }

    private void x2() {
        this.f33472R.setOnClickListener(this);
        this.f33470P.setOnClickListener(this);
        this.f33487g0.setOnClickListener(this);
        this.f33471Q.setOnClickListener(this);
        this.f33489h0.setOnClickListener(this);
        this.f33493j0.setOnClickListener(this);
    }

    private void y2() {
        EditText editText = this.f33479Y;
        if (editText != null) {
            editText.addTextChangedListener(new c());
        }
    }

    public void A2() {
        w.f44701n = new h().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_recent_watch", "-4");
    }

    public void C2(String str) {
        TextView textView = this.f33478X;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void D2(int i9) {
        this.f33465K = i9;
    }

    public void E2(int i9) {
        this.f33517v0 = i9;
    }

    @Override // z7.g
    public void F(StalkerGetSeriesCategoriesCallback stalkerGetSeriesCategoriesCallback) {
    }

    @Override // z7.g
    public void G(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, Z.E e9, int i9) {
    }

    @Override // z7.g
    public void G0(StalkerTokenCallback stalkerTokenCallback) {
    }

    @Override // z7.g
    public void H(String str) {
        r2();
    }

    public void H2(String str) {
        TextView textView = this.f33477W;
        if (textView != null) {
            textView.setText(str);
            this.f33477W.setVisibility(0);
        }
    }

    @Override // z7.g
    public void I(m0.x xVar, int i9) {
    }

    public void L2() {
        LinearLayout linearLayout = this.f33475U;
        if (linearLayout == null || linearLayout.getVisibility() != 8) {
            return;
        }
        this.f33475U.setVisibility(0);
    }

    @Override // z7.g
    public void M(StalkerGetAdCallback stalkerGetAdCallback, int i9) {
        r2();
    }

    public final void M2() {
        try {
            this.f33466L.n(this.f33497l0, this.f33499m0, this.f33463I.equals("0") ? "*" : this.f33463I, String.valueOf(this.f33501n0));
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void N2() {
        try {
            this.f33466L.o(this.f33497l0, this.f33499m0, String.valueOf(this.f33501n0));
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // z7.g
    public void O(Z.E e9, int i9) {
    }

    @Override // z7.g
    public void P0(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f9 A[Catch: Exception -> 0x0183, NullPointerException -> 0x0186, TRY_ENTER, TryCatch #2 {NullPointerException -> 0x0186, Exception -> 0x0183, blocks: (B:3:0x0004, B:5:0x0008, B:7:0x000c, B:8:0x000f, B:13:0x0047, B:15:0x007c, B:18:0x0088, B:19:0x00a1, B:27:0x00da, B:30:0x00f9, B:31:0x0132, B:32:0x0138, B:34:0x0146, B:20:0x00a9, B:23:0x00b6, B:26:0x00c2, B:12:0x0041, B:35:0x0180), top: B:41:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0138 A[Catch: Exception -> 0x0183, NullPointerException -> 0x0186, TryCatch #2 {NullPointerException -> 0x0186, Exception -> 0x0183, blocks: (B:3:0x0004, B:5:0x0008, B:7:0x000c, B:8:0x000f, B:13:0x0047, B:15:0x007c, B:18:0x0088, B:19:0x00a1, B:27:0x00da, B:30:0x00f9, B:31:0x0132, B:32:0x0138, B:34:0x0146, B:20:0x00a9, B:23:0x00b6, B:26:0x00c2, B:12:0x0041, B:35:0x0180), top: B:41:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean P2() {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity.P2():java.lang.Boolean");
    }

    public boolean S1() {
        m0 m0Var = this.f33496l;
        if (m0Var != null) {
            return m0Var.h1();
        }
        return false;
    }

    @Override // z7.g
    public void U(StalkerLiveFavIdsCallback stalkerLiveFavIdsCallback) {
    }

    public void U1() {
        try {
            ArrayList arrayList = this.f33456B;
            if (arrayList == null || arrayList.size() <= 0) {
                VodAllCategoriesSingleton.getInstance().setVodList(null);
                w2();
                m0 m0Var = new m0(this.f33481d, "vod", this.f33465K);
                this.f33496l = m0Var;
                this.f33474T.setAdapter(m0Var);
                H2(getResources().getString(a7.j.f13321m4));
                return;
            }
            VodAllCategoriesSingleton.getInstance().setVodList(this.f33456B);
            m0 m0Var2 = new m0(this.f33481d, "vod", this.f33465K);
            this.f33496l = m0Var2;
            this.f33474T.setAdapter(m0Var2);
            RelativeLayout relativeLayout = this.f33468N;
            this.f33492j = (relativeLayout == null || relativeLayout.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
            this.f33474T.setLayoutManager(this.f33492j);
            L2();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // z7.g
    public void V(StalkerProfilesCallback stalkerProfilesCallback) {
    }

    @Override // z7.g
    public void V0(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, m0.x xVar, int i9) {
    }

    public void V1() {
        try {
            if (VodAllCategoriesSingleton.getInstance().getVodFavList() == null || VodAllCategoriesSingleton.getInstance().getVodFavList().size() <= 0) {
                VodAllCategoriesSingleton.getInstance().setVodList(null);
                m0 m0Var = new m0(this.f33481d, "vod", this.f33465K);
                this.f33496l = m0Var;
                m0Var.p1(null);
                this.f33474T.setAdapter(this.f33496l);
                j2();
                H2(getResources().getString(a7.j.f13321m4));
                return;
            }
            m0 m0Var2 = new m0(this.f33481d, "vod", this.f33465K);
            this.f33496l = m0Var2;
            m0Var2.p1(null);
            this.f33474T.setAdapter(this.f33496l);
            RelativeLayout relativeLayout = this.f33468N;
            this.f33492j = (relativeLayout == null || relativeLayout.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
            this.f33474T.setLayoutManager(this.f33492j);
            f2();
            L2();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public String X1(String str) {
        try {
            this.f33519x = new ArrayList();
            this.f33502o = new ArrayList();
            this.f33520y = new ArrayList();
            this.f33521z = this.f33506q.getAllLiveStreasWithCategoryId(str, "movie");
            return "get_all";
        } catch (Exception e9) {
            e9.printStackTrace();
            return "get_all";
        }
    }

    public void Y1() {
        if (Listsingleton.b().a() == null || Listsingleton.b().a().size() <= 0) {
            return;
        }
        AbstractC2237a.f44510i1 = true;
        s2();
    }

    public String Z1() {
        LiveStreamsDBModel liveStreamFavouriteRow;
        ArrayList arrayList;
        try {
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f33481d).equals("m3u")) {
                new ArrayList();
                this.f33456B.clear();
                ArrayList<FavouriteM3UModel> favouriteM3U = this.f33506q.getFavouriteM3U("movie");
                if (this.f33516v != null) {
                    this.f33516v = a2();
                }
                ArrayList arrayList2 = this.f33516v;
                if (arrayList2 != null && arrayList2.size() > 0 && favouriteM3U != null && favouriteM3U.size() > 0) {
                    favouriteM3U = MyApplication.s(favouriteM3U, this.f33516v);
                }
                if (favouriteM3U == null || favouriteM3U.size() <= 0) {
                    return "get_fav_local";
                }
                for (FavouriteM3UModel favouriteM3UModel : favouriteM3U) {
                    ArrayList<LiveStreamsDBModel> m3UFavouriteRow = this.f33506q.getM3UFavouriteRow(favouriteM3UModel.getCategoryID(), favouriteM3UModel.getUrl(), favouriteM3UModel.getTimestamp());
                    if (m3UFavouriteRow != null && m3UFavouriteRow.size() > 0) {
                        this.f33456B.add(m3UFavouriteRow.get(0));
                    }
                }
                return "get_fav_local";
            }
            new ArrayList();
            this.f33456B.clear();
            ArrayList<FavouriteDBModel> allFavourites = this.f33518w.getAllFavourites("vod", SharepreferenceDBHandler.getUserID(this.f33481d));
            if (this.f33516v != null) {
                this.f33516v = a2();
            }
            ArrayList arrayList3 = this.f33516v;
            if (arrayList3 != null && arrayList3.size() > 0 && allFavourites != null && allFavourites.size() > 0) {
                allFavourites = MyApplication.r(allFavourites, this.f33516v);
            }
            if (allFavourites == null || allFavourites.size() <= 0) {
                return "get_fav_local";
            }
            for (FavouriteDBModel favouriteDBModel : allFavourites) {
                if (SharepreferenceDBHandler.getCurrentAPPType(this.f33481d).equals("onestream_api")) {
                    liveStreamFavouriteRow = this.f33506q.getLiveStreamFavouriteRow(favouriteDBModel.getCategoryID(), String.valueOf(favouriteDBModel.getStreamIDOneStream()), favouriteDBModel.getTimestamp(), "");
                    if (liveStreamFavouriteRow != null) {
                        arrayList = this.f33456B;
                        arrayList.add(liveStreamFavouriteRow);
                    }
                } else {
                    liveStreamFavouriteRow = this.f33506q.getLiveStreamFavouriteRow(favouriteDBModel.getCategoryID(), String.valueOf(favouriteDBModel.getStreamID()), favouriteDBModel.getTimestamp(), "");
                    if (liveStreamFavouriteRow != null) {
                        arrayList = this.f33456B;
                        arrayList.add(liveStreamFavouriteRow);
                    }
                }
            }
            if (!SharepreferenceDBHandler.getVODSubCatSort(this.f33481d).equalsIgnoreCase("6")) {
                return "get_fav_local";
            }
            Collections.sort(this.f33456B, new e());
            return "get_fav_local";
        } catch (Exception e9) {
            e9.printStackTrace();
            return "get_fav_local";
        }
    }

    @Override // z7.g
    public void c(String str) {
    }

    public String c2(String str) {
        try {
            this.f33519x = new ArrayList();
            this.f33502o = new ArrayList();
            this.f33520y = new ArrayList();
            this.f33521z = this.f33506q.getAllLiveStreasWithCategoryId(str, "movie");
            return "get_all";
        } catch (Exception e9) {
            e9.printStackTrace();
            return "get_all";
        }
    }

    @Override // z7.g
    public void d0(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, C2635t.o oVar, String str, String str2) {
    }

    @Override // z7.g
    public void e(String str) {
    }

    @Override // z7.g
    public void e0(String str) {
        try {
            w.X();
            g2();
        } catch (Exception unused) {
        }
    }

    public void e2() {
        LinearLayout linearLayout = this.f33480Z;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    @Override // z7.g
    public void f0(StalkerGetGenresCallback stalkerGetGenresCallback) {
    }

    public void f2() {
        TextView textView = this.f33477W;
        if (textView == null || textView.getVisibility() != 0) {
            return;
        }
        this.f33477W.setVisibility(8);
    }

    public void g2() {
        LinearLayout linearLayout = this.f33476V;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        this.f33476V.setVisibility(8);
    }

    @Override // z7.g
    public void i(StalkerGetAllChannelsCallback stalkerGetAllChannelsCallback) {
    }

    public void i2() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    @Override // z7.g
    public void j(StalkerGetVodCategoriesCallback stalkerGetVodCategoriesCallback) {
    }

    public void j2() {
        LinearLayout linearLayout = this.f33475U;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        this.f33475U.setVisibility(8);
    }

    @Override // z7.g
    public void o0(String str) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (o2()) {
            T1();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == a7.f.f12290U4) {
            h2();
            return;
        }
        if (id == a7.f.f12151G4 || id == a7.f.f12161H4) {
            onBackPressed();
            return;
        }
        if (id == a7.f.f12456l5) {
            this.f33465K = -1;
            J2();
        } else if (id == a7.f.Xa) {
            w.j(this.f33481d);
        } else if (id == a7.f.f0if) {
            this.f33479Y.requestFocus();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i2();
        R1();
        this.f33481d = this;
        if (SharepreferenceDBHandler.getCurrentAPPType(this).equals("stalker_api")) {
            setContentView(a7.g.f12675M0);
            this.f33495k0 = (NestedScrollView) findViewById(a7.f.f12476n4);
        } else {
            setContentView(a7.g.f12669L0);
        }
        k2();
        Toolbar toolbar = this.f33483e0;
        if (toolbar != null) {
            r1(toolbar);
        }
        AbstractC2237a.f44457M0 = "-1";
        l2();
        if (AbstractC2237a.f44475V0.booleanValue() && AbstractC2237a.f44498e1.equalsIgnoreCase("1")) {
            if (SharepreferenceDBHandler.getEventAdsView(this) < AbstractC2237a.f44501f1) {
                SharepreferenceDBHandler.setEventAdsView(SharepreferenceDBHandler.getEventAdsView(this) + 1, this);
            } else {
                SharepreferenceDBHandler.setEventAdsView(0, this);
                Y1();
            }
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        Toolbar toolbar = this.f33483e0;
        if (toolbar != null) {
            toolbar.x(a7.h.f12937t);
            SharedPreferences sharedPreferences = this.f33458D;
            if (sharedPreferences != null) {
                if (sharedPreferences.getInt("vod", 1) == 1) {
                    menu.getItem(1).getSubMenu().findItem(a7.f.f12569w6).setVisible(false);
                    menu.getItem(1).getSubMenu().findItem(a7.f.f12529s6).setVisible(true);
                } else {
                    menu.getItem(1).getSubMenu().findItem(a7.f.f12569w6).setVisible(true);
                    menu.getItem(1).getSubMenu().findItem(a7.f.f12529s6).setVisible(false);
                }
            }
            this.f33460F = menu;
            TextView textView = this.f33478X;
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (this.f33463I.equals("-5") || this.f33463I.equals("-4") || SharepreferenceDBHandler.getCurrentAPPType(this.f33481d).equals("stalker_api")) {
                this.f33460F.getItem(1).getSubMenu().findItem(a7.f.mb).setVisible(false);
            } else {
                this.f33460F.getItem(1).getSubMenu().findItem(a7.f.mb).setVisible(true);
            }
            if (this.f33463I.equals("-4")) {
                this.f33460F.getItem(1).getSubMenu().findItem(a7.f.Db).setVisible(true);
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f33481d).equals("m3u") || SharepreferenceDBHandler.getCurrentAPPType(this.f33481d).equals("onestream_api")) {
                menu.getItem(1).getSubMenu().findItem(a7.f.gb).setVisible(true);
            } else {
                menu.getItem(1).getSubMenu().findItem(a7.f.gb).setVisible(false);
            }
        }
        return true;
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AsyncTask asyncTask = w.f44701n;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            return;
        }
        w.f44701n.cancel(true);
    }

    @Override // androidx.appcompat.app.b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        m0 m0Var;
        if (i9 != 21) {
            return super.onKeyDown(i9, keyEvent);
        }
        if (this.f33468N.getVisibility() != 8 || (m0Var = this.f33496l) == null) {
            return false;
        }
        int iI1 = m0Var.i1();
        this.f33465K = iI1;
        if (iI1 % 7 != 0) {
            return false;
        }
        J2();
        return false;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        this.f33461G = menuItem;
        this.f33483e0.e();
        int itemId = menuItem.getItemId();
        if (itemId == a7.f.f12400g) {
            try {
                SearchView searchView = (SearchView) menuItem.getActionView();
                this.f33462H = searchView;
                if (searchView != null) {
                    searchView.setQueryHint(getResources().getString(a7.j.f13020H6));
                    this.f33462H.setIconifiedByDefault(false);
                    ImageView imageView = (ImageView) this.f33462H.findViewById(a7.f.Uf);
                    ((ImageView) this.f33462H.findViewById(a7.f.Vf)).setImageResource(a7.e.f12032m1);
                    imageView.setImageResource(a7.e.f12032m1);
                    imageView.setPadding(15, 15, 15, 15);
                    imageView.setBackground(null);
                    this.f33462H.setOnQueryTextListener(new g());
                    return true;
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        if (itemId == a7.f.mb) {
            K2(this);
        }
        if (itemId == a7.f.f12569w6) {
            SharedPreferences.Editor editor = this.f33459E;
            if (editor != null) {
                editor.putInt("vod", 1);
                this.f33459E.commit();
            }
            Menu menu = this.f33460F;
            if (menu != null) {
                menu.getItem(1).getSubMenu().findItem(a7.f.f12569w6).setVisible(false);
                this.f33460F.getItem(1).getSubMenu().findItem(a7.f.f12529s6).setVisible(true);
            }
            w2();
        }
        if (itemId == a7.f.f12529s6) {
            SharedPreferences.Editor editor2 = this.f33459E;
            if (editor2 != null) {
                editor2.putInt("vod", 0);
                this.f33459E.commit();
            }
            Menu menu2 = this.f33460F;
            if (menu2 != null) {
                menu2.getItem(1).getSubMenu().findItem(a7.f.f12569w6).setVisible(true);
                this.f33460F.getItem(1).getSubMenu().findItem(a7.f.f12529s6).setVisible(false);
            }
            w2();
        }
        if (itemId == a7.f.Db && VodAllCategoriesSingleton.getInstance().getContinueWatchingList() != null && VodAllCategoriesSingleton.getInstance().getContinueWatchingList().size() > 0) {
            G2();
        }
        if (itemId == a7.f.gb) {
            w.A0(this.f33481d);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        i2();
        super.onResume();
        v2();
        w.z0(this.f33481d);
        if (this.f33463I.equals("-4")) {
            A2();
        } else {
            w2();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        i2();
    }

    public boolean p2() {
        EditText editText = this.f33479Y;
        if (editText != null) {
            return editText.isFocused();
        }
        return false;
    }

    @Override // z7.g
    public void q(StalkerGetVODByCatCallback stalkerGetVODByCatCallback) {
        SearchView searchView;
        ArrayList arrayList;
        SearchView searchView2;
        if (stalkerGetVODByCatCallback == null || stalkerGetVODByCatCallback.getJs() == null || stalkerGetVODByCatCallback.getJs().getData() == null || stalkerGetVODByCatCallback.getJs().getData().size() <= 0) {
            try {
                searchView = this.f33462H;
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            int length = searchView != null ? searchView.getQuery().toString().length() : 0;
            if (length < 3) {
                try {
                    AbstractC2237a.f44457M0 = stalkerGetVODByCatCallback.getJs().getTotalItems().toString();
                } catch (Exception unused) {
                }
            }
        } else {
            this.f33519x = new ArrayList();
            this.f33502o = new ArrayList();
            this.f33520y = new ArrayList();
            this.f33503o0 = w.v(stalkerGetVODByCatCallback.getJs().getTotalItems().intValue(), stalkerGetVODByCatCallback.getJs().getMaxPageItems().intValue());
            try {
                searchView2 = this.f33462H;
            } catch (Exception unused2) {
            }
            int length2 = searchView2 != null ? searchView2.getQuery().toString().length() : 0;
            if (length2 < 3) {
                try {
                    AbstractC2237a.f44457M0 = stalkerGetVODByCatCallback.getJs().getTotalItems().toString();
                } catch (Exception unused3) {
                }
            }
            for (int i9 = 0; i9 < stalkerGetVODByCatCallback.getJs().getData().size(); i9++) {
                LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                liveStreamsDBModel.setNum(stalkerGetVODByCatCallback.getJs().getData().get(i9).getId());
                liveStreamsDBModel.setName(stalkerGetVODByCatCallback.getJs().getData().get(i9).getName());
                liveStreamsDBModel.setStreamType("movie");
                liveStreamsDBModel.setStreamId(stalkerGetVODByCatCallback.getJs().getData().get(i9).getId());
                liveStreamsDBModel.setStreamIcon(stalkerGetVODByCatCallback.getJs().getData().get(i9).getScreenshotUri());
                liveStreamsDBModel.setAdded(stalkerGetVODByCatCallback.getJs().getData().get(i9).getAdded());
                liveStreamsDBModel.setCategoryId(stalkerGetVODByCatCallback.getJs().getData().get(i9).getCategoryId());
                liveStreamsDBModel.setFav(stalkerGetVODByCatCallback.getJs().getData().get(i9).getFav());
                liveStreamsDBModel.setDirector(stalkerGetVODByCatCallback.getJs().getData().get(i9).getDirector());
                liveStreamsDBModel.setCast(stalkerGetVODByCatCallback.getJs().getData().get(i9).getActors());
                liveStreamsDBModel.setDescription(stalkerGetVODByCatCallback.getJs().getData().get(i9).getDescription());
                liveStreamsDBModel.setGenre(stalkerGetVODByCatCallback.getJs().getData().get(i9).getGenresStr());
                liveStreamsDBModel.setCmd(stalkerGetVODByCatCallback.getJs().getData().get(i9).getCmd());
                liveStreamsDBModel.setYear(stalkerGetVODByCatCallback.getJs().getData().get(i9).getYear());
                liveStreamsDBModel.setDurationMin(stalkerGetVODByCatCallback.getJs().getData().get(i9).getTime());
                liveStreamsDBModel.setRatingFromTen(stalkerGetVODByCatCallback.getJs().getData().get(i9).getRatingImdb().equals("N/A") ? "0" : stalkerGetVODByCatCallback.getJs().getData().get(i9).getRatingImdb());
                this.f33521z.add(liveStreamsDBModel);
            }
            ArrayList arrayList2 = this.f33521z;
            if (arrayList2 != null && arrayList2.size() > 0 && (arrayList = this.f33455A) != null && arrayList.size() == 0) {
                this.f33455A.addAll(this.f33521z);
                this.f33507q0 = this.f33503o0;
            }
        }
        w1(false);
    }

    public void q2(String str, String str2) {
        LiveStreamsDBModel liveStreamsDBModel;
        int i9;
        try {
            ArrayList arrayList = this.f33455A;
            if (arrayList == null || arrayList.size() <= 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= this.f33455A.size()) {
                    i10 = -1;
                    break;
                } else if (((LiveStreamsDBModel) this.f33455A.get(i10)).getStreamId().equals(str)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (str2.equals("add")) {
                if (i10 == -1) {
                    return;
                }
                liveStreamsDBModel = (LiveStreamsDBModel) this.f33455A.get(i10);
                i9 = 1;
            } else {
                if (i10 == -1) {
                    return;
                }
                liveStreamsDBModel = (LiveStreamsDBModel) this.f33455A.get(i10);
                i9 = 0;
            }
            liveStreamsDBModel.setFav(i9);
        } catch (Exception unused) {
        }
    }

    public void r2() {
        new j().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    public void t2(String str, String str2) {
        AsyncTask asyncTaskExecuteOnExecutor;
        ArrayList<LiveStreamsDBModel> continueWatchingList;
        AbstractC2237a.f44505h = str;
        this.f33463I = str;
        this.f33464J = str2;
        C2(str2);
        B2(str);
        try {
            SearchView searchView = this.f33462H;
            if (searchView != null && this.f33461G != null) {
                searchView.d0("", false);
                this.f33461G.collapseActionView();
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        try {
            if (this.f33460F != null) {
                if (this.f33463I.equals("-5") || this.f33463I.equals("-4") || SharepreferenceDBHandler.getCurrentAPPType(this.f33481d).equals("stalker_api")) {
                    MenuItem menuItemFindItem = this.f33460F.getItem(1).getSubMenu().findItem(a7.f.mb);
                    menuItemFindItem.setVisible(false);
                    if (this.f33463I.equals("-4") || (continueWatchingList = VodAllCategoriesSingleton.getInstance().getContinueWatchingList()) == null || continueWatchingList.size() <= 0) {
                        menuItemFindItem.setVisible(false);
                    } else {
                        this.f33460F.getItem(1).getSubMenu().findItem(a7.f.Db).setVisible(true);
                    }
                } else {
                    this.f33460F.getItem(1).getSubMenu().findItem(a7.f.mb).setVisible(true);
                    MenuItem menuItemFindItem2 = this.f33463I.equals("-4") ? this.f33460F.getItem(1).getSubMenu().findItem(a7.f.Db) : this.f33460F.getItem(1).getSubMenu().findItem(a7.f.Db);
                    menuItemFindItem2.setVisible(false);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        str.hashCode();
        switch (str) {
            case "-1":
                if (!SharepreferenceDBHandler.getCurrentAPPType(this.f33481d).equals("stalker_api")) {
                    asyncTaskExecuteOnExecutor = new h().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_fav");
                    break;
                } else {
                    this.f33521z = new ArrayList();
                    this.f33455A = new ArrayList();
                    this.f33465K = 0;
                    this.f33467M = true;
                    this.f33501n0 = 1;
                    I2();
                    j2();
                    f2();
                    N2();
                    return;
                }
                break;
            case "-4":
                asyncTaskExecuteOnExecutor = new h().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_recent_watch");
                break;
            case "-5":
                asyncTaskExecuteOnExecutor = new h().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_recent_added", str);
                break;
            default:
                if (!SharepreferenceDBHandler.getCurrentAPPType(this.f33481d).equals("stalker_api")) {
                    asyncTaskExecuteOnExecutor = new h().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_all", str);
                    break;
                } else {
                    this.f33521z = new ArrayList();
                    this.f33455A = new ArrayList();
                    this.f33465K = 0;
                    this.f33467M = true;
                    this.f33501n0 = 1;
                    I2();
                    j2();
                    f2();
                    M2();
                    return;
                }
                break;
        }
        w.f44701n = asyncTaskExecuteOnExecutor;
    }

    public void u2() {
        LinearLayout linearLayout = this.f33480Z;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    @Override // z7.g
    public void v0(String str) {
    }

    public void v2() {
        l0 l0Var = this.f33498m;
        if (l0Var != null) {
            l0Var.w();
        }
    }

    public void w1(boolean z9) {
        m0 m0Var;
        try {
            w.X();
            g2();
            ArrayList arrayList = this.f33521z;
            if (arrayList == null || arrayList.size() <= 0) {
                j2();
                VodAllCategoriesSingleton.getInstance().setVodList(null);
                m0 m0Var2 = new m0(this.f33481d, "vod", this.f33465K);
                this.f33496l = m0Var2;
                this.f33474T.setAdapter(m0Var2);
                H2(getResources().getString(a7.j.f13381s4));
                if (SharepreferenceDBHandler.getCurrentAPPType(this.f33481d).equals("stalker_api")) {
                    v2();
                    return;
                }
                return;
            }
            VodAllCategoriesSingleton.getInstance().setVodList(this.f33521z);
            if (z9) {
                this.f33465K = -1;
            } else {
                this.f33465K = 0;
                if (!this.f33467M && (m0Var = this.f33496l) != null) {
                    this.f33465K = m0Var.i1();
                }
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f33481d).equals("stalker_api")) {
                if (!z9) {
                    v2();
                }
                m0 m0Var3 = new m0(this.f33481d, "vod", this.f33465K);
                this.f33496l = m0Var3;
                this.f33474T.setAdapter(m0Var3);
                RelativeLayout relativeLayout = this.f33468N;
                this.f33492j = (relativeLayout == null || relativeLayout.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
                this.f33474T.setLayoutManager(this.f33492j);
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f33495k0.setOnScrollChangeListener(new f());
                }
            } else {
                m0 m0Var4 = new m0(this.f33481d, "vod", this.f33465K);
                this.f33496l = m0Var4;
                this.f33474T.setAdapter(m0Var4);
                RelativeLayout relativeLayout2 = this.f33468N;
                this.f33492j = (relativeLayout2 == null || relativeLayout2.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
                this.f33474T.setLayoutManager(this.f33492j);
            }
            L2();
        } catch (Exception unused) {
        }
    }

    public void w2() {
        m0 m0Var = this.f33496l;
        if (m0Var != null) {
            m0Var.w();
        }
    }

    @Override // z7.g
    public void y0(String str) {
    }

    public void z2() {
        m0 m0Var = this.f33496l;
        if (m0Var != null) {
            m0Var.o1();
        }
    }
}
