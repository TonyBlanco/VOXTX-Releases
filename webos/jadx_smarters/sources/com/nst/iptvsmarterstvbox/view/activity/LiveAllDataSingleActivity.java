package com.nst.iptvsmarterstvbox.view.activity;

import a7.k;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
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
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.model.DataBaseViewModel;
import com.nst.iptvsmarterstvbox.model.FavouriteDBModel;
import com.nst.iptvsmarterstvbox.model.FavouriteM3UModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.StalkerLiveFavIdsSingleton;
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
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.sbpfunction.singletonpushnotification.Listsingleton;
import com.squareup.picasso.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m7.AbstractC2237a;
import m7.w;
import q7.C2634s;
import q7.C2635t;
import q7.Z;
import q7.m0;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class LiveAllDataSingleActivity extends androidx.appcompat.app.b implements View.OnClickListener, z7.g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ArrayList f30426A;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public SharedPreferences f30429D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public SharedPreferences.Editor f30430E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Menu f30431F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public MenuItem f30432G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public SearchView f30433H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public n7.e f30437L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public RelativeLayout f30438M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public RelativeLayout f30439N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ImageView f30440O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public RelativeLayout f30441P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ImageView f30442Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public RecyclerView f30443R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public RecyclerView f30444S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public LinearLayout f30445T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public LinearLayout f30446U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f30447V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f30448W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public EditText f30449X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public LinearLayout f30450Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Toolbar f30451Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f30452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Animation f30453e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public AppBarLayout f30454e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Animation f30455f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ImageView f30456f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Animation f30457g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ImageView f30458g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Animation f30459h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ImageView f30460h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Animation f30461i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GridLayoutManager f30463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayoutManager f30465k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C2635t f30467l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C2634s f30469m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f30471n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public LinearLayout f30472n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f30473o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LiveStreamDBHandler f30475p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public DataBaseViewModel f30476p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f30477q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f30478q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f30479r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f30481s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public DatabaseHandler f30484v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f30485w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f30486x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f30487y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ArrayList f30488z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f30482t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f30483u = new ArrayList();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ArrayList f30427B = new ArrayList();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ArrayList f30428C = new ArrayList();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f30434I = "0";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public String f30435J = "0";

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f30436K = -1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public String f30462i0 = "";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public String f30464j0 = "0";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f30466k0 = "false";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public String f30468l0 = "";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public String f30470m0 = "";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f30474o0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public String f30480r0 = "";

    public class a extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f30489a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f30490c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f30491d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f30492e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f30493f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public LinearLayout f30494g;

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity$a$a, reason: collision with other inner class name */
        public class RunnableC0274a implements Runnable {
            public RunnableC0274a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                LiveAllDataSingleActivity.this.j2();
            }
        }

        public class b implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f30497a;

            public b(View view) {
                this.f30497a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f30497a;
                    if (view2 == null || view2.getTag() == null || !this.f30497a.getTag().equals("1")) {
                        View view3 = this.f30497a;
                        if (view3 == null || view3.getTag() == null || !this.f30497a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = a.this.f30494g;
                        }
                    } else {
                        linearLayout = a.this.f30493f;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f30497a;
                    if (view4 == null || view4.getTag() == null || !this.f30497a.getTag().equals("1")) {
                        View view5 = this.f30497a;
                        if (view5 == null || view5.getTag() == null || !this.f30497a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = a.this.f30494g;
                        }
                    } else {
                        linearLayout = a.this.f30493f;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        public a(Activity activity) {
            super(activity);
            this.f30489a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id == a7.f.f12544u1) {
                try {
                    LiveAllDataSingleActivity.this.f30475p.deleteALLLiveRecentlyWatched();
                    LiveAllDataSingleActivity.this.p2();
                    new Handler().postDelayed(new RunnableC0274a(), 100L);
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
            setContentView(new C2858a(LiveAllDataSingleActivity.this.f30452d).A().equals(AbstractC2237a.f44453K0) ? a7.g.f12742X1 : a7.g.f12736W1);
            this.f30490c = (TextView) findViewById(a7.f.f12544u1);
            this.f30491d = (TextView) findViewById(a7.f.f12412h1);
            this.f30493f = (LinearLayout) findViewById(a7.f.V8);
            this.f30494g = (LinearLayout) findViewById(a7.f.Ia);
            TextView textView = (TextView) findViewById(a7.f.um);
            this.f30492e = textView;
            textView.setText(LiveAllDataSingleActivity.this.getResources().getString(a7.j.V8));
            this.f30490c.setOnClickListener(this);
            this.f30491d.setOnClickListener(this);
            TextView textView2 = this.f30490c;
            textView2.setOnFocusChangeListener(new b(textView2));
            TextView textView3 = this.f30491d;
            textView3.setOnFocusChangeListener(new b(textView3));
        }
    }

    public class b implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f30499a;

        public b(View view) {
            this.f30499a = view;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (z9) {
                View view2 = this.f30499a;
                if (view2 == null || view2.getTag() == null) {
                    return;
                }
                this.f30499a.getTag().equals("iv_cross");
                return;
            }
            View view3 = this.f30499a;
            if (view3 == null || view3.getTag() == null || !this.f30499a.getTag().equals("iv_cross")) {
                return;
            }
            view.setBackground(LiveAllDataSingleActivity.this.getResources().getDrawable(a7.e.f11933L));
        }
    }

    public class c extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f30501a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f30502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f30503d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f30504e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f30505f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public RadioGroup f30506g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Activity f30507h;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f30509a;

            public a(View view) {
                this.f30509a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f30509a;
                    if (view2 == null || view2.getTag() == null || !this.f30509a.getTag().equals("1")) {
                        View view3 = this.f30509a;
                        if (view3 == null || view3.getTag() == null || !this.f30509a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = c.this.f30505f;
                        }
                    } else {
                        linearLayout = c.this.f30504e;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f30509a;
                    if (view4 == null || view4.getTag() == null || !this.f30509a.getTag().equals("1")) {
                        View view5 = this.f30509a;
                        if (view5 == null || view5.getTag() == null || !this.f30509a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = c.this.f30505f;
                        }
                    } else {
                        linearLayout = c.this.f30504e;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Activity activity, Activity activity2) {
            super(activity);
            this.f30507h = activity2;
            this.f30501a = activity;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003e A[Catch: Exception -> 0x011c, PHI: r0
          0x003e: PHI (r0v23 java.lang.String) = 
          (r0v16 java.lang.String)
          (r0v17 java.lang.String)
          (r0v18 java.lang.String)
          (r0v19 java.lang.String)
          (r0v20 java.lang.String)
          (r0v24 java.lang.String)
         binds: [B:38:0x00fe, B:34:0x00ee, B:28:0x00c4, B:22:0x009b, B:16:0x0072, B:9:0x003c] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {Exception -> 0x011c, blocks: (B:4:0x0008, B:7:0x0030, B:10:0x003e, B:40:0x0102, B:11:0x0045, B:12:0x004c, B:14:0x0066, B:18:0x0075, B:20:0x008f, B:24:0x009e, B:26:0x00b8, B:30:0x00c8, B:32:0x00e2, B:36:0x00f2), top: B:48:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0045 A[Catch: Exception -> 0x011c, PHI: r0
          0x0045: PHI (r0v21 java.lang.String) = 
          (r0v16 java.lang.String)
          (r0v17 java.lang.String)
          (r0v18 java.lang.String)
          (r0v19 java.lang.String)
          (r0v20 java.lang.String)
          (r0v24 java.lang.String)
         binds: [B:38:0x00fe, B:34:0x00ee, B:28:0x00c4, B:22:0x009b, B:16:0x0072, B:9:0x003c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x011c, blocks: (B:4:0x0008, B:7:0x0030, B:10:0x003e, B:40:0x0102, B:11:0x0045, B:12:0x004c, B:14:0x0066, B:18:0x0075, B:20:0x008f, B:24:0x009e, B:26:0x00b8, B:30:0x00c8, B:32:0x00e2, B:36:0x00f2), top: B:48:0x0008 }] */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onClick(android.view.View r5) {
            /*
                Method dump skipped, instruction units count: 288
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity.c.onClick(android.view.View):void");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00eb  */
        @Override // android.app.Dialog
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onCreate(android.os.Bundle r11) {
            /*
                Method dump skipped, instruction units count: 376
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity.c.onCreate(android.os.Bundle):void");
        }
    }

    public class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
            if (LiveAllDataSingleActivity.this.f30469m != null) {
                LiveAllDataSingleActivity.this.f30469m.getFilter().filter(charSequence.toString());
            }
        }
    }

    public class e implements SearchView.m {
        public e() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextChange(String str) {
            if (LiveAllDataSingleActivity.this.f30467l == null) {
                return false;
            }
            LiveAllDataSingleActivity.this.f30467l.getFilter().filter(str);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Dialog f30513a;

        public f(Dialog dialog) {
            this.f30513a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f30513a.dismiss();
        }
    }

    public class g implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Dialog f30515a;

        public g(Dialog dialog) {
            this.f30515a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f30515a.dismiss();
        }
    }

    public class h extends AsyncTask {
        public h() {
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
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
                r1 = r7[r0]     // Catch: java.lang.Exception -> L56
                int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L56
                r3 = -74801864(0xfffffffffb8a9d38, float:-1.4394515E36)
                r4 = 2
                r5 = 1
                if (r2 == r3) goto L2c
                r3 = -74797390(0xfffffffffb8aaeb2, float:-1.4401604E36)
                if (r2 == r3) goto L23
                r0 = 1768729440(0x696cab60, float:1.7882237E25)
                if (r2 == r0) goto L19
                goto L36
            L19:
                java.lang.String r0 = "get_recently_watched"
                boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L56
                if (r0 == 0) goto L36
                r0 = 2
                goto L37
            L23:
                java.lang.String r2 = "get_fav"
                boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L56
                if (r1 == 0) goto L36
                goto L37
            L2c:
                java.lang.String r0 = "get_all"
                boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L56
                if (r0 == 0) goto L36
                r0 = 1
                goto L37
            L36:
                r0 = -1
            L37:
                if (r0 == 0) goto L4f
                if (r0 == r5) goto L46
                if (r0 == r4) goto L3f
                r7 = 0
                return r7
            L3f:
                com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity r7 = com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity.this     // Catch: java.lang.Exception -> L56
                java.lang.String r7 = r7.O1()     // Catch: java.lang.Exception -> L56
                return r7
            L46:
                com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity r0 = com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity.this     // Catch: java.lang.Exception -> L56
                r7 = r7[r5]     // Catch: java.lang.Exception -> L56
                java.lang.String r7 = r0.N1(r7)     // Catch: java.lang.Exception -> L56
                return r7
            L4f:
                com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity r7 = com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity.this     // Catch: java.lang.Exception -> L56
                java.lang.String r7 = r7.Q1()     // Catch: java.lang.Exception -> L56
                return r7
            L56:
                java.lang.String r7 = "error"
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity.h.doInBackground(java.lang.String[]):java.lang.String");
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            LiveAllDataSingleActivity.this.Y1();
            str.hashCode();
            switch (str) {
                case "get_fav_local":
                    LiveAllDataSingleActivity.this.K1();
                    break;
                case "get_all":
                    LiveAllDataSingleActivity.this.u1();
                    break;
                case "get_fav_real_time":
                    LiveAllDataSingleActivity.this.L1();
                    break;
                case "get_recent_watch":
                    LiveAllDataSingleActivity.this.v1();
                    break;
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            LiveAllDataSingleActivity.this.w2();
            LiveAllDataSingleActivity.this.V1();
            LiveAllDataSingleActivity.this.X1();
        }
    }

    public class i implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f30518a;

        public i(View view) {
            this.f30518a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30518a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30518a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30518a, "scaleY", f9);
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
                View view2 = this.f30518a;
                if (view2 == null || view2.getTag() == null || !this.f30518a.getTag().equals("1")) {
                    View view3 = this.f30518a;
                    if (view3 == null || view3.getTag() == null || !this.f30518a.getTag().equals("2")) {
                        View view4 = this.f30518a;
                        if (view4 == null || view4.getTag() == null || !this.f30518a.getTag().equals("3")) {
                            b(1.0f);
                            c(1.0f);
                            a(z9);
                            return;
                        }
                    } else {
                        resources = LiveAllDataSingleActivity.this.getResources();
                        i9 = a7.c.f11858i;
                    }
                }
                view.setBackgroundResource(0);
                return;
            }
            View view5 = this.f30518a;
            if (view5 == null || view5.getTag() == null || !this.f30518a.getTag().equals("1")) {
                View view6 = this.f30518a;
                if (view6 == null || view6.getTag() == null || !this.f30518a.getTag().equals("2")) {
                    View view7 = this.f30518a;
                    if (view7 == null || view7.getTag() == null || !this.f30518a.getTag().equals("3")) {
                        b(1.15f);
                        c(1.15f);
                        return;
                    }
                    resources = LiveAllDataSingleActivity.this.getResources();
                    i9 = a7.e.f11946O0;
                } else {
                    resources = LiveAllDataSingleActivity.this.getResources();
                    i9 = a7.c.f11868s;
                }
            } else {
                resources = LiveAllDataSingleActivity.this.getResources();
                i9 = a7.e.f11946O0;
            }
            view.setBackground(resources.getDrawable(i9));
        }
    }

    public class j extends AsyncTask {
        public j() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return LiveAllDataSingleActivity.this.e2();
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            LiveAllDataSingleActivity.this.s2();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    private void H1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private ArrayList R1() {
        ArrayList<PasswordStatusDBModel> allPasswordStatus = this.f30475p.getAllPasswordStatus(SharepreferenceDBHandler.getUserID(this.f30452d));
        this.f30477q = allPasswordStatus;
        if (allPasswordStatus != null) {
            for (PasswordStatusDBModel passwordStatusDBModel : allPasswordStatus) {
                if (passwordStatusDBModel.getPasswordStatus().equals("1")) {
                    this.f30483u.add(passwordStatusDBModel.getPasswordStatusCategoryId());
                }
            }
        }
        return this.f30483u;
    }

    public static void U1(Activity activity) {
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

    private void b2() {
        this.f30471n = new ArrayList();
        this.f30473o = new ArrayList();
        this.f30475p = new LiveStreamDBHandler(this.f30452d);
        this.f30477q = new ArrayList();
        this.f30481s = new ArrayList();
        this.f30479r = new ArrayList();
        this.f30465k = new LinearLayoutManager(this.f30452d);
        this.f30484v = new DatabaseHandler(this.f30452d);
        this.f30437L = new n7.e(this, this.f30452d);
        w.y(this.f30452d);
        this.f30487y = new ArrayList();
        SharedPreferences sharedPreferences = getSharedPreferences("showhidemoviename", 0);
        this.f30429D = sharedPreferences;
        this.f30430E = sharedPreferences.edit();
        String stringExtra = getIntent().getStringExtra("RADIO");
        this.f30466k0 = stringExtra;
        if (stringExtra == null) {
            this.f30466k0 = "false";
        }
        this.f30480r0 = this.f30466k0.equalsIgnoreCase("true") ? "radio_streams" : "live";
        M1();
        z2();
        l2();
        m2();
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f30452d).equals("stalker_api")) {
            try {
                this.f30470m0 = SharepreferenceDBHandler.getStalkerToken(this.f30452d);
                String loggedInMacAddress = SharepreferenceDBHandler.getLoggedInMacAddress(this.f30452d);
                this.f30468l0 = loggedInMacAddress;
                this.f30437L.f(loggedInMacAddress, this.f30470m0, 0);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        } else {
            f2();
        }
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f30452d).equals("stalker_api")) {
            return;
        }
        w.Z(this.f30452d);
    }

    private void l2() {
        this.f30442Q.setOnClickListener(this);
        this.f30440O.setOnClickListener(this);
        this.f30456f0.setOnClickListener(this);
        this.f30441P.setOnClickListener(this);
        this.f30458g0.setOnClickListener(this);
        this.f30460h0.setOnClickListener(this);
    }

    private void q2(String str) {
        this.f30464j0 = str;
        C2634s c2634s = this.f30469m;
        if (c2634s != null) {
            c2634s.A0(str);
        }
    }

    private void y2(Activity activity) {
        new c((LiveAllDataSingleActivity) activity, activity).show();
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
        f2();
    }

    @Override // z7.g
    public void I(m0.x xVar, int i9) {
    }

    public boolean I1() {
        C2635t c2635t = this.f30467l;
        if (c2635t != null) {
            return c2635t.b1();
        }
        return false;
    }

    public final void J1() {
        EditText editText = this.f30449X;
        if (editText != null) {
            editText.setText("");
            this.f30449X.clearFocus();
        }
    }

    public void K1() {
        try {
            ArrayList arrayList = this.f30427B;
            if (arrayList == null || arrayList.size() <= 0) {
                VodAllCategoriesSingleton.getInstance().setLiveList(null);
                C2635t c2635t = new C2635t(this.f30452d, "live", this.f30462i0, this.f30464j0, this.f30480r0);
                this.f30467l = c2635t;
                this.f30444S.setAdapter(c2635t);
                v2(getResources().getString(a7.j.f13301k4));
                return;
            }
            VodAllCategoriesSingleton.getInstance().setLiveList(this.f30427B);
            C2635t c2635t2 = new C2635t(this.f30452d, "live", this.f30462i0, this.f30464j0, this.f30480r0);
            this.f30467l = c2635t2;
            this.f30444S.setAdapter(c2635t2);
            RelativeLayout relativeLayout = this.f30438M;
            this.f30463j = (relativeLayout == null || relativeLayout.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
            this.f30444S.setLayoutManager(this.f30463j);
            u2();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public void L1() {
        String string;
        try {
            if (this.f30466k0.equalsIgnoreCase("true")) {
                if (VodAllCategoriesSingleton.getInstance().getRadioFavList() == null || VodAllCategoriesSingleton.getInstance().getRadioFavList().size() <= 0) {
                    VodAllCategoriesSingleton.getInstance().setLiveList(null);
                    C2635t c2635t = new C2635t(this.f30452d, "live", this.f30462i0, this.f30464j0, this.f30480r0);
                    this.f30467l = c2635t;
                    this.f30444S.setAdapter(c2635t);
                    string = getResources().getString(a7.j.f13301k4);
                    v2(string);
                    return;
                }
                C2635t c2635t2 = new C2635t(this.f30452d, "live", this.f30462i0, this.f30464j0, this.f30480r0);
                this.f30467l = c2635t2;
                this.f30444S.setAdapter(c2635t2);
                RelativeLayout relativeLayout = this.f30438M;
                this.f30463j = (relativeLayout == null || relativeLayout.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
                this.f30444S.setLayoutManager(this.f30463j);
                u2();
            }
            if (VodAllCategoriesSingleton.getInstance().getLiveFavList() == null || VodAllCategoriesSingleton.getInstance().getLiveFavList().size() <= 0) {
                VodAllCategoriesSingleton.getInstance().setLiveList(null);
                C2635t c2635t3 = new C2635t(this.f30452d, "live", this.f30462i0, this.f30464j0, this.f30480r0);
                this.f30467l = c2635t3;
                this.f30444S.setAdapter(c2635t3);
                string = getResources().getString(a7.j.f13301k4);
                v2(string);
                return;
            }
            C2635t c2635t4 = new C2635t(this.f30452d, "live", this.f30462i0, this.f30464j0, this.f30480r0);
            this.f30467l = c2635t4;
            this.f30444S.setAdapter(c2635t4);
            RelativeLayout relativeLayout2 = this.f30438M;
            this.f30463j = (relativeLayout2 == null || relativeLayout2.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
            this.f30444S.setLayoutManager(this.f30463j);
            u2();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // z7.g
    public void M(StalkerGetAdCallback stalkerGetAdCallback, int i9) {
        try {
            StalkerLiveFavIdsSingleton.getInstance().setFavIdsList(null);
            this.f30437L.i(this.f30468l0, this.f30470m0);
        } catch (Exception unused) {
        }
    }

    public final void M1() {
        ImageView imageView = this.f30442Q;
        imageView.setOnFocusChangeListener(new i(imageView));
        RelativeLayout relativeLayout = this.f30441P;
        relativeLayout.setOnFocusChangeListener(new i(relativeLayout));
        ImageView imageView2 = this.f30440O;
        imageView2.setOnFocusChangeListener(new i(imageView2));
    }

    public String N1(String str) {
        try {
            this.f30485w = new ArrayList();
            this.f30471n = new ArrayList();
            this.f30486x = new ArrayList();
            this.f30487y = this.f30466k0.equals("true") ? this.f30475p.getAllLiveStreasWithCategoryId(str, "radio_streams") : this.f30475p.getAllLiveStreasWithCategoryId(str, "live");
            return "get_all";
        } catch (Exception e9) {
            e9.printStackTrace();
            return "get_all";
        }
    }

    @Override // z7.g
    public void O(Z.E e9, int i9) {
    }

    public String O1() {
        try {
            this.f30485w = new ArrayList();
            this.f30471n = new ArrayList();
            this.f30486x = new ArrayList();
            this.f30487y = this.f30466k0.equalsIgnoreCase("true") ? this.f30475p.getAllRecentlyWatchedLiveStreams("radio_streams") : this.f30475p.getAllRecentlyWatchedLiveStreams("live");
            return "get_recent_watch";
        } catch (Exception e9) {
            e9.printStackTrace();
            return "get_recent_watch";
        }
    }

    @Override // z7.g
    public void P0(String str) {
    }

    public void P1() {
        if (Listsingleton.b().a() == null || Listsingleton.b().a().size() <= 0) {
            return;
        }
        AbstractC2237a.f44510i1 = true;
        g2();
    }

    public String Q1() {
        LiveStreamsDBModel liveStreamFavouriteRow;
        ArrayList arrayList;
        try {
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f30452d).equals("m3u")) {
                new ArrayList();
                this.f30427B.clear();
                ArrayList<FavouriteM3UModel> favouriteM3U = this.f30475p.getFavouriteM3U("live");
                if (this.f30483u != null) {
                    this.f30483u = R1();
                }
                ArrayList arrayList2 = this.f30483u;
                if (arrayList2 != null && arrayList2.size() > 0 && favouriteM3U != null && favouriteM3U.size() > 0) {
                    favouriteM3U = T1(favouriteM3U, this.f30483u);
                }
                if (favouriteM3U == null || favouriteM3U.size() <= 0) {
                    return "get_fav_local";
                }
                for (FavouriteM3UModel favouriteM3UModel : favouriteM3U) {
                    ArrayList<LiveStreamsDBModel> m3UFavouriteRow = this.f30475p.getM3UFavouriteRow(favouriteM3UModel.getCategoryID(), favouriteM3UModel.getUrl(), favouriteM3UModel.getTimestamp());
                    if (m3UFavouriteRow != null && m3UFavouriteRow.size() > 0) {
                        this.f30427B.add(m3UFavouriteRow.get(0));
                    }
                }
                return "get_fav_local";
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f30452d).equals("stalker_api")) {
                List<Integer> favIdsList = StalkerLiveFavIdsSingleton.getInstance().getFavIdsList();
                String string = "";
                if (favIdsList != null && favIdsList.size() > 0) {
                    StringBuilder sb = new StringBuilder();
                    for (Integer num : favIdsList) {
                        if (sb.length() > 0) {
                            sb.append(',');
                        }
                        sb.append("'");
                        sb.append(num);
                        sb.append("'");
                    }
                    string = sb.toString();
                }
                this.f30427B.clear();
                this.f30427B = this.f30475p.getLiveFavStalker(string);
                return "get_fav_local";
            }
            new ArrayList();
            this.f30427B.clear();
            ArrayList<FavouriteDBModel> allFavourites = this.f30466k0.equals("true") ? this.f30484v.getAllFavourites("radio_streams", SharepreferenceDBHandler.getUserID(this.f30452d)) : this.f30484v.getAllFavourites("live", SharepreferenceDBHandler.getUserID(this.f30452d));
            if (this.f30483u != null) {
                this.f30483u = R1();
            }
            ArrayList arrayList3 = this.f30483u;
            if (arrayList3 != null && arrayList3.size() > 0 && allFavourites != null && allFavourites.size() > 0) {
                allFavourites = S1(allFavourites, this.f30483u);
            }
            if (allFavourites == null || allFavourites.size() <= 0) {
                return "get_fav_local";
            }
            for (FavouriteDBModel favouriteDBModel : allFavourites) {
                if (SharepreferenceDBHandler.getCurrentAPPType(this.f30452d).equals("onestream_api")) {
                    liveStreamFavouriteRow = this.f30475p.getLiveStreamFavouriteRow(favouriteDBModel.getCategoryID(), favouriteDBModel.getStreamIDOneStream(), favouriteDBModel.getTimestamp(), this.f30480r0);
                    if (liveStreamFavouriteRow != null) {
                        arrayList = this.f30427B;
                        arrayList.add(liveStreamFavouriteRow);
                    }
                } else {
                    liveStreamFavouriteRow = this.f30475p.getLiveStreamFavouriteRow(favouriteDBModel.getCategoryID(), String.valueOf(favouriteDBModel.getStreamID()), favouriteDBModel.getTimestamp(), this.f30480r0);
                    if (liveStreamFavouriteRow != null) {
                        arrayList = this.f30427B;
                        arrayList.add(liveStreamFavouriteRow);
                    }
                }
            }
            return "get_fav_local";
        } catch (Exception e9) {
            e9.printStackTrace();
            return "get_fav_local";
        }
    }

    public final ArrayList S1(ArrayList arrayList, ArrayList arrayList2) {
        this.f30488z = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FavouriteDBModel favouriteDBModel = (FavouriteDBModel) it.next();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    this.f30488z.add(favouriteDBModel);
                    break;
                }
                String str = (String) it2.next();
                if (favouriteDBModel.getCategoryID() == null || !favouriteDBModel.getCategoryID().equals(str)) {
                }
            }
        }
        return this.f30488z;
    }

    public final ArrayList T1(ArrayList arrayList, ArrayList arrayList2) {
        this.f30426A = new ArrayList();
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
                            this.f30426A.add(favouriteM3UModel);
                            break;
                        }
                        if (favouriteM3UModel.getCategoryID().equals((String) it2.next())) {
                            break;
                        }
                    }
                }
            }
            return this.f30426A;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // z7.g
    public void U(StalkerLiveFavIdsCallback stalkerLiveFavIdsCallback) {
        if (stalkerLiveFavIdsCallback != null && stalkerLiveFavIdsCallback.getJs() != null && stalkerLiveFavIdsCallback.getJs().size() > 0) {
            StalkerLiveFavIdsSingleton.getInstance().setFavIdsList(stalkerLiveFavIdsCallback.getJs());
        }
        f2();
    }

    @Override // z7.g
    public void V(StalkerProfilesCallback stalkerProfilesCallback) {
    }

    @Override // z7.g
    public void V0(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, m0.x xVar, int i9) {
    }

    public void V1() {
        LinearLayout linearLayout = this.f30445T;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        this.f30445T.setVisibility(8);
    }

    public void W1() {
        LinearLayout linearLayout = this.f30450Y;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    public void X1() {
        TextView textView = this.f30447V;
        if (textView == null || textView.getVisibility() != 0) {
            return;
        }
        this.f30447V.setVisibility(8);
    }

    public void Y1() {
        LinearLayout linearLayout = this.f30446U;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        this.f30446U.setVisibility(8);
    }

    public final void Z1() {
        if (this.f30438M.getVisibility() == 0) {
            U1(this);
            this.f30439N.startAnimation(this.f30459h);
            this.f30439N.setVisibility(0);
            this.f30438M.startAnimation(this.f30455f);
            this.f30438M.setVisibility(8);
            this.f30440O.startAnimation(this.f30461i);
            this.f30440O.setVisibility(0);
            this.f30460h0.setVisibility(0);
            this.f30440O.requestFocus();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f30452d, 7);
            this.f30463j = gridLayoutManager;
            this.f30444S.setLayoutManager(gridLayoutManager);
        }
    }

    public void a2() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    @Override // z7.g
    public void c(String str) {
    }

    public final boolean c2() {
        EditText editText = this.f30449X;
        return editText != null && editText.getText().toString().length() > 0;
    }

    @Override // z7.g
    public void d0(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, C2635t.o oVar, String str, String str2) {
    }

    public boolean d2() {
        EditText editText = this.f30449X;
        if (editText != null) {
            return editText.isFocused();
        }
        return false;
    }

    @Override // z7.g
    public void e(String str) {
    }

    @Override // z7.g
    public void e0(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5 A[Catch: Exception -> 0x016d, NullPointerException -> 0x0170, TryCatch #2 {NullPointerException -> 0x0170, Exception -> 0x016d, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x000a, B:8:0x000d, B:11:0x0037, B:13:0x0047, B:22:0x0092, B:24:0x00c5, B:26:0x00cd, B:27:0x00d3, B:29:0x00dd, B:32:0x00e3, B:33:0x00fa, B:44:0x013a, B:46:0x0152, B:28:0x00d6, B:34:0x0102, B:37:0x010c, B:38:0x0112, B:40:0x011c, B:43:0x0122, B:39:0x0115, B:14:0x004e, B:15:0x0055, B:17:0x0061, B:18:0x0070, B:20:0x0078, B:21:0x0089, B:47:0x016a), top: B:53:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0102 A[Catch: Exception -> 0x016d, NullPointerException -> 0x0170, TRY_LEAVE, TryCatch #2 {NullPointerException -> 0x0170, Exception -> 0x016d, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x000a, B:8:0x000d, B:11:0x0037, B:13:0x0047, B:22:0x0092, B:24:0x00c5, B:26:0x00cd, B:27:0x00d3, B:29:0x00dd, B:32:0x00e3, B:33:0x00fa, B:44:0x013a, B:46:0x0152, B:28:0x00d6, B:34:0x0102, B:37:0x010c, B:38:0x0112, B:40:0x011c, B:43:0x0122, B:39:0x0115, B:14:0x004e, B:15:0x0055, B:17:0x0061, B:18:0x0070, B:20:0x0078, B:21:0x0089, B:47:0x016a), top: B:53:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0152 A[Catch: Exception -> 0x016d, NullPointerException -> 0x0170, TryCatch #2 {NullPointerException -> 0x0170, Exception -> 0x016d, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x000a, B:8:0x000d, B:11:0x0037, B:13:0x0047, B:22:0x0092, B:24:0x00c5, B:26:0x00cd, B:27:0x00d3, B:29:0x00dd, B:32:0x00e3, B:33:0x00fa, B:44:0x013a, B:46:0x0152, B:28:0x00d6, B:34:0x0102, B:37:0x010c, B:38:0x0112, B:40:0x011c, B:43:0x0122, B:39:0x0115, B:14:0x004e, B:15:0x0055, B:17:0x0061, B:18:0x0070, B:20:0x0078, B:21:0x0089, B:47:0x016a), top: B:53:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean e2() {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity.e2():java.lang.Boolean");
    }

    @Override // z7.g
    public void f0(StalkerGetGenresCallback stalkerGetGenresCallback) {
    }

    public void f2() {
        new j().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    public final void g2() {
        List listA = Listsingleton.b().a();
        Dialog dialog = new Dialog(this, k.f13462g);
        dialog.requestWindowFeature(1);
        dialog.setContentView(a7.g.f12682N1);
        dialog.getWindow().setBackgroundDrawable(null);
        dialog.getWindow().setLayout(-1, -2);
        dialog.setCancelable(false);
        ImageView imageView = (ImageView) dialog.findViewById(a7.f.f12201L4);
        ImageView imageView2 = (ImageView) dialog.findViewById(a7.f.f12308W4);
        this.f30472n0 = (LinearLayout) dialog.findViewById(a7.f.f12114C7);
        imageView2.setOnClickListener(new f(dialog));
        this.f30472n0.setOnClickListener(new g(dialog));
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
                        t.q(this.f30452d).l((String) listA.get(AbstractC2237a.f44516k1)).g(imageView);
                        AbstractC2237a.f44516k1++;
                    } else {
                        t.q(this.f30452d).l((String) listA.get(0)).g(imageView);
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h2(java.lang.String r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity.h2(java.lang.String, java.lang.String):void");
    }

    @Override // z7.g
    public void i(StalkerGetAllChannelsCallback stalkerGetAllChannelsCallback) {
    }

    public void i2() {
        LinearLayout linearLayout = this.f30450Y;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    @Override // z7.g
    public void j(StalkerGetVodCategoriesCallback stalkerGetVodCategoriesCallback) {
    }

    public void j2() {
        C2634s c2634s = this.f30469m;
        if (c2634s != null) {
            c2634s.w();
        }
    }

    public void k2() {
        C2635t c2635t = this.f30467l;
        if (c2635t != null) {
            c2635t.w();
        }
    }

    public final void m2() {
        EditText editText = this.f30449X;
        if (editText != null) {
            editText.addTextChangedListener(new d());
        }
    }

    public void n2() {
        C2635t c2635t = this.f30467l;
        if (c2635t != null) {
            c2635t.i1();
        }
    }

    @Override // z7.g
    public void o0(String str) {
    }

    public void o2() {
        w.f44702o = new h().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_recent_watch", "-4");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (c2()) {
            J1();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == a7.f.f12290U4) {
            Z1();
            return;
        }
        if (id == a7.f.f12151G4 || id == a7.f.f12161H4) {
            onBackPressed();
            return;
        }
        if (id == a7.f.f12456l5) {
            this.f30436K = -1;
            x2();
        } else if (id == a7.f.Xa) {
            w.j(this.f30452d);
        } else if (id == a7.f.f0if) {
            this.f30449X.requestFocus();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a2();
        H1();
        this.f30452d = this;
        setContentView(a7.g.f12698Q);
        this.f30438M = (RelativeLayout) findViewById(a7.f.ye);
        this.f30439N = (RelativeLayout) findViewById(a7.f.hf);
        this.f30440O = (ImageView) findViewById(a7.f.f12456l5);
        this.f30441P = (RelativeLayout) findViewById(a7.f.f0if);
        this.f30442Q = (ImageView) findViewById(a7.f.f12290U4);
        this.f30443R = (RecyclerView) findViewById(a7.f.Fd);
        this.f30444S = (RecyclerView) findViewById(a7.f.Dd);
        this.f30445T = (LinearLayout) findViewById(a7.f.W9);
        this.f30446U = (LinearLayout) findViewById(a7.f.f12175I8);
        this.f30447V = (TextView) findViewById(a7.f.wk);
        this.f30448W = (TextView) findViewById(a7.f.Zj);
        this.f30449X = (EditText) findViewById(a7.f.f12464m3);
        this.f30450Y = (LinearLayout) findViewById(a7.f.W8);
        this.f30451Z = (Toolbar) findViewById(a7.f.kh);
        this.f30454e0 = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f30456f0 = (ImageView) findViewById(a7.f.Xa);
        this.f30458g0 = (ImageView) findViewById(a7.f.f12151G4);
        this.f30460h0 = (ImageView) findViewById(a7.f.f12161H4);
        Toolbar toolbar = this.f30451Z;
        if (toolbar != null) {
            r1(toolbar);
        }
        this.f30478q0 = true;
        b2();
        if (AbstractC2237a.f44475V0.booleanValue() && AbstractC2237a.f44498e1.equalsIgnoreCase("1")) {
            if (SharepreferenceDBHandler.getEventAdsView(this) < AbstractC2237a.f44501f1) {
                SharepreferenceDBHandler.setEventAdsView(SharepreferenceDBHandler.getEventAdsView(this) + 1, this);
            } else {
                SharepreferenceDBHandler.setEventAdsView(0, this);
                P1();
            }
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        ArrayList<LiveStreamsDBModel> liveList;
        super.onCreateOptionsMenu(menu);
        Toolbar toolbar = this.f30451Z;
        if (toolbar != null) {
            toolbar.x(a7.h.f12937t);
            SharedPreferences sharedPreferences = this.f30429D;
            if (sharedPreferences != null) {
                if (sharedPreferences.getInt("livestream", 1) == 1) {
                    menu.getItem(1).getSubMenu().findItem(a7.f.f12559v6).setVisible(false);
                    menu.getItem(1).getSubMenu().findItem(a7.f.f12519r6).setVisible(true);
                } else {
                    menu.getItem(1).getSubMenu().findItem(a7.f.f12559v6).setVisible(true);
                    menu.getItem(1).getSubMenu().findItem(a7.f.f12519r6).setVisible(false);
                }
            }
            this.f30431F = menu;
            TextView textView = this.f30448W;
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (this.f30434I.equals("-5") || this.f30434I.equals("-4") || this.f30434I.equals("-6") || SharepreferenceDBHandler.getCurrentAPPType(this.f30452d).equals("stalker_api")) {
                this.f30431F.getItem(1).getSubMenu().findItem(a7.f.mb).setVisible(false);
            } else {
                this.f30431F.getItem(1).getSubMenu().findItem(a7.f.mb).setVisible(true);
            }
            if (!this.f30434I.equals("-6") || (liveList = VodAllCategoriesSingleton.getInstance().getLiveList()) == null || liveList.size() <= 0) {
                this.f30431F.getItem(1).getSubMenu().findItem(a7.f.Db).setVisible(false);
            } else {
                this.f30431F.getItem(1).getSubMenu().findItem(a7.f.Db).setVisible(true);
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f30452d).equals("m3u") || SharepreferenceDBHandler.getCurrentAPPType(this.f30452d).equals("onestream_api")) {
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
        if (this.f30469m != null) {
            this.f30469m = null;
        }
        AsyncTask asyncTask = w.f44702o;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            return;
        }
        w.f44702o.cancel(true);
    }

    @Override // androidx.appcompat.app.b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        C2635t c2635t;
        if (i9 != 21) {
            return super.onKeyDown(i9, keyEvent);
        }
        if (this.f30438M.getVisibility() != 8 || (c2635t = this.f30467l) == null) {
            return false;
        }
        int iC1 = c2635t.c1();
        this.f30436K = iC1;
        if (iC1 % 7 != 0) {
            return false;
        }
        x2();
        return false;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        this.f30432G = menuItem;
        this.f30451Z.e();
        int itemId = menuItem.getItemId();
        if (itemId == a7.f.f12400g) {
            try {
                SearchView searchView = (SearchView) menuItem.getActionView();
                this.f30433H = searchView;
                if (searchView != null) {
                    searchView.setQueryHint(getResources().getString(a7.j.f12950A6));
                    this.f30433H.setIconifiedByDefault(false);
                    ImageView imageView = (ImageView) this.f30433H.findViewById(a7.f.Uf);
                    ((ImageView) this.f30433H.findViewById(a7.f.Vf)).setImageResource(a7.e.f12032m1);
                    imageView.setImageResource(a7.e.f12032m1);
                    imageView.setPadding(15, 15, 15, 15);
                    imageView.setBackground(null);
                    this.f30433H.setOnQueryTextListener(new e());
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        if (itemId == a7.f.mb) {
            y2(this);
        }
        if (itemId == a7.f.f12559v6) {
            SharedPreferences.Editor editor = this.f30430E;
            if (editor != null) {
                editor.putInt("livestream", 1);
                this.f30430E.commit();
            }
            Menu menu = this.f30431F;
            if (menu != null) {
                menu.getItem(1).getSubMenu().findItem(a7.f.f12559v6).setVisible(false);
                this.f30431F.getItem(1).getSubMenu().findItem(a7.f.f12519r6).setVisible(true);
            }
            k2();
        }
        if (itemId == a7.f.f12519r6) {
            SharedPreferences.Editor editor2 = this.f30430E;
            if (editor2 != null) {
                editor2.putInt("livestream", 0);
                this.f30430E.commit();
            }
            Menu menu2 = this.f30431F;
            if (menu2 != null) {
                menu2.getItem(1).getSubMenu().findItem(a7.f.f12559v6).setVisible(true);
                this.f30431F.getItem(1).getSubMenu().findItem(a7.f.f12519r6).setVisible(false);
            }
            k2();
        }
        if (itemId == a7.f.gb) {
            w.A0(this.f30452d);
        }
        if (itemId == a7.f.Db && VodAllCategoriesSingleton.getInstance().getLiveList() != null && VodAllCategoriesSingleton.getInstance().getLiveList().size() > 0) {
            t2();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        DataBaseViewModel dataBaseViewModel = this.f30476p0;
        if (dataBaseViewModel != null) {
            dataBaseViewModel.getDataForMovies().n(this);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        a2();
        super.onResume();
        if (this.f30478q0) {
            this.f30478q0 = false;
        } else {
            j2();
        }
        w.z0(this.f30452d);
        if (this.f30434I.equals("-4")) {
            o2();
        } else {
            k2();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        a2();
    }

    public void p2() {
        w.f44702o = new h().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_recently_watched", "-6");
    }

    @Override // z7.g
    public void q(StalkerGetVODByCatCallback stalkerGetVODByCatCallback) {
    }

    public void r2(String str) {
        this.f30462i0 = str;
        TextView textView = this.f30448W;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void s2() {
        ArrayList arrayList;
        String string;
        ArrayList arrayList2 = this.f30479r;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = this.f30481s;
        if (arrayList3 != null) {
            arrayList3.clear();
        }
        ArrayList arrayList4 = new ArrayList();
        this.f30481s = arrayList4;
        arrayList4.addAll(this.f30479r);
        int i9 = 3;
        String liveStreamCategoryID = "0";
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f30452d).equals("stalker_api")) {
            ArrayList arrayList5 = this.f30479r;
            if (arrayList5 != null && arrayList5.size() >= 3) {
                arrayList = this.f30479r;
                i9 = 2;
                liveStreamCategoryID = ((LiveStreamCategoryIdDBModel) arrayList.get(i9)).getLiveStreamCategoryID();
                string = ((LiveStreamCategoryIdDBModel) this.f30479r.get(i9)).getLiveStreamCategoryName();
            }
            string = this.f30452d.getResources().getString(a7.j.f13426x);
        } else {
            ArrayList arrayList6 = this.f30479r;
            if (arrayList6 != null && arrayList6.size() >= 4) {
                arrayList = this.f30479r;
                liveStreamCategoryID = ((LiveStreamCategoryIdDBModel) arrayList.get(i9)).getLiveStreamCategoryID();
                string = ((LiveStreamCategoryIdDBModel) this.f30479r.get(i9)).getLiveStreamCategoryName();
            }
            string = this.f30452d.getResources().getString(a7.j.f13426x);
        }
        h2(liveStreamCategoryID, string);
        ArrayList arrayList7 = this.f30481s;
        if (arrayList7 != null && arrayList7.size() > 0) {
            VodAllCategoriesSingleton.getInstance().setLiveCategoriesList(this.f30481s);
        }
        C2634s c2634s = new C2634s(this.f30452d, this.f30466k0, liveStreamCategoryID);
        this.f30469m = c2634s;
        this.f30443R.setAdapter(c2634s);
        this.f30443R.setLayoutManager(this.f30465k);
    }

    public final void t2() {
        try {
            new a(this).show();
        } catch (Exception unused) {
        }
    }

    public void u1() {
        try {
            ArrayList arrayList = this.f30487y;
            if (arrayList == null || arrayList.size() <= 0) {
                VodAllCategoriesSingleton.getInstance().setLiveList(null);
                C2635t c2635t = new C2635t(this.f30452d, "live", this.f30462i0, this.f30464j0, this.f30480r0);
                this.f30467l = c2635t;
                this.f30444S.setAdapter(c2635t);
                v2(getResources().getString(a7.j.f13261g4));
                return;
            }
            VodAllCategoriesSingleton.getInstance().setLiveList(this.f30487y);
            C2635t c2635t2 = new C2635t(this.f30452d, "live", this.f30462i0, this.f30464j0, this.f30480r0);
            this.f30467l = c2635t2;
            this.f30444S.setAdapter(c2635t2);
            RelativeLayout relativeLayout = this.f30438M;
            this.f30463j = (relativeLayout == null || relativeLayout.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
            this.f30444S.setLayoutManager(this.f30463j);
            u2();
        } catch (Exception unused) {
        }
    }

    public void u2() {
        LinearLayout linearLayout = this.f30445T;
        if (linearLayout == null || linearLayout.getVisibility() != 8) {
            return;
        }
        this.f30445T.setVisibility(0);
    }

    @Override // z7.g
    public void v0(String str) {
        try {
            StalkerLiveFavIdsSingleton.getInstance().setFavIdsList(null);
            this.f30437L.i(this.f30468l0, this.f30470m0);
        } catch (Exception unused) {
        }
    }

    public final void v1() {
        try {
            ArrayList arrayList = this.f30487y;
            if (arrayList == null || arrayList.size() <= 0) {
                VodAllCategoriesSingleton.getInstance().setLiveList(null);
                Menu menu = this.f30431F;
                if (menu != null) {
                    menu.getItem(1).getSubMenu().findItem(a7.f.Db).setVisible(false);
                }
                C2635t c2635t = new C2635t(this.f30452d, "live", this.f30462i0, this.f30464j0, this.f30480r0);
                this.f30467l = c2635t;
                this.f30444S.setAdapter(c2635t);
                v2(getResources().getString(a7.j.f13261g4));
                return;
            }
            VodAllCategoriesSingleton.getInstance().setLiveList(this.f30487y);
            Menu menu2 = this.f30431F;
            if (menu2 != null) {
                menu2.getItem(1).getSubMenu().findItem(a7.f.Db).setVisible(true);
            }
            C2635t c2635t2 = new C2635t(this.f30452d, "live", this.f30462i0, this.f30464j0, this.f30480r0);
            this.f30467l = c2635t2;
            this.f30444S.setAdapter(c2635t2);
            RelativeLayout relativeLayout = this.f30438M;
            this.f30463j = (relativeLayout == null || relativeLayout.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
            this.f30444S.setLayoutManager(this.f30463j);
            u2();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public void v2(String str) {
        TextView textView = this.f30447V;
        if (textView != null) {
            textView.setText(str);
            this.f30447V.setVisibility(0);
        }
    }

    public final void w2() {
        LinearLayout linearLayout = this.f30446U;
        if (linearLayout == null || linearLayout.getVisibility() != 8) {
            return;
        }
        this.f30446U.setVisibility(0);
    }

    public final void x2() {
        if (this.f30438M.getVisibility() == 8) {
            this.f30440O.setVisibility(8);
            this.f30460h0.setVisibility(8);
            this.f30442Q.startAnimation(this.f30461i);
            this.f30442Q.setVisibility(0);
            this.f30442Q.requestFocus();
            this.f30438M.startAnimation(this.f30453e);
            this.f30438M.setVisibility(0);
            this.f30439N.startAnimation(this.f30457g);
            this.f30439N.setVisibility(0);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f30452d, 5);
            this.f30463j = gridLayoutManager;
            this.f30444S.setLayoutManager(gridLayoutManager);
            if (this.f30467l != null) {
                this.f30444S.m1(this.f30436K);
                this.f30436K = -1;
            }
        }
    }

    @Override // z7.g
    public void y0(String str) {
    }

    public final void z2() {
        this.f30453e = AnimationUtils.loadAnimation(this.f30452d, a7.b.f11824b);
        this.f30455f = AnimationUtils.loadAnimation(this.f30452d, a7.b.f11825c);
        this.f30457g = AnimationUtils.loadAnimation(this.f30452d, a7.b.f11829g);
        this.f30459h = AnimationUtils.loadAnimation(this.f30452d, a7.b.f11827e);
        this.f30461i = AnimationUtils.loadAnimation(this.f30452d, a7.b.f11823a);
    }
}
