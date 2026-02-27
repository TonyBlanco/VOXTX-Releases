package com.nst.iptvsmarterstvbox.view.activity;

import android.R;
import android.animation.ObjectAnimator;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
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
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.model.FavouriteM3UModel;
import com.nst.iptvsmarterstvbox.model.callback.SearchTMDBTVShowsCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBCastsCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBTrailerCallback;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.SeriesDetailM3UActivity;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import m7.AbstractC2237a;
import m7.w;
import o2.AbstractC2312g;
import org.apache.http.HttpHeaders;
import u7.C2858a;
import w7.AbstractC2941e;
import w7.C2937a;
import w7.C2939c;
import w7.C2940d;

/* JADX INFO: loaded from: classes4.dex */
public class SeriesDetailM3UActivity extends androidx.appcompat.app.b implements View.OnClickListener, z7.l {

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public static String f32212Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public static String f32213Z0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public TextView f32214A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public TextView f32216B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public TextView f32218C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public DatabaseHandler f32219C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public TextView f32220D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public PopupWindow f32221D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public TextView f32222E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public Button f32223E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public TextView f32224F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public String f32225F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public TextView f32226G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public String f32227G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public TextView f32228H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public TextView f32229H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public TextView f32230I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public TextView f32231I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public TextView f32232J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public TextView f32233J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public RatingBar f32234K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public MenuItem f32235K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ImageView f32236L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public Menu f32237L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public TextView f32238M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public Button f32239M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public TextView f32240N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ProgressBar f32242O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public n7.i f32243O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public TextView f32244P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public LinearLayout f32245P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public TextView f32246Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public LinearLayout f32247Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public TextView f32248R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public LinearLayout f32249R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public LinearLayout f32250S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public String f32251S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public ScrollView f32252T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public SimpleDateFormat f32253T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public LinearLayout f32254U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public DateFormat f32255U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public LinearLayout f32256V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public Date f32257V0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public LinearLayout f32258W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public String f32259W0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public LinearLayout f32260X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public LinearLayout f32262Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public LinearLayout f32263Z;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public LinearLayout f32266e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public LinearLayout f32268f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public LinearLayout f32270g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public LinearLayout f32272h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public TextView f32274i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public TextView f32276j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public TextView f32278k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public RelativeLayout f32280l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public Context f32282m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public ProgressDialog f32284n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public SharedPreferences f32286o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public SharedPreferences f32288p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public LiveStreamDBHandler f32290q0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f32295t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ImageView f32297u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Toolbar f32299v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AppBarLayout f32301w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f32303x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RelativeLayout f32305y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ImageView f32307z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f32264d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f32265e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f32267f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f32269g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f32271h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f32273i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f32275j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f32277k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f32279l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f32281m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f32283n = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f32285o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f32287p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f32289q = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f32291r = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f32293s = "";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f32292r0 = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f32294s0 = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public String f32296t0 = "";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public String f32298u0 = "";

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public String f32300v0 = "";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public String f32302w0 = "";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public String f32304x0 = "";

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f32306y0 = "";

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public String f32308z0 = "";

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f32215A0 = -1;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public String f32217B0 = "";

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public String f32241N0 = "";

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public Boolean f32261X0 = Boolean.TRUE;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesDetailM3UActivity.this.f32221D0.dismiss();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesDetailM3UActivity.this.f32221D0.dismiss();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesDetailM3UActivity.this.f32221D0.dismiss();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesDetailM3UActivity.this.f32221D0.dismiss();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(SeriesDetailM3UActivity.this.f32282m0);
        }
    }

    public class f extends AbstractC2312g {
        public f() {
        }

        @Override // o2.InterfaceC2315j
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(Bitmap bitmap, n2.c cVar) {
            SeriesDetailM3UActivity.this.f32301w.setBackground(new BitmapDrawable(bitmap));
            SeriesDetailM3UActivity seriesDetailM3UActivity = SeriesDetailM3UActivity.this;
            seriesDetailM3UActivity.f32280l0.setBackgroundColor(seriesDetailM3UActivity.getResources().getColor(a7.c.f11843A));
            SeriesDetailM3UActivity seriesDetailM3UActivity2 = SeriesDetailM3UActivity.this;
            seriesDetailM3UActivity2.f32299v.setBackgroundColor(seriesDetailM3UActivity2.getResources().getColor(a7.c.f11843A));
        }
    }

    public class g extends AbstractC2312g {
        public g() {
        }

        @Override // o2.InterfaceC2315j
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(Bitmap bitmap, n2.c cVar) {
            SeriesDetailM3UActivity.this.f32307z.setBackground(new BitmapDrawable(bitmap));
        }
    }

    public class h implements DialogInterface.OnClickListener {
        public h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.dismiss();
        }
    }

    public class i implements DialogInterface.OnClickListener {
        public i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.n0(SeriesDetailM3UActivity.this.f32282m0);
        }
    }

    public class j implements DialogInterface.OnClickListener {
        public j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.m0(SeriesDetailM3UActivity.this.f32282m0);
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
        public final View f32322a;

        public n(View view) {
            this.f32322a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f32322a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f32322a, "scaleY", f9);
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
                Log.e("id is", "" + this.f32322a.getTag());
                if (this.f32322a.getTag().equals("1")) {
                    a(f9);
                    b(f9);
                    view2 = this.f32322a;
                } else if (this.f32322a.getTag().equals("2")) {
                    a(f9);
                    b(f9);
                    view2 = this.f32322a;
                    i9 = a7.e.f12024k1;
                } else if (this.f32322a.getTag().equals("3") || this.f32322a.getTag().equals("5")) {
                    a(f9);
                    b(f9);
                    view2 = this.f32322a;
                    i9 = a7.e.f12042p;
                } else {
                    View view3 = this.f32322a;
                    if (view3 == null || view3.getTag() == null || !this.f32322a.getTag().equals("8")) {
                        a(1.15f);
                        b(1.15f);
                        return;
                    } else {
                        a(f9);
                        b(f9);
                        view2 = SeriesDetailM3UActivity.this.f32239M0;
                    }
                }
                i9 = a7.e.f12010h;
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                a(f9);
                b(f9);
                if (this.f32322a.getTag().equals("1") || this.f32322a.getTag().equals("2") || this.f32322a.getTag().equals("3") || this.f32322a.getTag().equals("5")) {
                    view2 = this.f32322a;
                } else if (this.f32322a.getTag() == null || !this.f32322a.getTag().equals("8")) {
                    return;
                } else {
                    view2 = SeriesDetailM3UActivity.this.f32239M0;
                }
                i9 = a7.e.f12038o;
            }
            view2.setBackgroundResource(i9);
        }
    }

    private void C1() {
        FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
        favouriteM3UModel.setUrl(this.f32293s);
        favouriteM3UModel.setUserID(SharepreferenceDBHandler.getUserID(this.f32282m0));
        favouriteM3UModel.setName(this.f32264d);
        favouriteM3UModel.setCategoryID(this.f32277k);
        this.f32290q0.addToFavourite(favouriteM3UModel);
        this.f32214A.setText(getResources().getString(a7.j.f13243e6));
        this.f32236L.setVisibility(0);
    }

    private void D1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    public static long E1(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0L;
        }
    }

    public static String F1(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    private void G1() {
        this.f32282m0 = this;
        this.f32219C0 = new DatabaseHandler(this.f32282m0);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f32286o0 = sharedPreferences;
        String string = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        String string2 = this.f32286o0.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        if (string == null || string2 == null || string.isEmpty() || string2.isEmpty()) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else {
            S1(this.f32282m0, string, string2);
        }
    }

    public static /* synthetic */ void L1(View view) {
    }

    private void O1() {
        this.f32290q0.deleteFavourite(this.f32293s, SharepreferenceDBHandler.getUserID(this.f32282m0));
        this.f32214A.setText(getResources().getString(a7.j.f13366r));
        this.f32236L.setVisibility(4);
    }

    private void S1(Context context, String str, String str2) {
        ImageView imageView;
        TextView textView;
        String str3;
        this.f32243O0 = new n7.i(this, context);
        int i9 = 0;
        this.f32252T.setVisibility(0);
        Intent intent = getIntent();
        if (intent != null) {
            this.f32264d = intent.getStringExtra("episode_name");
            this.f32289q = intent.getStringExtra("series_name");
            this.f32291r = intent.getStringExtra("series_icon");
            this.f32293s = intent.getStringExtra("episode_url");
            this.f32308z0 = intent.getStringExtra("series_num");
            this.f32277k = intent.getStringExtra("series_categoryId");
            if (this.f32290q0.checkFavourite(this.f32293s, SharepreferenceDBHandler.getUserID(context)).size() > 0) {
                this.f32214A.setText(getResources().getString(a7.j.f13243e6));
                imageView = this.f32236L;
            } else {
                this.f32214A.setText(getResources().getString(a7.j.f13366r));
                imageView = this.f32236L;
                i9 = 4;
            }
            imageView.setVisibility(i9);
            if (context != null && (str3 = this.f32291r) != null && !str3.isEmpty()) {
                O1.g.u(context).q(this.f32291r).I().m(new g());
            }
            if (this.f32300v0 != null && (textView = this.f32216B) != null) {
                textView.setText(this.f32264d);
            }
            this.f32243O0.d(this.f32289q);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0093 A[PHI: r2
      0x0093: PHI (r2v3 android.widget.TextView) = (r2v2 android.widget.TextView), (r2v12 android.widget.TextView) binds: [B:37:0x0091, B:28:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0150 A[PHI: r7
      0x0150: PHI (r7v5 android.widget.TextView) = (r7v4 android.widget.TextView), (r7v14 android.widget.TextView) binds: [B:83:0x014e, B:71:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // z7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C0(com.nst.iptvsmarterstvbox.model.callback.TMDBTVShowsInfoCallback r7) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SeriesDetailM3UActivity.C0(com.nst.iptvsmarterstvbox.model.callback.TMDBTVShowsInfoCallback):void");
    }

    @Override // z7.l
    public void H0(TMDBTrailerCallback tMDBTrailerCallback) {
        if (tMDBTrailerCallback == null || tMDBTrailerCallback.getResults() == null || tMDBTrailerCallback.getResults().size() <= 0) {
            return;
        }
        for (int i9 = 0; i9 < tMDBTrailerCallback.getResults().size(); i9++) {
            if (tMDBTrailerCallback.getResults().get(i9).getType().equals(HttpHeaders.TRAILER)) {
                this.f32281m = tMDBTrailerCallback.getResults().get(i9).getKey();
                TextView textView = this.f32278k0;
                if (textView != null) {
                    textView.setVisibility(0);
                    return;
                }
                return;
            }
        }
    }

    public final /* synthetic */ void H1(View view) {
        String str;
        String str2;
        SharedPreferences sharedPreferences = this.f32282m0.getSharedPreferences("selectedPlayer", 0);
        this.f32288p0 = sharedPreferences;
        String string = sharedPreferences.getString("selectedPlayer", "");
        SimpleDateFormat simpleDateFormat = this.f32253T0;
        if (E1(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(this.f32282m0))), this.f32255U0.format(this.f32257V0)) >= C2939c.p() && (str = this.f32251S0) != null && this.f32259W0 != null && (!f32213Z0.equals(str) || (this.f32251S0 != null && (str2 = this.f32259W0) != null && !f32212Y0.equals(str2)))) {
            this.f32261X0 = Boolean.FALSE;
        }
        if (this.f32261X0.booleanValue()) {
            try {
                w.v0(this.f32282m0, string, 0, "series", "", this.f32308z0, this.f32264d, null, this.f32293s, "", "");
            } catch (Exception unused) {
            }
        }
    }

    public final /* synthetic */ void I1(View view) {
        if (this.f32290q0.checkFavourite(this.f32293s, SharepreferenceDBHandler.getUserID(this.f32282m0)).size() > 0) {
            O1();
        } else {
            C1();
        }
    }

    public final /* synthetic */ void M1(View view) {
        String str = this.f32281m;
        if (str == null || str.isEmpty()) {
            N1(this);
        } else {
            startActivity(new Intent(this, (Class<?>) YouTubePlayerActivity.class).putExtra("you_tube_trailer", this.f32281m));
        }
    }

    public final void N1(SeriesDetailM3UActivity seriesDetailM3UActivity) {
        View viewInflate = ((LayoutInflater) seriesDetailM3UActivity.getSystemService("layout_inflater")).inflate(a7.g.f12832l3, (RelativeLayout) seriesDetailM3UActivity.findViewById(a7.f.We));
        PopupWindow popupWindow = new PopupWindow(seriesDetailM3UActivity);
        this.f32221D0 = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.f32221D0.setWidth(-1);
        this.f32221D0.setHeight(-1);
        this.f32221D0.setFocusable(true);
        this.f32221D0.setBackgroundDrawable(new BitmapDrawable());
        this.f32221D0.showAtLocation(viewInflate, 17, 0, 0);
        this.f32239M0 = (Button) viewInflate.findViewById(a7.f.f12157H0);
        TextView textView = (TextView) viewInflate.findViewById(a7.f.f12434j3);
        this.f32223E0 = (Button) viewInflate.findViewById(a7.f.f12482o0);
        textView.setText("Series trailer is not available");
        Button button = this.f32239M0;
        if (button != null) {
            button.setOnFocusChangeListener(new n(button));
        }
        Button button2 = this.f32223E0;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new n(button2));
        }
        this.f32223E0.setOnClickListener(new c());
        this.f32239M0.setOnClickListener(new d());
    }

    public void P1() {
        this.f32218C.setOnClickListener(new View.OnClickListener() { // from class: p7.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46669a.H1(view);
            }
        });
        this.f32214A.setOnClickListener(new View.OnClickListener() { // from class: p7.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46671a.I1(view);
            }
        });
        this.f32274i0.setOnClickListener(new View.OnClickListener() { // from class: p7.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46673a.J1(view);
            }
        });
        this.f32276j0.setOnClickListener(new View.OnClickListener() { // from class: p7.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46676a.K1(view);
            }
        });
        this.f32244P.setOnClickListener(new View.OnClickListener() { // from class: p7.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SeriesDetailM3UActivity.L1(view);
            }
        });
        this.f32278k0.setOnClickListener(new View.OnClickListener() { // from class: p7.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46682a.M1(view);
            }
        });
    }

    @Override // z7.l
    public void Q(TMDBCastsCallback tMDBCastsCallback) {
    }

    /* JADX INFO: renamed from: Q1, reason: merged with bridge method [inline-methods] */
    public final void J1(SeriesDetailM3UActivity seriesDetailM3UActivity) {
        View viewInflate = ((LayoutInflater) seriesDetailM3UActivity.getSystemService("layout_inflater")).inflate(a7.g.f12802g3, (RelativeLayout) seriesDetailM3UActivity.findViewById(a7.f.We));
        this.f32229H0 = (TextView) viewInflate.findViewById(a7.f.Wh);
        TextView textView = (TextView) viewInflate.findViewById(a7.f.Ik);
        this.f32233J0 = textView;
        textView.setText(getResources().getString(a7.j.f13422w5));
        this.f32229H0.setText(this.f32225F0);
        PopupWindow popupWindow = new PopupWindow(seriesDetailM3UActivity);
        this.f32221D0 = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.f32221D0.setWidth(-1);
        this.f32221D0.setHeight(-1);
        this.f32221D0.setFocusable(true);
        this.f32221D0.showAtLocation(viewInflate, 17, 0, 0);
        Button button = (Button) viewInflate.findViewById(a7.f.f12482o0);
        this.f32223E0 = button;
        if (button != null) {
            button.setOnFocusChangeListener(new n(button));
        }
        this.f32223E0.setOnClickListener(new a());
    }

    /* JADX INFO: renamed from: R1, reason: merged with bridge method [inline-methods] */
    public final void K1(SeriesDetailM3UActivity seriesDetailM3UActivity) {
        View viewInflate = ((LayoutInflater) seriesDetailM3UActivity.getSystemService("layout_inflater")).inflate(a7.g.f12814i3, (RelativeLayout) seriesDetailM3UActivity.findViewById(a7.f.We));
        TextView textView = (TextView) viewInflate.findViewById(a7.f.Aj);
        this.f32231I0 = textView;
        textView.setText(this.f32227G0);
        PopupWindow popupWindow = new PopupWindow(seriesDetailM3UActivity);
        this.f32221D0 = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.f32221D0.setWidth(-1);
        this.f32221D0.setHeight(-1);
        this.f32221D0.setFocusable(true);
        this.f32221D0.showAtLocation(viewInflate, 17, 0, 0);
        Button button = (Button) viewInflate.findViewById(a7.f.f12482o0);
        this.f32223E0 = button;
        if (button != null) {
            button.setOnFocusChangeListener(new n(button));
        }
        this.f32223E0.setOnClickListener(new b());
    }

    @Override // z7.b
    public void a() {
    }

    @Override // z7.b
    public void b() {
        ProgressDialog progressDialog = this.f32284n0;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    @Override // z7.b
    public void d(String str) {
        this.f32245P0.setVisibility(8);
        this.f32249R0.setVisibility(0);
    }

    @Override // androidx.appcompat.app.b, D.AbstractActivityC0525h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return keyCode == 82 ? keyEvent.getAction() == 0 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent) : super.dispatchKeyEvent(keyEvent);
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
        setContentView(a7.g.f12687O0);
        this.f32297u = (ImageView) findViewById(a7.f.Xa);
        this.f32299v = (Toolbar) findViewById(a7.f.kh);
        this.f32301w = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f32303x = (TextView) findViewById(a7.f.qh);
        this.f32305y = (RelativeLayout) findViewById(a7.f.Nd);
        this.f32307z = (ImageView) findViewById(a7.f.f12102B5);
        this.f32214A = (TextView) findViewById(a7.f.xh);
        this.f32216B = (TextView) findViewById(a7.f.lk);
        this.f32218C = (TextView) findViewById(a7.f.Pk);
        this.f32220D = (TextView) findViewById(a7.f.kk);
        this.f32222E = (TextView) findViewById(a7.f.Hi);
        this.f32224F = (TextView) findViewById(a7.f.Ii);
        this.f32226G = (TextView) findViewById(a7.f.Rh);
        this.f32228H = (TextView) findViewById(a7.f.Th);
        this.f32230I = (TextView) findViewById(a7.f.tl);
        this.f32232J = (TextView) findViewById(a7.f.ul);
        this.f32234K = (RatingBar) findViewById(a7.f.bd);
        this.f32236L = (ImageView) findViewById(a7.f.f12406g5);
        this.f32238M = (TextView) findViewById(a7.f.ik);
        this.f32240N = (TextView) findViewById(a7.f.zj);
        this.f32242O = (ProgressBar) findViewById(a7.f.Ei);
        this.f32244P = (TextView) findViewById(a7.f.Fi);
        this.f32246Q = (TextView) findViewById(a7.f.gk);
        this.f32248R = (TextView) findViewById(a7.f.hk);
        this.f32250S = (LinearLayout) findViewById(a7.f.f12265R8);
        this.f32252T = (ScrollView) findViewById(a7.f.Tf);
        this.f32254U = (LinearLayout) findViewById(a7.f.f12174I7);
        this.f32256V = (LinearLayout) findViewById(a7.f.H9);
        this.f32258W = (LinearLayout) findViewById(a7.f.f12274S7);
        this.f32260X = (LinearLayout) findViewById(a7.f.f12521r8);
        this.f32262Y = (LinearLayout) findViewById(a7.f.f12499p7);
        this.f32263Z = (LinearLayout) findViewById(a7.f.f12184J7);
        this.f32266e0 = (LinearLayout) findViewById(a7.f.I9);
        this.f32268f0 = (LinearLayout) findViewById(a7.f.f12284T7);
        this.f32270g0 = (LinearLayout) findViewById(a7.f.f12531s8);
        this.f32272h0 = (LinearLayout) findViewById(a7.f.f12510q7);
        this.f32274i0 = (TextView) findViewById(a7.f.kl);
        this.f32276j0 = (TextView) findViewById(a7.f.ll);
        this.f32278k0 = (TextView) findViewById(a7.f.qm);
        this.f32280l0 = (RelativeLayout) findViewById(a7.f.vf);
        this.f32245P0 = (LinearLayout) findViewById(a7.f.f12134E7);
        this.f32247Q0 = (LinearLayout) findViewById(a7.f.f12144F7);
        this.f32249R0 = (LinearLayout) findViewById(a7.f.f12154G7);
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        this.f32282m0 = this;
        P1();
        AppBarLayout appBarLayout = this.f32301w;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(a7.e.f11917H));
        }
        TextView textView = this.f32218C;
        if (textView != null) {
            textView.setOnFocusChangeListener(new n(textView));
            this.f32218C.requestFocus();
            this.f32218C.setFocusable(true);
        }
        TextView textView2 = this.f32214A;
        if (textView2 != null) {
            textView2.setOnFocusChangeListener(new n(textView2));
        }
        TextView textView3 = this.f32244P;
        if (textView3 != null) {
            textView3.setOnFocusChangeListener(new n(textView3));
        }
        TextView textView4 = this.f32274i0;
        if (textView4 != null) {
            textView4.setOnFocusChangeListener(new n(textView4));
        }
        TextView textView5 = this.f32276j0;
        if (textView5 != null) {
            textView5.setOnFocusChangeListener(new n(textView5));
        }
        TextView textView6 = this.f32278k0;
        if (textView6 != null) {
            textView6.setOnFocusChangeListener(new n(textView6));
        }
        this.f32251S0 = w.S0(C2937a.a());
        Locale locale = Locale.US;
        this.f32253T0 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f32257V0 = new Date();
        this.f32255U0 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        f32212Y0 = getApplicationContext().getPackageName();
        this.f32259W0 = w.S0(C2940d.d());
        f32213Z0 = F1(this.f32282m0);
        getWindow().setFlags(1024, 1024);
        r1((Toolbar) findViewById(a7.f.kh));
        D1();
        SharepreferenceDBHandler.setCurrentAPPType("m3u", this.f32282m0);
        this.f32290q0 = new LiveStreamDBHandler(this.f32282m0);
        this.f32297u.setOnClickListener(new e());
        G1();
        SharedPreferences sharedPreferences = this.f32282m0.getSharedPreferences("selectedPlayer", 0);
        this.f32288p0 = sharedPreferences;
        this.f32302w0 = sharedPreferences.getString("selectedPlayer", "");
        ImageView imageView = this.f32295t;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f32299v.x(a7.h.f12939v);
        this.f32237L0 = menu;
        this.f32235K0 = menu.getItem(1).getSubMenu().findItem(a7.f.f12239P2);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f32299v.getChildCount(); i9++) {
            if (this.f32299v.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f32299v.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        if (i9 != 82) {
            return super.onKeyUp(i9, keyEvent);
        }
        Menu menu = this.f32237L0;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(a7.f.f12239P2, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f32235K0 = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == a7.f.Gb) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == a7.f.Mb) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == a7.f.f12380e && (context = this.f32282m0) != null) {
            new a.C0158a(context, a7.k.f13456a).setTitle(getResources().getString(a7.j.f13250f3)).f(getResources().getString(a7.j.f13240e3)).j(getResources().getString(a7.j.f13132S8), new i()).g(getResources().getString(a7.j.f13231d4), new h()).n();
        }
        if (itemId == a7.f.fb) {
            a.C0158a c0158a = new a.C0158a(this);
            c0158a.setTitle(this.f32282m0.getResources().getString(a7.j.f13397u0));
            c0158a.f(this.f32282m0.getResources().getString(a7.j.f13134T0));
            c0158a.d(a7.e.f12056s1);
            c0158a.j(this.f32282m0.getResources().getString(a7.j.f13132S8), new j());
            c0158a.g(this.f32282m0.getResources().getString(a7.j.f13231d4), new k());
            c0158a.n();
        }
        if (itemId == a7.f.hb) {
            a.C0158a c0158a2 = new a.C0158a(this);
            c0158a2.setTitle(this.f32282m0.getResources().getString(a7.j.f13397u0));
            c0158a2.f(this.f32282m0.getResources().getString(a7.j.f13134T0));
            c0158a2.d(a7.e.f12056s1);
            c0158a2.j(this.f32282m0.getResources().getString(a7.j.f13132S8), new l());
            c0158a2.g(this.f32282m0.getResources().getString(a7.j.f13231d4), new m());
            c0158a2.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        w.m(this.f32282m0);
        w.z0(this.f32282m0);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f32286o0 = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f32286o0.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f32282m0 != null) {
            b();
        }
    }

    @Override // z7.l
    public void u0(SearchTMDBTVShowsCallback searchTMDBTVShowsCallback) {
        View view;
        TextView textView;
        StringBuilder sb;
        String str;
        if (searchTMDBTVShowsCallback == null || searchTMDBTVShowsCallback.getTotalResults() == null || !searchTMDBTVShowsCallback.getTotalResults().equals(1) || searchTMDBTVShowsCallback.getResults() == null || searchTMDBTVShowsCallback.getResults().get(0) == null) {
            String str2 = this.f32264d;
            if (str2 != null && (textView = this.f32216B) != null) {
                textView.setText(str2);
            }
            TextView textView2 = this.f32248R;
            if (textView2 != null) {
                textView2.setText("N/A");
            }
            TextView textView3 = this.f32228H;
            if (textView3 != null) {
                textView3.setText("N/A");
            }
            TextView textView4 = this.f32224F;
            if (textView4 != null) {
                textView4.setText("N/A");
            }
            TextView textView5 = this.f32232J;
            if (textView5 != null) {
                textView5.setText("N/A");
            }
            TextView textView6 = this.f32276j0;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
            TextView textView7 = this.f32240N;
            if (textView7 != null) {
                textView7.setText("N/A");
            }
            TextView textView8 = this.f32274i0;
            if (textView8 != null) {
                textView8.setVisibility(8);
            }
            this.f32245P0.setVisibility(8);
            view = this.f32249R0;
        } else {
            int iIntValue = searchTMDBTVShowsCallback.getResults().get(0).getId().intValue();
            this.f32243O0.c(iIntValue);
            this.f32243O0.e(iIntValue);
            String firstAirDate = searchTMDBTVShowsCallback.getResults().get(0).getFirstAirDate();
            Double voteAverage = searchTMDBTVShowsCallback.getResults().get(0).getVoteAverage();
            this.f32265e = searchTMDBTVShowsCallback.getResults().get(0).getOverview();
            String backdropPath = searchTMDBTVShowsCallback.getResults().get(0).getBackdropPath();
            if (new C2858a(this.f32282m0).A().equals(AbstractC2237a.f44453K0)) {
                sb = new StringBuilder();
                str = "https://image.tmdb.org/t/p/w1280/";
            } else {
                sb = new StringBuilder();
                str = "https://image.tmdb.org/t/p/w500/";
            }
            sb.append(str);
            sb.append(backdropPath);
            String string = sb.toString();
            if (this.f32301w != null && backdropPath != null) {
                O1.g.u(getApplicationContext()).q(string).I().m(new f());
            }
            if (this.f32256V == null || this.f32266e0 == null || this.f32232J == null || firstAirDate == null || firstAirDate.isEmpty() || firstAirDate.equals("n/A")) {
                LinearLayout linearLayout = this.f32256V;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                LinearLayout linearLayout2 = this.f32266e0;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                TextView textView9 = this.f32232J;
                if (textView9 != null) {
                    textView9.setText("N/A");
                }
            } else {
                this.f32256V.setVisibility(0);
                this.f32266e0.setVisibility(0);
                this.f32232J.setText(firstAirDate);
            }
            if (this.f32234K != null && voteAverage != null && !voteAverage.equals("n/A")) {
                this.f32234K.setVisibility(0);
                try {
                    this.f32234K.setRating(Float.parseFloat(String.valueOf(voteAverage)) / 2.0f);
                } catch (NumberFormatException unused) {
                    this.f32234K.setRating(0.0f);
                }
            }
            String str3 = this.f32265e;
            this.f32225F0 = str3;
            if (this.f32262Y == null || this.f32272h0 == null || this.f32228H == null || str3 == null || str3.isEmpty()) {
                LinearLayout linearLayout3 = this.f32262Y;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(0);
                }
                LinearLayout linearLayout4 = this.f32272h0;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(0);
                }
                TextView textView10 = this.f32274i0;
                if (textView10 != null) {
                    textView10.setVisibility(8);
                }
                TextView textView11 = this.f32228H;
                if (textView11 != null) {
                    textView11.setText("N/A");
                    return;
                }
                return;
            }
            this.f32262Y.setVisibility(0);
            this.f32272h0.setVisibility(0);
            if (this.f32265e.length() <= 150) {
                this.f32228H.setText(this.f32265e);
                this.f32274i0.setVisibility(8);
                return;
            } else {
                this.f32228H.setText(this.f32265e);
                view = this.f32274i0;
            }
        }
        view.setVisibility(0);
    }
}
