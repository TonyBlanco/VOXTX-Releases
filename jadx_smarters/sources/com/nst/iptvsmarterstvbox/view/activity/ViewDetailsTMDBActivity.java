package com.nst.iptvsmarterstvbox.view.activity;

import android.R;
import android.animation.ObjectAnimator;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import com.nst.iptvsmarterstvbox.model.FavouriteM3UModel;
import com.nst.iptvsmarterstvbox.model.callback.TMDBPersonInfoCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBTrailerCallback;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.ExternalPlayerDataBase;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass;
import i7.AbstractC1902a;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import k.U;
import m7.AbstractC2237a;
import m7.w;
import o2.AbstractC2312g;
import o4.C2325b;
import o4.C2328e;
import org.apache.http.HttpHeaders;
import q7.C2622f;
import u7.C2858a;
import w7.AbstractC2941e;
import w7.C2937a;
import w7.C2939c;
import w7.C2940d;

/* JADX INFO: loaded from: classes4.dex */
public class ViewDetailsTMDBActivity extends androidx.appcompat.app.b implements View.OnClickListener, z7.k {

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public static String f33094N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public static String f33095O0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public LinearLayout f33096A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public LinearLayout f33098B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public DatabaseHandler f33099B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public LinearLayout f33100C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public PopupWindow f33101C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public LinearLayout f33102D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public LinearLayout f33104E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public LinearLayout f33106F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public n7.h f33107F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public LinearLayout f33108G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public LinearLayout f33110H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public LinearLayout f33112I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public C2622f f33113I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public LinearLayout f33114J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public LinearLayout f33116K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public C2328e f33117K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public TextView f33118L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public LinearLayout f33120M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public TextView f33122N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public RelativeLayout f33123O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ScrollView f33124P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public NestedScrollView f33125Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public RecyclerView f33126R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public ImageView f33127S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public LinearLayout f33128T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public LinearLayout f33129U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public SimpleDateFormat f33130V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Date f33131W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Button f33132X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public String f33133Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public DateFormat f33134Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f33135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f33136e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public String f33137e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RelativeLayout f33138f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public TextView f33139f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f33140g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public MenuItem f33141g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Toolbar f33142h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Menu f33143h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f33144i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Button f33145i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AppBarLayout f33146j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f33148k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public ProgressDialog f33149k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f33150l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public SharedPreferences f33151l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f33152m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public SharedPreferences f33153m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f33154n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public LiveStreamDBHandler f33155n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f33156o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f33158p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f33160q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f33162r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f33164s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f33166t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public RatingBar f33168u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ImageView f33170v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f33172w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f33174x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f33176y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f33178z;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Context f33147j0 = this;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f33157o0 = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f33159p0 = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f33161q0 = "";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public String f33163r0 = "";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public String f33165s0 = "";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public String f33167t0 = "";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public String f33169u0 = "";

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public String f33171v0 = "";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public String f33173w0 = "";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public String f33175x0 = "";

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f33177y0 = "";

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f33179z0 = -1;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public String f33097A0 = "";

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public String f33103D0 = "";

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public Boolean f33105E0 = Boolean.TRUE;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public String f33109G0 = "mobile";

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public String f33111H0 = "";

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public String f33115J0 = "";

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public ArrayList f33119L0 = new ArrayList();

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public ArrayList f33121M0 = new ArrayList();

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.m0(ViewDetailsTMDBActivity.this.f33147j0);
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

    public class e extends AbstractC2312g {
        public e() {
        }

        @Override // o2.InterfaceC2315j
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(Bitmap bitmap, n2.c cVar) {
            ViewDetailsTMDBActivity.this.f33146j.setBackground(new BitmapDrawable(bitmap));
            ViewDetailsTMDBActivity viewDetailsTMDBActivity = ViewDetailsTMDBActivity.this;
            viewDetailsTMDBActivity.f33123O.setBackgroundColor(viewDetailsTMDBActivity.getResources().getColor(a7.c.f11843A));
            ViewDetailsTMDBActivity viewDetailsTMDBActivity2 = ViewDetailsTMDBActivity.this;
            viewDetailsTMDBActivity2.f33142h.setBackgroundColor(viewDetailsTMDBActivity2.getResources().getColor(a7.c.f11843A));
        }
    }

    public class f extends AbstractC2312g {
        public f() {
        }

        @Override // o2.InterfaceC2315j
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(Bitmap bitmap, n2.c cVar) {
            ViewDetailsTMDBActivity.this.f33146j.setBackground(new BitmapDrawable(bitmap));
            ViewDetailsTMDBActivity viewDetailsTMDBActivity = ViewDetailsTMDBActivity.this;
            viewDetailsTMDBActivity.f33123O.setBackgroundColor(viewDetailsTMDBActivity.getResources().getColor(a7.c.f11843A));
            ViewDetailsTMDBActivity viewDetailsTMDBActivity2 = ViewDetailsTMDBActivity.this;
            viewDetailsTMDBActivity2.f33142h.setBackgroundColor(viewDetailsTMDBActivity2.getResources().getColor(a7.c.f11843A));
        }
    }

    public class g implements U.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f33186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f33187b;

        public g(ArrayList arrayList, String str) {
            this.f33186a = arrayList;
            this.f33187b = str;
        }

        @Override // k.U.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            ArrayList arrayList;
            try {
                if (ViewDetailsTMDBActivity.this.f33105E0.booleanValue() && (arrayList = this.f33186a) != null && arrayList.size() > 0) {
                    int i9 = 0;
                    while (true) {
                        if (i9 < this.f33186a.size()) {
                            if (menuItem.getItemId() != i9) {
                                i9++;
                            } else if (menuItem.getItemId() == 0) {
                                w.w0(ViewDetailsTMDBActivity.this.f33147j0, this.f33187b, ViewDetailsTMDBActivity.this.f33179z0, ViewDetailsTMDBActivity.this.f33171v0, ViewDetailsTMDBActivity.this.f33173w0, ViewDetailsTMDBActivity.this.f33175x0, ViewDetailsTMDBActivity.this.f33165s0, ViewDetailsTMDBActivity.this.f33177y0, 0, "", "", ViewDetailsTMDBActivity.this.f33097A0);
                            } else {
                                Intent intent = new Intent(ViewDetailsTMDBActivity.this.f33147j0, (Class<?>) PlayExternalPlayerActivity.class);
                                intent.putExtra("url", ViewDetailsTMDBActivity.this.f33177y0);
                                intent.putExtra("app_name", ((ExternalPlayerModelClass) this.f33186a.get(i9)).getAppname());
                                intent.putExtra("packagename", ((ExternalPlayerModelClass) this.f33186a.get(i9)).getPackagename());
                                ViewDetailsTMDBActivity.this.f33147j0.startActivity(intent);
                            }
                        }
                    }
                }
                break;
            } catch (Exception unused) {
            }
            return false;
        }
    }

    public class h implements U.c {
        public h() {
        }

        @Override // k.U.c
        public void a(U u9) {
        }
    }

    public class i implements U.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f33190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f33191b;

        public i(ArrayList arrayList, String str) {
            this.f33190a = arrayList;
            this.f33191b = str;
        }

        @Override // k.U.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            ArrayList arrayList;
            try {
                if (ViewDetailsTMDBActivity.this.f33105E0.booleanValue() && (arrayList = this.f33190a) != null && arrayList.size() > 0) {
                    int i9 = 0;
                    while (true) {
                        if (i9 < this.f33190a.size()) {
                            if (menuItem.getItemId() != i9) {
                                i9++;
                            } else if (menuItem.getItemId() == 0) {
                                w.w0(ViewDetailsTMDBActivity.this.f33147j0, this.f33191b, ViewDetailsTMDBActivity.this.f33179z0, ViewDetailsTMDBActivity.this.f33171v0, ViewDetailsTMDBActivity.this.f33173w0, ViewDetailsTMDBActivity.this.f33175x0, ViewDetailsTMDBActivity.this.f33165s0, ViewDetailsTMDBActivity.this.f33177y0, 0, "", "", ViewDetailsTMDBActivity.this.f33097A0);
                            } else {
                                Intent intent = new Intent(ViewDetailsTMDBActivity.this.f33147j0, (Class<?>) PlayExternalPlayerActivity.class);
                                intent.putExtra("url", ViewDetailsTMDBActivity.this.f33177y0);
                                intent.putExtra("app_name", ((ExternalPlayerModelClass) this.f33190a.get(i9)).getAppname());
                                intent.putExtra("packagename", ((ExternalPlayerModelClass) this.f33190a.get(i9)).getPackagename());
                                ViewDetailsTMDBActivity.this.f33147j0.startActivity(intent);
                            }
                        }
                    }
                }
                break;
            } catch (Exception unused) {
            }
            return false;
        }
    }

    public class j implements U.c {
        public j() {
        }

        @Override // k.U.c
        public void a(U u9) {
        }
    }

    public class k implements View.OnClickListener {
        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewDetailsTMDBActivity.this.f33101C0.dismiss();
        }
    }

    public class l implements View.OnClickListener {
        public l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewDetailsTMDBActivity.this.f33101C0.dismiss();
        }
    }

    public class m implements View.OnClickListener {
        public m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewDetailsTMDBActivity.this.f33101C0.dismiss();
        }
    }

    public class n implements View.OnClickListener {
        public n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(ViewDetailsTMDBActivity.this.f33147j0);
        }
    }

    public class o implements View.OnClickListener {
        public o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewDetailsTMDBActivity.this.onBackPressed();
        }
    }

    public class p implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f33199a;

        public p(Context context) {
            this.f33199a = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ViewDetailsTMDBActivity.this.f33155n0.checkFavourite(ViewDetailsTMDBActivity.this.f33177y0, SharepreferenceDBHandler.getUserID(this.f33199a)).size() > 0) {
                ViewDetailsTMDBActivity.this.X1();
            } else {
                ViewDetailsTMDBActivity.this.L1();
            }
        }
    }

    public class q extends AbstractC2312g {
        public q() {
        }

        @Override // o2.InterfaceC2315j
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(Bitmap bitmap, n2.c cVar) {
            ViewDetailsTMDBActivity.this.f33140g.setBackground(new BitmapDrawable(bitmap));
        }
    }

    public class r implements DialogInterface.OnClickListener {
        public r() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.dismiss();
        }
    }

    public class s implements DialogInterface.OnClickListener {
        public s() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.n0(ViewDetailsTMDBActivity.this.f33147j0);
        }
    }

    public class t implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f33204a;

        public t(View view) {
            this.f33204a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f33204a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f33204a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            View view2;
            int i9;
            if (z9) {
                f9 = z9 ? 1.05f : 1.0f;
                Log.e("id is", "" + this.f33204a.getTag());
                View view3 = this.f33204a;
                if (view3 == null || view3.getTag() == null) {
                    return;
                }
                if (this.f33204a.getTag().equals("1")) {
                    a(f9);
                    b(f9);
                    view2 = ViewDetailsTMDBActivity.this.f33128T;
                } else if (this.f33204a.getTag().equals("2")) {
                    a(f9);
                    b(f9);
                    view2 = this.f33204a;
                } else if (this.f33204a.getTag().equals("5")) {
                    a(f9);
                    b(f9);
                    view2 = ViewDetailsTMDBActivity.this.f33129U;
                } else if (!this.f33204a.getTag().equals("8")) {
                    a(1.15f);
                    b(1.15f);
                    return;
                } else {
                    a(f9);
                    b(f9);
                    view2 = ViewDetailsTMDBActivity.this.f33145i0;
                    i9 = a7.e.f12010h;
                }
                i9 = a7.e.f12042p;
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                a(f9);
                b(f9);
                View view4 = this.f33204a;
                if (view4 == null || view4.getTag() == null) {
                    return;
                }
                if (this.f33204a.getTag().equals("1")) {
                    view2 = ViewDetailsTMDBActivity.this.f33128T;
                } else {
                    if (this.f33204a.getTag().equals("3")) {
                        view2 = this.f33204a;
                    } else if (this.f33204a.getTag().equals("5")) {
                        view2 = ViewDetailsTMDBActivity.this.f33129U;
                    } else if (this.f33204a.getTag() == null || !this.f33204a.getTag().equals("8")) {
                        return;
                    } else {
                        view2 = ViewDetailsTMDBActivity.this.f33145i0;
                    }
                    i9 = a7.e.f12038o;
                }
                i9 = a7.e.f11891A1;
            }
            view2.setBackgroundResource(i9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L1() {
        FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
        favouriteM3UModel.setUrl(this.f33177y0);
        favouriteM3UModel.setUserID(SharepreferenceDBHandler.getUserID(this.f33147j0));
        favouriteM3UModel.setName(this.f33165s0);
        favouriteM3UModel.setCategoryID(this.f33097A0);
        this.f33155n0.addToFavourite(favouriteM3UModel);
        if (Build.VERSION.SDK_INT <= 21) {
            this.f33170v.setImageResource(a7.e.f11967V);
        }
        this.f33170v.setImageDrawable(this.f33147j0.getResources().getDrawable(a7.e.f11967V, null));
    }

    private void M1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    public static long N1(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0L;
        }
    }

    public static String O1(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    private void Q1() {
        this.f33138f = (RelativeLayout) findViewById(a7.f.Nd);
        this.f33140g = (ImageView) findViewById(a7.f.f12102B5);
        this.f33142h = (Toolbar) findViewById(a7.f.kh);
        this.f33144i = (LinearLayout) findViewById(a7.f.f12244P7);
        this.f33146j = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f33148k = (TextView) findViewById(a7.f.lk);
        this.f33150l = (TextView) findViewById(a7.f.Pk);
        this.f33152m = (TextView) findViewById(a7.f.kk);
        this.f33154n = (TextView) findViewById(a7.f.Hi);
        this.f33156o = (TextView) findViewById(a7.f.Ii);
        this.f33158p = (TextView) findViewById(a7.f.Rh);
        this.f33160q = (TextView) findViewById(a7.f.Th);
        this.f33162r = (TextView) findViewById(a7.f.tl);
        this.f33164s = (TextView) findViewById(a7.f.ul);
        this.f33166t = (ImageView) findViewById(a7.f.Xa);
        this.f33168u = (RatingBar) findViewById(a7.f.bd);
        this.f33170v = (ImageView) findViewById(a7.f.f12406g5);
        this.f33172w = (TextView) findViewById(a7.f.ik);
        this.f33174x = (TextView) findViewById(a7.f.zj);
        this.f33176y = (TextView) findViewById(a7.f.gk);
        this.f33178z = (TextView) findViewById(a7.f.hk);
        this.f33096A = (LinearLayout) findViewById(a7.f.f12265R8);
        this.f33098B = (LinearLayout) findViewById(a7.f.f12174I7);
        this.f33100C = (LinearLayout) findViewById(a7.f.H9);
        this.f33102D = (LinearLayout) findViewById(a7.f.f12274S7);
        this.f33104E = (LinearLayout) findViewById(a7.f.f12521r8);
        this.f33106F = (LinearLayout) findViewById(a7.f.f12499p7);
        this.f33108G = (LinearLayout) findViewById(a7.f.f12184J7);
        this.f33110H = (LinearLayout) findViewById(a7.f.I9);
        this.f33112I = (LinearLayout) findViewById(a7.f.f12284T7);
        this.f33114J = (LinearLayout) findViewById(a7.f.f12531s8);
        this.f33116K = (LinearLayout) findViewById(a7.f.f12510q7);
        this.f33118L = (TextView) findViewById(a7.f.kl);
        this.f33120M = (LinearLayout) findViewById(a7.f.Ga);
        this.f33122N = (TextView) findViewById(a7.f.qm);
        this.f33123O = (RelativeLayout) findViewById(a7.f.vf);
        this.f33124P = (ScrollView) findViewById(a7.f.Tf);
        this.f33125Q = (NestedScrollView) findViewById(a7.f.Nb);
        this.f33126R = (RecyclerView) findViewById(a7.f.Df);
        this.f33127S = (ImageView) findViewById(a7.f.f12141F4);
        this.f33128T = (LinearLayout) findViewById(a7.f.p9);
        this.f33129U = (LinearLayout) findViewById(a7.f.Ha);
    }

    private void R1() {
        this.f33155n0 = new LiveStreamDBHandler(this.f33147j0);
        this.f33099B0 = new DatabaseHandler(this.f33147j0);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f33151l0 = sharedPreferences;
        String string = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        String string2 = this.f33151l0.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        if (string.isEmpty() || string2.isEmpty()) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        } else {
            a2(this.f33147j0, string, string2);
        }
        this.f33166t.setOnClickListener(new n());
        this.f33127S.setOnClickListener(new o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S1(View view) {
        String str;
        String str2;
        SharedPreferences sharedPreferences = this.f33147j0.getSharedPreferences("selectedPlayer", 0);
        this.f33153m0 = sharedPreferences;
        String strJ = "";
        String string = sharedPreferences.getString("selectedPlayer", "");
        SimpleDateFormat simpleDateFormat = this.f33130V;
        if (N1(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(this.f33147j0))), this.f33134Z.format(this.f33131W)) >= C2939c.p() && (str = this.f33135d) != null && this.f33136e != null && (!f33094N0.equals(str) || (this.f33135d != null && (str2 = this.f33136e) != null && !f33095O0.equals(str2)))) {
            this.f33105E0 = Boolean.FALSE;
        }
        if (this.f33105E0.booleanValue()) {
            try {
                C2328e c2328eC = C2325b.e(this.f33147j0).c().c();
                this.f33117K0 = c2328eC;
                if (c2328eC != null && c2328eC.c()) {
                    C2328e c2328e = this.f33117K0;
                    if (c2328e != null && c2328e.r() != null && this.f33117K0.r().j() != null && this.f33117K0.r().j().J() != null) {
                        strJ = this.f33117K0.r().j().J();
                    }
                    if (strJ.contains(this.f33177y0)) {
                        this.f33147j0.startActivity(new Intent(this.f33147j0, (Class<?>) ExpandedControlsActivity.class));
                        return;
                    } else {
                        AbstractC1902a.c(0, true, AbstractC1902a.a(this.f33165s0, "", "", 0, this.f33177y0, "videos/mp4", this.f33169u0, "", null), this.f33117K0, this.f33147j0);
                        return;
                    }
                }
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                U u9 = new U(this, view);
                u9.c().inflate(a7.h.f12930m, u9.b());
                ArrayList<ExternalPlayerModelClass> externalPlayer = new ExternalPlayerDataBase(this.f33147j0).getExternalPlayer();
                if (externalPlayer != null) {
                    try {
                        if (externalPlayer.size() > 0) {
                            u9.b().add(0, 0, 0, this.f33147j0.getResources().getString(a7.j.f13155V3));
                            ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
                            externalPlayerModelClass.setId(0);
                            externalPlayerModelClass.setAppname(this.f33147j0.getResources().getString(a7.j.f13272h5));
                            arrayList.add(externalPlayerModelClass);
                            int i9 = 0;
                            while (i9 < externalPlayer.size()) {
                                int i10 = i9 + 1;
                                u9.b().add(0, i10, 0, this.f33147j0.getResources().getString(a7.j.f13272h5) + " " + externalPlayer.get(i9).getAppname());
                                arrayList.add(externalPlayer.get(i9));
                                i9 = i10;
                            }
                            u9.f(new g(arrayList, string));
                            u9.e(new h());
                            u9.g();
                            return;
                        }
                    } catch (Exception unused) {
                        return;
                    }
                }
                if (this.f33105E0.booleanValue()) {
                    w.w0(this.f33147j0, string, this.f33179z0, this.f33171v0, this.f33173w0, this.f33175x0, this.f33165s0, this.f33177y0, 0, "", "", this.f33097A0);
                }
            } catch (Exception unused2) {
                if (this.f33105E0.booleanValue()) {
                    w.w0(this.f33147j0, string, this.f33179z0, this.f33171v0, this.f33173w0, this.f33175x0, this.f33165s0, this.f33177y0, 0, "", "", this.f33097A0);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T1(View view) {
        String str;
        String str2;
        SharedPreferences sharedPreferences = this.f33147j0.getSharedPreferences("selectedPlayer", 0);
        this.f33153m0 = sharedPreferences;
        String strJ = "";
        String string = sharedPreferences.getString("selectedPlayer", "");
        SimpleDateFormat simpleDateFormat = this.f33130V;
        if (N1(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(this.f33147j0))), this.f33134Z.format(this.f33131W)) >= C2939c.p() && (str = this.f33135d) != null && this.f33136e != null && (!f33094N0.equals(str) || (this.f33135d != null && (str2 = this.f33136e) != null && !f33095O0.equals(str2)))) {
            this.f33105E0 = Boolean.FALSE;
        }
        if (this.f33105E0.booleanValue()) {
            try {
                C2328e c2328eC = C2325b.e(this.f33147j0).c().c();
                this.f33117K0 = c2328eC;
                if (c2328eC != null && c2328eC.c()) {
                    C2328e c2328e = this.f33117K0;
                    if (c2328e != null && c2328e.r() != null && this.f33117K0.r().j() != null && this.f33117K0.r().j().J() != null) {
                        strJ = this.f33117K0.r().j().J();
                    }
                    if (strJ.contains(this.f33177y0)) {
                        this.f33147j0.startActivity(new Intent(this.f33147j0, (Class<?>) ExpandedControlsActivity.class));
                        return;
                    } else {
                        AbstractC1902a.c(0, true, AbstractC1902a.a(this.f33165s0, "", "", 0, this.f33177y0, "videos/mp4", this.f33169u0, "", null), this.f33117K0, this.f33147j0);
                        return;
                    }
                }
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                U u9 = new U(this, view);
                u9.c().inflate(a7.h.f12930m, u9.b());
                ArrayList<ExternalPlayerModelClass> externalPlayer = new ExternalPlayerDataBase(this.f33147j0).getExternalPlayer();
                if (externalPlayer != null) {
                    try {
                        if (externalPlayer.size() > 0) {
                            u9.b().add(0, 0, 0, this.f33147j0.getResources().getString(a7.j.f13155V3));
                            ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
                            externalPlayerModelClass.setId(0);
                            externalPlayerModelClass.setAppname(this.f33147j0.getResources().getString(a7.j.f13272h5));
                            arrayList.add(externalPlayerModelClass);
                            int i9 = 0;
                            while (i9 < externalPlayer.size()) {
                                int i10 = i9 + 1;
                                u9.b().add(0, i10, 0, this.f33147j0.getResources().getString(a7.j.f13272h5) + " " + externalPlayer.get(i9).getAppname());
                                arrayList.add(externalPlayer.get(i9));
                                i9 = i10;
                            }
                            u9.f(new i(arrayList, string));
                            u9.e(new j());
                            u9.g();
                            return;
                        }
                    } catch (Exception unused) {
                        return;
                    }
                }
                if (this.f33105E0.booleanValue()) {
                    w.w0(this.f33147j0, string, this.f33179z0, this.f33171v0, this.f33173w0, this.f33175x0, this.f33165s0, this.f33177y0, 0, "", "", this.f33097A0);
                }
            } catch (Exception unused2) {
                if (this.f33105E0.booleanValue()) {
                    w.w0(this.f33147j0, string, this.f33179z0, this.f33171v0, this.f33173w0, this.f33175x0, this.f33165s0, this.f33177y0, 0, "", "", this.f33097A0);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V1(View view) {
        String str = this.f33103D0;
        if (str == null || str.isEmpty()) {
            W1(this);
        } else {
            startActivity(new Intent(this, (Class<?>) YouTubePlayerActivity.class).putExtra("you_tube_trailer", this.f33103D0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X1() {
        this.f33155n0.deleteFavourite(this.f33177y0, SharepreferenceDBHandler.getUserID(this.f33147j0));
        if (Build.VERSION.SDK_INT <= 21) {
            this.f33170v.setImageResource(a7.e.f11970W);
        }
        this.f33170v.setImageDrawable(this.f33147j0.getResources().getDrawable(a7.e.f11970W, null));
    }

    private void a2(Context context, String str, String str2) {
        ImageView imageView;
        Resources resources;
        int i9;
        String str3;
        String str4;
        String str5;
        TextView textView;
        this.f33107F0 = new n7.h(this, context);
        (this.f33109G0.equals("mobile") ? this.f33125Q : this.f33124P).setVisibility(0);
        Intent intent = getIntent();
        if (intent != null) {
            try {
                this.f33179z0 = Integer.parseInt(intent.getStringExtra(AbstractC2237a.f44464Q));
            } catch (NumberFormatException unused) {
                this.f33179z0 = -1;
            }
            this.f33165s0 = intent.getStringExtra("movie");
            this.f33097A0 = intent.getStringExtra("categoryID");
            this.f33167t0 = intent.getStringExtra("selectedPlayer");
            this.f33169u0 = intent.getStringExtra("movie_icon");
            this.f33171v0 = intent.getStringExtra("streamType");
            this.f33173w0 = intent.getStringExtra("containerExtension");
            this.f33175x0 = intent.getStringExtra("num");
            String stringExtra = intent.getStringExtra("videoURL");
            this.f33177y0 = stringExtra;
            if (this.f33155n0.checkFavourite(stringExtra, SharepreferenceDBHandler.getUserID(context)).size() > 0) {
                if (Build.VERSION.SDK_INT <= 21) {
                    this.f33170v.setImageResource(a7.e.f11967V);
                }
                imageView = this.f33170v;
                resources = context.getResources();
                i9 = a7.e.f11967V;
            } else {
                if (Build.VERSION.SDK_INT <= 21) {
                    this.f33170v.setImageResource(a7.e.f11970W);
                }
                imageView = this.f33170v;
                resources = context.getResources();
                i9 = a7.e.f11970W;
            }
            imageView.setImageDrawable(resources.getDrawable(i9, null));
            ImageView imageView2 = this.f33170v;
            if (imageView2 != null) {
                imageView2.setOnFocusChangeListener(new t(imageView2));
                this.f33170v.setOnClickListener(new p(context));
            }
            if (context != null) {
                try {
                    String str6 = this.f33169u0;
                    if (str6 != null && !str6.isEmpty()) {
                        O1.g.u(getApplicationContext()).q(this.f33169u0).I().m(new q());
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
            String str7 = this.f33165s0;
            if (str7 != null && (textView = this.f33148k) != null) {
                textView.setText(str7);
            }
            String str8 = this.f33165s0;
            if (str8 == null || !str8.contains("(") || (str5 = this.f33165s0) == null || !str5.contains(")")) {
                String str9 = this.f33165s0;
                if (str9 == null || !str9.contains("[") || (str3 = this.f33165s0) == null || !str3.contains("]")) {
                    this.f33107F0.e(this.f33165s0);
                    return;
                }
                str4 = this.f33165s0.split("\\[")[0];
            } else {
                str4 = this.f33165s0.split("\\(")[0];
            }
            this.f33111H0 = str4;
            this.f33107F0.e(str4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // z7.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C(com.nst.iptvsmarterstvbox.model.callback.SearchTMDBMoviesCallback r14) {
        /*
            Method dump skipped, instruction units count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ViewDetailsTMDBActivity.C(com.nst.iptvsmarterstvbox.model.callback.SearchTMDBMoviesCallback):void");
    }

    public void P1() {
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0042 A[Catch: Exception -> 0x0049, TRY_LEAVE, TryCatch #0 {Exception -> 0x0049, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:8:0x0042), top: B:12:0x0002 }] */
    @Override // z7.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void U0(com.nst.iptvsmarterstvbox.model.callback.TMDBCastsCallback r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L42
            java.util.List r0 = r6.getCast()     // Catch: java.lang.Exception -> L49
            if (r0 == 0) goto L42
            java.util.List r0 = r6.getCast()     // Catch: java.lang.Exception -> L49
            int r0 = r0.size()     // Catch: java.lang.Exception -> L49
            if (r0 <= 0) goto L42
            androidx.recyclerview.widget.RecyclerView r0 = r5.f33126R     // Catch: java.lang.Exception -> L49
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager     // Catch: java.lang.Exception -> L49
            r2 = 0
            r1.<init>(r5, r2, r2)     // Catch: java.lang.Exception -> L49
            r0.setLayoutManager(r1)     // Catch: java.lang.Exception -> L49
            androidx.recyclerview.widget.RecyclerView r0 = r5.f33126R     // Catch: java.lang.Exception -> L49
            androidx.recyclerview.widget.c r1 = new androidx.recyclerview.widget.c     // Catch: java.lang.Exception -> L49
            r1.<init>()     // Catch: java.lang.Exception -> L49
            r0.setItemAnimator(r1)     // Catch: java.lang.Exception -> L49
            q7.f r0 = new q7.f     // Catch: java.lang.Exception -> L49
            java.util.List r6 = r6.getCast()     // Catch: java.lang.Exception -> L49
            android.content.Context r1 = r5.f33147j0     // Catch: java.lang.Exception -> L49
            java.lang.String r3 = r5.f33115J0     // Catch: java.lang.Exception -> L49
            r4 = 1
            r0.<init>(r6, r1, r4, r3)     // Catch: java.lang.Exception -> L49
            r5.f33113I0 = r0     // Catch: java.lang.Exception -> L49
            androidx.recyclerview.widget.RecyclerView r6 = r5.f33126R     // Catch: java.lang.Exception -> L49
            r6.setAdapter(r0)     // Catch: java.lang.Exception -> L49
            androidx.recyclerview.widget.RecyclerView r6 = r5.f33126R     // Catch: java.lang.Exception -> L49
            r6.setVisibility(r2)     // Catch: java.lang.Exception -> L49
            goto L49
        L42:
            androidx.recyclerview.widget.RecyclerView r6 = r5.f33126R     // Catch: java.lang.Exception -> L49
            r0 = 8
            r6.setVisibility(r0)     // Catch: java.lang.Exception -> L49
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ViewDetailsTMDBActivity.U0(com.nst.iptvsmarterstvbox.model.callback.TMDBCastsCallback):void");
    }

    public final void W1(ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
        View viewInflate = ((LayoutInflater) viewDetailsTMDBActivity.getSystemService("layout_inflater")).inflate(a7.g.f12832l3, (RelativeLayout) viewDetailsTMDBActivity.findViewById(a7.f.We));
        PopupWindow popupWindow = new PopupWindow(viewDetailsTMDBActivity);
        this.f33101C0 = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.f33101C0.setWidth(-1);
        this.f33101C0.setHeight(-1);
        this.f33101C0.setFocusable(true);
        this.f33101C0.setBackgroundDrawable(new BitmapDrawable());
        this.f33101C0.showAtLocation(viewInflate, 17, 0, 0);
        this.f33145i0 = (Button) viewInflate.findViewById(a7.f.f12157H0);
        this.f33132X = (Button) viewInflate.findViewById(a7.f.f12482o0);
        Button button = this.f33145i0;
        if (button != null) {
            button.setOnFocusChangeListener(new t(button));
        }
        Button button2 = this.f33132X;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new t(button2));
        }
        this.f33132X.setOnClickListener(new k());
        this.f33145i0.setOnClickListener(new l());
    }

    @Override // z7.k
    public void X0(TMDBTrailerCallback tMDBTrailerCallback) {
        LinearLayout linearLayout;
        if (tMDBTrailerCallback == null || tMDBTrailerCallback.getResults() == null || tMDBTrailerCallback.getResults().size() <= 0) {
            return;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < tMDBTrailerCallback.getResults().size(); i10++) {
            if (tMDBTrailerCallback.getResults().get(i10).getType().equals(HttpHeaders.TRAILER)) {
                String key = tMDBTrailerCallback.getResults().get(i10).getKey();
                this.f33103D0 = key;
                if (key == null || key.isEmpty()) {
                    TextView textView = this.f33122N;
                    i9 = 8;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    linearLayout = this.f33120M;
                    if (linearLayout == null) {
                        return;
                    }
                } else {
                    TextView textView2 = this.f33122N;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    linearLayout = this.f33120M;
                    if (linearLayout == null) {
                        return;
                    }
                }
                linearLayout.setVisibility(i9);
                return;
            }
        }
    }

    public void Y1() {
        this.f33150l.setOnClickListener(new View.OnClickListener() { // from class: p7.x1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46680a.S1(view);
            }
        });
        this.f33140g.setOnClickListener(new View.OnClickListener() { // from class: p7.y1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46683a.T1(view);
            }
        });
        this.f33118L.setOnClickListener(new View.OnClickListener() { // from class: p7.z1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46687a.U1(view);
            }
        });
        this.f33122N.setOnClickListener(new View.OnClickListener() { // from class: p7.A1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46576a.V1(view);
            }
        });
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public final void U1(ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
        View viewInflate = ((LayoutInflater) viewDetailsTMDBActivity.getSystemService("layout_inflater")).inflate(a7.g.f12802g3, (RelativeLayout) viewDetailsTMDBActivity.findViewById(a7.f.We));
        TextView textView = (TextView) viewInflate.findViewById(a7.f.Wh);
        this.f33139f0 = textView;
        textView.setText(this.f33133Y);
        PopupWindow popupWindow = new PopupWindow(viewDetailsTMDBActivity);
        this.f33101C0 = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.f33101C0.setWidth(-1);
        this.f33101C0.setHeight(-1);
        this.f33101C0.setFocusable(true);
        this.f33101C0.showAtLocation(viewInflate, 17, 0, 0);
        Button button = (Button) viewInflate.findViewById(a7.f.f12482o0);
        this.f33132X = button;
        if (button != null) {
            button.setOnFocusChangeListener(new t(button));
        }
        this.f33132X.setOnClickListener(new m());
    }

    @Override // z7.b
    public void a() {
    }

    @Override // z7.b
    public void b() {
        ProgressDialog progressDialog = this.f33149k0;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    @Override // z7.b
    public void d(String str) {
    }

    @Override // androidx.appcompat.app.b, D.AbstractActivityC0525h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return keyCode == 82 ? keyEvent.getAction() == 0 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent) : super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6 A[PHI: r3
      0x00a6: PHI (r3v3 android.widget.TextView) = (r3v2 android.widget.TextView), (r3v22 android.widget.TextView) binds: [B:37:0x00a4, B:28:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:50:0x0136
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // z7.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g0(com.nst.iptvsmarterstvbox.model.callback.TMDBGenreCallback r9) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ViewDetailsTMDBActivity.g0(com.nst.iptvsmarterstvbox.model.callback.TMDBGenreCallback):void");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
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
        super.onCreate(bundle);
        P1();
        setContentView(a7.g.f12866r1);
        Q1();
        Y1();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f33147j0).equals("api")) {
            Log.i("hereIS", "typeAPI");
            this.f33144i.setVisibility(0);
        } else {
            this.f33144i.setVisibility(8);
            Log.i("hereIS", "notTypeAPI");
        }
        AppBarLayout appBarLayout = this.f33146j;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(a7.e.f11917H));
        }
        this.f33109G0 = new C2858a(this.f33147j0).A().equals(AbstractC2237a.f44453K0) ? "tv" : "mobile";
        M1();
        this.f33131W = new Date();
        TextView textView = this.f33150l;
        if (textView != null) {
            textView.setOnFocusChangeListener(new t(textView));
            this.f33150l.requestFocus();
            this.f33150l.setFocusable(true);
        }
        f33094N0 = O1(this.f33147j0);
        Locale locale = Locale.US;
        this.f33134Z = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        TextView textView2 = this.f33118L;
        if (textView2 != null) {
            textView2.setOnFocusChangeListener(new t(textView2));
        }
        this.f33136e = w.S0(C2940d.d());
        f33095O0 = getApplicationContext().getPackageName();
        TextView textView3 = this.f33122N;
        if (textView3 != null) {
            textView3.setOnFocusChangeListener(new t(textView3));
        }
        this.f33135d = w.S0(C2937a.a());
        this.f33130V = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        getWindow().setFlags(1024, 1024);
        r1((Toolbar) findViewById(a7.f.kh));
        R1();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f33142h.x(a7.h.f12939v);
        this.f33143h0 = menu;
        this.f33141g0 = menu.getItem(1).getSubMenu().findItem(a7.f.f12239P2);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f33142h.getChildCount(); i9++) {
            if (this.f33142h.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f33142h.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        if (i9 != 82) {
            return super.onKeyUp(i9, keyEvent);
        }
        Menu menu = this.f33143h0;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(a7.f.f12239P2, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f33141g0 = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == a7.f.Gb) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == a7.f.Mb) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == a7.f.f12380e && (context = this.f33147j0) != null) {
            new a.C0158a(context, a7.k.f13456a).setTitle(getResources().getString(a7.j.f13250f3)).f(getResources().getString(a7.j.f13240e3)).j(getResources().getString(a7.j.f13132S8), new s()).g(getResources().getString(a7.j.f13231d4), new r()).n();
        }
        if (itemId == a7.f.fb) {
            a.C0158a c0158a = new a.C0158a(this);
            c0158a.setTitle(this.f33147j0.getResources().getString(a7.j.f13397u0));
            c0158a.f(this.f33147j0.getResources().getString(a7.j.f13134T0));
            c0158a.d(a7.e.f12056s1);
            c0158a.j(this.f33147j0.getResources().getString(a7.j.f13132S8), new a());
            c0158a.g(this.f33147j0.getResources().getString(a7.j.f13231d4), new b());
            c0158a.n();
        }
        if (itemId == a7.f.hb) {
            a.C0158a c0158a2 = new a.C0158a(this);
            c0158a2.setTitle(this.f33147j0.getResources().getString(a7.j.f13397u0));
            c0158a2.f(this.f33147j0.getResources().getString(a7.j.f13134T0));
            c0158a2.d(a7.e.f12056s1);
            c0158a2.j(this.f33147j0.getResources().getString(a7.j.f13132S8), new c());
            c0158a2.g(this.f33147j0.getResources().getString(a7.j.f13231d4), new d());
            c0158a2.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        P1();
        super.onResume();
        w.m(this.f33147j0);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f33151l0 = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f33151l0.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f33147j0 != null) {
            b();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        P1();
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00db A[PHI: r1
      0x00db: PHI (r1v2 android.widget.TextView) = (r1v1 android.widget.TextView), (r1v9 android.widget.TextView), (r1v10 android.widget.TextView) binds: [B:60:0x00d9, B:48:0x00bf, B:36:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // z7.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(com.nst.iptvsmarterstvbox.model.callback.TMDBCastsCallback r9) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ViewDetailsTMDBActivity.s(com.nst.iptvsmarterstvbox.model.callback.TMDBCastsCallback):void");
    }

    @Override // z7.k
    public void t(TMDBPersonInfoCallback tMDBPersonInfoCallback) {
    }
}
