package com.nst.iptvsmarterstvbox.view.utility.epg;

import a7.j;
import a7.k;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.nst.iptvsmarterstvbox.model.FavouriteDBModel;
import com.nst.iptvsmarterstvbox.model.FavouriteM3UModel;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.sbpfunction.singletonpushnotification.Listsingleton;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG;
import com.squareup.picasso.C;
import com.squareup.picasso.t;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import m7.AbstractC2237a;
import m7.w;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDateTime;
import s5.I;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import u7.C2858a;
import w7.AbstractC2941e;
import w7.C2937a;
import w7.C2939c;
import w7.C2940d;

/* JADX INFO: loaded from: classes4.dex */
public class EPG extends ViewGroup {

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static int f37692f1 = 3600000;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static int f37693g1 = 14400000;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static int f37694h1 = 7200000;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static int f37695i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static int f37696j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final CookieManager f37697k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static String f37698l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static String f37699m1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f37700A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public boolean f37701A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f37702B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public LinearLayout f37703B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f37704C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public TextView f37705C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f37706D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public long f37707D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f37708E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public String f37709E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f37710F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f37711F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Bitmap f37712G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f37713G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f37714H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public SharedPreferences f37715H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final Map f37716I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public boolean f37717I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final Map f37718J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public Handler f37719J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C7.a f37720K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public Handler f37721K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f37722L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public SurfaceView f37723L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f37724M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public int f37725M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public long f37726N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public NSTIJKPlayerSmallEPG f37727N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public long f37728O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public Activity f37729O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public long f37730P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public Boolean f37731P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public long f37732Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public int f37733Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f37734R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public boolean f37735R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public SharedPreferences f37736S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public int f37737S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public long f37738T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public ProgressDialog f37739T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C7.b f37740U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public C2858a f37741U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public D7.a f37742V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public Uri f37743V0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public D7.a f37744W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public boolean f37745W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public boolean f37746X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public Boolean f37747Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public Date f37748Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DatabaseHandler f37749a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public DateFormat f37750a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public SimpleDateFormat f37751b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LiveStreamDBHandler f37752c;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public String f37753c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f37754d;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public String f37755d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SimpleDateFormat f37756e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public D7.b f37757e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public LinearLayout f37758e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SimpleDateFormat f37759f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public TextView f37760f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SharedPreferences f37761g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public TextView f37762g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f37763h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public TextView f37764h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f37765i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f37766i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f37767j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public SharedPreferences f37768j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Paint f37769k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public SharedPreferences f37770k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Scroller f37771l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public PopupWindow f37772l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final GestureDetector f37773m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public Context f37774m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f37775n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public ProgressBar f37776n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f37777o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f37778o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f37779p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f37780p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f37781q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f37782q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f37783r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public String f37784r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f37785s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f37786s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f37787t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f37788t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f37789u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f37790u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f37791v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f37792v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f37793w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f37794w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f37795x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f37796x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f37797y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f37798y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f37799z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f37800z0;

    public class a implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f37801a;

        public a(String str) {
            this.f37801a = str;
        }

        @Override // com.squareup.picasso.C
        public void a(Drawable drawable) {
            EPG.this.f37716I.put(this.f37801a, BitmapFactory.decodeResource(EPG.this.getResources(), a7.e.f12016i1));
            EPG.this.l0();
            EPG.this.f37718J.remove(this.f37801a);
        }

        @Override // com.squareup.picasso.C
        public void b(Bitmap bitmap, t.e eVar) {
            EPG.this.f37716I.put(this.f37801a, bitmap);
            EPG.this.l0();
            EPG.this.f37718J.remove(this.f37801a);
        }

        @Override // com.squareup.picasso.C
        public void c(Drawable drawable) {
        }
    }

    public class b implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f37803a;

        public b(View view) {
            this.f37803a = view;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (z9) {
                View view2 = this.f37803a;
                if (view2 == null || view2.getTag() == null) {
                    return;
                }
                this.f37803a.getTag().equals("iv_cross");
                return;
            }
            View view3 = this.f37803a;
            if (view3 == null || view3.getTag() == null || !this.f37803a.getTag().equals("iv_cross")) {
                return;
            }
            view.setBackground(EPG.this.getResources().getDrawable(a7.e.f11933L));
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f37805a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f37806c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f37807d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f37808e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f37809f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f37810g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f37811h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f37812i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f37813j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f37814k;

        public c(Context context, String str, int i9, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f37805a = context;
            this.f37806c = str;
            this.f37807d = i9;
            this.f37808e = str2;
            this.f37809f = str3;
            this.f37810g = str4;
            this.f37811h = str5;
            this.f37812i = str6;
            this.f37813j = str7;
            this.f37814k = str8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EPG.this.f37772l0.dismiss();
            if (!AbstractC2237a.f44475V0.booleanValue() || !AbstractC2237a.f44498e1.equalsIgnoreCase("1")) {
                if (EPG.this.f37747Y0.booleanValue()) {
                    w.y0(EPG.this.getContext(), this.f37806c, this.f37807d, "live", this.f37808e, this.f37809f, this.f37810g, this.f37811h, this.f37812i, this.f37813j, this.f37814k);
                }
            } else {
                if (SharepreferenceDBHandler.getEventAdsView(this.f37805a) >= AbstractC2237a.f44501f1) {
                    SharepreferenceDBHandler.setEventAdsView(0, this.f37805a);
                    EPG epg = EPG.this;
                    epg.f0(epg.getContext(), this.f37806c, this.f37807d, "live", this.f37808e, this.f37809f, this.f37810g, this.f37811h, this.f37812i, this.f37813j, this.f37814k);
                    return;
                }
                if (SharepreferenceDBHandler.getEventAdsView(this.f37805a) == 0 && SharepreferenceDBHandler.getFirstTimeAdsShow(this.f37805a)) {
                    SharepreferenceDBHandler.setFirstTimeAdsShow(false, this.f37805a);
                    EPG epg2 = EPG.this;
                    epg2.f0(epg2.getContext(), this.f37806c, this.f37807d, "live", this.f37808e, this.f37809f, this.f37810g, this.f37811h, this.f37812i, this.f37813j, this.f37814k);
                } else if (EPG.this.f37747Y0.booleanValue()) {
                    w.y0(EPG.this.getContext(), this.f37806c, this.f37807d, "live", this.f37808e, this.f37809f, this.f37810g, this.f37811h, this.f37812i, this.f37813j, this.f37814k);
                }
                SharepreferenceDBHandler.setEventAdsView(SharepreferenceDBHandler.getEventAdsView(this.f37805a) + 1, this.f37805a);
            }
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f37816a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f37817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f37818d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f37819e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f37820f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f37821g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f37822h;

        public d(Context context, String str, String str2, String str3, int i9, String str4, String str5) {
            this.f37816a = context;
            this.f37817c = str;
            this.f37818d = str2;
            this.f37819e = str3;
            this.f37820f = i9;
            this.f37821g = str4;
            this.f37822h = str5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f37816a).equals("m3u")) {
                EPG.this.y(this.f37816a, this.f37817c, this.f37818d, this.f37819e);
            } else {
                EPG.this.x(this.f37816a, this.f37817c, this.f37820f, this.f37819e, this.f37821g, this.f37822h);
            }
            EPG.this.f37772l0.dismiss();
        }
    }

    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f37824a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f37825c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f37826d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f37827e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f37828f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f37829g;

        public e(Context context, String str, String str2, String str3, int i9, String str4) {
            this.f37824a = context;
            this.f37825c = str;
            this.f37826d = str2;
            this.f37827e = str3;
            this.f37828f = i9;
            this.f37829g = str4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f37824a).equals("m3u")) {
                EPG.this.n0(this.f37824a, this.f37825c, this.f37826d);
            } else {
                EPG.this.m0(this.f37824a, this.f37827e, this.f37828f, this.f37826d, this.f37829g);
            }
            EPG.this.f37772l0.dismiss();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EPG.this.f37772l0.dismiss();
        }
    }

    public class g implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f37832a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f37833c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f37834d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f37835e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f37836f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f37837g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f37838h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f37839i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f37840j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Dialog f37841k;

        public g(String str, int i9, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Dialog dialog) {
            this.f37832a = str;
            this.f37833c = i9;
            this.f37834d = str2;
            this.f37835e = str3;
            this.f37836f = str4;
            this.f37837g = str5;
            this.f37838h = str6;
            this.f37839i = str7;
            this.f37840j = str8;
            this.f37841k = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (EPG.this.f37747Y0.booleanValue()) {
                w.y0(EPG.this.getContext(), this.f37832a, this.f37833c, "live", this.f37834d, this.f37835e, this.f37836f, this.f37837g, this.f37838h, this.f37839i, this.f37840j);
            }
            this.f37841k.dismiss();
        }
    }

    public class h implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f37843a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f37844c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f37845d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f37846e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f37847f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f37848g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f37849h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f37850i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f37851j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Dialog f37852k;

        public h(String str, int i9, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Dialog dialog) {
            this.f37843a = str;
            this.f37844c = i9;
            this.f37845d = str2;
            this.f37846e = str3;
            this.f37847f = str4;
            this.f37848g = str5;
            this.f37849h = str6;
            this.f37850i = str7;
            this.f37851j = str8;
            this.f37852k = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (EPG.this.f37747Y0.booleanValue()) {
                w.y0(EPG.this.getContext(), this.f37843a, this.f37844c, "live", this.f37845d, this.f37846e, this.f37847f, this.f37848g, this.f37849h, this.f37850i, this.f37851j);
            }
            this.f37852k.dismiss();
        }
    }

    public class i extends GestureDetector.SimpleOnGestureListener {
        public i() {
        }

        public /* synthetic */ i(EPG epg, a aVar) {
            this();
        }

        public final void c() {
            if (EPG.this.f37729O0 == null || EPG.this.f37739T0 == null) {
                return;
            }
            EPG.this.f37739T0.dismiss();
        }

        public final void d() {
            if (EPG.this.f37729O0 != null) {
                if (EPG.this.f37739T0 == null || !EPG.this.f37739T0.isShowing()) {
                    EPG.this.f37739T0 = new ProgressDialog(EPG.this.f37729O0);
                    EPG.this.f37739T0.setMessage(EPG.this.f37729O0.getResources().getString(j.f13392t5));
                    EPG.this.f37739T0.setCanceledOnTouchOutside(false);
                    EPG.this.f37739T0.setCancelable(false);
                    EPG.this.f37739T0.setProgressStyle(0);
                    EPG.this.f37739T0.show();
                }
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            if (!EPG.this.f37771l.isFinished()) {
                EPG.this.f37771l.forceFinished(true);
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
            EPG.this.f37771l.fling(EPG.this.getScrollX(), EPG.this.getScrollY(), -((int) f9), -((int) f10), 0, EPG.this.f37722L, 0, EPG.this.f37724M);
            EPG.this.l0();
            if (EPG.this.f37771l.getFinalY() == EPG.this.f37724M && EPG.this.f37737S0 == 1) {
                d();
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
            int i9 = (int) f9;
            int i10 = (int) f10;
            int scrollX = EPG.this.getScrollX();
            int scrollY = EPG.this.getScrollY();
            if (scrollX + i9 < 0) {
                i9 = 0 - scrollX;
            }
            if (scrollY + i10 < 0) {
                i10 = 0 - scrollY;
            }
            if (scrollX + i9 > EPG.this.f37722L) {
                i9 = EPG.this.f37722L - scrollX;
            }
            if (scrollY + i10 > EPG.this.f37724M) {
                i10 = EPG.this.f37724M - scrollY;
            }
            EPG.this.scrollBy(i9, i10);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            int iX;
            C7.a aVar;
            D7.b bVarA;
            try {
                int x9 = (int) motionEvent.getX();
                int y9 = (int) motionEvent.getY();
                int scrollX = EPG.this.getScrollX() + x9;
                int scrollY = EPG.this.getScrollY() + y9;
                int iU = EPG.this.U(scrollY);
                if (iU != -1 && EPG.this.f37720K != null) {
                    if (EPG.this.E().contains(scrollX, scrollY)) {
                        EPG.this.f37720K.c();
                    } else if (EPG.this.z().contains(x9, y9)) {
                        EPG.this.f37720K.c();
                        Iterator it = EPG.this.f37740U.c(iU).e().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                bVarA = null;
                                break;
                            }
                            bVarA = (D7.b) it.next();
                            if (bVarA.h(EPG.this.getTimeShiftMilliSeconds())) {
                                break;
                            }
                        }
                        if (bVarA != null) {
                            EPG epg = EPG.this;
                            iX = epg.X(iU, epg.Y((epg.getScrollX() + x9) - EPG.this.D().left));
                            if (iX != -1) {
                                aVar = EPG.this.f37720K;
                                aVar.a(iU, iX, bVarA);
                            }
                        } else {
                            EPG.this.f37720K.b(iU, EPG.this.f37740U.c(iU));
                        }
                    } else if (EPG.this.D().contains(x9, y9)) {
                        EPG epg2 = EPG.this;
                        iX = epg2.X(iU, epg2.Y((epg2.getScrollX() + x9) - EPG.this.D().left));
                        if (iX != -1) {
                            aVar = EPG.this.f37720K;
                            bVarA = EPG.this.f37740U.a(iU, iX);
                            aVar.a(iU, iX, bVarA);
                        }
                    }
                }
            } catch (Exception unused) {
            }
            return true;
        }
    }

    static {
        CookieManager cookieManager = new CookieManager();
        f37697k1 = cookieManager;
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
    }

    public EPG(Context context, AttributeSet attributeSet) {
        String str;
        String str2;
        this(context, attributeSet, 0);
        this.f37774m0 = context;
        this.f37719J0 = new Handler();
        this.f37721K0 = new Handler();
        this.f37741U0 = new C2858a(context);
        this.f37715H0 = context.getSharedPreferences("loginPrefs", 0);
        this.f37753c1 = w.S0(C2937a.a());
        f37698l1 = context.getApplicationContext().getPackageName();
        f37699m1 = T(context);
        this.f37755d1 = w.S0(C2940d.d());
        Locale locale = Locale.US;
        this.f37751b1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f37750a1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f37748Z0 = new Date();
        SimpleDateFormat simpleDateFormat = this.f37751b1;
        if (J(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(context))), this.f37750a1.format(this.f37748Z0)) < C2939c.p() || (str = this.f37753c1) == null || this.f37755d1 == null) {
            return;
        }
        if (f37699m1.equals(str) && (this.f37753c1 == null || (str2 = this.f37755d1) == null || f37698l1.equals(str2))) {
            return;
        }
        this.f37747Y0 = Boolean.FALSE;
    }

    public EPG(Context context, AttributeSet attributeSet, int i9) {
        String str;
        String str2;
        super(context, attributeSet, i9);
        this.f37754d = getClass().getSimpleName();
        this.f37738T = 200000L;
        a aVar = null;
        this.f37740U = null;
        this.f37742V = null;
        this.f37744W = null;
        this.f37757e0 = null;
        this.f37782q0 = "";
        this.f37786s0 = -1;
        this.f37788t0 = 0;
        this.f37790u0 = 1;
        this.f37792v0 = 2;
        this.f37794w0 = 3;
        this.f37796x0 = 4;
        this.f37798y0 = 5;
        this.f37800z0 = 0;
        this.f37701A0 = false;
        this.f37707D0 = 5000L;
        this.f37711F0 = 0;
        this.f37713G0 = 5;
        this.f37717I0 = false;
        this.f37725M0 = 3;
        Boolean bool = Boolean.FALSE;
        this.f37731P0 = bool;
        this.f37733Q0 = 0;
        this.f37735R0 = false;
        this.f37745W0 = false;
        this.f37746X0 = false;
        this.f37747Y0 = Boolean.TRUE;
        this.f37774m0 = context;
        this.f37719J0 = new Handler();
        this.f37721K0 = new Handler();
        this.f37741U0 = new C2858a(context);
        this.f37715H0 = context.getSharedPreferences("loginPrefs", 0);
        setWillNotDraw(false);
        o0();
        this.f37775n = getResources().getDimensionPixelSize(a7.d.f11877b);
        this.f37785s = getResources().getDimensionPixelSize(a7.d.f11880e);
        this.f37783r = getResources().getDimensionPixelSize(a7.d.f11881f);
        this.f37706D = getResources().getDimensionPixelSize(a7.d.f11887l);
        if (this.f37741U0.A().equals(AbstractC2237a.f44453K0)) {
            f37694h1 = 14400000;
            this.f37785s += 125;
            this.f37783r += 95;
        }
        this.f37765i = new Rect();
        this.f37763h = new Rect();
        this.f37767j = new Rect();
        this.f37769k = new Paint(1);
        this.f37773m = new GestureDetector(context, new i(this, aVar));
        this.f37716I = I.f();
        this.f37718J = I.f();
        this.f37771l = new Scroller(context);
        this.f37714H = getResources().getColor(a7.c.f11862m);
        this.f37777o = getResources().getDimensionPixelSize(a7.d.f11879d);
        this.f37779p = getResources().getDimensionPixelSize(a7.d.f11876a);
        this.f37781q = getResources().getDimensionPixelSize(a7.d.f11878c);
        this.f37787t = getResources().getColor(a7.c.f11864o);
        this.f37789u = getResources().getColor(a7.c.f11864o);
        this.f37791v = getResources().getColor(a7.c.f11863n);
        this.f37793w = getResources().getColor(a7.c.f11867r);
        this.f37795x = getResources().getColor(a7.c.f11864o);
        this.f37797y = getResources().getColor(a7.c.f11865p);
        this.f37799z = getResources().getDimensionPixelSize(a7.d.f11882g);
        this.f37704C = getResources().getDimensionPixelSize(a7.d.f11885j);
        this.f37700A = getResources().getDimensionPixelSize(a7.d.f11886k);
        this.f37702B = getResources().getColor(a7.c.f11867r);
        int dimensionPixelSize = getResources().getDimensionPixelSize(a7.d.f11884i);
        this.f37708E = dimensionPixelSize;
        this.f37710F = getResources().getDimensionPixelSize(a7.d.f11883h);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.outWidth = dimensionPixelSize;
        options.outHeight = dimensionPixelSize;
        this.f37712G = BitmapFactory.decodeResource(getResources(), a7.e.f12068v1, options);
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.outWidth = dimensionPixelSize;
        options2.outHeight = dimensionPixelSize;
        this.f37753c1 = w.S0(C2937a.a());
        f37698l1 = context.getApplicationContext().getPackageName();
        f37699m1 = T(context);
        this.f37755d1 = w.S0(C2940d.d());
        Locale locale = Locale.US;
        this.f37751b1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f37750a1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f37748Z0 = new Date();
        SimpleDateFormat simpleDateFormat = this.f37751b1;
        if (J(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(context))), this.f37750a1.format(this.f37748Z0)) < C2939c.p() || (str = this.f37753c1) == null || this.f37755d1 == null) {
            return;
        }
        if (f37699m1.equals(str) && (this.f37753c1 == null || (str2 = this.f37755d1) == null || f37698l1.equals(str2))) {
            return;
        }
        this.f37747Y0 = bool;
    }

    public static long J(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0L;
        }
    }

    public static String T(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    private int getChannelAreaWidth() {
        return this.f37785s + this.f37777o + this.f37775n;
    }

    private D7.a getFirstChannelData() {
        return this.f37742V;
    }

    private D7.a getFirstLastChannelData() {
        return this.f37744W;
    }

    private int getFirstVisibleChannelPosition() {
        int scrollY = getScrollY();
        int i9 = this.f37775n;
        int i10 = ((scrollY - i9) - this.f37704C) / (this.f37779p + i9);
        if (i10 < 0) {
            return 0;
        }
        return i10;
    }

    private int getLastVisibleChannelPosition() {
        int scrollY = getScrollY();
        int iF = this.f37740U.f();
        int height = scrollY + getHeight();
        int i9 = this.f37704C + height;
        int i10 = this.f37775n;
        int i11 = this.f37779p;
        int i12 = (i9 - i10) / (i10 + i11);
        int i13 = iF - 1;
        if (i12 > i13) {
            i12 = i13;
        }
        return (height <= i11 * i12 || i12 >= i13) ? i12 : i12 + 1;
    }

    private int getProgramAreaWidth() {
        return getWidth() - getChannelAreaWidth();
    }

    private int getXPositionStart() {
        return a0((System.currentTimeMillis() + ((long) getTimeShiftMilliSeconds())) - ((long) (f37694h1 / 2)));
    }

    public final void A() {
        int i9;
        SharedPreferences sharedPreferences = this.f37774m0.getSharedPreferences("auto_start", 0);
        this.f37736S = sharedPreferences;
        boolean z9 = sharedPreferences.getBoolean("full_epg", false);
        this.f37734R = z9;
        if (z9) {
            i9 = DateTimeConstants.MILLIS_PER_DAY;
            f37693g1 = DateTimeConstants.MILLIS_PER_DAY;
        } else {
            f37693g1 = 14400000;
            i9 = DateTimeConstants.MILLIS_PER_HOUR;
        }
        f37692f1 = i9;
        this.f37722L = (int) (((long) ((f37692f1 + f37693g1) - f37694h1)) / this.f37726N);
    }

    public final void B() {
        int iZ = Z(this.f37740U.f() - 1) + this.f37779p;
        this.f37724M = iZ < getHeight() ? 0 : iZ - getHeight();
    }

    public final long C() {
        return f37694h1 / ((getResources().getDisplayMetrics().widthPixels - this.f37785s) - this.f37775n);
    }

    public final Rect D() {
        this.f37767j.top = this.f37704C;
        int iF = this.f37740U.f() * (this.f37779p + this.f37775n);
        Rect rect = this.f37767j;
        if (iF >= getHeight()) {
            iF = getHeight();
        }
        rect.bottom = iF;
        Rect rect2 = this.f37767j;
        rect2.left = this.f37785s;
        rect2.right = getWidth();
        return this.f37767j;
    }

    public final Rect E() {
        this.f37767j.left = ((getScrollX() + getWidth()) - this.f37708E) - this.f37710F;
        Rect rect = this.f37767j;
        int scrollY = getScrollY() + getHeight();
        int i9 = this.f37708E;
        rect.top = (scrollY - i9) - this.f37710F;
        Rect rect2 = this.f37767j;
        rect2.right = rect2.left + i9;
        rect2.bottom = rect2.top + i9;
        return rect2;
    }

    public final long F() {
        SharedPreferences sharedPreferences = this.f37774m0.getSharedPreferences("auto_start", 0);
        this.f37736S = sharedPreferences;
        boolean z9 = sharedPreferences.getBoolean("full_epg", false);
        this.f37734R = z9;
        f37692f1 = z9 ? DateTimeConstants.MILLIS_PER_DAY : DateTimeConstants.MILLIS_PER_HOUR;
        return LocalDateTime.now().toDateTime().minusMillis(f37692f1).getMillis();
    }

    public final void G(int i9, long j9) {
        int i10 = i9 - 1;
        if (i10 < 0) {
            super.requestFocus();
            return;
        }
        D7.b bVarW = W(i10, j9);
        if (bVarW == null) {
            G(i10, j9);
            return;
        }
        this.f37757e0.f1513i = false;
        this.f37757e0 = bVarW;
        bVarW.f1513i = true;
    }

    public void H() {
        this.f37716I.clear();
    }

    public void I() {
        if (this.f37741U0.x() == 3) {
            return;
        }
        try {
            NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG = this.f37727N0;
            if (nSTIJKPlayerSmallEPG != null) {
                if (nSTIJKPlayerSmallEPG.T()) {
                    this.f37727N0.M();
                } else {
                    this.f37727N0.h0();
                    this.f37727N0.W(true);
                    this.f37727N0.g0();
                }
                IjkMediaPlayer.native_profileEnd();
            }
        } catch (Exception unused) {
        }
    }

    public final void K(Canvas canvas, int i9, Rect rect) {
        Rect rect2;
        Paint paint;
        int i10;
        try {
            rect.left = getScrollX();
            int iZ = Z(i9);
            rect.top = iZ;
            rect.right = rect.left + this.f37781q;
            rect.bottom = iZ + this.f37779p;
            String strF = this.f37740U.c(i9).f();
            String strG = this.f37740U.c(i9).g();
            if (i9 == this.f37733Q0) {
                this.f37769k.setColor(this.f37797y);
                int scrollX = getScrollX();
                int i11 = rect.top;
                rect2 = new Rect(scrollX, i11, rect.left + this.f37785s, this.f37779p + i11);
                paint = new Paint();
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                i10 = this.f37793w;
            } else {
                this.f37769k.setColor(this.f37797y);
                int i12 = rect.left;
                int i13 = rect.top;
                rect2 = new Rect(i12, i13, this.f37785s + i12, this.f37779p + i13);
                paint = new Paint();
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                i10 = this.f37787t;
            }
            paint.setColor(i10);
            canvas.drawRect(rect2, paint);
            if (this.f37716I.containsKey(strF)) {
                Bitmap bitmap = (Bitmap) this.f37716I.get(strF);
                rect = V(rect, bitmap);
                canvas.drawBitmap(bitmap, (Rect) null, rect, (Paint) null);
            } else {
                int iMin = Math.min(this.f37779p, this.f37785s);
                if (!this.f37718J.containsKey(strF)) {
                    this.f37718J.put(strF, new a(strF));
                    E7.b.d(getContext(), strF, iMin, iMin, (C) this.f37718J.get(strF));
                }
            }
            this.f37769k.setColor(this.f37797y);
            int length = strG.length();
            String strSubstring = strG.substring(0, this.f37769k.breakText(strG, true, this.f37783r, null));
            canvas.drawText(strSubstring + (strSubstring.length() < length ? ".." : ""), rect.right + 10, rect.centerY() + 10, this.f37769k);
        } catch (Exception unused) {
        }
    }

    public final void L(Canvas canvas, Rect rect) {
        int lastVisibleChannelPosition = getLastVisibleChannelPosition();
        for (int firstVisibleChannelPosition = getFirstVisibleChannelPosition(); firstVisibleChannelPosition <= lastVisibleChannelPosition; firstVisibleChannelPosition++) {
            K(canvas, firstVisibleChannelPosition, rect);
        }
    }

    public final void M(Canvas canvas, int i9, D7.b bVar, Rect rect) {
        Paint paint;
        int i10;
        Paint paint2;
        int i11;
        s0(i9, bVar.f(), bVar.c(), rect);
        String strG = bVar.g();
        if (bVar.i()) {
            this.f37769k.setColor(this.f37793w);
            this.f37733Q0 = i9;
        } else {
            if (bVar.h(getTimeShiftMilliSeconds())) {
                paint = this.f37769k;
                i10 = this.f37791v;
            } else if (strG == null || strG.isEmpty() || !strG.equals(getContext().getResources().getString(j.f13351p4))) {
                paint = this.f37769k;
                i10 = this.f37789u;
            } else {
                paint = this.f37769k;
                i10 = this.f37795x;
            }
            paint.setColor(i10);
        }
        canvas.drawRect(rect, this.f37769k);
        int i12 = rect.left;
        int i13 = this.f37777o;
        rect.left = i12 + i13 + 16;
        rect.right -= i13;
        this.f37769k.setColor(this.f37797y);
        if (this.f37741U0.A().equals(AbstractC2237a.f44453K0)) {
            paint2 = this.f37769k;
            i11 = this.f37799z + 6;
        } else {
            paint2 = this.f37769k;
            i11 = this.f37799z;
        }
        paint2.setTextSize(i11);
        this.f37769k.getTextBounds(bVar.g(), 0, bVar.g().length(), this.f37767j);
        int i14 = rect.top;
        rect.top = i14 + ((rect.bottom - i14) / 2) + (this.f37767j.height() / 2);
        canvas.drawText(strG.substring(0, this.f37769k.breakText(strG, true, rect.right - rect.left, null)), rect.left, rect.top, this.f37769k);
    }

    public final void N(Canvas canvas, Rect rect) {
        int lastVisibleChannelPosition = getLastVisibleChannelPosition();
        for (int firstVisibleChannelPosition = getFirstVisibleChannelPosition(); firstVisibleChannelPosition <= lastVisibleChannelPosition; firstVisibleChannelPosition++) {
            this.f37763h.left = getScrollX() + this.f37785s + this.f37775n;
            this.f37763h.top = Z(firstVisibleChannelPosition);
            this.f37763h.right = getScrollX() + getWidth();
            Rect rect2 = this.f37763h;
            rect2.bottom = rect2.top + this.f37779p;
            canvas.save();
            canvas.clipRect(this.f37763h);
            boolean z9 = false;
            for (D7.b bVar : this.f37740U.d(firstVisibleChannelPosition)) {
                if (!e0(bVar.f(), bVar.c())) {
                    if (z9) {
                        break;
                    }
                } else {
                    M(canvas, firstVisibleChannelPosition, bVar, rect);
                    z9 = true;
                }
            }
            canvas.restore();
        }
    }

    public final void O(Canvas canvas, Rect rect) {
        if (Math.abs(getXPositionStart() - getScrollX()) > getWidth() / 3) {
            Rect rectE = E();
            this.f37769k.setColor(this.f37702B);
            int i9 = rectE.right;
            int i10 = this.f37708E;
            canvas.drawCircle(i9 - (i10 / 2), rectE.bottom - (i10 / 2), Math.min(rectE.width(), rectE.height()) / 2, this.f37769k);
            int i11 = rectE.left;
            int i12 = this.f37710F;
            rectE.left = i11 + i12;
            rectE.right -= i12;
            rectE.top += i12;
            rectE.bottom -= i12;
            canvas.drawBitmap(this.f37712G, (Rect) null, rectE, this.f37769k);
        }
    }

    public final void P(Canvas canvas, Rect rect) {
        long jCurrentTimeMillis = System.currentTimeMillis() + ((long) getTimeShiftMilliSeconds());
        if (t0(jCurrentTimeMillis)) {
            rect.left = a0(jCurrentTimeMillis);
            int scrollY = getScrollY();
            rect.top = scrollY;
            rect.right = rect.left + this.f37700A;
            rect.bottom = scrollY + getHeight();
            this.f37769k.setColor(this.f37702B);
            canvas.drawRect(rect, this.f37769k);
            if (this.f37735R0) {
                return;
            }
            this.f37735R0 = true;
            scrollTo(this.f37741U0.A().equals(AbstractC2237a.f44453K0) ? ((a0(jCurrentTimeMillis) - this.f37785s) + this.f37775n) - 200 : ((a0(jCurrentTimeMillis) - this.f37785s) + this.f37775n) - 100, 0);
        }
    }

    public final void Q(Canvas canvas, Rect rect) {
        rect.left = getScrollX() + this.f37785s + this.f37775n;
        rect.top = getScrollY();
        rect.right = rect.left + getWidth();
        rect.bottom = rect.top + this.f37704C;
        this.f37763h.left = getScrollX() + this.f37785s + this.f37775n;
        this.f37763h.top = getScrollY();
        this.f37763h.right = getScrollX() + getWidth();
        Rect rect2 = this.f37763h;
        rect2.bottom = rect2.top + this.f37704C;
        canvas.save();
        canvas.clipRect(this.f37763h);
        this.f37769k.setColor(this.f37787t);
        canvas.drawRect(rect, this.f37769k);
        this.f37769k.setColor(this.f37797y);
        this.f37769k.setTextSize(this.f37706D);
        for (int i9 = 0; i9 < f37694h1 / 1800000; i9++) {
            long j9 = (((this.f37730P + ((long) (1800000 * i9))) + 900000) / 1800000) * 1800000;
            String strB = E7.b.b(this.f37774m0, j9);
            float fA0 = a0(j9);
            int i10 = rect.top;
            canvas.drawText(strB, fA0, i10 + ((rect.bottom - i10) / 2) + (this.f37706D / 2), this.f37769k);
        }
        canvas.restore();
        S(canvas, rect);
        R(canvas, rect);
    }

    public final void R(Canvas canvas, Rect rect) {
        rect.left = getScrollX();
        rect.top = getScrollY() + this.f37704C;
        rect.right = rect.left + getWidth();
        rect.bottom = rect.top + this.f37775n;
        this.f37769k.setColor(this.f37714H);
        canvas.drawRect(rect, this.f37769k);
    }

    public final void S(Canvas canvas, Rect rect) {
        rect.left = getScrollX();
        int scrollY = getScrollY();
        rect.top = scrollY;
        rect.right = rect.left + this.f37785s;
        rect.bottom = scrollY + this.f37704C;
        this.f37769k.setColor(this.f37787t);
        this.f37769k.setTextAlign(Paint.Align.CENTER);
        canvas.drawRect(rect, this.f37769k);
        this.f37769k.setColor(this.f37797y);
        this.f37769k.setTextSize(this.f37706D);
        String strA = E7.b.a(this.f37730P);
        int i9 = rect.left;
        float f9 = i9 + ((rect.right - i9) / 2);
        int i10 = rect.top;
        canvas.drawText(strA, f9, i10 + ((rect.bottom - i10) / 2) + (this.f37706D / 2), this.f37769k);
        this.f37769k.setTextAlign(Paint.Align.LEFT);
    }

    public final int U(int i9) {
        int i10 = i9 - this.f37704C;
        int i11 = this.f37775n;
        int i12 = (i10 + i11) / (this.f37779p + i11);
        if (this.f37740U.f() == 0) {
            return -1;
        }
        return i12;
    }

    public final Rect V(Rect rect, Bitmap bitmap) {
        int i9 = rect.left;
        int i10 = this.f37777o;
        rect.left = i9 + i10;
        rect.top += i10;
        rect.right -= i10;
        rect.bottom -= i10;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f9 = height / width;
        int i11 = rect.right;
        int i12 = rect.left;
        int i13 = i11 - i12;
        int i14 = rect.bottom;
        int i15 = rect.top;
        int i16 = i14 - i15;
        if (width > height) {
            int i17 = ((int) (i16 - (i13 * f9))) / 2;
            rect.top = i15 + i17;
            rect.bottom = i14 - i17;
        } else if (width <= height) {
            int i18 = ((int) (i13 - (i16 / f9))) / 2;
            rect.left = i12 + i18;
            rect.right = i11 - i18;
        }
        return rect;
    }

    public final D7.b W(int i9, long j9) {
        List listD = this.f37740U.d(i9);
        if (listD == null) {
            return null;
        }
        for (int i10 = 0; i10 < listD.size(); i10++) {
            D7.b bVar = (D7.b) listD.get(i10);
            if (bVar.f() <= j9 && bVar.c() >= j9) {
                return bVar;
            }
        }
        return null;
    }

    public final int X(int i9, long j9) {
        List listD = this.f37740U.d(i9);
        if (listD == null) {
            return -1;
        }
        for (int i10 = 0; i10 < listD.size(); i10++) {
            D7.b bVar = (D7.b) listD.get(i10);
            if (bVar.f() <= j9 && bVar.c() >= j9) {
                return i10;
            }
        }
        return -1;
    }

    public final long Y(int i9) {
        return (((long) i9) * this.f37726N) + this.f37728O;
    }

    public final int Z(int i9) {
        int i10 = this.f37779p;
        int i11 = this.f37775n;
        return (i9 * (i10 + i11)) + i11 + this.f37704C;
    }

    public void a(Context context, String str, int i9, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        try {
            this.f37749a = new DatabaseHandler(context);
            this.f37752c = new LiveStreamDBHandler(context);
            View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(a7.g.f12617C2, (RelativeLayout) findViewById(a7.f.ke));
            PopupWindow popupWindow = new PopupWindow(context);
            this.f37772l0 = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.f37772l0.setWidth(-1);
            this.f37772l0.setHeight(-1);
            this.f37772l0.setFocusable(true);
            this.f37772l0.setBackgroundDrawable(new BitmapDrawable());
            this.f37772l0.showAtLocation(viewInflate, 17, 0, 0);
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(a7.f.o9);
            RelativeLayout relativeLayout2 = (RelativeLayout) viewInflate.findViewById(a7.f.f12245P8);
            RelativeLayout relativeLayout3 = (RelativeLayout) viewInflate.findViewById(a7.f.f12255Q8);
            RelativeLayout relativeLayout4 = (RelativeLayout) viewInflate.findViewById(a7.f.f12094A7);
            if (SharepreferenceDBHandler.getCurrentAPPType(context).equals("m3u")) {
                ArrayList<FavouriteM3UModel> arrayListCheckFavourite = this.f37752c.checkFavourite(str7, SharepreferenceDBHandler.getUserID(context));
                if (arrayListCheckFavourite == null || arrayListCheckFavourite.size() <= 0) {
                    relativeLayout2.setVisibility(0);
                } else {
                    relativeLayout3.setVisibility(0);
                }
            } else {
                ArrayList<FavouriteDBModel> arrayListCheckFavourite2 = this.f37749a.checkFavourite(i9, str8, "live", SharepreferenceDBHandler.getUserID(context), str9);
                if (arrayListCheckFavourite2 != null && arrayListCheckFavourite2.size() > 0) {
                    relativeLayout3.setVisibility(0);
                }
                relativeLayout2.setVisibility(0);
            }
            try {
                relativeLayout.setOnClickListener(new c(context, str, i9, str2, str3, str4, str5, str6, str7, str9));
                relativeLayout2.setOnClickListener(new d(context, str8, str7, str3, i9, str2, str9));
                relativeLayout3.setOnClickListener(new e(context, str7, str3, str8, i9, str9));
                try {
                    relativeLayout4.setOnClickListener(new f());
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
            }
        } catch (Exception unused3) {
        }
    }

    public final int a0(long j9) {
        int i9 = (int) ((j9 - this.f37728O) / this.f37726N);
        int i10 = this.f37775n;
        return i9 + i10 + this.f37785s + i10;
    }

    public final void b0(D7.b bVar) {
    }

    public final void c0(D7.b bVar) {
    }

    public void d0() {
        new i(this, null).c();
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    public final boolean e0(long j9, long j10) {
        long j11 = this.f37730P;
        return (j9 >= j11 && j9 <= this.f37732Q) || (j10 >= j11 && j10 <= this.f37732Q) || (j9 <= j11 && j10 >= this.f37732Q);
    }

    public final void f0(Context context, String str, int i9, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        int i10;
        if (Listsingleton.b().a() == null || Listsingleton.b().a().size() <= 0) {
            if (this.f37747Y0.booleanValue()) {
                w.y0(getContext(), str, i9, "live", str3, str4, str5, str6, str7, str8, str9);
                return;
            }
            return;
        }
        List listA = Listsingleton.b().a();
        Dialog dialog = new Dialog(context, k.f13462g);
        dialog.requestWindowFeature(1);
        dialog.setContentView(a7.g.f12682N1);
        dialog.getWindow().setBackgroundDrawable(null);
        dialog.getWindow().setLayout(-1, -2);
        dialog.setCancelable(false);
        ImageView imageView = (ImageView) dialog.findViewById(a7.f.f12201L4);
        ImageView imageView2 = (ImageView) dialog.findViewById(a7.f.f12308W4);
        this.f37758e1 = (LinearLayout) dialog.findViewById(a7.f.f12114C7);
        imageView2.setOnClickListener(new g(str, i9, str3, str4, str5, str6, str7, str8, str9, dialog));
        this.f37758e1.setOnClickListener(new h(str, i9, str3, str4, str5, str6, str7, str8, str9, dialog));
        imageView2.setOnFocusChangeListener(new w.k(imageView2, context));
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
                        t.q(this.f37774m0).l((String) listA.get(AbstractC2237a.f44516k1)).g(imageView);
                        i10 = AbstractC2237a.f44516k1;
                    } else {
                        t.q(this.f37774m0).l((String) listA.get(0)).g(imageView);
                        i10 = AbstractC2237a.f44516k1;
                    }
                    AbstractC2237a.f44516k1 = i10 + 1;
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        dialog.show();
        imageView2.requestFocus();
        dialog.getWindow().setBackgroundDrawableResource(a7.c.f11875z);
    }

    public final void g0(D7.b bVar) {
        SharedPreferences sharedPreferences = this.f37774m0.getSharedPreferences("timeFormat", 0);
        this.f37761g = sharedPreferences;
        String string = sharedPreferences.getString("timeFormat", AbstractC2237a.f44441E0);
        Locale locale = Locale.US;
        this.f37756e = new SimpleDateFormat(string, locale);
        this.f37759f = new SimpleDateFormat(string, locale);
        this.f37760f0.setText(bVar.g());
        this.f37764h0.setText(this.f37756e.format(Long.valueOf(bVar.f())) + " - " + this.f37759f.format(Long.valueOf(bVar.c())));
        this.f37762g0.setText(bVar.b());
        j0(bVar);
    }

    public String getExtensionType() {
        return this.f37784r0;
    }

    public int getOpenedStreamID() {
        return this.f37778o0;
    }

    public String getOpenedVideoUrl() {
        return this.f37782q0;
    }

    public D7.b getSelectedEvent() {
        return this.f37757e0;
    }

    public int getTimeShiftMilliSeconds() {
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("loginPrefs", 0);
        this.f37770k0 = sharedPreferences;
        return w.J(sharedPreferences.getString("selectedEPGShift", AbstractC2237a.f44437C0));
    }

    public String getVideoPathUrl() {
        return this.f37709E0;
    }

    public final C7.b h0(C7.b bVar, C7.b bVar2) {
        if (bVar == null) {
            try {
                bVar = new E7.a(I.h());
            } catch (Throwable th) {
                throw new RuntimeException("Could not merge EPG data: " + th.getClass().getSimpleName() + " " + th.getMessage(), th);
            }
        }
        if (bVar2 != null) {
            for (int i9 = 0; i9 < bVar2.f(); i9++) {
                D7.a aVarC = bVar2.c(i9);
                D7.a aVarE = bVar.e(aVarC.g(), aVarC.f(), aVarC.l(), aVarC.i(), aVarC.d(), aVarC.b(), aVarC.m());
                for (int i10 = 0; i10 < aVarC.e().size(); i10++) {
                    aVarE.a((D7.b) aVarC.e().get(i10));
                }
            }
        }
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e9 A[PHI: r13 r14 r15
      0x00e9: PHI (r13v6 android.widget.Scroller) = (r13v0 android.widget.Scroller), (r13v7 android.widget.Scroller) binds: [B:45:0x011e, B:31:0x00e7] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r14v3 int) = (r14v0 int), (r14v4 int) binds: [B:45:0x011e, B:31:0x00e7] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r15v3 int) = (r15v0 int), (r15v4 int) binds: [B:45:0x011e, B:31:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec A[PHI: r13 r14 r15
      0x00ec: PHI (r13v4 android.widget.Scroller) = (r13v0 android.widget.Scroller), (r13v7 android.widget.Scroller) binds: [B:45:0x011e, B:31:0x00e7] A[DONT_GENERATE, DONT_INLINE]
      0x00ec: PHI (r14v1 int) = (r14v0 int), (r14v4 int) binds: [B:45:0x011e, B:31:0x00e7] A[DONT_GENERATE, DONT_INLINE]
      0x00ec: PHI (r15v1 int) = (r15v0 int), (r15v4 int) binds: [B:45:0x011e, B:31:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i0(D7.b r20, boolean r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.utility.epg.EPG.i0(D7.b, boolean, java.lang.String):void");
    }

    public final void j0(D7.b bVar) {
        int i9;
        NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG;
        NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG2;
        try {
            if (bVar.a() == null || bVar.a().m() == null || bVar.a().m().equals("")) {
                if (bVar.a() == null || bVar.a().l() == null) {
                    return;
                }
                try {
                    i9 = Integer.parseInt(bVar.a().l());
                } catch (NumberFormatException unused) {
                    i9 = -1;
                }
                String strL = bVar.a().l();
                if (getOpenedStreamID() != 0) {
                    return;
                }
                I();
                if (SharepreferenceDBHandler.getCurrentAPPType(getContext()).equals("onestream_api")) {
                    setOpenedStreamIDOneStream(strL);
                } else {
                    setOpenedStreamID(i9);
                }
                if (this.f37741U0.x() == 3 || this.f37727N0 == null) {
                    return;
                }
                if (SharepreferenceDBHandler.getCurrentAPPType(getContext()).equals("onestream_api")) {
                    this.f37727N0.b0(Uri.parse(getVideoPathUrl() + strL + getExtensionType()), true, "");
                } else {
                    this.f37727N0.b0(Uri.parse(getVideoPathUrl() + i9 + getExtensionType()), true, "");
                }
                nSTIJKPlayerSmallEPG = this.f37727N0;
                nSTIJKPlayerSmallEPG.f37397J = 0;
            } else {
                if (getOpenedVideoUrl() == null || !getOpenedVideoUrl().equals("")) {
                    return;
                }
                I();
                setOpenedVideoUrl(bVar.a().m());
                if (this.f37741U0.x() == 3 || (nSTIJKPlayerSmallEPG2 = this.f37727N0) == null) {
                    return;
                }
                nSTIJKPlayerSmallEPG2.b0(Uri.parse(bVar.a().m()), true, "");
                nSTIJKPlayerSmallEPG = this.f37727N0;
                nSTIJKPlayerSmallEPG.f37397J = 0;
            }
            nSTIJKPlayerSmallEPG.f37401L = false;
            nSTIJKPlayerSmallEPG.start();
        } catch (Exception unused2) {
        }
    }

    public void k0(D7.b bVar, boolean z9, RelativeLayout relativeLayout, EPG epg) {
        C7.b bVar2 = this.f37740U;
        if (bVar2 == null || !bVar2.b()) {
            return;
        }
        o0();
        B();
        A();
        Boolean bool = Boolean.FALSE;
        if (!this.f37731P0.booleanValue()) {
            if (bVar != null) {
                this.f37731P0 = Boolean.TRUE;
            } else {
                int i9 = 0;
                if (X(0, Y(getXPositionStart() + (getWidth() / 2))) != -1) {
                    bool = Boolean.TRUE;
                    this.f37731P0 = bool;
                    bVar = this.f37740U.a(0, X(0, System.currentTimeMillis() + ((long) getTimeShiftMilliSeconds())));
                } else if (this.f37740U != null) {
                    while (true) {
                        if (i9 >= this.f37740U.f()) {
                            break;
                        }
                        List listE = this.f37740U.c(i9).e();
                        if (listE == null || listE.size() == 0) {
                            i9++;
                        } else {
                            bool = Boolean.TRUE;
                            int iC = this.f37740U.c(i9).c();
                            int iX = X(iC, Y(getXPositionStart() + (getWidth() / 2)));
                            if (iX != -1) {
                                this.f37731P0 = bool;
                                bVar = this.f37740U.a(iC, iX);
                            }
                        }
                    }
                }
            }
            q0(bVar, z9);
        }
        if (bool.equals(Boolean.TRUE) && relativeLayout != null) {
            relativeLayout.setFocusable(true);
            relativeLayout.setNextFocusDownId(a7.f.f12269S2);
        }
        l0();
    }

    public void l0() {
        invalidate();
        requestLayout();
    }

    public final void m0(Context context, String str, int i9, String str2, String str3) {
        DatabaseHandler databaseHandler;
        if (context == null || (databaseHandler = this.f37749a) == null) {
            return;
        }
        databaseHandler.deleteFavourite(i9, str, "live", str2, SharepreferenceDBHandler.getUserID(context), str3);
        w.P0(context, str2 + context.getResources().getString(j.f13223c6));
    }

    public final void n0(Context context, String str, String str2) {
        LiveStreamDBHandler liveStreamDBHandler;
        if (context == null || (liveStreamDBHandler = this.f37752c) == null) {
            return;
        }
        liveStreamDBHandler.deleteFavourite(str, SharepreferenceDBHandler.getUserID(context));
        w.P0(context, str2 + context.getResources().getString(j.f13223c6));
    }

    public final void o0() {
        this.f37726N = C();
        this.f37728O = F();
        this.f37730P = Y(getWidth());
        this.f37732Q = Y(getWidth());
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        C7.b bVar = this.f37740U;
        if (bVar == null || !bVar.b()) {
            return;
        }
        this.f37730P = Y(getScrollX());
        this.f37732Q = Y(getScrollX() + getWidth());
        Rect rect = this.f37765i;
        rect.left = getScrollX();
        rect.top = getScrollY();
        rect.right = rect.left + getWidth();
        rect.bottom = rect.top + getHeight();
        N(canvas, rect);
        L(canvas, rect);
        Q(canvas, rect);
        P(canvas, rect);
        String strA = this.f37741U0.A();
        if (!strA.equals(AbstractC2237a.f44453K0)) {
            O(canvas, rect);
        }
        if (this.f37771l.computeScrollOffset()) {
            scrollTo(this.f37771l.getCurrX(), this.f37771l.getCurrY());
            if (this.f37735R0) {
                return;
            }
            this.f37735R0 = true;
            long jCurrentTimeMillis = System.currentTimeMillis() + ((long) getTimeShiftMilliSeconds());
            scrollTo(strA.equals(AbstractC2237a.f44453K0) ? ((a0(jCurrentTimeMillis) - this.f37785s) + this.f37775n) - 200 : ((a0(jCurrentTimeMillis) - this.f37785s) + this.f37775n) - 100, 0);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        String str;
        int i10;
        D7.b bVarW;
        this.f37730P = Y(getScrollX());
        this.f37732Q = Y(getScrollX() + getWidth());
        if (keyEvent.getKeyCode() != 4 && this.f37757e0 != null) {
            String str2 = "horizontal";
            if (keyEvent.getKeyCode() == 22) {
                if (this.f37757e0.d() != null) {
                    D7.b bVar = this.f37757e0;
                    bVar.f1513i = false;
                    bVarW = bVar.d();
                    this.f37757e0 = bVarW;
                    bVarW.f1513i = true;
                    i0(bVarW, true, str2);
                }
            } else if (keyEvent.getKeyCode() != 21) {
                str2 = "vertical";
                if (keyEvent.getKeyCode() == 19) {
                    if (this.f37757e0.a().k() == null || this.f37757e0.a().k().c() == this.f37744W.c()) {
                        super.requestFocus();
                        super.requestFocusFromTouch();
                    } else {
                        long jMax = (Math.max(this.f37730P, this.f37757e0.f()) + Math.min(this.f37732Q, this.f37757e0.c())) / 2;
                        D7.b bVarW2 = W(this.f37757e0.a().k().c(), jMax);
                        if (bVarW2 != null) {
                            this.f37757e0.f1513i = false;
                            this.f37757e0 = bVarW2;
                            bVarW2.f1513i = true;
                        } else {
                            G(this.f37757e0.a().k().c(), jMax);
                        }
                        bVarW = this.f37757e0;
                        i0(bVarW, true, str2);
                    }
                } else if (keyEvent.getKeyCode() == 20) {
                    if (this.f37757e0.a().h() != null) {
                        bVarW = W(this.f37757e0.a().h().c(), (Math.max(this.f37730P, this.f37757e0.f()) + Math.min(this.f37732Q, this.f37757e0.c())) / 2);
                        if (bVarW == null) {
                            if (this.f37737S0 == 1) {
                                new i(this, null).d();
                            }
                            return true;
                        }
                        this.f37757e0.f1513i = false;
                        this.f37757e0 = bVarW;
                        bVarW.f1513i = true;
                        i0(bVarW, true, str2);
                    }
                } else if (keyEvent.getKeyCode() == 103 || keyEvent.getKeyCode() == 90) {
                    b0(this.f37757e0);
                } else if (keyEvent.getKeyCode() == 102 || keyEvent.getKeyCode() == 89) {
                    c0(this.f37757e0);
                } else if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 23) {
                    Context context = getContext();
                    getContext();
                    SharedPreferences sharedPreferences = context.getSharedPreferences("selectedPlayer", 0);
                    this.f37768j0 = sharedPreferences;
                    String strL = "";
                    String string = sharedPreferences.getString("selectedPlayer", "");
                    String strJ = this.f37757e0.a().j();
                    String strB = this.f37757e0.a().b();
                    try {
                        strL = this.f37757e0.a().l();
                        i10 = Integer.parseInt(this.f37757e0.a().l());
                        str = strL;
                    } catch (NumberFormatException unused) {
                        str = strL;
                        i10 = -1;
                    }
                    a(getContext(), string, i10, this.f37757e0.a().i(), this.f37757e0.a().g(), this.f37757e0.a().d(), this.f37757e0.a().f(), strJ, this.f37757e0.a().m(), strB, str);
                }
            } else if (this.f37757e0.e() != null) {
                D7.b bVar2 = this.f37757e0;
                bVar2.f1513i = false;
                bVarW = bVar2.e();
                this.f37757e0 = bVarW;
                bVarW.f1513i = true;
                i0(bVarW, true, str2);
            }
            g0(this.f37757e0);
            l0();
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        return super.onKeyUp(i9, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof D7.c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        D7.c cVar = (D7.c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.f37757e0 = cVar.a();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        D7.c cVar = new D7.c(super.onSaveInstanceState());
        cVar.c(this.f37757e0);
        return cVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        k0(this.f37757e0, false, null, null);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f37773m.onTouchEvent(motionEvent);
    }

    public void p0() {
        long jCurrentTimeMillis = System.currentTimeMillis() + ((long) getTimeShiftMilliSeconds());
        boolean zEquals = this.f37741U0.A().equals(AbstractC2237a.f44453K0);
        int iA0 = (a0(jCurrentTimeMillis) - this.f37785s) + this.f37775n;
        scrollTo(zEquals ? iA0 - 200 : iA0 - 100, getScrollY());
    }

    public void q0(D7.b bVar, boolean z9) {
        D7.b bVar2 = this.f37757e0;
        if (bVar2 != null) {
            bVar2.f1513i = false;
        }
        bVar.f1513i = true;
        this.f37757e0 = bVar;
        i0(bVar, z9, "vertical");
        g0(bVar);
        l0();
    }

    public void r0(Activity activity, NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG) {
        this.f37729O0 = activity;
        this.f37727N0 = nSTIJKPlayerSmallEPG;
    }

    public final void s0(int i9, long j9, long j10, Rect rect) {
        rect.left = a0(j9);
        rect.top = Z(i9);
        rect.right = a0(j10) - this.f37775n;
        rect.bottom = rect.top + this.f37779p;
    }

    public void setActivity(Activity activity) {
        this.f37729O0 = activity;
    }

    public void setCurrentEventDescriptionTextView(TextView textView) {
        this.f37762g0 = textView;
    }

    public void setCurrentEventTextView(TextView textView) {
        this.f37760f0 = textView;
    }

    public void setCurrentEventTimeTextView(TextView textView) {
        this.f37764h0 = textView;
    }

    public void setEPGClickListener(C7.a aVar) {
        this.f37720K = aVar;
    }

    public void setEPGData(C7.b bVar) {
        try {
            C7.b bVarH0 = h0(this.f37740U, bVar);
            this.f37740U = bVarH0;
            if (bVarH0 == null || bVarH0.f() <= 0) {
                return;
            }
            this.f37742V = this.f37740U.c(0);
            this.f37744W = this.f37740U.c(r2.f() - 1);
        } catch (Exception unused) {
        }
    }

    public void setExtensionType(String str) {
        this.f37784r0 = str;
    }

    public void setLoader(ProgressBar progressBar) {
        this.f37776n0 = progressBar;
    }

    public void setOpenedStreamID(int i9) {
        this.f37778o0 = i9;
    }

    public void setOpenedStreamIDOneStream(String str) {
        this.f37780p0 = str;
    }

    public void setOpenedVideoUrl(String str) {
        this.f37782q0 = str;
    }

    public void setOrientation(int i9) {
        this.f37766i0 = i9;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        f37695i1 = displayMetrics.widthPixels;
        f37696j1 = displayMetrics.heightPixels;
    }

    public void setVideoPathUrl(String str) {
        this.f37709E0 = str;
    }

    public void setVideoStatus(LinearLayout linearLayout) {
        this.f37703B0 = linearLayout;
    }

    public void setVideoStatusText(TextView textView) {
        this.f37705C0 = textView;
    }

    public void setVideoView(SurfaceView surfaceView) {
        this.f37723L0 = surfaceView;
    }

    public final boolean t0(long j9) {
        return j9 >= this.f37730P && j9 < this.f37732Q;
    }

    public void x(Context context, String str, int i9, String str2, String str3, String str4) {
        if (context == null || this.f37749a == null) {
            return;
        }
        FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
        favouriteDBModel.setCategoryID(str);
        favouriteDBModel.setStreamID(i9);
        favouriteDBModel.setStreamIDOneStream(str4);
        favouriteDBModel.setNum(str3);
        favouriteDBModel.setName(str2);
        favouriteDBModel.setUserID(SharepreferenceDBHandler.getUserID(context));
        this.f37749a.addToFavourite(favouriteDBModel, "live");
        w.P0(context, str2 + context.getResources().getString(j.f13356q));
    }

    public final void y(Context context, String str, String str2, String str3) {
        if (context == null || this.f37752c == null) {
            return;
        }
        FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
        favouriteM3UModel.setUrl(str2);
        favouriteM3UModel.setUserID(SharepreferenceDBHandler.getUserID(context));
        favouriteM3UModel.setName(str3);
        favouriteM3UModel.setCategoryID(str);
        this.f37752c.addToFavourite(favouriteM3UModel);
        w.P0(context, str3 + context.getResources().getString(j.f13356q));
    }

    public final Rect z() {
        this.f37767j.top = this.f37704C;
        int iF = this.f37740U.f() * (this.f37779p + this.f37775n);
        Rect rect = this.f37767j;
        if (iF >= getHeight()) {
            iF = getHeight();
        }
        rect.bottom = iF;
        Rect rect2 = this.f37767j;
        rect2.left = 0;
        rect2.right = this.f37785s;
        return rect2;
    }
}
