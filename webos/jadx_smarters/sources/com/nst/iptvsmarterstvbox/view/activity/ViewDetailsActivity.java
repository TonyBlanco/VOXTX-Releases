package com.nst.iptvsmarterstvbox.view.activity;

import android.R;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import com.nst.iptvsmarterstvbox.model.DownloadedDataModel;
import com.nst.iptvsmarterstvbox.model.FavouriteDBModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.VodAllCategoriesSingleton;
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
import com.nst.iptvsmarterstvbox.model.callback.TMDBPersonInfoCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBTrailerCallback;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.DownloadedDBHandler;
import com.nst.iptvsmarterstvbox.model.database.ExternalPlayerDataBase;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.RecentWatchDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass;
import com.nst.iptvsmarterstvbox.view.services.VideoDownloadService;
import com.squareup.picasso.C;
import com.squareup.picasso.InterfaceC1611e;
import com.squareup.picasso.t;
import i7.AbstractC1902a;
import j1.AbstractC2074a;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import k.U;
import m1.C2219a;
import m7.AbstractC2237a;
import m7.w;
import o4.C2325b;
import o4.C2328e;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.HttpHead;
import p1.InterfaceC2389c;
import q7.C2622f;
import q7.C2635t;
import q7.Z;
import q7.m0;
import w7.AbstractC2941e;
import w7.C2939c;
import z3.AbstractServiceC3053x;
import z3.C3052w;

/* JADX INFO: loaded from: classes4.dex */
public class ViewDetailsActivity extends androidx.appcompat.app.b implements View.OnClickListener, z7.n, z7.k, z7.g, z7.j {

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static String f32881x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static String f32882y1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public TextView f32883A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public TextView f32885B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public TextView f32887C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public TextView f32889D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public DatabaseHandler f32890D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public TextView f32891E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public PopupWindow f32892E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public RatingBar f32893F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public Button f32894F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ImageView f32895G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public String f32896G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public TextView f32897H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public DateFormat f32898H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public TextView f32899I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public String f32900I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public TextView f32901J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public TextView f32902J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public TextView f32903K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public MenuItem f32904K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public LinearLayout f32905L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public Menu f32906L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ScrollView f32907M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public NestedScrollView f32909N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public LinearLayout f32911O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public Button f32912O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public LinearLayout f32913P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public C2328e f32914P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public LinearLayout f32915Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public LinearLayout f32917R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public LinearLayout f32919S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public n7.h f32920S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public LinearLayout f32921T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public RecentWatchDBHandler f32922T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public LinearLayout f32923U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public LinearLayout f32925V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public LinearLayout f32927W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public RecyclerView f32928W0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public LinearLayout f32929X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public ImageView f32930X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f32931Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public C2622f f32932Y0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public LinearLayout f32933Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f32940e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public TextView f32941e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public String f32942e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public DownloadedDBHandler f32943f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ImageView f32944f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public String f32945f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f32946g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public RelativeLayout f32947g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public String f32948g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f32949h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public LinearLayout f32950h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public String f32951h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ProgressBar f32952i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ProgressBar f32953i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public String f32954i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ProgressBar f32955j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public LinearLayout f32956j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public String f32957j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f32958k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public androidx.appcompat.app.a f32959k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public int f32960k1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f32961l;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public String f32963l1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public ProgressDialog f32965m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public String f32966m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f32967n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public SharedPreferences f32968n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public int f32969n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f32970o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public SharedPreferences f32971o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public SimpleDateFormat f32972o1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public LiveStreamDBHandler f32974p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public n7.e f32975p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Toolbar f32976q;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public n7.g f32978q1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f32979r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f32982s;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public Date f32984s1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AppBarLayout f32985t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public RelativeLayout f32988u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public n7.l f32989u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ImageView f32991v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f32994w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f32997x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f32999y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f33001z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f32938d = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f32964m = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f32973p = "";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public Context f32962l0 = this;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f32977q0 = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f32980r0 = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public String f32983s0 = "";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public String f32986t0 = "";

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public String f32992v0 = "";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public String f32995w0 = "";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public String f32998x0 = "";

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f33000y0 = "";

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public String f33002z0 = "";

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f32884A0 = -1;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public String f32886B0 = "";

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public String f32888C0 = "";

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public String f32908M0 = "";

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public Boolean f32910N0 = Boolean.TRUE;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public String f32916Q0 = "";

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public String f32918R0 = "";

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public String f32924U0 = "";

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public String f32926V0 = "";

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public String f32934Z0 = "mobile";

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f32935a1 = 0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public boolean f32936b1 = false;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public int f32937c1 = 0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public String f32939d1 = "";

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public String f32981r1 = "";

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public ArrayList f32987t1 = new ArrayList();

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public ArrayList f32990u1 = new ArrayList();

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public ArrayList f32993v1 = new ArrayList();

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public BroadcastReceiver f32996w1 = new k();

    public class a implements InterfaceC2389c {

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.activity.ViewDetailsActivity$a$a, reason: collision with other inner class name */
        public class C0279a implements C {
            public C0279a() {
            }

            @Override // com.squareup.picasso.C
            public void a(Drawable drawable) {
                Log.d("TAG", "FAILED");
            }

            @Override // com.squareup.picasso.C
            public void b(Bitmap bitmap, t.e eVar) {
                ViewDetailsActivity.this.f32985t.setBackground(new BitmapDrawable(ViewDetailsActivity.this.f32962l0.getResources(), bitmap));
                ViewDetailsActivity viewDetailsActivity = ViewDetailsActivity.this;
                viewDetailsActivity.f32947g0.setBackgroundColor(viewDetailsActivity.getResources().getColor(a7.c.f11844B));
                ViewDetailsActivity viewDetailsActivity2 = ViewDetailsActivity.this;
                viewDetailsActivity2.f32976q.setBackgroundColor(viewDetailsActivity2.getResources().getColor(a7.c.f11844B));
            }

            @Override // com.squareup.picasso.C
            public void c(Drawable drawable) {
                Log.d("TAG", "Prepare Load");
            }
        }

        public class b implements InterfaceC1611e {
            public b() {
            }

            @Override // com.squareup.picasso.InterfaceC1611e
            public void a() {
                ViewDetailsActivity.this.f32991v.setBackgroundResource(a7.e.f12040o1);
            }

            @Override // com.squareup.picasso.InterfaceC1611e
            public void onSuccess() {
            }
        }

        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:118:0x01f6 A[Catch: JSONException -> 0x0065, TryCatch #4 {JSONException -> 0x0065, blocks: (B:4:0x0012, B:67:0x00f2, B:86:0x0164, B:88:0x016a, B:90:0x0170, B:92:0x017d, B:94:0x0189, B:96:0x018f, B:97:0x0192, B:99:0x0198, B:112:0x01bf, B:115:0x01cf, B:117:0x01d5, B:119:0x01ff, B:121:0x0207, B:123:0x020d, B:124:0x0214, B:127:0x021c, B:129:0x0220, B:132:0x0226, B:134:0x022c, B:136:0x0232, B:146:0x0263, B:148:0x0269, B:150:0x026d, B:153:0x0273, B:155:0x0279, B:157:0x027f, B:167:0x02b0, B:169:0x02b6, B:171:0x02ba, B:174:0x02c0, B:176:0x02c6, B:178:0x02dc, B:192:0x031e, B:195:0x0326, B:197:0x032c, B:199:0x0332, B:200:0x0339, B:202:0x0348, B:203:0x0350, B:206:0x0358, B:208:0x035e, B:210:0x0364, B:214:0x0375, B:216:0x037b, B:218:0x037f, B:221:0x0385, B:223:0x038b, B:225:0x03a1, B:226:0x03a5, B:237:0x03c9, B:239:0x03cf, B:241:0x03d3, B:243:0x03d7, B:251:0x042b, B:253:0x0436, B:254:0x0439, B:256:0x043f, B:257:0x0442, B:259:0x0448, B:227:0x03a9, B:228:0x03ae, B:230:0x03b4, B:231:0x03b7, B:233:0x03bd, B:234:0x03c0, B:236:0x03c6, B:211:0x036c, B:213:0x0372, B:179:0x02eb, B:180:0x02fa, B:182:0x0300, B:183:0x0303, B:185:0x0309, B:186:0x030c, B:188:0x0312, B:189:0x0315, B:191:0x031b, B:158:0x0295, B:160:0x029b, B:161:0x029e, B:163:0x02a4, B:164:0x02a7, B:166:0x02ad, B:137:0x0248, B:139:0x024e, B:140:0x0251, B:142:0x0257, B:143:0x025a, B:145:0x0260, B:118:0x01f6, B:100:0x019c, B:102:0x01a2, B:103:0x01a5, B:105:0x01ab, B:106:0x01af, B:108:0x01b5, B:109:0x01b8, B:85:0x0161, B:71:0x0103, B:62:0x00dc, B:58:0x00cc, B:53:0x00c0, B:48:0x00b4, B:43:0x00a8, B:38:0x009c, B:34:0x0091, B:25:0x007e, B:20:0x0072, B:12:0x0061, B:260:0x044c, B:262:0x0454, B:264:0x045a, B:265:0x0461, B:267:0x0467, B:268:0x046a, B:270:0x0470, B:271:0x0473, B:273:0x0479, B:274:0x047c, B:276:0x0482, B:277:0x0485, B:279:0x048b, B:280:0x048e, B:282:0x0494, B:283:0x0497, B:285:0x049d, B:286:0x04a0, B:288:0x04a6, B:289:0x04a9, B:245:0x03eb, B:248:0x03f3, B:249:0x040b, B:55:0x00c4, B:45:0x00ac, B:17:0x006a, B:73:0x0107, B:76:0x010f, B:78:0x0115, B:80:0x0137, B:82:0x0143, B:6:0x0029, B:7:0x0033, B:9:0x0039, B:50:0x00b8, B:22:0x0076, B:59:0x00cf, B:35:0x0094, B:40:0x00a0, B:68:0x00fb), top: B:309:0x0010, inners: #2, #5, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16, #17 }] */
        /* JADX WARN: Removed duplicated region for block: B:137:0x0248 A[Catch: JSONException -> 0x0065, TryCatch #4 {JSONException -> 0x0065, blocks: (B:4:0x0012, B:67:0x00f2, B:86:0x0164, B:88:0x016a, B:90:0x0170, B:92:0x017d, B:94:0x0189, B:96:0x018f, B:97:0x0192, B:99:0x0198, B:112:0x01bf, B:115:0x01cf, B:117:0x01d5, B:119:0x01ff, B:121:0x0207, B:123:0x020d, B:124:0x0214, B:127:0x021c, B:129:0x0220, B:132:0x0226, B:134:0x022c, B:136:0x0232, B:146:0x0263, B:148:0x0269, B:150:0x026d, B:153:0x0273, B:155:0x0279, B:157:0x027f, B:167:0x02b0, B:169:0x02b6, B:171:0x02ba, B:174:0x02c0, B:176:0x02c6, B:178:0x02dc, B:192:0x031e, B:195:0x0326, B:197:0x032c, B:199:0x0332, B:200:0x0339, B:202:0x0348, B:203:0x0350, B:206:0x0358, B:208:0x035e, B:210:0x0364, B:214:0x0375, B:216:0x037b, B:218:0x037f, B:221:0x0385, B:223:0x038b, B:225:0x03a1, B:226:0x03a5, B:237:0x03c9, B:239:0x03cf, B:241:0x03d3, B:243:0x03d7, B:251:0x042b, B:253:0x0436, B:254:0x0439, B:256:0x043f, B:257:0x0442, B:259:0x0448, B:227:0x03a9, B:228:0x03ae, B:230:0x03b4, B:231:0x03b7, B:233:0x03bd, B:234:0x03c0, B:236:0x03c6, B:211:0x036c, B:213:0x0372, B:179:0x02eb, B:180:0x02fa, B:182:0x0300, B:183:0x0303, B:185:0x0309, B:186:0x030c, B:188:0x0312, B:189:0x0315, B:191:0x031b, B:158:0x0295, B:160:0x029b, B:161:0x029e, B:163:0x02a4, B:164:0x02a7, B:166:0x02ad, B:137:0x0248, B:139:0x024e, B:140:0x0251, B:142:0x0257, B:143:0x025a, B:145:0x0260, B:118:0x01f6, B:100:0x019c, B:102:0x01a2, B:103:0x01a5, B:105:0x01ab, B:106:0x01af, B:108:0x01b5, B:109:0x01b8, B:85:0x0161, B:71:0x0103, B:62:0x00dc, B:58:0x00cc, B:53:0x00c0, B:48:0x00b4, B:43:0x00a8, B:38:0x009c, B:34:0x0091, B:25:0x007e, B:20:0x0072, B:12:0x0061, B:260:0x044c, B:262:0x0454, B:264:0x045a, B:265:0x0461, B:267:0x0467, B:268:0x046a, B:270:0x0470, B:271:0x0473, B:273:0x0479, B:274:0x047c, B:276:0x0482, B:277:0x0485, B:279:0x048b, B:280:0x048e, B:282:0x0494, B:283:0x0497, B:285:0x049d, B:286:0x04a0, B:288:0x04a6, B:289:0x04a9, B:245:0x03eb, B:248:0x03f3, B:249:0x040b, B:55:0x00c4, B:45:0x00ac, B:17:0x006a, B:73:0x0107, B:76:0x010f, B:78:0x0115, B:80:0x0137, B:82:0x0143, B:6:0x0029, B:7:0x0033, B:9:0x0039, B:50:0x00b8, B:22:0x0076, B:59:0x00cf, B:35:0x0094, B:40:0x00a0, B:68:0x00fb), top: B:309:0x0010, inners: #2, #5, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16, #17 }] */
        /* JADX WARN: Removed duplicated region for block: B:139:0x024e A[Catch: JSONException -> 0x0065, TryCatch #4 {JSONException -> 0x0065, blocks: (B:4:0x0012, B:67:0x00f2, B:86:0x0164, B:88:0x016a, B:90:0x0170, B:92:0x017d, B:94:0x0189, B:96:0x018f, B:97:0x0192, B:99:0x0198, B:112:0x01bf, B:115:0x01cf, B:117:0x01d5, B:119:0x01ff, B:121:0x0207, B:123:0x020d, B:124:0x0214, B:127:0x021c, B:129:0x0220, B:132:0x0226, B:134:0x022c, B:136:0x0232, B:146:0x0263, B:148:0x0269, B:150:0x026d, B:153:0x0273, B:155:0x0279, B:157:0x027f, B:167:0x02b0, B:169:0x02b6, B:171:0x02ba, B:174:0x02c0, B:176:0x02c6, B:178:0x02dc, B:192:0x031e, B:195:0x0326, B:197:0x032c, B:199:0x0332, B:200:0x0339, B:202:0x0348, B:203:0x0350, B:206:0x0358, B:208:0x035e, B:210:0x0364, B:214:0x0375, B:216:0x037b, B:218:0x037f, B:221:0x0385, B:223:0x038b, B:225:0x03a1, B:226:0x03a5, B:237:0x03c9, B:239:0x03cf, B:241:0x03d3, B:243:0x03d7, B:251:0x042b, B:253:0x0436, B:254:0x0439, B:256:0x043f, B:257:0x0442, B:259:0x0448, B:227:0x03a9, B:228:0x03ae, B:230:0x03b4, B:231:0x03b7, B:233:0x03bd, B:234:0x03c0, B:236:0x03c6, B:211:0x036c, B:213:0x0372, B:179:0x02eb, B:180:0x02fa, B:182:0x0300, B:183:0x0303, B:185:0x0309, B:186:0x030c, B:188:0x0312, B:189:0x0315, B:191:0x031b, B:158:0x0295, B:160:0x029b, B:161:0x029e, B:163:0x02a4, B:164:0x02a7, B:166:0x02ad, B:137:0x0248, B:139:0x024e, B:140:0x0251, B:142:0x0257, B:143:0x025a, B:145:0x0260, B:118:0x01f6, B:100:0x019c, B:102:0x01a2, B:103:0x01a5, B:105:0x01ab, B:106:0x01af, B:108:0x01b5, B:109:0x01b8, B:85:0x0161, B:71:0x0103, B:62:0x00dc, B:58:0x00cc, B:53:0x00c0, B:48:0x00b4, B:43:0x00a8, B:38:0x009c, B:34:0x0091, B:25:0x007e, B:20:0x0072, B:12:0x0061, B:260:0x044c, B:262:0x0454, B:264:0x045a, B:265:0x0461, B:267:0x0467, B:268:0x046a, B:270:0x0470, B:271:0x0473, B:273:0x0479, B:274:0x047c, B:276:0x0482, B:277:0x0485, B:279:0x048b, B:280:0x048e, B:282:0x0494, B:283:0x0497, B:285:0x049d, B:286:0x04a0, B:288:0x04a6, B:289:0x04a9, B:245:0x03eb, B:248:0x03f3, B:249:0x040b, B:55:0x00c4, B:45:0x00ac, B:17:0x006a, B:73:0x0107, B:76:0x010f, B:78:0x0115, B:80:0x0137, B:82:0x0143, B:6:0x0029, B:7:0x0033, B:9:0x0039, B:50:0x00b8, B:22:0x0076, B:59:0x00cf, B:35:0x0094, B:40:0x00a0, B:68:0x00fb), top: B:309:0x0010, inners: #2, #5, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16, #17 }] */
        /* JADX WARN: Removed duplicated region for block: B:142:0x0257 A[Catch: JSONException -> 0x0065, TryCatch #4 {JSONException -> 0x0065, blocks: (B:4:0x0012, B:67:0x00f2, B:86:0x0164, B:88:0x016a, B:90:0x0170, B:92:0x017d, B:94:0x0189, B:96:0x018f, B:97:0x0192, B:99:0x0198, B:112:0x01bf, B:115:0x01cf, B:117:0x01d5, B:119:0x01ff, B:121:0x0207, B:123:0x020d, B:124:0x0214, B:127:0x021c, B:129:0x0220, B:132:0x0226, B:134:0x022c, B:136:0x0232, B:146:0x0263, B:148:0x0269, B:150:0x026d, B:153:0x0273, B:155:0x0279, B:157:0x027f, B:167:0x02b0, B:169:0x02b6, B:171:0x02ba, B:174:0x02c0, B:176:0x02c6, B:178:0x02dc, B:192:0x031e, B:195:0x0326, B:197:0x032c, B:199:0x0332, B:200:0x0339, B:202:0x0348, B:203:0x0350, B:206:0x0358, B:208:0x035e, B:210:0x0364, B:214:0x0375, B:216:0x037b, B:218:0x037f, B:221:0x0385, B:223:0x038b, B:225:0x03a1, B:226:0x03a5, B:237:0x03c9, B:239:0x03cf, B:241:0x03d3, B:243:0x03d7, B:251:0x042b, B:253:0x0436, B:254:0x0439, B:256:0x043f, B:257:0x0442, B:259:0x0448, B:227:0x03a9, B:228:0x03ae, B:230:0x03b4, B:231:0x03b7, B:233:0x03bd, B:234:0x03c0, B:236:0x03c6, B:211:0x036c, B:213:0x0372, B:179:0x02eb, B:180:0x02fa, B:182:0x0300, B:183:0x0303, B:185:0x0309, B:186:0x030c, B:188:0x0312, B:189:0x0315, B:191:0x031b, B:158:0x0295, B:160:0x029b, B:161:0x029e, B:163:0x02a4, B:164:0x02a7, B:166:0x02ad, B:137:0x0248, B:139:0x024e, B:140:0x0251, B:142:0x0257, B:143:0x025a, B:145:0x0260, B:118:0x01f6, B:100:0x019c, B:102:0x01a2, B:103:0x01a5, B:105:0x01ab, B:106:0x01af, B:108:0x01b5, B:109:0x01b8, B:85:0x0161, B:71:0x0103, B:62:0x00dc, B:58:0x00cc, B:53:0x00c0, B:48:0x00b4, B:43:0x00a8, B:38:0x009c, B:34:0x0091, B:25:0x007e, B:20:0x0072, B:12:0x0061, B:260:0x044c, B:262:0x0454, B:264:0x045a, B:265:0x0461, B:267:0x0467, B:268:0x046a, B:270:0x0470, B:271:0x0473, B:273:0x0479, B:274:0x047c, B:276:0x0482, B:277:0x0485, B:279:0x048b, B:280:0x048e, B:282:0x0494, B:283:0x0497, B:285:0x049d, B:286:0x04a0, B:288:0x04a6, B:289:0x04a9, B:245:0x03eb, B:248:0x03f3, B:249:0x040b, B:55:0x00c4, B:45:0x00ac, B:17:0x006a, B:73:0x0107, B:76:0x010f, B:78:0x0115, B:80:0x0137, B:82:0x0143, B:6:0x0029, B:7:0x0033, B:9:0x0039, B:50:0x00b8, B:22:0x0076, B:59:0x00cf, B:35:0x0094, B:40:0x00a0, B:68:0x00fb), top: B:309:0x0010, inners: #2, #5, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16, #17 }] */
        /* JADX WARN: Removed duplicated region for block: B:145:0x0260 A[Catch: JSONException -> 0x0065, TryCatch #4 {JSONException -> 0x0065, blocks: (B:4:0x0012, B:67:0x00f2, B:86:0x0164, B:88:0x016a, B:90:0x0170, B:92:0x017d, B:94:0x0189, B:96:0x018f, B:97:0x0192, B:99:0x0198, B:112:0x01bf, B:115:0x01cf, B:117:0x01d5, B:119:0x01ff, B:121:0x0207, B:123:0x020d, B:124:0x0214, B:127:0x021c, B:129:0x0220, B:132:0x0226, B:134:0x022c, B:136:0x0232, B:146:0x0263, B:148:0x0269, B:150:0x026d, B:153:0x0273, B:155:0x0279, B:157:0x027f, B:167:0x02b0, B:169:0x02b6, B:171:0x02ba, B:174:0x02c0, B:176:0x02c6, B:178:0x02dc, B:192:0x031e, B:195:0x0326, B:197:0x032c, B:199:0x0332, B:200:0x0339, B:202:0x0348, B:203:0x0350, B:206:0x0358, B:208:0x035e, B:210:0x0364, B:214:0x0375, B:216:0x037b, B:218:0x037f, B:221:0x0385, B:223:0x038b, B:225:0x03a1, B:226:0x03a5, B:237:0x03c9, B:239:0x03cf, B:241:0x03d3, B:243:0x03d7, B:251:0x042b, B:253:0x0436, B:254:0x0439, B:256:0x043f, B:257:0x0442, B:259:0x0448, B:227:0x03a9, B:228:0x03ae, B:230:0x03b4, B:231:0x03b7, B:233:0x03bd, B:234:0x03c0, B:236:0x03c6, B:211:0x036c, B:213:0x0372, B:179:0x02eb, B:180:0x02fa, B:182:0x0300, B:183:0x0303, B:185:0x0309, B:186:0x030c, B:188:0x0312, B:189:0x0315, B:191:0x031b, B:158:0x0295, B:160:0x029b, B:161:0x029e, B:163:0x02a4, B:164:0x02a7, B:166:0x02ad, B:137:0x0248, B:139:0x024e, B:140:0x0251, B:142:0x0257, B:143:0x025a, B:145:0x0260, B:118:0x01f6, B:100:0x019c, B:102:0x01a2, B:103:0x01a5, B:105:0x01ab, B:106:0x01af, B:108:0x01b5, B:109:0x01b8, B:85:0x0161, B:71:0x0103, B:62:0x00dc, B:58:0x00cc, B:53:0x00c0, B:48:0x00b4, B:43:0x00a8, B:38:0x009c, B:34:0x0091, B:25:0x007e, B:20:0x0072, B:12:0x0061, B:260:0x044c, B:262:0x0454, B:264:0x045a, B:265:0x0461, B:267:0x0467, B:268:0x046a, B:270:0x0470, B:271:0x0473, B:273:0x0479, B:274:0x047c, B:276:0x0482, B:277:0x0485, B:279:0x048b, B:280:0x048e, B:282:0x0494, B:283:0x0497, B:285:0x049d, B:286:0x04a0, B:288:0x04a6, B:289:0x04a9, B:245:0x03eb, B:248:0x03f3, B:249:0x040b, B:55:0x00c4, B:45:0x00ac, B:17:0x006a, B:73:0x0107, B:76:0x010f, B:78:0x0115, B:80:0x0137, B:82:0x0143, B:6:0x0029, B:7:0x0033, B:9:0x0039, B:50:0x00b8, B:22:0x0076, B:59:0x00cf, B:35:0x0094, B:40:0x00a0, B:68:0x00fb), top: B:309:0x0010, inners: #2, #5, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16, #17 }] */
        /* JADX WARN: Removed duplicated region for block: B:158:0x0295 A[Catch: JSONException -> 0x0065, TryCatch #4 {JSONException -> 0x0065, blocks: (B:4:0x0012, B:67:0x00f2, B:86:0x0164, B:88:0x016a, B:90:0x0170, B:92:0x017d, B:94:0x0189, B:96:0x018f, B:97:0x0192, B:99:0x0198, B:112:0x01bf, B:115:0x01cf, B:117:0x01d5, B:119:0x01ff, B:121:0x0207, B:123:0x020d, B:124:0x0214, B:127:0x021c, B:129:0x0220, B:132:0x0226, B:134:0x022c, B:136:0x0232, B:146:0x0263, B:148:0x0269, B:150:0x026d, B:153:0x0273, B:155:0x0279, B:157:0x027f, B:167:0x02b0, B:169:0x02b6, B:171:0x02ba, B:174:0x02c0, B:176:0x02c6, B:178:0x02dc, B:192:0x031e, B:195:0x0326, B:197:0x032c, B:199:0x0332, B:200:0x0339, B:202:0x0348, B:203:0x0350, B:206:0x0358, B:208:0x035e, B:210:0x0364, B:214:0x0375, B:216:0x037b, B:218:0x037f, B:221:0x0385, B:223:0x038b, B:225:0x03a1, B:226:0x03a5, B:237:0x03c9, B:239:0x03cf, B:241:0x03d3, B:243:0x03d7, B:251:0x042b, B:253:0x0436, B:254:0x0439, B:256:0x043f, B:257:0x0442, B:259:0x0448, B:227:0x03a9, B:228:0x03ae, B:230:0x03b4, B:231:0x03b7, B:233:0x03bd, B:234:0x03c0, B:236:0x03c6, B:211:0x036c, B:213:0x0372, B:179:0x02eb, B:180:0x02fa, B:182:0x0300, B:183:0x0303, B:185:0x0309, B:186:0x030c, B:188:0x0312, B:189:0x0315, B:191:0x031b, B:158:0x0295, B:160:0x029b, B:161:0x029e, B:163:0x02a4, B:164:0x02a7, B:166:0x02ad, B:137:0x0248, B:139:0x024e, B:140:0x0251, B:142:0x0257, B:143:0x025a, B:145:0x0260, B:118:0x01f6, B:100:0x019c, B:102:0x01a2, B:103:0x01a5, B:105:0x01ab, B:106:0x01af, B:108:0x01b5, B:109:0x01b8, B:85:0x0161, B:71:0x0103, B:62:0x00dc, B:58:0x00cc, B:53:0x00c0, B:48:0x00b4, B:43:0x00a8, B:38:0x009c, B:34:0x0091, B:25:0x007e, B:20:0x0072, B:12:0x0061, B:260:0x044c, B:262:0x0454, B:264:0x045a, B:265:0x0461, B:267:0x0467, B:268:0x046a, B:270:0x0470, B:271:0x0473, B:273:0x0479, B:274:0x047c, B:276:0x0482, B:277:0x0485, B:279:0x048b, B:280:0x048e, B:282:0x0494, B:283:0x0497, B:285:0x049d, B:286:0x04a0, B:288:0x04a6, B:289:0x04a9, B:245:0x03eb, B:248:0x03f3, B:249:0x040b, B:55:0x00c4, B:45:0x00ac, B:17:0x006a, B:73:0x0107, B:76:0x010f, B:78:0x0115, B:80:0x0137, B:82:0x0143, B:6:0x0029, B:7:0x0033, B:9:0x0039, B:50:0x00b8, B:22:0x0076, B:59:0x00cf, B:35:0x0094, B:40:0x00a0, B:68:0x00fb), top: B:309:0x0010, inners: #2, #5, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16, #17 }] */
        /* JADX WARN: Removed duplicated region for block: B:160:0x029b A[Catch: JSONException -> 0x0065, TryCatch #4 {JSONException -> 0x0065, blocks: (B:4:0x0012, B:67:0x00f2, B:86:0x0164, B:88:0x016a, B:90:0x0170, B:92:0x017d, B:94:0x0189, B:96:0x018f, B:97:0x0192, B:99:0x0198, B:112:0x01bf, B:115:0x01cf, B:117:0x01d5, B:119:0x01ff, B:121:0x0207, B:123:0x020d, B:124:0x0214, B:127:0x021c, B:129:0x0220, B:132:0x0226, B:134:0x022c, B:136:0x0232, B:146:0x0263, B:148:0x0269, B:150:0x026d, B:153:0x0273, B:155:0x0279, B:157:0x027f, B:167:0x02b0, B:169:0x02b6, B:171:0x02ba, B:174:0x02c0, B:176:0x02c6, B:178:0x02dc, B:192:0x031e, B:195:0x0326, B:197:0x032c, B:199:0x0332, B:200:0x0339, B:202:0x0348, B:203:0x0350, B:206:0x0358, B:208:0x035e, B:210:0x0364, B:214:0x0375, B:216:0x037b, B:218:0x037f, B:221:0x0385, B:223:0x038b, B:225:0x03a1, B:226:0x03a5, B:237:0x03c9, B:239:0x03cf, B:241:0x03d3, B:243:0x03d7, B:251:0x042b, B:253:0x0436, B:254:0x0439, B:256:0x043f, B:257:0x0442, B:259:0x0448, B:227:0x03a9, B:228:0x03ae, B:230:0x03b4, B:231:0x03b7, B:233:0x03bd, B:234:0x03c0, B:236:0x03c6, B:211:0x036c, B:213:0x0372, B:179:0x02eb, B:180:0x02fa, B:182:0x0300, B:183:0x0303, B:185:0x0309, B:186:0x030c, B:188:0x0312, B:189:0x0315, B:191:0x031b, B:158:0x0295, B:160:0x029b, B:161:0x029e, B:163:0x02a4, B:164:0x02a7, B:166:0x02ad, B:137:0x0248, B:139:0x024e, B:140:0x0251, B:142:0x0257, B:143:0x025a, B:145:0x0260, B:118:0x01f6, B:100:0x019c, B:102:0x01a2, B:103:0x01a5, B:105:0x01ab, B:106:0x01af, B:108:0x01b5, B:109:0x01b8, B:85:0x0161, B:71:0x0103, B:62:0x00dc, B:58:0x00cc, B:53:0x00c0, B:48:0x00b4, B:43:0x00a8, B:38:0x009c, B:34:0x0091, B:25:0x007e, B:20:0x0072, B:12:0x0061, B:260:0x044c, B:262:0x0454, B:264:0x045a, B:265:0x0461, B:267:0x0467, B:268:0x046a, B:270:0x0470, B:271:0x0473, B:273:0x0479, B:274:0x047c, B:276:0x0482, B:277:0x0485, B:279:0x048b, B:280:0x048e, B:282:0x0494, B:283:0x0497, B:285:0x049d, B:286:0x04a0, B:288:0x04a6, B:289:0x04a9, B:245:0x03eb, B:248:0x03f3, B:249:0x040b, B:55:0x00c4, B:45:0x00ac, B:17:0x006a, B:73:0x0107, B:76:0x010f, B:78:0x0115, B:80:0x0137, B:82:0x0143, B:6:0x0029, B:7:0x0033, B:9:0x0039, B:50:0x00b8, B:22:0x0076, B:59:0x00cf, B:35:0x0094, B:40:0x00a0, B:68:0x00fb), top: B:309:0x0010, inners: #2, #5, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16, #17 }] */
        /* JADX WARN: Removed duplicated region for block: B:163:0x02a4 A[Catch: JSONException -> 0x0065, TryCatch #4 {JSONException -> 0x0065, blocks: (B:4:0x0012, B:67:0x00f2, B:86:0x0164, B:88:0x016a, B:90:0x0170, B:92:0x017d, B:94:0x0189, B:96:0x018f, B:97:0x0192, B:99:0x0198, B:112:0x01bf, B:115:0x01cf, B:117:0x01d5, B:119:0x01ff, B:121:0x0207, B:123:0x020d, B:124:0x0214, B:127:0x021c, B:129:0x0220, B:132:0x0226, B:134:0x022c, B:136:0x0232, B:146:0x0263, B:148:0x0269, B:150:0x026d, B:153:0x0273, B:155:0x0279, B:157:0x027f, B:167:0x02b0, B:169:0x02b6, B:171:0x02ba, B:174:0x02c0, B:176:0x02c6, B:178:0x02dc, B:192:0x031e, B:195:0x0326, B:197:0x032c, B:199:0x0332, B:200:0x0339, B:202:0x0348, B:203:0x0350, B:206:0x0358, B:208:0x035e, B:210:0x0364, B:214:0x0375, B:216:0x037b, B:218:0x037f, B:221:0x0385, B:223:0x038b, B:225:0x03a1, B:226:0x03a5, B:237:0x03c9, B:239:0x03cf, B:241:0x03d3, B:243:0x03d7, B:251:0x042b, B:253:0x0436, B:254:0x0439, B:256:0x043f, B:257:0x0442, B:259:0x0448, B:227:0x03a9, B:228:0x03ae, B:230:0x03b4, B:231:0x03b7, B:233:0x03bd, B:234:0x03c0, B:236:0x03c6, B:211:0x036c, B:213:0x0372, B:179:0x02eb, B:180:0x02fa, B:182:0x0300, B:183:0x0303, B:185:0x0309, B:186:0x030c, B:188:0x0312, B:189:0x0315, B:191:0x031b, B:158:0x0295, B:160:0x029b, B:161:0x029e, B:163:0x02a4, B:164:0x02a7, B:166:0x02ad, B:137:0x0248, B:139:0x024e, B:140:0x0251, B:142:0x0257, B:143:0x025a, B:145:0x0260, B:118:0x01f6, B:100:0x019c, B:102:0x01a2, B:103:0x01a5, B:105:0x01ab, B:106:0x01af, B:108:0x01b5, B:109:0x01b8, B:85:0x0161, B:71:0x0103, B:62:0x00dc, B:58:0x00cc, B:53:0x00c0, B:48:0x00b4, B:43:0x00a8, B:38:0x009c, B:34:0x0091, B:25:0x007e, B:20:0x0072, B:12:0x0061, B:260:0x044c, B:262:0x0454, B:264:0x045a, B:265:0x0461, B:267:0x0467, B:268:0x046a, B:270:0x0470, B:271:0x0473, B:273:0x0479, B:274:0x047c, B:276:0x0482, B:277:0x0485, B:279:0x048b, B:280:0x048e, B:282:0x0494, B:283:0x0497, B:285:0x049d, B:286:0x04a0, B:288:0x04a6, B:289:0x04a9, B:245:0x03eb, B:248:0x03f3, B:249:0x040b, B:55:0x00c4, B:45:0x00ac, B:17:0x006a, B:73:0x0107, B:76:0x010f, B:78:0x0115, B:80:0x0137, B:82:0x0143, B:6:0x0029, B:7:0x0033, B:9:0x0039, B:50:0x00b8, B:22:0x0076, B:59:0x00cf, B:35:0x0094, B:40:0x00a0, B:68:0x00fb), top: B:309:0x0010, inners: #2, #5, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16, #17 }] */
        /* JADX WARN: Removed duplicated region for block: B:166:0x02ad A[Catch: JSONException -> 0x0065, TryCatch #4 {JSONException -> 0x0065, blocks: (B:4:0x0012, B:67:0x00f2, B:86:0x0164, B:88:0x016a, B:90:0x0170, B:92:0x017d, B:94:0x0189, B:96:0x018f, B:97:0x0192, B:99:0x0198, B:112:0x01bf, B:115:0x01cf, B:117:0x01d5, B:119:0x01ff, B:121:0x0207, B:123:0x020d, B:124:0x0214, B:127:0x021c, B:129:0x0220, B:132:0x0226, B:134:0x022c, B:136:0x0232, B:146:0x0263, B:148:0x0269, B:150:0x026d, B:153:0x0273, B:155:0x0279, B:157:0x027f, B:167:0x02b0, B:169:0x02b6, B:171:0x02ba, B:174:0x02c0, B:176:0x02c6, B:178:0x02dc, B:192:0x031e, B:195:0x0326, B:197:0x032c, B:199:0x0332, B:200:0x0339, B:202:0x0348, B:203:0x0350, B:206:0x0358, B:208:0x035e, B:210:0x0364, B:214:0x0375, B:216:0x037b, B:218:0x037f, B:221:0x0385, B:223:0x038b, B:225:0x03a1, B:226:0x03a5, B:237:0x03c9, B:239:0x03cf, B:241:0x03d3, B:243:0x03d7, B:251:0x042b, B:253:0x0436, B:254:0x0439, B:256:0x043f, B:257:0x0442, B:259:0x0448, B:227:0x03a9, B:228:0x03ae, B:230:0x03b4, B:231:0x03b7, B:233:0x03bd, B:234:0x03c0, B:236:0x03c6, B:211:0x036c, B:213:0x0372, B:179:0x02eb, B:180:0x02fa, B:182:0x0300, B:183:0x0303, B:185:0x0309, B:186:0x030c, B:188:0x0312, B:189:0x0315, B:191:0x031b, B:158:0x0295, B:160:0x029b, B:161:0x029e, B:163:0x02a4, B:164:0x02a7, B:166:0x02ad, B:137:0x0248, B:139:0x024e, B:140:0x0251, B:142:0x0257, B:143:0x025a, B:145:0x0260, B:118:0x01f6, B:100:0x019c, B:102:0x01a2, B:103:0x01a5, B:105:0x01ab, B:106:0x01af, B:108:0x01b5, B:109:0x01b8, B:85:0x0161, B:71:0x0103, B:62:0x00dc, B:58:0x00cc, B:53:0x00c0, B:48:0x00b4, B:43:0x00a8, B:38:0x009c, B:34:0x0091, B:25:0x007e, B:20:0x0072, B:12:0x0061, B:260:0x044c, B:262:0x0454, B:264:0x045a, B:265:0x0461, B:267:0x0467, B:268:0x046a, B:270:0x0470, B:271:0x0473, B:273:0x0479, B:274:0x047c, B:276:0x0482, B:277:0x0485, B:279:0x048b, B:280:0x048e, B:282:0x0494, B:283:0x0497, B:285:0x049d, B:286:0x04a0, B:288:0x04a6, B:289:0x04a9, B:245:0x03eb, B:248:0x03f3, B:249:0x040b, B:55:0x00c4, B:45:0x00ac, B:17:0x006a, B:73:0x0107, B:76:0x010f, B:78:0x0115, B:80:0x0137, B:82:0x0143, B:6:0x0029, B:7:0x0033, B:9:0x0039, B:50:0x00b8, B:22:0x0076, B:59:0x00cf, B:35:0x0094, B:40:0x00a0, B:68:0x00fb), top: B:309:0x0010, inners: #2, #5, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16, #17 }] */
        /* JADX WARN: Removed duplicated region for block: B:180:0x02fa A[Catch: JSONException -> 0x0065, TryCatch #4 {JSONException -> 0x0065, blocks: (B:4:0x0012, B:67:0x00f2, B:86:0x0164, B:88:0x016a, B:90:0x0170, B:92:0x017d, B:94:0x0189, B:96:0x018f, B:97:0x0192, B:99:0x0198, B:112:0x01bf, B:115:0x01cf, B:117:0x01d5, B:119:0x01ff, B:121:0x0207, B:123:0x020d, B:124:0x0214, B:127:0x021c, B:129:0x0220, B:132:0x0226, B:134:0x022c, B:136:0x0232, B:146:0x0263, B:148:0x0269, B:150:0x026d, B:153:0x0273, B:155:0x0279, B:157:0x027f, B:167:0x02b0, B:169:0x02b6, B:171:0x02ba, B:174:0x02c0, B:176:0x02c6, B:178:0x02dc, B:192:0x031e, B:195:0x0326, B:197:0x032c, B:199:0x0332, B:200:0x0339, B:202:0x0348, B:203:0x0350, B:206:0x0358, B:208:0x035e, B:210:0x0364, B:214:0x0375, B:216:0x037b, B:218:0x037f, B:221:0x0385, B:223:0x038b, B:225:0x03a1, B:226:0x03a5, B:237:0x03c9, B:239:0x03cf, B:241:0x03d3, B:243:0x03d7, B:251:0x042b, B:253:0x0436, B:254:0x0439, B:256:0x043f, B:257:0x0442, B:259:0x0448, B:227:0x03a9, B:228:0x03ae, B:230:0x03b4, B:231:0x03b7, B:233:0x03bd, B:234:0x03c0, B:236:0x03c6, B:211:0x036c, B:213:0x0372, B:179:0x02eb, B:180:0x02fa, B:182:0x0300, B:183:0x0303, B:185:0x0309, B:186:0x030c, B:188:0x0312, B:189:0x0315, B:191:0x031b, B:158:0x0295, B:160:0x029b, B:161:0x029e, B:163:0x02a4, B:164:0x02a7, B:166:0x02ad, B:137:0x0248, B:139:0x024e, B:140:0x0251, B:142:0x0257, B:143:0x025a, B:145:0x0260, B:118:0x01f6, B:100:0x019c, B:102:0x01a2, B:103:0x01a5, B:105:0x01ab, B:106:0x01af, B:108:0x01b5, B:109:0x01b8, B:85:0x0161, B:71:0x0103, B:62:0x00dc, B:58:0x00cc, B:53:0x00c0, B:48:0x00b4, B:43:0x00a8, B:38:0x009c, B:34:0x0091, B:25:0x007e, B:20:0x0072, B:12:0x0061, B:260:0x044c, B:262:0x0454, B:264:0x045a, B:265:0x0461, B:267:0x0467, B:268:0x046a, B:270:0x0470, B:271:0x0473, B:273:0x0479, B:274:0x047c, B:276:0x0482, B:277:0x0485, B:279:0x048b, B:280:0x048e, B:282:0x0494, B:283:0x0497, B:285:0x049d, B:286:0x04a0, B:288:0x04a6, B:289:0x04a9, B:245:0x03eb, B:248:0x03f3, B:249:0x040b, B:55:0x00c4, B:45:0x00ac, B:17:0x006a, B:73:0x0107, B:76:0x010f, B:78:0x0115, B:80:0x0137, B:82:0x0143, B:6:0x0029, B:7:0x0033, B:9:0x0039, B:50:0x00b8, B:22:0x0076, B:59:0x00cf, B:35:0x0094, B:40:0x00a0, B:68:0x00fb), top: B:309:0x0010, inners: #2, #5, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16, #17 }] */
        /* JADX WARN: Removed duplicated region for block: B:182:0x0300 A[Catch: JSONException -> 0x0065, TryCatch #4 {JSONException -> 0x0065, blocks: (B:4:0x0012, B:67:0x00f2, B:86:0x0164, B:88:0x016a, B:90:0x0170, B:92:0x017d, B:94:0x0189, B:96:0x018f, B:97:0x0192, B:99:0x0198, B:112:0x01bf, B:115:0x01cf, B:117:0x01d5, B:119:0x01ff, B:121:0x0207, B:123:0x020d, B:124:0x0214, B:127:0x021c, B:129:0x0220, B:132:0x0226, B:134:0x022c, B:136:0x0232, B:146:0x0263, B:148:0x0269, B:150:0x026d, B:153:0x0273, B:155:0x0279, B:157:0x027f, B:167:0x02b0, B:169:0x02b6, B:171:0x02ba, B:174:0x02c0, B:176:0x02c6, B:178:0x02dc, B:192:0x031e, B:195:0x0326, B:197:0x032c, B:199:0x0332, B:200:0x0339, B:202:0x0348, B:203:0x0350, B:206:0x0358, B:208:0x035e, B:210:0x0364, B:214:0x0375, B:216:0x037b, B:218:0x037f, B:221:0x0385, B:223:0x038b, B:225:0x03a1, B:226:0x03a5, B:237:0x03c9, B:239:0x03cf, B:241:0x03d3, B:243:0x03d7, B:251:0x042b, B:253:0x0436, B:254:0x0439, B:256:0x043f, B:257:0x0442, B:259:0x0448, B:227:0x03a9, B:228:0x03ae, B:230:0x03b4, B:231:0x03b7, B:233:0x03bd, B:234:0x03c0, B:236:0x03c6, B:211:0x036c, B:213:0x0372, B:179:0x02eb, B:180:0x02fa, B:182:0x0300, B:183:0x0303, B:185:0x0309, B:186:0x030c, B:188:0x0312, B:189:0x0315, B:191:0x031b, B:158:0x0295, B:160:0x029b, B:161:0x029e, B:163:0x02a4, B:164:0x02a7, B:166:0x02ad, B:137:0x0248, B:139:0x024e, B:140:0x0251, B:142:0x0257, B:143:0x025a, B:145:0x0260, B:118:0x01f6, B:100:0x019c, B:102:0x01a2, B:103:0x01a5, B:105:0x01ab, B:106:0x01af, B:108:0x01b5, B:109:0x01b8, B:85:0x0161, B:71:0x0103, B:62:0x00dc, B:58:0x00cc, B:53:0x00c0, B:48:0x00b4, B:43:0x00a8, B:38:0x009c, B:34:0x0091, B:25:0x007e, B:20:0x0072, B:12:0x0061, B:260:0x044c, B:262:0x0454, B:264:0x045a, B:265:0x0461, B:267:0x0467, B:268:0x046a, B:270:0x0470, B:271:0x0473, B:273:0x0479, B:274:0x047c, B:276:0x0482, B:277:0x0485, B:279:0x048b, B:280:0x048e, B:282:0x0494, B:283:0x0497, B:285:0x049d, B:286:0x04a0, B:288:0x04a6, B:289:0x04a9, B:245:0x03eb, B:248:0x03f3, B:249:0x040b, B:55:0x00c4, B:45:0x00ac, B:17:0x006a, B:73:0x0107, B:76:0x010f, B:78:0x0115, B:80:0x0137, B:82:0x0143, B:6:0x0029, B:7:0x0033, B:9:0x0039, B:50:0x00b8, B:22:0x0076, B:59:0x00cf, B:35:0x0094, B:40:0x00a0, B:68:0x00fb), top: B:309:0x0010, inners: #2, #5, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16, #17 }] */
        /* JADX WARN: Removed duplicated region for block: B:185:0x0309 A[Catch: JSONException -> 0x0065, TryCatch #4 {JSONException -> 0x0065, blocks: (B:4:0x0012, B:67:0x00f2, B:86:0x0164, B:88:0x016a, B:90:0x0170, B:92:0x017d, B:94:0x0189, B:96:0x018f, B:97:0x0192, B:99:0x0198, B:112:0x01bf, B:115:0x01cf, B:117:0x01d5, B:119:0x01ff, B:121:0x0207, B:123:0x020d, B:124:0x0214, B:127:0x021c, B:129:0x0220, B:132:0x0226, B:134:0x022c, B:136:0x0232, B:146:0x0263, B:148:0x0269, B:150:0x026d, B:153:0x0273, B:155:0x0279, B:157:0x027f, B:167:0x02b0, B:169:0x02b6, B:171:0x02ba, B:174:0x02c0, B:176:0x02c6, B:178:0x02dc, B:192:0x031e, B:195:0x0326, B:197:0x032c, B:199:0x0332, B:200:0x0339, B:202:0x0348, B:203:0x0350, B:206:0x0358, B:208:0x035e, B:210:0x0364, B:214:0x0375, B:216:0x037b, B:218:0x037f, B:221:0x0385, B:223:0x038b, B:225:0x03a1, B:226:0x03a5, B:237:0x03c9, B:239:0x03cf, B:241:0x03d3, B:243:0x03d7, B:251:0x042b, B:253:0x0436, B:254:0x0439, B:256:0x043f, B:257:0x0442, B:259:0x0448, B:227:0x03a9, B:228:0x03ae, B:230:0x03b4, B:231:0x03b7, B:233:0x03bd, B:234:0x03c0, B:236:0x03c6, B:211:0x036c, B:213:0x0372, B:179:0x02eb, B:180:0x02fa, B:182:0x0300, B:183:0x0303, B:185:0x0309, B:186:0x030c, B:188:0x0312, B:189:0x0315, B:191:0x031b, B:158:0x0295, B:160:0x029b, B:161:0x029e, B:163:0x02a4, B:164:0x02a7, B:166:0x02ad, B:137:0x0248, B:139:0x024e, B:140:0x0251, B:142:0x0257, B:143:0x025a, B:145:0x0260, B:118:0x01f6, B:100:0x019c, B:102:0x01a2, B:103:0x01a5, B:105:0x01ab, B:106:0x01af, B:108:0x01b5, B:109:0x01b8, B:85:0x0161, B:71:0x0103, B:62:0x00dc, B:58:0x00cc, B:53:0x00c0, B:48:0x00b4, B:43:0x00a8, B:38:0x009c, B:34:0x0091, B:25:0x007e, B:20:0x0072, B:12:0x0061, B:260:0x044c, B:262:0x0454, B:264:0x045a, B:265:0x0461, B:267:0x0467, B:268:0x046a, B:270:0x0470, B:271:0x0473, B:273:0x0479, B:274:0x047c, B:276:0x0482, B:277:0x0485, B:279:0x048b, B:280:0x048e, B:282:0x0494, B:283:0x0497, B:285:0x049d, B:286:0x04a0, B:288:0x04a6, B:289:0x04a9, B:245:0x03eb, B:248:0x03f3, B:249:0x040b, B:55:0x00c4, B:45:0x00ac, B:17:0x006a, B:73:0x0107, B:76:0x010f, B:78:0x0115, B:80:0x0137, B:82:0x0143, B:6:0x0029, B:7:0x0033, B:9:0x0039, B:50:0x00b8, B:22:0x0076, B:59:0x00cf, B:35:0x0094, B:40:0x00a0, B:68:0x00fb), top: B:309:0x0010, inners: #2, #5, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16, #17 }] */
        /* JADX WARN: Removed duplicated region for block: B:188:0x0312 A[Catch: JSONException -> 0x0065, TryCatch #4 {JSONException -> 0x0065, blocks: (B:4:0x0012, B:67:0x00f2, B:86:0x0164, B:88:0x016a, B:90:0x0170, B:92:0x017d, B:94:0x0189, B:96:0x018f, B:97:0x0192, B:99:0x0198, B:112:0x01bf, B:115:0x01cf, B:117:0x01d5, B:119:0x01ff, B:121:0x0207, B:123:0x020d, B:124:0x0214, B:127:0x021c, B:129:0x0220, B:132:0x0226, B:134:0x022c, B:136:0x0232, B:146:0x0263, B:148:0x0269, B:150:0x026d, B:153:0x0273, B:155:0x0279, B:157:0x027f, B:167:0x02b0, B:169:0x02b6, B:171:0x02ba, B:174:0x02c0, B:176:0x02c6, B:178:0x02dc, B:192:0x031e, B:195:0x0326, B:197:0x032c, B:199:0x0332, B:200:0x0339, B:202:0x0348, B:203:0x0350, B:206:0x0358, B:208:0x035e, B:210:0x0364, B:214:0x0375, B:216:0x037b, B:218:0x037f, B:221:0x0385, B:223:0x038b, B:225:0x03a1, B:226:0x03a5, B:237:0x03c9, B:239:0x03cf, B:241:0x03d3, B:243:0x03d7, B:251:0x042b, B:253:0x0436, B:254:0x0439, B:256:0x043f, B:257:0x0442, B:259:0x0448, B:227:0x03a9, B:228:0x03ae, B:230:0x03b4, B:231:0x03b7, B:233:0x03bd, B:234:0x03c0, B:236:0x03c6, B:211:0x036c, B:213:0x0372, B:179:0x02eb, B:180:0x02fa, B:182:0x0300, B:183:0x0303, B:185:0x0309, B:186:0x030c, B:188:0x0312, B:189:0x0315, B:191:0x031b, B:158:0x0295, B:160:0x029b, B:161:0x029e, B:163:0x02a4, B:164:0x02a7, B:166:0x02ad, B:137:0x0248, B:139:0x024e, B:140:0x0251, B:142:0x0257, B:143:0x025a, B:145:0x0260, B:118:0x01f6, B:100:0x019c, B:102:0x01a2, B:103:0x01a5, B:105:0x01ab, B:106:0x01af, B:108:0x01b5, B:109:0x01b8, B:85:0x0161, B:71:0x0103, B:62:0x00dc, B:58:0x00cc, B:53:0x00c0, B:48:0x00b4, B:43:0x00a8, B:38:0x009c, B:34:0x0091, B:25:0x007e, B:20:0x0072, B:12:0x0061, B:260:0x044c, B:262:0x0454, B:264:0x045a, B:265:0x0461, B:267:0x0467, B:268:0x046a, B:270:0x0470, B:271:0x0473, B:273:0x0479, B:274:0x047c, B:276:0x0482, B:277:0x0485, B:279:0x048b, B:280:0x048e, B:282:0x0494, B:283:0x0497, B:285:0x049d, B:286:0x04a0, B:288:0x04a6, B:289:0x04a9, B:245:0x03eb, B:248:0x03f3, B:249:0x040b, B:55:0x00c4, B:45:0x00ac, B:17:0x006a, B:73:0x0107, B:76:0x010f, B:78:0x0115, B:80:0x0137, B:82:0x0143, B:6:0x0029, B:7:0x0033, B:9:0x0039, B:50:0x00b8, B:22:0x0076, B:59:0x00cf, B:35:0x0094, B:40:0x00a0, B:68:0x00fb), top: B:309:0x0010, inners: #2, #5, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16, #17 }] */
        /* JADX WARN: Removed duplicated region for block: B:191:0x031b A[Catch: JSONException -> 0x0065, TryCatch #4 {JSONException -> 0x0065, blocks: (B:4:0x0012, B:67:0x00f2, B:86:0x0164, B:88:0x016a, B:90:0x0170, B:92:0x017d, B:94:0x0189, B:96:0x018f, B:97:0x0192, B:99:0x0198, B:112:0x01bf, B:115:0x01cf, B:117:0x01d5, B:119:0x01ff, B:121:0x0207, B:123:0x020d, B:124:0x0214, B:127:0x021c, B:129:0x0220, B:132:0x0226, B:134:0x022c, B:136:0x0232, B:146:0x0263, B:148:0x0269, B:150:0x026d, B:153:0x0273, B:155:0x0279, B:157:0x027f, B:167:0x02b0, B:169:0x02b6, B:171:0x02ba, B:174:0x02c0, B:176:0x02c6, B:178:0x02dc, B:192:0x031e, B:195:0x0326, B:197:0x032c, B:199:0x0332, B:200:0x0339, B:202:0x0348, B:203:0x0350, B:206:0x0358, B:208:0x035e, B:210:0x0364, B:214:0x0375, B:216:0x037b, B:218:0x037f, B:221:0x0385, B:223:0x038b, B:225:0x03a1, B:226:0x03a5, B:237:0x03c9, B:239:0x03cf, B:241:0x03d3, B:243:0x03d7, B:251:0x042b, B:253:0x0436, B:254:0x0439, B:256:0x043f, B:257:0x0442, B:259:0x0448, B:227:0x03a9, B:228:0x03ae, B:230:0x03b4, B:231:0x03b7, B:233:0x03bd, B:234:0x03c0, B:236:0x03c6, B:211:0x036c, B:213:0x0372, B:179:0x02eb, B:180:0x02fa, B:182:0x0300, B:183:0x0303, B:185:0x0309, B:186:0x030c, B:188:0x0312, B:189:0x0315, B:191:0x031b, B:158:0x0295, B:160:0x029b, B:161:0x029e, B:163:0x02a4, B:164:0x02a7, B:166:0x02ad, B:137:0x0248, B:139:0x024e, B:140:0x0251, B:142:0x0257, B:143:0x025a, B:145:0x0260, B:118:0x01f6, B:100:0x019c, B:102:0x01a2, B:103:0x01a5, B:105:0x01ab, B:106:0x01af, B:108:0x01b5, B:109:0x01b8, B:85:0x0161, B:71:0x0103, B:62:0x00dc, B:58:0x00cc, B:53:0x00c0, B:48:0x00b4, B:43:0x00a8, B:38:0x009c, B:34:0x0091, B:25:0x007e, B:20:0x0072, B:12:0x0061, B:260:0x044c, B:262:0x0454, B:264:0x045a, B:265:0x0461, B:267:0x0467, B:268:0x046a, B:270:0x0470, B:271:0x0473, B:273:0x0479, B:274:0x047c, B:276:0x0482, B:277:0x0485, B:279:0x048b, B:280:0x048e, B:282:0x0494, B:283:0x0497, B:285:0x049d, B:286:0x04a0, B:288:0x04a6, B:289:0x04a9, B:245:0x03eb, B:248:0x03f3, B:249:0x040b, B:55:0x00c4, B:45:0x00ac, B:17:0x006a, B:73:0x0107, B:76:0x010f, B:78:0x0115, B:80:0x0137, B:82:0x0143, B:6:0x0029, B:7:0x0033, B:9:0x0039, B:50:0x00b8, B:22:0x0076, B:59:0x00cf, B:35:0x0094, B:40:0x00a0, B:68:0x00fb), top: B:309:0x0010, inners: #2, #5, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16, #17 }] */
        /* JADX WARN: Removed duplicated region for block: B:211:0x036c A[Catch: JSONException -> 0x0065, TryCatch #4 {JSONException -> 0x0065, blocks: (B:4:0x0012, B:67:0x00f2, B:86:0x0164, B:88:0x016a, B:90:0x0170, B:92:0x017d, B:94:0x0189, B:96:0x018f, B:97:0x0192, B:99:0x0198, B:112:0x01bf, B:115:0x01cf, B:117:0x01d5, B:119:0x01ff, B:121:0x0207, B:123:0x020d, B:124:0x0214, B:127:0x021c, B:129:0x0220, B:132:0x0226, B:134:0x022c, B:136:0x0232, B:146:0x0263, B:148:0x0269, B:150:0x026d, B:153:0x0273, B:155:0x0279, B:157:0x027f, B:167:0x02b0, B:169:0x02b6, B:171:0x02ba, B:174:0x02c0, B:176:0x02c6, B:178:0x02dc, B:192:0x031e, B:195:0x0326, B:197:0x032c, B:199:0x0332, B:200:0x0339, B:202:0x0348, B:203:0x0350, B:206:0x0358, B:208:0x035e, B:210:0x0364, B:214:0x0375, B:216:0x037b, B:218:0x037f, B:221:0x0385, B:223:0x038b, B:225:0x03a1, B:226:0x03a5, B:237:0x03c9, B:239:0x03cf, B:241:0x03d3, B:243:0x03d7, B:251:0x042b, B:253:0x0436, B:254:0x0439, B:256:0x043f, B:257:0x0442, B:259:0x0448, B:227:0x03a9, B:228:0x03ae, B:230:0x03b4, B:231:0x03b7, B:233:0x03bd, B:234:0x03c0, B:236:0x03c6, B:211:0x036c, B:213:0x0372, B:179:0x02eb, B:180:0x02fa, B:182:0x0300, B:183:0x0303, B:185:0x0309, B:186:0x030c, B:188:0x0312, B:189:0x0315, B:191:0x031b, B:158:0x0295, B:160:0x029b, B:161:0x029e, B:163:0x02a4, B:164:0x02a7, B:166:0x02ad, B:137:0x0248, B:139:0x024e, B:140:0x0251, B:142:0x0257, B:143:0x025a, B:145:0x0260, B:118:0x01f6, B:100:0x019c, B:102:0x01a2, B:103:0x01a5, B:105:0x01ab, B:106:0x01af, B:108:0x01b5, B:109:0x01b8, B:85:0x0161, B:71:0x0103, B:62:0x00dc, B:58:0x00cc, B:53:0x00c0, B:48:0x00b4, B:43:0x00a8, B:38:0x009c, B:34:0x0091, B:25:0x007e, B:20:0x0072, B:12:0x0061, B:260:0x044c, B:262:0x0454, B:264:0x045a, B:265:0x0461, B:267:0x0467, B:268:0x046a, B:270:0x0470, B:271:0x0473, B:273:0x0479, B:274:0x047c, B:276:0x0482, B:277:0x0485, B:279:0x048b, B:280:0x048e, B:282:0x0494, B:283:0x0497, B:285:0x049d, B:286:0x04a0, B:288:0x04a6, B:289:0x04a9, B:245:0x03eb, B:248:0x03f3, B:249:0x040b, B:55:0x00c4, B:45:0x00ac, B:17:0x006a, B:73:0x0107, B:76:0x010f, B:78:0x0115, B:80:0x0137, B:82:0x0143, B:6:0x0029, B:7:0x0033, B:9:0x0039, B:50:0x00b8, B:22:0x0076, B:59:0x00cf, B:35:0x0094, B:40:0x00a0, B:68:0x00fb), top: B:309:0x0010, inners: #2, #5, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16, #17 }] */
        /* JADX WARN: Removed duplicated region for block: B:213:0x0372 A[Catch: JSONException -> 0x0065, TryCatch #4 {JSONException -> 0x0065, blocks: (B:4:0x0012, B:67:0x00f2, B:86:0x0164, B:88:0x016a, B:90:0x0170, B:92:0x017d, B:94:0x0189, B:96:0x018f, B:97:0x0192, B:99:0x0198, B:112:0x01bf, B:115:0x01cf, B:117:0x01d5, B:119:0x01ff, B:121:0x0207, B:123:0x020d, B:124:0x0214, B:127:0x021c, B:129:0x0220, B:132:0x0226, B:134:0x022c, B:136:0x0232, B:146:0x0263, B:148:0x0269, B:150:0x026d, B:153:0x0273, B:155:0x0279, B:157:0x027f, B:167:0x02b0, B:169:0x02b6, B:171:0x02ba, B:174:0x02c0, B:176:0x02c6, B:178:0x02dc, B:192:0x031e, B:195:0x0326, B:197:0x032c, B:199:0x0332, B:200:0x0339, B:202:0x0348, B:203:0x0350, B:206:0x0358, B:208:0x035e, B:210:0x0364, B:214:0x0375, B:216:0x037b, B:218:0x037f, B:221:0x0385, B:223:0x038b, B:225:0x03a1, B:226:0x03a5, B:237:0x03c9, B:239:0x03cf, B:241:0x03d3, B:243:0x03d7, B:251:0x042b, B:253:0x0436, B:254:0x0439, B:256:0x043f, B:257:0x0442, B:259:0x0448, B:227:0x03a9, B:228:0x03ae, B:230:0x03b4, B:231:0x03b7, B:233:0x03bd, B:234:0x03c0, B:236:0x03c6, B:211:0x036c, B:213:0x0372, B:179:0x02eb, B:180:0x02fa, B:182:0x0300, B:183:0x0303, B:185:0x0309, B:186:0x030c, B:188:0x0312, B:189:0x0315, B:191:0x031b, B:158:0x0295, B:160:0x029b, B:161:0x029e, B:163:0x02a4, B:164:0x02a7, B:166:0x02ad, B:137:0x0248, B:139:0x024e, B:140:0x0251, B:142:0x0257, B:143:0x025a, B:145:0x0260, B:118:0x01f6, B:100:0x019c, B:102:0x01a2, B:103:0x01a5, B:105:0x01ab, B:106:0x01af, B:108:0x01b5, B:109:0x01b8, B:85:0x0161, B:71:0x0103, B:62:0x00dc, B:58:0x00cc, B:53:0x00c0, B:48:0x00b4, B:43:0x00a8, B:38:0x009c, B:34:0x0091, B:25:0x007e, B:20:0x0072, B:12:0x0061, B:260:0x044c, B:262:0x0454, B:264:0x045a, B:265:0x0461, B:267:0x0467, B:268:0x046a, B:270:0x0470, B:271:0x0473, B:273:0x0479, B:274:0x047c, B:276:0x0482, B:277:0x0485, B:279:0x048b, B:280:0x048e, B:282:0x0494, B:283:0x0497, B:285:0x049d, B:286:0x04a0, B:288:0x04a6, B:289:0x04a9, B:245:0x03eb, B:248:0x03f3, B:249:0x040b, B:55:0x00c4, B:45:0x00ac, B:17:0x006a, B:73:0x0107, B:76:0x010f, B:78:0x0115, B:80:0x0137, B:82:0x0143, B:6:0x0029, B:7:0x0033, B:9:0x0039, B:50:0x00b8, B:22:0x0076, B:59:0x00cf, B:35:0x0094, B:40:0x00a0, B:68:0x00fb), top: B:309:0x0010, inners: #2, #5, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16, #17 }] */
        /* JADX WARN: Removed duplicated region for block: B:228:0x03ae A[Catch: JSONException -> 0x0065, TryCatch #4 {JSONException -> 0x0065, blocks: (B:4:0x0012, B:67:0x00f2, B:86:0x0164, B:88:0x016a, B:90:0x0170, B:92:0x017d, B:94:0x0189, B:96:0x018f, B:97:0x0192, B:99:0x0198, B:112:0x01bf, B:115:0x01cf, B:117:0x01d5, B:119:0x01ff, B:121:0x0207, B:123:0x020d, B:124:0x0214, B:127:0x021c, B:129:0x0220, B:132:0x0226, B:134:0x022c, B:136:0x0232, B:146:0x0263, B:148:0x0269, B:150:0x026d, B:153:0x0273, B:155:0x0279, B:157:0x027f, B:167:0x02b0, B:169:0x02b6, B:171:0x02ba, B:174:0x02c0, B:176:0x02c6, B:178:0x02dc, B:192:0x031e, B:195:0x0326, B:197:0x032c, B:199:0x0332, B:200:0x0339, B:202:0x0348, B:203:0x0350, B:206:0x0358, B:208:0x035e, B:210:0x0364, B:214:0x0375, B:216:0x037b, B:218:0x037f, B:221:0x0385, B:223:0x038b, B:225:0x03a1, B:226:0x03a5, B:237:0x03c9, B:239:0x03cf, B:241:0x03d3, B:243:0x03d7, B:251:0x042b, B:253:0x0436, B:254:0x0439, B:256:0x043f, B:257:0x0442, B:259:0x0448, B:227:0x03a9, B:228:0x03ae, B:230:0x03b4, B:231:0x03b7, B:233:0x03bd, B:234:0x03c0, B:236:0x03c6, B:211:0x036c, B:213:0x0372, B:179:0x02eb, B:180:0x02fa, B:182:0x0300, B:183:0x0303, B:185:0x0309, B:186:0x030c, B:188:0x0312, B:189:0x0315, B:191:0x031b, B:158:0x0295, B:160:0x029b, B:161:0x029e, B:163:0x02a4, B:164:0x02a7, B:166:0x02ad, B:137:0x0248, B:139:0x024e, B:140:0x0251, B:142:0x0257, B:143:0x025a, B:145:0x0260, B:118:0x01f6, B:100:0x019c, B:102:0x01a2, B:103:0x01a5, B:105:0x01ab, B:106:0x01af, B:108:0x01b5, B:109:0x01b8, B:85:0x0161, B:71:0x0103, B:62:0x00dc, B:58:0x00cc, B:53:0x00c0, B:48:0x00b4, B:43:0x00a8, B:38:0x009c, B:34:0x0091, B:25:0x007e, B:20:0x0072, B:12:0x0061, B:260:0x044c, B:262:0x0454, B:264:0x045a, B:265:0x0461, B:267:0x0467, B:268:0x046a, B:270:0x0470, B:271:0x0473, B:273:0x0479, B:274:0x047c, B:276:0x0482, B:277:0x0485, B:279:0x048b, B:280:0x048e, B:282:0x0494, B:283:0x0497, B:285:0x049d, B:286:0x04a0, B:288:0x04a6, B:289:0x04a9, B:245:0x03eb, B:248:0x03f3, B:249:0x040b, B:55:0x00c4, B:45:0x00ac, B:17:0x006a, B:73:0x0107, B:76:0x010f, B:78:0x0115, B:80:0x0137, B:82:0x0143, B:6:0x0029, B:7:0x0033, B:9:0x0039, B:50:0x00b8, B:22:0x0076, B:59:0x00cf, B:35:0x0094, B:40:0x00a0, B:68:0x00fb), top: B:309:0x0010, inners: #2, #5, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16, #17 }] */
        /* JADX WARN: Removed duplicated region for block: B:230:0x03b4 A[Catch: JSONException -> 0x0065, TryCatch #4 {JSONException -> 0x0065, blocks: (B:4:0x0012, B:67:0x00f2, B:86:0x0164, B:88:0x016a, B:90:0x0170, B:92:0x017d, B:94:0x0189, B:96:0x018f, B:97:0x0192, B:99:0x0198, B:112:0x01bf, B:115:0x01cf, B:117:0x01d5, B:119:0x01ff, B:121:0x0207, B:123:0x020d, B:124:0x0214, B:127:0x021c, B:129:0x0220, B:132:0x0226, B:134:0x022c, B:136:0x0232, B:146:0x0263, B:148:0x0269, B:150:0x026d, B:153:0x0273, B:155:0x0279, B:157:0x027f, B:167:0x02b0, B:169:0x02b6, B:171:0x02ba, B:174:0x02c0, B:176:0x02c6, B:178:0x02dc, B:192:0x031e, B:195:0x0326, B:197:0x032c, B:199:0x0332, B:200:0x0339, B:202:0x0348, B:203:0x0350, B:206:0x0358, B:208:0x035e, B:210:0x0364, B:214:0x0375, B:216:0x037b, B:218:0x037f, B:221:0x0385, B:223:0x038b, B:225:0x03a1, B:226:0x03a5, B:237:0x03c9, B:239:0x03cf, B:241:0x03d3, B:243:0x03d7, B:251:0x042b, B:253:0x0436, B:254:0x0439, B:256:0x043f, B:257:0x0442, B:259:0x0448, B:227:0x03a9, B:228:0x03ae, B:230:0x03b4, B:231:0x03b7, B:233:0x03bd, B:234:0x03c0, B:236:0x03c6, B:211:0x036c, B:213:0x0372, B:179:0x02eb, B:180:0x02fa, B:182:0x0300, B:183:0x0303, B:185:0x0309, B:186:0x030c, B:188:0x0312, B:189:0x0315, B:191:0x031b, B:158:0x0295, B:160:0x029b, B:161:0x029e, B:163:0x02a4, B:164:0x02a7, B:166:0x02ad, B:137:0x0248, B:139:0x024e, B:140:0x0251, B:142:0x0257, B:143:0x025a, B:145:0x0260, B:118:0x01f6, B:100:0x019c, B:102:0x01a2, B:103:0x01a5, B:105:0x01ab, B:106:0x01af, B:108:0x01b5, B:109:0x01b8, B:85:0x0161, B:71:0x0103, B:62:0x00dc, B:58:0x00cc, B:53:0x00c0, B:48:0x00b4, B:43:0x00a8, B:38:0x009c, B:34:0x0091, B:25:0x007e, B:20:0x0072, B:12:0x0061, B:260:0x044c, B:262:0x0454, B:264:0x045a, B:265:0x0461, B:267:0x0467, B:268:0x046a, B:270:0x0470, B:271:0x0473, B:273:0x0479, B:274:0x047c, B:276:0x0482, B:277:0x0485, B:279:0x048b, B:280:0x048e, B:282:0x0494, B:283:0x0497, B:285:0x049d, B:286:0x04a0, B:288:0x04a6, B:289:0x04a9, B:245:0x03eb, B:248:0x03f3, B:249:0x040b, B:55:0x00c4, B:45:0x00ac, B:17:0x006a, B:73:0x0107, B:76:0x010f, B:78:0x0115, B:80:0x0137, B:82:0x0143, B:6:0x0029, B:7:0x0033, B:9:0x0039, B:50:0x00b8, B:22:0x0076, B:59:0x00cf, B:35:0x0094, B:40:0x00a0, B:68:0x00fb), top: B:309:0x0010, inners: #2, #5, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16, #17 }] */
        /* JADX WARN: Removed duplicated region for block: B:233:0x03bd A[Catch: JSONException -> 0x0065, TryCatch #4 {JSONException -> 0x0065, blocks: (B:4:0x0012, B:67:0x00f2, B:86:0x0164, B:88:0x016a, B:90:0x0170, B:92:0x017d, B:94:0x0189, B:96:0x018f, B:97:0x0192, B:99:0x0198, B:112:0x01bf, B:115:0x01cf, B:117:0x01d5, B:119:0x01ff, B:121:0x0207, B:123:0x020d, B:124:0x0214, B:127:0x021c, B:129:0x0220, B:132:0x0226, B:134:0x022c, B:136:0x0232, B:146:0x0263, B:148:0x0269, B:150:0x026d, B:153:0x0273, B:155:0x0279, B:157:0x027f, B:167:0x02b0, B:169:0x02b6, B:171:0x02ba, B:174:0x02c0, B:176:0x02c6, B:178:0x02dc, B:192:0x031e, B:195:0x0326, B:197:0x032c, B:199:0x0332, B:200:0x0339, B:202:0x0348, B:203:0x0350, B:206:0x0358, B:208:0x035e, B:210:0x0364, B:214:0x0375, B:216:0x037b, B:218:0x037f, B:221:0x0385, B:223:0x038b, B:225:0x03a1, B:226:0x03a5, B:237:0x03c9, B:239:0x03cf, B:241:0x03d3, B:243:0x03d7, B:251:0x042b, B:253:0x0436, B:254:0x0439, B:256:0x043f, B:257:0x0442, B:259:0x0448, B:227:0x03a9, B:228:0x03ae, B:230:0x03b4, B:231:0x03b7, B:233:0x03bd, B:234:0x03c0, B:236:0x03c6, B:211:0x036c, B:213:0x0372, B:179:0x02eb, B:180:0x02fa, B:182:0x0300, B:183:0x0303, B:185:0x0309, B:186:0x030c, B:188:0x0312, B:189:0x0315, B:191:0x031b, B:158:0x0295, B:160:0x029b, B:161:0x029e, B:163:0x02a4, B:164:0x02a7, B:166:0x02ad, B:137:0x0248, B:139:0x024e, B:140:0x0251, B:142:0x0257, B:143:0x025a, B:145:0x0260, B:118:0x01f6, B:100:0x019c, B:102:0x01a2, B:103:0x01a5, B:105:0x01ab, B:106:0x01af, B:108:0x01b5, B:109:0x01b8, B:85:0x0161, B:71:0x0103, B:62:0x00dc, B:58:0x00cc, B:53:0x00c0, B:48:0x00b4, B:43:0x00a8, B:38:0x009c, B:34:0x0091, B:25:0x007e, B:20:0x0072, B:12:0x0061, B:260:0x044c, B:262:0x0454, B:264:0x045a, B:265:0x0461, B:267:0x0467, B:268:0x046a, B:270:0x0470, B:271:0x0473, B:273:0x0479, B:274:0x047c, B:276:0x0482, B:277:0x0485, B:279:0x048b, B:280:0x048e, B:282:0x0494, B:283:0x0497, B:285:0x049d, B:286:0x04a0, B:288:0x04a6, B:289:0x04a9, B:245:0x03eb, B:248:0x03f3, B:249:0x040b, B:55:0x00c4, B:45:0x00ac, B:17:0x006a, B:73:0x0107, B:76:0x010f, B:78:0x0115, B:80:0x0137, B:82:0x0143, B:6:0x0029, B:7:0x0033, B:9:0x0039, B:50:0x00b8, B:22:0x0076, B:59:0x00cf, B:35:0x0094, B:40:0x00a0, B:68:0x00fb), top: B:309:0x0010, inners: #2, #5, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16, #17 }] */
        /* JADX WARN: Removed duplicated region for block: B:236:0x03c6 A[Catch: JSONException -> 0x0065, TryCatch #4 {JSONException -> 0x0065, blocks: (B:4:0x0012, B:67:0x00f2, B:86:0x0164, B:88:0x016a, B:90:0x0170, B:92:0x017d, B:94:0x0189, B:96:0x018f, B:97:0x0192, B:99:0x0198, B:112:0x01bf, B:115:0x01cf, B:117:0x01d5, B:119:0x01ff, B:121:0x0207, B:123:0x020d, B:124:0x0214, B:127:0x021c, B:129:0x0220, B:132:0x0226, B:134:0x022c, B:136:0x0232, B:146:0x0263, B:148:0x0269, B:150:0x026d, B:153:0x0273, B:155:0x0279, B:157:0x027f, B:167:0x02b0, B:169:0x02b6, B:171:0x02ba, B:174:0x02c0, B:176:0x02c6, B:178:0x02dc, B:192:0x031e, B:195:0x0326, B:197:0x032c, B:199:0x0332, B:200:0x0339, B:202:0x0348, B:203:0x0350, B:206:0x0358, B:208:0x035e, B:210:0x0364, B:214:0x0375, B:216:0x037b, B:218:0x037f, B:221:0x0385, B:223:0x038b, B:225:0x03a1, B:226:0x03a5, B:237:0x03c9, B:239:0x03cf, B:241:0x03d3, B:243:0x03d7, B:251:0x042b, B:253:0x0436, B:254:0x0439, B:256:0x043f, B:257:0x0442, B:259:0x0448, B:227:0x03a9, B:228:0x03ae, B:230:0x03b4, B:231:0x03b7, B:233:0x03bd, B:234:0x03c0, B:236:0x03c6, B:211:0x036c, B:213:0x0372, B:179:0x02eb, B:180:0x02fa, B:182:0x0300, B:183:0x0303, B:185:0x0309, B:186:0x030c, B:188:0x0312, B:189:0x0315, B:191:0x031b, B:158:0x0295, B:160:0x029b, B:161:0x029e, B:163:0x02a4, B:164:0x02a7, B:166:0x02ad, B:137:0x0248, B:139:0x024e, B:140:0x0251, B:142:0x0257, B:143:0x025a, B:145:0x0260, B:118:0x01f6, B:100:0x019c, B:102:0x01a2, B:103:0x01a5, B:105:0x01ab, B:106:0x01af, B:108:0x01b5, B:109:0x01b8, B:85:0x0161, B:71:0x0103, B:62:0x00dc, B:58:0x00cc, B:53:0x00c0, B:48:0x00b4, B:43:0x00a8, B:38:0x009c, B:34:0x0091, B:25:0x007e, B:20:0x0072, B:12:0x0061, B:260:0x044c, B:262:0x0454, B:264:0x045a, B:265:0x0461, B:267:0x0467, B:268:0x046a, B:270:0x0470, B:271:0x0473, B:273:0x0479, B:274:0x047c, B:276:0x0482, B:277:0x0485, B:279:0x048b, B:280:0x048e, B:282:0x0494, B:283:0x0497, B:285:0x049d, B:286:0x04a0, B:288:0x04a6, B:289:0x04a9, B:245:0x03eb, B:248:0x03f3, B:249:0x040b, B:55:0x00c4, B:45:0x00ac, B:17:0x006a, B:73:0x0107, B:76:0x010f, B:78:0x0115, B:80:0x0137, B:82:0x0143, B:6:0x0029, B:7:0x0033, B:9:0x0039, B:50:0x00b8, B:22:0x0076, B:59:0x00cf, B:35:0x0094, B:40:0x00a0, B:68:0x00fb), top: B:309:0x0010, inners: #2, #5, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16, #17 }] */
        /* JADX WARN: Removed duplicated region for block: B:252:0x0434  */
        /* JADX WARN: Removed duplicated region for block: B:253:0x0436 A[Catch: JSONException -> 0x0065, TryCatch #4 {JSONException -> 0x0065, blocks: (B:4:0x0012, B:67:0x00f2, B:86:0x0164, B:88:0x016a, B:90:0x0170, B:92:0x017d, B:94:0x0189, B:96:0x018f, B:97:0x0192, B:99:0x0198, B:112:0x01bf, B:115:0x01cf, B:117:0x01d5, B:119:0x01ff, B:121:0x0207, B:123:0x020d, B:124:0x0214, B:127:0x021c, B:129:0x0220, B:132:0x0226, B:134:0x022c, B:136:0x0232, B:146:0x0263, B:148:0x0269, B:150:0x026d, B:153:0x0273, B:155:0x0279, B:157:0x027f, B:167:0x02b0, B:169:0x02b6, B:171:0x02ba, B:174:0x02c0, B:176:0x02c6, B:178:0x02dc, B:192:0x031e, B:195:0x0326, B:197:0x032c, B:199:0x0332, B:200:0x0339, B:202:0x0348, B:203:0x0350, B:206:0x0358, B:208:0x035e, B:210:0x0364, B:214:0x0375, B:216:0x037b, B:218:0x037f, B:221:0x0385, B:223:0x038b, B:225:0x03a1, B:226:0x03a5, B:237:0x03c9, B:239:0x03cf, B:241:0x03d3, B:243:0x03d7, B:251:0x042b, B:253:0x0436, B:254:0x0439, B:256:0x043f, B:257:0x0442, B:259:0x0448, B:227:0x03a9, B:228:0x03ae, B:230:0x03b4, B:231:0x03b7, B:233:0x03bd, B:234:0x03c0, B:236:0x03c6, B:211:0x036c, B:213:0x0372, B:179:0x02eb, B:180:0x02fa, B:182:0x0300, B:183:0x0303, B:185:0x0309, B:186:0x030c, B:188:0x0312, B:189:0x0315, B:191:0x031b, B:158:0x0295, B:160:0x029b, B:161:0x029e, B:163:0x02a4, B:164:0x02a7, B:166:0x02ad, B:137:0x0248, B:139:0x024e, B:140:0x0251, B:142:0x0257, B:143:0x025a, B:145:0x0260, B:118:0x01f6, B:100:0x019c, B:102:0x01a2, B:103:0x01a5, B:105:0x01ab, B:106:0x01af, B:108:0x01b5, B:109:0x01b8, B:85:0x0161, B:71:0x0103, B:62:0x00dc, B:58:0x00cc, B:53:0x00c0, B:48:0x00b4, B:43:0x00a8, B:38:0x009c, B:34:0x0091, B:25:0x007e, B:20:0x0072, B:12:0x0061, B:260:0x044c, B:262:0x0454, B:264:0x045a, B:265:0x0461, B:267:0x0467, B:268:0x046a, B:270:0x0470, B:271:0x0473, B:273:0x0479, B:274:0x047c, B:276:0x0482, B:277:0x0485, B:279:0x048b, B:280:0x048e, B:282:0x0494, B:283:0x0497, B:285:0x049d, B:286:0x04a0, B:288:0x04a6, B:289:0x04a9, B:245:0x03eb, B:248:0x03f3, B:249:0x040b, B:55:0x00c4, B:45:0x00ac, B:17:0x006a, B:73:0x0107, B:76:0x010f, B:78:0x0115, B:80:0x0137, B:82:0x0143, B:6:0x0029, B:7:0x0033, B:9:0x0039, B:50:0x00b8, B:22:0x0076, B:59:0x00cf, B:35:0x0094, B:40:0x00a0, B:68:0x00fb), top: B:309:0x0010, inners: #2, #5, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16, #17 }] */
        /* JADX WARN: Removed duplicated region for block: B:256:0x043f A[Catch: JSONException -> 0x0065, TryCatch #4 {JSONException -> 0x0065, blocks: (B:4:0x0012, B:67:0x00f2, B:86:0x0164, B:88:0x016a, B:90:0x0170, B:92:0x017d, B:94:0x0189, B:96:0x018f, B:97:0x0192, B:99:0x0198, B:112:0x01bf, B:115:0x01cf, B:117:0x01d5, B:119:0x01ff, B:121:0x0207, B:123:0x020d, B:124:0x0214, B:127:0x021c, B:129:0x0220, B:132:0x0226, B:134:0x022c, B:136:0x0232, B:146:0x0263, B:148:0x0269, B:150:0x026d, B:153:0x0273, B:155:0x0279, B:157:0x027f, B:167:0x02b0, B:169:0x02b6, B:171:0x02ba, B:174:0x02c0, B:176:0x02c6, B:178:0x02dc, B:192:0x031e, B:195:0x0326, B:197:0x032c, B:199:0x0332, B:200:0x0339, B:202:0x0348, B:203:0x0350, B:206:0x0358, B:208:0x035e, B:210:0x0364, B:214:0x0375, B:216:0x037b, B:218:0x037f, B:221:0x0385, B:223:0x038b, B:225:0x03a1, B:226:0x03a5, B:237:0x03c9, B:239:0x03cf, B:241:0x03d3, B:243:0x03d7, B:251:0x042b, B:253:0x0436, B:254:0x0439, B:256:0x043f, B:257:0x0442, B:259:0x0448, B:227:0x03a9, B:228:0x03ae, B:230:0x03b4, B:231:0x03b7, B:233:0x03bd, B:234:0x03c0, B:236:0x03c6, B:211:0x036c, B:213:0x0372, B:179:0x02eb, B:180:0x02fa, B:182:0x0300, B:183:0x0303, B:185:0x0309, B:186:0x030c, B:188:0x0312, B:189:0x0315, B:191:0x031b, B:158:0x0295, B:160:0x029b, B:161:0x029e, B:163:0x02a4, B:164:0x02a7, B:166:0x02ad, B:137:0x0248, B:139:0x024e, B:140:0x0251, B:142:0x0257, B:143:0x025a, B:145:0x0260, B:118:0x01f6, B:100:0x019c, B:102:0x01a2, B:103:0x01a5, B:105:0x01ab, B:106:0x01af, B:108:0x01b5, B:109:0x01b8, B:85:0x0161, B:71:0x0103, B:62:0x00dc, B:58:0x00cc, B:53:0x00c0, B:48:0x00b4, B:43:0x00a8, B:38:0x009c, B:34:0x0091, B:25:0x007e, B:20:0x0072, B:12:0x0061, B:260:0x044c, B:262:0x0454, B:264:0x045a, B:265:0x0461, B:267:0x0467, B:268:0x046a, B:270:0x0470, B:271:0x0473, B:273:0x0479, B:274:0x047c, B:276:0x0482, B:277:0x0485, B:279:0x048b, B:280:0x048e, B:282:0x0494, B:283:0x0497, B:285:0x049d, B:286:0x04a0, B:288:0x04a6, B:289:0x04a9, B:245:0x03eb, B:248:0x03f3, B:249:0x040b, B:55:0x00c4, B:45:0x00ac, B:17:0x006a, B:73:0x0107, B:76:0x010f, B:78:0x0115, B:80:0x0137, B:82:0x0143, B:6:0x0029, B:7:0x0033, B:9:0x0039, B:50:0x00b8, B:22:0x0076, B:59:0x00cf, B:35:0x0094, B:40:0x00a0, B:68:0x00fb), top: B:309:0x0010, inners: #2, #5, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16, #17 }] */
        /* JADX WARN: Removed duplicated region for block: B:259:0x0448 A[Catch: JSONException -> 0x0065, PHI: r15
          0x0448: PHI (r15v24 android.widget.TextView) = (r15v21 android.widget.TextView), (r15v50 android.widget.TextView) binds: [B:290:0x04ad, B:258:0x0446] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {JSONException -> 0x0065, blocks: (B:4:0x0012, B:67:0x00f2, B:86:0x0164, B:88:0x016a, B:90:0x0170, B:92:0x017d, B:94:0x0189, B:96:0x018f, B:97:0x0192, B:99:0x0198, B:112:0x01bf, B:115:0x01cf, B:117:0x01d5, B:119:0x01ff, B:121:0x0207, B:123:0x020d, B:124:0x0214, B:127:0x021c, B:129:0x0220, B:132:0x0226, B:134:0x022c, B:136:0x0232, B:146:0x0263, B:148:0x0269, B:150:0x026d, B:153:0x0273, B:155:0x0279, B:157:0x027f, B:167:0x02b0, B:169:0x02b6, B:171:0x02ba, B:174:0x02c0, B:176:0x02c6, B:178:0x02dc, B:192:0x031e, B:195:0x0326, B:197:0x032c, B:199:0x0332, B:200:0x0339, B:202:0x0348, B:203:0x0350, B:206:0x0358, B:208:0x035e, B:210:0x0364, B:214:0x0375, B:216:0x037b, B:218:0x037f, B:221:0x0385, B:223:0x038b, B:225:0x03a1, B:226:0x03a5, B:237:0x03c9, B:239:0x03cf, B:241:0x03d3, B:243:0x03d7, B:251:0x042b, B:253:0x0436, B:254:0x0439, B:256:0x043f, B:257:0x0442, B:259:0x0448, B:227:0x03a9, B:228:0x03ae, B:230:0x03b4, B:231:0x03b7, B:233:0x03bd, B:234:0x03c0, B:236:0x03c6, B:211:0x036c, B:213:0x0372, B:179:0x02eb, B:180:0x02fa, B:182:0x0300, B:183:0x0303, B:185:0x0309, B:186:0x030c, B:188:0x0312, B:189:0x0315, B:191:0x031b, B:158:0x0295, B:160:0x029b, B:161:0x029e, B:163:0x02a4, B:164:0x02a7, B:166:0x02ad, B:137:0x0248, B:139:0x024e, B:140:0x0251, B:142:0x0257, B:143:0x025a, B:145:0x0260, B:118:0x01f6, B:100:0x019c, B:102:0x01a2, B:103:0x01a5, B:105:0x01ab, B:106:0x01af, B:108:0x01b5, B:109:0x01b8, B:85:0x0161, B:71:0x0103, B:62:0x00dc, B:58:0x00cc, B:53:0x00c0, B:48:0x00b4, B:43:0x00a8, B:38:0x009c, B:34:0x0091, B:25:0x007e, B:20:0x0072, B:12:0x0061, B:260:0x044c, B:262:0x0454, B:264:0x045a, B:265:0x0461, B:267:0x0467, B:268:0x046a, B:270:0x0470, B:271:0x0473, B:273:0x0479, B:274:0x047c, B:276:0x0482, B:277:0x0485, B:279:0x048b, B:280:0x048e, B:282:0x0494, B:283:0x0497, B:285:0x049d, B:286:0x04a0, B:288:0x04a6, B:289:0x04a9, B:245:0x03eb, B:248:0x03f3, B:249:0x040b, B:55:0x00c4, B:45:0x00ac, B:17:0x006a, B:73:0x0107, B:76:0x010f, B:78:0x0115, B:80:0x0137, B:82:0x0143, B:6:0x0029, B:7:0x0033, B:9:0x0039, B:50:0x00b8, B:22:0x0076, B:59:0x00cf, B:35:0x0094, B:40:0x00a0, B:68:0x00fb), top: B:309:0x0010, inners: #2, #5, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16, #17 }] */
        @Override // p1.InterfaceC2389c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(org.json.JSONObject r15) {
            /*
                Method dump skipped, instruction units count: 1234
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ViewDetailsActivity.a.a(org.json.JSONObject):void");
        }

        @Override // p1.InterfaceC2389c
        public void b(C2219a c2219a) {
            Log.e("Categories For Live", String.valueOf(c2219a));
            Toast.makeText(ViewDetailsActivity.this.getApplicationContext(), ViewDetailsActivity.this.getResources().getString(a7.j.f12976D2), 0).show();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class d implements C {
        public d() {
        }

        @Override // com.squareup.picasso.C
        public void a(Drawable drawable) {
            Log.d("TAG", "FAILED");
        }

        @Override // com.squareup.picasso.C
        public void b(Bitmap bitmap, t.e eVar) {
            ViewDetailsActivity.this.f32985t.setBackground(new BitmapDrawable(ViewDetailsActivity.this.f32962l0.getResources(), bitmap));
            ViewDetailsActivity viewDetailsActivity = ViewDetailsActivity.this;
            viewDetailsActivity.f32947g0.setBackgroundColor(viewDetailsActivity.getResources().getColor(a7.c.f11844B));
            ViewDetailsActivity viewDetailsActivity2 = ViewDetailsActivity.this;
            viewDetailsActivity2.f32976q.setBackgroundColor(viewDetailsActivity2.getResources().getColor(a7.c.f11844B));
        }

        @Override // com.squareup.picasso.C
        public void c(Drawable drawable) {
            Log.d("TAG", "Prepare Load");
        }
    }

    public class e implements InterfaceC1611e {
        public e() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
            ViewDetailsActivity.this.f32991v.setBackgroundResource(a7.e.f12040o1);
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
        }
    }

    public class f implements C {
        public f() {
        }

        @Override // com.squareup.picasso.C
        public void a(Drawable drawable) {
            Log.d("TAG", "FAILED");
        }

        @Override // com.squareup.picasso.C
        public void b(Bitmap bitmap, t.e eVar) {
            ViewDetailsActivity.this.f32985t.setBackground(new BitmapDrawable(ViewDetailsActivity.this.f32962l0.getResources(), bitmap));
            ViewDetailsActivity viewDetailsActivity = ViewDetailsActivity.this;
            viewDetailsActivity.f32947g0.setBackgroundColor(viewDetailsActivity.getResources().getColor(a7.c.f11844B));
            ViewDetailsActivity viewDetailsActivity2 = ViewDetailsActivity.this;
            viewDetailsActivity2.f32976q.setBackgroundColor(viewDetailsActivity2.getResources().getColor(a7.c.f11844B));
        }

        @Override // com.squareup.picasso.C
        public void c(Drawable drawable) {
            Log.d("TAG", "Prepare Load");
        }
    }

    public class g implements U.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f33011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f33012b;

        public g(ArrayList arrayList, String str) {
            this.f33011a = arrayList;
            this.f33012b = str;
        }

        @Override // k.U.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            ArrayList arrayList;
            Context context;
            String str;
            int i9;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            int i10;
            String str7;
            String str8;
            try {
                if (ViewDetailsActivity.this.f32910N0.booleanValue() && (arrayList = this.f33011a) != null && arrayList.size() > 0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= this.f33011a.size()) {
                            break;
                        }
                        if (menuItem.getItemId() != i11) {
                            i11++;
                        } else if (menuItem.getItemId() == 0) {
                            if (SharepreferenceDBHandler.getCurrentAPPType(ViewDetailsActivity.this.f32962l0).equals("onestream_api")) {
                                String str9 = ViewDetailsActivity.this.f32918R0;
                            } else {
                                w.U(ViewDetailsActivity.this.f32962l0, ViewDetailsActivity.this.f32884A0, ViewDetailsActivity.this.f33000y0, "movie");
                            }
                            if (SharepreferenceDBHandler.getCurrentAPPType(ViewDetailsActivity.this.f32962l0).equals("onestream_api")) {
                                context = ViewDetailsActivity.this.f32962l0;
                                str = this.f33012b;
                                i9 = ViewDetailsActivity.this.f32884A0;
                                str2 = ViewDetailsActivity.this.f32998x0;
                                str3 = ViewDetailsActivity.this.f33000y0;
                                str4 = ViewDetailsActivity.this.f33002z0;
                                str5 = ViewDetailsActivity.this.f32992v0;
                                ViewDetailsActivity viewDetailsActivity = ViewDetailsActivity.this;
                                str6 = viewDetailsActivity.f32918R0;
                                i10 = viewDetailsActivity.f32935a1;
                                str7 = ViewDetailsActivity.this.f32886B0;
                                str8 = ViewDetailsActivity.this.f32973p;
                            } else {
                                context = ViewDetailsActivity.this.f32962l0;
                                str = this.f33012b;
                                i9 = ViewDetailsActivity.this.f32884A0;
                                str2 = ViewDetailsActivity.this.f32998x0;
                                str3 = ViewDetailsActivity.this.f33000y0;
                                str4 = ViewDetailsActivity.this.f33002z0;
                                str5 = ViewDetailsActivity.this.f32992v0;
                                str6 = "";
                                i10 = ViewDetailsActivity.this.f32935a1;
                                str7 = "";
                                str8 = ViewDetailsActivity.this.f32973p;
                            }
                            w.w0(context, str, i9, str2, str3, str4, str5, str6, i10, str7, str8, "");
                        } else {
                            String strG = SharepreferenceDBHandler.getCurrentAPPType(ViewDetailsActivity.this.f32962l0).equals("onestream_api") ? ViewDetailsActivity.this.f32918R0 : w.G(w.U(ViewDetailsActivity.this.f32962l0, ViewDetailsActivity.this.f32884A0, ViewDetailsActivity.this.f33000y0, "movie"));
                            if (SharepreferenceDBHandler.getCurrentAPPType(ViewDetailsActivity.this.f32962l0).equals("onestream_api")) {
                                Intent intent = new Intent(ViewDetailsActivity.this.f32962l0, (Class<?>) PlayExternalPlayerActivity.class);
                                intent.putExtra("url", ViewDetailsActivity.this.f32918R0);
                                intent.putExtra("app_name", ((ExternalPlayerModelClass) this.f33011a.get(i11)).getAppname());
                                intent.putExtra("packagename", ((ExternalPlayerModelClass) this.f33011a.get(i11)).getPackagename());
                                ViewDetailsActivity.this.f32962l0.startActivity(intent);
                            } else {
                                Intent intent2 = new Intent(ViewDetailsActivity.this.f32962l0, (Class<?>) PlayExternalPlayerActivity.class);
                                intent2.putExtra("url", strG);
                                intent2.putExtra("app_name", ((ExternalPlayerModelClass) this.f33011a.get(i11)).getAppname());
                                intent2.putExtra("packagename", ((ExternalPlayerModelClass) this.f33011a.get(i11)).getPackagename());
                                ViewDetailsActivity.this.f32962l0.startActivity(intent2);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        }
    }

    public class h implements U.c {
        public h() {
        }

        @Override // k.U.c
        public void a(U u9) {
        }
    }

    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewDetailsActivity.this.f32892E0.dismiss();
        }
    }

    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewDetailsActivity.this.f32892E0.dismiss();
        }
    }

    public class k extends BroadcastReceiver {
        public k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                String stringExtra = intent.getStringExtra("status");
                Log.i("statusIs", "status:" + stringExtra);
                if (stringExtra.equals("completed")) {
                    if (intent.getStringExtra("url").equals(ViewDetailsActivity.this.f32961l)) {
                        ViewDetailsActivity.this.f32949h.setText(a7.j.f13258g1);
                        ViewDetailsActivity.this.f32952i.setVisibility(8);
                        ViewDetailsActivity.this.f32958k.setVisibility(0);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.setMargins(10, 0, 0, 0);
                        ViewDetailsActivity.this.f32949h.setLayoutParams(layoutParams);
                    }
                } else if (stringExtra.equals("downloading")) {
                    int intExtra = intent.getIntExtra("percent", 0);
                    String stringExtra2 = intent.getStringExtra("url");
                    Log.i("getPercent", "percent:" + intExtra);
                    if (stringExtra2.equals(ViewDetailsActivity.this.f32961l)) {
                        ViewDetailsActivity.this.f32952i.setVisibility(0);
                        ViewDetailsActivity.this.f32949h.setText(context.getResources().getString(a7.j.f13268h1).concat(".."));
                        ViewDetailsActivity.this.f32952i.setProgress(intExtra);
                    }
                } else if (stringExtra.equals("failed")) {
                    int intExtra2 = intent.getIntExtra("percent", 0);
                    if (intent.getStringExtra("url").equals(ViewDetailsActivity.this.f32961l)) {
                        ViewDetailsActivity.this.f32952i.setVisibility(0);
                        ViewDetailsActivity.this.f32952i.setProgress(intExtra2);
                        ViewDetailsActivity.this.f32949h.setText(a7.j.f13278i1);
                        ViewDetailsActivity.this.f32952i.setVisibility(8);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public class l implements PopupMenu.OnMenuItemClickListener {
        public l() {
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            Context context;
            String strValueOf;
            if (menuItem.getTitle().toString().equalsIgnoreCase("Cancel Downloading")) {
                ViewDetailsActivity viewDetailsActivity = ViewDetailsActivity.this;
                viewDetailsActivity.B2(viewDetailsActivity);
            } else if (menuItem.getTitle().toString().equalsIgnoreCase("Pause Downloading")) {
                int i9 = 0;
                Toast.makeText(ViewDetailsActivity.this.f32962l0, "Downloading Paused", 0).show();
                if (SharepreferenceDBHandler.getCurrentAPPType(ViewDetailsActivity.this.f32962l0).equals("api")) {
                    context = ViewDetailsActivity.this.f32962l0;
                    strValueOf = String.valueOf(ViewDetailsActivity.this.f32884A0);
                } else {
                    context = ViewDetailsActivity.this.f32962l0;
                    strValueOf = String.valueOf(ViewDetailsActivity.this.f32886B0);
                }
                AbstractServiceC3053x.z(context, VideoDownloadService.class, strValueOf, 1001, true);
                ViewDetailsActivity viewDetailsActivity2 = ViewDetailsActivity.this;
                viewDetailsActivity2.f32949h.setText(viewDetailsActivity2.f32962l0.getResources().getString(a7.j.f13212b5));
                ViewDetailsActivity viewDetailsActivity3 = ViewDetailsActivity.this;
                viewDetailsActivity3.f32946g = viewDetailsActivity3.f32943f.getDownloadedData();
                if (ViewDetailsActivity.this.f32946g.size() > 0) {
                    while (true) {
                        if (i9 >= ViewDetailsActivity.this.f32946g.size()) {
                            break;
                        }
                        if (((DownloadedDataModel) ViewDetailsActivity.this.f32946g.get(i9)).getMovieURL().equals(ViewDetailsActivity.this.f32961l)) {
                            int idAuto = ((DownloadedDataModel) ViewDetailsActivity.this.f32946g.get(i9)).getIdAuto();
                            ArrayList<DownloadedDataModel> arrayList = new ArrayList<>();
                            DownloadedDataModel downloadedDataModel = new DownloadedDataModel();
                            downloadedDataModel.setMovieState("Paused");
                            downloadedDataModel.setMoviePercentage(((DownloadedDataModel) ViewDetailsActivity.this.f32946g.get(i9)).getMoviePercentage());
                            arrayList.add(downloadedDataModel);
                            ViewDetailsActivity.this.f32943f.updateDownloadedData(arrayList, idAuto);
                            break;
                        }
                        i9++;
                    }
                }
            } else {
                ViewDetailsActivity.this.startActivity(new Intent(ViewDetailsActivity.this, (Class<?>) DownloadedMovies.class));
            }
            return true;
        }
    }

    public class m implements DialogInterface.OnClickListener {
        public m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            Context applicationContext;
            String strValueOf;
            Toast.makeText(ViewDetailsActivity.this.getApplicationContext(), "Downloading Cancelled", 1).show();
            if (SharepreferenceDBHandler.getCurrentAPPType(ViewDetailsActivity.this.f32962l0).equals("api")) {
                applicationContext = ViewDetailsActivity.this.getApplicationContext();
                strValueOf = String.valueOf(ViewDetailsActivity.this.f32884A0);
            } else {
                applicationContext = ViewDetailsActivity.this.getApplicationContext();
                strValueOf = String.valueOf(ViewDetailsActivity.this.f32886B0);
            }
            AbstractServiceC3053x.y(applicationContext, VideoDownloadService.class, strValueOf, true);
            ViewDetailsActivity viewDetailsActivity = ViewDetailsActivity.this;
            viewDetailsActivity.f32949h.setText(viewDetailsActivity.f32962l0.getResources().getString(a7.j.f13143U0));
            ViewDetailsActivity.this.f32952i.setVisibility(8);
            ViewDetailsActivity.this.f32952i.setProgress(0);
            ViewDetailsActivity.this.f32959k0.dismiss();
            try {
                ViewDetailsActivity viewDetailsActivity2 = ViewDetailsActivity.this;
                viewDetailsActivity2.f32946g = viewDetailsActivity2.f32943f.getDownloadedData();
                if (ViewDetailsActivity.this.f32946g.size() > 0) {
                    for (int i10 = 0; i10 < ViewDetailsActivity.this.f32946g.size(); i10++) {
                        if (((DownloadedDataModel) ViewDetailsActivity.this.f32946g.get(i10)).getMovieURL().equals(ViewDetailsActivity.this.f32961l)) {
                            ViewDetailsActivity.this.f32943f.deleteDownloadedData(((DownloadedDataModel) ViewDetailsActivity.this.f32946g.get(i10)).getIdAuto());
                            return;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public class n implements DialogInterface.OnClickListener {
        public n() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            ViewDetailsActivity.this.f32959k0.dismiss();
        }
    }

    public class o implements View.OnClickListener {
        public o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewDetailsActivity.this.f32892E0.dismiss();
        }
    }

    public class p implements View.OnClickListener {
        public p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(ViewDetailsActivity.this.f32962l0);
        }
    }

    public class q implements View.OnClickListener {
        public q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewDetailsActivity.this.onBackPressed();
        }
    }

    public class r implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f33024a;

        public r(Context context) {
            this.f33024a = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f33024a).equals("stalker_api")) {
                if (ViewDetailsActivity.this.f32969n1 == 1) {
                    ViewDetailsActivity.this.z2();
                    return;
                } else {
                    ViewDetailsActivity.this.g2();
                    return;
                }
            }
            if (ViewDetailsActivity.this.f32890D0.checkFavourite(ViewDetailsActivity.this.f32884A0, ViewDetailsActivity.this.f32888C0, "vod", SharepreferenceDBHandler.getUserID(this.f33024a), ViewDetailsActivity.this.f32886B0).size() > 0) {
                ViewDetailsActivity.this.y2();
            } else {
                ViewDetailsActivity.this.f2();
            }
        }
    }

    public class s implements InterfaceC1611e {
        public s() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
            ViewDetailsActivity.this.f32991v.setBackgroundResource(a7.e.f12040o1);
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
        }
    }

    public class t implements View.OnClickListener {
        public t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ViewDetailsActivity.this.f32890D0.checkFavourite(ViewDetailsActivity.this.f32884A0, ViewDetailsActivity.this.f32888C0, "vod", SharepreferenceDBHandler.getUserID(ViewDetailsActivity.this.f32962l0), ViewDetailsActivity.this.f32886B0).size() > 0) {
                ViewDetailsActivity.this.y2();
            } else {
                ViewDetailsActivity.this.f2();
            }
        }
    }

    public class u extends AsyncTask {
        public u() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("http://www.google.com").openConnection();
                httpURLConnection.setRequestMethod(HttpHead.METHOD_NAME);
                httpURLConnection.setReadTimeout(1500);
                httpURLConnection.setConnectTimeout(1500);
                return Boolean.valueOf(httpURLConnection.getResponseCode() == 200);
            } catch (Exception e9) {
                Log.e("LOG_TAG", e9.toString());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            String str;
            DownloadedDataModel downloadedDataModel;
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                ViewDetailsActivity.this.f32938d = true;
                str = "connected";
            } else {
                ViewDetailsActivity.this.f32938d = false;
                str = "not connected";
            }
            Log.i("internetCheck", str);
            String strTrim = ViewDetailsActivity.this.f32949h.getText().toString().trim();
            if (strTrim.equalsIgnoreCase(ViewDetailsActivity.this.f32962l0.getResources().getString(a7.j.f13268h1).concat("..")) || strTrim.equalsIgnoreCase("Waiting..")) {
                ViewDetailsActivity viewDetailsActivity = ViewDetailsActivity.this;
                viewDetailsActivity.E2(viewDetailsActivity.f32940e);
                return;
            }
            if (ViewDetailsActivity.this.f32949h.getText().toString().equals(ViewDetailsActivity.this.f32962l0.getResources().getString(a7.j.f13258g1))) {
                Toast.makeText(ViewDetailsActivity.this.getApplicationContext(), "Already Downloaded", 1).show();
                return;
            }
            if (!ViewDetailsActivity.this.f32938d) {
                ViewDetailsActivity.this.D2();
                return;
            }
            Toast.makeText(ViewDetailsActivity.this.getApplicationContext(), "Downloading Started", 1).show();
            ViewDetailsActivity.this.f32952i.setVisibility(0);
            ViewDetailsActivity viewDetailsActivity2 = ViewDetailsActivity.this;
            viewDetailsActivity2.f32949h.setText(viewDetailsActivity2.f32962l0.getResources().getString(a7.j.f13268h1).concat(".."));
            Log.i("movieURLIS", "url:" + ViewDetailsActivity.this.f32961l);
            AbstractServiceC3053x.x(ViewDetailsActivity.this.getApplicationContext(), VideoDownloadService.class, (SharepreferenceDBHandler.getCurrentAPPType(ViewDetailsActivity.this.f32962l0).equals("api") ? new C3052w.b(String.valueOf(ViewDetailsActivity.this.f32884A0), Uri.parse(ViewDetailsActivity.this.f32961l)) : new C3052w.b(ViewDetailsActivity.this.f32886B0, Uri.parse(ViewDetailsActivity.this.f32961l))).a(), true);
            try {
                ViewDetailsActivity viewDetailsActivity3 = ViewDetailsActivity.this;
                viewDetailsActivity3.f32946g = viewDetailsActivity3.f32943f.getDownloadedData();
                if (ViewDetailsActivity.this.f32946g.size() <= 0) {
                    ArrayList<DownloadedDataModel> arrayList = new ArrayList<>();
                    DownloadedDataModel downloadedDataModel2 = new DownloadedDataModel();
                    downloadedDataModel2.setMovieName(ViewDetailsActivity.this.f32992v0);
                    downloadedDataModel2.setMovieExtension(ViewDetailsActivity.this.f33000y0);
                    downloadedDataModel2.setMovieStreamID(SharepreferenceDBHandler.getCurrentAPPType(ViewDetailsActivity.this.f32962l0).equals("api") ? String.valueOf(ViewDetailsActivity.this.f32884A0) : String.valueOf(ViewDetailsActivity.this.f32886B0));
                    downloadedDataModel2.setMovieDuration(String.valueOf(ViewDetailsActivity.this.f32935a1));
                    downloadedDataModel2.setMovieNum(ViewDetailsActivity.this.f33002z0);
                    downloadedDataModel2.setMovieImage(ViewDetailsActivity.this.f32964m);
                    downloadedDataModel2.setMovieURL(ViewDetailsActivity.this.f32961l);
                    downloadedDataModel2.setMovieState("Downloading");
                    downloadedDataModel2.setMoviePercentage(0);
                    if (SharepreferenceDBHandler.getCurrentAPPType(ViewDetailsActivity.this.f32962l0).equals("api")) {
                        downloadedDataModel2.setMovieType("TYPE_API");
                    } else {
                        downloadedDataModel2.setMovieType("SINGLE_STREAM");
                    }
                    arrayList.add(downloadedDataModel2);
                    ViewDetailsActivity.this.f32943f.addDownloadedData(arrayList);
                    Log.i("movieDuration", "duration:" + ViewDetailsActivity.this.f32935a1);
                    Log.i("movieURLIS", "url:" + ViewDetailsActivity.this.f32961l);
                    return;
                }
                boolean z9 = false;
                boolean z10 = false;
                int moviePercentage = 0;
                int idAuto = 0;
                for (int i9 = 0; i9 < ViewDetailsActivity.this.f32946g.size(); i9++) {
                    if (SharepreferenceDBHandler.getCurrentAPPType(ViewDetailsActivity.this.f32962l0).equals("api")) {
                        if (((DownloadedDataModel) ViewDetailsActivity.this.f32946g.get(i9)).getMovieStreamID().equals(String.valueOf(ViewDetailsActivity.this.f32884A0))) {
                            idAuto = ((DownloadedDataModel) ViewDetailsActivity.this.f32946g.get(i9)).getIdAuto();
                            downloadedDataModel = (DownloadedDataModel) ViewDetailsActivity.this.f32946g.get(i9);
                            moviePercentage = downloadedDataModel.getMoviePercentage();
                            z9 = true;
                        }
                    } else if (((DownloadedDataModel) ViewDetailsActivity.this.f32946g.get(i9)).getMovieStreamID().equals(String.valueOf(ViewDetailsActivity.this.f32886B0))) {
                        idAuto = ((DownloadedDataModel) ViewDetailsActivity.this.f32946g.get(i9)).getIdAuto();
                        downloadedDataModel = (DownloadedDataModel) ViewDetailsActivity.this.f32946g.get(i9);
                        moviePercentage = downloadedDataModel.getMoviePercentage();
                        z9 = true;
                    }
                    if (((DownloadedDataModel) ViewDetailsActivity.this.f32946g.get(i9)).getMovieState().equals("Downloading")) {
                        z10 = true;
                    }
                }
                if (z9) {
                    ArrayList<DownloadedDataModel> arrayList2 = new ArrayList<>();
                    DownloadedDataModel downloadedDataModel3 = new DownloadedDataModel();
                    if (z10) {
                        downloadedDataModel3.setMovieState("Waiting");
                    } else {
                        downloadedDataModel3.setMovieState("Downloading");
                    }
                    downloadedDataModel3.setMoviePercentage(moviePercentage);
                    arrayList2.add(downloadedDataModel3);
                    ViewDetailsActivity.this.f32943f.updateDownloadedData(arrayList2, idAuto);
                } else {
                    ArrayList<DownloadedDataModel> arrayList3 = new ArrayList<>();
                    DownloadedDataModel downloadedDataModel4 = new DownloadedDataModel();
                    downloadedDataModel4.setMovieName(ViewDetailsActivity.this.f32992v0);
                    downloadedDataModel4.setMovieExtension(ViewDetailsActivity.this.f33000y0);
                    downloadedDataModel4.setMovieStreamID(SharepreferenceDBHandler.getCurrentAPPType(ViewDetailsActivity.this.f32962l0).equals("api") ? String.valueOf(ViewDetailsActivity.this.f32884A0) : String.valueOf(ViewDetailsActivity.this.f32886B0));
                    downloadedDataModel4.setMovieDuration(String.valueOf(ViewDetailsActivity.this.f32935a1));
                    downloadedDataModel4.setMovieNum(ViewDetailsActivity.this.f33002z0);
                    downloadedDataModel4.setMovieImage(ViewDetailsActivity.this.f32964m);
                    downloadedDataModel4.setMovieURL(ViewDetailsActivity.this.f32961l);
                    if (z10) {
                        downloadedDataModel4.setMovieState("Waiting");
                    } else {
                        downloadedDataModel4.setMovieState("Downloading");
                    }
                    downloadedDataModel4.setMoviePercentage(0);
                    if (SharepreferenceDBHandler.getCurrentAPPType(ViewDetailsActivity.this.f32962l0).equals("api")) {
                        downloadedDataModel4.setMovieType("TYPE_API");
                    } else {
                        downloadedDataModel4.setMovieType("SINGLE_STREAM");
                    }
                    arrayList3.add(downloadedDataModel4);
                    ViewDetailsActivity.this.f32943f.addDownloadedData(arrayList3);
                    Log.i("movieURLIS", "url:" + ViewDetailsActivity.this.f32961l);
                }
                if (z10) {
                    ViewDetailsActivity.this.f32949h.setText("Waiting..");
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public class v implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f33029a;

        public v(View view) {
            this.f33029a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f33029a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f33029a, "scaleY", f9);
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
                Log.e("id is", "" + this.f33029a.getTag());
                View view3 = this.f33029a;
                if (view3 == null || view3.getTag() == null) {
                    return;
                }
                if (this.f33029a.getTag().equals("1")) {
                    a(f9);
                    b(f9);
                    view2 = ViewDetailsActivity.this.f32956j0;
                } else if (this.f33029a.getTag().equals("2")) {
                    a(f9);
                    b(f9);
                    view2 = this.f33029a;
                } else if (this.f33029a.getTag().equals("5")) {
                    a(f9);
                    b(f9);
                    view2 = ViewDetailsActivity.this.f32950h0;
                } else if (this.f33029a.getTag().equals("8")) {
                    a(f9);
                    b(f9);
                    view2 = ViewDetailsActivity.this.f32912O0;
                    i9 = a7.e.f12010h;
                } else if (!this.f33029a.getTag().equals("101")) {
                    a(1.15f);
                    b(1.15f);
                    return;
                } else {
                    a(f9);
                    b(f9);
                    view2 = ViewDetailsActivity.this.f32967n;
                }
                i9 = a7.e.f12042p;
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                a(f9);
                b(f9);
                View view4 = this.f33029a;
                if (view4 == null || view4.getTag() == null) {
                    return;
                }
                if (this.f33029a.getTag().equals("1")) {
                    view2 = ViewDetailsActivity.this.f32956j0;
                } else {
                    if (this.f33029a.getTag().equals("3")) {
                        view2 = this.f33029a;
                    } else if (this.f33029a.getTag().equals("5")) {
                        view2 = ViewDetailsActivity.this.f32950h0;
                    } else if (this.f33029a.getTag() != null && this.f33029a.getTag().equals("8")) {
                        view2 = ViewDetailsActivity.this.f32912O0;
                    } else if (!this.f33029a.getTag().equals("101")) {
                        return;
                    } else {
                        view2 = ViewDetailsActivity.this.f32967n;
                    }
                    i9 = a7.e.f12038o;
                }
                i9 = a7.e.f11891A1;
            }
            view2.setBackgroundResource(i9);
        }
    }

    private void F2(Context context, String str, String str2) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        Resources resources;
        int i9;
        ImageView imageView2;
        int i10;
        this.f32989u0 = new n7.l(this, context);
        this.f32920S0 = new n7.h(this, context);
        Intent intent = getIntent();
        if (intent != null) {
            try {
                this.f32884A0 = Integer.parseInt(intent.getStringExtra(AbstractC2237a.f44464Q));
            } catch (NumberFormatException unused) {
                this.f32884A0 = -1;
            }
            this.f32886B0 = intent.getStringExtra(AbstractC2237a.f44464Q);
            this.f32992v0 = intent.getStringExtra("movie");
            this.f32995w0 = intent.getStringExtra("selectedPlayer");
            this.f32998x0 = intent.getStringExtra("streamType");
            this.f33000y0 = intent.getStringExtra("containerExtension");
            this.f32888C0 = intent.getStringExtra("categoryID");
            this.f33002z0 = intent.getStringExtra("num");
            this.f32916Q0 = intent.getStringExtra("movie_icon");
            this.f32942e1 = intent.getStringExtra("movie_director");
            this.f32945f1 = intent.getStringExtra("movie_cast");
            this.f32948g1 = intent.getStringExtra("movie_genre");
            this.f32951h1 = intent.getStringExtra("movie_description");
            this.f32954i1 = intent.getStringExtra("movie_cmd");
            this.f32957j1 = intent.getStringExtra("movie_rating");
            this.f32963l1 = intent.getStringExtra("movie_duration_min");
            this.f32966m1 = intent.getStringExtra("movie_year");
            this.f32969n1 = intent.getIntExtra("movie_fav", 0);
            VodAllCategoriesSingleton.getInstance().setMoviesPoster(this.f32916Q0);
            G2();
            TextView textView3 = this.f32997x;
            if (textView3 != null) {
                textView3.requestFocus();
                this.f32997x.setFocusable(true);
            }
            if (!SharepreferenceDBHandler.getCurrentAPPType(context).equals("stalker_api")) {
                if (this.f32890D0.checkFavourite(this.f32884A0, this.f32888C0, "vod", SharepreferenceDBHandler.getUserID(context), this.f32886B0).size() > 0) {
                    if (Build.VERSION.SDK_INT <= 21) {
                        imageView2 = this.f32895G;
                        i10 = a7.e.f11967V;
                        imageView2.setImageResource(i10);
                    } else {
                        imageView = this.f32895G;
                        resources = context.getResources();
                        i9 = a7.e.f11967V;
                        imageView.setImageDrawable(F.h.f(resources, i9, context.getTheme()));
                    }
                } else if (Build.VERSION.SDK_INT <= 21) {
                    imageView2 = this.f32895G;
                    i10 = a7.e.f11970W;
                    imageView2.setImageResource(i10);
                } else {
                    imageView = this.f32895G;
                    resources = context.getResources();
                    i9 = a7.e.f11970W;
                    imageView.setImageDrawable(F.h.f(resources, i9, context.getTheme()));
                }
            }
            ImageView imageView3 = this.f32895G;
            if (imageView3 != null) {
                imageView3.setOnFocusChangeListener(new v(imageView3));
                this.f32895G.setOnClickListener(new r(context));
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(context).equals("onestream_api")) {
                k2();
                return;
            }
            if (!SharepreferenceDBHandler.getCurrentAPPType(context).equals("stalker_api")) {
                int i11 = this.f32884A0;
                if (i11 == -1 || i11 == 0) {
                    return;
                }
                this.f32989u0.b(str, str2, i11);
                String strU = w.U(context, this.f32884A0, this.f33000y0, "movie");
                this.f32961l = strU;
                this.f32961l = w.G(strU);
                Log.i("downloadURLIS", "URL:" + this.f32961l);
                return;
            }
            try {
                if (this.f32969n1 == 1) {
                    f2();
                } else {
                    y2();
                }
                String str3 = this.f32992v0;
                if (str3 != null && (textView2 = this.f32994w) != null) {
                    textView2.setText(str3);
                }
                LinearLayout linearLayout = this.f32915Q;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                LinearLayout linearLayout2 = this.f32925V;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                TextView textView4 = this.f32903K;
                if (textView4 != null) {
                    textView4.setText("N/A");
                }
                TextView textView5 = this.f32887C;
                if (textView5 != null) {
                    textView5.setText("N/A");
                }
                TextView textView6 = this.f32883A;
                if (textView6 != null) {
                    textView6.setText("N/A");
                }
                TextView textView7 = this.f32891E;
                if (textView7 != null) {
                    textView7.setText("N/A");
                }
                TextView textView8 = this.f32899I;
                if (textView8 != null) {
                    textView8.setText("N/A");
                }
                TextView textView9 = this.f32931Y;
                if (textView9 != null) {
                    textView9.setVisibility(8);
                }
                TextView textView10 = this.f32887C;
                if (textView10 != null) {
                    textView10.setText("N/A");
                }
                String str4 = this.f32916Q0;
                String str5 = this.f32942e1;
                String str6 = this.f32945f1;
                this.f32896G0 = str6;
                String str7 = this.f32966m1;
                String str8 = this.f32957j1;
                String str9 = this.f32951h1;
                String str10 = this.f32948g1;
                int iR0 = w.r0(this.f32963l1);
                this.f32960k1 = iR0;
                this.f32935a1 = iR0 * 60;
                this.f32900I0 = str10;
                int i12 = iR0 * 60;
                if (context == null || str4 == null || str4.isEmpty()) {
                    this.f32991v.setBackgroundResource(a7.e.f12040o1);
                } else {
                    com.squareup.picasso.t.q(context).l(str4).j(a7.e.f11895B1).h(this.f32991v, new s());
                }
                String str11 = this.f32992v0;
                if (str11 != null && (textView = this.f32994w) != null) {
                    textView.setText(str11);
                }
                if (this.f32913P == null || this.f32923U == null || this.f32891E == null || str7 == null || str7.isEmpty() || str7.equals("n/A")) {
                    LinearLayout linearLayout3 = this.f32913P;
                    if (linearLayout3 != null) {
                        linearLayout3.setVisibility(0);
                    }
                    LinearLayout linearLayout4 = this.f32923U;
                    if (linearLayout4 != null) {
                        linearLayout4.setVisibility(0);
                    }
                    TextView textView11 = this.f32891E;
                    if (textView11 != null) {
                        textView11.setText("N/A");
                    }
                } else {
                    this.f32913P.setVisibility(0);
                    this.f32923U.setVisibility(0);
                    this.f32891E.setText(str7);
                }
                if (this.f32883A == null || this.f32921T == null || this.f32911O == null || str5 == null || str5.isEmpty() || str5.equals("n/A")) {
                    LinearLayout linearLayout5 = this.f32911O;
                    if (linearLayout5 != null) {
                        linearLayout5.setVisibility(0);
                    }
                    LinearLayout linearLayout6 = this.f32921T;
                    if (linearLayout6 != null) {
                        linearLayout6.setVisibility(0);
                    }
                    TextView textView12 = this.f32883A;
                    if (textView12 != null) {
                        textView12.setText("N/A");
                    }
                } else {
                    this.f32911O.setVisibility(0);
                    this.f32921T.setVisibility(0);
                    this.f32883A.setText(str5);
                }
                if (this.f32919S == null || this.f32929X == null || this.f32887C == null || str6 == null || str6.isEmpty()) {
                    LinearLayout linearLayout7 = this.f32919S;
                    if (linearLayout7 != null) {
                        linearLayout7.setVisibility(0);
                    }
                    LinearLayout linearLayout8 = this.f32929X;
                    if (linearLayout8 != null) {
                        linearLayout8.setVisibility(0);
                    }
                    TextView textView13 = this.f32931Y;
                    if (textView13 != null) {
                        textView13.setVisibility(8);
                    }
                    TextView textView14 = this.f32887C;
                    if (textView14 != null) {
                        textView14.setText("N/A");
                    }
                } else {
                    this.f32919S.setVisibility(0);
                    this.f32929X.setVisibility(0);
                    if (str6.length() > 150) {
                        this.f32887C.setText(str6);
                        this.f32931Y.setVisibility(0);
                    } else {
                        this.f32887C.setText(str6);
                        this.f32931Y.setVisibility(8);
                    }
                }
                if (this.f32893F != null && str8 != null && !str8.isEmpty() && !str8.equals("n/A")) {
                    this.f32893F.setVisibility(0);
                    try {
                        this.f32893F.setRating(Float.parseFloat(str8) / 2.0f);
                    } catch (NumberFormatException unused2) {
                        this.f32893F.setRating(0.0f);
                    }
                }
                if (this.f32999y == null || str9 == null || str9.isEmpty() || str9.equals("n/A")) {
                    TextView textView15 = this.f32999y;
                    if (textView15 != null) {
                        textView15.setVisibility(8);
                    }
                } else {
                    this.f32999y.setText(str9);
                }
                if (this.f32917R == null || this.f32927W == null || this.f32899I == null || str10 == null || str10.isEmpty()) {
                    LinearLayout linearLayout9 = this.f32917R;
                    if (linearLayout9 != null) {
                        linearLayout9.setVisibility(0);
                    }
                    LinearLayout linearLayout10 = this.f32927W;
                    if (linearLayout10 != null) {
                        linearLayout10.setVisibility(0);
                    }
                    TextView textView16 = this.f32899I;
                    if (textView16 != null) {
                        textView16.setText("N/A");
                    }
                } else {
                    this.f32917R.setVisibility(0);
                    this.f32927W.setVisibility(0);
                    str10.length();
                    this.f32899I.setText(str10);
                }
                LinearLayout linearLayout11 = this.f32915Q;
                if (linearLayout11 == null || this.f32925V == null || this.f32903K == null) {
                    if (linearLayout11 != null) {
                        linearLayout11.setVisibility(0);
                    }
                    LinearLayout linearLayout12 = this.f32925V;
                    if (linearLayout12 != null) {
                        linearLayout12.setVisibility(0);
                    }
                    TextView textView17 = this.f32903K;
                    if (textView17 != null) {
                        textView17.setText("N/A");
                        return;
                    }
                    return;
                }
                linearLayout11.setVisibility(0);
                this.f32925V.setVisibility(0);
                float f9 = i12;
                int i13 = (int) (f9 / 3600.0f);
                try {
                    int iRound = Math.round((f9 % 3600.0f) / 60.0f);
                    if (i13 == 0) {
                        this.f32903K.setText(iRound + "m");
                    } else {
                        this.f32903K.setText(i13 + "h " + iRound + "m");
                    }
                } catch (Exception unused3) {
                    this.f32903K.setText(i12);
                }
            } catch (Exception unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f2() {
        FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
        favouriteDBModel.setCategoryID(this.f32888C0);
        favouriteDBModel.setStreamID(this.f32884A0);
        favouriteDBModel.setStreamIDOneStream(this.f32886B0);
        favouriteDBModel.setName(this.f32992v0);
        favouriteDBModel.setNum(this.f33002z0);
        favouriteDBModel.setUserID(SharepreferenceDBHandler.getUserID(this.f32962l0));
        this.f32890D0.addToFavourite(favouriteDBModel, "vod");
        if (Build.VERSION.SDK_INT <= 21) {
            this.f32895G.setImageResource(a7.e.f11967V);
        } else {
            this.f32895G.setImageDrawable(F.h.f(this.f32962l0.getResources(), a7.e.f11967V, this.f32962l0.getTheme()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g2() {
        w.N0(this.f32962l0);
        String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f32962l0);
        try {
            this.f32975p1.e(SharepreferenceDBHandler.getLoggedInMacAddress(this.f32962l0), stalkerToken, null, String.valueOf(this.f32884A0), 0);
        } catch (Exception unused) {
        }
    }

    private void h2() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    public static long i2(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0L;
        }
    }

    public static String j2(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    private void m2() {
        this.f32928W0 = (RecyclerView) findViewById(a7.f.Df);
        this.f32930X0 = (ImageView) findViewById(a7.f.f12141F4);
        this.f32967n = (LinearLayout) findViewById(a7.f.f12244P7);
        this.f32976q = (Toolbar) findViewById(a7.f.kh);
        this.f32949h = (TextView) findViewById(a7.f.Ki);
        this.f32952i = (ProgressBar) findViewById(a7.f.Pc);
        this.f32955j = (ProgressBar) findViewById(a7.f.Qc);
        this.f32958k = (ImageView) findViewById(a7.f.f12527s4);
        this.f32985t = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f32988u = (RelativeLayout) findViewById(a7.f.Nd);
        this.f32991v = (ImageView) findViewById(a7.f.f12102B5);
        this.f32994w = (TextView) findViewById(a7.f.lk);
        this.f32997x = (TextView) findViewById(a7.f.Pk);
        this.f32999y = (TextView) findViewById(a7.f.kk);
        this.f33001z = (TextView) findViewById(a7.f.Hi);
        this.f32883A = (TextView) findViewById(a7.f.Ii);
        this.f32885B = (TextView) findViewById(a7.f.Rh);
        this.f32887C = (TextView) findViewById(a7.f.Th);
        this.f32889D = (TextView) findViewById(a7.f.tl);
        this.f32891E = (TextView) findViewById(a7.f.ul);
        this.f32893F = (RatingBar) findViewById(a7.f.bd);
        this.f32895G = (ImageView) findViewById(a7.f.f12406g5);
        this.f32897H = (TextView) findViewById(a7.f.ik);
        this.f32899I = (TextView) findViewById(a7.f.zj);
        this.f32901J = (TextView) findViewById(a7.f.gk);
        this.f32903K = (TextView) findViewById(a7.f.hk);
        this.f32905L = (LinearLayout) findViewById(a7.f.f12265R8);
        this.f32907M = (ScrollView) findViewById(a7.f.Tf);
        this.f32909N = (NestedScrollView) findViewById(a7.f.Nb);
        this.f32911O = (LinearLayout) findViewById(a7.f.f12174I7);
        this.f32913P = (LinearLayout) findViewById(a7.f.H9);
        this.f32915Q = (LinearLayout) findViewById(a7.f.f12274S7);
        this.f32917R = (LinearLayout) findViewById(a7.f.f12521r8);
        this.f32919S = (LinearLayout) findViewById(a7.f.f12499p7);
        this.f32921T = (LinearLayout) findViewById(a7.f.f12184J7);
        this.f32923U = (LinearLayout) findViewById(a7.f.I9);
        this.f32925V = (LinearLayout) findViewById(a7.f.f12284T7);
        this.f32927W = (LinearLayout) findViewById(a7.f.f12531s8);
        this.f32929X = (LinearLayout) findViewById(a7.f.f12510q7);
        this.f32931Y = (TextView) findViewById(a7.f.kl);
        this.f32933Z = (LinearLayout) findViewById(a7.f.Ga);
        this.f32941e0 = (TextView) findViewById(a7.f.qm);
        this.f32944f0 = (ImageView) findViewById(a7.f.Xa);
        this.f32947g0 = (RelativeLayout) findViewById(a7.f.vf);
        this.f32950h0 = (LinearLayout) findViewById(a7.f.Ha);
        this.f32953i0 = (ProgressBar) findViewById(a7.f.Zb);
        this.f32956j0 = (LinearLayout) findViewById(a7.f.p9);
    }

    private void n2() {
        this.f32974p0 = new LiveStreamDBHandler(this.f32962l0);
        this.f32975p1 = new n7.e(this, this.f32962l0);
        this.f32978q1 = new n7.g(this, this.f32962l0);
        this.f32890D0 = new DatabaseHandler(this.f32962l0);
        this.f32922T0 = new RecentWatchDBHandler(this.f32962l0);
        this.f32997x.requestFocus();
        this.f32997x.setFocusable(true);
        TextView textView = this.f32994w;
        if (textView != null) {
            textView.setSelected(true);
        }
        if (!SharepreferenceDBHandler.getCurrentAPPType(this.f32962l0).equals("stalker_api")) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.f32965m0 = progressDialog;
            progressDialog.setCanceledOnTouchOutside(false);
            this.f32965m0.setMessage(this.f32962l0.getResources().getString(a7.j.f13392t5));
            this.f32965m0.show();
        }
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f32968n0 = sharedPreferences;
        String string = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        String string2 = this.f32968n0.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        if (string.isEmpty() || string2.isEmpty()) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        } else {
            F2(this.f32962l0, string, string2);
        }
        this.f32944f0.setOnClickListener(new p());
        this.f32930X0.setOnClickListener(new q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q2(View view) {
        if (!SharepreferenceDBHandler.getCurrentAPPType(this.f32962l0).equals("stalker_api")) {
            x2(view);
            return;
        }
        w.N0(this.f32962l0);
        String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f32962l0);
        try {
            this.f32978q1.c(SharepreferenceDBHandler.getLoggedInMacAddress(this.f32962l0), stalkerToken, this.f32954i1, "", view, "vod", 0, 0, "", "", "", "", "", "", 0, "", "");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r2(View view) {
        if (!SharepreferenceDBHandler.getCurrentAPPType(this.f32962l0).equals("stalker_api")) {
            x2(view);
            return;
        }
        w.N0(this.f32962l0);
        String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f32962l0);
        try {
            this.f32978q1.c(SharepreferenceDBHandler.getLoggedInMacAddress(this.f32962l0), stalkerToken, this.f32954i1, "", view, "vod", 0, 0, "", "", "", "", "", "", 0, "", "");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t2(View view) {
        String str = this.f32908M0;
        if (str == null || str.isEmpty()) {
            w2(this);
        } else {
            startActivity(new Intent(this, (Class<?>) YouTubePlayerActivity.class).putExtra("you_tube_trailer", this.f32908M0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u2(View view) {
        new u().execute(new Void[0]);
        this.f32940e = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y2() {
        this.f32890D0.deleteFavourite(this.f32884A0, this.f32888C0, "vod", this.f32992v0, SharepreferenceDBHandler.getUserID(this.f32962l0), this.f32886B0);
        if (Build.VERSION.SDK_INT <= 21) {
            this.f32895G.setImageResource(a7.e.f11970W);
        } else {
            this.f32895G.setImageDrawable(F.h.f(this.f32962l0.getResources(), a7.e.f11970W, this.f32962l0.getTheme()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z2() {
        w.N0(this.f32962l0);
        String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f32962l0);
        try {
            this.f32975p1.s(SharepreferenceDBHandler.getLoggedInMacAddress(this.f32962l0), stalkerToken, null, String.valueOf(this.f32884A0), 0);
        } catch (Exception unused) {
        }
    }

    public void A2() {
        this.f32997x.setOnClickListener(new View.OnClickListener() { // from class: p7.s1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46668a.q2(view);
            }
        });
        this.f32991v.setOnClickListener(new View.OnClickListener() { // from class: p7.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46670a.r2(view);
            }
        });
        this.f32931Y.setOnClickListener(new View.OnClickListener() { // from class: p7.u1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46672a.s2(view);
            }
        });
        this.f32941e0.setOnClickListener(new View.OnClickListener() { // from class: p7.v1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46674a.t2(view);
            }
        });
        this.f32949h.setOnClickListener(new View.OnClickListener() { // from class: p7.w1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46677a.u2(view);
            }
        });
    }

    public void B2(Activity activity) {
        if (activity != null) {
            a.C0158a c0158a = new a.C0158a(activity);
            c0158a.setTitle("Are you sure want to cancel the downloading?");
            c0158a.j("Yes", new m());
            c0158a.g("No", new n());
            androidx.appcompat.app.a aVarCreate = c0158a.create();
            this.f32959k0 = aVarCreate;
            aVarCreate.show();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x015f A[Catch: Exception -> 0x01a0, TryCatch #0 {Exception -> 0x01a0, blocks: (B:4:0x0007, B:6:0x000d, B:8:0x001c, B:10:0x0022, B:12:0x002c, B:14:0x0098, B:15:0x00a5, B:17:0x00ba, B:20:0x00c0, B:22:0x00c4, B:23:0x00d6, B:26:0x00dc, B:28:0x00e0, B:31:0x00e6, B:33:0x00ec, B:35:0x00f2, B:45:0x0117, B:48:0x011d, B:50:0x0123, B:51:0x0128, B:53:0x0139, B:54:0x013f, B:57:0x0145, B:59:0x014b, B:61:0x0151, B:62:0x0157, B:64:0x015b, B:36:0x0102, B:38:0x0106, B:39:0x0109, B:41:0x010d, B:42:0x0110, B:44:0x0114, B:16:0x00ac, B:65:0x015f, B:67:0x0163, B:69:0x0167, B:70:0x016a, B:72:0x016e, B:73:0x0171, B:75:0x0175, B:76:0x0178, B:78:0x017c, B:79:0x017f, B:81:0x0183, B:82:0x0186, B:84:0x018a, B:85:0x018d, B:87:0x0191, B:88:0x0194, B:90:0x0198, B:91:0x019b), top: B:96:0x0007, inners: #1 }] */
    @Override // z7.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C(com.nst.iptvsmarterstvbox.model.callback.SearchTMDBMoviesCallback r9) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ViewDetailsActivity.C(com.nst.iptvsmarterstvbox.model.callback.SearchTMDBMoviesCallback):void");
    }

    /* JADX INFO: renamed from: C2, reason: merged with bridge method [inline-methods] */
    public final void s2(ViewDetailsActivity viewDetailsActivity) {
        View viewInflate = ((LayoutInflater) viewDetailsActivity.getSystemService("layout_inflater")).inflate(a7.g.f12802g3, (RelativeLayout) viewDetailsActivity.findViewById(a7.f.We));
        TextView textView = (TextView) viewInflate.findViewById(a7.f.Wh);
        this.f32902J0 = textView;
        textView.setText(this.f32896G0);
        PopupWindow popupWindow = new PopupWindow(viewDetailsActivity);
        this.f32892E0 = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.f32892E0.setWidth(-1);
        this.f32892E0.setHeight(-1);
        this.f32892E0.setFocusable(true);
        this.f32892E0.showAtLocation(viewInflate, 17, 0, 0);
        Button button = (Button) viewInflate.findViewById(a7.f.f12482o0);
        this.f32894F0 = button;
        if (button != null) {
            button.setOnFocusChangeListener(new v(button));
        }
        this.f32894F0.setOnClickListener(new o());
    }

    @Override // z7.j
    public void D0(String str) {
    }

    public final void D2() {
        Toast.makeText(getApplicationContext(), "please check your internet connection!", 0).show();
    }

    @Override // z7.n
    public void E0(String str) {
        TextView textView;
        try {
            this.f32896G0 = "";
            this.f32900I0 = "";
            String str2 = this.f32992v0;
            if (str2 != null && (textView = this.f32994w) != null) {
                textView.setText(str2);
            }
            LinearLayout linearLayout = this.f32913P;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            LinearLayout linearLayout2 = this.f32923U;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            TextView textView2 = this.f32891E;
            if (textView2 != null) {
                textView2.setText("N/A");
            }
            TextView textView3 = this.f32883A;
            LinearLayout linearLayout3 = this.f32911O;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(0);
            }
            LinearLayout linearLayout4 = this.f32921T;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(0);
            }
            TextView textView4 = this.f32883A;
            if (textView4 != null) {
                textView4.setText("N/A");
            }
            LinearLayout linearLayout5 = this.f32919S;
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(0);
            }
            LinearLayout linearLayout6 = this.f32929X;
            if (linearLayout6 != null) {
                linearLayout6.setVisibility(0);
            }
            TextView textView5 = this.f32931Y;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            TextView textView6 = this.f32887C;
            if (textView6 != null) {
                textView6.setText("N/A");
            }
            TextView textView7 = this.f32999y;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
            LinearLayout linearLayout7 = this.f32917R;
            if (linearLayout7 != null) {
                linearLayout7.setVisibility(0);
            }
            LinearLayout linearLayout8 = this.f32927W;
            if (linearLayout8 != null) {
                linearLayout8.setVisibility(0);
            }
            TextView textView8 = this.f32899I;
            if (textView8 != null) {
                textView8.setText("N/A");
            }
            LinearLayout linearLayout9 = this.f32915Q;
            if (linearLayout9 == null || this.f32925V == null || this.f32903K == null) {
                if (linearLayout9 != null) {
                    linearLayout9.setVisibility(0);
                }
                LinearLayout linearLayout10 = this.f32925V;
                if (linearLayout10 != null) {
                    linearLayout10.setVisibility(0);
                }
                TextView textView9 = this.f32903K;
                if (textView9 != null) {
                    textView9.setText("N/A");
                    return;
                }
                return;
            }
            linearLayout9.setVisibility(0);
            this.f32925V.setVisibility(0);
            float f9 = 0;
            int i9 = (int) (f9 / 3600.0f);
            try {
                int iRound = Math.round((f9 % 3600.0f) / 60.0f);
                if (i9 == 0) {
                    this.f32903K.setText(iRound + "m");
                } else {
                    this.f32903K.setText(i9 + "h " + iRound + "m");
                }
            } catch (Exception unused) {
                this.f32903K.setText(0);
            }
        } catch (Exception unused2) {
        }
    }

    public final void E2(View view) {
        PopupMenu popupMenu = new PopupMenu(this.f32962l0, view);
        popupMenu.getMenuInflater().inflate(a7.h.f12920c, popupMenu.getMenu());
        popupMenu.show();
        popupMenu.setOnMenuItemClickListener(new l());
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

    public void G2() {
        ProgressBar progressBar;
        int iRound;
        int iR0;
        int iRound2;
        ArrayList<LiveStreamsDBModel> recentWatchedByStreamIDOneStream = SharepreferenceDBHandler.getCurrentAPPType(this.f32962l0).equals("onestream_api") ? this.f32922T0.getRecentWatchedByStreamIDOneStream(this.f32886B0) : this.f32922T0.getRecentWatchedByStreamID(this.f32884A0);
        if (recentWatchedByStreamIDOneStream == null || recentWatchedByStreamIDOneStream.size() <= 0) {
            progressBar = this.f32953i0;
            if (progressBar == null) {
                return;
            }
        } else {
            TextView textView = this.f32997x;
            if (textView == null) {
                return;
            }
            textView.setText(getResources().getString(a7.j.f13313l6));
            String strValueOf = String.valueOf(recentWatchedByStreamIDOneStream.get(0).getMovieElapsedTime());
            String strValueOf2 = String.valueOf(recentWatchedByStreamIDOneStream.get(0).getMovieDuraton());
            if (this.f32953i0 == null) {
                return;
            }
            try {
                int iR02 = w.r0(strValueOf);
                iRound = Math.round(iR02 / 1000.0f);
                try {
                    this.f32937c1 = iR02;
                    iR0 = w.r0(strValueOf2);
                } catch (Exception unused) {
                    iR0 = 0;
                }
            } catch (Exception unused2) {
                iRound = 0;
            }
            try {
                iRound2 = Math.round((iRound / iR0) * 100.0f);
            } catch (Exception unused3) {
                iRound2 = 0;
            }
            if (iRound2 != 0) {
                this.f32953i0.setProgress(iRound2);
                this.f32953i0.setVisibility(0);
                return;
            } else {
                if (this.f32953i0.getVisibility() != 0) {
                    return;
                }
                this.f32953i0.setProgress(iRound2);
                progressBar = this.f32953i0;
            }
        }
        progressBar.setVisibility(8);
    }

    @Override // z7.g
    public void H(String str) {
    }

    @Override // z7.g
    public void I(m0.x xVar, int i9) {
        try {
            String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f32962l0);
            String loggedInMacAddress = SharepreferenceDBHandler.getLoggedInMacAddress(this.f32962l0);
            this.f32981r1 = "remove";
            this.f32975p1.f(loggedInMacAddress, stalkerToken, i9);
        } catch (Exception unused) {
            w.X();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d7 A[Catch: Exception -> 0x0383, TryCatch #2 {Exception -> 0x0383, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:15:0x0085, B:17:0x0089, B:18:0x008e, B:21:0x009c, B:23:0x00a2, B:25:0x00bb, B:26:0x00cd, B:28:0x00d9, B:30:0x00e7, B:32:0x00f3, B:34:0x00f9, B:36:0x00fd, B:37:0x0100, B:39:0x0104, B:52:0x0123, B:55:0x0135, B:57:0x013b, B:59:0x015d, B:61:0x0161, B:63:0x0165, B:64:0x0168, B:67:0x016e, B:69:0x0172, B:72:0x0178, B:74:0x017e, B:76:0x0184, B:86:0x01a9, B:88:0x01ad, B:90:0x01b1, B:93:0x01b7, B:95:0x01bd, B:97:0x01c3, B:107:0x01e8, B:109:0x01ec, B:111:0x01f0, B:114:0x01f6, B:116:0x01fc, B:118:0x020e, B:132:0x0240, B:135:0x0246, B:137:0x024c, B:139:0x0252, B:140:0x0257, B:142:0x0264, B:143:0x026a, B:146:0x0270, B:148:0x0276, B:150:0x027c, B:154:0x0289, B:156:0x028d, B:158:0x0291, B:161:0x0297, B:163:0x029d, B:173:0x02c8, B:175:0x02cc, B:177:0x02d0, B:179:0x02d4, B:187:0x0321, B:189:0x0329, B:190:0x032c, B:192:0x0330, B:193:0x0333, B:195:0x0337, B:164:0x02b3, B:166:0x02b7, B:167:0x02ba, B:169:0x02be, B:170:0x02c1, B:172:0x02c5, B:151:0x0282, B:153:0x0286, B:119:0x0219, B:120:0x0224, B:122:0x0228, B:123:0x022b, B:125:0x022f, B:126:0x0232, B:128:0x0236, B:129:0x0239, B:131:0x023d, B:98:0x01d3, B:100:0x01d7, B:101:0x01da, B:103:0x01de, B:104:0x01e1, B:106:0x01e5, B:77:0x0194, B:79:0x0198, B:80:0x019b, B:82:0x019f, B:83:0x01a2, B:85:0x01a6, B:58:0x0156, B:40:0x0108, B:42:0x010c, B:43:0x010f, B:45:0x0113, B:46:0x0117, B:48:0x011b, B:49:0x011e, B:14:0x0083, B:196:0x033b, B:198:0x033f, B:200:0x0343, B:201:0x0346, B:203:0x034a, B:204:0x034d, B:206:0x0351, B:207:0x0354, B:209:0x0358, B:210:0x035b, B:212:0x035f, B:213:0x0362, B:215:0x0366, B:216:0x0369, B:218:0x036d, B:219:0x0370, B:221:0x0374, B:222:0x0377, B:224:0x037b, B:225:0x037e, B:12:0x006e, B:181:0x02e6, B:184:0x02ee, B:185:0x0304), top: B:234:0x0000, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01de A[Catch: Exception -> 0x0383, TryCatch #2 {Exception -> 0x0383, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:15:0x0085, B:17:0x0089, B:18:0x008e, B:21:0x009c, B:23:0x00a2, B:25:0x00bb, B:26:0x00cd, B:28:0x00d9, B:30:0x00e7, B:32:0x00f3, B:34:0x00f9, B:36:0x00fd, B:37:0x0100, B:39:0x0104, B:52:0x0123, B:55:0x0135, B:57:0x013b, B:59:0x015d, B:61:0x0161, B:63:0x0165, B:64:0x0168, B:67:0x016e, B:69:0x0172, B:72:0x0178, B:74:0x017e, B:76:0x0184, B:86:0x01a9, B:88:0x01ad, B:90:0x01b1, B:93:0x01b7, B:95:0x01bd, B:97:0x01c3, B:107:0x01e8, B:109:0x01ec, B:111:0x01f0, B:114:0x01f6, B:116:0x01fc, B:118:0x020e, B:132:0x0240, B:135:0x0246, B:137:0x024c, B:139:0x0252, B:140:0x0257, B:142:0x0264, B:143:0x026a, B:146:0x0270, B:148:0x0276, B:150:0x027c, B:154:0x0289, B:156:0x028d, B:158:0x0291, B:161:0x0297, B:163:0x029d, B:173:0x02c8, B:175:0x02cc, B:177:0x02d0, B:179:0x02d4, B:187:0x0321, B:189:0x0329, B:190:0x032c, B:192:0x0330, B:193:0x0333, B:195:0x0337, B:164:0x02b3, B:166:0x02b7, B:167:0x02ba, B:169:0x02be, B:170:0x02c1, B:172:0x02c5, B:151:0x0282, B:153:0x0286, B:119:0x0219, B:120:0x0224, B:122:0x0228, B:123:0x022b, B:125:0x022f, B:126:0x0232, B:128:0x0236, B:129:0x0239, B:131:0x023d, B:98:0x01d3, B:100:0x01d7, B:101:0x01da, B:103:0x01de, B:104:0x01e1, B:106:0x01e5, B:77:0x0194, B:79:0x0198, B:80:0x019b, B:82:0x019f, B:83:0x01a2, B:85:0x01a6, B:58:0x0156, B:40:0x0108, B:42:0x010c, B:43:0x010f, B:45:0x0113, B:46:0x0117, B:48:0x011b, B:49:0x011e, B:14:0x0083, B:196:0x033b, B:198:0x033f, B:200:0x0343, B:201:0x0346, B:203:0x034a, B:204:0x034d, B:206:0x0351, B:207:0x0354, B:209:0x0358, B:210:0x035b, B:212:0x035f, B:213:0x0362, B:215:0x0366, B:216:0x0369, B:218:0x036d, B:219:0x0370, B:221:0x0374, B:222:0x0377, B:224:0x037b, B:225:0x037e, B:12:0x006e, B:181:0x02e6, B:184:0x02ee, B:185:0x0304), top: B:234:0x0000, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e5 A[Catch: Exception -> 0x0383, TryCatch #2 {Exception -> 0x0383, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:15:0x0085, B:17:0x0089, B:18:0x008e, B:21:0x009c, B:23:0x00a2, B:25:0x00bb, B:26:0x00cd, B:28:0x00d9, B:30:0x00e7, B:32:0x00f3, B:34:0x00f9, B:36:0x00fd, B:37:0x0100, B:39:0x0104, B:52:0x0123, B:55:0x0135, B:57:0x013b, B:59:0x015d, B:61:0x0161, B:63:0x0165, B:64:0x0168, B:67:0x016e, B:69:0x0172, B:72:0x0178, B:74:0x017e, B:76:0x0184, B:86:0x01a9, B:88:0x01ad, B:90:0x01b1, B:93:0x01b7, B:95:0x01bd, B:97:0x01c3, B:107:0x01e8, B:109:0x01ec, B:111:0x01f0, B:114:0x01f6, B:116:0x01fc, B:118:0x020e, B:132:0x0240, B:135:0x0246, B:137:0x024c, B:139:0x0252, B:140:0x0257, B:142:0x0264, B:143:0x026a, B:146:0x0270, B:148:0x0276, B:150:0x027c, B:154:0x0289, B:156:0x028d, B:158:0x0291, B:161:0x0297, B:163:0x029d, B:173:0x02c8, B:175:0x02cc, B:177:0x02d0, B:179:0x02d4, B:187:0x0321, B:189:0x0329, B:190:0x032c, B:192:0x0330, B:193:0x0333, B:195:0x0337, B:164:0x02b3, B:166:0x02b7, B:167:0x02ba, B:169:0x02be, B:170:0x02c1, B:172:0x02c5, B:151:0x0282, B:153:0x0286, B:119:0x0219, B:120:0x0224, B:122:0x0228, B:123:0x022b, B:125:0x022f, B:126:0x0232, B:128:0x0236, B:129:0x0239, B:131:0x023d, B:98:0x01d3, B:100:0x01d7, B:101:0x01da, B:103:0x01de, B:104:0x01e1, B:106:0x01e5, B:77:0x0194, B:79:0x0198, B:80:0x019b, B:82:0x019f, B:83:0x01a2, B:85:0x01a6, B:58:0x0156, B:40:0x0108, B:42:0x010c, B:43:0x010f, B:45:0x0113, B:46:0x0117, B:48:0x011b, B:49:0x011e, B:14:0x0083, B:196:0x033b, B:198:0x033f, B:200:0x0343, B:201:0x0346, B:203:0x034a, B:204:0x034d, B:206:0x0351, B:207:0x0354, B:209:0x0358, B:210:0x035b, B:212:0x035f, B:213:0x0362, B:215:0x0366, B:216:0x0369, B:218:0x036d, B:219:0x0370, B:221:0x0374, B:222:0x0377, B:224:0x037b, B:225:0x037e, B:12:0x006e, B:181:0x02e6, B:184:0x02ee, B:185:0x0304), top: B:234:0x0000, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0224 A[Catch: Exception -> 0x0383, TryCatch #2 {Exception -> 0x0383, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:15:0x0085, B:17:0x0089, B:18:0x008e, B:21:0x009c, B:23:0x00a2, B:25:0x00bb, B:26:0x00cd, B:28:0x00d9, B:30:0x00e7, B:32:0x00f3, B:34:0x00f9, B:36:0x00fd, B:37:0x0100, B:39:0x0104, B:52:0x0123, B:55:0x0135, B:57:0x013b, B:59:0x015d, B:61:0x0161, B:63:0x0165, B:64:0x0168, B:67:0x016e, B:69:0x0172, B:72:0x0178, B:74:0x017e, B:76:0x0184, B:86:0x01a9, B:88:0x01ad, B:90:0x01b1, B:93:0x01b7, B:95:0x01bd, B:97:0x01c3, B:107:0x01e8, B:109:0x01ec, B:111:0x01f0, B:114:0x01f6, B:116:0x01fc, B:118:0x020e, B:132:0x0240, B:135:0x0246, B:137:0x024c, B:139:0x0252, B:140:0x0257, B:142:0x0264, B:143:0x026a, B:146:0x0270, B:148:0x0276, B:150:0x027c, B:154:0x0289, B:156:0x028d, B:158:0x0291, B:161:0x0297, B:163:0x029d, B:173:0x02c8, B:175:0x02cc, B:177:0x02d0, B:179:0x02d4, B:187:0x0321, B:189:0x0329, B:190:0x032c, B:192:0x0330, B:193:0x0333, B:195:0x0337, B:164:0x02b3, B:166:0x02b7, B:167:0x02ba, B:169:0x02be, B:170:0x02c1, B:172:0x02c5, B:151:0x0282, B:153:0x0286, B:119:0x0219, B:120:0x0224, B:122:0x0228, B:123:0x022b, B:125:0x022f, B:126:0x0232, B:128:0x0236, B:129:0x0239, B:131:0x023d, B:98:0x01d3, B:100:0x01d7, B:101:0x01da, B:103:0x01de, B:104:0x01e1, B:106:0x01e5, B:77:0x0194, B:79:0x0198, B:80:0x019b, B:82:0x019f, B:83:0x01a2, B:85:0x01a6, B:58:0x0156, B:40:0x0108, B:42:0x010c, B:43:0x010f, B:45:0x0113, B:46:0x0117, B:48:0x011b, B:49:0x011e, B:14:0x0083, B:196:0x033b, B:198:0x033f, B:200:0x0343, B:201:0x0346, B:203:0x034a, B:204:0x034d, B:206:0x0351, B:207:0x0354, B:209:0x0358, B:210:0x035b, B:212:0x035f, B:213:0x0362, B:215:0x0366, B:216:0x0369, B:218:0x036d, B:219:0x0370, B:221:0x0374, B:222:0x0377, B:224:0x037b, B:225:0x037e, B:12:0x006e, B:181:0x02e6, B:184:0x02ee, B:185:0x0304), top: B:234:0x0000, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0228 A[Catch: Exception -> 0x0383, TryCatch #2 {Exception -> 0x0383, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:15:0x0085, B:17:0x0089, B:18:0x008e, B:21:0x009c, B:23:0x00a2, B:25:0x00bb, B:26:0x00cd, B:28:0x00d9, B:30:0x00e7, B:32:0x00f3, B:34:0x00f9, B:36:0x00fd, B:37:0x0100, B:39:0x0104, B:52:0x0123, B:55:0x0135, B:57:0x013b, B:59:0x015d, B:61:0x0161, B:63:0x0165, B:64:0x0168, B:67:0x016e, B:69:0x0172, B:72:0x0178, B:74:0x017e, B:76:0x0184, B:86:0x01a9, B:88:0x01ad, B:90:0x01b1, B:93:0x01b7, B:95:0x01bd, B:97:0x01c3, B:107:0x01e8, B:109:0x01ec, B:111:0x01f0, B:114:0x01f6, B:116:0x01fc, B:118:0x020e, B:132:0x0240, B:135:0x0246, B:137:0x024c, B:139:0x0252, B:140:0x0257, B:142:0x0264, B:143:0x026a, B:146:0x0270, B:148:0x0276, B:150:0x027c, B:154:0x0289, B:156:0x028d, B:158:0x0291, B:161:0x0297, B:163:0x029d, B:173:0x02c8, B:175:0x02cc, B:177:0x02d0, B:179:0x02d4, B:187:0x0321, B:189:0x0329, B:190:0x032c, B:192:0x0330, B:193:0x0333, B:195:0x0337, B:164:0x02b3, B:166:0x02b7, B:167:0x02ba, B:169:0x02be, B:170:0x02c1, B:172:0x02c5, B:151:0x0282, B:153:0x0286, B:119:0x0219, B:120:0x0224, B:122:0x0228, B:123:0x022b, B:125:0x022f, B:126:0x0232, B:128:0x0236, B:129:0x0239, B:131:0x023d, B:98:0x01d3, B:100:0x01d7, B:101:0x01da, B:103:0x01de, B:104:0x01e1, B:106:0x01e5, B:77:0x0194, B:79:0x0198, B:80:0x019b, B:82:0x019f, B:83:0x01a2, B:85:0x01a6, B:58:0x0156, B:40:0x0108, B:42:0x010c, B:43:0x010f, B:45:0x0113, B:46:0x0117, B:48:0x011b, B:49:0x011e, B:14:0x0083, B:196:0x033b, B:198:0x033f, B:200:0x0343, B:201:0x0346, B:203:0x034a, B:204:0x034d, B:206:0x0351, B:207:0x0354, B:209:0x0358, B:210:0x035b, B:212:0x035f, B:213:0x0362, B:215:0x0366, B:216:0x0369, B:218:0x036d, B:219:0x0370, B:221:0x0374, B:222:0x0377, B:224:0x037b, B:225:0x037e, B:12:0x006e, B:181:0x02e6, B:184:0x02ee, B:185:0x0304), top: B:234:0x0000, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022f A[Catch: Exception -> 0x0383, TryCatch #2 {Exception -> 0x0383, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:15:0x0085, B:17:0x0089, B:18:0x008e, B:21:0x009c, B:23:0x00a2, B:25:0x00bb, B:26:0x00cd, B:28:0x00d9, B:30:0x00e7, B:32:0x00f3, B:34:0x00f9, B:36:0x00fd, B:37:0x0100, B:39:0x0104, B:52:0x0123, B:55:0x0135, B:57:0x013b, B:59:0x015d, B:61:0x0161, B:63:0x0165, B:64:0x0168, B:67:0x016e, B:69:0x0172, B:72:0x0178, B:74:0x017e, B:76:0x0184, B:86:0x01a9, B:88:0x01ad, B:90:0x01b1, B:93:0x01b7, B:95:0x01bd, B:97:0x01c3, B:107:0x01e8, B:109:0x01ec, B:111:0x01f0, B:114:0x01f6, B:116:0x01fc, B:118:0x020e, B:132:0x0240, B:135:0x0246, B:137:0x024c, B:139:0x0252, B:140:0x0257, B:142:0x0264, B:143:0x026a, B:146:0x0270, B:148:0x0276, B:150:0x027c, B:154:0x0289, B:156:0x028d, B:158:0x0291, B:161:0x0297, B:163:0x029d, B:173:0x02c8, B:175:0x02cc, B:177:0x02d0, B:179:0x02d4, B:187:0x0321, B:189:0x0329, B:190:0x032c, B:192:0x0330, B:193:0x0333, B:195:0x0337, B:164:0x02b3, B:166:0x02b7, B:167:0x02ba, B:169:0x02be, B:170:0x02c1, B:172:0x02c5, B:151:0x0282, B:153:0x0286, B:119:0x0219, B:120:0x0224, B:122:0x0228, B:123:0x022b, B:125:0x022f, B:126:0x0232, B:128:0x0236, B:129:0x0239, B:131:0x023d, B:98:0x01d3, B:100:0x01d7, B:101:0x01da, B:103:0x01de, B:104:0x01e1, B:106:0x01e5, B:77:0x0194, B:79:0x0198, B:80:0x019b, B:82:0x019f, B:83:0x01a2, B:85:0x01a6, B:58:0x0156, B:40:0x0108, B:42:0x010c, B:43:0x010f, B:45:0x0113, B:46:0x0117, B:48:0x011b, B:49:0x011e, B:14:0x0083, B:196:0x033b, B:198:0x033f, B:200:0x0343, B:201:0x0346, B:203:0x034a, B:204:0x034d, B:206:0x0351, B:207:0x0354, B:209:0x0358, B:210:0x035b, B:212:0x035f, B:213:0x0362, B:215:0x0366, B:216:0x0369, B:218:0x036d, B:219:0x0370, B:221:0x0374, B:222:0x0377, B:224:0x037b, B:225:0x037e, B:12:0x006e, B:181:0x02e6, B:184:0x02ee, B:185:0x0304), top: B:234:0x0000, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0236 A[Catch: Exception -> 0x0383, TryCatch #2 {Exception -> 0x0383, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:15:0x0085, B:17:0x0089, B:18:0x008e, B:21:0x009c, B:23:0x00a2, B:25:0x00bb, B:26:0x00cd, B:28:0x00d9, B:30:0x00e7, B:32:0x00f3, B:34:0x00f9, B:36:0x00fd, B:37:0x0100, B:39:0x0104, B:52:0x0123, B:55:0x0135, B:57:0x013b, B:59:0x015d, B:61:0x0161, B:63:0x0165, B:64:0x0168, B:67:0x016e, B:69:0x0172, B:72:0x0178, B:74:0x017e, B:76:0x0184, B:86:0x01a9, B:88:0x01ad, B:90:0x01b1, B:93:0x01b7, B:95:0x01bd, B:97:0x01c3, B:107:0x01e8, B:109:0x01ec, B:111:0x01f0, B:114:0x01f6, B:116:0x01fc, B:118:0x020e, B:132:0x0240, B:135:0x0246, B:137:0x024c, B:139:0x0252, B:140:0x0257, B:142:0x0264, B:143:0x026a, B:146:0x0270, B:148:0x0276, B:150:0x027c, B:154:0x0289, B:156:0x028d, B:158:0x0291, B:161:0x0297, B:163:0x029d, B:173:0x02c8, B:175:0x02cc, B:177:0x02d0, B:179:0x02d4, B:187:0x0321, B:189:0x0329, B:190:0x032c, B:192:0x0330, B:193:0x0333, B:195:0x0337, B:164:0x02b3, B:166:0x02b7, B:167:0x02ba, B:169:0x02be, B:170:0x02c1, B:172:0x02c5, B:151:0x0282, B:153:0x0286, B:119:0x0219, B:120:0x0224, B:122:0x0228, B:123:0x022b, B:125:0x022f, B:126:0x0232, B:128:0x0236, B:129:0x0239, B:131:0x023d, B:98:0x01d3, B:100:0x01d7, B:101:0x01da, B:103:0x01de, B:104:0x01e1, B:106:0x01e5, B:77:0x0194, B:79:0x0198, B:80:0x019b, B:82:0x019f, B:83:0x01a2, B:85:0x01a6, B:58:0x0156, B:40:0x0108, B:42:0x010c, B:43:0x010f, B:45:0x0113, B:46:0x0117, B:48:0x011b, B:49:0x011e, B:14:0x0083, B:196:0x033b, B:198:0x033f, B:200:0x0343, B:201:0x0346, B:203:0x034a, B:204:0x034d, B:206:0x0351, B:207:0x0354, B:209:0x0358, B:210:0x035b, B:212:0x035f, B:213:0x0362, B:215:0x0366, B:216:0x0369, B:218:0x036d, B:219:0x0370, B:221:0x0374, B:222:0x0377, B:224:0x037b, B:225:0x037e, B:12:0x006e, B:181:0x02e6, B:184:0x02ee, B:185:0x0304), top: B:234:0x0000, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x023d A[Catch: Exception -> 0x0383, TryCatch #2 {Exception -> 0x0383, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:15:0x0085, B:17:0x0089, B:18:0x008e, B:21:0x009c, B:23:0x00a2, B:25:0x00bb, B:26:0x00cd, B:28:0x00d9, B:30:0x00e7, B:32:0x00f3, B:34:0x00f9, B:36:0x00fd, B:37:0x0100, B:39:0x0104, B:52:0x0123, B:55:0x0135, B:57:0x013b, B:59:0x015d, B:61:0x0161, B:63:0x0165, B:64:0x0168, B:67:0x016e, B:69:0x0172, B:72:0x0178, B:74:0x017e, B:76:0x0184, B:86:0x01a9, B:88:0x01ad, B:90:0x01b1, B:93:0x01b7, B:95:0x01bd, B:97:0x01c3, B:107:0x01e8, B:109:0x01ec, B:111:0x01f0, B:114:0x01f6, B:116:0x01fc, B:118:0x020e, B:132:0x0240, B:135:0x0246, B:137:0x024c, B:139:0x0252, B:140:0x0257, B:142:0x0264, B:143:0x026a, B:146:0x0270, B:148:0x0276, B:150:0x027c, B:154:0x0289, B:156:0x028d, B:158:0x0291, B:161:0x0297, B:163:0x029d, B:173:0x02c8, B:175:0x02cc, B:177:0x02d0, B:179:0x02d4, B:187:0x0321, B:189:0x0329, B:190:0x032c, B:192:0x0330, B:193:0x0333, B:195:0x0337, B:164:0x02b3, B:166:0x02b7, B:167:0x02ba, B:169:0x02be, B:170:0x02c1, B:172:0x02c5, B:151:0x0282, B:153:0x0286, B:119:0x0219, B:120:0x0224, B:122:0x0228, B:123:0x022b, B:125:0x022f, B:126:0x0232, B:128:0x0236, B:129:0x0239, B:131:0x023d, B:98:0x01d3, B:100:0x01d7, B:101:0x01da, B:103:0x01de, B:104:0x01e1, B:106:0x01e5, B:77:0x0194, B:79:0x0198, B:80:0x019b, B:82:0x019f, B:83:0x01a2, B:85:0x01a6, B:58:0x0156, B:40:0x0108, B:42:0x010c, B:43:0x010f, B:45:0x0113, B:46:0x0117, B:48:0x011b, B:49:0x011e, B:14:0x0083, B:196:0x033b, B:198:0x033f, B:200:0x0343, B:201:0x0346, B:203:0x034a, B:204:0x034d, B:206:0x0351, B:207:0x0354, B:209:0x0358, B:210:0x035b, B:212:0x035f, B:213:0x0362, B:215:0x0366, B:216:0x0369, B:218:0x036d, B:219:0x0370, B:221:0x0374, B:222:0x0377, B:224:0x037b, B:225:0x037e, B:12:0x006e, B:181:0x02e6, B:184:0x02ee, B:185:0x0304), top: B:234:0x0000, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0282 A[Catch: Exception -> 0x0383, TryCatch #2 {Exception -> 0x0383, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:15:0x0085, B:17:0x0089, B:18:0x008e, B:21:0x009c, B:23:0x00a2, B:25:0x00bb, B:26:0x00cd, B:28:0x00d9, B:30:0x00e7, B:32:0x00f3, B:34:0x00f9, B:36:0x00fd, B:37:0x0100, B:39:0x0104, B:52:0x0123, B:55:0x0135, B:57:0x013b, B:59:0x015d, B:61:0x0161, B:63:0x0165, B:64:0x0168, B:67:0x016e, B:69:0x0172, B:72:0x0178, B:74:0x017e, B:76:0x0184, B:86:0x01a9, B:88:0x01ad, B:90:0x01b1, B:93:0x01b7, B:95:0x01bd, B:97:0x01c3, B:107:0x01e8, B:109:0x01ec, B:111:0x01f0, B:114:0x01f6, B:116:0x01fc, B:118:0x020e, B:132:0x0240, B:135:0x0246, B:137:0x024c, B:139:0x0252, B:140:0x0257, B:142:0x0264, B:143:0x026a, B:146:0x0270, B:148:0x0276, B:150:0x027c, B:154:0x0289, B:156:0x028d, B:158:0x0291, B:161:0x0297, B:163:0x029d, B:173:0x02c8, B:175:0x02cc, B:177:0x02d0, B:179:0x02d4, B:187:0x0321, B:189:0x0329, B:190:0x032c, B:192:0x0330, B:193:0x0333, B:195:0x0337, B:164:0x02b3, B:166:0x02b7, B:167:0x02ba, B:169:0x02be, B:170:0x02c1, B:172:0x02c5, B:151:0x0282, B:153:0x0286, B:119:0x0219, B:120:0x0224, B:122:0x0228, B:123:0x022b, B:125:0x022f, B:126:0x0232, B:128:0x0236, B:129:0x0239, B:131:0x023d, B:98:0x01d3, B:100:0x01d7, B:101:0x01da, B:103:0x01de, B:104:0x01e1, B:106:0x01e5, B:77:0x0194, B:79:0x0198, B:80:0x019b, B:82:0x019f, B:83:0x01a2, B:85:0x01a6, B:58:0x0156, B:40:0x0108, B:42:0x010c, B:43:0x010f, B:45:0x0113, B:46:0x0117, B:48:0x011b, B:49:0x011e, B:14:0x0083, B:196:0x033b, B:198:0x033f, B:200:0x0343, B:201:0x0346, B:203:0x034a, B:204:0x034d, B:206:0x0351, B:207:0x0354, B:209:0x0358, B:210:0x035b, B:212:0x035f, B:213:0x0362, B:215:0x0366, B:216:0x0369, B:218:0x036d, B:219:0x0370, B:221:0x0374, B:222:0x0377, B:224:0x037b, B:225:0x037e, B:12:0x006e, B:181:0x02e6, B:184:0x02ee, B:185:0x0304), top: B:234:0x0000, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0286 A[Catch: Exception -> 0x0383, TryCatch #2 {Exception -> 0x0383, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:15:0x0085, B:17:0x0089, B:18:0x008e, B:21:0x009c, B:23:0x00a2, B:25:0x00bb, B:26:0x00cd, B:28:0x00d9, B:30:0x00e7, B:32:0x00f3, B:34:0x00f9, B:36:0x00fd, B:37:0x0100, B:39:0x0104, B:52:0x0123, B:55:0x0135, B:57:0x013b, B:59:0x015d, B:61:0x0161, B:63:0x0165, B:64:0x0168, B:67:0x016e, B:69:0x0172, B:72:0x0178, B:74:0x017e, B:76:0x0184, B:86:0x01a9, B:88:0x01ad, B:90:0x01b1, B:93:0x01b7, B:95:0x01bd, B:97:0x01c3, B:107:0x01e8, B:109:0x01ec, B:111:0x01f0, B:114:0x01f6, B:116:0x01fc, B:118:0x020e, B:132:0x0240, B:135:0x0246, B:137:0x024c, B:139:0x0252, B:140:0x0257, B:142:0x0264, B:143:0x026a, B:146:0x0270, B:148:0x0276, B:150:0x027c, B:154:0x0289, B:156:0x028d, B:158:0x0291, B:161:0x0297, B:163:0x029d, B:173:0x02c8, B:175:0x02cc, B:177:0x02d0, B:179:0x02d4, B:187:0x0321, B:189:0x0329, B:190:0x032c, B:192:0x0330, B:193:0x0333, B:195:0x0337, B:164:0x02b3, B:166:0x02b7, B:167:0x02ba, B:169:0x02be, B:170:0x02c1, B:172:0x02c5, B:151:0x0282, B:153:0x0286, B:119:0x0219, B:120:0x0224, B:122:0x0228, B:123:0x022b, B:125:0x022f, B:126:0x0232, B:128:0x0236, B:129:0x0239, B:131:0x023d, B:98:0x01d3, B:100:0x01d7, B:101:0x01da, B:103:0x01de, B:104:0x01e1, B:106:0x01e5, B:77:0x0194, B:79:0x0198, B:80:0x019b, B:82:0x019f, B:83:0x01a2, B:85:0x01a6, B:58:0x0156, B:40:0x0108, B:42:0x010c, B:43:0x010f, B:45:0x0113, B:46:0x0117, B:48:0x011b, B:49:0x011e, B:14:0x0083, B:196:0x033b, B:198:0x033f, B:200:0x0343, B:201:0x0346, B:203:0x034a, B:204:0x034d, B:206:0x0351, B:207:0x0354, B:209:0x0358, B:210:0x035b, B:212:0x035f, B:213:0x0362, B:215:0x0366, B:216:0x0369, B:218:0x036d, B:219:0x0370, B:221:0x0374, B:222:0x0377, B:224:0x037b, B:225:0x037e, B:12:0x006e, B:181:0x02e6, B:184:0x02ee, B:185:0x0304), top: B:234:0x0000, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02b3 A[Catch: Exception -> 0x0383, TryCatch #2 {Exception -> 0x0383, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:15:0x0085, B:17:0x0089, B:18:0x008e, B:21:0x009c, B:23:0x00a2, B:25:0x00bb, B:26:0x00cd, B:28:0x00d9, B:30:0x00e7, B:32:0x00f3, B:34:0x00f9, B:36:0x00fd, B:37:0x0100, B:39:0x0104, B:52:0x0123, B:55:0x0135, B:57:0x013b, B:59:0x015d, B:61:0x0161, B:63:0x0165, B:64:0x0168, B:67:0x016e, B:69:0x0172, B:72:0x0178, B:74:0x017e, B:76:0x0184, B:86:0x01a9, B:88:0x01ad, B:90:0x01b1, B:93:0x01b7, B:95:0x01bd, B:97:0x01c3, B:107:0x01e8, B:109:0x01ec, B:111:0x01f0, B:114:0x01f6, B:116:0x01fc, B:118:0x020e, B:132:0x0240, B:135:0x0246, B:137:0x024c, B:139:0x0252, B:140:0x0257, B:142:0x0264, B:143:0x026a, B:146:0x0270, B:148:0x0276, B:150:0x027c, B:154:0x0289, B:156:0x028d, B:158:0x0291, B:161:0x0297, B:163:0x029d, B:173:0x02c8, B:175:0x02cc, B:177:0x02d0, B:179:0x02d4, B:187:0x0321, B:189:0x0329, B:190:0x032c, B:192:0x0330, B:193:0x0333, B:195:0x0337, B:164:0x02b3, B:166:0x02b7, B:167:0x02ba, B:169:0x02be, B:170:0x02c1, B:172:0x02c5, B:151:0x0282, B:153:0x0286, B:119:0x0219, B:120:0x0224, B:122:0x0228, B:123:0x022b, B:125:0x022f, B:126:0x0232, B:128:0x0236, B:129:0x0239, B:131:0x023d, B:98:0x01d3, B:100:0x01d7, B:101:0x01da, B:103:0x01de, B:104:0x01e1, B:106:0x01e5, B:77:0x0194, B:79:0x0198, B:80:0x019b, B:82:0x019f, B:83:0x01a2, B:85:0x01a6, B:58:0x0156, B:40:0x0108, B:42:0x010c, B:43:0x010f, B:45:0x0113, B:46:0x0117, B:48:0x011b, B:49:0x011e, B:14:0x0083, B:196:0x033b, B:198:0x033f, B:200:0x0343, B:201:0x0346, B:203:0x034a, B:204:0x034d, B:206:0x0351, B:207:0x0354, B:209:0x0358, B:210:0x035b, B:212:0x035f, B:213:0x0362, B:215:0x0366, B:216:0x0369, B:218:0x036d, B:219:0x0370, B:221:0x0374, B:222:0x0377, B:224:0x037b, B:225:0x037e, B:12:0x006e, B:181:0x02e6, B:184:0x02ee, B:185:0x0304), top: B:234:0x0000, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02b7 A[Catch: Exception -> 0x0383, TryCatch #2 {Exception -> 0x0383, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:15:0x0085, B:17:0x0089, B:18:0x008e, B:21:0x009c, B:23:0x00a2, B:25:0x00bb, B:26:0x00cd, B:28:0x00d9, B:30:0x00e7, B:32:0x00f3, B:34:0x00f9, B:36:0x00fd, B:37:0x0100, B:39:0x0104, B:52:0x0123, B:55:0x0135, B:57:0x013b, B:59:0x015d, B:61:0x0161, B:63:0x0165, B:64:0x0168, B:67:0x016e, B:69:0x0172, B:72:0x0178, B:74:0x017e, B:76:0x0184, B:86:0x01a9, B:88:0x01ad, B:90:0x01b1, B:93:0x01b7, B:95:0x01bd, B:97:0x01c3, B:107:0x01e8, B:109:0x01ec, B:111:0x01f0, B:114:0x01f6, B:116:0x01fc, B:118:0x020e, B:132:0x0240, B:135:0x0246, B:137:0x024c, B:139:0x0252, B:140:0x0257, B:142:0x0264, B:143:0x026a, B:146:0x0270, B:148:0x0276, B:150:0x027c, B:154:0x0289, B:156:0x028d, B:158:0x0291, B:161:0x0297, B:163:0x029d, B:173:0x02c8, B:175:0x02cc, B:177:0x02d0, B:179:0x02d4, B:187:0x0321, B:189:0x0329, B:190:0x032c, B:192:0x0330, B:193:0x0333, B:195:0x0337, B:164:0x02b3, B:166:0x02b7, B:167:0x02ba, B:169:0x02be, B:170:0x02c1, B:172:0x02c5, B:151:0x0282, B:153:0x0286, B:119:0x0219, B:120:0x0224, B:122:0x0228, B:123:0x022b, B:125:0x022f, B:126:0x0232, B:128:0x0236, B:129:0x0239, B:131:0x023d, B:98:0x01d3, B:100:0x01d7, B:101:0x01da, B:103:0x01de, B:104:0x01e1, B:106:0x01e5, B:77:0x0194, B:79:0x0198, B:80:0x019b, B:82:0x019f, B:83:0x01a2, B:85:0x01a6, B:58:0x0156, B:40:0x0108, B:42:0x010c, B:43:0x010f, B:45:0x0113, B:46:0x0117, B:48:0x011b, B:49:0x011e, B:14:0x0083, B:196:0x033b, B:198:0x033f, B:200:0x0343, B:201:0x0346, B:203:0x034a, B:204:0x034d, B:206:0x0351, B:207:0x0354, B:209:0x0358, B:210:0x035b, B:212:0x035f, B:213:0x0362, B:215:0x0366, B:216:0x0369, B:218:0x036d, B:219:0x0370, B:221:0x0374, B:222:0x0377, B:224:0x037b, B:225:0x037e, B:12:0x006e, B:181:0x02e6, B:184:0x02ee, B:185:0x0304), top: B:234:0x0000, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02be A[Catch: Exception -> 0x0383, TryCatch #2 {Exception -> 0x0383, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:15:0x0085, B:17:0x0089, B:18:0x008e, B:21:0x009c, B:23:0x00a2, B:25:0x00bb, B:26:0x00cd, B:28:0x00d9, B:30:0x00e7, B:32:0x00f3, B:34:0x00f9, B:36:0x00fd, B:37:0x0100, B:39:0x0104, B:52:0x0123, B:55:0x0135, B:57:0x013b, B:59:0x015d, B:61:0x0161, B:63:0x0165, B:64:0x0168, B:67:0x016e, B:69:0x0172, B:72:0x0178, B:74:0x017e, B:76:0x0184, B:86:0x01a9, B:88:0x01ad, B:90:0x01b1, B:93:0x01b7, B:95:0x01bd, B:97:0x01c3, B:107:0x01e8, B:109:0x01ec, B:111:0x01f0, B:114:0x01f6, B:116:0x01fc, B:118:0x020e, B:132:0x0240, B:135:0x0246, B:137:0x024c, B:139:0x0252, B:140:0x0257, B:142:0x0264, B:143:0x026a, B:146:0x0270, B:148:0x0276, B:150:0x027c, B:154:0x0289, B:156:0x028d, B:158:0x0291, B:161:0x0297, B:163:0x029d, B:173:0x02c8, B:175:0x02cc, B:177:0x02d0, B:179:0x02d4, B:187:0x0321, B:189:0x0329, B:190:0x032c, B:192:0x0330, B:193:0x0333, B:195:0x0337, B:164:0x02b3, B:166:0x02b7, B:167:0x02ba, B:169:0x02be, B:170:0x02c1, B:172:0x02c5, B:151:0x0282, B:153:0x0286, B:119:0x0219, B:120:0x0224, B:122:0x0228, B:123:0x022b, B:125:0x022f, B:126:0x0232, B:128:0x0236, B:129:0x0239, B:131:0x023d, B:98:0x01d3, B:100:0x01d7, B:101:0x01da, B:103:0x01de, B:104:0x01e1, B:106:0x01e5, B:77:0x0194, B:79:0x0198, B:80:0x019b, B:82:0x019f, B:83:0x01a2, B:85:0x01a6, B:58:0x0156, B:40:0x0108, B:42:0x010c, B:43:0x010f, B:45:0x0113, B:46:0x0117, B:48:0x011b, B:49:0x011e, B:14:0x0083, B:196:0x033b, B:198:0x033f, B:200:0x0343, B:201:0x0346, B:203:0x034a, B:204:0x034d, B:206:0x0351, B:207:0x0354, B:209:0x0358, B:210:0x035b, B:212:0x035f, B:213:0x0362, B:215:0x0366, B:216:0x0369, B:218:0x036d, B:219:0x0370, B:221:0x0374, B:222:0x0377, B:224:0x037b, B:225:0x037e, B:12:0x006e, B:181:0x02e6, B:184:0x02ee, B:185:0x0304), top: B:234:0x0000, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02c5 A[Catch: Exception -> 0x0383, TryCatch #2 {Exception -> 0x0383, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:15:0x0085, B:17:0x0089, B:18:0x008e, B:21:0x009c, B:23:0x00a2, B:25:0x00bb, B:26:0x00cd, B:28:0x00d9, B:30:0x00e7, B:32:0x00f3, B:34:0x00f9, B:36:0x00fd, B:37:0x0100, B:39:0x0104, B:52:0x0123, B:55:0x0135, B:57:0x013b, B:59:0x015d, B:61:0x0161, B:63:0x0165, B:64:0x0168, B:67:0x016e, B:69:0x0172, B:72:0x0178, B:74:0x017e, B:76:0x0184, B:86:0x01a9, B:88:0x01ad, B:90:0x01b1, B:93:0x01b7, B:95:0x01bd, B:97:0x01c3, B:107:0x01e8, B:109:0x01ec, B:111:0x01f0, B:114:0x01f6, B:116:0x01fc, B:118:0x020e, B:132:0x0240, B:135:0x0246, B:137:0x024c, B:139:0x0252, B:140:0x0257, B:142:0x0264, B:143:0x026a, B:146:0x0270, B:148:0x0276, B:150:0x027c, B:154:0x0289, B:156:0x028d, B:158:0x0291, B:161:0x0297, B:163:0x029d, B:173:0x02c8, B:175:0x02cc, B:177:0x02d0, B:179:0x02d4, B:187:0x0321, B:189:0x0329, B:190:0x032c, B:192:0x0330, B:193:0x0333, B:195:0x0337, B:164:0x02b3, B:166:0x02b7, B:167:0x02ba, B:169:0x02be, B:170:0x02c1, B:172:0x02c5, B:151:0x0282, B:153:0x0286, B:119:0x0219, B:120:0x0224, B:122:0x0228, B:123:0x022b, B:125:0x022f, B:126:0x0232, B:128:0x0236, B:129:0x0239, B:131:0x023d, B:98:0x01d3, B:100:0x01d7, B:101:0x01da, B:103:0x01de, B:104:0x01e1, B:106:0x01e5, B:77:0x0194, B:79:0x0198, B:80:0x019b, B:82:0x019f, B:83:0x01a2, B:85:0x01a6, B:58:0x0156, B:40:0x0108, B:42:0x010c, B:43:0x010f, B:45:0x0113, B:46:0x0117, B:48:0x011b, B:49:0x011e, B:14:0x0083, B:196:0x033b, B:198:0x033f, B:200:0x0343, B:201:0x0346, B:203:0x034a, B:204:0x034d, B:206:0x0351, B:207:0x0354, B:209:0x0358, B:210:0x035b, B:212:0x035f, B:213:0x0362, B:215:0x0366, B:216:0x0369, B:218:0x036d, B:219:0x0370, B:221:0x0374, B:222:0x0377, B:224:0x037b, B:225:0x037e, B:12:0x006e, B:181:0x02e6, B:184:0x02ee, B:185:0x0304), top: B:234:0x0000, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0329 A[Catch: Exception -> 0x0383, TryCatch #2 {Exception -> 0x0383, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:15:0x0085, B:17:0x0089, B:18:0x008e, B:21:0x009c, B:23:0x00a2, B:25:0x00bb, B:26:0x00cd, B:28:0x00d9, B:30:0x00e7, B:32:0x00f3, B:34:0x00f9, B:36:0x00fd, B:37:0x0100, B:39:0x0104, B:52:0x0123, B:55:0x0135, B:57:0x013b, B:59:0x015d, B:61:0x0161, B:63:0x0165, B:64:0x0168, B:67:0x016e, B:69:0x0172, B:72:0x0178, B:74:0x017e, B:76:0x0184, B:86:0x01a9, B:88:0x01ad, B:90:0x01b1, B:93:0x01b7, B:95:0x01bd, B:97:0x01c3, B:107:0x01e8, B:109:0x01ec, B:111:0x01f0, B:114:0x01f6, B:116:0x01fc, B:118:0x020e, B:132:0x0240, B:135:0x0246, B:137:0x024c, B:139:0x0252, B:140:0x0257, B:142:0x0264, B:143:0x026a, B:146:0x0270, B:148:0x0276, B:150:0x027c, B:154:0x0289, B:156:0x028d, B:158:0x0291, B:161:0x0297, B:163:0x029d, B:173:0x02c8, B:175:0x02cc, B:177:0x02d0, B:179:0x02d4, B:187:0x0321, B:189:0x0329, B:190:0x032c, B:192:0x0330, B:193:0x0333, B:195:0x0337, B:164:0x02b3, B:166:0x02b7, B:167:0x02ba, B:169:0x02be, B:170:0x02c1, B:172:0x02c5, B:151:0x0282, B:153:0x0286, B:119:0x0219, B:120:0x0224, B:122:0x0228, B:123:0x022b, B:125:0x022f, B:126:0x0232, B:128:0x0236, B:129:0x0239, B:131:0x023d, B:98:0x01d3, B:100:0x01d7, B:101:0x01da, B:103:0x01de, B:104:0x01e1, B:106:0x01e5, B:77:0x0194, B:79:0x0198, B:80:0x019b, B:82:0x019f, B:83:0x01a2, B:85:0x01a6, B:58:0x0156, B:40:0x0108, B:42:0x010c, B:43:0x010f, B:45:0x0113, B:46:0x0117, B:48:0x011b, B:49:0x011e, B:14:0x0083, B:196:0x033b, B:198:0x033f, B:200:0x0343, B:201:0x0346, B:203:0x034a, B:204:0x034d, B:206:0x0351, B:207:0x0354, B:209:0x0358, B:210:0x035b, B:212:0x035f, B:213:0x0362, B:215:0x0366, B:216:0x0369, B:218:0x036d, B:219:0x0370, B:221:0x0374, B:222:0x0377, B:224:0x037b, B:225:0x037e, B:12:0x006e, B:181:0x02e6, B:184:0x02ee, B:185:0x0304), top: B:234:0x0000, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0330 A[Catch: Exception -> 0x0383, TryCatch #2 {Exception -> 0x0383, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:15:0x0085, B:17:0x0089, B:18:0x008e, B:21:0x009c, B:23:0x00a2, B:25:0x00bb, B:26:0x00cd, B:28:0x00d9, B:30:0x00e7, B:32:0x00f3, B:34:0x00f9, B:36:0x00fd, B:37:0x0100, B:39:0x0104, B:52:0x0123, B:55:0x0135, B:57:0x013b, B:59:0x015d, B:61:0x0161, B:63:0x0165, B:64:0x0168, B:67:0x016e, B:69:0x0172, B:72:0x0178, B:74:0x017e, B:76:0x0184, B:86:0x01a9, B:88:0x01ad, B:90:0x01b1, B:93:0x01b7, B:95:0x01bd, B:97:0x01c3, B:107:0x01e8, B:109:0x01ec, B:111:0x01f0, B:114:0x01f6, B:116:0x01fc, B:118:0x020e, B:132:0x0240, B:135:0x0246, B:137:0x024c, B:139:0x0252, B:140:0x0257, B:142:0x0264, B:143:0x026a, B:146:0x0270, B:148:0x0276, B:150:0x027c, B:154:0x0289, B:156:0x028d, B:158:0x0291, B:161:0x0297, B:163:0x029d, B:173:0x02c8, B:175:0x02cc, B:177:0x02d0, B:179:0x02d4, B:187:0x0321, B:189:0x0329, B:190:0x032c, B:192:0x0330, B:193:0x0333, B:195:0x0337, B:164:0x02b3, B:166:0x02b7, B:167:0x02ba, B:169:0x02be, B:170:0x02c1, B:172:0x02c5, B:151:0x0282, B:153:0x0286, B:119:0x0219, B:120:0x0224, B:122:0x0228, B:123:0x022b, B:125:0x022f, B:126:0x0232, B:128:0x0236, B:129:0x0239, B:131:0x023d, B:98:0x01d3, B:100:0x01d7, B:101:0x01da, B:103:0x01de, B:104:0x01e1, B:106:0x01e5, B:77:0x0194, B:79:0x0198, B:80:0x019b, B:82:0x019f, B:83:0x01a2, B:85:0x01a6, B:58:0x0156, B:40:0x0108, B:42:0x010c, B:43:0x010f, B:45:0x0113, B:46:0x0117, B:48:0x011b, B:49:0x011e, B:14:0x0083, B:196:0x033b, B:198:0x033f, B:200:0x0343, B:201:0x0346, B:203:0x034a, B:204:0x034d, B:206:0x0351, B:207:0x0354, B:209:0x0358, B:210:0x035b, B:212:0x035f, B:213:0x0362, B:215:0x0366, B:216:0x0369, B:218:0x036d, B:219:0x0370, B:221:0x0374, B:222:0x0377, B:224:0x037b, B:225:0x037e, B:12:0x006e, B:181:0x02e6, B:184:0x02ee, B:185:0x0304), top: B:234:0x0000, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:239:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0156 A[Catch: Exception -> 0x0383, TryCatch #2 {Exception -> 0x0383, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:15:0x0085, B:17:0x0089, B:18:0x008e, B:21:0x009c, B:23:0x00a2, B:25:0x00bb, B:26:0x00cd, B:28:0x00d9, B:30:0x00e7, B:32:0x00f3, B:34:0x00f9, B:36:0x00fd, B:37:0x0100, B:39:0x0104, B:52:0x0123, B:55:0x0135, B:57:0x013b, B:59:0x015d, B:61:0x0161, B:63:0x0165, B:64:0x0168, B:67:0x016e, B:69:0x0172, B:72:0x0178, B:74:0x017e, B:76:0x0184, B:86:0x01a9, B:88:0x01ad, B:90:0x01b1, B:93:0x01b7, B:95:0x01bd, B:97:0x01c3, B:107:0x01e8, B:109:0x01ec, B:111:0x01f0, B:114:0x01f6, B:116:0x01fc, B:118:0x020e, B:132:0x0240, B:135:0x0246, B:137:0x024c, B:139:0x0252, B:140:0x0257, B:142:0x0264, B:143:0x026a, B:146:0x0270, B:148:0x0276, B:150:0x027c, B:154:0x0289, B:156:0x028d, B:158:0x0291, B:161:0x0297, B:163:0x029d, B:173:0x02c8, B:175:0x02cc, B:177:0x02d0, B:179:0x02d4, B:187:0x0321, B:189:0x0329, B:190:0x032c, B:192:0x0330, B:193:0x0333, B:195:0x0337, B:164:0x02b3, B:166:0x02b7, B:167:0x02ba, B:169:0x02be, B:170:0x02c1, B:172:0x02c5, B:151:0x0282, B:153:0x0286, B:119:0x0219, B:120:0x0224, B:122:0x0228, B:123:0x022b, B:125:0x022f, B:126:0x0232, B:128:0x0236, B:129:0x0239, B:131:0x023d, B:98:0x01d3, B:100:0x01d7, B:101:0x01da, B:103:0x01de, B:104:0x01e1, B:106:0x01e5, B:77:0x0194, B:79:0x0198, B:80:0x019b, B:82:0x019f, B:83:0x01a2, B:85:0x01a6, B:58:0x0156, B:40:0x0108, B:42:0x010c, B:43:0x010f, B:45:0x0113, B:46:0x0117, B:48:0x011b, B:49:0x011e, B:14:0x0083, B:196:0x033b, B:198:0x033f, B:200:0x0343, B:201:0x0346, B:203:0x034a, B:204:0x034d, B:206:0x0351, B:207:0x0354, B:209:0x0358, B:210:0x035b, B:212:0x035f, B:213:0x0362, B:215:0x0366, B:216:0x0369, B:218:0x036d, B:219:0x0370, B:221:0x0374, B:222:0x0377, B:224:0x037b, B:225:0x037e, B:12:0x006e, B:181:0x02e6, B:184:0x02ee, B:185:0x0304), top: B:234:0x0000, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0194 A[Catch: Exception -> 0x0383, TryCatch #2 {Exception -> 0x0383, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:15:0x0085, B:17:0x0089, B:18:0x008e, B:21:0x009c, B:23:0x00a2, B:25:0x00bb, B:26:0x00cd, B:28:0x00d9, B:30:0x00e7, B:32:0x00f3, B:34:0x00f9, B:36:0x00fd, B:37:0x0100, B:39:0x0104, B:52:0x0123, B:55:0x0135, B:57:0x013b, B:59:0x015d, B:61:0x0161, B:63:0x0165, B:64:0x0168, B:67:0x016e, B:69:0x0172, B:72:0x0178, B:74:0x017e, B:76:0x0184, B:86:0x01a9, B:88:0x01ad, B:90:0x01b1, B:93:0x01b7, B:95:0x01bd, B:97:0x01c3, B:107:0x01e8, B:109:0x01ec, B:111:0x01f0, B:114:0x01f6, B:116:0x01fc, B:118:0x020e, B:132:0x0240, B:135:0x0246, B:137:0x024c, B:139:0x0252, B:140:0x0257, B:142:0x0264, B:143:0x026a, B:146:0x0270, B:148:0x0276, B:150:0x027c, B:154:0x0289, B:156:0x028d, B:158:0x0291, B:161:0x0297, B:163:0x029d, B:173:0x02c8, B:175:0x02cc, B:177:0x02d0, B:179:0x02d4, B:187:0x0321, B:189:0x0329, B:190:0x032c, B:192:0x0330, B:193:0x0333, B:195:0x0337, B:164:0x02b3, B:166:0x02b7, B:167:0x02ba, B:169:0x02be, B:170:0x02c1, B:172:0x02c5, B:151:0x0282, B:153:0x0286, B:119:0x0219, B:120:0x0224, B:122:0x0228, B:123:0x022b, B:125:0x022f, B:126:0x0232, B:128:0x0236, B:129:0x0239, B:131:0x023d, B:98:0x01d3, B:100:0x01d7, B:101:0x01da, B:103:0x01de, B:104:0x01e1, B:106:0x01e5, B:77:0x0194, B:79:0x0198, B:80:0x019b, B:82:0x019f, B:83:0x01a2, B:85:0x01a6, B:58:0x0156, B:40:0x0108, B:42:0x010c, B:43:0x010f, B:45:0x0113, B:46:0x0117, B:48:0x011b, B:49:0x011e, B:14:0x0083, B:196:0x033b, B:198:0x033f, B:200:0x0343, B:201:0x0346, B:203:0x034a, B:204:0x034d, B:206:0x0351, B:207:0x0354, B:209:0x0358, B:210:0x035b, B:212:0x035f, B:213:0x0362, B:215:0x0366, B:216:0x0369, B:218:0x036d, B:219:0x0370, B:221:0x0374, B:222:0x0377, B:224:0x037b, B:225:0x037e, B:12:0x006e, B:181:0x02e6, B:184:0x02ee, B:185:0x0304), top: B:234:0x0000, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0198 A[Catch: Exception -> 0x0383, TryCatch #2 {Exception -> 0x0383, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:15:0x0085, B:17:0x0089, B:18:0x008e, B:21:0x009c, B:23:0x00a2, B:25:0x00bb, B:26:0x00cd, B:28:0x00d9, B:30:0x00e7, B:32:0x00f3, B:34:0x00f9, B:36:0x00fd, B:37:0x0100, B:39:0x0104, B:52:0x0123, B:55:0x0135, B:57:0x013b, B:59:0x015d, B:61:0x0161, B:63:0x0165, B:64:0x0168, B:67:0x016e, B:69:0x0172, B:72:0x0178, B:74:0x017e, B:76:0x0184, B:86:0x01a9, B:88:0x01ad, B:90:0x01b1, B:93:0x01b7, B:95:0x01bd, B:97:0x01c3, B:107:0x01e8, B:109:0x01ec, B:111:0x01f0, B:114:0x01f6, B:116:0x01fc, B:118:0x020e, B:132:0x0240, B:135:0x0246, B:137:0x024c, B:139:0x0252, B:140:0x0257, B:142:0x0264, B:143:0x026a, B:146:0x0270, B:148:0x0276, B:150:0x027c, B:154:0x0289, B:156:0x028d, B:158:0x0291, B:161:0x0297, B:163:0x029d, B:173:0x02c8, B:175:0x02cc, B:177:0x02d0, B:179:0x02d4, B:187:0x0321, B:189:0x0329, B:190:0x032c, B:192:0x0330, B:193:0x0333, B:195:0x0337, B:164:0x02b3, B:166:0x02b7, B:167:0x02ba, B:169:0x02be, B:170:0x02c1, B:172:0x02c5, B:151:0x0282, B:153:0x0286, B:119:0x0219, B:120:0x0224, B:122:0x0228, B:123:0x022b, B:125:0x022f, B:126:0x0232, B:128:0x0236, B:129:0x0239, B:131:0x023d, B:98:0x01d3, B:100:0x01d7, B:101:0x01da, B:103:0x01de, B:104:0x01e1, B:106:0x01e5, B:77:0x0194, B:79:0x0198, B:80:0x019b, B:82:0x019f, B:83:0x01a2, B:85:0x01a6, B:58:0x0156, B:40:0x0108, B:42:0x010c, B:43:0x010f, B:45:0x0113, B:46:0x0117, B:48:0x011b, B:49:0x011e, B:14:0x0083, B:196:0x033b, B:198:0x033f, B:200:0x0343, B:201:0x0346, B:203:0x034a, B:204:0x034d, B:206:0x0351, B:207:0x0354, B:209:0x0358, B:210:0x035b, B:212:0x035f, B:213:0x0362, B:215:0x0366, B:216:0x0369, B:218:0x036d, B:219:0x0370, B:221:0x0374, B:222:0x0377, B:224:0x037b, B:225:0x037e, B:12:0x006e, B:181:0x02e6, B:184:0x02ee, B:185:0x0304), top: B:234:0x0000, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019f A[Catch: Exception -> 0x0383, TryCatch #2 {Exception -> 0x0383, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:15:0x0085, B:17:0x0089, B:18:0x008e, B:21:0x009c, B:23:0x00a2, B:25:0x00bb, B:26:0x00cd, B:28:0x00d9, B:30:0x00e7, B:32:0x00f3, B:34:0x00f9, B:36:0x00fd, B:37:0x0100, B:39:0x0104, B:52:0x0123, B:55:0x0135, B:57:0x013b, B:59:0x015d, B:61:0x0161, B:63:0x0165, B:64:0x0168, B:67:0x016e, B:69:0x0172, B:72:0x0178, B:74:0x017e, B:76:0x0184, B:86:0x01a9, B:88:0x01ad, B:90:0x01b1, B:93:0x01b7, B:95:0x01bd, B:97:0x01c3, B:107:0x01e8, B:109:0x01ec, B:111:0x01f0, B:114:0x01f6, B:116:0x01fc, B:118:0x020e, B:132:0x0240, B:135:0x0246, B:137:0x024c, B:139:0x0252, B:140:0x0257, B:142:0x0264, B:143:0x026a, B:146:0x0270, B:148:0x0276, B:150:0x027c, B:154:0x0289, B:156:0x028d, B:158:0x0291, B:161:0x0297, B:163:0x029d, B:173:0x02c8, B:175:0x02cc, B:177:0x02d0, B:179:0x02d4, B:187:0x0321, B:189:0x0329, B:190:0x032c, B:192:0x0330, B:193:0x0333, B:195:0x0337, B:164:0x02b3, B:166:0x02b7, B:167:0x02ba, B:169:0x02be, B:170:0x02c1, B:172:0x02c5, B:151:0x0282, B:153:0x0286, B:119:0x0219, B:120:0x0224, B:122:0x0228, B:123:0x022b, B:125:0x022f, B:126:0x0232, B:128:0x0236, B:129:0x0239, B:131:0x023d, B:98:0x01d3, B:100:0x01d7, B:101:0x01da, B:103:0x01de, B:104:0x01e1, B:106:0x01e5, B:77:0x0194, B:79:0x0198, B:80:0x019b, B:82:0x019f, B:83:0x01a2, B:85:0x01a6, B:58:0x0156, B:40:0x0108, B:42:0x010c, B:43:0x010f, B:45:0x0113, B:46:0x0117, B:48:0x011b, B:49:0x011e, B:14:0x0083, B:196:0x033b, B:198:0x033f, B:200:0x0343, B:201:0x0346, B:203:0x034a, B:204:0x034d, B:206:0x0351, B:207:0x0354, B:209:0x0358, B:210:0x035b, B:212:0x035f, B:213:0x0362, B:215:0x0366, B:216:0x0369, B:218:0x036d, B:219:0x0370, B:221:0x0374, B:222:0x0377, B:224:0x037b, B:225:0x037e, B:12:0x006e, B:181:0x02e6, B:184:0x02ee, B:185:0x0304), top: B:234:0x0000, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a6 A[Catch: Exception -> 0x0383, TryCatch #2 {Exception -> 0x0383, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:15:0x0085, B:17:0x0089, B:18:0x008e, B:21:0x009c, B:23:0x00a2, B:25:0x00bb, B:26:0x00cd, B:28:0x00d9, B:30:0x00e7, B:32:0x00f3, B:34:0x00f9, B:36:0x00fd, B:37:0x0100, B:39:0x0104, B:52:0x0123, B:55:0x0135, B:57:0x013b, B:59:0x015d, B:61:0x0161, B:63:0x0165, B:64:0x0168, B:67:0x016e, B:69:0x0172, B:72:0x0178, B:74:0x017e, B:76:0x0184, B:86:0x01a9, B:88:0x01ad, B:90:0x01b1, B:93:0x01b7, B:95:0x01bd, B:97:0x01c3, B:107:0x01e8, B:109:0x01ec, B:111:0x01f0, B:114:0x01f6, B:116:0x01fc, B:118:0x020e, B:132:0x0240, B:135:0x0246, B:137:0x024c, B:139:0x0252, B:140:0x0257, B:142:0x0264, B:143:0x026a, B:146:0x0270, B:148:0x0276, B:150:0x027c, B:154:0x0289, B:156:0x028d, B:158:0x0291, B:161:0x0297, B:163:0x029d, B:173:0x02c8, B:175:0x02cc, B:177:0x02d0, B:179:0x02d4, B:187:0x0321, B:189:0x0329, B:190:0x032c, B:192:0x0330, B:193:0x0333, B:195:0x0337, B:164:0x02b3, B:166:0x02b7, B:167:0x02ba, B:169:0x02be, B:170:0x02c1, B:172:0x02c5, B:151:0x0282, B:153:0x0286, B:119:0x0219, B:120:0x0224, B:122:0x0228, B:123:0x022b, B:125:0x022f, B:126:0x0232, B:128:0x0236, B:129:0x0239, B:131:0x023d, B:98:0x01d3, B:100:0x01d7, B:101:0x01da, B:103:0x01de, B:104:0x01e1, B:106:0x01e5, B:77:0x0194, B:79:0x0198, B:80:0x019b, B:82:0x019f, B:83:0x01a2, B:85:0x01a6, B:58:0x0156, B:40:0x0108, B:42:0x010c, B:43:0x010f, B:45:0x0113, B:46:0x0117, B:48:0x011b, B:49:0x011e, B:14:0x0083, B:196:0x033b, B:198:0x033f, B:200:0x0343, B:201:0x0346, B:203:0x034a, B:204:0x034d, B:206:0x0351, B:207:0x0354, B:209:0x0358, B:210:0x035b, B:212:0x035f, B:213:0x0362, B:215:0x0366, B:216:0x0369, B:218:0x036d, B:219:0x0370, B:221:0x0374, B:222:0x0377, B:224:0x037b, B:225:0x037e, B:12:0x006e, B:181:0x02e6, B:184:0x02ee, B:185:0x0304), top: B:234:0x0000, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d3 A[Catch: Exception -> 0x0383, TryCatch #2 {Exception -> 0x0383, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:15:0x0085, B:17:0x0089, B:18:0x008e, B:21:0x009c, B:23:0x00a2, B:25:0x00bb, B:26:0x00cd, B:28:0x00d9, B:30:0x00e7, B:32:0x00f3, B:34:0x00f9, B:36:0x00fd, B:37:0x0100, B:39:0x0104, B:52:0x0123, B:55:0x0135, B:57:0x013b, B:59:0x015d, B:61:0x0161, B:63:0x0165, B:64:0x0168, B:67:0x016e, B:69:0x0172, B:72:0x0178, B:74:0x017e, B:76:0x0184, B:86:0x01a9, B:88:0x01ad, B:90:0x01b1, B:93:0x01b7, B:95:0x01bd, B:97:0x01c3, B:107:0x01e8, B:109:0x01ec, B:111:0x01f0, B:114:0x01f6, B:116:0x01fc, B:118:0x020e, B:132:0x0240, B:135:0x0246, B:137:0x024c, B:139:0x0252, B:140:0x0257, B:142:0x0264, B:143:0x026a, B:146:0x0270, B:148:0x0276, B:150:0x027c, B:154:0x0289, B:156:0x028d, B:158:0x0291, B:161:0x0297, B:163:0x029d, B:173:0x02c8, B:175:0x02cc, B:177:0x02d0, B:179:0x02d4, B:187:0x0321, B:189:0x0329, B:190:0x032c, B:192:0x0330, B:193:0x0333, B:195:0x0337, B:164:0x02b3, B:166:0x02b7, B:167:0x02ba, B:169:0x02be, B:170:0x02c1, B:172:0x02c5, B:151:0x0282, B:153:0x0286, B:119:0x0219, B:120:0x0224, B:122:0x0228, B:123:0x022b, B:125:0x022f, B:126:0x0232, B:128:0x0236, B:129:0x0239, B:131:0x023d, B:98:0x01d3, B:100:0x01d7, B:101:0x01da, B:103:0x01de, B:104:0x01e1, B:106:0x01e5, B:77:0x0194, B:79:0x0198, B:80:0x019b, B:82:0x019f, B:83:0x01a2, B:85:0x01a6, B:58:0x0156, B:40:0x0108, B:42:0x010c, B:43:0x010f, B:45:0x0113, B:46:0x0117, B:48:0x011b, B:49:0x011e, B:14:0x0083, B:196:0x033b, B:198:0x033f, B:200:0x0343, B:201:0x0346, B:203:0x034a, B:204:0x034d, B:206:0x0351, B:207:0x0354, B:209:0x0358, B:210:0x035b, B:212:0x035f, B:213:0x0362, B:215:0x0366, B:216:0x0369, B:218:0x036d, B:219:0x0370, B:221:0x0374, B:222:0x0377, B:224:0x037b, B:225:0x037e, B:12:0x006e, B:181:0x02e6, B:184:0x02ee, B:185:0x0304), top: B:234:0x0000, inners: #0, #1, #3 }] */
    @Override // z7.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K(com.nst.iptvsmarterstvbox.model.callback.VodInfoCallback r14) {
        /*
            Method dump skipped, instruction units count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ViewDetailsActivity.K(com.nst.iptvsmarterstvbox.model.callback.VodInfoCallback):void");
    }

    @Override // z7.g
    public void M(StalkerGetAdCallback stalkerGetAdCallback, int i9) {
        ImageView imageView;
        Drawable drawable;
        try {
            w.X();
            String str = this.f32981r1;
            if (str == null || !str.equals("add")) {
                this.f32969n1 = 0;
                if (Build.VERSION.SDK_INT <= 21) {
                    this.f32895G.setImageResource(a7.e.f11970W);
                }
                imageView = this.f32895G;
                drawable = this.f32962l0.getResources().getDrawable(a7.e.f11970W, null);
            } else {
                this.f32969n1 = 1;
                if (Build.VERSION.SDK_INT <= 21) {
                    this.f32895G.setImageResource(a7.e.f11967V);
                }
                imageView = this.f32895G;
                drawable = this.f32962l0.getResources().getDrawable(a7.e.f11967V, null);
            }
            imageView.setImageDrawable(drawable);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // z7.j
    public void M0(String str) {
        try {
            w.X();
        } catch (Exception unused) {
        }
    }

    @Override // z7.g
    public void O(Z.E e9, int i9) {
    }

    @Override // z7.j
    public void P(String str) {
    }

    @Override // z7.g
    public void P0(String str) {
    }

    @Override // z7.j
    public void T0(StalkerDeletePlayerLinkCallback stalkerDeletePlayerLinkCallback) {
    }

    @Override // z7.g
    public void U(StalkerLiveFavIdsCallback stalkerLiveFavIdsCallback) {
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0042 A[Catch: Exception -> 0x0049, TRY_LEAVE, TryCatch #0 {Exception -> 0x0049, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:8:0x0042), top: B:12:0x0002 }] */
    @Override // z7.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void U0(com.nst.iptvsmarterstvbox.model.callback.TMDBCastsCallback r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L42
            java.util.List r0 = r6.getCast()     // Catch: java.lang.Exception -> L49
            if (r0 == 0) goto L42
            java.util.List r0 = r6.getCast()     // Catch: java.lang.Exception -> L49
            int r0 = r0.size()     // Catch: java.lang.Exception -> L49
            if (r0 <= 0) goto L42
            androidx.recyclerview.widget.RecyclerView r0 = r5.f32928W0     // Catch: java.lang.Exception -> L49
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager     // Catch: java.lang.Exception -> L49
            r2 = 0
            r1.<init>(r5, r2, r2)     // Catch: java.lang.Exception -> L49
            r0.setLayoutManager(r1)     // Catch: java.lang.Exception -> L49
            androidx.recyclerview.widget.RecyclerView r0 = r5.f32928W0     // Catch: java.lang.Exception -> L49
            androidx.recyclerview.widget.c r1 = new androidx.recyclerview.widget.c     // Catch: java.lang.Exception -> L49
            r1.<init>()     // Catch: java.lang.Exception -> L49
            r0.setItemAnimator(r1)     // Catch: java.lang.Exception -> L49
            q7.f r0 = new q7.f     // Catch: java.lang.Exception -> L49
            java.util.List r6 = r6.getCast()     // Catch: java.lang.Exception -> L49
            android.content.Context r1 = r5.f32962l0     // Catch: java.lang.Exception -> L49
            java.lang.String r3 = r5.f32939d1     // Catch: java.lang.Exception -> L49
            r4 = 1
            r0.<init>(r6, r1, r4, r3)     // Catch: java.lang.Exception -> L49
            r5.f32932Y0 = r0     // Catch: java.lang.Exception -> L49
            androidx.recyclerview.widget.RecyclerView r6 = r5.f32928W0     // Catch: java.lang.Exception -> L49
            r6.setAdapter(r0)     // Catch: java.lang.Exception -> L49
            androidx.recyclerview.widget.RecyclerView r6 = r5.f32928W0     // Catch: java.lang.Exception -> L49
            r6.setVisibility(r2)     // Catch: java.lang.Exception -> L49
            goto L49
        L42:
            androidx.recyclerview.widget.RecyclerView r6 = r5.f32928W0     // Catch: java.lang.Exception -> L49
            r0 = 8
            r6.setVisibility(r0)     // Catch: java.lang.Exception -> L49
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ViewDetailsActivity.U0(com.nst.iptvsmarterstvbox.model.callback.TMDBCastsCallback):void");
    }

    @Override // z7.g
    public void V(StalkerProfilesCallback stalkerProfilesCallback) {
    }

    @Override // z7.g
    public void V0(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, m0.x xVar, int i9) {
        if (stalkerSetLiveFavCallback != null) {
            try {
                if (stalkerSetLiveFavCallback.getJs() == null || !stalkerSetLiveFavCallback.getJs().equals(Boolean.TRUE)) {
                    return;
                }
                String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f32962l0);
                String loggedInMacAddress = SharepreferenceDBHandler.getLoggedInMacAddress(this.f32962l0);
                this.f32981r1 = "add";
                this.f32975p1.f(loggedInMacAddress, stalkerToken, 0);
            } catch (Exception unused) {
                w.X();
            }
        }
    }

    @Override // z7.j
    public void X(StalkerShortEPGCallback stalkerShortEPGCallback) {
    }

    @Override // z7.k
    public void X0(TMDBTrailerCallback tMDBTrailerCallback) {
        if (tMDBTrailerCallback != null) {
            try {
                if (tMDBTrailerCallback.getResults() == null || tMDBTrailerCallback.getResults().size() <= 0) {
                    return;
                }
                for (int i9 = 0; i9 < tMDBTrailerCallback.getResults().size(); i9++) {
                    if (tMDBTrailerCallback.getResults().get(i9).getType().equals(HttpHeaders.TRAILER)) {
                        this.f32908M0 = tMDBTrailerCallback.getResults().get(i9).getKey();
                        return;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // z7.b
    public void a() {
    }

    @Override // z7.b
    public void b() {
    }

    @Override // z7.g
    public void c(String str) {
    }

    @Override // z7.b
    public void d(String str) {
        try {
            ProgressDialog progressDialog = this.f32965m0;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            this.f32965m0.dismiss();
            Toast.makeText(this, this.f32962l0.getResources().getString(a7.j.f13244e7), 1).show();
        } catch (Exception unused) {
        }
    }

    @Override // z7.g
    public void d0(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, C2635t.o oVar, String str, String str2) {
    }

    @Override // androidx.appcompat.app.b, D.AbstractActivityC0525h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return keyCode == 82 ? keyEvent.getAction() == 0 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent) : super.dispatchKeyEvent(keyEvent);
    }

    @Override // z7.g
    public void e(String str) {
    }

    @Override // z7.g
    public void e0(String str) {
    }

    @Override // z7.g
    public void f0(StalkerGetGenresCallback stalkerGetGenresCallback) {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0097 A[Catch: Exception -> 0x0151, TryCatch #2 {Exception -> 0x0151, blocks: (B:4:0x0005, B:6:0x000b, B:9:0x0018, B:11:0x0022, B:12:0x004d, B:14:0x005d, B:16:0x0061, B:18:0x0065, B:20:0x006b, B:40:0x00ac, B:66:0x013c, B:68:0x0140, B:69:0x0143, B:71:0x0147, B:72:0x014a, B:74:0x014e, B:21:0x0081, B:23:0x0085, B:24:0x0088, B:26:0x008c, B:27:0x008f, B:29:0x0093, B:30:0x0097, B:32:0x009b, B:33:0x009e, B:35:0x00a2, B:36:0x00a5, B:42:0x00b2, B:44:0x00c9, B:46:0x00cd, B:48:0x00d1, B:56:0x0122, B:58:0x012a, B:59:0x012d, B:61:0x0131, B:62:0x0134, B:64:0x0138, B:50:0x00e8, B:53:0x00f0, B:54:0x0105), top: B:81:0x0005, inners: #0 }] */
    @Override // z7.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g0(com.nst.iptvsmarterstvbox.model.callback.TMDBGenreCallback r8) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ViewDetailsActivity.g0(com.nst.iptvsmarterstvbox.model.callback.TMDBGenreCallback):void");
    }

    @Override // z7.g
    public void i(StalkerGetAllChannelsCallback stalkerGetAllChannelsCallback) {
    }

    @Override // z7.g
    public void j(StalkerGetVodCategoriesCallback stalkerGetVodCategoriesCallback) {
    }

    public final void k2() {
        Intent intent = getIntent();
        if (intent != null) {
            try {
                this.f32884A0 = Integer.parseInt(intent.getStringExtra(AbstractC2237a.f44464Q));
            } catch (NumberFormatException unused) {
                this.f32884A0 = -1;
            }
            this.f32886B0 = intent.getStringExtra(AbstractC2237a.f44464Q);
            Log.i("streamIDIS", "idIS:" + this.f32886B0);
            this.f32992v0 = intent.getStringExtra("movie");
            this.f32995w0 = intent.getStringExtra("selectedPlayer");
            this.f32998x0 = intent.getStringExtra("streamType");
            this.f33000y0 = intent.getStringExtra("containerExtension");
            this.f32888C0 = intent.getStringExtra("categoryID");
            this.f33002z0 = intent.getStringExtra("num");
            this.f32916Q0 = intent.getStringExtra("movie_icon");
            this.f32918R0 = intent.getStringExtra("videoURL");
            this.f32994w.setText(this.f32992v0);
            com.squareup.picasso.t.q(this.f32962l0).l(this.f32916Q0).j(a7.e.f11895B1).g(this.f32991v);
            VodAllCategoriesSingleton.getInstance().setMoviesPoster(this.f32916Q0);
            this.f32961l = this.f32918R0;
            this.f32964m = this.f32916Q0;
            Log.i("downloadURLIS", "URL:" + this.f32961l);
        }
        ImageView imageView = this.f32895G;
        if (imageView != null) {
            imageView.setOnFocusChangeListener(new v(imageView));
            this.f32895G.setOnClickListener(new t());
        }
        String oneStreamToken = SharepreferenceDBHandler.getOneStreamToken(this.f32962l0);
        String string = this.f32962l0.getSharedPreferences("loginPrefsserverurl", 0).getString(AbstractC2237a.f44454L, "");
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f32962l0).equals("onestream_api")) {
            String str = this.f32886B0;
            Log.e("checkstream", str);
            AbstractC2074a.a(string + "play/b2c/v1/content/vod/" + str + "?token=" + oneStreamToken).s(k1.e.MEDIUM).q().o(new a());
        }
    }

    public void l2() {
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    @Override // z7.g
    public void o0(String str) {
        try {
            w.X();
        } catch (Exception unused) {
        }
    }

    public final /* synthetic */ void o2(DialogInterface dialogInterface, int i9) {
        w.n0(this.f32962l0);
        finishAffinity();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        AbstractC2237a.f44521m0 = true;
        AbstractC2237a.f44524n0 = this.f32969n1;
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == a7.f.Bj) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r4) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ViewDetailsActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f32976q.x(a7.h.f12939v);
        this.f32906L0 = menu;
        this.f32904K0 = menu.getItem(1).getSubMenu().findItem(a7.f.f12239P2);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f32962l0).equals("api")) {
            menu.getItem(1).getSubMenu().findItem(a7.f.fb).setVisible(false);
        }
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f32976q.getChildCount(); i9++) {
            if (this.f32976q.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f32976q.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
        return true;
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        PopupWindow popupWindow = this.f32892E0;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f32892E0.dismiss();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        if (i9 != 82) {
            return super.onKeyUp(i9, keyEvent);
        }
        Menu menu = this.f32906L0;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(a7.f.f12239P2, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f32904K0 = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == a7.f.Gb) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == a7.f.Mb) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == a7.f.f12380e && (context = this.f32962l0) != null) {
            new a.C0158a(context, a7.k.f13456a).setTitle(getResources().getString(a7.j.f13250f3)).f(getResources().getString(a7.j.f13240e3)).j(getResources().getString(a7.j.f13132S8), new DialogInterface.OnClickListener() { // from class: p7.q1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i9) {
                    this.f46666a.o2(dialogInterface, i9);
                }
            }).g(getResources().getString(a7.j.f13231d4), new DialogInterface.OnClickListener() { // from class: p7.r1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i9) {
                    dialogInterface.dismiss();
                }
            }).n();
        }
        if (itemId == a7.f.fb) {
            w.A0(this.f32962l0);
            if (itemId == a7.f.hb) {
                a.C0158a c0158a = new a.C0158a(this);
                c0158a.setTitle(this.f32962l0.getResources().getString(a7.j.f13397u0));
                c0158a.f(this.f32962l0.getResources().getString(a7.j.f13134T0));
                c0158a.d(a7.e.f12056s1);
                c0158a.j(this.f32962l0.getResources().getString(a7.j.f13132S8), new b());
                c0158a.g(this.f32962l0.getResources().getString(a7.j.f13231d4), new c());
                c0158a.n();
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        l2();
        super.onResume();
        w.m(this.f32962l0);
        w.z0(this.f32962l0);
        if (!this.f32936b1) {
            G2();
            v2();
        }
        this.f32936b1 = false;
        getWindow().setFlags(1024, 1024);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        l2();
    }

    @Override // z7.g
    public void q(StalkerGetVODByCatCallback stalkerGetVODByCatCallback) {
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c5 A[Catch: Exception -> 0x0186, TryCatch #0 {Exception -> 0x0186, blocks: (B:4:0x0009, B:6:0x000f, B:8:0x0019, B:11:0x0021, B:13:0x0027, B:14:0x0048, B:16:0x0058, B:18:0x005c, B:20:0x0060, B:22:0x0066, B:24:0x0078, B:63:0x00e1, B:65:0x00e7, B:67:0x00f1, B:70:0x00f8, B:72:0x00fe, B:74:0x0110, B:75:0x011b, B:76:0x011e, B:78:0x0122, B:80:0x0126, B:83:0x012c, B:85:0x0132, B:87:0x013a, B:88:0x014a, B:90:0x014e, B:91:0x0151, B:93:0x0155, B:94:0x0158, B:96:0x015c, B:97:0x0160, B:99:0x0164, B:100:0x0167, B:102:0x016b, B:103:0x016e, B:106:0x0173, B:108:0x0177, B:109:0x017a, B:111:0x017e, B:112:0x0181, B:25:0x0083, B:26:0x008e, B:28:0x0092, B:29:0x0095, B:31:0x0099, B:32:0x009c, B:34:0x00a0, B:35:0x00a3, B:37:0x00a7, B:38:0x00ab, B:40:0x00af, B:41:0x00b2, B:43:0x00b6, B:44:0x00b9, B:46:0x00bd, B:47:0x00c0, B:50:0x00c5, B:52:0x00c9, B:53:0x00cc, B:55:0x00d0, B:56:0x00d3, B:58:0x00d7, B:59:0x00da), top: B:117:0x0009 }] */
    @Override // z7.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(com.nst.iptvsmarterstvbox.model.callback.TMDBCastsCallback r9) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ViewDetailsActivity.s(com.nst.iptvsmarterstvbox.model.callback.TMDBCastsCallback):void");
    }

    @Override // z7.k
    public void t(TMDBPersonInfoCallback tMDBPersonInfoCallback) {
    }

    @Override // z7.j
    public void u(StalkerCreatePlayerLinkCallback stalkerCreatePlayerLinkCallback, View view, int i9, int i10, String str, String str2, String str3, String str4, String str5, String str6, int i11, String str7, String str8) {
        try {
            w.X();
            if (stalkerCreatePlayerLinkCallback == null || stalkerCreatePlayerLinkCallback.getJs() == null || stalkerCreatePlayerLinkCallback.getJs().getCmd() == null || stalkerCreatePlayerLinkCallback.getJs().getId() == null) {
                return;
            }
            this.f32924U0 = stalkerCreatePlayerLinkCallback.getJs().getCmd();
            x2(view);
        } catch (Exception unused) {
        }
    }

    @Override // z7.g
    public void v0(String str) {
        try {
            w.X();
        } catch (Exception unused) {
        }
    }

    public final void v2() {
        TextView textView;
        Resources resources;
        int i9;
        String string;
        int moviePercentage;
        this.f32943f = new DownloadedDBHandler(this.f32962l0);
        this.f32946g = new ArrayList();
        ArrayList<DownloadedDataModel> downloadedData = this.f32943f.getDownloadedData();
        this.f32946g = downloadedData;
        try {
            if (downloadedData.size() > 0) {
                for (int i10 = 0; i10 < this.f32946g.size(); i10++) {
                    if (((DownloadedDataModel) this.f32946g.get(i10)).getMovieURL().equals(this.f32961l)) {
                        Log.i("movieState", ((DownloadedDataModel) this.f32946g.get(i10)).getMovieState());
                        if (((DownloadedDataModel) this.f32946g.get(i10)).getMovieState().equals("Downloading")) {
                            this.f32952i.setVisibility(0);
                            this.f32949h.setText(this.f32962l0.getResources().getString(a7.j.f13268h1).concat(".."));
                            moviePercentage = ((DownloadedDataModel) this.f32946g.get(i10)).getMoviePercentage();
                        } else if (((DownloadedDataModel) this.f32946g.get(i10)).getMovieState().equals("Paused")) {
                            this.f32952i.setVisibility(0);
                            this.f32949h.setText(this.f32962l0.getResources().getString(a7.j.f13212b5));
                            moviePercentage = ((DownloadedDataModel) this.f32946g.get(i10)).getMoviePercentage();
                        } else {
                            if (((DownloadedDataModel) this.f32946g.get(i10)).getMovieState().equals("Completed")) {
                                this.f32952i.setVisibility(8);
                                this.f32949h.setText(this.f32962l0.getResources().getString(a7.j.f13258g1));
                                this.f32958k.setVisibility(0);
                                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                                layoutParams.setMargins(10, 0, 0, 0);
                                this.f32949h.setLayoutParams(layoutParams);
                                return;
                            }
                            if (!((DownloadedDataModel) this.f32946g.get(i10)).getMovieState().equals("Failed")) {
                                if (((DownloadedDataModel) this.f32946g.get(i10)).getMovieState().equals("Waiting")) {
                                    this.f32952i.setVisibility(0);
                                    this.f32952i.setProgress(((DownloadedDataModel) this.f32946g.get(i10)).getMoviePercentage());
                                    textView = this.f32949h;
                                    string = "Waiting..";
                                    textView.setText(string);
                                }
                                return;
                            }
                            this.f32952i.setVisibility(0);
                            this.f32952i.setProgress(((DownloadedDataModel) this.f32946g.get(i10)).getMoviePercentage());
                            textView = this.f32949h;
                            resources = this.f32962l0.getResources();
                            i9 = a7.j.f13278i1;
                        }
                        this.f32952i.setProgress(moviePercentage);
                        return;
                    }
                }
                return;
            }
            this.f32952i.setVisibility(8);
            textView = this.f32949h;
            resources = this.f32962l0.getResources();
            i9 = a7.j.f13143U0;
            string = resources.getString(i9);
            textView.setText(string);
        } catch (Exception unused) {
        }
    }

    public final void w2(ViewDetailsActivity viewDetailsActivity) {
        View viewInflate = ((LayoutInflater) viewDetailsActivity.getSystemService("layout_inflater")).inflate(a7.g.f12832l3, (RelativeLayout) viewDetailsActivity.findViewById(a7.f.We));
        PopupWindow popupWindow = new PopupWindow(viewDetailsActivity);
        this.f32892E0 = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.f32892E0.setWidth(-1);
        this.f32892E0.setHeight(-1);
        this.f32892E0.setFocusable(true);
        this.f32892E0.setBackgroundDrawable(new BitmapDrawable());
        this.f32892E0.showAtLocation(viewInflate, 17, 0, 0);
        this.f32912O0 = (Button) viewInflate.findViewById(a7.f.f12157H0);
        this.f32894F0 = (Button) viewInflate.findViewById(a7.f.f12482o0);
        Button button = this.f32912O0;
        if (button != null) {
            button.setOnFocusChangeListener(new v(button));
        }
        Button button2 = this.f32894F0;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new v(button2));
        }
        this.f32894F0.setOnClickListener(new i());
        this.f32912O0.setOnClickListener(new j());
    }

    public final void x2(View view) {
        Context context;
        int i9;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i10;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        SharedPreferences sharedPreferences = this.f32962l0.getSharedPreferences("selectedPlayer", 0);
        this.f32971o0 = sharedPreferences;
        String strJ = "";
        String string = sharedPreferences.getString("selectedPlayer", "");
        SimpleDateFormat simpleDateFormat = this.f32972o1;
        if (i2(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(this.f32962l0))), this.f32898H0.format(this.f32984s1)) >= C2939c.p() && (str9 = this.f32979r) != null && this.f32982s != null && (!f32881x1.equals(str9) || (this.f32979r != null && (str10 = this.f32982s) != null && !f32882y1.equals(str10)))) {
            this.f32910N0 = Boolean.FALSE;
        }
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f32962l0).equals("stalker_api")) {
            if (!this.f32910N0.booleanValue()) {
                return;
            }
            context = this.f32962l0;
            i9 = this.f32884A0;
            str = this.f32998x0;
            str2 = this.f33000y0;
            str3 = this.f33002z0;
            str4 = this.f32992v0;
            str5 = this.f32924U0;
            i10 = this.f32935a1;
            str7 = this.f32973p;
            str8 = "";
            str6 = "";
        } else {
            if (!this.f32910N0.booleanValue()) {
                return;
            }
            try {
                if (this.f32934Z0.equals("mobile")) {
                    try {
                        this.f32914P0 = C2325b.e(this.f32962l0).c().c();
                    } catch (Exception unused) {
                    }
                }
                C2328e c2328e = this.f32914P0;
                if (c2328e != null && c2328e.c()) {
                    String strG = w.G(SharepreferenceDBHandler.getCurrentAPPType(this.f32962l0).equals("onestream_api") ? this.f32918R0 : w.U(this.f32962l0, this.f32884A0, this.f33000y0, "movie"));
                    C2328e c2328e2 = this.f32914P0;
                    if (c2328e2 != null && c2328e2.r() != null && this.f32914P0.r().j() != null && this.f32914P0.r().j().J() != null) {
                        strJ = this.f32914P0.r().j().J();
                    }
                    if (strJ.equals(strG)) {
                        this.f32962l0.startActivity(new Intent(this.f32962l0, (Class<?>) ExpandedControlsActivity.class));
                        return;
                    } else {
                        AbstractC1902a.c(this.f32937c1, true, AbstractC1902a.a(this.f32992v0, "", "", 0, strG, "videos/mp4", this.f32916Q0, "", null), this.f32914P0, this.f32962l0);
                        return;
                    }
                }
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                U u9 = new U(this, view);
                u9.c().inflate(a7.h.f12930m, u9.b());
                ArrayList<ExternalPlayerModelClass> externalPlayer = new ExternalPlayerDataBase(this.f32962l0).getExternalPlayer();
                if (externalPlayer != null) {
                    try {
                        if (externalPlayer.size() > 0) {
                            u9.b().add(0, 0, 0, this.f32962l0.getResources().getString(a7.j.f13155V3));
                            ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
                            externalPlayerModelClass.setId(0);
                            externalPlayerModelClass.setAppname(this.f32962l0.getResources().getString(a7.j.f13272h5));
                            arrayList.add(externalPlayerModelClass);
                            int i11 = 0;
                            while (i11 < externalPlayer.size()) {
                                int i12 = i11 + 1;
                                u9.b().add(0, i12, 0, this.f32962l0.getResources().getString(a7.j.f13272h5) + " " + externalPlayer.get(i11).getAppname());
                                arrayList.add(externalPlayer.get(i11));
                                i11 = i12;
                            }
                            u9.f(new g(arrayList, string));
                            u9.e(new h());
                            u9.g();
                            return;
                        }
                    } catch (Exception unused2) {
                        return;
                    }
                }
                Log.e("tagelapsed", String.valueOf(this.f32935a1));
                w.w0(this.f32962l0, string, this.f32884A0, this.f32998x0, this.f33000y0, this.f33002z0, this.f32992v0, this.f32924U0, this.f32935a1, this.f32886B0, this.f32973p, "");
                return;
            } catch (Exception unused3) {
                context = this.f32962l0;
                i9 = this.f32884A0;
                str = this.f32998x0;
                str2 = this.f33000y0;
                str3 = this.f33002z0;
                str4 = this.f32992v0;
                str5 = this.f32924U0;
                i10 = this.f32935a1;
                str6 = this.f32886B0;
                str7 = this.f32973p;
                str8 = "";
            }
        }
        w.w0(context, string, i9, str, str2, str3, str4, str5, i10, str6, str7, str8);
    }

    @Override // z7.g
    public void y0(String str) {
        try {
            w.X();
        } catch (Exception unused) {
        }
    }
}
