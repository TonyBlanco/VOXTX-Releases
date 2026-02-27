package com.nst.iptvsmarterstvbox.view.ijkplayer.activities;

import D.AbstractC0519b;
import P.AbstractC0980w;
import a7.f;
import a7.h;
import android.R;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.PendingIntent;
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
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Rational;
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
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.mediarouter.app.MediaRouteButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b7.AbstractC1232b;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.material.appbar.AppBarLayout;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.FreeTrailActivity;
import com.nst.iptvsmarterstvbox.miscelleneious.MyApplication;
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
import com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity;
import com.nst.iptvsmarterstvbox.view.activity.PlayExternalPlayerActivity;
import com.nst.iptvsmarterstvbox.view.activity.SettingsActivity;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky;
import i7.AbstractC1902a;
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
import n4.C2281m;
import n7.e;
import o4.C2325b;
import o4.C2328e;
import o4.InterfaceC2329f;
import o4.InterfaceC2347y;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.protocol.HttpRequestExecutor;
import org.chromium.net.UrlRequest;
import org.joda.time.LocalDateTime;
import org.json.JSONObject;
import p0.C2386a;
import p7.AbstractC2496t;
import p7.AbstractC2498u;
import p7.AbstractC2500v;
import q7.C2635t;
import q7.N;
import q7.O;
import q7.T;
import q7.Z;
import q7.m0;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import u7.C2858a;
import w7.AbstractC2941e;
import w7.C2939c;
import x4.C2957a;
import x7.C2966a;
import z7.g;

/* JADX INFO: loaded from: classes4.dex */
public class NSTIJKPlayerSkyActivity extends b implements SurfaceHolder.Callback, View.OnClickListener, z7.j, g, CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: W5, reason: collision with root package name */
    public static SharedPreferences f35203W5;

    /* JADX INFO: renamed from: X5, reason: collision with root package name */
    public static SharedPreferences f35204X5;

    /* JADX INFO: renamed from: Y5, reason: collision with root package name */
    public static boolean f35205Y5;

    /* JADX INFO: renamed from: Z5, reason: collision with root package name */
    public static String f35206Z5;

    /* JADX INFO: renamed from: a6, reason: collision with root package name */
    public static String f35207a6;

    /* JADX INFO: renamed from: b6, reason: collision with root package name */
    public static final int[] f35208b6 = {0, 1, 2, 3, 4, 5};

    /* JADX INFO: renamed from: c6, reason: collision with root package name */
    public static boolean f35209c6 = false;

    /* JADX INFO: renamed from: d6, reason: collision with root package name */
    public static ProgressBar f35210d6;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public ArrayList f35212A0;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public String f35213A1;

    /* JADX INFO: renamed from: A2, reason: collision with root package name */
    public int f35214A2;

    /* JADX INFO: renamed from: A3, reason: collision with root package name */
    public LinearLayout f35215A3;

    /* JADX INFO: renamed from: A4, reason: collision with root package name */
    public int f35216A4;

    /* JADX INFO: renamed from: A5, reason: collision with root package name */
    public LinearLayout f35217A5;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public ArrayList f35219B0;

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public int f35220B1;

    /* JADX INFO: renamed from: B2, reason: collision with root package name */
    public boolean f35221B2;

    /* JADX INFO: renamed from: B3, reason: collision with root package name */
    public LinearLayout f35222B3;

    /* JADX INFO: renamed from: B4, reason: collision with root package name */
    public List f35223B4;

    /* JADX INFO: renamed from: B5, reason: collision with root package name */
    public LinearLayout f35224B5;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public ArrayList f35226C0;

    /* JADX INFO: renamed from: C2, reason: collision with root package name */
    public int f35228C2;

    /* JADX INFO: renamed from: C3, reason: collision with root package name */
    public ImageView f35229C3;

    /* JADX INFO: renamed from: C4, reason: collision with root package name */
    public e f35230C4;

    /* JADX INFO: renamed from: C5, reason: collision with root package name */
    public LinearLayout f35231C5;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f35232D;

    /* JADX INFO: renamed from: D2, reason: collision with root package name */
    public int f35235D2;

    /* JADX INFO: renamed from: D3, reason: collision with root package name */
    public ImageView f35236D3;

    /* JADX INFO: renamed from: D4, reason: collision with root package name */
    public int f35237D4;

    /* JADX INFO: renamed from: D5, reason: collision with root package name */
    public LinearLayout f35238D5;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public ArrayList f35240E0;

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public DatabaseHandler f35241E1;

    /* JADX INFO: renamed from: E2, reason: collision with root package name */
    public SharedPreferences f35242E2;

    /* JADX INFO: renamed from: E3, reason: collision with root package name */
    public ImageView f35243E3;

    /* JADX INFO: renamed from: E4, reason: collision with root package name */
    public PictureInPictureParams.Builder f35244E4;

    /* JADX INFO: renamed from: E5, reason: collision with root package name */
    public LinearLayout f35245E5;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f35246F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public ArrayList f35247F0;

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public SharedPreferences.Editor f35248F1;

    /* JADX INFO: renamed from: F2, reason: collision with root package name */
    public Boolean f35249F2;

    /* JADX INFO: renamed from: F3, reason: collision with root package name */
    public ImageView f35250F3;

    /* JADX INFO: renamed from: F4, reason: collision with root package name */
    public BroadcastReceiver f35251F4;

    /* JADX INFO: renamed from: F5, reason: collision with root package name */
    public RelativeLayout f35252F5;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public String f35253G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public SharedPreferences f35254G0;

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    public SharedPreferences.Editor f35255G1;

    /* JADX INFO: renamed from: G2, reason: collision with root package name */
    public Boolean f35256G2;

    /* JADX INFO: renamed from: G3, reason: collision with root package name */
    public ImageView f35257G3;

    /* JADX INFO: renamed from: G4, reason: collision with root package name */
    public String f35258G4;

    /* JADX INFO: renamed from: G5, reason: collision with root package name */
    public String f35259G5;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f35260H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public SharedPreferences.Editor f35261H0;

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    public TextView f35262H1;

    /* JADX INFO: renamed from: H2, reason: collision with root package name */
    public Boolean f35263H2;

    /* JADX INFO: renamed from: H3, reason: collision with root package name */
    public LinearLayout f35264H3;

    /* JADX INFO: renamed from: H4, reason: collision with root package name */
    public String f35265H4;

    /* JADX INFO: renamed from: H5, reason: collision with root package name */
    public String f35266H5;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public RelativeLayout f35267I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public ArrayList f35268I0;

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    public String f35269I1;

    /* JADX INFO: renamed from: I2, reason: collision with root package name */
    public Boolean f35270I2;

    /* JADX INFO: renamed from: I3, reason: collision with root package name */
    public LinearLayout f35271I3;

    /* JADX INFO: renamed from: I4, reason: collision with root package name */
    public String f35272I4;

    /* JADX INFO: renamed from: I5, reason: collision with root package name */
    public String f35273I5;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ListView f35274J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public ArrayList f35275J0;

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    public TextView f35276J1;

    /* JADX INFO: renamed from: J2, reason: collision with root package name */
    public Boolean f35277J2;

    /* JADX INFO: renamed from: J3, reason: collision with root package name */
    public LinearLayout f35278J3;

    /* JADX INFO: renamed from: J4, reason: collision with root package name */
    public boolean f35279J4;

    /* JADX INFO: renamed from: J5, reason: collision with root package name */
    public String f35280J5;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ListView f35281K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public RecyclerView f35282K0;

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    public Handler f35283K1;

    /* JADX INFO: renamed from: K2, reason: collision with root package name */
    public Boolean f35284K2;

    /* JADX INFO: renamed from: K3, reason: collision with root package name */
    public TextView f35285K3;

    /* JADX INFO: renamed from: K4, reason: collision with root package name */
    public String f35286K4;

    /* JADX INFO: renamed from: K5, reason: collision with root package name */
    public String f35287K5;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public ProgressBar f35289L0;

    /* JADX INFO: renamed from: L1, reason: collision with root package name */
    public Handler f35290L1;

    /* JADX INFO: renamed from: L2, reason: collision with root package name */
    public C2858a f35291L2;

    /* JADX INFO: renamed from: L3, reason: collision with root package name */
    public TextView f35292L3;

    /* JADX INFO: renamed from: L4, reason: collision with root package name */
    public String f35293L4;

    /* JADX INFO: renamed from: L5, reason: collision with root package name */
    public String f35294L5;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ArrayList f35295M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public Toolbar f35296M0;

    /* JADX INFO: renamed from: M1, reason: collision with root package name */
    public Handler f35297M1;

    /* JADX INFO: renamed from: M2, reason: collision with root package name */
    public Handler f35298M2;

    /* JADX INFO: renamed from: M3, reason: collision with root package name */
    public TextView f35299M3;

    /* JADX INFO: renamed from: M4, reason: collision with root package name */
    public SharedPreferences f35300M4;

    /* JADX INFO: renamed from: M5, reason: collision with root package name */
    public String f35301M5;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ArrayList f35302N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public SearchView f35303N0;

    /* JADX INFO: renamed from: N1, reason: collision with root package name */
    public Handler f35304N1;

    /* JADX INFO: renamed from: N2, reason: collision with root package name */
    public InterfaceC2347y f35305N2;

    /* JADX INFO: renamed from: N3, reason: collision with root package name */
    public TextView f35306N3;

    /* JADX INFO: renamed from: N4, reason: collision with root package name */
    public boolean f35307N4;

    /* JADX INFO: renamed from: N5, reason: collision with root package name */
    public String f35308N5;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public TextView f35310O0;

    /* JADX INFO: renamed from: O1, reason: collision with root package name */
    public Handler f35311O1;

    /* JADX INFO: renamed from: O2, reason: collision with root package name */
    public C2328e f35312O2;

    /* JADX INFO: renamed from: O3, reason: collision with root package name */
    public RecyclerView f35313O3;

    /* JADX INFO: renamed from: O4, reason: collision with root package name */
    public MultiUserDBHandler f35314O4;

    /* JADX INFO: renamed from: O5, reason: collision with root package name */
    public String f35315O5;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public LinearLayout f35317P0;

    /* JADX INFO: renamed from: P1, reason: collision with root package name */
    public SharedPreferences.Editor f35318P1;

    /* JADX INFO: renamed from: P2, reason: collision with root package name */
    public C2325b f35319P2;

    /* JADX INFO: renamed from: P3, reason: collision with root package name */
    public LinearLayout f35320P3;

    /* JADX INFO: renamed from: P4, reason: collision with root package name */
    public String f35321P4;

    /* JADX INFO: renamed from: P5, reason: collision with root package name */
    public List f35322P5;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public String f35323Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public AppBarLayout f35324Q0;

    /* JADX INFO: renamed from: Q1, reason: collision with root package name */
    public SharedPreferences.Editor f35325Q1;

    /* JADX INFO: renamed from: Q2, reason: collision with root package name */
    public InterfaceC2329f f35326Q2;

    /* JADX INFO: renamed from: Q3, reason: collision with root package name */
    public LinearLayout f35327Q3;

    /* JADX INFO: renamed from: Q4, reason: collision with root package name */
    public Thread f35328Q4;

    /* JADX INFO: renamed from: Q5, reason: collision with root package name */
    public JsonArray f35329Q5;

    /* JADX INFO: renamed from: R1, reason: collision with root package name */
    public SharedPreferences.Editor f35332R1;

    /* JADX INFO: renamed from: R2, reason: collision with root package name */
    public Handler f35333R2;

    /* JADX INFO: renamed from: R3, reason: collision with root package name */
    public LinearLayout f35334R3;

    /* JADX INFO: renamed from: R4, reason: collision with root package name */
    public RelativeLayout f35335R4;

    /* JADX INFO: renamed from: R5, reason: collision with root package name */
    public String f35336R5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public LiveStreamDBHandler f35337S;

    /* JADX INFO: renamed from: S1, reason: collision with root package name */
    public TextView f35339S1;

    /* JADX INFO: renamed from: S2, reason: collision with root package name */
    public ArrayList f35340S2;

    /* JADX INFO: renamed from: S3, reason: collision with root package name */
    public LinearLayout f35341S3;

    /* JADX INFO: renamed from: S4, reason: collision with root package name */
    public RelativeLayout f35342S4;

    /* JADX INFO: renamed from: S5, reason: collision with root package name */
    public Thread f35343S5;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public SharedPreferences f35344T;

    /* JADX INFO: renamed from: T2, reason: collision with root package name */
    public ImageView f35347T2;

    /* JADX INFO: renamed from: T3, reason: collision with root package name */
    public TextView f35348T3;

    /* JADX INFO: renamed from: T4, reason: collision with root package name */
    public RelativeLayout f35349T4;

    /* JADX INFO: renamed from: T5, reason: collision with root package name */
    public BroadcastReceiver f35350T5;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public T f35351U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public String f35352U0;

    /* JADX INFO: renamed from: U2, reason: collision with root package name */
    public int f35354U2;

    /* JADX INFO: renamed from: U3, reason: collision with root package name */
    public TextView f35355U3;

    /* JADX INFO: renamed from: U4, reason: collision with root package name */
    public TextView f35356U4;

    /* JADX INFO: renamed from: U5, reason: collision with root package name */
    public final ArrayList f35357U5;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public SharedPreferences f35358V;

    /* JADX INFO: renamed from: V1, reason: collision with root package name */
    public LinearLayout f35360V1;

    /* JADX INFO: renamed from: V2, reason: collision with root package name */
    public String f35361V2;

    /* JADX INFO: renamed from: V3, reason: collision with root package name */
    public TextView f35362V3;

    /* JADX INFO: renamed from: V4, reason: collision with root package name */
    public CheckBox f35363V4;

    /* JADX INFO: renamed from: V5, reason: collision with root package name */
    public NSTIJKPlayerSky.w f35364V5;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public SharedPreferences f35365W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public RelativeLayout f35366W0;

    /* JADX INFO: renamed from: W1, reason: collision with root package name */
    public TextView f35367W1;

    /* JADX INFO: renamed from: W2, reason: collision with root package name */
    public String f35368W2;

    /* JADX INFO: renamed from: W3, reason: collision with root package name */
    public MediaRouteButton f35369W3;

    /* JADX INFO: renamed from: W4, reason: collision with root package name */
    public CheckBox f35370W4;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public SharedPreferences f35371X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public RelativeLayout f35372X0;

    /* JADX INFO: renamed from: X2, reason: collision with root package name */
    public Boolean f35374X2;

    /* JADX INFO: renamed from: X3, reason: collision with root package name */
    public ImageView f35375X3;

    /* JADX INFO: renamed from: X4, reason: collision with root package name */
    public CheckBox f35376X4;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public SharedPreferences f35377Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public LinearLayout f35378Y0;

    /* JADX INFO: renamed from: Y1, reason: collision with root package name */
    public Boolean f35379Y1;

    /* JADX INFO: renamed from: Y2, reason: collision with root package name */
    public RadioGroup f35380Y2;

    /* JADX INFO: renamed from: Y3, reason: collision with root package name */
    public ImageView f35381Y3;

    /* JADX INFO: renamed from: Y4, reason: collision with root package name */
    public CheckBox f35382Y4;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public SharedPreferences f35383Z;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public LinearLayout f35384Z0;

    /* JADX INFO: renamed from: Z1, reason: collision with root package name */
    public Boolean f35385Z1;

    /* JADX INFO: renamed from: Z2, reason: collision with root package name */
    public RadioGroup f35386Z2;

    /* JADX INFO: renamed from: Z3, reason: collision with root package name */
    public LinearLayout f35387Z3;

    /* JADX INFO: renamed from: Z4, reason: collision with root package name */
    public CheckBox f35388Z4;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public RelativeLayout f35389a1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public Menu f35390a2;

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public RadioGroup f35391a3;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public LinearLayout f35392a4;

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    public CheckBox f35393a5;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public RelativeLayout f35394b1;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public MenuItem f35395b2;

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    public TextView f35396b3;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public LinearLayout f35397b4;

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    public CheckBox f35398b5;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public RelativeLayout f35399c1;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public DateFormat f35400c2;

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    public TextView f35401c3;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    public Animation f35402c4;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public CheckBox f35403c5;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f35404d;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public RelativeLayout f35405d1;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public String f35406d2;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public TextView f35407d3;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    public Animation f35408d4;

    /* JADX INFO: renamed from: d5, reason: collision with root package name */
    public CheckBox f35409d5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f35410e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public SharedPreferences f35411e0;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public String f35413e2;

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    public TextView f35414e3;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    public Animation f35415e4;

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    public RelativeLayout f35416e5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f35417f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public SharedPreferences f35418f0;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public String f35420f2;

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    public TextView f35421f3;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    public Animation f35422f4;

    /* JADX INFO: renamed from: f5, reason: collision with root package name */
    public CheckBox f35423f5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f35424g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public SharedPreferences f35425g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public TextView f35426g1;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public SimpleDateFormat f35427g2;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public TextView f35428g3;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public Animation f35429g4;

    /* JADX INFO: renamed from: g5, reason: collision with root package name */
    public CheckBox f35430g5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f35431h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public SimpleDateFormat f35432h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public TextView f35433h1;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public NSTIJKPlayerSky f35434h2;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public FrameLayout f35435h3;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public Animation f35436h4;

    /* JADX INFO: renamed from: h5, reason: collision with root package name */
    public CheckBox f35437h5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f35438i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public String f35439i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public TextView f35440i1;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public Date f35441i2;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public SeekBar f35442i3;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public Animation f35443i4;

    /* JADX INFO: renamed from: i5, reason: collision with root package name */
    public CheckBox f35444i5;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f35445j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public RelativeLayout f35446j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public TextView f35447j1;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public String f35448j2;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public SeekBar f35449j3;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public Animation f35450j4;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public TextView f35451j5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f35452k;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public String f35454k1;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public Boolean f35455k2;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public LinearLayout f35456k3;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public Animation f35457k4;

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    public LinearLayout f35458k5;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f35459l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public TextView f35460l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public TextView f35461l1;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public a f35462l2;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public LinearLayout f35463l3;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    public String f35464l4;

    /* JADX INFO: renamed from: l5, reason: collision with root package name */
    public TextView f35465l5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f35466m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public AppCompatImageView f35467m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public TextView f35468m1;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public String f35469m2;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public LinearLayout f35470m3;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    public N f35471m4;

    /* JADX INFO: renamed from: m5, reason: collision with root package name */
    public TextView f35472m5;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public AppCompatImageView f35474n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public TextView f35475n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public Boolean f35476n2;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public LinearLayout f35477n3;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    public O f35478n4;

    /* JADX INFO: renamed from: n5, reason: collision with root package name */
    public TextView f35479n5;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinearLayout f35480o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public ArrayList f35481o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public TextView f35482o1;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public D7.b f35483o2;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public LinearLayout f35484o3;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    public LinearLayoutManager f35485o4;

    /* JADX INFO: renamed from: o5, reason: collision with root package name */
    public TextView f35486o5;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f35487p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ArrayList f35488p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public TextView f35489p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public String f35490p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public RelativeLayout f35491p3;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    public String f35492p4;

    /* JADX INFO: renamed from: p5, reason: collision with root package name */
    public TextView f35493p5;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f35494q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ArrayList f35495q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public TextView f35496q1;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public int f35497q2;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public RelativeLayout f35498q3;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    public String f35499q4;

    /* JADX INFO: renamed from: q5, reason: collision with root package name */
    public TextView f35500q5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f35501r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ArrayList f35502r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public TextView f35503r1;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public String f35504r2;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public ImageView f35505r3;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    public int f35506r4;

    /* JADX INFO: renamed from: r5, reason: collision with root package name */
    public TextView f35507r5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f35508s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ArrayList f35509s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public TextView f35510s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public int f35511s2;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public ImageView f35512s3;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    public Animation f35513s4;

    /* JADX INFO: renamed from: s5, reason: collision with root package name */
    public TextView f35514s5;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f35515t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ArrayList f35516t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public LinearLayout f35517t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public String f35518t2;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public ImageView f35519t3;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    public Animation f35520t4;

    /* JADX INFO: renamed from: t5, reason: collision with root package name */
    public EditText f35521t5;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f35522u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ArrayList f35523u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public String f35524u1;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public String f35525u2;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public ImageView f35526u3;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    public boolean f35527u4;

    /* JADX INFO: renamed from: u5, reason: collision with root package name */
    public LinearLayout f35528u5;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinearLayout f35529v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public ArrayList f35530v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public LinearLayout f35531v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public Boolean f35532v2;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public ImageView f35533v3;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    public boolean f35534v4;

    /* JADX INFO: renamed from: v5, reason: collision with root package name */
    public LinearLayout f35535v5;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ProgressBar f35536w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ArrayList f35537w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public LinearLayout f35538w1;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public AsyncTask f35539w2;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public ImageView f35540w3;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    public n7.g f35541w4;

    /* JADX INFO: renamed from: w5, reason: collision with root package name */
    public LinearLayout f35542w5;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ProgressBar f35543x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ArrayList f35544x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public LinearLayout f35545x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public AsyncTask f35546x2;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public LinearLayout f35547x3;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public String f35548x4;

    /* JADX INFO: renamed from: x5, reason: collision with root package name */
    public LinearLayout f35549x5;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public LinearLayout f35550y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ArrayList f35551y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public LinearLayout f35552y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public AsyncTask f35553y2;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public LinearLayout f35554y3;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    public String f35555y4;

    /* JADX INFO: renamed from: y5, reason: collision with root package name */
    public ImageView f35556y5;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public ArrayList f35558z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public LinearLayout f35559z1;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public boolean f35560z2;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public LinearLayout f35561z3;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    public int f35562z4;

    /* JADX INFO: renamed from: z5, reason: collision with root package name */
    public RelativeLayout f35563z5;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f35473n = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f35557z = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f35211A = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f35218B = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f35225C = false;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f35239E = "";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ArrayList f35288L = new ArrayList();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f35309O = true;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public long f35316P = 2500;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f35330R = true;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f35453k0 = 0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public ArrayList f35233D0 = new ArrayList();

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public boolean f35331R0 = true;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public boolean f35338S0 = false;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public boolean f35345T0 = false;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public boolean f35359V0 = true;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public String f35412e1 = "";

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public String f35419f1 = "";

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public String f35227C1 = "";

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    public String f35234D1 = "";

    /* JADX INFO: renamed from: T1, reason: collision with root package name */
    public int f35346T1 = 0;

    /* JADX INFO: renamed from: U1, reason: collision with root package name */
    public StringBuilder f35353U1 = new StringBuilder();

    /* JADX INFO: renamed from: X1, reason: collision with root package name */
    public int f35373X1 = -1;

    public class A implements View.OnClickListener {
        public A() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerSkyActivity.this.onBackPressed();
        }
    }

    public class B implements Runnable {
        public B() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    NSTIJKPlayerSkyActivity.this.c3();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class C extends AsyncTask {
        public C() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(NSTIJKPlayerSkyActivity.this.z3());
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (NSTIJKPlayerSkyActivity.this.f35434h2 != null) {
                NSTIJKPlayerSkyActivity.this.f35434h2.setEPGHandler(NSTIJKPlayerSkyActivity.this.f35304N1);
                NSTIJKPlayerSkyActivity.this.f35434h2.setContext(NSTIJKPlayerSkyActivity.this.f35404d);
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public class D implements Runnable {
        public D() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    if (SharepreferenceDBHandler.getMaintanceModeState(NSTIJKPlayerSkyActivity.this.f35404d)) {
                        NSTIJKPlayerSkyActivity.this.f35404d.startActivity(new Intent(NSTIJKPlayerSkyActivity.this.f35404d, (Class<?>) MaintanencePannelActivity.class));
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

    public class E extends AsyncTask {
        public E() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r0 = 0
                r6 = r6[r0]     // Catch: java.lang.Exception -> L5c
                int r1 = r6.hashCode()     // Catch: java.lang.Exception -> L5c
                r2 = 2
                r3 = 1
                r4 = 3
                switch(r1) {
                    case -74797390: goto L2b;
                    case 47612238: goto L21;
                    case 301138327: goto L17;
                    case 613425326: goto Le;
                    default: goto Ld;
                }     // Catch: java.lang.Exception -> L5c
            Ld:
                goto L35
            Le:
                java.lang.String r1 = "all_channels"
                boolean r6 = r6.equals(r1)     // Catch: java.lang.Exception -> L5c
                if (r6 == 0) goto L35
                goto L36
            L17:
                java.lang.String r0 = "recently_watched"
                boolean r6 = r6.equals(r0)     // Catch: java.lang.Exception -> L5c
                if (r6 == 0) goto L35
                r0 = 3
                goto L36
            L21:
                java.lang.String r0 = "all_channels_with_cat"
                boolean r6 = r6.equals(r0)     // Catch: java.lang.Exception -> L5c
                if (r6 == 0) goto L35
                r0 = 1
                goto L36
            L2b:
                java.lang.String r0 = "get_fav"
                boolean r6 = r6.equals(r0)     // Catch: java.lang.Exception -> L5c
                if (r6 == 0) goto L35
                r0 = 2
                goto L36
            L35:
                r0 = -1
            L36:
                if (r0 == 0) goto L55
                if (r0 == r3) goto L4e
                if (r0 == r2) goto L47
                if (r0 == r4) goto L40
                r6 = 0
                return r6
            L40:
                com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity r6 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.this     // Catch: java.lang.Exception -> L5c
                java.lang.String r6 = r6.S2()     // Catch: java.lang.Exception -> L5c
                return r6
            L47:
                com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity r6 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.this     // Catch: java.lang.Exception -> L5c
                java.lang.String r6 = r6.j3()     // Catch: java.lang.Exception -> L5c
                return r6
            L4e:
                com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity r6 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.this     // Catch: java.lang.Exception -> L5c
                java.lang.String r6 = r6.N2()     // Catch: java.lang.Exception -> L5c
                return r6
            L55:
                com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity r6 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.this     // Catch: java.lang.Exception -> L5c
                java.lang.String r6 = r6.L2()     // Catch: java.lang.Exception -> L5c
                return r6
            L5c:
                java.lang.String r6 = "error"
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.E.doInBackground(java.lang.String[]):java.lang.String");
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (NSTIJKPlayerSkyActivity.this.f35537w0 != null) {
                    if (!NSTIJKPlayerSkyActivity.this.f35385Z1.booleanValue()) {
                        NSTIJKPlayerSkyActivity.this.f35385Z1 = Boolean.TRUE;
                        if (NSTIJKPlayerSkyActivity.this.f35537w0.size() != 0) {
                            if (NSTIJKPlayerSkyActivity.this.f35558z0 != null) {
                                NSTIJKPlayerSkyActivity.this.f35558z0.clear();
                                NSTIJKPlayerSkyActivity.this.f35558z0.addAll(NSTIJKPlayerSkyActivity.this.f35537w0);
                            }
                            if (SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyActivity.this.f35404d).equals("stalker_api")) {
                                try {
                                    m7.w.N0(NSTIJKPlayerSkyActivity.this.f35404d);
                                    String stalkerToken = SharepreferenceDBHandler.getStalkerToken(NSTIJKPlayerSkyActivity.this.f35404d);
                                    String loggedInMacAddress = SharepreferenceDBHandler.getLoggedInMacAddress(NSTIJKPlayerSkyActivity.this.f35404d);
                                    if (NSTIJKPlayerSkyActivity.this.f35537w0 != null && NSTIJKPlayerSkyActivity.this.f35537w0.size() > 0 && NSTIJKPlayerSkyActivity.this.f35346T1 < NSTIJKPlayerSkyActivity.this.f35537w0.size()) {
                                        NSTIJKPlayerSkyActivity.this.f35541w4.c(loggedInMacAddress, stalkerToken, ((LiveStreamsDBModel) NSTIJKPlayerSkyActivity.this.f35537w0.get(NSTIJKPlayerSkyActivity.this.f35346T1)).getCmd(), "", null, "itv", 0, 0, "", "", "", "", "", "playFirstTime", 0, "", "");
                                    }
                                } catch (Exception e9) {
                                    e9.printStackTrace();
                                }
                            } else {
                                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                                nSTIJKPlayerSkyActivity.M3(nSTIJKPlayerSkyActivity.f35537w0);
                            }
                        } else {
                            AbstractC2237a.f44480Y = Boolean.FALSE;
                            NSTIJKPlayerSkyActivity.this.I3();
                            NSTIJKPlayerSkyActivity.this.f35434h2.setVisibility(8);
                            NSTIJKPlayerSkyActivity.this.f35480o.setVisibility(0);
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity2 = NSTIJKPlayerSkyActivity.this;
                            nSTIJKPlayerSkyActivity2.f35487p.setText(nSTIJKPlayerSkyActivity2.getResources().getString(a7.j.f13261g4));
                        }
                    }
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity3 = NSTIJKPlayerSkyActivity.this;
                    if (nSTIJKPlayerSkyActivity3.f35338S0 && nSTIJKPlayerSkyActivity3.f35345T0 && !nSTIJKPlayerSkyActivity3.f35352U0.equals("")) {
                        NSTIJKPlayerSkyActivity.this.f35214A2 = 0;
                        try {
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity4 = NSTIJKPlayerSkyActivity.this;
                            nSTIJKPlayerSkyActivity4.f35214A2 = nSTIJKPlayerSkyActivity4.m3(nSTIJKPlayerSkyActivity4.f35537w0, m7.w.r0(NSTIJKPlayerSkyActivity.this.f35352U0));
                        } catch (NumberFormatException | Exception e10) {
                            e10.printStackTrace();
                        }
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity5 = NSTIJKPlayerSkyActivity.this;
                        nSTIJKPlayerSkyActivity5.f35338S0 = false;
                        nSTIJKPlayerSkyActivity5.f35345T0 = false;
                    }
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity6 = NSTIJKPlayerSkyActivity.this;
                    nSTIJKPlayerSkyActivity6.S3(nSTIJKPlayerSkyActivity6.f35537w0);
                }
                NSTIJKPlayerSkyActivity.this.v3();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            TextView textView;
            String string;
            TextView textView2;
            super.onPreExecute();
            try {
                NSTIJKPlayerSkyActivity.this.d4();
                TextView textView3 = NSTIJKPlayerSkyActivity.this.f35310O0;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                if (nSTIJKPlayerSkyActivity.f35460l0 != null) {
                    if (!nSTIJKPlayerSkyActivity.f35412e1.equals("") && NSTIJKPlayerSkyActivity.this.f35412e1.equals("0")) {
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity2 = NSTIJKPlayerSkyActivity.this;
                        nSTIJKPlayerSkyActivity2.f35460l0.setText(nSTIJKPlayerSkyActivity2.f35404d.getResources().getString(a7.j.f13426x));
                        textView2 = NSTIJKPlayerSkyActivity.this.f35460l0;
                    } else if (!NSTIJKPlayerSkyActivity.this.f35412e1.equals("") && NSTIJKPlayerSkyActivity.this.f35412e1.equals("-1")) {
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity3 = NSTIJKPlayerSkyActivity.this;
                        nSTIJKPlayerSkyActivity3.f35460l0.setText(nSTIJKPlayerSkyActivity3.f35404d.getResources().getString(a7.j.f13209b2));
                        textView2 = NSTIJKPlayerSkyActivity.this.f35460l0;
                    } else if (NSTIJKPlayerSkyActivity.this.f35412e1.equals("") || !NSTIJKPlayerSkyActivity.this.f35412e1.equals("-6")) {
                        if (NSTIJKPlayerSkyActivity.this.f35419f1.equals("")) {
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity4 = NSTIJKPlayerSkyActivity.this;
                            textView = nSTIJKPlayerSkyActivity4.f35460l0;
                            string = nSTIJKPlayerSkyActivity4.getResources().getString(a7.j.f13215b8);
                        } else {
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity5 = NSTIJKPlayerSkyActivity.this;
                            textView = nSTIJKPlayerSkyActivity5.f35460l0;
                            string = nSTIJKPlayerSkyActivity5.f35419f1;
                        }
                        textView.setText(string);
                        textView2 = NSTIJKPlayerSkyActivity.this.f35460l0;
                    } else {
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity6 = NSTIJKPlayerSkyActivity.this;
                        nSTIJKPlayerSkyActivity6.f35460l0.setText(nSTIJKPlayerSkyActivity6.f35404d.getResources().getString(a7.j.f13148U5));
                        textView2 = NSTIJKPlayerSkyActivity.this.f35460l0;
                    }
                    textView2.setSelected(true);
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public class F extends AsyncTask {
        public F() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                return NSTIJKPlayerSkyActivity.this.f35368W2.equals("-1") ? NSTIJKPlayerSkyActivity.this.k3() : NSTIJKPlayerSkyActivity.this.f35368W2.equals("-6") ? NSTIJKPlayerSkyActivity.this.S2() : NSTIJKPlayerSkyActivity.this.P2();
            } catch (Exception unused) {
                return "error";
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (NSTIJKPlayerSkyActivity.this.f35544x0 != null) {
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                    nSTIJKPlayerSkyActivity.T3(nSTIJKPlayerSkyActivity.f35544x0);
                }
                NSTIJKPlayerSkyActivity.this.u3();
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            NSTIJKPlayerSkyActivity.this.c4();
            LinearLayout linearLayout = NSTIJKPlayerSkyActivity.this.f35317P0;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            if (NSTIJKPlayerSkyActivity.this.f35281K != null) {
                NSTIJKPlayerSkyActivity.this.f35281K.setVisibility(8);
            }
        }
    }

    public class G implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f35570a;

        public G(View view) {
            this.f35570a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f35570a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f35570a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f35570a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:85:0x01b1  */
        @Override // android.view.View.OnFocusChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onFocusChange(android.view.View r29, boolean r30) {
            /*
                Method dump skipped, instruction units count: 1912
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.G.onFocusChange(android.view.View, boolean):void");
        }
    }

    public class H extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f35572a;

        public H(String str) {
            this.f35572a = str;
        }

        public /* synthetic */ H(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity, String str, k kVar) {
            this(str);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HashMap doInBackground(String... strArr) {
            try {
                return NSTIJKPlayerSkyActivity.this.Y3(this.f35572a);
            } catch (Exception unused) {
                return new HashMap();
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(HashMap map) {
            super.onPostExecute(map);
            NSTIJKPlayerSkyActivity.this.d3(map);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            NSTIJKPlayerSkyActivity.this.e3();
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$a, reason: case insensitive filesystem */
    public class ViewOnClickListenerC1476a implements View.OnClickListener {
        public ViewOnClickListenerC1476a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                NSTIJKPlayerSkyActivity.this.f35455k2 = Boolean.TRUE;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", NSTIJKPlayerSkyActivity.this.getPackageName(), null));
                NSTIJKPlayerSkyActivity.this.startActivityForResult(intent, 101);
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                Toast.makeText(nSTIJKPlayerSkyActivity, nSTIJKPlayerSkyActivity.f35404d.getResources().getString(a7.j.f13339o2), 1).show();
            } catch (Exception unused) {
            }
            NSTIJKPlayerSkyActivity.this.f35462l2.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$b, reason: case insensitive filesystem */
    public class ViewOnClickListenerC1477b implements View.OnClickListener {
        public ViewOnClickListenerC1477b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerSkyActivity.this.f35462l2.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$c, reason: case insensitive filesystem */
    public class RunnableC1478c implements Runnable {
        public RunnableC1478c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = m7.w.R(NSTIJKPlayerSkyActivity.this.f35404d);
                String strA = m7.w.A(string);
                TextView textView = NSTIJKPlayerSkyActivity.this.f35276J1;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = NSTIJKPlayerSkyActivity.this.f35262H1;
                if (textView2 != null) {
                    textView2.setText(strA);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$d, reason: case insensitive filesystem */
    public class C1479d implements AdapterView.OnItemClickListener {
        public C1479d() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i9, long j9) {
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
            NSTIJKPlayerSkyActivity.this.f35216A4 = i9;
            if (!SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyActivity.this.f35404d).equals("stalker_api")) {
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                nSTIJKPlayerSkyActivity.L3(nSTIJKPlayerSkyActivity.f35216A4, NSTIJKPlayerSkyActivity.this.f35302N);
                return;
            }
            try {
                String stalkerToken = SharepreferenceDBHandler.getStalkerToken(NSTIJKPlayerSkyActivity.this.f35404d);
                String loggedInMacAddress = SharepreferenceDBHandler.getLoggedInMacAddress(NSTIJKPlayerSkyActivity.this.f35404d);
                ArrayList arrayListG = NSTIJKPlayerSkyActivity.this.f35478n4.g();
                if (arrayListG != null && arrayListG.size() > 0) {
                    cmd = ((LiveStreamsDBModel) arrayListG.get(NSTIJKPlayerSkyActivity.this.f35216A4)).getCmd();
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity2 = NSTIJKPlayerSkyActivity.this;
                    if (nSTIJKPlayerSkyActivity2.f35220B1 == m7.w.q0(((LiveStreamsDBModel) arrayListG.get(nSTIJKPlayerSkyActivity2.f35216A4)).getStreamId())) {
                        NSTIJKPlayerSkyActivity.this.g3(true);
                        NSTIJKPlayerSkyActivity.this.onBackPressed();
                        return;
                    }
                    m7.w.N0(NSTIJKPlayerSkyActivity.this.f35404d);
                    gVar = NSTIJKPlayerSkyActivity.this.f35541w4;
                    str = "";
                    str2 = "itv";
                    str3 = "";
                    str4 = "";
                    str5 = "";
                    str6 = "";
                    str7 = "";
                    str8 = "channel_click_from_player";
                    str9 = "";
                    gVar.c(loggedInMacAddress, stalkerToken, cmd, str, null, str2, 0, 0, str3, str4, str5, str6, str7, str8, 0, str9, "");
                }
                if (NSTIJKPlayerSkyActivity.this.f35544x0 == null || NSTIJKPlayerSkyActivity.this.f35544x0.size() <= 0) {
                    return;
                }
                cmd = ((LiveStreamsDBModel) NSTIJKPlayerSkyActivity.this.f35544x0.get(NSTIJKPlayerSkyActivity.this.f35216A4)).getCmd();
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity3 = NSTIJKPlayerSkyActivity.this;
                if (nSTIJKPlayerSkyActivity3.f35220B1 == m7.w.q0(((LiveStreamsDBModel) nSTIJKPlayerSkyActivity3.f35544x0.get(NSTIJKPlayerSkyActivity.this.f35216A4)).getStreamId())) {
                    NSTIJKPlayerSkyActivity.this.g3(true);
                    NSTIJKPlayerSkyActivity.this.onBackPressed();
                    return;
                }
                m7.w.N0(NSTIJKPlayerSkyActivity.this.f35404d);
                gVar = NSTIJKPlayerSkyActivity.this.f35541w4;
                str = "";
                str2 = "itv";
                str3 = "";
                str4 = "";
                str5 = "";
                str6 = "";
                str7 = "";
                str8 = "channel_click_from_player";
                str9 = "";
                gVar.c(loggedInMacAddress, stalkerToken, cmd, str, null, str2, 0, 0, str3, str4, str5, str6, str7, str8, 0, str9, "");
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$e, reason: case insensitive filesystem */
    public class C1480e implements AdapterView.OnItemSelectedListener {
        public C1480e() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i9, long j9) {
            if (NSTIJKPlayerSkyActivity.this.f35553y2 != null && NSTIJKPlayerSkyActivity.this.f35553y2.getStatus().equals(AsyncTask.Status.RUNNING)) {
                NSTIJKPlayerSkyActivity.this.f35553y2.cancel(true);
            }
            ArrayList arrayListE = NSTIJKPlayerSkyActivity.this.f35351U.e();
            k kVar = null;
            if (arrayListE != null && arrayListE.size() > 0) {
                String epgChannelId = ((LiveStreamsDBModel) arrayListE.get(i9)).getEpgChannelId();
                NSTIJKPlayerSkyActivity.this.f35297M1.removeCallbacksAndMessages(null);
                if (SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyActivity.this.f35404d).equals("stalker_api")) {
                    NSTIJKPlayerSkyActivity.this.k4(((LiveStreamsDBModel) arrayListE.get(i9)).getStreamId());
                    return;
                } else {
                    NSTIJKPlayerSkyActivity.this.f35553y2 = new H(NSTIJKPlayerSkyActivity.this, epgChannelId, kVar).execute(new String[0]);
                    return;
                }
            }
            if (NSTIJKPlayerSkyActivity.this.f35530v0 == null || NSTIJKPlayerSkyActivity.this.f35530v0.size() <= 0) {
                return;
            }
            String epgChannelId2 = ((LiveStreamsDBModel) NSTIJKPlayerSkyActivity.this.f35530v0.get(i9)).getEpgChannelId();
            NSTIJKPlayerSkyActivity.this.f35297M1.removeCallbacksAndMessages(null);
            if (SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyActivity.this.f35404d).equals("stalker_api")) {
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                nSTIJKPlayerSkyActivity.k4(((LiveStreamsDBModel) nSTIJKPlayerSkyActivity.f35530v0.get(i9)).getStreamId());
            } else {
                NSTIJKPlayerSkyActivity.this.f35553y2 = new H(NSTIJKPlayerSkyActivity.this, epgChannelId2, kVar).execute(new String[0]);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$f, reason: case insensitive filesystem */
    public class C1481f implements AdapterView.OnItemClickListener {
        public C1481f() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i9, long j9) {
            String cmd;
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity;
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
            NSTIJKPlayerSkyActivity.this.f35562z4 = i9;
            if (!SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyActivity.this.f35404d).equals("stalker_api")) {
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity2 = NSTIJKPlayerSkyActivity.this;
                nSTIJKPlayerSkyActivity2.K3(nSTIJKPlayerSkyActivity2.f35562z4, NSTIJKPlayerSkyActivity.this.f35295M);
                return;
            }
            try {
                String stalkerToken = SharepreferenceDBHandler.getStalkerToken(NSTIJKPlayerSkyActivity.this.f35404d);
                String loggedInMacAddress = SharepreferenceDBHandler.getLoggedInMacAddress(NSTIJKPlayerSkyActivity.this.f35404d);
                ArrayList arrayListE = NSTIJKPlayerSkyActivity.this.f35351U.e();
                if (arrayListE != null && arrayListE.size() > 0) {
                    cmd = ((LiveStreamsDBModel) arrayListE.get(NSTIJKPlayerSkyActivity.this.f35562z4)).getCmd();
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity3 = NSTIJKPlayerSkyActivity.this;
                    if (nSTIJKPlayerSkyActivity3.f35220B1 == m7.w.q0(((LiveStreamsDBModel) arrayListE.get(nSTIJKPlayerSkyActivity3.f35562z4)).getStreamId())) {
                        nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                        nSTIJKPlayerSkyActivity.g3(true);
                        return;
                    }
                    m7.w.N0(NSTIJKPlayerSkyActivity.this.f35404d);
                    gVar = NSTIJKPlayerSkyActivity.this.f35541w4;
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
                }
                if (NSTIJKPlayerSkyActivity.this.f35530v0 == null || NSTIJKPlayerSkyActivity.this.f35530v0.size() <= 0) {
                    return;
                }
                cmd = ((LiveStreamsDBModel) NSTIJKPlayerSkyActivity.this.f35530v0.get(NSTIJKPlayerSkyActivity.this.f35562z4)).getCmd();
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity4 = NSTIJKPlayerSkyActivity.this;
                if (nSTIJKPlayerSkyActivity4.f35220B1 == m7.w.q0(((LiveStreamsDBModel) nSTIJKPlayerSkyActivity4.f35530v0.get(NSTIJKPlayerSkyActivity.this.f35562z4)).getStreamId())) {
                    nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                    nSTIJKPlayerSkyActivity.g3(true);
                    return;
                }
                m7.w.N0(NSTIJKPlayerSkyActivity.this.f35404d);
                gVar = NSTIJKPlayerSkyActivity.this.f35541w4;
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
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$g, reason: case insensitive filesystem */
    public class C1482g implements AdapterView.OnItemLongClickListener {

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$g$a */
        public class a implements PopupMenu.OnMenuItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f35581a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f35582b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f35583c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f35584d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f35585e;

            public a(String str, String str2, String str3, String str4, String str5) {
                this.f35581a = str;
                this.f35582b = str2;
                this.f35583c = str3;
                this.f35584d = str4;
                this.f35585e = str5;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
            
                r5 = r12.f35586f.f35580a;
                r5.f35221B2 = true;
                r5.O3();
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
            
                if (r12.f35586f.f35580a.f35413e2.equals("m3u") == false) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
            
                r5 = r12.f35586f.f35580a;
                r6 = r5.f35246F;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
            
                r5.f35323Q = r6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
            
                if (r12.f35586f.f35580a.f35413e2.equals("onestream_api") == false) goto L70;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
            
                r6 = new org.json.JSONObject(r12.f35586f.f35580a.f35246F);
                r5 = r12.f35586f.f35580a.f35439i0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
            
                r7 = "m3u8";
                r8 = "ts";
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
            
                if (r5 == null) goto L46;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
            
                if (r5.isEmpty() != false) goto L46;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
            
                if (r12.f35586f.f35580a.f35439i0.equals(".ts") == false) goto L46;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
            
                r5 = r6.keys();
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
            
                if (r5.hasNext() == false) goto L125;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
            
                if (r5.next().equals("ts") == false) goto L126;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00ac, code lost:
            
                r9 = "ts";
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
            
                r5 = "";
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
            
                r9 = "";
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
            
                if (r9.equals("") == false) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:
            
                if (r5.hasNext() == false) goto L127;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00c8, code lost:
            
                if (r5.next().equals("m3u8") == false) goto L129;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00ca, code lost:
            
                r9 = "m3u8";
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00cb, code lost:
            
                r5 = r6.getString(r9);
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00d0, code lost:
            
                r5 = "";
                r9 = r5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x00d2, code lost:
            
                r10 = r12.f35586f.f35580a.f35439i0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x00d8, code lost:
            
                if (r10 == null) goto L69;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x00de, code lost:
            
                if (r10.isEmpty() != false) goto L69;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x00ec, code lost:
            
                if (r12.f35586f.f35580a.f35439i0.equals(".m3u8") == false) goto L69;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x00ee, code lost:
            
                r10 = r6.keys();
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x00f6, code lost:
            
                if (r10.hasNext() == false) goto L130;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x0102, code lost:
            
                if (r10.next().equals("m3u8") == false) goto L132;
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x0105, code lost:
            
                r7 = r9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x010a, code lost:
            
                if (r7.equals("") == false) goto L67;
             */
            /* JADX WARN: Code restructure failed: missing block: B:63:0x0110, code lost:
            
                if (r10.hasNext() == false) goto L134;
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x011c, code lost:
            
                if (r10.next().equals("ts") == false) goto L135;
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x011f, code lost:
            
                r8 = r7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:68:0x0120, code lost:
            
                r5 = r6.getString(r8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:70:0x012b, code lost:
            
                r5 = r12.f35586f.f35580a;
                r6 = m7.w.V(r5.f35404d, r5.f35232D, r5.f35439i0, "live");
             */
            /* JADX WARN: Removed duplicated region for block: B:77:0x019a  */
            /* JADX WARN: Removed duplicated region for block: B:88:0x01ff  */
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean onMenuItemClick(android.view.MenuItem r13) {
                /*
                    Method dump skipped, instruction units count: 676
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.C1482g.a.onMenuItemClick(android.view.MenuItem):boolean");
            }
        }

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$g$b */
        public class b implements PopupMenu.OnDismissListener {
            public b() {
            }

            @Override // android.widget.PopupMenu.OnDismissListener
            public void onDismiss(PopupMenu popupMenu) {
            }
        }

        public C1482g() {
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x0262 A[Catch: Exception -> 0x007a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x007a, blocks: (B:3:0x0005, B:5:0x000d, B:8:0x001b, B:10:0x0021, B:19:0x0126, B:21:0x014c, B:23:0x0163, B:26:0x0175, B:28:0x0185, B:30:0x018b, B:31:0x0193, B:52:0x023e, B:55:0x0262, B:66:0x02bb, B:67:0x02be, B:32:0x0197, B:34:0x01a7, B:36:0x01b5, B:38:0x01c9, B:40:0x01d5, B:42:0x01e5, B:43:0x01ee, B:44:0x01f7, B:45:0x0200, B:47:0x0220, B:49:0x0226, B:50:0x022f, B:51:0x0233, B:22:0x0158, B:13:0x007d, B:15:0x0085, B:17:0x0091, B:56:0x026a, B:58:0x0270, B:61:0x0277, B:63:0x0281), top: B:74:0x0005, inners: #0 }] */
        @Override // android.widget.AdapterView.OnItemLongClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onItemLongClick(android.widget.AdapterView r20, android.view.View r21, int r22, long r23) {
            /*
                Method dump skipped, instruction units count: 779
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.C1482g.onItemLongClick(android.widget.AdapterView, android.view.View, int, long):boolean");
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$h, reason: case insensitive filesystem */
    public class RunnableC1483h implements Runnable {

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$h$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTIJKPlayerSkyActivity.this.f35367W1.setText("");
                NSTIJKPlayerSkyActivity.this.f35360V1.setVisibility(8);
            }
        }

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$h$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTIJKPlayerSkyActivity.this.f35367W1.setText("");
                NSTIJKPlayerSkyActivity.this.f35360V1.setVisibility(8);
            }
        }

        public RunnableC1483h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<LiveStreamsDBModel> channelDetails;
            Handler handler;
            Runnable bVar;
            boolean zO3;
            ArrayList<LiveStreamsDBModel> allLiveStreasWithCategoryId;
            String string;
            JSONObject jSONObject;
            String str;
            String str2;
            String str3;
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
            nSTIJKPlayerSkyActivity.f35352U0 = nSTIJKPlayerSkyActivity.f35353U1.toString();
            String str4 = "";
            NSTIJKPlayerSkyActivity.this.f35367W1.setText("");
            NSTIJKPlayerSkyActivity.this.f35360V1.setVisibility(8);
            if (NSTIJKPlayerSkyActivity.this.f35286K4.equals("true")) {
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity2 = NSTIJKPlayerSkyActivity.this;
                channelDetails = nSTIJKPlayerSkyActivity2.f35337S.getChannelDetails(nSTIJKPlayerSkyActivity2.f35352U0, "radio_streams");
            } else {
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity3 = NSTIJKPlayerSkyActivity.this;
                channelDetails = nSTIJKPlayerSkyActivity3.f35337S.getChannelDetails(nSTIJKPlayerSkyActivity3.f35352U0, "live");
            }
            NSTIJKPlayerSkyActivity.this.f35353U1.setLength(0);
            if (channelDetails == null || channelDetails.size() == 0) {
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity4 = NSTIJKPlayerSkyActivity.this;
                nSTIJKPlayerSkyActivity4.f35367W1.setText(nSTIJKPlayerSkyActivity4.f35404d.getResources().getString(a7.j.f13261g4));
                NSTIJKPlayerSkyActivity.this.f35360V1.setVisibility(0);
                handler = new Handler();
                bVar = new b();
            } else {
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity5 = NSTIJKPlayerSkyActivity.this;
                if (nSTIJKPlayerSkyActivity5.f35337S.getParentalStatusCount(SharepreferenceDBHandler.getUserID(nSTIJKPlayerSkyActivity5.f35404d)) <= 0 || NSTIJKPlayerSkyActivity.this.f35233D0 == null) {
                    zO3 = false;
                } else {
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity6 = NSTIJKPlayerSkyActivity.this;
                    zO3 = nSTIJKPlayerSkyActivity6.o3(channelDetails, nSTIJKPlayerSkyActivity6.f35233D0);
                }
                if (!zO3) {
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity7 = NSTIJKPlayerSkyActivity.this;
                    nSTIJKPlayerSkyActivity7.f35338S0 = true;
                    nSTIJKPlayerSkyActivity7.f35345T0 = true;
                    nSTIJKPlayerSkyActivity7.f35412e1 = "0";
                    nSTIJKPlayerSkyActivity7.f35419f1 = nSTIJKPlayerSkyActivity7.f35404d.getResources().getString(a7.j.f13426x);
                    NSTIJKPlayerSkyActivity.this.f35453k0 = 0;
                    String num = channelDetails.get(0).getNum();
                    String streamId = channelDetails.get(0).getStreamId();
                    String streamIdOneStream = channelDetails.get(0).getStreamIdOneStream();
                    String name = channelDetails.get(0).getName();
                    String epgChannelId = channelDetails.get(0).getEpgChannelId();
                    String streamIcon = channelDetails.get(0).getStreamIcon();
                    String url = channelDetails.get(0).getUrl();
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity8 = NSTIJKPlayerSkyActivity.this;
                    nSTIJKPlayerSkyActivity8.f35234D1 = url;
                    nSTIJKPlayerSkyActivity8.f35354U2 = m7.w.r0(nSTIJKPlayerSkyActivity8.f35352U0);
                    NSTIJKPlayerSkyActivity.this.f35361V2 = "0";
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity9 = NSTIJKPlayerSkyActivity.this;
                    nSTIJKPlayerSkyActivity9.f35321P4 = nSTIJKPlayerSkyActivity9.f35412e1;
                    nSTIJKPlayerSkyActivity9.f35434h2.setTitle(NSTIJKPlayerSkyActivity.this.f35352U0 + " - " + name);
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity10 = NSTIJKPlayerSkyActivity.this;
                    StringBuilder sb = new StringBuilder();
                    ArrayList<LiveStreamsDBModel> arrayList = channelDetails;
                    sb.append(NSTIJKPlayerSkyActivity.this.f35352U0);
                    sb.append(" - ");
                    sb.append(name);
                    nSTIJKPlayerSkyActivity10.f35265H4 = sb.toString();
                    if (NSTIJKPlayerSkyActivity.this.f35286K4.equals("true")) {
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity11 = NSTIJKPlayerSkyActivity.this;
                        allLiveStreasWithCategoryId = nSTIJKPlayerSkyActivity11.f35337S.getAllLiveStreasWithCategoryId(nSTIJKPlayerSkyActivity11.f35412e1, "radio_streams");
                    } else {
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity12 = NSTIJKPlayerSkyActivity.this;
                        allLiveStreasWithCategoryId = nSTIJKPlayerSkyActivity12.f35337S.getAllLiveStreasWithCategoryId(nSTIJKPlayerSkyActivity12.f35412e1, "live");
                    }
                    if (allLiveStreasWithCategoryId != null) {
                        NSTIJKPlayerSkyActivity.this.f35530v0.clear();
                    }
                    NSTIJKPlayerSkyActivity.this.f35530v0 = allLiveStreasWithCategoryId;
                    if (NSTIJKPlayerSkyActivity.this.f35530v0 != null && NSTIJKPlayerSkyActivity.this.f35530v0.size() > 0) {
                        int i9 = 0;
                        while (true) {
                            if (i9 < NSTIJKPlayerSkyActivity.this.f35530v0.size()) {
                                if (((LiveStreamsDBModel) NSTIJKPlayerSkyActivity.this.f35530v0.get(i9)).getNum().equals(num)) {
                                    NSTIJKPlayerSkyActivity.this.f35434h2.setCurrentWindowIndex(i9);
                                    break;
                                }
                                i9++;
                            }
                        }
                    }
                    try {
                        if (streamIcon.equals("") || streamIcon.isEmpty()) {
                            NSTIJKPlayerSkyActivity.this.f35494q.setImageDrawable(NSTIJKPlayerSkyActivity.this.f35404d.getResources().getDrawable(a7.e.f12016i1));
                        } else {
                            com.squareup.picasso.t.q(NSTIJKPlayerSkyActivity.this.f35404d).l(streamIcon).j(a7.e.f12016i1).d(a7.e.f12016i1).k(80, 55).g(NSTIJKPlayerSkyActivity.this.f35494q);
                        }
                    } catch (Exception unused) {
                        NSTIJKPlayerSkyActivity.this.f35494q.setImageDrawable(NSTIJKPlayerSkyActivity.this.f35404d.getResources().getDrawable(a7.e.f12016i1));
                    }
                    NSTIJKPlayerSkyActivity.this.f35434h2.t1();
                    if (NSTIJKPlayerSkyActivity.this.f35476n2.booleanValue()) {
                        if (NSTIJKPlayerSkyActivity.this.f35413e2.equals("m3u")) {
                            NSTIJKPlayerSkyActivity.this.f35434h2.z1(Uri.parse(url), NSTIJKPlayerSkyActivity.f35205Y5, name);
                            NSTIJKPlayerSkyActivity.this.f35258G4 = String.valueOf(Uri.parse(url));
                            C2966a.f().A(NSTIJKPlayerSkyActivity.this.f35234D1);
                        } else if (NSTIJKPlayerSkyActivity.this.f35413e2.equals("onestream_api")) {
                            try {
                                jSONObject = new JSONObject(url);
                                String str5 = NSTIJKPlayerSkyActivity.this.f35439i0;
                                str = "m3u8";
                                str2 = "ts";
                                if (str5 == null || str5.isEmpty() || !NSTIJKPlayerSkyActivity.this.f35439i0.equals(".ts")) {
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
                            } catch (Exception unused2) {
                            }
                            try {
                                String str6 = NSTIJKPlayerSkyActivity.this.f35439i0;
                                if (str6 != null && !str6.isEmpty() && NSTIJKPlayerSkyActivity.this.f35439i0.equals(".m3u8")) {
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
                            } catch (Exception unused3) {
                                str4 = string;
                                string = str4;
                            }
                            NSTIJKPlayerSkyActivity.this.f35434h2.z1(Uri.parse(string), NSTIJKPlayerSkyActivity.f35205Y5, name);
                            NSTIJKPlayerSkyActivity.this.f35258G4 = String.valueOf(Uri.parse(string));
                            C2966a.f().A(streamIdOneStream);
                        } else {
                            NSTIJKPlayerSkyActivity.this.f35434h2.z1(Uri.parse(NSTIJKPlayerSkyActivity.this.f35410e + m7.w.q0(streamId) + NSTIJKPlayerSkyActivity.this.f35439i0), NSTIJKPlayerSkyActivity.f35205Y5, name);
                            NSTIJKPlayerSkyActivity.this.f35258G4 = String.valueOf(Uri.parse(NSTIJKPlayerSkyActivity.this.f35410e + m7.w.q0(streamId) + ".m3u8"));
                            C2966a.f().A(streamId);
                        }
                        NSTIJKPlayerSkyActivity.this.f35434h2.f37044H = 0;
                        NSTIJKPlayerSkyActivity.this.f35434h2.f37050J = false;
                        NSTIJKPlayerSkyActivity.this.f35434h2.start();
                    }
                    k kVar = null;
                    NSTIJKPlayerSkyActivity.this.f35304N1.removeCallbacksAndMessages(null);
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity13 = NSTIJKPlayerSkyActivity.this;
                    nSTIJKPlayerSkyActivity13.f35253G = epgChannelId;
                    nSTIJKPlayerSkyActivity13.f35260H = streamIcon;
                    nSTIJKPlayerSkyActivity13.f35272I4 = streamIcon;
                    NSTIJKPlayerSkyActivity.this.f35434h2.setCurrentEpgChannelID(NSTIJKPlayerSkyActivity.this.f35253G);
                    NSTIJKPlayerSkyActivity.this.f35434h2.setCurrentStreamID(streamId);
                    NSTIJKPlayerSkyActivity.this.f35434h2.setCurrentChannelLogo(NSTIJKPlayerSkyActivity.this.f35260H);
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity14 = NSTIJKPlayerSkyActivity.this;
                    nSTIJKPlayerSkyActivity14.i4(nSTIJKPlayerSkyActivity14.f35260H);
                    if (SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyActivity.this.f35404d).equals("stalker_api")) {
                        NSTIJKPlayerSkyActivity.this.k4(streamId);
                    } else {
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity15 = NSTIJKPlayerSkyActivity.this;
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity16 = NSTIJKPlayerSkyActivity.this;
                        nSTIJKPlayerSkyActivity15.f35553y2 = new H(nSTIJKPlayerSkyActivity16, nSTIJKPlayerSkyActivity16.f35253G, kVar).execute(new String[0]);
                    }
                    NSTIJKPlayerSkyActivity.this.f35297M1.removeCallbacksAndMessages(null);
                    NSTIJKPlayerSkyActivity.this.f35220B1 = m7.w.q0(streamId);
                    if (NSTIJKPlayerSkyActivity.this.f35248F1 != null) {
                        if (NSTIJKPlayerSkyActivity.this.f35413e2.equals("onestream_api")) {
                            NSTIJKPlayerSkyActivity.this.f35248F1.putString("currentlyPlayingVideo", streamIdOneStream);
                        } else {
                            NSTIJKPlayerSkyActivity.this.f35248F1.putString("currentlyPlayingVideo", streamId);
                        }
                        NSTIJKPlayerSkyActivity.this.f35248F1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", url);
                        NSTIJKPlayerSkyActivity.this.f35248F1.apply();
                    }
                    NSTIJKPlayerSkyActivity.this.f35351U.notifyDataSetChanged();
                    arrayList.clear();
                    return;
                }
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity17 = NSTIJKPlayerSkyActivity.this;
                nSTIJKPlayerSkyActivity17.f35367W1.setText(nSTIJKPlayerSkyActivity17.f35404d.getResources().getString(a7.j.f13261g4));
                NSTIJKPlayerSkyActivity.this.f35360V1.setVisibility(0);
                handler = new Handler();
                bVar = new a();
            }
            handler.postDelayed(bVar, 1000L);
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f35591a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f35592c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f35593d;

        public i(int i9, String str, String str2) {
            this.f35591a = i9;
            this.f35592c = str;
            this.f35593d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyActivity.this.f35404d).equals("stalker_api")) {
                NSTIJKPlayerSkyActivity.this.m4(this.f35591a, this.f35592c, this.f35593d);
                return;
            }
            m7.w.N0(NSTIJKPlayerSkyActivity.this.f35404d);
            String stalkerToken = SharepreferenceDBHandler.getStalkerToken(NSTIJKPlayerSkyActivity.this.f35404d);
            try {
                NSTIJKPlayerSkyActivity.this.f35541w4.c(SharepreferenceDBHandler.getLoggedInMacAddress(NSTIJKPlayerSkyActivity.this.f35404d), stalkerToken, ((LiveStreamsDBModel) NSTIJKPlayerSkyActivity.this.f35558z0.get(this.f35591a)).getCmd(), "", null, "itv", 0, 0, "", "", "", "", "", "zappingLeft", this.f35591a, this.f35592c, this.f35593d);
            } catch (Exception unused) {
            }
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f35595a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f35596c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f35597d;

        public j(int i9, String str, String str2) {
            this.f35595a = i9;
            this.f35596c = str;
            this.f35597d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyActivity.this.f35404d).equals("stalker_api")) {
                NSTIJKPlayerSkyActivity.this.n4(this.f35595a, this.f35596c, this.f35597d);
                return;
            }
            m7.w.N0(NSTIJKPlayerSkyActivity.this.f35404d);
            String stalkerToken = SharepreferenceDBHandler.getStalkerToken(NSTIJKPlayerSkyActivity.this.f35404d);
            try {
                NSTIJKPlayerSkyActivity.this.f35541w4.c(SharepreferenceDBHandler.getLoggedInMacAddress(NSTIJKPlayerSkyActivity.this.f35404d), stalkerToken, ((LiveStreamsDBModel) NSTIJKPlayerSkyActivity.this.f35558z0.get(this.f35595a)).getCmd(), "", null, "itv", 0, 0, "", "", "", "", "", "zappingRight", this.f35595a, this.f35596c, this.f35597d);
            } catch (Exception unused) {
            }
        }
    }

    public class k implements InterfaceC2347y {
        public k() {
        }

        private void a(C2328e c2328e) {
            NSTIJKPlayerSkyActivity.this.f35312O2 = c2328e;
            try {
                C2281m c2281m = new C2281m(1);
                c2281m.M("com.google.android.gms.cast.metadata.TITLE", NSTIJKPlayerSkyActivity.this.f35265H4);
                c2281m.c(new C2957a(Uri.parse(NSTIJKPlayerSkyActivity.this.f35272I4)));
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                AbstractC1902a.b(nSTIJKPlayerSkyActivity.f35333R2, nSTIJKPlayerSkyActivity.f35312O2.r(), NSTIJKPlayerSkyActivity.this.f35258G4, c2281m, NSTIJKPlayerSkyActivity.this.f35404d);
            } catch (Exception unused) {
            }
            NSTIJKPlayerSkyActivity.this.invalidateOptionsMenu();
        }

        private void b() {
            NSTIJKPlayerSkyActivity.this.invalidateOptionsMenu();
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
            NSTIJKPlayerSkyActivity.this.f35312O2 = c2328e;
            if (NSTIJKPlayerSkyActivity.this.f35312O2 != null) {
                if (NSTIJKPlayerSkyActivity.this.f35434h2 != null) {
                    NSTIJKPlayerSkyActivity.this.f35434h2.pause();
                }
                LinearLayout linearLayout = NSTIJKPlayerSkyActivity.this.f35334R3;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                if (nSTIJKPlayerSkyActivity.f35348T3 != null) {
                    if (nSTIJKPlayerSkyActivity.f35312O2.q() == null || NSTIJKPlayerSkyActivity.this.f35312O2.q().J() == null) {
                        textView = NSTIJKPlayerSkyActivity.this.f35348T3;
                        sb = new StringBuilder();
                        string = NSTIJKPlayerSkyActivity.this.getResources().getString(a7.j.f13407v0);
                    } else {
                        textView = NSTIJKPlayerSkyActivity.this.f35348T3;
                        sb = new StringBuilder();
                        sb.append(NSTIJKPlayerSkyActivity.this.getResources().getString(a7.j.f13417w0));
                        sb.append(" ");
                        string = NSTIJKPlayerSkyActivity.this.f35312O2.q().J();
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

    public class l extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f35600a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f35601c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f35602d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f35603e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f35604f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public RadioGroup f35605g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Activity f35606h;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f35608a;

            public a(View view) {
                this.f35608a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f35608a;
                    if (view2 == null || view2.getTag() == null || !this.f35608a.getTag().equals("1")) {
                        View view3 = this.f35608a;
                        if (view3 == null || view3.getTag() == null || !this.f35608a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = l.this.f35604f;
                        }
                    } else {
                        linearLayout = l.this.f35603e;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f35608a;
                    if (view4 == null || view4.getTag() == null || !this.f35608a.getTag().equals("1")) {
                        View view5 = this.f35608a;
                        if (view5 == null || view5.getTag() == null || !this.f35608a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = l.this.f35604f;
                        }
                    } else {
                        linearLayout = l.this.f35603e;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Activity activity, Activity activity2) {
            super(activity);
            this.f35606h = activity2;
            this.f35600a = activity;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0040 A[Catch: Exception -> 0x0148, PHI: r0
          0x0040: PHI (r0v27 java.lang.String) = 
          (r0v20 java.lang.String)
          (r0v21 java.lang.String)
          (r0v22 java.lang.String)
          (r0v23 java.lang.String)
          (r0v28 java.lang.String)
         binds: [B:34:0x00cf, B:28:0x00ae, B:22:0x008d, B:16:0x006c, B:9:0x003e] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {Exception -> 0x0148, blocks: (B:4:0x0008, B:7:0x0032, B:10:0x0040, B:40:0x00ea, B:42:0x00f4, B:59:0x013d, B:43:0x00fa, B:46:0x0102, B:48:0x0108, B:50:0x0114, B:51:0x011a, B:53:0x0120, B:55:0x0126, B:57:0x0132, B:58:0x0138, B:11:0x0047, B:12:0x004e, B:14:0x0060, B:18:0x006f, B:20:0x0081, B:24:0x0090, B:26:0x00a2, B:30:0x00b1, B:32:0x00c3, B:36:0x00d3, B:38:0x00df, B:39:0x00e5), top: B:67:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0047 A[Catch: Exception -> 0x0148, PHI: r0
          0x0047: PHI (r0v24 java.lang.String) = 
          (r0v20 java.lang.String)
          (r0v21 java.lang.String)
          (r0v22 java.lang.String)
          (r0v23 java.lang.String)
          (r0v28 java.lang.String)
         binds: [B:34:0x00cf, B:28:0x00ae, B:22:0x008d, B:16:0x006c, B:9:0x003e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0148, blocks: (B:4:0x0008, B:7:0x0032, B:10:0x0040, B:40:0x00ea, B:42:0x00f4, B:59:0x013d, B:43:0x00fa, B:46:0x0102, B:48:0x0108, B:50:0x0114, B:51:0x011a, B:53:0x0120, B:55:0x0126, B:57:0x0132, B:58:0x0138, B:11:0x0047, B:12:0x004e, B:14:0x0060, B:18:0x006f, B:20:0x0081, B:24:0x0090, B:26:0x00a2, B:30:0x00b1, B:32:0x00c3, B:36:0x00d3, B:38:0x00df, B:39:0x00e5), top: B:67:0x0008 }] */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onClick(android.view.View r5) {
            /*
                Method dump skipped, instruction units count: 332
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.l.onClick(android.view.View):void");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00eb  */
        @Override // android.app.Dialog
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onCreate(android.os.Bundle r11) {
            /*
                Method dump skipped, instruction units count: 376
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.l.onCreate(android.os.Bundle):void");
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyActivity.this.t3();
        }
    }

    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyActivity.this.s3();
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
            if (intExtra == 1) {
                NSTIJKPlayerSkyActivity.this.f35434h2.start();
                if (Build.VERSION.SDK_INT >= 26) {
                    NSTIJKPlayerSkyActivity.this.l4(a7.e.f12075x0, "pause", 2, 2);
                    return;
                }
                return;
            }
            if (intExtra != 2) {
                return;
            }
            NSTIJKPlayerSkyActivity.this.f35434h2.pause();
            if (Build.VERSION.SDK_INT >= 26) {
                NSTIJKPlayerSkyActivity.this.l4(a7.e.f12051r0, "play", 1, 1);
            }
        }
    }

    public class p extends NSTIJKPlayerSky.w {
        public p() {
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky.w
        public void a() {
            NSTIJKPlayerSkyActivity.this.l4(a7.e.f12075x0, "pause", 2, 2);
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky.w
        public void b() {
            NSTIJKPlayerSkyActivity.this.l4(a7.e.f12051r0, "play", 1, 1);
        }
    }

    public class q implements DialogInterface.OnClickListener {
        public q() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.dismiss();
        }
    }

    public class r implements DialogInterface.OnClickListener {
        public r() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            m7.w.n0(NSTIJKPlayerSkyActivity.this.f35404d);
        }
    }

    public class s implements SearchView.m {
        public s() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextChange(String str) {
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
            if (nSTIJKPlayerSkyActivity.f35211A) {
                nSTIJKPlayerSkyActivity.f35211A = false;
                return false;
            }
            nSTIJKPlayerSkyActivity.f35310O0.setVisibility(8);
            if (NSTIJKPlayerSkyActivity.this.f35351U != null) {
                NSTIJKPlayerSkyActivity.this.f35351U.getFilter().filter(str);
            }
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class t implements DialogInterface.OnClickListener {
        public t() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            NSTIJKPlayerSkyActivity.this.O3();
            m7.w.m0(NSTIJKPlayerSkyActivity.this.f35404d);
        }
    }

    public class u implements DialogInterface.OnClickListener {
        public u() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class v implements View.OnClickListener {
        public v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerSkyActivity.this.g3(true);
        }
    }

    public class w implements Callback {
        public w() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            Log.e("onFailure", th.getMessage().toString());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Toast toastMakeText;
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity;
            String strMessage;
            if (response == null) {
                toastMakeText = Toast.makeText(NSTIJKPlayerSkyActivity.this, "Something went Wrong Report not Submitted", 0);
            } else {
                if (response.body() == null || !response.isSuccessful()) {
                    if (response.message() != null && !response.message().equals("")) {
                        nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                        strMessage = response.message();
                    }
                    toastMakeText = Toast.makeText(NSTIJKPlayerSkyActivity.this, "Something went Wrong Report not Submitted", 0);
                } else if (((ClientFeedbackCallback) response.body()).a() == null || !((ClientFeedbackCallback) response.body()).a().equalsIgnoreCase("success")) {
                    nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                    strMessage = "Something went Wrong";
                } else {
                    nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                    strMessage = "Reported Successfully";
                }
                toastMakeText = Toast.makeText(nSTIJKPlayerSkyActivity, strMessage, 0);
            }
            toastMakeText.show();
        }
    }

    public class x implements View.OnClickListener {
        public x() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class y extends BroadcastReceiver {
        public y() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MyApplication.E("onReceive CLOSE_TARGET_ACTIVITY : ");
            if ("pip_mode_switch_user".equals(intent.getAction())) {
                NSTIJKPlayerSkyActivity.this.finish();
            }
        }
    }

    public class z implements View.OnClickListener {
        public z() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m7.w.j(NSTIJKPlayerSkyActivity.this.f35404d);
        }
    }

    public NSTIJKPlayerSkyActivity() {
        Boolean bool = Boolean.FALSE;
        this.f35379Y1 = bool;
        this.f35385Z1 = bool;
        this.f35406d2 = "";
        this.f35448j2 = "";
        this.f35455k2 = bool;
        this.f35469m2 = "";
        Boolean bool2 = Boolean.TRUE;
        this.f35476n2 = bool2;
        this.f35483o2 = null;
        this.f35497q2 = -1;
        this.f35504r2 = "";
        this.f35511s2 = 0;
        this.f35518t2 = "";
        this.f35525u2 = "";
        this.f35532v2 = bool2;
        this.f35539w2 = null;
        this.f35546x2 = null;
        this.f35553y2 = null;
        this.f35560z2 = false;
        this.f35214A2 = 0;
        this.f35221B2 = false;
        this.f35228C2 = 4;
        this.f35235D2 = f35208b6[0];
        this.f35249F2 = bool;
        this.f35256G2 = bool;
        this.f35263H2 = bool;
        this.f35270I2 = bool;
        this.f35277J2 = bool;
        this.f35284K2 = bool;
        this.f35354U2 = 0;
        this.f35361V2 = "0";
        this.f35368W2 = "0";
        this.f35374X2 = bool2;
        this.f35464l4 = "mobile";
        this.f35492p4 = "0";
        this.f35499q4 = "0";
        this.f35506r4 = 0;
        this.f35527u4 = false;
        this.f35534v4 = false;
        this.f35548x4 = "";
        this.f35555y4 = "";
        this.f35562z4 = 0;
        this.f35216A4 = 0;
        this.f35237D4 = 0;
        this.f35258G4 = "";
        this.f35265H4 = "";
        this.f35272I4 = "";
        this.f35279J4 = false;
        this.f35286K4 = "false";
        this.f35293L4 = "";
        this.f35307N4 = AbstractC2237a.f44541u0;
        this.f35321P4 = "-10";
        this.f35328Q4 = null;
        this.f35259G5 = "Live";
        this.f35266H5 = "";
        this.f35287K5 = "";
        this.f35294L5 = "";
        this.f35301M5 = "";
        this.f35315O5 = "";
        this.f35343S5 = null;
        this.f35350T5 = new y();
        this.f35357U5 = new ArrayList();
        this.f35364V5 = new p();
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0310  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A3() {
        /*
            Method dump skipped, instruction units count: 2648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.A3():void");
    }

    private void D3() {
        ProgressBar progressBar = this.f35536w;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView = this.f35501r;
        if (textView != null) {
            textView.setText(this.f35404d.getResources().getString(a7.j.f13068M4));
        }
        TextView textView2 = this.f35508s;
        if (textView2 != null) {
            textView2.setText("");
        }
        TextView textView3 = this.f35515t;
        if (textView3 != null) {
            textView3.setText(this.f35404d.getResources().getString(a7.j.f13211b4));
        }
        TextView textView4 = this.f35522u;
        if (textView4 != null) {
            textView4.setText("");
        }
    }

    private void F3() {
        int currentWindowIndex = this.f35434h2.getCurrentWindowIndex();
        if (currentWindowIndex == this.f35558z0.size() - 1) {
            this.f35434h2.setCurrentWindowIndex(0);
        } else {
            this.f35434h2.setCurrentWindowIndex(currentWindowIndex + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G2(int i9, String str) {
        try {
            StringBuilder sb = new StringBuilder();
            List list = this.f35223B4;
            if (list != null && list.size() > 0) {
                for (int i10 = 0; i10 < this.f35223B4.size(); i10++) {
                    sb.append(this.f35223B4.get(i10));
                    sb.append(",");
                }
            }
            sb.append(i9);
            this.f35237D4 = i9;
            String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f35404d);
            this.f35230C4.c(SharepreferenceDBHandler.getLoggedInMacAddress(this.f35404d), stalkerToken, null, sb.toString(), "added", str);
        } catch (Exception unused) {
            m7.w.X();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I2(String str, String str2, String str3) {
        if (this.f35404d == null || this.f35351U == null || this.f35337S == null) {
            return;
        }
        FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
        favouriteM3UModel.setUrl(str2);
        favouriteM3UModel.setUserID(SharepreferenceDBHandler.getUserID(this.f35404d));
        favouriteM3UModel.setName(str3);
        favouriteM3UModel.setCategoryID(str);
        this.f35337S.addToFavourite(favouriteM3UModel);
        this.f35351U.notifyDataSetChanged();
        m7.w.P0(this.f35404d, str3 + this.f35404d.getResources().getString(a7.j.f13356q));
    }

    private void J2(Configuration configuration) {
        NSTIJKPlayerSky nSTIJKPlayerSky;
        boolean z9;
        View decorView = getWindow().getDecorView();
        if (configuration.orientation == 2) {
            decorView.setSystemUiVisibility(5894);
            nSTIJKPlayerSky = this.f35434h2;
            z9 = false;
        } else {
            decorView.setSystemUiVisibility(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH);
            nSTIJKPlayerSky = this.f35434h2;
            z9 = true;
        }
        nSTIJKPlayerSky.setAdjustViewBounds(z9);
    }

    private void J3() {
        this.f35519t3.setOnClickListener(this);
        this.f35526u3.setOnClickListener(this);
        this.f35561z3.setOnClickListener(this);
        this.f35243E3.setOnClickListener(this);
        this.f35397b4.setOnClickListener(this);
        this.f35250F3.setOnClickListener(this);
        this.f35278J3.setOnClickListener(this);
        this.f35215A3.setOnClickListener(this);
        this.f35271I3.setOnClickListener(this);
        this.f35229C3.setOnClickListener(this);
        this.f35236D3.setOnClickListener(this);
        this.f35477n3.setOnClickListener(this);
        this.f35512s3.setOnClickListener(this);
        this.f35556y5.setOnClickListener(this);
        this.f35563z5.setOnClickListener(this);
        this.f35217A5.setOnClickListener(this);
        this.f35224B5.setOnClickListener(this);
        this.f35231C5.setOnClickListener(this);
        this.f35238D5.setOnClickListener(this);
        this.f35245E5.setOnClickListener(this);
        this.f35451j5.setOnClickListener(this);
        this.f35535v5.setOnClickListener(this);
        this.f35257G3.setOnClickListener(this);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f35434h2.setMovieListener(this.f35364V5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:370|247)|(1:275)(7:253|(2:254|(3:350|256|(2:384|258)(1:259))(2:385|261))|362|262|(4:(3:266|(2:387|268)(1:269)|264)|386|271|272)(2:271|272)|56|394)|358|276|(6:282|(2:283|(1:388)(2:285|(2:389|287)(1:390)))|289|(4:(3:293|(2:392|295)(1:393)|291)|391|296|297)(2:296|297)|56|394)|300) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:353|85|(1:110)(6:91|(2:92|(2:94|(2:375|96)(1:97))(2:374|98))|99|(4:(3:103|(2:377|105)(1:106)|101)|376|107|108)(2:107|108)|56|394)|360|111|(6:117|(2:118|(2:120|(2:379|122)(1:380))(2:378|124))|125|(4:(3:129|(2:382|131)(1:383)|127)|381|132|133)(2:132|133)|56|394)|136) */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0509, code lost:
    
        r9 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x052c, code lost:
    
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0c79, code lost:
    
        r9 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0cfd A[Catch: Exception -> 0x001d, TryCatch #2 {Exception -> 0x001d, blocks: (B:3:0x0006, B:5:0x000b, B:7:0x0017, B:10:0x0021, B:13:0x0055, B:15:0x005b, B:17:0x008e, B:19:0x00a0, B:21:0x00e1, B:22:0x00e9, B:24:0x0159, B:26:0x0161, B:28:0x0169, B:30:0x0183, B:32:0x0189, B:33:0x0191, B:42:0x01e6, B:44:0x021e, B:46:0x023e, B:48:0x0252, B:49:0x027b, B:51:0x027f, B:52:0x02aa, B:54:0x02ae, B:55:0x02b8, B:56:0x02ba, B:45:0x022d, B:41:0x01d5, B:57:0x02bf, B:58:0x02c5, B:60:0x02d5, B:62:0x02e9, B:64:0x032a, B:65:0x0332, B:67:0x03a2, B:69:0x03aa, B:71:0x03b2, B:73:0x03d0, B:74:0x03d8, B:83:0x042d, B:136:0x052d, B:137:0x0556, B:139:0x055a, B:141:0x0562, B:142:0x0572, B:144:0x0587, B:143:0x0576, B:145:0x059f, B:147:0x05a3, B:148:0x05ad, B:149:0x05b1, B:151:0x05c8, B:153:0x0609, B:154:0x0611, B:156:0x0689, B:158:0x0691, B:160:0x0699, B:162:0x06b3, B:164:0x06b9, B:165:0x06c1, B:174:0x0716, B:176:0x0750, B:178:0x0770, B:180:0x0784, B:182:0x0790, B:183:0x07b1, B:185:0x0818, B:184:0x07b4, B:186:0x0822, B:188:0x0826, B:189:0x084f, B:191:0x0853, B:192:0x085d, B:177:0x075f, B:193:0x0861, B:195:0x0870, B:197:0x0876, B:199:0x08b7, B:201:0x08cb, B:203:0x08f8, B:204:0x0900, B:206:0x097a, B:208:0x0982, B:210:0x098a, B:212:0x09a8, B:214:0x09ae, B:215:0x09b6, B:217:0x09c5, B:218:0x09f0, B:220:0x0a2a, B:222:0x0a4c, B:224:0x0a55, B:225:0x0a82, B:227:0x0a86, B:228:0x0a90, B:221:0x0a3b, B:229:0x0a94, B:231:0x0aa0, B:233:0x0ab4, B:235:0x0afd, B:236:0x0b05, B:238:0x0b83, B:240:0x0b8b, B:242:0x0b93, B:244:0x0bb5, B:245:0x0bbd, B:300:0x0c9b, B:301:0x0cc6, B:303:0x0cfd, B:304:0x0d2a, B:306:0x0d2e, B:307:0x0d36, B:308:0x0d3a, B:310:0x0d52, B:312:0x0d7f, B:313:0x0d87, B:315:0x0e09, B:317:0x0e11, B:319:0x0e19, B:321:0x0e37, B:323:0x0e3d, B:324:0x0e45, B:326:0x0e54, B:328:0x0e60, B:329:0x0e83, B:331:0x0ef0, B:330:0x0e86, B:332:0x0efa, B:334:0x0f34, B:336:0x0f56, B:338:0x0f5f, B:339:0x0f8c, B:341:0x0f90, B:342:0x0f9a, B:335:0x0f45, B:34:0x019b, B:36:0x01a1, B:38:0x01a7, B:39:0x01c3), top: B:352:0x0006, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0d2e A[Catch: Exception -> 0x001d, TryCatch #2 {Exception -> 0x001d, blocks: (B:3:0x0006, B:5:0x000b, B:7:0x0017, B:10:0x0021, B:13:0x0055, B:15:0x005b, B:17:0x008e, B:19:0x00a0, B:21:0x00e1, B:22:0x00e9, B:24:0x0159, B:26:0x0161, B:28:0x0169, B:30:0x0183, B:32:0x0189, B:33:0x0191, B:42:0x01e6, B:44:0x021e, B:46:0x023e, B:48:0x0252, B:49:0x027b, B:51:0x027f, B:52:0x02aa, B:54:0x02ae, B:55:0x02b8, B:56:0x02ba, B:45:0x022d, B:41:0x01d5, B:57:0x02bf, B:58:0x02c5, B:60:0x02d5, B:62:0x02e9, B:64:0x032a, B:65:0x0332, B:67:0x03a2, B:69:0x03aa, B:71:0x03b2, B:73:0x03d0, B:74:0x03d8, B:83:0x042d, B:136:0x052d, B:137:0x0556, B:139:0x055a, B:141:0x0562, B:142:0x0572, B:144:0x0587, B:143:0x0576, B:145:0x059f, B:147:0x05a3, B:148:0x05ad, B:149:0x05b1, B:151:0x05c8, B:153:0x0609, B:154:0x0611, B:156:0x0689, B:158:0x0691, B:160:0x0699, B:162:0x06b3, B:164:0x06b9, B:165:0x06c1, B:174:0x0716, B:176:0x0750, B:178:0x0770, B:180:0x0784, B:182:0x0790, B:183:0x07b1, B:185:0x0818, B:184:0x07b4, B:186:0x0822, B:188:0x0826, B:189:0x084f, B:191:0x0853, B:192:0x085d, B:177:0x075f, B:193:0x0861, B:195:0x0870, B:197:0x0876, B:199:0x08b7, B:201:0x08cb, B:203:0x08f8, B:204:0x0900, B:206:0x097a, B:208:0x0982, B:210:0x098a, B:212:0x09a8, B:214:0x09ae, B:215:0x09b6, B:217:0x09c5, B:218:0x09f0, B:220:0x0a2a, B:222:0x0a4c, B:224:0x0a55, B:225:0x0a82, B:227:0x0a86, B:228:0x0a90, B:221:0x0a3b, B:229:0x0a94, B:231:0x0aa0, B:233:0x0ab4, B:235:0x0afd, B:236:0x0b05, B:238:0x0b83, B:240:0x0b8b, B:242:0x0b93, B:244:0x0bb5, B:245:0x0bbd, B:300:0x0c9b, B:301:0x0cc6, B:303:0x0cfd, B:304:0x0d2a, B:306:0x0d2e, B:307:0x0d36, B:308:0x0d3a, B:310:0x0d52, B:312:0x0d7f, B:313:0x0d87, B:315:0x0e09, B:317:0x0e11, B:319:0x0e19, B:321:0x0e37, B:323:0x0e3d, B:324:0x0e45, B:326:0x0e54, B:328:0x0e60, B:329:0x0e83, B:331:0x0ef0, B:330:0x0e86, B:332:0x0efa, B:334:0x0f34, B:336:0x0f56, B:338:0x0f5f, B:339:0x0f8c, B:341:0x0f90, B:342:0x0f9a, B:335:0x0f45, B:34:0x019b, B:36:0x01a1, B:38:0x01a7, B:39:0x01c3), top: B:352:0x0006, inners: #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K3(int r25, java.util.ArrayList r26) {
        /*
            Method dump skipped, instruction units count: 4025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.K3(int, java.util.ArrayList):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:212:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0af6  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0f49  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x10f4  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x111d  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x1133  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x1149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void L3(int r26, java.util.ArrayList r27) {
        /*
            Method dump skipped, instruction units count: 4449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.L3(int, java.util.ArrayList):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M3(ArrayList arrayList) {
        C2966a c2966aF;
        String strValueOf;
        String string;
        JSONObject jSONObject;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        SharedPreferences.Editor editor;
        String streamId;
        if (arrayList == null || arrayList.size() <= 0 || this.f35346T1 >= arrayList.size()) {
            return;
        }
        int iR0 = m7.w.r0(((LiveStreamsDBModel) arrayList.get(this.f35346T1)).getNum());
        this.f35354U2 = iR0;
        String str7 = "";
        if (!((LiveStreamsDBModel) arrayList.get(this.f35346T1)).getCategoryId().equals("")) {
            this.f35361V2 = ((LiveStreamsDBModel) arrayList.get(this.f35346T1)).getCategoryId();
        }
        int i9 = this.f35346T1;
        this.f35214A2 = i9;
        String name = ((LiveStreamsDBModel) arrayList.get(i9)).getName();
        int iQ0 = m7.w.q0(((LiveStreamsDBModel) arrayList.get(this.f35346T1)).getStreamId());
        String streamIdOneStream = ((LiveStreamsDBModel) arrayList.get(this.f35346T1)).getStreamIdOneStream();
        String epgChannelId = ((LiveStreamsDBModel) arrayList.get(this.f35346T1)).getEpgChannelId();
        String streamIcon = ((LiveStreamsDBModel) arrayList.get(this.f35346T1)).getStreamIcon();
        ((LiveStreamsDBModel) arrayList.get(this.f35346T1)).getNum();
        this.f35420f2 = ((LiveStreamsDBModel) arrayList.get(this.f35346T1)).getUrl();
        String strS0 = m7.w.S0(w7.k.a() + w7.k.i());
        this.f35266H5 = ((LiveStreamsDBModel) arrayList.get(this.f35346T1)).getCategoryId();
        this.f35287K5 = ((LiveStreamsDBModel) arrayList.get(this.f35346T1)).getName();
        try {
            if (streamIcon.equals("") || streamIcon.isEmpty()) {
                this.f35494q.setImageDrawable(this.f35404d.getResources().getDrawable(a7.e.f12016i1));
            } else {
                com.squareup.picasso.t.q(this.f35404d).l(streamIcon).j(a7.e.f12016i1).d(a7.e.f12016i1).g(this.f35494q);
            }
        } catch (Exception unused) {
            this.f35494q.setImageDrawable(this.f35404d.getResources().getDrawable(a7.e.f12016i1));
        }
        this.f35434h2.setCurrentWindowIndex(this.f35346T1);
        if (this.f35248F1 != null) {
            if (this.f35413e2.equals("onestream_api")) {
                editor = this.f35248F1;
                streamId = ((LiveStreamsDBModel) arrayList.get(this.f35346T1)).getStreamIdOneStream();
            } else {
                editor = this.f35248F1;
                streamId = ((LiveStreamsDBModel) arrayList.get(this.f35346T1)).getStreamId();
            }
            editor.putString("currentlyPlayingVideo", String.valueOf(streamId));
            this.f35248F1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((LiveStreamsDBModel) arrayList.get(this.f35346T1)).getUrl()));
            this.f35248F1.apply();
        }
        SharedPreferences.Editor editor2 = this.f35255G1;
        if (editor2 != null) {
            editor2.putInt("currentlyPlayingVideoPosition", this.f35346T1);
            this.f35255G1.apply();
        }
        SimpleDateFormat simpleDateFormat = this.f35427g2;
        if (b3(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(this.f35404d))), this.f35400c2.format(this.f35441i2)) >= C2939c.p() && (str5 = this.f35524u1) != null && this.f35454k1 != null && (!f35206Z5.equals(str5) || (this.f35524u1 != null && (str6 = this.f35454k1) != null && !f35207a6.equals(str6)))) {
            this.f35476n2 = Boolean.FALSE;
            this.f35434h2.setVisibility(8);
            this.f35480o.setVisibility(0);
            this.f35487p.setText(strS0 + this.f35452k + this.f35269I1);
        }
        this.f35220B1 = iQ0;
        this.f35227C1 = streamIdOneStream;
        this.f35213A1 = epgChannelId;
        this.f35234D1 = this.f35420f2;
        if (this.f35413e2.equals("m3u")) {
            c2966aF = C2966a.f();
            strValueOf = this.f35234D1;
        } else if (this.f35413e2.equals("onestream_api")) {
            c2966aF = C2966a.f();
            strValueOf = this.f35227C1;
        } else {
            c2966aF = C2966a.f();
            strValueOf = String.valueOf(this.f35220B1);
        }
        c2966aF.A(strValueOf);
        this.f35434h2.setTitle(iR0 + " - " + name);
        this.f35265H4 = iR0 + " - " + name;
        this.f35434h2.t1();
        if (!f35205Y5) {
            if (this.f35434h2.getFullScreenValue().booleanValue()) {
                f35205Y5 = this.f35434h2.getFullScreenValue().booleanValue();
            } else {
                f35205Y5 = false;
            }
        }
        if (this.f35476n2.booleanValue()) {
            if (this.f35413e2.equals("m3u")) {
                this.f35434h2.z1(Uri.parse(this.f35420f2), f35205Y5, name);
            } else {
                if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("stalker_api")) {
                    this.f35434h2.z1(Uri.parse(this.f35555y4), f35205Y5, name);
                    str4 = this.f35555y4;
                } else if (this.f35413e2.equals("onestream_api")) {
                    try {
                        jSONObject = new JSONObject(this.f35420f2);
                        String str8 = this.f35439i0;
                        str = "m3u8";
                        str2 = "ts";
                        if (str8 == null || str8.isEmpty() || !this.f35439i0.equals(".ts")) {
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
                    } catch (Exception unused2) {
                    }
                    try {
                        String str9 = this.f35439i0;
                        if (str9 != null && !str9.isEmpty() && this.f35439i0.equals(".m3u8")) {
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
                    } catch (Exception unused3) {
                        str7 = string;
                        string = str7;
                    }
                    this.f35434h2.z1(Uri.parse(string), f35205Y5, name);
                } else {
                    this.f35434h2.z1(Uri.parse(this.f35410e + iQ0 + this.f35439i0), f35205Y5, name);
                    str4 = this.f35410e + iQ0 + ".m3u8";
                }
                this.f35258G4 = String.valueOf(Uri.parse(str4));
                NSTIJKPlayerSky nSTIJKPlayerSky = this.f35434h2;
                nSTIJKPlayerSky.f37044H = 0;
                nSTIJKPlayerSky.f37050J = false;
                nSTIJKPlayerSky.start();
            }
            str4 = this.f35420f2;
            this.f35258G4 = String.valueOf(Uri.parse(str4));
            NSTIJKPlayerSky nSTIJKPlayerSky2 = this.f35434h2;
            nSTIJKPlayerSky2.f37044H = 0;
            nSTIJKPlayerSky2.f37050J = false;
            nSTIJKPlayerSky2.start();
        }
        k kVar = null;
        this.f35304N1.removeCallbacksAndMessages(null);
        this.f35253G = epgChannelId;
        this.f35260H = streamIcon;
        this.f35272I4 = streamIcon;
        this.f35434h2.setCurrentEpgChannelID(epgChannelId);
        this.f35434h2.setCurrentStreamID(String.valueOf(this.f35220B1));
        this.f35434h2.setCurrentChannelLogo(this.f35260H);
        i4(this.f35260H);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("stalker_api")) {
            k4(String.valueOf(this.f35220B1));
        } else {
            this.f35553y2 = new H(this, this.f35253G, kVar).execute(new String[0]);
        }
        ListView listView = this.f35274J;
        if (listView != null) {
            listView.requestFocus();
        }
        this.f35379Y1 = Boolean.TRUE;
    }

    private void N3() {
        int currentWindowIndex = this.f35434h2.getCurrentWindowIndex();
        if (currentWindowIndex == 0) {
            this.f35434h2.setCurrentWindowIndex(this.f35558z0.size() - 1);
        } else {
            this.f35434h2.setCurrentWindowIndex(currentWindowIndex - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P3(int i9, String str) {
        try {
            List list = this.f35223B4;
            if (list == null) {
                m7.w.X();
                return;
            }
            list.remove(Integer.valueOf(i9));
            StringBuilder sb = new StringBuilder();
            for (int i10 = 0; i10 < this.f35223B4.size(); i10++) {
                sb.append(this.f35223B4.get(i10));
                sb.append(",");
            }
            this.f35223B4.add(Integer.valueOf(i9));
            String strSubstring = sb.toString().contains(",") ? sb.substring(0, sb.lastIndexOf(",")) : sb.toString();
            this.f35237D4 = i9;
            this.f35230C4.c(SharepreferenceDBHandler.getLoggedInMacAddress(this.f35404d), SharepreferenceDBHandler.getStalkerToken(this.f35404d), null, strSubstring, "removed", str);
        } catch (Exception unused) {
            m7.w.X();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R3(String str, String str2) {
        LiveStreamDBHandler liveStreamDBHandler;
        Context context = this.f35404d;
        if (context == null || this.f35351U == null || (liveStreamDBHandler = this.f35337S) == null) {
            return;
        }
        liveStreamDBHandler.deleteFavourite(str, SharepreferenceDBHandler.getUserID(context));
        this.f35351U.notifyDataSetChanged();
        m7.w.P0(this.f35404d, str2 + this.f35404d.getResources().getString(a7.j.f13223c6));
    }

    private void T2(int i9) {
        if (f35209c6) {
            return;
        }
        this.f35434h2.f37097a1 = new n();
        NSTIJKPlayerSky nSTIJKPlayerSky = this.f35434h2;
        nSTIJKPlayerSky.f37095Z0.postDelayed(nSTIJKPlayerSky.f37097a1, i9);
    }

    private void W3() {
        this.f35305N2 = new k();
    }

    private void X3() {
        String str;
        String str2;
        RecyclerView recyclerView;
        this.f35547x3.startAnimation(this.f35443i4);
        this.f35547x3.setVisibility(8);
        this.f35498q3.startAnimation(this.f35513s4);
        this.f35498q3.setVisibility(0);
        this.f35320P3.setVisibility(0);
        this.f35313O3.setVisibility(8);
        this.f35281K.setVisibility(8);
        if (this.f35471m4 != null && (recyclerView = this.f35313O3) != null) {
            recyclerView.setAdapter(null);
        }
        String str3 = this.f35321P4;
        if ((str3 != null && str3.equals("-1")) || (((str = this.f35321P4) != null && str.equals("0")) || ((str2 = this.f35321P4) != null && str2.equals("-6")))) {
            String str4 = this.f35321P4;
            this.f35361V2 = str4;
            this.f35368W2 = str4;
        }
        N n9 = this.f35471m4;
        if (n9 == null) {
            this.f35471m4 = new N(this.f35404d, this.f35361V2, "player", this.f35286K4, "");
        } else {
            n9.B0(this.f35361V2, "player", this.f35286K4);
        }
        this.f35368W2 = this.f35361V2;
        this.f35313O3.setVisibility(0);
        O2();
        this.f35313O3.setAdapter(this.f35471m4);
        this.f35313O3.setLayoutManager(this.f35485o4);
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
    public java.util.HashMap Y3(java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.Y3(java.lang.String):java.util.HashMap");
    }

    private void Z2() {
        AsyncTask asyncTask = this.f35539w2;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            SharepreferenceDBHandler.setAsyncTaskStatus(0, this.f35404d);
        } else {
            SharepreferenceDBHandler.setAsyncTaskStatus(1, this.f35404d);
            this.f35539w2.cancel(true);
        }
    }

    private HashMap Z3(StalkerShortEPGCallback stalkerShortEPGCallback) {
        int i9;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        HashMap map = new HashMap();
        if (this.f35337S != null) {
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
                int iM = m7.w.M(j9, j10, this.f35404d);
                if (iM != 0) {
                    int i10 = 100 - iM;
                    if (i10 == 0 || name == null || name.equals("")) {
                        i9 = i10;
                    } else {
                        arrayList4.add(0, String.valueOf(i10));
                        StringBuilder sb = new StringBuilder();
                        i9 = i10;
                        sb.append(this.f35404d.getResources().getString(a7.j.f13058L4));
                        sb.append(" ");
                        sb.append(name);
                        arrayList.add(0, sb.toString());
                        arrayList.add(1, this.f35432h0.format(lValueOf) + " - " + this.f35432h0.format(lValueOf2));
                        arrayList.add(2, descr);
                    }
                    iM = i9;
                }
                arrayList2.add(0, this.f35432h0.format(lValueOf) + " - " + this.f35432h0.format(lValueOf2));
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
                        arrayList.add(3, this.f35404d.getResources().getString(a7.j.f13201a4) + " " + name2);
                        arrayList.add(4, this.f35432h0.format(lValueOf3) + " - " + this.f35432h0.format(lValueOf4));
                        arrayList.add(5, descr2);
                    }
                    arrayList2.add(3, this.f35432h0.format(lValueOf3) + " - " + this.f35432h0.format(lValueOf4));
                    arrayList2.add(4, name2);
                    arrayList2.add(5, descr2);
                }
                if (2 < stalkerShortEPGCallback.getJs().size()) {
                    long jIntValue5 = stalkerShortEPGCallback.getJs().get(2).getStartTimestamp().intValue();
                    long jIntValue6 = stalkerShortEPGCallback.getJs().get(2).getStopTimestamp().intValue();
                    String name3 = stalkerShortEPGCallback.getJs().get(2).getName();
                    String descr3 = stalkerShortEPGCallback.getJs().get(2).getDescr();
                    arrayList2.add(6, this.f35432h0.format(Long.valueOf(jIntValue5 * 1000)) + " - " + this.f35432h0.format(Long.valueOf(jIntValue6 * 1000)));
                    arrayList2.add(7, name3);
                    arrayList2.add(8, descr3);
                }
                if (3 < stalkerShortEPGCallback.getJs().size()) {
                    long jIntValue7 = stalkerShortEPGCallback.getJs().get(3).getStartTimestamp().intValue();
                    long jIntValue8 = stalkerShortEPGCallback.getJs().get(3).getStopTimestamp().intValue();
                    String name4 = stalkerShortEPGCallback.getJs().get(3).getName();
                    String descr4 = stalkerShortEPGCallback.getJs().get(3).getDescr();
                    arrayList2.add(9, this.f35432h0.format(Long.valueOf(jIntValue7 * 1000)) + " - " + this.f35432h0.format(Long.valueOf(jIntValue8 * 1000)));
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

    public static boolean a3() {
        ProgressBar progressBar = f35210d6;
        return progressBar != null && progressBar.getVisibility() == 0;
    }

    public static long b3(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c4() {
        LinearLayout linearLayout = this.f35550y;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d4() {
        ProgressBar progressBar = this.f35543x;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    private void e4() {
        if (this.f35491p3.getVisibility() == 8) {
            this.f35491p3.startAnimation(this.f35450j4);
            this.f35491p3.setVisibility(0);
            this.f35236D3.requestFocus();
        }
    }

    private void f3() {
        ImageView imageView = this.f35519t3;
        imageView.setOnFocusChangeListener(new G(imageView));
        ImageView imageView2 = this.f35526u3;
        imageView2.setOnFocusChangeListener(new G(imageView2));
        ImageView imageView3 = this.f35243E3;
        imageView3.setOnFocusChangeListener(new G(imageView3));
        ImageView imageView4 = this.f35250F3;
        imageView4.setOnFocusChangeListener(new G(imageView4));
        ImageView imageView5 = this.f35257G3;
        imageView5.setOnFocusChangeListener(new G(imageView5));
        LinearLayout linearLayout = this.f35278J3;
        linearLayout.setOnFocusChangeListener(new G(linearLayout));
        LinearLayout linearLayout2 = this.f35215A3;
        linearLayout2.setOnFocusChangeListener(new G(linearLayout2));
        LinearLayout linearLayout3 = this.f35271I3;
        linearLayout3.setOnFocusChangeListener(new G(linearLayout3));
        ImageView imageView6 = this.f35229C3;
        imageView6.setOnFocusChangeListener(new G(imageView6));
        ImageView imageView7 = this.f35236D3;
        imageView7.setOnFocusChangeListener(new G(imageView7));
        ImageView imageView8 = this.f35505r3;
        imageView8.setOnFocusChangeListener(new G(imageView8));
        ImageView imageView9 = this.f35505r3;
        imageView9.setOnFocusChangeListener(new G(imageView9));
        RelativeLayout relativeLayout = this.f35563z5;
        relativeLayout.setOnFocusChangeListener(new G(relativeLayout));
        ImageView imageView10 = this.f35556y5;
        imageView10.setOnFocusChangeListener(new G(imageView10));
        LinearLayout linearLayout4 = this.f35217A5;
        linearLayout4.setOnFocusChangeListener(new G(linearLayout4));
        LinearLayout linearLayout5 = this.f35224B5;
        linearLayout5.setOnFocusChangeListener(new G(linearLayout5));
        CheckBox checkBox = this.f35363V4;
        checkBox.setOnFocusChangeListener(new G(checkBox));
        CheckBox checkBox2 = this.f35370W4;
        checkBox2.setOnFocusChangeListener(new G(checkBox2));
        CheckBox checkBox3 = this.f35376X4;
        checkBox3.setOnFocusChangeListener(new G(checkBox3));
        CheckBox checkBox4 = this.f35382Y4;
        checkBox4.setOnFocusChangeListener(new G(checkBox4));
        LinearLayout linearLayout6 = this.f35231C5;
        linearLayout6.setOnFocusChangeListener(new G(linearLayout6));
        CheckBox checkBox5 = this.f35388Z4;
        checkBox5.setOnFocusChangeListener(new G(checkBox5));
        CheckBox checkBox6 = this.f35393a5;
        checkBox6.setOnFocusChangeListener(new G(checkBox6));
        CheckBox checkBox7 = this.f35398b5;
        checkBox7.setOnFocusChangeListener(new G(checkBox7));
        CheckBox checkBox8 = this.f35403c5;
        checkBox8.setOnFocusChangeListener(new G(checkBox8));
        CheckBox checkBox9 = this.f35409d5;
        checkBox9.setOnFocusChangeListener(new G(checkBox9));
        LinearLayout linearLayout7 = this.f35238D5;
        linearLayout7.setOnFocusChangeListener(new G(linearLayout7));
        CheckBox checkBox10 = this.f35423f5;
        checkBox10.setOnFocusChangeListener(new G(checkBox10));
        CheckBox checkBox11 = this.f35430g5;
        checkBox11.setOnFocusChangeListener(new G(checkBox11));
        CheckBox checkBox12 = this.f35437h5;
        checkBox12.setOnFocusChangeListener(new G(checkBox12));
        CheckBox checkBox13 = this.f35444i5;
        checkBox13.setOnFocusChangeListener(new G(checkBox13));
        EditText editText = this.f35521t5;
        editText.setOnFocusChangeListener(new G(editText));
        TextView textView = this.f35356U4;
        textView.setOnFocusChangeListener(new G(textView));
        LinearLayout linearLayout8 = this.f35245E5;
        linearLayout8.setOnFocusChangeListener(new G(linearLayout8));
    }

    private void f4(Activity activity) {
        new l((NSTIJKPlayerSkyActivity) activity, activity).show();
    }

    private void g4() {
        ListView listView;
        try {
            if (AbstractC2237a.f44480Y.booleanValue()) {
                findViewById(f.f12491p).setOnClickListener(this);
            }
            this.f35378Y0.setVisibility(0);
            this.f35384Z0.setVisibility(0);
            this.f35389a1.setVisibility(0);
            this.f35394b1.setVisibility(0);
            this.f35399c1.setVisibility(0);
            this.f35366W0.setVisibility(0);
            getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f35405d1.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = 0;
            this.f35405d1.setLayoutParams(layoutParams);
            getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            f35205Y5 = false;
            if (this.f35338S0) {
                if (!this.f35345T0 || this.f35352U0.equals("")) {
                    SharedPreferences sharedPreferences = getSharedPreferences("currentlyPlayingVideoPosition", 0);
                    this.f35383Z = sharedPreferences;
                    this.f35274J.setSelection(sharedPreferences.getInt("currentlyPlayingVideoPosition", 0));
                    this.f35338S0 = false;
                    this.f35345T0 = false;
                } else {
                    String str = this.f35412e1;
                    if (str != null && !str.equals("") && this.f35412e1.equals("0")) {
                        K2();
                    }
                }
                listView = this.f35274J;
                if (listView == null) {
                    return;
                }
            } else {
                listView = this.f35274J;
                if (listView == null) {
                    return;
                }
            }
            listView.requestFocus();
        } catch (Exception e9) {
            Log.e("exection", "" + e9);
        }
    }

    public static String h3(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m4(int i9, String str, String str2) {
        String string;
        Uri uri;
        JSONObject jSONObject;
        String str3;
        String str4;
        String str5;
        String str6 = "";
        try {
            ArrayList arrayList = this.f35558z0;
            if (arrayList == null || arrayList.size() <= 0) {
                return;
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("m3u")) {
                this.f35434h2.z1(Uri.parse(str2), f35205Y5, str);
                uri = Uri.parse(str2);
            } else if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("stalker_api")) {
                this.f35434h2.z1(Uri.parse(this.f35555y4), f35205Y5, str);
                uri = Uri.parse(this.f35555y4);
            } else if (this.f35413e2.equals("onestream_api")) {
                try {
                    jSONObject = new JSONObject(((LiveStreamsDBModel) this.f35558z0.get(i9)).getUrl());
                    String str7 = this.f35439i0;
                    str3 = "m3u8";
                    str4 = "ts";
                    if (str7 == null || str7.isEmpty() || !this.f35439i0.equals(".ts")) {
                        string = "";
                        str5 = string;
                    } else {
                        Iterator<String> itKeys = jSONObject.keys();
                        while (true) {
                            if (!itKeys.hasNext()) {
                                str5 = "";
                                break;
                            } else if (itKeys.next().equals("ts")) {
                                str5 = "ts";
                                break;
                            }
                        }
                        if (str5.equals("")) {
                            while (true) {
                                if (!itKeys.hasNext()) {
                                    break;
                                } else if (itKeys.next().equals("m3u8")) {
                                    str5 = "m3u8";
                                    break;
                                }
                            }
                        }
                        string = jSONObject.getString(str5);
                    }
                } catch (Exception unused) {
                }
                try {
                    String str8 = this.f35439i0;
                    if (str8 != null && !str8.isEmpty() && this.f35439i0.equals(".m3u8")) {
                        Iterator<String> itKeys2 = jSONObject.keys();
                        while (true) {
                            if (!itKeys2.hasNext()) {
                                str3 = str5;
                                break;
                            } else if (itKeys2.next().equals("m3u8")) {
                                break;
                            }
                        }
                        if (str3.equals("")) {
                            while (itKeys2.hasNext()) {
                                if (itKeys2.next().equals("ts")) {
                                    break;
                                }
                            }
                            str4 = str3;
                            string = jSONObject.getString(str4);
                        } else {
                            str4 = str3;
                            string = jSONObject.getString(str4);
                        }
                    }
                } catch (Exception unused2) {
                    str6 = string;
                    string = str6;
                }
                this.f35434h2.z1(Uri.parse(string), f35205Y5, str);
                uri = Uri.parse(string);
            } else {
                this.f35434h2.z1(Uri.parse(this.f35410e + m7.w.q0(((LiveStreamsDBModel) this.f35558z0.get(i9)).getStreamId()) + this.f35439i0), f35205Y5, str);
                uri = Uri.parse(this.f35410e + m7.w.q0(((LiveStreamsDBModel) this.f35558z0.get(i9)).getStreamId()) + ".m3u8");
            }
            this.f35258G4 = String.valueOf(uri);
            NSTIJKPlayerSky nSTIJKPlayerSky = this.f35434h2;
            nSTIJKPlayerSky.f37044H = 0;
            nSTIJKPlayerSky.f37050J = false;
            nSTIJKPlayerSky.start();
            k kVar = null;
            this.f35304N1.removeCallbacksAndMessages(null);
            this.f35253G = ((LiveStreamsDBModel) this.f35558z0.get(i9)).getEpgChannelId();
            String streamIcon = ((LiveStreamsDBModel) this.f35558z0.get(i9)).getStreamIcon();
            this.f35260H = streamIcon;
            this.f35272I4 = streamIcon;
            this.f35434h2.setCurrentEpgChannelID(this.f35253G);
            this.f35434h2.setCurrentStreamID(((LiveStreamsDBModel) this.f35558z0.get(i9)).getStreamId());
            this.f35434h2.setCurrentChannelLogo(this.f35260H);
            i4(this.f35260H);
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("stalker_api")) {
                k4(((LiveStreamsDBModel) this.f35558z0.get(i9)).getStreamId());
            } else {
                this.f35553y2 = new H(this, this.f35253G, kVar).execute(new String[0]);
            }
        } catch (Exception unused3) {
        }
    }

    private ArrayList n3() {
        ArrayList<PasswordStatusDBModel> allPasswordStatus = this.f35337S.getAllPasswordStatus(SharepreferenceDBHandler.getUserID(this.f35404d));
        this.f35247F0 = allPasswordStatus;
        if (allPasswordStatus != null) {
            for (PasswordStatusDBModel passwordStatusDBModel : allPasswordStatus) {
                if (passwordStatusDBModel.getPasswordStatus().equals("1")) {
                    this.f35233D0.add(passwordStatusDBModel.getPasswordStatusCategoryId());
                }
            }
        }
        return this.f35233D0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n4(int i9, String str, String str2) {
        String string;
        Uri uri;
        JSONObject jSONObject;
        String str3;
        String str4;
        String str5;
        String str6 = "";
        try {
            ArrayList arrayList = this.f35558z0;
            if (arrayList == null || arrayList.size() <= 0) {
                return;
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("m3u")) {
                this.f35434h2.z1(Uri.parse(str2), f35205Y5, str);
                uri = Uri.parse(str2);
            } else if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("stalker_api")) {
                this.f35434h2.z1(Uri.parse(this.f35555y4), f35205Y5, str);
                uri = Uri.parse(this.f35555y4);
            } else if (this.f35413e2.equals("onestream_api")) {
                try {
                    jSONObject = new JSONObject(((LiveStreamsDBModel) this.f35558z0.get(i9)).getUrl());
                    String str7 = this.f35439i0;
                    str3 = "m3u8";
                    str4 = "ts";
                    if (str7 == null || str7.isEmpty() || !this.f35439i0.equals(".ts")) {
                        string = "";
                        str5 = string;
                    } else {
                        Iterator<String> itKeys = jSONObject.keys();
                        while (true) {
                            if (!itKeys.hasNext()) {
                                str5 = "";
                                break;
                            } else if (itKeys.next().equals("ts")) {
                                str5 = "ts";
                                break;
                            }
                        }
                        if (str5.equals("")) {
                            while (true) {
                                if (!itKeys.hasNext()) {
                                    break;
                                } else if (itKeys.next().equals("m3u8")) {
                                    str5 = "m3u8";
                                    break;
                                }
                            }
                        }
                        string = jSONObject.getString(str5);
                    }
                } catch (Exception unused) {
                }
                try {
                    String str8 = this.f35439i0;
                    if (str8 != null && !str8.isEmpty() && this.f35439i0.equals(".m3u8")) {
                        Iterator<String> itKeys2 = jSONObject.keys();
                        while (true) {
                            if (!itKeys2.hasNext()) {
                                str3 = str5;
                                break;
                            } else if (itKeys2.next().equals("m3u8")) {
                                break;
                            }
                        }
                        if (str3.equals("")) {
                            while (itKeys2.hasNext()) {
                                if (itKeys2.next().equals("ts")) {
                                    break;
                                }
                            }
                            str4 = str3;
                            string = jSONObject.getString(str4);
                        } else {
                            str4 = str3;
                            string = jSONObject.getString(str4);
                        }
                    }
                } catch (Exception unused2) {
                    str6 = string;
                    string = str6;
                }
                this.f35434h2.z1(Uri.parse(string), f35205Y5, str);
                uri = Uri.parse(string);
            } else {
                this.f35434h2.z1(Uri.parse(this.f35410e + m7.w.q0(((LiveStreamsDBModel) this.f35558z0.get(i9)).getStreamId()) + this.f35439i0), f35205Y5, str);
                uri = Uri.parse(this.f35410e + m7.w.q0(((LiveStreamsDBModel) this.f35558z0.get(i9)).getStreamId()) + ".m3u8");
            }
            this.f35258G4 = String.valueOf(uri);
            NSTIJKPlayerSky nSTIJKPlayerSky = this.f35434h2;
            nSTIJKPlayerSky.f37044H = 0;
            nSTIJKPlayerSky.f37050J = false;
            nSTIJKPlayerSky.start();
            k kVar = null;
            this.f35304N1.removeCallbacksAndMessages(null);
            this.f35253G = ((LiveStreamsDBModel) this.f35558z0.get(i9)).getEpgChannelId();
            String streamIcon = ((LiveStreamsDBModel) this.f35558z0.get(i9)).getStreamIcon();
            this.f35260H = streamIcon;
            this.f35272I4 = streamIcon;
            this.f35434h2.setCurrentEpgChannelID(this.f35253G);
            this.f35434h2.setCurrentStreamID(((LiveStreamsDBModel) this.f35558z0.get(i9)).getStreamId());
            this.f35434h2.setCurrentChannelLogo(this.f35260H);
            i4(this.f35260H);
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("stalker_api")) {
                k4(((LiveStreamsDBModel) this.f35558z0.get(i9)).getStreamId());
            } else {
                this.f35553y2 = new H(this, this.f35253G, kVar).execute(new String[0]);
            }
        } catch (Exception unused3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o3(ArrayList arrayList, ArrayList arrayList2) {
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
        } catch (Exception unused) {
            return false;
        }
    }

    private ArrayList p3(ArrayList arrayList, ArrayList arrayList2) {
        try {
            this.f35268I0 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                FavouriteDBModel favouriteDBModel = (FavouriteDBModel) it.next();
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        this.f35268I0.add(favouriteDBModel);
                        break;
                    }
                    if (favouriteDBModel.getCategoryID().equals((String) it2.next())) {
                        break;
                    }
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        return this.f35268I0;
    }

    private ArrayList q3(ArrayList arrayList, ArrayList arrayList2) {
        this.f35275J0 = new ArrayList();
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
                            this.f35275J0.add(favouriteM3UModel);
                            break;
                        }
                        if (favouriteM3UModel.getCategoryID().equals((String) it2.next())) {
                            break;
                        }
                    }
                }
            }
            return this.f35275J0;
        } catch (Exception unused) {
            return null;
        }
    }

    private void r3() {
        ProgressBar progressBar = this.f35536w;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView = this.f35501r;
        if (textView != null) {
            textView.setText(this.f35404d.getResources().getString(a7.j.f13078N4));
        }
        TextView textView2 = this.f35508s;
        if (textView2 != null) {
            textView2.setText("");
        }
        TextView textView3 = this.f35515t;
        if (textView3 != null) {
            textView3.setText(this.f35404d.getResources().getString(a7.j.f13221c4));
        }
        TextView textView4 = this.f35522u;
        if (textView4 != null) {
            textView4.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3() {
        if (this.f35547x3.getVisibility() == 0) {
            this.f35547x3.startAnimation(this.f35443i4);
            if (this.f35456k3.getVisibility() == 0) {
                this.f35456k3.startAnimation(this.f35443i4);
            }
            if (this.f35533v3.getVisibility() == 0) {
                this.f35533v3.startAnimation(this.f35443i4);
            }
            if (this.f35470m3.getVisibility() == 0) {
                this.f35470m3.startAnimation(this.f35443i4);
            }
            if (this.f35540w3.getVisibility() == 0) {
                this.f35540w3.startAnimation(this.f35443i4);
            }
            if (this.f35463l3.getVisibility() == 0) {
                this.f35463l3.startAnimation(this.f35443i4);
            }
            this.f35547x3.setVisibility(8);
            if (this.f35456k3.getVisibility() == 0) {
                this.f35456k3.setVisibility(8);
            }
            if (this.f35533v3.getVisibility() == 0) {
                this.f35533v3.setVisibility(8);
            }
            if (this.f35470m3.getVisibility() == 0) {
                this.f35470m3.setVisibility(8);
            }
            if (this.f35540w3.getVisibility() == 0) {
                this.f35540w3.setVisibility(8);
            }
            if (this.f35463l3.getVisibility() == 0) {
                this.f35463l3.setVisibility(8);
            }
        }
    }

    private void u1() {
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f35358V = sharedPreferences;
        String liveStreamCategoryName = "";
        this.f35273I5 = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        String str = new SimpleDateFormat("yyyy-MM").format(new Date());
        String strO0 = m7.w.o0(AbstractC2237a.f44469S0 + "*Njh0&$@HAH828283636JSJSHS*" + AbstractC1232b.f17695b + "*" + str);
        if (this.f35266H5.equalsIgnoreCase("")) {
            liveStreamCategoryName = "UnCategories";
        } else {
            LiveStreamCategoryIdDBModel channelCatNameFromSelectedCatId = this.f35337S.getChannelCatNameFromSelectedCatId(this.f35266H5);
            if (channelCatNameFromSelectedCatId != null) {
                liveStreamCategoryName = channelCatNameFromSelectedCatId.getLiveStreamCategoryName();
            }
        }
        Retrofit retrofitE0 = m7.w.E0(this.f35404d);
        if (retrofitE0 != null) {
            RetrofitPost retrofitPost = (RetrofitPost) retrofitE0.create(RetrofitPost.class);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("a", AbstractC2237a.f44469S0);
            jsonObject.addProperty("s", AbstractC2237a.f44471T0);
            jsonObject.addProperty("r", AbstractC1232b.f17695b);
            jsonObject.addProperty("d", str);
            jsonObject.addProperty("sc", strO0);
            jsonObject.addProperty("action", "addreport");
            jsonObject.addProperty(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, this.f35273I5);
            jsonObject.addProperty("macaddress", this.f35280J5);
            jsonObject.addProperty("section", this.f35259G5);
            jsonObject.addProperty("section_category", liveStreamCategoryName);
            jsonObject.addProperty("report_title", this.f35294L5);
            jsonObject.addProperty("report_sub_title", this.f35301M5);
            jsonObject.addProperty("report_cases", this.f35336R5);
            jsonObject.addProperty("report_custom_message", this.f35315O5);
            jsonObject.addProperty("stream_name", this.f35287K5);
            jsonObject.addProperty("stream_id", Integer.valueOf(this.f35220B1));
            retrofitPost.clientsReportRequest(jsonObject).enqueue(new w());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u3() {
        LinearLayout linearLayout = this.f35550y;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v3() {
        ProgressBar progressBar = this.f35543x;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    private void x3() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    private void y3() {
        try {
            this.f35211A = true;
            this.f35296M0.e();
            TextView textView = this.f35310O0;
            if (textView == null || this.f35218B) {
                return;
            }
            textView.setVisibility(8);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean z3() {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.z3():boolean");
    }

    public boolean B3() {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 23) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        if (i9 >= 33) {
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

    public void C3(String str, String str2) {
        this.f35368W2 = str;
        O2();
    }

    @Override // z7.j
    public void D0(String str) {
    }

    public void E3() {
        if (this.f35434h2 == null) {
            return;
        }
        U2(0);
        int i9 = Build.VERSION.SDK_INT;
        Rational rational = (this.f35434h2.v1() == 0 || this.f35434h2.u1() == 0) ? new Rational(this.f35434h2.getWidth(), this.f35434h2.getHeight()) : new Rational(this.f35434h2.v1(), this.f35434h2.u1());
        if (i9 >= 26) {
            try {
                try {
                    g3(false);
                    this.f35244E4.setAspectRatio(rational).build();
                    enterPictureInPictureMode(this.f35244E4.build());
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                g3(false);
                this.f35244E4.setAspectRatio(new Rational(this.f35434h2.getWidth(), this.f35434h2.getHeight())).build();
                enterPictureInPictureMode(this.f35244E4.build());
            }
        }
    }

    @Override // z7.g
    public void F(StalkerGetSeriesCategoriesCallback stalkerGetSeriesCategoriesCallback) {
    }

    @Override // z7.g
    public void G(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, Z.E e9, int i9) {
    }

    @Override // z7.g
    public void G0(StalkerTokenCallback stalkerTokenCallback) {
    }

    public void G3() {
        y3();
        this.f35560z2 = false;
        this.f35214A2 = 0;
        AsyncTask asyncTask = this.f35546x2;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            ArrayList arrayList = this.f35495q0;
            if (arrayList != null && arrayList.size() > 0) {
                this.f35453k0 = this.f35453k0 != this.f35495q0.size() + (-1) ? this.f35453k0 + 1 : 0;
                if (this.f35453k0 != 0 || this.f35530v0 == null) {
                    ArrayList arrayList2 = this.f35495q0;
                    if (arrayList2 == null || arrayList2.size() <= 0 || this.f35453k0 >= this.f35495q0.size()) {
                        return;
                    }
                    String liveStreamCategoryID = ((LiveStreamCategoryIdDBModel) this.f35495q0.get(this.f35453k0)).getLiveStreamCategoryID();
                    String liveStreamCategoryName = ((LiveStreamCategoryIdDBModel) this.f35495q0.get(this.f35453k0)).getLiveStreamCategoryName();
                    this.f35412e1 = liveStreamCategoryID;
                    this.f35419f1 = liveStreamCategoryName;
                    if (liveStreamCategoryID != null && !liveStreamCategoryID.equals("") && this.f35412e1.equals("-1")) {
                        Q2();
                        return;
                    }
                    String str = this.f35412e1;
                    if (str == null || str.equals("") || !this.f35412e1.equals("-6")) {
                        M2();
                        return;
                    } else {
                        R2();
                        return;
                    }
                }
                this.f35412e1 = "0";
                this.f35419f1 = this.f35404d.getResources().getString(a7.j.f13426x);
            }
            K2();
        }
    }

    @Override // z7.g
    public void H(String str) {
    }

    public final void H2(String str, int i9, String str2, String str3, String str4, String str5) {
        if (this.f35404d == null || this.f35351U == null || this.f35241E1 == null) {
            return;
        }
        FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
        favouriteDBModel.setCategoryID(str);
        favouriteDBModel.setStreamID(i9);
        favouriteDBModel.setStreamIDOneStream(str5);
        favouriteDBModel.setNum(str3);
        favouriteDBModel.setName(str2);
        favouriteDBModel.setUserID(SharepreferenceDBHandler.getUserID(this.f35404d));
        this.f35241E1.addToFavourite(favouriteDBModel, str4);
        this.f35351U.notifyDataSetChanged();
        m7.w.P0(this.f35404d, str2 + this.f35404d.getResources().getString(a7.j.f13356q));
    }

    public void H3() {
        LinearLayout linearLayout = this.f35327Q3;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f35320P3;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    @Override // z7.g
    public void I(m0.x xVar, int i9) {
    }

    public void I3() {
        AbstractC2237a.f44480Y = Boolean.TRUE;
        this.f35225C = true;
        this.f35480o.setVisibility(0);
        this.f35487p.setText(this.f35404d.getResources().getString(a7.j.f13261g4));
        this.f35559z1.setVisibility(8);
        if (AbstractC2237a.f44434B.booleanValue()) {
            findViewById(f.Sm).setVisibility(8);
        }
    }

    public void K2() {
        Z2();
        this.f35539w2 = new E().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels");
    }

    public String L2() {
        LiveStreamDBHandler liveStreamDBHandler;
        String str;
        String string;
        try {
            this.f35214A2 = 0;
            ArrayList arrayList = this.f35530v0;
            if (arrayList != null && this.f35516t0 != null) {
                arrayList.clear();
                this.f35516t0.clear();
            }
            if (this.f35286K4.equals("true")) {
                liveStreamDBHandler = this.f35337S;
                str = "radio_streams";
            } else {
                liveStreamDBHandler = this.f35337S;
                str = "live";
            }
            this.f35530v0 = liveStreamDBHandler.getAllLiveStreasWithCategoryId("0", str);
            ArrayList arrayList2 = this.f35537w0;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone(this.f35291L2.C()));
            String str2 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + m7.w.S(this.f35404d)));
            boolean zB = this.f35291L2.B();
            ArrayList<XMLTVProgrammePojo> ePGTesting = zB ? this.f35337S.getEPGTesting(null, str2) : null;
            this.f35383Z = getSharedPreferences("currentlyPlayingVideo", 0);
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("m3u")) {
                string = this.f35377Y.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", "");
            } else {
                SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("onestream_api");
                string = this.f35377Y.getString("currentlyPlayingVideo", "");
            }
            ArrayList arrayList3 = this.f35530v0;
            if (arrayList3 == null || arrayList3.size() <= 0) {
                return "all_channels";
            }
            for (int i9 = 0; i9 < this.f35530v0.size(); i9++) {
                if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("m3u")) {
                    if (((LiveStreamsDBModel) this.f35530v0.get(i9)).getUrl().equals(string)) {
                        this.f35214A2 = i9;
                    }
                } else if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("onestream_api")) {
                    if (((LiveStreamsDBModel) this.f35530v0.get(i9)).getStreamIdOneStream().equals(string)) {
                        this.f35214A2 = i9;
                    }
                } else if (((LiveStreamsDBModel) this.f35530v0.get(i9)).getStreamId().equals(string)) {
                    this.f35214A2 = i9;
                }
                LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                liveStreamsDBModel.setNum(((LiveStreamsDBModel) this.f35530v0.get(i9)).getNum());
                liveStreamsDBModel.setName(((LiveStreamsDBModel) this.f35530v0.get(i9)).getName());
                liveStreamsDBModel.setStreamType(((LiveStreamsDBModel) this.f35530v0.get(i9)).getStreamType());
                liveStreamsDBModel.setStreamId(((LiveStreamsDBModel) this.f35530v0.get(i9)).getStreamId());
                liveStreamsDBModel.setStreamIdOneStream(((LiveStreamsDBModel) this.f35530v0.get(i9)).getStreamIdOneStream());
                liveStreamsDBModel.setStreamIcon(((LiveStreamsDBModel) this.f35530v0.get(i9)).getStreamIcon());
                liveStreamsDBModel.setEpgChannelId(((LiveStreamsDBModel) this.f35530v0.get(i9)).getEpgChannelId());
                liveStreamsDBModel.setAdded(((LiveStreamsDBModel) this.f35530v0.get(i9)).getAdded());
                liveStreamsDBModel.setCategoryId(((LiveStreamsDBModel) this.f35530v0.get(i9)).getCategoryId());
                liveStreamsDBModel.setCustomSid(((LiveStreamsDBModel) this.f35530v0.get(i9)).getCustomSid());
                liveStreamsDBModel.setTvArchive(((LiveStreamsDBModel) this.f35530v0.get(i9)).getTvArchive());
                liveStreamsDBModel.setDirectSource(((LiveStreamsDBModel) this.f35530v0.get(i9)).getDirectSource());
                liveStreamsDBModel.setTvArchiveDuration(((LiveStreamsDBModel) this.f35530v0.get(i9)).getTvArchiveDuration());
                liveStreamsDBModel.setTypeName(((LiveStreamsDBModel) this.f35530v0.get(i9)).getTypeName());
                liveStreamsDBModel.setCategoryName(((LiveStreamsDBModel) this.f35530v0.get(i9)).getCategoryName());
                liveStreamsDBModel.setSeriesNo(((LiveStreamsDBModel) this.f35530v0.get(i9)).getSeriesNo());
                liveStreamsDBModel.setLive(((LiveStreamsDBModel) this.f35530v0.get(i9)).getLive());
                liveStreamsDBModel.setContaiinerExtension(((LiveStreamsDBModel) this.f35530v0.get(i9)).getContaiinerExtension());
                liveStreamsDBModel.setUrl(((LiveStreamsDBModel) this.f35530v0.get(i9)).getUrl());
                liveStreamsDBModel.setCmd(((LiveStreamsDBModel) this.f35530v0.get(i9)).getCmd());
                if (zB && ePGTesting != null && ePGTesting.size() > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= ePGTesting.size()) {
                            break;
                        }
                        if (((LiveStreamsDBModel) this.f35530v0.get(i9)).getEpgChannelId().equals(ePGTesting.get(i10).getChannel())) {
                            int iM = m7.w.M(m7.w.x(ePGTesting.get(i10).getStart(), this.f35404d), m7.w.x(ePGTesting.get(i10).getStop(), this.f35404d), this.f35404d);
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
                this.f35537w0.add(liveStreamsDBModel);
            }
            return "all_channels";
        } catch (Exception unused) {
            return "all_channels";
        }
    }

    @Override // z7.g
    public void M(StalkerGetAdCallback stalkerGetAdCallback, int i9) {
    }

    @Override // z7.j
    public void M0(String str) {
        try {
            m7.w.X();
        } catch (Exception unused) {
        }
    }

    public void M2() {
        Z2();
        this.f35539w2 = new E().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels_with_cat");
    }

    public String N2() {
        LiveStreamDBHandler liveStreamDBHandler;
        String str;
        String str2;
        try {
            this.f35214A2 = 0;
            ArrayList arrayList = this.f35530v0;
            if (arrayList != null && this.f35516t0 != null) {
                arrayList.clear();
                this.f35516t0.clear();
            }
            if (this.f35286K4.equals("true")) {
                liveStreamDBHandler = this.f35337S;
                str = this.f35412e1;
                str2 = "radio_streams";
            } else {
                liveStreamDBHandler = this.f35337S;
                str = this.f35412e1;
                str2 = "live";
            }
            this.f35212A0 = liveStreamDBHandler.getAllLiveStreasWithCategoryId(str, str2);
            this.f35530v0 = this.f35212A0;
            ArrayList arrayList2 = this.f35537w0;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone(this.f35291L2.C()));
            String str3 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + m7.w.S(this.f35404d)));
            boolean zB = this.f35291L2.B();
            ArrayList<XMLTVProgrammePojo> ePGTesting = zB ? this.f35337S.getEPGTesting(null, str3) : null;
            this.f35383Z = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("m3u") ? this.f35377Y.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", "") : this.f35377Y.getString("currentlyPlayingVideo", "");
            ArrayList arrayList3 = this.f35530v0;
            if (arrayList3 == null || arrayList3.size() <= 0) {
                return "all_channels_with_cat";
            }
            for (int i9 = 0; i9 < this.f35530v0.size(); i9++) {
                if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("m3u")) {
                    if (((LiveStreamsDBModel) this.f35530v0.get(i9)).getUrl().equals(string)) {
                        this.f35214A2 = i9;
                    }
                } else if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("onestream_api")) {
                    if (((LiveStreamsDBModel) this.f35530v0.get(i9)).getStreamIdOneStream().equals(string)) {
                        this.f35214A2 = i9;
                    }
                } else if (((LiveStreamsDBModel) this.f35530v0.get(i9)).getStreamId().equals(string)) {
                    this.f35214A2 = i9;
                }
                LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                liveStreamsDBModel.setNum(((LiveStreamsDBModel) this.f35530v0.get(i9)).getNum());
                liveStreamsDBModel.setName(((LiveStreamsDBModel) this.f35530v0.get(i9)).getName());
                liveStreamsDBModel.setStreamType(((LiveStreamsDBModel) this.f35530v0.get(i9)).getStreamType());
                liveStreamsDBModel.setStreamId(((LiveStreamsDBModel) this.f35530v0.get(i9)).getStreamId());
                liveStreamsDBModel.setStreamIdOneStream(((LiveStreamsDBModel) this.f35530v0.get(i9)).getStreamIdOneStream());
                liveStreamsDBModel.setStreamIcon(((LiveStreamsDBModel) this.f35530v0.get(i9)).getStreamIcon());
                liveStreamsDBModel.setEpgChannelId(((LiveStreamsDBModel) this.f35530v0.get(i9)).getEpgChannelId());
                liveStreamsDBModel.setAdded(((LiveStreamsDBModel) this.f35530v0.get(i9)).getAdded());
                liveStreamsDBModel.setCategoryId(((LiveStreamsDBModel) this.f35530v0.get(i9)).getCategoryId());
                liveStreamsDBModel.setCustomSid(((LiveStreamsDBModel) this.f35530v0.get(i9)).getCustomSid());
                liveStreamsDBModel.setTvArchive(((LiveStreamsDBModel) this.f35530v0.get(i9)).getTvArchive());
                liveStreamsDBModel.setDirectSource(((LiveStreamsDBModel) this.f35530v0.get(i9)).getDirectSource());
                liveStreamsDBModel.setTvArchiveDuration(((LiveStreamsDBModel) this.f35530v0.get(i9)).getTvArchiveDuration());
                liveStreamsDBModel.setTypeName(((LiveStreamsDBModel) this.f35530v0.get(i9)).getTypeName());
                liveStreamsDBModel.setCategoryName(((LiveStreamsDBModel) this.f35530v0.get(i9)).getCategoryName());
                liveStreamsDBModel.setSeriesNo(((LiveStreamsDBModel) this.f35530v0.get(i9)).getSeriesNo());
                liveStreamsDBModel.setLive(((LiveStreamsDBModel) this.f35530v0.get(i9)).getLive());
                liveStreamsDBModel.setContaiinerExtension(((LiveStreamsDBModel) this.f35530v0.get(i9)).getContaiinerExtension());
                liveStreamsDBModel.setUrl(((LiveStreamsDBModel) this.f35530v0.get(i9)).getUrl());
                liveStreamsDBModel.setCmd(((LiveStreamsDBModel) this.f35530v0.get(i9)).getCmd());
                if (zB && ePGTesting != null && ePGTesting.size() > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= ePGTesting.size()) {
                            break;
                        }
                        if (((LiveStreamsDBModel) this.f35530v0.get(i9)).getEpgChannelId().equals(ePGTesting.get(i10).getChannel())) {
                            int iM = m7.w.M(m7.w.x(ePGTesting.get(i10).getStart(), this.f35404d), m7.w.x(ePGTesting.get(i10).getStop(), this.f35404d), this.f35404d);
                            if (iM != 0) {
                                iM = 100 - iM;
                            }
                            liveStreamsDBModel.setProgramName(ePGTesting.get(i10).getTitle());
                            liveStreamsDBModel.setEpgPercentage(iM);
                        } else {
                            i10++;
                        }
                    }
                }
                this.f35537w0.add(liveStreamsDBModel);
            }
            return "all_channels_with_cat";
        } catch (Exception unused) {
            return "all_channels_with_cat";
        }
    }

    @Override // z7.g
    public void O(Z.E e9, int i9) {
    }

    public void O2() {
        Z2();
        this.f35539w2 = new F().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels_with_cat");
    }

    public void O3() {
        try {
            NSTIJKPlayerSky nSTIJKPlayerSky = this.f35434h2;
            if (nSTIJKPlayerSky != null) {
                if (nSTIJKPlayerSky.o1()) {
                    this.f35434h2.h1();
                } else {
                    this.f35434h2.H1();
                    this.f35434h2.r1(true);
                    this.f35434h2.E1();
                }
                IjkMediaPlayer.native_profileEnd();
            }
        } catch (Exception unused) {
        }
    }

    @Override // z7.j
    public void P(String str) {
        try {
            this.f35559z1.setVisibility(8);
            TextView textView = this.f35299M3;
            if (textView != null) {
                textView.setText("");
            }
            TextView textView2 = this.f35306N3;
            if (textView2 != null) {
                textView2.setText("");
            }
            r3();
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

    public String P2() {
        LiveStreamDBHandler liveStreamDBHandler;
        String str;
        String str2;
        try {
            this.f35506r4 = 0;
            ArrayList arrayList = this.f35544x0;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (this.f35286K4.equals("true")) {
                liveStreamDBHandler = this.f35337S;
                str = this.f35368W2;
                str2 = "radio_streams";
            } else {
                liveStreamDBHandler = this.f35337S;
                str = this.f35368W2;
                str2 = "live";
            }
            this.f35544x0 = liveStreamDBHandler.getAllLiveStreasWithCategoryId(str, str2);
            ArrayList arrayList2 = this.f35551y0;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone(this.f35291L2.C()));
            String str3 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + m7.w.S(this.f35404d)));
            boolean zB = this.f35291L2.B();
            ArrayList<XMLTVProgrammePojo> ePGTesting = zB ? this.f35337S.getEPGTesting(null, str3) : null;
            this.f35383Z = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("m3u") ? this.f35377Y.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", "") : (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("onestream_api") ? this.f35377Y : this.f35377Y).getString("currentlyPlayingVideo", "");
            ArrayList arrayList3 = this.f35544x0;
            if (arrayList3 != null && arrayList3.size() > 0) {
                for (int i9 = 0; i9 < this.f35544x0.size(); i9++) {
                    if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("m3u")) {
                        if (((LiveStreamsDBModel) this.f35544x0.get(i9)).getUrl().equals(string)) {
                            this.f35506r4 = i9;
                        }
                    } else if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("onestream_api")) {
                        if (((LiveStreamsDBModel) this.f35530v0.get(i9)).getStreamIdOneStream().equals(string)) {
                            this.f35214A2 = i9;
                        }
                    } else if (((LiveStreamsDBModel) this.f35544x0.get(i9)).getStreamId().equals(string)) {
                        this.f35506r4 = i9;
                    }
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    liveStreamsDBModel.setNum(((LiveStreamsDBModel) this.f35544x0.get(i9)).getNum());
                    liveStreamsDBModel.setName(((LiveStreamsDBModel) this.f35544x0.get(i9)).getName());
                    liveStreamsDBModel.setStreamType(((LiveStreamsDBModel) this.f35544x0.get(i9)).getStreamType());
                    liveStreamsDBModel.setStreamId(((LiveStreamsDBModel) this.f35544x0.get(i9)).getStreamId());
                    liveStreamsDBModel.setStreamIdOneStream(((LiveStreamsDBModel) this.f35544x0.get(i9)).getStreamIdOneStream());
                    liveStreamsDBModel.setStreamIcon(((LiveStreamsDBModel) this.f35544x0.get(i9)).getStreamIcon());
                    liveStreamsDBModel.setEpgChannelId(((LiveStreamsDBModel) this.f35544x0.get(i9)).getEpgChannelId());
                    liveStreamsDBModel.setAdded(((LiveStreamsDBModel) this.f35544x0.get(i9)).getAdded());
                    liveStreamsDBModel.setCategoryId(((LiveStreamsDBModel) this.f35544x0.get(i9)).getCategoryId());
                    liveStreamsDBModel.setCustomSid(((LiveStreamsDBModel) this.f35544x0.get(i9)).getCustomSid());
                    liveStreamsDBModel.setTvArchive(((LiveStreamsDBModel) this.f35544x0.get(i9)).getTvArchive());
                    liveStreamsDBModel.setDirectSource(((LiveStreamsDBModel) this.f35544x0.get(i9)).getDirectSource());
                    liveStreamsDBModel.setTvArchiveDuration(((LiveStreamsDBModel) this.f35544x0.get(i9)).getTvArchiveDuration());
                    liveStreamsDBModel.setTypeName(((LiveStreamsDBModel) this.f35544x0.get(i9)).getTypeName());
                    liveStreamsDBModel.setCategoryName(((LiveStreamsDBModel) this.f35544x0.get(i9)).getCategoryName());
                    liveStreamsDBModel.setSeriesNo(((LiveStreamsDBModel) this.f35544x0.get(i9)).getSeriesNo());
                    liveStreamsDBModel.setLive(((LiveStreamsDBModel) this.f35544x0.get(i9)).getLive());
                    liveStreamsDBModel.setContaiinerExtension(((LiveStreamsDBModel) this.f35544x0.get(i9)).getContaiinerExtension());
                    liveStreamsDBModel.setUrl(((LiveStreamsDBModel) this.f35544x0.get(i9)).getUrl());
                    liveStreamsDBModel.setCmd(((LiveStreamsDBModel) this.f35544x0.get(i9)).getCmd());
                    if (zB && ePGTesting != null && ePGTesting.size() > 0) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= ePGTesting.size()) {
                                break;
                            }
                            if (((LiveStreamsDBModel) this.f35544x0.get(i9)).getEpgChannelId().equals(ePGTesting.get(i10).getChannel())) {
                                int iM = m7.w.M(m7.w.x(ePGTesting.get(i10).getStart(), this.f35404d), m7.w.x(ePGTesting.get(i10).getStop(), this.f35404d), this.f35404d);
                                if (iM != 0) {
                                    iM = 100 - iM;
                                }
                                liveStreamsDBModel.setProgramName(ePGTesting.get(i10).getTitle());
                                liveStreamsDBModel.setEpgPercentage(iM);
                            } else {
                                i10++;
                            }
                        }
                    }
                    this.f35551y0.add(liveStreamsDBModel);
                }
            }
            this.f35544x0 = this.f35551y0;
            return "all_channels_with_cat";
        } catch (Exception e9) {
            e9.printStackTrace();
            return "all_channels_with_cat";
        }
    }

    public void Q2() {
        Z2();
        this.f35539w2 = new E().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_fav");
    }

    public final void Q3(String str, int i9, String str2, String str3) {
        DatabaseHandler databaseHandler;
        Context context = this.f35404d;
        if (context == null || this.f35351U == null || (databaseHandler = this.f35241E1) == null) {
            return;
        }
        databaseHandler.deleteFavourite(i9, str, str3, str2, SharepreferenceDBHandler.getUserID(context), this.f35239E);
        this.f35351U.notifyDataSetChanged();
        m7.w.P0(this.f35404d, str2 + this.f35404d.getResources().getString(a7.j.f13223c6));
    }

    public void R2() {
        Z2();
        this.f35539w2 = new E().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "recently_watched");
    }

    public String S2() {
        LiveStreamDBHandler liveStreamDBHandler;
        String str;
        String string;
        try {
            this.f35214A2 = 0;
            ArrayList arrayList = this.f35544x0;
            if (arrayList != null) {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.f35530v0;
            if (arrayList2 != null && this.f35516t0 != null) {
                arrayList2.clear();
                this.f35516t0.clear();
            }
            ArrayList arrayList3 = this.f35212A0;
            if (arrayList3 != null) {
                arrayList3.clear();
            }
            if (this.f35286K4.equalsIgnoreCase("true")) {
                liveStreamDBHandler = this.f35337S;
                str = "radio_streams";
            } else {
                liveStreamDBHandler = this.f35337S;
                str = "live";
            }
            this.f35212A0 = liveStreamDBHandler.getAllRecentlyWatchedLiveStreams(str);
            this.f35530v0 = this.f35212A0;
            ArrayList arrayList4 = this.f35537w0;
            if (arrayList4 != null) {
                arrayList4.clear();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone(this.f35291L2.C()));
            String str2 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + m7.w.S(this.f35404d)));
            boolean zB = this.f35291L2.B();
            ArrayList<XMLTVProgrammePojo> ePGTesting = zB ? this.f35337S.getEPGTesting(null, str2) : null;
            this.f35383Z = getSharedPreferences("currentlyPlayingVideo", 0);
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("m3u")) {
                string = this.f35377Y.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", "");
            } else {
                SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("onestream_api");
                string = this.f35377Y.getString("currentlyPlayingVideo", "");
            }
            ArrayList arrayList5 = this.f35530v0;
            if (arrayList5 == null || arrayList5.size() <= 0) {
                return "all_channels_with_cat";
            }
            for (int i9 = 0; i9 < this.f35530v0.size(); i9++) {
                if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("m3u")) {
                    if (((LiveStreamsDBModel) this.f35530v0.get(i9)).getUrl().equals(string)) {
                        this.f35214A2 = i9;
                    }
                } else if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("onestream_api")) {
                    if (((LiveStreamsDBModel) this.f35530v0.get(i9)).getStreamIdOneStream().equals(string)) {
                        this.f35214A2 = i9;
                    }
                } else if (((LiveStreamsDBModel) this.f35530v0.get(i9)).getStreamId().equals(string)) {
                    this.f35214A2 = i9;
                }
                LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                liveStreamsDBModel.setNum(((LiveStreamsDBModel) this.f35530v0.get(i9)).getNum());
                liveStreamsDBModel.setName(((LiveStreamsDBModel) this.f35530v0.get(i9)).getName());
                liveStreamsDBModel.setStreamType(((LiveStreamsDBModel) this.f35530v0.get(i9)).getStreamType());
                liveStreamsDBModel.setStreamId(((LiveStreamsDBModel) this.f35530v0.get(i9)).getStreamId());
                liveStreamsDBModel.setStreamIdOneStream(((LiveStreamsDBModel) this.f35530v0.get(i9)).getStreamIdOneStream());
                liveStreamsDBModel.setStreamIcon(((LiveStreamsDBModel) this.f35530v0.get(i9)).getStreamIcon());
                liveStreamsDBModel.setEpgChannelId(((LiveStreamsDBModel) this.f35530v0.get(i9)).getEpgChannelId());
                liveStreamsDBModel.setAdded(((LiveStreamsDBModel) this.f35530v0.get(i9)).getAdded());
                liveStreamsDBModel.setCategoryId(((LiveStreamsDBModel) this.f35530v0.get(i9)).getCategoryId());
                liveStreamsDBModel.setCustomSid(((LiveStreamsDBModel) this.f35530v0.get(i9)).getCustomSid());
                liveStreamsDBModel.setTvArchive(((LiveStreamsDBModel) this.f35530v0.get(i9)).getTvArchive());
                liveStreamsDBModel.setDirectSource(((LiveStreamsDBModel) this.f35530v0.get(i9)).getDirectSource());
                liveStreamsDBModel.setTvArchiveDuration(((LiveStreamsDBModel) this.f35530v0.get(i9)).getTvArchiveDuration());
                liveStreamsDBModel.setTypeName(((LiveStreamsDBModel) this.f35530v0.get(i9)).getTypeName());
                liveStreamsDBModel.setCategoryName(((LiveStreamsDBModel) this.f35530v0.get(i9)).getCategoryName());
                liveStreamsDBModel.setSeriesNo(((LiveStreamsDBModel) this.f35530v0.get(i9)).getSeriesNo());
                liveStreamsDBModel.setLive(((LiveStreamsDBModel) this.f35530v0.get(i9)).getLive());
                liveStreamsDBModel.setContaiinerExtension(((LiveStreamsDBModel) this.f35530v0.get(i9)).getContaiinerExtension());
                liveStreamsDBModel.setUrl(((LiveStreamsDBModel) this.f35530v0.get(i9)).getUrl());
                liveStreamsDBModel.setCmd(((LiveStreamsDBModel) this.f35530v0.get(i9)).getCmd());
                if (zB && ePGTesting != null && ePGTesting.size() > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= ePGTesting.size()) {
                            break;
                        }
                        if (((LiveStreamsDBModel) this.f35530v0.get(i9)).getEpgChannelId().equals(ePGTesting.get(i10).getChannel())) {
                            int iM = m7.w.M(m7.w.x(ePGTesting.get(i10).getStart(), this.f35404d), m7.w.x(ePGTesting.get(i10).getStop(), this.f35404d), this.f35404d);
                            if (iM != 0) {
                                iM = 100 - iM;
                            }
                            liveStreamsDBModel.setProgramName(ePGTesting.get(i10).getTitle());
                            liveStreamsDBModel.setEpgPercentage(iM);
                        } else {
                            i10++;
                        }
                    }
                }
                this.f35537w0.add(liveStreamsDBModel);
            }
            this.f35544x0 = this.f35537w0;
            return "all_channels_with_cat";
        } catch (Exception unused) {
            return "all_channels_with_cat";
        }
    }

    public void S3(ArrayList arrayList) {
        TextView textView;
        try {
            this.f35295M = arrayList;
            if (arrayList != null) {
                this.f35218B = false;
                this.f35310O0.setVisibility(8);
                if (arrayList.size() == 0) {
                    if (this.f35560z2) {
                        TextView textView2 = this.f35310O0;
                        if (textView2 != null) {
                            this.f35218B = true;
                            textView2.setFocusable(true);
                            this.f35310O0.requestFocus();
                            textView = this.f35310O0;
                            textView.setVisibility(0);
                        }
                    } else {
                        this.f35560z2 = true;
                        ArrayList arrayList2 = this.f35530v0;
                        if (arrayList2 != null && this.f35516t0 != null) {
                            arrayList2.clear();
                            this.f35516t0.clear();
                        }
                        this.f35530v0 = this.f35286K4.equals("true") ? this.f35337S.getAllLiveStreasWithCategoryId(this.f35412e1, "radio_streams") : this.f35337S.getAllLiveStreasWithCategoryId(this.f35412e1, "live");
                        ArrayList arrayList3 = this.f35530v0;
                        if (arrayList3 == null || arrayList3.size() <= 0) {
                            TextView textView3 = this.f35310O0;
                            if (textView3 != null) {
                                this.f35218B = true;
                                textView3.setFocusable(true);
                                this.f35310O0.requestFocus();
                                textView = this.f35310O0;
                                textView.setVisibility(0);
                            }
                        } else {
                            S3(this.f35530v0);
                        }
                    }
                }
                Log.e("honey", "if part");
            } else {
                arrayList = this.f35288L;
            }
            V3(arrayList);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // z7.j
    public void T0(StalkerDeletePlayerLinkCallback stalkerDeletePlayerLinkCallback) {
    }

    public void T3(ArrayList arrayList) {
        try {
            this.f35302N = arrayList;
            if (arrayList == null || arrayList.size() <= 0) {
                LinearLayout linearLayout = this.f35317P0;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                ListView listView = this.f35281K;
                if (listView != null) {
                    listView.setVisibility(8);
                    return;
                }
                return;
            }
            ListView listView2 = this.f35281K;
            if (listView2 != null) {
                listView2.setVisibility(0);
            }
            this.f35218B = false;
            O o9 = new O(this, arrayList);
            this.f35478n4 = o9;
            ListView listView3 = this.f35281K;
            if (listView3 != null) {
                listView3.setAdapter((ListAdapter) o9);
                this.f35281K.setSelection(this.f35506r4);
                this.f35281K.setOnItemClickListener(new C1479d());
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // z7.g
    public void U(StalkerLiveFavIdsCallback stalkerLiveFavIdsCallback) {
    }

    public void U2(int i9) {
        if (f35209c6) {
            return;
        }
        this.f35434h2.f37097a1 = new m();
        NSTIJKPlayerSky nSTIJKPlayerSky = this.f35434h2;
        nSTIJKPlayerSky.f37095Z0.postDelayed(nSTIJKPlayerSky.f37097a1, i9);
    }

    public void U3(String str) {
        TextView textView = this.f35292L3;
        if (textView != null) {
            textView.setText(str);
            this.f35292L3.setSelected(true);
        }
    }

    @Override // z7.g
    public void V(StalkerProfilesCallback stalkerProfilesCallback) {
    }

    @Override // z7.g
    public void V0(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, m0.x xVar, int i9) {
    }

    public void V2() {
        y3();
        this.f35560z2 = false;
        this.f35214A2 = 0;
        AsyncTask asyncTask = this.f35546x2;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            ArrayList arrayList = this.f35495q0;
            if (arrayList != null && arrayList.size() > 0) {
                int size = this.f35453k0;
                if (size == 0) {
                    size = this.f35495q0.size();
                }
                this.f35453k0 = size - 1;
                if (this.f35453k0 != 0 || this.f35530v0 == null) {
                    ArrayList arrayList2 = this.f35495q0;
                    if (arrayList2 == null || arrayList2.size() <= 0 || this.f35453k0 >= this.f35495q0.size()) {
                        return;
                    }
                    String liveStreamCategoryID = ((LiveStreamCategoryIdDBModel) this.f35495q0.get(this.f35453k0)).getLiveStreamCategoryID();
                    String liveStreamCategoryName = ((LiveStreamCategoryIdDBModel) this.f35495q0.get(this.f35453k0)).getLiveStreamCategoryName();
                    this.f35412e1 = liveStreamCategoryID;
                    this.f35419f1 = liveStreamCategoryName;
                    if (liveStreamCategoryID != null && !liveStreamCategoryID.equals("") && this.f35412e1.equals("-1")) {
                        Q2();
                        return;
                    }
                    String str = this.f35412e1;
                    if (str == null || str.equals("") || !this.f35412e1.equals("-6")) {
                        M2();
                        return;
                    } else {
                        R2();
                        return;
                    }
                }
                if (this.f35412e1.equals("0")) {
                    return;
                }
                this.f35412e1 = "0";
                this.f35419f1 = this.f35404d.getResources().getString(a7.j.f13426x);
            }
            K2();
        }
    }

    public final void V3(ArrayList arrayList) {
        T t9 = this.f35351U;
        if (t9 != null) {
            t9.f(arrayList);
            return;
        }
        T t10 = new T(this, arrayList, this.f35286K4);
        this.f35351U = t10;
        t10.g(this.f35310O0);
        ListView listView = this.f35274J;
        if (listView != null) {
            listView.setAdapter((ListAdapter) this.f35351U);
            int i9 = this.f35214A2;
            if (i9 != 0) {
                this.f35274J.setSelection(i9);
            }
            if (this.f35374X2.booleanValue()) {
                this.f35274J.requestFocus();
                this.f35374X2 = Boolean.FALSE;
            }
            this.f35274J.setOnItemSelectedListener(new C1480e());
            this.f35274J.setOnItemClickListener(new C1481f());
            this.f35274J.setOnItemLongClickListener(new C1482g());
        }
    }

    public String W2(String str) {
        ArrayList arrayList = this.f35495q0;
        if (arrayList != null && arrayList.size() > 0) {
            for (LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel : this.f35495q0) {
                if (liveStreamCategoryIdDBModel.getLiveStreamCategoryID() != null && !liveStreamCategoryIdDBModel.getLiveStreamCategoryID().isEmpty() && liveStreamCategoryIdDBModel.getLiveStreamCategoryID().equalsIgnoreCase(str)) {
                    this.f35419f1 = liveStreamCategoryIdDBModel.getLiveStreamCategoryName();
                }
            }
        }
        return this.f35419f1;
    }

    @Override // z7.j
    public void X(StalkerShortEPGCallback stalkerShortEPGCallback) {
        if (stalkerShortEPGCallback != null && stalkerShortEPGCallback.getJs() != null && stalkerShortEPGCallback.getJs().size() > 0) {
            HashMap map = new HashMap();
            try {
                map = Z3(stalkerShortEPGCallback);
            } catch (Exception unused) {
            }
            d3(map);
            return;
        }
        try {
            this.f35559z1.setVisibility(8);
            TextView textView = this.f35299M3;
            if (textView != null) {
                textView.setText("");
            }
            TextView textView2 = this.f35306N3;
            if (textView2 != null) {
                textView2.setText("");
            }
            r3();
        } catch (Exception unused2) {
        }
    }

    public void X2(int i9, String str, String str2, boolean z9) {
        RecyclerView recyclerView;
        if (!z9 || (recyclerView = this.f35313O3) == null) {
            return;
        }
        recyclerView.m1(i9);
    }

    public void Y2() {
        this.f35322P5 = new ArrayList();
        this.f35329Q5 = new JsonArray();
        if (this.f35388Z4.isChecked()) {
            this.f35322P5.add(this.f35388Z4.getText().toString());
            this.f35329Q5.add(this.f35388Z4.getText().toString());
        }
        if (this.f35393a5.isChecked()) {
            this.f35322P5.add(this.f35393a5.getText().toString());
            this.f35329Q5.add(this.f35393a5.getText().toString());
        }
        if (this.f35398b5.isChecked()) {
            this.f35322P5.add(this.f35398b5.getText().toString());
            this.f35329Q5.add(this.f35398b5.getText().toString());
        }
        if (this.f35403c5.isChecked()) {
            this.f35322P5.add(this.f35403c5.getText().toString());
            this.f35329Q5.add(this.f35403c5.getText().toString());
        }
        if (this.f35409d5.isChecked()) {
            this.f35322P5.add(this.f35409d5.getText().toString());
            this.f35329Q5.add(this.f35409d5.getText().toString());
        }
        if (this.f35363V4.isChecked()) {
            this.f35322P5.add(this.f35363V4.getText().toString());
            this.f35329Q5.add(this.f35363V4.getText().toString());
        }
        if (this.f35370W4.isChecked()) {
            this.f35322P5.add(this.f35370W4.getText().toString());
            this.f35329Q5.add(this.f35370W4.getText().toString());
        }
        if (this.f35376X4.isChecked()) {
            this.f35322P5.add(this.f35376X4.getText().toString());
            this.f35329Q5.add(this.f35376X4.getText().toString());
        }
        if (this.f35382Y4.isChecked()) {
            this.f35322P5.add(this.f35382Y4.getText().toString());
            this.f35329Q5.add(this.f35382Y4.getText().toString());
        }
        if (this.f35423f5.isChecked()) {
            this.f35322P5.add(this.f35423f5.getText().toString());
            this.f35329Q5.add(this.f35423f5.getText().toString());
        }
        if (this.f35430g5.isChecked()) {
            this.f35322P5.add(this.f35430g5.getText().toString());
            this.f35329Q5.add(this.f35430g5.getText().toString());
        }
        if (this.f35437h5.isChecked()) {
            this.f35322P5.add(this.f35437h5.getText().toString());
            this.f35329Q5.add(this.f35437h5.getText().toString());
        }
        if (this.f35444i5.isChecked()) {
            this.f35322P5.add(this.f35444i5.getText().toString());
            this.f35329Q5.add(this.f35444i5.getText().toString());
        }
        this.f35336R5 = new Gson().toJson((JsonElement) this.f35329Q5);
        Log.e("TAG", this.f35329Q5 + "");
    }

    public void a4() {
        if (f35209c6 || this.f35547x3.getVisibility() != 8) {
            return;
        }
        this.f35547x3.startAnimation(this.f35436h4);
        this.f35547x3.setVisibility(0);
    }

    public void b4() {
        if (f35209c6 || this.f35547x3.getVisibility() != 8) {
            return;
        }
        this.f35547x3.startAnimation(this.f35436h4);
        this.f35547x3.setVisibility(0);
        if (this.f35456k3.getVisibility() == 8) {
            this.f35456k3.startAnimation(this.f35436h4);
            this.f35456k3.setVisibility(0);
        }
        if (this.f35533v3.getVisibility() == 8) {
            this.f35533v3.startAnimation(this.f35436h4);
            this.f35533v3.setVisibility(0);
        }
        if (this.f35470m3.getVisibility() == 8) {
            this.f35470m3.startAnimation(this.f35436h4);
            this.f35470m3.setVisibility(0);
        }
        if (this.f35540w3.getVisibility() == 8) {
            this.f35540w3.startAnimation(this.f35436h4);
            this.f35540w3.setVisibility(0);
        }
        if (this.f35463l3.getVisibility() == 8) {
            this.f35463l3.startAnimation(this.f35436h4);
            this.f35463l3.setVisibility(0);
        }
    }

    @Override // z7.g
    public void c(String str) {
    }

    public void c3() {
        runOnUiThread(new RunnableC1478c());
    }

    @Override // z7.g
    public void d0(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, C2635t.o oVar, String str, String str2) {
        Context context;
        StringBuilder sb;
        try {
            m7.w.X();
            if (this.f35351U == null || stalkerSetLiveFavCallback == null || stalkerSetLiveFavCallback.getJs() == null || !stalkerSetLiveFavCallback.getJs().equals(Boolean.TRUE)) {
                return;
            }
            this.f35223B4 = StalkerLiveFavIdsSingleton.getInstance().getFavIdsList();
            if (str.equals("added")) {
                int i9 = this.f35237D4;
                if (i9 != 0) {
                    this.f35223B4.add(Integer.valueOf(i9));
                }
                StalkerLiveFavIdsSingleton.getInstance().setFavIdsList(this.f35223B4);
                this.f35351U.notifyDataSetChanged();
                context = this.f35404d;
                sb = new StringBuilder();
                sb.append(str2);
                sb.append(this.f35404d.getResources().getString(a7.j.f13356q));
            } else {
                int i10 = this.f35237D4;
                if (i10 != 0) {
                    this.f35223B4.remove(Integer.valueOf(i10));
                    StalkerLiveFavIdsSingleton.getInstance().setFavIdsList(this.f35223B4);
                }
                this.f35351U.notifyDataSetChanged();
                context = this.f35404d;
                sb = new StringBuilder();
                sb.append(str2);
                sb.append(this.f35404d.getResources().getString(a7.j.f13223c6));
            }
            m7.w.P0(context, sb.toString());
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0131 A[Catch: Exception -> 0x034d, TryCatch #3 {Exception -> 0x034d, blocks: (B:3:0x0008, B:6:0x0016, B:8:0x001e, B:10:0x0024, B:12:0x0032, B:14:0x0038, B:16:0x0040, B:18:0x0046, B:20:0x004a, B:21:0x004d, B:23:0x0053, B:25:0x0057, B:27:0x005f, B:29:0x0065, B:30:0x0075, B:60:0x012b, B:62:0x0131, B:64:0x0139, B:109:0x01cd, B:111:0x01d1, B:112:0x01d4, B:114:0x01d8, B:152:0x0245, B:154:0x0249, B:155:0x024c, B:157:0x0250, B:196:0x02be, B:198:0x02c2, B:199:0x02c5, B:201:0x02c9, B:241:0x033b, B:243:0x033f, B:244:0x0342, B:246:0x0346, B:238:0x0334, B:240:0x0338, B:225:0x030f, B:227:0x0313, B:212:0x02ea, B:214:0x02ee, B:193:0x02b7, B:195:0x02bb, B:181:0x0294, B:183:0x0298, B:168:0x0270, B:170:0x0274, B:149:0x023e, B:151:0x0242, B:136:0x021a, B:138:0x021e, B:124:0x01f7, B:126:0x01fb, B:106:0x01c6, B:108:0x01ca, B:93:0x01a2, B:95:0x01a6, B:78:0x016d, B:80:0x0171, B:247:0x034a, B:56:0x0113, B:50:0x00ea, B:43:0x00c4, B:37:0x009b, B:57:0x0119, B:58:0x011f, B:59:0x0125, B:159:0x0254, B:161:0x025a, B:163:0x025e, B:164:0x0268, B:166:0x026c, B:216:0x02f3, B:218:0x02f9, B:220:0x02fd, B:221:0x0307, B:223:0x030b, B:66:0x013f, B:68:0x0145, B:70:0x0149, B:71:0x0152, B:73:0x0156, B:74:0x0165, B:76:0x0169, B:203:0x02ce, B:205:0x02d4, B:207:0x02d8, B:208:0x02e2, B:210:0x02e6, B:44:0x00c9, B:46:0x00cf, B:47:0x00d7, B:48:0x00db, B:184:0x029b, B:186:0x02a1, B:188:0x02a5, B:189:0x02af, B:191:0x02b3, B:115:0x01db, B:117:0x01e1, B:119:0x01e5, B:120:0x01ef, B:122:0x01f3, B:229:0x0318, B:231:0x031e, B:233:0x0322, B:234:0x032c, B:236:0x0330, B:172:0x0278, B:174:0x027e, B:176:0x0282, B:177:0x028c, B:179:0x0290, B:51:0x00fb, B:53:0x0101, B:54:0x010d, B:140:0x0222, B:142:0x0228, B:144:0x022c, B:145:0x0236, B:147:0x023a, B:31:0x007a, B:33:0x0080, B:34:0x0088, B:35:0x008c, B:127:0x01fe, B:129:0x0204, B:131:0x0208, B:132:0x0212, B:134:0x0216, B:97:0x01aa, B:99:0x01b0, B:101:0x01b4, B:102:0x01be, B:104:0x01c2, B:38:0x00ac, B:40:0x00b2, B:41:0x00be, B:81:0x0174, B:83:0x017a, B:85:0x017e, B:86:0x0187, B:88:0x018b, B:89:0x019a, B:91:0x019e), top: B:257:0x0008, inners: #0, #1, #2, #4, #5, #6, #7, #8, #9, #10, #11, #12, #13, #14, #15, #16 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:182:0x0296 -> B:263:0x029b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:183:0x0298 -> B:263:0x029b). Please report as a decompilation issue!!! */
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
    public void d3(java.util.HashMap r12) {
        /*
            Method dump skipped, instruction units count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.d3(java.util.HashMap):void");
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

    public void e3() {
        try {
            D3();
            LinearLayout linearLayout = this.f35517t1;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            LinearLayout linearLayout2 = this.f35531v1;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            LinearLayout linearLayout3 = this.f35538w1;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
            LinearLayout linearLayout4 = this.f35545x1;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(8);
            }
            LinearLayout linearLayout5 = this.f35552y1;
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(8);
            }
            LinearLayout linearLayout6 = this.f35559z1;
            if (linearLayout6 != null) {
                linearLayout6.setVisibility(0);
            }
        } catch (Exception unused) {
        }
    }

    @Override // z7.g
    public void f0(StalkerGetGenresCallback stalkerGetGenresCallback) {
    }

    public void g3(boolean z9) {
        String livePlayerAppName;
        String string;
        Intent intent;
        JSONObject jSONObject;
        String str;
        String str2;
        String str3;
        String str4 = "";
        f35205Y5 = z9;
        String livePlayerAppName2 = SharepreferenceDBHandler.getLivePlayerAppName(this.f35404d);
        if (!SharepreferenceDBHandler.getLivePlayerPkgName(this.f35404d).equals(CookieSpecs.DEFAULT) && !new ExternalPlayerDataBase(this.f35404d).CheckPlayerExistense(livePlayerAppName2)) {
            SharepreferenceDBHandler.setLivePlayer(CookieSpecs.DEFAULT, CookieSpecs.DEFAULT, this.f35404d);
        }
        String livePlayerPkgName = SharepreferenceDBHandler.getLivePlayerPkgName(this.f35404d);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("stalker_api") || !z9 || livePlayerPkgName == null || livePlayerPkgName.equalsIgnoreCase(CookieSpecs.DEFAULT)) {
            if (AbstractC2237a.f44480Y.booleanValue()) {
                Toolbar toolbar = this.f35296M0;
                if (toolbar != null) {
                    toolbar.setVisibility(8);
                }
                findViewById(f.f12491p).setOnClickListener(null);
                this.f35378Y0.setVisibility(8);
                this.f35384Z0.setVisibility(8);
                this.f35389a1.setVisibility(8);
                this.f35394b1.setVisibility(8);
                this.f35399c1.setVisibility(8);
                getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f35405d1.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                this.f35405d1.setLayoutParams(layoutParams);
                getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
                this.f35366W0.setVisibility(8);
                NSTIJKPlayerSky nSTIJKPlayerSky = this.f35434h2;
                ((nSTIJKPlayerSky == null || !nSTIJKPlayerSky.isPlaying()) ? this.f35417f : this.f35424g).requestFocus();
                return;
            }
            return;
        }
        O3();
        this.f35221B2 = true;
        SharedPreferences sharedPreferences = getSharedPreferences("currentlyPlayingVideoPosition", 0);
        this.f35383Z = sharedPreferences;
        int i9 = sharedPreferences.getInt("currentlyPlayingVideoPosition", 0);
        ArrayList arrayListE = this.f35351U.e();
        this.f35346T1 = i9;
        if (arrayListE == null || arrayListE.size() <= 0 || this.f35346T1 >= arrayListE.size()) {
            ArrayList arrayList = this.f35530v0;
            if (arrayList != null && arrayList.size() > 0 && this.f35346T1 < this.f35530v0.size()) {
                this.f35497q2 = m7.w.r0(((LiveStreamsDBModel) this.f35530v0.get(this.f35346T1)).getStreamId());
                this.f35504r2 = ((LiveStreamsDBModel) this.f35530v0.get(this.f35346T1)).getStreamIdOneStream();
                this.f35420f2 = ((LiveStreamsDBModel) this.f35530v0.get(this.f35346T1)).getUrl();
                ((LiveStreamsDBModel) this.f35530v0.get(this.f35346T1)).getName();
            }
        } else {
            this.f35497q2 = m7.w.r0(((LiveStreamsDBModel) arrayListE.get(this.f35346T1)).getStreamId());
            this.f35504r2 = ((LiveStreamsDBModel) arrayListE.get(this.f35346T1)).getStreamIdOneStream();
            this.f35420f2 = ((LiveStreamsDBModel) arrayListE.get(this.f35346T1)).getUrl();
        }
        this.f35232D = this.f35497q2;
        this.f35239E = this.f35504r2;
        this.f35246F = this.f35420f2;
        f35205Y5 = false;
        NSTIJKPlayerSky nSTIJKPlayerSky2 = this.f35434h2;
        if (nSTIJKPlayerSky2 != null) {
            nSTIJKPlayerSky2.i1(Boolean.FALSE);
        }
        if (this.f35413e2.equals("m3u")) {
            if (!this.f35476n2.booleanValue()) {
                return;
            }
            livePlayerAppName = SharepreferenceDBHandler.getLivePlayerAppName(this.f35404d);
            intent = new Intent(this.f35404d, (Class<?>) PlayExternalPlayerActivity.class);
            string = this.f35246F;
        } else {
            if (!this.f35413e2.equals("onestream_api")) {
                if (this.f35497q2 == -1 || !this.f35476n2.booleanValue()) {
                    return;
                }
                String strV = m7.w.V(this.f35404d, this.f35497q2, this.f35439i0, "live");
                String livePlayerAppName3 = SharepreferenceDBHandler.getLivePlayerAppName(this.f35404d);
                Intent intent2 = new Intent(this.f35404d, (Class<?>) PlayExternalPlayerActivity.class);
                intent2.putExtra("url", strV);
                intent2.putExtra("packagename", livePlayerPkgName);
                intent2.putExtra("app_name", livePlayerAppName3);
                this.f35404d.startActivity(intent2);
                return;
            }
            livePlayerAppName = SharepreferenceDBHandler.getLivePlayerAppName(this.f35404d);
            try {
                jSONObject = new JSONObject(this.f35323Q);
                String str5 = this.f35439i0;
                str = "m3u8";
                str2 = "ts";
                if (str5 == null || str5.isEmpty() || !this.f35439i0.equals(".ts")) {
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
            } catch (Exception unused) {
            }
            try {
                String str6 = this.f35439i0;
                if (str6 != null && !str6.isEmpty() && this.f35439i0.equals(".m3u8")) {
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
            } catch (Exception unused2) {
                str4 = string;
                string = str4;
            }
            intent = new Intent(this.f35404d, (Class<?>) PlayExternalPlayerActivity.class);
        }
        intent.putExtra("url", string);
        intent.putExtra("packagename", livePlayerPkgName);
        intent.putExtra("app_name", livePlayerAppName);
        this.f35404d.startActivity(intent);
    }

    public void h4() {
        Handler handler;
        if (f35209c6 || (handler = this.f35434h2.f37095Z0) == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    @Override // z7.g
    public void i(StalkerGetAllChannelsCallback stalkerGetAllChannelsCallback) {
    }

    public void i3() {
        ArrayList arrayList;
        String categoryID;
        String strValueOf;
        String timestamp;
        String str;
        try {
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("m3u")) {
                new ArrayList();
                LiveStreamDBHandler liveStreamDBHandler = this.f35337S;
                if (liveStreamDBHandler == null) {
                    return;
                }
                ArrayList<FavouriteM3UModel> favouriteM3U = liveStreamDBHandler.getFavouriteM3U("live");
                arrayList = new ArrayList();
                ArrayList arrayList2 = this.f35233D0;
                if (arrayList2 != null && arrayList2.size() > 0 && favouriteM3U != null && favouriteM3U.size() > 0) {
                    favouriteM3U = q3(favouriteM3U, this.f35233D0);
                }
                if (favouriteM3U == null || favouriteM3U.size() <= 0) {
                    return;
                }
                for (FavouriteM3UModel favouriteM3UModel : favouriteM3U) {
                    ArrayList<LiveStreamsDBModel> m3UFavouriteRow = this.f35337S.getM3UFavouriteRow(favouriteM3UModel.getCategoryID(), favouriteM3UModel.getUrl(), favouriteM3UModel.getTimestamp());
                    if (m3UFavouriteRow != null && m3UFavouriteRow.size() > 0) {
                        arrayList.add(m3UFavouriteRow.get(0));
                    }
                }
                if (arrayList.size() == 0) {
                    return;
                }
            } else {
                if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("stalker_api")) {
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
                    this.f35288L.clear();
                    this.f35288L = this.f35337S.getLiveFavStalker(string);
                    return;
                }
                new ArrayList();
                if (this.f35241E1 == null) {
                    return;
                }
                ArrayList<FavouriteDBModel> allFavourites = this.f35286K4.equals("true") ? this.f35241E1.getAllFavourites("radio_streams", SharepreferenceDBHandler.getUserID(this.f35404d)) : this.f35241E1.getAllFavourites("live", SharepreferenceDBHandler.getUserID(this.f35404d));
                arrayList = new ArrayList();
                ArrayList arrayList3 = this.f35233D0;
                if (arrayList3 != null && arrayList3.size() > 0 && allFavourites != null && allFavourites.size() > 0) {
                    allFavourites = p3(allFavourites, this.f35233D0);
                }
                if (allFavourites == null || allFavourites.size() <= 0) {
                    return;
                }
                for (FavouriteDBModel favouriteDBModel : allFavourites) {
                    LiveStreamDBHandler liveStreamDBHandler2 = new LiveStreamDBHandler(this.f35404d);
                    if (this.f35413e2.equals("onestream_api")) {
                        categoryID = favouriteDBModel.getCategoryID();
                        strValueOf = String.valueOf(favouriteDBModel.getStreamIDOneStream());
                        timestamp = favouriteDBModel.getTimestamp();
                        str = this.f35293L4;
                    } else {
                        categoryID = favouriteDBModel.getCategoryID();
                        strValueOf = String.valueOf(favouriteDBModel.getStreamID());
                        timestamp = favouriteDBModel.getTimestamp();
                        str = this.f35293L4;
                    }
                    LiveStreamsDBModel liveStreamFavouriteRow = liveStreamDBHandler2.getLiveStreamFavouriteRow(categoryID, strValueOf, timestamp, str);
                    if (liveStreamFavouriteRow != null) {
                        arrayList.add(liveStreamFavouriteRow);
                    }
                }
                if (arrayList.size() == 0) {
                    return;
                }
            }
            this.f35288L = arrayList;
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[Catch: Exception -> 0x0041, TryCatch #1 {Exception -> 0x0041, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x000f, B:9:0x002d, B:11:0x0031), top: B:19:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i4(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L2d
            java.lang.String r1 = ""
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Exception -> L41
            if (r1 != 0) goto L2d
            android.widget.ImageView r1 = r3.f35494q     // Catch: java.lang.Exception -> L41
            if (r1 == 0) goto L54
            android.content.Context r1 = r3.f35404d     // Catch: java.lang.Exception -> L41
            com.squareup.picasso.t r1 = com.squareup.picasso.t.q(r1)     // Catch: java.lang.Exception -> L41
            com.squareup.picasso.x r4 = r1.l(r4)     // Catch: java.lang.Exception -> L41
            r1 = 80
            r2 = 55
            com.squareup.picasso.x r4 = r4.k(r1, r2)     // Catch: java.lang.Exception -> L41
            int r1 = a7.e.f12016i1     // Catch: java.lang.Exception -> L41
            com.squareup.picasso.x r4 = r4.j(r1)     // Catch: java.lang.Exception -> L41
            android.widget.ImageView r1 = r3.f35494q     // Catch: java.lang.Exception -> L41
            r4.g(r1)     // Catch: java.lang.Exception -> L41
            goto L54
        L2d:
            android.widget.ImageView r4 = r3.f35494q     // Catch: java.lang.Exception -> L41
            if (r4 == 0) goto L54
            android.content.Context r1 = r3.f35404d     // Catch: java.lang.Exception -> L41
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Exception -> L41
            int r2 = a7.e.f12016i1     // Catch: java.lang.Exception -> L41
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2, r0)     // Catch: java.lang.Exception -> L41
            r4.setImageDrawable(r1)     // Catch: java.lang.Exception -> L41
            goto L54
        L41:
            android.widget.ImageView r4 = r3.f35494q     // Catch: java.lang.Exception -> L54
            if (r4 == 0) goto L54
            android.content.Context r1 = r3.f35404d     // Catch: java.lang.Exception -> L54
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Exception -> L54
            int r2 = a7.e.f12016i1     // Catch: java.lang.Exception -> L54
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r2, r0)     // Catch: java.lang.Exception -> L54
            r4.setImageDrawable(r0)     // Catch: java.lang.Exception -> L54
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.i4(java.lang.String):void");
    }

    @Override // z7.g
    public void j(StalkerGetVodCategoriesCallback stalkerGetVodCategoriesCallback) {
    }

    public String j3() {
        AsyncTask asyncTask;
        try {
            this.f35214A2 = 0;
            ArrayList arrayList = this.f35530v0;
            if (arrayList != null && this.f35516t0 != null) {
                arrayList.clear();
                this.f35516t0.clear();
            }
            ArrayList arrayList2 = this.f35288L;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.f35288L.clear();
            }
            i3();
            ArrayList arrayList3 = this.f35544x0;
            if (arrayList3 != null) {
                arrayList3.clear();
            }
            this.f35530v0 = this.f35288L;
            ArrayList arrayList4 = this.f35537w0;
            if (arrayList4 != null) {
                arrayList4.clear();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone(this.f35291L2.C()));
            String str = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + m7.w.S(this.f35404d)));
            boolean zB = this.f35291L2.B();
            ArrayList<XMLTVProgrammePojo> ePGTesting = zB ? this.f35337S.getEPGTesting(null, str) : null;
            this.f35383Z = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("m3u") ? this.f35377Y.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", "") : (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("onestream_api") ? this.f35377Y : this.f35377Y).getString("currentlyPlayingVideo", "");
            ArrayList arrayList5 = this.f35530v0;
            if (arrayList5 == null || arrayList5.size() <= 0) {
                this.f35544x0 = this.f35530v0;
                return "get_fav";
            }
            for (int i9 = 0; i9 < this.f35530v0.size(); i9++) {
                AsyncTask asyncTask2 = this.f35539w2;
                if (asyncTask2 != null && asyncTask2.isCancelled()) {
                    return "get_fav";
                }
                if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("m3u")) {
                    if (((LiveStreamsDBModel) this.f35530v0.get(i9)).getUrl().equals(string)) {
                        this.f35214A2 = i9;
                    }
                } else if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("onestream_api")) {
                    if (((LiveStreamsDBModel) this.f35530v0.get(i9)).getStreamIdOneStream().equals(string)) {
                        this.f35214A2 = i9;
                    }
                } else if (((LiveStreamsDBModel) this.f35530v0.get(i9)).getStreamId().equals(string)) {
                    this.f35214A2 = i9;
                }
                LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                liveStreamsDBModel.setNum(((LiveStreamsDBModel) this.f35530v0.get(i9)).getNum());
                liveStreamsDBModel.setName(((LiveStreamsDBModel) this.f35530v0.get(i9)).getName());
                liveStreamsDBModel.setStreamType(((LiveStreamsDBModel) this.f35530v0.get(i9)).getStreamType());
                liveStreamsDBModel.setStreamId(((LiveStreamsDBModel) this.f35530v0.get(i9)).getStreamId());
                liveStreamsDBModel.setStreamIdOneStream(((LiveStreamsDBModel) this.f35530v0.get(i9)).getStreamIdOneStream());
                liveStreamsDBModel.setStreamIcon(((LiveStreamsDBModel) this.f35530v0.get(i9)).getStreamIcon());
                liveStreamsDBModel.setEpgChannelId(((LiveStreamsDBModel) this.f35530v0.get(i9)).getEpgChannelId());
                liveStreamsDBModel.setAdded(((LiveStreamsDBModel) this.f35530v0.get(i9)).getAdded());
                liveStreamsDBModel.setCategoryId(((LiveStreamsDBModel) this.f35530v0.get(i9)).getCategoryId());
                liveStreamsDBModel.setCustomSid(((LiveStreamsDBModel) this.f35530v0.get(i9)).getCustomSid());
                liveStreamsDBModel.setTvArchive(((LiveStreamsDBModel) this.f35530v0.get(i9)).getTvArchive());
                liveStreamsDBModel.setDirectSource(((LiveStreamsDBModel) this.f35530v0.get(i9)).getDirectSource());
                liveStreamsDBModel.setTvArchiveDuration(((LiveStreamsDBModel) this.f35530v0.get(i9)).getTvArchiveDuration());
                liveStreamsDBModel.setTypeName(((LiveStreamsDBModel) this.f35530v0.get(i9)).getTypeName());
                liveStreamsDBModel.setCategoryName(((LiveStreamsDBModel) this.f35530v0.get(i9)).getCategoryName());
                liveStreamsDBModel.setSeriesNo(((LiveStreamsDBModel) this.f35530v0.get(i9)).getSeriesNo());
                liveStreamsDBModel.setLive(((LiveStreamsDBModel) this.f35530v0.get(i9)).getLive());
                liveStreamsDBModel.setContaiinerExtension(((LiveStreamsDBModel) this.f35530v0.get(i9)).getContaiinerExtension());
                liveStreamsDBModel.setUrl(((LiveStreamsDBModel) this.f35530v0.get(i9)).getUrl());
                if (zB && ePGTesting != null && ePGTesting.size() > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < ePGTesting.size() && ((asyncTask = this.f35539w2) == null || !asyncTask.isCancelled())) {
                            if (((LiveStreamsDBModel) this.f35530v0.get(i9)).getEpgChannelId().equals(ePGTesting.get(i10).getChannel())) {
                                int iM = m7.w.M(m7.w.x(ePGTesting.get(i10).getStart(), this.f35404d), m7.w.x(ePGTesting.get(i10).getStop(), this.f35404d), this.f35404d);
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
                this.f35537w0.add(liveStreamsDBModel);
                this.f35544x0 = this.f35537w0;
            }
            return "get_fav";
        } catch (Exception e9) {
            e9.printStackTrace();
            return "get_fav";
        }
    }

    public void j4(String str, String str2, LiveStreamDBHandler liveStreamDBHandler, Context context, ProgressBar progressBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, String str3) {
        this.f35337S = liveStreamDBHandler;
        this.f35404d = context;
        this.f35536w = progressBar;
        this.f35501r = textView;
        this.f35508s = textView2;
        this.f35515t = textView3;
        this.f35522u = textView4;
        this.f35494q = imageView;
        this.f35517t1 = linearLayout;
        this.f35531v1 = linearLayout2;
        this.f35538w1 = linearLayout3;
        this.f35545x1 = linearLayout4;
        this.f35552y1 = linearLayout5;
        this.f35559z1 = linearLayout6;
        this.f35426g1 = textView5;
        this.f35440i1 = textView6;
        this.f35461l1 = textView7;
        this.f35475n1 = textView8;
        this.f35489p1 = textView9;
        this.f35496q1 = textView10;
        this.f35503r1 = textView11;
        this.f35510s1 = textView12;
        SharedPreferences sharedPreferences = context.getSharedPreferences("timeFormat", 0);
        f35203W5 = sharedPreferences;
        this.f35432h0 = new SimpleDateFormat(sharedPreferences.getString("timeFormat", AbstractC2237a.f44441E0), Locale.US);
        i4(str2);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("stalker_api")) {
            k4(str3);
        } else {
            this.f35553y2 = new H(this, str, null).execute(new String[0]);
        }
    }

    public String k3() {
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
            this.f35506r4 = 0;
            ArrayList arrayList = this.f35544x0;
            if (arrayList != null) {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.f35551y0;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            ArrayList<LiveStreamsDBModel> arrayList3 = new ArrayList<>();
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("stalker_api")) {
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
                arrayList3 = this.f35337S.getLiveFavStalker(string);
            } else {
                ArrayList<FavouriteDBModel> arrayList4 = new ArrayList<>();
                if (this.f35241E1 != null) {
                    if (this.f35286K4.equals("true")) {
                        databaseHandler = this.f35241E1;
                        str = "radio_streams";
                        userID = SharepreferenceDBHandler.getUserID(this.f35404d);
                    } else {
                        databaseHandler = this.f35241E1;
                        str = "live";
                        userID = SharepreferenceDBHandler.getUserID(this.f35404d);
                    }
                    ArrayList<FavouriteDBModel> allFavourites = databaseHandler.getAllFavourites(str, userID);
                    ArrayList arrayList5 = this.f35233D0;
                    if (arrayList5 == null || arrayList5.size() <= 0 || allFavourites == null || allFavourites.size() <= 0) {
                        arrayList4 = allFavourites;
                    } else {
                        try {
                            for (FavouriteDBModel favouriteDBModel : allFavourites) {
                                Iterator it = this.f35233D0.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        arrayList4.add(favouriteDBModel);
                                        break;
                                    }
                                    if (favouriteDBModel.getCategoryID().equals((String) it.next())) {
                                        break;
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (arrayList4 != null) {
                        try {
                            if (arrayList4.size() > 0) {
                                for (FavouriteDBModel favouriteDBModel2 : arrayList4) {
                                    LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f35404d);
                                    if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("onestream_api")) {
                                        categoryID = favouriteDBModel2.getCategoryID();
                                        strValueOf = String.valueOf(favouriteDBModel2.getStreamIDOneStream());
                                        timestamp = favouriteDBModel2.getTimestamp();
                                        str2 = this.f35293L4;
                                    } else {
                                        categoryID = favouriteDBModel2.getCategoryID();
                                        strValueOf = String.valueOf(favouriteDBModel2.getStreamID());
                                        timestamp = favouriteDBModel2.getTimestamp();
                                        str2 = this.f35293L4;
                                    }
                                    LiveStreamsDBModel liveStreamFavouriteRow = liveStreamDBHandler.getLiveStreamFavouriteRow(categoryID, strValueOf, timestamp, str2);
                                    if (liveStreamFavouriteRow != null) {
                                        arrayList3.add(liveStreamFavouriteRow);
                                    }
                                }
                            }
                        } catch (Exception e9) {
                            e9.printStackTrace();
                        }
                    }
                }
            }
            if (arrayList3.size() != 0) {
                this.f35544x0 = arrayList3;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone(this.f35291L2.C()));
            String str4 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + m7.w.S(this.f35404d)));
            boolean zB = this.f35291L2.B();
            ArrayList<XMLTVProgrammePojo> ePGTesting = zB ? this.f35337S.getEPGTesting(null, str4) : null;
            this.f35383Z = getSharedPreferences("currentlyPlayingVideo", 0);
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("m3u")) {
                sharedPreferences = this.f35377Y;
                str3 = "LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U";
            } else {
                sharedPreferences = SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("onestream_api") ? this.f35377Y : this.f35377Y;
            }
            String string2 = sharedPreferences.getString(str3, "");
            ArrayList arrayList6 = this.f35544x0;
            if (arrayList6 != null && arrayList6.size() > 0) {
                for (int i9 = 0; i9 < this.f35544x0.size() && ((asyncTask = this.f35539w2) == null || !asyncTask.isCancelled()); i9++) {
                    if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("m3u")) {
                        if (((LiveStreamsDBModel) this.f35544x0.get(i9)).getUrl().equals(string2)) {
                            this.f35506r4 = i9;
                        }
                    } else if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("onestream_api")) {
                        if (((LiveStreamsDBModel) this.f35544x0.get(i9)).getStreamIdOneStream().equals(string2)) {
                            this.f35506r4 = i9;
                        }
                    } else if (((LiveStreamsDBModel) this.f35544x0.get(i9)).getStreamId().equals(string2)) {
                        this.f35506r4 = i9;
                    }
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    liveStreamsDBModel.setNum(((LiveStreamsDBModel) this.f35544x0.get(i9)).getNum());
                    liveStreamsDBModel.setName(((LiveStreamsDBModel) this.f35544x0.get(i9)).getName());
                    liveStreamsDBModel.setStreamType(((LiveStreamsDBModel) this.f35544x0.get(i9)).getStreamType());
                    liveStreamsDBModel.setStreamId(((LiveStreamsDBModel) this.f35544x0.get(i9)).getStreamId());
                    liveStreamsDBModel.setStreamIdOneStream(((LiveStreamsDBModel) this.f35544x0.get(i9)).getStreamIdOneStream());
                    liveStreamsDBModel.setStreamIcon(((LiveStreamsDBModel) this.f35544x0.get(i9)).getStreamIcon());
                    liveStreamsDBModel.setEpgChannelId(((LiveStreamsDBModel) this.f35544x0.get(i9)).getEpgChannelId());
                    liveStreamsDBModel.setAdded(((LiveStreamsDBModel) this.f35544x0.get(i9)).getAdded());
                    liveStreamsDBModel.setCategoryId(((LiveStreamsDBModel) this.f35544x0.get(i9)).getCategoryId());
                    liveStreamsDBModel.setCustomSid(((LiveStreamsDBModel) this.f35544x0.get(i9)).getCustomSid());
                    liveStreamsDBModel.setTvArchive(((LiveStreamsDBModel) this.f35544x0.get(i9)).getTvArchive());
                    liveStreamsDBModel.setDirectSource(((LiveStreamsDBModel) this.f35544x0.get(i9)).getDirectSource());
                    liveStreamsDBModel.setTvArchiveDuration(((LiveStreamsDBModel) this.f35544x0.get(i9)).getTvArchiveDuration());
                    liveStreamsDBModel.setTypeName(((LiveStreamsDBModel) this.f35544x0.get(i9)).getTypeName());
                    liveStreamsDBModel.setCategoryName(((LiveStreamsDBModel) this.f35544x0.get(i9)).getCategoryName());
                    liveStreamsDBModel.setSeriesNo(((LiveStreamsDBModel) this.f35544x0.get(i9)).getSeriesNo());
                    liveStreamsDBModel.setLive(((LiveStreamsDBModel) this.f35544x0.get(i9)).getLive());
                    liveStreamsDBModel.setContaiinerExtension(((LiveStreamsDBModel) this.f35544x0.get(i9)).getContaiinerExtension());
                    liveStreamsDBModel.setUrl(((LiveStreamsDBModel) this.f35544x0.get(i9)).getUrl());
                    if (zB && ePGTesting != null && ePGTesting.size() > 0) {
                        int i10 = 0;
                        while (true) {
                            if (i10 < ePGTesting.size() && ((asyncTask2 = this.f35539w2) == null || !asyncTask2.isCancelled())) {
                                if (((LiveStreamsDBModel) this.f35544x0.get(i9)).getEpgChannelId().equals(ePGTesting.get(i10).getChannel())) {
                                    int iM = m7.w.M(m7.w.x(ePGTesting.get(i10).getStart(), this.f35404d), m7.w.x(ePGTesting.get(i10).getStop(), this.f35404d), this.f35404d);
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
                    this.f35551y0.add(liveStreamsDBModel);
                }
            }
            this.f35544x0 = this.f35551y0;
            return "get_fav";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "get_fav";
        }
    }

    public void k4(String str) {
        e3();
        String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f35404d);
        String loggedInMacAddress = SharepreferenceDBHandler.getLoggedInMacAddress(this.f35404d);
        try {
            if (this.f35541w4 == null) {
                this.f35541w4 = new n7.g(this, this.f35404d);
            }
            this.f35541w4.e(loggedInMacAddress, stalkerToken, str);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public void l3() {
        if (this.f35549x5.getVisibility() == 0) {
            this.f35217A5.setNextFocusRightId(f.ym);
            this.f35224B5.setNextFocusRightId(f.f12383e2);
            this.f35231C5.setNextFocusRightId(f.f12342a2);
            this.f35238D5.setNextFocusRightId(f.f12296V1);
        }
    }

    public void l4(int i9, String str, int i10, int i11) {
        try {
            if (this.f35464l4.equals("mobile") && this.f35527u4 && this.f35307N4) {
                ArrayList arrayList = new ArrayList();
                PendingIntent broadcast = PendingIntent.getBroadcast(this, i11, new Intent("media_control").putExtra("control_type", i10), 67108864);
                Icon iconCreateWithResource = Icon.createWithResource(this, i9);
                AbstractC2498u.a();
                arrayList.add(AbstractC2496t.a(iconCreateWithResource, str, str, broadcast));
                this.f35244E4.setActions(arrayList);
                setPictureInPictureParams(this.f35244E4.build());
            }
        } catch (Exception unused) {
        }
    }

    public int m3(ArrayList arrayList, int i9) {
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

    @Override // z7.g
    public void o0(String str) {
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i9, int i10, Intent intent) {
        super.onActivityResult(i9, i10, intent);
        if (i9 == 101) {
            try {
                if (B3()) {
                    SharedPreferences sharedPreferences = getSharedPreferences("downloadStatus", 0);
                    f35204X5 = sharedPreferences;
                    String string = sharedPreferences.getString("downloadStatus", "");
                    m7.w wVar = new m7.w();
                    if (string.equals("processing")) {
                        wVar.L0(this);
                    } else {
                        wVar.O0(this, this.f35490p2, this.f35439i0, this.f35410e, this.f35232D, this.f35246F, this.f35239E);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        RelativeLayout relativeLayout;
        try {
            h4();
            relativeLayout = this.f35498q3;
        } catch (Exception unused) {
        }
        if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
            this.f35498q3.startAnimation(this.f35520t4);
            this.f35498q3.setVisibility(8);
            return;
        }
        if (this.f35491p3.getVisibility() == 0) {
            this.f35491p3.startAnimation(this.f35457k4);
            this.f35491p3.setVisibility(8);
            return;
        }
        RelativeLayout relativeLayout2 = this.f35563z5;
        if (relativeLayout2 != null && relativeLayout2.getVisibility() == 0) {
            this.f35563z5.setVisibility(8);
            this.f35549x5.setVisibility(8);
            this.f35549x5.startAnimation(this.f35443i4);
            this.f35563z5.startAnimation(this.f35443i4);
            this.f35423f5.setChecked(false);
            this.f35430g5.setChecked(false);
            this.f35437h5.setChecked(false);
            this.f35444i5.setChecked(false);
            this.f35388Z4.setChecked(false);
            this.f35393a5.setChecked(false);
            this.f35398b5.setChecked(false);
            this.f35403c5.setChecked(false);
            this.f35409d5.setChecked(false);
            this.f35363V4.setChecked(false);
            this.f35370W4.setChecked(false);
            this.f35376X4.setChecked(false);
            this.f35382Y4.setChecked(false);
            this.f35521t5.setText("");
            return;
        }
        if (f35205Y5) {
            if (this.f35547x3.getVisibility() != 0) {
                Toolbar toolbar = this.f35296M0;
                if (toolbar != null) {
                    toolbar.setVisibility(0);
                }
                g4();
                return;
            }
            this.f35547x3.startAnimation(this.f35443i4);
            if (this.f35456k3.getVisibility() == 0) {
                this.f35456k3.startAnimation(this.f35443i4);
            }
            if (this.f35533v3.getVisibility() == 0) {
                this.f35533v3.startAnimation(this.f35443i4);
            }
            if (this.f35470m3.getVisibility() == 0) {
                this.f35470m3.startAnimation(this.f35443i4);
            }
            if (this.f35540w3.getVisibility() == 0) {
                this.f35540w3.startAnimation(this.f35443i4);
            }
            if (this.f35463l3.getVisibility() == 0) {
                this.f35463l3.startAnimation(this.f35443i4);
            }
            this.f35547x3.setVisibility(8);
            if (this.f35456k3.getVisibility() == 0) {
                this.f35456k3.setVisibility(8);
            }
            if (this.f35533v3.getVisibility() == 0) {
                this.f35533v3.setVisibility(8);
            }
            if (this.f35470m3.getVisibility() == 0) {
                this.f35470m3.setVisibility(8);
            }
            if (this.f35540w3.getVisibility() == 0) {
                this.f35540w3.setVisibility(8);
            }
            if (this.f35463l3.getVisibility() == 0) {
                this.f35463l3.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f35464l4.equals("mobile") && this.f35527u4 && this.f35307N4) {
            try {
                E3();
            } catch (Exception unused2) {
                super.onBackPressed();
            }
        } else {
            super.onBackPressed();
        }
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
        CheckBox checkBox;
        boolean zIsChecked = ((CheckBox) compoundButton).isChecked();
        if (compoundButton.getId() == f.f12296V1) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f35423f5;
            }
        } else if (compoundButton.getId() == f.f12314X1) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f35430g5;
            }
        } else if (compoundButton.getId() == f.f12323Y1) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f35437h5;
            }
        } else if (compoundButton.getId() == f.f12305W1) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f35444i5;
            }
        } else if (compoundButton.getId() == f.f12383e2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f35363V4;
            }
        } else if (compoundButton.getId() == f.f12403g2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f35370W4;
            }
        } else if (compoundButton.getId() == f.f12413h2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f35376X4;
            }
        } else if (compoundButton.getId() == f.f12393f2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f35382Y4;
            }
        } else if (compoundButton.getId() == f.f12342a2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f35388Z4;
            }
        } else if (compoundButton.getId() == f.f12362c2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f35393a5;
            }
        } else if (compoundButton.getId() == f.f12372d2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f35398b5;
            }
        } else if (compoundButton.getId() == f.f12352b2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f35403c5;
            }
        } else if (compoundButton.getId() != f.f12332Z1 || !zIsChecked) {
            return;
        } else {
            checkBox = this.f35409d5;
        }
        this.f35308N5 = checkBox.getText().toString();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        String str2;
        C2966a c2966aF;
        String strValueOf;
        SharedPreferences.Editor editor;
        String strValueOf2;
        StringBuilder sb;
        C2966a c2966aF2;
        String strValueOf3;
        SharedPreferences.Editor editor2;
        String strValueOf4;
        String string;
        StringBuilder sb2;
        Exception exc;
        Toast toastMakeText;
        TextView textView;
        Resources resources;
        int i9;
        int i10;
        int i11;
        ImageView imageView;
        ImageView imageView2;
        String strV;
        Intent intent;
        JSONObject jSONObject;
        String str3;
        String str4;
        String str5;
        int id = view.getId();
        String str6 = "";
        if (id != f.f12275S8) {
            if (id == f.f12172I5) {
                if (!this.f35464l4.equals("tv")) {
                    boolean playerIsPrepared = this.f35434h2.getPlayerIsPrepared();
                    h4();
                    b4();
                    if (playerIsPrepared) {
                        U2(1000);
                        this.f35434h2.start();
                        this.f35519t3.setVisibility(8);
                        imageView = this.f35526u3;
                    } else {
                        U2(5000);
                        imageView = this.f35519t3;
                    }
                    imageView.setVisibility(0);
                    return;
                }
                boolean playerIsPrepared2 = this.f35434h2.getPlayerIsPrepared();
                h4();
                a4();
                if (playerIsPrepared2) {
                    T2(1000);
                    this.f35434h2.start();
                    this.f35519t3.setVisibility(8);
                    this.f35526u3.setVisibility(0);
                    imageView2 = this.f35526u3;
                } else {
                    T2(5000);
                    this.f35519t3.setVisibility(0);
                    imageView2 = this.f35519t3;
                }
                imageView2.requestFocus();
                return;
            }
            if (id == f.f12162H5) {
                try {
                    if (this.f35464l4.equals("tv")) {
                        h4();
                        a4();
                        this.f35434h2.pause();
                        this.f35526u3.setVisibility(8);
                        this.f35519t3.setVisibility(0);
                        this.f35519t3.requestFocus();
                    } else {
                        h4();
                        b4();
                        this.f35434h2.pause();
                        this.f35526u3.setVisibility(8);
                        this.f35519t3.setVisibility(0);
                    }
                    return;
                } catch (Exception e9) {
                    str = "exection " + e9;
                    str2 = "NSTIJPLAYERACTIVTY";
                }
            } else {
                if (id != f.Cl) {
                    if (id != f.El) {
                        if (id == f.f12576x3 || id == f.f12566w3 || id == f.f12596z3 || id == f.Qm) {
                            return;
                        }
                        if (id == f.f12491p) {
                            try {
                                g3(true);
                                return;
                            } catch (Exception e10) {
                                sb2 = new StringBuilder();
                                sb2.append("exection ");
                                sb2.append(e10.getMessage());
                            }
                        } else if (id == f.f12392f1) {
                            try {
                                AppBarLayout appBarLayout = this.f35324Q0;
                                if (appBarLayout != null) {
                                    toggleView(appBarLayout);
                                    this.f35324Q0.requestFocusFromTouch();
                                    return;
                                }
                                return;
                            } catch (Exception e11) {
                                e = e11;
                                sb = new StringBuilder();
                            }
                        } else {
                            if (id == f.f12295V0) {
                                try {
                                    V2();
                                    return;
                                } catch (Exception e12) {
                                    exc = e12;
                                    sb2 = new StringBuilder();
                                }
                            } else {
                                if (id != f.f12304W0) {
                                    if (id == f.f12337Z6 || id == f.f12111C4) {
                                        h4();
                                        s3();
                                        e4();
                                        return;
                                    }
                                    if (id == f.f12367c7 || id == f.f12131E4) {
                                        onBackPressed();
                                    } else if (id != f.f12171I4 && id != f.f12181J4) {
                                        if (id == f.f12581x8) {
                                            h4();
                                            s3();
                                            f35209c6 = true;
                                            this.f35434h2.B1();
                                            this.f35434h2.c1(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
                                            return;
                                        }
                                        if (id == f.f12427i6) {
                                            h4();
                                            f35209c6 = false;
                                            this.f35484o3.startAnimation(this.f35408d4);
                                            this.f35484o3.setVisibility(8);
                                            b4();
                                            U2(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
                                            return;
                                        }
                                        if (id == f.f12570w7) {
                                            h4();
                                            s3();
                                            return;
                                        }
                                        if (id == f.f12560v7) {
                                            h4();
                                            s3();
                                            X3();
                                            return;
                                        }
                                        if (id == f.f12104B7) {
                                            h4();
                                            T2(5000);
                                            NSTIJKPlayerSky nSTIJKPlayerSky = this.f35434h2;
                                            if (nSTIJKPlayerSky != null) {
                                                nSTIJKPlayerSky.K1();
                                                return;
                                            }
                                            return;
                                        }
                                        if (id == f.f12590y7 || id == f.f12271S4) {
                                            h4();
                                            s3();
                                            if (this.f35563z5.getVisibility() == 8) {
                                                this.f35563z5.startAnimation(this.f35450j4);
                                                this.f35563z5.setVisibility(0);
                                                this.f35217A5.requestFocus();
                                                this.f35528u5.requestFocus();
                                                this.f35423f5.setChecked(false);
                                                this.f35430g5.setChecked(false);
                                                this.f35437h5.setChecked(false);
                                                this.f35444i5.setChecked(false);
                                                this.f35388Z4.setChecked(false);
                                                this.f35393a5.setChecked(false);
                                                this.f35398b5.setChecked(false);
                                                this.f35403c5.setChecked(false);
                                                this.f35409d5.setChecked(false);
                                                this.f35363V4.setChecked(false);
                                                this.f35370W4.setChecked(false);
                                                this.f35376X4.setChecked(false);
                                                this.f35382Y4.setChecked(false);
                                                this.f35521t5.setText("");
                                                return;
                                            }
                                            return;
                                        }
                                        if (id == f.f12574x1) {
                                            this.f35294L5 = this.f35465l5.getText().toString();
                                            this.f35301M5 = this.f35493p5.getText().toString();
                                            i10 = 0;
                                            this.f35549x5.setVisibility(0);
                                            this.f35342S4.setVisibility(0);
                                            i11 = 8;
                                            this.f35335R4.setVisibility(8);
                                            this.f35349T4.setVisibility(8);
                                            this.f35252F5.setVisibility(8);
                                        } else {
                                            if (id == f.Jg) {
                                                this.f35294L5 = this.f35472m5.getText().toString();
                                                this.f35301M5 = this.f35500q5.getText().toString();
                                                this.f35549x5.setVisibility(0);
                                                i11 = 8;
                                                this.f35342S4.setVisibility(8);
                                                this.f35252F5.setVisibility(8);
                                                this.f35335R4.setVisibility(0);
                                                this.f35521t5.setVisibility(0);
                                                this.f35349T4.setVisibility(8);
                                                this.f35416e5.setVisibility(i11);
                                                textView = this.f35451j5;
                                                resources = getResources();
                                                i9 = a7.j.f13111Q7;
                                                textView.setText(resources.getString(i9));
                                                return;
                                            }
                                            if (id == f.f12312X) {
                                                this.f35294L5 = this.f35479n5.getText().toString();
                                                this.f35301M5 = this.f35507r5.getText().toString();
                                                i10 = 0;
                                                this.f35549x5.setVisibility(0);
                                                i11 = 8;
                                                this.f35342S4.setVisibility(8);
                                                this.f35335R4.setVisibility(8);
                                                this.f35252F5.setVisibility(8);
                                                this.f35349T4.setVisibility(0);
                                            } else {
                                                if (id == f.f12440k) {
                                                    this.f35294L5 = this.f35486o5.getText().toString();
                                                    this.f35301M5 = this.f35514s5.getText().toString();
                                                    this.f35549x5.setVisibility(0);
                                                    this.f35342S4.setVisibility(8);
                                                    this.f35335R4.setVisibility(8);
                                                    this.f35349T4.setVisibility(8);
                                                    this.f35252F5.setVisibility(8);
                                                    this.f35416e5.setVisibility(0);
                                                    this.f35521t5.setVisibility(0);
                                                    textView = this.f35451j5;
                                                    resources = getResources();
                                                    i9 = a7.j.f13111Q7;
                                                    textView.setText(resources.getString(i9));
                                                    return;
                                                }
                                                if (id == f.f12555v2) {
                                                    this.f35549x5.setVisibility(0);
                                                    this.f35342S4.setVisibility(8);
                                                    this.f35335R4.setVisibility(8);
                                                    this.f35349T4.setVisibility(8);
                                                    this.f35416e5.setVisibility(8);
                                                    this.f35252F5.setVisibility(0);
                                                    this.f35521t5.setVisibility(4);
                                                    this.f35245E5.setVisibility(0);
                                                    textView = this.f35451j5;
                                                    resources = getResources();
                                                    i9 = a7.j.f13437y0;
                                                    textView.setText(resources.getString(i9));
                                                    return;
                                                }
                                                if (id != f.tm) {
                                                    return;
                                                }
                                                if (this.f35252F5.getVisibility() == 0) {
                                                    try {
                                                        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getResources().getString(a7.j.f13447z0))));
                                                    } catch (ActivityNotFoundException e13) {
                                                        Toast.makeText(this, "No application can handle this request. Please install a webbrowser", 1).show();
                                                        e13.printStackTrace();
                                                    }
                                                    this.f35563z5.setVisibility(8);
                                                    return;
                                                }
                                                this.f35315O5 = this.f35521t5.getText().toString();
                                                Y2();
                                                if (this.f35388Z4.isChecked() || this.f35393a5.isChecked() || this.f35398b5.isChecked() || this.f35403c5.isChecked() || this.f35409d5.isChecked() || this.f35423f5.isChecked() || this.f35430g5.isChecked() || this.f35437h5.isChecked() || this.f35444i5.isChecked() || this.f35363V4.isChecked() || this.f35370W4.isChecked() || this.f35376X4.isChecked() || this.f35382Y4.isChecked() || this.f35521t5.length() > 0) {
                                                    u1();
                                                    this.f35423f5.setChecked(false);
                                                    this.f35430g5.setChecked(false);
                                                    this.f35437h5.setChecked(false);
                                                    this.f35444i5.setChecked(false);
                                                    this.f35388Z4.setChecked(false);
                                                    this.f35393a5.setChecked(false);
                                                    this.f35398b5.setChecked(false);
                                                    this.f35403c5.setChecked(false);
                                                    this.f35409d5.setChecked(false);
                                                    this.f35363V4.setChecked(false);
                                                    this.f35370W4.setChecked(false);
                                                    this.f35376X4.setChecked(false);
                                                    this.f35382Y4.setChecked(false);
                                                    this.f35521t5.setText("");
                                                    RelativeLayout relativeLayout = this.f35563z5;
                                                    if (relativeLayout == null || relativeLayout.getVisibility() != 0) {
                                                        return;
                                                    }
                                                    this.f35563z5.setVisibility(8);
                                                    this.f35549x5.setVisibility(8);
                                                    this.f35549x5.startAnimation(this.f35443i4);
                                                    this.f35563z5.startAnimation(this.f35443i4);
                                                    return;
                                                }
                                                toastMakeText = Toast.makeText(this.f35404d, "Please Add Report", 0);
                                            }
                                        }
                                        this.f35521t5.setVisibility(i10);
                                        this.f35416e5.setVisibility(i11);
                                        textView = this.f35451j5;
                                        resources = getResources();
                                        i9 = a7.j.f13111Q7;
                                        textView.setText(resources.getString(i9));
                                        return;
                                    }
                                    onBackPressed();
                                    return;
                                }
                                try {
                                    G3();
                                    return;
                                } catch (Exception e14) {
                                    exc = e14;
                                    exc.printStackTrace();
                                    sb2 = new StringBuilder();
                                }
                            }
                            sb2.append("exection ");
                            sb2.append(exc);
                        }
                        string = sb2.toString();
                        Log.e("NSTIJPLAYER", string);
                        return;
                    }
                    try {
                        AsyncTask asyncTask = this.f35553y2;
                        if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
                            this.f35553y2.cancel(true);
                        }
                        h4();
                        b4();
                        U2(5000);
                        if (this.f35434h2 != null) {
                            this.f35431h.requestFocus();
                            this.f35283K1.removeCallbacksAndMessages(null);
                            this.f35338S0 = true;
                            F3();
                            int currentWindowIndex = this.f35434h2.getCurrentWindowIndex();
                            ArrayList arrayList = this.f35558z0;
                            if (arrayList == null || arrayList.size() <= 1 || currentWindowIndex > this.f35558z0.size() - 1 || currentWindowIndex <= -1) {
                                return;
                            }
                            String name = ((LiveStreamsDBModel) this.f35558z0.get(currentWindowIndex)).getName();
                            String url = ((LiveStreamsDBModel) this.f35558z0.get(currentWindowIndex)).getUrl();
                            this.f35234D1 = url;
                            String num = ((LiveStreamsDBModel) this.f35558z0.get(currentWindowIndex)).getNum();
                            this.f35354U2 = m7.w.r0(((LiveStreamsDBModel) this.f35558z0.get(currentWindowIndex)).getNum());
                            String streamIcon = ((LiveStreamsDBModel) this.f35558z0.get(currentWindowIndex)).getStreamIcon();
                            try {
                                if (streamIcon.equals("") || streamIcon.isEmpty()) {
                                    this.f35494q.setImageDrawable(this.f35404d.getResources().getDrawable(a7.e.f12016i1));
                                } else {
                                    com.squareup.picasso.t.q(this.f35404d).l(streamIcon).j(a7.e.f12016i1).d(a7.e.f12016i1).k(80, 55).g(this.f35494q);
                                }
                            } catch (Exception unused) {
                                this.f35494q.setImageDrawable(this.f35404d.getResources().getDrawable(a7.e.f12016i1));
                            }
                            this.f35434h2.setTitle(num + " - " + name);
                            this.f35265H4 = num + " - " + name;
                            this.f35346T1 = currentWindowIndex;
                            this.f35325Q1.clear();
                            this.f35325Q1.apply();
                            this.f35332R1.clear();
                            this.f35332R1.apply();
                            this.f35318P1.clear();
                            this.f35318P1.apply();
                            if (this.f35476n2.booleanValue()) {
                                this.f35283K1.postDelayed(new j(currentWindowIndex, name, url), SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("stalker_api") ? 1000 : 200);
                            }
                            this.f35297M1.removeCallbacksAndMessages(null);
                            this.f35220B1 = m7.w.q0(((LiveStreamsDBModel) this.f35558z0.get(currentWindowIndex)).getStreamId());
                            if (this.f35413e2.equals("m3u")) {
                                c2966aF2 = C2966a.f();
                                strValueOf3 = this.f35234D1;
                            } else if (this.f35413e2.equals("onestream_api")) {
                                c2966aF2 = C2966a.f();
                                strValueOf3 = this.f35227C1;
                            } else {
                                c2966aF2 = C2966a.f();
                                strValueOf3 = String.valueOf(this.f35220B1);
                            }
                            c2966aF2.A(strValueOf3);
                            if (this.f35248F1 != null) {
                                if (this.f35413e2.equals("onestream_api")) {
                                    editor2 = this.f35248F1;
                                    strValueOf4 = String.valueOf(((LiveStreamsDBModel) this.f35558z0.get(currentWindowIndex)).getStreamIdOneStream());
                                } else {
                                    editor2 = this.f35248F1;
                                    strValueOf4 = String.valueOf(((LiveStreamsDBModel) this.f35558z0.get(currentWindowIndex)).getStreamId());
                                }
                                editor2.putString("currentlyPlayingVideo", strValueOf4);
                                this.f35248F1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", ((LiveStreamsDBModel) this.f35558z0.get(currentWindowIndex)).getUrl());
                                this.f35248F1.apply();
                            }
                            SharedPreferences.Editor editor3 = this.f35255G1;
                            if (editor3 != null) {
                                editor3.putInt("currentlyPlayingVideoPosition", currentWindowIndex);
                                this.f35255G1.apply();
                            }
                            if (this.f35214A2 != 0) {
                                this.f35214A2 = currentWindowIndex;
                            }
                            this.f35351U.notifyDataSetChanged();
                            return;
                        }
                        return;
                    } catch (Exception e15) {
                        e = e15;
                        sb = new StringBuilder();
                    }
                    sb.append("exection ");
                    sb.append(e);
                    string = sb.toString();
                    Log.e("NSTIJPLAYER", string);
                    return;
                }
                try {
                    AsyncTask asyncTask2 = this.f35553y2;
                    if (asyncTask2 != null && asyncTask2.getStatus().equals(AsyncTask.Status.RUNNING)) {
                        this.f35553y2.cancel(true);
                    }
                    h4();
                    b4();
                    U2(5000);
                    if (this.f35434h2 != null) {
                        this.f35438i.requestFocus();
                        this.f35283K1.removeCallbacksAndMessages(null);
                        N3();
                        this.f35338S0 = true;
                        int currentWindowIndex2 = this.f35434h2.getCurrentWindowIndex();
                        ArrayList arrayList2 = this.f35558z0;
                        if (arrayList2 == null || arrayList2.size() <= 1 || currentWindowIndex2 > this.f35558z0.size() - 1 || currentWindowIndex2 <= -1) {
                            return;
                        }
                        String name2 = ((LiveStreamsDBModel) this.f35558z0.get(currentWindowIndex2)).getName();
                        String num2 = ((LiveStreamsDBModel) this.f35558z0.get(currentWindowIndex2)).getNum();
                        this.f35354U2 = m7.w.r0(((LiveStreamsDBModel) this.f35558z0.get(currentWindowIndex2)).getNum());
                        String url2 = ((LiveStreamsDBModel) this.f35558z0.get(currentWindowIndex2)).getUrl();
                        this.f35234D1 = url2;
                        String streamIcon2 = ((LiveStreamsDBModel) this.f35558z0.get(currentWindowIndex2)).getStreamIcon();
                        try {
                            if (streamIcon2.equals("") || streamIcon2.isEmpty()) {
                                this.f35494q.setImageDrawable(this.f35404d.getResources().getDrawable(a7.e.f12016i1));
                            } else {
                                com.squareup.picasso.t.q(this.f35404d).l(streamIcon2).j(a7.e.f12016i1).d(a7.e.f12016i1).k(80, 55).g(this.f35494q);
                            }
                        } catch (Exception unused2) {
                            this.f35494q.setImageDrawable(this.f35404d.getResources().getDrawable(a7.e.f12016i1));
                        }
                        this.f35434h2.setTitle(num2 + " - " + name2);
                        this.f35265H4 = num2 + " - " + name2;
                        this.f35346T1 = currentWindowIndex2;
                        this.f35325Q1.clear();
                        this.f35325Q1.apply();
                        this.f35332R1.clear();
                        this.f35332R1.apply();
                        this.f35318P1.clear();
                        this.f35318P1.apply();
                        if (this.f35476n2.booleanValue()) {
                            this.f35283K1.postDelayed(new i(currentWindowIndex2, name2, url2), SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("stalker_api") ? 1000 : 200);
                        }
                        this.f35297M1.removeCallbacksAndMessages(null);
                        this.f35220B1 = m7.w.q0(((LiveStreamsDBModel) this.f35558z0.get(currentWindowIndex2)).getStreamId());
                        if (this.f35413e2.equals("m3u")) {
                            c2966aF = C2966a.f();
                            strValueOf = this.f35234D1;
                        } else if (this.f35413e2.equals("onestream_api")) {
                            c2966aF = C2966a.f();
                            strValueOf = this.f35227C1;
                        } else {
                            c2966aF = C2966a.f();
                            strValueOf = String.valueOf(this.f35220B1);
                        }
                        c2966aF.A(strValueOf);
                        if (this.f35248F1 != null) {
                            if (this.f35413e2.equals("onestream_api")) {
                                editor = this.f35248F1;
                                strValueOf2 = String.valueOf(((LiveStreamsDBModel) this.f35558z0.get(currentWindowIndex2)).getStreamIdOneStream());
                            } else {
                                editor = this.f35248F1;
                                strValueOf2 = String.valueOf(((LiveStreamsDBModel) this.f35558z0.get(currentWindowIndex2)).getStreamId());
                            }
                            editor.putString("currentlyPlayingVideo", strValueOf2);
                            this.f35248F1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", ((LiveStreamsDBModel) this.f35558z0.get(currentWindowIndex2)).getUrl());
                            this.f35248F1.apply();
                        }
                        SharedPreferences.Editor editor4 = this.f35255G1;
                        if (editor4 != null) {
                            editor4.putInt("currentlyPlayingVideoPosition", currentWindowIndex2);
                            this.f35255G1.apply();
                        }
                        if (this.f35214A2 != 0) {
                            this.f35214A2 = currentWindowIndex2;
                        }
                        this.f35351U.notifyDataSetChanged();
                        return;
                    }
                    return;
                } catch (Exception e16) {
                    str = "exection " + e16;
                    str2 = "NSTIJPLAYERskyACTIVTY";
                }
            }
            Log.e(str2, str);
            return;
        }
        if (!SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("stalker_api")) {
            this.f35279J4 = true;
            if (this.f35225C) {
                return;
            }
            O3();
            if (this.f35413e2.equals("m3u")) {
                if (this.f35476n2.booleanValue()) {
                    Intent intent2 = new Intent(this.f35404d, (Class<?>) NSTIJKPlayerMultiActivity.class);
                    intent2.putExtra("url", this.f35234D1);
                    C2966a.f().A(this.f35234D1);
                    intent2.putExtra("CHANNEL_NUM", this.f35354U2);
                    this.f35404d.startActivity(intent2);
                    return;
                }
                return;
            }
            if (this.f35413e2.equals("onestream_api")) {
                if (!this.f35476n2.booleanValue()) {
                    return;
                }
                try {
                    jSONObject = new JSONObject(this.f35323Q);
                    String str7 = this.f35439i0;
                    str3 = "m3u8";
                    str4 = "ts";
                    if (str7 == null || str7.isEmpty() || !this.f35439i0.equals(".ts")) {
                        strV = "";
                        str5 = strV;
                    } else {
                        Iterator<String> itKeys = jSONObject.keys();
                        while (true) {
                            if (!itKeys.hasNext()) {
                                str5 = "";
                                break;
                            } else if (itKeys.next().equals("ts")) {
                                str5 = "ts";
                                break;
                            }
                        }
                        if (str5.equals("")) {
                            while (true) {
                                if (!itKeys.hasNext()) {
                                    break;
                                } else if (itKeys.next().equals("m3u8")) {
                                    str5 = "m3u8";
                                    break;
                                }
                            }
                        }
                        strV = jSONObject.getString(str5);
                    }
                } catch (Exception unused3) {
                }
                try {
                    String str8 = this.f35439i0;
                    if (str8 != null && !str8.isEmpty() && this.f35439i0.equals(".m3u8")) {
                        Iterator<String> itKeys2 = jSONObject.keys();
                        while (true) {
                            if (!itKeys2.hasNext()) {
                                str3 = str5;
                                break;
                            } else if (itKeys2.next().equals("m3u8")) {
                                break;
                            }
                        }
                        if (str3.equals("")) {
                            while (itKeys2.hasNext()) {
                                if (itKeys2.next().equals("ts")) {
                                    break;
                                }
                            }
                            str4 = str3;
                            strV = jSONObject.getString(str4);
                        } else {
                            str4 = str3;
                            strV = jSONObject.getString(str4);
                        }
                    }
                } catch (Exception unused4) {
                    str6 = strV;
                    strV = str6;
                }
                C2966a.f().A(this.f35227C1);
                intent = new Intent(this.f35404d, (Class<?>) NSTIJKPlayerMultiActivity.class);
            } else {
                if (this.f35220B1 == -1 || !this.f35476n2.booleanValue()) {
                    return;
                }
                strV = m7.w.V(this.f35404d, this.f35220B1, this.f35439i0, "live");
                C2966a.f().A(String.valueOf(this.f35220B1));
                intent = new Intent(this.f35404d, (Class<?>) NSTIJKPlayerMultiActivity.class);
            }
            intent.putExtra("url", strV);
            intent.putExtra("CHANNEL_NUM", this.f35354U2);
            this.f35404d.startActivity(intent);
            return;
        }
        toastMakeText = Toast.makeText(this.f35404d, "This feature has been disabled.", 1);
        toastMakeText.show();
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        J2(configuration);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f35404d = this;
        x3();
        super.onCreate(bundle);
        SharedPreferences sharedPreferences = this.f35404d.getSharedPreferences("auto_start", 0);
        this.f35300M4 = sharedPreferences;
        boolean z9 = sharedPreferences.getBoolean("picinpic", AbstractC2237a.f44541u0);
        this.f35307N4 = z9;
        if (z9 && Build.VERSION.SDK_INT >= 26) {
            this.f35244E4 = AbstractC2500v.a();
        }
        setContentView(a7.g.f12604A1);
        this.f35380Y2 = (RadioGroup) findViewById(f.Kg);
        this.f35386Z2 = (RadioGroup) findViewById(f.f12321Y);
        this.f35391a3 = (RadioGroup) findViewById(f.Gm);
        this.f35396b3 = (TextView) findViewById(f.Wl);
        this.f35435h3 = (FrameLayout) findViewById(f.f12307W3);
        this.f35442i3 = (SeekBar) findViewById(f.Lf);
        this.f35449j3 = (SeekBar) findViewById(f.Kf);
        this.f35456k3 = (LinearLayout) findViewById(f.f12438j7);
        this.f35463l3 = (LinearLayout) findViewById(f.Ea);
        this.f35401c3 = (TextView) findViewById(f.Mh);
        this.f35407d3 = (TextView) findViewById(f.mm);
        this.f35470m3 = (LinearLayout) findViewById(f.h9);
        this.f35491p3 = (RelativeLayout) findViewById(f.lf);
        this.f35498q3 = (RelativeLayout) findViewById(f.ne);
        this.f35505r3 = (ImageView) findViewById(f.f12466m5);
        this.f35477n3 = (LinearLayout) findViewById(f.f12581x8);
        this.f35484o3 = (LinearLayout) findViewById(f.O9);
        this.f35512s3 = (ImageView) findViewById(f.f12427i6);
        this.f35414e3 = (TextView) findViewById(f.uk);
        this.f35421f3 = (TextView) findViewById(f.Ak);
        this.f35428g3 = (TextView) findViewById(f.Ck);
        this.f35547x3 = (LinearLayout) findViewById(f.t9);
        this.f35519t3 = (ImageView) findViewById(f.f12172I5);
        this.f35526u3 = (ImageView) findViewById(f.f12162H5);
        this.f35533v3 = (ImageView) findViewById(f.Cl);
        this.f35540w3 = (ImageView) findViewById(f.El);
        this.f35554y3 = (LinearLayout) findViewById(f.f12357b7);
        this.f35229C3 = (ImageView) findViewById(f.f12171I4);
        this.f35236D3 = (ImageView) findViewById(f.f12181J4);
        this.f35243E3 = (ImageView) findViewById(f.f12131E4);
        this.f35561z3 = (LinearLayout) findViewById(f.f12367c7);
        this.f35250F3 = (ImageView) findViewById(f.f12111C4);
        this.f35215A3 = (LinearLayout) findViewById(f.f12104B7);
        this.f35257G3 = (ImageView) findViewById(f.f12477n5);
        this.f35222B3 = (LinearLayout) findViewById(f.f12328Y6);
        this.f35264H3 = (LinearLayout) findViewById(f.L9);
        this.f35271I3 = (LinearLayout) findViewById(f.f12275S8);
        this.f35278J3 = (LinearLayout) findViewById(f.f12560v7);
        this.f35285K3 = (TextView) findViewById(f.lj);
        this.f35292L3 = (TextView) findViewById(f.ei);
        this.f35299M3 = (TextView) findViewById(f.al);
        this.f35306N3 = (TextView) findViewById(f.Pl);
        this.f35313O3 = (RecyclerView) findViewById(f.Fd);
        this.f35320P3 = (LinearLayout) findViewById(f.i9);
        this.f35327Q3 = (LinearLayout) findViewById(f.W8);
        this.f35334R3 = (LinearLayout) findViewById(f.f12520r7);
        this.f35348T3 = (TextView) findViewById(f.Vh);
        this.f35341S3 = (LinearLayout) findViewById(f.f12570w7);
        this.f35369W3 = (MediaRouteButton) findViewById(f.f12188K1);
        this.f35375X3 = (ImageView) findViewById(f.f12309W5);
        this.f35387Z3 = (LinearLayout) findViewById(f.f12408g7);
        this.f35392a4 = (LinearLayout) findViewById(f.f12418h7);
        this.f35355U3 = (TextView) findViewById(f.ah);
        this.f35362V3 = (TextView) findViewById(f.Hk);
        this.f35381Y3 = (ImageView) findViewById(f.f12141F4);
        this.f35397b4 = (LinearLayout) findViewById(f.f12337Z6);
        this.f35335R4 = (RelativeLayout) findViewById(f.Hg);
        this.f35342S4 = (RelativeLayout) findViewById(f.f12564w1);
        this.f35349T4 = (RelativeLayout) findViewById(f.f12330Z);
        this.f35356U4 = (TextView) findViewById(f.ym);
        this.f35363V4 = (CheckBox) findViewById(f.f12383e2);
        this.f35370W4 = (CheckBox) findViewById(f.f12403g2);
        this.f35376X4 = (CheckBox) findViewById(f.f12413h2);
        this.f35382Y4 = (CheckBox) findViewById(f.f12393f2);
        this.f35388Z4 = (CheckBox) findViewById(f.f12342a2);
        this.f35393a5 = (CheckBox) findViewById(f.f12362c2);
        this.f35398b5 = (CheckBox) findViewById(f.f12372d2);
        this.f35403c5 = (CheckBox) findViewById(f.f12352b2);
        this.f35409d5 = (CheckBox) findViewById(f.f12332Z1);
        this.f35416e5 = (RelativeLayout) findViewById(f.f12430j);
        this.f35423f5 = (CheckBox) findViewById(f.f12296V1);
        this.f35430g5 = (CheckBox) findViewById(f.f12314X1);
        this.f35437h5 = (CheckBox) findViewById(f.f12323Y1);
        this.f35444i5 = (CheckBox) findViewById(f.f12305W1);
        this.f35451j5 = (TextView) findViewById(f.tm);
        this.f35458k5 = (LinearLayout) findViewById(f.f12600z7);
        this.f35465l5 = (TextView) findViewById(f.f12554v1);
        this.f35472m5 = (TextView) findViewById(f.Fg);
        this.f35479n5 = (TextView) findViewById(f.f12340a0);
        this.f35486o5 = (TextView) findViewById(f.f12450l);
        this.f35493p5 = (TextView) findViewById(f.f12584y1);
        this.f35500q5 = (TextView) findViewById(f.Lg);
        this.f35507r5 = (TextView) findViewById(f.f12350b0);
        this.f35514s5 = (TextView) findViewById(f.f12460m);
        this.f35521t5 = (EditText) findViewById(f.f12190K3);
        this.f35528u5 = (LinearLayout) findViewById(f.f12316X3);
        this.f35535v5 = (LinearLayout) findViewById(f.f12590y7);
        this.f35542w5 = (LinearLayout) findViewById(f.xa);
        this.f35549x5 = (LinearLayout) findViewById(f.f12339a);
        this.f35556y5 = (ImageView) findViewById(f.f12271S4);
        this.f35563z5 = (RelativeLayout) findViewById(f.ee);
        this.f35217A5 = (LinearLayout) findViewById(f.f12574x1);
        this.f35224B5 = (LinearLayout) findViewById(f.Jg);
        this.f35231C5 = (LinearLayout) findViewById(f.f12312X);
        this.f35238D5 = (LinearLayout) findViewById(f.f12440k);
        this.f35245E5 = (LinearLayout) findViewById(f.f12555v2);
        this.f35252F5 = (RelativeLayout) findViewById(f.f12545u2);
        this.f35347T2 = (ImageView) findViewById(f.Xa);
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        if (AbstractC2237a.f44475V0.booleanValue()) {
            this.f35542w5.setVisibility(0);
        } else {
            this.f35542w5.setVisibility(4);
        }
        this.f35291L2 = new C2858a(this.f35404d);
        try {
            this.f35326Q2 = new InterfaceC2329f() { // from class: t7.f
            };
            this.f35319P2 = C2325b.e(this);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        A3();
        RelativeLayout relativeLayout = this.f35372X0;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new v());
        }
        this.f35233D0 = n3();
        String str = this.f35412e1;
        this.f35321P4 = str;
        if (str == null || str.equals("") || !this.f35412e1.equals("0")) {
            String str2 = this.f35412e1;
            if (str2 == null || str2.equals("") || !this.f35412e1.equals("-1")) {
                String str3 = this.f35412e1;
                if (str3 == null || str3.equals("") || !this.f35412e1.equals("-6")) {
                    M2();
                } else {
                    R2();
                }
            } else {
                Q2();
            }
        } else {
            K2();
        }
        this.f35546x2 = new C().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        l3();
        String strI1 = FreeTrailActivity.I1();
        this.f35280J5 = strI1;
        if (strI1.equals("") || this.f35280J5.isEmpty()) {
            this.f35280J5 = m7.w.I(this.f35404d);
        }
        this.f35423f5.setOnCheckedChangeListener(this);
        this.f35430g5.setOnCheckedChangeListener(this);
        this.f35437h5.setOnCheckedChangeListener(this);
        this.f35444i5.setOnCheckedChangeListener(this);
        this.f35388Z4.setOnCheckedChangeListener(this);
        this.f35393a5.setOnCheckedChangeListener(this);
        this.f35398b5.setOnCheckedChangeListener(this);
        this.f35403c5.setOnCheckedChangeListener(this);
        this.f35409d5.setOnCheckedChangeListener(this);
        this.f35363V4.setOnCheckedChangeListener(this);
        this.f35370W4.setOnCheckedChangeListener(this);
        this.f35376X4.setOnCheckedChangeListener(this);
        this.f35382Y4.setOnCheckedChangeListener(this);
        this.f35356U4.setOnClickListener(new x());
        C2386a.b(this.f35404d).c(this.f35350T5, new IntentFilter("pip_mode_switch_user"));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f35296M0.x(h.f12935r);
        this.f35390a2 = menu;
        this.f35395b2 = menu.getItem(2).getSubMenu().findItem(f.f12239P2);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("api")) {
            menu.getItem(2).getSubMenu().findItem(f.gb).setVisible(false);
        }
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("onestream_api")) {
            menu.getItem(2).getSubMenu().findItem(f.gb).setVisible(false);
        }
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f35404d.getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f35296M0.getChildCount(); i9++) {
            if (this.f35296M0.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f35296M0.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
        return true;
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            if (this.f35350T5 != null) {
                C2386a.b(this.f35404d).e(this.f35350T5);
            }
            Z2();
            O3();
            C2325b.e(this.f35404d).c().e(this.f35305N2, C2328e.class);
        } catch (Exception unused) {
        }
        try {
            Thread thread = this.f35343S5;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f35343S5.interrupt();
        } catch (Exception unused2) {
        }
    }

    @Override // androidx.appcompat.app.b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        keyEvent.getRepeatCount();
        keyEvent.getAction();
        boolean z9 = f35205Y5;
        if (z9) {
            if (i9 == 20) {
                this.f35476n2.booleanValue();
                return true;
            }
            if (i9 == 19) {
                this.f35476n2.booleanValue();
                return true;
            }
        }
        if (i9 == 166) {
            if (z9) {
                this.f35476n2.booleanValue();
            }
            return true;
        }
        if (i9 != 167) {
            return super.onKeyDown(i9, keyEvent);
        }
        if (z9) {
            this.f35476n2.booleanValue();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        NSTIJKPlayerSky nSTIJKPlayerSky;
        StringBuilder sb;
        boolean z9 = keyEvent.getRepeatCount() == 0;
        if (i9 != 62) {
            if (i9 != 66) {
                if (i9 != 79) {
                    if (i9 == 82) {
                        Menu menu = this.f35390a2;
                        if (menu != null) {
                            menu.performIdentifierAction(f.f12239P2, 0);
                        }
                    } else if (i9 != 85 && i9 != 86 && i9 != 126 && i9 != 127) {
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
                                if (f35205Y5 && !SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("stalker_api")) {
                                    this.f35311O1.removeCallbacksAndMessages(null);
                                    int i10 = 7;
                                    if (i9 == 7) {
                                        this.f35353U1.append(0);
                                    } else if (i9 == 8) {
                                        this.f35353U1.append(1);
                                    } else {
                                        if (i9 == 9) {
                                            sb = this.f35353U1;
                                            i10 = 2;
                                        } else if (i9 == 10) {
                                            sb = this.f35353U1;
                                            i10 = 3;
                                        } else if (i9 == 11) {
                                            sb = this.f35353U1;
                                            i10 = 4;
                                        } else if (i9 == 12) {
                                            sb = this.f35353U1;
                                            i10 = 5;
                                        } else if (i9 == 13) {
                                            sb = this.f35353U1;
                                            i10 = 6;
                                        } else if (i9 == 14) {
                                            sb = this.f35353U1;
                                        } else if (i9 == 15) {
                                            this.f35353U1.append(8);
                                        } else if (i9 == 16) {
                                            this.f35353U1.append(9);
                                        }
                                        sb.append(i10);
                                    }
                                    this.f35367W1.setText(this.f35353U1.toString());
                                    this.f35360V1.setVisibility(0);
                                    this.f35311O1.postDelayed(new RunnableC1483h(), 3000L);
                                }
                                return true;
                            default:
                                switch (i9) {
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
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
            return true;
        }
        if (this.f35476n2.booleanValue() && (nSTIJKPlayerSky = this.f35434h2) != null && nSTIJKPlayerSky.getPlayerIsPrepared()) {
            ((!z9 || this.f35434h2.isPlaying()) ? this.f35526u3 : this.f35519t3).performClick();
        }
        return true;
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        intent.putExtra("BUNDLE_KEY_NEW_INTENT_CALLED", true);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        y3();
        this.f35395b2 = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == f.Gb) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == f.Mb) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == f.f12390f && (context = this.f35404d) != null) {
            new a.C0158a(context, a7.k.f13456a).setTitle(this.f35404d.getResources().getString(a7.j.f13250f3)).f(this.f35404d.getResources().getString(a7.j.f13240e3)).j(this.f35404d.getResources().getString(a7.j.f13132S8), new r()).g(this.f35404d.getResources().getString(a7.j.f13231d4), new q()).n();
        }
        if (itemId == f.f12400g) {
            SearchView searchView = (SearchView) AbstractC0980w.b(menuItem);
            this.f35303N0 = searchView;
            searchView.setQueryHint(this.f35404d.getResources().getString(a7.j.f12950A6));
            this.f35303N0.setIconifiedByDefault(false);
            this.f35303N0.setOnQueryTextListener(new s());
            return true;
        }
        if (itemId == f.gb) {
            a.C0158a c0158a = new a.C0158a(this);
            c0158a.setTitle(this.f35404d.getResources().getString(a7.j.f13397u0));
            c0158a.f(this.f35404d.getResources().getString(a7.j.f13134T0));
            c0158a.d(a7.e.f12056s1);
            c0158a.j(this.f35404d.getResources().getString(a7.j.f13132S8), new t());
            c0158a.g(this.f35404d.getResources().getString(a7.j.f13231d4), new u());
            c0158a.n();
        }
        if (itemId == f.mb) {
            f4(this);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f35328Q4;
            if (thread != null && thread.isAlive()) {
                this.f35328Q4.interrupt();
            }
        } catch (Exception unused) {
        }
        try {
            C2325b c2325b = this.f35319P2;
            if (c2325b != null) {
                c2325b.c().e(this.f35305N2, C2328e.class);
            }
        } catch (Exception unused2) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z9, Configuration configuration) {
        try {
            super.onPictureInPictureModeChanged(z9, configuration);
            if (z9) {
                AbstractC2237a.f44531p1 = true;
                NSTIJKPlayerSky nSTIJKPlayerSky = this.f35434h2;
                if (nSTIJKPlayerSky != null && nSTIJKPlayerSky.f37089W != null) {
                    nSTIJKPlayerSky.setShowOrHideSubtitles("gone");
                    this.f35434h2.f37089W.setVisibility(8);
                }
                o oVar = new o();
                this.f35251F4 = oVar;
                registerReceiver(oVar, new IntentFilter("media_control"));
                return;
            }
            f35205Y5 = true;
            unregisterReceiver(this.f35251F4);
            this.f35534v4 = false;
            this.f35251F4 = null;
            NSTIJKPlayerSky nSTIJKPlayerSky2 = this.f35434h2;
            if (nSTIJKPlayerSky2 != null && nSTIJKPlayerSky2.f37089W != null) {
                nSTIJKPlayerSky2.setShowOrHideSubtitles("visible");
                this.f35434h2.f37089W.setVisibility(0);
            }
            NSTIJKPlayerSky nSTIJKPlayerSky3 = this.f35434h2;
            if (nSTIJKPlayerSky3 != null) {
                nSTIJKPlayerSky3.isPlaying();
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        if (i9 != 101) {
            return;
        }
        try {
            if (iArr.length > 0 && iArr[0] == 0) {
                B3();
            } else if (Build.VERSION.SDK_INT >= 23 && !shouldShowRequestPermissionRationale(strArr[0])) {
                a.C0158a c0158a = new a.C0158a(this, a7.k.f13456a);
                View viewInflate = LayoutInflater.from(this).inflate(a7.g.f12738W3, (ViewGroup) null);
                Button button = (Button) viewInflate.findViewById(f.f12361c1);
                Button button2 = (Button) viewInflate.findViewById(f.f12286U0);
                button.setOnFocusChangeListener(new w.k((View) button, this));
                button2.setOnFocusChangeListener(new w.k((View) button2, this));
                button.setOnClickListener(new ViewOnClickListenerC1476a());
                button2.setOnClickListener(new ViewOnClickListenerC1477b());
                c0158a.setView(viewInflate);
                this.f35462l2 = c0158a.create();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f35462l2.getWindow();
                Objects.requireNonNull(window);
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                this.f35462l2.show();
                this.f35462l2.getWindow().setAttributes(layoutParams);
                this.f35462l2.setCancelable(false);
                this.f35462l2.show();
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        AppOpsManager appOpsManager;
        x3();
        super.onResume();
        Thread thread = this.f35328Q4;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new B());
            this.f35328Q4 = thread2;
            thread2.start();
        }
        Context context = this.f35404d;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("auto_start", 0);
            this.f35300M4 = sharedPreferences;
            boolean z9 = sharedPreferences.getBoolean("picinpic", AbstractC2237a.f44541u0);
            this.f35307N4 = z9;
            if (z9 && this.f35464l4.equals("mobile")) {
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 26) {
                    this.f35244E4 = AbstractC2500v.a();
                }
                if (i9 >= 26) {
                    try {
                        if (getPackageManager().hasSystemFeature("android.software.picture_in_picture") && (appOpsManager = (AppOpsManager) this.f35404d.getSystemService("appops")) != null && appOpsManager.checkOpNoThrow("android:picture_in_picture", Process.myUid(), this.f35404d.getPackageName()) == 0) {
                            this.f35527u4 = true;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("BUNDLE_KEY_NEW_INTENT_CALLED", false)) {
            intent.putExtra("BUNDLE_KEY_NEW_INTENT_CALLED", false);
            setIntent(intent);
            this.f35383Z = getSharedPreferences("currentlyPlayingVideo", 0);
            if (!String.valueOf(getIntent().getIntExtra("OPENED_STREAM_ID", 0)).equals(SharepreferenceDBHandler.getCurrentAPPType(this.f35404d).equals("m3u") ? this.f35377Y.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", "") : this.f35377Y.getString("currentlyPlayingVideo", ""))) {
                this.f35525u2 = getIntent().getStringExtra("OPENED_CAT_ID");
                this.f35419f1 = getIntent().getStringExtra("OPENED_CAT_NAME");
                this.f35511s2 = getIntent().getIntExtra("OPENED_STREAM_ID", 0);
                this.f35346T1 = getIntent().getIntExtra("VIDEO_NUM", 0);
                this.f35412e1 = this.f35525u2;
                this.f35420f2 = getIntent().getStringExtra("VIDEO_URL");
                this.f35385Z1 = Boolean.FALSE;
                String str = this.f35412e1;
                if (str == null || str.equals("") || !this.f35412e1.equals("0")) {
                    String str2 = this.f35412e1;
                    if (str2 == null || str2.equals("") || !this.f35412e1.equals("-1")) {
                        String str3 = this.f35412e1;
                        if (str3 == null || str3.equals("") || !this.f35412e1.equals("-6")) {
                            M2();
                        } else {
                            R2();
                        }
                    } else {
                        Q2();
                    }
                } else {
                    K2();
                }
            }
        }
        m7.w.m(this.f35404d);
        C2325b c2325b = this.f35319P2;
        if (c2325b != null) {
            c2325b.c().a(this.f35305N2, C2328e.class);
        }
        y3();
        if (this.f35221B2) {
            this.f35221B2 = false;
            ArrayList arrayList = this.f35530v0;
            if (arrayList == null || arrayList.size() == 0) {
                AbstractC2237a.f44480Y = Boolean.FALSE;
                I3();
            } else {
                M3(this.f35530v0);
            }
            T t9 = this.f35351U;
            if (t9 != null) {
                t9.notifyDataSetChanged();
            }
        }
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStart() {
        super.onStart();
        try {
            C2325b.e(this.f35404d).c().a(this.f35305N2, C2328e.class);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            O3();
            if (this.f35464l4.equals("mobile") && !this.f35279J4 && this.f35527u4 && this.f35307N4) {
                finishAndRemoveTask();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (this.f35464l4.equals("mobile") && this.f35527u4 && this.f35307N4 && !this.f35279J4 && !isInPictureInPictureMode()) {
            try {
                E3();
                this.f35534v4 = true;
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        x3();
        if (z9) {
            J2(getResources().getConfiguration());
        }
    }

    @Override // z7.g
    public void q(StalkerGetVODByCatCallback stalkerGetVODByCatCallback) {
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

    public void t3() {
        if (f35209c6 || this.f35547x3.getVisibility() != 0) {
            return;
        }
        this.f35547x3.startAnimation(this.f35443i4);
        if (this.f35456k3.getVisibility() == 0) {
            this.f35456k3.startAnimation(this.f35443i4);
        }
        if (this.f35533v3.getVisibility() == 0) {
            this.f35533v3.startAnimation(this.f35443i4);
        }
        if (this.f35470m3.getVisibility() == 0) {
            this.f35470m3.startAnimation(this.f35443i4);
        }
        if (this.f35540w3.getVisibility() == 0) {
            this.f35540w3.startAnimation(this.f35443i4);
        }
        if (this.f35463l3.getVisibility() == 0) {
            this.f35463l3.startAnimation(this.f35443i4);
        }
        this.f35547x3.setVisibility(8);
        if (this.f35456k3.getVisibility() == 0) {
            this.f35456k3.setVisibility(8);
        }
        if (this.f35533v3.getVisibility() == 0) {
            this.f35533v3.setVisibility(8);
        }
        if (this.f35470m3.getVisibility() == 0) {
            this.f35470m3.setVisibility(8);
        }
        if (this.f35540w3.getVisibility() == 0) {
            this.f35540w3.setVisibility(8);
        }
        if (this.f35463l3.getVisibility() == 0) {
            this.f35463l3.setVisibility(8);
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
            this.f35548x4 = cmd;
            String[] strArrSplit = cmd.split("ffmpeg ", 0);
            if (strArrSplit.length == 2) {
                this.f35555y4 = strArrSplit[1];
            }
            if (str6.equals("playFirstTime")) {
                M3(this.f35537w0);
                if (this.f35338S0 && this.f35345T0 && !this.f35352U0.equals("")) {
                    this.f35214A2 = 0;
                    try {
                        this.f35214A2 = m3(this.f35537w0, m7.w.r0(this.f35352U0));
                    } catch (NumberFormatException | Exception unused) {
                    }
                    this.f35338S0 = false;
                    this.f35345T0 = false;
                    return;
                }
                return;
            }
            if (str6.equals("channel_click")) {
                K3(this.f35562z4, this.f35295M);
                return;
            }
            if (str6.equals("channel_click_from_player")) {
                L3(this.f35216A4, this.f35302N);
            } else if (str6.equals("zappingRight")) {
                n4(i11, str7, str8);
            } else if (str6.equals("zappingLeft")) {
                m4(i11, str7, str8);
            }
        } catch (Exception unused2) {
        }
    }

    @Override // z7.g
    public void v0(String str) {
    }

    public void w3() {
        LinearLayout linearLayout = this.f35327Q3;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    @Override // z7.g
    public void y0(String str) {
    }
}
