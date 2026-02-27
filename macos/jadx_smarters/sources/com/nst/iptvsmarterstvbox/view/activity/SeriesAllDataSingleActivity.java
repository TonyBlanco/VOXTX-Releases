package com.nst.iptvsmarterstvbox.view.activity;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
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
import com.nst.iptvsmarterstvbox.model.FavouriteDBModel;
import com.nst.iptvsmarterstvbox.model.FavouriteM3UModel;
import com.nst.iptvsmarterstvbox.model.SeriesAllCategoriesSingleton;
import com.nst.iptvsmarterstvbox.model.callback.GetEpisdoeDetailsCallback;
import com.nst.iptvsmarterstvbox.model.callback.SeriesDBModel;
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
import com.nst.iptvsmarterstvbox.model.database.SeriesRecentWatchDatabase;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.sbpfunction.singletonpushnotification.Listsingleton;
import com.nst.iptvsmarterstvbox.view.activity.SeriesAllDataSingleActivity;
import com.squareup.picasso.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import m7.AbstractC2237a;
import m7.w;
import q7.C2635t;
import q7.Y;
import q7.Z;
import q7.m0;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class SeriesAllDataSingleActivity extends androidx.appcompat.app.b implements View.OnClickListener, z7.g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ArrayList f31951A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ArrayList f31952B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ArrayList f31953C;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public SharedPreferences f31956F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public SharedPreferences.Editor f31957G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Menu f31958H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public MenuItem f31959I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public SearchView f31960J;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public LinearLayout f31965O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public RelativeLayout f31966P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public RelativeLayout f31967Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public ImageView f31968R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public RelativeLayout f31969S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public ImageView f31970T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public RecyclerView f31971U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public RecyclerView f31972V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public LinearLayout f31973W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public LinearLayout f31974X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f31975Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextView f31976Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f31977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Animation f31978e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public EditText f31979e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Animation f31980f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public LinearLayout f31981f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Animation f31982g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Toolbar f31983g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Animation f31984h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public AppBarLayout f31985h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Animation f31986i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ImageView f31987i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GridLayoutManager f31988j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public ImageView f31989j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayoutManager f31990k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public ImageView f31991k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Z f31992l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public NestedScrollView f31993l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Y f31994m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f31996n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f31998o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LiveStreamDBHandler f32000p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f32002q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f32004r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f32006s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Handler f32007s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SeriesRecentWatchDatabase f32008t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Runnable f32009t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public n7.e f32011u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f32013v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public DatabaseHandler f32014w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f32015x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f32016y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ArrayList f32017z;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f32010u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f32012v = new ArrayList();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ArrayList f31954D = new ArrayList();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public List f31955E = new ArrayList();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public String f31961K = "0";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f31962L = "0";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f31963M = -1;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f31964N = true;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public String f31995m0 = "";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public String f31997n0 = "";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f31999o0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f32001p0 = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f32003q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f32005r0 = 0;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
            if (SeriesAllDataSingleActivity.this.f31994m != null) {
                SeriesAllDataSingleActivity.this.f31994m.getFilter().filter(charSequence.toString());
            }
        }
    }

    public class b extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f32019a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f32020c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f32021d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f32022e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f32023f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public LinearLayout f32024g;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SeriesAllDataSingleActivity.this.t2();
            }
        }

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.activity.SeriesAllDataSingleActivity$b$b, reason: collision with other inner class name */
        public class ViewOnFocusChangeListenerC0277b implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f32027a;

            public ViewOnFocusChangeListenerC0277b(View view) {
                this.f32027a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f32027a;
                    if (view2 == null || view2.getTag() == null || !this.f32027a.getTag().equals("1")) {
                        View view3 = this.f32027a;
                        if (view3 == null || view3.getTag() == null || !this.f32027a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = b.this.f32024g;
                        }
                    } else {
                        linearLayout = b.this.f32023f;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f32027a;
                    if (view4 == null || view4.getTag() == null || !this.f32027a.getTag().equals("1")) {
                        View view5 = this.f32027a;
                        if (view5 == null || view5.getTag() == null || !this.f32027a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = b.this.f32024g;
                        }
                    } else {
                        linearLayout = b.this.f32023f;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        public b(Activity activity) {
            super(activity);
            this.f32019a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getId() == a7.f.f12544u1) {
                try {
                    SeriesAllDataSingleActivity.this.f32008t.updateAllRecordsBySeriesNumRecentWatchDB();
                    SeriesAllDataSingleActivity.this.y2();
                    new Handler().postDelayed(new a(), 100L);
                } catch (Exception unused) {
                }
            } else if (view.getId() == a7.f.f12412h1) {
                dismiss();
            }
            dismiss();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(new C2858a(SeriesAllDataSingleActivity.this.f31977d).A().equals(AbstractC2237a.f44453K0) ? a7.g.f12742X1 : a7.g.f12736W1);
            this.f32020c = (TextView) findViewById(a7.f.f12544u1);
            this.f32021d = (TextView) findViewById(a7.f.f12412h1);
            this.f32023f = (LinearLayout) findViewById(a7.f.V8);
            this.f32024g = (LinearLayout) findViewById(a7.f.Ia);
            TextView textView = (TextView) findViewById(a7.f.um);
            this.f32022e = textView;
            textView.setText(SeriesAllDataSingleActivity.this.getResources().getString(a7.j.X8));
            this.f32020c.setOnClickListener(this);
            this.f32021d.setOnClickListener(this);
            TextView textView2 = this.f32020c;
            textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0277b(textView2));
            TextView textView3 = this.f32021d;
            textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0277b(textView3));
        }
    }

    public class c implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f32029a;

        public c(View view) {
            this.f32029a = view;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (z9) {
                View view2 = this.f32029a;
                if (view2 == null || view2.getTag() == null) {
                    return;
                }
                this.f32029a.getTag().equals("iv_cross");
                return;
            }
            View view3 = this.f32029a;
            if (view3 == null || view3.getTag() == null || !this.f32029a.getTag().equals("iv_cross")) {
                return;
            }
            view.setBackground(SeriesAllDataSingleActivity.this.getResources().getDrawable(a7.e.f11933L));
        }
    }

    public class d extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f32031a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f32032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f32033d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f32034e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f32035f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public RadioGroup f32036g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Activity f32037h;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f32039a;

            public a(View view) {
                this.f32039a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f32039a;
                    if (view2 == null || view2.getTag() == null || !this.f32039a.getTag().equals("1")) {
                        View view3 = this.f32039a;
                        if (view3 == null || view3.getTag() == null || !this.f32039a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = d.this.f32035f;
                        }
                    } else {
                        linearLayout = d.this.f32034e;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f32039a;
                    if (view4 == null || view4.getTag() == null || !this.f32039a.getTag().equals("1")) {
                        View view5 = this.f32039a;
                        if (view5 == null || view5.getTag() == null || !this.f32039a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = d.this.f32035f;
                        }
                    } else {
                        linearLayout = d.this.f32034e;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Activity activity, Activity activity2) {
            super(activity);
            this.f32037h = activity2;
            this.f32031a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getId() == a7.f.f12544u1) {
                try {
                    String string = ((RadioButton) findViewById(this.f32036g.getCheckedRadioButtonId())).getText().toString();
                    SharepreferenceDBHandler.setSeriesSubCatSort(string.equals(this.f32037h.getResources().getString(a7.j.f13284i7)) ? "1" : string.equals(this.f32037h.getResources().getString(a7.j.f13254f7)) ? "2" : string.equals(this.f32037h.getResources().getString(a7.j.f13304k7)) ? "3" : string.equals(this.f32037h.getResources().getString(a7.j.f13294j7)) ? "6" : "0", this.f32037h);
                    SeriesAllDataSingleActivity seriesAllDataSingleActivity = SeriesAllDataSingleActivity.this;
                    seriesAllDataSingleActivity.r2(seriesAllDataSingleActivity.f31961K, SeriesAllDataSingleActivity.this.f31962L);
                    dismiss();
                } catch (Exception unused) {
                }
            } else if (view.getId() == a7.f.f12412h1) {
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
            setContentView(new C2858a(this.f32037h).A().equals(AbstractC2237a.f44453K0) ? a7.g.f12606A3 : a7.g.f12916z3);
            this.f32032c = (TextView) findViewById(a7.f.f12544u1);
            this.f32033d = (TextView) findViewById(a7.f.f12412h1);
            this.f32033d = (TextView) findViewById(a7.f.f12412h1);
            this.f32034e = (LinearLayout) findViewById(a7.f.V8);
            this.f32035f = (LinearLayout) findViewById(a7.f.Ia);
            this.f32036g = (RadioGroup) findViewById(a7.f.Kd);
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
            String seriesSubCatSort = SharepreferenceDBHandler.getSeriesSubCatSort(this.f32037h);
            seriesSubCatSort.hashCode();
            switch (seriesSubCatSort) {
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
            this.f32032c.setOnClickListener(this);
            this.f32033d.setOnClickListener(this);
            TextView textView = this.f32032c;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f32033d;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    public class e implements NestedScrollView.c {
        public e() {
        }

        @Override // androidx.core.widget.NestedScrollView.c
        public void a(NestedScrollView nestedScrollView, int i9, int i10, int i11, int i12) {
            String string;
            String str;
            String str2;
            String str3 = "";
            int length = 0;
            if (i10 == nestedScrollView.getChildAt(0).getMeasuredHeight() - nestedScrollView.getMeasuredHeight()) {
                SeriesAllDataSingleActivity.this.f31999o0++;
                Log.e("honey", "onScrollChange page:" + SeriesAllDataSingleActivity.this.f31999o0 + " Total:" + SeriesAllDataSingleActivity.this.f32001p0);
                SeriesAllDataSingleActivity seriesAllDataSingleActivity = SeriesAllDataSingleActivity.this;
                if (seriesAllDataSingleActivity.f31999o0 <= seriesAllDataSingleActivity.f32001p0) {
                    seriesAllDataSingleActivity.f31964N = false;
                    w.M0(SeriesAllDataSingleActivity.this);
                    if (SeriesAllDataSingleActivity.this.f31960J != null) {
                        string = SeriesAllDataSingleActivity.this.f31960J.getQuery().toString();
                        try {
                            length = SeriesAllDataSingleActivity.this.f31960J.getQuery().toString().length();
                        } catch (Exception unused) {
                        }
                    } else {
                        string = "";
                    }
                    String str4 = string;
                    if (length < 3) {
                        if (SeriesAllDataSingleActivity.this.f31961K.equals("-1")) {
                            SeriesAllDataSingleActivity.this.K2();
                            return;
                        } else {
                            SeriesAllDataSingleActivity.this.J2();
                            return;
                        }
                    }
                    if (SeriesAllDataSingleActivity.this.f31961K.equals("0")) {
                        str2 = str3;
                        str = "*";
                    } else if (SeriesAllDataSingleActivity.this.f31961K.equals("-1")) {
                        str3 = "1";
                        str2 = str3;
                        str = "*";
                    } else {
                        str = SeriesAllDataSingleActivity.this.f31961K;
                        str2 = "";
                    }
                    try {
                        n7.e eVar = SeriesAllDataSingleActivity.this.f32011u0;
                        SeriesAllDataSingleActivity seriesAllDataSingleActivity2 = SeriesAllDataSingleActivity.this;
                        eVar.t(seriesAllDataSingleActivity2.f31995m0, seriesAllDataSingleActivity2.f31997n0, str, str4, str2, String.valueOf(seriesAllDataSingleActivity2.f31999o0));
                    } catch (Exception unused2) {
                    }
                }
            }
        }
    }

    public class f implements SearchView.m {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f32043a;

            public a(String str) {
                this.f32043a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = "*";
                String str2 = "";
                if (!SeriesAllDataSingleActivity.this.f31961K.equals("0")) {
                    if (SeriesAllDataSingleActivity.this.f31961K.equals("-1")) {
                        str2 = "1";
                    } else {
                        str = SeriesAllDataSingleActivity.this.f31961K;
                    }
                }
                String str3 = str;
                String str4 = str2;
                SeriesAllDataSingleActivity.this.f32017z = new ArrayList();
                SeriesAllDataSingleActivity seriesAllDataSingleActivity = SeriesAllDataSingleActivity.this;
                seriesAllDataSingleActivity.f31963M = 0;
                seriesAllDataSingleActivity.f31964N = true;
                SeriesAllDataSingleActivity seriesAllDataSingleActivity2 = SeriesAllDataSingleActivity.this;
                seriesAllDataSingleActivity2.f31999o0 = 1;
                seriesAllDataSingleActivity2.F2();
                SeriesAllDataSingleActivity.this.h2();
                SeriesAllDataSingleActivity.this.f2();
                try {
                    Log.e("honey", "request:" + this.f32043a);
                    n7.e eVar = SeriesAllDataSingleActivity.this.f32011u0;
                    SeriesAllDataSingleActivity seriesAllDataSingleActivity3 = SeriesAllDataSingleActivity.this;
                    eVar.t(seriesAllDataSingleActivity3.f31995m0, seriesAllDataSingleActivity3.f31997n0, str3, this.f32043a, str4, String.valueOf(seriesAllDataSingleActivity3.f31999o0));
                } catch (Exception unused) {
                }
            }
        }

        public f() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextChange(String str) {
            if (SeriesAllDataSingleActivity.this.f31992l == null) {
                return false;
            }
            if (!SharepreferenceDBHandler.getCurrentAPPType(SeriesAllDataSingleActivity.this.f31977d).equals("stalker_api")) {
                SeriesAllDataSingleActivity.this.f31992l.getFilter().filter(str);
                return false;
            }
            try {
                if (str.length() >= 3) {
                    Handler handler = SeriesAllDataSingleActivity.this.f32007s0;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                    SeriesAllDataSingleActivity.this.f32009t0 = new a(str);
                    SeriesAllDataSingleActivity seriesAllDataSingleActivity = SeriesAllDataSingleActivity.this;
                    seriesAllDataSingleActivity.f32007s0.postDelayed(seriesAllDataSingleActivity.f32009t0, 1000L);
                    return false;
                }
                Handler handler2 = SeriesAllDataSingleActivity.this.f32007s0;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                }
                if (SeriesAllDataSingleActivity.this.f32017z == null || SeriesAllDataSingleActivity.this.f31951A == null || SeriesAllDataSingleActivity.this.f31951A.size() <= 0) {
                    return false;
                }
                SeriesAllDataSingleActivity seriesAllDataSingleActivity2 = SeriesAllDataSingleActivity.this;
                seriesAllDataSingleActivity2.f31963M = -1;
                seriesAllDataSingleActivity2.f31964N = true;
                SeriesAllDataSingleActivity seriesAllDataSingleActivity3 = SeriesAllDataSingleActivity.this;
                seriesAllDataSingleActivity3.f31999o0 = 1;
                seriesAllDataSingleActivity3.f32017z.clear();
                SeriesAllDataSingleActivity.this.f32017z.addAll(SeriesAllDataSingleActivity.this.f31951A);
                SeriesAllDataSingleActivity seriesAllDataSingleActivity4 = SeriesAllDataSingleActivity.this;
                seriesAllDataSingleActivity4.f32001p0 = seriesAllDataSingleActivity4.f32005r0;
                seriesAllDataSingleActivity4.v1(true);
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

    public class g implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Dialog f32045a;

        public g(Dialog dialog) {
            this.f32045a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f32045a.dismiss();
        }
    }

    public class h implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Dialog f32047a;

        public h(Dialog dialog) {
            this.f32047a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f32047a.dismiss();
        }
    }

    public class i extends AsyncTask {
        public i() {
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
                com.nst.iptvsmarterstvbox.view.activity.SeriesAllDataSingleActivity r0 = com.nst.iptvsmarterstvbox.view.activity.SeriesAllDataSingleActivity.this     // Catch: java.lang.Exception -> L60
                r7 = r7[r5]     // Catch: java.lang.Exception -> L60
                java.lang.String r7 = r0.a2(r7)     // Catch: java.lang.Exception -> L60
                return r7
            L49:
                com.nst.iptvsmarterstvbox.view.activity.SeriesAllDataSingleActivity r7 = com.nst.iptvsmarterstvbox.view.activity.SeriesAllDataSingleActivity.this     // Catch: java.lang.Exception -> L60
                java.lang.String r7 = com.nst.iptvsmarterstvbox.view.activity.SeriesAllDataSingleActivity.K1(r7)     // Catch: java.lang.Exception -> L60
                return r7
            L50:
                com.nst.iptvsmarterstvbox.view.activity.SeriesAllDataSingleActivity r0 = com.nst.iptvsmarterstvbox.view.activity.SeriesAllDataSingleActivity.this     // Catch: java.lang.Exception -> L60
                r7 = r7[r5]     // Catch: java.lang.Exception -> L60
                java.lang.String r7 = r0.V1(r7)     // Catch: java.lang.Exception -> L60
                return r7
            L59:
                com.nst.iptvsmarterstvbox.view.activity.SeriesAllDataSingleActivity r7 = com.nst.iptvsmarterstvbox.view.activity.SeriesAllDataSingleActivity.this     // Catch: java.lang.Exception -> L60
                java.lang.String r7 = r7.X1()     // Catch: java.lang.Exception -> L60
                return r7
            L60:
                java.lang.String r7 = "error"
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SeriesAllDataSingleActivity.i.doInBackground(java.lang.String[]):java.lang.String");
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            SeriesAllDataSingleActivity.this.g2();
            str.hashCode();
            switch (str) {
                case "get_all":
                    SeriesAllDataSingleActivity.this.v1(false);
                    break;
                case "get_fav":
                    SeriesAllDataSingleActivity.this.T1();
                    break;
                case "get_recent_watch":
                    SeriesAllDataSingleActivity.this.w1();
                    break;
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            SeriesAllDataSingleActivity.this.F2();
            SeriesAllDataSingleActivity.this.h2();
            SeriesAllDataSingleActivity.this.f2();
        }
    }

    public class j implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f32050a;

        public j(View view) {
            this.f32050a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f32050a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f32050a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f32050a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            Resources resources;
            int i9;
            if (!z9) {
                if (z9) {
                    return;
                }
                View view2 = this.f32050a;
                if (view2 == null || view2.getTag() == null || !this.f32050a.getTag().equals("1")) {
                    View view3 = this.f32050a;
                    if (view3 == null || view3.getTag() == null || !this.f32050a.getTag().equals("2")) {
                        View view4 = this.f32050a;
                        if (view4 == null || view4.getTag() == null || !this.f32050a.getTag().equals("3")) {
                            b(1.0f);
                            c(1.0f);
                            a(z9);
                            return;
                        }
                    } else {
                        resources = SeriesAllDataSingleActivity.this.getResources();
                        i9 = a7.c.f11858i;
                    }
                }
                view.setBackgroundResource(0);
                return;
            }
            View view5 = this.f32050a;
            if (view5 == null || view5.getTag() == null || !this.f32050a.getTag().equals("1")) {
                View view6 = this.f32050a;
                if (view6 == null || view6.getTag() == null || !this.f32050a.getTag().equals("2")) {
                    View view7 = this.f32050a;
                    if (view7 == null || view7.getTag() == null || !this.f32050a.getTag().equals("3")) {
                        b(1.15f);
                        c(1.15f);
                        return;
                    }
                    resources = SeriesAllDataSingleActivity.this.getResources();
                    i9 = a7.e.f11946O0;
                } else {
                    resources = SeriesAllDataSingleActivity.this.getResources();
                    i9 = a7.c.f11868s;
                }
            } else {
                resources = SeriesAllDataSingleActivity.this.getResources();
                i9 = a7.e.f11946O0;
            }
            view.setBackground(resources.getDrawable(i9));
        }
    }

    public class k extends AsyncTask {
        public k() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return SeriesAllDataSingleActivity.this.A2();
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            SeriesAllDataSingleActivity.this.C2();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r0.size() >= 3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        r3 = ((com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel) r5.f32004r.get(2)).getLiveStreamCategoryID();
        r0 = r5.f32004r.get(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r0.size() >= 3) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C2() {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.f32004r
            if (r0 == 0) goto Lc2
            int r0 = r0.size()
            if (r0 <= 0) goto Lc2
            java.util.ArrayList r0 = r5.f32006s
            if (r0 == 0) goto L11
            r0.clear()
        L11:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.f32006s = r0
            java.util.ArrayList r1 = r5.f32004r
            r0.addAll(r1)
            android.content.Context r0 = r5.f31977d
            java.lang.String r0 = com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler.getCurrentAPPType(r0)
            java.lang.String r1 = "m3u"
            boolean r0 = r0.equals(r1)
            r1 = 3
            r2 = 2
            java.lang.String r3 = "0"
            if (r0 == 0) goto L62
            java.util.ArrayList r0 = r5.f32004r
            if (r0 == 0) goto L55
            int r0 = r0.size()
            if (r0 < r1) goto L55
        L39:
            java.util.ArrayList r0 = r5.f32004r
            java.lang.Object r0 = r0.get(r2)
            com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel r0 = (com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel) r0
            java.lang.String r3 = r0.getLiveStreamCategoryID()
            java.util.ArrayList r0 = r5.f32004r
            java.lang.Object r0 = r0.get(r2)
        L4b:
            com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel r0 = (com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel) r0
            java.lang.String r0 = r0.getLiveStreamCategoryName()
        L51:
            r5.r2(r3, r0)
            goto L9a
        L55:
            android.content.Context r0 = r5.f31977d
            android.content.res.Resources r0 = r0.getResources()
            int r1 = a7.j.f13426x
            java.lang.String r0 = r0.getString(r1)
            goto L51
        L62:
            android.content.Context r0 = r5.f31977d
            java.lang.String r0 = com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler.getCurrentAPPType(r0)
            java.lang.String r4 = "stalker_api"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L7b
            java.util.ArrayList r0 = r5.f32004r
            if (r0 == 0) goto L55
            int r0 = r0.size()
            if (r0 < r1) goto L55
            goto L39
        L7b:
            java.util.ArrayList r0 = r5.f32004r
            if (r0 == 0) goto L55
            int r0 = r0.size()
            r1 = 5
            if (r0 < r1) goto L55
            java.util.ArrayList r0 = r5.f32004r
            r1 = 4
            java.lang.Object r0 = r0.get(r1)
            com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel r0 = (com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel) r0
            java.lang.String r3 = r0.getLiveStreamCategoryID()
            java.util.ArrayList r0 = r5.f32004r
            java.lang.Object r0 = r0.get(r1)
            goto L4b
        L9a:
            java.util.ArrayList r0 = r5.f32006s
            if (r0 == 0) goto Lad
            int r0 = r0.size()
            if (r0 <= 0) goto Lad
            com.nst.iptvsmarterstvbox.model.SeriesAllCategoriesSingleton r0 = com.nst.iptvsmarterstvbox.model.SeriesAllCategoriesSingleton.getInstance()
            java.util.ArrayList r1 = r5.f32006s
            r0.setSeriesCategoriesList(r1)
        Lad:
            q7.Y r0 = new q7.Y
            android.content.Context r1 = r5.f31977d
            r0.<init>(r1, r3)
            r5.f31994m = r0
            androidx.recyclerview.widget.RecyclerView r1 = r5.f31971U
            r1.setAdapter(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r5.f31971U
            androidx.recyclerview.widget.LinearLayoutManager r1 = r5.f31990k
            r0.setLayoutManager(r1)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SeriesAllDataSingleActivity.C2():void");
    }

    private void D2() {
        try {
            new b(this).show();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F2() {
        LinearLayout linearLayout = this.f31974X;
        if (linearLayout == null || linearLayout.getVisibility() != 8) {
            return;
        }
        this.f31974X.setVisibility(0);
    }

    private void H2() {
        if (this.f31966P.getVisibility() == 8) {
            this.f31968R.setVisibility(8);
            if (!new C2858a(this.f31977d).A().equals(AbstractC2237a.f44453K0)) {
                this.f31991k0.setVisibility(8);
            }
            this.f31970T.startAnimation(this.f31986i);
            this.f31970T.setVisibility(0);
            this.f31970T.requestFocus();
            this.f31966P.startAnimation(this.f31978e);
            this.f31966P.setVisibility(0);
            this.f31967Q.startAnimation(this.f31982g);
            this.f31967Q.setVisibility(0);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f31977d, 5);
            this.f31988j = gridLayoutManager;
            this.f31972V.setLayoutManager(gridLayoutManager);
            if (this.f31992l != null) {
                this.f31972V.m1(this.f31963M);
                this.f31963M = -1;
            }
        }
    }

    private void I2(Activity activity) {
        try {
            new d(this, activity).show();
        } catch (Exception unused) {
        }
    }

    private void L2() {
        this.f31978e = AnimationUtils.loadAnimation(this.f31977d, a7.b.f11824b);
        this.f31980f = AnimationUtils.loadAnimation(this.f31977d, a7.b.f11825c);
        this.f31982g = AnimationUtils.loadAnimation(this.f31977d, a7.b.f11829g);
        this.f31984h = AnimationUtils.loadAnimation(this.f31977d, a7.b.f11827e);
        this.f31986i = AnimationUtils.loadAnimation(this.f31977d, a7.b.f11823a);
    }

    private void Q1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private void S1() {
        EditText editText = this.f31979e0;
        if (editText != null) {
            editText.setText("");
            this.f31979e0.clearFocus();
        }
    }

    private void U1() {
        ImageView imageView = this.f31970T;
        imageView.setOnFocusChangeListener(new j(imageView));
        RelativeLayout relativeLayout = this.f31969S;
        relativeLayout.setOnFocusChangeListener(new j(relativeLayout));
        ImageView imageView2 = this.f31968R;
        imageView2.setOnFocusChangeListener(new j(imageView2));
    }

    private ArrayList Y1() {
        ArrayList<PasswordStatusDBModel> allPasswordStatus = this.f32000p.getAllPasswordStatus(SharepreferenceDBHandler.getUserID(this.f31977d));
        this.f32002q = allPasswordStatus;
        if (allPasswordStatus != null) {
            for (PasswordStatusDBModel passwordStatusDBModel : allPasswordStatus) {
                if (passwordStatusDBModel.getPasswordStatus().equals("1")) {
                    this.f32012v.add(passwordStatusDBModel.getPasswordStatusCategoryId());
                }
            }
        }
        return this.f32012v;
    }

    private ArrayList b2(ArrayList arrayList, ArrayList arrayList2) {
        this.f31952B = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FavouriteDBModel favouriteDBModel = (FavouriteDBModel) it.next();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    this.f31952B.add(favouriteDBModel);
                    break;
                }
                String str = (String) it2.next();
                if (favouriteDBModel.getCategoryID() == null || !favouriteDBModel.getCategoryID().equals(str)) {
                }
            }
        }
        return this.f31952B;
    }

    private ArrayList c2(ArrayList arrayList, ArrayList arrayList2) {
        this.f31953C = new ArrayList();
        if (arrayList == null) {
            return null;
        }
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                FavouriteM3UModel favouriteM3UModel = (FavouriteM3UModel) it.next();
                if (arrayList2 != null) {
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            this.f31953C.add(favouriteM3UModel);
                            break;
                        }
                        if (favouriteM3UModel.getCategoryID().equals((String) it2.next())) {
                            break;
                        }
                    }
                }
            }
            return this.f31953C;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void d2(Activity activity) {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus == null) {
                currentFocus = new View(activity);
            }
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private void i2() {
        if (this.f31966P.getVisibility() == 0) {
            d2(this);
            this.f31967Q.startAnimation(this.f31984h);
            this.f31967Q.setVisibility(0);
            this.f31966P.startAnimation(this.f31980f);
            this.f31966P.setVisibility(8);
            this.f31968R.startAnimation(this.f31986i);
            this.f31968R.setVisibility(0);
            if (!new C2858a(this.f31977d).A().equals(AbstractC2237a.f44453K0)) {
                this.f31991k0.setVisibility(0);
            }
            this.f31968R.requestFocus();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f31977d, 7);
            this.f31988j = gridLayoutManager;
            this.f31972V.setLayoutManager(gridLayoutManager);
        }
    }

    private void k2() {
        this.f32007s0 = new Handler();
        this.f31996n = new ArrayList();
        this.f31998o = new ArrayList();
        this.f32000p = new LiveStreamDBHandler(this.f31977d);
        this.f32002q = new ArrayList();
        this.f32006s = new ArrayList();
        this.f32004r = new ArrayList();
        this.f32008t = new SeriesRecentWatchDatabase(this.f31977d);
        this.f31990k = new LinearLayoutManager(this.f31977d);
        this.f32014w = new DatabaseHandler(this.f31977d);
        this.f32011u0 = new n7.e(this, this.f31977d);
        this.f32017z = new ArrayList();
        this.f31951A = new ArrayList();
        SharedPreferences sharedPreferences = getSharedPreferences("showhidemoviename", 0);
        this.f31956F = sharedPreferences;
        this.f31957G = sharedPreferences.edit();
        w.y(this.f31977d);
        if (new C2858a(this.f31977d).A().equals(AbstractC2237a.f44453K0)) {
            this.f31989j0.setVisibility(8);
        }
        U1();
        L2();
        v2();
        w2();
        if (!SharepreferenceDBHandler.getCurrentAPPType(this.f31977d).equals("stalker_api")) {
            p2();
            return;
        }
        try {
            this.f31997n0 = SharepreferenceDBHandler.getStalkerToken(this.f31977d);
            String loggedInMacAddress = SharepreferenceDBHandler.getLoggedInMacAddress(this.f31977d);
            this.f31995m0 = loggedInMacAddress;
            this.f32011u0.f(loggedInMacAddress, this.f31997n0, 0);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public static /* synthetic */ int l2(SeriesDBModel seriesDBModel, SeriesDBModel seriesDBModel2) {
        float f9;
        float f10 = 0.0f;
        try {
            f9 = Float.parseFloat(seriesDBModel2.getrating());
        } catch (Exception e9) {
            e9.printStackTrace();
            f9 = 0.0f;
        }
        try {
            f10 = Float.parseFloat(seriesDBModel.getrating());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return Float.compare(f9, f10);
    }

    private boolean m2() {
        EditText editText = this.f31979e0;
        return editText != null && editText.getText().toString().length() > 0;
    }

    private void q2() {
        List listA = Listsingleton.b().a();
        Dialog dialog = new Dialog(this, a7.k.f13462g);
        dialog.requestWindowFeature(1);
        dialog.setContentView(a7.g.f12682N1);
        dialog.getWindow().setBackgroundDrawable(null);
        dialog.getWindow().setLayout(-1, -2);
        dialog.setCancelable(false);
        ImageView imageView = (ImageView) dialog.findViewById(a7.f.f12201L4);
        ImageView imageView2 = (ImageView) dialog.findViewById(a7.f.f12308W4);
        this.f31965O = (LinearLayout) dialog.findViewById(a7.f.f12114C7);
        imageView2.setOnClickListener(new g(dialog));
        this.f31965O.setOnClickListener(new h(dialog));
        imageView2.setOnFocusChangeListener(new w.k((View) imageView2, (Activity) this));
        imageView2.setOnFocusChangeListener(new c(imageView2));
        imageView2.setNextFocusUpId(a7.f.f12308W4);
        imageView2.setNextFocusDownId(a7.f.f12308W4);
        imageView2.setNextFocusRightId(a7.f.f12308W4);
        imageView2.setNextFocusLeftId(a7.f.f12308W4);
        imageView2.requestFocus();
        if (listA != null) {
            try {
                if (listA.size() > 0) {
                    if (listA.size() > AbstractC2237a.f44516k1) {
                        t.q(this.f31977d).l((String) listA.get(AbstractC2237a.f44516k1)).g(imageView);
                        AbstractC2237a.f44516k1++;
                    } else {
                        t.q(this.f31977d).l((String) listA.get(0)).g(imageView);
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

    private void v2() {
        this.f31970T.setOnClickListener(this);
        this.f31968R.setOnClickListener(this);
        this.f31987i0.setOnClickListener(this);
        this.f31969S.setOnClickListener(this);
        this.f31989j0.setOnClickListener(this);
        this.f31991k0.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w1() {
        List list = this.f31955E;
        if (list == null || list.size() <= 0) {
            SeriesAllCategoriesSingleton.getInstance().setContinueWatchingList(null);
            Menu menu = this.f31958H;
            if (menu != null) {
                menu.getItem(1).getSubMenu().findItem(a7.f.Db).setVisible(false);
            }
            Z z9 = new Z(this.f31977d, "continue_watching", this.f31963M);
            this.f31992l = z9;
            z9.E1(null);
            this.f31972V.setAdapter(this.f31992l);
            E2(getResources().getString(a7.j.f12968C4));
            return;
        }
        SeriesAllCategoriesSingleton.getInstance().setContinueWatchingList(this.f31955E);
        if (this.f31958H != null) {
            List list2 = this.f31955E;
            if (list2 == null || list2.size() <= 0) {
                this.f31958H.getItem(1).getSubMenu().findItem(a7.f.Db).setVisible(false);
            } else {
                this.f31958H.getItem(1).getSubMenu().findItem(a7.f.Db).setVisible(true);
            }
        }
        Z z10 = new Z(this.f31977d, "continue_watching", this.f31963M);
        this.f31992l = z10;
        z10.E1(null);
        this.f31972V.setAdapter(this.f31992l);
        RelativeLayout relativeLayout = this.f31966P;
        this.f31988j = (relativeLayout == null || relativeLayout.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
        this.f31972V.setLayoutManager(this.f31988j);
        G2();
    }

    private void w2() {
        EditText editText = this.f31979e0;
        if (editText != null) {
            editText.addTextChangedListener(new a());
        }
    }

    private void z2(String str) {
        Y y9 = this.f31994m;
        if (y9 != null) {
            y9.x0(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7 A[Catch: Exception -> 0x000c, NullPointerException -> 0x000f, TRY_ENTER, TryCatch #2 {NullPointerException -> 0x000f, Exception -> 0x000c, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x0008, B:11:0x0012, B:14:0x0070, B:17:0x007e, B:18:0x009b, B:23:0x00c9, B:26:0x00e7, B:27:0x012b, B:28:0x012f, B:30:0x013d, B:19:0x009f, B:22:0x00ab, B:31:0x0182), top: B:35:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012f A[Catch: Exception -> 0x000c, NullPointerException -> 0x000f, TryCatch #2 {NullPointerException -> 0x000f, Exception -> 0x000c, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x0008, B:11:0x0012, B:14:0x0070, B:17:0x007e, B:18:0x009b, B:23:0x00c9, B:26:0x00e7, B:27:0x012b, B:28:0x012f, B:30:0x013d, B:19:0x009f, B:22:0x00ab, B:31:0x0182), top: B:35:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean A2() {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SeriesAllDataSingleActivity.A2():java.lang.Boolean");
    }

    public void B2(String str) {
        TextView textView = this.f31976Z;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void E2(String str) {
        TextView textView = this.f31975Y;
        if (textView != null) {
            textView.setText(str);
            this.f31975Y.setVisibility(0);
        }
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

    public void G2() {
        LinearLayout linearLayout = this.f31973W;
        if (linearLayout == null || linearLayout.getVisibility() != 8) {
            return;
        }
        this.f31973W.setVisibility(0);
    }

    @Override // z7.g
    public void H(String str) {
    }

    @Override // z7.g
    public void I(m0.x xVar, int i9) {
    }

    public final void J2() {
        try {
            this.f32011u0.k(this.f31995m0, this.f31997n0, this.f31961K.equals("0") ? "*" : this.f31961K, String.valueOf(this.f31999o0));
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void K2() {
        try {
            this.f32011u0.m(this.f31995m0, this.f31997n0, String.valueOf(this.f31999o0));
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // z7.g
    public void M(StalkerGetAdCallback stalkerGetAdCallback, int i9) {
        p2();
    }

    @Override // z7.g
    public void O(Z.E e9, int i9) {
    }

    @Override // z7.g
    public void P0(String str) {
    }

    public boolean R1() {
        Z z9 = this.f31992l;
        if (z9 != null) {
            return z9.q1();
        }
        return false;
    }

    public void T1() {
        try {
            ArrayList arrayList = this.f31954D;
            if (arrayList == null || arrayList.size() <= 0) {
                SeriesAllCategoriesSingleton.getInstance().setSeriesList(null);
                Z z9 = new Z(this.f31977d, "series", this.f31963M);
                this.f31992l = z9;
                this.f31972V.setAdapter(z9);
                E2(getResources().getString(a7.j.f13331n4));
                return;
            }
            SeriesAllCategoriesSingleton.getInstance().setSeriesList(this.f31954D);
            Z z10 = new Z(this.f31977d, "series", this.f31963M);
            this.f31992l = z10;
            this.f31972V.setAdapter(z10);
            RelativeLayout relativeLayout = this.f31966P;
            this.f31988j = (relativeLayout == null || relativeLayout.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
            this.f31972V.setLayoutManager(this.f31988j);
            G2();
        } catch (Exception unused) {
        }
    }

    @Override // z7.g
    public void U(StalkerLiveFavIdsCallback stalkerLiveFavIdsCallback) {
    }

    @Override // z7.g
    public void V(StalkerProfilesCallback stalkerProfilesCallback) {
    }

    @Override // z7.g
    public void V0(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, m0.x xVar, int i9) {
    }

    public String V1(String str) {
        try {
            this.f32015x = new ArrayList();
            this.f31996n = new ArrayList();
            this.f32016y = new ArrayList();
            this.f32017z = SharepreferenceDBHandler.getCurrentAPPType(this.f31977d).equals("m3u") ? this.f32000p.getAllSeriesStreamsWithCategoryIdM3U(str) : SharepreferenceDBHandler.getCurrentAPPType(this.f31977d).equals("onestream_api") ? this.f32000p.getOneStreamAllSeriesStreamsWithCategoryId(str) : this.f32000p.getAllSeriesStreamsWithCategoryId(str);
            return "get_all";
        } catch (Exception e9) {
            e9.printStackTrace();
            return "get_all";
        }
    }

    public void W1() {
        if (Listsingleton.b().a() == null || Listsingleton.b().a().size() <= 0) {
            return;
        }
        AbstractC2237a.f44510i1 = true;
        q2();
    }

    public String X1() {
        ArrayList arrayList;
        SeriesDBModel seriesStreamsWithSeriesId;
        ArrayList arrayList2;
        try {
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f31977d).equals("m3u")) {
                new ArrayList();
                this.f31954D.clear();
                ArrayList<FavouriteM3UModel> favouriteM3U = this.f32000p.getFavouriteM3U("series");
                if (this.f32012v != null) {
                    this.f32012v = Y1();
                }
                ArrayList arrayList3 = this.f32012v;
                if (arrayList3 != null && arrayList3.size() > 0 && favouriteM3U != null && favouriteM3U.size() > 0) {
                    favouriteM3U = c2(favouriteM3U, this.f32012v);
                }
                if (favouriteM3U == null || favouriteM3U.size() <= 0) {
                    return "get_fav";
                }
                for (FavouriteM3UModel favouriteM3UModel : favouriteM3U) {
                    SeriesDBModel m3UFavouriteRowSeries = this.f32000p.getM3UFavouriteRowSeries(favouriteM3UModel.getCategoryID(), favouriteM3UModel.getUrl(), favouriteM3UModel.getTimestamp());
                    if (m3UFavouriteRowSeries != null) {
                        this.f31954D.add(m3UFavouriteRowSeries);
                    }
                }
                return "get_fav";
            }
            new ArrayList();
            this.f31954D.clear();
            ArrayList<FavouriteDBModel> allFavourites = this.f32014w.getAllFavourites("series", SharepreferenceDBHandler.getUserID(this.f31977d));
            if (this.f32012v != null) {
                this.f32012v = Y1();
            }
            ArrayList arrayList4 = this.f32012v;
            if (arrayList4 != null && arrayList4.size() > 0 && allFavourites != null && allFavourites.size() > 0) {
                allFavourites = b2(allFavourites, this.f32012v);
            }
            if (allFavourites == null || allFavourites.size() <= 0) {
                return "get_fav";
            }
            for (FavouriteDBModel favouriteDBModel : allFavourites) {
                if (SharepreferenceDBHandler.getCurrentAPPType(this.f31977d).equals("onestream_api")) {
                    seriesStreamsWithSeriesId = this.f32000p.getSeriesStreamsWithSeriesId(String.valueOf(favouriteDBModel.getStreamIDOneStream()));
                    if (seriesStreamsWithSeriesId != null) {
                        arrayList2 = this.f31954D;
                        arrayList2.add(seriesStreamsWithSeriesId);
                    }
                } else {
                    seriesStreamsWithSeriesId = this.f32000p.getSeriesStreamsWithSeriesId(String.valueOf(favouriteDBModel.getStreamID()));
                    if (seriesStreamsWithSeriesId != null) {
                        arrayList2 = this.f31954D;
                        arrayList2.add(seriesStreamsWithSeriesId);
                    }
                }
            }
            if (!SharepreferenceDBHandler.getSeriesSubCatSort(this.f31977d).equalsIgnoreCase("6") || (arrayList = this.f31954D) == null || arrayList.size() <= 1) {
                return "get_fav";
            }
            Collections.sort(this.f31954D, new Comparator() { // from class: p7.s0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return SeriesAllDataSingleActivity.l2((SeriesDBModel) obj, (SeriesDBModel) obj2);
                }
            });
            return "get_fav";
        } catch (Exception e9) {
            e9.printStackTrace();
            return "get_fav";
        }
    }

    public final String Z1() {
        this.f32012v = new ArrayList();
        new ArrayList();
        this.f31955E = new ArrayList();
        ArrayList<GetEpisdoeDetailsCallback> allSeriesContiueWatching = this.f32008t.getAllSeriesContiueWatching("getalldata", "1");
        if (this.f32000p.getParentalStatusCount(SharepreferenceDBHandler.getUserID(this.f31977d)) <= 0) {
            this.f31955E = allSeriesContiueWatching;
            return "get_recent_watch";
        }
        this.f32012v = Y1();
        for (GetEpisdoeDetailsCallback getEpisdoeDetailsCallback : allSeriesContiueWatching) {
            Iterator it = this.f32012v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.f31955E.add(getEpisdoeDetailsCallback);
                    break;
                }
                String str = (String) it.next();
                if (getEpisdoeDetailsCallback.getCategoryId() == null || !getEpisdoeDetailsCallback.getCategoryId().equals(str)) {
                }
            }
        }
        return "get_recent_watch";
    }

    public String a2(String str) {
        try {
            this.f32015x = new ArrayList();
            this.f31996n = new ArrayList();
            this.f32016y = new ArrayList();
            this.f32017z = this.f32000p.getAllSeriesStreamsWithCategoryId(str);
            return "get_all";
        } catch (Exception unused) {
            return "get_all";
        }
    }

    @Override // z7.g
    public void c(String str) {
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
        LinearLayout linearLayout = this.f31981f0;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    @Override // z7.g
    public void f0(StalkerGetGenresCallback stalkerGetGenresCallback) {
    }

    public void f2() {
        TextView textView = this.f31975Y;
        if (textView == null || textView.getVisibility() != 0) {
            return;
        }
        this.f31975Y.setVisibility(8);
    }

    public void g2() {
        LinearLayout linearLayout = this.f31974X;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        this.f31974X.setVisibility(8);
    }

    public void h2() {
        LinearLayout linearLayout = this.f31973W;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        this.f31973W.setVisibility(8);
    }

    @Override // z7.g
    public void i(StalkerGetAllChannelsCallback stalkerGetAllChannelsCallback) {
    }

    @Override // z7.g
    public void j(StalkerGetVodCategoriesCallback stalkerGetVodCategoriesCallback) {
    }

    public void j2() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    public boolean n2() {
        EditText editText = this.f31979e0;
        if (editText != null) {
            return editText.isFocused();
        }
        return false;
    }

    @Override // z7.g
    public void o0(String str) {
    }

    public void o2(int i9, String str) {
        SeriesDBModel seriesDBModel;
        int i10;
        Log.e("honey", "seriesid: " + i9);
        Log.e("honey", "size: " + this.f31951A.size());
        if (i9 != 0) {
            try {
                ArrayList arrayList = this.f31951A;
                if (arrayList == null || arrayList.size() <= 0) {
                    return;
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= this.f31951A.size()) {
                        i11 = -1;
                        break;
                    } else if (((SeriesDBModel) this.f31951A.get(i11)).getseriesID() == i9) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (str.equals("add")) {
                    if (i11 == -1) {
                        return;
                    }
                    seriesDBModel = (SeriesDBModel) this.f31951A.get(i11);
                    i10 = 1;
                } else {
                    if (i11 == -1) {
                        return;
                    }
                    seriesDBModel = (SeriesDBModel) this.f31951A.get(i11);
                    i10 = 0;
                }
                seriesDBModel.setFav(i10);
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (m2()) {
            S1();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == a7.f.f12290U4) {
            i2();
            return;
        }
        if (view.getId() == a7.f.f12151G4 || view.getId() == a7.f.f12161H4) {
            onBackPressed();
            return;
        }
        if (view.getId() == a7.f.f12456l5) {
            this.f31963M = -1;
            H2();
        } else if (view.getId() == a7.f.Xa) {
            w.j(this.f31977d);
        } else if (view.getId() == a7.f.f0if) {
            this.f31979e0.requestFocus();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j2();
        Q1();
        this.f31977d = this;
        if (SharepreferenceDBHandler.getCurrentAPPType(this).equals("stalker_api")) {
            setContentView(a7.g.f12675M0);
            this.f31993l0 = (NestedScrollView) findViewById(a7.f.f12476n4);
        } else {
            setContentView(a7.g.f12669L0);
        }
        this.f31966P = (RelativeLayout) findViewById(a7.f.ye);
        this.f31967Q = (RelativeLayout) findViewById(a7.f.hf);
        this.f31968R = (ImageView) findViewById(a7.f.f12456l5);
        this.f31969S = (RelativeLayout) findViewById(a7.f.f0if);
        this.f31970T = (ImageView) findViewById(a7.f.f12290U4);
        this.f31971U = (RecyclerView) findViewById(a7.f.Fd);
        this.f31972V = (RecyclerView) findViewById(a7.f.Dd);
        this.f31973W = (LinearLayout) findViewById(a7.f.W9);
        this.f31974X = (LinearLayout) findViewById(a7.f.f12175I8);
        this.f31975Y = (TextView) findViewById(a7.f.wk);
        this.f31976Z = (TextView) findViewById(a7.f.Zj);
        this.f31979e0 = (EditText) findViewById(a7.f.f12464m3);
        this.f31981f0 = (LinearLayout) findViewById(a7.f.W8);
        this.f31983g0 = (Toolbar) findViewById(a7.f.kh);
        this.f31985h0 = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f31987i0 = (ImageView) findViewById(a7.f.Xa);
        this.f31989j0 = (ImageView) findViewById(a7.f.f12151G4);
        this.f31991k0 = (ImageView) findViewById(a7.f.f12161H4);
        Toolbar toolbar = this.f31983g0;
        if (toolbar != null) {
            r1(toolbar);
        }
        AbstractC2237a.f44457M0 = "-1";
        k2();
        if (AbstractC2237a.f44475V0.booleanValue() && AbstractC2237a.f44498e1.equalsIgnoreCase("1")) {
            if (SharepreferenceDBHandler.getEventAdsView(this) < AbstractC2237a.f44501f1) {
                SharepreferenceDBHandler.setEventAdsView(SharepreferenceDBHandler.getEventAdsView(this) + 1, this);
            } else {
                SharepreferenceDBHandler.setEventAdsView(0, this);
                W1();
            }
        }
        this.f32013v0 = true;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        Toolbar toolbar = this.f31983g0;
        if (toolbar != null) {
            toolbar.x(a7.h.f12937t);
            SharedPreferences sharedPreferences = this.f31956F;
            if (sharedPreferences != null) {
                if (sharedPreferences.getInt("series", 1) == 1) {
                    menu.getItem(1).getSubMenu().findItem(a7.f.f12579x6).setVisible(false);
                    menu.getItem(1).getSubMenu().findItem(a7.f.f12539t6).setVisible(true);
                } else {
                    menu.getItem(1).getSubMenu().findItem(a7.f.f12579x6).setVisible(true);
                    menu.getItem(1).getSubMenu().findItem(a7.f.f12539t6).setVisible(false);
                }
            }
            this.f31958H = menu;
            TextView textView = this.f31976Z;
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (this.f31961K.equals("-5") || this.f31961K.equals("-4") || SharepreferenceDBHandler.getCurrentAPPType(this.f31977d).equals("stalker_api")) {
                this.f31958H.getItem(1).getSubMenu().findItem(a7.f.mb).setVisible(false);
            } else {
                this.f31958H.getItem(1).getSubMenu().findItem(a7.f.mb).setVisible(true);
            }
            if (this.f31961K.equals("-4")) {
                this.f31958H.getItem(1).getSubMenu().findItem(a7.f.Db).setVisible(true);
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f31977d).equals("m3u") || SharepreferenceDBHandler.getCurrentAPPType(this.f31977d).equals("onestream_api")) {
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
        AsyncTask asyncTask = w.f44700m;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            return;
        }
        w.f44700m.cancel(true);
    }

    @Override // androidx.appcompat.app.b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        Z z9;
        if (i9 != 21) {
            return super.onKeyDown(i9, keyEvent);
        }
        if (this.f31966P.getVisibility() != 8 || (z9 = this.f31992l) == null) {
            return false;
        }
        int iS1 = z9.s1();
        this.f31963M = iS1;
        if (iS1 % 7 != 0) {
            return false;
        }
        H2();
        return false;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        this.f31959I = menuItem;
        this.f31983g0.e();
        int itemId = menuItem.getItemId();
        if (itemId == a7.f.f12400g) {
            try {
                SearchView searchView = (SearchView) menuItem.getActionView();
                this.f31960J = searchView;
                if (searchView != null) {
                    searchView.setQueryHint(getResources().getString(a7.j.f12990E6));
                    this.f31960J.setIconifiedByDefault(false);
                    ImageView imageView = (ImageView) this.f31960J.findViewById(a7.f.Uf);
                    ((ImageView) this.f31960J.findViewById(a7.f.Vf)).setImageResource(a7.e.f12032m1);
                    imageView.setImageResource(a7.e.f12032m1);
                    imageView.setPadding(15, 15, 15, 15);
                    imageView.setBackground(null);
                    this.f31960J.setOnQueryTextListener(new f());
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        if (itemId == a7.f.gb) {
            w.A0(this.f31977d);
        }
        if (itemId == a7.f.mb) {
            I2(this);
        }
        if (itemId == a7.f.f12579x6) {
            SharedPreferences.Editor editor = this.f31957G;
            if (editor != null) {
                editor.putInt("series", 1);
                this.f31957G.commit();
            }
            Menu menu = this.f31958H;
            if (menu != null) {
                menu.getItem(1).getSubMenu().findItem(a7.f.f12579x6).setVisible(false);
                this.f31958H.getItem(1).getSubMenu().findItem(a7.f.f12539t6).setVisible(true);
            }
            u2();
        }
        if (itemId == a7.f.f12539t6) {
            SharedPreferences.Editor editor2 = this.f31957G;
            if (editor2 != null) {
                editor2.putInt("series", 0);
                this.f31957G.commit();
            }
            Menu menu2 = this.f31958H;
            if (menu2 != null) {
                menu2.getItem(1).getSubMenu().findItem(a7.f.f12579x6).setVisible(true);
                this.f31958H.getItem(1).getSubMenu().findItem(a7.f.f12539t6).setVisible(false);
            }
            u2();
        }
        if (itemId == a7.f.Db && SeriesAllCategoriesSingleton.getInstance().getContinueWatchingList() != null && SeriesAllCategoriesSingleton.getInstance().getContinueWatchingList().size() > 0) {
            D2();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        j2();
        super.onResume();
        if (this.f32013v0) {
            this.f32013v0 = false;
        } else {
            t2();
        }
        w.z0(this.f31977d);
        if (this.f31961K.equals("-4")) {
            y2();
        } else {
            u2();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        j2();
    }

    public void p2() {
        new k().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    @Override // z7.g
    public void q(StalkerGetVODByCatCallback stalkerGetVODByCatCallback) {
        SearchView searchView;
        ArrayList arrayList;
        SearchView searchView2;
        if (stalkerGetVODByCatCallback == null || stalkerGetVODByCatCallback.getJs() == null || stalkerGetVODByCatCallback.getJs().getData() == null || stalkerGetVODByCatCallback.getJs().getData().size() <= 0) {
            try {
                searchView = this.f31960J;
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            int length = searchView != null ? searchView.getQuery().toString().length() : 0;
            if (length < 3) {
                try {
                    AbstractC2237a.f44457M0 = stalkerGetVODByCatCallback.getJs().getTotalItems().toString();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        } else {
            this.f32015x = new ArrayList();
            this.f31996n = new ArrayList();
            this.f32016y = new ArrayList();
            try {
                searchView2 = this.f31960J;
            } catch (Exception unused) {
            }
            int length2 = searchView2 != null ? searchView2.getQuery().toString().length() : 0;
            if (length2 < 3) {
                try {
                    AbstractC2237a.f44457M0 = stalkerGetVODByCatCallback.getJs().getTotalItems().toString();
                } catch (Exception unused2) {
                }
            }
            this.f32001p0 = w.v(stalkerGetVODByCatCallback.getJs().getTotalItems().intValue(), stalkerGetVODByCatCallback.getJs().getMaxPageItems().intValue());
            for (int i9 = 0; i9 < stalkerGetVODByCatCallback.getJs().getData().size(); i9++) {
                SeriesDBModel seriesDBModel = new SeriesDBModel();
                seriesDBModel.setNum(stalkerGetVODByCatCallback.getJs().getData().get(i9).getId());
                seriesDBModel.setName(stalkerGetVODByCatCallback.getJs().getData().get(i9).getName());
                seriesDBModel.setStreamType("series");
                seriesDBModel.setseriesID(w.r0(stalkerGetVODByCatCallback.getJs().getData().get(i9).getId()));
                seriesDBModel.setcover(stalkerGetVODByCatCallback.getJs().getData().get(i9).getScreenshotUri());
                seriesDBModel.setreleaseDate(stalkerGetVODByCatCallback.getJs().getData().get(i9).getYear());
                seriesDBModel.setCategoryId(stalkerGetVODByCatCallback.getJs().getData().get(i9).getCategoryId());
                seriesDBModel.setFav(stalkerGetVODByCatCallback.getJs().getData().get(i9).getFav());
                seriesDBModel.setdirector(stalkerGetVODByCatCallback.getJs().getData().get(i9).getDirector());
                seriesDBModel.setcast(stalkerGetVODByCatCallback.getJs().getData().get(i9).getActors());
                seriesDBModel.setplot(stalkerGetVODByCatCallback.getJs().getData().get(i9).getDescription());
                seriesDBModel.setgenre(stalkerGetVODByCatCallback.getJs().getData().get(i9).getGenresStr());
                seriesDBModel.setCmd(stalkerGetVODByCatCallback.getJs().getData().get(i9).getCmd());
                seriesDBModel.setDurationMin(stalkerGetVODByCatCallback.getJs().getData().get(i9).getTime());
                seriesDBModel.setrating(stalkerGetVODByCatCallback.getJs().getData().get(i9).getRatingImdb().equals("N/A") ? "0" : stalkerGetVODByCatCallback.getJs().getData().get(i9).getRatingImdb());
                this.f32017z.add(seriesDBModel);
            }
            ArrayList arrayList2 = this.f32017z;
            if (arrayList2 != null && arrayList2.size() > 0 && (arrayList = this.f31951A) != null && arrayList.size() == 0) {
                this.f31951A.addAll(this.f32017z);
                this.f32005r0 = this.f32001p0;
            }
        }
        v1(false);
    }

    public void r2(String str, String str2) {
        AsyncTask asyncTaskExecuteOnExecutor;
        List<GetEpisdoeDetailsCallback> continueWatchingList;
        this.f31961K = str;
        this.f31962L = str2;
        B2(str2);
        z2(str);
        try {
            SearchView searchView = this.f31960J;
            if (searchView != null && this.f31959I != null) {
                searchView.d0("", false);
                this.f31959I.collapseActionView();
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        try {
            if (this.f31958H != null) {
                if (this.f31961K.equals("-5") || this.f31961K.equals("-4") || SharepreferenceDBHandler.getCurrentAPPType(this.f31977d).equals("stalker_api")) {
                    MenuItem menuItemFindItem = this.f31958H.getItem(1).getSubMenu().findItem(a7.f.mb);
                    menuItemFindItem.setVisible(false);
                    if (this.f31961K.equals("-4") || (continueWatchingList = SeriesAllCategoriesSingleton.getInstance().getContinueWatchingList()) == null || continueWatchingList.size() <= 0) {
                        menuItemFindItem.setVisible(false);
                    } else {
                        this.f31958H.getItem(1).getSubMenu().findItem(a7.f.Db).setVisible(true);
                    }
                } else {
                    this.f31958H.getItem(1).getSubMenu().findItem(a7.f.mb).setVisible(true);
                    MenuItem menuItemFindItem2 = this.f31961K.equals("-4") ? this.f31958H.getItem(1).getSubMenu().findItem(a7.f.Db) : this.f31958H.getItem(1).getSubMenu().findItem(a7.f.Db);
                    menuItemFindItem2.setVisible(false);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        str.hashCode();
        switch (str) {
            case "-1":
                if (!SharepreferenceDBHandler.getCurrentAPPType(this.f31977d).equals("stalker_api")) {
                    asyncTaskExecuteOnExecutor = new i().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_fav");
                    break;
                } else {
                    this.f32017z = new ArrayList();
                    this.f31951A = new ArrayList();
                    this.f31963M = 0;
                    this.f31964N = true;
                    this.f31999o0 = 1;
                    F2();
                    h2();
                    f2();
                    K2();
                    return;
                }
                break;
            case "-4":
                asyncTaskExecuteOnExecutor = new i().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_recent_watch");
                break;
            case "-5":
                asyncTaskExecuteOnExecutor = new i().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_recent_added", str);
                break;
            default:
                if (!SharepreferenceDBHandler.getCurrentAPPType(this.f31977d).equals("stalker_api")) {
                    asyncTaskExecuteOnExecutor = new i().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_all", str);
                    break;
                } else {
                    this.f32017z = new ArrayList();
                    this.f31951A = new ArrayList();
                    this.f31963M = 0;
                    this.f31964N = true;
                    this.f31999o0 = 1;
                    F2();
                    h2();
                    f2();
                    J2();
                    return;
                }
                break;
        }
        w.f44700m = asyncTaskExecuteOnExecutor;
    }

    public void s2() {
        LinearLayout linearLayout = this.f31981f0;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    public void t2() {
        Y y9 = this.f31994m;
        if (y9 != null) {
            y9.w();
        }
    }

    public void u2() {
        Z z9 = this.f31992l;
        if (z9 != null) {
            z9.w();
        }
    }

    @Override // z7.g
    public void v0(String str) {
    }

    public void v1(boolean z9) {
        Z z10;
        try {
            w.X();
            g2();
            this.f31963M = 0;
            ArrayList arrayList = this.f32017z;
            if (arrayList == null || arrayList.size() <= 0) {
                h2();
                SeriesAllCategoriesSingleton.getInstance().setSeriesList(null);
                Z z11 = new Z(this.f31977d, "series", this.f31963M);
                this.f31992l = z11;
                this.f31972V.setAdapter(z11);
                E2(getResources().getString(a7.j.f12958B4));
                if (SharepreferenceDBHandler.getCurrentAPPType(this.f31977d).equals("stalker_api")) {
                    t2();
                    return;
                }
                return;
            }
            SeriesAllCategoriesSingleton.getInstance().setSeriesList(this.f32017z);
            if (z9) {
                this.f31963M = -1;
            } else {
                this.f31963M = 0;
                if (!this.f31964N && (z10 = this.f31992l) != null) {
                    this.f31963M = z10.s1();
                }
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f31977d).equals("stalker_api")) {
                if (!z9) {
                    t2();
                }
                Z z12 = new Z(this.f31977d, "series", this.f31963M);
                this.f31992l = z12;
                this.f31972V.setAdapter(z12);
                RelativeLayout relativeLayout = this.f31966P;
                this.f31988j = (relativeLayout == null || relativeLayout.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
                this.f31972V.setLayoutManager(this.f31988j);
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f31993l0.setOnScrollChangeListener(new e());
                }
            } else {
                Z z13 = new Z(this.f31977d, "series", this.f31963M);
                this.f31992l = z13;
                this.f31972V.setAdapter(z13);
                RelativeLayout relativeLayout2 = this.f31966P;
                this.f31988j = (relativeLayout2 == null || relativeLayout2.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
                this.f31972V.setLayoutManager(this.f31988j);
            }
            G2();
        } catch (Exception unused) {
        }
    }

    public void x2() {
        Z z9 = this.f31992l;
        if (z9 != null) {
            z9.A1();
        }
    }

    @Override // z7.g
    public void y0(String str) {
    }

    public void y2() {
        w.f44700m = new i().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_recent_watch", "-4");
    }
}
