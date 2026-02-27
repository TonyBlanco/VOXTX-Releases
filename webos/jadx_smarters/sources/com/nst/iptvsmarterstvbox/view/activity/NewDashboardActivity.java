package com.nst.iptvsmarterstvbox.view.activity;

import D.AbstractC0519b;
import Q0.m;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.window.OnBackInvokedCallback;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import b7.AbstractC1232b;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.amazonaws.services.s3.internal.Constants;
import com.cooltechworks.views.shimmer.ShimmerRecyclerView;
import com.google.gson.JsonElement;
import com.nst.iptvsmarterstvbox.miscelleneious.ApiWorkerCombinedRequest;
import com.nst.iptvsmarterstvbox.miscelleneious.MyApplication;
import com.nst.iptvsmarterstvbox.model.DownloadedDataModel;
import com.nst.iptvsmarterstvbox.model.EpisodesUsingSinglton;
import com.nst.iptvsmarterstvbox.model.FavouriteDBModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.VodAllCategoriesSingleton;
import com.nst.iptvsmarterstvbox.model.callback.BillingAddOrderCallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingCheckGPACallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingGetDevicesCallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingIsPurchasedCallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingLoginClientCallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingUpdateDevicesCallback;
import com.nst.iptvsmarterstvbox.model.callback.GetEpisdoeDetailsCallback;
import com.nst.iptvsmarterstvbox.model.callback.LoginCallback;
import com.nst.iptvsmarterstvbox.model.callback.RegisterClientCallback;
import com.nst.iptvsmarterstvbox.model.callback.SeriesDBModel;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.DownloadedDBHandler;
import com.nst.iptvsmarterstvbox.model.database.ImportStatusModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.MultiUserDBHandler;
import com.nst.iptvsmarterstvbox.model.database.RecentWatchDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SeriesRecentWatchDatabase;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.sbpfunction.adapterpushnotification.DashboardSBPAnnouncementAdapter;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.AdsLastUpdateResponseCallback;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.readAnnouncementFirebaseCallback;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationinterface.FirebaseInterface;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter;
import com.nst.iptvsmarterstvbox.sbpfunction.singletonpushnotification.AnnouncementsSBPSingleton;
import com.nst.iptvsmarterstvbox.sbpfunction.singletonpushnotification.DashBoardListssingleton;
import com.nst.iptvsmarterstvbox.sbpfunction.singletonpushnotification.Listsingleton;
import com.nst.iptvsmarterstvbox.view.services.VideoDownloadService;
import de.blinkt.openvpn.LaunchVPN;
import de.blinkt.openvpn.core.G;
import de.blinkt.openvpn.core.InterfaceC1725h;
import de.blinkt.openvpn.core.OpenVPNService;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import m7.AbstractC2237a;
import m7.w;
import n7.c;
import org.achartengine.renderer.DefaultRenderer;
import u7.C2858a;
import z3.AbstractServiceC3053x;

/* JADX INFO: loaded from: classes4.dex */
public class NewDashboardActivity extends androidx.appcompat.app.b implements View.OnClickListener, z7.f, z7.i, z7.d, FirebaseInterface, c.b {

    /* JADX INFO: renamed from: Y1, reason: collision with root package name */
    public static PopupWindow f30999Y1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public TextView f31000A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public ImageView f31001A0;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public LinearLayout f31002A1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public TextView f31003B;

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public LinearLayout f31005B1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public TextView f31006C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public SharedPreferences f31007C0;

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public LinearLayout f31008C1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ImageView f31009D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public SharedPreferences.Editor f31010D0;

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    public LinearLayout f31011D1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ImageView f31012E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public LiveStreamDBHandler f31013E0;

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public LinearLayout f31014E1;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ImageView f31015F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public SharedPreferences f31016F0;

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public LinearLayout f31017F1;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public FrameLayout f31018G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public SharedPreferences f31019G0;

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    public ConstraintLayout f31020G1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ImageView f31021H;

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    public FirebasePresenter f31023H1;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public TextView f31024I;

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    public String f31026I1;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ImageView f31027J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public TextView f31030K;

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    public Handler f31032K1;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public LinearLayout f31033L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public SharedPreferences f31034L0;

    /* JADX INFO: renamed from: L1, reason: collision with root package name */
    public Handler f31035L1;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ImageView f31036M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public long f31037M0;

    /* JADX INFO: renamed from: M1, reason: collision with root package name */
    public Handler f31038M1;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ProgressBar f31039N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public Button f31040N0;

    /* JADX INFO: renamed from: N1, reason: collision with root package name */
    public Runnable f31041N1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ImageView f31042O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public Button f31043O0;

    /* JADX INFO: renamed from: O1, reason: collision with root package name */
    public Runnable f31044O1;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ProgressBar f31045P;

    /* JADX INFO: renamed from: P1, reason: collision with root package name */
    public Runnable f31047P1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public TextView f31048Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public DatabaseHandler f31049Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public LinearLayout f31051R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public String f31052R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public LinearLayout f31054S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public MultiUserDBHandler f31055S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public TextView f31057T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public n7.d f31058T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ProgressBar f31060U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public ArrayList f31061U0;

    /* JADX INFO: renamed from: U1, reason: collision with root package name */
    public DashboardSBPAnnouncementAdapter f31062U1;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ImageView f31063V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public J7.a f31064V0;

    /* JADX INFO: renamed from: V1, reason: collision with root package name */
    public long f31065V1;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public ProgressBar f31066W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public C2858a f31067W0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f31069X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public n7.f f31070X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public LinearLayout f31072Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public String f31073Y0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public LinearLayout f31074Z;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public String f31075Z0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DownloadedDBHandler f31079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f31081e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public TextView f31082e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public ProgressDialog f31083e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f31084f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ProgressBar f31085f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f31087g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ImageView f31088g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public String f31089g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f31090h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ProgressBar f31091h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public String f31092h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f31093i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public TextView f31094i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f31095i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f31096j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public LinearLayout f31097j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public n7.b f31098j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayout f31099k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public LinearLayout f31100k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f31102l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public TextView f31103l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LinearLayout f31105m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public LinearLayout f31106m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f31108n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public ImageView f31109n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinearLayout f31111o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public ProgressBar f31112o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public RecentWatchDBHandler f31113o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f31114p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ProgressBar f31115p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public SeriesRecentWatchDatabase f31116p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LinearLayout f31117q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ProgressBar f31118q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f31120r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public TextView f31121r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f31123s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public LinearLayout f31124s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f31126t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ImageView f31127t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f31129u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public TextView f31130u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public LinearLayout f31131u1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f31132v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public ImageView f31133v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public ConstraintLayout f31134v1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f31135w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public TextView f31136w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public Button f31137w1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f31138x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public LinearLayout f31139x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public Button f31140x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f31141y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public LinearLayout f31142y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public TextView f31143y1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f31144z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public TextView f31145z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public ImageView f31146z1;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public Context f31004B0 = this;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public String f31022H0 = "";

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public String f31025I0 = "";

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public String f31028J0 = "";

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f31031K0 = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public String f31046P0 = "";

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public boolean f31076a1 = true;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public boolean f31077b1 = false;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public boolean f31078c1 = false;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f31080d1 = false;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public long f31086f1 = 0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public Thread f31101k1 = null;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public boolean f31104l1 = false;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public boolean f31107m1 = false;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public boolean f31110n1 = false;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public String f31119q1 = "";

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public String f31122r1 = "";

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public String f31125s1 = "";

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public int f31128t1 = 0;

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    public List f31029J1 = new ArrayList();

    /* JADX INFO: renamed from: Q1, reason: collision with root package name */
    public long f31050Q1 = 0;

    /* JADX INFO: renamed from: R1, reason: collision with root package name */
    public boolean f31053R1 = false;

    /* JADX INFO: renamed from: S1, reason: collision with root package name */
    public String f31056S1 = "";

    /* JADX INFO: renamed from: T1, reason: collision with root package name */
    public int f31059T1 = 0;

    /* JADX INFO: renamed from: W1, reason: collision with root package name */
    public long f31068W1 = 5000;

    /* JADX INFO: renamed from: X1, reason: collision with root package name */
    public String f31071X1 = "";

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NewDashboardActivity.f30999Y1.dismiss();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NewDashboardActivity.this.finish();
            m7.w.n0(NewDashboardActivity.this.f31004B0);
            NewDashboardActivity.this.overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f31149a;

        public c(List list) {
            this.f31149a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f31149a.size();
            int i9 = AbstractC2237a.f44519l1;
            if (size > i9) {
                NewDashboardActivity.this.f31145z0.setText((CharSequence) this.f31149a.get(i9));
                NewDashboardActivity.this.f31065V1 = r0.h2((String) this.f31149a.get(AbstractC2237a.f44519l1));
                int i10 = AbstractC2237a.f44519l1 + 1;
                AbstractC2237a.f44519l1 = i10;
                if (i10 == this.f31149a.size()) {
                    AbstractC2237a.f44519l1 = 0;
                }
            } else {
                AbstractC2237a.f44519l1 = 0;
                NewDashboardActivity.this.f31145z0.setText((CharSequence) this.f31149a.get(0));
                NewDashboardActivity.this.f31065V1 = r0.h2((String) this.f31149a.get(AbstractC2237a.f44519l1));
            }
            NewDashboardActivity newDashboardActivity = NewDashboardActivity.this;
            newDashboardActivity.f31035L1.postDelayed(newDashboardActivity.f31047P1, newDashboardActivity.f31065V1);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f31151a;

        public d(List list) {
            this.f31151a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f31151a.size() > AbstractC2237a.f44522m1) {
                O1.g.u(NewDashboardActivity.this.f31004B0).q((String) this.f31151a.get(AbstractC2237a.f44522m1)).l(NewDashboardActivity.this.f31001A0);
                int i9 = AbstractC2237a.f44522m1 + 1;
                AbstractC2237a.f44522m1 = i9;
                if (i9 == this.f31151a.size()) {
                    AbstractC2237a.f44522m1 = 0;
                }
            } else {
                AbstractC2237a.f44522m1 = 0;
                O1.g.u(NewDashboardActivity.this.f31004B0).q((String) this.f31151a.get(AbstractC2237a.f44522m1)).l(NewDashboardActivity.this.f31001A0);
            }
            NewDashboardActivity newDashboardActivity = NewDashboardActivity.this;
            newDashboardActivity.f31038M1.postDelayed(newDashboardActivity.f31044O1, 10000L);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f31153a;

        public e(List list) {
            this.f31153a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Listsingleton.b().c() == null || Listsingleton.b().c().size() <= 0) {
                NewDashboardActivity.this.f31136w0.setText("");
                NewDashboardActivity.this.f31136w0.setVisibility(8);
                return;
            }
            if (this.f31153a.size() > AbstractC2237a.f44525n1) {
                NewDashboardActivity.this.f31136w0.setText(MyApplication.p().o((String) this.f31153a.get(AbstractC2237a.f44525n1)));
                NewDashboardActivity.this.f31136w0.setVisibility(0);
                NewDashboardActivity.this.f31068W1 = r0.h2((String) this.f31153a.get(AbstractC2237a.f44525n1));
                if (AbstractC2237a.f44525n1 == this.f31153a.size()) {
                    AbstractC2237a.f44525n1 = 0;
                } else {
                    AbstractC2237a.f44525n1++;
                }
            } else {
                AbstractC2237a.f44525n1 = 0;
                NewDashboardActivity.this.f31136w0.setText(MyApplication.p().o((String) this.f31153a.get(AbstractC2237a.f44525n1)));
                NewDashboardActivity.this.f31136w0.setVisibility(0);
                NewDashboardActivity.this.f31068W1 = r0.h2((String) this.f31153a.get(AbstractC2237a.f44525n1));
            }
            NewDashboardActivity newDashboardActivity = NewDashboardActivity.this;
            newDashboardActivity.f31032K1.postDelayed(newDashboardActivity.f31041N1, newDashboardActivity.f31068W1);
        }
    }

    public class f implements OnBackInvokedCallback {
        public f() {
        }

        @Override // android.window.OnBackInvokedCallback
        public void onBackInvoked() {
            if (Build.VERSION.SDK_INT >= 34) {
                if (NewDashboardActivity.this.f31037M0 + 2000 > System.currentTimeMillis()) {
                    NewDashboardActivity.this.finishAffinity();
                    NewDashboardActivity.this.finish();
                } else {
                    try {
                        Toast.makeText(NewDashboardActivity.this.getBaseContext(), NewDashboardActivity.this.getResources().getString(a7.j.f12999F5), 0).show();
                    } catch (Exception unused) {
                    }
                }
                NewDashboardActivity.this.f31037M0 = System.currentTimeMillis();
            }
        }
    }

    public class g extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f31156a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Context f31157c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public LiveStreamDBHandler f31158d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f31159e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public TextView f31160f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public RelativeLayout f31161g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public LinearLayout f31162h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public LinearLayout f31163i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public LinearLayout f31164j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public LinearLayout f31165k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public LinearLayout f31166l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public LinearLayout f31167m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ShimmerRecyclerView f31168n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Animation f31169o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Animation f31170p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public ImageView f31171q;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f31173a;

            public a(View view) {
                this.f31173a = view;
            }

            public final void a(float f9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31173a, "scaleX", f9);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.start();
            }

            public final void b(float f9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31173a, "scaleY", f9);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.start();
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                TextView textView;
                int i10;
                float f9 = z9 ? 1.05f : 1.0f;
                View view2 = this.f31173a;
                if (view2 != null && view2.getTag() != null && this.f31173a.getTag().equals("1")) {
                    f9 = z9 ? 1.02f : 1.0f;
                }
                a(f9);
                b(f9);
                if (z9) {
                    View view3 = this.f31173a;
                    if (view3 != null && view3.getTag() != null && this.f31173a.getTag().equals("1")) {
                        g.this.f31163i.setBackgroundResource(a7.e.f11925J);
                        textView = g.this.f31159e;
                        i10 = DefaultRenderer.BACKGROUND_COLOR;
                        textView.setTextColor(i10);
                        return;
                    }
                    View view4 = this.f31173a;
                    if (view4 == null || view4.getTag() == null || !this.f31173a.getTag().equals("2")) {
                        View view5 = this.f31173a;
                        if (view5 == null || view5.getTag() == null || !this.f31173a.getTag().equals("3")) {
                            View view6 = this.f31173a;
                            if (view6 == null || view6.getTag() == null || !this.f31173a.getTag().equals("4")) {
                                View view7 = this.f31173a;
                                if (view7 == null || view7.getTag() == null || !this.f31173a.getTag().equals("5")) {
                                    return;
                                } else {
                                    linearLayout = g.this.f31167m;
                                }
                            } else {
                                linearLayout = g.this.f31166l;
                            }
                        } else {
                            linearLayout = g.this.f31165k;
                        }
                    } else {
                        linearLayout = g.this.f31164j;
                    }
                    i9 = a7.e.f11925J;
                    linearLayout.setBackgroundResource(i9);
                }
                View view8 = this.f31173a;
                if (view8 != null && view8.getTag() != null && this.f31173a.getTag().equals("1")) {
                    g.this.f31163i.setBackgroundResource(a7.e.f11921I);
                    textView = g.this.f31159e;
                    i10 = -1;
                    textView.setTextColor(i10);
                    return;
                }
                View view9 = this.f31173a;
                if (view9 == null || view9.getTag() == null || !this.f31173a.getTag().equals("2")) {
                    View view10 = this.f31173a;
                    if (view10 == null || view10.getTag() == null || !this.f31173a.getTag().equals("3")) {
                        View view11 = this.f31173a;
                        if (view11 == null || view11.getTag() == null || !this.f31173a.getTag().equals("4")) {
                            View view12 = this.f31173a;
                            if (view12 == null || view12.getTag() == null || !this.f31173a.getTag().equals("5")) {
                                return;
                            } else {
                                linearLayout = g.this.f31167m;
                            }
                        } else {
                            linearLayout = g.this.f31166l;
                        }
                    } else {
                        linearLayout = g.this.f31165k;
                    }
                } else {
                    linearLayout = g.this.f31164j;
                }
                i9 = a7.e.f11921I;
                linearLayout.setBackgroundResource(i9);
            }
        }

        public g(Activity activity, Context context, LiveStreamDBHandler liveStreamDBHandler) {
            super(activity);
            this.f31156a = activity;
            this.f31157c = context;
            this.f31158d = liveStreamDBHandler;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent;
            Intent intent2;
            NewDashboardActivity newDashboardActivity;
            Intent intent3;
            if (view.getId() == a7.f.f12233O6) {
                if (!AbstractC2237a.f44526o.booleanValue() && !AbstractC2237a.f44536s.booleanValue()) {
                    m7.w.n0(this.f31157c);
                    NewDashboardActivity.this.overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
                } else {
                    newDashboardActivity = NewDashboardActivity.this;
                    intent3 = new Intent(this.f31157c, (Class<?>) AccountInfoActivity.class);
                }
            } else if (view.getId() == a7.f.Z9) {
                AbstractC2237a.f44478X = Boolean.TRUE;
                newDashboardActivity = NewDashboardActivity.this;
                intent3 = new Intent(this.f31157c, (Class<?>) SettingsActivity.class);
            } else {
                if (view.getId() != a7.f.f12223N6) {
                    if (view.getId() == a7.f.oa) {
                        NewDashboardActivity.this.d3();
                        return;
                    }
                    if (view.getId() == a7.f.f12283T6) {
                        if (AbstractC2237a.f44526o.booleanValue()) {
                            Boolean bool = Boolean.TRUE;
                            AbstractC2237a.f44488b0 = bool;
                            m7.w.n0(this.f31157c);
                            NewDashboardActivity.this.startActivity(new Intent(this.f31157c, (Class<?>) RoutingActivity.class));
                            NewDashboardActivity.this.overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
                            AbstractC2237a.f44491c0 = bool;
                        } else {
                            if (AbstractC2237a.f44529p.booleanValue() && AbstractC2237a.f44538t.booleanValue() && AbstractC2237a.f44534r.booleanValue()) {
                                AbstractC2237a.f44488b0 = Boolean.TRUE;
                                m7.w.n0(this.f31157c);
                                intent = new Intent(this.f31157c, (Class<?>) RoutingActivity.class);
                            } else {
                                if (AbstractC2237a.f44529p.booleanValue() && AbstractC2237a.f44532q.booleanValue()) {
                                    AbstractC2237a.f44488b0 = Boolean.TRUE;
                                    m7.w.n0(this.f31157c);
                                    intent = new Intent(this.f31157c, (Class<?>) RoutingActivity.class);
                                }
                                if (AbstractC2237a.f44532q.booleanValue() && AbstractC2237a.f44534r.booleanValue()) {
                                    AbstractC2237a.f44488b0 = Boolean.TRUE;
                                    m7.w.n0(this.f31157c);
                                    this.f31157c.startActivity(new Intent(this.f31157c, (Class<?>) RoutingActivity.class));
                                    NewDashboardActivity.this.finish();
                                }
                                if (AbstractC2237a.f44529p.booleanValue() && !AbstractC2237a.f44534r.booleanValue()) {
                                    if (AbstractC2237a.f44529p.booleanValue()) {
                                        intent2 = new Intent(this.f31157c, (Class<?>) LoginActivityOneStream.class);
                                    } else if (AbstractC2237a.f44532q.booleanValue()) {
                                        intent2 = new Intent(this.f31157c, (Class<?>) LoginActivity.class);
                                    } else if (!AbstractC2237a.f44534r.booleanValue()) {
                                        return;
                                    } else {
                                        intent2 = new Intent(this.f31157c, (Class<?>) LoginM3uActivity.class);
                                    }
                                    this.f31157c.startActivity(intent2);
                                    return;
                                }
                                AbstractC2237a.f44488b0 = Boolean.TRUE;
                                m7.w.n0(this.f31157c);
                                this.f31157c.startActivity(new Intent(this.f31157c, (Class<?>) RoutingActivity.class));
                            }
                            this.f31157c.startActivity(intent);
                            NewDashboardActivity.this.finish();
                            if (AbstractC2237a.f44532q.booleanValue()) {
                                AbstractC2237a.f44488b0 = Boolean.TRUE;
                                m7.w.n0(this.f31157c);
                                this.f31157c.startActivity(new Intent(this.f31157c, (Class<?>) RoutingActivity.class));
                                NewDashboardActivity.this.finish();
                            }
                            if (AbstractC2237a.f44529p.booleanValue()) {
                            }
                            AbstractC2237a.f44488b0 = Boolean.TRUE;
                            m7.w.n0(this.f31157c);
                            this.f31157c.startActivity(new Intent(this.f31157c, (Class<?>) RoutingActivity.class));
                        }
                        NewDashboardActivity.this.finish();
                        return;
                    }
                    return;
                }
                newDashboardActivity = NewDashboardActivity.this;
                intent3 = new Intent(this.f31157c, (Class<?>) AccountInfoActivity.class);
            }
            newDashboardActivity.startActivity(intent3);
            NewDashboardActivity.this.overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            View view;
            Animation animation;
            Animation animation2;
            Animation animation3;
            Animation animation4;
            Animation animation5;
            super.onCreate(bundle);
            setContentView(NewDashboardActivity.this.f31067W0.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12664K1 : a7.g.f12658J1);
            this.f31161g = (RelativeLayout) findViewById(a7.f.f12243P6);
            this.f31168n = (ShimmerRecyclerView) findViewById(a7.f.fg);
            this.f31162h = (LinearLayout) findViewById(a7.f.f12103B6);
            this.f31163i = (LinearLayout) findViewById(a7.f.f12233O6);
            this.f31164j = (LinearLayout) findViewById(a7.f.Z9);
            this.f31165k = (LinearLayout) findViewById(a7.f.f12223N6);
            this.f31166l = (LinearLayout) findViewById(a7.f.oa);
            this.f31167m = (LinearLayout) findViewById(a7.f.f12283T6);
            this.f31160f = (TextView) findViewById(a7.f.Pb);
            this.f31171q = (ImageView) findViewById(a7.f.Og);
            try {
                NewDashboardActivity.this.f31128t1 = this.f31157c.getResources().getIdentifier("@drawable/box_" + (NewDashboardActivity.this.p2() + 1), null, this.f31157c.getPackageName());
                this.f31171q.setImageDrawable(E.b.getDrawable(this.f31157c, NewDashboardActivity.this.f31128t1));
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            this.f31168n.setHasFixedSize(true);
            this.f31168n.setLayoutManager(new LinearLayoutManager(this.f31157c));
            this.f31168n.H1();
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f31157c, a7.b.f11823a);
            this.f31169o = animationLoadAnimation;
            animationLoadAnimation.setInterpolator(new LinearInterpolator());
            this.f31169o.setRepeatCount(-1);
            this.f31169o.setDuration(500L);
            this.f31170p = AnimationUtils.loadAnimation(this.f31157c, a7.b.f11828f);
            LinearLayout linearLayout = this.f31164j;
            if (linearLayout != null && (animation5 = this.f31169o) != null) {
                linearLayout.startAnimation(animation5);
            }
            LinearLayout linearLayout2 = this.f31165k;
            if (linearLayout2 != null && (animation4 = this.f31169o) != null) {
                linearLayout2.startAnimation(animation4);
            }
            LinearLayout linearLayout3 = this.f31166l;
            if (linearLayout3 != null && (animation3 = this.f31169o) != null) {
                linearLayout3.startAnimation(animation3);
            }
            LinearLayout linearLayout4 = this.f31167m;
            if (linearLayout4 != null && (animation2 = this.f31169o) != null) {
                linearLayout4.startAnimation(animation2);
            }
            ShimmerRecyclerView shimmerRecyclerView = this.f31168n;
            if (shimmerRecyclerView != null) {
                shimmerRecyclerView.E1();
            }
            ShimmerRecyclerView shimmerRecyclerView2 = this.f31168n;
            if (shimmerRecyclerView2 != null && (animation = this.f31170p) != null) {
                shimmerRecyclerView2.startAnimation(animation);
            }
            if (AbstractC2237a.f44475V0.booleanValue()) {
                List listA = AnnouncementsSBPSingleton.b().a();
                if (listA == null || listA.size() <= 0) {
                    this.f31168n.setVisibility(8);
                    TextView textView = this.f31160f;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                } else {
                    this.f31168n.setHasFixedSize(true);
                    NewDashboardActivity newDashboardActivity = NewDashboardActivity.this;
                    newDashboardActivity.f31062U1 = new DashboardSBPAnnouncementAdapter(listA, newDashboardActivity);
                    this.f31168n.setAdapter(NewDashboardActivity.this.f31062U1);
                }
            } else {
                this.f31160f.setVisibility(8);
            }
            this.f31163i.setOnClickListener(this);
            this.f31164j.setOnClickListener(this);
            this.f31165k.setOnClickListener(this);
            this.f31166l.setOnClickListener(this);
            this.f31167m.setOnClickListener(this);
            this.f31159e = (TextView) findViewById(a7.f.sh);
            if (AbstractC2237a.f44536s.booleanValue()) {
                this.f31163i.setVisibility(0);
                this.f31161g.setVisibility(8);
                view = this.f31162h;
            } else {
                this.f31162h.setVisibility(8);
                this.f31163i.setVisibility(8);
                view = this.f31161g;
            }
            view.setVisibility(0);
            this.f31161g.requestFocus();
            this.f31159e.setText(this.f31157c.getSharedPreferences("loginprefsmultiuser", 0).getString("name", ""));
            LinearLayout linearLayout5 = this.f31163i;
            linearLayout5.setOnFocusChangeListener(new a(linearLayout5));
            LinearLayout linearLayout6 = this.f31164j;
            linearLayout6.setOnFocusChangeListener(new a(linearLayout6));
            LinearLayout linearLayout7 = this.f31165k;
            linearLayout7.setOnFocusChangeListener(new a(linearLayout7));
            LinearLayout linearLayout8 = this.f31166l;
            linearLayout8.setOnFocusChangeListener(new a(linearLayout8));
            LinearLayout linearLayout9 = this.f31167m;
            linearLayout9.setOnFocusChangeListener(new a(linearLayout9));
        }

        @Override // android.app.Dialog, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i9, KeyEvent keyEvent) {
            View view;
            if (i9 != 21) {
                return super.onKeyDown(i9, keyEvent);
            }
            if (getCurrentFocus() == null || getCurrentFocus().getTag() == null) {
                return false;
            }
            if (SharepreferenceDBHandler.getSelectedLanguage(this.f31157c).equalsIgnoreCase("Arabic")) {
                if (getCurrentFocus().getTag().equals("3")) {
                    dismiss();
                    if (NewDashboardActivity.this.f31009D.getVisibility() != 0) {
                        if (NewDashboardActivity.this.f31096j.getVisibility() != 0) {
                            if (NewDashboardActivity.this.f31093i.getVisibility() != 0) {
                                if (NewDashboardActivity.this.f31090h.getVisibility() != 0) {
                                    return false;
                                }
                                view = NewDashboardActivity.this.f31090h;
                            }
                            view = NewDashboardActivity.this.f31093i;
                        }
                        view = NewDashboardActivity.this.f31096j;
                    }
                    view = NewDashboardActivity.this.f31009D;
                } else {
                    if (!getCurrentFocus().getTag().equals("5")) {
                        return false;
                    }
                    dismiss();
                    if (NewDashboardActivity.this.f31096j.getVisibility() != 0) {
                        if (NewDashboardActivity.this.f31093i.getVisibility() != 0) {
                            if (NewDashboardActivity.this.f31090h.getVisibility() != 0) {
                                return false;
                            }
                            view = NewDashboardActivity.this.f31090h;
                        }
                        view = NewDashboardActivity.this.f31093i;
                    }
                    view = NewDashboardActivity.this.f31096j;
                }
            } else if (getCurrentFocus().getTag().equals("1")) {
                dismiss();
                if (NewDashboardActivity.this.f31009D.getVisibility() != 0) {
                    if (NewDashboardActivity.this.f31096j.getVisibility() != 0) {
                        if (NewDashboardActivity.this.f31093i.getVisibility() != 0) {
                            if (NewDashboardActivity.this.f31090h.getVisibility() != 0) {
                                return false;
                            }
                            view = NewDashboardActivity.this.f31090h;
                        }
                        view = NewDashboardActivity.this.f31093i;
                    }
                    view = NewDashboardActivity.this.f31096j;
                }
                view = NewDashboardActivity.this.f31009D;
            } else {
                if (!getCurrentFocus().getTag().equals("2") && !getCurrentFocus().getTag().equals("4") && !getCurrentFocus().getTag().equals("10")) {
                    return false;
                }
                dismiss();
                if (NewDashboardActivity.this.f31096j.getVisibility() != 0) {
                    if (NewDashboardActivity.this.f31093i.getVisibility() != 0) {
                        if (NewDashboardActivity.this.f31090h.getVisibility() != 0) {
                            return false;
                        }
                        view = NewDashboardActivity.this.f31090h;
                    }
                    view = NewDashboardActivity.this.f31093i;
                }
                view = NewDashboardActivity.this.f31096j;
            }
            view.requestFocus();
            return false;
        }
    }

    public class h extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f31175a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NewDashboardActivity.this.f31070X0.c(NewDashboardActivity.this.f31073Y0, NewDashboardActivity.this.f31075Z0);
            }
        }

        public h(Context context, List list) {
            this.f31175a = list;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            if (NewDashboardActivity.this.f31013E0 != null) {
                NewDashboardActivity.this.f31013E0.makeEmptyLiveCategory();
            }
            publishProgress(0);
            return NewDashboardActivity.this.f31013E0 != null ? Boolean.valueOf(NewDashboardActivity.this.f31013E0.addLiveCategories(this.f31175a)) : Boolean.FALSE;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (NewDashboardActivity.this.f31004B0 == null || !bool.booleanValue()) {
                NewDashboardActivity.this.I2();
                return;
            }
            if (NewDashboardActivity.this.f31073Y0 == null || NewDashboardActivity.this.f31073Y0.isEmpty() || NewDashboardActivity.this.f31075Z0 == null || NewDashboardActivity.this.f31075Z0.isEmpty()) {
                return;
            }
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(NewDashboardActivity.this.f31039N, "progress", 100, 50);
            objectAnimatorOfInt.setDuration(500L);
            objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
            objectAnimatorOfInt.start();
            new Handler().postDelayed(new a(), 500L);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    public class i extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f31178a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (NewDashboardActivity.this.f31051R.isFocused()) {
                    NewDashboardActivity.this.f31090h.requestFocus();
                }
                NewDashboardActivity.this.f31051R.setVisibility(8);
                NewDashboardActivity.this.f31039N.setVisibility(8);
                NewDashboardActivity.this.f31112o0.setVisibility(8);
                NewDashboardActivity.this.f31115p0.setVisibility(8);
                NewDashboardActivity.this.f31118q0.setVisibility(8);
                NewDashboardActivity.this.f31054S.setVisibility(0);
                NewDashboardActivity.this.f31057T.setText(NewDashboardActivity.this.f31004B0.getResources().getString(a7.j.f13126S2) + " " + m7.w.R0(1000L));
                NewDashboardActivity.this.x2();
                if (NewDashboardActivity.this.f31107m1) {
                    NewDashboardActivity.this.f31107m1 = false;
                    NewDashboardActivity newDashboardActivity = NewDashboardActivity.this;
                    newDashboardActivity.B2(newDashboardActivity.f31004B0.getResources().getString(a7.j.f13335n8));
                } else if (NewDashboardActivity.this.f31110n1) {
                    NewDashboardActivity.this.f31110n1 = false;
                    NewDashboardActivity newDashboardActivity2 = NewDashboardActivity.this;
                    newDashboardActivity2.C2(newDashboardActivity2.f31004B0.getResources().getString(a7.j.f13335n8));
                }
            }
        }

        public i(Context context, List list) {
            this.f31178a = list;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            ArrayList<FavouriteDBModel> allFavouritesStreamIDs;
            if (NewDashboardActivity.this.f31013E0 != null) {
                NewDashboardActivity.this.f31013E0.makeEmptyLiveStreams();
            }
            publishProgress(0);
            if (NewDashboardActivity.this.f31013E0 == null) {
                return Boolean.FALSE;
            }
            try {
                if (NewDashboardActivity.this.f31013E0.addAllAvailableChannel(this.f31178a)) {
                    ArrayList arrayList = new ArrayList();
                    if (NewDashboardActivity.this.f31049Q0 != null && (allFavouritesStreamIDs = NewDashboardActivity.this.f31049Q0.getAllFavouritesStreamIDs("live")) != null && allFavouritesStreamIDs.size() > 0) {
                        ArrayList<LiveStreamsDBModel> allLiveMoviesStreamIDs = NewDashboardActivity.this.f31013E0.getAllLiveMoviesStreamIDs("live");
                        for (int i9 = 0; i9 < allFavouritesStreamIDs.size(); i9++) {
                            int streamID = allFavouritesStreamIDs.get(i9).getStreamID();
                            if (allLiveMoviesStreamIDs != null && allLiveMoviesStreamIDs.size() > 0) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= allLiveMoviesStreamIDs.size()) {
                                        arrayList.add(String.valueOf(streamID));
                                        break;
                                    }
                                    if (allLiveMoviesStreamIDs.get(i10).getStreamId().equals(String.valueOf(streamID))) {
                                        break;
                                    }
                                    i10++;
                                }
                            }
                        }
                    }
                    NewDashboardActivity.this.f31013E0.deleteChannelsHistoryDuplicate();
                    if (arrayList.size() > 0 && NewDashboardActivity.this.f31049Q0 != null) {
                        NewDashboardActivity.this.f31049Q0.deleteFavAfterUpdate(TextUtils.join(",", arrayList));
                    }
                }
            } catch (Exception unused) {
            }
            return Boolean.TRUE;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (NewDashboardActivity.this.f31004B0 == null || !bool.booleanValue()) {
                NewDashboardActivity.this.I2();
                return;
            }
            NewDashboardActivity.this.f31077b1 = false;
            if (NewDashboardActivity.this.f31013E0 != null) {
                NewDashboardActivity.this.f31013E0.updateImportStatus("live", "1");
            }
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(NewDashboardActivity.this.f31039N, "progress", 50, 0);
            objectAnimatorOfInt.setDuration(1000L);
            objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
            objectAnimatorOfInt.start();
            new Handler(Looper.getMainLooper()).postDelayed(new a(), 1000L);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    public class j extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f31181a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (NewDashboardActivity.this.f31097j0.isFocused()) {
                    NewDashboardActivity.this.f31096j.requestFocus();
                }
                NewDashboardActivity.this.f31097j0.setVisibility(8);
                NewDashboardActivity.this.f31085f0.setVisibility(8);
                NewDashboardActivity.this.f31100k0.setVisibility(0);
                NewDashboardActivity.this.f31103l0.setText(NewDashboardActivity.this.f31004B0.getResources().getString(a7.j.f13126S2) + " " + m7.w.R0(1000L));
                NewDashboardActivity.this.x2();
            }
        }

        public j(Context context, List list) {
            this.f31181a = list;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            ArrayList<GetEpisdoeDetailsCallback> allSeriesContinueWatchingSeriesIDs;
            ArrayList<FavouriteDBModel> allFavouritesStreamIDs;
            if (NewDashboardActivity.this.f31013E0 != null) {
                NewDashboardActivity.this.f31013E0.makeEmptySeriesStreams();
            }
            publishProgress(0);
            if (NewDashboardActivity.this.f31013E0 == null) {
                return Boolean.FALSE;
            }
            try {
                if (NewDashboardActivity.this.f31013E0.addAllSeriesStreams((ArrayList) this.f31181a)) {
                    ArrayList arrayList = new ArrayList();
                    if (NewDashboardActivity.this.f31049Q0 != null && (allFavouritesStreamIDs = NewDashboardActivity.this.f31049Q0.getAllFavouritesStreamIDs("series")) != null && allFavouritesStreamIDs.size() > 0) {
                        ArrayList<SeriesDBModel> allSeriesIDs = NewDashboardActivity.this.f31013E0.getAllSeriesIDs();
                        for (int i9 = 0; i9 < allFavouritesStreamIDs.size(); i9++) {
                            int streamID = allFavouritesStreamIDs.get(i9).getStreamID();
                            if (allSeriesIDs != null && allSeriesIDs.size() > 0) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= allSeriesIDs.size()) {
                                        arrayList.add(String.valueOf(streamID));
                                        break;
                                    }
                                    if (allSeriesIDs.get(i10).getseriesID() == streamID) {
                                        break;
                                    }
                                    i10++;
                                }
                            }
                        }
                    }
                    if (arrayList.size() > 0 && NewDashboardActivity.this.f31049Q0 != null) {
                        NewDashboardActivity.this.f31049Q0.deleteFavAfterUpdate(TextUtils.join(",", arrayList));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (NewDashboardActivity.this.f31116p1 != null && (allSeriesContinueWatchingSeriesIDs = NewDashboardActivity.this.f31116p1.getAllSeriesContinueWatchingSeriesIDs()) != null && allSeriesContinueWatchingSeriesIDs.size() > 0) {
                        ArrayList<SeriesDBModel> allSeriesIDs2 = NewDashboardActivity.this.f31013E0.getAllSeriesIDs();
                        for (int i11 = 0; i11 < allSeriesContinueWatchingSeriesIDs.size(); i11++) {
                            String seriesId = allSeriesContinueWatchingSeriesIDs.get(i11).getSeriesId();
                            if (allSeriesIDs2 != null && allSeriesIDs2.size() > 0) {
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= allSeriesIDs2.size()) {
                                        arrayList2.add(String.valueOf(seriesId));
                                        break;
                                    }
                                    if (String.valueOf(allSeriesIDs2.get(i12).getseriesID()).equals(seriesId)) {
                                        break;
                                    }
                                    i12++;
                                }
                            }
                        }
                    }
                    if (arrayList2.size() > 0 && NewDashboardActivity.this.f31116p1 != null) {
                        NewDashboardActivity.this.f31116p1.deleteContinueWatchingAfterUpdate(TextUtils.join(",", arrayList2));
                    }
                }
            } catch (Exception unused) {
            }
            return Boolean.TRUE;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (NewDashboardActivity.this.f31004B0 == null || !bool.booleanValue()) {
                NewDashboardActivity.this.R2();
                return;
            }
            NewDashboardActivity.this.f31080d1 = false;
            if (NewDashboardActivity.this.f31013E0 != null) {
                NewDashboardActivity.this.f31013E0.updateImportStatus("series", "1");
            }
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(NewDashboardActivity.this.f31085f0, "progress", 50, 0);
            objectAnimatorOfInt.setDuration(1000L);
            objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
            objectAnimatorOfInt.start();
            new Handler(Looper.getMainLooper()).postDelayed(new a(), 1000L);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    public class k extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f31184a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NewDashboardActivity.this.f31070X0.d(NewDashboardActivity.this.f31073Y0, NewDashboardActivity.this.f31075Z0);
            }
        }

        public k(Context context, List list) {
            this.f31184a = list;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            if (NewDashboardActivity.this.f31013E0 != null) {
                NewDashboardActivity.this.f31013E0.makeEmptySeriesCategories();
            }
            publishProgress(0);
            return NewDashboardActivity.this.f31013E0 != null ? Boolean.valueOf(NewDashboardActivity.this.f31013E0.addSeriesCategories((ArrayList) this.f31184a)) : Boolean.FALSE;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (NewDashboardActivity.this.f31004B0 == null || !bool.booleanValue()) {
                NewDashboardActivity.this.R2();
                return;
            }
            if (NewDashboardActivity.this.f31073Y0 == null || NewDashboardActivity.this.f31073Y0.isEmpty() || NewDashboardActivity.this.f31075Z0 == null || NewDashboardActivity.this.f31075Z0.isEmpty()) {
                return;
            }
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(NewDashboardActivity.this.f31085f0, "progress", 100, 50);
            objectAnimatorOfInt.setDuration(500L);
            objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
            objectAnimatorOfInt.start();
            new Handler().postDelayed(new a(), 500L);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    public class l extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f31187a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NewDashboardActivity.this.f31070X0.g(NewDashboardActivity.this.f31073Y0, NewDashboardActivity.this.f31075Z0);
            }
        }

        public l(Context context, List list) {
            this.f31187a = list;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            if (NewDashboardActivity.this.f31013E0 != null) {
                NewDashboardActivity.this.f31013E0.makeEmptyMovieCategory();
            }
            publishProgress(0);
            return NewDashboardActivity.this.f31013E0 != null ? Boolean.valueOf(NewDashboardActivity.this.f31013E0.addMovieCategories(this.f31187a)) : Boolean.FALSE;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (NewDashboardActivity.this.f31004B0 == null || !bool.booleanValue()) {
                NewDashboardActivity.this.P2();
                return;
            }
            if (NewDashboardActivity.this.f31073Y0 == null || NewDashboardActivity.this.f31073Y0.isEmpty() || NewDashboardActivity.this.f31075Z0 == null || NewDashboardActivity.this.f31075Z0.isEmpty()) {
                return;
            }
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(NewDashboardActivity.this.f31060U, "progress", 100, 50);
            objectAnimatorOfInt.setDuration(500L);
            objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
            objectAnimatorOfInt.start();
            new Handler().postDelayed(new a(), 500L);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    public class m extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f31190a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (NewDashboardActivity.this.f31072Y.isFocused()) {
                    NewDashboardActivity.this.f31093i.requestFocus();
                }
                NewDashboardActivity.this.f31072Y.setVisibility(8);
                NewDashboardActivity.this.f31060U.setVisibility(8);
                NewDashboardActivity.this.f31074Z.setVisibility(0);
                NewDashboardActivity.this.f31082e0.setText(NewDashboardActivity.this.f31004B0.getResources().getString(a7.j.f13126S2) + " " + m7.w.R0(1000L));
                NewDashboardActivity.this.x2();
                if (NewDashboardActivity.this.f31110n1) {
                    NewDashboardActivity.this.f31110n1 = false;
                    NewDashboardActivity newDashboardActivity = NewDashboardActivity.this;
                    newDashboardActivity.C2(newDashboardActivity.f31004B0.getResources().getString(a7.j.f13335n8));
                }
            }
        }

        public m(Context context, List list) {
            this.f31190a = list;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            ArrayList<LiveStreamsDBModel> allMoviesContinueWatchingStreamIDs;
            ArrayList<FavouriteDBModel> allFavouritesStreamIDs;
            if (NewDashboardActivity.this.f31013E0 != null) {
                NewDashboardActivity.this.f31013E0.makeEmptyVODStreams();
            }
            publishProgress(0);
            if (NewDashboardActivity.this.f31013E0 == null) {
                return Boolean.FALSE;
            }
            try {
                if (NewDashboardActivity.this.f31013E0.addAllAvailableMovies(this.f31190a)) {
                    ArrayList arrayList = new ArrayList();
                    if (NewDashboardActivity.this.f31049Q0 != null && (allFavouritesStreamIDs = NewDashboardActivity.this.f31049Q0.getAllFavouritesStreamIDs("vod")) != null && allFavouritesStreamIDs.size() > 0) {
                        ArrayList<LiveStreamsDBModel> allLiveMoviesStreamIDs = NewDashboardActivity.this.f31013E0.getAllLiveMoviesStreamIDs("movie");
                        for (int i9 = 0; i9 < allFavouritesStreamIDs.size(); i9++) {
                            int streamID = allFavouritesStreamIDs.get(i9).getStreamID();
                            if (allLiveMoviesStreamIDs != null && allLiveMoviesStreamIDs.size() > 0) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= allLiveMoviesStreamIDs.size()) {
                                        arrayList.add(String.valueOf(streamID));
                                        break;
                                    }
                                    if (allLiveMoviesStreamIDs.get(i10).getStreamId().equals(String.valueOf(streamID))) {
                                        break;
                                    }
                                    i10++;
                                }
                            }
                        }
                    }
                    if (arrayList.size() > 0 && NewDashboardActivity.this.f31049Q0 != null) {
                        NewDashboardActivity.this.f31049Q0.deleteFavAfterUpdate(TextUtils.join(",", arrayList));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (NewDashboardActivity.this.f31113o1 != null && (allMoviesContinueWatchingStreamIDs = NewDashboardActivity.this.f31113o1.getAllMoviesContinueWatchingStreamIDs()) != null && allMoviesContinueWatchingStreamIDs.size() > 0) {
                        ArrayList<LiveStreamsDBModel> allLiveMoviesStreamIDs2 = NewDashboardActivity.this.f31013E0.getAllLiveMoviesStreamIDs("movie");
                        for (int i11 = 0; i11 < allMoviesContinueWatchingStreamIDs.size(); i11++) {
                            String streamId = allMoviesContinueWatchingStreamIDs.get(i11).getStreamId();
                            if (allLiveMoviesStreamIDs2 != null && allLiveMoviesStreamIDs2.size() > 0) {
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= allLiveMoviesStreamIDs2.size()) {
                                        arrayList2.add(String.valueOf(streamId));
                                        break;
                                    }
                                    if (allLiveMoviesStreamIDs2.get(i12).getStreamId().equals(String.valueOf(streamId))) {
                                        break;
                                    }
                                    i12++;
                                }
                            }
                        }
                    }
                    if (arrayList2.size() > 0 && NewDashboardActivity.this.f31113o1 != null) {
                        NewDashboardActivity.this.f31113o1.deleteContinueWatchingAfterUpdate(TextUtils.join(",", arrayList2));
                    }
                }
            } catch (Exception unused) {
            }
            return Boolean.TRUE;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (NewDashboardActivity.this.f31004B0 == null || !bool.booleanValue()) {
                NewDashboardActivity.this.P2();
                return;
            }
            NewDashboardActivity.this.f31078c1 = false;
            if (NewDashboardActivity.this.f31013E0 != null) {
                NewDashboardActivity.this.f31013E0.updateImportStatus("movies", "1");
            }
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(NewDashboardActivity.this.f31060U, "progress", 50, 0);
            objectAnimatorOfInt.setDuration(1000L);
            objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
            objectAnimatorOfInt.start();
            new Handler(Looper.getMainLooper()).postDelayed(new a(), 1000L);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    public class n implements View.OnClickListener {
        public n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!G.k()) {
                NewDashboardActivity.this.v1();
                return;
            }
            NewDashboardActivity.this.n2();
            NewDashboardActivity newDashboardActivity = NewDashboardActivity.this;
            newDashboardActivity.f31036M.setImageDrawable(newDashboardActivity.getResources().getDrawable(a7.e.f11941N));
        }
    }

    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageView;
            Resources resources;
            int i9;
            if (G.k()) {
                NewDashboardActivity newDashboardActivity = NewDashboardActivity.this;
                imageView = newDashboardActivity.f31036M;
                resources = newDashboardActivity.getResources();
                i9 = a7.e.f11905E;
            } else {
                NewDashboardActivity newDashboardActivity2 = NewDashboardActivity.this;
                imageView = newDashboardActivity2.f31036M;
                resources = newDashboardActivity2.getResources();
                i9 = a7.e.f11941N;
            }
            imageView.setImageDrawable(resources.getDrawable(i9));
        }
    }

    public class p implements ServiceConnection {
        public p() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InterfaceC1725h interfaceC1725hA = InterfaceC1725h.a.A(iBinder);
            if (interfaceC1725hA != null) {
                try {
                    interfaceC1725hA.a(false);
                } catch (RemoteException e9) {
                    G.r(e9);
                }
            }
            NewDashboardActivity.this.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public class q implements Runnable {
        public q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NewDashboardActivity.this.f31070X0.d(NewDashboardActivity.this.f31073Y0, NewDashboardActivity.this.f31075Z0);
        }
    }

    public class r implements Runnable {
        public r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NewDashboardActivity.this.f31070X0.c(NewDashboardActivity.this.f31073Y0, NewDashboardActivity.this.f31075Z0);
        }
    }

    public class s implements Runnable {
        public s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NewDashboardActivity.this.f31070X0.g(NewDashboardActivity.this.f31073Y0, NewDashboardActivity.this.f31075Z0);
        }
    }

    public class t implements Runnable {
        public t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = m7.w.R(NewDashboardActivity.this.f31004B0);
                String strB = m7.w.B(string);
                TextView textView = NewDashboardActivity.this.f31126t;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = NewDashboardActivity.this.f31123s;
                if (textView2 != null) {
                    textView2.setText(strB);
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public class u implements DialogInterface.OnDismissListener {
        public u() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    public class v implements Runnable {
        public v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    try {
                        try {
                            NewDashboardActivity.this.o2();
                            Thread.sleep(1000L);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            }
        }
    }

    public class w extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f31202a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f31203c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f31204d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f31205e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public TextView f31206f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public LinearLayout f31207g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public LinearLayout f31208h;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f31210a;

            public a(View view) {
                this.f31210a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f31210a;
                    if (view2 == null || view2.getTag() == null || !this.f31210a.getTag().equals("1")) {
                        View view3 = this.f31210a;
                        if (view3 == null || view3.getTag() == null || !this.f31210a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = w.this.f31208h;
                        }
                    } else {
                        linearLayout = w.this.f31207g;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f31210a;
                    if (view4 == null || view4.getTag() == null || !this.f31210a.getTag().equals("1")) {
                        View view5 = this.f31210a;
                        if (view5 == null || view5.getTag() == null || !this.f31210a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = w.this.f31208h;
                        }
                    } else {
                        linearLayout = w.this.f31207g;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        public w(Activity activity) {
            super(activity);
            this.f31202a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getId() == a7.f.f12544u1) {
                try {
                    NewDashboardActivity newDashboardActivity = NewDashboardActivity.this;
                    newDashboardActivity.A2(newDashboardActivity.getResources().getString(a7.j.f13268h1));
                } catch (Exception unused) {
                }
            } else if (view.getId() == a7.f.f12412h1) {
                dismiss();
            }
            dismiss();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(NewDashboardActivity.this.f31067W0.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12768b2 : a7.g.f12761a2);
            this.f31203c = (TextView) findViewById(a7.f.f12544u1);
            this.f31204d = (TextView) findViewById(a7.f.f12412h1);
            this.f31207g = (LinearLayout) findViewById(a7.f.V8);
            this.f31208h = (LinearLayout) findViewById(a7.f.Ia);
            this.f31206f = (TextView) findViewById(a7.f.fm);
            this.f31205e = (TextView) findViewById(a7.f.um);
            this.f31206f.setText(NewDashboardActivity.this.getResources().getString(a7.j.f13172X2));
            this.f31205e.setText(NewDashboardActivity.this.getResources().getString(a7.j.f13164W3));
            this.f31203c.setOnClickListener(this);
            this.f31204d.setOnClickListener(this);
            TextView textView = this.f31203c;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f31204d;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    public class x extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f31212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ProgressDialog f31213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f31214c;

        public x(Context context, String str) {
            this.f31212a = context;
            this.f31214c = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0124  */
        /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r15v2 */
        /* JADX WARN: Type inference failed for: r15v3 */
        /* JADX WARN: Type inference failed for: r15v4, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r15v5, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r15v7, types: [java.net.HttpURLConnection, java.net.URLConnection] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Boolean doInBackground(java.lang.String... r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 296
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity.x.doInBackground(java.lang.String[]):java.lang.Boolean");
        }

        public final /* synthetic */ void c(DialogInterface dialogInterface) {
            cancel(true);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            this.f31213b.dismiss();
            if (bool.booleanValue()) {
                NewDashboardActivity newDashboardActivity = NewDashboardActivity.this;
                newDashboardActivity.D2(newDashboardActivity);
            } else {
                Toast.makeText(NewDashboardActivity.this.getApplicationContext(), "Downloading failed. Please try again.", 0).show();
                Log.e("DownloadTask", "Download failed or canceled.");
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
            super.onProgressUpdate(numArr);
            this.f31213b.setMessage("Downloaded " + numArr[0] + "%");
        }

        @Override // android.os.AsyncTask
        public void onCancelled() {
            super.onCancelled();
            this.f31213b.dismiss();
            Log.e("DownloadTask", "Download canceled.");
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            ProgressDialog progressDialog = new ProgressDialog(this.f31212a);
            this.f31213b = progressDialog;
            progressDialog.setMessage("Downloading 0%");
            this.f31213b.setCancelable(false);
            this.f31213b.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: p7.h0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f46650a.c(dialogInterface);
                }
            });
            this.f31213b.show();
        }
    }

    public class y implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f31216a;

        public y(View view) {
            this.f31216a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31216a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31216a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31216a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:115:0x02cd  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x01a9  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01e7  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x028a  */
        @Override // android.view.View.OnFocusChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onFocusChange(android.view.View r12, boolean r13) {
            /*
                Method dump skipped, instruction units count: 876
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity.y.onFocusChange(android.view.View, boolean):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D2(Activity activity) {
        Intent intent;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                intent = new Intent("android.intent.action.INSTALL_PACKAGE");
                intent.setDataAndType(FileProvider.f(activity, "com.nst.iptvsmarterstvbox.ApkProvider", new File(activity.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "IPTVSmartersPro.apk")), "application/vnd.android.package-archive");
                intent.setFlags(1);
            } else {
                intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(Uri.fromFile(new File(activity.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "IPTVSmartersPro.apk")), "application/vnd.android.package-archive");
                intent.setFlags(67108864);
            }
            activity.startActivity(intent);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean F2() {
        return new File(this.f31004B0.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "IPTVSmartersPro.apk").exists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean G2() {
        return new File(this.f31004B0.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "IPTVSmartersPro.apk").delete();
    }

    public static boolean H2(int i9, int i10, int i11) {
        return i9 >= i10 && i9 <= i11;
    }

    private void J2() {
        d dVar = new d(DashBoardListssingleton.b().a());
        this.f31044O1 = dVar;
        dVar.run();
    }

    private void i2() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private void k2() {
        if (AbstractC2237a.f44475V0.booleanValue()) {
            if (this.f31067W0.k() != null && this.f31067W0.n() != null && this.f31067W0.l() != 0) {
                String str = "";
                if (!this.f31067W0.k().equals("") && !this.f31067W0.n().equals("")) {
                    String strJ = this.f31067W0.j();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
                    Date date = new Date();
                    if (strJ != null) {
                        try {
                            if (strJ.length() > 0) {
                                date.setTime(Long.parseLong(strJ));
                                str = simpleDateFormat.format(date);
                            }
                        } catch (Exception e9) {
                            e9.printStackTrace();
                        }
                    }
                    long jR2 = r2(simpleDateFormat, str, m7.w.q());
                    if (this.f31067W0.m().booleanValue() && jR2 >= 7) {
                        this.f31067W0.P();
                        this.f31089g1 = m7.w.I(this.f31004B0);
                        this.f31092h1 = m7.w.E();
                        w1();
                        this.f31098j1.g(this.f31067W0.k(), this.f31067W0.n(), this.f31092h1, this.f31089g1, m7.w.o0(this.f31067W0.k() + "*Njh0&$@ZH098GP-Vu6HilnbLo63-" + AbstractC1232b.f17695b + "-"));
                    }
                    LinearLayout linearLayout = this.f31124s0;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                    }
                    TextView textView = this.f31121r0;
                    if (textView != null) {
                        textView.setText(getResources().getString(a7.j.f13127S3));
                    }
                    ImageView imageView = this.f31127t0;
                    if (imageView != null) {
                        imageView.setImageResource(a7.e.f11982a);
                    }
                }
            }
            LinearLayout linearLayout2 = this.f31124s0;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            this.f31133v0.setVisibility(0);
            this.f31131u1.setVisibility(0);
            TextView textView2 = this.f31121r0;
            if (textView2 != null) {
                textView2.setText(getResources().getString(a7.j.f13187Z));
            }
            ImageView imageView2 = this.f31127t0;
            if (imageView2 != null) {
                imageView2.setImageResource(a7.e.f11902D0);
                return;
            }
            return;
        }
        this.f31131u1.setVisibility(8);
        this.f31133v0.setVisibility(8);
    }

    public static ProgressDialog l2(Context context) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        try {
            progressDialog.show();
        } catch (Exception unused) {
        }
        progressDialog.setCancelable(false);
        progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        progressDialog.setContentView(a7.g.f12791e4);
        return progressDialog;
    }

    public static long r2(SimpleDateFormat simpleDateFormat, String str, String str2) {
        if (str2 != null) {
            try {
                if (((str2.length() > 0) & (str != null)) && str.length() > 0) {
                    return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        return 0L;
    }

    private boolean w2(Activity activity) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 33 && i9 >= 23) {
            return E.b.checkSelfPermission(activity, "android.permission.READ_EXTERNAL_STORAGE") == 0 && E.b.checkSelfPermission(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        }
        return true;
    }

    @Override // z7.i
    public void A(String str) {
        I2();
    }

    @Override // z7.i
    public void A0(String str) {
        R2();
    }

    public final void A2(String str) {
        ProgressDialog progressDialogL2 = this.f31083e1;
        if (progressDialogL2 == null) {
            progressDialogL2 = l2(this.f31004B0);
            this.f31083e1 = progressDialogL2;
        }
        progressDialogL2.show();
        if (this.f31004B0 != null) {
            this.f31077b1 = true;
            LiveStreamDBHandler liveStreamDBHandler = this.f31013E0;
            if (liveStreamDBHandler != null) {
                liveStreamDBHandler.updateImportStatus("live", "3");
            }
            q2(str);
        }
    }

    @Override // z7.i
    public void B(List list) {
        if (list != null) {
            new j(this.f31004B0, list).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        } else {
            R2();
        }
    }

    @Override // z7.d
    public void B0(RegisterClientCallback registerClientCallback) {
    }

    public final void B2(String str) {
        ProgressDialog progressDialogL2 = this.f31083e1;
        if (progressDialogL2 == null) {
            progressDialogL2 = l2(this.f31004B0);
            this.f31083e1 = progressDialogL2;
        }
        progressDialogL2.show();
        if (this.f31004B0 != null) {
            this.f31078c1 = true;
            LiveStreamDBHandler liveStreamDBHandler = this.f31013E0;
            if (liveStreamDBHandler != null) {
                liveStreamDBHandler.updateImportStatus("movies", "3");
            }
            t2(str);
        }
    }

    public final void C2(String str) {
        ProgressDialog progressDialogL2 = this.f31083e1;
        if (progressDialogL2 == null) {
            progressDialogL2 = l2(this.f31004B0);
            this.f31083e1 = progressDialogL2;
        }
        progressDialogL2.show();
        if (this.f31004B0 != null) {
            this.f31080d1 = true;
            LiveStreamDBHandler liveStreamDBHandler = this.f31013E0;
            if (liveStreamDBHandler != null) {
                liveStreamDBHandler.updateImportStatus("series", "3");
            }
            v2(str);
        }
    }

    public final void E2() {
        new w(this).show();
    }

    public final void I2() {
        this.f31077b1 = false;
        x2();
        LiveStreamDBHandler liveStreamDBHandler = this.f31013E0;
        if (liveStreamDBHandler != null) {
            liveStreamDBHandler.updateImportStatus("live", "2");
        }
        this.f31039N.setVisibility(0);
        this.f31051R.setVisibility(0);
        this.f31042O.setImageResource(a7.e.f12043p0);
        this.f31042O.setVisibility(0);
        this.f31045P.setVisibility(8);
        this.f31048Q.setText(this.f31004B0.getResources().getString(a7.j.f13343o6));
        if (this.f31107m1) {
            this.f31107m1 = false;
            B2(this.f31004B0.getResources().getString(a7.j.f13335n8));
        } else if (this.f31110n1) {
            this.f31110n1 = false;
            C2(this.f31004B0.getResources().getString(a7.j.f13335n8));
        }
    }

    @Override // z7.d
    public void J(BillingIsPurchasedCallback billingIsPurchasedCallback) {
    }

    @Override // z7.i
    public void J0(List list) {
        String str;
        String str2;
        if (list != null) {
            new k(this.f31004B0, list).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            return;
        }
        if (this.f31004B0 == null || (str = this.f31073Y0) == null || str.isEmpty() || (str2 = this.f31075Z0) == null || str2.isEmpty()) {
            return;
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f31085f0, "progress", 100, 50);
        objectAnimatorOfInt.setDuration(500L);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.start();
        new Handler().postDelayed(new q(), 500L);
    }

    public final void K2() {
        Runnable runnable;
        List listC = Listsingleton.b().c();
        this.f31136w0.setSelected(true);
        Handler handler = this.f31032K1;
        if (handler != null && (runnable = this.f31041N1) != null) {
            handler.removeCallbacks(runnable);
        }
        e eVar = new e(listC);
        this.f31041N1 = eVar;
        eVar.run();
    }

    @Override // z7.i
    public void L(List list) {
        if (list != null) {
            new i(this.f31004B0, list).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        } else {
            I2();
        }
    }

    @Override // z7.d
    public void L0(BillingLoginClientCallback billingLoginClientCallback) {
        if (billingLoginClientCallback != null) {
            try {
                if (billingLoginClientCallback.getResult() == null || !billingLoginClientCallback.getResult().equals("success") || billingLoginClientCallback.getSc() == null) {
                    return;
                }
                if (!billingLoginClientCallback.getSc().equalsIgnoreCase(m7.w.o0("Vu6HilnbLo63*KJHGFkugu345*&^klih*" + AbstractC1232b.f17695b)) || billingLoginClientCallback.getData() == null || billingLoginClientCallback.getMessage() == null || !billingLoginClientCallback.getMessage().equals("Max Connection Reached")) {
                    return;
                }
                this.f31067W0.a();
                if (AbstractC2237a.f44526o.booleanValue()) {
                    k2();
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void L2() {
        List listC = DashBoardListssingleton.b().c();
        this.f31145z0.setSelected(true);
        c cVar = new c(listC);
        this.f31047P1 = cVar;
        cVar.run();
    }

    public final void M2() {
        this.f31090h.setOnClickListener(this);
        this.f31093i.setOnClickListener(this);
        this.f31096j.setOnClickListener(this);
        this.f31099k.setOnClickListener(this);
        this.f31102l.setOnClickListener(this);
        this.f31105m.setOnClickListener(this);
        this.f31012E.setOnClickListener(this);
        this.f31009D.setOnClickListener(this);
        this.f31015F.setOnClickListener(this);
        this.f31117q.setOnClickListener(this);
        this.f31018G.setOnClickListener(this);
        this.f31108n.setOnClickListener(this);
        this.f31124s0.setOnClickListener(this);
        this.f31054S.setOnClickListener(this);
        this.f31074Z.setOnClickListener(this);
        this.f31100k0.setOnClickListener(this);
        this.f31146z1.setOnClickListener(this);
        this.f31002A1.setOnClickListener(this);
        this.f31005B1.setOnClickListener(this);
        this.f31017F1.setOnClickListener(this);
        this.f31008C1.setOnClickListener(this);
        this.f31011D1.setOnClickListener(this);
        this.f31014E1.setOnClickListener(this);
        this.f31106m0.setOnClickListener(this);
        this.f31109n0.setOnClickListener(this);
        this.f31084f.setOnClickListener(this);
        this.f31111o.setOnClickListener(this);
        this.f31137w1.setOnClickListener(this);
        this.f31140x1.setOnClickListener(this);
    }

    @Override // z7.d
    public void N0(BillingUpdateDevicesCallback billingUpdateDevicesCallback) {
    }

    public final void N2() {
        ArrayList<DownloadedDataModel> arrayList;
        DownloadedDBHandler downloadedDBHandler;
        int idAuto;
        try {
            this.f31079d = new DownloadedDBHandler(this.f31004B0);
            this.f31081e = new ArrayList();
            ArrayList<DownloadedDataModel> downloadedData = this.f31079d.getDownloadedData();
            this.f31081e = downloadedData;
            try {
                if (downloadedData.size() > 0) {
                    for (int i9 = 0; i9 < this.f31081e.size(); i9++) {
                        Log.i("movieState", ((DownloadedDataModel) this.f31081e.get(i9)).getMovieState());
                        if (((DownloadedDataModel) this.f31081e.get(i9)).getMovieState().equals("Downloading")) {
                            AbstractServiceC3053x.z(this.f31004B0, VideoDownloadService.class, String.valueOf(((DownloadedDataModel) this.f31081e.get(i9)).getMovieStreamID()), 1001, true);
                            arrayList = new ArrayList<>();
                            DownloadedDataModel downloadedDataModel = new DownloadedDataModel();
                            downloadedDataModel.setMovieState("Paused");
                            downloadedDataModel.setMoviePercentage(((DownloadedDataModel) this.f31081e.get(i9)).getMoviePercentage());
                            arrayList.add(downloadedDataModel);
                            downloadedDBHandler = this.f31079d;
                            idAuto = ((DownloadedDataModel) this.f31081e.get(i9)).getIdAuto();
                        } else if (((DownloadedDataModel) this.f31081e.get(i9)).getMovieState().equals("Waiting")) {
                            AbstractServiceC3053x.z(this.f31004B0, VideoDownloadService.class, String.valueOf(((DownloadedDataModel) this.f31081e.get(i9)).getMovieStreamID()), 1001, true);
                            arrayList = new ArrayList<>();
                            DownloadedDataModel downloadedDataModel2 = new DownloadedDataModel();
                            downloadedDataModel2.setMovieState("Paused");
                            downloadedDataModel2.setMoviePercentage(((DownloadedDataModel) this.f31081e.get(i9)).getMoviePercentage());
                            arrayList.add(downloadedDataModel2);
                            downloadedDBHandler = this.f31079d;
                            idAuto = ((DownloadedDataModel) this.f31081e.get(i9)).getIdAuto();
                        }
                        downloadedDBHandler.updateDownloadedData(arrayList, idAuto);
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void O2() {
        if (Build.VERSION.SDK_INT < 33 || checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            return;
        }
        AbstractC0519b.h(this, m7.w.s0(), 1);
    }

    public final void P2() {
        this.f31078c1 = false;
        x2();
        LiveStreamDBHandler liveStreamDBHandler = this.f31013E0;
        if (liveStreamDBHandler != null) {
            liveStreamDBHandler.updateImportStatus("movies", "2");
        }
        this.f31060U.setVisibility(0);
        this.f31072Y.setVisibility(0);
        this.f31063V.setImageResource(a7.e.f12043p0);
        this.f31063V.setVisibility(0);
        this.f31066W.setVisibility(8);
        this.f31069X.setText(this.f31004B0.getResources().getString(a7.j.f13343o6));
        if (this.f31110n1) {
            this.f31110n1 = false;
            C2(this.f31004B0.getResources().getString(a7.j.f13335n8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationinterface.FirebaseInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Q0(com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.getAnnouncementsFirebaseCallback r6) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity.Q0(com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.getAnnouncementsFirebaseCallback):void");
    }

    public final void Q2() {
        startActivity(new Intent(this, (Class<?>) NewEPGCategoriesActivity.class));
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // n7.c.b
    public void R0() {
        ConstraintLayout constraintLayout = this.f31134v1;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
            LinearLayout linearLayout = this.f31090h;
            if (linearLayout != null) {
                linearLayout.requestFocus();
            }
        }
    }

    public final void R2() {
        this.f31080d1 = false;
        x2();
        LiveStreamDBHandler liveStreamDBHandler = this.f31013E0;
        if (liveStreamDBHandler != null) {
            liveStreamDBHandler.updateImportStatus("series", "2");
        }
        this.f31085f0.setVisibility(0);
        this.f31097j0.setVisibility(0);
        this.f31088g0.setImageResource(a7.e.f12043p0);
        this.f31088g0.setVisibility(0);
        this.f31091h0.setVisibility(8);
        this.f31094i0.setText(this.f31004B0.getResources().getString(a7.j.f13343o6));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S2(java.util.List r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L29
            int r1 = r4.size()     // Catch: java.lang.Exception -> L27
            if (r1 <= 0) goto L29
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L27
            r1 = 0
        Le:
            boolean r2 = r4.hasNext()     // Catch: java.lang.Exception -> L27
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Exception -> L27
            com.nst.iptvsmarterstvbox.model.SbpCombinedResponse.AnnouncementsData r2 = (com.nst.iptvsmarterstvbox.model.SbpCombinedResponse.AnnouncementsData) r2     // Catch: java.lang.Exception -> L27
            java.lang.Integer r2 = r2.getSeen()     // Catch: java.lang.Exception -> L27
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L27
            if (r2 != 0) goto Le
            int r1 = r1 + 1
            goto Le
        L27:
            r4 = move-exception
            goto L45
        L29:
            r1 = 0
        L2a:
            if (r1 <= 0) goto L3d
            android.widget.TextView r4 = r3.f31130u0     // Catch: java.lang.Exception -> L27
            if (r4 == 0) goto L48
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> L27
            r4.setText(r1)     // Catch: java.lang.Exception -> L27
            android.widget.TextView r4 = r3.f31130u0     // Catch: java.lang.Exception -> L27
            r4.setVisibility(r0)     // Catch: java.lang.Exception -> L27
            goto L48
        L3d:
            android.widget.TextView r4 = r3.f31130u0     // Catch: java.lang.Exception -> L27
            r0 = 8
            r4.setVisibility(r0)     // Catch: java.lang.Exception -> L27
            goto L48
        L45:
            r4.printStackTrace()
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity.S2(java.util.List):void");
    }

    @Override // z7.i
    public void T(List list) {
        if (list != null) {
            new m(this.f31004B0, list).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        } else {
            P2();
        }
    }

    public void T2(boolean z9, String str) {
        this.f31053R1 = z9;
        this.f31056S1 = str;
    }

    public void U2() {
        LinearLayout linearLayout = this.f31090h;
        if (linearLayout != null) {
            linearLayout.requestFocus();
        }
    }

    public void V2(boolean z9, boolean z10) {
        if (z9) {
            try {
                AbstractC2237a.f44498e1 = SharepreferenceDBHandler.getPrefAdsStatus(this.f31004B0);
                AbstractC2237a.f44501f1 = SharepreferenceDBHandler.getViewableRate(this.f31004B0);
                if (SharepreferenceDBHandler.getRewardedTextList(this.f31004B0) == null || SharepreferenceDBHandler.getRewardedTextList(this.f31004B0).size() <= 0) {
                    Listsingleton.b().f(null);
                    this.f31136w0.setText("");
                    this.f31136w0.setVisibility(8);
                } else {
                    AbstractC2237a.f44507h1 = true;
                    Listsingleton.b().f(null);
                    Listsingleton.b().f(SharepreferenceDBHandler.getRewardedTextList(this.f31004B0));
                    Listsingleton.b().e(null);
                    K2();
                }
                if (SharepreferenceDBHandler.getRewardedImageList(this.f31004B0) == null || SharepreferenceDBHandler.getRewardedImageList(this.f31004B0).size() <= 0) {
                    Listsingleton.b().d(null);
                } else {
                    AbstractC2237a.f44507h1 = true;
                    Listsingleton.b().d(null);
                    Listsingleton.b().d(SharepreferenceDBHandler.getRewardedImageList(this.f31004B0));
                }
            } catch (Exception unused) {
            }
        }
        if (!AbstractC2237a.f44526o.booleanValue() && z10) {
            try {
                if (SharepreferenceDBHandler.getDashboardImageList(this.f31004B0) == null || SharepreferenceDBHandler.getDashboardImageList(this.f31004B0).size() <= 0) {
                    this.f31139x0.setVisibility(8);
                    this.f31142y0.setVisibility(8);
                } else {
                    AbstractC2237a.f44510i1 = true;
                    DashBoardListssingleton.b().d(null);
                    DashBoardListssingleton.b().d(SharepreferenceDBHandler.getDashboardImageList(this.f31004B0));
                    DashBoardListssingleton.b().e(null);
                    J2();
                    this.f31139x0.setVisibility(0);
                    this.f31142y0.setVisibility(0);
                }
                if (SharepreferenceDBHandler.getDashboardTextList(this.f31004B0) == null || SharepreferenceDBHandler.getDashboardTextList(this.f31004B0).size() <= 0) {
                    this.f31139x0.setVisibility(8);
                    this.f31142y0.setVisibility(8);
                } else {
                    AbstractC2237a.f44507h1 = true;
                    DashBoardListssingleton.b().g(null);
                    DashBoardListssingleton.b().g(SharepreferenceDBHandler.getDashboardTextList(this.f31004B0));
                    DashBoardListssingleton.b().f(null);
                    this.f31139x0.setVisibility(0);
                    this.f31142y0.setVisibility(0);
                    L2();
                }
            } catch (Exception unused2) {
            }
        }
        if (SharepreferenceDBHandler.getAnnouncementsList(this.f31004B0) == null || SharepreferenceDBHandler.getAnnouncementsList(this.f31004B0).size() <= 0) {
            S2(null);
            AnnouncementsSBPSingleton.b().c(null);
        } else {
            S2(SharepreferenceDBHandler.getAnnouncementsList(this.f31004B0));
            AnnouncementsSBPSingleton.b().c(SharepreferenceDBHandler.getAnnouncementsList(this.f31004B0));
        }
    }

    public void W2() {
        if (SharepreferenceDBHandler.getAnnouncementsList(this.f31004B0) == null || SharepreferenceDBHandler.getAnnouncementsList(this.f31004B0).size() <= 0) {
            S2(null);
            AnnouncementsSBPSingleton.b().c(null);
        } else {
            S2(SharepreferenceDBHandler.getAnnouncementsList(this.f31004B0));
            AnnouncementsSBPSingleton.b().c(SharepreferenceDBHandler.getAnnouncementsList(this.f31004B0));
        }
        DashboardSBPAnnouncementAdapter dashboardSBPAnnouncementAdapter = this.f31062U1;
        if (dashboardSBPAnnouncementAdapter != null) {
            dashboardSBPAnnouncementAdapter.q0();
        }
    }

    public void X2() {
        if (!AbstractC2237a.f44475V0.booleanValue() || SharepreferenceDBHandler.getUpdateVersionCode(this.f31004B0) == null || SharepreferenceDBHandler.getUpdateVersionCode(this.f31004B0).length() <= 0) {
            return;
        }
        try {
            int i9 = Integer.parseInt(SharepreferenceDBHandler.getUpdateVersionCode(this.f31004B0));
            String updateVersionName = SharepreferenceDBHandler.getUpdateVersionName(this.f31004B0);
            if (i9 <= 108 || SharepreferenceDBHandler.getUpdateVersionUrl(this.f31004B0) == null || SharepreferenceDBHandler.getUpdateVersionUrl(this.f31004B0).length() <= 0) {
                return;
            }
            this.f31071X1 = SharepreferenceDBHandler.getUpdateVersionUrl(this.f31004B0);
            ConstraintLayout constraintLayout = this.f31134v1;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
                if (updateVersionName == null || updateVersionName.length() <= 0) {
                    if (this.f31143y1 != null) {
                        this.f31143y1.setText(getResources().getString(a7.j.f13013H) + " " + getResources().getString(a7.j.f13003G) + " " + getResources().getString(a7.j.f13023I));
                    }
                } else if (this.f31143y1 != null) {
                    String str = getResources().getString(a7.j.f13013H) + " " + getResources().getString(a7.j.f13003G) + " " + getResources().getString(a7.j.f13023I);
                    this.f31143y1.setText(str + " " + updateVersionName);
                }
                Button button = this.f31137w1;
                if (button != null) {
                    button.requestFocus();
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // z7.i
    public void Y(String str) {
        R2();
    }

    public void Y2() {
        if (this.f31004B0 != null) {
            View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(a7.g.f12867r2, (RelativeLayout) findViewById(a7.f.We));
            PopupWindow popupWindow = new PopupWindow(this);
            f30999Y1 = popupWindow;
            popupWindow.setContentView(viewInflate);
            f30999Y1.setWidth(-1);
            f30999Y1.setHeight(-1);
            f30999Y1.setFocusable(true);
            f30999Y1.setBackgroundDrawable(new BitmapDrawable());
            f30999Y1.showAtLocation(viewInflate, 17, 0, 0);
            TextView textView = (TextView) viewInflate.findViewById(a7.f.Ik);
            TextView textView2 = (TextView) viewInflate.findViewById(a7.f.Ai);
            Button button = (Button) viewInflate.findViewById(a7.f.f12197L0);
            Button button2 = (Button) viewInflate.findViewById(a7.f.f12482o0);
            if (textView != null) {
                textView.setText(getResources().getString(a7.j.f13250f3));
            }
            if (textView2 != null) {
                textView2.setText(getResources().getString(a7.j.f13240e3));
            }
            if (button != null) {
                button.setOnFocusChangeListener(new w.k((View) button, this));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new w.k((View) button2, this));
            }
            button2.setOnClickListener(new a());
            if (button != null) {
                button.setOnClickListener(new b());
            }
        }
    }

    public final void Z2() {
        g gVar = new g(this, this.f31004B0, this.f31013E0);
        gVar.setOnDismissListener(new u());
        Window window = gVar.getWindow();
        if (window != null) {
            window.setGravity(5);
        }
        gVar.show();
    }

    @Override // z7.b
    public void a() {
    }

    public final void a3(boolean z9) {
        String strP = m7.w.p();
        String lastUpdateTime = SharepreferenceDBHandler.getLastUpdateTime(this.f31004B0);
        int lastUpdate = SharepreferenceDBHandler.getLastUpdate(this.f31004B0);
        if (SharepreferenceDBHandler.getLastUpdateTime(this.f31004B0).length() == 0 || m7.w.D(lastUpdateTime, strP) >= lastUpdate) {
            c3();
        } else {
            V2(true, true);
        }
    }

    @Override // z7.b
    public void b() {
    }

    public void b3() {
        Intent intent = new Intent(this, (Class<?>) ImportM3uActivity.class);
        intent.putExtra("M3U_LINE", this.f31052R0);
        startActivity(intent);
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // z7.f
    public void c(String str) {
    }

    public void c3() {
        Q0.u.f(this.f31004B0).d("uniqueWorkName6", Q0.d.REPLACE, (Q0.m) new m.a(ApiWorkerCombinedRequest.class).b());
    }

    @Override // z7.b
    public void d(String str) {
    }

    public final void d3() {
        if (AbstractC2237a.f44449I0) {
            AbstractC2237a.f44449I0 = false;
        }
        if ((AbstractC2237a.f44536s.booleanValue() && SharepreferenceDBHandler.getCurrentAPPType(this.f31004B0).equals("api")) || (AbstractC2237a.f44536s.booleanValue() && SharepreferenceDBHandler.getCurrentAPPType(this.f31004B0).equals("onestream_api"))) {
            N2();
        } else if ((!AbstractC2237a.f44536s.booleanValue() || !SharepreferenceDBHandler.getCurrentAPPType(this.f31004B0).equals("stalker_api")) && (!AbstractC2237a.f44536s.booleanValue() || !AbstractC2237a.f44540u.booleanValue() || !SharepreferenceDBHandler.getCurrentAPPType(this.f31004B0).equals("m3u"))) {
            Y2();
            return;
        }
        AbstractC2237a.f44488b0 = Boolean.TRUE;
        m7.w.n0(this.f31004B0);
        finish();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // z7.f
    public void e(String str) {
    }

    public final void e3(ImportStatusModel importStatusModel, ImportStatusModel importStatusModel2, ImportStatusModel importStatusModel3) {
        long jCurrentTimeMillis = (importStatusModel.getTime() == null || importStatusModel.getTime().equals("")) ? 0L : System.currentTimeMillis() - Long.parseLong(importStatusModel.getTime());
        long jCurrentTimeMillis2 = (importStatusModel2.getTime() == null || importStatusModel2.getTime().equals("")) ? 0L : System.currentTimeMillis() - Long.parseLong(importStatusModel2.getTime());
        long jCurrentTimeMillis3 = (importStatusModel3.getTime() == null || importStatusModel3.getTime().equals("")) ? 0L : System.currentTimeMillis() - Long.parseLong(importStatusModel3.getTime());
        if (jCurrentTimeMillis == 0 || jCurrentTimeMillis <= 0 || importStatusModel.getStatus() == null || !importStatusModel.getStatus().equals("1")) {
            this.f31054S.setVisibility(8);
        } else {
            this.f31054S.setVisibility(0);
            this.f31057T.setText(this.f31004B0.getResources().getString(a7.j.f13126S2) + " " + m7.w.R0(jCurrentTimeMillis));
        }
        if (jCurrentTimeMillis2 == 0 || jCurrentTimeMillis2 <= 0 || importStatusModel2.getStatus() == null || !importStatusModel2.getStatus().equals("1")) {
            this.f31074Z.setVisibility(8);
        } else {
            this.f31074Z.setVisibility(0);
            this.f31082e0.setText(this.f31004B0.getResources().getString(a7.j.f13126S2) + " " + m7.w.R0(jCurrentTimeMillis2));
        }
        if (jCurrentTimeMillis3 == 0 || jCurrentTimeMillis3 <= 0 || importStatusModel3.getStatus() == null || !importStatusModel3.getStatus().equals("1")) {
            this.f31100k0.setVisibility(8);
            return;
        }
        this.f31100k0.setVisibility(0);
        this.f31103l0.setText(this.f31004B0.getResources().getString(a7.j.f13126S2) + " " + m7.w.R0(jCurrentTimeMillis3));
    }

    @Override // n7.c.b
    public void f(String str) {
        this.f31071X1 = str;
        if (this.f31134v1 != null) {
            String updateVersionName = SharepreferenceDBHandler.getUpdateVersionName(this.f31004B0);
            if (SharepreferenceDBHandler.getUpdateVersionUrl(this.f31004B0) == null || SharepreferenceDBHandler.getUpdateVersionUrl(this.f31004B0).length() <= 0) {
                return;
            }
            this.f31134v1.setVisibility(0);
            if (this.f31143y1 != null) {
                String str2 = getResources().getString(a7.j.f13013H) + " " + getResources().getString(a7.j.f13003G) + " " + getResources().getString(a7.j.f13023I);
                this.f31143y1.setText(str2 + " " + updateVersionName);
            }
            Button button = this.f31137w1;
            if (button != null) {
                button.requestFocus();
            }
        }
    }

    @Override // z7.d
    public void g(BillingGetDevicesCallback billingGetDevicesCallback) {
    }

    @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationinterface.FirebaseInterface
    public void h(AdsLastUpdateResponseCallback adsLastUpdateResponseCallback) {
        if (adsLastUpdateResponseCallback == null || !adsLastUpdateResponseCallback.b().equalsIgnoreCase("success") || adsLastUpdateResponseCallback.a() == null || adsLastUpdateResponseCallback.a().length() == 0 || SharepreferenceDBHandler.getLastUpdateTime(this.f31004B0).length() == 0 || !SharepreferenceDBHandler.getLastUpdateTime(this.f31004B0).equalsIgnoreCase(adsLastUpdateResponseCallback.a())) {
            return;
        }
        V2(true, true);
    }

    @Override // z7.f
    public void h0(ArrayList arrayList, String str) {
    }

    public final int h2(String str) {
        if (H2(str.length(), 0, 50)) {
            return 5000;
        }
        if (H2(str.length(), 50, 100)) {
            return Constants.MAXIMUM_UPLOAD_PARTS;
        }
        if (H2(str.length(), 100, 150)) {
            return 15000;
        }
        if (H2(str.length(), 150, 200)) {
            return 25000;
        }
        if (H2(str.length(), 200, 250)) {
            return 35000;
        }
        if (H2(str.length(), 250, 300)) {
            return 45000;
        }
        if (H2(str.length(), 300, 350)) {
            return 50000;
        }
        return H2(str.length(), 350, 500) ? 70000 : 100000;
    }

    @Override // z7.i
    public void i0(String str) {
        P2();
    }

    public boolean j2() {
        SharedPreferences sharedPreferences = getSharedPreferences("automation_channels", 0);
        this.f31034L0 = sharedPreferences;
        return sharedPreferences.getString("automation_channels", "").equals("checked");
    }

    @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationinterface.FirebaseInterface
    public void k0(readAnnouncementFirebaseCallback readannouncementfirebasecallback) {
    }

    @Override // z7.i
    public void l(String str) {
        P2();
    }

    @Override // z7.i
    public void l0(List list) {
        String str;
        String str2;
        if (list != null) {
            new l(this.f31004B0, list).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            return;
        }
        if (this.f31004B0 == null || (str = this.f31073Y0) == null || str.isEmpty() || (str2 = this.f31075Z0) == null || str2.isEmpty()) {
            return;
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f31060U, "progress", 100, 50);
        objectAnimatorOfInt.setDuration(500L);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.start();
        new Handler().postDelayed(new s(), 500L);
    }

    @Override // z7.f
    public void m(LoginCallback loginCallback, String str) {
        TextView textView;
        String str2;
        if (loginCallback != null) {
            try {
                if (loginCallback.getUserLoginInfo() != null) {
                    int i9 = 1;
                    if (loginCallback.getUserLoginInfo().getAuth().intValue() == 1 && loginCallback.getUserLoginInfo().getStatus().equals("Active")) {
                        if (loginCallback.getUserLoginInfo().getExpDate() != null) {
                            String expDate = loginCallback.getUserLoginInfo().getExpDate();
                            String timezone = loginCallback.getServerInfo().getTimezone();
                            SharedPreferences.Editor editor = this.f31010D0;
                            if (editor != null) {
                                editor.putString("expDate", expDate);
                                this.f31010D0.putString("serverTimeZone", timezone);
                                this.f31010D0.apply();
                            }
                            if (this.f31120r == null) {
                                return;
                            }
                            if (expDate != null && !expDate.isEmpty()) {
                                try {
                                    i9 = Integer.parseInt(expDate);
                                } catch (NumberFormatException unused) {
                                }
                                String str3 = new SimpleDateFormat("MMMM d, yyyy").format(new Date(((long) i9) * 1000));
                                this.f31120r.setText(getResources().getString(a7.j.f13162W1) + " " + str3);
                                return;
                            }
                            textView = this.f31120r;
                            str2 = getResources().getString(a7.j.f13162W1) + " " + getResources().getString(a7.j.f13265g8);
                        } else {
                            textView = this.f31120r;
                            if (textView == null) {
                                return;
                            }
                            str2 = getResources().getString(a7.j.f13162W1) + " " + getResources().getString(a7.j.f13265g8);
                        }
                        textView.setText(str2);
                    }
                }
            } catch (Exception e9) {
                Log.e("honey", e9.getMessage());
            }
        }
    }

    @Override // z7.d
    public void m0(BillingCheckGPACallback billingCheckGPACallback) {
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2(boolean r15) {
        /*
            Method dump skipped, instruction units count: 1061
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity.m2(boolean):void");
    }

    @Override // z7.i
    public void n(List list) {
        String str;
        String str2;
        if (list != null) {
            new h(this.f31004B0, list).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            return;
        }
        if (this.f31004B0 == null || (str = this.f31073Y0) == null || str.isEmpty() || (str2 = this.f31075Z0) == null || str2.isEmpty()) {
            return;
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f31039N, "progress", 100, 50);
        objectAnimatorOfInt.setDuration(500L);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.start();
        new Handler().postDelayed(new r(), 500L);
    }

    public void n2() {
        Intent intent = new Intent(this, (Class<?>) OpenVPNService.class);
        intent.setAction("de.blinkt.openvpn.START_SERVICE");
        bindService(intent, new p(), 1);
    }

    public void o2() {
        try {
            runOnUiThread(new t());
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (Build.VERSION.SDK_INT >= 34) {
            super.onBackPressed();
            return;
        }
        if (this.f31037M0 + 2000 > System.currentTimeMillis()) {
            finishAffinity();
            finish();
        } else {
            try {
                Toast.makeText(getBaseContext(), getResources().getString(a7.j.f12999F5), 0).show();
            } catch (Exception unused) {
            }
        }
        this.f31037M0 = System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0310, code lost:
    
        if ((java.lang.System.currentTimeMillis() - java.lang.Long.parseLong(r0.getTime())) > 60000) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x050c, code lost:
    
        if ((java.lang.System.currentTimeMillis() - java.lang.Long.parseLong(r0.getTime())) > 60000) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0c8e, code lost:
    
        if ((java.lang.System.currentTimeMillis() - java.lang.Long.parseLong(r0.getTime())) > 60000) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0d7b, code lost:
    
        if (r0.getStatus().equals("1") != false) goto L529;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r20) {
        /*
            Method dump skipped, instruction units count: 5076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity.onClick(android.view.View):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(64:0|2|(1:4)|5|(2:7|(1:9)(1:11))(2:12|(2:14|(1:16)(1:17))(2:18|(2:20|(1:22)(1:23))(2:24|(1:26)(1:27))))|10|28|(1:30)|31|(1:33)|34|(53:41|(2:43|(1:45))(2:46|(1:48)(1:49))|50|(2:237|52)|56|235|57|61|(1:67)(1:68)|69|(1:73)|74|(4:79|(3:81|(1:83)(1:84)|85)(1:86)|87|(1:89))(1:78)|90|(1:95)|96|(2:99|(1:101))|102|(1:104)(1:106)|105|107|(1:109)(3:110|(1:112)(1:113)|114)|115|(1:117)|118|(1:120)|121|(2:123|(1:125))(1:126)|127|(1:134)(1:135)|136|(1:138)|139|(3:141|(1:143)|144)(2:145|(1:147))|148|(1:150)(2:152|(1:154)(18:155|(1:157)|158|(1:160)|161|(5:163|(1:165)|166|(1:168)(1:169)|170)(1:171)|172|(1:174)(4:175|(3:177|(1:179)(1:180)|181)|182|(1:184))|185|(3:187|(4:189|(4:191|231|192|(3:233|197|(1:199)(1:203))(0))(3:229|204|207)|208|(1:210)(1:211))(1:212)|213)|214|(2:216|(1:218))|219|(1:221)|222|(1:224)|225|(2:227|228)(1:239)))|151|158|(0)|161|(0)(0)|172|(0)(0)|185|(0)|214|(0)|219|(0)|222|(0)|225|(0)(0))(1:39)|40|50|(0)|56|235|57|61|(2:63|67)(0)|69|(2:71|73)|74|(5:76|79|(0)(0)|87|(0))(0)|90|(2:92|95)(0)|96|(0)|102|(0)(0)|105|107|(0)(0)|115|(0)|118|(0)|121|(0)(0)|127|(2:129|134)(0)|136|(0)|139|(0)(0)|148|(0)(0)|151|158|(0)|161|(0)(0)|172|(0)(0)|185|(0)|214|(0)|219|(0)|222|(0)|225|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x04c6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x04c7, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0940  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0a0e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0a87  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0ab4  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0ac1  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0af3  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x049c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x05c2  */
    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instruction units count: 2817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (F2()) {
            G2();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01aa, code lost:
    
        if (com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler.getSelectedLanguage(r12.f31004B0).equalsIgnoreCase("Arabic") != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0261, code lost:
    
        if (r12.f31074Z.getVisibility() != 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0277, code lost:
    
        if (r12.f31100k0.getVisibility() == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0281, code lost:
    
        if (r12.f31054S.getVisibility() == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0298, code lost:
    
        if (r12.f31074Z.getVisibility() != 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02ea, code lost:
    
        if (r12.f31054S.getVisibility() == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0302, code lost:
    
        if (r12.f31074Z.getVisibility() == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x031a, code lost:
    
        if (r12.f31100k0.getVisibility() == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x033e, code lost:
    
        if (getCurrentFocus().getTag().equals("7") != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0454, code lost:
    
        if (getCurrentFocus().getTag().equals("3") != false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0118, code lost:
    
        if (r12.f31074Z.getVisibility() != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0130, code lost:
    
        if (r12.f31054S.getVisibility() == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013c, code lost:
    
        if (r12.f31100k0.getVisibility() == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0155, code lost:
    
        if (r12.f31074Z.getVisibility() != 0) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x018d A[PHI: r13
      0x018d: PHI (r13v100 android.view.View) = (r13v97 android.view.View), (r13v99 android.view.View), (r13v164 android.view.View) binds: [B:165:0x02ae, B:162:0x02a8, B:101:0x018b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02d1 A[PHI: r13
      0x02d1: PHI (r13v67 android.view.View) = (r13v64 android.view.View), (r13v66 android.view.View), (r13v93 android.view.View) binds: [B:208:0x0353, B:205:0x034e, B:177:0x02cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0376 A[PHI: r13
      0x0376: PHI (r13v6 android.view.View) = (r13v3 android.view.View), (r13v5 android.view.View), (r13v61 android.view.View) binds: [B:281:0x0488, B:278:0x0482, B:220:0x0374] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062 A[PHI: r13
      0x0062: PHI (r13v173 android.view.View) = (r13v170 android.view.View), (r13v172 android.view.View), (r13v231 android.view.View) binds: [B:89:0x016a, B:86:0x0164, B:30:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016f  */
    @Override // androidx.appcompat.app.b, android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyDown(int r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instruction units count: 1178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        m7.w.m(this.f31004B0);
        super.onPause();
        try {
            Handler handler = this.f31035L1;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            Handler handler2 = this.f31038M1;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
            }
            Handler handler3 = this.f31032K1;
            if (handler3 != null) {
                handler3.removeCallbacksAndMessages(null);
            }
            Thread thread = this.f31101k1;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f31101k1.interrupt();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i9, strArr, iArr);
        if (iArr.length <= 0 || iArr[0] != 0) {
            return;
        }
        Log.v("TAG", "Permission: " + strArr[0] + "was " + iArr[0]);
        if (Build.VERSION.SDK_INT >= 33) {
            return;
        }
        new x(this, "IPTVSmartersPro.apk").execute(this.f31071X1);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        try {
            this.f31082e0.setSelected(true);
            this.f31103l0.setSelected(true);
            this.f31057T.setSelected(true);
            z2();
            if (this.f31035L1 == null) {
                this.f31035L1 = new Handler();
            }
            if (this.f31038M1 == null) {
                this.f31038M1 = new Handler();
            }
            if (this.f31032K1 == null) {
                this.f31032K1 = new Handler();
            }
            if (AbstractC2237a.f44526o.booleanValue()) {
                k2();
            } else {
                this.f31133v0.setVisibility(8);
            }
            m7.w.m(this.f31004B0);
            m7.w.z0(this.f31004B0);
            this.f31061U0 = new ArrayList();
            if (!this.f31076a1) {
                if (AbstractC2237a.f44475V0.booleanValue()) {
                    a3(false);
                }
                if (!this.f31077b1 && !this.f31078c1 && !this.f31080d1) {
                    m2(false);
                }
                J7.a aVar = new J7.a(this.f31004B0);
                this.f31064V0 = aVar;
                try {
                    this.f31061U0 = aVar.j();
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
                ArrayList arrayList = this.f31061U0;
                if (arrayList == null || arrayList.size() <= 0 || G.g() == null) {
                    ImageView imageView = this.f31036M;
                    imageView.setVisibility(8);
                } else {
                    this.f31036M.setVisibility(0);
                    u1();
                }
            }
            this.f31076a1 = false;
            VodAllCategoriesSingleton.getInstance().setVodList(null);
            EpisodesUsingSinglton.getInstance().setEpisodeList(null);
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
            Thread thread = this.f31101k1;
            if (thread == null || !thread.isAlive()) {
                Thread thread2 = new Thread(new v());
                this.f31101k1 = thread2;
                thread2.start();
            }
            SharepreferenceDBHandler.getSelectedLanguage(this.f31004B0).equalsIgnoreCase("Arabic");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        super.onResume();
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStart() {
        super.onStart();
        new IntentFilter(TransferService.INTENT_KEY_NOTIFICATION);
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStop() {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        super.onStop();
        Handler handler = this.f31035L1;
        if (handler != null && (runnable3 = this.f31047P1) != null) {
            handler.removeCallbacks(runnable3);
        }
        Handler handler2 = this.f31038M1;
        if (handler2 != null && (runnable2 = this.f31044O1) != null) {
            handler2.removeCallbacks(runnable2);
        }
        Handler handler3 = this.f31032K1;
        if (handler3 == null || (runnable = this.f31041N1) == null) {
            return;
        }
        handler3.removeCallbacks(runnable);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        z2();
    }

    @Override // z7.i
    public void p0(String str) {
        I2();
    }

    public int p2() {
        Context context = this.f31004B0;
        if (context == null) {
            return 0;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("loginPrefs", 0);
        this.f31007C0 = sharedPreferences;
        return sharedPreferences.getInt("avatar_post", 0);
    }

    @Override // z7.d
    public void q0(BillingAddOrderCallback billingAddOrderCallback) {
    }

    public final void q2(String str) {
        String str2 = this.f31073Y0;
        if (str2 == null || this.f31075Z0 == null || str2.isEmpty() || this.f31075Z0.isEmpty() || this.f31073Y0.equals("") || this.f31075Z0.equals("")) {
            return;
        }
        this.f31042O.setVisibility(8);
        this.f31045P.setVisibility(0);
        this.f31048Q.setText(str);
        this.f31070X0.b(this.f31073Y0, this.f31075Z0);
    }

    public final void s2() {
        Context context = this.f31004B0;
        if (context != null) {
            this.f31058T0 = new n7.d(this, context);
            SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
            sharedPreferences.edit();
            String string = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
            String string2 = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
            try {
                if (this.f31058T0 == null || string == null || string.isEmpty() || string.equals("") || string2 == null || string2.isEmpty() || string2.equals("")) {
                    return;
                }
                this.f31058T0.g(string, string2);
            } catch (IOException e9) {
                e9.printStackTrace();
            }
        }
    }

    public final void t2(String str) {
        String str2 = this.f31073Y0;
        if (str2 == null || this.f31075Z0 == null || str2.isEmpty() || this.f31075Z0.isEmpty() || this.f31073Y0.equals("") || this.f31075Z0.equals("")) {
            return;
        }
        this.f31063V.setVisibility(8);
        this.f31066W.setVisibility(0);
        this.f31069X.setText(str);
        this.f31070X0.f(this.f31073Y0, this.f31075Z0);
    }

    public final void u1() {
        this.f31036M.setOnClickListener(new n());
        new Handler().postDelayed(new o(), 100L);
    }

    public boolean u2() {
        ConstraintLayout constraintLayout = this.f31134v1;
        return constraintLayout != null && constraintLayout.getVisibility() == 0;
    }

    public final void v1() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setClass(this.f31004B0, LaunchVPN.class);
        intent.putExtra("de.blinkt.openvpn.shortcutProfileUUID", G.g());
        intent.setFlags(268435456);
        intent.putExtra("de.blinkt.openvpn.showNoLogWindow", true);
        this.f31004B0.startActivity(intent);
    }

    public final void v2(String str) {
        String str2 = this.f31073Y0;
        if (str2 == null || this.f31075Z0 == null || str2.isEmpty() || this.f31075Z0.isEmpty() || this.f31073Y0.equals("") || this.f31075Z0.equals("")) {
            return;
        }
        this.f31088g0.setVisibility(8);
        this.f31091h0.setVisibility(0);
        this.f31094i0.setText(str);
        this.f31070X0.e(this.f31073Y0, this.f31075Z0);
    }

    @Override // z7.f
    public void w0(ArrayList arrayList, String str) {
    }

    public void w1() {
        int iNextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.f31095i1 = iNextInt;
        AbstractC1232b.f17695b = String.valueOf(iNextInt);
    }

    public final void x2() {
        if (this.f31077b1 || this.f31078c1 || this.f31080d1) {
            return;
        }
        y2();
    }

    @Override // z7.f
    public void y(LoginCallback loginCallback, String str, ArrayList arrayList) {
    }

    public void y2() {
        try {
            ProgressDialog progressDialog = this.f31083e1;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            this.f31083e1.dismiss();
        } catch (Exception unused) {
        }
    }

    @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationinterface.FirebaseInterface
    public void z(JsonElement jsonElement) {
    }

    public void z2() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }
}
