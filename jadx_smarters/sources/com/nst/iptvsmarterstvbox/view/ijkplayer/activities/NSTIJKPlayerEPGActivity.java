package com.nst.iptvsmarterstvbox.view.ijkplayer.activities;

import a7.f;
import a7.g;
import a7.j;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.nst.iptvsmarterstvbox.model.FavouriteDBModel;
import com.nst.iptvsmarterstvbox.model.FavouriteM3UModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.PasswordStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.preference.IjkListPreference;
import com.squareup.picasso.t;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import m7.AbstractC2237a;
import m7.w;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.protocol.HttpRequestExecutor;
import org.chromium.net.UrlRequest;
import org.joda.time.LocalDateTime;
import t2.C2766a;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import u7.C2858a;
import w7.AbstractC2941e;
import w7.C2937a;
import w7.C2939c;
import w7.C2940d;
import w7.k;

/* JADX INFO: loaded from: classes4.dex */
public class NSTIJKPlayerEPGActivity extends androidx.appcompat.app.b implements SurfaceHolder.Callback, View.OnClickListener {

    /* JADX INFO: renamed from: A2, reason: collision with root package name */
    public static String f34897A2;

    /* JADX INFO: renamed from: B2, reason: collision with root package name */
    public static boolean f34898B2;

    /* JADX INFO: renamed from: C2, reason: collision with root package name */
    public static ProgressBar f34899C2;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static SharedPreferences f34900x2;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static SharedPreferences f34901y2;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public static String f34902z2;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public TextView f34904A0;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public TextView f34905A1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public RelativeLayout f34906B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public TextView f34907B0;

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public TextView f34908B1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ArrayList f34909C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public Handler f34910C0;

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public TextView f34911C1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ArrayList f34912D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public Handler f34913D0;

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    public FrameLayout f34914D1;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public Handler f34916E0;

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public SeekBar f34917E1;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public Handler f34919F0;

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public SeekBar f34920F1;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public SharedPreferences.Editor f34922G0;

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    public LinearLayout f34923G1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public LiveStreamDBHandler f34924H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public SharedPreferences.Editor f34925H0;

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    public LinearLayout f34926H1;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public SharedPreferences f34927I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public SharedPreferences.Editor f34928I0;

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    public LinearLayout f34929I1;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public SharedPreferences f34930J;

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    public LinearLayout f34932J1;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public SharedPreferences f34933K;

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    public LinearLayout f34935K1;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public SharedPreferences f34936L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public LinearLayout f34937L0;

    /* JADX INFO: renamed from: L1, reason: collision with root package name */
    public LinearLayout f34938L1;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public SharedPreferences f34939M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public TextView f34940M0;

    /* JADX INFO: renamed from: M1, reason: collision with root package name */
    public LinearLayout f34941M1;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public SharedPreferences f34942N;

    /* JADX INFO: renamed from: N1, reason: collision with root package name */
    public LinearLayout f34944N1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public SharedPreferences f34945O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public Boolean f34946O0;

    /* JADX INFO: renamed from: O1, reason: collision with root package name */
    public LinearLayout f34947O1;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public SimpleDateFormat f34948P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public Menu f34949P0;

    /* JADX INFO: renamed from: P1, reason: collision with root package name */
    public LinearLayout f34950P1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public String f34951Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public DateFormat f34952Q0;

    /* JADX INFO: renamed from: Q1, reason: collision with root package name */
    public LinearLayout f34953Q1;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public String f34954R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public String f34955R0;

    /* JADX INFO: renamed from: R1, reason: collision with root package name */
    public LinearLayout f34956R1;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public NSTIJKPlayerEPG f34958S0;

    /* JADX INFO: renamed from: S1, reason: collision with root package name */
    public LinearLayout f34959S1;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public ArrayList f34960T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public String f34961T0;

    /* JADX INFO: renamed from: T1, reason: collision with root package name */
    public LinearLayout f34962T1;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ArrayList f34963U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public Boolean f34964U0;

    /* JADX INFO: renamed from: U1, reason: collision with root package name */
    public LinearLayout f34965U1;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ArrayList f34966V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public String f34967V0;

    /* JADX INFO: renamed from: V1, reason: collision with root package name */
    public RelativeLayout f34968V1;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public ArrayList f34969W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public int f34970W0;

    /* JADX INFO: renamed from: W1, reason: collision with root package name */
    public RelativeLayout f34971W1;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ArrayList f34972X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public String f34973X0;

    /* JADX INFO: renamed from: X1, reason: collision with root package name */
    public ImageView f34974X1;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ArrayList f34975Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public SharedPreferences f34976Y0;

    /* JADX INFO: renamed from: Y1, reason: collision with root package name */
    public ImageView f34977Y1;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ArrayList f34978Z;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public String f34979Z0;

    /* JADX INFO: renamed from: Z1, reason: collision with root package name */
    public ImageView f34980Z1;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public String f34981a1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public ImageView f34982a2;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public String f34983b1;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public ImageView f34984b2;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public Long f34985c1;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public ImageView f34986c2;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public String f34988d1;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public ImageView f34989d2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f34990e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public ArrayList f34991e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public String f34992e1;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public ImageView f34993e2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f34994f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ArrayList f34995f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public Boolean f34996f1;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public ImageView f34997f2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f34998g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ArrayList f34999g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public SharedPreferences f35000g1;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public ImageView f35001g2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f35002h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ArrayList f35003h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public Date f35004h1;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public ImageView f35005h2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f35006i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public Boolean f35008i1;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public Animation f35009i2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f35010j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public ArrayList f35011j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public Boolean f35012j1;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public Animation f35013j2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f35014k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public ArrayList f35015k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public Boolean f35016k1;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public Animation f35017k2;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public ProgressBar f35019l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public Boolean f35020l1;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public Animation f35021l2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LinearLayout f35022m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public TextView f35023m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public Boolean f35024m1;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public Animation f35025m2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f35026n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public TextView f35027n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public Boolean f35028n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public Animation f35029n2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f35030o;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public C2858a f35032o1;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public Animation f35033o2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SeekBar f35034p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public Handler f35036p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public Animation f35037p2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f35038q;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public C2766a f35040q1;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public Animation f35041q2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f35042r;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public SimpleDateFormat f35044r1;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public String f35045r2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f35046s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public String f35047s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public String f35048s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public String f35049s2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f35050t;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public RadioGroup f35052t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public String f35053t2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f35054u;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public RadioGroup f35056u1;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public int f35057u2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinearLayout f35058v;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public RadioGroup f35060v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public Animation f35061v2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ProgressBar f35062w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f35063w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public TextView f35064w1;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public Animation f35065w2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ProgressBar f35066x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public DatabaseHandler f35067x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public TextView f35068x1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public SharedPreferences.Editor f35070y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public TextView f35071y1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public SharedPreferences.Editor f35073z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public TextView f35074z1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f34987d = this;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f35018l = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f35069y = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f35072z = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f34903A = false;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f34915E = true;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f34918F = 2500;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f34921G = true;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f34957S = 0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ArrayList f35007i0 = new ArrayList();

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f35031o0 = true;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f35035p0 = false;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f35039q0 = false;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f35043r0 = false;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f35051t0 = true;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public String f35055u0 = "";

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public String f35059v0 = "";

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public int f34931J0 = 0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public StringBuilder f34934K0 = new StringBuilder();

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public int f34943N0 = -1;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35075a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f35076c;

        public a(String str, String str2) {
            this.f35075a = str;
            this.f35076c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity = NSTIJKPlayerEPGActivity.this;
            nSTIJKPlayerEPGActivity.f34979Z0 = this.f35075a;
            nSTIJKPlayerEPGActivity.f34981a1 = this.f35076c;
            nSTIJKPlayerEPGActivity.f34958S0.setCurrentEpgChannelID(NSTIJKPlayerEPGActivity.this.f34979Z0);
            NSTIJKPlayerEPGActivity.this.f34958S0.setCurrentChannelLogo(NSTIJKPlayerEPGActivity.this.f34981a1);
            NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity2 = NSTIJKPlayerEPGActivity.this;
            nSTIJKPlayerEPGActivity2.k2(nSTIJKPlayerEPGActivity2.f34979Z0, nSTIJKPlayerEPGActivity2.f34981a1);
        }
    }

    public class b implements Runnable {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTIJKPlayerEPGActivity.this.f34940M0.setText("");
                NSTIJKPlayerEPGActivity.this.f34937L0.setVisibility(8);
            }
        }

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerEPGActivity$b$b, reason: collision with other inner class name */
        public class RunnableC0287b implements Runnable {
            public RunnableC0287b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTIJKPlayerEPGActivity.this.f34940M0.setText("");
                NSTIJKPlayerEPGActivity.this.f34937L0.setVisibility(8);
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handler;
            Runnable runnableC0287b;
            boolean zU1;
            NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity = NSTIJKPlayerEPGActivity.this;
            nSTIJKPlayerEPGActivity.f35047s0 = nSTIJKPlayerEPGActivity.f34934K0.toString();
            NSTIJKPlayerEPGActivity.this.f34940M0.setText("");
            NSTIJKPlayerEPGActivity.this.f34937L0.setVisibility(8);
            NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity2 = NSTIJKPlayerEPGActivity.this;
            ArrayList<LiveStreamsDBModel> channelDetails = nSTIJKPlayerEPGActivity2.f34924H.getChannelDetails(nSTIJKPlayerEPGActivity2.f35047s0, "live");
            NSTIJKPlayerEPGActivity.this.f34934K0.setLength(0);
            if (channelDetails == null || channelDetails.size() == 0) {
                NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity3 = NSTIJKPlayerEPGActivity.this;
                nSTIJKPlayerEPGActivity3.f34940M0.setText(nSTIJKPlayerEPGActivity3.f34987d.getResources().getString(j.f13261g4));
                NSTIJKPlayerEPGActivity.this.f34937L0.setVisibility(0);
                handler = new Handler();
                runnableC0287b = new RunnableC0287b();
            } else {
                NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity4 = NSTIJKPlayerEPGActivity.this;
                if (nSTIJKPlayerEPGActivity4.f34924H.getParentalStatusCount(SharepreferenceDBHandler.getUserID(nSTIJKPlayerEPGActivity4.f34987d)) <= 0 || NSTIJKPlayerEPGActivity.this.f35007i0 == null) {
                    zU1 = false;
                } else {
                    NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity5 = NSTIJKPlayerEPGActivity.this;
                    zU1 = nSTIJKPlayerEPGActivity5.U1(channelDetails, nSTIJKPlayerEPGActivity5.f35007i0);
                }
                if (!zU1) {
                    NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity6 = NSTIJKPlayerEPGActivity.this;
                    nSTIJKPlayerEPGActivity6.f35039q0 = true;
                    nSTIJKPlayerEPGActivity6.f35043r0 = true;
                    nSTIJKPlayerEPGActivity6.f35055u0 = "0";
                    String streamId = channelDetails.get(0).getStreamId();
                    String name = channelDetails.get(0).getName();
                    String epgChannelId = channelDetails.get(0).getEpgChannelId();
                    String streamIcon = channelDetails.get(0).getStreamIcon();
                    String url = channelDetails.get(0).getUrl();
                    NSTIJKPlayerEPGActivity.this.f34958S0.setTitle(NSTIJKPlayerEPGActivity.this.f35047s0 + " - " + name);
                    NSTIJKPlayerEPGActivity.this.f34958S0.s1();
                    if (NSTIJKPlayerEPGActivity.this.f34954R.equals("m3u")) {
                        NSTIJKPlayerEPGActivity.this.f34958S0.w1(Uri.parse(url), NSTIJKPlayerEPGActivity.this.f35035p0, name);
                    } else {
                        NSTIJKPlayerEPGActivity.this.f34958S0.w1(Uri.parse(NSTIJKPlayerEPGActivity.this.f34990e + w.q0(streamId) + NSTIJKPlayerEPGActivity.this.f34951Q), NSTIJKPlayerEPGActivity.this.f35035p0, name);
                    }
                    NSTIJKPlayerEPGActivity.this.f34958S0.f36236H = 0;
                    NSTIJKPlayerEPGActivity.this.f34958S0.f36242J = false;
                    NSTIJKPlayerEPGActivity.this.f34958S0.start();
                    NSTIJKPlayerEPGActivity.this.f34916E0.removeCallbacksAndMessages(null);
                    NSTIJKPlayerEPGActivity.this.a2();
                    NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity7 = NSTIJKPlayerEPGActivity.this;
                    nSTIJKPlayerEPGActivity7.f34979Z0 = epgChannelId;
                    nSTIJKPlayerEPGActivity7.f34981a1 = streamIcon;
                    nSTIJKPlayerEPGActivity7.f34958S0.setCurrentEpgChannelID(NSTIJKPlayerEPGActivity.this.f34979Z0);
                    NSTIJKPlayerEPGActivity.this.f34958S0.setCurrentChannelLogo(NSTIJKPlayerEPGActivity.this.f34981a1);
                    NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity8 = NSTIJKPlayerEPGActivity.this;
                    nSTIJKPlayerEPGActivity8.k2(nSTIJKPlayerEPGActivity8.f34979Z0, nSTIJKPlayerEPGActivity8.f34981a1);
                    NSTIJKPlayerEPGActivity.this.f35063w0 = w.q0(streamId);
                    if (NSTIJKPlayerEPGActivity.this.f35070y0 != null) {
                        NSTIJKPlayerEPGActivity.this.f35070y0.putString("currentlyPlayingVideo", streamId);
                        NSTIJKPlayerEPGActivity.this.f35070y0.apply();
                    }
                    channelDetails.clear();
                    return;
                }
                NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity9 = NSTIJKPlayerEPGActivity.this;
                nSTIJKPlayerEPGActivity9.f34940M0.setText(nSTIJKPlayerEPGActivity9.f34987d.getResources().getString(j.f13261g4));
                NSTIJKPlayerEPGActivity.this.f34937L0.setVisibility(0);
                handler = new Handler();
                runnableC0287b = new a();
            }
            handler.postDelayed(runnableC0287b, 1000L);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerEPGActivity.this.X1();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerEPGActivity.this.W1();
        }
    }

    public class e implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f35083a;

        public e(View view) {
            this.f35083a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f35083a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f35083a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f35083a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            View view2;
            View view3;
            View view4;
            LinearLayout linearLayout;
            View view5;
            View view6;
            View view7;
            LinearLayout linearLayout2;
            if (z9) {
                f9 = z9 ? 1.08f : 1.0f;
                View view8 = this.f35083a;
                if (view8 == null || view8.getTag() == null || !this.f35083a.getTag().equals("1")) {
                    View view9 = this.f35083a;
                    if (view9 == null || view9.getTag() == null || !this.f35083a.getTag().equals("2")) {
                        View view10 = this.f35083a;
                        if (view10 == null || view10.getTag() == null || !this.f35083a.getTag().equals("3")) {
                            View view11 = this.f35083a;
                            if ((view11 != null && view11.getTag() != null && this.f35083a.getTag().equals("4")) || (((view5 = this.f35083a) != null && view5.getTag() != null && this.f35083a.getTag().equals("5")) || (((view6 = this.f35083a) != null && view6.getTag() != null && this.f35083a.getTag().equals("6")) || ((view7 = this.f35083a) != null && view7.getTag() != null && this.f35083a.getTag().equals("7"))))) {
                                view.setBackground(NSTIJKPlayerEPGActivity.this.getResources().getDrawable(a7.e.f11953Q0));
                                return;
                            }
                            View view12 = this.f35083a;
                            if (view12 != null && view12.getTag() != null && this.f35083a.getTag().equals("8")) {
                                return;
                            }
                            View view13 = this.f35083a;
                            if (view13 == null || view13.getTag() == null || !this.f35083a.getTag().equals("9")) {
                                View view14 = this.f35083a;
                                if (view14 == null || view14.getTag() == null || !this.f35083a.getTag().equals("10")) {
                                    return;
                                }
                                view.setBackground(NSTIJKPlayerEPGActivity.this.getResources().getDrawable(a7.e.f11950P0));
                                b(f9);
                                c(f9);
                                linearLayout2 = NSTIJKPlayerEPGActivity.this.f34950P1;
                            }
                        }
                        view.setBackground(NSTIJKPlayerEPGActivity.this.getResources().getDrawable(a7.e.f11950P0));
                        b(f9);
                        c(f9);
                        return;
                    }
                    view.setBackground(NSTIJKPlayerEPGActivity.this.getResources().getDrawable(a7.e.f11950P0));
                    b(f9);
                    c(f9);
                    linearLayout2 = NSTIJKPlayerEPGActivity.this.f34947O1;
                } else {
                    view.setBackground(NSTIJKPlayerEPGActivity.this.getResources().getDrawable(a7.e.f11950P0));
                    b(f9);
                    c(f9);
                    linearLayout2 = NSTIJKPlayerEPGActivity.this.f34941M1;
                }
                linearLayout2.setVisibility(0);
                return;
            }
            if (z9) {
                return;
            }
            f9 = z9 ? 1.08f : 1.0f;
            View view15 = this.f35083a;
            if (view15 == null || view15.getTag() == null || !this.f35083a.getTag().equals("1")) {
                View view16 = this.f35083a;
                if (view16 == null || view16.getTag() == null || !this.f35083a.getTag().equals("2")) {
                    View view17 = this.f35083a;
                    if (view17 == null || view17.getTag() == null || !this.f35083a.getTag().equals("3")) {
                        View view18 = this.f35083a;
                        if ((view18 != null && view18.getTag() != null && this.f35083a.getTag().equals("4")) || (((view2 = this.f35083a) != null && view2.getTag() != null && this.f35083a.getTag().equals("5")) || (((view3 = this.f35083a) != null && view3.getTag() != null && this.f35083a.getTag().equals("6")) || ((view4 = this.f35083a) != null && view4.getTag() != null && this.f35083a.getTag().equals("7"))))) {
                            view.setBackground(null);
                            return;
                        }
                        View view19 = this.f35083a;
                        if (view19 != null && view19.getTag() != null && this.f35083a.getTag().equals("8")) {
                            return;
                        }
                        View view20 = this.f35083a;
                        if (view20 == null || view20.getTag() == null || !this.f35083a.getTag().equals("9")) {
                            View view21 = this.f35083a;
                            if (view21 == null || view21.getTag() == null || !this.f35083a.getTag().equals("10")) {
                                return;
                            }
                            view.setBackground(NSTIJKPlayerEPGActivity.this.getResources().getDrawable(a7.e.f11942N0));
                            b(f9);
                            c(f9);
                            a(z9);
                            linearLayout = NSTIJKPlayerEPGActivity.this.f34950P1;
                        }
                    }
                    view.setBackground(NSTIJKPlayerEPGActivity.this.getResources().getDrawable(a7.e.f11942N0));
                    b(f9);
                    c(f9);
                    a(z9);
                    return;
                }
                view.setBackground(NSTIJKPlayerEPGActivity.this.getResources().getDrawable(a7.e.f11942N0));
                b(f9);
                c(f9);
                a(z9);
                linearLayout = NSTIJKPlayerEPGActivity.this.f34947O1;
            } else {
                view.setBackground(NSTIJKPlayerEPGActivity.this.getResources().getDrawable(a7.e.f11942N0));
                b(f9);
                c(f9);
                a(z9);
                linearLayout = NSTIJKPlayerEPGActivity.this.f34941M1;
            }
            linearLayout.setVisibility(8);
        }
    }

    public NSTIJKPlayerEPGActivity() {
        Boolean bool = Boolean.FALSE;
        this.f34946O0 = bool;
        this.f34955R0 = "";
        this.f34964U0 = bool;
        this.f34967V0 = "";
        this.f34970W0 = 0;
        this.f34996f1 = Boolean.TRUE;
        this.f35008i1 = bool;
        this.f35012j1 = bool;
        this.f35016k1 = bool;
        this.f35020l1 = bool;
        this.f35024m1 = bool;
        this.f35028n1 = bool;
        this.f35045r2 = "mobile";
        this.f35049s2 = "0";
        this.f35053t2 = "0";
        this.f35057u2 = 0;
    }

    private void H1(int i9) {
        if (f34898B2) {
            return;
        }
        this.f34958S0.f36287a1 = new d();
        NSTIJKPlayerEPG nSTIJKPlayerEPG = this.f34958S0;
        nSTIJKPlayerEPG.f36285Z0.postDelayed(nSTIJKPlayerEPG.f36287a1, i9);
    }

    public static boolean J1() {
        ProgressBar progressBar = f34899C2;
        return progressBar != null && progressBar.getVisibility() == 0;
    }

    public static long K1(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0L;
        }
    }

    private void L1() {
        ImageView imageView = this.f34980Z1;
        imageView.setOnFocusChangeListener(new e(imageView));
        ImageView imageView2 = this.f34982a2;
        imageView2.setOnFocusChangeListener(new e(imageView2));
        ImageView imageView3 = this.f34997f2;
        imageView3.setOnFocusChangeListener(new e(imageView3));
        ImageView imageView4 = this.f35001g2;
        imageView4.setOnFocusChangeListener(new e(imageView4));
        ImageView imageView5 = this.f35005h2;
        imageView5.setOnFocusChangeListener(new e(imageView5));
        LinearLayout linearLayout = this.f34956R1;
        linearLayout.setOnFocusChangeListener(new e(linearLayout));
        LinearLayout linearLayout2 = this.f34965U1;
        linearLayout2.setOnFocusChangeListener(new e(linearLayout2));
        LinearLayout linearLayout3 = this.f34953Q1;
        linearLayout3.setOnFocusChangeListener(new e(linearLayout3));
        ImageView imageView6 = this.f34989d2;
        imageView6.setOnFocusChangeListener(new e(imageView6));
        ImageView imageView7 = this.f34993e2;
        imageView7.setOnFocusChangeListener(new e(imageView7));
        ImageView imageView8 = this.f34974X1;
        imageView8.setOnFocusChangeListener(new e(imageView8));
        ImageView imageView9 = this.f34974X1;
        imageView9.setOnFocusChangeListener(new e(imageView9));
    }

    public static String N1(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    private ArrayList Q1() {
        ArrayList<PasswordStatusDBModel> allPasswordStatus = this.f34924H.getAllPasswordStatus(SharepreferenceDBHandler.getUserID(this.f34987d));
        this.f35015k0 = allPasswordStatus;
        if (allPasswordStatus != null) {
            for (PasswordStatusDBModel passwordStatusDBModel : allPasswordStatus) {
                if (passwordStatusDBModel.getPasswordStatus().equals("1")) {
                    this.f35007i0.add(passwordStatusDBModel.getPasswordStatusCategoryId());
                }
            }
        }
        return this.f35007i0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean U1(ArrayList arrayList, ArrayList arrayList2) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LiveStreamsDBModel liveStreamsDBModel = (LiveStreamsDBModel) it.next();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (liveStreamsDBModel.getCategoryId().equals((String) it2.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    private void V1() {
        this.f35062w.setProgress(0);
        this.f35042r.setText(this.f34987d.getResources().getString(j.f13078N4));
        this.f35046s.setText("");
        this.f35050t.setText(this.f34987d.getResources().getString(j.f13221c4));
        this.f35054u.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W1() {
        if (this.f34938L1.getVisibility() == 0) {
            this.f34938L1.startAnimation(this.f35033o2);
            if (this.f34923G1.getVisibility() == 0) {
                this.f34923G1.startAnimation(this.f35033o2);
            }
            if (this.f34929I1.getVisibility() == 0) {
                this.f34929I1.startAnimation(this.f35033o2);
            }
            if (this.f34926H1.getVisibility() == 0) {
                this.f34926H1.startAnimation(this.f35033o2);
            }
            this.f34938L1.setVisibility(8);
            if (this.f34923G1.getVisibility() == 0) {
                this.f34923G1.setVisibility(8);
            }
            if (this.f34929I1.getVisibility() == 0) {
                this.f34929I1.setVisibility(8);
            }
            if (this.f34926H1.getVisibility() == 0) {
                this.f34926H1.setVisibility(8);
            }
        }
    }

    private void Y1() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a2() {
        this.f35062w.setProgress(0);
        this.f35042r.setText(this.f34987d.getResources().getString(j.f13068M4));
        this.f35046s.setText("");
        this.f35050t.setText(this.f34987d.getResources().getString(j.f13211b4));
        this.f35054u.setText("");
    }

    private void c2() {
        this.f34980Z1.setOnClickListener(this);
        this.f34982a2.setOnClickListener(this);
        this.f34944N1.setOnClickListener(this);
        this.f34997f2.setOnClickListener(this);
        this.f34962T1.setOnClickListener(this);
        this.f35001g2.setOnClickListener(this);
        this.f34956R1.setOnClickListener(this);
        this.f34965U1.setOnClickListener(this);
        this.f34953Q1.setOnClickListener(this);
        this.f34989d2.setOnClickListener(this);
        this.f34993e2.setOnClickListener(this);
        this.f34932J1.setOnClickListener(this);
        this.f34977Y1.setOnClickListener(this);
        this.f35005h2.setOnClickListener(this);
    }

    private void e2() {
        try {
            NSTIJKPlayerEPG nSTIJKPlayerEPG = this.f34958S0;
            if (nSTIJKPlayerEPG != null) {
                if (nSTIJKPlayerEPG.n1()) {
                    this.f34958S0.g1();
                } else {
                    this.f34958S0.E1();
                    this.f34958S0.q1(true);
                    this.f34958S0.B1();
                }
                IjkMediaPlayer.native_profileEnd();
            }
        } catch (Exception unused) {
        }
    }

    private void h2() {
        if (this.f34968V1.getVisibility() == 8) {
            this.f34968V1.startAnimation(this.f35037p2);
            this.f34968V1.setVisibility(0);
            this.f34993e2.requestFocus();
        }
    }

    private void j2() {
        i2();
        if (this.f34938L1.getVisibility() == 0) {
            W1();
        } else {
            f2();
            H1(5000);
        }
    }

    public void E1() {
        int parentalStatusCount = this.f34924H.getParentalStatusCount(SharepreferenceDBHandler.getUserID(this.f34987d));
        ArrayList<LiveStreamsDBModel> allLiveStreasWithSkyId = this.f34924H.getAllLiveStreasWithSkyId("0", "live");
        this.f34909C = allLiveStreasWithSkyId;
        if (parentalStatusCount <= 0 || allLiveStreasWithSkyId == null) {
            this.f34978Z = allLiveStreasWithSkyId;
            return;
        }
        ArrayList arrayList = this.f35007i0;
        if (arrayList != null) {
            this.f34975Y = T1(allLiveStreasWithSkyId, arrayList);
        }
        this.f34978Z = this.f34975Y;
    }

    public void F1(String str) {
        LiveStreamDBHandler liveStreamDBHandler = this.f34924H;
        if (liveStreamDBHandler != null) {
            this.f34995f0 = liveStreamDBHandler.getAllLiveStreasWithSkyId(str, "live");
        }
        this.f34978Z = this.f34995f0;
    }

    public void G1() {
        this.f34912D = new ArrayList();
        O1();
        this.f34978Z = this.f34912D;
    }

    public void I1(int i9) {
        if (f34898B2) {
            return;
        }
        this.f34958S0.f36287a1 = new c();
        NSTIJKPlayerEPG nSTIJKPlayerEPG = this.f34958S0;
        nSTIJKPlayerEPG.f36285Z0.postDelayed(nSTIJKPlayerEPG.f36287a1, i9);
    }

    public void M1() {
        if (this.f34958S0 != null) {
            Y1();
        }
        NSTIJKPlayerEPG nSTIJKPlayerEPG = this.f34958S0;
        ((nSTIJKPlayerEPG == null || !nSTIJKPlayerEPG.isPlaying()) ? this.f34994f : this.f34998g).requestFocus();
    }

    public void O1() {
        ArrayList arrayList;
        if (this.f34954R.equals("m3u")) {
            LiveStreamDBHandler liveStreamDBHandler = this.f34924H;
            if (liveStreamDBHandler == null) {
                return;
            }
            ArrayList<FavouriteM3UModel> favouriteM3U = liveStreamDBHandler.getFavouriteM3U("live");
            arrayList = new ArrayList();
            for (FavouriteM3UModel favouriteM3UModel : favouriteM3U) {
                ArrayList<LiveStreamsDBModel> m3UFavouriteRow = this.f34924H.getM3UFavouriteRow(favouriteM3UModel.getCategoryID(), favouriteM3UModel.getUrl(), favouriteM3UModel.getTimestamp());
                if (m3UFavouriteRow != null && m3UFavouriteRow.size() > 0) {
                    arrayList.add(m3UFavouriteRow.get(0));
                }
            }
            if (arrayList.size() == 0) {
                return;
            }
        } else {
            DatabaseHandler databaseHandler = this.f35067x0;
            if (databaseHandler == null) {
                return;
            }
            ArrayList<FavouriteDBModel> allFavourites = databaseHandler.getAllFavourites("live", SharepreferenceDBHandler.getUserID(this.f34987d));
            arrayList = new ArrayList();
            for (FavouriteDBModel favouriteDBModel : allFavourites) {
                LiveStreamsDBModel liveStreamFavouriteRow = new LiveStreamDBHandler(this.f34987d).getLiveStreamFavouriteRow(favouriteDBModel.getCategoryID(), String.valueOf(favouriteDBModel.getStreamID()), favouriteDBModel.getTimestamp(), "");
                if (liveStreamFavouriteRow != null) {
                    arrayList.add(liveStreamFavouriteRow);
                }
            }
            if (arrayList.size() == 0) {
                return;
            }
        }
        this.f34912D = arrayList;
    }

    public int P1(ArrayList arrayList, int i9) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (w.r0(((LiveStreamsDBModel) arrayList.get(i10)).getNum()) == i9) {
                return i10;
            }
        }
        return 0;
    }

    public int R1(long j9, long j10, Context context) {
        if (context != null) {
            long millis = LocalDateTime.now().toDateTime().getMillis();
            Long l9 = this.f34985c1;
            if (l9 != null) {
                millis += l9.longValue();
            }
            if (j9 < j10 && millis < j10) {
                if (millis <= j9) {
                    return 100;
                }
                return (int) (((j10 - millis) * 100) / (j10 - j9));
            }
        }
        return 0;
    }

    public long S1(Context context) {
        if (context == null) {
            return 0L;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("loginPrefs", 0);
        f34901y2 = sharedPreferences;
        if (sharedPreferences != null) {
            return w.J(sharedPreferences.getString("selectedEPGShift", AbstractC2237a.f44437C0));
        }
        return 0L;
    }

    public final ArrayList T1(ArrayList arrayList, ArrayList arrayList2) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LiveStreamsDBModel liveStreamsDBModel = (LiveStreamsDBModel) it.next();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    this.f34972X.add(liveStreamsDBModel);
                    break;
                }
                if (liveStreamsDBModel.getCategoryId().equals((String) it2.next())) {
                    break;
                }
            }
        }
        return this.f34972X;
    }

    public void X1() {
        if (f34898B2 || this.f34938L1.getVisibility() != 0) {
            return;
        }
        this.f34938L1.startAnimation(this.f35033o2);
        if (this.f34923G1.getVisibility() == 0) {
            this.f34923G1.startAnimation(this.f35033o2);
        }
        if (this.f34929I1.getVisibility() == 0) {
            this.f34929I1.startAnimation(this.f35033o2);
        }
        if (this.f34926H1.getVisibility() == 0) {
            this.f34926H1.startAnimation(this.f35033o2);
        }
        this.f34938L1.setVisibility(8);
        if (this.f34923G1.getVisibility() == 0) {
            this.f34923G1.setVisibility(8);
        }
        if (this.f34929I1.getVisibility() == 0) {
            this.f34929I1.setVisibility(8);
        }
        if (this.f34926H1.getVisibility() == 0) {
            this.f34926H1.setVisibility(8);
        }
    }

    public boolean Z1(long j9, long j10, Context context) {
        if (context != null) {
            long millis = LocalDateTime.now().toDateTime().getMillis();
            Long l9 = this.f34985c1;
            if (l9 != null) {
                millis += l9.longValue();
            }
            if (j9 <= millis && j10 >= millis) {
                return true;
            }
        }
        return false;
    }

    public void b2() {
        this.f35022m.setVisibility(0);
        this.f35026n.setText(this.f34987d.getResources().getString(j.f13261g4));
        if (AbstractC2237a.f44434B.booleanValue()) {
            findViewById(f.Sm).setVisibility(8);
        }
    }

    public final void d2(ArrayList arrayList, int i9) {
        NSTIJKPlayerEPG nSTIJKPlayerEPG;
        Uri uri;
        String str;
        String str2;
        if (arrayList == null || arrayList.size() <= 0 || this.f34931J0 >= arrayList.size()) {
            return;
        }
        if (this.f34931J0 == 0) {
            this.f34931J0 = P1(arrayList, i9);
        }
        String name = ((LiveStreamsDBModel) arrayList.get(this.f34931J0)).getName();
        String num = ((LiveStreamsDBModel) arrayList.get(this.f34931J0)).getNum();
        int iQ0 = w.q0(((LiveStreamsDBModel) arrayList.get(this.f34931J0)).getStreamId());
        String url = ((LiveStreamsDBModel) arrayList.get(this.f34931J0)).getUrl();
        String strS0 = w.S0(k.a() + k.i());
        String epgChannelId = ((LiveStreamsDBModel) arrayList.get(this.f34931J0)).getEpgChannelId();
        String streamIcon = ((LiveStreamsDBModel) arrayList.get(this.f34931J0)).getStreamIcon();
        try {
            if (streamIcon.equals("") || streamIcon.isEmpty()) {
                this.f35038q.setImageDrawable(this.f34987d.getResources().getDrawable(a7.e.f12016i1));
            } else {
                t.q(this.f34987d).l(streamIcon).j(a7.e.f12016i1).d(a7.e.f12016i1).g(this.f35038q);
            }
        } catch (Exception unused) {
            this.f35038q.setImageDrawable(this.f34987d.getResources().getDrawable(a7.e.f12016i1));
        }
        SharedPreferences.Editor editor = this.f35070y0;
        if (editor != null) {
            editor.putString("currentlyPlayingVideo", String.valueOf(((LiveStreamsDBModel) arrayList.get(this.f34931J0)).getStreamId()));
            this.f35070y0.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((LiveStreamsDBModel) arrayList.get(this.f34931J0)).getUrl()));
            this.f35070y0.apply();
        }
        SharedPreferences.Editor editor2 = this.f35073z0;
        if (editor2 != null) {
            editor2.putInt("currentlyPlayingVideoPosition", this.f34931J0);
            this.f35073z0.apply();
        }
        this.f35063w0 = iQ0;
        this.f34958S0.setTitle(num + " - " + name);
        this.f34958S0.setCurrentWindowIndex(this.f34931J0);
        SimpleDateFormat simpleDateFormat = this.f35044r1;
        if (K1(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(this.f34987d))), this.f34952Q0.format(this.f35004h1)) >= C2939c.p() && (str = this.f34961T0) != null && this.f34973X0 != null && (!f34897A2.equals(str) || (this.f34961T0 != null && (str2 = this.f34973X0) != null && !f34902z2.equals(str2)))) {
            this.f34996f1 = Boolean.FALSE;
            this.f35040q1.b(f.f12146G).e();
            this.f35040q1.b(f.f12186K).c(strS0 + this.f34992e1 + this.f34983b1);
        }
        try {
            if (this.f34996f1.booleanValue()) {
                if (this.f34954R.equals("m3u")) {
                    nSTIJKPlayerEPG = this.f34958S0;
                    uri = Uri.parse(url);
                } else {
                    nSTIJKPlayerEPG = this.f34958S0;
                    uri = Uri.parse(this.f34990e + iQ0 + this.f34951Q);
                }
                nSTIJKPlayerEPG.w1(uri, this.f35035p0, name);
                NSTIJKPlayerEPG nSTIJKPlayerEPG2 = this.f34958S0;
                nSTIJKPlayerEPG2.f36236H = 0;
                nSTIJKPlayerEPG2.f36242J = false;
                this.f34916E0.removeCallbacksAndMessages(null);
                a2();
                this.f34916E0.postDelayed(new a(epgChannelId, streamIcon), 300L);
            }
        } catch (Exception unused2) {
        }
    }

    public void f2() {
        if (f34898B2 || this.f34938L1.getVisibility() != 8) {
            return;
        }
        this.f34938L1.startAnimation(this.f35029n2);
        this.f34938L1.setVisibility(0);
    }

    public void g2() {
        if (f34898B2 || this.f34938L1.getVisibility() != 8) {
            return;
        }
        this.f34938L1.startAnimation(this.f35029n2);
        this.f34938L1.setVisibility(0);
        if (this.f34923G1.getVisibility() == 8) {
            this.f34923G1.startAnimation(this.f35029n2);
            this.f34923G1.setVisibility(0);
        }
        if (this.f34929I1.getVisibility() == 8) {
            this.f34929I1.startAnimation(this.f35029n2);
            this.f34929I1.setVisibility(0);
        }
        if (this.f34926H1.getVisibility() == 8) {
            this.f34926H1.startAnimation(this.f35029n2);
            this.f34926H1.setVisibility(0);
        }
    }

    public void i2() {
        Handler handler;
        if (f34898B2 || (handler = this.f34958S0.f36285Z0) == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0032 A[Catch: Exception -> 0x0044, TRY_LEAVE, TryCatch #0 {Exception -> 0x0044, blocks: (B:4:0x000e, B:6:0x0014, B:7:0x0032), top: B:39:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k2(java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerEPGActivity.k2(java.lang.String, java.lang.String):void");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        RelativeLayout relativeLayout;
        try {
            i2();
            relativeLayout = this.f34971W1;
        } catch (Exception unused) {
        }
        if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
            this.f34971W1.startAnimation(this.f35065w2);
            this.f34971W1.setVisibility(8);
            return;
        }
        if (this.f34968V1.getVisibility() == 0) {
            this.f34968V1.startAnimation(this.f35041q2);
            this.f34968V1.setVisibility(8);
            return;
        }
        if (this.f35035p0 && this.f34938L1.getVisibility() == 0) {
            this.f34938L1.startAnimation(this.f35033o2);
            if (this.f34923G1.getVisibility() == 0) {
                this.f34923G1.startAnimation(this.f35033o2);
            }
            if (!this.f35048s1.equals("true") && this.f34984b2.getVisibility() == 0) {
                this.f34984b2.startAnimation(this.f35033o2);
            }
            if (this.f34929I1.getVisibility() == 0) {
                this.f34929I1.startAnimation(this.f35033o2);
            }
            if (!this.f35048s1.equals("true") && this.f34986c2.getVisibility() == 0) {
                this.f34986c2.startAnimation(this.f35033o2);
            }
            if (this.f34926H1.getVisibility() == 0) {
                this.f34926H1.startAnimation(this.f35033o2);
            }
            this.f34938L1.setVisibility(8);
            if (this.f34923G1.getVisibility() == 0) {
                this.f34923G1.setVisibility(8);
            }
            if (!this.f35048s1.equals("true") && this.f34984b2.getVisibility() == 0) {
                this.f34984b2.setVisibility(8);
            }
            if (this.f34929I1.getVisibility() == 0) {
                this.f34929I1.setVisibility(8);
            }
            if (!this.f35048s1.equals("true") && this.f34986c2.getVisibility() == 0) {
                this.f34986c2.setVisibility(8);
            }
            if (this.f34926H1.getVisibility() == 0) {
                this.f34926H1.setVisibility(8);
                return;
            }
            return;
        }
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        String str2;
        ImageView imageView;
        ImageView imageView2;
        int id = view.getId();
        if (id == f.f12172I5) {
            try {
                if (!this.f35045r2.equals("tv")) {
                    if (this.f34958S0.getPlayerIsPrepared()) {
                        i2();
                        g2();
                        I1(1000);
                        this.f34958S0.start();
                        this.f34980Z1.setVisibility(8);
                        imageView = this.f34982a2;
                    } else {
                        i2();
                        g2();
                        I1(5000);
                        imageView = this.f34980Z1;
                    }
                    imageView.setVisibility(0);
                    return;
                }
                if (this.f34958S0.getPlayerIsPrepared()) {
                    i2();
                    f2();
                    H1(1000);
                    this.f34958S0.start();
                    this.f34980Z1.setVisibility(8);
                    this.f34982a2.setVisibility(0);
                    imageView2 = this.f34982a2;
                } else {
                    i2();
                    f2();
                    H1(5000);
                    this.f34980Z1.setVisibility(0);
                    imageView2 = this.f34980Z1;
                }
                imageView2.requestFocus();
                return;
            } catch (Exception e9) {
                str = "exection " + e9;
                str2 = "NSTIJPLAYER";
            }
        } else {
            if (id != f.f12162H5) {
                if (id == f.f12337Z6 || id == f.f12111C4) {
                    i2();
                    W1();
                    h2();
                    return;
                }
                if (id == f.f12367c7 || id == f.f12131E4) {
                    onBackPressed();
                } else if (id != f.f12171I4 && id != f.f12181J4) {
                    if (id == f.f12581x8) {
                        i2();
                        W1();
                        f34898B2 = true;
                        this.f34958S0.y1();
                        this.f34958S0.b1(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
                        return;
                    }
                    if (id == f.f12427i6) {
                        i2();
                        f34898B2 = false;
                        this.f34935K1.startAnimation(this.f35013j2);
                        this.f34935K1.setVisibility(8);
                        g2();
                        I1(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
                        return;
                    }
                    if (id == f.f12560v7) {
                        i2();
                        W1();
                        return;
                    } else {
                        if (id == f.f12104B7) {
                            i2();
                            H1(5000);
                            NSTIJKPlayerEPG nSTIJKPlayerEPG = this.f34958S0;
                            if (nSTIJKPlayerEPG != null) {
                                nSTIJKPlayerEPG.H1();
                                return;
                            }
                            return;
                        }
                        if (id != f.f12275S8) {
                            return;
                        }
                        onBackPressed();
                    }
                }
                onBackPressed();
                return;
            }
            try {
                if (this.f35045r2.equals("tv")) {
                    i2();
                    f2();
                    this.f34958S0.pause();
                    this.f34982a2.setVisibility(8);
                    this.f34980Z1.setVisibility(0);
                    this.f34980Z1.requestFocus();
                } else {
                    i2();
                    g2();
                    this.f34958S0.pause();
                    this.f34982a2.setVisibility(8);
                    this.f34980Z1.setVisibility(0);
                }
                return;
            } catch (Exception e10) {
                str = "exection " + e10;
                str2 = "NSTIJPLAYERACTIVTY";
            }
        }
        Log.e(str2, str);
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i9;
        String str;
        StringBuilder sb;
        StringBuilder sb2;
        this.f34987d = this;
        super.onCreate(bundle);
        this.f35032o1 = new C2858a(this.f34987d);
        this.f35000g1 = this.f34987d.getSharedPreferences("loginPrefs", 0);
        this.f35040q1 = new C2766a(this);
        this.f35036p1 = new Handler();
        if (this.f35032o1.A().equals(AbstractC2237a.f44453K0)) {
            this.f35045r2 = "tv";
            i9 = g.f12743X2;
        } else {
            this.f35045r2 = "mobile";
            i9 = g.f12737W2;
        }
        setContentView(i9);
        this.f35052t1 = (RadioGroup) findViewById(f.Kg);
        this.f35056u1 = (RadioGroup) findViewById(f.f12321Y);
        this.f35060v1 = (RadioGroup) findViewById(f.Gm);
        this.f35064w1 = (TextView) findViewById(f.Wl);
        this.f34914D1 = (FrameLayout) findViewById(f.f12307W3);
        this.f34917E1 = (SeekBar) findViewById(f.Lf);
        this.f34920F1 = (SeekBar) findViewById(f.Kf);
        this.f34923G1 = (LinearLayout) findViewById(f.f12438j7);
        this.f34926H1 = (LinearLayout) findViewById(f.Ea);
        this.f34929I1 = (LinearLayout) findViewById(f.h9);
        this.f34968V1 = (RelativeLayout) findViewById(f.lf);
        this.f34971W1 = (RelativeLayout) findViewById(f.ne);
        this.f34974X1 = (ImageView) findViewById(f.f12466m5);
        this.f34932J1 = (LinearLayout) findViewById(f.f12581x8);
        this.f34935K1 = (LinearLayout) findViewById(f.O9);
        this.f34977Y1 = (ImageView) findViewById(f.f12427i6);
        this.f35074z1 = (TextView) findViewById(f.uk);
        this.f34905A1 = (TextView) findViewById(f.Ak);
        this.f34908B1 = (TextView) findViewById(f.Ck);
        this.f34938L1 = (LinearLayout) findViewById(f.t9);
        this.f34980Z1 = (ImageView) findViewById(f.f12172I5);
        this.f34982a2 = (ImageView) findViewById(f.f12162H5);
        this.f34984b2 = (ImageView) findViewById(f.Cl);
        this.f34986c2 = (ImageView) findViewById(f.El);
        this.f34941M1 = (LinearLayout) findViewById(f.f12357b7);
        this.f34989d2 = (ImageView) findViewById(f.f12171I4);
        this.f34993e2 = (ImageView) findViewById(f.f12181J4);
        this.f34997f2 = (ImageView) findViewById(f.f12131E4);
        this.f34944N1 = (LinearLayout) findViewById(f.f12367c7);
        this.f35001g2 = (ImageView) findViewById(f.f12111C4);
        this.f34965U1 = (LinearLayout) findViewById(f.f12104B7);
        this.f35005h2 = (ImageView) findViewById(f.f12477n5);
        this.f34947O1 = (LinearLayout) findViewById(f.f12328Y6);
        this.f34950P1 = (LinearLayout) findViewById(f.L9);
        this.f34953Q1 = (LinearLayout) findViewById(f.f12275S8);
        this.f34956R1 = (LinearLayout) findViewById(f.f12560v7);
        this.f34911C1 = (TextView) findViewById(f.lj);
        this.f34959S1 = (LinearLayout) findViewById(f.W8);
        this.f34962T1 = (LinearLayout) findViewById(f.f12337Z6);
        this.f35068x1 = (TextView) findViewById(f.Mh);
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        this.f35009i2 = AnimationUtils.loadAnimation(this.f34987d, a7.b.f11839q);
        this.f35013j2 = AnimationUtils.loadAnimation(this.f34987d, a7.b.f11840r);
        this.f35029n2 = AnimationUtils.loadAnimation(this.f34987d, a7.b.f11830h);
        this.f35033o2 = AnimationUtils.loadAnimation(this.f34987d, a7.b.f11831i);
        this.f35041q2 = AnimationUtils.loadAnimation(this.f34987d, a7.b.f11837o);
        this.f35037p2 = AnimationUtils.loadAnimation(this.f34987d, a7.b.f11836n);
        this.f35021l2 = AnimationUtils.loadAnimation(this.f34987d, a7.b.f11841s);
        this.f35025m2 = AnimationUtils.loadAnimation(this.f34987d, a7.b.f11842t);
        this.f35017k2 = AnimationUtils.loadAnimation(this.f34987d, a7.b.f11838p);
        this.f35061v2 = AnimationUtils.loadAnimation(this.f34987d, a7.b.f11832j);
        this.f35065w2 = AnimationUtils.loadAnimation(this.f34987d, a7.b.f11833k);
        this.f34927I = getSharedPreferences("loginPrefs", 0);
        f34901y2 = this.f34987d.getSharedPreferences("loginPrefs", 0);
        this.f34930J = this.f34987d.getSharedPreferences("allowedFormat", 0);
        SharedPreferences sharedPreferences = getSharedPreferences("currentlyPlayingVideo", 0);
        this.f34933K = sharedPreferences;
        this.f35070y0 = sharedPreferences.edit();
        SharedPreferences sharedPreferences2 = getSharedPreferences("currentlyPlayingVideoPosition", 0);
        this.f34936L = sharedPreferences2;
        this.f35073z0 = sharedPreferences2.edit();
        this.f34976Y0 = this.f34987d.getSharedPreferences("openedVideo", 0);
        this.f34939M = this.f34987d.getSharedPreferences("currentSubtitleTrack", 0);
        this.f34942N = this.f34987d.getSharedPreferences("currentAudioTrack", 0);
        this.f34945O = this.f34987d.getSharedPreferences("currentVideoTrack", 0);
        this.f34925H0 = this.f34942N.edit();
        this.f34928I0 = this.f34945O.edit();
        this.f34922G0 = this.f34939M.edit();
        this.f34925H0.clear();
        this.f34925H0.apply();
        this.f34928I0.clear();
        this.f34928I0.apply();
        this.f34922G0.clear();
        this.f34922G0.apply();
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f34987d).equals("m3u")) {
            this.f34954R = "m3u";
        } else {
            this.f34954R = "api";
        }
        String string = this.f34927I.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        String string2 = this.f34927I.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        String string3 = this.f34927I.getString("serverUrl", "");
        String string4 = this.f34927I.getString("serverProtocol", "");
        String string5 = this.f34927I.getString("serverPortHttps", "");
        String string6 = this.f34927I.getString("serverPort", "");
        String string7 = this.f34927I.getString("serverPortRtmp", "");
        if (string4 != null) {
            switch (string4) {
                case "http":
                    if (string3 != null && !string3.startsWith("http://")) {
                        sb2 = new StringBuilder();
                        sb2.append("http://");
                        sb2.append(string3);
                        string3 = sb2.toString();
                    }
                    string5 = string6;
                    break;
                case "rmtp":
                    if (string3 != null && !string3.startsWith("rmtp://")) {
                        string3 = "rmtp://" + string3;
                    }
                    string5 = string7;
                    break;
                case "https":
                    if (string3 != null && !string3.startsWith("https://")) {
                        string3 = "https://" + string3;
                        break;
                    }
                    break;
                default:
                    if (string3 != null && !string3.startsWith("http://") && !string3.startsWith("https://")) {
                        sb2 = new StringBuilder();
                        sb2.append("http://");
                        sb2.append(string3);
                        string3 = sb2.toString();
                    }
                    string5 = string6;
                    break;
            }
        } else {
            string5 = "";
        }
        String string8 = this.f34930J.getString("allowedFormat", "");
        this.f34951Q = string8;
        if (string8 == null || string8.isEmpty() || this.f34951Q.equals("") || !this.f34951Q.equals(CookieSpecs.DEFAULT)) {
            String str2 = this.f34951Q;
            if (str2 == null || str2.isEmpty() || this.f34951Q.equals("") || !this.f34951Q.equals("ts")) {
                String str3 = this.f34951Q;
                str = (str3 == null || str3.isEmpty() || this.f34951Q.equals("") || !this.f34951Q.equals("m3u8")) ? ".ts" : ".m3u8";
                this.f34951Q = "";
            }
            this.f34951Q = str;
        } else {
            this.f34951Q = "";
        }
        int intExtra = getIntent().getIntExtra("OPENED_STREAM_ID", 0);
        this.f34988d1 = getIntent().getStringExtra("VIDEO_URL");
        this.f34970W0 = getIntent().getIntExtra("VIDEO_NUM", 0);
        getIntent().getStringExtra("STREAM_TYPE");
        String stringExtra = getIntent().getStringExtra("VIDEO_TITLE");
        String stringExtra2 = getIntent().getStringExtra("OPENED_CAT_ID");
        String stringExtra3 = getIntent().getStringExtra("EPG_CHANNEL_ID");
        this.f35048s1 = getIntent().getStringExtra("MultiPlayer");
        String stringExtra4 = getIntent().getStringExtra("EPG_CHANNEL_LOGO");
        SharedPreferences.Editor editorEdit = this.f34976Y0.edit();
        editorEdit.putInt("openedVideoID", intExtra);
        editorEdit.putString("LOGIN_PREF_OPENED_VIDEO_URL_M3U", this.f34988d1);
        editorEdit.putString("name", stringExtra);
        editorEdit.putInt("num", this.f34970W0);
        editorEdit.putString("epgChannelId", stringExtra3);
        editorEdit.putString("channelLogo", stringExtra4);
        editorEdit.apply();
        if (this.f34951Q.equals("")) {
            sb = new StringBuilder();
            sb.append(string3);
            sb.append(":");
            sb.append(string5);
            sb.append("/");
        } else {
            sb = new StringBuilder();
            sb.append(string3);
            sb.append(":");
            sb.append(string5);
            sb.append("/live/");
        }
        sb.append(string);
        sb.append("/");
        sb.append(string2);
        sb.append("/");
        this.f34955R0 = sb.toString();
        this.f34990e = w.G(this.f34955R0);
        this.f34924H = new LiveStreamDBHandler(this);
        this.f35067x0 = new DatabaseHandler(this.f34987d);
        this.f34910C0 = new Handler();
        this.f34913D0 = new Handler();
        this.f34916E0 = new Handler();
        this.f34919F0 = new Handler();
        NSTIJKPlayerEPG nSTIJKPlayerEPG = (NSTIJKPlayerEPG) findViewById(f.Im);
        this.f34958S0 = nSTIJKPlayerEPG;
        nSTIJKPlayerEPG.setLiveStreamDBHandler(this.f34924H);
        L1();
        c2();
        this.f35010j = (ImageView) findViewById(f.Cl);
        String str4 = this.f35048s1;
        if (str4 == null || !str4.equals("true")) {
            ImageView imageView = this.f35010j;
            if (imageView != null) {
                imageView.setOnClickListener(this);
            }
        } else {
            ImageView imageView2 = this.f35010j;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        this.f35002h = (ImageView) findViewById(f.El);
        this.f35006i = findViewById(f.f12275S8);
        String str5 = this.f35048s1;
        if (str5 == null || !str5.equals("true")) {
            ImageView imageView3 = this.f35002h;
            if (imageView3 != null) {
                imageView3.setOnClickListener(this);
            }
            View view = this.f35006i;
            if (view != null) {
                view.setOnClickListener(this);
            }
        } else {
            ImageView imageView4 = this.f35002h;
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
        }
        NSTIJKPlayerEPG nSTIJKPlayerEPG2 = this.f34958S0;
        nSTIJKPlayerEPG2.u1(this, nSTIJKPlayerEPG2, this.f35060v1, this.f35056u1, this.f35052t1, this.f34908B1, this.f35074z1, this.f34905A1, this.f35064w1, this.f34920F1, this.f34917E1, this.f34938L1, this.f35029n2, this.f35033o2, this.f34984b2, this.f34986c2, this.f34923G1, this.f34926H1, this.f35068x1, this.f34929I1, this.f35017k2, this.f35021l2, this.f35071y1, this.f34968V1, this.f35041q2, this.f34935K1, this.f35009i2, this.f35013j2, this.f34971W1, this.f35065w2, this.f35048s1, this.f34914D1);
        this.f35062w = (ProgressBar) findViewById(f.Nc);
        this.f35058v = (LinearLayout) findViewById(f.S9);
        this.f35038q = (ImageView) findViewById(f.f12241P4);
        this.f35042r = (TextView) findViewById(f.ti);
        this.f35046s = (TextView) findViewById(f.vi);
        this.f35050t = (TextView) findViewById(f.qk);
        this.f35054u = (TextView) findViewById(f.rk);
        f34899C2 = (ProgressBar) findViewById(f.f12086A);
        this.f35019l0 = (ProgressBar) findViewById(f.ec);
        this.f35023m0 = (TextView) findViewById(f.sk);
        this.f35027n0 = (TextView) findViewById(f.wk);
        this.f34904A0 = (TextView) findViewById(f.f12129E2);
        this.f34907B0 = (TextView) findViewById(f.gh);
        this.f34937L0 = (LinearLayout) findViewById(f.f12550u7);
        this.f34940M0 = (TextView) findViewById(f.f12481o);
        this.f35034p = (SeekBar) findViewById(f.Pm);
        this.f35022m = (LinearLayout) findViewById(f.f12146G);
        this.f35026n = (TextView) findViewById(f.f12186K);
        this.f35030o = (TextView) findViewById(f.rm);
        this.f35066x = (ProgressBar) findViewById(f.dc);
        try {
            IjkMediaPlayer.loadLibrariesOnce(null);
            IjkMediaPlayer.native_profileBegin("libijkplayer.so");
        } catch (Exception | UnsatisfiedLinkError unused) {
        }
        this.f34983b1 = w.S0(com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.b.f() + IjkListPreference.V());
        SharedPreferences sharedPreferences3 = this.f34987d.getSharedPreferences("timeFormat", 0);
        f34900x2 = sharedPreferences3;
        String string9 = sharedPreferences3.getString("timeFormat", AbstractC2237a.f44441E0);
        Locale locale = Locale.US;
        this.f34948P = new SimpleDateFormat(string9, locale);
        this.f34992e1 = w.S0(IjkListPreference.W() + IjkListPreference.U());
        findViewById(f.f12275S8).setOnClickListener(this);
        this.f35035p0 = true;
        View viewFindViewById = findViewById(f.f12172I5);
        this.f34994f = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(this);
        }
        this.f34973X0 = w.S0(C2940d.d());
        View viewFindViewById2 = findViewById(f.f12162H5);
        this.f34998g = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(this);
        }
        f34897A2 = N1(this.f34987d);
        f34902z2 = getApplicationContext().getPackageName();
        View viewFindViewById3 = findViewById(f.f12392f1);
        this.f35014k = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(this);
        }
        this.f35044r1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f34952Q0 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f34961T0 = w.S0(C2937a.a());
        this.f35004h1 = new Date();
        this.f34906B = (RelativeLayout) findViewById(f.pb);
        this.f34960T = new ArrayList();
        this.f34963U = new ArrayList();
        this.f34966V = new ArrayList();
        this.f34969W = new ArrayList();
        this.f34972X = new ArrayList();
        this.f34975Y = new ArrayList();
        this.f34978Z = new ArrayList();
        this.f34991e0 = new ArrayList();
        this.f34995f0 = new ArrayList();
        this.f34999g0 = new ArrayList();
        this.f35003h0 = new ArrayList();
        this.f35011j0 = this.f34924H.getAllliveCategories();
        LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
        LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel2 = new LiveStreamCategoryIdDBModel();
        LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel3 = new LiveStreamCategoryIdDBModel();
        liveStreamCategoryIdDBModel.setLiveStreamCategoryID("0");
        liveStreamCategoryIdDBModel.setLiveStreamCategoryName(this.f34987d.getResources().getString(j.f13426x));
        liveStreamCategoryIdDBModel2.setLiveStreamCategoryID("-1");
        liveStreamCategoryIdDBModel2.setLiveStreamCategoryName(this.f34987d.getResources().getString(j.f13209b2));
        int uncatCount = this.f34924H.getUncatCount("-2", "live");
        this.f34943N0 = uncatCount;
        if (uncatCount != 0 && uncatCount > 0) {
            liveStreamCategoryIdDBModel3.setLiveStreamCategoryID("-2");
            liveStreamCategoryIdDBModel3.setLiveStreamCategoryName(this.f34987d.getResources().getString(j.f13215b8));
            ArrayList arrayList = this.f35011j0;
            arrayList.add(arrayList.size(), liveStreamCategoryIdDBModel3);
        }
        this.f34924H.getParentalStatusCount(SharepreferenceDBHandler.getUserID(this.f34987d));
        this.f35007i0 = Q1();
        stringExtra2.hashCode();
        if (stringExtra2.equals("0")) {
            this.f35055u0 = "0";
        } else if (stringExtra2.equals("-1")) {
            this.f35055u0 = "-1";
        } else {
            this.f35055u0 = stringExtra2;
        }
        this.f34958S0.setEPGHandler(this.f34916E0);
        this.f34958S0.setContext(this.f34987d);
        this.f34985c1 = Long.valueOf(S1(this.f34987d));
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            if (this.f34958S0 != null) {
                e2();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        View view;
        StringBuilder sb;
        boolean z9 = keyEvent.getRepeatCount() == 0;
        if (i9 != 62) {
            if (i9 != 66) {
                if (i9 != 79) {
                    if (i9 == 82) {
                        Menu menu = this.f34949P0;
                        if (menu != null) {
                            menu.performIdentifierAction(f.f12239P2, 0);
                        }
                        return true;
                    }
                    if (i9 != 85) {
                        if (i9 != 86) {
                            if (i9 == 126) {
                                if (z9 && !this.f34958S0.isPlaying()) {
                                    this.f34958S0.start();
                                    this.f34998g.requestFocus();
                                }
                                return true;
                            }
                            if (i9 != 127) {
                                switch (i9) {
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                                    case 16:
                                        String str = this.f35048s1;
                                        if (str != null && str.equals("false") && this.f35035p0 && !SharepreferenceDBHandler.getCurrentAPPType(this.f34987d).equals("stalker_api")) {
                                            this.f34919F0.removeCallbacksAndMessages(null);
                                            int i10 = 7;
                                            if (i9 == 7) {
                                                this.f34934K0.append(0);
                                            } else if (i9 == 8) {
                                                this.f34934K0.append(1);
                                            } else {
                                                if (i9 == 9) {
                                                    sb = this.f34934K0;
                                                    i10 = 2;
                                                } else if (i9 == 10) {
                                                    sb = this.f34934K0;
                                                    i10 = 3;
                                                } else if (i9 == 11) {
                                                    sb = this.f34934K0;
                                                    i10 = 4;
                                                } else if (i9 == 12) {
                                                    sb = this.f34934K0;
                                                    i10 = 5;
                                                } else if (i9 == 13) {
                                                    sb = this.f34934K0;
                                                    i10 = 6;
                                                } else if (i9 == 14) {
                                                    sb = this.f34934K0;
                                                } else if (i9 == 15) {
                                                    this.f34934K0.append(8);
                                                } else if (i9 == 16) {
                                                    this.f34934K0.append(9);
                                                }
                                                sb.append(i10);
                                            }
                                            this.f34940M0.setText(this.f34934K0.toString());
                                            this.f34937L0.setVisibility(0);
                                            this.f34919F0.postDelayed(new b(), 3000L);
                                        }
                                        return true;
                                    default:
                                        switch (i9) {
                                            case 19:
                                            case 20:
                                            case 21:
                                            case 22:
                                                i2();
                                                H1(5000);
                                                return true;
                                            case 23:
                                                break;
                                            default:
                                                return super.onKeyUp(i9, keyEvent);
                                        }
                                        break;
                                }
                            }
                        }
                        if (z9 && this.f34958S0.isPlaying()) {
                            this.f34958S0.pause();
                            this.f34994f.requestFocus();
                        }
                        return true;
                    }
                }
            }
            if (!this.f35035p0) {
                return true;
            }
            NSTIJKPlayerEPG nSTIJKPlayerEPG = this.f34958S0;
            if (nSTIJKPlayerEPG == null || !nSTIJKPlayerEPG.getPlayerIsPrepared()) {
                j2();
            } else if (this.f34968V1.getVisibility() == 8) {
                j2();
                (this.f34958S0.isPlaying() ? this.f34982a2 : this.f34980Z1).requestFocus();
            }
            return true;
        }
        if (!z9 || this.f34958S0.isPlaying()) {
            this.f34958S0.pause();
            view = this.f34994f;
        } else {
            this.f34958S0.start();
            view = this.f34998g;
        }
        view.requestFocus();
        return true;
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            r3 = this;
            super.onResume()
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG r0 = r3.f34958S0
            if (r0 == 0) goto La
            r3.Y1()
        La:
            java.lang.String r0 = r3.f35055u0
            java.lang.String r1 = ""
            if (r0 == 0) goto L39
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L39
            java.lang.String r0 = r3.f35055u0
            java.lang.String r2 = "0"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L39
            r3.E1()
            java.util.ArrayList r0 = r3.f34978Z
            if (r0 == 0) goto L35
            int r0 = r0.size()
            if (r0 == 0) goto L35
        L2d:
            java.util.ArrayList r0 = r3.f34978Z
            int r1 = r3.f34970W0
            r3.d2(r0, r1)
            goto L6b
        L35:
            r3.b2()
            goto L6b
        L39:
            java.lang.String r0 = r3.f35055u0
            if (r0 == 0) goto L5b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5b
            java.lang.String r0 = r3.f35055u0
            java.lang.String r1 = "-1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5b
            r3.G1()
            java.util.ArrayList r0 = r3.f34978Z
            if (r0 == 0) goto L35
            int r0 = r0.size()
            if (r0 == 0) goto L35
            goto L2d
        L5b:
            java.lang.String r0 = r3.f35055u0
            r3.F1(r0)
            java.util.ArrayList r0 = r3.f34978Z
            if (r0 == 0) goto L35
            int r0 = r0.size()
            if (r0 == 0) goto L35
            goto L2d
        L6b:
            r3.M1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerEPGActivity.onResume():void");
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            NSTIJKPlayerEPG nSTIJKPlayerEPG = this.f34958S0;
            if (nSTIJKPlayerEPG != null) {
                nSTIJKPlayerEPG.h1(Boolean.valueOf(this.f35035p0));
                e2();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i9, int i10, int i11) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public void toggleView(View view) {
        if (view.getVisibility() == 8) {
            view.setVisibility(0);
        } else if (view.getVisibility() == 0) {
            view.setVisibility(8);
        }
    }
}
