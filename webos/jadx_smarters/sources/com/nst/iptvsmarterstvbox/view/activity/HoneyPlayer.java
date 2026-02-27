package com.nst.iptvsmarterstvbox.view.activity;

import android.animation.ObjectAnimator;
import android.app.AppOpsManager;
import android.app.PictureInPictureParams;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.util.Log;
import android.util.Rational;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.android.gms.cast.MediaInfo;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.nst.iptvsmarterstvbox.miscelleneious.MyApplication;
import com.nst.iptvsmarterstvbox.model.EpisodesUsingSinglton;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.VodAllCategoriesSingleton;
import com.nst.iptvsmarterstvbox.model.callback.GetEpisdoeDetailsCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerCreatePlayerLinkCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerDeletePlayerLinkCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerShortEPGCallback;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.RecentWatchDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SeriesRecentWatchDatabase;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.pojo.PanelAvailableChannelsPojo;
import com.nst.iptvsmarterstvbox.sbpfunction.activitypushnotification.MaintanencePannelActivity;
import com.nst.iptvsmarterstvbox.sbpfunction.callbackclientreport.ClientFeedbackCallback;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes;
import com.squareup.picasso.InterfaceC1611e;
import i7.AbstractC1902a;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m7.AbstractC2237a;
import m7.w;
import o4.AbstractC2324a;
import o4.C2325b;
import o4.C2328e;
import o4.InterfaceC2347y;
import org.apache.http.protocol.HttpRequestExecutor;
import p0.C2386a;
import p7.AbstractC2500v;
import p7.C2509z0;
import q7.C2630n;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import t2.C2766a;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import w7.AbstractC2941e;
import w7.C2939c;
import x7.C2966a;

/* JADX INFO: loaded from: classes4.dex */
public class HoneyPlayer extends androidx.appcompat.app.b implements View.OnClickListener, z7.j, CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: U3, reason: collision with root package name */
    public static TextView f29975U3 = null;

    /* JADX INFO: renamed from: V3, reason: collision with root package name */
    public static LinearLayout f29976V3 = null;

    /* JADX INFO: renamed from: W3, reason: collision with root package name */
    public static String f29977W3 = null;

    /* JADX INFO: renamed from: X3, reason: collision with root package name */
    public static String f29978X3 = null;

    /* JADX INFO: renamed from: Y3, reason: collision with root package name */
    public static ProgressBar f29979Y3 = null;

    /* JADX INFO: renamed from: Z3, reason: collision with root package name */
    public static boolean f29980Z3 = true;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public static boolean f29981a4 = false;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public static boolean f29982b4 = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public RadioGroup f29983A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public RelativeLayout f29984A0;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public String f29985A1;

    /* JADX INFO: renamed from: A2, reason: collision with root package name */
    public String f29986A2;

    /* JADX INFO: renamed from: A3, reason: collision with root package name */
    public InterfaceC2347y f29987A3;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public RadioGroup f29988B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public ImageView f29989B0;

    /* JADX INFO: renamed from: B2, reason: collision with root package name */
    public LiveStreamDBHandler f29991B2;

    /* JADX INFO: renamed from: B3, reason: collision with root package name */
    public ArrayList f29992B3;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public TextView f29993C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public ImageView f29994C0;

    /* JADX INFO: renamed from: C2, reason: collision with root package name */
    public ArrayList f29996C2;

    /* JADX INFO: renamed from: C3, reason: collision with root package name */
    public Handler f29997C3;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public TextView f29998D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public LinearLayout f29999D0;

    /* JADX INFO: renamed from: D2, reason: collision with root package name */
    public ArrayList f30001D2;

    /* JADX INFO: renamed from: D3, reason: collision with root package name */
    public Runnable f30002D3;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public TextView f30003E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public LinearLayout f30004E0;

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public String f30005E1;

    /* JADX INFO: renamed from: E2, reason: collision with root package name */
    public List f30006E2;

    /* JADX INFO: renamed from: E3, reason: collision with root package name */
    public androidx.appcompat.app.a f30007E3;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ImageView f30008F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public LinearLayout f30009F0;

    /* JADX INFO: renamed from: F3, reason: collision with root package name */
    public BroadcastReceiver f30012F3;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public LinearLayout f30013G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public TextView f30014G0;

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    public List f30015G1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public LinearLayout f30018H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public LinearLayout f30019H0;

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    public JsonArray f30020H1;

    /* JADX INFO: renamed from: H2, reason: collision with root package name */
    public String f30021H2;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public RecyclerView f30023I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public RelativeLayout f30024I0;

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    public String f30025I1;

    /* JADX INFO: renamed from: I3, reason: collision with root package name */
    public PictureInPictureParams.Builder f30027I3;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public TextView f30028J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public RelativeLayout f30029J0;

    /* JADX INFO: renamed from: J2, reason: collision with root package name */
    public SimpleDateFormat f30031J2;

    /* JADX INFO: renamed from: J3, reason: collision with root package name */
    public ArrayList f30032J3;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public TextView f30033K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public RelativeLayout f30034K0;

    /* JADX INFO: renamed from: K2, reason: collision with root package name */
    public Date f30036K2;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ProgressBar f30038L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public TextView f30039L0;

    /* JADX INFO: renamed from: L2, reason: collision with root package name */
    public DateFormat f30041L2;

    /* JADX INFO: renamed from: L3, reason: collision with root package name */
    public SharedPreferences f30042L3;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public FrameLayout f30043M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public CheckBox f30044M0;

    /* JADX INFO: renamed from: M2, reason: collision with root package name */
    public String f30046M2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public TextView f30048N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public CheckBox f30049N0;

    /* JADX INFO: renamed from: N2, reason: collision with root package name */
    public String f30051N2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public RelativeLayout f30053O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public CheckBox f30054O0;

    /* JADX INFO: renamed from: O2, reason: collision with root package name */
    public String f30056O2;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public RelativeLayout f30058P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public CheckBox f30059P0;

    /* JADX INFO: renamed from: P2, reason: collision with root package name */
    public String f30061P2;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public LinearLayout f30063Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public CheckBox f30064Q0;

    /* JADX INFO: renamed from: Q3, reason: collision with root package name */
    public n7.g f30067Q3;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public RecyclerView f30068R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public CheckBox f30069R0;

    /* JADX INFO: renamed from: R1, reason: collision with root package name */
    public C2630n f30070R1;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public TextView f30073S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public CheckBox f30074S0;

    /* JADX INFO: renamed from: S1, reason: collision with root package name */
    public RecyclerView.o f30075S1;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public TextView f30078T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public CheckBox f30079T0;

    /* JADX INFO: renamed from: T1, reason: collision with root package name */
    public Context f30080T1;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public TextView f30083U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public CheckBox f30084U0;

    /* JADX INFO: renamed from: U1, reason: collision with root package name */
    public Animation f30085U1;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f30087V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public RelativeLayout f30088V0;

    /* JADX INFO: renamed from: V1, reason: collision with root package name */
    public Animation f30089V1;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public FrameLayout f30091W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public CheckBox f30092W0;

    /* JADX INFO: renamed from: W1, reason: collision with root package name */
    public Animation f30093W1;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public FrameLayout f30095X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public CheckBox f30096X0;

    /* JADX INFO: renamed from: X1, reason: collision with root package name */
    public Animation f30097X1;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public SeekBar f30099Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public CheckBox f30100Y0;

    /* JADX INFO: renamed from: Y1, reason: collision with root package name */
    public Animation f30101Y1;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public SeekBar f30103Z;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public CheckBox f30104Z0;

    /* JADX INFO: renamed from: Z1, reason: collision with root package name */
    public Animation f30105Z1;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public TextView f30107a1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public Animation f30108a2;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public LinearLayout f30110b1;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public Animation f30111b2;

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    public C2766a f30112b3;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public TextView f30113c1;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public Animation f30114c2;

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    public LinearLayout f30115c3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinearLayout f30116d;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public TextView f30117d1;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public Handler f30118d2;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public SharedPreferences f30119d3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinearLayout f30120e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public LinearLayout f30121e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public TextView f30122e1;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public String f30123e2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public NSTIJKPlayerEpisodes f30125f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public LinearLayout f30126f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public TextView f30127f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f30130g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public TextView f30131g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public TextView f30132g1;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public SeriesRecentWatchDatabase f30133g2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f30135h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public TextView f30136h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public TextView f30137h1;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public RecentWatchDBHandler f30138h2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f30140i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public LinearLayout f30141i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public TextView f30142i1;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public C2509z0 f30143i2;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public SharedPreferences f30144i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f30145j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public TextView f30146j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public TextView f30147j1;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public SharedPreferences f30148j2;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public SharedPreferences.Editor f30149j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f30150k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public TextView f30151k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public EditText f30152k1;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public SharedPreferences f30153k2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f30155l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public ImageView f30156l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public LinearLayout f30157l1;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public SharedPreferences f30158l2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SeekBar f30160m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public LinearLayout f30161m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public LinearLayout f30162m1;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public SharedPreferences.Editor f30163m2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f30165n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public LinearLayout f30166n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public LinearLayout f30167n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public SharedPreferences f30168n2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinearLayout f30170o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public ImageView f30171o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public LinearLayout f30172o1;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public SharedPreferences f30173o2;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public SharedPreferences f30174o3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f30175p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public RelativeLayout f30176p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public ImageView f30177p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public SharedPreferences f30178p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public SharedPreferences.Editor f30179p3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f30180q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ImageView f30181q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public RelativeLayout f30182q1;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public SharedPreferences f30183q2;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public SharedPreferences f30184q3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinearLayout f30185r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public TextView f30186r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public LinearLayout f30187r1;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public SharedPreferences f30188r2;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public C2328e f30189r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LinearLayout f30190s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public TextView f30191s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public LinearLayout f30192s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public SharedPreferences f30193s2;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public C2325b f30194s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LinearLayout f30195t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public TextView f30196t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public LinearLayout f30197t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public SharedPreferences.Editor f30198t2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ImageView f30200u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public LinearLayout f30201u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public LinearLayout f30202u1;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public SharedPreferences.Editor f30203u2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ImageView f30205v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public TableLayout f30206v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public LinearLayout f30207v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public SharedPreferences.Editor f30208v2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f30210w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public LinearLayout f30211w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public RelativeLayout f30212w1;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public SharedPreferences.Editor f30213w2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f30215x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public MediaRouteButton f30216x0;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public SharedPreferences.Editor f30218x2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public LinearLayout f30220y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public LinearLayout f30221y0;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public String f30223y2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public RadioGroup f30225z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public TextView f30226z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public String f30227z1;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public String f30228z2;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public String f30217x1 = "Live";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public String f30222y1 = "";

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public String f29990B1 = "";

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public String f29995C1 = "";

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    public String f30000D1 = "";

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public String f30010F1 = "";

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    public String f30030J1 = "";

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    public Thread f30035K1 = null;

    /* JADX INFO: renamed from: L1, reason: collision with root package name */
    public int f30040L1 = 0;

    /* JADX INFO: renamed from: M1, reason: collision with root package name */
    public boolean f30045M1 = false;

    /* JADX INFO: renamed from: N1, reason: collision with root package name */
    public boolean f30050N1 = false;

    /* JADX INFO: renamed from: O1, reason: collision with root package name */
    public boolean f30055O1 = false;

    /* JADX INFO: renamed from: P1, reason: collision with root package name */
    public int f30060P1 = 0;

    /* JADX INFO: renamed from: Q1, reason: collision with root package name */
    public List f30065Q1 = new ArrayList();

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public String f30128f2 = "";

    /* JADX INFO: renamed from: F2, reason: collision with root package name */
    public String f30011F2 = "";

    /* JADX INFO: renamed from: G2, reason: collision with root package name */
    public int f30016G2 = -1;

    /* JADX INFO: renamed from: I2, reason: collision with root package name */
    public Boolean f30026I2 = Boolean.TRUE;

    /* JADX INFO: renamed from: Q2, reason: collision with root package name */
    public int f30066Q2 = -1;

    /* JADX INFO: renamed from: R2, reason: collision with root package name */
    public String f30071R2 = "";

    /* JADX INFO: renamed from: S2, reason: collision with root package name */
    public String f30076S2 = "";

    /* JADX INFO: renamed from: T2, reason: collision with root package name */
    public int f30081T2 = -1;

    /* JADX INFO: renamed from: U2, reason: collision with root package name */
    public int f30086U2 = 0;

    /* JADX INFO: renamed from: V2, reason: collision with root package name */
    public String f30090V2 = "";

    /* JADX INFO: renamed from: W2, reason: collision with root package name */
    public String f30094W2 = "";

    /* JADX INFO: renamed from: X2, reason: collision with root package name */
    public String f30098X2 = "";

    /* JADX INFO: renamed from: Y2, reason: collision with root package name */
    public String f30102Y2 = "";

    /* JADX INFO: renamed from: Z2, reason: collision with root package name */
    public String f30106Z2 = "";

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public String f30109a3 = "";

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    public String f30124e3 = "";

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    public String f30129f3 = "";

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public String f30134g3 = "";

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public String f30139h3 = "";

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public int f30154k3 = 0;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public float f30159l3 = -1.0f;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public boolean f30164m3 = false;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public String f30169n3 = "mobile";

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public String f30199t3 = "";

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public String f30204u3 = "";

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public String f30209v3 = "";

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public String f30214w3 = "";

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public int f30219x3 = 0;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public int f30224y3 = 0;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public int f30229z3 = 0;

    /* JADX INFO: renamed from: G3, reason: collision with root package name */
    public boolean f30017G3 = false;

    /* JADX INFO: renamed from: H3, reason: collision with root package name */
    public boolean f30022H3 = false;

    /* JADX INFO: renamed from: K3, reason: collision with root package name */
    public ArrayList f30037K3 = new ArrayList();

    /* JADX INFO: renamed from: M3, reason: collision with root package name */
    public boolean f30047M3 = AbstractC2237a.f44541u0;

    /* JADX INFO: renamed from: N3, reason: collision with root package name */
    public final i7.c f30052N3 = new i7.c(this);

    /* JADX INFO: renamed from: O3, reason: collision with root package name */
    public String f30057O3 = "";

    /* JADX INFO: renamed from: P3, reason: collision with root package name */
    public String f30062P3 = "";

    /* JADX INFO: renamed from: R3, reason: collision with root package name */
    public String f30072R3 = "";

    /* JADX INFO: renamed from: S3, reason: collision with root package name */
    public BroadcastReceiver f30077S3 = new h();

    /* JADX INFO: renamed from: T3, reason: collision with root package name */
    public NSTIJKPlayerEpisodes.M f30082T3 = new n();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HoneyPlayer.this.f2();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HoneyPlayer.this.E2();
        }
    }

    public class c implements InterfaceC1611e {
        public c() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
            HoneyPlayer.this.I2();
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
            RelativeLayout relativeLayout = HoneyPlayer.this.f29984A0;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
        }
    }

    public class d implements InterfaceC1611e {
        public d() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
            HoneyPlayer.this.I2();
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
            RelativeLayout relativeLayout = HoneyPlayer.this.f29984A0;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
        }
    }

    public class e implements Callback {
        public e() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            Toast.makeText(HoneyPlayer.this, "Something went Wrong Report not Submited", 0).show();
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Toast toastMakeText;
            HoneyPlayer honeyPlayer;
            String strMessage;
            if (response == null) {
                toastMakeText = Toast.makeText(HoneyPlayer.this, "Something went Wrong Report not Submited", 0);
            } else if (response.body() == null || !response.isSuccessful() || ((ClientFeedbackCallback) response.body()).a() == null) {
                if (response.message() != null && !response.message().equals("")) {
                    honeyPlayer = HoneyPlayer.this;
                    strMessage = response.message();
                    toastMakeText = Toast.makeText(honeyPlayer, strMessage, 0);
                }
                toastMakeText = Toast.makeText(HoneyPlayer.this, "Something went Wrong Report not Submited", 0);
            } else {
                if (((ClientFeedbackCallback) response.body()).a().equalsIgnoreCase("success")) {
                    honeyPlayer = HoneyPlayer.this;
                    strMessage = "Reported Successfully";
                    toastMakeText = Toast.makeText(honeyPlayer, strMessage, 0);
                }
                toastMakeText = Toast.makeText(HoneyPlayer.this, "Something went Wrong Report not Submited", 0);
            }
            toastMakeText.show();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HoneyPlayer.this.f30063Q.setVisibility(8);
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class h extends BroadcastReceiver {
        public h() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MyApplication.E("onReceive CLOSE_TARGET_ACTIVITY : ");
            if ("pip_mode_switch_user".equals(intent.getAction())) {
                HoneyPlayer.this.finish();
            }
        }
    }

    public class i implements InterfaceC2347y {
        public i() {
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[Catch: Exception -> 0x001c, TryCatch #0 {Exception -> 0x001c, blocks: (B:3:0x0005, B:5:0x0013, B:16:0x0033, B:11:0x0021, B:14:0x002b, B:18:0x003c, B:20:0x0044, B:21:0x006a, B:23:0x008f, B:25:0x0095, B:26:0x00a0), top: B:31:0x0005 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a(o4.C2328e r10) {
            /*
                Method dump skipped, instruction units count: 215
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer.i.a(o4.e):void");
        }

        private void b() {
            HoneyPlayer.this.invalidateOptionsMenu();
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
            HoneyPlayer.this.f30189r3 = c2328e;
            if (HoneyPlayer.this.f30189r3 != null) {
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = HoneyPlayer.this.f30125f;
                if (nSTIJKPlayerEpisodes != null) {
                    nSTIJKPlayerEpisodes.p2();
                    HoneyPlayer.this.f30125f.pause();
                }
                LinearLayout linearLayout = HoneyPlayer.this.f30221y0;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                HoneyPlayer honeyPlayer = HoneyPlayer.this;
                if (honeyPlayer.f30226z0 != null) {
                    if (honeyPlayer.f30189r3.q() == null || HoneyPlayer.this.f30189r3.q().J() == null) {
                        textView = HoneyPlayer.this.f30226z0;
                        sb = new StringBuilder();
                        string = HoneyPlayer.this.getResources().getString(a7.j.f13407v0);
                    } else {
                        textView = HoneyPlayer.this.f30226z0;
                        sb = new StringBuilder();
                        sb.append(HoneyPlayer.this.getResources().getString(a7.j.f13417w0));
                        sb.append(" ");
                        string = HoneyPlayer.this.f30189r3.q().J();
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

    public class j implements DialogInterface.OnClickListener {
        public j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes;
            float f9;
            switch (i9) {
                case 0:
                    HoneyPlayer.this.u2("0.25x");
                    HoneyPlayer.this.f30048N.setText(HoneyPlayer.this.getResources().getString(a7.j.f13334n7) + " (0.25x)");
                    nSTIJKPlayerEpisodes = HoneyPlayer.this.f30125f;
                    f9 = 0.25f;
                    break;
                case 1:
                    HoneyPlayer.this.u2("0.5x");
                    HoneyPlayer.this.f30048N.setText(HoneyPlayer.this.getResources().getString(a7.j.f13334n7) + " (0.5x)");
                    nSTIJKPlayerEpisodes = HoneyPlayer.this.f30125f;
                    f9 = 0.5f;
                    break;
                case 2:
                    HoneyPlayer.this.u2("0.75x");
                    HoneyPlayer.this.f30048N.setText(HoneyPlayer.this.getResources().getString(a7.j.f13334n7) + " (0.75x)");
                    nSTIJKPlayerEpisodes = HoneyPlayer.this.f30125f;
                    f9 = 0.75f;
                    break;
                case 3:
                    HoneyPlayer.this.u2("1x (Normal)");
                    HoneyPlayer.this.f30048N.setText(HoneyPlayer.this.getResources().getString(a7.j.f13334n7) + " (1x)");
                    nSTIJKPlayerEpisodes = HoneyPlayer.this.f30125f;
                    f9 = 1.0f;
                    break;
                case 4:
                    HoneyPlayer.this.u2("1.25x");
                    HoneyPlayer.this.f30048N.setText(HoneyPlayer.this.getResources().getString(a7.j.f13334n7) + " (1.25x)");
                    nSTIJKPlayerEpisodes = HoneyPlayer.this.f30125f;
                    f9 = 1.25f;
                    break;
                case 5:
                    HoneyPlayer.this.u2("1.5x");
                    HoneyPlayer.this.f30048N.setText(HoneyPlayer.this.getResources().getString(a7.j.f13334n7) + " (1.5x)");
                    nSTIJKPlayerEpisodes = HoneyPlayer.this.f30125f;
                    f9 = 1.5f;
                    break;
                case 6:
                    HoneyPlayer.this.u2("1.75x");
                    HoneyPlayer.this.f30048N.setText(HoneyPlayer.this.getResources().getString(a7.j.f13334n7) + " (1.75x)");
                    nSTIJKPlayerEpisodes = HoneyPlayer.this.f30125f;
                    f9 = 1.75f;
                    break;
                case 7:
                    HoneyPlayer.this.u2("2x");
                    HoneyPlayer.this.f30048N.setText(HoneyPlayer.this.getResources().getString(a7.j.f13334n7) + " (2x)");
                    nSTIJKPlayerEpisodes = HoneyPlayer.this.f30125f;
                    f9 = 2.0f;
                    break;
                default:
                    return;
            }
            nSTIJKPlayerEpisodes.setSpeed(f9);
            dialogInterface.cancel();
        }
    }

    public class k implements DialogInterface.OnDismissListener {
        public k() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = HoneyPlayer.this.f30125f;
            if (nSTIJKPlayerEpisodes != null) {
                nSTIJKPlayerEpisodes.p2();
            }
        }
    }

    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HoneyPlayer.this.e2();
        }
    }

    public class m extends BroadcastReceiver {
        public m() {
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
                HoneyPlayer.this.f30125f.start();
                return;
            }
            if (intExtra == 2) {
                HoneyPlayer.this.f30125f.pause();
                return;
            }
            if (intExtra != 4) {
                if (intExtra != 5) {
                    return;
                }
                nSTIJKPlayerEpisodes = HoneyPlayer.this.f30125f;
                currentPosition = nSTIJKPlayerEpisodes.getCurrentPosition() + Constants.MAXIMUM_UPLOAD_PARTS;
            } else if (HoneyPlayer.this.f30125f.getCurrentPosition() - 10000 <= 0) {
                HoneyPlayer.this.f30125f.seekTo(0);
                return;
            } else {
                nSTIJKPlayerEpisodes = HoneyPlayer.this.f30125f;
                currentPosition = nSTIJKPlayerEpisodes.getCurrentPosition() - 10000;
            }
            nSTIJKPlayerEpisodes.seekTo(currentPosition);
        }
    }

    public class n extends NSTIJKPlayerEpisodes.M {
        public n() {
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes.M
        public void a() {
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes.M
        public void b() {
        }
    }

    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Log.e("honey", "count: " + HoneyPlayer.this.f30040L1);
                    if (SharepreferenceDBHandler.getMaintanceModeState(HoneyPlayer.this.f30080T1)) {
                        HoneyPlayer.this.f30080T1.startActivity(new Intent(HoneyPlayer.this.f30080T1, (Class<?>) MaintanencePannelActivity.class));
                    }
                    Thread.sleep(10000L);
                } catch (InterruptedException e9) {
                    Log.e("honey", "exc1: " + e9.getMessage());
                    Thread.currentThread().interrupt();
                } catch (Exception e10) {
                    Log.e("honey", "exc2: " + e10.getMessage());
                }
            }
        }
    }

    public class p implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f30245a;

        public p(View view) {
            this.f30245a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30245a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30245a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30245a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x0205  */
        @Override // android.view.View.OnFocusChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onFocusChange(android.view.View r27, boolean r28) {
            /*
                Method dump skipped, instruction units count: 2162
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer.p.onFocusChange(android.view.View, boolean):void");
        }
    }

    private void A2() {
        this.f29987A3 = new i();
    }

    private void B2() {
        this.f30115c3.startAnimation(this.f30108a2);
        this.f30115c3.setVisibility(8);
        this.f30053O.startAnimation(this.f30105Z1);
        this.f30053O.setVisibility(0);
        List list = this.f30065Q1;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f30151k0.setText(getResources().getString(a7.j.f13040J6) + " - " + ((GetEpisdoeDetailsCallback) this.f30065Q1.get(0)).getSeasonNumber());
        try {
            z2();
            C2630n c2630n = new C2630n(this.f30080T1, null, null, null, "from_player", this.f30169n3, this.f30068R);
            this.f30070R1 = c2630n;
            this.f30068R.setAdapter(c2630n);
            this.f30068R.requestFocus();
        } catch (Exception unused) {
        }
    }

    private void I1(Configuration configuration) {
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes;
        boolean z9;
        View decorView = getWindow().getDecorView();
        if (configuration.orientation == 2) {
            decorView.setSystemUiVisibility(5894);
            nSTIJKPlayerEpisodes = this.f30125f;
            z9 = false;
        } else {
            decorView.setSystemUiVisibility(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH);
            nSTIJKPlayerEpisodes = this.f30125f;
            z9 = true;
        }
        nSTIJKPlayerEpisodes.setAdjustViewBounds(z9);
    }

    private int J2(int i9, int i10) {
        return this.f30138h2.isStreamAvailable(String.valueOf(i9), i10);
    }

    private void K1(int i9) {
        if (f29981a4) {
            return;
        }
        this.f30125f.f36605x = new l();
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f30125f;
        nSTIJKPlayerEpisodes.f36601w.postDelayed(nSTIJKPlayerEpisodes.f36605x, i9);
    }

    private int K2(String str, int i9) {
        return this.f29991B2.isStreamAvailable(str, i9);
    }

    private void M2() {
        f29976V3.setVisibility(0);
        f29976V3.requestFocus();
        this.f30063Q.setVisibility(0);
    }

    private void N2() {
        H2();
        if (this.f30115c3.getVisibility() == 0) {
            e2();
        } else {
            C2();
            K1(5000);
        }
    }

    public static boolean O1() {
        ProgressBar progressBar = f29979Y3;
        if (progressBar == null || progressBar.getVisibility() != 0) {
            f29976V3.setEnabled(true);
            return false;
        }
        f29976V3.setEnabled(true);
        return true;
    }

    private void P1() {
        int iRound;
        int iR0;
        int iRound2;
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes;
        GetEpisdoeDetailsCallback getEpisdoeDetailsCallback;
        C2509z0 c2509z0;
        List list = this.f30006E2;
        if (list == null || list.size() <= 0) {
            return;
        }
        List list2 = this.f30065Q1;
        if (list2 != null) {
            list2.clear();
        }
        if (this.f30133g2 != null) {
            if (this.f30125f != null) {
                this.f30144i3 = this.f30080T1.getSharedPreferences("currentSeekTime", 0);
                long currentPosition = this.f30125f.getCurrentPosition();
                SharedPreferences sharedPreferences = this.f30080T1.getSharedPreferences("currentSeekTime", 0);
                this.f30144i3 = sharedPreferences;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                this.f30149j3 = editorEdit;
                editorEdit.putString("currentSeekTime", String.valueOf(currentPosition));
                this.f30149j3.apply();
                if (this.f30125f == null || C2966a.f().a() == null || !this.f30228z2.equals("m3u")) {
                    try {
                        if (SharepreferenceDBHandler.getCurrentAPPType(this.f30080T1).equals("onestream_api")) {
                            if (C2966a.f() != null && C2966a.f().e() != null && currentPosition != -1 && currentPosition != 0) {
                                ArrayList arrayListC = this.f30143i2.c(C2966a.f().e());
                                this.f29992B3 = arrayListC;
                                if (arrayListC != null && arrayListC.size() > 0) {
                                    int iZ1 = SharepreferenceDBHandler.getCurrentAPPType(this.f30080T1).equals("onestream_api") ? Z1(this.f30006E2, C2966a.f().e()) : Y1(this.f30006E2, w.r0(C2966a.f().e()));
                                    getEpisdoeDetailsCallback = new GetEpisdoeDetailsCallback();
                                    getEpisdoeDetailsCallback.setId(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getId());
                                    getEpisdoeDetailsCallback.setTitle(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getTitle());
                                    getEpisdoeDetailsCallback.setContainerExtension(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getContainerExtension());
                                    getEpisdoeDetailsCallback.setAdded(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getAdded());
                                    getEpisdoeDetailsCallback.setSeriesCover(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getSeriesCover());
                                    getEpisdoeDetailsCallback.setCategoryId(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getCategoryId());
                                    getEpisdoeDetailsCallback.setElapsed_time(String.valueOf(currentPosition));
                                    getEpisdoeDetailsCallback.setSeriesId(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getSeriesId());
                                    getEpisdoeDetailsCallback.setImage(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getImage());
                                    getEpisdoeDetailsCallback.setMovieImage(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getMovieImage());
                                    getEpisdoeDetailsCallback.setMainSeriesImg(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getMainSeriesImg());
                                    getEpisdoeDetailsCallback.setSeriesNum(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getSeriesNum());
                                    getEpisdoeDetailsCallback.setSeasonNumber(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getSeasonNumber());
                                    getEpisdoeDetailsCallback.setEpisodeNum(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getEpisodeNumber());
                                    getEpisdoeDetailsCallback.setSeriesName(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getSeriesName());
                                    getEpisdoeDetailsCallback.setLinks(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getLinks());
                                    this.f30222y1 = ((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getCategoryId();
                                    this.f29990B1 = ((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getSeriesName();
                                    NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.f30125f;
                                    getEpisdoeDetailsCallback.setDurationSec(nSTIJKPlayerEpisodes2 != null ? String.valueOf(nSTIJKPlayerEpisodes2.getDuration() / 1000) : ((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getDurationSec());
                                    this.f30143i2.b(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getId());
                                    this.f30143i2.i(this.f30080T1, ((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getSeriesId());
                                    c2509z0 = this.f30143i2;
                                    c2509z0.g(this.f30080T1, getEpisdoeDetailsCallback);
                                }
                            }
                        } else if (C2966a.f() != null && C2966a.f().e() != null && currentPosition != -1 && currentPosition != 0) {
                            ArrayList arrayListC2 = this.f30143i2.c(C2966a.f().e());
                            this.f29992B3 = arrayListC2;
                            if (arrayListC2 != null && arrayListC2.size() > 0) {
                                int iY1 = Y1(this.f30006E2, w.r0(C2966a.f().e()));
                                getEpisdoeDetailsCallback = new GetEpisdoeDetailsCallback();
                                getEpisdoeDetailsCallback.setId(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getId());
                                getEpisdoeDetailsCallback.setTitle(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getTitle());
                                getEpisdoeDetailsCallback.setContainerExtension(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getContainerExtension());
                                getEpisdoeDetailsCallback.setAdded(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getAdded());
                                getEpisdoeDetailsCallback.setSeriesCover(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getSeriesCover());
                                getEpisdoeDetailsCallback.setCategoryId(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getCategoryId());
                                getEpisdoeDetailsCallback.setElapsed_time(String.valueOf(currentPosition));
                                getEpisdoeDetailsCallback.setSeriesId(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getSeriesId());
                                getEpisdoeDetailsCallback.setImage(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getImage());
                                getEpisdoeDetailsCallback.setMovieImage(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getMovieImage());
                                getEpisdoeDetailsCallback.setMainSeriesImg(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getMainSeriesImg());
                                getEpisdoeDetailsCallback.setSeriesNum(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getSeriesNum());
                                getEpisdoeDetailsCallback.setSeasonNumber(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getSeasonNumber());
                                getEpisdoeDetailsCallback.setEpisodeNum(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getEpisodeNumber());
                                getEpisdoeDetailsCallback.setSeriesName(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getSeriesName());
                                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes3 = this.f30125f;
                                getEpisdoeDetailsCallback.setDurationSec(nSTIJKPlayerEpisodes3 != null ? String.valueOf(nSTIJKPlayerEpisodes3.getDuration() / 1000) : ((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getDurationSec());
                                this.f30143i2.b(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getId());
                                this.f30143i2.i(this.f30080T1, ((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getSeriesId());
                                c2509z0 = this.f30143i2;
                                c2509z0.g(this.f30080T1, getEpisdoeDetailsCallback);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            ArrayList<GetEpisdoeDetailsCallback> allSeriesRecentWatch = this.f30133g2.getAllSeriesRecentWatch("getalldata");
            for (int i9 = 0; i9 < this.f30006E2.size(); i9++) {
                if (((GetEpisdoeDetailsCallback) this.f30006E2.get(i9)).getSeasonNumber().equals(Integer.valueOf(this.f30224y3))) {
                    GetEpisdoeDetailsCallback getEpisdoeDetailsCallback2 = (GetEpisdoeDetailsCallback) this.f30006E2.get(i9);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= allSeriesRecentWatch.size()) {
                            break;
                        }
                        if (((GetEpisdoeDetailsCallback) this.f30006E2.get(i9)).getId().equals(allSeriesRecentWatch.get(i10).getId())) {
                            getEpisdoeDetailsCallback2.setElapsed_time(allSeriesRecentWatch.get(i10).getElapsed_time());
                            try {
                                iRound = Math.round(Integer.parseInt(allSeriesRecentWatch.get(i10).getElapsed_time()) / 1000.0f);
                                try {
                                    iR0 = (!getEpisdoeDetailsCallback2.getDurationSec().equals("") || (nSTIJKPlayerEpisodes = this.f30125f) == null) ? w.r0(getEpisdoeDetailsCallback2.getDurationSec()) : nSTIJKPlayerEpisodes.getDuration() / 1000;
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
                    this.f30065Q1.add(getEpisdoeDetailsCallback2);
                }
            }
        }
    }

    private void Q1(String str) {
        this.f30138h2.deleteMovieRecentWatch(str);
    }

    public static long R1(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0L;
        }
    }

    private void T1() {
        ImageView imageView = this.f30150k;
        imageView.setOnFocusChangeListener(new p(imageView));
        ImageView imageView2 = this.f30155l;
        imageView2.setOnFocusChangeListener(new p(imageView2));
        ImageView imageView3 = this.f30130g;
        imageView3.setOnFocusChangeListener(new p(imageView3));
        SeekBar seekBar = this.f30160m;
        seekBar.setOnFocusChangeListener(new p(seekBar));
        ImageView imageView4 = this.f30145j;
        imageView4.setOnFocusChangeListener(new p(imageView4));
        ImageView imageView5 = this.f29994C0;
        imageView5.setOnFocusChangeListener(new p(imageView5));
        LinearLayout linearLayout = this.f30165n;
        linearLayout.setOnFocusChangeListener(new p(linearLayout));
        LinearLayout linearLayout2 = this.f30170o;
        linearLayout2.setOnFocusChangeListener(new p(linearLayout2));
        LinearLayout linearLayout3 = this.f30175p;
        linearLayout3.setOnFocusChangeListener(new p(linearLayout3));
        f29976V3.setOnFocusChangeListener(new p(this.f30175p));
        LinearLayout linearLayout4 = this.f30185r;
        linearLayout4.setOnFocusChangeListener(new p(linearLayout4));
        ImageView imageView6 = this.f30200u;
        imageView6.setOnFocusChangeListener(new p(imageView6));
        ImageView imageView7 = this.f30205v;
        imageView7.setOnFocusChangeListener(new p(imageView7));
        ImageView imageView8 = this.f30156l0;
        imageView8.setOnFocusChangeListener(new p(imageView8));
        ImageView imageView9 = this.f30156l0;
        imageView9.setOnFocusChangeListener(new p(imageView9));
        TextView textView = this.f30186r0;
        textView.setOnFocusChangeListener(new p(textView));
        TextView textView2 = this.f30196t0;
        textView2.setOnFocusChangeListener(new p(textView2));
        RelativeLayout relativeLayout = this.f30182q1;
        relativeLayout.setOnFocusChangeListener(new p(relativeLayout));
        ImageView imageView10 = this.f30177p1;
        imageView10.setOnFocusChangeListener(new p(imageView10));
        LinearLayout linearLayout5 = this.f30187r1;
        linearLayout5.setOnFocusChangeListener(new p(linearLayout5));
        LinearLayout linearLayout6 = this.f30192s1;
        linearLayout6.setOnFocusChangeListener(new p(linearLayout6));
        CheckBox checkBox = this.f30044M0;
        checkBox.setOnFocusChangeListener(new p(checkBox));
        CheckBox checkBox2 = this.f30049N0;
        checkBox2.setOnFocusChangeListener(new p(checkBox2));
        CheckBox checkBox3 = this.f30054O0;
        checkBox3.setOnFocusChangeListener(new p(checkBox3));
        CheckBox checkBox4 = this.f30059P0;
        checkBox4.setOnFocusChangeListener(new p(checkBox4));
        LinearLayout linearLayout7 = this.f30197t1;
        linearLayout7.setOnFocusChangeListener(new p(linearLayout7));
        CheckBox checkBox5 = this.f30064Q0;
        checkBox5.setOnFocusChangeListener(new p(checkBox5));
        CheckBox checkBox6 = this.f30069R0;
        checkBox6.setOnFocusChangeListener(new p(checkBox6));
        CheckBox checkBox7 = this.f30074S0;
        checkBox7.setOnFocusChangeListener(new p(checkBox7));
        CheckBox checkBox8 = this.f30079T0;
        checkBox8.setOnFocusChangeListener(new p(checkBox8));
        CheckBox checkBox9 = this.f30084U0;
        checkBox9.setOnFocusChangeListener(new p(checkBox9));
        LinearLayout linearLayout8 = this.f30202u1;
        linearLayout8.setOnFocusChangeListener(new p(linearLayout8));
        LinearLayout linearLayout9 = this.f30207v1;
        linearLayout9.setOnFocusChangeListener(new p(linearLayout9));
        CheckBox checkBox10 = this.f30092W0;
        checkBox10.setOnFocusChangeListener(new p(checkBox10));
        CheckBox checkBox11 = this.f30096X0;
        checkBox11.setOnFocusChangeListener(new p(checkBox11));
        CheckBox checkBox12 = this.f30100Y0;
        checkBox12.setOnFocusChangeListener(new p(checkBox12));
        CheckBox checkBox13 = this.f30104Z0;
        checkBox13.setOnFocusChangeListener(new p(checkBox13));
        EditText editText = this.f30152k1;
        editText.setOnFocusChangeListener(new p(editText));
        TextView textView3 = this.f30039L0;
        textView3.setOnFocusChangeListener(new p(textView3));
    }

    public static String U1(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    private ArrayList a2(int i9, int i10) {
        return this.f30138h2.getStreamStatus(String.valueOf(i9), i10);
    }

    private LiveStreamsDBModel b2(String str, int i9) {
        return this.f29991B2.getStreamStatus(str, i9);
    }

    public static String d2(String str) {
        Matcher matcher = Pattern.compile("(?:youtube(?:-nocookie)?\\.com\\/(?:[^\\/\\n\\s]+\\/\\S+\\/|(?:v|e(?:mbed)?)\\/|\\S*?[?&]v=)|youtu\\.be\\/)([a-zA-Z0-9_-]{11})", 2).matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e2() {
        if (this.f30115c3.getVisibility() == 0) {
            this.f30115c3.startAnimation(this.f30108a2);
            if (this.f30121e0.getVisibility() == 0) {
                this.f30121e0.startAnimation(this.f30108a2);
            }
            if (this.f30073S.getVisibility() == 0) {
                this.f30073S.startAnimation(this.f30108a2);
            }
            if (this.f30141i0.getVisibility() == 0) {
                this.f30141i0.startAnimation(this.f30108a2);
            }
            if (this.f30078T.getVisibility() == 0) {
                this.f30078T.startAnimation(this.f30108a2);
            }
            if (this.f30126f0.getVisibility() == 0) {
                this.f30126f0.startAnimation(this.f30108a2);
            }
            this.f30115c3.setVisibility(8);
            if (this.f30121e0.getVisibility() == 0) {
                this.f30121e0.setVisibility(8);
            }
            if (this.f30073S.getVisibility() == 0) {
                this.f30073S.setVisibility(8);
            }
            if (this.f30141i0.getVisibility() == 0) {
                this.f30141i0.setVisibility(8);
            }
            if (this.f30078T.getVisibility() == 0) {
                this.f30078T.setVisibility(8);
            }
            if (this.f30126f0.getVisibility() == 0) {
                this.f30126f0.setVisibility(8);
            }
        }
        this.f30125f.f36576q = false;
    }

    private void g2() {
        this.f29997C3 = new Handler();
        this.f30118d2 = new Handler();
        this.f30067Q3 = new n7.g(this, this.f30080T1);
        this.f30085U1 = AnimationUtils.loadAnimation(this.f30080T1, a7.b.f11839q);
        this.f30089V1 = AnimationUtils.loadAnimation(this.f30080T1, a7.b.f11840r);
        this.f30105Z1 = AnimationUtils.loadAnimation(this.f30080T1, a7.b.f11830h);
        this.f30108a2 = AnimationUtils.loadAnimation(this.f30080T1, a7.b.f11831i);
        this.f30114c2 = AnimationUtils.loadAnimation(this.f30080T1, a7.b.f11837o);
        this.f30111b2 = AnimationUtils.loadAnimation(this.f30080T1, a7.b.f11836n);
        this.f30097X1 = AnimationUtils.loadAnimation(this.f30080T1, a7.b.f11841s);
        this.f30101Y1 = AnimationUtils.loadAnimation(this.f30080T1, a7.b.f11842t);
        this.f30093W1 = AnimationUtils.loadAnimation(this.f30080T1, a7.b.f11838p);
        try {
            A2();
        } catch (Exception unused) {
        }
        if (this.f30169n3.equals("mobile")) {
            try {
                C2325b c2325bE = C2325b.e(this);
                this.f30194s3 = c2325bE;
                this.f30189r3 = c2325bE.c().c();
                AbstractC2324a.b(getApplicationContext(), this.f30216x0);
            } catch (Exception unused2) {
            }
        }
    }

    private void i2() {
        List list;
        int iD = C2966a.f().d();
        String str = this.f30109a3;
        str.hashCode();
        if (str.equals("series") && (list = this.f30006E2) != null && list.size() > 0 && iD == this.f30006E2.size() - 1) {
            C2966a.f().w(0);
        } else {
            C2966a.f().w(iD + 1);
        }
    }

    private void k2() {
        this.f30150k.setOnClickListener(this);
        this.f30155l.setOnClickListener(this);
        this.f30135h.setOnClickListener(this);
        this.f30130g.setOnClickListener(this);
        this.f30160m.setOnClickListener(this);
        this.f30140i.setOnClickListener(this);
        this.f30145j.setOnClickListener(this);
        this.f30165n.setOnClickListener(this);
        this.f30170o.setOnClickListener(this);
        this.f30175p.setOnClickListener(this);
        f29976V3.setOnClickListener(this);
        this.f30185r.setOnClickListener(this);
        this.f30200u.setOnClickListener(this);
        this.f30205v.setOnClickListener(this);
        this.f30161m0.setOnClickListener(this);
        this.f30171o0.setOnClickListener(this);
        this.f30177p1.setOnClickListener(this);
        this.f30182q1.setOnClickListener(this);
        this.f30187r1.setOnClickListener(this);
        this.f30192s1.setOnClickListener(this);
        this.f30197t1.setOnClickListener(this);
        this.f30202u1.setOnClickListener(this);
        this.f30207v1.setOnClickListener(this);
        this.f30107a1.setOnClickListener(this);
        this.f30162m1.setOnClickListener(this);
        this.f29994C0.setOnClickListener(this);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f30125f.setMovieListener(this.f30082T3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x02d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void l2(java.util.ArrayList r35, int r36) {
        /*
            Method dump skipped, instruction units count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer.l2(java.util.ArrayList, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x024e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m2(java.util.ArrayList r25, java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer.m2(java.util.ArrayList, java.lang.String):void");
    }

    private void n2(ArrayList arrayList, int i9) {
        String str;
        String str2;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        String name = ((File) arrayList.get(i9)).getName();
        String strS0 = w.S0(w7.k.a() + w7.k.i());
        SimpleDateFormat simpleDateFormat = this.f30031J2;
        if (R1(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(this.f30080T1))), this.f30041L2.format(this.f30036K2)) >= C2939c.p() && (str = this.f30056O2) != null && this.f30061P2 != null && (!f29977W3.equals(str) || (this.f30056O2 != null && (str2 = this.f30061P2) != null && !f29978X3.equals(str2)))) {
            this.f30026I2 = Boolean.FALSE;
            this.f30112b3.b(a7.f.f12146G).e();
            this.f30112b3.b(a7.f.f12186K).c(strS0 + this.f30046M2 + this.f30051N2);
        }
        if (this.f30026I2.booleanValue()) {
            C2966a.f().w(i9);
            this.f30146j0.setText(name);
            w2();
            String str3 = this.f29986A2;
            this.f30199t3 = str3;
            this.f30125f.Q2(str3, true, name, 0L, 0, "", null, 0, 0, this.f30228z2, "nst", this.f30021H2);
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f30125f;
            if (nSTIJKPlayerEpisodes != null) {
                nSTIJKPlayerEpisodes.f36516e = 0;
                nSTIJKPlayerEpisodes.f36521f = false;
                nSTIJKPlayerEpisodes.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q2() {
        String strSubstring;
        MediaInfo mediaInfoA;
        C2328e c2328e;
        try {
            String type = SharepreferenceDBHandler.getType(this.f30080T1);
            strSubstring = "";
            if (type.equals("loadurl")) {
                String str = this.f30134g3;
                this.f30139h3 = str;
                int iLastIndexOf = str.lastIndexOf(47);
                strSubstring = iLastIndexOf > 1 ? this.f30139h3.substring(iLastIndexOf + 1) : "";
                String str2 = this.f30139h3;
                this.f30199t3 = str2;
                mediaInfoA = AbstractC1902a.a(strSubstring, "", "", 0, str2, "videos/mp4", this.f30209v3, "", null);
                c2328e = this.f30189r3;
            } else {
                int ipAddress = ((WifiManager) getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress();
                String str3 = String.format("%d.%d.%d.%d", Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255), Integer.valueOf((ipAddress >> 24) & 255));
                String strSubstring2 = InstructionFileId.DOT;
                if (type.equals("devicedata")) {
                    this.f30139h3 = this.f30134g3;
                }
                int iLastIndexOf2 = this.f30139h3.lastIndexOf(47);
                if (iLastIndexOf2 > 1) {
                    strSubstring = this.f30139h3.substring(iLastIndexOf2 + 1);
                    strSubstring2 = this.f30139h3.substring(0, iLastIndexOf2);
                }
                String str4 = strSubstring;
                this.f30052N3.b();
                this.f30052N3.a(str3, strSubstring2);
                String str5 = "http://" + str3 + ":8080/" + str4;
                this.f30199t3 = str5;
                mediaInfoA = AbstractC1902a.a(str4, "", "", 0, str5, "videos/mp4", this.f30209v3, "", null);
                c2328e = this.f30189r3;
            }
            AbstractC1902a.c(0, true, mediaInfoA, c2328e, this.f30080T1);
        } catch (Exception unused) {
        }
    }

    private void s2() {
        try {
            SharedPreferences.Editor editorEdit = this.f30174o3.edit();
            this.f30179p3 = editorEdit;
            if (editorEdit != null) {
                editorEdit.putString("pref.using_playback_speed", "1x (Normal)");
                this.f30179p3.apply();
            }
            this.f30048N.setText(getResources().getString(a7.j.f13334n7) + " (1x)");
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void t2() {
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
            android.content.SharedPreferences r7 = r0.f30174o3
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
            com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer$j r2 = new com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer$j
            r2.<init>()
            r5.l(r1, r3, r2)
            androidx.appcompat.app.a r1 = r5.create()
            r0.f30007E3 = r1
            com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer$k r2 = new com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer$k
            r2.<init>()
            r1.setOnDismissListener(r2)
            androidx.appcompat.app.a r1 = r0.f30007E3
            r1.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer.t2():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void u1() {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer.u1():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u2(String str) {
        SharedPreferences.Editor editorEdit = this.f30174o3.edit();
        this.f30179p3 = editorEdit;
        if (editorEdit != null) {
            editorEdit.putString("pref.using_playback_speed", str);
            this.f30179p3.apply();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0088, code lost:
    
        r25 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0095, code lost:
    
        r25 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0077, code lost:
    
        r25 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007b, code lost:
    
        r25 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:379:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fb A[PHI: r30
      0x01fb: PHI (r30v4 java.lang.String) = 
      (r30v3 java.lang.String)
      (r30v3 java.lang.String)
      (r30v3 java.lang.String)
      (r30v3 java.lang.String)
      (r30v3 java.lang.String)
      (r30v5 java.lang.String)
     binds: [B:79:0x021f, B:81:0x0225, B:83:0x022d, B:85:0x0237, B:76:0x021a, B:66:0x01f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0079 A[PHI: r25
      0x0079: PHI (r25v8 java.lang.String) = (r25v4 java.lang.String), (r25v5 java.lang.String), (r25v6 java.lang.String), (r25v9 java.lang.String) binds: [B:17:0x009d, B:13:0x0090, B:9:0x0083, B:6:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0257  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void v2() {
        /*
            Method dump skipped, instruction units count: 2718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer.v2():void");
    }

    private void w2() {
        try {
            if (this.f30125f != null) {
                this.f30144i3 = this.f30080T1.getSharedPreferences("currentSeekTime", 0);
                long currentPosition = this.f30125f.getCurrentPosition();
                SharedPreferences sharedPreferences = this.f30080T1.getSharedPreferences("currentSeekTime", 0);
                this.f30144i3 = sharedPreferences;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                this.f30149j3 = editorEdit;
                editorEdit.putString("currentSeekTime", String.valueOf(currentPosition));
                this.f30149j3.apply();
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f30125f;
                if (nSTIJKPlayerEpisodes != null && currentPosition != -1 && currentPosition != 0) {
                    nSTIJKPlayerEpisodes.setCurrentPositionSeekbar(nSTIJKPlayerEpisodes.getCurrentPosition());
                    this.f30125f.setProgress(true);
                    this.f30125f.E2(true);
                }
                String str = this.f30109a3;
                if (str == null || !str.equals("movies")) {
                    String str2 = this.f30109a3;
                    if (str2 != null && str2.equals("series") && (this.f30125f == null || C2966a.f().a() == null || !this.f30228z2.equals("m3u"))) {
                        try {
                            if (SharepreferenceDBHandler.getCurrentAPPType(this.f30080T1).equals("onestream_api")) {
                                if (C2966a.f() != null && C2966a.f().e() != null && currentPosition != -1 && currentPosition != 0) {
                                    ArrayList arrayListC = this.f30143i2.c(C2966a.f().e());
                                    this.f29992B3 = arrayListC;
                                    if (arrayListC != null && arrayListC.size() > 0) {
                                        int iZ1 = SharepreferenceDBHandler.getCurrentAPPType(this.f30080T1).equals("onestream_api") ? Z1(this.f30006E2, C2966a.f().e()) : Y1(this.f30006E2, w.r0(C2966a.f().e()));
                                        GetEpisdoeDetailsCallback getEpisdoeDetailsCallback = new GetEpisdoeDetailsCallback();
                                        getEpisdoeDetailsCallback.setId(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getId());
                                        getEpisdoeDetailsCallback.setTitle(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getTitle());
                                        getEpisdoeDetailsCallback.setContainerExtension(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getContainerExtension());
                                        getEpisdoeDetailsCallback.setAdded(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getAdded());
                                        getEpisdoeDetailsCallback.setSeriesCover(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getSeriesCover());
                                        getEpisdoeDetailsCallback.setCategoryId(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getCategoryId());
                                        getEpisdoeDetailsCallback.setElapsed_time(String.valueOf(currentPosition));
                                        getEpisdoeDetailsCallback.setSeriesId(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getSeriesId());
                                        getEpisdoeDetailsCallback.setImage(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getImage());
                                        getEpisdoeDetailsCallback.setMovieImage(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getMovieImage());
                                        getEpisdoeDetailsCallback.setMainSeriesImg(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getMainSeriesImg());
                                        getEpisdoeDetailsCallback.setSeriesNum(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getSeriesNum());
                                        getEpisdoeDetailsCallback.setSeasonNumber(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getSeasonNumber());
                                        getEpisdoeDetailsCallback.setEpisodeNum(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getEpisodeNumber());
                                        getEpisdoeDetailsCallback.setSeriesName(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getSeriesName());
                                        this.f30222y1 = ((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getCategoryId();
                                        if (SharepreferenceDBHandler.getCurrentAPPType(this.f30080T1).equals("onestream_api")) {
                                            getEpisdoeDetailsCallback.setLinks(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getLinks());
                                        }
                                        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.f30125f;
                                        getEpisdoeDetailsCallback.setDurationSec(nSTIJKPlayerEpisodes2 != null ? String.valueOf(nSTIJKPlayerEpisodes2.getDuration() / 1000) : ((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getDurationSec());
                                        this.f30143i2.b(((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getId());
                                        this.f30143i2.i(this.f30080T1, ((GetEpisdoeDetailsCallback) this.f30006E2.get(iZ1)).getSeriesId());
                                        this.f30143i2.g(this.f30080T1, getEpisdoeDetailsCallback);
                                    }
                                }
                            } else if (C2966a.f() != null && C2966a.f().e() != null && currentPosition != -1 && currentPosition != 0) {
                                ArrayList arrayListC2 = this.f30143i2.c(C2966a.f().e());
                                this.f29992B3 = arrayListC2;
                                if (arrayListC2 != null && arrayListC2.size() > 0) {
                                    int iY1 = Y1(this.f30006E2, w.r0(C2966a.f().e()));
                                    GetEpisdoeDetailsCallback getEpisdoeDetailsCallback2 = new GetEpisdoeDetailsCallback();
                                    getEpisdoeDetailsCallback2.setId(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getId());
                                    getEpisdoeDetailsCallback2.setTitle(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getTitle());
                                    getEpisdoeDetailsCallback2.setContainerExtension(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getContainerExtension());
                                    getEpisdoeDetailsCallback2.setAdded(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getAdded());
                                    getEpisdoeDetailsCallback2.setSeriesCover(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getSeriesCover());
                                    getEpisdoeDetailsCallback2.setCategoryId(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getCategoryId());
                                    getEpisdoeDetailsCallback2.setElapsed_time(String.valueOf(currentPosition));
                                    getEpisdoeDetailsCallback2.setSeriesId(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getSeriesId());
                                    getEpisdoeDetailsCallback2.setImage(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getImage());
                                    getEpisdoeDetailsCallback2.setMovieImage(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getMovieImage());
                                    getEpisdoeDetailsCallback2.setMainSeriesImg(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getMainSeriesImg());
                                    getEpisdoeDetailsCallback2.setSeriesNum(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getSeriesNum());
                                    getEpisdoeDetailsCallback2.setSeasonNumber(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getSeasonNumber());
                                    getEpisdoeDetailsCallback2.setEpisodeNum(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getEpisodeNumber());
                                    getEpisdoeDetailsCallback2.setSeriesName(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getSeriesName());
                                    NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes3 = this.f30125f;
                                    getEpisdoeDetailsCallback2.setDurationSec(nSTIJKPlayerEpisodes3 != null ? String.valueOf(nSTIJKPlayerEpisodes3.getDuration() / 1000) : ((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getDurationSec());
                                    this.f30143i2.b(((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getId());
                                    this.f30143i2.i(this.f30080T1, ((GetEpisdoeDetailsCallback) this.f30006E2.get(iY1)).getSeriesId());
                                    this.f30143i2.g(this.f30080T1, getEpisdoeDetailsCallback2);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    x2(1);
                }
            }
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes4 = this.f30125f;
            if (nSTIJKPlayerEpisodes4 != null) {
                if (nSTIJKPlayerEpisodes4.t2()) {
                    this.f30125f.j2();
                } else {
                    this.f30125f.e3();
                    this.f30125f.C2(true);
                    this.f30125f.a3();
                }
                IjkMediaPlayer.native_profileEnd();
            }
        } catch (Exception unused2) {
        }
    }

    private void x2(int i9) {
        long currentPosition;
        ArrayList arrayListA2;
        int iW1;
        Context context;
        ArrayList arrayListC2;
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f30125f;
        if (nSTIJKPlayerEpisodes != null) {
            if (i9 == 0) {
                this.f30144i3 = this.f30080T1.getSharedPreferences("currentSeekTime", 0);
                currentPosition = this.f30125f.getCurrentPosition();
                SharedPreferences sharedPreferences = this.f30080T1.getSharedPreferences("currentSeekTime", 0);
                this.f30144i3 = sharedPreferences;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                this.f30149j3 = editorEdit;
                editorEdit.putString("currentSeekTime", String.valueOf(currentPosition));
                this.f30149j3.apply();
            } else {
                currentPosition = nSTIJKPlayerEpisodes.getCurrentPosition();
            }
            long j9 = currentPosition;
            new LiveStreamsDBModel();
            if (this.f30228z2.equals("m3u")) {
                b2(String.valueOf(Uri.parse(this.f30123e2)), SharepreferenceDBHandler.getUserID(this.f30080T1));
                return;
            }
            try {
                if (this.f30228z2.equals("onestream_api")) {
                    if (this.f30125f == null || C2966a.f().m().isEmpty() || j9 == -1 || j9 == 0 || (arrayListC2 = c2(this.f30076S2, SharepreferenceDBHandler.getUserID(this.f30080T1))) == null || arrayListC2.size() <= 0) {
                        return;
                    }
                    iW1 = X1(this.f29996C2, this.f30076S2);
                    Q1(((LiveStreamsDBModel) this.f29996C2.get(iW1)).getStreamId());
                    context = this.f30080T1;
                } else {
                    if (this.f30125f == null || C2966a.f().k() == -1 || j9 == -1 || j9 == 0 || (arrayListA2 = a2(this.f30066Q2, SharepreferenceDBHandler.getUserID(this.f30080T1))) == null || arrayListA2.size() <= 0) {
                        return;
                    }
                    iW1 = W1(this.f29996C2, this.f30066Q2);
                    Q1(((LiveStreamsDBModel) this.f29996C2.get(iW1)).getStreamId());
                    context = this.f30080T1;
                }
                y2(context, this.f29996C2, iW1, j9);
            } catch (Exception unused) {
            }
        }
    }

    private void z2() {
        RecyclerView recyclerView = this.f30068R;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f30080T1, 1);
            this.f30075S1 = gridLayoutManager;
            this.f30068R.setLayoutManager(gridLayoutManager);
            this.f30068R.setItemAnimator(new androidx.recyclerview.widget.c());
        }
    }

    public void C2() {
        if (f29981a4 || N1() || this.f30058P.getVisibility() != 8 || this.f30115c3.getVisibility() != 8) {
            return;
        }
        this.f30115c3.startAnimation(this.f30105Z1);
        this.f30115c3.setVisibility(0);
    }

    @Override // z7.j
    public void D0(String str) {
    }

    public void D2() {
        if (f29981a4 || N1() || this.f30115c3.getVisibility() != 8) {
            return;
        }
        this.f30115c3.startAnimation(this.f30105Z1);
        this.f30115c3.setVisibility(0);
        if (this.f30121e0.getVisibility() == 8) {
            this.f30121e0.startAnimation(this.f30105Z1);
            this.f30121e0.setVisibility(0);
        }
        if (this.f30073S.getVisibility() == 8) {
            this.f30073S.startAnimation(this.f30105Z1);
            this.f30073S.setVisibility(0);
        }
        if (this.f30141i0.getVisibility() == 8) {
            this.f30141i0.startAnimation(this.f30105Z1);
            this.f30141i0.setVisibility(0);
        }
        if (this.f30078T.getVisibility() == 8) {
            this.f30078T.startAnimation(this.f30105Z1);
            this.f30078T.setVisibility(0);
        }
        if (this.f30126f0.getVisibility() == 8) {
            this.f30126f0.startAnimation(this.f30105Z1);
            this.f30126f0.setVisibility(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E2() {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer.E2():void");
    }

    public void F2(int i9) {
        b bVar = new b();
        this.f30002D3 = bVar;
        this.f29997C3.postDelayed(bVar, i9);
    }

    public final void G2() {
        if (this.f30058P.getVisibility() == 8) {
            this.f30058P.startAnimation(this.f30111b2);
            this.f30058P.setVisibility(0);
            this.f30205v.requestFocus();
        }
    }

    public void H2() {
        Handler handler;
        if (f29981a4 || N1() || (handler = this.f30125f.f36601w) == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    public void I2() {
        Handler handler = this.f29997C3;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        RelativeLayout relativeLayout = this.f29984A0;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }

    public void J1() {
        File[] fileArrO = w.O(this.f30080T1);
        for (File file : fileArrO) {
            if (file.toString().endsWith(".ts")) {
                Arrays.asList(file);
            }
        }
        if (fileArrO.length > 0) {
            ArrayList arrayList = this.f30037K3;
            if (arrayList != null) {
                arrayList.clear();
            }
            for (File file2 : fileArrO) {
                if (file2.toString().endsWith(".ts")) {
                    this.f30037K3.addAll(Arrays.asList(file2));
                }
            }
            Collections.reverse(this.f30037K3);
            this.f30032J3 = this.f30037K3;
        }
    }

    public void L1(int i9) {
        if (f29981a4) {
            return;
        }
        this.f30125f.f36605x = new a();
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f30125f;
        nSTIJKPlayerEpisodes.f36601w.postDelayed(nSTIJKPlayerEpisodes.f36605x, i9);
    }

    public final int L2(String str, int i9) {
        return this.f30138h2.isStreamAvailable(String.valueOf(str), i9);
    }

    @Override // z7.j
    public void M0(String str) {
        try {
            w.X();
        } catch (Exception unused) {
        }
    }

    public void M1() {
        this.f30015G1 = new ArrayList();
        this.f30020H1 = new JsonArray();
        if (this.f30064Q0.isChecked()) {
            this.f30015G1.add(this.f30064Q0.getText().toString());
            this.f30020H1.add(this.f30064Q0.getText().toString());
        }
        if (this.f30069R0.isChecked()) {
            this.f30015G1.add(this.f30069R0.getText().toString());
            this.f30020H1.add(this.f30069R0.getText().toString());
        }
        if (this.f30074S0.isChecked()) {
            this.f30015G1.add(this.f30074S0.getText().toString());
            this.f30020H1.add(this.f30074S0.getText().toString());
        }
        if (this.f30079T0.isChecked()) {
            this.f30015G1.add(this.f30079T0.getText().toString());
            this.f30020H1.add(this.f30079T0.getText().toString());
        }
        if (this.f30084U0.isChecked()) {
            this.f30015G1.add(this.f30084U0.getText().toString());
            this.f30020H1.add(this.f30084U0.getText().toString());
        }
        if (this.f30044M0.isChecked()) {
            this.f30015G1.add(this.f30044M0.getText().toString());
            this.f30020H1.add(this.f30044M0.getText().toString());
        }
        if (this.f30049N0.isChecked()) {
            this.f30015G1.add(this.f30049N0.getText().toString());
            this.f30020H1.add(this.f30049N0.getText().toString());
        }
        if (this.f30054O0.isChecked()) {
            this.f30015G1.add(this.f30054O0.getText().toString());
            this.f30020H1.add(this.f30054O0.getText().toString());
        }
        if (this.f30059P0.isChecked()) {
            this.f30015G1.add(this.f30059P0.getText().toString());
            this.f30020H1.add(this.f30059P0.getText().toString());
        }
        if (this.f30092W0.isChecked()) {
            this.f30015G1.add(this.f30092W0.getText().toString());
            this.f30020H1.add(this.f30092W0.getText().toString());
        }
        if (this.f30096X0.isChecked()) {
            this.f30015G1.add(this.f30096X0.getText().toString());
            this.f30020H1.add(this.f30096X0.getText().toString());
        }
        if (this.f30100Y0.isChecked()) {
            this.f30015G1.add(this.f30100Y0.getText().toString());
            this.f30020H1.add(this.f30100Y0.getText().toString());
        }
        if (this.f30104Z0.isChecked()) {
            this.f30015G1.add(this.f30104Z0.getText().toString());
            this.f30020H1.add(this.f30104Z0.getText().toString());
        }
        this.f30025I1 = new Gson().toJson((JsonElement) this.f30020H1);
        Log.e("TAG", this.f30020H1 + "");
    }

    public boolean N1() {
        RelativeLayout relativeLayout = this.f30176p0;
        return relativeLayout != null && relativeLayout.getVisibility() == 0;
    }

    @Override // z7.j
    public void P(String str) {
    }

    public void S1() {
        f29976V3.setClickable(true);
        f29976V3.setEnabled(true);
    }

    @Override // z7.j
    public void T0(StalkerDeletePlayerLinkCallback stalkerDeletePlayerLinkCallback) {
    }

    public void V1() {
        if (this.f30172o1.getVisibility() == 0) {
            this.f30187r1.setNextFocusRightId(a7.f.f12190K3);
            this.f30192s1.setNextFocusRightId(a7.f.f12383e2);
            this.f30197t1.setNextFocusRightId(a7.f.f12342a2);
            this.f30202u1.setNextFocusRightId(a7.f.f12296V1);
        }
    }

    public int W1(ArrayList arrayList, int i9) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (w.r0(((LiveStreamsDBModel) arrayList.get(i10)).getStreamId()) == i9) {
                return i10;
            }
        }
        return 0;
    }

    @Override // z7.j
    public void X(StalkerShortEPGCallback stalkerShortEPGCallback) {
    }

    public int X1(ArrayList arrayList, String str) {
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (((LiveStreamsDBModel) arrayList.get(i9)).getStreamIdOneStream().equals(str)) {
                return i9;
            }
        }
        return 0;
    }

    public int Y1(List list, int i9) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (w.r0(((GetEpisdoeDetailsCallback) list.get(i10)).getId()) == i9) {
                return i10;
            }
        }
        return 0;
    }

    public int Z1(List list, String str) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (((GetEpisdoeDetailsCallback) list.get(i9)).getId().equals(str)) {
                return i9;
            }
        }
        return 0;
    }

    public final ArrayList c2(String str, int i9) {
        return this.f30138h2.getStreamStatus(String.valueOf(str), i9);
    }

    public void f2() {
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f30125f;
        if (nSTIJKPlayerEpisodes != null) {
            nSTIJKPlayerEpisodes.p2();
            this.f30125f.f36504a3.removeMessages(1);
        }
        if (f29981a4 || this.f30115c3.getVisibility() != 0) {
            return;
        }
        this.f30115c3.startAnimation(this.f30108a2);
        if (this.f30121e0.getVisibility() == 0) {
            this.f30121e0.startAnimation(this.f30108a2);
        }
        if (this.f30073S.getVisibility() == 0) {
            this.f30073S.startAnimation(this.f30108a2);
        }
        if (this.f30141i0.getVisibility() == 0) {
            this.f30141i0.startAnimation(this.f30108a2);
        }
        if (this.f30078T.getVisibility() == 0) {
            this.f30078T.startAnimation(this.f30108a2);
        }
        if (this.f30126f0.getVisibility() == 0) {
            this.f30126f0.startAnimation(this.f30108a2);
        }
        this.f30115c3.setVisibility(8);
        if (this.f30121e0.getVisibility() == 0) {
            this.f30121e0.setVisibility(8);
        }
        if (this.f30073S.getVisibility() == 0) {
            this.f30073S.setVisibility(8);
        }
        if (this.f30141i0.getVisibility() == 0) {
            this.f30141i0.setVisibility(8);
        }
        if (this.f30078T.getVisibility() == 0) {
            this.f30078T.setVisibility(8);
        }
        if (this.f30126f0.getVisibility() == 0) {
            this.f30126f0.setVisibility(8);
        }
    }

    public void h2() {
        if (this.f30125f == null) {
            return;
        }
        L1(0);
        int i9 = Build.VERSION.SDK_INT;
        Rational rational = (this.f30125f.G2() == 0 || this.f30125f.F2() == 0) ? new Rational(this.f30125f.getWidth(), this.f30125f.getHeight()) : new Rational(this.f30125f.G2(), this.f30125f.F2());
        if (i9 >= 26) {
            try {
                this.f30027I3.setAspectRatio(rational).build();
                enterPictureInPictureMode(this.f30027I3.build());
            } catch (Exception unused) {
                this.f30027I3.setAspectRatio(new Rational(this.f30125f.getWidth(), this.f30125f.getHeight())).build();
                enterPictureInPictureMode(this.f30027I3.build());
            }
        }
    }

    public void j2(String str) {
        e2();
        this.f30112b3.b(a7.f.f12146G).e();
        this.f30112b3.b(a7.f.f12186K).c(str);
    }

    public final void o2(List list, int i9) {
        String str;
        String str2;
        int i10;
        int i11;
        String str3;
        int i12;
        long jLongValue;
        int iR0;
        int iRound;
        int iRound2;
        int i13;
        String str4;
        String str5;
        SharedPreferences.Editor editor;
        if (list == null || list.size() <= 0) {
            return;
        }
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f30125f;
        if (nSTIJKPlayerEpisodes != null && nSTIJKPlayerEpisodes.getPlayerIsPrepared()) {
            if (this.f30125f.f36551l == i9) {
                return;
            }
        }
        H2();
        C2();
        K1(5000);
        int iY1 = Y1(list, i9);
        String title = ((GetEpisdoeDetailsCallback) list.get(iY1)).getTitle();
        this.f30209v3 = ((GetEpisdoeDetailsCallback) list.get(iY1)).getMovieImage();
        this.f30204u3 = title;
        this.f30214w3 = String.valueOf(((GetEpisdoeDetailsCallback) list.get(iY1)).getSeasonNumber());
        this.f30219x3 = w.r0(((GetEpisdoeDetailsCallback) list.get(iY1)).getElapsed_time());
        this.f30224y3 = ((GetEpisdoeDetailsCallback) list.get(iY1)).getSeasonNumber().intValue();
        w.S0(w7.k.a() + w7.k.i());
        ((GetEpisdoeDetailsCallback) list.get(iY1)).getId();
        int iQ0 = w.q0(((GetEpisdoeDetailsCallback) list.get(iY1)).getId());
        int i14 = this.f30081T2;
        String containerExtension = ((GetEpisdoeDetailsCallback) list.get(iY1)).getContainerExtension();
        ((GetEpisdoeDetailsCallback) list.get(iY1)).getCategoryId();
        this.f30011F2 = ((GetEpisdoeDetailsCallback) list.get(iY1)).getId();
        this.f30222y1 = ((GetEpisdoeDetailsCallback) list.get(iY1)).getCategoryId();
        this.f29990B1 = ((GetEpisdoeDetailsCallback) list.get(iY1)).getSeriesName();
        C2966a.f().w(iY1);
        int iH = this.f30143i2.h(this.f30011F2, SharepreferenceDBHandler.getUserID(this.f30080T1));
        SharedPreferences.Editor editor2 = this.f30198t2;
        if (editor2 != null) {
            editor2.putString("currentlyPlayingVideo", String.valueOf(((GetEpisdoeDetailsCallback) list.get(iY1)).getId()));
            this.f30198t2.apply();
        }
        String str6 = this.f30109a3;
        if (str6 != null && str6.equals("series") && (editor = this.f30198t2) != null) {
            editor.putString("currentlyPlayingVideo", String.valueOf(((GetEpisdoeDetailsCallback) list.get(iY1)).getId()));
            this.f30198t2.apply();
        }
        SharedPreferences.Editor editor3 = this.f30203u2;
        if (editor3 != null) {
            editor3.putString("currentlyPlayingVideoPosition", String.valueOf(iY1));
            this.f30203u2.apply();
        }
        SimpleDateFormat simpleDateFormat = this.f30031J2;
        if (R1(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(this.f30080T1))), this.f30041L2.format(this.f30036K2)) >= C2939c.p() && (str4 = this.f30056O2) != null && this.f30061P2 != null && (!f29977W3.equals(str4) || (this.f30056O2 != null && (str5 = this.f30061P2) != null && !f29978X3.equals(str5)))) {
            this.f30026I2 = Boolean.FALSE;
        }
        this.f30016G2 = iQ0;
        this.f30146j0.setText(title);
        if (iH == 0 && this.f30026I2.booleanValue()) {
            w2();
            this.f30125f.setProgress(false);
            if (this.f30228z2.equals("m3u")) {
                C2966a.f().r("m3u");
                String str7 = this.f30123e2;
                this.f30199t3 = str7;
                i10 = i14;
                str3 = title;
                this.f30125f.Q2(str7, true, title, 0L, 0, "", null, iY1, 0, this.f30228z2, "nst", "");
                str = InstructionFileId.DOT;
                str2 = containerExtension;
                i13 = iQ0;
            } else {
                i10 = i14;
                str3 = title;
                String strValueOf = String.valueOf(Uri.parse(this.f29986A2 + iQ0 + InstructionFileId.DOT + containerExtension));
                this.f30199t3 = strValueOf;
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.f30125f;
                ArrayList arrayList = this.f30001D2;
                String str8 = this.f30228z2;
                str2 = containerExtension;
                str = InstructionFileId.DOT;
                i13 = iQ0;
                nSTIJKPlayerEpisodes2.Q2(strValueOf, true, str3, 0L, iQ0, "", arrayList, iY1, 0, str8, "nst", "");
            }
            EpisodesUsingSinglton.getInstance().setEpisodeList(list);
            C2966a.f().x(this.f30011F2);
            i11 = i13;
            C2966a.f().G(i11);
            C2966a.f().v(list);
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes3 = this.f30125f;
            i12 = 0;
            nSTIJKPlayerEpisodes3.f36516e = 0;
            nSTIJKPlayerEpisodes3.f36521f = false;
            nSTIJKPlayerEpisodes3.start();
        } else {
            str = InstructionFileId.DOT;
            str2 = containerExtension;
            i10 = i14;
            i11 = iQ0;
            str3 = title;
            i12 = 0;
        }
        if (iH <= 0 || this.f30143i2.a(this.f30011F2) <= 0) {
            return;
        }
        try {
            jLongValue = this.f30133g2.gettimeElapsed(this.f30011F2).longValue();
        } catch (Exception unused) {
            jLongValue = 0;
        }
        if (i10 == 0) {
            iR0 = w.r0(this.f30133g2.getTotaltime(this.f30011F2).toString());
            this.f30081T2 = iR0;
        } else {
            iR0 = i10;
        }
        if (this.f30125f == null || !this.f30026I2.booleanValue()) {
            return;
        }
        w2();
        String strValueOf2 = String.valueOf(Uri.parse(this.f29986A2 + this.f30011F2 + str + str2));
        this.f30199t3 = strValueOf2;
        this.f30125f.setProgress(true);
        C2966a.f().I(jLongValue);
        this.f30125f.setCurrentPositionSeekbar((int) jLongValue);
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
            this.f30125f.setCurrentPositionSeekbar(i12);
        }
        EpisodesUsingSinglton.getInstance().setEpisodeList(list);
        C2966a.f().x(this.f30011F2);
        this.f30125f.Q2(strValueOf2, true, str3, 0L, i11, "", this.f30001D2, iY1, 0, this.f30228z2, "nst", "");
        this.f30125f.start();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        RelativeLayout relativeLayout = this.f29984A0;
        if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
            I2();
            return;
        }
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f30125f;
        if (nSTIJKPlayerEpisodes != null) {
            nSTIJKPlayerEpisodes.p2();
        }
        if (this.f30063Q.getVisibility() == 0) {
            this.f30063Q.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = this.f30176p0;
        if (relativeLayout2 != null && relativeLayout2.getVisibility() == 0) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.f30125f;
            if (nSTIJKPlayerEpisodes2 != null) {
                nSTIJKPlayerEpisodes2.m2();
                return;
            }
            return;
        }
        RelativeLayout relativeLayout3 = this.f30053O;
        if (relativeLayout3 != null && relativeLayout3.getVisibility() == 0) {
            this.f30053O.startAnimation(this.f30108a2);
            this.f30053O.setVisibility(8);
            return;
        }
        H2();
        if (this.f30058P.getVisibility() == 0) {
            this.f30058P.startAnimation(this.f30114c2);
            this.f30058P.setVisibility(8);
            return;
        }
        RelativeLayout relativeLayout4 = this.f30182q1;
        if (relativeLayout4 != null && relativeLayout4.getVisibility() == 0) {
            this.f30182q1.setVisibility(8);
            this.f30172o1.setVisibility(8);
            this.f30172o1.startAnimation(this.f30108a2);
            this.f30182q1.startAnimation(this.f30108a2);
            this.f30092W0.setChecked(false);
            this.f30096X0.setChecked(false);
            this.f30100Y0.setChecked(false);
            this.f30104Z0.setChecked(false);
            this.f30064Q0.setChecked(false);
            this.f30069R0.setChecked(false);
            this.f30074S0.setChecked(false);
            this.f30079T0.setChecked(false);
            this.f30084U0.setChecked(false);
            this.f30044M0.setChecked(false);
            this.f30049N0.setChecked(false);
            this.f30054O0.setChecked(false);
            this.f30059P0.setChecked(false);
            this.f30152k1.setText("");
            return;
        }
        if (this.f30115c3.getVisibility() != 0) {
            AbstractC2237a.f44521m0 = true;
            if (this.f30169n3.equals("mobile") && this.f30022H3 && this.f30047M3) {
                try {
                    h2();
                    return;
                } catch (Exception unused) {
                }
            }
            super.onBackPressed();
            return;
        }
        if (this.f30115c3.getVisibility() == 0) {
            this.f30115c3.startAnimation(this.f30108a2);
            if (this.f30121e0.getVisibility() == 0) {
                this.f30121e0.startAnimation(this.f30108a2);
            }
            if (this.f30073S.getVisibility() == 0) {
                this.f30073S.startAnimation(this.f30108a2);
            }
            if (this.f30141i0.getVisibility() == 0) {
                this.f30141i0.startAnimation(this.f30108a2);
            }
            if (this.f30078T.getVisibility() == 0) {
                this.f30078T.startAnimation(this.f30108a2);
            }
            if (this.f30126f0.getVisibility() == 0) {
                this.f30126f0.startAnimation(this.f30108a2);
            }
            this.f30115c3.setVisibility(8);
            if (this.f30121e0.getVisibility() == 0) {
                this.f30121e0.setVisibility(8);
            }
            if (this.f30073S.getVisibility() == 0) {
                this.f30073S.setVisibility(8);
            }
            if (this.f30141i0.getVisibility() == 0) {
                this.f30141i0.setVisibility(8);
            }
            if (this.f30078T.getVisibility() == 0) {
                this.f30078T.setVisibility(8);
            }
            if (this.f30126f0.getVisibility() == 0) {
                this.f30126f0.setVisibility(8);
            }
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
        CheckBox checkBox;
        boolean zIsChecked = ((CheckBox) compoundButton).isChecked();
        int id = compoundButton.getId();
        if (id == a7.f.f12296V1) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f30092W0;
            }
        } else if (id == a7.f.f12314X1) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f30096X0;
            }
        } else if (id == a7.f.f12323Y1) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f30100Y0;
            }
        } else if (id == a7.f.f12305W1) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f30104Z0;
            }
        } else if (id == a7.f.f12383e2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f30044M0;
            }
        } else if (id == a7.f.f12403g2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f30049N0;
            }
        } else if (id == a7.f.f12413h2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f30054O0;
            }
        } else if (id == a7.f.f12393f2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f30059P0;
            }
        } else if (id == a7.f.f12342a2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f30064Q0;
            }
        } else if (id == a7.f.f12362c2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f30069R0;
            }
        } else if (id == a7.f.f12372d2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f30074S0;
            }
        } else if (id == a7.f.f12352b2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f30079T0;
            }
        } else if (id != a7.f.f12332Z1 || !zIsChecked) {
            return;
        } else {
            checkBox = this.f30084U0;
        }
        this.f30005E1 = checkBox.getText().toString();
    }

    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v42 */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        TextView textView;
        Resources resources;
        int i9;
        int i10;
        int iR0;
        String str;
        long jLongValue;
        int iRound;
        int iRound2;
        ?? r42;
        StringBuilder sb;
        String str2;
        String str3;
        String str4;
        String str5;
        String strValueOf;
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes;
        String str6;
        String str7;
        String str8;
        String str9;
        int i11;
        boolean z9;
        long j9;
        int i12;
        String str10;
        ArrayList arrayList;
        int i13;
        String str11;
        String str12;
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2;
        String str13;
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes3;
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes4;
        ImageView imageView;
        int id = view.getId();
        if (id == a7.f.f12172I5) {
            if (this.f30169n3.equals("tv")) {
                boolean playerIsPrepared = this.f30125f.getPlayerIsPrepared();
                H2();
                C2();
                if (!playerIsPrepared) {
                    K1(5000);
                    this.f30150k.setVisibility(0);
                    this.f30150k.requestFocus();
                    return;
                }
                K1(1000);
                this.f30125f.start();
                this.f30125f.g();
                this.f30150k.setVisibility(8);
                this.f30155l.setVisibility(0);
                this.f30155l.requestFocus();
                I2();
                return;
            }
            boolean playerIsPrepared2 = this.f30125f.getPlayerIsPrepared();
            H2();
            D2();
            if (playerIsPrepared2) {
                L1(1000);
                this.f30125f.start();
                this.f30125f.g();
                this.f30150k.setVisibility(8);
                imageView = this.f30155l;
                imageView.setVisibility(0);
            }
            L1(5000);
        } else {
            if (id != a7.f.f12162H5) {
                if (id == a7.f.f12367c7 || id == a7.f.f12131E4) {
                    onBackPressed();
                } else if (id != a7.f.f12171I4 && id != a7.f.f12181J4) {
                    if (id == a7.f.f12581x8) {
                        H2();
                        e2();
                        f29981a4 = true;
                        this.f30125f.U2();
                        this.f30125f.a2(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
                        return;
                    }
                    if (id == a7.f.f12427i6) {
                        H2();
                        f29981a4 = false;
                        this.f30166n0.startAnimation(this.f30089V1);
                        this.f30166n0.setVisibility(8);
                        D2();
                        L1(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
                        return;
                    }
                    if (id != a7.f.f12570w7) {
                        if (id != a7.f.f12445k4) {
                            if (id == a7.f.f12337Z6 || id == a7.f.f12111C4) {
                                H2();
                                e2();
                                G2();
                                return;
                            }
                            if (id == a7.f.f12477n5) {
                                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes5 = this.f30125f;
                                if (nSTIJKPlayerEpisodes5 == null || !nSTIJKPlayerEpisodes5.getPlayerIsPrepared()) {
                                    return;
                                }
                                H2();
                                e2();
                                this.f30125f.seekTo(0);
                                this.f30125f.start();
                                return;
                            }
                            if (id == a7.f.f12399f8) {
                                H2();
                                e2();
                                P1();
                                B2();
                                return;
                            }
                            if (id == a7.f.f12104B7) {
                                H2();
                                K1(5000);
                                I2();
                                if (this.f30169n3.equals("tv") && (str13 = this.f30109a3) != null && str13.equals("series") && this.f30125f.getPlayerIsPrepared() && (nSTIJKPlayerEpisodes3 = this.f30125f) != null && !nSTIJKPlayerEpisodes3.isPlaying()) {
                                    F2(Constants.MAXIMUM_UPLOAD_PARTS);
                                }
                                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes6 = this.f30125f;
                                if (nSTIJKPlayerEpisodes6 != null) {
                                    nSTIJKPlayerEpisodes6.l3();
                                    return;
                                }
                                return;
                            }
                            if (id == a7.f.q9) {
                                H2();
                                e2();
                                t2();
                                return;
                            }
                            if (id == a7.f.ma) {
                                ProgressBar progressBar = f29979Y3;
                                if (progressBar == null || progressBar.getVisibility() != 0) {
                                    H2();
                                    e2();
                                    M2();
                                    return;
                                }
                                return;
                            }
                            if (id != a7.f.U8) {
                                if (id == a7.f.f12590y7 || id == a7.f.f12271S4) {
                                    H2();
                                    e2();
                                    if (this.f30182q1.getVisibility() == 8) {
                                        this.f30182q1.startAnimation(this.f30111b2);
                                        this.f30182q1.setVisibility(0);
                                        this.f30187r1.requestFocus();
                                        this.f30157l1.requestFocus();
                                        this.f30092W0.setChecked(false);
                                        this.f30096X0.setChecked(false);
                                        this.f30100Y0.setChecked(false);
                                        this.f30104Z0.setChecked(false);
                                        this.f30064Q0.setChecked(false);
                                        this.f30069R0.setChecked(false);
                                        this.f30074S0.setChecked(false);
                                        this.f30079T0.setChecked(false);
                                        this.f30084U0.setChecked(false);
                                        this.f30044M0.setChecked(false);
                                        this.f30049N0.setChecked(false);
                                        this.f30054O0.setChecked(false);
                                        this.f30059P0.setChecked(false);
                                        this.f30152k1.setText("");
                                        return;
                                    }
                                    return;
                                }
                                if (id == a7.f.f12574x1) {
                                    this.f29995C1 = this.f30113c1.getText().toString();
                                    this.f30000D1 = this.f30132g1.getText().toString();
                                    i10 = 0;
                                    this.f30172o1.setVisibility(0);
                                    this.f30029J0.setVisibility(0);
                                    this.f30024I0.setVisibility(8);
                                    this.f30034K0.setVisibility(8);
                                    this.f30212w1.setVisibility(8);
                                } else {
                                    if (id == a7.f.Jg) {
                                        this.f29995C1 = this.f30117d1.getText().toString();
                                        this.f30000D1 = this.f30137h1.getText().toString();
                                        this.f30172o1.setVisibility(0);
                                        this.f30029J0.setVisibility(8);
                                        this.f30212w1.setVisibility(8);
                                        this.f30024I0.setVisibility(0);
                                        this.f30152k1.setVisibility(0);
                                        this.f30034K0.setVisibility(8);
                                        this.f30088V0.setVisibility(8);
                                        textView = this.f30107a1;
                                        resources = getResources();
                                        i9 = a7.j.f13111Q7;
                                        textView.setText(resources.getString(i9));
                                        return;
                                    }
                                    if (id != a7.f.f12312X) {
                                        if (id == a7.f.f12440k) {
                                            this.f29995C1 = this.f30127f1.getText().toString();
                                            this.f30000D1 = this.f30147j1.getText().toString();
                                            this.f30172o1.setVisibility(0);
                                            this.f30029J0.setVisibility(8);
                                            this.f30024I0.setVisibility(8);
                                            this.f30034K0.setVisibility(8);
                                            this.f30212w1.setVisibility(8);
                                            this.f30088V0.setVisibility(0);
                                            this.f30152k1.setVisibility(0);
                                            textView = this.f30107a1;
                                            resources = getResources();
                                            i9 = a7.j.f13111Q7;
                                            textView.setText(resources.getString(i9));
                                            return;
                                        }
                                        if (id == a7.f.f12555v2) {
                                            this.f30172o1.setVisibility(0);
                                            this.f30029J0.setVisibility(8);
                                            this.f30024I0.setVisibility(8);
                                            this.f30034K0.setVisibility(8);
                                            this.f30088V0.setVisibility(8);
                                            this.f30212w1.setVisibility(0);
                                            this.f30152k1.setVisibility(4);
                                            this.f30207v1.setVisibility(0);
                                            textView = this.f30107a1;
                                            resources = getResources();
                                            i9 = a7.j.f13437y0;
                                            textView.setText(resources.getString(i9));
                                            return;
                                        }
                                        if (id == a7.f.tm) {
                                            if (this.f30212w1.getVisibility() == 0) {
                                                try {
                                                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getResources().getString(a7.j.f13447z0))));
                                                } catch (ActivityNotFoundException e9) {
                                                    Toast.makeText(this, "No application can handle this request. Please install a webbrowser", 1).show();
                                                    e9.printStackTrace();
                                                }
                                                this.f30182q1.setVisibility(8);
                                                return;
                                            }
                                            this.f30010F1 = this.f30152k1.getText().toString();
                                            M1();
                                            if (!this.f30064Q0.isChecked() && !this.f30069R0.isChecked() && !this.f30074S0.isChecked() && !this.f30079T0.isChecked() && !this.f30084U0.isChecked() && !this.f30092W0.isChecked() && !this.f30096X0.isChecked() && !this.f30100Y0.isChecked() && !this.f30104Z0.isChecked() && !this.f30044M0.isChecked() && !this.f30049N0.isChecked() && !this.f30054O0.isChecked() && !this.f30059P0.isChecked() && this.f30152k1.length() <= 0) {
                                                Toast.makeText(this.f30080T1, "Please Add Report", 0).show();
                                                return;
                                            }
                                            u1();
                                            this.f30092W0.setChecked(false);
                                            this.f30096X0.setChecked(false);
                                            this.f30100Y0.setChecked(false);
                                            this.f30104Z0.setChecked(false);
                                            this.f30064Q0.setChecked(false);
                                            this.f30069R0.setChecked(false);
                                            this.f30074S0.setChecked(false);
                                            this.f30079T0.setChecked(false);
                                            this.f30084U0.setChecked(false);
                                            this.f30044M0.setChecked(false);
                                            this.f30049N0.setChecked(false);
                                            this.f30054O0.setChecked(false);
                                            this.f30059P0.setChecked(false);
                                            this.f30152k1.setText("");
                                            RelativeLayout relativeLayout = this.f30182q1;
                                            if (relativeLayout == null || relativeLayout.getVisibility() != 0) {
                                                return;
                                            }
                                            this.f30182q1.setVisibility(8);
                                            this.f30172o1.setVisibility(8);
                                            this.f30172o1.startAnimation(this.f30108a2);
                                            this.f30182q1.startAnimation(this.f30108a2);
                                            return;
                                        }
                                        return;
                                    }
                                    this.f29995C1 = this.f30122e1.getText().toString();
                                    this.f30000D1 = this.f30142i1.getText().toString();
                                    i10 = 0;
                                    this.f30172o1.setVisibility(0);
                                    this.f30029J0.setVisibility(8);
                                    this.f30024I0.setVisibility(8);
                                    this.f30212w1.setVisibility(8);
                                    this.f30034K0.setVisibility(0);
                                }
                                this.f30152k1.setVisibility(i10);
                                this.f30088V0.setVisibility(8);
                                textView = this.f30107a1;
                                resources = getResources();
                                i9 = a7.j.f13111Q7;
                                textView.setText(resources.getString(i9));
                                return;
                            }
                            String str14 = this.f30109a3;
                            if (str14 == null || str14.equals("movies")) {
                                return;
                            }
                            H2();
                            e2();
                            i2();
                            SeekBar seekBar = this.f30160m;
                            if (seekBar != null) {
                                seekBar.setProgress(0);
                            }
                            int iD = C2966a.f().d();
                            if (!this.f30109a3.equals("movies") && this.f30109a3.equals("series")) {
                                List list = this.f30006E2;
                                if (list == null || list.size() <= 1 || iD > this.f30006E2.size() - 1) {
                                    f29982b4 = false;
                                    iR0 = 0;
                                } else {
                                    this.f30094W2 = ((GetEpisdoeDetailsCallback) this.f30006E2.get(iD)).getTitle();
                                    this.f30106Z2 = ((GetEpisdoeDetailsCallback) this.f30006E2.get(iD)).getContainerExtension();
                                    this.f30098X2 = ((GetEpisdoeDetailsCallback) this.f30006E2.get(iD)).getId();
                                    this.f30209v3 = ((GetEpisdoeDetailsCallback) this.f30006E2.get(iD)).getMovieImage();
                                    this.f30204u3 = this.f30094W2;
                                    this.f30219x3 = w.r0(((GetEpisdoeDetailsCallback) this.f30006E2.get(iD)).getElapsed_time());
                                    this.f30214w3 = String.valueOf(((GetEpisdoeDetailsCallback) this.f30006E2.get(iD)).getSeasonNumber());
                                    this.f30224y3 = ((GetEpisdoeDetailsCallback) this.f30006E2.get(iD)).getSeasonNumber().intValue();
                                    iR0 = (!((GetEpisdoeDetailsCallback) this.f30006E2.get(iD)).getDurationSec().equals("") || (nSTIJKPlayerEpisodes2 = this.f30125f) == null) ? w.q0(((GetEpisdoeDetailsCallback) this.f30006E2.get(iD)).getDurationSec()) : nSTIJKPlayerEpisodes2.getDuration() / 1000;
                                    this.f30086U2 = w.r0(this.f30098X2);
                                    this.f30066Q2 = w.q0(this.f30098X2);
                                    if (SharepreferenceDBHandler.getCurrentAPPType(this.f30080T1).equals("onestream_api")) {
                                        this.f30076S2 = this.f30098X2;
                                        this.f30123e2 = ((GetEpisdoeDetailsCallback) this.f30006E2.get(iD)).getLinks();
                                    }
                                    this.f30011F2 = ((GetEpisdoeDetailsCallback) this.f30006E2.get(iD)).getId();
                                    this.f30146j0.setText(this.f30094W2);
                                    f29982b4 = true;
                                }
                            } else {
                                iR0 = 0;
                            }
                            this.f30213w2.clear();
                            this.f30213w2.apply();
                            this.f30218x2.clear();
                            this.f30218x2.apply();
                            this.f30208v2.clear();
                            this.f30208v2.apply();
                            if (f29982b4 && this.f30026I2.booleanValue()) {
                                w2();
                                C2966a.f().x(this.f30011F2);
                                int iH = this.f30143i2.h(this.f30011F2, SharepreferenceDBHandler.getUserID(this.f30080T1));
                                if (iH == 0) {
                                    this.f30125f.setProgress(false);
                                    NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes7 = this.f30125f;
                                    nSTIJKPlayerEpisodes7.f36516e = 0;
                                    nSTIJKPlayerEpisodes7.f36521f = false;
                                    if (!this.f30228z2.equals("m3u") || (str12 = this.f30109a3) == null || str12.equals("recording")) {
                                        if (!this.f30228z2.equals("onestream_api") || (str11 = this.f30109a3) == null || str11.equals("recording")) {
                                            String str15 = this.f30109a3;
                                            if (str15 == null || !str15.equals("recording")) {
                                                strValueOf = String.valueOf(Uri.parse(this.f29986A2 + this.f30066Q2 + InstructionFileId.DOT + this.f30106Z2));
                                                this.f30199t3 = strValueOf;
                                                nSTIJKPlayerEpisodes = this.f30125f;
                                                str6 = this.f30094W2;
                                                int i14 = this.f30066Q2;
                                                String str16 = this.f30102Y2;
                                                ArrayList arrayList2 = this.f30001D2;
                                                int i15 = this.f30086U2;
                                                str7 = "nst";
                                                str8 = "";
                                                str9 = this.f30228z2;
                                                i11 = i15;
                                                z9 = true;
                                                j9 = 0;
                                                i12 = i14;
                                                str10 = str16;
                                                arrayList = arrayList2;
                                                i13 = iD;
                                            } else {
                                                String str17 = this.f29986A2;
                                                this.f30199t3 = str17;
                                                this.f30125f.Q2(str17, true, this.f30094W2, 0L, 0, "", null, 0, 0, this.f30228z2, "nst", "");
                                            }
                                        } else {
                                            strValueOf = this.f30123e2;
                                            this.f30199t3 = strValueOf;
                                            nSTIJKPlayerEpisodes = this.f30125f;
                                            str6 = this.f30094W2;
                                            String str18 = this.f30102Y2;
                                            ArrayList arrayList3 = this.f30001D2;
                                            int i16 = this.f30086U2;
                                            String str19 = this.f30228z2;
                                            str7 = "nst";
                                            str8 = this.f30076S2;
                                            str9 = str19;
                                            z9 = true;
                                            j9 = 0;
                                            i12 = 0;
                                            str10 = str18;
                                            arrayList = arrayList3;
                                            i13 = iD;
                                            i11 = i16;
                                        }
                                        nSTIJKPlayerEpisodes.Q2(strValueOf, z9, str6, j9, i12, str10, arrayList, i13, i11, str9, str7, str8);
                                    } else {
                                        String str20 = this.f30123e2;
                                        this.f30199t3 = str20;
                                        this.f30125f.Q2(str20, true, this.f30094W2, 0L, 0, "", null, iD, 0, this.f30228z2, "nst", "");
                                        C2966a.f().r("m3u");
                                    }
                                    this.f30125f.start();
                                }
                                if (iH > 0) {
                                    if (this.f30143i2.a(this.f30011F2) > 0) {
                                        try {
                                            jLongValue = this.f30133g2.gettimeElapsed(this.f30011F2).longValue();
                                        } catch (Exception unused) {
                                            jLongValue = 0;
                                        }
                                        if (iR0 == 0) {
                                            iR0 = w.r0(this.f30133g2.getTotaltime(this.f30011F2).toString());
                                            this.f30081T2 = iR0;
                                        }
                                        if (this.f30125f != null) {
                                            C2966a.f().I(jLongValue);
                                            this.f30125f.setProgress(true);
                                            this.f30125f.setCurrentPositionSeekbar((int) jLongValue);
                                            try {
                                                iRound = Math.round(w.r0(String.valueOf(jLongValue)) / 1000.0f);
                                            } catch (Exception unused2) {
                                                iR0 = 0;
                                                iRound = 0;
                                            }
                                            try {
                                                iRound2 = Math.round((iRound / iR0) * 100.0f);
                                            } catch (Exception unused3) {
                                                iRound2 = 0;
                                            }
                                            if (iRound2 >= 99) {
                                                r42 = 0;
                                                this.f30125f.setCurrentPositionSeekbar(0);
                                            } else {
                                                r42 = 0;
                                            }
                                            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes8 = this.f30125f;
                                            nSTIJKPlayerEpisodes8.f36516e = r42;
                                            nSTIJKPlayerEpisodes8.f36521f = r42;
                                            if (!this.f30228z2.equals("m3u") || (str3 = this.f30109a3) == null || str3.equals("recording")) {
                                                if (!this.f30228z2.equals("onestream_api") || (str2 = this.f30109a3) == null || str2.equals("recording")) {
                                                    String str21 = this.f30109a3;
                                                    if (str21 == null || !str21.equals("recording")) {
                                                        sb = new StringBuilder();
                                                        sb.append(this.f29986A2);
                                                        sb.append(this.f30066Q2);
                                                        sb.append(InstructionFileId.DOT);
                                                        sb.append(this.f30106Z2);
                                                        String strValueOf2 = String.valueOf(Uri.parse(sb.toString()));
                                                        this.f30199t3 = strValueOf2;
                                                        this.f30125f.Q2(strValueOf2, true, this.f30094W2, 0L, this.f30066Q2, this.f30102Y2, this.f30001D2, iD, this.f30086U2, this.f30228z2, "nst", this.f30021H2);
                                                        this.f30125f.start();
                                                    }
                                                    String str22 = this.f29986A2;
                                                    this.f30199t3 = str22;
                                                    this.f30125f.Q2(str22, true, this.f30094W2, 0L, 0, "", null, 0, 0, this.f30228z2, "nst", this.f30021H2);
                                                    this.f30125f.start();
                                                }
                                                String str23 = this.f30123e2;
                                                this.f30199t3 = str23;
                                                this.f30125f.Q2(str23, true, this.f30094W2, 0L, 0, "", null, iD, 0, this.f30228z2, "nst", this.f30021H2);
                                                C2966a.f().r("onestream_api");
                                                this.f30125f.start();
                                            }
                                            String str24 = this.f30123e2;
                                            this.f30199t3 = str24;
                                            this.f30125f.Q2(str24, true, this.f30094W2, 0L, 0, "", null, iD, 0, this.f30228z2, "nst", this.f30021H2);
                                            C2966a.f().r("m3u");
                                            this.f30125f.start();
                                        }
                                    } else {
                                        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes9 = this.f30125f;
                                        if (nSTIJKPlayerEpisodes9 != null) {
                                            nSTIJKPlayerEpisodes9.setProgress(false);
                                            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes10 = this.f30125f;
                                            nSTIJKPlayerEpisodes10.f36516e = 0;
                                            nSTIJKPlayerEpisodes10.f36521f = false;
                                            if (!this.f30228z2.equals("m3u") || (str5 = this.f30109a3) == null || str5.equals("recording")) {
                                                if (!this.f30228z2.equals("onestream_api") || (str4 = this.f30109a3) == null || str4.equals("recording")) {
                                                    String str25 = this.f30109a3;
                                                    if (str25 == null || !str25.equals("recording")) {
                                                        sb = new StringBuilder();
                                                        sb.append(this.f29986A2);
                                                        sb.append(this.f30066Q2);
                                                        sb.append(InstructionFileId.DOT);
                                                        sb.append(this.f30106Z2);
                                                        String strValueOf22 = String.valueOf(Uri.parse(sb.toString()));
                                                        this.f30199t3 = strValueOf22;
                                                        this.f30125f.Q2(strValueOf22, true, this.f30094W2, 0L, this.f30066Q2, this.f30102Y2, this.f30001D2, iD, this.f30086U2, this.f30228z2, "nst", this.f30021H2);
                                                        this.f30125f.start();
                                                    }
                                                    String str222 = this.f29986A2;
                                                    this.f30199t3 = str222;
                                                    this.f30125f.Q2(str222, true, this.f30094W2, 0L, 0, "", null, 0, 0, this.f30228z2, "nst", this.f30021H2);
                                                    this.f30125f.start();
                                                }
                                                String str232 = this.f30123e2;
                                                this.f30199t3 = str232;
                                                this.f30125f.Q2(str232, true, this.f30094W2, 0L, 0, "", null, iD, 0, this.f30228z2, "nst", this.f30021H2);
                                                C2966a.f().r("onestream_api");
                                                this.f30125f.start();
                                            }
                                            String str242 = this.f30123e2;
                                            this.f30199t3 = str242;
                                            this.f30125f.Q2(str242, true, this.f30094W2, 0L, 0, "", null, iD, 0, this.f30228z2, "nst", this.f30021H2);
                                            C2966a.f().r("m3u");
                                            this.f30125f.start();
                                        }
                                    }
                                }
                                String str26 = this.f30109a3;
                                if ((str26 == null || !str26.equals("movies")) && (str = this.f30109a3) != null && str.equals("series")) {
                                    C2966a.f().x(this.f30011F2);
                                    EpisodesUsingSinglton.getInstance().setEpisodeList(this.f30006E2);
                                    C2966a.f().H(((GetEpisdoeDetailsCallback) this.f30006E2.get(iD)).getId());
                                    C2966a.f().G(w.q0(((GetEpisdoeDetailsCallback) this.f30006E2.get(iD)).getId()));
                                    C2966a.f().v(this.f30006E2);
                                }
                                C2966a.f().w(iD);
                            }
                            if (!this.f30109a3.equals("movies") && this.f30109a3.equals("series")) {
                                this.f30016G2 = w.q0(((GetEpisdoeDetailsCallback) this.f30006E2.get(iD)).getId());
                                SharedPreferences.Editor editor = this.f30198t2;
                                if (editor != null) {
                                    editor.putString("currentlyPlayingVideo", String.valueOf(((GetEpisdoeDetailsCallback) this.f30006E2.get(iD)).getId()));
                                    this.f30198t2.apply();
                                }
                            }
                            SharedPreferences.Editor editor2 = this.f30203u2;
                            if (editor2 != null) {
                                editor2.putString("currentlyPlayingVideoPosition", String.valueOf(iD));
                                this.f30203u2.apply();
                                return;
                            }
                            return;
                        }
                        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes11 = this.f30125f;
                        nSTIJKPlayerEpisodes11.seekTo(nSTIJKPlayerEpisodes11.getNewSeekPosition());
                        this.f30125f.start();
                    }
                    H2();
                    e2();
                    return;
                }
                onBackPressed();
                return;
            }
            boolean zEquals = this.f30169n3.equals("tv");
            H2();
            if (zEquals) {
                C2();
                this.f30125f.pause();
                this.f30125f.g();
                this.f30155l.setVisibility(8);
                this.f30150k.setVisibility(0);
                this.f30150k.requestFocus();
                String str27 = this.f30109a3;
                if (str27 == null || !str27.equals("series") || !this.f30125f.getPlayerIsPrepared() || (nSTIJKPlayerEpisodes4 = this.f30125f) == null || nSTIJKPlayerEpisodes4.isPlaying()) {
                    return;
                }
                I2();
                F2(Constants.MAXIMUM_UPLOAD_PARTS);
                return;
            }
            D2();
            this.f30125f.pause();
            this.f30125f.g();
            this.f30155l.setVisibility(8);
        }
        imageView = this.f30150k;
        imageView.setVisibility(0);
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        I1(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0863 A[PHI: r2
      0x0863: PHI (r2v18 java.lang.String) = (r2v12 java.lang.String), (r2v13 java.lang.String) binds: [B:52:0x0861, B:55:0x0872] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x08af  */
    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r58) {
        /*
            Method dump skipped, instruction units count: 2325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        TextView textView;
        super.onDestroy();
        try {
            if (this.f30077S3 != null) {
                C2386a.b(this.f30080T1).e(this.f30077S3);
            }
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f30125f;
            if (nSTIJKPlayerEpisodes != null && (textView = nSTIJKPlayerEpisodes.f36597v) != null) {
                textView.performClick();
            }
        } catch (Exception e9) {
            Log.e("fsgd", "fdfh", e9);
        }
        try {
            w2();
        } catch (Exception unused) {
        }
        try {
            Thread thread = this.f30035K1;
            if (thread != null && thread.isAlive()) {
                this.f30035K1.interrupt();
            }
        } catch (Exception unused2) {
        }
        String str = this.f30109a3;
        if (str == null || !str.equals("movies_stalker")) {
            return;
        }
        try {
            this.f30067Q3.d(SharepreferenceDBHandler.getLoggedInMacAddress(this.f30080T1), SharepreferenceDBHandler.getStalkerToken(this.f30080T1), this.f30057O3);
        } catch (Exception unused3) {
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes;
        boolean z9 = keyEvent.getRepeatCount() == 0;
        String str = this.f30109a3;
        if (str != null && str.equals("series") && this.f30169n3.equals("tv") && i9 != 4) {
            I2();
            if (this.f30125f.getPlayerIsPrepared() && (nSTIJKPlayerEpisodes = this.f30125f) != null && !nSTIJKPlayerEpisodes.isPlaying()) {
                F2(Constants.MAXIMUM_UPLOAD_PARTS);
            }
        }
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
                                                    H2();
                                                    this.f30125f.g();
                                                    if (this.f30058P.getVisibility() == 0 || this.f30053O.getVisibility() == 0 || this.f30176p0.getVisibility() == 0 || this.f30176p0.getVisibility() == 0 || this.f30182q1.getVisibility() == 0 || this.f30182q1.getVisibility() == 0) {
                                                        return true;
                                                    }
                                                    if (this.f30115c3.getVisibility() == 8) {
                                                        this.f30115c3.startAnimation(this.f30105Z1);
                                                        this.f30115c3.setVisibility(0);
                                                        this.f30150k.requestFocus();
                                                        this.f30155l.requestFocus();
                                                    }
                                                    K1(5000);
                                                    return true;
                                                case 20:
                                                    H2();
                                                    this.f30125f.g();
                                                    if (this.f30058P.getVisibility() == 0 || this.f30053O.getVisibility() == 0 || this.f30176p0.getVisibility() == 0 || this.f30176p0.getVisibility() == 0 || this.f30182q1.getVisibility() == 0 || this.f30182q1.getVisibility() == 0) {
                                                        return true;
                                                    }
                                                    if (this.f30115c3.getVisibility() == 8) {
                                                        this.f30115c3.startAnimation(this.f30105Z1);
                                                        this.f30115c3.setVisibility(0);
                                                        this.f30150k.requestFocus();
                                                        this.f30155l.requestFocus();
                                                    }
                                                    K1(5000);
                                                    return true;
                                                case 21:
                                                    H2();
                                                    this.f30125f.g();
                                                    if (this.f30058P.getVisibility() == 0 || this.f30053O.getVisibility() == 0) {
                                                        return false;
                                                    }
                                                    if (this.f30176p0.getVisibility() == 0 || this.f30176p0.getVisibility() == 0 || this.f30182q1.getVisibility() == 0 || this.f30182q1.getVisibility() == 0) {
                                                        return true;
                                                    }
                                                    if (this.f30115c3.getVisibility() == 8) {
                                                        this.f30115c3.startAnimation(this.f30105Z1);
                                                        this.f30115c3.setVisibility(0);
                                                        if (!this.f30160m.isFocused()) {
                                                            this.f30160m.requestFocus();
                                                        }
                                                    }
                                                    if (this.f30160m.isFocused()) {
                                                        I2();
                                                    } else {
                                                        K1(5000);
                                                    }
                                                    return true;
                                                case 22:
                                                    H2();
                                                    this.f30125f.g();
                                                    if (this.f30058P.getVisibility() == 0 || this.f30053O.getVisibility() == 0) {
                                                        return false;
                                                    }
                                                    if (this.f30176p0.getVisibility() == 0 || this.f30176p0.getVisibility() == 0 || this.f30182q1.getVisibility() == 0 || this.f30182q1.getVisibility() == 0) {
                                                        return true;
                                                    }
                                                    if (this.f30115c3.getVisibility() == 8) {
                                                        this.f30115c3.startAnimation(this.f30105Z1);
                                                        this.f30115c3.setVisibility(0);
                                                        if (!this.f30160m.isFocused()) {
                                                            this.f30160m.requestFocus();
                                                        }
                                                    }
                                                    if (this.f30160m.isFocused()) {
                                                        I2();
                                                    } else {
                                                        K1(5000);
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
                                H2();
                                if (this.f30115c3.getVisibility() == 8) {
                                    this.f30115c3.startAnimation(this.f30105Z1);
                                    this.f30115c3.setVisibility(0);
                                    if (!this.f30160m.isFocused()) {
                                        this.f30160m.requestFocus();
                                    }
                                }
                                K1(5000);
                                this.f30160m.setProgress(this.f30160m.getProgress() + 10);
                                this.f30125f.H2(this.f30160m.getProgress());
                            } catch (Exception unused) {
                            }
                            return true;
                        }
                        try {
                            H2();
                            if (this.f30115c3.getVisibility() == 8) {
                                this.f30115c3.startAnimation(this.f30105Z1);
                                this.f30115c3.setVisibility(0);
                                if (!this.f30160m.isFocused()) {
                                    this.f30160m.requestFocus();
                                }
                            }
                            K1(5000);
                            this.f30160m.setProgress(this.f30160m.getProgress() - 10);
                            this.f30125f.H2(this.f30160m.getProgress());
                        } catch (Exception unused2) {
                        }
                        return true;
                    }
                }
                if (this.f30182q1.getVisibility() == 0 || this.f30182q1.getVisibility() == 0) {
                    return true;
                }
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.f30125f;
                if (nSTIJKPlayerEpisodes2 == null || !nSTIJKPlayerEpisodes2.getPlayerIsPrepared()) {
                    N2();
                } else if (this.f30058P.getVisibility() == 8) {
                    (this.f30125f.isPlaying() ? this.f30155l : this.f30150k).performClick();
                }
                return true;
            }
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes3 = this.f30125f;
            if (nSTIJKPlayerEpisodes3 != null && nSTIJKPlayerEpisodes3.getPlayerIsPrepared()) {
                ((!z9 || this.f30125f.isPlaying()) ? this.f30155l : this.f30150k).performClick();
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
        String str = this.f30109a3;
        if (str == null || !str.equals("movies")) {
            String str2 = this.f30109a3;
            if (str2 != null && str2.equals("series")) {
                P1();
            }
        } else {
            x2(0);
        }
        getIntent().getAction();
        try {
            C2325b c2325b = this.f30194s3;
            if (c2325b != null) {
                c2325b.c().e(this.f29987A3, C2328e.class);
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
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f30125f;
                if (nSTIJKPlayerEpisodes != null && nSTIJKPlayerEpisodes.f36531h != null) {
                    nSTIJKPlayerEpisodes.setShowOrHideSubtitles(false);
                    this.f30125f.f36531h.setVisibility(8);
                }
                m mVar = new m();
                this.f30012F3 = mVar;
                registerReceiver(mVar, new IntentFilter("media_control"));
                return;
            }
            unregisterReceiver(this.f30012F3);
            this.f30017G3 = false;
            this.f30012F3 = null;
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.f30125f;
            if (nSTIJKPlayerEpisodes2 != null && nSTIJKPlayerEpisodes2.f36531h != null) {
                nSTIJKPlayerEpisodes2.setShowOrHideSubtitles(true);
                this.f30125f.f36531h.setVisibility(0);
                this.f30125f.p2();
            }
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes3 = this.f30125f;
            if (nSTIJKPlayerEpisodes3 != null) {
                nSTIJKPlayerEpisodes3.isPlaying();
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        Intent intent;
        AppOpsManager appOpsManager;
        super.onResume();
        Context context = this.f30080T1;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("auto_start", 0);
            this.f30042L3 = sharedPreferences;
            boolean z9 = sharedPreferences.getBoolean("picinpic", AbstractC2237a.f44541u0);
            this.f30047M3 = z9;
            if (z9 && this.f30169n3.equals("mobile")) {
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 26) {
                    this.f30027I3 = AbstractC2500v.a();
                }
                if (i9 >= 26) {
                    try {
                        if (getPackageManager().hasSystemFeature("android.software.picture_in_picture") && (appOpsManager = (AppOpsManager) this.f30080T1.getSystemService("appops")) != null && appOpsManager.checkOpNoThrow("android:picture_in_picture", Process.myUid(), this.f30080T1.getPackageName()) == 0) {
                            this.f30022H3 = true;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        String str = this.f30109a3;
        if (str == null || !str.equals("series")) {
            String str2 = this.f30109a3;
            if (str2 != null && str2.equals("movies") && (intent = getIntent()) != null && intent.getBooleanExtra("BUNDLE_KEY_NEW_INTENT_CALLED", false)) {
                intent.putExtra("BUNDLE_KEY_NEW_INTENT_CALLED", false);
                setIntent(intent);
                if (getIntent().getIntExtra("OPENED_STREAM_ID", 0) != this.f30066Q2) {
                    this.f29996C2 = VodAllCategoriesSingleton.getInstance().getvodList();
                    v2();
                }
            }
        } else {
            Intent intent2 = getIntent();
            if (intent2 != null && intent2.getBooleanExtra("BUNDLE_KEY_NEW_INTENT_CALLED", false)) {
                intent2.putExtra("BUNDLE_KEY_NEW_INTENT_CALLED", false);
                setIntent(intent2);
                if (getIntent().getIntExtra("OPENED_STREAM_ID", 0) != this.f30066Q2) {
                    this.f30006E2 = EpisodesUsingSinglton.getInstance().getEpisodeList();
                    v2();
                }
            }
        }
        w.m(this.f30080T1);
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f30125f;
        if (nSTIJKPlayerEpisodes != null) {
            nSTIJKPlayerEpisodes.p2();
            if (this.f30164m3) {
                f29980Z3 = false;
            }
        }
        C2325b c2325b = this.f30194s3;
        if (c2325b != null) {
            c2325b.c().a(this.f29987A3, C2328e.class);
        }
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            w2();
            if (this.f30169n3.equals("mobile") && this.f30022H3 && this.f30047M3) {
                finishAndRemoveTask();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (this.f30169n3.equals("mobile") && this.f30022H3 && this.f30047M3 && !isInPictureInPictureMode()) {
            try {
                h2();
                this.f30017G3 = true;
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        if (z9) {
            I1(getResources().getConfiguration());
        }
    }

    public final void p2(List list, String str) {
        String str2;
        int i9;
        String str3;
        String str4;
        int i10;
        long jLongValue;
        int iR0;
        int iRound;
        int iRound2;
        String str5;
        String str6;
        SharedPreferences.Editor editor;
        if (list == null || list.size() <= 0) {
            return;
        }
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f30125f;
        if (nSTIJKPlayerEpisodes != null && nSTIJKPlayerEpisodes.getPlayerIsPrepared()) {
            if (this.f30125f.f36556m.equals(str)) {
                return;
            }
        }
        H2();
        C2();
        K1(5000);
        int iZ1 = Z1(list, str);
        String title = ((GetEpisdoeDetailsCallback) list.get(iZ1)).getTitle();
        this.f30209v3 = ((GetEpisdoeDetailsCallback) list.get(iZ1)).getMovieImage();
        this.f30204u3 = title;
        this.f30214w3 = String.valueOf(((GetEpisdoeDetailsCallback) list.get(iZ1)).getSeasonNumber());
        this.f30219x3 = w.r0(((GetEpisdoeDetailsCallback) list.get(iZ1)).getElapsed_time());
        this.f30224y3 = ((GetEpisdoeDetailsCallback) list.get(iZ1)).getSeasonNumber().intValue();
        w.S0(w7.k.a() + w7.k.i());
        int iQ0 = w.q0(((GetEpisdoeDetailsCallback) list.get(iZ1)).getId());
        String id = ((GetEpisdoeDetailsCallback) list.get(iZ1)).getId();
        String links = ((GetEpisdoeDetailsCallback) list.get(iZ1)).getLinks();
        int i11 = this.f30081T2;
        String containerExtension = ((GetEpisdoeDetailsCallback) list.get(iZ1)).getContainerExtension();
        this.f30011F2 = ((GetEpisdoeDetailsCallback) list.get(iZ1)).getId();
        this.f30222y1 = ((GetEpisdoeDetailsCallback) list.get(iZ1)).getCategoryId();
        this.f29990B1 = ((GetEpisdoeDetailsCallback) list.get(iZ1)).getSeriesName();
        C2966a.f().w(iZ1);
        int iH = this.f30143i2.h(this.f30011F2, SharepreferenceDBHandler.getUserID(this.f30080T1));
        SharedPreferences.Editor editor2 = this.f30198t2;
        if (editor2 != null) {
            editor2.putString("currentlyPlayingVideo", String.valueOf(((GetEpisdoeDetailsCallback) list.get(iZ1)).getId()));
            this.f30198t2.apply();
        }
        String str7 = this.f30109a3;
        if (str7 != null && str7.equals("series") && (editor = this.f30198t2) != null) {
            editor.putString("currentlyPlayingVideo", String.valueOf(((GetEpisdoeDetailsCallback) list.get(iZ1)).getId()));
            this.f30198t2.apply();
        }
        SharedPreferences.Editor editor3 = this.f30203u2;
        if (editor3 != null) {
            editor3.putString("currentlyPlayingVideoPosition", String.valueOf(iZ1));
            this.f30203u2.apply();
        }
        SimpleDateFormat simpleDateFormat = this.f30031J2;
        if (R1(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(this.f30080T1))), this.f30041L2.format(this.f30036K2)) >= C2939c.p() && (str5 = this.f30056O2) != null && this.f30061P2 != null && (!f29977W3.equals(str5) || (this.f30056O2 != null && (str6 = this.f30061P2) != null && !f29978X3.equals(str6)))) {
            this.f30026I2 = Boolean.FALSE;
        }
        this.f30016G2 = iQ0;
        if (iH == 0 && this.f30026I2.booleanValue()) {
            w2();
            this.f30125f.setProgress(false);
            this.f30199t3 = links;
            str2 = containerExtension;
            i9 = i11;
            str3 = links;
            str4 = title;
            this.f30125f.Q2(links, true, title, 0L, 0, "", null, iZ1, 0, this.f30228z2, "nst", id);
            EpisodesUsingSinglton.getInstance().setEpisodeList(list);
            C2966a.f().x(this.f30011F2);
            C2966a.f().G(iQ0);
            C2966a.f().v(list);
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.f30125f;
            i10 = 0;
            nSTIJKPlayerEpisodes2.f36516e = 0;
            nSTIJKPlayerEpisodes2.f36521f = false;
            nSTIJKPlayerEpisodes2.start();
        } else {
            str2 = containerExtension;
            i9 = i11;
            str3 = links;
            str4 = title;
            i10 = 0;
        }
        if (iH <= 0 || this.f30143i2.a(this.f30011F2) <= 0) {
            return;
        }
        try {
            jLongValue = this.f30133g2.gettimeElapsed(this.f30011F2).longValue();
        } catch (Exception unused) {
            jLongValue = 0;
        }
        if (i9 == 0) {
            iR0 = w.r0(this.f30133g2.getTotaltime(this.f30011F2).toString());
            this.f30081T2 = iR0;
        } else {
            iR0 = i9;
        }
        if (this.f30125f == null || !this.f30026I2.booleanValue()) {
            return;
        }
        w2();
        String.valueOf(Uri.parse(this.f29986A2 + this.f30011F2 + InstructionFileId.DOT + str2));
        this.f30199t3 = this.f30123e2;
        this.f30125f.setProgress(true);
        C2966a.f().I(jLongValue);
        this.f30125f.setCurrentPositionSeekbar((int) jLongValue);
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
            this.f30125f.setCurrentPositionSeekbar(i10);
        }
        EpisodesUsingSinglton.getInstance().setEpisodeList(list);
        C2966a.f().x(this.f30011F2);
        this.f30125f.Q2(str3, true, str4, 0L, 0, "", this.f30001D2, iZ1, 0, this.f30228z2, "nst", id);
        this.f30125f.start();
    }

    public void r2(String str, int i9, String str2, String str3, String str4, String str5) {
        if (this.f30125f != null) {
            RelativeLayout relativeLayout = this.f30053O;
            if (relativeLayout != null) {
                relativeLayout.startAnimation(this.f30108a2);
                this.f30053O.setVisibility(8);
            }
            this.f30094W2 = str2;
            TextView textView = this.f30146j0;
            if (textView != null) {
                textView.setText(str2);
            }
            SeekBar seekBar = this.f30160m;
            if (seekBar != null) {
                seekBar.setProgress(0);
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f30080T1).equals("onestream_api")) {
                p2(this.f30006E2, str4);
            } else {
                o2(this.f30006E2, i9);
            }
        }
    }

    @Override // z7.j
    public void u(StalkerCreatePlayerLinkCallback stalkerCreatePlayerLinkCallback, View view, int i9, int i10, String str, String str2, String str3, String str4, String str5, String str6, int i11, String str7, String str8) {
    }

    public void y2(Context context, ArrayList arrayList, int i9, long j9) {
        String num = ((LiveStreamsDBModel) arrayList.get(i9)).getNum();
        String name = ((LiveStreamsDBModel) arrayList.get(i9)).getName();
        String streamType = ((LiveStreamsDBModel) arrayList.get(i9)).getStreamType();
        String streamIdOneStream = SharepreferenceDBHandler.getCurrentAPPType(context).equals("onestream_api") ? ((LiveStreamsDBModel) arrayList.get(i9)).getStreamIdOneStream() : ((LiveStreamsDBModel) arrayList.get(i9)).getStreamId();
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
        this.f30222y1 = ((LiveStreamsDBModel) arrayList.get(i9)).getCategoryId();
        String links = ((LiveStreamsDBModel) arrayList.get(i9)).getUrl() == null ? ((LiveStreamsDBModel) arrayList.get(i9)).getLinks() : ((LiveStreamsDBModel) arrayList.get(i9)).getLinks() == null ? ((LiveStreamsDBModel) arrayList.get(i9)).getUrl() : "";
        PanelAvailableChannelsPojo panelAvailableChannelsPojo = new PanelAvailableChannelsPojo();
        panelAvailableChannelsPojo.setNum(Integer.valueOf(w.r0(num)));
        panelAvailableChannelsPojo.setName(name);
        panelAvailableChannelsPojo.setStreamType(streamType);
        panelAvailableChannelsPojo.setStreamId(streamIdOneStream);
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
        if (SharepreferenceDBHandler.getCurrentAPPType(context).equals("onestream_api")) {
            panelAvailableChannelsPojo.setUrl(links);
        }
        int i10 = this.f30081T2;
        if (i10 != 0) {
            try {
                panelAvailableChannelsPojo.setMovieDuration(i10);
            } catch (Exception unused2) {
                panelAvailableChannelsPojo.setMovieDuration(j10);
            }
            panelAvailableChannelsPojo.setRatingFromTen(strValueOf);
            panelAvailableChannelsPojo.setRatingFromFive(strValueOf2);
            this.f30138h2.addAllAvailableChannel(panelAvailableChannelsPojo);
        }
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f30125f;
        if (nSTIJKPlayerEpisodes != null) {
            int duration = nSTIJKPlayerEpisodes.getDuration() / 1000;
            this.f30081T2 = duration;
            j10 = duration;
        }
        panelAvailableChannelsPojo.setMovieDuration(j10);
        panelAvailableChannelsPojo.setRatingFromTen(strValueOf);
        panelAvailableChannelsPojo.setRatingFromFive(strValueOf2);
        this.f30138h2.addAllAvailableChannel(panelAvailableChannelsPojo);
    }
}
