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
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.google.gson.JsonElement;
import com.nst.iptvsmarterstvbox.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import com.nst.iptvsmarterstvbox.model.EpisodesUsingSinglton;
import com.nst.iptvsmarterstvbox.model.FavouriteDBModel;
import com.nst.iptvsmarterstvbox.model.callback.GetEpisdoeDetailsCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerCreatePlayerLinkCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerDeletePlayerLinkCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetAdCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetAllChannelsCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetGenresCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetSeriesCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetVODByCatCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetVodCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerLiveFavIdsCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerProfilesCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerSetLiveFavCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerShortEPGCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerTokenCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBCastsCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBTVShowsInfoCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBTrailerCallback;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.ExternalPlayerDataBase;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SeriesRecentWatchDatabase;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass;
import com.squareup.picasso.C;
import com.squareup.picasso.InterfaceC1611e;
import com.squareup.picasso.t;
import i7.AbstractC1902a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import k.U;
import m7.AbstractC2237a;
import m7.w;
import o4.C2325b;
import o4.C2328e;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;
import p4.C2434i;
import q7.C2622f;
import q7.C2630n;
import q7.C2635t;
import q7.U;
import q7.Z;
import q7.m0;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class SeriesDetailActivity extends androidx.appcompat.app.b implements View.OnClickListener, z7.l, z7.m, z7.g, z7.j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public TextView f32053A;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public String f32055A1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public TextView f32056B;

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public n7.e f32058B1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public TextView f32059C;

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public n7.g f32061C1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public TextView f32062D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public TextView f32065E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public TextView f32068F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public RatingBar f32071G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ImageView f32074H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public TextView f32077I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public DatabaseHandler f32078I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public TextView f32080J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public PopupWindow f32081J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public TextView f32083K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public Button f32084K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public TextView f32086L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public String f32087L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public LinearLayout f32088M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public String f32089M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ScrollView f32090N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public TextView f32091N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public NestedScrollView f32092O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public TextView f32093O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public LinearLayout f32094P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public MenuItem f32095P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public LinearLayout f32096Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public Menu f32097Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public LinearLayout f32098R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public Button f32099R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public LinearLayout f32100S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public LinearLayout f32102T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public n7.i f32103T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public LinearLayout f32104U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public n7.j f32105U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public LinearLayout f32106V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public LinearLayout f32108W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public LinearLayout f32110X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public LinearLayout f32112Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public SharedPreferences f32113Y0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextView f32114Z;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public SharedPreferences.Editor f32115Z0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public C2630n f32117b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public U f32118c1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public LinearLayout f32122e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public JSONArray f32123e1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public TextView f32125f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ImageView f32128g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public PopupWindow f32129g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public RecyclerView f32131h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public RecyclerView f32132h1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ProgressBar f32134i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public LinearLayout f32137j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public SeriesRecentWatchDatabase f32138j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public LinearLayout f32140k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public int f32141k1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public LinearLayout f32143l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public String f32144l1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public RelativeLayout f32146m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public RecyclerView f32149n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public C2328e f32150n1;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public TextView f32152o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public TextView f32155p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f32157q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ImageView f32158q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public C2622f f32161r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ImageView f32163s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public String f32164s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Toolbar f32166t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Context f32167t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AppBarLayout f32169u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ProgressDialog f32170u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RelativeLayout f32172v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public SharedPreferences f32173v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ImageView f32175w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public LiveStreamDBHandler f32176w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f32178x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f32181y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f32184z;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public int f32186z1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f32119d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f32121e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f32124f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f32127g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f32130h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f32133i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f32136j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f32139k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f32142l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f32145m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f32148n = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f32151o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f32154p = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f32160r = "";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f32179x0 = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f32182y0 = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public String f32185z0 = "";

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public String f32054A0 = "";

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public String f32057B0 = "";

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public String f32060C0 = "";

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public String f32063D0 = "";

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public String f32066E0 = "";

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public String f32069F0 = "";

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f32072G0 = -1;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public String f32075H0 = "";

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public String f32101S0 = "";

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public ArrayList f32107V0 = new ArrayList();

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public ArrayList f32109W0 = new ArrayList();

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public String f32111X0 = "";

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public ArrayList f32116a1 = new ArrayList();

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public List f32120d1 = new ArrayList();

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public ArrayList f32126f1 = new ArrayList();

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public ArrayList f32135i1 = new ArrayList();

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public boolean f32147m1 = false;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public int f32153o1 = 0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public String f32156p1 = "";

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public String f32159q1 = "";

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public String f32162r1 = "";

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public int f32165s1 = 0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public int f32168t1 = 0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public String f32171u1 = "mobile";

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public String f32174v1 = "";

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public String f32177w1 = "";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public int f32180x1 = 1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public int f32183y1 = 0;

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    public String f32064D1 = "";

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public String f32067E1 = "";

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public String f32070F1 = "0";

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    public ArrayList f32073G1 = new ArrayList();

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    public String f32076H1 = "";

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    public String f32079I1 = "";

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    public ArrayList f32082J1 = new ArrayList();

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    public ArrayList f32085K1 = new ArrayList();

    public class a implements InterfaceC1611e {
        public a() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
            SeriesDetailActivity.this.f32175w.setBackgroundResource(a7.e.f12040o1);
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesDetailActivity.this.X1(view);
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.dismiss();
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.n0(SeriesDetailActivity.this.f32167t0);
            SeriesDetailActivity.this.finishAffinity();
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class g implements U.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f32193a;

        public g(ArrayList arrayList) {
            this.f32193a = arrayList;
        }

        @Override // k.U.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            Context context;
            String str;
            int i9;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            try {
                ArrayList arrayList = this.f32193a;
                if (arrayList != null && arrayList.size() > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= this.f32193a.size()) {
                            break;
                        }
                        if (menuItem.getItemId() != i10) {
                            i10++;
                        } else if (menuItem.getItemId() == 0) {
                            if (SharepreferenceDBHandler.getCurrentAPPType(SeriesDetailActivity.this.f32167t0).equals("onestream_api")) {
                                context = SeriesDetailActivity.this.f32167t0;
                                str = "";
                                str2 = "series";
                                str3 = SeriesDetailActivity.this.f32156p1;
                                str4 = "0";
                                str5 = SeriesDetailActivity.this.f32159q1;
                                SeriesDetailActivity seriesDetailActivity = SeriesDetailActivity.this;
                                str6 = seriesDetailActivity.f32144l1;
                                str7 = seriesDetailActivity.f32079I1;
                                str8 = SeriesDetailActivity.this.f32119d;
                                i9 = 0;
                            } else {
                                context = SeriesDetailActivity.this.f32167t0;
                                str = "";
                                i9 = SeriesDetailActivity.this.f32153o1;
                                str2 = "series";
                                str3 = SeriesDetailActivity.this.f32156p1;
                                str4 = "0";
                                str5 = SeriesDetailActivity.this.f32159q1;
                                SeriesDetailActivity seriesDetailActivity2 = SeriesDetailActivity.this;
                                str6 = seriesDetailActivity2.f32144l1;
                                str7 = "";
                                str8 = seriesDetailActivity2.f32119d;
                            }
                            w.v0(context, str, i9, str2, str3, str4, str5, null, str6, str7, str8);
                        } else {
                            String strG = w.G(w.U(SeriesDetailActivity.this.f32167t0, SeriesDetailActivity.this.f32153o1, SeriesDetailActivity.this.f32156p1, "series"));
                            if (SharepreferenceDBHandler.getCurrentAPPType(SeriesDetailActivity.this.f32167t0).equals("onestream_api")) {
                                Intent intent = new Intent(SeriesDetailActivity.this.f32167t0, (Class<?>) PlayExternalPlayerActivity.class);
                                intent.putExtra("url", SeriesDetailActivity.this.f32144l1);
                                intent.putExtra("app_name", ((ExternalPlayerModelClass) this.f32193a.get(i10)).getAppname());
                                intent.putExtra("packagename", ((ExternalPlayerModelClass) this.f32193a.get(i10)).getPackagename());
                                SeriesDetailActivity.this.f32167t0.startActivity(intent);
                            } else {
                                Intent intent2 = new Intent(SeriesDetailActivity.this.f32167t0, (Class<?>) PlayExternalPlayerActivity.class);
                                intent2.putExtra("url", strG);
                                intent2.putExtra("app_name", ((ExternalPlayerModelClass) this.f32193a.get(i10)).getAppname());
                                intent2.putExtra("packagename", ((ExternalPlayerModelClass) this.f32193a.get(i10)).getPackagename());
                                SeriesDetailActivity.this.f32167t0.startActivity(intent2);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        }
    }

    public class h implements U.c {
        public h() {
        }

        @Override // k.U.c
        public void a(k.U u9) {
        }
    }

    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesDetailActivity.this.f32129g1.dismiss();
        }
    }

    public class j implements NestedScrollView.c {
        public j() {
        }

        @Override // androidx.core.widget.NestedScrollView.c
        public void a(NestedScrollView nestedScrollView, int i9, int i10, int i11, int i12) {
            if (i10 == nestedScrollView.getChildAt(0).getMeasuredHeight() - nestedScrollView.getMeasuredHeight()) {
                SeriesDetailActivity.this.f32180x1++;
                Log.e("honey", "onScrollChange page:" + SeriesDetailActivity.this.f32180x1 + " Total:" + SeriesDetailActivity.this.f32183y1);
                SeriesDetailActivity seriesDetailActivity = SeriesDetailActivity.this;
                if (seriesDetailActivity.f32180x1 <= seriesDetailActivity.f32183y1) {
                    w.M0(seriesDetailActivity);
                    try {
                        n7.e eVar = SeriesDetailActivity.this.f32058B1;
                        SeriesDetailActivity seriesDetailActivity2 = SeriesDetailActivity.this;
                        eVar.j(seriesDetailActivity2.f32174v1, seriesDetailActivity2.f32177w1, seriesDetailActivity2.f32142l, String.valueOf(SeriesDetailActivity.this.f32180x1), SeriesDetailActivity.this.f32145m);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
            }
        }
    }

    public class k implements View.OnClickListener {
        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesDetailActivity.this.f32152o0.setBackgroundResource(a7.e.f11964U);
            SeriesDetailActivity.this.f32155p0.setBackgroundResource(a7.e.f11955R);
            RecyclerView recyclerView = SeriesDetailActivity.this.f32131h0;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            RecyclerView recyclerView2 = SeriesDetailActivity.this.f32149n0;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(0);
            }
        }
    }

    public class l implements View.OnClickListener {
        public l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesDetailActivity.this.f32081J0.dismiss();
        }
    }

    public class m implements View.OnClickListener {
        public m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesDetailActivity.this.f32081J0.dismiss();
        }
    }

    public class n implements View.OnClickListener {
        public n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesDetailActivity.this.f32081J0.dismiss();
        }
    }

    public class o implements View.OnClickListener {
        public o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesDetailActivity.this.f32155p0.setBackgroundResource(a7.e.f11964U);
            SeriesDetailActivity.this.f32152o0.setBackgroundResource(a7.e.f11955R);
            RecyclerView recyclerView = SeriesDetailActivity.this.f32149n0;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            RecyclerView recyclerView2 = SeriesDetailActivity.this.f32131h0;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(0);
            }
        }
    }

    public class p implements View.OnClickListener {
        public p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(SeriesDetailActivity.this.f32167t0);
        }
    }

    public class q implements View.OnClickListener {
        public q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesDetailActivity.this.onBackPressed();
        }
    }

    public class r implements C {
        public r() {
        }

        @Override // com.squareup.picasso.C
        public void a(Drawable drawable) {
            Log.d("TAG", "FAILED");
        }

        @Override // com.squareup.picasso.C
        public void b(Bitmap bitmap, t.e eVar) {
            SeriesDetailActivity.this.f32169u.setBackground(new BitmapDrawable(SeriesDetailActivity.this.f32167t0.getResources(), bitmap));
            SeriesDetailActivity seriesDetailActivity = SeriesDetailActivity.this;
            seriesDetailActivity.f32146m0.setBackgroundColor(seriesDetailActivity.getResources().getColor(a7.c.f11844B));
            SeriesDetailActivity seriesDetailActivity2 = SeriesDetailActivity.this;
            seriesDetailActivity2.f32166t.setBackgroundColor(seriesDetailActivity2.getResources().getColor(a7.c.f11844B));
        }

        @Override // com.squareup.picasso.C
        public void c(Drawable drawable) {
            Log.d("TAG", "Prepare Load");
        }
    }

    public class s implements C {
        public s() {
        }

        @Override // com.squareup.picasso.C
        public void a(Drawable drawable) {
            Log.d("TAG", "FAILED");
        }

        @Override // com.squareup.picasso.C
        public void b(Bitmap bitmap, t.e eVar) {
            SeriesDetailActivity.this.f32169u.setBackground(new BitmapDrawable(SeriesDetailActivity.this.f32167t0.getResources(), bitmap));
            SeriesDetailActivity seriesDetailActivity = SeriesDetailActivity.this;
            seriesDetailActivity.f32146m0.setBackgroundColor(seriesDetailActivity.getResources().getColor(a7.c.f11844B));
            SeriesDetailActivity seriesDetailActivity2 = SeriesDetailActivity.this;
            seriesDetailActivity2.f32166t.setBackgroundColor(seriesDetailActivity2.getResources().getColor(a7.c.f11844B));
        }

        @Override // com.squareup.picasso.C
        public void c(Drawable drawable) {
            Log.d("TAG", "Prepare Load");
        }
    }

    public class t implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f32207a;

        public t(Context context) {
            this.f32207a = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (!SharepreferenceDBHandler.getCurrentAPPType(this.f32207a).equals("stalker_api")) {
                    DatabaseHandler databaseHandler = SeriesDetailActivity.this.f32078I0;
                    SeriesDetailActivity seriesDetailActivity = SeriesDetailActivity.this;
                    if (databaseHandler.checkFavourite(seriesDetailActivity.f32157q, seriesDetailActivity.f32142l, "series", SharepreferenceDBHandler.getUserID(this.f32207a), SeriesDetailActivity.this.f32160r).size() > 0) {
                        SeriesDetailActivity.this.Y1();
                    } else {
                        SeriesDetailActivity.this.Q1();
                    }
                } else if (SeriesDetailActivity.this.f32186z1 == 1) {
                    SeriesDetailActivity.this.Z1();
                } else {
                    SeriesDetailActivity.this.R1();
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public class u extends AsyncTask {
        public u() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List doInBackground(String... strArr) {
            try {
                return SeriesDetailActivity.this.h2();
            } catch (Exception e9) {
                Log.e("honeya", "doInBackground: " + e9.getMessage());
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List list) {
            TextView textView;
            super.onPostExecute(list);
            if (list != null) {
                try {
                    if (list.get(0) != null && !((String) list.get(0)).equals("") && (textView = SeriesDetailActivity.this.f32184z) != null) {
                        textView.setText((CharSequence) list.get(0));
                    }
                    if (list.get(1) != null && !((String) list.get(1)).equals("") && SeriesDetailActivity.this.f32134i0 != null) {
                        if (((String) list.get(1)).equals("gone")) {
                            SeriesDetailActivity.this.f32134i0.setVisibility(8);
                        }
                        if (((String) list.get(1)).equals("visible")) {
                            SeriesDetailActivity.this.f32134i0.setVisibility(0);
                        }
                    }
                    if (list.get(2) != null && !((String) list.get(2)).equals("") && SeriesDetailActivity.this.f32134i0 != null) {
                        if (!((String) list.get(2)).equals("0")) {
                            SeriesDetailActivity.this.f32134i0.setProgress(w.r0((String) list.get(2)));
                            SeriesDetailActivity.this.f32134i0.setVisibility(0);
                        } else if (SeriesDetailActivity.this.f32134i0.getVisibility() == 0) {
                            SeriesDetailActivity.this.f32134i0.setProgress(w.r0((String) list.get(2)));
                            SeriesDetailActivity.this.f32134i0.setVisibility(8);
                        }
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            if (SeriesDetailActivity.this.f32117b1 != null) {
                SeriesDetailActivity.this.f32117b1.w();
            } else {
                SeriesDetailActivity seriesDetailActivity = SeriesDetailActivity.this;
                if (seriesDetailActivity.f32149n0 != null) {
                    Context context = seriesDetailActivity.f32167t0;
                    String str = SeriesDetailActivity.this.f32136j;
                    List list2 = SeriesDetailActivity.this.f32120d1;
                    SeriesDetailActivity seriesDetailActivity2 = SeriesDetailActivity.this;
                    seriesDetailActivity.f32117b1 = new C2630n(context, str, null, list2, "", seriesDetailActivity2.f32171u1, seriesDetailActivity2.f32149n0);
                    SeriesDetailActivity seriesDetailActivity3 = SeriesDetailActivity.this;
                    seriesDetailActivity3.f32149n0.setAdapter(seriesDetailActivity3.f32117b1);
                }
            }
            if (SeriesDetailActivity.this.f32170u0 == null || !SeriesDetailActivity.this.f32170u0.isShowing()) {
                return;
            }
            SeriesDetailActivity.this.f32170u0.dismiss();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (SeriesDetailActivity.this.f32170u0 == null || SeriesDetailActivity.this.f32170u0.isShowing()) {
                return;
            }
            SeriesDetailActivity.this.f32170u0.show();
        }
    }

    public class v implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f32210a;

        public v(View view) {
            this.f32210a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f32210a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f32210a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            View view2;
            float f9;
            View view3;
            int i9;
            if (z9) {
                f9 = z9 ? 1.05f : 1.0f;
                View view4 = this.f32210a;
                if (view4 == null || view4.getTag() == null) {
                    return;
                }
                if (this.f32210a.getTag().equals("1")) {
                    a(f9);
                    b(f9);
                    view3 = SeriesDetailActivity.this.f32137j0;
                } else if (this.f32210a.getTag().equals("2")) {
                    a(f9);
                    b(f9);
                    view3 = SeriesDetailActivity.this.f32140k0;
                } else if (this.f32210a.getTag().equals("3")) {
                    a(f9);
                    b(f9);
                    view3 = this.f32210a;
                } else if (this.f32210a.getTag().equals("5")) {
                    a(f9);
                    b(f9);
                    view3 = SeriesDetailActivity.this.f32143l0;
                } else {
                    View view5 = this.f32210a;
                    if (view5 == null || view5.getTag() == null || !this.f32210a.getTag().equals("8")) {
                        View view6 = this.f32210a;
                        if (view6 == null || view6.getTag() == null || !this.f32210a.getTag().equals("10")) {
                            View view7 = this.f32210a;
                            if (view7 == null || view7.getTag() == null || !this.f32210a.getTag().equals("11")) {
                                View view8 = this.f32210a;
                                float f10 = (view8 == null || view8.getTag() == null || !this.f32210a.getTag().equals("12")) ? 1.15f : 1.2f;
                                a(f10);
                                b(f10);
                                return;
                            }
                            RecyclerView recyclerView = SeriesDetailActivity.this.f32131h0;
                            if (recyclerView == null || recyclerView.getVisibility() != 0) {
                                view3 = SeriesDetailActivity.this.f32155p0;
                                i9 = a7.e.f11961T;
                            } else {
                                view3 = SeriesDetailActivity.this.f32155p0;
                                i9 = a7.e.f11964U;
                            }
                        } else {
                            RecyclerView recyclerView2 = SeriesDetailActivity.this.f32149n0;
                            if (recyclerView2 == null || recyclerView2.getVisibility() != 0) {
                                view3 = SeriesDetailActivity.this.f32152o0;
                                i9 = a7.e.f11961T;
                            } else {
                                view3 = SeriesDetailActivity.this.f32152o0;
                                i9 = a7.e.f11964U;
                            }
                        }
                    } else {
                        a(f9);
                        b(f9);
                        view3 = SeriesDetailActivity.this.f32099R0;
                        i9 = a7.e.f12010h;
                    }
                }
                i9 = a7.e.f12042p;
            } else {
                if (z9 || (view2 = this.f32210a) == null || view2.getTag() == null) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                a(f9);
                b(f9);
                if (this.f32210a.getTag().equals("1")) {
                    view3 = SeriesDetailActivity.this.f32137j0;
                } else if (this.f32210a.getTag().equals("2")) {
                    view3 = SeriesDetailActivity.this.f32140k0;
                } else {
                    if (this.f32210a.getTag().equals("3")) {
                        view3 = this.f32210a;
                    } else if (this.f32210a.getTag().equals("5")) {
                        view3 = SeriesDetailActivity.this.f32143l0;
                    } else if (this.f32210a.getTag() != null && this.f32210a.getTag().equals("8")) {
                        view3 = SeriesDetailActivity.this.f32099R0;
                    } else if (this.f32210a.getTag() != null && this.f32210a.getTag().equals("10")) {
                        RecyclerView recyclerView3 = SeriesDetailActivity.this.f32149n0;
                        if (recyclerView3 == null || recyclerView3.getVisibility() != 0) {
                            view3 = SeriesDetailActivity.this.f32152o0;
                            i9 = a7.e.f11955R;
                        } else {
                            view3 = SeriesDetailActivity.this.f32152o0;
                            i9 = a7.e.f11958S;
                        }
                    } else {
                        if (this.f32210a.getTag() == null || !this.f32210a.getTag().equals("11")) {
                            return;
                        }
                        SeriesDetailActivity.this.f32155p0.setBackgroundResource(a7.e.f11955R);
                        RecyclerView recyclerView4 = SeriesDetailActivity.this.f32131h0;
                        if (recyclerView4 == null || recyclerView4.getVisibility() != 0) {
                            view3 = SeriesDetailActivity.this.f32155p0;
                            i9 = a7.e.f11955R;
                        } else {
                            view3 = SeriesDetailActivity.this.f32155p0;
                            i9 = a7.e.f11958S;
                        }
                    }
                    i9 = a7.e.f12038o;
                }
                i9 = a7.e.f11891A1;
            }
            view3.setBackgroundResource(i9);
        }
    }

    private void S1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private void V1() {
        this.f32176w0 = new LiveStreamDBHandler(this.f32167t0);
        this.f32058B1 = new n7.e(this, this.f32167t0);
        this.f32061C1 = new n7.g(this, this.f32167t0);
        TextView textView = this.f32181y;
        if (textView != null) {
            textView.setSelected(true);
        }
        this.f32135i1.clear();
        this.f32073G1.clear();
        this.f32107V0.clear();
        if (this.f32171u1.equals("mobile")) {
            try {
                this.f32150n1 = C2325b.e(this.f32167t0).c().c();
            } catch (Exception unused) {
            }
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f32170u0 = progressDialog;
        progressDialog.setCanceledOnTouchOutside(false);
        this.f32170u0.setMessage(this.f32167t0.getResources().getString(a7.j.f13392t5));
        this.f32170u0.show();
        this.f32138j1 = new SeriesRecentWatchDatabase(this.f32167t0);
        SharedPreferences sharedPreferences = getSharedPreferences("sort_episodes", 0);
        this.f32113Y0 = sharedPreferences;
        this.f32115Z0 = sharedPreferences.edit();
        if (this.f32113Y0.getString("sort", "").equals("")) {
            this.f32115Z0.putString("sort", "0");
            this.f32115Z0.apply();
        }
        RecyclerView recyclerView = this.f32149n0;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
            this.f32149n0.setItemAnimator(new androidx.recyclerview.widget.c());
        }
        this.f32078I0 = new DatabaseHandler(this.f32167t0);
        this.f32184z.requestFocus();
        this.f32184z.setFocusable(true);
        SharedPreferences sharedPreferences2 = getSharedPreferences("loginPrefs", 0);
        this.f32173v0 = sharedPreferences2;
        String string = sharedPreferences2.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        String string2 = this.f32173v0.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        if (string == null || string2 == null || string.isEmpty() || string2.isEmpty()) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else {
            g2(this.f32167t0, string, string2);
        }
    }

    @Override // z7.l
    public void C0(TMDBTVShowsInfoCallback tMDBTVShowsInfoCallback) {
    }

    @Override // z7.j
    public void D0(String str) {
    }

    @Override // z7.g
    public void F(StalkerGetSeriesCategoriesCallback stalkerGetSeriesCategoriesCallback) {
    }

    @Override // z7.g
    public void G(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, Z.E e9, int i9) {
        if (stalkerSetLiveFavCallback != null) {
            try {
                if (stalkerSetLiveFavCallback.getJs() == null || !stalkerSetLiveFavCallback.getJs().equals(Boolean.TRUE)) {
                    return;
                }
                String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f32167t0);
                String loggedInMacAddress = SharepreferenceDBHandler.getLoggedInMacAddress(this.f32167t0);
                this.f32064D1 = "add";
                this.f32058B1.f(loggedInMacAddress, stalkerToken, i9);
            } catch (Exception unused) {
                w.X();
            }
        }
    }

    @Override // z7.g
    public void G0(StalkerTokenCallback stalkerTokenCallback) {
    }

    @Override // z7.g
    public void H(String str) {
    }

    @Override // z7.l
    public void H0(TMDBTrailerCallback tMDBTrailerCallback) {
    }

    @Override // z7.g
    public void I(m0.x xVar, int i9) {
    }

    @Override // z7.m
    public void I0(JsonElement jsonElement) {
        JSONArray jSONArray;
        if (jsonElement != null) {
            try {
                JSONObject jSONObject = new JSONObject(jsonElement.toString());
                String string = jSONObject.getString("seasons");
                String string2 = jSONObject.getString("episodes");
                try {
                    if (jSONObject.getJSONObject("info").getJSONArray("backdrop_path") != null) {
                        this.f32123e1 = jSONObject.getJSONObject("info").getJSONArray("backdrop_path");
                    }
                    if (this.f32169u != null && (jSONArray = this.f32123e1) != null && jSONArray.length() > 0) {
                        this.f32154p = this.f32123e1.get(new Random().nextInt(this.f32123e1.length())).toString();
                        Context context = this.f32167t0;
                        if (context != null) {
                            com.squareup.picasso.t.q(context).l(this.f32154p).i(new r());
                        }
                    }
                } catch (Exception unused) {
                }
                if (!string.equals(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                    try {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("seasons");
                        int length = jSONArray2.length();
                        this.f32109W0.clear();
                        for (int i9 = 0; i9 < length; i9++) {
                            if (jSONArray2.get(i9) instanceof JSONObject) {
                                b2((JSONObject) jSONArray2.get(i9));
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    try {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("seasons");
                        Iterator<String> itKeys = jSONObject2.keys();
                        this.f32109W0.clear();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            if (jSONObject2.get(next) instanceof JSONObject) {
                                c2(jSONObject2, next);
                            }
                        }
                    } catch (Exception unused3) {
                    }
                }
                if (!string2.equals(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                    try {
                        JSONArray jSONArray3 = jSONObject.getJSONArray("episodes");
                        int length2 = jSONArray3.length();
                        this.f32107V0.clear();
                        for (int i10 = 0; i10 < length2; i10++) {
                            if (jSONArray3.get(i10) instanceof JSONArray) {
                                JSONArray jSONArray4 = new JSONArray(jSONArray3.get(i10).toString());
                                T1(jSONArray4, jSONArray4.length());
                            }
                        }
                    } catch (Exception unused4) {
                    }
                    JSONObject jSONObject3 = jSONObject.getJSONObject("episodes");
                    this.f32107V0.clear();
                    Iterator<String> itKeys2 = jSONObject3.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        if (jSONObject3.get(next2) instanceof JSONArray) {
                            JSONArray jSONArray5 = new JSONArray(jSONObject3.get(next2).toString());
                            T1(jSONArray5, jSONArray5.length());
                        }
                    }
                }
            } catch (Exception unused5) {
            }
        }
        e2();
        this.f32103T0.d(this.f32121e);
    }

    @Override // z7.g
    public void M(StalkerGetAdCallback stalkerGetAdCallback, int i9) {
        try {
            w.X();
            String str = this.f32064D1;
            if (str == null || !str.equals("add")) {
                this.f32186z1 = 0;
                Y1();
            } else {
                this.f32186z1 = 1;
                Q1();
            }
        } catch (Exception e9) {
            Log.e("honey", "Exception: " + e9.getMessage());
        }
    }

    @Override // z7.j
    public void M0(String str) {
        try {
            w.X();
        } catch (Exception unused) {
        }
    }

    @Override // z7.g
    public void O(Z.E e9, int i9) {
        try {
            String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f32167t0);
            String loggedInMacAddress = SharepreferenceDBHandler.getLoggedInMacAddress(this.f32167t0);
            this.f32064D1 = "remove";
            this.f32058B1.f(loggedInMacAddress, stalkerToken, i9);
        } catch (Exception unused) {
            w.X();
        }
    }

    @Override // z7.j
    public void P(String str) {
    }

    @Override // z7.g
    public void P0(String str) {
    }

    @Override // z7.l
    public void Q(TMDBCastsCallback tMDBCastsCallback) {
        if (tMDBCastsCallback != null) {
            try {
                if (tMDBCastsCallback.getCast() == null || tMDBCastsCallback.getCast().size() <= 0) {
                    return;
                }
                this.f32131h0.setLayoutManager(new LinearLayoutManager(this, 0, false));
                this.f32131h0.setItemAnimator(null);
                C2622f c2622f = new C2622f(tMDBCastsCallback.getCast(), this.f32167t0, true, this.f32154p);
                this.f32161r0 = c2622f;
                this.f32131h0.setAdapter(c2622f);
            } catch (Exception unused) {
            }
        }
    }

    public final void Q1() {
        try {
            FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
            favouriteDBModel.setCategoryID(this.f32142l);
            favouriteDBModel.setStreamID(this.f32157q);
            favouriteDBModel.setStreamIDOneStream(this.f32160r);
            favouriteDBModel.setName(this.f32121e);
            favouriteDBModel.setNum(this.f32069F0);
            favouriteDBModel.setUserID(SharepreferenceDBHandler.getUserID(this.f32167t0));
            this.f32078I0.addToFavourite(favouriteDBModel, "series");
            if (Build.VERSION.SDK_INT <= 21) {
                this.f32074H.setImageResource(a7.e.f11967V);
            }
            this.f32074H.setImageDrawable(this.f32167t0.getResources().getDrawable(a7.e.f11967V, null));
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // z7.m
    public void R(JsonElement jsonElement) {
        JSONArray jSONArray;
        if (jsonElement != null) {
            try {
                JSONObject jSONObject = new JSONObject(jsonElement.toString());
                String string = jSONObject.getString("seasons");
                String string2 = jSONObject.getString("episodes");
                try {
                    if (jSONObject.getJSONObject("info").getJSONArray("backdrop_path") != null) {
                        this.f32123e1 = jSONObject.getJSONObject("info").getJSONArray("backdrop_path");
                    }
                    if (this.f32169u != null && (jSONArray = this.f32123e1) != null && jSONArray.length() > 0) {
                        String string3 = this.f32123e1.get(new Random().nextInt(this.f32123e1.length())).toString();
                        this.f32154p = string3;
                        if (this.f32167t0 != null && !string3.isEmpty()) {
                            com.squareup.picasso.t.q(this.f32167t0).l(this.f32154p).i(new s());
                        }
                    }
                } catch (Exception unused) {
                }
                if (!string.equals(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                    try {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("seasons");
                        int length = jSONArray2.length();
                        this.f32109W0.clear();
                        for (int i9 = 0; i9 < length; i9++) {
                            if (jSONArray2.get(i9) instanceof JSONObject) {
                                b2((JSONObject) jSONArray2.get(i9));
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    try {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("seasons");
                        Iterator<String> itKeys = jSONObject2.keys();
                        this.f32109W0.clear();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            if (jSONObject2.get(next) instanceof JSONObject) {
                                c2(jSONObject2, next);
                            }
                        }
                    } catch (Exception unused3) {
                    }
                }
                if (!string2.equals(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                    try {
                        JSONArray jSONArray3 = jSONObject.getJSONArray("episodes");
                        int length2 = jSONArray3.length();
                        this.f32107V0.clear();
                        for (int i10 = 0; i10 < length2; i10++) {
                            if (jSONArray3.get(i10) instanceof JSONArray) {
                                JSONArray jSONArray4 = new JSONArray(jSONArray3.get(i10).toString());
                                T1(jSONArray4, jSONArray4.length());
                            }
                        }
                    } catch (Exception unused4) {
                    }
                    JSONObject jSONObject3 = jSONObject.getJSONObject("episodes");
                    this.f32107V0.clear();
                    Iterator<String> itKeys2 = jSONObject3.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        if (jSONObject3.get(next2) instanceof JSONArray) {
                            JSONArray jSONArray5 = new JSONArray(jSONObject3.get(next2).toString());
                            T1(jSONArray5, jSONArray5.length());
                        }
                    }
                }
            } catch (Exception unused5) {
            }
        }
        this.f32164s0 = SharepreferenceDBHandler.getOneStreamToken(this.f32167t0);
        e2();
        this.f32103T0.d(this.f32121e);
    }

    public final void R1() {
        w.N0(this.f32167t0);
        String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f32167t0);
        try {
            this.f32058B1.d(SharepreferenceDBHandler.getLoggedInMacAddress(this.f32167t0), stalkerToken, null, String.valueOf(this.f32157q), 0);
        } catch (Exception unused) {
        }
    }

    @Override // z7.j
    public void T0(StalkerDeletePlayerLinkCallback stalkerDeletePlayerLinkCallback) {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(45:187|5|6|(1:11)(1:10)|12|(1:14)(1:16)|15|17|(1:22)(1:21)|(3:185|23|(1:32)(1:25))|35|(1:40)(1:39)|(3:199|41|(1:50)(1:43))|(3:201|53|(1:62)(1:55))|65|(1:71)(1:69)|70|72|(1:74)|(3:181|75|(1:80)(1:79))|(2:183|88)|(27:90|91|191|92|(1:94)|98|197|101|(2:103|(7:105|106|175|107|108|209|109)(1:112))(1:113)|207|116|(19:118|119|179|120|(1:122)|177|128|(15:130|131|195|132|(1:134)|203|140|(11:142|143|205|144|(1:146)|189|152|(7:154|155|193|156|(1:158)|164|165)(1:160)|161|164|165)(1:148)|149|189|152|(0)(0)|161|164|165)(1:136)|137|203|140|(0)(0)|149|189|152|(0)(0)|161|164|165)(1:124)|125|177|128|(0)(0)|137|203|140|(0)(0)|149|189|152|(0)(0)|161|164|165)(1:96)|97|98|197|101|(0)(0)|207|116|(0)(0)|125|177|128|(0)(0)|137|203|140|(0)(0)|149|189|152|(0)(0)|161|164|165) */
    /* JADX WARN: Can't wrap try/catch for region: R(51:4|187|5|6|(1:11)(1:10)|12|(1:14)(1:16)|15|17|(1:22)(1:21)|185|23|(1:32)(1:25)|35|(1:40)(1:39)|(3:199|41|(1:50)(1:43))|(3:201|53|(1:62)(1:55))|65|(1:71)(1:69)|70|72|(1:74)|181|75|(1:80)(1:79)|183|88|(27:90|91|191|92|(1:94)|98|197|101|(2:103|(7:105|106|175|107|108|209|109)(1:112))(1:113)|207|116|(19:118|119|179|120|(1:122)|177|128|(15:130|131|195|132|(1:134)|203|140|(11:142|143|205|144|(1:146)|189|152|(7:154|155|193|156|(1:158)|164|165)(1:160)|161|164|165)(1:148)|149|189|152|(0)(0)|161|164|165)(1:136)|137|203|140|(0)(0)|149|189|152|(0)(0)|161|164|165)(1:124)|125|177|128|(0)(0)|137|203|140|(0)(0)|149|189|152|(0)(0)|161|164|165)(1:96)|97|98|197|101|(0)(0)|207|116|(0)(0)|125|177|128|(0)(0)|137|203|140|(0)(0)|149|189|152|(0)(0)|161|164|165) */
    /* JADX WARN: Can't wrap try/catch for region: R(55:4|187|5|6|(1:11)(1:10)|12|(1:14)(1:16)|15|17|(1:22)(1:21)|185|23|(1:32)(1:25)|35|(1:40)(1:39)|199|41|(1:50)(1:43)|201|53|(1:62)(1:55)|65|(1:71)(1:69)|70|72|(1:74)|181|75|(1:80)(1:79)|183|88|(27:90|91|191|92|(1:94)|98|197|101|(2:103|(7:105|106|175|107|108|209|109)(1:112))(1:113)|207|116|(19:118|119|179|120|(1:122)|177|128|(15:130|131|195|132|(1:134)|203|140|(11:142|143|205|144|(1:146)|189|152|(7:154|155|193|156|(1:158)|164|165)(1:160)|161|164|165)(1:148)|149|189|152|(0)(0)|161|164|165)(1:136)|137|203|140|(0)(0)|149|189|152|(0)(0)|161|164|165)(1:124)|125|177|128|(0)(0)|137|203|140|(0)(0)|149|189|152|(0)(0)|161|164|165)(1:96)|97|98|197|101|(0)(0)|207|116|(0)(0)|125|177|128|(0)(0)|137|203|140|(0)(0)|149|189|152|(0)(0)|161|164|165) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0212, code lost:
    
        r24 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0243, code lost:
    
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x026d, code lost:
    
        r3 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0299, code lost:
    
        r19 = r2;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02c9, code lost:
    
        r17 = r2;
        r2 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e1 A[Catch: Exception -> 0x0212, TryCatch #11 {Exception -> 0x0212, blocks: (B:101:0x01db, B:103:0x01e1, B:105:0x01ef), top: B:197:0x01db }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021a A[Catch: Exception -> 0x0222, TRY_LEAVE, TryCatch #17 {Exception -> 0x0222, blocks: (B:109:0x01ff, B:113:0x021a), top: B:209:0x01ff }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x022b A[Catch: Exception -> 0x0243, TRY_LEAVE, TryCatch #16 {Exception -> 0x0243, blocks: (B:116:0x0225, B:118:0x022b), top: B:207:0x0225 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0255 A[Catch: Exception -> 0x026d, TRY_LEAVE, TryCatch #1 {Exception -> 0x026d, blocks: (B:128:0x024f, B:130:0x0255), top: B:177:0x024f }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x027f A[Catch: Exception -> 0x0299, TRY_LEAVE, TryCatch #14 {Exception -> 0x0299, blocks: (B:140:0x0279, B:142:0x027f), top: B:203:0x0279 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02af A[Catch: Exception -> 0x02c9, TRY_LEAVE, TryCatch #7 {Exception -> 0x02c9, blocks: (B:152:0x02a9, B:154:0x02af), top: B:189:0x02a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void T1(org.json.JSONArray r27, int r28) {
        /*
            Method dump skipped, instruction units count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SeriesDetailActivity.T1(org.json.JSONArray, int):void");
    }

    @Override // z7.g
    public void U(StalkerLiveFavIdsCallback stalkerLiveFavIdsCallback) {
    }

    public void U1() {
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    @Override // z7.g
    public void V(StalkerProfilesCallback stalkerProfilesCallback) {
    }

    @Override // z7.g
    public void V0(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, m0.x xVar, int i9) {
    }

    public final void W1(SeriesDetailActivity seriesDetailActivity) {
        View viewInflate = ((LayoutInflater) seriesDetailActivity.getSystemService("layout_inflater")).inflate(a7.g.f12832l3, (RelativeLayout) seriesDetailActivity.findViewById(a7.f.We));
        PopupWindow popupWindow = new PopupWindow(seriesDetailActivity);
        this.f32081J0 = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.f32081J0.setWidth(-1);
        this.f32081J0.setHeight(-1);
        this.f32081J0.setFocusable(true);
        this.f32081J0.setBackgroundDrawable(new BitmapDrawable());
        this.f32081J0.showAtLocation(viewInflate, 17, 0, 0);
        this.f32099R0 = (Button) viewInflate.findViewById(a7.f.f12157H0);
        TextView textView = (TextView) viewInflate.findViewById(a7.f.f12434j3);
        this.f32084K0 = (Button) viewInflate.findViewById(a7.f.f12482o0);
        textView.setText("Series trailer is not available");
        Button button = this.f32099R0;
        if (button != null) {
            button.setOnFocusChangeListener(new v(button));
        }
        Button button2 = this.f32084K0;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new v(button2));
        }
        this.f32084K0.setOnClickListener(new m());
        this.f32099R0.setOnClickListener(new n());
    }

    @Override // z7.j
    public void X(StalkerShortEPGCallback stalkerShortEPGCallback) {
    }

    public final void X1(View view) {
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f32167t0).equals("stalker_api")) {
            w.v0(this.f32167t0, "", this.f32153o1, "series", this.f32156p1, "0", this.f32159q1, null, this.f32067E1, "", this.f32119d);
            return;
        }
        if (this.f32171u1.equals("mobile")) {
            try {
                this.f32150n1 = C2325b.e(this.f32167t0).c().c();
            } catch (Exception unused) {
            }
        }
        try {
            C2328e c2328e = this.f32150n1;
            if (c2328e != null && c2328e.c()) {
                String str = this.f32167t0.getResources().getString(a7.j.f13040J6) + " - " + this.f32165s1;
                String strG = w.G(w.U(this.f32167t0, this.f32153o1, this.f32156p1, "series"));
                String strJ = "";
                C2328e c2328e2 = this.f32150n1;
                if (c2328e2 != null && c2328e2.r() != null && this.f32150n1.r().j() != null && this.f32150n1.r().j().J() != null) {
                    strJ = this.f32150n1.r().j().J();
                }
                if (strJ.equals(strG)) {
                    this.f32167t0.startActivity(new Intent(this.f32167t0, (Class<?>) ExpandedControlsActivity.class));
                    return;
                } else {
                    AbstractC1902a.c(this.f32168t1, true, AbstractC1902a.a(this.f32159q1, str, "", 0, strG, "videos/mp4", this.f32162r1, "", null), this.f32150n1, this.f32167t0);
                    return;
                }
            }
            new ArrayList();
            ArrayList arrayList = new ArrayList();
            k.U u9 = new k.U(this, view);
            u9.c().inflate(a7.h.f12930m, u9.b());
            ArrayList<ExternalPlayerModelClass> externalPlayer = new ExternalPlayerDataBase(this.f32167t0).getExternalPlayer();
            if (externalPlayer == null || externalPlayer.size() <= 0) {
                if (SharepreferenceDBHandler.getCurrentAPPType(this.f32167t0).equals("onestream_api")) {
                    w.v0(this.f32167t0, "", 0, "series", this.f32156p1, "0", this.f32159q1, null, this.f32076H1, this.f32079I1, this.f32119d);
                    return;
                } else {
                    w.v0(this.f32167t0, "", this.f32153o1, "series", this.f32156p1, "0", this.f32159q1, null, this.f32067E1, "", this.f32119d);
                    return;
                }
            }
            u9.b().add(0, 0, 0, this.f32167t0.getResources().getString(a7.j.f13155V3));
            ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
            externalPlayerModelClass.setId(0);
            externalPlayerModelClass.setAppname(this.f32167t0.getResources().getString(a7.j.f13272h5));
            arrayList.add(externalPlayerModelClass);
            int i9 = 0;
            while (i9 < externalPlayer.size()) {
                int i10 = i9 + 1;
                u9.b().add(0, i10, 0, this.f32167t0.getResources().getString(a7.j.f13272h5) + " " + externalPlayer.get(i9).getAppname());
                arrayList.add(externalPlayer.get(i9));
                i9 = i10;
            }
            u9.f(new g(arrayList));
            u9.e(new h());
            u9.g();
        } catch (Exception unused2) {
        }
    }

    public final void Y1() {
        DatabaseHandler databaseHandler;
        int i9;
        String str;
        String str2;
        String str3;
        int userID;
        String str4;
        try {
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f32167t0).equals("onestream_api")) {
                databaseHandler = this.f32078I0;
                i9 = this.f32157q;
                str = this.f32142l;
                str2 = "series";
                str3 = this.f32121e;
                userID = SharepreferenceDBHandler.getUserID(this.f32167t0);
                str4 = this.f32160r;
            } else {
                databaseHandler = this.f32078I0;
                i9 = this.f32157q;
                str = this.f32142l;
                str2 = "series";
                str3 = this.f32121e;
                userID = SharepreferenceDBHandler.getUserID(this.f32167t0);
                str4 = "";
            }
            databaseHandler.deleteFavourite(i9, str, str2, str3, userID, str4);
            if (Build.VERSION.SDK_INT <= 21) {
                this.f32074H.setImageResource(a7.e.f11970W);
            }
            this.f32074H.setImageDrawable(this.f32167t0.getResources().getDrawable(a7.e.f11970W, null));
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void Z1() {
        w.N0(this.f32167t0);
        String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f32167t0);
        try {
            this.f32058B1.r(SharepreferenceDBHandler.getLoggedInMacAddress(this.f32167t0), stalkerToken, null, String.valueOf(this.f32157q), 0);
        } catch (Exception unused) {
        }
    }

    @Override // z7.b
    public void a() {
    }

    @Override // z7.m
    public void a0(String str) {
    }

    public void a2() {
        new u().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    @Override // z7.b
    public void b() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:61:0x00fc
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void b2(org.json.JSONObject r12) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SeriesDetailActivity.b2(org.json.JSONObject):void");
    }

    @Override // z7.g
    public void c(String str) {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:61:0x0192
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void c2(org.json.JSONObject r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SeriesDetailActivity.c2(org.json.JSONObject, java.lang.String):void");
    }

    @Override // z7.b
    public void d(String str) {
        try {
            ProgressDialog progressDialog = this.f32170u0;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            this.f32170u0.dismiss();
            Toast.makeText(this, this.f32167t0.getResources().getString(a7.j.f13244e7), 1).show();
        } catch (Exception unused) {
        }
    }

    @Override // z7.g
    public void d0(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, C2635t.o oVar, String str, String str2) {
    }

    public final void d2(Context context) {
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.f32171u1.equals("mobile") ? a7.g.f12869r4 : a7.g.f12875s4, (ViewGroup) null);
        PopupWindow popupWindow = new PopupWindow(context);
        this.f32129g1 = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.f32129g1.setWidth(-1);
        this.f32129g1.setHeight(-1);
        this.f32129g1.setFocusable(true);
        this.f32129g1.showAtLocation(viewInflate, 0, 0, 0);
        this.f32132h1 = (RecyclerView) viewInflate.findViewById(a7.f.Wf);
        NestedScrollView nestedScrollView = (NestedScrollView) viewInflate.findViewById(a7.f.f12476n4);
        TextView textView = (TextView) viewInflate.findViewById(a7.f.ki);
        if (textView != null) {
            textView.setOnClickListener(new i());
        }
        try {
            RecyclerView recyclerView = this.f32132h1;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new GridLayoutManager((Context) this, 4, 1, false));
                this.f32132h1.setItemAnimator(new androidx.recyclerview.widget.c());
                ArrayList arrayList = this.f32135i1;
                if (arrayList != null && arrayList.size() > 0) {
                    q7.U u9 = new q7.U(context, this.f32135i1, this.f32129g1, this.f32141k1, 0);
                    this.f32118c1 = u9;
                    this.f32132h1.setAdapter(u9);
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    nestedScrollView.setOnScrollChangeListener(new j());
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // androidx.appcompat.app.b, D.AbstractActivityC0525h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return keyCode == 82 ? keyEvent.getAction() == 0 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent) : super.dispatchKeyEvent(keyEvent);
    }

    @Override // z7.g
    public void e(String str) {
    }

    @Override // z7.g
    public void e0(String str) {
        ProgressDialog progressDialog = this.f32170u0;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f32170u0.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x0347 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0325 A[Catch: Exception -> 0x0474, TryCatch #10 {Exception -> 0x0474, blocks: (B:3:0x0002, B:5:0x000b, B:7:0x000f, B:9:0x0015, B:11:0x004c, B:15:0x0065, B:28:0x00c8, B:29:0x00d1, B:32:0x00df, B:34:0x00fb, B:36:0x0111, B:37:0x0132, B:39:0x0136, B:41:0x018f, B:43:0x019b, B:44:0x01b7, B:45:0x01f3, B:61:0x0249, B:62:0x0254, B:64:0x025c, B:65:0x0266, B:67:0x026b, B:69:0x0273, B:71:0x028b, B:72:0x0294, B:74:0x029a, B:76:0x02b6, B:91:0x0305, B:92:0x0309, B:93:0x030c, B:94:0x0311, B:96:0x0325, B:97:0x0347, B:98:0x034b, B:100:0x034f, B:102:0x0353, B:104:0x0359, B:106:0x0389, B:108:0x038d, B:111:0x03a5, B:113:0x03b1, B:114:0x03cd, B:115:0x041b, B:117:0x0428, B:119:0x042e, B:120:0x0437, B:125:0x0462, B:18:0x006d, B:20:0x0071, B:21:0x0092, B:23:0x0096, B:24:0x00c0, B:26:0x00c4, B:12:0x0055, B:126:0x0465, B:128:0x0469, B:130:0x046f), top: B:159:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e2() {
        /*
            Method dump skipped, instruction units count: 1141
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SeriesDetailActivity.e2():void");
    }

    @Override // z7.g
    public void f0(StalkerGetGenresCallback stalkerGetGenresCallback) {
    }

    public final void f2(SeriesDetailActivity seriesDetailActivity) {
        View viewInflate = ((LayoutInflater) seriesDetailActivity.getSystemService("layout_inflater")).inflate(a7.g.f12802g3, (RelativeLayout) seriesDetailActivity.findViewById(a7.f.We));
        this.f32091N0 = (TextView) viewInflate.findViewById(a7.f.Wh);
        TextView textView = (TextView) viewInflate.findViewById(a7.f.Ik);
        this.f32093O0 = textView;
        textView.setText(getResources().getString(a7.j.f13422w5));
        this.f32091N0.setText(this.f32087L0);
        PopupWindow popupWindow = new PopupWindow(seriesDetailActivity);
        this.f32081J0 = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.f32081J0.setWidth(-1);
        this.f32081J0.setHeight(-1);
        this.f32081J0.setFocusable(true);
        this.f32081J0.showAtLocation(viewInflate, 17, 0, 0);
        Button button = (Button) viewInflate.findViewById(a7.f.f12482o0);
        this.f32084K0 = button;
        if (button != null) {
            button.setOnFocusChangeListener(new v(button));
        }
        this.f32084K0.setOnClickListener(new l());
    }

    public final void g2(Context context, String str, String str2) {
        ImageView imageView;
        Drawable drawable;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ImageView imageView2;
        Resources resources;
        int i9;
        TextView textView;
        String str8;
        String str9;
        this.f32103T0 = new n7.i(this, context);
        this.f32105U0 = new n7.j(context, this);
        this.f32092O.setVisibility(0);
        this.f32090N.setVisibility(0);
        Intent intent = getIntent();
        if (intent != null) {
            this.f32121e = intent.getStringExtra("series_name");
            this.f32124f = intent.getStringExtra("series_plot");
            this.f32127g = intent.getStringExtra("series_rating");
            this.f32130h = intent.getStringExtra("series_director");
            this.f32136j = intent.getStringExtra("series_cover");
            this.f32139k = intent.getStringExtra("series_releaseDate");
            this.f32133i = intent.getStringExtra("series_genre");
            this.f32069F0 = intent.getStringExtra("series_num");
            this.f32142l = intent.getStringExtra("series_categoryId");
            this.f32145m = intent.getStringExtra("series_seriesID");
            this.f32148n = intent.getStringExtra("series_youtube_trailer");
            this.f32186z1 = intent.getIntExtra("series_fav", 0);
            this.f32055A1 = intent.getStringExtra("series_cmd");
            try {
                this.f32157q = w.r0(this.f32145m);
            } catch (NumberFormatException unused) {
                this.f32157q = -1;
            }
            this.f32160r = this.f32145m;
            this.f32087L0 = this.f32124f;
            this.f32089M0 = this.f32133i;
            ImageView imageView3 = this.f32074H;
            if (imageView3 != null) {
                imageView3.setOnFocusChangeListener(new v(imageView3));
                this.f32074H.setOnClickListener(new t(context));
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(context).equals("stalker_api")) {
                try {
                    TextView textView2 = this.f32155p0;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    this.f32177w1 = SharepreferenceDBHandler.getStalkerToken(context);
                    String loggedInMacAddress = SharepreferenceDBHandler.getLoggedInMacAddress(context);
                    this.f32174v1 = loggedInMacAddress;
                    this.f32058B1.j(loggedInMacAddress, this.f32177w1, this.f32142l, String.valueOf(this.f32180x1), this.f32145m);
                } catch (Exception e9) {
                    Log.e("honey", "startViewingDetails: " + e9.getMessage());
                }
            } else if (SharepreferenceDBHandler.getCurrentAPPType(context).equals("onestream_api")) {
                this.f32105U0.c(this.f32145m, this.f32164s0);
            } else {
                this.f32105U0.b(str, str2, this.f32145m);
            }
            if (context == null || (str9 = this.f32136j) == null || str9.isEmpty()) {
                this.f32175w.setBackgroundResource(a7.e.f12040o1);
            } else {
                com.squareup.picasso.t.q(context).l(this.f32136j).j(a7.e.f11895B1).h(this.f32175w, new a());
            }
            ImageView imageView4 = this.f32175w;
            if (imageView4 != null) {
                imageView4.setOnClickListener(new b());
            }
            if (this.f32125f0 != null && (str8 = this.f32148n) != null && str8.isEmpty() && this.f32148n.equals("")) {
                this.f32125f0.setVisibility(8);
                LinearLayout linearLayout = this.f32122e0;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                TextView textView3 = this.f32184z;
                if (textView3 != null) {
                    textView3.requestFocus();
                }
            }
            if (this.f32057B0 != null && (textView = this.f32181y) != null) {
                textView.setText(this.f32121e);
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(context).equals("stalker_api")) {
                try {
                    if (this.f32186z1 == 1) {
                        if (Build.VERSION.SDK_INT <= 21) {
                            this.f32074H.setImageResource(a7.e.f11967V);
                        }
                        imageView = this.f32074H;
                        drawable = context.getResources().getDrawable(a7.e.f11967V, null);
                    } else {
                        if (Build.VERSION.SDK_INT <= 21) {
                            this.f32074H.setImageResource(a7.e.f11970W);
                        }
                        imageView = this.f32074H;
                        drawable = context.getResources().getDrawable(a7.e.f11970W, null);
                    }
                    imageView.setImageDrawable(drawable);
                } catch (Exception unused2) {
                }
            } else {
                if (this.f32078I0.checkFavourite(this.f32157q, this.f32142l, "series", SharepreferenceDBHandler.getUserID(context), this.f32160r).size() > 0) {
                    if (Build.VERSION.SDK_INT <= 21) {
                        this.f32074H.setImageResource(a7.e.f11967V);
                    }
                    imageView2 = this.f32074H;
                    resources = context.getResources();
                    i9 = a7.e.f11967V;
                } else {
                    if (Build.VERSION.SDK_INT <= 21) {
                        this.f32074H.setImageResource(a7.e.f11970W);
                    }
                    imageView2 = this.f32074H;
                    resources = context.getResources();
                    i9 = a7.e.f11970W;
                }
                imageView2.setImageDrawable(resources.getDrawable(i9, null));
            }
            if (this.f32096Q == null || this.f32106V == null || this.f32068F == null || (str7 = this.f32139k) == null || str7.isEmpty() || this.f32139k.equals("n/A")) {
                LinearLayout linearLayout2 = this.f32096Q;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                LinearLayout linearLayout3 = this.f32106V;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(0);
                }
                TextView textView4 = this.f32068F;
                if (textView4 != null) {
                    textView4.setText("N/A");
                }
            } else {
                this.f32096Q.setVisibility(0);
                this.f32106V.setVisibility(0);
                this.f32068F.setText(this.f32139k);
            }
            if (this.f32056B == null || this.f32104U == null || this.f32094P == null || (str6 = this.f32130h) == null || str6.isEmpty() || this.f32130h.equals("n/A")) {
                LinearLayout linearLayout4 = this.f32094P;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(0);
                }
                LinearLayout linearLayout5 = this.f32104U;
                if (linearLayout5 != null) {
                    linearLayout5.setVisibility(0);
                }
                TextView textView5 = this.f32056B;
                if (textView5 != null) {
                    textView5.setText("N/A");
                }
            } else {
                this.f32094P.setVisibility(0);
                this.f32104U.setVisibility(0);
                this.f32056B.setText(this.f32130h);
            }
            if (this.f32102T == null || this.f32112Y == null || this.f32062D == null || (str5 = this.f32124f) == null || str5.isEmpty()) {
                LinearLayout linearLayout6 = this.f32102T;
                if (linearLayout6 != null) {
                    linearLayout6.setVisibility(0);
                }
                LinearLayout linearLayout7 = this.f32112Y;
                if (linearLayout7 != null) {
                    linearLayout7.setVisibility(0);
                }
                TextView textView6 = this.f32114Z;
                if (textView6 != null) {
                    textView6.setVisibility(8);
                }
                TextView textView7 = this.f32062D;
                if (textView7 != null) {
                    textView7.setText("N/A");
                }
            } else {
                this.f32102T.setVisibility(0);
                this.f32112Y.setVisibility(0);
                if (this.f32124f.length() > 150) {
                    this.f32062D.setText(this.f32124f);
                    this.f32114Z.setVisibility(0);
                } else {
                    this.f32062D.setText(this.f32124f);
                    this.f32114Z.setVisibility(8);
                }
            }
            if (this.f32071G != null && (str4 = this.f32127g) != null && !str4.isEmpty() && !this.f32127g.equals("n/A")) {
                this.f32071G.setVisibility(0);
                try {
                    this.f32071G.setRating(Float.parseFloat(this.f32127g) / 2.0f);
                } catch (NumberFormatException unused3) {
                    this.f32071G.setRating(0.0f);
                }
            }
            if (this.f32100S != null && this.f32110X != null && this.f32080J != null && (str3 = this.f32133i) != null && !str3.isEmpty()) {
                this.f32100S.setVisibility(0);
                this.f32110X.setVisibility(0);
                this.f32133i.length();
                this.f32080J.setText(this.f32133i);
                return;
            }
            LinearLayout linearLayout8 = this.f32100S;
            if (linearLayout8 != null) {
                linearLayout8.setVisibility(0);
            }
            LinearLayout linearLayout9 = this.f32110X;
            if (linearLayout9 != null) {
                linearLayout9.setVisibility(0);
            }
            TextView textView8 = this.f32080J;
            if (textView8 != null) {
                textView8.setText("N/A");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:130|66|115|67|(4:121|68|(2:111|70)(1:72)|71)|77|119|78|81) */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0285, code lost:
    
        r6 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List h2() {
        /*
            Method dump skipped, instruction units count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SeriesDetailActivity.h2():java.util.List");
    }

    @Override // z7.g
    public void i(StalkerGetAllChannelsCallback stalkerGetAllChannelsCallback) {
    }

    public void i2(int i9) {
        boolean z9;
        ArrayList arrayList;
        ArrayList arrayList2;
        int iRound;
        int iR0;
        int iR02;
        int iRound2;
        String durationSec;
        int iR03;
        int iRound3;
        int iRound4;
        GetEpisdoeDetailsCallback getEpisdoeDetailsCallback;
        this.f32141k1 = i9;
        TextView textView = this.f32178x;
        if (textView != null) {
            textView.setText(getResources().getString(a7.j.f13040J6) + " - " + i9);
        }
        ArrayList arrayList3 = this.f32126f1;
        if (arrayList3 != null) {
            arrayList3.clear();
        }
        ArrayList<GetEpisdoeDetailsCallback> recentWatchedBySeriesID = this.f32138j1.getRecentWatchedBySeriesID(this.f32145m);
        if (recentWatchedBySeriesID == null || recentWatchedBySeriesID.size() <= 0) {
            TextView textView2 = this.f32184z;
            if (textView2 != null) {
                textView2.setText(getResources().getString(a7.j.f13204a7) + " - S" + i9 + ":E1");
                this.f32070F1 = "1";
            }
            ProgressBar progressBar = this.f32134i0;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            z9 = false;
        } else {
            z9 = true;
        }
        if (this.f32116a1 != null) {
            ArrayList<GetEpisdoeDetailsCallback> allSeriesRecentWatch = this.f32138j1.getAllSeriesRecentWatch("getalldata");
            for (int i10 = 0; i10 < this.f32116a1.size(); i10++) {
                if (z9 && ((GetEpisdoeDetailsCallback) this.f32116a1.get(i10)).getId().equals(recentWatchedBySeriesID.get(0).getId())) {
                    TextView textView3 = this.f32184z;
                    if (textView3 != null) {
                        textView3.setText(getResources().getString(a7.j.f13224c7) + " - S" + ((GetEpisdoeDetailsCallback) this.f32116a1.get(i10)).getSeasonNumber() + ":E" + ((GetEpisdoeDetailsCallback) this.f32116a1.get(i10)).getEpisodeNumber());
                        this.f32070F1 = ((GetEpisdoeDetailsCallback) this.f32116a1.get(i10)).getEpisodeNumber().toString();
                        try {
                            this.f32153o1 = w.r0(((GetEpisdoeDetailsCallback) this.f32116a1.get(i10)).getId());
                        } catch (Exception unused) {
                        }
                        if (SharepreferenceDBHandler.getCurrentAPPType(this.f32167t0).equals("onestream_api")) {
                            this.f32079I1 = ((GetEpisdoeDetailsCallback) this.f32116a1.get(i10)).getId();
                            this.f32076H1 = ((GetEpisdoeDetailsCallback) this.f32116a1.get(i10)).getLinks();
                        }
                        this.f32119d = ((GetEpisdoeDetailsCallback) this.f32116a1.get(i10)).getTmdb_id();
                        this.f32156p1 = ((GetEpisdoeDetailsCallback) this.f32116a1.get(i10)).getContainerExtension();
                        this.f32159q1 = ((GetEpisdoeDetailsCallback) this.f32116a1.get(i10)).getTitle();
                        this.f32162r1 = ((GetEpisdoeDetailsCallback) this.f32116a1.get(i10)).getMovieImage();
                        this.f32165s1 = ((GetEpisdoeDetailsCallback) this.f32116a1.get(i10)).getSeasonNumber().intValue();
                    }
                    if (this.f32134i0 != null) {
                        try {
                            int iR04 = w.r0(recentWatchedBySeriesID.get(0).getElapsed_time());
                            iRound3 = Math.round(iR04 / 1000.0f);
                            try {
                                this.f32168t1 = iR04;
                                iR03 = w.r0(((GetEpisdoeDetailsCallback) this.f32116a1.get(i10)).getDurationSec());
                                if (iR03 == 0) {
                                    try {
                                        getEpisdoeDetailsCallback = recentWatchedBySeriesID.get(0);
                                    } catch (Exception unused2) {
                                    }
                                } else {
                                    getEpisdoeDetailsCallback = (GetEpisdoeDetailsCallback) this.f32116a1.get(i10);
                                }
                                iR03 = w.r0(getEpisdoeDetailsCallback.getDurationSec());
                            } catch (Exception unused3) {
                                iR03 = 0;
                            }
                        } catch (Exception unused4) {
                            iR03 = 0;
                            iRound3 = 0;
                        }
                        try {
                            iRound4 = Math.round((iRound3 / iR03) * 100.0f);
                        } catch (Exception unused5) {
                            iRound4 = 0;
                        }
                        ProgressBar progressBar2 = this.f32134i0;
                        if (iRound4 != 0) {
                            progressBar2.setProgress(iRound4);
                            this.f32134i0.setVisibility(0);
                        } else if (progressBar2.getVisibility() == 0) {
                            this.f32134i0.setProgress(iRound4);
                            this.f32134i0.setVisibility(8);
                        }
                    }
                }
                if (((GetEpisdoeDetailsCallback) this.f32116a1.get(i10)).getSeasonNumber().equals(Integer.valueOf(i9))) {
                    GetEpisdoeDetailsCallback getEpisdoeDetailsCallback2 = (GetEpisdoeDetailsCallback) this.f32116a1.get(i10);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= allSeriesRecentWatch.size()) {
                            break;
                        }
                        if (((GetEpisdoeDetailsCallback) this.f32116a1.get(i10)).getId().equals(allSeriesRecentWatch.get(i11).getId())) {
                            getEpisdoeDetailsCallback2.setElapsed_time(allSeriesRecentWatch.get(i11).getElapsed_time());
                            try {
                                iRound = Math.round(w.r0(allSeriesRecentWatch.get(i11).getElapsed_time()) / 1000.0f);
                            } catch (Exception unused6) {
                                iRound = 0;
                            }
                            try {
                                iR0 = w.r0(getEpisdoeDetailsCallback2.getDurationSec());
                                if (iR0 == 0) {
                                    try {
                                        durationSec = allSeriesRecentWatch.get(i11).getDurationSec();
                                    } catch (Exception unused7) {
                                        iR02 = iR0;
                                    }
                                } else {
                                    durationSec = getEpisdoeDetailsCallback2.getDurationSec();
                                }
                                iR02 = w.r0(durationSec);
                            } catch (Exception unused8) {
                                iR0 = 0;
                                iR02 = iR0;
                                iRound2 = Math.round((iRound / iR02) * 100.0f);
                                getEpisdoeDetailsCallback2.setEpisode_watched_percentage(iRound2);
                                this.f32126f1.add(getEpisdoeDetailsCallback2);
                            }
                            try {
                                iRound2 = Math.round((iRound / iR02) * 100.0f);
                            } catch (Exception unused9) {
                                iRound2 = 0;
                            }
                            getEpisdoeDetailsCallback2.setEpisode_watched_percentage(iRound2);
                        } else {
                            i11++;
                        }
                    }
                    this.f32126f1.add(getEpisdoeDetailsCallback2);
                }
            }
            if (this.f32152o0 != null && (arrayList2 = this.f32126f1) != null && arrayList2.size() > 0) {
                this.f32152o0.setText(getResources().getString(a7.j.f13005G1) + " (" + this.f32126f1.size() + ")");
            }
            if (!z9 && (arrayList = this.f32126f1) != null && arrayList.size() > 0) {
                try {
                    this.f32153o1 = w.r0(((GetEpisdoeDetailsCallback) this.f32126f1.get(0)).getId());
                } catch (Exception unused10) {
                }
                if (SharepreferenceDBHandler.getCurrentAPPType(this.f32167t0).equals("onestream_api")) {
                    this.f32079I1 = ((GetEpisdoeDetailsCallback) this.f32126f1.get(0)).getId();
                    this.f32076H1 = ((GetEpisdoeDetailsCallback) this.f32126f1.get(0)).getLinks();
                }
                this.f32119d = ((GetEpisdoeDetailsCallback) this.f32116a1.get(0)).getTmdb_id();
                this.f32156p1 = ((GetEpisdoeDetailsCallback) this.f32126f1.get(0)).getContainerExtension();
                this.f32159q1 = ((GetEpisdoeDetailsCallback) this.f32126f1.get(0)).getTitle();
                this.f32168t1 = w.r0(((GetEpisdoeDetailsCallback) this.f32126f1.get(0)).getElapsed_time());
                this.f32162r1 = ((GetEpisdoeDetailsCallback) this.f32126f1.get(0)).getMovieImage();
                this.f32165s1 = ((GetEpisdoeDetailsCallback) this.f32126f1.get(0)).getSeasonNumber().intValue();
            }
            EpisodesUsingSinglton.getInstance().setEpisodeList(this.f32116a1);
            EpisodesUsingSinglton.getInstance().setCurrentSeasonEpisodeList(this.f32126f1);
            C2630n c2630n = this.f32117b1;
            if (c2630n != null) {
                c2630n.w();
            } else {
                C2630n c2630n2 = new C2630n(this.f32167t0, this.f32136j, null, this.f32120d1, "", this.f32171u1, this.f32149n0);
                this.f32117b1 = c2630n2;
                this.f32149n0.setAdapter(c2630n2);
            }
        }
        TextView textView4 = this.f32152o0;
        if (textView4 != null) {
            textView4.setBackgroundResource(a7.e.f11964U);
        }
        TextView textView5 = this.f32155p0;
        if (textView5 != null) {
            textView5.setBackgroundResource(a7.e.f11955R);
        }
        RecyclerView recyclerView = this.f32131h0;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        RecyclerView recyclerView2 = this.f32149n0;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(0);
        }
    }

    @Override // z7.g
    public void j(StalkerGetVodCategoriesCallback stalkerGetVodCategoriesCallback) {
    }

    @Override // z7.g
    public void o0(String str) {
        try {
            w.X();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        PopupWindow popupWindow = this.f32129g1;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f32129g1.dismiss();
            return;
        }
        C2630n c2630n = this.f32117b1;
        if (c2630n != null) {
            c2630n.b1();
        }
        AbstractC2237a.f44521m0 = true;
        AbstractC2237a.f44524n0 = this.f32186z1;
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intent intentPutExtra;
        int i9;
        int id = view.getId();
        if (id == a7.f.Bj) {
            intentPutExtra = new Intent(this, (Class<?>) NewDashboardActivity.class);
        } else {
            if (id == a7.f.Pk) {
                if (!SharepreferenceDBHandler.getCurrentAPPType(this.f32167t0).equals("stalker_api")) {
                    X1(view);
                    return;
                }
                w.N0(this.f32167t0);
                String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f32167t0);
                String loggedInMacAddress = SharepreferenceDBHandler.getLoggedInMacAddress(this.f32167t0);
                ArrayList arrayList = this.f32135i1;
                if (arrayList == null || arrayList.size() <= 0) {
                    i9 = -1;
                } else {
                    i9 = 0;
                    while (i9 < this.f32135i1.size()) {
                        if (((Integer) this.f32135i1.get(i9)).equals(Integer.valueOf(this.f32141k1))) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                    i9 = -1;
                }
                ArrayList arrayList2 = this.f32073G1;
                if (arrayList2 != null && arrayList2.size() > 0 && i9 != -1) {
                    try {
                        this.f32055A1 = (String) this.f32073G1.get(i9);
                    } catch (Exception unused) {
                    }
                }
                try {
                    this.f32061C1.c(loggedInMacAddress, stalkerToken, this.f32055A1, this.f32070F1, view, "vod", 0, 0, "", "", "", "", "", "", 0, "", "");
                    return;
                } catch (Exception unused2) {
                    return;
                }
            }
            if (id == a7.f.xl) {
                d2(this.f32167t0);
                return;
            }
            if (id == a7.f.kl) {
                f2(this);
                return;
            }
            if (id != a7.f.qm) {
                return;
            }
            String str = this.f32148n;
            if (str == null || str.isEmpty()) {
                W1(this);
                return;
            }
            intentPutExtra = new Intent(this, (Class<?>) YouTubePlayerActivity.class).putExtra("you_tube_trailer", this.f32148n);
        }
        startActivity(intentPutExtra);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i9;
        this.f32167t0 = this;
        super.onCreate(bundle);
        U1();
        if (new C2858a(this.f32167t0).A().equals(AbstractC2237a.f44453K0)) {
            this.f32171u1 = "tv";
            i9 = a7.g.f12693P0;
        } else {
            this.f32171u1 = "mobile";
            i9 = a7.g.f12681N0;
        }
        setContentView(i9);
        this.f32166t = (Toolbar) findViewById(a7.f.kh);
        this.f32169u = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f32172v = (RelativeLayout) findViewById(a7.f.Nd);
        this.f32175w = (ImageView) findViewById(a7.f.f12102B5);
        this.f32178x = (TextView) findViewById(a7.f.xl);
        this.f32181y = (TextView) findViewById(a7.f.lk);
        this.f32184z = (TextView) findViewById(a7.f.Pk);
        this.f32053A = (TextView) findViewById(a7.f.Hi);
        this.f32056B = (TextView) findViewById(a7.f.Ii);
        this.f32059C = (TextView) findViewById(a7.f.Rh);
        this.f32062D = (TextView) findViewById(a7.f.Th);
        this.f32065E = (TextView) findViewById(a7.f.tl);
        this.f32068F = (TextView) findViewById(a7.f.ul);
        this.f32071G = (RatingBar) findViewById(a7.f.bd);
        this.f32074H = (ImageView) findViewById(a7.f.f12406g5);
        this.f32077I = (TextView) findViewById(a7.f.ik);
        this.f32080J = (TextView) findViewById(a7.f.zj);
        this.f32083K = (TextView) findViewById(a7.f.gk);
        this.f32086L = (TextView) findViewById(a7.f.hk);
        this.f32088M = (LinearLayout) findViewById(a7.f.f12265R8);
        this.f32090N = (ScrollView) findViewById(a7.f.Tf);
        this.f32092O = (NestedScrollView) findViewById(a7.f.Nb);
        this.f32094P = (LinearLayout) findViewById(a7.f.f12174I7);
        this.f32096Q = (LinearLayout) findViewById(a7.f.H9);
        this.f32098R = (LinearLayout) findViewById(a7.f.f12274S7);
        this.f32100S = (LinearLayout) findViewById(a7.f.f12521r8);
        this.f32102T = (LinearLayout) findViewById(a7.f.f12499p7);
        this.f32104U = (LinearLayout) findViewById(a7.f.f12184J7);
        this.f32106V = (LinearLayout) findViewById(a7.f.I9);
        this.f32108W = (LinearLayout) findViewById(a7.f.f12284T7);
        this.f32110X = (LinearLayout) findViewById(a7.f.f12531s8);
        this.f32112Y = (LinearLayout) findViewById(a7.f.f12510q7);
        this.f32114Z = (TextView) findViewById(a7.f.kl);
        this.f32122e0 = (LinearLayout) findViewById(a7.f.Ga);
        this.f32125f0 = (TextView) findViewById(a7.f.qm);
        this.f32128g0 = (ImageView) findViewById(a7.f.Xa);
        this.f32131h0 = (RecyclerView) findViewById(a7.f.Df);
        this.f32134i0 = (ProgressBar) findViewById(a7.f.Zb);
        this.f32137j0 = (LinearLayout) findViewById(a7.f.p9);
        this.f32140k0 = (LinearLayout) findViewById(a7.f.Q9);
        this.f32143l0 = (LinearLayout) findViewById(a7.f.Ha);
        this.f32146m0 = (RelativeLayout) findViewById(a7.f.vf);
        this.f32149n0 = (RecyclerView) findViewById(a7.f.ub);
        this.f32152o0 = (TextView) findViewById(a7.f.f12306W2);
        this.f32155p0 = (TextView) findViewById(a7.f.f12198L1);
        this.f32158q0 = (ImageView) findViewById(a7.f.f12141F4);
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        this.f32164s0 = SharepreferenceDBHandler.getOneStreamToken(this.f32167t0);
        this.f32184z.setOnClickListener(this);
        this.f32178x.setOnClickListener(this);
        this.f32114Z.setOnClickListener(this);
        this.f32125f0.setOnClickListener(this);
        AppBarLayout appBarLayout = this.f32169u;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(a7.e.f11917H));
        }
        TextView textView = this.f32184z;
        if (textView != null) {
            textView.setOnFocusChangeListener(new v(textView));
        }
        TextView textView2 = this.f32178x;
        if (textView2 != null) {
            textView2.setOnFocusChangeListener(new v(textView2));
        }
        TextView textView3 = this.f32114Z;
        if (textView3 != null) {
            textView3.setOnFocusChangeListener(new v(textView3));
        }
        TextView textView4 = this.f32125f0;
        if (textView4 != null) {
            textView4.setOnFocusChangeListener(new v(textView4));
        }
        this.f32147m1 = true;
        this.f32116a1.clear();
        TextView textView5 = this.f32152o0;
        if (textView5 != null) {
            textView5.setOnClickListener(new k());
            TextView textView6 = this.f32152o0;
            textView6.setOnFocusChangeListener(new v(textView6));
        }
        TextView textView7 = this.f32155p0;
        if (textView7 != null) {
            textView7.setOnFocusChangeListener(new v(textView7));
            this.f32155p0.setOnClickListener(new o());
        }
        getWindow().setFlags(1024, 1024);
        r1((Toolbar) findViewById(a7.f.kh));
        S1();
        V1();
        this.f32128g0.setOnClickListener(new p());
        this.f32158q0.setOnClickListener(new q());
        ImageView imageView = this.f32163s;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f32166t.x(a7.h.f12939v);
        this.f32097Q0 = menu;
        this.f32095P0 = menu.getItem(1).getSubMenu().findItem(a7.f.f12239P2);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f32167t0).equals("api")) {
            menu.getItem(1).getSubMenu().findItem(a7.f.fb).setVisible(false);
        }
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f32166t.getChildCount(); i9++) {
            if (this.f32166t.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f32166t.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
        return true;
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        C2434i c2434iR;
        super.onDestroy();
        try {
            C2630n c2630n = this.f32117b1;
            if (c2630n != null) {
                c2630n.b1();
            }
            C2328e c2328e = this.f32150n1;
            if (c2328e == null || this.f32117b1 == null || (c2434iR = c2328e.r()) == null) {
                return;
            }
            c2434iR.X(this.f32117b1.f48945R);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.appcompat.app.b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        if (i9 != 20) {
            if (i9 != 19) {
                return super.onKeyDown(i9, keyEvent);
            }
            View currentFocus = getCurrentFocus();
            if ((currentFocus != null && currentFocus.getTag() != null && currentFocus.getTag().equals("11")) || (currentFocus != null && currentFocus.getTag() != null && currentFocus.getTag().equals("10"))) {
                this.f32090N.setVisibility(0);
            }
            return false;
        }
        View currentFocus2 = getCurrentFocus();
        if ((currentFocus2 != null && currentFocus2.getTag() != null && currentFocus2.getTag().equals("11")) || (currentFocus2 != null && currentFocus2.getTag() != null && currentFocus2.getTag().equals("10"))) {
            this.f32090N.setVisibility(8);
            RecyclerView recyclerView = this.f32149n0;
            if (recyclerView != null && recyclerView.getVisibility() == 0) {
                AbstractC2237a.f44530p0 = true;
                AbstractC2237a.f44527o0 = 0;
                C2630n c2630n = this.f32117b1;
                if (c2630n != null) {
                    c2630n.w();
                }
            }
            RecyclerView recyclerView2 = this.f32131h0;
            if (recyclerView2 != null && recyclerView2.getVisibility() == 0) {
                this.f32131h0.requestFocus();
            }
        }
        return false;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        if (i9 != 82) {
            return super.onKeyUp(i9, keyEvent);
        }
        Menu menu = this.f32097Q0;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(a7.f.f12239P2, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f32095P0 = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == a7.f.Gb) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == a7.f.Mb) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == a7.f.f12380e && (context = this.f32167t0) != null) {
            new a.C0158a(context, a7.k.f13456a).setTitle(getResources().getString(a7.j.f13250f3)).f(getResources().getString(a7.j.f13240e3)).j(getResources().getString(a7.j.f13132S8), new d()).g(getResources().getString(a7.j.f13231d4), new c()).n();
        }
        if (itemId == a7.f.fb) {
            w.A0(this.f32167t0);
            if (itemId == a7.f.hb) {
                a.C0158a c0158a = new a.C0158a(this);
                c0158a.setTitle(this.f32167t0.getResources().getString(a7.j.f13397u0));
                c0158a.f(this.f32167t0.getResources().getString(a7.j.f13134T0));
                c0158a.d(a7.e.f12056s1);
                c0158a.j(this.f32167t0.getResources().getString(a7.j.f13132S8), new e());
                c0158a.g(this.f32167t0.getResources().getString(a7.j.f13231d4), new f());
                c0158a.n();
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        U1();
        super.onResume();
        w.m(this.f32167t0);
        w.z0(this.f32167t0);
        if (this.f32171u1.equals("mobile")) {
            try {
                this.f32150n1 = C2325b.e(this.f32167t0).c().c();
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        if (!this.f32147m1) {
            a2();
            try {
                C2630n c2630n = new C2630n(this.f32167t0, this.f32136j, null, this.f32120d1, "", this.f32171u1, this.f32149n0);
                this.f32117b1 = c2630n;
                this.f32149n0.setAdapter(c2630n);
            } catch (Exception unused) {
            }
        }
        this.f32147m1 = false;
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStop() {
        C2434i c2434iR;
        super.onStop();
        try {
            C2630n c2630n = this.f32117b1;
            if (c2630n != null) {
                c2630n.b1();
            }
            C2328e c2328e = this.f32150n1;
            if (c2328e == null || this.f32117b1 == null || (c2434iR = c2328e.r()) == null) {
                return;
            }
            c2434iR.X(this.f32117b1.f48945R);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        U1();
    }

    @Override // z7.g
    public void q(StalkerGetVODByCatCallback stalkerGetVODByCatCallback) {
        int iR0;
        ProgressDialog progressDialog = this.f32170u0;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f32170u0.dismiss();
        }
        w.X();
        if (stalkerGetVODByCatCallback == null || stalkerGetVODByCatCallback.getJs() == null || stalkerGetVODByCatCallback.getJs().getData() == null || stalkerGetVODByCatCallback.getJs().getData().size() <= 0) {
            return;
        }
        this.f32183y1 = w.v(stalkerGetVODByCatCallback.getJs().getTotalItems().intValue(), stalkerGetVODByCatCallback.getJs().getMaxPageItems().intValue());
        for (int i9 = 0; i9 < stalkerGetVODByCatCallback.getJs().getData().size(); i9++) {
            String[] strArrSplit = stalkerGetVODByCatCallback.getJs().getData().get(i9).getId().split(":", 0);
            if (strArrSplit.length == 2) {
                iR0 = w.r0(strArrSplit[1]);
                this.f32135i1.add(Integer.valueOf(iR0));
                this.f32073G1.add(stalkerGetVODByCatCallback.getJs().getData().get(i9).getCmd());
            } else {
                iR0 = 0;
            }
            if (stalkerGetVODByCatCallback.getJs().getData().get(i9) != null && stalkerGetVODByCatCallback.getJs().getData().get(i9).getSeries() != null) {
                for (int i10 = 0; i10 < stalkerGetVODByCatCallback.getJs().getData().get(i9).getSeries().size(); i10++) {
                    GetEpisdoeDetailsCallback getEpisdoeDetailsCallback = new GetEpisdoeDetailsCallback();
                    getEpisdoeDetailsCallback.setId(stalkerGetVODByCatCallback.getJs().getData().get(i9).getSeries().get(i10).toString());
                    getEpisdoeDetailsCallback.setSeasonNumber(Integer.valueOf(iR0));
                    getEpisdoeDetailsCallback.setImage(this.f32136j);
                    getEpisdoeDetailsCallback.setTitle(this.f32121e + " - S" + iR0 + ":E" + stalkerGetVODByCatCallback.getJs().getData().get(i9).getSeries().get(i10).toString());
                    getEpisdoeDetailsCallback.setAdded("");
                    getEpisdoeDetailsCallback.setContainerExtension("");
                    getEpisdoeDetailsCallback.setEpisodeNum(stalkerGetVODByCatCallback.getJs().getData().get(i9).getSeries().get(i10));
                    String str = this.f32142l;
                    if (str != null) {
                        getEpisdoeDetailsCallback.setCategoryId(str);
                    }
                    getEpisdoeDetailsCallback.setMovieImage(this.f32136j);
                    getEpisdoeDetailsCallback.setRating("");
                    getEpisdoeDetailsCallback.setDuration("");
                    getEpisdoeDetailsCallback.setDurationSec("");
                    getEpisdoeDetailsCallback.setDesc("");
                    getEpisdoeDetailsCallback.setSeriesId(this.f32145m);
                    getEpisdoeDetailsCallback.setMainSeriesImg(this.f32136j);
                    getEpisdoeDetailsCallback.setSeriesNum(this.f32069F0);
                    getEpisdoeDetailsCallback.setSeriesName(this.f32121e);
                    getEpisdoeDetailsCallback.setCMD(stalkerGetVODByCatCallback.getJs().getData().get(i9).getCmd());
                    this.f32107V0.add(getEpisdoeDetailsCallback);
                }
            }
        }
        ArrayList arrayList = this.f32135i1;
        if (arrayList != null && arrayList.size() > 0 && this.f32129g1 != null) {
            q7.U u9 = this.f32118c1;
            q7.U u10 = new q7.U(this.f32167t0, this.f32135i1, this.f32129g1, this.f32141k1, u9 != null ? u9.m0() : 0);
            this.f32118c1 = u10;
            this.f32132h1.setAdapter(u10);
        }
        e2();
    }

    @Override // z7.j
    public void u(StalkerCreatePlayerLinkCallback stalkerCreatePlayerLinkCallback, View view, int i9, int i10, String str, String str2, String str3, String str4, String str5, String str6, int i11, String str7, String str8) {
        try {
            w.X();
            if (stalkerCreatePlayerLinkCallback == null || stalkerCreatePlayerLinkCallback.getJs() == null || stalkerCreatePlayerLinkCallback.getJs().getCmd() == null || stalkerCreatePlayerLinkCallback.getJs().getId() == null) {
                return;
            }
            this.f32067E1 = stalkerCreatePlayerLinkCallback.getJs().getCmd();
            X1(view);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[Catch: Exception -> 0x0047, TryCatch #1 {Exception -> 0x0047, blocks: (B:4:0x0004, B:6:0x000a, B:8:0x0018, B:10:0x001e, B:12:0x0028, B:14:0x0040, B:17:0x004b, B:19:0x0051, B:21:0x005b, B:23:0x0061, B:25:0x006b, B:27:0x0081, B:30:0x0098, B:31:0x009b), top: B:40:0x0004 }] */
    @Override // z7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u0(com.nst.iptvsmarterstvbox.model.callback.SearchTMDBTVShowsCallback r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L49
            java.lang.Integer r2 = r5.getTotalResults()     // Catch: java.lang.Exception -> L47
            if (r2 == 0) goto L49
            java.lang.Integer r2 = r5.getTotalResults()     // Catch: java.lang.Exception -> L47
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L47
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L47
            if (r2 == 0) goto L49
            java.util.List r2 = r5.getResults()     // Catch: java.lang.Exception -> L47
            if (r2 == 0) goto L49
            java.util.List r2 = r5.getResults()     // Catch: java.lang.Exception -> L47
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Exception -> L47
            if (r2 == 0) goto L49
            java.util.List r5 = r5.getResults()     // Catch: java.lang.Exception -> L47
            java.lang.Object r5 = r5.get(r0)     // Catch: java.lang.Exception -> L47
            com.nst.iptvsmarterstvbox.model.pojo.SearchTMDBTVShowsResultPojo r5 = (com.nst.iptvsmarterstvbox.model.pojo.SearchTMDBTVShowsResultPojo) r5     // Catch: java.lang.Exception -> L47
            java.lang.Integer r5 = r5.getId()     // Catch: java.lang.Exception -> L47
            int r5 = r5.intValue()     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch: java.lang.Exception -> L40
            r4.f32119d = r0     // Catch: java.lang.Exception -> L40
        L40:
            n7.i r0 = r4.f32103T0     // Catch: java.lang.Exception -> L47
            r0.b(r5)     // Catch: java.lang.Exception -> L47
            goto Lbc
        L47:
            goto Lb3
        L49:
            if (r5 == 0) goto Lb3
            java.lang.Integer r2 = r5.getTotalResults()     // Catch: java.lang.Exception -> L47
            if (r2 == 0) goto Lb3
            java.lang.Integer r2 = r5.getTotalResults()     // Catch: java.lang.Exception -> L47
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L47
            if (r2 <= r1) goto Lb3
            java.util.List r1 = r5.getResults()     // Catch: java.lang.Exception -> L47
            if (r1 == 0) goto Lb3
        L61:
            java.util.List r1 = r5.getResults()     // Catch: java.lang.Exception -> L47
            int r1 = r1.size()     // Catch: java.lang.Exception -> L47
            if (r0 >= r1) goto Lb3
            java.util.List r1 = r5.getResults()     // Catch: java.lang.Exception -> L47
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Exception -> L47
            com.nst.iptvsmarterstvbox.model.pojo.SearchTMDBTVShowsResultPojo r1 = (com.nst.iptvsmarterstvbox.model.pojo.SearchTMDBTVShowsResultPojo) r1     // Catch: java.lang.Exception -> L47
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Exception -> L47
            java.lang.String r2 = r4.f32121e     // Catch: java.lang.Exception -> L47
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L47
            if (r1 != 0) goto L9b
            java.util.List r1 = r5.getResults()     // Catch: java.lang.Exception -> L47
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Exception -> L47
            com.nst.iptvsmarterstvbox.model.pojo.SearchTMDBTVShowsResultPojo r1 = (com.nst.iptvsmarterstvbox.model.pojo.SearchTMDBTVShowsResultPojo) r1     // Catch: java.lang.Exception -> L47
            java.lang.String r1 = r1.getOriginalName()     // Catch: java.lang.Exception -> L47
            java.lang.String r2 = r4.f32121e     // Catch: java.lang.Exception -> L47
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L47
            if (r1 == 0) goto L98
            goto L9b
        L98:
            int r0 = r0 + 1
            goto L61
        L9b:
            n7.i r1 = r4.f32103T0     // Catch: java.lang.Exception -> L47
            java.util.List r5 = r5.getResults()     // Catch: java.lang.Exception -> L47
            java.lang.Object r5 = r5.get(r0)     // Catch: java.lang.Exception -> L47
            com.nst.iptvsmarterstvbox.model.pojo.SearchTMDBTVShowsResultPojo r5 = (com.nst.iptvsmarterstvbox.model.pojo.SearchTMDBTVShowsResultPojo) r5     // Catch: java.lang.Exception -> L47
            java.lang.Integer r5 = r5.getId()     // Catch: java.lang.Exception -> L47
            int r5 = r5.intValue()     // Catch: java.lang.Exception -> L47
            r1.b(r5)     // Catch: java.lang.Exception -> L47
            goto Lbc
        Lb3:
            android.widget.TextView r5 = r4.f32155p0
            if (r5 == 0) goto Lbc
            r0 = 8
            r5.setVisibility(r0)
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SeriesDetailActivity.u0(com.nst.iptvsmarterstvbox.model.callback.SearchTMDBTVShowsCallback):void");
    }

    @Override // z7.g
    public void v0(String str) {
        try {
            w.X();
        } catch (Exception unused) {
        }
    }

    @Override // z7.g
    public void y0(String str) {
        try {
            w.X();
        } catch (Exception unused) {
        }
    }
}
