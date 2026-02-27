package com.nst.iptvsmarterstvbox.view.demo;

import B3.i0;
import O2.AbstractC0926v1;
import O2.C0909p1;
import O2.C0917s1;
import O2.C0921u;
import O2.H0;
import O2.I1;
import O2.InterfaceC0920t1;
import O2.Q1;
import O2.R0;
import O2.V1;
import Q2.C1019e;
import Z3.m;
import Z3.z;
import android.animation.ObjectAnimator;
import android.app.AppOpsManager;
import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.media.AudioManager;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.mediarouter.app.MediaRouteButton;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b4.InterfaceC1224o;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.gms.cast.MediaInfo;
import com.nst.iptvsmarterstvbox.miscelleneious.MyApplication;
import com.nst.iptvsmarterstvbox.model.DownloadedDataModel;
import com.nst.iptvsmarterstvbox.model.EpisodesUsingSinglton;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.VodAllCategoriesSingleton;
import com.nst.iptvsmarterstvbox.model.callback.GetEpisdoeDetailsCallback;
import com.nst.iptvsmarterstvbox.model.database.DownloadedDBHandler;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.RecentWatchDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SeriesRecentWatchDatabase;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.pojo.PanelAvailableChannelsPojo;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a;
import d4.InterfaceC1699p;
import d4.k0;
import e4.C1737C;
import i7.AbstractC1902a;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Formatter;
import java.util.List;
import m7.AbstractC2237a;
import m7.w;
import o4.AbstractC2324a;
import o4.C2325b;
import o4.C2328e;
import o4.InterfaceC2347y;
import org.apache.http.protocol.HttpRequestExecutor;
import org.joda.time.DateTimeConstants;
import p0.C2386a;
import p3.AbstractC2392B;
import p3.u;
import p7.AbstractC2496t;
import p7.AbstractC2498u;
import p7.AbstractC2500v;
import p7.C2509z0;
import q3.C2540a;
import q7.C2630n;
import t2.C2766a;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import u7.C2858a;
import x7.C2966a;

/* JADX INFO: loaded from: classes4.dex */
public class ExoDownloadedPlayerTwo extends androidx.appcompat.app.b implements View.OnClickListener, MediaController.MediaPlayerControl {

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static String f33569n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static String f33570o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static ProgressBar f33571p3;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public LinearLayout f33575A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public RelativeLayout f33576A0;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public SharedPreferences.Editor f33577A1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ImageView f33579B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public ImageView f33580B0;

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public SharedPreferences.Editor f33581B1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ImageView f33583C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public TextView f33584C0;

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public SharedPreferences.Editor f33585C1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ImageView f33587D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public TextView f33588D0;

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    public SharedPreferences.Editor f33589D1;

    /* JADX INFO: renamed from: D2, reason: collision with root package name */
    public InterfaceC2347y f33590D2;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public SeekBar f33591E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public TextView f33592E0;

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public String f33593E1;

    /* JADX INFO: renamed from: E2, reason: collision with root package name */
    public ArrayList f33594E2;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public LinearLayout f33595F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public LinearLayout f33596F0;

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public String f33597F1;

    /* JADX INFO: renamed from: F2, reason: collision with root package name */
    public Handler f33598F2;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public LinearLayout f33599G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public TableLayout f33600G0;

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    public String f33601G1;

    /* JADX INFO: renamed from: G2, reason: collision with root package name */
    public androidx.appcompat.app.a f33602G2;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public LinearLayout f33603H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public LinearLayout f33604H0;

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    public LiveStreamDBHandler f33605H1;

    /* JADX INFO: renamed from: H2, reason: collision with root package name */
    public BroadcastReceiver f33606H2;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ImageView f33607I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public MediaRouteButton f33608I0;

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    public ArrayList f33609I1;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public LinearLayout f33611J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public LinearLayout f33612J0;

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    public List f33613J1;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public LinearLayout f33615K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public TextView f33616K0;

    /* JADX INFO: renamed from: K2, reason: collision with root package name */
    public PictureInPictureParams.Builder f33618K2;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public LinearLayout f33619L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public RelativeLayout f33620L0;

    /* JADX INFO: renamed from: L1, reason: collision with root package name */
    public int f33621L1;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ImageView f33623M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public ImageView f33624M0;

    /* JADX INFO: renamed from: M2, reason: collision with root package name */
    public SharedPreferences f33626M2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ImageView f33627N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public ImageView f33628N0;

    /* JADX INFO: renamed from: N1, reason: collision with root package name */
    public SimpleDateFormat f33629N1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public TextView f33631O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public LinearLayout f33632O0;

    /* JADX INFO: renamed from: O1, reason: collision with root package name */
    public Date f33633O1;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public TextView f33635P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public LinearLayout f33636P0;

    /* JADX INFO: renamed from: P1, reason: collision with root package name */
    public DateFormat f33637P1;

    /* JADX INFO: renamed from: P2, reason: collision with root package name */
    public PlayerView f33638P2;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public LinearLayout f33639Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public LinearLayout f33640Q0;

    /* JADX INFO: renamed from: Q1, reason: collision with root package name */
    public String f33641Q1;

    /* JADX INFO: renamed from: Q2, reason: collision with root package name */
    public I1 f33642Q2;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public RadioGroup f33643R;

    /* JADX INFO: renamed from: R1, reason: collision with root package name */
    public String f33645R1;

    /* JADX INFO: renamed from: R2, reason: collision with root package name */
    public boolean f33646R2;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public RadioGroup f33647S;

    /* JADX INFO: renamed from: S1, reason: collision with root package name */
    public String f33649S1;

    /* JADX INFO: renamed from: S2, reason: collision with root package name */
    public InterfaceC1224o.a f33650S2;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public RadioGroup f33651T;

    /* JADX INFO: renamed from: T1, reason: collision with root package name */
    public String f33653T1;

    /* JADX INFO: renamed from: T2, reason: collision with root package name */
    public List f33654T2;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public TextView f33655U;

    /* JADX INFO: renamed from: U2, reason: collision with root package name */
    public Z3.m f33658U2;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f33659V;

    /* JADX INFO: renamed from: V2, reason: collision with root package name */
    public m.d f33662V2;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f33663W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public C2630n f33664W0;

    /* JADX INFO: renamed from: W2, reason: collision with root package name */
    public i0 f33666W2;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f33667X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public RecyclerView.o f33668X0;

    /* JADX INFO: renamed from: X2, reason: collision with root package name */
    public boolean f33670X2;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public FrameLayout f33671Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public Context f33672Y0;

    /* JADX INFO: renamed from: Y2, reason: collision with root package name */
    public int f33674Y2;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextView f33675Z;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public Animation f33676Z0;

    /* JADX INFO: renamed from: Z2, reason: collision with root package name */
    public long f33678Z2;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public Animation f33679a1;

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public Animation f33681a3;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public Animation f33682b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public Animation f33685c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public Animation f33689d1;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public C2766a f33690d2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DownloadedDBHandler f33692e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public RelativeLayout f33693e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public Animation f33694e1;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public LinearLayout f33695e2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AudioManager f33697f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public RelativeLayout f33698f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public Animation f33699f1;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public SharedPreferences f33700f2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f33702g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public RecyclerView f33703g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public Animation f33704g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Handler f33707h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public TextView f33708h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public Animation f33709h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public StringBuilder f33712i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public TextView f33713i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public Handler f33714i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Formatter f33717j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public TextView f33718j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public String f33719j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public GestureDetector f33722k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public TextView f33723k0;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public SharedPreferences f33725k2;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public FrameLayout f33728l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public SeriesRecentWatchDatabase f33729l1;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public SharedPreferences.Editor f33730l2;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public FrameLayout f33733m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public RecentWatchDBHandler f33734m1;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public Handler f33735m2;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public SeekBar f33737n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public C2509z0 f33738n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f33740o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public SeekBar f33741o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public C2858a f33742o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f33744p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public LinearLayout f33745p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public SharedPreferences f33746p1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public LinearLayout f33749q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public SharedPreferences f33750q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public TextView f33753r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public SharedPreferences f33754r1;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public SharedPreferences f33755r2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SharedPreferences f33756s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public TextView f33757s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public SharedPreferences.Editor f33758s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public SharedPreferences.Editor f33759s2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SharedPreferences.Editor f33760t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public LinearLayout f33761t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public SharedPreferences f33762t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public SharedPreferences f33763t2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Handler f33764u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public TextView f33765u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public SharedPreferences f33766u1;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public C2328e f33767u2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinearLayout f33768v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public TextView f33769v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public SharedPreferences f33770v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public C2325b f33771v2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LinearLayout f33772w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ImageView f33773w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public SharedPreferences f33774w1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public NSTIJKPlayerEpisodes f33776x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public LinearLayout f33777x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public SharedPreferences f33778x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ImageView f33780y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public LinearLayout f33781y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public SharedPreferences f33782y1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public LinearLayout f33784z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public ImageView f33785z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public SharedPreferences.Editor f33786z1;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static final int[] f33568m3 = {0, 1, 2, 3, 4, 5};

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public static boolean f33572q3 = true;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public static boolean f33573r3 = false;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public static boolean f33574s3 = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33688d = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a.b f33727l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IMediaPlayer f33732m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f33736n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f33748q = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f33752r = f33568m3[0];

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public boolean f33644R0 = false;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public boolean f33648S0 = false;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public boolean f33652T0 = false;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public int f33656U0 = 0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public List f33660V0 = new ArrayList();

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public String f33724k1 = "";

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    public String f33617K1 = "";

    /* JADX INFO: renamed from: M1, reason: collision with root package name */
    public Boolean f33625M1 = Boolean.TRUE;

    /* JADX INFO: renamed from: U1, reason: collision with root package name */
    public int f33657U1 = -1;

    /* JADX INFO: renamed from: V1, reason: collision with root package name */
    public int f33661V1 = -1;

    /* JADX INFO: renamed from: W1, reason: collision with root package name */
    public int f33665W1 = 0;

    /* JADX INFO: renamed from: X1, reason: collision with root package name */
    public String f33669X1 = "";

    /* JADX INFO: renamed from: Y1, reason: collision with root package name */
    public String f33673Y1 = "";

    /* JADX INFO: renamed from: Z1, reason: collision with root package name */
    public String f33677Z1 = "";

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public String f33680a2 = "movie";

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public String f33683b2 = "";

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public String f33686c2 = "";

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public String f33705g2 = "";

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public String f33710h2 = "";

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public String f33715i2 = "";

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public String f33720j2 = "";

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public int f33739n2 = 0;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public float f33743o2 = -1.0f;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public boolean f33747p2 = false;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public String f33751q2 = "mobile";

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public String f33775w2 = "";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public String f33779x2 = "";

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public String f33783y2 = "";

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public String f33787z2 = "";

    /* JADX INFO: renamed from: A2, reason: collision with root package name */
    public int f33578A2 = 0;

    /* JADX INFO: renamed from: B2, reason: collision with root package name */
    public int f33582B2 = 0;

    /* JADX INFO: renamed from: C2, reason: collision with root package name */
    public int f33586C2 = 0;

    /* JADX INFO: renamed from: I2, reason: collision with root package name */
    public boolean f33610I2 = false;

    /* JADX INFO: renamed from: J2, reason: collision with root package name */
    public boolean f33614J2 = false;

    /* JADX INFO: renamed from: L2, reason: collision with root package name */
    public ArrayList f33622L2 = new ArrayList();

    /* JADX INFO: renamed from: N2, reason: collision with root package name */
    public boolean f33630N2 = AbstractC2237a.f44541u0;

    /* JADX INFO: renamed from: O2, reason: collision with root package name */
    public final i7.c f33634O2 = new i7.c(this);

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    public int f33684b3 = 0;

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    public int f33687c3 = 5;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public boolean f33691d3 = false;

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    public boolean f33696e3 = false;

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    public BroadcastReceiver f33701f3 = new h();

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public Runnable f33706g3 = new j();

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f33711h3 = new k();

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f33716i3 = new l();

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public NSTIJKPlayerEpisodes.M f33721j3 = new c();

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f33726k3 = new g();

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public Handler f33731l3 = new i(Looper.getMainLooper());

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ExoDownloadedPlayerTwo.this.I2();
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes;
            int currentPosition;
            if (intent == null || !"media_control".equals(intent.getAction())) {
                return;
            }
            int intExtra = intent.getIntExtra("control_type", 0);
            if (intExtra == 1) {
                if (Build.VERSION.SDK_INT >= 26) {
                    ExoDownloadedPlayerTwo.this.q3(a7.e.f12075x0, "pause", 2, 2);
                    return;
                }
                return;
            }
            if (intExtra == 2) {
                ExoDownloadedPlayerTwo.this.f33776x.pause();
                if (Build.VERSION.SDK_INT >= 26) {
                    ExoDownloadedPlayerTwo.this.q3(a7.e.f12051r0, "play", 1, 1);
                    return;
                }
                return;
            }
            if (intExtra != 4) {
                if (intExtra != 5) {
                    return;
                }
                nSTIJKPlayerEpisodes = ExoDownloadedPlayerTwo.this.f33776x;
                currentPosition = ExoDownloadedPlayerTwo.this.f33776x.getCurrentPosition() + Constants.MAXIMUM_UPLOAD_PARTS;
            } else if (ExoDownloadedPlayerTwo.this.f33776x.getCurrentPosition() - 10000 <= 0) {
                ExoDownloadedPlayerTwo.this.f33776x.seekTo(0);
                return;
            } else {
                nSTIJKPlayerEpisodes = ExoDownloadedPlayerTwo.this.f33776x;
                currentPosition = ExoDownloadedPlayerTwo.this.f33776x.getCurrentPosition() - 10000;
            }
            nSTIJKPlayerEpisodes.seekTo(currentPosition);
        }
    }

    public class c extends NSTIJKPlayerEpisodes.M {
        public c() {
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes.M
        public void a() {
            ExoDownloadedPlayerTwo.this.q3(a7.e.f12075x0, "pause", 2, 2);
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes.M
        public void b() {
            ExoDownloadedPlayerTwo.this.q3(a7.e.f12051r0, "play", 1, 1);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ExoDownloadedPlayerTwo.this.J2();
        }
    }

    public class e implements View.OnTouchListener {
        public e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return motionEvent != null && ExoDownloadedPlayerTwo.this.f33722k.onTouchEvent(motionEvent);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LinearLayout f33793a;

        public f(LinearLayout linearLayout) {
            this.f33793a = linearLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f33793a.setVisibility(8);
            if (ExoDownloadedPlayerTwo.this.f33695e2.getVisibility() != 0 || ExoDownloadedPlayerTwo.this.f33761t0 == null) {
                return;
            }
            ExoDownloadedPlayerTwo.this.f33761t0.setVisibility(0);
        }
    }

    public class g implements SeekBar.OnSeekBarChangeListener {
        public g() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i9, boolean z9) {
            TextView textView;
            Resources resources;
            int i10;
            if (ExoDownloadedPlayerTwo.this.f33697f != null) {
                try {
                    ExoDownloadedPlayerTwo.this.f33697f.setStreamVolume(3, i9, 0);
                    int streamVolume = (int) ((ExoDownloadedPlayerTwo.this.f33697f.getStreamVolume(3) / ExoDownloadedPlayerTwo.this.f33702g) * 100.0f);
                    if (streamVolume == 0 || streamVolume < 0) {
                        textView = ExoDownloadedPlayerTwo.this.f33757s0;
                        resources = ExoDownloadedPlayerTwo.this.getResources();
                        i10 = a7.e.f12071w0;
                    } else if (streamVolume < 40) {
                        textView = ExoDownloadedPlayerTwo.this.f33757s0;
                        resources = ExoDownloadedPlayerTwo.this.getResources();
                        i10 = a7.e.f12059t0;
                    } else if (streamVolume < 80) {
                        textView = ExoDownloadedPlayerTwo.this.f33757s0;
                        resources = ExoDownloadedPlayerTwo.this.getResources();
                        i10 = a7.e.f12063u0;
                    } else if (streamVolume < 100) {
                        textView = ExoDownloadedPlayerTwo.this.f33757s0;
                        resources = ExoDownloadedPlayerTwo.this.getResources();
                        i10 = a7.e.f12067v0;
                    } else {
                        textView = ExoDownloadedPlayerTwo.this.f33757s0;
                        resources = ExoDownloadedPlayerTwo.this.getResources();
                        i10 = a7.e.f12067v0;
                    }
                    textView.setBackground(resources.getDrawable(i10));
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            ExoDownloadedPlayerTwo.this.j3();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            ExoDownloadedPlayerTwo.this.j3();
            ExoDownloadedPlayerTwo.this.w2(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
        }
    }

    public class h extends BroadcastReceiver {
        public h() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MyApplication.E("onReceive CLOSE_TARGET_ACTIVITY : ");
            if ("pip_mode_switch_user".equals(intent.getAction())) {
                ExoDownloadedPlayerTwo.this.finish();
            }
        }
    }

    public class i extends Handler {
        public i(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i9 = message.what;
            if (i9 == 1) {
                ExoDownloadedPlayerTwo.this.b3();
                return;
            }
            if (i9 != 3) {
                if (i9 != 4) {
                    return;
                }
                ExoDownloadedPlayerTwo.this.f33690d2.b(a7.f.f12285U).a();
                ExoDownloadedPlayerTwo.this.f33690d2.b(a7.f.f12552v).a();
                ExoDownloadedPlayerTwo.this.f33690d2.b(a7.f.f12582y).a();
                return;
            }
            if (ExoDownloadedPlayerTwo.this.f33736n >= 0) {
                ExoDownloadedPlayerTwo.this.f33642Q2.seekTo((int) r5.f33736n);
                ExoDownloadedPlayerTwo.this.f33736n = -1L;
            }
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.i("durationIS", "total:" + ExoDownloadedPlayerTwo.this.f33642Q2.getDuration() + "cur:" + ExoDownloadedPlayerTwo.this.f33642Q2.getCurrentPosition());
                TextView textView = ExoDownloadedPlayerTwo.this.f33631O;
                ExoDownloadedPlayerTwo exoDownloadedPlayerTwo = ExoDownloadedPlayerTwo.this;
                textView.setText(exoDownloadedPlayerTwo.l3((int) exoDownloadedPlayerTwo.f33642Q2.getCurrentPosition()));
                TextView textView2 = ExoDownloadedPlayerTwo.this.f33635P;
                ExoDownloadedPlayerTwo exoDownloadedPlayerTwo2 = ExoDownloadedPlayerTwo.this;
                textView2.setText(exoDownloadedPlayerTwo2.l3((int) exoDownloadedPlayerTwo2.f33642Q2.getDuration()));
                int duration = (int) ExoDownloadedPlayerTwo.this.f33642Q2.getDuration();
                if (duration > 0) {
                    ExoDownloadedPlayerTwo.this.f33591E.setProgress((int) ((((long) ((int) ExoDownloadedPlayerTwo.this.f33642Q2.getCurrentPosition())) * 1000) / ((long) duration)));
                    if (ExoDownloadedPlayerTwo.this.f33642Q2.isPlaying()) {
                        ExoDownloadedPlayerTwo.this.f33583C.setVisibility(8);
                        ExoDownloadedPlayerTwo.this.f33587D.setVisibility(0);
                    }
                }
            } catch (Exception unused) {
            }
            ExoDownloadedPlayerTwo.this.f33707h.postDelayed(this, 1000L);
        }
    }

    public class k implements SeekBar.OnSeekBarChangeListener {
        public k() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i9, boolean z9) {
            if (z9) {
                ExoDownloadedPlayerTwo.this.f33690d2.b(a7.f.f12146G).a();
                ExoDownloadedPlayerTwo.this.f33736n = (int) (((double) ((int) r5.f33642Q2.getDuration())) * ((((double) i9) * 1.0d) / 1000.0d));
                ExoDownloadedPlayerTwo exoDownloadedPlayerTwo = ExoDownloadedPlayerTwo.this;
                exoDownloadedPlayerTwo.f33740o = true;
                exoDownloadedPlayerTwo.f33642Q2.seekTo(exoDownloadedPlayerTwo.f33736n);
                ExoDownloadedPlayerTwo.this.j3();
                ExoDownloadedPlayerTwo.this.w2(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            ExoDownloadedPlayerTwo exoDownloadedPlayerTwo = ExoDownloadedPlayerTwo.this;
            exoDownloadedPlayerTwo.f33740o = true;
            exoDownloadedPlayerTwo.f33697f.setStreamMute(3, true);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            if (ExoDownloadedPlayerTwo.this.f33732m == null) {
                return;
            }
            ExoDownloadedPlayerTwo.this.j3();
            ExoDownloadedPlayerTwo.this.w2(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
            ExoDownloadedPlayerTwo.this.f33697f.setStreamMute(3, false);
            ExoDownloadedPlayerTwo.this.f33740o = false;
        }
    }

    public class l implements SeekBar.OnSeekBarChangeListener {
        public l() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i9, boolean z9) {
            TextView textView;
            Resources resources;
            int i10;
            ExoDownloadedPlayerTwo.this.f33743o2 = i9;
            int i11 = (int) ((ExoDownloadedPlayerTwo.this.f33743o2 / 255.0f) * 100.0f);
            if (i11 < 20) {
                textView = ExoDownloadedPlayerTwo.this.f33753r0;
                resources = ExoDownloadedPlayerTwo.this.getResources();
                i10 = a7.e.f12015i0;
            } else if (i11 < 30) {
                textView = ExoDownloadedPlayerTwo.this.f33753r0;
                resources = ExoDownloadedPlayerTwo.this.getResources();
                i10 = a7.e.f12019j0;
            } else if (i11 < 40) {
                textView = ExoDownloadedPlayerTwo.this.f33753r0;
                resources = ExoDownloadedPlayerTwo.this.getResources();
                i10 = a7.e.f12023k0;
            } else if (i11 < 50) {
                textView = ExoDownloadedPlayerTwo.this.f33753r0;
                resources = ExoDownloadedPlayerTwo.this.getResources();
                i10 = a7.e.f12027l0;
            } else if (i11 < 60) {
                textView = ExoDownloadedPlayerTwo.this.f33753r0;
                resources = ExoDownloadedPlayerTwo.this.getResources();
                i10 = a7.e.f12031m0;
            } else if (i11 < 70) {
                textView = ExoDownloadedPlayerTwo.this.f33753r0;
                resources = ExoDownloadedPlayerTwo.this.getResources();
                i10 = a7.e.f12035n0;
            } else {
                textView = ExoDownloadedPlayerTwo.this.f33753r0;
                resources = ExoDownloadedPlayerTwo.this.getResources();
                i10 = a7.e.f12039o0;
            }
            textView.setBackground(resources.getDrawable(i10));
            Log.i("brightnessIs", "brightNess:" + ExoDownloadedPlayerTwo.this.f33743o2);
            WindowManager.LayoutParams attributes = ExoDownloadedPlayerTwo.this.getWindow().getAttributes();
            attributes.screenBrightness = ExoDownloadedPlayerTwo.this.f33743o2 / 255.0f;
            try {
                ExoDownloadedPlayerTwo.this.f33742o1.R((int) ExoDownloadedPlayerTwo.this.f33743o2);
            } catch (Exception e9) {
                Log.i("brightnessError", e9.toString());
            }
            ExoDownloadedPlayerTwo.this.getWindow().setAttributes(attributes);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            ExoDownloadedPlayerTwo.this.j3();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            ExoDownloadedPlayerTwo.this.j3();
            ExoDownloadedPlayerTwo.this.w2(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
        }
    }

    public class m implements InterfaceC2347y {
        public m() {
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[Catch: Exception -> 0x001c, TryCatch #0 {Exception -> 0x001c, blocks: (B:3:0x0005, B:5:0x0013, B:16:0x0033, B:11:0x0021, B:14:0x002b, B:18:0x003c, B:20:0x0044, B:21:0x006a, B:23:0x0091, B:25:0x009d, B:26:0x00aa), top: B:31:0x0005 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a(o4.C2328e r10) {
            /*
                Method dump skipped, instruction units count: 225
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.ExoDownloadedPlayerTwo.m.a(o4.e):void");
        }

        private void b() {
            ExoDownloadedPlayerTwo.this.invalidateOptionsMenu();
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSessionEnded(C2328e c2328e, int i9) {
            b();
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSessionEnding(C2328e c2328e) {
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSessionResumeFailed(C2328e c2328e, int i9) {
            b();
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onSessionResumed(C2328e c2328e, boolean z9) {
            a(c2328e);
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onSessionResuming(C2328e c2328e, String str) {
            Log.e("honey", "onSessionResuming");
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onSessionStartFailed(C2328e c2328e, int i9) {
            b();
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void onSessionStarted(C2328e c2328e, String str) {
            a(c2328e);
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void onSessionStarting(C2328e c2328e) {
            TextView textView;
            StringBuilder sb;
            String string;
            ExoDownloadedPlayerTwo.this.f33767u2 = c2328e;
            if (ExoDownloadedPlayerTwo.this.f33767u2 != null) {
                if (ExoDownloadedPlayerTwo.this.f33776x != null) {
                    ExoDownloadedPlayerTwo.this.f33776x.p2();
                    ExoDownloadedPlayerTwo.this.f33776x.pause();
                }
                if (ExoDownloadedPlayerTwo.this.f33612J0 != null) {
                    ExoDownloadedPlayerTwo.this.f33612J0.setVisibility(0);
                }
                if (ExoDownloadedPlayerTwo.this.f33616K0 != null) {
                    if (ExoDownloadedPlayerTwo.this.f33767u2.q() == null || ExoDownloadedPlayerTwo.this.f33767u2.q().J() == null) {
                        textView = ExoDownloadedPlayerTwo.this.f33616K0;
                        sb = new StringBuilder();
                        string = ExoDownloadedPlayerTwo.this.getResources().getString(a7.j.f13407v0);
                    } else {
                        textView = ExoDownloadedPlayerTwo.this.f33616K0;
                        sb = new StringBuilder();
                        sb.append(ExoDownloadedPlayerTwo.this.getResources().getString(a7.j.f13417w0));
                        sb.append(" ");
                        string = ExoDownloadedPlayerTwo.this.f33767u2.q().J();
                    }
                    sb.append(string);
                    sb.append("...");
                    textView.setText(sb.toString());
                }
            }
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onSessionSuspended(C2328e c2328e, int i9) {
        }
    }

    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView;
            String str;
            int currentPosition = ((int) ExoDownloadedPlayerTwo.this.f33642Q2.getCurrentPosition()) + ExoDownloadedPlayerTwo.this.f33739n2;
            ExoDownloadedPlayerTwo.this.f33642Q2.seekTo(currentPosition > 0 ? ((int) r0.getCurrentPosition()) + ExoDownloadedPlayerTwo.this.f33739n2 : 0L);
            ExoDownloadedPlayerTwo.this.f33739n2 = 0;
            ExoDownloadedPlayerTwo.this.f33733m0.startAnimation(ExoDownloadedPlayerTwo.this.f33699f1);
            ExoDownloadedPlayerTwo.this.f33733m0.setVisibility(8);
            String str2 = ExoDownloadedPlayerTwo.this.f33686c2;
            if (str2 == null || !str2.equals("catch_up")) {
                textView = ExoDownloadedPlayerTwo.this.f33708h0;
                str = "-10s";
            } else {
                textView = ExoDownloadedPlayerTwo.this.f33708h0;
                str = "-60s";
            }
            textView.setText(str);
            if (ExoDownloadedPlayerTwo.this.f33695e2.getVisibility() == 8) {
                ExoDownloadedPlayerTwo.this.f33708h0.startAnimation(ExoDownloadedPlayerTwo.this.f33699f1);
                ExoDownloadedPlayerTwo.this.f33708h0.setVisibility(8);
            }
            ExoDownloadedPlayerTwo.this.w2(1000);
        }
    }

    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView;
            String str;
            ExoDownloadedPlayerTwo.this.f33642Q2.seekTo(((int) r0.getCurrentPosition()) + ExoDownloadedPlayerTwo.this.f33739n2);
            ExoDownloadedPlayerTwo.this.f33739n2 = 0;
            ExoDownloadedPlayerTwo.this.f33728l0.startAnimation(ExoDownloadedPlayerTwo.this.f33699f1);
            ExoDownloadedPlayerTwo.this.f33728l0.setVisibility(8);
            String str2 = ExoDownloadedPlayerTwo.this.f33686c2;
            if (str2 == null || !str2.equals("catch_up")) {
                textView = ExoDownloadedPlayerTwo.this.f33713i0;
                str = "+10s";
            } else {
                textView = ExoDownloadedPlayerTwo.this.f33713i0;
                str = "+60s";
            }
            textView.setText(str);
            if (ExoDownloadedPlayerTwo.this.f33695e2.getVisibility() == 8) {
                ExoDownloadedPlayerTwo.this.f33713i0.startAnimation(ExoDownloadedPlayerTwo.this.f33699f1);
                ExoDownloadedPlayerTwo.this.f33713i0.setVisibility(8);
            }
            ExoDownloadedPlayerTwo.this.w2(1000);
        }
    }

    public class p implements DialogInterface.OnClickListener {
        public p() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes;
            float f9;
            switch (i9) {
                case 0:
                    ExoDownloadedPlayerTwo.this.T2("0.25x");
                    ExoDownloadedPlayerTwo.this.f33675Z.setText(ExoDownloadedPlayerTwo.this.getResources().getString(a7.j.f13334n7) + " (0.25x)");
                    nSTIJKPlayerEpisodes = ExoDownloadedPlayerTwo.this.f33776x;
                    f9 = 0.25f;
                    break;
                case 1:
                    ExoDownloadedPlayerTwo.this.T2("0.5x");
                    ExoDownloadedPlayerTwo.this.f33675Z.setText(ExoDownloadedPlayerTwo.this.getResources().getString(a7.j.f13334n7) + " (0.5x)");
                    nSTIJKPlayerEpisodes = ExoDownloadedPlayerTwo.this.f33776x;
                    f9 = 0.5f;
                    break;
                case 2:
                    ExoDownloadedPlayerTwo.this.T2("0.75x");
                    ExoDownloadedPlayerTwo.this.f33675Z.setText(ExoDownloadedPlayerTwo.this.getResources().getString(a7.j.f13334n7) + " (0.75x)");
                    nSTIJKPlayerEpisodes = ExoDownloadedPlayerTwo.this.f33776x;
                    f9 = 0.75f;
                    break;
                case 3:
                    ExoDownloadedPlayerTwo.this.T2("1x (Normal)");
                    ExoDownloadedPlayerTwo.this.f33675Z.setText(ExoDownloadedPlayerTwo.this.getResources().getString(a7.j.f13334n7) + " (1x)");
                    nSTIJKPlayerEpisodes = ExoDownloadedPlayerTwo.this.f33776x;
                    f9 = 1.0f;
                    break;
                case 4:
                    ExoDownloadedPlayerTwo.this.T2("1.25x");
                    ExoDownloadedPlayerTwo.this.f33675Z.setText(ExoDownloadedPlayerTwo.this.getResources().getString(a7.j.f13334n7) + " (1.25x)");
                    nSTIJKPlayerEpisodes = ExoDownloadedPlayerTwo.this.f33776x;
                    f9 = 1.25f;
                    break;
                case 5:
                    ExoDownloadedPlayerTwo.this.T2("1.5x");
                    ExoDownloadedPlayerTwo.this.f33675Z.setText(ExoDownloadedPlayerTwo.this.getResources().getString(a7.j.f13334n7) + " (1.5x)");
                    nSTIJKPlayerEpisodes = ExoDownloadedPlayerTwo.this.f33776x;
                    f9 = 1.5f;
                    break;
                case 6:
                    ExoDownloadedPlayerTwo.this.T2("1.75x");
                    ExoDownloadedPlayerTwo.this.f33675Z.setText(ExoDownloadedPlayerTwo.this.getResources().getString(a7.j.f13334n7) + " (1.75x)");
                    nSTIJKPlayerEpisodes = ExoDownloadedPlayerTwo.this.f33776x;
                    f9 = 1.75f;
                    break;
                case 7:
                    ExoDownloadedPlayerTwo.this.T2("2x");
                    ExoDownloadedPlayerTwo.this.f33675Z.setText(ExoDownloadedPlayerTwo.this.getResources().getString(a7.j.f13334n7) + " (2x)");
                    nSTIJKPlayerEpisodes = ExoDownloadedPlayerTwo.this.f33776x;
                    f9 = 2.0f;
                    break;
                default:
                    return;
            }
            nSTIJKPlayerEpisodes.setSpeed(f9);
            ExoDownloadedPlayerTwo.this.f33642Q2.x0(f9);
            dialogInterface.cancel();
        }
    }

    public class q implements DialogInterface.OnDismissListener {
        public q() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (ExoDownloadedPlayerTwo.this.f33776x != null) {
                ExoDownloadedPlayerTwo.this.f33776x.p2();
            }
        }
    }

    public class r implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f33806a;

        public r(View view) {
            this.f33806a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f33806a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f33806a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f33806a, "scaleY", f9);
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
            int i9;
            LinearLayout linearLayout2;
            View view5;
            View view6;
            View view7;
            LinearLayout linearLayout3;
            if (z9) {
                f9 = z9 ? 1.08f : 1.0f;
                View view8 = this.f33806a;
                if (view8 == null || view8.getTag() == null || !this.f33806a.getTag().equals("1")) {
                    View view9 = this.f33806a;
                    if (view9 == null || view9.getTag() == null || !this.f33806a.getTag().equals("2")) {
                        View view10 = this.f33806a;
                        if (view10 == null || view10.getTag() == null || !this.f33806a.getTag().equals("3")) {
                            View view11 = this.f33806a;
                            if ((view11 != null && view11.getTag() != null && this.f33806a.getTag().equals("4")) || (((view5 = this.f33806a) != null && view5.getTag() != null && this.f33806a.getTag().equals("5")) || (((view6 = this.f33806a) != null && view6.getTag() != null && this.f33806a.getTag().equals("6")) || ((view7 = this.f33806a) != null && view7.getTag() != null && this.f33806a.getTag().equals("7"))))) {
                                view.setBackground(ExoDownloadedPlayerTwo.this.getResources().getDrawable(a7.e.f11953Q0));
                                return;
                            }
                            View view12 = this.f33806a;
                            if (view12 != null && view12.getTag() != null && this.f33806a.getTag().equals("8")) {
                                return;
                            }
                            View view13 = this.f33806a;
                            if (view13 == null || view13.getTag() == null || !this.f33806a.getTag().equals("9")) {
                                View view14 = this.f33806a;
                                if (view14 == null || view14.getTag() == null || !this.f33806a.getTag().equals("10")) {
                                    View view15 = this.f33806a;
                                    if (view15 == null || view15.getTag() == null || !this.f33806a.getTag().equals("11")) {
                                        View view16 = this.f33806a;
                                        if (view16 == null || view16.getTag() == null || !this.f33806a.getTag().equals("12")) {
                                            return;
                                        } else {
                                            linearLayout = ExoDownloadedPlayerTwo.this.f33640Q0;
                                        }
                                    } else {
                                        linearLayout = ExoDownloadedPlayerTwo.this.f33636P0;
                                    }
                                    i9 = a7.e.f12042p;
                                } else {
                                    view.setBackground(ExoDownloadedPlayerTwo.this.getResources().getDrawable(a7.e.f11950P0));
                                    b(f9);
                                    c(f9);
                                    linearLayout3 = ExoDownloadedPlayerTwo.this.f33632O0;
                                }
                            }
                        }
                        view.setBackground(ExoDownloadedPlayerTwo.this.getResources().getDrawable(a7.e.f11950P0));
                        b(f9);
                        c(f9);
                        return;
                    }
                    view.setBackground(ExoDownloadedPlayerTwo.this.getResources().getDrawable(a7.e.f11950P0));
                    b(f9);
                    c(f9);
                    linearLayout3 = ExoDownloadedPlayerTwo.this.f33615K;
                } else {
                    view.setBackground(ExoDownloadedPlayerTwo.this.getResources().getDrawable(a7.e.f11950P0));
                    b(f9);
                    c(f9);
                    linearLayout3 = ExoDownloadedPlayerTwo.this.f33619L;
                }
                linearLayout3.setVisibility(0);
                return;
            }
            if (z9) {
                return;
            }
            f9 = z9 ? 1.08f : 1.0f;
            View view17 = this.f33806a;
            if (view17 == null || view17.getTag() == null || !this.f33806a.getTag().equals("1")) {
                View view18 = this.f33806a;
                if (view18 == null || view18.getTag() == null || !this.f33806a.getTag().equals("2")) {
                    View view19 = this.f33806a;
                    if (view19 == null || view19.getTag() == null || !this.f33806a.getTag().equals("3")) {
                        View view20 = this.f33806a;
                        if ((view20 != null && view20.getTag() != null && this.f33806a.getTag().equals("4")) || (((view2 = this.f33806a) != null && view2.getTag() != null && this.f33806a.getTag().equals("5")) || (((view3 = this.f33806a) != null && view3.getTag() != null && this.f33806a.getTag().equals("6")) || ((view4 = this.f33806a) != null && view4.getTag() != null && this.f33806a.getTag().equals("7"))))) {
                            view.setBackground(null);
                            return;
                        }
                        View view21 = this.f33806a;
                        if (view21 != null && view21.getTag() != null && this.f33806a.getTag().equals("8")) {
                            return;
                        }
                        View view22 = this.f33806a;
                        if (view22 == null || view22.getTag() == null || !this.f33806a.getTag().equals("9")) {
                            View view23 = this.f33806a;
                            if (view23 == null || view23.getTag() == null || !this.f33806a.getTag().equals("10")) {
                                View view24 = this.f33806a;
                                if (view24 == null || view24.getTag() == null || !this.f33806a.getTag().equals("11")) {
                                    View view25 = this.f33806a;
                                    if (view25 == null || view25.getTag() == null || !this.f33806a.getTag().equals("12")) {
                                        return;
                                    } else {
                                        linearLayout = ExoDownloadedPlayerTwo.this.f33640Q0;
                                    }
                                } else {
                                    linearLayout = ExoDownloadedPlayerTwo.this.f33636P0;
                                }
                                i9 = a7.e.f12038o;
                            } else {
                                view.setBackground(ExoDownloadedPlayerTwo.this.getResources().getDrawable(a7.e.f11942N0));
                                b(f9);
                                c(f9);
                                a(z9);
                                linearLayout2 = ExoDownloadedPlayerTwo.this.f33632O0;
                            }
                        }
                    }
                    view.setBackground(ExoDownloadedPlayerTwo.this.getResources().getDrawable(a7.e.f11942N0));
                    b(f9);
                    c(f9);
                    a(z9);
                    return;
                }
                view.setBackground(ExoDownloadedPlayerTwo.this.getResources().getDrawable(a7.e.f11942N0));
                b(f9);
                c(f9);
                a(z9);
                linearLayout2 = ExoDownloadedPlayerTwo.this.f33615K;
            } else {
                view.setBackground(ExoDownloadedPlayerTwo.this.getResources().getDrawable(a7.e.f11942N0));
                b(f9);
                c(f9);
                a(z9);
                linearLayout2 = ExoDownloadedPlayerTwo.this.f33619L;
            }
            linearLayout2.setVisibility(8);
            return;
            linearLayout.setBackgroundResource(i9);
        }
    }

    public class s implements InterfaceC1699p {
        public s() {
        }

        public /* synthetic */ s(ExoDownloadedPlayerTwo exoDownloadedPlayerTwo, h hVar) {
            this();
        }

        @Override // d4.InterfaceC1699p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Pair a(C0909p1 c0909p1) {
            String string = ExoDownloadedPlayerTwo.this.getString(a7.j.f13065M1);
            Throwable cause = c0909p1.getCause();
            if (cause instanceof u.b) {
                u.b bVar = (u.b) cause;
                p3.t tVar = bVar.f46381d;
                string = tVar == null ? bVar.getCause() instanceof AbstractC2392B.c ? ExoDownloadedPlayerTwo.this.getString(a7.j.f13115R1) : bVar.f46380c ? ExoDownloadedPlayerTwo.this.getString(a7.j.f13095P1, bVar.f46379a) : ExoDownloadedPlayerTwo.this.getString(a7.j.f13085O1, bVar.f46379a) : ExoDownloadedPlayerTwo.this.getString(a7.j.f13075N1, tVar.f46299a);
            }
            return Pair.create(0, string);
        }
    }

    public class t implements InterfaceC0920t1.d {
        public t() {
        }

        public /* synthetic */ t(ExoDownloadedPlayerTwo exoDownloadedPlayerTwo, h hVar) {
            this();
        }

        private void C(String str) {
            ExoDownloadedPlayerTwo.this.f33690d2.b(a7.f.f12146G).e();
            ExoDownloadedPlayerTwo.this.f33690d2.b(a7.f.f12186K).c(str);
        }

        private void o() {
            ExoDownloadedPlayerTwo exoDownloadedPlayerTwo = ExoDownloadedPlayerTwo.this;
            if (exoDownloadedPlayerTwo.f33684b3 >= exoDownloadedPlayerTwo.f33687c3) {
                C(ExoDownloadedPlayerTwo.this.f33672Y0.getResources().getString(a7.j.f13214b7));
                ExoDownloadedPlayerTwo.this.U2();
                ExoDownloadedPlayerTwo.this.f33691d3 = false;
                ExoDownloadedPlayerTwo.f33571p3.setVisibility(8);
                return;
            }
            ExoDownloadedPlayerTwo exoDownloadedPlayerTwo2 = ExoDownloadedPlayerTwo.this;
            if (exoDownloadedPlayerTwo2.f33696e3) {
                return;
            }
            exoDownloadedPlayerTwo2.f33691d3 = true;
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void A(C1019e c1019e) {
            AbstractC0926v1.a(this, c1019e);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void B(boolean z9) {
            AbstractC0926v1.j(this, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public void E(int i9) {
            if (i9 == 2) {
                if (ExoDownloadedPlayerTwo.y2()) {
                    return;
                }
                if (ExoDownloadedPlayerTwo.this.f33761t0 != null && ExoDownloadedPlayerTwo.this.f33761t0.getVisibility() == 0) {
                    ExoDownloadedPlayerTwo.this.f33761t0.setVisibility(8);
                }
                ExoDownloadedPlayerTwo.f33571p3.setVisibility(0);
                return;
            }
            if (i9 == 4) {
                o();
                return;
            }
            if (i9 == 3) {
                if (ExoDownloadedPlayerTwo.this.f33695e2.getVisibility() == 0) {
                    ExoDownloadedPlayerTwo.this.f33761t0.setVisibility(0);
                }
                ExoDownloadedPlayerTwo.this.f33684b3 = 0;
                ExoDownloadedPlayerTwo.f33571p3.setVisibility(8);
                LiveStreamDBHandler liveStreamDBHandler = ExoDownloadedPlayerTwo.this.f33605H1;
            }
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void J(boolean z9) {
            AbstractC0926v1.y(this, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void M(int i9, boolean z9) {
            AbstractC0926v1.f(this, i9, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void O(InterfaceC0920t1.b bVar) {
            AbstractC0926v1.b(this, bVar);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void P() {
            AbstractC0926v1.w(this);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void S(InterfaceC0920t1.e eVar, InterfaceC0920t1.e eVar2, int i9) {
            AbstractC0926v1.v(this, eVar, eVar2, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void U(int i9, int i10) {
            AbstractC0926v1.A(this, i9, i10);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void V(Q1 q12, int i9) {
            AbstractC0926v1.B(this, q12, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void W(C0909p1 c0909p1) {
            AbstractC0926v1.s(this, c0909p1);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void Y(z zVar) {
            AbstractC0926v1.C(this, zVar);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void a(boolean z9) {
            AbstractC0926v1.z(this, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void a0(C0921u c0921u) {
            AbstractC0926v1.e(this, c0921u);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void b0(int i9) {
            AbstractC0926v1.u(this, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void d0(boolean z9) {
            AbstractC0926v1.h(this, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void e(C2540a c2540a) {
            AbstractC0926v1.m(this, c2540a);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void f0(V1 v12) {
            AbstractC0926v1.D(this, v12);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void g0(boolean z9, int i9) {
            AbstractC0926v1.t(this, z9, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void h0(H0 h02, int i9) {
            AbstractC0926v1.k(this, h02, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void i0(R0 r02) {
            AbstractC0926v1.l(this, r02);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void j(C1737C c1737c) {
            AbstractC0926v1.E(this, c1737c);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void j0(boolean z9, int i9) {
            AbstractC0926v1.n(this, z9, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void k(List list) {
            AbstractC0926v1.d(this, list);
        }

        @Override // O2.InterfaceC0920t1.d
        public void l0(C0909p1 c0909p1) {
            ExoDownloadedPlayerTwo exoDownloadedPlayerTwo = ExoDownloadedPlayerTwo.this;
            if (exoDownloadedPlayerTwo.f33696e3) {
                return;
            }
            if (c0909p1.f6177a == 1002) {
                exoDownloadedPlayerTwo.K2();
            } else if (!c0909p1.toString().contains("com.google.android.exoplayer2.ext.ffmpeg.FfmpegDecoderException")) {
                o();
            } else {
                w.P0(ExoDownloadedPlayerTwo.this.f33672Y0, "Audio track issue found. Please change the audio track to none.");
                ExoDownloadedPlayerTwo.this.K2();
            }
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void m0(InterfaceC0920t1 interfaceC0920t1, InterfaceC0920t1.c cVar) {
            AbstractC0926v1.g(this, interfaceC0920t1, cVar);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void n0(boolean z9) {
            AbstractC0926v1.i(this, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void onRepeatModeChanged(int i9) {
            AbstractC0926v1.x(this, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void t(C0917s1 c0917s1) {
            AbstractC0926v1.o(this, c0917s1);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void u(P3.f fVar) {
            AbstractC0926v1.c(this, fVar);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void z(int i9) {
            AbstractC0926v1.q(this, i9);
        }
    }

    public class u extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f33810a;

        public u() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (ExoDownloadedPlayerTwo.this.f33638P2 == null) {
                return true;
            }
            ExoDownloadedPlayerTwo.this.f33638P2.getWidth();
            motionEvent.getX();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            this.f33810a = true;
            return super.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (ExoDownloadedPlayerTwo.f33571p3.getVisibility() != 8) {
                return true;
            }
            ExoDownloadedPlayerTwo.this.n3();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    private void A2() {
        int iRound;
        int iR0;
        int iRound2;
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes;
        List list = this.f33613J1;
        if (list == null || list.size() <= 0) {
            return;
        }
        List list2 = this.f33660V0;
        if (list2 != null) {
            list2.clear();
        }
        if (this.f33729l1 != null) {
            if (this.f33776x != null) {
                this.f33725k2 = this.f33672Y0.getSharedPreferences("currentSeekTime", 0);
                long currentPosition = this.f33776x.getCurrentPosition();
                SharedPreferences sharedPreferences = this.f33672Y0.getSharedPreferences("currentSeekTime", 0);
                this.f33725k2 = sharedPreferences;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                this.f33730l2 = editorEdit;
                editorEdit.putString("currentSeekTime", String.valueOf(currentPosition));
                this.f33730l2.apply();
                if ((this.f33776x == null || C2966a.f().a() == null || !this.f33597F1.equals("m3u")) && C2966a.f() != null && C2966a.f().e() != null && currentPosition != -1 && currentPosition != 0) {
                    ArrayList arrayListC = this.f33738n1.c(C2966a.f().e());
                    this.f33594E2 = arrayListC;
                    if (arrayListC != null && arrayListC.size() > 0) {
                        try {
                            int iF2 = F2(this.f33613J1, w.r0(C2966a.f().e()));
                            GetEpisdoeDetailsCallback getEpisdoeDetailsCallback = new GetEpisdoeDetailsCallback();
                            getEpisdoeDetailsCallback.setId(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getId());
                            getEpisdoeDetailsCallback.setTitle(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getTitle());
                            getEpisdoeDetailsCallback.setContainerExtension(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getContainerExtension());
                            getEpisdoeDetailsCallback.setAdded(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getAdded());
                            getEpisdoeDetailsCallback.setSeriesCover(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getSeriesCover());
                            getEpisdoeDetailsCallback.setCategoryId(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getCategoryId());
                            getEpisdoeDetailsCallback.setElapsed_time(String.valueOf(currentPosition));
                            getEpisdoeDetailsCallback.setSeriesId(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getSeriesId());
                            getEpisdoeDetailsCallback.setImage(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getImage());
                            getEpisdoeDetailsCallback.setMovieImage(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getMovieImage());
                            getEpisdoeDetailsCallback.setMainSeriesImg(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getMainSeriesImg());
                            getEpisdoeDetailsCallback.setSeriesNum(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getSeriesNum());
                            getEpisdoeDetailsCallback.setSeasonNumber(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getSeasonNumber());
                            getEpisdoeDetailsCallback.setEpisodeNum(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getEpisodeNumber());
                            getEpisdoeDetailsCallback.setSeriesName(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getSeriesName());
                            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.f33776x;
                            getEpisdoeDetailsCallback.setDurationSec(nSTIJKPlayerEpisodes2 != null ? String.valueOf(nSTIJKPlayerEpisodes2.getDuration() / 1000) : ((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getDurationSec());
                            this.f33738n1.b(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getId());
                            this.f33738n1.i(this.f33672Y0, ((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getSeriesId());
                            this.f33738n1.g(this.f33672Y0, getEpisdoeDetailsCallback);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            ArrayList<GetEpisdoeDetailsCallback> allSeriesRecentWatch = this.f33729l1.getAllSeriesRecentWatch("getalldata");
            for (int i9 = 0; i9 < this.f33613J1.size(); i9++) {
                if (((GetEpisdoeDetailsCallback) this.f33613J1.get(i9)).getSeasonNumber().equals(Integer.valueOf(this.f33582B2))) {
                    GetEpisdoeDetailsCallback getEpisdoeDetailsCallback2 = (GetEpisdoeDetailsCallback) this.f33613J1.get(i9);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= allSeriesRecentWatch.size()) {
                            break;
                        }
                        if (((GetEpisdoeDetailsCallback) this.f33613J1.get(i9)).getId().equals(allSeriesRecentWatch.get(i10).getId())) {
                            getEpisdoeDetailsCallback2.setElapsed_time(allSeriesRecentWatch.get(i10).getElapsed_time());
                            try {
                                iRound = Math.round(Integer.parseInt(allSeriesRecentWatch.get(i10).getElapsed_time()) / 1000.0f);
                                try {
                                    iR0 = (!getEpisdoeDetailsCallback2.getDurationSec().equals("") || (nSTIJKPlayerEpisodes = this.f33776x) == null) ? w.r0(getEpisdoeDetailsCallback2.getDurationSec()) : nSTIJKPlayerEpisodes.getDuration() / 1000;
                                } catch (Exception unused2) {
                                    iR0 = 0;
                                }
                            } catch (Exception unused3) {
                                iRound = 0;
                            }
                            try {
                                iRound2 = Math.round((iRound / iR0) * 100.0f);
                            } catch (Exception unused4) {
                                iRound2 = 0;
                            }
                            getEpisdoeDetailsCallback2.setEpisode_watched_percentage(iRound2);
                        } else {
                            i10++;
                        }
                    }
                    this.f33660V0.add(getEpisdoeDetailsCallback2);
                }
            }
        }
    }

    private void B2(String str) {
        this.f33734m1.deleteMovieRecentWatch(str);
    }

    private void C2() {
        ImageView imageView = this.f33583C;
        imageView.setOnFocusChangeListener(new r(imageView));
        ImageView imageView2 = this.f33587D;
        imageView2.setOnFocusChangeListener(new r(imageView2));
        ImageView imageView3 = this.f33780y;
        imageView3.setOnFocusChangeListener(new r(imageView3));
        SeekBar seekBar = this.f33591E;
        seekBar.setOnFocusChangeListener(new r(seekBar));
        ImageView imageView4 = this.f33579B;
        imageView4.setOnFocusChangeListener(new r(imageView4));
        ImageView imageView5 = this.f33628N0;
        imageView5.setOnFocusChangeListener(new r(imageView5));
        LinearLayout linearLayout = this.f33595F;
        linearLayout.setOnFocusChangeListener(new r(linearLayout));
        LinearLayout linearLayout2 = this.f33599G;
        linearLayout2.setOnFocusChangeListener(new r(linearLayout2));
        LinearLayout linearLayout3 = this.f33603H;
        linearLayout3.setOnFocusChangeListener(new r(linearLayout3));
        LinearLayout linearLayout4 = this.f33611J;
        linearLayout4.setOnFocusChangeListener(new r(linearLayout4));
        ImageView imageView6 = this.f33623M;
        imageView6.setOnFocusChangeListener(new r(imageView6));
        ImageView imageView7 = this.f33627N;
        imageView7.setOnFocusChangeListener(new r(imageView7));
        ImageView imageView8 = this.f33773w0;
        imageView8.setOnFocusChangeListener(new r(imageView8));
        ImageView imageView9 = this.f33773w0;
        imageView9.setOnFocusChangeListener(new r(imageView9));
        TextView textView = this.f33584C0;
        textView.setOnFocusChangeListener(new r(textView));
        TextView textView2 = this.f33592E0;
        textView2.setOnFocusChangeListener(new r(textView2));
    }

    public static String D2(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    private ArrayList G2(int i9, int i10) {
        return this.f33734m1.getStreamStatus(String.valueOf(i9), i10);
    }

    private LiveStreamsDBModel H2(String str, int i9) {
        return this.f33605H1.getStreamStatus(str, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I2() {
        if (this.f33695e2.getVisibility() == 0) {
            this.f33695e2.startAnimation(this.f33699f1);
            if (this.f33745p0.getVisibility() == 0) {
                this.f33745p0.startAnimation(this.f33699f1);
            }
            if (this.f33708h0.getVisibility() == 0) {
                this.f33708h0.startAnimation(this.f33699f1);
            }
            if (this.f33761t0.getVisibility() == 0) {
                this.f33761t0.startAnimation(this.f33699f1);
            }
            if (this.f33713i0.getVisibility() == 0) {
                this.f33713i0.startAnimation(this.f33699f1);
            }
            if (this.f33749q0.getVisibility() == 0) {
                this.f33749q0.startAnimation(this.f33699f1);
            }
            this.f33695e2.setVisibility(8);
            if (this.f33745p0.getVisibility() == 0) {
                this.f33745p0.setVisibility(8);
            }
            if (this.f33708h0.getVisibility() == 0) {
                this.f33708h0.setVisibility(8);
            }
            if (this.f33761t0.getVisibility() == 0) {
                this.f33761t0.setVisibility(8);
            }
            if (this.f33713i0.getVisibility() == 0) {
                this.f33713i0.setVisibility(8);
            }
            if (this.f33749q0.getVisibility() == 0) {
                this.f33749q0.setVisibility(8);
            }
        }
        this.f33776x.f36576q = false;
    }

    private void L2() {
        this.f33598F2 = new Handler();
        this.f33714i1 = new Handler();
        this.f33676Z0 = AnimationUtils.loadAnimation(this.f33672Y0, a7.b.f11839q);
        this.f33679a1 = AnimationUtils.loadAnimation(this.f33672Y0, a7.b.f11840r);
        this.f33694e1 = AnimationUtils.loadAnimation(this.f33672Y0, a7.b.f11830h);
        this.f33699f1 = AnimationUtils.loadAnimation(this.f33672Y0, a7.b.f11831i);
        this.f33709h1 = AnimationUtils.loadAnimation(this.f33672Y0, a7.b.f11837o);
        this.f33704g1 = AnimationUtils.loadAnimation(this.f33672Y0, a7.b.f11836n);
        this.f33685c1 = AnimationUtils.loadAnimation(this.f33672Y0, a7.b.f11841s);
        this.f33689d1 = AnimationUtils.loadAnimation(this.f33672Y0, a7.b.f11842t);
        this.f33682b1 = AnimationUtils.loadAnimation(this.f33672Y0, a7.b.f11838p);
        this.f33681a3 = AnimationUtils.loadAnimation(this.f33672Y0, a7.b.f11833k);
        try {
            c3();
        } catch (Exception unused) {
        }
        if (this.f33751q2.equals("mobile")) {
            try {
                C2325b c2325bE = C2325b.e(this);
                this.f33771v2 = c2325bE;
                this.f33767u2 = c2325bE.c().c();
                AbstractC2324a.b(getApplicationContext(), this.f33608I0);
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M2(DialogInterface dialogInterface) {
        this.f33646R2 = false;
    }

    private void O2() {
        List list;
        int iD = C2966a.f().d();
        String str = this.f33686c2;
        str.hashCode();
        if (str.equals("series") && (list = this.f33613J1) != null && list.size() > 0 && iD == this.f33613J1.size() - 1) {
            C2966a.f().w(0);
        } else {
            C2966a.f().w(iD + 1);
        }
    }

    private void P2() {
        this.f33583C.setOnClickListener(this);
        this.f33587D.setOnClickListener(this);
        this.f33784z.setOnClickListener(this);
        this.f33780y.setOnClickListener(this);
        this.f33591E.setOnClickListener(this);
        this.f33575A.setOnClickListener(this);
        this.f33579B.setOnClickListener(this);
        this.f33595F.setOnClickListener(this);
        this.f33599G.setOnClickListener(this);
        this.f33603H.setOnClickListener(this);
        this.f33611J.setOnClickListener(this);
        this.f33623M.setOnClickListener(this);
        this.f33627N.setOnClickListener(this);
        this.f33777x0.setOnClickListener(this);
        this.f33785z0.setOnClickListener(this);
        this.f33628N0.setOnClickListener(this);
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                this.f33776x.setMovieListener(this.f33721j3);
            } catch (Exception unused) {
            }
        }
        this.f33708h0.setOnClickListener(this);
        this.f33713i0.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q2() {
        String strSubstring;
        MediaInfo mediaInfoA;
        C2328e c2328e;
        try {
            String type = SharepreferenceDBHandler.getType(this.f33672Y0);
            strSubstring = "";
            if (type.equals("loadurl")) {
                String str = this.f33715i2;
                this.f33720j2 = str;
                int iLastIndexOf = str.lastIndexOf(47);
                strSubstring = iLastIndexOf > 1 ? this.f33720j2.substring(iLastIndexOf + 1) : "";
                String str2 = this.f33720j2;
                this.f33775w2 = str2;
                mediaInfoA = AbstractC1902a.a(strSubstring, "", "", 0, str2, "videos/mp4", this.f33783y2, "", null);
                c2328e = this.f33767u2;
            } else {
                int ipAddress = ((WifiManager) getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress();
                String str3 = String.format("%d.%d.%d.%d", Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255), Integer.valueOf((ipAddress >> 24) & 255));
                String strSubstring2 = InstructionFileId.DOT;
                if (type.equals("devicedata")) {
                    this.f33720j2 = this.f33715i2;
                }
                int iLastIndexOf2 = this.f33720j2.lastIndexOf(47);
                if (iLastIndexOf2 > 1) {
                    strSubstring = this.f33720j2.substring(iLastIndexOf2 + 1);
                    strSubstring2 = this.f33720j2.substring(0, iLastIndexOf2);
                }
                String str4 = strSubstring;
                this.f33634O2.b();
                this.f33634O2.a(str3, strSubstring2);
                String str5 = "http://" + str3 + ":8080/" + str4;
                this.f33775w2 = str5;
                mediaInfoA = AbstractC1902a.a(str4, "", "", 0, str5, "videos/mp4", this.f33783y2, "", null);
                c2328e = this.f33767u2;
            }
            AbstractC1902a.c(0, true, mediaInfoA, c2328e, this.f33672Y0);
        } catch (Exception unused) {
        }
    }

    private void R2() {
        try {
            SharedPreferences.Editor editorEdit = this.f33755r2.edit();
            this.f33759s2 = editorEdit;
            if (editorEdit != null) {
                editorEdit.putString("pref.using_playback_speed", "1x (Normal)");
                this.f33759s2.apply();
            }
            this.f33675Z.setText(getResources().getString(a7.j.f13334n7) + " (1x)");
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void S2() {
        /*
            r17 = this;
            r0 = r17
            r1 = 8
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r1]
            java.lang.String r2 = "0.25x"
            r3 = 0
            r1[r3] = r2
            java.lang.String r4 = "0.5x"
            r5 = 1
            r1[r5] = r4
            java.lang.String r6 = "0.75x"
            r7 = 2
            r1[r7] = r6
            java.lang.String r8 = "1x (Normal)"
            r9 = 3
            r1[r9] = r8
            java.lang.String r10 = "1.25x"
            r11 = 4
            r1[r11] = r10
            java.lang.String r12 = "1.5x"
            r13 = 5
            r1[r13] = r12
            java.lang.String r14 = "1.75x"
            r15 = 6
            r1[r15] = r14
            java.lang.String r3 = "2x"
            r16 = 7
            r1[r16] = r3
            androidx.appcompat.app.a$a r5 = new androidx.appcompat.app.a$a
            r5.<init>(r0)
            android.content.res.Resources r7 = r17.getResources()
            int r9 = a7.j.f13282i5
            java.lang.String r7 = r7.getString(r9)
            r5.setTitle(r7)
            android.content.SharedPreferences r7 = r0.f33755r2
            java.lang.String r9 = "pref.using_playback_speed"
            java.lang.String r7 = r7.getString(r9, r8)
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L51
        L4f:
            r3 = 0
            goto L88
        L51:
            boolean r2 = r7.equals(r4)
            if (r2 == 0) goto L59
            r3 = 1
            goto L88
        L59:
            boolean r2 = r7.equals(r6)
            if (r2 == 0) goto L61
            r3 = 2
            goto L88
        L61:
            boolean r2 = r7.equals(r8)
            if (r2 == 0) goto L69
            r3 = 3
            goto L88
        L69:
            boolean r2 = r7.equals(r10)
            if (r2 == 0) goto L71
            r3 = 4
            goto L88
        L71:
            boolean r2 = r7.equals(r12)
            if (r2 == 0) goto L79
            r3 = 5
            goto L88
        L79:
            boolean r2 = r7.equals(r14)
            if (r2 == 0) goto L81
            r3 = 6
            goto L88
        L81:
            boolean r2 = r7.equals(r3)
            if (r2 == 0) goto L4f
            r3 = 7
        L88:
            com.nst.iptvsmarterstvbox.view.demo.ExoDownloadedPlayerTwo$p r2 = new com.nst.iptvsmarterstvbox.view.demo.ExoDownloadedPlayerTwo$p
            r2.<init>()
            r5.l(r1, r3, r2)
            androidx.appcompat.app.a r1 = r5.create()
            r0.f33602G2 = r1
            com.nst.iptvsmarterstvbox.view.demo.ExoDownloadedPlayerTwo$q r2 = new com.nst.iptvsmarterstvbox.view.demo.ExoDownloadedPlayerTwo$q
            r2.<init>()
            r1.setOnDismissListener(r2)
            androidx.appcompat.app.a r1 = r0.f33602G2
            r1.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.ExoDownloadedPlayerTwo.S2():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T2(String str) {
        SharedPreferences.Editor editorEdit = this.f33755r2.edit();
        this.f33759s2 = editorEdit;
        if (editorEdit != null) {
            editorEdit.putString("pref.using_playback_speed", str);
            this.f33759s2.apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U2() {
        try {
            if (this.f33776x != null) {
                this.f33725k2 = this.f33672Y0.getSharedPreferences("currentSeekTime", 0);
                long currentPosition = this.f33776x.getCurrentPosition();
                SharedPreferences sharedPreferences = this.f33672Y0.getSharedPreferences("currentSeekTime", 0);
                this.f33725k2 = sharedPreferences;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                this.f33730l2 = editorEdit;
                editorEdit.putString("currentSeekTime", String.valueOf(currentPosition));
                this.f33730l2.apply();
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f33776x;
                if (nSTIJKPlayerEpisodes != null && currentPosition != -1 && currentPosition != 0) {
                    nSTIJKPlayerEpisodes.setCurrentPositionSeekbar(nSTIJKPlayerEpisodes.getCurrentPosition());
                    this.f33776x.setProgress(true);
                    this.f33776x.E2(true);
                }
                String str = this.f33686c2;
                if (str == null || !str.equals("movies")) {
                    String str2 = this.f33686c2;
                    if (str2 != null && str2.equals("series") && ((this.f33776x == null || C2966a.f().a() == null || !this.f33597F1.equals("m3u")) && C2966a.f() != null && C2966a.f().e() != null && currentPosition != -1 && currentPosition != 0)) {
                        ArrayList arrayListC = this.f33738n1.c(C2966a.f().e());
                        this.f33594E2 = arrayListC;
                        if (arrayListC != null && arrayListC.size() > 0) {
                            try {
                                int iF2 = F2(this.f33613J1, w.r0(C2966a.f().e()));
                                GetEpisdoeDetailsCallback getEpisdoeDetailsCallback = new GetEpisdoeDetailsCallback();
                                getEpisdoeDetailsCallback.setId(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getId());
                                getEpisdoeDetailsCallback.setTitle(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getTitle());
                                getEpisdoeDetailsCallback.setContainerExtension(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getContainerExtension());
                                getEpisdoeDetailsCallback.setAdded(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getAdded());
                                getEpisdoeDetailsCallback.setSeriesCover(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getSeriesCover());
                                getEpisdoeDetailsCallback.setCategoryId(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getCategoryId());
                                getEpisdoeDetailsCallback.setElapsed_time(String.valueOf(currentPosition));
                                getEpisdoeDetailsCallback.setSeriesId(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getSeriesId());
                                getEpisdoeDetailsCallback.setImage(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getImage());
                                getEpisdoeDetailsCallback.setMovieImage(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getMovieImage());
                                getEpisdoeDetailsCallback.setMainSeriesImg(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getMainSeriesImg());
                                getEpisdoeDetailsCallback.setSeriesNum(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getSeriesNum());
                                getEpisdoeDetailsCallback.setSeasonNumber(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getSeasonNumber());
                                getEpisdoeDetailsCallback.setEpisodeNum(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getEpisodeNumber());
                                getEpisdoeDetailsCallback.setSeriesName(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getSeriesName());
                                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.f33776x;
                                getEpisdoeDetailsCallback.setDurationSec(nSTIJKPlayerEpisodes2 != null ? String.valueOf(nSTIJKPlayerEpisodes2.getDuration() / 1000) : ((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getDurationSec());
                                this.f33738n1.b(((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getId());
                                this.f33738n1.i(this.f33672Y0, ((GetEpisdoeDetailsCallback) this.f33613J1.get(iF2)).getSeriesId());
                                this.f33738n1.g(this.f33672Y0, getEpisdoeDetailsCallback);
                            } catch (Exception unused) {
                            }
                        }
                    }
                } else {
                    W2(1);
                }
            }
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes3 = this.f33776x;
            if (nSTIJKPlayerEpisodes3 != null) {
                if (nSTIJKPlayerEpisodes3.t2()) {
                    this.f33776x.j2();
                } else {
                    this.f33776x.e3();
                    this.f33776x.C2(true);
                    this.f33776x.a3();
                }
                IjkMediaPlayer.native_profileEnd();
            }
        } catch (Exception unused2) {
        }
    }

    private void W2(int i9) {
        long currentPosition;
        ArrayList arrayListG2;
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f33776x;
        if (nSTIJKPlayerEpisodes != null) {
            if (i9 == 0) {
                this.f33725k2 = this.f33672Y0.getSharedPreferences("currentSeekTime", 0);
                currentPosition = this.f33776x.getCurrentPosition();
                SharedPreferences sharedPreferences = this.f33672Y0.getSharedPreferences("currentSeekTime", 0);
                this.f33725k2 = sharedPreferences;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                this.f33730l2 = editorEdit;
                editorEdit.putString("currentSeekTime", String.valueOf(currentPosition));
                this.f33730l2.apply();
            } else {
                currentPosition = nSTIJKPlayerEpisodes.getCurrentPosition();
            }
            long j9 = currentPosition;
            new LiveStreamsDBModel();
            if (this.f33597F1.equals("m3u")) {
                H2(String.valueOf(Uri.parse(this.f33719j1)), SharepreferenceDBHandler.getUserID(this.f33672Y0));
                return;
            }
            if (this.f33776x == null || C2966a.f().k() == -1 || j9 == -1 || j9 == 0 || (arrayListG2 = G2(this.f33657U1, SharepreferenceDBHandler.getUserID(this.f33672Y0))) == null || arrayListG2.size() <= 0) {
                return;
            }
            try {
                int iE2 = E2(this.f33609I1, this.f33657U1);
                B2(((LiveStreamsDBModel) this.f33609I1.get(iE2)).getStreamId());
                Z2(this.f33672Y0, this.f33609I1, iE2, j9);
            } catch (Exception unused) {
            }
        }
    }

    private void X2() {
        TextView textView;
        StringBuilder sb;
        j3();
        if (x2() || this.f33638P2 == null || this.f33728l0.getVisibility() != 8) {
            return;
        }
        this.f33735m2.removeCallbacksAndMessages(null);
        String str = this.f33705g2;
        if (str != null && !str.equals("")) {
            this.f33739n2 -= 10000;
        }
        String str2 = this.f33686c2;
        this.f33739n2 = (str2 == null || !str2.equals("catch_up")) ? this.f33739n2 - 10000 : this.f33739n2 - DateTimeConstants.MILLIS_PER_MINUTE;
        if (this.f33739n2 > 0) {
            textView = this.f33723k0;
            sb = new StringBuilder();
            sb.append("+");
        } else {
            textView = this.f33723k0;
            sb = new StringBuilder();
        }
        sb.append(this.f33739n2 / 1000);
        sb.append("s");
        textView.setText(sb.toString());
        this.f33708h0.setText("");
        this.f33708h0.startAnimation(this.f33685c1);
        this.f33708h0.setVisibility(0);
        if (this.f33733m0.getVisibility() == 8) {
            this.f33733m0.startAnimation(this.f33682b1);
            this.f33733m0.setVisibility(0);
        } else {
            this.f33733m0.startAnimation(this.f33685c1);
        }
        this.f33735m2.postDelayed(new n(), 1000L);
    }

    private void a3() {
        RecyclerView recyclerView = this.f33703g0;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f33672Y0, 1);
            this.f33668X0 = gridLayoutManager;
            this.f33703g0.setLayoutManager(gridLayoutManager);
            this.f33703g0.setItemAnimator(new androidx.recyclerview.widget.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b3() {
        int currentPosition = (int) this.f33642Q2.getCurrentPosition();
        int duration = (int) this.f33642Q2.getDuration();
        SeekBar seekBar = this.f33591E;
        if (seekBar != null) {
            if (duration > 0) {
                seekBar.setProgress((int) ((((long) currentPosition) * 1000) / ((long) duration)));
            }
            this.f33591E.setSecondaryProgress(this.f33776x.getBufferPercentage() * 10);
        }
        return currentPosition;
    }

    private void c3() {
        this.f33590D2 = new m();
    }

    private void d3() {
        this.f33695e2.startAnimation(this.f33699f1);
        this.f33695e2.setVisibility(8);
        this.f33693e0.startAnimation(this.f33694e1);
        this.f33693e0.setVisibility(0);
        List list = this.f33660V0;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f33769v0.setText(getResources().getString(a7.j.f13040J6) + " - " + ((GetEpisdoeDetailsCallback) this.f33660V0.get(0)).getSeasonNumber());
        try {
            a3();
            C2630n c2630n = new C2630n(this.f33672Y0, null, null, null, "from_player", this.f33751q2, this.f33703g0);
            this.f33664W0 = c2630n;
            this.f33703g0.setAdapter(c2630n);
            this.f33703g0.requestFocus();
        } catch (Exception unused) {
        }
    }

    private void g3(int i9) {
        h3(getString(i9));
    }

    private void h3(String str) {
        Toast.makeText(getApplicationContext(), str, 1).show();
    }

    private void i3() {
        try {
            if (this.f33646R2 || !com.nst.iptvsmarterstvbox.view.demo.b.b0(this.f33642Q2)) {
                return;
            }
            this.f33646R2 = true;
            com.nst.iptvsmarterstvbox.view.demo.b.P(this.f33642Q2, new DialogInterface.OnDismissListener() { // from class: r7.f
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f49787a.M2(dialogInterface);
                }
            }).show(getSupportFragmentManager(), (String) null);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n3() {
        j3();
        if (this.f33695e2.getVisibility() == 0) {
            I2();
            return;
        }
        e3();
        v2(5000);
        w2(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
    }

    private void o3() {
        LinearLayout linearLayout = this.f33744p;
        if (linearLayout != null) {
            linearLayout.setClickable(true);
            this.f33744p.setOnTouchListener(new e());
        }
    }

    private void p3() {
    }

    private void r3() {
        I1 i12 = this.f33642Q2;
        if (i12 != null) {
            this.f33670X2 = i12.E();
            this.f33674Y2 = this.f33642Q2.l0();
            this.f33678Z2 = Math.max(0L, this.f33642Q2.R());
        }
    }

    private void s3() {
        Z3.m mVar = this.f33658U2;
        if (mVar != null) {
            this.f33662V2 = mVar.c();
        }
    }

    private void u2(Configuration configuration) {
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes;
        boolean z9;
        View decorView = getWindow().getDecorView();
        if (configuration.orientation == 2) {
            decorView.setSystemUiVisibility(5894);
            nSTIJKPlayerEpisodes = this.f33776x;
            z9 = false;
        } else {
            decorView.setSystemUiVisibility(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH);
            nSTIJKPlayerEpisodes = this.f33776x;
            z9 = true;
        }
        nSTIJKPlayerEpisodes.setAdjustViewBounds(z9);
    }

    private void v2(int i9) {
        if (f33573r3) {
            return;
        }
        this.f33638P2.f25867v = new a();
        PlayerView playerView = this.f33638P2;
        playerView.f25865u.postDelayed(playerView.f25867v, i9);
    }

    public static boolean y2() {
        ProgressBar progressBar = f33571p3;
        return progressBar != null && progressBar.getVisibility() == 0;
    }

    public int E2(ArrayList arrayList, int i9) {
        return 7;
    }

    public int F2(List list, int i9) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (w.r0(((GetEpisdoeDetailsCallback) list.get(i10)).getId()) == i9) {
                return i10;
            }
        }
        return 0;
    }

    public void J2() {
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f33776x;
        if (nSTIJKPlayerEpisodes != null) {
            nSTIJKPlayerEpisodes.p2();
            this.f33776x.f36504a3.removeMessages(1);
        }
        if (!f33573r3 && this.f33695e2.getVisibility() == 0) {
            this.f33695e2.startAnimation(this.f33699f1);
            if (this.f33745p0.getVisibility() == 0) {
                this.f33745p0.startAnimation(this.f33699f1);
            }
            if (this.f33708h0.getVisibility() == 0) {
                this.f33708h0.startAnimation(this.f33699f1);
            }
            if (this.f33761t0.getVisibility() == 0) {
                this.f33761t0.startAnimation(this.f33699f1);
            }
            if (this.f33713i0.getVisibility() == 0) {
                this.f33713i0.startAnimation(this.f33699f1);
            }
            if (this.f33749q0.getVisibility() == 0) {
                this.f33749q0.startAnimation(this.f33699f1);
            }
            this.f33695e2.setVisibility(8);
            if (this.f33745p0.getVisibility() == 0) {
                this.f33745p0.setVisibility(8);
            }
            if (this.f33708h0.getVisibility() == 0) {
                this.f33708h0.setVisibility(8);
            }
            if (this.f33761t0.getVisibility() == 0) {
                this.f33761t0.setVisibility(8);
            }
            if (this.f33713i0.getVisibility() == 0) {
                this.f33713i0.setVisibility(8);
            }
            if (this.f33749q0.getVisibility() == 0) {
                this.f33749q0.setVisibility(8);
            }
        }
        if (f33573r3 || this.f33695e2.getVisibility() != 0) {
            return;
        }
        this.f33695e2.startAnimation(this.f33699f1);
        if (this.f33745p0.getVisibility() == 0) {
            this.f33745p0.startAnimation(this.f33699f1);
        }
        if (this.f33708h0.getVisibility() == 0) {
            this.f33708h0.startAnimation(this.f33699f1);
        }
        if (this.f33761t0.getVisibility() == 0) {
            this.f33761t0.startAnimation(this.f33699f1);
        }
        if (this.f33713i0.getVisibility() == 0) {
            this.f33713i0.startAnimation(this.f33699f1);
        }
        if (this.f33749q0.getVisibility() == 0) {
            this.f33749q0.startAnimation(this.f33699f1);
        }
        this.f33695e2.setVisibility(8);
        if (this.f33745p0.getVisibility() == 0) {
            this.f33745p0.setVisibility(8);
        }
        if (this.f33708h0.getVisibility() == 0) {
            this.f33708h0.setVisibility(8);
        }
        if (this.f33761t0.getVisibility() == 0) {
            this.f33761t0.setVisibility(8);
        }
        if (this.f33713i0.getVisibility() == 0) {
            this.f33713i0.setVisibility(8);
        }
        if (this.f33749q0.getVisibility() == 0) {
            this.f33749q0.setVisibility(8);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0084, code lost:
    
        r17 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0091, code lost:
    
        r17 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009e, code lost:
    
        r17 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0080, code lost:
    
        r17 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0082 A[PHI: r17
      0x0082: PHI (r17v8 java.lang.String) = (r17v4 java.lang.String), (r17v5 java.lang.String), (r17v6 java.lang.String), (r17v9 java.lang.String) binds: [B:19:0x00a6, B:15:0x0099, B:11:0x008c, B:8:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean K2() {
        /*
            Method dump skipped, instruction units count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.ExoDownloadedPlayerTwo.K2():boolean");
    }

    public void N2() {
        if (this.f33776x == null) {
            return;
        }
        w2(0);
        int i9 = Build.VERSION.SDK_INT;
        Rational rational = (this.f33776x.G2() == 0 || this.f33776x.F2() == 0) ? new Rational(this.f33776x.getWidth(), this.f33776x.getHeight()) : new Rational(this.f33776x.G2(), this.f33776x.F2());
        if (i9 >= 26) {
            try {
                this.f33618K2.setAspectRatio(rational).build();
                enterPictureInPictureMode(this.f33618K2.build());
            } catch (Exception unused) {
                this.f33618K2.setAspectRatio(new Rational(this.f33776x.getWidth(), this.f33776x.getHeight())).build();
                enterPictureInPictureMode(this.f33618K2.build());
            }
        }
    }

    public void V2() {
        if (this.f33642Q2 != null) {
            s3();
            r3();
            this.f33642Q2.release();
            this.f33642Q2 = null;
            this.f33654T2 = Collections.emptyList();
            this.f33658U2 = null;
        }
    }

    public void Y2() {
        TextView textView;
        StringBuilder sb;
        j3();
        if (x2() || this.f33638P2 == null || this.f33733m0.getVisibility() != 8) {
            return;
        }
        this.f33735m2.removeCallbacksAndMessages(null);
        String str = this.f33705g2;
        if (str != null && !str.equals("")) {
            this.f33739n2 += Constants.MAXIMUM_UPLOAD_PARTS;
        }
        String str2 = this.f33686c2;
        if (str2 == null || !str2.equals("catch_up")) {
            this.f33739n2 += Constants.MAXIMUM_UPLOAD_PARTS;
        } else {
            this.f33739n2 += DateTimeConstants.MILLIS_PER_MINUTE;
        }
        if (this.f33739n2 > 0) {
            textView = this.f33718j0;
            sb = new StringBuilder();
            sb.append("+");
        } else {
            textView = this.f33718j0;
            sb = new StringBuilder();
        }
        sb.append(this.f33739n2 / 1000);
        sb.append("s");
        textView.setText(sb.toString());
        this.f33713i0.setText("");
        this.f33713i0.startAnimation(this.f33685c1);
        this.f33713i0.setVisibility(0);
        if (this.f33728l0.getVisibility() == 8) {
            this.f33728l0.startAnimation(this.f33682b1);
            this.f33728l0.setVisibility(0);
        } else {
            this.f33728l0.startAnimation(this.f33685c1);
        }
        this.f33735m2.postDelayed(new o(), 1000L);
    }

    public void Z2(Context context, ArrayList arrayList, int i9, long j9) {
        String num = ((LiveStreamsDBModel) arrayList.get(i9)).getNum();
        String name = ((LiveStreamsDBModel) arrayList.get(i9)).getName();
        String streamType = ((LiveStreamsDBModel) arrayList.get(i9)).getStreamType();
        String streamId = ((LiveStreamsDBModel) arrayList.get(i9)).getStreamId();
        String streamIcon = ((LiveStreamsDBModel) arrayList.get(i9)).getStreamIcon();
        String epgChannelId = ((LiveStreamsDBModel) arrayList.get(i9)).getEpgChannelId();
        String added = ((LiveStreamsDBModel) arrayList.get(i9)).getAdded();
        String categoryId = ((LiveStreamsDBModel) arrayList.get(i9)).getCategoryId();
        String customSid = ((LiveStreamsDBModel) arrayList.get(i9)).getCustomSid();
        String tvArchive = ((LiveStreamsDBModel) arrayList.get(i9)).getTvArchive();
        String directSource = ((LiveStreamsDBModel) arrayList.get(i9)).getDirectSource();
        String tvArchiveDuration = ((LiveStreamsDBModel) arrayList.get(i9)).getTvArchiveDuration();
        String typeName = ((LiveStreamsDBModel) arrayList.get(i9)).getTypeName();
        String categoryName = ((LiveStreamsDBModel) arrayList.get(i9)).getCategoryName();
        String seriesNo = ((LiveStreamsDBModel) arrayList.get(i9)).getSeriesNo();
        String live = ((LiveStreamsDBModel) arrayList.get(i9)).getLive();
        String contaiinerExtension = ((LiveStreamsDBModel) arrayList.get(i9)).getContaiinerExtension();
        String.valueOf(((LiveStreamsDBModel) arrayList.get(i9)).getMovieDuraton());
        String strValueOf = String.valueOf(((LiveStreamsDBModel) arrayList.get(i9)).getRatingFromTen());
        String strValueOf2 = String.valueOf(((LiveStreamsDBModel) arrayList.get(i9)).getRatingFromFive());
        PanelAvailableChannelsPojo panelAvailableChannelsPojo = new PanelAvailableChannelsPojo();
        panelAvailableChannelsPojo.setNum(Integer.valueOf(w.r0(num)));
        panelAvailableChannelsPojo.setName(name);
        panelAvailableChannelsPojo.setStreamType(streamType);
        panelAvailableChannelsPojo.setStreamId(streamId);
        panelAvailableChannelsPojo.setStreamIcon(streamIcon);
        panelAvailableChannelsPojo.setEpgChannelId(epgChannelId);
        panelAvailableChannelsPojo.setAdded(added);
        panelAvailableChannelsPojo.setCategoryId(categoryId);
        panelAvailableChannelsPojo.setCustomSid(customSid);
        panelAvailableChannelsPojo.setTvArchive(Integer.valueOf(w.r0(tvArchive)));
        panelAvailableChannelsPojo.setDirectSource(directSource);
        panelAvailableChannelsPojo.setTvArchiveDuration(tvArchiveDuration);
        panelAvailableChannelsPojo.setTypeName(typeName);
        panelAvailableChannelsPojo.setCategoryName(categoryName);
        panelAvailableChannelsPojo.setSeriesNo(seriesNo);
        panelAvailableChannelsPojo.setLive(live);
        panelAvailableChannelsPojo.setContainerExtension(contaiinerExtension);
        panelAvailableChannelsPojo.setUserIdReferred(SharepreferenceDBHandler.getUserID(context));
        long j10 = 0;
        try {
            panelAvailableChannelsPojo.setMovieElapsedTime(j9);
        } catch (Exception unused) {
            panelAvailableChannelsPojo.setMovieElapsedTime(0L);
        }
        int i10 = this.f33661V1;
        if (i10 != 0) {
            try {
                panelAvailableChannelsPojo.setMovieDuration(i10);
            } catch (Exception unused2) {
                panelAvailableChannelsPojo.setMovieDuration(j10);
            }
            panelAvailableChannelsPojo.setRatingFromTen(strValueOf);
            panelAvailableChannelsPojo.setRatingFromFive(strValueOf2);
            this.f33734m1.addAllAvailableChannel(panelAvailableChannelsPojo);
        }
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f33776x;
        if (nSTIJKPlayerEpisodes != null) {
            int duration = nSTIJKPlayerEpisodes.getDuration() / 1000;
            this.f33661V1 = duration;
            j10 = duration;
        }
        panelAvailableChannelsPojo.setMovieDuration(j10);
        panelAvailableChannelsPojo.setRatingFromTen(strValueOf);
        panelAvailableChannelsPojo.setRatingFromFive(strValueOf2);
        this.f33734m1.addAllAvailableChannel(panelAvailableChannelsPojo);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return false;
    }

    @Override // androidx.appcompat.app.b, D.AbstractActivityC0525h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f33638P2.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public void e3() {
        ImageView imageView;
        if (f33573r3) {
            this.f33638P2.M();
            this.f33638P2.p(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
            return;
        }
        if (!x2() && this.f33698f0.getVisibility() == 8 && this.f33695e2.getVisibility() == 8) {
            this.f33695e2.startAnimation(this.f33694e1);
            this.f33695e2.setVisibility(0);
            Log.i("calledHere", "hereForPlayPause");
            try {
                this.f33708h0.setVisibility(0);
                this.f33713i0.setVisibility(0);
                this.f33745p0.setVisibility(0);
                this.f33749q0.setVisibility(0);
                if (f33571p3.getVisibility() == 0) {
                    this.f33761t0.setVisibility(8);
                } else {
                    this.f33761t0.setVisibility(0);
                }
                if (this.f33642Q2.isPlaying()) {
                    this.f33587D.setVisibility(0);
                    imageView = this.f33583C;
                } else {
                    this.f33583C.setVisibility(0);
                    imageView = this.f33587D;
                }
                imageView.setVisibility(8);
            } catch (Exception unused) {
            }
        }
    }

    public void f3() {
        if (f33573r3 || x2() || this.f33695e2.getVisibility() != 8) {
            return;
        }
        this.f33695e2.startAnimation(this.f33694e1);
        this.f33695e2.setVisibility(0);
        if (this.f33745p0.getVisibility() == 8) {
            this.f33745p0.startAnimation(this.f33694e1);
            this.f33745p0.setVisibility(0);
        }
        if (this.f33708h0.getVisibility() == 8) {
            this.f33708h0.startAnimation(this.f33694e1);
            this.f33708h0.setVisibility(0);
        }
        if (this.f33761t0.getVisibility() == 8) {
            this.f33761t0.startAnimation(this.f33694e1);
            this.f33761t0.setVisibility(0);
        }
        if (this.f33713i0.getVisibility() == 8) {
            this.f33713i0.startAnimation(this.f33694e1);
            this.f33713i0.setVisibility(0);
        }
        if (this.f33749q0.getVisibility() == 8) {
            this.f33749q0.startAnimation(this.f33694e1);
            this.f33749q0.setVisibility(0);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return false;
    }

    public void j3() {
        Handler handler;
        if (f33573r3 || x2() || (handler = this.f33638P2.f25865u) == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    public void k3() {
        Handler handler = this.f33598F2;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        RelativeLayout relativeLayout = this.f33620L0;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }

    public String l3(int i9) {
        int i10 = i9 / 1000;
        int i11 = i10 % 60;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 / 3600;
        try {
            this.f33712i.setLength(0);
            return i13 > 0 ? this.f33717j.format("%d:%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i12), Integer.valueOf(i11)).toString() : this.f33717j.format("%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i11)).toString();
        } catch (Exception unused) {
            return this.f33717j.format("%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i11)).toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m3() {
        /*
            r6 = this;
            int r0 = r6.f33748q
            r1 = 1
            int r0 = r0 + r1
            r6.f33748q = r0
            java.lang.String r0 = "loginPrefs"
            r2 = 0
            android.content.SharedPreferences r0 = r6.getSharedPreferences(r0, r2)
            r6.f33756s = r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r6.f33760t = r0
            int r0 = r6.f33748q
            int[] r3 = com.nst.iptvsmarterstvbox.view.demo.ExoDownloadedPlayerTwo.f33568m3
            int r4 = r3.length
            int r0 = r0 % r4
            r6.f33748q = r0
            r0 = r3[r0]
            r6.f33752r = r0
            int r0 = a7.f.f12319X6
            android.view.View r0 = r6.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            int r3 = a7.f.f12471n
            android.view.View r3 = r6.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "ratio:"
            r4.append(r5)
            int r5 = r6.f33752r
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "aspectRatioIS"
            android.util.Log.i(r5, r4)
            com.google.android.exoplayer2.ui.PlayerView r4 = r6.f33638P2
            int r5 = r6.f33752r
            r4.setResizeMode(r5)
            int r4 = r6.f33748q
            if (r4 != 0) goto L62
            android.content.res.Resources r1 = r6.getResources()
            int r4 = a7.j.f13289j2
        L5a:
            java.lang.String r1 = r1.getString(r4)
        L5e:
            r3.setText(r1)
            goto L8b
        L62:
            if (r4 != r1) goto L6b
            android.content.res.Resources r1 = r6.getResources()
            int r4 = a7.j.f13279i2
            goto L5a
        L6b:
            r1 = 2
            if (r4 != r1) goto L75
            android.content.res.Resources r1 = r6.getResources()
            int r4 = a7.j.f13112Q8
            goto L5a
        L75:
            r1 = 3
            if (r4 != r1) goto L7f
            android.content.res.Resources r1 = r6.getResources()
            int r4 = a7.j.f13290j3
            goto L5a
        L7f:
            r1 = 4
            if (r4 != r1) goto L85
            java.lang.String r1 = "16:9"
            goto L5e
        L85:
            r1 = 5
            if (r4 != r1) goto L8b
            java.lang.String r1 = "4:3"
            goto L5e
        L8b:
            android.content.SharedPreferences$Editor r1 = r6.f33760t
            java.lang.String r3 = "aspect_ratio"
            int r4 = r6.f33748q
            r1.putInt(r3, r4)
            android.content.SharedPreferences$Editor r1 = r6.f33760t
            r1.apply()
            r0.setVisibility(r2)
            android.widget.LinearLayout r1 = r6.f33761t0
            if (r1 == 0) goto Lad
            int r1 = r1.getVisibility()
            if (r1 != 0) goto Lad
            android.widget.LinearLayout r1 = r6.f33761t0
            r2 = 8
            r1.setVisibility(r2)
        Lad:
            android.os.Handler r1 = r6.f33764u
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            android.os.Handler r1 = r6.f33764u
            com.nst.iptvsmarterstvbox.view.demo.ExoDownloadedPlayerTwo$f r2 = new com.nst.iptvsmarterstvbox.view.demo.ExoDownloadedPlayerTwo$f
            r2.<init>(r0)
            r3 = 3000(0xbb8, double:1.482E-320)
            r1.postDelayed(r2, r3)
            int r0 = r6.f33752r
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.ExoDownloadedPlayerTwo.m3():int");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        long duration;
        RelativeLayout relativeLayout;
        if (this.f33620L0.getVisibility() == 0) {
            k3();
            return;
        }
        I1 i12 = this.f33642Q2;
        if (i12 != null) {
            try {
                duration = (int) (((double) ((int) i12.getDuration())) * ((((double) this.f33591E.getProgress()) * 1.0d) / 1000.0d));
            } catch (Exception unused) {
                duration = 0;
            }
            try {
                Log.i("movieCurrentPosition", "position:" + duration);
                ArrayList<DownloadedDataModel> arrayList = new ArrayList<>();
                DownloadedDataModel downloadedDataModel = new DownloadedDataModel();
                downloadedDataModel.setMovieCurrentPosition(duration);
                arrayList.add(downloadedDataModel);
                this.f33692e.updateCurrentPosition(arrayList, this.f33688d);
                Log.i("calledHere", "hereISDATA");
            } catch (Exception unused2) {
            }
        }
        RelativeLayout relativeLayout2 = this.f33576A0;
        if (relativeLayout2 != null && relativeLayout2.getVisibility() == 0) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f33776x;
            if (nSTIJKPlayerEpisodes != null) {
                nSTIJKPlayerEpisodes.m2();
                return;
            }
            return;
        }
        RelativeLayout relativeLayout3 = this.f33693e0;
        if (relativeLayout3 == null || relativeLayout3.getVisibility() != 0) {
            j3();
            if (this.f33698f0.getVisibility() != 0) {
                if (this.f33695e2.getVisibility() != 0) {
                    AbstractC2237a.f44521m0 = true;
                    if (this.f33751q2.equals("mobile") && this.f33614J2 && this.f33630N2) {
                        try {
                            N2();
                            return;
                        } catch (Exception unused3) {
                        }
                    }
                    super.onBackPressed();
                    return;
                }
                if (this.f33695e2.getVisibility() == 0) {
                    this.f33695e2.startAnimation(this.f33699f1);
                    if (this.f33745p0.getVisibility() == 0) {
                        this.f33745p0.startAnimation(this.f33699f1);
                    }
                    if (this.f33708h0.getVisibility() == 0) {
                        this.f33708h0.startAnimation(this.f33699f1);
                    }
                    if (this.f33761t0.getVisibility() == 0) {
                        this.f33761t0.startAnimation(this.f33699f1);
                    }
                    if (this.f33713i0.getVisibility() == 0) {
                        this.f33713i0.startAnimation(this.f33699f1);
                    }
                    if (this.f33749q0.getVisibility() == 0) {
                        this.f33749q0.startAnimation(this.f33699f1);
                    }
                    this.f33695e2.setVisibility(8);
                    if (this.f33745p0.getVisibility() == 0) {
                        this.f33745p0.setVisibility(8);
                    }
                    if (this.f33708h0.getVisibility() == 0) {
                        this.f33708h0.setVisibility(8);
                    }
                    if (this.f33761t0.getVisibility() == 0) {
                        this.f33761t0.setVisibility(8);
                    }
                    if (this.f33713i0.getVisibility() == 0) {
                        this.f33713i0.setVisibility(8);
                    }
                    if (this.f33749q0.getVisibility() == 0) {
                        this.f33749q0.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            }
            this.f33698f0.startAnimation(this.f33709h1);
            relativeLayout = this.f33698f0;
        } else {
            this.f33693e0.startAnimation(this.f33699f1);
            relativeLayout = this.f33693e0;
        }
        relativeLayout.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int iR0;
        String str;
        int iRound;
        int iRound2;
        StringBuilder sb;
        String str2;
        String strValueOf;
        String str3;
        String strValueOf2;
        String str4;
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes;
        ImageView imageView;
        int id = view.getId();
        if (id == a7.f.Cl) {
            Log.i("clickedSeekLeft", "leftSeekClicked");
            this.f33735m2 = new Handler();
            X2();
            return;
        }
        if (id == a7.f.El) {
            this.f33735m2 = new Handler();
            Y2();
            return;
        }
        if (id == a7.f.f12172I5) {
            boolean zEquals = this.f33751q2.equals("tv");
            j3();
            if (!zEquals) {
                f3();
                w2(5000);
                this.f33642Q2.play();
                this.f33587D.setVisibility(0);
                this.f33583C.setVisibility(8);
                return;
            }
            e3();
            w2(5000);
            this.f33642Q2.play();
            this.f33587D.setVisibility(0);
            this.f33583C.setVisibility(8);
            imageView = this.f33587D;
        } else {
            if (id != a7.f.f12162H5) {
                if (id == a7.f.f12367c7 || id == a7.f.f12131E4 || id == a7.f.f12171I4 || id == a7.f.f12181J4) {
                    onBackPressed();
                    onBackPressed();
                    return;
                }
                long jLongValue = 0;
                if (id != a7.f.U8) {
                    if (id == a7.f.f12581x8) {
                        j3();
                        I2();
                        f33573r3 = true;
                        this.f33638P2.M();
                        this.f33638P2.p(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
                        return;
                    }
                    if (id == a7.f.f12427i6) {
                        j3();
                        f33573r3 = false;
                        this.f33781y0.startAnimation(this.f33679a1);
                        this.f33781y0.setVisibility(8);
                        f3();
                        w2(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
                        return;
                    }
                    if (id != a7.f.f12570w7) {
                        if (id != a7.f.f12445k4) {
                            if (id == a7.f.f12337Z6 || id == a7.f.f12111C4) {
                                j3();
                                I2();
                                i3();
                                return;
                            }
                            if (id == a7.f.f12477n5) {
                                if (this.f33642Q2 != null) {
                                    j3();
                                    I2();
                                    this.f33642Q2.seekTo(0L);
                                    return;
                                }
                                return;
                            }
                            if (id == a7.f.f12399f8) {
                                j3();
                                I2();
                                A2();
                                d3();
                                return;
                            }
                            if (id == a7.f.f12104B7) {
                                j3();
                                v2(5000);
                                m3();
                                return;
                            } else {
                                if (id == a7.f.q9) {
                                    j3();
                                    v2(5000);
                                    k3();
                                    S2();
                                    return;
                                }
                                return;
                            }
                        }
                        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.f33776x;
                        nSTIJKPlayerEpisodes2.seekTo(nSTIJKPlayerEpisodes2.getNewSeekPosition());
                    }
                    j3();
                    I2();
                    return;
                }
                String str5 = this.f33686c2;
                if (str5 == null || str5.equals("movies")) {
                    return;
                }
                j3();
                I2();
                O2();
                SeekBar seekBar = this.f33591E;
                if (seekBar != null) {
                    seekBar.setProgress(0);
                }
                int iD = C2966a.f().d();
                String str6 = this.f33686c2;
                str6.hashCode();
                if (str6.equals("series")) {
                    List list = this.f33613J1;
                    if (list == null || list.size() <= 1 || iD > this.f33613J1.size() - 1) {
                        f33574s3 = false;
                        iR0 = 0;
                    } else {
                        this.f33673Y1 = ((GetEpisdoeDetailsCallback) this.f33613J1.get(iD)).getTitle();
                        this.f33683b2 = ((GetEpisdoeDetailsCallback) this.f33613J1.get(iD)).getContainerExtension();
                        this.f33677Z1 = ((GetEpisdoeDetailsCallback) this.f33613J1.get(iD)).getId();
                        this.f33783y2 = ((GetEpisdoeDetailsCallback) this.f33613J1.get(iD)).getMovieImage();
                        this.f33779x2 = this.f33673Y1;
                        this.f33578A2 = w.r0(((GetEpisdoeDetailsCallback) this.f33613J1.get(iD)).getElapsed_time());
                        this.f33787z2 = String.valueOf(((GetEpisdoeDetailsCallback) this.f33613J1.get(iD)).getSeasonNumber());
                        this.f33582B2 = ((GetEpisdoeDetailsCallback) this.f33613J1.get(iD)).getSeasonNumber().intValue();
                        iR0 = (!((GetEpisdoeDetailsCallback) this.f33613J1.get(iD)).getDurationSec().equals("") || (nSTIJKPlayerEpisodes = this.f33776x) == null) ? w.q0(((GetEpisdoeDetailsCallback) this.f33613J1.get(iD)).getDurationSec()) : nSTIJKPlayerEpisodes.getDuration() / 1000;
                        this.f33665W1 = w.r0(this.f33677Z1);
                        this.f33657U1 = w.q0(this.f33677Z1);
                        this.f33617K1 = ((GetEpisdoeDetailsCallback) this.f33613J1.get(iD)).getId();
                        this.f33765u0.setText(this.f33673Y1);
                        f33574s3 = true;
                    }
                } else {
                    iR0 = 0;
                }
                this.f33585C1.clear();
                this.f33585C1.apply();
                this.f33589D1.clear();
                this.f33589D1.apply();
                this.f33581B1.clear();
                this.f33581B1.apply();
                if (f33574s3 && this.f33625M1.booleanValue()) {
                    U2();
                    C2966a.f().x(this.f33617K1);
                    int iH = this.f33738n1.h(this.f33617K1, SharepreferenceDBHandler.getUserID(this.f33672Y0));
                    if (iH == 0) {
                        this.f33776x.setProgress(false);
                        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes3 = this.f33776x;
                        nSTIJKPlayerEpisodes3.f36516e = 0;
                        nSTIJKPlayerEpisodes3.f36521f = false;
                        if (!this.f33597F1.equals("m3u") || (str4 = this.f33686c2) == null || str4.equals("recording")) {
                            String str7 = this.f33686c2;
                            if (str7 == null || !str7.equals("recording")) {
                                strValueOf2 = String.valueOf(Uri.parse(this.f33601G1 + this.f33657U1 + InstructionFileId.DOT + this.f33683b2));
                            } else {
                                strValueOf2 = this.f33601G1;
                            }
                            this.f33775w2 = strValueOf2;
                        } else {
                            this.f33775w2 = this.f33719j1;
                            C2966a.f().r("m3u");
                        }
                    }
                    if (iH > 0) {
                        if (this.f33738n1.a(this.f33617K1) > 0) {
                            try {
                                jLongValue = this.f33729l1.gettimeElapsed(this.f33617K1).longValue();
                            } catch (Exception unused) {
                            }
                            if (iR0 == 0) {
                                iR0 = w.r0(this.f33729l1.getTotaltime(this.f33617K1).toString());
                                this.f33661V1 = iR0;
                            }
                            if (this.f33776x != null) {
                                C2966a.f().I(jLongValue);
                                this.f33776x.setProgress(true);
                                this.f33776x.setCurrentPositionSeekbar((int) jLongValue);
                                try {
                                    iRound = Math.round(w.r0(String.valueOf(jLongValue)) / 1000.0f);
                                } catch (Exception unused2) {
                                    iRound = 0;
                                    iR0 = 0;
                                }
                                try {
                                    iRound2 = Math.round((iRound / iR0) * 100.0f);
                                } catch (Exception unused3) {
                                    iRound2 = 0;
                                }
                                if (iRound2 >= 99) {
                                    this.f33776x.setCurrentPositionSeekbar(0);
                                }
                                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes4 = this.f33776x;
                                nSTIJKPlayerEpisodes4.f36516e = 0;
                                nSTIJKPlayerEpisodes4.f36521f = false;
                                if (!this.f33597F1.equals("m3u") || (str2 = this.f33686c2) == null || str2.equals("recording")) {
                                    String str8 = this.f33686c2;
                                    if (str8 == null || !str8.equals("recording")) {
                                        sb = new StringBuilder();
                                        sb.append(this.f33601G1);
                                        sb.append(this.f33657U1);
                                        sb.append(InstructionFileId.DOT);
                                        sb.append(this.f33683b2);
                                        strValueOf = String.valueOf(Uri.parse(sb.toString()));
                                        this.f33775w2 = strValueOf;
                                    }
                                    strValueOf = this.f33601G1;
                                    this.f33775w2 = strValueOf;
                                }
                                this.f33775w2 = this.f33719j1;
                                C2966a.f().r("m3u");
                            }
                        } else {
                            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes5 = this.f33776x;
                            if (nSTIJKPlayerEpisodes5 != null) {
                                nSTIJKPlayerEpisodes5.setProgress(false);
                                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes6 = this.f33776x;
                                nSTIJKPlayerEpisodes6.f36516e = 0;
                                nSTIJKPlayerEpisodes6.f36521f = false;
                                if (!this.f33597F1.equals("m3u") || (str3 = this.f33686c2) == null || str3.equals("recording")) {
                                    String str9 = this.f33686c2;
                                    if (str9 == null || !str9.equals("recording")) {
                                        sb = new StringBuilder();
                                        sb.append(this.f33601G1);
                                        sb.append(this.f33657U1);
                                        sb.append(InstructionFileId.DOT);
                                        sb.append(this.f33683b2);
                                        strValueOf = String.valueOf(Uri.parse(sb.toString()));
                                        this.f33775w2 = strValueOf;
                                    }
                                    strValueOf = this.f33601G1;
                                    this.f33775w2 = strValueOf;
                                }
                                this.f33775w2 = this.f33719j1;
                                C2966a.f().r("m3u");
                            }
                        }
                    }
                    String str10 = this.f33686c2;
                    if ((str10 == null || !str10.equals("movies")) && (str = this.f33686c2) != null && str.equals("series")) {
                        C2966a.f().x(this.f33617K1);
                        EpisodesUsingSinglton.getInstance().setEpisodeList(this.f33613J1);
                        C2966a.f().G(w.q0(((GetEpisdoeDetailsCallback) this.f33613J1.get(iD)).getId()));
                        C2966a.f().v(this.f33613J1);
                    }
                    C2966a.f().w(iD);
                }
                String str11 = this.f33686c2;
                str11.hashCode();
                if (str11.equals("series")) {
                    this.f33621L1 = w.q0(((GetEpisdoeDetailsCallback) this.f33613J1.get(iD)).getId());
                    SharedPreferences.Editor editor = this.f33786z1;
                    if (editor != null) {
                        editor.putString("currentlyPlayingVideo", String.valueOf(((GetEpisdoeDetailsCallback) this.f33613J1.get(iD)).getId()));
                        this.f33786z1.apply();
                    }
                }
                SharedPreferences.Editor editor2 = this.f33577A1;
                if (editor2 != null) {
                    editor2.putString("currentlyPlayingVideoPosition", String.valueOf(iD));
                    this.f33577A1.apply();
                    return;
                }
                return;
            }
            boolean zEquals2 = this.f33751q2.equals("tv");
            j3();
            if (!zEquals2) {
                f3();
                this.f33642Q2.pause();
                this.f33587D.setVisibility(8);
                this.f33583C.setVisibility(0);
                return;
            }
            e3();
            this.f33642Q2.pause();
            this.f33587D.setVisibility(8);
            this.f33583C.setVisibility(0);
            imageView = this.f33583C;
        }
        imageView.requestFocus();
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        u2(configuration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0695  */
    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.ExoDownloadedPlayerTwo.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        TextView textView;
        super.onDestroy();
        try {
            if (this.f33701f3 != null) {
                C2386a.b(this.f33672Y0).e(this.f33701f3);
            }
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f33776x;
            if (nSTIJKPlayerEpisodes != null && (textView = nSTIJKPlayerEpisodes.f36597v) != null) {
                textView.performClick();
            }
        } catch (Exception e9) {
            Log.e("fsgd", "fdfh", e9);
        }
        try {
            U2();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        boolean z9 = keyEvent.getRepeatCount() == 0;
        Log.i("keycodeIS", "keycode:19");
        if (i9 != 46) {
            if (i9 != 62) {
                if (i9 != 66) {
                    if (i9 != 79 && i9 != 85 && i9 != 86) {
                        if (i9 != 89) {
                            if (i9 != 90) {
                                if (i9 != 126 && i9 != 127) {
                                    if (i9 != 274) {
                                        if (i9 != 275) {
                                            switch (i9) {
                                                case 19:
                                                    if (this.f33698f0.getVisibility() != 0 && this.f33693e0.getVisibility() != 0 && this.f33576A0.getVisibility() != 0 && this.f33576A0.getVisibility() != 0) {
                                                        this.f33695e2.getVisibility();
                                                    }
                                                    return true;
                                                case 20:
                                                    j3();
                                                    if (this.f33698f0.getVisibility() != 0 && this.f33693e0.getVisibility() != 0 && this.f33576A0.getVisibility() != 0 && this.f33576A0.getVisibility() != 0 && this.f33695e2.getVisibility() == 8) {
                                                        this.f33695e2.startAnimation(this.f33694e1);
                                                        this.f33695e2.setVisibility(0);
                                                        this.f33583C.requestFocus();
                                                        this.f33587D.requestFocus();
                                                    }
                                                    return true;
                                                case 21:
                                                    j3();
                                                    if (this.f33698f0.getVisibility() == 0 || this.f33693e0.getVisibility() == 0) {
                                                        return false;
                                                    }
                                                    if (this.f33576A0.getVisibility() != 0 && this.f33576A0.getVisibility() != 0) {
                                                        if (this.f33695e2.getVisibility() == 8) {
                                                            this.f33695e2.startAnimation(this.f33694e1);
                                                            this.f33695e2.setVisibility(0);
                                                            if (!this.f33591E.isFocused()) {
                                                                this.f33591E.requestFocus();
                                                            }
                                                        }
                                                        if (this.f33591E.isFocused()) {
                                                            k3();
                                                        } else {
                                                            v2(5000);
                                                        }
                                                    }
                                                    return true;
                                                case 22:
                                                    j3();
                                                    if (this.f33698f0.getVisibility() == 0 || this.f33693e0.getVisibility() == 0) {
                                                        return false;
                                                    }
                                                    if (this.f33576A0.getVisibility() != 0 && this.f33576A0.getVisibility() != 0) {
                                                        if (this.f33695e2.getVisibility() == 8) {
                                                            this.f33695e2.startAnimation(this.f33694e1);
                                                            this.f33695e2.setVisibility(0);
                                                            if (!this.f33591E.isFocused()) {
                                                                this.f33591E.requestFocus();
                                                            }
                                                        }
                                                        if (this.f33591E.isFocused()) {
                                                            k3();
                                                        } else {
                                                            v2(5000);
                                                        }
                                                    }
                                                    return true;
                                                case 23:
                                                    break;
                                                default:
                                                    return super.onKeyUp(i9, keyEvent);
                                            }
                                        }
                                    }
                                }
                            }
                            try {
                                j3();
                                if (this.f33695e2.getVisibility() == 8) {
                                    this.f33695e2.startAnimation(this.f33694e1);
                                    this.f33695e2.setVisibility(0);
                                    if (!this.f33591E.isFocused()) {
                                        this.f33591E.requestFocus();
                                    }
                                }
                                v2(5000);
                                this.f33591E.setProgress(this.f33591E.getProgress() + 10);
                                this.f33776x.H2(this.f33591E.getProgress());
                            } catch (Exception unused) {
                            }
                            return true;
                        }
                        try {
                            j3();
                            if (this.f33695e2.getVisibility() == 8) {
                                this.f33695e2.startAnimation(this.f33694e1);
                                this.f33695e2.setVisibility(0);
                                if (!this.f33591E.isFocused()) {
                                    this.f33591E.requestFocus();
                                }
                            }
                            v2(5000);
                            this.f33591E.setProgress(this.f33591E.getProgress() - 10);
                            this.f33776x.H2(this.f33591E.getProgress());
                        } catch (Exception unused2) {
                        }
                        return true;
                    }
                }
                if (this.f33642Q2 != null) {
                    if (this.f33698f0.getVisibility() == 8) {
                        (this.f33642Q2.isPlaying() ? this.f33587D : this.f33583C).performClick();
                    }
                } else if (f33571p3.getVisibility() == 8) {
                    n3();
                }
                return true;
            }
            I1 i12 = this.f33642Q2;
            if (i12 != null) {
                ((!z9 || i12.isPlaying()) ? this.f33587D : this.f33583C).performClick();
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        intent.putExtra("BUNDLE_KEY_NEW_INTENT_CALLED", true);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        if (k0.f39777a <= 23) {
            PlayerView playerView = this.f33638P2;
            if (playerView != null) {
                playerView.C();
            }
            V2();
        }
        String str = this.f33686c2;
        if (str == null || !str.equals("movies")) {
            String str2 = this.f33686c2;
            if (str2 != null && str2.equals("series")) {
                A2();
            }
        } else {
            W2(0);
        }
        getIntent().getAction();
        try {
            C2325b c2325b = this.f33771v2;
            if (c2325b != null) {
                c2325b.c().e(this.f33590D2, C2328e.class);
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z9, Configuration configuration) {
        try {
            super.onPictureInPictureModeChanged(z9, configuration);
            if (z9) {
                AbstractC2237a.f44531p1 = true;
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f33776x;
                if (nSTIJKPlayerEpisodes != null && nSTIJKPlayerEpisodes.f36531h != null) {
                    nSTIJKPlayerEpisodes.setShowOrHideSubtitles(false);
                    this.f33776x.f36531h.setVisibility(8);
                }
                b bVar = new b();
                this.f33606H2 = bVar;
                registerReceiver(bVar, new IntentFilter("media_control"));
                return;
            }
            unregisterReceiver(this.f33606H2);
            this.f33610I2 = false;
            this.f33606H2 = null;
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.f33776x;
            if (nSTIJKPlayerEpisodes2 != null && nSTIJKPlayerEpisodes2.f36531h != null) {
                nSTIJKPlayerEpisodes2.setShowOrHideSubtitles(true);
                this.f33776x.f36531h.setVisibility(0);
                this.f33776x.p2();
            }
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes3 = this.f33776x;
            if (nSTIJKPlayerEpisodes3 != null) {
                nSTIJKPlayerEpisodes3.isPlaying();
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i9, strArr, iArr);
        if (iArr.length == 0) {
            return;
        }
        if (iArr[0] == 0) {
            K2();
        } else {
            g3(a7.j.f13091O7);
            finish();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        Intent intent;
        AppOpsManager appOpsManager;
        super.onResume();
        if (k0.f39777a <= 23 || this.f33642Q2 == null) {
            K2();
            PlayerView playerView = this.f33638P2;
            if (playerView != null) {
                playerView.D();
            }
        }
        Context context = this.f33672Y0;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("auto_start", 0);
            this.f33626M2 = sharedPreferences;
            boolean z9 = sharedPreferences.getBoolean("picinpic", AbstractC2237a.f44541u0);
            this.f33630N2 = z9;
            if (z9 && this.f33751q2.equals("mobile")) {
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 26) {
                    this.f33618K2 = AbstractC2500v.a();
                }
                if (i9 >= 26) {
                    try {
                        if (getPackageManager().hasSystemFeature("android.software.picture_in_picture") && (appOpsManager = (AppOpsManager) this.f33672Y0.getSystemService("appops")) != null && appOpsManager.checkOpNoThrow("android:picture_in_picture", Process.myUid(), this.f33672Y0.getPackageName()) == 0) {
                            this.f33614J2 = true;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        String str = this.f33686c2;
        if (str == null || !str.equals("series")) {
            String str2 = this.f33686c2;
            if (str2 != null && str2.equals("movies") && (intent = getIntent()) != null && intent.getBooleanExtra("BUNDLE_KEY_NEW_INTENT_CALLED", false)) {
                intent.putExtra("BUNDLE_KEY_NEW_INTENT_CALLED", false);
                setIntent(intent);
                if (getIntent().getIntExtra("OPENED_STREAM_ID", 0) != this.f33657U1) {
                    this.f33609I1 = VodAllCategoriesSingleton.getInstance().getvodList();
                }
            }
        } else {
            Intent intent2 = getIntent();
            if (intent2 != null && intent2.getBooleanExtra("BUNDLE_KEY_NEW_INTENT_CALLED", false)) {
                intent2.putExtra("BUNDLE_KEY_NEW_INTENT_CALLED", false);
                setIntent(intent2);
                if (getIntent().getIntExtra("OPENED_STREAM_ID", 0) != this.f33657U1) {
                    this.f33613J1 = EpisodesUsingSinglton.getInstance().getEpisodeList();
                }
            }
        }
        w.m(this.f33672Y0);
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f33776x;
        if (nSTIJKPlayerEpisodes != null) {
            nSTIJKPlayerEpisodes.p2();
            if (this.f33747p2) {
                f33572q3 = false;
            }
        }
        C2325b c2325b = this.f33771v2;
        if (c2325b != null) {
            c2325b.c().a(this.f33590D2, C2328e.class);
        }
    }

    @Override // androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        s3();
        r3();
        bundle.putBundle("track_selector_parameters", this.f33662V2.h());
        bundle.putBoolean("auto_play", this.f33670X2);
        bundle.putInt("window", this.f33674Y2);
        bundle.putLong("position", this.f33678Z2);
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStart() {
        super.onStart();
        if (k0.f39777a > 23) {
            K2();
            PlayerView playerView = this.f33638P2;
            if (playerView != null) {
                playerView.D();
            }
        }
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStop() {
        super.onStop();
        if (k0.f39777a > 23) {
            PlayerView playerView = this.f33638P2;
            if (playerView != null) {
                playerView.C();
            }
            V2();
        }
        try {
            U2();
            if (this.f33751q2.equals("mobile") && this.f33614J2 && this.f33630N2) {
                finishAndRemoveTask();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (this.f33751q2.equals("mobile") && this.f33614J2 && this.f33630N2 && !isInPictureInPictureMode()) {
            try {
                N2();
                this.f33610I2 = true;
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        if (z9) {
            u2(getResources().getConfiguration());
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
    }

    public void q3(int i9, String str, int i10, int i11) {
        try {
            if (this.f33751q2.equals("mobile") && this.f33614J2 && this.f33630N2) {
                ArrayList arrayList = new ArrayList();
                PendingIntent broadcast = PendingIntent.getBroadcast(this, i11, new Intent("media_control").putExtra("control_type", i10), 67108864);
                Icon iconCreateWithResource = Icon.createWithResource(this, i9);
                PendingIntent broadcast2 = PendingIntent.getBroadcast(this, 4, new Intent("media_control").putExtra("control_type", 4), 67108864);
                PendingIntent broadcast3 = PendingIntent.getBroadcast(this, 5, new Intent("media_control").putExtra("control_type", 5), 67108864);
                Icon iconCreateWithResource2 = Icon.createWithResource(this, a7.e.f12055s0);
                Icon iconCreateWithResource3 = Icon.createWithResource(this, a7.e.f12047q0);
                AbstractC2498u.a();
                arrayList.add(AbstractC2496t.a(iconCreateWithResource2, "rewind", "rewind", broadcast2));
                AbstractC2498u.a();
                arrayList.add(AbstractC2496t.a(iconCreateWithResource, str, str, broadcast));
                AbstractC2498u.a();
                arrayList.add(AbstractC2496t.a(iconCreateWithResource3, "forward", "forward", broadcast3));
                this.f33618K2.setActions(arrayList);
                setPictureInPictureParams(this.f33618K2.build());
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i9) {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
    }

    public void w2(int i9) {
        if (f33573r3) {
            return;
        }
        this.f33638P2.f25867v = new d();
        PlayerView playerView = this.f33638P2;
        playerView.f25865u.postDelayed(playerView.f25867v, i9);
    }

    public boolean x2() {
        RelativeLayout relativeLayout = this.f33576A0;
        return relativeLayout != null && relativeLayout.getVisibility() == 0;
    }

    public void z2() {
        this.f33670X2 = true;
        this.f33674Y2 = -1;
        this.f33678Z2 = -9223372036854775807L;
    }
}
