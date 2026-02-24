package com.nst.iptvsmarterstvbox.view.demo;

import B3.C0509q;
import D.AbstractC0519b;
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
import P3.f;
import Q2.C1019e;
import Z3.m;
import a7.c;
import a7.h;
import a7.k;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.ActionMenuView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b4.InterfaceC1224o;
import b7.AbstractC1232b;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.FreeTrailActivity;
import com.nst.iptvsmarterstvbox.model.FavouriteDBModel;
import com.nst.iptvsmarterstvbox.model.FavouriteM3UModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.StalkerLiveFavIdsSingleton;
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
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.ExternalPlayerDataBase;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.MultiUserDBHandler;
import com.nst.iptvsmarterstvbox.model.database.PasswordStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.pojo.XMLTVProgrammePojo;
import com.nst.iptvsmarterstvbox.model.webrequest.RetrofitPost;
import com.nst.iptvsmarterstvbox.sbpfunction.activitypushnotification.MaintanencePannelActivity;
import com.nst.iptvsmarterstvbox.sbpfunction.callbackclientreport.ClientFeedbackCallback;
import com.nst.iptvsmarterstvbox.sbpfunction.singletonpushnotification.Listsingleton;
import com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity;
import com.nst.iptvsmarterstvbox.view.activity.PlayExternalPlayerActivity;
import com.nst.iptvsmarterstvbox.view.activity.SettingsActivity;
import com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerMultiActivity;
import d4.C1700q;
import d4.InterfaceC1699p;
import e4.C1737C;
import j$.util.DesugarTimeZone;
import j$.util.Objects;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import m7.AbstractC2237a;
import m7.w;
import n7.e;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.client.config.CookieSpecs;
import org.chromium.net.UrlRequest;
import org.joda.time.LocalDateTime;
import org.json.JSONObject;
import p3.AbstractC2392B;
import p3.t;
import p3.u;
import q3.C2540a;
import q7.C2635t;
import q7.Z;
import q7.m0;
import r7.AbstractC2683b;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import u7.C2858a;
import w7.AbstractC2941e;
import w7.C2939c;
import x7.C2966a;
import z7.g;
import z7.j;

/* JADX INFO: loaded from: classes4.dex */
public class NSTEXOPlayerSkyTvActivity extends androidx.appcompat.app.b implements SurfaceHolder.Callback, View.OnClickListener, j, g, CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: J5, reason: collision with root package name */
    public static SharedPreferences f34286J5;

    /* JADX INFO: renamed from: K5, reason: collision with root package name */
    public static SharedPreferences f34287K5;

    /* JADX INFO: renamed from: L5, reason: collision with root package name */
    public static boolean f34288L5;

    /* JADX INFO: renamed from: M5, reason: collision with root package name */
    public static String f34289M5;

    /* JADX INFO: renamed from: N5, reason: collision with root package name */
    public static String f34290N5;

    /* JADX INFO: renamed from: O5, reason: collision with root package name */
    public static final int[] f34291O5 = {0, 1, 2, 3, 4, 5};

    /* JADX INFO: renamed from: P5, reason: collision with root package name */
    public static ProgressBar f34292P5;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public ArrayList f34294A0;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public TextView f34295A1;

    /* JADX INFO: renamed from: A2, reason: collision with root package name */
    public Boolean f34296A2;

    /* JADX INFO: renamed from: A3, reason: collision with root package name */
    public LinearLayout f34297A3;

    /* JADX INFO: renamed from: A4, reason: collision with root package name */
    public boolean f34298A4;

    /* JADX INFO: renamed from: A5, reason: collision with root package name */
    public String f34299A5;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public ArrayList f34301B0;

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public String f34302B1;

    /* JADX INFO: renamed from: B2, reason: collision with root package name */
    public Boolean f34303B2;

    /* JADX INFO: renamed from: B3, reason: collision with root package name */
    public LinearLayout f34304B3;

    /* JADX INFO: renamed from: B4, reason: collision with root package name */
    public SharedPreferences f34305B4;

    /* JADX INFO: renamed from: B5, reason: collision with root package name */
    public String f34306B5;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public SharedPreferences f34308C0;

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public TextView f34309C1;

    /* JADX INFO: renamed from: C2, reason: collision with root package name */
    public Boolean f34310C2;

    /* JADX INFO: renamed from: C3, reason: collision with root package name */
    public Animation f34311C3;

    /* JADX INFO: renamed from: C4, reason: collision with root package name */
    public String f34312C4;

    /* JADX INFO: renamed from: C5, reason: collision with root package name */
    public List f34313C5;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f34314D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public SharedPreferences.Editor f34315D0;

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    public Handler f34316D1;

    /* JADX INFO: renamed from: D2, reason: collision with root package name */
    public Boolean f34317D2;

    /* JADX INFO: renamed from: D3, reason: collision with root package name */
    public Animation f34318D3;

    /* JADX INFO: renamed from: D4, reason: collision with root package name */
    public String f34319D4;

    /* JADX INFO: renamed from: D5, reason: collision with root package name */
    public JsonArray f34320D5;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f34321E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public ArrayList f34322E0;

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public Handler f34323E1;

    /* JADX INFO: renamed from: E2, reason: collision with root package name */
    public Boolean f34324E2;

    /* JADX INFO: renamed from: E3, reason: collision with root package name */
    public Animation f34325E3;

    /* JADX INFO: renamed from: E4, reason: collision with root package name */
    public RelativeLayout f34326E4;

    /* JADX INFO: renamed from: E5, reason: collision with root package name */
    public String f34327E5;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f34328F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public ArrayList f34329F0;

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public Handler f34330F1;

    /* JADX INFO: renamed from: F2, reason: collision with root package name */
    public C2858a f34331F2;

    /* JADX INFO: renamed from: F3, reason: collision with root package name */
    public Animation f34332F3;

    /* JADX INFO: renamed from: F4, reason: collision with root package name */
    public RelativeLayout f34333F4;

    /* JADX INFO: renamed from: F5, reason: collision with root package name */
    public String f34334F5;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public String f34335G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public RecyclerView f34336G0;

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    public Handler f34337G1;

    /* JADX INFO: renamed from: G2, reason: collision with root package name */
    public Handler f34338G2;

    /* JADX INFO: renamed from: G3, reason: collision with root package name */
    public Animation f34339G3;

    /* JADX INFO: renamed from: G4, reason: collision with root package name */
    public RelativeLayout f34340G4;

    /* JADX INFO: renamed from: G5, reason: collision with root package name */
    public int f34341G5;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public RelativeLayout f34342H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public ProgressBar f34343H0;

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    public Handler f34344H1;

    /* JADX INFO: renamed from: H2, reason: collision with root package name */
    public Handler f34345H2;

    /* JADX INFO: renamed from: H3, reason: collision with root package name */
    public Animation f34346H3;

    /* JADX INFO: renamed from: H4, reason: collision with root package name */
    public TextView f34347H4;

    /* JADX INFO: renamed from: H5, reason: collision with root package name */
    public Thread f34348H5;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ListView f34349I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public Toolbar f34350I0;

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    public Handler f34351I1;

    /* JADX INFO: renamed from: I2, reason: collision with root package name */
    public ArrayList f34352I2;

    /* JADX INFO: renamed from: I3, reason: collision with root package name */
    public Animation f34353I3;

    /* JADX INFO: renamed from: I4, reason: collision with root package name */
    public CheckBox f34354I4;

    /* JADX INFO: renamed from: I5, reason: collision with root package name */
    public ArrayList f34355I5;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ListView f34356J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public SearchView f34357J0;

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    public SharedPreferences.Editor f34358J1;

    /* JADX INFO: renamed from: J2, reason: collision with root package name */
    public int f34359J2;

    /* JADX INFO: renamed from: J3, reason: collision with root package name */
    public Animation f34360J3;

    /* JADX INFO: renamed from: J4, reason: collision with root package name */
    public CheckBox f34361J4;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public TextView f34363K0;

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    public SharedPreferences.Editor f34364K1;

    /* JADX INFO: renamed from: K2, reason: collision with root package name */
    public String f34365K2;

    /* JADX INFO: renamed from: K3, reason: collision with root package name */
    public Animation f34366K3;

    /* JADX INFO: renamed from: K4, reason: collision with root package name */
    public CheckBox f34367K4;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ArrayList f34368L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public LinearLayout f34369L0;

    /* JADX INFO: renamed from: L1, reason: collision with root package name */
    public SharedPreferences.Editor f34370L1;

    /* JADX INFO: renamed from: L2, reason: collision with root package name */
    public String f34371L2;

    /* JADX INFO: renamed from: L3, reason: collision with root package name */
    public String f34372L3;

    /* JADX INFO: renamed from: L4, reason: collision with root package name */
    public CheckBox f34373L4;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ArrayList f34374M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public LinearLayout f34375M0;

    /* JADX INFO: renamed from: M1, reason: collision with root package name */
    public TextView f34376M1;

    /* JADX INFO: renamed from: M2, reason: collision with root package name */
    public Boolean f34377M2;

    /* JADX INFO: renamed from: M3, reason: collision with root package name */
    public q7.N f34378M3;

    /* JADX INFO: renamed from: M4, reason: collision with root package name */
    public CheckBox f34379M4;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public AppBarLayout f34381N0;

    /* JADX INFO: renamed from: N2, reason: collision with root package name */
    public SeekBar f34383N2;

    /* JADX INFO: renamed from: N3, reason: collision with root package name */
    public q7.N f34384N3;

    /* JADX INFO: renamed from: N4, reason: collision with root package name */
    public CheckBox f34385N4;

    /* JADX INFO: renamed from: O2, reason: collision with root package name */
    public SeekBar f34389O2;

    /* JADX INFO: renamed from: O3, reason: collision with root package name */
    public q7.O f34390O3;

    /* JADX INFO: renamed from: O4, reason: collision with root package name */
    public CheckBox f34391O4;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public String f34392P;

    /* JADX INFO: renamed from: P1, reason: collision with root package name */
    public LinearLayout f34394P1;

    /* JADX INFO: renamed from: P2, reason: collision with root package name */
    public LinearLayout f34395P2;

    /* JADX INFO: renamed from: P3, reason: collision with root package name */
    public q7.P f34396P3;

    /* JADX INFO: renamed from: P4, reason: collision with root package name */
    public CheckBox f34397P4;

    /* JADX INFO: renamed from: Q1, reason: collision with root package name */
    public TextView f34400Q1;

    /* JADX INFO: renamed from: Q2, reason: collision with root package name */
    public LinearLayout f34401Q2;

    /* JADX INFO: renamed from: Q3, reason: collision with root package name */
    public LinearLayoutManager f34402Q3;

    /* JADX INFO: renamed from: Q4, reason: collision with root package name */
    public CheckBox f34403Q4;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public LiveStreamDBHandler f34404R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public String f34405R0;

    /* JADX INFO: renamed from: R2, reason: collision with root package name */
    public LinearLayout f34407R2;

    /* JADX INFO: renamed from: R3, reason: collision with root package name */
    public LinearLayoutManager f34408R3;

    /* JADX INFO: renamed from: R4, reason: collision with root package name */
    public RelativeLayout f34409R4;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public SharedPreferences f34410S;

    /* JADX INFO: renamed from: S1, reason: collision with root package name */
    public Boolean f34412S1;

    /* JADX INFO: renamed from: S2, reason: collision with root package name */
    public LinearLayout f34413S2;

    /* JADX INFO: renamed from: S3, reason: collision with root package name */
    public int f34414S3;

    /* JADX INFO: renamed from: S4, reason: collision with root package name */
    public CheckBox f34415S4;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public SharedPreferences f34416T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public RelativeLayout f34417T0;

    /* JADX INFO: renamed from: T1, reason: collision with root package name */
    public Boolean f34418T1;

    /* JADX INFO: renamed from: T2, reason: collision with root package name */
    public LinearLayout f34419T2;

    /* JADX INFO: renamed from: T3, reason: collision with root package name */
    public Animation f34420T3;

    /* JADX INFO: renamed from: T4, reason: collision with root package name */
    public CheckBox f34421T4;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public SharedPreferences f34422U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public LinearLayout f34423U0;

    /* JADX INFO: renamed from: U1, reason: collision with root package name */
    public Menu f34424U1;

    /* JADX INFO: renamed from: U2, reason: collision with root package name */
    public LinearLayout f34425U2;

    /* JADX INFO: renamed from: U3, reason: collision with root package name */
    public Animation f34426U3;

    /* JADX INFO: renamed from: U4, reason: collision with root package name */
    public CheckBox f34427U4;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public SharedPreferences f34428V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public RelativeLayout f34429V0;

    /* JADX INFO: renamed from: V1, reason: collision with root package name */
    public MenuItem f34430V1;

    /* JADX INFO: renamed from: V2, reason: collision with root package name */
    public LinearLayout f34431V2;

    /* JADX INFO: renamed from: V3, reason: collision with root package name */
    public String f34432V3;

    /* JADX INFO: renamed from: V4, reason: collision with root package name */
    public CheckBox f34433V4;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public SharedPreferences f34434W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public RelativeLayout f34435W0;

    /* JADX INFO: renamed from: W1, reason: collision with root package name */
    public DateFormat f34436W1;

    /* JADX INFO: renamed from: W2, reason: collision with root package name */
    public LinearLayout f34437W2;

    /* JADX INFO: renamed from: W3, reason: collision with root package name */
    public String f34438W3;

    /* JADX INFO: renamed from: W4, reason: collision with root package name */
    public TextView f34439W4;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public SharedPreferences f34440X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public RelativeLayout f34441X0;

    /* JADX INFO: renamed from: X1, reason: collision with root package name */
    public String f34442X1;

    /* JADX INFO: renamed from: X2, reason: collision with root package name */
    public RelativeLayout f34443X2;

    /* JADX INFO: renamed from: X3, reason: collision with root package name */
    public String f34444X3;

    /* JADX INFO: renamed from: X4, reason: collision with root package name */
    public LinearLayout f34445X4;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public SharedPreferences f34446Y;

    /* JADX INFO: renamed from: Y1, reason: collision with root package name */
    public String f34448Y1;

    /* JADX INFO: renamed from: Y2, reason: collision with root package name */
    public RelativeLayout f34449Y2;

    /* JADX INFO: renamed from: Y3, reason: collision with root package name */
    public String f34450Y3;

    /* JADX INFO: renamed from: Y4, reason: collision with root package name */
    public TextView f34451Y4;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public SharedPreferences f34452Z;

    /* JADX INFO: renamed from: Z1, reason: collision with root package name */
    public String f34454Z1;

    /* JADX INFO: renamed from: Z2, reason: collision with root package name */
    public RelativeLayout f34455Z2;

    /* JADX INFO: renamed from: Z3, reason: collision with root package name */
    public int f34456Z3;

    /* JADX INFO: renamed from: Z4, reason: collision with root package name */
    public TextView f34457Z4;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public TextView f34458a1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public SimpleDateFormat f34459a2;

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public ImageView f34460a3;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public n7.g f34461a4;

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    public TextView f34462a5;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public TextView f34463b1;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public PlayerView f34464b2;

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    public ImageView f34465b3;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public String f34466b4;

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    public TextView f34467b5;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public TextView f34468c1;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public Date f34469c2;

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    public ImageView f34470c3;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    public String f34471c4;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public TextView f34472c5;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public TextView f34474d1;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public String f34475d2;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public ImageView f34476d3;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    public int f34477d4;

    /* JADX INFO: renamed from: d5, reason: collision with root package name */
    public TextView f34478d5;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public SharedPreferences f34480e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public String f34481e1;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public Boolean f34482e2;

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    public ImageView f34483e3;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    public int f34484e4;

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    public TextView f34485e5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f34486f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public SimpleDateFormat f34487f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public TextView f34488f1;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public androidx.appcompat.app.a f34489f2;

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    public ImageView f34490f3;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    public List f34491f4;

    /* JADX INFO: renamed from: f5, reason: collision with root package name */
    public TextView f34492f5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f34493g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public String f34494g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public TextView f34495g1;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public String f34496g2;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public ImageView f34497g3;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public e f34498g4;

    /* JADX INFO: renamed from: g5, reason: collision with root package name */
    public EditText f34499g5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f34500h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public RelativeLayout f34501h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public TextView f34502h1;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public Boolean f34503h2;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public TextView f34504h3;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public int f34505h4;

    /* JADX INFO: renamed from: h5, reason: collision with root package name */
    public LinearLayout f34506h5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f34507i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public TextView f34509i1;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public D7.b f34510i2;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public TextView f34511i3;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public boolean f34512i4;

    /* JADX INFO: renamed from: i5, reason: collision with root package name */
    public LinearLayout f34513i5;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f34514j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public TextView f34515j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public TextView f34516j1;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public String f34517j2;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public TextView f34518j3;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public boolean f34519j4;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public LinearLayout f34520j5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f34521k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public ArrayList f34522k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public TextView f34523k1;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public int f34524k2;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public TextView f34525k3;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public MultiUserDBHandler f34526k4;

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    public LinearLayout f34527k5;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f34528l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public ArrayList f34529l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public TextView f34530l1;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public int f34531l2;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public LinearLayout f34532l3;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    public Thread f34533l4;

    /* JADX INFO: renamed from: l5, reason: collision with root package name */
    public ImageView f34534l5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f34535m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public ArrayList f34536m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public TextView f34537m1;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public String f34538m2;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public LinearLayout f34539m3;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    public Boolean f34540m4;

    /* JADX INFO: renamed from: m5, reason: collision with root package name */
    public RelativeLayout f34541m5;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public ArrayList f34543n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public LinearLayout f34544n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public Boolean f34545n2;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public LinearLayout f34546n3;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    public boolean f34547n4;

    /* JADX INFO: renamed from: n5, reason: collision with root package name */
    public LinearLayout f34548n5;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinearLayout f34549o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public ArrayList f34550o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public String f34551o1;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public AsyncTask f34552o2;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public LinearLayout f34553o3;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    public String f34554o4;

    /* JADX INFO: renamed from: o5, reason: collision with root package name */
    public LinearLayout f34555o5;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f34556p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ArrayList f34557p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public LinearLayout f34558p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public AsyncTask f34559p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public LinearLayout f34560p3;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    public String f34561p4;

    /* JADX INFO: renamed from: p5, reason: collision with root package name */
    public LinearLayout f34562p5;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f34563q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ArrayList f34564q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public LinearLayout f34565q1;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public AsyncTask f34566q2;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public LinearLayout f34567q3;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    public int f34568q4;

    /* JADX INFO: renamed from: q5, reason: collision with root package name */
    public LinearLayout f34569q5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f34570r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ArrayList f34571r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public LinearLayout f34572r1;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public ProgressDialog f34573r2;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public LinearLayout f34574r3;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    public I1 f34575r4;

    /* JADX INFO: renamed from: r5, reason: collision with root package name */
    public LinearLayout f34576r5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f34577s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ArrayList f34578s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public LinearLayout f34579s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public boolean f34580s2;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public LinearLayout f34581s3;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    public InterfaceC1224o.a f34582s4;

    /* JADX INFO: renamed from: s5, reason: collision with root package name */
    public RelativeLayout f34583s5;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f34584t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ArrayList f34585t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public LinearLayout f34586t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public int f34587t2;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public LinearLayout f34588t3;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    public m f34589t4;

    /* JADX INFO: renamed from: t5, reason: collision with root package name */
    public String f34590t5;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f34591u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ArrayList f34592u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public String f34593u1;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public boolean f34594u2;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public RecyclerView f34595u3;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    public m.d f34596u4;

    /* JADX INFO: renamed from: u5, reason: collision with root package name */
    public String f34597u5;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinearLayout f34598v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public ArrayList f34599v0;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public int f34601v2;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public RecyclerView f34602v3;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    public Uri f34603v4;

    /* JADX INFO: renamed from: v5, reason: collision with root package name */
    public String f34604v5;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ProgressBar f34605w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ArrayList f34606w0;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public int f34608w2;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public EditText f34609w3;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    public int f34610w4;

    /* JADX INFO: renamed from: w5, reason: collision with root package name */
    public String f34611w5;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public LinearLayout f34612x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ArrayList f34613x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public DatabaseHandler f34614x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public SharedPreferences f34615x2;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public LinearLayout f34616x3;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public int f34617x4;

    /* JADX INFO: renamed from: x5, reason: collision with root package name */
    public String f34618x5;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public LinearLayout f34619y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ArrayList f34620y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public SharedPreferences.Editor f34621y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public SharedPreferences.Editor f34622y2;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public LinearLayout f34623y3;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    public boolean f34624y4;

    /* JADX INFO: renamed from: y5, reason: collision with root package name */
    public String f34625y5;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public SharedPreferences.Editor f34628z1;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public Boolean f34629z2;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public RelativeLayout f34630z3;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    public boolean f34631z4;

    /* JADX INFO: renamed from: z5, reason: collision with root package name */
    public String f34632z5;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34473d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f34479e = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f34542n = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f34626z = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f34293A = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f34300B = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f34307C = false;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ArrayList f34362K = new ArrayList();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f34380N = true;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public long f34386O = 2500;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f34398Q = true;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f34508i0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public ArrayList f34627z0 = new ArrayList();

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public boolean f34387O0 = true;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public boolean f34393P0 = false;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public boolean f34399Q0 = false;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public boolean f34411S0 = true;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public String f34447Y0 = "";

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public String f34453Z0 = "";

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public int f34600v1 = -1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public String f34607w1 = "";

    /* JADX INFO: renamed from: N1, reason: collision with root package name */
    public int f34382N1 = 0;

    /* JADX INFO: renamed from: O1, reason: collision with root package name */
    public StringBuilder f34388O1 = new StringBuilder();

    /* JADX INFO: renamed from: R1, reason: collision with root package name */
    public int f34406R1 = -1;

    public class A implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LinearLayout f34633a;

        public A(LinearLayout linearLayout) {
            this.f34633a = linearLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayout linearLayout;
            this.f34633a.setVisibility(8);
            if (NSTEXOPlayerSkyTvActivity.this.f34413S2.getVisibility() != 0 || (linearLayout = NSTEXOPlayerSkyTvActivity.this.f34407R2) == null) {
                return;
            }
            linearLayout.setVisibility(0);
        }
    }

    public class B implements Callback {
        public B() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            Log.e("onFailure", th.getMessage().toString());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Toast toastMakeText;
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity;
            String strMessage;
            if (response == null) {
                toastMakeText = Toast.makeText(NSTEXOPlayerSkyTvActivity.this, "Something went Wrong Report not Submitted", 0);
            } else {
                if (response.body() == null || !response.isSuccessful()) {
                    if (response.message() != null && !response.message().equals("")) {
                        nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                        strMessage = response.message();
                    }
                    toastMakeText = Toast.makeText(NSTEXOPlayerSkyTvActivity.this, "Something went Wrong Report not Submitted", 0);
                } else if (((ClientFeedbackCallback) response.body()).a() == null || !((ClientFeedbackCallback) response.body()).a().equalsIgnoreCase("success")) {
                    nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                    strMessage = "Something went Wrong";
                } else {
                    nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                    strMessage = "Reported Successfully";
                }
                toastMakeText = Toast.makeText(nSTEXOPlayerSkyTvActivity, strMessage, 0);
            }
            toastMakeText.show();
        }
    }

    public class C implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f34636a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f34637c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f34638d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AdapterView f34639e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f34640f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f34641g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ ArrayList f34642h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Dialog f34643i;

        public C(String str, String str2, String str3, AdapterView adapterView, int i9, long j9, ArrayList arrayList, Dialog dialog) {
            this.f34636a = str;
            this.f34637c = str2;
            this.f34638d = str3;
            this.f34639e = adapterView;
            this.f34640f = i9;
            this.f34641g = j9;
            this.f34642h = arrayList;
            this.f34643i = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (AbstractC2237a.f44487b) {
                NSTEXOPlayerSkyTvActivity.this.Z3(this.f34636a, this.f34637c, this.f34638d);
            }
            NSTEXOPlayerSkyTvActivity.this.Y3(this.f34639e, view, this.f34640f, this.f34641g, this.f34642h);
            this.f34643i.dismiss();
        }
    }

    public class D implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f34645a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f34646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f34647d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AdapterView f34648e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f34649f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f34650g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ ArrayList f34651h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Dialog f34652i;

        public D(String str, String str2, String str3, AdapterView adapterView, int i9, long j9, ArrayList arrayList, Dialog dialog) {
            this.f34645a = str;
            this.f34646c = str2;
            this.f34647d = str3;
            this.f34648e = adapterView;
            this.f34649f = i9;
            this.f34650g = j9;
            this.f34651h = arrayList;
            this.f34652i = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (AbstractC2237a.f44487b) {
                NSTEXOPlayerSkyTvActivity.this.Z3(this.f34645a, this.f34646c, this.f34647d);
            }
            NSTEXOPlayerSkyTvActivity.this.Y3(this.f34648e, view, this.f34649f, this.f34650g, this.f34651h);
            this.f34652i.dismiss();
        }
    }

    public class E implements View.OnClickListener {
        public E() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                NSTEXOPlayerSkyTvActivity.this.f34482e2 = Boolean.TRUE;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", NSTEXOPlayerSkyTvActivity.this.getPackageName(), null));
                NSTEXOPlayerSkyTvActivity.this.startActivityForResult(intent, 101);
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                Toast.makeText(nSTEXOPlayerSkyTvActivity, nSTEXOPlayerSkyTvActivity.f34486f.getResources().getString(a7.j.f13339o2), 1).show();
            } catch (Exception unused) {
            }
            NSTEXOPlayerSkyTvActivity.this.f34489f2.dismiss();
        }
    }

    public class F implements View.OnClickListener {
        public F() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTEXOPlayerSkyTvActivity.this.f34489f2.dismiss();
        }
    }

    public class G implements Runnable {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f34657a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f34658c;

            public a(String str, String str2) {
                this.f34657a = str;
                this.f34658c = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    TextView textView = NSTEXOPlayerSkyTvActivity.this.f34309C1;
                    if (textView != null) {
                        textView.setText(this.f34657a);
                    }
                    TextView textView2 = NSTEXOPlayerSkyTvActivity.this.f34295A1;
                    if (textView2 != null) {
                        textView2.setText(this.f34658c);
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
        }

        public G() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String string = Calendar.getInstance().getTime().toString();
            NSTEXOPlayerSkyTvActivity.this.runOnUiThread(new a(m7.w.R(NSTEXOPlayerSkyTvActivity.this.f34486f), m7.w.A(string)));
        }
    }

    public class H implements AdapterView.OnItemClickListener {
        public H() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i9, long j9) {
            String cmd;
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity;
            n7.g gVar;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            NSTEXOPlayerSkyTvActivity.this.f34484e4 = i9;
            if (!SharepreferenceDBHandler.getCurrentAPPType(NSTEXOPlayerSkyTvActivity.this.f34486f).equals("stalker_api")) {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = NSTEXOPlayerSkyTvActivity.this;
                nSTEXOPlayerSkyTvActivity2.j4(nSTEXOPlayerSkyTvActivity2.f34484e4, NSTEXOPlayerSkyTvActivity.this.f34374M);
                return;
            }
            try {
                String stalkerToken = SharepreferenceDBHandler.getStalkerToken(NSTEXOPlayerSkyTvActivity.this.f34486f);
                String loggedInMacAddress = SharepreferenceDBHandler.getLoggedInMacAddress(NSTEXOPlayerSkyTvActivity.this.f34486f);
                ArrayList arrayListG = NSTEXOPlayerSkyTvActivity.this.f34396P3.g();
                if (arrayListG != null && arrayListG.size() > 0) {
                    cmd = ((LiveStreamsDBModel) arrayListG.get(NSTEXOPlayerSkyTvActivity.this.f34484e4)).getCmd();
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity3 = NSTEXOPlayerSkyTvActivity.this;
                    if (nSTEXOPlayerSkyTvActivity3.f34600v1 == m7.w.q0(((LiveStreamsDBModel) arrayListG.get(nSTEXOPlayerSkyTvActivity3.f34484e4)).getStreamId())) {
                        nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                        nSTEXOPlayerSkyTvActivity.C3();
                        return;
                    }
                    m7.w.N0(NSTEXOPlayerSkyTvActivity.this.f34486f);
                    gVar = NSTEXOPlayerSkyTvActivity.this.f34461a4;
                    str = "";
                    str2 = "itv";
                    str3 = "";
                    str4 = "";
                    str5 = "";
                    str6 = "";
                    str7 = "";
                    str8 = "channel_click_from_player";
                    str9 = "";
                    str10 = "";
                    gVar.c(loggedInMacAddress, stalkerToken, cmd, str, null, str2, 0, 0, str3, str4, str5, str6, str7, str8, 0, str9, str10);
                }
                if (NSTEXOPlayerSkyTvActivity.this.f34585t0 == null || NSTEXOPlayerSkyTvActivity.this.f34585t0.size() <= 0) {
                    return;
                }
                cmd = ((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(NSTEXOPlayerSkyTvActivity.this.f34484e4)).getCmd();
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity4 = NSTEXOPlayerSkyTvActivity.this;
                if (nSTEXOPlayerSkyTvActivity4.f34600v1 == m7.w.q0(((LiveStreamsDBModel) nSTEXOPlayerSkyTvActivity4.f34585t0.get(NSTEXOPlayerSkyTvActivity.this.f34484e4)).getStreamId())) {
                    nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                    nSTEXOPlayerSkyTvActivity.C3();
                    return;
                }
                m7.w.N0(NSTEXOPlayerSkyTvActivity.this.f34486f);
                gVar = NSTEXOPlayerSkyTvActivity.this.f34461a4;
                str = "";
                str2 = "itv";
                str3 = "";
                str4 = "";
                str5 = "";
                str6 = "";
                str7 = "";
                str8 = "channel_click_from_player";
                str9 = "";
                str10 = "";
                gVar.c(loggedInMacAddress, stalkerToken, cmd, str, null, str2, 0, 0, str3, str4, str5, str6, str7, str8, 0, str9, str10);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public class I implements Runnable {
        public I() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    NSTEXOPlayerSkyTvActivity.this.y3();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class J implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f34662a;

        public J(View view) {
            this.f34662a = view;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (z9) {
                View view2 = this.f34662a;
                if (view2 == null || view2.getTag() == null) {
                    return;
                }
                this.f34662a.getTag().equals("iv_cross");
                return;
            }
            View view3 = this.f34662a;
            if (view3 == null || view3.getTag() == null || !this.f34662a.getTag().equals("iv_cross")) {
                return;
            }
            view.setBackground(NSTEXOPlayerSkyTvActivity.this.getResources().getDrawable(a7.e.f11933L));
        }
    }

    public class K extends AsyncTask {
        public K() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(NSTEXOPlayerSkyTvActivity.this.T3());
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            NSTEXOPlayerSkyTvActivity.this.v4("", true);
            NSTEXOPlayerSkyTvActivity.this.f34540m4 = Boolean.TRUE;
            if (NSTEXOPlayerSkyTvActivity.this.f34464b2 != null) {
                NSTEXOPlayerSkyTvActivity.this.f34464b2.setEPGHandler(NSTEXOPlayerSkyTvActivity.this.f34337G1);
                NSTEXOPlayerSkyTvActivity.this.f34464b2.setContext(NSTEXOPlayerSkyTvActivity.this.f34486f);
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (NSTEXOPlayerSkyTvActivity.this.f34573r2 == null) {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                nSTEXOPlayerSkyTvActivity.f34573r2 = NSTEXOPlayerSkyTvActivity.w3(nSTEXOPlayerSkyTvActivity.f34486f);
                if (NSTEXOPlayerSkyTvActivity.this.f34573r2 == null) {
                    return;
                }
            } else if (NSTEXOPlayerSkyTvActivity.this.f34573r2.isShowing()) {
                return;
            }
            NSTEXOPlayerSkyTvActivity.this.f34573r2.show();
        }
    }

    public class L implements Runnable {
        public L() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    if (SharepreferenceDBHandler.getMaintanceModeState(NSTEXOPlayerSkyTvActivity.this.f34486f)) {
                        NSTEXOPlayerSkyTvActivity.this.f34486f.startActivity(new Intent(NSTEXOPlayerSkyTvActivity.this.f34486f, (Class<?>) MaintanencePannelActivity.class));
                    }
                    Thread.sleep(10000L);
                } catch (InterruptedException e9) {
                    Log.e("honey", "exc2: " + e9.getMessage());
                    Thread.currentThread().interrupt();
                } catch (Exception e10) {
                    Log.e("honey", "exc2: " + e10.getMessage());
                }
            }
        }
    }

    public class M extends AsyncTask {
        public M() {
        }

        public String a() {
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity;
            LiveStreamDBHandler liveStreamDBHandler;
            String str;
            String string;
            SharedPreferences sharedPreferences;
            String str2;
            try {
                NSTEXOPlayerSkyTvActivity.this.f34587t2 = 0;
                if (NSTEXOPlayerSkyTvActivity.this.f34571r0 != null && NSTEXOPlayerSkyTvActivity.this.f34557p0 != null) {
                    NSTEXOPlayerSkyTvActivity.this.f34571r0.clear();
                    NSTEXOPlayerSkyTvActivity.this.f34557p0.clear();
                }
                if (NSTEXOPlayerSkyTvActivity.this.f34444X3.equals("true")) {
                    nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                    liveStreamDBHandler = nSTEXOPlayerSkyTvActivity.f34404R;
                    str = "radio_streams";
                } else {
                    nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                    liveStreamDBHandler = nSTEXOPlayerSkyTvActivity.f34404R;
                    str = "live";
                }
                nSTEXOPlayerSkyTvActivity.f34571r0 = liveStreamDBHandler.getAllLiveStreasWithCategoryId("0", str);
                if (NSTEXOPlayerSkyTvActivity.this.f34578s0 != null) {
                    NSTEXOPlayerSkyTvActivity.this.f34578s0.clear();
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone(NSTEXOPlayerSkyTvActivity.this.f34331F2.C()));
                String str3 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + m7.w.S(NSTEXOPlayerSkyTvActivity.this.f34486f)));
                boolean zB = NSTEXOPlayerSkyTvActivity.this.f34331F2.B();
                ArrayList<XMLTVProgrammePojo> ePGTesting = zB ? NSTEXOPlayerSkyTvActivity.this.f34404R.getEPGTesting(null, str3) : null;
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = NSTEXOPlayerSkyTvActivity.this;
                nSTEXOPlayerSkyTvActivity2.f34440X = nSTEXOPlayerSkyTvActivity2.getSharedPreferences("currentlyPlayingVideo", 0);
                if (SharepreferenceDBHandler.getCurrentAPPType(NSTEXOPlayerSkyTvActivity.this.f34486f).equals("m3u")) {
                    sharedPreferences = NSTEXOPlayerSkyTvActivity.this.f34434W;
                    str2 = "LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U";
                } else {
                    if (!SharepreferenceDBHandler.getCurrentAPPType(NSTEXOPlayerSkyTvActivity.this.f34486f).equals("onestream_api")) {
                        string = (SharepreferenceDBHandler.getCurrentAPPType(NSTEXOPlayerSkyTvActivity.this.f34486f).equals("onestream_api") ? NSTEXOPlayerSkyTvActivity.this : NSTEXOPlayerSkyTvActivity.this).f34434W.getString("currentlyPlayingVideo", "");
                        if (NSTEXOPlayerSkyTvActivity.this.f34571r0 == null && NSTEXOPlayerSkyTvActivity.this.f34571r0.size() > 0) {
                            for (int i9 = 0; i9 < NSTEXOPlayerSkyTvActivity.this.f34571r0.size(); i9++) {
                                if (NSTEXOPlayerSkyTvActivity.this.f34552o2 != null && NSTEXOPlayerSkyTvActivity.this.f34552o2.isCancelled()) {
                                    return "all_channels";
                                }
                                if (SharepreferenceDBHandler.getCurrentAPPType(NSTEXOPlayerSkyTvActivity.this.f34486f).equals("m3u") && ((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34571r0.get(i9)).getUrl().equals(string)) {
                                    NSTEXOPlayerSkyTvActivity.this.f34587t2 = i9;
                                }
                                if (SharepreferenceDBHandler.getCurrentAPPType(NSTEXOPlayerSkyTvActivity.this.f34486f).equals("onestream_api")) {
                                    if (((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34571r0.get(i9)).getStreamIdOneStream().equals(string)) {
                                        NSTEXOPlayerSkyTvActivity.this.f34587t2 = i9;
                                    }
                                } else if (((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34571r0.get(i9)).getStreamId().equals(string)) {
                                    NSTEXOPlayerSkyTvActivity.this.f34587t2 = i9;
                                }
                                LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                                liveStreamsDBModel.setNum(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34571r0.get(i9)).getNum());
                                liveStreamsDBModel.setName(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34571r0.get(i9)).getName());
                                liveStreamsDBModel.setStreamType(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34571r0.get(i9)).getStreamType());
                                liveStreamsDBModel.setStreamId(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34571r0.get(i9)).getStreamId());
                                liveStreamsDBModel.setStreamIcon(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34571r0.get(i9)).getStreamIcon());
                                liveStreamsDBModel.setEpgChannelId(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34571r0.get(i9)).getEpgChannelId());
                                liveStreamsDBModel.setAdded(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34571r0.get(i9)).getAdded());
                                liveStreamsDBModel.setCategoryId(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34571r0.get(i9)).getCategoryId());
                                liveStreamsDBModel.setCustomSid(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34571r0.get(i9)).getCustomSid());
                                liveStreamsDBModel.setTvArchive(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34571r0.get(i9)).getTvArchive());
                                liveStreamsDBModel.setDirectSource(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34571r0.get(i9)).getDirectSource());
                                liveStreamsDBModel.setTvArchiveDuration(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34571r0.get(i9)).getTvArchiveDuration());
                                liveStreamsDBModel.setTypeName(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34571r0.get(i9)).getTypeName());
                                liveStreamsDBModel.setCategoryName(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34571r0.get(i9)).getCategoryName());
                                liveStreamsDBModel.setSeriesNo(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34571r0.get(i9)).getSeriesNo());
                                liveStreamsDBModel.setLive(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34571r0.get(i9)).getLive());
                                liveStreamsDBModel.setContaiinerExtension(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34571r0.get(i9)).getContaiinerExtension());
                                liveStreamsDBModel.setUrl(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34571r0.get(i9)).getUrl());
                                liveStreamsDBModel.setCmd(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34571r0.get(i9)).getCmd());
                                if (zB && ePGTesting != null && ePGTesting.size() > 0) {
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 >= ePGTesting.size() || (NSTEXOPlayerSkyTvActivity.this.f34552o2 != null && NSTEXOPlayerSkyTvActivity.this.f34552o2.isCancelled())) {
                                            break;
                                        }
                                        if (((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34571r0.get(i9)).getEpgChannelId().equals(ePGTesting.get(i10).getChannel())) {
                                            int iM = m7.w.M(m7.w.x(ePGTesting.get(i10).getStart(), NSTEXOPlayerSkyTvActivity.this.f34486f), m7.w.x(ePGTesting.get(i10).getStop(), NSTEXOPlayerSkyTvActivity.this.f34486f), NSTEXOPlayerSkyTvActivity.this.f34486f);
                                            if (iM != 0) {
                                                iM = 100 - iM;
                                            }
                                            liveStreamsDBModel.setEpgPercentage(iM);
                                            liveStreamsDBModel.setProgramName(ePGTesting.get(i10).getTitle());
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                                NSTEXOPlayerSkyTvActivity.this.f34578s0.add(liveStreamsDBModel);
                            }
                            return "all_channels";
                        }
                    }
                    sharedPreferences = NSTEXOPlayerSkyTvActivity.this.f34434W;
                    str2 = "LOGIN_PREF_CURRENTLY_PLAYING_VIDEO";
                }
                string = sharedPreferences.getString(str2, "");
                return NSTEXOPlayerSkyTvActivity.this.f34571r0 == null ? "all_channels" : "all_channels";
            } catch (Exception unused) {
                return "all_channels";
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r0 = 0
                r6 = r6[r0]     // Catch: java.lang.Exception -> L17
                int r1 = r6.hashCode()     // Catch: java.lang.Exception -> L17
                r2 = 2
                r3 = 1
                r4 = 3
                switch(r1) {
                    case -74797390: goto L2d;
                    case 47612238: goto L23;
                    case 301138327: goto L19;
                    case 613425326: goto Le;
                    default: goto Ld;
                }     // Catch: java.lang.Exception -> L17
            Ld:
                goto L37
            Le:
                java.lang.String r1 = "all_channels"
                boolean r6 = r6.equals(r1)     // Catch: java.lang.Exception -> L17
                if (r6 == 0) goto L37
                goto L38
            L17:
                r6 = move-exception
                goto L5c
            L19:
                java.lang.String r0 = "recently_watched"
                boolean r6 = r6.equals(r0)     // Catch: java.lang.Exception -> L17
                if (r6 == 0) goto L37
                r0 = 3
                goto L38
            L23:
                java.lang.String r0 = "all_channels_with_cat"
                boolean r6 = r6.equals(r0)     // Catch: java.lang.Exception -> L17
                if (r6 == 0) goto L37
                r0 = 1
                goto L38
            L2d:
                java.lang.String r0 = "get_fav"
                boolean r6 = r6.equals(r0)     // Catch: java.lang.Exception -> L17
                if (r6 == 0) goto L37
                r0 = 2
                goto L38
            L37:
                r0 = -1
            L38:
                if (r0 == 0) goto L57
                if (r0 == r3) goto L50
                if (r0 == r2) goto L49
                if (r0 == r4) goto L42
                r6 = 0
                return r6
            L42:
                com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity r6 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> L17
                java.lang.String r6 = r6.m3()     // Catch: java.lang.Exception -> L17
                return r6
            L49:
                com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity r6 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> L17
                java.lang.String r6 = r6.F3()     // Catch: java.lang.Exception -> L17
                return r6
            L50:
                com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity r6 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> L17
                java.lang.String r6 = r6.i3()     // Catch: java.lang.Exception -> L17
                return r6
            L57:
                java.lang.String r6 = r5.a()     // Catch: java.lang.Exception -> L17
                return r6
            L5c:
                r6.printStackTrace()
                java.lang.String r6 = "error"
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.M.doInBackground(java.lang.String[]):java.lang.String");
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (NSTEXOPlayerSkyTvActivity.this.f34578s0 != null) {
                    if (!NSTEXOPlayerSkyTvActivity.this.f34418T1.booleanValue()) {
                        NSTEXOPlayerSkyTvActivity.this.f34418T1 = Boolean.TRUE;
                        if (NSTEXOPlayerSkyTvActivity.this.f34578s0.size() == 0) {
                            AbstractC2237a.f44480Y = Boolean.FALSE;
                            NSTEXOPlayerSkyTvActivity.this.f4();
                            NSTEXOPlayerSkyTvActivity.this.f34464b2.setVisibility(8);
                            NSTEXOPlayerSkyTvActivity.this.f34549o.setVisibility(0);
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                            nSTEXOPlayerSkyTvActivity.f34556p.setText(nSTEXOPlayerSkyTvActivity.getResources().getString(a7.j.f13261g4));
                        } else if (NSTEXOPlayerSkyTvActivity.this.f34599v0 != null) {
                            NSTEXOPlayerSkyTvActivity.this.f34599v0.clear();
                            NSTEXOPlayerSkyTvActivity.this.f34599v0.addAll(NSTEXOPlayerSkyTvActivity.this.f34578s0);
                        }
                    }
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = NSTEXOPlayerSkyTvActivity.this;
                    if (nSTEXOPlayerSkyTvActivity2.f34393P0 && nSTEXOPlayerSkyTvActivity2.f34399Q0 && !nSTEXOPlayerSkyTvActivity2.f34405R0.equals("")) {
                        NSTEXOPlayerSkyTvActivity.this.f34587t2 = 0;
                        try {
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity3 = NSTEXOPlayerSkyTvActivity.this;
                            nSTEXOPlayerSkyTvActivity3.f34587t2 = nSTEXOPlayerSkyTvActivity3.I3(nSTEXOPlayerSkyTvActivity3.f34578s0, m7.w.r0(NSTEXOPlayerSkyTvActivity.this.f34405R0));
                        } catch (NumberFormatException | Exception e9) {
                            e9.printStackTrace();
                        }
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity4 = NSTEXOPlayerSkyTvActivity.this;
                        nSTEXOPlayerSkyTvActivity4.f34393P0 = false;
                        nSTEXOPlayerSkyTvActivity4.f34399Q0 = false;
                    }
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity5 = NSTEXOPlayerSkyTvActivity.this;
                    nSTEXOPlayerSkyTvActivity5.t4(nSTEXOPlayerSkyTvActivity5.f34578s0);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            try {
                TextView textView = NSTEXOPlayerSkyTvActivity.this.f34363K0;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                TextView textView2 = nSTEXOPlayerSkyTvActivity.f34515j0;
                if (textView2 != null) {
                    textView2.setText(nSTEXOPlayerSkyTvActivity.f34453Z0);
                    NSTEXOPlayerSkyTvActivity.this.f34515j0.setSelected(true);
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public class N extends AsyncTask {
        public N() {
        }

        public String a() {
            LiveStreamDBHandler liveStreamDBHandler;
            String str;
            String str2;
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity;
            try {
                NSTEXOPlayerSkyTvActivity.this.f34414S3 = 0;
                if (NSTEXOPlayerSkyTvActivity.this.f34585t0 != null) {
                    NSTEXOPlayerSkyTvActivity.this.f34585t0.clear();
                }
                if (NSTEXOPlayerSkyTvActivity.this.f34444X3.equals("true")) {
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = NSTEXOPlayerSkyTvActivity.this;
                    liveStreamDBHandler = nSTEXOPlayerSkyTvActivity2.f34404R;
                    str = nSTEXOPlayerSkyTvActivity2.f34371L2;
                    str2 = "radio_streams";
                } else {
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity3 = NSTEXOPlayerSkyTvActivity.this;
                    liveStreamDBHandler = nSTEXOPlayerSkyTvActivity3.f34404R;
                    str = nSTEXOPlayerSkyTvActivity3.f34371L2;
                    str2 = "live";
                }
                NSTEXOPlayerSkyTvActivity.this.f34585t0 = liveStreamDBHandler.getAllLiveStreasWithCategoryId(str, str2);
                if (NSTEXOPlayerSkyTvActivity.this.f34592u0 != null) {
                    NSTEXOPlayerSkyTvActivity.this.f34592u0.clear();
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone(NSTEXOPlayerSkyTvActivity.this.f34331F2.C()));
                String str3 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + m7.w.S(NSTEXOPlayerSkyTvActivity.this.f34486f)));
                boolean zB = NSTEXOPlayerSkyTvActivity.this.f34331F2.B();
                ArrayList<XMLTVProgrammePojo> ePGTesting = zB ? NSTEXOPlayerSkyTvActivity.this.f34404R.getEPGTesting(null, str3) : null;
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity4 = NSTEXOPlayerSkyTvActivity.this;
                nSTEXOPlayerSkyTvActivity4.f34440X = nSTEXOPlayerSkyTvActivity4.getSharedPreferences("currentlyPlayingVideo", 0);
                String string = SharepreferenceDBHandler.getCurrentAPPType(NSTEXOPlayerSkyTvActivity.this.f34486f).equals("m3u") ? NSTEXOPlayerSkyTvActivity.this.f34434W.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", "") : (SharepreferenceDBHandler.getCurrentAPPType(NSTEXOPlayerSkyTvActivity.this.f34486f).equals("onestream_api") ? NSTEXOPlayerSkyTvActivity.this : NSTEXOPlayerSkyTvActivity.this).f34434W.getString("currentlyPlayingVideo", "");
                if (NSTEXOPlayerSkyTvActivity.this.f34585t0 != null && NSTEXOPlayerSkyTvActivity.this.f34585t0.size() > 0) {
                    for (int i9 = 0; i9 < NSTEXOPlayerSkyTvActivity.this.f34585t0.size() && (NSTEXOPlayerSkyTvActivity.this.f34552o2 == null || !NSTEXOPlayerSkyTvActivity.this.f34552o2.isCancelled()); i9++) {
                        if (SharepreferenceDBHandler.getCurrentAPPType(NSTEXOPlayerSkyTvActivity.this.f34486f).equals("m3u")) {
                            if (((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(i9)).getUrl().equals(string)) {
                                NSTEXOPlayerSkyTvActivity.this.f34414S3 = i9;
                                nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                                nSTEXOPlayerSkyTvActivity.f34382N1 = nSTEXOPlayerSkyTvActivity.f34414S3;
                            }
                        } else if (SharepreferenceDBHandler.getCurrentAPPType(NSTEXOPlayerSkyTvActivity.this.f34486f).equals("onestream_api")) {
                            if (((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(i9)).getStreamIdOneStream().equals(string)) {
                                NSTEXOPlayerSkyTvActivity.this.f34414S3 = i9;
                                nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                                nSTEXOPlayerSkyTvActivity.f34382N1 = nSTEXOPlayerSkyTvActivity.f34414S3;
                            }
                        } else if (((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(i9)).getStreamId().equals(string)) {
                            NSTEXOPlayerSkyTvActivity.this.f34414S3 = i9;
                            nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                            nSTEXOPlayerSkyTvActivity.f34382N1 = nSTEXOPlayerSkyTvActivity.f34414S3;
                        }
                        LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                        liveStreamsDBModel.setNum(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(i9)).getNum());
                        liveStreamsDBModel.setName(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(i9)).getName());
                        liveStreamsDBModel.setStreamType(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(i9)).getStreamType());
                        liveStreamsDBModel.setStreamId(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(i9)).getStreamId());
                        liveStreamsDBModel.setStreamIdOneStream(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(i9)).getStreamIdOneStream());
                        liveStreamsDBModel.setStreamIcon(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(i9)).getStreamIcon());
                        liveStreamsDBModel.setEpgChannelId(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(i9)).getEpgChannelId());
                        liveStreamsDBModel.setAdded(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(i9)).getAdded());
                        liveStreamsDBModel.setCategoryId(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(i9)).getCategoryId());
                        liveStreamsDBModel.setCustomSid(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(i9)).getCustomSid());
                        liveStreamsDBModel.setTvArchive(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(i9)).getTvArchive());
                        liveStreamsDBModel.setDirectSource(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(i9)).getDirectSource());
                        liveStreamsDBModel.setTvArchiveDuration(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(i9)).getTvArchiveDuration());
                        liveStreamsDBModel.setTypeName(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(i9)).getTypeName());
                        liveStreamsDBModel.setCategoryName(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(i9)).getCategoryName());
                        liveStreamsDBModel.setSeriesNo(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(i9)).getSeriesNo());
                        liveStreamsDBModel.setLive(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(i9)).getLive());
                        liveStreamsDBModel.setContaiinerExtension(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(i9)).getContaiinerExtension());
                        liveStreamsDBModel.setUrl(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(i9)).getUrl());
                        liveStreamsDBModel.setCmd(((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(i9)).getCmd());
                        if (zB && ePGTesting != null && ePGTesting.size() > 0) {
                            int i10 = 0;
                            while (true) {
                                if (i10 < ePGTesting.size() && (NSTEXOPlayerSkyTvActivity.this.f34552o2 == null || !NSTEXOPlayerSkyTvActivity.this.f34552o2.isCancelled())) {
                                    if (((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(i9)).getEpgChannelId().equals(ePGTesting.get(i10).getChannel())) {
                                        int iM = m7.w.M(m7.w.x(ePGTesting.get(i10).getStart(), NSTEXOPlayerSkyTvActivity.this.f34486f), m7.w.x(ePGTesting.get(i10).getStop(), NSTEXOPlayerSkyTvActivity.this.f34486f), NSTEXOPlayerSkyTvActivity.this.f34486f);
                                        if (iM != 0) {
                                            iM = 100 - iM;
                                        }
                                        liveStreamsDBModel.setEpgPercentage(iM);
                                        liveStreamsDBModel.setProgramName(ePGTesting.get(i10).getTitle());
                                    } else {
                                        i10++;
                                    }
                                }
                            }
                        }
                        NSTEXOPlayerSkyTvActivity.this.f34592u0.add(liveStreamsDBModel);
                    }
                }
                NSTEXOPlayerSkyTvActivity.this.f34585t0.clear();
                NSTEXOPlayerSkyTvActivity.this.f34585t0.addAll(NSTEXOPlayerSkyTvActivity.this.f34592u0);
                return "all_channels_with_cat";
            } catch (Exception unused) {
                return "all_channels_with_cat";
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                return NSTEXOPlayerSkyTvActivity.this.f34371L2.equals("-1") ? SharepreferenceDBHandler.getCurrentAPPType(NSTEXOPlayerSkyTvActivity.this.f34486f).equals("m3u") ? NSTEXOPlayerSkyTvActivity.this.F3() : NSTEXOPlayerSkyTvActivity.this.G3() : NSTEXOPlayerSkyTvActivity.this.f34371L2.equals("-6") ? NSTEXOPlayerSkyTvActivity.this.m3() : a();
            } catch (Exception unused) {
                return "error";
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (NSTEXOPlayerSkyTvActivity.this.f34585t0 != null) {
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                    nSTEXOPlayerSkyTvActivity.u4(nSTEXOPlayerSkyTvActivity.f34585t0);
                    if (!NSTEXOPlayerSkyTvActivity.this.f34418T1.booleanValue()) {
                        NSTEXOPlayerSkyTvActivity.this.f34418T1 = Boolean.TRUE;
                        if (NSTEXOPlayerSkyTvActivity.this.f34585t0 == null || NSTEXOPlayerSkyTvActivity.this.f34585t0.size() == 0) {
                            AbstractC2237a.f44480Y = Boolean.FALSE;
                            NSTEXOPlayerSkyTvActivity.this.f4();
                        } else if (!NSTEXOPlayerSkyTvActivity.this.f34438W3.equals("true") && !NSTEXOPlayerSkyTvActivity.this.f34331F2.i()) {
                            LinearLayout linearLayout = NSTEXOPlayerSkyTvActivity.this.f34297A3;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(0);
                            }
                        } else if (SharepreferenceDBHandler.getCurrentAPPType(NSTEXOPlayerSkyTvActivity.this.f34486f).equals("stalker_api")) {
                            try {
                                m7.w.N0(NSTEXOPlayerSkyTvActivity.this.f34486f);
                                String stalkerToken = SharepreferenceDBHandler.getStalkerToken(NSTEXOPlayerSkyTvActivity.this.f34486f);
                                String loggedInMacAddress = SharepreferenceDBHandler.getLoggedInMacAddress(NSTEXOPlayerSkyTvActivity.this.f34486f);
                                if (NSTEXOPlayerSkyTvActivity.this.f34585t0 != null && NSTEXOPlayerSkyTvActivity.this.f34585t0.size() > 0 && NSTEXOPlayerSkyTvActivity.this.f34382N1 < NSTEXOPlayerSkyTvActivity.this.f34585t0.size()) {
                                    NSTEXOPlayerSkyTvActivity.this.f34461a4.c(loggedInMacAddress, stalkerToken, ((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(NSTEXOPlayerSkyTvActivity.this.f34382N1)).getCmd(), "", null, "itv", 0, 0, "", "", "", "", "", "playFirstTime", 0, "", "");
                                }
                            } catch (Exception unused) {
                            }
                        } else {
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = NSTEXOPlayerSkyTvActivity.this;
                            nSTEXOPlayerSkyTvActivity2.m4(nSTEXOPlayerSkyTvActivity2.f34585t0);
                        }
                    }
                }
                NSTEXOPlayerSkyTvActivity.this.S3();
                NSTEXOPlayerSkyTvActivity.this.Q3();
                NSTEXOPlayerSkyTvActivity.this.v3();
                NSTEXOPlayerSkyTvActivity.this.u3();
            } catch (Exception unused2) {
                NSTEXOPlayerSkyTvActivity.this.S3();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            LinearLayout linearLayout;
            super.onPreExecute();
            try {
                RelativeLayout relativeLayout = NSTEXOPlayerSkyTvActivity.this.f34455Z2;
                if (relativeLayout == null || relativeLayout.getVisibility() != 0) {
                    NSTEXOPlayerSkyTvActivity.this.f34432V3 = "";
                } else {
                    NSTEXOPlayerSkyTvActivity.this.f34432V3 = "player";
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            NSTEXOPlayerSkyTvActivity.this.B4();
            if (NSTEXOPlayerSkyTvActivity.this.f34432V3.equals("player")) {
                if (NSTEXOPlayerSkyTvActivity.this.f34356J != null) {
                    NSTEXOPlayerSkyTvActivity.this.f34356J.setVisibility(8);
                }
                linearLayout = NSTEXOPlayerSkyTvActivity.this.f34375M0;
                if (linearLayout == null) {
                    return;
                }
            } else {
                if (NSTEXOPlayerSkyTvActivity.this.f34349I != null) {
                    NSTEXOPlayerSkyTvActivity.this.f34349I.setVisibility(8);
                }
                linearLayout = NSTEXOPlayerSkyTvActivity.this.f34369L0;
                if (linearLayout == null) {
                    return;
                }
            }
            linearLayout.setVisibility(8);
        }
    }

    public class O implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f34668a;

        public O(View view) {
            this.f34668a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f34668a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f34668a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f34668a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:113:0x0210  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00eb  */
        @Override // android.view.View.OnFocusChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onFocusChange(android.view.View r26, boolean r27) {
            /*
                Method dump skipped, instruction units count: 2197
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.O.onFocusChange(android.view.View, boolean):void");
        }
    }

    public class P implements InterfaceC1699p {
        public P() {
        }

        public /* synthetic */ P(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity, ViewOnClickListenerC1464k viewOnClickListenerC1464k) {
            this();
        }

        @Override // d4.InterfaceC1699p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Pair a(C0909p1 c0909p1) {
            String string = NSTEXOPlayerSkyTvActivity.this.getString(a7.j.f13065M1);
            Throwable cause = c0909p1.getCause();
            if (cause instanceof u.b) {
                u.b bVar = (u.b) cause;
                t tVar = bVar.f46381d;
                string = tVar == null ? bVar.getCause() instanceof AbstractC2392B.c ? NSTEXOPlayerSkyTvActivity.this.getString(a7.j.f13115R1) : bVar.f46380c ? NSTEXOPlayerSkyTvActivity.this.getString(a7.j.f13095P1, bVar.f46379a) : NSTEXOPlayerSkyTvActivity.this.getString(a7.j.f13085O1, bVar.f46379a) : NSTEXOPlayerSkyTvActivity.this.getString(a7.j.f13075N1, tVar.f46299a);
            }
            return Pair.create(0, string);
        }
    }

    public class Q implements InterfaceC0920t1.d {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                if (nSTEXOPlayerSkyTvActivity.f34631z4) {
                    return;
                }
                nSTEXOPlayerSkyTvActivity.f34610w4++;
                m7.w.P0(nSTEXOPlayerSkyTvActivity.f34486f, NSTEXOPlayerSkyTvActivity.this.f34486f.getResources().getString(a7.j.f13262g5) + " (" + NSTEXOPlayerSkyTvActivity.this.f34610w4 + "/" + NSTEXOPlayerSkyTvActivity.this.f34617x4 + ")");
                NSTEXOPlayerSkyTvActivity.this.o4();
                NSTEXOPlayerSkyTvActivity.this.U3();
            }
        }

        public Q() {
        }

        public /* synthetic */ Q(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity, ViewOnClickListenerC1464k viewOnClickListenerC1464k) {
            this();
        }

        private void C(String str) {
            NSTEXOPlayerSkyTvActivity.this.f34549o.setVisibility(0);
            NSTEXOPlayerSkyTvActivity.this.f34556p.setText(str);
        }

        private void o() {
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
            if (nSTEXOPlayerSkyTvActivity.f34610w4 >= nSTEXOPlayerSkyTvActivity.f34617x4) {
                C(NSTEXOPlayerSkyTvActivity.this.f34486f.getResources().getString(a7.j.f13214b7));
                NSTEXOPlayerSkyTvActivity.this.o4();
                NSTEXOPlayerSkyTvActivity.this.f34624y4 = false;
                NSTEXOPlayerSkyTvActivity.f34292P5.setVisibility(8);
                return;
            }
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = NSTEXOPlayerSkyTvActivity.this;
            if (nSTEXOPlayerSkyTvActivity2.f34631z4) {
                return;
            }
            nSTEXOPlayerSkyTvActivity2.f34624y4 = true;
            nSTEXOPlayerSkyTvActivity2.f34316D1.postDelayed(new a(), 3000L);
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
            LiveStreamDBHandler liveStreamDBHandler;
            String strG;
            String str;
            if (i9 == 2) {
                if (NSTEXOPlayerSkyTvActivity.t3()) {
                    return;
                }
                LinearLayout linearLayout = NSTEXOPlayerSkyTvActivity.this.f34407R2;
                if (linearLayout != null && linearLayout.getVisibility() == 0) {
                    NSTEXOPlayerSkyTvActivity.this.f34407R2.setVisibility(8);
                }
                NSTEXOPlayerSkyTvActivity.f34292P5.setVisibility(0);
                return;
            }
            if (i9 == 4) {
                o();
                return;
            }
            if (i9 == 3) {
                if (NSTEXOPlayerSkyTvActivity.this.f34413S2.getVisibility() == 0) {
                    NSTEXOPlayerSkyTvActivity.this.f34407R2.setVisibility(0);
                }
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                nSTEXOPlayerSkyTvActivity.f34610w4 = 0;
                nSTEXOPlayerSkyTvActivity.f34500h.setVisibility(8);
                NSTEXOPlayerSkyTvActivity.this.f34507i.setVisibility(0);
                if (NSTEXOPlayerSkyTvActivity.f34288L5) {
                    NSTEXOPlayerSkyTvActivity.this.f34507i.requestFocus();
                }
                NSTEXOPlayerSkyTvActivity.f34292P5.setVisibility(8);
                LiveStreamDBHandler liveStreamDBHandler2 = NSTEXOPlayerSkyTvActivity.this.f34404R;
                if (liveStreamDBHandler2 != null) {
                    liveStreamDBHandler2.deleteLiveRecentlyWatched(C2966a.f().g());
                    if (NSTEXOPlayerSkyTvActivity.this.f34444X3.equalsIgnoreCase("true")) {
                        liveStreamDBHandler = NSTEXOPlayerSkyTvActivity.this.f34404R;
                        strG = C2966a.f().g();
                        str = "radio_streams";
                    } else {
                        liveStreamDBHandler = NSTEXOPlayerSkyTvActivity.this.f34404R;
                        strG = C2966a.f().g();
                        str = "live";
                    }
                    liveStreamDBHandler.addLiveRecentlyWatched(strG, str);
                    NSTEXOPlayerSkyTvActivity.this.f34404R.deleteExtraLiveRecentlyWatched();
                }
                NSTEXOPlayerSkyTvActivity.this.g4(2);
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
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
            if (nSTEXOPlayerSkyTvActivity.f34631z4) {
                return;
            }
            if (c0909p1.f6177a == 1002) {
                nSTEXOPlayerSkyTvActivity.U3();
            } else if (!c0909p1.toString().contains("com.google.android.exoplayer2.ext.ffmpeg.FfmpegDecoderException")) {
                o();
            } else {
                m7.w.P0(NSTEXOPlayerSkyTvActivity.this.f34486f, "Audio track issue found. Please change the audio track to none.");
                NSTEXOPlayerSkyTvActivity.this.U3();
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
        public /* synthetic */ void u(f fVar) {
            AbstractC0926v1.c(this, fVar);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void z(int i9) {
            AbstractC0926v1.q(this, i9);
        }
    }

    public class R extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f34673a;

        public R(String str) {
            this.f34673a = str;
        }

        public /* synthetic */ R(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity, String str, ViewOnClickListenerC1464k viewOnClickListenerC1464k) {
            this(str);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HashMap doInBackground(String... strArr) {
            try {
                return NSTEXOPlayerSkyTvActivity.this.x4(this.f34673a);
            } catch (Exception unused) {
                return new HashMap();
            }
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:178:0x02ea -> B:249:0x02ef). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:179:0x02ec -> B:249:0x02ef). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:56:0x013e
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(java.util.HashMap r12) {
            /*
                Method dump skipped, instruction units count: 971
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.R.onPostExecute(java.util.HashMap):void");
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            try {
                NSTEXOPlayerSkyTvActivity.this.c4();
                LinearLayout linearLayout = NSTEXOPlayerSkyTvActivity.this.f34544n1;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                LinearLayout linearLayout2 = NSTEXOPlayerSkyTvActivity.this.f34558p1;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                LinearLayout linearLayout3 = NSTEXOPlayerSkyTvActivity.this.f34565q1;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                }
                LinearLayout linearLayout4 = NSTEXOPlayerSkyTvActivity.this.f34572r1;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(8);
                }
                LinearLayout linearLayout5 = NSTEXOPlayerSkyTvActivity.this.f34579s1;
                if (linearLayout5 != null) {
                    linearLayout5.setVisibility(8);
                }
                LinearLayout linearLayout6 = NSTEXOPlayerSkyTvActivity.this.f34586t1;
                if (linearLayout6 != null) {
                    linearLayout6.setVisibility(0);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class S extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f34676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f34677c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f34678d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f34679e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f34680f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f34681g;

        public S(String str, int i9, String str2, String str3, String str4, int i10, String str5) {
            this.f34675a = str;
            this.f34676b = i9;
            this.f34677c = str2;
            this.f34678d = str3;
            this.f34679e = str4;
            this.f34680f = i10;
            this.f34681g = str5;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                if (nSTEXOPlayerSkyTvActivity.f34486f == null || nSTEXOPlayerSkyTvActivity.f34390O3 == null || NSTEXOPlayerSkyTvActivity.this.f34614x1 == null || NSTEXOPlayerSkyTvActivity.this.f34378M3 == null || NSTEXOPlayerSkyTvActivity.this.f34349I == null) {
                    return null;
                }
                FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
                favouriteDBModel.setCategoryID(this.f34675a);
                favouriteDBModel.setStreamID(this.f34676b);
                favouriteDBModel.setStreamIDOneStream(this.f34681g);
                favouriteDBModel.setNum(this.f34678d);
                favouriteDBModel.setName(this.f34677c);
                favouriteDBModel.setUserID(SharepreferenceDBHandler.getUserID(NSTEXOPlayerSkyTvActivity.this.f34486f));
                NSTEXOPlayerSkyTvActivity.this.f34614x1.addToFavourite(favouriteDBModel, this.f34679e);
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r32) {
            super.onPostExecute(r32);
            try {
                View childAt = NSTEXOPlayerSkyTvActivity.this.f34349I.getChildAt(this.f34680f - NSTEXOPlayerSkyTvActivity.this.f34349I.getFirstVisiblePosition());
                if (childAt != null) {
                    try {
                        ((ImageView) childAt.findViewById(a7.f.f12406g5)).setVisibility(0);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
                NSTEXOPlayerSkyTvActivity.this.f34378M3.x(1);
                NSTEXOPlayerSkyTvActivity.this.S3();
            } catch (Exception unused) {
                NSTEXOPlayerSkyTvActivity.this.S3();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (NSTEXOPlayerSkyTvActivity.this.f34573r2 == null) {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                nSTEXOPlayerSkyTvActivity.f34573r2 = NSTEXOPlayerSkyTvActivity.w3(nSTEXOPlayerSkyTvActivity.f34486f);
                if (NSTEXOPlayerSkyTvActivity.this.f34573r2 == null) {
                    return;
                }
            } else if (NSTEXOPlayerSkyTvActivity.this.f34573r2.isShowing()) {
                return;
            }
            NSTEXOPlayerSkyTvActivity.this.f34573r2.show();
        }
    }

    public class T extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f34684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f34685c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f34686d;

        public T(String str, String str2, String str3, int i9) {
            this.f34683a = str;
            this.f34684b = str2;
            this.f34685c = str3;
            this.f34686d = i9;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                if (nSTEXOPlayerSkyTvActivity.f34486f == null || nSTEXOPlayerSkyTvActivity.f34390O3 == null) {
                    return null;
                }
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = NSTEXOPlayerSkyTvActivity.this;
                if (nSTEXOPlayerSkyTvActivity2.f34404R == null || nSTEXOPlayerSkyTvActivity2.f34378M3 == null || NSTEXOPlayerSkyTvActivity.this.f34349I == null) {
                    return null;
                }
                FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
                favouriteM3UModel.setUrl(this.f34684b);
                favouriteM3UModel.setUserID(SharepreferenceDBHandler.getUserID(NSTEXOPlayerSkyTvActivity.this.f34486f));
                favouriteM3UModel.setName(this.f34685c);
                favouriteM3UModel.setCategoryID(this.f34683a);
                NSTEXOPlayerSkyTvActivity.this.f34404R.addToFavourite(favouriteM3UModel);
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r32) {
            super.onPostExecute(r32);
            try {
                View childAt = NSTEXOPlayerSkyTvActivity.this.f34349I.getChildAt(this.f34686d - NSTEXOPlayerSkyTvActivity.this.f34349I.getFirstVisiblePosition());
                if (childAt != null) {
                    try {
                        ((ImageView) childAt.findViewById(a7.f.f12406g5)).setVisibility(0);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
                NSTEXOPlayerSkyTvActivity.this.f34378M3.x(1);
                NSTEXOPlayerSkyTvActivity.this.S3();
            } catch (Exception unused) {
                NSTEXOPlayerSkyTvActivity.this.S3();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (NSTEXOPlayerSkyTvActivity.this.f34573r2 == null) {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                nSTEXOPlayerSkyTvActivity.f34573r2 = NSTEXOPlayerSkyTvActivity.w3(nSTEXOPlayerSkyTvActivity.f34486f);
                if (NSTEXOPlayerSkyTvActivity.this.f34573r2 == null) {
                    return;
                }
            } else if (NSTEXOPlayerSkyTvActivity.this.f34573r2.isShowing()) {
                return;
            }
            NSTEXOPlayerSkyTvActivity.this.f34573r2.show();
        }
    }

    public class U extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f34689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f34690c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f34691d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f34692e;

        public U(String str, int i9, String str2, String str3, int i10) {
            this.f34688a = str;
            this.f34689b = i9;
            this.f34690c = str2;
            this.f34691d = str3;
            this.f34692e = i10;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                if (nSTEXOPlayerSkyTvActivity.f34486f == null || nSTEXOPlayerSkyTvActivity.f34390O3 == null || NSTEXOPlayerSkyTvActivity.this.f34614x1 == null || NSTEXOPlayerSkyTvActivity.this.f34378M3 == null || NSTEXOPlayerSkyTvActivity.this.f34349I == null) {
                    return null;
                }
                NSTEXOPlayerSkyTvActivity.this.f34614x1.deleteFavourite(this.f34689b, this.f34688a, this.f34691d, this.f34690c, SharepreferenceDBHandler.getUserID(NSTEXOPlayerSkyTvActivity.this.f34486f), NSTEXOPlayerSkyTvActivity.this.f34473d);
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r32) {
            super.onPostExecute(r32);
            try {
                View childAt = NSTEXOPlayerSkyTvActivity.this.f34349I.getChildAt(this.f34692e - NSTEXOPlayerSkyTvActivity.this.f34349I.getFirstVisiblePosition());
                if (childAt != null) {
                    try {
                        ((ImageView) childAt.findViewById(a7.f.f12406g5)).setVisibility(4);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
                NSTEXOPlayerSkyTvActivity.this.f34378M3.x(1);
                NSTEXOPlayerSkyTvActivity.this.S3();
            } catch (Exception unused) {
                NSTEXOPlayerSkyTvActivity.this.S3();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (NSTEXOPlayerSkyTvActivity.this.f34573r2 == null) {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                nSTEXOPlayerSkyTvActivity.f34573r2 = NSTEXOPlayerSkyTvActivity.w3(nSTEXOPlayerSkyTvActivity.f34486f);
                if (NSTEXOPlayerSkyTvActivity.this.f34573r2 == null) {
                    return;
                }
            } else if (NSTEXOPlayerSkyTvActivity.this.f34573r2.isShowing()) {
                return;
            }
            NSTEXOPlayerSkyTvActivity.this.f34573r2.show();
        }
    }

    public class V extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f34695b;

        public V(String str, int i9) {
            this.f34694a = str;
            this.f34695b = i9;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                if (nSTEXOPlayerSkyTvActivity.f34486f == null || nSTEXOPlayerSkyTvActivity.f34390O3 == null) {
                    return null;
                }
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = NSTEXOPlayerSkyTvActivity.this;
                if (nSTEXOPlayerSkyTvActivity2.f34404R == null || nSTEXOPlayerSkyTvActivity2.f34378M3 == null || NSTEXOPlayerSkyTvActivity.this.f34349I == null) {
                    return null;
                }
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity3 = NSTEXOPlayerSkyTvActivity.this;
                nSTEXOPlayerSkyTvActivity3.f34404R.deleteFavourite(this.f34694a, SharepreferenceDBHandler.getUserID(nSTEXOPlayerSkyTvActivity3.f34486f));
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r32) {
            super.onPostExecute(r32);
            try {
                View childAt = NSTEXOPlayerSkyTvActivity.this.f34349I.getChildAt(this.f34695b - NSTEXOPlayerSkyTvActivity.this.f34349I.getFirstVisiblePosition());
                if (childAt != null) {
                    try {
                        ((ImageView) childAt.findViewById(a7.f.f12406g5)).setVisibility(4);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
                NSTEXOPlayerSkyTvActivity.this.f34378M3.x(1);
                NSTEXOPlayerSkyTvActivity.this.S3();
            } catch (Exception unused) {
                NSTEXOPlayerSkyTvActivity.this.S3();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (NSTEXOPlayerSkyTvActivity.this.f34573r2 == null) {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                nSTEXOPlayerSkyTvActivity.f34573r2 = NSTEXOPlayerSkyTvActivity.w3(nSTEXOPlayerSkyTvActivity.f34486f);
                if (NSTEXOPlayerSkyTvActivity.this.f34573r2 == null) {
                    return;
                }
            } else if (NSTEXOPlayerSkyTvActivity.this.f34573r2.isShowing()) {
                return;
            }
            NSTEXOPlayerSkyTvActivity.this.f34573r2.show();
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$a, reason: case insensitive filesystem */
    public class C1454a implements AdapterView.OnItemSelectedListener {
        public C1454a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i9, long j9) {
            try {
                if (NSTEXOPlayerSkyTvActivity.this.f34566q2 != null && NSTEXOPlayerSkyTvActivity.this.f34566q2.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    NSTEXOPlayerSkyTvActivity.this.f34566q2.cancel(true);
                }
                ArrayList arrayListG = NSTEXOPlayerSkyTvActivity.this.f34390O3.g();
                ViewOnClickListenerC1464k viewOnClickListenerC1464k = null;
                if (arrayListG == null || arrayListG.size() <= 0) {
                    if (NSTEXOPlayerSkyTvActivity.this.f34585t0 == null || NSTEXOPlayerSkyTvActivity.this.f34585t0.size() <= 0) {
                        return;
                    }
                    String epgChannelId = ((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34585t0.get(i9)).getEpgChannelId();
                    NSTEXOPlayerSkyTvActivity.this.f34330F1.removeCallbacksAndMessages(null);
                    if (SharepreferenceDBHandler.getCurrentAPPType(NSTEXOPlayerSkyTvActivity.this.f34486f).equals("stalker_api")) {
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                        nSTEXOPlayerSkyTvActivity.J4(((LiveStreamsDBModel) nSTEXOPlayerSkyTvActivity.f34585t0.get(i9)).getStreamId());
                        return;
                    } else {
                        NSTEXOPlayerSkyTvActivity.this.f34566q2 = new R(NSTEXOPlayerSkyTvActivity.this, epgChannelId, viewOnClickListenerC1464k).execute(new String[0]);
                        return;
                    }
                }
                String epgChannelId2 = ((LiveStreamsDBModel) arrayListG.get(i9)).getEpgChannelId();
                NSTEXOPlayerSkyTvActivity.this.f34618x5 = ((LiveStreamsDBModel) arrayListG.get(i9)).getName();
                NSTEXOPlayerSkyTvActivity.this.f34597u5 = ((LiveStreamsDBModel) arrayListG.get(i9)).getCategoryId();
                NSTEXOPlayerSkyTvActivity.this.f34330F1.removeCallbacksAndMessages(null);
                if (SharepreferenceDBHandler.getCurrentAPPType(NSTEXOPlayerSkyTvActivity.this.f34486f).equals("stalker_api")) {
                    NSTEXOPlayerSkyTvActivity.this.J4(((LiveStreamsDBModel) arrayListG.get(i9)).getStreamId());
                } else {
                    NSTEXOPlayerSkyTvActivity.this.f34566q2 = new R(NSTEXOPlayerSkyTvActivity.this, epgChannelId2, viewOnClickListenerC1464k).execute(new String[0]);
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$b, reason: case insensitive filesystem */
    public class C1455b implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f34698a;

        public C1455b(ArrayList arrayList) {
            this.f34698a = arrayList;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i9, long j9) {
            NSTEXOPlayerSkyTvActivity.this.f34477d4 = i9;
            LinearLayout linearLayout = NSTEXOPlayerSkyTvActivity.this.f34297A3;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            if (AbstractC2237a.f44475V0.booleanValue() && AbstractC2237a.f44498e1.equalsIgnoreCase("1")) {
                AbstractC2237a.f44487b = false;
                if (SharepreferenceDBHandler.getEventAdsView(NSTEXOPlayerSkyTvActivity.this) < AbstractC2237a.f44501f1) {
                    if (SharepreferenceDBHandler.getEventAdsView(NSTEXOPlayerSkyTvActivity.this) == 0 && SharepreferenceDBHandler.getFirstTimeAdsShow(NSTEXOPlayerSkyTvActivity.this)) {
                        SharepreferenceDBHandler.setFirstTimeAdsShow(false, NSTEXOPlayerSkyTvActivity.this);
                        NSTEXOPlayerSkyTvActivity.this.f34454Z1 = "";
                        NSTEXOPlayerSkyTvActivity.this.a4("", "", "", adapterView, view, i9, j9, this.f34698a);
                    } else if (Listsingleton.b().a() != null && Listsingleton.b().a().size() > 0) {
                        NSTEXOPlayerSkyTvActivity.this.Y3(adapterView, view, i9, j9, this.f34698a);
                    }
                    SharepreferenceDBHandler.setEventAdsView(SharepreferenceDBHandler.getEventAdsView(NSTEXOPlayerSkyTvActivity.this) + 1, NSTEXOPlayerSkyTvActivity.this);
                    return;
                }
                if (Listsingleton.b().a() != null && Listsingleton.b().a().size() > 0) {
                    SharepreferenceDBHandler.setEventAdsView(0, NSTEXOPlayerSkyTvActivity.this);
                    NSTEXOPlayerSkyTvActivity.this.f34454Z1 = "";
                    NSTEXOPlayerSkyTvActivity.this.a4("", "", "", adapterView, view, i9, j9, this.f34698a);
                    return;
                }
            } else {
                NSTEXOPlayerSkyTvActivity.this.f34549o.setVisibility(8);
            }
            NSTEXOPlayerSkyTvActivity.this.Y3(adapterView, view, i9, j9, this.f34698a);
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$c, reason: case insensitive filesystem */
    public class C1456c implements AdapterView.OnItemLongClickListener {

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$c$a */
        public class a implements PopupMenu.OnMenuItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f34701a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f34702b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f34703c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f34704d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f34705e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f34706f;

            /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$c$a$a, reason: collision with other inner class name */
            public class DialogC0282a extends Dialog implements View.OnClickListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public Activity f34708a;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public TextView f34709c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public TextView f34710d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public TextView f34711e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public LinearLayout f34712f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public LinearLayout f34713g;

                /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$c$a$a$a, reason: collision with other inner class name */
                public class ViewOnFocusChangeListenerC0283a implements View.OnFocusChangeListener {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public View f34715a;

                    public ViewOnFocusChangeListenerC0283a(View view) {
                        this.f34715a = view;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public void onFocusChange(View view, boolean z9) {
                        LinearLayout linearLayout;
                        int i9;
                        if (z9) {
                            View view2 = this.f34715a;
                            if (view2 == null || view2.getTag() == null || !this.f34715a.getTag().equals("1")) {
                                View view3 = this.f34715a;
                                if (view3 == null || view3.getTag() == null || !this.f34715a.getTag().equals("2")) {
                                    return;
                                } else {
                                    linearLayout = DialogC0282a.this.f34713g;
                                }
                            } else {
                                linearLayout = DialogC0282a.this.f34712f;
                            }
                            i9 = a7.e.f12042p;
                        } else {
                            View view4 = this.f34715a;
                            if (view4 == null || view4.getTag() == null || !this.f34715a.getTag().equals("1")) {
                                View view5 = this.f34715a;
                                if (view5 == null || view5.getTag() == null || !this.f34715a.getTag().equals("2")) {
                                    return;
                                } else {
                                    linearLayout = DialogC0282a.this.f34713g;
                                }
                            } else {
                                linearLayout = DialogC0282a.this.f34712f;
                            }
                            i9 = a7.e.f12038o;
                        }
                        linearLayout.setBackgroundResource(i9);
                    }
                }

                public DialogC0282a(Activity activity) {
                    super(activity);
                    this.f34708a = activity;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x006d A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:4:0x0008, B:6:0x0014, B:8:0x002f, B:9:0x0039, B:15:0x005b, B:17:0x006d, B:18:0x007b, B:23:0x00ab, B:19:0x007f, B:21:0x0091, B:22:0x009c, B:12:0x0040, B:14:0x0050), top: B:31:0x0008 }] */
                /* JADX WARN: Removed duplicated region for block: B:19:0x007f A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:4:0x0008, B:6:0x0014, B:8:0x002f, B:9:0x0039, B:15:0x005b, B:17:0x006d, B:18:0x007b, B:23:0x00ab, B:19:0x007f, B:21:0x0091, B:22:0x009c, B:12:0x0040, B:14:0x0050), top: B:31:0x0008 }] */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onClick(android.view.View r2) {
                    /*
                        Method dump skipped, instruction units count: 220
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.C1456c.a.DialogC0282a.onClick(android.view.View):void");
                }

                @Override // android.app.Dialog
                public void onCreate(Bundle bundle) {
                    try {
                        super.onCreate(bundle);
                        setContentView(NSTEXOPlayerSkyTvActivity.this.f34331F2.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12742X1 : a7.g.f12736W1);
                        this.f34709c = (TextView) findViewById(a7.f.f12544u1);
                        this.f34710d = (TextView) findViewById(a7.f.f12412h1);
                        this.f34712f = (LinearLayout) findViewById(a7.f.V8);
                        this.f34713g = (LinearLayout) findViewById(a7.f.Ia);
                        TextView textView = (TextView) findViewById(a7.f.um);
                        this.f34711e = textView;
                        textView.setText(NSTEXOPlayerSkyTvActivity.this.f34486f.getResources().getString(a7.j.Y8));
                        this.f34709c.setOnClickListener(this);
                        this.f34710d.setOnClickListener(this);
                        TextView textView2 = this.f34709c;
                        textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0283a(textView2));
                        TextView textView3 = this.f34710d;
                        textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0283a(textView3));
                    } catch (Exception unused) {
                    }
                }
            }

            public a(String str, String str2, int i9, String str3, String str4, String str5) {
                this.f34701a = str;
                this.f34702b = str2;
                this.f34703c = i9;
                this.f34704d = str3;
                this.f34705e = str4;
                this.f34706f = str5;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
            
                r4 = r11.f34707g.f34700a;
                r4.f34594u2 = true;
                r4.o4();
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
            
                if (r11.f34707g.f34700a.f34448Y1.equals("m3u") == false) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
            
                r4 = r11.f34707g.f34700a;
                r5 = r4.f34321E;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
            
                r4.f34392P = r5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
            
                r4 = r11.f34707g.f34700a;
                r5 = m7.w.V(r4.f34486f, r4.f34314D, r4.f34494g0, "live");
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
            
                r4 = new android.content.Intent(r11.f34707g.f34700a.f34486f, (java.lang.Class<?>) com.nst.iptvsmarterstvbox.view.activity.PlayExternalPlayerActivity.class);
                r4.putExtra("url", r11.f34707g.f34700a.f34392P);
                r4.putExtra("app_name", ((com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass) r11.f34707g.f34700a.f34352I2.get(r3)).getAppname());
                r4.putExtra("packagename", ((com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass) r11.f34707g.f34700a.f34352I2.get(r3)).getPackagename());
                r11.f34707g.f34700a.f34486f.startActivity(r4);
             */
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean onMenuItemClick(android.view.MenuItem r12) {
                /*
                    Method dump skipped, instruction units count: 547
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.C1456c.a.onMenuItemClick(android.view.MenuItem):boolean");
            }
        }

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$c$b */
        public class b implements PopupMenu.OnDismissListener {
            public b() {
            }

            @Override // android.widget.PopupMenu.OnDismissListener
            public void onDismiss(PopupMenu popupMenu) {
            }
        }

        public C1456c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x025f A[Catch: Exception -> 0x02e7, TRY_LEAVE, TryCatch #1 {Exception -> 0x02e7, blocks: (B:3:0x0005, B:5:0x000d, B:8:0x001b, B:10:0x0021, B:17:0x0123, B:19:0x0149, B:21:0x0160, B:24:0x0172, B:26:0x0182, B:28:0x0188, B:29:0x0190, B:50:0x023d, B:52:0x025f, B:63:0x0298, B:64:0x029b, B:30:0x0194, B:32:0x01a4, B:34:0x01b2, B:36:0x01c7, B:38:0x01d3, B:40:0x01e3, B:41:0x01ec, B:42:0x01f5, B:43:0x01fe, B:45:0x0221, B:47:0x0227, B:48:0x022f, B:49:0x0233, B:20:0x0155, B:11:0x007d, B:13:0x0085, B:15:0x0091, B:53:0x0267, B:55:0x026d, B:58:0x0274, B:60:0x027e), top: B:71:0x0005, inners: #0 }] */
        @Override // android.widget.AdapterView.OnItemLongClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onItemLongClick(android.widget.AdapterView r21, android.view.View r22, int r23, long r24) {
            /*
                Method dump skipped, instruction units count: 745
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.C1456c.onItemLongClick(android.widget.AdapterView, android.view.View, int, long):boolean");
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$d, reason: case insensitive filesystem */
    public class RunnableC1457d implements Runnable {
        public RunnableC1457d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyTvActivity.this.O3();
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$e, reason: case insensitive filesystem */
    public class RunnableC1458e implements Runnable {
        public RunnableC1458e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyTvActivity.this.v4("", false);
            NSTEXOPlayerSkyTvActivity.this.f34540m4 = Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$f, reason: case insensitive filesystem */
    public class RunnableC1459f implements Runnable {
        public RunnableC1459f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyTvActivity.this.v4("", false);
            NSTEXOPlayerSkyTvActivity.this.f34540m4 = Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$g, reason: case insensitive filesystem */
    public class RunnableC1460g implements Runnable {
        public RunnableC1460g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyTvActivity.this.v4("", false);
            NSTEXOPlayerSkyTvActivity.this.f34540m4 = Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$h, reason: case insensitive filesystem */
    public class RunnableC1461h implements Runnable {
        public RunnableC1461h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyTvActivity.this.v4("", false);
            NSTEXOPlayerSkyTvActivity.this.f34540m4 = Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$i, reason: case insensitive filesystem */
    public class RunnableC1462i implements Runnable {
        public RunnableC1462i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyTvActivity.this.v4("", false);
            NSTEXOPlayerSkyTvActivity.this.f34540m4 = Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$j, reason: case insensitive filesystem */
    public class RunnableC1463j implements Runnable {
        public RunnableC1463j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyTvActivity.this.v4("", false);
            NSTEXOPlayerSkyTvActivity.this.f34540m4 = Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$k, reason: case insensitive filesystem */
    public class ViewOnClickListenerC1464k implements View.OnClickListener {
        public ViewOnClickListenerC1464k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTEXOPlayerSkyTvActivity.this.C3();
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$l, reason: case insensitive filesystem */
    public class DialogC1465l extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f34726a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f34727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f34728d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f34729e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f34730f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public LinearLayout f34731g;

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$l$a */
        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f34733a;

            public a(View view) {
                this.f34733a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f34733a;
                    if (view2 == null || view2.getTag() == null || !this.f34733a.getTag().equals("1")) {
                        View view3 = this.f34733a;
                        if (view3 == null || view3.getTag() == null || !this.f34733a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = DialogC1465l.this.f34731g;
                        }
                    } else {
                        linearLayout = DialogC1465l.this.f34730f;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f34733a;
                    if (view4 == null || view4.getTag() == null || !this.f34733a.getTag().equals("1")) {
                        View view5 = this.f34733a;
                        if (view5 == null || view5.getTag() == null || !this.f34733a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = DialogC1465l.this.f34731g;
                        }
                    } else {
                        linearLayout = DialogC1465l.this.f34730f;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        public DialogC1465l(Activity activity) {
            super(activity);
            this.f34726a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity;
            if (view.getId() == a7.f.f12544u1) {
                try {
                    if (NSTEXOPlayerSkyTvActivity.this.f34573r2 == null) {
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = NSTEXOPlayerSkyTvActivity.this;
                        nSTEXOPlayerSkyTvActivity2.f34573r2 = NSTEXOPlayerSkyTvActivity.w3(nSTEXOPlayerSkyTvActivity2.f34486f);
                        if (NSTEXOPlayerSkyTvActivity.this.f34573r2 != null) {
                            nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                            nSTEXOPlayerSkyTvActivity.f34573r2.show();
                        }
                        NSTEXOPlayerSkyTvActivity.this.f34404R.deleteALLLiveRecentlyWatched();
                        NSTEXOPlayerSkyTvActivity.this.b4("-6");
                        NSTEXOPlayerSkyTvActivity.this.f34378M3.w();
                        NSTEXOPlayerSkyTvActivity.this.S3();
                    } else {
                        if (!NSTEXOPlayerSkyTvActivity.this.f34573r2.isShowing()) {
                            nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                            nSTEXOPlayerSkyTvActivity.f34573r2.show();
                        }
                        NSTEXOPlayerSkyTvActivity.this.f34404R.deleteALLLiveRecentlyWatched();
                        NSTEXOPlayerSkyTvActivity.this.b4("-6");
                        NSTEXOPlayerSkyTvActivity.this.f34378M3.w();
                        NSTEXOPlayerSkyTvActivity.this.S3();
                    }
                } catch (Exception unused) {
                }
            } else if (view.getId() == a7.f.f12412h1) {
                dismiss();
            }
            dismiss();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            try {
                super.onCreate(bundle);
                setContentView(NSTEXOPlayerSkyTvActivity.this.f34331F2.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12742X1 : a7.g.f12736W1);
                this.f34727c = (TextView) findViewById(a7.f.f12544u1);
                this.f34728d = (TextView) findViewById(a7.f.f12412h1);
                this.f34730f = (LinearLayout) findViewById(a7.f.V8);
                this.f34731g = (LinearLayout) findViewById(a7.f.Ia);
                TextView textView = (TextView) findViewById(a7.f.um);
                this.f34729e = textView;
                textView.setText(NSTEXOPlayerSkyTvActivity.this.getResources().getString(a7.j.V8));
                this.f34727c.setOnClickListener(this);
                this.f34728d.setOnClickListener(this);
                TextView textView2 = this.f34727c;
                textView2.setOnFocusChangeListener(new a(textView2));
                TextView textView3 = this.f34728d;
                textView3.setOnFocusChangeListener(new a(textView3));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$m, reason: case insensitive filesystem */
    public class RunnableC1466m implements Runnable {
        public RunnableC1466m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyTvActivity.this.v4("", false);
            NSTEXOPlayerSkyTvActivity.this.f34540m4 = Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$n, reason: case insensitive filesystem */
    public class RunnableC1467n implements Runnable {

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$n$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTEXOPlayerSkyTvActivity.this.v4("", false);
                NSTEXOPlayerSkyTvActivity.this.f34540m4 = Boolean.TRUE;
            }
        }

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$n$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTEXOPlayerSkyTvActivity.this.f34400Q1.setText("");
                NSTEXOPlayerSkyTvActivity.this.f34394P1.setVisibility(8);
            }
        }

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$n$c */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTEXOPlayerSkyTvActivity.this.f34400Q1.setText("");
                NSTEXOPlayerSkyTvActivity.this.f34394P1.setVisibility(8);
            }
        }

        public RunnableC1467n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<LiveStreamsDBModel> channelDetails;
            Handler handler;
            Runnable cVar;
            boolean zK3;
            ArrayList<LiveStreamsDBModel> allLiveStreasWithCategoryId;
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
            nSTEXOPlayerSkyTvActivity.f34405R0 = nSTEXOPlayerSkyTvActivity.f34388O1.toString();
            NSTEXOPlayerSkyTvActivity.this.f34400Q1.setText("");
            NSTEXOPlayerSkyTvActivity.this.f34394P1.setVisibility(8);
            if (NSTEXOPlayerSkyTvActivity.this.f34444X3.equals("true")) {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = NSTEXOPlayerSkyTvActivity.this;
                channelDetails = nSTEXOPlayerSkyTvActivity2.f34404R.getChannelDetails(nSTEXOPlayerSkyTvActivity2.f34405R0, "radio_streams");
            } else {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity3 = NSTEXOPlayerSkyTvActivity.this;
                channelDetails = nSTEXOPlayerSkyTvActivity3.f34404R.getChannelDetails(nSTEXOPlayerSkyTvActivity3.f34405R0, "live");
            }
            NSTEXOPlayerSkyTvActivity.this.f34388O1.setLength(0);
            if (channelDetails == null || channelDetails.size() == 0) {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity4 = NSTEXOPlayerSkyTvActivity.this;
                nSTEXOPlayerSkyTvActivity4.f34400Q1.setText(nSTEXOPlayerSkyTvActivity4.f34486f.getResources().getString(a7.j.f13261g4));
                NSTEXOPlayerSkyTvActivity.this.f34394P1.setVisibility(0);
                handler = new Handler();
                cVar = new c();
            } else {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity5 = NSTEXOPlayerSkyTvActivity.this;
                if (nSTEXOPlayerSkyTvActivity5.f34404R.getParentalStatusCount(SharepreferenceDBHandler.getUserID(nSTEXOPlayerSkyTvActivity5.f34486f)) <= 0 || NSTEXOPlayerSkyTvActivity.this.f34627z0 == null) {
                    zK3 = false;
                } else {
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity6 = NSTEXOPlayerSkyTvActivity.this;
                    zK3 = nSTEXOPlayerSkyTvActivity6.K3(channelDetails, nSTEXOPlayerSkyTvActivity6.f34627z0);
                }
                if (!zK3) {
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity7 = NSTEXOPlayerSkyTvActivity.this;
                    nSTEXOPlayerSkyTvActivity7.f34393P0 = true;
                    nSTEXOPlayerSkyTvActivity7.f34399Q0 = true;
                    nSTEXOPlayerSkyTvActivity7.f34447Y0 = "0";
                    nSTEXOPlayerSkyTvActivity7.f34453Z0 = nSTEXOPlayerSkyTvActivity7.f34486f.getResources().getString(a7.j.f13426x);
                    NSTEXOPlayerSkyTvActivity.this.f34508i0 = 0;
                    String num = channelDetails.get(0).getNum();
                    String streamId = channelDetails.get(0).getStreamId();
                    String name = channelDetails.get(0).getName();
                    String epgChannelId = channelDetails.get(0).getEpgChannelId();
                    String streamIcon = channelDetails.get(0).getStreamIcon();
                    String url = channelDetails.get(0).getUrl();
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity8 = NSTEXOPlayerSkyTvActivity.this;
                    nSTEXOPlayerSkyTvActivity8.f34607w1 = url;
                    nSTEXOPlayerSkyTvActivity8.f34359J2 = m7.w.r0(nSTEXOPlayerSkyTvActivity8.f34405R0);
                    NSTEXOPlayerSkyTvActivity.this.f34365K2 = "0";
                    NSTEXOPlayerSkyTvActivity.this.f34464b2.setTitle(NSTEXOPlayerSkyTvActivity.this.f34405R0 + " - " + name);
                    if (NSTEXOPlayerSkyTvActivity.this.f34444X3.equals("true")) {
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity9 = NSTEXOPlayerSkyTvActivity.this;
                        allLiveStreasWithCategoryId = nSTEXOPlayerSkyTvActivity9.f34404R.getAllLiveStreasWithCategoryId(nSTEXOPlayerSkyTvActivity9.f34447Y0, "radio_streams");
                    } else {
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity10 = NSTEXOPlayerSkyTvActivity.this;
                        allLiveStreasWithCategoryId = nSTEXOPlayerSkyTvActivity10.f34404R.getAllLiveStreasWithCategoryId(nSTEXOPlayerSkyTvActivity10.f34447Y0, "live");
                    }
                    if (allLiveStreasWithCategoryId != null) {
                        NSTEXOPlayerSkyTvActivity.this.f34571r0.clear();
                    }
                    NSTEXOPlayerSkyTvActivity.this.f34571r0 = allLiveStreasWithCategoryId;
                    if (NSTEXOPlayerSkyTvActivity.this.f34571r0 != null && NSTEXOPlayerSkyTvActivity.this.f34571r0.size() > 0) {
                        int i9 = 0;
                        while (true) {
                            if (i9 < NSTEXOPlayerSkyTvActivity.this.f34571r0.size()) {
                                if (((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34571r0.get(i9)).getNum().equals(num)) {
                                    NSTEXOPlayerSkyTvActivity.this.f34464b2.setCurrentWindowIndex(i9);
                                    break;
                                }
                                i9++;
                            }
                        }
                    }
                    try {
                        if (streamIcon.equals("") || streamIcon.isEmpty()) {
                            NSTEXOPlayerSkyTvActivity.this.f34563q.setImageDrawable(NSTEXOPlayerSkyTvActivity.this.f34486f.getResources().getDrawable(a7.e.f12016i1));
                        } else {
                            com.squareup.picasso.t.q(NSTEXOPlayerSkyTvActivity.this.f34486f).l(streamIcon).j(a7.e.f12016i1).d(a7.e.f12016i1).k(80, 55).g(NSTEXOPlayerSkyTvActivity.this.f34563q);
                        }
                    } catch (Exception unused) {
                        NSTEXOPlayerSkyTvActivity.this.f34563q.setImageDrawable(NSTEXOPlayerSkyTvActivity.this.f34486f.getResources().getDrawable(a7.e.f12016i1));
                    }
                    NSTEXOPlayerSkyTvActivity.this.f34464b2.E();
                    ViewOnClickListenerC1464k viewOnClickListenerC1464k = null;
                    if (NSTEXOPlayerSkyTvActivity.this.f34503h2.booleanValue()) {
                        if (NSTEXOPlayerSkyTvActivity.this.f34448Y1.equals("m3u")) {
                            NSTEXOPlayerSkyTvActivity.this.f34603v4 = Uri.parse(url);
                            NSTEXOPlayerSkyTvActivity.this.f34464b2.u(Boolean.valueOf(NSTEXOPlayerSkyTvActivity.f34288L5));
                            C2966a.f().A(NSTEXOPlayerSkyTvActivity.this.f34607w1);
                        } else {
                            NSTEXOPlayerSkyTvActivity.this.f34603v4 = Uri.parse(url);
                            NSTEXOPlayerSkyTvActivity.this.f34464b2.u(Boolean.valueOf(NSTEXOPlayerSkyTvActivity.f34288L5));
                            C2966a.f().A(streamId);
                        }
                        NSTEXOPlayerSkyTvActivity.this.U3();
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity11 = NSTEXOPlayerSkyTvActivity.this;
                        nSTEXOPlayerSkyTvActivity11.f34610w4 = 0;
                        nSTEXOPlayerSkyTvActivity11.f34624y4 = false;
                        nSTEXOPlayerSkyTvActivity11.f34540m4 = Boolean.FALSE;
                        NSTEXOPlayerSkyTvActivity.this.f34351I1.removeCallbacksAndMessages(null);
                        NSTEXOPlayerSkyTvActivity.this.f34351I1.postDelayed(new a(), 5000L);
                        NSTEXOPlayerSkyTvActivity.this.F4();
                        NSTEXOPlayerSkyTvActivity.this.z4();
                        NSTEXOPlayerSkyTvActivity.this.n3(5000);
                    }
                    NSTEXOPlayerSkyTvActivity.this.f34337G1.removeCallbacksAndMessages(null);
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity12 = NSTEXOPlayerSkyTvActivity.this;
                    nSTEXOPlayerSkyTvActivity12.f34328F = epgChannelId;
                    nSTEXOPlayerSkyTvActivity12.f34335G = streamIcon;
                    nSTEXOPlayerSkyTvActivity12.f34464b2.setCurrentEpgChannelID(NSTEXOPlayerSkyTvActivity.this.f34328F);
                    NSTEXOPlayerSkyTvActivity.this.f34464b2.setCurrentChannelLogo(NSTEXOPlayerSkyTvActivity.this.f34335G);
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity13 = NSTEXOPlayerSkyTvActivity.this;
                    nSTEXOPlayerSkyTvActivity13.I4(nSTEXOPlayerSkyTvActivity13.f34335G);
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity14 = NSTEXOPlayerSkyTvActivity.this;
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity15 = NSTEXOPlayerSkyTvActivity.this;
                    nSTEXOPlayerSkyTvActivity14.f34566q2 = new R(nSTEXOPlayerSkyTvActivity15, nSTEXOPlayerSkyTvActivity15.f34328F, viewOnClickListenerC1464k).execute(new String[0]);
                    NSTEXOPlayerSkyTvActivity.this.f34330F1.removeCallbacksAndMessages(null);
                    NSTEXOPlayerSkyTvActivity.this.f34600v1 = m7.w.q0(streamId);
                    if (NSTEXOPlayerSkyTvActivity.this.f34621y1 != null) {
                        NSTEXOPlayerSkyTvActivity.this.f34621y1.putString("currentlyPlayingVideo", streamId);
                        NSTEXOPlayerSkyTvActivity.this.f34621y1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", url);
                        NSTEXOPlayerSkyTvActivity.this.f34621y1.apply();
                    }
                    channelDetails.clear();
                    return;
                }
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity16 = NSTEXOPlayerSkyTvActivity.this;
                nSTEXOPlayerSkyTvActivity16.f34400Q1.setText(nSTEXOPlayerSkyTvActivity16.f34486f.getResources().getString(a7.j.f13261g4));
                NSTEXOPlayerSkyTvActivity.this.f34394P1.setVisibility(0);
                handler = new Handler();
                cVar = new b();
            }
            handler.postDelayed(cVar, 1000L);
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$o, reason: case insensitive filesystem */
    public class RunnableC1468o implements Runnable {
        public RunnableC1468o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyTvActivity.this.v4("", false);
            NSTEXOPlayerSkyTvActivity.this.f34540m4 = Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$p, reason: case insensitive filesystem */
    public class RunnableC1469p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f34741a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f34742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f34743d;

        public RunnableC1469p(int i9, String str, String str2) {
            this.f34741a = i9;
            this.f34742c = str;
            this.f34743d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!SharepreferenceDBHandler.getCurrentAPPType(NSTEXOPlayerSkyTvActivity.this.f34486f).equals("stalker_api")) {
                NSTEXOPlayerSkyTvActivity.this.K4(this.f34741a, this.f34742c, this.f34743d);
                return;
            }
            m7.w.N0(NSTEXOPlayerSkyTvActivity.this.f34486f);
            String stalkerToken = SharepreferenceDBHandler.getStalkerToken(NSTEXOPlayerSkyTvActivity.this.f34486f);
            try {
                NSTEXOPlayerSkyTvActivity.this.f34461a4.c(SharepreferenceDBHandler.getLoggedInMacAddress(NSTEXOPlayerSkyTvActivity.this.f34486f), stalkerToken, ((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34599v0.get(this.f34741a)).getCmd(), "", null, "itv", 0, 0, "", "", "", "", "", "zappingLeft", this.f34741a, this.f34742c, this.f34743d);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$q, reason: case insensitive filesystem */
    public class RunnableC1470q implements Runnable {
        public RunnableC1470q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyTvActivity.this.v4("", false);
            NSTEXOPlayerSkyTvActivity.this.f34540m4 = Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$r, reason: case insensitive filesystem */
    public class RunnableC1471r implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f34746a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f34747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f34748d;

        public RunnableC1471r(int i9, String str, String str2) {
            this.f34746a = i9;
            this.f34747c = str;
            this.f34748d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!SharepreferenceDBHandler.getCurrentAPPType(NSTEXOPlayerSkyTvActivity.this.f34486f).equals("stalker_api")) {
                NSTEXOPlayerSkyTvActivity.this.L4(this.f34746a, this.f34747c, this.f34748d);
                return;
            }
            m7.w.N0(NSTEXOPlayerSkyTvActivity.this.f34486f);
            String stalkerToken = SharepreferenceDBHandler.getStalkerToken(NSTEXOPlayerSkyTvActivity.this.f34486f);
            try {
                NSTEXOPlayerSkyTvActivity.this.f34461a4.c(SharepreferenceDBHandler.getLoggedInMacAddress(NSTEXOPlayerSkyTvActivity.this.f34486f), stalkerToken, ((LiveStreamsDBModel) NSTEXOPlayerSkyTvActivity.this.f34599v0.get(this.f34746a)).getCmd(), "", null, "itv", 0, 0, "", "", "", "", "", "zappingRight", this.f34746a, this.f34747c, this.f34748d);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$s, reason: case insensitive filesystem */
    public class C1472s implements TextWatcher {
        public C1472s() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity;
            boolean z9;
            if (charSequence == null || charSequence.toString().length() <= 0) {
                nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                z9 = false;
            } else {
                nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                z9 = true;
            }
            nSTEXOPlayerSkyTvActivity.f34547n4 = z9;
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x000c A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:3:0x0002, B:7:0x0014, B:9:0x001c, B:5:0x000c), top: B:12:0x0002 }] */
        @Override // android.text.TextWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            /*
                r0 = this;
                if (r1 == 0) goto Lc
                java.lang.String r2 = r1.toString()     // Catch: java.lang.Exception -> L34
                int r2 = r2.length()     // Catch: java.lang.Exception -> L34
                if (r2 > 0) goto L14
            Lc:
                com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> L34
                boolean r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.W2(r2)     // Catch: java.lang.Exception -> L34
                if (r2 == 0) goto L34
            L14:
                com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> L34
                q7.N r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.i2(r2)     // Catch: java.lang.Exception -> L34
                if (r2 == 0) goto L34
                com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> L34
                q7.N r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.i2(r2)     // Catch: java.lang.Exception -> L34
                android.widget.Filter r2 = r2.getFilter()     // Catch: java.lang.Exception -> L34
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L34
                r2.filter(r1)     // Catch: java.lang.Exception -> L34
                java.lang.String r1 = "honey"
                java.lang.String r2 = "onTextChanged: notify"
                android.util.Log.e(r1, r2)     // Catch: java.lang.Exception -> L34
            L34:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.C1472s.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$t, reason: case insensitive filesystem */
    public class RunnableC1473t implements Runnable {
        public RunnableC1473t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyTvActivity.this.P3();
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$u, reason: case insensitive filesystem */
    public class RunnableC1474u implements Runnable {
        public RunnableC1474u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyTvActivity.this.O3();
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$v, reason: case insensitive filesystem */
    public class DialogInterfaceOnClickListenerC1475v implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC1475v() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.dismiss();
        }
    }

    public class w implements View.OnClickListener {
        public w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class x extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f34755a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f34756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f34757d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f34758e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f34759f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public RadioGroup f34760g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Activity f34761h;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f34763a;

            public a(View view) {
                this.f34763a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f34763a;
                    if (view2 == null || view2.getTag() == null || !this.f34763a.getTag().equals("1")) {
                        View view3 = this.f34763a;
                        if (view3 == null || view3.getTag() == null || !this.f34763a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = x.this.f34759f;
                        }
                    } else {
                        linearLayout = x.this.f34758e;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f34763a;
                    if (view4 == null || view4.getTag() == null || !this.f34763a.getTag().equals("1")) {
                        View view5 = this.f34763a;
                        if (view5 == null || view5.getTag() == null || !this.f34763a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = x.this.f34759f;
                        }
                    } else {
                        linearLayout = x.this.f34758e;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(Activity activity, Activity activity2) {
            super(activity);
            this.f34761h = activity2;
            this.f34755a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getId() == a7.f.f12544u1) {
                try {
                    String string = ((RadioButton) findViewById(this.f34760g.getCheckedRadioButtonId())).getText().toString();
                    SharepreferenceDBHandler.setLiveSubCatSort(string.equals(this.f34761h.getResources().getString(a7.j.f13284i7)) ? "1" : string.equals(this.f34761h.getResources().getString(a7.j.f13254f7)) ? "2" : string.equals(this.f34761h.getResources().getString(a7.j.f13304k7)) ? "3" : string.equals(this.f34761h.getResources().getString(a7.j.f13264g7)) ? "4" : string.equals(this.f34761h.getResources().getString(a7.j.f13274h7)) ? "5" : "0", this.f34761h);
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                    nSTEXOPlayerSkyTvActivity.b4(nSTEXOPlayerSkyTvActivity.f34371L2);
                    dismiss();
                } catch (Exception unused) {
                }
            } else if (view.getId() == a7.f.f12412h1) {
                dismiss();
            }
            dismiss();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00cb  */
        @Override // android.app.Dialog
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onCreate(android.os.Bundle r13) {
            /*
                Method dump skipped, instruction units count: 282
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.x.onCreate(android.os.Bundle):void");
        }
    }

    public class y implements DialogInterface.OnClickListener {
        public y() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            m7.w.n0(NSTEXOPlayerSkyTvActivity.this.f34486f);
        }
    }

    public class z implements SearchView.m {
        public z() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextChange(String str) {
            if (NSTEXOPlayerSkyTvActivity.this.f34390O3 == null) {
                return false;
            }
            NSTEXOPlayerSkyTvActivity.this.f34390O3.getFilter().filter(str);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public NSTEXOPlayerSkyTvActivity() {
        Boolean bool = Boolean.FALSE;
        this.f34412S1 = bool;
        this.f34418T1 = bool;
        this.f34442X1 = "";
        this.f34475d2 = "";
        this.f34482e2 = bool;
        this.f34496g2 = "";
        Boolean bool2 = Boolean.TRUE;
        this.f34503h2 = bool2;
        this.f34510i2 = null;
        this.f34524k2 = -1;
        this.f34531l2 = 0;
        this.f34538m2 = "";
        this.f34545n2 = bool2;
        this.f34552o2 = null;
        this.f34559p2 = null;
        this.f34566q2 = null;
        this.f34580s2 = false;
        this.f34587t2 = 0;
        this.f34594u2 = false;
        this.f34601v2 = 4;
        this.f34608w2 = f34291O5[0];
        this.f34629z2 = bool;
        this.f34296A2 = bool;
        this.f34303B2 = bool;
        this.f34310C2 = bool;
        this.f34317D2 = bool;
        this.f34324E2 = bool;
        this.f34359J2 = 0;
        this.f34365K2 = "0";
        this.f34371L2 = "0";
        this.f34377M2 = bool2;
        this.f34372L3 = "mobile";
        this.f34414S3 = 0;
        this.f34432V3 = "";
        this.f34438W3 = "false";
        this.f34444X3 = "false";
        this.f34450Y3 = "-10";
        this.f34456Z3 = 0;
        this.f34466b4 = "";
        this.f34471c4 = "";
        this.f34477d4 = 0;
        this.f34484e4 = 0;
        this.f34505h4 = 0;
        this.f34512i4 = false;
        this.f34519j4 = true;
        this.f34533l4 = null;
        this.f34540m4 = bool;
        this.f34547n4 = false;
        this.f34554o4 = "";
        this.f34561p4 = "";
        this.f34568q4 = 0;
        this.f34610w4 = 0;
        this.f34617x4 = 5;
        this.f34624y4 = false;
        this.f34631z4 = false;
        this.f34312C4 = "";
        this.f34319D4 = "";
        this.f34590t5 = "Live";
        this.f34597u5 = "";
        this.f34618x5 = "";
        this.f34625y5 = "";
        this.f34632z5 = "";
        this.f34306B5 = "";
        this.f34334F5 = "";
        this.f34341G5 = 0;
        this.f34348H5 = null;
        this.f34355I5 = new ArrayList();
    }

    private void B3() {
        ImageView imageView = this.f34460a3;
        imageView.setOnFocusChangeListener(new O(imageView));
        ImageView imageView2 = this.f34465b3;
        imageView2.setOnFocusChangeListener(new O(imageView2));
        ImageView imageView3 = this.f34483e3;
        imageView3.setOnFocusChangeListener(new O(imageView3));
        ImageView imageView4 = this.f34490f3;
        imageView4.setOnFocusChangeListener(new O(imageView4));
        LinearLayout linearLayout = this.f34539m3;
        linearLayout.setOnFocusChangeListener(new O(linearLayout));
        LinearLayout linearLayout2 = this.f34546n3;
        linearLayout2.setOnFocusChangeListener(new O(linearLayout2));
        LinearLayout linearLayout3 = this.f34553o3;
        linearLayout3.setOnFocusChangeListener(new O(linearLayout3));
        LinearLayout linearLayout4 = this.f34431V2;
        linearLayout4.setOnFocusChangeListener(new O(linearLayout4));
        LinearLayout linearLayout5 = this.f34532l3;
        linearLayout5.setOnFocusChangeListener(new O(linearLayout5));
        ImageView imageView5 = this.f34470c3;
        imageView5.setOnFocusChangeListener(new O(imageView5));
        ImageView imageView6 = this.f34476d3;
        imageView6.setOnFocusChangeListener(new O(imageView6));
        RelativeLayout relativeLayout = this.f34630z3;
        relativeLayout.setOnFocusChangeListener(new O(relativeLayout));
        ImageView imageView7 = this.f34534l5;
        imageView7.setOnFocusChangeListener(new O(imageView7));
        RelativeLayout relativeLayout2 = this.f34541m5;
        relativeLayout2.setOnFocusChangeListener(new O(relativeLayout2));
        ImageView imageView8 = this.f34534l5;
        imageView8.setOnFocusChangeListener(new O(imageView8));
        LinearLayout linearLayout6 = this.f34548n5;
        linearLayout6.setOnFocusChangeListener(new O(linearLayout6));
        LinearLayout linearLayout7 = this.f34555o5;
        linearLayout7.setOnFocusChangeListener(new O(linearLayout7));
        CheckBox checkBox = this.f34354I4;
        checkBox.setOnFocusChangeListener(new O(checkBox));
        CheckBox checkBox2 = this.f34361J4;
        checkBox2.setOnFocusChangeListener(new O(checkBox2));
        CheckBox checkBox3 = this.f34367K4;
        checkBox3.setOnFocusChangeListener(new O(checkBox3));
        CheckBox checkBox4 = this.f34373L4;
        checkBox4.setOnFocusChangeListener(new O(checkBox4));
        LinearLayout linearLayout8 = this.f34562p5;
        linearLayout8.setOnFocusChangeListener(new O(linearLayout8));
        CheckBox checkBox5 = this.f34379M4;
        checkBox5.setOnFocusChangeListener(new O(checkBox5));
        CheckBox checkBox6 = this.f34385N4;
        checkBox6.setOnFocusChangeListener(new O(checkBox6));
        CheckBox checkBox7 = this.f34391O4;
        checkBox7.setOnFocusChangeListener(new O(checkBox7));
        CheckBox checkBox8 = this.f34397P4;
        checkBox8.setOnFocusChangeListener(new O(checkBox8));
        CheckBox checkBox9 = this.f34403Q4;
        checkBox9.setOnFocusChangeListener(new O(checkBox9));
        LinearLayout linearLayout9 = this.f34569q5;
        linearLayout9.setOnFocusChangeListener(new O(linearLayout9));
        LinearLayout linearLayout10 = this.f34576r5;
        linearLayout10.setOnFocusChangeListener(new O(linearLayout10));
        CheckBox checkBox10 = this.f34415S4;
        checkBox10.setOnFocusChangeListener(new O(checkBox10));
        CheckBox checkBox11 = this.f34421T4;
        checkBox11.setOnFocusChangeListener(new O(checkBox11));
        CheckBox checkBox12 = this.f34427U4;
        checkBox12.setOnFocusChangeListener(new O(checkBox12));
        CheckBox checkBox13 = this.f34433V4;
        checkBox13.setOnFocusChangeListener(new O(checkBox13));
        EditText editText = this.f34499g5;
        editText.setOnFocusChangeListener(new O(editText));
        TextView textView = this.f34347H4;
        textView.setOnFocusChangeListener(new O(textView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B4() {
        LinearLayout linearLayout;
        if (this.f34432V3.equals("player")) {
            linearLayout = this.f34619y;
            if (linearLayout == null) {
                return;
            }
        } else {
            linearLayout = this.f34612x;
            if (linearLayout == null) {
                return;
            }
        }
        linearLayout.setVisibility(0);
    }

    private void C4(Activity activity) {
        new x((NSTEXOPlayerSkyTvActivity) activity, activity).show();
    }

    public static String D3(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    private void D4() {
        if (this.f34298A4 || !b.b0(this.f34575r4)) {
            return;
        }
        this.f34298A4 = true;
        b.P(this.f34575r4, new DialogInterface.OnDismissListener() { // from class: r7.p
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f49789a.X3(dialogInterface);
            }
        }).show(getSupportFragmentManager(), (String) null);
    }

    private void E4() {
        float fApplyDimension;
        ProgressDialog progressDialogW3;
        try {
            if (AbstractC2237a.f44480Y.booleanValue()) {
                findViewById(a7.f.f12491p).setOnClickListener(this);
            }
            this.f34423U0.setVisibility(0);
            this.f34429V0.setVisibility(0);
            this.f34435W0.setVisibility(0);
            try {
                fApplyDimension = TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics());
            } catch (Exception unused) {
                fApplyDimension = 8.0f;
            }
            int i9 = (int) fApplyDimension;
            this.f34417T0.setPadding(i9, i9, i9, i9);
            RelativeLayout relativeLayout = this.f34449Y2;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f34441X0.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = 0;
            this.f34441X0.setLayoutParams(layoutParams);
            getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            f34288L5 = false;
            ListView listView = this.f34349I;
            if (listView != null) {
                listView.requestFocus();
            }
            if (this.f34540m4.booleanValue()) {
                return;
            }
            ProgressDialog progressDialog = this.f34573r2;
            if (progressDialog == null) {
                progressDialogW3 = w3(this.f34486f);
                this.f34573r2 = progressDialogW3;
                if (progressDialogW3 != null) {
                    progressDialogW3.show();
                }
            } else if (!progressDialog.isShowing()) {
                progressDialogW3 = this.f34573r2;
                progressDialogW3.show();
            }
            this.f34351I1.removeCallbacksAndMessages(null);
            v4("", false);
            this.f34540m4 = Boolean.TRUE;
        } catch (Exception e9) {
            Log.e("exection", "" + e9);
        }
    }

    private void H4() {
        F4();
        if (this.f34413S2.getVisibility() == 0) {
            O3();
        } else {
            z4();
            n3(5000);
        }
    }

    private ArrayList J3() {
        ArrayList<PasswordStatusDBModel> allPasswordStatus = this.f34404R.getAllPasswordStatus(SharepreferenceDBHandler.getUserID(this.f34486f));
        this.f34301B0 = allPasswordStatus;
        if (allPasswordStatus != null) {
            for (PasswordStatusDBModel passwordStatusDBModel : allPasswordStatus) {
                if (passwordStatusDBModel.getPasswordStatus().equals("1")) {
                    this.f34627z0.add(passwordStatusDBModel.getPasswordStatusCategoryId());
                }
            }
        }
        return this.f34627z0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean K3(ArrayList arrayList, ArrayList arrayList2) {
        try {
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
        } catch (Exception e9) {
            e9.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K4(int i9, String str, String str2) {
        PlayerView playerView;
        boolean z9;
        try {
            ArrayList arrayList = this.f34599v0;
            if (arrayList == null || arrayList.size() <= 0) {
                return;
            }
            if (this.f34448Y1.equals("m3u")) {
                this.f34603v4 = Uri.parse(str2);
                playerView = this.f34464b2;
                z9 = f34288L5;
            } else if (SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("stalker_api")) {
                this.f34603v4 = Uri.parse(this.f34471c4);
                playerView = this.f34464b2;
                z9 = f34288L5;
            } else {
                this.f34603v4 = Uri.parse(this.f34493g + m7.w.q0(((LiveStreamsDBModel) this.f34599v0.get(i9)).getStreamId()) + this.f34494g0);
                playerView = this.f34464b2;
                z9 = f34288L5;
            }
            playerView.u(Boolean.valueOf(z9));
            U3();
            this.f34610w4 = 0;
            this.f34624y4 = false;
            ViewOnClickListenerC1464k viewOnClickListenerC1464k = null;
            this.f34337G1.removeCallbacksAndMessages(null);
            this.f34328F = ((LiveStreamsDBModel) this.f34599v0.get(i9)).getEpgChannelId();
            this.f34335G = ((LiveStreamsDBModel) this.f34599v0.get(i9)).getStreamIcon();
            this.f34464b2.setCurrentEpgChannelID(this.f34328F);
            this.f34464b2.setCurrentChannelLogo(this.f34335G);
            I4(this.f34335G);
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("stalker_api")) {
                J4(((LiveStreamsDBModel) this.f34599v0.get(i9)).getStreamId());
            } else {
                this.f34566q2 = new R(this, this.f34328F, viewOnClickListenerC1464k).execute(new String[0]);
            }
        } catch (Exception unused) {
        }
    }

    private ArrayList L3(ArrayList arrayList, ArrayList arrayList2) {
        try {
            this.f34322E0 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                FavouriteDBModel favouriteDBModel = (FavouriteDBModel) it.next();
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        this.f34322E0.add(favouriteDBModel);
                        break;
                    }
                    if (favouriteDBModel.getCategoryID().equals((String) it2.next())) {
                        break;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return this.f34322E0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L4(int i9, String str, String str2) {
        PlayerView playerView;
        boolean z9;
        try {
            ArrayList arrayList = this.f34599v0;
            if (arrayList == null || arrayList.size() <= 0) {
                return;
            }
            if (this.f34448Y1.equals("m3u")) {
                this.f34603v4 = Uri.parse(str2);
                playerView = this.f34464b2;
                z9 = f34288L5;
            } else if (SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("stalker_api")) {
                this.f34603v4 = Uri.parse(this.f34471c4);
                playerView = this.f34464b2;
                z9 = f34288L5;
            } else {
                this.f34603v4 = Uri.parse(this.f34493g + m7.w.q0(((LiveStreamsDBModel) this.f34599v0.get(i9)).getStreamId()) + this.f34494g0);
                playerView = this.f34464b2;
                z9 = f34288L5;
            }
            playerView.u(Boolean.valueOf(z9));
            U3();
            this.f34610w4 = 0;
            this.f34624y4 = false;
            ViewOnClickListenerC1464k viewOnClickListenerC1464k = null;
            this.f34337G1.removeCallbacksAndMessages(null);
            this.f34328F = ((LiveStreamsDBModel) this.f34599v0.get(i9)).getEpgChannelId();
            this.f34335G = ((LiveStreamsDBModel) this.f34599v0.get(i9)).getStreamIcon();
            this.f34464b2.setCurrentEpgChannelID(this.f34328F);
            this.f34464b2.setCurrentChannelLogo(this.f34335G);
            I4(this.f34335G);
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("stalker_api")) {
                J4(((LiveStreamsDBModel) this.f34599v0.get(i9)).getStreamId());
            } else {
                this.f34566q2 = new R(this, this.f34328F, viewOnClickListenerC1464k).execute(new String[0]);
            }
        } catch (Exception unused) {
        }
    }

    private ArrayList M3(ArrayList arrayList, ArrayList arrayList2) {
        this.f34329F0 = new ArrayList();
        if (arrayList == null) {
            return null;
        }
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                FavouriteM3UModel favouriteM3UModel = (FavouriteM3UModel) it.next();
                if (arrayList2 != null) {
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            this.f34329F0.add(favouriteM3UModel);
                            break;
                        }
                        if (favouriteM3UModel.getCategoryID().equals((String) it2.next())) {
                            break;
                        }
                    }
                }
            }
            return this.f34329F0;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N3() {
        ProgressBar progressBar = this.f34605w;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView = this.f34570r;
        if (textView != null) {
            textView.setText(this.f34486f.getResources().getString(a7.j.f13078N4));
        }
        TextView textView2 = this.f34577s;
        if (textView2 != null) {
            textView2.setText("");
        }
        TextView textView3 = this.f34584t;
        if (textView3 != null) {
            textView3.setText(this.f34486f.getResources().getString(a7.j.f13221c4));
        }
        TextView textView4 = this.f34591u;
        if (textView4 != null) {
            textView4.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O3() {
        if (this.f34413S2.getVisibility() == 0) {
            this.f34413S2.startAnimation(this.f34353I3);
            this.f34581s3.startAnimation(this.f34353I3);
            this.f34567q3.startAnimation(this.f34353I3);
            this.f34574r3.startAnimation(this.f34353I3);
            if (this.f34395P2.getVisibility() == 0) {
                this.f34395P2.startAnimation(this.f34353I3);
            }
            if (this.f34407R2.getVisibility() == 0) {
                this.f34407R2.startAnimation(this.f34353I3);
            }
            if (this.f34401Q2.getVisibility() == 0) {
                this.f34401Q2.startAnimation(this.f34353I3);
            }
            this.f34413S2.setVisibility(8);
            if (this.f34395P2.getVisibility() == 0) {
                this.f34395P2.setVisibility(8);
            }
            if (this.f34407R2.getVisibility() == 0) {
                this.f34407R2.setVisibility(8);
            }
            if (this.f34401Q2.getVisibility() == 0) {
                this.f34401Q2.setVisibility(8);
            }
            this.f34581s3.setVisibility(8);
            this.f34567q3.setVisibility(8);
            this.f34574r3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q3() {
        LinearLayout linearLayout = this.f34612x;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f34619y;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U3() {
        if (this.f34603v4 != null) {
            o4();
            if (this.f34575r4 == null) {
                G1 g1B = AbstractC2683b.b(this, false);
                C0509q c0509q = new C0509q(this.f34582s4);
                m mVar = new m(this);
                this.f34589t4 = mVar;
                mVar.m(this.f34596u4);
                I1 i1A = new I1.a(this, g1B).b(c0509q).c(this.f34589t4).a();
                this.f34575r4 = i1A;
                i1A.B(new Q(this, null));
                this.f34575r4.W(new C1700q(this.f34589t4));
                this.f34575r4.O(C1019e.f7784h, true);
                this.f34575r4.o(true);
                this.f34464b2.setPlayer(this.f34575r4);
            }
            this.f34575r4.h0(0, H0.d(this.f34603v4));
            this.f34575r4.prepare();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x01a4 A[PHI: r3
      0x01a4: PHI (r3v17 java.lang.String) = (r3v6 java.lang.String), (r3v7 java.lang.String), (r3v8 java.lang.String) binds: [B:8:0x01a2, B:11:0x01b3, B:14:0x01c2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void V3() {
        /*
            Method dump skipped, instruction units count: 2150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.V3():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X3(DialogInterface dialogInterface) {
        this.f34298A4 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y3(AdapterView adapterView, View view, int i9, long j9, ArrayList arrayList) {
        String cmd;
        n7.g gVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        this.f34549o.setVisibility(8);
        if (!SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("stalker_api")) {
            i4(this.f34477d4, this.f34368L);
            return;
        }
        try {
            String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f34486f);
            String loggedInMacAddress = SharepreferenceDBHandler.getLoggedInMacAddress(this.f34486f);
            ArrayList arrayListG = this.f34390O3.g();
            if (arrayListG != null && arrayListG.size() > 0) {
                cmd = ((LiveStreamsDBModel) arrayListG.get(this.f34477d4)).getCmd();
                if (this.f34600v1 != m7.w.q0(((LiveStreamsDBModel) arrayListG.get(this.f34477d4)).getStreamId())) {
                    m7.w.N0(this.f34486f);
                    gVar = this.f34461a4;
                    str = "";
                    str2 = "itv";
                    str3 = "";
                    str4 = "";
                    str5 = "";
                    str6 = "";
                    str7 = "";
                    str8 = "channel_click";
                    str9 = "";
                    str10 = "";
                    gVar.c(loggedInMacAddress, stalkerToken, cmd, str, null, str2, 0, 0, str3, str4, str5, str6, str7, str8, 0, str9, str10);
                    return;
                }
                C3();
            }
            ArrayList arrayList2 = this.f34585t0;
            if (arrayList2 == null || arrayList2.size() <= 0) {
                return;
            }
            cmd = ((LiveStreamsDBModel) this.f34585t0.get(this.f34477d4)).getCmd();
            if (this.f34600v1 != m7.w.q0(((LiveStreamsDBModel) this.f34585t0.get(this.f34477d4)).getStreamId())) {
                m7.w.N0(this.f34486f);
                gVar = this.f34461a4;
                str = "";
                str2 = "itv";
                str3 = "";
                str4 = "";
                str5 = "";
                str6 = "";
                str7 = "";
                str8 = "channel_click";
                str9 = "";
                str10 = "";
                gVar.c(loggedInMacAddress, stalkerToken, cmd, str, null, str2, 0, 0, str3, str4, str5, str6, str7, str8, 0, str9, str10);
                return;
            }
            C3();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z3(String str, String str2, String str3) {
        String string;
        String str4;
        JSONObject jSONObject;
        String str5;
        String str6;
        String str7;
        String str8 = "";
        if (this.f34503h2.booleanValue()) {
            if (this.f34448Y1.equals("m3u")) {
                str4 = this.f34454Z1;
            } else if (this.f34448Y1.equals("onestream_api")) {
                try {
                    jSONObject = new JSONObject(this.f34454Z1);
                    String str9 = this.f34494g0;
                    str5 = "m3u8";
                    str6 = "ts";
                    if (str9 == null || str9.isEmpty() || !this.f34494g0.equals(".ts")) {
                        string = "";
                        str7 = string;
                    } else {
                        Iterator<String> itKeys = jSONObject.keys();
                        while (true) {
                            if (!itKeys.hasNext()) {
                                str7 = "";
                                break;
                            } else if (itKeys.next().equals("ts")) {
                                str7 = "ts";
                                break;
                            }
                        }
                        if (str7.equals("")) {
                            while (true) {
                                if (!itKeys.hasNext()) {
                                    break;
                                } else if (itKeys.next().equals("m3u8")) {
                                    str7 = "m3u8";
                                    break;
                                }
                            }
                        }
                        string = jSONObject.getString(str7);
                    }
                } catch (Exception unused) {
                }
                try {
                    String str10 = this.f34494g0;
                    if (str10 != null && !str10.isEmpty() && this.f34494g0.equals(".m3u8")) {
                        Iterator<String> itKeys2 = jSONObject.keys();
                        while (true) {
                            if (!itKeys2.hasNext()) {
                                str5 = str7;
                                break;
                            } else if (itKeys2.next().equals("m3u8")) {
                                break;
                            }
                        }
                        if (str5.equals("")) {
                            while (itKeys2.hasNext()) {
                                if (itKeys2.next().equals("ts")) {
                                    break;
                                }
                            }
                            str6 = str5;
                            string = jSONObject.getString(str6);
                        } else {
                            str6 = str5;
                            string = jSONObject.getString(str6);
                        }
                    }
                } catch (Exception unused2) {
                    str8 = string;
                    string = str8;
                }
                str4 = string + f34288L5 + str;
            } else if (SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("stalker_api")) {
                str4 = this.f34471c4;
            } else {
                str4 = this.f34493g + this.f34531l2 + this.f34494g0;
            }
            this.f34603v4 = Uri.parse(str4);
            this.f34464b2.u(Boolean.valueOf(f34288L5));
            U3();
            this.f34610w4 = 0;
            this.f34624y4 = false;
        }
        ViewOnClickListenerC1464k viewOnClickListenerC1464k = null;
        this.f34337G1.removeCallbacksAndMessages(null);
        this.f34328F = str2;
        this.f34335G = str3;
        this.f34464b2.setCurrentEpgChannelID(str2);
        this.f34464b2.setCurrentChannelLogo(this.f34335G);
        I4(this.f34335G);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("stalker_api")) {
            J4(String.valueOf(this.f34600v1));
        } else {
            this.f34566q2 = new R(this, this.f34328F, viewOnClickListenerC1464k).execute(new String[0]);
        }
        this.f34412S1 = Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a4(String str, String str2, String str3, AdapterView adapterView, View view, int i9, long j9, ArrayList arrayList) {
        if (Listsingleton.b().a() == null || Listsingleton.b().a().size() <= 0) {
            Z3(str, str2, str3);
            return;
        }
        List listA = Listsingleton.b().a();
        Dialog dialog = new Dialog(this, k.f13462g);
        dialog.requestWindowFeature(1);
        dialog.setContentView(a7.g.f12682N1);
        dialog.getWindow().setBackgroundDrawable(null);
        dialog.getWindow().setLayout(-1, -2);
        dialog.setCancelable(false);
        ImageView imageView = (ImageView) dialog.findViewById(a7.f.f12201L4);
        ImageView imageView2 = (ImageView) dialog.findViewById(a7.f.f12308W4);
        this.f34588t3 = (LinearLayout) dialog.findViewById(a7.f.f12114C7);
        imageView2.setOnClickListener(new C(str, str2, str3, adapterView, i9, j9, arrayList, dialog));
        this.f34588t3.setOnClickListener(new D(str, str2, str3, adapterView, i9, j9, arrayList, dialog));
        imageView2.setOnFocusChangeListener(new J(imageView2));
        imageView2.setNextFocusUpId(a7.f.f12308W4);
        imageView2.setNextFocusDownId(a7.f.f12308W4);
        imageView2.setNextFocusRightId(a7.f.f12308W4);
        imageView2.setNextFocusLeftId(a7.f.f12308W4);
        imageView2.requestFocus();
        if (listA != null) {
            try {
                if (listA.size() > 0) {
                    if (listA.size() > AbstractC2237a.f44516k1) {
                        com.squareup.picasso.t.q(this.f34486f).l((String) listA.get(AbstractC2237a.f44516k1)).g(imageView);
                        AbstractC2237a.f44516k1++;
                    } else {
                        com.squareup.picasso.t.q(this.f34486f).l((String) listA.get(0)).g(imageView);
                        AbstractC2237a.f44516k1 = 1;
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        dialog.show();
        dialog.getWindow().setBackgroundDrawableResource(c.f11875z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c3(int i9, String str) {
        try {
            StringBuilder sb = new StringBuilder();
            List<Integer> favIdsList = StalkerLiveFavIdsSingleton.getInstance().getFavIdsList();
            this.f34491f4 = favIdsList;
            if (favIdsList != null && favIdsList.size() > 0) {
                for (int i10 = 0; i10 < this.f34491f4.size(); i10++) {
                    sb.append(this.f34491f4.get(i10));
                    sb.append(",");
                }
            }
            sb.append(i9);
            this.f34505h4 = i9;
            String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f34486f);
            this.f34498g4.c(SharepreferenceDBHandler.getLoggedInMacAddress(this.f34486f), stalkerToken, null, sb.toString(), "added", str);
        } catch (Exception unused) {
            m7.w.X();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c4() {
        ProgressBar progressBar = this.f34605w;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView = this.f34570r;
        if (textView != null) {
            textView.setText(this.f34486f.getResources().getString(a7.j.f13068M4));
        }
        TextView textView2 = this.f34577s;
        if (textView2 != null) {
            textView2.setText("");
        }
        TextView textView3 = this.f34584t;
        if (textView3 != null) {
            textView3.setText(this.f34486f.getResources().getString(a7.j.f13211b4));
        }
        TextView textView4 = this.f34591u;
        if (textView4 != null) {
            textView4.setText("");
        }
    }

    private void d4() {
        int currentWindowIndex = this.f34464b2.getCurrentWindowIndex();
        if (currentWindowIndex == this.f34599v0.size() - 1) {
            this.f34464b2.setCurrentWindowIndex(0);
        } else {
            this.f34464b2.setCurrentWindowIndex(currentWindowIndex + 1);
        }
    }

    private void f3(Configuration configuration) {
        PlayerView playerView;
        boolean z9;
        View decorView = getWindow().getDecorView();
        if (configuration.orientation == 2) {
            decorView.setSystemUiVisibility(5894);
            playerView = this.f34464b2;
            z9 = false;
        } else {
            decorView.setSystemUiVisibility(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH);
            playerView = this.f34464b2;
            z9 = true;
        }
        playerView.setAdjustViewBounds(z9);
    }

    private void h4() {
        this.f34460a3.setOnClickListener(this);
        this.f34465b3.setOnClickListener(this);
        this.f34425U2.setOnClickListener(this);
        this.f34483e3.setOnClickListener(this);
        this.f34304B3.setOnClickListener(this);
        this.f34490f3.setOnClickListener(this);
        this.f34539m3.setOnClickListener(this);
        this.f34546n3.setOnClickListener(this);
        this.f34553o3.setOnClickListener(this);
        this.f34431V2.setOnClickListener(this);
        this.f34532l3.setOnClickListener(this);
        this.f34470c3.setOnClickListener(this);
        this.f34476d3.setOnClickListener(this);
        this.f34630z3.setOnClickListener(this);
        this.f34534l5.setOnClickListener(this);
        this.f34541m5.setOnClickListener(this);
        this.f34548n5.setOnClickListener(this);
        this.f34555o5.setOnClickListener(this);
        this.f34562p5.setOnClickListener(this);
        this.f34569q5.setOnClickListener(this);
        this.f34576r5.setOnClickListener(this);
        this.f34439W4.setOnClickListener(this);
        this.f34513i5.setOnClickListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:293:0x0a91 A[Catch: Exception -> 0x0c9d, TryCatch #2 {Exception -> 0x0c9d, blocks: (B:3:0x0006, B:5:0x000a, B:7:0x0016, B:8:0x001c, B:11:0x004e, B:13:0x0054, B:15:0x0087, B:17:0x0099, B:19:0x00c2, B:20:0x00ca, B:22:0x0112, B:24:0x011a, B:26:0x0122, B:28:0x013c, B:30:0x0142, B:31:0x014a, B:40:0x019f, B:42:0x01df, B:43:0x01f8, B:45:0x01fc, B:46:0x0212, B:48:0x0216, B:49:0x021e, B:50:0x0220, B:39:0x018e, B:51:0x0225, B:52:0x022a, B:146:0x04d5, B:148:0x04eb, B:150:0x0514, B:151:0x051c, B:153:0x056c, B:155:0x0574, B:157:0x057c, B:159:0x0596, B:161:0x059c, B:162:0x05a4, B:171:0x05f9, B:173:0x0620, B:175:0x0640, B:177:0x0654, B:179:0x0660, B:180:0x0662, B:182:0x068e, B:181:0x0669, B:183:0x06a1, B:185:0x06a5, B:186:0x06ce, B:188:0x06d2, B:174:0x062f, B:170:0x05e8, B:145:0x04b8, B:189:0x06dc, B:191:0x06e8, B:193:0x06ee, B:195:0x072f, B:197:0x0743, B:199:0x0770, B:200:0x0778, B:202:0x07c6, B:204:0x07ce, B:206:0x07d6, B:208:0x07f4, B:210:0x07fa, B:211:0x0802, B:213:0x0811, B:214:0x082a, B:216:0x085f, B:217:0x0877, B:219:0x087b, B:220:0x0885, B:222:0x088d, B:224:0x08a1, B:226:0x08ce, B:227:0x08d6, B:229:0x0924, B:231:0x092c, B:233:0x0934, B:235:0x0956, B:236:0x095e, B:290:0x0a43, B:291:0x0a5c, B:293:0x0a91, B:294:0x0ac0, B:296:0x0ac4, B:297:0x0acc, B:298:0x0ad0, B:300:0x0ae6, B:302:0x0b13, B:303:0x0b1b, B:305:0x0b71, B:307:0x0b79, B:309:0x0b81, B:311:0x0b9f, B:313:0x0ba5, B:314:0x0bad, B:316:0x0bbc, B:318:0x0bca, B:319:0x0bcc, B:321:0x0bfa, B:323:0x0c10, B:325:0x0c37, B:327:0x0c59, B:329:0x0c62, B:330:0x0c8f, B:332:0x0c93, B:326:0x0c48, B:320:0x0bd3, B:32:0x0154, B:34:0x015a, B:36:0x0160, B:37:0x017c, B:163:0x05ae, B:165:0x05b4, B:167:0x05ba, B:168:0x05d6, B:54:0x0232, B:56:0x0244, B:58:0x026d, B:61:0x0279, B:63:0x02c1, B:65:0x02c9, B:67:0x02d1, B:69:0x02eb, B:71:0x02f1, B:72:0x02f9, B:81:0x034e, B:83:0x0377, B:85:0x0397, B:136:0x045d, B:137:0x0476, B:139:0x047a, B:140:0x04a5, B:142:0x04a9, B:143:0x04b1, B:84:0x0386, B:80:0x033d), top: B:344:0x0006, inners: #0, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0ac4 A[Catch: Exception -> 0x0c9d, TryCatch #2 {Exception -> 0x0c9d, blocks: (B:3:0x0006, B:5:0x000a, B:7:0x0016, B:8:0x001c, B:11:0x004e, B:13:0x0054, B:15:0x0087, B:17:0x0099, B:19:0x00c2, B:20:0x00ca, B:22:0x0112, B:24:0x011a, B:26:0x0122, B:28:0x013c, B:30:0x0142, B:31:0x014a, B:40:0x019f, B:42:0x01df, B:43:0x01f8, B:45:0x01fc, B:46:0x0212, B:48:0x0216, B:49:0x021e, B:50:0x0220, B:39:0x018e, B:51:0x0225, B:52:0x022a, B:146:0x04d5, B:148:0x04eb, B:150:0x0514, B:151:0x051c, B:153:0x056c, B:155:0x0574, B:157:0x057c, B:159:0x0596, B:161:0x059c, B:162:0x05a4, B:171:0x05f9, B:173:0x0620, B:175:0x0640, B:177:0x0654, B:179:0x0660, B:180:0x0662, B:182:0x068e, B:181:0x0669, B:183:0x06a1, B:185:0x06a5, B:186:0x06ce, B:188:0x06d2, B:174:0x062f, B:170:0x05e8, B:145:0x04b8, B:189:0x06dc, B:191:0x06e8, B:193:0x06ee, B:195:0x072f, B:197:0x0743, B:199:0x0770, B:200:0x0778, B:202:0x07c6, B:204:0x07ce, B:206:0x07d6, B:208:0x07f4, B:210:0x07fa, B:211:0x0802, B:213:0x0811, B:214:0x082a, B:216:0x085f, B:217:0x0877, B:219:0x087b, B:220:0x0885, B:222:0x088d, B:224:0x08a1, B:226:0x08ce, B:227:0x08d6, B:229:0x0924, B:231:0x092c, B:233:0x0934, B:235:0x0956, B:236:0x095e, B:290:0x0a43, B:291:0x0a5c, B:293:0x0a91, B:294:0x0ac0, B:296:0x0ac4, B:297:0x0acc, B:298:0x0ad0, B:300:0x0ae6, B:302:0x0b13, B:303:0x0b1b, B:305:0x0b71, B:307:0x0b79, B:309:0x0b81, B:311:0x0b9f, B:313:0x0ba5, B:314:0x0bad, B:316:0x0bbc, B:318:0x0bca, B:319:0x0bcc, B:321:0x0bfa, B:323:0x0c10, B:325:0x0c37, B:327:0x0c59, B:329:0x0c62, B:330:0x0c8f, B:332:0x0c93, B:326:0x0c48, B:320:0x0bd3, B:32:0x0154, B:34:0x015a, B:36:0x0160, B:37:0x017c, B:163:0x05ae, B:165:0x05b4, B:167:0x05ba, B:168:0x05d6, B:54:0x0232, B:56:0x0244, B:58:0x026d, B:61:0x0279, B:63:0x02c1, B:65:0x02c9, B:67:0x02d1, B:69:0x02eb, B:71:0x02f1, B:72:0x02f9, B:81:0x034e, B:83:0x0377, B:85:0x0397, B:136:0x045d, B:137:0x0476, B:139:0x047a, B:140:0x04a5, B:142:0x04a9, B:143:0x04b1, B:84:0x0386, B:80:0x033d), top: B:344:0x0006, inners: #0, #7, #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i4(int r24, java.util.ArrayList r25) {
        /*
            Method dump skipped, instruction units count: 3230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.i4(int, java.util.ArrayList):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:437|85|(1:111)(14:91|(2:92|(2:94|(2:469|96)(1:97))(2:468|99))|100|(4:(3:104|(2:471|106)(1:107)|102)|470|108|109)(2:108|109)|392|(0)(0)|401|(0)|408|(0)|415|(0)|422|423)|439|112|(1:138)(6:116|117|429|118|(14:120|(2:121|(2:123|(2:473|125)(1:474))(2:472|126))|127|(4:(3:131|(2:476|133)(1:477)|129)|475|134|135)(2:134|135)|392|(0)(0)|401|(0)|408|(0)|415|(0)|422|423)|140)|139|140) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:449|258|(1:285)(9:264|(2:265|(2:267|(2:479|269)(1:270))(2:478|273))|445|274|(5:(3:278|(2:481|280)(1:281)|276)|480|282|283|284)(3:282|283|284)|392|(2:394|(2:395|(1:466)(2:397|(2:467|399)(1:400))))(0)|401|(2:408|(2:415|(2:422|423)(2:421|490))(2:414|489))(2:407|488))|462|286|(1:312)(6:290|291|443|292|(14:294|(2:295|(2:297|(2:483|299)(1:484))(2:482|300))|301|(4:(3:305|(2:486|307)(1:487)|303)|485|308|309)(2:308|309)|392|(0)(0)|401|(1:403)|408|(1:410)|415|(1:417)|422|423)|314)|313|314) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0ea6  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0ecf  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0ee6  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0efc  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35, types: [int] */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v64 */
    /* JADX WARN: Type inference failed for: r14v65 */
    /* JADX WARN: Type inference failed for: r14v66 */
    /* JADX WARN: Type inference failed for: r14v67 */
    /* JADX WARN: Type inference failed for: r14v68 */
    /* JADX WARN: Type inference failed for: r14v69 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j4(int r26, java.util.ArrayList r27) {
        /*
            Method dump skipped, instruction units count: 3858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.j4(int, java.util.ArrayList):void");
    }

    private void k4() {
        EditText editText = this.f34609w3;
        if (editText != null) {
            editText.addTextChangedListener(new C1472s());
        }
    }

    private void l4() {
        I1 i12;
        try {
            if (!this.f34503h2.booleanValue() || (i12 = this.f34575r4) == null) {
                return;
            }
            i12.play();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m4(ArrayList arrayList) {
        C2966a c2966aF;
        String strValueOf;
        String str;
        String str2;
        SharedPreferences.Editor editor;
        String strValueOf2;
        if (arrayList == null || arrayList.size() <= 0 || this.f34382N1 >= arrayList.size()) {
            return;
        }
        int iR0 = m7.w.r0(((LiveStreamsDBModel) arrayList.get(this.f34382N1)).getNum());
        this.f34359J2 = iR0;
        this.f34365K2 = ((LiveStreamsDBModel) arrayList.get(this.f34382N1)).getCategoryId();
        int i9 = this.f34382N1;
        this.f34587t2 = i9;
        String name = ((LiveStreamsDBModel) arrayList.get(i9)).getName();
        String streamIdOneStream = ((LiveStreamsDBModel) arrayList.get(this.f34382N1)).getStreamIdOneStream();
        int iQ0 = m7.w.q0(((LiveStreamsDBModel) arrayList.get(this.f34382N1)).getStreamId());
        String epgChannelId = ((LiveStreamsDBModel) arrayList.get(this.f34382N1)).getEpgChannelId();
        String streamIcon = ((LiveStreamsDBModel) arrayList.get(this.f34382N1)).getStreamIcon();
        ((LiveStreamsDBModel) arrayList.get(this.f34382N1)).getNum();
        ((LiveStreamsDBModel) arrayList.get(this.f34382N1)).getStreamIdOneStream();
        this.f34454Z1 = ((LiveStreamsDBModel) arrayList.get(this.f34382N1)).getUrl();
        String strS0 = m7.w.S0(w7.k.a() + w7.k.i());
        this.f34618x5 = ((LiveStreamsDBModel) arrayList.get(this.f34382N1)).getName();
        this.f34597u5 = ((LiveStreamsDBModel) arrayList.get(this.f34382N1)).getCategoryId();
        try {
            if (streamIcon.equals("") || streamIcon.isEmpty()) {
                this.f34563q.setImageDrawable(this.f34486f.getResources().getDrawable(a7.e.f12016i1));
            } else {
                com.squareup.picasso.t.q(this.f34486f).l(streamIcon).j(a7.e.f12016i1).d(a7.e.f12016i1).g(this.f34563q);
            }
        } catch (Exception unused) {
            this.f34563q.setImageDrawable(this.f34486f.getResources().getDrawable(a7.e.f12016i1));
        }
        this.f34464b2.setCurrentWindowIndex(this.f34382N1);
        if (this.f34621y1 != null) {
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("onestream_api")) {
                editor = this.f34621y1;
                strValueOf2 = ((LiveStreamsDBModel) arrayList.get(this.f34382N1)).getStreamIdOneStream();
            } else {
                editor = this.f34621y1;
                strValueOf2 = String.valueOf(((LiveStreamsDBModel) arrayList.get(this.f34382N1)).getStreamId());
            }
            editor.putString("currentlyPlayingVideo", strValueOf2);
            this.f34621y1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((LiveStreamsDBModel) arrayList.get(this.f34382N1)).getUrl()));
            this.f34621y1.apply();
        }
        SharedPreferences.Editor editor2 = this.f34628z1;
        if (editor2 != null) {
            editor2.putInt("currentlyPlayingVideoPosition", this.f34382N1);
            this.f34628z1.apply();
        }
        SimpleDateFormat simpleDateFormat = this.f34459a2;
        if (x3(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(this.f34486f))), this.f34436W1.format(this.f34469c2)) >= C2939c.p() && (str = this.f34551o1) != null && this.f34481e1 != null && (!f34289M5.equals(str) || (this.f34551o1 != null && (str2 = this.f34481e1) != null && !f34290N5.equals(str2)))) {
            this.f34503h2 = Boolean.FALSE;
            this.f34464b2.setVisibility(8);
            this.f34549o.setVisibility(0);
            this.f34556p.setText(strS0 + this.f34521k + this.f34302B1);
        }
        this.f34600v1 = iQ0;
        this.f34593u1 = epgChannelId;
        this.f34312C4 = streamIdOneStream;
        this.f34607w1 = this.f34454Z1;
        if (this.f34448Y1.equals("m3u")) {
            c2966aF = C2966a.f();
            strValueOf = this.f34607w1;
        } else if (this.f34448Y1.equals("onestream_api")) {
            c2966aF = C2966a.f();
            strValueOf = this.f34312C4;
        } else {
            c2966aF = C2966a.f();
            strValueOf = String.valueOf(this.f34600v1);
        }
        c2966aF.A(strValueOf);
        this.f34464b2.setTitle(iR0 + " - " + name);
        this.f34464b2.E();
        if (!f34288L5) {
            if (this.f34464b2.getFullScreenValue().booleanValue()) {
                f34288L5 = this.f34464b2.getFullScreenValue().booleanValue();
            } else {
                f34288L5 = false;
            }
        }
        if (!AbstractC2237a.f44475V0.booleanValue() || !AbstractC2237a.f44498e1.equalsIgnoreCase("1")) {
            Z3(name, epgChannelId, streamIcon);
            return;
        }
        AbstractC2237a.f44487b = true;
        if (SharepreferenceDBHandler.getEventAdsView(this) < AbstractC2237a.f44501f1) {
            Z3(name, epgChannelId, streamIcon);
            SharepreferenceDBHandler.setEventAdsView(SharepreferenceDBHandler.getEventAdsView(this) + 1, this);
        } else {
            SharepreferenceDBHandler.setEventAdsView(0, this);
            a4(name, epgChannelId, streamIcon, null, null, 0, 0L, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n3(int i9) {
        this.f34464b2.f25867v = new RunnableC1474u();
        PlayerView playerView = this.f34464b2;
        playerView.f25865u.postDelayed(playerView.f25867v, i9);
    }

    private void n4() {
        int currentWindowIndex = this.f34464b2.getCurrentWindowIndex();
        if (currentWindowIndex == 0) {
            this.f34464b2.setCurrentWindowIndex(this.f34599v0.size() - 1);
        } else {
            this.f34464b2.setCurrentWindowIndex(currentWindowIndex - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p4(int i9, String str) {
        try {
            List<Integer> favIdsList = StalkerLiveFavIdsSingleton.getInstance().getFavIdsList();
            this.f34491f4 = favIdsList;
            if (favIdsList == null) {
                m7.w.X();
                return;
            }
            favIdsList.remove(Integer.valueOf(i9));
            StringBuilder sb = new StringBuilder();
            for (int i10 = 0; i10 < this.f34491f4.size(); i10++) {
                sb.append(this.f34491f4.get(i10));
                sb.append(",");
            }
            this.f34491f4.add(Integer.valueOf(i9));
            String strSubstring = sb.toString().contains(",") ? sb.substring(0, sb.lastIndexOf(",")) : sb.toString();
            this.f34505h4 = i9;
            this.f34498g4.c(SharepreferenceDBHandler.getLoggedInMacAddress(this.f34486f), SharepreferenceDBHandler.getStalkerToken(this.f34486f), null, strSubstring, "removed", str);
        } catch (Exception unused) {
            m7.w.X();
        }
    }

    private void pause() {
        I1 i12;
        try {
            if (!this.f34503h2.booleanValue() || (i12 = this.f34575r4) == null) {
                return;
            }
            i12.pause();
        } catch (Exception unused) {
        }
    }

    private void s3() {
        AsyncTask asyncTask = this.f34552o2;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            SharepreferenceDBHandler.setAsyncTaskStatus(0, this.f34486f);
        } else {
            SharepreferenceDBHandler.setAsyncTaskStatus(1, this.f34486f);
            this.f34552o2.cancel(true);
        }
    }

    public static boolean t3() {
        ProgressBar progressBar = f34292P5;
        return progressBar != null && progressBar.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u3() {
        EditText editText = this.f34609w3;
        if (editText != null) {
            editText.setText("");
            this.f34609w3.clearFocus();
        }
    }

    private void v1() {
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f34416T = sharedPreferences;
        String liveStreamCategoryName = "";
        this.f34604v5 = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        String str = new SimpleDateFormat("yyyy-MM").format(new Date());
        String strO0 = m7.w.o0(AbstractC2237a.f44469S0 + "*Njh0&$@HAH828283636JSJSHS*" + AbstractC1232b.f17695b + "*" + str);
        if (this.f34597u5.equalsIgnoreCase("")) {
            liveStreamCategoryName = "UnCategories";
        } else {
            LiveStreamCategoryIdDBModel channelCatNameFromSelectedCatId = this.f34404R.getChannelCatNameFromSelectedCatId(this.f34597u5);
            if (channelCatNameFromSelectedCatId != null) {
                liveStreamCategoryName = channelCatNameFromSelectedCatId.getLiveStreamCategoryName();
            }
        }
        Retrofit retrofitE0 = m7.w.E0(this.f34486f);
        if (retrofitE0 != null) {
            RetrofitPost retrofitPost = (RetrofitPost) retrofitE0.create(RetrofitPost.class);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("a", AbstractC2237a.f44469S0);
            jsonObject.addProperty("s", AbstractC2237a.f44471T0);
            jsonObject.addProperty("r", AbstractC1232b.f17695b);
            jsonObject.addProperty("d", str);
            jsonObject.addProperty("sc", strO0);
            jsonObject.addProperty("action", "addreport");
            jsonObject.addProperty(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, this.f34604v5);
            jsonObject.addProperty("macaddress", this.f34611w5);
            jsonObject.addProperty("section", this.f34590t5);
            jsonObject.addProperty("section_category", liveStreamCategoryName);
            jsonObject.addProperty("report_title", this.f34625y5);
            jsonObject.addProperty("report_sub_title", this.f34632z5);
            jsonObject.addProperty("report_cases", this.f34327E5);
            jsonObject.addProperty("report_custom_message", this.f34306B5);
            jsonObject.addProperty("stream_name", this.f34618x5);
            jsonObject.addProperty("stream_id", Integer.valueOf(this.f34600v1));
            retrofitPost.clientsReportRequest(jsonObject).enqueue(new B());
        }
    }

    public static ProgressDialog w3(Context context) {
        try {
            ProgressDialog progressDialog = new ProgressDialog(context);
            try {
                progressDialog.setMessage(context.getResources().getString(a7.j.f13392t5));
                progressDialog.show();
            } catch (Exception unused) {
            }
            progressDialog.setCancelable(false);
            return progressDialog;
        } catch (Exception unused2) {
            return null;
        }
    }

    private void w4() {
        try {
            new DialogC1465l(this).show();
        } catch (Exception unused) {
        }
    }

    public static long x3(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0327 A[PHI: r3 r4
      0x0327: PHI (r3v1 java.util.ArrayList) = 
      (r3v0 java.util.ArrayList)
      (r3v0 java.util.ArrayList)
      (r3v0 java.util.ArrayList)
      (r3v0 java.util.ArrayList)
      (r3v0 java.util.ArrayList)
      (r3v2 java.util.ArrayList)
      (r3v2 java.util.ArrayList)
     binds: [B:3:0x0021, B:17:0x0060, B:19:0x0068, B:21:0x006c, B:23:0x0072, B:67:0x0327, B:68:0x0327] A[DONT_GENERATE, DONT_INLINE]
      0x0327: PHI (r4v1 java.util.ArrayList) = 
      (r4v0 java.util.ArrayList)
      (r4v0 java.util.ArrayList)
      (r4v0 java.util.ArrayList)
      (r4v0 java.util.ArrayList)
      (r4v0 java.util.ArrayList)
      (r4v2 java.util.ArrayList)
      (r4v2 java.util.ArrayList)
     binds: [B:3:0x0021, B:17:0x0060, B:19:0x0068, B:21:0x006c, B:23:0x0072, B:67:0x0327, B:68:0x0327] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.HashMap x4(java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.x4(java.lang.String):java.util.HashMap");
    }

    private HashMap y4(StalkerShortEPGCallback stalkerShortEPGCallback) {
        int i9;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        HashMap map = new HashMap();
        if (this.f34404R != null) {
            arrayList3.add(0, (stalkerShortEPGCallback == null || stalkerShortEPGCallback.getJs() == null || stalkerShortEPGCallback.getJs().size() <= 0) ? "not_installed" : "installed");
            if (stalkerShortEPGCallback != null && stalkerShortEPGCallback.getJs().size() > 0) {
                long jIntValue = stalkerShortEPGCallback.getJs().get(0).getStartTimestamp().intValue();
                long jIntValue2 = stalkerShortEPGCallback.getJs().get(0).getStopTimestamp().intValue();
                long j9 = jIntValue * 1000;
                Long lValueOf = Long.valueOf(j9);
                long j10 = jIntValue2 * 1000;
                Long lValueOf2 = Long.valueOf(j10);
                String name = stalkerShortEPGCallback.getJs().get(0).getName();
                String descr = stalkerShortEPGCallback.getJs().get(0).getDescr();
                int iM = m7.w.M(j9, j10, this.f34486f);
                if (iM != 0) {
                    int i10 = 100 - iM;
                    if (i10 == 0 || name == null || name.equals("")) {
                        i9 = i10;
                    } else {
                        arrayList4.add(0, String.valueOf(i10));
                        StringBuilder sb = new StringBuilder();
                        i9 = i10;
                        sb.append(this.f34486f.getResources().getString(a7.j.f13058L4));
                        sb.append(" ");
                        sb.append(name);
                        arrayList.add(0, sb.toString());
                        arrayList.add(1, this.f34487f0.format(lValueOf) + " - " + this.f34487f0.format(lValueOf2));
                        arrayList.add(2, descr);
                    }
                    iM = i9;
                }
                arrayList2.add(0, this.f34487f0.format(lValueOf) + " - " + this.f34487f0.format(lValueOf2));
                arrayList2.add(1, name);
                arrayList2.add(2, descr);
                if (1 < stalkerShortEPGCallback.getJs().size()) {
                    long jIntValue3 = stalkerShortEPGCallback.getJs().get(1).getStartTimestamp().intValue();
                    long jIntValue4 = stalkerShortEPGCallback.getJs().get(1).getStopTimestamp().intValue();
                    String name2 = stalkerShortEPGCallback.getJs().get(1).getName();
                    String descr2 = stalkerShortEPGCallback.getJs().get(1).getDescr();
                    Long lValueOf3 = Long.valueOf(jIntValue3 * 1000);
                    Long lValueOf4 = Long.valueOf(jIntValue4 * 1000);
                    if (iM != 0 && 100 - iM != 0 && name != null && !name.equals("")) {
                        arrayList.add(3, this.f34486f.getResources().getString(a7.j.f13201a4) + " " + name2);
                        arrayList.add(4, this.f34487f0.format(lValueOf3) + " - " + this.f34487f0.format(lValueOf4));
                        arrayList.add(5, descr2);
                    }
                    arrayList2.add(3, this.f34487f0.format(lValueOf3) + " - " + this.f34487f0.format(lValueOf4));
                    arrayList2.add(4, name2);
                    arrayList2.add(5, descr2);
                }
                if (2 < stalkerShortEPGCallback.getJs().size()) {
                    long jIntValue5 = stalkerShortEPGCallback.getJs().get(2).getStartTimestamp().intValue();
                    long jIntValue6 = stalkerShortEPGCallback.getJs().get(2).getStopTimestamp().intValue();
                    String name3 = stalkerShortEPGCallback.getJs().get(2).getName();
                    String descr3 = stalkerShortEPGCallback.getJs().get(2).getDescr();
                    arrayList2.add(6, this.f34487f0.format(Long.valueOf(jIntValue5 * 1000)) + " - " + this.f34487f0.format(Long.valueOf(jIntValue6 * 1000)));
                    arrayList2.add(7, name3);
                    arrayList2.add(8, descr3);
                }
                if (3 < stalkerShortEPGCallback.getJs().size()) {
                    long jIntValue7 = stalkerShortEPGCallback.getJs().get(3).getStartTimestamp().intValue();
                    long jIntValue8 = stalkerShortEPGCallback.getJs().get(3).getStopTimestamp().intValue();
                    String name4 = stalkerShortEPGCallback.getJs().get(3).getName();
                    String descr4 = stalkerShortEPGCallback.getJs().get(3).getDescr();
                    arrayList2.add(9, this.f34487f0.format(Long.valueOf(jIntValue7 * 1000)) + " - " + this.f34487f0.format(Long.valueOf(jIntValue8 * 1000)));
                    arrayList2.add(10, name4);
                    arrayList2.add(11, descr4);
                }
            }
        }
        map.put("0", arrayList);
        map.put("1", arrayList2);
        map.put("2", arrayList3);
        map.put("3", arrayList4);
        return map;
    }

    public void A3() {
        try {
            c4();
            LinearLayout linearLayout = this.f34544n1;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            LinearLayout linearLayout2 = this.f34558p1;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            LinearLayout linearLayout3 = this.f34565q1;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
            LinearLayout linearLayout4 = this.f34572r1;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(8);
            }
            LinearLayout linearLayout5 = this.f34579s1;
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(8);
            }
            LinearLayout linearLayout6 = this.f34586t1;
            if (linearLayout6 != null) {
                linearLayout6.setVisibility(0);
            }
        } catch (Exception unused) {
        }
    }

    public void A4() {
        if (this.f34413S2.getVisibility() == 8) {
            this.f34413S2.startAnimation(this.f34346H3);
            this.f34413S2.setVisibility(0);
            if (this.f34395P2.getVisibility() == 8) {
                this.f34395P2.startAnimation(this.f34346H3);
                this.f34395P2.setVisibility(0);
            }
            if (this.f34407R2.getVisibility() == 8) {
                this.f34407R2.startAnimation(this.f34346H3);
                this.f34407R2.setVisibility(0);
            }
            if (this.f34401Q2.getVisibility() == 8) {
                this.f34401Q2.startAnimation(this.f34346H3);
                this.f34401Q2.setVisibility(0);
            }
        }
    }

    public void C3() {
        RelativeLayout relativeLayout = this.f34417T0;
        if (relativeLayout != null) {
            relativeLayout.setPadding(0, 0, 0, 0);
        }
        f34288L5 = true;
        F4();
        z4();
        n3(5000);
        String livePlayerAppName = SharepreferenceDBHandler.getLivePlayerAppName(this.f34486f);
        if (!SharepreferenceDBHandler.getLivePlayerPkgName(this.f34486f).equals("default_native") && !new ExternalPlayerDataBase(this.f34486f).CheckPlayerExistense(livePlayerAppName)) {
            SharepreferenceDBHandler.setLivePlayer("default_native", CookieSpecs.DEFAULT, this.f34486f);
        }
        String livePlayerPkgName = SharepreferenceDBHandler.getLivePlayerPkgName(this.f34486f);
        if (livePlayerPkgName == null || livePlayerPkgName.equalsIgnoreCase("default_native")) {
            if (AbstractC2237a.f44480Y.booleanValue()) {
                LinearLayout linearLayout = this.f34560p3;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                findViewById(a7.f.f12491p).setOnClickListener(null);
                this.f34423U0.setVisibility(8);
                this.f34429V0.setVisibility(8);
                this.f34435W0.setVisibility(8);
                getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f34441X0.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                this.f34441X0.setLayoutParams(layoutParams);
                getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
                I1 i12 = this.f34575r4;
                ((i12 == null || !i12.isPlaying()) ? this.f34500h : this.f34507i).requestFocus();
                return;
            }
            return;
        }
        o4();
        this.f34594u2 = true;
        SharedPreferences sharedPreferences = getSharedPreferences("currentlyPlayingVideoPosition", 0);
        this.f34440X = sharedPreferences;
        int i9 = sharedPreferences.getInt("currentlyPlayingVideoPosition", 0);
        ArrayList arrayListG = this.f34390O3.g();
        this.f34382N1 = i9;
        if (arrayListG == null || arrayListG.size() <= 0 || this.f34382N1 >= arrayListG.size()) {
            ArrayList arrayList = this.f34585t0;
            if (arrayList != null && arrayList.size() > 0 && this.f34382N1 < this.f34585t0.size()) {
                this.f34524k2 = m7.w.r0(((LiveStreamsDBModel) this.f34585t0.get(this.f34382N1)).getStreamId());
                this.f34454Z1 = ((LiveStreamsDBModel) this.f34585t0.get(this.f34382N1)).getUrl();
                ((LiveStreamsDBModel) this.f34585t0.get(this.f34382N1)).getName();
            }
        } else {
            this.f34524k2 = m7.w.r0(((LiveStreamsDBModel) arrayListG.get(this.f34382N1)).getStreamId());
            this.f34454Z1 = ((LiveStreamsDBModel) arrayListG.get(this.f34382N1)).getUrl();
        }
        this.f34314D = this.f34524k2;
        this.f34321E = this.f34454Z1;
        f34288L5 = false;
        PlayerView playerView = this.f34464b2;
        if (playerView != null) {
            playerView.u(Boolean.FALSE);
        }
        if (this.f34448Y1.equals("m3u")) {
            if (this.f34503h2.booleanValue()) {
                String livePlayerAppName2 = SharepreferenceDBHandler.getLivePlayerAppName(this.f34486f);
                Intent intent = new Intent(this.f34486f, (Class<?>) PlayExternalPlayerActivity.class);
                intent.putExtra("url", this.f34321E);
                intent.putExtra("packagename", livePlayerPkgName);
                intent.putExtra("app_name", livePlayerAppName2);
                this.f34486f.startActivity(intent);
                return;
            }
            return;
        }
        if (this.f34524k2 == -1 || !this.f34503h2.booleanValue()) {
            return;
        }
        String strV = m7.w.V(this.f34486f, this.f34524k2, this.f34494g0, "live");
        String livePlayerAppName3 = SharepreferenceDBHandler.getLivePlayerAppName(this.f34486f);
        Intent intent2 = new Intent(this.f34486f, (Class<?>) PlayExternalPlayerActivity.class);
        intent2.putExtra("url", strV);
        intent2.putExtra("packagename", livePlayerPkgName);
        intent2.putExtra("app_name", livePlayerAppName3);
        this.f34486f.startActivity(intent2);
    }

    @Override // z7.j
    public void D0(String str) {
    }

    public void E3() {
        ArrayList arrayList;
        LiveStreamsDBModel liveStreamFavouriteRow;
        try {
            if (this.f34448Y1.equals("m3u")) {
                new ArrayList();
                LiveStreamDBHandler liveStreamDBHandler = this.f34404R;
                if (liveStreamDBHandler == null) {
                    return;
                }
                ArrayList<FavouriteM3UModel> favouriteM3U = liveStreamDBHandler.getFavouriteM3U("live");
                arrayList = new ArrayList();
                ArrayList arrayList2 = this.f34627z0;
                if (arrayList2 != null && arrayList2.size() > 0 && favouriteM3U != null && favouriteM3U.size() > 0) {
                    favouriteM3U = M3(favouriteM3U, this.f34627z0);
                }
                if (favouriteM3U == null || favouriteM3U.size() <= 0) {
                    return;
                }
                for (FavouriteM3UModel favouriteM3UModel : favouriteM3U) {
                    ArrayList<LiveStreamsDBModel> m3UFavouriteRow = this.f34404R.getM3UFavouriteRow(favouriteM3UModel.getCategoryID(), favouriteM3UModel.getUrl(), favouriteM3UModel.getTimestamp());
                    if (m3UFavouriteRow != null && m3UFavouriteRow.size() > 0) {
                        arrayList.add(m3UFavouriteRow.get(0));
                    }
                }
            } else {
                if (SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("stalker_api")) {
                    List<Integer> favIdsList = StalkerLiveFavIdsSingleton.getInstance().getFavIdsList();
                    String string = "";
                    if (favIdsList != null && favIdsList.size() > 0) {
                        StringBuilder sb = new StringBuilder();
                        for (Integer num : favIdsList) {
                            if (sb.length() > 0) {
                                sb.append(',');
                            }
                            sb.append("'");
                            sb.append(num);
                            sb.append("'");
                        }
                        string = sb.toString();
                    }
                    this.f34362K.clear();
                    this.f34362K = this.f34404R.getLiveFavStalker(string);
                    return;
                }
                new ArrayList();
                if (this.f34614x1 == null) {
                    return;
                }
                ArrayList<FavouriteDBModel> allFavourites = this.f34444X3.equals("true") ? this.f34614x1.getAllFavourites("radio_streams", SharepreferenceDBHandler.getUserID(this.f34486f)) : this.f34614x1.getAllFavourites("live", SharepreferenceDBHandler.getUserID(this.f34486f));
                arrayList = new ArrayList();
                ArrayList arrayList3 = this.f34627z0;
                if (arrayList3 != null && arrayList3.size() > 0 && allFavourites != null && allFavourites.size() > 0) {
                    allFavourites = L3(allFavourites, this.f34627z0);
                }
                if (allFavourites == null || allFavourites.size() <= 0) {
                    return;
                }
                for (FavouriteDBModel favouriteDBModel : allFavourites) {
                    LiveStreamDBHandler liveStreamDBHandler2 = new LiveStreamDBHandler(this.f34486f);
                    if (SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("onestream_api")) {
                        liveStreamFavouriteRow = liveStreamDBHandler2.getLiveStreamFavouriteRow(favouriteDBModel.getCategoryID(), favouriteDBModel.getStreamIDOneStream(), favouriteDBModel.getTimestamp(), this.f34334F5);
                        if (liveStreamFavouriteRow != null) {
                            arrayList.add(liveStreamFavouriteRow);
                        }
                    } else {
                        liveStreamFavouriteRow = liveStreamDBHandler2.getLiveStreamFavouriteRow(favouriteDBModel.getCategoryID(), String.valueOf(favouriteDBModel.getStreamID()), favouriteDBModel.getTimestamp(), this.f34334F5);
                        if (liveStreamFavouriteRow != null) {
                            arrayList.add(liveStreamFavouriteRow);
                        }
                    }
                }
                if (arrayList.size() == 0) {
                    return;
                }
            }
            this.f34362K = arrayList;
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // z7.g
    public void F(StalkerGetSeriesCategoriesCallback stalkerGetSeriesCategoriesCallback) {
    }

    public String F3() {
        AsyncTask asyncTask;
        try {
            this.f34587t2 = 0;
            ArrayList arrayList = this.f34571r0;
            if (arrayList != null && this.f34557p0 != null) {
                arrayList.clear();
                this.f34557p0.clear();
            }
            ArrayList arrayList2 = this.f34362K;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.f34362K.clear();
            }
            E3();
            ArrayList arrayList3 = this.f34585t0;
            if (arrayList3 != null) {
                arrayList3.clear();
            }
            this.f34571r0 = this.f34362K;
            ArrayList arrayList4 = this.f34578s0;
            if (arrayList4 != null) {
                arrayList4.clear();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone(this.f34331F2.C()));
            String str = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + m7.w.S(this.f34486f)));
            boolean zB = this.f34331F2.B();
            ArrayList<XMLTVProgrammePojo> ePGTesting = zB ? this.f34404R.getEPGTesting(null, str) : null;
            this.f34440X = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("m3u") ? this.f34434W.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", "") : (SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("onestream_api") ? this.f34434W : this.f34434W).getString("currentlyPlayingVideo", "");
            ArrayList arrayList5 = this.f34571r0;
            if (arrayList5 == null || arrayList5.size() <= 0) {
                this.f34585t0 = this.f34571r0;
                return "get_fav";
            }
            for (int i9 = 0; i9 < this.f34571r0.size(); i9++) {
                AsyncTask asyncTask2 = this.f34552o2;
                if (asyncTask2 != null && asyncTask2.isCancelled()) {
                    return "get_fav";
                }
                if (SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("m3u")) {
                    if (((LiveStreamsDBModel) this.f34571r0.get(i9)).getUrl().equals(string)) {
                        this.f34587t2 = i9;
                    }
                } else if (SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("onestream_api")) {
                    if (((LiveStreamsDBModel) this.f34571r0.get(i9)).getStreamIdOneStream().equals(string)) {
                        this.f34587t2 = i9;
                    }
                } else if (((LiveStreamsDBModel) this.f34571r0.get(i9)).getStreamId().equals(string)) {
                    this.f34587t2 = i9;
                }
                LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                liveStreamsDBModel.setNum(((LiveStreamsDBModel) this.f34571r0.get(i9)).getNum());
                liveStreamsDBModel.setName(((LiveStreamsDBModel) this.f34571r0.get(i9)).getName());
                liveStreamsDBModel.setStreamType(((LiveStreamsDBModel) this.f34571r0.get(i9)).getStreamType());
                liveStreamsDBModel.setStreamId(((LiveStreamsDBModel) this.f34571r0.get(i9)).getStreamId());
                liveStreamsDBModel.setStreamIdOneStream(((LiveStreamsDBModel) this.f34571r0.get(i9)).getStreamIdOneStream());
                liveStreamsDBModel.setStreamIcon(((LiveStreamsDBModel) this.f34571r0.get(i9)).getStreamIcon());
                liveStreamsDBModel.setEpgChannelId(((LiveStreamsDBModel) this.f34571r0.get(i9)).getEpgChannelId());
                liveStreamsDBModel.setAdded(((LiveStreamsDBModel) this.f34571r0.get(i9)).getAdded());
                liveStreamsDBModel.setCategoryId(((LiveStreamsDBModel) this.f34571r0.get(i9)).getCategoryId());
                liveStreamsDBModel.setCustomSid(((LiveStreamsDBModel) this.f34571r0.get(i9)).getCustomSid());
                liveStreamsDBModel.setTvArchive(((LiveStreamsDBModel) this.f34571r0.get(i9)).getTvArchive());
                liveStreamsDBModel.setDirectSource(((LiveStreamsDBModel) this.f34571r0.get(i9)).getDirectSource());
                liveStreamsDBModel.setTvArchiveDuration(((LiveStreamsDBModel) this.f34571r0.get(i9)).getTvArchiveDuration());
                liveStreamsDBModel.setTypeName(((LiveStreamsDBModel) this.f34571r0.get(i9)).getTypeName());
                liveStreamsDBModel.setCategoryName(((LiveStreamsDBModel) this.f34571r0.get(i9)).getCategoryName());
                liveStreamsDBModel.setSeriesNo(((LiveStreamsDBModel) this.f34571r0.get(i9)).getSeriesNo());
                liveStreamsDBModel.setLive(((LiveStreamsDBModel) this.f34571r0.get(i9)).getLive());
                liveStreamsDBModel.setContaiinerExtension(((LiveStreamsDBModel) this.f34571r0.get(i9)).getContaiinerExtension());
                liveStreamsDBModel.setUrl(((LiveStreamsDBModel) this.f34571r0.get(i9)).getUrl());
                if (zB && ePGTesting != null && ePGTesting.size() > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < ePGTesting.size() && ((asyncTask = this.f34552o2) == null || !asyncTask.isCancelled())) {
                            if (((LiveStreamsDBModel) this.f34571r0.get(i9)).getEpgChannelId().equals(ePGTesting.get(i10).getChannel())) {
                                int iM = m7.w.M(m7.w.x(ePGTesting.get(i10).getStart(), this.f34486f), m7.w.x(ePGTesting.get(i10).getStop(), this.f34486f), this.f34486f);
                                if (iM != 0) {
                                    iM = 100 - iM;
                                }
                                liveStreamsDBModel.setEpgPercentage(iM);
                                liveStreamsDBModel.setProgramName(ePGTesting.get(i10).getTitle());
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                this.f34578s0.add(liveStreamsDBModel);
                this.f34585t0 = this.f34578s0;
            }
            return "get_fav";
        } catch (Exception e9) {
            e9.printStackTrace();
            return "get_fav";
        }
    }

    public void F4() {
        Handler handler = this.f34464b2.f25865u;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // z7.g
    public void G(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, Z.E e9, int i9) {
    }

    @Override // z7.g
    public void G0(StalkerTokenCallback stalkerTokenCallback) {
    }

    public String G3() {
        DatabaseHandler databaseHandler;
        String str;
        int userID;
        String categoryID;
        String strValueOf;
        String timestamp;
        String str2;
        SharedPreferences sharedPreferences;
        AsyncTask asyncTask;
        AsyncTask asyncTask2;
        String string;
        String str3 = "currentlyPlayingVideo";
        try {
            this.f34414S3 = 0;
            ArrayList arrayList = this.f34585t0;
            if (arrayList != null) {
                arrayList.clear();
            }
            ArrayList<LiveStreamsDBModel> arrayList2 = new ArrayList<>();
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("stalker_api")) {
                List<Integer> favIdsList = StalkerLiveFavIdsSingleton.getInstance().getFavIdsList();
                if (favIdsList == null || favIdsList.size() <= 0) {
                    string = "";
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (Integer num : favIdsList) {
                        if (sb.length() > 0) {
                            sb.append(',');
                        }
                        sb.append("'");
                        sb.append(num);
                        sb.append("'");
                    }
                    string = sb.toString();
                }
                arrayList2.clear();
                arrayList2 = this.f34404R.getLiveFavStalker(string);
            } else {
                ArrayList<FavouriteDBModel> arrayList3 = new ArrayList<>();
                if (this.f34614x1 != null) {
                    if (this.f34444X3.equals("true")) {
                        databaseHandler = this.f34614x1;
                        str = "radio_streams";
                        userID = SharepreferenceDBHandler.getUserID(this.f34486f);
                    } else {
                        databaseHandler = this.f34614x1;
                        str = "live";
                        userID = SharepreferenceDBHandler.getUserID(this.f34486f);
                    }
                    ArrayList<FavouriteDBModel> allFavourites = databaseHandler.getAllFavourites(str, userID);
                    ArrayList arrayList4 = this.f34627z0;
                    if (arrayList4 == null || arrayList4.size() <= 0 || allFavourites == null || allFavourites.size() <= 0) {
                        arrayList3 = allFavourites;
                    } else {
                        try {
                            for (FavouriteDBModel favouriteDBModel : allFavourites) {
                                Iterator it = this.f34627z0.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        arrayList3.add(favouriteDBModel);
                                        break;
                                    }
                                    if (favouriteDBModel.getCategoryID().equals((String) it.next())) {
                                        break;
                                    }
                                }
                            }
                        } catch (Exception e9) {
                            e9.printStackTrace();
                        }
                    }
                    if (arrayList3 != null) {
                        try {
                            if (arrayList3.size() > 0) {
                                for (FavouriteDBModel favouriteDBModel2 : arrayList3) {
                                    LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f34486f);
                                    if (SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("onestream_api")) {
                                        categoryID = favouriteDBModel2.getCategoryID();
                                        strValueOf = String.valueOf(favouriteDBModel2.getStreamIDOneStream());
                                        timestamp = favouriteDBModel2.getTimestamp();
                                        str2 = this.f34334F5;
                                    } else {
                                        categoryID = favouriteDBModel2.getCategoryID();
                                        strValueOf = String.valueOf(favouriteDBModel2.getStreamID());
                                        timestamp = favouriteDBModel2.getTimestamp();
                                        str2 = this.f34334F5;
                                    }
                                    LiveStreamsDBModel liveStreamFavouriteRow = liveStreamDBHandler.getLiveStreamFavouriteRow(categoryID, strValueOf, timestamp, str2);
                                    if (liveStreamFavouriteRow != null) {
                                        arrayList2.add(liveStreamFavouriteRow);
                                    }
                                }
                            }
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                }
            }
            if (arrayList2.size() != 0) {
                this.f34585t0 = arrayList2;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone(this.f34331F2.C()));
            String str4 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + m7.w.S(this.f34486f)));
            boolean zB = this.f34331F2.B();
            ArrayList<XMLTVProgrammePojo> ePGTesting = zB ? this.f34404R.getEPGTesting(null, str4) : null;
            this.f34440X = getSharedPreferences("currentlyPlayingVideo", 0);
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("m3u")) {
                sharedPreferences = this.f34434W;
                str3 = "LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U";
            } else {
                sharedPreferences = SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("onestream_api") ? this.f34434W : this.f34434W;
            }
            String string2 = sharedPreferences.getString(str3, "");
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = this.f34585t0;
            if (arrayList6 != null && arrayList6.size() > 0) {
                for (int i9 = 0; i9 < this.f34585t0.size() && ((asyncTask = this.f34552o2) == null || !asyncTask.isCancelled()); i9++) {
                    if (SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("m3u")) {
                        if (((LiveStreamsDBModel) this.f34585t0.get(i9)).getUrl().equals(string2)) {
                            this.f34414S3 = i9;
                        }
                    } else if (SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("onestream_api")) {
                        if (((LiveStreamsDBModel) this.f34585t0.get(i9)).getStreamIdOneStream().equals(string2)) {
                            this.f34414S3 = i9;
                        }
                    } else if (((LiveStreamsDBModel) this.f34585t0.get(i9)).getStreamId().equals(string2)) {
                        this.f34414S3 = i9;
                    }
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    liveStreamsDBModel.setNum(((LiveStreamsDBModel) this.f34585t0.get(i9)).getNum());
                    liveStreamsDBModel.setName(((LiveStreamsDBModel) this.f34585t0.get(i9)).getName());
                    liveStreamsDBModel.setStreamType(((LiveStreamsDBModel) this.f34585t0.get(i9)).getStreamType());
                    liveStreamsDBModel.setStreamId(((LiveStreamsDBModel) this.f34585t0.get(i9)).getStreamId());
                    liveStreamsDBModel.setStreamIdOneStream(((LiveStreamsDBModel) this.f34585t0.get(i9)).getStreamIdOneStream());
                    liveStreamsDBModel.setStreamIcon(((LiveStreamsDBModel) this.f34585t0.get(i9)).getStreamIcon());
                    liveStreamsDBModel.setEpgChannelId(((LiveStreamsDBModel) this.f34585t0.get(i9)).getEpgChannelId());
                    liveStreamsDBModel.setAdded(((LiveStreamsDBModel) this.f34585t0.get(i9)).getAdded());
                    liveStreamsDBModel.setCategoryId(((LiveStreamsDBModel) this.f34585t0.get(i9)).getCategoryId());
                    liveStreamsDBModel.setCustomSid(((LiveStreamsDBModel) this.f34585t0.get(i9)).getCustomSid());
                    liveStreamsDBModel.setTvArchive(((LiveStreamsDBModel) this.f34585t0.get(i9)).getTvArchive());
                    liveStreamsDBModel.setDirectSource(((LiveStreamsDBModel) this.f34585t0.get(i9)).getDirectSource());
                    liveStreamsDBModel.setTvArchiveDuration(((LiveStreamsDBModel) this.f34585t0.get(i9)).getTvArchiveDuration());
                    liveStreamsDBModel.setTypeName(((LiveStreamsDBModel) this.f34585t0.get(i9)).getTypeName());
                    liveStreamsDBModel.setCategoryName(((LiveStreamsDBModel) this.f34585t0.get(i9)).getCategoryName());
                    liveStreamsDBModel.setSeriesNo(((LiveStreamsDBModel) this.f34585t0.get(i9)).getSeriesNo());
                    liveStreamsDBModel.setLive(((LiveStreamsDBModel) this.f34585t0.get(i9)).getLive());
                    liveStreamsDBModel.setContaiinerExtension(((LiveStreamsDBModel) this.f34585t0.get(i9)).getContaiinerExtension());
                    liveStreamsDBModel.setUrl(((LiveStreamsDBModel) this.f34585t0.get(i9)).getUrl());
                    if (zB && ePGTesting != null && ePGTesting.size() > 0) {
                        int i10 = 0;
                        while (true) {
                            if (i10 < ePGTesting.size() && ((asyncTask2 = this.f34552o2) == null || !asyncTask2.isCancelled())) {
                                if (((LiveStreamsDBModel) this.f34585t0.get(i9)).getEpgChannelId().equals(ePGTesting.get(i10).getChannel())) {
                                    int iM = m7.w.M(m7.w.x(ePGTesting.get(i10).getStart(), this.f34486f), m7.w.x(ePGTesting.get(i10).getStop(), this.f34486f), this.f34486f);
                                    if (iM != 0) {
                                        iM = 100 - iM;
                                    }
                                    liveStreamsDBModel.setEpgPercentage(iM);
                                    liveStreamsDBModel.setProgramName(ePGTesting.get(i10).getTitle());
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                    arrayList5.add(liveStreamsDBModel);
                }
            }
            ArrayList arrayList7 = this.f34585t0;
            if (arrayList7 == null) {
                return "get_fav";
            }
            arrayList7.clear();
            this.f34585t0.addAll(arrayList5);
            return "get_fav";
        } catch (Exception e11) {
            e11.printStackTrace();
            return "get_fav";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int G4() {
        /*
            r6 = this;
            int r0 = r6.f34601v2
            r1 = 1
            int r0 = r0 + r1
            r6.f34601v2 = r0
            java.lang.String r0 = "loginPrefs"
            r2 = 0
            android.content.SharedPreferences r0 = r6.getSharedPreferences(r0, r2)
            r6.f34615x2 = r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r6.f34622y2 = r0
            int r0 = r6.f34601v2
            int[] r3 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.f34291O5
            int r4 = r3.length
            int r0 = r0 % r4
            r6.f34601v2 = r0
            r0 = r3[r0]
            r6.f34608w2 = r0
            int r0 = a7.f.f12319X6
            android.view.View r0 = r6.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            int r3 = a7.f.f12471n
            android.view.View r3 = r6.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.google.android.exoplayer2.ui.PlayerView r4 = r6.f34464b2
            int r5 = r6.f34608w2
            r4.setResizeMode(r5)
            int r4 = r6.f34601v2
            if (r4 != 0) goto L4a
            android.content.res.Resources r1 = r6.getResources()
            int r4 = a7.j.f13289j2
        L42:
            java.lang.String r1 = r1.getString(r4)
        L46:
            r3.setText(r1)
            goto L73
        L4a:
            if (r4 != r1) goto L53
            android.content.res.Resources r1 = r6.getResources()
            int r4 = a7.j.f13279i2
            goto L42
        L53:
            r1 = 2
            if (r4 != r1) goto L5d
            android.content.res.Resources r1 = r6.getResources()
            int r4 = a7.j.f13112Q8
            goto L42
        L5d:
            r1 = 3
            if (r4 != r1) goto L67
            android.content.res.Resources r1 = r6.getResources()
            int r4 = a7.j.f13290j3
            goto L42
        L67:
            r1 = 4
            if (r4 != r1) goto L6d
            java.lang.String r1 = "16:9"
            goto L46
        L6d:
            r1 = 5
            if (r4 != r1) goto L73
            java.lang.String r1 = "4:3"
            goto L46
        L73:
            android.content.SharedPreferences$Editor r1 = r6.f34622y2
            java.lang.String r3 = "aspect_ratio"
            int r4 = r6.f34601v2
            r1.putInt(r3, r4)
            android.content.SharedPreferences$Editor r1 = r6.f34622y2
            r1.apply()
            r0.setVisibility(r2)
            android.widget.LinearLayout r1 = r6.f34407R2
            if (r1 == 0) goto L95
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L95
            android.widget.LinearLayout r1 = r6.f34407R2
            r2 = 8
            r1.setVisibility(r2)
        L95:
            android.os.Handler r1 = r6.f34338G2
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            android.os.Handler r1 = r6.f34338G2
            com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$A r2 = new com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$A
            r2.<init>(r0)
            r3 = 3000(0xbb8, double:1.482E-320)
            r1.postDelayed(r2, r3)
            int r0 = r6.f34608w2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.G4():int");
    }

    @Override // z7.g
    public void H(String str) {
        if (this.f34438W3.equals("false")) {
            s4();
            return;
        }
        String str2 = this.f34447Y0;
        this.f34365K2 = str2;
        q7.N n9 = new q7.N(this.f34486f, str2, "", this.f34444X3, this.f34438W3);
        this.f34378M3 = n9;
        this.f34371L2 = this.f34365K2;
        this.f34595u3.setAdapter(n9);
        this.f34595u3.setLayoutManager(this.f34402Q3);
        j3(true);
    }

    public void H3() {
        if (this.f34527k5.getVisibility() == 0) {
            this.f34548n5.setNextFocusRightId(a7.f.f12190K3);
            this.f34555o5.setNextFocusRightId(a7.f.f12383e2);
            this.f34562p5.setNextFocusRightId(a7.f.f12342a2);
            this.f34569q5.setNextFocusRightId(a7.f.f12296V1);
        }
    }

    @Override // z7.g
    public void I(m0.x xVar, int i9) {
    }

    public int I3(ArrayList arrayList, int i9) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (m7.w.r0(((LiveStreamsDBModel) arrayList.get(i10)).getNum()) == i9) {
                    return i10;
                }
            } catch (Exception unused) {
                return 0;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x000f, B:10:0x002f, B:12:0x0033), top: B:19:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void I4(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L2f
            java.lang.String r1 = ""
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Exception -> L2d
            if (r1 != 0) goto L2f
            android.widget.ImageView r1 = r3.f34563q     // Catch: java.lang.Exception -> L2d
            if (r1 == 0) goto L56
            android.content.Context r1 = r3.f34486f     // Catch: java.lang.Exception -> L2d
            com.squareup.picasso.t r1 = com.squareup.picasso.t.q(r1)     // Catch: java.lang.Exception -> L2d
            com.squareup.picasso.x r4 = r1.l(r4)     // Catch: java.lang.Exception -> L2d
            r1 = 80
            r2 = 55
            com.squareup.picasso.x r4 = r4.k(r1, r2)     // Catch: java.lang.Exception -> L2d
            int r1 = a7.e.f12016i1     // Catch: java.lang.Exception -> L2d
            com.squareup.picasso.x r4 = r4.j(r1)     // Catch: java.lang.Exception -> L2d
            android.widget.ImageView r1 = r3.f34563q     // Catch: java.lang.Exception -> L2d
            r4.g(r1)     // Catch: java.lang.Exception -> L2d
            goto L56
        L2d:
            goto L43
        L2f:
            android.widget.ImageView r4 = r3.f34563q     // Catch: java.lang.Exception -> L2d
            if (r4 == 0) goto L56
            android.content.Context r1 = r3.f34486f     // Catch: java.lang.Exception -> L2d
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Exception -> L2d
            int r2 = a7.e.f12016i1     // Catch: java.lang.Exception -> L2d
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2, r0)     // Catch: java.lang.Exception -> L2d
            r4.setImageDrawable(r1)     // Catch: java.lang.Exception -> L2d
            goto L56
        L43:
            android.widget.ImageView r4 = r3.f34563q
            if (r4 == 0) goto L56
            android.content.Context r1 = r3.f34486f
            android.content.res.Resources r1 = r1.getResources()
            int r2 = a7.e.f12016i1
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r2, r0)
            r4.setImageDrawable(r0)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.I4(java.lang.String):void");
    }

    public void J4(String str) {
        A3();
        String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f34486f);
        String loggedInMacAddress = SharepreferenceDBHandler.getLoggedInMacAddress(this.f34486f);
        try {
            if (this.f34461a4 == null) {
                this.f34461a4 = new n7.g(this, this.f34486f);
            }
            this.f34461a4.e(loggedInMacAddress, stalkerToken, str);
        } catch (Exception unused) {
        }
    }

    @Override // z7.g
    public void M(StalkerGetAdCallback stalkerGetAdCallback, int i9) {
        try {
            StalkerLiveFavIdsSingleton.getInstance().setFavIdsList(null);
            this.f34498g4.i(this.f34554o4, this.f34561p4);
        } catch (Exception unused) {
        }
    }

    @Override // z7.j
    public void M0(String str) {
        try {
            m7.w.X();
        } catch (Exception unused) {
        }
    }

    @Override // z7.g
    public void O(Z.E e9, int i9) {
    }

    @Override // z7.j
    public void P(String str) {
        try {
            this.f34586t1.setVisibility(8);
            N3();
        } catch (Exception unused) {
        }
    }

    @Override // z7.g
    public void P0(String str) {
        try {
            m7.w.X();
        } catch (Exception unused) {
        }
    }

    public void P3() {
        if (this.f34413S2.getVisibility() == 0) {
            this.f34413S2.startAnimation(this.f34353I3);
            if (this.f34395P2.getVisibility() == 0) {
                this.f34395P2.startAnimation(this.f34353I3);
            }
            if (this.f34407R2.getVisibility() == 0) {
                this.f34407R2.startAnimation(this.f34353I3);
            }
            if (this.f34401Q2.getVisibility() == 0) {
                this.f34401Q2.startAnimation(this.f34353I3);
            }
            this.f34413S2.setVisibility(8);
            if (this.f34395P2.getVisibility() == 0) {
                this.f34395P2.setVisibility(8);
            }
            if (this.f34407R2.getVisibility() == 0) {
                this.f34407R2.setVisibility(8);
            }
            if (this.f34401Q2.getVisibility() == 0) {
                this.f34401Q2.setVisibility(8);
            }
            this.f34581s3.setVisibility(8);
            this.f34567q3.setVisibility(8);
            this.f34520j5.setVisibility(4);
            this.f34574r3.setVisibility(8);
        }
    }

    public void R3() {
        LinearLayout linearLayout = this.f34616x3;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f34623y3;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    public void S3() {
        try {
            ProgressDialog progressDialog = this.f34573r2;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            this.f34573r2.dismiss();
        } catch (Exception unused) {
        }
    }

    @Override // z7.j
    public void T0(StalkerDeletePlayerLinkCallback stalkerDeletePlayerLinkCallback) {
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean T3() {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.T3():boolean");
    }

    @Override // z7.g
    public void U(StalkerLiveFavIdsCallback stalkerLiveFavIdsCallback) {
        if (stalkerLiveFavIdsCallback != null && stalkerLiveFavIdsCallback.getJs() != null && stalkerLiveFavIdsCallback.getJs().size() > 0) {
            StalkerLiveFavIdsSingleton.getInstance().setFavIdsList(stalkerLiveFavIdsCallback.getJs());
        }
        this.f34491f4 = StalkerLiveFavIdsSingleton.getInstance().getFavIdsList();
        if (this.f34438W3.equals("false")) {
            s4();
            return;
        }
        String str = this.f34447Y0;
        this.f34365K2 = str;
        q7.N n9 = new q7.N(this.f34486f, str, "", this.f34444X3, this.f34438W3);
        this.f34378M3 = n9;
        this.f34371L2 = this.f34365K2;
        this.f34595u3.setAdapter(n9);
        this.f34595u3.setLayoutManager(this.f34402Q3);
        j3(true);
    }

    @Override // z7.g
    public void V(StalkerProfilesCallback stalkerProfilesCallback) {
    }

    @Override // z7.g
    public void V0(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, m0.x xVar, int i9) {
    }

    public boolean W3() {
        if (Build.VERSION.SDK_INT < 23) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        Log.v("TAG", "Permission is revoked");
        AbstractC0519b.h(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 101);
        return false;
    }

    @Override // z7.j
    public void X(StalkerShortEPGCallback stalkerShortEPGCallback) {
        if (stalkerShortEPGCallback == null || stalkerShortEPGCallback.getJs() == null || stalkerShortEPGCallback.getJs().size() <= 0) {
            try {
                this.f34586t1.setVisibility(8);
                N3();
            } catch (Exception unused) {
            }
        } else {
            HashMap map = new HashMap();
            try {
                map = y4(stalkerShortEPGCallback);
            } catch (Exception unused2) {
            }
            z3(map);
        }
    }

    public void b4(String str) {
        this.f34371L2 = str;
        try {
            SearchView searchView = this.f34357J0;
            if (searchView != null && this.f34430V1 != null) {
                searchView.d0("", false);
                this.f34430V1.collapseActionView();
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        try {
            if (this.f34424U1 != null) {
                if (this.f34371L2.equals("-6")) {
                    this.f34424U1.getItem(2).getSubMenu().findItem(a7.f.Db).setVisible(true);
                } else {
                    this.f34424U1.getItem(2).getSubMenu().findItem(a7.f.Db).setVisible(false);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        j3(true);
    }

    @Override // z7.g
    public void c(String str) {
    }

    @Override // z7.g
    public void d0(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, C2635t.o oVar, String str, String str2) {
        Context context;
        StringBuilder sb;
        try {
            m7.w.X();
            if (this.f34349I == null || this.f34390O3 == null || stalkerSetLiveFavCallback == null || stalkerSetLiveFavCallback.getJs() == null || !stalkerSetLiveFavCallback.getJs().equals(Boolean.TRUE)) {
                return;
            }
            this.f34491f4 = StalkerLiveFavIdsSingleton.getInstance().getFavIdsList();
            if (str.equals("added")) {
                int i9 = this.f34505h4;
                if (i9 != 0) {
                    this.f34491f4.add(Integer.valueOf(i9));
                }
                StalkerLiveFavIdsSingleton.getInstance().setFavIdsList(this.f34491f4);
                try {
                    ListView listView = this.f34349I;
                    View childAt = listView.getChildAt(this.f34568q4 - listView.getFirstVisiblePosition());
                    if (childAt != null) {
                        try {
                            ((ImageView) childAt.findViewById(a7.f.f12406g5)).setVisibility(0);
                        } catch (Exception e9) {
                            e9.printStackTrace();
                        }
                    }
                    this.f34378M3.x(1);
                } catch (Exception unused) {
                }
                context = this.f34486f;
                sb = new StringBuilder();
                sb.append(str2);
                sb.append(this.f34486f.getResources().getString(a7.j.f13356q));
            } else {
                int i10 = this.f34505h4;
                if (i10 != 0) {
                    this.f34491f4.remove(Integer.valueOf(i10));
                    StalkerLiveFavIdsSingleton.getInstance().setFavIdsList(this.f34491f4);
                }
                try {
                    ListView listView2 = this.f34349I;
                    View childAt2 = listView2.getChildAt(this.f34568q4 - listView2.getFirstVisiblePosition());
                    if (childAt2 != null) {
                        try {
                            ((ImageView) childAt2.findViewById(a7.f.f12406g5)).setVisibility(4);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                    this.f34378M3.x(1);
                } catch (Exception unused2) {
                }
                context = this.f34486f;
                sb = new StringBuilder();
                sb.append(str2);
                sb.append(this.f34486f.getResources().getString(a7.j.f13223c6));
            }
            m7.w.P0(context, sb.toString());
        } catch (Exception unused3) {
        }
    }

    public final void d3(String str, int i9, String str2, String str3, String str4, int i10, String str5) {
        new S(str, i9, str2, str3, str4, i10, str5).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
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

    @Override // z7.g
    public void e(String str) {
    }

    @Override // z7.g
    public void e0(String str) {
    }

    public final void e3(String str, String str2, String str3, int i9) {
        new T(str, str2, str3, i9).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    public void e4() {
        LinearLayout linearLayout = this.f34616x3;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        if (this.f34616x3 != null) {
            this.f34623y3.setVisibility(0);
        }
    }

    @Override // z7.g
    public void f0(StalkerGetGenresCallback stalkerGetGenresCallback) {
    }

    public void f4() {
        AbstractC2237a.f44480Y = Boolean.TRUE;
        this.f34307C = true;
        this.f34549o.setVisibility(0);
        this.f34556p.setText(this.f34486f.getResources().getString(a7.j.f13261g4));
        this.f34586t1.setVisibility(8);
        if (AbstractC2237a.f44434B.booleanValue()) {
            findViewById(a7.f.Sm).setVisibility(8);
        }
    }

    public void g3() {
        s3();
        this.f34552o2 = new M().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels");
    }

    public void g4(int i9) {
        try {
            q7.N n9 = this.f34378M3;
            if (n9 != null) {
                n9.x(i9);
            }
        } catch (Exception unused) {
        }
    }

    public void h3() {
        s3();
        this.f34552o2 = new M().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels_with_cat");
    }

    @Override // z7.g
    public void i(StalkerGetAllChannelsCallback stalkerGetAllChannelsCallback) {
    }

    public String i3() {
        LiveStreamDBHandler liveStreamDBHandler;
        String str;
        String str2;
        String string;
        AsyncTask asyncTask;
        try {
            this.f34587t2 = 0;
            ArrayList arrayList = this.f34571r0;
            if (arrayList != null && this.f34557p0 != null) {
                arrayList.clear();
                this.f34557p0.clear();
            }
            if (this.f34444X3.equals("true")) {
                liveStreamDBHandler = this.f34404R;
                str = this.f34447Y0;
                str2 = "radio_streams";
            } else {
                liveStreamDBHandler = this.f34404R;
                str = this.f34447Y0;
                str2 = "live";
            }
            this.f34606w0 = liveStreamDBHandler.getAllLiveStreasWithCategoryId(str, str2);
            this.f34571r0 = this.f34606w0;
            ArrayList arrayList2 = this.f34578s0;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone(this.f34331F2.C()));
            String str3 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + m7.w.S(this.f34486f)));
            boolean zB = this.f34331F2.B();
            ArrayList<XMLTVProgrammePojo> ePGTesting = zB ? this.f34404R.getEPGTesting(null, str3) : null;
            this.f34440X = getSharedPreferences("currentlyPlayingVideo", 0);
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("m3u")) {
                string = this.f34434W.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", "");
            } else {
                SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("onestream_api");
                string = this.f34434W.getString("currentlyPlayingVideo", "");
            }
            ArrayList arrayList3 = this.f34571r0;
            if (arrayList3 == null || arrayList3.size() <= 0) {
                return "all_channels_with_cat";
            }
            for (int i9 = 0; i9 < this.f34571r0.size(); i9++) {
                AsyncTask asyncTask2 = this.f34552o2;
                if (asyncTask2 != null && asyncTask2.isCancelled()) {
                    return "all_channels_with_cat";
                }
                if (SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("m3u") && ((LiveStreamsDBModel) this.f34571r0.get(i9)).getUrl().equals(string)) {
                    this.f34587t2 = i9;
                }
                if (SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("onestream_api")) {
                    if (((LiveStreamsDBModel) this.f34571r0.get(i9)).getStreamIdOneStream().equals(string)) {
                        this.f34587t2 = i9;
                    }
                } else if (((LiveStreamsDBModel) this.f34571r0.get(i9)).getStreamId().equals(string)) {
                    this.f34587t2 = i9;
                }
                LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                liveStreamsDBModel.setNum(((LiveStreamsDBModel) this.f34571r0.get(i9)).getNum());
                liveStreamsDBModel.setName(((LiveStreamsDBModel) this.f34571r0.get(i9)).getName());
                liveStreamsDBModel.setStreamType(((LiveStreamsDBModel) this.f34571r0.get(i9)).getStreamType());
                liveStreamsDBModel.setStreamId(((LiveStreamsDBModel) this.f34571r0.get(i9)).getStreamId());
                liveStreamsDBModel.setStreamIcon(((LiveStreamsDBModel) this.f34571r0.get(i9)).getStreamIcon());
                liveStreamsDBModel.setEpgChannelId(((LiveStreamsDBModel) this.f34571r0.get(i9)).getEpgChannelId());
                liveStreamsDBModel.setAdded(((LiveStreamsDBModel) this.f34571r0.get(i9)).getAdded());
                liveStreamsDBModel.setCategoryId(((LiveStreamsDBModel) this.f34571r0.get(i9)).getCategoryId());
                liveStreamsDBModel.setCustomSid(((LiveStreamsDBModel) this.f34571r0.get(i9)).getCustomSid());
                liveStreamsDBModel.setTvArchive(((LiveStreamsDBModel) this.f34571r0.get(i9)).getTvArchive());
                liveStreamsDBModel.setDirectSource(((LiveStreamsDBModel) this.f34571r0.get(i9)).getDirectSource());
                liveStreamsDBModel.setTvArchiveDuration(((LiveStreamsDBModel) this.f34571r0.get(i9)).getTvArchiveDuration());
                liveStreamsDBModel.setTypeName(((LiveStreamsDBModel) this.f34571r0.get(i9)).getTypeName());
                liveStreamsDBModel.setCategoryName(((LiveStreamsDBModel) this.f34571r0.get(i9)).getCategoryName());
                liveStreamsDBModel.setSeriesNo(((LiveStreamsDBModel) this.f34571r0.get(i9)).getSeriesNo());
                liveStreamsDBModel.setLive(((LiveStreamsDBModel) this.f34571r0.get(i9)).getLive());
                liveStreamsDBModel.setContaiinerExtension(((LiveStreamsDBModel) this.f34571r0.get(i9)).getContaiinerExtension());
                liveStreamsDBModel.setUrl(((LiveStreamsDBModel) this.f34571r0.get(i9)).getUrl());
                liveStreamsDBModel.setCmd(((LiveStreamsDBModel) this.f34571r0.get(i9)).getCmd());
                if (zB && ePGTesting != null && ePGTesting.size() > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= ePGTesting.size() || ((asyncTask = this.f34552o2) != null && asyncTask.isCancelled())) {
                            break;
                        }
                        if (((LiveStreamsDBModel) this.f34571r0.get(i9)).getEpgChannelId().equals(ePGTesting.get(i10).getChannel())) {
                            int iM = m7.w.M(m7.w.x(ePGTesting.get(i10).getStart(), this.f34486f), m7.w.x(ePGTesting.get(i10).getStop(), this.f34486f), this.f34486f);
                            if (iM != 0) {
                                iM = 100 - iM;
                            }
                            liveStreamsDBModel.setEpgPercentage(iM);
                            liveStreamsDBModel.setProgramName(ePGTesting.get(i10).getTitle());
                        } else {
                            i10++;
                        }
                    }
                }
                this.f34578s0.add(liveStreamsDBModel);
            }
            return "all_channels_with_cat";
        } catch (Exception unused) {
            return "all_channels_with_cat";
        }
    }

    @Override // z7.g
    public void j(StalkerGetVodCategoriesCallback stalkerGetVodCategoriesCallback) {
    }

    public void j3(boolean z9) {
        ProgressDialog progressDialogW3;
        s3();
        if (z9) {
            ProgressDialog progressDialog = this.f34573r2;
            if (progressDialog == null) {
                progressDialogW3 = w3(this.f34486f);
                this.f34573r2 = progressDialogW3;
                if (progressDialogW3 != null) {
                    progressDialogW3.show();
                }
            } else if (!progressDialog.isShowing()) {
                progressDialogW3 = this.f34573r2;
                progressDialogW3.show();
            }
        }
        this.f34552o2 = new N().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels_with_cat");
    }

    public void k3() {
        s3();
        this.f34552o2 = new M().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_fav");
    }

    public void l3() {
        s3();
        this.f34552o2 = new M().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "recently_watched");
    }

    public String m3() {
        LiveStreamDBHandler liveStreamDBHandler;
        String str;
        String string;
        AsyncTask asyncTask;
        AsyncTask asyncTask2;
        try {
            this.f34414S3 = 0;
            ArrayList arrayList = this.f34585t0;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (this.f34444X3.equalsIgnoreCase("true")) {
                liveStreamDBHandler = this.f34404R;
                str = "radio_streams";
            } else {
                liveStreamDBHandler = this.f34404R;
                str = "live";
            }
            this.f34585t0 = liveStreamDBHandler.getAllRecentlyWatchedLiveStreams(str);
            ArrayList arrayList2 = this.f34592u0;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone(this.f34331F2.C()));
            String str2 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + m7.w.S(this.f34486f)));
            boolean zB = this.f34331F2.B();
            ArrayList<XMLTVProgrammePojo> ePGTesting = zB ? this.f34404R.getEPGTesting(null, str2) : null;
            this.f34440X = getSharedPreferences("currentlyPlayingVideo", 0);
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("m3u")) {
                string = this.f34434W.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", "");
            } else {
                SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("onestream_api");
                string = this.f34434W.getString("currentlyPlayingVideo", "");
            }
            ArrayList arrayList3 = this.f34585t0;
            if (arrayList3 != null && arrayList3.size() > 0) {
                for (int i9 = 0; i9 < this.f34585t0.size() && ((asyncTask = this.f34552o2) == null || !asyncTask.isCancelled()); i9++) {
                    if (SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("m3u")) {
                        if (((LiveStreamsDBModel) this.f34585t0.get(i9)).getUrl().equals(string)) {
                            this.f34414S3 = i9;
                            this.f34382N1 = i9;
                        }
                    } else if (SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("onestream_api")) {
                        if (((LiveStreamsDBModel) this.f34571r0.get(i9)).getStreamIdOneStream().equals(string)) {
                            this.f34587t2 = i9;
                        }
                    } else if (((LiveStreamsDBModel) this.f34585t0.get(i9)).getStreamId().equals(string)) {
                        this.f34414S3 = i9;
                        this.f34382N1 = i9;
                    }
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    liveStreamsDBModel.setNum(((LiveStreamsDBModel) this.f34585t0.get(i9)).getNum());
                    liveStreamsDBModel.setName(((LiveStreamsDBModel) this.f34585t0.get(i9)).getName());
                    liveStreamsDBModel.setStreamType(((LiveStreamsDBModel) this.f34585t0.get(i9)).getStreamType());
                    liveStreamsDBModel.setStreamId(((LiveStreamsDBModel) this.f34585t0.get(i9)).getStreamId());
                    liveStreamsDBModel.setStreamIcon(((LiveStreamsDBModel) this.f34585t0.get(i9)).getStreamIcon());
                    liveStreamsDBModel.setEpgChannelId(((LiveStreamsDBModel) this.f34585t0.get(i9)).getEpgChannelId());
                    liveStreamsDBModel.setAdded(((LiveStreamsDBModel) this.f34585t0.get(i9)).getAdded());
                    liveStreamsDBModel.setCategoryId(((LiveStreamsDBModel) this.f34585t0.get(i9)).getCategoryId());
                    liveStreamsDBModel.setCustomSid(((LiveStreamsDBModel) this.f34585t0.get(i9)).getCustomSid());
                    liveStreamsDBModel.setTvArchive(((LiveStreamsDBModel) this.f34585t0.get(i9)).getTvArchive());
                    liveStreamsDBModel.setDirectSource(((LiveStreamsDBModel) this.f34585t0.get(i9)).getDirectSource());
                    liveStreamsDBModel.setTvArchiveDuration(((LiveStreamsDBModel) this.f34585t0.get(i9)).getTvArchiveDuration());
                    liveStreamsDBModel.setTypeName(((LiveStreamsDBModel) this.f34585t0.get(i9)).getTypeName());
                    liveStreamsDBModel.setCategoryName(((LiveStreamsDBModel) this.f34585t0.get(i9)).getCategoryName());
                    liveStreamsDBModel.setSeriesNo(((LiveStreamsDBModel) this.f34585t0.get(i9)).getSeriesNo());
                    liveStreamsDBModel.setLive(((LiveStreamsDBModel) this.f34585t0.get(i9)).getLive());
                    liveStreamsDBModel.setContaiinerExtension(((LiveStreamsDBModel) this.f34585t0.get(i9)).getContaiinerExtension());
                    liveStreamsDBModel.setUrl(((LiveStreamsDBModel) this.f34585t0.get(i9)).getUrl());
                    liveStreamsDBModel.setCmd(((LiveStreamsDBModel) this.f34585t0.get(i9)).getCmd());
                    if (zB && ePGTesting != null && ePGTesting.size() > 0) {
                        int i10 = 0;
                        while (true) {
                            if (i10 < ePGTesting.size() && ((asyncTask2 = this.f34552o2) == null || !asyncTask2.isCancelled())) {
                                if (((LiveStreamsDBModel) this.f34585t0.get(i9)).getEpgChannelId().equals(ePGTesting.get(i10).getChannel())) {
                                    int iM = m7.w.M(m7.w.x(ePGTesting.get(i10).getStart(), this.f34486f), m7.w.x(ePGTesting.get(i10).getStop(), this.f34486f), this.f34486f);
                                    if (iM != 0) {
                                        iM = 100 - iM;
                                    }
                                    liveStreamsDBModel.setEpgPercentage(iM);
                                    liveStreamsDBModel.setProgramName(ePGTesting.get(i10).getTitle());
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                    this.f34592u0.add(liveStreamsDBModel);
                }
            }
            this.f34585t0 = this.f34592u0;
            return "all_channels_with_cat";
        } catch (Exception unused) {
            return "all_channels_with_cat";
        }
    }

    @Override // z7.g
    public void o0(String str) {
    }

    public void o3(int i9) {
        this.f34464b2.f25867v = new RunnableC1473t();
        PlayerView playerView = this.f34464b2;
        playerView.f25865u.postDelayed(playerView.f25867v, i9);
    }

    public void o4() {
        try {
            I1 i12 = this.f34575r4;
            if (i12 != null) {
                i12.release();
                this.f34575r4 = null;
                this.f34589t4 = null;
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i9, int i10, Intent intent) {
        super.onActivityResult(i9, i10, intent);
        if (i9 == 101) {
            try {
                if (W3()) {
                    SharedPreferences sharedPreferences = getSharedPreferences("downloadStatus", 0);
                    f34287K5 = sharedPreferences;
                    String string = sharedPreferences.getString("downloadStatus", "");
                    m7.w wVar = new m7.w();
                    if (string.equals("processing")) {
                        wVar.L0(this);
                    } else {
                        wVar.O0(this, this.f34517j2, this.f34494g0, this.f34493g, this.f34314D, this.f34321E, this.f34473d);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0115 A[Catch: Exception -> 0x0122, PHI: r0
      0x0115: PHI (r0v9 android.widget.LinearLayout) = (r0v8 android.widget.LinearLayout), (r0v26 android.widget.LinearLayout) binds: [B:47:0x011e, B:43:0x0113] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0122, blocks: (B:2:0x0000, B:4:0x0009, B:6:0x000f, B:8:0x001c, B:10:0x0024, B:12:0x0031, B:14:0x0036, B:16:0x003c, B:18:0x009d, B:20:0x00a1, B:22:0x00a9, B:24:0x00b8, B:25:0x00bf, B:27:0x00c7, B:28:0x00ce, B:30:0x00d6, B:31:0x00dd, B:33:0x00ea, B:34:0x00ef, B:36:0x00f7, B:37:0x00fc, B:39:0x0104, B:40:0x0109, B:42:0x0111, B:44:0x0115, B:45:0x0118, B:46:0x011c), top: B:53:0x0000 }] */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBackPressed() {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.onBackPressed():void");
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
                checkBox = this.f34415S4;
            }
        } else if (id == a7.f.f12314X1) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f34421T4;
            }
        } else if (id == a7.f.f12323Y1) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f34427U4;
            }
        } else if (id == a7.f.f12305W1) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f34433V4;
            }
        } else if (id == a7.f.f12383e2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f34354I4;
            }
        } else if (id == a7.f.f12403g2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f34361J4;
            }
        } else if (id == a7.f.f12413h2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f34367K4;
            }
        } else if (id == a7.f.f12393f2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f34373L4;
            }
        } else if (id == a7.f.f12342a2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f34379M4;
            }
        } else if (id == a7.f.f12362c2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f34385N4;
            }
        } else if (id == a7.f.f12372d2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f34391O4;
            }
        } else if (id == a7.f.f12352b2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f34397P4;
            }
        } else if (id != a7.f.f12332Z1 || !zIsChecked) {
            return;
        } else {
            checkBox = this.f34403Q4;
        }
        this.f34299A5 = checkBox.getText().toString();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        String str2;
        C2966a c2966aF;
        String strValueOf;
        C2966a c2966aF2;
        String strValueOf2;
        Toast toastMakeText;
        TextView textView;
        Resources resources;
        int i9;
        int i10;
        int i11;
        View view2;
        ImageView imageView;
        int id = view.getId();
        if (id != a7.f.f12275S8) {
            if (id != a7.f.f12172I5) {
                if (id == a7.f.f12162H5) {
                    try {
                        if (this.f34372L3.equals("tv")) {
                            F4();
                            z4();
                            pause();
                            this.f34465b3.setVisibility(8);
                            this.f34460a3.setVisibility(0);
                            this.f34460a3.requestFocus();
                        } else {
                            F4();
                            A4();
                            pause();
                            this.f34465b3.setVisibility(8);
                            this.f34460a3.setVisibility(0);
                        }
                        return;
                    } catch (Exception e9) {
                        str = "exection " + e9;
                        str2 = "NSTIJPLAYERACTIVTY";
                    }
                } else if (id == a7.f.x9) {
                    try {
                        AsyncTask asyncTask = this.f34566q2;
                        if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
                            this.f34566q2.cancel(true);
                        }
                        this.f34540m4 = Boolean.FALSE;
                        this.f34351I1.removeCallbacksAndMessages(null);
                        this.f34351I1.postDelayed(new RunnableC1468o(), 5000L);
                        F4();
                        A4();
                        n3(5000);
                        if (this.f34464b2 != null) {
                            this.f34316D1.removeCallbacksAndMessages(null);
                            n4();
                            this.f34393P0 = true;
                            int currentWindowIndex = this.f34464b2.getCurrentWindowIndex();
                            ArrayList arrayList = this.f34599v0;
                            if (arrayList == null || arrayList.size() <= 1 || currentWindowIndex > this.f34599v0.size() - 1 || currentWindowIndex <= -1) {
                                return;
                            }
                            String name = ((LiveStreamsDBModel) this.f34599v0.get(currentWindowIndex)).getName();
                            String num = ((LiveStreamsDBModel) this.f34599v0.get(currentWindowIndex)).getNum();
                            this.f34359J2 = m7.w.r0(((LiveStreamsDBModel) this.f34599v0.get(currentWindowIndex)).getNum());
                            String url = ((LiveStreamsDBModel) this.f34599v0.get(currentWindowIndex)).getUrl();
                            this.f34607w1 = url;
                            String streamIcon = ((LiveStreamsDBModel) this.f34599v0.get(currentWindowIndex)).getStreamIcon();
                            try {
                                if (streamIcon.equals("") || streamIcon.isEmpty()) {
                                    this.f34563q.setImageDrawable(this.f34486f.getResources().getDrawable(a7.e.f12016i1));
                                } else {
                                    com.squareup.picasso.t.q(this.f34486f).l(streamIcon).j(a7.e.f12016i1).d(a7.e.f12016i1).k(80, 55).g(this.f34563q);
                                }
                            } catch (Exception unused) {
                                this.f34563q.setImageDrawable(this.f34486f.getResources().getDrawable(a7.e.f12016i1));
                            }
                            this.f34464b2.setTitle(num + " - " + name);
                            this.f34382N1 = currentWindowIndex;
                            this.f34364K1.clear();
                            this.f34364K1.apply();
                            this.f34370L1.clear();
                            this.f34370L1.apply();
                            this.f34358J1.clear();
                            this.f34358J1.apply();
                            if (this.f34503h2.booleanValue()) {
                                this.f34316D1.postDelayed(new RunnableC1469p(currentWindowIndex, name, url), SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("stalker_api") ? 1000 : 200);
                            }
                            this.f34330F1.removeCallbacksAndMessages(null);
                            this.f34600v1 = m7.w.q0(((LiveStreamsDBModel) this.f34599v0.get(currentWindowIndex)).getStreamId());
                            if (this.f34448Y1.equals("m3u")) {
                                c2966aF = C2966a.f();
                                strValueOf = this.f34607w1;
                            } else {
                                c2966aF = C2966a.f();
                                strValueOf = String.valueOf(this.f34600v1);
                            }
                            c2966aF.A(strValueOf);
                            SharedPreferences.Editor editor = this.f34621y1;
                            if (editor != null) {
                                editor.putString("currentlyPlayingVideo", String.valueOf(((LiveStreamsDBModel) this.f34599v0.get(currentWindowIndex)).getStreamId()));
                                this.f34621y1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", ((LiveStreamsDBModel) this.f34599v0.get(currentWindowIndex)).getUrl());
                                this.f34621y1.apply();
                            }
                            SharedPreferences.Editor editor2 = this.f34628z1;
                            if (editor2 != null) {
                                editor2.putInt("currentlyPlayingVideoPosition", currentWindowIndex);
                                this.f34628z1.apply();
                            }
                            if (this.f34587t2 != 0) {
                                this.f34587t2 = currentWindowIndex;
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        str = "exection " + e10;
                        str2 = "NSTIJPLAYERskyACTIVTY";
                    }
                } else {
                    if (id == a7.f.T8) {
                        try {
                            AsyncTask asyncTask2 = this.f34566q2;
                            if (asyncTask2 != null && asyncTask2.getStatus().equals(AsyncTask.Status.RUNNING)) {
                                this.f34566q2.cancel(true);
                            }
                            this.f34540m4 = Boolean.FALSE;
                            this.f34351I1.removeCallbacksAndMessages(null);
                            this.f34351I1.postDelayed(new RunnableC1470q(), 5000L);
                            F4();
                            A4();
                            n3(5000);
                            if (this.f34464b2 != null) {
                                this.f34316D1.removeCallbacksAndMessages(null);
                                this.f34393P0 = true;
                                d4();
                                int currentWindowIndex2 = this.f34464b2.getCurrentWindowIndex();
                                ArrayList arrayList2 = this.f34599v0;
                                if (arrayList2 == null || arrayList2.size() <= 1 || currentWindowIndex2 > this.f34599v0.size() - 1 || currentWindowIndex2 <= -1) {
                                    return;
                                }
                                String name2 = ((LiveStreamsDBModel) this.f34599v0.get(currentWindowIndex2)).getName();
                                String url2 = ((LiveStreamsDBModel) this.f34599v0.get(currentWindowIndex2)).getUrl();
                                this.f34607w1 = url2;
                                String num2 = ((LiveStreamsDBModel) this.f34599v0.get(currentWindowIndex2)).getNum();
                                this.f34359J2 = m7.w.r0(((LiveStreamsDBModel) this.f34599v0.get(currentWindowIndex2)).getNum());
                                String streamIcon2 = ((LiveStreamsDBModel) this.f34599v0.get(currentWindowIndex2)).getStreamIcon();
                                try {
                                    if (streamIcon2.equals("") || streamIcon2.isEmpty()) {
                                        this.f34563q.setImageDrawable(this.f34486f.getResources().getDrawable(a7.e.f12016i1));
                                    } else {
                                        com.squareup.picasso.t.q(this.f34486f).l(streamIcon2).j(a7.e.f12016i1).d(a7.e.f12016i1).k(80, 55).g(this.f34563q);
                                    }
                                } catch (Exception unused2) {
                                    this.f34563q.setImageDrawable(this.f34486f.getResources().getDrawable(a7.e.f12016i1));
                                }
                                this.f34464b2.setTitle(num2 + " - " + name2);
                                this.f34382N1 = currentWindowIndex2;
                                this.f34364K1.clear();
                                this.f34364K1.apply();
                                this.f34370L1.clear();
                                this.f34370L1.apply();
                                this.f34358J1.clear();
                                this.f34358J1.apply();
                                if (this.f34503h2.booleanValue()) {
                                    this.f34316D1.postDelayed(new RunnableC1471r(currentWindowIndex2, name2, url2), SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("stalker_api") ? 1000 : 200);
                                }
                                this.f34330F1.removeCallbacksAndMessages(null);
                                this.f34600v1 = m7.w.q0(((LiveStreamsDBModel) this.f34599v0.get(currentWindowIndex2)).getStreamId());
                                if (this.f34448Y1.equals("m3u")) {
                                    c2966aF2 = C2966a.f();
                                    strValueOf2 = this.f34607w1;
                                } else {
                                    c2966aF2 = C2966a.f();
                                    strValueOf2 = String.valueOf(this.f34600v1);
                                }
                                c2966aF2.A(strValueOf2);
                                SharedPreferences.Editor editor3 = this.f34621y1;
                                if (editor3 != null) {
                                    editor3.putString("currentlyPlayingVideo", String.valueOf(((LiveStreamsDBModel) this.f34599v0.get(currentWindowIndex2)).getStreamId()));
                                    this.f34621y1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", ((LiveStreamsDBModel) this.f34599v0.get(currentWindowIndex2)).getUrl());
                                    this.f34621y1.apply();
                                }
                                SharedPreferences.Editor editor4 = this.f34628z1;
                                if (editor4 != null) {
                                    editor4.putInt("currentlyPlayingVideoPosition", currentWindowIndex2);
                                    this.f34628z1.apply();
                                }
                                if (this.f34587t2 != 0) {
                                    this.f34587t2 = currentWindowIndex2;
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (Exception e11) {
                            str = "exection " + e11;
                        }
                    } else {
                        if (id == a7.f.f12576x3 || id == a7.f.f12566w3 || id == a7.f.f12596z3 || id == a7.f.Qm) {
                            return;
                        }
                        if (id != a7.f.f12491p) {
                            if (id == a7.f.f12337Z6 || id == a7.f.f12111C4) {
                                F4();
                                O3();
                                D4();
                                return;
                            }
                            if (id == a7.f.f12367c7 || id == a7.f.f12131E4) {
                                onBackPressed();
                            } else if (id != a7.f.f12171I4 && id != a7.f.f12181J4) {
                                if (id == a7.f.f12560v7) {
                                    F4();
                                    O3();
                                    v4("player", true);
                                    return;
                                }
                                if (id == a7.f.f12104B7) {
                                    F4();
                                    n3(5000);
                                    G4();
                                    return;
                                }
                                if (id != a7.f.f0if) {
                                    if (id == a7.f.f12590y7 || id == a7.f.f12271S4) {
                                        F4();
                                        O3();
                                        if (this.f34541m5.getVisibility() == 8) {
                                            this.f34541m5.startAnimation(this.f34360J3);
                                            this.f34541m5.setVisibility(0);
                                            this.f34548n5.requestFocus();
                                            this.f34506h5.requestFocus();
                                            this.f34415S4.setChecked(false);
                                            this.f34421T4.setChecked(false);
                                            this.f34427U4.setChecked(false);
                                            this.f34433V4.setChecked(false);
                                            this.f34379M4.setChecked(false);
                                            this.f34385N4.setChecked(false);
                                            this.f34391O4.setChecked(false);
                                            this.f34397P4.setChecked(false);
                                            this.f34403Q4.setChecked(false);
                                            this.f34354I4.setChecked(false);
                                            this.f34361J4.setChecked(false);
                                            this.f34367K4.setChecked(false);
                                            this.f34373L4.setChecked(false);
                                            this.f34499g5.setText("");
                                            return;
                                        }
                                        return;
                                    }
                                    if (id == a7.f.f12574x1) {
                                        this.f34625y5 = this.f34451Y4.getText().toString();
                                        this.f34632z5 = this.f34472c5.getText().toString();
                                        i10 = 0;
                                        this.f34527k5.setVisibility(0);
                                        this.f34333F4.setVisibility(0);
                                        i11 = 8;
                                        this.f34326E4.setVisibility(8);
                                        this.f34340G4.setVisibility(8);
                                        this.f34583s5.setVisibility(8);
                                    } else {
                                        if (id == a7.f.Jg) {
                                            this.f34625y5 = this.f34457Z4.getText().toString();
                                            this.f34632z5 = this.f34478d5.getText().toString();
                                            this.f34527k5.setVisibility(0);
                                            i11 = 8;
                                            this.f34333F4.setVisibility(8);
                                            this.f34583s5.setVisibility(8);
                                            this.f34326E4.setVisibility(0);
                                            this.f34499g5.setVisibility(0);
                                            this.f34340G4.setVisibility(8);
                                            this.f34409R4.setVisibility(i11);
                                            textView = this.f34439W4;
                                            resources = getResources();
                                            i9 = a7.j.f13111Q7;
                                            textView.setText(resources.getString(i9));
                                            return;
                                        }
                                        if (id == a7.f.f12312X) {
                                            this.f34625y5 = this.f34462a5.getText().toString();
                                            this.f34632z5 = this.f34485e5.getText().toString();
                                            i10 = 0;
                                            this.f34527k5.setVisibility(0);
                                            i11 = 8;
                                            this.f34333F4.setVisibility(8);
                                            this.f34326E4.setVisibility(8);
                                            this.f34583s5.setVisibility(8);
                                            this.f34340G4.setVisibility(0);
                                        } else {
                                            if (id == a7.f.f12440k) {
                                                this.f34625y5 = this.f34467b5.getText().toString();
                                                this.f34632z5 = this.f34492f5.getText().toString();
                                                this.f34527k5.setVisibility(0);
                                                this.f34333F4.setVisibility(8);
                                                this.f34326E4.setVisibility(8);
                                                this.f34340G4.setVisibility(8);
                                                this.f34583s5.setVisibility(8);
                                                this.f34409R4.setVisibility(0);
                                                this.f34499g5.setVisibility(0);
                                                textView = this.f34439W4;
                                                resources = getResources();
                                                i9 = a7.j.f13111Q7;
                                                textView.setText(resources.getString(i9));
                                                return;
                                            }
                                            if (id == a7.f.f12555v2) {
                                                this.f34527k5.setVisibility(0);
                                                this.f34333F4.setVisibility(8);
                                                this.f34326E4.setVisibility(8);
                                                this.f34340G4.setVisibility(8);
                                                this.f34409R4.setVisibility(8);
                                                this.f34583s5.setVisibility(0);
                                                this.f34499g5.setVisibility(4);
                                                this.f34576r5.setVisibility(0);
                                                textView = this.f34439W4;
                                                resources = getResources();
                                                i9 = a7.j.f13437y0;
                                                textView.setText(resources.getString(i9));
                                                return;
                                            }
                                            if (id != a7.f.tm) {
                                                return;
                                            }
                                            if (this.f34583s5.getVisibility() == 0) {
                                                try {
                                                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getResources().getString(a7.j.f13447z0))));
                                                } catch (ActivityNotFoundException e12) {
                                                    Toast.makeText(this, "No application can handle this request. Please install a webbrowser", 1).show();
                                                    e12.printStackTrace();
                                                }
                                                this.f34541m5.setVisibility(8);
                                                return;
                                            }
                                            this.f34306B5 = this.f34499g5.getText().toString();
                                            r3();
                                            if (this.f34379M4.isChecked() || this.f34385N4.isChecked() || this.f34391O4.isChecked() || this.f34397P4.isChecked() || this.f34403Q4.isChecked() || this.f34415S4.isChecked() || this.f34421T4.isChecked() || this.f34427U4.isChecked() || this.f34433V4.isChecked() || this.f34354I4.isChecked() || this.f34361J4.isChecked() || this.f34367K4.isChecked() || this.f34373L4.isChecked() || this.f34499g5.length() > 0) {
                                                v1();
                                                this.f34415S4.setChecked(false);
                                                this.f34421T4.setChecked(false);
                                                this.f34427U4.setChecked(false);
                                                this.f34433V4.setChecked(false);
                                                this.f34379M4.setChecked(false);
                                                this.f34385N4.setChecked(false);
                                                this.f34391O4.setChecked(false);
                                                this.f34397P4.setChecked(false);
                                                this.f34403Q4.setChecked(false);
                                                this.f34354I4.setChecked(false);
                                                this.f34361J4.setChecked(false);
                                                this.f34367K4.setChecked(false);
                                                this.f34373L4.setChecked(false);
                                                this.f34499g5.setText("");
                                                RelativeLayout relativeLayout = this.f34541m5;
                                                if (relativeLayout == null || relativeLayout.getVisibility() != 0) {
                                                    return;
                                                }
                                                this.f34541m5.setVisibility(8);
                                                this.f34527k5.setVisibility(8);
                                                this.f34527k5.startAnimation(this.f34353I3);
                                                this.f34541m5.startAnimation(this.f34353I3);
                                                return;
                                            }
                                            toastMakeText = Toast.makeText(this.f34486f, "Please Add Report", 0);
                                        }
                                    }
                                    this.f34499g5.setVisibility(i10);
                                    this.f34409R4.setVisibility(i11);
                                    textView = this.f34439W4;
                                    resources = getResources();
                                    i9 = a7.j.f13111Q7;
                                    textView.setText(resources.getString(i9));
                                    return;
                                }
                                view2 = this.f34609w3;
                            }
                            onBackPressed();
                            return;
                        }
                        try {
                            C3();
                            return;
                        } catch (Exception e13) {
                            str = "exection " + e13.getMessage();
                        }
                    }
                    str2 = "NSTIJPLAYER";
                }
                Log.e(str2, str);
                return;
            }
            if (!this.f34372L3.equals("tv")) {
                I1 i12 = this.f34575r4;
                if (i12 == null || i12.getPlaybackState() != 3) {
                    F4();
                    A4();
                    o3(5000);
                    imageView = this.f34460a3;
                } else {
                    F4();
                    A4();
                    o3(1000);
                    l4();
                    this.f34460a3.setVisibility(8);
                    imageView = this.f34465b3;
                }
                imageView.setVisibility(0);
                return;
            }
            I1 i13 = this.f34575r4;
            if (i13 == null || i13.getPlaybackState() != 3) {
                F4();
                z4();
                n3(5000);
                this.f34460a3.setVisibility(0);
                view2 = this.f34460a3;
            } else {
                F4();
                z4();
                n3(1000);
                l4();
                this.f34460a3.setVisibility(8);
                this.f34465b3.setVisibility(0);
                view2 = this.f34465b3;
            }
            view2.requestFocus();
            return;
        }
        if (!SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("stalker_api")) {
            this.f34512i4 = true;
            if (this.f34307C) {
                return;
            }
            o4();
            if (this.f34448Y1.equals("m3u")) {
                if (this.f34503h2.booleanValue()) {
                    Intent intent = new Intent(this.f34486f, (Class<?>) NSTIJKPlayerMultiActivity.class);
                    intent.putExtra("url", this.f34607w1);
                    C2966a.f().A(this.f34607w1);
                    intent.putExtra("CHANNEL_NUM", this.f34359J2);
                    this.f34486f.startActivity(intent);
                    return;
                }
                return;
            }
            if (this.f34600v1 == -1 || !this.f34503h2.booleanValue()) {
                return;
            }
            String strV = m7.w.V(this.f34486f, this.f34600v1, this.f34494g0, "live");
            C2966a.f().A(String.valueOf(this.f34600v1));
            Intent intent2 = new Intent(this.f34486f, (Class<?>) NSTIJKPlayerMultiActivity.class);
            intent2.putExtra("url", strV);
            intent2.putExtra("CHANNEL_NUM", this.f34359J2);
            this.f34486f.startActivity(intent2);
            return;
        }
        toastMakeText = Toast.makeText(this.f34486f, "This feature has been disabled.", 1);
        toastMakeText.show();
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f3(configuration);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        m.e eVarR;
        m.d dVarB;
        SharedPreferences.Editor editor;
        String strValueOf;
        this.f34486f = this;
        super.onCreate(bundle);
        this.f34582s4 = AbstractC2683b.d(this);
        SharedPreferences sharedPreferences = getSharedPreferences("auto_start", 0);
        this.f34305B4 = sharedPreferences;
        boolean z9 = sharedPreferences.getBoolean("subtitle_active", true);
        if (bundle != null) {
            dVarB = (m.d) bundle.getParcelable("track_selector_parameters");
        } else {
            if (z9) {
                eVarR = new m.e(this);
            } else {
                eVarR = new m.e(this);
                eVarR = eVarR.R(1);
            }
            dVarB = eVarR.B();
        }
        this.f34596u4 = dVarB;
        setContentView(a7.g.f12614C);
        this.f34383N2 = (SeekBar) findViewById(a7.f.Lf);
        this.f34389O2 = (SeekBar) findViewById(a7.f.Kf);
        this.f34395P2 = (LinearLayout) findViewById(a7.f.f12438j7);
        this.f34401Q2 = (LinearLayout) findViewById(a7.f.Ea);
        this.f34504h3 = (TextView) findViewById(a7.f.Mh);
        this.f34511i3 = (TextView) findViewById(a7.f.mm);
        this.f34407R2 = (LinearLayout) findViewById(a7.f.h9);
        this.f34443X2 = (RelativeLayout) findViewById(a7.f.lf);
        this.f34449Y2 = (RelativeLayout) findViewById(a7.f.ne);
        this.f34455Z2 = (RelativeLayout) findViewById(a7.f.oe);
        this.f34413S2 = (LinearLayout) findViewById(a7.f.t9);
        this.f34460a3 = (ImageView) findViewById(a7.f.f12172I5);
        this.f34465b3 = (ImageView) findViewById(a7.f.f12162H5);
        this.f34419T2 = (LinearLayout) findViewById(a7.f.f12357b7);
        this.f34470c3 = (ImageView) findViewById(a7.f.f12171I4);
        this.f34476d3 = (ImageView) findViewById(a7.f.f12181J4);
        this.f34483e3 = (ImageView) findViewById(a7.f.f12131E4);
        this.f34425U2 = (LinearLayout) findViewById(a7.f.f12367c7);
        this.f34490f3 = (ImageView) findViewById(a7.f.f12111C4);
        this.f34431V2 = (LinearLayout) findViewById(a7.f.f12104B7);
        this.f34437W2 = (LinearLayout) findViewById(a7.f.f12328Y6);
        this.f34532l3 = (LinearLayout) findViewById(a7.f.f12275S8);
        this.f34539m3 = (LinearLayout) findViewById(a7.f.f12560v7);
        this.f34546n3 = (LinearLayout) findViewById(a7.f.x9);
        this.f34553o3 = (LinearLayout) findViewById(a7.f.T8);
        this.f34518j3 = (TextView) findViewById(a7.f.lj);
        this.f34560p3 = (LinearLayout) findViewById(a7.f.va);
        this.f34567q3 = (LinearLayout) findViewById(a7.f.ya);
        this.f34574r3 = (LinearLayout) findViewById(a7.f.wa);
        this.f34581s3 = (LinearLayout) findViewById(a7.f.f12428i7);
        this.f34588t3 = (LinearLayout) findViewById(a7.f.f12114C7);
        this.f34595u3 = (RecyclerView) findViewById(a7.f.Fd);
        this.f34602v3 = (RecyclerView) findViewById(a7.f.Gd);
        this.f34609w3 = (EditText) findViewById(a7.f.f12464m3);
        this.f34616x3 = (LinearLayout) findViewById(a7.f.W8);
        this.f34623y3 = (LinearLayout) findViewById(a7.f.X8);
        this.f34630z3 = (RelativeLayout) findViewById(a7.f.f0if);
        this.f34297A3 = (LinearLayout) findViewById(a7.f.f12580x7);
        this.f34497g3 = (ImageView) findViewById(a7.f.f12309W5);
        this.f34525k3 = (TextView) findViewById(a7.f.ah);
        this.f34304B3 = (LinearLayout) findViewById(a7.f.f12337Z6);
        this.f34326E4 = (RelativeLayout) findViewById(a7.f.Hg);
        this.f34333F4 = (RelativeLayout) findViewById(a7.f.f12564w1);
        this.f34340G4 = (RelativeLayout) findViewById(a7.f.f12330Z);
        this.f34347H4 = (TextView) findViewById(a7.f.ym);
        this.f34354I4 = (CheckBox) findViewById(a7.f.f12383e2);
        this.f34361J4 = (CheckBox) findViewById(a7.f.f12403g2);
        this.f34367K4 = (CheckBox) findViewById(a7.f.f12413h2);
        this.f34373L4 = (CheckBox) findViewById(a7.f.f12393f2);
        this.f34379M4 = (CheckBox) findViewById(a7.f.f12342a2);
        this.f34385N4 = (CheckBox) findViewById(a7.f.f12362c2);
        this.f34391O4 = (CheckBox) findViewById(a7.f.f12372d2);
        this.f34397P4 = (CheckBox) findViewById(a7.f.f12352b2);
        this.f34403Q4 = (CheckBox) findViewById(a7.f.f12332Z1);
        this.f34409R4 = (RelativeLayout) findViewById(a7.f.f12430j);
        this.f34415S4 = (CheckBox) findViewById(a7.f.f12296V1);
        this.f34421T4 = (CheckBox) findViewById(a7.f.f12314X1);
        this.f34427U4 = (CheckBox) findViewById(a7.f.f12323Y1);
        this.f34433V4 = (CheckBox) findViewById(a7.f.f12305W1);
        this.f34439W4 = (TextView) findViewById(a7.f.tm);
        this.f34445X4 = (LinearLayout) findViewById(a7.f.f12600z7);
        this.f34451Y4 = (TextView) findViewById(a7.f.f12554v1);
        this.f34457Z4 = (TextView) findViewById(a7.f.Fg);
        this.f34462a5 = (TextView) findViewById(a7.f.f12340a0);
        this.f34467b5 = (TextView) findViewById(a7.f.f12450l);
        this.f34472c5 = (TextView) findViewById(a7.f.f12584y1);
        this.f34478d5 = (TextView) findViewById(a7.f.Lg);
        this.f34485e5 = (TextView) findViewById(a7.f.f12350b0);
        this.f34492f5 = (TextView) findViewById(a7.f.f12460m);
        this.f34499g5 = (EditText) findViewById(a7.f.f12190K3);
        this.f34506h5 = (LinearLayout) findViewById(a7.f.f12316X3);
        this.f34513i5 = (LinearLayout) findViewById(a7.f.f12590y7);
        this.f34520j5 = (LinearLayout) findViewById(a7.f.xa);
        this.f34527k5 = (LinearLayout) findViewById(a7.f.f12339a);
        this.f34534l5 = (ImageView) findViewById(a7.f.f12271S4);
        this.f34541m5 = (RelativeLayout) findViewById(a7.f.ee);
        this.f34548n5 = (LinearLayout) findViewById(a7.f.f12574x1);
        this.f34555o5 = (LinearLayout) findViewById(a7.f.Jg);
        this.f34562p5 = (LinearLayout) findViewById(a7.f.f12312X);
        this.f34569q5 = (LinearLayout) findViewById(a7.f.f12440k);
        this.f34576r5 = (LinearLayout) findViewById(a7.f.f12555v2);
        this.f34583s5 = (RelativeLayout) findViewById(a7.f.f12545u2);
        if (!AbstractC2237a.f44475V0.booleanValue()) {
            this.f34520j5.setVisibility(4);
        }
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        V3();
        RelativeLayout relativeLayout = this.f34417T0;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new ViewOnClickListenerC1464k());
        }
        this.f34627z0 = J3();
        if (this.f34621y1 != null) {
            if (this.f34448Y1.equals("onestream_api")) {
                editor = this.f34621y1;
                strValueOf = this.f34479e;
            } else {
                editor = this.f34621y1;
                strValueOf = String.valueOf(this.f34531l2);
            }
            editor.putString("currentlyPlayingVideo", strValueOf);
            this.f34621y1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", "0");
            this.f34621y1.apply();
        }
        this.f34404R.deleteExtraLiveRecentlyWatched();
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("stalker_api")) {
            try {
                this.f34561p4 = SharepreferenceDBHandler.getStalkerToken(this.f34486f);
                String loggedInMacAddress = SharepreferenceDBHandler.getLoggedInMacAddress(this.f34486f);
                this.f34554o4 = loggedInMacAddress;
                this.f34498g4.f(loggedInMacAddress, this.f34561p4, 0);
            } catch (Exception unused) {
            }
        } else if (this.f34438W3.equals("false")) {
            s4();
        } else {
            String str = this.f34447Y0;
            this.f34365K2 = str;
            q7.N n9 = new q7.N(this.f34486f, str, "", this.f34444X3, this.f34438W3);
            this.f34378M3 = n9;
            this.f34371L2 = this.f34365K2;
            this.f34595u3.setAdapter(n9);
            this.f34595u3.setLayoutManager(this.f34402Q3);
            j3(true);
        }
        if (!SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("stalker_api")) {
            m7.w.Z(this.f34486f);
        }
        H3();
        String strI1 = FreeTrailActivity.I1();
        this.f34611w5 = strI1;
        if (strI1.equals("") || this.f34611w5.isEmpty()) {
            this.f34611w5 = m7.w.I(this.f34486f);
        }
        this.f34415S4.setOnCheckedChangeListener(this);
        this.f34421T4.setOnCheckedChangeListener(this);
        this.f34427U4.setOnCheckedChangeListener(this);
        this.f34433V4.setOnCheckedChangeListener(this);
        this.f34379M4.setOnCheckedChangeListener(this);
        this.f34385N4.setOnCheckedChangeListener(this);
        this.f34391O4.setOnCheckedChangeListener(this);
        this.f34397P4.setOnCheckedChangeListener(this);
        this.f34403Q4.setOnCheckedChangeListener(this);
        this.f34354I4.setOnCheckedChangeListener(this);
        this.f34361J4.setOnCheckedChangeListener(this);
        this.f34367K4.setOnCheckedChangeListener(this);
        this.f34373L4.setOnCheckedChangeListener(this);
        this.f34347H4.setOnClickListener(new w());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f34350I0.x(h.f12935r);
        this.f34424U1 = menu;
        this.f34430V1 = menu.getItem(2).getSubMenu().findItem(a7.f.f12239P2);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("api")) {
            menu.getItem(2).getSubMenu().findItem(a7.f.gb).setVisible(false);
        }
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f34486f.getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f34350I0.getChildCount(); i9++) {
            if (this.f34350I0.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f34350I0.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
        return true;
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            s3();
            o4();
        } catch (Exception unused) {
        }
        try {
            Thread thread = this.f34348H5;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f34348H5.interrupt();
        } catch (Exception unused2) {
        }
    }

    @Override // androidx.appcompat.app.b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        keyEvent.getRepeatCount();
        keyEvent.getAction();
        if (f34288L5 && this.f34581s3.getVisibility() == 8 && this.f34443X2.getVisibility() == 8 && this.f34455Z2.getVisibility() == 8 && this.f34541m5.getVisibility() == 8) {
            if (i9 == 20) {
                if (this.f34503h2.booleanValue()) {
                    findViewById(a7.f.x9).performClick();
                }
                return true;
            }
            if (i9 == 19) {
                if (this.f34503h2.booleanValue()) {
                    findViewById(a7.f.T8).performClick();
                }
                return true;
            }
        }
        if (i9 == 166) {
            if (f34288L5 && this.f34503h2.booleanValue()) {
                findViewById(a7.f.T8).performClick();
            }
            return true;
        }
        if (i9 != 167) {
            return super.onKeyDown(i9, keyEvent);
        }
        if (f34288L5 && this.f34503h2.booleanValue()) {
            findViewById(a7.f.x9).performClick();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        StringBuilder sb;
        boolean z9 = keyEvent.getRepeatCount() == 0;
        if (i9 != 62) {
            if (i9 != 66) {
                if (i9 != 79) {
                    if (i9 == 82) {
                        Menu menu = this.f34424U1;
                        if (menu != null) {
                            menu.performIdentifierAction(a7.f.f12239P2, 0);
                        }
                        return true;
                    }
                    if (i9 != 85 && i9 != 86 && i9 != 126 && i9 != 127) {
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
                                if (f34288L5 && !SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("stalker_api")) {
                                    this.f34344H1.removeCallbacksAndMessages(null);
                                    int i10 = 7;
                                    if (i9 == 7) {
                                        this.f34388O1.append(0);
                                    } else if (i9 == 8) {
                                        this.f34388O1.append(1);
                                    } else {
                                        if (i9 == 9) {
                                            sb = this.f34388O1;
                                            i10 = 2;
                                        } else if (i9 == 10) {
                                            this.f34388O1.append(3);
                                        } else if (i9 == 11) {
                                            sb = this.f34388O1;
                                            i10 = 4;
                                        } else if (i9 == 12) {
                                            sb = this.f34388O1;
                                            i10 = 5;
                                        } else if (i9 == 13) {
                                            sb = this.f34388O1;
                                            i10 = 6;
                                        } else if (i9 == 14) {
                                            sb = this.f34388O1;
                                        } else if (i9 == 15) {
                                            this.f34388O1.append(8);
                                        } else if (i9 == 16) {
                                            this.f34388O1.append(9);
                                        }
                                        sb.append(i10);
                                    }
                                    this.f34400Q1.setText(this.f34388O1.toString());
                                    this.f34394P1.setVisibility(0);
                                    this.f34344H1.postDelayed(new RunnableC1467n(), 3000L);
                                }
                                return true;
                            default:
                                switch (i9) {
                                    case 19:
                                        F4();
                                        n3(5000);
                                        this.f34541m5.getVisibility();
                                        return true;
                                    case 20:
                                        F4();
                                        n3(5000);
                                        this.f34541m5.getVisibility();
                                        return true;
                                    case 21:
                                        F4();
                                        n3(5000);
                                        if (this.f34541m5.getVisibility() != 0 && f34288L5 && this.f34413S2.getVisibility() == 8 && this.f34455Z2.getVisibility() == 8) {
                                            v4("player", true);
                                        }
                                        return true;
                                    case 22:
                                        F4();
                                        n3(5000);
                                        this.f34541m5.getVisibility();
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
            }
            if (f34288L5 && this.f34541m5.getVisibility() == 8) {
                I1 i12 = this.f34575r4;
                if (i12 == null || i12.getPlaybackState() != 3) {
                    H4();
                } else if (this.f34443X2.getVisibility() == 8) {
                    H4();
                    (this.f34575r4.isPlaying() ? this.f34465b3 : this.f34460a3).requestFocus();
                }
            }
            return true;
        }
        if (this.f34503h2.booleanValue()) {
            I1 i13 = this.f34575r4;
            ((i13 == null || !z9 || i13.isPlaying()) ? this.f34465b3 : this.f34460a3).performClick();
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f34430V1 = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == a7.f.Gb) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == a7.f.Mb) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == a7.f.f12390f && (context = this.f34486f) != null) {
            new a.C0158a(context, k.f13456a).setTitle(this.f34486f.getResources().getString(a7.j.f13250f3)).f(this.f34486f.getResources().getString(a7.j.f13240e3)).j(this.f34486f.getResources().getString(a7.j.f13132S8), new y()).g(this.f34486f.getResources().getString(a7.j.f13231d4), new DialogInterfaceOnClickListenerC1475v()).n();
        }
        if (itemId == a7.f.f12400g) {
            try {
                SearchView searchView = (SearchView) menuItem.getActionView();
                this.f34357J0 = searchView;
                if (searchView != null) {
                    searchView.setQueryHint(getResources().getString(a7.j.f12950A6));
                    this.f34357J0.setIconifiedByDefault(false);
                    ImageView imageView = (ImageView) this.f34357J0.findViewById(a7.f.Uf);
                    ((ImageView) this.f34357J0.findViewById(a7.f.Vf)).setImageResource(a7.e.f12032m1);
                    imageView.setImageResource(a7.e.f12032m1);
                    imageView.setPadding(15, 15, 15, 15);
                    imageView.setBackground(null);
                    this.f34357J0.setOnQueryTextListener(new z());
                    return true;
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        if (itemId == a7.f.gb) {
            m7.w.A0(this.f34486f);
        }
        if (itemId == a7.f.mb) {
            C4(this);
        }
        if (itemId == a7.f.Db) {
            w4();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        Handler handler;
        super.onPause();
        try {
            Thread thread = this.f34533l4;
            if (thread != null && thread.isAlive()) {
                this.f34533l4.interrupt();
            }
        } catch (Exception unused) {
        }
        try {
            if (this.f34540m4.booleanValue() || (handler = this.f34351I1) == null) {
                return;
            }
            handler.removeCallbacksAndMessages(null);
        } catch (Exception unused2) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i9, strArr, iArr);
        if (i9 != 101) {
            return;
        }
        try {
            if (iArr.length > 0 && iArr[0] == 0) {
                W3();
            } else if (Build.VERSION.SDK_INT >= 23 && !shouldShowRequestPermissionRationale(strArr[0])) {
                a.C0158a c0158a = new a.C0158a(this, k.f13456a);
                View viewInflate = LayoutInflater.from(this).inflate(a7.g.f12738W3, (ViewGroup) null);
                Button button = (Button) viewInflate.findViewById(a7.f.f12361c1);
                Button button2 = (Button) viewInflate.findViewById(a7.f.f12286U0);
                button.setOnFocusChangeListener(new w.k((View) button, (Activity) this));
                button2.setOnFocusChangeListener(new w.k((View) button2, (Activity) this));
                button.setOnClickListener(new E());
                button2.setOnClickListener(new F());
                c0158a.setView(viewInflate);
                this.f34489f2 = c0158a.create();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f34489f2.getWindow();
                Objects.requireNonNull(window);
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                this.f34489f2.show();
                this.f34489f2.getWindow().setAttributes(layoutParams);
                this.f34489f2.setCancelable(false);
                this.f34489f2.show();
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f34533l4;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new I());
            this.f34533l4 = thread2;
            thread2.start();
        }
        m7.w.m(this.f34486f);
        if (this.f34594u2) {
            this.f34594u2 = false;
            E4();
        } else if (this.f34575r4 == null) {
            U3();
        }
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            o4();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        if (z9) {
            f3(getResources().getConfiguration());
        }
    }

    public String p3(String str) {
        ArrayList arrayList = this.f34536m0;
        if (arrayList != null && arrayList.size() > 0) {
            for (LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel : this.f34536m0) {
                if (liveStreamCategoryIdDBModel.getLiveStreamCategoryID() != null && !liveStreamCategoryIdDBModel.getLiveStreamCategoryID().isEmpty() && liveStreamCategoryIdDBModel.getLiveStreamCategoryID().equalsIgnoreCase(str)) {
                    this.f34453Z0 = liveStreamCategoryIdDBModel.getLiveStreamCategoryName();
                }
            }
        }
        return this.f34453Z0;
    }

    @Override // z7.g
    public void q(StalkerGetVODByCatCallback stalkerGetVODByCatCallback) {
    }

    public void q3(int i9, String str, String str2) {
    }

    public final void q4(String str, int i9, String str2, String str3, int i10) {
        new U(str, i9, str2, str3, i10).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    public void r3() {
        this.f34313C5 = new ArrayList();
        this.f34320D5 = new JsonArray();
        if (this.f34379M4.isChecked()) {
            this.f34313C5.add(this.f34379M4.getText().toString());
            this.f34320D5.add(this.f34379M4.getText().toString());
        }
        if (this.f34385N4.isChecked()) {
            this.f34313C5.add(this.f34385N4.getText().toString());
            this.f34320D5.add(this.f34385N4.getText().toString());
        }
        if (this.f34391O4.isChecked()) {
            this.f34313C5.add(this.f34391O4.getText().toString());
            this.f34320D5.add(this.f34391O4.getText().toString());
        }
        if (this.f34397P4.isChecked()) {
            this.f34313C5.add(this.f34397P4.getText().toString());
            this.f34320D5.add(this.f34397P4.getText().toString());
        }
        if (this.f34403Q4.isChecked()) {
            this.f34313C5.add(this.f34403Q4.getText().toString());
            this.f34320D5.add(this.f34403Q4.getText().toString());
        }
        if (this.f34354I4.isChecked()) {
            this.f34313C5.add(this.f34354I4.getText().toString());
            this.f34320D5.add(this.f34354I4.getText().toString());
        }
        if (this.f34361J4.isChecked()) {
            this.f34313C5.add(this.f34361J4.getText().toString());
            this.f34320D5.add(this.f34361J4.getText().toString());
        }
        if (this.f34367K4.isChecked()) {
            this.f34313C5.add(this.f34367K4.getText().toString());
            this.f34320D5.add(this.f34367K4.getText().toString());
        }
        if (this.f34373L4.isChecked()) {
            this.f34313C5.add(this.f34373L4.getText().toString());
            this.f34320D5.add(this.f34373L4.getText().toString());
        }
        if (this.f34415S4.isChecked()) {
            this.f34313C5.add(this.f34415S4.getText().toString());
            this.f34320D5.add(this.f34415S4.getText().toString());
        }
        if (this.f34421T4.isChecked()) {
            this.f34313C5.add(this.f34421T4.getText().toString());
            this.f34320D5.add(this.f34421T4.getText().toString());
        }
        if (this.f34427U4.isChecked()) {
            this.f34313C5.add(this.f34427U4.getText().toString());
            this.f34320D5.add(this.f34427U4.getText().toString());
        }
        if (this.f34433V4.isChecked()) {
            this.f34313C5.add(this.f34433V4.getText().toString());
            this.f34320D5.add(this.f34433V4.getText().toString());
        }
        this.f34327E5 = new Gson().toJson((JsonElement) this.f34320D5);
        Log.e("TAG", this.f34320D5 + "");
    }

    public final void r4(String str, String str2, int i9) {
        new V(str, i9).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    public void s4() {
        this.f34559p2 = new K().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
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

    public void t4(ArrayList arrayList) {
        TextView textView;
        try {
            if (arrayList == null) {
                this.f34362K = new ArrayList();
                return;
            }
            this.f34300B = false;
            this.f34363K0.setVisibility(8);
            if (arrayList.size() == 0) {
                if (this.f34580s2) {
                    TextView textView2 = this.f34363K0;
                    if (textView2 == null) {
                        return;
                    }
                    this.f34300B = true;
                    textView2.setFocusable(true);
                    this.f34363K0.requestFocus();
                    textView = this.f34363K0;
                } else {
                    this.f34580s2 = true;
                    ArrayList arrayList2 = this.f34571r0;
                    if (arrayList2 != null && this.f34557p0 != null) {
                        arrayList2.clear();
                        this.f34557p0.clear();
                    }
                    this.f34571r0 = this.f34444X3.equals("true") ? this.f34404R.getAllLiveStreasWithCategoryId(this.f34447Y0, "radio_streams") : this.f34404R.getAllLiveStreasWithCategoryId(this.f34447Y0, "live");
                    ArrayList arrayList3 = this.f34571r0;
                    if (arrayList3 != null && arrayList3.size() > 0) {
                        t4(this.f34571r0);
                        return;
                    }
                    TextView textView3 = this.f34363K0;
                    if (textView3 == null) {
                        return;
                    }
                    this.f34300B = true;
                    textView3.setFocusable(true);
                    this.f34363K0.requestFocus();
                    textView = this.f34363K0;
                }
                textView.setVisibility(0);
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public void toggleView(View view) {
        if (view.getVisibility() == 8) {
            view.setVisibility(0);
        } else if (view.getVisibility() == 0) {
            view.setVisibility(8);
        }
    }

    @Override // z7.j
    public void u(StalkerCreatePlayerLinkCallback stalkerCreatePlayerLinkCallback, View view, int i9, int i10, String str, String str2, String str3, String str4, String str5, String str6, int i11, String str7, String str8) {
        try {
            m7.w.X();
            if (stalkerCreatePlayerLinkCallback == null || stalkerCreatePlayerLinkCallback.getJs() == null || stalkerCreatePlayerLinkCallback.getJs().getCmd() == null || stalkerCreatePlayerLinkCallback.getJs().getId() == null) {
                return;
            }
            String cmd = stalkerCreatePlayerLinkCallback.getJs().getCmd();
            this.f34466b4 = cmd;
            String[] strArrSplit = cmd.split("ffmpeg ", 0);
            if (strArrSplit.length == 2) {
                this.f34471c4 = strArrSplit[1];
            }
            if (str6.equals("playFirstTime")) {
                m4(this.f34585t0);
                if (this.f34393P0 && this.f34399Q0 && !this.f34405R0.equals("")) {
                    this.f34587t2 = 0;
                    try {
                        this.f34587t2 = I3(this.f34585t0, m7.w.r0(this.f34405R0));
                    } catch (NumberFormatException | Exception unused) {
                    }
                    this.f34393P0 = false;
                    this.f34399Q0 = false;
                }
                u4(this.f34585t0);
                return;
            }
            if (str6.equals("channel_click")) {
                i4(this.f34477d4, this.f34368L);
                return;
            }
            if (str6.equals("channel_click_from_player")) {
                j4(this.f34484e4, this.f34374M);
            } else if (str6.equals("zappingRight")) {
                L4(i11, str7, str8);
            } else if (str6.equals("zappingLeft")) {
                K4(i11, str7, str8);
            }
        } catch (Exception unused2) {
        }
    }

    public void u4(ArrayList arrayList) {
        ListView listView;
        try {
            if (this.f34432V3.equals("player")) {
                this.f34374M = arrayList;
                if (arrayList != null && arrayList.size() > 0) {
                    ListView listView2 = this.f34356J;
                    if (listView2 != null) {
                        listView2.setVisibility(0);
                    }
                    this.f34300B = false;
                    if (this.f34356J != null) {
                        q7.P p9 = new q7.P(this, arrayList);
                        this.f34396P3 = p9;
                        this.f34356J.setAdapter((ListAdapter) p9);
                        this.f34356J.setSelection(this.f34414S3);
                        this.f34356J.requestFocus();
                        this.f34356J.setOnItemClickListener(new H());
                        return;
                    }
                    return;
                }
                LinearLayout linearLayout = this.f34369L0;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                LinearLayout linearLayout2 = this.f34375M0;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                listView = this.f34356J;
                if (listView == null) {
                    return;
                }
            } else {
                this.f34368L = arrayList;
                if (arrayList != null && arrayList.size() > 0) {
                    ListView listView3 = this.f34349I;
                    if (listView3 != null) {
                        listView3.setVisibility(0);
                    }
                    this.f34300B = false;
                    if (this.f34349I != null) {
                        q7.O o9 = new q7.O(this, arrayList);
                        this.f34390O3 = o9;
                        this.f34349I.setAdapter((ListAdapter) o9);
                        this.f34349I.setSelection(this.f34414S3);
                        if (!f34288L5) {
                            this.f34349I.requestFocus();
                        }
                        this.f34349I.setOnItemSelectedListener(new C1454a());
                        this.f34349I.setOnItemClickListener(new C1455b(arrayList));
                        this.f34349I.setOnItemLongClickListener(new C1456c());
                        return;
                    }
                    return;
                }
                LinearLayout linearLayout3 = this.f34369L0;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(0);
                }
                LinearLayout linearLayout4 = this.f34375M0;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(0);
                }
                listView = this.f34349I;
                if (listView == null) {
                    return;
                }
            }
            listView.setVisibility(8);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // z7.g
    public void v0(String str) {
        try {
            StalkerLiveFavIdsSingleton.getInstance().setFavIdsList(null);
            this.f34498g4.i(this.f34554o4, this.f34561p4);
        } catch (Exception unused) {
        }
    }

    public final void v3() {
        try {
            SearchView searchView = this.f34357J0;
            if (searchView == null || this.f34430V1 == null) {
                return;
            }
            searchView.d0("", false);
            this.f34430V1.collapseActionView();
        } catch (Exception unused) {
        }
    }

    public final void v4(String str, boolean z9) {
        String str2;
        String str3;
        RecyclerView recyclerView;
        LinearLayoutManager linearLayoutManager;
        if (z9 && this.f34413S2.getVisibility() == 0) {
            this.f34413S2.startAnimation(this.f34353I3);
            this.f34413S2.setVisibility(8);
        }
        this.f34432V3 = str;
        if (str.equals("player")) {
            this.f34455Z2.startAnimation(this.f34420T3);
            this.f34455Z2.setVisibility(0);
        }
        String str4 = this.f34450Y3;
        if ((str4 != null && str4.equals("-1")) || (((str2 = this.f34450Y3) != null && str2.equals("0")) || ((str3 = this.f34450Y3) != null && str3.equals("-6")))) {
            String str5 = this.f34450Y3;
            this.f34365K2 = str5;
            this.f34371L2 = str5;
        }
        if (this.f34432V3.equals("player")) {
            q7.N n9 = new q7.N(this.f34486f, this.f34365K2, this.f34432V3, this.f34444X3, this.f34438W3);
            this.f34384N3 = n9;
            this.f34371L2 = this.f34365K2;
            this.f34602v3.setAdapter(n9);
            recyclerView = this.f34602v3;
            linearLayoutManager = this.f34408R3;
        } else {
            q7.N n10 = new q7.N(this.f34486f, this.f34365K2, this.f34432V3, this.f34444X3, this.f34438W3);
            this.f34378M3 = n10;
            this.f34371L2 = this.f34365K2;
            this.f34595u3.setAdapter(n10);
            recyclerView = this.f34595u3;
            linearLayoutManager = this.f34402Q3;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        j3(z9);
    }

    @Override // z7.g
    public void y0(String str) {
    }

    public void y3() {
        new Handler(Looper.getMainLooper()).post(new G());
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0131 A[Catch: Exception -> 0x0329, TryCatch #5 {Exception -> 0x0329, blocks: (B:3:0x0008, B:6:0x0016, B:8:0x001e, B:10:0x0024, B:12:0x0032, B:14:0x0038, B:16:0x0040, B:18:0x0046, B:20:0x004a, B:21:0x004d, B:23:0x0053, B:25:0x0057, B:27:0x005f, B:29:0x0065, B:30:0x0075, B:60:0x012b, B:62:0x0131, B:64:0x0139, B:103:0x01a9, B:105:0x01ad, B:106:0x01b0, B:108:0x01b4, B:146:0x0221, B:148:0x0225, B:149:0x0228, B:151:0x022c, B:190:0x029a, B:192:0x029e, B:193:0x02a1, B:195:0x02a5, B:235:0x0317, B:237:0x031b, B:238:0x031e, B:240:0x0322, B:232:0x0310, B:234:0x0314, B:219:0x02eb, B:221:0x02ef, B:206:0x02c6, B:208:0x02ca, B:187:0x0293, B:189:0x0297, B:175:0x0270, B:177:0x0274, B:162:0x024c, B:164:0x0250, B:143:0x021a, B:145:0x021e, B:130:0x01f6, B:132:0x01fa, B:118:0x01d3, B:120:0x01d7, B:100:0x01a2, B:102:0x01a6, B:87:0x017e, B:89:0x0182, B:75:0x015b, B:77:0x015f, B:241:0x0326, B:56:0x0113, B:50:0x00ea, B:43:0x00c4, B:37:0x009b, B:57:0x0119, B:58:0x011f, B:59:0x0125, B:223:0x02f4, B:225:0x02fa, B:227:0x02fe, B:228:0x0308, B:230:0x030c, B:166:0x0254, B:168:0x025a, B:170:0x025e, B:171:0x0268, B:173:0x026c, B:153:0x0230, B:155:0x0236, B:157:0x023a, B:158:0x0244, B:160:0x0248, B:210:0x02cf, B:212:0x02d5, B:214:0x02d9, B:215:0x02e3, B:217:0x02e7, B:44:0x00c9, B:46:0x00cf, B:47:0x00d7, B:48:0x00db, B:121:0x01da, B:123:0x01e0, B:125:0x01e4, B:126:0x01ee, B:128:0x01f2, B:178:0x0277, B:180:0x027d, B:182:0x0281, B:183:0x028b, B:185:0x028f, B:109:0x01b7, B:111:0x01bd, B:113:0x01c1, B:114:0x01cb, B:116:0x01cf, B:51:0x00fb, B:53:0x0101, B:54:0x010d, B:78:0x0162, B:80:0x0168, B:82:0x016c, B:83:0x0176, B:85:0x017a, B:66:0x013f, B:68:0x0145, B:70:0x0149, B:71:0x0153, B:73:0x0157, B:31:0x007a, B:33:0x0080, B:34:0x0088, B:35:0x008c, B:134:0x01fe, B:136:0x0204, B:138:0x0208, B:139:0x0212, B:141:0x0216, B:197:0x02aa, B:199:0x02b0, B:201:0x02b4, B:202:0x02be, B:204:0x02c2, B:38:0x00ac, B:40:0x00b2, B:41:0x00be, B:91:0x0186, B:93:0x018c, B:95:0x0190, B:96:0x019a, B:98:0x019e), top: B:258:0x0008, inners: #0, #1, #2, #3, #4, #6, #7, #8, #9, #10, #11, #12, #13, #14, #15, #16 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x015d -> B:265:0x0162). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x015f -> B:265:0x0162). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:56:0x0113
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z3(java.util.HashMap r12) {
        /*
            Method dump skipped, instruction units count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.z3(java.util.HashMap):void");
    }

    public void z4() {
        View view;
        if (this.f34443X2.getVisibility() == 8 && this.f34413S2.getVisibility() == 8) {
            ViewOnClickListenerC1464k viewOnClickListenerC1464k = null;
            this.f34337G1.removeCallbacksAndMessages(null);
            I4(this.f34335G);
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f34486f).equals("stalker_api")) {
                J4(String.valueOf(this.f34600v1));
            } else {
                this.f34566q2 = new R(this, this.f34328F, viewOnClickListenerC1464k).execute(new String[0]);
            }
            this.f34330F1.removeCallbacksAndMessages(null);
            this.f34413S2.startAnimation(this.f34346H3);
            this.f34581s3.startAnimation(this.f34346H3);
            this.f34567q3.startAnimation(this.f34346H3);
            Boolean bool = AbstractC2237a.f44475V0;
            if (bool.booleanValue()) {
                this.f34520j5.startAnimation(this.f34346H3);
            }
            this.f34574r3.startAnimation(this.f34346H3);
            this.f34581s3.setVisibility(0);
            this.f34567q3.setVisibility(0);
            if (bool.booleanValue()) {
                this.f34520j5.setVisibility(0);
            } else {
                this.f34520j5.setVisibility(4);
            }
            this.f34574r3.setVisibility(0);
            this.f34413S2.setVisibility(0);
            try {
                View view2 = this.f34507i;
                if (view2 == null || view2.getVisibility() != 0) {
                    View view3 = this.f34500h;
                    if (view3 == null || view3.getVisibility() != 0) {
                        return;
                    } else {
                        view = this.f34500h;
                    }
                } else {
                    view = this.f34507i;
                }
                view.requestFocus();
            } catch (Exception unused) {
            }
        }
    }
}
