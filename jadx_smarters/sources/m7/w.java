package m7;

import P.W;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.drawable.ColorDrawable;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import com.TryRoom;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.facebook.ads.InterstitialAd;
import com.nst.iptvsmarterstvbox.miscelleneious.MyApplication;
import com.nst.iptvsmarterstvbox.model.database.EPGSourcesModel;
import com.nst.iptvsmarterstvbox.model.database.ExternalPlayerDataBase;
import com.nst.iptvsmarterstvbox.model.database.ImportStatusModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.sbpfunction.activitypushnotification.MaintanencePannelActivity;
import com.nst.iptvsmarterstvbox.view.activity.APPInPurchaseActivity;
import com.nst.iptvsmarterstvbox.view.activity.CheckAppupdateActivity;
import com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries;
import com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeriesActivity;
import com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer;
import com.nst.iptvsmarterstvbox.view.activity.ImportM3uActivity;
import com.nst.iptvsmarterstvbox.view.activity.ImportOneStreamActivity;
import com.nst.iptvsmarterstvbox.view.activity.LoginActivity;
import com.nst.iptvsmarterstvbox.view.activity.LoginActivityOneStream;
import com.nst.iptvsmarterstvbox.view.activity.LoginM3uActivity;
import com.nst.iptvsmarterstvbox.view.activity.MultiUserActivity;
import com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity;
import com.nst.iptvsmarterstvbox.view.activity.PlayExternalPlayerActivity;
import com.nst.iptvsmarterstvbox.view.activity.RateUsActivity;
import com.nst.iptvsmarterstvbox.view.activity.RecordingActivity;
import com.nst.iptvsmarterstvbox.view.activity.RoutingActivity;
import com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories;
import com.nst.iptvsmarterstvbox.view.demo.ExoDownloadedPlayerTwo;
import com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity;
import com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerEPGActivity;
import com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity;
import g7.e;
import j$.util.DesugarTimeZone;
import java.io.File;
import java.io.Serializable;
import java.net.NetworkInterface;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDateTime;
import p0.C2386a;
import q7.Q;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import t1.C2762c;
import u7.C2858a;
import w4.C2920h;
import w7.AbstractC2941e;
import w7.C2937a;
import w7.C2939c;
import w7.C2940d;

/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static PopupWindow f44696i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static SharedPreferences f44697j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static SharedPreferences f44698k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static C2858a f44699l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static AsyncTask f44700m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static AsyncTask f44701n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static AsyncTask f44702o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static AsyncTask f44703p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f44704q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static AsyncTask f44705r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static String[] f44706s = {"android.permission.POST_NOTIFICATIONS"};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static String[] f44707t = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static Dialog f44708u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f44709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44710b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44711c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44712d = 10;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f44713e = {1};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f44714f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f44715g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f44716h;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.f44696i.dismiss();
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f44718a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                w.f44696i.dismiss();
            }
        }

        public b(Activity activity) {
            this.f44718a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.this.f44709a = PreferenceManager.getDefaultSharedPreferences(this.f44718a);
            SharedPreferences.Editor editorEdit = w.this.f44709a.edit();
            editorEdit.putBoolean("CANCELLED", true);
            editorEdit.apply();
            MyApplication.p().I();
            w.this.U0(this.f44718a, "stopped");
            Activity activity = this.f44718a;
            Toast.makeText(activity, activity.getResources().getString(a7.j.f13248f1), 0).show();
            new Handler().postDelayed(new a(), 500L);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.f44696i.dismiss();
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f44722a = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f44723c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Activity f44724d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ EditText f44725e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ SharedPreferences f44726f;

        public class a implements e.j {
            public a() {
            }

            @Override // g7.e.j
            public void a(String str) {
                d.this.f44722a = str;
                d.this.f44725e.setText(str);
                SharedPreferences.Editor editorEdit = d.this.f44726f.edit();
                editorEdit.putString("recordingDir", str);
                editorEdit.apply();
                Toast.makeText(d.this.f44724d, "Chosen directory: " + str, 1).show();
            }
        }

        public d(Activity activity, EditText editText, SharedPreferences sharedPreferences) {
            this.f44724d = activity;
            this.f44725e = editText;
            this.f44726f = sharedPreferences;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g7.e eVar = new g7.e(this.f44724d, new a());
            eVar.K(this.f44723c);
            if (Build.VERSION.SDK_INT >= 30) {
                eVar.E("");
            } else {
                eVar.D("");
            }
            this.f44723c = !this.f44723c;
        }
    }

    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ EditText f44729a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ EditText f44730c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ EditText f44731d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Activity f44732e;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                w.f44696i.dismiss();
            }
        }

        public e(EditText editText, EditText editText2, EditText editText3, Activity activity) {
            this.f44729a = editText;
            this.f44730c = editText2;
            this.f44731d = editText3;
            this.f44732e = activity;
        }

        public final boolean a() {
            Activity activity;
            Resources resources;
            int i9;
            if (this.f44730c.getText().toString().trim().length() == 0) {
                activity = this.f44732e;
                resources = activity.getResources();
                i9 = a7.j.f13439y2;
            } else if (this.f44729a.getText().toString().trim().length() == 0) {
                activity = this.f44732e;
                resources = activity.getResources();
                i9 = a7.j.f13429x2;
            } else {
                if (this.f44729a.getText().toString().trim().length() == 0) {
                    return true;
                }
                try {
                    w.r0(this.f44729a.getText().toString());
                    return true;
                } catch (NumberFormatException unused) {
                    activity = this.f44732e;
                    resources = activity.getResources();
                    i9 = a7.j.f13348p1;
                }
            }
            Toast.makeText(activity, resources.getString(i9), 1).show();
            return false;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iR0;
            if (a()) {
                try {
                    iR0 = w.r0(this.f44729a.getText().toString());
                } catch (NumberFormatException unused) {
                    iR0 = 0;
                }
                MyApplication.p().H(w.this.f44716h, iR0, this.f44730c.getText().toString(), true, this.f44731d.getText().toString());
                new Handler().postDelayed(new a(), 500L);
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterstitialAd f44735a;

        public f(InterstitialAd interstitialAd) {
            this.f44735a = interstitialAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f44735a.isAdLoaded()) {
                Log.d("TAG", "The interstitial wasn't loaded yet.");
            } else {
                InterstitialAd interstitialAd = this.f44735a;
                TryRoom.DianePieNull();
            }
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.f44696i.dismiss();
        }
    }

    public class h implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f44737a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ RecordingActivity f44738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f44739d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Q f44740e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ TextView f44741f;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                w.f44696i.dismiss();
            }
        }

        public h(File file, RecordingActivity recordingActivity, ArrayList arrayList, Q q9, TextView textView) {
            this.f44737a = file;
            this.f44738c = recordingActivity;
            this.f44739d = arrayList;
            this.f44740e = q9;
            this.f44741f = textView;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onClick(android.view.View r8) {
            /*
                r7 = this;
                r8 = 1
                r0 = 0
                java.io.File r1 = r7.f44737a
                boolean r1 = r1.exists()
                if (r1 == 0) goto L84
                java.io.File r1 = r7.f44737a
                boolean r1 = r1.delete()
                if (r1 == 0) goto L84
                com.nst.iptvsmarterstvbox.view.activity.RecordingActivity r1 = r7.f44738c
                android.content.res.Resources r2 = r1.getResources()
                int r3 = a7.j.f13175X5
                java.lang.String r2 = r2.getString(r3)
                android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r0)
                r1.show()
                com.nst.iptvsmarterstvbox.view.activity.RecordingActivity r1 = r7.f44738c
                java.io.File[] r1 = m7.w.O(r1)
                if (r1 == 0) goto L66
                int r2 = r1.length
                if (r2 <= 0) goto L66
                java.util.ArrayList r2 = r7.f44739d
                r2.clear()
                int r2 = r1.length
                r3 = 0
            L37:
                if (r3 >= r2) goto L56
                r4 = r1[r3]
                java.lang.String r5 = r4.toString()
                java.lang.String r6 = ".ts"
                boolean r5 = r5.endsWith(r6)
                if (r5 == 0) goto L54
                java.io.File[] r5 = new java.io.File[r8]
                r5[r0] = r4
                java.util.List r4 = java.util.Arrays.asList(r5)
                java.util.ArrayList r5 = r7.f44739d
                r5.addAll(r4)
            L54:
                int r3 = r3 + r8
                goto L37
            L56:
                java.util.ArrayList r8 = r7.f44739d
                if (r8 == 0) goto L66
                int r8 = r8.size()
                if (r8 <= 0) goto L66
                q7.Q r8 = r7.f44740e
                r8.w()
                goto L75
            L66:
                java.util.ArrayList r8 = r7.f44739d
                r8.clear()
                q7.Q r8 = r7.f44740e
                r8.w()
                android.widget.TextView r8 = r7.f44741f
                r8.setVisibility(r0)
            L75:
                android.os.Handler r8 = new android.os.Handler
                r8.<init>()
                m7.w$h$a r0 = new m7.w$h$a
                r0.<init>()
                r1 = 500(0x1f4, double:2.47E-321)
                r8.postDelayed(r0, r1)
            L84:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m7.w.h.onClick(android.view.View):void");
        }
    }

    public class i implements C2762c.InterfaceC0455c {
        @Override // t1.C2762c.InterfaceC0455c
        public void a() {
        }

        @Override // t1.C2762c.InterfaceC0455c
        public void b(int i9, Throwable th) {
        }

        @Override // t1.C2762c.InterfaceC0455c
        public void c() {
        }
    }

    public static class j extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f44744a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C2858a f44745c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Activity f44746d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f44747e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public TextView f44748f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public TextView f44749g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public TextView f44750h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public LinearLayout f44751i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public LinearLayout f44752j;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f44753a;

            public a(View view) {
                this.f44753a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f44753a;
                    if (view2 == null || view2.getTag() == null || !this.f44753a.getTag().equals("1")) {
                        View view3 = this.f44753a;
                        if (view3 == null || view3.getTag() == null || !this.f44753a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = j.this.f44752j;
                        }
                    } else {
                        linearLayout = j.this.f44751i;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f44753a;
                    if (view4 == null || view4.getTag() == null || !this.f44753a.getTag().equals("1")) {
                        View view5 = this.f44753a;
                        if (view5 == null || view5.getTag() == null || !this.f44753a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = j.this.f44752j;
                        }
                    } else {
                        linearLayout = j.this.f44751i;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        public j(Activity activity, Context context, C2858a c2858a) {
            super(activity);
            this.f44746d = activity;
            this.f44744a = context;
            this.f44745c = c2858a;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getId() == a7.f.f12544u1) {
                try {
                    this.f44744a.startActivity(new Intent(this.f44744a, (Class<?>) APPInPurchaseActivity.class));
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
            setContentView(this.f44745c.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12782d2 : a7.g.f12775c2);
            this.f44747e = (TextView) findViewById(a7.f.f12544u1);
            this.f44748f = (TextView) findViewById(a7.f.f12412h1);
            this.f44751i = (LinearLayout) findViewById(a7.f.V8);
            this.f44752j = (LinearLayout) findViewById(a7.f.Ia);
            this.f44750h = (TextView) findViewById(a7.f.fm);
            this.f44749g = (TextView) findViewById(a7.f.um);
            this.f44750h.setText(this.f44744a.getResources().getString(a7.j.f13219c2));
            this.f44749g.setText(this.f44744a.getResources().getString(a7.j.f13275h8));
            this.f44747e.setText(this.f44744a.getResources().getString(a7.j.f13029I5));
            this.f44748f.setText(this.f44744a.getResources().getString(a7.j.f13217c0));
            this.f44747e.setOnClickListener(this);
            this.f44748f.setOnClickListener(this);
            TextView textView = this.f44747e;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f44748f;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    public static class k implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f44755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f44756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Context f44757c;

        public k(View view, Activity activity) {
            this.f44755a = view;
            this.f44756b = activity;
        }

        public k(View view, Context context) {
            this.f44755a = view;
            this.f44757c = context;
        }

        public k(View view, CheckAppupdateActivity checkAppupdateActivity) {
            this.f44755a = view;
            this.f44756b = checkAppupdateActivity;
        }

        public k(View view, MultiUserActivity multiUserActivity) {
            this.f44755a = view;
            this.f44756b = multiUserActivity;
        }

        public k(View view, NewDashboardActivity newDashboardActivity) {
            this.f44755a = view;
            this.f44756b = newDashboardActivity;
        }

        public k(View view, RateUsActivity rateUsActivity) {
            this.f44755a = view;
            this.f44756b = rateUsActivity;
        }

        public k(View view, RecordingActivity recordingActivity) {
            this.f44755a = view;
            this.f44756b = recordingActivity;
        }

        public k(View view, VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories) {
            this.f44755a = view;
            this.f44756b = vodActivityNewFlowSubCategories;
        }

        public k(View view, NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f44755a = view;
            this.f44756b = nSTIJKPlayerSkyActivity;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f44755a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f44755a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            int i9;
            if (this.f44756b != null) {
                if (z9) {
                    float f9 = z9 ? 1.12f : 1.0f;
                    View view2 = this.f44755a;
                    if (view2 == null || view2.getTag() == null || !this.f44755a.getTag().equals("1")) {
                        View view3 = this.f44755a;
                        if (view3 == null || view3.getTag() == null || !this.f44755a.getTag().equals("2")) {
                            View view4 = this.f44755a;
                            if (view4 == null || view4.getTag() == null || !this.f44755a.getTag().equals("3")) {
                                view.setBackground(this.f44756b.getResources().getDrawable(a7.e.f11923I1));
                                return;
                            } else {
                                a(f9);
                                b(f9);
                                i9 = a7.e.f12042p;
                            }
                        } else {
                            a(f9);
                            b(f9);
                            i9 = a7.e.f12024k1;
                        }
                    } else {
                        a(f9);
                        b(f9);
                        i9 = a7.e.f12010h;
                    }
                } else {
                    if (z9) {
                        return;
                    }
                    a(1.0f);
                    b(1.0f);
                    View view5 = this.f44755a;
                    if (view5 != null && view5.getTag() != null && this.f44755a.getTag().equals("1")) {
                        view.setBackgroundResource(a7.e.f12038o);
                    }
                    View view6 = this.f44755a;
                    if (view6 != null && view6.getTag() != null && this.f44755a.getTag().equals("2")) {
                        view.setBackgroundResource(a7.e.f12038o);
                    }
                    View view7 = this.f44755a;
                    if (view7 == null || view7.getTag() == null || !this.f44755a.getTag().equals("3")) {
                        return;
                    } else {
                        i9 = a7.e.f12038o;
                    }
                }
                view.setBackgroundResource(i9);
            }
        }
    }

    public static class l extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f44758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LiveStreamDBHandler f44759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f44760c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public B7.d f44761d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f44762e;

        public class a extends AsyncTask {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public volatile boolean f44763a = true;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Context f44764b;

            public a(Context context) {
                this.f44764b = context;
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean doInBackground(String... strArr) {
                publishProgress(0);
                if (l.this.f44759b != null) {
                    l.this.f44759b.addEPGTesting2(l.this.f44760c);
                    l.this.f44760c.clear();
                    l.this.f44759b.updateImportStatus("epg", "1", l.this.f44762e);
                }
                return Boolean.TRUE;
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Boolean bool) {
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onProgressUpdate(Integer... numArr) {
            }

            @Override // android.os.AsyncTask
            public void onCancelled() {
                this.f44763a = false;
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
            }
        }

        public l(int i9, Context context, LiveStreamDBHandler liveStreamDBHandler) {
            this.f44762e = "0";
            this.f44762e = String.valueOf(i9);
            this.f44758a = context;
            this.f44759b = liveStreamDBHandler;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            LiveStreamDBHandler liveStreamDBHandler;
            if (!this.f44762e.equals("0") && (liveStreamDBHandler = this.f44759b) != null) {
                liveStreamDBHandler.makeEmptyEPGWithSourceRef(this.f44762e);
            }
            B7.d dVar = new B7.d();
            this.f44761d = dVar;
            dVar.a(this.f44758a);
            ArrayList arrayListB = this.f44761d.b();
            this.f44760c = arrayListB;
            if (arrayListB != null && arrayListB.size() > 0) {
                return Boolean.TRUE;
            }
            LiveStreamDBHandler liveStreamDBHandler2 = this.f44759b;
            if (liveStreamDBHandler2 == null || liveStreamDBHandler2.getEPGCountWithSourceRef(this.f44762e) == 0) {
                return Boolean.FALSE;
            }
            this.f44759b.updateImportStatus("epg", "1", this.f44762e);
            return Boolean.TRUE;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            LiveStreamDBHandler liveStreamDBHandler;
            String str;
            try {
                if (bool.booleanValue()) {
                    AbstractC2237a.f44449I0 = false;
                    ArrayList arrayList = this.f44760c;
                    if (arrayList == null || arrayList.size() <= 0) {
                        return;
                    }
                    try {
                        w.f44705r = new a(this.f44758a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
                        return;
                    } catch (Exception unused) {
                        liveStreamDBHandler = this.f44759b;
                        str = "0";
                        liveStreamDBHandler.updateImportStatus("epg", str, this.f44762e);
                    }
                }
                liveStreamDBHandler = this.f44759b;
                str = "2";
                liveStreamDBHandler.updateImportStatus("epg", str, this.f44762e);
            } catch (Exception unused2) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    public static String A(String str) {
        try {
            return new SimpleDateFormat(" MMMM dd,yyyy").format(new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.US).parse(str));
        } catch (Exception e9) {
            e9.printStackTrace();
            return "";
        }
    }

    public static void A0(final Context context) {
        a.C0158a c0158a = new a.C0158a(context);
        c0158a.setTitle(context.getResources().getString(a7.j.f13397u0));
        c0158a.f(context.getResources().getString(a7.j.f13134T0));
        c0158a.d(a7.e.f12056s1);
        c0158a.j(context.getResources().getString(a7.j.f13132S8), new DialogInterface.OnClickListener() { // from class: m7.s
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                w.h0(context, dialogInterface, i9);
            }
        });
        c0158a.g(context.getResources().getString(a7.j.f13231d4), new DialogInterface.OnClickListener() { // from class: m7.t
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                dialogInterface.cancel();
            }
        });
        c0158a.n();
    }

    public static String B(String str) {
        try {
            return new SimpleDateFormat(" MMM dd,yyyy").format(new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.US).parse(str));
        } catch (Exception e9) {
            e9.printStackTrace();
            return "";
        }
    }

    public static Retrofit B0(Context context) {
        if (context != null) {
            try {
                String lowerCase = context.getSharedPreferences("loginPrefsserverurl", 0).getString(AbstractC2237a.f44454L, "").toLowerCase();
                Log.e("URl from Back", ">>>>>>>>" + lowerCase);
                if (!lowerCase.startsWith("http://") && !lowerCase.startsWith("https://")) {
                    lowerCase = "http://" + lowerCase;
                }
                if (!lowerCase.endsWith("/")) {
                    lowerCase = lowerCase + "/";
                }
                AbstractC2237a.f44482Z = lowerCase;
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return new Retrofit.Builder().baseUrl(lowerCase).client(builder.connectTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).readTimeout(60L, timeUnit).followRedirects(true).build()).addConverterFactory(GsonConverterFactory.create()).build();
            } catch (IllegalArgumentException | NullPointerException | Exception unused) {
            }
        }
        return null;
    }

    public static long C(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0L;
        }
    }

    public static Retrofit C0(Context context) {
        if (context != null) {
            try {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return new Retrofit.Builder().baseUrl("https://users.iptvsmarters.com/").client(builder.connectTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).readTimeout(60L, timeUnit).followRedirects(false).build()).addConverterFactory(GsonConverterFactory.create()).build();
            } catch (IllegalArgumentException | NullPointerException | Exception unused) {
            }
        }
        return null;
    }

    public static long D(String str, String str2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        if (str != null) {
            try {
                if (str.length() > 0 && str2 != null && str2.length() > 0) {
                    Date date = simpleDateFormat.parse(str2);
                    Date date2 = simpleDateFormat.parse(str);
                    long jConvert = (date == null || date2 == null) ? 0L : TimeUnit.HOURS.convert(date.getTime() - date2.getTime(), TimeUnit.MILLISECONDS);
                    if (jConvert > 0) {
                        return jConvert;
                    }
                    return -1L;
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        return -1L;
    }

    public static Retrofit D0(Context context) {
        if (context != null) {
            try {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return new Retrofit.Builder().baseUrl(AbstractC2237a.f44467R0).client(builder.connectTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).readTimeout(60L, timeUnit).addInterceptor(new Interceptor() { // from class: m7.p
                    @Override // okhttp3.Interceptor
                    public final Response intercept(Interceptor.Chain chain) {
                        return w.j0(chain);
                    }
                }).followRedirects(true).build()).addConverterFactory(GsonConverterFactory.create()).build();
            } catch (IllegalArgumentException | NullPointerException | Exception unused) {
            }
        }
        return null;
    }

    public static String E() {
        return Build.MANUFACTURER + " " + Build.PRODUCT;
    }

    public static Retrofit E0(Context context) {
        if (context != null) {
            try {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return new Retrofit.Builder().baseUrl(AbstractC2237a.f44467R0).client(builder.connectTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).readTimeout(60L, timeUnit).addInterceptor(new Interceptor() { // from class: m7.u
                    @Override // okhttp3.Interceptor
                    public final Response intercept(Interceptor.Chain chain) {
                        return w.k0(chain);
                    }
                }).followRedirects(true).build()).addConverterFactory(GsonConverterFactory.create()).build();
            } catch (IllegalArgumentException | NullPointerException | Exception unused) {
            }
        }
        return null;
    }

    public static String F(Context context) {
        try {
            String str = Build.MANUFACTURER;
            String str2 = Build.MODEL;
            if (str2.toLowerCase().startsWith(str.toLowerCase())) {
                return str2;
            }
            return str + "" + str2;
        } catch (Exception e9) {
            e9.printStackTrace();
            return context.getSharedPreferences("loginPrefs", 0).getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        }
    }

    public static Retrofit F0(Context context) {
        if (context != null) {
            try {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return new Retrofit.Builder().baseUrl(AbstractC2237a.f44467R0).client(builder.connectTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).readTimeout(60L, timeUnit).addInterceptor(new Interceptor() { // from class: m7.r
                    @Override // okhttp3.Interceptor
                    public final Response intercept(Interceptor.Chain chain) {
                        return w.l0(chain);
                    }
                }).followRedirects(false).build()).addConverterFactory(GsonConverterFactory.create()).build();
            } catch (IllegalArgumentException | NullPointerException | Exception unused) {
            }
        }
        return null;
    }

    public static String G(String str) {
        return str.replaceAll(" ", "%20");
    }

    public static Retrofit G0(Context context) {
        if (context != null) {
            try {
                String lowerCase = context.getSharedPreferences("loginPrefsserverurl", 0).getString(AbstractC2237a.f44454L, "").toLowerCase();
                Log.e("URl from Back", ">>>>>>>>" + lowerCase);
                if (!lowerCase.startsWith("http://") && !lowerCase.startsWith("https://")) {
                    lowerCase = "http://" + lowerCase;
                }
                if (!lowerCase.endsWith("/")) {
                    lowerCase = lowerCase + "/";
                }
                if (lowerCase.contains("/c/")) {
                    lowerCase = lowerCase.replace("/c/", "/");
                }
                AbstractC2237a.f44482Z = lowerCase;
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return new Retrofit.Builder().baseUrl(lowerCase).client(builder.connectTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).readTimeout(60L, timeUnit).followRedirects(true).build()).addConverterFactory(GsonConverterFactory.create()).build();
            } catch (IllegalArgumentException | NullPointerException | Exception unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int H(String str) {
        str.hashCode();
        byte b9 = -1;
        switch (str.hashCode()) {
            case 3121:
                if (str.equals("ar")) {
                    b9 = 0;
                }
                break;
            case 3201:
                if (str.equals("de")) {
                    b9 = 1;
                }
                break;
            case 3241:
                if (str.equals("en")) {
                    b9 = 2;
                }
                break;
            case 3246:
                if (str.equals("es")) {
                    b9 = 3;
                }
                break;
            case 3276:
                if (str.equals("fr")) {
                    b9 = 4;
                }
                break;
            case 3325:
                if (str.equals("he")) {
                    b9 = 5;
                }
                break;
            case 3338:
                if (str.equals("hr")) {
                    b9 = 6;
                }
                break;
            case 3341:
                if (str.equals("hu")) {
                    b9 = 7;
                }
                break;
            case 3365:
                if (str.equals("in")) {
                    b9 = 8;
                }
                break;
            case 3371:
                if (str.equals("it")) {
                    b9 = 9;
                }
                break;
            case 3428:
                if (str.equals("ko")) {
                    b9 = 10;
                }
                break;
            case 3494:
                if (str.equals("ms")) {
                    b9 = 11;
                }
                break;
            case 3518:
                if (str.equals("nl")) {
                    b9 = 12;
                }
                break;
            case 3580:
                if (str.equals("pl")) {
                    b9 = 13;
                }
                break;
            case 3588:
                if (str.equals("pt")) {
                    b9 = 14;
                }
                break;
            case 3645:
                if (str.equals("ro")) {
                    b9 = 15;
                }
                break;
            case 3678:
                if (str.equals("sq")) {
                    b9 = 16;
                }
                break;
            case 3683:
                if (str.equals("sv")) {
                    b9 = 17;
                }
                break;
            case 3710:
                if (str.equals("tr")) {
                    b9 = 18;
                }
                break;
            case 3734:
                if (str.equals("uk")) {
                    b9 = 19;
                }
                break;
        }
        switch (b9) {
            case 0:
                return 6;
            case 1:
                return 8;
            case 2:
            default:
                return 0;
            case 3:
                return 5;
            case 4:
                return 7;
            case 5:
                return 14;
            case 6:
                return 4;
            case 7:
                return 11;
            case 8:
                return 18;
            case 9:
                return 9;
            case 10:
                return 13;
            case 11:
                return 16;
            case 12:
                return 17;
            case 13:
                return 1;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 2;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return 10;
            case 16:
                return 12;
            case LangUtils.HASH_SEED /* 17 */:
                return 19;
            case 18:
                return 3;
            case 19:
                return 15;
        }
    }

    public static Retrofit H0(Context context) {
        if (context != null) {
            try {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return new Retrofit.Builder().baseUrl("http://api.themoviedb.org/3/").client(builder.connectTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).readTimeout(60L, timeUnit).followRedirects(false).build()).addConverterFactory(GsonConverterFactory.create()).build();
            } catch (IllegalArgumentException | NullPointerException | Exception unused) {
            }
        }
        return null;
    }

    public static String I(Context context) {
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (string != null && !string.equals("")) {
                return string;
            }
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        try {
                            return ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getMacAddress();
                        } catch (Exception unused) {
                            return "";
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    for (byte b9 : hardwareAddress) {
                        sb.append(String.format("%02X:", Byte.valueOf(b9)));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
        } catch (Exception unused2) {
        }
        return "";
    }

    public static void I0(Context context) {
        if (context != null) {
            try {
                if (new C2858a(context).A().equals(AbstractC2237a.f44453K0) || i(context).booleanValue()) {
                    return;
                }
                InterstitialAd interstitialAd = new InterstitialAd(context, "269613774129228_269615270795745");
                TryRoom.DianePie();
                new Handler().postDelayed(new f(interstitialAd), 2000L);
            } catch (Exception unused) {
            }
        }
    }

    public static int J(String str) {
        int iR0;
        int i9 = 0;
        if (str == null) {
            return 0;
        }
        try {
            if (str.isEmpty()) {
                return 0;
            }
            if (str.contains("+")) {
                iR0 = r0(str.split("\\+")[1]);
            } else {
                if (!str.contains("-")) {
                    return 0;
                }
                iR0 = -r0(str.split("\\-")[1]);
            }
            i9 = iR0 * DateTimeConstants.MILLIS_PER_HOUR;
            return i9;
        } catch (Exception unused) {
            return i9;
        }
    }

    public static void J0(Context context, String str) {
        String str2 = "en";
        if (!str.equals("English")) {
            if (str.equals("Polish")) {
                str2 = "pl";
            } else if (str.equals("Portuguese")) {
                str2 = "pt";
            } else if (str.equals("Turkish")) {
                str2 = "tr";
            } else if (str.equals("Croatian")) {
                str2 = "hr";
            } else if (str.equals("Spanish")) {
                str2 = "es";
            } else if (str.equals("Arabic")) {
                str2 = "ar";
            } else if (str.equals("French")) {
                str2 = "fr";
            } else if (str.equals("German")) {
                str2 = "de";
            } else if (str.equals("Italian")) {
                str2 = "it";
            } else if (str.equals("Romanian")) {
                str2 = "ro";
            } else if (str.equals("Hungary")) {
                str2 = "hu";
            } else if (str.equals("Albanian")) {
                str2 = "sq";
            } else if (str.equals("Korean")) {
                str2 = "ko";
            } else if (str.equals("Hebrew")) {
                str2 = "he";
            } else if (str.equals("Ukrainian")) {
                str2 = "uk";
            } else if (str.equals("Malay")) {
                str2 = "ms";
            } else if (str.equals("Dutch")) {
                str2 = "nl";
            } else if (str.equals("Indonesian")) {
                str2 = "in";
            } else if (str.equals("Swedish")) {
                str2 = "sv";
            }
        }
        if (context != null) {
            Resources resources = context.getResources();
            Resources resources2 = context.getApplicationContext().getResources();
            Locale locale = new Locale(str2);
            Locale.setDefault(locale);
            Configuration configuration = new Configuration();
            configuration.locale = locale;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            resources2.updateConfiguration(configuration, resources.getDisplayMetrics());
            Configuration configuration2 = resources.getConfiguration();
            configuration2.setLocale(locale);
            context.getApplicationContext().createConfigurationContext(configuration2);
            context.createConfigurationContext(configuration2);
        }
    }

    public static String K(String str, Context context) {
        try {
            String string = context.getSharedPreferences("timeFormat", 0).getString("timeFormat", AbstractC2237a.f44441E0);
            C2858a c2858a = new C2858a(context);
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(string, locale);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone(c2858a.C()));
            String str2 = simpleDateFormat2.format(new Date(Long.parseLong(String.valueOf(Long.valueOf(simpleDateFormat.parse(str).getTime())))));
            Log.e("TimeZone", TimeZone.getDefault().getID());
            return str2;
        } catch (Exception unused) {
            return "00-00-0000 00:00";
        }
    }

    public static int L(Context context) {
        return (int) ((r1.widthPixels / context.getResources().getDisplayMetrics().density) / 180.0f);
    }

    public static int M(long j9, long j10, Context context) {
        if (context != null) {
            try {
                long millis = LocalDateTime.now().toDateTime().getMillis() + S(context);
                if (j9 < j10 && millis < j10) {
                    if (millis <= j9) {
                        return 100;
                    }
                    return (int) (((j10 - millis) * 100) / (j10 - j9));
                }
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static void M0(Activity activity) {
        try {
            Dialog dialog = new Dialog(activity);
            f44708u = dialog;
            dialog.setContentView(a7.g.f12625D4);
            f44708u.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            f44708u.getWindow().setGravity(17);
            f44708u.setCancelable(false);
            f44708u.show();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int N(String str) {
        str.hashCode();
        byte b9 = -1;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    b9 = 0;
                }
                break;
            case 1382:
                if (str.equals("+1")) {
                    b9 = 1;
                }
                break;
            case 1383:
                if (str.equals("+2")) {
                    b9 = 2;
                }
                break;
            case 1384:
                if (str.equals("+3")) {
                    b9 = 3;
                }
                break;
            case 1385:
                if (str.equals("+4")) {
                    b9 = 4;
                }
                break;
            case 1386:
                if (str.equals("+5")) {
                    b9 = 5;
                }
                break;
            case 1387:
                if (str.equals("+6")) {
                    b9 = 6;
                }
                break;
            case 1388:
                if (str.equals("+7")) {
                    b9 = 7;
                }
                break;
            case 1389:
                if (str.equals("+8")) {
                    b9 = 8;
                }
                break;
            case 1390:
                if (str.equals("+9")) {
                    b9 = 9;
                }
                break;
            case 1444:
                if (str.equals("-1")) {
                    b9 = 10;
                }
                break;
            case 1445:
                if (str.equals("-2")) {
                    b9 = 11;
                }
                break;
            case 1446:
                if (str.equals("-3")) {
                    b9 = 12;
                }
                break;
            case 1447:
                if (str.equals("-4")) {
                    b9 = 13;
                }
                break;
            case 1448:
                if (str.equals("-5")) {
                    b9 = 14;
                }
                break;
            case 1449:
                if (str.equals("-6")) {
                    b9 = 15;
                }
                break;
            case 1450:
                if (str.equals("-7")) {
                    b9 = 16;
                }
                break;
            case 1451:
                if (str.equals("-8")) {
                    b9 = 17;
                }
                break;
            case 1452:
                if (str.equals("-9")) {
                    b9 = 18;
                }
                break;
            case 42890:
                if (str.equals("+10")) {
                    b9 = 19;
                }
                break;
            case 42891:
                if (str.equals("+11")) {
                    b9 = 20;
                }
                break;
            case 42892:
                if (str.equals("+12")) {
                    b9 = 21;
                }
                break;
            case 44812:
                if (str.equals("-10")) {
                    b9 = 22;
                }
                break;
            case 44813:
                if (str.equals("-11")) {
                    b9 = 23;
                }
                break;
            case 44814:
                if (str.equals("-12")) {
                    b9 = 24;
                }
                break;
        }
        switch (b9) {
            case 0:
            default:
                return 12;
            case 1:
                return 13;
            case 2:
                return 14;
            case 3:
                return 15;
            case 4:
                return 16;
            case 5:
                return 17;
            case 6:
                return 18;
            case 7:
                return 19;
            case 8:
                return 20;
            case 9:
                return 21;
            case 10:
                return 11;
            case 11:
                return 10;
            case 12:
                return 9;
            case 13:
                return 8;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 7;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return 6;
            case 16:
                return 5;
            case LangUtils.HASH_SEED /* 17 */:
                return 4;
            case 18:
                return 3;
            case 19:
                return 22;
            case 20:
                return 23;
            case 21:
                return 24;
            case 22:
                return 2;
            case 23:
                return 1;
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                return 0;
        }
    }

    public static void N0(Context context) {
        try {
            Dialog dialog = new Dialog(context);
            f44708u = dialog;
            dialog.setContentView(a7.g.f12625D4);
            f44708u.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            f44708u.getWindow().setGravity(17);
            f44708u.setCancelable(false);
            f44708u.show();
        } catch (Exception unused) {
        }
    }

    public static File[] O(Context context) {
        if (context != null) {
            return new File(context.getSharedPreferences("recordingDir", 0).getString("recordingDir", String.valueOf(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "IPTVSmarters")))).listFiles();
        }
        return null;
    }

    public static Retrofit P(Context context) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return new Retrofit.Builder().baseUrl(AbstractC2237a.f44467R0).client(builder.connectTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).readTimeout(60L, timeUnit).addInterceptor(new Interceptor() { // from class: m7.o
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                return w.f0(chain);
            }
        }).followRedirects(false).build()).addConverterFactory(GsonConverterFactory.create()).build();
    }

    public static void P0(Context context, String str) {
        if (context == null || str == "" || str.isEmpty()) {
            return;
        }
        Toast.makeText(context, str, 0).show();
    }

    public static Retrofit Q(Context context) {
        if (context != null) {
            try {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return new Retrofit.Builder().baseUrl(AbstractC2237a.f44467R0).client(builder.connectTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).readTimeout(60L, timeUnit).addInterceptor(new Interceptor() { // from class: m7.q
                    @Override // okhttp3.Interceptor
                    public final Response intercept(Interceptor.Chain chain) {
                        return w.g0(chain);
                    }
                }).followRedirects(true).build()).addConverterFactory(GsonConverterFactory.create()).build();
            } catch (IllegalArgumentException e9) {
                e9.printStackTrace();
                return null;
            } catch (NullPointerException e10) {
                e10.printStackTrace();
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static void Q0(Context context, String str) {
        if (context == null || str == "" || str.isEmpty()) {
            return;
        }
        Toast.makeText(context, str, 1).show();
    }

    public static String R(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return new SimpleDateFormat(context.getSharedPreferences("timeFormat", 0).getString("timeFormat", AbstractC2237a.f44441E0), Locale.US).format(new Date());
        } catch (Exception unused) {
            return "";
        }
    }

    public static String R0(long j9) {
        int i9 = 0;
        try {
            TimeUnit timeUnit = TimeUnit.DAYS;
            List listAsList = Arrays.asList(Long.valueOf(timeUnit.toMillis(365L)), Long.valueOf(timeUnit.toMillis(30L)), Long.valueOf(timeUnit.toMillis(1L)), Long.valueOf(TimeUnit.HOURS.toMillis(1L)), Long.valueOf(TimeUnit.MINUTES.toMillis(1L)), Long.valueOf(TimeUnit.SECONDS.toMillis(1L)));
            List listAsList2 = Arrays.asList("year", "month", "day", "hour", "min", "sec");
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                if (i9 >= listAsList.size()) {
                    break;
                }
                long jLongValue = j9 / ((Long) listAsList.get(i9)).longValue();
                if (jLongValue > 0) {
                    stringBuffer.append(jLongValue);
                    stringBuffer.append(" ");
                    stringBuffer.append((String) listAsList2.get(i9));
                    stringBuffer.append(jLongValue != 1 ? "s" : "");
                    stringBuffer.append(" ago");
                } else {
                    i9++;
                }
            }
            return "".equals(stringBuffer.toString()) ? "0 sec ago" : stringBuffer.toString();
        } catch (Exception unused) {
            return "0 sec ago";
        }
    }

    public static long S(Context context) {
        if (context == null) {
            return 0L;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("loginPrefs", 0);
            f44697j = sharedPreferences;
            if (sharedPreferences != null) {
                return J(sharedPreferences.getString("selectedEPGShift", AbstractC2237a.f44437C0));
            }
            return 0L;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static String S0(String str) {
        return new String(Base64.decode(str, 0), StandardCharsets.UTF_8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006a, code lost:
    
        r17 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006d, code lost:
    
        r17 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007c, code lost:
    
        r17 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        r17 = r11;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0098. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String T(android.content.Context r18, int r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.w.T(android.content.Context, int, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String T0(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception e9) {
            e9.printStackTrace();
            return "";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String U(android.content.Context r18, int r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.w.U(android.content.Context, int, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String V(android.content.Context r18, int r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.w.V(android.content.Context, int, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String V0(String str) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.US).parse(str));
        } catch (ParseException e9) {
            e9.printStackTrace();
            return "";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String W(android.content.Context r11) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.w.W(android.content.Context):java.lang.String");
    }

    public static void X() {
        try {
            Dialog dialog = f44708u;
            if (dialog == null || !dialog.isShowing()) {
                return;
            }
            f44708u.dismiss();
        } catch (Exception unused) {
        }
    }

    public static void Y(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public static void Z(Context context) {
        LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(context);
        C2858a c2858a = new C2858a(context);
        ArrayList<EPGSourcesModel> activeEPGSource = liveStreamDBHandler.getActiveEPGSource();
        String strValueOf = (activeEPGSource == null || activeEPGSource.size() <= 0) ? "0" : String.valueOf(activeEPGSource.get(0).getIdAuto());
        if (strValueOf.equals("0")) {
            return;
        }
        ImportStatusModel importStatusModel = liveStreamDBHandler.getdateDBStatus("epg", strValueOf);
        if (importStatusModel.getStatus() == null && importStatusModel.getTime() == null && importStatusModel.getType() == null) {
            importStatusModel = new ImportStatusModel();
            importStatusModel.setType("epg");
            importStatusModel.setStatus("0");
            importStatusModel.setDate("");
            importStatusModel.setTime("");
            importStatusModel.setSourceRef(strValueOf);
            ArrayList<ImportStatusModel> arrayList = new ArrayList<>();
            arrayList.add(0, importStatusModel);
            liveStreamDBHandler.importDataStatusArrayList(arrayList, SharepreferenceDBHandler.getCurrentAPPType(context));
        }
        if ((importStatusModel.getStatus() == null || !importStatusModel.getStatus().equals("2")) && (importStatusModel.getStatus() == null || !importStatusModel.getStatus().equals("0"))) {
            if (importStatusModel.getStatus() == null || !importStatusModel.getStatus().equals("1")) {
                if (importStatusModel.getStatus() != null) {
                    importStatusModel.getStatus().equals("3");
                    return;
                }
                return;
            } else {
                long jC = C(new SimpleDateFormat("dd/MM/yyyy", Locale.US), importStatusModel.getDate(), q());
                if (!n(context) || jC < c2858a.h()) {
                    return;
                }
            }
        }
        a0(liveStreamDBHandler, strValueOf, context);
    }

    public static void a0(LiveStreamDBHandler liveStreamDBHandler, String str, Context context) {
        if (AbstractC2237a.f44449I0) {
            AbstractC2237a.f44449I0 = false;
        }
        liveStreamDBHandler.updateImportStatus("epg", "3");
        new l(r0(str), context, liveStreamDBHandler).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public static boolean b0(long j9, long j10, Context context) {
        if (context != null) {
            try {
                long millis = LocalDateTime.now().toDateTime().getMillis() + S(context);
                if (j9 <= millis && j10 >= millis) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String c0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    public static String d0(String str) {
        try {
            return Base64.encodeToString(str.getBytes("UTF-8"), 0);
        } catch (Exception e9) {
            e9.printStackTrace();
            return "";
        }
    }

    public static /* synthetic */ WindowInsets e0(View view, WindowInsets windowInsets) {
        Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars());
        view.setPadding(0, insets.top, 0, insets.bottom);
        return windowInsets;
    }

    public static /* synthetic */ Response f0(Interceptor.Chain chain) {
        return chain.proceed(chain.request().newBuilder().header("User-Agent", "IPTVSmartersPlayer").build());
    }

    public static /* synthetic */ Response g0(Interceptor.Chain chain) {
        return chain.proceed(chain.request().newBuilder().header("User-Agent", "IPTVSmartersPlayer").build());
    }

    public static /* synthetic */ void h0(Context context, DialogInterface dialogInterface, int i9) {
        if (SharepreferenceDBHandler.getCurrentAPPType(context).equals("onestream_api")) {
            if (context != null) {
                context.startActivity(new Intent(context, (Class<?>) ImportOneStreamActivity.class));
            }
        } else if (SharepreferenceDBHandler.getCurrentAPPType(context).equals("m3u")) {
            m0(context);
        }
        dialogInterface.dismiss();
    }

    public static Boolean i(Context context) {
        return context != null ? Boolean.valueOf(new C2762c(context, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAk8jH+eNvdwbyf+4Rt4DcLFubCulWdwmVUattc8fbm1bcWLxsEdBl38RJx6ldeNfJkOTfU3If4R3+5bDEopvk8ymDUXlHVsQR8CiH8zS9Q34ax7WHXXvqhzMkzCAO5V91KWfkf+Pk+ec4bPPSZHsTDIa3ASTqTJWUfymB3xEOKiPc0PJeIzGIm/bWuyV9UWaShs32MzObNDYXQZ+g8ktftNeXoHsoxvmanNhY8cjGcvMAL8j0bHC4iTb2H/CTLIW1IUZ2D8ps+DpU+ZTh8DH8DVIdRaS6FgDjaItuJOLm2PA0a6UJgpukdW2NWEZH2tRwFtDH3D19N883sv8RCPK6AwIDAQAB", "12141350975697687473", new i()).p("com.nst.smartersplayer.billing")) : Boolean.FALSE;
    }

    public static void j(Context context) {
        context.startActivity(new Intent(context, (Class<?>) NewDashboardActivity.class));
    }

    public static /* synthetic */ Response j0(Interceptor.Chain chain) {
        return chain.proceed(chain.request().newBuilder().header("User-Agent", "IPTVSmartersPlayer").build());
    }

    public static /* synthetic */ Response k0(Interceptor.Chain chain) {
        return chain.proceed(chain.request().newBuilder().header("User-Agent", "IPTVSmartersPlayer").build());
    }

    public static boolean l(String str, Context context) {
        if (context != null) {
            try {
                context.getPackageManager().getPackageInfo(str, 1);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public static /* synthetic */ Response l0(Interceptor.Chain chain) {
        return chain.proceed(chain.request().newBuilder().header("User-Agent", "IPTVSmartersPlayer").build());
    }

    public static void m(Context context) {
        if (context != null) {
            String string = context.getSharedPreferences("selected_language", 0).getString("selected_language", "");
            if (string.equals("")) {
                return;
            }
            J0(context, string);
        }
    }

    public static void m0(Context context) {
        if (context != null && AbstractC2237a.f44540u.booleanValue() && SharepreferenceDBHandler.getCurrentAPPType(context).equals("m3u")) {
            context.startActivity(new Intent(context, (Class<?>) ImportM3uActivity.class));
        }
    }

    public static boolean n(Context context) {
        return context.getSharedPreferences("automation_epg", 0).getString("automation_epg", "").equals("checked");
    }

    public static void n0(Context context) {
        ActivityManager activityManager;
        if (context != null) {
            AbstractC2237a.f44488b0.booleanValue();
            if (AbstractC2237a.f44531p1 && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
                List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(10);
                if (!runningTasks.isEmpty()) {
                    for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
                        if (runningTaskInfo.topActivity != null) {
                            String className = runningTaskInfo.topActivity.getClassName();
                            MyApplication.E("topActivity : " + className);
                            if (className.equals(NSTIJKPlayerSkyActivity.class.getName()) || className.equals(NSTEXOPlayerSkyActivity.class.getName()) || className.equals(HoneyPlayer.class.getName()) || className.equals(ExoDownloadedPlayerTwo.class.getName()) || className.equals(ExoPlayerMoviesSeries.class.getName())) {
                                C2386a.b(context).d(new Intent("pip_mode_switch_user"));
                            }
                        }
                    }
                }
            }
            MyApplication.p().I();
            AbstractC2237a.f44488b0 = Boolean.FALSE;
            Intent intent = AbstractC2237a.f44538t.booleanValue() ? new Intent(context, (Class<?>) MultiUserActivity.class) : (AbstractC2237a.f44540u.booleanValue() && AbstractC2237a.f44542v.booleanValue()) ? new Intent(context, (Class<?>) RoutingActivity.class) : AbstractC2237a.f44534r.booleanValue() ? new Intent(context, (Class<?>) LoginM3uActivity.class) : AbstractC2237a.f44529p.booleanValue() ? new Intent(context, (Class<?>) LoginActivityOneStream.class) : new Intent(context, (Class<?>) LoginActivity.class);
            SharedPreferences sharedPreferences = context.getSharedPreferences("loginPrefs", 0);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            String string = sharedPreferences.getString("selectedEPGShift", "");
            editorEdit.clear();
            editorEdit.apply();
            editorEdit.putString("selectedEPGShift", string);
            editorEdit.apply();
            SharedPreferences.Editor editorEdit2 = context.getSharedPreferences("sharedprefremberme", 0).edit();
            editorEdit2.clear();
            editorEdit2.apply();
            if (AbstractC2237a.f44540u.booleanValue() && AbstractC2237a.f44542v.booleanValue()) {
                SharedPreferences.Editor editorEdit3 = context.getSharedPreferences("sharedprefremberme", 0).edit();
                editorEdit3.putBoolean("savelogin", false);
                editorEdit3.apply();
                if (SharepreferenceDBHandler.getCurrentAPPType(context).equalsIgnoreCase("m3u")) {
                    SharedPreferences.Editor editorEdit4 = context.getSharedPreferences("sharedprefremberme", 0).edit();
                    editorEdit4.clear();
                    editorEdit4.apply();
                }
            }
            if (AbstractC2237a.f44536s.booleanValue() && !(AbstractC2237a.f44540u.booleanValue() && AbstractC2237a.f44542v.booleanValue())) {
                context.startActivity(intent);
            } else {
                context.startActivity(intent);
                ((Activity) context).finish();
            }
        }
    }

    public static boolean o(Context context) {
        C2920h c2920hQ = C2920h.q();
        int i9 = c2920hQ.i(context);
        if (i9 == 0) {
            return true;
        }
        c2920hQ.m(i9);
        return false;
    }

    public static String o0(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b9 : bArrDigest) {
                String hexString = Integer.toHexString(b9 & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e9) {
            e9.printStackTrace();
            return "";
        }
    }

    public static String p() {
        return V0(Calendar.getInstance().getTime().toString());
    }

    public static String p0(String str) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").format(new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.US).parse(str));
        } catch (ParseException e9) {
            e9.printStackTrace();
            return "";
        }
    }

    public static String q() {
        return p0(Calendar.getInstance().getTime().toString());
    }

    public static int q0(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static void r(Context context) {
        try {
            s(context.getCacheDir());
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public static int r0(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static boolean s(File file) {
        if (file == null || !file.isDirectory()) {
            if (file == null || !file.isFile()) {
                return false;
            }
            return file.delete();
        }
        for (String str : file.list()) {
            if (!s(new File(file, str))) {
                return false;
            }
        }
        return file.delete();
    }

    public static String[] s0() {
        return Build.VERSION.SDK_INT >= 33 ? f44706s : f44707t;
    }

    public static void t(File file) {
        try {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    t(file2);
                }
            }
            file.delete();
        } catch (Exception unused) {
        }
    }

    public static void t0(Context context, int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        f44699l = new C2858a(context);
        Intent intent = new Intent(context, (Class<?>) NSTIJKPlayerEPGActivity.class);
        intent.putExtra("MultiPlayer", "true");
        intent.putExtra("OPENED_STREAM_ID", i9);
        intent.putExtra("ONESTREAM_STREAM_ID", str8);
        intent.putExtra("STREAM_TYPE", str);
        intent.putExtra("VIDEO_NUM", !str2.equals("") ? r0(str2) : -1);
        intent.putExtra("VIDEO_TITLE", str3);
        intent.putExtra("EPG_CHANNEL_ID", str4);
        intent.putExtra("EPG_CHANNEL_LOGO", str5);
        intent.putExtra("OPENED_CAT_ID", str6);
        intent.putExtra("VIDEO_URL", str7);
        context.startActivity(intent);
    }

    public static long u(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0L;
        }
    }

    public static void u0(Context context, String str, int i9, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Intent intent;
        if (context != null) {
            try {
                String catchUpPlayerAppName = SharepreferenceDBHandler.getCatchUpPlayerAppName(context);
                if (!SharepreferenceDBHandler.getCatchUpPlayerAppName(context).equals(CookieSpecs.DEFAULT) && !new ExternalPlayerDataBase(context).CheckPlayerExistense(catchUpPlayerAppName)) {
                    SharepreferenceDBHandler.setCatchUpPlayer(CookieSpecs.DEFAULT, CookieSpecs.DEFAULT, context);
                }
                f44699l = new C2858a(context);
                String catchUpPlayerPkgName = SharepreferenceDBHandler.getCatchUpPlayerPkgName(context);
                if (!catchUpPlayerPkgName.equals(CookieSpecs.DEFAULT)) {
                    String strT = T(context, i9, str6, str8);
                    String catchUpPlayerAppName2 = SharepreferenceDBHandler.getCatchUpPlayerAppName(context);
                    Intent intent2 = new Intent(context, (Class<?>) PlayExternalPlayerActivity.class);
                    if (SharepreferenceDBHandler.getCurrentAPPType(context).equals("onestream_api")) {
                        intent2.putExtra("url", str9);
                    } else {
                        intent2.putExtra("url", strT);
                    }
                    intent2.putExtra("packagename", catchUpPlayerPkgName);
                    intent2.putExtra("app_name", catchUpPlayerAppName2);
                    context.startActivity(intent2);
                    return;
                }
                if (f44699l.x() == 3) {
                    f44699l.U(context.getResources().getString(a7.j.f13349p2));
                    intent = new Intent(context, (Class<?>) HoneyPlayer.class);
                } else {
                    intent = new Intent(context, (Class<?>) HoneyPlayer.class);
                }
                AbstractC2237a.f44508i = Boolean.TRUE;
                intent.putExtra("OPENED_STREAM_ID", i9);
                intent.putExtra("type", "catch_up");
                intent.putExtra("VIDEO_NUM", r0(str2));
                intent.putExtra("VIDEO_TITLE", str3);
                intent.putExtra("STREAM_START_TIME", str6);
                intent.putExtra("VIDEO_URL", str9);
                intent.putExtra("STREAM_STOP_TIME", str8);
                context.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    public static int v(int i9, int i10) {
        return ((i9 + i10) - 1) / i10;
    }

    public static void v0(Context context, String str, int i9, String str2, String str3, String str4, String str5, List list, String str6, String str7, String str8) {
        String str9;
        String str10;
        String str11;
        String str12;
        Intent intent;
        String str13;
        String str14;
        String str15;
        String str16;
        Intent intent2;
        if (context != null) {
            String seriesPlayerPkgName = SharepreferenceDBHandler.getSeriesPlayerPkgName(context);
            String str17 = "VIDEO_TITLE";
            String str18 = "type";
            if (seriesPlayerPkgName.equals("default_native")) {
                f44699l = new C2858a(context);
                String str19 = SharepreferenceDBHandler.getCurrentAPPType(context).equalsIgnoreCase("m3u") ? "series_m3u" : "series";
                if (f44699l.x() == 3) {
                    f44699l.U(context.getResources().getString(a7.j.f13349p2));
                    intent2 = new Intent(context, (Class<?>) ExoPlayerMoviesSeries.class);
                    intent2.putExtra("type", str19);
                    intent2.putExtra("OPENED_STREAM_ID", i9);
                    intent2.putExtra("STREAM_TYPE", str2);
                    int iR0 = r0(str4);
                    intent2.putExtra("tmdb_id", str8);
                    intent2.putExtra("VIDEO_NUM", iR0);
                    intent2.putExtra("VIDEO_TITLE", str5);
                    str16 = str3;
                    str14 = "CONTAINER_EXTENSION";
                    intent2.putExtra(str14, str16);
                    intent2.putExtra("EPISODES", (Serializable) list);
                    str18 = "type";
                    str13 = "STREAM_TYPE";
                    str15 = "VIDEO_URL";
                    intent2.putExtra(str15, str6);
                } else {
                    str13 = "STREAM_TYPE";
                    str14 = "CONTAINER_EXTENSION";
                    str15 = "VIDEO_URL";
                    str16 = str3;
                    intent2 = new Intent(context, (Class<?>) ExoPlayerMoviesSeries.class);
                    intent2.putExtra("tmdb_id", str8);
                }
                intent2.putExtra(str18, str19);
                intent2.putExtra("ONESTREAM_STREAM_ID", str7);
                intent2.putExtra("tmdb_id", str8);
                intent2.putExtra("OPENED_STREAM_ID", i9);
                intent2.putExtra(str13, str2);
                intent2.putExtra("VIDEO_NUM", r0(str4));
                intent2.putExtra("VIDEO_TITLE", str5);
                intent2.putExtra(str14, str16);
                intent2.putExtra("EPISODES", (Serializable) list);
                intent2.putExtra(str15, str6);
                context.startActivity(intent2);
                return;
            }
            if (!seriesPlayerPkgName.equals(CookieSpecs.DEFAULT)) {
                String strU = (SharepreferenceDBHandler.getCurrentAPPType(context).equals("m3u") || SharepreferenceDBHandler.getCurrentAPPType(context).equalsIgnoreCase("stalker_api") || SharepreferenceDBHandler.getCurrentAPPType(context).equals("onestream_api")) ? str6 : U(context, i9, str3, "series");
                String seriesPlayerAppName = SharepreferenceDBHandler.getSeriesPlayerAppName(context);
                Intent intent3 = new Intent(context, (Class<?>) PlayExternalPlayerActivity.class);
                intent3.putExtra("url", strU);
                intent3.putExtra("packagename", seriesPlayerPkgName);
                intent3.putExtra("app_name", seriesPlayerAppName);
                context.startActivity(intent3);
                return;
            }
            f44699l = new C2858a(context);
            String str20 = SharepreferenceDBHandler.getCurrentAPPType(context).equalsIgnoreCase("m3u") ? "series_m3u" : SharepreferenceDBHandler.getCurrentAPPType(context).equalsIgnoreCase("stalker_api") ? "movies_stalker" : "series";
            if (f44699l.x() == 3) {
                f44699l.U(context.getResources().getString(a7.j.f13349p2));
                Intent intent4 = new Intent(context, (Class<?>) HoneyPlayer.class);
                intent4.putExtra("type", str20);
                intent4.putExtra("OPENED_STREAM_ID", i9);
                intent4.putExtra("ONESTREAM_STREAM_ID", str7);
                intent4.putExtra("STREAM_TYPE", str2);
                int iR02 = r0(str4);
                intent4.putExtra("tmdb_id", str8);
                intent4.putExtra("VIDEO_NUM", iR02);
                str17 = "VIDEO_TITLE";
                str10 = str5;
                intent4.putExtra(str17, str10);
                intent4.putExtra("CONTAINER_EXTENSION", str3);
                intent4.putExtra("EPISODES", (Serializable) list);
                str12 = "EPISODES";
                intent4.putExtra("VIDEO_URL", str6);
                intent = intent4;
                str11 = "VIDEO_URL";
                str9 = str3;
            } else {
                str9 = str3;
                str10 = str5;
                str11 = "VIDEO_URL";
                str12 = "EPISODES";
                intent = new Intent(context, (Class<?>) HoneyPlayer.class);
            }
            intent.putExtra("type", str20);
            intent.putExtra("OPENED_STREAM_ID", i9);
            intent.putExtra("STREAM_TYPE", str2);
            int iR03 = r0(str4);
            intent.putExtra("ONESTREAM_STREAM_ID", str7);
            intent.putExtra("VIDEO_NUM", iR03);
            intent.putExtra(str17, str10);
            intent.putExtra("tmdb_id", str8);
            intent.putExtra("CONTAINER_EXTENSION", str9);
            intent.putExtra(str12, (Serializable) list);
            intent.putExtra(str11, str6);
            context.startActivity(intent);
        }
    }

    public static void w(Activity activity, View view) {
        if (activity != null && Build.VERSION.SDK_INT >= 35) {
            Window window = activity.getWindow();
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            W.b(window, false);
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: m7.v
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    return w.e0(view2, windowInsets);
                }
            });
        }
    }

    public static void w0(Context context, String str, int i9, String str2, String str3, String str4, String str5, String str6, int i10, String str7, String str8, String str9) {
        Intent intent;
        if (context != null) {
            String str10 = SharepreferenceDBHandler.getCurrentAPPType(context).equalsIgnoreCase("m3u") ? "movies_m3u" : SharepreferenceDBHandler.getCurrentAPPType(context).equalsIgnoreCase("stalker_api") ? "movies_stalker" : "movies";
            String vODPlayerAppName = SharepreferenceDBHandler.getVODPlayerAppName(context);
            String vODPlayerPkgName = SharepreferenceDBHandler.getVODPlayerPkgName(context);
            if (!vODPlayerPkgName.equals("default_native")) {
                if (!vODPlayerPkgName.equals(CookieSpecs.DEFAULT)) {
                    String strU = str6;
                    if (!SharepreferenceDBHandler.getCurrentAPPType(context).equalsIgnoreCase("m3u") && !SharepreferenceDBHandler.getCurrentAPPType(context).equalsIgnoreCase("stalker_api") && !SharepreferenceDBHandler.getCurrentAPPType(context).equalsIgnoreCase("onestream_api")) {
                        strU = U(context, i9, str3, "movie");
                    }
                    Intent intent2 = new Intent(context, (Class<?>) PlayExternalPlayerActivity.class);
                    intent2.putExtra("url", strU);
                    intent2.putExtra("packagename", vODPlayerPkgName);
                    intent2.putExtra("app_name", vODPlayerAppName);
                    context.startActivity(intent2);
                    return;
                }
                C2858a c2858a = new C2858a(context);
                f44699l = c2858a;
                Intent intent3 = c2858a.x() == 3 ? new Intent(context, (Class<?>) ExoPlayerMoviesSeriesActivity.class) : new Intent(context, (Class<?>) HoneyPlayer.class);
                if (SharepreferenceDBHandler.getCurrentAPPType(context).equalsIgnoreCase("m3u")) {
                    intent3.putExtra("cat_id", str9);
                }
                intent3.putExtra("type", str10);
                intent3.putExtra("OPENED_STREAM_ID", i9);
                intent3.putExtra("ONESTREAM_STREAM_ID", str7);
                intent3.putExtra("STREAM_TYPE", str2);
                intent3.putExtra("STREAM_TOTAL_DURATION", i10);
                int iR0 = r0(str4);
                intent3.putExtra("tmdb_id", str8);
                intent3.putExtra("VIDEO_NUM", iR0);
                intent3.putExtra("VIDEO_TITLE", str5);
                intent3.putExtra("CONTAINER_EXTENSION", str3);
                intent3.putExtra("VIDEO_URL", str6);
                context.startActivity(intent3);
                return;
            }
            f44699l = new C2858a(context);
            Log.i("playerISHere", "playerIS:" + str);
            if (f44699l.x() == 3) {
                intent = new Intent(context, (Class<?>) ExoPlayerMoviesSeriesActivity.class);
                intent.putExtra("tmdb_id", str8);
            } else {
                Log.i("herePlayer", "honey");
                intent = new Intent(context, (Class<?>) ExoPlayerMoviesSeries.class);
                Log.i("calledExoMovieSeries", "calledd");
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(context).equalsIgnoreCase("m3u")) {
                intent.putExtra("cat_id", str9);
            }
            intent.putExtra("type", str10);
            intent.putExtra("OPENED_STREAM_ID", i9);
            intent.putExtra("STREAM_TYPE", str2);
            intent.putExtra("STREAM_TOTAL_DURATION", i10);
            int iR02 = r0(str4);
            intent.putExtra("VIDEO_NUM", iR02);
            intent.putExtra("VIDEO_TITLE", str5);
            intent.putExtra("ONESTREAM_STREAM_ID", str7);
            intent.putExtra("tmdb_id", str8);
            intent.putExtra("cat_id", str3);
            intent.putExtra("VIDEO_URL", str6);
            context.startActivity(intent);
            Log.i("DataforPlay", "type:" + str10 + "\nOPENED_STREAM_ID" + i9 + "\nSTREAM_TYPE" + str2 + "\nSTREAM_TOTAL_DURATION" + i10 + "\nindex" + iR02 + "\nVIDEO_NUM" + iR02 + "\nVIDEO_TITLE" + str5 + "\nCONTAINER_EXTENSION" + str3 + "\nVIDEO_URL" + str6);
        }
    }

    public static long x(String str, Context context) {
        if (str == null) {
            return 0L;
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone(new C2858a(context).C()));
            return simpleDateFormat.parse(str.substring(0, 14)).getTime();
        } catch (NumberFormatException e9) {
            Log.e("XMLTVReader", "Exception", e9);
            return 0L;
        } catch (Exception e10) {
            Log.e("XMLTVReader", "Exception", e10);
            return 0L;
        }
    }

    public static void x0(Context context, String str, int i9, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (context != null) {
            f44699l = new C2858a(context);
            String livePlayerPkgName = SharepreferenceDBHandler.getLivePlayerPkgName(context);
            Intent intent = (livePlayerPkgName == null || !livePlayerPkgName.equalsIgnoreCase(CookieSpecs.DEFAULT)) ? new Intent(context, (Class<?>) NSTEXOPlayerSkyActivity.class) : new Intent(context, (Class<?>) NSTIJKPlayerSkyActivity.class);
            intent.putExtra("OPENED_STREAM_ID", i9);
            intent.putExtra("STREAM_TYPE", str2);
            intent.putExtra("VIDEO_NUM", i10);
            intent.putExtra("VIDEO_TITLE", str3);
            intent.putExtra("EPG_CHANNEL_ID", str4);
            intent.putExtra("EPG_CHANNEL_LOGO", str5);
            intent.putExtra("OPENED_CAT_ID", str6);
            intent.putExtra("VIDEO_URL", str7);
            intent.putExtra("OPENED_CAT_NAME", str8);
            context.startActivity(intent);
        }
    }

    public static void y(Context context) {
        String strS0 = S0(C2937a.a());
        String packageName = context.getApplicationContext().getPackageName();
        String strC0 = c0(context);
        String strS02 = S0(C2940d.d());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.US);
        if (u(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(context))), simpleDateFormat.format(new Date())) < C2939c.p() || strS0 == null || strS02 == null) {
            return;
        }
        if (strC0.equals(strS0) && packageName.equals(strS02)) {
            return;
        }
        Toast.makeText(context, S0(w7.k.a() + w7.k.i()) + S0(com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.c.i() + com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.c.h()) + S0(com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.b.f() + com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.b.h()), 1).show();
        ((Activity) context).finishAffinity();
    }

    public static void y0(Context context, String str, int i9, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Intent intent;
        if (context != null) {
            String ePGPlayerAppName = SharepreferenceDBHandler.getEPGPlayerAppName(context);
            if (!SharepreferenceDBHandler.getEPGPlayerPKGName(context).equals(CookieSpecs.DEFAULT) && !new ExternalPlayerDataBase(context).CheckPlayerExistense(ePGPlayerAppName)) {
                SharepreferenceDBHandler.setEPGPlayer(CookieSpecs.DEFAULT, CookieSpecs.DEFAULT, context);
            }
            String ePGPlayerPKGName = SharepreferenceDBHandler.getEPGPlayerPKGName(context);
            String str10 = "";
            if (ePGPlayerPKGName.equals(CookieSpecs.DEFAULT)) {
                C2858a c2858a = new C2858a(context);
                f44699l = c2858a;
                if (c2858a.x() == 3) {
                    f44699l.U(context.getResources().getString(a7.j.f13349p2));
                    intent = new Intent(context, (Class<?>) NSTIJKPlayerEPGActivity.class);
                } else {
                    intent = new Intent(context, (Class<?>) NSTIJKPlayerEPGActivity.class);
                }
                intent.putExtra("MultiPlayer", "false");
                intent.putExtra("OPENED_STREAM_ID", i9);
                intent.putExtra("ONESTREAM_STREAM_ID", str9);
                intent.putExtra("STREAM_TYPE", str2);
                intent.putExtra("VIDEO_NUM", !str3.equals("") ? r0(str3) : -1);
                intent.putExtra("VIDEO_TITLE", str4);
                intent.putExtra("EPG_CHANNEL_ID", str5);
                intent.putExtra("EPG_CHANNEL_LOGO", str6);
                intent.putExtra("OPENED_CAT_ID", str7);
                intent.putExtra("VIDEO_URL", str8);
                context.startActivity(intent);
                return;
            }
            String string = context.getSharedPreferences("allowedFormat", 0).getString("allowedFormat", "");
            if (string == null || string.isEmpty() || string.equals("") || !string.equals(CookieSpecs.DEFAULT)) {
                if (string != null && !string.isEmpty() && !string.equals("") && string.equals("ts")) {
                    str10 = ".ts";
                } else if (string != null && !string.isEmpty() && !string.equals("") && string.equals("m3u8")) {
                    str10 = ".m3u8";
                }
            }
            String strV = SharepreferenceDBHandler.getCurrentAPPType(context).equalsIgnoreCase("m3u") ? str8 : V(context, i9, str10, "live");
            String ePGPlayerAppName2 = SharepreferenceDBHandler.getEPGPlayerAppName(context);
            Intent intent2 = new Intent(context, (Class<?>) PlayExternalPlayerActivity.class);
            intent2.putExtra("url", strV);
            intent2.putExtra("packagename", ePGPlayerPKGName);
            intent2.putExtra("app_name", ePGPlayerAppName2);
            context.startActivity(intent2);
        }
    }

    public static Retrofit z(Context context) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return new Retrofit.Builder().baseUrl("http://51.158.145.183/").client(builder.connectTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).readTimeout(60L, timeUnit).followRedirects(false).build()).addConverterFactory(GsonConverterFactory.create()).build();
    }

    public static void z0(Context context) {
        if (SharepreferenceDBHandler.getMaintanceModeState(context)) {
            context.startActivity(new Intent(context, (Class<?>) MaintanencePannelActivity.class));
        } else {
            Log.e("Hrh", "no rediret");
        }
    }

    public void K0(RecordingActivity recordingActivity, File file, Q q9, ArrayList arrayList, TextView textView) {
        if (recordingActivity != null) {
            RelativeLayout relativeLayout = (RelativeLayout) recordingActivity.findViewById(a7.f.We);
            LayoutInflater layoutInflater = (LayoutInflater) recordingActivity.getSystemService("layout_inflater");
            C2858a c2858a = new C2858a(recordingActivity);
            f44699l = c2858a;
            View viewInflate = layoutInflater.inflate(c2858a.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12873s2 : a7.g.f12867r2, relativeLayout);
            PopupWindow popupWindow = new PopupWindow(recordingActivity);
            f44696i = popupWindow;
            popupWindow.setContentView(viewInflate);
            f44696i.setWidth(-1);
            f44696i.setHeight(-1);
            f44696i.setFocusable(true);
            f44696i.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(a7.f.f12197L0);
            Button button2 = (Button) viewInflate.findViewById(a7.f.f12482o0);
            if (button != null) {
                button.setOnFocusChangeListener(new k((View) button, recordingActivity));
                button.requestFocus();
                button.requestFocusFromTouch();
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new k((View) button2, recordingActivity));
            }
            button2.setOnClickListener(new g());
            if (button != null) {
                button.setOnClickListener(new h(file, recordingActivity, arrayList, q9, textView));
            }
        }
    }

    public void L0(Activity activity) {
        if (activity != null) {
            RelativeLayout relativeLayout = (RelativeLayout) activity.findViewById(a7.f.We);
            LayoutInflater layoutInflater = (LayoutInflater) activity.getSystemService("layout_inflater");
            C2858a c2858a = new C2858a(activity);
            f44699l = c2858a;
            View viewInflate = layoutInflater.inflate(c2858a.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12903x2 : a7.g.f12897w2, relativeLayout);
            PopupWindow popupWindow = new PopupWindow(activity);
            f44696i = popupWindow;
            popupWindow.setContentView(viewInflate);
            f44696i.setWidth(-1);
            f44696i.setHeight(-1);
            f44696i.setFocusable(true);
            f44696i.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(a7.f.f12197L0);
            Button button2 = (Button) viewInflate.findViewById(a7.f.f12482o0);
            if (button != null) {
                button.setOnFocusChangeListener(new k((View) button, activity));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new k((View) button2, activity));
            }
            button2.setOnClickListener(new a());
            if (button != null) {
                button.setOnClickListener(new b(activity));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void O0(android.app.Activity r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.w.O0(android.app.Activity, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String):void");
    }

    public void U0(Context context, String str) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("downloadStatus", 0);
            f44698k = sharedPreferences;
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("downloadStatus", str);
            editorEdit.apply();
        }
    }
}
