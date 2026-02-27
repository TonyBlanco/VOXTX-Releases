package com.nst.iptvsmarterstvbox.view.ijkplayer.activities;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.PasswordStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti1;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti2;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti3;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti4;
import d4.AbstractC1681B;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import m7.AbstractC2237a;
import m7.w;
import org.apache.http.client.config.CookieSpecs;
import org.json.JSONObject;
import q7.C2639x;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import u7.C2858a;
import w7.AbstractC2941e;
import w7.C2939c;

/* JADX INFO: loaded from: classes4.dex */
public class NSTIJKPlayerMultiActivity extends androidx.appcompat.app.b implements z7.h, View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static String f35085h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static String f35086i1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public LiveStreamDBHandler f35087A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public PopupWindow f35088A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f35089B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public ArrayList f35090B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f35091C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public ArrayList f35092C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public TextView f35093D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f35095E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public ArrayList f35096E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public TextView f35097F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public ArrayList f35098F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public DateFormat f35099G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public ArrayList f35100G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public ArrayList f35102H0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public C2639x f35106J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public GridLayoutManager f35108K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public RecyclerView f35110L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public ProgressBar f35112M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public RelativeLayout f35114N0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public AppBarLayout f35118P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public TextView f35120Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public ProgressBar f35122R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public ProgressBar f35124S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public ProgressBar f35126T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public ProgressBar f35128U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public ImageView f35130V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public ImageView f35132W0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public SimpleDateFormat f35133X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public ImageView f35134X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public NSTIJKPlayerMulti1 f35135Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public ImageView f35136Y0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public NSTIJKPlayerMulti2 f35137Z;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public ImageView f35138Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public ImageView f35139a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public Runnable f35140b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public Handler f35141c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f35142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f35144e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public NSTIJKPlayerMulti3 f35145e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public SharedPreferences f35146e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinearLayout f35147f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public NSTIJKPlayerMulti4 f35148f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public String f35149f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f35150g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Date f35151g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f35153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f35155i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public String f35156i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f35157j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public String f35158j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f35159k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public SharedPreferences f35160k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f35161l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public C2858a f35162l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f35163m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f35165n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinearLayout f35167o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f35169p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LinearLayout f35171q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f35175s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f35177t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f35179u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f35181v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f35183w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f35185x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f35187y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f35189z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public PopupWindow f35190z0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f35173r = false;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f35101H = "";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f35103I = "";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public String f35105J = "";

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public String f35107K = "";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f35109L = 0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f35111M = 0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f35113N = 0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f35115O = 0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public String f35117P = "";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public String f35119Q = "";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public String f35121R = "";

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public String f35123S = "";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public String f35125T = "";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public String f35127U = "";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public String f35129V = "";

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public String f35131W = "";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Boolean f35154h0 = Boolean.TRUE;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f35164m0 = 0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public String f35166n0 = "";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public String f35168o0 = "";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f35170p0 = "";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f35172q0 = "";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public String f35174r0 = "";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public String f35176s0 = "";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public String f35178t0 = "";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public String f35180u0 = "";

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public String f35182v0 = "";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public String f35184w0 = "";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public String f35186x0 = "";

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f35188y0 = "";

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public ArrayList f35094D0 = new ArrayList();

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f35104I0 = 0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public AsyncTask f35116O0 = null;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public View f35143d1 = null;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final boolean[] f35152g1 = {false};

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity = NSTIJKPlayerMultiActivity.this;
            nSTIJKPlayerMultiActivity.b2(nSTIJKPlayerMultiActivity.f35142d);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NSTIJKPlayerMultiActivity.this.f35088A0 == null) {
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity = NSTIJKPlayerMultiActivity.this;
                nSTIJKPlayerMultiActivity.f35152g1[0] = false;
                nSTIJKPlayerMultiActivity.f35141c1.postDelayed(nSTIJKPlayerMultiActivity.f35140b1, 100L);
            } else if (NSTIJKPlayerMultiActivity.this.f35088A0.isShowing()) {
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity2 = NSTIJKPlayerMultiActivity.this;
                nSTIJKPlayerMultiActivity2.f35152g1[0] = true;
                nSTIJKPlayerMultiActivity2.f35141c1.removeCallbacks(nSTIJKPlayerMultiActivity2.f35140b1);
            } else {
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity3 = NSTIJKPlayerMultiActivity.this;
                nSTIJKPlayerMultiActivity3.b2(nSTIJKPlayerMultiActivity3.f35142d);
            }
            NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity4 = NSTIJKPlayerMultiActivity.this;
            if (nSTIJKPlayerMultiActivity4.f35152g1[0]) {
                return;
            }
            nSTIJKPlayerMultiActivity4.f35141c1.postDelayed(nSTIJKPlayerMultiActivity4.f35140b1, 100L);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerMultiActivity.this.f35158j0 = CookieSpecs.DEFAULT;
            NSTIJKPlayerMultiActivity.this.c2();
            NSTIJKPlayerMultiActivity.this.f35088A0.dismiss();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerMultiActivity.this.f35158j0 = "screen1";
            NSTIJKPlayerMultiActivity.this.c2();
            NSTIJKPlayerMultiActivity.this.f35088A0.dismiss();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerMultiActivity.this.f35158j0 = "screen2";
            NSTIJKPlayerMultiActivity.this.c2();
            NSTIJKPlayerMultiActivity.this.f35088A0.dismiss();
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerMultiActivity.this.f35158j0 = "screen3";
            NSTIJKPlayerMultiActivity.this.c2();
            NSTIJKPlayerMultiActivity.this.f35088A0.dismiss();
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerMultiActivity.this.f35158j0 = "screen4";
            NSTIJKPlayerMultiActivity.this.c2();
            NSTIJKPlayerMultiActivity.this.f35088A0.dismiss();
        }
    }

    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerMultiActivity.this.f35158j0 = "screen5";
            NSTIJKPlayerMultiActivity.this.c2();
            NSTIJKPlayerMultiActivity.this.f35088A0.dismiss();
        }
    }

    public class j implements PopupMenu.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f35200a;

        public j(int i9) {
            this.f35200a = i9;
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == a7.f.Fb) {
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity = NSTIJKPlayerMultiActivity.this;
                nSTIJKPlayerMultiActivity.J1(nSTIJKPlayerMultiActivity.f35142d);
                return false;
            }
            if (itemId != a7.f.Kb) {
                return false;
            }
            NSTIJKPlayerMultiActivity.this.Y1(this.f35200a);
            NSTIJKPlayerMultiActivity.this.P1(this.f35200a);
            return false;
        }
    }

    public class k extends AsyncTask {
        public k() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(NSTIJKPlayerMultiActivity.this.R1());
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity;
            GridLayoutManager gridLayoutManager;
            View view;
            NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity2;
            GridLayoutManager gridLayoutManager2;
            super.onPostExecute(bool);
            int i9 = 8;
            if (SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerMultiActivity.this.f35142d).equals("m3u")) {
                if (NSTIJKPlayerMultiActivity.this.f35090B0 == null || NSTIJKPlayerMultiActivity.this.f35104I0 == 0) {
                    ProgressBar progressBar = NSTIJKPlayerMultiActivity.this.f35112M0;
                    if (progressBar == null) {
                        return;
                    }
                    progressBar.setVisibility(8);
                    view = NSTIJKPlayerMultiActivity.this.f35114N0;
                    i9 = 0;
                } else {
                    NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity3 = NSTIJKPlayerMultiActivity.this;
                    ArrayList arrayList = NSTIJKPlayerMultiActivity.this.f35090B0;
                    NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity4 = NSTIJKPlayerMultiActivity.this;
                    Context context = nSTIJKPlayerMultiActivity4.f35142d;
                    nSTIJKPlayerMultiActivity3.f35106J0 = new C2639x(arrayList, context, (z7.h) context, nSTIJKPlayerMultiActivity4.f35190z0, NSTIJKPlayerMultiActivity.this.f35164m0);
                    if (new C2858a(NSTIJKPlayerMultiActivity.this.f35142d).A().equals(AbstractC2237a.f44453K0)) {
                        nSTIJKPlayerMultiActivity2 = NSTIJKPlayerMultiActivity.this;
                        gridLayoutManager2 = new GridLayoutManager(nSTIJKPlayerMultiActivity2.f35142d, 2);
                    } else {
                        nSTIJKPlayerMultiActivity2 = NSTIJKPlayerMultiActivity.this;
                        gridLayoutManager2 = new GridLayoutManager(nSTIJKPlayerMultiActivity2.f35142d, 2);
                    }
                    nSTIJKPlayerMultiActivity2.f35108K0 = gridLayoutManager2;
                    NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity5 = NSTIJKPlayerMultiActivity.this;
                    nSTIJKPlayerMultiActivity5.f35110L0.setLayoutManager(nSTIJKPlayerMultiActivity5.f35108K0);
                    NSTIJKPlayerMultiActivity.this.f35110L0.setItemAnimator(new androidx.recyclerview.widget.c());
                    NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity6 = NSTIJKPlayerMultiActivity.this;
                    nSTIJKPlayerMultiActivity6.f35110L0.setAdapter(nSTIJKPlayerMultiActivity6.f35106J0);
                    view = NSTIJKPlayerMultiActivity.this.f35112M0;
                    if (view == null) {
                        return;
                    }
                }
            } else {
                if (NSTIJKPlayerMultiActivity.this.f35090B0 == null) {
                    return;
                }
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity7 = NSTIJKPlayerMultiActivity.this;
                ArrayList arrayList2 = NSTIJKPlayerMultiActivity.this.f35090B0;
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity8 = NSTIJKPlayerMultiActivity.this;
                Context context2 = nSTIJKPlayerMultiActivity8.f35142d;
                nSTIJKPlayerMultiActivity7.f35106J0 = new C2639x(arrayList2, context2, (z7.h) context2, nSTIJKPlayerMultiActivity8.f35190z0, NSTIJKPlayerMultiActivity.this.f35164m0);
                if (new C2858a(NSTIJKPlayerMultiActivity.this.f35142d).A().equals(AbstractC2237a.f44453K0)) {
                    nSTIJKPlayerMultiActivity = NSTIJKPlayerMultiActivity.this;
                    gridLayoutManager = new GridLayoutManager(nSTIJKPlayerMultiActivity.f35142d, 2);
                } else {
                    nSTIJKPlayerMultiActivity = NSTIJKPlayerMultiActivity.this;
                    gridLayoutManager = new GridLayoutManager(nSTIJKPlayerMultiActivity.f35142d, 2);
                }
                nSTIJKPlayerMultiActivity.f35108K0 = gridLayoutManager;
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity9 = NSTIJKPlayerMultiActivity.this;
                nSTIJKPlayerMultiActivity9.f35110L0.setLayoutManager(nSTIJKPlayerMultiActivity9.f35108K0);
                NSTIJKPlayerMultiActivity.this.f35110L0.setItemAnimator(new androidx.recyclerview.widget.c());
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity10 = NSTIJKPlayerMultiActivity.this;
                nSTIJKPlayerMultiActivity10.f35110L0.setAdapter(nSTIJKPlayerMultiActivity10.f35106J0);
                view = NSTIJKPlayerMultiActivity.this.f35112M0;
                if (view == null) {
                    return;
                }
            }
            view.setVisibility(i9);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public static long K1(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0L;
        }
    }

    public static String M1(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    private ArrayList N1() {
        ArrayList<PasswordStatusDBModel> allPasswordStatus = this.f35087A.getAllPasswordStatus(SharepreferenceDBHandler.getUserID(this.f35142d));
        this.f35100G0 = allPasswordStatus;
        if (allPasswordStatus != null) {
            for (PasswordStatusDBModel passwordStatusDBModel : allPasswordStatus) {
                if (passwordStatusDBModel.getPasswordStatus().equals("1")) {
                    this.f35094D0.add(passwordStatusDBModel.getPasswordStatusCategoryId());
                }
            }
        }
        return this.f35094D0;
    }

    private ArrayList O1(ArrayList arrayList, ArrayList arrayList2) {
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
                        ArrayList arrayList3 = this.f35098F0;
                        if (arrayList3 != null) {
                            arrayList3.add(liveStreamCategoryIdDBModel);
                        }
                    }
                }
            }
        }
        return this.f35098F0;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x004c A[PHI: r1
      0x004c: PHI (r1v14 java.lang.String) = (r1v2 java.lang.String), (r1v3 java.lang.String) binds: [B:3:0x004a, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void Q1() {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerMultiActivity.Q1():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3 A[Catch: NullPointerException | Exception -> 0x0275, NullPointerException | Exception -> 0x0275, TRY_ENTER, TryCatch #0 {NullPointerException | Exception -> 0x0275, blocks: (B:3:0x0005, B:5:0x000a, B:7:0x000e, B:9:0x0012, B:10:0x001a, B:12:0x005f, B:14:0x0063, B:16:0x0075, B:17:0x007d, B:19:0x0081, B:23:0x0093, B:26:0x00a3, B:26:0x00a3, B:28:0x00ac, B:28:0x00ac, B:31:0x00b4, B:31:0x00b4, B:33:0x00bc, B:33:0x00bc, B:35:0x00c0, B:35:0x00c0, B:38:0x00c8, B:38:0x00c8, B:40:0x00da, B:40:0x00da, B:42:0x00ec, B:42:0x00ec, B:44:0x0100, B:44:0x0100, B:49:0x0177, B:49:0x0177, B:50:0x017c, B:50:0x017c, B:45:0x0129, B:45:0x0129, B:47:0x014d, B:47:0x014d, B:48:0x014f, B:48:0x014f, B:51:0x0180, B:51:0x0180, B:53:0x0184, B:53:0x0184, B:55:0x018a, B:55:0x018a, B:56:0x0190, B:56:0x0190, B:58:0x0194, B:58:0x0194, B:61:0x019c, B:61:0x019c, B:63:0x01a4, B:63:0x01a4, B:65:0x01a8, B:65:0x01a8, B:68:0x01b0, B:68:0x01b0, B:70:0x01c2, B:70:0x01c2, B:72:0x01d4, B:72:0x01d4, B:74:0x01e8, B:74:0x01e8, B:79:0x025f, B:79:0x025f, B:80:0x0264, B:80:0x0264, B:75:0x0211, B:75:0x0211, B:77:0x0235, B:77:0x0235, B:78:0x0237, B:78:0x0237, B:81:0x0268, B:81:0x0268, B:83:0x026c, B:83:0x026c, B:20:0x0084, B:22:0x0088), top: B:88:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018a A[Catch: NullPointerException | Exception -> 0x0275, NullPointerException | Exception -> 0x0275, TryCatch #0 {NullPointerException | Exception -> 0x0275, blocks: (B:3:0x0005, B:5:0x000a, B:7:0x000e, B:9:0x0012, B:10:0x001a, B:12:0x005f, B:14:0x0063, B:16:0x0075, B:17:0x007d, B:19:0x0081, B:23:0x0093, B:26:0x00a3, B:26:0x00a3, B:28:0x00ac, B:28:0x00ac, B:31:0x00b4, B:31:0x00b4, B:33:0x00bc, B:33:0x00bc, B:35:0x00c0, B:35:0x00c0, B:38:0x00c8, B:38:0x00c8, B:40:0x00da, B:40:0x00da, B:42:0x00ec, B:42:0x00ec, B:44:0x0100, B:44:0x0100, B:49:0x0177, B:49:0x0177, B:50:0x017c, B:50:0x017c, B:45:0x0129, B:45:0x0129, B:47:0x014d, B:47:0x014d, B:48:0x014f, B:48:0x014f, B:51:0x0180, B:51:0x0180, B:53:0x0184, B:53:0x0184, B:55:0x018a, B:55:0x018a, B:56:0x0190, B:56:0x0190, B:58:0x0194, B:58:0x0194, B:61:0x019c, B:61:0x019c, B:63:0x01a4, B:63:0x01a4, B:65:0x01a8, B:65:0x01a8, B:68:0x01b0, B:68:0x01b0, B:70:0x01c2, B:70:0x01c2, B:72:0x01d4, B:72:0x01d4, B:74:0x01e8, B:74:0x01e8, B:79:0x025f, B:79:0x025f, B:80:0x0264, B:80:0x0264, B:75:0x0211, B:75:0x0211, B:77:0x0235, B:77:0x0235, B:78:0x0237, B:78:0x0237, B:81:0x0268, B:81:0x0268, B:83:0x026c, B:83:0x026c, B:20:0x0084, B:22:0x0088), top: B:88:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0190 A[Catch: NullPointerException | Exception -> 0x0275, NullPointerException | Exception -> 0x0275, TryCatch #0 {NullPointerException | Exception -> 0x0275, blocks: (B:3:0x0005, B:5:0x000a, B:7:0x000e, B:9:0x0012, B:10:0x001a, B:12:0x005f, B:14:0x0063, B:16:0x0075, B:17:0x007d, B:19:0x0081, B:23:0x0093, B:26:0x00a3, B:26:0x00a3, B:28:0x00ac, B:28:0x00ac, B:31:0x00b4, B:31:0x00b4, B:33:0x00bc, B:33:0x00bc, B:35:0x00c0, B:35:0x00c0, B:38:0x00c8, B:38:0x00c8, B:40:0x00da, B:40:0x00da, B:42:0x00ec, B:42:0x00ec, B:44:0x0100, B:44:0x0100, B:49:0x0177, B:49:0x0177, B:50:0x017c, B:50:0x017c, B:45:0x0129, B:45:0x0129, B:47:0x014d, B:47:0x014d, B:48:0x014f, B:48:0x014f, B:51:0x0180, B:51:0x0180, B:53:0x0184, B:53:0x0184, B:55:0x018a, B:55:0x018a, B:56:0x0190, B:56:0x0190, B:58:0x0194, B:58:0x0194, B:61:0x019c, B:61:0x019c, B:63:0x01a4, B:63:0x01a4, B:65:0x01a8, B:65:0x01a8, B:68:0x01b0, B:68:0x01b0, B:70:0x01c2, B:70:0x01c2, B:72:0x01d4, B:72:0x01d4, B:74:0x01e8, B:74:0x01e8, B:79:0x025f, B:79:0x025f, B:80:0x0264, B:80:0x0264, B:75:0x0211, B:75:0x0211, B:77:0x0235, B:77:0x0235, B:78:0x0237, B:78:0x0237, B:81:0x0268, B:81:0x0268, B:83:0x026c, B:83:0x026c, B:20:0x0084, B:22:0x0088), top: B:88:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean R1() {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerMultiActivity.R1():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b2(Context context) {
        try {
            View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(new C2858a(context).A().equals(AbstractC2237a.f44453K0) ? a7.g.f12863q4 : a7.g.f12857p4, (LinearLayout) findViewById(a7.f.Rf));
            this.f35130V0 = (ImageView) viewInflate.findViewById(a7.f.f12139F2);
            this.f35132W0 = (ImageView) viewInflate.findViewById(a7.f.Mf);
            this.f35134X0 = (ImageView) viewInflate.findViewById(a7.f.Nf);
            this.f35136Y0 = (ImageView) viewInflate.findViewById(a7.f.Of);
            this.f35138Z0 = (ImageView) viewInflate.findViewById(a7.f.Pf);
            this.f35139a1 = (ImageView) viewInflate.findViewById(a7.f.Qf);
            PopupWindow popupWindow = new PopupWindow(context);
            this.f35088A0 = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.f35088A0.setWidth(-1);
            this.f35088A0.setHeight(-1);
            this.f35088A0.setFocusable(true);
            this.f35088A0.showAtLocation(viewInflate, 0, 0, 0);
            this.f35130V0.setOnClickListener(new d());
            this.f35132W0.setOnClickListener(new e());
            this.f35134X0.setOnClickListener(new f());
            this.f35136Y0.setOnClickListener(new g());
            this.f35138Z0.setOnClickListener(new h());
            this.f35139a1.setOnClickListener(new i());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c2() {
        int i9;
        Y1(0);
        String str = this.f35158j0;
        str.hashCode();
        switch (str) {
            case "screen1":
                i9 = a7.g.f12890v1;
                break;
            case "screen2":
                i9 = a7.g.f12896w1;
                break;
            case "screen3":
                i9 = a7.g.f12902x1;
                break;
            case "screen4":
                i9 = a7.g.f12908y1;
                break;
            case "screen5":
                i9 = a7.g.f12914z1;
                break;
            default:
                i9 = a7.g.f12884u1;
                break;
        }
        setContentView(i9);
        Q1();
        if (this.f35125T.equals("0") || this.f35101H.equals("")) {
            a2(1, false, false);
        } else {
            T1();
        }
    }

    public final boolean I1() {
        String str;
        String str2;
        SimpleDateFormat simpleDateFormat = this.f35133X;
        if (K1(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(this.f35142d))), this.f35099G.format(this.f35151g0)) >= C2939c.p() && (str = this.f35091C) != null && this.f35089B != null && (!f35085h1.equals(str) || (this.f35091C != null && (str2 = this.f35089B) != null && !f35086i1.equals(str2)))) {
            this.f35154h0 = Boolean.FALSE;
        }
        return this.f35154h0.booleanValue();
    }

    public final void J1(Context context) {
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(a7.g.f12724U1, (LinearLayout) findViewById(a7.f.M9));
        this.f35112M0 = (ProgressBar) viewInflate.findViewById(a7.f.ec);
        this.f35110L0 = (RecyclerView) viewInflate.findViewById(a7.f.ub);
        this.f35114N0 = (RelativeLayout) viewInflate.findViewById(a7.f.Oe);
        this.f35118P0 = (AppBarLayout) viewInflate.findViewById(a7.f.f12303W);
        TextView textView = (TextView) viewInflate.findViewById(a7.f.Jl);
        this.f35120Q0 = textView;
        textView.setText(context.getResources().getString(a7.j.f13267h0));
        PopupWindow popupWindow = new PopupWindow(context);
        this.f35190z0 = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.f35190z0.setWidth(-1);
        this.f35190z0.setHeight(-1);
        this.f35190z0.setFocusable(true);
        this.f35190z0.setOnDismissListener(new a());
        ProgressBar progressBar = this.f35112M0;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        AppBarLayout appBarLayout = this.f35118P0;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(a7.c.f11845C));
        }
        this.f35116O0 = new k().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        this.f35190z0.showAtLocation(viewInflate, 1, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void L1(int r14) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerMultiActivity.L1(int):void");
    }

    public final void P1(int i9) {
        LinearLayout linearLayout;
        if (i9 == 1) {
            this.f35135Y.setVisibility(8);
            linearLayout = this.f35147f;
        } else if (i9 == 2) {
            this.f35137Z.setVisibility(8);
            linearLayout = this.f35150g;
        } else if (i9 == 3) {
            this.f35145e0.setVisibility(8);
            linearLayout = this.f35153h;
        } else {
            if (i9 != 4) {
                return;
            }
            this.f35148f0.setVisibility(8);
            linearLayout = this.f35155i;
        }
        linearLayout.setVisibility(8);
    }

    public void S1(int i9) {
        if (i9 == 1) {
            this.f35135Y.d0();
            this.f35137Z.R();
        } else {
            if (i9 != 2) {
                if (i9 == 3) {
                    this.f35145e0.d0();
                    this.f35135Y.R();
                    this.f35137Z.R();
                    this.f35148f0.R();
                }
                if (i9 == 4) {
                    this.f35148f0.d0();
                    this.f35135Y.R();
                    this.f35137Z.R();
                    this.f35145e0.R();
                    return;
                }
                return;
            }
            this.f35137Z.d0();
            this.f35135Y.R();
        }
        this.f35145e0.R();
        this.f35148f0.R();
    }

    public final void T1() {
        String string;
        NSTIJKPlayerMulti1 nSTIJKPlayerMulti1;
        JSONObject jSONObject;
        String str;
        String str2;
        String str3;
        String str4 = "";
        a2(1, true, true);
        if (!I1()) {
            d2(1);
            return;
        }
        ArrayList<LiveStreamsDBModel> channelDetails = this.f35087A.getChannelDetails(this.f35125T, "live");
        if (channelDetails != null && channelDetails.size() != 0) {
            this.f35166n0 = channelDetails.get(0).getName();
            this.f35175s = channelDetails.get(0).getEpgChannelId();
            this.f35183w = channelDetails.get(0).getStreamIcon();
            this.f35174r0 = channelDetails.get(0).getCategoryId();
            this.f35182v0 = channelDetails.get(0).getUrl();
            try {
                this.f35109L = Integer.parseInt(channelDetails.get(0).getStreamId());
            } catch (NumberFormatException unused) {
                this.f35109L = -1;
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f35142d).equals("onestream_api")) {
                try {
                    this.f35117P = channelDetails.get(0).getStreamIdOneStream();
                } catch (Exception unused2) {
                }
            }
        }
        this.f35135Y.V();
        if (this.f35154h0.booleanValue()) {
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f35142d).equals("onestream_api")) {
                try {
                    jSONObject = new JSONObject(this.f35182v0);
                    String str5 = this.f35149f1;
                    str = "m3u8";
                    str2 = "ts";
                    if (str5 == null || str5.isEmpty() || !this.f35149f1.equals("ts")) {
                        string = "";
                        str3 = string;
                    } else {
                        Iterator<String> itKeys = jSONObject.keys();
                        while (true) {
                            if (!itKeys.hasNext()) {
                                str3 = "";
                                break;
                            } else if (itKeys.next().equals("ts")) {
                                str3 = "ts";
                                break;
                            }
                        }
                        if (str3.equals("")) {
                            while (true) {
                                if (!itKeys.hasNext()) {
                                    break;
                                } else if (itKeys.next().equals("m3u8")) {
                                    str3 = "m3u8";
                                    break;
                                }
                            }
                        }
                        string = jSONObject.getString(str3);
                    }
                } catch (Exception e9) {
                    e = e9;
                }
                try {
                    String str6 = this.f35149f1;
                    if (str6 != null && !str6.isEmpty() && this.f35149f1.equals("m3u8")) {
                        Iterator<String> itKeys2 = jSONObject.keys();
                        while (true) {
                            if (!itKeys2.hasNext()) {
                                str = str3;
                                break;
                            } else if (itKeys2.next().equals("m3u8")) {
                                break;
                            }
                        }
                        if (str.equals("")) {
                            while (itKeys2.hasNext()) {
                                if (itKeys2.next().equals("ts")) {
                                    break;
                                }
                            }
                            str2 = str;
                            string = jSONObject.getString(str2);
                        } else {
                            str2 = str;
                            string = jSONObject.getString(str2);
                        }
                    }
                } catch (Exception e10) {
                    String str7 = string;
                    e = e10;
                    str4 = str7;
                    AbstractC1681B.d("exce", String.valueOf(e));
                    string = str4;
                }
                nSTIJKPlayerMulti1 = this.f35135Y;
            } else {
                nSTIJKPlayerMulti1 = this.f35135Y;
                string = this.f35101H;
            }
            nSTIJKPlayerMulti1.Y(Uri.parse(string), true, this.f35166n0);
            NSTIJKPlayerMulti1 nSTIJKPlayerMulti12 = this.f35135Y;
            nSTIJKPlayerMulti12.f36720z = 0;
            nSTIJKPlayerMulti12.f36671B = false;
            nSTIJKPlayerMulti12.start();
        }
    }

    public void U1() {
        String string;
        NSTIJKPlayerMulti2 nSTIJKPlayerMulti2;
        JSONObject jSONObject;
        String str;
        String str2;
        String str3;
        String str4 = "";
        a2(2, true, true);
        if (!I1()) {
            d2(2);
            return;
        }
        ArrayList<LiveStreamsDBModel> channelDetails = this.f35087A.getChannelDetails(this.f35127U, "live");
        if (channelDetails != null && channelDetails.size() != 0) {
            this.f35168o0 = channelDetails.get(0).getName();
            this.f35177t = channelDetails.get(0).getEpgChannelId();
            this.f35185x = channelDetails.get(0).getStreamIcon();
            this.f35176s0 = channelDetails.get(0).getCategoryId();
            this.f35184w0 = channelDetails.get(0).getUrl();
            try {
                this.f35111M = Integer.parseInt(channelDetails.get(0).getStreamId());
            } catch (NumberFormatException unused) {
                this.f35111M = -1;
            }
            try {
                this.f35119Q = channelDetails.get(0).getStreamIdOneStream();
            } catch (Exception unused2) {
            }
        }
        this.f35137Z.V();
        if (this.f35154h0.booleanValue()) {
            if (this.f35156i0.equals("onestream_api")) {
                try {
                    jSONObject = new JSONObject(this.f35184w0);
                    String str5 = this.f35149f1;
                    str = "m3u8";
                    str2 = "ts";
                    if (str5 == null || str5.isEmpty() || !this.f35149f1.equals("ts")) {
                        string = "";
                        str3 = string;
                    } else {
                        Iterator<String> itKeys = jSONObject.keys();
                        while (true) {
                            if (!itKeys.hasNext()) {
                                str3 = "";
                                break;
                            } else if (itKeys.next().equals("ts")) {
                                str3 = "ts";
                                break;
                            }
                        }
                        if (str3.equals("")) {
                            while (true) {
                                if (!itKeys.hasNext()) {
                                    break;
                                } else if (itKeys.next().equals("m3u8")) {
                                    str3 = "m3u8";
                                    break;
                                }
                            }
                        }
                        string = jSONObject.getString(str3);
                    }
                } catch (Exception e9) {
                    e = e9;
                }
                try {
                    String str6 = this.f35149f1;
                    if (str6 != null && !str6.isEmpty() && this.f35149f1.equals("m3u8")) {
                        Iterator<String> itKeys2 = jSONObject.keys();
                        while (true) {
                            if (!itKeys2.hasNext()) {
                                str = str3;
                                break;
                            } else if (itKeys2.next().equals("m3u8")) {
                                break;
                            }
                        }
                        if (str.equals("")) {
                            while (itKeys2.hasNext()) {
                                if (itKeys2.next().equals("ts")) {
                                    break;
                                }
                            }
                            str2 = str;
                            string = jSONObject.getString(str2);
                        } else {
                            str2 = str;
                            string = jSONObject.getString(str2);
                        }
                    }
                } catch (Exception e10) {
                    String str7 = string;
                    e = e10;
                    str4 = str7;
                    AbstractC1681B.d("exce", String.valueOf(e));
                    string = str4;
                }
                nSTIJKPlayerMulti2 = this.f35137Z;
            } else {
                nSTIJKPlayerMulti2 = this.f35137Z;
                string = this.f35103I;
            }
            nSTIJKPlayerMulti2.Y(Uri.parse(string), true, this.f35168o0);
            NSTIJKPlayerMulti2 nSTIJKPlayerMulti22 = this.f35137Z;
            nSTIJKPlayerMulti22.f36782z = 0;
            nSTIJKPlayerMulti22.f36733B = false;
            nSTIJKPlayerMulti22.start();
        }
    }

    public void V1() {
        String string;
        NSTIJKPlayerMulti3 nSTIJKPlayerMulti3;
        JSONObject jSONObject;
        String str;
        String str2;
        String str3;
        String str4 = "";
        a2(3, true, true);
        if (!I1()) {
            d2(3);
            return;
        }
        ArrayList<LiveStreamsDBModel> channelDetails = this.f35087A.getChannelDetails(this.f35129V, "live");
        if (channelDetails != null && channelDetails.size() != 0) {
            this.f35170p0 = channelDetails.get(0).getName();
            this.f35179u = channelDetails.get(0).getEpgChannelId();
            this.f35187y = channelDetails.get(0).getStreamIcon();
            this.f35178t0 = channelDetails.get(0).getCategoryId();
            this.f35186x0 = channelDetails.get(0).getUrl();
            try {
                this.f35113N = Integer.parseInt(channelDetails.get(0).getStreamId());
            } catch (NumberFormatException unused) {
                this.f35113N = -1;
            }
            try {
                this.f35121R = channelDetails.get(0).getStreamIdOneStream();
            } catch (Exception unused2) {
            }
        }
        this.f35145e0.V();
        if (this.f35154h0.booleanValue()) {
            if (this.f35156i0.equals("onestream_api")) {
                try {
                    jSONObject = new JSONObject(this.f35186x0);
                    String str5 = this.f35149f1;
                    str = "m3u8";
                    str2 = "ts";
                    if (str5 == null || str5.isEmpty() || !this.f35149f1.equals("ts")) {
                        string = "";
                        str3 = string;
                    } else {
                        Iterator<String> itKeys = jSONObject.keys();
                        while (true) {
                            if (!itKeys.hasNext()) {
                                str3 = "";
                                break;
                            } else if (itKeys.next().equals("ts")) {
                                str3 = "ts";
                                break;
                            }
                        }
                        if (str3.equals("")) {
                            while (true) {
                                if (!itKeys.hasNext()) {
                                    break;
                                } else if (itKeys.next().equals("m3u8")) {
                                    str3 = "m3u8";
                                    break;
                                }
                            }
                        }
                        string = jSONObject.getString(str3);
                    }
                } catch (Exception e9) {
                    e = e9;
                }
                try {
                    String str6 = this.f35149f1;
                    if (str6 != null && !str6.isEmpty() && this.f35149f1.equals("m3u8")) {
                        Iterator<String> itKeys2 = jSONObject.keys();
                        while (true) {
                            if (!itKeys2.hasNext()) {
                                str = str3;
                                break;
                            } else if (itKeys2.next().equals("m3u8")) {
                                break;
                            }
                        }
                        if (str.equals("")) {
                            while (itKeys2.hasNext()) {
                                if (itKeys2.next().equals("ts")) {
                                    break;
                                }
                            }
                            str2 = str;
                            string = jSONObject.getString(str2);
                        } else {
                            str2 = str;
                            string = jSONObject.getString(str2);
                        }
                    }
                } catch (Exception e10) {
                    String str7 = string;
                    e = e10;
                    str4 = str7;
                    AbstractC1681B.d("exce", String.valueOf(e));
                    string = str4;
                }
                nSTIJKPlayerMulti3 = this.f35145e0;
            } else {
                nSTIJKPlayerMulti3 = this.f35145e0;
                string = this.f35105J;
            }
            nSTIJKPlayerMulti3.Y(Uri.parse(string), true, this.f35170p0);
            NSTIJKPlayerMulti3 nSTIJKPlayerMulti32 = this.f35145e0;
            nSTIJKPlayerMulti32.f36844z = 0;
            nSTIJKPlayerMulti32.f36795B = false;
            nSTIJKPlayerMulti32.start();
        }
    }

    public void W1() {
        String string;
        NSTIJKPlayerMulti4 nSTIJKPlayerMulti4;
        JSONObject jSONObject;
        String str;
        String str2;
        String str3;
        String str4 = "";
        a2(4, true, true);
        if (!I1()) {
            d2(4);
            return;
        }
        ArrayList<LiveStreamsDBModel> channelDetails = this.f35087A.getChannelDetails(this.f35131W, "live");
        if (channelDetails != null && channelDetails.size() != 0) {
            this.f35172q0 = channelDetails.get(0).getName();
            this.f35181v = channelDetails.get(0).getEpgChannelId();
            this.f35189z = channelDetails.get(0).getStreamIcon();
            this.f35180u0 = channelDetails.get(0).getCategoryId();
            this.f35188y0 = channelDetails.get(0).getUrl();
            try {
                this.f35115O = Integer.parseInt(channelDetails.get(0).getStreamId());
            } catch (NumberFormatException unused) {
                this.f35115O = -1;
            }
            try {
                this.f35123S = channelDetails.get(0).getStreamIdOneStream();
            } catch (Exception unused2) {
            }
        }
        this.f35148f0.V();
        if (this.f35154h0.booleanValue()) {
            if (this.f35156i0.equals("onestream_api")) {
                try {
                    jSONObject = new JSONObject(this.f35188y0);
                    String str5 = this.f35149f1;
                    str = "m3u8";
                    str2 = "ts";
                    if (str5 == null || str5.isEmpty() || !this.f35149f1.equals("ts")) {
                        string = "";
                        str3 = string;
                    } else {
                        Iterator<String> itKeys = jSONObject.keys();
                        while (true) {
                            if (!itKeys.hasNext()) {
                                str3 = "";
                                break;
                            } else if (itKeys.next().equals("ts")) {
                                str3 = "ts";
                                break;
                            }
                        }
                        if (str3.equals("")) {
                            while (true) {
                                if (!itKeys.hasNext()) {
                                    break;
                                } else if (itKeys.next().equals("m3u8")) {
                                    str3 = "m3u8";
                                    break;
                                }
                            }
                        }
                        string = jSONObject.getString(str3);
                    }
                } catch (Exception e9) {
                    e = e9;
                }
                try {
                    String str6 = this.f35149f1;
                    if (str6 != null && !str6.isEmpty() && this.f35149f1.equals("m3u8")) {
                        Iterator<String> itKeys2 = jSONObject.keys();
                        while (true) {
                            if (!itKeys2.hasNext()) {
                                str = str3;
                                break;
                            } else if (itKeys2.next().equals("m3u8")) {
                                break;
                            }
                        }
                        if (str.equals("")) {
                            while (itKeys2.hasNext()) {
                                if (itKeys2.next().equals("ts")) {
                                    break;
                                }
                            }
                            str2 = str;
                            string = jSONObject.getString(str2);
                        } else {
                            str2 = str;
                            string = jSONObject.getString(str2);
                        }
                    }
                } catch (Exception e10) {
                    String str7 = string;
                    e = e10;
                    str4 = str7;
                    AbstractC1681B.d("exce", String.valueOf(e));
                    string = str4;
                }
                nSTIJKPlayerMulti4 = this.f35148f0;
            } else {
                nSTIJKPlayerMulti4 = this.f35148f0;
                string = this.f35107K;
            }
            nSTIJKPlayerMulti4.Y(Uri.parse(string), true, this.f35172q0);
            NSTIJKPlayerMulti4 nSTIJKPlayerMulti42 = this.f35148f0;
            nSTIJKPlayerMulti42.f36906z = 0;
            nSTIJKPlayerMulti42.f36857B = false;
            nSTIJKPlayerMulti42.start();
        }
    }

    public final void X1(int i9, View view) {
        if (this.f35142d != null) {
            this.f35164m0 = i9;
            PopupMenu popupMenu = new PopupMenu(this, view);
            popupMenu.getMenuInflater().inflate(a7.h.f12929l, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new j(i9));
            popupMenu.show();
        }
    }

    public void Y1(int i9) {
        NSTIJKPlayerMulti1 nSTIJKPlayerMulti1;
        NSTIJKPlayerMulti2 nSTIJKPlayerMulti2;
        NSTIJKPlayerMulti3 nSTIJKPlayerMulti3;
        NSTIJKPlayerMulti4 nSTIJKPlayerMulti4;
        NSTIJKPlayerMulti1 nSTIJKPlayerMulti12;
        NSTIJKPlayerMulti2 nSTIJKPlayerMulti22;
        NSTIJKPlayerMulti3 nSTIJKPlayerMulti32;
        NSTIJKPlayerMulti4 nSTIJKPlayerMulti42;
        Boolean bool = Boolean.FALSE;
        if (i9 == 0) {
            bool = Boolean.TRUE;
        }
        if ((bool.booleanValue() || i9 == 1) && (nSTIJKPlayerMulti1 = this.f35135Y) != null) {
            nSTIJKPlayerMulti1.pause();
        }
        if ((bool.booleanValue() || i9 == 2) && (nSTIJKPlayerMulti2 = this.f35137Z) != null) {
            nSTIJKPlayerMulti2.pause();
        }
        if ((bool.booleanValue() || i9 == 3) && (nSTIJKPlayerMulti3 = this.f35145e0) != null) {
            nSTIJKPlayerMulti3.pause();
        }
        if ((bool.booleanValue() || i9 == 4) && (nSTIJKPlayerMulti4 = this.f35148f0) != null) {
            nSTIJKPlayerMulti4.pause();
        }
        try {
            if ((bool.booleanValue() || i9 == 1) && (nSTIJKPlayerMulti12 = this.f35135Y) != null) {
                if (nSTIJKPlayerMulti12.P()) {
                    this.f35135Y.J();
                } else {
                    this.f35135Y.c0();
                    this.f35135Y.T(true);
                    this.f35135Y.b0();
                }
                IjkMediaPlayer.native_profileEnd();
                if (i9 == 1) {
                    this.f35101H = "";
                    this.f35135Y.f36694c = null;
                    this.f35122R0.setVisibility(8);
                }
            }
            if ((bool.booleanValue() || i9 == 2) && (nSTIJKPlayerMulti22 = this.f35137Z) != null) {
                if (nSTIJKPlayerMulti22.P()) {
                    this.f35137Z.J();
                } else {
                    this.f35137Z.c0();
                    this.f35137Z.T(true);
                    this.f35137Z.b0();
                }
                IjkMediaPlayer.native_profileEnd();
                if (i9 == 2) {
                    this.f35103I = "";
                    this.f35137Z.f36756c = null;
                    this.f35124S0.setVisibility(8);
                }
            }
            if ((bool.booleanValue() || i9 == 3) && (nSTIJKPlayerMulti32 = this.f35145e0) != null) {
                if (nSTIJKPlayerMulti32.P()) {
                    this.f35145e0.J();
                } else {
                    this.f35145e0.c0();
                    this.f35145e0.T(true);
                    this.f35145e0.b0();
                }
                IjkMediaPlayer.native_profileEnd();
                if (i9 == 3) {
                    this.f35105J = "";
                    this.f35145e0.f36818c = null;
                    this.f35126T0.setVisibility(8);
                }
            }
            if ((bool.booleanValue() || i9 == 4) && (nSTIJKPlayerMulti42 = this.f35148f0) != null) {
                if (nSTIJKPlayerMulti42.P()) {
                    this.f35148f0.J();
                } else {
                    this.f35148f0.c0();
                    this.f35148f0.T(true);
                    this.f35148f0.b0();
                }
                IjkMediaPlayer.native_profileEnd();
                if (i9 == 4) {
                    this.f35107K = "";
                    this.f35148f0.f36880c = null;
                    this.f35128U0.setVisibility(8);
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void Z1() {
        findViewById(a7.f.f12502q).setBackground(getResources().getDrawable(a7.e.f11923I1));
        findViewById(a7.f.f12512r).setBackground(getResources().getDrawable(a7.e.f11923I1));
        findViewById(a7.f.f12522s).setBackground(getResources().getDrawable(a7.e.f11923I1));
        findViewById(a7.f.f12532t).setBackground(getResources().getDrawable(a7.e.f11923I1));
    }

    public final void a2(int i9, boolean z9, boolean z10) {
        int i10;
        int i11;
        int i12;
        Z1();
        if (i9 == 1) {
            if ((z9 && this.f35147f.getVisibility() != 0) || (z9 && z10)) {
                this.f35135Y.setVisibility(0);
            }
            findViewById(a7.f.f12502q).setFocusable(true);
            findViewById(a7.f.f12502q).requestFocus();
            findViewById(a7.f.f12502q).setBackground(getResources().getDrawable(a7.e.f12041o2));
            i12 = a7.f.f12512r;
        } else {
            if (i9 != 2) {
                if (i9 == 3) {
                    if ((z9 && this.f35153h.getVisibility() != 0) || (z9 && z10)) {
                        this.f35145e0.setVisibility(0);
                    }
                    findViewById(a7.f.f12522s).setFocusable(true);
                    findViewById(a7.f.f12522s).requestFocus();
                    findViewById(a7.f.f12522s).setBackground(getResources().getDrawable(a7.e.f12041o2));
                    findViewById(a7.f.f12502q).setFocusable(false);
                    i11 = a7.f.f12512r;
                    findViewById(i11).setFocusable(false);
                    i10 = a7.f.f12532t;
                    findViewById(i10).setFocusable(false);
                }
                if (i9 == 4) {
                    if ((z9 && this.f35155i.getVisibility() != 0) || (z9 && z10)) {
                        this.f35148f0.setVisibility(0);
                    }
                    findViewById(a7.f.f12532t).setFocusable(true);
                    findViewById(a7.f.f12532t).requestFocus();
                    findViewById(a7.f.f12532t).setBackground(getResources().getDrawable(a7.e.f12041o2));
                    findViewById(a7.f.f12502q).setFocusable(false);
                    findViewById(a7.f.f12512r).setFocusable(false);
                    i10 = a7.f.f12522s;
                    findViewById(i10).setFocusable(false);
                }
                return;
            }
            if ((z9 && this.f35150g.getVisibility() != 0) || (z9 && z10)) {
                this.f35137Z.setVisibility(0);
            }
            findViewById(a7.f.f12512r).setFocusable(true);
            findViewById(a7.f.f12512r).requestFocus();
            findViewById(a7.f.f12512r).setBackground(getResources().getDrawable(a7.e.f12041o2));
            i12 = a7.f.f12502q;
        }
        findViewById(i12).setFocusable(false);
        i11 = a7.f.f12522s;
        findViewById(i11).setFocusable(false);
        i10 = a7.f.f12532t;
        findViewById(i10).setFocusable(false);
    }

    public final void d2(int i9) {
        TextView textView;
        StringBuilder sb;
        String strS0 = w.S0(w7.k.a() + w7.k.i());
        if (i9 == 1) {
            this.f35135Y.setVisibility(8);
            this.f35147f.setVisibility(0);
            textView = this.f35157j;
            sb = new StringBuilder();
        } else if (i9 == 2) {
            this.f35137Z.setVisibility(8);
            this.f35150g.setVisibility(0);
            textView = this.f35159k;
            sb = new StringBuilder();
        } else if (i9 == 3) {
            this.f35145e0.setVisibility(8);
            this.f35153h.setVisibility(0);
            textView = this.f35161l;
            sb = new StringBuilder();
        } else {
            if (i9 != 4) {
                return;
            }
            this.f35148f0.setVisibility(8);
            this.f35155i.setVisibility(0);
            textView = this.f35163m;
            sb = new StringBuilder();
        }
        sb.append(strS0);
        sb.append(this.f35144e);
        sb.append(this.f35095E);
        textView.setText(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // androidx.appcompat.app.b, D.AbstractActivityC0525h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        boolean z9 = keyEvent.getAction() == 0;
        if (keyCode == 82) {
            try {
                keyEvent = z9 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent);
                return keyEvent;
            } catch (Exception unused) {
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void e2(String str) {
        int i9;
        int i10;
        int i11;
        str.hashCode();
        byte b9 = -1;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    b9 = 0;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    b9 = 1;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    b9 = 2;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    b9 = 3;
                }
                break;
        }
        Z1();
        switch (b9) {
            case 0:
            default:
                this.f35164m0 = 1;
                S1(1);
                findViewById(a7.f.f12502q).setFocusable(true);
                findViewById(a7.f.f12502q).requestFocus();
                findViewById(a7.f.f12502q).setBackground(getResources().getDrawable(a7.e.f12041o2));
                i9 = a7.f.f12512r;
                findViewById(i9).setFocusable(false);
                i10 = a7.f.f12522s;
                findViewById(i10).setFocusable(false);
                i11 = a7.f.f12532t;
                break;
            case 1:
                this.f35164m0 = 2;
                S1(2);
                findViewById(a7.f.f12512r).setFocusable(true);
                findViewById(a7.f.f12512r).requestFocus();
                findViewById(a7.f.f12512r).setBackground(getResources().getDrawable(a7.e.f12041o2));
                i9 = a7.f.f12502q;
                findViewById(i9).setFocusable(false);
                i10 = a7.f.f12522s;
                findViewById(i10).setFocusable(false);
                i11 = a7.f.f12532t;
                break;
            case 2:
                this.f35164m0 = 3;
                S1(3);
                findViewById(a7.f.f12522s).setFocusable(true);
                findViewById(a7.f.f12522s).requestFocus();
                findViewById(a7.f.f12522s).setBackground(getResources().getDrawable(a7.e.f12041o2));
                findViewById(a7.f.f12502q).setFocusable(false);
                i10 = a7.f.f12512r;
                findViewById(i10).setFocusable(false);
                i11 = a7.f.f12532t;
                break;
            case 3:
                this.f35164m0 = 4;
                S1(4);
                findViewById(a7.f.f12532t).setFocusable(true);
                findViewById(a7.f.f12532t).requestFocus();
                findViewById(a7.f.f12532t).setBackground(getResources().getDrawable(a7.e.f12041o2));
                findViewById(a7.f.f12502q).setFocusable(false);
                findViewById(a7.f.f12512r).setFocusable(false);
                i11 = a7.f.f12522s;
                break;
        }
        findViewById(i11).setFocusable(false);
    }

    public final void f2() {
        try {
            this.f35141c1 = new Handler();
            c cVar = new c();
            this.f35140b1 = cVar;
            if (this.f35152g1[0]) {
                return;
            }
            cVar.run();
        } catch (Exception e9) {
            AbstractC1681B.b("", "" + e9);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i9;
        int id = view.getId();
        if (id == a7.f.f12502q) {
            i9 = 1;
        } else if (id == a7.f.f12512r) {
            i9 = 2;
        } else if (id == a7.f.f12522s) {
            i9 = 3;
        } else if (id != a7.f.f12532t) {
            return;
        } else {
            i9 = 4;
        }
        try {
            L1(i9);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f35142d = this;
        super.onCreate(bundle);
        this.f35158j0 = SharepreferenceDBHandler.getScreenTYPE(this.f35142d);
        c2();
        if (SharepreferenceDBHandler.getShowPopup(this.f35142d)) {
            new Handler().postDelayed(new b(), 100L);
            f2();
        }
        SharedPreferences sharedPreferences = this.f35142d.getSharedPreferences("allowedFormat", 0);
        this.f35146e1 = sharedPreferences;
        this.f35149f1 = sharedPreferences.getString("allowedFormat", "");
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        this.f35101H = getIntent().getStringExtra("url");
        String strValueOf = String.valueOf(getIntent().getIntExtra("CHANNEL_NUM", 0));
        this.f35125T = strValueOf;
        if (strValueOf.equals("0") || this.f35101H.equals("")) {
            a2(1, false, false);
        } else {
            T1();
        }
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            Y1(0);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013a  */
    @Override // androidx.appcompat.app.b, android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyDown(int r11, android.view.KeyEvent r12) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerMultiActivity.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        return super.onKeyUp(i9, keyEvent);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        int id = view.getId();
        if (id == a7.f.f12502q) {
            try {
                if (!this.f35101H.equals("")) {
                    S1(1);
                    a2(1, true, false);
                    X1(1, view);
                }
            } catch (Exception unused) {
            }
            return true;
        }
        if (id == a7.f.f12512r) {
            try {
                if (!this.f35103I.equals("")) {
                    S1(2);
                    a2(2, true, false);
                    X1(2, view);
                }
            } catch (Exception unused2) {
            }
            return true;
        }
        if (id == a7.f.f12522s) {
            try {
                if (!this.f35105J.equals("")) {
                    S1(3);
                    a2(3, true, false);
                    X1(3, view);
                }
            } catch (Exception unused3) {
            }
            return true;
        }
        if (id == a7.f.f12532t) {
            try {
                if (!this.f35107K.equals("")) {
                    S1(4);
                    a2(4, true, false);
                    X1(4, view);
                }
            } catch (Exception unused4) {
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        w.m(this.f35142d);
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            Y1(0);
        } catch (Exception unused) {
        }
    }

    @Override // z7.h
    public void p(String str, String str2) {
        int i9 = this.f35164m0;
        if (i9 == 1) {
            if (this.f35135Y != null) {
                this.f35101H = str;
                this.f35125T = str2;
                findViewById(a7.f.f12502q).setFocusable(true);
                T1();
                return;
            }
            return;
        }
        if (i9 == 2) {
            if (this.f35137Z != null) {
                this.f35103I = str;
                this.f35127U = str2;
                findViewById(a7.f.f12512r).setFocusable(true);
                U1();
                return;
            }
            return;
        }
        if (i9 == 3) {
            if (this.f35145e0 != null) {
                this.f35105J = str;
                this.f35129V = str2;
                findViewById(a7.f.f12522s).setFocusable(true);
                V1();
                return;
            }
            return;
        }
        if (i9 != 4 || this.f35148f0 == null) {
            return;
        }
        this.f35107K = str;
        this.f35131W = str2;
        findViewById(a7.f.f12532t).setFocusable(true);
        W1();
    }
}
