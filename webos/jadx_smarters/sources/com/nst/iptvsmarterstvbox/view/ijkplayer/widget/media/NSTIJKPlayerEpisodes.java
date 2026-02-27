package com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media;

import a7.e;
import a7.f;
import a7.g;
import a7.k;
import android.R;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.StrictMode;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.Constants;
import com.nst.iptvsmarterstvbox.model.EpisodesUsingSinglton;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.callback.GetEpisdoeDetailsCallback;
import com.nst.iptvsmarterstvbox.model.callback.VodInfoCallback;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.PlayerResumeDBHandler;
import com.nst.iptvsmarterstvbox.model.database.RecentWatchDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SeriesRecentWatchDatabase;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.pojo.PanelAvailableChannelsPojo;
import com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import j1.AbstractC2074a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import m1.C2219a;
import m7.AbstractC2237a;
import n7.l;
import o1.C2305a;
import o7.C2368a;
import okhttp3.OkHttpClient;
import okhttp3.internal.ws.WebSocketProtocol;
import org.achartengine.renderer.DefaultRenderer;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.protocol.HttpRequestExecutor;
import org.chromium.net.UrlRequest;
import org.joda.time.DateTimeConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p1.InterfaceC2389c;
import p7.C2509z0;
import q7.c0;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.player.IjkTimedText;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;
import tv.danmaku.ijk.media.player.misc.IjkMediaFormat;
import u7.C2858a;
import v7.AbstractServiceC2895a;
import w7.AbstractC2941e;
import w7.C2937a;
import w7.C2939c;
import w7.InterfaceC2938b;
import w7.j;
import x7.C2966a;
import z7.n;

/* JADX INFO: loaded from: classes4.dex */
public class NSTIJKPlayerEpisodes extends FrameLayout implements MediaController.MediaPlayerControl, n, View.OnClickListener {

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public static TextView f36393s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public static ProgressBar f36394t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public static List f36395u3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public static SharedPreferences f36399y3;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f36400A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public boolean f36401A0;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public SharedPreferences.Editor f36402A1;

    /* JADX INFO: renamed from: A2, reason: collision with root package name */
    public RelativeLayout f36403A2;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f36404B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f36405B0;

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public SharedPreferences.Editor f36406B1;

    /* JADX INFO: renamed from: B2, reason: collision with root package name */
    public Animation f36407B2;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public AlertDialog f36408C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public Handler f36409C0;

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public int f36410C1;

    /* JADX INFO: renamed from: C2, reason: collision with root package name */
    public LinearLayout f36411C2;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f36412D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public Handler f36413D0;

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    public boolean f36414D1;

    /* JADX INFO: renamed from: D2, reason: collision with root package name */
    public LinearLayout f36415D2;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f36416E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f36417E0;

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public boolean f36418E1;

    /* JADX INFO: renamed from: E2, reason: collision with root package name */
    public Animation f36419E2;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public SharedPreferences f36420F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public boolean f36421F0;

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public SeriesRecentWatchDatabase f36422F1;

    /* JADX INFO: renamed from: F2, reason: collision with root package name */
    public Animation f36423F2;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public SharedPreferences.Editor f36424G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f36425G0;

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    public int f36426G1;

    /* JADX INFO: renamed from: G2, reason: collision with root package name */
    public SharedPreferences f36427G2;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public SharedPreferences f36428H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f36429H0;

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    public TextView f36430H1;

    /* JADX INFO: renamed from: H2, reason: collision with root package name */
    public RelativeLayout f36431H2;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public StringBuilder f36432I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public SharedPreferences f36433I0;

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    public TextView f36434I1;

    /* JADX INFO: renamed from: I2, reason: collision with root package name */
    public boolean f36435I2;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Formatter f36436J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public Context f36437J0;

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    public LinearLayout f36438J1;

    /* JADX INFO: renamed from: J2, reason: collision with root package name */
    public boolean f36439J2;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public SharedPreferences.Editor f36440K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public C2858a f36441K0;

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    public boolean f36442K1;

    /* JADX INFO: renamed from: K2, reason: collision with root package name */
    public int f36443K2;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f36444L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public int f36445L0;

    /* JADX INFO: renamed from: L1, reason: collision with root package name */
    public TextView f36446L1;

    /* JADX INFO: renamed from: L2, reason: collision with root package name */
    public boolean f36447L2;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String f36448M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public int f36449M0;

    /* JADX INFO: renamed from: M1, reason: collision with root package name */
    public TextView f36450M1;

    /* JADX INFO: renamed from: M2, reason: collision with root package name */
    public IMediaPlayer.OnBufferingUpdateListener f36451M2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ArrayList f36452N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public IMediaPlayer.OnVideoSizeChangedListener f36453N0;

    /* JADX INFO: renamed from: N1, reason: collision with root package name */
    public TextView f36454N1;

    /* JADX INFO: renamed from: N2, reason: collision with root package name */
    public IMediaPlayer.OnSeekCompleteListener f36455N2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public l f36456O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public C2939c f36457O0;

    /* JADX INFO: renamed from: O1, reason: collision with root package name */
    public RadioGroup f36458O1;

    /* JADX INFO: renamed from: O2, reason: collision with root package name */
    public boolean f36459O2;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public LinearLayout f36460P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public long f36461P0;

    /* JADX INFO: renamed from: P1, reason: collision with root package name */
    public RadioGroup f36462P1;

    /* JADX INFO: renamed from: P2, reason: collision with root package name */
    public IMediaPlayer.OnTimedTextListener f36463P2;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public LinearLayout f36464Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public long f36465Q0;

    /* JADX INFO: renamed from: Q1, reason: collision with root package name */
    public RadioGroup f36466Q1;

    /* JADX INFO: renamed from: Q2, reason: collision with root package name */
    public int f36467Q2;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public String f36468R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public long f36469R0;

    /* JADX INFO: renamed from: R1, reason: collision with root package name */
    public SharedPreferences.Editor f36470R1;

    /* JADX INFO: renamed from: R2, reason: collision with root package name */
    public int f36471R2;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public M f36472S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public IMediaPlayer.OnPreparedListener f36473S0;

    /* JADX INFO: renamed from: S1, reason: collision with root package name */
    public TextView f36474S1;

    /* JADX INFO: renamed from: S2, reason: collision with root package name */
    public List f36475S2;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public String f36476T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public long f36477T0;

    /* JADX INFO: renamed from: T1, reason: collision with root package name */
    public TextView f36478T1;

    /* JADX INFO: renamed from: T2, reason: collision with root package name */
    public int f36479T2;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public long f36480U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public Activity f36481U0;

    /* JADX INFO: renamed from: U1, reason: collision with root package name */
    public TextView f36482U1;

    /* JADX INFO: renamed from: U2, reason: collision with root package name */
    public int f36483U2;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Uri f36484V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public NSTIJKPlayerEpisodes f36485V0;

    /* JADX INFO: renamed from: V1, reason: collision with root package name */
    public ProgressBar f36486V1;

    /* JADX INFO: renamed from: V2, reason: collision with root package name */
    public boolean f36487V2;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public String f36488W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public AudioManager f36489W0;

    /* JADX INFO: renamed from: W1, reason: collision with root package name */
    public LinearLayout f36490W1;

    /* JADX INFO: renamed from: W2, reason: collision with root package name */
    public Runnable f36491W2;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public int f36492X0;

    /* JADX INFO: renamed from: X1, reason: collision with root package name */
    public FrameLayout f36493X1;

    /* JADX INFO: renamed from: X2, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f36494X2;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public float f36495Y0;

    /* JADX INFO: renamed from: Y1, reason: collision with root package name */
    public androidx.appcompat.app.a f36496Y1;

    /* JADX INFO: renamed from: Y2, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f36497Y2;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public GestureDetector f36498Z0;

    /* JADX INFO: renamed from: Z1, reason: collision with root package name */
    public SeekBar f36499Z1;

    /* JADX INFO: renamed from: Z2, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f36500Z2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f36501a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f36502a1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public SeekBar f36503a2;

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public Handler f36504a3;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public View f36505b1;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public LinearLayout f36506b2;

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    public boolean f36507b3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36508c;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public P f36509c1;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public Handler f36510c2;

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    public int f36511c3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f36512d;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public Button f36513d1;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public Runnable f36514d2;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public int f36515d3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36516e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Map f36517e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public Boolean f36518e1;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public Handler f36519e2;

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    public IMediaPlayer.OnCompletionListener f36520e3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36521f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public List f36522f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public Boolean f36523f1;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public Handler f36524f2;

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    public IMediaPlayer.OnInfoListener f36525f3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f36526g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f36527g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public Boolean f36528g1;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public boolean f36529g2;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public IMediaPlayer.OnErrorListener f36530g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f36531h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f36532h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public Boolean f36533h1;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public Animation f36534h2;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public a.InterfaceC0291a f36535h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f36536i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public a.b f36537i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public Boolean f36538i1;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public Animation f36539i2;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public int f36540i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f36541j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f36542j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public Boolean f36543j1;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public final View.OnClickListener f36544j2;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public boolean f36545j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f36546k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f36547k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public SeekBar f36548k1;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public TextView f36549k2;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public TextView f36550k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f36551l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f36552l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public TextView f36553l1;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public TextView f36554l2;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public ProgressBar f36555l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f36556m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f36557m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public TextView f36558m1;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public LinearLayout f36559m2;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public RecyclerView f36560m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f36561n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f36562n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public SharedPreferences f36563n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public LinearLayout f36564n2;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public TextView f36565n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f36566o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public IMediaPlayer.OnCompletionListener f36567o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public RecentWatchDBHandler f36568o1;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public int f36569o2;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public int f36570o3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f36571p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public IMediaPlayer.OnPreparedListener f36572p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public LiveStreamDBHandler f36573p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public TextView f36574p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public TextView f36575p3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f36576q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f36577q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public PlayerResumeDBHandler f36578q1;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public TextView f36579q2;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public View f36580q3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f36581r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public IMediaPlayer.OnErrorListener f36582r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public int f36583r1;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public LinearLayout f36584r2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C2509z0 f36585s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public IMediaPlayer.OnInfoListener f36586s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public String f36587s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public String f36588s2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RelativeLayout f36589t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f36590t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public String f36591t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public String f36592t2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ImageView f36593u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f36594u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public SharedPreferences f36595u1;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public TextView f36596u2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f36597v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f36598v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public SharedPreferences f36599v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public TextView f36600v2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Handler f36601w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f36602w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public SharedPreferences f36603w1;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public FrameLayout f36604w2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Runnable f36605x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f36606x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public SharedPreferences f36607x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public FrameLayout f36608x2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Handler f36609y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public long f36610y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public SharedPreferences f36611y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public Animation f36612y2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Runnable f36613z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f36614z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public SharedPreferences.Editor f36615z1;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public Animation f36616z2;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public static final int[] f36392r3 = {0, 1, 2, 3, 4, 5};

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public static int f36396v3 = 0;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public static Handler f36397w3 = new Handler();

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public static IMediaPlayer f36398x3 = null;

    public class A implements InterfaceC2389c {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ArrayList f36618a;

            /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$A$a$a, reason: collision with other inner class name */
            public class RunnableC0290a implements Runnable {
                public RunnableC0290a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    NSTIJKPlayerEpisodes.this.f36560m3.setVisibility(0);
                    if (a.this.f36618a.size() > 0) {
                        NSTIJKPlayerEpisodes.this.f36555l3.setVisibility(8);
                        NSTIJKPlayerEpisodes.this.f36565n3.setVisibility(8);
                    }
                    NSTIJKPlayerEpisodes.f36394t3.setVisibility(8);
                }
            }

            public a(ArrayList arrayList) {
                this.f36618a = arrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTIJKPlayerEpisodes.this.f36481U0.runOnUiThread(new RunnableC0290a());
            }
        }

        public A() {
        }

        @Override // p1.InterfaceC2389c
        public void a(JSONObject jSONObject) {
            JSONArray jSONArray;
            JSONArray jSONArray2;
            String str;
            String str2;
            String str3;
            String str4;
            String str5 = "it";
            String str6 = "DUTCH";
            String str7 = "FRENCH";
            NSTIJKPlayerEpisodes.this.f36545j3 = true;
            NSTIJKPlayerEpisodes.this.f36540i3 = 0;
            NSTIJKPlayerEpisodes.this.f36555l3.setVisibility(0);
            try {
                HashSet hashSet = new HashSet();
                try {
                    JSONObject jSONObject2 = new JSONObject(String.valueOf(jSONObject));
                    if (!jSONObject2.has("data") || jSONObject2.isNull("data") || (jSONArray = jSONObject2.getJSONArray("data")) == null || jSONArray.length() <= 0) {
                        Toast.makeText(NSTIJKPlayerEpisodes.this.f36437J0, "No subtitle found.. ", 0).show();
                        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                        nSTIJKPlayerEpisodes.w2("");
                        return;
                    }
                    int i9 = 0;
                    while (i9 < jSONArray.length()) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i9).getJSONObject("attributes");
                        String string = jSONObject3.getString(IjkMediaMeta.IJKM_KEY_LANGUAGE);
                        Log.i("OutletName", jSONObject3.getString(IjkMediaMeta.IJKM_KEY_LANGUAGE));
                        String string2 = jSONObject3.getString(IjkMediaMeta.IJKM_KEY_LANGUAGE);
                        if (string.equals("en")) {
                            string2 = "English";
                        } else if (string.equals("ar")) {
                            hashSet.add("ARABIC");
                            string2 = "ARABIC";
                        } else if (string.equals("fr")) {
                            hashSet.add(str7);
                            string2 = str7;
                        } else if (string.equals("nl")) {
                            hashSet.add(str6);
                            string2 = str6;
                        } else if (string.equals("hr")) {
                            string2 = "CROTIAN";
                        } else if (string.equals("pt-BR")) {
                            string2 = "PORTUGESE (BRAZIL)";
                        } else if (string.equals("es")) {
                            string2 = "SPANISH";
                        } else if (string.equals("pt-PT")) {
                            string2 = "PORTUGESE";
                        } else if (string.equals("zh-CN")) {
                            string2 = "CHINESE";
                        } else if (string.equals("ro")) {
                            string2 = "ROMANIAN";
                        } else if (string.equals("cs")) {
                            string2 = "CZECH";
                        } else if (string.equals("sv")) {
                            string2 = "SWEDISH";
                        } else if (string.equals("el")) {
                            string2 = "GREEK";
                        } else if (string.equals(str5)) {
                            string2 = "ITALIAN";
                        } else if (string.equals("fi")) {
                            string2 = "Finnish";
                        } else if (string.equals("he")) {
                            string2 = "Hebrew";
                        } else if (string.equals("tr")) {
                            string2 = "Turkish";
                        } else if (string.equals("sr")) {
                            string2 = "Serbian";
                        } else if (string.equals("hu")) {
                            string2 = "Hungarian";
                        } else if (string.equals("ms")) {
                            string2 = "Malay";
                        } else if (string.equals("bg")) {
                            string2 = "Bulgarian";
                        } else if (string.equals("pl")) {
                            string2 = "Polish";
                        } else if (string.equals("de")) {
                            string2 = "German";
                        } else if (string.equals("vi")) {
                            string2 = "Vietnamese";
                        } else if (string.equals("ja")) {
                            string2 = "JAPANESE";
                        } else if (string.equals("ru")) {
                            string2 = "RUSSIAN";
                        } else if (string.equals("bs")) {
                            string2 = "BOSNIAN";
                        } else if (string.equals(str5)) {
                            string2 = "ITALIAN";
                        } else if (string.equals("zh-TW")) {
                            string2 = "MANARIN CHINESE";
                        } else if (string.equals("tl")) {
                            string2 = "TAGALOG";
                        } else if (string.equals("ko")) {
                            string2 = "KOREAN";
                        } else if (string.equals("no")) {
                            string2 = "NORWEGIAN";
                        } else if (string.equals("th")) {
                            string2 = "THAI";
                        } else if (string.equals("da")) {
                            string2 = "DANISH";
                        } else if (string.equals("uk")) {
                            string2 = "UKRAINIAN";
                        }
                        jSONObject3.getString("release");
                        int i10 = jSONObject3.getInt("download_count");
                        try {
                            jSONArray2 = jSONObject3.getJSONArray("files");
                        } catch (JSONException e9) {
                            e9.printStackTrace();
                            jSONArray2 = null;
                        }
                        String str8 = str5;
                        if (jSONArray2 != null) {
                            int i11 = 0;
                            while (i11 < jSONArray2.length()) {
                                JSONObject jSONObject4 = jSONArray2.getJSONObject(i11);
                                if (jSONObject4 != null) {
                                    str3 = str6;
                                    try {
                                        str4 = str7;
                                        try {
                                            NSTIJKPlayerEpisodes.this.f36404B = jSONObject4.getInt("file_id");
                                        } catch (Exception unused) {
                                        }
                                    } catch (Exception unused2) {
                                        str4 = str7;
                                    }
                                    i11++;
                                    str6 = str3;
                                    str7 = str4;
                                } else {
                                    str3 = str6;
                                }
                                str4 = str7;
                                i11++;
                                str6 = str3;
                                str7 = str4;
                            }
                            str = str6;
                            str2 = str7;
                            C2368a c2368a = new C2368a();
                            c2368a.e(string2);
                            c2368a.f(NSTIJKPlayerEpisodes.this.f36404B);
                            c2368a.d(i10);
                            c2368a.g(NSTIJKPlayerEpisodes.this.f36404B);
                            NSTIJKPlayerEpisodes.this.f36522f0.add(c2368a);
                        } else {
                            str = str6;
                            str2 = str7;
                        }
                        i9++;
                        str5 = str8;
                        str6 = str;
                        str7 = str2;
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    int i12 = -1;
                    for (int i13 = 0; i13 < NSTIJKPlayerEpisodes.this.f36522f0.size(); i13++) {
                        if (arrayList.contains(((C2368a) NSTIJKPlayerEpisodes.this.f36522f0.get(i13)).b())) {
                            int i14 = 0;
                            while (true) {
                                if (i14 >= arrayList.size()) {
                                    break;
                                }
                                if (((String) arrayList.get(i14)).equals(((C2368a) NSTIJKPlayerEpisodes.this.f36522f0.get(i14)).b())) {
                                    i12 = i14;
                                    break;
                                }
                                i14++;
                            }
                            if (((C2368a) NSTIJKPlayerEpisodes.this.f36522f0.get(i13)).a() > ((Integer) arrayList2.get(i12)).intValue()) {
                                arrayList3.remove(i12);
                                arrayList3.add(i12, (C2368a) NSTIJKPlayerEpisodes.this.f36522f0.get(i13));
                            }
                        } else {
                            arrayList.add(((C2368a) NSTIJKPlayerEpisodes.this.f36522f0.get(i13)).b());
                            arrayList2.add(Integer.valueOf(((C2368a) NSTIJKPlayerEpisodes.this.f36522f0.get(i13)).a()));
                            arrayList3.add((C2368a) NSTIJKPlayerEpisodes.this.f36522f0.get(i13));
                        }
                    }
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        Log.e("final", "language: " + ((C2368a) arrayList3.get(i15)).b());
                        Log.e("final", "count: " + ((C2368a) arrayList3.get(i15)).a());
                    }
                    c0 c0Var = new c0(NSTIJKPlayerEpisodes.this.f36437J0, arrayList3);
                    NSTIJKPlayerEpisodes.this.f36560m3.setLayoutManager(new LinearLayoutManager(NSTIJKPlayerEpisodes.this.f36437J0));
                    NSTIJKPlayerEpisodes.this.f36560m3.setAdapter(c0Var);
                    NSTIJKPlayerEpisodes.this.f36560m3.setVisibility(8);
                    new Handler().postDelayed(new a(arrayList3), 5000L);
                    c0Var.n0(new c0.b() { // from class: w7.i
                        @Override // q7.c0.b
                        public final void a(int i16, C2368a c2368a2) {
                            this.f51709a.f(i16, c2368a2);
                        }
                    });
                } catch (JSONException e10) {
                    NSTIJKPlayerEpisodes.this.w2(String.valueOf(e10));
                    e10.printStackTrace();
                }
            } catch (Exception e11) {
                NSTIJKPlayerEpisodes.this.w2("");
                e11.printStackTrace();
            }
        }

        @Override // p1.InterfaceC2389c
        public void b(C2219a c2219a) {
            if (NSTIJKPlayerEpisodes.this.f36545j3) {
                return;
            }
            NSTIJKPlayerEpisodes.M1(NSTIJKPlayerEpisodes.this);
            if (NSTIJKPlayerEpisodes.this.f36540i3 <= 5) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: w7.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f51708a.e();
                    }
                }, 500L);
            } else {
                NSTIJKPlayerEpisodes.this.w2(String.valueOf(c2219a));
            }
        }

        public final /* synthetic */ void e() {
            NSTIJKPlayerEpisodes.this.i3(false);
        }

        public final /* synthetic */ void f(int i9, C2368a c2368a) {
            try {
                NSTIJKPlayerEpisodes.this.f36404B = c2368a.c();
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                nSTIJKPlayerEpisodes.f36428H = nSTIJKPlayerEpisodes.f36437J0.getSharedPreferences("allowedFormatsubtitle", 0);
                String string = NSTIJKPlayerEpisodes.this.f36428H.getString("allowedFormatsubtitle", "vip");
                NSTIJKPlayerEpisodes.f36394t3.setVisibility(0);
                NSTIJKPlayerEpisodes.this.f36408C.dismiss();
                if (string.equals(CookieSpecs.DEFAULT)) {
                    Toast.makeText(NSTIJKPlayerEpisodes.this.f36437J0, "Please wait..", 0).show();
                    NSTIJKPlayerEpisodes.this.h2(true);
                } else {
                    Toast.makeText(NSTIJKPlayerEpisodes.this.f36437J0, "Please wait..", 0).show();
                    NSTIJKPlayerEpisodes.this.p3(true);
                }
            } catch (Exception e9) {
                NSTIJKPlayerEpisodes.this.w2(String.valueOf(e9));
                e9.printStackTrace();
            }
        }
    }

    public class B implements Runnable {
        public B() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerEpisodes.this.h2(false);
        }
    }

    public class C implements Runnable {
        public C() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerEpisodes.this.p3(false);
        }
    }

    public class D implements DialogInterface.OnClickListener {
        public D() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes;
            String str;
            switch (i9) {
                case 0:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "10";
                    break;
                case 1:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "12";
                    break;
                case 2:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "14";
                    break;
                case 3:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "16";
                    break;
                case 4:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "18";
                    break;
                case 5:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "20";
                    break;
                case 6:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "22";
                    break;
                case 7:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "24";
                    break;
                case 8:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "26";
                    break;
                case 9:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "28";
                    break;
                case 10:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "30";
                    break;
                case 11:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "32";
                    break;
                case 12:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "34";
                    break;
                case 13:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "36";
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "38";
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "40";
                    break;
                default:
                    return;
            }
            nSTIJKPlayerEpisodes.k3(str);
            NSTIJKPlayerEpisodes.this.f36474S1.setText(str);
            dialogInterface.cancel();
        }
    }

    public class E implements DialogInterface.OnDismissListener {
        public E() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    public class F implements View.OnClickListener {
        public F() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getId() == M8.c.f5225b || view.getId() == f.f12164H7) {
                NSTIJKPlayerEpisodes.this.A2();
            } else if (view.getId() == f.f12088A1) {
                NSTIJKPlayerEpisodes.this.m2();
            }
        }
    }

    public class G implements IMediaPlayer.OnBufferingUpdateListener {
        public G() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i9) {
            NSTIJKPlayerEpisodes.this.f36577q0 = i9;
        }
    }

    public class H implements IMediaPlayer.OnSeekCompleteListener {
        public H() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerEpisodes.this.f36477T0 = System.currentTimeMillis();
            NSTIJKPlayerEpisodes.this.f36457O0.o(NSTIJKPlayerEpisodes.this.f36477T0 - NSTIJKPlayerEpisodes.this.f36469R0);
        }
    }

    public class I implements IMediaPlayer.OnTimedTextListener {
        public I() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            TextView textView;
            if (!NSTIJKPlayerEpisodes.this.f36459O2) {
                NSTIJKPlayerEpisodes.this.f36478T1.setVisibility(8);
                NSTIJKPlayerEpisodes.this.f36446L1.setVisibility(8);
                NSTIJKPlayerEpisodes.this.f36531h.setVisibility(8);
                NSTIJKPlayerEpisodes.this.f36501a.setVisibility(8);
                NSTIJKPlayerEpisodes.f36393s3.setVisibility(8);
                NSTIJKPlayerEpisodes.this.f36501a.setText("");
                NSTIJKPlayerEpisodes.f36393s3.setText("");
                NSTIJKPlayerEpisodes.this.f36531h.setText("");
                return;
            }
            if (ijkTimedText == null) {
                NSTIJKPlayerEpisodes.this.f36478T1.setVisibility(0);
                NSTIJKPlayerEpisodes.this.f36531h.setVisibility(8);
                return;
            }
            if (!NSTIJKPlayerEpisodes.this.getShowOrHideSubtitles()) {
                NSTIJKPlayerEpisodes.this.f36478T1.setVisibility(8);
                NSTIJKPlayerEpisodes.this.f36446L1.setVisibility(8);
                NSTIJKPlayerEpisodes.this.f36531h.setVisibility(8);
                NSTIJKPlayerEpisodes.this.f36501a.setVisibility(8);
                NSTIJKPlayerEpisodes.f36393s3.setVisibility(8);
                Log.e("jaskirat", "subtitle gone 3");
                return;
            }
            String strReplace = ijkTimedText.getText().replace("{\\b1}", "").replace("{\\b0}", "").replace("{\\i1}", "").replace("{\\i0}", "").replace("{\\c}", "");
            StringBuilder sb = new StringBuilder();
            try {
                if (strReplace.contains("{")) {
                    for (String strSubstring : strReplace.split("\\{")) {
                        if (strSubstring.contains("}")) {
                            strSubstring = strSubstring.substring(strSubstring.lastIndexOf("}") + 1);
                        }
                        sb.append(strSubstring);
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            SharedPreferences unused = NSTIJKPlayerEpisodes.f36399y3 = NSTIJKPlayerEpisodes.this.f36437J0.getSharedPreferences("pref.using_sub_font_size", 0);
            String string = NSTIJKPlayerEpisodes.f36399y3.getString("pref.using_sub_font_size", AbstractC2237a.f44547x0);
            try {
                NSTIJKPlayerEpisodes.this.f36501a.setTextSize(2, Float.parseFloat(string));
                NSTIJKPlayerEpisodes.f36393s3.setTextSize(2, Float.parseFloat(string));
                NSTIJKPlayerEpisodes.this.f36531h.setTextSize(2, Float.parseFloat(string));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (sb.length() > 0) {
                NSTIJKPlayerEpisodes.f36393s3.setText(sb.toString());
                textView = NSTIJKPlayerEpisodes.this.f36531h;
                strReplace = sb.toString();
            } else {
                NSTIJKPlayerEpisodes.this.f36531h.setText(strReplace);
                textView = NSTIJKPlayerEpisodes.f36393s3;
            }
            textView.setText(strReplace);
            NSTIJKPlayerEpisodes.this.f36531h.setVisibility(0);
            NSTIJKPlayerEpisodes.this.f36446L1.setVisibility(0);
            NSTIJKPlayerEpisodes.this.f36478T1.setVisibility(0);
            NSTIJKPlayerEpisodes.this.f36501a.setVisibility(0);
            NSTIJKPlayerEpisodes.f36393s3.setVisibility(0);
        }
    }

    public class J implements Runnable {
        public J() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                long currentPosition = NSTIJKPlayerEpisodes.f36398x3.getCurrentPosition();
                if (NSTIJKPlayerEpisodes.f36395u3 == null) {
                    NSTIJKPlayerEpisodes.this.f36501a.setText("");
                    if (NSTIJKPlayerEpisodes.this.f36501a.getVisibility() == 0) {
                        NSTIJKPlayerEpisodes.this.f36501a.setVisibility(8);
                    }
                } else if (NSTIJKPlayerEpisodes.f36396v3 < NSTIJKPlayerEpisodes.f36395u3.size()) {
                    j jVar = (j) NSTIJKPlayerEpisodes.f36395u3.get(NSTIJKPlayerEpisodes.f36396v3);
                    if (currentPosition >= jVar.b() && currentPosition <= jVar.a()) {
                        String string = NSTIJKPlayerEpisodes.f36399y3.getString("pref.using_sub_font_size", AbstractC2237a.f44547x0);
                        String string2 = Html.fromHtml(jVar.c()).toString();
                        NSTIJKPlayerEpisodes.this.f36501a.setTextSize(2, Float.parseFloat(string));
                        NSTIJKPlayerEpisodes.f36393s3.setTextSize(2, Float.parseFloat(string));
                        if (string2.length() > 0) {
                            if (NSTIJKPlayerEpisodes.this.f36501a.getVisibility() == 8) {
                                NSTIJKPlayerEpisodes.this.f36501a.setVisibility(0);
                            }
                            NSTIJKPlayerEpisodes.this.f36501a.setText(string2);
                        }
                    } else if (currentPosition > jVar.a()) {
                        NSTIJKPlayerEpisodes.k0();
                        if (NSTIJKPlayerEpisodes.f36396v3 >= NSTIJKPlayerEpisodes.f36395u3.size()) {
                            String string3 = NSTIJKPlayerEpisodes.f36399y3.getString("pref.using_sub_font_size", AbstractC2237a.f44547x0);
                            NSTIJKPlayerEpisodes.this.f36501a.setTextSize(2, Float.parseFloat(string3));
                            NSTIJKPlayerEpisodes.this.f36501a.setText("");
                            if (NSTIJKPlayerEpisodes.this.f36501a.getVisibility() == 0) {
                                NSTIJKPlayerEpisodes.this.f36501a.setVisibility(8);
                            }
                            NSTIJKPlayerEpisodes.f36393s3.setTextSize(2, Float.parseFloat(string3));
                        }
                    }
                }
            } catch (Exception unused) {
                NSTIJKPlayerEpisodes.this.f36486V1.setVisibility(8);
            }
            NSTIJKPlayerEpisodes.this.f36486V1.setVisibility(8);
            NSTIJKPlayerEpisodes.f36397w3.postDelayed(this, 100L);
        }
    }

    public class K implements SeekBar.OnSeekBarChangeListener {
        public K() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i9, boolean z9) {
            TextView textView;
            Resources resources;
            int i10;
            NSTIJKPlayerEpisodes.this.f36495Y0 = i9;
            int i11 = (int) ((NSTIJKPlayerEpisodes.this.f36495Y0 / 255.0f) * 100.0f);
            if (i11 < 20) {
                textView = NSTIJKPlayerEpisodes.this.f36574p2;
                resources = NSTIJKPlayerEpisodes.this.getResources();
                i10 = e.f12015i0;
            } else if (i11 < 30) {
                textView = NSTIJKPlayerEpisodes.this.f36574p2;
                resources = NSTIJKPlayerEpisodes.this.getResources();
                i10 = e.f12019j0;
            } else if (i11 < 40) {
                textView = NSTIJKPlayerEpisodes.this.f36574p2;
                resources = NSTIJKPlayerEpisodes.this.getResources();
                i10 = e.f12023k0;
            } else if (i11 < 50) {
                textView = NSTIJKPlayerEpisodes.this.f36574p2;
                resources = NSTIJKPlayerEpisodes.this.getResources();
                i10 = e.f12027l0;
            } else if (i11 < 60) {
                textView = NSTIJKPlayerEpisodes.this.f36574p2;
                resources = NSTIJKPlayerEpisodes.this.getResources();
                i10 = e.f12031m0;
            } else if (i11 < 70) {
                textView = NSTIJKPlayerEpisodes.this.f36574p2;
                resources = NSTIJKPlayerEpisodes.this.getResources();
                i10 = e.f12035n0;
            } else {
                textView = NSTIJKPlayerEpisodes.this.f36574p2;
                resources = NSTIJKPlayerEpisodes.this.getResources();
                i10 = e.f12039o0;
            }
            textView.setBackground(resources.getDrawable(i10));
            WindowManager.LayoutParams attributes = NSTIJKPlayerEpisodes.this.f36481U0.getWindow().getAttributes();
            attributes.screenBrightness = NSTIJKPlayerEpisodes.this.f36495Y0 / 255.0f;
            NSTIJKPlayerEpisodes.this.f36441K0.R((int) NSTIJKPlayerEpisodes.this.f36495Y0);
            NSTIJKPlayerEpisodes.this.f36481U0.getWindow().setAttributes(attributes);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerEpisodes.this.c3();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerEpisodes.this.c3();
            NSTIJKPlayerEpisodes.this.Z1(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
        }
    }

    public class L implements SeekBar.OnSeekBarChangeListener {
        public L() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i9, boolean z9) {
            TextView textView;
            Resources resources;
            int i10;
            if (NSTIJKPlayerEpisodes.this.f36489W0 != null) {
                try {
                    NSTIJKPlayerEpisodes.this.f36489W0.setStreamVolume(3, i9, 0);
                    int streamVolume = (int) ((NSTIJKPlayerEpisodes.this.f36489W0.getStreamVolume(3) / NSTIJKPlayerEpisodes.this.f36492X0) * 100.0f);
                    if (streamVolume == 0 || streamVolume < 0) {
                        textView = NSTIJKPlayerEpisodes.this.f36579q2;
                        resources = NSTIJKPlayerEpisodes.this.getResources();
                        i10 = e.f12071w0;
                    } else if (streamVolume < 40) {
                        textView = NSTIJKPlayerEpisodes.this.f36579q2;
                        resources = NSTIJKPlayerEpisodes.this.getResources();
                        i10 = e.f12059t0;
                    } else if (streamVolume < 80) {
                        textView = NSTIJKPlayerEpisodes.this.f36579q2;
                        resources = NSTIJKPlayerEpisodes.this.getResources();
                        i10 = e.f12063u0;
                    } else if (streamVolume < 100) {
                        textView = NSTIJKPlayerEpisodes.this.f36579q2;
                        resources = NSTIJKPlayerEpisodes.this.getResources();
                        i10 = e.f12067v0;
                    } else {
                        textView = NSTIJKPlayerEpisodes.this.f36579q2;
                        resources = NSTIJKPlayerEpisodes.this.getResources();
                        i10 = e.f12067v0;
                    }
                    textView.setBackground(resources.getDrawable(i10));
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerEpisodes.this.c3();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerEpisodes.this.c3();
            NSTIJKPlayerEpisodes.this.Z1(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
        }
    }

    public static abstract class M {
        public abstract void a();

        public abstract void b();
    }

    public class N implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f36632a;

        public N(View view) {
            this.f36632a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f36632a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f36632a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (!z9) {
                if (z9) {
                    return;
                }
                View view2 = this.f36632a;
                if (view2 != null && view2.getTag() != null && this.f36632a.getTag().equals("1") && NSTIJKPlayerEpisodes.this.f36513d1 != null) {
                    NSTIJKPlayerEpisodes.this.f36513d1.setBackgroundResource(e.f12038o);
                }
                a(1.0f);
                b(1.0f);
                return;
            }
            View view3 = this.f36632a;
            if (view3 != null && view3.getTag() != null && this.f36632a.getTag().equals("2")) {
                view.setBackground(NSTIJKPlayerEpisodes.this.getResources().getDrawable(e.f11931K1));
                return;
            }
            float f9 = z9 ? 1.12f : 1.0f;
            a(f9);
            b(f9);
            View view4 = this.f36632a;
            if (view4 == null || view4.getTag() == null || !this.f36632a.getTag().equals("1") || NSTIJKPlayerEpisodes.this.f36513d1 == null) {
                return;
            }
            NSTIJKPlayerEpisodes.this.f36513d1.setBackgroundResource(e.f12010h);
        }
    }

    public class O extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f36634a;

        public O() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (NSTIJKPlayerEpisodes.this.f36485V0 == null) {
                return true;
            }
            if (motionEvent.getX() < NSTIJKPlayerEpisodes.this.f36485V0.getWidth() / 2.0f) {
                NSTIJKPlayerEpisodes.this.I2();
                return true;
            }
            NSTIJKPlayerEpisodes.this.J2();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            this.f36634a = true;
            return super.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            NSTIJKPlayerEpisodes.this.m3();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    public class P {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f36636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f36637b;

        public P(Activity activity) {
            this.f36636a = activity;
        }

        public P a() {
            View view = this.f36637b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        public P b(int i9) {
            this.f36637b = this.f36636a.findViewById(i9);
            return this;
        }

        public P c() {
            View view = this.f36637b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        public P d(CharSequence charSequence) {
            View view = this.f36637b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        public P e() {
            View view = this.f36637b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$a, reason: case insensitive filesystem */
    public class C1499a implements SeekBar.OnSeekBarChangeListener {
        public C1499a() {
        }

        public String a(long j9) {
            int i9 = (int) (j9 / 1000);
            int i10 = i9 % 60;
            int i11 = (i9 / 60) % 60;
            int i12 = i9 / 3600;
            return i12 > 0 ? String.format("%02d:%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i11), Integer.valueOf(i10)) : String.format("%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i10));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i9, boolean z9) {
            if (z9 && NSTIJKPlayerEpisodes.f36398x3 != null) {
                NSTIJKPlayerEpisodes.this.f36509c1.b(f.f12146G).a();
                NSTIJKPlayerEpisodes.this.f36610y0 = (int) (((double) r5.f36485V0.getDuration()) * ((((double) i9) * 1.0d) / 1000.0d));
                a(NSTIJKPlayerEpisodes.this.f36610y0);
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                nSTIJKPlayerEpisodes.f36576q = true;
                nSTIJKPlayerEpisodes.f36504a3.removeMessages(1);
                if (NSTIJKPlayerEpisodes.this.f36485V0.isPlaying()) {
                    NSTIJKPlayerEpisodes.this.f36485V0.pause();
                }
                NSTIJKPlayerEpisodes.this.c3();
                TextView textView = NSTIJKPlayerEpisodes.this.f36553l1;
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = NSTIJKPlayerEpisodes.this;
                textView.setText(nSTIJKPlayerEpisodes2.h3((int) nSTIJKPlayerEpisodes2.f36610y0));
                TextView textView2 = NSTIJKPlayerEpisodes.this.f36558m1;
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes3 = NSTIJKPlayerEpisodes.this;
                textView2.setText(nSTIJKPlayerEpisodes3.h3(nSTIJKPlayerEpisodes3.f36485V0.getDuration()));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
            nSTIJKPlayerEpisodes.f36576q = true;
            nSTIJKPlayerEpisodes.f36504a3.removeMessages(1);
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = NSTIJKPlayerEpisodes.this;
            if (nSTIJKPlayerEpisodes2.f36400A) {
                nSTIJKPlayerEpisodes2.f36489W0.setStreamMute(3, true);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            if (NSTIJKPlayerEpisodes.f36398x3 == null) {
                return;
            }
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
            if (!nSTIJKPlayerEpisodes.f36400A) {
                nSTIJKPlayerEpisodes.f36485V0.seekTo((int) (((double) NSTIJKPlayerEpisodes.this.f36485V0.getDuration()) * ((((double) seekBar.getProgress()) * 1.0d) / 1000.0d)));
            }
            NSTIJKPlayerEpisodes.this.f36485V0.start();
            NSTIJKPlayerEpisodes.this.c3();
            NSTIJKPlayerEpisodes.this.Z1(0);
            NSTIJKPlayerEpisodes.this.f36504a3.removeMessages(1);
            NSTIJKPlayerEpisodes.this.f36489W0.setStreamMute(3, false);
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = NSTIJKPlayerEpisodes.this;
            nSTIJKPlayerEpisodes2.f36576q = false;
            nSTIJKPlayerEpisodes2.f36504a3.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$b, reason: case insensitive filesystem */
    public class HandlerC1500b extends Handler {
        public HandlerC1500b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i9 = message.what;
            if (i9 == 1) {
                NSTIJKPlayerEpisodes.this.O2();
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                if (nSTIJKPlayerEpisodes.f36576q || !nSTIJKPlayerEpisodes.f36614z0) {
                    return;
                }
                NSTIJKPlayerEpisodes.this.f36504a3.sendMessageDelayed(NSTIJKPlayerEpisodes.this.f36504a3.obtainMessage(1), 300L);
                NSTIJKPlayerEpisodes.this.o3();
                return;
            }
            if (i9 == 2) {
                NSTIJKPlayerEpisodes.this.k2(false);
                return;
            }
            if (i9 == 3) {
                if (NSTIJKPlayerEpisodes.this.f36610y0 >= 0) {
                    NSTIJKPlayerEpisodes.this.f36485V0.seekTo((int) NSTIJKPlayerEpisodes.this.f36610y0);
                    NSTIJKPlayerEpisodes.this.f36610y0 = -1L;
                    return;
                }
                return;
            }
            if (i9 != 4) {
                return;
            }
            NSTIJKPlayerEpisodes.this.f36509c1.b(f.f12285U).a();
            NSTIJKPlayerEpisodes.this.f36509c1.b(f.f12552v).a();
            NSTIJKPlayerEpisodes.this.f36509c1.b(f.f12582y).a();
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$c, reason: case insensitive filesystem */
    public class ViewOnTouchListenerC1501c implements View.OnTouchListener {
        public ViewOnTouchListenerC1501c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return motionEvent != null && NSTIJKPlayerEpisodes.this.f36498Z0.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$d, reason: case insensitive filesystem */
    public class RunnableC1502d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f36642a;

        public RunnableC1502d(long j9) {
            this.f36642a = j9;
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity activity;
            StringBuilder sb;
            Resources resources;
            int i9;
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
            nSTIJKPlayerEpisodes.f36516e++;
            nSTIJKPlayerEpisodes.l2();
            if (NSTIJKPlayerEpisodes.this.f36591t1.equals("dfo") || NSTIJKPlayerEpisodes.this.f36591t1.equals("devicedata")) {
                activity = NSTIJKPlayerEpisodes.this.f36481U0;
                sb = new StringBuilder();
                resources = NSTIJKPlayerEpisodes.this.f36481U0.getResources();
                i9 = a7.j.f13207b0;
            } else {
                activity = NSTIJKPlayerEpisodes.this.f36481U0;
                sb = new StringBuilder();
                resources = NSTIJKPlayerEpisodes.this.f36481U0.getResources();
                i9 = a7.j.f13262g5;
            }
            sb.append(resources.getString(i9));
            sb.append(" (");
            sb.append(NSTIJKPlayerEpisodes.this.f36516e);
            sb.append("/");
            sb.append(NSTIJKPlayerEpisodes.this.f36429H0);
            sb.append(")");
            m7.w.P0(activity, sb.toString());
            NSTIJKPlayerEpisodes.this.f36485V0.setProgress(true);
            if (this.f36642a != 0) {
                NSTIJKPlayerEpisodes.this.f36485V0.setCurrentPositionSeekbar((int) this.f36642a);
            }
            NSTIJKPlayerEpisodes.this.x2();
            NSTIJKPlayerEpisodes.this.start();
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$e, reason: case insensitive filesystem */
    public class RunnableC1503e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f36644a;

        public RunnableC1503e(int i9) {
            this.f36644a = i9;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i9 = this.f36644a;
            if (i9 != 0) {
                NSTIJKPlayerEpisodes.this.e2(i9);
            }
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$f, reason: case insensitive filesystem */
    public class ViewOnClickListenerC1504f implements View.OnClickListener {
        public ViewOnClickListenerC1504f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerEpisodes.this.m2();
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$g, reason: case insensitive filesystem */
    public class ViewOnClickListenerC1505g implements View.OnClickListener {
        public ViewOnClickListenerC1505g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerEpisodes.this.A2();
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$h, reason: case insensitive filesystem */
    public class ViewOnClickListenerC1506h implements View.OnClickListener {
        public ViewOnClickListenerC1506h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerEpisodes.this.A2();
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$i, reason: case insensitive filesystem */
    public class RunnableC1507i implements Runnable {
        public RunnableC1507i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerEpisodes.this.o2();
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$j, reason: case insensitive filesystem */
    public class RunnableC1508j implements Runnable {
        public RunnableC1508j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerEpisodes.this.n2();
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$k, reason: case insensitive filesystem */
    public class C1509k implements IMediaPlayer.OnVideoSizeChangedListener {
        public C1509k() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i9, int i10, int i11, int i12) {
            NSTIJKPlayerEpisodes.this.f36542j0 = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerEpisodes.this.f36547k0 = iMediaPlayer.getVideoHeight();
            NSTIJKPlayerEpisodes.this.f36445L0 = iMediaPlayer.getVideoSarNum();
            NSTIJKPlayerEpisodes.this.f36449M0 = iMediaPlayer.getVideoSarDen();
            if (NSTIJKPlayerEpisodes.this.f36542j0 == 0 || NSTIJKPlayerEpisodes.this.f36547k0 == 0) {
                return;
            }
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
            a aVar = nSTIJKPlayerEpisodes.f36526g;
            if (aVar != null) {
                aVar.c(nSTIJKPlayerEpisodes.f36542j0, NSTIJKPlayerEpisodes.this.f36547k0);
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = NSTIJKPlayerEpisodes.this;
                nSTIJKPlayerEpisodes2.f36526g.a(nSTIJKPlayerEpisodes2.f36445L0, NSTIJKPlayerEpisodes.this.f36449M0);
            }
            NSTIJKPlayerEpisodes.this.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$l, reason: case insensitive filesystem */
    public class RunnableC1510l implements Runnable {
        public RunnableC1510l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView;
            String str;
            if (NSTIJKPlayerEpisodes.this.f36485V0.getCurrentPosition() + NSTIJKPlayerEpisodes.this.f36569o2 > 0) {
                NSTIJKPlayerEpisodes.this.f36485V0.seekTo(NSTIJKPlayerEpisodes.this.f36485V0.getCurrentPosition() + NSTIJKPlayerEpisodes.this.f36569o2);
            } else {
                NSTIJKPlayerEpisodes.this.f36485V0.seekTo(0);
            }
            NSTIJKPlayerEpisodes.this.f36569o2 = 0;
            NSTIJKPlayerEpisodes.this.f36608x2.startAnimation(NSTIJKPlayerEpisodes.this.f36539i2);
            NSTIJKPlayerEpisodes.this.f36608x2.setVisibility(8);
            if (NSTIJKPlayerEpisodes.this.f36592t2 == null || !NSTIJKPlayerEpisodes.this.f36592t2.equals("catch_up")) {
                textView = NSTIJKPlayerEpisodes.this.f36549k2;
                str = "-10s";
            } else {
                textView = NSTIJKPlayerEpisodes.this.f36549k2;
                str = "-60s";
            }
            textView.setText(str);
            if (NSTIJKPlayerEpisodes.this.f36506b2.getVisibility() == 8) {
                NSTIJKPlayerEpisodes.this.f36549k2.startAnimation(NSTIJKPlayerEpisodes.this.f36539i2);
                NSTIJKPlayerEpisodes.this.f36549k2.setVisibility(8);
            }
            NSTIJKPlayerEpisodes.this.Z1(1000);
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$m, reason: case insensitive filesystem */
    public class RunnableC1511m implements Runnable {
        public RunnableC1511m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerEpisodes.this.f36485V0.seekTo((int) (((double) NSTIJKPlayerEpisodes.this.f36485V0.getDuration()) * ((((double) NSTIJKPlayerEpisodes.this.f36548k1.getProgress()) * 1.0d) / 1000.0d)));
            NSTIJKPlayerEpisodes.this.f36485V0.start();
            NSTIJKPlayerEpisodes.this.f36504a3.removeMessages(1);
            NSTIJKPlayerEpisodes.this.f36489W0.setStreamMute(3, false);
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
            nSTIJKPlayerEpisodes.f36576q = false;
            nSTIJKPlayerEpisodes.f36504a3.sendEmptyMessageDelayed(1, 1000L);
            NSTIJKPlayerEpisodes.this.Z1(1000);
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$n, reason: case insensitive filesystem */
    public class C1512n implements IMediaPlayer.OnCompletionListener {
        public C1512n() {
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onCompletion(tv.danmaku.ijk.media.player.IMediaPlayer r3) {
            /*
                Method dump skipped, instruction units count: 210
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes.C1512n.onCompletion(tv.danmaku.ijk.media.player.IMediaPlayer):void");
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$o, reason: case insensitive filesystem */
    public class RunnableC1513o implements Runnable {
        public RunnableC1513o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView;
            String str;
            NSTIJKPlayerEpisodes.this.f36485V0.seekTo(NSTIJKPlayerEpisodes.this.f36485V0.getCurrentPosition() + NSTIJKPlayerEpisodes.this.f36569o2);
            NSTIJKPlayerEpisodes.this.f36569o2 = 0;
            NSTIJKPlayerEpisodes.this.f36604w2.startAnimation(NSTIJKPlayerEpisodes.this.f36539i2);
            NSTIJKPlayerEpisodes.this.f36604w2.setVisibility(8);
            if (NSTIJKPlayerEpisodes.this.f36592t2 == null || !NSTIJKPlayerEpisodes.this.f36592t2.equals("catch_up")) {
                textView = NSTIJKPlayerEpisodes.this.f36554l2;
                str = "+10s";
            } else {
                textView = NSTIJKPlayerEpisodes.this.f36554l2;
                str = "+60s";
            }
            textView.setText(str);
            if (NSTIJKPlayerEpisodes.this.f36506b2.getVisibility() == 8) {
                NSTIJKPlayerEpisodes.this.f36554l2.startAnimation(NSTIJKPlayerEpisodes.this.f36539i2);
                NSTIJKPlayerEpisodes.this.f36554l2.setVisibility(8);
            }
            NSTIJKPlayerEpisodes.this.Z1(1000);
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$p, reason: case insensitive filesystem */
    public class C1514p implements IMediaPlayer.OnInfoListener {
        public C1514p() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i9, int i10) {
            String str;
            if (NSTIJKPlayerEpisodes.this.f36586s0 != null) {
                NSTIJKPlayerEpisodes.this.f36586s0.onInfo(iMediaPlayer, i9, i10);
            }
            if (i9 == 3) {
                NSTIJKPlayerEpisodes.this.Z2(2);
                str = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i9 == 10005) {
                NSTIJKPlayerEpisodes.this.Z2(1);
                str = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i9 == 901) {
                str = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else {
                if (i9 != 902) {
                    if (i9 == 10001) {
                        NSTIJKPlayerEpisodes.this.f36562n0 = i10;
                        Log.d("jaskirat", "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i10);
                        a aVar = NSTIJKPlayerEpisodes.this.f36526g;
                        if (aVar != null) {
                            aVar.setVideoRotation(i10);
                        }
                    } else if (i9 != 10002) {
                        switch (i9) {
                            case 700:
                                str = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                                NSTIJKPlayerEpisodes.this.Z2(1);
                                str = "MEDIA_INFO_BUFFERING_START:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                                NSTIJKPlayerEpisodes.this.Z2(6);
                                str = "MEDIA_INFO_BUFFERING_END:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                                str = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i10;
                                break;
                            default:
                                switch (i9) {
                                    case 800:
                                        str = "MEDIA_INFO_BAD_INTERLEAVING:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                        str = "MEDIA_INFO_NOT_SEEKABLE:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                        str = "MEDIA_INFO_METADATA_UPDATE:";
                                        break;
                                }
                                break;
                        }
                    } else {
                        str = "MEDIA_INFO_AUDIO_RENDERING_START:";
                    }
                    return true;
                }
                str = "MEDIA_INFO_SUBTITLE_TIMED_OUT:";
            }
            Log.d("jaskirat", str);
            return true;
        }
    }

    public class q implements IMediaPlayer.OnErrorListener {
        public q() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i9, int i10) {
            Log.d(NSTIJKPlayerEpisodes.this.f36476T, "Error: " + i9 + "," + i10);
            NSTIJKPlayerEpisodes.this.f36527g0 = -1;
            NSTIJKPlayerEpisodes.this.f36532h0 = -1;
            NSTIJKPlayerEpisodes.n(NSTIJKPlayerEpisodes.this);
            NSTIJKPlayerEpisodes.this.Z2(-1);
            if (NSTIJKPlayerEpisodes.this.f36582r0 != null) {
                NSTIJKPlayerEpisodes.this.f36582r0.onError(NSTIJKPlayerEpisodes.f36398x3, i9, i10);
            }
            return true;
        }
    }

    public class r implements a.InterfaceC0291a {
        public r() {
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void a(a.b bVar, int i9, int i10, int i11) {
            a aVarA = bVar.a();
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
            if (aVarA != nSTIJKPlayerEpisodes.f36526g) {
                Log.e(nSTIJKPlayerEpisodes.f36476T, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            nSTIJKPlayerEpisodes.f36552l0 = i10;
            NSTIJKPlayerEpisodes.this.f36557m0 = i11;
            boolean z9 = false;
            boolean z10 = NSTIJKPlayerEpisodes.this.f36532h0 == 3;
            if (!NSTIJKPlayerEpisodes.this.f36526g.d() || (NSTIJKPlayerEpisodes.this.f36542j0 == i10 && NSTIJKPlayerEpisodes.this.f36547k0 == i11)) {
                z9 = true;
            }
            if (NSTIJKPlayerEpisodes.f36398x3 != null && z10 && z9) {
                if (NSTIJKPlayerEpisodes.this.f36590t0 != 0) {
                    NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = NSTIJKPlayerEpisodes.this;
                    nSTIJKPlayerEpisodes2.seekTo(nSTIJKPlayerEpisodes2.f36590t0);
                }
                NSTIJKPlayerEpisodes.this.start();
            }
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void b(a.b bVar, int i9, int i10) {
            a aVarA = bVar.a();
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
            if (aVarA != nSTIJKPlayerEpisodes.f36526g) {
                Log.e(nSTIJKPlayerEpisodes.f36476T, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            nSTIJKPlayerEpisodes.f36537i0 = bVar;
            if (NSTIJKPlayerEpisodes.f36398x3 != null) {
                NSTIJKPlayerEpisodes.this.b2(NSTIJKPlayerEpisodes.f36398x3, bVar);
            } else {
                NSTIJKPlayerEpisodes.this.x2();
            }
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void c(a.b bVar) {
            a aVarA = bVar.a();
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
            if (aVarA != nSTIJKPlayerEpisodes.f36526g) {
                Log.e(nSTIJKPlayerEpisodes.f36476T, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                nSTIJKPlayerEpisodes.f36537i0 = null;
                NSTIJKPlayerEpisodes.this.D2();
            }
        }
    }

    public class s implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LinearLayout f36659a;

        public s(LinearLayout linearLayout) {
            this.f36659a = linearLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f36659a.setVisibility(8);
            if (NSTIJKPlayerEpisodes.this.f36506b2.getVisibility() != 0 || NSTIJKPlayerEpisodes.this.f36584r2 == null) {
                return;
            }
            NSTIJKPlayerEpisodes.this.f36584r2.setVisibility(0);
        }
    }

    public class t implements View.OnClickListener {
        public t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerEpisodes.f36394t3 = new ProgressBar(NSTIJKPlayerEpisodes.this.f36437J0, null, R.attr.progressBarStyleHorizontal);
            NSTIJKPlayerEpisodes.this.i3(true);
        }
    }

    public class u implements View.OnClickListener {
        public u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerEpisodes.this.j3();
        }
    }

    public class v implements IMediaPlayer.OnPreparedListener {
        public v() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerEpisodes.this.f36465Q0 = System.currentTimeMillis();
            NSTIJKPlayerEpisodes.this.f36457O0.n(NSTIJKPlayerEpisodes.this.f36465Q0 - NSTIJKPlayerEpisodes.this.f36461P0);
            NSTIJKPlayerEpisodes.this.f36527g0 = 2;
            NSTIJKPlayerEpisodes.f36398x3.start();
            if (NSTIJKPlayerEpisodes.this.f36572p0 != null) {
                NSTIJKPlayerEpisodes.this.f36572p0.onPrepared(NSTIJKPlayerEpisodes.f36398x3);
            }
            NSTIJKPlayerEpisodes.n(NSTIJKPlayerEpisodes.this);
            NSTIJKPlayerEpisodes.this.f36542j0 = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerEpisodes.this.f36547k0 = iMediaPlayer.getVideoHeight();
            int i9 = NSTIJKPlayerEpisodes.this.f36590t0;
            if (i9 != 0) {
                NSTIJKPlayerEpisodes.this.seekTo(i9);
            }
            if (NSTIJKPlayerEpisodes.this.f36542j0 == 0 || NSTIJKPlayerEpisodes.this.f36547k0 == 0) {
                if (NSTIJKPlayerEpisodes.this.f36532h0 == 3) {
                    NSTIJKPlayerEpisodes.this.start();
                    return;
                }
                return;
            }
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
            a aVar = nSTIJKPlayerEpisodes.f36526g;
            if (aVar != null) {
                aVar.c(nSTIJKPlayerEpisodes.f36542j0, NSTIJKPlayerEpisodes.this.f36547k0);
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = NSTIJKPlayerEpisodes.this;
                nSTIJKPlayerEpisodes2.f36526g.a(nSTIJKPlayerEpisodes2.f36445L0, NSTIJKPlayerEpisodes.this.f36449M0);
                if (!NSTIJKPlayerEpisodes.this.f36526g.d() || (NSTIJKPlayerEpisodes.this.f36552l0 == NSTIJKPlayerEpisodes.this.f36542j0 && NSTIJKPlayerEpisodes.this.f36557m0 == NSTIJKPlayerEpisodes.this.f36547k0)) {
                    if (NSTIJKPlayerEpisodes.this.f36532h0 == 3) {
                        NSTIJKPlayerEpisodes.this.start();
                    } else {
                        if (NSTIJKPlayerEpisodes.this.isPlaying()) {
                            return;
                        }
                        if (i9 == 0 && NSTIJKPlayerEpisodes.this.getCurrentPosition() <= 0) {
                            return;
                        }
                    }
                    NSTIJKPlayerEpisodes.n(NSTIJKPlayerEpisodes.this);
                }
            }
        }
    }

    public class w implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f36664a;

        public w(int i9) {
            this.f36664a = i9;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i9) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
            nSTIJKPlayerEpisodes.f36406B1 = nSTIJKPlayerEpisodes.f36607x1.edit();
            if (i9 == 111 || i9 == 11111111) {
                NSTIJKPlayerEpisodes.this.f36406B1.putInt("currentVideoTrack", -1);
                NSTIJKPlayerEpisodes.this.i2(this.f36664a);
            } else {
                NSTIJKPlayerEpisodes.this.f36406B1.putInt("currentVideoTrack", i9);
                int currentPosition = (int) NSTIJKPlayerEpisodes.f36398x3.getCurrentPosition();
                NSTIJKPlayerEpisodes.this.K2(i9);
                if (NSTIJKPlayerEpisodes.this.f36592t2.equalsIgnoreCase("recording")) {
                    NSTIJKPlayerEpisodes.f36398x3.seekTo(Long.parseLong(String.valueOf(currentPosition)));
                }
            }
            NSTIJKPlayerEpisodes.this.f36406B1.apply();
        }
    }

    public class x implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f36666a;

        public x(int i9) {
            this.f36666a = i9;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i9) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
            nSTIJKPlayerEpisodes.f36402A1 = nSTIJKPlayerEpisodes.f36603w1.edit();
            if (i9 == 1111 || i9 == 1111111) {
                NSTIJKPlayerEpisodes.this.f36402A1.putInt("currentAudioTrack", -1);
                NSTIJKPlayerEpisodes.this.i2(this.f36666a);
            } else {
                NSTIJKPlayerEpisodes.this.f36402A1.putInt("currentAudioTrack", i9);
                int currentPosition = (int) NSTIJKPlayerEpisodes.f36398x3.getCurrentPosition();
                NSTIJKPlayerEpisodes.this.K2(i9);
                NSTIJKPlayerEpisodes.f36398x3.seekTo(Long.parseLong(String.valueOf(currentPosition)));
            }
            NSTIJKPlayerEpisodes.this.f36402A1.apply();
        }
    }

    public class y implements RadioGroup.OnCheckedChangeListener {
        public y() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i9) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
            nSTIJKPlayerEpisodes.f36615z1 = nSTIJKPlayerEpisodes.f36599v1.edit();
            if (i9 == 11111 || i9 == 111111) {
                NSTIJKPlayerEpisodes.this.f36459O2 = false;
                NSTIJKPlayerEpisodes.this.f36615z1.putInt("currentSubtitleTrack", -1);
            } else {
                NSTIJKPlayerEpisodes.this.f36459O2 = true;
                NSTIJKPlayerEpisodes.this.f36615z1.putInt("currentSubtitleTrack", i9);
                NSTIJKPlayerEpisodes.f36398x3.seekTo(Long.parseLong(String.valueOf((int) NSTIJKPlayerEpisodes.f36398x3.getCurrentPosition())));
            }
            NSTIJKPlayerEpisodes.this.f36615z1.apply();
            AbstractC2941e.e(NSTIJKPlayerEpisodes.f36398x3, i9);
        }
    }

    public class z implements View.OnClickListener {
        public z() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerEpisodes.this.f36408C.dismiss();
        }
    }

    public NSTIJKPlayerEpisodes(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36508c = 0;
        this.f36512d = true;
        this.f36516e = 0;
        this.f36521f = false;
        this.f36536i = true;
        this.f36541j = false;
        this.f36546k = false;
        this.f36556m = "";
        this.f36566o = false;
        this.f36571p = false;
        this.f36581r = false;
        this.f36404B = 0;
        this.f36412D = "https://hosting.iptvbillingsolution.com/The%20Lucy%20Show%20S01E02%20Lucy%20Digs%20Up%20a%20Date.SP.DVDRip.NonHI.cc.en.CBS.srt";
        this.f36416E = "";
        this.f36476T = "NSTIJKPlayerEpisodes";
        this.f36480U = System.currentTimeMillis();
        this.f36527g0 = 0;
        this.f36532h0 = 0;
        this.f36537i0 = null;
        this.f36594u0 = true;
        this.f36598v0 = true;
        this.f36602w0 = true;
        this.f36606x0 = -1;
        this.f36610y0 = -1L;
        this.f36401A0 = false;
        this.f36405B0 = 7000;
        this.f36417E0 = 0;
        this.f36425G0 = 0;
        this.f36429H0 = 5;
        this.f36453N0 = new C1509k();
        this.f36461P0 = 0L;
        this.f36465Q0 = 0L;
        this.f36469R0 = 0L;
        this.f36473S0 = new v();
        this.f36477T0 = 0L;
        this.f36495Y0 = -1.0f;
        Boolean bool = Boolean.FALSE;
        this.f36518e1 = bool;
        this.f36523f1 = bool;
        this.f36528g1 = bool;
        this.f36533h1 = bool;
        this.f36538i1 = bool;
        this.f36543j1 = bool;
        this.f36414D1 = false;
        this.f36418E1 = false;
        this.f36426G1 = 0;
        this.f36442K1 = false;
        this.f36529g2 = false;
        this.f36544j2 = new F();
        this.f36569o2 = 0;
        this.f36439J2 = false;
        this.f36443K2 = 5;
        this.f36447L2 = false;
        this.f36451M2 = new G();
        this.f36455N2 = new H();
        this.f36459O2 = true;
        this.f36463P2 = new I();
        this.f36467Q2 = 4;
        this.f36471R2 = f36392r3[0];
        this.f36475S2 = new ArrayList();
        this.f36479T2 = 0;
        this.f36483U2 = 0;
        this.f36487V2 = false;
        this.f36494X2 = new K();
        this.f36497Y2 = new L();
        this.f36500Z2 = new C1499a();
        this.f36504a3 = new HandlerC1500b(Looper.getMainLooper());
        this.f36520e3 = new C1512n();
        this.f36525f3 = new C1514p();
        this.f36530g3 = new q();
        this.f36535h3 = new r();
        this.f36540i3 = 0;
        this.f36545j3 = false;
        this.f36570o3 = 0;
        s2(context);
    }

    private void B2() {
        if (this.f36425G0 <= 5) {
            Toast.makeText(this.f36437J0, "Api Error, reconnects in 3sec(" + this.f36425G0 + "/5) ", 0).show();
        }
        this.f36425G0++;
        new Handler().postDelayed(new C(), 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I2() {
        TextView textView;
        StringBuilder sb;
        c3();
        if (HoneyPlayer.f29981a4 || d2() || this.f36485V0 == null || this.f36604w2.getVisibility() != 8) {
            return;
        }
        this.f36519e2.removeCallbacksAndMessages(null);
        String str = this.f36588s2;
        if (str != null && !str.equals("")) {
            this.f36569o2 -= 10000;
        }
        String str2 = this.f36592t2;
        this.f36569o2 = (str2 == null || !str2.equals("catch_up")) ? this.f36569o2 - 10000 : this.f36569o2 - DateTimeConstants.MILLIS_PER_MINUTE;
        if (this.f36569o2 > 0) {
            textView = this.f36600v2;
            sb = new StringBuilder();
            sb.append("+");
        } else {
            textView = this.f36600v2;
            sb = new StringBuilder();
        }
        sb.append(this.f36569o2 / 1000);
        sb.append("s");
        textView.setText(sb.toString());
        this.f36549k2.setText("");
        this.f36549k2.startAnimation(this.f36616z2);
        this.f36549k2.setVisibility(0);
        if (this.f36608x2.getVisibility() == 8) {
            this.f36608x2.startAnimation(this.f36612y2);
            this.f36608x2.setVisibility(0);
        } else {
            this.f36608x2.startAnimation(this.f36616z2);
        }
        this.f36519e2.postDelayed(new RunnableC1510l(), 1000L);
    }

    public static /* synthetic */ int M1(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
        int i9 = nSTIJKPlayerEpisodes.f36540i3;
        nSTIJKPlayerEpisodes.f36540i3 = i9 + 1;
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int O2() {
        if (this.f36576q) {
            return 0;
        }
        if (this.f36414D1) {
            k2(true);
            this.f36414D1 = false;
            return 0;
        }
        int currentPosition = this.f36485V0.getCurrentPosition();
        int duration = this.f36485V0.getDuration();
        SeekBar seekBar = this.f36548k1;
        if (seekBar != null) {
            if (duration > 0) {
                seekBar.setProgress((int) ((((long) currentPosition) * 1000) / ((long) duration)));
            }
            this.f36548k1.setSecondaryProgress(this.f36485V0.getBufferPercentage() * 10);
        }
        try {
            if (duration == 0) {
                this.f36553l1.setText("Live");
                this.f36558m1.setText("");
            } else {
                this.f36553l1.setText(h3(currentPosition));
                this.f36558m1.setText(h3(duration));
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        return currentPosition;
    }

    private void Y1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z2(int i9) {
        LinearLayout linearLayout;
        this.f36508c = i9;
        if (i9 == -1) {
            if (this.f36516e >= this.f36429H0) {
                l2();
                if (!this.f36591t1.equals("dfo") && !this.f36591t1.equals("devicedata")) {
                    V2(this.f36481U0.getResources().getString(a7.j.f13214b7));
                }
                e3();
                this.f36521f = false;
                return;
            }
            long currentPosition = f36398x3.getCurrentPosition();
            if (currentPosition != 0) {
                C2966a.f().I(currentPosition);
            }
            if (currentPosition != 0) {
                SharedPreferences sharedPreferences = this.f36481U0.getSharedPreferences("currentSeekTime", 0);
                this.f36563n1 = sharedPreferences;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                this.f36440K = editorEdit;
                editorEdit.putString("currentSeekTime", String.valueOf(currentPosition));
                this.f36440K.apply();
            }
            this.f36521f = true;
            this.f36409C0.postDelayed(new RunnableC1502d(currentPosition), 3000L);
            return;
        }
        if (i9 == 1) {
            if (HoneyPlayer.O1()) {
                return;
            }
            LinearLayout linearLayout2 = this.f36584r2;
            if (linearLayout2 != null && linearLayout2.getVisibility() == 0) {
                this.f36584r2.setVisibility(8);
            }
            this.f36509c1.b(f.f12086A).e();
            return;
        }
        if (i9 == 3) {
            this.f36516e = 0;
            this.f36509c1.b(f.f12172I5).a();
            this.f36509c1.b(f.f12162H5).e();
            Activity activity = this.f36481U0;
            if (activity instanceof HoneyPlayer) {
                ((HoneyPlayer) activity).S1();
            }
            if (this.f36421F0) {
                this.f36509c1.b(f.f12162H5).c();
            }
        } else {
            if (i9 == 6) {
                this.f36516e = 0;
                this.f36509c1.b(f.f12146G).a();
                this.f36509c1.b(f.Im).e();
                this.f36509c1.b(f.f12172I5).a();
                this.f36509c1.b(f.f12162H5).e();
                Activity activity2 = this.f36481U0;
                if (activity2 instanceof HoneyPlayer) {
                    ((HoneyPlayer) activity2).S1();
                }
                this.f36509c1.b(f.f12086A).a();
                if (HoneyPlayer.f29981a4 || d2() || this.f36506b2.getVisibility() != 0 || (linearLayout = this.f36584r2) == null) {
                    return;
                }
                linearLayout.setVisibility(0);
                return;
            }
            if (i9 != 2) {
                if (i9 == 4) {
                    this.f36509c1.b(f.f12172I5).e();
                    this.f36509c1.b(f.f12162H5).a();
                    if (this.f36421F0) {
                        this.f36509c1.b(f.f12172I5).c();
                        return;
                    }
                    return;
                }
                return;
            }
            this.f36442K1 = true;
            this.f36509c1.b(f.f12172I5).a();
            this.f36509c1.b(f.f12162H5).e();
            this.f36509c1.b(f.f12162H5).c();
            Activity activity3 = this.f36481U0;
            if (activity3 instanceof HoneyPlayer) {
                ((HoneyPlayer) activity3).S1();
            }
            int iD = AbstractC2941e.d(f36398x3, 1);
            int iD2 = AbstractC2941e.d(f36398x3, 2);
            this.f36515d3 = AbstractC2941e.d(f36398x3, 3);
            SharedPreferences sharedPreferences2 = this.f36481U0.getSharedPreferences("auto_start", 0);
            this.f36595u1 = sharedPreferences2;
            this.f36507b3 = sharedPreferences2.getBoolean("subtitle_active", true);
            SharedPreferences sharedPreferences3 = this.f36481U0.getSharedPreferences("currentSubtitleTrack", 0);
            this.f36599v1 = sharedPreferences3;
            this.f36511c3 = sharedPreferences3.getInt("currentSubtitleTrack", -2);
            if (!this.f36507b3) {
                this.f36459O2 = false;
            }
            W2(this.f36458O1, this.f36462P1, this.f36466Q1, this.f36454N1, this.f36450M1, this.f36446L1, this.f36474S1, this.f36478T1, this.f36493X1);
            SharedPreferences sharedPreferences4 = this.f36481U0.getSharedPreferences("currentAudioTrack", 0);
            this.f36603w1 = sharedPreferences4;
            int i10 = sharedPreferences4.getInt("currentAudioTrack", -2);
            if (i10 != -2 && i10 != iD2) {
                if (i10 == -1) {
                    i2(iD2);
                } else {
                    K2(i10);
                }
            }
            SharedPreferences sharedPreferences5 = this.f36481U0.getSharedPreferences("currentVideoTrack", 0);
            this.f36607x1 = sharedPreferences5;
            int i11 = sharedPreferences5.getInt("currentVideoTrack", -2);
            if (i11 != -2 && i11 != iD) {
                if (i11 == -1) {
                    i2(iD);
                } else {
                    K2(i11);
                }
            }
            String type = SharepreferenceDBHandler.getType(getContext());
            if (type.equals("movies") && !this.f36587s1.equals("m3u")) {
                N2();
            } else if (type.equals("series") && !this.f36587s1.equals("m3u")) {
                this.f36585s.f();
                Activity activity4 = this.f36481U0;
                if (activity4 != null && SharepreferenceDBHandler.getisAutoPlayVideos(activity4)) {
                    X2();
                }
            }
            if (AbstractC2237a.f44533q0) {
                AbstractC2237a.f44518l0 = 0;
            }
            this.f36516e = 0;
            O2();
            this.f36509c1.b(f.f12146G).a();
            this.f36509c1.b(f.Im).e();
            this.f36509c1.b(f.f12172I5).a();
            this.f36509c1.b(f.f12162H5).e();
            Activity activity5 = this.f36481U0;
            if (activity5 instanceof HoneyPlayer) {
                ((HoneyPlayer) activity5).S1();
            }
        }
        this.f36509c1.b(f.f12086A).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b2(IMediaPlayer iMediaPlayer, a.b bVar) {
        if (iMediaPlayer == null) {
            return;
        }
        if (bVar == null) {
            iMediaPlayer.setDisplay(null);
        } else {
            bVar.b(iMediaPlayer);
        }
    }

    private String c2(String str) {
        return TextUtils.isEmpty(str) ? "und" : str;
    }

    private int f3(int i9, int i10) {
        return this.f36568o1.isStreamAvailable(String.valueOf(i9), i10);
    }

    private void g2() {
        if (this.f36570o3 <= 5) {
            Toast.makeText(this.f36437J0, "Api Error, reconnects in 3sec(" + this.f36570o3 + "/5) ", 0).show();
        }
        this.f36570o3++;
        new Handler().postDelayed(new B(), 3000L);
    }

    private int g3(String str, int i9) {
        return this.f36568o1.isStreamAvailable(String.valueOf(str), i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3(boolean z9) {
        LayoutInflater layoutInflaterFrom;
        int i9;
        this.f36545j3 = false;
        this.f36540i3 = 0;
        f36394t3.setVisibility(0);
        this.f36415D2.setVisibility(8);
        if (z9) {
            this.f36550k3 = (TextView) ((LayoutInflater) this.f36437J0.getSystemService("layout_inflater")).inflate(g.f12855p2, (ViewGroup) findViewById(f.ih)).findViewById(f.Yg);
            f36394t3.setVisibility(0);
            this.f36415D2.setVisibility(8);
            if (getContext() != null) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), k.f13456a);
                if (this.f36441K0.A().equals(AbstractC2237a.f44453K0)) {
                    layoutInflaterFrom = LayoutInflater.from(getContext());
                    i9 = g.f12769b3;
                } else {
                    layoutInflaterFrom = LayoutInflater.from(getContext());
                    i9 = g.f12762a3;
                }
                View viewInflate = layoutInflaterFrom.inflate(i9, (ViewGroup) null);
                this.f36555l3 = (ProgressBar) viewInflate.findViewById(f.Nc);
                this.f36560m3 = (RecyclerView) viewInflate.findViewById(f.Dd);
                TextView textView = (TextView) viewInflate.findViewById(f.f12315X2);
                this.f36565n3 = textView;
                textView.setVisibility(8);
                ((ImageView) viewInflate.findViewById(f.f12453l2)).setOnClickListener(new z());
                this.f36522f0 = new ArrayList();
                this.f36555l3.setVisibility(0);
                TextView textView2 = (TextView) viewInflate.findViewById(f.f12315X2);
                this.f36565n3 = textView2;
                textView2.setVisibility(8);
                this.f36522f0 = new ArrayList();
                this.f36565n3.setVisibility(8);
                builder.setView(viewInflate);
                this.f36408C = builder.create();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(this.f36408C.getWindow().getAttributes());
                layoutParams.width = -2;
                layoutParams.height = -2;
                new Rect();
                this.f36408C.show();
                this.f36408C.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                this.f36408C.getWindow().setAttributes(layoutParams);
                this.f36408C.setCancelable(true);
                this.f36408C.show();
            }
        }
        OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient okHttpClientBuild = builder2.connectTimeout(60L, timeUnit).readTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).build();
        Log.e("jaskirat", "tmdb_id" + this.f36468R);
        AbstractC2074a.a("https://api.opensubtitles.com/api/v1/subtitles?tmdb_id=" + this.f36468R).p("User-Agent", "Private Stream Plus v1.0.0").p("Accept", "application/json").p("Api-Key", "ZCyXegBRifdfqktSPAiyrtlpknf2RBrLsd").p("Content-Type", "application/json").p("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJrVzBLUlE1S3FiT08wZXpQS0NOazBOY1dWU1BvcmlONiIsImV4cCI6MTcwMDkwMTcwN30.VPitYBEcXa-iFREzVDtyDxJZlmSjDKeh0iWIUltJtFM").t("test").r(okHttpClientBuild).s(k1.e.LOW).q().o(new A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void j3() {
        int i9;
        CharSequence[] charSequenceArr = {"10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38", "40"};
        a.C0158a c0158a = new a.C0158a(getContext());
        c0158a.setTitle(getResources().getString(a7.j.f13121R7));
        String string = f36399y3.getString("pref.using_sub_font_size", AbstractC2237a.f44547x0);
        string.hashCode();
        byte b9 = -1;
        switch (string.hashCode()) {
            case 1567:
                if (string.equals("10")) {
                    b9 = 0;
                }
                break;
            case 1569:
                if (string.equals("12")) {
                    b9 = 1;
                }
                break;
            case 1571:
                if (string.equals("14")) {
                    b9 = 2;
                }
                break;
            case 1573:
                if (string.equals("16")) {
                    b9 = 3;
                }
                break;
            case 1575:
                if (string.equals("18")) {
                    b9 = 4;
                }
                break;
            case 1598:
                if (string.equals("20")) {
                    b9 = 5;
                }
                break;
            case 1600:
                if (string.equals("22")) {
                    b9 = 6;
                }
                break;
            case 1602:
                if (string.equals("24")) {
                    b9 = 7;
                }
                break;
            case 1604:
                if (string.equals("26")) {
                    b9 = 8;
                }
                break;
            case 1606:
                if (string.equals("28")) {
                    b9 = 9;
                }
                break;
            case 1629:
                if (string.equals("30")) {
                    b9 = 10;
                }
                break;
            case 1631:
                if (string.equals("32")) {
                    b9 = 11;
                }
                break;
            case 1633:
                if (string.equals("34")) {
                    b9 = 12;
                }
                break;
            case 1635:
                if (string.equals("36")) {
                    b9 = 13;
                }
                break;
            case 1637:
                if (string.equals("38")) {
                    b9 = 14;
                }
                break;
            case 1660:
                if (string.equals("40")) {
                    b9 = 15;
                }
                break;
        }
        switch (b9) {
            case 0:
            default:
                i9 = 0;
                break;
            case 1:
                i9 = 1;
                break;
            case 2:
                i9 = 2;
                break;
            case 3:
                i9 = 3;
                break;
            case 4:
                i9 = 4;
                break;
            case 5:
                i9 = 5;
                break;
            case 6:
                i9 = 6;
                break;
            case 7:
                i9 = 7;
                break;
            case 8:
                i9 = 8;
                break;
            case 9:
                i9 = 9;
                break;
            case 10:
                i9 = 10;
                break;
            case 11:
                i9 = 11;
                break;
            case 12:
                i9 = 12;
                break;
            case 13:
                i9 = 13;
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                i9 = 14;
                break;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                i9 = 15;
                break;
        }
        c0158a.l(charSequenceArr, i9, new D());
        try {
            androidx.appcompat.app.a aVarCreate = c0158a.create();
            this.f36496Y1 = aVarCreate;
            aVarCreate.setOnDismissListener(new E());
            this.f36496Y1.show();
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ int k0() {
        int i9 = f36396v3;
        f36396v3 = i9 + 1;
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3(String str) {
        try {
            SharedPreferences sharedPreferences = this.f36481U0.getSharedPreferences("pref.using_sub_font_size", 0);
            f36399y3 = sharedPreferences;
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            this.f36470R1 = editorEdit;
            if (editorEdit != null) {
                editorEdit.putString("pref.using_sub_font_size", str);
                this.f36470R1.apply();
            }
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ InterfaceC2938b n(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
        nSTIJKPlayerEpisodes.getClass();
        return null;
    }

    private void n3() {
        View viewFindViewById = this.f36481U0.findViewById(f.f12491p);
        this.f36505b1 = viewFindViewById;
        viewFindViewById.setClickable(true);
        this.f36505b1.setOnTouchListener(new ViewOnTouchListenerC1501c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o3() {
        IMediaPlayer iMediaPlayer = f36398x3;
        if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
            this.f36509c1.b(f.f12162H5).a();
            this.f36509c1.b(f.f12172I5).e();
            M m9 = this.f36472S;
            if (m9 != null) {
                m9.b();
                return;
            }
            return;
        }
        this.f36509c1.b(f.f12172I5).a();
        this.f36509c1.b(f.f12162H5).e();
        Activity activity = this.f36481U0;
        if (activity instanceof HoneyPlayer) {
            ((HoneyPlayer) activity).S1();
        }
        M m10 = this.f36472S;
        if (m10 != null) {
            m10.a();
        }
    }

    private void q2() {
        boolean zP = this.f36441K0.p();
        this.f36487V2 = zP;
        if (zP) {
            AbstractServiceC2895a.b(getContext());
            IMediaPlayer iMediaPlayerA = AbstractServiceC2895a.a();
            f36398x3 = iMediaPlayerA;
            C2939c c2939c = this.f36457O0;
            if (c2939c != null) {
                c2939c.l(iMediaPlayerA);
            }
        }
    }

    private void r2() {
        this.f36475S2.clear();
        if (this.f36441K0.s()) {
            this.f36475S2.add(1);
        }
        if (this.f36441K0.t()) {
            this.f36475S2.add(2);
        }
        if (this.f36441K0.r()) {
            this.f36475S2.add(0);
        }
        if (this.f36475S2.isEmpty()) {
            this.f36475S2.add(1);
        }
        int iIntValue = ((Integer) this.f36475S2.get(this.f36479T2)).intValue();
        this.f36483U2 = iIntValue;
        setRender(iIntValue);
    }

    private void s2(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f36437J0 = applicationContext;
        this.f36441K0 = new C2858a(applicationContext);
        this.f36456O = new l(this, this.f36437J0);
        q2();
        r2();
        this.f36542j0 = 0;
        this.f36547k0 = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f36527g0 = 0;
        this.f36532h0 = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("pref.using_sub_font_size", 0);
        f36399y3 = sharedPreferences;
        String string = sharedPreferences.getString("pref.using_sub_font_size", AbstractC2237a.f44547x0);
        this.f36531h = new TextView(context);
        f36393s3 = new TextView(context);
        try {
            TextView textView = this.f36501a;
            if (textView != null) {
                textView.setTextSize(2, Float.parseFloat(string));
            }
            f36393s3.setTextSize(2, Float.parseFloat(string));
            this.f36531h.setTextSize(2, Float.parseFloat(string));
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        f36393s3.setTextColor(context.getResources().getColor(a7.c.f11849G));
        f36393s3.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams.setMargins(0, 0, 0, 40);
        addView(f36393s3, layoutParams);
        this.f36531h.setTextColor(context.getResources().getColor(a7.c.f11849G));
        this.f36531h.setGravity(17);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams2.setMargins(0, 0, 0, 40);
        addView(this.f36531h, layoutParams2);
    }

    private boolean u2() {
        int i9;
        return (f36398x3 == null || (i9 = this.f36527g0) == -1 || i9 == 0 || i9 == 1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w2(String str) {
        this.f36565n3.setVisibility(0);
        f36394t3.setVisibility(8);
        this.f36555l3.setVisibility(8);
        this.f36408C.dismiss();
        this.f36550k3.setText(str);
        this.f36565n3.setText("No subtitles found");
    }

    public static long z2(String str) {
        String[] strArrSplit = str.split(":|,");
        return (((long) Integer.parseInt(strArrSplit[0])) * 3600000) + (((long) Integer.parseInt(strArrSplit[1])) * 60000) + (((long) Integer.parseInt(strArrSplit[2])) * 1000) + ((long) Integer.parseInt(strArrSplit[3]));
    }

    public final void A2() {
        try {
            m2();
            LinearLayout linearLayout = (LinearLayout) this.f36481U0.findViewById(f.U8);
            if (linearLayout != null) {
                linearLayout.performClick();
            }
        } catch (Exception unused) {
        }
    }

    public void C2(boolean z9) {
        try {
            b3();
            IMediaPlayer iMediaPlayer = f36398x3;
            if (iMediaPlayer != null) {
                iMediaPlayer.reset();
                f36398x3.release();
                f36398x3 = null;
                this.f36527g0 = 0;
                if (z9) {
                    this.f36532h0 = 0;
                }
                ((AudioManager) this.f36437J0.getSystemService("audio")).abandonAudioFocus(null);
            }
        } catch (Exception unused) {
        }
    }

    public void D2() {
        IMediaPlayer iMediaPlayer = f36398x3;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    @Override // z7.n
    public void E0(String str) {
    }

    public void E2(boolean z9) {
        this.f36414D1 = z9;
    }

    public int F2() {
        a aVar = this.f36526g;
        if (aVar == null || aVar.getView() == null || this.f36526g.getView().getHeight() == 0) {
            return 0;
        }
        return this.f36526g.getView().getHeight();
    }

    public int G2() {
        a aVar = this.f36526g;
        if (aVar == null || aVar.getView() == null || this.f36526g.getView().getWidth() == 0) {
            return 0;
        }
        return this.f36526g.getView().getWidth();
    }

    public void H2(int i9) {
        if (f36398x3 == null) {
            return;
        }
        this.f36610y0 = (int) (((double) this.f36485V0.getDuration()) * ((((double) i9) * 1.0d) / 1000.0d));
        this.f36576q = true;
        this.f36504a3.removeMessages(1);
        if (this.f36485V0.isPlaying()) {
            this.f36485V0.pause();
        }
        c3();
        this.f36553l1.setText(h3((int) this.f36610y0));
        this.f36558m1.setText(h3(this.f36485V0.getDuration()));
        Handler handler = this.f36524f2;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f36524f2.postDelayed(new RunnableC1511m(), 1000L);
        }
    }

    public void J2() {
        TextView textView;
        StringBuilder sb;
        c3();
        if (HoneyPlayer.f29981a4 || d2() || this.f36485V0 == null || this.f36608x2.getVisibility() != 8) {
            return;
        }
        this.f36519e2.removeCallbacksAndMessages(null);
        String str = this.f36588s2;
        if (str != null && !str.equals("")) {
            this.f36569o2 += Constants.MAXIMUM_UPLOAD_PARTS;
        }
        String str2 = this.f36592t2;
        if (str2 == null || !str2.equals("catch_up")) {
            this.f36569o2 += Constants.MAXIMUM_UPLOAD_PARTS;
        } else {
            this.f36569o2 += DateTimeConstants.MILLIS_PER_MINUTE;
        }
        if (this.f36569o2 > 0) {
            textView = this.f36596u2;
            sb = new StringBuilder();
            sb.append("+");
        } else {
            textView = this.f36596u2;
            sb = new StringBuilder();
        }
        sb.append(this.f36569o2 / 1000);
        sb.append("s");
        textView.setText(sb.toString());
        this.f36554l2.setText("");
        this.f36554l2.startAnimation(this.f36616z2);
        this.f36554l2.setVisibility(0);
        if (this.f36604w2.getVisibility() == 8) {
            this.f36604w2.startAnimation(this.f36612y2);
            this.f36604w2.setVisibility(0);
        } else {
            this.f36604w2.startAnimation(this.f36616z2);
        }
        this.f36519e2.postDelayed(new RunnableC1513o(), 1000L);
    }

    @Override // z7.n
    public void K(VodInfoCallback vodInfoCallback) {
    }

    public void K2(int i9) {
        AbstractC2941e.e(f36398x3, i9);
    }

    public void L2(Activity activity, NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes, SeekBar seekBar, TextView textView, TextView textView2, RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, SeekBar seekBar2, SeekBar seekBar3, LinearLayout linearLayout, Animation animation, Animation animation2, TextView textView8, TextView textView9, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView10, LinearLayout linearLayout4, String str, String str2, TextView textView11, FrameLayout frameLayout, Animation animation3, Animation animation4, TextView textView12, FrameLayout frameLayout2, TextView textView13, RelativeLayout relativeLayout, LinearLayout linearLayout5, Animation animation5, LinearLayout linearLayout6, Animation animation6, Animation animation7, RelativeLayout relativeLayout2, ImageView imageView, TextView textView14, RelativeLayout relativeLayout3, TextView textView15, TextView textView16, LinearLayout linearLayout7, FrameLayout frameLayout3, TextView textView17, String str3, LinearLayout linearLayout8, LinearLayout linearLayout9, RecyclerView recyclerView, ProgressBar progressBar, TextView textView18, LinearLayout linearLayout10) {
        this.f36481U0 = activity;
        this.f36485V0 = nSTIJKPlayerEpisodes;
        this.f36409C0 = new Handler();
        this.f36482U1 = textView18;
        this.f36548k1 = seekBar;
        this.f36553l1 = textView;
        this.f36490W1 = linearLayout10;
        this.f36558m1 = textView2;
        this.f36413D0 = new Handler();
        this.f36568o1 = new RecentWatchDBHandler(activity);
        this.f36573p1 = new LiveStreamDBHandler(activity);
        this.f36458O1 = radioGroup;
        this.f36462P1 = radioGroup2;
        this.f36466Q1 = radioGroup3;
        this.f36454N1 = textView3;
        this.f36450M1 = textView4;
        this.f36446L1 = textView5;
        this.f36474S1 = textView6;
        this.f36478T1 = textView7;
        this.f36499Z1 = seekBar2;
        this.f36503a2 = seekBar3;
        this.f36506b2 = linearLayout;
        this.f36601w = new Handler();
        this.f36510c2 = new Handler();
        this.f36519e2 = new Handler();
        this.f36609y = new Handler();
        this.f36524f2 = new Handler();
        this.f36534h2 = animation;
        this.f36539i2 = animation2;
        this.f36549k2 = textView8;
        textView8.setOnClickListener(this);
        this.f36554l2 = textView9;
        textView9.setOnClickListener(this);
        this.f36559m2 = linearLayout2;
        this.f36564n2 = linearLayout3;
        this.f36499Z1.setOnSeekBarChangeListener(this.f36494X2);
        this.f36503a2.setOnSeekBarChangeListener(this.f36497Y2);
        this.f36574p2 = textView10;
        this.f36501a = textView17;
        this.f36468R = str3;
        this.f36464Q = linearLayout8;
        this.f36486V1 = progressBar;
        this.f36460P = linearLayout9;
        seekBar2.setKeyProgressIncrement(1);
        float f9 = this.f36481U0.getWindow().getAttributes().screenBrightness;
        this.f36495Y0 = f9;
        if (f9 == -1.0f) {
            this.f36495Y0 = this.f36441K0 != null ? r3.o() : AbstractC2237a.f44451J0;
        }
        seekBar2.setProgress((int) this.f36495Y0);
        this.f36584r2 = linearLayout4;
        this.f36588s2 = str;
        this.f36592t2 = str2;
        this.f36596u2 = textView11;
        this.f36600v2 = textView12;
        this.f36604w2 = frameLayout;
        this.f36608x2 = frameLayout2;
        this.f36612y2 = animation3;
        this.f36616z2 = animation4;
        this.f36579q2 = textView13;
        this.f36403A2 = relativeLayout;
        this.f36415D2 = linearLayout5;
        this.f36407B2 = animation5;
        this.f36411C2 = linearLayout6;
        this.f36419E2 = animation6;
        this.f36423F2 = animation7;
        this.f36589t = relativeLayout2;
        this.f36593u = imageView;
        this.f36597v = textView14;
        this.f36431H2 = relativeLayout3;
        this.f36430H1 = textView15;
        this.f36434I1 = textView16;
        this.f36438J1 = linearLayout7;
        this.f36509c1 = new P(activity);
        this.f36493X1 = frameLayout3;
    }

    public void M2(Context context, ArrayList arrayList, int i9) {
        String num = ((LiveStreamsDBModel) arrayList.get(i9)).getNum();
        String name = ((LiveStreamsDBModel) arrayList.get(i9)).getName();
        String streamType = ((LiveStreamsDBModel) arrayList.get(i9)).getStreamType();
        String streamId = ((LiveStreamsDBModel) arrayList.get(i9)).getStreamId();
        String streamIcon = ((LiveStreamsDBModel) arrayList.get(i9)).getStreamIcon();
        String epgChannelId = ((LiveStreamsDBModel) arrayList.get(i9)).getEpgChannelId();
        String added = ((LiveStreamsDBModel) arrayList.get(i9)).getAdded();
        String categoryId = ((LiveStreamsDBModel) arrayList.get(i9)).getCategoryId();
        String customSid = ((LiveStreamsDBModel) arrayList.get(i9)).getCustomSid();
        ((LiveStreamsDBModel) arrayList.get(i9)).getTvArchive();
        String directSource = ((LiveStreamsDBModel) arrayList.get(i9)).getDirectSource();
        String tvArchiveDuration = ((LiveStreamsDBModel) arrayList.get(i9)).getTvArchiveDuration();
        String typeName = ((LiveStreamsDBModel) arrayList.get(i9)).getTypeName();
        String categoryName = ((LiveStreamsDBModel) arrayList.get(i9)).getCategoryName();
        String seriesNo = ((LiveStreamsDBModel) arrayList.get(i9)).getSeriesNo();
        String live = ((LiveStreamsDBModel) arrayList.get(i9)).getLive();
        String contaiinerExtension = ((LiveStreamsDBModel) arrayList.get(i9)).getContaiinerExtension();
        String ratingFromTen = ((LiveStreamsDBModel) arrayList.get(i9)).getRatingFromTen();
        String ratingFromFive = ((LiveStreamsDBModel) arrayList.get(i9)).getRatingFromFive();
        String url = SharepreferenceDBHandler.getCurrentAPPType(context).equals("onestream_api") ? ((LiveStreamsDBModel) arrayList.get(i9)).getUrl() : "";
        PanelAvailableChannelsPojo panelAvailableChannelsPojo = new PanelAvailableChannelsPojo();
        panelAvailableChannelsPojo.setNum(Integer.valueOf(num));
        panelAvailableChannelsPojo.setName(name);
        panelAvailableChannelsPojo.setStreamType(streamType);
        panelAvailableChannelsPojo.setStreamId(streamId);
        panelAvailableChannelsPojo.setStreamIcon(streamIcon);
        panelAvailableChannelsPojo.setEpgChannelId(epgChannelId);
        panelAvailableChannelsPojo.setAdded(added);
        panelAvailableChannelsPojo.setCategoryId(categoryId);
        panelAvailableChannelsPojo.setCustomSid(customSid);
        panelAvailableChannelsPojo.setTvArchive(0);
        panelAvailableChannelsPojo.setDirectSource(directSource);
        panelAvailableChannelsPojo.setTvArchiveDuration(tvArchiveDuration);
        panelAvailableChannelsPojo.setTypeName(typeName);
        panelAvailableChannelsPojo.setCategoryName(categoryName);
        panelAvailableChannelsPojo.setSeriesNo(seriesNo);
        panelAvailableChannelsPojo.setLive(live);
        panelAvailableChannelsPojo.setContainerExtension(contaiinerExtension);
        panelAvailableChannelsPojo.setUserIdReferred(SharepreferenceDBHandler.getUserID(context));
        panelAvailableChannelsPojo.setMovieElapsedTime(0L);
        panelAvailableChannelsPojo.setMovieDuration(0L);
        panelAvailableChannelsPojo.setRatingFromTen(ratingFromTen);
        panelAvailableChannelsPojo.setRatingFromFive(ratingFromFive);
        if (SharepreferenceDBHandler.getCurrentAPPType(context).equals("onestream_api")) {
            panelAvailableChannelsPojo.setUrl(url);
        }
        this.f36568o1.addAllAvailableChannel(panelAvailableChannelsPojo);
    }

    public void N2() {
        Context context = getContext();
        if (C2966a.f() != null) {
            int iG3 = SharepreferenceDBHandler.getCurrentAPPType(context).equals("onestream_api") ? g3(C2966a.f().m(), SharepreferenceDBHandler.getUserID(context)) : f3(C2966a.f().k(), SharepreferenceDBHandler.getUserID(context));
            if (iG3 <= 0 && iG3 == 0 && !this.f36591t1.equals("dfo") && !this.f36591t1.equals("devicedata")) {
                P2(context, C2966a.f().c(), C2966a.f().d());
            }
        }
    }

    public final void P2(Context context, ArrayList arrayList, int i9) {
        M2(context, arrayList, i9);
    }

    public void Q2(String str, boolean z9, String str2, long j9, int i9, String str3, ArrayList arrayList, int i10, int i11, String str4, String str5, String str6) {
        this.f36591t1 = str5;
        S2(Uri.parse(str), z9, str2, j9, i9, str3, arrayList, i10, i11, str4, str6);
    }

    public final void R2(Uri uri, Map map, boolean z9, String str, long j9, int i9, String str2, ArrayList arrayList, int i10, int i11, String str3, String str4) {
        this.f36484V = uri;
        this.f36488W = str;
        this.f36517e0 = map;
        this.f36590t0 = 0;
        this.f36421F0 = z9;
        this.f36448M = str2;
        this.f36561n = j9;
        this.f36556m = str4;
        this.f36551l = i9;
        this.f36444L = i11;
        this.f36452N = arrayList;
        this.f36578q1 = new PlayerResumeDBHandler(this.f36481U0);
        this.f36568o1 = new RecentWatchDBHandler(this.f36481U0);
        this.f36422F1 = new SeriesRecentWatchDatabase(this.f36481U0);
        this.f36585s = new C2509z0(this.f36481U0);
        this.f36573p1 = new LiveStreamDBHandler(this.f36481U0);
        this.f36583r1 = SharepreferenceDBHandler.getUserID(this.f36481U0);
        this.f36417E0 = i10;
        this.f36587s1 = str3;
        e3();
        x2();
        requestLayout();
        invalidate();
    }

    public void S2(Uri uri, boolean z9, String str, long j9, int i9, String str2, ArrayList arrayList, int i10, int i11, String str3, String str4) {
        R2(uri, null, z9, str, j9, i9, str2, arrayList, i10, i11, str3, str4);
    }

    public void T2() {
        if (HoneyPlayer.f29981a4 || d2() || this.f36506b2.getVisibility() != 8) {
            return;
        }
        g();
        this.f36506b2.startAnimation(this.f36534h2);
        this.f36506b2.setVisibility(0);
        if (this.f36559m2.getVisibility() == 8) {
            this.f36559m2.startAnimation(this.f36534h2);
            this.f36559m2.setVisibility(0);
        }
        if (this.f36549k2.getVisibility() == 8) {
            this.f36549k2.startAnimation(this.f36534h2);
            this.f36549k2.setVisibility(0);
        }
        if (this.f36584r2.getVisibility() == 8 && !HoneyPlayer.O1()) {
            this.f36584r2.startAnimation(this.f36534h2);
            this.f36584r2.setVisibility(0);
        }
        if (this.f36554l2.getVisibility() == 8) {
            this.f36554l2.startAnimation(this.f36534h2);
            this.f36554l2.setVisibility(0);
        }
        if (this.f36564n2.getVisibility() == 8) {
            this.f36564n2.startAnimation(this.f36534h2);
            this.f36564n2.setVisibility(0);
        }
    }

    public void U2() {
        if (this.f36506b2.getVisibility() == 8) {
            this.f36411C2.startAnimation(this.f36419E2);
            this.f36411C2.setVisibility(0);
        }
    }

    public final void V2(String str) {
        this.f36509c1.b(f.Im).a();
        this.f36509c1.b(f.f12146G).e();
        this.f36509c1.b(f.f12186K).d(str);
    }

    public void W2(RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, FrameLayout frameLayout) {
        TextView textView6;
        int i9;
        int i10;
        ITrackInfo[] iTrackInfoArr;
        if (f36398x3 == null) {
            return;
        }
        radioGroup.removeAllViews();
        radioGroup2.removeAllViews();
        radioGroup3.removeAllViews();
        try {
            SharedPreferences sharedPreferences = this.f36481U0.getSharedPreferences("pref.using_sub_font_size", 0);
            f36399y3 = sharedPreferences;
            textView4.setText(sharedPreferences.getString("pref.using_sub_font_size", AbstractC2237a.f44547x0));
            textView5.setOnClickListener(new t());
            frameLayout.setOnClickListener(new u());
        } catch (Exception unused) {
        }
        Boolean bool = Boolean.FALSE;
        this.f36543j1 = bool;
        this.f36538i1 = bool;
        this.f36533h1 = bool;
        this.f36523f1 = bool;
        this.f36518e1 = bool;
        this.f36528g1 = bool;
        int iD = AbstractC2941e.d(f36398x3, 1);
        int iD2 = AbstractC2941e.d(f36398x3, 2);
        int iD3 = AbstractC2941e.d(f36398x3, 3);
        ITrackInfo[] trackInfo = f36398x3.getTrackInfo();
        if (trackInfo == null || trackInfo.length <= 0) {
            textView6 = textView3;
            i9 = 0;
            textView.setVisibility(0);
            textView2.setVisibility(0);
        } else {
            int length = trackInfo.length;
            int i11 = 0;
            int i12 = -1;
            while (i11 < length) {
                ITrackInfo iTrackInfo = trackInfo[i11];
                int i13 = i12 + 1;
                int trackType = iTrackInfo.getTrackType();
                int i14 = length;
                IMediaFormat format = iTrackInfo.getFormat();
                if (format != null && (format instanceof IjkMediaFormat)) {
                    iTrackInfoArr = trackInfo;
                    if (trackType == 1) {
                        Boolean bool2 = Boolean.TRUE;
                        this.f36533h1 = bool2;
                        if (!this.f36518e1.booleanValue()) {
                            this.f36518e1 = bool2;
                            RadioButton radioButton = new RadioButton(this.f36481U0);
                            radioButton.setText("Disable");
                            radioButton.setTextColor(getResources().getColor(a7.c.f11849G));
                            radioButton.setTextSize(13.0f);
                            radioButton.setId(11111111);
                            radioButton.setButtonTintList(ColorStateList.valueOf(E.b.getColor(this.f36437J0, a7.c.f11849G)));
                            radioButton.setPadding(0, 0, 16, 0);
                            radioButton.setOnFocusChangeListener(new N(radioButton));
                            if (iD == -1) {
                                radioButton.setChecked(true);
                                radioGroup.setOnCheckedChangeListener(null);
                            }
                            radioButton.setTag("2");
                            radioGroup.addView(radioButton);
                        }
                        RadioButton radioButton2 = new RadioButton(this.f36481U0);
                        iTrackInfo.getInfoInline();
                        radioButton2.setText(i13 + ", " + iTrackInfo.getInfoInline());
                        if (i13 == -1) {
                            radioButton2.setId(111);
                        } else {
                            radioButton2.setId(i13);
                        }
                        radioButton2.setTextColor(getResources().getColor(a7.c.f11849G));
                        radioButton2.setTextSize(13.0f);
                        radioButton2.setButtonTintList(ColorStateList.valueOf(E.b.getColor(this.f36437J0, a7.c.f11849G)));
                        radioButton2.setPadding(0, 0, 16, 0);
                        radioButton2.setOnFocusChangeListener(new N(radioButton2));
                        if (i13 == iD) {
                            radioButton2.setChecked(true);
                            radioGroup.setOnCheckedChangeListener(null);
                        }
                        radioButton2.setTag("2");
                        radioGroup.addView(radioButton2);
                        radioGroup.setOnCheckedChangeListener(new w(iD));
                        i11++;
                        i12 = i13;
                        length = i14;
                        trackInfo = iTrackInfoArr;
                    } else if (trackType == 2) {
                        Boolean bool3 = Boolean.TRUE;
                        this.f36538i1 = bool3;
                        if (!this.f36523f1.booleanValue()) {
                            this.f36523f1 = bool3;
                            RadioButton radioButton3 = new RadioButton(this.f36481U0);
                            radioButton3.setText("Disable");
                            radioButton3.setTextColor(getResources().getColor(a7.c.f11849G));
                            radioButton3.setTextSize(13.0f);
                            radioButton3.setButtonTintList(ColorStateList.valueOf(E.b.getColor(this.f36437J0, a7.c.f11849G)));
                            radioButton3.setId(1111111);
                            radioButton3.setPadding(0, 0, 16, 0);
                            radioButton3.setOnFocusChangeListener(new N(radioButton3));
                            if (iD2 == -1) {
                                radioButton3.setChecked(true);
                                radioGroup2.setOnCheckedChangeListener(null);
                            }
                            radioButton3.setTag("2");
                            radioGroup2.addView(radioButton3);
                        }
                        RadioButton radioButton4 = new RadioButton(this.f36481U0);
                        radioButton4.setText(i13 + ", " + iTrackInfo.getInfoInline() + ", " + c2(iTrackInfo.getLanguage()));
                        radioButton4.setTextColor(getResources().getColor(a7.c.f11849G));
                        radioButton4.setTextSize(13.0f);
                        radioButton4.setButtonTintList(ColorStateList.valueOf(E.b.getColor(this.f36437J0, a7.c.f11849G)));
                        if (i13 == -1) {
                            radioButton4.setId(1111);
                        } else {
                            radioButton4.setId(i13);
                        }
                        radioButton4.setPadding(0, 0, 16, 0);
                        radioButton4.setOnFocusChangeListener(new N(radioButton4));
                        if (i13 == iD2) {
                            radioButton4.setChecked(true);
                            radioGroup2.setOnCheckedChangeListener(null);
                        }
                        radioButton4.setTag("2");
                        radioGroup2.addView(radioButton4);
                        radioGroup2.setOnCheckedChangeListener(new x(iD2));
                    } else if (trackType == 3) {
                        Boolean bool4 = Boolean.TRUE;
                        this.f36543j1 = bool4;
                        if (!this.f36528g1.booleanValue()) {
                            this.f36528g1 = bool4;
                            RadioButton radioButton5 = new RadioButton(this.f36481U0);
                            radioButton5.setText("Disable");
                            radioButton5.setTextColor(getResources().getColor(a7.c.f11849G));
                            radioButton5.setTextSize(13.0f);
                            radioButton5.setButtonTintList(ColorStateList.valueOf(E.b.getColor(this.f36437J0, a7.c.f11849G)));
                            radioButton5.setId(111111);
                            radioButton5.setPadding(0, 0, 16, 0);
                            radioButton5.setOnFocusChangeListener(new N(radioButton5));
                            if (!this.f36507b3) {
                                this.f36501a.setVisibility(8);
                                radioButton5.setChecked(true);
                            } else if (iD3 == -1) {
                                radioButton5.setChecked(true);
                                radioGroup3.setOnCheckedChangeListener(null);
                            }
                            radioButton5.setTag("2");
                            radioGroup3.addView(radioButton5);
                        }
                        RadioButton radioButton6 = new RadioButton(this.f36481U0);
                        radioButton6.setText(i13 + ", " + iTrackInfo.getInfoInline());
                        radioButton6.setTextColor(getResources().getColor(a7.c.f11849G));
                        radioButton6.setTextSize(13.0f);
                        radioButton6.setButtonTintList(ColorStateList.valueOf(E.b.getColor(this.f36437J0, a7.c.f11849G)));
                        if (i13 == -1) {
                            radioButton6.setId(11111);
                        } else {
                            radioButton6.setId(i13);
                        }
                        radioButton6.setPadding(0, 0, 16, 0);
                        radioButton6.setOnFocusChangeListener(new N(radioButton6));
                        if (i13 == iD3) {
                            radioButton6.setChecked(true);
                            radioGroup3.setOnCheckedChangeListener(null);
                        }
                        radioButton6.setTag("2");
                        radioGroup3.addView(radioButton6);
                        radioGroup3.setOnCheckedChangeListener(new y());
                    }
                } else {
                    iTrackInfoArr = trackInfo;
                }
                i11++;
                i12 = i13;
                length = i14;
                trackInfo = iTrackInfoArr;
            }
            if (this.f36533h1.booleanValue()) {
                i9 = 0;
                i10 = 8;
                textView.setVisibility(8);
            } else {
                i9 = 0;
                textView.setVisibility(0);
                i10 = 8;
            }
            if (this.f36538i1.booleanValue()) {
                textView2.setVisibility(i10);
            } else {
                textView2.setVisibility(i9);
            }
            if (this.f36543j1.booleanValue()) {
                textView6 = textView3;
                textView5.setVisibility(i9);
            } else {
                textView5.setVisibility(i9);
                textView6 = textView3;
            }
        }
        textView6.setVisibility(i9);
    }

    public void X2() {
        try {
            SharedPreferences sharedPreferences = this.f36481U0.getSharedPreferences("auto_start", 0);
            this.f36611y1 = sharedPreferences;
            String string = sharedPreferences.getString("autoplay_seconds", AbstractC2237a.f44539t0);
            int iR0 = m7.w.r0(AbstractC2237a.f44539t0);
            if (string != null && string.contains("s")) {
                iR0 = m7.w.r0(string.split("s")[0]);
            }
            if (this.f36609y != null) {
                this.f36613z = new RunnableC1503e(iR0);
                b3();
                this.f36609y.postDelayed(this.f36613z, 1000L);
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void Y2() {
        this.f36486V1.setVisibility(8);
        this.f36491W2 = new J();
        this.f36486V1.setVisibility(8);
        f36397w3.post(this.f36491W2);
    }

    public void Z1(int i9) {
        if (HoneyPlayer.f29981a4) {
            return;
        }
        if (!d2()) {
            this.f36605x = new RunnableC1508j();
        }
        this.f36601w.postDelayed(this.f36605x, i9);
    }

    @Override // z7.b
    public void a() {
    }

    public void a2(int i9) {
        RunnableC1507i runnableC1507i = new RunnableC1507i();
        this.f36514d2 = runnableC1507i;
        this.f36510c2.postDelayed(runnableC1507i, i9);
    }

    public void a3() {
        AbstractServiceC2895a.d(null);
    }

    @Override // z7.b
    public void b() {
    }

    public void b3() {
        Handler handler = this.f36609y;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void c3() {
        Handler handler;
        if (HoneyPlayer.f29981a4 || (handler = this.f36601w) == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f36594u0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f36598v0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f36602w0;
    }

    @Override // z7.b
    public void d(String str) {
    }

    public boolean d2() {
        RelativeLayout relativeLayout = this.f36589t;
        return relativeLayout != null && relativeLayout.getVisibility() == 0;
    }

    public void d3() {
        Handler handler = this.f36510c2;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void e2(int i9) {
        Handler handler;
        int i10;
        Activity activity;
        List<GetEpisdoeDetailsCallback> episodeList;
        try {
            if (this.f36609y != null) {
                int duration = getDuration() / 1000;
                if (duration - (getCurrentPosition() / 1000) < i9) {
                    this.f36447L2 = true;
                    this.f36443K2--;
                }
                if (duration <= 0 || (i10 = this.f36443K2) >= i9 || i10 == 0 || !this.f36447L2) {
                    int i11 = this.f36443K2;
                    if (i11 != 0 && i11 != 1) {
                        b3();
                        handler = this.f36609y;
                    }
                    b3();
                    A2();
                    return;
                }
                Log.e(this.f36476T, "timeup: " + this.f36443K2);
                TextView textView = this.f36430H1;
                if (textView != null) {
                    textView.setText(String.valueOf(this.f36443K2));
                }
                TextView textView2 = this.f36434I1;
                if (textView2 != null && this.f36597v != null && !textView2.isFocused() && !this.f36597v.isFocused()) {
                    c3();
                    Z1(0);
                    this.f36434I1.requestFocus();
                }
                if (this.f36589t != null) {
                    try {
                        if (Build.VERSION.SDK_INT < 24 || (activity = this.f36481U0) == null || !activity.isInPictureInPictureMode()) {
                            this.f36439J2 = false;
                        } else {
                            this.f36589t.setVisibility(8);
                            this.f36439J2 = true;
                        }
                    } catch (Exception unused) {
                    }
                }
                RelativeLayout relativeLayout = this.f36589t;
                if (relativeLayout != null && relativeLayout.getVisibility() == 8 && !this.f36439J2) {
                    this.f36589t.setVisibility(0);
                    if (this.f36593u != null && (episodeList = EpisodesUsingSinglton.getInstance().getEpisodeList()) != null && episodeList.size() > 0) {
                        if (this.f36417E0 == episodeList.size() - 1) {
                            this.f36417E0 = 0;
                        } else {
                            this.f36417E0++;
                        }
                        if (episodeList.size() > 1 && this.f36417E0 <= episodeList.size() - 1) {
                            try {
                                com.squareup.picasso.t.q(this.f36437J0.getApplicationContext()).l(episodeList.get(this.f36417E0).getMovieImage()).g(this.f36593u);
                            } catch (Exception e9) {
                                Log.e(this.f36476T, "honey: " + e9.getMessage());
                            }
                        }
                    }
                    this.f36597v.setOnClickListener(new ViewOnClickListenerC1504f());
                    this.f36434I1.setOnClickListener(new ViewOnClickListenerC1505g());
                    this.f36438J1.setOnClickListener(new ViewOnClickListenerC1506h());
                }
                b3();
                handler = this.f36609y;
                handler.postDelayed(this.f36613z, 1000L);
            }
        } catch (Exception unused2) {
        }
    }

    public void e3() {
        try {
            IMediaPlayer iMediaPlayer = f36398x3;
            if (iMediaPlayer != null) {
                iMediaPlayer.stop();
                f36398x3.release();
                f36398x3 = null;
                C2939c c2939c = this.f36457O0;
                if (c2939c != null) {
                    c2939c.l(null);
                }
                this.f36527g0 = 0;
                this.f36532h0 = 0;
                ((AudioManager) this.f36437J0.getSystemService("audio")).abandonAudioFocus(null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[PHI: r3
      0x0058: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v7 java.lang.String) binds: [B:10:0x0034, B:16:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tv.danmaku.ijk.media.player.IMediaPlayer f2(int r10) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes.f2(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    public void g() {
        if (!this.f36614z0) {
            this.f36614z0 = true;
        }
        o3();
        Handler handler = this.f36504a3;
        if (handler != null) {
            handler.sendEmptyMessage(1);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (f36398x3 != null) {
            return this.f36577q0;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (u2()) {
            return (int) f36398x3.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrentPositionSeekbar() {
        return this.f36410C1;
    }

    public int getCurrentWindowIndex() {
        return this.f36417E0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (u2()) {
            return (int) f36398x3.getDuration();
        }
        return -1;
    }

    public Boolean getFullScreenValue() {
        return Boolean.valueOf(this.f36421F0);
    }

    public int getNewSeekPosition() {
        return (int) this.f36610y0;
    }

    public boolean getPlayerIsPrepared() {
        return this.f36442K1;
    }

    public boolean getProgress() {
        return this.f36418E1;
    }

    public boolean getShowOrHideSubtitles() {
        return this.f36536i;
    }

    public ITrackInfo[] getTrackInfo() {
        IMediaPlayer iMediaPlayer = f36398x3;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.getTrackInfo();
    }

    public void h2(boolean z9) {
        String string;
        Log.e("calling:", "vipserbver");
        f36394t3.setVisibility(0);
        TextView textView = (TextView) ((LayoutInflater) this.f36437J0.getSystemService("layout_inflater")).inflate(g.f12855p2, (ViewGroup) findViewById(f.ih)).findViewById(f.Yg);
        new C2305a().c(C2305a.EnumC0402a.BASIC);
        com.squareup.okhttp.OkHttpClient okHttpClient = new com.squareup.okhttp.OkHttpClient();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        okHttpClient.setConnectTimeout(15L, timeUnit);
        okHttpClient.setReadTimeout(15L, timeUnit);
        MediaType mediaType = MediaType.parse("application/json");
        Log.e("comingfileid", String.valueOf(this.f36404B));
        try {
            Response responseExecute = okHttpClient.newCall(new Request.Builder().url("https://api.opensubtitles.com/api/v1/download").post(RequestBody.create(mediaType, "{\n  \"file_id\":" + this.f36404B + "\n}")).addHeader("User-Agent", "IPTVSmartersPlayer").addHeader("Accept", "application/json").addHeader("Api-Key", "ZCyXegBRifdfqktSPAiyrtlpknf2RBrL").addHeader("Content-Type", "application/json").addHeader("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJrVzBLUlE1S3FiT08wZXpQS0NOazBOY1dWU1BvcmlONiIsImV4cCI6MTcwMDkwMTcwN30.VPitYBEcXa-iFREzVDtyDxJZlmSjDKeh0iWIUltJtFM").build()).execute();
            if (responseExecute.body() != null) {
                String strString = responseExecute.body().string();
                try {
                    JSONObject jSONObject = new JSONObject(strString);
                    Log.e("vipserverrespnse", strString);
                    try {
                        if (jSONObject.getString("link") != null) {
                            Log.e("vipserverrespnse", this.f36416E);
                            if (!this.f36416E.isEmpty()) {
                                Log.e("TAG1:", this.f36416E);
                                f36395u3 = y2(this.f36416E);
                                Y2();
                                return;
                            } else {
                                Log.e("TAG1:", this.f36416E);
                                if (jSONObject.getString("message") == null || jSONObject.getString("message").isEmpty()) {
                                    return;
                                } else {
                                    string = jSONObject.getString("message");
                                }
                            }
                        } else {
                            if (jSONObject.getString("message") == null) {
                                return;
                            }
                            Log.e("vipserverrespnse", jSONObject.getString("message"));
                            string = jSONObject.getString("message");
                        }
                        textView.setText(string);
                    } catch (Exception e9) {
                        if (this.f36570o3 <= 5) {
                            g2();
                        } else {
                            textView.setText((jSONObject.getString("message") == null || jSONObject.getString("message").isEmpty()) ? String.valueOf(e9) : jSONObject.getString("message"));
                        }
                        Log.e("TAG2:", String.valueOf(e9));
                    }
                } catch (JSONException e10) {
                    if (this.f36570o3 <= 5) {
                        g2();
                    } else {
                        textView.setText(String.valueOf(e10));
                    }
                    e10.printStackTrace();
                }
            }
        } catch (IOException e11) {
            if (this.f36570o3 <= 5) {
                g2();
            } else {
                textView.setText(String.valueOf(e11));
            }
            Log.e("TAG4:", String.valueOf(e11));
            e11.printStackTrace();
        }
    }

    public String h3(int i9) {
        int i10 = i9 / 1000;
        int i11 = i10 % 60;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 / 3600;
        try {
            this.f36432I.setLength(0);
            return i13 > 0 ? this.f36436J.format("%d:%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i12), Integer.valueOf(i11)).toString() : this.f36436J.format("%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i11)).toString();
        } catch (Exception unused) {
            return this.f36436J.format("%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i11)).toString();
        }
    }

    public void i2(int i9) {
        AbstractC2941e.b(f36398x3, i9);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return u2() && (iMediaPlayer = f36398x3) != null && iMediaPlayer.isPlaying();
    }

    public void j2() {
        AbstractServiceC2895a.d(f36398x3);
    }

    public void k2(boolean z9) {
    }

    public final void l2() {
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int l3() {
        /*
            r6 = this;
            int r0 = r6.f36467Q2
            r1 = 1
            int r0 = r0 + r1
            r6.f36467Q2 = r0
            android.app.Activity r0 = r6.f36481U0
            java.lang.String r2 = "loginPrefs"
            r3 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r3)
            r6.f36420F = r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r6.f36424G = r0
            int r0 = r6.f36467Q2
            int[] r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes.f36392r3
            int r4 = r2.length
            int r0 = r0 % r4
            r6.f36467Q2 = r0
            r0 = r2[r0]
            r6.f36471R2 = r0
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a r0 = r6.f36526g
            if (r0 == 0) goto Lb1
            android.app.Activity r0 = r6.f36481U0
            int r2 = a7.f.f12319X6
            android.view.View r0 = r0.findViewById(r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            android.app.Activity r2 = r6.f36481U0
            int r4 = a7.f.f12471n
            android.view.View r2 = r2.findViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a r4 = r6.f36526g
            int r5 = r6.f36471R2
            r4.setAspectRatio(r5)
            int r4 = r6.f36467Q2
            if (r4 != 0) goto L54
            android.content.res.Resources r1 = r6.getResources()
            int r4 = a7.j.f13289j2
        L4c:
            java.lang.String r1 = r1.getString(r4)
        L50:
            r2.setText(r1)
            goto L7d
        L54:
            if (r4 != r1) goto L5d
            android.content.res.Resources r1 = r6.getResources()
            int r4 = a7.j.f13279i2
            goto L4c
        L5d:
            r1 = 2
            if (r4 != r1) goto L67
            android.content.res.Resources r1 = r6.getResources()
            int r4 = a7.j.f13112Q8
            goto L4c
        L67:
            r1 = 3
            if (r4 != r1) goto L71
            android.content.res.Resources r1 = r6.getResources()
            int r4 = a7.j.f13290j3
            goto L4c
        L71:
            r1 = 4
            if (r4 != r1) goto L77
            java.lang.String r1 = "16:9"
            goto L50
        L77:
            r1 = 5
            if (r4 != r1) goto L7d
            java.lang.String r1 = "4:3"
            goto L50
        L7d:
            android.content.SharedPreferences$Editor r1 = r6.f36424G
            java.lang.String r2 = "aspect_ratio"
            int r4 = r6.f36467Q2
            r1.putInt(r2, r4)
            android.content.SharedPreferences$Editor r1 = r6.f36424G
            r1.apply()
            r0.setVisibility(r3)
            android.widget.LinearLayout r1 = r6.f36584r2
            if (r1 == 0) goto L9f
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L9f
            android.widget.LinearLayout r1 = r6.f36584r2
            r2 = 8
            r1.setVisibility(r2)
        L9f:
            android.os.Handler r1 = r6.f36413D0
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            android.os.Handler r1 = r6.f36413D0
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$s r2 = new com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$s
            r2.<init>(r0)
            r3 = 3000(0xbb8, double:1.482E-320)
            r1.postDelayed(r2, r3)
        Lb1:
            int r0 = r6.f36471R2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes.l3():int");
    }

    public void m2() {
        Runnable runnable;
        Handler handler = this.f36609y;
        if (handler != null && (runnable = this.f36613z) != null) {
            handler.removeCallbacks(runnable);
        }
        this.f36529g2 = true;
        this.f36589t.setAnimation(this.f36539i2);
        this.f36589t.setVisibility(8);
    }

    public void m3() {
        this.f36485V0.p2();
        RelativeLayout relativeLayout = this.f36431H2;
        if (relativeLayout == null || relativeLayout.getVisibility() != 0) {
            if (HoneyPlayer.f29981a4) {
                if (d2()) {
                    return;
                }
                d3();
                if (this.f36411C2.getVisibility() == 0) {
                    o2();
                    return;
                } else {
                    U2();
                    a2(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
                    return;
                }
            }
            if (this.f36415D2.getVisibility() == 0) {
                this.f36415D2.setVisibility(8);
            }
            if (d2()) {
                return;
            }
            SeekBar seekBar = this.f36503a2;
            if (seekBar != null) {
                seekBar.setProgress(this.f36489W0.getStreamVolume(3));
            }
            c3();
            if (this.f36403A2.getVisibility() == 0) {
                this.f36403A2.startAnimation(this.f36407B2);
                this.f36403A2.setVisibility(8);
            } else if (this.f36506b2.getVisibility() == 0) {
                n2();
            } else {
                T2();
                Z1(5000);
            }
        }
    }

    public void n2() {
        this.f36485V0.p2();
        this.f36504a3.removeMessages(1);
        if (HoneyPlayer.f29981a4 || this.f36506b2.getVisibility() != 0) {
            return;
        }
        this.f36506b2.startAnimation(this.f36539i2);
        if (this.f36559m2.getVisibility() == 0) {
            this.f36559m2.startAnimation(this.f36539i2);
        }
        if (this.f36549k2.getVisibility() == 0) {
            this.f36549k2.startAnimation(this.f36539i2);
        }
        if (this.f36584r2.getVisibility() == 0) {
            this.f36584r2.startAnimation(this.f36539i2);
        }
        if (this.f36554l2.getVisibility() == 0) {
            this.f36554l2.startAnimation(this.f36539i2);
        }
        if (this.f36564n2.getVisibility() == 0) {
            this.f36564n2.startAnimation(this.f36539i2);
        }
        this.f36506b2.setVisibility(8);
        if (this.f36559m2.getVisibility() == 0) {
            this.f36559m2.setVisibility(8);
        }
        if (this.f36549k2.getVisibility() == 0) {
            this.f36549k2.setVisibility(8);
        }
        if (this.f36584r2.getVisibility() == 0) {
            this.f36584r2.setVisibility(8);
        }
        if (this.f36554l2.getVisibility() == 0) {
            this.f36554l2.setVisibility(8);
        }
        if (this.f36564n2.getVisibility() == 0) {
            this.f36564n2.setVisibility(8);
        }
    }

    public void o2() {
        this.f36485V0.p2();
        if (this.f36411C2.getVisibility() == 0) {
            this.f36411C2.startAnimation(this.f36423F2);
            this.f36411C2.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == f.Cl) {
            I2();
        } else if (id == f.El) {
            J2();
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        if (i9 == 4 || i9 == 24 || i9 == 25 || i9 == 164 || i9 == 82 || i9 != 5) {
        }
        u2();
        return super.onKeyDown(i9, keyEvent);
    }

    public void p2() {
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f36485V0;
        if (nSTIJKPlayerEpisodes != null) {
            nSTIJKPlayerEpisodes.setSystemUiVisibility(1799);
        }
    }

    public void p3(boolean z9) {
        if (z9) {
            f36394t3.setVisibility(0);
            View viewInflate = ((LayoutInflater) this.f36437J0.getSystemService("layout_inflater")).inflate(g.f12855p2, (ViewGroup) findViewById(f.ih));
            this.f36580q3 = viewInflate;
            this.f36575p3 = (TextView) viewInflate.findViewById(f.Yg);
        }
        new C2305a().c(C2305a.EnumC0402a.BASIC);
        com.squareup.okhttp.OkHttpClient okHttpClient = new com.squareup.okhttp.OkHttpClient();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        okHttpClient.setConnectTimeout(60L, timeUnit);
        okHttpClient.setReadTimeout(60L, timeUnit);
        MediaType mediaType = MediaType.parse("application/json");
        Log.e("comingfileid", String.valueOf(this.f36404B));
        try {
            Response responseExecute = okHttpClient.newCall(new Request.Builder().url("https://vip-api.opensubtitles.com/api/v1/download").post(RequestBody.create(mediaType, "{\n  \"file_id\":" + this.f36404B + "\n}")).addHeader("User-Agent", "IPTVSmartersPlayer").addHeader("Accept", "application/json").addHeader("Api-Key", "ZCyXegBRifdfqktSPAiyrtlpknf2RBrLsd").addHeader("Content-Type", "application/json").addHeader("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJrVzBLUlE1S3FiT08wZXpQS0NOazBOY1dWU1BvcmlONiIsImV4cCI6MTcwMDkwMTcwN30.VPitYBEcXa-iFREzVDtyDxJZlmSjDKeh0iWIUltJtFM").build()).execute();
            if (responseExecute.body() != null) {
                String strString = responseExecute.body().string();
                try {
                    JSONObject jSONObject = new JSONObject(strString);
                    Log.e("vipserverrespnse", strString);
                    try {
                        this.f36416E = jSONObject.getString("link");
                        new Thread(new Runnable() { // from class: w7.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f51707a.v2();
                            }
                        }).start();
                    } catch (Exception e9) {
                        if (this.f36425G0 <= 5) {
                            B2();
                        } else if (jSONObject.getString("message") == null || jSONObject.getString("message").isEmpty()) {
                            this.f36575p3.setText(String.valueOf(e9));
                        } else {
                            this.f36575p3.setText(jSONObject.getString("message"));
                        }
                    }
                } catch (JSONException e10) {
                    if (this.f36425G0 < 5) {
                        B2();
                    } else {
                        this.f36575p3.setText(String.valueOf(e10));
                    }
                    e10.printStackTrace();
                }
            }
        } catch (IOException e11) {
            Log.e("TAG3:", String.valueOf(e11));
            if (this.f36425G0 < 5) {
                B2();
            } else {
                this.f36575p3.setText(String.valueOf(e11));
            }
            e11.printStackTrace();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        IMediaPlayer iMediaPlayer;
        if (u2() && (iMediaPlayer = f36398x3) != null && iMediaPlayer.isPlaying()) {
            f36398x3.pause();
            this.f36527g0 = 4;
        }
        this.f36532h0 = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i9) {
        if (u2()) {
            this.f36469R0 = System.currentTimeMillis();
            f36398x3.seekTo(i9);
            i9 = 0;
        }
        this.f36590t0 = i9;
    }

    public void setAdjustViewBounds(boolean z9) {
        if (this.f36435I2 == z9) {
            return;
        }
        this.f36435I2 = z9;
        if (z9) {
            setBackground(null);
        } else {
            setBackgroundColor(DefaultRenderer.BACKGROUND_COLOR);
        }
        requestLayout();
    }

    public void setCurrentPositionSeekbar(int i9) {
        this.f36410C1 = i9;
    }

    public void setCurrentWindowIndex(int i9) {
        this.f36417E0 = i9;
    }

    public void setHudView(TableLayout tableLayout) {
        this.f36457O0 = new C2939c(getContext(), tableLayout);
    }

    public void setMediaController(InterfaceC2938b interfaceC2938b) {
        Y1();
    }

    public void setMovieListener(M m9) {
        this.f36472S = m9;
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.f36567o0 = onCompletionListener;
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.f36582r0 = onErrorListener;
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.f36586s0 = onInfoListener;
    }

    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.f36572p0 = onPreparedListener;
    }

    public void setProgress(boolean z9) {
        this.f36418E1 = z9;
    }

    public void setRender(int i9) {
        a bVar;
        if (i9 == 0) {
            bVar = null;
        } else if (i9 == 1) {
            bVar = new b(getContext());
        } else {
            if (i9 != 2) {
                Log.e(this.f36476T, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i9)));
                return;
            }
            c cVar = new c(getContext());
            bVar = cVar;
            if (f36398x3 != null) {
                cVar.getSurfaceHolder().b(f36398x3);
                cVar.c(f36398x3.getVideoWidth(), f36398x3.getVideoHeight());
                cVar.a(f36398x3.getVideoSarNum(), f36398x3.getVideoSarDen());
                cVar.setAspectRatio(this.f36471R2);
                bVar = cVar;
            }
        }
        setRenderView(bVar);
    }

    public void setRenderView(a aVar) {
        int i9;
        int i10;
        if (this.f36526g != null) {
            IMediaPlayer iMediaPlayer = f36398x3;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.f36526g.getView();
            this.f36526g.b(this.f36535h3);
            this.f36526g = null;
            removeView(view);
        }
        if (aVar == null) {
            return;
        }
        this.f36526g = aVar;
        SharedPreferences sharedPreferences = this.f36437J0.getSharedPreferences("loginPrefs", 0);
        this.f36420F = sharedPreferences;
        int i11 = sharedPreferences.getInt("aspect_ratio", 4);
        this.f36467Q2 = i11;
        aVar.setAspectRatio(i11);
        int i12 = this.f36542j0;
        if (i12 > 0 && (i10 = this.f36547k0) > 0) {
            aVar.c(i12, i10);
        }
        int i13 = this.f36445L0;
        if (i13 > 0 && (i9 = this.f36449M0) > 0) {
            aVar.a(i13, i9);
        }
        View view2 = this.f36526g.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.f36526g.e(this.f36535h3);
        this.f36526g.setVideoRotation(this.f36562n0);
    }

    public void setShowOrHideSubtitles(boolean z9) {
        this.f36536i = z9;
    }

    public void setSpeed(float f9) {
        try {
            ((IjkMediaPlayer) f36398x3).setSpeed(f9);
            this.f36485V0.p2();
        } catch (Exception unused) {
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (u2()) {
            f36398x3.start();
            this.f36527g0 = 3;
        }
        this.f36532h0 = 3;
    }

    public boolean t2() {
        return this.f36487V2;
    }

    public final /* synthetic */ void v2() {
        f36395u3 = y2(this.f36416E);
        Y2();
    }

    public void x2() {
        IMediaPlayer.OnErrorListener onErrorListener;
        if (this.f36484V == null || this.f36537i0 == null) {
            return;
        }
        C2(false);
        try {
            ((AudioManager) this.f36437J0.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception unused) {
        }
        try {
            f36398x3 = f2(this.f36441K0.x());
            getContext();
            f36398x3.setOnPreparedListener(this.f36473S0);
            f36398x3.setOnVideoSizeChangedListener(this.f36453N0);
            f36398x3.setOnCompletionListener(this.f36520e3);
            f36398x3.setOnErrorListener(this.f36530g3);
            f36398x3.setOnInfoListener(this.f36525f3);
            f36398x3.setOnBufferingUpdateListener(this.f36451M2);
            f36398x3.setOnSeekCompleteListener(this.f36455N2);
            f36398x3.setOnTimedTextListener(this.f36463P2);
            this.f36577q0 = 0;
            String scheme = this.f36484V.getScheme();
            if (Build.VERSION.SDK_INT >= 23 && this.f36441K0.F() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                f36398x3.setDataSource(new C2937a(new File(this.f36416E)));
            } else {
                f36398x3.setDataSource(this.f36437J0, this.f36484V, this.f36517e0);
            }
            b2(f36398x3, this.f36537i0);
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
            f36398x3.setAudioStreamType(3);
            f36398x3.setScreenOnWhilePlaying(true);
            this.f36461P0 = System.currentTimeMillis();
            f36398x3.prepareAsync();
            this.f36502a1 = this.f36481U0.getResources().getDisplayMetrics().widthPixels;
            AudioManager audioManager = (AudioManager) this.f36481U0.getSystemService("audio");
            this.f36489W0 = audioManager;
            this.f36492X0 = audioManager.getStreamMaxVolume(3);
            int streamVolume = this.f36489W0.getStreamVolume(3);
            this.f36503a2.setMax(this.f36489W0.getStreamMaxVolume(3));
            this.f36503a2.setProgress(streamVolume);
            this.f36498Z0 = new GestureDetector(this.f36481U0, new O());
            this.f36529g2 = false;
            n3();
            SeekBar seekBar = this.f36548k1;
            if (seekBar != null) {
                seekBar.setMax(1000);
                this.f36548k1.setKeyProgressIncrement(5);
                this.f36548k1.setOnSeekBarChangeListener(this.f36500Z2);
            }
            this.f36432I = new StringBuilder();
            this.f36436J = new Formatter(this.f36432I, Locale.getDefault());
            C2939c c2939c = this.f36457O0;
            if (c2939c != null) {
                c2939c.l(f36398x3);
            }
            this.f36527g0 = 1;
        } catch (IOException e9) {
            Log.w(this.f36476T, "Unable to open content: " + this.f36484V, e9);
            this.f36527g0 = -1;
            this.f36532h0 = -1;
            onErrorListener = this.f36530g3;
            onErrorListener.onError(f36398x3, 1, 0);
        } catch (IllegalArgumentException e10) {
            Log.w(this.f36476T, "Unable to open content: " + this.f36484V, e10);
            this.f36527g0 = -1;
            this.f36532h0 = -1;
            onErrorListener = this.f36530g3;
            onErrorListener.onError(f36398x3, 1, 0);
        } catch (NullPointerException e11) {
            Log.w(this.f36476T, "Unable to open content: " + this.f36484V, e11);
            this.f36527g0 = -1;
            this.f36532h0 = -1;
            onErrorListener = this.f36530g3;
            onErrorListener.onError(f36398x3, 1, 0);
        } catch (Exception e12) {
            Log.w(this.f36476T, "Unable to open content: " + this.f36484V, e12);
            this.f36527g0 = -1;
            this.f36532h0 = -1;
            onErrorListener = this.f36530g3;
            onErrorListener.onError(f36398x3, 1, 0);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes.f36394t3.setVisibility(8);
        r1.add(new w7.j(r7, r8, r10, r5.toString()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List y2(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes.y2(java.lang.String):java.util.List");
    }
}
