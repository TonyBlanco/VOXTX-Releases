package com.nst.iptvsmarterstvbox.view.activity;

import B3.C0509q;
import B3.i0;
import O2.AbstractC0926v1;
import O2.C0909p1;
import O2.C0917s1;
import O2.C0921u;
import O2.G1;
import O2.H0;
import O2.I1;
import O2.InterfaceC0920t1;
import O2.Q1;
import O2.R0;
import O2.V1;
import Q2.C1019e;
import Z3.m;
import a7.e;
import a7.f;
import a7.g;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AppOpsManager;
import android.app.Dialog;
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
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
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
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import androidx.appcompat.app.b;
import androidx.mediarouter.app.MediaRouteButton;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b4.InterfaceC1224o;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.gms.cast.MediaInfo;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.nst.iptvsmarterstvbox.miscelleneious.MyApplication;
import com.nst.iptvsmarterstvbox.model.EpisodesUsingSinglton;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.VodAllCategoriesSingleton;
import com.nst.iptvsmarterstvbox.model.callback.GetEpisdoeDetailsCallback;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.RecentWatchDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SeriesRecentWatchDatabase;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.pojo.PanelAvailableChannelsPojo;
import com.nst.iptvsmarterstvbox.sbpfunction.activitypushnotification.MaintanencePannelActivity;
import com.nst.iptvsmarterstvbox.sbpfunction.callbackclientreport.ClientFeedbackCallback;
import com.nst.iptvsmarterstvbox.sbpfunction.singletonpushnotification.Listsingleton;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import d4.C1700q;
import d4.InterfaceC1699p;
import d4.k0;
import e4.C1737C;
import i7.AbstractC1902a;
import i7.c;
import j1.AbstractC2074a;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Formatter;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m1.C2219a;
import m7.AbstractC2237a;
import m7.w;
import o1.C2305a;
import o4.AbstractC2324a;
import o4.C2325b;
import o4.C2328e;
import o4.InterfaceC2347y;
import o7.C2368a;
import okhttp3.OkHttpClient;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.protocol.HttpRequestExecutor;
import org.chromium.net.UrlRequest;
import org.joda.time.DateTimeConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.C2386a;
import p1.InterfaceC2389c;
import p3.AbstractC2392B;
import p3.u;
import p7.AbstractC2496t;
import p7.AbstractC2498u;
import p7.AbstractC2500v;
import p7.C2509z0;
import q3.C2540a;
import q7.C2630n;
import q7.c0;
import r7.AbstractC2683b;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import t2.C2766a;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import u7.C2858a;
import w7.AbstractC2941e;
import w7.C2939c;
import x7.C2966a;

/* JADX INFO: loaded from: classes4.dex */
public class ExoPlayerMoviesSeries extends b implements View.OnClickListener, MediaController.MediaPlayerControl, CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: U4, reason: collision with root package name */
    public static ProgressBar f29417U4;

    /* JADX INFO: renamed from: W4, reason: collision with root package name */
    public static String f29419W4;

    /* JADX INFO: renamed from: X4, reason: collision with root package name */
    public static String f29420X4;

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    public static ProgressBar f29423a5;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public LinearLayout f29424A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public ImageView f29425A0;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public CheckBox f29426A1;

    /* JADX INFO: renamed from: A2, reason: collision with root package name */
    public String f29427A2;

    /* JADX INFO: renamed from: A3, reason: collision with root package name */
    public String f29428A3;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public LinearLayout f29430B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public ImageView f29431B0;

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public CheckBox f29432B1;

    /* JADX INFO: renamed from: B3, reason: collision with root package name */
    public String f29434B3;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public LinearLayout f29436C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public SeekBar f29437C0;

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public CheckBox f29438C1;

    /* JADX INFO: renamed from: C3, reason: collision with root package name */
    public String f29440C3;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public LinearLayout f29442D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public SeekBar f29443D0;

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    public EditText f29444D1;

    /* JADX INFO: renamed from: D3, reason: collision with root package name */
    public C2766a f29446D3;

    /* JADX INFO: renamed from: D4, reason: collision with root package name */
    public AlertDialog f29447D4;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public LinearLayout f29448E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public SeekBar f29449E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public LinearLayout f29454F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public RadioGroup f29455F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public LinearLayout f29460G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public RadioGroup f29461G0;

    /* JADX INFO: renamed from: G2, reason: collision with root package name */
    public C2630n f29463G2;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public LinearLayout f29466H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public RadioGroup f29467H0;

    /* JADX INFO: renamed from: H2, reason: collision with root package name */
    public RecyclerView.o f29469H2;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public LinearLayout f29472I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public TextView f29473I0;

    /* JADX INFO: renamed from: I2, reason: collision with root package name */
    public Context f29475I2;

    /* JADX INFO: renamed from: I3, reason: collision with root package name */
    public SharedPreferences f29476I3;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public LinearLayout f29478J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public TextView f29479J0;

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    public String f29480J1;

    /* JADX INFO: renamed from: J2, reason: collision with root package name */
    public Animation f29481J2;

    /* JADX INFO: renamed from: J3, reason: collision with root package name */
    public SharedPreferences.Editor f29482J3;

    /* JADX INFO: renamed from: J4, reason: collision with root package name */
    public LayoutInflater f29483J4;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public LinearLayout f29484K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public TextView f29485K0;

    /* JADX INFO: renamed from: K2, reason: collision with root package name */
    public Animation f29487K2;

    /* JADX INFO: renamed from: K4, reason: collision with root package name */
    public View f29489K4;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public LinearLayout f29490L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public TextView f29491L0;

    /* JADX INFO: renamed from: L1, reason: collision with root package name */
    public List f29492L1;

    /* JADX INFO: renamed from: L2, reason: collision with root package name */
    public Animation f29493L2;

    /* JADX INFO: renamed from: L4, reason: collision with root package name */
    public TextView f29495L4;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public LinearLayout f29496M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public TextView f29497M0;

    /* JADX INFO: renamed from: M1, reason: collision with root package name */
    public JsonArray f29498M1;

    /* JADX INFO: renamed from: M2, reason: collision with root package name */
    public Animation f29499M2;

    /* JADX INFO: renamed from: M4, reason: collision with root package name */
    public ProgressBar f29501M4;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public LinearLayout f29502N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public TextView f29503N0;

    /* JADX INFO: renamed from: N1, reason: collision with root package name */
    public String f29504N1;

    /* JADX INFO: renamed from: N2, reason: collision with root package name */
    public Animation f29505N2;

    /* JADX INFO: renamed from: N3, reason: collision with root package name */
    public SharedPreferences f29506N3;

    /* JADX INFO: renamed from: N4, reason: collision with root package name */
    public RecyclerView f29507N4;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public LinearLayout f29508O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public TextView f29509O0;

    /* JADX INFO: renamed from: O2, reason: collision with root package name */
    public Animation f29511O2;

    /* JADX INFO: renamed from: O3, reason: collision with root package name */
    public SharedPreferences.Editor f29512O3;

    /* JADX INFO: renamed from: O4, reason: collision with root package name */
    public TextView f29513O4;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public LinearLayout f29514P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public TextView f29515P0;

    /* JADX INFO: renamed from: P1, reason: collision with root package name */
    public SharedPreferences.Editor f29516P1;

    /* JADX INFO: renamed from: P2, reason: collision with root package name */
    public Animation f29517P2;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public LinearLayout f29520Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public TextView f29521Q0;

    /* JADX INFO: renamed from: Q1, reason: collision with root package name */
    public LiveStreamDBHandler f29522Q1;

    /* JADX INFO: renamed from: Q2, reason: collision with root package name */
    public Handler f29523Q2;

    /* JADX INFO: renamed from: Q4, reason: collision with root package name */
    public TextView f29525Q4;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public LinearLayout f29526R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public TextView f29527R0;

    /* JADX INFO: renamed from: R1, reason: collision with root package name */
    public SimpleDateFormat f29528R1;

    /* JADX INFO: renamed from: R2, reason: collision with root package name */
    public String f29529R2;

    /* JADX INFO: renamed from: R4, reason: collision with root package name */
    public View f29531R4;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public LinearLayout f29532S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public TextView f29533S0;

    /* JADX INFO: renamed from: S1, reason: collision with root package name */
    public Date f29534S1;

    /* JADX INFO: renamed from: S3, reason: collision with root package name */
    public SharedPreferences f29536S3;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public LinearLayout f29537T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public TextView f29538T0;

    /* JADX INFO: renamed from: T1, reason: collision with root package name */
    public DateFormat f29539T1;

    /* JADX INFO: renamed from: T2, reason: collision with root package name */
    public SeriesRecentWatchDatabase f29540T2;

    /* JADX INFO: renamed from: T3, reason: collision with root package name */
    public SharedPreferences.Editor f29541T3;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public LinearLayout f29542U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public TextView f29543U0;

    /* JADX INFO: renamed from: U1, reason: collision with root package name */
    public String f29544U1;

    /* JADX INFO: renamed from: U2, reason: collision with root package name */
    public RecentWatchDBHandler f29545U2;

    /* JADX INFO: renamed from: U3, reason: collision with root package name */
    public SharedPreferences f29546U3;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public LinearLayout f29547V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public TextView f29548V0;

    /* JADX INFO: renamed from: V1, reason: collision with root package name */
    public String f29549V1;

    /* JADX INFO: renamed from: V2, reason: collision with root package name */
    public C2858a f29550V2;

    /* JADX INFO: renamed from: V3, reason: collision with root package name */
    public C2328e f29551V3;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public LinearLayout f29552W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public TextView f29553W0;

    /* JADX INFO: renamed from: W1, reason: collision with root package name */
    public String f29554W1;

    /* JADX INFO: renamed from: W2, reason: collision with root package name */
    public SharedPreferences f29555W2;

    /* JADX INFO: renamed from: W3, reason: collision with root package name */
    public C2325b f29556W3;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public LinearLayout f29557X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public TextView f29558X0;

    /* JADX INFO: renamed from: X1, reason: collision with root package name */
    public String f29559X1;

    /* JADX INFO: renamed from: X2, reason: collision with root package name */
    public SharedPreferences f29560X2;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public LinearLayout f29562Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public TextView f29563Y0;

    /* JADX INFO: renamed from: Y2, reason: collision with root package name */
    public SharedPreferences f29565Y2;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public LinearLayout f29567Z;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public TextView f29568Z0;

    /* JADX INFO: renamed from: Z2, reason: collision with root package name */
    public SharedPreferences f29570Z2;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public TextView f29572a1;

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public SharedPreferences f29574a3;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public TextView f29576b1;

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    public SharedPreferences f29578b3;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public TextView f29580c1;

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    public SharedPreferences f29582c3;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public TextView f29585d1;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public Handler f29586d2;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public SharedPreferences f29587d3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29589e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public LinearLayout f29590e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public TextView f29591e1;

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    public SharedPreferences f29593e3;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    public InterfaceC2347y f29594e4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinearLayout f29595f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public LinearLayout f29596f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public TextView f29597f1;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public int f29598f2;

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    public SharedPreferences.Editor f29599f3;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    public ArrayList f29600f4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Animation f29601g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public RelativeLayout f29602g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public TextView f29603g1;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public SharedPreferences.Editor f29605g3;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public a f29606g4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Animation f29607h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public RelativeLayout f29608h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public TextView f29609h1;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public TextView f29610h2;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public SharedPreferences.Editor f29611h3;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public BroadcastReceiver f29612h4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C2509z0 f29613i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public RelativeLayout f29614i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public TextView f29615i1;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public PlayerView f29616i2;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public SharedPreferences.Editor f29617i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f29619j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public RelativeLayout f29620j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public TextView f29621j1;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public ImageView f29622j2;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public SharedPreferences.Editor f29623j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f29625k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public RelativeLayout f29626k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public TextView f29627k1;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public LinearLayout f29628k2;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public String f29629k3;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public PictureInPictureParams.Builder f29630k4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LinearLayout f29631l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public RelativeLayout f29632l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public FrameLayout f29633l1;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public LinearLayout f29634l2;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public ArrayList f29635l3;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    public ArrayList f29636l4;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public RelativeLayout f29638m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public FrameLayout f29639m1;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public TextView f29640m2;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public ArrayList f29641m3;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    public SharedPreferences f29642m4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Handler f29643n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public RelativeLayout f29644n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public FrameLayout f29645n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public String f29646n2;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public List f29647n3;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public RelativeLayout f29650o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public MediaRouteButton f29651o1;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public int f29652o2;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    public boolean f29654o4;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public RelativeLayout f29656p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public RecyclerView f29657p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public AudioManager f29658p2;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    public InterfaceC1224o.a f29660p4;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ImageView f29662q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public CheckBox f29663q1;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public int f29664q2;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public String f29665q3;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    public Z3.m f29666q4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public I1 f29667r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ImageView f29668r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public CheckBox f29669r1;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public Handler f29670r2;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    public m.d f29672r4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public StringBuilder f29673s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ImageView f29674s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public CheckBox f29675s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public GestureDetector f29676s2;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    public i0 f29678s4;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Formatter f29679t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ImageView f29680t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public CheckBox f29681t1;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    public boolean f29684t4;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SharedPreferences f29685u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ImageView f29686u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public CheckBox f29687u1;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    public int f29690u4;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SharedPreferences.Editor f29691v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public ImageView f29692v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public CheckBox f29693v1;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    public long f29696v4;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LinearLayout f29697w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ImageView f29698w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public CheckBox f29699w1;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    public Animation f29702w4;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public LinearLayout f29703x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ImageView f29704x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public CheckBox f29705x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public LinearLayout f29709y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ImageView f29710y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public CheckBox f29711y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public Handler f29712y2;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    public List f29714y4;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public LinearLayout f29715z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public ImageView f29716z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public CheckBox f29717z1;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public String f29718z2;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    public String f29720z4;

    /* JADX INFO: renamed from: S4, reason: collision with root package name */
    public static final int[] f29415S4 = {0, 1, 2, 3, 4, 5};

    /* JADX INFO: renamed from: T4, reason: collision with root package name */
    public static boolean f29416T4 = false;

    /* JADX INFO: renamed from: V4, reason: collision with root package name */
    public static boolean f29418V4 = false;

    /* JADX INFO: renamed from: Y4, reason: collision with root package name */
    public static boolean f29421Y4 = true;

    /* JADX INFO: renamed from: Z4, reason: collision with root package name */
    public static boolean f29422Z4 = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f29584d = new c(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f29637m = "mobile";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f29649o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f29655p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f29661q = false;

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public String f29450E1 = "Live";

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public String f29456F1 = "";

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    public String f29462G1 = "";

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    public String f29468H1 = "";

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    public String f29474I1 = "";

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    public String f29486K1 = "";

    /* JADX INFO: renamed from: O1, reason: collision with root package name */
    public String f29510O1 = "";

    /* JADX INFO: renamed from: Y1, reason: collision with root package name */
    public String f29564Y1 = "";

    /* JADX INFO: renamed from: Z1, reason: collision with root package name */
    public String f29569Z1 = "movie";

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public String f29573a2 = "";

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public String f29577b2 = "";

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public String f29581c2 = "";

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public boolean f29592e2 = false;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public ArrayList f29604g2 = new ArrayList();

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public a.b f29682t2 = null;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public IMediaPlayer f29688u2 = null;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public long f29694v2 = -1;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public int f29700w2 = 4;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public int f29706x2 = f29415S4[0];

    /* JADX INFO: renamed from: B2, reason: collision with root package name */
    public boolean f29433B2 = false;

    /* JADX INFO: renamed from: C2, reason: collision with root package name */
    public boolean f29439C2 = false;

    /* JADX INFO: renamed from: D2, reason: collision with root package name */
    public boolean f29445D2 = false;

    /* JADX INFO: renamed from: E2, reason: collision with root package name */
    public int f29451E2 = 0;

    /* JADX INFO: renamed from: F2, reason: collision with root package name */
    public List f29457F2 = new ArrayList();

    /* JADX INFO: renamed from: S2, reason: collision with root package name */
    public String f29535S2 = "";

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public String f29653o3 = "";

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public int f29659p3 = -1;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public Boolean f29671r3 = Boolean.TRUE;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public int f29677s3 = -1;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public String f29683t3 = "";

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public int f29689u3 = -1;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public int f29695v3 = 0;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public String f29701w3 = "";

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public int f29707x3 = 0;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public Thread f29713y3 = null;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public String f29719z3 = "";

    /* JADX INFO: renamed from: E3, reason: collision with root package name */
    public Handler f29452E3 = new j(Looper.getMainLooper());

    /* JADX INFO: renamed from: F3, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f29458F3 = new s();

    /* JADX INFO: renamed from: G3, reason: collision with root package name */
    public NSTIJKPlayerEpisodes.M f29464G3 = new w();

    /* JADX INFO: renamed from: H3, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f29470H3 = new x();

    /* JADX INFO: renamed from: K3, reason: collision with root package name */
    public String f29488K3 = "";

    /* JADX INFO: renamed from: L3, reason: collision with root package name */
    public String f29494L3 = "";

    /* JADX INFO: renamed from: M3, reason: collision with root package name */
    public String f29500M3 = "";

    /* JADX INFO: renamed from: P3, reason: collision with root package name */
    public int f29518P3 = 0;

    /* JADX INFO: renamed from: Q3, reason: collision with root package name */
    public float f29524Q3 = -1.0f;

    /* JADX INFO: renamed from: R3, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f29530R3 = new y();

    /* JADX INFO: renamed from: X3, reason: collision with root package name */
    public String f29561X3 = "";

    /* JADX INFO: renamed from: Y3, reason: collision with root package name */
    public String f29566Y3 = "";

    /* JADX INFO: renamed from: Z3, reason: collision with root package name */
    public String f29571Z3 = "";

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public String f29575a4 = "";

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public int f29579b4 = 0;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    public int f29583c4 = 0;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    public int f29588d4 = 0;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public boolean f29618i4 = false;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public boolean f29624j4 = false;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    public boolean f29648n4 = AbstractC2237a.f44541u0;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public int f29708x4 = 5;

    /* JADX INFO: renamed from: A4, reason: collision with root package name */
    public int f29429A4 = 0;

    /* JADX INFO: renamed from: B4, reason: collision with root package name */
    public int f29435B4 = 0;

    /* JADX INFO: renamed from: C4, reason: collision with root package name */
    public Handler f29441C4 = new Handler();

    /* JADX INFO: renamed from: E4, reason: collision with root package name */
    public String f29453E4 = "";

    /* JADX INFO: renamed from: F4, reason: collision with root package name */
    public Runnable f29459F4 = new z();

    /* JADX INFO: renamed from: G4, reason: collision with root package name */
    public BroadcastReceiver f29465G4 = new C();

    /* JADX INFO: renamed from: H4, reason: collision with root package name */
    public int f29471H4 = 0;

    /* JADX INFO: renamed from: I4, reason: collision with root package name */
    public boolean f29477I4 = false;

    /* JADX INFO: renamed from: P4, reason: collision with root package name */
    public int f29519P4 = 0;

    public class A implements View.OnClickListener {
        public A() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ExoPlayerMoviesSeries.this.f29634l2.setVisibility(8);
        }
    }

    public class B implements View.OnClickListener {
        public B() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class C extends BroadcastReceiver {
        public C() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MyApplication.E("Constant.PIP_MODE_SWITCH_USER : ");
            if ("pip_mode_switch_user".equals(intent.getAction())) {
                ExoPlayerMoviesSeries.this.finish();
            }
        }
    }

    public class D implements Runnable {
        public D() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Log.e("honey", "count: " + ExoPlayerMoviesSeries.this.f29707x3);
                    if (SharepreferenceDBHandler.getMaintanceModeState(ExoPlayerMoviesSeries.this.f29475I2)) {
                        ExoPlayerMoviesSeries.this.f29475I2.startActivity(new Intent(ExoPlayerMoviesSeries.this.f29475I2, (Class<?>) MaintanencePannelActivity.class));
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

    public class E implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f29725a;

        public E(View view) {
            this.f29725a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29725a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29725a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29725a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x01ee  */
        /* JADX WARN: Removed duplicated region for block: B:348:0x060f  */
        @Override // android.view.View.OnFocusChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onFocusChange(android.view.View r26, boolean r27) {
            /*
                Method dump skipped, instruction units count: 2138
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries.E.onFocusChange(android.view.View, boolean):void");
        }
    }

    public class F implements InterfaceC1699p {
        public F() {
        }

        public /* synthetic */ F(ExoPlayerMoviesSeries exoPlayerMoviesSeries, j jVar) {
            this();
        }

        @Override // d4.InterfaceC1699p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Pair a(C0909p1 c0909p1) {
            String string = ExoPlayerMoviesSeries.this.getString(a7.j.f13065M1);
            Throwable cause = c0909p1.getCause();
            if (cause instanceof u.b) {
                u.b bVar = (u.b) cause;
                p3.t tVar = bVar.f46381d;
                string = tVar == null ? bVar.getCause() instanceof AbstractC2392B.c ? ExoPlayerMoviesSeries.this.getString(a7.j.f13115R1) : bVar.f46380c ? ExoPlayerMoviesSeries.this.getString(a7.j.f13095P1, bVar.f46379a) : ExoPlayerMoviesSeries.this.getString(a7.j.f13085O1, bVar.f46379a) : ExoPlayerMoviesSeries.this.getString(a7.j.f13075N1, tVar.f46299a);
            }
            return Pair.create(0, string);
        }
    }

    public class G implements InterfaceC0920t1.d {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ExoPlayerMoviesSeries exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
                if (exoPlayerMoviesSeries.f29661q) {
                    return;
                }
                exoPlayerMoviesSeries.f29649o++;
                m7.w.P0(exoPlayerMoviesSeries.f29475I2, ExoPlayerMoviesSeries.this.f29475I2.getResources().getString(a7.j.f13262g5) + " (" + ExoPlayerMoviesSeries.this.f29649o + "/" + ExoPlayerMoviesSeries.this.f29708x4 + ")");
                ExoPlayerMoviesSeries.this.q3();
                ExoPlayerMoviesSeries.this.U2();
            }
        }

        public G() {
        }

        public /* synthetic */ G(ExoPlayerMoviesSeries exoPlayerMoviesSeries, j jVar) {
            this();
        }

        private void C(String str) {
            ExoPlayerMoviesSeries.this.f29446D3.b(f.f12146G).e();
            ExoPlayerMoviesSeries.this.f29446D3.b(f.f12186K).c(str);
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
                if (ExoPlayerMoviesSeries.y2()) {
                    return;
                }
                LinearLayout linearLayout = ExoPlayerMoviesSeries.this.f29478J;
                if (linearLayout != null && linearLayout.getVisibility() == 0) {
                    ExoPlayerMoviesSeries.this.f29478J.setVisibility(8);
                }
                ExoPlayerMoviesSeries.f29417U4.setVisibility(0);
                return;
            }
            if (i9 == 4) {
                o();
                return;
            }
            if (i9 == 3) {
                if (ExoPlayerMoviesSeries.this.f29631l.getVisibility() == 0) {
                    ExoPlayerMoviesSeries.this.f29478J.setVisibility(0);
                }
                ExoPlayerMoviesSeries.this.f29649o = 0;
                ExoPlayerMoviesSeries.f29417U4.setVisibility(8);
                ExoPlayerMoviesSeries.this.f29667r.play();
                LiveStreamDBHandler liveStreamDBHandler = ExoPlayerMoviesSeries.this.f29522Q1;
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
        public /* synthetic */ void Y(Z3.z zVar) {
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
            if (ExoPlayerMoviesSeries.this.f29661q || c0909p1.f6177a == 1002) {
                return;
            }
            if (c0909p1.toString().contains("com.google.android.exoplayer2.ext.ffmpeg.FfmpegDecoderException")) {
                m7.w.P0(ExoPlayerMoviesSeries.this.f29475I2, "Audio track issue found. Please change the audio track to none.");
            } else {
                o();
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

        public final void o() {
            ExoPlayerMoviesSeries exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
            if (exoPlayerMoviesSeries.f29649o >= exoPlayerMoviesSeries.f29708x4) {
                C(ExoPlayerMoviesSeries.this.f29475I2.getResources().getString(a7.j.f13214b7));
                ExoPlayerMoviesSeries.this.q3();
                ExoPlayerMoviesSeries.this.f29655p = false;
                ExoPlayerMoviesSeries.f29417U4.setVisibility(8);
                return;
            }
            ExoPlayerMoviesSeries exoPlayerMoviesSeries2 = ExoPlayerMoviesSeries.this;
            if (exoPlayerMoviesSeries2.f29661q) {
                return;
            }
            exoPlayerMoviesSeries2.f29655p = true;
            exoPlayerMoviesSeries2.f29670r2.postDelayed(new a(), 3000L);
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

    public class H extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f29730a;

        public H() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            ExoPlayerMoviesSeries exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
            if (exoPlayerMoviesSeries.f29667r == null) {
                return true;
            }
            exoPlayerMoviesSeries.f29616i2.getWidth();
            motionEvent.getX();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            this.f29730a = true;
            return super.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            ExoPlayerMoviesSeries.this.P3();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries$a, reason: case insensitive filesystem */
    public class DialogInterfaceOnClickListenerC1427a implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC1427a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            ExoPlayerMoviesSeries exoPlayerMoviesSeries;
            String str;
            switch (i9) {
                case 0:
                    exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
                    str = "10";
                    break;
                case 1:
                    exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
                    str = "12";
                    break;
                case 2:
                    exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
                    str = "14";
                    break;
                case 3:
                    exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
                    str = "16";
                    break;
                case 4:
                    exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
                    str = "18";
                    break;
                case 5:
                    exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
                    str = "20";
                    break;
                case 6:
                    exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
                    str = "22";
                    break;
                case 7:
                    exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
                    str = "24";
                    break;
                case 8:
                    exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
                    str = "26";
                    break;
                case 9:
                    exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
                    str = "28";
                    break;
                case 10:
                    exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
                    str = "30";
                    break;
                case 11:
                    exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
                    str = "32";
                    break;
                case 12:
                    exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
                    str = "34";
                    break;
                case 13:
                    exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
                    str = "36";
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
                    str = "38";
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
                    str = "40";
                    break;
                default:
                    return;
            }
            exoPlayerMoviesSeries.M3(str);
            ExoPlayerMoviesSeries.this.f29503N0.setText(str);
            dialogInterface.cancel();
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries$b, reason: case insensitive filesystem */
    public class DialogInterfaceOnDismissListenerC1428b implements DialogInterface.OnDismissListener {
        public DialogInterfaceOnDismissListenerC1428b() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries$c, reason: case insensitive filesystem */
    public class C1429c implements InterfaceC2347y {
        public C1429c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[Catch: Exception -> 0x001c, TryCatch #0 {Exception -> 0x001c, blocks: (B:3:0x0005, B:5:0x0013, B:16:0x0033, B:11:0x0021, B:14:0x002b, B:18:0x003c, B:20:0x0044, B:21:0x006a, B:23:0x008f, B:25:0x0096, B:26:0x00a2), top: B:31:0x0005 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(o4.C2328e r10) {
            /*
                Method dump skipped, instruction units count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries.C1429c.a(o4.e):void");
        }

        public final void b() {
            ExoPlayerMoviesSeries.this.invalidateOptionsMenu();
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
            ExoPlayerMoviesSeries.this.f29551V3 = c2328e;
            if (ExoPlayerMoviesSeries.this.f29551V3 != null) {
                ExoPlayerMoviesSeries exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
                if (exoPlayerMoviesSeries.f29667r != null) {
                    exoPlayerMoviesSeries.T2();
                    ExoPlayerMoviesSeries.this.f29667r.pause();
                }
                LinearLayout linearLayout = ExoPlayerMoviesSeries.this.f29508O;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                ExoPlayerMoviesSeries exoPlayerMoviesSeries2 = ExoPlayerMoviesSeries.this;
                if (exoPlayerMoviesSeries2.f29572a1 != null) {
                    if (exoPlayerMoviesSeries2.f29551V3.q() == null || ExoPlayerMoviesSeries.this.f29551V3.q().J() == null) {
                        textView = ExoPlayerMoviesSeries.this.f29572a1;
                        sb = new StringBuilder();
                        string = ExoPlayerMoviesSeries.this.getResources().getString(a7.j.f13407v0);
                    } else {
                        textView = ExoPlayerMoviesSeries.this.f29572a1;
                        sb = new StringBuilder();
                        sb.append(ExoPlayerMoviesSeries.this.getResources().getString(a7.j.f13417w0));
                        sb.append(" ");
                        string = ExoPlayerMoviesSeries.this.f29551V3.q().J();
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

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries$d, reason: case insensitive filesystem */
    public class RunnableC1430d implements Runnable {
        public RunnableC1430d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView;
            String str;
            int currentPosition = ((int) ExoPlayerMoviesSeries.this.f29667r.getCurrentPosition()) + ExoPlayerMoviesSeries.this.f29518P3;
            ExoPlayerMoviesSeries.this.f29667r.seekTo(currentPosition > 0 ? ((int) r0.getCurrentPosition()) + ExoPlayerMoviesSeries.this.f29518P3 : 0L);
            ExoPlayerMoviesSeries.this.f29518P3 = 0;
            ExoPlayerMoviesSeries exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
            exoPlayerMoviesSeries.f29645n1.startAnimation(exoPlayerMoviesSeries.f29607h);
            ExoPlayerMoviesSeries.this.f29645n1.setVisibility(8);
            String str2 = ExoPlayerMoviesSeries.this.f29577b2;
            if (str2 == null || !str2.equals("catch_up")) {
                textView = ExoPlayerMoviesSeries.this.f29515P0;
                str = "-10s";
            } else {
                textView = ExoPlayerMoviesSeries.this.f29515P0;
                str = "-60s";
            }
            textView.setText(str);
            if (ExoPlayerMoviesSeries.this.f29631l.getVisibility() == 8) {
                ExoPlayerMoviesSeries exoPlayerMoviesSeries2 = ExoPlayerMoviesSeries.this;
                exoPlayerMoviesSeries2.f29515P0.startAnimation(exoPlayerMoviesSeries2.f29607h);
                ExoPlayerMoviesSeries.this.f29515P0.setVisibility(8);
            }
            ExoPlayerMoviesSeries.this.v2(1000);
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries$e, reason: case insensitive filesystem */
    public class RunnableC1431e implements Runnable {
        public RunnableC1431e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView;
            String str;
            ExoPlayerMoviesSeries.this.f29667r.seekTo(((int) r0.getCurrentPosition()) + ExoPlayerMoviesSeries.this.f29518P3);
            ExoPlayerMoviesSeries.this.f29518P3 = 0;
            ExoPlayerMoviesSeries exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
            exoPlayerMoviesSeries.f29639m1.startAnimation(exoPlayerMoviesSeries.f29607h);
            ExoPlayerMoviesSeries.this.f29639m1.setVisibility(8);
            String str2 = ExoPlayerMoviesSeries.this.f29577b2;
            if (str2 == null || !str2.equals("catch_up")) {
                textView = ExoPlayerMoviesSeries.this.f29521Q0;
                str = "+10s";
            } else {
                textView = ExoPlayerMoviesSeries.this.f29521Q0;
                str = "+60s";
            }
            textView.setText(str);
            if (ExoPlayerMoviesSeries.this.f29631l.getVisibility() == 8) {
                ExoPlayerMoviesSeries exoPlayerMoviesSeries2 = ExoPlayerMoviesSeries.this;
                exoPlayerMoviesSeries2.f29521Q0.startAnimation(exoPlayerMoviesSeries2.f29607h);
                ExoPlayerMoviesSeries.this.f29521Q0.setVisibility(8);
            }
            ExoPlayerMoviesSeries.this.v2(1000);
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries$f, reason: case insensitive filesystem */
    public class ViewOnClickListenerC1432f implements View.OnClickListener {
        public ViewOnClickListenerC1432f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ExoPlayerMoviesSeries.this.f29447D4.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries$g, reason: case insensitive filesystem */
    public class C1433g implements InterfaceC2389c {
        public C1433g() {
        }

        @Override // p1.InterfaceC2389c
        public void a(JSONObject jSONObject) {
            JSONArray jSONArray;
            JSONArray jSONArray2;
            JSONArray jSONArray3;
            ExoPlayerMoviesSeries.this.f29477I4 = true;
            ExoPlayerMoviesSeries.this.f29501M4.setVisibility(0);
            try {
                HashSet hashSet = new HashSet();
                try {
                    JSONObject jSONObject2 = new JSONObject(String.valueOf(jSONObject));
                    if (!jSONObject2.has("data") || jSONObject2.isNull("data") || (jSONArray = jSONObject2.getJSONArray("data")) == null || jSONArray.length() <= 0) {
                        Toast.makeText(ExoPlayerMoviesSeries.this.f29475I2, "No subtitle found.. ", 0).show();
                        ExoPlayerMoviesSeries exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
                        exoPlayerMoviesSeries.b3("");
                        return;
                    }
                    for (int i9 = 0; i9 < jSONArray.length(); i9++) {
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
                            hashSet.add("FRENCH");
                            string2 = "FRENCH";
                        } else if (string.equals("nl")) {
                            hashSet.add("DUTCH");
                            string2 = "DUTCH";
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
                        } else if (string.equals("it")) {
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
                        } else if (string.equals("it")) {
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
                        if (jSONArray2 != null) {
                            int i11 = 0;
                            while (i11 < jSONArray2.length()) {
                                JSONObject jSONObject4 = jSONArray2.getJSONObject(i11);
                                if (jSONObject4 != null) {
                                    try {
                                        jSONArray3 = jSONArray2;
                                        try {
                                            ExoPlayerMoviesSeries.this.f29652o2 = jSONObject4.getInt("file_id");
                                        } catch (Exception unused) {
                                        }
                                    } catch (Exception unused2) {
                                        jSONArray3 = jSONArray2;
                                    }
                                } else {
                                    jSONArray3 = jSONArray2;
                                }
                                i11++;
                                jSONArray2 = jSONArray3;
                            }
                            C2368a c2368a = new C2368a();
                            c2368a.e(string2);
                            c2368a.f(ExoPlayerMoviesSeries.this.f29652o2);
                            c2368a.d(i10);
                            c2368a.g(ExoPlayerMoviesSeries.this.f29652o2);
                            ExoPlayerMoviesSeries.this.f29714y4.add(c2368a);
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    final ArrayList arrayList3 = new ArrayList();
                    int i12 = -1;
                    for (int i13 = 0; i13 < ExoPlayerMoviesSeries.this.f29714y4.size(); i13++) {
                        if (arrayList.contains(((C2368a) ExoPlayerMoviesSeries.this.f29714y4.get(i13)).b())) {
                            int i14 = 0;
                            while (true) {
                                if (i14 >= arrayList.size()) {
                                    break;
                                }
                                if (((String) arrayList.get(i14)).equals(((C2368a) ExoPlayerMoviesSeries.this.f29714y4.get(i14)).b())) {
                                    i12 = i14;
                                    break;
                                }
                                i14++;
                            }
                            if (((C2368a) ExoPlayerMoviesSeries.this.f29714y4.get(i13)).a() > ((Integer) arrayList2.get(i12)).intValue()) {
                                arrayList3.remove(i12);
                                arrayList3.add(i12, (C2368a) ExoPlayerMoviesSeries.this.f29714y4.get(i13));
                            }
                        } else {
                            arrayList.add(((C2368a) ExoPlayerMoviesSeries.this.f29714y4.get(i13)).b());
                            arrayList2.add(Integer.valueOf(((C2368a) ExoPlayerMoviesSeries.this.f29714y4.get(i13)).a()));
                            arrayList3.add((C2368a) ExoPlayerMoviesSeries.this.f29714y4.get(i13));
                        }
                    }
                    c0 c0Var = new c0(ExoPlayerMoviesSeries.this.getApplicationContext(), arrayList3);
                    ExoPlayerMoviesSeries.this.f29507N4.setLayoutManager(new LinearLayoutManager(ExoPlayerMoviesSeries.this.getApplicationContext()));
                    ExoPlayerMoviesSeries.this.f29507N4.setAdapter(c0Var);
                    ExoPlayerMoviesSeries.this.f29507N4.setVisibility(8);
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: p7.x
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f46678a.g(arrayList3);
                        }
                    }, 2000L);
                    c0Var.n0(new c0.b() { // from class: p7.y
                        @Override // q7.c0.b
                        public final void a(int i15, C2368a c2368a2) {
                            this.f46681a.h(i15, c2368a2);
                        }
                    });
                } catch (JSONException e10) {
                    ExoPlayerMoviesSeries.this.b3(String.valueOf(e10));
                    e10.printStackTrace();
                }
            } catch (Exception e11) {
                ExoPlayerMoviesSeries.this.b3("");
                e11.printStackTrace();
            }
        }

        @Override // p1.InterfaceC2389c
        public void b(C2219a c2219a) {
            if (ExoPlayerMoviesSeries.this.f29477I4) {
                return;
            }
            ExoPlayerMoviesSeries.X1(ExoPlayerMoviesSeries.this);
            if (ExoPlayerMoviesSeries.this.f29471H4 <= 10) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: p7.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f46684a.f();
                    }
                }, 500L);
            } else {
                ExoPlayerMoviesSeries.this.b3(String.valueOf(c2219a));
            }
        }

        public final /* synthetic */ void f() {
            ExoPlayerMoviesSeries.this.K3(false);
        }

        public final /* synthetic */ void g(ArrayList arrayList) {
            ExoPlayerMoviesSeries.this.f29507N4.setVisibility(0);
            if (arrayList.size() > 0) {
                ExoPlayerMoviesSeries.this.f29501M4.setVisibility(8);
                ExoPlayerMoviesSeries.this.f29513O4.setVisibility(8);
            }
            ExoPlayerMoviesSeries.f29423a5.setVisibility(8);
        }

        public final /* synthetic */ void h(int i9, C2368a c2368a) {
            try {
                ExoPlayerMoviesSeries.this.f29652o2 = c2368a.c();
                ExoPlayerMoviesSeries exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
                exoPlayerMoviesSeries.f29560X2 = exoPlayerMoviesSeries.getSharedPreferences("allowedFormatsubtitle", 0);
                String string = ExoPlayerMoviesSeries.this.f29560X2.getString("allowedFormatsubtitle", "vip");
                ExoPlayerMoviesSeries.f29423a5.setVisibility(0);
                ExoPlayerMoviesSeries.this.f29447D4.dismiss();
                if (string.equals(CookieSpecs.DEFAULT)) {
                    Toast.makeText(ExoPlayerMoviesSeries.this, "Please wait", 0).show();
                    ExoPlayerMoviesSeries.this.C2(true);
                } else {
                    Toast.makeText(ExoPlayerMoviesSeries.this, "Please wait", 0).show();
                    ExoPlayerMoviesSeries.this.V3(true);
                }
            } catch (Exception e9) {
                ExoPlayerMoviesSeries.this.b3(String.valueOf(e9));
                e9.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries$h, reason: case insensitive filesystem */
    public class RunnableC1434h implements Runnable {
        public RunnableC1434h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ExoPlayerMoviesSeries.this.C2(false);
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ExoPlayerMoviesSeries.this.V3(false);
        }
    }

    public class j extends Handler {
        public j(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i9 = message.what;
            if (i9 == 1) {
                ExoPlayerMoviesSeries.this.w3();
                return;
            }
            if (i9 != 3) {
                if (i9 != 4) {
                    return;
                }
                ExoPlayerMoviesSeries.this.f29446D3.b(f.f12285U).a();
                ExoPlayerMoviesSeries.this.f29446D3.b(f.f12552v).a();
                ExoPlayerMoviesSeries.this.f29446D3.b(f.f12582y).a();
                return;
            }
            if (ExoPlayerMoviesSeries.this.f29694v2 >= 0) {
                ExoPlayerMoviesSeries.this.f29667r.seekTo((int) r5.f29694v2);
                ExoPlayerMoviesSeries.this.f29694v2 = -1L;
            }
        }
    }

    public class k implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f29742a;

        public k(View view) {
            this.f29742a = view;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (z9) {
                View view2 = this.f29742a;
                if (view2 == null || view2.getTag() == null) {
                    return;
                }
                this.f29742a.getTag().equals("iv_cross");
                return;
            }
            View view3 = this.f29742a;
            if (view3 == null || view3.getTag() == null || !this.f29742a.getTag().equals("iv_cross")) {
                return;
            }
            view.setBackground(ExoPlayerMoviesSeries.this.getResources().getDrawable(e.f11933L));
        }
    }

    public class l implements DialogInterface.OnClickListener {
        public l() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            I1 i12;
            float f9;
            switch (i9) {
                case 0:
                    ExoPlayerMoviesSeries.this.n3("0.25x");
                    ExoPlayerMoviesSeries.this.f29509O0.setText(ExoPlayerMoviesSeries.this.getResources().getString(a7.j.f13334n7) + " (0.25x)");
                    i12 = ExoPlayerMoviesSeries.this.f29667r;
                    f9 = 0.25f;
                    break;
                case 1:
                    ExoPlayerMoviesSeries.this.n3("0.5x");
                    ExoPlayerMoviesSeries.this.f29509O0.setText(ExoPlayerMoviesSeries.this.getResources().getString(a7.j.f13334n7) + " (0.5x)");
                    i12 = ExoPlayerMoviesSeries.this.f29667r;
                    f9 = 0.5f;
                    break;
                case 2:
                    ExoPlayerMoviesSeries.this.n3("0.75x");
                    ExoPlayerMoviesSeries.this.f29509O0.setText(ExoPlayerMoviesSeries.this.getResources().getString(a7.j.f13334n7) + " (0.75x)");
                    i12 = ExoPlayerMoviesSeries.this.f29667r;
                    f9 = 0.75f;
                    break;
                case 3:
                    ExoPlayerMoviesSeries.this.n3("1x (Normal)");
                    ExoPlayerMoviesSeries.this.f29509O0.setText(ExoPlayerMoviesSeries.this.getResources().getString(a7.j.f13334n7) + " (1x)");
                    i12 = ExoPlayerMoviesSeries.this.f29667r;
                    f9 = 1.0f;
                    break;
                case 4:
                    ExoPlayerMoviesSeries.this.n3("1.25x");
                    ExoPlayerMoviesSeries.this.f29509O0.setText(ExoPlayerMoviesSeries.this.getResources().getString(a7.j.f13334n7) + " (1.25x)");
                    i12 = ExoPlayerMoviesSeries.this.f29667r;
                    f9 = 1.25f;
                    break;
                case 5:
                    ExoPlayerMoviesSeries.this.n3("1.5x");
                    ExoPlayerMoviesSeries.this.f29509O0.setText(ExoPlayerMoviesSeries.this.getResources().getString(a7.j.f13334n7) + " (1.5x)");
                    i12 = ExoPlayerMoviesSeries.this.f29667r;
                    f9 = 1.5f;
                    break;
                case 6:
                    ExoPlayerMoviesSeries.this.n3("1.75x");
                    ExoPlayerMoviesSeries.this.f29509O0.setText(ExoPlayerMoviesSeries.this.getResources().getString(a7.j.f13334n7) + " (1.75x)");
                    i12 = ExoPlayerMoviesSeries.this.f29667r;
                    f9 = 1.75f;
                    break;
                case 7:
                    ExoPlayerMoviesSeries.this.n3("2x");
                    ExoPlayerMoviesSeries.this.f29509O0.setText(ExoPlayerMoviesSeries.this.getResources().getString(a7.j.f13334n7) + " (2x)");
                    i12 = ExoPlayerMoviesSeries.this.f29667r;
                    f9 = 2.0f;
                    break;
                default:
                    return;
            }
            i12.x0(f9);
            dialogInterface.cancel();
        }
    }

    public class m implements DialogInterface.OnDismissListener {
        public m() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            ExoPlayerMoviesSeries exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
            if (exoPlayerMoviesSeries.f29667r != null) {
                exoPlayerMoviesSeries.T2();
            }
        }
    }

    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ExoPlayerMoviesSeries.this.R2();
        }
    }

    public class o extends BroadcastReceiver {
        public o() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"media_control".equals(intent.getAction())) {
                return;
            }
            int intExtra = intent.getIntExtra("control_type", 0);
            if (intExtra != 1) {
                if (intExtra == 2 && Build.VERSION.SDK_INT >= 26) {
                    ExoPlayerMoviesSeries.this.S3(e.f12051r0, "play", 1, 1);
                    return;
                }
                return;
            }
            ExoPlayerMoviesSeries.this.d3();
            if (Build.VERSION.SDK_INT >= 26) {
                ExoPlayerMoviesSeries.this.S3(e.f12075x0, "pause", 2, 2);
            }
        }
    }

    public class p implements Runnable {
        public p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ExoPlayerMoviesSeries.this.S2();
        }
    }

    public class q implements View.OnTouchListener {
        public q() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return motionEvent != null && ExoPlayerMoviesSeries.this.f29676s2.onTouchEvent(motionEvent);
        }
    }

    public class r implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LinearLayout f29750a;

        public r(LinearLayout linearLayout) {
            this.f29750a = linearLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayout linearLayout;
            this.f29750a.setVisibility(8);
            if (ExoPlayerMoviesSeries.this.f29631l.getVisibility() != 0 || (linearLayout = ExoPlayerMoviesSeries.this.f29478J) == null) {
                return;
            }
            linearLayout.setVisibility(0);
        }
    }

    public class s implements SeekBar.OnSeekBarChangeListener {
        public s() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i9, boolean z9) {
            if (z9) {
                ExoPlayerMoviesSeries.this.f29446D3.b(f.f12146G).a();
                ExoPlayerMoviesSeries.this.f29694v2 = (int) (((double) ((int) r5.f29667r.getDuration())) * ((((double) i9) * 1.0d) / 1000.0d));
                ExoPlayerMoviesSeries exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
                exoPlayerMoviesSeries.f29589e = true;
                exoPlayerMoviesSeries.f29667r.seekTo(exoPlayerMoviesSeries.f29694v2);
                ExoPlayerMoviesSeries.this.E3();
                ExoPlayerMoviesSeries.this.v2(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            ExoPlayerMoviesSeries exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
            exoPlayerMoviesSeries.f29589e = true;
            exoPlayerMoviesSeries.f29658p2.setStreamMute(3, true);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            if (ExoPlayerMoviesSeries.this.f29688u2 == null) {
                return;
            }
            ExoPlayerMoviesSeries.this.E3();
            ExoPlayerMoviesSeries.this.v2(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
            ExoPlayerMoviesSeries.this.f29658p2.setStreamMute(3, false);
            ExoPlayerMoviesSeries.this.f29589e = false;
        }
    }

    public class t implements Callback {
        public t() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            Toast.makeText(ExoPlayerMoviesSeries.this, "Something went Wrong Report not Submited", 0).show();
            Log.e("onFailure", th.getMessage().toString());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            ExoPlayerMoviesSeries exoPlayerMoviesSeries;
            String strMessage;
            Toast toastMakeText;
            if (response != null) {
                if (response.body() == null || !response.isSuccessful()) {
                    if (response.message() != null && !response.message().equals("")) {
                        exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
                        strMessage = response.message();
                        toastMakeText = Toast.makeText(exoPlayerMoviesSeries, strMessage, 0);
                    }
                    toastMakeText = Toast.makeText(ExoPlayerMoviesSeries.this, "Something went Wrong Report not Submited", 0);
                } else {
                    if (((ClientFeedbackCallback) response.body()).a() != null && ((ClientFeedbackCallback) response.body()).a().equalsIgnoreCase("success")) {
                        exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
                        strMessage = "Reported Successfully";
                        toastMakeText = Toast.makeText(exoPlayerMoviesSeries, strMessage, 0);
                    }
                    toastMakeText = Toast.makeText(ExoPlayerMoviesSeries.this, "Something went Wrong Report not Submited", 0);
                }
                toastMakeText.show();
            }
        }
    }

    public class u implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Dialog f29754a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f29755c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f29756d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f29757e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f29758f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ ArrayList f29759g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f29760h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ List f29761i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f29762j;

        public u(Dialog dialog, int i9, int i10, int i11, int i12, ArrayList arrayList, String str, List list, String str2) {
            this.f29754a = dialog;
            this.f29755c = i9;
            this.f29756d = i10;
            this.f29757e = i11;
            this.f29758f = i12;
            this.f29759g = arrayList;
            this.f29760h = str;
            this.f29761i = list;
            this.f29762j = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ExoPlayerMoviesSeries.this.f29631l.setVisibility(0);
            this.f29754a.dismiss();
            ExoPlayerMoviesSeries.this.M2(this.f29755c, this.f29756d, this.f29757e, this.f29758f, this.f29759g, this.f29760h, this.f29761i, null, false, this.f29762j);
        }
    }

    public class v implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Dialog f29764a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f29765c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f29766d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f29767e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f29768f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ ArrayList f29769g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f29770h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ List f29771i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f29772j;

        public v(Dialog dialog, int i9, int i10, int i11, int i12, ArrayList arrayList, String str, List list, String str2) {
            this.f29764a = dialog;
            this.f29765c = i9;
            this.f29766d = i10;
            this.f29767e = i11;
            this.f29768f = i12;
            this.f29769g = arrayList;
            this.f29770h = str;
            this.f29771i = list;
            this.f29772j = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ExoPlayerMoviesSeries.this.f29631l.setVisibility(0);
            this.f29764a.dismiss();
            ExoPlayerMoviesSeries.this.M2(this.f29765c, this.f29766d, this.f29767e, this.f29768f, this.f29769g, this.f29770h, this.f29771i, null, false, this.f29772j);
        }
    }

    public class w extends NSTIJKPlayerEpisodes.M {
        public w() {
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes.M
        public void a() {
            ExoPlayerMoviesSeries.this.S3(e.f12075x0, "pause", 2, 2);
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes.M
        public void b() {
            ExoPlayerMoviesSeries.this.S3(e.f12051r0, "play", 1, 1);
        }
    }

    public class x implements SeekBar.OnSeekBarChangeListener {
        public x() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i9, boolean z9) {
            TextView textView;
            Drawable drawable;
            if (ExoPlayerMoviesSeries.this.f29658p2 != null) {
                try {
                    ExoPlayerMoviesSeries.this.f29658p2.setStreamVolume(3, i9, 0);
                    int streamVolume = (int) ((ExoPlayerMoviesSeries.this.f29658p2.getStreamVolume(3) / ExoPlayerMoviesSeries.this.f29664q2) * 100.0f);
                    if (streamVolume == 0 || streamVolume < 0) {
                        ExoPlayerMoviesSeries exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
                        textView = exoPlayerMoviesSeries.f29543U0;
                        drawable = exoPlayerMoviesSeries.getResources().getDrawable(e.f12071w0);
                    } else if (streamVolume < 40) {
                        ExoPlayerMoviesSeries exoPlayerMoviesSeries2 = ExoPlayerMoviesSeries.this;
                        textView = exoPlayerMoviesSeries2.f29543U0;
                        drawable = exoPlayerMoviesSeries2.getResources().getDrawable(e.f12059t0);
                    } else if (streamVolume < 80) {
                        ExoPlayerMoviesSeries exoPlayerMoviesSeries3 = ExoPlayerMoviesSeries.this;
                        textView = exoPlayerMoviesSeries3.f29543U0;
                        drawable = exoPlayerMoviesSeries3.getResources().getDrawable(e.f12063u0);
                    } else if (streamVolume < 100) {
                        ExoPlayerMoviesSeries exoPlayerMoviesSeries4 = ExoPlayerMoviesSeries.this;
                        textView = exoPlayerMoviesSeries4.f29543U0;
                        drawable = exoPlayerMoviesSeries4.getResources().getDrawable(e.f12067v0);
                    } else {
                        ExoPlayerMoviesSeries exoPlayerMoviesSeries5 = ExoPlayerMoviesSeries.this;
                        textView = exoPlayerMoviesSeries5.f29543U0;
                        drawable = exoPlayerMoviesSeries5.getResources().getDrawable(e.f12067v0);
                    }
                    textView.setBackground(drawable);
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            ExoPlayerMoviesSeries.this.E3();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            ExoPlayerMoviesSeries.this.E3();
            ExoPlayerMoviesSeries.this.v2(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
        }
    }

    public class y implements SeekBar.OnSeekBarChangeListener {
        public y() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i9, boolean z9) {
            TextView textView;
            Resources resources;
            int i10;
            ExoPlayerMoviesSeries.this.f29524Q3 = i9;
            int i11 = (int) ((ExoPlayerMoviesSeries.this.f29524Q3 / 255.0f) * 100.0f);
            if (i11 < 20) {
                ExoPlayerMoviesSeries exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
                textView = exoPlayerMoviesSeries.f29538T0;
                resources = exoPlayerMoviesSeries.getResources();
                i10 = e.f12015i0;
            } else if (i11 < 30) {
                ExoPlayerMoviesSeries exoPlayerMoviesSeries2 = ExoPlayerMoviesSeries.this;
                textView = exoPlayerMoviesSeries2.f29538T0;
                resources = exoPlayerMoviesSeries2.getResources();
                i10 = e.f12019j0;
            } else if (i11 < 40) {
                ExoPlayerMoviesSeries exoPlayerMoviesSeries3 = ExoPlayerMoviesSeries.this;
                textView = exoPlayerMoviesSeries3.f29538T0;
                resources = exoPlayerMoviesSeries3.getResources();
                i10 = e.f12023k0;
            } else if (i11 < 50) {
                ExoPlayerMoviesSeries exoPlayerMoviesSeries4 = ExoPlayerMoviesSeries.this;
                textView = exoPlayerMoviesSeries4.f29538T0;
                resources = exoPlayerMoviesSeries4.getResources();
                i10 = e.f12027l0;
            } else if (i11 < 60) {
                ExoPlayerMoviesSeries exoPlayerMoviesSeries5 = ExoPlayerMoviesSeries.this;
                textView = exoPlayerMoviesSeries5.f29538T0;
                resources = exoPlayerMoviesSeries5.getResources();
                i10 = e.f12031m0;
            } else if (i11 < 70) {
                ExoPlayerMoviesSeries exoPlayerMoviesSeries6 = ExoPlayerMoviesSeries.this;
                textView = exoPlayerMoviesSeries6.f29538T0;
                resources = exoPlayerMoviesSeries6.getResources();
                i10 = e.f12035n0;
            } else {
                ExoPlayerMoviesSeries exoPlayerMoviesSeries7 = ExoPlayerMoviesSeries.this;
                textView = exoPlayerMoviesSeries7.f29538T0;
                resources = exoPlayerMoviesSeries7.getResources();
                i10 = e.f12039o0;
            }
            textView.setBackground(resources.getDrawable(i10));
            Log.i("brightnessIs", "brightNess:" + ExoPlayerMoviesSeries.this.f29524Q3);
            WindowManager.LayoutParams attributes = ExoPlayerMoviesSeries.this.getWindow().getAttributes();
            attributes.screenBrightness = ExoPlayerMoviesSeries.this.f29524Q3 / 255.0f;
            try {
                ExoPlayerMoviesSeries.this.f29550V2.R((int) ExoPlayerMoviesSeries.this.f29524Q3);
            } catch (Exception e9) {
                Log.i("brightnessError", e9.toString());
            }
            ExoPlayerMoviesSeries.this.getWindow().setAttributes(attributes);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            ExoPlayerMoviesSeries.this.E3();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            ExoPlayerMoviesSeries.this.E3();
            ExoPlayerMoviesSeries.this.v2(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
        }
    }

    public class z implements Runnable {
        public z() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.i("durationIS", "total:" + ExoPlayerMoviesSeries.this.f29667r.getDuration() + "cur:" + ExoPlayerMoviesSeries.this.f29667r.getCurrentPosition());
                ExoPlayerMoviesSeries exoPlayerMoviesSeries = ExoPlayerMoviesSeries.this;
                exoPlayerMoviesSeries.f29473I0.setText(exoPlayerMoviesSeries.J3((int) exoPlayerMoviesSeries.f29667r.getCurrentPosition()));
                ExoPlayerMoviesSeries exoPlayerMoviesSeries2 = ExoPlayerMoviesSeries.this;
                exoPlayerMoviesSeries2.f29479J0.setText(exoPlayerMoviesSeries2.J3((int) exoPlayerMoviesSeries2.f29667r.getDuration()));
                int duration = (int) ExoPlayerMoviesSeries.this.f29667r.getDuration();
                if (duration > 0) {
                    ExoPlayerMoviesSeries.this.f29437C0.setProgress((int) ((((long) ((int) ExoPlayerMoviesSeries.this.f29667r.getCurrentPosition())) * 1000) / ((long) duration)));
                    if (ExoPlayerMoviesSeries.this.f29667r.isPlaying()) {
                        ExoPlayerMoviesSeries.this.f29674s0.setVisibility(8);
                        ExoPlayerMoviesSeries.this.f29680t0.setVisibility(0);
                    }
                }
            } catch (Exception unused) {
            }
            ExoPlayerMoviesSeries.this.f29670r2.postDelayed(this, 1000L);
        }
    }

    public static long E2(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0L;
        }
    }

    public static String G2(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    public static String Q2(String str) {
        Matcher matcher = Pattern.compile("(?:youtube(?:-nocookie)?\\.com\\/(?:[^\\/\\n\\s]+\\/\\S+\\/|(?:v|e(?:mbed)?)\\/|\\S*?[?&]v=)|youtu\\.be\\/)([a-zA-Z0-9_-]{11})", 2).matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T2() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ int X1(ExoPlayerMoviesSeries exoPlayerMoviesSeries) {
        int i9 = exoPlayerMoviesSeries.f29471H4;
        exoPlayerMoviesSeries.f29471H4 = i9 + 1;
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q3() {
        try {
            if (this.f29667r != null) {
                this.f29506N3 = this.f29475I2.getSharedPreferences("currentSeekTime", 0);
                long currentPosition = (int) this.f29667r.getCurrentPosition();
                SharedPreferences sharedPreferences = this.f29475I2.getSharedPreferences("currentSeekTime", 0);
                this.f29506N3 = sharedPreferences;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                this.f29512O3 = editorEdit;
                editorEdit.putString("currentSeekTime", String.valueOf(currentPosition));
                this.f29512O3.apply();
                String str = this.f29577b2;
                if (str == null || !str.equals("movies")) {
                    String str2 = this.f29577b2;
                    if (str2 != null && str2.equals("series") && ((this.f29667r == null || C2966a.f().a() == null || !this.f29629k3.equals("m3u")) && C2966a.f() != null && C2966a.f().e() != null && currentPosition != -1 && currentPosition != 0)) {
                        ArrayList arrayListC = this.f29613i.c(C2966a.f().e());
                        this.f29600f4 = arrayListC;
                        if (arrayListC != null && arrayListC.size() > 0) {
                            try {
                                int iK2 = K2(this.f29647n3, m7.w.r0(C2966a.f().e()));
                                GetEpisdoeDetailsCallback getEpisdoeDetailsCallback = new GetEpisdoeDetailsCallback();
                                getEpisdoeDetailsCallback.setId(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getId());
                                getEpisdoeDetailsCallback.setTitle(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getTitle());
                                getEpisdoeDetailsCallback.setContainerExtension(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getContainerExtension());
                                getEpisdoeDetailsCallback.setAdded(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getAdded());
                                getEpisdoeDetailsCallback.setSeriesCover(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getSeriesCover());
                                getEpisdoeDetailsCallback.setCategoryId(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getCategoryId());
                                getEpisdoeDetailsCallback.setElapsed_time(String.valueOf(currentPosition));
                                getEpisdoeDetailsCallback.setSeriesId(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getSeriesId());
                                getEpisdoeDetailsCallback.setImage(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getImage());
                                getEpisdoeDetailsCallback.setMovieImage(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getMovieImage());
                                getEpisdoeDetailsCallback.setMainSeriesImg(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getMainSeriesImg());
                                getEpisdoeDetailsCallback.setSeriesNum(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getSeriesNum());
                                getEpisdoeDetailsCallback.setSeasonNumber(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getSeasonNumber());
                                getEpisdoeDetailsCallback.setEpisodeNum(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getEpisodeNumber());
                                getEpisdoeDetailsCallback.setSeriesName(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getSeriesName());
                                this.f29456F1 = ((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getCategoryId();
                                this.f29462G1 = ((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getSeriesName();
                                if (SharepreferenceDBHandler.getCurrentAPPType(this.f29475I2).equals("onestream_api")) {
                                    getEpisdoeDetailsCallback.setLinks(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getLinks());
                                }
                                I1 i12 = this.f29667r;
                                getEpisdoeDetailsCallback.setDurationSec(i12 != null ? String.valueOf(((int) i12.getDuration()) / 1000) : ((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getDurationSec());
                                this.f29613i.b(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getId());
                                this.f29613i.i(this.f29475I2, ((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getSeriesId());
                                this.f29613i.g(this.f29475I2, getEpisdoeDetailsCallback);
                            } catch (Exception unused) {
                            }
                        }
                    }
                } else {
                    r3(1);
                }
            }
            I1 i13 = this.f29667r;
            if (i13 != null) {
                i13.release();
                this.f29667r = null;
                this.f29666q4 = null;
            }
        } catch (Exception unused2) {
        }
    }

    public static boolean y2() {
        ProgressBar progressBar = f29417U4;
        return progressBar != null && progressBar.getVisibility() == 0;
    }

    public final void A2() {
        int iRound;
        int iR0;
        int iRound2;
        I1 i12;
        long currentPosition;
        GetEpisdoeDetailsCallback getEpisdoeDetailsCallback;
        C2509z0 c2509z0;
        List list = this.f29647n3;
        if (list == null || list.size() <= 0) {
            return;
        }
        List list2 = this.f29457F2;
        if (list2 != null) {
            list2.clear();
        }
        if (this.f29540T2 != null) {
            if (this.f29667r != null) {
                this.f29506N3 = this.f29475I2.getSharedPreferences("currentSeekTime", 0);
                try {
                    currentPosition = (int) this.f29667r.getCurrentPosition();
                } catch (Exception unused) {
                    currentPosition = 1000;
                }
                SharedPreferences sharedPreferences = this.f29475I2.getSharedPreferences("currentSeekTime", 0);
                this.f29506N3 = sharedPreferences;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                this.f29512O3 = editorEdit;
                editorEdit.putString("currentSeekTime", String.valueOf(currentPosition));
                this.f29512O3.apply();
                Log.i("seekTimeIS", "seekTime:" + currentPosition);
                if (this.f29667r == null || C2966a.f().a() == null || !this.f29629k3.equals("m3u")) {
                    try {
                        if (C2966a.f() != null && C2966a.f().e() != null && currentPosition != -1 && currentPosition != 0) {
                            Log.i("elsePartIS", "ifHere");
                            int iK2 = K2(this.f29647n3, m7.w.r0(C2966a.f().e()));
                            getEpisdoeDetailsCallback = new GetEpisdoeDetailsCallback();
                            getEpisdoeDetailsCallback.setId(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getId());
                            getEpisdoeDetailsCallback.setTitle(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getTitle());
                            getEpisdoeDetailsCallback.setContainerExtension(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getContainerExtension());
                            getEpisdoeDetailsCallback.setAdded(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getAdded());
                            getEpisdoeDetailsCallback.setSeriesCover(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getSeriesCover());
                            getEpisdoeDetailsCallback.setCategoryId(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getCategoryId());
                            getEpisdoeDetailsCallback.setElapsed_time(String.valueOf(currentPosition));
                            getEpisdoeDetailsCallback.setSeriesId(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getSeriesId());
                            getEpisdoeDetailsCallback.setSeriesId(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getSeriesId());
                            getEpisdoeDetailsCallback.setImage(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getImage());
                            getEpisdoeDetailsCallback.setMovieImage(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getMovieImage());
                            getEpisdoeDetailsCallback.setMainSeriesImg(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getMainSeriesImg());
                            getEpisdoeDetailsCallback.setSeriesNum(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getSeriesNum());
                            getEpisdoeDetailsCallback.setSeasonNumber(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getSeasonNumber());
                            getEpisdoeDetailsCallback.setEpisodeNum(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getEpisodeNumber());
                            getEpisdoeDetailsCallback.setSeriesName(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getSeriesName());
                            I1 i13 = this.f29667r;
                            getEpisdoeDetailsCallback.setDurationSec(i13 != null ? String.valueOf(((int) i13.getDuration()) / 1000) : ((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getDurationSec());
                            this.f29613i.b(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getId());
                            this.f29613i.i(this.f29475I2, ((GetEpisdoeDetailsCallback) this.f29647n3.get(iK2)).getSeriesId());
                            c2509z0 = this.f29613i;
                        } else if (C2966a.f() != null && C2966a.f().e() != null && currentPosition != -1 && currentPosition != 0) {
                            Log.i("elsePartIS", "ifHere");
                            int iK22 = K2(this.f29647n3, m7.w.r0(C2966a.f().e()));
                            getEpisdoeDetailsCallback = new GetEpisdoeDetailsCallback();
                            getEpisdoeDetailsCallback.setId(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK22)).getId());
                            getEpisdoeDetailsCallback.setTitle(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK22)).getTitle());
                            getEpisdoeDetailsCallback.setContainerExtension(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK22)).getContainerExtension());
                            getEpisdoeDetailsCallback.setAdded(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK22)).getAdded());
                            getEpisdoeDetailsCallback.setSeriesCover(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK22)).getSeriesCover());
                            getEpisdoeDetailsCallback.setCategoryId(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK22)).getCategoryId());
                            getEpisdoeDetailsCallback.setElapsed_time(String.valueOf(currentPosition));
                            getEpisdoeDetailsCallback.setSeriesId(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK22)).getSeriesId());
                            getEpisdoeDetailsCallback.setSeriesId(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK22)).getSeriesId());
                            getEpisdoeDetailsCallback.setImage(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK22)).getImage());
                            getEpisdoeDetailsCallback.setMovieImage(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK22)).getMovieImage());
                            getEpisdoeDetailsCallback.setMainSeriesImg(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK22)).getMainSeriesImg());
                            getEpisdoeDetailsCallback.setSeriesNum(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK22)).getSeriesNum());
                            getEpisdoeDetailsCallback.setSeasonNumber(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK22)).getSeasonNumber());
                            getEpisdoeDetailsCallback.setEpisodeNum(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK22)).getEpisodeNumber());
                            getEpisdoeDetailsCallback.setSeriesName(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK22)).getSeriesName());
                            this.f29456F1 = ((GetEpisdoeDetailsCallback) this.f29647n3.get(iK22)).getCategoryId();
                            this.f29462G1 = ((GetEpisdoeDetailsCallback) this.f29647n3.get(iK22)).getSeriesName();
                            I1 i14 = this.f29667r;
                            getEpisdoeDetailsCallback.setDurationSec(i14 != null ? String.valueOf(((int) i14.getDuration()) / 1000) : ((GetEpisdoeDetailsCallback) this.f29647n3.get(iK22)).getDurationSec());
                            this.f29613i.b(((GetEpisdoeDetailsCallback) this.f29647n3.get(iK22)).getId());
                            this.f29613i.i(this.f29475I2, ((GetEpisdoeDetailsCallback) this.f29647n3.get(iK22)).getSeriesId());
                            c2509z0 = this.f29613i;
                        }
                        c2509z0.g(this.f29475I2, getEpisdoeDetailsCallback);
                    } catch (Exception unused2) {
                    }
                }
            }
            ArrayList<GetEpisdoeDetailsCallback> allSeriesRecentWatch = this.f29540T2.getAllSeriesRecentWatch("getalldata");
            for (int i9 = 0; i9 < this.f29647n3.size(); i9++) {
                if (((GetEpisdoeDetailsCallback) this.f29647n3.get(i9)).getSeasonNumber().equals(Integer.valueOf(this.f29583c4))) {
                    GetEpisdoeDetailsCallback getEpisdoeDetailsCallback2 = (GetEpisdoeDetailsCallback) this.f29647n3.get(i9);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= allSeriesRecentWatch.size()) {
                            break;
                        }
                        if (((GetEpisdoeDetailsCallback) this.f29647n3.get(i9)).getId().equals(allSeriesRecentWatch.get(i10).getId())) {
                            getEpisdoeDetailsCallback2.setElapsed_time(allSeriesRecentWatch.get(i10).getElapsed_time());
                            try {
                                iRound = Math.round(Integer.parseInt(allSeriesRecentWatch.get(i10).getElapsed_time()) / 1000.0f);
                                try {
                                    iR0 = (!getEpisdoeDetailsCallback2.getDurationSec().equals("") || (i12 = this.f29667r) == null) ? m7.w.r0(getEpisdoeDetailsCallback2.getDurationSec()) : ((int) i12.getDuration()) / 1000;
                                } catch (Exception unused3) {
                                    iR0 = 0;
                                }
                            } catch (Exception unused4) {
                                iRound = 0;
                            }
                            try {
                                iRound2 = Math.round((iRound / iR0) * 100.0f);
                            } catch (Exception unused5) {
                                iRound2 = 0;
                            }
                            getEpisdoeDetailsCallback2.setEpisode_watched_percentage(iRound2);
                        } else {
                            i10++;
                        }
                    }
                    this.f29457F2.add(getEpisdoeDetailsCallback2);
                }
            }
        }
    }

    public void A3() {
        if (f29418V4 || x2() || this.f29631l.getVisibility() != 8) {
            return;
        }
        this.f29631l.startAnimation(this.f29601g);
        this.f29631l.setVisibility(0);
        if (this.f29466H.getVisibility() == 8) {
            this.f29466H.startAnimation(this.f29601g);
            this.f29466H.setVisibility(0);
        }
        if (this.f29515P0.getVisibility() == 8) {
            this.f29515P0.startAnimation(this.f29601g);
            this.f29515P0.setVisibility(0);
        }
        if (this.f29478J.getVisibility() == 8) {
            this.f29478J.startAnimation(this.f29601g);
            this.f29478J.setVisibility(0);
        }
        if (this.f29521Q0.getVisibility() == 8) {
            this.f29521Q0.startAnimation(this.f29601g);
            this.f29521Q0.setVisibility(0);
        }
        if (this.f29472I.getVisibility() == 8) {
            this.f29472I.startAnimation(this.f29601g);
            this.f29472I.setVisibility(0);
        }
    }

    public final void B2() {
        if (this.f29519P4 <= 5) {
            Toast.makeText(this, "Api Error, reconnects in 3sec(" + this.f29519P4 + "/5) ", 0).show();
        }
        this.f29519P4++;
        new Handler().postDelayed(new RunnableC1434h(), 3000L);
    }

    public final void B3(int i9) {
        C3(getString(i9));
    }

    public void C2(boolean z9) {
        String string;
        Log.e("calling:", "vipserbver");
        f29423a5.setVisibility(0);
        TextView textView = (TextView) ((LayoutInflater) getSystemService("layout_inflater")).inflate(g.f12855p2, (ViewGroup) findViewById(f.ih)).findViewById(f.Yg);
        new C2305a().c(C2305a.EnumC0402a.BASIC);
        OkHttpClient okHttpClient = new OkHttpClient();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        okHttpClient.setConnectTimeout(15L, timeUnit);
        okHttpClient.setReadTimeout(15L, timeUnit);
        MediaType mediaType = MediaType.parse("application/json");
        Log.e("comingfileid", String.valueOf(this.f29652o2));
        try {
            com.squareup.okhttp.Response responseExecute = okHttpClient.newCall(new Request.Builder().url("https://api.opensubtitles.com/api/v1/download").post(RequestBody.create(mediaType, "{\n  \"file_id\":" + this.f29652o2 + "\n}")).addHeader("User-Agent", "IPTVSmartersPlayer").addHeader("Accept", "application/json").addHeader("Api-Key", "ZCyXegBRifdfqktSPAiyrtlpknf2RBrL").addHeader("Content-Type", "application/json").addHeader("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJrVzBLUlE1S3FiT08wZXpQS0NOazBOY1dWU1BvcmlONiIsImV4cCI6MTcwMDkwMTcwN30.VPitYBEcXa-iFREzVDtyDxJZlmSjDKeh0iWIUltJtFM").build()).execute();
            if (responseExecute.body() != null) {
                String strString = responseExecute.body().string();
                try {
                    JSONObject jSONObject = new JSONObject(strString);
                    Log.e("vipserverrespnse", strString);
                    try {
                        if (jSONObject.getString("link") != null) {
                            Log.e("vipserverrespnse", this.f29720z4);
                            if (!this.f29720z4.isEmpty()) {
                                Log.e("TAG1:", this.f29720z4);
                                r2(Uri.parse(this.f29720z4));
                                return;
                            } else {
                                Log.e("TAG1:", this.f29720z4);
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
                        if (this.f29519P4 <= 5) {
                            B2();
                        } else {
                            textView.setText((jSONObject.getString("message") == null || jSONObject.getString("message").isEmpty()) ? String.valueOf(e9) : jSONObject.getString("message"));
                        }
                        Log.e("TAG2:", String.valueOf(e9));
                    }
                } catch (JSONException e10) {
                    if (this.f29519P4 <= 5) {
                        B2();
                    } else {
                        textView.setText(String.valueOf(e10));
                    }
                    e10.printStackTrace();
                }
            }
        } catch (IOException e11) {
            if (this.f29519P4 <= 5) {
                B2();
            } else {
                textView.setText(String.valueOf(e11));
            }
            Log.e("TAG4:", String.valueOf(e11));
            e11.printStackTrace();
        }
    }

    public final void C3(String str) {
        Toast.makeText(getApplicationContext(), str, 1).show();
    }

    public final void D2(String str) {
        this.f29545U2.deleteMovieRecentWatch(str);
    }

    public final void D3() {
        try {
            if (this.f29654o4 || !com.nst.iptvsmarterstvbox.view.demo.b.b0(this.f29667r)) {
                return;
            }
            this.f29654o4 = true;
            com.nst.iptvsmarterstvbox.view.demo.b.P(this.f29667r, new DialogInterface.OnDismissListener() { // from class: p7.w
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f46675a.W2(dialogInterface);
                }
            }).show(getSupportFragmentManager(), (String) null);
        } catch (Exception unused) {
        }
    }

    public void E3() {
        Handler handler;
        if (f29418V4 || x2() || (handler = this.f29616i2.f25865u) == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    public final void F2() {
        ImageView imageView = this.f29674s0;
        imageView.setOnFocusChangeListener(new E(imageView));
        ImageView imageView2 = this.f29680t0;
        imageView2.setOnFocusChangeListener(new E(imageView2));
        this.f29628k2.setOnFocusChangeListener(new E(this.f29442D));
        ImageView imageView3 = this.f29662q0;
        imageView3.setOnFocusChangeListener(new E(imageView3));
        SeekBar seekBar = this.f29437C0;
        seekBar.setOnFocusChangeListener(new E(seekBar));
        ImageView imageView4 = this.f29668r0;
        imageView4.setOnFocusChangeListener(new E(imageView4));
        ImageView imageView5 = this.f29425A0;
        imageView5.setOnFocusChangeListener(new E(imageView5));
        LinearLayout linearLayout = this.f29430B;
        linearLayout.setOnFocusChangeListener(new E(linearLayout));
        LinearLayout linearLayout2 = this.f29436C;
        linearLayout2.setOnFocusChangeListener(new E(linearLayout2));
        LinearLayout linearLayout3 = this.f29442D;
        linearLayout3.setOnFocusChangeListener(new E(linearLayout3));
        LinearLayout linearLayout4 = this.f29448E;
        linearLayout4.setOnFocusChangeListener(new E(linearLayout4));
        ImageView imageView6 = this.f29686u0;
        imageView6.setOnFocusChangeListener(new E(imageView6));
        ImageView imageView7 = this.f29692v0;
        imageView7.setOnFocusChangeListener(new E(imageView7));
        ImageView imageView8 = this.f29698w0;
        imageView8.setOnFocusChangeListener(new E(imageView8));
        ImageView imageView9 = this.f29698w0;
        imageView9.setOnFocusChangeListener(new E(imageView9));
        TextView textView = this.f29558X0;
        textView.setOnFocusChangeListener(new E(textView));
        TextView textView2 = this.f29568Z0;
        textView2.setOnFocusChangeListener(new E(textView2));
        RelativeLayout relativeLayout = this.f29644n0;
        relativeLayout.setOnFocusChangeListener(new E(relativeLayout));
        ImageView imageView10 = this.f29431B0;
        imageView10.setOnFocusChangeListener(new E(imageView10));
        LinearLayout linearLayout5 = this.f29557X;
        linearLayout5.setOnFocusChangeListener(new E(linearLayout5));
        LinearLayout linearLayout6 = this.f29562Y;
        linearLayout6.setOnFocusChangeListener(new E(linearLayout6));
        CheckBox checkBox = this.f29663q1;
        checkBox.setOnFocusChangeListener(new E(checkBox));
        CheckBox checkBox2 = this.f29669r1;
        checkBox2.setOnFocusChangeListener(new E(checkBox2));
        CheckBox checkBox3 = this.f29675s1;
        checkBox3.setOnFocusChangeListener(new E(checkBox3));
        CheckBox checkBox4 = this.f29681t1;
        checkBox4.setOnFocusChangeListener(new E(checkBox4));
        LinearLayout linearLayout7 = this.f29567Z;
        linearLayout7.setOnFocusChangeListener(new E(linearLayout7));
        CheckBox checkBox5 = this.f29687u1;
        checkBox5.setOnFocusChangeListener(new E(checkBox5));
        CheckBox checkBox6 = this.f29693v1;
        checkBox6.setOnFocusChangeListener(new E(checkBox6));
        CheckBox checkBox7 = this.f29699w1;
        checkBox7.setOnFocusChangeListener(new E(checkBox7));
        CheckBox checkBox8 = this.f29705x1;
        checkBox8.setOnFocusChangeListener(new E(checkBox8));
        CheckBox checkBox9 = this.f29711y1;
        checkBox9.setOnFocusChangeListener(new E(checkBox9));
        LinearLayout linearLayout8 = this.f29590e0;
        linearLayout8.setOnFocusChangeListener(new E(linearLayout8));
        LinearLayout linearLayout9 = this.f29596f0;
        linearLayout9.setOnFocusChangeListener(new E(linearLayout9));
        CheckBox checkBox10 = this.f29717z1;
        checkBox10.setOnFocusChangeListener(new E(checkBox10));
        CheckBox checkBox11 = this.f29426A1;
        checkBox11.setOnFocusChangeListener(new E(checkBox11));
        CheckBox checkBox12 = this.f29432B1;
        checkBox12.setOnFocusChangeListener(new E(checkBox12));
        CheckBox checkBox13 = this.f29438C1;
        checkBox13.setOnFocusChangeListener(new E(checkBox13));
        EditText editText = this.f29444D1;
        editText.setOnFocusChangeListener(new E(editText));
        TextView textView3 = this.f29576b1;
        textView3.setOnFocusChangeListener(new E(textView3));
    }

    public void F3() {
        Handler handler = this.f29643n;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        RelativeLayout relativeLayout = this.f29656p0;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }

    public final int G3(int i9, int i10) {
        return this.f29545U2.isStreamAvailable(String.valueOf(i9), i10);
    }

    public void H2() {
        if (this.f29552W.getVisibility() == 0) {
            this.f29557X.setNextFocusRightId(f.f12190K3);
            this.f29562Y.setNextFocusRightId(f.f12383e2);
            this.f29567Z.setNextFocusRightId(f.f12342a2);
            this.f29590e0.setNextFocusRightId(f.f12296V1);
        }
    }

    public final int H3(String str, int i9) {
        return this.f29522Q1.isStreamAvailable(str, i9);
    }

    public int I2(ArrayList arrayList, int i9) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (m7.w.r0(((LiveStreamsDBModel) arrayList.get(i10)).getStreamId()) == i9) {
                return i10;
            }
        }
        return 0;
    }

    public final int I3(String str, int i9) {
        return this.f29545U2.isStreamAvailable(str, i9);
    }

    public int J2(ArrayList arrayList, String str) {
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (((LiveStreamsDBModel) arrayList.get(i9)).getStreamIdOneStream().equals(str)) {
                return i9;
            }
        }
        return 0;
    }

    public String J3(int i9) {
        int i10 = i9 / 1000;
        int i11 = i10 % 60;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 / 3600;
        try {
            this.f29673s.setLength(0);
            return i13 > 0 ? this.f29679t.format("%d:%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i12), Integer.valueOf(i11)).toString() : this.f29679t.format("%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i11)).toString();
        } catch (Exception unused) {
            return this.f29679t.format("%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i11)).toString();
        }
    }

    public int K2(List list, int i9) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (m7.w.r0(((GetEpisdoeDetailsCallback) list.get(i10)).getId()) == i9) {
                return i10;
            }
        }
        return 0;
    }

    public final void K3(boolean z9) {
        LayoutInflater layoutInflaterFrom;
        int i9;
        this.f29477I4 = false;
        f29423a5.setVisibility(0);
        this.f29634l2.setVisibility(8);
        if (z9) {
            this.f29471H4 = 0;
            LayoutInflater layoutInflater = (LayoutInflater) getSystemService("layout_inflater");
            this.f29483J4 = layoutInflater;
            View viewInflate = layoutInflater.inflate(g.f12855p2, (ViewGroup) findViewById(f.ih));
            this.f29489K4 = viewInflate;
            this.f29495L4 = (TextView) viewInflate.findViewById(f.Yg);
            AlertDialog.Builder builder = new AlertDialog.Builder(this, a7.k.f13456a);
            if (this.f29550V2.A().equals(AbstractC2237a.f44453K0)) {
                layoutInflaterFrom = LayoutInflater.from(getApplicationContext());
                i9 = g.f12769b3;
            } else {
                layoutInflaterFrom = LayoutInflater.from(getApplicationContext());
                i9 = g.f12762a3;
            }
            View viewInflate2 = layoutInflaterFrom.inflate(i9, (ViewGroup) null);
            this.f29501M4 = (ProgressBar) viewInflate2.findViewById(f.Nc);
            this.f29507N4 = (RecyclerView) viewInflate2.findViewById(f.Dd);
            ((ImageView) viewInflate2.findViewById(f.f12453l2)).setOnClickListener(new ViewOnClickListenerC1432f());
            TextView textView = (TextView) viewInflate2.findViewById(f.f12315X2);
            this.f29513O4 = textView;
            textView.setVisibility(8);
            this.f29714y4 = new ArrayList();
            this.f29513O4.setVisibility(8);
            builder.setView(viewInflate2);
            this.f29447D4 = builder.create();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(this.f29447D4.getWindow().getAttributes());
            layoutParams.width = -2;
            layoutParams.height = -2;
            new Rect();
            this.f29447D4.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            this.f29447D4.getWindow().setAttributes(layoutParams);
            this.f29447D4.setCancelable(true);
            this.f29447D4.show();
        }
        OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        okhttp3.OkHttpClient okHttpClientBuild = builder2.connectTimeout(60L, timeUnit).readTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).build();
        Log.e("jaskirat", "tmdb_id" + this.f29646n2);
        AbstractC2074a.a("https://api.opensubtitles.com/api/v1/subtitles?tmdb_id=" + this.f29646n2).p("User-Agent", "IPTVSmartersPlayer").p("Accept", "application/json").p("Api-Key", "ZCyXegBRifdfqktSPAiyrtlpknf2RBrL").p("Content-Type", "application/json").p("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJrVzBLUlE1S3FiT08wZXpQS0NOazBOY1dWU1BvcmlONiIsImV4cCI6MTcwMDkwMTcwN30.VPitYBEcXa-iFREzVDtyDxJZlmSjDKeh0iWIUltJtFM").t("test").r(okHttpClientBuild).s(k1.e.LOW).q().o(new C1433g());
    }

    public int L2(List list, String str) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (((GetEpisdoeDetailsCallback) list.get(i9)).getId().equals(str)) {
                return i9;
            }
        }
        return 0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void L3() {
        int i9;
        CharSequence[] charSequenceArr = {"10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38", "40"};
        a.C0158a c0158a = new a.C0158a(this);
        c0158a.setTitle(getResources().getString(a7.j.f13121R7));
        String string = this.f29476I3.getString("pref.using_sub_font_size", AbstractC2237a.f44547x0);
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
        c0158a.l(charSequenceArr, i9, new DialogInterfaceOnClickListenerC1427a());
        try {
            androidx.appcompat.app.a aVarCreate = c0158a.create();
            this.f29606g4 = aVarCreate;
            aVarCreate.setOnDismissListener(new DialogInterfaceOnDismissListenerC1428b());
            this.f29606g4.show();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0453  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M2(int r22, int r23, int r24, int r25, java.util.ArrayList r26, java.lang.String r27, java.util.List r28, java.lang.Object r29, boolean r30, java.lang.String r31) {
        /*
            Method dump skipped, instruction units count: 3370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries.M2(int, int, int, int, java.util.ArrayList, java.lang.String, java.util.List, java.lang.Object, boolean, java.lang.String):void");
    }

    public final void M3(String str) {
        try {
            SharedPreferences sharedPreferences = getSharedPreferences("pref.using_sub_font_size", 0);
            this.f29476I3 = sharedPreferences;
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            this.f29482J3 = editorEdit;
            if (editorEdit != null) {
                editorEdit.putString("pref.using_sub_font_size", str);
                this.f29482J3.apply();
            }
        } catch (Exception unused) {
        }
    }

    public final ArrayList N2(int i9, int i10) {
        return this.f29545U2.getStreamStatus(String.valueOf(i9), i10);
    }

    public final void N3() {
        this.f29628k2.setVisibility(0);
        this.f29628k2.requestFocus();
        this.f29634l2.setVisibility(0);
    }

    public final LiveStreamsDBModel O2(String str, int i9) {
        return this.f29522Q1.getStreamStatus(str, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int O3() {
        /*
            r6 = this;
            int r0 = r6.f29700w2
            r1 = 1
            int r0 = r0 + r1
            r6.f29700w2 = r0
            java.lang.String r0 = "loginPrefs"
            r2 = 0
            android.content.SharedPreferences r0 = r6.getSharedPreferences(r0, r2)
            r6.f29685u = r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r6.f29691v = r0
            int r0 = r6.f29700w2
            int[] r3 = com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries.f29415S4
            int r4 = r3.length
            int r0 = r0 % r4
            r6.f29700w2 = r0
            r0 = r3[r0]
            r6.f29706x2 = r0
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
            int r5 = r6.f29706x2
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "aspectRatioIS"
            android.util.Log.i(r5, r4)
            com.google.android.exoplayer2.ui.PlayerView r4 = r6.f29616i2
            int r5 = r6.f29706x2
            r4.setResizeMode(r5)
            int r4 = r6.f29700w2
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
            android.content.SharedPreferences$Editor r1 = r6.f29691v
            java.lang.String r3 = "aspect_ratio"
            int r4 = r6.f29700w2
            r1.putInt(r3, r4)
            android.content.SharedPreferences$Editor r1 = r6.f29691v
            r1.apply()
            r0.setVisibility(r2)
            android.widget.LinearLayout r1 = r6.f29478J
            if (r1 == 0) goto Lad
            int r1 = r1.getVisibility()
            if (r1 != 0) goto Lad
            android.widget.LinearLayout r1 = r6.f29478J
            r2 = 8
            r1.setVisibility(r2)
        Lad:
            android.os.Handler r1 = r6.f29712y2
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            android.os.Handler r1 = r6.f29712y2
            com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries$r r2 = new com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries$r
            r2.<init>(r0)
            r3 = 3000(0xbb8, double:1.482E-320)
            r1.postDelayed(r2, r3)
            int r0 = r6.f29706x2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries.O3():int");
    }

    public final ArrayList P2(String str, int i9) {
        return this.f29545U2.getStreamStatus(String.valueOf(str), i9);
    }

    public final void P3() {
        E3();
        if (this.f29634l2.getVisibility() == 0) {
            this.f29634l2.setVisibility(8);
        }
        if (this.f29631l.getVisibility() == 0) {
            R2();
            return;
        }
        z3();
        u2(5000);
        v2(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
    }

    public final void Q3() {
        LinearLayout linearLayout = this.f29595f;
        if (linearLayout != null) {
            linearLayout.setClickable(true);
            this.f29595f.setOnTouchListener(new q());
        }
    }

    public final void R2() {
        if (this.f29631l.getVisibility() == 0) {
            this.f29631l.startAnimation(this.f29607h);
            if (this.f29466H.getVisibility() == 0) {
                this.f29466H.startAnimation(this.f29607h);
            }
            if (this.f29515P0.getVisibility() == 0) {
                this.f29515P0.startAnimation(this.f29607h);
            }
            if (this.f29478J.getVisibility() == 0) {
                this.f29478J.startAnimation(this.f29607h);
            }
            if (this.f29521Q0.getVisibility() == 0) {
                this.f29521Q0.startAnimation(this.f29607h);
            }
            if (this.f29472I.getVisibility() == 0) {
                this.f29472I.startAnimation(this.f29607h);
            }
            this.f29631l.setVisibility(8);
            if (this.f29466H.getVisibility() == 0) {
                this.f29466H.setVisibility(8);
            }
            if (this.f29515P0.getVisibility() == 0) {
                this.f29515P0.setVisibility(8);
            }
            if (this.f29478J.getVisibility() == 0) {
                this.f29478J.setVisibility(8);
            }
            if (this.f29521Q0.getVisibility() == 0) {
                this.f29521Q0.setVisibility(8);
            }
            if (this.f29472I.getVisibility() == 0) {
                this.f29472I.setVisibility(8);
            }
        }
    }

    public final void R3() {
    }

    public void S2() {
        if (this.f29667r != null) {
            T2();
            this.f29452E3.removeMessages(1);
        }
        if (!f29418V4 && this.f29631l.getVisibility() == 0) {
            this.f29631l.startAnimation(this.f29607h);
            if (this.f29466H.getVisibility() == 0) {
                this.f29466H.startAnimation(this.f29607h);
            }
            if (this.f29515P0.getVisibility() == 0) {
                this.f29515P0.startAnimation(this.f29607h);
            }
            if (this.f29478J.getVisibility() == 0) {
                this.f29478J.startAnimation(this.f29607h);
            }
            if (this.f29521Q0.getVisibility() == 0) {
                this.f29521Q0.startAnimation(this.f29607h);
            }
            if (this.f29472I.getVisibility() == 0) {
                this.f29472I.startAnimation(this.f29607h);
            }
            this.f29631l.setVisibility(8);
            if (this.f29466H.getVisibility() == 0) {
                this.f29466H.setVisibility(8);
            }
            if (this.f29515P0.getVisibility() == 0) {
                this.f29515P0.setVisibility(8);
            }
            if (this.f29478J.getVisibility() == 0) {
                this.f29478J.setVisibility(8);
            }
            if (this.f29521Q0.getVisibility() == 0) {
                this.f29521Q0.setVisibility(8);
            }
            if (this.f29472I.getVisibility() == 0) {
                this.f29472I.setVisibility(8);
            }
        }
        if (this.f29667r != null) {
            T2();
            this.f29452E3.removeMessages(1);
        }
        if (f29418V4 || this.f29631l.getVisibility() != 0) {
            return;
        }
        this.f29631l.startAnimation(this.f29607h);
        if (this.f29466H.getVisibility() == 0) {
            this.f29466H.startAnimation(this.f29607h);
        }
        if (this.f29515P0.getVisibility() == 0) {
            this.f29515P0.startAnimation(this.f29607h);
        }
        if (this.f29478J.getVisibility() == 0) {
            this.f29478J.startAnimation(this.f29607h);
        }
        if (this.f29521Q0.getVisibility() == 0) {
            this.f29521Q0.startAnimation(this.f29607h);
        }
        if (this.f29472I.getVisibility() == 0) {
            this.f29472I.startAnimation(this.f29607h);
        }
        this.f29631l.setVisibility(8);
        if (this.f29466H.getVisibility() == 0) {
            this.f29466H.setVisibility(8);
        }
        if (this.f29515P0.getVisibility() == 0) {
            this.f29515P0.setVisibility(8);
        }
        if (this.f29478J.getVisibility() == 0) {
            this.f29478J.setVisibility(8);
        }
        if (this.f29521Q0.getVisibility() == 0) {
            this.f29521Q0.setVisibility(8);
        }
        if (this.f29472I.getVisibility() == 0) {
            this.f29472I.setVisibility(8);
        }
    }

    public void S3(int i9, String str, int i10, int i11) {
        try {
            if (this.f29637m.equals("mobile") && this.f29624j4 && this.f29648n4) {
                ArrayList arrayList = new ArrayList();
                PendingIntent broadcast = PendingIntent.getBroadcast(this, i11, new Intent("media_control").putExtra("control_type", i10), 67108864);
                Icon iconCreateWithResource = Icon.createWithResource(this, i9);
                AbstractC2498u.a();
                arrayList.add(AbstractC2496t.a(iconCreateWithResource, str, str, broadcast));
                this.f29630k4.setActions(arrayList);
                setPictureInPictureParams(this.f29630k4.build());
            }
        } catch (Exception unused) {
        }
    }

    public final void T3() {
        I1 i12 = this.f29667r;
        if (i12 != null) {
            this.f29684t4 = i12.E();
            this.f29690u4 = this.f29667r.l0();
            this.f29696v4 = Math.max(0L, this.f29667r.R());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0084, code lost:
    
        r16 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0091, code lost:
    
        r16 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009e, code lost:
    
        r16 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0080, code lost:
    
        r16 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0198 A[PHI: r17
      0x0198: PHI (r17v6 android.content.Intent) = 
      (r17v5 android.content.Intent)
      (r17v5 android.content.Intent)
      (r17v5 android.content.Intent)
      (r17v5 android.content.Intent)
      (r17v5 android.content.Intent)
      (r17v7 android.content.Intent)
     binds: [B:70:0x01bc, B:72:0x01c2, B:74:0x01ca, B:76:0x01d4, B:67:0x01b7, B:57:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0082 A[PHI: r16
      0x0082: PHI (r16v8 java.lang.String) = (r16v4 java.lang.String), (r16v5 java.lang.String), (r16v6 java.lang.String), (r16v9 java.lang.String) binds: [B:19:0x00a6, B:15:0x0099, B:11:0x008c, B:8:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean U2() {
        /*
            Method dump skipped, instruction units count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries.U2():boolean");
    }

    public final void U3() {
        Z3.m mVar = this.f29666q4;
        if (mVar != null) {
            this.f29672r4 = mVar.c();
        }
    }

    public final void V2() {
        this.f29643n = new Handler();
        this.f29523Q2 = new Handler();
        this.f29481J2 = AnimationUtils.loadAnimation(this.f29475I2, a7.b.f11839q);
        this.f29487K2 = AnimationUtils.loadAnimation(this.f29475I2, a7.b.f11840r);
        this.f29601g = AnimationUtils.loadAnimation(this.f29475I2, a7.b.f11830h);
        this.f29607h = AnimationUtils.loadAnimation(this.f29475I2, a7.b.f11831i);
        this.f29517P2 = AnimationUtils.loadAnimation(this.f29475I2, a7.b.f11837o);
        this.f29511O2 = AnimationUtils.loadAnimation(this.f29475I2, a7.b.f11836n);
        this.f29499M2 = AnimationUtils.loadAnimation(this.f29475I2, a7.b.f11841s);
        this.f29505N2 = AnimationUtils.loadAnimation(this.f29475I2, a7.b.f11842t);
        this.f29493L2 = AnimationUtils.loadAnimation(this.f29475I2, a7.b.f11838p);
        this.f29702w4 = AnimationUtils.loadAnimation(this.f29475I2, a7.b.f11833k);
        try {
            x3();
        } catch (Exception unused) {
        }
        if (this.f29637m.equals("mobile")) {
            try {
                C2325b c2325bE = C2325b.e(this);
                this.f29556W3 = c2325bE;
                this.f29551V3 = c2325bE.c().c();
                AbstractC2324a.b(getApplicationContext(), this.f29651o1);
            } catch (Exception unused2) {
            }
        }
    }

    public void V3(boolean z9) {
        if (z9) {
            this.f29435B4 = 0;
            f29423a5.setVisibility(0);
            View viewInflate = ((LayoutInflater) this.f29475I2.getSystemService("layout_inflater")).inflate(g.f12855p2, (ViewGroup) findViewById(f.ih));
            this.f29531R4 = viewInflate;
            this.f29525Q4 = (TextView) viewInflate.findViewById(f.Yg);
        }
        new C2305a().c(C2305a.EnumC0402a.BASIC);
        com.squareup.okhttp.OkHttpClient okHttpClient = new com.squareup.okhttp.OkHttpClient();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        okHttpClient.setConnectTimeout(60L, timeUnit);
        okHttpClient.setReadTimeout(60L, timeUnit);
        MediaType mediaType = MediaType.parse("application/json");
        Log.e("comingfileid", String.valueOf(this.f29652o2));
        try {
            com.squareup.okhttp.Response responseExecute = okHttpClient.newCall(new Request.Builder().url("https://vip-api.opensubtitles.com/api/v1/download").post(RequestBody.create(mediaType, "{\n  \"file_id\":" + this.f29652o2 + "\n}")).addHeader("User-Agent", "IPTVSmartersPlayer").addHeader("Accept", "application/json").addHeader("Api-Key", "ZCyXegBRifdfqktSPAiyrtlpknf2RBrL").addHeader("Content-Type", "application/json").addHeader("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJrVzBLUlE1S3FiT08wZXpQS0NOazBOY1dWU1BvcmlONiIsImV4cCI6MTcwMDkwMTcwN30.VPitYBEcXa-iFREzVDtyDxJZlmSjDKeh0iWIUltJtFM").build()).execute();
            if (responseExecute == null || responseExecute.body() == null) {
                if (this.f29435B4 < 5) {
                    p3();
                    return;
                }
                return;
            }
            String strString = responseExecute.body().string();
            try {
                JSONObject jSONObject = new JSONObject(strString);
                Log.e("vipserverrespnse", strString);
                try {
                    String string = jSONObject.getString("link");
                    this.f29720z4 = string;
                    r2(Uri.parse(string));
                } catch (Exception e9) {
                    if (this.f29435B4 <= 5) {
                        p3();
                    } else if (jSONObject.getString("message") == null || jSONObject.getString("message").isEmpty()) {
                        this.f29525Q4.setText(String.valueOf(e9));
                    } else {
                        this.f29525Q4.setText(jSONObject.getString("message"));
                    }
                    e9.printStackTrace();
                }
            } catch (JSONException e10) {
                if (this.f29435B4 < 5) {
                    p3();
                } else {
                    this.f29525Q4.setText(String.valueOf(e10));
                }
                e10.printStackTrace();
            }
        } catch (IOException e11) {
            if (this.f29435B4 < 5) {
                p3();
            } else {
                this.f29525Q4.setText(String.valueOf(e11));
            }
            e11.printStackTrace();
        }
    }

    public final /* synthetic */ void W2(DialogInterface dialogInterface) {
        this.f29654o4 = false;
    }

    public final void X2(int i9, int i10, int i11, int i12, ArrayList arrayList, String str, List list, boolean z9, String str2) {
        Object obj;
        boolean z10;
        ArrayList arrayList2;
        String str3;
        ExoPlayerMoviesSeries exoPlayerMoviesSeries;
        int i13;
        int i14;
        int i15;
        int i16;
        List list2;
        if (Listsingleton.b().a() == null || Listsingleton.b().a().size() <= 0) {
            if (str.equals("movies")) {
                obj = null;
                z10 = false;
                str3 = "movies";
                list2 = null;
                exoPlayerMoviesSeries = this;
                i13 = i9;
                i14 = i10;
                i15 = i11;
                i16 = i12;
                arrayList2 = arrayList;
            } else {
                if (!str.equals("series")) {
                    return;
                }
                obj = null;
                z10 = true;
                arrayList2 = null;
                str3 = "series";
                exoPlayerMoviesSeries = this;
                i13 = i9;
                i14 = i10;
                i15 = i11;
                i16 = i12;
                list2 = list;
            }
            exoPlayerMoviesSeries.M2(i13, i14, i15, i16, arrayList2, str3, list2, obj, z10, str2);
            return;
        }
        List listA = Listsingleton.b().a();
        Dialog dialog = new Dialog(this, a7.k.f13462g);
        dialog.requestWindowFeature(1);
        dialog.setContentView(g.f12682N1);
        dialog.getWindow().setBackgroundDrawable(null);
        dialog.getWindow().setLayout(-1, -2);
        dialog.setCancelable(false);
        ImageView imageView = (ImageView) dialog.findViewById(f.f12201L4);
        ImageView imageView2 = (ImageView) dialog.findViewById(f.f12308W4);
        this.f29697w = (LinearLayout) dialog.findViewById(f.f12114C7);
        if (imageView.getVisibility() == 0) {
            this.f29631l.setVisibility(8);
        } else {
            this.f29631l.setVisibility(0);
        }
        imageView2.setOnClickListener(new u(dialog, i9, i10, i11, i12, arrayList, str, list, str2));
        this.f29697w.setOnClickListener(new v(dialog, i9, i10, i11, i12, arrayList, str, list, str2));
        imageView2.setOnFocusChangeListener(new w.k((View) imageView2, (Activity) this));
        imageView2.setOnFocusChangeListener(new k(imageView2));
        imageView2.setNextFocusUpId(f.f12308W4);
        imageView2.setNextFocusDownId(f.f12308W4);
        imageView2.setNextFocusRightId(f.f12308W4);
        imageView2.setNextFocusLeftId(f.f12308W4);
        imageView2.requestFocus();
        if (listA != null) {
            try {
                if (listA.size() > 0) {
                    if (listA.size() > AbstractC2237a.f44516k1) {
                        com.squareup.picasso.t.q(this.f29475I2).l((String) listA.get(AbstractC2237a.f44516k1)).g(imageView);
                        AbstractC2237a.f44516k1++;
                    } else {
                        com.squareup.picasso.t.q(this.f29475I2).l((String) listA.get(0)).g(imageView);
                        AbstractC2237a.f44516k1 = 1;
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        dialog.show();
        imageView2.requestFocus();
        dialog.getWindow().setBackgroundDrawableResource(a7.c.f11875z);
    }

    public void Y2() {
        if (this.f29616i2 == null) {
            return;
        }
        v2(0);
        int i9 = Build.VERSION.SDK_INT;
        Rational rational = new Rational(this.f29616i2.getWidth(), this.f29616i2.getHeight());
        Log.i("aspectRatioIS", "ratio:" + rational);
        if (i9 >= 26) {
            try {
                this.f29630k4.setAspectRatio(rational).build();
                enterPictureInPictureMode(this.f29630k4.build());
                Log.i("calledPictureIN", "calledTry");
            } catch (Exception e9) {
                System.out.println(e9.getMessage());
                Log.i("calledPictureIN", "calledCatch" + e9.toString());
                try {
                    this.f29630k4.setAspectRatio(new Rational(547, 307)).build();
                    enterPictureInPictureMode(this.f29630k4.build());
                } catch (Exception unused) {
                    System.out.println(e9.getMessage());
                }
            }
        }
    }

    public final void Z2() {
        int iD = C2966a.f().d();
        String str = this.f29577b2;
        str.hashCode();
        if (str.equals("series")) {
            Log.i("sizeIS", "size:" + this.f29647n3.size());
            List list = this.f29647n3;
            if (list != null && list.size() > 0 && iD == this.f29647n3.size() - 1) {
                Log.i("sizeIShere", "sizeIS:" + this.f29647n3.size());
                C2966a.f().w(0);
                return;
            }
        }
        C2966a.f().w(iD + 1);
    }

    public void a3(String str) {
        R2();
        this.f29446D3.b(f.f12146G).e();
        this.f29446D3.b(f.f12186K).c(str);
    }

    public final void b3(String str) {
        this.f29513O4.setVisibility(0);
        f29423a5.setVisibility(8);
        this.f29501M4.setVisibility(8);
        this.f29447D4.dismiss();
        this.f29495L4.setText(str);
        this.f29513O4.setText("No subtitles found");
    }

    public final void c3() {
        this.f29674s0.setOnClickListener(this);
        this.f29680t0.setOnClickListener(this);
        this.f29715z.setOnClickListener(this);
        this.f29662q0.setOnClickListener(this);
        this.f29628k2.setOnClickListener(this);
        this.f29610h2.setOnClickListener(this);
        this.f29633l1.setOnClickListener(this);
        this.f29437C0.setOnClickListener(this);
        this.f29424A.setOnClickListener(this);
        this.f29668r0.setOnClickListener(this);
        this.f29430B.setOnClickListener(this);
        this.f29436C.setOnClickListener(this);
        this.f29442D.setOnClickListener(this);
        this.f29448E.setOnClickListener(this);
        this.f29686u0.setOnClickListener(this);
        this.f29692v0.setOnClickListener(this);
        this.f29484K.setOnClickListener(this);
        this.f29704x0.setOnClickListener(this);
        this.f29425A0.setOnClickListener(this);
        this.f29515P0.setOnClickListener(this);
        this.f29521Q0.setOnClickListener(this);
        this.f29431B0.setOnClickListener(this);
        this.f29644n0.setOnClickListener(this);
        this.f29557X.setOnClickListener(this);
        this.f29562Y.setOnClickListener(this);
        this.f29567Z.setOnClickListener(this);
        this.f29590e0.setOnClickListener(this);
        this.f29596f0.setOnClickListener(this);
        this.f29580c1.setOnClickListener(this);
        this.f29542U.setOnClickListener(this);
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

    public final void d3() {
        I1 i12;
        try {
            if (!this.f29671r3.booleanValue() || (i12 = this.f29667r) == null) {
                return;
            }
            i12.play();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.appcompat.app.b, D.AbstractActivityC0525h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f29616i2.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e3(ArrayList arrayList, int i9) {
        String str;
        String str2;
        SharedPreferences.Editor editor;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        E3();
        z3();
        u2(5000);
        Log.i("openedStreamID", "id:" + i9);
        int iI2 = I2(arrayList, i9);
        String name = ((LiveStreamsDBModel) arrayList.get(iI2)).getName();
        this.f29571Z3 = ((LiveStreamsDBModel) arrayList.get(iI2)).getStreamIcon();
        this.f29566Y3 = name;
        this.f29579b4 = m7.w.r0(String.valueOf(((LiveStreamsDBModel) arrayList.get(iI2)).getMovieElapsedTime()));
        m7.w.S0(w7.k.a() + w7.k.i());
        ((LiveStreamsDBModel) arrayList.get(iI2)).getNum();
        int iQ0 = m7.w.q0(((LiveStreamsDBModel) arrayList.get(iI2)).getStreamId());
        int i10 = this.f29689u3;
        this.f29573a2 = ((LiveStreamsDBModel) arrayList.get(iI2)).getContaiinerExtension();
        ((LiveStreamsDBModel) arrayList.get(iI2)).getCategoryId();
        this.f29677s3 = m7.w.q0(((LiveStreamsDBModel) arrayList.get(iI2)).getStreamId());
        C2966a.f().w(iI2);
        this.f29456F1 = ((LiveStreamsDBModel) arrayList.get(iI2)).getCategoryId();
        this.f29462G1 = ((LiveStreamsDBModel) arrayList.get(iI2)).getName();
        int iH3 = this.f29629k3.equals("m3u") ? H3(String.valueOf(Uri.parse(this.f29529R2)), SharepreferenceDBHandler.getUserID(this.f29475I2)) : G3(iQ0, SharepreferenceDBHandler.getUserID(this.f29475I2));
        SharedPreferences.Editor editor2 = this.f29599f3;
        if (editor2 != null) {
            editor2.putString("currentlyPlayingVideo", String.valueOf(((LiveStreamsDBModel) arrayList.get(iI2)).getStreamId()));
            this.f29599f3.apply();
        }
        String str3 = this.f29577b2;
        if (str3 != null && str3.equals("movies") && (editor = this.f29599f3) != null) {
            editor.putString("currentlyPlayingVideo", String.valueOf(((LiveStreamsDBModel) arrayList.get(iI2)).getStreamId()));
            this.f29599f3.apply();
        }
        SharedPreferences.Editor editor3 = this.f29605g3;
        if (editor3 != null) {
            editor3.putString("currentlyPlayingVideoPosition", String.valueOf(iI2));
            this.f29605g3.apply();
        }
        SimpleDateFormat simpleDateFormat = this.f29528R1;
        if (E2(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(this.f29475I2))), this.f29539T1.format(this.f29534S1)) >= C2939c.p() && (str = this.f29554W1) != null && this.f29559X1 != null && (!f29419W4.equals(str) || (this.f29554W1 != null && (str2 = this.f29559X1) != null && !f29420X4.equals(str2)))) {
            this.f29671r3 = Boolean.FALSE;
        }
        this.f29659p3 = iQ0;
        this.f29548V0.setText(name);
        Log.i("streamCheck", "streamCHK:" + iH3);
        if (!AbstractC2237a.f44475V0.booleanValue() || !AbstractC2237a.f44498e1.equalsIgnoreCase("1")) {
            M2(i10, iH3, iI2, iQ0, arrayList, "movies", null, null, false, "");
        } else if (SharepreferenceDBHandler.getEventAdsView(this) < AbstractC2237a.f44501f1) {
            M2(i10, iH3, iI2, iQ0, arrayList, "movies", null, null, false, "");
            SharepreferenceDBHandler.setEventAdsView(SharepreferenceDBHandler.getEventAdsView(this) + 1, this);
        } else {
            SharepreferenceDBHandler.setEventAdsView(0, this);
            X2(i10, iH3, iI2, iQ0, arrayList, "movies", null, false, "");
        }
    }

    public final void f3(ArrayList arrayList, String str) {
        String str2;
        String str3;
        SharedPreferences.Editor editor;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        E3();
        z3();
        u2(5000);
        Log.i("openedStreamID", "id:" + str);
        int iJ2 = J2(arrayList, str);
        String name = ((LiveStreamsDBModel) arrayList.get(iJ2)).getName();
        this.f29571Z3 = ((LiveStreamsDBModel) arrayList.get(iJ2)).getStreamIcon();
        this.f29566Y3 = name;
        this.f29579b4 = m7.w.r0(String.valueOf(((LiveStreamsDBModel) arrayList.get(iJ2)).getMovieElapsedTime()));
        this.f29428A3 = ((LiveStreamsDBModel) arrayList.get(iJ2)).getUrl();
        m7.w.S0(w7.k.a() + w7.k.i());
        ((LiveStreamsDBModel) arrayList.get(iJ2)).getNum();
        String streamIdOneStream = ((LiveStreamsDBModel) arrayList.get(iJ2)).getStreamIdOneStream();
        int i9 = this.f29689u3;
        this.f29573a2 = ((LiveStreamsDBModel) arrayList.get(iJ2)).getContaiinerExtension();
        ((LiveStreamsDBModel) arrayList.get(iJ2)).getCategoryId();
        this.f29677s3 = m7.w.q0(((LiveStreamsDBModel) arrayList.get(iJ2)).getStreamId());
        C2966a.f().w(iJ2);
        this.f29456F1 = ((LiveStreamsDBModel) arrayList.get(iJ2)).getCategoryId();
        this.f29462G1 = ((LiveStreamsDBModel) arrayList.get(iJ2)).getName();
        int iI3 = I3(streamIdOneStream, SharepreferenceDBHandler.getUserID(this.f29475I2));
        SharedPreferences.Editor editor2 = this.f29599f3;
        if (editor2 != null) {
            editor2.putString("currentlyPlayingVideo", String.valueOf(((LiveStreamsDBModel) arrayList.get(iJ2)).getStreamId()));
            this.f29599f3.apply();
        }
        String str4 = this.f29577b2;
        if (str4 != null && str4.equals("movies") && (editor = this.f29599f3) != null) {
            editor.putString("currentlyPlayingVideo", String.valueOf(((LiveStreamsDBModel) arrayList.get(iJ2)).getStreamId()));
            this.f29599f3.apply();
        }
        SharedPreferences.Editor editor3 = this.f29605g3;
        if (editor3 != null) {
            editor3.putString("currentlyPlayingVideoPosition", String.valueOf(iJ2));
            this.f29605g3.apply();
        }
        SimpleDateFormat simpleDateFormat = this.f29528R1;
        if (E2(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(this.f29475I2))), this.f29539T1.format(this.f29534S1)) >= C2939c.p() && (str2 = this.f29554W1) != null && this.f29559X1 != null && (!f29419W4.equals(str2) || (this.f29554W1 != null && (str3 = this.f29559X1) != null && !f29420X4.equals(str3)))) {
            this.f29671r3 = Boolean.FALSE;
        }
        this.f29665q3 = streamIdOneStream;
        this.f29548V0.setText(name);
        Log.i("streamCheck", "streamCHK:" + iI3);
        if (!AbstractC2237a.f44475V0.booleanValue() || !AbstractC2237a.f44498e1.equalsIgnoreCase("1")) {
            M2(i9, iI3, iJ2, 0, arrayList, "movies", null, null, false, streamIdOneStream);
        } else if (SharepreferenceDBHandler.getEventAdsView(this) < AbstractC2237a.f44501f1) {
            M2(i9, iI3, iJ2, 0, arrayList, "movies", null, null, false, streamIdOneStream);
            SharepreferenceDBHandler.setEventAdsView(SharepreferenceDBHandler.getEventAdsView(this) + 1, this);
        } else {
            SharepreferenceDBHandler.setEventAdsView(0, this);
            X2(i9, iI3, iJ2, 0, arrayList, "movies", null, false, streamIdOneStream);
        }
    }

    public final void g3(ArrayList arrayList, int i9) {
        String str;
        String str2;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        String name = ((File) arrayList.get(i9)).getName();
        String strS0 = m7.w.S0(w7.k.a() + w7.k.i());
        SimpleDateFormat simpleDateFormat = this.f29528R1;
        if (E2(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(this.f29475I2))), this.f29539T1.format(this.f29534S1)) >= C2939c.p() && (str = this.f29554W1) != null && this.f29559X1 != null && (!f29419W4.equals(str) || (this.f29554W1 != null && (str2 = this.f29559X1) != null && !f29420X4.equals(str2)))) {
            this.f29671r3 = Boolean.FALSE;
            this.f29446D3.b(f.f12146G).e();
            this.f29446D3.b(f.f12186K).c(strS0 + this.f29544U1 + this.f29549V1);
        }
        if (this.f29671r3.booleanValue()) {
            C2966a.f().w(i9);
            this.f29548V0.setText(name);
            q3();
            this.f29561X3 = this.f29625k;
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

    public final void h3(List list, int i9, boolean z9) {
        String str;
        String str2;
        SharedPreferences.Editor editor;
        if (list == null || list.size() <= 0) {
            Log.i("sizeIs", "lessThanZero");
            return;
        }
        if (this.f29667r != null && this.f29677s3 == i9) {
            Log.i("calledSeriesCase", "ifCalled");
            if (!z9) {
                return;
            }
        }
        E3();
        z3();
        u2(5000);
        Log.i("calledMethod", "firstTimeSeries");
        int iK2 = K2(list, i9);
        String title = ((GetEpisdoeDetailsCallback) list.get(iK2)).getTitle();
        this.f29571Z3 = ((GetEpisdoeDetailsCallback) list.get(iK2)).getMovieImage();
        this.f29566Y3 = title;
        this.f29575a4 = String.valueOf(((GetEpisdoeDetailsCallback) list.get(iK2)).getSeasonNumber());
        this.f29579b4 = m7.w.r0(((GetEpisdoeDetailsCallback) list.get(iK2)).getElapsed_time());
        this.f29583c4 = ((GetEpisdoeDetailsCallback) list.get(iK2)).getSeasonNumber().intValue();
        Log.i("calledSeriesCase", "session:" + ((GetEpisdoeDetailsCallback) list.get(iK2)).getSeasonNumber());
        m7.w.S0(w7.k.a() + w7.k.i());
        ((GetEpisdoeDetailsCallback) list.get(iK2)).getId();
        int iQ0 = m7.w.q0(((GetEpisdoeDetailsCallback) list.get(iK2)).getId());
        int i10 = this.f29689u3;
        this.f29573a2 = ((GetEpisdoeDetailsCallback) list.get(iK2)).getContainerExtension();
        ((GetEpisdoeDetailsCallback) list.get(iK2)).getCategoryId();
        this.f29653o3 = ((GetEpisdoeDetailsCallback) list.get(iK2)).getId();
        this.f29456F1 = ((GetEpisdoeDetailsCallback) list.get(iK2)).getCategoryId();
        this.f29462G1 = ((GetEpisdoeDetailsCallback) list.get(iK2)).getSeriesName();
        C2966a.f().w(iK2);
        int iH = this.f29613i.h(this.f29653o3, SharepreferenceDBHandler.getUserID(this.f29475I2));
        SharedPreferences.Editor editor2 = this.f29599f3;
        if (editor2 != null) {
            editor2.putString("currentlyPlayingVideo", String.valueOf(((GetEpisdoeDetailsCallback) list.get(iK2)).getId()));
            this.f29599f3.apply();
        }
        String str3 = this.f29577b2;
        if (str3 != null && str3.equals("series") && (editor = this.f29599f3) != null) {
            editor.putString("currentlyPlayingVideo", String.valueOf(((GetEpisdoeDetailsCallback) list.get(iK2)).getId()));
            this.f29599f3.apply();
        }
        SharedPreferences.Editor editor3 = this.f29605g3;
        if (editor3 != null) {
            editor3.putString("currentlyPlayingVideoPosition", String.valueOf(iK2));
            this.f29605g3.apply();
        }
        SimpleDateFormat simpleDateFormat = this.f29528R1;
        if (E2(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(this.f29475I2))), this.f29539T1.format(this.f29534S1)) >= C2939c.p() && (str = this.f29554W1) != null && this.f29559X1 != null && (!f29419W4.equals(str) || (this.f29554W1 != null && (str2 = this.f29559X1) != null && !f29420X4.equals(str2)))) {
            this.f29671r3 = Boolean.FALSE;
        }
        this.f29659p3 = iQ0;
        this.f29548V0.setText(title);
        if (!AbstractC2237a.f44475V0.booleanValue() || !AbstractC2237a.f44498e1.equalsIgnoreCase("1")) {
            M2(i10, iH, iK2, iQ0, null, "series", list, null, z9, "");
        } else if (SharepreferenceDBHandler.getEventAdsView(this) < AbstractC2237a.f44501f1) {
            M2(i10, iH, iK2, iQ0, null, "series", list, null, z9, "");
            SharepreferenceDBHandler.setEventAdsView(SharepreferenceDBHandler.getEventAdsView(this) + 1, this);
        } else {
            SharepreferenceDBHandler.setEventAdsView(0, this);
            X2(i10, iH, iK2, iQ0, null, "series", list, z9, "");
        }
    }

    public final void i3(List list, String str, boolean z9) {
        String str2;
        long jLongValue;
        int iR0;
        int i9;
        int iRound;
        String str3;
        String str4;
        SharedPreferences.Editor editor;
        if (list == null || list.size() <= 0) {
            Log.i("sizeIs", "lessThanZero");
            return;
        }
        if (this.f29667r != null && this.f29683t3.equals(str)) {
            Log.i("calledSeriesCase", "ifCalled");
            if (!z9) {
                return;
            }
        }
        E3();
        z3();
        u2(5000);
        Log.i("calledMethod", "firstTimeSeries");
        int iL2 = L2(list, str);
        String title = ((GetEpisdoeDetailsCallback) list.get(iL2)).getTitle();
        this.f29571Z3 = ((GetEpisdoeDetailsCallback) list.get(iL2)).getMovieImage();
        this.f29566Y3 = title;
        this.f29575a4 = String.valueOf(((GetEpisdoeDetailsCallback) list.get(iL2)).getSeasonNumber());
        this.f29579b4 = m7.w.r0(((GetEpisdoeDetailsCallback) list.get(iL2)).getElapsed_time());
        this.f29456F1 = ((GetEpisdoeDetailsCallback) list.get(iL2)).getCategoryId();
        this.f29462G1 = ((GetEpisdoeDetailsCallback) list.get(iL2)).getSeries_name();
        this.f29583c4 = ((GetEpisdoeDetailsCallback) list.get(iL2)).getSeasonNumber().intValue();
        Log.i("calledSeriesCase", "session:" + ((GetEpisdoeDetailsCallback) list.get(iL2)).getSeasonNumber());
        m7.w.S0(w7.k.a() + w7.k.i());
        ((GetEpisdoeDetailsCallback) list.get(iL2)).getId();
        int iQ0 = m7.w.q0(((GetEpisdoeDetailsCallback) list.get(iL2)).getId());
        this.f29440C3 = ((GetEpisdoeDetailsCallback) list.get(iL2)).getId();
        this.f29434B3 = ((GetEpisdoeDetailsCallback) list.get(iL2)).getLinks();
        int iR02 = this.f29689u3;
        this.f29573a2 = ((GetEpisdoeDetailsCallback) list.get(iL2)).getContainerExtension();
        ((GetEpisdoeDetailsCallback) list.get(iL2)).getCategoryId();
        this.f29653o3 = ((GetEpisdoeDetailsCallback) list.get(iL2)).getId();
        C2966a.f().w(iL2);
        int iH = this.f29613i.h(this.f29653o3, SharepreferenceDBHandler.getUserID(this.f29475I2));
        SharedPreferences.Editor editor2 = this.f29599f3;
        if (editor2 != null) {
            editor2.putString("currentlyPlayingVideo", String.valueOf(((GetEpisdoeDetailsCallback) list.get(iL2)).getId()));
            this.f29599f3.apply();
        }
        String str5 = this.f29577b2;
        if (str5 != null && str5.equals("series") && (editor = this.f29599f3) != null) {
            editor.putString("currentlyPlayingVideo", String.valueOf(((GetEpisdoeDetailsCallback) list.get(iL2)).getId()));
            this.f29599f3.apply();
        }
        SharedPreferences.Editor editor3 = this.f29605g3;
        if (editor3 != null) {
            editor3.putString("currentlyPlayingVideoPosition", String.valueOf(iL2));
            this.f29605g3.apply();
        }
        SimpleDateFormat simpleDateFormat = this.f29528R1;
        if (E2(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(this.f29475I2))), this.f29539T1.format(this.f29534S1)) >= C2939c.p() && (str3 = this.f29554W1) != null && this.f29559X1 != null && (!f29419W4.equals(str3) || (this.f29554W1 != null && (str4 = this.f29559X1) != null && !f29420X4.equals(str4)))) {
            this.f29671r3 = Boolean.FALSE;
        }
        this.f29665q3 = this.f29440C3;
        this.f29548V0.setText(title);
        j jVar = null;
        if (iH == 0 && this.f29671r3.booleanValue()) {
            q3();
            if (this.f29629k3.equals("m3u")) {
                C2966a.f().r("m3u");
                this.f29561X3 = this.f29529R2;
                str2 = "prefer_extension_decoders";
            } else {
                String.valueOf(Uri.parse(this.f29625k + iQ0 + InstructionFileId.DOT + this.f29573a2));
                String str6 = this.f29434B3;
                this.f29561X3 = str6;
                Log.i("uriISS", str6);
                if (!z9) {
                    try {
                        this.f29667r.release();
                        this.f29667r = null;
                    } catch (Exception unused) {
                    }
                }
                if (this.f29667r == null) {
                    Intent intent = getIntent();
                    if (this.f29577b2.equals("movies")) {
                        this.f29430B.setVisibility(8);
                        this.f29448E.setVisibility(8);
                    }
                    G1 g1B = AbstractC2683b.b(this, intent.getBooleanExtra("prefer_extension_decoders", false));
                    C0509q c0509q = new C0509q(this.f29660p4);
                    Z3.m mVar = new Z3.m(this);
                    this.f29666q4 = mVar;
                    m.d dVarC = mVar.c();
                    this.f29672r4 = dVarC;
                    str2 = "prefer_extension_decoders";
                    this.f29666q4.m(dVarC);
                    this.f29678s4 = null;
                    I1 i1A = new I1.a(this, g1B).b(c0509q).c(this.f29666q4).a();
                    this.f29667r = i1A;
                    i1A.B(new G(this, jVar));
                    this.f29667r.W(new C1700q(this.f29666q4));
                    this.f29667r.O(C1019e.f7784h, true);
                    this.f29667r.o(this.f29684t4);
                    this.f29616i2.setPlayer(this.f29667r);
                } else {
                    str2 = "prefer_extension_decoders";
                }
                Log.i("filePathIS", this.f29625k + "\nurlForChromecast:" + this.f29561X3);
                StringBuilder sb = new StringBuilder();
                sb.append("urlIS:");
                sb.append(this.f29561X3);
                Log.i("getURLIS", sb.toString());
                this.f29667r.h0(this.f29695v3, H0.e(this.f29561X3));
                this.f29667r.prepare();
            }
            EpisodesUsingSinglton.getInstance().setEpisodeList(list);
            C2966a.f().x(this.f29653o3);
            C2966a.f().H(this.f29440C3);
            C2966a.f().v(list);
        } else {
            str2 = "prefer_extension_decoders";
        }
        if (iH <= 0 || this.f29613i.a(this.f29653o3) <= 0) {
            return;
        }
        try {
            jLongValue = this.f29540T2.gettimeElapsed(this.f29653o3).longValue();
        } catch (Exception unused2) {
            jLongValue = 0;
        }
        if (iR02 == 0) {
            iR02 = m7.w.r0(this.f29540T2.getTotaltime(this.f29653o3).toString());
            this.f29689u3 = iR02;
        }
        if (this.f29616i2 == null || !this.f29671r3.booleanValue()) {
            return;
        }
        q3();
        String.valueOf(Uri.parse(this.f29625k + this.f29653o3 + InstructionFileId.DOT + this.f29573a2));
        this.f29561X3 = this.f29434B3;
        C2966a.f().I(jLongValue);
        Log.i("uriISS", this.f29561X3);
        if (z9) {
            try {
                this.f29667r.release();
                this.f29667r = null;
            } catch (Exception unused3) {
            }
        }
        try {
            iR0 = m7.w.r0(String.valueOf(jLongValue));
        } catch (Exception unused4) {
            iR0 = 0;
        }
        try {
            iRound = Math.round(iR0 / 1000.0f);
            i9 = iR0;
        } catch (Exception unused5) {
            i9 = iR0;
            iR02 = 0;
            iRound = 0;
        }
        try {
            Math.round((iRound / iR02) * 100.0f);
        } catch (Exception unused6) {
        }
        EpisodesUsingSinglton.getInstance().setEpisodeList(list);
        C2966a.f().x(this.f29653o3);
        if (this.f29667r == null) {
            Intent intent2 = getIntent();
            if (this.f29577b2.equals("movies")) {
                this.f29430B.setVisibility(8);
                this.f29448E.setVisibility(8);
            }
            G1 g1B2 = AbstractC2683b.b(this, intent2.getBooleanExtra(str2, false));
            C0509q c0509q2 = new C0509q(this.f29660p4);
            Z3.m mVar2 = new Z3.m(this);
            this.f29666q4 = mVar2;
            m.d dVarC2 = mVar2.c();
            this.f29672r4 = dVarC2;
            this.f29666q4.m(dVarC2);
            this.f29678s4 = null;
            I1 i1A2 = new I1.a(this, g1B2).b(c0509q2).c(this.f29666q4).a();
            this.f29667r = i1A2;
            i1A2.B(new G(this, jVar));
            this.f29667r.W(new C1700q(this.f29666q4));
            this.f29667r.O(C1019e.f7784h, true);
            this.f29667r.o(this.f29684t4);
            this.f29616i2.setPlayer(this.f29667r);
        }
        Log.i("filePathIS", this.f29625k + "\nurlForChromecast:" + this.f29561X3);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("urlIS:");
        sb2.append(this.f29561X3);
        Log.i("getURLIS", sb2.toString());
        this.f29667r.h0(this.f29695v3, H0.e(this.f29561X3));
        this.f29667r.prepare();
        this.f29667r.seekTo(i9);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return false;
    }

    public final void j3() {
        String strSubstring;
        MediaInfo mediaInfoA;
        C2328e c2328e;
        try {
            String type = SharepreferenceDBHandler.getType(this.f29475I2);
            strSubstring = "";
            if (type.equals("loadurl")) {
                String str = this.f29494L3;
                this.f29500M3 = str;
                int iLastIndexOf = str.lastIndexOf(47);
                strSubstring = iLastIndexOf > 1 ? this.f29500M3.substring(iLastIndexOf + 1) : "";
                String str2 = this.f29500M3;
                this.f29561X3 = str2;
                mediaInfoA = AbstractC1902a.a(strSubstring, "", "", 0, str2, "videos/mp4", this.f29571Z3, "", null);
                c2328e = this.f29551V3;
            } else {
                int ipAddress = ((WifiManager) getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress();
                String str3 = String.format("%d.%d.%d.%d", Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255), Integer.valueOf((ipAddress >> 24) & 255));
                String strSubstring2 = InstructionFileId.DOT;
                if (type.equals("devicedata")) {
                    this.f29500M3 = this.f29494L3;
                }
                int iLastIndexOf2 = this.f29500M3.lastIndexOf(47);
                if (iLastIndexOf2 > 1) {
                    strSubstring = this.f29500M3.substring(iLastIndexOf2 + 1);
                    strSubstring2 = this.f29500M3.substring(0, iLastIndexOf2);
                }
                String str4 = strSubstring;
                this.f29584d.b();
                this.f29584d.a(str3, strSubstring2);
                String str5 = "http://" + str3 + ":8080/" + str4;
                this.f29561X3 = str5;
                mediaInfoA = AbstractC1902a.a(str4, "", "", 0, str5, "videos/mp4", this.f29571Z3, "", null);
                c2328e = this.f29551V3;
            }
            AbstractC1902a.c(0, true, mediaInfoA, c2328e, this.f29475I2);
        } catch (Exception unused) {
        }
    }

    public void k3(String str, int i9, String str2, String str3, String str4, String str5) {
        if (this.f29667r != null) {
            RelativeLayout relativeLayout = this.f29602g0;
            if (relativeLayout != null) {
                relativeLayout.startAnimation(this.f29607h);
                this.f29602g0.setVisibility(8);
            }
            this.f29719z3 = str2;
            TextView textView = this.f29548V0;
            if (textView != null) {
                textView.setText(str2);
            }
            SeekBar seekBar = this.f29437C0;
            if (seekBar != null) {
                seekBar.setProgress(0);
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f29475I2).equals("onestream_api")) {
                i3(this.f29647n3, str4, false);
            } else {
                h3(this.f29647n3, i9, false);
            }
        }
    }

    public final void l3() {
        try {
            SharedPreferences.Editor editorEdit = this.f29536S3.edit();
            this.f29541T3 = editorEdit;
            if (editorEdit != null) {
                editorEdit.putString("pref.using_playback_speed", "1x (Normal)");
                this.f29541T3.apply();
            }
            this.f29509O0.setText(getResources().getString(a7.j.f13334n7) + " (1x)");
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3() {
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
            android.content.SharedPreferences r7 = r0.f29536S3
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
            com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries$l r2 = new com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries$l
            r2.<init>()
            r5.l(r1, r3, r2)
            androidx.appcompat.app.a r1 = r5.create()
            r0.f29606g4 = r1
            com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries$m r2 = new com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries$m
            r2.<init>()
            r1.setOnDismissListener(r2)
            androidx.appcompat.app.a r1 = r0.f29606g4
            r1.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries.m3():void");
    }

    public final void n3(String str) {
        SharedPreferences.Editor editorEdit = this.f29536S3.edit();
        this.f29541T3 = editorEdit;
        if (editorEdit != null) {
            editorEdit.putString("pref.using_playback_speed", str);
            this.f29541T3.apply();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0086, code lost:
    
        r24 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0093, code lost:
    
        r24 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0075, code lost:
    
        r24 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0079, code lost:
    
        r24 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:334:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ee A[PHI: r28
      0x01ee: PHI (r28v4 java.lang.String) = 
      (r28v3 java.lang.String)
      (r28v3 java.lang.String)
      (r28v3 java.lang.String)
      (r28v3 java.lang.String)
      (r28v3 java.lang.String)
      (r28v5 java.lang.String)
     binds: [B:78:0x0212, B:80:0x0218, B:82:0x0220, B:84:0x022a, B:75:0x020d, B:65:0x01ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0077 A[PHI: r24
      0x0077: PHI (r24v10 java.lang.String) = (r24v6 java.lang.String), (r24v7 java.lang.String), (r24v8 java.lang.String), (r24v11 java.lang.String) binds: [B:17:0x009b, B:13:0x008e, B:9:0x0081, B:6:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o3() {
        /*
            Method dump skipped, instruction units count: 2576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries.o3():void");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        RelativeLayout relativeLayout = this.f29656p0;
        if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
            F3();
            return;
        }
        if (this.f29634l2.getVisibility() == 0) {
            this.f29634l2.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = this.f29644n0;
        if (relativeLayout2 != null && relativeLayout2.getVisibility() == 0) {
            this.f29644n0.setVisibility(8);
            this.f29552W.setVisibility(8);
            this.f29552W.startAnimation(this.f29607h);
            this.f29644n0.startAnimation(this.f29607h);
            this.f29717z1.setChecked(false);
            this.f29426A1.setChecked(false);
            this.f29432B1.setChecked(false);
            this.f29438C1.setChecked(false);
            this.f29687u1.setChecked(false);
            this.f29693v1.setChecked(false);
            this.f29699w1.setChecked(false);
            this.f29705x1.setChecked(false);
            this.f29711y1.setChecked(false);
            this.f29663q1.setChecked(false);
            this.f29669r1.setChecked(false);
            this.f29675s1.setChecked(false);
            this.f29681t1.setChecked(false);
            this.f29444D1.setText("");
            return;
        }
        RelativeLayout relativeLayout3 = this.f29602g0;
        if (relativeLayout3 != null && relativeLayout3.getVisibility() == 0) {
            this.f29602g0.startAnimation(this.f29607h);
            this.f29602g0.setVisibility(8);
            return;
        }
        E3();
        if (this.f29608h0.getVisibility() == 0) {
            this.f29608h0.startAnimation(this.f29517P2);
            this.f29608h0.setVisibility(8);
            return;
        }
        RelativeLayout relativeLayout4 = this.f29644n0;
        if (relativeLayout4 != null && relativeLayout4.getVisibility() == 0) {
            this.f29644n0.setVisibility(8);
            this.f29552W.setVisibility(8);
            this.f29552W.startAnimation(this.f29607h);
            this.f29644n0.startAnimation(this.f29607h);
            this.f29717z1.setChecked(false);
            this.f29426A1.setChecked(false);
            this.f29432B1.setChecked(false);
            this.f29438C1.setChecked(false);
            this.f29687u1.setChecked(false);
            this.f29693v1.setChecked(false);
            this.f29699w1.setChecked(false);
            this.f29705x1.setChecked(false);
            this.f29711y1.setChecked(false);
            this.f29663q1.setChecked(false);
            this.f29669r1.setChecked(false);
            this.f29675s1.setChecked(false);
            this.f29681t1.setChecked(false);
            this.f29444D1.setText("");
            return;
        }
        if (this.f29631l.getVisibility() != 0) {
            AbstractC2237a.f44521m0 = true;
            if (this.f29637m.equals("mobile") && this.f29624j4 && this.f29648n4) {
                try {
                    Log.i("pictureMethod", "calledHere");
                    Y2();
                    return;
                } catch (Exception e9) {
                    System.out.println(e9.getMessage());
                }
            }
            super.onBackPressed();
            return;
        }
        if (this.f29631l.getVisibility() == 0) {
            this.f29631l.startAnimation(this.f29607h);
            if (this.f29466H.getVisibility() == 0) {
                this.f29466H.startAnimation(this.f29607h);
            }
            if (this.f29515P0.getVisibility() == 0) {
                this.f29515P0.startAnimation(this.f29607h);
            }
            if (this.f29478J.getVisibility() == 0) {
                this.f29478J.startAnimation(this.f29607h);
            }
            if (this.f29521Q0.getVisibility() == 0) {
                this.f29521Q0.startAnimation(this.f29607h);
            }
            if (this.f29472I.getVisibility() == 0) {
                this.f29472I.startAnimation(this.f29607h);
            }
            this.f29631l.setVisibility(8);
            if (this.f29466H.getVisibility() == 0) {
                this.f29466H.setVisibility(8);
            }
            if (this.f29515P0.getVisibility() == 0) {
                this.f29515P0.setVisibility(8);
            }
            if (this.f29478J.getVisibility() == 0) {
                this.f29478J.setVisibility(8);
            }
            if (this.f29521Q0.getVisibility() == 0) {
                this.f29521Q0.setVisibility(8);
            }
            if (this.f29472I.getVisibility() == 0) {
                this.f29472I.setVisibility(8);
            }
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
        CheckBox checkBox;
        boolean zIsChecked = ((CheckBox) compoundButton).isChecked();
        int id = compoundButton.getId();
        if (id == f.f12296V1) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f29717z1;
            }
        } else if (id == f.f12314X1) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f29426A1;
            }
        } else if (id == f.f12323Y1) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f29432B1;
            }
        } else if (id == f.f12305W1) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f29438C1;
            }
        } else if (id == f.f12383e2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f29663q1;
            }
        } else if (id == f.f12403g2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f29669r1;
            }
        } else if (id == f.f12413h2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f29675s1;
            }
        } else if (id == f.f12393f2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f29681t1;
            }
        } else if (id == f.f12342a2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f29687u1;
            }
        } else if (id == f.f12362c2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f29693v1;
            }
        } else if (id == f.f12372d2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f29699w1;
            }
        } else if (id == f.f12352b2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f29705x1;
            }
        } else if (id != f.f12332Z1 || !zIsChecked) {
            return;
        } else {
            checkBox = this.f29711y1;
        }
        this.f29480J1 = checkBox.getText().toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x06d0  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 2641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries.onClick(android.view.View):void");
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        s2(configuration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0692 A[Catch: Exception -> 0x0698, TRY_LEAVE, TryCatch #2 {Exception -> 0x0698, blocks: (B:42:0x0683, B:44:0x0692), top: B:77:0x0683 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0910  */
    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f29661q = true;
        try {
            if (this.f29465G4 != null) {
                C2386a.b(this.f29475I2).e(this.f29465G4);
            }
        } catch (Exception e9) {
            Log.e("fsgd", "fdfh", e9);
        }
        try {
            q3();
        } catch (Exception unused) {
        }
        try {
            Thread thread = this.f29713y3;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f29713y3.interrupt();
        } catch (Exception unused2) {
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
                                                    if (this.f29608h0.getVisibility() != 0 && this.f29602g0.getVisibility() != 0 && this.f29614i0.getVisibility() != 0 && this.f29614i0.getVisibility() != 0) {
                                                        this.f29631l.getVisibility();
                                                        this.f29644n0.getVisibility();
                                                    }
                                                    return true;
                                                case 20:
                                                    E3();
                                                    if (this.f29608h0.getVisibility() != 0 && this.f29602g0.getVisibility() != 0 && this.f29614i0.getVisibility() != 0 && this.f29614i0.getVisibility() != 0 && this.f29644n0.getVisibility() != 0 && this.f29631l.getVisibility() == 8) {
                                                        this.f29631l.startAnimation(this.f29601g);
                                                        this.f29631l.setVisibility(0);
                                                        this.f29674s0.requestFocus();
                                                        this.f29680t0.requestFocus();
                                                    }
                                                    return true;
                                                case 21:
                                                    E3();
                                                    if (this.f29608h0.getVisibility() == 0 || this.f29602g0.getVisibility() == 0) {
                                                        return false;
                                                    }
                                                    if (this.f29614i0.getVisibility() == 0 || this.f29614i0.getVisibility() == 0 || this.f29644n0.getVisibility() == 0) {
                                                        return true;
                                                    }
                                                    if (this.f29631l.getVisibility() == 8) {
                                                        this.f29631l.startAnimation(this.f29601g);
                                                        this.f29631l.setVisibility(0);
                                                        if (!this.f29437C0.isFocused()) {
                                                            this.f29437C0.requestFocus();
                                                        }
                                                    }
                                                    if (this.f29437C0.isFocused()) {
                                                        F3();
                                                    } else {
                                                        u2(5000);
                                                    }
                                                    return true;
                                                case 22:
                                                    E3();
                                                    if (this.f29608h0.getVisibility() == 0 || this.f29602g0.getVisibility() == 0) {
                                                        return false;
                                                    }
                                                    if (this.f29614i0.getVisibility() == 0 || this.f29614i0.getVisibility() == 0 || this.f29644n0.getVisibility() == 0) {
                                                        return true;
                                                    }
                                                    if (this.f29631l.getVisibility() == 8) {
                                                        this.f29631l.startAnimation(this.f29601g);
                                                        this.f29631l.setVisibility(0);
                                                        if (!this.f29437C0.isFocused()) {
                                                            this.f29437C0.requestFocus();
                                                        }
                                                    }
                                                    if (this.f29437C0.isFocused()) {
                                                        F3();
                                                    } else {
                                                        u2(5000);
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
                                E3();
                                if (this.f29631l.getVisibility() == 8) {
                                    this.f29631l.startAnimation(this.f29601g);
                                    this.f29631l.setVisibility(0);
                                    if (!this.f29437C0.isFocused()) {
                                        this.f29437C0.requestFocus();
                                    }
                                }
                                u2(5000);
                                this.f29437C0.setProgress(this.f29437C0.getProgress() + 10);
                            } catch (Exception unused) {
                            }
                            return true;
                        }
                        try {
                            E3();
                            if (this.f29631l.getVisibility() == 8) {
                                this.f29631l.startAnimation(this.f29601g);
                                this.f29631l.setVisibility(0);
                                if (!this.f29437C0.isFocused()) {
                                    this.f29437C0.requestFocus();
                                }
                            }
                            u2(5000);
                            this.f29437C0.setProgress(this.f29437C0.getProgress() - 10);
                        } catch (Exception unused2) {
                        }
                        return true;
                    }
                }
                if (this.f29644n0.getVisibility() == 0) {
                    return true;
                }
                if (this.f29667r == null) {
                    P3();
                } else if (this.f29608h0.getVisibility() == 8) {
                    (this.f29667r.isPlaying() ? this.f29680t0 : this.f29674s0).performClick();
                }
                return true;
            }
            I1 i12 = this.f29667r;
            if (i12 != null) {
                ((!z9 || i12.isPlaying()) ? this.f29680t0 : this.f29674s0).performClick();
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
        this.f29661q = true;
        String str = this.f29577b2;
        if (str == null || !str.equals("movies")) {
            String str2 = this.f29577b2;
            if (str2 != null && str2.equals("series")) {
                A2();
            }
        } else {
            r3(0);
        }
        getIntent().getAction();
        try {
            C2325b c2325b = this.f29556W3;
            if (c2325b != null) {
                c2325b.c().e(this.f29594e4, C2328e.class);
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
                PlayerView playerView = this.f29616i2;
                if (playerView != null && playerView.f25830a != null) {
                    playerView.setShowOrHideSubtitles("gone");
                    this.f29616i2.f25830a.setVisibility(8);
                }
                o oVar = new o();
                this.f29612h4 = oVar;
                registerReceiver(oVar, new IntentFilter("media_control"));
                return;
            }
            f29416T4 = true;
            unregisterReceiver(this.f29612h4);
            this.f29618i4 = false;
            this.f29612h4 = null;
            PlayerView playerView2 = this.f29616i2;
            if (playerView2 == null || playerView2.f25830a == null) {
                return;
            }
            playerView2.setShowOrHideSubtitles("visible");
            this.f29616i2.f25830a.setVisibility(0);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i9, strArr, iArr);
        if (iArr.length == 0 || iArr[0] == 0) {
            return;
        }
        B3(a7.j.f13091O7);
        finish();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        Intent intent;
        AppOpsManager appOpsManager;
        super.onResume();
        this.f29661q = false;
        Context context = this.f29475I2;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("auto_start", 0);
            this.f29642m4 = sharedPreferences;
            boolean z9 = sharedPreferences.getBoolean("picinpic", AbstractC2237a.f44541u0);
            this.f29648n4 = z9;
            if (z9 && this.f29637m.equals("mobile")) {
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 26) {
                    this.f29630k4 = AbstractC2500v.a();
                }
                if (i9 >= 26) {
                    try {
                        if (getPackageManager().hasSystemFeature("android.software.picture_in_picture") && (appOpsManager = (AppOpsManager) this.f29475I2.getSystemService("appops")) != null && appOpsManager.checkOpNoThrow("android:picture_in_picture", Process.myUid(), this.f29475I2.getPackageName()) == 0) {
                            this.f29624j4 = true;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        String str = this.f29577b2;
        if (str == null || !str.equals("series")) {
            String str2 = this.f29577b2;
            if (str2 != null && str2.equals("movies") && (intent = getIntent()) != null && intent.getBooleanExtra("BUNDLE_KEY_NEW_INTENT_CALLED", false)) {
                intent.putExtra("BUNDLE_KEY_NEW_INTENT_CALLED", false);
                setIntent(intent);
                if (getIntent().getIntExtra("OPENED_STREAM_ID", 0) != this.f29677s3 && !getIntent().getSerializableExtra("ONESTREAM_STREAM_ID").equals(this.f29683t3)) {
                    this.f29635l3 = VodAllCategoriesSingleton.getInstance().getvodList();
                    o3();
                }
            }
        } else {
            Intent intent2 = getIntent();
            if (intent2 != null && intent2.getBooleanExtra("BUNDLE_KEY_NEW_INTENT_CALLED", false)) {
                intent2.putExtra("BUNDLE_KEY_NEW_INTENT_CALLED", false);
                setIntent(intent2);
                if (getIntent().getIntExtra("OPENED_STREAM_ID", 0) != this.f29677s3 && !getIntent().getSerializableExtra("ONESTREAM_STREAM_ID").equals(this.f29683t3)) {
                    this.f29647n3 = EpisodesUsingSinglton.getInstance().getEpisodeList();
                    o3();
                }
            }
        }
        m7.w.m(this.f29475I2);
        if (this.f29667r != null) {
            T2();
            if (this.f29592e2) {
                f29421Y4 = false;
            }
        }
        C2325b c2325b = this.f29556W3;
        if (c2325b != null) {
            c2325b.c().a(this.f29594e4, C2328e.class);
        }
    }

    @Override // androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        U3();
        T3();
        bundle.putBundle("track_selector_parameters", this.f29672r4.h());
        bundle.putBoolean("auto_play", this.f29684t4);
        bundle.putInt("window", this.f29690u4);
        bundle.putLong("position", this.f29696v4);
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStart() {
        PlayerView playerView;
        super.onStart();
        if (k0.f39777a <= 23 || (playerView = this.f29616i2) == null) {
            return;
        }
        playerView.D();
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            this.f29661q = true;
            q3();
            if (this.f29637m.equals("mobile") && this.f29624j4 && this.f29648n4) {
                finishAndRemoveTask();
            }
        } catch (Exception e9) {
            Log.e("loggg", "exception");
            Log.e("loggg", e9.getMessage());
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (this.f29637m.equals("mobile") && this.f29624j4 && this.f29648n4 && !isInPictureInPictureMode()) {
            try {
                Y2();
                this.f29618i4 = true;
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        T2();
        if (z9) {
            s2(getResources().getConfiguration());
        }
    }

    public final void p3() {
        if (this.f29435B4 <= 5) {
            Toast.makeText(this.f29475I2, "Api Error, reconnects in 3sec(" + this.f29435B4 + "/5) ", 0).show();
        }
        this.f29435B4++;
        new Handler().postDelayed(new i(), 3000L);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
    }

    public void r2(Uri uri) {
        long currentPosition = this.f29667r.getCurrentPosition();
        boolean zIsPlaying = this.f29667r.isPlaying();
        H0 h0F = this.f29667r.f();
        if (h0F == null || h0F.f5528c == null) {
            return;
        }
        this.f29667r.w0(new H0.c().m(h0F.f5528c.f5625a).k(Collections.singletonList(new H0.k.a(uri).n("application/x-subrip").p(1).i())).a(), false);
        this.f29667r.prepare();
        this.f29667r.seekTo(currentPosition);
        if (zIsPlaying) {
            this.f29667r.play();
        }
    }

    public final void r3(int i9) {
        long currentPosition;
        int iJ2;
        Context context;
        ArrayList arrayList;
        long currentPosition2;
        I1 i12 = this.f29667r;
        if (i12 != null) {
            if (i9 == 0) {
                this.f29506N3 = this.f29475I2.getSharedPreferences("currentSeekTime", 0);
                try {
                    currentPosition2 = (int) this.f29667r.getCurrentPosition();
                } catch (Exception unused) {
                    currentPosition2 = 0;
                }
                SharedPreferences sharedPreferences = this.f29475I2.getSharedPreferences("currentSeekTime", 0);
                this.f29506N3 = sharedPreferences;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                this.f29512O3 = editorEdit;
                editorEdit.putString("currentSeekTime", String.valueOf(currentPosition2));
                this.f29512O3.apply();
                currentPosition = currentPosition2;
            } else {
                try {
                    currentPosition = (int) i12.getCurrentPosition();
                } catch (Exception unused2) {
                    currentPosition = 0;
                }
            }
            new LiveStreamsDBModel();
            if (this.f29629k3.equals("m3u")) {
                O2(String.valueOf(Uri.parse(this.f29529R2)), SharepreferenceDBHandler.getUserID(this.f29475I2));
                return;
            }
            try {
                if (this.f29629k3.equals("onestream_api")) {
                    if (this.f29667r == null || C2966a.f().m() == null || currentPosition == -1 || currentPosition == 0) {
                        return;
                    }
                    Log.i("calledHere", "openedStreamId:" + this.f29677s3 + "userID:" + SharepreferenceDBHandler.getUserID(this.f29475I2));
                    Log.i("calledHere", "playerResumeDBModel:" + new Gson().toJson(SharepreferenceDBHandler.getCurrentAPPType(this.f29475I2).equals("onestream_api") ? P2(this.f29683t3, SharepreferenceDBHandler.getUserID(this.f29475I2)) : N2(this.f29677s3, SharepreferenceDBHandler.getUserID(this.f29475I2))));
                    try {
                        Log.i("seekTime", "time:" + currentPosition);
                    } catch (Exception unused3) {
                    }
                    iJ2 = SharepreferenceDBHandler.getCurrentAPPType(this.f29475I2).equals("onestream_api") ? J2(this.f29635l3, this.f29683t3) : I2(this.f29635l3, this.f29677s3);
                    D2(SharepreferenceDBHandler.getCurrentAPPType(this.f29475I2).equals("onestream_api") ? ((LiveStreamsDBModel) this.f29635l3.get(iJ2)).getStreamIdOneStream() : ((LiveStreamsDBModel) this.f29635l3.get(iJ2)).getStreamId());
                    context = this.f29475I2;
                    arrayList = this.f29635l3;
                } else {
                    if (this.f29667r == null || C2966a.f().k() == -1 || currentPosition == -1 || currentPosition == 0) {
                        return;
                    }
                    Log.i("calledHere", "openedStreamId:" + this.f29677s3 + "userID:" + SharepreferenceDBHandler.getUserID(this.f29475I2));
                    Log.i("calledHere", "playerResumeDBModel:" + new Gson().toJson(SharepreferenceDBHandler.getCurrentAPPType(this.f29475I2).equals("onestream_api") ? P2(this.f29683t3, SharepreferenceDBHandler.getUserID(this.f29475I2)) : N2(this.f29677s3, SharepreferenceDBHandler.getUserID(this.f29475I2))));
                    try {
                        Log.i("seekTime", "time:" + currentPosition);
                    } catch (Exception unused4) {
                    }
                    iJ2 = SharepreferenceDBHandler.getCurrentAPPType(this.f29475I2).equals("onestream_api") ? J2(this.f29635l3, this.f29683t3) : I2(this.f29635l3, this.f29677s3);
                    D2(SharepreferenceDBHandler.getCurrentAPPType(this.f29475I2).equals("onestream_api") ? ((LiveStreamsDBModel) this.f29635l3.get(iJ2)).getStreamIdOneStream() : ((LiveStreamsDBModel) this.f29635l3.get(iJ2)).getStreamId());
                    context = this.f29475I2;
                    arrayList = this.f29635l3;
                }
                u3(context, arrayList, iJ2, currentPosition);
            } catch (Exception unused5) {
            }
            Log.i("calledHere", "ifPart");
        }
    }

    public final void s2(Configuration configuration) {
        PlayerView playerView;
        boolean z9;
        Log.i("methodCalled", "calledMethod");
        View decorView = getWindow().getDecorView();
        if (configuration.orientation == 2) {
            decorView.setSystemUiVisibility(5894);
            playerView = this.f29616i2;
            z9 = false;
        } else {
            decorView.setSystemUiVisibility(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH);
            playerView = this.f29616i2;
            z9 = true;
        }
        playerView.setAdjustViewBounds(z9);
    }

    public final void s3() {
        TextView textView;
        StringBuilder sb;
        E3();
        if (x2() || this.f29667r == null || this.f29639m1.getVisibility() != 8) {
            return;
        }
        this.f29586d2.removeCallbacksAndMessages(null);
        String str = this.f29581c2;
        if (str != null && !str.equals("")) {
            this.f29518P3 -= 10000;
        }
        String str2 = this.f29577b2;
        this.f29518P3 = (str2 == null || !str2.equals("catch_up")) ? this.f29518P3 - 10000 : this.f29518P3 - DateTimeConstants.MILLIS_PER_MINUTE;
        if (this.f29518P3 > 0) {
            textView = this.f29533S0;
            sb = new StringBuilder();
            sb.append("+");
        } else {
            textView = this.f29533S0;
            sb = new StringBuilder();
        }
        sb.append(this.f29518P3 / 1000);
        sb.append("s");
        textView.setText(sb.toString());
        this.f29515P0.setText("");
        this.f29515P0.startAnimation(this.f29499M2);
        this.f29515P0.setVisibility(0);
        if (this.f29645n1.getVisibility() == 8) {
            this.f29645n1.startAnimation(this.f29493L2);
            this.f29645n1.setVisibility(0);
        } else {
            this.f29645n1.startAnimation(this.f29499M2);
        }
        this.f29586d2.postDelayed(new RunnableC1430d(), 1000L);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i9) {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
    }

    public void t2() {
        File[] fileArrO = m7.w.O(this.f29475I2);
        for (File file : fileArrO) {
            if (file.toString().endsWith(".ts")) {
                Arrays.asList(file);
            }
        }
        if (fileArrO.length > 0) {
            ArrayList arrayList = this.f29604g2;
            if (arrayList != null) {
                arrayList.clear();
            }
            for (File file2 : fileArrO) {
                if (file2.toString().endsWith(".ts")) {
                    this.f29604g2.addAll(Arrays.asList(file2));
                }
            }
            Collections.reverse(this.f29604g2);
            this.f29636l4 = this.f29604g2;
        }
    }

    public void t3() {
        TextView textView;
        StringBuilder sb;
        E3();
        if (x2() || this.f29667r == null || this.f29645n1.getVisibility() != 8) {
            return;
        }
        this.f29586d2.removeCallbacksAndMessages(null);
        String str = this.f29581c2;
        if (str != null && !str.equals("")) {
            this.f29518P3 += Constants.MAXIMUM_UPLOAD_PARTS;
        }
        String str2 = this.f29577b2;
        if (str2 == null || !str2.equals("catch_up")) {
            this.f29518P3 += Constants.MAXIMUM_UPLOAD_PARTS;
        } else {
            this.f29518P3 += DateTimeConstants.MILLIS_PER_MINUTE;
        }
        if (this.f29518P3 > 0) {
            textView = this.f29527R0;
            sb = new StringBuilder();
            sb.append("+");
        } else {
            textView = this.f29527R0;
            sb = new StringBuilder();
        }
        sb.append(this.f29518P3 / 1000);
        sb.append("s");
        textView.setText(sb.toString());
        this.f29521Q0.setText("");
        this.f29521Q0.startAnimation(this.f29499M2);
        this.f29521Q0.setVisibility(0);
        if (this.f29639m1.getVisibility() == 8) {
            this.f29639m1.startAnimation(this.f29493L2);
            this.f29639m1.setVisibility(0);
        } else {
            this.f29639m1.startAnimation(this.f29499M2);
        }
        this.f29586d2.postDelayed(new RunnableC1431e(), 1000L);
    }

    public final void u2(int i9) {
        if (f29418V4) {
            return;
        }
        try {
            PlayerView playerView = this.f29616i2;
            if (playerView != null) {
                playerView.f25867v = new n();
                PlayerView playerView2 = this.f29616i2;
                playerView2.f25865u.postDelayed(playerView2.f25867v, i9);
            }
        } catch (Exception unused) {
        }
    }

    public void u3(Context context, ArrayList arrayList, int i9, long j9) {
        String num = ((LiveStreamsDBModel) arrayList.get(i9)).getNum();
        String name = ((LiveStreamsDBModel) arrayList.get(i9)).getName();
        String streamType = ((LiveStreamsDBModel) arrayList.get(i9)).getStreamType();
        String streamId = ((LiveStreamsDBModel) arrayList.get(i9)).getStreamId();
        String streamIdOneStream = ((LiveStreamsDBModel) arrayList.get(i9)).getStreamIdOneStream();
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
        this.f29456F1 = ((LiveStreamsDBModel) arrayList.get(i9)).getCategoryId();
        this.f29462G1 = ((LiveStreamsDBModel) arrayList.get(i9)).getName();
        PanelAvailableChannelsPojo panelAvailableChannelsPojo = new PanelAvailableChannelsPojo();
        panelAvailableChannelsPojo.setNum(Integer.valueOf(m7.w.r0(num)));
        panelAvailableChannelsPojo.setName(name);
        panelAvailableChannelsPojo.setStreamType(streamType);
        if (SharepreferenceDBHandler.getCurrentAPPType(context).equals("onestream_api")) {
            panelAvailableChannelsPojo.setStreamId(streamId);
        } else {
            panelAvailableChannelsPojo.setStreamId(streamIdOneStream);
        }
        panelAvailableChannelsPojo.setStreamIcon(streamIcon);
        panelAvailableChannelsPojo.setEpgChannelId(epgChannelId);
        panelAvailableChannelsPojo.setAdded(added);
        panelAvailableChannelsPojo.setCategoryId(categoryId);
        panelAvailableChannelsPojo.setCustomSid(customSid);
        panelAvailableChannelsPojo.setTvArchive(Integer.valueOf(m7.w.r0(tvArchive)));
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
        int i10 = this.f29689u3;
        if (i10 != 0) {
            try {
                panelAvailableChannelsPojo.setMovieDuration(i10);
            } catch (Exception unused2) {
                panelAvailableChannelsPojo.setMovieDuration(j10);
            }
            panelAvailableChannelsPojo.setRatingFromTen(strValueOf);
            panelAvailableChannelsPojo.setRatingFromFive(strValueOf2);
            this.f29545U2.addAllAvailableChannel(panelAvailableChannelsPojo);
        }
        I1 i12 = this.f29667r;
        if (i12 != null) {
            int duration = (int) (i12.getDuration() / 1000);
            this.f29689u3 = duration;
            j10 = duration;
        }
        panelAvailableChannelsPojo.setMovieDuration(j10);
        panelAvailableChannelsPojo.setRatingFromTen(strValueOf);
        panelAvailableChannelsPojo.setRatingFromFive(strValueOf2);
        this.f29545U2.addAllAvailableChannel(panelAvailableChannelsPojo);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v1() {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries.v1():void");
    }

    public void v2(int i9) {
        if (f29418V4) {
            return;
        }
        this.f29616i2.f25867v = new p();
        PlayerView playerView = this.f29616i2;
        playerView.f25865u.postDelayed(playerView.f25867v, i9);
    }

    public final void v3() {
        RecyclerView recyclerView = this.f29657p1;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f29475I2, 1);
            this.f29469H2 = gridLayoutManager;
            this.f29657p1.setLayoutManager(gridLayoutManager);
            this.f29657p1.setItemAnimator(new androidx.recyclerview.widget.c());
        }
    }

    public void w2() {
        this.f29492L1 = new ArrayList();
        this.f29498M1 = new JsonArray();
        if (this.f29687u1.isChecked()) {
            this.f29492L1.add(this.f29687u1.getText().toString());
            this.f29498M1.add(this.f29687u1.getText().toString());
        }
        if (this.f29693v1.isChecked()) {
            this.f29492L1.add(this.f29693v1.getText().toString());
            this.f29498M1.add(this.f29693v1.getText().toString());
        }
        if (this.f29699w1.isChecked()) {
            this.f29492L1.add(this.f29699w1.getText().toString());
            this.f29498M1.add(this.f29699w1.getText().toString());
        }
        if (this.f29705x1.isChecked()) {
            this.f29492L1.add(this.f29705x1.getText().toString());
            this.f29498M1.add(this.f29705x1.getText().toString());
        }
        if (this.f29711y1.isChecked()) {
            this.f29492L1.add(this.f29711y1.getText().toString());
            this.f29498M1.add(this.f29711y1.getText().toString());
        }
        if (this.f29663q1.isChecked()) {
            this.f29492L1.add(this.f29663q1.getText().toString());
            this.f29498M1.add(this.f29663q1.getText().toString());
        }
        if (this.f29669r1.isChecked()) {
            this.f29492L1.add(this.f29669r1.getText().toString());
            this.f29498M1.add(this.f29669r1.getText().toString());
        }
        if (this.f29675s1.isChecked()) {
            this.f29492L1.add(this.f29675s1.getText().toString());
            this.f29498M1.add(this.f29675s1.getText().toString());
        }
        if (this.f29681t1.isChecked()) {
            this.f29492L1.add(this.f29681t1.getText().toString());
            this.f29498M1.add(this.f29681t1.getText().toString());
        }
        if (this.f29717z1.isChecked()) {
            this.f29492L1.add(this.f29717z1.getText().toString());
            this.f29498M1.add(this.f29717z1.getText().toString());
        }
        if (this.f29426A1.isChecked()) {
            this.f29492L1.add(this.f29426A1.getText().toString());
            this.f29498M1.add(this.f29426A1.getText().toString());
        }
        if (this.f29432B1.isChecked()) {
            this.f29492L1.add(this.f29432B1.getText().toString());
            this.f29498M1.add(this.f29432B1.getText().toString());
        }
        if (this.f29438C1.isChecked()) {
            this.f29492L1.add(this.f29438C1.getText().toString());
            this.f29498M1.add(this.f29438C1.getText().toString());
        }
        this.f29504N1 = new Gson().toJson((JsonElement) this.f29498M1);
        Log.e("TAG", this.f29498M1 + "");
    }

    public final int w3() {
        int currentPosition = (int) this.f29667r.getCurrentPosition();
        int duration = (int) this.f29667r.getDuration();
        SeekBar seekBar = this.f29437C0;
        if (seekBar != null) {
            if (duration > 0) {
                seekBar.setProgress((int) ((((long) currentPosition) * 1000) / ((long) duration)));
            }
            this.f29437C0.setSecondaryProgress(this.f29667r.k0() * 10);
        }
        return currentPosition;
    }

    public boolean x2() {
        RelativeLayout relativeLayout = this.f29614i0;
        return relativeLayout != null && relativeLayout.getVisibility() == 0;
    }

    public final void x3() {
        this.f29594e4 = new C1429c();
    }

    public final void y3() {
        this.f29631l.startAnimation(this.f29607h);
        this.f29631l.setVisibility(8);
        this.f29602g0.startAnimation(this.f29601g);
        this.f29602g0.setVisibility(0);
        List list = this.f29457F2;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f29553W0.setText(getResources().getString(a7.j.f13040J6) + " - " + ((GetEpisdoeDetailsCallback) this.f29457F2.get(0)).getSeasonNumber());
        try {
            v3();
            C2630n c2630n = new C2630n(this.f29475I2, null, null, null, "from_player", this.f29637m, this.f29657p1);
            this.f29463G2 = c2630n;
            this.f29657p1.setAdapter(c2630n);
            this.f29657p1.requestFocus();
        } catch (Exception unused) {
        }
    }

    public void z2() {
        this.f29684t4 = true;
        this.f29690u4 = -1;
        this.f29696v4 = -9223372036854775807L;
    }

    public void z3() {
        ImageView imageView;
        if (f29418V4) {
            this.f29616i2.M();
            this.f29616i2.p(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
            return;
        }
        if (!x2() && this.f29608h0.getVisibility() == 8 && this.f29631l.getVisibility() == 8) {
            this.f29631l.startAnimation(this.f29601g);
            this.f29631l.setVisibility(0);
            Log.i("calledHere", "hereForPlayPause");
            try {
                this.f29515P0.setVisibility(0);
                this.f29521Q0.setVisibility(0);
                this.f29466H.setVisibility(0);
                this.f29472I.setVisibility(0);
                if (f29417U4.getVisibility() == 0) {
                    this.f29478J.setVisibility(8);
                } else {
                    this.f29478J.setVisibility(0);
                }
                if (this.f29667r.isPlaying()) {
                    this.f29680t0.setVisibility(0);
                    imageView = this.f29674s0;
                } else {
                    this.f29674s0.setVisibility(0);
                    imageView = this.f29680t0;
                }
                imageView.setVisibility(8);
            } catch (Exception unused) {
            }
        }
    }
}
