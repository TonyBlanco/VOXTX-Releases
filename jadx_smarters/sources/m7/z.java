package m7;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import b7.AbstractC1232b;
import b7.InterfaceC1233c;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.nst.iptvsmarterstvbox.miscelleneious.MyApplication;
import com.nst.iptvsmarterstvbox.model.callback.LoginCallback;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.MultiUserDBHandler;
import com.nst.iptvsmarterstvbox.model.database.RecentWatchDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SeriesRecentWatchDatabase;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.http.client.methods.HttpHead;
import org.json.JSONObject;
import u7.C2858a;

/* JADX INFO: loaded from: classes.dex */
public class z implements InterfaceC1233c, z7.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f44768a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f44769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f44770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f44771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f44772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f44773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Activity f44774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n7.d f44775i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SharedPreferences.Editor f44776j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SharedPreferences f44777k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ProgressDialog f44778l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f44779m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LiveStreamDBHandler f44780n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RecentWatchDBHandler f44781o;

    public class a implements MyApplication.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f44782a;

        /* JADX INFO: renamed from: m7.z$a$a, reason: collision with other inner class name */
        public class RunnableC0389a implements Runnable {
            public RunnableC0389a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                z.this.z();
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                z.this.r();
            }
        }

        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                z.this.z();
            }
        }

        public a(String str) {
            this.f44782a = str;
        }

        @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
        public void a(String str) {
        }

        @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
        public void b(String str) {
            MyApplication.p().D("MU" + str, z.this.f44768a);
            z.this.f44774h.runOnUiThread(new c());
        }

        @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
        public void onSuccess() {
            Activity activity;
            Runnable bVar;
            if (this.f44782a.equalsIgnoreCase(SharepreferenceDBHandler.getClientSecurityUrl(z.this.f44768a))) {
                activity = z.this.f44774h;
                bVar = new RunnableC0389a();
            } else {
                activity = z.this.f44774h;
                bVar = new b();
            }
            activity.runOnUiThread(bVar);
        }
    }

    public class b extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f44787a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f44788c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f44789d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f44790e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f44791f;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f44793a;

            public a(View view) {
                this.f44793a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f44793a;
                    if (view2 == null || view2.getTag() == null || !this.f44793a.getTag().equals("1")) {
                        View view3 = this.f44793a;
                        if (view3 == null || view3.getTag() == null || !this.f44793a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = b.this.f44791f;
                        }
                    } else {
                        linearLayout = b.this.f44790e;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f44793a;
                    if (view4 == null || view4.getTag() == null || !this.f44793a.getTag().equals("1")) {
                        View view5 = this.f44793a;
                        if (view5 == null || view5.getTag() == null || !this.f44793a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = b.this.f44791f;
                        }
                    } else {
                        linearLayout = b.this.f44790e;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        public b(Activity activity) {
            super(activity);
            this.f44787a = activity;
        }

        public final /* synthetic */ void d() {
            new c(z.this, null).execute(new Void[0]);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            try {
                if (id == a7.f.f12524s1) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: m7.A
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f44431a.d();
                        }
                    }, 200L);
                    dismiss();
                } else if (id != a7.f.f12313X0) {
                } else {
                    dismiss();
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(new C2858a(z.this.f44768a).A().equals(AbstractC2237a.f44453K0) ? a7.g.f12819j2 : a7.g.f12813i2);
            this.f44788c = (TextView) findViewById(a7.f.f12524s1);
            this.f44789d = (TextView) findViewById(a7.f.f12313X0);
            this.f44790e = (LinearLayout) findViewById(a7.f.Ia);
            this.f44791f = (LinearLayout) findViewById(a7.f.V8);
            this.f44788c.setOnClickListener(this);
            this.f44789d.setOnClickListener(this);
            TextView textView = this.f44788c;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f44789d;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    public class c extends AsyncTask {
        public c() {
        }

        public /* synthetic */ c(z zVar, a aVar) {
            this();
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
                e9.printStackTrace();
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                if (AbstractC2237a.f44526o.booleanValue() || AbstractC2237a.f44523n.booleanValue()) {
                    z.this.z();
                    return;
                } else {
                    z.this.r();
                    return;
                }
            }
            z.this.p();
            z zVar = z.this;
            b bVar = zVar.new b(zVar.f44774h);
            bVar.setCancelable(false);
            bVar.show();
        }
    }

    public z(Context context, Activity activity) {
        this.f44768a = context;
        this.f44774h = activity;
        this.f44775i = new n7.d(this, context);
        this.f44780n = new LiveStreamDBHandler(context);
        this.f44781o = new RecentWatchDBHandler(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("loginPrefsserverurl", 0);
        this.f44777k = sharedPreferences;
        this.f44776j = sharedPreferences.edit();
        ProgressDialog progressDialog = new ProgressDialog(context);
        this.f44778l = progressDialog;
        progressDialog.setMessage(context.getResources().getString(a7.j.f13392t5));
        this.f44778l.setCanceledOnTouchOutside(false);
        this.f44778l.setCancelable(false);
        this.f44778l.setProgressStyle(0);
    }

    private void B(String str) {
        ArrayList arrayList = (str == null || str.equals("") || str.isEmpty()) ? null : new ArrayList(Arrays.asList(str.split(",")));
        if (arrayList == null || arrayList.size() < 1) {
            if (arrayList == null || arrayList.size() != 0) {
                return;
            }
            b();
            Toast.makeText(this.f44768a, "Your Account is invalid or has expired !", 0).show();
            return;
        }
        try {
            this.f44776j.putString(AbstractC2237a.f44454L, ((String) arrayList.get(0)).trim());
            this.f44776j.commit();
            arrayList.remove(0);
            this.f44775i.h(this.f44770d, this.f44771e, arrayList);
        } catch (IOException e9) {
            e9.printStackTrace();
        }
    }

    public void A() {
        x();
        new c(this, null).execute(new Void[0]);
    }

    @Override // z7.b
    public void b() {
        p();
    }

    @Override // b7.InterfaceC1233c
    public void b0(int i9) {
        Activity activity;
        Runnable runnable;
        String clientSecurityUrl = SharepreferenceDBHandler.getClientSecurityUrl(this.f44768a);
        if (AbstractC2237a.f44477W0.booleanValue()) {
            MyApplication.p().G(this.f44768a, new a(clientSecurityUrl));
            return;
        }
        if (clientSecurityUrl.equalsIgnoreCase(SharepreferenceDBHandler.getClientSecurityUrl(this.f44768a))) {
            activity = this.f44774h;
            runnable = new Runnable() { // from class: m7.x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44766a.z();
                }
            };
        } else {
            activity = this.f44774h;
            runnable = new Runnable() { // from class: m7.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44767a.r();
                }
            };
        }
        activity.runOnUiThread(runnable);
    }

    @Override // z7.f
    public void c(String str) {
        p();
        if (!str.equals("")) {
            w.P0(this.f44768a, str);
        } else if (!AbstractC2237a.f44523n.booleanValue()) {
            w.P0(this.f44768a, "Your Account is invalid or has expired !");
        } else {
            Context context = this.f44768a;
            Toast.makeText(context, context.getResources().getString(a7.j.f12966C2), 0).show();
        }
    }

    @Override // z7.b
    public void d(String str) {
        p();
        w.P0(this.f44768a, str);
    }

    @Override // z7.f
    public void e(String str) {
        p();
        w.P0(this.f44768a, str);
    }

    @Override // z7.f
    public void h0(ArrayList arrayList, String str) {
    }

    @Override // z7.f
    public void m(LoginCallback loginCallback, String str) {
        Toast toastMakeText;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        Intent intent;
        if (this.f44768a != null) {
            if (loginCallback == null || loginCallback.getUserLoginInfo() == null) {
                p();
                d(this.f44768a.getResources().getString(a7.j.f12996F2));
                return;
            }
            if (loginCallback.getUserLoginInfo().getAuth().intValue() == 1) {
                String status = loginCallback.getUserLoginInfo().getStatus();
                if (status.equals("Active")) {
                    String username = loginCallback.getUserLoginInfo().getUsername();
                    String password = loginCallback.getUserLoginInfo().getPassword();
                    String port = loginCallback.getServerInfo().getPort();
                    String url = loginCallback.getServerInfo().getUrl();
                    String expDate = loginCallback.getUserLoginInfo().getExpDate();
                    String isTrial = loginCallback.getUserLoginInfo().getIsTrial();
                    String activeCons = loginCallback.getUserLoginInfo().getActiveCons();
                    String createdAt = loginCallback.getUserLoginInfo().getCreatedAt();
                    String maxConnections = loginCallback.getUserLoginInfo().getMaxConnections();
                    String serverProtocal = loginCallback.getServerInfo().getServerProtocal();
                    String httpsPort = loginCallback.getServerInfo().getHttpsPort();
                    String rtmpPort = loginCallback.getServerInfo().getRtmpPort();
                    String timezone = loginCallback.getServerInfo().getTimezone();
                    SharedPreferences.Editor editorEdit = this.f44768a.getSharedPreferences("loginPrefs", 0).edit();
                    SharedPreferences sharedPreferences = this.f44768a.getSharedPreferences("loginprefsmultiuser", 0);
                    SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                    String string = sharedPreferences.getString("name", "");
                    String string2 = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
                    String string3 = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
                    String string4 = sharedPreferences.getString(AbstractC2237a.f44454L, "");
                    editorEdit2.putString("name", this.f44769c);
                    editorEdit2.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, username);
                    editorEdit2.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, password);
                    editorEdit2.putString(AbstractC2237a.f44454L, url);
                    MultiUserDBHandler multiUserDBHandler = new MultiUserDBHandler(this.f44768a);
                    int userID = SharepreferenceDBHandler.getUserID(this.f44768a);
                    multiUserDBHandler.updateMultiUser(userID, url);
                    if (this.f44779m) {
                        str2 = "name";
                        str11 = string3;
                        str3 = string4;
                        str6 = "";
                        str4 = serverProtocal;
                        str10 = timezone;
                        str5 = maxConnections;
                        str9 = rtmpPort;
                        str12 = createdAt;
                        str7 = httpsPort;
                        str8 = activeCons;
                        multiUserDBHandler.updateEditMultiUserdetails(userID, this.f44769c, this.f44770d, this.f44771e, AbstractC2237a.f44482Z, url);
                    } else {
                        str2 = "name";
                        str3 = string4;
                        str4 = serverProtocal;
                        str5 = maxConnections;
                        str6 = "";
                        str7 = httpsPort;
                        str8 = activeCons;
                        str9 = rtmpPort;
                        str10 = timezone;
                        str11 = string3;
                        str12 = createdAt;
                    }
                    editorEdit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, username);
                    editorEdit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, password);
                    editorEdit.putString("serverPort", port);
                    editorEdit.putString("serverUrl", url);
                    editorEdit.putString("expDate", expDate);
                    editorEdit.putString("isTrial", isTrial);
                    editorEdit.putString("activeCons", str8);
                    editorEdit.putString("createdAt", str12);
                    editorEdit.putString("maxConnections", str5);
                    editorEdit.putString(AbstractC2237a.f44454L, url);
                    editorEdit.putString("serverProtocol", str4);
                    editorEdit.putString("serverPortHttps", str7);
                    editorEdit.putString("serverPortRtmp", str9);
                    editorEdit.putString("serverTimeZone", str10);
                    editorEdit.apply();
                    editorEdit2.apply();
                    SharedPreferences sharedPreferences2 = this.f44768a.getSharedPreferences("allowedFormat", 0);
                    SharedPreferences.Editor editorEdit3 = sharedPreferences2.edit();
                    SharedPreferences sharedPreferences3 = this.f44768a.getSharedPreferences("timeFormat", 0);
                    SharedPreferences.Editor editorEdit4 = sharedPreferences3.edit();
                    String str13 = str6;
                    String string5 = sharedPreferences2.getString("allowedFormat", str13);
                    if (string5 != null && string5.equals(str13)) {
                        editorEdit3.putString("allowedFormat", "ts");
                        editorEdit3.apply();
                    }
                    String string6 = sharedPreferences3.getString("timeFormat", AbstractC2237a.f44441E0);
                    if (string6 != null && string6.equals(str13)) {
                        editorEdit4.putString("timeFormat", AbstractC2237a.f44441E0);
                        editorEdit4.apply();
                    }
                    SharedPreferences.Editor editorEdit5 = this.f44768a.getSharedPreferences("sharedprefremberme", 0).edit();
                    editorEdit5.putBoolean("savelogin", true);
                    editorEdit5.apply();
                    p();
                    try {
                        Context context = this.f44768a;
                        Toast.makeText(context, context.getResources().getString(a7.j.f13210b3), 0).show();
                    } catch (WindowManager.BadTokenException e9) {
                        e9.printStackTrace();
                    }
                    if (this.f44768a != null && this.f44769c.equals(string) && this.f44770d.equals(string2) && this.f44771e.equals(str11) && url.equals(str3)) {
                        editorEdit2.putString(str2, this.f44769c);
                        editorEdit2.apply();
                        AbstractC2237a.f44520m = this.f44769c;
                        intent = new Intent(this.f44768a, (Class<?>) NewDashboardActivity.class);
                    } else {
                        String str14 = str2;
                        if (this.f44768a == null) {
                            return;
                        }
                        if (this.f44779m) {
                            if (this.f44780n.getEPGCount() > 0 && this.f44780n != null) {
                                String strQ = w.q();
                                this.f44780n.makeEmptyEPG();
                                this.f44780n.updateDBStatusAndDate("EPG", "2", str13, strQ);
                            }
                            if (this.f44773g) {
                                v(userID);
                            }
                            editorEdit2.putString(str14, this.f44769c);
                            editorEdit2.apply();
                            AbstractC2237a.f44520m = this.f44769c;
                            intent = new Intent(this.f44768a, (Class<?>) NewDashboardActivity.class);
                        } else {
                            editorEdit2.putString(str14, this.f44769c);
                            editorEdit2.apply();
                            AbstractC2237a.f44520m = this.f44769c;
                            intent = new Intent(this.f44768a, (Class<?>) NewDashboardActivity.class);
                        }
                    }
                    this.f44768a.startActivity(intent);
                    ((Activity) this.f44768a).finish();
                    return;
                }
                p();
                toastMakeText = Toast.makeText(this.f44768a, this.f44768a.getResources().getString(a7.j.f13016H2) + status, 0);
            } else {
                p();
                Context context2 = this.f44768a;
                toastMakeText = Toast.makeText(context2, context2.getResources().getString(a7.j.f12976D2), 0);
            }
            toastMakeText.show();
        }
    }

    public final void p() {
        try {
            ProgressDialog progressDialog = this.f44778l;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void r() {
        StringBuilder sb;
        List list;
        b7.e eVarA;
        String strJ = MyApplication.j(this.f44774h);
        String strL = MyApplication.l();
        MyApplication.p().q();
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f44768a).equals("m3u")) {
            sb = new StringBuilder();
            sb.append(b7.f.c(this.f44768a));
            sb.append("*");
            sb.append(b7.f.d(this.f44768a));
            sb.append("-");
            sb.append("playlist");
        } else {
            sb = new StringBuilder();
            sb.append(b7.f.c(this.f44768a));
            sb.append("*");
            sb.append(b7.f.d(this.f44768a));
            sb.append("-");
            sb.append(this.f44770d);
        }
        sb.append("-");
        sb.append(AbstractC1232b.f17695b);
        sb.append("-");
        sb.append(strJ);
        sb.append("-unknown-");
        sb.append(MyApplication.n());
        sb.append("-");
        sb.append(strL);
        String strZ = MyApplication.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        b7.g.f17717b = arrayList;
        arrayList.add(b7.g.a("m", "gu"));
        b7.g.f17717b.add(b7.g.a("k", b7.f.c(this.f44774h)));
        b7.g.f17717b.add(b7.g.a("sc", strZ));
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f44768a).equals("m3u")) {
            list = b7.g.f17717b;
            eVarA = b7.g.a("u", "playlist");
        } else {
            list = b7.g.f17717b;
            eVarA = b7.g.a("u", this.f44770d);
        }
        list.add(eVarA);
        b7.g.f17717b.add(b7.g.a("pw", "no_password"));
        b7.g.f17717b.add(b7.g.a("r", AbstractC1232b.f17695b));
        b7.g.f17717b.add(b7.g.a("av", strJ));
        b7.g.f17717b.add(b7.g.a("dt", "unknown"));
        b7.g.f17717b.add(b7.g.a("d", MyApplication.n()));
        b7.g.f17717b.add(b7.g.a("do", strL));
        b7.g.f17718c.b(this);
    }

    public void u(String str, String str2, String str3, String str4, boolean z9, boolean z10) {
        this.f44779m = z9;
        this.f44769c = str;
        this.f44770d = str2;
        this.f44771e = str3;
        this.f44772f = str4;
        this.f44773g = z10;
    }

    public final void v(int i9) {
        try {
            new DatabaseHandler(this.f44768a).deleteDataForUser(i9);
            new RecentWatchDBHandler(this.f44768a).deletRecentWatchForThisUser(i9);
            new SeriesRecentWatchDatabase(this.f44768a).deleteALLSeriesRecentwatch();
            LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f44768a);
            liveStreamDBHandler.deletePasswordDataForUser(i9, "api");
            liveStreamDBHandler.deleteImportStatusForUser(i9, "api");
            liveStreamDBHandler.deleteExtraLiveRecentlyWatched();
            liveStreamDBHandler.deleteALLLiveRecentlyWatched();
            liveStreamDBHandler.deleteAllEPGSources(i9, "api");
            liveStreamDBHandler.makeEmptyEPGWithSourceRef(i9, "api");
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // b7.InterfaceC1233c
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void K0(String str, int i9, boolean z9) {
        ArrayList arrayList;
        if (!z9) {
            Context context = this.f44768a;
            Toast.makeText(context, context.getResources().getString(a7.j.f12944A0), 0).show();
            return;
        }
        if (i9 == 1) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                AbstractC1232b.f17694a = jSONObject;
                if (!jSONObject.getString("status").equalsIgnoreCase("true")) {
                    Context context2 = this.f44768a;
                    Toast.makeText(context2, context2.getResources().getString(a7.j.f13071M7), 0).show();
                    return;
                }
                String string = AbstractC1232b.f17694a.getString("su");
                AbstractC1232b.f17694a.getString("ndd");
                System.currentTimeMillis();
                try {
                    b7.f.e(this.f44774h, AbstractC1232b.f17694a.optString("su"));
                    if (!AbstractC1232b.f17694a.getString("sc").equalsIgnoreCase(MyApplication.z(AbstractC1232b.f17694a.optString("su") + "*" + b7.f.d(this.f44774h) + "*" + AbstractC1232b.f17695b))) {
                        Context context3 = this.f44768a;
                        Toast.makeText(context3, context3.getResources().getString(a7.j.f12944A0), 0).show();
                        return;
                    }
                    if (string == null || string.equals("") || string.isEmpty()) {
                        arrayList = null;
                    } else {
                        string = string.toLowerCase();
                        arrayList = new ArrayList(Arrays.asList(string.split(",")));
                    }
                    if (arrayList != null && arrayList.size() > 0) {
                        for (int i10 = 0; i10 < arrayList.size() && !this.f44772f.contains((CharSequence) arrayList.get(i10)); i10++) {
                        }
                    }
                    B(string.toLowerCase());
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // z7.f
    public void w0(ArrayList arrayList, String str) {
        if (arrayList == null || arrayList.size() <= 0) {
            b();
            if (!AbstractC2237a.f44523n.booleanValue()) {
                w.P0(this.f44768a, "Your Account is invalid or has expired !");
                return;
            } else {
                Context context = this.f44768a;
                Toast.makeText(context, context.getResources().getString(a7.j.f12966C2), 0).show();
                return;
            }
        }
        try {
            this.f44776j.putString(AbstractC2237a.f44454L, ((String) arrayList.get(0)).trim());
            this.f44776j.apply();
            arrayList.remove(0);
            this.f44775i.h(this.f44770d, this.f44771e, arrayList);
        } catch (IOException e9) {
            e9.printStackTrace();
        }
    }

    public final void x() {
        try {
            ProgressDialog progressDialog = this.f44778l;
            if (progressDialog != null) {
                progressDialog.show();
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // z7.f
    public void y(LoginCallback loginCallback, String str, ArrayList arrayList) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        Intent intent;
        try {
            if (loginCallback == null || loginCallback.getUserLoginInfo() == null || loginCallback.getServerInfo() == null) {
                if (arrayList != null && arrayList.size() > 0) {
                    this.f44776j.putString(AbstractC2237a.f44454L, ((String) arrayList.get(0)).trim());
                    this.f44776j.apply();
                    arrayList.remove(0);
                    this.f44775i.h(this.f44770d, this.f44771e, arrayList);
                    return;
                }
                p();
                w.P0(this.f44768a, "Your Account is invalid or has expired !");
                return;
            }
            if (loginCallback.getUserLoginInfo() == null) {
                if (arrayList != null && arrayList.size() > 0) {
                    this.f44776j.putString(AbstractC2237a.f44454L, ((String) arrayList.get(0)).trim());
                    this.f44776j.apply();
                    arrayList.remove(0);
                    this.f44775i.h(this.f44770d, this.f44771e, arrayList);
                    return;
                }
                p();
                w.P0(this.f44768a, "Your Account is invalid or has expired !");
                return;
            }
            if (loginCallback.getUserLoginInfo().getAuth().intValue() != 1) {
                if (arrayList != null && arrayList.size() > 0) {
                    this.f44776j.putString(AbstractC2237a.f44454L, ((String) arrayList.get(0)).trim());
                    this.f44776j.apply();
                    arrayList.remove(0);
                    this.f44775i.h(this.f44770d, this.f44771e, arrayList);
                    return;
                }
                p();
                w.P0(this.f44768a, "Your Account is invalid or has expired !");
                return;
            }
            if (!loginCallback.getUserLoginInfo().getStatus().equals("Active")) {
                if (arrayList != null && arrayList.size() > 0) {
                    this.f44776j.putString(AbstractC2237a.f44454L, ((String) arrayList.get(0)).trim());
                    this.f44776j.apply();
                    arrayList.remove(0);
                    this.f44775i.h(this.f44770d, this.f44771e, arrayList);
                    return;
                }
                p();
                w.P0(this.f44768a, "Your Account is invalid or has expired !");
                return;
            }
            String username = loginCallback.getUserLoginInfo().getUsername();
            String password = loginCallback.getUserLoginInfo().getPassword();
            String port = loginCallback.getServerInfo().getPort();
            String url = loginCallback.getServerInfo().getUrl();
            String expDate = loginCallback.getUserLoginInfo().getExpDate();
            String isTrial = loginCallback.getUserLoginInfo().getIsTrial();
            String activeCons = loginCallback.getUserLoginInfo().getActiveCons();
            String createdAt = loginCallback.getUserLoginInfo().getCreatedAt();
            String maxConnections = loginCallback.getUserLoginInfo().getMaxConnections();
            String serverProtocal = loginCallback.getServerInfo().getServerProtocal();
            String httpsPort = loginCallback.getServerInfo().getHttpsPort();
            String rtmpPort = loginCallback.getServerInfo().getRtmpPort();
            String timezone = loginCallback.getServerInfo().getTimezone();
            SharedPreferences.Editor editorEdit = this.f44768a.getSharedPreferences("loginPrefs", 0).edit();
            SharedPreferences sharedPreferences = this.f44768a.getSharedPreferences("loginprefsmultiuser", 0);
            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
            String string = sharedPreferences.getString("name", "");
            String string2 = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
            String string3 = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
            String string4 = sharedPreferences.getString(AbstractC2237a.f44454L, "");
            editorEdit2.putString("name", this.f44769c);
            editorEdit2.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, username);
            editorEdit2.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, password);
            editorEdit2.putString(AbstractC2237a.f44454L, url);
            MultiUserDBHandler multiUserDBHandler = new MultiUserDBHandler(this.f44768a);
            int userID = SharepreferenceDBHandler.getUserID(this.f44768a);
            multiUserDBHandler.updateMultiUser(userID, url);
            if (this.f44779m) {
                str3 = "name";
                str10 = string3;
                str4 = string4;
                str7 = "";
                str5 = serverProtocal;
                str9 = timezone;
                str6 = maxConnections;
                str2 = rtmpPort;
                str11 = createdAt;
                str8 = httpsPort;
                str12 = activeCons;
                multiUserDBHandler.updateEditMultiUserdetails(userID, this.f44769c, this.f44770d, this.f44771e, AbstractC2237a.f44482Z, url);
            } else {
                str2 = rtmpPort;
                str3 = "name";
                str4 = string4;
                str5 = serverProtocal;
                str6 = maxConnections;
                str7 = "";
                str8 = httpsPort;
                str9 = timezone;
                str10 = string3;
                str11 = createdAt;
                str12 = activeCons;
            }
            editorEdit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, username);
            editorEdit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, password);
            editorEdit.putString("serverPort", port);
            editorEdit.putString("serverUrl", url);
            editorEdit.putString("expDate", expDate);
            editorEdit.putString("isTrial", isTrial);
            editorEdit.putString("activeCons", str12);
            editorEdit.putString("createdAt", str11);
            editorEdit.putString("maxConnections", str6);
            editorEdit.putString(AbstractC2237a.f44454L, url);
            editorEdit.putString("serverProtocol", str5);
            editorEdit.putString("serverPortHttps", str8);
            editorEdit.putString("serverPortRtmp", str2);
            editorEdit.putString("serverTimeZone", str9);
            editorEdit.apply();
            editorEdit2.apply();
            SharedPreferences sharedPreferences2 = this.f44768a.getSharedPreferences("allowedFormat", 0);
            SharedPreferences.Editor editorEdit3 = sharedPreferences2.edit();
            SharedPreferences sharedPreferences3 = this.f44768a.getSharedPreferences("timeFormat", 0);
            SharedPreferences.Editor editorEdit4 = sharedPreferences3.edit();
            String str13 = str7;
            String string5 = sharedPreferences2.getString("allowedFormat", str13);
            if (string5 != null && string5.equals(str13)) {
                editorEdit3.putString("allowedFormat", "ts");
                editorEdit3.apply();
            }
            String string6 = sharedPreferences3.getString("timeFormat", AbstractC2237a.f44441E0);
            if (string6 != null && string6.equals(str13)) {
                editorEdit4.putString("timeFormat", AbstractC2237a.f44441E0);
                editorEdit4.apply();
            }
            SharedPreferences.Editor editorEdit5 = this.f44768a.getSharedPreferences("sharedprefremberme", 0).edit();
            editorEdit5.putBoolean("savelogin", true);
            editorEdit5.apply();
            p();
            try {
                Context context = this.f44768a;
                Toast.makeText(context, context.getResources().getString(a7.j.f13210b3), 0).show();
            } catch (WindowManager.BadTokenException e9) {
                e9.printStackTrace();
            }
            if (this.f44768a != null && this.f44769c.equals(string) && this.f44770d.equals(string2) && this.f44771e.equals(str10) && url.equals(str4)) {
                editorEdit2.putString(str3, this.f44769c);
                editorEdit2.apply();
                AbstractC2237a.f44520m = this.f44769c;
                intent = new Intent(this.f44768a, (Class<?>) NewDashboardActivity.class);
            } else {
                String str14 = str3;
                if (this.f44768a == null) {
                    return;
                }
                if (this.f44779m && this.f44773g) {
                    v(userID);
                }
                editorEdit2.putString(str14, this.f44769c);
                editorEdit2.apply();
                AbstractC2237a.f44520m = this.f44769c;
                intent = new Intent(this.f44768a, (Class<?>) NewDashboardActivity.class);
            }
            this.f44768a.startActivity(intent);
            ((Activity) this.f44768a).finish();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public final void z() {
        try {
            this.f44775i.g(this.f44770d, this.f44771e);
        } catch (IOException e9) {
            e9.printStackTrace();
        }
    }
}
