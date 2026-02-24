package com.nst.iptvsmarterstvbox.view.ijkplayer.activities;

import D.AbstractC0519b;
import a7.f;
import a7.h;
import android.R;
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
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Log;
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
import android.widget.FrameLayout;
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
import androidx.appcompat.app.b;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
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
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv;
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
import org.json.JSONException;
import org.json.JSONObject;
import q7.C2635t;
import q7.P;
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
import w7.k;
import x7.C2966a;
import z7.g;
import z7.j;

/* JADX INFO: loaded from: classes4.dex */
public class NSTIJKPlayerSkyTvActivity extends b implements SurfaceHolder.Callback, View.OnClickListener, j, g, CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: E5, reason: collision with root package name */
    public static SharedPreferences f35624E5;

    /* JADX INFO: renamed from: F5, reason: collision with root package name */
    public static SharedPreferences f35625F5;

    /* JADX INFO: renamed from: G5, reason: collision with root package name */
    public static boolean f35626G5;

    /* JADX INFO: renamed from: H5, reason: collision with root package name */
    public static String f35627H5;

    /* JADX INFO: renamed from: I5, reason: collision with root package name */
    public static String f35628I5;

    /* JADX INFO: renamed from: J5, reason: collision with root package name */
    public static final int[] f35629J5 = {0, 1, 2, 3, 4, 5};

    /* JADX INFO: renamed from: K5, reason: collision with root package name */
    public static ProgressBar f35630K5;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public LinearLayout f35631A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public ArrayList f35632A0;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public LinearLayout f35633A1;

    /* JADX INFO: renamed from: A2, reason: collision with root package name */
    public Boolean f35634A2;

    /* JADX INFO: renamed from: A3, reason: collision with root package name */
    public LinearLayout f35635A3;

    /* JADX INFO: renamed from: A4, reason: collision with root package name */
    public CheckBox f35636A4;

    /* JADX INFO: renamed from: A5, reason: collision with root package name */
    public boolean f35637A5;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public TextView f35638B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public ArrayList f35639B0;

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public LinearLayout f35640B1;

    /* JADX INFO: renamed from: B2, reason: collision with root package name */
    public AsyncTask f35641B2;

    /* JADX INFO: renamed from: B3, reason: collision with root package name */
    public LinearLayout f35642B3;

    /* JADX INFO: renamed from: B4, reason: collision with root package name */
    public CheckBox f35643B4;

    /* JADX INFO: renamed from: B5, reason: collision with root package name */
    public int f35644B5;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ImageView f35645C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public ArrayList f35646C0;

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public LinearLayout f35647C1;

    /* JADX INFO: renamed from: C2, reason: collision with root package name */
    public AsyncTask f35648C2;

    /* JADX INFO: renamed from: C3, reason: collision with root package name */
    public LinearLayout f35649C3;

    /* JADX INFO: renamed from: C4, reason: collision with root package name */
    public CheckBox f35650C4;

    /* JADX INFO: renamed from: C5, reason: collision with root package name */
    public ArrayList f35651C5;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public TextView f35652D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public ArrayList f35653D0;

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    public LinearLayout f35654D1;

    /* JADX INFO: renamed from: D2, reason: collision with root package name */
    public AsyncTask f35655D2;

    /* JADX INFO: renamed from: D3, reason: collision with root package name */
    public LinearLayout f35656D3;

    /* JADX INFO: renamed from: D4, reason: collision with root package name */
    public CheckBox f35657D4;

    /* JADX INFO: renamed from: D5, reason: collision with root package name */
    public boolean f35658D5;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public TextView f35659E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public ArrayList f35660E0;

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public LinearLayout f35661E1;

    /* JADX INFO: renamed from: E2, reason: collision with root package name */
    public ProgressDialog f35662E2;

    /* JADX INFO: renamed from: E3, reason: collision with root package name */
    public LinearLayout f35663E3;

    /* JADX INFO: renamed from: E4, reason: collision with root package name */
    public CheckBox f35664E4;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public TextView f35665F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public ArrayList f35666F0;

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public String f35667F1;

    /* JADX INFO: renamed from: F2, reason: collision with root package name */
    public boolean f35668F2;

    /* JADX INFO: renamed from: F3, reason: collision with root package name */
    public LinearLayout f35669F3;

    /* JADX INFO: renamed from: F4, reason: collision with root package name */
    public CheckBox f35670F4;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public TextView f35671G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public ArrayList f35672G0;

    /* JADX INFO: renamed from: G2, reason: collision with root package name */
    public int f35674G2;

    /* JADX INFO: renamed from: G3, reason: collision with root package name */
    public LinearLayout f35675G3;

    /* JADX INFO: renamed from: G4, reason: collision with root package name */
    public CheckBox f35676G4;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public LinearLayout f35677H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public ArrayList f35678H0;

    /* JADX INFO: renamed from: H2, reason: collision with root package name */
    public boolean f35680H2;

    /* JADX INFO: renamed from: H3, reason: collision with root package name */
    public RelativeLayout f35681H3;

    /* JADX INFO: renamed from: H4, reason: collision with root package name */
    public CheckBox f35682H4;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ProgressBar f35683I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public ArrayList f35684I0;

    /* JADX INFO: renamed from: I2, reason: collision with root package name */
    public int f35686I2;

    /* JADX INFO: renamed from: I3, reason: collision with root package name */
    public RelativeLayout f35687I3;

    /* JADX INFO: renamed from: I4, reason: collision with root package name */
    public RelativeLayout f35688I4;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public LinearLayout f35689J;

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    public DatabaseHandler f35691J1;

    /* JADX INFO: renamed from: J2, reason: collision with root package name */
    public int f35692J2;

    /* JADX INFO: renamed from: J3, reason: collision with root package name */
    public RelativeLayout f35693J3;

    /* JADX INFO: renamed from: J4, reason: collision with root package name */
    public CheckBox f35694J4;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public LinearLayout f35695K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public ArrayList f35696K0;

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    public SharedPreferences.Editor f35697K1;

    /* JADX INFO: renamed from: K2, reason: collision with root package name */
    public SharedPreferences f35698K2;

    /* JADX INFO: renamed from: K3, reason: collision with root package name */
    public RelativeLayout f35699K3;

    /* JADX INFO: renamed from: K4, reason: collision with root package name */
    public CheckBox f35700K4;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public ArrayList f35702L0;

    /* JADX INFO: renamed from: L1, reason: collision with root package name */
    public SharedPreferences.Editor f35703L1;

    /* JADX INFO: renamed from: L2, reason: collision with root package name */
    public Boolean f35704L2;

    /* JADX INFO: renamed from: L3, reason: collision with root package name */
    public RecyclerView f35705L3;

    /* JADX INFO: renamed from: L4, reason: collision with root package name */
    public CheckBox f35706L4;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public SharedPreferences f35708M0;

    /* JADX INFO: renamed from: M1, reason: collision with root package name */
    public TextView f35709M1;

    /* JADX INFO: renamed from: M2, reason: collision with root package name */
    public Boolean f35710M2;

    /* JADX INFO: renamed from: M3, reason: collision with root package name */
    public RecyclerView f35711M3;

    /* JADX INFO: renamed from: M4, reason: collision with root package name */
    public CheckBox f35712M4;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public SharedPreferences.Editor f35714N0;

    /* JADX INFO: renamed from: N1, reason: collision with root package name */
    public String f35715N1;

    /* JADX INFO: renamed from: N2, reason: collision with root package name */
    public Boolean f35716N2;

    /* JADX INFO: renamed from: N3, reason: collision with root package name */
    public EditText f35717N3;

    /* JADX INFO: renamed from: N4, reason: collision with root package name */
    public TextView f35718N4;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public ArrayList f35720O0;

    /* JADX INFO: renamed from: O1, reason: collision with root package name */
    public TextView f35721O1;

    /* JADX INFO: renamed from: O2, reason: collision with root package name */
    public Boolean f35722O2;

    /* JADX INFO: renamed from: O3, reason: collision with root package name */
    public ImageView f35723O3;

    /* JADX INFO: renamed from: O4, reason: collision with root package name */
    public TextView f35724O4;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f35725P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public ArrayList f35726P0;

    /* JADX INFO: renamed from: P1, reason: collision with root package name */
    public Handler f35727P1;

    /* JADX INFO: renamed from: P2, reason: collision with root package name */
    public Boolean f35728P2;

    /* JADX INFO: renamed from: P3, reason: collision with root package name */
    public ImageView f35729P3;

    /* JADX INFO: renamed from: P4, reason: collision with root package name */
    public TextView f35730P4;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public String f35731Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public ArrayList f35732Q0;

    /* JADX INFO: renamed from: Q1, reason: collision with root package name */
    public Handler f35733Q1;

    /* JADX INFO: renamed from: Q2, reason: collision with root package name */
    public Boolean f35734Q2;

    /* JADX INFO: renamed from: Q3, reason: collision with root package name */
    public ImageView f35735Q3;

    /* JADX INFO: renamed from: Q4, reason: collision with root package name */
    public TextView f35736Q4;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public String f35737R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public RecyclerView f35738R0;

    /* JADX INFO: renamed from: R1, reason: collision with root package name */
    public Handler f35739R1;

    /* JADX INFO: renamed from: R2, reason: collision with root package name */
    public C2858a f35740R2;

    /* JADX INFO: renamed from: R3, reason: collision with root package name */
    public ImageView f35741R3;

    /* JADX INFO: renamed from: R4, reason: collision with root package name */
    public TextView f35742R4;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public String f35743S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public ProgressBar f35744S0;

    /* JADX INFO: renamed from: S1, reason: collision with root package name */
    public Handler f35745S1;

    /* JADX INFO: renamed from: S2, reason: collision with root package name */
    public Handler f35746S2;

    /* JADX INFO: renamed from: S3, reason: collision with root package name */
    public ImageView f35747S3;

    /* JADX INFO: renamed from: S4, reason: collision with root package name */
    public TextView f35748S4;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public String f35749T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public Toolbar f35750T0;

    /* JADX INFO: renamed from: T1, reason: collision with root package name */
    public Handler f35751T1;

    /* JADX INFO: renamed from: T2, reason: collision with root package name */
    public Handler f35752T2;

    /* JADX INFO: renamed from: T3, reason: collision with root package name */
    public ImageView f35753T3;

    /* JADX INFO: renamed from: T4, reason: collision with root package name */
    public TextView f35754T4;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public RelativeLayout f35755U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public SearchView f35756U0;

    /* JADX INFO: renamed from: U1, reason: collision with root package name */
    public Handler f35757U1;

    /* JADX INFO: renamed from: U2, reason: collision with root package name */
    public ArrayList f35758U2;

    /* JADX INFO: renamed from: U3, reason: collision with root package name */
    public ImageView f35759U3;

    /* JADX INFO: renamed from: U4, reason: collision with root package name */
    public TextView f35760U4;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ListView f35761V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public TextView f35762V0;

    /* JADX INFO: renamed from: V1, reason: collision with root package name */
    public SharedPreferences.Editor f35763V1;

    /* JADX INFO: renamed from: V2, reason: collision with root package name */
    public int f35764V2;

    /* JADX INFO: renamed from: V3, reason: collision with root package name */
    public Animation f35765V3;

    /* JADX INFO: renamed from: V4, reason: collision with root package name */
    public EditText f35766V4;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public ListView f35767W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public LinearLayout f35768W0;

    /* JADX INFO: renamed from: W1, reason: collision with root package name */
    public SharedPreferences.Editor f35769W1;

    /* JADX INFO: renamed from: W2, reason: collision with root package name */
    public String f35770W2;

    /* JADX INFO: renamed from: W3, reason: collision with root package name */
    public Animation f35771W3;

    /* JADX INFO: renamed from: W4, reason: collision with root package name */
    public LinearLayout f35772W4;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public LinearLayout f35774X0;

    /* JADX INFO: renamed from: X1, reason: collision with root package name */
    public SharedPreferences.Editor f35775X1;

    /* JADX INFO: renamed from: X2, reason: collision with root package name */
    public String f35776X2;

    /* JADX INFO: renamed from: X3, reason: collision with root package name */
    public Animation f35777X3;

    /* JADX INFO: renamed from: X4, reason: collision with root package name */
    public LinearLayout f35778X4;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public AppBarLayout f35780Y0;

    /* JADX INFO: renamed from: Y1, reason: collision with root package name */
    public TextView f35781Y1;

    /* JADX INFO: renamed from: Y2, reason: collision with root package name */
    public Boolean f35782Y2;

    /* JADX INFO: renamed from: Y3, reason: collision with root package name */
    public Animation f35783Y3;

    /* JADX INFO: renamed from: Y4, reason: collision with root package name */
    public LinearLayout f35784Y4;

    /* JADX INFO: renamed from: Z2, reason: collision with root package name */
    public RadioGroup f35788Z2;

    /* JADX INFO: renamed from: Z3, reason: collision with root package name */
    public Animation f35789Z3;

    /* JADX INFO: renamed from: Z4, reason: collision with root package name */
    public LinearLayout f35790Z4;

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public RadioGroup f35793a3;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public Animation f35794a4;

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    public ImageView f35795a5;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public LinearLayout f35797b2;

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    public RadioGroup f35798b3;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public Animation f35799b4;

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    public RelativeLayout f35800b5;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public String f35801c1;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public TextView f35802c2;

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    public TextView f35803c3;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    public Animation f35804c4;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public LinearLayout f35805c5;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f35806d;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public TextView f35809d3;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    public Animation f35810d4;

    /* JADX INFO: renamed from: d5, reason: collision with root package name */
    public LinearLayout f35811d5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f35812e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public String f35813e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public RelativeLayout f35814e1;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public Boolean f35815e2;

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    public TextView f35816e3;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    public String f35817e4;

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    public LinearLayout f35818e5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f35819f;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public LinearLayout f35821f1;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public Boolean f35822f2;

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    public TextView f35823f3;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    public q7.N f35824f4;

    /* JADX INFO: renamed from: f5, reason: collision with root package name */
    public LinearLayout f35825f5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n7.g f35826g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public LiveStreamDBHandler f35827g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public RelativeLayout f35828g1;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public Menu f35829g2;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public TextView f35830g3;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public q7.N f35831g4;

    /* JADX INFO: renamed from: g5, reason: collision with root package name */
    public LinearLayout f35832g5;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public SharedPreferences f35834h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public RelativeLayout f35835h1;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public MenuItem f35836h2;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public TextView f35837h3;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public q7.O f35838h4;

    /* JADX INFO: renamed from: h5, reason: collision with root package name */
    public RelativeLayout f35839h5;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public SharedPreferences f35841i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public RelativeLayout f35842i1;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public DateFormat f35843i2;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public TextView f35844i3;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public P f35845i4;

    /* JADX INFO: renamed from: i5, reason: collision with root package name */
    public String f35846i5;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public SharedPreferences f35848j0;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public String f35850j2;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public TextView f35851j3;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public LinearLayoutManager f35852j4;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public String f35853j5;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public SharedPreferences f35855k0;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public String f35857k2;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public FrameLayout f35858k3;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public LinearLayoutManager f35859k4;

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    public String f35860k5;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f35861l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public SharedPreferences f35862l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public TextView f35863l1;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public String f35864l2;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public SeekBar f35865l3;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    public int f35866l4;

    /* JADX INFO: renamed from: l5, reason: collision with root package name */
    public String f35867l5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f35868m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public SharedPreferences f35869m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public TextView f35870m1;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public SimpleDateFormat f35871m2;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public SeekBar f35872m3;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    public Animation f35873m4;

    /* JADX INFO: renamed from: m5, reason: collision with root package name */
    public String f35874m5;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public SharedPreferences f35876n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public TextView f35877n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public NSTIJKPlayerSkyTv f35878n2;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public LinearLayout f35879n3;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    public Animation f35880n4;

    /* JADX INFO: renamed from: n5, reason: collision with root package name */
    public String f35881n5;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public SharedPreferences f35883o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public TextView f35884o1;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public Date f35885o2;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public LinearLayout f35886o3;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    public String f35887o4;

    /* JADX INFO: renamed from: o5, reason: collision with root package name */
    public String f35888o5;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public SharedPreferences f35890p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public String f35891p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public String f35892p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public LinearLayout f35893p3;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    public String f35894p4;

    /* JADX INFO: renamed from: p5, reason: collision with root package name */
    public String f35895p5;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public SimpleDateFormat f35897q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public TextView f35898q1;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public Boolean f35899q2;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public LinearLayout f35900q3;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    public String f35901q4;

    /* JADX INFO: renamed from: q5, reason: collision with root package name */
    public String f35902q5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f35903r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public String f35904r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public TextView f35905r1;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public a f35906r2;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public LinearLayout f35907r3;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    public String f35908r4;

    /* JADX INFO: renamed from: r5, reason: collision with root package name */
    public List f35909r5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f35910s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public RelativeLayout f35911s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public TextView f35912s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public String f35913s2;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public LinearLayout f35914s3;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    public String f35915s4;

    /* JADX INFO: renamed from: s5, reason: collision with root package name */
    public JsonArray f35916s5;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f35917t;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public TextView f35919t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public Boolean f35920t2;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public LinearLayout f35921t3;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    public int f35922t4;

    /* JADX INFO: renamed from: t5, reason: collision with root package name */
    public String f35923t5;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public LinearLayout f35924u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public TextView f35925u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public TextView f35926u1;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public D7.b f35927u2;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public LinearLayout f35928u3;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    public RelativeLayout f35929u4;

    /* JADX INFO: renamed from: u5, reason: collision with root package name */
    public Thread f35930u5;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f35931v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public ArrayList f35932v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public TextView f35933v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public String f35934v2;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public LinearLayout f35935v3;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    public RelativeLayout f35936v4;

    /* JADX INFO: renamed from: v5, reason: collision with root package name */
    public boolean f35937v5;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f35938w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ArrayList f35939w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public TextView f35940w1;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public int f35941w2;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public LinearLayout f35942w3;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    public RelativeLayout f35943w4;

    /* JADX INFO: renamed from: w5, reason: collision with root package name */
    public boolean f35944w5;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View f35945x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ArrayList f35946x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public TextView f35947x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public int f35948x2;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public LinearLayout f35949x3;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public TextView f35950x4;

    /* JADX INFO: renamed from: x5, reason: collision with root package name */
    public MultiUserDBHandler f35951x5;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public View f35952y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ArrayList f35953y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public LinearLayout f35954y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public String f35955y2;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public LinearLayout f35956y3;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    public TextView f35957y4;

    /* JADX INFO: renamed from: y5, reason: collision with root package name */
    public Thread f35958y5;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public ArrayList f35960z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public String f35961z1;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public String f35962z2;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public LinearLayout f35963z3;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    public CheckBox f35964z4;

    /* JADX INFO: renamed from: z5, reason: collision with root package name */
    public Boolean f35965z5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f35833h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f35840i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35847j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35854k = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f35875n = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f35882o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35889p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35896q = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f35959z = false;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f35701L = true;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f35707M = false;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f35713N = false;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f35719O = false;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ArrayList f35773X = new ArrayList();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f35779Y = true;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public long f35785Z = 2500;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f35820f0 = true;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f35918t0 = 0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public ArrayList f35690J0 = new ArrayList();

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public boolean f35786Z0 = true;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public boolean f35791a1 = false;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public boolean f35796b1 = false;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f35807d1 = true;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public String f35849j1 = "";

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public String f35856k1 = "";

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    public int f35673G1 = -1;

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    public String f35679H1 = "";

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    public String f35685I1 = "";

    /* JADX INFO: renamed from: Z1, reason: collision with root package name */
    public int f35787Z1 = 0;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public StringBuilder f35792a2 = new StringBuilder();

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public int f35808d2 = -1;

    public class A implements View.OnClickListener {
        public A() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                NSTIJKPlayerSkyTvActivity.this.f35899q2 = Boolean.TRUE;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", NSTIJKPlayerSkyTvActivity.this.getPackageName(), null));
                NSTIJKPlayerSkyTvActivity.this.startActivityForResult(intent, 101);
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                Toast.makeText(nSTIJKPlayerSkyTvActivity, nSTIJKPlayerSkyTvActivity.f35806d.getResources().getString(a7.j.f13339o2), 1).show();
            } catch (Exception unused) {
            }
            NSTIJKPlayerSkyTvActivity.this.f35906r2.dismiss();
        }
    }

    public class B implements View.OnClickListener {
        public B() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerSkyTvActivity.this.f35906r2.dismiss();
        }
    }

    public class C implements Runnable {
        public C() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = m7.w.R(NSTIJKPlayerSkyTvActivity.this.f35806d);
                String strA = m7.w.A(string);
                TextView textView = NSTIJKPlayerSkyTvActivity.this.f35721O1;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = NSTIJKPlayerSkyTvActivity.this.f35709M1;
                if (textView2 != null) {
                    textView2.setText(strA);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class D implements AdapterView.OnItemClickListener {
        public D() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i9, long j9) throws JSONException {
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
            NSTIJKPlayerSkyTvActivity.this.f35854k = i9;
            if (!SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyTvActivity.this.f35806d).equals("stalker_api")) {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                nSTIJKPlayerSkyTvActivity.e4(nSTIJKPlayerSkyTvActivity.f35854k, NSTIJKPlayerSkyTvActivity.this.f35819f);
                return;
            }
            try {
                String stalkerToken = SharepreferenceDBHandler.getStalkerToken(NSTIJKPlayerSkyTvActivity.this.f35806d);
                String loggedInMacAddress = SharepreferenceDBHandler.getLoggedInMacAddress(NSTIJKPlayerSkyTvActivity.this.f35806d);
                ArrayList arrayListG = NSTIJKPlayerSkyTvActivity.this.f35845i4.g();
                if (arrayListG != null && arrayListG.size() > 0) {
                    cmd = ((LiveStreamsDBModel) arrayListG.get(NSTIJKPlayerSkyTvActivity.this.f35854k)).getCmd();
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = NSTIJKPlayerSkyTvActivity.this;
                    if (nSTIJKPlayerSkyTvActivity2.f35673G1 != m7.w.q0(((LiveStreamsDBModel) arrayListG.get(nSTIJKPlayerSkyTvActivity2.f35854k)).getStreamId())) {
                        m7.w.N0(NSTIJKPlayerSkyTvActivity.this.f35806d);
                        gVar = NSTIJKPlayerSkyTvActivity.this.f35826g;
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
                        return;
                    }
                    NSTIJKPlayerSkyTvActivity.this.A3();
                }
                if (NSTIJKPlayerSkyTvActivity.this.f35660E0 == null || NSTIJKPlayerSkyTvActivity.this.f35660E0.size() <= 0) {
                    return;
                }
                cmd = ((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(NSTIJKPlayerSkyTvActivity.this.f35854k)).getCmd();
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity3 = NSTIJKPlayerSkyTvActivity.this;
                if (nSTIJKPlayerSkyTvActivity3.f35673G1 != m7.w.q0(((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity3.f35660E0.get(NSTIJKPlayerSkyTvActivity.this.f35854k)).getStreamId())) {
                    m7.w.N0(NSTIJKPlayerSkyTvActivity.this.f35806d);
                    gVar = NSTIJKPlayerSkyTvActivity.this.f35826g;
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
                    return;
                }
                NSTIJKPlayerSkyTvActivity.this.A3();
            } catch (Exception unused) {
            }
        }
    }

    public class E implements Runnable {
        public E() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    NSTIJKPlayerSkyTvActivity.this.w3();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class F extends AsyncTask {
        public F() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(NSTIJKPlayerSkyTvActivity.this.S3());
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            NSTIJKPlayerSkyTvActivity.this.p4("", true);
            NSTIJKPlayerSkyTvActivity.this.f35965z5 = Boolean.TRUE;
            if (NSTIJKPlayerSkyTvActivity.this.f35878n2 != null) {
                NSTIJKPlayerSkyTvActivity.this.f35878n2.setEPGHandler(NSTIJKPlayerSkyTvActivity.this.f35745S1);
                NSTIJKPlayerSkyTvActivity.this.f35878n2.setContext(NSTIJKPlayerSkyTvActivity.this.f35806d);
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (NSTIJKPlayerSkyTvActivity.this.f35662E2 == null) {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                nSTIJKPlayerSkyTvActivity.f35662E2 = NSTIJKPlayerSkyTvActivity.u3(nSTIJKPlayerSkyTvActivity.f35806d);
                if (NSTIJKPlayerSkyTvActivity.this.f35662E2 == null) {
                    return;
                }
            } else if (NSTIJKPlayerSkyTvActivity.this.f35662E2.isShowing()) {
                return;
            }
            NSTIJKPlayerSkyTvActivity.this.f35662E2.show();
        }
    }

    public class G implements Runnable {
        public G() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    if (SharepreferenceDBHandler.getMaintanceModeState(NSTIJKPlayerSkyTvActivity.this.f35806d)) {
                        NSTIJKPlayerSkyTvActivity.this.f35806d.startActivity(new Intent(NSTIJKPlayerSkyTvActivity.this.f35806d, (Class<?>) MaintanencePannelActivity.class));
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

    public class H extends AsyncTask {
        public H() {
        }

        public String a() {
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity;
            LiveStreamDBHandler liveStreamDBHandler;
            String str;
            SharedPreferences sharedPreferences;
            String str2;
            try {
                NSTIJKPlayerSkyTvActivity.this.f35674G2 = 0;
                if (NSTIJKPlayerSkyTvActivity.this.f35646C0 != null && NSTIJKPlayerSkyTvActivity.this.f35632A0 != null) {
                    NSTIJKPlayerSkyTvActivity.this.f35646C0.clear();
                    NSTIJKPlayerSkyTvActivity.this.f35632A0.clear();
                }
                if (NSTIJKPlayerSkyTvActivity.this.f35901q4.equals("true")) {
                    nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                    liveStreamDBHandler = nSTIJKPlayerSkyTvActivity.f35827g0;
                    str = "radio_streams";
                } else {
                    nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                    liveStreamDBHandler = nSTIJKPlayerSkyTvActivity.f35827g0;
                    str = "live";
                }
                nSTIJKPlayerSkyTvActivity.f35646C0 = liveStreamDBHandler.getAllLiveStreasWithCategoryId("0", str);
                if (NSTIJKPlayerSkyTvActivity.this.f35653D0 != null) {
                    NSTIJKPlayerSkyTvActivity.this.f35653D0.clear();
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone(NSTIJKPlayerSkyTvActivity.this.f35740R2.C()));
                String str3 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + m7.w.S(NSTIJKPlayerSkyTvActivity.this.f35806d)));
                boolean zB = NSTIJKPlayerSkyTvActivity.this.f35740R2.B();
                ArrayList<XMLTVProgrammePojo> ePGTesting = zB ? NSTIJKPlayerSkyTvActivity.this.f35827g0.getEPGTesting(null, str3) : null;
                if (SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyTvActivity.this.f35806d).equals("m3u")) {
                    sharedPreferences = NSTIJKPlayerSkyTvActivity.this.f35862l0;
                    str2 = "LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U";
                } else if (SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyTvActivity.this.f35806d).equals("onestream_api")) {
                    sharedPreferences = NSTIJKPlayerSkyTvActivity.this.f35862l0;
                    str2 = "LOGIN_PREF_CURRENTLY_PLAYING_VIDEO";
                } else {
                    sharedPreferences = NSTIJKPlayerSkyTvActivity.this.f35862l0;
                    str2 = "currentlyPlayingVideo";
                }
                String string = sharedPreferences.getString(str2, "");
                if (NSTIJKPlayerSkyTvActivity.this.f35646C0 == null || NSTIJKPlayerSkyTvActivity.this.f35646C0.size() <= 0) {
                    return "all_channels";
                }
                for (int i9 = 0; i9 < NSTIJKPlayerSkyTvActivity.this.f35646C0.size(); i9++) {
                    if (NSTIJKPlayerSkyTvActivity.this.f35641B2 != null && NSTIJKPlayerSkyTvActivity.this.f35641B2.isCancelled()) {
                        return "all_channels";
                    }
                    if (SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyTvActivity.this.f35806d).equals("m3u")) {
                        if (((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35646C0.get(i9)).getUrl().equals(string)) {
                            NSTIJKPlayerSkyTvActivity.this.f35674G2 = i9;
                        }
                    } else if (SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyTvActivity.this.f35806d).equals("onestream_api")) {
                        if (((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35646C0.get(i9)).getStreamIdOneStream().equals(string)) {
                            NSTIJKPlayerSkyTvActivity.this.f35674G2 = i9;
                        }
                    } else if (((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35646C0.get(i9)).getStreamId().equals(string)) {
                        NSTIJKPlayerSkyTvActivity.this.f35674G2 = i9;
                    }
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    liveStreamsDBModel.setNum(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35646C0.get(i9)).getNum());
                    liveStreamsDBModel.setName(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35646C0.get(i9)).getName());
                    liveStreamsDBModel.setStreamType(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35646C0.get(i9)).getStreamType());
                    liveStreamsDBModel.setStreamId(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35646C0.get(i9)).getStreamId());
                    liveStreamsDBModel.setStreamIdOneStream(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35646C0.get(i9)).getStreamIdOneStream());
                    liveStreamsDBModel.setStreamIcon(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35646C0.get(i9)).getStreamIcon());
                    liveStreamsDBModel.setEpgChannelId(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35646C0.get(i9)).getEpgChannelId());
                    liveStreamsDBModel.setAdded(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35646C0.get(i9)).getAdded());
                    liveStreamsDBModel.setCategoryId(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35646C0.get(i9)).getCategoryId());
                    liveStreamsDBModel.setCustomSid(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35646C0.get(i9)).getCustomSid());
                    liveStreamsDBModel.setTvArchive(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35646C0.get(i9)).getTvArchive());
                    liveStreamsDBModel.setDirectSource(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35646C0.get(i9)).getDirectSource());
                    liveStreamsDBModel.setTvArchiveDuration(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35646C0.get(i9)).getTvArchiveDuration());
                    liveStreamsDBModel.setTypeName(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35646C0.get(i9)).getTypeName());
                    liveStreamsDBModel.setCategoryName(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35646C0.get(i9)).getCategoryName());
                    liveStreamsDBModel.setSeriesNo(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35646C0.get(i9)).getSeriesNo());
                    liveStreamsDBModel.setLive(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35646C0.get(i9)).getLive());
                    liveStreamsDBModel.setContaiinerExtension(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35646C0.get(i9)).getContaiinerExtension());
                    liveStreamsDBModel.setUrl(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35646C0.get(i9)).getUrl());
                    if (zB && ePGTesting != null && ePGTesting.size() > 0) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= ePGTesting.size() || (NSTIJKPlayerSkyTvActivity.this.f35641B2 != null && NSTIJKPlayerSkyTvActivity.this.f35641B2.isCancelled())) {
                                break;
                            }
                            if (((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35646C0.get(i9)).getEpgChannelId().equals(ePGTesting.get(i10).getChannel())) {
                                int iM = m7.w.M(m7.w.x(ePGTesting.get(i10).getStart(), NSTIJKPlayerSkyTvActivity.this.f35806d), m7.w.x(ePGTesting.get(i10).getStop(), NSTIJKPlayerSkyTvActivity.this.f35806d), NSTIJKPlayerSkyTvActivity.this.f35806d);
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
                    NSTIJKPlayerSkyTvActivity.this.f35653D0.add(liveStreamsDBModel);
                }
                return "all_channels";
            } catch (Exception unused) {
                return "all_channels";
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
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
                r6 = r6[r0]     // Catch: java.lang.Exception -> L5a
                int r1 = r6.hashCode()     // Catch: java.lang.Exception -> L5a
                r2 = 2
                r3 = 1
                r4 = 3
                switch(r1) {
                    case -74797390: goto L2b;
                    case 47612238: goto L21;
                    case 301138327: goto L17;
                    case 613425326: goto Le;
                    default: goto Ld;
                }     // Catch: java.lang.Exception -> L5a
            Ld:
                goto L35
            Le:
                java.lang.String r1 = "all_channels"
                boolean r6 = r6.equals(r1)     // Catch: java.lang.Exception -> L5a
                if (r6 == 0) goto L35
                goto L36
            L17:
                java.lang.String r0 = "recently_watched"
                boolean r6 = r6.equals(r0)     // Catch: java.lang.Exception -> L5a
                if (r6 == 0) goto L35
                r0 = 3
                goto L36
            L21:
                java.lang.String r0 = "all_channels_with_cat"
                boolean r6 = r6.equals(r0)     // Catch: java.lang.Exception -> L5a
                if (r6 == 0) goto L35
                r0 = 1
                goto L36
            L2b:
                java.lang.String r0 = "get_fav"
                boolean r6 = r6.equals(r0)     // Catch: java.lang.Exception -> L5a
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
                com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r6 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> L5a
                java.lang.String r6 = r6.k3()     // Catch: java.lang.Exception -> L5a
                return r6
            L47:
                com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r6 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> L5a
                java.lang.String r6 = r6.D3()     // Catch: java.lang.Exception -> L5a
                return r6
            L4e:
                com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r6 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> L5a
                java.lang.String r6 = r6.g3()     // Catch: java.lang.Exception -> L5a
                return r6
            L55:
                java.lang.String r6 = r5.a()     // Catch: java.lang.Exception -> L5a
                return r6
            L5a:
                java.lang.String r6 = "error"
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.H.doInBackground(java.lang.String[]):java.lang.String");
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (NSTIJKPlayerSkyTvActivity.this.f35653D0 != null) {
                    if (!NSTIJKPlayerSkyTvActivity.this.f35822f2.booleanValue()) {
                        NSTIJKPlayerSkyTvActivity.this.f35822f2 = Boolean.TRUE;
                        if (NSTIJKPlayerSkyTvActivity.this.f35653D0.size() == 0) {
                            AbstractC2237a.f44480Y = Boolean.FALSE;
                            NSTIJKPlayerSkyTvActivity.this.Z3();
                            NSTIJKPlayerSkyTvActivity.this.f35878n2.setVisibility(8);
                        } else if (NSTIJKPlayerSkyTvActivity.this.f35666F0 != null) {
                            NSTIJKPlayerSkyTvActivity.this.f35666F0.clear();
                            NSTIJKPlayerSkyTvActivity.this.f35666F0.addAll(NSTIJKPlayerSkyTvActivity.this.f35653D0);
                        }
                    }
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                    if (nSTIJKPlayerSkyTvActivity.f35791a1 && nSTIJKPlayerSkyTvActivity.f35796b1 && !nSTIJKPlayerSkyTvActivity.f35801c1.equals("")) {
                        NSTIJKPlayerSkyTvActivity.this.f35674G2 = 0;
                        try {
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity2.f35674G2 = nSTIJKPlayerSkyTvActivity2.G3(nSTIJKPlayerSkyTvActivity2.f35653D0, m7.w.r0(NSTIJKPlayerSkyTvActivity.this.f35801c1));
                        } catch (NumberFormatException | Exception e9) {
                            e9.printStackTrace();
                        }
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity3 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity3.f35791a1 = false;
                        nSTIJKPlayerSkyTvActivity3.f35796b1 = false;
                    }
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity4 = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity4.n4(nSTIJKPlayerSkyTvActivity4.f35653D0);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            try {
                TextView textView = NSTIJKPlayerSkyTvActivity.this.f35762V0;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                TextView textView2 = nSTIJKPlayerSkyTvActivity.f35925u0;
                if (textView2 != null) {
                    textView2.setText(nSTIJKPlayerSkyTvActivity.f35856k1);
                    NSTIJKPlayerSkyTvActivity.this.f35925u0.setSelected(true);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class I extends AsyncTask {
        public I() {
        }

        public String a() {
            LiveStreamDBHandler liveStreamDBHandler;
            String str;
            String str2;
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity;
            int i9;
            try {
                NSTIJKPlayerSkyTvActivity.this.f35866l4 = 0;
                if (NSTIJKPlayerSkyTvActivity.this.f35660E0 != null) {
                    NSTIJKPlayerSkyTvActivity.this.f35660E0.clear();
                }
                if (NSTIJKPlayerSkyTvActivity.this.f35901q4.equals("true")) {
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = NSTIJKPlayerSkyTvActivity.this;
                    liveStreamDBHandler = nSTIJKPlayerSkyTvActivity2.f35827g0;
                    str = nSTIJKPlayerSkyTvActivity2.f35776X2;
                    str2 = "radio_streams";
                } else {
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity3 = NSTIJKPlayerSkyTvActivity.this;
                    liveStreamDBHandler = nSTIJKPlayerSkyTvActivity3.f35827g0;
                    str = nSTIJKPlayerSkyTvActivity3.f35776X2;
                    str2 = "live";
                }
                NSTIJKPlayerSkyTvActivity.this.f35660E0 = liveStreamDBHandler.getAllLiveStreasWithCategoryId(str, str2);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone(NSTIJKPlayerSkyTvActivity.this.f35740R2.C()));
                String str3 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + m7.w.S(NSTIJKPlayerSkyTvActivity.this.f35806d)));
                boolean zB = NSTIJKPlayerSkyTvActivity.this.f35740R2.B();
                ArrayList<XMLTVProgrammePojo> ePGTesting = zB ? NSTIJKPlayerSkyTvActivity.this.f35827g0.getEPGTesting(null, str3) : null;
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity4 = NSTIJKPlayerSkyTvActivity.this;
                nSTIJKPlayerSkyTvActivity4.f35869m0 = nSTIJKPlayerSkyTvActivity4.getSharedPreferences("currentlyPlayingVideo", 0);
                String string = SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyTvActivity.this.f35806d).equals("m3u") ? NSTIJKPlayerSkyTvActivity.this.f35862l0.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", "") : (SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyTvActivity.this.f35806d).equals("onestream_api") ? NSTIJKPlayerSkyTvActivity.this.f35862l0 : NSTIJKPlayerSkyTvActivity.this.f35862l0).getString("currentlyPlayingVideo", "");
                ArrayList arrayList = new ArrayList();
                if (NSTIJKPlayerSkyTvActivity.this.f35660E0 != null && NSTIJKPlayerSkyTvActivity.this.f35660E0.size() > 0) {
                    for (int i10 = 0; i10 < NSTIJKPlayerSkyTvActivity.this.f35660E0.size() && (NSTIJKPlayerSkyTvActivity.this.f35641B2 == null || !NSTIJKPlayerSkyTvActivity.this.f35641B2.isCancelled()); i10++) {
                        if (SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyTvActivity.this.f35806d).equals("m3u")) {
                            if (((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i10)).getUrl().equals(string)) {
                                NSTIJKPlayerSkyTvActivity.this.f35866l4 = i10;
                                nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                                i9 = nSTIJKPlayerSkyTvActivity.f35866l4;
                                nSTIJKPlayerSkyTvActivity.f35787Z1 = i9;
                            }
                        } else if (SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyTvActivity.this.f35806d).equals("onestream_api")) {
                            if (((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i10)).getStreamIdOneStream().equals(string)) {
                                NSTIJKPlayerSkyTvActivity.this.f35866l4 = i10;
                                nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                                i9 = nSTIJKPlayerSkyTvActivity.f35866l4;
                                nSTIJKPlayerSkyTvActivity.f35787Z1 = i9;
                            }
                        } else if (((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i10)).getStreamId().equals(string)) {
                            NSTIJKPlayerSkyTvActivity.this.f35866l4 = i10;
                            nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                            i9 = nSTIJKPlayerSkyTvActivity.f35866l4;
                            nSTIJKPlayerSkyTvActivity.f35787Z1 = i9;
                        }
                        LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                        liveStreamsDBModel.setNum(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i10)).getNum());
                        liveStreamsDBModel.setName(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i10)).getName());
                        liveStreamsDBModel.setStreamType(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i10)).getStreamType());
                        liveStreamsDBModel.setStreamId(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i10)).getStreamId());
                        liveStreamsDBModel.setStreamIdOneStream(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i10)).getStreamIdOneStream());
                        liveStreamsDBModel.setStreamIcon(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i10)).getStreamIcon());
                        liveStreamsDBModel.setEpgChannelId(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i10)).getEpgChannelId());
                        liveStreamsDBModel.setAdded(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i10)).getAdded());
                        liveStreamsDBModel.setCategoryId(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i10)).getCategoryId());
                        liveStreamsDBModel.setCustomSid(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i10)).getCustomSid());
                        liveStreamsDBModel.setTvArchive(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i10)).getTvArchive());
                        liveStreamsDBModel.setDirectSource(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i10)).getDirectSource());
                        liveStreamsDBModel.setTvArchiveDuration(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i10)).getTvArchiveDuration());
                        liveStreamsDBModel.setTypeName(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i10)).getTypeName());
                        liveStreamsDBModel.setCategoryName(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i10)).getCategoryName());
                        liveStreamsDBModel.setSeriesNo(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i10)).getSeriesNo());
                        liveStreamsDBModel.setLive(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i10)).getLive());
                        liveStreamsDBModel.setContaiinerExtension(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i10)).getContaiinerExtension());
                        liveStreamsDBModel.setUrl(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i10)).getUrl());
                        if (zB && ePGTesting != null && ePGTesting.size() > 0) {
                            int i11 = 0;
                            while (true) {
                                if (i11 < ePGTesting.size() && (NSTIJKPlayerSkyTvActivity.this.f35641B2 == null || !NSTIJKPlayerSkyTvActivity.this.f35641B2.isCancelled())) {
                                    if (((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i10)).getEpgChannelId().equals(ePGTesting.get(i11).getChannel())) {
                                        int iM = m7.w.M(m7.w.x(ePGTesting.get(i11).getStart(), NSTIJKPlayerSkyTvActivity.this.f35806d), m7.w.x(ePGTesting.get(i11).getStop(), NSTIJKPlayerSkyTvActivity.this.f35806d), NSTIJKPlayerSkyTvActivity.this.f35806d);
                                        if (iM != 0) {
                                            iM = 100 - iM;
                                        }
                                        liveStreamsDBModel.setEpgPercentage(iM);
                                        liveStreamsDBModel.setProgramName(ePGTesting.get(i11).getTitle());
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                        }
                        arrayList.add(liveStreamsDBModel);
                    }
                }
                if (NSTIJKPlayerSkyTvActivity.this.f35660E0 == null) {
                    return "all_channels_with_cat";
                }
                NSTIJKPlayerSkyTvActivity.this.f35660E0.clear();
                NSTIJKPlayerSkyTvActivity.this.f35660E0.addAll(arrayList);
                return "all_channels_with_cat";
            } catch (Exception e9) {
                e9.printStackTrace();
                return "all_channels_with_cat";
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                return NSTIJKPlayerSkyTvActivity.this.f35776X2.equals("-1") ? SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyTvActivity.this.f35806d).equals("m3u") ? NSTIJKPlayerSkyTvActivity.this.D3() : NSTIJKPlayerSkyTvActivity.this.E3() : NSTIJKPlayerSkyTvActivity.this.f35776X2.equals("-6") ? NSTIJKPlayerSkyTvActivity.this.k3() : a();
            } catch (Exception unused) {
                return "error";
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (NSTIJKPlayerSkyTvActivity.this.f35660E0 != null) {
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity.o4(nSTIJKPlayerSkyTvActivity.f35660E0);
                    if (!NSTIJKPlayerSkyTvActivity.this.f35822f2.booleanValue()) {
                        NSTIJKPlayerSkyTvActivity.this.f35822f2 = Boolean.TRUE;
                        if (NSTIJKPlayerSkyTvActivity.this.f35660E0 == null || NSTIJKPlayerSkyTvActivity.this.f35660E0.size() == 0) {
                            AbstractC2237a.f44480Y = Boolean.FALSE;
                            NSTIJKPlayerSkyTvActivity.this.Z3();
                        } else if (NSTIJKPlayerSkyTvActivity.this.f35894p4.equals("true") || NSTIJKPlayerSkyTvActivity.this.f35740R2.i()) {
                            if (SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyTvActivity.this.f35806d).equals("stalker_api")) {
                                try {
                                    m7.w.N0(NSTIJKPlayerSkyTvActivity.this.f35806d);
                                    String stalkerToken = SharepreferenceDBHandler.getStalkerToken(NSTIJKPlayerSkyTvActivity.this.f35806d);
                                    String loggedInMacAddress = SharepreferenceDBHandler.getLoggedInMacAddress(NSTIJKPlayerSkyTvActivity.this.f35806d);
                                    if (NSTIJKPlayerSkyTvActivity.this.f35660E0 != null && NSTIJKPlayerSkyTvActivity.this.f35660E0.size() > 0 && NSTIJKPlayerSkyTvActivity.this.f35787Z1 < NSTIJKPlayerSkyTvActivity.this.f35660E0.size()) {
                                        NSTIJKPlayerSkyTvActivity.this.f35826g.c(loggedInMacAddress, stalkerToken, ((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(NSTIJKPlayerSkyTvActivity.this.f35787Z1)).getCmd(), "", null, "itv", 0, 0, "", "", "", "", "", "playFirstTime", 0, "", "");
                                    }
                                } catch (Exception unused) {
                                }
                            } else {
                                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = NSTIJKPlayerSkyTvActivity.this;
                                nSTIJKPlayerSkyTvActivity2.g4(nSTIJKPlayerSkyTvActivity2.f35660E0);
                            }
                        } else if (NSTIJKPlayerSkyTvActivity.this.f35669F3 != null) {
                            NSTIJKPlayerSkyTvActivity.this.f35669F3.setVisibility(0);
                        }
                    }
                }
                NSTIJKPlayerSkyTvActivity.this.R3();
                NSTIJKPlayerSkyTvActivity.this.O3();
                NSTIJKPlayerSkyTvActivity.this.t3();
                NSTIJKPlayerSkyTvActivity.this.s3();
            } catch (Exception unused2) {
                NSTIJKPlayerSkyTvActivity.this.R3();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            LinearLayout linearLayout;
            super.onPreExecute();
            try {
                if (NSTIJKPlayerSkyTvActivity.this.f35699K3 == null || NSTIJKPlayerSkyTvActivity.this.f35699K3.getVisibility() != 0) {
                    NSTIJKPlayerSkyTvActivity.this.f35887o4 = "";
                } else {
                    NSTIJKPlayerSkyTvActivity.this.f35887o4 = "player";
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            NSTIJKPlayerSkyTvActivity.this.v4();
            if (NSTIJKPlayerSkyTvActivity.this.f35887o4.equals("player")) {
                if (NSTIJKPlayerSkyTvActivity.this.f35767W != null) {
                    NSTIJKPlayerSkyTvActivity.this.f35767W.setVisibility(8);
                }
                linearLayout = NSTIJKPlayerSkyTvActivity.this.f35774X0;
                if (linearLayout == null) {
                    return;
                }
            } else {
                if (NSTIJKPlayerSkyTvActivity.this.f35761V != null) {
                    NSTIJKPlayerSkyTvActivity.this.f35761V.setVisibility(8);
                }
                linearLayout = NSTIJKPlayerSkyTvActivity.this.f35768W0;
                if (linearLayout == null) {
                    return;
                }
            }
            linearLayout.setVisibility(8);
        }
    }

    public class J implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f35975a;

        public J(View view) {
            this.f35975a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f35975a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f35975a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f35975a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:113:0x0214  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ef  */
        @Override // android.view.View.OnFocusChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onFocusChange(android.view.View r26, boolean r27) {
            /*
                Method dump skipped, instruction units count: 2217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.J.onFocusChange(android.view.View, boolean):void");
        }
    }

    public class K extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f35977a;

        public K(String str) {
            this.f35977a = str;
        }

        public /* synthetic */ K(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity, String str, ViewOnClickListenerC1494k viewOnClickListenerC1494k) {
            this(str);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HashMap doInBackground(String... strArr) {
            try {
                return NSTIJKPlayerSkyTvActivity.this.r4(this.f35977a);
            } catch (Exception unused) {
                return new HashMap();
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:54:0x013a
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(java.util.HashMap r12) {
            /*
                Method dump skipped, instruction units count: 954
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.K.onPostExecute(java.util.HashMap):void");
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            try {
                NSTIJKPlayerSkyTvActivity.this.W3();
                LinearLayout linearLayout = NSTIJKPlayerSkyTvActivity.this.f35954y1;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                LinearLayout linearLayout2 = NSTIJKPlayerSkyTvActivity.this.f35633A1;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                LinearLayout linearLayout3 = NSTIJKPlayerSkyTvActivity.this.f35640B1;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                }
                LinearLayout linearLayout4 = NSTIJKPlayerSkyTvActivity.this.f35647C1;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(8);
                }
                LinearLayout linearLayout5 = NSTIJKPlayerSkyTvActivity.this.f35654D1;
                if (linearLayout5 != null) {
                    linearLayout5.setVisibility(8);
                }
                LinearLayout linearLayout6 = NSTIJKPlayerSkyTvActivity.this.f35661E1;
                if (linearLayout6 != null) {
                    linearLayout6.setVisibility(0);
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public class L extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f35979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f35980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f35981c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f35982d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f35983e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f35984f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f35985g;

        public L(String str, int i9, String str2, String str3, String str4, int i10, String str5) {
            this.f35979a = str;
            this.f35980b = i9;
            this.f35981c = str5;
            this.f35982d = str2;
            this.f35983e = str3;
            this.f35984f = str4;
            this.f35985g = i10;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                if (nSTIJKPlayerSkyTvActivity.f35806d == null || nSTIJKPlayerSkyTvActivity.f35838h4 == null || NSTIJKPlayerSkyTvActivity.this.f35691J1 == null || NSTIJKPlayerSkyTvActivity.this.f35824f4 == null || NSTIJKPlayerSkyTvActivity.this.f35761V == null) {
                    return null;
                }
                FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
                favouriteDBModel.setCategoryID(this.f35979a);
                favouriteDBModel.setStreamID(this.f35980b);
                favouriteDBModel.setStreamIDOneStream(this.f35981c);
                favouriteDBModel.setNum(this.f35983e);
                favouriteDBModel.setName(this.f35982d);
                favouriteDBModel.setUserID(SharepreferenceDBHandler.getUserID(NSTIJKPlayerSkyTvActivity.this.f35806d));
                NSTIJKPlayerSkyTvActivity.this.f35691J1.addToFavourite(favouriteDBModel, this.f35984f);
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
                View childAt = NSTIJKPlayerSkyTvActivity.this.f35761V.getChildAt(this.f35985g - NSTIJKPlayerSkyTvActivity.this.f35761V.getFirstVisiblePosition());
                if (childAt != null) {
                    try {
                        ((ImageView) childAt.findViewById(f.f12406g5)).setVisibility(0);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
                NSTIJKPlayerSkyTvActivity.this.f35824f4.x(1);
                NSTIJKPlayerSkyTvActivity.this.R3();
            } catch (Exception unused) {
                NSTIJKPlayerSkyTvActivity.this.R3();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (NSTIJKPlayerSkyTvActivity.this.f35662E2 == null) {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                nSTIJKPlayerSkyTvActivity.f35662E2 = NSTIJKPlayerSkyTvActivity.u3(nSTIJKPlayerSkyTvActivity.f35806d);
                if (NSTIJKPlayerSkyTvActivity.this.f35662E2 == null) {
                    return;
                }
            } else if (NSTIJKPlayerSkyTvActivity.this.f35662E2.isShowing()) {
                return;
            }
            NSTIJKPlayerSkyTvActivity.this.f35662E2.show();
        }
    }

    public class M extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f35987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f35988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f35989c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f35990d;

        public M(String str, String str2, String str3, int i9) {
            this.f35987a = str;
            this.f35988b = str2;
            this.f35989c = str3;
            this.f35990d = i9;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                if (nSTIJKPlayerSkyTvActivity.f35806d == null || nSTIJKPlayerSkyTvActivity.f35838h4 == null) {
                    return null;
                }
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = NSTIJKPlayerSkyTvActivity.this;
                if (nSTIJKPlayerSkyTvActivity2.f35827g0 == null || nSTIJKPlayerSkyTvActivity2.f35824f4 == null || NSTIJKPlayerSkyTvActivity.this.f35761V == null) {
                    return null;
                }
                FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
                favouriteM3UModel.setUrl(this.f35988b);
                favouriteM3UModel.setUserID(SharepreferenceDBHandler.getUserID(NSTIJKPlayerSkyTvActivity.this.f35806d));
                favouriteM3UModel.setName(this.f35989c);
                favouriteM3UModel.setCategoryID(this.f35987a);
                NSTIJKPlayerSkyTvActivity.this.f35827g0.addToFavourite(favouriteM3UModel);
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
                View childAt = NSTIJKPlayerSkyTvActivity.this.f35761V.getChildAt(this.f35990d - NSTIJKPlayerSkyTvActivity.this.f35761V.getFirstVisiblePosition());
                if (childAt != null) {
                    try {
                        ((ImageView) childAt.findViewById(f.f12406g5)).setVisibility(0);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
                NSTIJKPlayerSkyTvActivity.this.f35824f4.x(1);
                NSTIJKPlayerSkyTvActivity.this.R3();
            } catch (Exception unused) {
                NSTIJKPlayerSkyTvActivity.this.R3();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (NSTIJKPlayerSkyTvActivity.this.f35662E2 == null) {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                nSTIJKPlayerSkyTvActivity.f35662E2 = NSTIJKPlayerSkyTvActivity.u3(nSTIJKPlayerSkyTvActivity.f35806d);
                if (NSTIJKPlayerSkyTvActivity.this.f35662E2 == null) {
                    return;
                }
            } else if (NSTIJKPlayerSkyTvActivity.this.f35662E2.isShowing()) {
                return;
            }
            NSTIJKPlayerSkyTvActivity.this.f35662E2.show();
        }
    }

    public class N extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f35992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f35993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f35994c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f35995d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f35996e;

        public N(String str, int i9, String str2, String str3, int i10) {
            this.f35992a = str;
            this.f35993b = i9;
            this.f35994c = str2;
            this.f35995d = str3;
            this.f35996e = i10;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                if (nSTIJKPlayerSkyTvActivity.f35806d == null || nSTIJKPlayerSkyTvActivity.f35838h4 == null || NSTIJKPlayerSkyTvActivity.this.f35691J1 == null || NSTIJKPlayerSkyTvActivity.this.f35824f4 == null || NSTIJKPlayerSkyTvActivity.this.f35761V == null) {
                    return null;
                }
                NSTIJKPlayerSkyTvActivity.this.f35691J1.deleteFavourite(this.f35993b, this.f35992a, this.f35995d, this.f35994c, SharepreferenceDBHandler.getUserID(NSTIJKPlayerSkyTvActivity.this.f35806d), NSTIJKPlayerSkyTvActivity.this.f35731Q);
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
                View childAt = NSTIJKPlayerSkyTvActivity.this.f35761V.getChildAt(this.f35996e - NSTIJKPlayerSkyTvActivity.this.f35761V.getFirstVisiblePosition());
                if (childAt != null) {
                    try {
                        ((ImageView) childAt.findViewById(f.f12406g5)).setVisibility(4);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
                NSTIJKPlayerSkyTvActivity.this.f35824f4.x(1);
                NSTIJKPlayerSkyTvActivity.this.R3();
            } catch (Exception unused) {
                NSTIJKPlayerSkyTvActivity.this.R3();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (NSTIJKPlayerSkyTvActivity.this.f35662E2 == null) {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                nSTIJKPlayerSkyTvActivity.f35662E2 = NSTIJKPlayerSkyTvActivity.u3(nSTIJKPlayerSkyTvActivity.f35806d);
                if (NSTIJKPlayerSkyTvActivity.this.f35662E2 == null) {
                    return;
                }
            } else if (NSTIJKPlayerSkyTvActivity.this.f35662E2.isShowing()) {
                return;
            }
            NSTIJKPlayerSkyTvActivity.this.f35662E2.show();
        }
    }

    public class O extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f35998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f35999b;

        public O(String str, int i9) {
            this.f35998a = str;
            this.f35999b = i9;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                if (nSTIJKPlayerSkyTvActivity.f35806d == null || nSTIJKPlayerSkyTvActivity.f35838h4 == null) {
                    return null;
                }
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = NSTIJKPlayerSkyTvActivity.this;
                if (nSTIJKPlayerSkyTvActivity2.f35827g0 == null || nSTIJKPlayerSkyTvActivity2.f35824f4 == null || NSTIJKPlayerSkyTvActivity.this.f35761V == null) {
                    return null;
                }
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity3 = NSTIJKPlayerSkyTvActivity.this;
                nSTIJKPlayerSkyTvActivity3.f35827g0.deleteFavourite(this.f35998a, SharepreferenceDBHandler.getUserID(nSTIJKPlayerSkyTvActivity3.f35806d));
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
                View childAt = NSTIJKPlayerSkyTvActivity.this.f35761V.getChildAt(this.f35999b - NSTIJKPlayerSkyTvActivity.this.f35761V.getFirstVisiblePosition());
                if (childAt != null) {
                    try {
                        ((ImageView) childAt.findViewById(f.f12406g5)).setVisibility(4);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
                NSTIJKPlayerSkyTvActivity.this.f35824f4.x(1);
                NSTIJKPlayerSkyTvActivity.this.R3();
            } catch (Exception unused) {
                NSTIJKPlayerSkyTvActivity.this.R3();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (NSTIJKPlayerSkyTvActivity.this.f35662E2 == null) {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                nSTIJKPlayerSkyTvActivity.f35662E2 = NSTIJKPlayerSkyTvActivity.u3(nSTIJKPlayerSkyTvActivity.f35806d);
                if (NSTIJKPlayerSkyTvActivity.this.f35662E2 == null) {
                    return;
                }
            } else if (NSTIJKPlayerSkyTvActivity.this.f35662E2.isShowing()) {
                return;
            }
            NSTIJKPlayerSkyTvActivity.this.f35662E2.show();
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$a, reason: case insensitive filesystem */
    public class C1484a implements AdapterView.OnItemSelectedListener {
        public C1484a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i9, long j9) {
            try {
                if (NSTIJKPlayerSkyTvActivity.this.f35655D2 != null && NSTIJKPlayerSkyTvActivity.this.f35655D2.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    NSTIJKPlayerSkyTvActivity.this.f35655D2.cancel(true);
                }
                ArrayList arrayListG = NSTIJKPlayerSkyTvActivity.this.f35838h4.g();
                ViewOnClickListenerC1494k viewOnClickListenerC1494k = null;
                if (arrayListG != null && arrayListG.size() > 0) {
                    String epgChannelId = ((LiveStreamsDBModel) arrayListG.get(i9)).getEpgChannelId();
                    NSTIJKPlayerSkyTvActivity.this.f35739R1.removeCallbacksAndMessages(null);
                    if (SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyTvActivity.this.f35806d).equals("stalker_api")) {
                        NSTIJKPlayerSkyTvActivity.this.C4(((LiveStreamsDBModel) arrayListG.get(i9)).getStreamId());
                        return;
                    } else {
                        NSTIJKPlayerSkyTvActivity.this.f35655D2 = new K(NSTIJKPlayerSkyTvActivity.this, epgChannelId, viewOnClickListenerC1494k).execute(new String[0]);
                        return;
                    }
                }
                if (NSTIJKPlayerSkyTvActivity.this.f35660E0 == null || NSTIJKPlayerSkyTvActivity.this.f35660E0.size() <= 0) {
                    return;
                }
                String epgChannelId2 = ((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i9)).getEpgChannelId();
                NSTIJKPlayerSkyTvActivity.this.f35739R1.removeCallbacksAndMessages(null);
                if (SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyTvActivity.this.f35806d).equals("stalker_api")) {
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity.C4(((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity.f35660E0.get(i9)).getStreamId());
                } else {
                    NSTIJKPlayerSkyTvActivity.this.f35655D2 = new K(NSTIJKPlayerSkyTvActivity.this, epgChannelId2, viewOnClickListenerC1494k).execute(new String[0]);
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$b, reason: case insensitive filesystem */
    public class C1485b implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f36002a;

        public C1485b(ArrayList arrayList) {
            this.f36002a = arrayList;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i9, long j9) {
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity;
            SharedPreferences.Editor editor;
            String streamId;
            String str;
            SharedPreferences.Editor editor2;
            String strValueOf;
            SharedPreferences.Editor editor3;
            String strValueOf2;
            String string;
            JSONObject jSONObject;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            SharedPreferences.Editor editor4;
            String strValueOf3;
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv;
            Uri uri;
            boolean z9;
            LiveStreamsDBModel liveStreamsDBModel;
            if (NSTIJKPlayerSkyTvActivity.this.f35669F3 != null) {
                NSTIJKPlayerSkyTvActivity.this.f35669F3.setVisibility(8);
            }
            try {
                if (NSTIJKPlayerSkyTvActivity.this.f35655D2 != null && NSTIJKPlayerSkyTvActivity.this.f35655D2.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    NSTIJKPlayerSkyTvActivity.this.f35655D2.cancel(true);
                }
                AbstractC2237a.f44480Y = Boolean.TRUE;
                ArrayList arrayListG = NSTIJKPlayerSkyTvActivity.this.f35838h4.g();
                if (arrayListG == null || arrayListG.size() <= 0) {
                    if (NSTIJKPlayerSkyTvActivity.this.f35660E0 == null || NSTIJKPlayerSkyTvActivity.this.f35660E0.size() <= 0) {
                        return;
                    }
                    m7.w.r0(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i9)).getNum());
                    String epgChannelId = ((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i9)).getEpgChannelId();
                    String streamIcon = ((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i9)).getStreamIcon();
                    String url = ((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i9)).getUrl();
                    if (NSTIJKPlayerSkyTvActivity.this.f35857k2.equals("m3u")) {
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = NSTIJKPlayerSkyTvActivity.this;
                        if (!nSTIJKPlayerSkyTvActivity2.f35685I1.equals(((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity2.f35660E0.get(i9)).getUrl())) {
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity3 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity3.f35849j1 = nSTIJKPlayerSkyTvActivity3.f35776X2;
                            NSTIJKPlayerSkyTvActivity.this.f35878n2.setCurrentWindowIndex(i9);
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity4 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity4.f35764V2 = m7.w.r0(((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity4.f35660E0.get(i9)).getNum());
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity5 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity5.f35770W2 = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity5.f35660E0.get(i9)).getCategoryId();
                            if (NSTIJKPlayerSkyTvActivity.this.f35666F0 != null) {
                                NSTIJKPlayerSkyTvActivity.this.f35666F0.clear();
                                NSTIJKPlayerSkyTvActivity.this.f35666F0.addAll(this.f36002a);
                            }
                            NSTIJKPlayerSkyTvActivity.this.f35878n2.setTitle(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i9)).getNum() + " - " + ((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i9)).getName());
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity6 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity6.f35685I1 = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity6.f35660E0.get(i9)).getUrl();
                            C2966a.f().A(NSTIJKPlayerSkyTvActivity.this.f35685I1);
                            if (!NSTIJKPlayerSkyTvActivity.this.f35849j1.equals("-1") && !NSTIJKPlayerSkyTvActivity.this.f35849j1.equals("0") && !NSTIJKPlayerSkyTvActivity.this.f35849j1.equals("-6")) {
                                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity7 = NSTIJKPlayerSkyTvActivity.this;
                                nSTIJKPlayerSkyTvActivity7.f35849j1 = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity7.f35660E0.get(i9)).getCategoryId();
                                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity8 = NSTIJKPlayerSkyTvActivity.this;
                                nSTIJKPlayerSkyTvActivity8.f35856k1 = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity8.f35660E0.get(i9)).getCategoryName();
                                if (NSTIJKPlayerSkyTvActivity.this.f35856k1.isEmpty()) {
                                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity9 = NSTIJKPlayerSkyTvActivity.this;
                                    nSTIJKPlayerSkyTvActivity9.f35856k1 = nSTIJKPlayerSkyTvActivity9.n3(nSTIJKPlayerSkyTvActivity9.f35849j1);
                                }
                            }
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity10 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity10.f35853j5 = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity10.f35660E0.get(i9)).getCategoryId();
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity11 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity11.f35874m5 = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity11.f35660E0.get(i9)).getName();
                            NSTIJKPlayerSkyTvActivity.this.f35787Z1 = i9;
                            NSTIJKPlayerSkyTvActivity.this.f35878n2.t1();
                            if (NSTIJKPlayerSkyTvActivity.this.f35920t2.booleanValue()) {
                                NSTIJKPlayerSkyTvActivity.this.f35878n2.x1(Uri.parse(url), NSTIJKPlayerSkyTvActivity.f35626G5, ((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i9)).getName());
                                NSTIJKPlayerSkyTvActivity.this.f35878n2.f37226H = 0;
                                NSTIJKPlayerSkyTvActivity.this.f35878n2.f37232J = false;
                                NSTIJKPlayerSkyTvActivity.this.f35878n2.start();
                            }
                            NSTIJKPlayerSkyTvActivity.this.f35745S1.removeCallbacksAndMessages(null);
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity12 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity12.f35743S = epgChannelId;
                            nSTIJKPlayerSkyTvActivity12.f35749T = streamIcon;
                            nSTIJKPlayerSkyTvActivity12.f35878n2.setCurrentEpgChannelID(NSTIJKPlayerSkyTvActivity.this.f35743S);
                            NSTIJKPlayerSkyTvActivity.this.f35878n2.setCurrentChannelLogo(NSTIJKPlayerSkyTvActivity.this.f35749T);
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity13 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity13.B4(nSTIJKPlayerSkyTvActivity13.f35749T);
                            if (SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyTvActivity.this.f35806d).equals("stalker_api")) {
                                NSTIJKPlayerSkyTvActivity.this.C4(((LiveStreamsDBModel) arrayListG.get(i9)).getStreamId());
                            } else {
                                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity14 = NSTIJKPlayerSkyTvActivity.this;
                                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity15 = NSTIJKPlayerSkyTvActivity.this;
                                nSTIJKPlayerSkyTvActivity14.f35655D2 = new K(nSTIJKPlayerSkyTvActivity15, nSTIJKPlayerSkyTvActivity15.f35743S, null).execute(new String[0]);
                            }
                            NSTIJKPlayerSkyTvActivity.this.f35739R1.removeCallbacksAndMessages(null);
                            if (NSTIJKPlayerSkyTvActivity.this.f35697K1 != null) {
                                NSTIJKPlayerSkyTvActivity.this.f35697K1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i9)).getUrl()));
                                NSTIJKPlayerSkyTvActivity.this.f35697K1.apply();
                            }
                            if (NSTIJKPlayerSkyTvActivity.this.f35703L1 != null) {
                                NSTIJKPlayerSkyTvActivity.this.f35703L1.putInt("currentlyPlayingVideoPosition", i9);
                                NSTIJKPlayerSkyTvActivity.this.f35703L1.apply();
                            }
                            nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity.f35838h4.notifyDataSetChanged();
                            return;
                        }
                        NSTIJKPlayerSkyTvActivity.this.A3();
                    }
                    if (!NSTIJKPlayerSkyTvActivity.this.f35857k2.equals("onestream_api")) {
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity16 = NSTIJKPlayerSkyTvActivity.this;
                        if (nSTIJKPlayerSkyTvActivity16.f35673G1 != m7.w.q0(((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity16.f35660E0.get(i9)).getStreamId())) {
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity17 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity17.f35849j1 = nSTIJKPlayerSkyTvActivity17.f35776X2;
                            NSTIJKPlayerSkyTvActivity.this.f35878n2.setCurrentWindowIndex(i9);
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity18 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity18.f35764V2 = m7.w.r0(((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity18.f35660E0.get(i9)).getNum());
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity19 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity19.f35770W2 = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity19.f35660E0.get(i9)).getCategoryId();
                            if (NSTIJKPlayerSkyTvActivity.this.f35666F0 != null) {
                                NSTIJKPlayerSkyTvActivity.this.f35666F0.clear();
                                NSTIJKPlayerSkyTvActivity.this.f35666F0.addAll(this.f36002a);
                            }
                            NSTIJKPlayerSkyTvActivity.this.f35878n2.setTitle(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i9)).getNum() + " - " + ((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i9)).getName());
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity20 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity20.f35673G1 = m7.w.q0(((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity20.f35660E0.get(i9)).getStreamId());
                            C2966a.f().A(String.valueOf(NSTIJKPlayerSkyTvActivity.this.f35673G1));
                            if (!NSTIJKPlayerSkyTvActivity.this.f35849j1.equals("-1") && !NSTIJKPlayerSkyTvActivity.this.f35849j1.equals("0") && !NSTIJKPlayerSkyTvActivity.this.f35849j1.equals("-6")) {
                                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity21 = NSTIJKPlayerSkyTvActivity.this;
                                nSTIJKPlayerSkyTvActivity21.f35849j1 = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity21.f35660E0.get(i9)).getCategoryId();
                                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity22 = NSTIJKPlayerSkyTvActivity.this;
                                nSTIJKPlayerSkyTvActivity22.f35856k1 = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity22.f35660E0.get(i9)).getCategoryName();
                                if (NSTIJKPlayerSkyTvActivity.this.f35856k1.isEmpty()) {
                                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity23 = NSTIJKPlayerSkyTvActivity.this;
                                    nSTIJKPlayerSkyTvActivity23.f35856k1 = nSTIJKPlayerSkyTvActivity23.n3(nSTIJKPlayerSkyTvActivity23.f35849j1);
                                }
                            }
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity24 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity24.f35853j5 = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity24.f35660E0.get(i9)).getCategoryId();
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity25 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity25.f35874m5 = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity25.f35660E0.get(i9)).getName();
                            NSTIJKPlayerSkyTvActivity.this.f35787Z1 = i9;
                            NSTIJKPlayerSkyTvActivity.this.f35878n2.t1();
                            if (NSTIJKPlayerSkyTvActivity.this.f35920t2.booleanValue()) {
                                NSTIJKPlayerSkyTvActivity.this.f35878n2.x1(Uri.parse(NSTIJKPlayerSkyTvActivity.this.f35903r + m7.w.q0(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i9)).getStreamId()) + NSTIJKPlayerSkyTvActivity.this.f35904r0), NSTIJKPlayerSkyTvActivity.f35626G5, ((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i9)).getName());
                                NSTIJKPlayerSkyTvActivity.this.f35878n2.f37226H = 0;
                                NSTIJKPlayerSkyTvActivity.this.f35878n2.f37232J = false;
                                NSTIJKPlayerSkyTvActivity.this.f35878n2.start();
                            }
                            NSTIJKPlayerSkyTvActivity.this.f35745S1.removeCallbacksAndMessages(null);
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity26 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity26.f35743S = epgChannelId;
                            nSTIJKPlayerSkyTvActivity26.f35749T = streamIcon;
                            nSTIJKPlayerSkyTvActivity26.f35878n2.setCurrentEpgChannelID(NSTIJKPlayerSkyTvActivity.this.f35743S);
                            NSTIJKPlayerSkyTvActivity.this.f35878n2.setCurrentChannelLogo(NSTIJKPlayerSkyTvActivity.this.f35749T);
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity27 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity27.B4(nSTIJKPlayerSkyTvActivity27.f35749T);
                            if (SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyTvActivity.this.f35806d).equals("stalker_api")) {
                                NSTIJKPlayerSkyTvActivity.this.C4(((LiveStreamsDBModel) arrayListG.get(i9)).getStreamId());
                            } else {
                                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity28 = NSTIJKPlayerSkyTvActivity.this;
                                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity29 = NSTIJKPlayerSkyTvActivity.this;
                                nSTIJKPlayerSkyTvActivity28.f35655D2 = new K(nSTIJKPlayerSkyTvActivity29, nSTIJKPlayerSkyTvActivity29.f35743S, null).execute(new String[0]);
                            }
                            NSTIJKPlayerSkyTvActivity.this.f35739R1.removeCallbacksAndMessages(null);
                            if (NSTIJKPlayerSkyTvActivity.this.f35697K1 != null) {
                                if (NSTIJKPlayerSkyTvActivity.this.f35857k2.equals("onestream_api")) {
                                    editor = NSTIJKPlayerSkyTvActivity.this.f35697K1;
                                    streamId = ((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i9)).getStreamIdOneStream();
                                } else {
                                    editor = NSTIJKPlayerSkyTvActivity.this.f35697K1;
                                    streamId = ((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i9)).getStreamId();
                                }
                                editor.putString("currentlyPlayingVideo", String.valueOf(streamId));
                                NSTIJKPlayerSkyTvActivity.this.f35697K1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i9)).getUrl()));
                                NSTIJKPlayerSkyTvActivity.this.f35697K1.apply();
                            }
                            if (NSTIJKPlayerSkyTvActivity.this.f35703L1 != null) {
                                NSTIJKPlayerSkyTvActivity.this.f35703L1.putInt("currentlyPlayingVideoPosition", i9);
                                NSTIJKPlayerSkyTvActivity.this.f35703L1.apply();
                            }
                            nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity.f35838h4.notifyDataSetChanged();
                            return;
                        }
                        NSTIJKPlayerSkyTvActivity.this.A3();
                    }
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity30 = NSTIJKPlayerSkyTvActivity.this;
                    if (!nSTIJKPlayerSkyTvActivity30.f35679H1.equals(((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity30.f35660E0.get(i9)).getStreamIdOneStream())) {
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity31 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity31.f35849j1 = nSTIJKPlayerSkyTvActivity31.f35776X2;
                        NSTIJKPlayerSkyTvActivity.this.f35878n2.setCurrentWindowIndex(i9);
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity32 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity32.f35764V2 = m7.w.r0(((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity32.f35660E0.get(i9)).getNum());
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity33 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity33.f35770W2 = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity33.f35660E0.get(i9)).getCategoryId();
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity34 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity34.f35853j5 = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity34.f35660E0.get(i9)).getCategoryId();
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity35 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity35.f35874m5 = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity35.f35660E0.get(i9)).getName();
                        if (NSTIJKPlayerSkyTvActivity.this.f35666F0 != null) {
                            NSTIJKPlayerSkyTvActivity.this.f35666F0.clear();
                            NSTIJKPlayerSkyTvActivity.this.f35666F0.addAll(this.f36002a);
                        }
                        NSTIJKPlayerSkyTvActivity.this.f35878n2.setTitle(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i9)).getNum() + " - " + ((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i9)).getName());
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity36 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity36.f35679H1 = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity36.f35660E0.get(i9)).getStreamIdOneStream();
                        C2966a.f().A(NSTIJKPlayerSkyTvActivity.this.f35679H1);
                        if (!NSTIJKPlayerSkyTvActivity.this.f35849j1.equals("-1") && !NSTIJKPlayerSkyTvActivity.this.f35849j1.equals("0") && !NSTIJKPlayerSkyTvActivity.this.f35849j1.equals("-6")) {
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity37 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity37.f35849j1 = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity37.f35660E0.get(i9)).getCategoryId();
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity38 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity38.f35856k1 = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity38.f35660E0.get(i9)).getCategoryName();
                            if (NSTIJKPlayerSkyTvActivity.this.f35856k1.isEmpty()) {
                                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity39 = NSTIJKPlayerSkyTvActivity.this;
                                nSTIJKPlayerSkyTvActivity39.f35856k1 = nSTIJKPlayerSkyTvActivity39.n3(nSTIJKPlayerSkyTvActivity39.f35849j1);
                            }
                        }
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity40 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity40.f35853j5 = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity40.f35660E0.get(i9)).getCategoryId();
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity41 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity41.f35874m5 = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity41.f35660E0.get(i9)).getName();
                        NSTIJKPlayerSkyTvActivity.this.f35787Z1 = i9;
                        NSTIJKPlayerSkyTvActivity.this.f35878n2.t1();
                        if (NSTIJKPlayerSkyTvActivity.this.f35920t2.booleanValue()) {
                            NSTIJKPlayerSkyTvActivity.this.f35878n2.x1(Uri.parse(NSTIJKPlayerSkyTvActivity.this.f35903r + m7.w.q0(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i9)).getStreamId()) + NSTIJKPlayerSkyTvActivity.this.f35904r0), NSTIJKPlayerSkyTvActivity.f35626G5, ((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i9)).getName());
                            NSTIJKPlayerSkyTvActivity.this.f35878n2.f37226H = 0;
                            NSTIJKPlayerSkyTvActivity.this.f35878n2.f37232J = false;
                            NSTIJKPlayerSkyTvActivity.this.f35878n2.start();
                        }
                        NSTIJKPlayerSkyTvActivity.this.f35745S1.removeCallbacksAndMessages(null);
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity42 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity42.f35743S = epgChannelId;
                        nSTIJKPlayerSkyTvActivity42.f35749T = streamIcon;
                        nSTIJKPlayerSkyTvActivity42.f35878n2.setCurrentEpgChannelID(NSTIJKPlayerSkyTvActivity.this.f35743S);
                        NSTIJKPlayerSkyTvActivity.this.f35878n2.setCurrentChannelLogo(NSTIJKPlayerSkyTvActivity.this.f35749T);
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity43 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity43.B4(nSTIJKPlayerSkyTvActivity43.f35749T);
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity44 = NSTIJKPlayerSkyTvActivity.this;
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity45 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity44.f35655D2 = new K(nSTIJKPlayerSkyTvActivity45, nSTIJKPlayerSkyTvActivity45.f35743S, null).execute(new String[0]);
                        NSTIJKPlayerSkyTvActivity.this.f35739R1.removeCallbacksAndMessages(null);
                        if (NSTIJKPlayerSkyTvActivity.this.f35697K1 != null) {
                            if (NSTIJKPlayerSkyTvActivity.this.f35857k2.equals("onestream_api")) {
                                editor2 = NSTIJKPlayerSkyTvActivity.this.f35697K1;
                                strValueOf = ((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i9)).getStreamIdOneStream();
                                str = "currentlyPlayingVideo";
                            } else {
                                str = "currentlyPlayingVideo";
                                editor2 = NSTIJKPlayerSkyTvActivity.this.f35697K1;
                                strValueOf = String.valueOf(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i9)).getStreamId());
                            }
                            editor2.putString(str, strValueOf);
                            NSTIJKPlayerSkyTvActivity.this.f35697K1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35660E0.get(i9)).getUrl()));
                            NSTIJKPlayerSkyTvActivity.this.f35697K1.apply();
                        }
                        if (NSTIJKPlayerSkyTvActivity.this.f35703L1 != null) {
                            NSTIJKPlayerSkyTvActivity.this.f35703L1.putInt("currentlyPlayingVideoPosition", i9);
                            NSTIJKPlayerSkyTvActivity.this.f35703L1.apply();
                        }
                        nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity.f35838h4.notifyDataSetChanged();
                        return;
                    }
                    NSTIJKPlayerSkyTvActivity.this.A3();
                }
                int iR0 = m7.w.r0(((LiveStreamsDBModel) arrayListG.get(i9)).getNum());
                String epgChannelId2 = ((LiveStreamsDBModel) arrayListG.get(i9)).getEpgChannelId();
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity46 = NSTIJKPlayerSkyTvActivity.this;
                nSTIJKPlayerSkyTvActivity46.G3(nSTIJKPlayerSkyTvActivity46.f35660E0, iR0);
                String url2 = ((LiveStreamsDBModel) arrayListG.get(i9)).getUrl();
                String str7 = "";
                if (NSTIJKPlayerSkyTvActivity.this.f35857k2.equals("m3u")) {
                    if (!NSTIJKPlayerSkyTvActivity.this.f35685I1.equals(((LiveStreamsDBModel) arrayListG.get(i9)).getUrl())) {
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity47 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity47.f35849j1 = nSTIJKPlayerSkyTvActivity47.f35776X2;
                        NSTIJKPlayerSkyTvActivity.this.f35878n2.setCurrentWindowIndex(i9);
                        NSTIJKPlayerSkyTvActivity.this.f35764V2 = m7.w.r0(((LiveStreamsDBModel) arrayListG.get(i9)).getNum());
                        NSTIJKPlayerSkyTvActivity.this.f35770W2 = ((LiveStreamsDBModel) arrayListG.get(i9)).getCategoryId();
                        if (NSTIJKPlayerSkyTvActivity.this.f35666F0 != null) {
                            NSTIJKPlayerSkyTvActivity.this.f35666F0.clear();
                            NSTIJKPlayerSkyTvActivity.this.f35666F0.addAll(this.f36002a);
                        }
                        NSTIJKPlayerSkyTvActivity.this.f35878n2.setTitle(((LiveStreamsDBModel) arrayListG.get(i9)).getNum() + " - " + ((LiveStreamsDBModel) arrayListG.get(i9)).getName());
                        NSTIJKPlayerSkyTvActivity.this.f35685I1 = ((LiveStreamsDBModel) arrayListG.get(i9)).getUrl();
                        C2966a.f().A(NSTIJKPlayerSkyTvActivity.this.f35685I1);
                        if (!NSTIJKPlayerSkyTvActivity.this.f35849j1.equals("-1") && !NSTIJKPlayerSkyTvActivity.this.f35849j1.equals("0") && !NSTIJKPlayerSkyTvActivity.this.f35849j1.equals("-6")) {
                            NSTIJKPlayerSkyTvActivity.this.f35849j1 = ((LiveStreamsDBModel) arrayListG.get(i9)).getCategoryId();
                            NSTIJKPlayerSkyTvActivity.this.f35856k1 = ((LiveStreamsDBModel) arrayListG.get(i9)).getCategoryName();
                            if (NSTIJKPlayerSkyTvActivity.this.f35856k1.isEmpty()) {
                                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity48 = NSTIJKPlayerSkyTvActivity.this;
                                nSTIJKPlayerSkyTvActivity48.f35856k1 = nSTIJKPlayerSkyTvActivity48.n3(nSTIJKPlayerSkyTvActivity48.f35849j1);
                            }
                        }
                        NSTIJKPlayerSkyTvActivity.this.f35853j5 = ((LiveStreamsDBModel) arrayListG.get(i9)).getCategoryId();
                        NSTIJKPlayerSkyTvActivity.this.f35874m5 = ((LiveStreamsDBModel) arrayListG.get(i9)).getName();
                        String streamIcon2 = ((LiveStreamsDBModel) arrayListG.get(i9)).getStreamIcon();
                        try {
                            if (streamIcon2.equals("") || streamIcon2.isEmpty()) {
                                NSTIJKPlayerSkyTvActivity.this.f35645C.setImageDrawable(NSTIJKPlayerSkyTvActivity.this.f35806d.getResources().getDrawable(a7.e.f12016i1));
                            } else {
                                com.squareup.picasso.t.q(NSTIJKPlayerSkyTvActivity.this.f35806d).l(streamIcon2).j(a7.e.f12016i1).d(a7.e.f12016i1).g(NSTIJKPlayerSkyTvActivity.this.f35645C);
                            }
                        } catch (Exception unused) {
                            NSTIJKPlayerSkyTvActivity.this.f35645C.setImageDrawable(NSTIJKPlayerSkyTvActivity.this.f35806d.getResources().getDrawable(a7.e.f12016i1));
                        }
                        NSTIJKPlayerSkyTvActivity.this.f35745S1.removeCallbacksAndMessages(null);
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity49 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity49.f35743S = epgChannelId2;
                        nSTIJKPlayerSkyTvActivity49.f35749T = streamIcon2;
                        nSTIJKPlayerSkyTvActivity49.f35878n2.setCurrentEpgChannelID(NSTIJKPlayerSkyTvActivity.this.f35743S);
                        NSTIJKPlayerSkyTvActivity.this.f35878n2.setCurrentChannelLogo(NSTIJKPlayerSkyTvActivity.this.f35749T);
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity50 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity50.B4(nSTIJKPlayerSkyTvActivity50.f35749T);
                        if (SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyTvActivity.this.f35806d).equals("stalker_api")) {
                            NSTIJKPlayerSkyTvActivity.this.C4(((LiveStreamsDBModel) arrayListG.get(i9)).getStreamId());
                        } else {
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity51 = NSTIJKPlayerSkyTvActivity.this;
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity52 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity51.f35655D2 = new K(nSTIJKPlayerSkyTvActivity52, nSTIJKPlayerSkyTvActivity52.f35743S, null).execute(new String[0]);
                        }
                        NSTIJKPlayerSkyTvActivity.this.f35739R1.removeCallbacksAndMessages(null);
                        NSTIJKPlayerSkyTvActivity.this.f35787Z1 = i9;
                        NSTIJKPlayerSkyTvActivity.this.f35878n2.t1();
                        if (NSTIJKPlayerSkyTvActivity.this.f35920t2.booleanValue()) {
                            if (SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyTvActivity.this.f35806d).equals("stalker_api")) {
                                nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTvActivity.this.f35878n2;
                                uri = Uri.parse(NSTIJKPlayerSkyTvActivity.this.f35840i);
                                z9 = NSTIJKPlayerSkyTvActivity.f35626G5;
                                liveStreamsDBModel = (LiveStreamsDBModel) arrayListG.get(i9);
                            } else {
                                nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTvActivity.this.f35878n2;
                                uri = Uri.parse(url2);
                                z9 = NSTIJKPlayerSkyTvActivity.f35626G5;
                                liveStreamsDBModel = (LiveStreamsDBModel) arrayListG.get(i9);
                            }
                            nSTIJKPlayerSkyTv.x1(uri, z9, liveStreamsDBModel.getName());
                            NSTIJKPlayerSkyTvActivity.this.f35878n2.f37226H = 0;
                            NSTIJKPlayerSkyTvActivity.this.f35878n2.f37232J = false;
                            NSTIJKPlayerSkyTvActivity.this.f35878n2.start();
                        }
                        if (NSTIJKPlayerSkyTvActivity.this.f35697K1 != null) {
                            NSTIJKPlayerSkyTvActivity.this.f35697K1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((LiveStreamsDBModel) arrayListG.get(i9)).getUrl()));
                            NSTIJKPlayerSkyTvActivity.this.f35697K1.apply();
                        }
                        if (NSTIJKPlayerSkyTvActivity.this.f35703L1 != null) {
                            NSTIJKPlayerSkyTvActivity.this.f35703L1.putInt("currentlyPlayingVideoPosition", i9);
                            NSTIJKPlayerSkyTvActivity.this.f35703L1.apply();
                        }
                        nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity.f35838h4.notifyDataSetChanged();
                        return;
                    }
                    NSTIJKPlayerSkyTvActivity.this.A3();
                }
                if (!NSTIJKPlayerSkyTvActivity.this.f35857k2.equals("onestream_api")) {
                    if (NSTIJKPlayerSkyTvActivity.this.f35673G1 != m7.w.q0(((LiveStreamsDBModel) arrayListG.get(i9)).getStreamId())) {
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity53 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity53.f35849j1 = nSTIJKPlayerSkyTvActivity53.f35776X2;
                        NSTIJKPlayerSkyTvActivity.this.f35878n2.setCurrentWindowIndex(i9);
                        NSTIJKPlayerSkyTvActivity.this.f35764V2 = m7.w.r0(((LiveStreamsDBModel) arrayListG.get(i9)).getNum());
                        NSTIJKPlayerSkyTvActivity.this.f35770W2 = ((LiveStreamsDBModel) arrayListG.get(i9)).getCategoryId();
                        if (NSTIJKPlayerSkyTvActivity.this.f35666F0 != null) {
                            NSTIJKPlayerSkyTvActivity.this.f35666F0.clear();
                            NSTIJKPlayerSkyTvActivity.this.f35666F0.addAll(this.f36002a);
                        }
                        NSTIJKPlayerSkyTvActivity.this.f35878n2.setTitle(((LiveStreamsDBModel) arrayListG.get(i9)).getNum() + " - " + ((LiveStreamsDBModel) arrayListG.get(i9)).getName());
                        NSTIJKPlayerSkyTvActivity.this.f35673G1 = m7.w.q0(((LiveStreamsDBModel) arrayListG.get(i9)).getStreamId());
                        C2966a.f().A(String.valueOf(NSTIJKPlayerSkyTvActivity.this.f35673G1));
                        if (!NSTIJKPlayerSkyTvActivity.this.f35849j1.equals("-1") && !NSTIJKPlayerSkyTvActivity.this.f35849j1.equals("0") && !NSTIJKPlayerSkyTvActivity.this.f35849j1.equals("-6")) {
                            NSTIJKPlayerSkyTvActivity.this.f35849j1 = ((LiveStreamsDBModel) arrayListG.get(i9)).getCategoryId();
                            NSTIJKPlayerSkyTvActivity.this.f35856k1 = ((LiveStreamsDBModel) arrayListG.get(i9)).getCategoryName();
                            if (NSTIJKPlayerSkyTvActivity.this.f35856k1.isEmpty()) {
                                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity54 = NSTIJKPlayerSkyTvActivity.this;
                                nSTIJKPlayerSkyTvActivity54.f35856k1 = nSTIJKPlayerSkyTvActivity54.n3(nSTIJKPlayerSkyTvActivity54.f35849j1);
                            }
                        }
                        NSTIJKPlayerSkyTvActivity.this.f35853j5 = ((LiveStreamsDBModel) arrayListG.get(i9)).getCategoryId();
                        NSTIJKPlayerSkyTvActivity.this.f35874m5 = ((LiveStreamsDBModel) arrayListG.get(i9)).getName();
                        ((LiveStreamsDBModel) arrayListG.get(i9)).getStreamIdOneStream();
                        String streamIcon3 = ((LiveStreamsDBModel) arrayListG.get(i9)).getStreamIcon();
                        try {
                            if (streamIcon3.equals("") || streamIcon3.isEmpty()) {
                                NSTIJKPlayerSkyTvActivity.this.f35645C.setImageDrawable(NSTIJKPlayerSkyTvActivity.this.f35806d.getResources().getDrawable(a7.e.f12016i1));
                            } else {
                                com.squareup.picasso.t.q(NSTIJKPlayerSkyTvActivity.this.f35806d).l(streamIcon3).j(a7.e.f12016i1).d(a7.e.f12016i1).g(NSTIJKPlayerSkyTvActivity.this.f35645C);
                            }
                        } catch (Exception unused2) {
                            NSTIJKPlayerSkyTvActivity.this.f35645C.setImageDrawable(NSTIJKPlayerSkyTvActivity.this.f35806d.getResources().getDrawable(a7.e.f12016i1));
                        }
                        NSTIJKPlayerSkyTvActivity.this.f35745S1.removeCallbacksAndMessages(null);
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity55 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity55.f35743S = epgChannelId2;
                        nSTIJKPlayerSkyTvActivity55.f35749T = streamIcon3;
                        nSTIJKPlayerSkyTvActivity55.f35878n2.setCurrentEpgChannelID(NSTIJKPlayerSkyTvActivity.this.f35743S);
                        NSTIJKPlayerSkyTvActivity.this.f35878n2.setCurrentChannelLogo(NSTIJKPlayerSkyTvActivity.this.f35749T);
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity56 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity56.B4(nSTIJKPlayerSkyTvActivity56.f35749T);
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity57 = NSTIJKPlayerSkyTvActivity.this;
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity58 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity57.f35655D2 = new K(nSTIJKPlayerSkyTvActivity58, nSTIJKPlayerSkyTvActivity58.f35743S, null).execute(new String[0]);
                        NSTIJKPlayerSkyTvActivity.this.f35739R1.removeCallbacksAndMessages(null);
                        NSTIJKPlayerSkyTvActivity.this.f35787Z1 = i9;
                        NSTIJKPlayerSkyTvActivity.this.f35878n2.t1();
                        if (NSTIJKPlayerSkyTvActivity.this.f35920t2.booleanValue()) {
                            NSTIJKPlayerSkyTvActivity.this.f35878n2.x1(Uri.parse(NSTIJKPlayerSkyTvActivity.this.f35903r + m7.w.q0(((LiveStreamsDBModel) arrayListG.get(i9)).getStreamId()) + NSTIJKPlayerSkyTvActivity.this.f35904r0), NSTIJKPlayerSkyTvActivity.f35626G5, ((LiveStreamsDBModel) arrayListG.get(i9)).getName());
                            NSTIJKPlayerSkyTvActivity.this.f35878n2.f37226H = 0;
                            NSTIJKPlayerSkyTvActivity.this.f35878n2.f37232J = false;
                            NSTIJKPlayerSkyTvActivity.this.f35878n2.start();
                        }
                        if (NSTIJKPlayerSkyTvActivity.this.f35697K1 != null) {
                            if (NSTIJKPlayerSkyTvActivity.this.f35857k2.equals("onestream_api")) {
                                editor3 = NSTIJKPlayerSkyTvActivity.this.f35697K1;
                                strValueOf2 = ((LiveStreamsDBModel) arrayListG.get(i9)).getStreamIdOneStream();
                            } else {
                                editor3 = NSTIJKPlayerSkyTvActivity.this.f35697K1;
                                strValueOf2 = String.valueOf(((LiveStreamsDBModel) arrayListG.get(i9)).getStreamId());
                            }
                            editor3.putString("currentlyPlayingVideo", strValueOf2);
                            NSTIJKPlayerSkyTvActivity.this.f35697K1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((LiveStreamsDBModel) arrayListG.get(i9)).getUrl()));
                            NSTIJKPlayerSkyTvActivity.this.f35697K1.apply();
                        }
                        if (NSTIJKPlayerSkyTvActivity.this.f35703L1 != null) {
                            NSTIJKPlayerSkyTvActivity.this.f35703L1.putInt("currentlyPlayingVideoPosition", i9);
                            NSTIJKPlayerSkyTvActivity.this.f35703L1.apply();
                        }
                        nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity.f35838h4.notifyDataSetChanged();
                        return;
                    }
                    NSTIJKPlayerSkyTvActivity.this.A3();
                }
                if (!NSTIJKPlayerSkyTvActivity.this.f35679H1.equals(((LiveStreamsDBModel) arrayListG.get(i9)).getStreamIdOneStream())) {
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity59 = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity59.f35849j1 = nSTIJKPlayerSkyTvActivity59.f35776X2;
                    NSTIJKPlayerSkyTvActivity.this.f35878n2.setCurrentWindowIndex(i9);
                    NSTIJKPlayerSkyTvActivity.this.f35764V2 = m7.w.r0(((LiveStreamsDBModel) arrayListG.get(i9)).getNum());
                    NSTIJKPlayerSkyTvActivity.this.f35770W2 = ((LiveStreamsDBModel) arrayListG.get(i9)).getCategoryId();
                    if (NSTIJKPlayerSkyTvActivity.this.f35666F0 != null) {
                        NSTIJKPlayerSkyTvActivity.this.f35666F0.clear();
                        NSTIJKPlayerSkyTvActivity.this.f35666F0.addAll(this.f36002a);
                    }
                    NSTIJKPlayerSkyTvActivity.this.f35878n2.setTitle(((LiveStreamsDBModel) arrayListG.get(i9)).getNum() + " - " + ((LiveStreamsDBModel) arrayListG.get(i9)).getName());
                    NSTIJKPlayerSkyTvActivity.this.f35679H1 = ((LiveStreamsDBModel) arrayListG.get(i9)).getStreamIdOneStream();
                    C2966a.f().A(NSTIJKPlayerSkyTvActivity.this.f35679H1);
                    if (!NSTIJKPlayerSkyTvActivity.this.f35849j1.equals("-1") && !NSTIJKPlayerSkyTvActivity.this.f35849j1.equals("0") && !NSTIJKPlayerSkyTvActivity.this.f35849j1.equals("-6")) {
                        NSTIJKPlayerSkyTvActivity.this.f35849j1 = ((LiveStreamsDBModel) arrayListG.get(i9)).getCategoryId();
                        NSTIJKPlayerSkyTvActivity.this.f35856k1 = ((LiveStreamsDBModel) arrayListG.get(i9)).getCategoryName();
                        if (NSTIJKPlayerSkyTvActivity.this.f35856k1.isEmpty()) {
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity60 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity60.f35856k1 = nSTIJKPlayerSkyTvActivity60.n3(nSTIJKPlayerSkyTvActivity60.f35849j1);
                        }
                    }
                    NSTIJKPlayerSkyTvActivity.this.f35853j5 = ((LiveStreamsDBModel) arrayListG.get(i9)).getCategoryId();
                    NSTIJKPlayerSkyTvActivity.this.f35874m5 = ((LiveStreamsDBModel) arrayListG.get(i9)).getName();
                    ((LiveStreamsDBModel) arrayListG.get(i9)).getStreamIdOneStream();
                    String streamIcon4 = ((LiveStreamsDBModel) arrayListG.get(i9)).getStreamIcon();
                    try {
                        if (streamIcon4.equals("") || streamIcon4.isEmpty()) {
                            NSTIJKPlayerSkyTvActivity.this.f35645C.setImageDrawable(NSTIJKPlayerSkyTvActivity.this.f35806d.getResources().getDrawable(a7.e.f12016i1));
                        } else {
                            com.squareup.picasso.t.q(NSTIJKPlayerSkyTvActivity.this.f35806d).l(streamIcon4).j(a7.e.f12016i1).d(a7.e.f12016i1).g(NSTIJKPlayerSkyTvActivity.this.f35645C);
                        }
                    } catch (Exception unused3) {
                        NSTIJKPlayerSkyTvActivity.this.f35645C.setImageDrawable(NSTIJKPlayerSkyTvActivity.this.f35806d.getResources().getDrawable(a7.e.f12016i1));
                    }
                    NSTIJKPlayerSkyTvActivity.this.f35745S1.removeCallbacksAndMessages(null);
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity61 = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity61.f35743S = epgChannelId2;
                    nSTIJKPlayerSkyTvActivity61.f35749T = streamIcon4;
                    nSTIJKPlayerSkyTvActivity61.f35878n2.setCurrentEpgChannelID(NSTIJKPlayerSkyTvActivity.this.f35743S);
                    NSTIJKPlayerSkyTvActivity.this.f35878n2.setCurrentChannelLogo(NSTIJKPlayerSkyTvActivity.this.f35749T);
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity62 = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity62.B4(nSTIJKPlayerSkyTvActivity62.f35749T);
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity63 = NSTIJKPlayerSkyTvActivity.this;
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity64 = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity63.f35655D2 = new K(nSTIJKPlayerSkyTvActivity64, nSTIJKPlayerSkyTvActivity64.f35743S, null).execute(new String[0]);
                    NSTIJKPlayerSkyTvActivity.this.f35739R1.removeCallbacksAndMessages(null);
                    NSTIJKPlayerSkyTvActivity.this.f35787Z1 = i9;
                    NSTIJKPlayerSkyTvActivity.this.f35878n2.t1();
                    if (NSTIJKPlayerSkyTvActivity.this.f35920t2.booleanValue()) {
                        try {
                            jSONObject = new JSONObject(((LiveStreamsDBModel) arrayListG.get(i9)).getUrl());
                            String str8 = NSTIJKPlayerSkyTvActivity.this.f35904r0;
                            str2 = "m3u8";
                            str3 = "ts";
                            if (str8 == null || str8.isEmpty() || !NSTIJKPlayerSkyTvActivity.this.f35904r0.equals(".ts")) {
                                string = "";
                                str4 = string;
                            } else {
                                Iterator<String> itKeys = jSONObject.keys();
                                while (true) {
                                    if (!itKeys.hasNext()) {
                                        str4 = "";
                                        break;
                                    } else if (itKeys.next().equals("ts")) {
                                        str4 = "ts";
                                        break;
                                    }
                                }
                                if (str4.equals("")) {
                                    while (true) {
                                        if (!itKeys.hasNext()) {
                                            break;
                                        } else if (itKeys.next().equals("m3u8")) {
                                            str4 = "m3u8";
                                            break;
                                        }
                                    }
                                }
                                string = jSONObject.getString(str4);
                            }
                        } catch (Exception unused4) {
                        }
                        try {
                            str5 = NSTIJKPlayerSkyTvActivity.this.f35904r0;
                        } catch (Exception unused5) {
                            str7 = string;
                            string = str7;
                        }
                        if (str5 != null && !str5.isEmpty() && NSTIJKPlayerSkyTvActivity.this.f35904r0.equals(".m3u8")) {
                            Iterator<String> itKeys2 = jSONObject.keys();
                            while (true) {
                                if (!itKeys2.hasNext()) {
                                    str2 = str4;
                                    break;
                                } else if (itKeys2.next().equals("m3u8")) {
                                    break;
                                }
                            }
                            if (str2.equals("")) {
                                while (itKeys2.hasNext()) {
                                    if (itKeys2.next().equals("ts")) {
                                        break;
                                    }
                                }
                                str3 = str2;
                                string = jSONObject.getString(str3);
                            } else {
                                str3 = str2;
                                string = jSONObject.getString(str3);
                            }
                            nSTIJKPlayerSkyTvActivity.f35838h4.notifyDataSetChanged();
                            return;
                        }
                        NSTIJKPlayerSkyTvActivity.this.f35878n2.x1(Uri.parse(string), NSTIJKPlayerSkyTvActivity.f35626G5, ((LiveStreamsDBModel) arrayListG.get(i9)).getName());
                        NSTIJKPlayerSkyTvActivity.this.f35878n2.f37226H = 0;
                        NSTIJKPlayerSkyTvActivity.this.f35878n2.f37232J = false;
                        NSTIJKPlayerSkyTvActivity.this.f35878n2.start();
                    }
                    if (NSTIJKPlayerSkyTvActivity.this.f35697K1 != null) {
                        if (NSTIJKPlayerSkyTvActivity.this.f35857k2.equals("onestream_api")) {
                            editor4 = NSTIJKPlayerSkyTvActivity.this.f35697K1;
                            strValueOf3 = ((LiveStreamsDBModel) arrayListG.get(i9)).getStreamIdOneStream();
                            str6 = "currentlyPlayingVideo";
                        } else {
                            str6 = "currentlyPlayingVideo";
                            editor4 = NSTIJKPlayerSkyTvActivity.this.f35697K1;
                            strValueOf3 = String.valueOf(((LiveStreamsDBModel) arrayListG.get(i9)).getStreamId());
                        }
                        editor4.putString(str6, strValueOf3);
                        NSTIJKPlayerSkyTvActivity.this.f35697K1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((LiveStreamsDBModel) arrayListG.get(i9)).getUrl()));
                        NSTIJKPlayerSkyTvActivity.this.f35697K1.apply();
                    }
                    if (NSTIJKPlayerSkyTvActivity.this.f35703L1 != null) {
                        NSTIJKPlayerSkyTvActivity.this.f35703L1.putInt("currentlyPlayingVideoPosition", i9);
                        NSTIJKPlayerSkyTvActivity.this.f35703L1.apply();
                    }
                    nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity.f35838h4.notifyDataSetChanged();
                    return;
                }
                NSTIJKPlayerSkyTvActivity.this.A3();
            } catch (Exception unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$c, reason: case insensitive filesystem */
    public class C1486c implements AdapterView.OnItemLongClickListener {

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$c$a */
        public class a implements PopupMenu.OnMenuItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f36005a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f36006b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f36007c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f36008d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f36009e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ ArrayList f36010f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ String f36011g;

            /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$c$a$a, reason: collision with other inner class name */
            public class DialogC0288a extends Dialog implements View.OnClickListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public Activity f36013a;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public TextView f36014c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public TextView f36015d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public TextView f36016e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public LinearLayout f36017f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public LinearLayout f36018g;

                /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$c$a$a$a, reason: collision with other inner class name */
                public class ViewOnFocusChangeListenerC0289a implements View.OnFocusChangeListener {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public View f36020a;

                    public ViewOnFocusChangeListenerC0289a(View view) {
                        this.f36020a = view;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public void onFocusChange(View view, boolean z9) {
                        LinearLayout linearLayout;
                        int i9;
                        if (z9) {
                            View view2 = this.f36020a;
                            if (view2 == null || view2.getTag() == null || !this.f36020a.getTag().equals("1")) {
                                View view3 = this.f36020a;
                                if (view3 == null || view3.getTag() == null || !this.f36020a.getTag().equals("2")) {
                                    return;
                                } else {
                                    linearLayout = DialogC0288a.this.f36018g;
                                }
                            } else {
                                linearLayout = DialogC0288a.this.f36017f;
                            }
                            i9 = a7.e.f12042p;
                        } else {
                            View view4 = this.f36020a;
                            if (view4 == null || view4.getTag() == null || !this.f36020a.getTag().equals("1")) {
                                View view5 = this.f36020a;
                                if (view5 == null || view5.getTag() == null || !this.f36020a.getTag().equals("2")) {
                                    return;
                                } else {
                                    linearLayout = DialogC0288a.this.f36018g;
                                }
                            } else {
                                linearLayout = DialogC0288a.this.f36017f;
                            }
                            i9 = a7.e.f12038o;
                        }
                        linearLayout.setBackgroundResource(i9);
                    }
                }

                public DialogC0288a(Activity activity) {
                    super(activity);
                    this.f36013a = activity;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x006d A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:4:0x0008, B:6:0x0014, B:8:0x002f, B:9:0x0039, B:15:0x005b, B:17:0x006d, B:18:0x007b, B:23:0x00ad, B:19:0x007f, B:21:0x0093, B:22:0x009e, B:12:0x0040, B:14:0x0050), top: B:31:0x0008 }] */
                /* JADX WARN: Removed duplicated region for block: B:19:0x007f A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:4:0x0008, B:6:0x0014, B:8:0x002f, B:9:0x0039, B:15:0x005b, B:17:0x006d, B:18:0x007b, B:23:0x00ad, B:19:0x007f, B:21:0x0093, B:22:0x009e, B:12:0x0040, B:14:0x0050), top: B:31:0x0008 }] */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onClick(android.view.View r2) {
                    /*
                        Method dump skipped, instruction units count: 222
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.C1486c.a.DialogC0288a.onClick(android.view.View):void");
                }

                @Override // android.app.Dialog
                public void onCreate(Bundle bundle) {
                    try {
                        super.onCreate(bundle);
                        setContentView(NSTIJKPlayerSkyTvActivity.this.f35740R2.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12742X1 : a7.g.f12736W1);
                        this.f36014c = (TextView) findViewById(f.f12544u1);
                        this.f36015d = (TextView) findViewById(f.f12412h1);
                        this.f36017f = (LinearLayout) findViewById(f.V8);
                        this.f36018g = (LinearLayout) findViewById(f.Ia);
                        TextView textView = (TextView) findViewById(f.um);
                        this.f36016e = textView;
                        textView.setText(NSTIJKPlayerSkyTvActivity.this.f35806d.getResources().getString(a7.j.Y8));
                        this.f36014c.setOnClickListener(this);
                        this.f36015d.setOnClickListener(this);
                        TextView textView2 = this.f36014c;
                        textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0289a(textView2));
                        TextView textView3 = this.f36015d;
                        textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0289a(textView3));
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
            }

            public a(String str, String str2, int i9, String str3, String str4, ArrayList arrayList, String str5) {
                this.f36005a = str;
                this.f36006b = str2;
                this.f36007c = i9;
                this.f36008d = str3;
                this.f36009e = str4;
                this.f36010f = arrayList;
                this.f36011g = str5;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
            
                r4 = r11.f36012h.f36004a;
                r4.f35680H2 = true;
                r4.i4();
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
            
                if (r11.f36012h.f36004a.f35857k2.equals("m3u") == false) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
            
                r4 = r11.f36012h.f36004a;
                r5 = r4.f35737R;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
            
                r4.f35813e0 = r5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
            
                if (r11.f36012h.f36004a.f35857k2.equals("onestream_api") == false) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
            
                r4 = r11.f36012h.f36004a;
                r5 = r4.f35737R;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
            
                r4 = r11.f36012h.f36004a;
                r5 = m7.w.V(r4.f35806d, r4.f35725P, r4.f35904r0, "live");
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
            
                r4 = new android.content.Intent(r11.f36012h.f36004a.f35806d, (java.lang.Class<?>) com.nst.iptvsmarterstvbox.view.activity.PlayExternalPlayerActivity.class);
                r4.putExtra("url", r11.f36012h.f36004a.f35813e0);
                r4.putExtra("app_name", ((com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass) r11.f36012h.f36004a.f35758U2.get(r3)).getAppname());
                r4.putExtra("packagename", ((com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass) r11.f36012h.f36004a.f35758U2.get(r3)).getPackagename());
                r11.f36012h.f36004a.f35806d.startActivity(r4);
             */
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean onMenuItemClick(android.view.MenuItem r12) {
                /*
                    Method dump skipped, instruction units count: 562
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.C1486c.a.onMenuItemClick(android.view.MenuItem):boolean");
            }
        }

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$c$b */
        public class b implements PopupMenu.OnDismissListener {
            public b() {
            }

            @Override // android.widget.PopupMenu.OnDismissListener
            public void onDismiss(PopupMenu popupMenu) {
            }
        }

        public C1486c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x0270 A[Catch: Exception -> 0x007d, TRY_LEAVE, TryCatch #0 {Exception -> 0x007d, blocks: (B:3:0x0005, B:5:0x000d, B:8:0x001b, B:10:0x0021, B:19:0x0117, B:21:0x013d, B:23:0x0154, B:26:0x0166, B:28:0x0181, B:30:0x0187, B:31:0x0190, B:33:0x019d, B:34:0x01a6, B:53:0x0248, B:55:0x0270, B:66:0x02a9, B:67:0x02ac, B:32:0x0194, B:35:0x01af, B:37:0x01bd, B:39:0x01d2, B:41:0x01de, B:43:0x01ee, B:44:0x01f8, B:45:0x0201, B:46:0x020a, B:48:0x022a, B:50:0x0230, B:51:0x0239, B:52:0x023d, B:22:0x0149, B:13:0x0080, B:15:0x0088, B:17:0x0094, B:56:0x0278, B:58:0x027e, B:61:0x0285, B:63:0x028f), top: B:72:0x0005, inners: #1 }] */
        @Override // android.widget.AdapterView.OnItemLongClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onItemLongClick(android.widget.AdapterView r20, android.view.View r21, int r22, long r23) {
            /*
                Method dump skipped, instruction units count: 765
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.C1486c.onItemLongClick(android.widget.AdapterView, android.view.View, int, long):boolean");
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$d, reason: case insensitive filesystem */
    public class RunnableC1487d implements Runnable {
        public RunnableC1487d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyTvActivity.this.M3();
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$e, reason: case insensitive filesystem */
    public class RunnableC1488e implements Runnable {
        public RunnableC1488e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyTvActivity.this.p4("", false);
            NSTIJKPlayerSkyTvActivity.this.f35965z5 = Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$f, reason: case insensitive filesystem */
    public class RunnableC1489f implements Runnable {
        public RunnableC1489f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyTvActivity.this.p4("", false);
            NSTIJKPlayerSkyTvActivity.this.f35965z5 = Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$g, reason: case insensitive filesystem */
    public class RunnableC1490g implements Runnable {
        public RunnableC1490g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyTvActivity.this.p4("", false);
            NSTIJKPlayerSkyTvActivity.this.f35965z5 = Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$h, reason: case insensitive filesystem */
    public class RunnableC1491h implements Runnable {
        public RunnableC1491h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyTvActivity.this.p4("", false);
            NSTIJKPlayerSkyTvActivity.this.f35965z5 = Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$i, reason: case insensitive filesystem */
    public class RunnableC1492i implements Runnable {
        public RunnableC1492i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyTvActivity.this.p4("", false);
            NSTIJKPlayerSkyTvActivity.this.f35965z5 = Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$j, reason: case insensitive filesystem */
    public class RunnableC1493j implements Runnable {
        public RunnableC1493j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyTvActivity.this.p4("", false);
            NSTIJKPlayerSkyTvActivity.this.f35965z5 = Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$k, reason: case insensitive filesystem */
    public class ViewOnClickListenerC1494k implements View.OnClickListener {
        public ViewOnClickListenerC1494k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerSkyTvActivity.this.A3();
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$l, reason: case insensitive filesystem */
    public class DialogC1495l extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f36031a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f36032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f36033d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f36034e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f36035f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public LinearLayout f36036g;

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$l$a */
        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f36038a;

            public a(View view) {
                this.f36038a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f36038a;
                    if (view2 == null || view2.getTag() == null || !this.f36038a.getTag().equals("1")) {
                        View view3 = this.f36038a;
                        if (view3 == null || view3.getTag() == null || !this.f36038a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = DialogC1495l.this.f36036g;
                        }
                    } else {
                        linearLayout = DialogC1495l.this.f36035f;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f36038a;
                    if (view4 == null || view4.getTag() == null || !this.f36038a.getTag().equals("1")) {
                        View view5 = this.f36038a;
                        if (view5 == null || view5.getTag() == null || !this.f36038a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = DialogC1495l.this.f36036g;
                        }
                    } else {
                        linearLayout = DialogC1495l.this.f36035f;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        public DialogC1495l(Activity activity) {
            super(activity);
            this.f36031a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity;
            if (view.getId() == f.f12544u1) {
                try {
                    if (NSTIJKPlayerSkyTvActivity.this.f35662E2 == null) {
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity2.f35662E2 = NSTIJKPlayerSkyTvActivity.u3(nSTIJKPlayerSkyTvActivity2.f35806d);
                        if (NSTIJKPlayerSkyTvActivity.this.f35662E2 != null) {
                            nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity.f35662E2.show();
                        }
                        NSTIJKPlayerSkyTvActivity.this.f35827g0.deleteALLLiveRecentlyWatched();
                        NSTIJKPlayerSkyTvActivity.this.V3("-6");
                        NSTIJKPlayerSkyTvActivity.this.f35824f4.w();
                        NSTIJKPlayerSkyTvActivity.this.R3();
                    } else {
                        if (!NSTIJKPlayerSkyTvActivity.this.f35662E2.isShowing()) {
                            nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity.f35662E2.show();
                        }
                        NSTIJKPlayerSkyTvActivity.this.f35827g0.deleteALLLiveRecentlyWatched();
                        NSTIJKPlayerSkyTvActivity.this.V3("-6");
                        NSTIJKPlayerSkyTvActivity.this.f35824f4.w();
                        NSTIJKPlayerSkyTvActivity.this.R3();
                    }
                } catch (Exception unused) {
                }
            } else if (view.getId() == f.f12412h1) {
                dismiss();
            }
            dismiss();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            try {
                super.onCreate(bundle);
                setContentView(NSTIJKPlayerSkyTvActivity.this.f35740R2.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12742X1 : a7.g.f12736W1);
                this.f36032c = (TextView) findViewById(f.f12544u1);
                this.f36033d = (TextView) findViewById(f.f12412h1);
                this.f36035f = (LinearLayout) findViewById(f.V8);
                this.f36036g = (LinearLayout) findViewById(f.Ia);
                TextView textView = (TextView) findViewById(f.um);
                this.f36034e = textView;
                textView.setText(NSTIJKPlayerSkyTvActivity.this.getResources().getString(a7.j.V8));
                this.f36032c.setOnClickListener(this);
                this.f36033d.setOnClickListener(this);
                TextView textView2 = this.f36032c;
                textView2.setOnFocusChangeListener(new a(textView2));
                TextView textView3 = this.f36033d;
                textView3.setOnFocusChangeListener(new a(textView3));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$m, reason: case insensitive filesystem */
    public class RunnableC1496m implements Runnable {

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$m$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTIJKPlayerSkyTvActivity.this.p4("", false);
                NSTIJKPlayerSkyTvActivity.this.f35965z5 = Boolean.TRUE;
            }
        }

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$m$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTIJKPlayerSkyTvActivity.this.f35802c2.setText("");
                NSTIJKPlayerSkyTvActivity.this.f35797b2.setVisibility(8);
            }
        }

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$m$c */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTIJKPlayerSkyTvActivity.this.f35802c2.setText("");
                NSTIJKPlayerSkyTvActivity.this.f35797b2.setVisibility(8);
            }
        }

        public RunnableC1496m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<LiveStreamsDBModel> channelDetails;
            TextView textView;
            Resources resources;
            int i9;
            Handler handler;
            Runnable cVar;
            boolean zI3;
            TextView textView2;
            Resources resources2;
            int i10;
            ArrayList<LiveStreamsDBModel> allLiveStreasWithCategoryId;
            ViewOnClickListenerC1494k viewOnClickListenerC1494k;
            String string;
            JSONObject jSONObject;
            String str;
            String str2;
            String string2;
            String str3;
            String str4;
            String str5;
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
            nSTIJKPlayerSkyTvActivity.f35801c1 = nSTIJKPlayerSkyTvActivity.f35792a2.toString();
            String str6 = "";
            NSTIJKPlayerSkyTvActivity.this.f35802c2.setText("");
            NSTIJKPlayerSkyTvActivity.this.f35797b2.setVisibility(8);
            if (NSTIJKPlayerSkyTvActivity.this.f35901q4.equals("true")) {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = NSTIJKPlayerSkyTvActivity.this;
                channelDetails = nSTIJKPlayerSkyTvActivity2.f35827g0.getChannelDetails(nSTIJKPlayerSkyTvActivity2.f35801c1, "radio_streams");
            } else {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity3 = NSTIJKPlayerSkyTvActivity.this;
                channelDetails = nSTIJKPlayerSkyTvActivity3.f35827g0.getChannelDetails(nSTIJKPlayerSkyTvActivity3.f35801c1, "live");
            }
            NSTIJKPlayerSkyTvActivity.this.f35792a2.setLength(0);
            if (channelDetails == null || channelDetails.size() == 0) {
                if (NSTIJKPlayerSkyTvActivity.this.f35776X2.equalsIgnoreCase("-1")) {
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity4 = NSTIJKPlayerSkyTvActivity.this;
                    textView = nSTIJKPlayerSkyTvActivity4.f35802c2;
                    resources = nSTIJKPlayerSkyTvActivity4.f35806d.getResources();
                    i9 = a7.j.f13301k4;
                } else {
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity5 = NSTIJKPlayerSkyTvActivity.this;
                    textView = nSTIJKPlayerSkyTvActivity5.f35802c2;
                    resources = nSTIJKPlayerSkyTvActivity5.f35806d.getResources();
                    i9 = a7.j.f13261g4;
                }
                textView.setText(resources.getString(i9));
                NSTIJKPlayerSkyTvActivity.this.f35797b2.setVisibility(0);
                handler = new Handler();
                cVar = new c();
            } else {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity6 = NSTIJKPlayerSkyTvActivity.this;
                if (nSTIJKPlayerSkyTvActivity6.f35827g0.getParentalStatusCount(SharepreferenceDBHandler.getUserID(nSTIJKPlayerSkyTvActivity6.f35806d)) <= 0 || NSTIJKPlayerSkyTvActivity.this.f35690J0 == null) {
                    zI3 = false;
                } else {
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity7 = NSTIJKPlayerSkyTvActivity.this;
                    zI3 = nSTIJKPlayerSkyTvActivity7.I3(channelDetails, nSTIJKPlayerSkyTvActivity7.f35690J0);
                }
                if (!zI3) {
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity8 = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity8.f35791a1 = true;
                    nSTIJKPlayerSkyTvActivity8.f35796b1 = true;
                    nSTIJKPlayerSkyTvActivity8.f35849j1 = "0";
                    nSTIJKPlayerSkyTvActivity8.f35856k1 = nSTIJKPlayerSkyTvActivity8.f35806d.getResources().getString(a7.j.f13426x);
                    NSTIJKPlayerSkyTvActivity.this.f35918t0 = 0;
                    String num = channelDetails.get(0).getNum();
                    String streamId = channelDetails.get(0).getStreamId();
                    String streamIdOneStream = channelDetails.get(0).getStreamIdOneStream();
                    String name = channelDetails.get(0).getName();
                    String epgChannelId = channelDetails.get(0).getEpgChannelId();
                    String streamIcon = channelDetails.get(0).getStreamIcon();
                    String url = channelDetails.get(0).getUrl();
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity9 = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity9.f35685I1 = url;
                    nSTIJKPlayerSkyTvActivity9.f35764V2 = m7.w.r0(nSTIJKPlayerSkyTvActivity9.f35801c1);
                    NSTIJKPlayerSkyTvActivity.this.f35770W2 = "0";
                    NSTIJKPlayerSkyTvActivity.this.f35878n2.setTitle(NSTIJKPlayerSkyTvActivity.this.f35801c1 + " - " + name);
                    if (NSTIJKPlayerSkyTvActivity.this.f35901q4.equals("true")) {
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity10 = NSTIJKPlayerSkyTvActivity.this;
                        allLiveStreasWithCategoryId = nSTIJKPlayerSkyTvActivity10.f35827g0.getAllLiveStreasWithCategoryId(nSTIJKPlayerSkyTvActivity10.f35849j1, "radio_streams");
                    } else {
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity11 = NSTIJKPlayerSkyTvActivity.this;
                        allLiveStreasWithCategoryId = nSTIJKPlayerSkyTvActivity11.f35827g0.getAllLiveStreasWithCategoryId(nSTIJKPlayerSkyTvActivity11.f35849j1, "live");
                    }
                    if (allLiveStreasWithCategoryId != null) {
                        NSTIJKPlayerSkyTvActivity.this.f35646C0.clear();
                    }
                    NSTIJKPlayerSkyTvActivity.this.f35646C0 = allLiveStreasWithCategoryId;
                    if (NSTIJKPlayerSkyTvActivity.this.f35646C0 != null && NSTIJKPlayerSkyTvActivity.this.f35646C0.size() > 0) {
                        int i11 = 0;
                        while (true) {
                            if (i11 < NSTIJKPlayerSkyTvActivity.this.f35646C0.size()) {
                                if (((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35646C0.get(i11)).getNum().equals(num)) {
                                    NSTIJKPlayerSkyTvActivity.this.f35878n2.setCurrentWindowIndex(i11);
                                    break;
                                }
                                i11++;
                            }
                        }
                    }
                    try {
                        if (streamIcon.equals("") || streamIcon.isEmpty()) {
                            NSTIJKPlayerSkyTvActivity.this.f35645C.setImageDrawable(NSTIJKPlayerSkyTvActivity.this.f35806d.getResources().getDrawable(a7.e.f12016i1));
                        } else {
                            com.squareup.picasso.t.q(NSTIJKPlayerSkyTvActivity.this.f35806d).l(streamIcon).j(a7.e.f12016i1).d(a7.e.f12016i1).k(80, 55).g(NSTIJKPlayerSkyTvActivity.this.f35645C);
                        }
                    } catch (Exception unused) {
                        NSTIJKPlayerSkyTvActivity.this.f35645C.setImageDrawable(NSTIJKPlayerSkyTvActivity.this.f35806d.getResources().getDrawable(a7.e.f12016i1));
                    }
                    NSTIJKPlayerSkyTvActivity.this.f35878n2.t1();
                    if (NSTIJKPlayerSkyTvActivity.this.f35920t2.booleanValue()) {
                        if (NSTIJKPlayerSkyTvActivity.this.f35857k2.equals("m3u")) {
                            NSTIJKPlayerSkyTvActivity.this.f35878n2.x1(Uri.parse(url), NSTIJKPlayerSkyTvActivity.f35626G5, name);
                            C2966a.f().A(NSTIJKPlayerSkyTvActivity.this.f35685I1);
                        } else if (NSTIJKPlayerSkyTvActivity.this.f35857k2.equals("onestream_api")) {
                            try {
                                jSONObject = new JSONObject(url);
                                String str7 = NSTIJKPlayerSkyTvActivity.this.f35904r0;
                                str = "m3u8";
                                str2 = "ts";
                                if (str7 == null || str7.isEmpty() || !NSTIJKPlayerSkyTvActivity.this.f35904r0.equals(".ts")) {
                                    string2 = "";
                                    str3 = string2;
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
                                    string2 = jSONObject.getString(str3);
                                }
                                try {
                                    str5 = NSTIJKPlayerSkyTvActivity.this.f35904r0;
                                } catch (Exception unused2) {
                                    str4 = string2;
                                }
                            } catch (Exception unused3) {
                            }
                            if (str5 == null || str5.isEmpty()) {
                                str4 = string2;
                            } else {
                                str4 = string2;
                                try {
                                    if (NSTIJKPlayerSkyTvActivity.this.f35904r0.equals(".m3u8")) {
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
                                } catch (Exception unused4) {
                                    str6 = str4;
                                    string = str6;
                                }
                                NSTIJKPlayerSkyTvActivity.this.f35878n2.x1(Uri.parse(string), NSTIJKPlayerSkyTvActivity.f35626G5, name);
                                C2966a.f().A(streamIdOneStream);
                            }
                            string = str4;
                            NSTIJKPlayerSkyTvActivity.this.f35878n2.x1(Uri.parse(string), NSTIJKPlayerSkyTvActivity.f35626G5, name);
                            C2966a.f().A(streamIdOneStream);
                        } else {
                            NSTIJKPlayerSkyTvActivity.this.f35878n2.x1(Uri.parse(NSTIJKPlayerSkyTvActivity.this.f35903r + m7.w.q0(streamId) + NSTIJKPlayerSkyTvActivity.this.f35904r0), NSTIJKPlayerSkyTvActivity.f35626G5, name);
                            C2966a.f().A(streamId);
                        }
                        NSTIJKPlayerSkyTvActivity.this.f35878n2.f37226H = 0;
                        NSTIJKPlayerSkyTvActivity.this.f35878n2.f37232J = false;
                        NSTIJKPlayerSkyTvActivity.this.f35878n2.start();
                        NSTIJKPlayerSkyTvActivity.this.f35965z5 = Boolean.FALSE;
                        NSTIJKPlayerSkyTvActivity.this.f35757U1.removeCallbacksAndMessages(null);
                        NSTIJKPlayerSkyTvActivity.this.f35757U1.postDelayed(new a(), 5000L);
                        NSTIJKPlayerSkyTvActivity.this.z4();
                        NSTIJKPlayerSkyTvActivity.this.t4();
                        NSTIJKPlayerSkyTvActivity.this.l3(5000);
                    }
                    NSTIJKPlayerSkyTvActivity.this.f35745S1.removeCallbacksAndMessages(null);
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity12 = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity12.f35743S = epgChannelId;
                    nSTIJKPlayerSkyTvActivity12.f35749T = streamIcon;
                    nSTIJKPlayerSkyTvActivity12.f35878n2.setCurrentEpgChannelID(NSTIJKPlayerSkyTvActivity.this.f35743S);
                    NSTIJKPlayerSkyTvActivity.this.f35878n2.setCurrentChannelLogo(NSTIJKPlayerSkyTvActivity.this.f35749T);
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity13 = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity13.B4(nSTIJKPlayerSkyTvActivity13.f35749T);
                    if (SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyTvActivity.this.f35806d).equals("stalker_api")) {
                        NSTIJKPlayerSkyTvActivity.this.C4(streamId);
                        viewOnClickListenerC1494k = null;
                    } else {
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity14 = NSTIJKPlayerSkyTvActivity.this;
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity15 = NSTIJKPlayerSkyTvActivity.this;
                        viewOnClickListenerC1494k = null;
                        nSTIJKPlayerSkyTvActivity14.f35655D2 = new K(nSTIJKPlayerSkyTvActivity15, nSTIJKPlayerSkyTvActivity15.f35743S, viewOnClickListenerC1494k).execute(new String[0]);
                    }
                    NSTIJKPlayerSkyTvActivity.this.f35739R1.removeCallbacksAndMessages(viewOnClickListenerC1494k);
                    if (NSTIJKPlayerSkyTvActivity.this.f35857k2.equals("onestream_api")) {
                        NSTIJKPlayerSkyTvActivity.this.f35679H1 = streamIdOneStream;
                    } else {
                        NSTIJKPlayerSkyTvActivity.this.f35673G1 = m7.w.q0(streamId);
                    }
                    if (NSTIJKPlayerSkyTvActivity.this.f35697K1 != null) {
                        if (NSTIJKPlayerSkyTvActivity.this.f35857k2.equals("onestream_api")) {
                            NSTIJKPlayerSkyTvActivity.this.f35697K1.putString("currentlyPlayingVideo", streamIdOneStream);
                        } else {
                            NSTIJKPlayerSkyTvActivity.this.f35697K1.putString("currentlyPlayingVideo", streamId);
                        }
                        NSTIJKPlayerSkyTvActivity.this.f35697K1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", url);
                        NSTIJKPlayerSkyTvActivity.this.f35697K1.apply();
                    }
                    channelDetails.clear();
                    return;
                }
                if (NSTIJKPlayerSkyTvActivity.this.f35776X2.equalsIgnoreCase("-1")) {
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity16 = NSTIJKPlayerSkyTvActivity.this;
                    textView2 = nSTIJKPlayerSkyTvActivity16.f35802c2;
                    resources2 = nSTIJKPlayerSkyTvActivity16.f35806d.getResources();
                    i10 = a7.j.f13301k4;
                } else {
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity17 = NSTIJKPlayerSkyTvActivity.this;
                    textView2 = nSTIJKPlayerSkyTvActivity17.f35802c2;
                    resources2 = nSTIJKPlayerSkyTvActivity17.f35806d.getResources();
                    i10 = a7.j.f13261g4;
                }
                textView2.setText(resources2.getString(i10));
                NSTIJKPlayerSkyTvActivity.this.f35797b2.setVisibility(0);
                handler = new Handler();
                cVar = new b();
            }
            handler.postDelayed(cVar, 1000L);
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$n, reason: case insensitive filesystem */
    public class RunnableC1497n implements Runnable {
        public RunnableC1497n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyTvActivity.this.p4("", false);
            NSTIJKPlayerSkyTvActivity.this.f35965z5 = Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$o, reason: case insensitive filesystem */
    public class RunnableC1498o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f36045a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f36046c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f36047d;

        public RunnableC1498o(int i9, String str, String str2) {
            this.f36045a = i9;
            this.f36046c = str;
            this.f36047d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyTvActivity.this.f35806d).equals("stalker_api")) {
                NSTIJKPlayerSkyTvActivity.this.D4(this.f36045a, this.f36046c, this.f36047d);
                return;
            }
            m7.w.N0(NSTIJKPlayerSkyTvActivity.this.f35806d);
            String stalkerToken = SharepreferenceDBHandler.getStalkerToken(NSTIJKPlayerSkyTvActivity.this.f35806d);
            try {
                NSTIJKPlayerSkyTvActivity.this.f35826g.c(SharepreferenceDBHandler.getLoggedInMacAddress(NSTIJKPlayerSkyTvActivity.this.f35806d), stalkerToken, ((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35666F0.get(this.f36045a)).getCmd(), "", null, "itv", 0, 0, "", "", "", "", "", "zappingLeft", this.f36045a, this.f36046c, this.f36047d);
            } catch (Exception unused) {
            }
        }
    }

    public class p implements Runnable {
        public p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyTvActivity.this.p4("", false);
            NSTIJKPlayerSkyTvActivity.this.f35965z5 = Boolean.TRUE;
        }
    }

    public class q implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f36050a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f36051c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f36052d;

        public q(int i9, String str, String str2) {
            this.f36050a = i9;
            this.f36051c = str;
            this.f36052d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!SharepreferenceDBHandler.getCurrentAPPType(NSTIJKPlayerSkyTvActivity.this.f35806d).equals("stalker_api")) {
                NSTIJKPlayerSkyTvActivity.this.E4(this.f36050a, this.f36051c, this.f36052d);
                return;
            }
            m7.w.N0(NSTIJKPlayerSkyTvActivity.this.f35806d);
            String stalkerToken = SharepreferenceDBHandler.getStalkerToken(NSTIJKPlayerSkyTvActivity.this.f35806d);
            try {
                NSTIJKPlayerSkyTvActivity.this.f35826g.c(SharepreferenceDBHandler.getLoggedInMacAddress(NSTIJKPlayerSkyTvActivity.this.f35806d), stalkerToken, ((LiveStreamsDBModel) NSTIJKPlayerSkyTvActivity.this.f35666F0.get(this.f36050a)).getCmd(), "", null, "itv", 0, 0, "", "", "", "", "", "zappingRight", this.f36050a, this.f36051c, this.f36052d);
            } catch (Exception unused) {
            }
        }
    }

    public class r implements TextWatcher {
        public r() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity;
            boolean z9;
            if (charSequence == null || charSequence.toString().length() <= 0) {
                nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                z9 = false;
            } else {
                nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                z9 = true;
            }
            nSTIJKPlayerSkyTvActivity.f35637A5 = z9;
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
                com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> L34
                boolean r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.S2(r2)     // Catch: java.lang.Exception -> L34
                if (r2 == 0) goto L34
            L14:
                com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> L34
                q7.N r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.h2(r2)     // Catch: java.lang.Exception -> L34
                if (r2 == 0) goto L34
                com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> L34
                q7.N r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.h2(r2)     // Catch: java.lang.Exception -> L34
                android.widget.Filter r2 = r2.getFilter()     // Catch: java.lang.Exception -> L34
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L34
                r2.filter(r1)     // Catch: java.lang.Exception -> L34
                java.lang.String r1 = "honey"
                java.lang.String r2 = "onTextChanged: notify"
                android.util.Log.e(r1, r2)     // Catch: java.lang.Exception -> L34
            L34:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.r.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    public class s implements Runnable {
        public s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyTvActivity.this.N3();
        }
    }

    public class t implements Runnable {
        public t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyTvActivity.this.M3();
        }
    }

    public class u implements DialogInterface.OnClickListener {
        public u() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.dismiss();
        }
    }

    public class v implements DialogInterface.OnClickListener {
        public v() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            m7.w.n0(NSTIJKPlayerSkyTvActivity.this.f35806d);
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
        public Activity f36060a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f36061c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f36062d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f36063e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f36064f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public RadioGroup f36065g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Activity f36066h;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f36068a;

            public a(View view) {
                this.f36068a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f36068a;
                    if (view2 == null || view2.getTag() == null || !this.f36068a.getTag().equals("1")) {
                        View view3 = this.f36068a;
                        if (view3 == null || view3.getTag() == null || !this.f36068a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = x.this.f36064f;
                        }
                    } else {
                        linearLayout = x.this.f36063e;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f36068a;
                    if (view4 == null || view4.getTag() == null || !this.f36068a.getTag().equals("1")) {
                        View view5 = this.f36068a;
                        if (view5 == null || view5.getTag() == null || !this.f36068a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = x.this.f36064f;
                        }
                    } else {
                        linearLayout = x.this.f36063e;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(Activity activity, Activity activity2) {
            super(activity);
            this.f36066h = activity2;
            this.f36060a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getId() == f.f12544u1) {
                try {
                    String string = ((RadioButton) findViewById(this.f36065g.getCheckedRadioButtonId())).getText().toString();
                    SharepreferenceDBHandler.setLiveSubCatSort(string.equals(this.f36066h.getResources().getString(a7.j.f13284i7)) ? "1" : string.equals(this.f36066h.getResources().getString(a7.j.f13254f7)) ? "2" : string.equals(this.f36066h.getResources().getString(a7.j.f13304k7)) ? "3" : string.equals(this.f36066h.getResources().getString(a7.j.f13264g7)) ? "4" : string.equals(this.f36066h.getResources().getString(a7.j.f13274h7)) ? "5" : "0", this.f36066h);
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity.V3(nSTIJKPlayerSkyTvActivity.f35776X2);
                    dismiss();
                } catch (Exception unused) {
                }
            } else if (view.getId() == f.f12412h1) {
                dismiss();
            }
            dismiss();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00ce  */
        @Override // android.app.Dialog
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onCreate(android.os.Bundle r13) {
            /*
                Method dump skipped, instruction units count: 290
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.x.onCreate(android.os.Bundle):void");
        }
    }

    public class y implements SearchView.m {
        public y() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextChange(String str) {
            if (NSTIJKPlayerSkyTvActivity.this.f35838h4 == null) {
                return false;
            }
            NSTIJKPlayerSkyTvActivity.this.f35838h4.getFilter().filter(str);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class z implements Callback {
        public z() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            Log.e("onFailure", th.getMessage().toString());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Toast toastMakeText;
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity;
            String strMessage;
            if (response == null) {
                toastMakeText = Toast.makeText(NSTIJKPlayerSkyTvActivity.this, "Something went Wrong Report not Submited", 0);
            } else {
                if (response.body() == null || !response.isSuccessful()) {
                    if (response.message() != null && !response.message().equals("")) {
                        nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                        strMessage = response.message();
                    }
                    toastMakeText = Toast.makeText(NSTIJKPlayerSkyTvActivity.this, "Something went Wrong Report not Submited", 0);
                } else if (((ClientFeedbackCallback) response.body()).a() == null || !((ClientFeedbackCallback) response.body()).a().equalsIgnoreCase("success")) {
                    nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                    strMessage = "Something went Wrong";
                } else {
                    nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                    strMessage = "Reported Successfully";
                }
                toastMakeText = Toast.makeText(nSTIJKPlayerSkyTvActivity, strMessage, 0);
            }
            toastMakeText.show();
        }
    }

    public NSTIJKPlayerSkyTvActivity() {
        Boolean bool = Boolean.FALSE;
        this.f35815e2 = bool;
        this.f35822f2 = bool;
        this.f35850j2 = "";
        this.f35892p2 = "";
        this.f35899q2 = bool;
        this.f35913s2 = "";
        Boolean bool2 = Boolean.TRUE;
        this.f35920t2 = bool2;
        this.f35927u2 = null;
        this.f35941w2 = -1;
        this.f35948x2 = 0;
        this.f35955y2 = "";
        this.f35962z2 = "";
        this.f35634A2 = bool2;
        this.f35641B2 = null;
        this.f35648C2 = null;
        this.f35655D2 = null;
        this.f35668F2 = false;
        this.f35674G2 = 0;
        this.f35680H2 = false;
        this.f35686I2 = 4;
        this.f35692J2 = f35629J5[0];
        this.f35704L2 = bool;
        this.f35710M2 = bool;
        this.f35716N2 = bool;
        this.f35722O2 = bool;
        this.f35728P2 = bool;
        this.f35734Q2 = bool;
        this.f35764V2 = 0;
        this.f35770W2 = "0";
        this.f35776X2 = "0";
        this.f35782Y2 = bool2;
        this.f35817e4 = "mobile";
        this.f35866l4 = 0;
        this.f35887o4 = "";
        this.f35894p4 = "false";
        this.f35901q4 = "false";
        this.f35908r4 = "";
        this.f35915s4 = "-10";
        this.f35922t4 = 0;
        this.f35846i5 = "Live";
        this.f35853j5 = "";
        this.f35874m5 = "";
        this.f35881n5 = "";
        this.f35888o5 = "";
        this.f35902q5 = "";
        this.f35930u5 = null;
        this.f35937v5 = false;
        this.f35944w5 = true;
        this.f35958y5 = null;
        this.f35965z5 = bool;
        this.f35637A5 = false;
        this.f35644B5 = 0;
        this.f35651C5 = new ArrayList();
        this.f35658D5 = false;
    }

    private void A4() {
        z4();
        if (this.f35900q3.getVisibility() == 0) {
            M3();
        } else {
            t4();
            l3(5000);
        }
    }

    public static String B3(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018a A[Catch: Exception -> 0x01a9, TryCatch #2 {Exception -> 0x01a9, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x000c, B:10:0x0018, B:11:0x001e, B:72:0x013f, B:74:0x018a, B:75:0x019a, B:12:0x0025, B:14:0x0031, B:15:0x0039, B:16:0x0040, B:70:0x0109, B:69:0x00ff, B:71:0x0111), top: B:82:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019a A[Catch: Exception -> 0x01a9, TRY_LEAVE, TryCatch #2 {Exception -> 0x01a9, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x000c, B:10:0x0018, B:11:0x001e, B:72:0x013f, B:74:0x018a, B:75:0x019a, B:12:0x0025, B:14:0x0031, B:15:0x0039, B:16:0x0040, B:70:0x0109, B:69:0x00ff, B:71:0x0111), top: B:82:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D4(int r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.D4(int, java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017f A[Catch: Exception -> 0x019e, TryCatch #0 {Exception -> 0x019e, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x000c, B:10:0x001c, B:11:0x0022, B:69:0x0134, B:71:0x017f, B:72:0x018f, B:12:0x0029, B:14:0x0035, B:15:0x003d, B:16:0x0044, B:67:0x00fe, B:68:0x0106), top: B:76:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018f A[Catch: Exception -> 0x019e, TRY_LEAVE, TryCatch #0 {Exception -> 0x019e, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x000c, B:10:0x001c, B:11:0x0022, B:69:0x0134, B:71:0x017f, B:72:0x018f, B:12:0x0029, B:14:0x0035, B:15:0x003d, B:16:0x0044, B:67:0x00fe, B:68:0x0106), top: B:76:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E4(int r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.E4(int, java.lang.String, java.lang.String):void");
    }

    private ArrayList H3() {
        ArrayList<PasswordStatusDBModel> allPasswordStatus = this.f35827g0.getAllPasswordStatus(SharepreferenceDBHandler.getUserID(this.f35806d));
        this.f35702L0 = allPasswordStatus;
        if (allPasswordStatus != null) {
            for (PasswordStatusDBModel passwordStatusDBModel : allPasswordStatus) {
                if (passwordStatusDBModel.getPasswordStatus().equals("1")) {
                    this.f35690J0.add(passwordStatusDBModel.getPasswordStatusCategoryId());
                }
            }
        }
        return this.f35690J0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean I3(ArrayList arrayList, ArrayList arrayList2) {
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

    private ArrayList J3(ArrayList arrayList, ArrayList arrayList2) {
        this.f35720O0 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FavouriteDBModel favouriteDBModel = (FavouriteDBModel) it.next();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    this.f35720O0.add(favouriteDBModel);
                    break;
                }
                String str = (String) it2.next();
                if (favouriteDBModel.getCategoryID() == null || !favouriteDBModel.getCategoryID().equals(str)) {
                }
            }
        }
        return this.f35720O0;
    }

    private ArrayList K3(ArrayList arrayList, ArrayList arrayList2) {
        this.f35726P0 = new ArrayList();
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
                            this.f35726P0.add(favouriteM3UModel);
                            break;
                        }
                        if (favouriteM3UModel.getCategoryID().equals((String) it2.next())) {
                            break;
                        }
                    }
                }
            }
            return this.f35726P0;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L3() {
        ProgressBar progressBar = this.f35683I;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView = this.f35652D;
        if (textView != null) {
            textView.setText(this.f35806d.getResources().getString(a7.j.f13078N4));
        }
        TextView textView2 = this.f35659E;
        if (textView2 != null) {
            textView2.setText("");
        }
        TextView textView3 = this.f35665F;
        if (textView3 != null) {
            textView3.setText(this.f35806d.getResources().getString(a7.j.f13221c4));
        }
        TextView textView4 = this.f35671G;
        if (textView4 != null) {
            textView4.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M3() {
        if (this.f35900q3.getVisibility() == 0) {
            this.f35900q3.startAnimation(this.f35799b4);
            this.f35649C3.startAnimation(this.f35799b4);
            this.f35635A3.startAnimation(this.f35799b4);
            if (AbstractC2237a.f44475V0.booleanValue()) {
                this.f35784Y4.startAnimation(this.f35799b4);
            }
            this.f35642B3.startAnimation(this.f35799b4);
            if (this.f35879n3.getVisibility() == 0) {
                this.f35879n3.startAnimation(this.f35799b4);
            }
            if (this.f35893p3.getVisibility() == 0) {
                this.f35893p3.startAnimation(this.f35799b4);
            }
            if (this.f35886o3.getVisibility() == 0) {
                this.f35886o3.startAnimation(this.f35799b4);
            }
            this.f35900q3.setVisibility(8);
            if (this.f35879n3.getVisibility() == 0) {
                this.f35879n3.setVisibility(8);
            }
            if (this.f35893p3.getVisibility() == 0) {
                this.f35893p3.setVisibility(8);
            }
            if (this.f35886o3.getVisibility() == 0) {
                this.f35886o3.setVisibility(8);
            }
            this.f35649C3.setVisibility(8);
            this.f35635A3.setVisibility(8);
            this.f35784Y4.setVisibility(8);
            this.f35642B3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O3() {
        LinearLayout linearLayout = this.f35689J;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f35695K;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x01aa A[PHI: r4
      0x01aa: PHI (r4v16 java.lang.String) = (r4v6 java.lang.String), (r4v7 java.lang.String), (r4v8 java.lang.String) binds: [B:8:0x01a8, B:11:0x01b9, B:14:0x01c8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void T3() {
        /*
            Method dump skipped, instruction units count: 2228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.T3():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W3() {
        ProgressBar progressBar = this.f35683I;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView = this.f35652D;
        if (textView != null) {
            textView.setText(this.f35806d.getResources().getString(a7.j.f13068M4));
        }
        TextView textView2 = this.f35659E;
        if (textView2 != null) {
            textView2.setText("");
        }
        TextView textView3 = this.f35665F;
        if (textView3 != null) {
            textView3.setText(this.f35806d.getResources().getString(a7.j.f13211b4));
        }
        TextView textView4 = this.f35671G;
        if (textView4 != null) {
            textView4.setText("");
        }
    }

    private void X3() {
        int currentWindowIndex = this.f35878n2.getCurrentWindowIndex();
        if (currentWindowIndex == this.f35666F0.size() - 1) {
            this.f35878n2.setCurrentWindowIndex(0);
        } else {
            this.f35878n2.setCurrentWindowIndex(currentWindowIndex + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a3(int i9, String str) {
        try {
            StringBuilder sb = new StringBuilder();
            List<Integer> favIdsList = StalkerLiveFavIdsSingleton.getInstance().getFavIdsList();
            this.f35861l = favIdsList;
            if (favIdsList != null && favIdsList.size() > 0) {
                for (int i10 = 0; i10 < this.f35861l.size(); i10++) {
                    sb.append(this.f35861l.get(i10));
                    sb.append(",");
                }
            }
            sb.append(i9);
            this.f35889p = i9;
            String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f35806d);
            this.f35868m.c(SharepreferenceDBHandler.getLoggedInMacAddress(this.f35806d), stalkerToken, null, sb.toString(), "added", str);
        } catch (Exception unused) {
            m7.w.X();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b3(String str, int i9, String str2, String str3, String str4, int i10, String str5) {
        new L(str, i9, str2, str3, str4, i10, str5).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c3(String str, String str2, String str3, int i9) {
        new M(str, str2, str3, i9).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    private void c4() {
        this.f35723O3.setOnClickListener(this);
        this.f35729P3.setOnClickListener(this);
        this.f35914s3.setOnClickListener(this);
        this.f35747S3.setOnClickListener(this);
        this.f35675G3.setOnClickListener(this);
        this.f35753T3.setOnClickListener(this);
        this.f35942w3.setOnClickListener(this);
        this.f35949x3.setOnClickListener(this);
        this.f35956y3.setOnClickListener(this);
        this.f35921t3.setOnClickListener(this);
        this.f35935v3.setOnClickListener(this);
        this.f35735Q3.setOnClickListener(this);
        this.f35741R3.setOnClickListener(this);
        this.f35681H3.setOnClickListener(this);
        this.f35795a5.setOnClickListener(this);
        this.f35800b5.setOnClickListener(this);
        this.f35805c5.setOnClickListener(this);
        this.f35811d5.setOnClickListener(this);
        this.f35818e5.setOnClickListener(this);
        this.f35825f5.setOnClickListener(this);
        this.f35832g5.setOnClickListener(this);
        this.f35957y4.setOnClickListener(this);
        this.f35778X4.setOnClickListener(this);
    }

    private void d3(Configuration configuration) {
        NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv;
        boolean z9;
        View decorView = getWindow().getDecorView();
        if (configuration.orientation == 2) {
            decorView.setSystemUiVisibility(5894);
            nSTIJKPlayerSkyTv = this.f35878n2;
            z9 = false;
        } else {
            decorView.setSystemUiVisibility(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH);
            nSTIJKPlayerSkyTv = this.f35878n2;
            z9 = true;
        }
        nSTIJKPlayerSkyTv.setAdjustViewBounds(z9);
    }

    private void d4(int i9, ArrayList arrayList) {
        Object obj;
        ViewOnClickListenerC1494k viewOnClickListenerC1494k;
        NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv;
        Uri uri;
        boolean z9;
        LiveStreamsDBModel liveStreamsDBModel;
        SharedPreferences.Editor editor;
        String strValueOf;
        ViewOnClickListenerC1494k viewOnClickListenerC1494k2;
        NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv2;
        Uri uri2;
        boolean z10;
        LiveStreamsDBModel liveStreamsDBModel2;
        String string;
        JSONObject jSONObject;
        String str;
        String str2;
        String str3;
        String str4;
        SharedPreferences.Editor editor2;
        String strValueOf2;
        try {
            AsyncTask asyncTask = this.f35655D2;
            if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
                this.f35655D2.cancel(true);
            }
            AbstractC2237a.f44480Y = Boolean.TRUE;
            ArrayList arrayListG = this.f35838h4.g();
            if (arrayListG == null || arrayListG.size() <= 0) {
                ArrayList arrayList2 = this.f35660E0;
                if (arrayList2 == null || arrayList2.size() <= 0) {
                    return;
                }
                m7.w.r0(((LiveStreamsDBModel) this.f35660E0.get(i9)).getNum());
                String epgChannelId = ((LiveStreamsDBModel) this.f35660E0.get(i9)).getEpgChannelId();
                String streamIcon = ((LiveStreamsDBModel) this.f35660E0.get(i9)).getStreamIcon();
                String url = ((LiveStreamsDBModel) this.f35660E0.get(i9)).getUrl();
                if (this.f35857k2.equals("m3u")) {
                    if (!this.f35685I1.equals(((LiveStreamsDBModel) this.f35660E0.get(i9)).getUrl())) {
                        this.f35849j1 = this.f35776X2;
                        this.f35878n2.setCurrentWindowIndex(i9);
                        this.f35764V2 = m7.w.r0(((LiveStreamsDBModel) this.f35660E0.get(i9)).getNum());
                        this.f35770W2 = ((LiveStreamsDBModel) this.f35660E0.get(i9)).getCategoryId();
                        ArrayList arrayList3 = this.f35666F0;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                            this.f35666F0.addAll(arrayList);
                        }
                        this.f35878n2.setTitle(((LiveStreamsDBModel) this.f35660E0.get(i9)).getNum() + " - " + ((LiveStreamsDBModel) this.f35660E0.get(i9)).getName());
                        this.f35685I1 = ((LiveStreamsDBModel) this.f35660E0.get(i9)).getUrl();
                        C2966a.f().A(this.f35685I1);
                        if (!this.f35849j1.equals("-1") && !this.f35849j1.equals("0") && !this.f35849j1.equals("-6")) {
                            this.f35849j1 = ((LiveStreamsDBModel) this.f35660E0.get(i9)).getCategoryId();
                            String categoryName = ((LiveStreamsDBModel) this.f35660E0.get(i9)).getCategoryName();
                            this.f35856k1 = categoryName;
                            if (categoryName == null || categoryName.isEmpty()) {
                                this.f35856k1 = n3(this.f35849j1);
                            }
                        }
                        this.f35787Z1 = i9;
                        this.f35878n2.t1();
                        if (this.f35920t2.booleanValue()) {
                            this.f35878n2.x1(Uri.parse(url), f35626G5, ((LiveStreamsDBModel) this.f35660E0.get(i9)).getName());
                            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv3 = this.f35878n2;
                            nSTIJKPlayerSkyTv3.f37226H = 0;
                            nSTIJKPlayerSkyTv3.f37232J = false;
                            nSTIJKPlayerSkyTv3.start();
                        }
                        this.f35745S1.removeCallbacksAndMessages(null);
                        this.f35743S = epgChannelId;
                        this.f35749T = streamIcon;
                        this.f35878n2.setCurrentEpgChannelID(epgChannelId);
                        this.f35878n2.setCurrentChannelLogo(this.f35749T);
                        B4(this.f35749T);
                        this.f35655D2 = new K(this, this.f35743S, null).execute(new String[0]);
                        this.f35739R1.removeCallbacksAndMessages(null);
                        SharedPreferences.Editor editor3 = this.f35697K1;
                        if (editor3 != null) {
                            editor3.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((LiveStreamsDBModel) this.f35660E0.get(i9)).getUrl()));
                            this.f35697K1.apply();
                        }
                        SharedPreferences.Editor editor4 = this.f35703L1;
                        if (editor4 != null) {
                            editor4.putInt("currentlyPlayingVideoPosition", i9);
                            this.f35703L1.apply();
                        }
                        this.f35838h4.notifyDataSetChanged();
                        return;
                    }
                    A3();
                }
                if (this.f35857k2.equals("onestream_api")) {
                    if (!this.f35679H1.equals(((LiveStreamsDBModel) this.f35660E0.get(i9)).getStreamIdOneStream())) {
                        this.f35849j1 = this.f35776X2;
                        this.f35878n2.setCurrentWindowIndex(i9);
                        this.f35764V2 = m7.w.r0(((LiveStreamsDBModel) this.f35660E0.get(i9)).getNum());
                        this.f35770W2 = ((LiveStreamsDBModel) this.f35660E0.get(i9)).getCategoryId();
                        ArrayList arrayList4 = this.f35666F0;
                        if (arrayList4 != null) {
                            arrayList4.clear();
                            this.f35666F0.addAll(arrayList);
                        }
                        this.f35878n2.setTitle(((LiveStreamsDBModel) this.f35660E0.get(i9)).getNum() + " - " + ((LiveStreamsDBModel) this.f35660E0.get(i9)).getName());
                        this.f35679H1 = ((LiveStreamsDBModel) this.f35660E0.get(i9)).getStreamIdOneStream();
                        C2966a.f().A(this.f35679H1);
                        if (!this.f35849j1.equals("-1") && !this.f35849j1.equals("0") && !this.f35849j1.equals("-6")) {
                            this.f35849j1 = ((LiveStreamsDBModel) this.f35660E0.get(i9)).getCategoryId();
                            String categoryName2 = ((LiveStreamsDBModel) this.f35660E0.get(i9)).getCategoryName();
                            this.f35856k1 = categoryName2;
                            if (categoryName2.isEmpty()) {
                                this.f35856k1 = n3(this.f35849j1);
                            }
                        }
                        this.f35787Z1 = i9;
                        this.f35878n2.t1();
                        if (this.f35920t2.booleanValue()) {
                            this.f35878n2.x1(Uri.parse(this.f35903r + m7.w.q0(((LiveStreamsDBModel) this.f35660E0.get(i9)).getStreamId()) + this.f35904r0), f35626G5, ((LiveStreamsDBModel) this.f35660E0.get(i9)).getName());
                            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv4 = this.f35878n2;
                            nSTIJKPlayerSkyTv4.f37226H = 0;
                            nSTIJKPlayerSkyTv4.f37232J = false;
                            nSTIJKPlayerSkyTv4.start();
                        }
                        this.f35745S1.removeCallbacksAndMessages(null);
                        this.f35743S = epgChannelId;
                        this.f35749T = streamIcon;
                        this.f35878n2.setCurrentEpgChannelID(epgChannelId);
                        this.f35878n2.setCurrentChannelLogo(this.f35749T);
                        B4(this.f35749T);
                        this.f35655D2 = new K(this, this.f35743S, null).execute(new String[0]);
                        this.f35739R1.removeCallbacksAndMessages(null);
                        if (this.f35697K1 != null) {
                            if (this.f35857k2.equals("onestream_api")) {
                                editor = this.f35697K1;
                                strValueOf = ((LiveStreamsDBModel) this.f35660E0.get(i9)).getStreamIdOneStream();
                            } else {
                                editor = this.f35697K1;
                                strValueOf = String.valueOf(((LiveStreamsDBModel) this.f35660E0.get(i9)).getStreamId());
                            }
                            editor.putString("currentlyPlayingVideo", strValueOf);
                            this.f35697K1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((LiveStreamsDBModel) this.f35660E0.get(i9)).getUrl()));
                            this.f35697K1.apply();
                        }
                        SharedPreferences.Editor editor5 = this.f35703L1;
                        if (editor5 != null) {
                            editor5.putInt("currentlyPlayingVideoPosition", i9);
                            this.f35703L1.apply();
                        }
                        this.f35838h4.notifyDataSetChanged();
                        return;
                    }
                    A3();
                }
                if (this.f35673G1 != m7.w.q0(((LiveStreamsDBModel) this.f35660E0.get(i9)).getStreamId())) {
                    this.f35849j1 = this.f35776X2;
                    this.f35878n2.setCurrentWindowIndex(i9);
                    this.f35764V2 = m7.w.r0(((LiveStreamsDBModel) this.f35660E0.get(i9)).getNum());
                    this.f35770W2 = ((LiveStreamsDBModel) this.f35660E0.get(i9)).getCategoryId();
                    ArrayList arrayList5 = this.f35666F0;
                    if (arrayList5 != null) {
                        arrayList5.clear();
                        this.f35666F0.addAll(arrayList);
                    }
                    this.f35878n2.setTitle(((LiveStreamsDBModel) this.f35660E0.get(i9)).getNum() + " - " + ((LiveStreamsDBModel) this.f35660E0.get(i9)).getName());
                    this.f35673G1 = m7.w.q0(((LiveStreamsDBModel) this.f35660E0.get(i9)).getStreamId());
                    C2966a.f().A(String.valueOf(this.f35673G1));
                    if (!this.f35849j1.equals("-1") && !this.f35849j1.equals("0") && !this.f35849j1.equals("-6")) {
                        this.f35849j1 = ((LiveStreamsDBModel) this.f35660E0.get(i9)).getCategoryId();
                        String categoryName3 = ((LiveStreamsDBModel) this.f35660E0.get(i9)).getCategoryName();
                        this.f35856k1 = categoryName3;
                        if (categoryName3 == null || categoryName3.isEmpty()) {
                            this.f35856k1 = n3(this.f35849j1);
                        }
                    }
                    this.f35787Z1 = i9;
                    this.f35878n2.t1();
                    if (this.f35920t2.booleanValue()) {
                        obj = "stalker_api";
                        if (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals(obj)) {
                            nSTIJKPlayerSkyTv = this.f35878n2;
                            uri = Uri.parse(this.f35840i);
                            z9 = f35626G5;
                            liveStreamsDBModel = (LiveStreamsDBModel) this.f35660E0.get(i9);
                        } else {
                            nSTIJKPlayerSkyTv = this.f35878n2;
                            uri = Uri.parse(this.f35903r + m7.w.q0(((LiveStreamsDBModel) this.f35660E0.get(i9)).getStreamId()) + this.f35904r0);
                            z9 = f35626G5;
                            liveStreamsDBModel = (LiveStreamsDBModel) this.f35660E0.get(i9);
                        }
                        nSTIJKPlayerSkyTv.x1(uri, z9, liveStreamsDBModel.getName());
                        NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv5 = this.f35878n2;
                        nSTIJKPlayerSkyTv5.f37226H = 0;
                        nSTIJKPlayerSkyTv5.f37232J = false;
                        nSTIJKPlayerSkyTv5.start();
                    } else {
                        obj = "stalker_api";
                    }
                    this.f35745S1.removeCallbacksAndMessages(null);
                    this.f35743S = epgChannelId;
                    this.f35749T = streamIcon;
                    this.f35878n2.setCurrentEpgChannelID(epgChannelId);
                    this.f35878n2.setCurrentChannelLogo(this.f35749T);
                    B4(this.f35749T);
                    if (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals(obj)) {
                        C4(((LiveStreamsDBModel) this.f35660E0.get(i9)).getStreamId());
                        viewOnClickListenerC1494k = null;
                    } else {
                        viewOnClickListenerC1494k = null;
                        this.f35655D2 = new K(this, this.f35743S, viewOnClickListenerC1494k).execute(new String[0]);
                    }
                    this.f35739R1.removeCallbacksAndMessages(viewOnClickListenerC1494k);
                    SharedPreferences.Editor editor6 = this.f35697K1;
                    if (editor6 != null) {
                        editor6.putString("currentlyPlayingVideo", String.valueOf(((LiveStreamsDBModel) this.f35660E0.get(i9)).getStreamId()));
                        this.f35697K1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((LiveStreamsDBModel) this.f35660E0.get(i9)).getUrl()));
                        this.f35697K1.apply();
                    }
                    SharedPreferences.Editor editor7 = this.f35703L1;
                    if (editor7 != null) {
                        editor7.putInt("currentlyPlayingVideoPosition", i9);
                        this.f35703L1.apply();
                    }
                    this.f35838h4.notifyDataSetChanged();
                    return;
                }
                A3();
            }
            int iR0 = m7.w.r0(((LiveStreamsDBModel) arrayListG.get(i9)).getNum());
            String epgChannelId2 = ((LiveStreamsDBModel) arrayListG.get(i9)).getEpgChannelId();
            G3(this.f35660E0, iR0);
            String url2 = ((LiveStreamsDBModel) arrayListG.get(i9)).getUrl();
            String str5 = "";
            if (this.f35857k2.equals("m3u")) {
                if (!this.f35685I1.equals(((LiveStreamsDBModel) arrayListG.get(i9)).getUrl())) {
                    this.f35849j1 = this.f35776X2;
                    this.f35878n2.setCurrentWindowIndex(i9);
                    this.f35764V2 = m7.w.r0(((LiveStreamsDBModel) arrayListG.get(i9)).getNum());
                    this.f35770W2 = ((LiveStreamsDBModel) arrayListG.get(i9)).getCategoryId();
                    ArrayList arrayList6 = this.f35666F0;
                    if (arrayList6 != null) {
                        arrayList6.clear();
                        this.f35666F0.addAll(arrayList);
                    }
                    this.f35878n2.setTitle(((LiveStreamsDBModel) arrayListG.get(i9)).getNum() + " - " + ((LiveStreamsDBModel) arrayListG.get(i9)).getName());
                    this.f35685I1 = ((LiveStreamsDBModel) arrayListG.get(i9)).getUrl();
                    C2966a.f().A(this.f35685I1);
                    if (!this.f35849j1.equals("-1") && !this.f35849j1.equals("0") && !this.f35849j1.equals("-6")) {
                        this.f35849j1 = ((LiveStreamsDBModel) arrayListG.get(i9)).getCategoryId();
                        String categoryName4 = ((LiveStreamsDBModel) arrayListG.get(i9)).getCategoryName();
                        this.f35856k1 = categoryName4;
                        if (categoryName4 == null || categoryName4.isEmpty()) {
                            this.f35856k1 = n3(this.f35849j1);
                        }
                    }
                    String streamIcon2 = ((LiveStreamsDBModel) arrayListG.get(i9)).getStreamIcon();
                    try {
                        if (streamIcon2.equals("") || streamIcon2.isEmpty()) {
                            this.f35645C.setImageDrawable(this.f35806d.getResources().getDrawable(a7.e.f12016i1));
                        } else {
                            com.squareup.picasso.t.q(this.f35806d).l(streamIcon2).j(a7.e.f12016i1).d(a7.e.f12016i1).g(this.f35645C);
                        }
                    } catch (Exception unused) {
                        this.f35645C.setImageDrawable(this.f35806d.getResources().getDrawable(a7.e.f12016i1));
                    }
                    this.f35745S1.removeCallbacksAndMessages(null);
                    this.f35743S = epgChannelId2;
                    this.f35749T = streamIcon2;
                    this.f35878n2.setCurrentEpgChannelID(epgChannelId2);
                    this.f35878n2.setCurrentChannelLogo(this.f35749T);
                    B4(this.f35749T);
                    this.f35655D2 = new K(this, this.f35743S, null).execute(new String[0]);
                    this.f35739R1.removeCallbacksAndMessages(null);
                    this.f35787Z1 = i9;
                    this.f35878n2.t1();
                    if (this.f35920t2.booleanValue()) {
                        this.f35878n2.x1(Uri.parse(url2), f35626G5, ((LiveStreamsDBModel) arrayListG.get(i9)).getName());
                        NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv6 = this.f35878n2;
                        nSTIJKPlayerSkyTv6.f37226H = 0;
                        nSTIJKPlayerSkyTv6.f37232J = false;
                        nSTIJKPlayerSkyTv6.start();
                    }
                    SharedPreferences.Editor editor8 = this.f35697K1;
                    if (editor8 != null) {
                        editor8.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((LiveStreamsDBModel) arrayListG.get(i9)).getUrl()));
                        this.f35697K1.apply();
                    }
                    SharedPreferences.Editor editor9 = this.f35703L1;
                    if (editor9 != null) {
                        editor9.putInt("currentlyPlayingVideoPosition", i9);
                        this.f35703L1.apply();
                    }
                    this.f35838h4.notifyDataSetChanged();
                    return;
                }
                A3();
            }
            if (!this.f35857k2.equals("onestream_api")) {
                if (this.f35673G1 != m7.w.q0(((LiveStreamsDBModel) arrayListG.get(i9)).getStreamId())) {
                    this.f35849j1 = this.f35776X2;
                    this.f35878n2.setCurrentWindowIndex(i9);
                    this.f35764V2 = m7.w.r0(((LiveStreamsDBModel) arrayListG.get(i9)).getNum());
                    this.f35770W2 = ((LiveStreamsDBModel) arrayListG.get(i9)).getCategoryId();
                    ArrayList arrayList7 = this.f35666F0;
                    if (arrayList7 != null) {
                        arrayList7.clear();
                        this.f35666F0.addAll(arrayList);
                    }
                    this.f35878n2.setTitle(((LiveStreamsDBModel) arrayListG.get(i9)).getNum() + " - " + ((LiveStreamsDBModel) arrayListG.get(i9)).getName());
                    this.f35673G1 = m7.w.q0(((LiveStreamsDBModel) arrayListG.get(i9)).getStreamId());
                    C2966a.f().A(String.valueOf(this.f35673G1));
                    if (!this.f35849j1.equals("-1") && !this.f35849j1.equals("0") && !this.f35849j1.equals("-6")) {
                        this.f35849j1 = ((LiveStreamsDBModel) arrayListG.get(i9)).getCategoryId();
                        String categoryName5 = ((LiveStreamsDBModel) arrayListG.get(i9)).getCategoryName();
                        this.f35856k1 = categoryName5;
                        if (categoryName5 == null || categoryName5.isEmpty()) {
                            this.f35856k1 = n3(this.f35849j1);
                        }
                    }
                    String streamIcon3 = ((LiveStreamsDBModel) arrayListG.get(i9)).getStreamIcon();
                    try {
                        if (streamIcon3.equals("") || streamIcon3.isEmpty()) {
                            this.f35645C.setImageDrawable(this.f35806d.getResources().getDrawable(a7.e.f12016i1));
                        } else {
                            com.squareup.picasso.t.q(this.f35806d).l(streamIcon3).j(a7.e.f12016i1).d(a7.e.f12016i1).g(this.f35645C);
                        }
                    } catch (Exception unused2) {
                        this.f35645C.setImageDrawable(this.f35806d.getResources().getDrawable(a7.e.f12016i1));
                    }
                    this.f35745S1.removeCallbacksAndMessages(null);
                    this.f35743S = epgChannelId2;
                    this.f35749T = streamIcon3;
                    this.f35878n2.setCurrentEpgChannelID(epgChannelId2);
                    this.f35878n2.setCurrentChannelLogo(this.f35749T);
                    B4(this.f35749T);
                    if (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("stalker_api")) {
                        C4(((LiveStreamsDBModel) arrayListG.get(i9)).getStreamId());
                        viewOnClickListenerC1494k2 = null;
                    } else {
                        viewOnClickListenerC1494k2 = null;
                        this.f35655D2 = new K(this, this.f35743S, viewOnClickListenerC1494k2).execute(new String[0]);
                    }
                    this.f35739R1.removeCallbacksAndMessages(viewOnClickListenerC1494k2);
                    this.f35787Z1 = i9;
                    this.f35878n2.t1();
                    if (this.f35920t2.booleanValue()) {
                        if (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("stalker_api")) {
                            nSTIJKPlayerSkyTv2 = this.f35878n2;
                            uri2 = Uri.parse(this.f35840i);
                            z10 = f35626G5;
                            liveStreamsDBModel2 = (LiveStreamsDBModel) arrayListG.get(i9);
                        } else {
                            nSTIJKPlayerSkyTv2 = this.f35878n2;
                            uri2 = Uri.parse(this.f35903r + m7.w.q0(((LiveStreamsDBModel) arrayListG.get(i9)).getStreamId()) + this.f35904r0);
                            z10 = f35626G5;
                            liveStreamsDBModel2 = (LiveStreamsDBModel) arrayListG.get(i9);
                        }
                        nSTIJKPlayerSkyTv2.x1(uri2, z10, liveStreamsDBModel2.getName());
                        NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv7 = this.f35878n2;
                        nSTIJKPlayerSkyTv7.f37226H = 0;
                        nSTIJKPlayerSkyTv7.f37232J = false;
                        nSTIJKPlayerSkyTv7.start();
                    }
                    SharedPreferences.Editor editor10 = this.f35697K1;
                    if (editor10 != null) {
                        editor10.putString("currentlyPlayingVideo", String.valueOf(((LiveStreamsDBModel) arrayListG.get(i9)).getStreamId()));
                        this.f35697K1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((LiveStreamsDBModel) arrayListG.get(i9)).getUrl()));
                        this.f35697K1.apply();
                    }
                    SharedPreferences.Editor editor11 = this.f35703L1;
                    if (editor11 != null) {
                        editor11.putInt("currentlyPlayingVideoPosition", i9);
                        this.f35703L1.apply();
                    }
                    this.f35838h4.notifyDataSetChanged();
                    return;
                }
                A3();
            }
            if (!this.f35679H1.equals(((LiveStreamsDBModel) arrayListG.get(i9)).getStreamIdOneStream())) {
                this.f35849j1 = this.f35776X2;
                this.f35878n2.setCurrentWindowIndex(i9);
                this.f35764V2 = m7.w.r0(((LiveStreamsDBModel) arrayListG.get(i9)).getNum());
                this.f35770W2 = ((LiveStreamsDBModel) arrayListG.get(i9)).getCategoryId();
                ArrayList arrayList8 = this.f35666F0;
                if (arrayList8 != null) {
                    arrayList8.clear();
                    this.f35666F0.addAll(arrayList);
                }
                this.f35878n2.setTitle(((LiveStreamsDBModel) arrayListG.get(i9)).getNum() + " - " + ((LiveStreamsDBModel) arrayListG.get(i9)).getName());
                this.f35679H1 = ((LiveStreamsDBModel) arrayListG.get(i9)).getStreamIdOneStream();
                C2966a.f().A(this.f35679H1);
                if (!this.f35849j1.equals("-1") && !this.f35849j1.equals("0") && !this.f35849j1.equals("-6")) {
                    this.f35849j1 = ((LiveStreamsDBModel) arrayListG.get(i9)).getCategoryId();
                    String categoryName6 = ((LiveStreamsDBModel) arrayListG.get(i9)).getCategoryName();
                    this.f35856k1 = categoryName6;
                    if (categoryName6.isEmpty()) {
                        this.f35856k1 = n3(this.f35849j1);
                    }
                }
                ((LiveStreamsDBModel) arrayListG.get(i9)).getStreamIdOneStream();
                String streamIcon4 = ((LiveStreamsDBModel) arrayListG.get(i9)).getStreamIcon();
                try {
                    if (streamIcon4.equals("") || streamIcon4.isEmpty()) {
                        this.f35645C.setImageDrawable(this.f35806d.getResources().getDrawable(a7.e.f12016i1));
                    } else {
                        com.squareup.picasso.t.q(this.f35806d).l(streamIcon4).j(a7.e.f12016i1).d(a7.e.f12016i1).g(this.f35645C);
                    }
                } catch (Exception unused3) {
                    this.f35645C.setImageDrawable(this.f35806d.getResources().getDrawable(a7.e.f12016i1));
                }
                this.f35745S1.removeCallbacksAndMessages(null);
                this.f35743S = epgChannelId2;
                this.f35749T = streamIcon4;
                this.f35878n2.setCurrentEpgChannelID(epgChannelId2);
                this.f35878n2.setCurrentChannelLogo(this.f35749T);
                B4(this.f35749T);
                this.f35655D2 = new K(this, this.f35743S, null).execute(new String[0]);
                this.f35739R1.removeCallbacksAndMessages(null);
                this.f35787Z1 = i9;
                this.f35878n2.t1();
                if (this.f35920t2.booleanValue()) {
                    try {
                        jSONObject = new JSONObject(((LiveStreamsDBModel) arrayListG.get(i9)).getUrl());
                        String str6 = this.f35904r0;
                        str = "m3u8";
                        str2 = "ts";
                        if (str6 == null || str6.isEmpty() || !this.f35904r0.equals(".ts")) {
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
                        try {
                            str4 = this.f35904r0;
                        } catch (Exception unused4) {
                            str5 = string;
                            string = str5;
                        }
                    } catch (Exception unused5) {
                    }
                    if (str4 != null && !str4.isEmpty() && this.f35904r0.equals(".m3u8")) {
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
                        this.f35838h4.notifyDataSetChanged();
                        return;
                    }
                    this.f35878n2.x1(Uri.parse(string), f35626G5, ((LiveStreamsDBModel) arrayListG.get(i9)).getName());
                    NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv8 = this.f35878n2;
                    nSTIJKPlayerSkyTv8.f37226H = 0;
                    nSTIJKPlayerSkyTv8.f37232J = false;
                    nSTIJKPlayerSkyTv8.start();
                }
                if (this.f35697K1 != null) {
                    if (this.f35857k2.equals("onestream_api")) {
                        editor2 = this.f35697K1;
                        strValueOf2 = ((LiveStreamsDBModel) arrayListG.get(i9)).getStreamIdOneStream();
                    } else {
                        editor2 = this.f35697K1;
                        strValueOf2 = String.valueOf(((LiveStreamsDBModel) arrayListG.get(i9)).getStreamId());
                    }
                    editor2.putString("currentlyPlayingVideo", strValueOf2);
                    this.f35697K1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((LiveStreamsDBModel) arrayListG.get(i9)).getUrl()));
                    this.f35697K1.apply();
                }
                SharedPreferences.Editor editor12 = this.f35703L1;
                if (editor12 != null) {
                    editor12.putInt("currentlyPlayingVideoPosition", i9);
                    this.f35703L1.apply();
                }
                this.f35838h4.notifyDataSetChanged();
                return;
            }
            A3();
        } catch (Exception unused6) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(16:417|255|(1:282)(9:261|(2:262|(2:264|(2:455|266)(1:267))(2:454|270))|415|271|(5:(3:275|(2:457|277)(1:278)|273)|456|279|280|281)(3:279|280|281)|371|(2:373|(2:374|(1:442)(2:376|(2:443|378)(1:379))))(0)|380|(2:387|(2:394|(2:401|402)(2:400|466))(2:393|465))(2:386|464))|421|283|(2:305|306)(3:287|(5:289|(2:290|(2:292|(2:459|294)(1:460))(2:458|295))|296|(1:(2:298|(1:461)(2:300|(2:462|302)(1:463))))(0)|303)(0)|306)|371|(0)(0)|380|(1:382)|387|(1:389)|394|(1:396)|401|402) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:425|83)|(1:109)(14:89|(2:90|(2:92|(2:445|94)(1:95))(2:444|97))|98|(4:(3:102|(2:447|104)(1:105)|100)|446|106|107)(2:106|107)|371|(0)(0)|380|(0)|387|(0)|394|(0)|401|402)|423|110|(1:136)(6:114|115|436|116|(14:118|(2:119|(2:121|(2:449|123)(1:450))(2:448|124))|125|(4:(3:129|(2:452|131)(1:453)|127)|451|132|133)(2:132|133)|371|(0)(0)|380|(0)|387|(0)|394|(0)|401|402)|138)|137|138) */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0b9e  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0e9d  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0ec4  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0eda  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0ef0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e4(int r27, java.util.ArrayList r28) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 3846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.e4(int, java.util.ArrayList):void");
    }

    private void f4() {
        EditText editText = this.f35717N3;
        if (editText != null) {
            editText.addTextChangedListener(new r());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g4(ArrayList arrayList) {
        C2966a c2966aF;
        String strValueOf;
        String string;
        NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv;
        String str;
        String str2;
        String str3;
        SharedPreferences.Editor editor;
        String strValueOf2;
        String str4 = "";
        if (arrayList == null || arrayList.size() <= 0 || this.f35787Z1 >= arrayList.size()) {
            return;
        }
        int iR0 = m7.w.r0(((LiveStreamsDBModel) arrayList.get(this.f35787Z1)).getNum());
        this.f35764V2 = iR0;
        this.f35770W2 = ((LiveStreamsDBModel) arrayList.get(this.f35787Z1)).getCategoryId();
        int i9 = this.f35787Z1;
        this.f35674G2 = i9;
        String name = ((LiveStreamsDBModel) arrayList.get(i9)).getName();
        String streamIdOneStream = ((LiveStreamsDBModel) arrayList.get(this.f35787Z1)).getStreamIdOneStream();
        int iQ0 = m7.w.q0(((LiveStreamsDBModel) arrayList.get(this.f35787Z1)).getStreamId());
        String epgChannelId = ((LiveStreamsDBModel) arrayList.get(this.f35787Z1)).getEpgChannelId();
        String streamIcon = ((LiveStreamsDBModel) arrayList.get(this.f35787Z1)).getStreamIcon();
        ((LiveStreamsDBModel) arrayList.get(this.f35787Z1)).getNum();
        this.f35864l2 = ((LiveStreamsDBModel) arrayList.get(this.f35787Z1)).getUrl();
        String strS0 = m7.w.S0(k.a() + k.i());
        this.f35853j5 = ((LiveStreamsDBModel) arrayList.get(this.f35787Z1)).getCategoryId();
        this.f35874m5 = ((LiveStreamsDBModel) arrayList.get(this.f35787Z1)).getName();
        try {
            if (streamIcon.equals("") || streamIcon.isEmpty()) {
                this.f35645C.setImageDrawable(this.f35806d.getResources().getDrawable(a7.e.f12016i1));
            } else {
                com.squareup.picasso.t.q(this.f35806d).l(streamIcon).j(a7.e.f12016i1).d(a7.e.f12016i1).g(this.f35645C);
            }
        } catch (Exception unused) {
            this.f35645C.setImageDrawable(this.f35806d.getResources().getDrawable(a7.e.f12016i1));
        }
        this.f35878n2.setCurrentWindowIndex(this.f35787Z1);
        if (this.f35697K1 != null) {
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("onestream_api")) {
                editor = this.f35697K1;
                strValueOf2 = ((LiveStreamsDBModel) arrayList.get(this.f35787Z1)).getStreamIdOneStream();
            } else {
                editor = this.f35697K1;
                strValueOf2 = String.valueOf(((LiveStreamsDBModel) arrayList.get(this.f35787Z1)).getStreamId());
            }
            editor.putString("currentlyPlayingVideo", strValueOf2);
            this.f35697K1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((LiveStreamsDBModel) arrayList.get(this.f35787Z1)).getUrl()));
            this.f35697K1.apply();
        }
        SharedPreferences.Editor editor2 = this.f35703L1;
        if (editor2 != null) {
            editor2.putInt("currentlyPlayingVideoPosition", this.f35787Z1);
            this.f35703L1.apply();
        }
        SimpleDateFormat simpleDateFormat = this.f35871m2;
        if (v3(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(this.f35806d))), this.f35843i2.format(this.f35885o2)) >= C2939c.p() && (str2 = this.f35961z1) != null && this.f35891p1 != null && (!f35627H5.equals(str2) || (this.f35961z1 != null && (str3 = this.f35891p1) != null && !f35628I5.equals(str3)))) {
            this.f35920t2 = Boolean.FALSE;
            this.f35878n2.setVisibility(8);
            this.f35631A.setVisibility(0);
            this.f35638B.setText(strS0 + this.f35938w + this.f35715N1);
        }
        this.f35673G1 = iQ0;
        this.f35679H1 = streamIdOneStream;
        this.f35667F1 = epgChannelId;
        this.f35685I1 = this.f35864l2;
        if (this.f35857k2.equals("m3u")) {
            c2966aF = C2966a.f();
            strValueOf = this.f35685I1;
        } else if (this.f35857k2.equals("onestream_api")) {
            c2966aF = C2966a.f();
            strValueOf = this.f35679H1;
        } else {
            c2966aF = C2966a.f();
            strValueOf = String.valueOf(this.f35673G1);
        }
        c2966aF.A(strValueOf);
        this.f35878n2.setTitle(iR0 + " - " + name);
        this.f35878n2.t1();
        if (!f35626G5) {
            if (this.f35878n2.getFullScreenValue().booleanValue()) {
                f35626G5 = this.f35878n2.getFullScreenValue().booleanValue();
            } else {
                f35626G5 = false;
            }
        }
        if (this.f35920t2.booleanValue()) {
            if (this.f35857k2.equals("m3u")) {
                nSTIJKPlayerSkyTv = this.f35878n2;
                string = this.f35864l2;
            } else if (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("stalker_api")) {
                nSTIJKPlayerSkyTv = this.f35878n2;
                string = this.f35840i;
            } else if (this.f35857k2.equals("onestream_api")) {
                try {
                    JSONObject jSONObject = new JSONObject(this.f35864l2);
                    String str5 = this.f35904r0;
                    String str6 = "m3u8";
                    String str7 = "ts";
                    if (str5 == null || str5.isEmpty() || !this.f35904r0.equals(".ts")) {
                        string = "";
                        str = string;
                    } else {
                        Iterator<String> itKeys = jSONObject.keys();
                        while (true) {
                            if (!itKeys.hasNext()) {
                                str = "";
                                break;
                            } else if (itKeys.next().equals("ts")) {
                                str = "ts";
                                break;
                            }
                        }
                        if (str.equals("")) {
                            while (true) {
                                if (!itKeys.hasNext()) {
                                    break;
                                } else if (itKeys.next().equals("m3u8")) {
                                    str = "m3u8";
                                    break;
                                }
                            }
                        }
                        string = jSONObject.getString(str);
                    }
                    try {
                        String str8 = this.f35904r0;
                        if (str8 != null && !str8.isEmpty() && this.f35904r0.equals(".m3u8")) {
                            Iterator<String> itKeys2 = jSONObject.keys();
                            while (true) {
                                if (!itKeys2.hasNext()) {
                                    str6 = str;
                                    break;
                                } else if (itKeys2.next().equals("m3u8")) {
                                    break;
                                }
                            }
                            if (str6.equals("")) {
                                while (itKeys2.hasNext()) {
                                    if (itKeys2.next().equals("ts")) {
                                        break;
                                    }
                                }
                                str7 = str6;
                                string = jSONObject.getString(str7);
                            } else {
                                str7 = str6;
                                string = jSONObject.getString(str7);
                            }
                        }
                    } catch (Exception unused2) {
                        str4 = string;
                        string = str4;
                    }
                } catch (Exception unused3) {
                }
                nSTIJKPlayerSkyTv = this.f35878n2;
            } else {
                nSTIJKPlayerSkyTv = this.f35878n2;
                string = this.f35903r + iQ0 + this.f35904r0;
            }
            nSTIJKPlayerSkyTv.x1(Uri.parse(string), f35626G5, name);
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv2 = this.f35878n2;
            nSTIJKPlayerSkyTv2.f37226H = 0;
            nSTIJKPlayerSkyTv2.f37232J = false;
            nSTIJKPlayerSkyTv2.start();
        }
        ViewOnClickListenerC1494k viewOnClickListenerC1494k = null;
        this.f35745S1.removeCallbacksAndMessages(null);
        this.f35743S = epgChannelId;
        this.f35749T = streamIcon;
        this.f35878n2.setCurrentEpgChannelID(epgChannelId);
        this.f35878n2.setCurrentChannelLogo(this.f35749T);
        B4(this.f35749T);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("stalker_api")) {
            C4(String.valueOf(this.f35673G1));
        } else {
            this.f35655D2 = new K(this, this.f35743S, viewOnClickListenerC1494k).execute(new String[0]);
        }
        this.f35815e2 = Boolean.TRUE;
    }

    private void h4() {
        int currentWindowIndex = this.f35878n2.getCurrentWindowIndex();
        if (currentWindowIndex == 0) {
            this.f35878n2.setCurrentWindowIndex(this.f35666F0.size() - 1);
        } else {
            this.f35878n2.setCurrentWindowIndex(currentWindowIndex - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j4(int i9, String str) {
        try {
            List<Integer> favIdsList = StalkerLiveFavIdsSingleton.getInstance().getFavIdsList();
            this.f35861l = favIdsList;
            if (favIdsList == null) {
                m7.w.X();
                return;
            }
            favIdsList.remove(Integer.valueOf(i9));
            StringBuilder sb = new StringBuilder();
            for (int i10 = 0; i10 < this.f35861l.size(); i10++) {
                sb.append(this.f35861l.get(i10));
                sb.append(",");
            }
            this.f35861l.add(Integer.valueOf(i9));
            String strSubstring = sb.toString().contains(",") ? sb.substring(0, sb.lastIndexOf(",")) : sb.toString();
            this.f35889p = i9;
            this.f35868m.c(SharepreferenceDBHandler.getLoggedInMacAddress(this.f35806d), SharepreferenceDBHandler.getStalkerToken(this.f35806d), null, strSubstring, "removed", str);
        } catch (Exception unused) {
            m7.w.X();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3(int i9) {
        this.f35878n2.f37273a1 = new t();
        NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = this.f35878n2;
        nSTIJKPlayerSkyTv.f37271Z0.postDelayed(nSTIJKPlayerSkyTv.f37273a1, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l4(String str, String str2, int i9) {
        new O(str, i9).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p4(String str, boolean z9) {
        String str2;
        String str3;
        RecyclerView recyclerView;
        LinearLayoutManager linearLayoutManager;
        if (z9 && this.f35900q3.getVisibility() == 0) {
            this.f35900q3.startAnimation(this.f35799b4);
            this.f35900q3.setVisibility(8);
        }
        this.f35887o4 = str;
        if (str.equals("player")) {
            this.f35699K3.startAnimation(this.f35873m4);
            this.f35699K3.setVisibility(0);
        }
        String str4 = this.f35915s4;
        if ((str4 != null && str4.equals("-1")) || (((str2 = this.f35915s4) != null && str2.equals("0")) || ((str3 = this.f35915s4) != null && str3.equals("-6")))) {
            String str5 = this.f35915s4;
            this.f35770W2 = str5;
            this.f35776X2 = str5;
        }
        if (this.f35887o4.equals("player")) {
            q7.N n9 = new q7.N(this.f35806d, this.f35770W2, this.f35887o4, this.f35901q4, this.f35894p4);
            this.f35831g4 = n9;
            this.f35776X2 = this.f35770W2;
            this.f35711M3.setAdapter(n9);
            recyclerView = this.f35711M3;
            linearLayoutManager = this.f35859k4;
        } else {
            q7.N n10 = new q7.N(this.f35806d, this.f35770W2, this.f35887o4, this.f35901q4, this.f35894p4);
            this.f35824f4 = n10;
            this.f35776X2 = this.f35770W2;
            this.f35705L3.setAdapter(n10);
            recyclerView = this.f35705L3;
            linearLayoutManager = this.f35852j4;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        h3(z9);
    }

    private void q3() {
        AsyncTask asyncTask = this.f35641B2;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            SharepreferenceDBHandler.setAsyncTaskStatus(0, this.f35806d);
        } else {
            SharepreferenceDBHandler.setAsyncTaskStatus(1, this.f35806d);
            this.f35641B2.cancel(true);
        }
    }

    private void q4() {
        try {
            new DialogC1495l(this).show();
        } catch (Exception unused) {
        }
    }

    public static boolean r3() {
        ProgressBar progressBar = f35630K5;
        return progressBar != null && progressBar.getVisibility() == 0;
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
    public java.util.HashMap r4(java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.r4(java.lang.String):java.util.HashMap");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3() {
        EditText editText = this.f35717N3;
        if (editText != null) {
            editText.setText("");
            this.f35717N3.clearFocus();
        }
    }

    private HashMap s4(StalkerShortEPGCallback stalkerShortEPGCallback) {
        int i9;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        HashMap map = new HashMap();
        if (this.f35827g0 != null) {
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
                int iM = m7.w.M(j9, j10, this.f35806d);
                if (iM != 0) {
                    int i10 = 100 - iM;
                    if (i10 == 0 || name == null || name.equals("")) {
                        i9 = i10;
                    } else {
                        arrayList4.add(0, String.valueOf(i10));
                        StringBuilder sb = new StringBuilder();
                        i9 = i10;
                        sb.append(this.f35806d.getResources().getString(a7.j.f13058L4));
                        sb.append(" ");
                        sb.append(name);
                        arrayList.add(0, sb.toString());
                        arrayList.add(1, this.f35897q0.format(lValueOf) + " - " + this.f35897q0.format(lValueOf2));
                        arrayList.add(2, descr);
                    }
                    iM = i9;
                }
                arrayList2.add(0, this.f35897q0.format(lValueOf) + " - " + this.f35897q0.format(lValueOf2));
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
                        arrayList.add(3, this.f35806d.getResources().getString(a7.j.f13201a4) + " " + name2);
                        arrayList.add(4, this.f35897q0.format(lValueOf3) + " - " + this.f35897q0.format(lValueOf4));
                        arrayList.add(5, descr2);
                    }
                    arrayList2.add(3, this.f35897q0.format(lValueOf3) + " - " + this.f35897q0.format(lValueOf4));
                    arrayList2.add(4, name2);
                    arrayList2.add(5, descr2);
                }
                if (2 < stalkerShortEPGCallback.getJs().size()) {
                    long jIntValue5 = stalkerShortEPGCallback.getJs().get(2).getStartTimestamp().intValue();
                    long jIntValue6 = stalkerShortEPGCallback.getJs().get(2).getStopTimestamp().intValue();
                    String name3 = stalkerShortEPGCallback.getJs().get(2).getName();
                    String descr3 = stalkerShortEPGCallback.getJs().get(2).getDescr();
                    arrayList2.add(6, this.f35897q0.format(Long.valueOf(jIntValue5 * 1000)) + " - " + this.f35897q0.format(Long.valueOf(jIntValue6 * 1000)));
                    arrayList2.add(7, name3);
                    arrayList2.add(8, descr3);
                }
                if (3 < stalkerShortEPGCallback.getJs().size()) {
                    long jIntValue7 = stalkerShortEPGCallback.getJs().get(3).getStartTimestamp().intValue();
                    long jIntValue8 = stalkerShortEPGCallback.getJs().get(3).getStopTimestamp().intValue();
                    String name4 = stalkerShortEPGCallback.getJs().get(3).getName();
                    String descr4 = stalkerShortEPGCallback.getJs().get(3).getDescr();
                    arrayList2.add(9, this.f35897q0.format(Long.valueOf(jIntValue7 * 1000)) + " - " + this.f35897q0.format(Long.valueOf(jIntValue8 * 1000)));
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

    /* JADX INFO: Access modifiers changed from: private */
    public void t3() {
        try {
            SearchView searchView = this.f35756U0;
            if (searchView == null || this.f35836h2 == null) {
                return;
            }
            searchView.d0("", false);
            this.f35836h2.collapseActionView();
        } catch (Exception unused) {
        }
    }

    private void u1() {
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f35841i0 = sharedPreferences;
        String liveStreamCategoryName = "";
        this.f35860k5 = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        String str = new SimpleDateFormat("yyyy-MM").format(new Date());
        String strO0 = m7.w.o0(AbstractC2237a.f44469S0 + "*Njh0&$@HAH828283636JSJSHS*" + AbstractC1232b.f17695b + "*" + str);
        if (this.f35853j5.equalsIgnoreCase("")) {
            liveStreamCategoryName = "UnCategories";
        } else {
            LiveStreamCategoryIdDBModel channelCatNameFromSelectedCatId = this.f35827g0.getChannelCatNameFromSelectedCatId(this.f35853j5);
            if (channelCatNameFromSelectedCatId != null) {
                liveStreamCategoryName = channelCatNameFromSelectedCatId.getLiveStreamCategoryName();
            }
        }
        Retrofit retrofitE0 = m7.w.E0(this.f35806d);
        if (retrofitE0 != null) {
            RetrofitPost retrofitPost = (RetrofitPost) retrofitE0.create(RetrofitPost.class);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("a", AbstractC2237a.f44469S0);
            jsonObject.addProperty("s", AbstractC2237a.f44471T0);
            jsonObject.addProperty("r", AbstractC1232b.f17695b);
            jsonObject.addProperty("d", str);
            jsonObject.addProperty("sc", strO0);
            jsonObject.addProperty("action", "addreport");
            jsonObject.addProperty(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, this.f35860k5);
            jsonObject.addProperty("macaddress", this.f35867l5);
            jsonObject.addProperty("section", this.f35846i5);
            jsonObject.addProperty("section_category", liveStreamCategoryName);
            jsonObject.addProperty("report_title", this.f35881n5);
            jsonObject.addProperty("report_sub_title", this.f35888o5);
            jsonObject.addProperty("report_cases", this.f35923t5);
            jsonObject.addProperty("report_custom_message", this.f35902q5);
            jsonObject.addProperty("stream_name", this.f35874m5);
            jsonObject.addProperty("stream_id", Integer.valueOf(this.f35673G1));
            retrofitPost.clientsReportRequest(jsonObject).enqueue(new z());
        }
    }

    public static ProgressDialog u3(Context context) {
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

    public static long v3(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v4() {
        LinearLayout linearLayout;
        if (this.f35887o4.equals("player")) {
            linearLayout = this.f35695K;
            if (linearLayout == null) {
                return;
            }
        } else {
            linearLayout = this.f35689J;
            if (linearLayout == null) {
                return;
            }
        }
        linearLayout.setVisibility(0);
    }

    private void w4() {
        if (this.f35687I3.getVisibility() == 8) {
            this.f35687I3.startAnimation(this.f35804c4);
            this.f35687I3.setVisibility(0);
            this.f35741R3.requestFocus();
        }
    }

    private void x4(Activity activity) {
        new x((NSTIJKPlayerSkyTvActivity) activity, activity).show();
    }

    private void y4() {
        float fApplyDimension;
        ProgressDialog progressDialogU3;
        try {
            if (AbstractC2237a.f44480Y.booleanValue()) {
                findViewById(f.f12491p).setOnClickListener(this);
            }
            this.f35821f1.setVisibility(0);
            this.f35828g1.setVisibility(0);
            this.f35835h1.setVisibility(0);
            try {
                fApplyDimension = TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics());
            } catch (Exception unused) {
                fApplyDimension = 8.0f;
            }
            int i9 = (int) fApplyDimension;
            this.f35814e1.setPadding(i9, i9, i9, i9);
            RelativeLayout relativeLayout = this.f35693J3;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f35842i1.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = 0;
            this.f35842i1.setLayoutParams(layoutParams);
            getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            f35626G5 = false;
            ListView listView = this.f35761V;
            if (listView != null) {
                listView.requestFocus();
            }
            if (this.f35965z5.booleanValue()) {
                return;
            }
            ProgressDialog progressDialog = this.f35662E2;
            if (progressDialog == null) {
                progressDialogU3 = u3(this.f35806d);
                this.f35662E2 = progressDialogU3;
                if (progressDialogU3 != null) {
                    progressDialogU3.show();
                }
            } else if (!progressDialog.isShowing()) {
                progressDialogU3 = this.f35662E2;
                progressDialogU3.show();
            }
            this.f35757U1.removeCallbacksAndMessages(null);
            p4("", false);
            this.f35965z5 = Boolean.TRUE;
        } catch (Exception e9) {
            Log.e("exection", "" + e9);
        }
    }

    private void z3() {
        ImageView imageView = this.f35723O3;
        imageView.setOnFocusChangeListener(new J(imageView));
        ImageView imageView2 = this.f35729P3;
        imageView2.setOnFocusChangeListener(new J(imageView2));
        ImageView imageView3 = this.f35747S3;
        imageView3.setOnFocusChangeListener(new J(imageView3));
        ImageView imageView4 = this.f35753T3;
        imageView4.setOnFocusChangeListener(new J(imageView4));
        LinearLayout linearLayout = this.f35942w3;
        linearLayout.setOnFocusChangeListener(new J(linearLayout));
        LinearLayout linearLayout2 = this.f35949x3;
        linearLayout2.setOnFocusChangeListener(new J(linearLayout2));
        LinearLayout linearLayout3 = this.f35956y3;
        linearLayout3.setOnFocusChangeListener(new J(linearLayout3));
        LinearLayout linearLayout4 = this.f35921t3;
        linearLayout4.setOnFocusChangeListener(new J(linearLayout4));
        LinearLayout linearLayout5 = this.f35935v3;
        linearLayout5.setOnFocusChangeListener(new J(linearLayout5));
        ImageView imageView5 = this.f35735Q3;
        imageView5.setOnFocusChangeListener(new J(imageView5));
        ImageView imageView6 = this.f35741R3;
        imageView6.setOnFocusChangeListener(new J(imageView6));
        RelativeLayout relativeLayout = this.f35681H3;
        relativeLayout.setOnFocusChangeListener(new J(relativeLayout));
        ImageView imageView7 = this.f35795a5;
        imageView7.setOnFocusChangeListener(new J(imageView7));
        RelativeLayout relativeLayout2 = this.f35800b5;
        relativeLayout2.setOnFocusChangeListener(new J(relativeLayout2));
        ImageView imageView8 = this.f35795a5;
        imageView8.setOnFocusChangeListener(new J(imageView8));
        LinearLayout linearLayout6 = this.f35805c5;
        linearLayout6.setOnFocusChangeListener(new J(linearLayout6));
        LinearLayout linearLayout7 = this.f35811d5;
        linearLayout7.setOnFocusChangeListener(new J(linearLayout7));
        CheckBox checkBox = this.f35964z4;
        checkBox.setOnFocusChangeListener(new J(checkBox));
        CheckBox checkBox2 = this.f35636A4;
        checkBox2.setOnFocusChangeListener(new J(checkBox2));
        CheckBox checkBox3 = this.f35643B4;
        checkBox3.setOnFocusChangeListener(new J(checkBox3));
        CheckBox checkBox4 = this.f35650C4;
        checkBox4.setOnFocusChangeListener(new J(checkBox4));
        LinearLayout linearLayout8 = this.f35818e5;
        linearLayout8.setOnFocusChangeListener(new J(linearLayout8));
        CheckBox checkBox5 = this.f35657D4;
        checkBox5.setOnFocusChangeListener(new J(checkBox5));
        CheckBox checkBox6 = this.f35664E4;
        checkBox6.setOnFocusChangeListener(new J(checkBox6));
        CheckBox checkBox7 = this.f35670F4;
        checkBox7.setOnFocusChangeListener(new J(checkBox7));
        CheckBox checkBox8 = this.f35676G4;
        checkBox8.setOnFocusChangeListener(new J(checkBox8));
        CheckBox checkBox9 = this.f35682H4;
        checkBox9.setOnFocusChangeListener(new J(checkBox9));
        LinearLayout linearLayout9 = this.f35825f5;
        linearLayout9.setOnFocusChangeListener(new J(linearLayout9));
        LinearLayout linearLayout10 = this.f35832g5;
        linearLayout10.setOnFocusChangeListener(new J(linearLayout10));
        CheckBox checkBox10 = this.f35694J4;
        checkBox10.setOnFocusChangeListener(new J(checkBox10));
        CheckBox checkBox11 = this.f35700K4;
        checkBox11.setOnFocusChangeListener(new J(checkBox11));
        CheckBox checkBox12 = this.f35706L4;
        checkBox12.setOnFocusChangeListener(new J(checkBox12));
        CheckBox checkBox13 = this.f35712M4;
        checkBox13.setOnFocusChangeListener(new J(checkBox13));
        EditText editText = this.f35766V4;
        editText.setOnFocusChangeListener(new J(editText));
        TextView textView = this.f35950x4;
        textView.setOnFocusChangeListener(new J(textView));
    }

    public void A3() {
        RelativeLayout relativeLayout = this.f35814e1;
        if (relativeLayout != null) {
            relativeLayout.setPadding(0, 0, 0, 0);
        }
        f35626G5 = true;
        z4();
        t4();
        l3(5000);
        String livePlayerAppName = SharepreferenceDBHandler.getLivePlayerAppName(this.f35806d);
        if (!SharepreferenceDBHandler.getLivePlayerPkgName(this.f35806d).equals(CookieSpecs.DEFAULT) && !new ExternalPlayerDataBase(this.f35806d).CheckPlayerExistense(livePlayerAppName)) {
            SharepreferenceDBHandler.setLivePlayer(CookieSpecs.DEFAULT, CookieSpecs.DEFAULT, this.f35806d);
        }
        String livePlayerPkgName = SharepreferenceDBHandler.getLivePlayerPkgName(this.f35806d);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("stalker_api") || livePlayerPkgName == null || livePlayerPkgName.equalsIgnoreCase(CookieSpecs.DEFAULT)) {
            if (AbstractC2237a.f44480Y.booleanValue()) {
                LinearLayout linearLayout = this.f35963z3;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                findViewById(f.f12491p).setOnClickListener(null);
                this.f35821f1.setVisibility(8);
                this.f35828g1.setVisibility(8);
                this.f35835h1.setVisibility(8);
                getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f35842i1.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                this.f35842i1.setLayoutParams(layoutParams);
                getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
                NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = this.f35878n2;
                ((nSTIJKPlayerSkyTv == null || !nSTIJKPlayerSkyTv.isPlaying()) ? this.f35910s : this.f35917t).requestFocus();
                return;
            }
            return;
        }
        i4();
        this.f35680H2 = true;
        SharedPreferences sharedPreferences = getSharedPreferences("currentlyPlayingVideoPosition", 0);
        this.f35869m0 = sharedPreferences;
        int i9 = sharedPreferences.getInt("currentlyPlayingVideoPosition", 0);
        ArrayList arrayListG = this.f35838h4.g();
        this.f35787Z1 = i9;
        if (arrayListG == null || arrayListG.size() <= 0 || this.f35787Z1 >= arrayListG.size()) {
            ArrayList arrayList = this.f35660E0;
            if (arrayList != null && arrayList.size() > 0 && this.f35787Z1 < this.f35660E0.size()) {
                this.f35941w2 = m7.w.r0(((LiveStreamsDBModel) this.f35660E0.get(this.f35787Z1)).getStreamId());
                this.f35864l2 = ((LiveStreamsDBModel) this.f35660E0.get(this.f35787Z1)).getUrl();
                ((LiveStreamsDBModel) this.f35660E0.get(this.f35787Z1)).getName();
            }
        } else {
            this.f35941w2 = m7.w.r0(((LiveStreamsDBModel) arrayListG.get(this.f35787Z1)).getStreamId());
            this.f35864l2 = ((LiveStreamsDBModel) arrayListG.get(this.f35787Z1)).getUrl();
        }
        this.f35725P = this.f35941w2;
        this.f35737R = this.f35864l2;
        f35626G5 = false;
        NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv2 = this.f35878n2;
        if (nSTIJKPlayerSkyTv2 != null) {
            nSTIJKPlayerSkyTv2.j1(Boolean.FALSE);
        }
        if (this.f35857k2.equals("m3u")) {
            if (this.f35920t2.booleanValue()) {
                String livePlayerAppName2 = SharepreferenceDBHandler.getLivePlayerAppName(this.f35806d);
                Intent intent = new Intent(this.f35806d, (Class<?>) PlayExternalPlayerActivity.class);
                intent.putExtra("url", this.f35737R);
                intent.putExtra("packagename", livePlayerPkgName);
                intent.putExtra("app_name", livePlayerAppName2);
                this.f35806d.startActivity(intent);
                return;
            }
            return;
        }
        if (this.f35941w2 == -1 || !this.f35920t2.booleanValue()) {
            return;
        }
        String strV = m7.w.V(this.f35806d, this.f35941w2, this.f35904r0, "live");
        String livePlayerAppName3 = SharepreferenceDBHandler.getLivePlayerAppName(this.f35806d);
        Intent intent2 = new Intent(this.f35806d, (Class<?>) PlayExternalPlayerActivity.class);
        intent2.putExtra("url", strV);
        intent2.putExtra("packagename", livePlayerPkgName);
        intent2.putExtra("app_name", livePlayerAppName3);
        this.f35806d.startActivity(intent2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x000f, B:10:0x002f, B:12:0x0033), top: B:19:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void B4(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L2f
            java.lang.String r1 = ""
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Exception -> L2d
            if (r1 != 0) goto L2f
            android.widget.ImageView r1 = r3.f35645C     // Catch: java.lang.Exception -> L2d
            if (r1 == 0) goto L56
            android.content.Context r1 = r3.f35806d     // Catch: java.lang.Exception -> L2d
            com.squareup.picasso.t r1 = com.squareup.picasso.t.q(r1)     // Catch: java.lang.Exception -> L2d
            com.squareup.picasso.x r4 = r1.l(r4)     // Catch: java.lang.Exception -> L2d
            r1 = 80
            r2 = 55
            com.squareup.picasso.x r4 = r4.k(r1, r2)     // Catch: java.lang.Exception -> L2d
            int r1 = a7.e.f12016i1     // Catch: java.lang.Exception -> L2d
            com.squareup.picasso.x r4 = r4.j(r1)     // Catch: java.lang.Exception -> L2d
            android.widget.ImageView r1 = r3.f35645C     // Catch: java.lang.Exception -> L2d
            r4.g(r1)     // Catch: java.lang.Exception -> L2d
            goto L56
        L2d:
            goto L43
        L2f:
            android.widget.ImageView r4 = r3.f35645C     // Catch: java.lang.Exception -> L2d
            if (r4 == 0) goto L56
            android.content.Context r1 = r3.f35806d     // Catch: java.lang.Exception -> L2d
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Exception -> L2d
            int r2 = a7.e.f12016i1     // Catch: java.lang.Exception -> L2d
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2, r0)     // Catch: java.lang.Exception -> L2d
            r4.setImageDrawable(r1)     // Catch: java.lang.Exception -> L2d
            goto L56
        L43:
            android.widget.ImageView r4 = r3.f35645C
            if (r4 == 0) goto L56
            android.content.Context r1 = r3.f35806d
            android.content.res.Resources r1 = r1.getResources()
            int r2 = a7.e.f12016i1
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r2, r0)
            r4.setImageDrawable(r0)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.B4(java.lang.String):void");
    }

    public void C3() {
        ArrayList arrayList;
        LiveStreamsDBModel liveStreamFavouriteRow;
        try {
            if (this.f35857k2.equals("m3u")) {
                new ArrayList();
                LiveStreamDBHandler liveStreamDBHandler = this.f35827g0;
                if (liveStreamDBHandler == null) {
                    return;
                }
                ArrayList<FavouriteM3UModel> favouriteM3U = liveStreamDBHandler.getFavouriteM3U("live");
                arrayList = new ArrayList();
                ArrayList arrayList2 = this.f35690J0;
                if (arrayList2 != null && arrayList2.size() > 0 && favouriteM3U != null && favouriteM3U.size() > 0) {
                    favouriteM3U = K3(favouriteM3U, this.f35690J0);
                }
                if (favouriteM3U == null || favouriteM3U.size() <= 0) {
                    return;
                }
                for (FavouriteM3UModel favouriteM3UModel : favouriteM3U) {
                    ArrayList<LiveStreamsDBModel> m3UFavouriteRow = this.f35827g0.getM3UFavouriteRow(favouriteM3UModel.getCategoryID(), favouriteM3UModel.getUrl(), favouriteM3UModel.getTimestamp());
                    if (m3UFavouriteRow != null && m3UFavouriteRow.size() > 0) {
                        arrayList.add(m3UFavouriteRow.get(0));
                    }
                }
            } else {
                if (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("stalker_api")) {
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
                    this.f35773X.clear();
                    this.f35773X = this.f35827g0.getLiveFavStalker(string);
                    return;
                }
                new ArrayList();
                if (this.f35691J1 == null) {
                    return;
                }
                ArrayList<FavouriteDBModel> allFavourites = this.f35901q4.equals("true") ? this.f35691J1.getAllFavourites("radio_streams", SharepreferenceDBHandler.getUserID(this.f35806d)) : this.f35691J1.getAllFavourites("live", SharepreferenceDBHandler.getUserID(this.f35806d));
                arrayList = new ArrayList();
                ArrayList arrayList3 = this.f35690J0;
                if (arrayList3 != null && arrayList3.size() > 0 && allFavourites != null && allFavourites.size() > 0) {
                    allFavourites = J3(allFavourites, this.f35690J0);
                }
                if (allFavourites == null || allFavourites.size() <= 0) {
                    return;
                }
                for (FavouriteDBModel favouriteDBModel : allFavourites) {
                    LiveStreamDBHandler liveStreamDBHandler2 = new LiveStreamDBHandler(this.f35806d);
                    if (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("onestream_api")) {
                        liveStreamFavouriteRow = liveStreamDBHandler2.getLiveStreamFavouriteRow(favouriteDBModel.getCategoryID(), favouriteDBModel.getStreamIDOneStream(), favouriteDBModel.getTimestamp(), this.f35908r4);
                        if (liveStreamFavouriteRow != null) {
                            arrayList.add(liveStreamFavouriteRow);
                        }
                    } else {
                        liveStreamFavouriteRow = liveStreamDBHandler2.getLiveStreamFavouriteRow(favouriteDBModel.getCategoryID(), String.valueOf(favouriteDBModel.getStreamID()), favouriteDBModel.getTimestamp(), this.f35908r4);
                        if (liveStreamFavouriteRow != null) {
                            arrayList.add(liveStreamFavouriteRow);
                        }
                    }
                }
                if (arrayList.size() == 0) {
                    return;
                }
            }
            this.f35773X = arrayList;
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public void C4(String str) {
        y3();
        String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f35806d);
        String loggedInMacAddress = SharepreferenceDBHandler.getLoggedInMacAddress(this.f35806d);
        try {
            if (this.f35826g == null) {
                this.f35826g = new n7.g(this, this.f35806d);
            }
            this.f35826g.e(loggedInMacAddress, stalkerToken, str);
        } catch (Exception unused) {
        }
    }

    @Override // z7.j
    public void D0(String str) {
    }

    public String D3() {
        AsyncTask asyncTask;
        try {
            this.f35674G2 = 0;
            ArrayList arrayList = this.f35646C0;
            if (arrayList != null && this.f35632A0 != null) {
                arrayList.clear();
                this.f35632A0.clear();
            }
            ArrayList arrayList2 = this.f35773X;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.f35773X.clear();
            }
            C3();
            ArrayList arrayList3 = this.f35660E0;
            if (arrayList3 != null) {
                arrayList3.clear();
            }
            this.f35646C0 = this.f35773X;
            ArrayList arrayList4 = this.f35653D0;
            if (arrayList4 != null) {
                arrayList4.clear();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone(this.f35740R2.C()));
            String str = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + m7.w.S(this.f35806d)));
            boolean zB = this.f35740R2.B();
            ArrayList<XMLTVProgrammePojo> ePGTesting = zB ? this.f35827g0.getEPGTesting(null, str) : null;
            this.f35869m0 = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("m3u") ? this.f35862l0.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", "") : (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("onestream_api") ? this.f35862l0 : this.f35862l0).getString("currentlyPlayingVideo", "");
            ArrayList arrayList5 = this.f35646C0;
            if (arrayList5 == null || arrayList5.size() <= 0) {
                this.f35660E0 = this.f35646C0;
                return "get_fav";
            }
            for (int i9 = 0; i9 < this.f35646C0.size(); i9++) {
                AsyncTask asyncTask2 = this.f35641B2;
                if (asyncTask2 != null && asyncTask2.isCancelled()) {
                    return "get_fav";
                }
                if (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("m3u")) {
                    if (((LiveStreamsDBModel) this.f35646C0.get(i9)).getUrl().equals(string)) {
                        this.f35674G2 = i9;
                    }
                } else if (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("onestream_api")) {
                    if (((LiveStreamsDBModel) this.f35646C0.get(i9)).getStreamIdOneStream().equals(string)) {
                        this.f35674G2 = i9;
                    }
                } else if (((LiveStreamsDBModel) this.f35646C0.get(i9)).getStreamId().equals(string)) {
                    this.f35674G2 = i9;
                }
                LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                liveStreamsDBModel.setNum(((LiveStreamsDBModel) this.f35646C0.get(i9)).getNum());
                liveStreamsDBModel.setName(((LiveStreamsDBModel) this.f35646C0.get(i9)).getName());
                liveStreamsDBModel.setStreamType(((LiveStreamsDBModel) this.f35646C0.get(i9)).getStreamType());
                liveStreamsDBModel.setStreamId(((LiveStreamsDBModel) this.f35646C0.get(i9)).getStreamId());
                liveStreamsDBModel.setStreamIdOneStream(((LiveStreamsDBModel) this.f35646C0.get(i9)).getStreamIdOneStream());
                liveStreamsDBModel.setStreamIcon(((LiveStreamsDBModel) this.f35646C0.get(i9)).getStreamIcon());
                liveStreamsDBModel.setEpgChannelId(((LiveStreamsDBModel) this.f35646C0.get(i9)).getEpgChannelId());
                liveStreamsDBModel.setAdded(((LiveStreamsDBModel) this.f35646C0.get(i9)).getAdded());
                liveStreamsDBModel.setCategoryId(((LiveStreamsDBModel) this.f35646C0.get(i9)).getCategoryId());
                liveStreamsDBModel.setCustomSid(((LiveStreamsDBModel) this.f35646C0.get(i9)).getCustomSid());
                liveStreamsDBModel.setTvArchive(((LiveStreamsDBModel) this.f35646C0.get(i9)).getTvArchive());
                liveStreamsDBModel.setDirectSource(((LiveStreamsDBModel) this.f35646C0.get(i9)).getDirectSource());
                liveStreamsDBModel.setTvArchiveDuration(((LiveStreamsDBModel) this.f35646C0.get(i9)).getTvArchiveDuration());
                liveStreamsDBModel.setTypeName(((LiveStreamsDBModel) this.f35646C0.get(i9)).getTypeName());
                liveStreamsDBModel.setCategoryName(((LiveStreamsDBModel) this.f35646C0.get(i9)).getCategoryName());
                liveStreamsDBModel.setSeriesNo(((LiveStreamsDBModel) this.f35646C0.get(i9)).getSeriesNo());
                liveStreamsDBModel.setLive(((LiveStreamsDBModel) this.f35646C0.get(i9)).getLive());
                liveStreamsDBModel.setContaiinerExtension(((LiveStreamsDBModel) this.f35646C0.get(i9)).getContaiinerExtension());
                liveStreamsDBModel.setUrl(((LiveStreamsDBModel) this.f35646C0.get(i9)).getUrl());
                if (zB && ePGTesting != null && ePGTesting.size() > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < ePGTesting.size() && ((asyncTask = this.f35641B2) == null || !asyncTask.isCancelled())) {
                            if (((LiveStreamsDBModel) this.f35646C0.get(i9)).getEpgChannelId().equals(ePGTesting.get(i10).getChannel())) {
                                int iM = m7.w.M(m7.w.x(ePGTesting.get(i10).getStart(), this.f35806d), m7.w.x(ePGTesting.get(i10).getStop(), this.f35806d), this.f35806d);
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
                this.f35653D0.add(liveStreamsDBModel);
                this.f35660E0 = this.f35653D0;
            }
            return "get_fav";
        } catch (Exception e9) {
            e9.printStackTrace();
            return "get_fav";
        }
    }

    public String E3() {
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
            this.f35866l4 = 0;
            ArrayList arrayList = this.f35660E0;
            if (arrayList != null) {
                arrayList.clear();
            }
            ArrayList<LiveStreamsDBModel> arrayList2 = new ArrayList<>();
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("stalker_api")) {
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
                arrayList2 = this.f35827g0.getLiveFavStalker(string);
            } else {
                ArrayList<FavouriteDBModel> arrayList3 = new ArrayList<>();
                if (this.f35691J1 != null) {
                    if (this.f35901q4.equals("true")) {
                        databaseHandler = this.f35691J1;
                        str = "radio_streams";
                        userID = SharepreferenceDBHandler.getUserID(this.f35806d);
                    } else {
                        databaseHandler = this.f35691J1;
                        str = "live";
                        userID = SharepreferenceDBHandler.getUserID(this.f35806d);
                    }
                    ArrayList<FavouriteDBModel> allFavourites = databaseHandler.getAllFavourites(str, userID);
                    ArrayList arrayList4 = this.f35690J0;
                    if (arrayList4 == null || arrayList4.size() <= 0 || allFavourites == null || allFavourites.size() <= 0) {
                        arrayList3 = allFavourites;
                    } else {
                        try {
                            for (FavouriteDBModel favouriteDBModel : allFavourites) {
                                Iterator it = this.f35690J0.iterator();
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
                                    LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f35806d);
                                    if (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("onestream_api")) {
                                        categoryID = favouriteDBModel2.getCategoryID();
                                        strValueOf = String.valueOf(favouriteDBModel2.getStreamIDOneStream());
                                        timestamp = favouriteDBModel2.getTimestamp();
                                        str2 = this.f35908r4;
                                    } else {
                                        categoryID = favouriteDBModel2.getCategoryID();
                                        strValueOf = String.valueOf(favouriteDBModel2.getStreamID());
                                        timestamp = favouriteDBModel2.getTimestamp();
                                        str2 = this.f35908r4;
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
                this.f35660E0 = arrayList2;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone(this.f35740R2.C()));
            String str4 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + m7.w.S(this.f35806d)));
            boolean zB = this.f35740R2.B();
            ArrayList<XMLTVProgrammePojo> ePGTesting = zB ? this.f35827g0.getEPGTesting(null, str4) : null;
            this.f35869m0 = getSharedPreferences("currentlyPlayingVideo", 0);
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("m3u")) {
                sharedPreferences = this.f35862l0;
                str3 = "LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U";
            } else {
                sharedPreferences = SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("onestream_api") ? this.f35862l0 : this.f35862l0;
            }
            String string2 = sharedPreferences.getString(str3, "");
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = this.f35660E0;
            if (arrayList6 != null && arrayList6.size() > 0) {
                for (int i9 = 0; i9 < this.f35660E0.size() && ((asyncTask = this.f35641B2) == null || !asyncTask.isCancelled()); i9++) {
                    if (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("m3u")) {
                        if (((LiveStreamsDBModel) this.f35660E0.get(i9)).getUrl().equals(string2)) {
                            this.f35866l4 = i9;
                        }
                    } else if (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("onestream_api")) {
                        if (((LiveStreamsDBModel) this.f35660E0.get(i9)).getStreamIdOneStream().equals(string2)) {
                            this.f35866l4 = i9;
                        }
                    } else if (((LiveStreamsDBModel) this.f35660E0.get(i9)).getStreamId().equals(string2)) {
                        this.f35866l4 = i9;
                    }
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    liveStreamsDBModel.setNum(((LiveStreamsDBModel) this.f35660E0.get(i9)).getNum());
                    liveStreamsDBModel.setName(((LiveStreamsDBModel) this.f35660E0.get(i9)).getName());
                    liveStreamsDBModel.setStreamType(((LiveStreamsDBModel) this.f35660E0.get(i9)).getStreamType());
                    liveStreamsDBModel.setStreamId(((LiveStreamsDBModel) this.f35660E0.get(i9)).getStreamId());
                    liveStreamsDBModel.setStreamIdOneStream(((LiveStreamsDBModel) this.f35660E0.get(i9)).getStreamIdOneStream());
                    liveStreamsDBModel.setStreamIcon(((LiveStreamsDBModel) this.f35660E0.get(i9)).getStreamIcon());
                    liveStreamsDBModel.setEpgChannelId(((LiveStreamsDBModel) this.f35660E0.get(i9)).getEpgChannelId());
                    liveStreamsDBModel.setAdded(((LiveStreamsDBModel) this.f35660E0.get(i9)).getAdded());
                    liveStreamsDBModel.setCategoryId(((LiveStreamsDBModel) this.f35660E0.get(i9)).getCategoryId());
                    liveStreamsDBModel.setCustomSid(((LiveStreamsDBModel) this.f35660E0.get(i9)).getCustomSid());
                    liveStreamsDBModel.setTvArchive(((LiveStreamsDBModel) this.f35660E0.get(i9)).getTvArchive());
                    liveStreamsDBModel.setDirectSource(((LiveStreamsDBModel) this.f35660E0.get(i9)).getDirectSource());
                    liveStreamsDBModel.setTvArchiveDuration(((LiveStreamsDBModel) this.f35660E0.get(i9)).getTvArchiveDuration());
                    liveStreamsDBModel.setTypeName(((LiveStreamsDBModel) this.f35660E0.get(i9)).getTypeName());
                    liveStreamsDBModel.setCategoryName(((LiveStreamsDBModel) this.f35660E0.get(i9)).getCategoryName());
                    liveStreamsDBModel.setSeriesNo(((LiveStreamsDBModel) this.f35660E0.get(i9)).getSeriesNo());
                    liveStreamsDBModel.setLive(((LiveStreamsDBModel) this.f35660E0.get(i9)).getLive());
                    liveStreamsDBModel.setContaiinerExtension(((LiveStreamsDBModel) this.f35660E0.get(i9)).getContaiinerExtension());
                    liveStreamsDBModel.setUrl(((LiveStreamsDBModel) this.f35660E0.get(i9)).getUrl());
                    if (zB && ePGTesting != null && ePGTesting.size() > 0) {
                        int i10 = 0;
                        while (true) {
                            if (i10 < ePGTesting.size() && ((asyncTask2 = this.f35641B2) == null || !asyncTask2.isCancelled())) {
                                if (((LiveStreamsDBModel) this.f35660E0.get(i9)).getEpgChannelId().equals(ePGTesting.get(i10).getChannel())) {
                                    int iM = m7.w.M(m7.w.x(ePGTesting.get(i10).getStart(), this.f35806d), m7.w.x(ePGTesting.get(i10).getStop(), this.f35806d), this.f35806d);
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
            ArrayList arrayList7 = this.f35660E0;
            if (arrayList7 == null) {
                return "get_fav";
            }
            arrayList7.clear();
            this.f35660E0.addAll(arrayList5);
            return "get_fav";
        } catch (Exception e11) {
            e11.printStackTrace();
            return "get_fav";
        }
    }

    @Override // z7.g
    public void F(StalkerGetSeriesCategoriesCallback stalkerGetSeriesCategoriesCallback) {
    }

    public void F3() {
        if (this.f35790Z4.getVisibility() == 0) {
            this.f35805c5.setNextFocusRightId(f.f12190K3);
            this.f35811d5.setNextFocusRightId(f.f12383e2);
            this.f35818e5.setNextFocusRightId(f.f12342a2);
            this.f35825f5.setNextFocusRightId(f.f12296V1);
        }
    }

    @Override // z7.g
    public void G(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, Z.E e9, int i9) {
    }

    @Override // z7.g
    public void G0(StalkerTokenCallback stalkerTokenCallback) {
    }

    public int G3(ArrayList arrayList, int i9) {
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
    public void H(String str) {
        if (this.f35894p4.equals("false")) {
            m4();
            return;
        }
        String str2 = this.f35849j1;
        this.f35770W2 = str2;
        q7.N n9 = new q7.N(this.f35806d, str2, "", this.f35901q4, this.f35894p4);
        this.f35824f4 = n9;
        this.f35776X2 = this.f35770W2;
        this.f35705L3.setAdapter(n9);
        this.f35705L3.setLayoutManager(this.f35852j4);
        h3(true);
    }

    @Override // z7.g
    public void I(m0.x xVar, int i9) {
    }

    @Override // z7.g
    public void M(StalkerGetAdCallback stalkerGetAdCallback, int i9) {
        try {
            StalkerLiveFavIdsSingleton.getInstance().setFavIdsList(null);
            this.f35868m.i(this.f35882o, this.f35875n);
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

    public void N3() {
        if (this.f35900q3.getVisibility() == 0) {
            this.f35900q3.startAnimation(this.f35799b4);
            if (this.f35879n3.getVisibility() == 0) {
                this.f35879n3.startAnimation(this.f35799b4);
            }
            if (this.f35893p3.getVisibility() == 0) {
                this.f35893p3.startAnimation(this.f35799b4);
            }
            if (this.f35886o3.getVisibility() == 0) {
                this.f35886o3.startAnimation(this.f35799b4);
            }
            this.f35900q3.setVisibility(8);
            if (this.f35879n3.getVisibility() == 0) {
                this.f35879n3.setVisibility(8);
            }
            if (this.f35893p3.getVisibility() == 0) {
                this.f35893p3.setVisibility(8);
            }
            if (this.f35886o3.getVisibility() == 0) {
                this.f35886o3.setVisibility(8);
            }
            this.f35649C3.setVisibility(8);
            this.f35635A3.setVisibility(8);
            this.f35784Y4.setVisibility(8);
            this.f35642B3.setVisibility(8);
        }
    }

    @Override // z7.g
    public void O(Z.E e9, int i9) {
    }

    @Override // z7.j
    public void P(String str) {
        try {
            this.f35661E1.setVisibility(8);
            L3();
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
        LinearLayout linearLayout = this.f35656D3;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f35663E3;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    public void Q3() {
        LinearLayout linearLayout = this.f35768W0;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f35774X0;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    public void R3() {
        try {
            ProgressDialog progressDialog = this.f35662E2;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            this.f35662E2.dismiss();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean S3() {
        /*
            Method dump skipped, instruction units count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.S3():boolean");
    }

    @Override // z7.j
    public void T0(StalkerDeletePlayerLinkCallback stalkerDeletePlayerLinkCallback) {
    }

    @Override // z7.g
    public void U(StalkerLiveFavIdsCallback stalkerLiveFavIdsCallback) {
        if (stalkerLiveFavIdsCallback != null && stalkerLiveFavIdsCallback.getJs() != null && stalkerLiveFavIdsCallback.getJs().size() > 0) {
            StalkerLiveFavIdsSingleton.getInstance().setFavIdsList(stalkerLiveFavIdsCallback.getJs());
        }
        this.f35861l = StalkerLiveFavIdsSingleton.getInstance().getFavIdsList();
        if (this.f35894p4.equals("false")) {
            m4();
            return;
        }
        String str = this.f35849j1;
        this.f35770W2 = str;
        q7.N n9 = new q7.N(this.f35806d, str, "", this.f35901q4, this.f35894p4);
        this.f35824f4 = n9;
        this.f35776X2 = this.f35770W2;
        this.f35705L3.setAdapter(n9);
        this.f35705L3.setLayoutManager(this.f35852j4);
        h3(true);
    }

    public boolean U3() {
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

    @Override // z7.g
    public void V(StalkerProfilesCallback stalkerProfilesCallback) {
    }

    @Override // z7.g
    public void V0(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, m0.x xVar, int i9) {
    }

    public void V3(String str) {
        this.f35776X2 = str;
        try {
            SearchView searchView = this.f35756U0;
            if (searchView != null && this.f35836h2 != null) {
                searchView.d0("", false);
                this.f35836h2.collapseActionView();
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        try {
            if (this.f35829g2 != null) {
                if (this.f35776X2.equals("-6")) {
                    this.f35829g2.getItem(2).getSubMenu().findItem(f.Db).setVisible(true);
                } else {
                    this.f35829g2.getItem(2).getSubMenu().findItem(f.Db).setVisible(false);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        h3(true);
    }

    @Override // z7.j
    public void X(StalkerShortEPGCallback stalkerShortEPGCallback) {
        if (stalkerShortEPGCallback == null || stalkerShortEPGCallback.getJs() == null || stalkerShortEPGCallback.getJs().size() <= 0) {
            try {
                this.f35661E1.setVisibility(8);
                L3();
            } catch (Exception unused) {
            }
        } else {
            HashMap map = new HashMap();
            try {
                map = s4(stalkerShortEPGCallback);
            } catch (Exception unused2) {
            }
            x3(map);
        }
    }

    public void Y3() {
        LinearLayout linearLayout = this.f35656D3;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        if (this.f35656D3 != null) {
            this.f35663E3.setVisibility(0);
        }
    }

    public void Z3() {
        TextView textView;
        Resources resources;
        int i9;
        AbstractC2237a.f44480Y = Boolean.TRUE;
        this.f35719O = true;
        this.f35631A.setVisibility(0);
        if (this.f35776X2.equalsIgnoreCase("-1")) {
            textView = this.f35638B;
            resources = this.f35806d.getResources();
            i9 = a7.j.f13301k4;
        } else {
            textView = this.f35638B;
            resources = this.f35806d.getResources();
            i9 = a7.j.f13261g4;
        }
        textView.setText(resources.getString(i9));
        this.f35661E1.setVisibility(8);
        if (AbstractC2237a.f44434B.booleanValue()) {
            findViewById(f.Sm).setVisibility(8);
        }
    }

    public void a4() {
        LinearLayout linearLayout = this.f35768W0;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f35774X0;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
    }

    public void b4(int i9) {
        try {
            q7.N n9 = this.f35824f4;
            if (n9 != null) {
                n9.x(i9);
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
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
            if (this.f35761V == null || this.f35838h4 == null || stalkerSetLiveFavCallback == null || stalkerSetLiveFavCallback.getJs() == null || !stalkerSetLiveFavCallback.getJs().equals(Boolean.TRUE)) {
                return;
            }
            this.f35861l = StalkerLiveFavIdsSingleton.getInstance().getFavIdsList();
            if (str.equals("added")) {
                int i9 = this.f35889p;
                if (i9 != 0) {
                    this.f35861l.add(Integer.valueOf(i9));
                }
                StalkerLiveFavIdsSingleton.getInstance().setFavIdsList(this.f35861l);
                try {
                    ListView listView = this.f35761V;
                    View childAt = listView.getChildAt(this.f35896q - listView.getFirstVisiblePosition());
                    if (childAt != null) {
                        try {
                            ((ImageView) childAt.findViewById(f.f12406g5)).setVisibility(0);
                        } catch (Exception e9) {
                            e9.printStackTrace();
                        }
                    }
                    this.f35824f4.x(1);
                } catch (Exception unused) {
                }
                context = this.f35806d;
                sb = new StringBuilder();
                sb.append(str2);
                sb.append(this.f35806d.getResources().getString(a7.j.f13356q));
            } else {
                int i10 = this.f35889p;
                if (i10 != 0) {
                    this.f35861l.remove(Integer.valueOf(i10));
                    StalkerLiveFavIdsSingleton.getInstance().setFavIdsList(this.f35861l);
                }
                try {
                    ListView listView2 = this.f35761V;
                    View childAt2 = listView2.getChildAt(this.f35896q - listView2.getFirstVisiblePosition());
                    if (childAt2 != null) {
                        try {
                            ((ImageView) childAt2.findViewById(f.f12406g5)).setVisibility(4);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                    this.f35824f4.x(1);
                } catch (Exception unused2) {
                }
                context = this.f35806d;
                sb = new StringBuilder();
                sb.append(str2);
                sb.append(this.f35806d.getResources().getString(a7.j.f13223c6));
            }
            m7.w.P0(context, sb.toString());
        } catch (Exception unused3) {
        }
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
        q3();
        this.f35641B2 = new H().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels");
    }

    @Override // z7.g
    public void f0(StalkerGetGenresCallback stalkerGetGenresCallback) {
    }

    public void f3() {
        q3();
        this.f35641B2 = new H().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels_with_cat");
    }

    public String g3() {
        AsyncTask asyncTask;
        try {
            this.f35674G2 = 0;
            ArrayList arrayList = this.f35646C0;
            if (arrayList != null && this.f35632A0 != null) {
                arrayList.clear();
                this.f35632A0.clear();
            }
            this.f35672G0 = this.f35901q4.equals("true") ? this.f35827g0.getAllLiveStreasWithCategoryId(this.f35849j1, "radio_streams") : this.f35827g0.getAllLiveStreasWithCategoryId(this.f35849j1, "live");
            this.f35646C0 = this.f35672G0;
            ArrayList arrayList2 = this.f35653D0;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone(this.f35740R2.C()));
            String str = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + m7.w.S(this.f35806d)));
            boolean zB = this.f35740R2.B();
            ArrayList<XMLTVProgrammePojo> ePGTesting = zB ? this.f35827g0.getEPGTesting(null, str) : null;
            this.f35869m0 = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("m3u") ? this.f35862l0.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", "") : (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("onestream_api") ? this.f35862l0 : this.f35862l0).getString("currentlyPlayingVideo", "");
            ArrayList arrayList3 = this.f35646C0;
            if (arrayList3 == null || arrayList3.size() <= 0) {
                return "all_channels_with_cat";
            }
            for (int i9 = 0; i9 < this.f35646C0.size(); i9++) {
                AsyncTask asyncTask2 = this.f35641B2;
                if (asyncTask2 != null && asyncTask2.isCancelled()) {
                    return "all_channels_with_cat";
                }
                if (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("m3u")) {
                    if (((LiveStreamsDBModel) this.f35646C0.get(i9)).getUrl().equals(string)) {
                        this.f35674G2 = i9;
                    }
                } else if (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("onestream_api")) {
                    if (((LiveStreamsDBModel) this.f35646C0.get(i9)).getStreamIdOneStream().equals(string)) {
                        this.f35674G2 = i9;
                    }
                } else if (((LiveStreamsDBModel) this.f35646C0.get(i9)).getStreamId().equals(string)) {
                    this.f35674G2 = i9;
                }
                LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                liveStreamsDBModel.setNum(((LiveStreamsDBModel) this.f35646C0.get(i9)).getNum());
                liveStreamsDBModel.setName(((LiveStreamsDBModel) this.f35646C0.get(i9)).getName());
                liveStreamsDBModel.setStreamType(((LiveStreamsDBModel) this.f35646C0.get(i9)).getStreamType());
                liveStreamsDBModel.setStreamId(((LiveStreamsDBModel) this.f35646C0.get(i9)).getStreamId());
                liveStreamsDBModel.setStreamIdOneStream(((LiveStreamsDBModel) this.f35646C0.get(i9)).getStreamIdOneStream());
                liveStreamsDBModel.setStreamIcon(((LiveStreamsDBModel) this.f35646C0.get(i9)).getStreamIcon());
                liveStreamsDBModel.setEpgChannelId(((LiveStreamsDBModel) this.f35646C0.get(i9)).getEpgChannelId());
                liveStreamsDBModel.setAdded(((LiveStreamsDBModel) this.f35646C0.get(i9)).getAdded());
                liveStreamsDBModel.setCategoryId(((LiveStreamsDBModel) this.f35646C0.get(i9)).getCategoryId());
                liveStreamsDBModel.setCustomSid(((LiveStreamsDBModel) this.f35646C0.get(i9)).getCustomSid());
                liveStreamsDBModel.setTvArchive(((LiveStreamsDBModel) this.f35646C0.get(i9)).getTvArchive());
                liveStreamsDBModel.setDirectSource(((LiveStreamsDBModel) this.f35646C0.get(i9)).getDirectSource());
                liveStreamsDBModel.setTvArchiveDuration(((LiveStreamsDBModel) this.f35646C0.get(i9)).getTvArchiveDuration());
                liveStreamsDBModel.setTypeName(((LiveStreamsDBModel) this.f35646C0.get(i9)).getTypeName());
                liveStreamsDBModel.setCategoryName(((LiveStreamsDBModel) this.f35646C0.get(i9)).getCategoryName());
                liveStreamsDBModel.setSeriesNo(((LiveStreamsDBModel) this.f35646C0.get(i9)).getSeriesNo());
                liveStreamsDBModel.setLive(((LiveStreamsDBModel) this.f35646C0.get(i9)).getLive());
                liveStreamsDBModel.setContaiinerExtension(((LiveStreamsDBModel) this.f35646C0.get(i9)).getContaiinerExtension());
                liveStreamsDBModel.setUrl(((LiveStreamsDBModel) this.f35646C0.get(i9)).getUrl());
                if (zB && ePGTesting != null && ePGTesting.size() > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= ePGTesting.size() || ((asyncTask = this.f35641B2) != null && asyncTask.isCancelled())) {
                            break;
                        }
                        if (((LiveStreamsDBModel) this.f35646C0.get(i9)).getEpgChannelId().equals(ePGTesting.get(i10).getChannel())) {
                            int iM = m7.w.M(m7.w.x(ePGTesting.get(i10).getStart(), this.f35806d), m7.w.x(ePGTesting.get(i10).getStop(), this.f35806d), this.f35806d);
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
                this.f35653D0.add(liveStreamsDBModel);
            }
            return "all_channels_with_cat";
        } catch (Exception e9) {
            e9.printStackTrace();
            return "all_channels_with_cat";
        }
    }

    public void h3(boolean z9) {
        ProgressDialog progressDialogU3;
        q3();
        if (z9) {
            ProgressDialog progressDialog = this.f35662E2;
            if (progressDialog == null) {
                progressDialogU3 = u3(this.f35806d);
                this.f35662E2 = progressDialogU3;
                if (progressDialogU3 != null) {
                    progressDialogU3.show();
                }
            } else if (!progressDialog.isShowing()) {
                progressDialogU3 = this.f35662E2;
                progressDialogU3.show();
            }
        }
        this.f35641B2 = new I().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels_with_cat");
    }

    @Override // z7.g
    public void i(StalkerGetAllChannelsCallback stalkerGetAllChannelsCallback) {
    }

    public void i3() {
        q3();
        this.f35641B2 = new H().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_fav");
    }

    public void i4() {
        try {
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = this.f35878n2;
            if (nSTIJKPlayerSkyTv != null) {
                if (nSTIJKPlayerSkyTv.o1()) {
                    this.f35878n2.i1();
                } else {
                    this.f35878n2.D1();
                    this.f35878n2.r1(true);
                    this.f35878n2.B1();
                }
                IjkMediaPlayer.native_profileEnd();
            }
        } catch (Exception unused) {
        }
    }

    @Override // z7.g
    public void j(StalkerGetVodCategoriesCallback stalkerGetVodCategoriesCallback) {
    }

    public void j3() {
        q3();
        this.f35641B2 = new H().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "recently_watched");
    }

    public String k3() {
        AsyncTask asyncTask;
        AsyncTask asyncTask2;
        try {
            this.f35866l4 = 0;
            ArrayList arrayList = this.f35660E0;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.f35660E0 = this.f35901q4.equalsIgnoreCase("true") ? this.f35827g0.getAllRecentlyWatchedLiveStreams("radio_streams") : this.f35827g0.getAllRecentlyWatchedLiveStreams("live");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone(this.f35740R2.C()));
            String str = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + m7.w.S(this.f35806d)));
            boolean zB = this.f35740R2.B();
            ArrayList<XMLTVProgrammePojo> ePGTesting = zB ? this.f35827g0.getEPGTesting(null, str) : null;
            this.f35869m0 = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("m3u") ? this.f35862l0.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", "") : (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("onestream_api") ? this.f35862l0 : this.f35862l0).getString("currentlyPlayingVideo", "");
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = this.f35660E0;
            if (arrayList3 != null && arrayList3.size() > 0) {
                for (int i9 = 0; i9 < this.f35660E0.size() && ((asyncTask = this.f35641B2) == null || !asyncTask.isCancelled()); i9++) {
                    if (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("m3u")) {
                        if (((LiveStreamsDBModel) this.f35660E0.get(i9)).getUrl().equals(string)) {
                            this.f35866l4 = i9;
                            this.f35787Z1 = i9;
                        }
                    } else if (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("onestream_api")) {
                        if (((LiveStreamsDBModel) this.f35660E0.get(i9)).getStreamIdOneStream().equals(string)) {
                            this.f35866l4 = i9;
                            this.f35787Z1 = i9;
                        }
                    } else if (((LiveStreamsDBModel) this.f35660E0.get(i9)).getStreamId().equals(string)) {
                        this.f35866l4 = i9;
                        this.f35787Z1 = i9;
                    }
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    liveStreamsDBModel.setNum(((LiveStreamsDBModel) this.f35660E0.get(i9)).getNum());
                    liveStreamsDBModel.setName(((LiveStreamsDBModel) this.f35660E0.get(i9)).getName());
                    liveStreamsDBModel.setStreamType(((LiveStreamsDBModel) this.f35660E0.get(i9)).getStreamType());
                    liveStreamsDBModel.setStreamId(((LiveStreamsDBModel) this.f35660E0.get(i9)).getStreamId());
                    liveStreamsDBModel.setStreamIdOneStream(((LiveStreamsDBModel) this.f35660E0.get(i9)).getStreamIdOneStream());
                    liveStreamsDBModel.setStreamIcon(((LiveStreamsDBModel) this.f35660E0.get(i9)).getStreamIcon());
                    liveStreamsDBModel.setEpgChannelId(((LiveStreamsDBModel) this.f35660E0.get(i9)).getEpgChannelId());
                    liveStreamsDBModel.setAdded(((LiveStreamsDBModel) this.f35660E0.get(i9)).getAdded());
                    liveStreamsDBModel.setCategoryId(((LiveStreamsDBModel) this.f35660E0.get(i9)).getCategoryId());
                    liveStreamsDBModel.setCustomSid(((LiveStreamsDBModel) this.f35660E0.get(i9)).getCustomSid());
                    liveStreamsDBModel.setTvArchive(((LiveStreamsDBModel) this.f35660E0.get(i9)).getTvArchive());
                    liveStreamsDBModel.setDirectSource(((LiveStreamsDBModel) this.f35660E0.get(i9)).getDirectSource());
                    liveStreamsDBModel.setTvArchiveDuration(((LiveStreamsDBModel) this.f35660E0.get(i9)).getTvArchiveDuration());
                    liveStreamsDBModel.setTypeName(((LiveStreamsDBModel) this.f35660E0.get(i9)).getTypeName());
                    liveStreamsDBModel.setCategoryName(((LiveStreamsDBModel) this.f35660E0.get(i9)).getCategoryName());
                    liveStreamsDBModel.setSeriesNo(((LiveStreamsDBModel) this.f35660E0.get(i9)).getSeriesNo());
                    liveStreamsDBModel.setLive(((LiveStreamsDBModel) this.f35660E0.get(i9)).getLive());
                    liveStreamsDBModel.setContaiinerExtension(((LiveStreamsDBModel) this.f35660E0.get(i9)).getContaiinerExtension());
                    liveStreamsDBModel.setUrl(((LiveStreamsDBModel) this.f35660E0.get(i9)).getUrl());
                    if (zB && ePGTesting != null && ePGTesting.size() > 0) {
                        int i10 = 0;
                        while (true) {
                            if (i10 < ePGTesting.size() && ((asyncTask2 = this.f35641B2) == null || !asyncTask2.isCancelled())) {
                                if (((LiveStreamsDBModel) this.f35660E0.get(i9)).getEpgChannelId().equals(ePGTesting.get(i10).getChannel())) {
                                    int iM = m7.w.M(m7.w.x(ePGTesting.get(i10).getStart(), this.f35806d), m7.w.x(ePGTesting.get(i10).getStop(), this.f35806d), this.f35806d);
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
                    arrayList2.add(liveStreamsDBModel);
                }
            }
            this.f35660E0 = arrayList2;
            return "all_channels_with_cat";
        } catch (Exception e9) {
            e9.printStackTrace();
            return "all_channels_with_cat";
        }
    }

    public final void k4(String str, int i9, String str2, String str3, int i10, String str4) {
        new N(str, i9, str2, str3, i10).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    public void m3(int i9) {
        this.f35878n2.f37273a1 = new s();
        NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = this.f35878n2;
        nSTIJKPlayerSkyTv.f37271Z0.postDelayed(nSTIJKPlayerSkyTv.f37273a1, i9);
    }

    public void m4() {
        this.f35648C2 = new F().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    public String n3(String str) {
        ArrayList arrayList = this.f35946x0;
        if (arrayList != null && arrayList.size() > 0) {
            for (LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel : this.f35946x0) {
                if (liveStreamCategoryIdDBModel.getLiveStreamCategoryID() != null && !liveStreamCategoryIdDBModel.getLiveStreamCategoryID().isEmpty() && liveStreamCategoryIdDBModel.getLiveStreamCategoryID().equalsIgnoreCase(str)) {
                    this.f35856k1 = liveStreamCategoryIdDBModel.getLiveStreamCategoryName();
                }
            }
        }
        return this.f35856k1;
    }

    public void n4(ArrayList arrayList) {
        TextView textView;
        if (arrayList != null) {
            try {
                this.f35713N = false;
                this.f35762V0.setVisibility(8);
                if (arrayList.size() == 0) {
                    if (this.f35668F2) {
                        TextView textView2 = this.f35762V0;
                        if (textView2 == null) {
                            return;
                        }
                        this.f35713N = true;
                        textView2.setFocusable(true);
                        this.f35762V0.requestFocus();
                        textView = this.f35762V0;
                    } else {
                        this.f35668F2 = true;
                        ArrayList arrayList2 = this.f35646C0;
                        if (arrayList2 != null && this.f35632A0 != null) {
                            arrayList2.clear();
                            this.f35632A0.clear();
                        }
                        this.f35646C0 = this.f35901q4.equals("true") ? this.f35827g0.getAllLiveStreasWithCategoryId(this.f35849j1, "radio_streams") : this.f35827g0.getAllLiveStreasWithCategoryId(this.f35849j1, "live");
                        ArrayList arrayList3 = this.f35646C0;
                        if (arrayList3 != null && arrayList3.size() > 0) {
                            n4(this.f35646C0);
                            return;
                        }
                        TextView textView3 = this.f35762V0;
                        if (textView3 == null) {
                            return;
                        }
                        this.f35713N = true;
                        textView3.setFocusable(true);
                        this.f35762V0.requestFocus();
                        textView = this.f35762V0;
                    }
                    textView.setVisibility(0);
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    @Override // z7.g
    public void o0(String str) {
    }

    public void o3(int i9, String str, String str2) {
    }

    public void o4(ArrayList arrayList) {
        ListView listView;
        try {
            if (this.f35887o4.equals("player")) {
                this.f35819f = arrayList;
                if (arrayList != null && arrayList.size() > 0) {
                    ListView listView2 = this.f35767W;
                    if (listView2 != null) {
                        listView2.setVisibility(0);
                    }
                    this.f35713N = false;
                    if (this.f35767W != null) {
                        P p9 = new P(this, arrayList);
                        this.f35845i4 = p9;
                        this.f35767W.setAdapter((ListAdapter) p9);
                        this.f35838h4.h(this.f35732Q0);
                        this.f35767W.setSelection(this.f35866l4);
                        this.f35767W.requestFocus();
                        this.f35767W.setOnItemClickListener(new D());
                        return;
                    }
                    return;
                }
                LinearLayout linearLayout = this.f35768W0;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                LinearLayout linearLayout2 = this.f35774X0;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                listView = this.f35767W;
                if (listView == null) {
                    return;
                }
            } else {
                this.f35812e = arrayList;
                if (arrayList != null && arrayList.size() > 0) {
                    ListView listView3 = this.f35761V;
                    if (listView3 != null) {
                        listView3.setVisibility(0);
                    }
                    this.f35713N = false;
                    if (this.f35761V != null) {
                        q7.O o9 = new q7.O(this, arrayList);
                        this.f35838h4 = o9;
                        o9.i(null);
                        this.f35761V.setAdapter((ListAdapter) this.f35838h4);
                        this.f35761V.setSelection(this.f35866l4);
                        if (!f35626G5) {
                            this.f35761V.requestFocus();
                        }
                        this.f35761V.setOnItemSelectedListener(new C1484a());
                        this.f35761V.setOnItemClickListener(new C1485b(arrayList));
                        this.f35761V.setOnItemLongClickListener(new C1486c());
                        return;
                    }
                    return;
                }
                LinearLayout linearLayout3 = this.f35768W0;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(0);
                }
                LinearLayout linearLayout4 = this.f35774X0;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(0);
                }
                listView = this.f35761V;
                if (listView == null) {
                    return;
                }
            }
            listView.setVisibility(8);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i9, int i10, Intent intent) {
        super.onActivityResult(i9, i10, intent);
        if (i9 == 101) {
            try {
                if (U3()) {
                    SharedPreferences sharedPreferences = getSharedPreferences("downloadStatus", 0);
                    f35625F5 = sharedPreferences;
                    String string = sharedPreferences.getString("downloadStatus", "");
                    m7.w wVar = new m7.w();
                    if (string.equals("processing")) {
                        wVar.L0(this);
                    } else {
                        wVar.O0(this, this.f35934v2, this.f35904r0, this.f35903r, this.f35725P, this.f35737R, this.f35731Q);
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
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.onBackPressed():void");
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
                checkBox = this.f35694J4;
            }
        } else if (id == f.f12314X1) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f35700K4;
            }
        } else if (id == f.f12323Y1) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f35706L4;
            }
        } else if (id == f.f12305W1) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f35712M4;
            }
        } else if (id == f.f12383e2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f35964z4;
            }
        } else if (id == f.f12403g2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f35636A4;
            }
        } else if (id == f.f12413h2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f35643B4;
            }
        } else if (id == f.f12393f2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f35650C4;
            }
        } else if (id == f.f12342a2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f35657D4;
            }
        } else if (id == f.f12362c2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f35664E4;
            }
        } else if (id == f.f12372d2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f35670F4;
            }
        } else if (id == f.f12352b2) {
            if (!zIsChecked) {
                return;
            } else {
                checkBox = this.f35676G4;
            }
        } else if (id != f.f12332Z1 || !zIsChecked) {
            return;
        } else {
            checkBox = this.f35682H4;
        }
        this.f35895p5 = checkBox.getText().toString();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        String str2;
        C2966a c2966aF;
        String strValueOf;
        SharedPreferences.Editor editor;
        String strValueOf2;
        C2966a c2966aF2;
        String strValueOf3;
        TextView textView;
        Resources resources;
        int i9;
        int i10;
        int i11;
        View view2;
        ImageView imageView;
        String strV;
        Intent intent;
        String str3;
        Intent intent2;
        int id = view.getId();
        String str4 = "";
        if (id == f.f12275S8) {
            this.f35937v5 = true;
            if (!this.f35719O) {
                i4();
                if (!SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("stalker_api")) {
                    this.f35937v5 = true;
                    if (!this.f35719O) {
                        i4();
                        if (this.f35857k2.equals("m3u")) {
                            if (this.f35920t2.booleanValue()) {
                                intent2 = new Intent(this.f35806d, (Class<?>) NSTIJKPlayerMultiActivity.class);
                                intent2.putExtra("url", this.f35685I1);
                                C2966a.f().A(this.f35685I1);
                                intent2.putExtra("CHANNEL_NUM", this.f35764V2);
                                this.f35806d.startActivity(intent2);
                            }
                        } else if (this.f35673G1 != -1 && this.f35920t2.booleanValue()) {
                            strV = m7.w.V(this.f35806d, this.f35673G1, this.f35904r0, "live");
                            C2966a.f().A(String.valueOf(this.f35673G1));
                            intent = new Intent(this.f35806d, (Class<?>) NSTIJKPlayerMultiActivity.class);
                            intent.putExtra("url", strV);
                            intent.putExtra("CHANNEL_NUM", this.f35764V2);
                            this.f35806d.startActivity(intent);
                        }
                    }
                } else if (this.f35857k2.equals("m3u")) {
                    if (this.f35920t2.booleanValue()) {
                        intent2 = new Intent(this.f35806d, (Class<?>) NSTIJKPlayerMultiActivity.class);
                        intent2.putExtra("url", this.f35685I1);
                        C2966a.f().A(this.f35685I1);
                        intent2.putExtra("CHANNEL_NUM", this.f35764V2);
                        this.f35806d.startActivity(intent2);
                    }
                } else if (this.f35857k2.equals("onestream_api")) {
                    if (this.f35920t2.booleanValue()) {
                        try {
                            JSONObject jSONObject = new JSONObject(this.f35864l2);
                            String str5 = this.f35904r0;
                            String str6 = "m3u8";
                            String str7 = "ts";
                            if (str5 == null || str5.isEmpty() || !this.f35904r0.equals(".ts")) {
                                strV = "";
                                str3 = strV;
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
                                strV = jSONObject.getString(str3);
                            }
                            try {
                                String str8 = this.f35904r0;
                                if (str8 != null && !str8.isEmpty() && this.f35904r0.equals(".m3u8")) {
                                    Iterator<String> itKeys2 = jSONObject.keys();
                                    while (true) {
                                        if (!itKeys2.hasNext()) {
                                            str6 = str3;
                                            break;
                                        } else if (itKeys2.next().equals("m3u8")) {
                                            break;
                                        }
                                    }
                                    if (str6.equals("")) {
                                        while (itKeys2.hasNext()) {
                                            if (itKeys2.next().equals("ts")) {
                                                break;
                                            }
                                        }
                                        str7 = str6;
                                        strV = jSONObject.getString(str7);
                                    } else {
                                        str7 = str6;
                                        strV = jSONObject.getString(str7);
                                    }
                                }
                            } catch (Exception unused) {
                                str4 = strV;
                                strV = str4;
                            }
                        } catch (Exception unused2) {
                        }
                        C2966a.f().A(this.f35679H1);
                        intent = new Intent(this.f35806d, (Class<?>) NSTIJKPlayerMultiActivity.class);
                        intent.putExtra("url", strV);
                        intent.putExtra("CHANNEL_NUM", this.f35764V2);
                        this.f35806d.startActivity(intent);
                    }
                } else if (this.f35673G1 != -1 && this.f35920t2.booleanValue()) {
                    strV = m7.w.V(this.f35806d, this.f35673G1, this.f35904r0, "live");
                    C2966a.f().A(String.valueOf(this.f35673G1));
                    intent = new Intent(this.f35806d, (Class<?>) NSTIJKPlayerMultiActivity.class);
                    intent.putExtra("url", strV);
                    intent.putExtra("CHANNEL_NUM", this.f35764V2);
                    this.f35806d.startActivity(intent);
                }
            }
        } else if (id == f.f12172I5) {
            if (this.f35817e4.equals("tv")) {
                boolean playerIsPrepared = this.f35878n2.getPlayerIsPrepared();
                z4();
                t4();
                if (playerIsPrepared) {
                    l3(1000);
                    this.f35878n2.start();
                    this.f35723O3.setVisibility(8);
                    this.f35729P3.setVisibility(0);
                    view2 = this.f35729P3;
                } else {
                    l3(5000);
                    this.f35723O3.setVisibility(0);
                    view2 = this.f35723O3;
                }
                view2.requestFocus();
            } else {
                boolean playerIsPrepared2 = this.f35878n2.getPlayerIsPrepared();
                z4();
                u4();
                if (playerIsPrepared2) {
                    m3(1000);
                    this.f35878n2.start();
                    this.f35723O3.setVisibility(8);
                    imageView = this.f35729P3;
                } else {
                    m3(5000);
                    imageView = this.f35723O3;
                }
                imageView.setVisibility(0);
            }
        } else if (id == f.f12162H5) {
            try {
                if (this.f35817e4.equals("tv")) {
                    z4();
                    t4();
                    this.f35878n2.pause();
                    this.f35729P3.setVisibility(8);
                    this.f35723O3.setVisibility(0);
                    this.f35723O3.requestFocus();
                } else {
                    z4();
                    u4();
                    this.f35878n2.pause();
                    this.f35729P3.setVisibility(8);
                    this.f35723O3.setVisibility(0);
                }
            } catch (Exception e9) {
                str = "exection " + e9;
                str2 = "NSTIJPLAYERACTIVTY";
                Log.e(str2, str);
            }
        } else if (id == f.x9) {
            try {
                AsyncTask asyncTask = this.f35655D2;
                if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    this.f35655D2.cancel(true);
                }
                this.f35965z5 = Boolean.FALSE;
                this.f35757U1.removeCallbacksAndMessages(null);
                this.f35757U1.postDelayed(new RunnableC1497n(), 5000L);
                z4();
                u4();
                l3(5000);
                if (this.f35878n2 != null) {
                    this.f35727P1.removeCallbacksAndMessages(null);
                    h4();
                    this.f35791a1 = true;
                    int currentWindowIndex = this.f35878n2.getCurrentWindowIndex();
                    ArrayList arrayList = this.f35666F0;
                    if (arrayList != null && arrayList.size() > 1 && currentWindowIndex <= this.f35666F0.size() - 1 && currentWindowIndex > -1) {
                        String name = ((LiveStreamsDBModel) this.f35666F0.get(currentWindowIndex)).getName();
                        String num = ((LiveStreamsDBModel) this.f35666F0.get(currentWindowIndex)).getNum();
                        this.f35764V2 = m7.w.r0(((LiveStreamsDBModel) this.f35666F0.get(currentWindowIndex)).getNum());
                        String url = ((LiveStreamsDBModel) this.f35666F0.get(currentWindowIndex)).getUrl();
                        this.f35685I1 = url;
                        String streamIcon = ((LiveStreamsDBModel) this.f35666F0.get(currentWindowIndex)).getStreamIcon();
                        this.f35853j5 = ((LiveStreamsDBModel) this.f35666F0.get(currentWindowIndex)).getCategoryId();
                        this.f35874m5 = ((LiveStreamsDBModel) this.f35666F0.get(currentWindowIndex)).getName();
                        try {
                            if (streamIcon.equals("") || streamIcon.isEmpty()) {
                                this.f35645C.setImageDrawable(this.f35806d.getResources().getDrawable(a7.e.f12016i1));
                            } else {
                                com.squareup.picasso.t.q(this.f35806d).l(streamIcon).j(a7.e.f12016i1).d(a7.e.f12016i1).k(80, 55).g(this.f35645C);
                            }
                        } catch (Exception unused3) {
                            this.f35645C.setImageDrawable(this.f35806d.getResources().getDrawable(a7.e.f12016i1));
                        }
                        this.f35878n2.setTitle(num + " - " + name);
                        this.f35787Z1 = currentWindowIndex;
                        this.f35769W1.clear();
                        this.f35769W1.apply();
                        this.f35775X1.clear();
                        this.f35775X1.apply();
                        this.f35763V1.clear();
                        this.f35763V1.apply();
                        if (this.f35920t2.booleanValue()) {
                            this.f35727P1.postDelayed(new RunnableC1498o(currentWindowIndex, name, url), SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("stalker_api") ? 1000 : 200);
                        }
                        this.f35739R1.removeCallbacksAndMessages(null);
                        this.f35673G1 = m7.w.q0(((LiveStreamsDBModel) this.f35666F0.get(currentWindowIndex)).getStreamId());
                        this.f35679H1 = ((LiveStreamsDBModel) this.f35666F0.get(currentWindowIndex)).getStreamIdOneStream();
                        if (this.f35857k2.equals("m3u")) {
                            c2966aF = C2966a.f();
                            strValueOf = this.f35685I1;
                        } else if (this.f35857k2.equals("onestream_api")) {
                            c2966aF = C2966a.f();
                            strValueOf = this.f35679H1;
                        } else {
                            c2966aF = C2966a.f();
                            strValueOf = String.valueOf(this.f35673G1);
                        }
                        c2966aF.A(strValueOf);
                        if (this.f35697K1 != null) {
                            if (this.f35857k2.equals("onestream_api")) {
                                editor = this.f35697K1;
                                strValueOf2 = ((LiveStreamsDBModel) this.f35666F0.get(currentWindowIndex)).getStreamIdOneStream();
                            } else {
                                editor = this.f35697K1;
                                strValueOf2 = String.valueOf(((LiveStreamsDBModel) this.f35666F0.get(currentWindowIndex)).getStreamId());
                            }
                            editor.putString("currentlyPlayingVideo", strValueOf2);
                            this.f35697K1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", ((LiveStreamsDBModel) this.f35666F0.get(currentWindowIndex)).getUrl());
                            this.f35697K1.apply();
                        }
                        SharedPreferences.Editor editor2 = this.f35703L1;
                        if (editor2 != null) {
                            editor2.putInt("currentlyPlayingVideoPosition", currentWindowIndex);
                            this.f35703L1.apply();
                        }
                        if (this.f35674G2 != 0) {
                            this.f35674G2 = currentWindowIndex;
                        }
                    }
                }
            } catch (Exception e10) {
                str = "exection " + e10;
                str2 = "NSTIJPLAYERskyACTIVTY";
                Log.e(str2, str);
            }
        } else {
            if (id == f.T8) {
                try {
                    AsyncTask asyncTask2 = this.f35655D2;
                    if (asyncTask2 != null && asyncTask2.getStatus().equals(AsyncTask.Status.RUNNING)) {
                        this.f35655D2.cancel(true);
                    }
                    this.f35965z5 = Boolean.FALSE;
                    this.f35757U1.removeCallbacksAndMessages(null);
                    this.f35757U1.postDelayed(new p(), 5000L);
                    z4();
                    u4();
                    l3(5000);
                    if (this.f35878n2 != null) {
                        this.f35727P1.removeCallbacksAndMessages(null);
                        this.f35791a1 = true;
                        X3();
                        int currentWindowIndex2 = this.f35878n2.getCurrentWindowIndex();
                        ArrayList arrayList2 = this.f35666F0;
                        if (arrayList2 != null && arrayList2.size() > 1 && currentWindowIndex2 <= this.f35666F0.size() - 1 && currentWindowIndex2 > -1) {
                            String name2 = ((LiveStreamsDBModel) this.f35666F0.get(currentWindowIndex2)).getName();
                            String url2 = ((LiveStreamsDBModel) this.f35666F0.get(currentWindowIndex2)).getUrl();
                            this.f35685I1 = url2;
                            String num2 = ((LiveStreamsDBModel) this.f35666F0.get(currentWindowIndex2)).getNum();
                            this.f35764V2 = m7.w.r0(((LiveStreamsDBModel) this.f35666F0.get(currentWindowIndex2)).getNum());
                            String streamIcon2 = ((LiveStreamsDBModel) this.f35666F0.get(currentWindowIndex2)).getStreamIcon();
                            this.f35853j5 = ((LiveStreamsDBModel) this.f35666F0.get(currentWindowIndex2)).getCategoryId();
                            this.f35874m5 = ((LiveStreamsDBModel) this.f35666F0.get(currentWindowIndex2)).getName();
                            try {
                                if (streamIcon2.equals("") || streamIcon2.isEmpty()) {
                                    this.f35645C.setImageDrawable(this.f35806d.getResources().getDrawable(a7.e.f12016i1));
                                } else {
                                    com.squareup.picasso.t.q(this.f35806d).l(streamIcon2).j(a7.e.f12016i1).d(a7.e.f12016i1).k(80, 55).g(this.f35645C);
                                }
                            } catch (Exception unused4) {
                                this.f35645C.setImageDrawable(this.f35806d.getResources().getDrawable(a7.e.f12016i1));
                            }
                            this.f35878n2.setTitle(num2 + " - " + name2);
                            this.f35787Z1 = currentWindowIndex2;
                            this.f35769W1.clear();
                            this.f35769W1.apply();
                            this.f35775X1.clear();
                            this.f35775X1.apply();
                            this.f35763V1.clear();
                            this.f35763V1.apply();
                            if (this.f35920t2.booleanValue()) {
                                this.f35727P1.postDelayed(new q(currentWindowIndex2, name2, url2), SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("stalker_api") ? 1000 : 200);
                            }
                            this.f35739R1.removeCallbacksAndMessages(null);
                            this.f35673G1 = m7.w.q0(((LiveStreamsDBModel) this.f35666F0.get(currentWindowIndex2)).getStreamId());
                            if (this.f35857k2.equals("m3u")) {
                                c2966aF2 = C2966a.f();
                                strValueOf3 = this.f35685I1;
                            } else if (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("onestream_api")) {
                                c2966aF2 = C2966a.f();
                                strValueOf3 = String.valueOf(this.f35679H1);
                            } else {
                                c2966aF2 = C2966a.f();
                                strValueOf3 = String.valueOf(this.f35673G1);
                            }
                            c2966aF2.A(strValueOf3);
                            SharedPreferences.Editor editor3 = this.f35697K1;
                            if (editor3 != null) {
                                editor3.putString("currentlyPlayingVideo", String.valueOf(((LiveStreamsDBModel) this.f35666F0.get(currentWindowIndex2)).getStreamId()));
                                this.f35697K1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", ((LiveStreamsDBModel) this.f35666F0.get(currentWindowIndex2)).getUrl());
                                this.f35697K1.apply();
                            }
                            SharedPreferences.Editor editor4 = this.f35703L1;
                            if (editor4 != null) {
                                editor4.putInt("currentlyPlayingVideoPosition", currentWindowIndex2);
                                this.f35703L1.apply();
                            }
                            if (this.f35674G2 != 0) {
                                this.f35674G2 = currentWindowIndex2;
                            }
                        }
                    }
                } catch (Exception e11) {
                    str = "exection " + e11;
                    str2 = "NSTIJPLAYER";
                    Log.e(str2, str);
                }
            } else if (id != f.f12576x3 && id != f.f12566w3 && id != f.f12596z3 && id != f.Qm) {
                if (id == f.f12491p) {
                    try {
                        A3();
                    } catch (Exception e12) {
                        str = "exection " + e12.getMessage();
                        str2 = "NSTIJPLAYER";
                        Log.e(str2, str);
                    }
                } else if (id == f.f12337Z6 || id == f.f12111C4) {
                    z4();
                    M3();
                    w4();
                } else if (id == f.f12367c7 || id == f.f12131E4 || id == f.f12171I4 || id == f.f12181J4) {
                    onBackPressed();
                    onBackPressed();
                } else if (id == f.f12560v7) {
                    z4();
                    M3();
                    p4("player", true);
                } else if (id == f.f12104B7) {
                    z4();
                    l3(5000);
                    NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = this.f35878n2;
                    if (nSTIJKPlayerSkyTv != null) {
                        nSTIJKPlayerSkyTv.G1();
                    }
                } else if (id == f.f0if) {
                    view2 = this.f35717N3;
                    view2.requestFocus();
                } else if (view.getId() == f.f12590y7 || view.getId() == f.f12271S4) {
                    z4();
                    M3();
                    if (this.f35800b5.getVisibility() == 8) {
                        this.f35800b5.startAnimation(this.f35804c4);
                        this.f35800b5.setVisibility(0);
                        this.f35805c5.requestFocus();
                        this.f35772W4.requestFocus();
                        this.f35694J4.setChecked(false);
                        this.f35700K4.setChecked(false);
                        this.f35706L4.setChecked(false);
                        this.f35712M4.setChecked(false);
                        this.f35657D4.setChecked(false);
                        this.f35664E4.setChecked(false);
                        this.f35670F4.setChecked(false);
                        this.f35676G4.setChecked(false);
                        this.f35682H4.setChecked(false);
                        this.f35964z4.setChecked(false);
                        this.f35636A4.setChecked(false);
                        this.f35643B4.setChecked(false);
                        this.f35650C4.setChecked(false);
                        this.f35766V4.setText("");
                    }
                } else {
                    if (view.getId() == f.f12574x1) {
                        this.f35881n5 = this.f35718N4.getText().toString();
                        this.f35888o5 = this.f35742R4.getText().toString();
                        i10 = 0;
                        this.f35790Z4.setVisibility(0);
                        this.f35936v4.setVisibility(0);
                        i11 = 8;
                        this.f35929u4.setVisibility(8);
                        this.f35943w4.setVisibility(8);
                        this.f35839h5.setVisibility(8);
                    } else if (view.getId() == f.Jg) {
                        this.f35881n5 = this.f35724O4.getText().toString();
                        this.f35888o5 = this.f35748S4.getText().toString();
                        this.f35790Z4.setVisibility(0);
                        i11 = 8;
                        this.f35936v4.setVisibility(8);
                        this.f35839h5.setVisibility(8);
                        this.f35929u4.setVisibility(0);
                        this.f35766V4.setVisibility(0);
                        this.f35943w4.setVisibility(8);
                        this.f35688I4.setVisibility(i11);
                        textView = this.f35957y4;
                        resources = getResources();
                        i9 = a7.j.f13111Q7;
                        textView.setText(resources.getString(i9));
                    } else if (view.getId() == f.f12312X) {
                        this.f35881n5 = this.f35730P4.getText().toString();
                        this.f35888o5 = this.f35754T4.getText().toString();
                        i10 = 0;
                        this.f35790Z4.setVisibility(0);
                        i11 = 8;
                        this.f35936v4.setVisibility(8);
                        this.f35929u4.setVisibility(8);
                        this.f35839h5.setVisibility(8);
                        this.f35943w4.setVisibility(0);
                    } else if (view.getId() == f.f12440k) {
                        this.f35881n5 = this.f35736Q4.getText().toString();
                        this.f35888o5 = this.f35760U4.getText().toString();
                        this.f35790Z4.setVisibility(0);
                        this.f35936v4.setVisibility(8);
                        this.f35929u4.setVisibility(8);
                        this.f35943w4.setVisibility(8);
                        this.f35839h5.setVisibility(8);
                        this.f35688I4.setVisibility(0);
                        this.f35766V4.setVisibility(0);
                        textView = this.f35957y4;
                        resources = getResources();
                        i9 = a7.j.f13111Q7;
                        textView.setText(resources.getString(i9));
                    } else if (view.getId() == f.f12555v2) {
                        this.f35790Z4.setVisibility(0);
                        this.f35936v4.setVisibility(8);
                        this.f35929u4.setVisibility(8);
                        this.f35943w4.setVisibility(8);
                        this.f35688I4.setVisibility(8);
                        this.f35839h5.setVisibility(0);
                        this.f35766V4.setVisibility(4);
                        this.f35832g5.setVisibility(0);
                        textView = this.f35957y4;
                        resources = getResources();
                        i9 = a7.j.f13437y0;
                        textView.setText(resources.getString(i9));
                    } else if (view.getId() == f.tm) {
                        if (this.f35839h5.getVisibility() == 0) {
                            try {
                                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getResources().getString(a7.j.f13447z0))));
                            } catch (ActivityNotFoundException e13) {
                                Toast.makeText(this, "No application can handle this request. Please install a webbrowser", 1).show();
                                e13.printStackTrace();
                            }
                            this.f35800b5.setVisibility(8);
                        } else {
                            this.f35902q5 = this.f35766V4.getText().toString();
                            p3();
                            if (this.f35657D4.isChecked() || this.f35664E4.isChecked() || this.f35670F4.isChecked() || this.f35676G4.isChecked() || this.f35682H4.isChecked() || this.f35694J4.isChecked() || this.f35700K4.isChecked() || this.f35706L4.isChecked() || this.f35712M4.isChecked() || this.f35964z4.isChecked() || this.f35636A4.isChecked() || this.f35643B4.isChecked() || this.f35650C4.isChecked() || this.f35766V4.length() > 0) {
                                u1();
                                this.f35694J4.setChecked(false);
                                this.f35700K4.setChecked(false);
                                this.f35706L4.setChecked(false);
                                this.f35712M4.setChecked(false);
                                this.f35657D4.setChecked(false);
                                this.f35664E4.setChecked(false);
                                this.f35670F4.setChecked(false);
                                this.f35676G4.setChecked(false);
                                this.f35682H4.setChecked(false);
                                this.f35964z4.setChecked(false);
                                this.f35636A4.setChecked(false);
                                this.f35643B4.setChecked(false);
                                this.f35650C4.setChecked(false);
                                this.f35766V4.setText("");
                                RelativeLayout relativeLayout = this.f35800b5;
                                if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
                                    this.f35800b5.setVisibility(8);
                                    this.f35790Z4.setVisibility(8);
                                    this.f35790Z4.startAnimation(this.f35799b4);
                                    this.f35800b5.startAnimation(this.f35799b4);
                                    return;
                                }
                            } else {
                                Toast.makeText(this.f35806d, "Please Add Report", 0).show();
                            }
                        }
                    }
                    this.f35766V4.setVisibility(i10);
                    this.f35688I4.setVisibility(i11);
                    textView = this.f35957y4;
                    resources = getResources();
                    i9 = a7.j.f13111Q7;
                    textView.setText(resources.getString(i9));
                }
            }
            Log.e(str2, str);
        }
        view.getId();
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d3(configuration);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        SharedPreferences.Editor editor;
        String strValueOf;
        this.f35806d = this;
        super.onCreate(bundle);
        setContentView(a7.g.f12610B1);
        this.f35924u = (LinearLayout) findViewById(f.f12600z7);
        this.f35929u4 = (RelativeLayout) findViewById(f.Hg);
        this.f35936v4 = (RelativeLayout) findViewById(f.f12564w1);
        this.f35943w4 = (RelativeLayout) findViewById(f.f12330Z);
        this.f35950x4 = (TextView) findViewById(f.ym);
        this.f35964z4 = (CheckBox) findViewById(f.f12383e2);
        this.f35636A4 = (CheckBox) findViewById(f.f12403g2);
        this.f35643B4 = (CheckBox) findViewById(f.f12413h2);
        this.f35650C4 = (CheckBox) findViewById(f.f12393f2);
        this.f35657D4 = (CheckBox) findViewById(f.f12342a2);
        this.f35664E4 = (CheckBox) findViewById(f.f12362c2);
        this.f35670F4 = (CheckBox) findViewById(f.f12372d2);
        this.f35676G4 = (CheckBox) findViewById(f.f12352b2);
        this.f35682H4 = (CheckBox) findViewById(f.f12332Z1);
        this.f35688I4 = (RelativeLayout) findViewById(f.f12430j);
        this.f35694J4 = (CheckBox) findViewById(f.f12296V1);
        this.f35700K4 = (CheckBox) findViewById(f.f12314X1);
        this.f35706L4 = (CheckBox) findViewById(f.f12323Y1);
        this.f35712M4 = (CheckBox) findViewById(f.f12305W1);
        this.f35957y4 = (TextView) findViewById(f.tm);
        this.f35718N4 = (TextView) findViewById(f.f12554v1);
        this.f35724O4 = (TextView) findViewById(f.Fg);
        this.f35730P4 = (TextView) findViewById(f.f12340a0);
        this.f35736Q4 = (TextView) findViewById(f.f12450l);
        this.f35742R4 = (TextView) findViewById(f.f12584y1);
        this.f35748S4 = (TextView) findViewById(f.Lg);
        this.f35754T4 = (TextView) findViewById(f.f12350b0);
        this.f35760U4 = (TextView) findViewById(f.f12460m);
        this.f35766V4 = (EditText) findViewById(f.f12190K3);
        this.f35772W4 = (LinearLayout) findViewById(f.f12316X3);
        this.f35778X4 = (LinearLayout) findViewById(f.f12590y7);
        this.f35784Y4 = (LinearLayout) findViewById(f.xa);
        this.f35790Z4 = (LinearLayout) findViewById(f.f12339a);
        this.f35795a5 = (ImageView) findViewById(f.f12271S4);
        this.f35800b5 = (RelativeLayout) findViewById(f.ee);
        this.f35805c5 = (LinearLayout) findViewById(f.f12574x1);
        this.f35811d5 = (LinearLayout) findViewById(f.Jg);
        this.f35818e5 = (LinearLayout) findViewById(f.f12312X);
        this.f35825f5 = (LinearLayout) findViewById(f.f12440k);
        this.f35832g5 = (LinearLayout) findViewById(f.f12555v2);
        this.f35839h5 = (RelativeLayout) findViewById(f.f12545u2);
        this.f35788Z2 = (RadioGroup) findViewById(f.Kg);
        this.f35793a3 = (RadioGroup) findViewById(f.f12321Y);
        this.f35798b3 = (RadioGroup) findViewById(f.Gm);
        this.f35803c3 = (TextView) findViewById(f.Wl);
        this.f35858k3 = (FrameLayout) findViewById(f.f12307W3);
        this.f35865l3 = (SeekBar) findViewById(f.Lf);
        this.f35872m3 = (SeekBar) findViewById(f.Kf);
        this.f35879n3 = (LinearLayout) findViewById(f.f12438j7);
        this.f35886o3 = (LinearLayout) findViewById(f.Ea);
        this.f35809d3 = (TextView) findViewById(f.Mh);
        this.f35816e3 = (TextView) findViewById(f.mm);
        this.f35893p3 = (LinearLayout) findViewById(f.h9);
        this.f35687I3 = (RelativeLayout) findViewById(f.lf);
        this.f35693J3 = (RelativeLayout) findViewById(f.ne);
        this.f35699K3 = (RelativeLayout) findViewById(f.oe);
        this.f35823f3 = (TextView) findViewById(f.uk);
        this.f35830g3 = (TextView) findViewById(f.Ak);
        this.f35837h3 = (TextView) findViewById(f.Ck);
        this.f35900q3 = (LinearLayout) findViewById(f.t9);
        this.f35723O3 = (ImageView) findViewById(f.f12172I5);
        this.f35729P3 = (ImageView) findViewById(f.f12162H5);
        this.f35907r3 = (LinearLayout) findViewById(f.f12357b7);
        this.f35735Q3 = (ImageView) findViewById(f.f12171I4);
        this.f35741R3 = (ImageView) findViewById(f.f12181J4);
        this.f35747S3 = (ImageView) findViewById(f.f12131E4);
        this.f35914s3 = (LinearLayout) findViewById(f.f12367c7);
        this.f35753T3 = (ImageView) findViewById(f.f12111C4);
        this.f35921t3 = (LinearLayout) findViewById(f.f12104B7);
        this.f35928u3 = (LinearLayout) findViewById(f.f12328Y6);
        this.f35935v3 = (LinearLayout) findViewById(f.f12275S8);
        this.f35942w3 = (LinearLayout) findViewById(f.f12560v7);
        this.f35949x3 = (LinearLayout) findViewById(f.x9);
        this.f35956y3 = (LinearLayout) findViewById(f.T8);
        this.f35844i3 = (TextView) findViewById(f.lj);
        this.f35963z3 = (LinearLayout) findViewById(f.va);
        this.f35635A3 = (LinearLayout) findViewById(f.ya);
        this.f35642B3 = (LinearLayout) findViewById(f.wa);
        this.f35649C3 = (LinearLayout) findViewById(f.f12428i7);
        this.f35705L3 = (RecyclerView) findViewById(f.Fd);
        this.f35711M3 = (RecyclerView) findViewById(f.Gd);
        this.f35717N3 = (EditText) findViewById(f.f12464m3);
        this.f35656D3 = (LinearLayout) findViewById(f.W8);
        this.f35663E3 = (LinearLayout) findViewById(f.X8);
        this.f35681H3 = (RelativeLayout) findViewById(f.f0if);
        this.f35669F3 = (LinearLayout) findViewById(f.f12580x7);
        this.f35759U3 = (ImageView) findViewById(f.f12309W5);
        this.f35851j3 = (TextView) findViewById(f.ah);
        this.f35675G3 = (LinearLayout) findViewById(f.f12337Z6);
        if (!AbstractC2237a.f44475V0.booleanValue()) {
            this.f35784Y4.setVisibility(4);
        }
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        T3();
        RelativeLayout relativeLayout = this.f35814e1;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new ViewOnClickListenerC1494k());
        }
        this.f35690J0 = H3();
        if (this.f35697K1 != null) {
            if (this.f35857k2.equals("onestream_api")) {
                editor = this.f35697K1;
                strValueOf = this.f35955y2;
            } else {
                editor = this.f35697K1;
                strValueOf = String.valueOf(this.f35948x2);
            }
            editor.putString("currentlyPlayingVideo", strValueOf);
            this.f35697K1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", "0");
            this.f35697K1.apply();
        }
        this.f35827g0.deleteExtraLiveRecentlyWatched();
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("stalker_api")) {
            try {
                this.f35875n = SharepreferenceDBHandler.getStalkerToken(this.f35806d);
                String loggedInMacAddress = SharepreferenceDBHandler.getLoggedInMacAddress(this.f35806d);
                this.f35882o = loggedInMacAddress;
                this.f35868m.f(loggedInMacAddress, this.f35875n, 0);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        } else if (this.f35894p4.equals("false")) {
            m4();
        } else {
            String str = this.f35849j1;
            this.f35770W2 = str;
            this.f35915s4 = str;
            q7.N n9 = new q7.N(this.f35806d, str, "", this.f35901q4, this.f35894p4);
            this.f35831g4 = n9;
            this.f35776X2 = this.f35770W2;
            this.f35711M3.setAdapter(n9);
            this.f35711M3.setLayoutManager(this.f35859k4);
            h3(true);
        }
        if (!SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("stalker_api")) {
            m7.w.Z(this.f35806d);
        }
        F3();
        String strI1 = FreeTrailActivity.I1();
        this.f35867l5 = strI1;
        if (strI1.equals("") || this.f35867l5.isEmpty()) {
            this.f35867l5 = m7.w.I(this.f35806d);
        }
        this.f35694J4.setOnCheckedChangeListener(this);
        this.f35700K4.setOnCheckedChangeListener(this);
        this.f35706L4.setOnCheckedChangeListener(this);
        this.f35712M4.setOnCheckedChangeListener(this);
        this.f35657D4.setOnCheckedChangeListener(this);
        this.f35664E4.setOnCheckedChangeListener(this);
        this.f35670F4.setOnCheckedChangeListener(this);
        this.f35676G4.setOnCheckedChangeListener(this);
        this.f35682H4.setOnCheckedChangeListener(this);
        this.f35964z4.setOnCheckedChangeListener(this);
        this.f35636A4.setOnCheckedChangeListener(this);
        this.f35643B4.setOnCheckedChangeListener(this);
        this.f35650C4.setOnCheckedChangeListener(this);
        this.f35950x4.setOnClickListener(new w());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f35750T0.x(h.f12935r);
        this.f35829g2 = menu;
        this.f35836h2 = menu.getItem(2).getSubMenu().findItem(f.f12239P2);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("api")) {
            menu.getItem(2).getSubMenu().findItem(f.gb).setVisible(false);
        }
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("onestream_api")) {
            menu.getItem(2).getSubMenu().findItem(f.gb).setVisible(true);
        }
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f35806d.getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f35750T0.getChildCount(); i9++) {
            if (this.f35750T0.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f35750T0.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
        return true;
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            q3();
            i4();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        try {
            Thread thread = this.f35930u5;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f35930u5.interrupt();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // androidx.appcompat.app.b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        keyEvent.getRepeatCount();
        keyEvent.getAction();
        if (f35626G5 && this.f35649C3.getVisibility() == 8 && this.f35687I3.getVisibility() == 8 && this.f35699K3.getVisibility() == 8 && this.f35800b5.getVisibility() == 8) {
            if (i9 == 20) {
                if (this.f35920t2.booleanValue()) {
                    findViewById(f.x9).performClick();
                }
                return true;
            }
            if (i9 == 19) {
                if (this.f35920t2.booleanValue()) {
                    findViewById(f.T8).performClick();
                }
                return true;
            }
        }
        if (i9 == 166) {
            if (f35626G5 && this.f35920t2.booleanValue()) {
                findViewById(f.T8).performClick();
            }
            return true;
        }
        if (i9 != 167) {
            return super.onKeyDown(i9, keyEvent);
        }
        if (f35626G5 && this.f35920t2.booleanValue()) {
            findViewById(f.x9).performClick();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv;
        StringBuilder sb;
        boolean z9 = keyEvent.getRepeatCount() == 0;
        if (i9 != 62) {
            if (i9 != 66) {
                if (i9 != 79) {
                    if (i9 == 82) {
                        Menu menu = this.f35829g2;
                        if (menu != null) {
                            menu.performIdentifierAction(f.f12239P2, 0);
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
                                if (f35626G5 && !SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("stalker_api")) {
                                    this.f35751T1.removeCallbacksAndMessages(null);
                                    int i10 = 7;
                                    if (i9 == 7) {
                                        this.f35792a2.append(0);
                                    } else if (i9 == 8) {
                                        this.f35792a2.append(1);
                                    } else {
                                        if (i9 == 9) {
                                            sb = this.f35792a2;
                                            i10 = 2;
                                        } else if (i9 == 10) {
                                            sb = this.f35792a2;
                                            i10 = 3;
                                        } else if (i9 == 11) {
                                            sb = this.f35792a2;
                                            i10 = 4;
                                        } else if (i9 == 12) {
                                            sb = this.f35792a2;
                                            i10 = 5;
                                        } else if (i9 == 13) {
                                            sb = this.f35792a2;
                                            i10 = 6;
                                        } else if (i9 == 14) {
                                            sb = this.f35792a2;
                                        } else if (i9 == 15) {
                                            this.f35792a2.append(8);
                                        } else if (i9 == 16) {
                                            this.f35792a2.append(9);
                                        }
                                        sb.append(i10);
                                    }
                                    this.f35802c2.setText(this.f35792a2.toString());
                                    this.f35797b2.setVisibility(0);
                                    this.f35751T1.postDelayed(new RunnableC1496m(), 3000L);
                                }
                                return true;
                            default:
                                switch (i9) {
                                    case 19:
                                        z4();
                                        l3(5000);
                                        this.f35800b5.getVisibility();
                                        return true;
                                    case 20:
                                        z4();
                                        l3(5000);
                                        this.f35800b5.getVisibility();
                                        return true;
                                    case 21:
                                        z4();
                                        l3(5000);
                                        if (this.f35800b5.getVisibility() != 0 && f35626G5 && this.f35900q3.getVisibility() == 8 && this.f35699K3.getVisibility() == 8) {
                                            p4("player", true);
                                        }
                                        return true;
                                    case 22:
                                        z4();
                                        l3(5000);
                                        this.f35800b5.getVisibility();
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
            if (f35626G5 && this.f35800b5.getVisibility() == 8) {
                NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv2 = this.f35878n2;
                if (nSTIJKPlayerSkyTv2 == null || !nSTIJKPlayerSkyTv2.getPlayerIsPrepared()) {
                    A4();
                } else if (this.f35687I3.getVisibility() == 8) {
                    A4();
                    (this.f35878n2.isPlaying() ? this.f35729P3 : this.f35723O3).requestFocus();
                }
            }
            return true;
        }
        if (this.f35920t2.booleanValue() && (nSTIJKPlayerSkyTv = this.f35878n2) != null && nSTIJKPlayerSkyTv.getPlayerIsPrepared()) {
            ((!z9 || this.f35878n2.isPlaying()) ? this.f35729P3 : this.f35723O3).performClick();
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f35836h2 = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == f.Gb) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == f.Mb) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == f.f12390f && (context = this.f35806d) != null) {
            new a.C0158a(context, a7.k.f13456a).setTitle(this.f35806d.getResources().getString(a7.j.f13250f3)).f(this.f35806d.getResources().getString(a7.j.f13240e3)).j(this.f35806d.getResources().getString(a7.j.f13132S8), new v()).g(this.f35806d.getResources().getString(a7.j.f13231d4), new u()).n();
        }
        if (itemId == f.f12400g) {
            try {
                SearchView searchView = (SearchView) menuItem.getActionView();
                this.f35756U0 = searchView;
                if (searchView != null) {
                    searchView.setQueryHint(getResources().getString(a7.j.f12950A6));
                    this.f35756U0.setIconifiedByDefault(false);
                    ImageView imageView = (ImageView) this.f35756U0.findViewById(f.Uf);
                    ((ImageView) this.f35756U0.findViewById(f.Vf)).setImageResource(a7.e.f12032m1);
                    imageView.setImageResource(a7.e.f12032m1);
                    imageView.setPadding(15, 15, 15, 15);
                    imageView.setBackground(null);
                    this.f35756U0.setOnQueryTextListener(new y());
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        if (itemId == f.gb) {
            m7.w.A0(this.f35806d);
        }
        if (itemId == f.mb) {
            x4(this);
        }
        if (itemId == f.Db) {
            q4();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        Handler handler;
        super.onPause();
        try {
            Thread thread = this.f35958y5;
            if (thread != null && thread.isAlive()) {
                this.f35958y5.interrupt();
            }
        } catch (Exception unused) {
        }
        try {
            if (this.f35965z5.booleanValue() || (handler = this.f35757U1) == null) {
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
                U3();
            } else if (Build.VERSION.SDK_INT >= 23 && !shouldShowRequestPermissionRationale(strArr[0])) {
                a.C0158a c0158a = new a.C0158a(this, a7.k.f13456a);
                View viewInflate = LayoutInflater.from(this).inflate(a7.g.f12738W3, (ViewGroup) null);
                Button button = (Button) viewInflate.findViewById(f.f12361c1);
                Button button2 = (Button) viewInflate.findViewById(f.f12286U0);
                button.setOnFocusChangeListener(new w.k((View) button, (Activity) this));
                button2.setOnFocusChangeListener(new w.k((View) button2, (Activity) this));
                button.setOnClickListener(new A());
                button2.setOnClickListener(new B());
                c0158a.setView(viewInflate);
                this.f35906r2 = c0158a.create();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f35906r2.getWindow();
                Objects.requireNonNull(window);
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                this.f35906r2.show();
                this.f35906r2.getWindow().setAttributes(layoutParams);
                this.f35906r2.setCancelable(false);
                this.f35906r2.show();
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f35958y5;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new E());
            this.f35958y5 = thread2;
            thread2.start();
        }
        m7.w.m(this.f35806d);
        if (this.f35680H2) {
            this.f35680H2 = false;
            y4();
        }
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            i4();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        if (z9) {
            d3(getResources().getConfiguration());
        }
    }

    public void p3() {
        this.f35909r5 = new ArrayList();
        this.f35916s5 = new JsonArray();
        if (this.f35657D4.isChecked()) {
            this.f35909r5.add(this.f35657D4.getText().toString());
            this.f35916s5.add(this.f35657D4.getText().toString());
        }
        if (this.f35664E4.isChecked()) {
            this.f35909r5.add(this.f35664E4.getText().toString());
            this.f35916s5.add(this.f35664E4.getText().toString());
        }
        if (this.f35670F4.isChecked()) {
            this.f35909r5.add(this.f35670F4.getText().toString());
            this.f35916s5.add(this.f35670F4.getText().toString());
        }
        if (this.f35676G4.isChecked()) {
            this.f35909r5.add(this.f35676G4.getText().toString());
            this.f35916s5.add(this.f35676G4.getText().toString());
        }
        if (this.f35682H4.isChecked()) {
            this.f35909r5.add(this.f35682H4.getText().toString());
            this.f35916s5.add(this.f35682H4.getText().toString());
        }
        if (this.f35964z4.isChecked()) {
            this.f35909r5.add(this.f35964z4.getText().toString());
            this.f35916s5.add(this.f35964z4.getText().toString());
        }
        if (this.f35636A4.isChecked()) {
            this.f35909r5.add(this.f35636A4.getText().toString());
            this.f35916s5.add(this.f35636A4.getText().toString());
        }
        if (this.f35643B4.isChecked()) {
            this.f35909r5.add(this.f35643B4.getText().toString());
            this.f35916s5.add(this.f35643B4.getText().toString());
        }
        if (this.f35650C4.isChecked()) {
            this.f35909r5.add(this.f35650C4.getText().toString());
            this.f35916s5.add(this.f35650C4.getText().toString());
        }
        if (this.f35694J4.isChecked()) {
            this.f35909r5.add(this.f35694J4.getText().toString());
            this.f35916s5.add(this.f35694J4.getText().toString());
        }
        if (this.f35700K4.isChecked()) {
            this.f35909r5.add(this.f35700K4.getText().toString());
            this.f35916s5.add(this.f35700K4.getText().toString());
        }
        if (this.f35706L4.isChecked()) {
            this.f35909r5.add(this.f35706L4.getText().toString());
            this.f35916s5.add(this.f35706L4.getText().toString());
        }
        if (this.f35712M4.isChecked()) {
            this.f35909r5.add(this.f35712M4.getText().toString());
            this.f35916s5.add(this.f35712M4.getText().toString());
        }
        this.f35923t5 = new Gson().toJson((JsonElement) this.f35916s5);
        Log.e("TAG", this.f35916s5 + "");
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

    public void t4() {
        View view;
        if (this.f35687I3.getVisibility() == 8 && this.f35900q3.getVisibility() == 8) {
            ViewOnClickListenerC1494k viewOnClickListenerC1494k = null;
            this.f35745S1.removeCallbacksAndMessages(null);
            B4(this.f35749T);
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f35806d).equals("stalker_api")) {
                C4(String.valueOf(this.f35673G1));
            } else {
                this.f35655D2 = new K(this, this.f35743S, viewOnClickListenerC1494k).execute(new String[0]);
            }
            this.f35739R1.removeCallbacksAndMessages(null);
            this.f35900q3.startAnimation(this.f35794a4);
            this.f35649C3.startAnimation(this.f35794a4);
            this.f35635A3.startAnimation(this.f35794a4);
            Boolean bool = AbstractC2237a.f44475V0;
            if (bool.booleanValue()) {
                this.f35784Y4.startAnimation(this.f35794a4);
            }
            this.f35642B3.startAnimation(this.f35794a4);
            this.f35649C3.setVisibility(0);
            this.f35635A3.setVisibility(0);
            if (bool.booleanValue()) {
                this.f35784Y4.setVisibility(0);
            }
            this.f35642B3.setVisibility(0);
            this.f35900q3.setVisibility(0);
            try {
                View view2 = this.f35917t;
                if (view2 == null || view2.getVisibility() != 0) {
                    View view3 = this.f35910s;
                    if (view3 == null || view3.getVisibility() != 0) {
                        return;
                    } else {
                        view = this.f35910s;
                    }
                } else {
                    view = this.f35917t;
                }
                view.requestFocus();
            } catch (Exception unused) {
            }
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
            this.f35833h = cmd;
            String[] strArrSplit = cmd.split("ffmpeg ", 0);
            if (strArrSplit.length == 2) {
                this.f35840i = strArrSplit[1];
            }
            if (str6.equals("playFirstTime")) {
                g4(this.f35660E0);
                if (this.f35791a1 && this.f35796b1 && !this.f35801c1.equals("")) {
                    this.f35674G2 = 0;
                    try {
                        this.f35674G2 = G3(this.f35660E0, m7.w.r0(this.f35801c1));
                    } catch (NumberFormatException | Exception unused) {
                    }
                    this.f35791a1 = false;
                    this.f35796b1 = false;
                }
                o4(this.f35660E0);
                return;
            }
            if (str6.equals("channel_click")) {
                d4(this.f35847j, this.f35812e);
                return;
            }
            if (str6.equals("channel_click_from_player")) {
                e4(this.f35854k, this.f35819f);
            } else if (str6.equals("zappingRight")) {
                E4(i11, str7, str8);
            } else if (str6.equals("zappingLeft")) {
                D4(i11, str7, str8);
            }
        } catch (Exception unused2) {
        }
    }

    public void u4() {
        if (this.f35900q3.getVisibility() == 8) {
            this.f35900q3.startAnimation(this.f35794a4);
            this.f35900q3.setVisibility(0);
            if (this.f35879n3.getVisibility() == 8) {
                this.f35879n3.startAnimation(this.f35794a4);
                this.f35879n3.setVisibility(0);
            }
            if (this.f35893p3.getVisibility() == 8) {
                this.f35893p3.startAnimation(this.f35794a4);
                this.f35893p3.setVisibility(0);
            }
            if (this.f35886o3.getVisibility() == 8) {
                this.f35886o3.startAnimation(this.f35794a4);
                this.f35886o3.setVisibility(0);
            }
        }
    }

    @Override // z7.g
    public void v0(String str) {
        try {
            StalkerLiveFavIdsSingleton.getInstance().setFavIdsList(null);
            this.f35868m.i(this.f35882o, this.f35875n);
        } catch (Exception unused) {
        }
    }

    public void w3() {
        runOnUiThread(new C());
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
    public void x3(java.util.HashMap r12) {
        /*
            Method dump skipped, instruction units count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.x3(java.util.HashMap):void");
    }

    @Override // z7.g
    public void y0(String str) {
    }

    public void y3() {
        try {
            W3();
            LinearLayout linearLayout = this.f35954y1;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            LinearLayout linearLayout2 = this.f35633A1;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            LinearLayout linearLayout3 = this.f35640B1;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
            LinearLayout linearLayout4 = this.f35647C1;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(8);
            }
            LinearLayout linearLayout5 = this.f35654D1;
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(8);
            }
            LinearLayout linearLayout6 = this.f35661E1;
            if (linearLayout6 != null) {
                linearLayout6.setVisibility(0);
            }
        } catch (Exception unused) {
        }
    }

    public void z4() {
        Handler handler = this.f35878n2.f37271Z0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }
}
